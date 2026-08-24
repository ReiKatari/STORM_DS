package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzes {
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzou zza;
    private final java.lang.Boolean zzb;
    private final java.lang.Boolean zzc;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzod zzd;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzsd zze;

    public /* synthetic */ zzes(com.google.android.gms.internal.mlkit_vision_text_common.zzeq r2, com.google.android.gms.internal.mlkit_vision_text_common.zzer r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzeq.zze(r2)
            r1.zza = r3
            r3 = 0
            r1.zzb = r3
            java.lang.Boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzeq.zzg(r2)
            r1.zzc = r0
            r1.zzd = r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzeq.zzf(r2)
            r1.zze = r2
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzes
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_text_common.zzes r6 = (com.google.android.gms.internal.mlkit_vision_text_common.zzes) r6
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r1 = r5.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r3 = r6.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L38
            r1 = 0
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r3 == 0) goto L38
            java.lang.Boolean r3 = r5.zzc
            java.lang.Boolean r4 = r6.zzc
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L38
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r1 == 0) goto L38
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r5 = r5.zze
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r6 = r6.zze
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r6)
            if (r5 == 0) goto L38
            return r0
        L38:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r0 = r3.zza
            java.lang.Boolean r1 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r3 = r3.zze
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r2, r1, r2, r3}
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzou zza() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r0 = r0.zza
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzsd zzb() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r0 = r0.zze
            return r0
    }

    public final java.lang.Boolean zzc() {
            r0 = this;
            java.lang.Boolean r0 = r0.zzc
            return r0
    }
}
