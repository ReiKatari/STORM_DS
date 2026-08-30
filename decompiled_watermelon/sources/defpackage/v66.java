package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v66  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v66 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x66 B;

    public /* synthetic */ v66(x66 x66Var) {
        this.A = 2;
        this.B = x66Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        x66 x66Var = this.B;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ve2.f(x66Var, tu0Var, ep2.I(1));
                return o27Var;
            case 1:
                num.getClass();
                ve2.f(x66Var, tu0Var, ep2.I(1));
                return o27Var;
            case 2:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    String X = me2.X(sk2Var, R.string.cancel);
                    boolean f = sk2Var.f(x66Var);
                    Object L = sk2Var.L();
                    if (f || L == su0.a) {
                        L = new u66(x66Var, 0);
                        sk2Var.h0(L);
                    }
                    mh7.e(X, false, (ki2) L, sk2Var, 0, 2);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                num.getClass();
                ve2.f(x66Var, tu0Var, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ v66(x66 x66Var, int i, int i2) {
        this.A = i2;
        this.B = x66Var;
    }
}
