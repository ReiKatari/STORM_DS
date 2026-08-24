package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm2  reason: default package */
/* loaded from: classes.dex */
public final class mm2 implements java.lang.AutoCloseable {
    public final defpackage.tm2 A;
    public final java.util.Set B;
    public final defpackage.sw L;

    public mm2(defpackage.tm2 r8) {
            r7 = this;
            kw3 r0 = r8.e
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.ht0.v0(r0, r2)
            r1.<init>(r3)
            r3 = 0
            java.util.ListIterator r4 = r0.listIterator(r3)
        L12:
            r5 = r4
            xx2 r5 = (defpackage.xx2) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2c
            java.lang.Object r5 = r5.next()
            qm2 r5 = (defpackage.qm2) r5
            int r5 = r5.c
            kr6 r6 = new kr6
            r6.<init>(r5)
            r1.add(r6)
            goto L12
        L2c:
            java.util.Set r1 = defpackage.gt0.p1(r1)
            r7.<init>()
            r7.A = r8
            r7.B = r1
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = defpackage.ht0.v0(r0, r2)
            r8.<init>(r1)
            java.util.ListIterator r0 = r0.listIterator(r3)
        L44:
            r1 = r0
            xx2 r1 = (defpackage.xx2) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r1 = r1.next()
            qm2 r1 = (defpackage.qm2) r1
            int r1 = r1.d
            gp4 r2 = new gp4
            r2.<init>(r1)
            r8.add(r2)
            goto L44
        L5e:
            defpackage.gt0.p1(r8)
            sw r8 = defpackage.g04.s(r3)
            r7.L = r8
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            r0.e()
            return
    }

    public final boolean e() {
            r12 = this;
            sw r0 = r12.L
            boolean r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto Ld4
            tm2 r0 = r12.A
            pm2 r2 = r0.d
            kw3 r0 = r0.e
            java.lang.Object r3 = r2.a
            uw r3 = (defpackage.uw) r3
            r3.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.uw.b
            int r3 = r4.decrementAndGet(r3)
            r4 = 2
            if (r3 != 0) goto L30
            java.lang.Object r2 = r2.b
            tu0 r2 = (defpackage.tu0) r2
            mp4 r3 = new mp4
            r3.<init>(r4)
            kp4 r5 = new kp4
            r5.<init>(r3)
            r2.b0(r5)
        L30:
            int r2 = r0.a()
            r3 = r1
        L35:
            r5 = 1
            if (r3 >= r2) goto Ld3
            java.lang.Object r6 = r0.get(r3)
            qm2 r6 = (defpackage.qm2) r6
            int r7 = r6.c
            kr6 r8 = new kr6
            r8.<init>(r7)
            java.util.Set r7 = r12.B
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto Lcf
            java.lang.Object r7 = r6.a
            uw r7 = (defpackage.uw) r7
            r7.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.uw.b
            int r7 = r8.decrementAndGet(r7)
            if (r7 != 0) goto Lcf
            java.lang.Object r7 = r6.b
            tu0 r7 = (defpackage.tu0) r7
            mp4 r8 = new mp4
            r8.<init>(r4)
            kp4 r9 = new kp4
            r9.<init>(r8)
            r7.b0(r9)
            java.lang.Object r6 = r6.b
            tu0 r6 = (defpackage.tu0) r6
            boolean r7 = r6.W()
            r8 = 0
            if (r7 == 0) goto L8d
            boolean r7 = r6.isCancelled()
            if (r7 != 0) goto L8d
            java.lang.Object r6 = r6.J()
            kp4 r6 = (defpackage.kp4) r6
            java.lang.Object r6 = r6.a
            boolean r7 = r6 instanceof defpackage.mp4
            if (r7 != 0) goto L8d
            if (r6 == 0) goto L8d
            r8 = r6
        L8d:
            sf6 r8 = (defpackage.sf6) r8
            if (r8 == 0) goto Lcf
            boolean r6 = r8 instanceof java.lang.AutoCloseable
            if (r6 == 0) goto L99
            r8.close()
            goto Lcf
        L99:
            boolean r6 = r8 instanceof java.util.concurrent.ExecutorService
            if (r6 == 0) goto Lcc
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8
            java.util.concurrent.ForkJoinPool r6 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r8 != r6) goto La6
            goto Lcf
        La6:
            boolean r6 = r8.isTerminated()
            if (r6 != 0) goto Lcf
            r8.shutdown()
            r7 = r1
        Lb0:
            if (r6 != 0) goto Lc2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> Lbb
            r10 = 1
            boolean r6 = r8.awaitTermination(r10, r9)     // Catch: java.lang.InterruptedException -> Lbb
            goto Lb0
        Lbb:
            if (r7 != 0) goto Lb0
            r8.shutdownNow()
            r7 = r5
            goto Lb0
        Lc2:
            if (r7 == 0) goto Lcf
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto Lcf
        Lcc:
            defpackage.u34.t()
        Lcf:
            int r3 = r3 + 1
            goto L35
        Ld3:
            return r5
        Ld4:
            return r1
    }

    public final void finalize() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to close "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "! This indicates a memory leak and could cause the camera to stall, or images to be lost."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.e(r0, r2)
        L1e:
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            tm2 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}
