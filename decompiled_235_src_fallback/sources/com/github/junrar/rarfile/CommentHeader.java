package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommentHeader extends com.github.junrar.rarfile.BaseBlock {
    public static final short commentHeaderSize = 6;
    private final short commCRC;
    private byte unpMethod;
    private final short unpSize;
    private byte unpVersion;

    public CommentHeader(com.github.junrar.rarfile.BaseBlock r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            short r2 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r2)
            r1.unpSize = r2
            byte r2 = r1.unpVersion
            r0 = 2
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.unpVersion = r2
            byte r2 = r1.unpMethod
            r0 = 3
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.unpMethod = r2
            r2 = 4
            short r2 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r2)
            r1.commCRC = r2
            return
    }

    public short getCommCRC() {
            r0 = this;
            short r0 = r0.commCRC
            return r0
    }

    public byte getUnpMethod() {
            r0 = this;
            byte r0 = r0.unpMethod
            return r0
    }

    public short getUnpSize() {
            r0 = this;
            short r0 = r0.unpSize
            return r0
    }

    public byte getUnpVersion() {
            r0 = this;
            byte r0 = r0.unpVersion
            return r0
    }
}
