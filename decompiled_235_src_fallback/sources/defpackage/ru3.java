package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru3  reason: default package */
/* loaded from: classes.dex */
public final class ru3 extends defpackage.n61 implements defpackage.ug1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater d0 = null;
    public final /* synthetic */ defpackage.ug1 L;
    public final defpackage.n61 R;
    public final int X;
    public final defpackage.ly3 Y;
    public final java.lang.Object Z;
    private volatile /* synthetic */ int runningWorkers$volatile;

    static {
            java.lang.Class<ru3> r0 = defpackage.ru3.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.ru3.d0 = r0
            return
    }

    public ru3(defpackage.n61 r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof defpackage.ug1
            if (r0 == 0) goto Lb
            r0 = r2
            ug1 r0 = (defpackage.ug1) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            ug1 r0 = defpackage.td1.a
        L10:
            r1.L = r0
            r1.R = r2
            r1.X = r3
            ly3 r2 = new ly3
            r2.<init>()
            r1.Y = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.Z = r2
            return
    }

    @Override // defpackage.ug1
    public final defpackage.il1 A(long r1, java.lang.Runnable r3, defpackage.l61 r4) {
            r0 = this;
            ug1 r0 = r0.L
            il1 r0 = r0.A(r1, r3, r4)
            return r0
    }

    @Override // defpackage.ug1
    public final void J(long r1, defpackage.rj0 r3) {
            r0 = this;
            ug1 r0 = r0.L
            r0.J(r1, r3)
            return
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r4, java.lang.Runnable r5) {
            r3 = this;
            ly3 r4 = r3.Y
            r4.a(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.ru3.d0
            int r5 = r4.get(r3)
            int r0 = r3.X
            if (r5 >= r0) goto L2f
            boolean r5 = r3.o0()
            if (r5 == 0) goto L2f
            java.lang.Runnable r5 = r3.n0()
            if (r5 != 0) goto L1c
            goto L2f
        L1c:
            uo2 r0 = new uo2     // Catch: java.lang.Throwable -> L2a
            r1 = 12
            r2 = 0
            r0.<init>(r1, r3, r5, r2)     // Catch: java.lang.Throwable -> L2a
            n61 r5 = r3.R     // Catch: java.lang.Throwable -> L2a
            defpackage.ok1.b(r5, r3, r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r5 = move-exception
            r4.decrementAndGet(r3)
            throw r5
        L2f:
            return
    }

    @Override // defpackage.n61
    public final void k0(defpackage.l61 r4, java.lang.Runnable r5) {
            r3 = this;
            ly3 r4 = r3.Y
            r4.a(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.ru3.d0
            int r5 = r4.get(r3)
            int r0 = r3.X
            if (r5 >= r0) goto L2f
            boolean r5 = r3.o0()
            if (r5 == 0) goto L2f
            java.lang.Runnable r5 = r3.n0()
            if (r5 != 0) goto L1c
            goto L2f
        L1c:
            uo2 r0 = new uo2     // Catch: java.lang.Throwable -> L2a
            r1 = 12
            r2 = 0
            r0.<init>(r1, r3, r5, r2)     // Catch: java.lang.Throwable -> L2a
            n61 r5 = r3.R     // Catch: java.lang.Throwable -> L2a
            r5.k0(r3, r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r5 = move-exception
            r4.decrementAndGet(r3)
            throw r5
        L2f:
            return
    }

    @Override // defpackage.n61
    public final defpackage.n61 m0(int r2) {
            r1 = this;
            r2 = 1
            defpackage.kn2.u(r2)
            int r0 = r1.X
            if (r2 < r0) goto L9
            return r1
        L9:
            n61 r1 = super.m0(r2)
            return r1
    }

    public final java.lang.Runnable n0() {
            r3 = this;
        L0:
            ly3 r0 = r3.Y
            java.lang.Object r0 = r0.d()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ru3.d0     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            ly3 r2 = r3.Y     // Catch: java.lang.Throwable -> L22
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r3 = 0
            return r3
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L25:
            return r0
    }

    public final boolean o0() {
            r4 = this;
            java.lang.Object r0 = r4.Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ru3.d0     // Catch: java.lang.Throwable -> L16
            int r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.X     // Catch: java.lang.Throwable -> L16
            if (r2 < r3) goto L10
            monitor-exit(r0)
            r4 = 0
            return r4
        L10:
            r1.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r4 = 1
            return r4
        L16:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            n61 r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = ".limitedParallelism("
            r0.append(r1)
            int r2 = r2.X
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
