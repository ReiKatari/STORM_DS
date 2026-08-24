package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SubBlockHeader extends com.github.junrar.rarfile.BlockHeader {
    public static final short SubBlockHeaderSize = 3;
    private static final defpackage.ry3 logger = null;
    private byte level;
    private final short subType;

    static {
            java.lang.Class<com.github.junrar.rarfile.SubBlockHeader> r0 = com.github.junrar.rarfile.SubBlockHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.SubBlockHeader.logger = r0
            return
    }

    public SubBlockHeader(com.github.junrar.rarfile.BlockHeader r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            short r2 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r2)
            r1.subType = r2
            byte r2 = r1.level
            r0 = 2
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            r1.level = r2
            return
    }

    public SubBlockHeader(com.github.junrar.rarfile.SubBlockHeader r2) {
            r1 = this;
            r1.<init>(r2)
            com.github.junrar.rarfile.SubBlockHeaderType r0 = r2.getSubType()
            short r0 = r0.getSubblocktype()
            r1.subType = r0
            byte r2 = r2.getLevel()
            r1.level = r2
            return
    }

    public byte getLevel() {
            r0 = this;
            byte r0 = r0.level
            return r0
    }

    public com.github.junrar.rarfile.SubBlockHeaderType getSubType() {
            r0 = this;
            short r0 = r0.subType
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.findSubblockHeaderType(r0)
            return r0
    }

    @Override // com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
            r3 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.SubBlockHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L1f
            java.lang.String r1 = "subtype: {}"
            com.github.junrar.rarfile.SubBlockHeaderType r2 = r3.getSubType()
            r0.b(r2, r1)
            byte r3 = r3.level
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.String r1 = "level: {}"
            r0.b(r3, r1)
        L1f:
            return
    }
}
