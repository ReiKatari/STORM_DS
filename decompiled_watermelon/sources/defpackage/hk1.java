package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk1 */
/* loaded from: classes.dex */
public interface hk1 extends od1 {
    static long E0(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    static /* synthetic */ void J(hk1 hk1Var, long j, float f, long j2, ik1 ik1Var, int i) {
        if ((i & 4) != 0) {
            j2 = hk1Var.f0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            ik1Var = r72.a;
        }
        hk1Var.u0(j, f, j3, ik1Var);
    }

    static void M(xf3 xf3Var, b60 b60Var, long j, long j2, long j3, ik1 ik1Var, int i) {
        long j4;
        r72 r72Var;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j4 = E0(xf3Var.A.d(), j5);
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            r72Var = r72.a;
        } else {
            r72Var = ik1Var;
        }
        xf3Var.e(b60Var, j5, j4, j3, 1.0f, r72Var);
    }

    static /* synthetic */ void W(hk1 hk1Var, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        hk1Var.d0(j, j2, j3, f, i3);
    }

    static void a0(hk1 hk1Var, nh nhVar, long j, long j2, float f, b30 b30Var, int i, int i2) {
        long j3;
        float f2;
        int i3;
        if ((i2 & 16) != 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        hk1Var.X(nhVar, 0L, j, j3, f2, b30Var, i3);
    }

    static /* synthetic */ void h0(hk1 hk1Var, long j, float f, float f2, long j2, long j3, float f3, hh6 hh6Var, int i) {
        float f4;
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        hk1Var.G(j, f, f2, j2, j3, f4, hh6Var);
    }

    static /* synthetic */ void q(hk1 hk1Var, long j, long j2, float f, hh6 hh6Var, int i) {
        float f2;
        r72 r72Var;
        int i2;
        if ((i & 4) != 0) {
            j2 = E0(hk1Var.d(), 0L);
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            r72Var = r72.a;
        } else {
            r72Var = hh6Var;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hk1Var.F(j, 0L, j3, f2, r72Var, i2);
    }

    static /* synthetic */ void u(hk1 hk1Var, long j, long j2, long j3, long j4, float f, int i) {
        float f2;
        if ((i & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        hk1Var.A(j, j2, j3, j4, r72.a, f2);
    }

    static /* synthetic */ void x(hk1 hk1Var, vi viVar, b60 b60Var, float f, hh6 hh6Var, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        r72 r72Var = hh6Var;
        if ((i & 8) != 0) {
            r72Var = r72.a;
        }
        ik1 ik1Var = r72Var;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hk1Var.i(viVar, b60Var, f2, ik1Var, i2);
    }

    static /* synthetic */ void y0(hk1 hk1Var, b60 b60Var, long j, long j2, float f, ik1 ik1Var, int i) {
        long j3;
        float f2;
        r72 r72Var;
        int i2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j3 = E0(hk1Var.d(), j4);
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            r72Var = r72.a;
        } else {
            r72Var = ik1Var;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 6;
        }
        hk1Var.g(b60Var, j4, j3, f2, r72Var, i2);
    }

    void A(long j, long j2, long j3, long j4, ik1 ik1Var, float f);

    void F(long j, long j2, long j3, float f, ik1 ik1Var, int i);

    void G(long j, float f, float f2, long j2, long j3, float f3, hh6 hh6Var);

    os I();

    void S(long j, long j2, long j3, ik1 ik1Var);

    void U(ArrayList arrayList, long j, float f);

    void X(nh nhVar, long j, long j2, long j3, float f, b30 b30Var, int i);

    default long d() {
        return I().E();
    }

    void d0(long j, long j2, long j3, float f, int i);

    default long f0() {
        return mj2.y(I().E());
    }

    void g(b60 b60Var, long j, long j2, float f, ik1 ik1Var, int i);

    sd3 getLayoutDirection();

    void i(vi viVar, b60 b60Var, float f, ik1 ik1Var, int i);

    void j(vi viVar, long j, float f, ik1 ik1Var);

    void u0(long j, float f, long j2, ik1 ik1Var);
}
