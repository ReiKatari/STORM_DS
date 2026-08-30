package defpackage;

import android.net.Uri;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kk5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kk5 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ kk5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        ti4 ti4Var = null;
        o27 o27Var = o27.a;
        RomDetailsActivity romDetailsActivity = this.B;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                int i2 = RomDetailsActivity.I0;
                str.getClass();
                str2.getClass();
                al5 A = romDetailsActivity.A();
                ee6 ee6Var = A.d;
                ee6Var.getClass();
                ee6Var.l(null, lp5.a);
                tq5.w(ua7.a(A), null, null, new re5(A, str, str2, null, 0), 3);
                return o27Var;
            case 1:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = RomDetailsActivity.I0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    rg5 rg5Var = (rg5) me2.m(((sl5) romDetailsActivity.B0.getValue()).g, sk2Var).getValue();
                    n6 n6Var = (n6) me2.m(romDetailsActivity.G0, sk2Var).getValue();
                    ti4 ti4Var2 = (ti4) me2.m(romDetailsActivity.H0, sk2Var).getValue();
                    if (n6Var != null) {
                        sk2Var.X(817961446);
                        pu.b(n6Var, sk2Var, 0);
                        sk2Var.p(false);
                    } else if (ti4Var2 != null) {
                        sk2Var.X(817964820);
                        pu.i(null, (String) ti4Var2.A, (String) ti4Var2.B, rg5Var.a, sk2Var, 6);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(-412655220);
                        Uri uri = rg5Var.d;
                        boolean h = sk2Var.h(romDetailsActivity) | sk2Var.h(rg5Var);
                        Object L = sk2Var.L();
                        if (h || L == su0.a) {
                            L = new qk5(romDetailsActivity, rg5Var, null, 1);
                            sk2Var.h0(L);
                        }
                        pu.f(rg5Var, (String) me2.J(uri, (aj2) L, sk2Var).getValue(), null, sk2Var, 0, 4);
                        sk2Var.p(false);
                    }
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                ee6 ee6Var2 = romDetailsActivity.H0;
                if (str3 != null) {
                    ti4Var = new ti4(str3, str4);
                }
                ee6Var2.k(ti4Var);
                return o27Var;
        }
    }
}
