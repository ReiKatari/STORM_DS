package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a00  reason: default package */
/* loaded from: classes.dex */
public final class a00 extends defpackage.oy0 {
    public int A;
    public int B;
    public int L;
    public boolean R;
    public final defpackage.ga0 X;
    public int Y;
    public defpackage.n40 Z;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public char p0;
    public defpackage.zz q0;

    public a00(java.io.InputStream r6) {
            r5 = this;
            r5.<init>()
            ga0 r0 = new ga0
            r1 = 0
            r0.<init>(r1)
            r2 = -1
            r0.b = r2
            r5.X = r0
            r0 = 1
            r5.d0 = r0
            n40 r0 = new n40
            java.io.InputStream r2 = java.lang.System.in
            if (r6 != r2) goto L1b
            zr0 r6 = defpackage.zr0.h(r6)
        L1b:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r0.<init>(r6, r2)
            r5.Z = r0
            n40 r6 = r5.Z
            if (r6 == 0) goto L6b
            r0 = 8
            long r2 = r6.e(r0)
            int r6 = (int) r2
            n40 r2 = r5.Z
            long r2 = r2.e(r0)
            int r2 = (int) r2
            n40 r3 = r5.Z
            long r3 = r3.e(r0)
            int r3 = (int) r3
            r4 = 66
            if (r6 != r4) goto L63
            r6 = 90
            if (r2 != r6) goto L63
            r6 = 104(0x68, float:1.46E-43)
            if (r3 != r6) goto L63
            n40 r6 = r5.Z
            long r2 = r6.e(r0)
            int r6 = (int) r2
            r0 = 49
            if (r6 < r0) goto L5d
            r0 = 57
            if (r6 > r0) goto L5d
            int r6 = r6 + (-48)
            r5.L = r6
            r5.g0 = r1
            goto L70
        L5d:
            java.lang.String r6 = "BZip2 block size is invalid"
            defpackage.e41.i(r6)
            goto L70
        L63:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Stream is not in the BZip2 format"
            r5.<init>(r6)
            throw r5
        L6b:
            java.lang.String r6 = "No InputStream"
            defpackage.e41.i(r6)
        L70:
            r5.n()
            return
    }

    public static int e(defpackage.n40 r2, int r3) {
            long r2 = r2.e(r3)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            int r2 = (int) r2
            return r2
        Lc:
            java.lang.String r2 = "Unexpected end of stream"
            defpackage.e41.i(r2)
            r2 = 0
            return r2
    }

    public static void h(int r1, int r2, java.lang.String r3) {
            java.lang.String r0 = "Corrupted input, "
            if (r1 < 0) goto L11
            if (r1 >= r2) goto L7
            return
        L7:
            java.lang.String r1 = " value too big"
            java.lang.String r1 = defpackage.lb1.A(r0, r3, r1)
            defpackage.e41.i(r1)
            return
        L11:
            java.lang.String r1 = " value negative"
            java.lang.String r1 = defpackage.lb1.A(r0, r3, r1)
            defpackage.e41.i(r1)
            return
    }

    public final int A() {
            r5 = this;
            int r0 = r5.k0
            int r1 = r5.A
            if (r0 > r1) goto L59
            int r0 = r5.i0
            r5.j0 = r0
            zz r0 = r5.q0
            byte[] r1 = r0.o
            int r2 = r5.o0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r0 = r0.n
            int r0 = r0.length
            java.lang.String r3 = "su_tPos"
            h(r2, r0, r3)
            zz r0 = r5.q0
            int[] r0 = r0.n
            int r2 = r5.o0
            r0 = r0[r2]
            r5.o0 = r0
            int r0 = r5.m0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L3f
            int r0 = r5.n0
            int[] r4 = defpackage.g04.j
            r4 = r4[r0]
            int r4 = r4 - r3
            r5.m0 = r4
            int r0 = r0 + r3
            r5.n0 = r0
            r4 = 512(0x200, float:7.17E-43)
            if (r0 != r4) goto L42
            r5.n0 = r2
            goto L42
        L3f:
            int r0 = r0 - r3
            r5.m0 = r0
        L42:
            int r0 = r5.m0
            if (r0 != r3) goto L47
            r2 = r3
        L47:
            r0 = r1 ^ r2
            r5.i0 = r0
            int r1 = r5.k0
            int r1 = r1 + r3
            r5.k0 = r1
            r1 = 3
            r5.d0 = r1
            ga0 r5 = r5.X
            r5.i(r0)
            return r0
        L59:
            r5.k()
            r5.n()
            int r5 = r5.u()
            return r5
    }

