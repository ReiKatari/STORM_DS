package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bp6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bp6 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Float B;
    public final /* synthetic */ aj2 L;
    public final /* synthetic */ long R;

    public /* synthetic */ bp6(long j, Float f, aj2 aj2Var) {
        this.R = j;
        this.B = f;
        this.L = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = false;
        long j = this.R;
        aj2 aj2Var = this.L;
        Float f = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    dk7.a(e01.a.a(new xq0(j)), ct3.H0(-1624601445, new bp6(f, aj2Var, j), sk2Var), sk2Var, 56);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z)) {
                    if (f != null) {
                        sk2Var2.X(1484860324);
                        dk7.a(b01.a.a(f), aj2Var, sk2Var2, 8);
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(1485059902);
                        dk7.a(b01.a.a(Float.valueOf(xq0.d(j))), aj2Var, sk2Var2, 8);
                        sk2Var2.p(false);
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ bp6(Float f, aj2 aj2Var, long j) {
        this.B = f;
        this.L = aj2Var;
        this.R = j;
    }
}
