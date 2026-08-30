package ej;

import qi.e;
import vc.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4504a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i2, int i10, String str2, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if ((i11 & 1) != 0) {
            i12 = 0;
        } else {
            i12 = i2;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        int i13 = i10;
        if ((i11 & 8) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((i11 & 32) != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((i11 & 64) != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        str.getClass();
        return b(str, i12, i13, str2, z10, z11, z12, z13, 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [fj.e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [fj.e, java.lang.Object] */
    public static String b(String str, int i2, int i10, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if ((i11 & 1) != 0) {
            i12 = 0;
        } else {
            i12 = i2;
        }
        if ((i11 & 2) != 0) {
            i13 = str.length();
        } else {
            i13 = i10;
        }
        if ((i11 & 8) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        if ((i11 & 16) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        if ((i11 & 64) == 0) {
            z16 = z13;
        }
        str.getClass();
        int i14 = i12;
        while (i14 < i13) {
            int codePointAt = str.codePointAt(i14);
            int i15 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z16) && !h.Z(str2, (char) codePointAt) && ((codePointAt != 37 || (z14 && (!z15 || c(i14, i13, str)))) && (codePointAt != 43 || !z12)))) {
                i14 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.j0(i12, i14, str);
                ?? r22 = 0;
                while (i14 < i13) {
                    int codePointAt2 = str.codePointAt(i14);
                    if (!z14 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        String str3 = "+";
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.k0("+");
                        } else if (codePointAt2 == 43 && z12) {
                            if (!z14) {
                                str3 = "%2B";
                            }
                            obj.k0(str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < i15 || z16) && !h.Z(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z14 && (!z15 || c(i14, i13, str)))))) {
                            obj.l0(codePointAt2);
                        } else {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.l0(codePointAt2);
                            while (!r22.z()) {
                                byte readByte = r22.readByte();
                                obj.e0(37);
                                char[] cArr = f4504a;
                                obj.e0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.e0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i14 += Character.charCount(codePointAt2);
                    i15 = 128;
                    r22 = r22;
                }
                return obj.Y();
            }
        }
        return str.substring(i12, i13);
    }

    public static final boolean c(int i2, int i10, String str) {
        str.getClass();
        int i11 = i2 + 2;
        if (i11 < i10 && str.charAt(i2) == '%' && e.m(str.charAt(i2 + 1)) != -1 && e.m(str.charAt(i11)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fj.e, java.lang.Object] */
    public static String d(String str, int i2, int i10, int i11) {
        int i12;
        boolean z10 = false;
        if ((i11 & 1) != 0) {
            i2 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) == 0) {
            z10 = true;
        }
        str.getClass();
        int i13 = i2;
        while (i13 < i10) {
            char charAt = str.charAt(i13);
            if (charAt != '%' && (charAt != '+' || !z10)) {
                i13++;
            } else {
                ?? obj = new Object();
                obj.j0(i2, i13, str);
                while (i13 < i10) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i10) {
                        int m = e.m(str.charAt(i13 + 1));
                        int m10 = e.m(str.charAt(i12));
                        if (m != -1 && m10 != -1) {
                            obj.e0((m << 4) + m10);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        obj.l0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z10) {
                            obj.e0(32);
                            i13++;
                        }
                        obj.l0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return obj.Y();
            }
        }
        return str.substring(i2, i10);
    }
}
