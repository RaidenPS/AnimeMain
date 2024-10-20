// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerInfo.proto

package raidengame.cache.protobuf;

public final class ScenePlayerInfoOuterClass {
  private ScenePlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     * @return Whether the onlinePlayerInfo field is set.
     */
    boolean hasOnlinePlayerInfo();
    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     * @return The onlinePlayerInfo.
     */
    raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo();
    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     */
    raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder();

    /**
     * <code>bool is_connected = 2;</code>
     * @return The isConnected.
     */
    boolean getIsConnected();

    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>string name = 8;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 8;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>uint32 peer_id = 11;</code>
     * @return The peerId.
     */
    int getPeerId();

    /**
     * <code>uint32 uid = 13;</code>
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
   * Protobuf type {@code ScenePlayerInfo}
   */
  public static final class ScenePlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerInfo)
      ScenePlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerInfo.newBuilder() to construct.
    private ScenePlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerInfo() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayerInfo(
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
            case 10: {
              raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
              if (onlinePlayerInfo_ != null) {
                subBuilder = onlinePlayerInfo_.toBuilder();
              }
              onlinePlayerInfo_ = input.readMessage(raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(onlinePlayerInfo_);
                onlinePlayerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              isConnected_ = input.readBool();
              break;
            }
            case 40: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 88: {

              peerId_ = input.readUInt32();
              break;
            }
            case 104: {

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.class, raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder.class);
    }

    public static final int ONLINE_PLAYER_INFO_FIELD_NUMBER = 1;
    private raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     * @return Whether the onlinePlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasOnlinePlayerInfo() {
      return onlinePlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     * @return The onlinePlayerInfo.
     */
    @java.lang.Override
    public raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
      return onlinePlayerInfo_ == null ? raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo online_player_info = 1;</code>
     */
    @java.lang.Override
    public raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
      return getOnlinePlayerInfo();
    }

    public static final int IS_CONNECTED_FIELD_NUMBER = 2;
    private boolean isConnected_;
    /**
     * <code>bool is_connected = 2;</code>
     * @return The isConnected.
     */
    @java.lang.Override
    public boolean getIsConnected() {
      return isConnected_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 5;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int NAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 8;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 8;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PEER_ID_FIELD_NUMBER = 11;
    private int peerId_;
    /**
     * <code>uint32 peer_id = 11;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }

    public static final int UID_FIELD_NUMBER = 13;
    private int uid_;
    /**
     * <code>uint32 uid = 13;</code>
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
      if (onlinePlayerInfo_ != null) {
        output.writeMessage(1, getOnlinePlayerInfo());
      }
      if (isConnected_ != false) {
        output.writeBool(2, isConnected_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(5, sceneId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, name_);
      }
      if (peerId_ != 0) {
        output.writeUInt32(11, peerId_);
      }
      if (uid_ != 0) {
        output.writeUInt32(13, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (onlinePlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getOnlinePlayerInfo());
      }
      if (isConnected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isConnected_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sceneId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, name_);
      }
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, peerId_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, uid_);
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
      if (!(obj instanceof raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo)) {
        return super.equals(obj);
      }
      raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo other = (raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo) obj;

      if (hasOnlinePlayerInfo() != other.hasOnlinePlayerInfo()) return false;
      if (hasOnlinePlayerInfo()) {
        if (!getOnlinePlayerInfo()
            .equals(other.getOnlinePlayerInfo())) return false;
      }
      if (getIsConnected()
          != other.getIsConnected()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (getPeerId()
          != other.getPeerId()) return false;
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
      if (hasOnlinePlayerInfo()) {
        hash = (37 * hash) + ONLINE_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getOnlinePlayerInfo().hashCode();
      }
      hash = (37 * hash) + IS_CONNECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsConnected());
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
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
    public static Builder newBuilder(raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo prototype) {
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
     * Protobuf type {@code ScenePlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerInfo)
        raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.class, raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder.class);
      }

      // Construct using raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.newBuilder()
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
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = null;
        } else {
          onlinePlayerInfo_ = null;
          onlinePlayerInfoBuilder_ = null;
        }
        isConnected_ = false;

        sceneId_ = 0;

        name_ = "";

        peerId_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstanceForType() {
        return raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo build() {
        raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo buildPartial() {
        raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo result = new raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo(this);
        if (onlinePlayerInfoBuilder_ == null) {
          result.onlinePlayerInfo_ = onlinePlayerInfo_;
        } else {
          result.onlinePlayerInfo_ = onlinePlayerInfoBuilder_.build();
        }
        result.isConnected_ = isConnected_;
        result.sceneId_ = sceneId_;
        result.name_ = name_;
        result.peerId_ = peerId_;
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
        if (other instanceof raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo) {
          return mergeFrom((raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo other) {
        if (other == raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance()) return this;
        if (other.hasOnlinePlayerInfo()) {
          mergeOnlinePlayerInfo(other.getOnlinePlayerInfo());
        }
        if (other.getIsConnected() != false) {
          setIsConnected(other.getIsConnected());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
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
        raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> onlinePlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       * @return Whether the onlinePlayerInfo field is set.
       */
      public boolean hasOnlinePlayerInfo() {
        return onlinePlayerInfoBuilder_ != null || onlinePlayerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       * @return The onlinePlayerInfo.
       */
      public raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
        if (onlinePlayerInfoBuilder_ == null) {
          return onlinePlayerInfo_ == null ? raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
        } else {
          return onlinePlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public Builder setOnlinePlayerInfo(raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (onlinePlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          onlinePlayerInfo_ = value;
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public Builder setOnlinePlayerInfo(
          raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public Builder mergeOnlinePlayerInfo(raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (onlinePlayerInfoBuilder_ == null) {
          if (onlinePlayerInfo_ != null) {
            onlinePlayerInfo_ =
              raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(onlinePlayerInfo_).mergeFrom(value).buildPartial();
          } else {
            onlinePlayerInfo_ = value;
          }
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public Builder clearOnlinePlayerInfo() {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = null;
          onChanged();
        } else {
          onlinePlayerInfo_ = null;
          onlinePlayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getOnlinePlayerInfoBuilder() {
        
        onChanged();
        return getOnlinePlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      public raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
        if (onlinePlayerInfoBuilder_ != null) {
          return onlinePlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return onlinePlayerInfo_ == null ?
              raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getOnlinePlayerInfoFieldBuilder() {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getOnlinePlayerInfo(),
                  getParentForChildren(),
                  isClean());
          onlinePlayerInfo_ = null;
        }
        return onlinePlayerInfoBuilder_;
      }

      private boolean isConnected_ ;
      /**
       * <code>bool is_connected = 2;</code>
       * @return The isConnected.
       */
      @java.lang.Override
      public boolean getIsConnected() {
        return isConnected_;
      }
      /**
       * <code>bool is_connected = 2;</code>
       * @param value The isConnected to set.
       * @return This builder for chaining.
       */
      public Builder setIsConnected(boolean value) {
        
        isConnected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_connected = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsConnected() {
        
        isConnected_ = false;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 5;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 5;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 8;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 8;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 8;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 8;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int peerId_ ;
      /**
       * <code>uint32 peer_id = 11;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <code>uint32 peer_id = 11;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 peer_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 13;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerInfo)
    private static final raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo();
    }

    public static raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerInfo>() {
      @java.lang.Override
      public ScenePlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public raidengame.cache.protobuf.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ScenePlayerInfo.proto\032\026OnlinePlayerInf" +
      "o.proto\"\224\001\n\017ScenePlayerInfo\022-\n\022online_pl" +
      "ayer_info\030\001 \001(\0132\021.OnlinePlayerInfo\022\024\n\014is" +
      "_connected\030\002 \001(\010\022\020\n\010scene_id\030\005 \001(\r\022\014\n\004na" +
      "me\030\010 \001(\t\022\017\n\007peer_id\030\013 \001(\r\022\013\n\003uid\030\r \001(\rB\033" +
      "\n\031raidengame.cache.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerInfo_descriptor,
        new java.lang.String[] { "OnlinePlayerInfo", "IsConnected", "SceneId", "Name", "PeerId", "Uid", });
    raidengame.cache.protobuf.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
