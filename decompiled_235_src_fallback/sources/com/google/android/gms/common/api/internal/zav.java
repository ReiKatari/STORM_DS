package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public zav(com.google.android.gms.common.api.internal.zaaa r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa.zap(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            return
        L18:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            throw r0
    }
}
