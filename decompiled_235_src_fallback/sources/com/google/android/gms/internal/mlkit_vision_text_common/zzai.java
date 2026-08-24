package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zzai extends java.util.AbstractCollection {
    final java.lang.Object zza;
    java.util.Collection zzb;
    final com.google.android.gms.internal.mlkit_vision_text_common.zzai zzc;
    final java.util.Collection zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzal zze;

    public zzai(com.google.android.gms.internal.mlkit_vision_text_common.zzal r1, java.lang.Object r2, java.util.Collection r3, com.google.android.gms.internal.mlkit_vision_text_common.zzai r4) {
            r0 = this;
            r0.zze = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            if (r4 != 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            java.util.Collection r1 = r4.zzb
        L11:
            r0.zzd = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r5) {
            r4 = this;
            r4.zzb()
            java.util.Collection r0 = r4.zzb
            boolean r0 = r0.isEmpty()
            java.util.Collection r1 = r4.zzb
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L22
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r4.zze
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r1)
            r3 = 1
            int r2 = r2 + r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r1, r2)
            if (r0 == 0) goto L22
            r4.zza()
            return r3
        L22:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r4.size()
            java.util.Collection r1 = r4.zzb
            boolean r5 = r1.addAll(r5)
            if (r5 == 0) goto L2c
            java.util.Collection r1 = r4.zzb
            int r1 = r1.size()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r2 = r4.zze
            int r1 = r1 - r0
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r2)
            int r3 = r3 + r1
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r2, r3)
            if (r0 != 0) goto L2c
            r4.zza()
            r4 = 1
            return r4
        L2c:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Collection r1 = r3.zzb
            r1.clear()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r3.zze
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r1)
            int r2 = r2 - r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r1, r2)
            r3.zzc()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r0 = 1
            return r0
        L4:
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // java.util.Collection
    public final int hashCode() {
            r0 = this;
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            r1.zzb()
            com.google.android.gms.internal.mlkit_vision_text_common.zzah r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzah
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            r2.zzb()
            java.util.Collection r0 = r2.zzb
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r2.zze
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r0)
            int r1 = r1 + (-1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r0, r1)
            r2.zzc()
        L19:
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            int r0 = r3.size()
            java.util.Collection r1 = r3.zzb
            boolean r4 = r1.removeAll(r4)
            if (r4 == 0) goto L28
            java.util.Collection r1 = r3.zzb
            int r1 = r1.size()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r2 = r3.zze
            int r1 = r1 - r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r2)
            int r0 = r0 + r1
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r2, r0)
            r3.zzc()
        L28:
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.size()
            java.util.Collection r1 = r3.zzb
            boolean r4 = r1.retainAll(r4)
            if (r4 == 0) goto L23
            java.util.Collection r1 = r3.zzb
            int r1 = r1.size()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r2 = r3.zze
            int r1 = r1 - r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r2)
            int r0 = r0 + r1
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r2, r0)
            r3.zzc()
        L23:
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r0 = this;
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r0 = this;
            r0.zzb()
            java.util.Collection r0 = r0.zzb
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r2.zzc
            if (r0 == 0) goto L8
            r0.zza()
            return
        L8:
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r2.zze
            java.lang.Object r1 = r2.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzg(r0)
            java.util.Collection r2 = r2.zzb
            r0.put(r1, r2)
            return
    }

    public final void zzb() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r2.zzc
            if (r0 == 0) goto L14
            r0.zzb()
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r2.zzc
            java.util.Collection r2 = r2.zzd
            java.util.Collection r0 = r0.zzb
            if (r0 != r2) goto L10
            goto L2e
        L10:
            defpackage.i.l()
            return
        L14:
            java.util.Collection r0 = r2.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r2.zze
            java.lang.Object r1 = r2.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzg(r0)
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L2e
            r2.zzb = r0
        L2e:
            return
    }

    public final void zzc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r1.zzc
            if (r0 == 0) goto L8
            r0.zzc()
            return
        L8:
            java.util.Collection r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r1.zze
            java.lang.Object r1 = r1.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzg(r0)
            r0.remove(r1)
        L1b:
            return
    }
}
