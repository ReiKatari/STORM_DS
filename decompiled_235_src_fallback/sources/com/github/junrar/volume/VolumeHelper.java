package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VolumeHelper {
    private VolumeHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isDigit(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static java.lang.String nextVolumeName(java.lang.String r8, boolean r9) {
            r0 = 48
            r1 = 58
            r2 = 0
            r3 = 0
            if (r9 != 0) goto L67
            int r9 = r8.length()
            int r4 = r9 + (-1)
        Le:
            if (r4 < 0) goto L1d
            char r5 = r8.charAt(r4)
            boolean r5 = isDigit(r5)
            if (r5 != 0) goto L1d
            int r4 = r4 + (-1)
            goto Le
        L1d:
            int r5 = r4 + 1
            int r6 = r4 + (-1)
        L21:
            if (r6 < 0) goto L30
            char r7 = r8.charAt(r6)
            boolean r7 = isDigit(r7)
            if (r7 == 0) goto L30
            int r6 = r6 + (-1)
            goto L21
        L30:
            if (r6 >= 0) goto L33
            return r2
        L33:
            int r6 = r6 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r8, r3, r6)
            int r4 = r4 - r6
            int r7 = r4 + 1
            char[] r7 = new char[r7]
            r8.getChars(r6, r5, r7, r3)
        L45:
            if (r4 < 0) goto L55
            char r3 = r7[r4]
            int r3 = r3 + 1
            char r3 = (char) r3
            r7[r4] = r3
            if (r3 != r1) goto L55
            r7[r4] = r0
            int r4 = r4 + (-1)
            goto L45
        L55:
            if (r4 >= 0) goto L5c
            r0 = 49
            r2.append(r0)
        L5c:
            r2.append(r7)
            r2.append(r8, r5, r9)
            java.lang.String r8 = r2.toString()
            return r8
        L67:
            int r9 = r8.length()
            r4 = 4
            if (r9 <= r4) goto Lbf
            int r4 = r9 + (-4)
            char r4 = r8.charAt(r4)
            r5 = 46
            if (r4 == r5) goto L79
            goto Lbf
        L79:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r9 + (-3)
            r2.append(r8, r3, r4)
            int r5 = r9 + (-2)
            char r5 = r8.charAt(r5)
            boolean r5 = isDigit(r5)
            if (r5 == 0) goto Lb5
            int r5 = r9 + (-1)
            char r5 = r8.charAt(r5)
            boolean r5 = isDigit(r5)
            if (r5 != 0) goto L9c
            goto Lb5
        L9c:
            r5 = 3
            char[] r5 = new char[r5]
            r8.getChars(r4, r9, r5, r3)
            r8 = 2
        La3:
            char r9 = r5[r8]
            int r9 = r9 + 1
            char r9 = (char) r9
            r5[r8] = r9
            if (r9 != r1) goto Lb1
            r5[r8] = r0
            int r8 = r8 + (-1)
            goto La3
        Lb1:
            r2.append(r5)
            goto Lba
        Lb5:
            java.lang.String r8 = "r00"
            r2.append(r8)
        Lba:
            java.lang.String r8 = r2.toString()
            return r8
        Lbf:
            return r2
    }
}
