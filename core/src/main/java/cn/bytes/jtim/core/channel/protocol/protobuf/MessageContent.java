// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.channel.protocol.protobuf;

public final class MessageContent {
    private MessageContent() {
    }

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
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_KichoutRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_KichoutRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_KichoutResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_KichoutResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HeartbeatRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HeartbeatRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HeartbeatResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HeartbeatResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2OSendRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2OSendRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2OSendResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2OSendResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2ODistributeRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2ODistributeRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2ODistributeResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2ODistributeResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2MSendRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2MSendRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2MSendResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2MSendResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2MDistributeRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2MDistributeRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_O2MDistributeResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_O2MDistributeResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\rmessage.proto\"\370\010\n\007Message\022\031\n\003cmd\030\001 \001(\016" +
                        "2\014.Message.Cmd\022#\n\013authRequest\030\002 \001(\0132\014.Au" +
                        "thRequestH\000\022%\n\014authResponse\030\003 \001(\0132\r.Auth" +
                        "ResponseH\000\022\'\n\rlogoutRequest\030\004 \001(\0132\016.Logo" +
                        "utRequestH\000\022)\n\016logoutResponse\030\005 \001(\0132\017.Lo" +
                        "goutResponseH\000\022)\n\016kichoutRequest\030\006 \001(\0132\017" +
                        ".KichoutRequestH\000\022+\n\017kichoutResponse\030\007 \001" +
                        "(\0132\020.KichoutResponseH\000\022-\n\020heartbeatReque" +
                        "st\030\010 \001(\0132\021.HeartbeatRequestH\000\022/\n\021heartbe" +
                        "atResponse\030\t \001(\0132\022.HeartbeatResponseH\000\022)" +
                        "\n\016o2oSendRequest\030\n \001(\0132\017.O2OSendRequestH" +
                        "\000\022+\n\017o2oSendResponse\030\013 \001(\0132\020.O2OSendResp" +
                        "onseH\000\0225\n\024o2oDistributeRequest\030\014 \001(\0132\025.O" +
                        "2ODistributeRequestH\000\0227\n\025o2oDistributeRe" +
                        "sponse\030\r \001(\0132\026.O2ODistributeResponseH\000\022)" +
                        "\n\016o2mSendRequest\030\016 \001(\0132\017.O2MSendRequestH" +
                        "\000\022+\n\017o2mSendResponse\030\017 \001(\0132\020.O2MSendResp" +
                        "onseH\000\0225\n\024o2mDistributeRequest\030\020 \001(\0132\025.O" +
                        "2MDistributeRequestH\000\0227\n\025o2mDistributeRe" +
                        "sponse\030\021 \001(\0132\026.O2MDistributeResponseH\000\"\341" +
                        "\002\n\003Cmd\022\017\n\013AuthRequest\020\000\022\020\n\014AuthResponse\020" +
                        "\001\022\021\n\rLogoutRequest\020\002\022\022\n\016LogoutResponse\020\003" +
                        "\022\022\n\016KichoutRequest\020\004\022\023\n\017KichoutResponse\020" +
                        "\005\022\024\n\020HeartbeatRequest\020\006\022\025\n\021HeartbeatResp" +
                        "onse\020\007\022\022\n\016O2OSendRequest\020\010\022\023\n\017O2OSendRes" +
                        "ponse\020\t\022\030\n\024O2ODistributeRequest\020\n\022\031\n\025O2O" +
                        "DistributeResponse\020\013\022\022\n\016O2MSendRequest\020\014" +
                        "\022\023\n\017O2MSendResponse\020\r\022\030\n\024O2MDistributeRe" +
                        "quest\020\016\022\031\n\025O2MDistributeResponse\020\017B\006\n\004Bo" +
                        "dy\"<\n\013AuthRequest\022\r\n\005token\030\001 \001(\t\022\013\n\003uid\030" +
                        "\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"e\n\014AuthResponse" +
                        "\022\016\n\006status\030\001 \001(\005\022\020\n\010err_code\030\002 \001(\t\022\017\n\007er" +
                        "r_msg\030\003 \001(\t\"\"\n\006Status\022\006\n\002OK\020\000\022\020\n\003ERR\020\377\377\377" +
                        "\377\377\377\377\377\377\001\">\n\rLogoutRequest\022\r\n\005token\030\001 \001(\t\022" +
                        "\013\n\003uid\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"\020\n\016Logou" +
                        "tResponse\"=\n\016KichoutRequest\022\017\n\007reasion\030\001" +
                        " \001(\005\"\032\n\007Reasion\022\017\n\013OTHER_LOGIN\020\000\"\021\n\017Kich" +
                        "outResponse\" \n\020HeartbeatRequest\022\014\n\004ping\030" +
                        "\001 \001(\014\"!\n\021HeartbeatResponse\022\014\n\004pong\030\001 \001(\014" +
                        "\"p\n\016O2OSendRequest\022\016\n\006msgKey\030\001 \001(\t\022\014\n\004fr" +
                        "om\030\002 \001(\t\022\020\n\010fromName\030\003 \001(\t\022\n\n\002to\030\004 \001(\t\022\017" +
                        "\n\007content\030\005 \001(\t\022\021\n\ttimestamp\030\006 \001(\003\"C\n\017O2" +
                        "OSendResponse\022\016\n\006msgKey\030\001 \001(\t\022\r\n\005msgId\030\002" +
                        " \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"\205\001\n\024O2ODistribut" +
                        "eRequest\022\r\n\005msgId\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\020\n" +
                        "\010fromName\030\003 \001(\t\022\n\n\002to\030\004 \001(\t\022\017\n\007content\030\005" +
                        " \001(\t\022\016\n\006msgKey\030\006 \001(\t\022\021\n\ttimestamp\030\007 \001(\003\"" +
                        "6\n\025O2ODistributeResponse\022\r\n\005msgId\030\001 \001(\t\022" +
                        "\016\n\006msgKey\030\002 \001(\t\"s\n\016O2MSendRequest\022\014\n\004fro" +
                        "m\030\001 \001(\t\022\020\n\010fromName\030\002 \001(\t\022\r\n\005group\030\003 \001(\t" +
                        "\022\017\n\007content\030\004 \001(\t\022\016\n\006msgKey\030\005 \001(\t\022\021\n\ttim" +
                        "estamp\030\006 \001(\003\"C\n\017O2MSendResponse\022\r\n\005msgId" +
                        "\030\001 \001(\t\022\016\n\006msgKey\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(" +
                        "\003\"\210\001\n\024O2MDistributeRequest\022\r\n\005msgId\030\001 \001(" +
                        "\t\022\014\n\004from\030\002 \001(\t\022\020\n\010fromName\030\003 \001(\t\022\r\n\005gro" +
                        "up\030\004 \001(\t\022\017\n\007content\030\005 \001(\t\022\016\n\006msgKey\030\006 \001(" +
                        "\t\022\021\n\ttimestamp\030\007 \001(\003\"6\n\025O2MDistributeRes" +
                        "ponse\022\r\n\005msgId\030\001 \001(\t\022\016\n\006msgKey\030\002 \001(\tB8\n$" +
                        "cn.bytes.jtim.core.protocol.protobufB\016Me" +
                        "ssageContentP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_Message_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_Message_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Message_descriptor,
                new String[]{"Cmd", "AuthRequest", "AuthResponse", "LogoutRequest", "LogoutResponse", "KichoutRequest", "KichoutResponse", "HeartbeatRequest", "HeartbeatResponse", "O2OSendRequest", "O2OSendResponse", "O2ODistributeRequest", "O2ODistributeResponse", "O2MSendRequest", "O2MSendResponse", "O2MDistributeRequest", "O2MDistributeResponse", "Body",});
        internal_static_AuthRequest_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_AuthRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AuthRequest_descriptor,
                new String[]{"Token", "Uid", "Timestamp",});
        internal_static_AuthResponse_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_AuthResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AuthResponse_descriptor,
                new String[]{"Status", "ErrCode", "ErrMsg",});
        internal_static_LogoutRequest_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_LogoutRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_LogoutRequest_descriptor,
                new String[]{"Token", "Uid", "Timestamp",});
        internal_static_LogoutResponse_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_LogoutResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_LogoutResponse_descriptor,
                new String[]{});
        internal_static_KichoutRequest_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_KichoutRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_KichoutRequest_descriptor,
                new String[]{"Reasion",});
        internal_static_KichoutResponse_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_KichoutResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_KichoutResponse_descriptor,
                new String[]{});
        internal_static_HeartbeatRequest_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_HeartbeatRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HeartbeatRequest_descriptor,
                new String[]{"Ping",});
        internal_static_HeartbeatResponse_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_HeartbeatResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HeartbeatResponse_descriptor,
                new String[]{"Pong",});
        internal_static_O2OSendRequest_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_O2OSendRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2OSendRequest_descriptor,
                new String[]{"MsgKey", "From", "FromName", "To", "Content", "Timestamp",});
        internal_static_O2OSendResponse_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_O2OSendResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2OSendResponse_descriptor,
                new String[]{"MsgKey", "MsgId", "Timestamp",});
        internal_static_O2ODistributeRequest_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_O2ODistributeRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2ODistributeRequest_descriptor,
                new String[]{"MsgId", "From", "FromName", "To", "Content", "MsgKey", "Timestamp",});
        internal_static_O2ODistributeResponse_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_O2ODistributeResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2ODistributeResponse_descriptor,
                new String[]{"MsgId", "MsgKey",});
        internal_static_O2MSendRequest_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_O2MSendRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2MSendRequest_descriptor,
                new String[]{"From", "FromName", "Group", "Content", "MsgKey", "Timestamp",});
        internal_static_O2MSendResponse_descriptor =
                getDescriptor().getMessageTypes().get(14);
        internal_static_O2MSendResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2MSendResponse_descriptor,
                new String[]{"MsgId", "MsgKey", "Timestamp",});
        internal_static_O2MDistributeRequest_descriptor =
                getDescriptor().getMessageTypes().get(15);
        internal_static_O2MDistributeRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2MDistributeRequest_descriptor,
                new String[]{"MsgId", "From", "FromName", "Group", "Content", "MsgKey", "Timestamp",});
        internal_static_O2MDistributeResponse_descriptor =
                getDescriptor().getMessageTypes().get(16);
        internal_static_O2MDistributeResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_O2MDistributeResponse_descriptor,
                new String[]{"MsgId", "MsgKey",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}