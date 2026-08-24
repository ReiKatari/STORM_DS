package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cv1 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ cv1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        xq2 xq2Var;
        vs4 vs4Var;
        dy1 dy1Var;
        pq5 pq5Var;
        dy1 dy1Var2;
        pq5 pq5Var2;
        String str;
        boolean z2;
        jq1 jq1Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.A;
        Object obj3 = ox0.a;
        jg7 jg7Var = jg7.a;
        final EmulatorActivity emulatorActivity = this.B;
        boolean z7 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = EmulatorActivity.Z1;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    ah2 ah2Var = (ah2) xq2Var2.j(ky0.i);
                    boolean h = xq2Var2.h(emulatorActivity) | xq2Var2.h(ah2Var);
                    Object P = xq2Var2.P();
                    if (h || P == obj3) {
                        P = new q6(27, emulatorActivity, ah2Var);
                        xq2Var2.l0(P);
                    }
                    mb3.n((on2) P, xq2Var2);
                    vs4 vs4Var2 = emulatorActivity.N1;
                    vs4 vs4Var3 = emulatorActivity.H1;
                    vs4 vs4Var4 = emulatorActivity.M1;
                    final pv1 pv1Var = (pv1) vs4Var2.getValue();
                    ov1 ov1Var = (ov1) gt0.R0(emulatorActivity.P1);
                    mu4 mu4Var = (mu4) emulatorActivity.F1.getValue();
                    RewindWindow rewindWindow = (RewindWindow) emulatorActivity.L1.getValue();
                    lc2 lc2Var = dj6.c;
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, lc2Var);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, d);
                    yh2.K(xq2Var2, ix0.e, l);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E);
                    if (rewindWindow != null) {
                        xq2Var2.b0(2047355930);
                        boolean h2 = xq2Var2.h(emulatorActivity);
                        Object P2 = xq2Var2.P();
                        if (h2 || P2 == obj3) {
                            P2 = new pu1(emulatorActivity, 4);
                            xq2Var2.l0(P2);
                        }
                        qn2 qn2Var = (qn2) P2;
                        boolean h3 = xq2Var2.h(emulatorActivity);
                        Object P3 = xq2Var2.P();
                        if (h3 || P3 == obj3) {
                            P3 = new on2() { // from class: lv1
                                @Override // defpackage.on2
                                public final Object c() {
                                    int i3 = r2;
                                    jg7 jg7Var2 = jg7.a;
                                    EmulatorActivity emulatorActivity2 = emulatorActivity;
                                    switch (i3) {
                                        case 0:
                                            emulatorActivity2.G1.setValue(Boolean.FALSE);
                                            return jg7Var2;
                                        case 1:
                                            int i4 = EmulatorActivity.Z1;
                                            emulatorActivity2.N();
                                            return jg7Var2;
                                        case 2:
                                            emulatorActivity2.V1.T(ex1.ACHIEVEMENTS_DIALOG);
                                            emulatorActivity2.C1.setValue(Boolean.FALSE);
                                            c92 c92Var = emulatorActivity2.K0;
                                            if (c92Var != null) {
                                                c92Var.a(null);
                                            }
                                            emulatorActivity2.i0();
                                            return jg7Var2;
                                        case 3:
                                            emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                            emulatorActivity2.D1.setValue(Boolean.FALSE);
                                            emulatorActivity2.W().q0(true);
                                            return jg7Var2;
                                        default:
                                            emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                            emulatorActivity2.W().T0();
                                            emulatorActivity2.D1.setValue(Boolean.FALSE);
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P3);
                        }
                        ge7.k(rewindWindow, qn2Var, (on2) P3, xq2Var2, RewindWindow.$stable);
                        xq2Var2.p(false);
                        xq2Var = xq2Var2;
                        vs4Var = vs4Var4;
                    } else if (((Boolean) emulatorActivity.E1.getValue()).booleanValue()) {
                        xq2Var2.b0(2047831966);
                        qa4 C = np2.C(emulatorActivity.W().Y0, xq2Var2);
                        qa4 C2 = np2.C(emulatorActivity.W().W0, xq2Var2);
                        qa4 C3 = np2.C(emulatorActivity.W().a1, xq2Var2);
                        qa4 C4 = np2.C(emulatorActivity.W().c1, xq2Var2);
                        qa4 C5 = np2.C(emulatorActivity.W().e1, xq2Var2);
                        qa4 C6 = np2.C(emulatorActivity.W().g1, xq2Var2);
                        qa4 C7 = np2.C(emulatorActivity.W().i1, xq2Var2);
                        qa4 C8 = np2.C(emulatorActivity.W().k1, xq2Var2);
                        qa4 C9 = np2.C(emulatorActivity.W().m1, xq2Var2);
                        jq1 jq1Var2 = (jq1) C.getValue();
                        boolean h4 = xq2Var2.h(emulatorActivity);
                        Object P4 = xq2Var2.P();
                        if (!h4 && P4 != obj3) {
                            jq1Var = jq1Var2;
                        } else {
                            jq1Var = jq1Var2;
                            P4 = new pu1(emulatorActivity, 6);
                            xq2Var2.l0(P4);
                        }
                        qn2 qn2Var2 = (qn2) P4;
                        boolean booleanValue = ((Boolean) C2.getValue()).booleanValue();
                        boolean h5 = xq2Var2.h(emulatorActivity);
                        Object P5 = xq2Var2.P();
                        if (h5 || P5 == obj3) {
                            P5 = new pu1(emulatorActivity, 7);
                            xq2Var2.l0(P5);
                        }
                        qn2 qn2Var3 = (qn2) P5;
                        boolean booleanValue2 = ((Boolean) C3.getValue()).booleanValue();
                        boolean h6 = xq2Var2.h(emulatorActivity);
                        Object P6 = xq2Var2.P();
                        if (h6 || P6 == obj3) {
                            P6 = new pu1(emulatorActivity, 8);
                            xq2Var2.l0(P6);
                        }
                        qn2 qn2Var4 = (qn2) P6;
                        boolean booleanValue3 = ((Boolean) C4.getValue()).booleanValue();
                        boolean h7 = xq2Var2.h(emulatorActivity);
                        Object P7 = xq2Var2.P();
                        if (h7 || P7 == obj3) {
                            P7 = new pu1(emulatorActivity, 9);
                            xq2Var2.l0(P7);
                        }
                        qn2 qn2Var5 = (qn2) P7;
                        boolean booleanValue4 = ((Boolean) C5.getValue()).booleanValue();
                        boolean h8 = xq2Var2.h(emulatorActivity);
                        Object P8 = xq2Var2.P();
                        if (h8 || P8 == obj3) {
                            P8 = new pu1(emulatorActivity, 10);
                            xq2Var2.l0(P8);
                        }
                        qn2 qn2Var6 = (qn2) P8;
                        boolean booleanValue5 = ((Boolean) C6.getValue()).booleanValue();
                        boolean h9 = xq2Var2.h(emulatorActivity);
                        Object P9 = xq2Var2.P();
                        if (h9 || P9 == obj3) {
                            P9 = new pu1(emulatorActivity, 11);
                            xq2Var2.l0(P9);
                        }
                        qn2 qn2Var7 = (qn2) P9;
                        boolean booleanValue6 = ((Boolean) C7.getValue()).booleanValue();
                        boolean h10 = xq2Var2.h(emulatorActivity);
                        Object P10 = xq2Var2.P();
                        if (h10 || P10 == obj3) {
                            P10 = new pu1(emulatorActivity, 12);
                            xq2Var2.l0(P10);
                        }
                        qn2 qn2Var8 = (qn2) P10;
                        p66 p66Var = (p66) C8.getValue();
                        boolean h11 = xq2Var2.h(emulatorActivity);
                        Object P11 = xq2Var2.P();
                        if (h11 || P11 == obj3) {
                            P11 = new pu1(emulatorActivity, 2);
                            xq2Var2.l0(P11);
                        }
                        qn2 qn2Var9 = (qn2) P11;
                        p66 p66Var2 = (p66) C9.getValue();
                        boolean h12 = xq2Var2.h(emulatorActivity);
                        Object P12 = xq2Var2.P();
                        if (h12 || P12 == obj3) {
                            P12 = new pu1(emulatorActivity, 3);
                            xq2Var2.l0(P12);
                        }
                        qn2 qn2Var10 = (qn2) P12;
                        boolean h13 = xq2Var2.h(emulatorActivity);
                        Object P13 = xq2Var2.P();
                        if (h13 || P13 == obj3) {
                            P13 = new bv1(emulatorActivity, 24);
                            xq2Var2.l0(P13);
                        }
                        vs4Var = vs4Var4;
                        x01.a(jq1Var, qn2Var2, booleanValue, qn2Var3, booleanValue2, qn2Var4, booleanValue3, qn2Var5, booleanValue4, qn2Var6, booleanValue5, qn2Var7, booleanValue6, qn2Var8, p66Var, qn2Var9, p66Var2, qn2Var10, (on2) P13, xq2Var2, 0);
                        xq2Var = xq2Var2;
                        xq2Var.p(false);
                    } else {
                        xq2Var = xq2Var2;
                        vs4Var = vs4Var4;
                        if (ov1Var != null) {
                            xq2Var.b0(2051384597);
                            if (ov1Var instanceof nv1) {
                                xq2Var.b0(481819132);
                                nv1 nv1Var = (nv1) ov1Var;
                                String str2 = nv1Var.a;
                                kw3 kw3Var = nv1Var.b;
                                ArrayList arrayList = new ArrayList(ht0.v0(kw3Var, 10));
                                ListIterator listIterator = kw3Var.listIterator(0);
                                while (true) {
                                    xx2 xx2Var = (xx2) listIterator;
                                    if (xx2Var.hasNext()) {
                                        arrayList.add((String) ((vr4) xx2Var.next()).A);
                                    } else {
                                        boolean h14 = xq2Var.h(ov1Var);
                                        Object P14 = xq2Var.P();
                                        if (h14 || P14 == obj3) {
                                            P14 = new k0(ov1Var, 25);
                                            xq2Var.l0(P14);
                                        }
                                        qn2 qn2Var11 = (qn2) P14;
                                        boolean h15 = xq2Var.h(emulatorActivity);
                                        Object P15 = xq2Var.P();
                                        if (h15 || P15 == obj3) {
                                            P15 = new bv1(emulatorActivity, 25);
                                            xq2Var.l0(P15);
                                        }
                                        e11.a(str2, arrayList, qn2Var11, (on2) P15, xq2Var, 0);
                                        z2 = false;
                                        xq2Var.p(false);
                                    }
                                }
                            } else if (ov1Var instanceof mv1) {
                                xq2Var.b0(481833368);
                                mv1 mv1Var = (mv1) ov1Var;
                                String str3 = mv1Var.a;
                                List list = mv1Var.b;
                                int i3 = mv1Var.c;
                                boolean h16 = xq2Var.h(ov1Var) | xq2Var.h(emulatorActivity);
                                Object P16 = xq2Var.P();
                                if (h16 || P16 == obj3) {
                                    P16 = new y(28, ov1Var, emulatorActivity);
                                    xq2Var.l0(P16);
                                }
                                qn2 qn2Var12 = (qn2) P16;
                                boolean h17 = xq2Var.h(emulatorActivity);
                                Object P17 = xq2Var.P();
                                if (h17 || P17 == obj3) {
                                    P17 = new bv1(emulatorActivity, 26);
                                    xq2Var.l0(P17);
                                }
                                n01.a(str3, list, i3, qn2Var12, (on2) P17, xq2Var, 0);
                                z2 = false;
                                xq2Var.p(false);
                            } else {
                                throw xg6.f(xq2Var, 481815693, false);
                            }
                            xq2Var.p(z2);
                        } else if (pv1Var != null) {
                            xq2Var.b0(2052567836);
                            hy1 hy1Var = (hy1) np2.C(emulatorActivity.W().q0, xq2Var).getValue();
                            if (hy1Var instanceof dy1) {
                                dy1Var2 = (dy1) hy1Var;
                            } else {
                                dy1Var2 = null;
                            }
                            if (dy1Var2 != null) {
                                pq5Var2 = dy1Var2.a;
                            } else {
                                pq5Var2 = null;
                            }
                            List list2 = pv1Var.a;
                            boolean z8 = pv1Var.b;
                            if (pq5Var2 != null) {
                                String str4 = pq5Var2.f.e;
                                if (str4 == null) {
                                    str4 = pq5Var2.a;
                                }
                                str = str4;
                            } else {
                                str = null;
                            }
                            boolean h18 = xq2Var.h(emulatorActivity) | xq2Var.h(pv1Var);
                            Object P18 = xq2Var.P();
                            if (h18 || P18 == obj3) {
                                P18 = new hu1(emulatorActivity, pv1Var, 3);
                                xq2Var.l0(P18);
                            }
                            qn2 qn2Var13 = (qn2) P18;
                            boolean h19 = xq2Var.h(emulatorActivity) | xq2Var.h(pv1Var);
                            Object P19 = xq2Var.P();
                            if (h19 || P19 == obj3) {
                                P19 = new hu1(emulatorActivity, pv1Var, 4);
                                xq2Var.l0(P19);
                            }
                            qn2 qn2Var14 = (qn2) P19;
                            boolean h20 = xq2Var.h(emulatorActivity) | xq2Var.h(pv1Var);
                            Object P20 = xq2Var.P();
                            if (h20 || P20 == obj3) {
                                P20 = new eo2() { // from class: kv1
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj4, Object obj5) {
                                        dy1 dy1Var3;
                                        dy1 dy1Var4;
                                        int i4 = r3;
                                        jg7 jg7Var2 = jg7.a;
                                        pv1 pv1Var2 = pv1Var;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i4) {
                                            case 0:
                                                c46 c46Var = (c46) obj4;
                                                String str5 = (String) obj5;
                                                int i5 = EmulatorActivity.Z1;
                                                c46Var.getClass();
                                                sz1 W = emulatorActivity2.W();
                                                hu1 hu1Var = new hu1(emulatorActivity2, pv1Var2, 1);
                                                W.getClass();
                                                Object value = W.p0.getValue();
                                                if (value instanceof dy1) {
                                                    dy1Var3 = (dy1) value;
                                                } else {
                                                    dy1Var3 = null;
                                                }
                                                if (dy1Var3 != null) {
                                                    hv.L(W.z, null, null, new ji(hu1Var, W, dy1Var3, c46Var, str5, null, 7), 3);
                                                }
                                                return jg7Var2;
                                            default:
                                                c46 c46Var2 = (c46) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                int i6 = EmulatorActivity.Z1;
                                                c46Var2.getClass();
                                                sz1 W2 = emulatorActivity2.W();
                                                hu1 hu1Var2 = new hu1(emulatorActivity2, pv1Var2, 2);
                                                W2.getClass();
                                                Object value2 = W2.p0.getValue();
                                                if (value2 instanceof dy1) {
                                                    dy1Var4 = (dy1) value2;
                                                } else {
                                                    dy1Var4 = null;
                                                }
                                                if (dy1Var4 != null) {
                                                    hv.L(W2.z, null, null, new zv1(hu1Var2, W2, dy1Var4, c46Var2, intValue2, (r41) null), 3);
                                                }
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var.l0(P20);
                            }
                            eo2 eo2Var = (eo2) P20;
                            boolean h21 = xq2Var.h(emulatorActivity) | xq2Var.h(pv1Var);
                            Object P21 = xq2Var.P();
                            if (h21 || P21 == obj3) {
                                P21 = new eo2() { // from class: kv1
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj4, Object obj5) {
                                        dy1 dy1Var3;
                                        dy1 dy1Var4;
                                        int i4 = r3;
                                        jg7 jg7Var2 = jg7.a;
                                        pv1 pv1Var2 = pv1Var;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i4) {
                                            case 0:
                                                c46 c46Var = (c46) obj4;
                                                String str5 = (String) obj5;
                                                int i5 = EmulatorActivity.Z1;
                                                c46Var.getClass();
                                                sz1 W = emulatorActivity2.W();
                                                hu1 hu1Var = new hu1(emulatorActivity2, pv1Var2, 1);
                                                W.getClass();
                                                Object value = W.p0.getValue();
                                                if (value instanceof dy1) {
                                                    dy1Var3 = (dy1) value;
                                                } else {
                                                    dy1Var3 = null;
                                                }
                                                if (dy1Var3 != null) {
                                                    hv.L(W.z, null, null, new ji(hu1Var, W, dy1Var3, c46Var, str5, null, 7), 3);
                                                }
                                                return jg7Var2;
                                            default:
                                                c46 c46Var2 = (c46) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                int i6 = EmulatorActivity.Z1;
                                                c46Var2.getClass();
                                                sz1 W2 = emulatorActivity2.W();
                                                hu1 hu1Var2 = new hu1(emulatorActivity2, pv1Var2, 2);
                                                W2.getClass();
                                                Object value2 = W2.p0.getValue();
                                                if (value2 instanceof dy1) {
                                                    dy1Var4 = (dy1) value2;
                                                } else {
                                                    dy1Var4 = null;
                                                }
                                                if (dy1Var4 != null) {
                                                    hv.L(W2.z, null, null, new zv1(hu1Var2, W2, dy1Var4, c46Var2, intValue2, (r41) null), 3);
                                                }
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var.l0(P21);
                            }
                            eo2 eo2Var2 = (eo2) P21;
                            boolean h22 = xq2Var.h(emulatorActivity);
                            Object P22 = xq2Var.P();
                            if (h22 || P22 == obj3) {
                                P22 = new bv1(emulatorActivity, 27);
                                xq2Var.l0(P22);
                            }
                            nc1.y(list2, z8, str, qn2Var13, qn2Var14, eo2Var, eo2Var2, (on2) P22, xq2Var, 0);
                            xq2Var.p(false);
                        } else if (mu4Var != null) {
                            xq2Var.b0(2054480908);
                            hy1 hy1Var2 = (hy1) np2.C(emulatorActivity.W().q0, xq2Var).getValue();
                            if (hy1Var2 instanceof dy1) {
                                dy1Var = (dy1) hy1Var2;
                            } else {
                                dy1Var = null;
                            }
                            if (dy1Var != null) {
                                pq5Var = dy1Var.a;
                            } else {
                                pq5Var = null;
                            }
                            boolean h23 = xq2Var.h(emulatorActivity);
                            Object P23 = xq2Var.P();
                            if (h23 || P23 == obj3) {
                                P23 = new pu1(emulatorActivity, 5);
                                xq2Var.l0(P23);
                            }
                            qn2 qn2Var15 = (qn2) P23;
                            boolean h24 = xq2Var.h(emulatorActivity);
                            Object P24 = xq2Var.P();
                            if (h24 || P24 == obj3) {
                                P24 = new bv1(emulatorActivity, 28);
                                xq2Var.l0(P24);
                            }
                            ru4.c(mu4Var, pq5Var, qn2Var15, (on2) P24, xq2Var, 456);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(481969702);
                            xq2Var.p(false);
                        }
                    }
                    if (((Boolean) emulatorActivity.G1.getValue()).booleanValue()) {
                        xq2Var.b0(2056257983);
                        pq5 pq5Var3 = (pq5) emulatorActivity.J1.getValue();
                        if (pq5Var3 != null) {
                            xq2Var.b0(2056322525);
                            String str5 = (String) emulatorActivity.K1.getValue();
                            String str6 = (String) vs4Var.getValue();
                            boolean booleanValue7 = ((Boolean) vs4Var3.getValue()).booleanValue();
                            boolean h25 = xq2Var.h(emulatorActivity);
                            Object P25 = xq2Var.P();
                            if (h25 || P25 == obj3) {
                                P25 = new bv1(emulatorActivity, 29);
                                xq2Var.l0(P25);
                            }
                            hf.a(pq5Var3, str5, str6, booleanValue7, (on2) P25, xq2Var, 8);
                            xq2Var.p(false);
                            z3 = false;
                        } else {
                            xq2Var.b0(2056745613);
                            hq1 hq1Var = hq1.BOTH;
                            boolean booleanValue8 = ((Boolean) vs4Var3.getValue()).booleanValue();
                            String str7 = (String) emulatorActivity.I1.getValue();
                            String str8 = (String) vs4Var.getValue();
                            boolean h26 = xq2Var.h(emulatorActivity);
                            Object P26 = xq2Var.P();
                            if (!h26 && P26 != obj3) {
                                z3 = false;
                            } else {
                                z3 = false;
                                P26 = new on2() { // from class: lv1
                                    @Override // defpackage.on2
                                    public final Object c() {
                                        int i32 = r2;
                                        jg7 jg7Var2 = jg7.a;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i32) {
                                            case 0:
                                                emulatorActivity2.G1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                            case 1:
                                                int i4 = EmulatorActivity.Z1;
                                                emulatorActivity2.N();
                                                return jg7Var2;
                                            case 2:
                                                emulatorActivity2.V1.T(ex1.ACHIEVEMENTS_DIALOG);
                                                emulatorActivity2.C1.setValue(Boolean.FALSE);
                                                c92 c92Var = emulatorActivity2.K0;
                                                if (c92Var != null) {
                                                    c92Var.a(null);
                                                }
                                                emulatorActivity2.i0();
                                                return jg7Var2;
                                            case 3:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                emulatorActivity2.W().q0(true);
                                                return jg7Var2;
                                            default:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.W().T0();
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var.l0(P26);
                            }
                            nc1.g(hq1Var, booleanValue8, str7, null, str8, (on2) P26, xq2Var, 6);
                            xq2Var.p(z3);
                        }
                        xq2Var.p(z3);
                    } else {
                        xq2Var.b0(2057212256);
                        xq2Var.p(false);
                    }
                    xq2Var.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = EmulatorActivity.Z1;
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var2;
                if (xq2Var3.S(intValue2 & 1, z4)) {
                    bl2.e(false, n16.I(338501151, new cv1(emulatorActivity, 4), xq2Var3), xq2Var3, 48, 1);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = EmulatorActivity.Z1;
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var3;
                if (xq2Var4.S(intValue3 & 1, z5)) {
                    bl2.e(false, n16.I(-692145080, new cv1(emulatorActivity, 0), xq2Var4), xq2Var4, 48, 1);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i6 = EmulatorActivity.Z1;
                if ((intValue4 & 3) != 2) {
                    z7 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var4;
                if (xq2Var5.S(intValue4 & 1, z7)) {
                    hq1 hq1Var2 = hq1.BOTH;
                    boolean booleanValue9 = ((Boolean) emulatorActivity.H1.getValue()).booleanValue();
                    String str9 = (String) emulatorActivity.I1.getValue();
                    String str10 = (String) emulatorActivity.M1.getValue();
                    boolean h27 = xq2Var5.h(emulatorActivity);
                    Object P27 = xq2Var5.P();
                    if (h27 || P27 == obj3) {
                        P27 = new bv1(emulatorActivity, 9);
                        xq2Var5.l0(P27);
                    }
                    nc1.g(hq1Var2, booleanValue9, str9, null, str10, (on2) P27, xq2Var5, 6);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            default:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i7 = EmulatorActivity.Z1;
                if ((intValue5 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var5;
                if (xq2Var6.S(intValue5 & 1, z6)) {
                    ar0 a = gh5.a(nx1.class);
                    eb ebVar = new eb(emulatorActivity.getViewModelStore(), emulatorActivity.getDefaultViewModelProviderFactory(), emulatorActivity.getDefaultViewModelCreationExtras());
                    String b = a.b();
                    if (b != null) {
                        nx1 nx1Var = (nx1) ebVar.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                        boolean h28 = xq2Var6.h(emulatorActivity) | xq2Var6.h(nx1Var);
                        Object P28 = xq2Var6.P();
                        if (h28 || P28 == obj3) {
                            P28 = new xd1(emulatorActivity, nx1Var, null, 3);
                            xq2Var6.l0(P28);
                        }
                        mb3.i(xq2Var6, (eo2) P28, jg7Var);
                        n16.b(emulatorActivity.W(), xq2Var6, 8);
                        if (((Boolean) emulatorActivity.C1.getValue()).booleanValue()) {
                            xq2Var6.b0(-294966547);
                            boolean h29 = xq2Var6.h(emulatorActivity);
                            Object P29 = xq2Var6.P();
                            if (h29 || P29 == obj3) {
                                P29 = new on2() { // from class: lv1
                                    @Override // defpackage.on2
                                    public final Object c() {
                                        int i32 = r2;
                                        jg7 jg7Var2 = jg7.a;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i32) {
                                            case 0:
                                                emulatorActivity2.G1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                            case 1:
                                                int i42 = EmulatorActivity.Z1;
                                                emulatorActivity2.N();
                                                return jg7Var2;
                                            case 2:
                                                emulatorActivity2.V1.T(ex1.ACHIEVEMENTS_DIALOG);
                                                emulatorActivity2.C1.setValue(Boolean.FALSE);
                                                c92 c92Var = emulatorActivity2.K0;
                                                if (c92Var != null) {
                                                    c92Var.a(null);
                                                }
                                                emulatorActivity2.i0();
                                                return jg7Var2;
                                            case 3:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                emulatorActivity2.W().q0(true);
                                                return jg7Var2;
                                            default:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.W().T0();
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var6.l0(P29);
                            }
                            on2 on2Var = (on2) P29;
                            boolean h30 = xq2Var6.h(emulatorActivity);
                            Object P30 = xq2Var6.P();
                            if (h30 || P30 == obj3) {
                                P30 = new pu1(emulatorActivity, 13);
                                xq2Var6.l0(P30);
                            }
                            g04.a(nx1Var, on2Var, (qn2) P30, xq2Var6, 8);
                            xq2Var6.p(false);
                        } else {
                            xq2Var6.b0(-294238109);
                            xq2Var6.p(false);
                        }
                        if (((Boolean) emulatorActivity.D1.getValue()).booleanValue()) {
                            xq2Var6.b0(-294156021);
                            b7 b7Var = emulatorActivity.W().P0;
                            boolean h31 = xq2Var6.h(emulatorActivity);
                            Object P31 = xq2Var6.P();
                            if (h31 || P31 == obj3) {
                                P31 = new on2() { // from class: lv1
                                    @Override // defpackage.on2
                                    public final Object c() {
                                        int i32 = r2;
                                        jg7 jg7Var2 = jg7.a;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i32) {
                                            case 0:
                                                emulatorActivity2.G1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                            case 1:
                                                int i42 = EmulatorActivity.Z1;
                                                emulatorActivity2.N();
                                                return jg7Var2;
                                            case 2:
                                                emulatorActivity2.V1.T(ex1.ACHIEVEMENTS_DIALOG);
                                                emulatorActivity2.C1.setValue(Boolean.FALSE);
                                                c92 c92Var = emulatorActivity2.K0;
                                                if (c92Var != null) {
                                                    c92Var.a(null);
                                                }
                                                emulatorActivity2.i0();
                                                return jg7Var2;
                                            case 3:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                emulatorActivity2.W().q0(true);
                                                return jg7Var2;
                                            default:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.W().T0();
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var6.l0(P31);
                            }
                            on2 on2Var2 = (on2) P31;
                            boolean h32 = xq2Var6.h(emulatorActivity);
                            Object P32 = xq2Var6.P();
                            if (h32 || P32 == obj3) {
                                P32 = new on2() { // from class: lv1
                                    @Override // defpackage.on2
                                    public final Object c() {
                                        int i32 = r2;
                                        jg7 jg7Var2 = jg7.a;
                                        EmulatorActivity emulatorActivity2 = emulatorActivity;
                                        switch (i32) {
                                            case 0:
                                                emulatorActivity2.G1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                            case 1:
                                                int i42 = EmulatorActivity.Z1;
                                                emulatorActivity2.N();
                                                return jg7Var2;
                                            case 2:
                                                emulatorActivity2.V1.T(ex1.ACHIEVEMENTS_DIALOG);
                                                emulatorActivity2.C1.setValue(Boolean.FALSE);
                                                c92 c92Var = emulatorActivity2.K0;
                                                if (c92Var != null) {
                                                    c92Var.a(null);
                                                }
                                                emulatorActivity2.i0();
                                                return jg7Var2;
                                            case 3:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                emulatorActivity2.W().q0(true);
                                                return jg7Var2;
                                            default:
                                                emulatorActivity2.V1.T(ex1.PENDING_SUBMISSION_CONFIRM_EXIT);
                                                emulatorActivity2.W().T0();
                                                emulatorActivity2.D1.setValue(Boolean.FALSE);
                                                return jg7Var2;
                                        }
                                    }
                                };
                                xq2Var6.l0(P32);
                            }
                            qo2.h(b7Var, on2Var2, (on2) P32, xq2Var6, 0);
                            xq2Var6.p(false);
                        } else {
                            xq2Var6.b0(-293394909);
                            xq2Var6.p(false);
                        }
                    } else {
                        i.h("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
        }
    }
}
