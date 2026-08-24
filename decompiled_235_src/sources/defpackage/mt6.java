package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt6  reason: default package */
/* loaded from: classes.dex */
public abstract class mt6 {
    public static final jd1 a = new jd1(25);
    public static final Object b = new Object();

    public static final void a(a74 a74Var, eo2 eo2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            if (i6 != 0) {
                a74Var = x64.a;
            }
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new pt6(cs1.h0);
                xq2Var.l0(P);
            }
            b((pt6) P, a74Var, eo2Var, xq2Var, (i3 << 3) & 1008);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new kt6(a74Var, eo2Var, i, i2);
        }
    }

    public static final void b(pt6 pt6Var, a74 a74Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-511989831);
        if ((i & 6) == 0) {
            if (xq2Var.h(pt6Var)) {
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
            if (xq2Var.h(eo2Var)) {
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
            int hashCode = Long.hashCode(xq2Var.T);
            vq2 T = ge7.T(xq2Var);
            a74 E = l.E(xq2Var, a74Var);
            xv4 l = xq2Var.l();
            iy0 iy0Var = iy0.i0;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pt6Var.c, pt6Var);
            yh2.K(xq2Var, pt6Var.d, T);
            yh2.K(xq2Var, pt6Var.e, eo2Var);
            jx0.i.getClass();
            yh2.K(xq2Var, ix0.e, l);
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            xq2Var.p(true);
            if (!xq2Var.E()) {
                xq2Var.b0(-1259245908);
                boolean h = xq2Var.h(pt6Var);
                Object P = xq2Var.P();
                if (h || P == ox0.a) {
                    P = new pj(pt6Var, 18);
                    xq2Var.l0(P);
                }
                mb3.n((on2) P, xq2Var);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1259187287);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new lt6(pt6Var, a74Var, eo2Var, i);
        }
    }
}
