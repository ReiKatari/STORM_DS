package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ei  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ n24 B;
    public final /* synthetic */ k24 L;
    public final /* synthetic */ fw5 R;
    public final /* synthetic */ zy3 X;
    public final /* synthetic */ et0 Y;

    public /* synthetic */ ei(n24 n24Var, k24 k24Var, fw5 fw5Var, zy3 zy3Var, et0 et0Var) {
        this.B = n24Var;
        this.L = k24Var;
        this.R = fw5Var;
        this.X = zy3Var;
        this.Y = et0Var;
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
                    gk2.d(this.B, this.L, this.R, this.X, this.Y, sk2Var, 48);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                gk2.d(this.B, this.L, this.R, this.X, this.Y, (tu0) obj, ep2.I(49));
                return o27Var;
        }
    }

    public /* synthetic */ ei(n24 n24Var, k24 k24Var, fw5 fw5Var, zy3 zy3Var, et0 et0Var, int i) {
        this.B = n24Var;
        this.L = k24Var;
        this.R = fw5Var;
        this.X = zy3Var;
        this.Y = et0Var;
    }
}
