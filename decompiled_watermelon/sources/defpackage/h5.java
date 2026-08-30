package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ h5(String str) {
        this.A = 2;
        this.B = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        String str = this.B;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n40.e(str, (tu0) obj, ep2.I(1));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                yx0.d(str, (tu0) obj, ep2.I(1));
                return o27Var;
            default:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ir6.b(this.B, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
                } else {
                    sk2Var.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ h5(String str, int i, int i2) {
        this.A = i2;
        this.B = str;
    }
}
