package grpc.greetings;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: src/main/resources/proto/greetings.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SayWelcomeServiceGrpc {

  private SayWelcomeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SayWelcomeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.greetings.Greetings.User,
      grpc.greetings.Greetings.WelcomeMessage> getSayHelloToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloToUser",
      requestType = grpc.greetings.Greetings.User.class,
      responseType = grpc.greetings.Greetings.WelcomeMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.greetings.Greetings.User,
      grpc.greetings.Greetings.WelcomeMessage> getSayHelloToUserMethod() {
    io.grpc.MethodDescriptor<grpc.greetings.Greetings.User, grpc.greetings.Greetings.WelcomeMessage> getSayHelloToUserMethod;
    if ((getSayHelloToUserMethod = SayWelcomeServiceGrpc.getSayHelloToUserMethod) == null) {
      synchronized (SayWelcomeServiceGrpc.class) {
        if ((getSayHelloToUserMethod = SayWelcomeServiceGrpc.getSayHelloToUserMethod) == null) {
          SayWelcomeServiceGrpc.getSayHelloToUserMethod = getSayHelloToUserMethod =
              io.grpc.MethodDescriptor.<grpc.greetings.Greetings.User, grpc.greetings.Greetings.WelcomeMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.WelcomeMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SayWelcomeServiceMethodDescriptorSupplier("SayHelloToUser"))
              .build();
        }
      }
    }
    return getSayHelloToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty,
      grpc.greetings.Greetings.WelcomeMessage> getSayHelloWithoutNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloWithoutName",
      requestType = grpc.greetings.Greetings.Empty.class,
      responseType = grpc.greetings.Greetings.WelcomeMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty,
      grpc.greetings.Greetings.WelcomeMessage> getSayHelloWithoutNameMethod() {
    io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty, grpc.greetings.Greetings.WelcomeMessage> getSayHelloWithoutNameMethod;
    if ((getSayHelloWithoutNameMethod = SayWelcomeServiceGrpc.getSayHelloWithoutNameMethod) == null) {
      synchronized (SayWelcomeServiceGrpc.class) {
        if ((getSayHelloWithoutNameMethod = SayWelcomeServiceGrpc.getSayHelloWithoutNameMethod) == null) {
          SayWelcomeServiceGrpc.getSayHelloWithoutNameMethod = getSayHelloWithoutNameMethod =
              io.grpc.MethodDescriptor.<grpc.greetings.Greetings.Empty, grpc.greetings.Greetings.WelcomeMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloWithoutName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.WelcomeMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SayWelcomeServiceMethodDescriptorSupplier("SayHelloWithoutName"))
              .build();
        }
      }
    }
    return getSayHelloWithoutNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SayWelcomeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceStub>() {
        @java.lang.Override
        public SayWelcomeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SayWelcomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceBlockingStub>() {
        @java.lang.Override
        public SayWelcomeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceBlockingStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SayWelcomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceFutureStub>() {
        @java.lang.Override
        public SayWelcomeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceFutureStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHelloToUser(grpc.greetings.Greetings.User request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloToUserMethod(), responseObserver);
    }

    /**
     */
    default void sayHelloWithoutName(grpc.greetings.Greetings.Empty request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloWithoutNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SayWelcomeService.
   */
  public static abstract class SayWelcomeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SayWelcomeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SayWelcomeServiceStub> {
    private SayWelcomeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHelloToUser(grpc.greetings.Greetings.User request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloWithoutName(grpc.greetings.Greetings.Empty request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloWithoutNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SayWelcomeServiceBlockingStub> {
    private SayWelcomeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.greetings.Greetings.WelcomeMessage sayHelloToUser(grpc.greetings.Greetings.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloToUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.greetings.Greetings.WelcomeMessage sayHelloWithoutName(grpc.greetings.Greetings.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloWithoutNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SayWelcomeServiceFutureStub> {
    private SayWelcomeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.greetings.Greetings.WelcomeMessage> sayHelloToUser(
        grpc.greetings.Greetings.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloToUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.greetings.Greetings.WelcomeMessage> sayHelloWithoutName(
        grpc.greetings.Greetings.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloWithoutNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO_TO_USER = 0;
  private static final int METHODID_SAY_HELLO_WITHOUT_NAME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_TO_USER:
          serviceImpl.sayHelloToUser((grpc.greetings.Greetings.User) request,
              (io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage>) responseObserver);
          break;
        case METHODID_SAY_HELLO_WITHOUT_NAME:
          serviceImpl.sayHelloWithoutName((grpc.greetings.Greetings.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.greetings.Greetings.WelcomeMessage>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloToUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.greetings.Greetings.User,
              grpc.greetings.Greetings.WelcomeMessage>(
                service, METHODID_SAY_HELLO_TO_USER)))
        .addMethod(
          getSayHelloWithoutNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.greetings.Greetings.Empty,
              grpc.greetings.Greetings.WelcomeMessage>(
                service, METHODID_SAY_HELLO_WITHOUT_NAME)))
        .build();
  }

  private static abstract class SayWelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SayWelcomeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.greetings.Greetings.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SayWelcomeService");
    }
  }

  private static final class SayWelcomeServiceFileDescriptorSupplier
      extends SayWelcomeServiceBaseDescriptorSupplier {
    SayWelcomeServiceFileDescriptorSupplier() {}
  }

  private static final class SayWelcomeServiceMethodDescriptorSupplier
      extends SayWelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SayWelcomeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SayWelcomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SayWelcomeServiceFileDescriptorSupplier())
              .addMethod(getSayHelloToUserMethod())
              .addMethod(getSayHelloWithoutNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
