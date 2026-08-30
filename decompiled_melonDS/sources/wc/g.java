package wc;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Comparable, Serializable {
    public static final g L = new g(0, -31557014167219200L);
    public static final g R = new g(999999999, 31556889864403199L);
    public final long A;
    public final int B;

    public g(int i2, long j2) {
        this.A = j2;
        this.B = i2;
        if (-31557014167219200L <= j2 && j2 < 31556889864403200L) {
            return;
        }
        a0.j.h("Instant exceeds minimum or maximum instant");
        throw null;
    }

    public final long a(g gVar) {
        gVar.getClass();
        l7.a aVar = b.B;
        return b.i(j.m(this.A - gVar.A, e.SECONDS), j.l(this.B - gVar.B, e.NANOSECONDS));
    }

    public final long b() {
        long j2 = this.A;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i10 = this.B;
        long j10 = 1000;
        if (i2 >= 0) {
            if (j2 != 1) {
                if (j2 != 0) {
                    long j11 = j2 * 1000;
                    if (j11 / 1000 != j2) {
                        return Long.MAX_VALUE;
                    }
                    j10 = j11;
                } else {
                    j10 = 0;
                }
            }
            long j12 = i10 / 1000000;
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                return Long.MAX_VALUE;
            }
            return j13;
        }
        long j14 = j2 + 1;
        if (j14 != 1) {
            if (j14 != 0) {
                long j15 = j14 * 1000;
                if (j15 / 1000 != j14) {
                    return Long.MIN_VALUE;
                }
                j10 = j15;
            } else {
                j10 = 0;
            }
        }
        long j16 = (i10 / 1000000) - 1000;
        long j17 = j10 + j16;
        if ((j10 ^ j17) < 0 && (j16 ^ j10) >= 0) {
            return Long.MIN_VALUE;
        }
        return j17;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        int c4 = nc.k.c(this.A, gVar.A);
        if (c4 != 0) {
            return c4;
        }
        return nc.k.b(this.B, gVar.B);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.A != gVar.A || this.B != gVar.B) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.B * 51) + Long.hashCode(this.A);
    }

    public final String toString() {
        long j2;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.A;
        long j11 = j10 / 86400;
        long j12 = 0;
        if ((j10 ^ 86400) < 0 && j11 * 86400 != j10) {
            j11--;
        }
        long j13 = j10 % 86400;
        int i2 = (int) (j13 + (86400 & (((j13 ^ 86400) & ((-j13) | j13)) >> 63)));
        long j14 = (j11 + 719528) - 60;
        if (j14 < 0) {
            long j15 = 146097;
            long j16 = ((j14 + 1) / j15) - 1;
            j2 = 0;
            j12 = 400 * j16;
            j14 += (-j16) * j15;
        } else {
            j2 = 0;
        }
        long j17 = 400;
        long j18 = ((j17 * j14) + 591) / 146097;
        long j19 = 365;
        long j20 = 4;
        long j21 = 100;
        long j22 = j14 - ((j18 / j17) + (((j18 / j20) + (j19 * j18)) - (j18 / j21)));
        if (j22 < j2) {
            j18--;
            j22 = j14 - ((j18 / j17) + (((j18 / j20) + (j19 * j18)) - (j18 / j21)));
        }
        int i10 = (int) j22;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j18 + j12 + (i11 / 10));
        int i15 = i2 / 3600;
        int i16 = i2 - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + 10000);
                sb3.deleteCharAt(0).getClass();
            } else {
                sb3.append(i14 - 10000);
                sb3.deleteCharAt(1).getClass();
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        j.d(sb2, sb2, i12);
        sb2.append('-');
        j.d(sb2, sb2, i13);
        sb2.append('T');
        j.d(sb2, sb2, i15);
        sb2.append(':');
        j.d(sb2, sb2, i17);
        sb2.append(':');
        j.d(sb2, sb2, i18);
        int i20 = this.B;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = j.f14199a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            valueOf.getClass();
            sb2.append(valueOf.substring(1));
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
