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
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * this module only use for CD
 *
 * @author wangwei CD-Group
 * @date 2020/03/06 5:21 下午
 */
@Service
@Component
public class CodingGrpcManager {
  private ManagedChannel channel;
  private String host;
  private int port;

  @Autowired
  public CodingGrpcManager(CodingGrpcConfig config) {
    String[] hostPort = config.getEndpoint().split("\\:");
    this.host = hostPort[0];
    this.port = Integer.parseInt(hostPort[1]);
  }

  public Channel openChannel() {
    if (this.channel == null) {
      this.channel = ManagedChannelBuilder.forAddress(this.host, this.port).usePlaintext().build();
    }
    return this.channel;
  }
}
