package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws6  reason: default package */
/* loaded from: classes.dex */
public abstract class ws6 extends defpackage.vs6 {
    public static final boolean T(java.lang.String r19) {
            r0 = r19
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = r3
        La:
            r5 = 32
            if (r4 > r1) goto L17
            char r6 = r0.charAt(r4)
            if (r6 > r5) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            if (r4 <= r1) goto L1a
            return r3
        L1a:
            if (r1 <= r4) goto L25
            char r6 = r0.charAt(r1)
            if (r6 > r5) goto L25
            int r1 = r1 + (-1)
            goto L1a
        L25:
            char r6 = r0.charAt(r4)
            r7 = 45
            r8 = 43
            if (r6 == r8) goto L35
            char r6 = r0.charAt(r4)
            if (r6 != r7) goto L37
        L35:
            int r4 = r4 + 1
        L37:
            if (r4 <= r1) goto L3a
            return r3
        L3a:
            char r6 = r0.charAt(r4)
            r9 = 46
            r10 = 10
            r11 = 48
            r12 = 65535(0xffff, float:9.1834E-41)
            r13 = -1
            if (r6 != r11) goto Lc5
            int r6 = r4 + 1
            if (r6 <= r1) goto L4f
            return r2
        L4f:
            char r6 = r0.charAt(r6)
            r6 = r6 | r5
            r14 = 120(0x78, float:1.68E-43)
            if (r6 != r14) goto Lc5
            int r4 = r4 + 2
            r6 = r4
        L5b:
            r14 = 6
            if (r6 > r1) goto L77
            char r15 = r0.charAt(r6)
            int r16 = r15 + (-48)
            r17 = r2
            r2 = r16 & r12
            if (r2 >= r10) goto L6b
            goto L72
        L6b:
            r2 = r15 | 32
            int r2 = r2 + (-97)
            r2 = r2 & r12
            if (r2 >= r14) goto L79
        L72:
            int r6 = r6 + 1
            r2 = r17
            goto L5b
        L77:
            r17 = r2
        L79:
            if (r4 == r6) goto L7e
            r2 = r17
            goto L7f
        L7e:
            r2 = r3
        L7f:
            if (r6 <= r1) goto L85
            r18 = r5
        L83:
            r4 = r13
            goto Lbc
        L85:
            char r4 = r0.charAt(r6)
            if (r4 != r9) goto Lb3
            int r6 = r6 + 1
            r4 = r6
        L8e:
            if (r4 > r1) goto La9
            char r15 = r0.charAt(r4)
            int r16 = r15 + (-48)
            r18 = r5
            r5 = r16 & r12
            if (r5 >= r10) goto L9d
            goto La4
        L9d:
            r5 = r15 | 32
            int r5 = r5 + (-97)
            r5 = r5 & r12
            if (r5 >= r14) goto Lab
        La4:
            int r4 = r4 + 1
            r5 = r18
            goto L8e
        La9:
            r18 = r5
        Lab:
            if (r6 == r4) goto Lb0
            r5 = r17
            goto Lb1
        Lb0:
            r5 = r3
        Lb1:
            r6 = r4
            goto Lb6
        Lb3:
            r18 = r5
            r5 = r3
        Lb6:
            if (r2 != 0) goto Lbb
            if (r5 != 0) goto Lbb
            goto L83
        Lbb:
            r4 = r6
        Lbc:
            if (r4 == r13) goto Lc4
            if (r4 <= r1) goto Lc1
            goto Lc4
        Lc1:
            r2 = r17
            goto Lca
        Lc4:
            return r3
        Lc5:
            r17 = r2
            r18 = r5
            r2 = r3
        Lca:
            if (r2 != 0) goto L128
            r5 = r4
        Lcd:
            if (r5 > r1) goto Lda
            char r6 = r0.charAt(r5)
            int r6 = r6 - r11
            r6 = r6 & r12
            if (r6 >= r10) goto Lda
            int r5 = r5 + 1
            goto Lcd
        Lda:
            if (r4 == r5) goto Ldf
            r4 = r17
            goto Le0
        Ldf:
            r4 = r3
        Le0:
            if (r5 <= r1) goto Le4
            r4 = r5
            goto L122
        Le4:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto Lff
            int r5 = r5 + 1
            r6 = r5
        Led:
            if (r6 > r1) goto Lfa
            char r9 = r0.charAt(r6)
            int r9 = r9 - r11
            r9 = r9 & r12
            if (r9 >= r10) goto Lfa
            int r6 = r6 + 1
            goto Led
        Lfa:
            if (r5 == r6) goto L100
            r5 = r17
            goto L101
        Lff:
            r6 = r5
        L100:
            r5 = r3
        L101:
            if (r4 != 0) goto L121
            if (r5 != 0) goto L121
            int r4 = r6 + 2
            if (r1 != r4) goto L10c
            java.lang.String r4 = "NaN"
            goto L114
        L10c:
            int r4 = r6 + 7
            if (r1 != r4) goto L113
            java.lang.String r4 = "Infinity"
            goto L114
        L113:
            r4 = 0
        L114:
            if (r4 != 0) goto L118
        L116:
            r4 = r13
            goto L122
        L118:
            int r4 = defpackage.qs6.q0(r0, r4, r6, r3)
            if (r4 != r6) goto L116
            int r4 = r1 + 1
            goto L122
        L121:
            r4 = r6
        L122:
            if (r4 != r13) goto L125
            return r3
        L125:
            if (r4 <= r1) goto L128
            return r17
        L128:
            int r5 = r4 + 1
            char r6 = r0.charAt(r4)
            r6 = r6 | 32
            if (r2 == 0) goto L135
            r9 = 112(0x70, float:1.57E-43)
            goto L137
        L135:
            r9 = 101(0x65, float:1.42E-43)
        L137:
            r13 = 100
            r14 = 102(0x66, float:1.43E-43)
            if (r6 == r9) goto L147
            if (r2 != 0) goto L146
            if (r6 == r14) goto L143
            if (r6 != r13) goto L146
        L143:
            if (r5 <= r1) goto L146
            return r17
        L146:
            return r3
        L147:
            if (r5 <= r1) goto L14a
            return r3
        L14a:
            char r2 = r0.charAt(r5)
            if (r2 == r8) goto L156
            char r2 = r0.charAt(r5)
            if (r2 != r7) goto L15b
        L156:
            int r5 = r4 + 2
            if (r5 <= r1) goto L15b
            return r3
        L15b:
            if (r5 > r1) goto L168
            char r2 = r0.charAt(r5)
            int r2 = r2 - r11
            r2 = r2 & r12
            if (r2 >= r10) goto L168
            int r5 = r5 + 1
            goto L15b
        L168:
            if (r5 <= r1) goto L16b
            return r17
        L16b:
            if (r5 != r1) goto L17a
            char r0 = r0.charAt(r5)
            r0 = r0 | 32
            if (r0 == r14) goto L179
            if (r0 != r13) goto L178
            goto L179
        L178:
            return r3
        L179:
            return r17
        L17a:
            return r3
    }

    public static java.lang.Float U(java.lang.String r2) {
            r2.getClass()
            r0 = 0
            boolean r1 = T(r2)     // Catch: java.lang.NumberFormatException -> L13
            if (r1 == 0) goto L13
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L13
            return r2
        L13:
            return r0
    }
}
