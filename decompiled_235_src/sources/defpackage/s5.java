package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s5  reason: default package */
/* loaded from: classes.dex */
public final class s5 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ Object L;

    public /* synthetic */ s5(List list, Object obj, int i) {
        this.A = i;
        this.B = list;
        this.L = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0225  */
    @Override // defpackage.go2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        e33 e33Var;
        File file;
        long j;
        int i4;
        int i5 = this.A;
        jg7 jg7Var = jg7.a;
        x64 x64Var = x64.a;
        List list = this.B;
        int i6 = 4;
        Object obj5 = this.L;
        switch (i5) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (!((xq2) px0Var).f(lp3Var)) {
                        i6 = 2;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var).d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    ta5 ta5Var = (ta5) list.get(intValue);
                    xq2Var.b0(-822009669);
                    a74 c = dj6.c(x64Var, 1.0f);
                    boolean h = xq2Var.h(ta5Var);
                    Object P = xq2Var.P();
                    if (h || P == ox0.a) {
                        P = new i5(1, ta5Var, (qa4) obj5);
                        xq2Var.l0(P);
                    }
                    nc1.p(c, ta5Var, (on2) P, xq2Var, 6);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var2 = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                es7 es7Var = (es7) obj5;
                if ((intValue4 & 6) == 0) {
                    if (!((xq2) px0Var2).f(lp3Var2)) {
                        i6 = 2;
                    }
                    i3 = intValue4 | i6;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i3 & 1, z2)) {
                    File file2 = (File) list.get(intValue3);
                    xq2Var2.b0(-1998629223);
                    d40 d40Var = d90.i0;
                    a74 O = ge7.O(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(8.0f)), es7Var.d, u24.m), 12.0f);
                    l26 a = k26.a(ju.a, d40Var, xq2Var2, 48);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    if (file2.isDirectory()) {
                        e33Var = hi2.A();
                    } else {
                        e33Var = g04.n;
                        if (e33Var == null) {
                            d33 d33Var = new d33("Filled.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i7 = el7.a;
                            cn6 cn6Var = new cn6(kt0.b);
                            ww2 ww2Var = new ww2(1, (byte) 0);
                            ww2Var.o(14.0f, 2.0f);
                            ww2Var.m(6.0f, 2.0f);
                            ww2Var.i(-1.1f, RecyclerView.B1, -1.99f, 0.9f, -1.99f, 2.0f);
                            ww2Var.m(4.0f, 20.0f);
                            ww2Var.i(RecyclerView.B1, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                            ww2Var.m(18.0f, 22.0f);
                            ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                            ww2Var.m(20.0f, 8.0f);
                            ww2Var.n(-6.0f, -6.0f);
                            ww2Var.g();
                            file = file2;
                            ww2Var.o(16.0f, 18.0f);
                            ww2Var.m(8.0f, 18.0f);
                            ww2Var.u(-2.0f);
                            ww2Var.l(8.0f);
                            ww2Var.u(2.0f);
                            ww2Var.g();
                            ww2Var.o(16.0f, 14.0f);
                            ww2Var.m(8.0f, 14.0f);
                            ww2Var.u(-2.0f);
                            ww2Var.l(8.0f);
                            ww2Var.u(2.0f);
                            ww2Var.g();
                            ww2Var.o(13.0f, 9.0f);
                            ww2Var.m(13.0f, 3.5f);
                            ww2Var.m(18.5f, 9.0f);
                            ww2Var.m(13.0f, 9.0f);
                            ww2Var.g();
                            d33.a(d33Var, ww2Var.b, 0, cn6Var);
                            e33 b = d33Var.b();
                            g04.n = b;
                            e33Var = b;
                            e33 e33Var2 = e33Var;
                            if (!file.isDirectory()) {
                                j = es7Var.j;
                            } else {
                                j = es7Var.h;
                            }
                            i13.a(e33Var2, null, dj6.i(x64Var, 24.0f), j, xq2Var2, 432, 0);
                            gi2.h(xq2Var2, dj6.l(x64Var, 12.0f));
                            vn3 vn3Var = new vn3(1.0f, true);
                            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                            int hashCode2 = Long.hashCode(xq2Var2.T);
                            xv4 l2 = xq2Var2.l();
                            a74 E2 = l.E(xq2Var2, vn3Var);
                            xq2Var2.f0();
                            if (!xq2Var2.S) {
                                xq2Var2.k(iy0Var);
                            } else {
                                xq2Var2.o0();
                            }
                            yh2.K(xq2Var2, pnVar, a2);
                            yh2.K(xq2Var2, pnVar2, l2);
                            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                            yh2.K(xq2Var2, pnVar4, E2);
                            String name = file.getName();
                            name.getClass();
                            x37.b(name, null, es7Var.g, hi2.E(13), oj2.Z, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
                            x37.b((file.length() / 1024) + " KB", null, es7Var.i, hi2.E(10), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575936, 0, 130994);
                            i61.y(xq2Var2, true, true, false);
                        }
                    }
                    file = file2;
                    e33 e33Var22 = e33Var;
                    if (!file.isDirectory()) {
                    }
                    i13.a(e33Var22, null, dj6.i(x64Var, 24.0f), j, xq2Var2, 432, 0);
                    gi2.h(xq2Var2, dj6.l(x64Var, 12.0f));
                    vn3 vn3Var2 = new vn3(1.0f, true);
                    yt0 a22 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                    int hashCode22 = Long.hashCode(xq2Var2.T);
                    xv4 l22 = xq2Var2.l();
                    a74 E22 = l.E(xq2Var2, vn3Var2);
                    xq2Var2.f0();
                    if (!xq2Var2.S) {
                    }
                    yh2.K(xq2Var2, pnVar, a22);
                    yh2.K(xq2Var2, pnVar2, l22);
                    i61.w(hashCode22, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E22);
                    String name2 = file.getName();
                    name2.getClass();
                    x37.b(name2, null, es7Var.g, hi2.E(13), oj2.Z, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
                    x37.b((file.length() / 1024) + " KB", null, es7Var.i, hi2.E(10), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575936, 0, 130994);
                    i61.y(xq2Var2, true, true, false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
