package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e2 extends b3.o implements a4.a0, a4.x1, a4.p {

    /* renamed from: i0  reason: collision with root package name */
    public y1 f2416i0;

    @Override // b3.o
    public final void G0() {
        a4.l.p(this, this.f2416i0.R);
        this.f2416i0.getClass();
    }

    @Override // b3.o
    public final void H0() {
        this.f2416i0.getClass();
    }

    @Override // a4.x1
    public final void J() {
        this.f2416i0.f();
        a4.l.p(this, this.f2416i0.R);
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        y3.i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new a4.q0(x0Var, this, e6, 5));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Comparator] */
    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        h3.c c4;
        k3.b bVar = r0Var.A;
        r0Var.a();
        z2.p pVar = this.f2416i0.Z;
        if (pVar.size() > 1) {
            zb.o.I(pVar, new Object());
        }
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            q1 q1Var = (q1) pVar.get(i2);
            l3.b bVar2 = (l3.b) q1Var.f2512g0.getValue();
            if (bVar2 != null && (c4 = q1Var.e().f2496c.d().c()) != null && q1Var.g()) {
                long d4 = c4.d();
                float intBitsToFloat = Float.intBitsToFloat((int) (d4 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (d4 & 4294967295L));
                i3.h hVar = q1Var.f2509d0;
                if (hVar != null) {
                    a4.n nVar = bVar.B;
                    long t5 = nVar.t();
                    nVar.p().p();
                    try {
                        ((a4.n) ((d2.t) nVar.B).B).p().h(hVar);
                        ((d2.t) bVar.B.B).F(intBitsToFloat, intBitsToFloat2);
                        k0.d.t(r0Var, bVar2);
                    } finally {
                        w.d.y(nVar, t5);
                    }
                } else {
                    ((d2.t) bVar.B.B).F(intBitsToFloat, intBitsToFloat2);
                    try {
                        k0.d.t(r0Var, bVar2);
                    } finally {
                        ((d2.t) bVar.B.B).F(-intBitsToFloat, -intBitsToFloat2);
                    }
                }
            }
        }
    }
}
