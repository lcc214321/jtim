// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package cn.bytes.jtim.core.protocol.protobuf;

public final class Auth {
  private Auth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\"<\n\013AuthRequest\022\r\n\005token\030\001 \001" +
      "(\t\022\013\n\003uid\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"e\n\014Au" +
      "thResponse\022\016\n\006status\030\001 \001(\005\022\020\n\010err_code\030\002" +
      " \001(\t\022\017\n\007err_msg\030\003 \001(\t\"\"\n\006Status\022\006\n\002OK\020\000\022" +
      "\020\n\003ERR\020\377\377\377\377\377\377\377\377\377\001\">\n\rLogoutRequest\022\r\n\005to" +
      "ken\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(" +
      "\003\"\020\n\016LogoutResponseB(\n$cn.bytes.jtim.cor" +
      "e.protocol.protobufP\001b\006proto3"
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
        }, assigner);
    internal_static_AuthRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AuthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthRequest_descriptor,
        new java.lang.String[] { "Token", "Uid", "Timestamp", });
    internal_static_AuthResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AuthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthResponse_descriptor,
        new java.lang.String[] { "Status", "ErrCode", "ErrMsg", });
    internal_static_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogoutRequest_descriptor,
        new java.lang.String[] { "Token", "Uid", "Timestamp", });
    internal_static_LogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_LogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogoutResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
