package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no1 */
/* loaded from: classes.dex */
public interface no1 extends qh1 {
    static /* synthetic */ void B0(no1 no1Var, hj hjVar, long j, float f, ys6 ys6Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        kc2 kc2Var = ys6Var;
        if ((i & 8) != 0) {
            kc2Var = kc2.a;
        }
        no1Var.h(hjVar, j, f2, kc2Var);
    }

    static /* synthetic */ void D0(no1 no1Var, f80 f80Var, long j, long j2, float f, oo1 oo1Var, int i) {
        long j3;
        float f2;
        kc2 kc2Var;
        int i2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j3 = U(no1Var.e(), j4);
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            kc2Var = kc2.a;
        } else {
            kc2Var = oo1Var;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 6;
        }
        no1Var.W(f80Var, j4, j3, f2, kc2Var, i2);
    }

    static /* synthetic */ void E(no1 no1Var, long j, float f, float f2, long j2, long j3, float f3, ys6 ys6Var, int i) {
        float f4;
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        no1Var.g0(j, f, f2, j2, j3, f4, ys6Var);
    }

    static /* synthetic */ void E0(no1 no1Var, f80 f80Var, long j, long j2, long j3, oo1 oo1Var, int i) {
        long j4;
        kc2 kc2Var;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j4 = U(no1Var.e(), j5);
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            kc2Var = kc2.a;
        } else {
            kc2Var = oo1Var;
        }
        no1Var.c0(f80Var, j5, j4, j3, 1.0f, kc2Var);
    }

    static /* synthetic */ void F(no1 no1Var, long j, long j2, long j3, float f, ys6 ys6Var, int i) {
        long j4;
        long j5;
        float f2;
        kc2 kc2Var;
        int i2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = U(no1Var.e(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            kc2Var = kc2.a;
        } else {
            kc2Var = ys6Var;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        no1Var.s(j, j4, j5, f2, kc2Var, i2);
    }

    static long U(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    static /* synthetic */ void b0(no1 no1Var, hj hjVar, f80 f80Var, float f, ys6 ys6Var, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        kc2 kc2Var = ys6Var;
        if ((i & 8) != 0) {
            kc2Var = kc2.a;
        }
        oo1 oo1Var = kc2Var;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        no1Var.g(hjVar, f80Var, f2, oo1Var, i2);
    }

    static /* synthetic */ void j0(no1 no1Var, long j, float f, long j2, oo1 oo1Var, int i) {
        if ((i & 4) != 0) {
            j2 = no1Var.t0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            oo1Var = kc2.a;
        }
        no1Var.L(j, f, j3, oo1Var);
    }

    static /* synthetic */ void p0(no1 no1Var, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        no1Var.C(j, j2, j3, f, i3);
    }

    static void z(no1 no1Var, zh zhVar, long j, long j2, float f, z40 z40Var, int i, int i2) {
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
        no1Var.q0(zhVar, 0L, j, j3, f2, z40Var, i3);
    }

    void C(long j, long j2, long j3, float f, int i);

    void L(long j, float f, long j2, oo1 oo1Var);

    void W(f80 f80Var, long j, long j2, float f, oo1 oo1Var, int i);

    void c0(f80 f80Var, long j, long j2, long j3, float f, oo1 oo1Var);

    default long e() {
        return i0().L();
    }

    void g(hj hjVar, f80 f80Var, float f, oo1 oo1Var, int i);

    void g0(long j, float f, float f2, long j2, long j3, float f3, ys6 ys6Var);

    kk3 getLayoutDirection();

    void h(hj hjVar, long j, float f, oo1 oo1Var);

    bt i0();

    void n0(ArrayList arrayList, long j, float f);

    void q0(zh zhVar, long j, long j2, long j3, float f, z40 z40Var, int i);

    void s(long j, long j2, long j3, float f, oo1 oo1Var, int i);

    default long t0() {
        return ii2.v(i0().L());
    }
}
