package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zzx {
    private static final com.google.android.gms.common.zzx zze = null;
    final boolean zza;
    final java.lang.String zzb;
    final java.lang.Throwable zzc;
    final int zzd;

    static {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r4 = 0
            r5 = 0
            r1 = 1
            r2 = 3
            r3 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.zzx.zze = r0
            return
    }

    private zzx(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r2
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    public /* synthetic */ zzx(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5, com.google.android.gms.common.zzw r6) {
            r0 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 1
            r3 = 5
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public static com.google.android.gms.common.zzx zzb() {
            com.google.android.gms.common.zzx r0 = com.google.android.gms.common.zzx.zze
            return r0
    }

    public static com.google.android.gms.common.zzx zzc(java.lang.String r6) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r3 = 5
            r5 = 0
            r1 = 0
            r2 = 1
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.gms.common.zzx zzd(java.lang.String r6, java.lang.Throwable r7) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r2 = 1
            r3 = 5
            r1 = 0
            r4 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.gms.common.zzx zzf(int r6) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r4 = 0
            r5 = 0
            r1 = 1
            r3 = 1
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.gms.common.zzx zzg(int r6, int r7, java.lang.String r8, java.lang.Throwable r9) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r1 = 0
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public java.lang.String zza() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    public final void zze() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L22
            r0 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Throwable r0 = r2.zzc
            if (r0 == 0) goto L1b
            java.lang.String r0 = r2.zza()
            java.lang.Throwable r2 = r2.zzc
            android.util.Log.d(r1, r0, r2)
            return
        L1b:
            java.lang.String r2 = r2.zza()
            android.util.Log.d(r1, r2)
        L22:
            return
    }
}
