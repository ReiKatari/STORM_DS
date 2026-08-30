package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sq1 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ sq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        st1 st1Var;
        rg5 rg5Var;
        st1 st1Var2;
        rg5 rg5Var2;
        String str;
        String str2;
        boolean z2;
        cm1 cm1Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.A;
        Object obj3 = su0.a;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.B;
        boolean z7 = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = EmulatorActivity.P1;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    Object obj4 = (jc2) sk2Var.j(ov0.i);
                    boolean h = sk2Var.h(emulatorActivity) | sk2Var.h(obj4);
                    Object L = sk2Var.L();
                    if (h || L == obj3) {
                        L = new p6(27, emulatorActivity, obj4);
                        sk2Var.h0(L);
                    }
                    l.j((ki2) L, sk2Var);
                    tj4 tj4Var = emulatorActivity.H1;
                    tj4 tj4Var2 = emulatorActivity.B1;
                    tj4 tj4Var3 = emulatorActivity.G1;
                    dr1 dr1Var = (dr1) tj4Var.getValue();
                    Object obj5 = (cr1) tq0.U0(emulatorActivity.I1);
                    kl4 kl4Var = (kl4) emulatorActivity.z1.getValue();
                    RewindWindow rewindWindow = (RewindWindow) emulatorActivity.F1.getValue();
                    s72 s72Var = o76.c;
                    tv3 d = d50.d(y60.L, false);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, s72Var);
                    nu0.i.getClass();
                    ki2 ki2Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(ki2Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, d);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    if (rewindWindow != null) {
                        sk2Var.X(2047355930);
                        boolean h2 = sk2Var.h(emulatorActivity);
                        Object L2 = sk2Var.L();
                        if (h2 || L2 == obj3) {
                            L2 = new xq1(emulatorActivity, 2);
                            sk2Var.h0(L2);
                        }
                        mi2 mi2Var = (mi2) L2;
                        boolean h3 = sk2Var.h(emulatorActivity);
                        Object L3 = sk2Var.L();
                        if (h3 || L3 == obj3) {
                            L3 = new nq1(emulatorActivity, 23);
                            sk2Var.h0(L3);
                        }
                        ct3.C(rewindWindow, mi2Var, (ki2) L3, sk2Var, 0);
                        sk2Var.p(false);
                    } else if (((Boolean) emulatorActivity.y1.getValue()).booleanValue()) {
                        sk2Var.X(2047831966);
                        k24 m = me2.m(emulatorActivity.U().Y0, sk2Var);
                        k24 m2 = me2.m(emulatorActivity.U().W0, sk2Var);
                        k24 m3 = me2.m(emulatorActivity.U().a1, sk2Var);
                        k24 m4 = me2.m(emulatorActivity.U().c1, sk2Var);
                        k24 m5 = me2.m(emulatorActivity.U().e1, sk2Var);
                        k24 m6 = me2.m(emulatorActivity.U().g1, sk2Var);
                        k24 m7 = me2.m(emulatorActivity.U().i1, sk2Var);
                        k24 m8 = me2.m(emulatorActivity.U().k1, sk2Var);
                        k24 m9 = me2.m(emulatorActivity.U().m1, sk2Var);
                        cm1 cm1Var2 = (cm1) m.getValue();
                        boolean h4 = sk2Var.h(emulatorActivity);
                        Object L4 = sk2Var.L();
                        if (!h4 && L4 != obj3) {
                            cm1Var = cm1Var2;
                        } else {
                            cm1Var = cm1Var2;
                            L4 = new xq1(emulatorActivity, 4);
                            sk2Var.h0(L4);
                        }
                        mi2 mi2Var2 = (mi2) L4;
                        boolean booleanValue = ((Boolean) m2.getValue()).booleanValue();
                        boolean h5 = sk2Var.h(emulatorActivity);
                        Object L5 = sk2Var.L();
                        if (h5 || L5 == obj3) {
                            L5 = new xq1(emulatorActivity, 5);
                            sk2Var.h0(L5);
                        }
                        mi2 mi2Var3 = (mi2) L5;
                        boolean booleanValue2 = ((Boolean) m3.getValue()).booleanValue();
                        boolean h6 = sk2Var.h(emulatorActivity);
                        Object L6 = sk2Var.L();
                        if (h6 || L6 == obj3) {
                            L6 = new xq1(emulatorActivity, 7);
                            sk2Var.h0(L6);
                        }
                        mi2 mi2Var4 = (mi2) L6;
                        boolean booleanValue3 = ((Boolean) m4.getValue()).booleanValue();
                        boolean h7 = sk2Var.h(emulatorActivity);
                        Object L7 = sk2Var.L();
                        if (h7 || L7 == obj3) {
                            L7 = new xq1(emulatorActivity, 8);
                            sk2Var.h0(L7);
                        }
                        mi2 mi2Var5 = (mi2) L7;
                        boolean booleanValue4 = ((Boolean) m5.getValue()).booleanValue();
                        boolean h8 = sk2Var.h(emulatorActivity);
                        Object L8 = sk2Var.L();
                        if (h8 || L8 == obj3) {
                            L8 = new xq1(emulatorActivity, 9);
                            sk2Var.h0(L8);
                        }
                        mi2 mi2Var6 = (mi2) L8;
                        boolean booleanValue5 = ((Boolean) m6.getValue()).booleanValue();
                        boolean h9 = sk2Var.h(emulatorActivity);
                        Object L9 = sk2Var.L();
                        if (h9 || L9 == obj3) {
                            L9 = new xq1(emulatorActivity, 10);
                            sk2Var.h0(L9);
                        }
                        mi2 mi2Var7 = (mi2) L9;
                        boolean booleanValue6 = ((Boolean) m7.getValue()).booleanValue();
                        boolean h10 = sk2Var.h(emulatorActivity);
                        Object L10 = sk2Var.L();
                        if (h10 || L10 == obj3) {
                            L10 = new xq1(emulatorActivity, 11);
                            sk2Var.h0(L10);
                        }
                        mi2 mi2Var8 = (mi2) L10;
                        gv5 gv5Var = (gv5) m8.getValue();
                        boolean h11 = sk2Var.h(emulatorActivity);
                        Object L11 = sk2Var.L();
                        if (h11 || L11 == obj3) {
                            L11 = new xq1(emulatorActivity, 0);
                            sk2Var.h0(L11);
                        }
                        mi2 mi2Var9 = (mi2) L11;
                        gv5 gv5Var2 = (gv5) m9.getValue();
                        boolean h12 = sk2Var.h(emulatorActivity);
                        Object L12 = sk2Var.L();
                        if (h12 || L12 == obj3) {
                            L12 = new xq1(emulatorActivity, 1);
                            sk2Var.h0(L12);
                        }
                        mi2 mi2Var10 = (mi2) L12;
                        boolean h13 = sk2Var.h(emulatorActivity);
                        Object L13 = sk2Var.L();
                        if (h13 || L13 == obj3) {
                            L13 = new nq1(emulatorActivity, 16);
                            sk2Var.h0(L13);
                        }
                        yx0.a(cm1Var, mi2Var2, booleanValue, mi2Var3, booleanValue2, mi2Var4, booleanValue3, mi2Var5, booleanValue4, mi2Var6, booleanValue5, mi2Var7, booleanValue6, mi2Var8, gv5Var, mi2Var9, gv5Var2, mi2Var10, (ki2) L13, sk2Var, 0);
                        sk2Var.p(false);
                    } else if (obj5 != null) {
                        sk2Var.X(2051384597);
                        if (obj5 instanceof br1) {
                            sk2Var.X(481819132);
                            br1 br1Var = (br1) obj5;
                            String str3 = br1Var.a;
                            ip3 ip3Var = br1Var.b;
                            ArrayList arrayList = new ArrayList(uq0.y0(ip3Var, 10));
                            ListIterator listIterator = ip3Var.listIterator(0);
                            while (true) {
                                wr2 wr2Var = (wr2) listIterator;
                                if (wr2Var.hasNext()) {
                                    arrayList.add((String) ((ti4) wr2Var.next()).A);
                                } else {
                                    boolean h14 = sk2Var.h(obj5);
                                    Object L14 = sk2Var.L();
                                    if (h14 || L14 == obj3) {
                                        L14 = new j0(25, obj5);
                                        sk2Var.h0(L14);
                                    }
                                    mi2 mi2Var11 = (mi2) L14;
                                    boolean h15 = sk2Var.h(emulatorActivity);
                                    Object L15 = sk2Var.L();
                                    if (h15 || L15 == obj3) {
                                        L15 = new nq1(emulatorActivity, 17);
                                        sk2Var.h0(L15);
                                    }
                                    zx0.a(str3, arrayList, mi2Var11, (ki2) L15, sk2Var, 0);
                                    z2 = false;
                                    sk2Var.p(false);
                                }
                            }
                        } else if (obj5 instanceof ar1) {
                            sk2Var.X(481833368);
                            ar1 ar1Var = (ar1) obj5;
                            String str4 = ar1Var.a;
                            List list = ar1Var.b;
                            int i3 = ar1Var.c;
                            boolean h16 = sk2Var.h(obj5) | sk2Var.h(emulatorActivity);
                            Object L16 = sk2Var.L();
                            if (h16 || L16 == obj3) {
                                L16 = new x(24, obj5, emulatorActivity);
                                sk2Var.h0(L16);
                            }
                            mi2 mi2Var12 = (mi2) L16;
                            boolean h17 = sk2Var.h(emulatorActivity);
                            Object L17 = sk2Var.L();
                            if (h17 || L17 == obj3) {
                                L17 = new nq1(emulatorActivity, 18);
                                sk2Var.h0(L17);
                            }
                            px0.a(str4, list, i3, mi2Var12, (ki2) L17, sk2Var, 0);
                            z2 = false;
                            sk2Var.p(false);
                        } else {
                            throw ej6.d(sk2Var, 481815693, false);
                        }
                        sk2Var.p(z2);
                    } else if (dr1Var != null) {
                        sk2Var.X(2052546818);
                        wt1 wt1Var = (wt1) me2.m(emulatorActivity.U().q0, sk2Var).getValue();
                        if (wt1Var instanceof st1) {
                            st1Var2 = (st1) wt1Var;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null) {
                            rg5Var2 = st1Var2.a;
                        } else {
                            rg5Var2 = null;
                        }
                        List list2 = dr1Var.a;
                        boolean z8 = dr1Var.b;
                        if (rg5Var2 != null) {
                            String str5 = rg5Var2.f.e;
                            if (str5 == null) {
                                str2 = rg5Var2.a;
                            } else {
                                str2 = str5;
                            }
                            str = str2;
                        } else {
                            str = null;
                        }
                        boolean h18 = sk2Var.h(emulatorActivity) | sk2Var.h(dr1Var);
                        Object L18 = sk2Var.L();
                        if (h18 || L18 == obj3) {
                            L18 = new yq1(emulatorActivity, dr1Var, 0);
                            sk2Var.h0(L18);
                        }
                        mi2 mi2Var13 = (mi2) L18;
                        boolean h19 = sk2Var.h(emulatorActivity) | sk2Var.h(dr1Var);
                        Object L19 = sk2Var.L();
                        if (h19 || L19 == obj3) {
                            L19 = new yq1(emulatorActivity, dr1Var, 1);
                            sk2Var.h0(L19);
                        }
                        mi2 mi2Var14 = (mi2) L19;
                        boolean h20 = sk2Var.h(emulatorActivity);
                        Object L20 = sk2Var.L();
                        if (h20 || L20 == obj3) {
                            L20 = new nq1(emulatorActivity, 19);
                            sk2Var.h0(L20);
                        }
                        mh7.m(list2, z8, str, mi2Var13, mi2Var14, (ki2) L20, sk2Var, 0);
                        sk2Var.p(false);
                    } else if (kl4Var != null) {
                        sk2Var.X(2053808332);
                        wt1 wt1Var2 = (wt1) me2.m(emulatorActivity.U().q0, sk2Var).getValue();
                        if (wt1Var2 instanceof st1) {
                            st1Var = (st1) wt1Var2;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null) {
                            rg5Var = st1Var.a;
                        } else {
                            rg5Var = null;
                        }
                        boolean h21 = sk2Var.h(emulatorActivity);
                        Object L21 = sk2Var.L();
                        if (h21 || L21 == obj3) {
                            L21 = new xq1(emulatorActivity, 3);
                            sk2Var.h0(L21);
                        }
                        mi2 mi2Var15 = (mi2) L21;
                        boolean h22 = sk2Var.h(emulatorActivity);
                        Object L22 = sk2Var.L();
                        if (h22 || L22 == obj3) {
                            L22 = new nq1(emulatorActivity, 20);
                            sk2Var.h0(L22);
                        }
                        ol4.c(kl4Var, rg5Var, mi2Var15, (ki2) L22, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(481948006);
                        sk2Var.p(false);
                    }
                    if (((Boolean) emulatorActivity.A1.getValue()).booleanValue()) {
                        sk2Var.X(2055585407);
                        rg5 rg5Var3 = (rg5) emulatorActivity.D1.getValue();
                        if (rg5Var3 != null) {
                            sk2Var.X(2055649949);
                            String str6 = (String) emulatorActivity.E1.getValue();
                            String str7 = (String) tj4Var3.getValue();
                            boolean booleanValue7 = ((Boolean) tj4Var2.getValue()).booleanValue();
                            boolean h23 = sk2Var.h(emulatorActivity);
                            Object L23 = sk2Var.L();
                            if (h23 || L23 == obj3) {
                                L23 = new nq1(emulatorActivity, 21);
                                sk2Var.h0(L23);
                            }
                            se.a(rg5Var3, str6, str7, booleanValue7, (ki2) L23, sk2Var, 0);
                            z3 = false;
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(2056073037);
                            am1 am1Var = am1.BOTH;
                            boolean booleanValue8 = ((Boolean) tj4Var2.getValue()).booleanValue();
                            String str8 = (String) emulatorActivity.C1.getValue();
                            String str9 = (String) tj4Var3.getValue();
                            boolean h24 = sk2Var.h(emulatorActivity);
                            Object L24 = sk2Var.L();
                            if (h24 || L24 == obj3) {
                                L24 = new nq1(emulatorActivity, 22);
                                sk2Var.h0(L24);
                            }
                            mh7.f(am1Var, booleanValue8, str8, null, str9, (ki2) L24, sk2Var, 6);
                            z3 = false;
                            sk2Var.p(false);
                        }
                        sk2Var.p(z3);
                    } else {
                        sk2Var.X(2056539680);
                        sk2Var.p(false);
                    }
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = EmulatorActivity.P1;
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z4)) {
                    mj2.b(false, ct3.H0(338501151, new sq1(emulatorActivity, 4), sk2Var2), sk2Var2, 48, 1);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = EmulatorActivity.P1;
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z5)) {
                    mj2.b(false, ct3.H0(-692145080, new sq1(emulatorActivity, 0), sk2Var3), sk2Var3, 48, 1);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i6 = EmulatorActivity.P1;
                if ((intValue4 & 3) != 2) {
                    z7 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z7)) {
                    am1 am1Var2 = am1.BOTH;
                    boolean booleanValue9 = ((Boolean) emulatorActivity.B1.getValue()).booleanValue();
                    String str10 = (String) emulatorActivity.C1.getValue();
                    String str11 = (String) emulatorActivity.G1.getValue();
                    boolean h25 = sk2Var4.h(emulatorActivity);
                    Object L25 = sk2Var4.L();
                    if (h25 || L25 == obj3) {
                        L25 = new nq1(emulatorActivity, 4);
                        sk2Var4.h0(L25);
                    }
                    mh7.f(am1Var2, booleanValue9, str10, null, str11, (ki2) L25, sk2Var4, 6);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            default:
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i7 = EmulatorActivity.P1;
                if ((intValue5 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z6)) {
                    qo0 a = q75.a(ct1.class);
                    q9 q9Var = new q9(emulatorActivity.getViewModelStore(), emulatorActivity.getDefaultViewModelProviderFactory(), emulatorActivity.getDefaultViewModelCreationExtras());
                    String b = a.b();
                    if (b != null) {
                        ct1 ct1Var = (ct1) q9Var.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                        boolean h26 = sk2Var5.h(emulatorActivity) | sk2Var5.h(ct1Var);
                        Object L26 = sk2Var5.L();
                        if (h26 || L26 == obj3) {
                            L26 = new ba1(emulatorActivity, ct1Var, null, 3);
                            sk2Var5.h0(L26);
                        }
                        l.g(sk2Var5, (aj2) L26, o27Var);
                        a53.b(emulatorActivity.U(), sk2Var5, 0);
                        if (((Boolean) emulatorActivity.w1.getValue()).booleanValue()) {
                            sk2Var5.X(-294966547);
                            boolean h27 = sk2Var5.h(emulatorActivity);
                            Object L27 = sk2Var5.L();
                            if (h27 || L27 == obj3) {
                                L27 = new nq1(emulatorActivity, 24);
                                sk2Var5.h0(L27);
                            }
                            ki2 ki2Var2 = (ki2) L27;
                            boolean h28 = sk2Var5.h(emulatorActivity);
                            Object L28 = sk2Var5.L();
                            if (h28 || L28 == obj3) {
                                L28 = new xq1(emulatorActivity, 12);
                                sk2Var5.h0(L28);
                            }
                            n40.b(ct1Var, ki2Var2, (mi2) L28, sk2Var5, 0);
                            sk2Var5.p(false);
                        } else {
                            sk2Var5.X(-294238109);
                            sk2Var5.p(false);
                        }
                        if (((Boolean) emulatorActivity.x1.getValue()).booleanValue()) {
                            sk2Var5.X(-294156021);
                            a7 a7Var = emulatorActivity.U().P0;
                            boolean h29 = sk2Var5.h(emulatorActivity);
                            Object L29 = sk2Var5.L();
                            if (h29 || L29 == obj3) {
                                L29 = new nq1(emulatorActivity, 25);
                                sk2Var5.h0(L29);
                            }
                            ki2 ki2Var3 = (ki2) L29;
                            boolean h30 = sk2Var5.h(emulatorActivity);
                            Object L30 = sk2Var5.L();
                            if (h30 || L30 == obj3) {
                                L30 = new nq1(emulatorActivity, 27);
                                sk2Var5.h0(L30);
                            }
                            jk2.h(a7Var, ki2Var3, (ki2) L30, sk2Var5, 0);
                            sk2Var5.p(false);
                        } else {
                            sk2Var5.X(-293394909);
                            sk2Var5.p(false);
                        }
                    } else {
                        i.i("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                } else {
                    sk2Var5.R();
                }
                return o27Var;
        }
    }
}
