package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class HexDumpUtils {
    public HexDumpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.String dump(byte[] r10, int r11, int r12, boolean r13) {
            if (r10 == 0) goto Lbf
            int r0 = r10.length
            if (r0 == 0) goto Lbf
            if (r11 < 0) goto Lbf
            if (r12 <= 0) goto Lbf
            int r1 = r11 + r12
            if (r1 <= r0) goto Lf
            goto Lbf
        Lf:
            if (r13 == 0) goto L14
            r0 = 75
            goto L16
        L14:
            r0 = 57
        L16:
            int r1 = r12 + 15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r1 = r1 / r3
            int r1 = r1 * r0
            r2.<init>(r1)
            r0 = 0
            r1 = r12
            r4 = r0
            r5 = r4
        L25:
            if (r1 <= 0) goto Lba
            r6 = 8
            if (r4 != 0) goto L54
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r12 >= r5) goto L41
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r7 = "%04X:"
            java.lang.String r5 = java.lang.String.format(r7, r5)
            r2.append(r5)
            goto L52
        L41:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r7 = "%08X:"
            java.lang.String r5 = java.lang.String.format(r7, r5)
            r2.append(r5)
        L52:
            r5 = r11
            goto L5b
        L54:
            if (r4 != r6) goto L5b
            java.lang.String r7 = " -"
            r2.append(r7)
        L5b:
            r7 = r10[r11]
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = " %02X"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r2.append(r7)
            int r1 = r1 + (-1)
            int r4 = r4 + 1
            if (r13 == 0) goto Lac
            if (r4 == r3) goto L7a
            if (r1 != 0) goto Lac
        L7a:
            int r7 = 16 - r4
            if (r7 <= 0) goto L89
            r8 = r0
        L7f:
            if (r8 >= r7) goto L89
            java.lang.String r9 = "   "
            r2.append(r9)
            int r8 = r8 + 1
            goto L7f
        L89:
            java.lang.String r8 = "  "
            if (r7 < r6) goto L90
            r2.append(r8)
        L90:
            r2.append(r8)
            r6 = r0
        L94:
            if (r6 >= r4) goto Lac
            int r7 = r5 + r6
            r7 = r10[r7]
            char r7 = (char) r7
            r8 = 32
            r9 = 46
            if (r7 < r8) goto La5
            r8 = 126(0x7e, float:1.77E-43)
            if (r7 <= r8) goto La6
        La5:
            r7 = r9
        La6:
            r2.append(r7)
            int r6 = r6 + 1
            goto L94
        Lac:
            if (r4 == r3) goto Lb0
            if (r1 != 0) goto Lb6
        Lb0:
            r4 = 10
            r2.append(r4)
            r4 = r0
        Lb6:
            int r11 = r11 + 1
            goto L25
        Lba:
            java.lang.String r10 = r2.toString()
            return r10
        Lbf:
            r10 = 0
            return r10
    }
}
