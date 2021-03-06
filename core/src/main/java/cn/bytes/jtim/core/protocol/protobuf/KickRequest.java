// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package cn.bytes.jtim.core.protocol.protobuf;

/**
 * <pre>
 *踢出群
 * </pre>
 *
 * Protobuf type {@code KickRequest}
 */
public  final class KickRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:KickRequest)
    KickRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KickRequest.newBuilder() to construct.
  private KickRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KickRequest() {
    groupNumber_ = "";
    from_ = "";
    target_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KickRequest(
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

            groupNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            from_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            target_ = s;
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
    return cn.bytes.jtim.core.protocol.protobuf.Group.internal_static_KickRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.bytes.jtim.core.protocol.protobuf.Group.internal_static_KickRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.bytes.jtim.core.protocol.protobuf.KickRequest.class, cn.bytes.jtim.core.protocol.protobuf.KickRequest.Builder.class);
  }

  public static final int GROUPNUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupNumber_;
  /**
   * <code>string groupNumber = 1;</code>
   */
  public java.lang.String getGroupNumber() {
    java.lang.Object ref = groupNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string groupNumber = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupNumberBytes() {
    java.lang.Object ref = groupNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_FIELD_NUMBER = 2;
  private volatile java.lang.Object from_;
  /**
   * <code>string from = 2;</code>
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
   * <code>string from = 2;</code>
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

  public static final int TARGET_FIELD_NUMBER = 3;
  private volatile java.lang.Object target_;
  /**
   * <code>string target = 3;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <code>string target = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getGroupNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupNumber_);
    }
    if (!getFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, from_);
    }
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGroupNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupNumber_);
    }
    if (!getFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, from_);
    }
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
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
    if (!(obj instanceof cn.bytes.jtim.core.protocol.protobuf.KickRequest)) {
      return super.equals(obj);
    }
    cn.bytes.jtim.core.protocol.protobuf.KickRequest other = (cn.bytes.jtim.core.protocol.protobuf.KickRequest) obj;

    boolean result = true;
    result = result && getGroupNumber()
        .equals(other.getGroupNumber());
    result = result && getFrom()
        .equals(other.getFrom());
    result = result && getTarget()
        .equals(other.getTarget());
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
    hash = (37 * hash) + GROUPNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getGroupNumber().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest parseFrom(
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
  public static Builder newBuilder(cn.bytes.jtim.core.protocol.protobuf.KickRequest prototype) {
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
   *踢出群
   * </pre>
   *
   * Protobuf type {@code KickRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:KickRequest)
      cn.bytes.jtim.core.protocol.protobuf.KickRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.bytes.jtim.core.protocol.protobuf.Group.internal_static_KickRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.bytes.jtim.core.protocol.protobuf.Group.internal_static_KickRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.bytes.jtim.core.protocol.protobuf.KickRequest.class, cn.bytes.jtim.core.protocol.protobuf.KickRequest.Builder.class);
    }

    // Construct using cn.bytes.jtim.core.protocol.protobuf.KickRequest.newBuilder()
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
      groupNumber_ = "";

      from_ = "";

      target_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.bytes.jtim.core.protocol.protobuf.Group.internal_static_KickRequest_descriptor;
    }

    public cn.bytes.jtim.core.protocol.protobuf.KickRequest getDefaultInstanceForType() {
      return cn.bytes.jtim.core.protocol.protobuf.KickRequest.getDefaultInstance();
    }

    public cn.bytes.jtim.core.protocol.protobuf.KickRequest build() {
      cn.bytes.jtim.core.protocol.protobuf.KickRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.bytes.jtim.core.protocol.protobuf.KickRequest buildPartial() {
      cn.bytes.jtim.core.protocol.protobuf.KickRequest result = new cn.bytes.jtim.core.protocol.protobuf.KickRequest(this);
      result.groupNumber_ = groupNumber_;
      result.from_ = from_;
      result.target_ = target_;
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
      if (other instanceof cn.bytes.jtim.core.protocol.protobuf.KickRequest) {
        return mergeFrom((cn.bytes.jtim.core.protocol.protobuf.KickRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.bytes.jtim.core.protocol.protobuf.KickRequest other) {
      if (other == cn.bytes.jtim.core.protocol.protobuf.KickRequest.getDefaultInstance()) return this;
      if (!other.getGroupNumber().isEmpty()) {
        groupNumber_ = other.groupNumber_;
        onChanged();
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        onChanged();
      }
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
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
      cn.bytes.jtim.core.protocol.protobuf.KickRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.bytes.jtim.core.protocol.protobuf.KickRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object groupNumber_ = "";
    /**
     * <code>string groupNumber = 1;</code>
     */
    public java.lang.String getGroupNumber() {
      java.lang.Object ref = groupNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string groupNumber = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNumberBytes() {
      java.lang.Object ref = groupNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string groupNumber = 1;</code>
     */
    public Builder setGroupNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string groupNumber = 1;</code>
     */
    public Builder clearGroupNumber() {
      
      groupNumber_ = getDefaultInstance().getGroupNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string groupNumber = 1;</code>
     */
    public Builder setGroupNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 2;</code>
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
     * <code>string from = 2;</code>
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
     * <code>string from = 2;</code>
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
     * <code>string from = 2;</code>
     */
    public Builder clearFrom() {
      
      from_ = getDefaultInstance().getFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string from = 2;</code>
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

    private java.lang.Object target_ = "";
    /**
     * <code>string target = 3;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target = 3;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target = 3;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <code>string target = 3;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
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


    // @@protoc_insertion_point(builder_scope:KickRequest)
  }

  // @@protoc_insertion_point(class_scope:KickRequest)
  private static final cn.bytes.jtim.core.protocol.protobuf.KickRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.bytes.jtim.core.protocol.protobuf.KickRequest();
  }

  public static cn.bytes.jtim.core.protocol.protobuf.KickRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KickRequest>
      PARSER = new com.google.protobuf.AbstractParser<KickRequest>() {
    public KickRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KickRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KickRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KickRequest> getParserForType() {
    return PARSER;
  }

  public cn.bytes.jtim.core.protocol.protobuf.KickRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

