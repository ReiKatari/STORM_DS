package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f46 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ es7 B;
    public final /* synthetic */ c46 L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ List X;
    public final /* synthetic */ qn2 Y;

    public /* synthetic */ f46(es7 es7Var, c46 c46Var, on2 on2Var, List list, qn2 qn2Var, int i) {
        this.A = i;
        this.B = es7Var;
        this.L = c46Var;
        this.R = on2Var;
        this.X = list;
        this.Y = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        Object valueOf;
        boolean z2;
        String g;
        long j;
        float f;
        String str;
        long j2;
        boolean z3;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f2 = 1.0f;
        x64 x64Var = x64.a;
        switch (i) {
            case 0:
                int i2 = this.L.a;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 O = ge7.O(x64Var, 20.0f);
                    yt0 a = wt0.a(ju.c, d90.l0, xq2Var, 48);
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
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var, pnVar2, l);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var, pnVar3, valueOf2);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var, pnVar4, E);
                    pi2 pi2Var = qs7.a;
                    long E2 = hi2.E(16);
                    oj2 oj2Var = oj2.e0;
                    es7 es7Var = this.B;
                    x37.b("Дублировать сохранение", null, es7Var.g, E2, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130962);
                    gi2.h(xq2Var, dj6.e(x64Var, 6.0f));
                    if (i2 == 0) {
                        valueOf = "Быстрого";
                    } else {
                        valueOf = Integer.valueOf(i2);
                    }
                    x37.b("Из слота " + valueOf + " в:", null, es7Var.i, hi2.E(11), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
                    xq2 xq2Var2 = xq2Var;
                    gi2.h(xq2Var2, dj6.e(x64Var, 16.0f));
                    a74 c = dj6.c(x64Var, 1.0f);
                    yt0 a2 = wt0.a(new gu(8.0f, true, new i(1)), d90.k0, xq2Var2, 6);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, c);
                    xq2Var2.f0();
                    float f3 = 8.0f;
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l2);
                    i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E3);
                    xq2Var2.b0(-748398601);
                    Iterator it = this.X.iterator();
                    while (it.hasNext()) {
                        c46 c46Var = (c46) it.next();
                        if (c46Var.a == i2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a74 g2 = u24.g(dj6.c(x64Var, f2), z16.b(f3));
                        long j3 = es7Var.d;
                        if (z2) {
                            j3 = kt0.c(0.3f, j3);
                        }
                        a74 L = vy7.L(g2, j3, u24.m);
                        boolean z4 = !z2;
                        qn2 qn2Var = this.Y;
                        boolean f4 = xq2Var2.f(qn2Var) | xq2Var2.h(c46Var);
                        Object P = xq2Var2.P();
                        if (f4 || P == ox0.a) {
                            P = new ci2(25, qn2Var, c46Var);
                            xq2Var2.l0(P);
                        }
                        a74 P2 = ge7.P(mb3.u(L, z4, null, (on2) P, 14), 12.0f, 10.0f);
                        d40 d40Var = d90.i0;
                        l26 a3 = k26.a(ju.e, d40Var, xq2Var2, 54);
                        int hashCode3 = Long.hashCode(xq2Var2.T);
                        xv4 l3 = xq2Var2.l();
                        a74 E4 = l.E(xq2Var2, P2);
                        jx0.i.getClass();
                        iy0 iy0Var2 = ix0.b;
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        pn pnVar5 = ix0.f;
                        yh2.K(xq2Var2, pnVar5, a3);
                        pn pnVar6 = ix0.e;
                        yh2.K(xq2Var2, pnVar6, l3);
                        Integer valueOf3 = Integer.valueOf(hashCode3);
                        pn pnVar7 = ix0.g;
                        yh2.K(xq2Var2, pnVar7, valueOf3);
                        ne neVar2 = ix0.h;
                        yh2.F(xq2Var2, neVar2);
                        int i3 = i2;
                        pn pnVar8 = ix0.d;
                        yh2.K(xq2Var2, pnVar8, E4);
                        jg7 jg7Var2 = jg7Var;
                        l26 a4 = k26.a(ju.a, d40Var, xq2Var2, 48);
                        int hashCode4 = Long.hashCode(xq2Var2.T);
                        xv4 l4 = xq2Var2.l();
                        a74 E5 = l.E(xq2Var2, x64Var);
                        xq2Var2.f0();
                        Iterator it2 = it;
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar5, a4);
                        yh2.K(xq2Var2, pnVar6, l4);
                        i61.w(hashCode4, xq2Var2, pnVar7, xq2Var2, neVar2);
                        yh2.K(xq2Var2, pnVar8, E5);
                        int i4 = c46Var.a;
                        if (i4 == 0) {
                            g = "⚡ Быстрый слот";
                        } else {
                            g = lb1.g(i4, "Слот ");
                        }
                        if (z2) {
                            j = es7Var.i;
                        } else {
                            j = es7Var.g;
                        }
                        xq2 xq2Var3 = xq2Var2;
                        x37.b(g, null, j, hi2.E(13), oj2.d0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772544, 0, 130962);
                        xq2 xq2Var4 = xq2Var3;
                        if (z2) {
                            xq2Var4.b0(741308329);
                            f = f3;
                            gi2.h(xq2Var4, dj6.l(x64Var, f));
                            x37.b("(Текущий)", null, es7Var.i, hi2.E(10), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 1575942, 0, 130994);
                            xq2Var4 = xq2Var4;
                            xq2Var4.p(false);
                        } else {
                            f = f3;
                            xq2Var4.b0(741719637);
                            xq2Var4.p(false);
                        }
                        xq2Var4.p(true);
                        boolean z5 = c46Var.b;
                        if (z5) {
                            str = "Перезаписать";
                        } else {
                            str = "Свободно";
                        }
                        if (z5) {
                            j2 = 4294940672L;
                        } else {
                            j2 = 4283215696L;
                        }
                        xq2 xq2Var5 = xq2Var4;
                        x37.b(str, null, hv.c(j2), hi2.E(10), oj2.Z, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var5, 1772544, 0, 130962);
                        xq2Var2 = xq2Var5;
                        xq2Var2.p(true);
                        f3 = f;
                        i2 = i3;
                        jg7Var = jg7Var2;
                        it = it2;
                        f2 = 1.0f;
                    }
                    jg7 jg7Var3 = jg7Var;
                    xq2Var2.p(false);
                    xq2Var2.p(true);
                    gi2.h(xq2Var2, dj6.e(x64Var, 16.0f));
                    xq2 xq2Var6 = xq2Var2;
                    mb3.o(this.R, new cy2(d90.m0), false, null, n16.I(1746545353, new h46(es7Var, 0), xq2Var2), xq2Var6, 805306368, 508);
                    xq2Var6.p(true);
                    return jg7Var3;
                }
                xq2Var.V();
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var2;
                if (xq2Var7.S(intValue2 & 1, z3)) {
                    y16 b = z16.b(16.0f);
                    es7 es7Var2 = this.B;
                    ej2.c(ge7.O(dj6.c(x64Var, 1.0f), 16.0f), b, es7Var2.c, 0L, RecyclerView.B1, n16.I(920008924, new f46(es7Var2, this.L, this.R, this.X, this.Y, 0), xq2Var7), xq2Var7, 1572870, 56);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
        }
    }
}
