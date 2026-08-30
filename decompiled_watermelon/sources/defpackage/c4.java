package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ ki2 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ c4(ki2 ki2Var, cj2 cj2Var, k24 k24Var, k24 k24Var2, k24 k24Var3, pj4 pj4Var) {
        this.B = ki2Var;
        this.R = cj2Var;
        this.Z = k24Var;
        this.X = k24Var2;
        this.L = k24Var3;
        this.Y = pj4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        k24 k24Var;
        boolean z2;
        boolean z3;
        int i = this.A;
        sn1 sn1Var = su0.a;
        o27 o27Var = o27.a;
        Object obj3 = this.L;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.R;
        boolean z4 = false;
        switch (i) {
            case 0:
                jd7 jd7Var = (jd7) obj7;
                ct1 ct1Var = (ct1) obj6;
                mi2 mi2Var = (mi2) obj3;
                ae6 ae6Var = (ae6) obj5;
                k24 k24Var2 = (k24) obj4;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    s72 s72Var = o76.c;
                    long j = jd7Var.b;
                    is2 is2Var = iq2.g;
                    zy3 i2 = dk7.i(s72Var, j, is2Var);
                    tv3 d = d50.d(y60.L, false);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, i2);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    dn dnVar = mu0.f;
                    oo2.S(sk2Var, dnVar, d);
                    dn dnVar2 = mu0.e;
                    oo2.S(sk2Var, dnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    dn dnVar3 = mu0.g;
                    oo2.S(sk2Var, dnVar3, valueOf);
                    yd ydVar = mu0.h;
                    oo2.P(sk2Var, ydVar);
                    dn dnVar4 = mu0.d;
                    oo2.S(sk2Var, dnVar4, e0);
                    zy3 m0 = mh7.m0(s72Var, mh7.o);
                    sr5 a = rr5.a(rt.a, y60.g0, sk2Var, 0);
                    int hashCode2 = Long.hashCode(sk2Var.T);
                    sm4 l2 = sk2Var.l();
                    zy3 e02 = l07.e0(sk2Var, m0);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, a);
                    oo2.S(sk2Var, dnVar2, l2);
                    b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e02);
                    h20 h20Var = y60.k0;
                    wy3 wy3Var = wy3.a;
                    zy3 b0 = b53.b0(o76.b(o76.k(wy3Var, 58.0f), 1.0f), RecyclerView.A1, 8.0f, RecyclerView.A1, 12.0f, 5);
                    lr0 a2 = jr0.a(rt.c, h20Var, sk2Var, 48);
                    int hashCode3 = Long.hashCode(sk2Var.T);
                    sm4 l3 = sk2Var.l();
                    zy3 e03 = l07.e0(sk2Var, b0);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, a2);
                    oo2.S(sk2Var, dnVar2, l3);
                    b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e03);
                    zy3 t = a53.t(o76.h(wy3Var, 36.0f), gr5.a);
                    ki2 ki2Var = this.B;
                    zy3 s = a53.s(t, false, null, ki2Var, 15);
                    tv3 d2 = d50.d(y60.Z, false);
                    int hashCode4 = Long.hashCode(sk2Var.T);
                    sm4 l4 = sk2Var.l();
                    zy3 e04 = l07.e0(sk2Var, s);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, d2);
                    oo2.S(sk2Var, dnVar2, l4);
                    b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e04);
                    ev2.a(se.A(), me2.X(sk2Var, R.string.cancel), o76.h(wy3Var, 19.0f), jd7Var.g, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    sk2Var.p(true);
                    d50.a(new xg3(1.0f, true), sk2Var, 0);
                    lr0 a3 = jr0.a(new ot(10.0f, true, new i(1)), h20Var, sk2Var, 54);
                    int hashCode5 = Long.hashCode(sk2Var.T);
                    sm4 l5 = sk2Var.l();
                    zy3 e05 = l07.e0(sk2Var, wy3Var);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, a3);
                    oo2.S(sk2Var, dnVar2, l5);
                    b31.x(hashCode5, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e05);
                    n40.B("NAV", null, ct3.H0(1312402531, new d4(jd7Var, 0), sk2Var), sk2Var, 390, 2);
                    String X = me2.X(sk2Var, R.string.pause_hint_accept);
                    Locale locale = Locale.ROOT;
                    String upperCase = X.toUpperCase(locale);
                    upperCase.getClass();
                    n40.B(upperCase, "A", null, sk2Var, 48, 4);
                    String upperCase2 = me2.X(sk2Var, R.string.pause_hint_back).toUpperCase(locale);
                    upperCase2.getClass();
                    n40.B(upperCase2, "B", null, sk2Var, 48, 4);
                    sk2Var.p(true);
                    sk2Var.p(true);
                    d50.a(dk7.i(o76.b(o76.k(wy3Var, 1.0f), 1.0f), jd7Var.f, is2Var), sk2Var, 0);
                    zy3 b = o76.b(new xg3(1.0f, true), 1.0f);
                    tv3 d3 = d50.d(y60.R, false);
                    int hashCode6 = Long.hashCode(sk2Var.T);
                    sm4 l6 = sk2Var.l();
                    zy3 e06 = l07.e0(sk2Var, b);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, d3);
                    oo2.S(sk2Var, dnVar2, l6);
                    b31.x(hashCode6, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e06);
                    zy3 l7 = o76.l(760.0f, 1, s72Var);
                    pp5 pp5Var = (pp5) ae6Var.getValue();
                    Object L = sk2Var.L();
                    if (L == sn1Var) {
                        k24Var = k24Var2;
                        L = new e4(k24Var, 0);
                        sk2Var.h0(L);
                    } else {
                        k24Var = k24Var2;
                    }
                    aj2 aj2Var = (aj2) L;
                    boolean h = sk2Var.h(ct1Var);
                    Object L2 = sk2Var.L();
                    if (h || L2 == sn1Var) {
                        z zVar = new z(1, ct1Var, ct1.class, "viewLeaderboard", "viewLeaderboard(Lme/magnum/rcheevosapi/model/RALeaderboard;)V", 0, 0, 1);
                        sk2Var.h0(zVar);
                        L2 = zVar;
                    }
                    mi2 mi2Var2 = (mi2) ((lj2) L2);
                    boolean h2 = sk2Var.h(ct1Var);
                    Object L3 = sk2Var.L();
                    if (h2 || L3 == sn1Var) {
                        h4 h4Var = new h4(2, ct1Var, ct1.class, "getLeaderboardRanking", "getLeaderboardRanking-gIAlu-s(Lme/magnum/rcheevosapi/model/RALeaderboard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 0);
                        sk2Var.h0(h4Var);
                        L3 = h4Var;
                    }
                    aj2 aj2Var2 = (aj2) ((lj2) L3);
                    boolean h3 = sk2Var.h(ct1Var);
                    Object L4 = sk2Var.L();
                    if (h3 || L4 == sn1Var) {
                        i4 i4Var = new i4(0, ct1Var, ct1.class, "retryLoadAchievements", "retryLoadAchievements()V", 0, 0, 0);
                        sk2Var.h0(i4Var);
                        L4 = i4Var;
                    }
                    n40.a(l7, pp5Var, aj2Var, mi2Var2, aj2Var2, (ki2) ((lj2) L4), ki2Var, mi2Var, sk2Var, 390);
                    sk2Var.p(true);
                    sk2Var.p(true);
                    ti4 ti4Var = (ti4) k24Var.getValue();
                    if (ti4Var == null) {
                        sk2Var.X(543721358);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(543721359);
                        n6 n6Var = (n6) ti4Var.A;
                        boolean booleanValue = ((Boolean) ti4Var.B).booleanValue();
                        Object L5 = sk2Var.L();
                        if (L5 == sn1Var) {
                            z2 = false;
                            L5 = new f4(k24Var, 0);
                            sk2Var.h0(L5);
                        } else {
                            z2 = false;
                        }
                        jv3.b(n6Var, booleanValue, (ki2) L5, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        sk2Var.p(z2);
                    }
                    sk2Var.p(true);
                    return o27Var;
                }
                sk2Var.R();
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                a53.e((zy3) obj7, (DSiWareTitle) obj6, this.B, (mi2) obj3, (mi2) obj5, (ki2) obj4, (tu0) obj, ep2.I(7));
                return o27Var;
            case 2:
                cj2 cj2Var = (cj2) obj7;
                k24 k24Var3 = (k24) obj4;
                k24 k24Var4 = (k24) obj6;
                k24 k24Var5 = (k24) obj3;
                pj4 pj4Var = (pj4) obj5;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z4)) {
                    mh7.e(me2.X(sk2Var2, R.string.cancel), false, this.B, sk2Var2, 0, 2);
                    String X2 = me2.X(sk2Var2, R.string.ok);
                    boolean f = sk2Var2.f(cj2Var) | sk2Var2.f(k24Var3) | sk2Var2.f(k24Var4) | sk2Var2.f(k24Var5) | sk2Var2.f(pj4Var);
                    Object L6 = sk2Var2.L();
                    if (f || L6 == sn1Var) {
                        mg3 mg3Var = new mg3(cj2Var, k24Var3, k24Var4, k24Var5, pj4Var, 0);
                        sk2Var2.h0(mg3Var);
                        L6 = mg3Var;
                    }
                    mh7.e(X2, false, (ki2) L6, sk2Var2, 0, 2);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 3:
                mj5 mj5Var = (mj5) obj7;
                zy3 zy3Var = (zy3) obj6;
                ih4 ih4Var = (ih4) obj5;
                rg5 rg5Var = (rg5) obj4;
                mi2 mi2Var3 = (mi2) obj3;
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z3)) {
                    if (mj5Var instanceof kj5) {
                        sk2Var3.X(605657266);
                        nl2.h(b53.W(zy3Var, ih4Var), sk2Var3, 0);
                        sk2Var3.p(false);
                    } else if (mj5Var instanceof lj5) {
                        sk2Var3.X(605660199);
                        nl2.a(zy3Var, ih4Var, rg5Var, ((lj5) mj5Var).a, mi2Var3, this.B, sk2Var3, 0);
                        sk2Var3.p(false);
                    } else {
                        throw ej6.d(sk2Var3, 605655497, false);
                    }
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                nl2.a((zy3) obj7, (ih4) obj6, (rg5) obj5, (jj5) obj4, (mi2) obj3, this.B, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ c4(zy3 zy3Var, ih4 ih4Var, rg5 rg5Var, jj5 jj5Var, mi2 mi2Var, ki2 ki2Var, int i) {
        this.R = zy3Var;
        this.X = ih4Var;
        this.Y = rg5Var;
        this.Z = jj5Var;
        this.L = mi2Var;
        this.B = ki2Var;
    }

    public /* synthetic */ c4(zy3 zy3Var, DSiWareTitle dSiWareTitle, ki2 ki2Var, mi2 mi2Var, mi2 mi2Var2, ki2 ki2Var2, int i) {
        this.R = zy3Var;
        this.X = dSiWareTitle;
        this.B = ki2Var;
        this.L = mi2Var;
        this.Y = mi2Var2;
        this.Z = ki2Var2;
    }

    public /* synthetic */ c4(mj5 mj5Var, zy3 zy3Var, ih4 ih4Var, rg5 rg5Var, mi2 mi2Var, ki2 ki2Var) {
        this.R = mj5Var;
        this.X = zy3Var;
        this.Y = ih4Var;
        this.Z = rg5Var;
        this.L = mi2Var;
        this.B = ki2Var;
    }

    public /* synthetic */ c4(jd7 jd7Var, ki2 ki2Var, ct1 ct1Var, mi2 mi2Var, ae6 ae6Var, k24 k24Var) {
        this.R = jd7Var;
        this.B = ki2Var;
        this.X = ct1Var;
        this.L = mi2Var;
        this.Y = ae6Var;
        this.Z = k24Var;
    }
}
