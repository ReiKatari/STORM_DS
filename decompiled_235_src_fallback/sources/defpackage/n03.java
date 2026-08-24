package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n03  reason: default package */
/* loaded from: classes.dex */
public final class n03 implements java.io.Closeable {
    public static final short[] Y = null;
    public static final int[] Z = null;
    public static final int[] d0 = null;
    public static final int[] e0 = null;
    public static final int[] f0 = null;
    public boolean A;
    public defpackage.oi2 B;
    public defpackage.n40 L;
    public final java.io.InputStream R;
    public final defpackage.q X;

    static {
            r0 = 29
            short[] r0 = new short[r0]
            r0 = {x0042: FILL_ARRAY_DATA  , data: [96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112} // fill-array
            defpackage.n03.Y = r0
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0064: FILL_ARRAY_DATA  , data: [16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462} // fill-array
            defpackage.n03.Z = r1
            r1 = 19
            int[] r1 = new int[r1]
            r1 = {x00a8: FILL_ARRAY_DATA  , data: [16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15} // fill-array
            defpackage.n03.d0 = r1
            r1 = 288(0x120, float:4.04E-43)
            int[] r2 = new int[r1]
            defpackage.n03.e0 = r2
            r3 = 0
            r4 = 144(0x90, float:2.02E-43)
            r5 = 8
            java.util.Arrays.fill(r2, r3, r4, r5)
            r3 = 256(0x100, float:3.59E-43)
            r6 = 9
            java.util.Arrays.fill(r2, r4, r3, r6)
            r4 = 280(0x118, float:3.92E-43)
            r6 = 7
            java.util.Arrays.fill(r2, r3, r4, r6)
            java.util.Arrays.fill(r2, r4, r1, r5)
            int[] r0 = new int[r0]
            r1 = 5
            java.util.Arrays.fill(r0, r1)
            defpackage.n03.f0 = r0
            return
    }

    public n03(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            q r0 = new q
            r0.<init>()
            r1 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r1]
            r0.c = r1
            r2.X = r0
            n40 r0 = new n40
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.<init>(r3, r1)
            r2.L = r0
            r2.R = r3
            l03 r3 = new l03
            r3.<init>()
            r2.B = r3
            return
    }

    public static defpackage.m42 e(int[] r12) {
            r0 = 65
            int[] r0 = new int[r0]
            int r1 = r12.length
            r2 = 0
            r3 = r2
            r4 = r3
        L8:
            r5 = 0
            r6 = 1
            if (r3 >= r1) goto L2c
            r7 = r12[r3]
            if (r7 < 0) goto L20
            r8 = 64
            if (r7 > r8) goto L20
            int r4 = java.lang.Math.max(r4, r7)
            r5 = r0[r7]
            int r5 = r5 + r6
            r0[r7] = r5
            int r3 = r3 + 1
            goto L8
        L20:
            java.lang.String r12 = "Invalid code "
            java.lang.String r0 = " in literal table"
            java.lang.String r12 = defpackage.lb1.k(r12, r7, r0)
            defpackage.i.h(r12)
            return r5
        L2c:
            int r1 = r4 + 1
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            int[] r1 = new int[r1]
            r3 = r2
            r7 = r3
        L36:
            if (r3 > r4) goto L41
            r8 = r0[r3]
            int r7 = r7 + r8
            int r7 = r7 << r6
            r1[r3] = r7
            int r3 = r3 + 1
            goto L36
        L41:
            m42 r0 = new m42
            r0.<init>(r2)
        L46:
            int r3 = r12.length
            if (r2 >= r3) goto La5
            r3 = r12[r2]
            if (r3 == 0) goto La2
            int r3 = r3 + (-1)
            r4 = r1[r3]
            r8 = r0
            r7 = r3
        L53:
            int r9 = r8.b
            if (r7 < 0) goto L97
            int r10 = r6 << r7
            r10 = r10 & r4
            r11 = -1
            if (r10 != 0) goto L75
            java.lang.Object r10 = r8.d
            m42 r10 = (defpackage.m42) r10
            if (r10 != 0) goto L70
            int r10 = r8.c
            if (r10 != r11) goto L70
            m42 r10 = new m42
            int r9 = r9 + 1
            r10.<init>(r9)
            r8.d = r10
        L70:
            java.lang.Object r8 = r8.d
            m42 r8 = (defpackage.m42) r8
            goto L8c
        L75:
            java.lang.Object r10 = r8.e
            m42 r10 = (defpackage.m42) r10
            if (r10 != 0) goto L88
            int r10 = r8.c
            if (r10 != r11) goto L88
            m42 r10 = new m42
            int r9 = r9 + 1
            r10.<init>(r9)
            r8.e = r10
        L88:
            java.lang.Object r8 = r8.e
            m42 r8 = (defpackage.m42) r8
        L8c:
            if (r8 == 0) goto L91
            int r7 = r7 + (-1)
            goto L53
        L91:
            java.lang.String r12 = "node doesn't exist in Huffman tree"
            defpackage.i.m(r12)
            return r5
        L97:
            r8.c = r2
            r8.d = r5
            r8.e = r5
            r4 = r1[r3]
            int r4 = r4 + r6
            r1[r3] = r4
        La2:
            int r2 = r2 + 1
            goto L46
        La5:
            return r0
    }

    public static int k(defpackage.n40 r4, defpackage.m42 r5) {
        L0:
            r0 = -1
            if (r5 == 0) goto L1a
            int r1 = r5.c
            if (r1 != r0) goto L1a
            r0 = 1
            long r0 = n(r4, r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            java.lang.Object r5 = r5.d
        L14:
            m42 r5 = (defpackage.m42) r5
            goto L0
        L17:
            java.lang.Object r5 = r5.e
            goto L14
        L1a:
            if (r5 == 0) goto L1f
            int r4 = r5.c
            return r4
        L1f:
            return r0
    }

    public static long n(defpackage.n40 r2, int r3) {
            long r2 = r2.e(r3)
            r0 = -1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            return r2
        Lb:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r3 = "Truncated Deflate64 Stream"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            l03 r0 = new l03
            r0.<init>()
            r1.B = r0
            r0 = 0
            r1.L = r0
            return
    }

    public final int h(byte[] r22, int r23, int r24) {
            r21 = this;
            r0 = r21
        L2:
            boolean r1 = r0.A
            r2 = -1
            if (r1 == 0) goto L11
            oi2 r1 = r0.B
            boolean r1 = r1.G()
            if (r1 == 0) goto L10
            goto L11
        L10:
            return r2
        L11:
            oi2 r1 = r0.B
            o03 r1 = r1.W()
            o03 r3 = defpackage.o03.INITIAL
            if (r1 != r3) goto L132
            n40 r1 = r0.L
            r3 = 1
            long r4 = n(r1, r3)
            r6 = 1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r1 != 0) goto L2b
            r1 = r3
            goto L2c
        L2b:
            r1 = r4
        L2c:
            r0.A = r1
            n40 r1 = r0.L
            r5 = 2
            long r8 = n(r1, r5)
            int r1 = (int) r8
            r8 = 16
            if (r1 == 0) goto L102
            if (r1 == r3) goto Lf3
            if (r1 != r5) goto Le9
            n40 r1 = r0.L
            r9 = 5
            long r10 = n(r1, r9)
            r12 = 257(0x101, double:1.27E-321)
            long r10 = r10 + r12
            int r1 = (int) r10
            int[] r1 = new int[r1]
            n40 r10 = r0.L
            long r9 = n(r10, r9)
            long r9 = r9 + r6
            int r6 = (int) r9
            int[] r6 = new int[r6]
            int[][] r1 = new int[][]{r1, r6}
            n40 r6 = r0.L
            r7 = r1[r4]
            r9 = r1[r3]
            r10 = 4
            long r10 = n(r6, r10)
            r12 = 4
            long r10 = r10 + r12
            int r10 = (int) r10
            r11 = 19
            int[] r11 = new int[r11]
            r12 = r4
        L6d:
            r13 = 3
            if (r12 >= r10) goto L83
            int[] r14 = defpackage.n03.d0
            r14 = r14[r12]
            r16 = r3
            long r2 = n(r6, r13)
            int r2 = (int) r2
            r11[r14] = r2
            int r12 = r12 + 1
            r3 = r16
            r2 = -1
            goto L6d
        L83:
            r16 = r3
            m42 r2 = e(r11)
            int r3 = r7.length
            int r10 = r9.length
            int r3 = r3 + r10
            int[] r10 = new int[r3]
            r11 = r4
            r12 = r11
            r15 = -1
        L91:
            if (r11 >= r3) goto Ld1
            if (r12 <= 0) goto L9d
            int r14 = r11 + 1
            r10[r11] = r15
            int r12 = r12 + (-1)
            r11 = r14
            goto L91
        L9d:
            int r14 = k(r6, r2)
            if (r14 >= r8) goto Lac
            int r15 = r11 + 1
            r10[r11] = r14
            r5 = r12
            r11 = r15
            r15 = r14
            r14 = r6
            goto Lcd
        Lac:
            r17 = 3
            switch(r14) {
                case 16: goto Lc5;
                case 17: goto Lc0;
                case 18: goto Lb4;
                default: goto Lb1;
            }
        Lb1:
            r14 = r6
            r5 = r12
            goto Lcd
        Lb4:
            r12 = 7
            long r14 = n(r6, r12)
            r17 = 11
        Lbb:
            long r14 = r14 + r17
            int r12 = (int) r14
            r15 = r4
            goto Lb1
        Lc0:
            long r14 = n(r6, r13)
            goto Lbb
        Lc5:
            long r19 = n(r6, r5)
            r14 = r6
            long r5 = r19 + r17
            int r5 = (int) r5
        Lcd:
            r12 = r5
            r6 = r14
            r5 = 2
            goto L91
        Ld1:
            int r2 = r7.length
            java.lang.System.arraycopy(r10, r4, r7, r4, r2)
            int r2 = r7.length
            int r3 = r9.length
            java.lang.System.arraycopy(r10, r2, r9, r4, r3)
            k03 r2 = new k03
            o03 r3 = defpackage.o03.DYNAMIC_CODES
            r4 = r1[r4]
            r1 = r1[r16]
            r2.<init>(r0, r3, r4, r1)
            r0.B = r2
            goto L2
        Le9:
            java.lang.String r0 = "Unsupported compression: "
            java.lang.String r0 = defpackage.lb1.g(r1, r0)
            defpackage.i.m(r0)
            return r4
        Lf3:
            k03 r1 = new k03
            o03 r2 = defpackage.o03.FIXED_CODES
            int[] r3 = defpackage.n03.e0
            int[] r4 = defpackage.n03.f0
            r1.<init>(r0, r2, r3, r4)
            r0.B = r1
            goto L2
        L102:
            n40 r1 = r0.L
            int r2 = r1.R
            int r2 = r2 % 8
            if (r2 <= 0) goto L10d
            r1.h(r2)
        L10d:
            n40 r1 = r0.L
            long r1 = n(r1, r8)
            n40 r3 = r0.L
            long r5 = n(r3, r8)
            r7 = 65535(0xffff, double:3.23786E-319)
            long r9 = r1 ^ r7
            long r7 = r7 & r9
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L12c
            m03 r3 = new m03
            r3.<init>(r0, r1)
            r0.B = r3
            goto L2
        L12c:
            java.lang.String r0 = "Illegal LEN / NLEN values"
            defpackage.i.m(r0)
            return r4
        L132:
            oi2 r1 = r0.B
            r2 = r22
            r3 = r23
            r4 = r24
            int r1 = r1.T(r2, r3, r4)
            if (r1 == 0) goto L2
            return r1
    }
}
