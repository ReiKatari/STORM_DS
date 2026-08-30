package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ p4(Object obj, Object obj2, mi2 mi2Var, ki2 ki2Var, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.X = mi2Var;
        this.R = ki2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v34 */
    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ?? r11;
        int i2 = this.A;
        lt ltVar = rt.a;
        mt mtVar = rt.c;
        wy3 wy3Var = wy3.a;
        sn1 sn1Var = su0.a;
        o27 o27Var = o27.a;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                n40.c((sg5) obj6, (k6) obj5, (List) obj4, (mi2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 1:
                zy3 zy3Var = (zy3) obj6;
                k24 k24Var = (k24) obj5;
                et0 et0Var = (et0) obj4;
                n10 n10Var = (n10) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    Object L = sk2Var.L();
                    if (L == sn1Var) {
                        L = new j4(k24Var, 5);
                        sk2Var.h0(L);
                    }
                    zy3 z10 = w81.z(zy3Var, (mi2) L);
                    tv3 d = d50.d(y60.L, true);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, z10);
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
                    et0Var.j(sk2Var, 0);
                    Object L2 = sk2Var.L();
                    if (L2 == sn1Var) {
                        L2 = new f4(k24Var, 7);
                        sk2Var.h0(L2);
                    }
                    n10Var.b((ki2) L2, sk2Var, 6);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 2:
                ki2 ki2Var = (ki2) obj6;
                pn0 pn0Var = (pn0) obj5;
                ae6 ae6Var = (ae6) obj4;
                ae6 ae6Var2 = (ae6) obj3;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    jd7 C = mj2.C(sk2Var2);
                    long j = C.b;
                    is2 is2Var = iq2.g;
                    zy3 m0 = mh7.m0(dk7.i(wy3Var, j, is2Var), mh7.q);
                    lr0 a = jr0.a(mtVar, y60.j0, sk2Var2, 0);
                    int hashCode2 = Long.hashCode(sk2Var2.T);
                    sm4 l2 = sk2Var2.l();
                    zy3 e02 = l07.e0(sk2Var2, m0);
                    nu0.i.getClass();
                    mv0 mv0Var2 = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var2);
                    } else {
                        sk2Var2.k0();
                    }
                    dn dnVar = mu0.f;
                    oo2.S(sk2Var2, dnVar, a);
                    dn dnVar2 = mu0.e;
                    oo2.S(sk2Var2, dnVar2, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    dn dnVar3 = mu0.g;
                    oo2.S(sk2Var2, dnVar3, valueOf);
                    yd ydVar = mu0.h;
                    oo2.P(sk2Var2, ydVar);
                    dn dnVar4 = mu0.d;
                    oo2.S(sk2Var2, dnVar4, e02);
                    i20 i20Var = y60.h0;
                    zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 8.0f, 6.0f, 16.0f, 6.0f);
                    sr5 a2 = rr5.a(ltVar, i20Var, sk2Var2, 48);
                    int hashCode3 = Long.hashCode(sk2Var2.T);
                    sm4 l3 = sk2Var2.l();
                    zy3 e03 = l07.e0(sk2Var2, a0);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var2);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, a2);
                    oo2.S(sk2Var2, dnVar2, l3);
                    b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e03);
                    zy3 h = o76.h(wy3Var, 38.0f);
                    fr5 fr5Var = gr5.a;
                    zy3 t = a53.t(h, fr5Var);
                    boolean f = sk2Var2.f(ki2Var);
                    Object L3 = sk2Var2.L();
                    if (f || L3 == sn1Var) {
                        L3 = new w7(2, ki2Var);
                        sk2Var2.h0(L3);
                    }
                    zy3 s = a53.s(t, false, null, (ki2) L3, 15);
                    j20 j20Var = y60.Z;
                    tv3 d2 = d50.d(j20Var, false);
                    int hashCode4 = Long.hashCode(sk2Var2.T);
                    sm4 l4 = sk2Var2.l();
                    zy3 e04 = l07.e0(sk2Var2, s);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var2);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, d2);
                    oo2.S(sk2Var2, dnVar2, l4);
                    b31.x(hashCode4, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e04);
                    ev2.b(jk2.P(se.A(), sk2Var2), null, o76.h(wy3Var, 20.0f), C.g, sk2Var2, 440, 0);
                    sk2Var2.p(true);
                    cg2.k(sk2Var2, o76.k(wy3Var, 6.0f));
                    String str = (String) ae6Var.getValue();
                    if (str == null) {
                        str = b31.o(sk2Var2, 1937934882, R.string.cheats, sk2Var2, false);
                    } else {
                        sk2Var2.X(1937934417);
                        sk2Var2.p(false);
                    }
                    String str2 = str;
                    ir6.b(str2, new xg3(1.0f, true), C.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var2, 1772544, 3120, 120720);
                    if (((Boolean) ae6Var2.getValue()).booleanValue()) {
                        sk2Var2.X(-53031630);
                        zy3 t2 = a53.t(o76.h(wy3Var, 38.0f), fr5Var);
                        boolean h2 = sk2Var2.h(pn0Var);
                        Object L4 = sk2Var2.L();
                        if (!h2 && L4 != sn1Var) {
                            z4 = false;
                        } else {
                            z4 = false;
                            L4 = new bn0(pn0Var, 0);
                            sk2Var2.h0(L4);
                        }
                        zy3 s2 = a53.s(t2, z4, null, (ki2) L4, 15);
                        tv3 d3 = d50.d(j20Var, z4);
                        int hashCode5 = Long.hashCode(sk2Var2.T);
                        sm4 l5 = sk2Var2.l();
                        zy3 e05 = l07.e0(sk2Var2, s2);
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var2);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, dnVar, d3);
                        oo2.S(sk2Var2, dnVar2, l5);
                        b31.x(hashCode5, sk2Var2, dnVar3, sk2Var2, ydVar);
                        oo2.S(sk2Var2, dnVar4, e05);
                        ax2 ax2Var = se.n;
                        if (ax2Var == null) {
                            zw2 zw2Var = new zw2("Outlined.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = f77.a;
                            mb6 mb6Var = new mb6(xq0.b);
                            vq2 vq2Var = new vq2(1, (byte) 0);
                            vq2Var.o(19.0f, 3.0f);
                            vq2Var.m(5.0f, 3.0f);
                            vq2Var.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
                            vq2Var.u(14.0f);
                            vq2Var.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            vq2Var.l(14.0f);
                            vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
                            vq2Var.m(21.0f, 5.0f);
                            vq2Var.i(RecyclerView.A1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            vq2Var.g();
                            vq2Var.o(19.0f, 19.0f);
                            vq2Var.m(5.0f, 19.0f);
                            vq2Var.m(5.0f, 5.0f);
                            vq2Var.l(14.0f);
                            vq2Var.u(14.0f);
                            vq2Var.g();
                            vq2Var.o(17.99f, 9.0f);
                            vq2Var.n(-1.41f, -1.42f);
                            vq2Var.n(-6.59f, 6.59f);
                            vq2Var.n(-2.58f, -2.57f);
                            vq2Var.n(-1.42f, 1.41f);
                            vq2Var.n(4.0f, 3.99f);
                            vq2Var.g();
                            zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                            ax2Var = zw2Var.b();
                            se.n = ax2Var;
                        }
                        ev2.b(jk2.P(ax2Var, sk2Var2), me2.X(sk2Var2, R.string.enabled_cheats), o76.h(wy3Var, 20.0f), C.h, sk2Var2, 392, 0);
                        z3 = true;
                        sk2Var2.p(true);
                        i = 0;
                        sk2Var2.p(false);
                    } else {
                        z3 = true;
                        i = 0;
                        sk2Var2.X(-52250337);
                        sk2Var2.p(false);
                    }
                    sk2Var2.p(z3);
                    d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), C.f, is2Var), sk2Var2, i);
                    sk2Var2.p(z3);
                    return o27Var;
                }
                sk2Var2.R();
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                zx0.a((String) obj6, (ArrayList) obj5, (mi2) obj3, (ki2) obj4, (tu0) obj, ep2.I(1));
                return o27Var;
            case 4:
                ki2 ki2Var2 = (ki2) obj6;
                a71 a71Var = (a71) obj5;
                mi2 mi2Var = (mi2) obj3;
                aj2 aj2Var = (aj2) obj4;
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z5)) {
                    long j2 = ((hr0) sk2Var3.j(ir0.a)).j();
                    WeakHashMap weakHashMap = dg7.w;
                    ru5.b(hm1.n(sk2Var3).l, null, null, ct3.H0(264590106, new sz(ki2Var2, 3, (byte) 0), sk2Var3), null, null, null, 0, false, null, RecyclerView.A1, 0L, 0L, 0L, j2, 0L, ct3.H0(-1023875647, new b71(a71Var, mi2Var, aj2Var, 0), sk2Var3), sk2Var3, 3072, 100663296, 196598);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 5:
                ki2 ki2Var3 = (ki2) obj6;
                Integer num = (Integer) obj5;
                Integer num2 = (Integer) obj4;
                aj2 aj2Var2 = (aj2) obj3;
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z6)) {
                    mh7.e(me2.X(sk2Var4, R.string.cancel), false, ki2Var3, sk2Var4, 0, 2);
                    String X = me2.X(sk2Var4, R.string.ok);
                    if (num != null && num2 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f2 = sk2Var4.f(num) | sk2Var4.f(num2) | sk2Var4.f(aj2Var2);
                    Object L5 = sk2Var4.L();
                    if (f2 || L5 == sn1Var) {
                        L5 = new bd3(num, num2, aj2Var2, 0);
                        sk2Var4.h0(L5);
                    }
                    mh7.e(X, z7, (ki2) L5, sk2Var4, 0, 0);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                ((Integer) obj2).getClass();
                hk2.b((ki2) obj6, (zy3) obj5, (qj3) obj4, (fj3) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 7:
                ((Integer) obj2).getClass();
                io2.d((hr0) obj6, (c17) obj5, (m36) obj4, (et0) obj3, (tu0) obj, ep2.I(3073));
                return o27Var;
            case 8:
                ((Integer) obj2).getClass();
                ol4.c((kl4) obj6, (rg5) obj5, (mi2) obj3, (ki2) obj4, (tu0) obj, ep2.I(385));
                return o27Var;
            case 9:
                ((Integer) obj2).getClass();
                gk2.k((zy3) obj6, (ih4) obj5, (r94) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 10:
                ih4 ih4Var = (ih4) obj6;
                uq6 uq6Var = (uq6) obj5;
                mi2 mi2Var2 = (mi2) obj3;
                k24 k24Var2 = (k24) obj4;
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z8)) {
                    Object L6 = sk2Var5.L();
                    if (L6 == sn1Var) {
                        L6 = new wc2();
                        sk2Var5.h0(L6);
                    }
                    wc2 wc2Var = (wc2) L6;
                    zy3 I = b53.I(b53.W(o76.c(wy3Var, 1.0f), ih4Var), wc2Var);
                    oq6 oq6Var = (oq6) uq6Var.b.getValue();
                    boolean booleanValue = ((Boolean) k24Var2.getValue()).booleanValue();
                    yb1 w = pu.w(sk2Var5);
                    fb3 fb3Var = (fb3) uq6Var.c.getValue();
                    boolean f3 = sk2Var5.f(uq6Var);
                    Object L7 = sk2Var5.L();
                    if (f3 || L7 == sn1Var) {
                        L7 = new zr4(18, uq6Var, k24Var2);
                        sk2Var5.h0(L7);
                    }
                    db3 db3Var = new db3(62, (mi2) L7);
                    boolean f4 = sk2Var5.f(uq6Var) | sk2Var5.f(mi2Var2);
                    Object L8 = sk2Var5.L();
                    if (f4 || L8 == sn1Var) {
                        L8 = new f67(uq6Var, mi2Var2, k24Var2, 1);
                        sk2Var5.h0(L8);
                    }
                    vf4.a(oq6Var, (mi2) L8, I, false, null, null, booleanValue, null, fb3Var, db3Var, false, 0, 0, null, w, sk2Var5, 0, 0, 510968);
                    Object L9 = sk2Var5.L();
                    if (L9 == sn1Var) {
                        L9 = new kl0(wc2Var, null, 3);
                        sk2Var5.h0(L9);
                    }
                    l.g(sk2Var5, (aj2) L9, o27Var);
                    return o27Var;
                }
                sk2Var5.R();
                return o27Var;
            default:
                jd7 jd7Var = (jd7) obj6;
                ki2 ki2Var4 = (ki2) obj5;
                String str3 = (String) obj4;
                aj2 aj2Var3 = (aj2) obj3;
                tu0 tu0Var6 = (tu0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue6 & 1, z9)) {
                    long j3 = jd7Var.b;
                    is2 is2Var2 = iq2.g;
                    zy3 m02 = mh7.m0(dk7.i(wy3Var, j3, is2Var2), mh7.q);
                    lr0 a3 = jr0.a(mtVar, y60.j0, sk2Var6, 0);
                    int hashCode6 = Long.hashCode(sk2Var6.T);
                    sm4 l6 = sk2Var6.l();
                    zy3 e06 = l07.e0(sk2Var6, m02);
                    nu0.i.getClass();
                    mv0 mv0Var3 = mu0.b;
                    sk2Var6.b0();
                    if (sk2Var6.S) {
                        sk2Var6.k(mv0Var3);
                    } else {
                        sk2Var6.k0();
                    }
                    dn dnVar5 = mu0.f;
                    oo2.S(sk2Var6, dnVar5, a3);
                    dn dnVar6 = mu0.e;
                    oo2.S(sk2Var6, dnVar6, l6);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    dn dnVar7 = mu0.g;
                    oo2.S(sk2Var6, dnVar7, valueOf2);
                    yd ydVar2 = mu0.h;
                    oo2.P(sk2Var6, ydVar2);
                    dn dnVar8 = mu0.d;
                    oo2.S(sk2Var6, dnVar8, e06);
                    i20 i20Var2 = y60.h0;
                    zy3 a02 = b53.a0(o76.c(wy3Var, 1.0f), 8.0f, 6.0f, 16.0f, 6.0f);
                    sr5 a4 = rr5.a(ltVar, i20Var2, sk2Var6, 48);
                    int hashCode7 = Long.hashCode(sk2Var6.T);
                    sm4 l7 = sk2Var6.l();
                    zy3 e07 = l07.e0(sk2Var6, a02);
                    sk2Var6.b0();
                    if (sk2Var6.S) {
                        sk2Var6.k(mv0Var3);
                    } else {
                        sk2Var6.k0();
                    }
                    oo2.S(sk2Var6, dnVar5, a4);
                    oo2.S(sk2Var6, dnVar6, l7);
                    b31.x(hashCode7, sk2Var6, dnVar7, sk2Var6, ydVar2);
                    oo2.S(sk2Var6, dnVar8, e07);
                    zy3 s3 = a53.s(a53.t(o76.h(wy3Var, 38.0f), gr5.a), false, null, ki2Var4, 15);
                    tv3 d4 = d50.d(y60.Z, false);
                    int hashCode8 = Long.hashCode(sk2Var6.T);
                    sm4 l8 = sk2Var6.l();
                    zy3 e08 = l07.e0(sk2Var6, s3);
                    sk2Var6.b0();
                    if (sk2Var6.S) {
                        sk2Var6.k(mv0Var3);
                    } else {
                        sk2Var6.k0();
                    }
                    oo2.S(sk2Var6, dnVar5, d4);
                    oo2.S(sk2Var6, dnVar6, l8);
                    b31.x(hashCode8, sk2Var6, dnVar7, sk2Var6, ydVar2);
                    oo2.S(sk2Var6, dnVar8, e08);
                    ev2.a(se.A(), me2.X(sk2Var6, R.string.navigate_back), o76.h(wy3Var, 20.0f), jd7Var.g, sk2Var6, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    sk2Var6.p(true);
                    cg2.k(sk2Var6, o76.k(wy3Var, 6.0f));
                    ir6.b(str3, new xg3(1.0f, true), jd7Var.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var6, 1772544, 3120, 120720);
                    if (aj2Var3 == null) {
                        sk2Var6.X(-1004231867);
                        r11 = 0;
                    } else {
                        r11 = 0;
                        sk2Var6.X(383247420);
                        aj2Var3.j(sk2Var6, 0);
                    }
                    sk2Var6.p(r11);
                    sk2Var6.p(true);
                    d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), jd7Var.f, is2Var2), sk2Var6, r11);
                    sk2Var6.p(true);
                    return o27Var;
                }
                sk2Var6.R();
                return o27Var;
        }
    }

    public /* synthetic */ p4(Object obj, Object obj2, mi2 mi2Var, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.X = mi2Var;
        this.R = obj3;
    }

    public /* synthetic */ p4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    public /* synthetic */ p4(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
