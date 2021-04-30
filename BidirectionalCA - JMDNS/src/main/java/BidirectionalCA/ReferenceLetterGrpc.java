package BidirectionalCA;

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
 * <pre>
 * here is the name of the service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Bidi.proto")
public final class ReferenceLetterGrpc {

  private ReferenceLetterGrpc() {}

  public static final String SERVICE_NAME = "ReferenceLetter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BidirectionalCA.ReferenceLetterRequest,
      BidirectionalCA.ReferenceLetterResponse> getGetReferenceLetterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReferenceLetter",
      requestType = BidirectionalCA.ReferenceLetterRequest.class,
      responseType = BidirectionalCA.ReferenceLetterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<BidirectionalCA.ReferenceLetterRequest,
      BidirectionalCA.ReferenceLetterResponse> getGetReferenceLetterMethod() {
    io.grpc.MethodDescriptor<BidirectionalCA.ReferenceLetterRequest, BidirectionalCA.ReferenceLetterResponse> getGetReferenceLetterMethod;
    if ((getGetReferenceLetterMethod = ReferenceLetterGrpc.getGetReferenceLetterMethod) == null) {
      synchronized (ReferenceLetterGrpc.class) {
        if ((getGetReferenceLetterMethod = ReferenceLetterGrpc.getGetReferenceLetterMethod) == null) {
          ReferenceLetterGrpc.getGetReferenceLetterMethod = getGetReferenceLetterMethod = 
              io.grpc.MethodDescriptor.<BidirectionalCA.ReferenceLetterRequest, BidirectionalCA.ReferenceLetterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ReferenceLetter", "GetReferenceLetter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BidirectionalCA.ReferenceLetterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BidirectionalCA.ReferenceLetterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReferenceLetterMethodDescriptorSupplier("GetReferenceLetter"))
                  .build();
          }
        }
     }
     return getGetReferenceLetterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReferenceLetterStub newStub(io.grpc.Channel channel) {
    return new ReferenceLetterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceLetterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReferenceLetterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReferenceLetterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReferenceLetterFutureStub(channel);
  }

  /**
   * <pre>
   * here is the name of the service
   * </pre>
   */
  public static abstract class ReferenceLetterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * this is the third service of the project
     * </pre>
     */
    public io.grpc.stub.StreamObserver<BidirectionalCA.ReferenceLetterRequest> getReferenceLetter(
        io.grpc.stub.StreamObserver<BidirectionalCA.ReferenceLetterResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetReferenceLetterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReferenceLetterMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                BidirectionalCA.ReferenceLetterRequest,
                BidirectionalCA.ReferenceLetterResponse>(
                  this, METHODID_GET_REFERENCE_LETTER)))
          .build();
    }
  }

  /**
   * <pre>
   * here is the name of the service
   * </pre>
   */
  public static final class ReferenceLetterStub extends io.grpc.stub.AbstractStub<ReferenceLetterStub> {
    private ReferenceLetterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceLetterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceLetterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceLetterStub(channel, callOptions);
    }

    /**
     * <pre>
     * this is the third service of the project
     * </pre>
     */
    public io.grpc.stub.StreamObserver<BidirectionalCA.ReferenceLetterRequest> getReferenceLetter(
        io.grpc.stub.StreamObserver<BidirectionalCA.ReferenceLetterResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetReferenceLetterMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * here is the name of the service
   * </pre>
   */
  public static final class ReferenceLetterBlockingStub extends io.grpc.stub.AbstractStub<ReferenceLetterBlockingStub> {
    private ReferenceLetterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceLetterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceLetterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceLetterBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * here is the name of the service
   * </pre>
   */
  public static final class ReferenceLetterFutureStub extends io.grpc.stub.AbstractStub<ReferenceLetterFutureStub> {
    private ReferenceLetterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceLetterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceLetterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceLetterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_REFERENCE_LETTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReferenceLetterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReferenceLetterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REFERENCE_LETTER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getReferenceLetter(
              (io.grpc.stub.StreamObserver<BidirectionalCA.ReferenceLetterResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReferenceLetterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReferenceLetterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BidirectionalCA.Bidi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReferenceLetter");
    }
  }

  private static final class ReferenceLetterFileDescriptorSupplier
      extends ReferenceLetterBaseDescriptorSupplier {
    ReferenceLetterFileDescriptorSupplier() {}
  }

  private static final class ReferenceLetterMethodDescriptorSupplier
      extends ReferenceLetterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReferenceLetterMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReferenceLetterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReferenceLetterFileDescriptorSupplier())
              .addMethod(getGetReferenceLetterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
