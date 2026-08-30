package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i76  reason: default package */
/* loaded from: classes.dex */
public final class i76 {
    public final long a;

    public /* synthetic */ i76(long j) {
        this.a = j;
    }

    public static long a(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float d(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean f(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= RecyclerView.A1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= RecyclerView.A1) {
            z3 = true;
        }
        return z4 | z3;
    }

    public static String g(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + nl2.b0(Float.intBitsToFloat((int) (j >> 32))) + ", " + nl2.b0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i76) {
            if (this.a != ((i76) obj).a) {
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
