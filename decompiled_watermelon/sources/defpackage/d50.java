package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d50  reason: default package */
/* loaded from: classes.dex */
public abstract class d50 {
    public static final d24 a = c(true);
    public static final d24 b = c(false);
    public static final wf c = wf.f;

    public static final void a(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-211209833);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
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
        if (sk2Var.O(i2 & 1, z)) {
            int hashCode = Long.hashCode(sk2Var.T);
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            sm4 l = sk2Var.l();
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, c);
            oo2.S(sk2Var, mu0.e, l);
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g5(zy3Var, i, 2, (byte) 0);
        }
    }

    public static final void b(xn4 xn4Var, yn4 yn4Var, mv3 mv3Var, sd3 sd3Var, int i, int i2, j20 j20Var) {
        c50 c50Var;
        j20 j20Var2;
        j20 j20Var3;
        Object l = mv3Var.l();
        if (l instanceof c50) {
            c50Var = (c50) l;
        } else {
            c50Var = null;
        }
        if (c50Var != null && (j20Var3 = c50Var.j0) != null) {
            j20Var2 = j20Var3;
        } else {
            j20Var2 = j20Var;
        }
        xn4.l(xn4Var, yn4Var, j20Var2.a((yn4Var.A << 32) | (yn4Var.B & 4294967295L), (i << 32) | (i2 & 4294967295L), sd3Var));
    }

    public static final d24 c(boolean z) {
        d24 d24Var = new d24(9);
        j20 j20Var = y60.L;
        d24Var.m(j20Var, new g50(j20Var, z));
        j20 j20Var2 = y60.R;
        d24Var.m(j20Var2, new g50(j20Var2, z));
        j20 j20Var3 = y60.X;
        d24Var.m(j20Var3, new g50(j20Var3, z));
        j20 j20Var4 = y60.Y;
        d24Var.m(j20Var4, new g50(j20Var4, z));
        j20 j20Var5 = y60.Z;
        d24Var.m(j20Var5, new g50(j20Var5, z));
        j20 j20Var6 = y60.c0;
        d24Var.m(j20Var6, new g50(j20Var6, z));
        j20 j20Var7 = y60.d0;
        d24Var.m(j20Var7, new g50(j20Var7, z));
        j20 j20Var8 = y60.e0;
        d24Var.m(j20Var8, new g50(j20Var8, z));
        j20 j20Var9 = y60.f0;
        d24Var.m(j20Var9, new g50(j20Var9, z));
        return d24Var;
    }

    public static final tv3 d(j20 j20Var, boolean z) {
        d24 d24Var;
        if (z) {
            d24Var = a;
        } else {
            d24Var = b;
        }
        tv3 tv3Var = (tv3) d24Var.g(j20Var);
        if (tv3Var == null) {
            return new g50(j20Var, z);
        }
        return tv3Var;
    }
}
