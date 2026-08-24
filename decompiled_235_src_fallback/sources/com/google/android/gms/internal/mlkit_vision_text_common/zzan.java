package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzan implements com.google.android.gms.internal.mlkit_vision_text_common.zzcc {
    private transient java.util.Set zza;
    private transient java.util.Map zzb;

    public zzan() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzcc
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            com.google.android.gms.internal.mlkit_vision_text_common.zzcc r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzcc) r2
            java.util.Map r1 = r1.zzn()
            java.util.Map r2 = r2.zzn()
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.zzn()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.Map r0 = r0.zzn()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract java.util.Map zzh();

    public abstract java.util.Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public boolean zzm(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final java.util.Map zzn() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            if (r0 != 0) goto La
            java.util.Map r0 = r1.zzh()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final java.util.Set zzo() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zzi()
            r1.zza = r0
        La:
            return r0
    }
}
