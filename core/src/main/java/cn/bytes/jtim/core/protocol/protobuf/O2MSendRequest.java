// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer.proto

package cn.bytes.jtim.core.protocol.protobuf;

/**
 * <pre>
 *群发消息
 * </pre>
 *
 * Protobuf type {@code O2MSendRequest}
 */
public  final class O2MSendRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:O2MSendRequest)
    O2MSendRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use O2MSendRequest.newBuilder() to construct.
  private O2MSendRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private O2MSendRequest() {
    from_ = "";
    fromName_ = "";
    group_ = "";
    content_ = "";
    msgKey_ = "";
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private O2MSendRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            from_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fromName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            group_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            msgKey_ = s;
            break;
          }
          case 48: {

            timestamp_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.bytes.jtim.core.protocol.protobuf.Transfer.internal_static_O2MSendRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.bytes.jtim.core.protocol.protobuf.Transfer.internal_static_O2MSendRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.class, cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private volatile java.lang.Object from_;
  /**
   * <code>string from = 1;</code>
   */
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROMNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fromName_;
  /**
   * <code>string fromName = 2;</code>
   */
  public java.lang.String getFromName() {
    java.lang.Object ref = fromName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromName_ = s;
      return s;
    }
  }
  /**
   * <code>string fromName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFromNameBytes() {
    java.lang.Object ref = fromName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_FIELD_NUMBER = 3;
  private volatile java.lang.Object group_;
  /**
   * <pre>
   *群标识
   * </pre>
   *
   * <code>string group = 3;</code>
   */
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *群标识
   * </pre>
   *
   * <code>string group = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 4;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 4;</code>
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 4;</code>
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGKEY_FIELD_NUMBER = 5;
  private volatile java.lang.Object msgKey_;
  /**
   * <code>string msgKey = 5;</code>
   */
  public java.lang.String getMsgKey() {
    java.lang.Object ref = msgKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgKey_ = s;
      return s;
    }
  }
  /**
   * <code>string msgKey = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMsgKeyBytes() {
    java.lang.Object ref = msgKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private long timestamp_;
  /**
   * <pre>
   *发送时间
   * </pre>
   *
   * <code>int64 timestamp = 6;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    if (!getFromNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromName_);
    }
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, group_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
    }
    if (!getMsgKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msgKey_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(6, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    if (!getFromNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromName_);
    }
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, group_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
    }
    if (!getMsgKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msgKey_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, timestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest)) {
      return super.equals(obj);
    }
    cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest other = (cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest) obj;

    boolean result = true;
    result = result && getFrom()
        .equals(other.getFrom());
    result = result && getFromName()
        .equals(other.getFromName());
    result = result && getGroup()
        .equals(other.getGroup());
    result = result && getContent()
        .equals(other.getContent());
    result = result && getMsgKey()
        .equals(other.getMsgKey());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + FROMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFromName().hashCode();
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + MSGKEY_FIELD_NUMBER;
    hash = (53 * hash) + getMsgKey().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *群发消息
   * </pre>
   *
   * Protobuf type {@code O2MSendRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:O2MSendRequest)
      cn.bytes.jtim.core.protocol.protobuf.O2MSendRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.bytes.jtim.core.protocol.protobuf.Transfer.internal_static_O2MSendRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.bytes.jtim.core.protocol.protobuf.Transfer.internal_static_O2MSendRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.class, cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.Builder.class);
    }

    // Construct using cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      from_ = "";

      fromName_ = "";

      group_ = "";

      content_ = "";

      msgKey_ = "";

      timestamp_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.bytes.jtim.core.protocol.protobuf.Transfer.internal_static_O2MSendRequest_descriptor;
    }

    public cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest getDefaultInstanceForType() {
      return cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.getDefaultInstance();
    }

    public cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest build() {
      cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest buildPartial() {
      cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest result = new cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest(this);
      result.from_ = from_;
      result.fromName_ = fromName_;
      result.group_ = group_;
      result.content_ = content_;
      result.msgKey_ = msgKey_;
      result.timestamp_ = timestamp_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest) {
        return mergeFrom((cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest other) {
      if (other == cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        onChanged();
      }
      if (!other.getFromName().isEmpty()) {
        fromName_ = other.fromName_;
        onChanged();
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (!other.getMsgKey().isEmpty()) {
        msgKey_ = other.msgKey_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 1;</code>
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder clearFrom() {
      
      from_ = getDefaultInstance().getFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      from_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fromName_ = "";
    /**
     * <code>string fromName = 2;</code>
     */
    public java.lang.String getFromName() {
      java.lang.Object ref = fromName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fromName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFromNameBytes() {
      java.lang.Object ref = fromName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fromName = 2;</code>
     */
    public Builder setFromName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fromName = 2;</code>
     */
    public Builder clearFromName() {
      
      fromName_ = getDefaultInstance().getFromName();
      onChanged();
      return this;
    }
    /**
     * <code>string fromName = 2;</code>
     */
    public Builder setFromNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object group_ = "";
    /**
     * <pre>
     *群标识
     * </pre>
     *
     * <code>string group = 3;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *群标识
     * </pre>
     *
     * <code>string group = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *群标识
     * </pre>
     *
     * <code>string group = 3;</code>
     */
    public Builder setGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *群标识
     * </pre>
     *
     * <code>string group = 3;</code>
     */
    public Builder clearGroup() {
      
      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *群标识
     * </pre>
     *
     * <code>string group = 3;</code>
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      group_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 4;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 4;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 4;</code>
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 4;</code>
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 4;</code>
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgKey_ = "";
    /**
     * <code>string msgKey = 5;</code>
     */
    public java.lang.String getMsgKey() {
      java.lang.Object ref = msgKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msgKey = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsgKeyBytes() {
      java.lang.Object ref = msgKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgKey = 5;</code>
     */
    public Builder setMsgKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msgKey = 5;</code>
     */
    public Builder clearMsgKey() {
      
      msgKey_ = getDefaultInstance().getMsgKey();
      onChanged();
      return this;
    }
    /**
     * <code>string msgKey = 5;</code>
     */
    public Builder setMsgKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgKey_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     *发送时间
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     *发送时间
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *发送时间
     * </pre>
     *
     * <code>int64 timestamp = 6;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:O2MSendRequest)
  }

  // @@protoc_insertion_point(class_scope:O2MSendRequest)
  private static final cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest();
  }

  public static cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<O2MSendRequest>
      PARSER = new com.google.protobuf.AbstractParser<O2MSendRequest>() {
    public O2MSendRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new O2MSendRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<O2MSendRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<O2MSendRequest> getParserForType() {
    return PARSER;
  }

  public cn.bytes.jtim.core.protocol.protobuf.O2MSendRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

