package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq1  reason: default package */
/* loaded from: classes.dex */
public final class oq1 implements Comparable {
    public static final jd1 B = new jd1(1);
    public static final long L = n16.u(4611686018427387903L);
    public static final long R = n16.u(-4611686018427387903L);
    public static final long X = 9223372036854759646L;
    public final long A;

    public /* synthetic */ oq1(long j) {
        this.A = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long k = n16.k(j, j3);
        if (-4611686018426L <= k && k < 4611686018427L) {
            long j4 = ((k * 1000000) + (j2 - (j3 * 1000000))) << 1;
            int i = qq1.a;
            return j4;
        }
        return n16.u(k);
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String B0 = qs6.B0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = B0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (B0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) B0, 0, i6);
            } else {
                sb.append((CharSequence) B0, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        return nb3.q(j, j2);
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long e(long j) {
        if ((((int) j) & 1) == 1 && !i(j)) {
            return j >> 1;
        }
        return k(j, uq1.MILLISECONDS);
    }

    public static final int f(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) (k(j, uq1.MINUTES) % 60);
    }

    public static final int g(long j) {
        long j2;
        if (i(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    public static final int h(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) (k(j, uq1.SECONDS) % 60);
    }

    public static final boolean i(long j) {
        if (j != L && j != R) {
            return false;
        }
        return true;
    }

    public static final long j(long j, long j2) {
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            if (i == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                    long j4 = j3 << 1;
                    int i2 = qq1.a;
                    return j4;
                }
                return n16.u(j3 / 1000000);
            }
            long k = n16.k(j >> 1, j2 >> 1);
            if (k != 9223372036854759646L) {
                if (k != 4611686018427387903L && k != -4611686018427387903L) {
                    if (-4611686018426L <= k && k < 4611686018427L) {
                        long j5 = (k * 1000000) << 1;
                        int i3 = qq1.a;
                        return j5;
                    }
                    return n16.u(gi2.s(k, -4611686018427387903L, 4611686018427387903L));
                }
                return n16.u(k);
            }
            i.h("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        } else if (i == 1) {
            return a(j >> 1, j2 >> 1);
        } else {
            return a(j2 >> 1, j >> 1);
        }
    }

    public static final long k(long j, uq1 uq1Var) {
        uq1 uq1Var2;
        uq1Var.getClass();
        if (j == L) {
            return Long.MAX_VALUE;
        }
        if (j == R) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            uq1Var2 = uq1.NANOSECONDS;
        } else {
            uq1Var2 = uq1.MILLISECONDS;
        }
        uq1Var2.getClass();
        return uq1Var.getTimeUnit$kotlin_stdlib().convert(j2, uq1Var2.getTimeUnit$kotlin_stdlib());
    }

    public static String l(long j) {
        boolean z;
        int k;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return "0s";
        }
        if (j == L) {
            return "Infinity";
        }
        if (j == R) {
            return "-Infinity";
        }
        int i2 = 0;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i < 0) {
            j = m(j);
        }
        long k2 = k(j, uq1.DAYS);
        if (i(j)) {
            k = 0;
        } else {
            k = (int) (k(j, uq1.HOURS) % 24);
        }
        int f = f(j);
        int h = h(j);
        int g = g(j);
        if (k2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (k != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (h == 0 && g == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z2) {
            sb.append(k2);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(k);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(f);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (h == 0 && !z2 && !z3 && !z4) {
                if (g >= 1000000) {
                    b(sb, g / 1000000, g % 1000000, 6, "ms", false);
                } else if (g >= 1000) {
                    b(sb, g / 1000, g % 1000, 3, "us", false);
                } else {
                    sb.append(g);
                    sb.append("ns");
                }
            } else {
                b(sb, h, g, 9, "s", false);
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long m(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = qq1.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.A, ((oq1) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oq1) {
            if (this.A != ((oq1) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A);
    }

    public final String toString() {
        return l(this.A);
    }
}
