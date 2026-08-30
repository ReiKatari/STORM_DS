package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pf3  reason: default package */
/* loaded from: classes.dex */
public final class pf3 extends m74 {
    public static final oi S0;
    public mf3 O0;
    public lz0 P0;
    public nf3 Q0;
    public et R0;

    static {
        oi e = dk7.e();
        int i = xq0.i;
        e.l(xq0.f);
        e.s(1.0f);
        e.t(1);
        S0 = e;
    }

    public pf3(vf3 vf3Var, mf3 mf3Var) {
        super(vf3Var);
        nf3 nf3Var;
        this.O0 = mf3Var;
        if (vf3Var.d0 != null) {
            nf3Var = new nf3(this);
        } else {
            nf3Var = null;
        }
        this.Q0 = nf3Var;
        this.R0 = (((yy3) mf3Var).A.L & 512) != 0 ? new et(this, (q36) mf3Var) : null;
    }

    public final void A1(mf3 mf3Var) {
        if (!mf3Var.equals(this.O0)) {
            if ((((yy3) mf3Var).A.L & 512) != 0) {
                q36 q36Var = (q36) mf3Var;
                et etVar = this.R0;
                if (etVar != null) {
                    etVar.B = q36Var;
                } else {
                    etVar = new et(this, q36Var);
                }
                this.R0 = etVar;
            } else {
                this.R0 = null;
            }
        }
        this.O0 = mf3Var;
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        et etVar = this.R0;
        if (etVar != null) {
            q36 q36Var = etVar.B;
            m74 m74Var = this.m0;
            m74Var.getClass();
            m74 m74Var2 = q36Var.A.c0;
            m74Var2.getClass();
            hs3 W0 = m74Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return q36Var.R0(new bt(etVar, etVar.getLayoutDirection()), new ga1(m74Var, p74.Min, q74.Width, 2), nz0.b(0, 0, 0, i, 7)).c();
            }
            return m74Var.T(i);
        }
        mf3 mf3Var = this.O0;
        m74 m74Var3 = this.m0;
        m74Var3.getClass();
        return mf3Var.Z(this, m74Var3, i);
    }

    @Override // defpackage.m74
    public final void T0() {
        if (this.Q0 == null) {
            this.Q0 = new nf3(this);
        }
    }

    @Override // defpackage.m74
    public final hs3 W0() {
        return this.Q0;
    }

    @Override // defpackage.m74
    public final yy3 Y0() {
        return ((yy3) this.O0).A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r10 == r2.B) goto L25;
     */
    @Override // defpackage.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yn4 c(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.l0
            r1 = 0
            if (r0 == 0) goto L12
            lz0 r9 = r8.P0
            if (r9 == 0) goto Lc
            long r9 = r9.a
            goto L12
        Lc:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            defpackage.i.i(r8)
            return r1
        L12:
            r8.q0(r9)
            et r0 = r8.R0
            if (r0 == 0) goto Lc5
            q36 r2 = r0.B
            pf3 r3 = r0.A
            nf3 r3 = r3.Q0
            r3.getClass()
            uv3 r3 = r3.G0()
            r3.c()
            r3.a()
            w36 r3 = r2.l0
            boolean r3 = r3.h()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L51
            w36 r3 = r2.l0
            u36 r3 = r3.e()
            boolean r3 = r3.a()
            if (r3 == 0) goto L51
            w36 r3 = r2.l0
            u36 r3 = r3.e()
            g56 r3 = r3.b
            boolean r3 = r3.b()
            if (r3 == 0) goto L51
            goto L5c
        L51:
            lz0 r3 = r8.P0
            if (r3 != 0) goto L56
            goto L5c
        L56:
            long r6 = r3.a
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 == 0) goto L5e
        L5c:
            r3 = r4
            goto L5f
        L5e:
            r3 = r5
        L5f:
            r0.L = r3
            if (r3 != 0) goto L6a
            m74 r3 = r8.m0
            r3.getClass()
            r3.l0 = r4
        L6a:
            m74 r3 = r8.m0
            r3.getClass()
            uv3 r9 = r2.R0(r0, r3, r9)
            m74 r10 = r8.m0
            r10.getClass()
            r10.l0 = r5
            int r10 = r9.c()
            nf3 r2 = r8.Q0
            r2.getClass()
            int r2 = r2.A
            if (r10 != r2) goto L95
            int r10 = r9.a()
            nf3 r2 = r8.Q0
            r2.getClass()
            int r2 = r2.B
            if (r10 != r2) goto L95
            goto L96
        L95:
            r4 = r5
        L96:
            boolean r10 = r0.L
            if (r10 != 0) goto Ld0
            m74 r10 = r8.m0
            r10.getClass()
            long r2 = r10.L
            m74 r10 = r8.m0
            r10.getClass()
            hs3 r10 = r10.W0()
            if (r10 == 0) goto Lb6
            long r0 = r10.O0()
            i33 r10 = new i33
            r10.<init>(r0)
            r1 = r10
        Lb6:
            boolean r10 = defpackage.i33.a(r2, r1)
            if (r10 == 0) goto Ld0
            if (r4 != 0) goto Ld0
            of3 r10 = new of3
            r10.<init>(r9, r8)
            r9 = r10
            goto Ld0
        Lc5:
            mf3 r0 = r8.O0
            m74 r1 = r8.m0
            r1.getClass()
            uv3 r9 = r0.e(r8, r1, r9)
        Ld0:
            r8.r1(r9)
            r8.i1()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf3.c(long):yn4");
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        et etVar = this.R0;
        if (etVar != null) {
            q36 q36Var = etVar.B;
            m74 m74Var = this.m0;
            m74Var.getClass();
            m74 m74Var2 = q36Var.A.c0;
            m74Var2.getClass();
            hs3 W0 = m74Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return q36Var.R0(new bt(etVar, etVar.getLayoutDirection()), new ga1(m74Var, p74.Max, q74.Width, 2), nz0.b(0, 0, 0, i, 7)).c();
            }
            return m74Var.e0(i);
        }
        mf3 mf3Var = this.O0;
        m74 m74Var3 = this.m0;
        m74Var3.getClass();
        return mf3Var.h(this, m74Var3, i);
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        et etVar = this.R0;
        if (etVar != null) {
            q36 q36Var = etVar.B;
            m74 m74Var = this.m0;
            m74Var.getClass();
            m74 m74Var2 = q36Var.A.c0;
            m74Var2.getClass();
            hs3 W0 = m74Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return q36Var.R0(new bt(etVar, etVar.getLayoutDirection()), new ga1(m74Var, p74.Max, q74.Height, 2), nz0.b(0, i, 0, 0, 13)).a();
            }
            return m74Var.f(i);
        }
        mf3 mf3Var = this.O0;
        m74 m74Var3 = this.m0;
        m74Var3.getClass();
        return mf3Var.r(this, m74Var3, i);
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        et etVar = this.R0;
        if (etVar != null) {
            q36 q36Var = etVar.B;
            m74 m74Var = this.m0;
            m74Var.getClass();
            m74 m74Var2 = q36Var.A.c0;
            m74Var2.getClass();
            hs3 W0 = m74Var2.W0();
            W0.getClass();
            if (W0.C0()) {
                return q36Var.R0(new bt(etVar, etVar.getLayoutDirection()), new ga1(m74Var, p74.Min, q74.Height, 2), nz0.b(0, i, 0, 0, 13)).a();
            }
            return m74Var.g0(i);
        }
        mf3 mf3Var = this.O0;
        m74 m74Var3 = this.m0;
        m74Var3.getClass();
        return mf3Var.H(this, m74Var3, i);
    }

    @Override // defpackage.m74
    public final void n1(oh0 oh0Var, pn2 pn2Var) {
        m74 m74Var;
        m74 m74Var2 = this.m0;
        m74Var2.getClass();
        m74Var2.R0(oh0Var, pn2Var);
        if (((ee) yf3.a(this.j0)).getShowLayoutBounds() && (m74Var = this.m0) != null) {
            if (!i33.b(this.L, m74Var.L) || !a33.a(m74Var.w0, 0L)) {
                long j = this.L;
                oh0Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, S0);
            }
        }
    }

    @Override // defpackage.yn4
    public final void o0(long j, float f, mi2 mi2Var) {
        boolean z;
        i33 i33Var;
        if (this.k0) {
            hs3 W0 = W0();
            W0.getClass();
            o1(W0.k0, f, mi2Var);
        } else {
            o1(j, f, mi2Var);
        }
        if (!this.e0) {
            j1();
            m74 m74Var = this.m0;
            m74Var.getClass();
            et etVar = this.R0;
            if (etVar != null) {
                this.Q0.getClass();
                if (!etVar.L) {
                    long j2 = this.L;
                    nf3 nf3Var = this.Q0;
                    i33 i33Var2 = null;
                    if (nf3Var != null) {
                        i33Var = new i33(nf3Var.O0());
                    } else {
                        i33Var = null;
                    }
                    if (i33.a(j2, i33Var)) {
                        long j3 = m74Var.L;
                        hs3 W02 = m74Var.W0();
                        if (W02 != null) {
                            i33Var2 = new i33(W02.O0());
                        }
                        if (i33.a(j3, i33Var2)) {
                            z = true;
                            m74Var.k0 = z;
                        }
                    }
                }
                z = false;
                m74Var.k0 = z;
            }
            m74Var.f0 = this.f0;
            G0().b();
            m74Var.f0 = false;
            m74Var.k0 = false;
        }
    }

    @Override // defpackage.fs3
    public final int t0(ds2 ds2Var) {
        nf3 nf3Var = this.Q0;
        if (nf3Var != null) {
            s14 s14Var = nf3Var.o0;
            int d = s14Var.d(ds2Var);
            if (d >= 0) {
                return s14Var.c[d];
            }
            return Integer.MIN_VALUE;
        }
        return cg2.o(this, ds2Var);
    }
}
