package h3;

import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f6064a;

    public /* synthetic */ e(long j2) {
        this.f6064a = j2;
    }

    public static long a(long j2, float f8) {
        return (Float.floatToRawIntBits(f8) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L))));
    }

    public static final boolean b(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final float d(long j2) {
        return Math.min(Float.intBitsToFloat((int) ((j2 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j2 & 2147483647L)));
    }

    public static final float e(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final boolean f(long j2) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j2 == 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Float.intBitsToFloat((int) (j2 >> 32)) <= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z10 | z11;
        if (Float.intBitsToFloat((int) (j2 & 4294967295L)) <= 0.0f) {
            z12 = true;
        }
        return z13 | z12;
    }

    public static String g(long j2) {
        if (j2 != 9205357640488583168L) {
            return "Size(" + w.J(Float.intBitsToFloat((int) (j2 >> 32))) + ", " + w.J(Float.intBitsToFloat((int) (j2 & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f6064a != ((e) obj).f6064a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6064a);
    }

    public final String toString() {
        return g(this.f6064a);
    }
}
