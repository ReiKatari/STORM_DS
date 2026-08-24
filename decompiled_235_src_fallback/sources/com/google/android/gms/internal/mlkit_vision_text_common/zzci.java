package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzci extends com.google.android.gms.internal.mlkit_vision_text_common.zzbk {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzci(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r1 = 1
            r0.zzc = r1
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zza(r3, r0, r1)
            java.lang.Object[] r0 = r2.zza
            int r3 = r3 + r3
            int r2 = r2.zzb
            int r3 = r3 + r2
            r2 = r0[r3]
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }
}
