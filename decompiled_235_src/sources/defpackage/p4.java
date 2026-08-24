package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ p4(String str, List list, qn2 qn2Var, on2 on2Var, int i) {
        this.A = 5;
        this.B = str;
        this.R = list;
        this.X = qn2Var;
        this.L = on2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v34 */
    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
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
        du duVar = ju.a;
        eu euVar = ju.c;
        x64 x64Var = x64.a;
        vs0 vs0Var = ox0.a;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                nc1.b((qq5) obj6, (l6) obj5, (List) obj4, (qn2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                a74 a74Var = (a74) obj6;
                qa4 qa4Var = (qa4) obj5;
                zv0 zv0Var = (zv0) obj4;
                h30 h30Var = (h30) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    Object P = xq2Var.P();
                    if (P == vs0Var) {
                        P = new j4(qa4Var, 5);
                        xq2Var.l0(P);
                    }
                    a74 z10 = u24.z(a74Var, (qn2) P);
                    e34 d = h70.d(d90.L, true);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, z10);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    zv0Var.o(xq2Var, 0);
                    Object P2 = xq2Var.P();
                    if (P2 == vs0Var) {
                        P2 = new f4(qa4Var, 7);
                        xq2Var.l0(P2);
                    }
                    h30Var.b((on2) P2, xq2Var, 6);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 2:
                on2 on2Var = (on2) obj6;
                aq0 aq0Var = (aq0) obj5;
                pp6 pp6Var = (pp6) obj4;
                pp6 pp6Var2 = (pp6) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    es7 F = bl2.F(xq2Var2);
                    long j = F.b;
                    jy2 jy2Var = u24.m;
                    a74 j0 = nc1.j0(vy7.L(x64Var, j, jy2Var), nc1.q);
                    yt0 a = wt0.a(euVar, d90.k0, xq2Var2, 0);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, j0);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E2);
                    d40 d40Var = d90.i0;
                    a74 R = ge7.R(dj6.c(x64Var, 1.0f), 8.0f, 6.0f, 16.0f, 6.0f);
                    l26 a2 = k26.a(duVar, d40Var, xq2Var2, 48);
                    int hashCode3 = Long.hashCode(xq2Var2.T);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, R);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l3);
                    i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E3);
                    a74 i3 = dj6.i(x64Var, 38.0f);
                    y16 y16Var = z16.a;
                    a74 g = u24.g(i3, y16Var);
                    boolean f = xq2Var2.f(on2Var);
                    Object P3 = xq2Var2.P();
                    if (f || P3 == vs0Var) {
                        P3 = new x7(2, on2Var);
                        xq2Var2.l0(P3);
                    }
                    a74 u = mb3.u(g, false, null, (on2) P3, 15);
                    e40 e40Var = d90.Z;
                    e34 d2 = h70.d(e40Var, false);
                    int hashCode4 = Long.hashCode(xq2Var2.T);
                    xv4 l4 = xq2Var2.l();
                    a74 E4 = l.E(xq2Var2, u);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, d2);
                    yh2.K(xq2Var2, pnVar2, l4);
                    i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E4);
                    i13.b(kn2.Z(jw2.q(), xq2Var2), null, dj6.i(x64Var, 20.0f), F.g, xq2Var2, 440, 0);
                    xq2Var2.p(true);
                    gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
                    String str = (String) pp6Var.getValue();
                    if (str == null) {
                        str = i61.l(xq2Var2, 1937934882, R.string.cheats, xq2Var2, false);
                    } else {
                        xq2Var2.b0(1937934417);
                        xq2Var2.p(false);
                    }
                    String str2 = str;
                    x37.b(str2, new vn3(1.0f, true), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, 1772544, 3120, 120720);
                    if (((Boolean) pp6Var2.getValue()).booleanValue()) {
                        xq2Var2.b0(-53031630);
                        a74 g2 = u24.g(dj6.i(x64Var, 38.0f), y16Var);
                        boolean h = xq2Var2.h(aq0Var);
                        Object P4 = xq2Var2.P();
                        if (!h && P4 != vs0Var) {
                            z4 = false;
                        } else {
                            z4 = false;
                            P4 = new mp0(aq0Var, 0);
                            xq2Var2.l0(P4);
                        }
                        a74 u2 = mb3.u(g2, z4, null, (on2) P4, 15);
                        e34 d3 = h70.d(e40Var, z4);
                        int hashCode5 = Long.hashCode(xq2Var2.T);
                        xv4 l5 = xq2Var2.l();
                        a74 E5 = l.E(xq2Var2, u2);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, d3);
                        yh2.K(xq2Var2, pnVar2, l5);
                        i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E5);
                        e33 e33Var = nc1.s;
                        if (e33Var == null) {
                            d33 d33Var = new d33("Outlined.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = el7.a;
                            cn6 cn6Var = new cn6(kt0.b);
                            ww2 ww2Var = new ww2(1, (byte) 0);
                            ww2Var.o(19.0f, 3.0f);
                            ww2Var.m(5.0f, 3.0f);
                            ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                            ww2Var.u(14.0f);
                            ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            ww2Var.l(14.0f);
                            ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                            ww2Var.m(21.0f, 5.0f);
                            ww2Var.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            ww2Var.g();
                            ww2Var.o(19.0f, 19.0f);
                            ww2Var.m(5.0f, 19.0f);
                            ww2Var.m(5.0f, 5.0f);
                            ww2Var.l(14.0f);
                            ww2Var.u(14.0f);
                            ww2Var.g();
                            ww2Var.o(17.99f, 9.0f);
                            ww2Var.n(-1.41f, -1.42f);
                            ww2Var.n(-6.59f, 6.59f);
                            ww2Var.n(-2.58f, -2.57f);
                            ww2Var.n(-1.42f, 1.41f);
                            ww2Var.n(4.0f, 3.99f);
                            ww2Var.g();
                            d33.a(d33Var, ww2Var.b, 0, cn6Var);
                            e33Var = d33Var.b();
                            nc1.s = e33Var;
                        }
                        i13.b(kn2.Z(e33Var, xq2Var2), yh2.O(xq2Var2, R.string.enabled_cheats), dj6.i(x64Var, 20.0f), F.h, xq2Var2, 392, 0);
                        z3 = true;
                        xq2Var2.p(true);
                        i = 0;
                        xq2Var2.p(false);
                    } else {
                        z3 = true;
                        i = 0;
                        xq2Var2.b0(-52250337);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(z3);
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), F.f, jy2Var), xq2Var2, i);
                    xq2Var2.p(z3);
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                f04.f((c11) obj6, (Rect) obj5, (Rect) obj4, (a74) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 4:
                ((Integer) obj2).getClass();
                e11.a((String) obj6, (ArrayList) obj5, (qn2) obj3, (on2) obj4, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 5:
                ((Integer) obj2).getClass();
                e11.b((String) obj6, (List) obj4, (qn2) obj3, (on2) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 6:
                on2 on2Var2 = (on2) obj6;
                pa1 pa1Var = (pa1) obj5;
                qn2 qn2Var = (qn2) obj3;
                eo2 eo2Var = (eo2) obj4;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z5)) {
                    long j2 = ((ut0) xq2Var3.j(vt0.a)).j();
                    WeakHashMap weakHashMap = dv7.w;
                    v56.b(th7.d(xq2Var3).l, null, null, n16.I(264590106, new j10(on2Var2, 3, (byte) 0), xq2Var3), null, null, null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, j2, 0L, n16.I(-1023875647, new qa1(pa1Var, qn2Var, eo2Var, 0), xq2Var3), xq2Var3, 3072, 100663296, 196598);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 7:
                on2 on2Var3 = (on2) obj6;
                Integer num = (Integer) obj5;
                Integer num2 = (Integer) obj4;
                eo2 eo2Var2 = (eo2) obj3;
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z6)) {
                    q60.b(yh2.O(xq2Var4, R.string.cancel), false, on2Var3, xq2Var4, 0, 2);
                    String O = yh2.O(xq2Var4, R.string.ok);
                    if (num != null && num2 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f2 = xq2Var4.f(num) | xq2Var4.f(num2) | xq2Var4.f(eo2Var2);
                    Object P5 = xq2Var4.P();
                    if (f2 || P5 == vs0Var) {
                        P5 = new tj3(num, num2, eo2Var2, 0);
                        xq2Var4.l0(P5);
                    }
                    q60.b(O, z7, (on2) P5, xq2Var4, 0, 0);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 8:
                ((Integer) obj2).getClass();
                kn2.e((on2) obj6, (a74) obj5, (pq3) obj4, (eq3) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 9:
                ((Integer) obj2).getClass();
                hi2.f((ut0) obj6, (xe7) obj5, (ye6) obj4, (zv0) obj3, (px0) obj, ii2.a0(3073));
                return jg7Var;
            case 10:
                ((Integer) obj2).getClass();
                ru4.c((mu4) obj6, (pq5) obj5, (qn2) obj3, (on2) obj4, (px0) obj, ii2.a0(457));
                return jg7Var;
            case 11:
                ((Integer) obj2).getClass();
                uj2.f((a74) obj6, (lq4) obj5, (oi4) obj4, (on2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 12:
                lq4 lq4Var = (lq4) obj6;
                j37 j37Var = (j37) obj5;
                qn2 qn2Var2 = (qn2) obj3;
                qa4 qa4Var2 = (qa4) obj4;
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z8)) {
                    Object P6 = xq2Var5.P();
                    if (P6 == vs0Var) {
                        P6 = new nh2();
                        xq2Var5.l0(P6);
                    }
                    nh2 nh2Var = (nh2) P6;
                    a74 S = ak7.S(ge7.N(dj6.c(x64Var, 1.0f), lq4Var), nh2Var);
                    c37 c37Var = (c37) j37Var.b.getValue();
                    boolean booleanValue = ((Boolean) qa4Var2.getValue()).booleanValue();
                    xf1 J = mb3.J(xq2Var5);
                    xh3 xh3Var = (xh3) j37Var.c.getValue();
                    boolean f3 = xq2Var5.f(j37Var);
                    Object P7 = xq2Var5.P();
                    if (f3 || P7 == vs0Var) {
                        P7 = new qk4(24, j37Var, qa4Var2);
                        xq2Var5.l0(P7);
                    }
                    vh3 vh3Var = new vh3(62, (qn2) P7);
                    boolean f4 = xq2Var5.f(j37Var) | xq2Var5.f(qn2Var2);
                    Object P8 = xq2Var5.P();
                    if (f4 || P8 == vs0Var) {
                        P8 = new s27(j37Var, qn2Var2, qa4Var2, 1);
                        xq2Var5.l0(P8);
                    }
                    zo4.a(c37Var, (qn2) P8, S, false, null, null, booleanValue, null, xh3Var, vh3Var, false, 0, 0, null, J, xq2Var5, 0, 0, 510968);
                    Object P9 = xq2Var5.P();
                    if (P9 == vs0Var) {
                        P9 = new sn0(nh2Var, null, 2);
                        xq2Var5.l0(P9);
                    }
                    mb3.i(xq2Var5, (eo2) P9, jg7Var);
                    return jg7Var;
                }
                xq2Var5.V();
                return jg7Var;
            default:
                es7 es7Var = (es7) obj6;
                on2 on2Var4 = (on2) obj5;
                String str3 = (String) obj4;
                eo2 eo2Var3 = (eo2) obj3;
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z9)) {
                    long j3 = es7Var.b;
                    jy2 jy2Var2 = u24.m;
                    a74 j02 = nc1.j0(vy7.L(x64Var, j3, jy2Var2), nc1.q);
                    yt0 a3 = wt0.a(euVar, d90.k0, xq2Var6, 0);
                    int hashCode6 = Long.hashCode(xq2Var6.T);
                    xv4 l6 = xq2Var6.l();
                    a74 E6 = l.E(xq2Var6, j02);
                    jx0.i.getClass();
                    iy0 iy0Var3 = ix0.b;
                    xq2Var6.f0();
                    if (xq2Var6.S) {
                        xq2Var6.k(iy0Var3);
                    } else {
                        xq2Var6.o0();
                    }
                    pn pnVar5 = ix0.f;
                    yh2.K(xq2Var6, pnVar5, a3);
                    pn pnVar6 = ix0.e;
                    yh2.K(xq2Var6, pnVar6, l6);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    pn pnVar7 = ix0.g;
                    yh2.K(xq2Var6, pnVar7, valueOf2);
                    ne neVar2 = ix0.h;
                    yh2.F(xq2Var6, neVar2);
                    pn pnVar8 = ix0.d;
                    yh2.K(xq2Var6, pnVar8, E6);
                    d40 d40Var2 = d90.i0;
                    a74 R2 = ge7.R(dj6.c(x64Var, 1.0f), 8.0f, 6.0f, 16.0f, 6.0f);
                    l26 a4 = k26.a(duVar, d40Var2, xq2Var6, 48);
                    int hashCode7 = Long.hashCode(xq2Var6.T);
                    xv4 l7 = xq2Var6.l();
                    a74 E7 = l.E(xq2Var6, R2);
                    xq2Var6.f0();
                    if (xq2Var6.S) {
                        xq2Var6.k(iy0Var3);
                    } else {
                        xq2Var6.o0();
                    }
                    yh2.K(xq2Var6, pnVar5, a4);
                    yh2.K(xq2Var6, pnVar6, l7);
                    i61.w(hashCode7, xq2Var6, pnVar7, xq2Var6, neVar2);
                    yh2.K(xq2Var6, pnVar8, E7);
                    a74 u3 = mb3.u(u24.g(dj6.i(x64Var, 38.0f), z16.a), false, null, on2Var4, 15);
                    e34 d4 = h70.d(d90.Z, false);
                    int hashCode8 = Long.hashCode(xq2Var6.T);
                    xv4 l8 = xq2Var6.l();
                    a74 E8 = l.E(xq2Var6, u3);
                    xq2Var6.f0();
                    if (xq2Var6.S) {
                        xq2Var6.k(iy0Var3);
                    } else {
                        xq2Var6.o0();
                    }
                    yh2.K(xq2Var6, pnVar5, d4);
                    yh2.K(xq2Var6, pnVar6, l8);
                    i61.w(hashCode8, xq2Var6, pnVar7, xq2Var6, neVar2);
                    yh2.K(xq2Var6, pnVar8, E8);
                    i13.a(jw2.q(), yh2.O(xq2Var6, R.string.navigate_back), dj6.i(x64Var, 20.0f), es7Var.g, xq2Var6, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    xq2Var6.p(true);
                    gi2.h(xq2Var6, dj6.l(x64Var, 6.0f));
                    x37.b(str3, new vn3(1.0f, true), es7Var.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var6, 1772544, 3120, 120720);
                    if (eo2Var3 == null) {
                        xq2Var6.b0(-1004231867);
                        r11 = 0;
                    } else {
                        r11 = 0;
                        xq2Var6.b0(383247420);
                        eo2Var3.o(xq2Var6, 0);
                    }
                    xq2Var6.p(r11);
                    xq2Var6.p(true);
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), es7Var.f, jy2Var2), xq2Var6, r11);
                    xq2Var6.p(true);
                    return jg7Var;
                }
                xq2Var6.V();
                return jg7Var;
        }
    }

    public /* synthetic */ p4(Object obj, Object obj2, qn2 qn2Var, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.X = qn2Var;
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

    public /* synthetic */ p4(Object obj, Object obj2, qn2 qn2Var, on2 on2Var, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.X = qn2Var;
        this.R = on2Var;
    }
}
