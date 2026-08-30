package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ n00(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    String upperCase = this.B.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    ir6.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tr5 tr5Var = (tr5) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    ir6.b(this.B, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 0, 0, 131070);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
