// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlockInfo.proto

package raidengame.cache.protobuf;

public final class BlockInfoOuterClass {
  private BlockInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlockInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 block_id = 1;</code>
     * @return The blockId.
     */
    int getBlockId();

    /**
     * <code>uint32 data_version = 2;</code>
     * @return The dataVersion.
     */
    int getDataVersion();

    /**
     * <code>bytes bin_data = 3;</code>
     * @return The binData.
     */
    com.google.protobuf.ByteString getBinData();

    /**
     * <code>bool is_dirty = 4;</code>
     * @return The isDirty.
     */
    boolean getIsDirty();
  }
  /**
   * Protobuf type {@code BlockInfo}
   */
  public static final class BlockInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlockInfo)
      BlockInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockInfo.newBuilder() to construct.
    private BlockInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockInfo() {
      binData_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlockInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              blockId_ = input.readUInt32();
              break;
            }
            case 16: {

              dataVersion_ = input.readUInt32();
              break;
            }
            case 26: {

              binData_ = input.readBytes();
              break;
            }
            case 32: {

              isDirty_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
      return raidengame.cache.protobuf.BlockInfoOuterClass.internal_static_BlockInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raidengame.cache.protobuf.BlockInfoOuterClass.internal_static_BlockInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.class, raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.Builder.class);
    }

    public static final int BLOCK_ID_FIELD_NUMBER = 1;
    private int blockId_;
    /**
     * <code>uint32 block_id = 1;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    public static final int DATA_VERSION_FIELD_NUMBER = 2;
    private int dataVersion_;
    /**
     * <code>uint32 data_version = 2;</code>
     * @return The dataVersion.
     */
    @java.lang.Override
    public int getDataVersion() {
      return dataVersion_;
    }

    public static final int BIN_DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString binData_;
    /**
     * <code>bytes bin_data = 3;</code>
     * @return The binData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBinData() {
      return binData_;
    }

    public static final int IS_DIRTY_FIELD_NUMBER = 4;
    private boolean isDirty_;
    /**
     * <code>bool is_dirty = 4;</code>
     * @return The isDirty.
     */
    @java.lang.Override
    public boolean getIsDirty() {
      return isDirty_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (blockId_ != 0) {
        output.writeUInt32(1, blockId_);
      }
      if (dataVersion_ != 0) {
        output.writeUInt32(2, dataVersion_);
      }
      if (!binData_.isEmpty()) {
        output.writeBytes(3, binData_);
      }
      if (isDirty_ != false) {
        output.writeBool(4, isDirty_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, blockId_);
      }
      if (dataVersion_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dataVersion_);
      }
      if (!binData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, binData_);
      }
      if (isDirty_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isDirty_);
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
      if (!(obj instanceof raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo)) {
        return super.equals(obj);
      }
      raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo other = (raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo) obj;

      if (getBlockId()
          != other.getBlockId()) return false;
      if (getDataVersion()
          != other.getDataVersion()) return false;
      if (!getBinData()
          .equals(other.getBinData())) return false;
      if (getIsDirty()
          != other.getIsDirty()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      hash = (37 * hash) + DATA_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getDataVersion();
      hash = (37 * hash) + BIN_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getBinData().hashCode();
      hash = (37 * hash) + IS_DIRTY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDirty());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code BlockInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockInfo)
        raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raidengame.cache.protobuf.BlockInfoOuterClass.internal_static_BlockInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raidengame.cache.protobuf.BlockInfoOuterClass.internal_static_BlockInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.class, raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.Builder.class);
      }

      // Construct using raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        blockId_ = 0;

        dataVersion_ = 0;

        binData_ = com.google.protobuf.ByteString.EMPTY;

        isDirty_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raidengame.cache.protobuf.BlockInfoOuterClass.internal_static_BlockInfo_descriptor;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo getDefaultInstanceForType() {
        return raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.getDefaultInstance();
      }

      @java.lang.Override
      public raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo build() {
        raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo buildPartial() {
        raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo result = new raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo(this);
        result.blockId_ = blockId_;
        result.dataVersion_ = dataVersion_;
        result.binData_ = binData_;
        result.isDirty_ = isDirty_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo) {
          return mergeFrom((raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo other) {
        if (other == raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo.getDefaultInstance()) return this;
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        if (other.getDataVersion() != 0) {
          setDataVersion(other.getDataVersion());
        }
        if (other.getBinData() != com.google.protobuf.ByteString.EMPTY) {
          setBinData(other.getBinData());
        }
        if (other.getIsDirty() != false) {
          setIsDirty(other.getIsDirty());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int blockId_ ;
      /**
       * <code>uint32 block_id = 1;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 block_id = 1;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {
        
        blockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 block_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        
        blockId_ = 0;
        onChanged();
        return this;
      }

      private int dataVersion_ ;
      /**
       * <code>uint32 data_version = 2;</code>
       * @return The dataVersion.
       */
      @java.lang.Override
      public int getDataVersion() {
        return dataVersion_;
      }
      /**
       * <code>uint32 data_version = 2;</code>
       * @param value The dataVersion to set.
       * @return This builder for chaining.
       */
      public Builder setDataVersion(int value) {
        
        dataVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 data_version = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDataVersion() {
        
        dataVersion_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString binData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes bin_data = 3;</code>
       * @return The binData.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBinData() {
        return binData_;
      }
      /**
       * <code>bytes bin_data = 3;</code>
       * @param value The binData to set.
       * @return This builder for chaining.
       */
      public Builder setBinData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        binData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes bin_data = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBinData() {
        
        binData_ = getDefaultInstance().getBinData();
        onChanged();
        return this;
      }

      private boolean isDirty_ ;
      /**
       * <code>bool is_dirty = 4;</code>
       * @return The isDirty.
       */
      @java.lang.Override
      public boolean getIsDirty() {
        return isDirty_;
      }
      /**
       * <code>bool is_dirty = 4;</code>
       * @param value The isDirty to set.
       * @return This builder for chaining.
       */
      public Builder setIsDirty(boolean value) {
        
        isDirty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_dirty = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDirty() {
        
        isDirty_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BlockInfo)
    }

    // @@protoc_insertion_point(class_scope:BlockInfo)
    private static final raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo();
    }

    public static raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlockInfo>
        PARSER = new com.google.protobuf.AbstractParser<BlockInfo>() {
      @java.lang.Override
      public BlockInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlockInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlockInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public raidengame.cache.protobuf.BlockInfoOuterClass.BlockInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlockInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017BlockInfo.proto\"W\n\tBlockInfo\022\020\n\010block_" +
      "id\030\001 \001(\r\022\024\n\014data_version\030\002 \001(\r\022\020\n\010bin_da" +
      "ta\030\003 \001(\014\022\020\n\010is_dirty\030\004 \001(\010B\033\n\031raidengame" +
      ".cache.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlockInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlockInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlockInfo_descriptor,
        new java.lang.String[] { "BlockId", "DataVersion", "BinData", "IsDirty", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
