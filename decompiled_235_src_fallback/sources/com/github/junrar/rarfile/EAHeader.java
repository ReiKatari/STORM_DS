package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EAHeader extends com.github.junrar.rarfile.SubBlockHeader {
    public static final short EAHeaderSize = 10;
    private static final defpackage.ry3 logger = null;
    private final int EACRC;
    private byte method;
    private final int unpSize;
    private byte unpVer;

    static {
            java.lang.Class<com.github.junrar.rarfile.EAHeader> r0 = com.github.junrar.rarfile.EAHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.EAHeader.logger = r0
            return
    }

    public EAHeader(com.github.junrar.rarfile.SubBlockHeader r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r3, r2)
            r1.unpSize = r2
            byte r2 = r1.unpVer
            r0 = 4
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.unpVer = r2
            byte r2 = r1.method
            r0 = 5
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.method = r2
            r2 = 6
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r3, r2)
            r1.EACRC = r2
            return
    }

    public int getEACRC() {
            r0 = this;
            int r0 = r0.EACRC
            return r0
    }

    public byte getMethod() {
            r0 = this;
            byte r0 = r0.method
            return r0
    }

    public int getUnpSize() {
            r0 = this;
            int r0 = r0.unpSize
            return r0
    }

    public byte getUnpVer() {
            r0 = this;
            byte r0 = r0.unpVer
            return r0
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
            r3 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.EAHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L37
            int r1 = r3.unpSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "unpSize: {}"
            r0.b(r1, r2)
            byte r1 = r3.unpVer
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "unpVersion: {}"
            r0.b(r1, r2)
            byte r1 = r3.method
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "method: {}"
            r0.b(r1, r2)
            int r3 = r3.EACRC
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "EACRC: {}"
            r0.b(r3, r1)
        L37:
            return
    }
}
