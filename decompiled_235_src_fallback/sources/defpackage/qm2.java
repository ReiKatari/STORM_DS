package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm2  reason: default package */
/* loaded from: classes.dex */
public final class qm2 extends defpackage.d2 implements defpackage.dp4 {
    public final int c;
    public final int d;
    public final defpackage.uw e;
    public final /* synthetic */ defpackage.tm2 f;

    public qm2(defpackage.tm2 r1, int r2, int r3, defpackage.uw r4) {
            r0 = this;
            r0.f = r1
            r1 = 4
            r0.<init>(r1)
            r0.c = r2
            r0.d = r3
            r0.e = r4
            return
    }

    @Override // defpackage.dp4
    public final void b(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.mp4
            if (r0 != 0) goto L8
            if (r8 == 0) goto L8
            r1 = r8
            goto L9
        L8:
            r1 = 0
        L9:
            hp4 r1 = (defpackage.hp4) r1
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L86
            boolean r8 = r1 instanceof defpackage.sf6
            if (r8 == 0) goto L1a
            sf6 r1 = (defpackage.sf6) r1
            sf6 r8 = r1.k0()
            goto L38
        L1a:
            java.lang.Class<sf6> r8 = defpackage.sf6.class
            ar0 r8 = defpackage.gh5.a(r8)
            java.lang.Object r8 = r1.e(r8)
            sf6 r8 = (defpackage.sf6) r8
            if (r8 == 0) goto L2d
            sf6 r8 = r8.k0()
            goto L38
        L2d:
            m44 r8 = new m44
            r8.<init>(r1)
            sf6 r0 = new sf6
            r0.<init>(r1, r8)
            r8 = r0
        L38:
            java.lang.Object r0 = r7.b
            tu0 r0 = (defpackage.tu0) r0
            kp4 r1 = new kp4
            r1.<init>(r8)
            boolean r0 = r0.b0(r1)
            if (r0 != 0) goto La5
            boolean r0 = r8 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L4f
            r8.close()
            goto La5
        L4f:
            boolean r0 = r8 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L82
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r8 != r0) goto L5c
            goto La5
        L5c:
            boolean r0 = r8.isTerminated()
            if (r0 != 0) goto La5
            r8.shutdown()
            r1 = 0
        L66:
            if (r0 != 0) goto L78
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L71
            r5 = 1
            boolean r0 = r8.awaitTermination(r5, r4)     // Catch: java.lang.InterruptedException -> L71
            goto L66
        L71:
            if (r1 != 0) goto L66
            r8.shutdownNow()
            r1 = r3
            goto L66
        L78:
            if (r1 == 0) goto La5
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
            goto La5
        L82:
            defpackage.u34.t()
            return
        L86:
            java.lang.Object r1 = r7.b
            tu0 r1 = (defpackage.tu0) r1
            if (r0 != 0) goto L90
            if (r8 == 0) goto L90
            r8 = r3
            goto L98
        L90:
            if (r8 != 0) goto L94
            r8 = r2
            goto L98
        L94:
            mp4 r8 = (defpackage.mp4) r8
            int r8 = r8.a
        L98:
            mp4 r0 = new mp4
            r0.<init>(r8)
            kp4 r8 = new kp4
            r8.<init>(r0)
            r1.b0(r8)
        La5:
            uw r8 = r7.e
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw.b
            int r8 = r0.decrementAndGet(r8)
            if (r8 != 0) goto L142
            tm2 r8 = r7.f
            java.util.concurrent.CopyOnWriteArrayList r8 = r8.h
            java.util.Iterator r8 = r8.iterator()
            r8.getClass()
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto L13d
            tm2 r7 = r7.f
            uw r8 = r7.g
            r8.getClass()
            int r8 = r0.decrementAndGet(r8)
            if (r8 == 0) goto Ld1
            goto L142
        Ld1:
            xw r0 = r7.f
        Ld3:
            java.lang.Object r8 = r0.a
            r1 = r8
            rm2 r1 = (defpackage.rm2) r1
            int[] r4 = defpackage.sm2.a
            int r5 = r1.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L108
            if (r4 != r2) goto Le7
            rm2 r1 = defpackage.rm2.COMPLETE
            goto L10a
        Le7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected frame state for "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = "! State is "
            r0.append(r7)
            r0.append(r1)
            r7 = 32
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L108:
            rm2 r1 = defpackage.rm2.STREAM_RESULTS_COMPLETE
        L10a:
            boolean r8 = r0.a(r8, r1)
            if (r8 == 0) goto Ld3
            java.util.concurrent.CopyOnWriteArrayList r8 = r7.h
            java.util.Iterator r8 = r8.iterator()
            r8.getClass()
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L138
            rm2 r8 = defpackage.rm2.COMPLETE
            if (r1 != r8) goto L142
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.h
            java.util.Iterator r7 = r7.iterator()
            r7.getClass()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L133
            goto L142
        L133:
            java.lang.ClassCastException r7 = defpackage.i61.j(r7)
            throw r7
        L138:
            java.lang.ClassCastException r7 = defpackage.i61.j(r8)
            throw r7
        L13d:
            java.lang.ClassCastException r7 = defpackage.i61.j(r8)
            throw r7
        L142:
            return
    }
}
