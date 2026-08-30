package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ou0  reason: default package */
/* loaded from: classes.dex */
public final class ou0 extends ic3 implements aj2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ qu0 L;
    public final /* synthetic */ ee R;
    public final /* synthetic */ aj2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou0(ee eeVar, qu0 qu0Var, aj2 aj2Var) {
        super(2);
        this.R = eeVar;
        this.L = qu0Var;
        this.X = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        o27 o27Var = o27.a;
        aj2 aj2Var = this.X;
        ee eeVar = this.R;
        qu0 qu0Var = this.L;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    sk2Var.X(866651995);
                    ov0.a(eeVar, qu0Var.k, aj2Var, sk2Var, 0);
                    sk2Var.p(false);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ((Number) obj2).intValue();
                qu0Var.a(eeVar, aj2Var, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou0(qu0 qu0Var, ee eeVar, aj2 aj2Var, int i) {
        super(2);
        this.L = qu0Var;
        this.R = eeVar;
        this.X = aj2Var;
    }
}
