package a4;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 implements k3.d {
    public final k3.b A = new k3.b();
    public p B;

    @Override // k3.d
    public final void A(long j2, float f8, float f10, long j10, long j11, k3.e eVar) {
        this.A.A(j2, f8, f10, j10, j11, eVar);
    }

    @Override // k3.d
    public final n E() {
        return this.A.B;
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.A.G(j2);
    }

    @Override // k3.d
    public final void H(long j2, long j10, long j11, long j12, k3.e eVar, float f8) {
        this.A.H(j2, j10, j11, j12, eVar, f8);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.A.I(j2);
    }

    @Override // k3.d
    public final void L(ArrayList arrayList, long j2, float f8) {
        this.A.L(arrayList, j2, f8);
    }

    @Override // k3.d
    public final void N(i3.o oVar, long j2, long j10, float f8, k3.e eVar, int i2) {
        this.A.N(oVar, j2, j10, f8, eVar, i2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.A.O(f8);
    }

    @Override // k3.d
    public final void R(long j2, long j10, long j11, float f8, int i2) {
        this.A.R(j2, j10, j11, f8, i2);
    }

    @Override // k3.d
    public final long S() {
        return this.A.S();
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.A.W(j2);
    }

    @Override // k3.d
    public final void Y(i3.h hVar, long j2, k3.e eVar) {
        this.A.Y(hVar, j2, eVar);
    }

    public final void a() {
        k3.b bVar = this.A;
        i3.q p10 = bVar.B.p();
        p pVar = this.B;
        if (pVar != null) {
            b3.o oVar = (b3.o) pVar;
            k kVar = oVar.A.Y;
            if (kVar != null && (kVar.R & 4) != 0) {
                while (kVar != null) {
                    int i2 = kVar.L;
                    if ((i2 & 2) != 0) {
                        break;
                    } else if ((i2 & 4) != 0) {
                        break;
                    } else {
                        kVar = kVar.Y;
                    }
                }
            }
            kVar = null;
            if (kVar != null) {
                p2.b bVar2 = null;
                while (kVar != null) {
                    if (kVar instanceof p) {
                        p pVar2 = (p) kVar;
                        l3.b bVar3 = (l3.b) bVar.B.L;
                        r1 r5 = l.r(pVar2, 4);
                        long T = zb.k.T(r5.L);
                        o0 o0Var = r5.f315i0;
                        o0Var.getClass();
                        ((b4.x) s0.a(o0Var)).getSharedDrawScope().d(p10, T, r5, pVar2, bVar3);
                    } else if ((kVar.L & 4) != 0 && (kVar instanceof k)) {
                        int i10 = 0;
                        for (b3.o oVar2 = kVar.f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                            if ((oVar2.L & 4) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    kVar = oVar2;
                                } else {
                                    if (bVar2 == null) {
                                        bVar2 = new p2.b(new b3.o[16]);
                                    }
                                    if (kVar != null) {
                                        bVar2.b(kVar);
                                        kVar = null;
                                    }
                                    bVar2.b(oVar2);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    kVar = l.e(bVar2);
                }
                return;
            }
            r1 r10 = l.r(pVar, 4);
            if (r10.X0() == oVar.A) {
                r10 = r10.f318l0;
                r10.getClass();
            }
            r10.m1(p10, (l3.b) bVar.B.L);
            return;
        }
        throw w.d.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // x4.c
    public final float b() {
        return this.A.b();
    }

    @Override // k3.d
    public final long c() {
        return this.A.c();
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.A.c0(j2);
    }

    public final void d(i3.q qVar, long j2, r1 r1Var, p pVar, l3.b bVar) {
        p pVar2 = this.B;
        this.B = pVar;
        x4.m mVar = r1Var.f315i0.f296u0;
        k3.b bVar2 = this.A;
        x4.c q10 = bVar2.B.q();
        n nVar = bVar2.B;
        x4.m r5 = nVar.r();
        i3.q p10 = nVar.p();
        long t5 = nVar.t();
        l3.b bVar3 = (l3.b) nVar.L;
        nVar.H(r1Var);
        nVar.I(mVar);
        nVar.G(qVar);
        nVar.J(j2);
        nVar.L = bVar;
        qVar.p();
        try {
            pVar.z(this);
            qVar.m();
            nVar.H(q10);
            nVar.I(r5);
            nVar.G(p10);
            nVar.J(t5);
            nVar.L = bVar3;
            this.B = pVar2;
        } catch (Throwable th2) {
            qVar.m();
            nVar.H(q10);
            nVar.I(r5);
            nVar.G(p10);
            nVar.J(t5);
            nVar.L = bVar3;
            throw th2;
        }
    }

    public final void e(i3.o oVar, long j2, long j10, long j11, float f8, k3.e eVar) {
        k3.b bVar = this.A;
        int i2 = (int) (j2 >> 32);
        int i10 = (int) (j2 & 4294967295L);
        bVar.A.f7957c.c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), bVar.d(oVar, eVar, f8, null, 3, 1));
    }

    @Override // k3.d
    public final void f(long j2, long j10, long j11, float f8, k3.e eVar, int i2) {
        this.A.f(j2, j10, j11, f8, eVar, i2);
    }

    @Override // k3.d
    public final x4.m getLayoutDirection() {
        return this.A.A.f7956b;
    }

    @Override // k3.d
    public final void i(i3.f fVar, long j2, long j10, long j11, float f8, i3.l lVar, int i2) {
        this.A.i(fVar, j2, j10, j11, f8, lVar, i2);
    }

    @Override // x4.c
    public final float j() {
        return this.A.j();
    }

    @Override // k3.d
    public final void m(long j2, float f8, long j10, k3.e eVar) {
        this.A.m(j2, f8, j10, eVar);
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.A.m0(f8);
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.A.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.A.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.A.t0(i2);
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.A.b() * f8;
    }

    @Override // k3.d
    public final void x(i3.h hVar, i3.o oVar, float f8, k3.e eVar, int i2) {
        this.A.x(hVar, oVar, f8, eVar, i2);
    }

    @Override // x4.c
    public final float x0(float f8) {
        return f8 / this.A.b();
    }
}
