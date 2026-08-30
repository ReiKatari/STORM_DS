package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze1  reason: default package */
/* loaded from: classes.dex */
public final class ze1 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public ze1(l34 l34Var, gn gnVar) {
        this.A = 2;
        this.L = l34Var;
        this.B = gnVar;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    sk2 sk2Var = (sk2) tu0Var;
                    if (sk2Var.A()) {
                        sk2Var.R();
                        return o27Var;
                    }
                }
                ((df1) obj3).Z.i((l34) obj4, tu0Var, 0);
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.A()) {
                        sk2Var2.R();
                        return o27Var;
                    }
                }
                mj2.c((jt5) obj3, (et0) obj4, tu0Var2, 0);
                return o27Var;
            default:
                tu0 tu0Var3 = (tu0) obj;
                l34 l34Var = (l34) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    sk2 sk2Var3 = (sk2) tu0Var3;
                    if (sk2Var3.A()) {
                        sk2Var3.R();
                        return o27Var;
                    }
                }
                b44 b44Var = l34Var.B;
                b44Var.getClass();
                ((xt0) b44Var).Y.q((gn) obj3, l34Var, tu0Var3, 0);
                return o27Var;
        }
    }

    public /* synthetic */ ze1(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
