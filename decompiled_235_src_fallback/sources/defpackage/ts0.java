package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts0  reason: default package */
/* loaded from: classes.dex */
public final class ts0 extends defpackage.j0 {
    public static final byte[] c = null;
    public final /* synthetic */ int b;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            defpackage.ts0.c = r0
            return
    }

    public /* synthetic */ ts0(java.lang.Class[] r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>(r1)
            return
    }

    public static int c(defpackage.ps0 r4) {
            byte[] r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L34
            int r1 = r4.length
            r2 = 1
            if (r1 < r2) goto L2e
            r4 = r4[r0]
            r1 = r4 & 255(0xff, float:3.57E-43)
            r3 = r4 & 192(0xc0, float:2.69E-43)
            if (r3 != 0) goto L28
            r3 = 40
            if (r1 > r3) goto L22
            if (r1 != r3) goto L19
            r4 = -1
            return r4
        L19:
            r4 = r4 & r2
            r4 = r4 | 2
            int r1 = r1 / 2
            int r1 = r1 + 11
            int r4 = r4 << r1
            return r4
        L22:
            java.lang.String r4 = "Dictionary larger than 4GiB maximum size"
            defpackage.e41.i(r4)
            return r0
        L28:
            java.lang.String r4 = "Unsupported LZMA2 property bits"
            defpackage.e41.i(r4)
            return r0
        L2e:
            java.lang.String r4 = "LZMA2 properties too short"
            defpackage.e41.i(r4)
            return r0
        L34:
            java.lang.String r4 = "Missing LZMA2 properties"
            defpackage.e41.i(r4)
            return r0
    }

    public static int d(defpackage.ps0 r8) {
            byte[] r8 = r8.d
            r0 = 0
            r2 = 0
        L5:
            r3 = 4
            if (r2 >= r3) goto L16
            r3 = 1
            int r3 = r3 + r2
            r4 = r8[r3]
            long r4 = (long) r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r2 = r2 * 8
            long r4 = r4 << r2
            long r0 = r0 | r4
            r2 = r3
            goto L5
        L16:
            int r8 = (int) r0
            return r8
    }

    @Override // defpackage.j0
    public final java.io.InputStream a(java.lang.String r9, java.io.InputStream r10, long r11, defpackage.ps0 r13, byte[] r14, int r15) {
            r8 = this;
            int r2 = r8.b
            r4 = 0
            r6 = 1
            switch(r2) {
                case 0: goto Lec;
                case 1: goto Le6;
                case 2: goto Le0;
                case 3: goto Ldf;
                case 4: goto Ld9;
                case 5: goto Lb0;
                case 6: goto L8c;
                default: goto L7;
            }
        L7:
            byte[] r2 = r13.d
            r5 = 0
            if (r2 == 0) goto L85
            int r7 = r2.length
            if (r7 < r6) goto L7e
            r4 = r2[r4]
            r2 = r5
            int r5 = d(r13)
            r1 = 2147483632(0x7ffffff0, float:NaN)
            if (r5 > r1) goto L74
            int r0 = defpackage.yi3.g0
            if (r5 < 0) goto L6c
            if (r5 > r1) goto L6c
            r0 = r4 & 255(0xff, float:3.57E-43)
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 > r1) goto L64
            int r0 = r0 % 45
            int r1 = r0 / 9
            int r7 = r1 * 9
            int r0 = r0 - r7
            if (r0 < 0) goto L5d
            r7 = 8
            if (r0 > r7) goto L5d
            if (r1 < 0) goto L5d
            r7 = 4
            if (r1 > r7) goto L5d
            int r2 = defpackage.yi3.e(r5)
            int r2 = r2 / 1024
            int r2 = r2 + 10
            r7 = 1536(0x600, float:2.152E-42)
            int r0 = r0 + r1
            int r0 = r7 << r0
            int r0 = r0 / 1024
            int r0 = r0 + r2
            if (r0 > r15) goto L56
            yi3 r0 = new yi3
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r5)
            r0.Z = r6
            r5 = r0
            goto L8b
        L56:
            gb2 r1 = new gb2
            long r4 = (long) r0
            r1.<init>(r15, r4)
            throw r1
        L5d:
            java.lang.String r0 = "Invalid lc or lp"
            defpackage.i.h(r0)
        L62:
            r5 = r2
            goto L8b
        L64:
            e71 r0 = new e71
            java.lang.String r1 = "Invalid LZMA properties byte"
            r0.<init>(r1)
            throw r0
        L6c:
            lh7 r0 = new lh7
            java.lang.String r1 = "LZMA dictionary is too big for this implementation"
            r0.<init>(r1)
            throw r0
        L74:
            java.lang.String r1 = "Dictionary larger than 4GiB maximum size used in "
            java.lang.String r0 = defpackage.i61.m(r1, r9)
            defpackage.e41.i(r0)
            goto L62
        L7e:
            r2 = r5
            java.lang.String r0 = "LZMA properties too short"
            defpackage.e41.i(r0)
            goto L8b
        L85:
            r2 = r5
            java.lang.String r0 = "Missing LZMA properties"
            defpackage.e41.i(r0)
        L8b:
            return r5
        L8c:
            int r0 = c(r13)     // Catch: java.lang.IllegalArgumentException -> La9
            int r1 = defpackage.vi3.h(r0)     // Catch: java.lang.IllegalArgumentException -> La9
            int r1 = r1 / 1024
            int r1 = r1 + 104
            if (r1 > r15) goto La2
            vi3 r1 = new vi3     // Catch: java.lang.IllegalArgumentException -> La9
            mu r3 = defpackage.mu.a     // Catch: java.lang.IllegalArgumentException -> La9
            r1.<init>(r10, r0, r3)     // Catch: java.lang.IllegalArgumentException -> La9
            return r1
        La2:
            gb2 r0 = new gb2     // Catch: java.lang.IllegalArgumentException -> La9
            long r1 = (long) r1     // Catch: java.lang.IllegalArgumentException -> La9
            r0.<init>(r15, r1)     // Catch: java.lang.IllegalArgumentException -> La9
            throw r0     // Catch: java.lang.IllegalArgumentException -> La9
        La9:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        Lb0:
            byte[] r0 = r13.d
            if (r0 == 0) goto Lbe
            int r1 = r0.length
            if (r1 != 0) goto Lb8
            goto Lbe
        Lb8:
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r6
            goto Lbf
        Lbe:
            r0 = r6
        Lbf:
            if (r0 < r6) goto Lcd
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto Lcd
            mu r1 = defpackage.mu.a
            ph1 r1 = new ph1
            r1.<init>(r10, r0)
            return r1
        Lcd:
            lh7 r1 = new lh7
            java.lang.String r2 = "Delta distance must be in the range [1, 256]: "
            java.lang.String r0 = defpackage.lb1.g(r0, r2)
            r1.<init>(r0)
            throw r1
        Ld9:
            sg1 r0 = new sg1
            r0.<init>(r10)
            return r0
        Ldf:
            return r10
        Le0:
            a00 r0 = new a00
            r0.<init>(r10)
            return r0
        Le6:
            m r3 = new m
            r3.<init>(r10, r13, r9, r14)
            return r3
        Lec:
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>(r6)
            java.util.zip.InflaterInputStream r1 = new java.util.zip.InflaterInputStream
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            byte[] r6 = defpackage.ts0.c
            r5.<init>(r6)
            r3.<init>(r10, r5)
            r1.<init>(r3, r0)
            ss0 r2 = new ss0
            r2.<init>(r1, r0, r4)
            return r2
    }

    @Override // defpackage.j0
    public java.lang.Object b(defpackage.ps0 r6) {
            r5 = this;
            int r0 = r5.b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 5: goto L9e;
                case 6: goto L95;
                case 7: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = super.b(r6)
            return r5
        Lc:
            byte[] r5 = r6.d
            r0 = 0
            if (r5 == 0) goto L8f
            int r3 = r5.length
            if (r3 < r2) goto L89
            r5 = r5[r1]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r0 = r5 / 45
            int r1 = r0 * 45
            int r5 = r5 - r1
            int r1 = r5 / 9
            int r2 = r1 * 9
            int r5 = r5 - r2
            wi3 r2 = new wi3
            r2.<init>()
            int[] r3 = defpackage.wi3.B     // Catch: defpackage.lh7 -> L83
            r4 = 6
            r3 = r3[r4]     // Catch: defpackage.lh7 -> L83
            r2.A = r3     // Catch: defpackage.lh7 -> L83
            if (r0 < 0) goto L77
            r3 = 4
            if (r0 > r3) goto L77
            if (r5 < 0) goto L69
            if (r1 < 0) goto L69
            if (r5 > r3) goto L69
            if (r1 > r3) goto L69
            int r0 = r5 + r1
            if (r0 > r3) goto L69
            int r5 = d(r6)
            r6 = 4096(0x1000, float:5.74E-42)
            java.lang.String r0 = " B"
            if (r5 < r6) goto L5d
            r6 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 > r6) goto L51
            r2.A = r5
            r0 = r2
            goto L94
        L51:
            lh7 r6 = new lh7
            java.lang.String r1 = "LZMA2 dictionary size must not exceed 768 MiB: "
            java.lang.String r5 = defpackage.lb1.k(r1, r5, r0)
            r6.<init>(r5)
            throw r6
        L5d:
            lh7 r6 = new lh7
            java.lang.String r1 = "LZMA2 dictionary size must be at least 4 KiB: "
            java.lang.String r5 = defpackage.lb1.k(r1, r5, r0)
            r6.<init>(r5)
            throw r6
        L69:
            lh7 r6 = new lh7
            java.lang.String r0 = "lc + lp must not exceed 4: "
            java.lang.String r2 = " + "
            java.lang.String r5 = defpackage.lb1.j(r0, r5, r1, r2)
            r6.<init>(r5)
            throw r6
        L77:
            lh7 r5 = new lh7
            java.lang.String r6 = "pb must not exceed 4: "
            java.lang.String r6 = defpackage.lb1.g(r0, r6)
            r5.<init>(r6)
            throw r5
        L83:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>()
            throw r5
        L89:
            java.lang.String r5 = "LZMA properties too short"
            defpackage.e41.i(r5)
            goto L94
        L8f:
            java.lang.String r5 = "Missing LZMA properties"
            defpackage.e41.i(r5)
        L94:
            return r0
        L95:
            int r5 = c(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L9e:
            byte[] r5 = r6.d
            if (r5 == 0) goto Lab
            int r6 = r5.length
            if (r6 != 0) goto La6
            goto Lab
        La6:
            r5 = r5[r1]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r5
        Lab:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
    }
}
