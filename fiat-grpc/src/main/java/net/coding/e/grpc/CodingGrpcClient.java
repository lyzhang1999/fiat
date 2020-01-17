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

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.coding.e.proto.UserRoleProto;
import net.coding.e.proto.UserRoleServiceGrpc;

/**
 * this module only use for CD
 *
 * @author wangwei CD-Group
 * @date 2020/01/17 10:37 上午
 */
public class CodingGrpcClient {
  private final ManagedChannel channel;
  private final UserRoleServiceGrpc.UserRoleServiceBlockingStub blockingStub;

  public CodingGrpcClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build());
  }

  public CodingGrpcClient(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = UserRoleServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  public List<UserRoleProto.UserGroupToSpinnaker> GetUserRoles(String gk) {
    try {
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
