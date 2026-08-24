package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vj7  reason: default package */
/* loaded from: classes.dex */
public final class vj7 extends defpackage.nj2 {
    public final /* synthetic */ int i;

    public /* synthetic */ vj7(int r1) {
            r0 = this;
            r0.i = r1
            r0.<init>()
            return
    }

    public static int H(long r2, byte[] r4, int r5, int r6) {
            if (r6 == 0) goto L27
            r0 = 1
            if (r6 == r0) goto L1e
            r0 = 2
            if (r6 != r0) goto L18
            byte r6 = defpackage.gh7.f(r4, r2)
            r0 = 1
            long r2 = r2 + r0
            byte r2 = defpackage.gh7.f(r4, r2)
            int r2 = defpackage.xj7.d(r5, r6, r2)
            return r2
        L18:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1e:
            byte r2 = defpackage.gh7.f(r4, r2)
            int r2 = defpackage.xj7.c(r5, r2)
            return r2
        L27:
            nj2 r2 = defpackage.xj7.a
            r2 = -12
            if (r5 <= r2) goto L2f
            r2 = -1
            return r2
        L2f:
            return r5
    }

    @Override // defpackage.nj2
    public final int A(byte[] r21, int r22, int r23) {
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r20
            r3 = r23
            int r2 = r2.i
            r4 = -65
            r6 = -32
            r7 = -96
            r8 = -62
            r9 = -16
            r10 = -19
            switch(r2) {
                case 0: goto Lec;
                default: goto L19;
            }
        L19:
            r2 = r1 | r3
            int r12 = r0.length
            int r12 = r12 - r3
            r2 = r2 | r12
            if (r2 < 0) goto Lcf
            long r1 = (long) r1
            long r12 = (long) r3
            long r12 = r12 - r1
            int r3 = (int) r12
            r12 = 16
            if (r3 >= r12) goto L2c
            r22 = 1
            r12 = 0
            goto L40
        L2c:
            r13 = r1
            r22 = 1
            r12 = 0
        L30:
            if (r12 >= r3) goto L3f
            long r15 = r13 + r22
            byte r13 = defpackage.gh7.f(r0, r13)
            if (r13 >= 0) goto L3b
            goto L40
        L3b:
            int r12 = r12 + 1
            r13 = r15
            goto L30
        L3f:
            r12 = r3
        L40:
            int r3 = r3 - r12
            long r12 = (long) r12
            long r1 = r1 + r12
        L43:
            r12 = 0
        L44:
            if (r3 <= 0) goto L5b
            long r12 = r1 + r22
            byte r1 = defpackage.gh7.f(r0, r1)
            if (r1 < 0) goto L56
            int r3 = r3 + (-1)
            r18 = r12
            r12 = r1
            r1 = r18
            goto L44
        L56:
            r18 = r12
            r12 = r1
            r1 = r18
        L5b:
            if (r3 != 0) goto L60
            r5 = 0
            goto Lce
        L60:
            int r13 = r3 + (-1)
            if (r12 >= r6) goto L78
            if (r13 != 0) goto L69
            r5 = r12
            goto Lce
        L69:
            int r3 = r3 + (-2)
            if (r12 < r8) goto Lcd
            long r13 = r1 + r22
            byte r1 = defpackage.gh7.f(r0, r1)
            if (r1 <= r4) goto L76
            goto Lcd
        L76:
            r1 = r13
            goto L43
        L78:
            if (r12 >= r9) goto L9f
            r5 = 2
            if (r13 >= r5) goto L82
            int r5 = H(r1, r0, r12, r13)
            goto Lce
        L82:
            int r3 = r3 + (-3)
            r16 = 2
            long r14 = r1 + r22
            byte r5 = defpackage.gh7.f(r0, r1)
            if (r5 > r4) goto Lcd
            if (r12 != r6) goto L92
            if (r5 < r7) goto Lcd
        L92:
            if (r12 != r10) goto L96
            if (r5 >= r7) goto Lcd
        L96:
            long r1 = r1 + r16
            byte r5 = defpackage.gh7.f(r0, r14)
            if (r5 <= r4) goto L43
            goto Lcd
        L9f:
            r16 = 2
            r5 = 3
            if (r13 >= r5) goto La9
            int r5 = H(r1, r0, r12, r13)
            goto Lce
        La9:
            int r3 = r3 + (-4)
            long r13 = r1 + r22
            byte r5 = defpackage.gh7.f(r0, r1)
            if (r5 > r4) goto Lcd
            int r12 = r12 << 28
            int r5 = r5 + 112
            int r5 = r5 + r12
            int r5 = r5 >> 30
            if (r5 != 0) goto Lcd
            long r11 = r1 + r16
            byte r13 = defpackage.gh7.f(r0, r13)
            if (r13 > r4) goto Lcd
            r13 = 3
            long r1 = r1 + r13
            byte r11 = defpackage.gh7.f(r0, r11)
            if (r11 <= r4) goto L43
        Lcd:
            r5 = -1
        Lce:
            return r5
        Lcf:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r3}
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.<init>(r0)
            throw r2
        Lec:
            if (r1 >= r3) goto Lf5
            r2 = r0[r1]
            if (r2 < 0) goto Lf5
            int r1 = r1 + 1
            goto Lec
        Lf5:
            if (r1 < r3) goto Lf8
            goto Lfa
        Lf8:
            if (r1 < r3) goto Lfc
        Lfa:
            r5 = 0
            goto L156
        Lfc:
            int r2 = r1 + 1
            r11 = r0[r1]
            if (r11 >= 0) goto L157
            if (r11 >= r6) goto L111
            if (r2 < r3) goto L108
            r5 = r11
            goto L156
        L108:
            if (r11 < r8) goto L155
            int r1 = r1 + 2
            r2 = r0[r2]
            if (r2 <= r4) goto Lf8
            goto L155
        L111:
            if (r11 >= r9) goto L131
            int r12 = r3 + (-1)
            if (r2 < r12) goto L11c
            int r5 = defpackage.xj7.a(r0, r2, r3)
            goto L156
        L11c:
            int r12 = r1 + 2
            r2 = r0[r2]
            if (r2 > r4) goto L155
            if (r11 != r6) goto L126
            if (r2 < r7) goto L155
        L126:
            if (r11 != r10) goto L12a
            if (r2 >= r7) goto L155
        L12a:
            int r1 = r1 + 3
            r2 = r0[r12]
            if (r2 <= r4) goto Lf8
            goto L155
        L131:
            int r12 = r3 + (-2)
            if (r2 < r12) goto L13a
            int r5 = defpackage.xj7.a(r0, r2, r3)
            goto L156
        L13a:
            int r12 = r1 + 2
            r2 = r0[r2]
            if (r2 > r4) goto L155
            int r11 = r11 << 28
            int r2 = r2 + 112
            int r2 = r2 + r11
            int r2 = r2 >> 30
            if (r2 != 0) goto L155
            int r2 = r1 + 3
            r11 = r0[r12]
            if (r11 > r4) goto L155
            int r1 = r1 + 4
            r2 = r0[r2]
            if (r2 <= r4) goto Lf8
        L155:
            r5 = -1
        L156:
            return r5
        L157:
            r1 = r2
            goto Lf8
    }

    @Override // defpackage.nj2
    public final java.lang.String m(byte[] r13, int r14, int r15) {
            r12 = this;
            int r12 = r12.i
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            r1 = -16
            r2 = -32
            r3 = 0
            switch(r12) {
                case 0: goto Lcd;
                default: goto Lc;
            }
        Lc:
            r12 = r14 | r15
            int r4 = r13.length
            int r4 = r4 - r14
            int r4 = r4 - r15
            r12 = r12 | r4
            if (r12 < 0) goto Lb2
            int r12 = r14 + r15
            char[] r8 = new char[r15]
            r15 = r3
        L19:
            if (r14 >= r12) goto L2b
            long r4 = (long) r14
            byte r0 = defpackage.gh7.f(r13, r4)
            if (r0 < 0) goto L2b
            int r14 = r14 + 1
            int r4 = r15 + 1
            char r0 = (char) r0
            r8[r15] = r0
            r15 = r4
            goto L19
        L2b:
            r9 = r15
        L2c:
            if (r14 >= r12) goto Lac
            int r15 = r14 + 1
            long r4 = (long) r14
            byte r4 = defpackage.gh7.f(r13, r4)
            if (r4 < 0) goto L51
            int r14 = r9 + 1
            char r0 = (char) r4
            r8[r9] = r0
        L3c:
            if (r15 >= r12) goto L4e
            long r4 = (long) r15
            byte r0 = defpackage.gh7.f(r13, r4)
            if (r0 < 0) goto L4e
            int r15 = r15 + 1
            int r4 = r14 + 1
            char r0 = (char) r0
            r8[r14] = r0
            r14 = r4
            goto L3c
        L4e:
            r9 = r14
            r14 = r15
            goto L2c
        L51:
            if (r4 >= r2) goto L68
            if (r15 >= r12) goto L63
            int r14 = r14 + 2
            long r5 = (long) r15
            byte r15 = defpackage.gh7.f(r13, r5)
            int r0 = r9 + 1
            defpackage.kj2.e(r4, r15, r8, r9)
            r9 = r0
            goto L2c
        L63:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        L68:
            if (r4 >= r1) goto L88
            int r0 = r12 + (-1)
            if (r15 >= r0) goto L83
            int r0 = r14 + 2
            long r5 = (long) r15
            byte r15 = defpackage.gh7.f(r13, r5)
            int r14 = r14 + 3
            long r5 = (long) r0
            byte r0 = defpackage.gh7.f(r13, r5)
            int r5 = r9 + 1
            defpackage.kj2.f(r4, r15, r0, r8, r9)
            r9 = r5
            goto L2c
        L83:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        L88:
            int r0 = r12 + (-2)
            if (r15 >= r0) goto La7
            int r0 = r14 + 2
            long r5 = (long) r15
            byte r5 = defpackage.gh7.f(r13, r5)
            int r15 = r14 + 3
            long r6 = (long) r0
            byte r6 = defpackage.gh7.f(r13, r6)
            int r14 = r14 + 4
            long r10 = (long) r15
            byte r7 = defpackage.gh7.f(r13, r10)
            defpackage.kj2.d(r4, r5, r6, r7, r8, r9)
            int r9 = r9 + 2
            goto L2c
        La7:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        Lac:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r8, r3, r9)
            return r12
        Lb2:
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14, r15}
            java.lang.String r13 = java.lang.String.format(r0, r13)
            r12.<init>(r13)
            throw r12
        Lcd:
            r12 = r14 | r15
            int r4 = r13.length
            int r4 = r4 - r14
            int r4 = r4 - r15
            r12 = r12 | r4
            if (r12 < 0) goto L158
            int r12 = r14 + r15
            char[] r8 = new char[r15]
            r15 = r3
        Lda:
            if (r14 >= r12) goto Le9
            r0 = r13[r14]
            if (r0 < 0) goto Le9
            int r14 = r14 + 1
            int r4 = r15 + 1
            char r0 = (char) r0
            r8[r15] = r0
            r15 = r4
            goto Lda
        Le9:
            r9 = r15
        Lea:
            if (r14 >= r12) goto L152
            int r15 = r14 + 1
            r4 = r13[r14]
            if (r4 < 0) goto L109
            int r14 = r9 + 1
            char r0 = (char) r4
            r8[r9] = r0
        Lf7:
            if (r15 >= r12) goto L106
            r0 = r13[r15]
            if (r0 < 0) goto L106
            int r15 = r15 + 1
            int r4 = r14 + 1
            char r0 = (char) r0
            r8[r14] = r0
            r14 = r4
            goto Lf7
        L106:
            r9 = r14
            r14 = r15
            goto Lea
        L109:
            if (r4 >= r2) goto L11d
            if (r15 >= r12) goto L118
            int r14 = r14 + 2
            r15 = r13[r15]
            int r0 = r9 + 1
            defpackage.kj2.e(r4, r15, r8, r9)
            r9 = r0
            goto Lea
        L118:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        L11d:
            if (r4 >= r1) goto L137
            int r0 = r12 + (-1)
            if (r15 >= r0) goto L132
            int r0 = r14 + 2
            r15 = r13[r15]
            int r14 = r14 + 3
            r0 = r13[r0]
            int r5 = r9 + 1
            defpackage.kj2.f(r4, r15, r0, r8, r9)
            r9 = r5
            goto Lea
        L132:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        L137:
            int r0 = r12 + (-2)
            if (r15 >= r0) goto L14d
            int r0 = r14 + 2
            r5 = r13[r15]
            int r15 = r14 + 3
            r6 = r13[r0]
            int r14 = r14 + 4
            r7 = r13[r15]
            defpackage.kj2.d(r4, r5, r6, r7, r8, r9)
            int r9 = r9 + 2
            goto Lea
        L14d:
            ub3 r12 = defpackage.ub3.a()
            throw r12
        L152:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r8, r3, r9)
            return r12
        L158:
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14, r15}
            java.lang.String r13 = java.lang.String.format(r0, r13)
            r12.<init>(r13)
            throw r12
    }

    @Override // defpackage.nj2
    public final int n(java.lang.String r26, byte[] r27, int r28, int r29) {
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r25
            r4 = r29
            int r3 = r3.i
            r5 = 2048(0x800, float:2.87E-42)
            r7 = 128(0x80, float:1.8E-43)
            r8 = 55296(0xd800, float:7.7486E-41)
            java.lang.String r10 = "Failed writing "
            java.lang.String r11 = " at index "
            switch(r3) {
                case 0: goto L166;
                default: goto L1a;
            }
        L1a:
            long r12 = (long) r2
            long r14 = (long) r4
            long r14 = r14 + r12
            int r3 = r0.length()
            if (r3 > r4) goto L147
            int r6 = r1.length
            int r6 = r6 - r4
            if (r6 < r2) goto L147
            r6 = 0
        L28:
            r16 = 1
            if (r6 >= r3) goto L3d
            char r2 = r0.charAt(r6)
            if (r2 >= r7) goto L3d
            long r16 = r12 + r16
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r12, r2)
            int r6 = r6 + 1
            r12 = r16
            goto L28
        L3d:
            if (r6 != r3) goto L42
        L3f:
            int r0 = (int) r12
            goto L146
        L42:
            if (r6 >= r3) goto L3f
            char r2 = r0.charAt(r6)
            if (r2 >= r7) goto L58
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L58
            long r18 = r12 + r16
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r12, r2)
            r12 = r18
            goto Lfb
        L58:
            r18 = 2
            if (r2 >= r5) goto L79
            long r20 = r14 - r18
            int r4 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r4 > 0) goto L79
            r4 = r6
            long r5 = r12 + r16
            int r9 = r2 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            defpackage.gh7.j(r1, r12, r9)
            long r12 = r12 + r18
            r2 = r2 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r5, r2)
            r6 = r4
            goto Lfb
        L79:
            r4 = r6
            r5 = 3
            if (r2 < r8) goto L89
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r9 >= r2) goto L84
            goto L89
        L84:
            r25 = r4
            r28 = r5
            goto Lb4
        L89:
            long r22 = r14 - r5
            int r9 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r9 > 0) goto L84
            r28 = r5
            long r5 = r12 + r16
            int r9 = r2 >>> 12
            r9 = r9 | 480(0x1e0, float:6.73E-43)
            byte r9 = (byte) r9
            defpackage.gh7.j(r1, r12, r9)
            long r8 = r12 + r18
            int r18 = r2 >>> 6
            r25 = r4
            r4 = r18 & 63
            r4 = r4 | r7
            byte r4 = (byte) r4
            defpackage.gh7.j(r1, r5, r4)
            long r12 = r12 + r28
            r2 = r2 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r8, r2)
            r6 = r25
            goto Lfb
        Lb4:
            r4 = 4
            long r8 = r14 - r4
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 > 0) goto L10e
            int r6 = r25 + 1
            if (r6 == r3) goto L104
            char r8 = r0.charAt(r6)
            boolean r9 = java.lang.Character.isSurrogatePair(r2, r8)
            if (r9 == 0) goto L106
            int r2 = java.lang.Character.toCodePoint(r2, r8)
            long r8 = r12 + r16
            r23 = r4
            int r4 = r2 >>> 18
            r4 = r4 | 240(0xf0, float:3.36E-43)
            byte r4 = (byte) r4
            defpackage.gh7.j(r1, r12, r4)
            long r4 = r12 + r18
            int r18 = r2 >>> 12
            r25 = r2
            r2 = r18 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r8, r2)
            long r8 = r12 + r28
            int r2 = r25 >>> 6
            r2 = r2 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r4, r2)
            long r12 = r12 + r23
            r2 = r25 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            defpackage.gh7.j(r1, r8, r2)
        Lfb:
            int r6 = r6 + 1
            r5 = 2048(0x800, float:2.87E-42)
            r8 = 55296(0xd800, float:7.7486E-41)
            goto L42
        L104:
            r6 = r25
        L106:
            wj7 r0 = new wj7
            int r6 = r6 + (-1)
            r0.<init>(r6, r3)
            throw r0
        L10e:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r2) goto L12e
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r9) goto L12e
            int r6 = r25 + 1
            if (r6 == r3) goto L126
            char r0 = r0.charAt(r6)
            boolean r0 = java.lang.Character.isSurrogatePair(r2, r0)
            if (r0 != 0) goto L12e
        L126:
            wj7 r0 = new wj7
            r4 = r25
            r0.<init>(r4, r3)
            throw r0
        L12e:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r2)
            r1.append(r11)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L146:
            return r0
        L147:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r3 = r3 + (-1)
            char r0 = r0.charAt(r3)
            int r2 = r2 + r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r0)
            r3.append(r11)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L166:
            int r3 = r0.length()
            int r4 = r4 + r2
            r6 = 0
        L16c:
            if (r6 >= r3) goto L17e
            int r5 = r6 + r2
            if (r5 >= r4) goto L17e
            char r8 = r0.charAt(r6)
            if (r8 >= r7) goto L17e
            byte r8 = (byte) r8
            r1[r5] = r8
            int r6 = r6 + 1
            goto L16c
        L17e:
            if (r6 != r3) goto L184
            int r0 = r2 + r3
            goto L265
        L184:
            int r2 = r2 + r6
        L185:
            if (r6 >= r3) goto L264
            char r5 = r0.charAt(r6)
            if (r5 >= r7) goto L199
            if (r2 >= r4) goto L199
            int r8 = r2 + 1
            byte r5 = (byte) r5
            r1[r2] = r5
            r2 = r8
            r8 = 2048(0x800, float:2.87E-42)
            goto L21d
        L199:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 >= r8) goto L1b3
            int r9 = r4 + (-2)
            if (r2 > r9) goto L1b3
            int r9 = r2 + 1
            int r12 = r5 >>> 6
            r12 = r12 | 960(0x3c0, float:1.345E-42)
            byte r12 = (byte) r12
            r1[r2] = r12
            int r2 = r2 + 2
            r5 = r5 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5
            r1[r9] = r5
            goto L21d
        L1b3:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r9) goto L1bd
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r9 >= r5) goto L1dd
        L1bd:
            int r9 = r4 + (-3)
            if (r2 > r9) goto L1dd
            int r9 = r2 + 1
            int r12 = r5 >>> 12
            r12 = r12 | 480(0x1e0, float:6.73E-43)
            byte r12 = (byte) r12
            r1[r2] = r12
            int r12 = r2 + 2
            int r13 = r5 >>> 6
            r13 = r13 & 63
            r13 = r13 | r7
            byte r13 = (byte) r13
            r1[r9] = r13
            int r2 = r2 + 3
            r5 = r5 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5
            r1[r12] = r5
            goto L21d
        L1dd:
            int r9 = r4 + (-4)
            if (r2 > r9) goto L22a
            int r9 = r6 + 1
            int r12 = r0.length()
            if (r9 == r12) goto L222
            char r6 = r0.charAt(r9)
            boolean r12 = java.lang.Character.isSurrogatePair(r5, r6)
            if (r12 == 0) goto L221
            int r5 = java.lang.Character.toCodePoint(r5, r6)
            int r6 = r2 + 1
            int r12 = r5 >>> 18
            r12 = r12 | 240(0xf0, float:3.36E-43)
            byte r12 = (byte) r12
            r1[r2] = r12
            int r12 = r2 + 2
            int r13 = r5 >>> 12
            r13 = r13 & 63
            r13 = r13 | r7
            byte r13 = (byte) r13
            r1[r6] = r13
            int r6 = r2 + 3
            int r13 = r5 >>> 6
            r13 = r13 & 63
            r13 = r13 | r7
            byte r13 = (byte) r13
            r1[r12] = r13
            int r2 = r2 + 4
            r5 = r5 & 63
            r5 = r5 | r7
            byte r5 = (byte) r5
            r1[r6] = r5
            r6 = r9
        L21d:
            int r6 = r6 + 1
            goto L185
        L221:
            r6 = r9
        L222:
            wj7 r0 = new wj7
            int r6 = r6 + (-1)
            r0.<init>(r6, r3)
            throw r0
        L22a:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r5) goto L24c
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r5 > r9) goto L24c
            int r1 = r6 + 1
            int r4 = r0.length()
            if (r1 == r4) goto L246
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r5, r0)
            if (r0 != 0) goto L24c
        L246:
            wj7 r0 = new wj7
            r0.<init>(r6, r3)
            throw r0
        L24c:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r5)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L264:
            r0 = r2
        L265:
            return r0
    }
}
