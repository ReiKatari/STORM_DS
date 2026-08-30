package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sz implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki2 B;

    public /* synthetic */ sz(int i, ki2 ki2Var) {
        this.A = 1;
        this.B = ki2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        ki2 ki2Var = this.B;
        o27 o27Var = o27.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    oo2.c(this.B, null, false, f34.c, sk2Var, 24576, 14);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                jv3.c(ki2Var, (tu0) obj, ep2.I(1));
                return o27Var;
            case 2:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    oo2.c(this.B, null, false, tq5.c, sk2Var2, 24576, 14);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 3:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z)) {
                    ye6 ye6Var = ir0.a;
                    long h = ((hr0) sk2Var3.j(ye6Var)).h();
                    is2 is2Var = iq2.g;
                    wy3 wy3Var = wy3.a;
                    zy3 m0 = mh7.m0(dk7.i(wy3Var, h, is2Var), mh7.q);
                    tv3 d = d50.d(y60.L, false);
                    int hashCode = Long.hashCode(sk2Var3.T);
                    sm4 l = sk2Var3.l();
                    zy3 e0 = l07.e0(sk2Var3, m0);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var3.b0();
                    if (sk2Var3.S) {
                        sk2Var3.k(mv0Var);
                    } else {
                        sk2Var3.k0();
                    }
                    oo2.S(sk2Var3, mu0.f, d);
                    oo2.S(sk2Var3, mu0.e, l);
                    oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var3, mu0.h);
                    oo2.S(sk2Var3, mu0.d, e0);
                    zy3 c = o76.c(wy3Var, 1.0f);
                    long a = ((hr0) sk2Var3.j(ye6Var)).a();
                    long c2 = ((hr0) sk2Var3.j(ye6Var)).c();
                    WeakHashMap weakHashMap = dg7.w;
                    up.b(n40.b, new g22(hm1.n(sk2Var3).l, new p82(Preference.DEFAULT_ORDER)), c, ct3.H0(459088347, new sz(ki2Var, 4, (byte) 0), sk2Var3), null, a, c2, RecyclerView.A1, sk2Var3, 3462, 144);
                    sk2Var3.p(true);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 4:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z2)) {
                    oo2.c(this.B, null, false, n40.c, sk2Var4, 24576, 14);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            default:
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z2)) {
                    mh7.e(me2.X(sk2Var5, R.string.cancel), false, this.B, sk2Var5, 0, 2);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ sz(ki2 ki2Var, int i, byte b) {
        this.A = i;
        this.B = ki2Var;
    }
}