    public final int D() {
            r2 = this;
            int r0 = r2.l0
            char r1 = r2.p0
            if (r0 >= r1) goto L16
            ga0 r0 = r2.X
            int r1 = r2.i0
            r0.i(r1)
            int r0 = r2.l0
            int r0 = r0 + 1
            r2.l0 = r0
            int r2 = r2.i0
            return r2
        L16:
            r0 = 2
            r2.d0 = r0
            int r0 = r2.k0
            int r0 = r0 + 1
            r2.k0 = r0
            r0 = 0
            r2.h0 = r0
            int r2 = r2.A()
            return r2
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            n40 r0 = r2.Z
            if (r0 == 0) goto L13
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Ld
            r2.q0 = r1
            r2.Z = r1
            return
        Ld:
            r0 = move-exception
            r2.q0 = r1
            r2.Z = r1
            throw r0
        L13:
            return
    }

    public final void k() {
            r3 = this;
            ga0 r0 = r3.X
            int r0 = r0.b
            int r0 = ~r0
            int r1 = r3.e0
            if (r1 != r0) goto L14
            int r1 = r3.g0
            int r2 = r1 << 1
            int r1 = r1 >>> 31
            r1 = r1 | r2
            r0 = r0 ^ r1
            r3.g0 = r0
            return
        L14:
            int r0 = r3.f0
            int r2 = r0 << 1
            int r0 = r0 >>> 31
            r0 = r0 | r2
            r0 = r0 ^ r1
            r3.g0 = r0
            java.lang.String r3 = "BZip2 CRC error"
            defpackage.e41.i(r3)
            return
    }

