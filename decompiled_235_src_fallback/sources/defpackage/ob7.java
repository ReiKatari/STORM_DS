package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob7  reason: default package */
/* loaded from: classes.dex */
public final class ob7 extends defpackage.vl6 {
    public final defpackage.vl6 e;
    public final boolean f;
    public final boolean g;
    public defpackage.qn2 h;
    public final long i;

    public ob7(defpackage.vl6 r4, defpackage.qn2 r5, boolean r6, boolean r7) {
            r3 = this;
            r76 r0 = defpackage.bm6.a
            r0 = 0
            zl6 r2 = defpackage.zl6.X
            r3.<init>(r0, r2)
            r3.e = r4
            r3.f = r6
            r3.g = r7
            if (r4 == 0) goto L17
            qn2 r4 = r4.e()
            if (r4 != 0) goto L1b
        L17:
            os2 r4 = defpackage.bm6.j
            qn2 r4 = r4.e
        L1b:
            qn2 r4 = defpackage.bm6.k(r5, r4, r6)
            r3.h = r4
            long r4 = defpackage.kj2.s()
            r3.i = r4
            return
    }

    @Override // defpackage.vl6
    public final void c() {
            r1 = this;
            r0 = 1
            r1.c = r0
            boolean r0 = r1.g
            if (r0 == 0) goto Le
            vl6 r1 = r1.e
            if (r1 == 0) goto Le
            r1.c()
        Le:
            return
    }

    @Override // defpackage.vl6
    public final defpackage.zl6 d() {
            r0 = this;
            vl6 r0 = r0.v()
            zl6 r0 = r0.d()
            return r0
    }

    @Override // defpackage.vl6
    public final defpackage.qn2 e() {
            r0 = this;
            qn2 r0 = r0.h
            return r0
    }

    @Override // defpackage.vl6
    public final boolean f() {
            r0 = this;
            vl6 r0 = r0.v()
            boolean r0 = r0.f()
            return r0
    }

    @Override // defpackage.vl6
    public final long g() {
            r2 = this;
            vl6 r2 = r2.v()
            long r0 = r2.g()
            return r0
    }

    @Override // defpackage.vl6
    public final defpackage.qn2 i() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.vl6
    public final void k() {
            r0 = this;
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // defpackage.vl6
    public final void l() {
            r0 = this;
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // defpackage.vl6
    public final void m() {
            r0 = this;
            vl6 r0 = r0.v()
            r0.m()
            return
    }

    @Override // defpackage.vl6
    public final void n(defpackage.eq6 r1) {
            r0 = this;
            vl6 r0 = r0.v()
            r0.n(r1)
            return
    }

    @Override // defpackage.vl6
    public final defpackage.vl6 u(defpackage.qn2 r3) {
            r2 = this;
            qn2 r0 = r2.h
            r1 = 1
            qn2 r3 = defpackage.bm6.k(r3, r0, r1)
            boolean r0 = r2.f
            if (r0 != 0) goto L19
            vl6 r2 = r2.v()
            r0 = 0
            vl6 r2 = r2.u(r0)
            vl6 r2 = defpackage.bm6.g(r2, r3, r1)
            return r2
        L19:
            vl6 r2 = r2.v()
            vl6 r2 = r2.u(r3)
            return r2
    }

    public final defpackage.vl6 v() {
            r0 = this;
            vl6 r0 = r0.e
            if (r0 != 0) goto L6
            os2 r0 = defpackage.bm6.j
        L6:
            return r0
    }
}
