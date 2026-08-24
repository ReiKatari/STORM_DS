package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zac implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager r1, android.net.Uri r2, android.graphics.Bitmap r3, boolean r4, java.util.concurrent.CountDownLatch r5) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            r0.zac = r3
            r0.zad = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.lang.String r0 = "OnBitmapLoadedRunnable must be executed in the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.ImageManager r0 = r9.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            android.net.Uri r1 = r9.zab
            java.lang.Object r0 = r0.remove(r1)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 == 0) goto L63
            java.util.ArrayList r0 = com.google.android.gms.common.images.ImageManager.ImageReceiver.zaa(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L1f:
            if (r3 >= r1) goto L63
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.images.zag r4 = (com.google.android.gms.common.images.zag) r4
            android.graphics.Bitmap r5 = r9.zac
            com.google.android.gms.common.images.ImageManager r6 = r9.zaa
            if (r5 == 0) goto L35
            android.content.Context r6 = com.google.android.gms.common.images.ImageManager.zaa(r6)
            r4.zac(r6, r5, r2)
            goto L53
        L35:
            android.net.Uri r5 = r9.zab
            java.util.Map r6 = com.google.android.gms.common.images.ImageManager.zaf(r6)
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.put(r5, r7)
            com.google.android.gms.common.images.ImageManager r5 = r9.zaa
            android.content.Context r6 = com.google.android.gms.common.images.ImageManager.zaa(r5)
            zz7 r5 = com.google.android.gms.common.images.ImageManager.zac(r5)
            r4.zab(r6, r5, r2)
        L53:
            boolean r5 = r4 instanceof com.google.android.gms.common.images.zaf
            if (r5 != 0) goto L60
            com.google.android.gms.common.images.ImageManager r5 = r9.zaa
            java.util.Map r5 = com.google.android.gms.common.images.ImageManager.zag(r5)
            r5.remove(r4)
        L60:
            int r3 = r3 + 1
            goto L1f
        L63:
            java.util.concurrent.CountDownLatch r0 = r9.zad
            r0.countDown()
            java.lang.Object r0 = com.google.android.gms.common.images.ImageManager.zad()
            monitor-enter(r0)
            java.util.HashSet r1 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> L78
            android.net.Uri r9 = r9.zab     // Catch: java.lang.Throwable -> L78
            r1.remove(r9)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r9
    }
}
