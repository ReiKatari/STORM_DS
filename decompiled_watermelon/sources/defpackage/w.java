package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ g0 B;

    public /* synthetic */ w(g0 g0Var, int i) {
        this.A = i;
        this.B = g0Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        vc1 vc1Var;
        int i = this.A;
        g0 g0Var = this.B;
        switch (i) {
            case 0:
                jy2 jy2Var = (jy2) mh7.t(g0Var, gy2.a);
                if (jy2Var == null) {
                    pz2.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + jy2Var);
                }
                jy2 jy2Var2 = g0Var.t0;
                g0Var.t0 = jy2Var;
                if (jy2Var2 != null && !b53.x(jy2Var, jy2Var2) && ((vc1Var = g0Var.v0) != null || !g0Var.C0)) {
                    if (vc1Var != null) {
                        g0Var.S0(vc1Var);
                    }
                    g0Var.v0 = null;
                    g0Var.b1();
                }
                return o27.a;
            default:
                g0Var.r0.c();
                return Boolean.TRUE;
        }
    }
}
