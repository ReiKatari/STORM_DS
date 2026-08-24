package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd5  reason: default package */
/* loaded from: classes.dex */
public abstract class kd5 {
    public static final float a = 20.0f / 2.0f;

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z, on2 on2Var, a74 a74Var, boolean z2, ve1 ve1Var, px0 px0Var, int i, int i2) {
        int i3;
        ve1 ve1Var2;
        int i4;
        int i5;
        boolean z3;
        xq2 xq2Var;
        boolean z4;
        ve1 ve1Var3;
        a74 a74Var2;
        cf5 t;
        a74 a74Var3;
        ve1 ve1Var4;
        float f;
        boolean z5;
        long j;
        Object b0;
        boolean z6;
        a74 a74Var4;
        int i6;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1314435585);
        if (xq2Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        if ((i & 48) == 0) {
            if (xq2Var2.h(on2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        int i8 = i7 | 28032;
        if ((i2 & 32) == 0) {
            ve1Var2 = ve1Var;
            if (xq2Var2.f(ve1Var2)) {
                i4 = 131072;
                i5 = i8 | i4;
                boolean z7 = true;
                if ((74899 & i5) == 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!xq2Var2.S(i5 & 1, z3)) {
                    xq2Var2.X();
                    int i9 = i & 1;
                    a74 a74Var5 = x64.a;
                    if (i9 != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        a74Var3 = a74Var;
                        z7 = z2;
                        ve1Var4 = ve1Var2;
                        xq2Var = xq2Var2;
                    } else {
                        if ((i2 & 32) != 0) {
                            xq2Var = xq2Var2;
                            ve1Var2 = jx2.n(0L, 0L, xq2Var, 3072, 7);
                        } else {
                            xq2Var = xq2Var2;
                        }
                        a74Var3 = a74Var5;
                        ve1Var4 = ve1Var2;
                    }
                    xq2Var.q();
                    if (z) {
                        f = 6.0f;
                    } else {
                        f = RecyclerView.B1;
                    }
                    pp6 a2 = in.a(f, ge7.Y(100, 0, null, 6), xq2Var, 48, 12);
                    ve1Var4.getClass();
                    xq2Var.b0(1243421834);
                    if (!z7) {
                        z5 = z7;
                        j = ve1Var4.c;
                    } else {
                        z5 = z7;
                        if (!z) {
                            j = ve1Var4.b;
                        } else {
                            j = ve1Var4.a;
                        }
                    }
                    if (z5) {
                        xq2Var.b0(-1312667467);
                        xq2 xq2Var3 = xq2Var;
                        b0 = ti6.a(j, ge7.Y(100, 0, null, 6), xq2Var3, 48, 12);
                        xq2Var = xq2Var3;
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-1312564764);
                        b0 = np2.b0(new kt0(j), xq2Var);
                        xq2Var.p(false);
                    }
                    Object obj = b0;
                    xq2Var.p(false);
                    if (on2Var != null) {
                        z6 = z5;
                        a74Var4 = g04.O(a74Var5, z, jq5.a(4, 0L, false), z6, new mq5(3), on2Var);
                    } else {
                        z6 = z5;
                        a74Var4 = a74Var5;
                    }
                    if (on2Var != null) {
                        nq6 nq6Var = u93.a;
                        a74Var5 = m64.a;
                    }
                    a74 g = dj6.g(ge7.O(dj6.n(a74Var3.d(a74Var5).d(a74Var4), d90.Z, 2), 2.0f));
                    boolean f2 = xq2Var.f(obj) | xq2Var.f(a2);
                    Object P = xq2Var.P();
                    if (f2 || P == ox0.a) {
                        P = new qk4(7, obj, a2);
                        xq2Var.l0(P);
                    }
                    ak7.j(g, (qn2) P, xq2Var, 0);
                    z4 = z6;
                    a74Var2 = a74Var3;
                    ve1Var3 = ve1Var4;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    z4 = z2;
                    ve1Var3 = ve1Var2;
                    a74Var2 = a74Var;
                }
                t = xq2Var.t();
                if (t == null) {
                    t.d = new jd5(z, on2Var, a74Var2, z4, ve1Var3, i, i2, 0);
                    return;
                }
                return;
            }
        } else {
            ve1Var2 = ve1Var;
        }
        i4 = 65536;
        i5 = i8 | i4;
        boolean z72 = true;
        if ((74899 & i5) == 74898) {
        }
        if (!xq2Var2.S(i5 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }
}
