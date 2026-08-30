package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ String B;
    public final /* synthetic */ String L;

    public /* synthetic */ x7(String str, int i, String str2) {
        this.B = str;
        this.L = str2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ir6.b(this.B, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((c17) sk2Var.j(d17.b)).i, sk2Var, 0, 3120, 55294);
                    f34.a(this.L, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, null, sk2Var, 0, 120830);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                pu.d(this.B, this.L, (tu0) obj, ep2.I(7));
                return o27Var;
        }
    }

    public /* synthetic */ x7(String str, String str2) {
        this.B = str;
        this.L = str2;
    }
}
