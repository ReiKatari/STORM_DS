package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf  reason: default package */
/* loaded from: classes.dex */
public abstract class vf {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(ok4 ok4Var, a74 a74Var, long j, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1776202187);
        if (xq2Var.f(ok4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i6 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i4 = i6 & (-897);
            } else {
                i4 = i6 & (-897);
                j = 9205357640488583168L;
            }
            xq2Var.q();
            int i7 = i4 & 14;
            if (i7 != 4) {
                z2 = false;
            }
            Object P = xq2Var.P();
            if (z2 || P == ox0.a) {
                P = new k0(ok4Var, 10);
                xq2Var.l0(P);
            }
            mb3.h(ok4Var, d90.R, n16.I(-1653527038, new tf(ua6.a(a74Var, false, (qn2) P), j, 0), xq2Var), xq2Var, i7 | 432);
        } else {
            xq2Var.V();
        }
        long j2 = j;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i7(ok4Var, a74Var, j2, i);
        }
    }

    public static final void b(a74 a74Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i4 = i | 6;
        } else {
            if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i4 & 1, z)) {
            if (i5 != 0) {
                a74Var = x64.a;
            }
            gi2.h(xq2Var, q60.x(dj6.j(a74Var, a, 25.0f), new t4(1, ((m47) xq2Var.j(n47.a)).a)));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new f5(a74Var, i, i2);
        }
    }
}
