package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GmsLogger {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public GmsLogger(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GmsLogger(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "log tag cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            int r0 = r4.length()
            r1 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            if (r0 > r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.String r1 = "tag \"%s\" is longer than the %d character maximum"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1, r2)
            r3.zza = r4
            r4 = 0
            if (r5 == 0) goto L2b
            int r0 = r5.length()
            if (r0 > 0) goto L2c
        L2b:
            r5 = r4
        L2c:
            r3.zzb = r5
            return
    }

    private final java.lang.String zza(java.lang.String r1) {
            r0 = this;
            java.lang.String r0 = r0.zzb
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    private final java.lang.String zzb(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.String r0 = r0.zzb
            java.lang.String r1 = java.lang.String.format(r1, r2)
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    public boolean canLog(int r1) {
            r0 = this;
            java.lang.String r0 = r0.zza
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            return r0
    }

    public boolean canLogPii() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.d(r2, r1)
        Le:
            return
    }

    public void d(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.d(r2, r1, r4)
        Le:
            return
    }

    public void e(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.e(r2, r1)
        Le:
            return
    }

    public void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.e(r2, r1, r4)
        Le:
            return
    }

    public void efmt(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zzb(r3, r4)
            android.util.Log.e(r2, r1)
        Le:
            return
    }

    public void i(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.i(r2, r1)
        Le:
            return
    }

    public void i(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.i(r2, r1, r4)
        Le:
            return
    }

    public void pii(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void pii(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            return
    }

    public void v(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.v(r2, r1)
        Le:
            return
    }

    public void v(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.v(r2, r1, r4)
        Le:
            return
    }

    public void w(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.w(r2, r1)
        Le:
            return
    }

    public void w(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.w(r2, r1, r4)
        Le:
            return
    }

    public void wfmt(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto L10
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb(r2, r3)
            android.util.Log.w(r1, r0)
        L10:
            return
    }

    public void wtf(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 7
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = r1.zza(r3)
            android.util.Log.e(r2, r0, r4)
            java.lang.String r1 = r1.zza(r3)
            android.util.Log.wtf(r2, r1, r4)
        L15:
            return
    }
}
