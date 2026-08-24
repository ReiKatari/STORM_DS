package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf6  reason: default package */
/* loaded from: classes.dex */
public final class sf6 implements defpackage.hp4 {
    public final defpackage.hp4 A;
    public final defpackage.m44 B;
    public final defpackage.sw L;

    public sf6(defpackage.hp4 r1, defpackage.m44 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r1 = 0
            sw r1 = defpackage.g04.s(r1)
            r0.L = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            sw r0 = r5.L
            boolean r0 = r0.a()
            if (r0 == 0) goto L87
            m44 r5 = r5.B
            java.lang.Object r0 = r5.L
            uw r0 = (defpackage.uw) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw.b
            int r0 = r1.decrementAndGet(r0)
            if (r0 != 0) goto L87
            java.lang.Object r0 = r5.R
            xw r0 = (defpackage.xw) r0
            r1 = 0
            java.lang.Object r0 = r0.b(r1)
            gs0 r0 = (defpackage.gs0) r0
            r0.getClass()
            java.lang.Object r5 = r5.B
            hp4 r5 = (defpackage.hp4) r5
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L33
            r5.close()
            goto L87
        L33:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L66
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L40
            goto L87
        L40:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L87
            r5.shutdown()
            r1 = 0
        L4a:
            if (r0 != 0) goto L5c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L55
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L55
            goto L4a
        L55:
            if (r1 != 0) goto L4a
            r5.shutdownNow()
            r1 = 1
            goto L4a
        L5c:
            if (r1 == 0) goto L87
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L87
        L66:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L70
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            goto L87
        L70:
            boolean r0 = r5 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L7a
            android.media.MediaMetadataRetriever r5 = (android.media.MediaMetadataRetriever) r5
            r5.release()
            goto L87
        L7a:
            boolean r0 = r5 instanceof android.media.MediaDrm
            if (r0 == 0) goto L84
            android.media.MediaDrm r5 = (android.media.MediaDrm) r5
            r5.release()
            goto L87
        L84:
            defpackage.u34.t()
        L87:
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r3) {
            r2 = this;
            sw r0 = r2.L
            boolean r0 = r0.b()
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Class<sf6> r0 = defpackage.sf6.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            goto L30
        L17:
            java.lang.Class<hp4> r0 = defpackage.hp4.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L24
            goto L30
        L24:
            java.lang.Class<j33> r0 = defpackage.j33.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L31
        L30:
            return r2
        L31:
            java.lang.Class<android.media.Image> r0 = android.media.Image.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L44
            hp4 r2 = r2.A
            java.lang.Object r2 = r2.e(r3)
            return r2
        L44:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot unwrap "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " as android.media.Image. Use setFinalizerinstead and close all outstanding references."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public final defpackage.sf6 k0() {
            r6 = this;
            sw r0 = r6.L
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto Lb
        L9:
            r0 = r1
            goto L34
        Lb:
            m44 r0 = r6.B
            java.lang.Object r2 = r0.L
            uw r2 = (defpackage.uw) r2
        L11:
            int r3 = r2.a
            if (r3 != 0) goto L17
            r4 = 0
            goto L19
        L17:
            int r4 = r3 + 1
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.uw.b
            boolean r3 = r5.compareAndSet(r2, r3, r4)
            if (r3 == 0) goto L11
            if (r4 == 0) goto L28
            java.lang.Object r0 = r0.B
            hp4 r0 = (defpackage.hp4) r0
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L9
            sf6 r0 = new sf6
            hp4 r2 = r6.A
            m44 r6 = r6.B
            r0.<init>(r2, r6)
        L34:
            if (r0 == 0) goto L37
            return r0
        L37:
            java.lang.String r6 = "Required value was null."
            defpackage.i.m(r6)
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            hp4 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}
