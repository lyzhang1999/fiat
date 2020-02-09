package net.coding.e.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: UserRole.proto")
public final class UserRoleServiceGrpc {

  private UserRoleServiceGrpc() {}

  public static final String SERVICE_NAME = "app.grpc.enterprise.UserRoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
      net.coding.e.proto.UserRoleProto.UserRoleResponse> getGetRoleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRoleById",
      requestType = net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest.class,
      responseType = net.coding.e.proto.UserRoleProto.UserRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
      net.coding.e.proto.UserRoleProto.UserRoleResponse> getGetRoleByIdMethod() {
    io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest, net.coding.e.proto.UserRoleProto.UserRoleResponse> getGetRoleByIdMethod;
    if ((getGetRoleByIdMethod = UserRoleServiceGrpc.getGetRoleByIdMethod) == null) {
      synchronized (UserRoleServiceGrpc.class) {
        if ((getGetRoleByIdMethod = UserRoleServiceGrpc.getGetRoleByIdMethod) == null) {
          UserRoleServiceGrpc.getGetRoleByIdMethod = getGetRoleByIdMethod =
              io.grpc.MethodDescriptor.<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest, net.coding.e.proto.UserRoleProto.UserRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRoleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.UserRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserRoleServiceMethodDescriptorSupplier("getRoleById"))
              .build();
        }
      }
    }
    return getGetRoleByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
      net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserGroupToSpinnakerRole",
      requestType = net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest.class,
      responseType = net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
      net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleMethod() {
    io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest, net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleMethod;
    if ((getGetUserGroupToSpinnakerRoleMethod = UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleMethod) == null) {
      synchronized (UserRoleServiceGrpc.class) {
        if ((getGetUserGroupToSpinnakerRoleMethod = UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleMethod) == null) {
          UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleMethod = getGetUserGroupToSpinnakerRoleMethod =
              io.grpc.MethodDescriptor.<net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest, net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserGroupToSpinnakerRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserRoleServiceMethodDescriptorSupplier("getUserGroupToSpinnakerRole"))
              .build();
        }
      }
    }
    return getGetUserGroupToSpinnakerRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest,
      net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleByGKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserGroupToSpinnakerRoleByGK",
      requestType = net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest.class,
      responseType = net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest,
      net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleByGKMethod() {
    io.grpc.MethodDescriptor<net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest, net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getGetUserGroupToSpinnakerRoleByGKMethod;
    if ((getGetUserGroupToSpinnakerRoleByGKMethod = UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleByGKMethod) == null) {
      synchronized (UserRoleServiceGrpc.class) {
        if ((getGetUserGroupToSpinnakerRoleByGKMethod = UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleByGKMethod) == null) {
          UserRoleServiceGrpc.getGetUserGroupToSpinnakerRoleByGKMethod = getGetUserGroupToSpinnakerRoleByGKMethod =
              io.grpc.MethodDescriptor.<net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest, net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserGroupToSpinnakerRoleByGK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserRoleServiceMethodDescriptorSupplier("getUserGroupToSpinnakerRoleByGK"))
              .build();
        }
      }
    }
    return getGetUserGroupToSpinnakerRoleByGKMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserRoleServiceStub newStub(io.grpc.Channel channel) {
    return new UserRoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserRoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserRoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserRoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserRoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserRoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoleById(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleByIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserGroupToSpinnakerRole(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserGroupToSpinnakerRoleMethod(), responseObserver);
    }

    /**
     */
    public void getUserGroupToSpinnakerRoleByGK(net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserGroupToSpinnakerRoleByGKMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoleByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
                net.coding.e.proto.UserRoleProto.UserRoleResponse>(
                  this, METHODID_GET_ROLE_BY_ID)))
          .addMethod(
            getGetUserGroupToSpinnakerRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest,
                net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>(
                  this, METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE)))
          .addMethod(
            getGetUserGroupToSpinnakerRoleByGKMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest,
                net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>(
                  this, METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE_BY_GK)))
          .build();
    }
  }

  /**
   */
  public static final class UserRoleServiceStub extends io.grpc.stub.AbstractStub<UserRoleServiceStub> {
    private UserRoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRoleById(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserGroupToSpinnakerRole(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserGroupToSpinnakerRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserGroupToSpinnakerRoleByGK(net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest request,
        io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserGroupToSpinnakerRoleByGKMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserRoleServiceBlockingStub extends io.grpc.stub.AbstractStub<UserRoleServiceBlockingStub> {
    private UserRoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.coding.e.proto.UserRoleProto.UserRoleResponse getRoleById(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse getUserGroupToSpinnakerRole(net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserGroupToSpinnakerRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse getUserGroupToSpinnakerRoleByGK(net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserGroupToSpinnakerRoleByGKMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserRoleServiceFutureStub extends io.grpc.stub.AbstractStub<UserRoleServiceFutureStub> {
    private UserRoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.coding.e.proto.UserRoleProto.UserRoleResponse> getRoleById(
        net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getUserGroupToSpinnakerRole(
        net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserGroupToSpinnakerRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse> getUserGroupToSpinnakerRoleByGK(
        net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserGroupToSpinnakerRoleByGKMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROLE_BY_ID = 0;
  private static final int METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE = 1;
  private static final int METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE_BY_GK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserRoleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserRoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROLE_BY_ID:
          serviceImpl.getRoleById((net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest) request,
              (io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserRoleResponse>) responseObserver);
          break;
        case METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE:
          serviceImpl.getUserGroupToSpinnakerRole((net.coding.e.proto.UserRoleProto.GetUserRoleByIdRequest) request,
              (io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>) responseObserver);
          break;
        case METHODID_GET_USER_GROUP_TO_SPINNAKER_ROLE_BY_GK:
          serviceImpl.getUserGroupToSpinnakerRoleByGK((net.coding.e.proto.UserRoleProto.GetUserRoleByGKRequest) request,
              (io.grpc.stub.StreamObserver<net.coding.e.proto.UserRoleProto.UserGroupToSpinnakerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserRoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserRoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.coding.e.proto.UserRoleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserRoleService");
    }
  }

  private static final class UserRoleServiceFileDescriptorSupplier
      extends UserRoleServiceBaseDescriptorSupplier {
    UserRoleServiceFileDescriptorSupplier() {}
  }

  private static final class UserRoleServiceMethodDescriptorSupplier
      extends UserRoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserRoleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserRoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserRoleServiceFileDescriptorSupplier())
              .addMethod(getGetRoleByIdMethod())
              .addMethod(getGetUserGroupToSpinnakerRoleMethod())
              .addMethod(getGetUserGroupToSpinnakerRoleByGKMethod())
              .build();
        }
      }
    }
    return result;
  }
}
