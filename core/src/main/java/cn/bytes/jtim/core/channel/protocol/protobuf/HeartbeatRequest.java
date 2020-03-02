// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.channel.protocol.protobuf;

/**
 * Protobuf type {@code HeartbeatRequest}
 */
public final class HeartbeatRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:HeartbeatRequest)
        HeartbeatRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use HeartbeatRequest.newBuilder() to construct.
    private HeartbeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private HeartbeatRequest() {
        ping_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private HeartbeatRequest(
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

                        ping_ = input.readBytes();
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
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_HeartbeatRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_HeartbeatRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.class, cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.Builder.class);
    }

    public static final int PING_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString ping_;

    /**
     * <code>bytes ping = 1;</code>
     */
    public com.google.protobuf.ByteString getPing() {
        return ping_;
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
        if (!ping_.isEmpty()) {
            output.writeBytes(1, ping_);
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!ping_.isEmpty()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, ping_);
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
        if (!(obj instanceof cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest)) {
            return super.equals(obj);
        }
        cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest other = (cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest) obj;

        boolean result = true;
        result = result && getPing()
                .equals(other.getPing());
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
        hash = (37 * hash) + PING_FIELD_NUMBER;
        hash = (53 * hash) + getPing().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parseFrom(
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

    public static Builder newBuilder(cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest prototype) {
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
     * Protobuf type {@code HeartbeatRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:HeartbeatRequest)
            cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_HeartbeatRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_HeartbeatRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.class, cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.Builder.class);
        }

        // Construct using cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.newBuilder()
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
            ping_ = com.google.protobuf.ByteString.EMPTY;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_HeartbeatRequest_descriptor;
        }

        public cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest getDefaultInstanceForType() {
            return cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.getDefaultInstance();
        }

        public cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest build() {
            cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest buildPartial() {
            cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest result = new cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest(this);
            result.ping_ = ping_;
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
            if (other instanceof cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest) {
                return mergeFrom((cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest other) {
            if (other == cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest.getDefaultInstance()) return this;
            if (other.getPing() != com.google.protobuf.ByteString.EMPTY) {
                setPing(other.getPing());
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
            cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private com.google.protobuf.ByteString ping_ = com.google.protobuf.ByteString.EMPTY;

        /**
         * <code>bytes ping = 1;</code>
         */
        public com.google.protobuf.ByteString getPing() {
            return ping_;
        }

        /**
         * <code>bytes ping = 1;</code>
         */
        public Builder setPing(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }

            ping_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>bytes ping = 1;</code>
         */
        public Builder clearPing() {

            ping_ = getDefaultInstance().getPing();
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


        // @@protoc_insertion_point(builder_scope:HeartbeatRequest)
    }

    // @@protoc_insertion_point(class_scope:HeartbeatRequest)
    private static final cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest();
    }

    public static cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HeartbeatRequest>
            PARSER = new com.google.protobuf.AbstractParser<HeartbeatRequest>() {
        public HeartbeatRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new HeartbeatRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<HeartbeatRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<HeartbeatRequest> getParserForType() {
        return PARSER;
    }

    public cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
