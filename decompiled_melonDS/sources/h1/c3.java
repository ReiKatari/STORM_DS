package h1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5881a;

    /* renamed from: b  reason: collision with root package name */
    public long f5882b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5883c;

    public c3(fj.a0 a0Var) {
        this.f5881a = 3;
        a0Var.getClass();
        this.f5883c = a0Var;
        this.f5882b = 262144L;
    }

    public long a(float f8, long j2, long j10) {
        float abs;
        long j11;
        long e6 = h3.b.e(this.f5882b, h3.b.d(j2, j10));
        this.f5882b = e6;
        if (((n1) this.f5883c) == null) {
            abs = h3.b.c(e6);
        } else {
            abs = Math.abs(g(e6));
        }
        if (abs >= f8) {
            n1 n1Var = (n1) this.f5883c;
            long j12 = this.f5882b;
            if (n1Var == null) {
                float c4 = h3.b.c(j12);
                float intBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L)) / c4;
                return h3.b.d(this.f5882b, h3.b.f((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32)) / c4) << 32), f8));
            }
            float g10 = g(j12) - (Math.signum(g(this.f5882b)) * f8);
            long j13 = this.f5882b;
            n1 n1Var2 = (n1) this.f5883c;
            n1 n1Var3 = n1.Horizontal;
            if (n1Var2 == n1Var3) {
                j11 = j13 & 4294967295L;
            } else {
                j11 = j13 >> 32;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) j11);
            if (((n1) this.f5883c) == n1Var3) {
                return (Float.floatToRawIntBits(g10) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            }
            return (Float.floatToRawIntBits(g10) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        }
        return 9205357640488583168L;
    }

    public void b(int i2) {
        if (i2 >= 64) {
            c3 c3Var = (c3) this.f5883c;
            if (c3Var != null) {
                c3Var.b(i2 - 64);
                return;
            }
            return;
        }
        this.f5882b &= ~(1 << i2);
    }

    public int c(int i2) {
        c3 c3Var = (c3) this.f5883c;
        if (c3Var == null) {
            long j2 = this.f5882b;
            if (i2 >= 64) {
                return Long.bitCount(j2);
            }
            return Long.bitCount(((1 << i2) - 1) & j2);
        } else if (i2 < 64) {
            return Long.bitCount(this.f5882b & ((1 << i2) - 1));
        } else {
            return Long.bitCount(this.f5882b) + c3Var.c(i2 - 64);
        }
    }

    public void d() {
        if (((c3) this.f5883c) == null) {
            this.f5883c = new c3();
        }
    }

    public boolean e(int i2) {
        if (i2 >= 64) {
            d();
            return ((c3) this.f5883c).e(i2 - 64);
        } else if ((this.f5882b & (1 << i2)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void f(int i2, boolean z10) {
        boolean z11;
        if (i2 >= 64) {
            d();
            ((c3) this.f5883c).f(i2 - 64, z10);
            return;
        }
        long j2 = this.f5882b;
        if ((Long.MIN_VALUE & j2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i2) - 1;
        this.f5882b = ((j2 & (~j10)) << 1) | (j2 & j10);
        if (z10) {
            j(i2);
        } else {
            b(i2);
        }
        if (!z11 && ((c3) this.f5883c) == null) {
            return;
        }
        d();
        ((c3) this.f5883c).f(0, z11);
    }

    public float g(long j2) {
        long j10;
        if (((n1) this.f5883c) == n1.Horizontal) {
            j10 = j2 >> 32;
        } else {
            j10 = j2 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j10);
    }

    public boolean h(int i2) {
        boolean z10;
        if (i2 >= 64) {
            d();
            return ((c3) this.f5883c).h(i2 - 64);
        }
        long j2 = 1 << i2;
        long j10 = this.f5882b;
        if ((j10 & j2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j2);
        this.f5882b = j11;
        long j12 = j2 - 1;
        this.f5882b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        c3 c3Var = (c3) this.f5883c;
        if (c3Var != null) {
            if (c3Var.e(0)) {
                j(63);
            }
            ((c3) this.f5883c).h(0);
        }
        return z10;
    }

    public void i() {
        this.f5882b = 0L;
        c3 c3Var = (c3) this.f5883c;
        if (c3Var != null) {
            c3Var.i();
        }
    }

    public void j(int i2) {
        if (i2 >= 64) {
            d();
            ((c3) this.f5883c).j(i2 - 64);
            return;
        }
        this.f5882b |= 1 << i2;
    }

    public String toString() {
        switch (this.f5881a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                if (((c3) this.f5883c) == null) {
                    return Long.toBinaryString(this.f5882b);
                }
                return ((c3) this.f5883c).toString() + "xx" + Long.toBinaryString(this.f5882b);
            default:
                return super.toString();
        }
    }

    public c3(long j2, je.f fVar) {
        this.f5881a = 2;
        this.f5882b = j2;
        this.f5883c = fVar;
    }

    public c3() {
        this.f5881a = 1;
        this.f5882b = 0L;
    }

    public c3(long j2, n1 n1Var) {
        this.f5881a = 0;
        this.f5883c = n1Var;
        this.f5882b = j2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(n1 n1Var) {
        this(0L, n1Var);
        this.f5881a = 0;
    }
}
