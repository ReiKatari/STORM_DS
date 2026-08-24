package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AVHeader extends BaseBlock {
    public static final int avHeaderSize = 7;
    private final int avInfoCRC;
    private byte avVersion;
    private byte method;
    private byte unpackVersion;

    public AVHeader(BaseBlock baseBlock, byte[] bArr) {
        super(baseBlock);
        this.unpackVersion = (byte) (this.unpackVersion | (bArr[0] & 255));
        this.method = (byte) (this.method | (bArr[1] & 255));
        this.avVersion = (byte) (this.avVersion | (bArr[2] & 255));
        this.avInfoCRC = Raw.readIntLittleEndian(bArr, 3);
    }

    public int getAvInfoCRC() {
        return this.avInfoCRC;
    }

    public byte getAvVersion() {
        return this.avVersion;
    }

    public byte getMethod() {
        return this.method;
    }

    public byte getUnpackVersion() {
        return this.unpackVersion;
    }
}
