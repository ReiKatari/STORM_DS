package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbld extends zbkx {
    static final zbkx zba = new zbld(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    public zbld(Object[] objArr, int i) {
        this.zbb = objArr;
        this.zbc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zbkj.zba(i, this.zbc, "index");
        Object obj = this.zbb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zba(Object[] objArr, int i) {
        System.arraycopy(this.zbb, 0, objArr, 0, this.zbc);
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final Object[] zbe() {
        return this.zbb;
    }
}
