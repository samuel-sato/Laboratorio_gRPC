package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: microservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContadorServiceGrpc {

  private ContadorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ContadorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Microservice.MicroserviceReq,
      proto.Microservice.MicroserviceRes> getIncluirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Incluir",
      requestType = proto.Microservice.MicroserviceReq.class,
      responseType = proto.Microservice.MicroserviceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Microservice.MicroserviceReq,
      proto.Microservice.MicroserviceRes> getIncluirMethod() {
    io.grpc.MethodDescriptor<proto.Microservice.MicroserviceReq, proto.Microservice.MicroserviceRes> getIncluirMethod;
    if ((getIncluirMethod = ContadorServiceGrpc.getIncluirMethod) == null) {
      synchronized (ContadorServiceGrpc.class) {
        if ((getIncluirMethod = ContadorServiceGrpc.getIncluirMethod) == null) {
          ContadorServiceGrpc.getIncluirMethod = getIncluirMethod =
              io.grpc.MethodDescriptor.<proto.Microservice.MicroserviceReq, proto.Microservice.MicroserviceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Incluir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Microservice.MicroserviceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Microservice.MicroserviceRes.getDefaultInstance()))
              .setSchemaDescriptor(new ContadorServiceMethodDescriptorSupplier("Incluir"))
              .build();
        }
      }
    }
    return getIncluirMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.Microservice.EmptyRequest,
      proto.Microservice.MicroserviceResConsultar> getConsultarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Consultar",
      requestType = proto.Microservice.EmptyRequest.class,
      responseType = proto.Microservice.MicroserviceResConsultar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Microservice.EmptyRequest,
      proto.Microservice.MicroserviceResConsultar> getConsultarMethod() {
    io.grpc.MethodDescriptor<proto.Microservice.EmptyRequest, proto.Microservice.MicroserviceResConsultar> getConsultarMethod;
    if ((getConsultarMethod = ContadorServiceGrpc.getConsultarMethod) == null) {
      synchronized (ContadorServiceGrpc.class) {
        if ((getConsultarMethod = ContadorServiceGrpc.getConsultarMethod) == null) {
          ContadorServiceGrpc.getConsultarMethod = getConsultarMethod =
              io.grpc.MethodDescriptor.<proto.Microservice.EmptyRequest, proto.Microservice.MicroserviceResConsultar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Consultar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Microservice.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Microservice.MicroserviceResConsultar.getDefaultInstance()))
              .setSchemaDescriptor(new ContadorServiceMethodDescriptorSupplier("Consultar"))
              .build();
        }
      }
    }
    return getConsultarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContadorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContadorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContadorServiceStub>() {
        @java.lang.Override
        public ContadorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContadorServiceStub(channel, callOptions);
        }
      };
    return ContadorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContadorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContadorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContadorServiceBlockingStub>() {
        @java.lang.Override
        public ContadorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContadorServiceBlockingStub(channel, callOptions);
        }
      };
    return ContadorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContadorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContadorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContadorServiceFutureStub>() {
        @java.lang.Override
        public ContadorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContadorServiceFutureStub(channel, callOptions);
        }
      };
    return ContadorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void incluir(proto.Microservice.MicroserviceReq request,
        io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncluirMethod(), responseObserver);
    }

    /**
     */
    default void consultar(proto.Microservice.EmptyRequest request,
        io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceResConsultar> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContadorService.
   */
  public static abstract class ContadorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContadorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContadorService.
   */
  public static final class ContadorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContadorServiceStub> {
    private ContadorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContadorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContadorServiceStub(channel, callOptions);
    }

    /**
     */
    public void incluir(proto.Microservice.MicroserviceReq request,
        io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncluirMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consultar(proto.Microservice.EmptyRequest request,
        io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceResConsultar> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContadorService.
   */
  public static final class ContadorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContadorServiceBlockingStub> {
    private ContadorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContadorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContadorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Microservice.MicroserviceRes incluir(proto.Microservice.MicroserviceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncluirMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.Microservice.MicroserviceResConsultar consultar(proto.Microservice.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContadorService.
   */
  public static final class ContadorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContadorServiceFutureStub> {
    private ContadorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContadorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContadorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Microservice.MicroserviceRes> incluir(
        proto.Microservice.MicroserviceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncluirMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Microservice.MicroserviceResConsultar> consultar(
        proto.Microservice.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCLUIR = 0;
  private static final int METHODID_CONSULTAR = 1;

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
        case METHODID_INCLUIR:
          serviceImpl.incluir((proto.Microservice.MicroserviceReq) request,
              (io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceRes>) responseObserver);
          break;
        case METHODID_CONSULTAR:
          serviceImpl.consultar((proto.Microservice.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<proto.Microservice.MicroserviceResConsultar>) responseObserver);
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
          getIncluirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.Microservice.MicroserviceReq,
              proto.Microservice.MicroserviceRes>(
                service, METHODID_INCLUIR)))
        .addMethod(
          getConsultarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.Microservice.EmptyRequest,
              proto.Microservice.MicroserviceResConsultar>(
                service, METHODID_CONSULTAR)))
        .build();
  }

  private static abstract class ContadorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContadorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Microservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContadorService");
    }
  }

  private static final class ContadorServiceFileDescriptorSupplier
      extends ContadorServiceBaseDescriptorSupplier {
    ContadorServiceFileDescriptorSupplier() {}
  }

  private static final class ContadorServiceMethodDescriptorSupplier
      extends ContadorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContadorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContadorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContadorServiceFileDescriptorSupplier())
              .addMethod(getIncluirMethod())
              .addMethod(getConsultarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
