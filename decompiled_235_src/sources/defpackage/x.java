package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ h0 B;

    public /* synthetic */ x(h0 h0Var, int i) {
        this.A = i;
        this.B = h0Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        xg1 xg1Var;
        int i = this.A;
        h0 h0Var = this.B;
        switch (i) {
            case 0:
                n43 n43Var = (n43) hf.K(h0Var, k43.a);
                if (n43Var == null) {
                    s53.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + n43Var);
                }
                n43 n43Var2 = h0Var.u0;
                h0Var.u0 = n43Var;
                if (n43Var2 != null && !nb3.k(n43Var, n43Var2) && ((xg1Var = h0Var.w0) != null || !h0Var.D0)) {
                    if (xg1Var != null) {
                        h0Var.S0(xg1Var);
                    }
                    h0Var.w0 = null;
                    h0Var.b1();
                }
                return jg7.a;
            default:
                h0Var.s0.c();
                return Boolean.TRUE;
        }
    }
}
