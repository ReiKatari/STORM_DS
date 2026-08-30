package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m96  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m96 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ p96 B;

    public /* synthetic */ m96(p96 p96Var, int i) {
        this.A = i;
        this.B = p96Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = false;
        p96 p96Var = this.B;
        switch (i) {
            case 0:
                et0 et0Var = l.e;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(1 & intValue, z)) {
                    p96Var.getClass();
                    et0Var.i(p96Var, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    ir6.b(p96Var.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 0, 0, 131070);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
