// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.protocol.protobuf;

public final class MessageContent {
  private MessageContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\032\nauth.proto\032\016transfer.pr" +
      "oto\032\020distribute.proto\"\367\007\n\007Message\022\031\n\003cmd" +
      "\030\001 \001(\0162\014.Message.Cmd\022#\n\013authRequest\030\002 \001(" +
      "\0132\014.AuthRequestH\000\022%\n\014authResponse\030\003 \001(\0132" +
      "\r.AuthResponseH\000\022\'\n\rlogoutRequest\030\004 \001(\0132" +
      "\016.LogoutRequestH\000\022)\n\016logoutResponse\030\005 \001(" +
      "\0132\017.LogoutResponseH\000\022-\n\020heartbeatRequest" +
      "\030\006 \001(\0132\021.HeartbeatRequestH\000\022/\n\021heartbeat" +
      "Response\030\007 \001(\0132\022.HeartbeatResponseH\000\022)\n\016" +
      "o2oSendRequest\030\010 \001(\0132\017.O2OSendRequestH\000\022" +
      "+\n\017o2oSendResponse\030\t \001(\0132\020.O2OSendRespon" +
      "seH\000\0225\n\024o2oDistributeRequest\030\n \001(\0132\025.O2O" +
      "DistributeRequestH\000\0227\n\025o2oDistributeResp" +
      "onse\030\013 \001(\0132\026.O2ODistributeResponseH\000\022)\n\016" +
      "o2mSendRequest\030\014 \001(\0132\017.O2MSendRequestH\000\022" +
      "+\n\017o2mSendResponse\030\r \001(\0132\020.O2MSendRespon" +
      "seH\000\0225\n\024o2mDistributeRequest\030\016 \001(\0132\025.O2M" +
      "DistributeRequestH\000\0227\n\025o2mDistributeResp" +
      "onse\030\017 \001(\0132\026.O2MDistributeResponseH\000\"\270\002\n" +
      "\003Cmd\022\017\n\013AuthRequest\020\000\022\020\n\014AuthResponse\020\001\022" +
      "\021\n\rLogoutRequest\020\002\022\022\n\016LogoutResponse\020\003\022\024" +
      "\n\020HeartbeatRequest\020\006\022\025\n\021HeartbeatRespons" +
      "e\020\007\022\022\n\016O2OSendRequest\020\010\022\023\n\017O2OSendRespon" +
      "se\020\t\022\030\n\024O2ODistributeRequest\020\n\022\031\n\025O2ODis" +
      "tributeResponse\020\013\022\022\n\016O2MSendRequest\020\014\022\023\n" +
      "\017O2MSendResponse\020\r\022\030\n\024O2MDistributeReque" +
      "st\020\016\022\031\n\025O2MDistributeResponse\020\017B\006\n\004BodyB" +
      "8\n$cn.bytes.jtim.core.protocol.protobufB" +
      "\016MessageContentP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.bytes.jtim.core.protocol.protobuf.Auth.getDescriptor(),
          cn.bytes.jtim.core.protocol.protobuf.Transfer.getDescriptor(),
          cn.bytes.jtim.core.protocol.protobuf.Distribute.getDescriptor(),
        }, assigner);
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "Cmd", "AuthRequest", "AuthResponse", "LogoutRequest", "LogoutResponse", "HeartbeatRequest", "HeartbeatResponse", "O2OSendRequest", "O2OSendResponse", "O2ODistributeRequest", "O2ODistributeResponse", "O2MSendRequest", "O2MSendResponse", "O2MDistributeRequest", "O2MDistributeResponse", "Body", });
    cn.bytes.jtim.core.protocol.protobuf.Auth.getDescriptor();
    cn.bytes.jtim.core.protocol.protobuf.Transfer.getDescriptor();
    cn.bytes.jtim.core.protocol.protobuf.Distribute.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
