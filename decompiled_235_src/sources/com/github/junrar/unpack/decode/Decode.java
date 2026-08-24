package com.github.junrar.unpack.decode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Decode {
    private int maxNum;
    private final int[] decodeLen = new int[16];
    private final int[] decodePos = new int[16];
    protected int[] decodeNum = new int[2];

    public int[] getDecodeLen() {
        return this.decodeLen;
    }

    public int[] getDecodeNum() {
        return this.decodeNum;
    }

    public int[] getDecodePos() {
        return this.decodePos;
    }

    public int getMaxNum() {
        return this.maxNum;
    }

    public void setMaxNum(int i) {
        this.maxNum = i;
    }
}
