package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzz {
    private java.lang.String zza;
    private long zzb;
    private defpackage.s28 zzc;
    private defpackage.s28 zzd;

    public zzz() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r0 = -1
            r2.zzb = r0
            q28 r0 = defpackage.s28.B
            t28 r0 = defpackage.t28.X
            r2.zzc = r0
            r2.zzd = r0
            return
    }

    public final com.google.android.gms.common.zzz zza(long r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.common.zzz zzb(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            s28 r1 = defpackage.s28.j(r1)
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.common.zzz zzc(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            s28 r1 = defpackage.s28.j(r1)
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.common.zzz zzd(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.common.zzab zze() {
            r7 = this;
            java.lang.String r0 = r7.zza
            if (r0 == 0) goto L39
            long r0 = r7.zzb
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            s28 r0 = r7.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
            s28 r0 = r7.zzd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            goto L24
        L1d:
            java.lang.String r7 = "Either orderedTestCerts or orderedProdCerts must have at least one cert"
            defpackage.i.m(r7)
        L22:
            r7 = 0
            return r7
        L24:
            com.google.android.gms.common.zzab r0 = new com.google.android.gms.common.zzab
            java.lang.String r1 = r7.zza
            long r2 = r7.zzb
            s28 r4 = r7.zzc
            s28 r5 = r7.zzd
            r6 = 0
            r0.<init>(r1, r2, r4, r5, r6)
            return r0
        L33:
            java.lang.String r7 = "minimumStampedVersionNumber must be greater than or equal to 0"
            defpackage.i.m(r7)
            goto L22
        L39:
            java.lang.String r7 = "packageName must be defined"
            defpackage.i.m(r7)
            goto L22
    }
}
