package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzai implements java.util.Map, java.io.Serializable {
    private transient com.google.android.gms.internal.mlkit_common.zzaj zza;
    private transient com.google.android.gms.internal.mlkit_common.zzaj zzb;
    private transient com.google.android.gms.internal.mlkit_common.zzab zzc;

    public zzai() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzai zzc(java.lang.Object r1, java.lang.Object r2) {
            java.lang.String r1 = "optional-module-barcode"
            java.lang.String r2 = "com.google.android.gms.vision.barcode"
            com.google.android.gms.internal.mlkit_common.zzw.zza(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            r2 = 0
            r0 = 1
            com.google.android.gms.internal.mlkit_common.zzaq r1 = com.google.android.gms.internal.mlkit_common.zzaq.zzg(r0, r1, r2)
            return r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r0.zzb()
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r0.zzf()
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r1 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object r1);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r0.zzf()
            int r0 = com.google.android.gms.internal.mlkit_common.zzar.zza(r0)
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzb
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zze()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.size()
            if (r0 < 0) goto L57
            long r0 = (long) r0
            r2 = 8
            long r0 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = java.lang.Math.min(r0, r3)
            int r0 = (int) r0
            r2.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 1
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r0 != 0) goto L38
            java.lang.String r0 = ", "
            r2.append(r0)
        L38:
            java.lang.Object r0 = r1.getKey()
            r2.append(r0)
            r0 = 61
            r2.append(r0)
            java.lang.Object r0 = r1.getValue()
            r2.append(r0)
            r0 = 0
            goto L25
        L4d:
            r5 = 125(0x7d, float:1.75E-43)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
        L57:
            java.lang.String r5 = "size cannot be negative but was: "
            java.lang.String r5 = defpackage.lb1.g(r0, r5)
            defpackage.i.h(r5)
            r5 = 0
            return r5
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r0.zzb()
            return r0
    }

    public abstract com.google.android.gms.internal.mlkit_common.zzab zza();

    public final com.google.android.gms.internal.mlkit_common.zzab zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zzc
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzab r0 = r1.zza()
            r1.zzc = r0
        La:
            return r0
    }

    public abstract com.google.android.gms.internal.mlkit_common.zzaj zzd();

    public abstract com.google.android.gms.internal.mlkit_common.zzaj zze();

    public final com.google.android.gms.internal.mlkit_common.zzaj zzf() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.mlkit_common.zzaj r0 = r1.zzd()
            r1.zza = r0
        La:
            return r0
    }
}
