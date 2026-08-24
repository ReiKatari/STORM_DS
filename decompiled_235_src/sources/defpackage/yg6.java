package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg6  reason: default package */
/* loaded from: classes.dex */
public final class yg6 extends z64 implements jm3, gi4, mo1, fy0 {
    public sg6 k0;

    @Override // defpackage.z64
    public final void J0() {
        jx2.B(this, this.k0.R);
        this.k0.getClass();
    }

    @Override // defpackage.z64
    public final void K0() {
        this.k0.getClass();
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new ln(g34Var, this, y, 7));
    }

    @Override // defpackage.gi4
    public final void l0() {
        this.k0.f();
        jx2.B(this, this.k0.R);
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        of5 c;
        bt btVar;
        um3Var.b();
        sg6 sg6Var = this.k0;
        zj0 zj0Var = um3Var.A;
        mm6 mm6Var = sg6Var.Z;
        if (mm6Var.size() > 1) {
            jt0.x0(mm6Var, new tp5(8));
        }
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            if6 if6Var = (if6) mm6Var.get(i);
            ut2 ut2Var = (ut2) if6Var.i0.getValue();
            if (ut2Var != null && (c = if6Var.e().c.d().c()) != null && if6Var.g()) {
                long d = c.d();
                float intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (d & 4294967295L));
                hj hjVar = if6Var.f0;
                if (hjVar != null) {
                    bt btVar2 = zj0Var.B;
                    btVar = zj0Var.B;
                    long L = btVar2.L();
                    btVar2.G().h();
                    try {
                        ((bt) ((os0) btVar2.B).B).G().m(hjVar);
                        ((os0) btVar.B).g0(intBitsToFloat, intBitsToFloat2);
                        oi2.u(um3Var, ut2Var);
                    } finally {
                        xg6.v(btVar2, L);
                    }
                } else {
                    bt btVar3 = zj0Var.B;
                    btVar = zj0Var.B;
                    ((os0) btVar3.B).g0(intBitsToFloat, intBitsToFloat2);
                    try {
                        oi2.u(um3Var, ut2Var);
                    } finally {
                        ((os0) btVar.B).g0(-intBitsToFloat, -intBitsToFloat2);
                    }
                }
            }
        }
    }
}
