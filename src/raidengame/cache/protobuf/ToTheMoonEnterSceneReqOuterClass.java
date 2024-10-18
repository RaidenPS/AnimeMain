// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonEnterSceneReq.proto

package raidengame.cache.protobuf;

public final class ToTheMoonEnterSceneReqOuterClass {
  private ToTheMoonEnterSceneReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonEnterSceneReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonEnterSceneReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DKEOBFMAFPK = 5;</code>
     * @return The dKEOBFMAFPK.
     */
    int getDKEOBFMAFPK();

    /**
     * <code>uint32 CDDPHGDDCCN = 2;</code>
     * @return The cDDPHGDDCCN.
     */
    int getCDDPHGDDCCN();

    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 version = 4;</code>
     * @return The version.
     */
    int getVersion();
  }
  /**
   * <pre>
   * Version: 5.0
   * CmdId: 6116
   * </pre>
   *
   * Protobuf type {@code ToTheMoonEnterSceneReq}
   */
  public static final class ToTheMoonEnterSceneReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonEnterSceneReq)
      ToTheMoonEnterSceneReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonEnterSceneReq.newBuilder() to construct.
    private ToTheMoonEnterSceneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonEnterSceneReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonEnterSceneReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonEnterSceneReq(
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
            case 16: {

              cDDPHGDDCCN_ = input.readUInt32();
              break;
            }
            case 24: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 32: {

              version_ = input.readUInt32();
              break;
            }
            case 40: {

              dKEOBFMAFPK_ = input.readUInt32();
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
      return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.internal_static_ToTheMoonEnterSceneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.class, raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.Builder.class);
    }

    public static final int DKEOBFMAFPK_FIELD_NUMBER = 5;
    private int dKEOBFMAFPK_;
    /**
     * <code>uint32 DKEOBFMAFPK = 5;</code>
     * @return The dKEOBFMAFPK.
     */
    @java.lang.Override
    public int getDKEOBFMAFPK() {
      return dKEOBFMAFPK_;
    }

    public static final int CDDPHGDDCCN_FIELD_NUMBER = 2;
    private int cDDPHGDDCCN_;
    /**
     * <code>uint32 CDDPHGDDCCN = 2;</code>
     * @return The cDDPHGDDCCN.
     */
    @java.lang.Override
    public int getCDDPHGDDCCN() {
      return cDDPHGDDCCN_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 3;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private int version_;
    /**
     * <code>uint32 version = 4;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
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
      if (cDDPHGDDCCN_ != 0) {
        output.writeUInt32(2, cDDPHGDDCCN_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(3, sceneId_);
      }
      if (version_ != 0) {
        output.writeUInt32(4, version_);
      }
      if (dKEOBFMAFPK_ != 0) {
        output.writeUInt32(5, dKEOBFMAFPK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cDDPHGDDCCN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cDDPHGDDCCN_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneId_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, version_);
      }
      if (dKEOBFMAFPK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dKEOBFMAFPK_);
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
      if (!(obj instanceof raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq)) {
        return super.equals(obj);
      }
      raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq other = (raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq) obj;

      if (getDKEOBFMAFPK()
          != other.getDKEOBFMAFPK()) return false;
      if (getCDDPHGDDCCN()
          != other.getCDDPHGDDCCN()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getVersion()
          != other.getVersion()) return false;
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
      hash = (37 * hash) + DKEOBFMAFPK_FIELD_NUMBER;
      hash = (53 * hash) + getDKEOBFMAFPK();
      hash = (37 * hash) + CDDPHGDDCCN_FIELD_NUMBER;
      hash = (53 * hash) + getCDDPHGDDCCN();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parseFrom(
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
    public static Builder newBuilder(raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq prototype) {
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
     * CmdId: 6116
     * </pre>
     *
     * Protobuf type {@code ToTheMoonEnterSceneReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonEnterSceneReq)
        raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.internal_static_ToTheMoonEnterSceneReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.class, raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.Builder.class);
      }

      // Construct using raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.newBuilder()
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
        dKEOBFMAFPK_ = 0;

        cDDPHGDDCCN_ = 0;

        sceneId_ = 0;

        version_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.internal_static_ToTheMoonEnterSceneReq_descriptor;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq getDefaultInstanceForType() {
        return raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.getDefaultInstance();
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq build() {
        raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq buildPartial() {
        raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq result = new raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq(this);
        result.dKEOBFMAFPK_ = dKEOBFMAFPK_;
        result.cDDPHGDDCCN_ = cDDPHGDDCCN_;
        result.sceneId_ = sceneId_;
        result.version_ = version_;
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
        if (other instanceof raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq) {
          return mergeFrom((raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq other) {
        if (other == raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq.getDefaultInstance()) return this;
        if (other.getDKEOBFMAFPK() != 0) {
          setDKEOBFMAFPK(other.getDKEOBFMAFPK());
        }
        if (other.getCDDPHGDDCCN() != 0) {
          setCDDPHGDDCCN(other.getCDDPHGDDCCN());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
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
        raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dKEOBFMAFPK_ ;
      /**
       * <code>uint32 DKEOBFMAFPK = 5;</code>
       * @return The dKEOBFMAFPK.
       */
      @java.lang.Override
      public int getDKEOBFMAFPK() {
        return dKEOBFMAFPK_;
      }
      /**
       * <code>uint32 DKEOBFMAFPK = 5;</code>
       * @param value The dKEOBFMAFPK to set.
       * @return This builder for chaining.
       */
      public Builder setDKEOBFMAFPK(int value) {
        
        dKEOBFMAFPK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DKEOBFMAFPK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDKEOBFMAFPK() {
        
        dKEOBFMAFPK_ = 0;
        onChanged();
        return this;
      }

      private int cDDPHGDDCCN_ ;
      /**
       * <code>uint32 CDDPHGDDCCN = 2;</code>
       * @return The cDDPHGDDCCN.
       */
      @java.lang.Override
      public int getCDDPHGDDCCN() {
        return cDDPHGDDCCN_;
      }
      /**
       * <code>uint32 CDDPHGDDCCN = 2;</code>
       * @param value The cDDPHGDDCCN to set.
       * @return This builder for chaining.
       */
      public Builder setCDDPHGDDCCN(int value) {
        
        cDDPHGDDCCN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CDDPHGDDCCN = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCDDPHGDDCCN() {
        
        cDDPHGDDCCN_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <code>uint32 version = 4;</code>
       * @return The version.
       */
      @java.lang.Override
      public int getVersion() {
        return version_;
      }
      /**
       * <code>uint32 version = 4;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 version = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        
        version_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonEnterSceneReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonEnterSceneReq)
    private static final raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq();
    }

    public static raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonEnterSceneReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonEnterSceneReq>() {
      @java.lang.Override
      public ToTheMoonEnterSceneReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonEnterSceneReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonEnterSceneReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonEnterSceneReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public raidengame.cache.protobuf.ToTheMoonEnterSceneReqOuterClass.ToTheMoonEnterSceneReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonEnterSceneReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ToTheMoonEnterSceneReq.proto\"e\n\026ToTheM" +
      "oonEnterSceneReq\022\023\n\013DKEOBFMAFPK\030\005 \001(\r\022\023\n" +
      "\013CDDPHGDDCCN\030\002 \001(\r\022\020\n\010scene_id\030\003 \001(\r\022\017\n\007" +
      "version\030\004 \001(\rB\033\n\031raidengame.cache.protob" +
      "ufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ToTheMoonEnterSceneReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonEnterSceneReq_descriptor,
        new java.lang.String[] { "DKEOBFMAFPK", "CDDPHGDDCCN", "SceneId", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
