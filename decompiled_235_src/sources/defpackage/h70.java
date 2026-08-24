package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h70  reason: default package */
/* loaded from: classes.dex */
public abstract class h70 {
    public static final ja4 a = c(true);
    public static final ja4 b = c(false);
    public static final fc c = fc.g;

    public static final void a(a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-211209833);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            int hashCode = Long.hashCode(xq2Var.T);
            a74 E = l.E(xq2Var, a74Var);
            xv4 l = xq2Var.l();
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, c);
            yh2.K(xq2Var, ix0.e, l);
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new f5(a74Var, i, 2, (byte) 0);
        }
    }

    public static final void b(cx4 cx4Var, dx4 dx4Var, x24 x24Var, kk3 kk3Var, int i, int i2, e40 e40Var) {
        g70 g70Var;
        e40 e40Var2;
        e40 e40Var3;
        Object B = x24Var.B();
        if (B instanceof g70) {
            g70Var = (g70) B;
        } else {
            g70Var = null;
        }
        if (g70Var != null && (e40Var3 = g70Var.k0) != null) {
            e40Var2 = e40Var3;
        } else {
            e40Var2 = e40Var;
        }
        cx4.k(cx4Var, dx4Var, e40Var2.a((dx4Var.A << 32) | (dx4Var.B & 4294967295L), (i << 32) | (i2 & 4294967295L), kk3Var));
    }

    public static final ja4 c(boolean z) {
        ja4 ja4Var = new ja4(9);
        e40 e40Var = d90.L;
        ja4Var.m(e40Var, new k70(e40Var, z));
        e40 e40Var2 = d90.R;
        ja4Var.m(e40Var2, new k70(e40Var2, z));
        e40 e40Var3 = d90.X;
        ja4Var.m(e40Var3, new k70(e40Var3, z));
        e40 e40Var4 = d90.Y;
        ja4Var.m(e40Var4, new k70(e40Var4, z));
        e40 e40Var5 = d90.Z;
        ja4Var.m(e40Var5, new k70(e40Var5, z));
        e40 e40Var6 = d90.d0;
        ja4Var.m(e40Var6, new k70(e40Var6, z));
        e40 e40Var7 = d90.e0;
        ja4Var.m(e40Var7, new k70(e40Var7, z));
        e40 e40Var8 = d90.f0;
        ja4Var.m(e40Var8, new k70(e40Var8, z));
        e40 e40Var9 = d90.g0;
        ja4Var.m(e40Var9, new k70(e40Var9, z));
        return ja4Var;
    }

    public static final e34 d(e40 e40Var, boolean z) {
        ja4 ja4Var;
        if (z) {
            ja4Var = a;
        } else {
            ja4Var = b;
        }
        e34 e34Var = (e34) ja4Var.g(e40Var);
        if (e34Var == null) {
            return new k70(e40Var, z);
        }
        return e34Var;
    }
}
