package h3;

import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f6050a;

    public static long a(long j2, float f8, int i2) {
        float f10;
        if ((i2 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j2 >> 32));
        } else {
            f10 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f8 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
    }

    public static final boolean b(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final float c(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long d(long j2, long j10) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static final long e(long j2, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + intBitsToFloat) << 32);
    }

    public static final long f(long j2, float f8) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f8) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f8) & 4294967295L);
    }

    public static String g(long j2) {
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            return "Offset(" + w.J(Float.intBitsToFloat((int) (j2 >> 32))) + ", " + w.J(Float.intBitsToFloat((int) (j2 & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f6050a != ((b) obj).f6050a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6050a);
    }

    public final String toString() {
        return g(this.f6050a);
    }
}
