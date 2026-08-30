package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mr6  reason: default package */
/* loaded from: classes.dex */
public final class mr6 {
    public final lr6 a;
    public rd3 b = null;
    public rd3 c;

    public mr6(lr6 lr6Var, rd3 rd3Var) {
        this.a = lr6Var;
        this.c = rd3Var;
    }

    public final long a(long j) {
        y55 y55Var;
        rd3 rd3Var = this.b;
        y55 y55Var2 = y55.e;
        if (rd3Var != null) {
            if (rd3Var.c0()) {
                rd3 rd3Var2 = this.c;
                if (rd3Var2 != null) {
                    y55Var = rd3Var2.L(rd3Var, true);
                } else {
                    y55Var = null;
                }
            } else {
                y55Var = y55Var2;
            }
            if (y55Var != null) {
                y55Var2 = y55Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = y55Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = y55Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = y55Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = y55Var2.d;
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
        lr6 lr6Var = this.a;
        int e = lr6Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) >= lr6Var.e(e) && Float.intBitsToFloat(i) <= lr6Var.f(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j) {
        rd3 rd3Var;
        rd3 rd3Var2 = this.b;
        if (rd3Var2 != null) {
            rd3 rd3Var3 = null;
            if (!rd3Var2.c0()) {
                rd3Var2 = null;
            }
            if (rd3Var2 != null && (rd3Var = this.c) != null) {
                if (rd3Var.c0()) {
                    rd3Var3 = rd3Var;
                }
                if (rd3Var3 != null) {
                    return rd3Var2.y(rd3Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        rd3 rd3Var;
        rd3 rd3Var2 = this.b;
        if (rd3Var2 != null) {
            rd3 rd3Var3 = null;
            if (!rd3Var2.c0()) {
                rd3Var2 = null;
            }
            if (rd3Var2 != null && (rd3Var = this.c) != null) {
                if (rd3Var.c0()) {
                    rd3Var3 = rd3Var;
                }
                if (rd3Var3 != null) {
                    return rd3Var3.y(rd3Var2, j);
                }
            }
        }
        return j;
    }
}
