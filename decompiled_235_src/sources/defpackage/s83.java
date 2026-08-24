package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s83  reason: default package */
/* loaded from: classes.dex */
public final class s83 implements Comparable, Serializable {
    public static final s83 L = new s83(0, -31557014167219200L);
    public static final s83 R = new s83(999999999, 31556889864403199L);
    public final long A;
    public final int B;

    public s83(int i, long j) {
        this.A = j;
        this.B = i;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
            return;
        }
        i.h("Instant exceeds minimum or maximum instant");
        throw null;
    }

    public final long a(s83 s83Var) {
        s83Var.getClass();
        jd1 jd1Var = oq1.B;
        return oq1.j(n16.M(this.A - s83Var.A, uq1.SECONDS), n16.L(this.B - s83Var.B, uq1.NANOSECONDS));
    }

    public final long b() {
        long j = this.A;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.B;
        long j2 = 1000;
        if (i >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i2 / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                return Long.MAX_VALUE;
            }
            return j5;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i2 / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) < 0 && (j8 ^ j2) >= 0) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s83 s83Var = (s83) obj;
        s83Var.getClass();
        int q = nb3.q(this.A, s83Var.A);
        if (q != 0) {
            return q;
        }
        return nb3.p(this.B, s83Var.B);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s83) {
                s83 s83Var = (s83) obj;
                if (this.A != s83Var.A || this.B != s83Var.B) {
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
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.A;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        nb3.u(sb, sb, i4);
        sb.append('-');
        nb3.u(sb, sb, i5);
        sb.append('T');
        nb3.u(sb, sb, i7);
        sb.append(':');
        nb3.u(sb, sb, i9);
        sb.append(':');
        nb3.u(sb, sb, i10);
        int i12 = this.B;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = nb3.m;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
