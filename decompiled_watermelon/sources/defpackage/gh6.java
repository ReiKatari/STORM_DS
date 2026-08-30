package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh6  reason: default package */
/* loaded from: classes.dex */
public abstract class gh6 extends fh6 {
    public static String c0(char[] cArr, int i, int i2) {
        f34.u(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static String d0(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        f34.u(i, i2, bArr.length);
        return new String(bArr, i, i2 - i, hk0.a);
    }

    public static byte[] e0(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(hk0.a);
        bytes.getClass();
        return bytes;
    }

    public static boolean f0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean g0(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final void h0(String str) {
        throw new NumberFormatException(b31.n('\'', "Invalid number format: '", str));
    }

    public static boolean i0(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String j0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            if (i != 0) {
                int i2 = 1;
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(str.length() * i);
                            if (1 <= i) {
                                while (true) {
                                    sb.append((CharSequence) str);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            return sb.toString();
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            cArr[i3] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        i.g(ej6.e("Count 'n' must be non-negative, but was ", i, '.'));
        return null;
    }

    public static String k0(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String l0(String str, String str2, String str3) {
        str.getClass();
        int w0 = zg6.w0(str, str2, 0, false);
        if (w0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, w0);
                sb.append(str3);
                i2 = w0 + length;
                if (w0 >= str.length()) {
                    break;
                }
                w0 = zg6.w0(str, str2, w0 + i, false);
            } while (w0 > 0);
            sb.append((CharSequence) str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean m0(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return i0(i, 0, str2.length(), str, str2, z);
    }

    public static boolean n0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return i0(0, 0, str2.length(), str, str2, z);
    }

    public static Integer o0(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        iq2.g(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = -2147483647;
            if (b53.E(charAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i4 = Integer.MIN_VALUE;
                            z = true;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                        return null;
                    }
                    i3 = i2 - digit;
                    i++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }

    public static Long p0(String str) {
        boolean z;
        str.getClass();
        iq2.g(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (b53.E(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j = Long.MIN_VALUE;
                            i = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                        i = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
            }
            long j2 = 0;
            long j3 = -256204778801521550L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (j2 < j3) {
                        if (j3 == -256204778801521550L) {
                            j3 = j / 10;
                            if (j2 < j3) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j4 = j2 * 10;
                    long j5 = digit;
                    if (j4 < j + j5) {
                        return null;
                    }
                    j2 = j4 - j5;
                    i++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Long.valueOf(j2);
            }
            return Long.valueOf(-j2);
        }
        return null;
    }
}
