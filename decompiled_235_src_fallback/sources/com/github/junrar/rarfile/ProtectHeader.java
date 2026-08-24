package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ProtectHeader extends com.github.junrar.rarfile.BlockHeader {
    public static final int protectHeaderSize = 8;
    private byte mark;
    private final short recSectors;
    private final int totalBlocks;
    private byte version;

    public ProtectHeader(com.github.junrar.rarfile.BlockHeader r3, byte[] r4) {
            r2 = this;
            r2.<init>(r3)
            byte r3 = r2.version
            r0 = 0
            r1 = r4[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = r3 | r1
            byte r3 = (byte) r3
            r2.version = r3
            short r3 = com.github.junrar.io.Raw.readShortLittleEndian(r4, r0)
            r2.recSectors = r3
            r3 = 2
            int r3 = com.github.junrar.io.Raw.readIntLittleEndian(r4, r3)
            r2.totalBlocks = r3
            byte r3 = r2.mark
            r0 = 6
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            byte r3 = (byte) r3
            r2.mark = r3
            return
    }

    public byte getMark() {
            r0 = this;
            byte r0 = r0.mark
            return r0
    }

    public short getRecSectors() {
            r0 = this;
            short r0 = r0.recSectors
            return r0
    }

    public int getTotalBlocks() {
            r0 = this;
            int r0 = r0.totalBlocks
            return r0
    }

    public byte getVersion() {
            r0 = this;
            byte r0 = r0.version
            return r0
    }
}
