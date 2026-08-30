package defpackage;

import android.widget.TextView;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ b4(zy3 zy3Var, k24 k24Var, et0 et0Var, n10 n10Var, ki2 ki2Var) {
        this.A = 4;
        this.R = zy3Var;
        this.Y = k24Var;
        this.L = et0Var;
        this.X = n10Var;
        this.B = ki2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        boolean z2 = false;
        o27 o27Var = o27.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.L;
        Object obj6 = this.R;
        Object obj7 = this.B;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj7;
                ct1 ct1Var = (ct1) obj6;
                mi2 mi2Var = (mi2) obj5;
                ae6 ae6Var = (ae6) obj4;
                k24 k24Var = (k24) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    dk7.a(e01.a.a(new xq0(((hr0) sk2Var.j(ir0.a)).f())), ct3.H0(246518593, new c4(mj2.C(sk2Var), ki2Var, ct1Var, mi2Var, ae6Var, k24Var), sk2Var), sk2Var, 56);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                n40.t((zy3) obj6, (j15) obj4, (ql3) obj3, (ki2) obj7, (mi2) obj5, (tu0) obj, ep2.I(7));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                dt3.y((zy3) obj7, (ih4) obj6, (gn0) obj4, (mi2) obj5, (mi2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                dt3.G((zy3) obj7, (ih4) obj6, (List) obj4, (mi2) obj5, (mi2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 4:
                zy3 zy3Var = (zy3) obj6;
                k24 k24Var2 = (k24) obj3;
                et0 et0Var = (et0) obj5;
                n10 n10Var = (n10) obj4;
                ki2 ki2Var2 = (ki2) obj7;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    Object L = sk2Var2.L();
                    if (L == su0.a) {
                        L = new j4(k24Var2, 15);
                        sk2Var2.h0(L);
                    }
                    zy3 z3 = w81.z(zy3Var, (mi2) L);
                    tv3 d = d50.d(y60.L, true);
                    int hashCode = Long.hashCode(sk2Var2.T);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, z3);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, d);
                    oo2.S(sk2Var2, mu0.e, l);
                    oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var2, mu0.h);
                    oo2.S(sk2Var2, mu0.d, e0);
                    et0Var.j(sk2Var2, 0);
                    n10Var.b(ki2Var2, sk2Var2, 6);
                    sk2Var2.p(true);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 5:
                ((Integer) obj2).getClass();
                an5.a((zy3) obj6, (rg5) obj4, (ki2) obj7, (mi2) obj5, (ih4) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            default:
                n75 n75Var = (n75) obj7;
                n75 n75Var2 = (n75) obj6;
                n75Var.A = (gv5) obj;
                n75Var2.A = (gv5) obj2;
                VideoPreferencesFragment.t((n75) obj3, n75Var, n75Var2, (TextView) obj5, (VideoPreferencesFragment) obj4);
                return o27Var;
        }
    }

    public /* synthetic */ b4(zy3 zy3Var, ih4 ih4Var, Object obj, mi2 mi2Var, mi2 mi2Var2, int i, int i2) {
        this.A = i2;
        this.B = zy3Var;
        this.R = ih4Var;
        this.X = obj;
        this.L = mi2Var;
        this.Y = mi2Var2;
    }

    public /* synthetic */ b4(zy3 zy3Var, j15 j15Var, ql3 ql3Var, ki2 ki2Var, mi2 mi2Var, int i) {
        this.A = 1;
        this.R = zy3Var;
        this.X = j15Var;
        this.Y = ql3Var;
        this.B = ki2Var;
        this.L = mi2Var;
    }

    public /* synthetic */ b4(zy3 zy3Var, rg5 rg5Var, ki2 ki2Var, mi2 mi2Var, ih4 ih4Var, int i) {
        this.A = 5;
        this.R = zy3Var;
        this.X = rg5Var;
        this.B = ki2Var;
        this.L = mi2Var;
        this.Y = ih4Var;
    }

    public /* synthetic */ b4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.R = obj2;
        this.L = obj3;
        this.X = obj4;
        this.Y = obj5;
    }
}
