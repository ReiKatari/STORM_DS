package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SignHeader extends com.github.junrar.rarfile.BaseBlock {
    public static final short signHeaderSize = 8;
    private short arcNameSize;
    private int creationTime;
    private short userNameSize;

    public SignHeader(com.github.junrar.rarfile.BaseBlock r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.creationTime = r1
            r0.arcNameSize = r1
            r0.userNameSize = r1
            int r1 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r1)
            r0.creationTime = r1
            r1 = 4
            short r1 = com.github.junrar.io.Raw.readShortLittleEndian(r2, r1)
            r0.arcNameSize = r1
            r1 = 6
            short r1 = com.github.junrar.io.Raw.readShortLittleEndian(r2, r1)
            r0.userNameSize = r1
            return
    }

    public short getArcNameSize() {
            r0 = this;
            short r0 = r0.arcNameSize
            return r0
    }

    public int getCreationTime() {
            r0 = this;
            int r0 = r0.creationTime
            return r0
    }

    public short getUserNameSize() {
            r0 = this;
            short r0 = r0.userNameSize
            return r0
    }
}
