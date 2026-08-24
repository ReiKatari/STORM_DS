package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ h5(int i, on2 on2Var) {
        this.A = i;
        this.B = on2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 P = ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 24.0f);
                    yt0 a = wt0.a(new gu(16.0f, true, new i(1)), d90.l0, xq2Var, 54);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, P);
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
                    x37.b(yh2.O(xq2Var, R.string.leaderboard_ranking_load_failed), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, ((xe7) xq2Var.j(ye7.b)).j, xq2Var, 0, 0, 65022);
                    mb3.a(this.B, null, false, null, null, null, mb3.I(xq2Var), null, f04.e, xq2Var, 805306368, 382);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                ((Integer) obj3).intValue();
                ((jo) obj).getClass();
                vy7.e(this.B, (px0) obj2, 0);
                return jg7Var;
            case 2:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    mb3.o(this.B, null, false, null, n16.c, xq2Var2, 805306368, 510);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z)) {
                    gi2.h(xq2Var3, dj6.e(x64Var, 8.0f));
                    a74 c = dj6.c(x64Var, 1.0f);
                    y16 b = z16.b(8.0f);
                    zv0 zv0Var = mb3.q;
                    float f = k90.d;
                    nq6 nq6Var = vt0.a;
                    c60 c60Var = new c60(f, new cn6(kt0.c(0.12f, ((ut0) xq2Var3.j(nq6Var)).f())));
                    long j = ((ut0) xq2Var3.j(nq6Var)).j();
                    long g = ((ut0) xq2Var3.j(nq6Var)).g();
                    long f2 = ((ut0) xq2Var3.j(nq6Var)).f();
                    long j2 = ((kt0) xq2Var3.j(j31.a)).a;
                    if (((ut0) xq2Var3.j(nq6Var)).k()) {
                        hv.N(j2);
                    } else {
                        hv.N(j2);
                    }
                    mb3.a(this.B, c, true, null, b, c60Var, new bd1(j, g, j, kt0.c(0.38f, f2)), k90.a, zv0Var, xq2Var3, 805306416, 0);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
