package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x47  reason: default package */
/* loaded from: classes.dex */
public final class x47 {
    public static final y47[] b = {new y47(0), new y47(4294967296L), new y47(8589934592L)};
    public static final long c = hi2.J(Float.NaN, 0);
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
        if (y47.a(b2, 0L)) {
            return "Unspecified";
        }
        if (y47.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        } else if (y47.a(b2, 8589934592L)) {
            return c(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x47) {
            if (this.a != ((x47) obj).a) {
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
