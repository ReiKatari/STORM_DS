package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg0  reason: default package */
/* loaded from: classes.dex */
public final class gg0 implements defpackage.eg0 {
    public final defpackage.gj7 A;
    public final defpackage.cg0 B;
    public final defpackage.ve0 L;
    public final defpackage.kj7 R;
    public final defpackage.sh0 X;
    public final java.lang.String Y;
    public defpackage.oe0 Z;
    public final int d0;
    public final defpackage.sw e0;

    public gg0(defpackage.gr1 r1, defpackage.gj7 r2, defpackage.cg0 r3, defpackage.ve0 r4, defpackage.kj7 r5, defpackage.sh0 r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.A = r2
            r0.B = r3
            r0.L = r4
            r0.R = r5
            r0.X = r6
            java.lang.String r1 = r1.B
            r0.Y = r1
            qe0 r2 = defpackage.re0.a
            r2.getClass()
            r0.Z = r2
            uw r2 = defpackage.hg0.a
            r2.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.uw.b
            int r2 = r3.incrementAndGet(r2)
            r0.d0 = r2
            r2 = 0
            sw r2 = defpackage.g04.s(r2)
            r0.e0 = r2
            java.lang.String r2 = "CXCP"
            boolean r3 = defpackage.kj2.F(r2)
            if (r3 == 0) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Created "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " for "
            r3.append(r0)
            java.lang.String r0 = defpackage.xf0.b(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r2, r0)
        L63:
            return
    }

    @Override // defpackage.ci7
    public final void b(defpackage.di7 r3) {
            r2 = this;
            gj7 r2 = r2.A
            r2.getClass()
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r2.l     // Catch: java.lang.Throwable -> L16
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            java.util.LinkedHashSet r3 = r2.l     // Catch: java.lang.Throwable -> L16
            r2.k(r3)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)
            return
        L1a:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.ci7
    public final void d(defpackage.di7 r1) {
            r0 = this;
            gj7 r0 = r0.A
            r0.a(r1)
            return
    }

    @Override // defpackage.eg0
    public final defpackage.ve0 e() {
            r0 = this;
            ve0 r0 = r0.L
            return r0
    }

    @Override // defpackage.eg0
    public final defpackage.oe0 f() {
            r0 = this;
            oe0 r0 = r0.Z
            return r0
    }

    @Override // defpackage.ci7
    public final void g(defpackage.di7 r3) {
            r2 = this;
            gj7 r2 = r2.A
            r2.getClass()
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r2.l     // Catch: java.lang.Throwable -> L14
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L16
            r2.l()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.ci7
    public final void h(defpackage.di7 r3) {
            r2 = this;
            gj7 r2 = r2.A
            r2.getClass()
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r2.m     // Catch: java.lang.Throwable -> L14
            boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L16
            r2.l()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.eg0
    public final void i(defpackage.oe0 r2) {
            r1 = this;
            if (r2 != 0) goto L8
            qe0 r0 = defpackage.re0.a
            r0.getClass()
            goto L9
        L8:
            r0 = r2
        L9:
            r1.Z = r0
            if (r2 == 0) goto L10
            r2.z()
        L10:
            gj7 r1 = r1.A
            java.lang.Object r1 = r1.k
            monitor-enter(r1)
            monitor-exit(r1)
            return
    }

    @Override // defpackage.eg0
    public final void j(boolean r5) {
            r4 = this;
            gj7 r4 = r4.A
            java.lang.Object r0 = r4.k
            monitor-enter(r0)
            r4.n = r5     // Catch: java.lang.Throwable -> L1d
            ii7 r4 = r4.h()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1b
            kj7 r1 = r4.b     // Catch: java.lang.Throwable -> L1d
            o41 r1 = r1.f     // Catch: java.lang.Throwable -> L1d
            lo0 r2 = new lo0     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            r4 = 3
            defpackage.hv.L(r1, r3, r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.eg0
    public final boolean k() {
            r0 = this;
            sw r0 = r0.e0
            boolean r0 = r0.b()
            return r0
    }

    @Override // defpackage.eg0
    public final void l(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = defpackage.gt0.k1(r1)
            gj7 r0 = r0.A
            r0.d(r1)
            return
    }

    @Override // defpackage.eg0
    public final void m(java.util.ArrayList r1) {
            r0 = this;
            gj7 r0 = r0.A
            java.util.List r1 = defpackage.gt0.k1(r1)
            r0.g(r1)
            return
    }

    @Override // defpackage.eg0
    public final void n() {
            r4 = this;
            java.lang.String r0 = "CXCP"
            boolean r1 = defpackage.kj2.F(r0)
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = " received removed signal. Cleaning up."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1c:
            sw r0 = r4.e0
            boolean r0 = r0.a()
            if (r0 == 0) goto L33
            kj7 r0 = r4.R
            o41 r0 = r0.a
            fg0 r1 = new fg0
            r2 = 0
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
        L33:
            return
    }

    @Override // defpackage.eg0
    public final void p(boolean r2) {
            r1 = this;
            gj7 r1 = r1.A
            java.lang.Object r0 = r1.k
            monitor-enter(r0)
            r1.p = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.eg0
    public final defpackage.cg0 q() {
            r0 = this;
            cg0 r0 = r0.B
            return r0
    }

    @Override // defpackage.eg0
    public final defpackage.gx3 release() {
            r4 = this;
            kj7 r0 = r4.R
            o41 r0 = r0.a
            fg0 r1 = new fg0
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            ap6 r4 = defpackage.hv.L(r0, r3, r3, r1, r4)
            h61 r0 = new h61
            r1 = 0
            r0.<init>(r4, r1)
            tb0 r4 = defpackage.ak7.W(r0)
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraInternalAdapter<"
            r0.<init>(r1)
            java.lang.String r1 = r2.Y
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            int r2 = r2.d0
            java.lang.String r1 = ")>"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
