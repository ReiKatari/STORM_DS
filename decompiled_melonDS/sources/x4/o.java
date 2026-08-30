package x4;

import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final p[] f14348b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c  reason: collision with root package name */
    public static final long f14349c = t.C(0, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f14350a;

    public /* synthetic */ o(long j2) {
        this.f14350a = j2;
    }

    public static final boolean a(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final long b(long j2) {
        return f14348b[(int) ((j2 & 1095216660480L) >>> 32)].f14351a;
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static String d(long j2) {
        long b10 = b(j2);
        if (p.a(b10, 0L)) {
            return "Unspecified";
        }
        if (p.a(b10, 4294967296L)) {
            return c(j2) + ".sp";
        } else if (p.a(b10, 8589934592L)) {
            return c(j2) + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (this.f14350a != ((o) obj).f14350a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14350a);
    }

    public final String toString() {
        return d(this.f14350a);
    }
}
