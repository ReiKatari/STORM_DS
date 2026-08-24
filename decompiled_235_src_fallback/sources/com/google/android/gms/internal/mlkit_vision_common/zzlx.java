package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zzlx implements java.io.Closeable {
    private static final java.util.Map zza = null;
    private final java.lang.String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_common.zzlx.zza = r0
            return
    }

    private zzlx(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2.zzg = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.zzh = r0
            r2.zzb = r3
            return
    }

    public /* synthetic */ zzlx(java.lang.String r1, com.google.android.gms.internal.mlkit_vision_common.zzlw r2) {
            r0 = this;
            java.lang.String r1 = "unusedTag"
            r0.<init>(r1)
            return
    }

    private final void zza() {
            r2 = this;
            r0 = 0
            r2.zzc = r0
            r0 = 0
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2.zzg = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.zzh = r0
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzlx zze(java.lang.String r2) {
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
            boolean r2 = com.google.android.gms.internal.mlkit_vision_common.zzmw.zzb()
            if (r2 != 0) goto Le
            com.google.android.gms.internal.mlkit_vision_common.zzlv r2 = com.google.android.gms.internal.mlkit_vision_common.zzlv.zza()
            return r2
        Le:
            java.util.Map r2 = com.google.android.gms.internal.mlkit_vision_common.zzlx.zza
            java.lang.String r0 = "detectorTaskWithResource#run"
            java.lang.Object r1 = r2.get(r0)
            if (r1 != 0) goto L20
            com.google.android.gms.internal.mlkit_vision_common.zzlx r1 = new com.google.android.gms.internal.mlkit_vision_common.zzlx
            r1.<init>(r0)
            r2.put(r0, r1)
        L20:
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzlx r2 = (com.google.android.gms.internal.mlkit_vision_common.zzlx) r2
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            long r0 = r4.zze
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lc
            r4.zzd(r0)
            return
        Lc:
            java.lang.String r4 = "Did you forget to call start()?"
            defpackage.i.m(r4)
            return
    }

    public com.google.android.gms.internal.mlkit_vision_common.zzlx zzb() {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4.zze = r0
            return r4
    }

    public void zzc(long r7) {
            r6 = this;
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r6.zzf
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1b
            long r2 = r0 - r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L1b
            r6.zza()
        L1b:
            r6.zzf = r0
            int r0 = r6.zzc
            int r0 = r0 + 1
            r6.zzc = r0
            double r0 = r6.zzd
            double r2 = (double) r7
            double r0 = r0 + r2
            r6.zzd = r0
            long r0 = r6.zzg
            long r0 = java.lang.Math.min(r0, r7)
            r6.zzg = r0
            long r0 = r6.zzh
            long r7 = java.lang.Math.max(r0, r7)
            r6.zzh = r7
            int r7 = r6.zzc
            int r7 = r7 % 50
            if (r7 != 0) goto L44
            java.util.Locale r7 = java.util.Locale.US
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
        L44:
            int r7 = r6.zzc
            int r7 = r7 % 500
            if (r7 != 0) goto L4d
            r6.zza()
        L4d:
            return
    }

    public void zzd(long r5) {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r0 = r0 - r5
            r4.zzc(r0)
            return
    }
}
