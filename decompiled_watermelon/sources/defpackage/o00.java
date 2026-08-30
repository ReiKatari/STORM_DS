package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ et0 R;
    public final /* synthetic */ aj2 X;

    public /* synthetic */ o00(boolean z, String str, et0 et0Var, aj2 aj2Var, int i) {
        this.A = i;
        this.B = z;
        this.L = str;
        this.R = et0Var;
        this.X = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i;
        zy3 zy3Var;
        boolean z3;
        boolean z4;
        int i2 = this.A;
        o27 o27Var = o27.a;
        wy3 wy3Var = wy3.a;
        switch (i2) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    l07.a(mh7.m0(o76.c(wy3Var, 1.0f), mh7.n), null, 0L, ct3.H0(1626890049, new o00(this.B, this.L, this.R, this.X, 1), sk2Var), sk2Var, 1572864, 62);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    zy3 c = o76.c(wy3Var, 1.0f);
                    h20 h20Var = y60.j0;
                    mt mtVar = rt.c;
                    lr0 a = jr0.a(mtVar, h20Var, sk2Var2, 0);
                    int hashCode = Long.hashCode(sk2Var2.T);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, c);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    dn dnVar = mu0.f;
                    oo2.S(sk2Var2, dnVar, a);
                    dn dnVar2 = mu0.e;
                    oo2.S(sk2Var2, dnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    dn dnVar3 = mu0.g;
                    oo2.S(sk2Var2, dnVar3, valueOf);
                    yd ydVar = mu0.h;
                    oo2.P(sk2Var2, ydVar);
                    dn dnVar4 = mu0.d;
                    oo2.S(sk2Var2, dnVar4, e0);
                    zy3 Z = b53.Z(o76.e(64.0f, 2, wy3Var), 24.0f, RecyclerView.A1, 2);
                    tv3 d = d50.d(y60.Y, false);
                    int hashCode2 = Long.hashCode(sk2Var2.T);
                    sm4 l2 = sk2Var2.l();
                    zy3 e02 = l07.e0(sk2Var2, Z);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, d);
                    oo2.S(sk2Var2, dnVar2, l2);
                    b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e02);
                    ir6.b(this.L, null, 0L, 0L, pe2.d0, null, 0L, null, 0L, 2, false, 2, 0, null, ((c17) sk2Var2.j(d17.b)).f, sk2Var2, 196608, 3120, 55262);
                    sk2Var2.p(true);
                    boolean z5 = this.B;
                    if (z5) {
                        sk2Var2.X(-2120780912);
                        zy3Var = se.Z(wy3Var, se.R(sk2Var2));
                        i = 0;
                        sk2Var2.p(false);
                    } else {
                        i = 0;
                        sk2Var2.X(-2120779565);
                        sk2Var2.p(false);
                        zy3Var = wy3Var;
                    }
                    lr0 a2 = jr0.a(mtVar, h20Var, sk2Var2, i);
                    int hashCode3 = Long.hashCode(sk2Var2.T);
                    sm4 l3 = sk2Var2.l();
                    zy3 e03 = l07.e0(sk2Var2, zy3Var);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, a2);
                    oo2.S(sk2Var2, dnVar2, l3);
                    b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e03);
                    et0 et0Var = this.R;
                    if (z5) {
                        sk2Var2.X(-1306580429);
                        et0Var.i(b53.q(2, 24.0f), sk2Var2, 6);
                        z3 = false;
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(-1306482252);
                        xg3 xg3Var = new xg3(1.0f, false);
                        tv3 d2 = d50.d(y60.L, false);
                        int hashCode4 = Long.hashCode(sk2Var2.T);
                        sm4 l4 = sk2Var2.l();
                        zy3 e04 = l07.e0(sk2Var2, xg3Var);
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, dnVar, d2);
                        oo2.S(sk2Var2, dnVar2, l4);
                        b31.x(hashCode4, sk2Var2, dnVar3, sk2Var2, ydVar);
                        oo2.S(sk2Var2, dnVar4, e04);
                        et0Var.i(b53.q(2, 24.0f), sk2Var2, 6);
                        sk2Var2.p(true);
                        z3 = false;
                        sk2Var2.p(false);
                    }
                    aj2 aj2Var = this.X;
                    if (aj2Var == null) {
                        sk2Var2.X(-1306261285);
                        sk2Var2.p(z3);
                        z4 = true;
                    } else {
                        sk2Var2.X(-1306261284);
                        zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 24.0f, 8.0f, 8.0f, 8.0f);
                        sr5 a3 = rr5.a(new ot(8.0f, true, new a31(2, y60.l0)), y60.g0, sk2Var2, 6);
                        int hashCode5 = Long.hashCode(sk2Var2.T);
                        sm4 l5 = sk2Var2.l();
                        zy3 e05 = l07.e0(sk2Var2, a0);
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, dnVar, a3);
                        oo2.S(sk2Var2, dnVar2, l5);
                        b31.x(hashCode5, sk2Var2, dnVar3, sk2Var2, ydVar);
                        oo2.S(sk2Var2, dnVar4, e05);
                        aj2Var.j(sk2Var2, 0);
                        z4 = true;
                        sk2Var2.p(true);
                        sk2Var2.p(false);
                    }
                    sk2Var2.p(z4);
                    sk2Var2.p(z4);
                    return o27Var;
                }
                sk2Var2.R();
                return o27Var;
        }
    }
}
