package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbld extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx {
    static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zba = null;
    final transient java.lang.Object[] zbb;
    private final transient int zbc;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbld r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbld
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbld.zba = r0
            return
    }

    public zbld(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zbb = r1
            r0.zbc = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zbc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkj.zba(r3, r0, r1)
            java.lang.Object[] r2 = r2.zbb
            r2 = r2[r3]
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zbc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zba(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zbb
            r0 = 0
            int r1 = r2.zbc
            java.lang.System.arraycopy(r4, r0, r3, r0, r1)
            int r2 = r2.zbc
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
            r0 = this;
            int r0 = r0.zbc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final java.lang.Object[] zbe() {
            r0 = this;
            java.lang.Object[] r0 = r0.zbb
            return r0
    }
}
