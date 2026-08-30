package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vz2  reason: default package */
/* loaded from: classes.dex */
public final class vz2 extends m74 {
    public static final oi Q0;
    public final lm6 O0;
    public uz2 P0;

    static {
        oi e = dk7.e();
        int i = xq0.i;
        e.l(xq0.e);
        e.s(1.0f);
        e.t(1);
        Q0 = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, lm6] */
    /* JADX WARN: Type inference failed for: r3v4, types: [hs3] */
    public vz2(vf3 vf3Var) {
        super(vf3Var);
        uz2 uz2Var;
        ?? yy3Var = new yy3();
        yy3Var.R = 0;
        this.O0 = yy3Var;
        yy3Var.c0 = this;
        if (vf3Var.d0 != null) {
            uz2Var = new hs3(this);
        } else {
            uz2Var = null;
        }
        this.P0 = uz2Var;
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        k91 t = this.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.i((m74) vf3Var.A0.e, vf3Var.m(), i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hs3, uz2] */
    @Override // defpackage.m74
    public final void T0() {
        if (this.P0 == null) {
            this.P0 = new hs3(this);
        }
    }

    @Override // defpackage.m74
    public final hs3 W0() {
        return this.P0;
    }

    @Override // defpackage.m74
    public final yy3 Y0() {
        return this.O0;
    }

    @Override // defpackage.mv3
    public final yn4 c(long j) {
        if (this.l0) {
            uz2 uz2Var = this.P0;
            uz2Var.getClass();
            j = uz2Var.R;
        }
        q0(j);
        vf3 vf3Var = this.j0;
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((vf3) objArr[i2]).B0.p.g0 = tf3.NotUsed;
        }
        r1(vf3Var.r0.f(this, vf3Var.m(), j));
        i1();
        return this;
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        k91 t = this.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.b((m74) vf3Var.A0.e, vf3Var.m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(defpackage.k74 r12, long r13, defpackage.yr2 r15, int r16, boolean r17) {
        /*
            r11 = this;
            vf3 r0 = r11.j0
            boolean r1 = r12.l(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.z1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.X0()
            float r11 = r11.Q0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.L
            o24 r0 = r0.x()
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            vf3 r5 = (defpackage.vf3) r5
            boolean r2 = r5.I()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.i(r5, r6, r8, r9, r10)
            long r2 = r15.b()
            float r6 = defpackage.f34.G(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = defpackage.f34.J(r2)
            if (r6 == 0) goto L73
            boolean r2 = defpackage.f34.I(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.j(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.L = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz2.e1(k74, long, yr2, int, boolean):void");
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        k91 t = this.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.a((m74) vf3Var.A0.e, vf3Var.m(), i);
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        k91 t = this.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.g((m74) vf3Var.A0.e, vf3Var.m(), i);
    }

    @Override // defpackage.m74
    public final void n1(oh0 oh0Var, pn2 pn2Var) {
        vf3 vf3Var = this.j0;
        wg4 a = yf3.a(vf3Var);
        o24 x = vf3Var.x();
        Object[] objArr = x.A;
        int i = x.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (vf3Var2.I()) {
                vf3Var2.i(oh0Var, pn2Var);
            }
        }
        if (((ee) a).getShowLayoutBounds()) {
            long j = this.L;
            oh0Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Q0);
        }
    }

    @Override // defpackage.yn4
    public final void o0(long j, float f, mi2 mi2Var) {
        if (this.k0) {
            hs3 W0 = W0();
            W0.getClass();
            o1(W0.k0, f, mi2Var);
        } else {
            o1(j, f, mi2Var);
        }
        if (this.e0) {
            return;
        }
        this.j0.B0.p.z0();
    }

    @Override // defpackage.fs3
    public final int t0(ds2 ds2Var) {
        uz2 uz2Var = this.P0;
        if (uz2Var != null) {
            return uz2Var.t0(ds2Var);
        }
        sv3 sv3Var = this.j0.B0.p;
        wf3 wf3Var = sv3Var.s0;
        if (!sv3Var.h0) {
            if (sv3Var.Y.d == rf3.Measuring) {
                wf3Var.f = true;
                if (wf3Var.b) {
                    sv3Var.q0 = true;
                    sv3Var.r0 = true;
                }
            } else {
                wf3Var.g = true;
            }
        }
        vz2 r = sv3Var.r();
        boolean z = r.f0;
        r.f0 = true;
        sv3Var.v();
        r.f0 = z;
        Integer num = (Integer) wf3Var.i.get(ds2Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