    public final void n() {
            r39 = this;
            r0 = r39
            n40 r1 = r0.Z
            r2 = 8
            int r3 = e(r1, r2)
            char r3 = (char) r3
            int r4 = e(r1, r2)
            char r4 = (char) r4
            int r5 = e(r1, r2)
            char r5 = (char) r5
            int r6 = e(r1, r2)
            char r6 = (char) r6
            int r7 = e(r1, r2)
            char r7 = (char) r7
            int r2 = e(r1, r2)
            char r2 = (char) r2
            r8 = 23
            r9 = 32
            r10 = 0
            if (r3 != r8) goto L58
            r11 = 114(0x72, float:1.6E-43)
            if (r4 != r11) goto L58
            r11 = 69
            if (r5 != r11) goto L58
            r11 = 56
            if (r6 != r11) goto L58
            r11 = 80
            if (r7 != r11) goto L58
            r11 = 144(0x90, float:2.02E-43)
            if (r2 == r11) goto L40
            goto L58
        L40:
            n40 r1 = r0.Z
            int r1 = e(r1, r9)
            r0.f0 = r1
            r0.d0 = r10
            r2 = 0
            r0.q0 = r2
            int r0 = r0.g0
            if (r1 != r0) goto L52
            return
        L52:
            java.lang.String r0 = "BZip2 CRC error"
            defpackage.e41.i(r0)
            return
        L58:
            r11 = 49
            if (r3 != r11) goto L492
            r3 = 65
            if (r4 != r3) goto L492
            r3 = 89
            if (r5 != r3) goto L492
            r4 = 38
            if (r6 != r4) goto L492
            r4 = 83
            if (r7 != r4) goto L492
            if (r2 != r3) goto L492
            int r2 = e(r1, r9)
            r0.e0 = r2
            r2 = 1
            int r1 = e(r1, r2)
            if (r1 != r2) goto L7d
            r1 = r2
            goto L7e
        L7d:
            r1 = r10
        L7e:
            r0.R = r1
            zz r1 = r0.q0
            if (r1 != 0) goto L8d
            zz r1 = new zz
            int r3 = r0.L
            r1.<init>(r3)
            r0.q0 = r1
        L8d:
            n40 r1 = r0.Z
            r3 = 24
            int r3 = e(r1, r3)
            r0.B = r3
            n40 r3 = r0.Z
            zz r4 = r0.q0
            boolean[] r5 = r4.a
            byte[] r6 = r4.m
            byte[] r7 = r4.c
            byte[] r12 = r4.d
            r13 = r10
            r14 = r13
        La5:
            r15 = 16
            if (r13 >= r15) goto Lb5
            int r15 = e(r3, r2)
            if (r15 == 0) goto Lb2
            int r15 = r2 << r13
            r14 = r14 | r15
        Lb2:
            int r13 = r13 + 1
            goto La5
        Lb5:
            java.util.Arrays.fill(r5, r10)
            r13 = r10
        Lb9:
            if (r13 >= r15) goto Ld8
            int r16 = r2 << r13
            r16 = r14 & r16
            if (r16 == 0) goto Ld3
            int r16 = r13 << 4
            r9 = r10
        Lc4:
            if (r9 >= r15) goto Ld3
            int r18 = e(r3, r2)
            if (r18 == 0) goto Ld0
            int r18 = r16 + r9
            r5[r18] = r2
        Ld0:
            int r9 = r9 + 1
            goto Lc4
        Ld3:
            int r13 = r13 + 1
            r9 = 32
            goto Lb9
        Ld8:
            zz r5 = r0.q0
            boolean[] r9 = r5.a
            byte[] r5 = r5.b
            r13 = r10
            r14 = r13
        Le0:
            r11 = 256(0x100, float:3.59E-43)
            if (r13 >= r11) goto Lf8
            boolean r11 = r9[r13]
            if (r11 == 0) goto Lf1
            int r11 = r14 + 1
            r18 = r10
            byte r10 = (byte) r13
            r5[r14] = r10
            r14 = r11
            goto Lf3
        Lf1:
            r18 = r10
        Lf3:
            int r13 = r13 + 1
            r10 = r18
            goto Le0
        Lf8:
            r18 = r10
            r0.Y = r14
            int r14 = r14 + 2
            r5 = 3
            int r5 = e(r3, r5)
            r9 = 15
            int r9 = e(r3, r9)
            if (r9 < 0) goto L48c
            r10 = 259(0x103, float:3.63E-43)
            java.lang.String r13 = "alphaSize"
            h(r14, r10, r13)
            r10 = 7
            java.lang.String r13 = "nGroups"
            h(r5, r10, r13)
            r10 = r18
        L11a:
            r13 = 18002(0x4652, float:2.5226E-41)
            if (r10 >= r9) goto L133
            r15 = r18
        L120:
            int r20 = e(r3, r2)
            if (r20 == 0) goto L129
            int r15 = r15 + 1
            goto L120
        L129:
            if (r10 >= r13) goto L12e
            byte r13 = (byte) r15
            r12[r10] = r13
        L12e:
            int r10 = r10 + 1
            r15 = 16
            goto L11a
        L133:
            int r9 = java.lang.Math.min(r9, r13)
            r10 = r5
        L138:
            r15 = -1
            int r10 = r10 + r15
            if (r10 < 0) goto L140
            byte r15 = (byte) r10
            r6[r10] = r15
            goto L138
        L140:
            r20 = r15
            r10 = r18
        L144:
            r15 = 6
            if (r10 >= r9) goto L168
            r13 = r12[r10]
            r13 = r13 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = "selectorMtf"
            h(r13, r15, r11)
            r11 = r6[r13]
        L152:
            if (r13 <= 0) goto L15d
            int r15 = r13 + (-1)
            r15 = r6[r15]
            r6[r13] = r15
            int r13 = r13 + (-1)
            goto L152
        L15d:
            r6[r18] = r11
            r7[r10] = r11
            int r10 = r10 + 1
            r11 = 256(0x100, float:3.59E-43)
            r13 = 18002(0x4652, float:2.5226E-41)
            goto L144
        L168:
            char[][] r4 = r4.l
            r6 = r18
        L16c:
            if (r6 >= r5) goto L194
            r7 = 5
            int r7 = e(r3, r7)
            r9 = r4[r6]
            r10 = r18
        L177:
            if (r10 >= r14) goto L191
        L179:
            int r11 = e(r3, r2)
            if (r11 == 0) goto L18b
            int r11 = e(r3, r2)
            if (r11 == 0) goto L188
            r11 = r20
            goto L189
        L188:
            r11 = r2
        L189:
            int r7 = r7 + r11
            goto L179
        L18b:
            char r11 = (char) r7
            r9[r10] = r11
            int r10 = r10 + 1
            goto L177
        L191:
            int r6 = r6 + 1
            goto L16c
        L194:
            zz r3 = r0.q0
            char[][] r4 = r3.l
            int[] r6 = r3.i
            int[][] r7 = r3.f
            int[][] r9 = r3.g
            int[][] r3 = r3.h
            r10 = r18
        L1a2:
            if (r10 >= r5) goto L254
            r12 = r4[r10]
            r23 = r2
            r22 = r14
            r13 = r18
            r2 = 32
        L1ae:
            int r22 = r22 + (-1)
            if (r22 < 0) goto L1bc
            char r15 = r12[r22]
            if (r15 <= r13) goto L1b7
            r13 = r15
        L1b7:
            if (r15 >= r2) goto L1ba
            r2 = r15
        L1ba:
            r15 = 6
            goto L1ae
        L1bc:
            r12 = r7[r10]
            r15 = r9[r10]
            r22 = r3[r10]
            r25 = r4[r10]
            r8 = r2
            r26 = r18
        L1c7:
            if (r8 > r13) goto L1e3
            r11 = r18
        L1cb:
            if (r11 >= r14) goto L1de
            r29 = r2
            char r2 = r25[r11]
            if (r2 != r8) goto L1d9
            int r2 = r26 + 1
            r22[r26] = r11
            r26 = r2
        L1d9:
            int r11 = r11 + 1
            r2 = r29
            goto L1cb
        L1de:
            r29 = r2
            int r8 = r8 + 1
            goto L1c7
        L1e3:
            r29 = r2
            r2 = 23
        L1e7:
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L1f0
            r15[r2] = r18
            r12[r2] = r18
            goto L1e7
        L1f0:
            r2 = r18
        L1f2:
            if (r2 >= r14) goto L20a
            char r8 = r25[r2]
            java.lang.String r11 = "length"
            r22 = r2
            r2 = 258(0x102, float:3.62E-43)
            h(r8, r2, r11)
            int r8 = r8 + 1
            r2 = r15[r8]
            int r2 = r2 + 1
            r15[r8] = r2
            int r2 = r22 + 1
            goto L1f2
        L20a:
            r2 = r15[r18]
            r8 = r23
            r11 = 23
        L210:
            if (r8 >= r11) goto L21b
            r22 = r15[r8]
            int r2 = r2 + r22
            r15[r8] = r2
            int r8 = r8 + 1
            goto L210
        L21b:
            r2 = r15[r29]
            r8 = r18
            r11 = r29
        L221:
            if (r11 > r13) goto L235
            int r22 = r11 + 1
            r25 = r15[r22]
            int r2 = r25 - r2
            int r2 = r2 + r8
            int r8 = r2 + (-1)
            r12[r11] = r8
            int r8 = r2 << 1
            r11 = r22
            r2 = r25
            goto L221
        L235:
            int r2 = r29 + 1
        L237:
            if (r2 > r13) goto L249
            int r8 = r2 + (-1)
            r8 = r12[r8]
            int r8 = r8 + 1
            int r8 = r8 << 1
            r11 = r15[r2]
            int r8 = r8 - r11
            r15[r2] = r8
            int r2 = r2 + 1
            goto L237
        L249:
            r6[r10] = r29
            int r10 = r10 + 1
            r2 = r23
            r8 = 23
            r15 = 6
            goto L1a2
        L254:
            r23 = r2
            zz r2 = r0.q0
            byte[] r3 = r2.o
            int[] r4 = r2.e
            byte[] r5 = r2.c
            byte[] r6 = r2.b
            char[] r7 = r2.k
            int[] r8 = r2.i
            int[][] r9 = r2.f
            int[][] r10 = r2.g
            int[][] r2 = r2.h
            int r11 = r0.L
            r12 = 100000(0x186a0, float:1.4013E-40)
            int r11 = r11 * r12
            r12 = 256(0x100, float:3.59E-43)
        L272:
            int r12 = r12 + (-1)
            if (r12 < 0) goto L27c
            char r13 = (char) r12
            r7[r12] = r13
            r4[r12] = r18
            goto L272
        L27c:
            int r12 = r0.Y
            int r12 = r12 + 1
            zz r13 = r0.q0
            byte[] r14 = r13.c
            r14 = r14[r18]
            r14 = r14 & 255(0xff, float:3.57E-43)
            java.lang.String r15 = "zt"
            r17 = r2
            r2 = 6
            h(r14, r2, r15)
            int[][] r2 = r13.f
            r2 = r2[r14]
            r22 = r2
            int[] r2 = r13.i
            r2 = r2[r14]
            r25 = r4
            java.lang.String r4 = "zn"
            r26 = r5
            r5 = 258(0x102, float:3.62E-43)
            h(r2, r5, r4)
            n40 r5 = r0.Z
            int r5 = e(r5, r2)
            r27 = r2
        L2ad:
            r2 = r22[r27]
            if (r5 <= r2) goto L2cd
            int r2 = r27 + 1
            r29 = r5
            r5 = 258(0x102, float:3.62E-43)
            h(r2, r5, r4)
            int r5 = r29 << 1
            r27 = r2
            n40 r2 = r0.Z
            r29 = r5
            r5 = r23
            int r2 = e(r2, r5)
            r5 = r29 | r2
            r23 = 1
            goto L2ad
        L2cd:
            r29 = r5
            int[][] r2 = r13.g
            r2 = r2[r14]
            r2 = r2[r27]
            int r5 = r29 - r2
            java.lang.String r2 = "zvec"
            r22 = r6
            r6 = 258(0x102, float:3.62E-43)
            h(r5, r6, r2)
            int[][] r6 = r13.h
            r6 = r6[r14]
            r5 = r6[r5]
            r6 = r26[r18]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r13 = 6
            h(r6, r13, r15)
            r13 = r10[r6]
            r14 = r9[r6]
            r27 = r17[r6]
            r6 = r8[r6]
            r30 = r6
            r6 = r20
            r29 = r27
            r31 = 49
            r27 = r18
        L300:
            if (r5 == r12) goto L480
            r32 = r8
            java.lang.String r8 = "groupNo"
            r33 = r9
            java.lang.String r9 = "yy"
            r34 = r10
            java.lang.String r10 = " exceeds "
            r35 = r12
            if (r5 == 0) goto L315
            r12 = 1
            if (r5 != r12) goto L31b
        L315:
            r36 = r13
            r13 = 16
            goto L3bf
        L31b:
            int r6 = r6 + 1
            if (r6 >= r11) goto L3b5
            r10 = 257(0x101, float:3.6E-43)
            java.lang.String r12 = "nextSym"
            h(r5, r10, r12)
            int r10 = r5 + (-1)
            char r12 = r7[r10]
            r36 = r13
            r13 = 256(0x100, float:3.59E-43)
            h(r12, r13, r9)
            r9 = r22[r12]
            r13 = r9 & 255(0xff, float:3.57E-43)
            r37 = r25[r13]
            r23 = 1
            int r37 = r37 + 1
            r25[r13] = r37
            r3[r6] = r9
            r13 = 16
            if (r5 > r13) goto L350
        L343:
            if (r10 <= 0) goto L34d
            int r5 = r10 + (-1)
            char r9 = r7[r5]
            r7[r10] = r9
            r10 = r5
            goto L343
        L34d:
            r5 = r18
            goto L356
        L350:
            r5 = r18
            r9 = 1
            java.lang.System.arraycopy(r7, r5, r7, r9, r10)
        L356:
            r7[r5] = r12
            if (r31 != 0) goto L37d
            int r5 = r27 + 1
            r9 = 18002(0x4652, float:2.5226E-41)
            h(r5, r9, r8)
            r8 = r26[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 6
            h(r8, r9, r15)
            r9 = r34[r8]
            r10 = r33[r8]
            r12 = r17[r8]
            r8 = r32[r8]
            r27 = r5
            r36 = r9
            r14 = r10
            r29 = r12
            r31 = 49
        L37a:
            r5 = 258(0x102, float:3.62E-43)
            goto L382
        L37d:
            int r31 = r31 + (-1)
            r8 = r30
            goto L37a
        L382:
            h(r8, r5, r4)
            int r9 = e(r1, r8)
            r10 = r8
        L38a:
            r12 = r14[r10]
            if (r9 <= r12) goto L39d
            int r10 = r10 + 1
            h(r10, r5, r4)
            int r9 = r9 << 1
            r12 = 1
            int r19 = e(r1, r12)
            r9 = r9 | r19
            goto L38a
        L39d:
            r10 = r36[r10]
            int r9 = r9 - r10
            h(r9, r5, r2)
            r5 = r29[r9]
            r30 = r8
            r8 = r32
            r9 = r33
            r10 = r34
            r12 = r35
            r13 = r36
        L3b1:
            r18 = 0
            goto L300
        L3b5:
            java.lang.String r0 = "Block overrun in MTF, "
            java.lang.String r0 = defpackage.lb1.j(r0, r6, r11, r10)
            defpackage.e41.i(r0)
            return
        L3bf:
            r13 = r20
            r12 = 1
        L3c2:
            if (r5 != 0) goto L3c8
            int r13 = r13 + r12
            r37 = r7
            goto L3d0
        L3c8:
            r37 = r7
            r7 = 1
            if (r5 != r7) goto L431
            int r5 = r12 << 1
            int r13 = r13 + r5
        L3d0:
            if (r31 != 0) goto L3f4
            int r5 = r27 + 1
            r7 = 18002(0x4652, float:2.5226E-41)
            h(r5, r7, r8)
            r14 = r26[r5]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r7 = 6
            h(r14, r7, r15)
            r36 = r34[r14]
            r24 = r33[r14]
            r29 = r17[r14]
            r30 = r32[r14]
            r27 = r5
            r14 = r24
            r31 = 49
        L3ef:
            r5 = r30
            r7 = 258(0x102, float:3.62E-43)
            goto L3f8
        L3f4:
            r7 = 6
            int r31 = r31 + (-1)
            goto L3ef
        L3f8:
            h(r5, r7, r4)
            int r28 = e(r1, r5)
            r30 = r5
            r7 = r28
            r28 = r30
        L405:
            r5 = r14[r28]
            if (r7 <= r5) goto L41e
            int r5 = r28 + 1
            r38 = r7
            r7 = 258(0x102, float:3.62E-43)
            h(r5, r7, r4)
            int r28 = r38 << 1
            r7 = 1
            int r38 = e(r1, r7)
            r7 = r28 | r38
            r28 = r5
            goto L405
        L41e:
            r38 = r7
            r5 = r36[r28]
            int r7 = r38 - r5
            r5 = 258(0x102, float:3.62E-43)
            h(r7, r5, r2)
            r7 = r29[r7]
            int r12 = r12 << 1
            r5 = r7
            r7 = r37
            goto L3c2
        L431:
            r28 = 258(0x102, float:3.62E-43)
            zz r7 = r0.q0
            byte[] r7 = r7.o
            int r7 = r7.length
            java.lang.String r8 = "s"
            h(r13, r7, r8)
            r18 = 0
            char r7 = r37[r18]
            r8 = 256(0x100, float:3.59E-43)
            h(r7, r8, r9)
            r7 = r22[r7]
            r9 = r7 & 255(0xff, float:3.57E-43)
            r12 = r25[r9]
            int r21 = r13 + 1
            int r21 = r21 + r12
            r25[r9] = r21
            int r6 = r6 + 1
            int r9 = r6 + r13
            zz r12 = r0.q0
            byte[] r12 = r12.o
            int r12 = r12.length
            java.lang.String r13 = "lastShadow"
            h(r9, r12, r13)
            int r12 = r9 + 1
            java.util.Arrays.fill(r3, r6, r12, r7)
            if (r9 >= r11) goto L476
            r6 = r9
            r8 = r32
            r9 = r33
            r10 = r34
            r12 = r35
            r13 = r36
            r7 = r37
            goto L3b1
        L476:
            java.lang.String r0 = "Block overrun while expanding RLE in MTF, "
            java.lang.String r0 = defpackage.lb1.j(r0, r9, r11, r10)
            defpackage.e41.i(r0)
            return
        L480:
            r0.A = r6
            ga0 r1 = r0.X
            r2 = r20
            r1.b = r2
            r7 = 1
            r0.d0 = r7
            return
        L48c:
            java.lang.String r0 = "Corrupted input, nSelectors value negative"
            defpackage.e41.i(r0)
            return
        L492:
            r5 = r10
            r0.d0 = r5
            java.lang.String r0 = "Bad block header"
            defpackage.e41.i(r0)
            return
    }

    public final int r() {
            r7 = this;
            int r0 = r7.d0
            r1 = 0
            java.lang.String r2 = "su_tPos"
            r3 = 4
            r4 = 1
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lc5;
                case 2: goto Lc1;
                case 3: goto L59;
                case 4: goto L54;
                case 5: goto L50;
                case 6: goto L13;
                case 7: goto Le;
                default: goto La;
            }
        La:
            defpackage.e41.m()
            return r1
        Le:
            int r7 = r7.x()
            return r7
        L13:
            int r0 = r7.i0
            int r5 = r7.j0
            if (r0 == r5) goto L20
            r7.h0 = r4
            int r7 = r7.v()
            return r7
        L20:
            int r0 = r7.h0
            int r0 = r0 + r4
            r7.h0 = r0
            if (r0 < r3) goto L4b
            int r0 = r7.o0
            zz r3 = r7.q0
            byte[] r3 = r3.o
            int r3 = r3.length
            h(r0, r3, r2)
            zz r0 = r7.q0
            byte[] r2 = r0.o
            int r3 = r7.o0
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r7.p0 = r2
            int[] r0 = r0.n
            r0 = r0[r3]
            r7.o0 = r0
            r7.l0 = r1
            int r7 = r7.x()
            return r7
        L4b:
            int r7 = r7.v()
            return r7
        L50:
            defpackage.e41.m()
            return r1
        L54:
            int r7 = r7.D()
            return r7
        L59:
            int r0 = r7.i0
            int r5 = r7.j0
            r6 = 2
            if (r0 == r5) goto L69
            r7.d0 = r6
            r7.h0 = r4
            int r7 = r7.A()
            return r7
        L69:
            int r0 = r7.h0
            int r0 = r0 + r4
            r7.h0 = r0
            if (r0 >= r3) goto L77
            r7.d0 = r6
            int r7 = r7.A()
            return r7
        L77:
            zz r0 = r7.q0
            byte[] r5 = r0.o
            int r6 = r7.o0
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            r7.p0 = r5
            int[] r0 = r0.n
            int r0 = r0.length
            h(r6, r0, r2)
            zz r0 = r7.q0
            int[] r0 = r0.n
            int r2 = r7.o0
            r0 = r0[r2]
            r7.o0 = r0
            int r0 = r7.m0
            if (r0 != 0) goto Lab
            int r0 = r7.n0
            int[] r2 = defpackage.g04.j
            r2 = r2[r0]
            int r2 = r2 - r4
            r7.m0 = r2
            int r0 = r0 + r4
            r7.n0 = r0
            r2 = 512(0x200, float:7.17E-43)
            if (r0 != r2) goto Lae
            r7.n0 = r1
            goto Lae
        Lab:
            int r0 = r0 - r4
            r7.m0 = r0
        Lae:
            r7.l0 = r1
            r7.d0 = r3
            int r0 = r7.m0
            if (r0 != r4) goto Lbc
            char r0 = r7.p0
            r0 = r0 ^ r4
            char r0 = (char) r0
            r7.p0 = r0
        Lbc:
            int r7 = r7.D()
            return r7
        Lc1:
            defpackage.e41.m()
            return r1
        Lc5:
            int r7 = r7.u()
            return r7
        Lca:
            r7 = -1
            return r7
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            n40 r0 = r1.Z
            if (r0 == 0) goto L9
            int r1 = r1.r()
            return r1
        L9:
            java.lang.String r1 = "Stream closed"
            defpackage.e41.i(r1)
            r1 = 0
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = ") < 0."
            java.lang.String r2 = "offs("
            if (r6 < 0) goto L4e
            if (r7 < 0) goto L44
            int r1 = r6 + r7
            int r3 = r5.length
            if (r1 > r3) goto L31
            n40 r2 = r4.Z
            if (r2 == 0) goto L2b
            if (r7 != 0) goto L15
            return r0
        L15:
            r7 = r6
        L16:
            if (r7 >= r1) goto L25
            int r0 = r4.r()
            if (r0 < 0) goto L25
            int r2 = r7 + 1
            byte r0 = (byte) r0
            r5[r7] = r0
            r7 = r2
            goto L16
        L25:
            if (r7 != r6) goto L29
            r4 = -1
            return r4
        L29:
            int r7 = r7 - r6
            return r7
        L2b:
            java.lang.String r4 = "Stream closed"
            defpackage.e41.i(r4)
            return r0
        L31:
            java.lang.String r4 = ") + len("
            java.lang.String r1 = ") > dest.length("
            java.lang.StringBuilder r4 = defpackage.i61.q(r6, r7, r2, r4, r1)
            int r5 = r5.length
            java.lang.String r6 = ")."
            java.lang.String r4 = defpackage.lb1.o(r4, r5, r6)
            defpackage.e41.q(r4)
            return r0
        L44:
            java.lang.String r4 = "len("
            java.lang.String r4 = defpackage.lb1.k(r4, r7, r1)
            defpackage.e41.q(r4)
            return r0
        L4e:
            java.lang.String r4 = defpackage.lb1.k(r2, r6, r1)
            defpackage.e41.q(r4)
            return r0
    }

