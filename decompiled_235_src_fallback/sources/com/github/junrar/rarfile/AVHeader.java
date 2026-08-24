package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AVHeader extends com.github.junrar.rarfile.BaseBlock {
    public static final int avHeaderSize = 7;
    private final int avInfoCRC;
    private byte avVersion;
    private byte method;
    private byte unpackVersion;

    public AVHeader(com.github.junrar.rarfile.BaseBlock r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            byte r2 = r1.unpackVersion
            r0 = 0
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.unpackVersion = r2
            byte r2 = r1.method
            r0 = 1
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.method = r2
            byte r2 = r1.avVersion
            r0 = 2
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.avVersion = r2
            r2 = 3
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r3, r2)
            r1.avInfoCRC = r2
            return
    }

    public int getAvInfoCRC() {
            r0 = this;
            int r0 = r0.avInfoCRC
            return r0
    }

    public byte getAvVersion() {
            r0 = this;
            byte r0 = r0.avVersion
            return r0
    }

    public byte getMethod() {
            r0 = this;
            byte r0 = r0.method
            return r0
    }

    public byte getUnpackVersion() {
            r0 = this;
            byte r0 = r0.unpackVersion
            return r0
    }
}
