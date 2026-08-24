package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s21  reason: default package */
/* loaded from: classes.dex */
public abstract class s21 {
    public static final long a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (i4 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (i3 >= 0) {
            z4 = true;
        }
        if (!(z4 & z6)) {
            r53.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int j3 = q21.j(j);
        int h = q21.h(j);
        if (i < j3) {
            i = j3;
        }
        if (i <= h) {
            h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int i3 = q21.i(j);
        int g = q21.g(j);
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 <= g) {
            g = i2;
        }
        return (h << 32) | (g & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int j3 = q21.j(j);
        int h = q21.h(j);
        int i = q21.i(j);
        int g = q21.g(j);
        int j4 = q21.j(j2);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j4 > h) {
            j4 = h;
        }
        int h2 = q21.h(j2);
        if (h2 >= j3) {
            j3 = h2;
        }
        if (j3 <= h) {
            h = j3;
        }
        int i2 = q21.i(j2);
        if (i2 < i) {
            i2 = i;
        }
        if (i2 > g) {
            i2 = g;
        }
        int g2 = q21.g(j2);
        if (g2 >= i) {
            i = g2;
        }
        if (i <= g) {
            g = i;
        }
        return a(j4, h, i2, g);
    }

    public static final int f(int i, long j) {
        int i2 = q21.i(j);
        int g = q21.g(j);
        if (i < i2) {
            i = i2;
        }
        if (i > g) {
            return g;
        }
        return i;
    }

    public static final int g(int i, long j) {
        int j2 = q21.j(j);
        int h = q21.h(j);
        if (i < j2) {
            i = j2;
        }
        if (i > h) {
            return h;
        }
        return i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        int c = c(i5);
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int c2 = c(i6);
        if (c + c2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final long i(long j, int i, int i2) {
        int j2 = q21.j(j) + i;
        int i3 = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = q21.h(j);
        if (h != Integer.MAX_VALUE && (h = h + i) < 0) {
            h = 0;
        }
        int i4 = q21.i(j) + i2;
        if (i4 < 0) {
            i4 = 0;
        }
        int g = q21.g(j);
        if (g == Integer.MAX_VALUE || (g = g + i2) >= 0) {
            i3 = g;
        }
        return a(j2, h, i4, i3);
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(xg6.m(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void k(int i) {
        throw new IllegalArgumentException(lb1.k("Can't represent a size of ", i, " in Constraints"));
    }
}
