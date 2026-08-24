package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BlockHeader extends com.github.junrar.rarfile.BaseBlock {
    public static final short blockHeaderSize = 4;
    private static final defpackage.ry3 logger = null;
    private long dataSize;
    private long packSize;

    static {
            java.lang.Class<com.github.junrar.rarfile.BlockHeader> r0 = com.github.junrar.rarfile.BlockHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.BlockHeader.logger = r0
            return
    }

    public BlockHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    public BlockHeader(com.github.junrar.rarfile.BaseBlock r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            long r1 = com.github.junrar.io.Raw.readIntLittleEndianAsLong(r2, r1)
            r0.packSize = r1
            r0.dataSize = r1
            return
    }

    public BlockHeader(com.github.junrar.rarfile.BlockHeader r3) {
            r2 = this;
            r2.<init>(r3)
            long r0 = r3.getDataSize()
            r2.packSize = r0
            r2.dataSize = r0
            long r0 = r3.getPositionInFile()
            r2.positionInFile = r0
            return
    }

    public long getDataSize() {
            r2 = this;
            long r0 = r2.dataSize
            return r0
    }

    public long getPackSize() {
            r2 = this;
            long r0 = r2.packSize
            return r0
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
            r4 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.BlockHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L1e
            long r1 = r4.getDataSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r4.getPackSize()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.a(r1, r4)
        L1e:
            return
    }
}
