package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbsr {
    public static final /* synthetic */ int zba = 0;
    private static volatile int zbb = 100;

    public static int zba(byte[] r3, int r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r5) {
            int r4 = zbk(r3, r4, r5)
            int r0 = r5.zba
            r1 = 0
            if (r0 < 0) goto L22
            int r2 = r3.length
            int r2 = r2 - r4
            if (r0 > r2) goto L1c
            if (r0 != 0) goto L14
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            r5.zbc = r3
            return r4
        L14:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbj(r3, r4, r0)
            r5.zbc = r3
            int r4 = r4 + r0
            return r4
        L1c:
            java.lang.String r3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.fa6.j(r3)
            return r1
        L22:
            java.lang.String r3 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            defpackage.fa6.j(r3)
            return r1
    }

    public static int zbb(int r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r11, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r12, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r13) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r10 = r10.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r12 = r11.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r12 = r12.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww.zbn
            r1 = 0
            if (r12 == r0) goto L115
            int r12 = r12.ordinal()
            r0 = 0
            switch(r12) {
                case 0: goto Lff;
                case 1: goto Lee;
                case 2: goto Le1;
                case 3: goto Le1;
                case 4: goto Ld4;
                case 5: goto Lc7;
                case 6: goto Lba;
                case 7: goto La6;
                case 8: goto L9c;
                case 9: goto L6c;
                case 10: goto L43;
                case 11: goto L3b;
                case 12: goto Ld4;
                case 13: goto L35;
                case 14: goto Lba;
                case 15: goto Lc7;
                case 16: goto L25;
                case 17: goto L15;
                default: goto L13;
            }
        L13:
            goto L10f
        L15:
            int r8 = zbn(r7, r8, r13)
            long r6 = r13.zbb
            long r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            goto L10f
        L25:
            int r8 = zbk(r7, r8, r13)
            int r6 = r13.zba
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L10f
        L35:
            java.lang.String r6 = "Shouldn't reach here."
            defpackage.i.m(r6)
            return r0
        L3b:
            int r8 = zba(r7, r8, r13)
            java.lang.Object r1 = r13.zbc
            goto L10f
        L43:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r6 = r11.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r6 = r6.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = r12.zbb(r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r6 = r11.zbb
            java.lang.Object r6 = r10.zbf(r6)
            if (r6 != 0) goto L62
            java.lang.Object r6 = r1.zbe()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r11 = r11.zbb
            r10.zbj(r11, r6)
        L62:
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r13
            int r6 = zbp(r0, r1, r2, r3, r4, r5)
            return r6
        L6c:
            r3 = r8
            r4 = r9
            r9 = r7
            int r6 = r6 >>> 3
            int r6 = r6 << 3
            r12 = r6 | 4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r6 = r11.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r6 = r6.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r8 = r7.zbb(r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r6 = r11.zbb
            java.lang.Object r6 = r10.zbf(r6)
            if (r6 != 0) goto L94
            java.lang.Object r6 = r8.zbe()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r7 = r11.zbb
            r10.zbj(r7, r6)
        L94:
            r7 = r6
            r10 = r3
            r11 = r4
            int r6 = zbo(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L9c:
            r9 = r7
            r3 = r8
            int r8 = zbh(r9, r3, r13)
            java.lang.Object r1 = r13.zbc
            goto L10f
        La6:
            r9 = r7
            r3 = r8
            int r8 = zbn(r9, r3, r13)
            long r6 = r13.zbb
            r12 = 0
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto Lb5
            r0 = 1
        Lb5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L10f
        Lba:
            r9 = r7
            r3 = r8
            int r8 = r3 + 4
            int r6 = zbc(r9, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L10f
        Lc7:
            r9 = r7
            r3 = r8
            int r8 = r3 + 8
            long r6 = zbr(r9, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            goto L10f
        Ld4:
            r9 = r7
            r3 = r8
            int r8 = zbk(r9, r3, r13)
            int r6 = r13.zba
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L10f
        Le1:
            r9 = r7
            r3 = r8
            int r8 = zbn(r9, r3, r13)
            long r6 = r13.zbb
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            goto L10f
        Lee:
            r9 = r7
            r3 = r8
            int r8 = r3 + 4
            int r6 = zbc(r9, r3)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            goto L10f
        Lff:
            r9 = r7
            r3 = r8
            int r8 = r3 + 8
            long r6 = zbr(r9, r3)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
        L10f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r6 = r11.zbb
            r10.zbj(r6, r1)
            return r8
        L115:
            r9 = r7
            r3 = r8
            zbk(r9, r3, r13)
            throw r1
    }

    public static int zbc(byte[] r3, int r4) {
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 << 8
            r4 = r4 | r0
            int r0 = r2 << 16
            r4 = r4 | r0
            int r3 = r3 << 24
            r3 = r3 | r4
            return r3
    }

    public static int zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7, byte[] r8, int r9, int r10, int r11, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r12) {
            java.lang.Object r0 = r7.zbe()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r7 = zbo(r0, r1, r2, r3, r4, r5, r6)
            r1.zbf(r0)
            r6.zbc = r0
            return r7
    }

    public static int zbe(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r10) {
            java.lang.Object r0 = r6.zbe()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            int r6 = zbp(r0, r1, r2, r3, r4, r5)
            r1.zbf(r0)
            r5.zbc = r0
            return r6
    }

    public static int zbf(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r8) {
            int r5 = zbe(r2, r4, r5, r6, r8)
            java.lang.Object r0 = r8.zbc
            r7.add(r0)
        L9:
            if (r5 >= r6) goto L1e
            int r0 = zbk(r4, r5, r8)
            int r1 = r8.zba
            if (r3 == r1) goto L14
            goto L1e
        L14:
            int r5 = zbe(r2, r4, r0, r6, r8)
            java.lang.Object r0 = r8.zbc
            r7.add(r0)
            goto L9
        L1e:
            return r5
    }

    public static int zbg(byte[] r2, int r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r5) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r4
            int r3 = zbk(r2, r3, r5)
            int r0 = r5.zba
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = zbk(r2, r3, r5)
            int r1 = r5.zba
            r4.zbg(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.fa6.j(r2)
            r2 = 0
            return r2
    }

    public static int zbh(byte[] r3, int r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r5) {
            int r4 = zbk(r3, r4, r5)
            int r0 = r5.zba
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.zbc = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r1.<init>(r3, r4, r0, r2)
            r5.zbc = r1
            int r4 = r4 + r0
            return r4
        L1a:
            java.lang.String r3 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            defpackage.fa6.j(r3)
            r3 = 0
            return r3
    }

    public static int zbi(byte[] r9, int r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r11) {
            int r10 = zbk(r9, r10, r11)
            int r0 = r11.zba
            r1 = 0
            if (r0 < 0) goto Lcb
            if (r0 != 0) goto L10
            java.lang.String r9 = ""
            r11.zbc = r9
            return r10
        L10:
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zba
            int r2 = r9.length
            int r3 = r2 - r10
            r4 = r10 | r0
            int r3 = r3 - r0
            r3 = r3 | r4
            if (r3 < 0) goto Laf
            int r2 = r10 + r0
            char[] r7 = new char[r0]
            r0 = r1
        L20:
            if (r10 >= r2) goto L33
            r3 = r9[r10]
            boolean r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zbd(r3)
            if (r4 == 0) goto L33
            int r10 = r10 + 1
            int r4 = r0 + 1
            char r3 = (char) r3
            r7[r0] = r3
            r0 = r4
            goto L20
        L33:
            r8 = r0
        L34:
            if (r10 >= r2) goto La7
            int r0 = r10 + 1
            r3 = r9[r10]
            boolean r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zbd(r3)
            if (r4 == 0) goto L5a
            int r10 = r8 + 1
            char r3 = (char) r3
            r7[r8] = r3
            r8 = r10
            r10 = r0
        L47:
            if (r10 >= r2) goto L34
            r0 = r9[r10]
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zbd(r0)
            if (r3 == 0) goto L34
            int r10 = r10 + 1
            int r3 = r8 + 1
            char r0 = (char) r0
            r7[r8] = r0
            r8 = r3
            goto L47
        L5a:
            r4 = -32
            java.lang.String r5 = "Protocol message had invalid UTF-8."
            if (r3 >= r4) goto L71
            if (r0 >= r2) goto L6d
            int r4 = r8 + 1
            int r10 = r10 + 2
            r0 = r9[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zbc(r3, r0, r7, r8)
        L6b:
            r8 = r4
            goto L34
        L6d:
            defpackage.fa6.j(r5)
            return r1
        L71:
            r4 = -16
            if (r3 >= r4) goto L8b
            int r4 = r2 + (-1)
            if (r0 >= r4) goto L87
            int r4 = r8 + 1
            int r5 = r10 + 2
            r0 = r9[r0]
            int r10 = r10 + 3
            r5 = r9[r5]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zbb(r3, r0, r5, r7, r8)
            goto L6b
        L87:
            defpackage.fa6.j(r5)
            return r1
        L8b:
            int r4 = r2 + (-2)
            if (r0 >= r4) goto La3
            int r4 = r10 + 2
            r0 = r9[r0]
            int r5 = r10 + 3
            r4 = r9[r4]
            int r10 = r10 + 4
            r6 = r9[r5]
            r5 = r4
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwt.zba(r3, r4, r5, r6, r7, r8)
            int r8 = r8 + 2
            goto L34
        La3:
            defpackage.fa6.j(r5)
            return r1
        La7:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r7, r1, r8)
            r11.zbc = r9
            return r2
        Laf:
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r11, r10, r0}
            java.lang.String r11 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        Lcb:
            java.lang.String r9 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            defpackage.fa6.j(r9)
            return r1
    }

    public static int zbj(int r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r14, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r15) {
            int r0 = r10 >>> 3
            r1 = 0
            java.lang.String r2 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto Lb0
            r0 = r10 & 7
            if (r0 == 0) goto La0
            r3 = 1
            if (r0 == r3) goto L91
            r4 = 2
            if (r0 == r4) goto L66
            r4 = 3
            if (r0 == r4) goto L29
            r13 = 5
            if (r0 != r13) goto L25
            int r11 = zbc(r11, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.zbj(r10, r11)
            int r12 = r12 + 4
            return r12
        L25:
            defpackage.fa6.j(r2)
            return r1
        L29:
            r0 = r10 & (-8)
            r0 = r0 | 4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbf()
            int r2 = r15.zbe
            int r2 = r2 + r3
            r15.zbe = r2
            zbs(r2)
            r2 = r1
        L3a:
            if (r12 >= r13) goto L46
            int r6 = zbk(r11, r12, r15)
            int r4 = r15.zba
            if (r4 != r0) goto L49
            r2 = r4
            r12 = r6
        L46:
            r7 = r13
            r9 = r15
            goto L52
        L49:
            r5 = r11
            r7 = r13
            r9 = r15
            int r12 = zbj(r4, r5, r6, r7, r8, r9)
            r2 = r4
            goto L3a
        L52:
            int r11 = r9.zbe
            int r11 = r11 + (-1)
            r9.zbe = r11
            if (r12 > r7) goto L60
            if (r2 != r0) goto L60
            r14.zbj(r10, r8)
            return r12
        L60:
            java.lang.String r10 = "Failed to parse the message."
            defpackage.fa6.j(r10)
            return r1
        L66:
            r5 = r11
            r9 = r15
            int r11 = zbk(r5, r12, r9)
            int r12 = r9.zba
            if (r12 < 0) goto L8b
            int r13 = r5.length
            int r13 = r13 - r11
            if (r12 > r13) goto L85
            if (r12 != 0) goto L7c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            r14.zbj(r10, r13)
            goto L83
        L7c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbj(r5, r11, r12)
            r14.zbj(r10, r13)
        L83:
            int r11 = r11 + r12
            return r11
        L85:
            java.lang.String r10 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.fa6.j(r10)
            return r1
        L8b:
            java.lang.String r10 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            defpackage.fa6.j(r10)
            return r1
        L91:
            r5 = r11
            long r0 = zbr(r5, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r14.zbj(r10, r11)
            int r12 = r12 + 8
            return r12
        La0:
            r5 = r11
            r9 = r15
            int r11 = zbn(r5, r12, r9)
            long r12 = r9.zbb
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r14.zbj(r10, r12)
            return r11
        Lb0:
            defpackage.fa6.j(r2)
            return r1
    }

    public static int zbk(byte[] r1, int r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.zba = r2
            return r0
        L9:
            int r1 = zbl(r2, r1, r0, r3)
            return r1
    }

    public static int zbl(int r2, byte[] r3, int r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r5) {
            r0 = r3[r4]
            int r1 = r4 + 1
            r2 = r2 & 127(0x7f, float:1.78E-43)
            if (r0 < 0) goto Le
            int r3 = r0 << 7
            r2 = r2 | r3
            r5.zba = r2
            return r1
        Le:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 7
            r2 = r2 | r0
            int r0 = r4 + 2
            r1 = r3[r1]
            if (r1 < 0) goto L1f
            int r3 = r1 << 14
            r2 = r2 | r3
            r5.zba = r2
            return r0
        L1f:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << 14
            r2 = r2 | r1
            int r1 = r4 + 3
            r0 = r3[r0]
            if (r0 < 0) goto L30
            int r3 = r0 << 21
            r2 = r2 | r3
            r5.zba = r2
            return r1
        L30:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 21
            r2 = r2 | r0
            int r4 = r4 + 4
            r0 = r3[r1]
            if (r0 < 0) goto L41
            int r3 = r0 << 28
            r2 = r2 | r3
            r5.zba = r2
            return r4
        L41:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r2 = r2 | r0
        L46:
            int r0 = r4 + 1
            r4 = r3[r4]
            if (r4 >= 0) goto L4e
            r4 = r0
            goto L46
        L4e:
            r5.zba = r2
            return r0
    }

    public static int zbm(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r6, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r7) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r6
            int r4 = zbk(r3, r4, r7)
            int r0 = r7.zba
            r6.zbg(r0)
        Lb:
            if (r4 >= r5) goto L20
            int r0 = zbk(r3, r4, r7)
            int r1 = r7.zba
            if (r2 == r1) goto L16
            goto L20
        L16:
            int r4 = zbk(r3, r0, r7)
            int r0 = r7.zba
            r6.zbg(r0)
            goto Lb
        L20:
            return r4
    }

    public static int zbn(byte[] r9, int r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r11) {
            r0 = r9[r10]
            long r0 = (long) r0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r3 = r10 + 1
            if (r2 < 0) goto Le
            r11.zbb = r0
            return r3
        Le:
            int r10 = r10 + 2
            r2 = r9[r3]
            r3 = r2 & 127(0x7f, float:1.78E-43)
            r4 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r4
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = r5
        L1c:
            if (r2 >= 0) goto L2c
            int r2 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r0 = r0 | r6
            r8 = r2
            r2 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.zbb = r0
            return r10
    }

    public static int zbo(java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r3, byte[] r4, int r5, int r6, int r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r8) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp) r3
            int r0 = r8.zbe
            int r0 = r0 + 1
            r8.zbe = r0
            zbs(r0)
            r1 = r3
            r3 = r2
            r2 = r1
            int r2 = r2.zbc(r3, r4, r5, r6, r7, r8)
            int r4 = r8.zbe
            int r4 = r4 + (-1)
            r8.zbe = r4
            r8.zbc = r3
            return r2
    }

    public static int zbp(java.lang.Object r6, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r11) {
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto Lc
            int r0 = zbl(r9, r8, r0, r11)
            int r9 = r11.zba
        Lc:
            r3 = r0
            if (r9 < 0) goto L2d
            int r10 = r10 - r3
            if (r9 > r10) goto L2d
            int r10 = r11.zbe
            int r10 = r10 + 1
            r11.zbe = r10
            zbs(r10)
            int r4 = r3 + r9
            r1 = r6
            r0 = r7
            r2 = r8
            r5 = r11
            r0.zbh(r1, r2, r3, r4, r5)
            int r6 = r5.zbe
            int r6 = r6 + (-1)
            r5.zbe = r6
            r5.zbc = r1
            return r4
        L2d:
            java.lang.String r6 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.fa6.j(r6)
            r6 = 0
            return r6
    }

    public static int zbq(int r4, byte[] r5, int r6, int r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r8) {
            int r0 = r4 >>> 3
            r1 = 0
            java.lang.String r2 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto L4d
            r0 = r4 & 7
            if (r0 == 0) goto L48
            r3 = 1
            if (r0 == r3) goto L45
            r3 = 2
            if (r0 == r3) goto L3d
            r3 = 3
            if (r0 == r3) goto L1e
            r4 = 5
            if (r0 != r4) goto L1a
            int r6 = r6 + 4
            return r6
        L1a:
            defpackage.fa6.j(r2)
            return r1
        L1e:
            r4 = r4 & (-8)
            r4 = r4 | 4
            r0 = r1
        L23:
            if (r6 >= r7) goto L32
            int r6 = zbk(r5, r6, r8)
            int r0 = r8.zba
            if (r0 == r4) goto L32
            int r6 = zbq(r0, r5, r6, r7, r8)
            goto L23
        L32:
            if (r6 > r7) goto L37
            if (r0 != r4) goto L37
            return r6
        L37:
            java.lang.String r4 = "Failed to parse the message."
            defpackage.fa6.j(r4)
            return r1
        L3d:
            int r4 = zbk(r5, r6, r8)
            int r5 = r8.zba
            int r4 = r4 + r5
            return r4
        L45:
            int r6 = r6 + 8
            return r6
        L48:
            int r4 = zbn(r5, r6, r8)
            return r4
        L4d:
            defpackage.fa6.j(r2)
            return r1
    }

    public static long zbr(byte[] r18, int r19) {
            r0 = r18[r19]
            long r0 = (long) r0
            int r2 = r19 + 1
            r2 = r18[r2]
            long r2 = (long) r2
            int r4 = r19 + 2
            r4 = r18[r4]
            long r4 = (long) r4
            int r6 = r19 + 3
            r6 = r18[r6]
            long r6 = (long) r6
            int r8 = r19 + 4
            r8 = r18[r8]
            long r8 = (long) r8
            int r10 = r19 + 5
            r10 = r18[r10]
            long r10 = (long) r10
            int r12 = r19 + 6
            r12 = r18[r12]
            long r12 = (long) r12
            int r14 = r19 + 7
            r14 = r18[r14]
            long r14 = (long) r14
            r16 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r16
            long r4 = r4 & r16
            long r6 = r6 & r16
            long r8 = r8 & r16
            long r10 = r10 & r16
            long r12 = r12 & r16
            long r14 = r14 & r16
            long r0 = r0 & r16
            r16 = 8
            long r2 = r2 << r16
            long r0 = r0 | r2
            r2 = 16
            long r2 = r4 << r2
            long r0 = r0 | r2
            r2 = 24
            long r2 = r6 << r2
            long r0 = r0 | r2
            r2 = 32
            long r2 = r8 << r2
            long r0 = r0 | r2
            r2 = 40
            long r2 = r10 << r2
            long r0 = r0 | r2
            r2 = 48
            long r2 = r12 << r2
            long r0 = r0 | r2
            r2 = 56
            long r2 = r14 << r2
            long r0 = r0 | r2
            return r0
    }

    private static void zbs(int r1) {
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbb
            if (r1 >= r0) goto L5
            return
        L5:
            java.lang.String r1 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            defpackage.fa6.j(r1)
            return
    }
}
