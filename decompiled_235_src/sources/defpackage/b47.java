package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b47  reason: default package */
/* loaded from: classes.dex */
public final class b47 {
    public final a47 a;
    public jk3 b = null;
    public jk3 c;

    public b47(a47 a47Var, jk3 jk3Var) {
        this.a = a47Var;
        this.c = jk3Var;
    }

    public final long a(long j) {
        of5 of5Var;
        jk3 jk3Var = this.b;
        of5 of5Var2 = of5.e;
        if (jk3Var != null) {
            if (jk3Var.t()) {
                jk3 jk3Var2 = this.c;
                if (jk3Var2 != null) {
                    of5Var = jk3Var2.O(jk3Var, true);
                } else {
                    of5Var = null;
                }
            } else {
                of5Var = of5Var2;
            }
            if (of5Var != null) {
                of5Var2 = of5Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = of5Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = of5Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = of5Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = of5Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        a47 a47Var = this.a;
        int e = a47Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) >= a47Var.e(e) && Float.intBitsToFloat(i) <= a47Var.f(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j) {
        jk3 jk3Var;
        jk3 jk3Var2 = this.b;
        if (jk3Var2 != null) {
            jk3 jk3Var3 = null;
            if (!jk3Var2.t()) {
                jk3Var2 = null;
            }
            if (jk3Var2 != null && (jk3Var = this.c) != null) {
                if (jk3Var.t()) {
                    jk3Var3 = jk3Var;
                }
                if (jk3Var3 != null) {
                    return jk3Var2.J(jk3Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        jk3 jk3Var;
        jk3 jk3Var2 = this.b;
        if (jk3Var2 != null) {
            jk3 jk3Var3 = null;
            if (!jk3Var2.t()) {
                jk3Var2 = null;
            }
            if (jk3Var2 != null && (jk3Var = this.c) != null) {
                if (jk3Var.t()) {
                    jk3Var3 = jk3Var;
                }
                if (jk3Var3 != null) {
                    return jk3Var3.J(jk3Var2, j);
                }
            }
        }
        return j;
    }
}
