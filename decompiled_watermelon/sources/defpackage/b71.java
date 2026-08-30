package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b71  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b71 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ a71 B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ aj2 R;

    public /* synthetic */ b71(a71 a71Var, mi2 mi2Var, aj2 aj2Var, int i) {
        this.A = i;
        this.B = a71Var;
        this.L = mi2Var;
        this.R = aj2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        int i2 = this.A;
        o27 o27Var = o27.a;
        boolean z2 = true;
        a71 a71Var = this.B;
        switch (i2) {
            case 0:
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).f(ih4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18) {
                    z2 = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    if (a71Var instanceof z61) {
                        sk2Var.X(578442313);
                        n40.w(b53.W(o76.c, ih4Var), sk2Var, 0);
                        sk2Var.p(false);
                    } else if (a71Var instanceof y61) {
                        sk2Var.X(578595236);
                        n40.l(o76.c, ih4Var, ((y61) a71Var).a, this.L, this.R, null, sk2Var, ((intValue << 3) & 112) | 6, 32);
                        sk2Var.p(false);
                    } else if (a71Var instanceof x61) {
                        sk2Var.X(578989835);
                        n40.o(b53.W(o76.c, ih4Var), sk2Var, 0);
                        sk2Var.p(false);
                    } else {
                        throw ej6.d(sk2Var, -396984452, false);
                    }
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ih4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(1 & intValue2, z)) {
                    boolean z3 = a71Var instanceof z61;
                    wy3 wy3Var = wy3.a;
                    if (z3) {
                        sk2Var2.X(-134727535);
                        n40.w(o76.c(wy3Var, 1.0f), sk2Var2, 6);
                        sk2Var2.p(false);
                    } else if (a71Var instanceof y61) {
                        sk2Var2.X(-134585958);
                        n40.l(wy3Var, new mh4(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1), ((y61) a71Var).a, this.L, this.R, new mh4(24.0f, 8.0f, 24.0f, 8.0f), sk2Var2, 196662, 0);
                        sk2Var2.p(false);
                    } else if (a71Var instanceof x61) {
                        sk2Var2.X(-134096685);
                        n40.o(o76.c(wy3Var, 1.0f), sk2Var2, 6);
                        sk2Var2.p(false);
                    } else {
                        throw ej6.d(sk2Var2, -1528368504, false);
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
