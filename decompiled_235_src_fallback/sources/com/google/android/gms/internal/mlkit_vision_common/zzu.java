package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzu extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    static final com.google.android.gms.internal.mlkit_vision_common.zzp zza = null;
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzu r0 = new com.google.android.gms.internal.mlkit_vision_common.zzu
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzu.zza = r0
            return
    }

    public zzu(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_common.zzf.zza(r3, r0, r1)
            java.lang.Object[] r2 = r2.zzb
            r2 = r2[r3]
            r2.getClass()
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zzb
            r0 = 0
            int r1 = r2.zzc
            java.lang.System.arraycopy(r4, r0, r3, r0, r1)
            int r2 = r2.zzc
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzb() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzc() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final java.lang.Object[] zze() {
            r0 = this;
            java.lang.Object[] r0 = r0.zzb
            return r0
    }
}
