package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zznh {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.mlkit_common.zznf zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.mlkit_common.zzne zzf;
    private final java.lang.Long zzg;
    private final java.lang.Boolean zzh;
    private final java.lang.Boolean zzi;

    public /* synthetic */ zznh(com.google.android.gms.internal.mlkit_common.zznd r2, com.google.android.gms.internal.mlkit_common.zzng r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r3 = com.google.android.gms.internal.mlkit_common.zznd.zzi(r2)
            r1.zza = r3
            r3 = 0
            r1.zzb = r3
            com.google.android.gms.internal.mlkit_common.zznf r0 = com.google.android.gms.internal.mlkit_common.zznd.zzf(r2)
            r1.zzc = r0
            r1.zzd = r3
            java.lang.String r0 = com.google.android.gms.internal.mlkit_common.zznd.zzh(r2)
            r1.zze = r0
            com.google.android.gms.internal.mlkit_common.zzne r2 = com.google.android.gms.internal.mlkit_common.zznd.zze(r2)
            r1.zzf = r2
            r1.zzg = r3
            r1.zzh = r3
            r1.zzi = r3
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_common.zznh
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_common.zznh r6 = (com.google.android.gms.internal.mlkit_common.zznh) r6
            java.lang.String r1 = r5.zza
            java.lang.String r3 = r6.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L54
            r1 = 0
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r3 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zznf r3 = r5.zzc
            com.google.android.gms.internal.mlkit_common.zznf r4 = r6.zzc
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L54
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r3 == 0) goto L54
            java.lang.String r3 = r5.zze
            java.lang.String r4 = r6.zze
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zzne r5 = r5.zzf
            com.google.android.gms.internal.mlkit_common.zzne r6 = r6.zzf
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r6)
            if (r5 == 0) goto L54
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r5 == 0) goto L54
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r5 == 0) goto L54
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
            if (r5 == 0) goto L54
            return r0
        L54:
            return r2
    }

    public final int hashCode() {
            r9 = this;
            java.lang.String r0 = r9.zza
            com.google.android.gms.internal.mlkit_common.zznf r2 = r9.zzc
            java.lang.String r4 = r9.zze
            com.google.android.gms.internal.mlkit_common.zzne r5 = r9.zzf
            r7 = 0
            r8 = 0
            r1 = 0
            r3 = 0
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            int r9 = com.google.android.gms.common.internal.Objects.hashCode(r9)
            return r9
    }

    public final com.google.android.gms.internal.mlkit_common.zzne zza() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzne r0 = r0.zzf
            return r0
    }

    public final com.google.android.gms.internal.mlkit_common.zznf zzb() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zznf r0 = r0.zzc
            return r0
    }

    public final java.lang.String zzc() {
            r0 = this;
            java.lang.String r0 = r0.zze
            return r0
    }

    public final java.lang.String zzd() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }
}
