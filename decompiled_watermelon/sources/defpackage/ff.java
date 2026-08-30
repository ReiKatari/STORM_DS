package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public abstract class ff {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(rb4 rb4Var, zy3 zy3Var, long j, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1776202187);
        if (sk2Var.f(rb4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var.f(zy3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        boolean z2 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                i4 = i6 & (-897);
            } else {
                i4 = i6 & (-897);
                j = 9205357640488583168L;
            }
            sk2Var.q();
            int i7 = i4 & 14;
            if (i7 != 4) {
                z2 = false;
            }
            Object L = sk2Var.L();
            if (z2 || L == su0.a) {
                L = new j0(10, rb4Var);
                sk2Var.h0(L);
            }
            se.c(rb4Var, y60.R, ct3.H0(-1653527038, new df(0, j, fz5.a(zy3Var, false, (mi2) L)), sk2Var), sk2Var, i7 | 432);
        } else {
            sk2Var.R();
        }
        long j2 = j;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new h7(rb4Var, zy3Var, j2, i);
        }
    }

    public static final void b(zy3 zy3Var, tu0 tu0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i4 = i | 6;
        } else {
            if (sk2Var.f(zy3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            if (i5 != 0) {
                zy3Var = wy3.a;
            }
            cg2.k(sk2Var, l07.F(o76.i(zy3Var, a, 25.0f), new u4(1, ((xr6) sk2Var.j(yr6.a)).a)));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g5(zy3Var, i, i2);
        }
    }
}
