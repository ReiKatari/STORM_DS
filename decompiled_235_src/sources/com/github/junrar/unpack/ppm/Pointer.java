package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Pointer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected byte[] mem;
    protected int pos;

    public Pointer(byte[] bArr) {
        this.mem = bArr;
    }

    public int getAddress() {
        return this.pos;
    }

    public void setAddress(int i) {
        this.pos = i;
    }
}
