package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd6  reason: default package */
/* loaded from: classes.dex */
public final class sd6 implements java.io.Closeable {
    public static final byte[] f0 = null;
    public final java.lang.String A;
    public java.nio.channels.SeekableByteChannel B;
    public final defpackage.qa L;
    public int R;
    public int X;
    public java.io.InputStream Y;
    public byte[] Z;
    public final java.util.ArrayList d0;
    public final int e0;

    static {
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [55, 122, -68, -81, 39, 28} // fill-array
            defpackage.sd6.f0 = r0
            return
    }

    public sd6(java.nio.channels.FileChannel r2, java.lang.String r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.R = r0
            r1.X = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d0 = r0
            r1.B = r2
            r1.A = r3
            r1.e0 = r5
            qa r2 = r1.D()     // Catch: java.lang.Throwable -> L1f
            r1.L = r2     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r1.Z = r2     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r2 = move-exception
            if (r4 == 0) goto L27
            java.nio.channels.SeekableByteChannel r1 = r1.B
            r1.close()
        L27:
            throw r2
    }

    public static void F(java.nio.ByteBuffer r33, defpackage.qa r34) {
            r0 = r33
            r1 = r34
            int r2 = u(r0)
            r3 = 6
            r4 = 9
            r5 = 4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 10
            if (r2 != r3) goto L71
            long r2 = J(r0)
            r1.B = r2
            long r2 = J(r0)
            int r2 = (int) r2
            int r3 = u(r0)
            if (r3 != r4) goto L3f
            long[] r3 = new long[r2]
            r1.L = r3
            r3 = 0
        L2b:
            java.lang.Object r10 = r1.L
            long[] r10 = (long[]) r10
            int r11 = r10.length
            if (r3 >= r11) goto L3b
            long r11 = J(r0)
            r10[r3] = r11
            int r3 = r3 + 1
            goto L2b
        L3b:
            int r3 = u(r0)
        L3f:
            if (r3 != r8) goto L6d
            java.util.BitSet r3 = v(r2, r0)
            r1.R = r3
            long[] r3 = new long[r2]
            r1.X = r3
            r3 = 0
        L4c:
            if (r3 >= r2) goto L6a
            java.lang.Object r10 = r1.R
            java.util.BitSet r10 = (java.util.BitSet) r10
            boolean r10 = r10.get(r3)
            if (r10 == 0) goto L67
            java.lang.Object r10 = r1.X
            long[] r10 = (long[]) r10
            k(r5, r0)
            int r11 = r0.getInt()
            long r11 = (long) r11
            long r11 = r11 & r6
            r10[r3] = r11
        L67:
            int r3 = r3 + 1
            goto L4c
        L6a:
            u(r0)
        L6d:
            int r2 = u(r0)
        L71:
            r3 = 7
            if (r2 != r3) goto L206
            u(r0)
            long r2 = J(r0)
            int r2 = (int) r2
            fi2[] r3 = new defpackage.fi2[r2]
            r1.Y = r3
            u(r0)
            r13 = 0
        L84:
            if (r13 >= r2) goto L190
            fi2 r14 = new fi2
            r14.<init>()
            r15 = r6
            long r6 = J(r0)
            int r6 = (int) r6
            ps0[] r7 = new defpackage.ps0[r6]
            r4 = 0
            r10 = 0
            r11 = 0
        L98:
            r18 = 1
            if (r10 >= r6) goto L111
            r20 = r15
            int r15 = u(r0)
            r16 = 0
            r9 = r15 & 15
            r22 = r15 & 16
            if (r22 != 0) goto Lad
            r22 = 1
            goto Laf
        Lad:
            r22 = r16
        Laf:
            r23 = r15 & 32
            if (r23 == 0) goto Lb6
            r23 = 1
            goto Lb8
        Lb6:
            r23 = r16
        Lb8:
            r15 = r15 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto Lbe
            r15 = 1
            goto Lc0
        Lbe:
            r15 = r16
        Lc0:
            byte[] r8 = new byte[r9]
            k(r9, r0)
            r0.get(r8)
            if (r22 == 0) goto Lcf
            r26 = r18
            r28 = r26
            goto Ldb
        Lcf:
            long r18 = J(r0)
            long r24 = J(r0)
            r26 = r18
            r28 = r24
        Ldb:
            long r4 = r4 + r26
            long r11 = r11 + r28
            r9 = r3
            r18 = r4
            if (r23 == 0) goto Lf4
            long r3 = J(r0)
            int r3 = (int) r3
            byte[] r4 = new byte[r3]
            k(r3, r0)
            r0.get(r4)
        Lf1:
            r30 = r4
            goto Lf6
        Lf4:
            r4 = 0
            goto Lf1
        Lf6:
            if (r15 != 0) goto L10b
            ps0 r24 = new ps0
            r25 = r8
            r24.<init>(r25, r26, r28, r30)
            r7[r10] = r24
            int r10 = r10 + 1
            r3 = r9
            r4 = r18
            r15 = r20
            r8 = 10
            goto L98
        L10b:
            java.lang.String r0 = "Alternative methods are unsupported, please report. The reference implementation doesn't support them either."
            defpackage.e41.i(r0)
            return
        L111:
            r9 = r3
            r20 = r15
            r16 = 0
            r14.a = r7
            r14.b = r4
            r14.c = r11
            long r11 = r11 - r18
            int r3 = (int) r11
            h40[] r6 = new defpackage.h40[r3]
            r7 = r16
        L123:
            if (r7 >= r3) goto L13d
            h40 r8 = new h40
            r15 = r9
            long r9 = J(r0)
            r22 = r11
            long r11 = J(r0)
            r8.<init>(r9, r11)
            r6[r7] = r8
            int r7 = r7 + 1
            r9 = r15
            r11 = r22
            goto L123
        L13d:
            r15 = r9
            r22 = r11
            r14.d = r6
            long r6 = r4 - r22
            int r3 = (int) r6
            long[] r8 = new long[r3]
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 != 0) goto L173
            r3 = r16
        L14d:
            int r6 = (int) r4
            if (r3 >= r6) goto L16f
            h40[] r6 = r14.d
            if (r6 == 0) goto L168
            r6 = r16
        L156:
            h40[] r7 = r14.d
            int r9 = r7.length
            if (r6 >= r9) goto L168
            r7 = r7[r6]
            long r9 = r7.b
            long r11 = (long) r3
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L165
            goto L169
        L165:
            int r6 = r6 + 1
            goto L156
        L168:
            r6 = -1
        L169:
            if (r6 >= 0) goto L16c
            goto L16f
        L16c:
            int r3 = r3 + 1
            goto L14d
        L16f:
            long r3 = (long) r3
            r8[r16] = r3
            goto L180
        L173:
            r4 = r16
        L175:
            if (r4 >= r3) goto L180
            long r5 = J(r0)
            r8[r4] = r5
            int r4 = r4 + 1
            goto L175
        L180:
            r14.e = r8
            r15[r13] = r14
            int r13 = r13 + 1
            r3 = r15
            r6 = r20
            r4 = 9
            r5 = 4
            r8 = 10
            goto L84
        L190:
            r15 = r3
            r20 = r6
            r16 = 0
            u(r0)
            r3 = r16
        L19a:
            if (r3 >= r2) goto L1c3
            r4 = r15[r3]
            java.lang.String r5 = "totalOutputStreams"
            long r6 = r4.c
            e(r6, r5)
            long r5 = r4.c
            int r5 = (int) r5
            long[] r5 = new long[r5]
            r4.f = r5
            r5 = r16
        L1ae:
            long r6 = (long) r5
            long r8 = r4.c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L1c0
            long[] r6 = r4.f
            long r7 = J(r0)
            r6[r5] = r7
            int r5 = r5 + 1
            goto L1ae
        L1c0:
            int r3 = r3 + 1
            goto L19a
        L1c3:
            int r3 = u(r0)
            r4 = 10
            if (r3 != r4) goto L1ff
            java.util.BitSet r3 = v(r2, r0)
            r4 = r16
        L1d1:
            if (r4 >= r2) goto L1f9
            boolean r5 = r3.get(r4)
            if (r5 == 0) goto L1ee
            r5 = r15[r4]
            r6 = 1
            r5.g = r6
            r6 = 4
            k(r6, r0)
            int r6 = r0.getInt()
            long r6 = (long) r6
            long r6 = r6 & r20
            r5.h = r6
            r6 = r16
            goto L1f4
        L1ee:
            r5 = r15[r4]
            r6 = r16
            r5.g = r6
        L1f4:
            int r4 = r4 + 1
            r16 = r6
            goto L1d1
        L1f9:
            r6 = r16
            u(r0)
            goto L201
        L1ff:
            r6 = r16
        L201:
            int r2 = u(r0)
            goto L20d
        L206:
            r20 = r6
            r6 = 0
            fi2[] r3 = defpackage.fi2.j
            r1.Y = r3
        L20d:
            r3 = 8
            if (r2 != r3) goto L332
            java.lang.Object r2 = r1.Y
            fi2[] r2 = (defpackage.fi2[]) r2
            int r3 = r2.length
            r4 = r6
        L217:
            if (r4 >= r3) goto L221
            r5 = r2[r4]
            r7 = 1
            r5.i = r7
            int r4 = r4 + 1
            goto L217
        L221:
            java.lang.Object r2 = r1.Y
            fi2[] r2 = (defpackage.fi2[]) r2
            int r2 = r2.length
            long r2 = (long) r2
            int r4 = u(r0)
            r5 = 13
            if (r4 != r5) goto L24f
            java.lang.Object r2 = r1.Y
            fi2[] r2 = (defpackage.fi2[]) r2
            int r3 = r2.length
            r7 = r6
            r4 = 0
        L237:
            if (r7 >= r3) goto L246
            r8 = r2[r7]
            long r9 = J(r0)
            int r11 = (int) r9
            r8.i = r11
            long r4 = r4 + r9
            int r7 = r7 + 1
            goto L237
        L246:
            int r2 = u(r0)
            r31 = r4
            r4 = r2
            r2 = r31
        L24f:
            int r2 = (int) r2
            m44 r3 = new m44
            r3.<init>(r2)
            java.lang.Object r2 = r3.R
            long[] r2 = (long[]) r2
            java.lang.Object r5 = r3.L
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Object r7 = r3.B
            long[] r7 = (long[]) r7
            java.lang.Object r8 = r1.Y
            fi2[] r8 = (defpackage.fi2[]) r8
            int r9 = r8.length
            r10 = r6
            r12 = r10
        L268:
            if (r10 >= r9) goto L2ac
            r13 = r8[r10]
            int r11 = r13.i
            if (r11 != 0) goto L271
            goto L2a2
        L271:
            r11 = 9
            if (r4 != r11) goto L28e
            r14 = r6
            r15 = 0
        L278:
            int r6 = r13.i
            r17 = 1
            int r6 = r6 + (-1)
            if (r14 >= r6) goto L290
            long r18 = J(r0)
            int r6 = r12 + 1
            r7[r12] = r18
            long r15 = r15 + r18
            int r14 = r14 + 1
            r12 = r6
            goto L278
        L28e:
            r15 = 0
        L290:
            long r18 = r13.b()
            int r6 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r6 > 0) goto L2a6
            int r6 = r12 + 1
            long r13 = r13.b()
            long r13 = r13 - r15
            r7[r12] = r13
            r12 = r6
        L2a2:
            int r10 = r10 + 1
            r6 = 0
            goto L268
        L2a6:
            java.lang.String r0 = "sum of unpack sizes of folder exceeds total unpack size"
            defpackage.e41.i(r0)
            return
        L2ac:
            r11 = 9
            if (r4 != r11) goto L2b4
            int r4 = u(r0)
        L2b4:
            java.lang.Object r6 = r1.Y
            fi2[] r6 = (defpackage.fi2[]) r6
            int r7 = r6.length
            r8 = 0
            r9 = 0
        L2bb:
            if (r8 >= r7) goto L2cc
            r10 = r6[r8]
            int r11 = r10.i
            r12 = 1
            if (r11 != r12) goto L2c8
            boolean r10 = r10.g
            if (r10 != 0) goto L2c9
        L2c8:
            int r9 = r9 + r11
        L2c9:
            int r8 = r8 + 1
            goto L2bb
        L2cc:
            r8 = 10
            if (r4 != r8) goto L32d
            java.util.BitSet r4 = v(r9, r0)
            long[] r6 = new long[r9]
            r7 = 0
        L2d7:
            if (r7 >= r9) goto L2f1
            boolean r8 = r4.get(r7)
            if (r8 == 0) goto L2ed
            r8 = 4
            k(r8, r0)
            int r10 = r0.getInt()
            long r10 = (long) r10
            long r10 = r10 & r20
            r6[r7] = r10
            goto L2ee
        L2ed:
            r8 = 4
        L2ee:
            int r7 = r7 + 1
            goto L2d7
        L2f1:
            java.lang.Object r7 = r1.Y
            fi2[] r7 = (defpackage.fi2[]) r7
            int r8 = r7.length
            r9 = 0
            r10 = 0
            r11 = 0
        L2f9:
            if (r9 >= r8) goto L32a
            r12 = r7[r9]
            int r13 = r12.i
            r14 = 1
            if (r13 != r14) goto L310
            boolean r13 = r12.g
            if (r13 == 0) goto L310
            r5.set(r10, r14)
            long r12 = r12.h
            r2[r10] = r12
            int r10 = r10 + 1
            goto L327
        L310:
            r13 = 0
        L311:
            int r15 = r12.i
            if (r13 >= r15) goto L327
            boolean r15 = r4.get(r11)
            r5.set(r10, r15)
            r15 = r6[r11]
            r2[r10] = r15
            int r10 = r10 + 1
            int r11 = r11 + 1
            int r13 = r13 + 1
            goto L311
        L327:
            int r9 = r9 + 1
            goto L2f9
        L32a:
            u(r0)
        L32d:
            r1.Z = r3
            u(r0)
        L332:
            return
    }

    public static long J(java.nio.ByteBuffer r11) {
            int r0 = u(r11)
            long r0 = (long) r0
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            r5 = 0
            r6 = r3
        Lb:
            r8 = 8
            if (r5 >= r8) goto L2b
            long r9 = (long) r2
            long r9 = r9 & r0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L1d
            int r2 = r2 + (-1)
            long r2 = (long) r2
            long r0 = r0 & r2
            int r5 = r5 * r8
            long r0 = r0 << r5
            long r0 = r0 | r6
            return r0
        L1d:
            int r8 = u(r11)
            long r8 = (long) r8
            int r10 = r5 * 8
            long r8 = r8 << r10
            long r6 = r6 | r8
            int r2 = r2 >>> 1
            int r5 = r5 + 1
            goto Lb
        L2b:
            return r6
    }

    public static long X(java.nio.ByteBuffer r4, long r5) {
            r0 = 1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r4 = 0
            return r4
        L9:
            int r0 = r4.position()
            int r1 = r4.remaining()
            long r1 = (long) r1
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L17
            r5 = r1
        L17:
            int r1 = (int) r5
            int r0 = r0 + r1
            r4.position(r0)
            return r5
    }

    public static int e(long r2, java.lang.String r4) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto Lf
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            int r2 = (int) r2
            return r2
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            java.lang.String r3 = "Cannot handle % %,d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void k(int r1, java.nio.ByteBuffer r2) {
            int r2 = r2.remaining()
            if (r2 < r1) goto L7
            return
        L7:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "remaining %,d < expectRemaining %,d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void n(java.util.LinkedHashMap r2, int r3) {
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            bu r0 = new bu
            r1 = 2
            r0.<init>(r1)
            r2.computeIfAbsent(r3, r0)
            return
    }

    public static int u(java.nio.ByteBuffer r1) {
            boolean r0 = r1.hasRemaining()
            if (r0 == 0) goto Ld
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
        Ld:
            defpackage.i.n()
            r1 = 0
            return r1
    }

    public static java.util.BitSet v(int r2, java.nio.ByteBuffer r3) {
            int r0 = u(r3)
            if (r0 == 0) goto L16
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r2)
            r0 = 0
        Lc:
            if (r0 >= r2) goto L15
            r1 = 1
            r3.set(r0, r1)
            int r0 = r0 + 1
            goto Lc
        L15:
            return r3
        L16:
            java.util.BitSet r2 = x(r2, r3)
            return r2
    }

    public static java.util.BitSet x(int r6, java.nio.ByteBuffer r7) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r6)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L9:
            if (r2 >= r6) goto L22
            if (r3 != 0) goto L13
            int r4 = u(r7)
            r3 = 128(0x80, float:1.8E-43)
        L13:
            r5 = r4 & r3
            if (r5 == 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r1
        L1a:
            r0.set(r2, r5)
            int r3 = r3 >>> 1
            int r2 = r2 + 1
            goto L9
        L22:
            return r0
    }

    public final void A(java.nio.ByteBuffer r5) {
            r4 = this;
            r5.rewind()
            java.nio.channels.SeekableByteChannel r4 = r4.B
            int r0 = defpackage.c13.a
            int r0 = r5.remaining()
            a13 r1 = defpackage.b13.a
            int r1 = r5.remaining()
        L11:
            int r2 = r5.remaining()
            if (r2 <= 0) goto L1e
            int r2 = r4.read(r5)
            r3 = -1
            if (r3 != r2) goto L11
        L1e:
            int r4 = r5.remaining()
            int r1 = r1 - r4
            if (r1 < r0) goto L29
            r5.flip()
            return
        L29:
            defpackage.i.n()
            return
    }

    public final defpackage.qa D() {
            r24 = this;
            r0 = r24
            r1 = 12
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r0.A(r1)
            r2 = 6
            byte[] r2 = new byte[r2]
            r1.get(r2)
            byte[] r3 = defpackage.sd6.f0
            boolean r2 = java.util.Arrays.equals(r2, r3)
            r3 = 0
            if (r2 == 0) goto L7ab
            byte r2 = r1.get()
            byte r4 = r1.get()
            if (r2 != 0) goto L793
            int r1 = r1.getInt()
            long r1 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L62
            java.nio.channels.SeekableByteChannel r8 = r0.B
            long r8 = r8.position()
            r10 = 20
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)
            r0.A(r10)
            java.nio.channels.SeekableByteChannel r11 = r0.B
            r11.position(r8)
        L4f:
            boolean r8 = r10.hasRemaining()
            if (r8 == 0) goto L5c
            byte r8 = r10.get()
            if (r8 == 0) goto L4f
            goto L62
        L5c:
            java.lang.String r0 = "archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely."
            defpackage.e41.i(r0)
            return r3
        L62:
            java.io.DataInputStream r8 = new java.io.DataInputStream
            int r9 = defpackage.eq0.R
            dq0 r9 = new dq0
            r9.<init>()
            r10 = -1
            r9.x = r10
            java.util.zip.CRC32 r12 = new java.util.zip.CRC32
            r12.<init>()
            r9.w = r12
            v60 r12 = new v60
            java.nio.channels.SeekableByteChannel r13 = r0.B
            r14 = 20
            r12.<init>(r13, r14)
            f1 r13 = new f1
            r13.<init>(r12)
            r9.t = r13
            r9.x = r14
            r9.y = r1
            eq0 r1 = r9.l0()
            r8.<init>(r1)
            long r1 = r8.readLong()     // Catch: java.lang.Throwable -> L777
            long r13 = java.lang.Long.reverseBytes(r1)     // Catch: java.lang.Throwable -> L777
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 < 0) goto L782
            r1 = 32
            long r15 = r13 + r1
            java.nio.channels.SeekableByteChannel r9 = r0.B     // Catch: java.lang.Throwable -> L777
            long r17 = r9.size()     // Catch: java.lang.Throwable -> L777
            int r9 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r9 > 0) goto L782
            long r15 = r8.readLong()     // Catch: java.lang.Throwable -> L777
            long r15 = java.lang.Long.reverseBytes(r15)     // Catch: java.lang.Throwable -> L777
            long r17 = r13 + r15
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L77a
            long r17 = r17 + r1
            java.nio.channels.SeekableByteChannel r9 = r0.B     // Catch: java.lang.Throwable -> L777
            long r19 = r9.size()     // Catch: java.lang.Throwable -> L777
            int r9 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r9 > 0) goto L77a
            int r9 = r8.readInt()     // Catch: java.lang.Throwable -> L777
            int r9 = java.lang.Integer.reverseBytes(r9)     // Catch: java.lang.Throwable -> L777
            r19 = r1
            long r1 = (long) r9     // Catch: java.lang.Throwable -> L777
            long r17 = r1 & r4
            ip6 r12 = new ip6     // Catch: java.lang.Throwable -> L777
            r12.<init>(r13, r15, r17)     // Catch: java.lang.Throwable -> L777
            r8.close()
            long r1 = r12.b
            java.lang.String r4 = "nextHeaderSize"
            e(r1, r4)
            int r1 = (int) r1
            java.nio.channels.SeekableByteChannel r2 = r0.B
            long r4 = r12.a
            long r4 = r4 + r19
            r2.position(r4)
            java.nio.channels.SeekableByteChannel r2 = r0.B
            long r4 = r2.position()
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream
            java.nio.channels.SeekableByteChannel r8 = r0.B
            java.io.InputStream r8 = java.nio.channels.Channels.newInputStream(r8)
            java.util.zip.CRC32 r9 = new java.util.zip.CRC32
            r9.<init>()
            r2.<init>(r8, r9)
            long r8 = (long) r1
            long r13 = r2.skip(r8)
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 != 0) goto L770
            java.util.zip.Checksum r2 = r2.getChecksum()
            long r8 = r2.getValue()
            long r12 = r12.c
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 != 0) goto L769
            java.nio.channels.SeekableByteChannel r2 = r0.B
            r2.position(r4)
            qa r2 = new qa
            r2.<init>()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r4)
            r0.A(r1)
            int r4 = u(r1)
            r5 = 23
            r8 = -1
            int r9 = r0.e0
            r12 = 0
            if (r4 != r5) goto L27f
            int r4 = r1.position()
            qd6 r5 = new qd6
            r5.<init>()
            r0.U(r1, r5)
            r5.a(r9)
            r1.position(r4)
            F(r1, r2)
            java.lang.Object r1 = r2.Y
            fi2[] r1 = (defpackage.fi2[]) r1
            int r4 = r1.length
            if (r4 == 0) goto L278
            java.lang.Object r4 = r2.L
            long[] r4 = (long[]) r4
            int r4 = r4.length
            if (r4 == 0) goto L271
            r1 = r1[r12]
            long r4 = r2.B
            long r4 = r4 + r19
            java.nio.channels.SeekableByteChannel r15 = r0.B
            r15.position(r4)
            v60 r4 = new v60
            java.nio.channels.SeekableByteChannel r5 = r0.B
            java.lang.Object r2 = r2.L
            long[] r2 = (long[]) r2
            r15 = 1
            r13 = r2[r12]
            r4.<init>(r5, r13)
            java.util.List r2 = r1.a()
            java.util.Iterator r2 = r2.iterator()
            r18 = r4
        L182:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1ca
            java.lang.Object r4 = r2.next()
            ps0 r4 = (defpackage.ps0) r4
            long r13 = r4.b
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L1c3
            long r13 = r4.c
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L1c3
            ps0[] r5 = r1.a
            if (r5 == 0) goto L1b0
            r5 = r12
        L19f:
            ps0[] r13 = r1.a
            int r14 = r13.length
            if (r5 >= r14) goto L1b0
            r13 = r13[r5]
            if (r13 != r4) goto L1ad
            long[] r13 = r1.f
            r19 = r13[r5]
            goto L1b2
        L1ad:
            int r5 = r5 + 1
            goto L19f
        L1b0:
            r19 = r6
        L1b2:
            int r5 = r0.e0
            java.lang.String r13 = r0.A
            r22 = 0
            r21 = r4
            r23 = r5
            r17 = r13
            java.io.InputStream r18 = defpackage.us0.a(r17, r18, r19, r21, r22, r23)
            goto L182
        L1c3:
            java.lang.String r0 = "Multi input/output stream coders are not yet supported"
            defpackage.e41.i(r0)
            goto L776
        L1ca:
            r4 = r18
            boolean r2 = r1.g
            if (r2 == 0) goto L1f7
            int r2 = defpackage.eq0.R
            dq0 r2 = new dq0
            r2.<init>()
            r2.x = r10
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32
            r5.<init>()
            r2.w = r5
            f1 r5 = new f1
            r5.<init>(r4)
            r2.t = r5
            long r4 = r1.b()
            r2.x = r4
            long r4 = r1.h
            r2.y = r4
            eq0 r18 = r2.l0()
            r4 = r18
        L1f7:
            java.lang.String r2 = "unpackSize"
            long r10 = r1.b()
            int r1 = e(r10, r2)
            int r2 = defpackage.c13.a
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            long r10 = (long) r1
            a13 r5 = defpackage.b13.a
            java.lang.Object r5 = r5.get()
            byte[] r5 = (byte[]) r5
            java.util.Arrays.fill(r5, r12)
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 != 0) goto L21d
            r22 = r4
            r17 = r6
            goto L24c
        L21d:
            int r14 = r5.length
            r17 = r6
            if (r13 <= 0) goto L229
            long r6 = (long) r14
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 >= 0) goto L229
            int r6 = (int) r10
            goto L22a
        L229:
            r6 = r14
        L22a:
            r19 = r17
        L22c:
            if (r6 <= 0) goto L24a
            int r7 = r4.read(r5, r12, r6)
            if (r8 == r7) goto L24a
            r2.write(r5, r12, r7)
            r22 = r4
            long r3 = (long) r7
            long r19 = r19 + r3
            if (r13 <= 0) goto L246
            long r3 = r10 - r19
            long r6 = (long) r14
            long r3 = java.lang.Math.min(r3, r6)
            int r6 = (int) r3
        L246:
            r4 = r22
            r3 = 0
            goto L22c
        L24a:
            r22 = r4
        L24c:
            byte[] r2 = r2.toByteArray()
            int r3 = r2.length
            if (r3 < r1) goto L26a
            r22.close()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            qa r2 = new qa
            r2.<init>()
            int r4 = u(r1)
            goto L283
        L26a:
            java.lang.String r0 = "premature end of stream"
            defpackage.e41.i(r0)
            goto L76e
        L271:
            java.lang.String r0 = "no packed streams, can't read encoded header"
            defpackage.e41.i(r0)
            goto L76e
        L278:
            java.lang.String r0 = "no folders, can't read encoded header"
            defpackage.e41.i(r0)
            goto L76e
        L27f:
            r17 = r6
            r15 = 1
        L283:
            r3 = 1
            if (r4 != r3) goto L763
            int r4 = r1.position()
            qd6 r5 = new qd6
            r5.<init>()
            int r6 = u(r1)
            r7 = 2
            if (r6 != r7) goto L2c1
            long r10 = J(r1)
        L29a:
            int r6 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r6 == 0) goto L2bd
            java.lang.String r6 = "propertySize"
            long r10 = J(r1)
            int r6 = e(r10, r6)
            long r10 = (long) r6
            long r13 = X(r1, r10)
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 < 0) goto L2b6
            long r10 = J(r1)
            goto L29a
        L2b6:
            java.lang.String r0 = "invalid property size"
            defpackage.e41.i(r0)
            goto L76e
        L2bd:
            int r6 = u(r1)
        L2c1:
            java.lang.String r10 = "Additional streams unsupported"
            r11 = 3
            if (r6 == r11) goto L75f
            r13 = 4
            if (r6 != r13) goto L2d0
            r0.U(r1, r5)
            int r6 = u(r1)
        L2d0:
            r0 = 8
            r14 = 5
            if (r6 != r14) goto L447
            java.lang.String r6 = "numFiles"
            r19 = r15
            long r14 = J(r1)
            int r6 = e(r14, r6)
            r5.h = r6
            r6 = r8
        L2e4:
            int r14 = u(r1)
            if (r14 != 0) goto L2fb
            int r14 = r5.h
            int r6 = java.lang.Math.max(r6, r12)
            int r14 = r14 - r6
            r5.i = r14
            int r6 = u(r1)
        L2f7:
            r16 = r13
            goto L44b
        L2fb:
            r16 = r13
            long r12 = J(r1)
            java.lang.String r22 = "Not implemented"
            switch(r14) {
                case 14: goto L438;
                case 15: goto L42b;
                case 16: goto L41e;
                case 17: goto L3d4;
                case 18: goto L3ac;
                case 19: goto L384;
                case 20: goto L35c;
                case 21: goto L333;
                case 22: goto L306;
                case 23: goto L306;
                case 24: goto L32c;
                case 25: goto L31b;
                default: goto L306;
            }
        L306:
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L310
            goto L442
        L310:
            java.lang.String r0 = "Incomplete property of type "
            java.lang.String r0 = defpackage.lb1.g(r14, r0)
            defpackage.e41.i(r0)
            goto L76e
        L31b:
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L325
            goto L442
        L325:
            java.lang.String r0 = "Incomplete kDummy property"
            defpackage.e41.i(r0)
            goto L76e
        L32c:
            java.lang.String r0 = "kStartPos is unsupported, please report"
            defpackage.e41.i(r0)
            goto L76e
        L333:
            int r12 = r5.h
            java.util.BitSet r12 = v(r12, r1)
            int r12 = r12.cardinality()
            int r13 = u(r1)
            if (r13 != 0) goto L357
            int r12 = r12 * 4
            long r12 = (long) r12
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L350
            goto L442
        L350:
            java.lang.String r0 = "invalid windows attributes size"
            defpackage.e41.i(r0)
            goto L76e
        L357:
            defpackage.e41.i(r22)
            goto L76e
        L35c:
            int r12 = r5.h
            java.util.BitSet r12 = v(r12, r1)
            int r12 = r12.cardinality()
            int r13 = u(r1)
            if (r13 != 0) goto L37f
            int r12 = r12 * r0
            long r12 = (long) r12
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L378
            goto L442
        L378:
            java.lang.String r0 = "invalid modification dates size"
            defpackage.e41.i(r0)
            goto L76e
        L37f:
            defpackage.e41.i(r22)
            goto L76e
        L384:
            int r12 = r5.h
            java.util.BitSet r12 = v(r12, r1)
            int r12 = r12.cardinality()
            int r13 = u(r1)
            if (r13 != 0) goto L3a7
            int r12 = r12 * r0
            long r12 = (long) r12
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L3a0
            goto L442
        L3a0:
            java.lang.String r0 = "invalid access dates size"
            defpackage.e41.i(r0)
            goto L76e
        L3a7:
            defpackage.e41.i(r22)
            goto L76e
        L3ac:
            int r12 = r5.h
            java.util.BitSet r12 = v(r12, r1)
            int r12 = r12.cardinality()
            int r13 = u(r1)
            if (r13 != 0) goto L3cf
            int r12 = r12 * r0
            long r12 = (long) r12
            long r22 = X(r1, r12)
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 < 0) goto L3c8
            goto L442
        L3c8:
            java.lang.String r0 = "invalid creation dates size"
            defpackage.e41.i(r0)
            goto L76e
        L3cf:
            defpackage.e41.i(r22)
            goto L76e
        L3d4:
            int r14 = u(r1)
            if (r14 != 0) goto L419
            java.lang.String r14 = "file names length"
            long r12 = r12 - r19
            int r12 = e(r12, r14)
            r13 = r12 & 1
            if (r13 != 0) goto L412
            r13 = 0
            r14 = 0
        L3e8:
            if (r13 >= r12) goto L3f8
            k(r7, r1)
            char r22 = r1.getChar()
            if (r22 != 0) goto L3f5
            int r14 = r14 + 1
        L3f5:
            int r13 = r13 + 2
            goto L3e8
        L3f8:
            int r12 = r5.h
            if (r14 != r12) goto L3fd
            goto L442
        L3fd:
            java.lang.String r0 = "Invalid number of file names ("
            java.lang.String r1 = " instead of "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r14, r1)
            int r1 = r5.h
            java.lang.String r2 = ")"
            java.lang.String r0 = defpackage.lb1.o(r0, r1, r2)
            defpackage.e41.i(r0)
            goto L76e
        L412:
            java.lang.String r0 = "File names length invalid"
            defpackage.e41.i(r0)
            goto L76e
        L419:
            defpackage.e41.i(r22)
            goto L76e
        L41e:
            if (r6 == r8) goto L424
            x(r6, r1)
            goto L442
        L424:
            java.lang.String r0 = "Header format error: kEmptyStream must appear before kAnti"
            defpackage.e41.i(r0)
            goto L76e
        L42b:
            if (r6 == r8) goto L431
            x(r6, r1)
            goto L442
        L431:
            java.lang.String r0 = "Header format error: kEmptyStream must appear before kEmptyFile"
            defpackage.e41.i(r0)
            goto L76e
        L438:
            int r6 = r5.h
            java.util.BitSet r6 = x(r6, r1)
            int r6 = r6.cardinality()
        L442:
            r13 = r16
            r12 = 0
            goto L2e4
        L447:
            r19 = r15
            goto L2f7
        L44b:
            if (r6 != 0) goto L755
            r5.a(r9)
            r1.position(r4)
            int r4 = u(r1)
            if (r4 != r7) goto L477
            long r4 = J(r1)
        L45d:
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L473
            long r4 = J(r1)
            int r4 = (int) r4
            byte[] r5 = new byte[r4]
            k(r4, r1)
            r1.get(r5)
            long r4 = J(r1)
            goto L45d
        L473:
            int r4 = u(r1)
        L477:
            if (r4 == r11) goto L751
            r5 = r16
            if (r4 != r5) goto L484
            F(r1, r2)
            int r4 = u(r1)
        L484:
            r5 = 5
            if (r4 != r5) goto L5ed
            long r4 = J(r1)
            int r4 = (int) r4
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r6 = 0
            r7 = 0
            r9 = 0
        L494:
            int r10 = u(r1)
            if (r10 != 0) goto L5f0
            r0 = 0
            r10 = 0
            r11 = 0
        L49d:
            if (r0 >= r4) goto L531
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Object r12 = r5.get(r12)
            md6 r12 = (defpackage.md6) r12
            if (r12 != 0) goto L4b2
            r23 = r4
        L4ad:
            r3 = r17
            r15 = 0
            goto L528
        L4b2:
            if (r6 == 0) goto L4bd
            boolean r13 = r6.get(r0)
            if (r13 != 0) goto L4bb
            goto L4bd
        L4bb:
            r13 = 0
            goto L4be
        L4bd:
            r13 = r3
        L4be:
            r12.b = r13
            if (r13 == 0) goto L502
            java.lang.Object r13 = r2.Z
            m44 r13 = (defpackage.m44) r13
            if (r13 == 0) goto L4fb
            r15 = 0
            r12.c = r15
            r12.d = r15
            java.lang.Object r13 = r13.L
            java.util.BitSet r13 = (java.util.BitSet) r13
            boolean r13 = r13.get(r11)
            r12.m = r13
            java.lang.Object r13 = r2.Z
            m44 r13 = (defpackage.m44) r13
            java.lang.Object r14 = r13.R
            long[] r14 = (long[]) r14
            r23 = r4
            r3 = r14[r11]
            r12.n = r3
            java.lang.Object r3 = r13.B
            long[] r3 = (long[]) r3
            r13 = r3[r11]
            r12.o = r13
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 < 0) goto L4f4
            int r11 = r11 + 1
            goto L4ad
        L4f4:
            java.lang.String r0 = "broken archive, entry with negative size"
            defpackage.e41.i(r0)
            goto L76e
        L4fb:
            java.lang.String r0 = "Archive contains file with streams but no subStreamsInfo"
            defpackage.e41.i(r0)
            goto L76e
        L502:
            r23 = r4
            if (r7 == 0) goto L50f
            boolean r3 = r7.get(r10)
            if (r3 != 0) goto L50d
            goto L50f
        L50d:
            r3 = 0
            goto L510
        L50f:
            r3 = 1
        L510:
            r12.c = r3
            if (r9 == 0) goto L51c
            boolean r3 = r9.get(r10)
            if (r3 == 0) goto L51c
            r3 = 1
            goto L51d
        L51c:
            r3 = 0
        L51d:
            r12.d = r3
            r15 = 0
            r12.m = r15
            r3 = r17
            r12.o = r3
            int r10 = r10 + 1
        L528:
            int r0 = r0 + 1
            r17 = r3
            r4 = r23
            r3 = 1
            goto L49d
        L531:
            r3 = r17
            r15 = 0
            java.util.Collection r0 = r5.values()
            java.util.stream.Stream r0 = r0.stream()
            cu r5 = new cu
            r11 = 1
            r5.<init>(r11)
            java.util.stream.Stream r0 = r0.filter(r5)
            nd6 r5 = new nd6
            r5.<init>()
            java.lang.Object[] r0 = r0.toArray(r5)
            md6[] r0 = (defpackage.md6[]) r0
            r2.d0 = r0
            java.lang.Object r0 = r2.Y
            fi2[] r0 = (defpackage.fi2[]) r0
            int r0 = r0.length
            int[] r10 = new int[r0]
            r5 = r15
            r6 = r5
        L55c:
            if (r5 >= r0) goto L56d
            r10[r5] = r6
            java.lang.Object r7 = r2.Y
            fi2[] r7 = (defpackage.fi2[]) r7
            r7 = r7[r5]
            long[] r7 = r7.e
            int r7 = r7.length
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L55c
        L56d:
            java.lang.Object r5 = r2.L
            long[] r5 = (long[]) r5
            int r5 = r5.length
            long[] r11 = new long[r5]
            r6 = r3
            r3 = r15
        L576:
            if (r3 >= r5) goto L584
            r11[r3] = r6
            java.lang.Object r4 = r2.L
            long[] r4 = (long[]) r4
            r12 = r4[r3]
            long r6 = r6 + r12
            int r3 = r3 + 1
            goto L576
        L584:
            int[] r12 = new int[r0]
            java.lang.Object r0 = r2.d0
            md6[] r0 = (defpackage.md6[]) r0
            int r0 = r0.length
            int[] r13 = new int[r0]
            r0 = r15
            r3 = r0
            r4 = r3
        L590:
            java.lang.Object r5 = r2.d0
            md6[] r5 = (defpackage.md6[]) r5
            int r6 = r5.length
            if (r0 >= r6) goto L5e1
            r5 = r5[r0]
            boolean r5 = r5.b
            if (r5 != 0) goto L5a2
            if (r3 != 0) goto L5a2
            r13[r0] = r8
            goto L5de
        L5a2:
            if (r3 != 0) goto L5c2
        L5a4:
            java.lang.Object r5 = r2.Y
            fi2[] r5 = (defpackage.fi2[]) r5
            int r6 = r5.length
            if (r4 >= r6) goto L5b7
            r12[r4] = r0
            r6 = r5[r4]
            int r6 = r6.i
            if (r6 <= 0) goto L5b4
            goto L5b7
        L5b4:
            int r4 = r4 + 1
            goto L5a4
        L5b7:
            int r5 = r5.length
            if (r4 >= r5) goto L5bb
            goto L5c2
        L5bb:
            java.lang.String r0 = "Too few folders in archive"
            defpackage.e41.i(r0)
            goto L76e
        L5c2:
            r13[r0] = r4
            java.lang.Object r5 = r2.d0
            md6[] r5 = (defpackage.md6[]) r5
            r5 = r5[r0]
            boolean r5 = r5.b
            if (r5 != 0) goto L5cf
            goto L5de
        L5cf:
            int r3 = r3 + 1
            java.lang.Object r5 = r2.Y
            fi2[] r5 = (defpackage.fi2[]) r5
            r5 = r5[r4]
            int r5 = r5.i
            if (r3 < r5) goto L5de
            int r4 = r4 + 1
            r3 = r15
        L5de:
            int r0 = r0 + 1
            goto L590
        L5e1:
            eb r9 = new eb
            r14 = 20
            r9.<init>(r10, r11, r12, r13, r14)
            r2.e0 = r9
            u(r1)
        L5ed:
            r0 = 0
            goto L74d
        L5f0:
            r11 = r3
            r23 = r4
            r3 = r17
            r15 = 0
            long r12 = J(r1)
            r14 = 25
            if (r10 == r14) goto L73f
            switch(r10) {
                case 14: goto L737;
                case 15: goto L72b;
                case 16: goto L71f;
                case 17: goto L6d0;
                case 18: goto L69e;
                case 19: goto L66c;
                case 20: goto L63a;
                case 21: goto L608;
                default: goto L601;
            }
        L601:
            X(r1, r12)
            r10 = r23
            goto L744
        L608:
            r10 = r23
            java.util.BitSet r12 = v(r10, r1)
            u(r1)
            r13 = r15
        L612:
            if (r13 >= r10) goto L744
            n(r5, r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Object r14 = r5.get(r14)
            md6 r14 = (defpackage.md6) r14
            boolean r3 = r12.get(r13)
            r14.k = r3
            if (r3 == 0) goto L634
            r3 = 4
            k(r3, r1)
            int r4 = r1.getInt()
            r14.l = r4
            goto L635
        L634:
            r3 = 4
        L635:
            int r13 = r13 + 1
            r3 = 0
            goto L612
        L63a:
            r10 = r23
            r3 = 4
            java.util.BitSet r4 = v(r10, r1)
            u(r1)
            r12 = r15
        L645:
            if (r12 >= r10) goto L744
            n(r5, r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r5.get(r13)
            md6 r13 = (defpackage.md6) r13
            boolean r14 = r4.get(r12)
            r13.f = r14
            if (r14 == 0) goto L669
            k(r0, r1)
            long r22 = r1.getLong()
            java.nio.file.attribute.FileTime r14 = defpackage.zb2.a(r22)
            r13.i = r14
        L669:
            int r12 = r12 + 1
            goto L645
        L66c:
            r10 = r23
            r3 = 4
            java.util.BitSet r4 = v(r10, r1)
            u(r1)
            r12 = r15
        L677:
            if (r12 >= r10) goto L744
            n(r5, r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r5.get(r13)
            md6 r13 = (defpackage.md6) r13
            boolean r14 = r4.get(r12)
            r13.g = r14
            if (r14 == 0) goto L69b
            k(r0, r1)
            long r22 = r1.getLong()
            java.nio.file.attribute.FileTime r14 = defpackage.zb2.a(r22)
            r13.j = r14
        L69b:
            int r12 = r12 + 1
            goto L677
        L69e:
            r10 = r23
            r3 = 4
            java.util.BitSet r4 = v(r10, r1)
            u(r1)
            r12 = r15
        L6a9:
            if (r12 >= r10) goto L744
            n(r5, r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r5.get(r13)
            md6 r13 = (defpackage.md6) r13
            boolean r14 = r4.get(r12)
            r13.e = r14
            if (r14 == 0) goto L6cd
            k(r0, r1)
            long r22 = r1.getLong()
            java.nio.file.attribute.FileTime r14 = defpackage.zb2.a(r22)
            r13.h = r14
        L6cd:
            int r12 = r12 + 1
            goto L6a9
        L6d0:
            r10 = r23
            r3 = 4
            u(r1)
            long r12 = r12 - r19
            int r4 = (int) r12
            byte[] r12 = new byte[r4]
            k(r4, r1)
            r1.get(r12)
            r0 = r15
            r13 = r0
            r14 = r13
        L6e4:
            if (r13 >= r4) goto L714
            r16 = r12[r13]
            if (r16 != 0) goto L70d
            int r16 = r13 + 1
            r16 = r12[r16]
            if (r16 != 0) goto L70d
            n(r5, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r5.get(r3)
            md6 r3 = (defpackage.md6) r3
            java.lang.String r8 = new java.lang.String
            int r11 = r13 - r14
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_16LE
            r8.<init>(r12, r14, r11, r15)
            r3.a = r8
            int r3 = r13 + 2
            int r0 = r0 + 1
            r14 = r3
        L70d:
            int r13 = r13 + 2
            r3 = 4
            r8 = -1
            r11 = 1
            r15 = 0
            goto L6e4
        L714:
            if (r14 != r4) goto L719
            if (r0 != r10) goto L719
            goto L744
        L719:
            java.lang.String r0 = "Error parsing file names"
            defpackage.e41.i(r0)
            goto L76e
        L71f:
            r10 = r23
            int r0 = r6.cardinality()
            java.util.BitSet r0 = x(r0, r1)
            r9 = r0
            goto L744
        L72b:
            r10 = r23
            int r0 = r6.cardinality()
            java.util.BitSet r0 = x(r0, r1)
            r7 = r0
            goto L744
        L737:
            r10 = r23
            java.util.BitSet r0 = x(r10, r1)
            r6 = r0
            goto L744
        L73f:
            r10 = r23
            X(r1, r12)
        L744:
            r4 = r10
            r0 = 8
            r3 = 1
            r8 = -1
            r17 = 0
            goto L494
        L74d:
            r2.Z = r0
            r3 = r2
            goto L776
        L751:
            defpackage.e41.i(r10)
            goto L76e
        L755:
            java.lang.String r0 = "Badly terminated header, found "
            java.lang.String r0 = defpackage.lb1.g(r6, r0)
            defpackage.e41.i(r0)
            goto L76e
        L75f:
            defpackage.e41.i(r10)
            goto L76e
        L763:
            java.lang.String r0 = "Broken or unsupported archive: no Header"
            defpackage.e41.i(r0)
            goto L76e
        L769:
            java.lang.String r0 = "NextHeader CRC-32 mismatch"
            defpackage.e41.i(r0)
        L76e:
            r3 = 0
            goto L776
        L770:
            java.lang.String r0 = "Problem computing NextHeader CRC-32"
            defpackage.e41.i(r0)
            goto L76e
        L776:
            return r3
        L777:
            r0 = move-exception
            r1 = r0
            goto L78a
        L77a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L777
            java.lang.String r1 = "nextHeaderSize is out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L777
            throw r0     // Catch: java.lang.Throwable -> L777
        L782:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L777
            java.lang.String r1 = "nextHeaderOffset is out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L777
            throw r0     // Catch: java.lang.Throwable -> L777
        L78a:
            r8.close()     // Catch: java.lang.Throwable -> L78e
            goto L792
        L78e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L792:
            throw r1
        L793:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Unsupported 7z version (%d,%d)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L7ab:
            java.lang.String r0 = "Bad 7z signature"
            defpackage.e41.i(r0)
            r21 = 0
            return r21
    }

    public final void N(int r11, defpackage.md6 r12) {
            r10 = this;
            java.util.ArrayList r0 = r10.d0
            r0.clear()
            java.io.InputStream r0 = r10.Y
            if (r0 == 0) goto Lf
            r0.close()
            r0 = 0
            r10.Y = r0
        Lf:
            qa r0 = r10.L
            java.lang.Object r1 = r0.Y
            fi2[] r1 = (defpackage.fi2[]) r1
            r1 = r1[r11]
            java.lang.Object r2 = r0.e0
            eb r2 = (defpackage.eb) r2
            java.lang.Object r3 = r2.B
            int[] r3 = (int[]) r3
            r11 = r3[r11]
            r3 = 32
            long r5 = r0.B
            long r5 = r5 + r3
            java.lang.Object r2 = r2.L
            long[] r2 = (long[]) r2
            r3 = r2[r11]
            long r5 = r5 + r3
            java.nio.channels.SeekableByteChannel r2 = r10.B
            r2.position(r5)
            pd6 r2 = new pd6
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            v60 r4 = new v60
            java.nio.channels.SeekableByteChannel r5 = r10.B
            java.lang.Object r0 = r0.L
            long[] r0 = (long[]) r0
            r6 = r0[r11]
            r4.<init>(r5, r6)
            r3.<init>(r4)
            r2.<init>(r10, r3)
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.util.List r0 = r1.a()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
        L57:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r0.next()
            r7 = r2
            ps0 r7 = (defpackage.ps0) r7
            long r2 = r7.b
            r5 = 1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto Lb1
            long r2 = r7.c
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto Lb1
            byte[] r2 = r7.a
            td6 r2 = defpackage.td6.byId(r2)
            ps0[] r3 = r1.a
            if (r3 == 0) goto L8f
            r3 = 0
        L7d:
            ps0[] r5 = r1.a
            int r6 = r5.length
            if (r3 >= r6) goto L8f
            r5 = r5[r3]
            if (r5 != r7) goto L8c
            long[] r5 = r1.f
            r8 = r5[r3]
        L8a:
            r5 = r8
            goto L92
        L8c:
            int r3 = r3 + 1
            goto L7d
        L8f:
            r8 = 0
            goto L8a
        L92:
            byte[] r8 = r10.Z
            int r9 = r10.e0
            java.lang.String r3 = r10.A
            java.io.InputStream r4 = defpackage.us0.a(r3, r4, r5, r7, r8, r9)
            ud6 r3 = new ud6
            qs0 r5 = defpackage.us0.a
            java.lang.Object r5 = r5.get(r2)
            j0 r5 = (defpackage.j0) r5
            java.lang.Object r5 = r5.b(r7)
            r3.<init>(r2, r5)
            r11.addFirst(r3)
            goto L57
        Lb1:
            java.lang.String r10 = "Multi input/output stream coders are not yet supported"
            defpackage.e41.i(r10)
            return
        Lb7:
            r12.a(r11)
            boolean r11 = r1.g
            if (r11 == 0) goto Le5
            int r11 = defpackage.eq0.R
            dq0 r11 = new dq0
            r11.<init>()
            r2 = -1
            r11.x = r2
            java.util.zip.CRC32 r12 = new java.util.zip.CRC32
            r12.<init>()
            r11.w = r12
            f1 r12 = new f1
            r12.<init>(r4)
            r11.t = r12
            long r2 = r1.b()
            r11.x = r2
            long r0 = r1.h
            r11.y = r0
            eq0 r4 = r11.l0()
        Le5:
            r10.Y = r4
            return
    }

    public final void U(java.nio.ByteBuffer r24, defpackage.qd6 r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = u(r1)
            r4 = 6
            r5 = 9
            r6 = 10
            r8 = 0
            if (r3 != r4) goto Lb6
            long r3 = J(r1)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            java.lang.String r11 = ") is out of range"
            if (r10 < 0) goto Lac
            r12 = 32
            long r12 = r12 + r3
            java.nio.channels.SeekableByteChannel r10 = r0.B
            long r14 = r10.size()
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 > 0) goto Lac
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 < 0) goto Lac
            long r14 = J(r1)
            java.lang.String r10 = "numPackStreams"
            int r10 = e(r14, r10)
            r2.a = r10
            int r10 = u(r1)
            if (r10 != r5) goto L75
            r14 = r8
            r16 = r14
            r10 = 0
        L44:
            int r8 = r2.a
            if (r10 >= r8) goto L70
            long r8 = J(r1)
            long r14 = r14 + r8
            long r18 = r12 + r14
            int r20 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r20 < 0) goto L66
            java.nio.channels.SeekableByteChannel r5 = r0.B
            long r21 = r5.size()
            int r5 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r5 > 0) goto L66
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 < 0) goto L66
            int r10 = r10 + 1
            r5 = 9
            goto L44
        L66:
            java.lang.String r0 = "packSize ("
            java.lang.String r0 = defpackage.lb1.i(r8, r0, r11)
            defpackage.e41.i(r0)
            return
        L70:
            int r10 = u(r1)
            goto L77
        L75:
            r16 = r8
        L77:
            if (r10 != r6) goto L99
            int r0 = r2.a
            java.util.BitSet r0 = v(r0, r1)
            int r0 = r0.cardinality()
            int r0 = r0 * 4
            long r3 = (long) r0
            long r8 = X(r1, r3)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L93
            int r10 = u(r1)
            goto L99
        L93:
            java.lang.String r0 = "invalid number of CRCs in PackInfo"
            defpackage.e41.i(r0)
            return
        L99:
            if (r10 != 0) goto La0
            int r3 = u(r1)
            goto Lb8
        La0:
            java.lang.String r0 = "Badly terminated PackInfo ("
            java.lang.String r1 = ")"
            java.lang.String r0 = defpackage.lb1.k(r0, r10, r1)
            defpackage.e41.i(r0)
            return
        Lac:
            java.lang.String r0 = "packPos ("
            java.lang.String r0 = defpackage.lb1.i(r3, r0, r11)
            defpackage.e41.i(r0)
            return
        Lb6:
            r16 = r8
        Lb8:
            r0 = 7
            java.lang.String r4 = "negative unpackSize"
            if (r3 != r0) goto L2bd
            int r0 = u(r1)
            r3 = 11
            if (r0 != r3) goto L2b3
            long r8 = J(r1)
            java.lang.String r0 = "numFolders"
            int r0 = e(r8, r0)
            r2.f = r0
            int r0 = u(r1)
            if (r0 != 0) goto L2ad
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3 = 0
        Ldd:
            int r8 = r2.f
            if (r3 >= r8) goto L228
            java.lang.String r8 = "numCoders"
            long r9 = J(r1)
            int r8 = e(r9, r8)
            if (r8 == 0) goto L222
            long r9 = (long) r8
            long r11 = r2.b
            long r11 = r11 + r9
            r2.b = r11
            r10 = r16
            r12 = r10
            r9 = 0
        Lf7:
            if (r9 >= r8) goto L167
            r18 = 1
            int r14 = u(r1)
            r15 = r14 & 15
            byte[] r6 = new byte[r15]
            k(r15, r1)
            r1.get(r6)
            r6 = r14 & 16
            if (r6 != 0) goto L10f
            r6 = 1
            goto L110
        L10f:
            r6 = 0
        L110:
            r15 = r14 & 32
            if (r15 == 0) goto L116
            r15 = 1
            goto L117
        L116:
            r15 = 0
        L117:
            r14 = r14 & 128(0x80, float:1.8E-43)
            if (r14 != 0) goto L161
            if (r6 == 0) goto L124
            long r10 = r10 + r18
            long r12 = r12 + r18
            r23 = r8
            goto L13e
        L124:
            java.lang.String r6 = "numInStreams"
            r23 = r8
            long r7 = J(r1)
            int r6 = e(r7, r6)
            long r6 = (long) r6
            long r10 = r10 + r6
            java.lang.String r6 = "numOutStreams"
            long r7 = J(r1)
            int r6 = e(r7, r6)
            long r6 = (long) r6
            long r12 = r12 + r6
        L13e:
            if (r15 == 0) goto L15a
            java.lang.String r6 = "propertiesSize"
            long r7 = J(r1)
            int r6 = e(r7, r6)
            long r6 = (long) r6
            long r18 = X(r1, r6)
            int r6 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r6 < 0) goto L154
            goto L15a
        L154:
            java.lang.String r0 = "invalid propertiesSize in folder"
            defpackage.e41.i(r0)
            return
        L15a:
            int r9 = r9 + 1
            r8 = r23
            r6 = 10
            goto Lf7
        L161:
            java.lang.String r0 = "Alternative methods are unsupported, please report. The reference implementation doesn't support them either."
            defpackage.e41.i(r0)
            return
        L167:
            r18 = 1
            java.lang.String r6 = "totalInStreams"
            e(r10, r6)
            java.lang.String r6 = "totalOutStreams"
            e(r12, r6)
            long r6 = r2.c
            long r6 = r6 + r12
            r2.c = r6
            long r6 = r2.d
            long r6 = r6 + r10
            r2.d = r6
            int r6 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r6 == 0) goto L21c
            java.lang.String r6 = "numBindPairs"
            long r7 = r12 - r18
            int r6 = e(r7, r6)
            long r7 = (long) r6
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 < 0) goto L216
            java.util.BitSet r9 = new java.util.BitSet
            int r15 = (int) r10
            r9.<init>(r15)
            r15 = 0
        L195:
            if (r15 >= r6) goto L1cf
            java.lang.String r14 = "inIndex"
            r19 = r6
            long r5 = J(r1)
            int r5 = e(r5, r14)
            r14 = r3
            r6 = r4
            long r3 = (long) r5
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1c9
            r9.set(r5)
            java.lang.String r3 = "outIndex"
            long r4 = J(r1)
            int r3 = e(r4, r3)
            long r3 = (long) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1c3
            int r15 = r15 + 1
            r4 = r6
            r3 = r14
            r6 = r19
            goto L195
        L1c3:
            java.lang.String r0 = "outIndex is bigger than number of outStreams"
            defpackage.e41.i(r0)
            return
        L1c9:
            java.lang.String r0 = "inIndex is bigger than number of inStreams"
            defpackage.e41.i(r0)
            return
        L1cf:
            r14 = r3
            r6 = r4
            java.lang.String r3 = "numPackedStreams"
            long r4 = r10 - r7
            int r3 = e(r4, r3)
            r4 = 1
            if (r3 != r4) goto L1eb
            r4 = 0
            int r3 = r9.nextClearBit(r4)
            r5 = -1
            if (r3 == r5) goto L1e5
            goto L207
        L1e5:
            java.lang.String r0 = "Couldn't find stream's bind pair index"
            defpackage.e41.i(r0)
            return
        L1eb:
            r4 = 0
            r5 = r4
        L1ed:
            if (r5 >= r3) goto L207
            java.lang.String r7 = "packedStreamIndex"
            long r8 = J(r1)
            int r7 = e(r8, r7)
            long r7 = (long) r7
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L201
            int r5 = r5 + 1
            goto L1ed
        L201:
            java.lang.String r0 = "packedStreamIndex is bigger than number of totalInStreams"
            defpackage.e41.i(r0)
            return
        L207:
            int r3 = (int) r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r3 = r14 + 1
            r4 = r6
            r6 = 10
            goto Ldd
        L216:
            java.lang.String r0 = "Total input streams can't be less than the number of bind pairs"
            defpackage.e41.i(r0)
            return
        L21c:
            java.lang.String r0 = "Total output streams can't be 0"
            defpackage.e41.i(r0)
            return
        L222:
            java.lang.String r0 = "Folder without coders"
            defpackage.e41.i(r0)
            return
        L228:
            r6 = r4
            r4 = 0
            long r9 = r2.c
            long r7 = (long) r8
            long r9 = r9 - r7
            long r7 = r2.d
            long r7 = r7 - r9
            int r3 = r2.a
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L2a7
            int r3 = u(r1)
            r5 = 12
            if (r3 != r5) goto L29d
            java.util.Iterator r0 = r0.iterator()
        L244:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L266
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r4
        L255:
            if (r5 >= r3) goto L244
            long r7 = J(r1)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 < 0) goto L262
            int r5 = r5 + 1
            goto L255
        L262:
            defpackage.i.h(r6)
            return
        L266:
            int r0 = u(r1)
            r3 = 10
            if (r0 != r3) goto L290
            int r0 = r2.f
            java.util.BitSet r0 = v(r0, r1)
            r2.g = r0
            int r0 = r0.cardinality()
            int r0 = r0 * 4
            long r7 = (long) r0
            long r9 = X(r1, r7)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L28a
            int r0 = u(r1)
            goto L290
        L28a:
            java.lang.String r0 = "invalid number of CRCs in UnpackInfo"
            defpackage.e41.i(r0)
            return
        L290:
            if (r0 != 0) goto L297
            int r3 = u(r1)
            goto L2bf
        L297:
            java.lang.String r0 = "Badly terminated UnpackInfo"
            defpackage.e41.i(r0)
            return
        L29d:
            java.lang.String r0 = "Expected kCodersUnpackSize, got "
            java.lang.String r0 = defpackage.lb1.g(r3, r0)
            defpackage.e41.i(r0)
            return
        L2a7:
            java.lang.String r0 = "archive doesn't contain enough packed streams"
            defpackage.e41.i(r0)
            return
        L2ad:
            java.lang.String r0 = "External unsupported"
            defpackage.e41.i(r0)
            return
        L2b3:
            java.lang.String r1 = "Expected kFolder, got "
            java.lang.String r0 = defpackage.lb1.g(r0, r1)
            defpackage.e41.i(r0)
            return
        L2bd:
            r6 = r4
            r4 = 0
        L2bf:
            r0 = 8
            if (r3 != r0) goto L3b4
            int r0 = u(r1)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r5 = 13
            if (r0 != r5) goto L301
            r0 = r4
        L2d1:
            int r5 = r2.f
            if (r0 >= r5) goto L2e9
            java.lang.String r5 = "numStreams"
            long r7 = J(r1)
            int r5 = e(r7, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.add(r5)
            int r0 = r0 + 1
            goto L2d1
        L2e9:
            java.util.stream.Stream r0 = r3.stream()
            od6 r5 = new od6
            r5.<init>()
            java.util.stream.LongStream r0 = r0.mapToLong(r5)
            long r7 = r0.sum()
            r2.e = r7
            int r0 = u(r1)
            goto L306
        L301:
            int r5 = r2.f
            long r7 = (long) r5
            r2.e = r7
        L306:
            java.lang.String r5 = "totalUnpackStreams"
            long r7 = r2.e
            e(r7, r5)
            r5 = 9
            if (r0 != r5) goto L340
            java.util.Iterator r0 = r3.iterator()
        L315:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L33c
            java.lang.Object r5 = r0.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L328
            goto L315
        L328:
            r7 = r4
        L329:
            int r8 = r5 + (-1)
            if (r7 >= r8) goto L315
            long r8 = J(r1)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 < 0) goto L338
            int r7 = r7 + 1
            goto L329
        L338:
            defpackage.e41.i(r6)
            return
        L33c:
            int r0 = u(r1)
        L340:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L355
            java.util.BitSet r3 = r2.g
            int r2 = r2.f
            if (r3 != 0) goto L34d
            goto L352
        L34d:
            int r3 = r3.cardinality()
            int r2 = r2 - r3
        L352:
            r3 = 10
            goto L381
        L355:
            java.util.Iterator r3 = r3.iterator()
            r7 = r4
        L35a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L37f
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 1
            if (r5 != r6) goto L37d
            java.util.BitSet r8 = r2.g
            if (r8 == 0) goto L37d
            int r9 = r4 + 1
            boolean r4 = r8.get(r4)
            if (r4 != 0) goto L37b
            r4 = r9
            goto L37d
        L37b:
            r4 = r9
            goto L35a
        L37d:
            int r7 = r7 + r5
            goto L35a
        L37f:
            r2 = r7
            goto L352
        L381:
            if (r0 != r3) goto L3a7
            java.lang.String r0 = "numDigests"
            long r3 = (long) r2
            e(r3, r0)
            java.util.BitSet r0 = v(r2, r1)
            int r0 = r0.cardinality()
            int r0 = r0 * 4
            long r2 = (long) r0
            long r4 = X(r1, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L3a1
            int r0 = u(r1)
            goto L3a7
        L3a1:
            java.lang.String r0 = "invalid number of missing CRCs in SubStreamInfo"
            defpackage.e41.i(r0)
            return
        L3a7:
            if (r0 != 0) goto L3ae
            int r3 = u(r1)
            goto L3b4
        L3ae:
            java.lang.String r0 = "Badly terminated SubStreamsInfo"
            defpackage.e41.i(r0)
            return
        L3b4:
            if (r3 != 0) goto L3b7
            return
        L3b7:
            java.lang.String r0 = "Badly terminated StreamsInfo"
            defpackage.e41.i(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            java.nio.channels.SeekableByteChannel r0 = r4.B
            if (r0 == 0) goto L22
            r1 = 0
            r2 = 0
            r0.close()     // Catch: java.lang.Throwable -> L15
            r4.B = r2
            byte[] r0 = r4.Z
            if (r0 == 0) goto L12
            java.util.Arrays.fill(r0, r1)
        L12:
            r4.Z = r2
            return
        L15:
            r0 = move-exception
            r4.B = r2
            byte[] r3 = r4.Z
            if (r3 == 0) goto L1f
            java.util.Arrays.fill(r3, r1)
        L1f:
            r4.Z = r2
            throw r0
        L22:
            return
    }

    public final void h(int r18, boolean r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.d0
            qa r3 = r0.L
            java.lang.Object r4 = r3.e0
            eb r4 = (defpackage.eb) r4
            if (r4 == 0) goto L1b4
            java.lang.Object r4 = r4.X
            int[] r4 = (int[]) r4
            r4 = r4[r1]
            if (r4 >= 0) goto L1a
            r2.clear()
            return
        L1a:
            java.lang.Object r5 = r3.d0
            md6[] r5 = (defpackage.md6[]) r5
            r6 = r5[r1]
            int r7 = r0.X
            r8 = 1
            if (r7 != r4) goto L4d
            if (r1 <= 0) goto L30
            int r7 = r1 + (-1)
            r5 = r5[r7]
            java.util.List r5 = r5.p
            r6.a(r5)
        L30:
            if (r19 == 0) goto L4b
            java.util.List r5 = r6.p
            if (r5 != 0) goto L4b
            java.lang.Object r5 = r3.e0
            eb r5 = (defpackage.eb) r5
            java.lang.Object r5 = r5.R
            int[] r5 = (int[]) r5
            r5 = r5[r4]
            java.lang.Object r7 = r3.d0
            md6[] r7 = (defpackage.md6[]) r7
            r5 = r7[r5]
            java.util.List r5 = r5.p
            r6.a(r5)
        L4b:
            r5 = r8
            goto L53
        L4d:
            r0.X = r4
            r0.N(r4, r6)
            r5 = 0
        L53:
            r10 = -1
            if (r19 == 0) goto L14c
            java.lang.Object r7 = r3.d0
            md6[] r7 = (defpackage.md6[]) r7
            r7 = r7[r1]
            int r12 = r0.R
            if (r12 != r1) goto Lbc
            boolean r12 = r2.isEmpty()
            if (r12 != 0) goto Lb8
            int r12 = r2.size()
            int r12 = r12 - r8
            java.lang.Object r12 = r2.get(r12)
            java.io.InputStream r12 = (java.io.InputStream) r12
            boolean r13 = r12 instanceof defpackage.eq0
            if (r13 == 0) goto L94
            r13 = r12
            eq0 r13 = (defpackage.eq0) r13
            long r14 = r13.L
            monitor-enter(r13)
            r16 = r8
            long r8 = r13.A     // Catch: java.lang.Throwable -> L91
            monitor-exit(r13)
            long r14 = r14 - r8
            java.lang.Object r8 = r3.d0
            md6[] r8 = (defpackage.md6[]) r8
            int r9 = r0.R
            r8 = r8[r9]
            long r8 = r8.o
            int r8 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r8 == 0) goto L14c
            goto Lbe
        L91:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L91
            throw r0
        L94:
            r16 = r8
            boolean r8 = r12 instanceof defpackage.u60
            if (r8 == 0) goto L14c
            u60 r12 = (defpackage.u60) r12
            long r8 = r12.L
            long r12 = r12.h()
            long r8 = r8 - r12
            r12 = 0
            long r8 = java.lang.Math.max(r12, r8)
            java.lang.Object r12 = r3.d0
            md6[] r12 = (defpackage.md6[]) r12
            int r13 = r0.R
            r12 = r12[r13]
            long r12 = r12.o
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L14c
            goto Lbe
        Lb8:
            r16 = r8
            goto L14c
        Lbc:
            r16 = r8
        Lbe:
            java.lang.Object r8 = r3.e0
            eb r8 = (defpackage.eb) r8
            java.lang.Object r8 = r8.R
            int[] r8 = (int[]) r8
            int r9 = r0.X
            r8 = r8[r9]
            if (r5 == 0) goto Ld6
            int r5 = r0.R
            if (r5 >= r1) goto Ld3
            int r8 = r5 + 1
            goto Ld6
        Ld3:
            r0.N(r4, r7)
        Ld6:
            if (r8 >= r1) goto L14a
            java.lang.Object r4 = r3.d0
            md6[] r4 = (defpackage.md6[]) r4
            r4 = r4[r8]
            int r5 = defpackage.u60.X
            t60 r5 = new t60
            r5.<init>()
            r5.w = r10
            r9 = r16
            r5.x = r9
            java.io.InputStream r9 = r0.Y
            f1 r12 = new f1
            r12.<init>(r9)
            r5.t = r12
            long r12 = r4.o
            long r12 = java.lang.Math.max(r10, r12)
            r5.w = r12
            r9 = 0
            r5.x = r9
            u60 r9 = new u60
            f1 r12 = r5.t
            if (r12 == 0) goto L144
            java.lang.Object r12 = r12.t
            java.io.InputStream r12 = (java.io.InputStream) r12
            long r13 = r5.w
            boolean r5 = r5.x
            r9.<init>(r12, r13, r5)
            boolean r5 = r4.m
            if (r5 == 0) goto L137
            int r5 = defpackage.eq0.R
            dq0 r5 = new dq0
            r5.<init>()
            r5.x = r10
            java.util.zip.CRC32 r12 = new java.util.zip.CRC32
            r12.<init>()
            r5.w = r12
            f1 r12 = new f1
            r12.<init>(r9)
            r5.t = r12
            long r12 = r4.o
            r5.x = r12
            long r12 = r4.n
            r5.y = r12
            eq0 r9 = r5.l0()
        L137:
            r2.add(r9)
            java.util.List r5 = r7.p
            r4.a(r5)
            int r8 = r8 + 1
            r16 = 1
            goto Ld6
        L144:
            java.lang.String r0 = "origin == null"
            defpackage.i.m(r0)
            return
        L14a:
            r9 = 1
            goto L14d
        L14c:
            r9 = 0
        L14d:
            if (r19 == 0) goto L156
            int r3 = r0.R
            if (r3 != r1) goto L156
            if (r9 != 0) goto L156
            return
        L156:
            int r1 = defpackage.u60.X
            t60 r1 = new t60
            r1.<init>()
            r1.w = r10
            r9 = 1
            r1.x = r9
            java.io.InputStream r0 = r0.Y
            f1 r3 = new f1
            r3.<init>(r0)
            r1.t = r3
            long r3 = r6.o
            long r3 = java.lang.Math.max(r10, r3)
            r1.w = r3
            r9 = 0
            r1.x = r9
            u60 r0 = new u60
            f1 r3 = r1.t
            if (r3 == 0) goto L1ae
            java.lang.Object r3 = r3.t
            java.io.InputStream r3 = (java.io.InputStream) r3
            long r4 = r1.w
            boolean r1 = r1.x
            r0.<init>(r3, r4, r1)
            boolean r1 = r6.m
            if (r1 == 0) goto L1aa
            int r1 = defpackage.eq0.R
            dq0 r1 = new dq0
            r1.<init>()
            r1.x = r10
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r1.w = r3
            f1 r3 = new f1
            r3.<init>(r0)
            r1.t = r3
            long r3 = r6.n
            r1.y = r3
            eq0 r0 = r1.l0()
        L1aa:
            r2.add(r0)
            return
        L1ae:
            java.lang.String r0 = "origin == null"
            defpackage.i.m(r0)
            return
        L1b4:
            java.lang.String r0 = "Archive doesn't contain stream information to read entries"
            defpackage.e41.i(r0)
            return
    }

    public final java.io.InputStream r(defpackage.md6 r10) {
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            qa r2 = r9.L
            java.lang.Object r3 = r2.d0
            md6[] r3 = (defpackage.md6[]) r3
            int r4 = r3.length
            if (r1 >= r4) goto L13
            r3 = r3[r1]
            if (r10 != r3) goto L10
            goto L14
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            r1 = -1
        L14:
            r3 = 0
            if (r1 < 0) goto L96
            r10 = 1
            r9.h(r1, r10)
            r9.R = r1
            java.lang.Object r4 = r2.e0
            eb r4 = (defpackage.eb) r4
            java.lang.Object r4 = r4.X
            int[] r4 = (int[]) r4
            r4 = r4[r1]
            r9.X = r4
            java.lang.Object r2 = r2.d0
            md6[] r2 = (defpackage.md6[]) r2
            r1 = r2[r1]
            long r1 = r1.o
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L3f
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            byte[] r10 = defpackage.q60.b
            r9.<init>(r10)
            return r9
        L3f:
            java.util.ArrayList r9 = r9.d0
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L90
        L47:
            int r1 = r9.size()
            if (r1 <= r10) goto L89
            java.lang.Object r1 = r9.remove(r0)
            java.io.InputStream r1 = (java.io.InputStream) r1
            a13 r2 = defpackage.b13.a     // Catch: java.lang.Throwable -> L7d
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L5a:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L77
            a13 r6 = defpackage.b13.a     // Catch: java.lang.Throwable -> L7d
            r6 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L7d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L7d
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L7d
            long r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L7d
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L7d
            int r6 = r1.read(r6, r0, r7)     // Catch: java.lang.Throwable -> L7d
            long r6 = (long) r6
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L75
            goto L77
        L75:
            long r2 = r2 - r6
            goto L5a
        L77:
            if (r1 == 0) goto L47
            r1.close()
            goto L47
        L7d:
            r9 = move-exception
            if (r1 == 0) goto L88
            r1.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r10 = move-exception
            r9.addSuppressed(r10)
        L88:
            throw r9
        L89:
            java.lang.Object r9 = r9.get(r0)
            java.io.InputStream r9 = (java.io.InputStream) r9
            return r9
        L90:
            java.lang.String r9 = "No current 7z entry (call getNextEntry() first)."
            defpackage.i.m(r9)
            return r3
        L96:
            java.lang.String r10 = r10.a
            java.lang.String r0 = " in "
            java.lang.String r9 = r9.A
            java.lang.String r1 = "Can not find "
            defpackage.e41.k(r1, r10, r0, r9)
            return r3
    }

    public final java.lang.String toString() {
            r0 = this;
            qa r0 = r0.L
            java.lang.String r0 = r0.toString()
            return r0
    }
}
