package com.google.android.gms.common.util.concurrent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    public zza(java.lang.Runnable r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Runnable r1 = r1.zza
            r1.run()
            return
    }
}
