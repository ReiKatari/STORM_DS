package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n41  reason: default package */
/* loaded from: classes.dex */
public abstract class n41 {
    public static final i41 a;

    static {
        y86 y86Var = y86.Inherit;
        py0 py0Var = ak.a;
        y86 y86Var2 = y86.Inherit;
        y86 y86Var3 = y86.Inherit;
        long j = kt0.d;
        long j2 = kt0.b;
        a = new i41(j, j2, j2, kt0.c(0.38f, j2), kt0.c(0.38f, j2));
    }

    public static final void a(i41 i41Var, a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-527864079);
        if ((i & 6) == 0) {
            if (xq2Var.f(i41Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            d40 d40Var = l41.a;
            a74 W = nb3.W(ge7.Q(g04.Y(vy7.L(nj2.E(a74Var, 3.0f, z16.b(4.0f), false, 0L, 28), i41Var.a, u24.m), gb3.Max), RecyclerView.B1, l41.d, 1), nb3.U(xq2Var), true);
            int i6 = (i2 << 3) & 7168;
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, W);
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
            zv0Var.e(zt0.a, xq2Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(i41Var, a74Var, zv0Var, i, 6);
        }
    }

    public static final void b(a74 a74Var, i41 i41Var, qn2 qn2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else {
            if (xq2Var.f(a74Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i6 = i4 | 48;
        } else {
            if (xq2Var.f(i41Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i4 | i5;
        }
        if (xq2Var.h(qn2Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            if (i8 != 0) {
                a74Var = x64.a;
            }
            if (i9 != 0) {
                i41Var = a;
            }
            a(i41Var, a74Var, n16.I(-250345048, new l4(3, qn2Var, i41Var), xq2Var), xq2Var, ((i10 << 3) & 112) | ((i10 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            xq2Var.V();
        }
        a74 a74Var2 = a74Var;
        i41 i41Var2 = i41Var;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(a74Var2, i41Var2, qn2Var, i, i2, 5);
        }
    }

    public static final void c(final String str, final boolean z, final i41 i41Var, final a74 a74Var, final fo2 fo2Var, final on2 on2Var, px0 px0Var, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2001167027);
        if ((i & 6) == 0) {
            if (xq2Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(i41Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.h(fo2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i2 & 1, z2)) {
            d40 d40Var = l41.a;
            float f = l41.c;
            gu guVar = new gu(f, true, new i(1));
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object P = xq2Var.P();
            if (z5 || P == ox0.a) {
                P = new sz0(z, on2Var, 1);
                xq2Var.l0(P);
            }
            a74 Q = ge7.Q(dj6.k(dj6.c(mb3.u(a74Var, z, str, (on2) P, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, RecyclerView.B1, 2);
            l26 a2 = k26.a(guVar, d40Var, xq2Var, 54);
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
            if (fo2Var == null) {
                xq2Var.b0(-1597947094);
                xq2Var.p(false);
                i3 = i2;
            } else {
                xq2Var.b0(-1597947093);
                float f2 = l41.e;
                a74 h = dj6.h(x64.a, f2, RecyclerView.B1, f2, f2, 2);
                e34 d = h70.d(d90.L, false);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, h);
                xq2Var.f0();
                i3 = i2;
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d);
                yh2.K(xq2Var, pnVar2, l2);
                i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E2);
                if (z) {
                    j = i41Var.c;
                } else {
                    j = i41Var.e;
                }
                fo2Var.e(new kt0(j), xq2Var, 0);
                xq2Var.p(true);
                xq2Var.p(false);
            }
            if (z) {
                j2 = i41Var.b;
            } else {
                j2 = i41Var.d;
            }
            long j3 = j2;
            jw2.b(str, new vn3(1.0f, true), new s47(j3, l41.h, l41.i, l41.k, 0L, l41.b, l41.j, 16613240), null, 0, false, 1, 0, null, xq2Var, (i3 & 14) | 1572864, 952);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: m41
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n41.c(str, z, i41Var, a74Var, fo2Var, on2Var, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }
}
