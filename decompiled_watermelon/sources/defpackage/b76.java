package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b76  reason: default package */
/* loaded from: classes.dex */
public final class b76 implements cj2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ int R;

    public b76(List list, mi2 mi2Var, ki2 ki2Var, int i) {
        this.A = list;
        this.B = mi2Var;
        this.L = ki2Var;
        this.R = i;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ni3 ni3Var = (ni3) obj;
        int intValue = ((Number) obj2).intValue();
        tu0 tu0Var = (tu0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((sk2) tu0Var).f(ni3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((sk2) tu0Var).d(intValue)) {
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
            String str = (String) this.A.get(intValue);
            sk2Var.X(1374552944);
            wy3 wy3Var = wy3.a;
            zy3 c = o76.c(wy3Var, 1.0f);
            mi2 mi2Var = this.B;
            boolean f = sk2Var.f(mi2Var);
            if ((((i & 112) ^ 48) > 32 && sk2Var.d(intValue)) || (i & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            ki2 ki2Var = this.L;
            boolean f2 = z2 | f | sk2Var.f(ki2Var);
            Object L = sk2Var.L();
            if (f2 || L == su0.a) {
                L = new a76(mi2Var, intValue, ki2Var);
                sk2Var.h0(L);
            }
            zy3 b0 = b53.b0(o76.e(48.0f, 2, a53.s(c, false, null, (ki2) L, 15)), 24.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
            sr5 a = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, b0);
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
            if (intValue == this.R) {
                z3 = true;
            } else {
                z3 = false;
            }
            a45.a(z3, null, false, null, sk2Var, 48, 60);
            cg2.k(sk2Var, o76.k(wy3Var, 32.0f));
            ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
            sk2Var.p(true);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
