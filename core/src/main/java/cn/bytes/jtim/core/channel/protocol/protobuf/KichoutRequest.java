// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.channel.protocol.protobuf;

/**
 * <pre>
 * 踢人
 * </pre>
 * <p>
 * Protobuf type {@code KichoutRequest}
 */
public final class KichoutRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:KichoutRequest)
        KichoutRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use KichoutRequest.newBuilder() to construct.
    private KichoutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private KichoutRequest() {
        reasion_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private KichoutRequest(
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
                    case 8: {

                        reasion_ = input.readInt32();
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
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_KichoutRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_KichoutRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.class, cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.Builder.class);
    }

    /**
     * Protobuf enum {@code KichoutRequest.Reasion}
     */
    public enum Reasion
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * 其他地方登录
         * </pre>
         *
         * <code>OTHER_LOGIN = 0;</code>
         */
        OTHER_LOGIN(0),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * 其他地方登录
         * </pre>
         *
         * <code>OTHER_LOGIN = 0;</code>
         */
        public static final int OTHER_LOGIN_VALUE = 0;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static Reasion valueOf(int value) {
            return forNumber(value);
        }

        public static Reasion forNumber(int value) {
            switch (value) {
                case 0:
                    return OTHER_LOGIN;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Reasion>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                Reasion> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<Reasion>() {
                    public Reasion findValueByNumber(int number) {
                        return Reasion.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.getDescriptor().getEnumTypes().get(0);
        }

        private static final Reasion[] VALUES = values();

        public static Reasion valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private Reasion(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:KichoutRequest.Reasion)
    }

    public static final int REASION_FIELD_NUMBER = 1;
    private int reasion_;

    /**
     * <pre>
     * 踢人原因
     * </pre>
     *
     * <code>int32 reasion = 1;</code>
     */
    public int getReasion() {
        return reasion_;
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
        if (reasion_ != 0) {
            output.writeInt32(1, reasion_);
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (reasion_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, reasion_);
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
        if (!(obj instanceof cn.bytes.jtim.core.protocol.protobuf.KichoutRequest)) {
            return super.equals(obj);
        }
        cn.bytes.jtim.core.protocol.protobuf.KichoutRequest other = (cn.bytes.jtim.core.protocol.protobuf.KichoutRequest) obj;

        boolean result = true;
        result = result && (getReasion()
                == other.getReasion());
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
        hash = (37 * hash) + REASION_FIELD_NUMBER;
        hash = (53 * hash) + getReasion();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parseFrom(
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

    public static Builder newBuilder(cn.bytes.jtim.core.protocol.protobuf.KichoutRequest prototype) {
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
     * 踢人
     * </pre>
     * <p>
     * Protobuf type {@code KichoutRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:KichoutRequest)
            cn.bytes.jtim.core.protocol.protobuf.KichoutRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_KichoutRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_KichoutRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.class, cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.Builder.class);
        }

        // Construct using cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.newBuilder()
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
            reasion_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.bytes.jtim.core.protocol.protobuf.MessageContent.internal_static_KichoutRequest_descriptor;
        }

        public cn.bytes.jtim.core.protocol.protobuf.KichoutRequest getDefaultInstanceForType() {
            return cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.getDefaultInstance();
        }

        public cn.bytes.jtim.core.protocol.protobuf.KichoutRequest build() {
            cn.bytes.jtim.core.protocol.protobuf.KichoutRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public cn.bytes.jtim.core.protocol.protobuf.KichoutRequest buildPartial() {
            cn.bytes.jtim.core.protocol.protobuf.KichoutRequest result = new cn.bytes.jtim.core.protocol.protobuf.KichoutRequest(this);
            result.reasion_ = reasion_;
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
            if (other instanceof cn.bytes.jtim.core.protocol.protobuf.KichoutRequest) {
                return mergeFrom((cn.bytes.jtim.core.protocol.protobuf.KichoutRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.bytes.jtim.core.protocol.protobuf.KichoutRequest other) {
            if (other == cn.bytes.jtim.core.protocol.protobuf.KichoutRequest.getDefaultInstance()) return this;
            if (other.getReasion() != 0) {
                setReasion(other.getReasion());
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
            cn.bytes.jtim.core.protocol.protobuf.KichoutRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (cn.bytes.jtim.core.protocol.protobuf.KichoutRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int reasion_;

        /**
         * <pre>
         * 踢人原因
         * </pre>
         *
         * <code>int32 reasion = 1;</code>
         */
        public int getReasion() {
            return reasion_;
        }

        /**
         * <pre>
         * 踢人原因
         * </pre>
         *
         * <code>int32 reasion = 1;</code>
         */
        public Builder setReasion(int value) {

            reasion_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 踢人原因
         * </pre>
         *
         * <code>int32 reasion = 1;</code>
         */
        public Builder clearReasion() {

            reasion_ = 0;
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


        // @@protoc_insertion_point(builder_scope:KichoutRequest)
    }

    // @@protoc_insertion_point(class_scope:KichoutRequest)
    private static final cn.bytes.jtim.core.protocol.protobuf.KichoutRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.bytes.jtim.core.protocol.protobuf.KichoutRequest();
    }

    public static cn.bytes.jtim.core.protocol.protobuf.KichoutRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KichoutRequest>
            PARSER = new com.google.protobuf.AbstractParser<KichoutRequest>() {
        public KichoutRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new KichoutRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<KichoutRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<KichoutRequest> getParserForType() {
        return PARSER;
    }

    public cn.bytes.jtim.core.protocol.protobuf.KichoutRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
