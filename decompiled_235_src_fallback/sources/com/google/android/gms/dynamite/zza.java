package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza extends java.lang.Thread {
    public zza(java.lang.ThreadGroup r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = "GmsDynamite"
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r1)
        L6:
            r1.wait()     // Catch: java.lang.Throwable -> La java.lang.InterruptedException -> Lc
            goto L6
        La:
            r0 = move-exception
            goto Le
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}
