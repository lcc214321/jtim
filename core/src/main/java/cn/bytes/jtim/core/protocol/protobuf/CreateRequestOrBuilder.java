// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package cn.bytes.jtim.core.protocol.protobuf;

public interface CreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>string describe = 2;</code>
   */
  java.lang.String getDescribe();
  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>string describe = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescribeBytes();

  /**
   * <pre>
   *公告
   * </pre>
   *
   * <code>string notice = 3;</code>
   */
  java.lang.String getNotice();
  /**
   * <pre>
   *公告
   * </pre>
   *
   * <code>string notice = 3;</code>
   */
  com.google.protobuf.ByteString
      getNoticeBytes();

  /**
   * <pre>
   *群最大人数
   * </pre>
   *
   * <code>int32 maxMember = 4;</code>
   */
  int getMaxMember();

  /**
   * <pre>
   *最大管理人数
   * </pre>
   *
   * <code>int32 maxManage = 5;</code>
   */
  int getMaxManage();
}
