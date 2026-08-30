package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ w3(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
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
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i = this.A;
        mr0 mr0Var = mr0.a;
        mt mtVar = rt.c;
        sn1 sn1Var = su0.a;
        o27 o27Var = o27.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                xq0 xq0Var = (xq0) obj5;
                bj2 bj2Var = (bj2) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    u43 u43Var = u43.Min;
                    wy3 wy3Var = wy3.a;
                    zy3 X = b53.X(n40.L(wy3Var, u43Var), 4.0f);
                    sr5 a = rr5.a(rt.a, y60.h0, sk2Var, 48);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, X);
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
                    if (xq0Var != null) {
                        sk2Var.X(2132064774);
                        d50.a(dk7.i(o76.b(o76.k(b53.b0(wy3Var, RecyclerView.A1, RecyclerView.A1, 4.0f, RecyclerView.A1, 11), 3.0f), 1.0f), xq0Var.a, gr5.b(2.0f)), sk2Var, 0);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(2132365567);
                        sk2Var.p(false);
                    }
                    if (((Boolean) sk2Var.j(j23.a)).booleanValue()) {
                        sk2Var.X(2132418887);
                        d50.a(dk7.i(o76.h(wy3Var, 32.0f), xq0.c, iq2.g), sk2Var, 6);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(2132541895);
                        zy3 h = o76.h(wy3Var, 32.0f);
                        tw2 tw2Var = new tw2((Context) sk2Var.j(ue.b));
                        tw2Var.c = obj4;
                        tw2Var.b(false);
                        cg2.b(tw2Var.a(), null, h, null, RecyclerView.A1, sk2Var, 432, 4088);
                        sk2Var.p(false);
                    }
                    if (bj2Var == null) {
                        sk2Var.X(2132914514);
                    } else {
                        sk2Var.X(1177182351);
                        bj2Var.i(ur5.a, sk2Var, 6);
                    }
                    sk2Var.p(false);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                n40.u((zy3) obj5, (j15) obj4, (ki2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 2:
                zy3 zy3Var = (zy3) obj5;
                k24 k24Var = (k24) obj4;
                et0 et0Var = (et0) obj3;
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    Object L = sk2Var2.L();
                    if (L == sn1Var) {
                        L = new j4(k24Var, 4);
                        sk2Var2.h0(L);
                    }
                    zy3 z15 = w81.z(zy3Var, (mi2) L);
                    tv3 d = d50.d(y60.L, true);
                    int hashCode2 = Long.hashCode(sk2Var2.T);
                    sm4 l2 = sk2Var2.l();
                    zy3 e02 = l07.e0(sk2Var2, z15);
                    nu0.i.getClass();
                    mv0 mv0Var2 = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var2);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, d);
                    oo2.S(sk2Var2, mu0.e, l2);
                    oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode2));
                    oo2.P(sk2Var2, mu0.h);
                    oo2.S(sk2Var2, mu0.d, e02);
                    et0Var.j(sk2Var2, 0);
                    sk2Var2.p(true);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 3:
                k24 k24Var2 = (k24) obj5;
                ki2 ki2Var = (ki2) obj4;
                ki2 ki2Var2 = (ki2) obj3;
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z3)) {
                    ev2.b(jk2.P(oo2.J(), sk2Var3), me2.X(sk2Var3, R.string.options), null, 0L, sk2Var3, 8, 12);
                    boolean booleanValue = ((Boolean) k24Var2.getValue()).booleanValue();
                    Object L2 = sk2Var3.L();
                    if (L2 == sn1Var) {
                        L2 = new f4(k24Var2, 5);
                        sk2Var3.h0(L2);
                    }
                    hi.a(booleanValue, (ki2) L2, null, 0L, null, null, ct3.H0(361844192, new az(ki2Var, ki2Var2, k24Var2, 0), sk2Var3), sk2Var3, 1572912);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 4:
                k24 k24Var3 = (k24) obj5;
                ih4 ih4Var = (ih4) obj4;
                bj2 bj2Var2 = (bj2) obj3;
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z4)) {
                    dk7.a(b01.a.a(Float.valueOf(xq0.d(((xq0) k24Var3.getValue()).a))), ct3.H0(-869936862, new g70(ih4Var, bj2Var2, 0), sk2Var4), sk2Var4, 56);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 5:
                wc2 wc2Var = (wc2) obj5;
                final pl0 pl0Var = (pl0) obj4;
                ki2 ki2Var3 = (ki2) obj3;
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z5)) {
                    wy3 wy3Var2 = wy3.a;
                    zy3 I = b53.I(o76.c(wy3Var2, 1.0f), wc2Var);
                    oq6 oq6Var = (oq6) pl0Var.b.getValue();
                    if (((ol0) pl0Var.e.getValue()) != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yb1 w = pu.w(sk2Var5);
                    fb3 fb3Var = new fb3(3, 0, 6, 118);
                    boolean f = sk2Var5.f(pl0Var);
                    Object L3 = sk2Var5.L();
                    if (f || L3 == sn1Var) {
                        L3 = new mi2() { // from class: dl0
                            @Override // defpackage.mi2
                            public final Object n(Object obj6) {
                                int i2 = r2;
                                o27 o27Var2 = o27.a;
                                pl0 pl0Var2 = pl0Var;
                                oq6 oq6Var2 = (oq6) obj6;
                                switch (i2) {
                                    case 0:
                                        oq6Var2.getClass();
                                        pl0Var2.getClass();
                                        tj4 tj4Var = pl0Var2.b;
                                        tj4Var.setValue(oq6Var2);
                                        tj4 tj4Var2 = pl0Var2.e;
                                        if (((ol0) tj4Var2.getValue()) != null) {
                                            if (zg6.B0(((oq6) tj4Var.getValue()).a.B)) {
                                                tj4Var2.setValue(ol0.CANNOT_BE_EMPTY);
                                            } else {
                                                tj4Var2.setValue(null);
                                            }
                                        }
                                        return o27Var2;
                                    case 1:
                                        oq6Var2.getClass();
                                        pl0Var2.getClass();
                                        pl0Var2.c.setValue(oq6Var2);
                                        return o27Var2;
                                    default:
                                        oq6Var2.getClass();
                                        pl0Var2.d.setValue(ct3.g0(oq6Var2));
                                        if (((ol0) pl0Var2.f.getValue()) != null) {
                                            pl0Var2.b();
                                        }
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var5.h0(L3);
                    }
                    nl2.i(oq6Var, (mi2) L3, I, false, null, tq5.e, tq5.f, z6, null, fb3Var, null, true, 0, 0, null, w, sk2Var5, 1572864, 199686, 1004472);
                    zy3 c = o76.c(wy3Var2, 1.0f);
                    oq6 oq6Var2 = (oq6) pl0Var.c.getValue();
                    yb1 w2 = pu.w(sk2Var5);
                    fb3 fb3Var2 = new fb3(3, 0, 6, 118);
                    boolean f2 = sk2Var5.f(pl0Var);
                    Object L4 = sk2Var5.L();
                    if (f2 || L4 == sn1Var) {
                        L4 = new mi2() { // from class: dl0
                            @Override // defpackage.mi2
                            public final Object n(Object obj6) {
                                int i2 = r2;
                                o27 o27Var2 = o27.a;
                                pl0 pl0Var2 = pl0Var;
                                oq6 oq6Var22 = (oq6) obj6;
                                switch (i2) {
                                    case 0:
                                        oq6Var22.getClass();
                                        pl0Var2.getClass();
                                        tj4 tj4Var = pl0Var2.b;
                                        tj4Var.setValue(oq6Var22);
                                        tj4 tj4Var2 = pl0Var2.e;
                                        if (((ol0) tj4Var2.getValue()) != null) {
                                            if (zg6.B0(((oq6) tj4Var.getValue()).a.B)) {
                                                tj4Var2.setValue(ol0.CANNOT_BE_EMPTY);
                                            } else {
                                                tj4Var2.setValue(null);
                                            }
                                        }
                                        return o27Var2;
                                    case 1:
                                        oq6Var22.getClass();
                                        pl0Var2.getClass();
                                        pl0Var2.c.setValue(oq6Var22);
                                        return o27Var2;
                                    default:
                                        oq6Var22.getClass();
                                        pl0Var2.d.setValue(ct3.g0(oq6Var22));
                                        if (((ol0) pl0Var2.f.getValue()) != null) {
                                            pl0Var2.b();
                                        }
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var5.h0(L4);
                    }
                    vf4.a(oq6Var2, (mi2) L4, c, false, null, tq5.g, false, null, fb3Var2, null, false, 0, 0, null, w2, sk2Var5, 1573248, RendererDebugBridge.CAPTURE_HEIGHT, 520120);
                    zy3 c2 = o76.c(wy3Var2, 1.0f);
                    oq6 oq6Var3 = (oq6) pl0Var.d.getValue();
                    ds6 a2 = ds6.a((ds6) sk2Var5.j(ir6.a), 0L, 0L, null, pd2.B, 0L, 0L, null, 16777183);
                    if (((ol0) pl0Var.f.getValue()) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    yb1 w3 = pu.w(sk2Var5);
                    fb3 fb3Var3 = new fb3(1, 0, 7, 116);
                    boolean f3 = sk2Var5.f(ki2Var3);
                    Object L5 = sk2Var5.L();
                    if (f3 || L5 == sn1Var) {
                        L5 = new el0(0, ki2Var3);
                        sk2Var5.h0(L5);
                    }
                    db3 db3Var = new db3(62, (mi2) L5);
                    boolean f4 = sk2Var5.f(pl0Var);
                    Object L6 = sk2Var5.L();
                    if (f4 || L6 == sn1Var) {
                        L6 = new mi2() { // from class: dl0
                            @Override // defpackage.mi2
                            public final Object n(Object obj6) {
                                int i2 = r2;
                                o27 o27Var2 = o27.a;
                                pl0 pl0Var2 = pl0Var;
                                oq6 oq6Var22 = (oq6) obj6;
                                switch (i2) {
                                    case 0:
                                        oq6Var22.getClass();
                                        pl0Var2.getClass();
                                        tj4 tj4Var = pl0Var2.b;
                                        tj4Var.setValue(oq6Var22);
                                        tj4 tj4Var2 = pl0Var2.e;
                                        if (((ol0) tj4Var2.getValue()) != null) {
                                            if (zg6.B0(((oq6) tj4Var.getValue()).a.B)) {
                                                tj4Var2.setValue(ol0.CANNOT_BE_EMPTY);
                                            } else {
                                                tj4Var2.setValue(null);
                                            }
                                        }
                                        return o27Var2;
                                    case 1:
                                        oq6Var22.getClass();
                                        pl0Var2.getClass();
                                        pl0Var2.c.setValue(oq6Var22);
                                        return o27Var2;
                                    default:
                                        oq6Var22.getClass();
                                        pl0Var2.d.setValue(ct3.g0(oq6Var22));
                                        if (((ol0) pl0Var2.f.getValue()) != null) {
                                            pl0Var2.b();
                                        }
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var5.h0(L6);
                    }
                    nl2.i(oq6Var3, (mi2) L6, c2, false, a2, tq5.h, ct3.H0(1770623028, new fl0(pl0Var, 0), sk2Var5), z7, null, fb3Var3, db3Var, false, 0, 4, null, w3, sk2Var5, 1573248, 12585990, 889752);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                ((Integer) obj2).getClass();
                b53.f((bl0) obj5, (ki2) obj4, (mi2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 7:
                ((Integer) obj2).getClass();
                dt3.n((zy3) obj5, (ul0) obj4, (ki2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 8:
                jd7 jd7Var = (jd7) obj5;
                String str = (String) obj4;
                et0 et0Var2 = (et0) obj3;
                tu0 tu0Var6 = (tu0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue6 & 1, z8)) {
                    wy3 wy3Var3 = wy3.a;
                    zy3 t = a53.t(o76.c(wy3Var3, 1.0f), gr5.b(16.0f));
                    long j = jd7Var.c;
                    long j2 = jd7Var.f;
                    is2 is2Var = iq2.g;
                    zy3 Z = b53.Z(b53.z(1.0f, j2, dk7.i(t, j, is2Var), gr5.b(16.0f)), RecyclerView.A1, 12.0f, 1);
                    lr0 a3 = jr0.a(mtVar, y60.j0, sk2Var6, 0);
                    int hashCode3 = Long.hashCode(sk2Var6.T);
                    sm4 l3 = sk2Var6.l();
                    zy3 e03 = l07.e0(sk2Var6, Z);
                    nu0.i.getClass();
                    mv0 mv0Var3 = mu0.b;
                    sk2Var6.b0();
                    if (sk2Var6.S) {
                        sk2Var6.k(mv0Var3);
                    } else {
                        sk2Var6.k0();
                    }
                    oo2.S(sk2Var6, mu0.f, a3);
                    oo2.S(sk2Var6, mu0.e, l3);
                    oo2.S(sk2Var6, mu0.g, Integer.valueOf(hashCode3));
                    oo2.P(sk2Var6, mu0.h);
                    oo2.S(sk2Var6, mu0.d, e03);
                    ir6.b(str, b53.Y(wy3Var3, 20.0f, 6.0f), jd7Var.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var6, 1772592, 0, 130960);
                    d50.a(dk7.i(o76.d(o76.c(b53.b0(wy3Var3, RecyclerView.A1, 4.0f, RecyclerView.A1, 2.0f, 5), 1.0f), 1.0f), j2, is2Var), sk2Var6, 0);
                    et0Var2.i(mr0Var, sk2Var6, 6);
                    sk2Var6.p(true);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case 9:
                ((Integer) obj2).getClass();
                yx0.c((String) obj5, (ki2) obj4, (et0) obj3, (tu0) obj, ep2.I(385));
                return o27Var;
            case 10:
                ((Integer) obj2).getClass();
                l07.c((zy3) obj5, (bq6) obj4, (et0) obj3, (tu0) obj, ep2.I(385));
                return o27Var;
            case 11:
                ((Integer) obj2).getClass();
                n40.m((i71) obj5, (ki2) obj4, (mi2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case mj2.L /* 12 */:
                String str2 = (String) obj5;
                List list = (List) obj4;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                tu0 tu0Var7 = (tu0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                int i2 = EmulatorActivity.P1;
                if ((intValue7 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var7;
                if (sk2Var7.O(intValue7 & 1, z9)) {
                    String string = emulatorActivity.getString(R.string.external_choose_on_device);
                    string.getClass();
                    pu.h(str2, list, string, sk2Var7, 0);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            case 13:
                ((Integer) obj2).getClass();
                pu.h((String) obj5, (List) obj4, (String) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 14:
                ((Integer) obj2).getClass();
                pu.c((rg5) obj5, (String) obj4, (String) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case ig7.e /* 15 */:
                ((Integer) obj2).getClass();
                ji7.a((zy3) obj5, (sk0) obj4, (ki2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 16:
                ((Integer) obj2).getClass();
                gk2.f((zy3) obj5, (yj2) obj4, (ki2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
            case 17:
                ki2 ki2Var4 = (ki2) obj5;
                Integer num = (Integer) obj4;
                mi2 mi2Var = (mi2) obj3;
                tu0 tu0Var8 = (tu0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sk2 sk2Var8 = (sk2) tu0Var8;
                if (sk2Var8.O(intValue8 & 1, z10)) {
                    mh7.e(me2.X(sk2Var8, R.string.cancel), false, ki2Var4, sk2Var8, 0, 2);
                    String X2 = me2.X(sk2Var8, R.string.ok);
                    if (num != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean f5 = sk2Var8.f(num) | sk2Var8.f(mi2Var);
                    Object L7 = sk2Var8.L();
                    if (f5 || L7 == sn1Var) {
                        L7 = new jd2(6, num, mi2Var);
                        sk2Var8.h0(L7);
                    }
                    mh7.e(X2, z11, (ki2) L7, sk2Var8, 0, 0);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
            case 18:
                ((Integer) obj2).getClass();
                gk2.g((nd3) obj5, (ki2) obj4, (cj2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 19:
                zy3 zy3Var2 = (zy3) obj5;
                fw5 fw5Var = (fw5) obj4;
                et0 et0Var3 = (et0) obj3;
                tu0 tu0Var9 = (tu0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sk2 sk2Var9 = (sk2) tu0Var9;
                if (sk2Var9.O(intValue9 & 1, z12)) {
                    zy3 Z2 = se.Z(n40.f0(b53.Z(zy3Var2, RecyclerView.A1, 8.0f, 1), u43.Max), fw5Var);
                    lr0 a4 = jr0.a(mtVar, y60.j0, sk2Var9, 0);
                    int j0 = dt3.j0(sk2Var9);
                    sm4 l4 = sk2Var9.l();
                    zy3 e04 = l07.e0(sk2Var9, Z2);
                    nu0.i.getClass();
                    mv0 mv0Var4 = mu0.b;
                    sk2Var9.b0();
                    if (sk2Var9.S) {
                        sk2Var9.k(mv0Var4);
                    } else {
                        sk2Var9.k0();
                    }
                    oo2.S(sk2Var9, mu0.f, a4);
                    oo2.S(sk2Var9, mu0.e, l4);
                    dn dnVar = mu0.g;
                    if (sk2Var9.S || !b53.x(sk2Var9.L(), Integer.valueOf(j0))) {
                        b31.w(j0, sk2Var9, j0, dnVar);
                    }
                    oo2.S(sk2Var9, mu0.d, e04);
                    et0Var3.i(mr0Var, sk2Var9, 6);
                    sk2Var9.p(true);
                } else {
                    sk2Var9.R();
                }
                return o27Var;
            case 20:
                ((Integer) obj2).getClass();
                mj2.a((l34) obj5, (jt5) obj4, (et0) obj3, (tu0) obj, ep2.I(385));
                return o27Var;
            case 21:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                tq5.w((o31) obj5, null, null, new r44(floatValue, (by5) obj4, (l34) obj3, (j11) null), 3);
                return o27Var;
            case 22:
                ((Integer) obj2).getClass();
                ol4.b((ll4) obj5, (ki2) obj4, (ki2) obj3, (tu0) obj, ep2.I(49));
                return o27Var;
            case 23:
                ((Integer) obj2).getClass();
                jk2.h((u92) obj5, (ki2) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 24:
                ((Integer) obj2).getClass();
                ct3.C((RewindWindow) obj5, (mi2) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 25:
                ((Integer) obj2).getClass();
                f34.i((gl5) obj5, (mi2) obj4, (zy3) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 26:
                k75 k75Var = (k75) obj5;
                ax5 ax5Var = (ax5) obj4;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h2 = ax5Var.h(ax5Var.d(floatValue2 - k75Var.A));
                ax5 ax5Var2 = ((xw5) obj3).a;
                k75Var.A += ax5Var.d(ax5Var.g(ax5Var2.c(ax5Var2.k, h2, 1)));
                return o27Var;
            case 27:
                k24 k24Var4 = (k24) obj5;
                ih4 ih4Var2 = (ih4) obj4;
                et0 et0Var4 = (et0) obj3;
                tu0 tu0Var10 = (tu0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sk2 sk2Var10 = (sk2) tu0Var10;
                if (sk2Var10.O(intValue10 & 1, z13)) {
                    zy3 w4 = iq2.w("border");
                    long j3 = ((i76) k24Var4.getValue()).a;
                    int i3 = vf4.b;
                    zy3 G = l07.G(w4, new dk2(1, j3, ih4Var2));
                    tv3 d2 = d50.d(y60.L, true);
                    int j02 = dt3.j0(sk2Var10);
                    sm4 l5 = sk2Var10.l();
                    zy3 e05 = l07.e0(sk2Var10, G);
                    nu0.i.getClass();
                    mv0 mv0Var5 = mu0.b;
                    sk2Var10.b0();
                    if (sk2Var10.S) {
                        sk2Var10.k(mv0Var5);
                    } else {
                        sk2Var10.k0();
                    }
                    oo2.S(sk2Var10, mu0.f, d2);
                    oo2.S(sk2Var10, mu0.e, l5);
                    dn dnVar2 = mu0.g;
                    if (sk2Var10.S || !b53.x(sk2Var10.L(), Integer.valueOf(j02))) {
                        b31.w(j02, sk2Var10, j02, dnVar2);
                    }
                    oo2.S(sk2Var10, mu0.d, e05);
                    sk2Var10.X(235288868);
                    et0Var4.j(sk2Var10, 0);
                    sk2Var10.p(false);
                    sk2Var10.p(true);
                } else {
                    sk2Var10.R();
                }
                return o27Var;
            default:
                final uq6 uq6Var = (uq6) obj5;
                ki2 ki2Var5 = (ki2) obj4;
                k24 k24Var5 = (k24) obj3;
                tu0 tu0Var11 = (tu0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                sk2 sk2Var11 = (sk2) tu0Var11;
                if (sk2Var11.O(intValue11 & 1, z14)) {
                    String X3 = me2.X(sk2Var11, R.string.cancel);
                    boolean f6 = sk2Var11.f(uq6Var);
                    Object L8 = sk2Var11.L();
                    if (f6 || L8 == sn1Var) {
                        L8 = new ki2() { // from class: tq6
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i4 = r2;
                                o27 o27Var2 = o27.a;
                                uq6 uq6Var2 = uq6Var;
                                switch (i4) {
                                    case 0:
                                        uq6Var2.a();
                                        return o27Var2;
                                    default:
                                        uq6Var2.b();
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var11.h0(L8);
                    }
                    mh7.e(X3, false, (ki2) L8, sk2Var11, 0, 2);
                    if (ki2Var5 != null) {
                        sk2Var11.X(-243960189);
                        String X4 = me2.X(sk2Var11, R.string.delete);
                        boolean f7 = sk2Var11.f(ki2Var5) | sk2Var11.f(uq6Var);
                        Object L9 = sk2Var11.L();
                        if (f7 || L9 == sn1Var) {
                            L9 = new eq6(1, ki2Var5, uq6Var);
                            sk2Var11.h0(L9);
                        }
                        mh7.e(X4, false, (ki2) L9, sk2Var11, 0, 2);
                        sk2Var11.p(false);
                    } else {
                        sk2Var11.X(-243681499);
                        sk2Var11.p(false);
                    }
                    String X5 = me2.X(sk2Var11, R.string.ok);
                    boolean z16 = !((Boolean) k24Var5.getValue()).booleanValue();
                    boolean f8 = sk2Var11.f(uq6Var);
                    Object L10 = sk2Var11.L();
                    if (f8 || L10 == sn1Var) {
                        L10 = new ki2() { // from class: tq6
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i4 = r2;
                                o27 o27Var2 = o27.a;
                                uq6 uq6Var2 = uq6Var;
                                switch (i4) {
                                    case 0:
                                        uq6Var2.a();
                                        return o27Var2;
                                    default:
                                        uq6Var2.b();
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var11.h0(L10);
                    }
                    mh7.e(X5, z16, (ki2) L10, sk2Var11, 0, 0);
                } else {
                    sk2Var11.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ w3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
