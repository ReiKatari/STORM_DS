package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv6  reason: default package */
/* loaded from: classes.dex */
public final class rv6 implements java.lang.AutoCloseable {
    public final defpackage.jr6 A;
    public final defpackage.n55 B;
    public final defpackage.oi0 L;
    public final java.util.Map R;
    public final java.lang.Object X;
    public final java.util.LinkedHashMap Y;
    public final java.util.LinkedHashMap Z;
    public boolean d0;
    public boolean e0;

    public rv6(defpackage.jr6 r1, defpackage.yg1 r2, defpackage.oi0 r3, java.util.Map r4) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.X = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r2 = r4.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            t23 r3 = (defpackage.t23) r3
            r3.getClass()
            r3 = 0
            r1.put(r4, r3)
            goto L27
        L45:
            r0.Y = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.Z = r1
            r1 = 1
            r0.d0 = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r7 = this;
            java.lang.Object r0 = r7.X
            monitor-enter(r0)
            boolean r1 = r7.e0     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            r7.e0 = r1     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap r2 = r7.Y     // Catch: java.lang.Throwable -> L90
            r2.clear()     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap r2 = r7.Z     // Catch: java.lang.Throwable -> L90
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L90
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L90
            java.util.List r2 = defpackage.gt0.k1(r2)     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap r7 = r7.Z     // Catch: java.lang.Throwable -> L90
            r7.clear()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)
            java.util.Iterator r7 = r2.iterator()
        L27:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r7.next()
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            boolean r2 = r0 instanceof java.lang.AutoCloseable
            if (r2 == 0) goto L3b
            r0.close()
            goto L27
        L3b:
            boolean r2 = r0 instanceof java.util.concurrent.ExecutorService
            if (r2 == 0) goto L6e
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            java.util.concurrent.ForkJoinPool r2 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r0 != r2) goto L48
            goto L27
        L48:
            boolean r2 = r0.isTerminated()
            if (r2 != 0) goto L27
            r0.shutdown()
            r3 = 0
        L52:
            if (r2 != 0) goto L64
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L5d
            r5 = 1
            boolean r2 = r0.awaitTermination(r5, r4)     // Catch: java.lang.InterruptedException -> L5d
            goto L52
        L5d:
            if (r3 != 0) goto L52
            r0.shutdownNow()
            r3 = r1
            goto L52
        L64:
            if (r3 == 0) goto L27
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L27
        L6e:
            boolean r2 = r0 instanceof android.content.res.TypedArray
            if (r2 == 0) goto L78
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            goto L27
        L78:
            boolean r2 = r0 instanceof android.media.MediaMetadataRetriever
            if (r2 == 0) goto L82
            android.media.MediaMetadataRetriever r0 = (android.media.MediaMetadataRetriever) r0
            r0.release()
            goto L27
        L82:
            boolean r2 = r0 instanceof android.media.MediaDrm
            if (r2 == 0) goto L8c
            android.media.MediaDrm r0 = (android.media.MediaDrm) r0
            r0.release()
            goto L27
        L8c:
            defpackage.u34.t()
        L8f:
            return
        L90:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public final void e() {
            r12 = this;
            java.lang.Object r0 = r12.X
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            jr6 r2 = r12.A     // Catch: java.lang.Throwable -> L4c
            java.util.List r2 = r2.L     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4c
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4c
            hr6 r3 = (defpackage.hr6) r3     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r4 = r3.l     // Catch: java.lang.Throwable -> L4c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r5) goto L10
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L4c
            int r7 = r7 + 1
            ki0 r8 = (defpackage.ki0) r8     // Catch: java.lang.Throwable -> L4c
            java.util.LinkedHashMap r9 = r12.Y     // Catch: java.lang.Throwable -> L4c
            int r10 = r8.a     // Catch: java.lang.Throwable -> L4c
            kr6 r11 = new kr6     // Catch: java.lang.Throwable -> L4c
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L4c
            android.view.Surface r9 = (android.view.Surface) r9     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            vs0 r8 = r3.f     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L45
            r8 = 1
            goto L46
        L45:
            r8 = r6
        L46:
            if (r8 != 0) goto L24
            zt1 r1 = defpackage.zt1.A     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)
            goto L59
        L4c:
            r12 = move-exception
            goto L84
        L4e:
            int r8 = r8.a     // Catch: java.lang.Throwable -> L4c
            kr6 r10 = new kr6     // Catch: java.lang.Throwable -> L4c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L4c
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L59:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L60
            goto L80
        L60:
            n55 r12 = r12.B
            java.lang.Object r12 = r12.get()
            kc0 r12 = (defpackage.kc0) r12
            r12.getClass()
            java.lang.Object r0 = r12.q
            monitor-enter(r0)
            boolean r2 = r12.e()     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L76
            monitor-exit(r0)
            return
        L76:
            r12.A = r1     // Catch: java.lang.Throwable -> L81
            yk0 r12 = r12.z     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            if (r12 == 0) goto L80
            r12.k(r1)
        L80:
            return
        L81:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L84:
            monitor-exit(r0)
            throw r12
    }

    public final void h() {
            r5 = this;
            java.lang.Object r0 = r5.X
            monitor-enter(r0)
            boolean r1 = r5.e0     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L30
            java.util.LinkedHashMap r1 = r5.Y     // Catch: java.lang.Throwable -> L29
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            android.view.Surface r2 = (android.view.Surface) r2     // Catch: java.lang.Throwable -> L29
            oi0 r3 = r5.L     // Catch: java.lang.Throwable -> L29
            ni0 r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L29
            java.util.LinkedHashMap r4 = r5.Z     // Catch: java.lang.Throwable -> L29
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L29
            goto L11
        L29:
            r5 = move-exception
            goto L38
        L2b:
            r1 = 1
            r5.d0 = r1     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Check failed."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L38:
            monitor-exit(r0)
            throw r5
    }

    public final void k() {
            r7 = this;
            java.lang.Object r0 = r7.X
            monitor-enter(r0)
            r1 = 0
            r7.d0 = r1     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap r2 = r7.Z     // Catch: java.lang.Throwable -> L85
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L85
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L85
            java.util.List r2 = defpackage.gt0.k1(r2)     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap r7 = r7.Z     // Catch: java.lang.Throwable -> L85
            r7.clear()     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)
            java.util.Iterator r7 = r2.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r7.next()
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            boolean r2 = r0 instanceof java.lang.AutoCloseable
            if (r2 == 0) goto L30
            r0.close()
            goto L1c
        L30:
            boolean r2 = r0 instanceof java.util.concurrent.ExecutorService
            if (r2 == 0) goto L63
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            java.util.concurrent.ForkJoinPool r2 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r0 != r2) goto L3d
            goto L1c
        L3d:
            boolean r2 = r0.isTerminated()
            if (r2 != 0) goto L1c
            r0.shutdown()
            r3 = r1
        L47:
            if (r2 != 0) goto L59
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L52
            r5 = 1
            boolean r2 = r0.awaitTermination(r5, r4)     // Catch: java.lang.InterruptedException -> L52
            goto L47
        L52:
            if (r3 != 0) goto L47
            r0.shutdownNow()
            r3 = 1
            goto L47
        L59:
            if (r3 == 0) goto L1c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L1c
        L63:
            boolean r2 = r0 instanceof android.content.res.TypedArray
            if (r2 == 0) goto L6d
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            goto L1c
        L6d:
            boolean r2 = r0 instanceof android.media.MediaMetadataRetriever
            if (r2 == 0) goto L77
            android.media.MediaMetadataRetriever r0 = (android.media.MediaMetadataRetriever) r0
            r0.release()
            goto L1c
        L77:
            boolean r2 = r0 instanceof android.media.MediaDrm
            if (r2 == 0) goto L81
            android.media.MediaDrm r0 = (android.media.MediaDrm) r0
            r0.release()
            goto L1c
        L81:
            defpackage.u34.t()
        L84:
            return
        L85:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }
}
