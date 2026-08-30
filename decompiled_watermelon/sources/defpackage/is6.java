package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is6  reason: default package */
/* loaded from: classes.dex */
public final class is6 {
    public static final js6[] b = {new js6(0), new js6(4294967296L), new js6(8589934592L)};
    public static final long c = hi2.L(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (js6.a(b2, 0L)) {
            return "Unspecified";
        }
        if (js6.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        } else if (js6.a(b2, 8589934592L)) {
            return c(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof is6) {
            if (this.a != ((is6) obj).a) {
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
        return d(this.a);
    }
}
