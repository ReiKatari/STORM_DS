package x4;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f14337a;

    public /* synthetic */ a(long j2) {
        this.f14337a = j2;
    }

    public static long a(long j2, int i2, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i2 = j(j2);
        }
        if ((i13 & 2) != 0) {
            i10 = h(j2);
        }
        if ((i13 & 4) != 0) {
            i11 = i(j2);
        }
        if ((i13 & 8) != 0) {
            i12 = g(j2);
        }
        if (i10 < i2 || i12 < i11 || i2 < 0 || i11 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i2, i10, i11, i12);
    }

    public static final boolean b(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final boolean c(long j2) {
        int i2 = (int) (3 & j2);
        int i10 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        if ((((int) (j2 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j2) {
        int i2 = (int) (3 & j2);
        if ((((int) (j2 >> 33)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j2) {
        int i2;
        int i10 = (int) (3 & j2);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j2 >> (i11 + 15))) & i12;
        int i14 = ((int) (j2 >> (i11 + 46))) & i12;
        if (i14 == 0) {
            i2 = Preference.DEFAULT_ORDER;
        } else {
            i2 = i14 - 1;
        }
        if (i13 == i2) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j2) {
        int i2;
        int i10 = (int) (3 & j2);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j2 >> 2)) & i11;
        int i13 = ((int) (j2 >> 33)) & i11;
        if (i13 == 0) {
            i2 = Preference.DEFAULT_ORDER;
        } else {
            i2 = i13 - 1;
        }
        if (i12 == i2) {
            return true;
        }
        return false;
    }

    public static final int g(long j2) {
        int i2 = (int) (3 & j2);
        int i10 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i11 = ((int) (j2 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Preference.DEFAULT_ORDER;
        }
        return i11 - 1;
    }

    public static final int h(long j2) {
        int i2 = (int) (3 & j2);
        int i10 = (int) (j2 >> 33);
        int i11 = i10 & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
        if (i11 == 0) {
            return Preference.DEFAULT_ORDER;
        }
        return i11 - 1;
    }

    public static final int i(long j2) {
        int i2 = (int) (3 & j2);
        int i10 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return ((int) (j2 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j2) {
        int i2 = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j2) {
        String valueOf;
        int h2 = h(j2);
        String str = "Infinity";
        if (h2 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(h2);
        }
        int g10 = g(j2);
        if (g10 != Integer.MAX_VALUE) {
            str = String.valueOf(g10);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j2));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j2));
        sb2.append(", maxHeight = ");
        return w.d.r(sb2, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f14337a != ((a) obj).f14337a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14337a);
    }

    public final String toString() {
        return k(this.f14337a);
    }
}
