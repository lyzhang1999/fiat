/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.coding.e.grpc;

import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import java.util.List;
import net.coding.e.proto.UserRoleProto;
import net.coding.e.proto.UserRoleServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * this module only use for CD
 *
 * @author wangwei CD-Group
 * @date 2020/01/17 10:37 上午
 */
@Service
@Component
public class CodingGrpcClient {
  @Autowired private CodingGrpcManager codingGrpcManager;

  public List<UserRoleProto.UserGroupToSpinnaker> GetUserRoles(String gk) {
    try {
      Channel channel = codingGrpcManager.openChannel();
      UserRoleServiceGrpc.UserRoleServiceBlockingStub blockingStub =
          UserRoleServiceGrpc.newBlockingStub(channel);
      UserRoleProto.GetUserRoleByGKRequest request =
          UserRoleProto.GetUserRoleByGKRequest.newBuilder().setUserGk(gk).build();
      UserRoleProto.UserGroupToSpinnakerResponse response =
          blockingStub.getUserGroupToSpinnakerRoleByGK(request);
      return response.getDataList();
    } catch (StatusRuntimeException e) {
      e.printStackTrace();
    }
    return null;
  }
}
