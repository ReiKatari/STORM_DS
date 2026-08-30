package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xf3  reason: default package */
/* loaded from: classes.dex */
public final class xf3 implements hk1 {
    public final rh0 A = new rh0();
    public gk1 B;

    @Override // defpackage.hk1
    public final void A(long j, long j2, long j3, long j4, ik1 ik1Var, float f) {
        this.A.A(j, j2, j3, j4, ik1Var, f);
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.A.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.A.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.A.b() * f;
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return f / this.A.b();
    }

    @Override // defpackage.hk1
    public final void F(long j, long j2, long j3, float f, ik1 ik1Var, int i) {
        this.A.F(j, j2, j3, f, ik1Var, i);
    }

    @Override // defpackage.hk1
    public final void G(long j, float f, float f2, long j2, long j3, float f3, hh6 hh6Var) {
        this.A.G(j, f, f2, j2, j3, f3, hh6Var);
    }

    @Override // defpackage.hk1
    public final os I() {
        return this.A.B;
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.A.P(j);
    }

    @Override // defpackage.hk1
    public final void S(long j, long j2, long j3, ik1 ik1Var) {
        this.A.S(j, j2, j3, ik1Var);
    }

    @Override // defpackage.hk1
    public final void U(ArrayList arrayList, long j, float f) {
        this.A.U(arrayList, j, f);
    }

    @Override // defpackage.hk1
    public final void X(nh nhVar, long j, long j2, long j3, float f, b30 b30Var, int i) {
        this.A.X(nhVar, j, j2, j3, f, b30Var, i);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.A.Y(f);
    }

    public final void a() {
        rh0 rh0Var = this.A;
        oh0 s = rh0Var.B.s();
        gk1 gk1Var = this.B;
        if (gk1Var != null) {
            yy3 yy3Var = (yy3) gk1Var;
            xc1 xc1Var = yy3Var.A.Y;
            if (xc1Var != null && (xc1Var.R & 4) != 0) {
                while (xc1Var != null) {
                    int i = xc1Var.L;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        xc1Var = xc1Var.Y;
                    }
                }
            }
            xc1Var = null;
            if (xc1Var != null) {
                o24 o24Var = null;
                while (xc1Var != null) {
                    if (xc1Var instanceof gk1) {
                        gk1 gk1Var2 = (gk1) xc1Var;
                        pn2 pn2Var = (pn2) rh0Var.B.L;
                        m74 N = l.N(gk1Var2, 4);
                        long U = hk2.U(N.L);
                        vf3 vf3Var = N.j0;
                        vf3Var.getClass();
                        ((ee) yf3.a(vf3Var)).getSharedDrawScope().c(s, U, N, gk1Var2, pn2Var);
                    } else if ((xc1Var.L & 4) != 0 && (xc1Var instanceof xc1)) {
                        int i2 = 0;
                        for (yy3 yy3Var2 = xc1Var.k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                            if ((yy3Var2.L & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    xc1Var = yy3Var2;
                                } else {
                                    if (o24Var == null) {
                                        o24Var = new o24(new yy3[16]);
                                    }
                                    if (xc1Var != null) {
                                        o24Var.b(xc1Var);
                                        xc1Var = null;
                                    }
                                    o24Var.b(yy3Var2);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    xc1Var = l.p(o24Var);
                }
                return;
            }
            m74 N2 = l.N(gk1Var, 4);
            if (N2.Y0() == yy3Var.A) {
                N2 = N2.m0;
                N2.getClass();
            }
            N2.n1(s, (pn2) rh0Var.B.L);
            return;
        }
        throw b31.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.b();
    }

    public final void c(oh0 oh0Var, long j, m74 m74Var, gk1 gk1Var, pn2 pn2Var) {
        gk1 gk1Var2 = this.B;
        this.B = gk1Var;
        sd3 sd3Var = m74Var.j0.u0;
        rh0 rh0Var = this.A;
        od1 v = rh0Var.B.v();
        os osVar = rh0Var.B;
        sd3 A = osVar.A();
        oh0 s = osVar.s();
        long E = osVar.E();
        pn2 pn2Var2 = (pn2) osVar.L;
        osVar.O(m74Var);
        osVar.P(sd3Var);
        osVar.N(oh0Var);
        osVar.Q(j);
        osVar.L = pn2Var;
        oh0Var.m();
        try {
            gk1Var.T(this);
            oh0Var.j();
            osVar.O(v);
            osVar.P(A);
            osVar.N(s);
            osVar.Q(E);
            osVar.L = pn2Var2;
            this.B = gk1Var2;
        } catch (Throwable th) {
            oh0Var.j();
            osVar.O(v);
            osVar.P(A);
            osVar.N(s);
            osVar.Q(E);
            osVar.L = pn2Var2;
            throw th;
        }
    }

    @Override // defpackage.hk1
    public final long d() {
        return this.A.d();
    }

    @Override // defpackage.hk1
    public final void d0(long j, long j2, long j3, float f, int i) {
        this.A.d0(j, j2, j3, f, i);
    }

    public final void e(b60 b60Var, long j, long j2, long j3, float f, ik1 ik1Var) {
        rh0 rh0Var = this.A;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        rh0Var.A.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), rh0Var.c(b60Var, ik1Var, f, null, 3, 1));
    }

    @Override // defpackage.hk1
    public final long f0() {
        return this.A.f0();
    }

    @Override // defpackage.hk1
    public final void g(b60 b60Var, long j, long j2, float f, ik1 ik1Var, int i) {
        this.A.g(b60Var, j, j2, f, ik1Var, i);
    }

    @Override // defpackage.hk1
    public final sd3 getLayoutDirection() {
        return this.A.A.b;
    }

    @Override // defpackage.hk1
    public final void i(vi viVar, b60 b60Var, float f, ik1 ik1Var, int i) {
        this.A.i(viVar, b60Var, f, ik1Var, i);
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.A.i0(j);
    }

    @Override // defpackage.hk1
    public final void j(vi viVar, long j, float f, ik1 ik1Var) {
        this.A.j(viVar, j, f, ik1Var);
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.A.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.o();
    }

    @Override // defpackage.hk1
    public final void u0(long j, float f, long j2, ik1 ik1Var) {
        this.A.u0(j, f, j2, ik1Var);
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.A.v0(f);
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.A.z(f);
    }
}
