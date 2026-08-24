package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a17  reason: default package */
/* loaded from: classes.dex */
public final class a17 extends defpackage.zg1 implements defpackage.fy0, defpackage.m07 {
    public defpackage.rr6 m0;
    public defpackage.wc0 n0;
    public defpackage.k27 o0;
    public defpackage.s51 p0;
    public defpackage.ap6 q0;
    public final defpackage.ii1 r0;
    public defpackage.of5 s0;

    public a17(defpackage.rr6 r1, defpackage.wc0 r2, defpackage.k27 r3, defpackage.s51 r4) {
            r0 = this;
            r0.<init>()
            r0.m0 = r1
            r0.n0 = r2
            r0.o0 = r3
            r0.p0 = r4
            t46 r1 = new t46
            r2 = 14
            r1.<init>(r0, r2)
            ii1 r1 = defpackage.np2.I(r1)
            r0.r0 = r1
            of5 r1 = defpackage.of5.e
            r0.s0 = r1
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r2 = this;
            rr6 r0 = r2.m0
            j87 r1 = defpackage.j87.Attached
            r0.L = r1
            r0.B = r2
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            rr6 r1 = r1.m0
            j87 r0 = defpackage.j87.Detached
            r1.L = r0
            r0 = 0
            r1.B = r0
            return
    }

    @Override // defpackage.m07
    public final defpackage.l07 R() {
            r0 = this;
            ii1 r0 = r0.r0
            java.lang.Object r0 = r0.getValue()
            l07 r0 = (defpackage.l07) r0
            return r0
    }

    @Override // defpackage.m07
    public final long i(defpackage.jk3 r1) {
            r0 = this;
            of5 r0 = r0.l(r1)
            long r0 = r0.d()
            return r0
    }

    @Override // defpackage.m07
    public final defpackage.of5 l(defpackage.jk3 r2) {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 != 0) goto L7
            of5 r1 = r1.s0
            return r1
        L7:
            s51 r0 = r1.p0
            java.lang.Object r2 = r0.g(r2)
            of5 r2 = (defpackage.of5) r2
            if (r2 != 0) goto L14
            of5 r1 = r1.s0
            return r1
        L14:
            r1.s0 = r2
            return r2
    }
}
