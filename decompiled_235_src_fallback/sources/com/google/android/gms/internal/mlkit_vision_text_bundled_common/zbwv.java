package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwv {
    public static final /* synthetic */ int zba = 0;

    static {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbx()
            if (r0 == 0) goto Le
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zby()
            if (r0 == 0) goto Le
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsm.zba
        Le:
            return
    }

    public static /* bridge */ /* synthetic */ int zba(byte[] r5, int r6, int r7) {
            int r7 = r7 - r6
            int r0 = r6 + (-1)
            r0 = r5[r0]
            r1 = -12
            if (r7 == 0) goto L35
            r2 = 1
            r3 = -65
            if (r7 == r2) goto L2a
            r4 = 2
            if (r7 != r4) goto L24
            r7 = r5[r6]
            int r6 = r6 + r2
            r5 = r5[r6]
            if (r0 > r1) goto L38
            if (r7 > r3) goto L38
            if (r5 <= r3) goto L1d
            goto L38
        L1d:
            int r6 = r7 << 8
            int r5 = r5 << 16
            r6 = r6 ^ r0
            r5 = r5 ^ r6
            return r5
        L24:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L2a:
            r5 = r5[r6]
            if (r0 > r1) goto L38
            if (r5 <= r3) goto L31
            goto L38
        L31:
            int r5 = r5 << 8
            r5 = r5 ^ r0
            return r5
        L35:
            if (r0 > r1) goto L38
            return r0
        L38:
            r5 = -1
            return r5
    }

    public static int zbb(java.lang.String r8, byte[] r9, int r10, int r11) {
            int r0 = r8.length()
            r1 = 0
        L5:
            int r2 = r10 + r11
            r3 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L1b
            int r4 = r1 + r10
            if (r4 >= r2) goto L1b
            char r5 = r8.charAt(r1)
            if (r5 >= r3) goto L1b
            byte r2 = (byte) r5
            r9[r4] = r2
            int r1 = r1 + 1
            goto L5
        L1b:
            if (r1 != r0) goto L1f
            int r10 = r10 + r0
            return r10
        L1f:
            int r10 = r10 + r1
        L20:
            if (r1 >= r0) goto Lfd
            char r11 = r8.charAt(r1)
            if (r11 >= r3) goto L32
            if (r10 >= r2) goto L32
            int r4 = r10 + 1
            byte r11 = (byte) r11
            r9[r10] = r11
            r10 = r4
            goto Lb8
        L32:
            r4 = 2048(0x800, float:2.87E-42)
            if (r11 >= r4) goto L4d
            int r4 = r2 + (-2)
            if (r10 > r4) goto L4d
            int r4 = r10 + 1
            int r5 = r10 + 2
            int r6 = r11 >>> 6
            r6 = r6 | 960(0x3c0, float:1.345E-42)
            byte r6 = (byte) r6
            r9[r10] = r6
            r10 = r11 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r4] = r10
            r10 = r5
            goto Lb8
        L4d:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r11 < r5) goto L57
            if (r11 <= r4) goto L78
        L57:
            int r6 = r2 + (-3)
            if (r10 > r6) goto L78
            int r4 = r10 + 1
            int r5 = r10 + 2
            int r6 = r10 + 3
            int r7 = r11 >>> 12
            r7 = r7 | 480(0x1e0, float:6.73E-43)
            byte r7 = (byte) r7
            r9[r10] = r7
            int r10 = r11 >>> 6
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r4] = r10
            r10 = r11 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r5] = r10
            r10 = r6
            goto Lb8
        L78:
            int r6 = r2 + (-4)
            if (r10 > r6) goto Lc5
            int r4 = r1 + 1
            int r5 = r8.length()
            if (r4 == r5) goto Lbd
            char r1 = r8.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r11, r1)
            if (r5 == 0) goto Lbc
            int r5 = r10 + 1
            int r6 = r10 + 2
            int r7 = r10 + 3
            int r11 = java.lang.Character.toCodePoint(r11, r1)
            int r1 = r11 >>> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r9[r10] = r1
            int r1 = r11 >>> 12
            r1 = r1 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1
            r9[r5] = r1
            int r1 = r11 >>> 6
            r1 = r1 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1
            r9[r6] = r1
            int r10 = r10 + 4
            r11 = r11 & 63
            r11 = r11 | r3
            byte r11 = (byte) r11
            r9[r7] = r11
            r1 = r4
        Lb8:
            int r1 = r1 + 1
            goto L20
        Lbc:
            r1 = r4
        Lbd:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu r8 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu
            int r1 = r1 + (-1)
            r8.<init>(r1, r0)
            throw r8
        Lc5:
            if (r11 < r5) goto Le1
            if (r11 > r4) goto Le1
            int r9 = r1 + 1
            int r2 = r8.length()
            if (r9 == r2) goto Ldb
            char r8 = r8.charAt(r9)
            boolean r8 = java.lang.Character.isSurrogatePair(r11, r8)
            if (r8 != 0) goto Le1
        Ldb:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu r8 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu
            r8.<init>(r1, r0)
            throw r8
        Le1:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed writing "
            r9.<init>(r0)
            r9.append(r11)
            java.lang.String r11 = " at index "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lfd:
            return r10
    }

    public static int zbc(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L13
            char r3 = r8.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            r3 = r0
        L14:
            if (r2 >= r0) goto L59
            char r4 = r8.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L26
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L26:
            int r4 = r8.length()
        L2a:
            if (r2 >= r4) goto L58
            char r6 = r8.charAt(r2)
            if (r6 >= r5) goto L38
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            int r1 = r1 + r6
            goto L55
        L38:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r7) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r8, r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu r8 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu
            r8.<init>(r2, r4)
            throw r8
        L55:
            int r2 = r2 + 1
            goto L2a
        L58:
            int r3 = r3 + r1
        L59:
            if (r3 < r0) goto L5c
            return r3
        L5c:
            long r0 = (long) r3
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UTF-8 length does not fit in int: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
    }

    public static boolean zbd(byte[] r6, int r7, int r8) {
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = zba(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = zba(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
    }
}
