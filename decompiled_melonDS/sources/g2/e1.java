package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ g1 B;

    public /* synthetic */ e1(g1 g1Var, int i2) {
        this.A = i2;
        this.B = g1Var;
    }

    @Override // mc.a
    public final Object b() {
        int i2 = this.A;
        g1 g1Var = this.B;
        switch (i2) {
            case 0:
                i3 i3Var = (i3) a4.l.h(g1Var, j3.f5198a);
                l2.a aVar = g1Var.f5158o0;
                if (i3Var == null) {
                    if (aVar != null) {
                        g1Var.P0(aVar);
                    }
                    g1Var.f5158o0 = null;
                } else if (aVar == null) {
                    f1 f1Var = new f1(0, g1Var);
                    e1 e1Var = new e1(g1Var, 1);
                    j1.i iVar = g1Var.f5154k0;
                    boolean z10 = g1Var.f5155l0;
                    float f8 = g1Var.f5156m0;
                    d1.v1 v1Var = l2.f.f8676a;
                    l2.a aVar2 = new l2.a(iVar, z10, f8, f1Var, e1Var);
                    g1Var.O0(aVar2);
                    g1Var.f5158o0 = aVar2;
                }
                return yb.y.f14813a;
            default:
                i3 i3Var2 = (i3) a4.l.h(g1Var, j3.f5198a);
                long j2 = ((i3.s) a4.l.h(g1Var, q0.f5361a)).f6689a;
                if (((l0) a4.l.h(g1Var, m0.f5257a)).k()) {
                    if (i3.z.r(j2) > 0.5d) {
                        return j3.f5201d;
                    }
                    return j3.f5202e;
                }
                return j3.f5203f;
        }
    }
}
