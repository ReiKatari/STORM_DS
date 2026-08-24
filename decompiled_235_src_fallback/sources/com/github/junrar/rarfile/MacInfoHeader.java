package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MacInfoHeader extends com.github.junrar.rarfile.SubBlockHeader {
    public static final short MacInfoHeaderSize = 8;
    private static final defpackage.ry3 logger = null;
    private int fileCreator;
    private int fileType;

    static {
            java.lang.Class<com.github.junrar.rarfile.MacInfoHeader> r0 = com.github.junrar.rarfile.MacInfoHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.MacInfoHeader.logger = r0
            return
    }

    public MacInfoHeader(com.github.junrar.rarfile.SubBlockHeader r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            int r1 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r1)
            r0.fileType = r1
            r1 = 4
            int r1 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r1)
            r0.fileCreator = r1
            return
    }

    public int getFileCreator() {
            r0 = this;
            int r0 = r0.fileCreator
            return r0
    }

    public int getFileType() {
            r0 = this;
            int r0 = r0.fileType
            return r0
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
            r3 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.MacInfoHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L21
            int r1 = r3.fileType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "filetype: {}"
            r0.b(r1, r2)
            int r3 = r3.fileCreator
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "creator: {}"
            r0.b(r3, r1)
        L21:
            return
    }

    public void setFileCreator(int r1) {
            r0 = this;
            r0.fileCreator = r1
            return
    }

    public void setFileType(int r1) {
            r0 = this;
            r0.fileType = r1
            return
    }
}
