package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzbx extends com.google.android.gms.internal.mlkit_vision_text_common.zzck {
    public zzbx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            java.util.Map r0 = r0.zza()
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L30
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.util.Map r2 = r3.zza()
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzcb.zza(r2, r0)
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r2, r4)
            if (r4 == 0) goto L30
            r4 = 1
            if (r2 != 0) goto L2f
            java.util.Map r3 = r3.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzad) r3
            java.util.Map r3 = r3.zza
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzcb.zzb(r3, r0)
            if (r3 != 0) goto L2f
            return r1
        L2f:
            return r4
        L30:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            java.util.Map r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L21
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 == 0) goto L21
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r1 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r1 = (com.google.android.gms.internal.mlkit_vision_text_common.zzad) r1
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r1.zzb
            java.util.Set r1 = r1.zzo()
            java.lang.Object r2 = r2.getKey()
            boolean r1 = r1.remove(r2)
            return r1
        L21:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzck, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lc
            boolean r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzcl.zzb(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> Lc
            return r1
        La:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> Lc
        Lc:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzcl.zzc(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzck, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r7) {
            r6 = this;
            if (r7 == 0) goto La
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lc
            boolean r6 = super.retainAll(r0)     // Catch: java.lang.UnsupportedOperationException -> Lc
            return r6
        La:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> Lc
        Lc:
            int r0 = r7.size()
            java.util.HashSet r1 = new java.util.HashSet
            r2 = 3
            if (r0 >= r2) goto L1d
            java.lang.String r2 = "expectedSize"
            com.google.android.gms.internal.mlkit_vision_text_common.zzaq.zza(r0, r2)
            int r0 = r0 + 1
            goto L2e
        L1d:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r2) goto L2b
            double r2 = (double) r0
            r4 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            goto L2e
        L2b:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L2e:
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L35:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r7.next()
            boolean r2 = r6.contains(r0)
            if (r2 == 0) goto L35
            boolean r2 = r0 instanceof java.util.Map.Entry
            if (r2 == 0) goto L35
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            r1.add(r0)
            goto L35
        L53:
            java.util.Map r6 = r6.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r6 = (com.google.android.gms.internal.mlkit_vision_text_common.zzad) r6
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r6 = r6.zzb
            java.util.Set r6 = r6.zzo()
            boolean r6 = r6.retainAll(r1)
            return r6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            java.util.Map r0 = r0.zza()
            int r0 = r0.size()
            return r0
    }

    public abstract java.util.Map zza();
}
