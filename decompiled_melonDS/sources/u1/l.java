package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ o1 B;
    public final /* synthetic */ mc.l L;

    public /* synthetic */ l(o1 o1Var, mc.l lVar, int i2) {
        this.A = i2;
        this.B = o1Var;
        this.L = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                l4.o0 o0Var = (l4.o0) obj;
                o1 o1Var = this.B;
                if (o1Var != null) {
                    o1Var.f13376a.setValue(o0Var);
                }
                mc.l lVar = this.L;
                if (lVar != null) {
                    lVar.k(o0Var);
                }
                return yb.y.f14813a;
            default:
                n2.h0 h0Var = (n2.h0) obj;
                o1 o1Var2 = this.B;
                z2.p pVar = o1Var2.f13378c;
                mc.l lVar2 = this.L;
                pVar.add(lVar2);
                return new b4.o0(13, o1Var2, lVar2);
        }
    }
}
