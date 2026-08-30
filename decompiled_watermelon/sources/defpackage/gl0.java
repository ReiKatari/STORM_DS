package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gl0 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pl0 B;
    public final /* synthetic */ ki2 L;

    public /* synthetic */ gl0(pl0 pl0Var, ki2 ki2Var, int i) {
        this.A = i;
        this.B = pl0Var;
        this.L = ki2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        o27 o27Var = o27.a;
        wy3 wy3Var = wy3.a;
        int i2 = 2;
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case 0:
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).f(ih4Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) == 18) {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    b53.e(o76.c(wy3Var, 1.0f), this.B, ih4Var, this.L, sk2Var, ((intValue << 6) & 896) | 6);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ih4 ih4Var2 = (ih4) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ih4Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ih4Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    zy3 Z = se.Z(l07.B(wy3Var, ih4Var2), se.R(sk2Var2));
                    ye6 ye6Var = ov0.n;
                    b53.e(Z, this.B, new mh4(b53.B(ih4Var2, (sd3) sk2Var2.j(ye6Var)) + 16.0f, ih4Var2.d() + 16.0f, b53.A(ih4Var2, (sd3) sk2Var2.j(ye6Var)) + 16.0f, ih4Var2.c() + 16.0f), this.L, sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
