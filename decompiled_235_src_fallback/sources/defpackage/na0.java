package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na0  reason: default package */
/* loaded from: classes.dex */
public final class na0 extends defpackage.z64 implements defpackage.gi4, defpackage.c90, defpackage.mo1 {
    public final defpackage.oa0 k0;
    public boolean l0;
    public defpackage.qn2 m0;

    public na0(defpackage.oa0 r1, defpackage.qn2 r2) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.m0 = r2
            r1.A = r0
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r0 = this;
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r0 = this;
            r0.R0()
            return
    }

    @Override // defpackage.mo1
    public final void O() {
            r0 = this;
            r0.R0()
            return
    }

    public final void R0() {
            r2 = this;
            r0 = 0
            r2.l0 = r0
            oa0 r0 = r2.k0
            r1 = 0
            r0.B = r1
            defpackage.f04.I(r2)
            return
    }

    @Override // defpackage.xg1
    public final void S() {
            r0 = this;
            r0.R0()
            return
    }

    @Override // defpackage.c90
    public final defpackage.qh1 a() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            qh1 r0 = r0.u0
            return r0
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r0 = this;
            r0.R0()
            return
    }

    @Override // defpackage.c90
    public final long e() {
            r2 = this;
            r0 = 4
            eg4 r2 = defpackage.nc1.d0(r2, r0)
            long r0 = r2.L
            long r0 = defpackage.qo2.S(r0)
            return r0
    }

    @Override // defpackage.c90
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            kk3 r0 = r0.v0
            return r0
    }

    @Override // defpackage.gi4
    public final void l0() {
            r0 = this;
            r0.R0()
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r4) {
            r3 = this;
            boolean r0 = r3.l0
            oa0 r1 = r3.k0
            if (r0 != 0) goto L21
            r0 = 0
            r1.B = r0
            le r0 = new le
            r2 = 3
            r0.<init>(r2, r3, r1)
            defpackage.jx2.B(r3, r0)
            d51 r0 = r1.B
            if (r0 == 0) goto L1a
            r0 = 1
            r3.l0 = r0
            goto L21
        L1a:
            java.lang.String r3 = "DrawResult not defined, did you forget to call onDraw?"
            ug r3 = defpackage.i61.e(r3)
            throw r3
        L21:
            d51 r3 = r1.B
            r3.getClass()
            java.lang.Object r3 = r3.B
            qn2 r3 = (defpackage.qn2) r3
            r3.g(r4)
            return
    }
}
