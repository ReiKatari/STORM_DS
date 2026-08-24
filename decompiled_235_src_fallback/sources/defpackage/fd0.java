package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd0  reason: default package */
/* loaded from: classes.dex */
public final class fd0 implements defpackage.le0 {
    public final /* synthetic */ java.util.concurrent.CountDownLatch a;
    public final /* synthetic */ defpackage.sw b;
    public final /* synthetic */ android.view.Surface c;
    public final /* synthetic */ android.graphics.SurfaceTexture d;

    public fd0(java.util.concurrent.CountDownLatch r1, defpackage.sw r2, android.view.Surface r3, android.graphics.SurfaceTexture r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.zc6
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.zc6
    public final void b() {
            r0 = this;
            return
    }

    @Override // defpackage.le0
    public final void c(defpackage.me0 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.le0
    public final void d(defpackage.me0 r2) {
            r1 = this;
            java.lang.String r2 = "CXCP"
            java.lang.String r0 = "Empty capture session closed"
            android.util.Log.d(r2, r0)
            sw r2 = r1.b
            boolean r2 = r2.a()
            if (r2 == 0) goto L19
            android.view.Surface r2 = r1.c
            r2.release()
            android.graphics.SurfaceTexture r1 = r1.d
            r1.release()
        L19:
            return
    }

    @Override // defpackage.le0
    public final void e(defpackage.me0 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.le0
    public final void f(defpackage.me0 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.le0
    public final void g(defpackage.me0 r6) {
            r5 = this;
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Empty capture session configured. Closing it"
            android.util.Log.d(r0, r1)
            boolean r0 = r6 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto Lf
            r6.close()
            goto L5f
        Lf:
            boolean r0 = r6 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L42
            java.util.concurrent.ExecutorService r6 = (java.util.concurrent.ExecutorService) r6
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r6 != r0) goto L1c
            goto L5f
        L1c:
            boolean r0 = r6.isTerminated()
            if (r0 != 0) goto L5f
            r6.shutdown()
            r1 = 0
        L26:
            if (r0 != 0) goto L38
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L31
            r3 = 1
            boolean r0 = r6.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L31
            goto L26
        L31:
            if (r1 != 0) goto L26
            r6.shutdownNow()
            r1 = 1
            goto L26
        L38:
            if (r1 == 0) goto L5f
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            goto L5f
        L42:
            boolean r0 = r6 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L4c
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r6.recycle()
            goto L5f
        L4c:
            boolean r0 = r6 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L56
            android.media.MediaMetadataRetriever r6 = (android.media.MediaMetadataRetriever) r6
            r6.release()
            goto L5f
        L56:
            boolean r0 = r6 instanceof android.media.MediaDrm
            if (r0 == 0) goto L65
            android.media.MediaDrm r6 = (android.media.MediaDrm) r6
            r6.release()
        L5f:
            java.util.concurrent.CountDownLatch r5 = r5.a
            r5.countDown()
            return
        L65:
            defpackage.u34.t()
            return
    }

    @Override // defpackage.le0
    public final void h(defpackage.me0 r2) {
            r1 = this;
            java.lang.String r2 = "CXCP"
            java.lang.String r0 = "Empty capture session configure failed"
            android.util.Log.d(r2, r0)
            sw r2 = r1.b
            boolean r2 = r2.a()
            if (r2 == 0) goto L19
            android.view.Surface r2 = r1.c
            r2.release()
            android.graphics.SurfaceTexture r2 = r1.d
            r2.release()
        L19:
            java.util.concurrent.CountDownLatch r1 = r1.a
            r1.countDown()
            return
    }
}
