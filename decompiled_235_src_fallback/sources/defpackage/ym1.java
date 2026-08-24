package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym1  reason: default package */
/* loaded from: classes.dex */
public final class ym1 extends defpackage.z64 implements defpackage.ub7, defpackage.kj3 {
    public defpackage.ym1 k0;
    public defpackage.ym1 l0;
    public long m0;

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            r0 = 0
            r1.l0 = r0
            r1.k0 = r0
            return
    }

    public final boolean R0() {
            r1 = this;
            ym1 r0 = r1.k0
            if (r0 != 0) goto Lf
            ym1 r1 = r1.l0
            if (r1 == 0) goto Ld
            boolean r1 = r1.R0()
            return r1
        Ld:
            r1 = 0
            return r1
        Lf:
            boolean r1 = r0.R0()
            return r1
    }

    public final void S0() {
            r1 = this;
            ym1 r0 = r1.l0
            if (r0 != 0) goto Lc
            ym1 r1 = r1.k0
            if (r1 == 0) goto Lb
            r1.S0()
        Lb:
            return
        Lc:
            r0.S0()
            return
    }

    public final void T0() {
            r1 = this;
            ym1 r0 = r1.l0
            if (r0 == 0) goto L7
            r0.T0()
        L7:
            ym1 r0 = r1.k0
            if (r0 == 0) goto Le
            r0.T0()
        Le:
            r0 = 0
            r1.k0 = r0
            return
    }

    public final void U0(defpackage.d51 r5) {
            r4 = this;
            ym1 r0 = r4.k0
            if (r0 == 0) goto L11
            long r1 = defpackage.mb3.E(r5)
            boolean r1 = defpackage.jw2.f(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L2d
        L11:
            z64 r1 = r4.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L19
            r1 = 0
            goto L2b
        L19:
            dh5 r1 = new dh5
            r1.<init>()
            ln r2 = new ln
            r3 = 2
            r2.<init>(r1, r4, r5, r3)
            defpackage.ii2.Y(r4, r2)
            java.lang.Object r1 = r1.A
            ub7 r1 = (defpackage.ub7) r1
        L2b:
            ym1 r1 = (defpackage.ym1) r1
        L2d:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            r1.S0()
            r1.U0(r5)
            ym1 r5 = r4.l0
            if (r5 == 0) goto L72
            r5.T0()
            goto L72
        L3f:
            if (r1 != 0) goto L51
            if (r0 == 0) goto L51
            ym1 r2 = r4.l0
            if (r2 == 0) goto L4d
            r2.S0()
            r2.U0(r5)
        L4d:
            r0.T0()
            goto L72
        L51:
            boolean r2 = defpackage.nb3.k(r1, r0)
            if (r2 != 0) goto L65
            if (r1 == 0) goto L5f
            r1.S0()
            r1.U0(r5)
        L5f:
            if (r0 == 0) goto L72
            r0.T0()
            goto L72
        L65:
            if (r1 == 0) goto L6b
            r1.U0(r5)
            goto L72
        L6b:
            ym1 r0 = r4.l0
            if (r0 == 0) goto L72
            r0.U0(r5)
        L72:
            r4.k0 = r1
            return
    }

    public final void V0() {
            r1 = this;
            ym1 r0 = r1.l0
            if (r0 != 0) goto Lc
            ym1 r1 = r1.k0
            if (r1 == 0) goto Lb
            r1.V0()
        Lb:
            return
        Lc:
            r0.V0()
            return
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long r1) {
            r0 = this;
            r0.m0 = r1
            return
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            vs0 r0 = defpackage.vs0.f0
            return r0
    }
}
