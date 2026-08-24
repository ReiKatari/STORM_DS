package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbkw extends zbkx {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbkx zbc;

    public zbkw(zbkx zbkxVar, int i, int i2) {
        this.zbc = zbkxVar;
        this.zba = i;
        this.zbb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zbkj.zba(i, this.zbb, "index");
        return this.zbc.get(i + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final Object[] zbe() {
        return this.zbc.zbe();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, java.util.List
    /* renamed from: zbf */
    public final zbkx subList(int i, int i2) {
        zbkj.zbd(i, i2, this.zbb);
        int i3 = this.zba;
        return this.zbc.subList(i + i3, i2 + i3);
    }
}
