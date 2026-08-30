package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nj  reason: default package */
/* loaded from: classes.dex */
public final class nj extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ yq4 L;
    public final /* synthetic */ k24 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj(yq4 yq4Var, k24 k24Var, int i) {
        super(2);
        this.B = i;
        this.L = yq4Var;
        this.R = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        int i = this.B;
        o27 o27Var = o27.a;
        k24 k24Var = this.R;
        yq4 yq4Var = this.L;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    Object L = sk2Var.L();
                    sn1 sn1Var = su0.a;
                    if (L == sn1Var) {
                        L = yd.e0;
                        sk2Var.h0(L);
                    }
                    zy3 a = fz5.a(wy3.a, false, (mi2) L);
                    boolean h = sk2Var.h(yq4Var);
                    Object L2 = sk2Var.L();
                    if (h || L2 == sn1Var) {
                        L2 = new kj(yq4Var, 1);
                        sk2Var.h0(L2);
                    }
                    zy3 z3 = iq2.z(a, (mi2) L2);
                    if (yq4Var.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = RecyclerView.A1;
                    }
                    zy3 r = l.r(z3, f);
                    tv0 tv0Var = oj.a;
                    aj2 aj2Var = (aj2) k24Var.getValue();
                    Object L3 = sk2Var.L();
                    if (L3 == sn1Var) {
                        L3 = wf.c;
                        sk2Var.h0(L3);
                    }
                    tv3 tv3Var = (tv3) L3;
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, r);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, tv3Var);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    aj2Var.j(sk2Var, 0);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    dk7.a(oj.b.a(Boolean.TRUE), ct3.H0(1022273628, new nj(yq4Var, k24Var, 0), sk2Var2), sk2Var2, 56);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
