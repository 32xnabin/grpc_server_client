package com.csv.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: csv.proto")
public final class CSVGrpc {

  private CSVGrpc() {}

  public static final String SERVICE_NAME = "CSV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.csv.grpc.Csv.Empty,
      com.csv.grpc.Csv.ItemResponse> getGetCSVStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCSVStream",
      requestType = com.csv.grpc.Csv.Empty.class,
      responseType = com.csv.grpc.Csv.ItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csv.grpc.Csv.Empty,
      com.csv.grpc.Csv.ItemResponse> getGetCSVStreamMethod() {
    io.grpc.MethodDescriptor<com.csv.grpc.Csv.Empty, com.csv.grpc.Csv.ItemResponse> getGetCSVStreamMethod;
    if ((getGetCSVStreamMethod = CSVGrpc.getGetCSVStreamMethod) == null) {
      synchronized (CSVGrpc.class) {
        if ((getGetCSVStreamMethod = CSVGrpc.getGetCSVStreamMethod) == null) {
          CSVGrpc.getGetCSVStreamMethod = getGetCSVStreamMethod = 
              io.grpc.MethodDescriptor.<com.csv.grpc.Csv.Empty, com.csv.grpc.Csv.ItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CSV", "GetCSVStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csv.grpc.Csv.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csv.grpc.Csv.ItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CSVMethodDescriptorSupplier("GetCSVStream"))
                  .build();
          }
        }
     }
     return getGetCSVStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CSVStub newStub(io.grpc.Channel channel) {
    return new CSVStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CSVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CSVBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CSVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CSVFutureStub(channel);
  }

  /**
   */
  public static abstract class CSVImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCSVStream(com.csv.grpc.Csv.Empty request,
        io.grpc.stub.StreamObserver<com.csv.grpc.Csv.ItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCSVStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCSVStreamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csv.grpc.Csv.Empty,
                com.csv.grpc.Csv.ItemResponse>(
                  this, METHODID_GET_CSVSTREAM)))
          .build();
    }
  }

  /**
   */
  public static final class CSVStub extends io.grpc.stub.AbstractStub<CSVStub> {
    private CSVStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CSVStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CSVStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CSVStub(channel, callOptions);
    }

    /**
     */
    public void getCSVStream(com.csv.grpc.Csv.Empty request,
        io.grpc.stub.StreamObserver<com.csv.grpc.Csv.ItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCSVStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CSVBlockingStub extends io.grpc.stub.AbstractStub<CSVBlockingStub> {
    private CSVBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CSVBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CSVBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CSVBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.csv.grpc.Csv.ItemResponse getCSVStream(com.csv.grpc.Csv.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCSVStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CSVFutureStub extends io.grpc.stub.AbstractStub<CSVFutureStub> {
    private CSVFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CSVFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CSVFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CSVFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csv.grpc.Csv.ItemResponse> getCSVStream(
        com.csv.grpc.Csv.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCSVStreamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CSVSTREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CSVImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CSVImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CSVSTREAM:
          serviceImpl.getCSVStream((com.csv.grpc.Csv.Empty) request,
              (io.grpc.stub.StreamObserver<com.csv.grpc.Csv.ItemResponse>) responseObserver);
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

  private static abstract class CSVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CSVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.csv.grpc.Csv.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CSV");
    }
  }

  private static final class CSVFileDescriptorSupplier
      extends CSVBaseDescriptorSupplier {
    CSVFileDescriptorSupplier() {}
  }

  private static final class CSVMethodDescriptorSupplier
      extends CSVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CSVMethodDescriptorSupplier(String methodName) {
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
      synchronized (CSVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CSVFileDescriptorSupplier())
              .addMethod(getGetCSVStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
