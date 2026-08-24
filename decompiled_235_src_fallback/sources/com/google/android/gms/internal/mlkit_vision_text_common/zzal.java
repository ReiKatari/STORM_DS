package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzal extends com.google.android.gms.internal.mlkit_vision_text_common.zzan implements java.io.Serializable {
    private transient java.util.Map zza;
    private transient int zzb;

    public zzal(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            r1.zza = r2
            return
        Lc:
            defpackage.u34.t()
            r1 = 0
            throw r1
    }

    public static /* bridge */ /* synthetic */ int zzd(com.google.android.gms.internal.mlkit_vision_text_common.zzal r0) {
            int r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zzg(com.google.android.gms.internal.mlkit_vision_text_common.zzal r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.mlkit_vision_text_common.zzal r0, int r1) {
            r0.zzb = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.mlkit_vision_text_common.zzal r1, java.lang.Object r2) {
            java.util.Map r0 = r1.zza
            r0.getClass()
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r2 = 0
        Lb:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L1b
            int r0 = r2.size()
            r2.clear()
            int r2 = r1.zzb
            int r2 = r2 - r0
            r1.zzb = r2
        L1b:
            return
    }

    public abstract java.util.Collection zza();

    public java.util.Collection zzb(java.lang.Object r1, java.util.Collection r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final java.util.Collection zze(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r0 = r0.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Le
            java.util.Collection r0 = r1.zza()
        Le:
            java.util.Collection r1 = r1.zzb(r2, r0)
            return r1
    }

    public final java.util.List zzf(java.lang.Object r2, java.util.List r3, com.google.android.gms.internal.mlkit_vision_text_common.zzai r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.android.gms.internal.mlkit_vision_text_common.zzag r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzag
            r0.<init>(r1, r2, r3, r4)
            return r0
        La:
            com.google.android.gms.internal.mlkit_vision_text_common.zzak r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzak
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final java.util.Map zzh() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzad
            java.util.Map r1 = r2.zza
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final java.util.Set zzi() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzaf r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzaf
            java.util.Map r1 = r2.zza
            r0.<init>(r2, r1)
            return r0
    }

    public final void zzl() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map r0 = r2.zza
            r0.clear()
            r0 = 0
            r2.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan, com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final boolean zzm(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            if (r0 != 0) goto L28
            java.util.Collection r0 = r2.zza()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L20
            int r4 = r2.zzb
            int r4 = r4 + r1
            r2.zzb = r4
            java.util.Map r2 = r2.zza
            r2.put(r3, r0)
            return r1
        L20:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "New Collection violated the Collection spec"
            r2.<init>(r3)
            throw r2
        L28:
            boolean r3 = r0.add(r4)
            if (r3 == 0) goto L34
            int r3 = r2.zzb
            int r3 = r3 + r1
            r2.zzb = r3
            return r1
        L34:
            r2 = 0
            return r2
    }
}
