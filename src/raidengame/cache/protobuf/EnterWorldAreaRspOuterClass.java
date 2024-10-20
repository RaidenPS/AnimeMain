// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterWorldAreaRsp.proto

package raidengame.cache.protobuf;

public final class EnterWorldAreaRspOuterClass {
  private EnterWorldAreaRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterWorldAreaRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterWorldAreaRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 area_type = 7;</code>
     * @return The areaType.
     */
    int getAreaType();

    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Version: 5.0
   * CmdId: 7481
   * </pre>
   *
   * Protobuf type {@code EnterWorldAreaRsp}
   */
  public static final class EnterWorldAreaRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterWorldAreaRsp)
      EnterWorldAreaRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterWorldAreaRsp.newBuilder() to construct.
    private EnterWorldAreaRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterWorldAreaRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterWorldAreaRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterWorldAreaRsp(
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
            case 56: {

              areaType_ = input.readUInt32();
              break;
            }
            case 88: {

              areaId_ = input.readUInt32();
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
      return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.class, raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.Builder.class);
    }

    public static final int AREA_TYPE_FIELD_NUMBER = 7;
    private int areaType_;
    /**
     * <code>uint32 area_type = 7;</code>
     * @return The areaType.
     */
    @java.lang.Override
    public int getAreaType() {
      return areaType_;
    }

    public static final int AREA_ID_FIELD_NUMBER = 11;
    private int areaId_;
    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (areaType_ != 0) {
        output.writeUInt32(7, areaType_);
      }
      if (areaId_ != 0) {
        output.writeUInt32(11, areaId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (areaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, areaType_);
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, areaId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp)) {
        return super.equals(obj);
      }
      raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp other = (raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp) obj;

      if (getAreaType()
          != other.getAreaType()) return false;
      if (getAreaId()
          != other.getAreaId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + AREA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAreaType();
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parseFrom(
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
    public static Builder newBuilder(raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp prototype) {
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
     * CmdId: 7481
     * </pre>
     *
     * Protobuf type {@code EnterWorldAreaRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterWorldAreaRsp)
        raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.class, raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.Builder.class);
      }

      // Construct using raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.newBuilder()
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
        areaType_ = 0;

        areaId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp getDefaultInstanceForType() {
        return raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.getDefaultInstance();
      }

      @java.lang.Override
      public raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp build() {
        raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp buildPartial() {
        raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp result = new raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp(this);
        result.areaType_ = areaType_;
        result.areaId_ = areaId_;
        result.retcode_ = retcode_;
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
        if (other instanceof raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp) {
          return mergeFrom((raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp other) {
        if (other == raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp.getDefaultInstance()) return this;
        if (other.getAreaType() != 0) {
          setAreaType(other.getAreaType());
        }
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int areaType_ ;
      /**
       * <code>uint32 area_type = 7;</code>
       * @return The areaType.
       */
      @java.lang.Override
      public int getAreaType() {
        return areaType_;
      }
      /**
       * <code>uint32 area_type = 7;</code>
       * @param value The areaType to set.
       * @return This builder for chaining.
       */
      public Builder setAreaType(int value) {
        
        areaType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaType() {
        
        areaType_ = 0;
        onChanged();
        return this;
      }

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 11;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterWorldAreaRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterWorldAreaRsp)
    private static final raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp();
    }

    public static raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterWorldAreaRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterWorldAreaRsp>() {
      @java.lang.Override
      public EnterWorldAreaRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterWorldAreaRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterWorldAreaRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterWorldAreaRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public raidengame.cache.protobuf.EnterWorldAreaRspOuterClass.EnterWorldAreaRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterWorldAreaRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterWorldAreaRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EnterWorldAreaRsp.proto\"H\n\021EnterWorldA" +
      "reaRsp\022\021\n\tarea_type\030\007 \001(\r\022\017\n\007area_id\030\013 \001" +
      "(\r\022\017\n\007retcode\030\017 \001(\005B\033\n\031raidengame.cache." +
      "protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterWorldAreaRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterWorldAreaRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterWorldAreaRsp_descriptor,
        new java.lang.String[] { "AreaType", "AreaId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
