package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbkw extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zbc;

    public zbkw(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1, int r2, int r3) {
            r0 = this;
            r0.zbc = r1
            r0.<init>()
            r0.zba = r2
            r0.zbb = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zbb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkj.zba(r3, r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r2.zbc
            int r2 = r2.zba
            int r3 = r3 + r2
            java.lang.Object r2 = r0.get(r3)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zbb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r0.zbf(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r2.zbc
            int r0 = r0.zbc()
            int r1 = r2.zba
            int r0 = r0 + r1
            int r2 = r2.zbb
            int r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r1.zbc
            int r0 = r0.zbc()
            int r1 = r1.zba
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final java.lang.Object[] zbe() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r0.zbc
            java.lang.Object[] r0 = r0.zbe()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zbf(int r2, int r3) {
            r1 = this;
            int r0 = r1.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkj.zbd(r2, r3, r0)
            int r0 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = r1.zbc
            int r2 = r2 + r0
            int r3 = r3 + r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = r1.zbf(r2, r3)
            return r1
    }
}
