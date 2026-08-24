package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwt {
    public static /* bridge */ /* synthetic */ void zba(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            boolean r0 = zbe(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L41
            boolean r0 = zbe(r4)
            if (r0 != 0) goto L41
            boolean r0 = zbe(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            r3 = r3 & 63
            r4 = r4 & 63
            r5 = r5 & 63
            int r2 = r2 << 18
            int r3 = r3 << 12
            r2 = r2 | r3
            int r3 = r4 << 6
            r2 = r2 | r3
            r2 = r2 | r5
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r6[r7] = r3
            int r7 = r7 + 1
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            java.lang.String r2 = "Protocol message had invalid UTF-8."
            defpackage.fa6.j(r2)
            return
    }

    public static /* bridge */ /* synthetic */ void zbb(byte r2, byte r3, byte r4, char[] r5, int r6) {
            boolean r0 = zbe(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = zbe(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            java.lang.String r2 = "Protocol message had invalid UTF-8."
            defpackage.fa6.j(r2)
            return
    }

    public static /* bridge */ /* synthetic */ void zbc(byte r1, byte r2, char[] r3, int r4) {
            r0 = -62
            if (r1 < r0) goto L15
            boolean r0 = zbe(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            defpackage.fa6.j(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean zbd(byte r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    private static boolean zbe(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
