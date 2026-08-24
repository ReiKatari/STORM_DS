package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbte extends zbtg {
    private int zbb;
    private int zbc;
    private int zbd;

    public /* synthetic */ zbte(byte[] bArr, int i, int i2, boolean z, zbtd zbtdVar) {
        super(null);
        this.zbd = Integer.MAX_VALUE;
        this.zbb = 0;
    }

    public final int zba(int i) {
        int i2 = this.zbd;
        this.zbd = 0;
        int i3 = this.zbb + this.zbc;
        this.zbb = i3;
        if (i3 > 0) {
            this.zbc = i3;
            this.zbb = 0;
            return i2;
        }
        this.zbc = 0;
        return i2;
    }
}
