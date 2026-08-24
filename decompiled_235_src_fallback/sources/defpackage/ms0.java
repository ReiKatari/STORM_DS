package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms0  reason: default package */
/* loaded from: classes.dex */
public final class ms0 {
    public static final java.util.logging.Logger e = null;
    public static final boolean f = false;
    public defpackage.os0 a;
    public final byte[] b;
    public final int c;
    public int d;

    static {
            java.lang.Class<ms0> r0 = defpackage.ms0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.ms0.e = r0
            boolean r0 = defpackage.gh7.f
            defpackage.ms0.f = r0
            return
    }

    public ms0(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            int r0 = r0 - r4
            r0 = r0 | r4
            r1 = 0
            if (r0 < 0) goto L10
            r2.b = r3
            r2.d = r1
            r2.c = r4
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r4}
            java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    public static int a(int r0, defpackage.ea0 r1) {
            int r0 = h(r0)
            int r1 = b(r1)
            int r1 = r1 + r0
            return r1
    }

    public static int b(defpackage.ea0 r1) {
            int r1 = r1.size()
            int r0 = i(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int c(int r0) {
            int r0 = h(r0)
            int r0 = r0 + 4
            return r0
    }

    public static int d(int r0) {
            int r0 = h(r0)
            int r0 = r0 + 8
            return r0
    }

    public static int e(int r3, defpackage.c1 r4, defpackage.j66 r5) {
            int r3 = h(r3)
            int r3 = r3 * 2
            r4.getClass()
            r0 = r4
            pr2 r0 = (defpackage.pr2) r0
            int r1 = r0.memoizedSerializedSize
            r2 = -1
            if (r1 != r2) goto L17
            int r1 = r5.i(r4)
            r0.memoizedSerializedSize = r1
        L17:
            int r1 = r1 + r3
            return r1
    }

    public static int f(int r0) {
            if (r0 < 0) goto L7
            int r0 = i(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int g(java.lang.String r1) {
            int r1 = defpackage.xj7.b(r1)     // Catch: defpackage.wj7 -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = defpackage.aa3.a
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = i(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int h(int r0) {
            int r0 = r0 << 3
            int r0 = i(r0)
            return r0
    }

    public static int i(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int j(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r6 = 10
            return r6
        L12:
            r4 = -34359738368(0xfffffff800000000, double:NaN)
            long r4 = r4 & r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            r0 = 28
            long r6 = r6 >>> r0
            r0 = 6
            goto L22
        L21:
            r0 = 2
        L22:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L2f
            int r0 = r0 + 2
            r4 = 14
            long r6 = r6 >>> r4
        L2f:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L37
            int r0 = r0 + r1
        L37:
            return r0
    }

    public final void k(byte r4) {
            r3 = this;
            byte[] r0 = r3.b     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r3.d     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r4     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r4 = move-exception
            ns0 r0 = new ns0
            int r1 = r3.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3, r4)
            throw r0
    }

    public final void l(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.b     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r1 = r2.d     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r3 = r2.d     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r3 = r3 + r5
            r2.d = r3     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            return
        Ld:
            r3 = move-exception
            ns0 r4 = new ns0
            int r0 = r2.d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r5}
            java.lang.String r5 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r4.<init>(r2, r3)
            throw r4
    }

    public final void m(int r2, int r3) {
            r1 = this;
            r0 = 5
            r1.r(r2, r0)
            r1.n(r3)
            return
    }

    public final void n(int r6) {
            r5 = this;
            byte[] r0 = r5.b     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r5.d     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r5.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r6 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r1 + 2
            r5.d = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r6 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 3
            r5.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r6 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r3] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r1 + 4
            r5.d = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r6 = move-exception
            ns0 r0 = new ns0
            int r1 = r5.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r5 = r5.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r5 = java.lang.String.format(r1, r5)
            r0.<init>(r5, r6)
            throw r0
    }

    public final void o(int r2, long r3) {
            r1 = this;
            r0 = 1
            r1.r(r2, r0)
            r1.p(r3)
            return
    }

    public final void p(long r8) {
            r7 = this;
            byte[] r0 = r7.b     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r7.d     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 1
            r7.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 2
            r7.d = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r4 = 8
            long r5 = r8 >> r4
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 3
            r7.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 16
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 4
            r7.d = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 24
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 5
            r7.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 32
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 6
            r7.d = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 40
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 7
            r7.d = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 48
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r1 + r4
            r7.d = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r1 = 56
            long r8 = r8 >> r1
            int r8 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            return
        L6f:
            r8 = move-exception
            ns0 r9 = new ns0
            int r0 = r7.d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r7 = r7.c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7, r1}
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            r9.<init>(r7, r8)
            throw r9
    }

    public final void q(int r3) {
            r2 = this;
            if (r3 < 0) goto L6
            r2.s(r3)
            return
        L6:
            long r0 = (long) r3
            r2.u(r0)
            return
    }

    public final void r(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.s(r1)
            return
    }

    public final void s(int r6) {
            r5 = this;
            boolean r0 = defpackage.ms0.f
            int r1 = r5.c
            byte[] r2 = r5.b
            if (r0 == 0) goto L93
            boolean r0 = defpackage.hd.a()
            if (r0 != 0) goto L93
            int r0 = r5.d
            int r3 = r1 - r0
            r4 = 5
            if (r3 < r4) goto L93
            r1 = r6 & (-128(0xffffffffffffff80, float:NaN))
            if (r1 != 0) goto L23
            int r1 = r0 + 1
            r5.d = r1
            long r0 = (long) r0
            byte r5 = (byte) r6
            defpackage.gh7.j(r2, r0, r5)
            return
        L23:
            int r1 = r0 + 1
            r5.d = r1
            long r0 = (long) r0
            r3 = r6 | 128(0x80, float:1.8E-43)
            byte r3 = (byte) r3
            defpackage.gh7.j(r2, r0, r3)
            int r0 = r6 >>> 7
            r1 = r0 & (-128(0xffffffffffffff80, float:NaN))
            int r3 = r5.d
            if (r1 != 0) goto L40
            int r6 = r3 + 1
            r5.d = r6
            long r5 = (long) r3
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r5, r0)
            return
        L40:
            int r1 = r3 + 1
            r5.d = r1
            long r3 = (long) r3
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r3, r0)
            int r0 = r6 >>> 14
            r1 = r0 & (-128(0xffffffffffffff80, float:NaN))
            int r3 = r5.d
            if (r1 != 0) goto L5d
            int r6 = r3 + 1
            r5.d = r6
            long r5 = (long) r3
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r5, r0)
            return
        L5d:
            int r1 = r3 + 1
            r5.d = r1
            long r3 = (long) r3
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r3, r0)
            int r0 = r6 >>> 21
            r1 = r0 & (-128(0xffffffffffffff80, float:NaN))
            int r3 = r5.d
            if (r1 != 0) goto L7a
            int r6 = r3 + 1
            r5.d = r6
            long r5 = (long) r3
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r5, r0)
            return
        L7a:
            int r1 = r3 + 1
            r5.d = r1
            long r3 = (long) r3
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            defpackage.gh7.j(r2, r3, r0)
            int r6 = r6 >>> 28
            int r0 = r5.d
            int r1 = r0 + 1
            r5.d = r1
            long r0 = (long) r0
            byte r5 = (byte) r6
            defpackage.gh7.j(r2, r0, r5)
            return
        L93:
            r0 = r6 & (-128(0xffffffffffffff80, float:NaN))
            int r3 = r5.d
            if (r0 != 0) goto La3
            int r0 = r3 + 1
            r5.d = r0     // Catch: java.lang.IndexOutOfBoundsException -> La1
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> La1
            r2[r3] = r6     // Catch: java.lang.IndexOutOfBoundsException -> La1
            return
        La1:
            r6 = move-exception
            goto Lb1
        La3:
            int r0 = r3 + 1
            r5.d = r0     // Catch: java.lang.IndexOutOfBoundsException -> La1
            r0 = r6 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0     // Catch: java.lang.IndexOutOfBoundsException -> La1
            r2[r3] = r0     // Catch: java.lang.IndexOutOfBoundsException -> La1
            int r6 = r6 >>> 7
            goto L93
        Lb1:
            ns0 r0 = new ns0
            int r5 = r5.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r5 = java.lang.String.format(r1, r5)
            r0.<init>(r5, r6)
            throw r0
    }

    public final void t(int r2, long r3) {
            r1 = this;
            r0 = 0
            r1.r(r2, r0)
            r1.u(r3)
            return
    }

    public final void u(long r11) {
            r10 = this;
            boolean r0 = defpackage.ms0.f
            int r1 = r10.c
            r2 = 7
            byte[] r3 = r10.b
            r4 = 0
            r6 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L38
            int r0 = r10.d
            int r0 = r1 - r0
            r8 = 10
            if (r0 < r8) goto L38
        L15:
            long r0 = r11 & r6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            int r1 = r10.d
            if (r0 != 0) goto L28
            int r0 = r1 + 1
            r10.d = r0
            long r0 = (long) r1
            int r10 = (int) r11
            byte r10 = (byte) r10
            defpackage.gh7.j(r3, r0, r10)
            return
        L28:
            int r0 = r1 + 1
            r10.d = r0
            long r0 = (long) r1
            int r8 = (int) r11
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            defpackage.gh7.j(r3, r0, r8)
            long r11 = r11 >>> r2
            goto L15
        L38:
            long r8 = r11 & r6
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            int r8 = r10.d
            if (r0 != 0) goto L4b
            int r0 = r8 + 1
            r10.d = r0     // Catch: java.lang.IndexOutOfBoundsException -> L49
            int r11 = (int) r11     // Catch: java.lang.IndexOutOfBoundsException -> L49
            byte r11 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L49
            r3[r8] = r11     // Catch: java.lang.IndexOutOfBoundsException -> L49
            return
        L49:
            r11 = move-exception
            goto L59
        L4b:
            int r0 = r8 + 1
            r10.d = r0     // Catch: java.lang.IndexOutOfBoundsException -> L49
            int r0 = (int) r11     // Catch: java.lang.IndexOutOfBoundsException -> L49
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0     // Catch: java.lang.IndexOutOfBoundsException -> L49
            r3[r8] = r0     // Catch: java.lang.IndexOutOfBoundsException -> L49
            long r11 = r11 >>> r2
            goto L38
        L59:
            ns0 r12 = new ns0
            int r10 = r10.d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0, r1}
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            r12.<init>(r10, r11)
            throw r12
    }
}
