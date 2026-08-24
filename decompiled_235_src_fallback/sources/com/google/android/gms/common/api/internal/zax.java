package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zax implements com.google.android.gms.common.api.internal.zabz {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public /* synthetic */ zax(com.google.android.gms.common.api.internal.zaaa r1, com.google.android.gms.common.api.internal.zaw r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zak(r0, r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            return
        L1d:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa.zao(r0, r2)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa.zak(r2, r0)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            return
        L24:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r1 = r1.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int r3, boolean r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L32
            boolean r1 = com.google.android.gms.common.api.internal.zaaa.zav(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
            com.google.android.gms.common.ConnectionResult r1 = com.google.android.gms.common.api.internal.zaaa.zaa(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.api.internal.zaaa.zaa(r0)     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.isSuccess()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L22
            goto L34
        L22:
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa     // Catch: java.lang.Throwable -> L32
            r0 = 1
            com.google.android.gms.common.api.internal.zaaa.zam(r4, r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaa.zai(r4)     // Catch: java.lang.Throwable -> L32
            r4.onConnectionSuspended(r3)     // Catch: java.lang.Throwable -> L32
            goto L3f
        L32:
            r3 = move-exception
            goto L49
        L34:
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L32
            r1 = 0
            com.google.android.gms.common.api.internal.zaaa.zam(r0, r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zaaa.zan(r0, r3, r4)     // Catch: java.lang.Throwable -> L32
        L3f:
            com.google.android.gms.common.api.internal.zaaa r2 = r2.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            return
        L49:
            com.google.android.gms.common.api.internal.zaaa r2 = r2.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            throw r3
    }
}
