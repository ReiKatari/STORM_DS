package defpackage;

import android.view.ViewStructure;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rq4  reason: default package */
/* loaded from: classes.dex */
public final class rq4 extends ic3 implements cj2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq4(et0 et0Var) {
        super(4);
        this.L = et0Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = this.B;
        o27 o27Var = o27.a;
        Object obj5 = this.L;
        switch (i4) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(intValue, intValue2, 0, 0, ((Number) obj3).intValue() - intValue, ((Number) obj4).intValue() - intValue2);
                return o27Var;
            default:
                g56 g56Var = (g56) obj;
                zy3 zy3Var = (zy3) obj2;
                tu0 tu0Var = (tu0) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (((sk2) tu0Var).f(g56Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = i3 | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    if (((sk2) tu0Var).f(zy3Var)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(i & 1, z)) {
                    et0 et0Var = (et0) obj5;
                    tv3 d = d50.d(y60.L, false);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, zy3Var);
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
                    oo2.N(sk2Var, Integer.valueOf(hashCode), mu0.g);
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    et0Var.i(g56Var, sk2Var, Integer.valueOf(i & 14));
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq4(ViewStructure viewStructure) {
        super(4);
        this.L = viewStructure;
    }
}
