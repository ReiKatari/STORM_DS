package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zznl {
    private final com.google.android.gms.internal.mlkit_common.zznh zza;
    private final com.google.android.gms.internal.mlkit_common.zznj zzb;
    private final com.google.android.gms.internal.mlkit_common.zznj zzc;
    private final java.lang.Boolean zzd;

    public /* synthetic */ zznl(com.google.android.gms.internal.mlkit_common.zzni r1, com.google.android.gms.internal.mlkit_common.zznk r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zznh r1 = com.google.android.gms.internal.mlkit_common.zzni.zza(r1)
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_common.zznl
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_common.zznl r4 = (com.google.android.gms.internal.mlkit_common.zznl) r4
            com.google.android.gms.internal.mlkit_common.zznh r3 = r3.zza
            com.google.android.gms.internal.mlkit_common.zznh r4 = r4.zza
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L2a
            r3 = 0
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r3, r3)
            if (r4 == 0) goto L2a
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r3, r3)
            if (r4 == 0) goto L2a
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r3)
            if (r3 == 0) goto L2a
            return r0
        L2a:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zznh r1 = r1.zza
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r0, r0}
            int r1 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_common.zznh zza() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zznh r0 = r0.zza
            return r0
    }
}
