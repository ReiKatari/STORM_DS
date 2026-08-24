package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EndArcHeader extends com.github.junrar.rarfile.BaseBlock {
    public static final short endArcArchiveDataCrcSize = 4;
    public static final short endArcVolumeNumberSize = 2;
    private int archiveDataCRC;
    private short volumeNumber;

    public EndArcHeader(com.github.junrar.rarfile.BaseBlock r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            boolean r2 = r1.hasArchiveDataCRC()
            r0 = 0
            if (r2 == 0) goto L11
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r3, r0)
            r1.archiveDataCRC = r2
            r0 = 4
        L11:
            boolean r2 = r1.hasVolumeNumber()
            if (r2 == 0) goto L1d
            short r2 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r0)
            r1.volumeNumber = r2
        L1d:
            return
    }

    public int getArchiveDataCRC() {
            r0 = this;
            int r0 = r0.archiveDataCRC
            return r0
    }

    public short getVolumeNumber() {
            r0 = this;
            short r0 = r0.volumeNumber
            return r0
    }

    public boolean isValid() {
            r3 = this;
            short r0 = r3.getHeadCRC()
            r1 = 15812(0x3dc4, float:2.2157E-41)
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            com.github.junrar.rarfile.UnrarHeadertype r0 = r3.getHeaderType()
            com.github.junrar.rarfile.UnrarHeadertype r1 = com.github.junrar.rarfile.UnrarHeadertype.EndArcHeader
            if (r0 == r1) goto L13
            return r2
        L13:
            short r0 = r3.getFlags()
            r1 = 16384(0x4000, float:2.2959E-41)
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
}
