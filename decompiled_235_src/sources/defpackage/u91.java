package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u91 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ u91(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6  */
    @Override // defpackage.fo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        int i;
        boolean z2;
        boolean z3;
        String c;
        xq2 xq2Var;
        int i2;
        int i3;
        boolean f;
        Object P;
        boolean z4;
        int i4;
        int i5;
        boolean h;
        Object P2;
        Object P3;
        gn gnVar;
        boolean h2;
        Object P4;
        gn gnVar2;
        boolean z5;
        Object P5;
        boolean h3;
        Object P6;
        boolean g;
        Object P7;
        int B;
        float f2;
        float f3;
        int i6;
        int i7 = this.A;
        boolean z6 = true;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.R;
        Object obj7 = this.L;
        Object obj8 = this.B;
        switch (i7) {
            case 0:
                int i8 = 2;
                fa1 fa1Var = (fa1) obj8;
                la1 la1Var = (la1) obj7;
                j37 j37Var = (j37) obj6;
                za1 za1Var = (za1) obj5;
                cb1 cb1Var = (cb1) obj4;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i8 = 4;
                    }
                    intValue |= i8;
                }
                if ((intValue & 19) == 18) {
                    z6 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z6)) {
                    boolean z7 = fa1Var instanceof ba1;
                    x64 x64Var = x64.a;
                    if (z7) {
                        xq2Var2.b0(1349130694);
                        a74 d = q60.s(ge7.N(x64Var, lq4Var), lq4Var).d(dj6.c);
                        cz0 cz0Var = ((ba1) fa1Var).a;
                        boolean h4 = xq2Var2.h(la1Var);
                        Object P8 = xq2Var2.P();
                        if (h4 || P8 == vs0Var) {
                            i4 i4Var = new i4(0, la1Var, la1.class, "revalidateBiosConfiguration", "revalidateBiosConfiguration()V", 0, 0, 2);
                            xq2Var2.l0(i4Var);
                            P8 = i4Var;
                        }
                        ak7.w(d, cz0Var, (on2) ((po2) P8), xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (fa1Var instanceof da1) {
                        xq2Var2.b0(-926299508);
                        ak7.z(q60.s(ge7.N(x64Var, lq4Var), lq4Var).d(dj6.c), xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (fa1Var instanceof ea1) {
                        xq2Var2.b0(1349632925);
                        lc2 lc2Var = dj6.c;
                        List list = ((ea1) fa1Var).a;
                        boolean f4 = xq2Var2.f(j37Var) | xq2Var2.h(la1Var);
                        Object P9 = xq2Var2.P();
                        if (f4 || P9 == vs0Var) {
                            P9 = new y(21, j37Var, la1Var);
                            xq2Var2.l0(P9);
                        }
                        qn2 qn2Var = (qn2) P9;
                        boolean h5 = xq2Var2.h(la1Var);
                        Object P10 = xq2Var2.P();
                        if (h5 || P10 == vs0Var) {
                            a0 a0Var = new a0(1, la1Var, la1.class, "deleteTitle", "deleteTitle(Lme/magnum/melonds/domain/model/DSiWareTitle;)V", 0, 0, 4);
                            xq2Var2.l0(a0Var);
                            P10 = a0Var;
                        }
                        qn2 qn2Var2 = (qn2) ((po2) P10);
                        boolean h6 = xq2Var2.h(za1Var);
                        Object P11 = xq2Var2.P();
                        if (h6 || P11 == vs0Var) {
                            h4 h4Var = new h4(2, za1Var, za1.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 2);
                            xq2Var2.l0(h4Var);
                            P11 = h4Var;
                        }
                        eo2 eo2Var = (eo2) ((po2) P11);
                        boolean h7 = xq2Var2.h(cb1Var);
                        Object P12 = xq2Var2.P();
                        if (h7 || P12 == vs0Var) {
                            h4 h4Var2 = new h4(2, cb1Var, cb1.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 3);
                            xq2Var2.l0(h4Var2);
                            P12 = h4Var2;
                        }
                        eo2 eo2Var2 = (eo2) ((po2) P12);
                        boolean h8 = xq2Var2.h(la1Var);
                        Object P13 = xq2Var2.P();
                        if (h8 || P13 == vs0Var) {
                            a0 a0Var2 = new a0(1, la1Var, la1.class, "getTitleIcon", "getTitleIcon(Lme/magnum/melonds/domain/model/DSiWareTitle;)Lme/magnum/melonds/ui/romlist/RomIcon;", 0, 0, 5);
                            xq2Var2.l0(a0Var2);
                            P13 = a0Var2;
                        }
                        ak7.B(lc2Var, lq4Var, list, qn2Var, qn2Var2, eo2Var, eo2Var2, (qn2) ((po2) P13), xq2Var2, ((intValue << 3) & 112) | 6);
                        xq2Var2.p(false);
                    } else if (fa1Var instanceof ca1) {
                        xq2Var2.b0(-926267222);
                        ak7.u(q60.s(ge7.N(x64Var, lq4Var), lq4Var).d(dj6.c), xq2Var2, 0);
                        xq2Var2.p(false);
                    } else {
                        throw xg6.f(xq2Var2, -926312255, false);
                    }
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 1:
                bt btVar = (bt) obj8;
                a74 a74Var = (a74) obj7;
                kt0 kt0Var = (kt0) obj6;
                fo2 fo2Var = (fo2) obj4;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                xq2 xq2Var3 = (xq2) ((px0) obj2);
                boolean h9 = xq2Var3.h(btVar);
                Object P14 = xq2Var3.P();
                if (h9 || P14 == vs0Var) {
                    P14 = new k0(btVar, 2);
                    xq2Var3.l0(P14);
                }
                mb3.d(btVar, (qn2) P14, xq2Var3);
                hf.b(nj2.E(a74Var, 4.0f, z16.b(4.0f), false, 0L, 28), z16.b(4.0f), 0L, RecyclerView.B1, n16.I(220644999, new x3(kt0Var, obj5, fo2Var, 0), xq2Var3), xq2Var3, 1572864, 60);
                return jg7Var;
            case 2:
                on2 on2Var = (on2) obj8;
                String[] strArr = (String[]) obj7;
                BackgroundMode backgroundMode = (BackgroundMode) obj6;
                qn2 qn2Var3 = (qn2) obj5;
                qa4 qa4Var = (qa4) obj4;
                lq4 lq4Var2 = (lq4) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lq4Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(lq4Var2)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var4 = (xq2) px0Var2;
                if (xq2Var4.S(intValue2 & 1, z)) {
                    String O = yh2.O(xq2Var4, R.string.background_name);
                    String str2 = (String) qa4Var.getValue();
                    if (str2 == null) {
                        str2 = i61.l(xq2Var4, -235878224, R.string.none, xq2Var4, false);
                    } else {
                        xq2Var4.b0(-235878782);
                        xq2Var4.p(false);
                    }
                    nq6 nq6Var = ky0.n;
                    nw7.d(O, str2, false, on2Var, ge7.r(lq4Var2, (kk3) xq2Var4.j(nq6Var)), xq2Var4, 0);
                    String O2 = yh2.O(xq2Var4, R.string.background_mode);
                    int ordinal = backgroundMode.ordinal();
                    if (ordinal >= 0 && ordinal < strArr.length) {
                        str = strArr[ordinal];
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    List T0 = fv.T0(strArr);
                    int ordinal2 = backgroundMode.ordinal();
                    boolean f5 = xq2Var4.f(qn2Var3);
                    Object P15 = xq2Var4.P();
                    if (f5 || P15 == vs0Var) {
                        P15 = new y00(4, qn2Var3);
                        xq2Var4.l0(P15);
                    }
                    yh2.f(O2, str3, T0, ordinal2, (qn2) P15, false, ge7.r(lq4Var2, (kk3) xq2Var4.j(nq6Var)), xq2Var4, 0);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 3:
                on2 on2Var2 = (on2) obj8;
                on2 on2Var3 = (on2) obj7;
                on2 on2Var4 = (on2) obj6;
                on2 on2Var5 = (on2) obj5;
                qa4 qa4Var2 = (qa4) obj4;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var3;
                if (xq2Var5.S(intValue3 & 1, z2)) {
                    boolean f6 = xq2Var5.f(on2Var2);
                    Object P16 = xq2Var5.P();
                    if (f6 || P16 == vs0Var) {
                        P16 = new s00(on2Var2, qa4Var2, 12);
                        xq2Var5.l0(P16);
                    }
                    ti.b((on2) P16, null, false, null, ge7.e, xq2Var5, 196608);
                    boolean f7 = xq2Var5.f(on2Var3);
                    Object P17 = xq2Var5.P();
                    if (f7 || P17 == vs0Var) {
                        P17 = new s00(on2Var3, qa4Var2, 13);
                        xq2Var5.l0(P17);
                    }
                    ti.b((on2) P17, null, false, null, ge7.f, xq2Var5, 196608);
                    boolean f8 = xq2Var5.f(on2Var4);
                    Object P18 = xq2Var5.P();
                    if (f8 || P18 == vs0Var) {
                        P18 = new s00(on2Var4, qa4Var2, 14);
                        xq2Var5.l0(P18);
                    }
                    ti.b((on2) P18, null, false, null, ge7.g, xq2Var5, 196608);
                    boolean f9 = xq2Var5.f(on2Var5);
                    Object P19 = xq2Var5.P();
                    if (f9 || P19 == vs0Var) {
                        P19 = new s00(on2Var5, qa4Var2, 15);
                        xq2Var5.l0(P19);
                    }
                    ti.b((on2) P19, null, false, null, ge7.h, xq2Var5, 196608);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 4:
                zt5 zt5Var = (zt5) obj8;
                String str4 = (String) obj7;
                mi6 mi6Var = (mi6) obj6;
                Context context = (Context) obj5;
                qn2 qn2Var4 = (qn2) obj4;
                px0 px0Var4 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                String O3 = yh2.O(px0Var4, R.string.threaded_rendering);
                Boolean bool = zt5Var.n;
                if (nb3.k(bool, Boolean.TRUE)) {
                    xq2Var = (xq2) px0Var4;
                    i2 = R.string.on;
                    i3 = -284385635;
                    z3 = false;
                } else {
                    z3 = false;
                    if (nb3.k(bool, Boolean.FALSE)) {
                        xq2Var = (xq2) px0Var4;
                        i2 = R.string.off;
                        i3 = -284383682;
                    } else if (bool == null) {
                        xq2 xq2Var6 = (xq2) px0Var4;
                        xq2Var6.b0(-284381710);
                        xq2Var6.p(false);
                        c = qo2.c(context, str4);
                        xq2 xq2Var7 = (xq2) px0Var4;
                        f = xq2Var7.f(mi6Var) | xq2Var7.h(context) | xq2Var7.f(str4) | xq2Var7.h(zt5Var) | xq2Var7.f(qn2Var4);
                        P = xq2Var7.P();
                        if (!f || P == vs0Var) {
                            jn3 jn3Var = new jn3(mi6Var, context, zt5Var, str4, qn2Var4, 2);
                            xq2Var7.l0(jn3Var);
                            P = jn3Var;
                        }
                        lt5.a(O3, c, false, true, (on2) P, xq2Var7, 3072, 4);
                        return jg7Var;
                    } else {
                        throw xg6.f((xq2) px0Var4, -284387609, false);
                    }
                }
                c = i61.l(xq2Var, i3, i2, xq2Var, z3);
                xq2 xq2Var72 = (xq2) px0Var4;
                f = xq2Var72.f(mi6Var) | xq2Var72.h(context) | xq2Var72.f(str4) | xq2Var72.h(zt5Var) | xq2Var72.f(qn2Var4);
                P = xq2Var72.P();
                if (!f) {
                }
                jn3 jn3Var2 = new jn3(mi6Var, context, zt5Var, str4, qn2Var4, 2);
                xq2Var72.l0(jn3Var2);
                P = jn3Var2;
                lt5.a(O3, c, false, true, (on2) P, xq2Var72, 3072, 4);
                return jg7Var;
            default:
                el6 el6Var = (el6) obj8;
                el6 el6Var2 = (el6) obj7;
                ArrayList arrayList = (ArrayList) obj6;
                k92 k92Var = (k92) obj5;
                String str5 = (String) obj4;
                eo2 eo2Var3 = (eo2) obj;
                px0 px0Var5 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var5).h(eo2Var3)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    intValue4 |= i6;
                }
                if ((intValue4 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var8 = (xq2) px0Var5;
                if (xq2Var8.S(intValue4 & 1, z4)) {
                    boolean k = nb3.k(el6Var, el6Var2);
                    if (k) {
                        i4 = 150;
                    } else {
                        i4 = 75;
                    }
                    if (k) {
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Object obj9 = arrayList.get(i9);
                            if (obj9 != null) {
                                arrayList2.add(obj9);
                            }
                        }
                        if (arrayList2.size() != 1) {
                            i5 = 75;
                            sc7 sc7Var = new sc7(i4, i5, ir1.c);
                            h = xq2Var8.h(el6Var) | xq2Var8.h(k92Var);
                            P2 = xq2Var8.P();
                            if (!h || P2 == vs0Var) {
                                P2 = new ci2(28, el6Var, k92Var);
                                xq2Var8.l0(P2);
                            }
                            on2 on2Var6 = (on2) P2;
                            P3 = xq2Var8.P();
                            if (P3 == vs0Var) {
                                if (!k) {
                                    f3 = 1.0f;
                                } else {
                                    f3 = RecyclerView.B1;
                                }
                                P3 = nb3.b(f3);
                                xq2Var8.l0(P3);
                            }
                            gnVar = (gn) P3;
                            Boolean valueOf = Boolean.valueOf(k);
                            h2 = xq2Var8.h(gnVar) | xq2Var8.g(k) | xq2Var8.h(sc7Var) | xq2Var8.f(on2Var6);
                            P4 = xq2Var8.P();
                            if (h2 && P4 != vs0Var) {
                                gnVar2 = gnVar;
                                z5 = k;
                            } else {
                                P4 = new f12(gnVar, k, sc7Var, on2Var6, (r41) null);
                                gnVar2 = gnVar;
                                z5 = k;
                                xq2Var8.l0(P4);
                            }
                            mb3.i(xq2Var8, (eo2) P4, valueOf);
                            uo uoVar = gnVar2.c;
                            sc7 sc7Var2 = new sc7(i4, i5, ir1.a);
                            P5 = xq2Var8.P();
                            if (P5 == vs0Var) {
                                if (!z5) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = 0.8f;
                                }
                                P5 = nb3.b(f2);
                                xq2Var8.l0(P5);
                            }
                            gn gnVar3 = (gn) P5;
                            Boolean valueOf2 = Boolean.valueOf(z5);
                            h3 = xq2Var8.h(gnVar3) | xq2Var8.g(z5) | xq2Var8.h(sc7Var2);
                            P6 = xq2Var8.P();
                            if (!h3 || P6 == vs0Var) {
                                P6 = new pg1(gnVar3, z5, sc7Var2, (r41) null);
                                xq2Var8.l0(P6);
                            }
                            mb3.i(xq2Var8, (eo2) P6, valueOf2);
                            uo uoVar2 = gnVar3.c;
                            float floatValue = ((Number) uoVar2.B.getValue()).floatValue();
                            float floatValue2 = ((Number) uoVar2.B.getValue()).floatValue();
                            float floatValue3 = ((Number) uoVar.B.getValue()).floatValue();
                            long j = i97.b;
                            jy2 jy2Var = u24.m;
                            long j2 = yt2.a;
                            a74 H = hv.H(x64.a, floatValue, floatValue2, floatValue3, RecyclerView.B1, RecyclerView.B1, j, jy2Var, false, j2, j2);
                            g = xq2Var8.g(z5) | xq2Var8.f(str5) | xq2Var8.h(el6Var);
                            P7 = xq2Var8.P();
                            if (!g || P7 == vs0Var) {
                                P7 = new bj1(2, str5, el6Var, z5);
                                xq2Var8.l0(P7);
                            }
                            a74 a = ua6.a(H, false, (qn2) P7);
                            e34 d2 = h70.d(d90.L, false);
                            B = ge7.B(xq2Var8);
                            xv4 l = xq2Var8.l();
                            a74 E = l.E(xq2Var8, a);
                            jx0.i.getClass();
                            iy0 iy0Var = ix0.b;
                            xq2Var8.f0();
                            if (!xq2Var8.S) {
                                xq2Var8.k(iy0Var);
                            } else {
                                xq2Var8.o0();
                            }
                            yh2.K(xq2Var8, ix0.f, d2);
                            yh2.K(xq2Var8, ix0.e, l);
                            pn pnVar = ix0.g;
                            if (!xq2Var8.S || !nb3.k(xq2Var8.P(), Integer.valueOf(B))) {
                                i61.v(B, xq2Var8, B, pnVar);
                            }
                            yh2.K(xq2Var8, ix0.d, E);
                            eo2Var3.o(xq2Var8, Integer.valueOf(intValue4 & 14));
                            xq2Var8.p(true);
                        }
                    }
                    i5 = 0;
                    sc7 sc7Var3 = new sc7(i4, i5, ir1.c);
                    h = xq2Var8.h(el6Var) | xq2Var8.h(k92Var);
                    P2 = xq2Var8.P();
                    if (!h) {
                    }
                    P2 = new ci2(28, el6Var, k92Var);
                    xq2Var8.l0(P2);
                    on2 on2Var62 = (on2) P2;
                    P3 = xq2Var8.P();
                    if (P3 == vs0Var) {
                    }
                    gnVar = (gn) P3;
                    Boolean valueOf3 = Boolean.valueOf(k);
                    h2 = xq2Var8.h(gnVar) | xq2Var8.g(k) | xq2Var8.h(sc7Var3) | xq2Var8.f(on2Var62);
                    P4 = xq2Var8.P();
                    if (h2) {
                    }
                    P4 = new f12(gnVar, k, sc7Var3, on2Var62, (r41) null);
                    gnVar2 = gnVar;
                    z5 = k;
                    xq2Var8.l0(P4);
                    mb3.i(xq2Var8, (eo2) P4, valueOf3);
                    uo uoVar3 = gnVar2.c;
                    sc7 sc7Var22 = new sc7(i4, i5, ir1.a);
                    P5 = xq2Var8.P();
                    if (P5 == vs0Var) {
                    }
                    gn gnVar32 = (gn) P5;
                    Boolean valueOf22 = Boolean.valueOf(z5);
                    h3 = xq2Var8.h(gnVar32) | xq2Var8.g(z5) | xq2Var8.h(sc7Var22);
                    P6 = xq2Var8.P();
                    if (!h3) {
                    }
                    P6 = new pg1(gnVar32, z5, sc7Var22, (r41) null);
                    xq2Var8.l0(P6);
                    mb3.i(xq2Var8, (eo2) P6, valueOf22);
                    uo uoVar22 = gnVar32.c;
                    float floatValue4 = ((Number) uoVar22.B.getValue()).floatValue();
                    float floatValue22 = ((Number) uoVar22.B.getValue()).floatValue();
                    float floatValue32 = ((Number) uoVar3.B.getValue()).floatValue();
                    long j3 = i97.b;
                    jy2 jy2Var2 = u24.m;
                    long j22 = yt2.a;
                    a74 H2 = hv.H(x64.a, floatValue4, floatValue22, floatValue32, RecyclerView.B1, RecyclerView.B1, j3, jy2Var2, false, j22, j22);
                    g = xq2Var8.g(z5) | xq2Var8.f(str5) | xq2Var8.h(el6Var);
                    P7 = xq2Var8.P();
                    if (!g) {
                    }
                    P7 = new bj1(2, str5, el6Var, z5);
                    xq2Var8.l0(P7);
                    a74 a2 = ua6.a(H2, false, (qn2) P7);
                    e34 d22 = h70.d(d90.L, false);
                    B = ge7.B(xq2Var8);
                    xv4 l2 = xq2Var8.l();
                    a74 E2 = l.E(xq2Var8, a2);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var8.f0();
                    if (!xq2Var8.S) {
                    }
                    yh2.K(xq2Var8, ix0.f, d22);
                    yh2.K(xq2Var8, ix0.e, l2);
                    pn pnVar2 = ix0.g;
                    if (!xq2Var8.S) {
                    }
                    i61.v(B, xq2Var8, B, pnVar2);
                    yh2.K(xq2Var8, ix0.d, E2);
                    eo2Var3.o(xq2Var8, Integer.valueOf(intValue4 & 14));
                    xq2Var8.p(true);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
        }
    }
}
