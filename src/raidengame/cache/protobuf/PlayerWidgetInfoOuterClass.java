// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWidgetInfo.proto

package raidengame.cache.protobuf;

public final class PlayerWidgetInfoOuterClass {
  private PlayerWidgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWidgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWidgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> 
        getSlotListList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index);
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    int getSlotListCount();
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    java.util.List<? extends raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index);

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Version: 5.0
   * CmdId: -
   * </pre>
   *
   * Protobuf type {@code PlayerWidgetInfo}
   */
  public static final class PlayerWidgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWidgetInfo)
      PlayerWidgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWidgetInfo.newBuilder() to construct.
    private PlayerWidgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWidgetInfo() {
      slotList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWidgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerWidgetInfo(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                slotList_ = new java.util.ArrayList<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData>();
                mutable_bitField0_ |= 0x00000001;
              }
              slotList_.add(
                  input.readMessage(raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          slotList_ = java.util.Collections.unmodifiableList(slotList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.class, raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder.class);
    }

    public static final int SLOT_LIST_FIELD_NUMBER = 6;
    private java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    @java.lang.Override
    public int getSlotListCount() {
      return slotList_.size();
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    @java.lang.Override
    public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
      return slotList_.get(index);
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 6;</code>
     */
    @java.lang.Override
    public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index) {
      return slotList_.get(index);
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      for (int i = 0; i < slotList_.size(); i++) {
        output.writeMessage(6, slotList_.get(i));
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < slotList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, slotList_.get(i));
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
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
      if (!(obj instanceof raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo)) {
        return super.equals(obj);
      }
      raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo other = (raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo) obj;

      if (!getSlotListList()
          .equals(other.getSlotListList())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getSlotListCount() > 0) {
        hash = (37 * hash) + SLOT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSlotListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
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
    public static Builder newBuilder(raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo prototype) {
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
     * <pre>
     * Version: 5.0
     * CmdId: -
     * </pre>
     *
     * Protobuf type {@code PlayerWidgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWidgetInfo)
        raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.class, raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder.class);
      }

      // Construct using raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.newBuilder()
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
          getSlotListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          slotListBuilder_.clear();
        }
        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstanceForType() {
        return raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo build() {
        raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo buildPartial() {
        raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo result = new raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo(this);
        int from_bitField0_ = bitField0_;
        if (slotListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            slotList_ = java.util.Collections.unmodifiableList(slotList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.slotList_ = slotList_;
        } else {
          result.slotList_ = slotListBuilder_.build();
        }
        result.uid_ = uid_;
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
        if (other instanceof raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo) {
          return mergeFrom((raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo other) {
        if (other == raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance()) return this;
        if (slotListBuilder_ == null) {
          if (!other.slotList_.isEmpty()) {
            if (slotList_.isEmpty()) {
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSlotListIsMutable();
              slotList_.addAll(other.slotList_);
            }
            onChanged();
          }
        } else {
          if (!other.slotList_.isEmpty()) {
            if (slotListBuilder_.isEmpty()) {
              slotListBuilder_.dispose();
              slotListBuilder_ = null;
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              slotListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSlotListFieldBuilder() : null;
            } else {
              slotListBuilder_.addAllMessages(other.slotList_);
            }
          }
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> slotList_ =
        java.util.Collections.emptyList();
      private void ensureSlotListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          slotList_ = new java.util.ArrayList<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData>(slotList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;

      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
        if (slotListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(slotList_);
        } else {
          return slotListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public int getSlotListCount() {
        if (slotListBuilder_ == null) {
          return slotList_.size();
        } else {
          return slotListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);
        } else {
          return slotListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder setSlotList(
          int index, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.set(index, value);
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder setSlotList(
          int index, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.set(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder addSlotList(raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder addSlotList(
          int index, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(index, value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder addSlotList(
          raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder addSlotList(
          int index, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder addAllSlotList(
          java.lang.Iterable<? extends raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData> values) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, slotList_);
          onChanged();
        } else {
          slotListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder clearSlotList() {
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          slotListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public Builder removeSlotList(int index) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.remove(index);
          onChanged();
        } else {
          slotListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
          int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);  } else {
          return slotListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public java.util.List<? extends raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
           getSlotListOrBuilderList() {
        if (slotListBuilder_ != null) {
          return slotListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(slotList_);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
        return getSlotListFieldBuilder().addBuilder(
            raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().addBuilder(
            index, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 6;</code>
       */
      public java.util.List<raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder> 
           getSlotListBuilderList() {
        return getSlotListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
          getSlotListFieldBuilder() {
        if (slotListBuilder_ == null) {
          slotListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotData.Builder, raidengame.cache.protobuf.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(
                  slotList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          slotList_ = null;
        }
        return slotListBuilder_;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerWidgetInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerWidgetInfo)
    private static final raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo();
    }

    public static raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWidgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWidgetInfo>() {
      @java.lang.Override
      public PlayerWidgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerWidgetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerWidgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWidgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public raidengame.cache.protobuf.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWidgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWidgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerWidgetInfo.proto\032\024WidgetSlotData" +
      ".proto\"C\n\020PlayerWidgetInfo\022\"\n\tslot_list\030" +
      "\006 \003(\0132\017.WidgetSlotData\022\013\n\003uid\030\n \001(\rB\033\n\031r" +
      "aidengame.cache.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          raidengame.cache.protobuf.WidgetSlotDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerWidgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWidgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWidgetInfo_descriptor,
        new java.lang.String[] { "SlotList", "Uid", });
    raidengame.cache.protobuf.WidgetSlotDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
