package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt5  reason: default package */
/* loaded from: classes.dex */
public abstract class lt5 {
    public static final py0 a = new py0(new kt5(0));

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, boolean z, boolean z2, on2 on2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        boolean z7;
        xq2 xq2Var;
        cf5 t;
        boolean z8;
        boolean z9;
        boolean z10;
        qa4 qa4Var;
        ?? r0;
        la laVar;
        x64 x64Var;
        a74 a74Var;
        float f;
        str.getClass();
        str2.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-101028403);
        if (xq2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i3 | i;
        if (xq2Var2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        int i12 = i2 & 4;
        if (i12 != 0) {
            i6 = i11 | RendererDebugBridge.CAPTURE_HEIGHT;
            z3 = z;
        } else {
            z3 = z;
            if (xq2Var2.g(z3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i6 = i11 | i5;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            if (xq2Var2.g(z4)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
            if (!xq2Var2.h(on2Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i9 = i6 | i8;
            if ((i9 & 9363) == 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!xq2Var2.S(i9 & 1, z5)) {
                if (i12 != 0) {
                    z3 = true;
                }
                if (i13 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                es7 F = bl2.F(xq2Var2);
                Object P = xq2Var2.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = i61.f(xq2Var2);
                }
                r94 r94Var = (r94) P;
                qa4 a2 = bw7.a(r94Var, xq2Var2, 6);
                eo2 eo2Var = (eo2) xq2Var2.j(a);
                Boolean bool = (Boolean) a2.getValue();
                bool.getClass();
                boolean f2 = xq2Var2.f(a2) | xq2Var2.f(eo2Var);
                int i14 = i9 & 14;
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z11 = f2 | z9;
                if ((i9 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z11 | z10;
                Object P2 = xq2Var2.P();
                if (z12 || P2 == vs0Var) {
                    qa4Var = a2;
                    r0 = 0;
                    la laVar2 = new la(eo2Var, str, str2, qa4Var, null, 8);
                    xq2Var2.l0(laVar2);
                    laVar = laVar2;
                } else {
                    laVar = P2;
                    qa4Var = a2;
                    r0 = 0;
                }
                mb3.i(xq2Var2, (eo2) laVar, bool);
                if (z8) {
                    xq2Var2.b0(1035455661);
                    is7.d(xq2Var2, r0);
                    xq2Var2.p(r0);
                } else {
                    xq2Var2.b0(1035494101);
                    xq2Var2.p(r0);
                }
                y16 b = z16.b(8.0f);
                x64 x64Var2 = x64.a;
                a74 g = u24.g(dj6.c(x64Var2, 1.0f), b);
                if (((Boolean) qa4Var.getValue()).booleanValue()) {
                    x64Var = x64Var2;
                    a74Var = ak7.I(vy7.L(x64Var2, F.e, u24.m), 2.0f, F.j, b);
                } else {
                    x64Var = x64Var2;
                    a74Var = x64Var;
                }
                a74 d = g.d(a74Var);
                if (z3) {
                    d = mb3.t(d, r94Var, null, false, null, on2Var, 28);
                }
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.45f;
                }
                a74 P3 = ge7.P(dj6.f(jw2.j(d, f), 48.0f, RecyclerView.B1, 2), 15.0f, 13.0f);
                d40 d40Var = d90.i0;
                du duVar = ju.a;
                l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
                int hashCode = Long.hashCode(xq2Var2.T);
                xv4 l = xq2Var2.l();
                a74 E = l.E(xq2Var2, P3);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                pn pnVar = ix0.f;
                yh2.K(xq2Var2, pnVar, a3);
                pn pnVar2 = ix0.e;
                yh2.K(xq2Var2, pnVar2, l);
                Integer valueOf = Integer.valueOf(hashCode);
                pn pnVar3 = ix0.g;
                yh2.K(xq2Var2, pnVar3, valueOf);
                ne neVar = ix0.h;
                yh2.F(xq2Var2, neVar);
                pn pnVar4 = ix0.d;
                yh2.K(xq2Var2, pnVar4, E);
                boolean z13 = z8;
                boolean z14 = z3;
                x37.b(str, new vn3(1.0f, true), F.g, hi2.D(13.5d), oj2.Z, null, 0L, null, hi2.E(17), 2, false, 2, 0, null, null, xq2Var2, i14 | 199680, 3126, 119760);
                x64 x64Var3 = x64Var;
                gi2.h(xq2Var2, dj6.l(x64Var3, 12.0f));
                a74 m = dj6.m(200.0f, 1, x64Var3);
                l26 a4 = k26.a(duVar, d40Var, xq2Var2, 48);
                int hashCode2 = Long.hashCode(xq2Var2.T);
                xv4 l2 = xq2Var2.l();
                a74 E2 = l.E(xq2Var2, m);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar, a4);
                yh2.K(xq2Var2, pnVar2, l2);
                i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E2);
                x37.b(str2, null, F.h, hi2.D(12.5d), null, null, 0L, new wz6(6), hi2.E(15), 2, false, 2, 0, null, null, xq2Var2, ((i9 >> 3) & 14) | 3072, 3126, 119282);
                xq2 xq2Var3 = xq2Var2;
                i13.a(mp2.J(), null, ge7.S(dj6.i(x64Var3, 17.0f), 1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), F.i, xq2Var3, 432, 0);
                xq2Var3.p(true);
                xq2Var3.p(true);
                z7 = z13;
                z6 = z14;
                xq2Var = xq2Var3;
            } else {
                xq2Var2.V();
                z6 = z3;
                z7 = z4;
                xq2Var = xq2Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new jd5(str, str2, z6, z7, on2Var, i, i2);
                return;
            }
            return;
        }
        z4 = z2;
        if (!xq2Var2.h(on2Var)) {
        }
        i9 = i6 | i8;
        if ((i9 & 9363) == 9362) {
        }
        if (!xq2Var2.S(i9 & 1, z5)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void b(String str, a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        a74 a74Var2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1065174758);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74Var2 = x64.a;
            a74 Q = ge7.Q(dj6.c(a74Var2, 1.0f), 16.0f, RecyclerView.B1, 2);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, Q);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            if (str != null) {
                xq2Var.b0(-762688195);
                is7.e(str, null, xq2Var, i3 & 14);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-762629698);
                gi2.h(xq2Var, dj6.i(a74Var2, 12.0f));
                xq2Var.p(false);
            }
            is7.c(null, zv0Var, xq2Var, 48);
            xq2Var.p(true);
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(str, a74Var2, zv0Var, i, 28);
        }
    }

    public static final void c(String str, boolean z, boolean z2, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        str.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1706892854);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 48;
        if (xq2Var.g(z)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3 | 27648;
        if (xq2Var.h(qn2Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i7 = i6 | i4;
        if ((74899 & i7) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i7 & 1, z3)) {
            es7 F = bl2.F(xq2Var);
            xq2Var.b0(1927471948);
            xq2Var.p(false);
            xq2Var.b0(-353462893);
            x64 x64Var = x64.a;
            a74 c = dj6.c(x64Var, 1.0f);
            xq2Var.b0(17548395);
            if ((458752 & i7) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i7 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = z6 | z5;
            Object P = xq2Var.P();
            if (z7 || P == ox0.a) {
                P = new q01(qn2Var, z, 1);
                xq2Var.l0(P);
            }
            a74 u = mb3.u(c, false, null, (on2) P, 15);
            xq2Var.p(false);
            xq2Var.p(false);
            a74 P2 = ge7.P(dj6.f(jw2.j(u, 1.0f), 48.0f, RecyclerView.B1, 2), 15.0f, 13.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, P2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(ju.d, d90.k0, xq2Var, 6);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, F.g, hi2.D(13.5d), oj2.Z, null, 0L, null, hi2.E(17), 2, false, 2, 0, null, null, xq2Var, (i7 & 14) | 199680, 3126, 119762);
            xq2Var = xq2Var;
            xq2Var.b0(1548234674);
            xq2Var.p(false);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 16.0f));
            z4 = true;
            is7.f(z, qn2Var, null, true, xq2Var, ((i7 >> 6) & 14) | 3072, 4);
            xq2Var.p(true);
        } else {
            xq2Var.V();
            z4 = z2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new xf4(str, z, z4, qn2Var, i);
        }
    }
}
