package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mb4  reason: default package */
/* loaded from: classes.dex */
public final class mb4 {
    public final long a;

    public static long a(long j, float f, int i) {
        float f2;
        if ((i & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j >> 32));
        } else {
            f2 = RecyclerView.A1;
        }
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long d(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long e(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + intBitsToFloat) << 32);
    }

    public static final long f(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f) << 32);
    }

    public static String g(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            return "Offset(" + nl2.b0(Float.intBitsToFloat((int) (j >> 32))) + ", " + nl2.b0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mb4) {
            if (this.a != ((mb4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
