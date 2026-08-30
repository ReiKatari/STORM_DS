package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xo  reason: default package */
/* loaded from: classes.dex */
public abstract class xo {
    public static final ti4 a;

    static {
        pp1 pp1Var = pp1.A;
        a = new ti4(pp1Var, pp1Var);
    }

    public static final void a(to toVar, List list, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1794596951);
        if ((i & 6) == 0) {
            if (sk2Var.f(toVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(list)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                so soVar = (so) list.get(i6);
                bj2 bj2Var = (bj2) soVar.a;
                int i7 = soVar.b;
                int i8 = soVar.c;
                Object L = sk2Var.L();
                if (L == su0.a) {
                    L = wf.d;
                    sk2Var.h0(L);
                }
                tv3 tv3Var = (tv3) L;
                int hashCode = Long.hashCode(sk2Var.T);
                sm4 l = sk2Var.l();
                zy3 e0 = l07.e0(sk2Var, wy3.a);
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
                bj2Var.i(toVar.subSequence(i7, i8).B, sk2Var, 0);
                sk2Var.p(true);
            }
            i3 = 0;
        } else {
            i3 = 0;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, i3, toVar, list);
        }
    }
}
