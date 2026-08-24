package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl6  reason: default package */
/* loaded from: classes.dex */
public abstract class vl6 {
    public defpackage.zl6 a;
    public long b;
    public boolean c;
    public int d;

    public vl6(long r8, defpackage.zl6 r10) {
            r7 = this;
            r7.<init>()
            r7.a = r10
            r7.b = r8
            r76 r10 = defpackage.bm6.a
            r0 = 0
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 == 0) goto L46
            zl6 r10 = r7.d()
            long r2 = r10.L
            long[] r4 = r10.R
            if (r4 == 0) goto L1d
            r8 = 0
            r8 = r4[r8]
            goto L38
        L1d:
            long r4 = r10.B
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L2a
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
        L27:
            long r8 = (long) r8
            long r8 = r8 + r2
            goto L38
        L2a:
            long r4 = r10.A
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 == 0) goto L38
            r8 = 64
            long r2 = r2 + r8
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            goto L27
        L38:
            java.lang.Object r10 = defpackage.bm6.c
            monitor-enter(r10)
            s11 r0 = defpackage.bm6.f     // Catch: java.lang.Throwable -> L43
            int r8 = r0.a(r8)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r10)
            goto L47
        L43:
            r7 = move-exception
            monitor-exit(r10)
            throw r7
        L46:
            r8 = -1
        L47:
            r7.d = r8
            return
    }

    public static void q(defpackage.vl6 r1) {
            m44 r0 = defpackage.bm6.b
            r0.F(r1)
            return
    }

    public final void a() {
            r1 = this;
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            r1.b()     // Catch: java.lang.Throwable -> Lb
            r1.p()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public void b() {
            r3 = this;
            zl6 r0 = defpackage.bm6.d
            long r1 = r3.g()
            zl6 r3 = r0.b(r1)
            defpackage.bm6.d = r3
            return
    }

    public abstract void c();

    public defpackage.zl6 d() {
            r0 = this;
            zl6 r0 = r0.a
            return r0
    }

    public abstract defpackage.qn2 e();

    public abstract boolean f();

    public long g() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public int h() {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract defpackage.qn2 i();

    public final defpackage.vl6 j() {
            r2 = this;
            m44 r0 = defpackage.bm6.b
            java.lang.Object r1 = r0.f()
            vl6 r1 = (defpackage.vl6) r1
            r0.F(r2)
            return r1
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(defpackage.eq6 r1);

    public final void o() {
            r1 = this;
            int r0 = r1.d
            if (r0 < 0) goto La
            defpackage.bm6.u(r0)
            r0 = -1
            r1.d = r0
        La:
            return
    }

    public void p() {
            r0 = this;
            r0.o()
            return
    }

    public void r(defpackage.zl6 r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void s(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void t(int r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Updating write count is not supported for this snapshot"
            r0.<init>(r1)
            throw r0
    }

    public abstract defpackage.vl6 u(defpackage.qn2 r1);
}
