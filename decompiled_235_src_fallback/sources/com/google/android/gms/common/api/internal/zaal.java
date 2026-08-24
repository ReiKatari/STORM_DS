package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaal implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final boolean zac;

    public zaal(com.google.android.gms.common.api.internal.zaaw r2, com.google.android.gms.common.api.Api r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            r1.zab = r3
            r1.zac = r4
            return
    }

    public static /* bridge */ /* synthetic */ boolean zaa(com.google.android.gms.common.api.internal.zaal r0) {
            boolean r0 = r0.zac
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r5) {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaaw r0 = (com.google.android.gms.common.api.internal.zaaw) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.common.api.internal.zabi r2 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zabe r2 = r2.zag
            android.os.Looper r2 = r2.getLooper()
            r3 = 0
            if (r1 != r2) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = r3
        L1f:
            java.lang.String r2 = "onReportServiceBinding must be called on the GoogleApiClient handler thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r1.lock()
            boolean r1 = com.google.android.gms.common.api.internal.zaaw.zaw(r0, r3)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L32
            goto L4b
        L32:
            boolean r1 = r5.isSuccess()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L42
            com.google.android.gms.common.api.Api r1 = r4.zab     // Catch: java.lang.Throwable -> L40
            boolean r4 = r4.zac     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.internal.zaaw.zat(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r4 = move-exception
            goto L53
        L42:
            boolean r4 = com.google.android.gms.common.api.internal.zaaw.zax(r0)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L4b
            com.google.android.gms.common.api.internal.zaaw.zau(r0)     // Catch: java.lang.Throwable -> L40
        L4b:
            java.util.concurrent.locks.Lock r4 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r4.unlock()
            return
        L53:
            java.util.concurrent.locks.Lock r5 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r5.unlock()
            throw r4
    }
}
