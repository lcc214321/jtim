// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.channel.protocol.protobuf;

public interface O2MDistributeRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:O2MDistributeRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string msgId = 1;</code>
     */
    String getMsgId();

    /**
     * <code>string msgId = 1;</code>
     */
    com.google.protobuf.ByteString
    getMsgIdBytes();

    /**
     * <code>string from = 2;</code>
     */
    String getFrom();

    /**
     * <code>string from = 2;</code>
     */
    com.google.protobuf.ByteString
    getFromBytes();

    /**
     * <code>string fromName = 3;</code>
     */
    String getFromName();

    /**
     * <code>string fromName = 3;</code>
     */
    com.google.protobuf.ByteString
    getFromNameBytes();

    /**
     * <code>string group = 4;</code>
     */
    String getGroup();

    /**
     * <code>string group = 4;</code>
     */
    com.google.protobuf.ByteString
    getGroupBytes();

    /**
     * <code>string content = 5;</code>
     */
    String getContent();

    /**
     * <code>string content = 5;</code>
     */
    com.google.protobuf.ByteString
    getContentBytes();

    /**
     * <code>string msgKey = 6;</code>
     */
    String getMsgKey();

    /**
     * <code>string msgKey = 6;</code>
     */
    com.google.protobuf.ByteString
    getMsgKeyBytes();

    /**
     * <pre>
     * 发送时间
     * </pre>
     *
     * <code>int64 timestamp = 7;</code>
     */
    long getTimestamp();
}
