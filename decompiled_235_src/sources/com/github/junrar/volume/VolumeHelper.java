package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VolumeHelper {
    private VolumeHelper() {
    }

    private static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static String nextVolumeName(String str, boolean z) {
        if (!z) {
            int length = str.length();
            int i = length - 1;
            while (i >= 0 && !isDigit(str.charAt(i))) {
                i--;
            }
            int i2 = i + 1;
            int i3 = i - 1;
            while (i3 >= 0 && isDigit(str.charAt(i3))) {
                i3--;
            }
            if (i3 < 0) {
                return null;
            }
            int i4 = i3 + 1;
            StringBuilder sb = new StringBuilder(length);
            sb.append((CharSequence) str, 0, i4);
            int i5 = i - i4;
            char[] cArr = new char[i5 + 1];
            str.getChars(i4, i2, cArr, 0);
            while (i5 >= 0) {
                char c = (char) (cArr[i5] + 1);
                cArr[i5] = c;
                if (c != ':') {
                    break;
                }
                cArr[i5] = '0';
                i5--;
            }
            if (i5 < 0) {
                sb.append('1');
            }
            sb.append(cArr);
            sb.append((CharSequence) str, i2, length);
            return sb.toString();
        }
        int length2 = str.length();
        if (length2 <= 4 || str.charAt(length2 - 4) != '.') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i6 = length2 - 3;
        sb2.append((CharSequence) str, 0, i6);
        if (isDigit(str.charAt(length2 - 2)) && isDigit(str.charAt(length2 - 1))) {
            char[] cArr2 = new char[3];
            str.getChars(i6, length2, cArr2, 0);
            int i7 = 2;
            while (true) {
                char c2 = (char) (cArr2[i7] + 1);
                cArr2[i7] = c2;
                if (c2 != ':') {
                    break;
                }
                cArr2[i7] = '0';
                i7--;
            }
            sb2.append(cArr2);
        } else {
            sb2.append("r00");
        }
        return sb2.toString();
    }
}
