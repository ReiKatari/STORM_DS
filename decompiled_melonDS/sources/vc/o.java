package vc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o extends n {
    public static String M(char[] cArr, int i2, int i10) {
        p7.o.c(i2, i10, cArr.length);
        return new String(cArr, i2, i10 - i2);
    }

    public static String N(byte[] bArr, int i2, int i10) {
        int i11;
        if ((i10 & 1) != 0) {
            i11 = 0;
        } else {
            i11 = 12;
        }
        p7.o.c(i11, i2, bArr.length);
        return new String(bArr, i11, i2 - i11, a.f13781a);
    }

    public static boolean O(String str, String str2, boolean z10) {
        str.getClass();
        if (!z10) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean P(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final void Q(String str) {
        throw new NumberFormatException(kc.a.c('\'', "Invalid number format: '", str));
    }

    public static boolean R(int i2, int i10, int i11, String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        if (!z10) {
            return str.regionMatches(i2, str2, i10, i11);
        }
        return str.regionMatches(z10, i2, str2, i10, i11);
    }

    public static String S(int i2, String str) {
        str.getClass();
        if (i2 >= 0) {
            if (i2 != 0) {
                int i10 = 1;
                if (i2 != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder(str.length() * i2);
                            if (1 <= i2) {
                                while (true) {
                                    sb2.append((CharSequence) str);
                                    if (i10 == i2) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            return sb2.toString();
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i2];
                        for (int i11 = 0; i11 < i2; i11++) {
                            cArr[i11] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        m9.o.p(i2, "Count 'n' must be non-negative, but was ");
        return null;
    }

    public static String T(String str, String str2, String str3) {
        str.getClass();
        int e02 = h.e0(str, str2, 0, false);
        if (e02 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append((CharSequence) str, i10, e02);
                sb2.append(str3);
                i10 = e02 + length;
                if (e02 >= str.length()) {
                    break;
                }
                e02 = h.e0(str, str2, e02 + i2, false);
            } while (e02 > 0);
            sb2.append((CharSequence) str, i10, str.length());
            return sb2.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean U(String str, String str2, int i2, boolean z10) {
        str.getClass();
        if (!z10) {
            return str.startsWith(str2, i2);
        }
        return R(i2, 0, str2.length(), str, str2, z10);
    }

    public static boolean V(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        if (!z10) {
            return str.startsWith(str2);
        }
        return R(0, 0, str2.length(), str, str2, z10);
    }

    public static Integer W(String str) {
        boolean z10;
        int i2;
        int i10;
        str.getClass();
        p7.k.f(10);
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            int i12 = -2147483647;
            if (nc.k.b(charAt, 48) < 0) {
                i2 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i12 = Integer.MIN_VALUE;
                            z10 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z10 = false;
                i2 = 0;
            }
            int i13 = -59652323;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), 10);
                if (digit >= 0) {
                    if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                        return null;
                    }
                    i11 = i10 - digit;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z10) {
                return Integer.valueOf(i11);
            }
            return Integer.valueOf(-i11);
        }
        return null;
    }

    public static Long X(String str) {
        boolean z10;
        str.getClass();
        p7.k.f(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            long j2 = -9223372036854775807L;
            if (nc.k.b(charAt, 48) < 0) {
                z10 = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j2 = Long.MIN_VALUE;
                            i2 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z10 = false;
                        i2 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z10 = false;
            }
            long j10 = 0;
            long j11 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), 10);
                if (digit >= 0) {
                    if (j10 < j11) {
                        if (j11 == -256204778801521550L) {
                            j11 = j2 / 10;
                            if (j10 < j11) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j12 = j10 * 10;
                    long j13 = digit;
                    if (j12 < j2 + j13) {
                        return null;
                    }
                    j10 = j12 - j13;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z10) {
                return Long.valueOf(j10);
            }
            return Long.valueOf(-j10);
        }
        return null;
    }
}
