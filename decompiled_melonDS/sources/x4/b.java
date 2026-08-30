package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i2, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (i10 >= i2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z10 & z11;
        if (i2 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 & z12;
        if (i11 >= 0) {
            z13 = true;
        }
        if (!(z13 & z15)) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i2, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i2, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i2, 0, i10);
    }

    public static final int c(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        if (i2 < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long d(long j2, long j10) {
        int i2 = (int) (j10 >> 32);
        int j11 = a.j(j2);
        int h2 = a.h(j2);
        if (i2 < j11) {
            i2 = j11;
        }
        if (i2 <= h2) {
            h2 = i2;
        }
        int i10 = (int) (j10 & 4294967295L);
        int i11 = a.i(j2);
        int g10 = a.g(j2);
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 <= g10) {
            g10 = i10;
        }
        return (h2 << 32) | (g10 & 4294967295L);
    }

    public static final long e(long j2, long j10) {
        int j11 = a.j(j2);
        int h2 = a.h(j2);
        int i2 = a.i(j2);
        int g10 = a.g(j2);
        int j12 = a.j(j10);
        if (j12 < j11) {
            j12 = j11;
        }
        if (j12 > h2) {
            j12 = h2;
        }
        int h10 = a.h(j10);
        if (h10 >= j11) {
            j11 = h10;
        }
        if (j11 <= h2) {
            h2 = j11;
        }
        int i10 = a.i(j10);
        if (i10 < i2) {
            i10 = i2;
        }
        if (i10 > g10) {
            i10 = g10;
        }
        int g11 = a.g(j10);
        if (g11 >= i2) {
            i2 = g11;
        }
        if (i2 <= g10) {
            g10 = i2;
        }
        return a(j12, h2, i10, g10);
    }

    public static final int f(int i2, long j2) {
        int i10 = a.i(j2);
        int g10 = a.g(j2);
        if (i2 < i10) {
            i2 = i10;
        }
        if (i2 > g10) {
            return g10;
        }
        return i2;
    }

    public static final int g(int i2, long j2) {
        int j10 = a.j(j2);
        int h2 = a.h(j2);
        if (i2 < j10) {
            i2 = j10;
        }
        if (i2 > h2) {
            return h2;
        }
        return i2;
    }

    public static final long h(int i2, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i12 == Integer.MAX_VALUE) {
            i13 = i11;
        } else {
            i13 = i12;
        }
        int c4 = c(i13);
        if (i10 == Integer.MAX_VALUE) {
            i14 = i2;
        } else {
            i14 = i10;
        }
        int c10 = c(i14);
        if (c4 + c10 > 31) {
            j(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = c10 - 13;
        return ((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i2 << 2) | (i11 << (c10 + 2)) | ((i16 & (~(i16 >> 31))) << (c10 + 33));
    }

    public static final long i(long j2, int i2, int i10) {
        int j10 = a.j(j2) + i2;
        int i11 = 0;
        if (j10 < 0) {
            j10 = 0;
        }
        int h2 = a.h(j2);
        if (h2 != Integer.MAX_VALUE && (h2 = h2 + i2) < 0) {
            h2 = 0;
        }
        int i12 = a.i(j2) + i10;
        if (i12 < 0) {
            i12 = 0;
        }
        int g10 = a.g(j2);
        if (g10 == Integer.MAX_VALUE || (g10 = g10 + i10) >= 0) {
            i11 = g10;
        }
        return a(j10, h2, i12, i11);
    }

    public static final void j(int i2, int i10) {
        throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i10 + " in Constraints");
    }

    public static final Void k(int i2) {
        throw new IllegalArgumentException(w.d.m("Can't represent a size of ", i2, " in Constraints"));
    }
}
