package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oh3 implements cj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ et0 B;

    public /* synthetic */ oh3(et0 et0Var, int i) {
        this.A = i;
        this.B = et0Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        int i2 = 2;
        et0 et0Var = this.B;
        switch (i) {
            case 0:
                th3 th3Var = (th3) obj;
                ((Integer) obj2).getClass();
                tu0 tu0Var = (tu0) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).f(th3Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 131) != 130) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    et0Var.i(th3Var, sk2Var, Integer.valueOf(intValue & 14));
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ni3 ni3Var = (ni3) obj;
                ((Integer) obj2).getClass();
                tu0 tu0Var2 = (tu0) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ni3Var)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 131) != 130) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    et0Var.i(ni3Var, sk2Var2, Integer.valueOf(intValue2 & 14));
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
