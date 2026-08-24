package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommentHeader extends BaseBlock {
    public static final short commentHeaderSize = 6;
    private final short commCRC;
    private byte unpMethod;
    private final short unpSize;
    private byte unpVersion;

    public CommentHeader(BaseBlock baseBlock, byte[] bArr) {
        super(baseBlock);
        this.unpSize = Raw.readShortLittleEndian(bArr, 0);
        this.unpVersion = (byte) (this.unpVersion | (bArr[2] & 255));
        this.unpMethod = (byte) (this.unpMethod | (bArr[3] & 255));
        this.commCRC = Raw.readShortLittleEndian(bArr, 4);
    }

    public short getCommCRC() {
        return this.commCRC;
    }

    public byte getUnpMethod() {
        return this.unpMethod;
    }

    public short getUnpSize() {
        return this.unpSize;
    }

    public byte getUnpVersion() {
        return this.unpVersion;
    }
}
