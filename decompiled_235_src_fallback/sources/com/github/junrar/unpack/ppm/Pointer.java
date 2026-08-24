package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Pointer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected byte[] mem;
    protected int pos;

    public Pointer(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.mem = r1
            return
    }

    public int getAddress() {
            r0 = this;
            int r0 = r0.pos
            return r0
    }

    public void setAddress(int r1) {
            r0 = this;
            r0.pos = r1
            return
    }
}
