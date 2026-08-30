package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj  reason: default package */
/* loaded from: classes.dex */
public final class yj {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public yj(s45 s45Var) {
        this.a = 2;
        s45Var.getClass();
        this.c = s45Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i >= 64) {
            yj yjVar = (yj) this.c;
            if (yjVar != null) {
                yjVar.a(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    public int b(int i) {
        yj yjVar = (yj) this.c;
        if (yjVar == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else {
            return Long.bitCount(this.b) + yjVar.b(i - 64);
        }
    }

    public void c() {
        if (((yj) this.c) == null) {
            this.c = new yj();
        }
    }

    public boolean d(int i) {
        if (i >= 64) {
            c();
            return ((yj) this.c).d(i - 64);
        }
        if (((1 << i) & this.b) != 0) {
            return true;
        }
        return false;
    }

    public long e(float f, long j, boolean z) {
        long e;
        float abs;
        long j2;
        long j3 = this.b;
        if (z) {
            e = mb4.e(j3, j);
            this.b = e;
        } else {
            e = mb4.e(j3, j);
        }
        if (((jf4) this.c) == null) {
            abs = mb4.c(e);
        } else {
            abs = Math.abs(g(e));
        }
        if (abs >= f) {
            jf4 jf4Var = (jf4) this.c;
            long j4 = this.b;
            if (jf4Var == null) {
                float c = mb4.c(j4);
                float intBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L)) / c;
                return mb4.d(this.b, mb4.f(f, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) / c) << 32)));
            }
            float g = g(j4) - (Math.signum(g(this.b)) * f);
            long j5 = this.b;
            jf4 jf4Var2 = (jf4) this.c;
            jf4 jf4Var3 = jf4.Horizontal;
            if (jf4Var2 == jf4Var3) {
                j2 = j5 & 4294967295L;
            } else {
                j2 = j5 >> 32;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) j2);
            if (((jf4) this.c) == jf4Var3) {
                return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
            }
            return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(g) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    public void f(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            c();
            ((yj) this.c).f(i - 64, z);
            return;
        }
        long j = this.b;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            j(i);
        } else {
            a(i);
        }
        if (!z2 && ((yj) this.c) == null) {
            return;
        }
        c();
        ((yj) this.c).f(0, z2);
    }

    public float g(long j) {
        long j2;
        if (((jf4) this.c) == jf4.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public boolean h(int i) {
        boolean z;
        if (i >= 64) {
            c();
            return ((yj) this.c).h(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        yj yjVar = (yj) this.c;
        if (yjVar != null) {
            if (yjVar.d(0)) {
                j(63);
            }
            ((yj) this.c).h(0);
        }
        return z;
    }

    public void i() {
        this.b = 0L;
        yj yjVar = (yj) this.c;
        if (yjVar != null) {
            yjVar.i();
        }
    }

    public void j(int i) {
        if (i >= 64) {
            c();
            ((yj) this.c).j(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (((yj) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((yj) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public yj() {
        this.a = 1;
        this.b = 0L;
    }

    public yj(long j, y05 y05Var) {
        this.a = 0;
        this.b = j;
        this.c = y05Var;
    }

    public yj(long j, jf4 jf4Var) {
        this.a = 3;
        this.c = jf4Var;
        this.b = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(jf4 jf4Var) {
        this(0L, jf4Var);
        this.a = 3;
    }
}
