package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um3  reason: default package */
/* loaded from: classes.dex */
public final class um3 implements no1 {
    public final zj0 A = new zj0();
    public mo1 B;

    @Override // defpackage.no1
    public final void C(long j, long j2, long j3, float f, int i) {
        this.A.C(j, j2, j3, f, i);
    }

    @Override // defpackage.no1
    public final void L(long j, float f, long j2, oo1 oo1Var) {
        this.A.L(j, f, j2, oo1Var);
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return f / this.A.a();
    }

    @Override // defpackage.no1
    public final void W(f80 f80Var, long j, long j2, float f, oo1 oo1Var, int i) {
        this.A.W(f80Var, j, j2, f, oo1Var, i);
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a();
    }

    public final void b() {
        zj0 zj0Var = this.A;
        xj0 G = zj0Var.B.G();
        mo1 mo1Var = this.B;
        if (mo1Var != null) {
            z64 z64Var = (z64) mo1Var;
            zg1 zg1Var = z64Var.A.Y;
            if (zg1Var != null && (zg1Var.R & 4) != 0) {
                while (zg1Var != null) {
                    int i = zg1Var.L;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        zg1Var = zg1Var.Y;
                    }
                }
            }
            zg1Var = null;
            if (zg1Var != null) {
                ua4 ua4Var = null;
                while (zg1Var != null) {
                    if (zg1Var instanceof mo1) {
                        mo1 mo1Var2 = (mo1) zg1Var;
                        ut2 ut2Var = (ut2) zj0Var.B.L;
                        eg4 d0 = nc1.d0(mo1Var2, 4);
                        long S = qo2.S(d0.L);
                        sm3 sm3Var = d0.k0;
                        sm3Var.getClass();
                        ((te) vm3.a(sm3Var)).getSharedDrawScope().c(G, S, d0, mo1Var2, ut2Var);
                    } else if ((zg1Var.L & 4) != 0 && (zg1Var instanceof zg1)) {
                        int i2 = 0;
                        for (z64 z64Var2 = zg1Var.l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                            if ((z64Var2.L & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    zg1Var = z64Var2;
                                } else {
                                    if (ua4Var == null) {
                                        ua4Var = new ua4(new z64[16]);
                                    }
                                    if (zg1Var != null) {
                                        ua4Var.b(zg1Var);
                                        zg1Var = null;
                                    }
                                    ua4Var.b(z64Var2);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    zg1Var = nc1.A(ua4Var);
                }
                return;
            }
            eg4 d02 = nc1.d0(mo1Var, 4);
            if (d02.Y0() == z64Var.A) {
                d02 = d02.n0;
                d02.getClass();
            }
            d02.n1(G, (ut2) zj0Var.B.L);
            return;
        }
        throw i61.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    public final void c(xj0 xj0Var, long j, eg4 eg4Var, mo1 mo1Var, ut2 ut2Var) {
        mo1 mo1Var2 = this.B;
        this.B = mo1Var;
        kk3 kk3Var = eg4Var.k0.v0;
        zj0 zj0Var = this.A;
        qh1 I = zj0Var.B.I();
        bt btVar = zj0Var.B;
        kk3 K = btVar.K();
        xj0 G = btVar.G();
        long L = btVar.L();
        ut2 ut2Var2 = (ut2) btVar.L;
        btVar.W(eg4Var);
        btVar.X(kk3Var);
        btVar.V(xj0Var);
        btVar.Y(j);
        btVar.L = ut2Var;
        xj0Var.h();
        try {
            mo1Var.m0(this);
            xj0Var.p();
            btVar.W(I);
            btVar.X(K);
            btVar.V(G);
            btVar.Y(L);
            btVar.L = ut2Var2;
            this.B = mo1Var2;
        } catch (Throwable th) {
            xj0Var.p();
            btVar.W(I);
            btVar.X(K);
            btVar.V(G);
            btVar.Y(L);
            btVar.L = ut2Var2;
            throw th;
        }
    }

    @Override // defpackage.no1
    public final void c0(f80 f80Var, long j, long j2, long j3, float f, oo1 oo1Var) {
        this.A.c0(f80Var, j, j2, j3, f, oo1Var);
    }

    public final void d(long j, long j2, long j3, long j4, oo1 oo1Var, float f) {
        zj0 zj0Var = this.A;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        zj0Var.A.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), zj0.b(zj0Var, j, oo1Var, f, 3));
    }

    @Override // defpackage.no1
    public final long e() {
        return this.A.e();
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.a() * f;
    }

    @Override // defpackage.no1
    public final void g(hj hjVar, f80 f80Var, float f, oo1 oo1Var, int i) {
        this.A.g(hjVar, f80Var, f, oo1Var, i);
    }

    @Override // defpackage.no1
    public final void g0(long j, float f, float f2, long j2, long j3, float f3, ys6 ys6Var) {
        this.A.g0(j, f, f2, j2, j3, f3, ys6Var);
    }

    @Override // defpackage.no1
    public final kk3 getLayoutDirection() {
        return this.A.A.b;
    }

    @Override // defpackage.no1
    public final void h(hj hjVar, long j, float f, oo1 oo1Var) {
        this.A.h(hjVar, j, f, oo1Var);
    }

    @Override // defpackage.no1
    public final bt i0() {
        return this.A.B;
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    @Override // defpackage.no1
    public final void n0(ArrayList arrayList, long j, float f) {
        this.A.n0(arrayList, j, f);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.no1
    public final void q0(zh zhVar, long j, long j2, long j3, float f, z40 z40Var, int i) {
        this.A.q0(zhVar, j, j2, j3, f, z40Var, i);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.no1
    public final void s(long j, long j2, long j3, float f, oo1 oo1Var, int i) {
        this.A.s(j, j2, j3, f, oo1Var, i);
    }

    @Override // defpackage.no1
    public final long t0() {
        return this.A.t0();
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}
