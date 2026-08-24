package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbsu extends zbsv {
    final /* synthetic */ zbtc zba;
    private int zbb = 0;
    private final int zbc;

    public zbsu(zbtc zbtcVar) {
        this.zba = zbtcVar;
        this.zbc = zbtcVar.zbd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zbb < this.zbc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsx
    public final byte zba() {
        int i = this.zbb;
        if (i < this.zbc) {
            this.zbb = i + 1;
            return this.zba.zbb(i);
        }
        fa6.c();
        return (byte) 0;
    }
}
