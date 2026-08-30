package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki2 B;

    public /* synthetic */ i5(int i, ki2 ki2Var) {
        this.A = i;
        this.B = ki2Var;
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
                ((ni3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    zy3 Y = b53.Y(o76.c(wy3.a, 1.0f), 16.0f, 24.0f);
                    lr0 a = jr0.a(new ot(16.0f, true, new i(1)), y60.k0, sk2Var, 54);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, Y);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, a);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    ir6.b(me2.X(sk2Var, R.string.leaderboard_ranking_load_failed), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(d17.b)).j, sk2Var, 0, 0, 65022);
                    l.c(this.B, null, false, null, null, pu.v(sk2Var), null, ct3.X, sk2Var, 805306368, 382);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ((Integer) obj3).intValue();
                ((wn) obj).getClass();
                jv3.c(this.B, (tu0) obj2, 0);
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    l.k(this.B, null, false, null, tq5.d, sk2Var2, 805306368, 510);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
