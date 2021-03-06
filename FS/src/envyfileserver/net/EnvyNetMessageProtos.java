// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/EnvyNetMessage.proto

package envyfileserver.net;

public final class EnvyNetMessageProtos {
  private EnvyNetMessageProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EnvyNetMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:envyfileserver.net.EnvyNetMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes data = 1;</code>
     */
    boolean hasData();
    /**
     * <code>optional bytes data = 1;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>optional int32 dataSize = 2;</code>
     */
    boolean hasDataSize();
    /**
     * <code>optional int32 dataSize = 2;</code>
     */
    int getDataSize();

    /**
     * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
     */
    boolean hasType();
    /**
     * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
     */
    envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType getType();
  }
  /**
   * Protobuf type {@code envyfileserver.net.EnvyNetMessage}
   */
  public static final class EnvyNetMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:envyfileserver.net.EnvyNetMessage)
      EnvyNetMessageOrBuilder {
    // Use EnvyNetMessage.newBuilder() to construct.
    private EnvyNetMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EnvyNetMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EnvyNetMessage defaultInstance;
    public static EnvyNetMessage getDefaultInstance() {
      return defaultInstance;
    }

    public EnvyNetMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EnvyNetMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              data_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dataSize_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType value = envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return envyfileserver.net.EnvyNetMessageProtos.internal_static_envyfileserver_net_EnvyNetMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return envyfileserver.net.EnvyNetMessageProtos.internal_static_envyfileserver_net_EnvyNetMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.class, envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<EnvyNetMessage> PARSER =
        new com.google.protobuf.AbstractParser<EnvyNetMessage>() {
      public EnvyNetMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnvyNetMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EnvyNetMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code envyfileserver.net.EnvyNetMessage.NetMessageType}
     */
    public enum NetMessageType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NET_OPEN_CONNECTION = 0;</code>
       */
      NET_OPEN_CONNECTION(0, 0),
      /**
       * <code>NET_CLOSE_CONNECTION = 1;</code>
       */
      NET_CLOSE_CONNECTION(1, 1),
      /**
       * <code>NET_AUTH_MESSAGE = 2;</code>
       */
      NET_AUTH_MESSAGE(2, 2),
      /**
       * <code>NET_AUTH_RESPONSE = 3;</code>
       */
      NET_AUTH_RESPONSE(3, 3),
      ;

      /**
       * <code>NET_OPEN_CONNECTION = 0;</code>
       */
      public static final int NET_OPEN_CONNECTION_VALUE = 0;
      /**
       * <code>NET_CLOSE_CONNECTION = 1;</code>
       */
      public static final int NET_CLOSE_CONNECTION_VALUE = 1;
      /**
       * <code>NET_AUTH_MESSAGE = 2;</code>
       */
      public static final int NET_AUTH_MESSAGE_VALUE = 2;
      /**
       * <code>NET_AUTH_RESPONSE = 3;</code>
       */
      public static final int NET_AUTH_RESPONSE_VALUE = 3;


      public final int getNumber() { return value; }

      public static NetMessageType valueOf(int value) {
        switch (value) {
          case 0: return NET_OPEN_CONNECTION;
          case 1: return NET_CLOSE_CONNECTION;
          case 2: return NET_AUTH_MESSAGE;
          case 3: return NET_AUTH_RESPONSE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NetMessageType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<NetMessageType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NetMessageType>() {
              public NetMessageType findValueByNumber(int number) {
                return NetMessageType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final NetMessageType[] VALUES = values();

      public static NetMessageType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private NetMessageType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:envyfileserver.net.EnvyNetMessage.NetMessageType)
    }

    private int bitField0_;
    public static final int DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes data = 1;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int DATASIZE_FIELD_NUMBER = 2;
    private int dataSize_;
    /**
     * <code>optional int32 dataSize = 2;</code>
     */
    public boolean hasDataSize() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 dataSize = 2;</code>
     */
    public int getDataSize() {
      return dataSize_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType type_;
    /**
     * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
     */
    public envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType getType() {
      return type_;
    }

    private void initFields() {
      data_ = com.google.protobuf.ByteString.EMPTY;
      dataSize_ = 0;
      type_ = envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType.NET_OPEN_CONNECTION;
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
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, data_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, dataSize_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, data_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, dataSize_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code envyfileserver.net.EnvyNetMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:envyfileserver.net.EnvyNetMessage)
        envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return envyfileserver.net.EnvyNetMessageProtos.internal_static_envyfileserver_net_EnvyNetMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return envyfileserver.net.EnvyNetMessageProtos.internal_static_envyfileserver_net_EnvyNetMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.class, envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.Builder.class);
      }

      // Construct using envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        dataSize_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType.NET_OPEN_CONNECTION;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return envyfileserver.net.EnvyNetMessageProtos.internal_static_envyfileserver_net_EnvyNetMessage_descriptor;
      }

      public envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage getDefaultInstanceForType() {
        return envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.getDefaultInstance();
      }

      public envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage build() {
        envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage buildPartial() {
        envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage result = new envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dataSize_ = dataSize_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage) {
          return mergeFrom((envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage other) {
        if (other == envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.getDefaultInstance()) return this;
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasDataSize()) {
          setDataSize(other.getDataSize());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes data = 1;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes data = 1;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>optional bytes data = 1;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes data = 1;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private int dataSize_ ;
      /**
       * <code>optional int32 dataSize = 2;</code>
       */
      public boolean hasDataSize() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 dataSize = 2;</code>
       */
      public int getDataSize() {
        return dataSize_;
      }
      /**
       * <code>optional int32 dataSize = 2;</code>
       */
      public Builder setDataSize(int value) {
        bitField0_ |= 0x00000002;
        dataSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 dataSize = 2;</code>
       */
      public Builder clearDataSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataSize_ = 0;
        onChanged();
        return this;
      }

      private envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType type_ = envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType.NET_OPEN_CONNECTION;
      /**
       * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
       */
      public envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType getType() {
        return type_;
      }
      /**
       * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
       */
      public Builder setType(envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .envyfileserver.net.EnvyNetMessage.NetMessageType type = 3 [default = NET_OPEN_CONNECTION];</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = envyfileserver.net.EnvyNetMessageProtos.EnvyNetMessage.NetMessageType.NET_OPEN_CONNECTION;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:envyfileserver.net.EnvyNetMessage)
    }

    static {
      defaultInstance = new EnvyNetMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:envyfileserver.net.EnvyNetMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envyfileserver_net_EnvyNetMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_envyfileserver_net_EnvyNetMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033protos/EnvyNetMessage.proto\022\022envyfiles" +
      "erver.net\"\370\001\n\016EnvyNetMessage\022\014\n\004data\030\001 \001" +
      "(\014\022\020\n\010dataSize\030\002 \001(\005\022T\n\004type\030\003 \001(\01621.env" +
      "yfileserver.net.EnvyNetMessage.NetMessag" +
      "eType:\023NET_OPEN_CONNECTION\"p\n\016NetMessage" +
      "Type\022\027\n\023NET_OPEN_CONNECTION\020\000\022\030\n\024NET_CLO" +
      "SE_CONNECTION\020\001\022\024\n\020NET_AUTH_MESSAGE\020\002\022\025\n" +
      "\021NET_AUTH_RESPONSE\020\003B.\n\026src.envyfileserv" +
      "er.netB\024EnvyNetMessageProtos"
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
    internal_static_envyfileserver_net_EnvyNetMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envyfileserver_net_EnvyNetMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_envyfileserver_net_EnvyNetMessage_descriptor,
        new java.lang.String[] { "Data", "DataSize", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
