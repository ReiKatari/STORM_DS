package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k64  reason: default package */
/* loaded from: classes.dex */
public final class k64 {
    public static k64 h;
    public final kk3 a;
    public final s47 b;
    public final th1 c;
    public final ki2 d;
    public final s47 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public k64(kk3 kk3Var, s47 s47Var, th1 th1Var, ki2 ki2Var) {
        this.a = kk3Var;
        this.b = s47Var;
        this.c = th1Var;
        this.d = ki2Var;
        this.e = gi2.N(s47Var, kk3Var);
    }

    public final long a(int i, long j) {
        float f = this.g;
        float f2 = this.f;
        int i2 = 0;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = l64.a;
            long b = s21.b(0, 0, 0, 0, 15);
            s47 s47Var = this.e;
            th1 th1Var = this.c;
            float b2 = nj2.c(str, s47Var, b, th1Var, this.d, 1, 96).b();
            float b3 = nj2.c(l64.b, this.e, s21.b(0, 0, 0, 0, 15), th1Var, this.d, 2, 96).b() - b2;
            this.g = b2;
            this.f = b3;
            f2 = b3;
            f = b2;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            if (round >= 0) {
                i2 = round;
            }
            int g = q21.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = q21.i(j);
        }
        return s21.a(q21.j(j), q21.h(j), i2, q21.g(j));
    }
}
