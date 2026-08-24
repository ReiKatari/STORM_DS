package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BitInput {
    public static final int MAX_SIZE = 32768;
    protected int inAddr;
    protected int inBit;
    protected byte[] inBuf;

    public BitInput() {
            r1 = this;
            r1.<init>()
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]
            r1.inBuf = r0
            return
    }

    public void InitBitInput() {
            r1 = this;
            r0 = 0
            r1.inAddr = r0
            r1.inBit = r0
            return
    }

    public boolean Overflow(int r1) {
            r0 = this;
            int r0 = r0.inAddr
            int r0 = r0 + r1
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void addbits(int r3) {
            r2 = this;
            int r0 = r2.inBit
            int r3 = r3 + r0
            int r0 = r2.inAddr
            int r1 = r3 >>> 3
            int r0 = r0 + r1
            r2.inAddr = r0
            r3 = r3 & 7
            r2.inBit = r3
            return
    }

    public void faddbits(int r1) {
            r0 = this;
            r0.addbits(r1)
            return
    }

    public int fgetbits() {
            r0 = this;
            int r0 = r0.getbits()
            return r0
    }

    public byte[] getInBuf() {
            r0 = this;
            byte[] r0 = r0.inBuf
            return r0
    }

    public int getbits() {
            r4 = this;
            byte[] r0 = r4.inBuf
            int r1 = r4.inAddr
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r2 = r2 + r3
            int r1 = r1 + 2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            int r4 = r4.inBit
            int r4 = 8 - r4
            int r4 = r2 >>> r4
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            return r4
    }
}
