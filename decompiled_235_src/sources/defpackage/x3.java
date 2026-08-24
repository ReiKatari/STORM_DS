package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ x3(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        zv0 I;
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
        zt0 zt0Var = zt0.a;
        zv0 zv0Var = null;
        x64 x64Var = x64.a;
        eu euVar = ju.c;
        vs0 vs0Var = ox0.a;
        boolean z15 = false;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                kt0 kt0Var = (kt0) obj5;
                fo2 fo2Var = (fo2) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    gb3 gb3Var = gb3.Min;
                    x64 x64Var2 = x64.a;
                    a74 O = ge7.O(g04.G(x64Var2, gb3Var), 4.0f);
                    l26 a = k26.a(ju.a, d90.i0, xq2Var, 48);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, a);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    if (kt0Var != null) {
                        xq2Var.b0(2132064774);
                        h70.a(vy7.L(dj6.b(dj6.l(ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, 4.0f, RecyclerView.B1, 11), 3.0f), 1.0f), kt0Var.a, z16.b(2.0f)), xq2Var, 0);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(2132365567);
                        xq2Var.p(false);
                    }
                    if (((Boolean) xq2Var.j(q83.a)).booleanValue()) {
                        xq2Var.b0(2132418887);
                        h70.a(vy7.L(dj6.i(x64Var2, 32.0f), kt0.c, u24.m), xq2Var, 6);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(2132541895);
                        a74 i2 = dj6.i(x64Var2, 32.0f);
                        x23 x23Var = new x23((Context) xq2Var.j(kf.b));
                        x23Var.c = obj4;
                        x23Var.b(false);
                        gi2.b(x23Var.a(), null, i2, null, RecyclerView.B1, xq2Var, 432, 4088);
                        xq2Var.p(false);
                    }
                    if (fo2Var == null) {
                        xq2Var.b0(2132914514);
                    } else {
                        xq2Var.b0(1177182351);
                        fo2Var.e(n26.a, xq2Var, 6);
                    }
                    xq2Var.p(false);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                nc1.p((a74) obj5, (ta5) obj4, (on2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 2:
                eo2 eo2Var = (eo2) obj5;
                eo2 eo2Var2 = (eo2) obj4;
                zv0 zv0Var2 = (zv0) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    yt0 a2 = wt0.a(euVar, d90.k0, xq2Var2, 0);
                    int B = ge7.B(xq2Var2);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, x64Var);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a2);
                    yh2.K(xq2Var2, ix0.e, l2);
                    pn pnVar = ix0.g;
                    if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                        i61.v(B, xq2Var2, B, pnVar);
                    }
                    yh2.K(xq2Var2, ix0.d, E2);
                    if (eo2Var == null) {
                        xq2Var2.b0(-97968969);
                        xq2Var2.p(false);
                        I = null;
                    } else {
                        xq2Var2.b0(-97968968);
                        I = n16.I(1737550099, new bc(0, eo2Var), xq2Var2);
                        xq2Var2.p(false);
                    }
                    if (eo2Var2 == null) {
                        xq2Var2.b0(-97547524);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-97547523);
                        zv0Var = n16.I(1265552690, new bc(1, eo2Var2), xq2Var2);
                        xq2Var2.p(false);
                    }
                    hc.a(I, zv0Var, xq2Var2, 6);
                    zv0Var2.o(xq2Var2, 0);
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 3:
                a74 a74Var = (a74) obj5;
                qa4 qa4Var = (qa4) obj4;
                zv0 zv0Var3 = (zv0) obj3;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    Object P = xq2Var3.P();
                    if (P == vs0Var) {
                        P = new j4(qa4Var, 4);
                        xq2Var3.l0(P);
                    }
                    a74 z16 = u24.z(a74Var, (qn2) P);
                    e34 d = h70.d(d90.L, true);
                    int hashCode2 = Long.hashCode(xq2Var3.T);
                    xv4 l3 = xq2Var3.l();
                    a74 E3 = l.E(xq2Var3, z16);
                    jx0.i.getClass();
                    iy0 iy0Var3 = ix0.b;
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var3);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.f, d);
                    yh2.K(xq2Var3, ix0.e, l3);
                    yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode2));
                    yh2.F(xq2Var3, ix0.h);
                    yh2.K(xq2Var3, ix0.d, E3);
                    zv0Var3.o(xq2Var3, 0);
                    xq2Var3.p(true);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 4:
                qa4 qa4Var2 = (qa4) obj5;
                on2 on2Var = (on2) obj4;
                on2 on2Var2 = (on2) obj3;
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z4)) {
                    i13.b(kn2.Z(oi2.A(), xq2Var4), yh2.O(xq2Var4, R.string.options), null, 0L, xq2Var4, 8, 12);
                    boolean booleanValue = ((Boolean) qa4Var2.getValue()).booleanValue();
                    Object P2 = xq2Var4.P();
                    if (P2 == vs0Var) {
                        P2 = new f4(qa4Var2, 5);
                        xq2Var4.l0(P2);
                    }
                    ti.a(booleanValue, (on2) P2, null, 0L, null, null, n16.I(361844192, new r00(on2Var, on2Var2, qa4Var2, 0), xq2Var4), xq2Var4, 1572912);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 5:
                qa4 qa4Var3 = (qa4) obj5;
                lq4 lq4Var = (lq4) obj4;
                fo2 fo2Var2 = (fo2) obj3;
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z5)) {
                    hv.d(g31.a.a(Float.valueOf(kt0.e(((kt0) qa4Var3.getValue()).a))), n16.I(-869936862, new m90(lq4Var, fo2Var2, 0), xq2Var5), xq2Var5, 56);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 6:
                nh2 nh2Var = (nh2) obj5;
                final xn0 xn0Var = (xn0) obj4;
                on2 on2Var3 = (on2) obj3;
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z6)) {
                    a74 S = ak7.S(dj6.c(x64Var, 1.0f), nh2Var);
                    c37 c37Var = (c37) xn0Var.b.getValue();
                    if (((wn0) xn0Var.e.getValue()) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    xf1 J = mb3.J(xq2Var6);
                    xh3 xh3Var = new xh3(3, 0, 6, 118);
                    boolean f = xq2Var6.f(xn0Var);
                    Object P3 = xq2Var6.P();
                    if (f || P3 == vs0Var) {
                        P3 = new qn2() { // from class: ln0
                            @Override // defpackage.qn2
                            public final Object g(Object obj6) {
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                xn0 xn0Var2 = xn0Var;
                                c37 c37Var2 = (c37) obj6;
                                switch (i3) {
                                    case 0:
                                        c37Var2.getClass();
                                        xn0Var2.getClass();
                                        vs4 vs4Var = xn0Var2.b;
                                        vs4Var.setValue(c37Var2);
                                        vs4 vs4Var2 = xn0Var2.e;
                                        if (((wn0) vs4Var2.getValue()) != null) {
                                            if (qs6.v0(((c37) vs4Var.getValue()).a.B)) {
                                                vs4Var2.setValue(wn0.CANNOT_BE_EMPTY);
                                            } else {
                                                vs4Var2.setValue(null);
                                            }
                                        }
                                        return jg7Var2;
                                    case 1:
                                        c37Var2.getClass();
                                        xn0Var2.getClass();
                                        xn0Var2.c.setValue(c37Var2);
                                        return jg7Var2;
                                    default:
                                        c37Var2.getClass();
                                        xn0Var2.d.setValue(n16.w(c37Var2));
                                        if (((wn0) xn0Var2.f.getValue()) != null) {
                                            xn0Var2.b();
                                        }
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var6.l0(P3);
                    }
                    jx2.c(c37Var, (qn2) P3, S, false, null, n16.d, n16.e, z7, null, xh3Var, null, true, 0, 0, null, J, xq2Var6, 1572864, 199686, 1004472);
                    a74 c = dj6.c(x64Var, 1.0f);
                    c37 c37Var2 = (c37) xn0Var.c.getValue();
                    xf1 J2 = mb3.J(xq2Var6);
                    xh3 xh3Var2 = new xh3(3, 0, 6, 118);
                    boolean f2 = xq2Var6.f(xn0Var);
                    Object P4 = xq2Var6.P();
                    if (f2 || P4 == vs0Var) {
                        P4 = new qn2() { // from class: ln0
                            @Override // defpackage.qn2
                            public final Object g(Object obj6) {
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                xn0 xn0Var2 = xn0Var;
                                c37 c37Var22 = (c37) obj6;
                                switch (i3) {
                                    case 0:
                                        c37Var22.getClass();
                                        xn0Var2.getClass();
                                        vs4 vs4Var = xn0Var2.b;
                                        vs4Var.setValue(c37Var22);
                                        vs4 vs4Var2 = xn0Var2.e;
                                        if (((wn0) vs4Var2.getValue()) != null) {
                                            if (qs6.v0(((c37) vs4Var.getValue()).a.B)) {
                                                vs4Var2.setValue(wn0.CANNOT_BE_EMPTY);
                                            } else {
                                                vs4Var2.setValue(null);
                                            }
                                        }
                                        return jg7Var2;
                                    case 1:
                                        c37Var22.getClass();
                                        xn0Var2.getClass();
                                        xn0Var2.c.setValue(c37Var22);
                                        return jg7Var2;
                                    default:
                                        c37Var22.getClass();
                                        xn0Var2.d.setValue(n16.w(c37Var22));
                                        if (((wn0) xn0Var2.f.getValue()) != null) {
                                            xn0Var2.b();
                                        }
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var6.l0(P4);
                    }
                    zo4.a(c37Var2, (qn2) P4, c, false, null, n16.f, false, null, xh3Var2, null, false, 0, 0, null, J2, xq2Var6, 1573248, RendererDebugBridge.CAPTURE_HEIGHT, 520120);
                    a74 c2 = dj6.c(x64Var, 1.0f);
                    c37 c37Var3 = (c37) xn0Var.d.getValue();
                    s47 a3 = s47.a((s47) xq2Var6.j(x37.a), 0L, 0L, null, li2.L, 0L, 0L, null, 16777183);
                    if (((wn0) xn0Var.f.getValue()) != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    xf1 J3 = mb3.J(xq2Var6);
                    xh3 xh3Var3 = new xh3(1, 0, 7, 116);
                    boolean f3 = xq2Var6.f(on2Var3);
                    Object P5 = xq2Var6.P();
                    if (f3 || P5 == vs0Var) {
                        P5 = new mn0(0, on2Var3);
                        xq2Var6.l0(P5);
                    }
                    vh3 vh3Var = new vh3(62, (qn2) P5);
                    boolean f4 = xq2Var6.f(xn0Var);
                    Object P6 = xq2Var6.P();
                    if (f4 || P6 == vs0Var) {
                        P6 = new qn2() { // from class: ln0
                            @Override // defpackage.qn2
                            public final Object g(Object obj6) {
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                xn0 xn0Var2 = xn0Var;
                                c37 c37Var22 = (c37) obj6;
                                switch (i3) {
                                    case 0:
                                        c37Var22.getClass();
                                        xn0Var2.getClass();
                                        vs4 vs4Var = xn0Var2.b;
                                        vs4Var.setValue(c37Var22);
                                        vs4 vs4Var2 = xn0Var2.e;
                                        if (((wn0) vs4Var2.getValue()) != null) {
                                            if (qs6.v0(((c37) vs4Var.getValue()).a.B)) {
                                                vs4Var2.setValue(wn0.CANNOT_BE_EMPTY);
                                            } else {
                                                vs4Var2.setValue(null);
                                            }
                                        }
                                        return jg7Var2;
                                    case 1:
                                        c37Var22.getClass();
                                        xn0Var2.getClass();
                                        xn0Var2.c.setValue(c37Var22);
                                        return jg7Var2;
                                    default:
                                        c37Var22.getClass();
                                        xn0Var2.d.setValue(n16.w(c37Var22));
                                        if (((wn0) xn0Var2.f.getValue()) != null) {
                                            xn0Var2.b();
                                        }
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var6.l0(P6);
                    }
                    jx2.c(c37Var3, (qn2) P6, c2, false, a3, n16.g, n16.I(1770623028, new nn0(xn0Var, 0), xq2Var6), z8, null, xh3Var3, vh3Var, false, 0, 4, null, J3, xq2Var6, 1573248, 12585990, 889752);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 7:
                ((Integer) obj2).getClass();
                lb4.c((jn0) obj5, (on2) obj4, (qn2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 8:
                ((Integer) obj2).getClass();
                ge7.d((a74) obj5, (co0) obj4, (on2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 9:
                es7 es7Var = (es7) obj5;
                String str = (String) obj4;
                zv0 zv0Var4 = (zv0) obj3;
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z9)) {
                    x64 x64Var3 = x64.a;
                    a74 g = u24.g(dj6.c(x64Var3, 1.0f), z16.b(16.0f));
                    long j = es7Var.c;
                    long j2 = es7Var.f;
                    jy2 jy2Var = u24.m;
                    a74 Q = ge7.Q(ak7.I(vy7.L(g, j, jy2Var), 1.0f, j2, z16.b(16.0f)), RecyclerView.B1, 12.0f, 1);
                    yt0 a4 = wt0.a(euVar, d90.k0, xq2Var7, 0);
                    int hashCode3 = Long.hashCode(xq2Var7.T);
                    xv4 l4 = xq2Var7.l();
                    a74 E4 = l.E(xq2Var7, Q);
                    jx0.i.getClass();
                    iy0 iy0Var4 = ix0.b;
                    xq2Var7.f0();
                    if (xq2Var7.S) {
                        xq2Var7.k(iy0Var4);
                    } else {
                        xq2Var7.o0();
                    }
                    yh2.K(xq2Var7, ix0.f, a4);
                    yh2.K(xq2Var7, ix0.e, l4);
                    yh2.K(xq2Var7, ix0.g, Integer.valueOf(hashCode3));
                    yh2.F(xq2Var7, ix0.h);
                    yh2.K(xq2Var7, ix0.d, E4);
                    x37.b(str, ge7.P(x64Var3, 20.0f, 6.0f), es7Var.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var7, 1772592, 0, 130960);
                    h70.a(vy7.L(dj6.e(dj6.c(ge7.S(x64Var3, RecyclerView.B1, 4.0f, RecyclerView.B1, 2.0f, 5), 1.0f), 1.0f), j2, jy2Var), xq2Var7, 0);
                    zv0Var4.e(zt0Var, xq2Var7, 6);
                    xq2Var7.p(true);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 10:
                jq1 jq1Var = (jq1) obj5;
                jq1 jq1Var2 = (jq1) obj4;
                es7 es7Var2 = (es7) obj3;
                px0 px0Var8 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue8 & 1, z10)) {
                    if (jq1Var == jq1Var2) {
                        xq2Var8.b0(-1341565104);
                        i13.a(jw2.r(), null, dj6.i(x64Var, 20.0f), es7Var2.l, xq2Var8, 432, 0);
                        xq2Var8.p(false);
                    } else {
                        xq2Var8.b0(-1341458588);
                        xq2Var8.p(false);
                    }
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 11:
                ((Integer) obj2).getClass();
                x01.c((String) obj5, (on2) obj4, (zv0) obj3, (px0) obj, ii2.a0(385));
                return jg7Var;
            case 12:
                ((Integer) obj2).getClass();
                hf.d((a74) obj5, (p27) obj4, (zv0) obj3, (px0) obj, ii2.a0(385));
                return jg7Var;
            case 13:
                ((Integer) obj2).getClass();
                nb3.e((xa1) obj5, (on2) obj4, (qn2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 14:
                String str2 = (String) obj5;
                List list = (List) obj4;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                px0 px0Var9 = (px0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i3 = EmulatorActivity.Z1;
                if ((intValue9 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(intValue9 & 1, z11)) {
                    String string = emulatorActivity.getString(R.string.external_choose_on_device);
                    string.getClass();
                    g04.p(str2, list, string, xq2Var9, 0);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 15:
                ((Integer) obj2).getClass();
                g04.p((String) obj5, (List) obj4, (String) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 16:
                ((Integer) obj2).getClass();
                g04.k((pq5) obj5, (String) obj4, (String) obj3, (px0) obj, ii2.a0(9));
                return jg7Var;
            case 17:
                ((Integer) obj2).getClass();
                gi2.c((a74) obj5, (an0) obj4, (on2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 18:
                ((Integer) obj2).getClass();
                mp2.a((a74) obj5, (cp2) obj4, (on2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 19:
                on2 on2Var4 = (on2) obj5;
                Integer num = (Integer) obj4;
                qn2 qn2Var = (qn2) obj3;
                px0 px0Var10 = (px0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue10 & 1, z12)) {
                    q60.b(yh2.O(xq2Var10, R.string.cancel), false, on2Var4, xq2Var10, 0, 2);
                    String O2 = yh2.O(xq2Var10, R.string.ok);
                    if (num != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean f5 = xq2Var10.f(num) | xq2Var10.f(qn2Var);
                    Object P7 = xq2Var10.P();
                    if (f5 || P7 == vs0Var) {
                        P7 = new ci2(7, num, qn2Var);
                        xq2Var10.l0(P7);
                    }
                    q60.b(O2, z13, (on2) P7, xq2Var10, 0, 0);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 20:
                ((Integer) obj2).getClass();
                kn2.d((fk3) obj5, (on2) obj4, (go2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                on2 on2Var5 = (on2) obj5;
                on2 on2Var6 = (on2) obj4;
                es7 es7Var3 = (es7) obj3;
                px0 px0Var11 = (px0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z15 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var11;
                if (xq2Var11.S(intValue11 & 1, z15)) {
                    ej2.b(on2Var5, null, false, n16.I(1586103606, new d4(es7Var3, 2), xq2Var11), xq2Var11, 24576, 14);
                    ej2.b(on2Var6, null, false, n16.I(1431408429, new d4(es7Var3, 3), xq2Var11), xq2Var11, 24576, 14);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 22:
                a74 a74Var2 = (a74) obj5;
                s76 s76Var = (s76) obj4;
                zv0 zv0Var5 = (zv0) obj3;
                px0 px0Var12 = (px0) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                xq2 xq2Var12 = (xq2) px0Var12;
                if (xq2Var12.S(intValue12 & 1, z14)) {
                    a74 W = nb3.W(g04.Y(ge7.Q(a74Var2, RecyclerView.B1, 8.0f, 1), gb3.Max), s76Var, true);
                    yt0 a5 = wt0.a(euVar, d90.k0, xq2Var12, 0);
                    int B2 = ge7.B(xq2Var12);
                    xv4 l5 = xq2Var12.l();
                    a74 E5 = l.E(xq2Var12, W);
                    jx0.i.getClass();
                    iy0 iy0Var5 = ix0.b;
                    xq2Var12.f0();
                    if (xq2Var12.S) {
                        xq2Var12.k(iy0Var5);
                    } else {
                        xq2Var12.o0();
                    }
                    yh2.K(xq2Var12, ix0.f, a5);
                    yh2.K(xq2Var12, ix0.e, l5);
                    pn pnVar2 = ix0.g;
                    if (xq2Var12.S || !nb3.k(xq2Var12.P(), Integer.valueOf(B2))) {
                        i61.v(B2, xq2Var12, B2, pnVar2);
                    }
                    yh2.K(xq2Var12, ix0.d, E5);
                    zv0Var5.e(zt0Var, xq2Var12, 6);
                    xq2Var12.p(true);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((Integer) obj2).getClass();
                kn2.f((sb4) obj5, (o46) obj4, (zv0) obj3, (px0) obj, ii2.a0(385));
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                hv.L((w61) obj5, null, null, new wc4(floatValue, (n96) obj4, (sb4) obj3, (r41) null), 3);
                return jg7Var;
            case 25:
                ((Integer) obj2).getClass();
                ru4.b((nu4) obj5, (on2) obj4, (on2) obj3, (px0) obj, ii2.a0(49));
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                ((Integer) obj2).getClass();
                qo2.h((le2) obj5, (on2) obj4, (on2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 27:
                ((Integer) obj2).getClass();
                ak7.v((qw5) obj5, (qn2) obj4, (a74) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 28:
                ((Integer) obj2).getClass();
                lt5.b((String) obj5, (a74) obj4, (zv0) obj3, (px0) obj, ii2.a0(385));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                hf.l((vv5) obj5, (qn2) obj4, (a74) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ x3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
