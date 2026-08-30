package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.ui.inputsetup.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ s4(int i, int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        hr0 hr0Var;
        int i = this.A;
        wy3 wy3Var = wy3.a;
        sn1 sn1Var = su0.a;
        boolean z8 = false;
        o27 o27Var = o27.a;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n40.s((zy3) obj4, (p15) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                w81.a((zy3) obj4, (dy4) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                pc pcVar = ((nc) obj4).a;
                pcVar.j.i(floatValue);
                pcVar.k.i(floatValue2);
                ((k75) obj3).A = floatValue;
                return o27Var;
            case 3:
                zh6 zh6Var = (zh6) obj;
                lz0 lz0Var = (lz0) obj2;
                return ((tv3) obj4).f(zh6Var, zh6Var.N(new et0(-431986394, true, new s4(4, (et0) obj3, new h50(zh6Var, lz0Var.a))), o27Var), lz0Var.a);
            case 4:
                et0 et0Var = (et0) obj4;
                h50 h50Var = (h50) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    et0Var.i(h50Var, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 5:
                ((Integer) obj2).getClass();
                iq2.b((pn0) obj4, (tq5) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case ig7.b /* 6 */:
                cm1 cm1Var = (cm1) obj4;
                cm1 cm1Var2 = (cm1) obj3;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    if (cm1Var == cm1Var2) {
                        sk2Var2.X(-1835714102);
                        ev2.a(pu.t(), null, o76.h(wy3Var, 20.0f), mj2.C(sk2Var2).l, sk2Var2, 432, 0);
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(-1835603742);
                        sk2Var2.p(false);
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 7:
                ((Integer) obj2).getClass();
                ((c11) obj4).a((a11) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 8:
                r61 r61Var = (r61) obj4;
                k24 k24Var = (k24) obj3;
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z3)) {
                    if (r61Var instanceof q61) {
                        sk2Var3.X(193169358);
                        zy3 t = a53.t(o76.h(wy3Var, 38.0f), gr5.a);
                        Object L = sk2Var3.L();
                        if (L == sn1Var) {
                            L = new f4(k24Var, 18);
                            sk2Var3.h0(L);
                        }
                        zy3 s = a53.s(t, false, null, (ki2) L, 15);
                        tv3 d = d50.d(y60.Z, false);
                        int hashCode = Long.hashCode(sk2Var3.T);
                        sm4 l = sk2Var3.l();
                        zy3 e0 = l07.e0(sk2Var3, s);
                        nu0.i.getClass();
                        mv0 mv0Var = mu0.b;
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(mv0Var);
                        } else {
                            sk2Var3.k0();
                        }
                        oo2.S(sk2Var3, mu0.f, d);
                        oo2.S(sk2Var3, mu0.e, l);
                        oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var3, mu0.h);
                        oo2.S(sk2Var3, mu0.d, e0);
                        ev2.b(jk2.P(l07.L(), sk2Var3), me2.X(sk2Var3, R.string.import_dsiware_title), o76.h(wy3Var, 24.0f), mj2.C(sk2Var3).g, sk2Var3, 392, 0);
                        sk2Var3.p(true);
                        sk2Var3.p(false);
                    } else {
                        sk2Var3.X(193778632);
                        sk2Var3.p(false);
                    }
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 9:
                ((Integer) obj2).getClass();
                b53.j((w61) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 10:
                ao6 ao6Var = (ao6) obj4;
                mo6 mo6Var = (mo6) obj3;
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z4)) {
                    boolean f = sk2Var4.f(ao6Var);
                    Object L2 = sk2Var4.L();
                    if (f || L2 == sn1Var) {
                        L2 = me2.q(new i4(0, ao6Var, ao6.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 3));
                        sk2Var4.h0(L2);
                    }
                    xb1.a(mo6Var, (zn6) ((ae6) L2).getValue(), sk2Var4, 0);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 11:
                ((Integer) obj2).getClass();
                xb1.a((mo6) obj4, (zn6) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case mj2.L /* 12 */:
                ((Integer) obj2).getClass();
                b53.s((List) obj4, (Collection) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 13:
                i05 i05Var = (i05) obj4;
                k24 k24Var2 = (k24) obj3;
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z5)) {
                    zy3 L3 = n40.L(b53.X(wy3Var, 8.0f), u43.Min);
                    sr5 a = rr5.a(rt.a, y60.h0, sk2Var5, 48);
                    int hashCode2 = Long.hashCode(sk2Var5.T);
                    sm4 l2 = sk2Var5.l();
                    zy3 e02 = l07.e0(sk2Var5, L3);
                    nu0.i.getClass();
                    mv0 mv0Var2 = mu0.b;
                    sk2Var5.b0();
                    if (sk2Var5.S) {
                        sk2Var5.k(mv0Var2);
                    } else {
                        sk2Var5.k0();
                    }
                    oo2.S(sk2Var5, mu0.f, a);
                    oo2.S(sk2Var5, mu0.e, l2);
                    oo2.S(sk2Var5, mu0.g, Integer.valueOf(hashCode2));
                    oo2.P(sk2Var5, mu0.h);
                    oo2.S(sk2Var5, mu0.d, e02);
                    if (((Boolean) sk2Var5.j(j23.a)).booleanValue()) {
                        sk2Var5.X(1285663259);
                        d50.a(dk7.i(o76.h(wy3Var, 40.0f), xq0.c, iq2.g), sk2Var5, 6);
                        sk2Var5.p(false);
                    } else {
                        sk2Var5.X(1285774487);
                        zy3 h = o76.h(wy3Var, 40.0f);
                        tw2 tw2Var = new tw2((Context) sk2Var5.j(ue.b));
                        tw2Var.c = i05Var.b.toString();
                        tw2Var.b(false);
                        cg2.b(tw2Var.a(), null, h, null, RecyclerView.A1, sk2Var5, 432, 4088);
                        sk2Var5.p(false);
                    }
                    zy3 b = o76.b(wy3Var, 1.0f);
                    gu3 gu3Var = (gu3) k24Var2.getValue();
                    Object L4 = sk2Var5.L();
                    if (L4 == sn1Var) {
                        L4 = new qu1(8);
                        sk2Var5.h0(L4);
                    }
                    b53.c(gu3Var, b, (mi2) L4, null, "content-animation", null, ct3.H0(-983851858, new ti(2, i05Var), sk2Var5), sk2Var5, 1597872);
                    sk2Var5.p(true);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 14:
                ((Integer) obj2).getClass();
                jk2.e((zy3) obj4, (i05) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case ig7.e /* 15 */:
                r8 r8Var = (r8) obj4;
                z86 z86Var = (z86) obj3;
                int intValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof au0) {
                    ((o24) r8Var.f).b((au0) obj2);
                } else if (!(obj2 instanceof qf5)) {
                    if (obj2 instanceof wk2) {
                        f34.L(z86Var, intValue6, obj2);
                        r8Var.e((wk2) obj2);
                    } else if (obj2 instanceof m55) {
                        f34.L(z86Var, intValue6, obj2);
                        ((m55) obj2).c();
                    }
                }
                return o27Var;
            case 16:
                ((Integer) obj2).getClass();
                q13.b((b) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 17:
                ((Integer) obj2).getClass();
                q13.e((String) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 18:
                ((Integer) obj2).getClass();
                nl2.f((s00) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 19:
                ki2 ki2Var = (ki2) obj4;
                jd7 jd7Var = (jd7) obj3;
                tu0 tu0Var6 = (tu0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z8 = true;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue7 & 1, z8)) {
                    oo2.c(ki2Var, null, false, ct3.H0(-430682385, new d4(jd7Var, 1), sk2Var6), sk2Var6, 24576, 14);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case 20:
                eo2 eo2Var = (eo2) obj4;
                nt ntVar = (nt) obj3;
                od1 od1Var = (od1) obj;
                lz0 lz0Var2 = (lz0) obj2;
                if (lz0.h(lz0Var2.a) == Integer.MAX_VALUE) {
                    pz2.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h2 = lz0.h(lz0Var2.a);
                int[] m1 = tq0.m1(eo2Var.a(od1Var, h2, od1Var.Y(ntVar.a())));
                int[] iArr = new int[m1.length];
                ntVar.g(od1Var, h2, m1, sd3.Ltr, iArr);
                return new ci3(0, m1, iArr);
            case 21:
                dj3 dj3Var = (dj3) obj4;
                cj3 cj3Var = (cj3) obj3;
                tu0 tu0Var7 = (tu0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var7;
                if (sk2Var7.O(intValue8 & 1, z6)) {
                    ej3 ej3Var = (ej3) dj3Var.b.c();
                    int i2 = cj3Var.c;
                    Object obj5 = cj3Var.a;
                    if ((i2 >= ej3Var.a() || !ej3Var.c(i2).equals(obj5)) && (i2 = ej3Var.e(obj5)) != -1) {
                        cj3Var.c = i2;
                    }
                    int i3 = i2;
                    if (i3 != -1) {
                        sk2Var7.X(-1664741271);
                        mj2.e(ej3Var, dj3Var.a, i3, cj3Var.a, sk2Var7, 0);
                        sk2Var7.p(false);
                    } else {
                        sk2Var7.X(-1664505826);
                        sk2Var7.p(false);
                    }
                    boolean h3 = sk2Var7.h(cj3Var);
                    Object L5 = sk2Var7.L();
                    if (h3 || L5 == sn1Var) {
                        L5 = new kb2(5, cj3Var);
                        sk2Var7.h0(L5);
                    }
                    l.d(obj5, (mi2) L5, sk2Var7);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            case 22:
                return ((fj3) obj3).a(new gj3((dj3) obj4, (zh6) obj), ((lz0) obj2).a);
            case 23:
                et0 et0Var2 = (et0) obj4;
                rk3 rk3Var = (rk3) obj3;
                tu0 tu0Var8 = (tu0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                sk2 sk2Var8 = (sk2) tu0Var8;
                if (sk2Var8.O(intValue9 & 1, z7)) {
                    et0Var2.i(rk3Var, sk2Var8, 0);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
            case 24:
                c17 c17Var = (c17) obj4;
                et0 et0Var3 = (et0) obj3;
                tu0 tu0Var9 = (tu0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z8 = true;
                }
                sk2 sk2Var9 = (sk2) tu0Var9;
                if (sk2Var9.O(intValue10 & 1, z8)) {
                    ir6.a(c17Var.i, ct3.H0(905505767, new sp(et0Var3, 5), sk2Var9), sk2Var9, 48);
                } else {
                    sk2Var9.R();
                }
                return o27Var;
            case 25:
                jd7 jd7Var2 = (jd7) obj4;
                et0 et0Var4 = (et0) obj3;
                tu0 tu0Var10 = (tu0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z8 = true;
                }
                sk2 sk2Var10 = (sk2) tu0Var10;
                if (sk2Var10.O(intValue11 & 1, z8)) {
                    boolean z9 = jd7Var2.a;
                    long j = jd7Var2.j;
                    long j2 = jd7Var2.l;
                    long j3 = jd7Var2.b;
                    long j4 = jd7Var2.c;
                    if (z9) {
                        long j5 = xq0.d;
                        long j6 = jd7Var2.g;
                        ye6 ye6Var = ir0.a;
                        hr0Var = new hr0(j, j, j2, j2, j3, j4, j, j5, j5, j6, j6, j5, false);
                    } else {
                        long j7 = xq0.d;
                        long j8 = jd7Var2.g;
                        ye6 ye6Var2 = ir0.a;
                        hr0Var = new hr0(j, j, j2, j2, j3, j4, j, j7, j7, j8, j8, j7, true);
                    }
                    sd2 sd2Var = td7.b;
                    ye6 ye6Var3 = d17.b;
                    ds6 ds6Var = ((c17) sk2Var10.j(ye6Var3)).d;
                    sd2 sd2Var2 = td7.a;
                    pe2 pe2Var = pe2.d0;
                    ds6 a2 = ds6.a(ds6Var, 0L, 0L, pe2Var, sd2Var2, 0L, 0L, null, 16777179);
                    ds6 a3 = ds6.a(((c17) sk2Var10.j(ye6Var3)).e, 0L, 0L, pe2Var, sd2Var2, 0L, 0L, null, 16777179);
                    ds6 ds6Var2 = ((c17) sk2Var10.j(ye6Var3)).f;
                    pe2 pe2Var2 = pe2.c0;
                    io2.d(hr0Var, new c17(sd2Var, a2, a3, ds6.a(ds6Var2, 0L, 0L, pe2Var2, sd2Var2, 0L, 0L, null, 16777179), ds6.a(((c17) sk2Var10.j(ye6Var3)).g, 0L, 0L, pe2Var2, sd2Var2, 0L, 0L, null, 16777179), ds6.a(((c17) sk2Var10.j(ye6Var3)).i, 0L, 0L, null, null, 0L, hi2.B(20), null, 16646143), ds6.a(((c17) sk2Var10.j(ye6Var3)).k, 0L, 0L, pe2Var, sd2Var2, 0L, 0L, null, 16777179), 13582), null, ct3.H0(1811609421, new sp(et0Var4, 7), sk2Var10), sk2Var10, 3072);
                } else {
                    sk2Var10.R();
                }
                return o27Var;
            case 26:
                ((Integer) obj2).getClass();
                mj2.c((jt5) obj4, (et0) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 27:
                k75 k75Var = (k75) obj4;
                float floatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                k75Var.A += ((lk3) obj3).b.a(floatValue3 - k75Var.A);
                return o27Var;
            case 28:
                Set set = (Set) obj3;
                xl4 xl4Var = (xl4) obj2;
                ((String) obj).getClass();
                xl4Var.getClass();
                long d2 = xl4Var.a.d();
                if (((Set) obj4).contains(Long.valueOf(d2))) {
                    return xl4.a(xl4Var, zl4.PERMANENT_FAILURE);
                }
                if (set.contains(Long.valueOf(d2)) && xl4Var.b != zl4.PERMANENT_FAILURE) {
                    return xl4.a(xl4Var, zl4.RETRYABLE);
                }
                return xl4Var;
            default:
                ((Integer) obj2).getClass();
                jk2.b((ee5) obj4, (ee5) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ s4(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
