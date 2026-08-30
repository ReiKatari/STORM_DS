package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ g B;

    public /* synthetic */ a(g gVar, int i2) {
        this.A = i2;
        this.B = gVar;
    }

    @Override // mc.a
    public final Object b() {
        a4.j jVar;
        switch (this.A) {
            case 0:
                n2.b0 b0Var = x0.f4678a;
                g gVar = this.B;
                a1 a1Var = (a1) a4.l.h(gVar, b0Var);
                if (a1Var == null) {
                    k1.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + a1Var);
                }
                a1 a1Var2 = gVar.f4554s0;
                gVar.f4554s0 = a1Var;
                if (a1Var2 != null && !nc.k.a(a1Var, a1Var2) && ((jVar = gVar.f4556u0) != null || !gVar.B0)) {
                    if (jVar != null) {
                        gVar.P0(jVar);
                    }
                    gVar.f4556u0 = null;
                    gVar.Y0();
                }
                return yb.y.f14813a;
            default:
                this.B.f4552q0.b();
                return Boolean.TRUE;
        }
    }
}
