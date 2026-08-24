package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzao extends com.google.android.gms.internal.mlkit_common.zzaj {
    private final transient com.google.android.gms.internal.mlkit_common.zzai zza;
    private final transient com.google.android.gms.internal.mlkit_common.zzaf zzb;

    public zzao(com.google.android.gms.internal.mlkit_common.zzai r1, com.google.android.gms.internal.mlkit_common.zzaf r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzai r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r1 = r1.zzb
            r0 = 0
            com.google.android.gms.internal.mlkit_common.zzat r1 = r1.zzj(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzai r0 = r0.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(java.lang.Object[] r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r0.zzb
            r2 = 0
            int r0 = r0.zza(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    public final com.google.android.gms.internal.mlkit_common.zzas zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r1 = r1.zzb
            r0 = 0
            com.google.android.gms.internal.mlkit_common.zzat r1 = r1.zzj(r0)
            return r1
    }
}
