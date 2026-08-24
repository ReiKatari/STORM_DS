package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dq3 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ dq3(eo2 eo2Var, k41 k41Var, fo2 fo2Var, on2 on2Var) {
        this.A = 3;
        this.L = eo2Var;
        this.R = k41Var;
        this.X = fo2Var;
        this.B = on2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        a74 d;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        int i3 = this.A;
        a74 a74Var = x64.a;
        Object obj4 = null;
        int i4 = 4;
        Object obj5 = ox0.a;
        jg7 jg7Var = jg7.a;
        boolean z5 = true;
        Object obj6 = this.B;
        Object obj7 = this.X;
        Object obj8 = this.R;
        Object obj9 = this.L;
        boolean z6 = false;
        switch (i3) {
            case 0:
                pq3 pq3Var = (pq3) obj9;
                a74 a74Var2 = (a74) obj8;
                eq3 eq3Var = (eq3) obj7;
                qa4 qa4Var = (qa4) obj6;
                o46 o46Var = (o46) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var = (xq2) ((px0) obj2);
                Object P = xq2Var.P();
                if (P == obj5) {
                    P = new bq3(o46Var, new f4(qa4Var, 28));
                    xq2Var.l0(P);
                }
                bq3 bq3Var = (bq3) P;
                Object P2 = xq2Var.P();
                if (P2 == obj5) {
                    P2 = new pt6(new ap3(bq3Var));
                    xq2Var.l0(P2);
                }
                pt6 pt6Var = (pt6) P2;
                if (pq3Var != null) {
                    xq2Var.b0(1743490539);
                    xq2Var.b0(887527095);
                    Object obj10 = d25.a;
                    if (obj10 != null) {
                        xq2Var.b0(1345554384);
                    } else {
                        xq2Var.b0(1345603457);
                        View view = (View) xq2Var.j(kf.f);
                        boolean f = xq2Var.f(view);
                        Object P3 = xq2Var.P();
                        if (f || P3 == obj5) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            if (tag instanceof b25) {
                                obj4 = (b25) tag;
                            }
                            if (obj4 == null) {
                                obj4 = new dk(view);
                                view.setTag(R.id.compose_prefetch_scheduler, obj4);
                            }
                            P3 = obj4;
                            xq2Var.l0(P3);
                        }
                        obj10 = (b25) P3;
                    }
                    xq2Var.p(false);
                    xq2Var.p(false);
                    Object[] objArr = {pq3Var, bq3Var, pt6Var, obj10};
                    boolean f2 = xq2Var.f(pq3Var) | xq2Var.h(bq3Var) | xq2Var.h(pt6Var) | xq2Var.h(obj10);
                    Object P4 = xq2Var.P();
                    if (f2 || P4 == obj5) {
                        Object cnVar = new cn(pq3Var, bq3Var, pt6Var, obj10, 7);
                        xq2Var.l0(cnVar);
                        P4 = cnVar;
                    }
                    mb3.f(objArr, (qn2) P4, xq2Var);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(1744076749);
                    xq2Var.p(false);
                }
                int i5 = qq3.a;
                if (pq3Var != null && (d = a74Var2.d(new vb7(pq3Var))) != null) {
                    a74Var2 = d;
                }
                boolean f3 = xq2Var.f(bq3Var) | xq2Var.f(eq3Var);
                Object P5 = xq2Var.P();
                if (f3 || P5 == obj5) {
                    P5 = new ql1(21, bq3Var, eq3Var);
                    xq2Var.l0(P5);
                }
                mt6.b(pt6Var, a74Var2, (eo2) P5, xq2Var, 8);
                return jg7Var;
            case 1:
                qr7 qr7Var = (qr7) obj9;
                j04 j04Var = (j04) obj8;
                qa4 qa4Var2 = (qa4) obj6;
                ss4 ss4Var = (ss4) obj7;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    a74 N = ge7.N(dj6.c, lq4Var);
                    yt0 a = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, N);
                    jx0.i.getClass();
                    on2 on2Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(on2Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a);
                    yh2.K(xq2Var2, ix0.e, l);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E);
                    vy7.q(((pr7) qa4Var2.getValue()).b, ((pr7) qa4Var2.getValue()).c.getDisplayName(), xq2Var2, 0);
                    hm4 hm4Var = ((pr7) qa4Var2.getValue()).h;
                    if (hm4Var == null) {
                        xq2Var2.b0(-1895757594);
                        xq2Var2.p(false);
                    } else {
                        String str = hm4Var.a;
                        xq2Var2.b0(-1895757593);
                        zq7 h0 = vy7.h0(hm4Var, ((pr7) qa4Var2.getValue()).f);
                        if (h0 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((pr7) qa4Var2.getValue()).d == sr7.CUSTOM && ((pr7) qa4Var2.getValue()).e != null && h0 != null && nb3.k(((pr7) qa4Var2.getValue()).e, h0.a)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean k = nb3.k(((pr7) qa4Var2.getValue()).j, str);
                        Integer num = (Integer) ((pr7) qa4Var2.getValue()).i.get(str);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        boolean g = xq2Var2.g(z2) | xq2Var2.f(h0) | xq2Var2.h(qr7Var) | xq2Var2.h(hm4Var);
                        Object P6 = xq2Var2.P();
                        if (g || P6 == obj5) {
                            P6 = new o65(z2, h0, qr7Var, hm4Var);
                            xq2Var2.l0(P6);
                        }
                        vy7.B(hm4Var, k, i, z2, z3, (on2) P6, xq2Var2, 0);
                        xq2Var2.p(false);
                    }
                    int h = ss4Var.h();
                    l55 l55Var = vt0.a;
                    ly6.a(h, null, ((ut0) xq2Var2.j(l55Var)).j(), ((ut0) xq2Var2.j(l55Var)).g(), null, null, n16.I(2024292741, new sa5(14, ss4Var, qa4Var2), xq2Var2), xq2Var2, 1572864);
                    if (ss4Var.h() == 0) {
                        xq2Var2.b0(-1893763673);
                        List list = ((pr7) qa4Var2.getValue()).g;
                        String str2 = ((pr7) qa4Var2.getValue()).j;
                        Map map = ((pr7) qa4Var2.getValue()).i;
                        List list2 = ((pr7) qa4Var2.getValue()).f;
                        String str3 = ((pr7) qa4Var2.getValue()).e;
                        if (((pr7) qa4Var2.getValue()).d == sr7.CUSTOM) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean h2 = xq2Var2.h(qr7Var);
                        Object P7 = xq2Var2.P();
                        if (h2 || P7 == obj5) {
                            P7 = new dr7(qr7Var, 4);
                            xq2Var2.l0(P7);
                        }
                        qn2 qn2Var = (qn2) P7;
                        boolean h3 = xq2Var2.h(qr7Var);
                        Object P8 = xq2Var2.P();
                        if (h3 || P8 == obj5) {
                            P8 = new dr7(qr7Var, 1);
                            xq2Var2.l0(P8);
                        }
                        vy7.z(list, str2, map, list2, str3, z4, qn2Var, (qn2) P8, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-1893147734);
                        sr7 sr7Var = ((pr7) qa4Var2.getValue()).d;
                        String str4 = ((pr7) qa4Var2.getValue()).e;
                        List list3 = ((pr7) qa4Var2.getValue()).f;
                        boolean h4 = xq2Var2.h(qr7Var);
                        Object P9 = xq2Var2.P();
                        if (h4 || P9 == obj5) {
                            P9 = new er7(qr7Var, 0);
                            xq2Var2.l0(P9);
                        }
                        on2 on2Var2 = (on2) P9;
                        boolean h5 = xq2Var2.h(qr7Var);
                        Object P10 = xq2Var2.P();
                        if (h5 || P10 == obj5) {
                            P10 = new dr7(qr7Var, 2);
                            xq2Var2.l0(P10);
                        }
                        qn2 qn2Var2 = (qn2) P10;
                        boolean h6 = xq2Var2.h(qr7Var);
                        Object P11 = xq2Var2.P();
                        if (h6 || P11 == obj5) {
                            P11 = new dr7(qr7Var, 3);
                            xq2Var2.l0(P11);
                        }
                        qn2 qn2Var3 = (qn2) P11;
                        boolean h7 = xq2Var2.h(j04Var);
                        Object P12 = xq2Var2.P();
                        if (h7 || P12 == obj5) {
                            P12 = new x00(j04Var, 5);
                            xq2Var2.l0(P12);
                        }
                        vy7.t(sr7Var, str4, list3, on2Var2, qn2Var2, qn2Var3, (on2) P12, xq2Var2, 0);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                ta5 ta5Var = (ta5) obj9;
                ss3 ss3Var = (ss3) obj8;
                on2 on2Var3 = (on2) obj7;
                qn2 qn2Var4 = (qn2) obj6;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z6 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var2;
                if (xq2Var3.S(intValue2 & 1, z6)) {
                    nc1.o(ge7.Q(dj6.c(a74Var, 1.0f), 16.0f, RecyclerView.B1, 2), ta5Var, ss3Var, on2Var3, qn2Var4, xq2Var3, 6);
                    l.c(ge7.R(a74Var, 16.0f, 12.0f, 16.0f, 8.0f), ((ut0) xq2Var3.j(vt0.a)).f(), RecyclerView.B1, xq2Var3, 6, 12);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                eo2 eo2Var = (eo2) obj9;
                k41 k41Var = (k41) obj8;
                fo2 fo2Var = (fo2) obj7;
                on2 on2Var4 = (on2) obj6;
                i41 i41Var = (i41) obj;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (!((xq2) px0Var3).f(i41Var)) {
                        i4 = 2;
                    }
                    intValue3 |= i4;
                }
                if ((intValue3 & 19) == 18) {
                    z5 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var3;
                if (xq2Var4.S(intValue3 & 1, z5)) {
                    String str5 = (String) eo2Var.o(xq2Var4, 0);
                    if (qs6.v0(str5)) {
                        s53.c("Label must not be blank");
                    }
                    k41Var.getClass();
                    l.c.m(str5, Boolean.TRUE, i41Var, fo2Var, on2Var4, xq2Var4, Integer.valueOf((intValue3 << 9) & 7168));
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                zt5 zt5Var = (zt5) obj9;
                pq5 pq5Var = (pq5) obj8;
                j37 j37Var = (j37) obj7;
                qn2 qn2Var5 = (qn2) obj6;
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z6 = true;
                }
                int i6 = intValue4 & 1;
                xq2 xq2Var5 = (xq2) px0Var4;
                if (xq2Var5.S(i6, z6)) {
                    String O = yh2.O(xq2Var5, R.string.label_rom_config_custom_name);
                    String str6 = zt5Var.i;
                    if (str6 == null) {
                        str6 = pq5Var.a;
                    }
                    String str7 = str6;
                    boolean f4 = xq2Var5.f(j37Var) | xq2Var5.h(zt5Var) | xq2Var5.h(pq5Var) | xq2Var5.f(qn2Var5);
                    Object P13 = xq2Var5.P();
                    if (f4 || P13 == obj5) {
                        Object hf0Var = new hf0(j37Var, zt5Var, pq5Var, qn2Var5, 5);
                        xq2Var5.l0(hf0Var);
                        P13 = hf0Var;
                    }
                    lt5.a(O, str7, false, false, (on2) P13, xq2Var5, 0, 12);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 5:
                Context context = (Context) obj9;
                zt5 zt5Var2 = (zt5) obj8;
                mi6 mi6Var = (mi6) obj7;
                qn2 qn2Var6 = (qn2) obj6;
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z6 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var5;
                if (xq2Var6.S(intValue5 & 1, z6)) {
                    String O2 = yh2.O(xq2Var6, R.string.label_rom_config_retroachievements_for_rom);
                    String P14 = qo2.P(context, zt5Var2.y, zt5Var2.z);
                    boolean f5 = xq2Var6.f(mi6Var) | xq2Var6.h(context) | xq2Var6.h(zt5Var2) | xq2Var6.f(qn2Var6);
                    Object P15 = xq2Var6.P();
                    if (f5 || P15 == obj5) {
                        P15 = new hf0(mi6Var, context, zt5Var2, qn2Var6);
                        xq2Var6.l0(P15);
                    }
                    lt5.a(O2, P14, false, false, (on2) P15, xq2Var6, 0, 12);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 6:
                zt5 zt5Var3 = (zt5) obj9;
                String str8 = (String) obj8;
                Context context2 = (Context) obj7;
                j04 j04Var2 = (j04) obj6;
                px0 px0Var6 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z6 = true;
                }
                xq2 xq2Var7 = (xq2) px0Var6;
                if (xq2Var7.S(intValue6 & 1, z6)) {
                    String O3 = yh2.O(xq2Var7, R.string.controller_layout);
                    String str9 = zt5Var3.f;
                    if (str9 == null) {
                        str9 = qo2.c(context2, str8);
                    }
                    String str10 = str9;
                    boolean h8 = xq2Var7.h(context2) | xq2Var7.h(zt5Var3) | xq2Var7.h(j04Var2);
                    Object P16 = xq2Var7.P();
                    if (h8 || P16 == obj5) {
                        P16 = new u6(context2, j04Var2, zt5Var3, 18);
                        xq2Var7.l0(P16);
                    }
                    lt5.a(O3, str10, false, false, (on2) P16, xq2Var7, 0, 12);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            default:
                cn6 cn6Var = (cn6) obj9;
                jt3 jt3Var = (jt3) obj8;
                c37 c37Var = (c37) obj7;
                mk4 mk4Var = (mk4) obj6;
                a74 a74Var3 = (a74) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var8 = (xq2) ((px0) obj2);
                xq2Var8.b0(-84507373);
                boolean booleanValue = ((Boolean) xq2Var8.j(ky0.x)).booleanValue();
                boolean g2 = xq2Var8.g(booleanValue);
                Object P17 = xq2Var8.P();
                if (g2 || P17 == obj5) {
                    P17 = new c81(booleanValue);
                    xq2Var8.l0(P17);
                }
                c81 c81Var = (c81) P17;
                if (cn6Var.a == 16) {
                    z5 = false;
                }
                if (((Boolean) ((zr3) ((ot7) xq2Var8.j(ky0.u))).c.getValue()).booleanValue() && jt3Var.b() && k47.c(c37Var.b) && z5) {
                    xq2Var8.b0(-707487962);
                    fp fpVar = c37Var.a;
                    k47 k47Var = new k47(c37Var.b);
                    boolean h9 = xq2Var8.h(c81Var);
                    Object P18 = xq2Var8.P();
                    if (h9 || P18 == obj5) {
                        P18 = new ns3(c81Var, null, 13);
                        xq2Var8.l0(P18);
                    }
                    mb3.j(fpVar, k47Var, (eo2) P18, xq2Var8);
                    boolean h10 = xq2Var8.h(c81Var) | xq2Var8.h(mk4Var) | xq2Var8.f(c37Var) | xq2Var8.h(jt3Var) | xq2Var8.f(cn6Var);
                    Object P19 = xq2Var8.P();
                    if (h10 || P19 == obj5) {
                        Object d5Var = new d5(c81Var, mk4Var, c37Var, jt3Var, cn6Var, 8);
                        xq2Var8.l0(d5Var);
                        P19 = d5Var;
                    }
                    a74Var = q60.y(a74Var3, (qn2) P19);
                    xq2Var8.p(false);
                } else {
                    xq2Var8.b0(-705473241);
                    xq2Var8.p(false);
                }
                xq2Var8.p(false);
                return a74Var;
        }
    }

    public /* synthetic */ dq3(qr7 qr7Var, j04 j04Var, qa4 qa4Var, ss4 ss4Var) {
        this.A = 1;
        this.L = qr7Var;
        this.R = j04Var;
        this.B = qa4Var;
        this.X = ss4Var;
    }

    public /* synthetic */ dq3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.B = obj4;
    }
}
