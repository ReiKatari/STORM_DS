package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    public zabg(com.google.android.gms.common.api.internal.zabf r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = com.google.android.gms.common.api.internal.zabi.zag(r3)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.common.api.internal.zabf r1 = r2.zaa     // Catch: java.lang.Throwable -> L13
            if (r0 != r1) goto L15
            r2.zaa()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L1d
        L15:
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r2.unlock()
            return
        L1d:
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r3.unlock()
            throw r2
    }
}
