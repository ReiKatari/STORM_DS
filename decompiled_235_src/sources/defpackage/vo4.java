package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vo4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ vo4(es7 es7Var, on2 on2Var, boolean z, boolean z2, on2 on2Var2) {
        this.A = 2;
        this.R = es7Var;
        this.X = on2Var;
        this.B = z;
        this.L = z2;
        this.Y = on2Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.R;
        switch (i3) {
            case 0:
                boolean z4 = false;
                r94 r94Var = (r94) obj5;
                i17 i17Var = (i17) obj4;
                ke6 ke6Var = (ke6) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z4 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z4)) {
                    d90.F0.i(this.B, this.L, r94Var, i17Var, ke6Var, RecyclerView.B1, RecyclerView.B1, xq2Var, 12582912);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                r94 r94Var2 = (r94) obj5;
                i17 i17Var2 = (i17) obj4;
                ke6 ke6Var2 = (ke6) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    d90.F0.i(this.B, this.L, r94Var2, i17Var2, ke6Var2, RecyclerView.B1, RecyclerView.B1, xq2Var2, 12582912);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                es7 es7Var = (es7) obj5;
                on2 on2Var = (on2) obj4;
                on2 on2Var2 = (on2) obj3;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z2)) {
                    a74 j0 = nc1.j0(dj6.c, nc1.o);
                    c40 c40Var = d90.k0;
                    eu euVar = ju.c;
                    yt0 a = wt0.a(euVar, c40Var, xq2Var3, 0);
                    int hashCode = Long.hashCode(xq2Var3.T);
                    xv4 l = xq2Var3.l();
                    a74 E = l.E(xq2Var3, j0);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var3, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var3, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var3, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var3, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var3, pnVar4, E);
                    x64 x64Var = x64.a;
                    a74 c = dj6.c(x64Var, 1.0f);
                    yt0 a2 = wt0.a(euVar, c40Var, xq2Var3, 0);
                    int hashCode2 = Long.hashCode(xq2Var3.T);
                    xv4 l2 = xq2Var3.l();
                    a74 E2 = l.E(xq2Var3, c);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, a2);
                    yh2.K(xq2Var3, pnVar2, l2);
                    i61.w(hashCode2, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E2);
                    d40 d40Var = d90.i0;
                    a74 Q = ge7.Q(dj6.e(dj6.c(x64Var, 1.0f), 52.0f), 14.0f, RecyclerView.B1, 2);
                    du duVar = ju.a;
                    l26 a3 = k26.a(duVar, d40Var, xq2Var3, 48);
                    int hashCode3 = Long.hashCode(xq2Var3.T);
                    xv4 l3 = xq2Var3.l();
                    a74 E3 = l.E(xq2Var3, Q);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, a3);
                    yh2.K(xq2Var3, pnVar2, l3);
                    i61.w(hashCode3, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E3);
                    js7.a(24.0f, 48, xq2Var3, null);
                    gi2.h(xq2Var3, dj6.l(x64Var, 9.0f));
                    vn3 vn3Var = new vn3(1.0f, true);
                    l26 a4 = k26.a(duVar, d90.h0, xq2Var3, 0);
                    int hashCode4 = Long.hashCode(xq2Var3.T);
                    xv4 l4 = xq2Var3.l();
                    a74 E4 = l.E(xq2Var3, vn3Var);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, a4);
                    yh2.K(xq2Var3, pnVar2, l4);
                    i61.w(hashCode4, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E4);
                    long j = es7Var.g;
                    pi2 pi2Var = qs7.a;
                    long E5 = hi2.E(21);
                    oj2 oj2Var = oj2.e0;
                    x37.b("STORM ", null, j, E5, oj2Var, pi2Var, hi2.D(-0.3d), null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772550, 0, 130834);
                    x37.b("DS", null, hv.c(4278248959L), hi2.E(21), oj2Var, pi2Var, hi2.D(-0.3d), null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772934, 0, 130834);
                    xq2Var3.p(true);
                    ej2.b(on2Var, dj6.i(x64Var, 42.0f), false, n16.I(-1865900195, new d4(es7Var, 4), xq2Var3), xq2Var3, 24624, 12);
                    xq2Var3.p(true);
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), es7Var.f, u24.m), xq2Var3, 0);
                    xq2Var3.p(true);
                    a74 Q2 = ge7.Q(dj6.c(x64Var, 1.0f).d(new vn3(1.0f, true)), 32.0f, RecyclerView.B1, 2);
                    yt0 a5 = wt0.a(ju.d, d90.l0, xq2Var3, 54);
                    int hashCode5 = Long.hashCode(xq2Var3.T);
                    xv4 l5 = xq2Var3.l();
                    a74 E6 = l.E(xq2Var3, Q2);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, a5);
                    yh2.K(xq2Var3, pnVar2, l5);
                    i61.w(hashCode5, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E6);
                    js7.a(76.0f, 48, xq2Var3, null);
                    gi2.h(xq2Var3, dj6.e(x64Var, 24.0f));
                    boolean z5 = this.B;
                    boolean z6 = this.L;
                    if (z5) {
                        i = 462849225;
                        i2 = R.string.system_file_picker_not_found;
                        z3 = false;
                    } else {
                        z3 = false;
                        if (z6) {
                            i = 462977255;
                            i2 = R.string.system_file_picker_not_enabled;
                        } else {
                            i = 463085476;
                            i2 = R.string.no_rom_search_directory_specified;
                        }
                    }
                    x37.b(i61.l(xq2Var3, i, i2, xq2Var3, z3), null, es7Var.h, hi2.E(15), null, qs7.b, 0L, new wz6(3), hi2.E(22), 0, false, 0, 0, null, null, xq2Var3, 1575936, 6, 129458);
                    xq2 xq2Var4 = xq2Var3;
                    if (!z5) {
                        xq2Var4.b0(463496877);
                        gi2.h(xq2Var4, dj6.e(x64Var, 28.0f));
                        y16 b = z16.b(12.0f);
                        pq4 pq4Var = k90.a;
                        mb3.a(on2Var2, dj6.e(x64Var, 48.0f), false, null, b, null, k90.a(hv.c(4278248959L), kt0.b, xq2Var4, 54, 12), null, n16.I(-1906517473, new ao3(z6, 1), xq2Var4), xq2Var4, 805306416, 348);
                        xq2Var4 = xq2Var4;
                        xq2Var4.p(false);
                    } else {
                        xq2Var4.b0(464789422);
                        xq2Var4.p(false);
                    }
                    xq2Var4.p(true);
                    xq2Var4.p(true);
                    return jg7Var;
                }
                xq2Var3.V();
                return jg7Var;
        }
    }

    public /* synthetic */ vo4(boolean z, boolean z2, r94 r94Var, i17 i17Var, ke6 ke6Var, int i) {
        this.A = i;
        this.B = z;
        this.L = z2;
        this.R = r94Var;
        this.X = i17Var;
        this.Y = ke6Var;
    }
}
