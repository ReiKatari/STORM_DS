package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class df implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ df(int i, long j, Object obj) {
        this.A = i;
        this.B = j;
        this.L = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = false;
        Object obj3 = this.L;
        long j = this.B;
        switch (i) {
            case 0:
                zy3 zy3Var = (zy3) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    if (j != 9205357640488583168L) {
                        sk2Var.X(-1244013944);
                        zy3 g = o76.g(zy3Var, ni1.b(j), ni1.a(j), RecyclerView.A1, RecyclerView.A1, 12);
                        tv3 d = d50.d(y60.R, false);
                        int hashCode = Long.hashCode(sk2Var.T);
                        sm4 l = sk2Var.l();
                        zy3 e0 = l07.e0(sk2Var, g);
                        nu0.i.getClass();
                        mv0 mv0Var = mu0.b;
                        sk2Var.b0();
                        if (sk2Var.S) {
                            sk2Var.k(mv0Var);
                        } else {
                            sk2Var.k0();
                        }
                        oo2.S(sk2Var, mu0.f, d);
                        oo2.S(sk2Var, mu0.e, l);
                        oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var, mu0.h);
                        oo2.S(sk2Var, mu0.d, e0);
                        ff.b(null, sk2Var, 0, 1);
                        sk2Var.p(true);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(-1243644858);
                        ff.b(zy3Var, sk2Var, 0, 0);
                        sk2Var.p(false);
                    }
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                et0 et0Var = (et0) obj3;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    dk7.a(b01.a.a(Float.valueOf(xq0.d(j))), ct3.H0(-1072292694, new sp(et0Var, 1), sk2Var2), sk2Var2, 56);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