    public final int u() {
            r11 = this;
            int r0 = r11.d0
            if (r0 == 0) goto L74
            zz r0 = r11.q0
            if (r0 != 0) goto L9
            goto L74
        L9:
            int[] r1 = r0.j
            int r2 = r11.A
            r3 = 1
            int r2 = r2 + r3
            int[] r4 = r0.n
            if (r4 == 0) goto L16
            int r5 = r4.length
            if (r5 >= r2) goto L1a
        L16:
            int[] r4 = new int[r2]
            r0.n = r4
        L1a:
            byte[] r5 = r0.o
            r6 = 0
            r1[r6] = r6
            int[] r0 = r0.e
            r7 = 256(0x100, float:3.59E-43)
            java.lang.System.arraycopy(r0, r6, r1, r3, r7)
            r0 = r1[r6]
        L28:
            if (r3 > r7) goto L32
            r8 = r1[r3]
            int r0 = r0 + r8
            r1[r3] = r0
            int r3 = r3 + 1
            goto L28
        L32:
            int r0 = r11.A
            r3 = r6
        L35:
            if (r3 > r0) goto L4b
            r8 = r5[r3]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r1[r8]
            int r10 = r9 + 1
            r1[r8] = r10
            java.lang.String r8 = "tt index"
            h(r9, r2, r8)
            r4[r9] = r3
            int r3 = r3 + 1
            goto L35
        L4b:
            int r0 = r11.B
            if (r0 < 0) goto L6e
            int r1 = r4.length
            if (r0 >= r1) goto L6e
            r0 = r4[r0]
            r11.o0 = r0
            r11.h0 = r6
            r11.k0 = r6
            r11.i0 = r7
            boolean r0 = r11.R
            if (r0 == 0) goto L69
            r11.m0 = r6
            r11.n0 = r6
            int r11 = r11.A()
            return r11
        L69:
            int r11 = r11.v()
            return r11
        L6e:
            java.lang.String r11 = "Stream corrupted"
            defpackage.e41.i(r11)
            return r6
        L74:
            r11 = -1
            return r11
    }

