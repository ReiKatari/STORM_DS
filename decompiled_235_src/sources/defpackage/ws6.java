package defpackage;

import com.google.mlkit.common.MlKitException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws6  reason: default package */
/* loaded from: classes.dex */
public abstract class ws6 extends vs6 {
    /* JADX WARN: Removed duplicated region for block: B:113:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean T(String str) {
        char c;
        boolean z;
        boolean z2;
        int charAt;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        String str2;
        boolean z5;
        boolean z6;
        char charAt2;
        char charAt3;
        boolean z7 = true;
        int length = str.length() - 1;
        int i3 = 0;
        while (true) {
            c = ' ';
            if (i3 > length || str.charAt(i3) > ' ') {
                break;
            }
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        while (length > i3 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i3) == '+' || str.charAt(i3) == '-') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        if (str.charAt(i3) == '0') {
            int i4 = i3 + 1;
            if (i4 > length) {
                return true;
            }
            if ((str.charAt(i4) | ' ') == 120) {
                int i5 = i3 + 2;
                int i6 = i5;
                while (true) {
                    if (i6 <= length) {
                        z = z7;
                        if (((str.charAt(i6) - '0') & 65535) >= 10 && (((charAt3 | ' ') - 97) & 65535) >= 6) {
                            break;
                        }
                        i6++;
                        z7 = z;
                    } else {
                        z = z7;
                        break;
                    }
                }
                if (i5 != i6) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                if (i6 <= length) {
                    if (str.charAt(i6) == '.') {
                        int i7 = i6 + 1;
                        int i8 = i7;
                        while (i8 <= length) {
                            char c2 = c;
                            if (((str.charAt(i8) - '0') & 65535) >= 10 && (((charAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i8++;
                            c = c2;
                        }
                        if (i7 != i8) {
                            z6 = z;
                        } else {
                            z6 = false;
                        }
                        i6 = i8;
                    } else {
                        z6 = false;
                    }
                    if (z5 || z6) {
                        i3 = i6;
                        if (i3 != -1 || i3 > length) {
                            return false;
                        }
                        z2 = z;
                        if (!z2) {
                            int i9 = i3;
                            while (i9 <= length && ((str.charAt(i9) - '0') & 65535) < 10) {
                                i9++;
                            }
                            if (i3 != i9) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            if (i9 > length) {
                                i3 = i9;
                            } else {
                                if (str.charAt(i9) == '.') {
                                    int i10 = i9 + 1;
                                    i2 = i10;
                                    while (i2 <= length && ((str.charAt(i2) - '0') & 65535) < 10) {
                                        i2++;
                                    }
                                    if (i10 != i2) {
                                        z4 = z;
                                        if (z3 && !z4) {
                                            if (length == i2 + 2) {
                                                str2 = "NaN";
                                            } else if (length == i2 + 7) {
                                                str2 = "Infinity";
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 == null || qs6.q0(str, str2, i2, false) != i2) {
                                                i3 = -1;
                                            } else {
                                                i3 = length + 1;
                                            }
                                        } else {
                                            i3 = i2;
                                        }
                                    }
                                } else {
                                    i2 = i9;
                                }
                                z4 = false;
                                if (z3) {
                                }
                                i3 = i2;
                            }
                            if (i3 == -1) {
                                return false;
                            }
                            if (i3 > length) {
                                return z;
                            }
                        }
                        int i11 = i3 + 1;
                        charAt = str.charAt(i3) | ' ';
                        if (!z2) {
                            i = 112;
                        } else {
                            i = MlKitException.NOT_ENOUGH_SPACE;
                        }
                        if (charAt == i) {
                            if (z2 || ((charAt != 102 && charAt != 100) || i11 <= length)) {
                                return false;
                            }
                            return z;
                        } else if (i11 > length) {
                            return false;
                        } else {
                            if ((str.charAt(i11) == '+' || str.charAt(i11) == '-') && (i11 = i3 + 2) > length) {
                                return false;
                            }
                            while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                                i11++;
                            }
                            if (i11 > length) {
                                return z;
                            }
                            if (i11 != length) {
                                return false;
                            }
                            int charAt4 = str.charAt(i11) | ' ';
                            if (charAt4 != 102 && charAt4 != 100) {
                                return false;
                            }
                            return z;
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
                return false;
            }
        }
        z = true;
        z2 = false;
        if (!z2) {
        }
        int i112 = i3 + 1;
        charAt = str.charAt(i3) | ' ';
        if (!z2) {
        }
        if (charAt == i) {
        }
    }

    public static Float U(String str) {
        str.getClass();
        try {
            if (T(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
