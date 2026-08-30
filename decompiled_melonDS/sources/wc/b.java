package wc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Comparable {
    public static final l7.a B = new l7.a(20);
    public static final long L = j.c(4611686018427387903L);
    public static final long R = j.c(-4611686018427387903L);
    public static final long X = 9223372036854759646L;
    public final long A;

    public /* synthetic */ b(long j2) {
        this.A = j2;
    }

    public static final long a(long j2, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long a10 = j.a(j2, j12);
        if (-4611686018426L <= a10 && a10 < 4611686018427L) {
            long j13 = ((a10 * j11) + (j10 - (j12 * j11))) << 1;
            int i2 = c.f14195a;
            return j13;
        }
        return j.c(a10);
    }

    public static final void b(StringBuilder sb2, int i2, int i10, int i11, String str, boolean z10) {
        sb2.append(i2);
        if (i10 != 0) {
            sb2.append('.');
            String o02 = vc.h.o0(i11, String.valueOf(i10));
            int i12 = -1;
            int length = o02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (o02.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (!z10 && i14 < 3) {
                sb2.append((CharSequence) o02, 0, i14);
            } else {
                sb2.append((CharSequence) o02, 0, ((i12 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int c(long j2, long j10) {
        long j11 = j2 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i2 = (((int) j2) & 1) - (((int) j10) & 1);
            if (j2 < 0) {
                return -i2;
            }
            return i2;
        }
        return nc.k.c(j2, j10);
    }

    public static final long d(long j2) {
        if ((((int) j2) & 1) == 1 && !h(j2)) {
            return j2 >> 1;
        }
        return j(j2, e.MILLISECONDS);
    }

    public static final int e(long j2) {
        if (h(j2)) {
            return 0;
        }
        return (int) (j(j2, e.MINUTES) % 60);
    }

    public static final int f(long j2) {
        long j10;
        if (h(j2)) {
            return 0;
        }
        if ((((int) j2) & 1) == 1) {
            j10 = ((j2 >> 1) % 1000) * 1000000;
        } else {
            j10 = (j2 >> 1) % 1000000000;
        }
        return (int) j10;
    }

    public static final int g(long j2) {
        if (h(j2)) {
            return 0;
        }
        return (int) (j(j2, e.SECONDS) % 60);
    }

    public static final boolean h(long j2) {
        if (j2 != L && j2 != R) {
            return false;
        }
        return true;
    }

    public static final long i(long j2, long j10) {
        int i2 = ((int) j2) & 1;
        if (i2 == (((int) j10) & 1)) {
            if (i2 == 0) {
                long j11 = (j2 >> 1) + (j10 >> 1);
                if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
                    long j12 = j11 << 1;
                    int i10 = c.f14195a;
                    return j12;
                }
                return j.c(j11 / 1000000);
            }
            long a10 = j.a(j2 >> 1, j10 >> 1);
            if (a10 != 9223372036854759646L) {
                if (a10 != 4611686018427387903L && a10 != -4611686018427387903L) {
                    if (-4611686018426L <= a10 && a10 < 4611686018427L) {
                        long j13 = (a10 * 1000000) << 1;
                        int i11 = c.f14195a;
                        return j13;
                    }
                    return j.c(p7.j.h(a10, -4611686018427387903L, 4611686018427387903L));
                }
                return j.c(a10);
            }
            a0.j.h("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        } else if (i2 == 1) {
            return a(j2 >> 1, j10 >> 1);
        } else {
            return a(j10 >> 1, j2 >> 1);
        }
    }

    public static final long j(long j2, e eVar) {
        e eVar2;
        eVar.getClass();
        if (j2 == L) {
            return Long.MAX_VALUE;
        }
        if (j2 == R) {
            return Long.MIN_VALUE;
        }
        long j10 = j2 >> 1;
        if ((((int) j2) & 1) == 0) {
            eVar2 = e.NANOSECONDS;
        } else {
            eVar2 = e.MILLISECONDS;
        }
        eVar2.getClass();
        return eVar.getTimeUnit$kotlin_stdlib().convert(j10, eVar2.getTimeUnit$kotlin_stdlib());
    }

    public static String k(long j2) {
        boolean z10;
        int j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0s";
        }
        if (j2 == L) {
            return "Infinity";
        }
        if (j2 == R) {
            return "-Infinity";
        }
        int i10 = 0;
        if (i2 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i2 < 0) {
            j2 = l(j2);
        }
        long j11 = j(j2, e.DAYS);
        if (h(j2)) {
            j10 = 0;
        } else {
            j10 = (int) (j(j2, e.HOURS) % 24);
        }
        int e6 = e(j2);
        int g10 = g(j2);
        int f8 = f(j2);
        if (j11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (e6 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (g10 == 0 && f8 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('d');
            i10 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(j10);
            sb2.append('h');
            i10 = i11;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(e6);
            sb2.append('m');
            i10 = i12;
        }
        if (z14) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (g10 == 0 && !z11 && !z12 && !z13) {
                if (f8 >= 1000000) {
                    b(sb2, f8 / 1000000, f8 % 1000000, 6, "ms", false);
                } else if (f8 >= 1000) {
                    b(sb2, f8 / 1000, f8 % 1000, 3, "us", false);
                } else {
                    sb2.append(f8);
                    sb2.append("ns");
                }
            } else {
                b(sb2, g10, f8, 9, "s", false);
            }
            i10 = i13;
        }
        if (z10 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long l(long j2) {
        long j10 = ((-(j2 >> 1)) << 1) + (((int) j2) & 1);
        int i2 = c.f14195a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.A, ((b) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.A != ((b) obj).A) {
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
        return k(this.A);
    }
}
