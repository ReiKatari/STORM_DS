package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ProtectHeader extends BlockHeader {
    public static final int protectHeaderSize = 8;
    private byte mark;
    private final short recSectors;
    private final int totalBlocks;
    private byte version;

    public ProtectHeader(BlockHeader blockHeader, byte[] bArr) {
        super(blockHeader);
        this.version = (byte) (this.version | (bArr[0] & 255));
        this.recSectors = Raw.readShortLittleEndian(bArr, 0);
        this.totalBlocks = Raw.readIntLittleEndian(bArr, 2);
        this.mark = (byte) (this.mark | (bArr[6] & 255));
    }

    public byte getMark() {
        return this.mark;
    }

    public short getRecSectors() {
        return this.recSectors;
    }

    public int getTotalBlocks() {
        return this.totalBlocks;
    }

    public byte getVersion() {
        return this.version;
    }
}
