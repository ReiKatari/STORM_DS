package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MarkHeader extends com.github.junrar.rarfile.BaseBlock {
    private final defpackage.ry3 logger;
    private com.github.junrar.rarfile.RARVersion version;

    public MarkHeader(com.github.junrar.rarfile.BaseBlock r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Class<com.github.junrar.rarfile.MarkHeader> r1 = com.github.junrar.rarfile.MarkHeader.class
            java.lang.String r1 = r1.getName()
            ry3 r1 = defpackage.sy3.e(r1)
            r0.logger = r1
            return
    }

    public com.github.junrar.rarfile.RARVersion getVersion() {
            r0 = this;
            com.github.junrar.rarfile.RARVersion r0 = r0.version
            return r0
    }

    public boolean isOldFormat() {
            r0 = this;
            com.github.junrar.rarfile.RARVersion r0 = r0.version
            boolean r0 = com.github.junrar.rarfile.RARVersion.isOldFormat(r0)
            return r0
    }

    public boolean isSignature() {
            r10 = this;
            r0 = 7
            byte[] r1 = new byte[r0]
            short r2 = r10.headCRC
            r3 = 0
            com.github.junrar.io.Raw.writeShortLittleEndian(r1, r3, r2)
            byte r2 = r10.headerType
            r4 = 2
            r1[r4] = r2
            short r2 = r10.flags
            r5 = 3
            com.github.junrar.io.Raw.writeShortLittleEndian(r1, r5, r2)
            short r2 = r10.headerSize
            r6 = 5
            com.github.junrar.io.Raw.writeShortLittleEndian(r1, r6, r2)
            r2 = r1[r3]
            r7 = 82
            r8 = 1
            if (r2 != r7) goto L63
            r2 = r1[r8]
            r7 = 69
            if (r2 != r7) goto L38
            r7 = r1[r4]
            r9 = 126(0x7e, float:1.77E-43)
            if (r7 != r9) goto L38
            r7 = r1[r5]
            r9 = 94
            if (r7 != r9) goto L38
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.OLD
            r10.version = r0
            goto L63
        L38:
            r7 = 97
            if (r2 != r7) goto L63
            r2 = r1[r4]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L63
            r2 = r1[r5]
            r4 = 33
            if (r2 != r4) goto L63
            r2 = 4
            r2 = r1[r2]
            r4 = 26
            if (r2 != r4) goto L63
            r2 = r1[r6]
            if (r2 != r0) goto L63
            r0 = 6
            r0 = r1[r0]
            if (r0 != 0) goto L5d
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.V4
            r10.version = r0
            goto L63
        L5d:
            if (r0 != r8) goto L63
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.V5
            r10.version = r0
        L63:
            com.github.junrar.rarfile.RARVersion r10 = r10.version
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.OLD
            if (r10 == r0) goto L6f
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.V4
            if (r10 != r0) goto L6e
            goto L6f
        L6e:
            return r3
        L6f:
            return r8
    }

    public boolean isValid() {
            r3 = this;
            short r0 = r3.getHeadCRC()
            r1 = 24914(0x6152, float:3.4912E-41)
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            com.github.junrar.rarfile.UnrarHeadertype r0 = r3.getHeaderType()
            com.github.junrar.rarfile.UnrarHeadertype r1 = com.github.junrar.rarfile.UnrarHeadertype.MarkHeader
            if (r0 == r1) goto L13
            return r2
        L13:
            short r0 = r3.getFlags()
            r1 = 6689(0x1a21, float:9.373E-42)
            if (r0 == r1) goto L1c
            return r2
        L1c:
            short r3 = r3.getHeaderSize(r2)
            r0 = 7
            if (r3 != r0) goto L25
            r3 = 1
            return r3
        L25:
            return r2
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
            r2 = this;
            super.print()
            ry3 r0 = r2.logger
            boolean r0 = r0.e()
            if (r0 == 0) goto L1a
            ry3 r0 = r2.logger
            boolean r2 = r2.isValid()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r1 = "valid: {}"
            r0.b(r2, r1)
        L1a:
            return
    }
}
