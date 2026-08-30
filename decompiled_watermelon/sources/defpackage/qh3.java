package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qh3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ ej3 L;

    public /* synthetic */ qh3(ej3 ej3Var, int i, int i2) {
        this.A = i2;
        this.L = ej3Var;
        this.B = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z3 = false;
        int i2 = this.B;
        ej3 ej3Var = this.L;
        switch (i) {
            case 0:
                rh3 rh3Var = (rh3) ej3Var;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z3)) {
                    p43 d = rh3Var.b.e.d(i2);
                    ((mh3) d.c).d.q(th3.a, Integer.valueOf(i2 - d.a), sk2Var, 6);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                fk3 fk3Var = (fk3) ej3Var;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    p43 d2 = fk3Var.b.d.d(i2);
                    ((ck3) d2.c).c.q(fk3Var.c, Integer.valueOf(i2 - d2.a), sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                xh4 xh4Var = (xh4) ej3Var;
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z2)) {
                    p43 d3 = xh4Var.b.u().d(i2);
                    ((sh4) d3.c).b.q(ai4.a, Integer.valueOf(i2 - d3.a), sk2Var3, 0);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
        }
    }
}