    public final int v() {
            r4 = this;
            int r0 = r4.k0
            int r1 = r4.A
            if (r0 > r1) goto L37
            int r0 = r4.i0
            r4.j0 = r0
            zz r0 = r4.q0
            byte[] r1 = r0.o
            int r2 = r4.o0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4.i0 = r1
            int[] r0 = r0.n
            int r0 = r0.length
            java.lang.String r3 = "su_tPos"
            h(r2, r0, r3)
            zz r0 = r4.q0
            int[] r0 = r0.n
            int r2 = r4.o0
            r0 = r0[r2]
            r4.o0 = r0
            int r0 = r4.k0
            int r0 = r0 + 1
            r4.k0 = r0
            r0 = 6
            r4.d0 = r0
            ga0 r4 = r4.X
            r4.i(r1)
            return r1
        L37:
            r0 = 5
            r4.d0 = r0
            r4.k()
            r4.n()
            int r4 = r4.u()
            return r4
    }

    public final int x() {
            r2 = this;
            int r0 = r2.l0
            char r1 = r2.p0
            if (r0 >= r1) goto L17
            int r0 = r2.i0
            ga0 r1 = r2.X
            r1.i(r0)
            int r1 = r2.l0
            int r1 = r1 + 1
            r2.l0 = r1
            r1 = 7
            r2.d0 = r1
            return r0
        L17:
            int r0 = r2.k0
            int r0 = r0 + 1
            r2.k0 = r0
            r0 = 0
            r2.h0 = r0
            int r2 = r2.v()
            return r2
    }
}
