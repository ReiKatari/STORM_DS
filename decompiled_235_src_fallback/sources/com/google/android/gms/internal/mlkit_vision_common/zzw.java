package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzw extends com.google.android.gms.internal.mlkit_vision_common.zzs {
    private final transient com.google.android.gms.internal.mlkit_vision_common.zzr zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    public zzw(com.google.android.gms.internal.mlkit_vision_common.zzr r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    public static /* synthetic */ int zzh(com.google.android.gms.internal.mlkit_vision_common.zzw r0) {
            int r0 = r0.zzc
            return r0
    }

    public static /* synthetic */ java.lang.Object[] zzi(com.google.android.gms.internal.mlkit_vision_common.zzw r0) {
            java.lang.Object[] r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_common.zzr r2 = r2.zza
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = r1.zzf()
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_common.zzac r1 = r1.zzk(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(java.lang.Object[] r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = r0.zzf()
            r2 = 0
            int r0 = r0.zza(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    public final com.google.android.gms.internal.mlkit_vision_common.zzab zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = r1.zzf()
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_common.zzac r1 = r1.zzk(r0)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs
    public final com.google.android.gms.internal.mlkit_vision_common.zzp zzg() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzv r0 = new com.google.android.gms.internal.mlkit_vision_common.zzv
            r0.<init>(r1)
            return r0
    }
}
