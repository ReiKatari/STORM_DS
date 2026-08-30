package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ul1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ul1 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ float B;

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        float f = this.B;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mh7.i(f, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                num.getClass();
                mh7.i(f, tu0Var, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ ul1(int i, float f) {
        this.B = f;
    }
}
