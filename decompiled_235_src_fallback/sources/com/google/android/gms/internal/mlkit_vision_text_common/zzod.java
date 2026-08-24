package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzod {
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzob zza;
    private final java.lang.Integer zzb;
    private final java.lang.Integer zzc;
    private final java.lang.Boolean zzd;

    public /* synthetic */ zzod(com.google.android.gms.internal.mlkit_vision_text_common.zzoa r1, com.google.android.gms.internal.mlkit_vision_text_common.zzoc r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzoa.zzc(r1)
            r0.zza = r2
            java.lang.Integer r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzoa.zze(r1)
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzod
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_text_common.zzod r5 = (com.google.android.gms.internal.mlkit_vision_text_common.zzod) r5
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r1 = r4.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r3 = r5.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2e
            java.lang.Integer r4 = r4.zzb
            java.lang.Integer r5 = r5.zzb
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L2e
            r4 = 0
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r5 == 0) goto L2e
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r4 == 0) goto L2e
            return r0
        L2e:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r0 = r2.zza
            java.lang.Integer r2 = r2.zzb
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r1, r1}
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzob zza() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r0 = r0.zza
            return r0
    }

    public final java.lang.Integer zzb() {
            r0 = this;
            java.lang.Integer r0 = r0.zzb
            return r0
    }
}
