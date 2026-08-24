package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public zzu() {
            r2 = this;
            r2.<init>()
            n28 r0 = new n28
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            android.os.Handler r0 = r0.zza
            r0.post(r1)
            return
    }
}
