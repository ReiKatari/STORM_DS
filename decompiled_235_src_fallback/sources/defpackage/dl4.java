package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl4  reason: default package */
/* loaded from: classes.dex */
public abstract class dl4 {
    public final java.util.ArrayList a;
    public boolean b;
    public final java.util.concurrent.CopyOnWriteArrayList c;

    public dl4(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.b = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.c = r2
            return
    }

    public void a() {
            r0 = this;
            return
    }

    public abstract void b();

    public void c(defpackage.b00 r1) {
            r0 = this;
            return
    }

    public void d(defpackage.b00 r1) {
            r0 = this;
            return
    }

    public final void e() {
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.c
            java.util.Iterator r1 = r0.iterator()
            r1.getClass()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2
            boolean r4 = r2 instanceof java.lang.AutoCloseable
            if (r4 == 0) goto L1e
            r2.close()
            goto L9
        L1e:
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService
            if (r4 == 0) goto L50
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            java.util.concurrent.ForkJoinPool r4 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r2 != r4) goto L2b
            goto L9
        L2b:
            boolean r4 = r2.isTerminated()
            if (r4 != 0) goto L9
            r2.shutdown()
        L34:
            if (r4 != 0) goto L46
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L3f
            r6 = 1
            boolean r4 = r2.awaitTermination(r6, r5)     // Catch: java.lang.InterruptedException -> L3f
            goto L34
        L3f:
            if (r3 != 0) goto L34
            r2.shutdownNow()
            r3 = 1
            goto L34
        L46:
            if (r3 == 0) goto L9
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L9
        L50:
            boolean r3 = r2 instanceof android.content.res.TypedArray
            if (r3 == 0) goto L5a
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r2.recycle()
            goto L9
        L5a:
            boolean r3 = r2 instanceof android.media.MediaMetadataRetriever
            if (r3 == 0) goto L64
            android.media.MediaMetadataRetriever r2 = (android.media.MediaMetadataRetriever) r2
            r2.release()
            goto L9
        L64:
            boolean r3 = r2 instanceof android.media.MediaDrm
            if (r3 == 0) goto L6e
            android.media.MediaDrm r2 = (android.media.MediaDrm) r2
            r2.release()
            goto L9
        L6e:
            defpackage.u34.t()
            return
        L72:
            r0.clear()
            java.util.ArrayList r8 = r8.a
            int r0 = r8.size()
        L7b:
            if (r3 >= r0) goto L89
            java.lang.Object r1 = r8.get(r3)
            int r3 = r3 + 1
            cl4 r1 = (defpackage.cl4) r1
            r1.e()
            goto L7b
        L89:
            r8.clear()
            return
    }

    public final void f(boolean r6) {
            r5 = this;
            r5.b = r6
            java.util.ArrayList r5 = r5.a
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            cl4 r3 = (defpackage.cl4) r3
            boolean r4 = r3.e
            if (r4 == 0) goto L1c
            if (r6 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = r1
        L1d:
            r3.f(r4)
            goto La
        L21:
            return
    }
}
