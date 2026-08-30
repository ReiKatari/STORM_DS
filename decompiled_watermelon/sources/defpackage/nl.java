package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements bj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ nl(ki2 ki2Var, boolean z) {
        this.L = ki2Var;
        this.B = z;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.A;
        Object obj4 = this.L;
        final boolean z2 = this.B;
        switch (i2) {
            case 0:
                final ki2 ki2Var = (ki2) obj4;
                zy3 zy3Var = (zy3) obj;
                ((Integer) obj3).getClass();
                sk2 sk2Var = (sk2) ((tu0) obj2);
                sk2Var.X(-196777734);
                final long j = ((xr6) sk2Var.j(yr6.a)).a;
                boolean e = sk2Var.e(j) | sk2Var.f(ki2Var) | sk2Var.g(z2);
                Object L = sk2Var.L();
                if (e || L == su0.a) {
                    L = new mi2() { // from class: ol
                        @Override // defpackage.mi2
                        public final Object n(Object obj5) {
                            g80 g80Var = (g80) obj5;
                            return g80Var.a(new gl(ki2Var, z2, se.n(g80Var, Float.intBitsToFloat((int) (g80Var.A.d() >> 32)) / 2.0f), new b30(5, j), 0));
                        }
                    };
                    sk2Var.h0(L);
                }
                zy3 F = l07.F(zy3Var, (mi2) L);
                sk2Var.p(false);
                return F;
            default:
                k3 k3Var = (k3) obj4;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z)) {
                    zy3 b0 = b53.b0(wy3.a, 4.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                    lr0 a = jr0.a(rt.c, y60.j0, sk2Var2, 0);
                    int hashCode = Long.hashCode(sk2Var2.T);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, b0);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, a);
                    oo2.S(sk2Var2, mu0.e, l);
                    oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var2, mu0.h);
                    oo2.S(sk2Var2, mu0.d, e0);
                    if (z2) {
                        i = R.string.challenge_completed;
                    } else {
                        i = R.string.challenge_failed;
                    }
                    String X = me2.X(sk2Var2, i);
                    ye6 ye6Var = d17.b;
                    ir6.b(X, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ds6.a(((c17) sk2Var2.j(ye6Var)).l, 0L, 0L, pe2.d0, null, 0L, 0L, null, 16777211), sk2Var2, 0, 3072, 57342);
                    ir6.b(k3Var.a.a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((c17) sk2Var2.j(ye6Var)).l, sk2Var2, 0, 3072, 57342);
                    sk2Var2.p(true);
                } else {
                    sk2Var2.R();
                }
                return o27.a;
        }
    }

    public /* synthetic */ nl(boolean z, k3 k3Var) {
        this.B = z;
        this.L = k3Var;
    }
}
