// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.channel.protocol.protobuf;

/**
 * <pre>
 * 消息分发返回结果
 * </pre>
 * <p>
 * Protobuf type {@code O2ODistributeResponse}
 */
public final class O2ODistributeResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:O2ODistributeResponse)
        O2ODistributeResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use O2ODistributeResponse.newBuilder() to construct.
    private O2ODistributeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private O2ODistributeResponse() {
        msgId_ = "";
        msgKey_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private O2ODistributeResponse(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
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
                        String s = input.readStringRequireUtf8();

                        msgId_ = s;
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        msgKey_ = s;
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
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_O2ODistributeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_O2ODistributeResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.class, cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.Builder.class);
    }

    public static final int MSGID_FIELD_NUMBER = 1;
    private volatile Object msgId_;

    /**
     * <code>string msgId = 1;</code>
     */
    public String getMsgId() {
        Object ref = msgId_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            msgId_ = s;
            return s;
        }
    }

    /**
     * <code>string msgId = 1;</code>
     */
    public com.google.protobuf.ByteString
    getMsgIdBytes() {
        Object ref = msgId_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            msgId_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int MSGKEY_FIELD_NUMBER = 2;
    private volatile Object msgKey_;

    /**
     * <code>string msgKey = 2;</code>
     */
    public String getMsgKey() {
        Object ref = msgKey_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            msgKey_ = s;
            return s;
        }
    }

    /**
     * <code>string msgKey = 2;</code>
     */
    public com.google.protobuf.ByteString
    getMsgKeyBytes() {
        Object ref = msgKey_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            msgKey_ = b;
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
        if (!getMsgIdBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msgId_);
        }
        if (!getMsgKeyBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msgKey_);
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getMsgIdBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msgId_);
        }
        if (!getMsgKeyBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msgKey_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse)) {
            return super.equals(obj);
        }
        cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse other = (cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse) obj;

        boolean result = true;
        result = result && getMsgId()
                .equals(other.getMsgId());
        result = result && getMsgKey()
                .equals(other.getMsgKey());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + MSGID_FIELD_NUMBER;
        hash = (53 * hash) + getMsgId().hashCode();
        hash = (37 * hash) + MSGKEY_FIELD_NUMBER;
        hash = (53 * hash) + getMsgKey().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * 消息分发返回结果
     * </pre>
     * <p>
     * Protobuf type {@code O2ODistributeResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:O2ODistributeResponse)
            cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_O2ODistributeResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_O2ODistributeResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.class, cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.Builder.class);
        }

        // Construct using cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.newBuilder()
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
            msgId_ = "";

            msgKey_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_O2ODistributeResponse_descriptor;
        }

        public cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse getDefaultInstanceForType() {
            return cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.getDefaultInstance();
        }

        public cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse build() {
            cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse buildPartial() {
            cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse result = new cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse(this);
            result.msgId_ = msgId_;
            result.msgKey_ = msgKey_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
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
                int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse) {
                return mergeFrom((cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse other) {
            if (other == cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse.getDefaultInstance()) return this;
            if (!other.getMsgId().isEmpty()) {
                msgId_ = other.msgId_;
                onChanged();
            }
            if (!other.getMsgKey().isEmpty()) {
                msgKey_ = other.msgKey_;
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
            cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object msgId_ = "";

        /**
         * <code>string msgId = 1;</code>
         */
        public String getMsgId() {
            Object ref = msgId_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                msgId_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string msgId = 1;</code>
         */
        public com.google.protobuf.ByteString
        getMsgIdBytes() {
            Object ref = msgId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                msgId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string msgId = 1;</code>
         */
        public Builder setMsgId(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            msgId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string msgId = 1;</code>
         */
        public Builder clearMsgId() {

            msgId_ = getDefaultInstance().getMsgId();
            onChanged();
            return this;
        }

        /**
         * <code>string msgId = 1;</code>
         */
        public Builder setMsgIdBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            msgId_ = value;
            onChanged();
            return this;
        }

        private Object msgKey_ = "";

        /**
         * <code>string msgKey = 2;</code>
         */
        public String getMsgKey() {
            Object ref = msgKey_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                msgKey_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string msgKey = 2;</code>
         */
        public com.google.protobuf.ByteString
        getMsgKeyBytes() {
            Object ref = msgKey_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                msgKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string msgKey = 2;</code>
         */
        public Builder setMsgKey(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            msgKey_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string msgKey = 2;</code>
         */
        public Builder clearMsgKey() {

            msgKey_ = getDefaultInstance().getMsgKey();
            onChanged();
            return this;
        }

        /**
         * <code>string msgKey = 2;</code>
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

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:O2ODistributeResponse)
    }

    // @@protoc_insertion_point(class_scope:O2ODistributeResponse)
    private static final cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse();
    }

    public static cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<O2ODistributeResponse>
            PARSER = new com.google.protobuf.AbstractParser<O2ODistributeResponse>() {
        public O2ODistributeResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new O2ODistributeResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<O2ODistributeResponse> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<O2ODistributeResponse> getParserForType() {
        return PARSER;
    }

    public cn.bytes.jtim.core.protocol.protobuf.O2ODistributeResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

