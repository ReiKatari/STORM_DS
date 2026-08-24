package com.github.junrar.unpack.decode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Decode {
    private final int[] decodeLen;
    protected int[] decodeNum;
    private final int[] decodePos;
    private int maxNum;

    public Decode() {
            r2 = this;
            r2.<init>()
            r0 = 16
            int[] r1 = new int[r0]
            r2.decodeLen = r1
            int[] r0 = new int[r0]
            r2.decodePos = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2.decodeNum = r0
            return
    }

    public int[] getDecodeLen() {
            r0 = this;
            int[] r0 = r0.decodeLen
            return r0
    }

    public int[] getDecodeNum() {
            r0 = this;
            int[] r0 = r0.decodeNum
            return r0
    }

    public int[] getDecodePos() {
            r0 = this;
            int[] r0 = r0.decodePos
            return r0
    }

    public int getMaxNum() {
            r0 = this;
            int r0 = r0.maxNum
            return r0
    }

    public void setMaxNum(int r1) {
            r0 = this;
            r0.maxNum = r1
            return
    }
}
