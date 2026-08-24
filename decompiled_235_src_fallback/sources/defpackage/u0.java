package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u0  reason: default package */
/* loaded from: classes.dex */
public abstract class u0 {
    public final /* synthetic */ int A;
    public int B;
    public final java.lang.Object L;
    public final java.lang.Object R;
    public java.lang.Object X;
    public java.lang.Object Y;

    public u0(defpackage.om6 r2, java.util.Iterator r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            nm6 r2 = r2.d()
            int r2 = r2.d
            r1.B = r2
            r1.a()
            return
    }

    public u0(defpackage.td3 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            aj r0 = new aj
            r0.<init>(r2)
            r1.R = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1.Y = r2
            return
    }

    public static /* synthetic */ void q(defpackage.u0 r1, java.lang.String r2, int r3, java.lang.String r4, int r5) {
            r0 = r5 & 2
            if (r0 == 0) goto L6
            int r3 = r1.B
        L6:
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto Lc
            r4 = r0
        Lc:
            r1.p(r2, r3, r4)
            throw r0
    }

    public static boolean t(char r1) {
            r0 = 44
            if (r1 == r0) goto L12
            r0 = 58
            if (r1 == r0) goto L12
            r0 = 93
            if (r1 == r0) goto L12
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public boolean A() {
            r3 = this;
            int r0 = r3.y()
            java.lang.CharSequence r1 = r3.s()
            int r2 = r1.length()
            if (r0 >= r2) goto L21
            r2 = -1
            if (r0 != r2) goto L12
            goto L21
        L12:
            char r0 = r1.charAt(r0)
            r1 = 44
            if (r0 != r1) goto L21
            int r0 = r3.B
            r1 = 1
            int r0 = r0 + r1
            r3.B = r0
            return r1
        L21:
            r3 = 0
            return r3
    }

    public void B(char r7) {
            r6 = this;
            int r0 = r6.B
            r1 = 0
            if (r0 <= 0) goto L2c
            r2 = 34
            if (r7 != r2) goto L2c
            int r2 = r0 + (-1)
            r6.B = r2     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r6.m()     // Catch: java.lang.Throwable -> L28
            r6.B = r0
            java.lang.String r0 = "null"
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L1c
            goto L2c
        L1c:
            int r7 = r6.B
            int r7 = r7 + (-1)
            java.lang.String r0 = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."
            java.lang.String r2 = "Expected string literal but 'null' literal was found"
            r6.p(r2, r7, r0)
            throw r1
        L28:
            r7 = move-exception
            r6.B = r0
            throw r7
        L2c:
            byte r7 = defpackage.l.n(r7)
            java.lang.String r7 = defpackage.l.S(r7)
            int r0 = r6.B
            if (r0 <= 0) goto L3b
            int r2 = r0 + (-1)
            goto L3c
        L3b:
            r2 = r0
        L3c:
            java.lang.CharSequence r3 = r6.s()
            int r3 = r3.length()
            if (r0 == r3) goto L56
            if (r2 >= 0) goto L49
            goto L56
        L49:
            java.lang.CharSequence r0 = r6.s()
            char r0 = r0.charAt(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L58
        L56:
            java.lang.String r0 = "EOF"
        L58:
            java.lang.String r3 = ", but had '"
            java.lang.String r4 = "' instead"
            java.lang.String r5 = "Expected "
            java.lang.String r7 = defpackage.lb1.n(r5, r7, r3, r0, r4)
            r0 = 4
            q(r6, r7, r2, r1, r0)
            throw r1
    }

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.Y
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.X = r0
            java.lang.Object r0 = r2.R
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L18
        L17:
            r0 = 0
        L18:
            r2.Y = r0
            return
    }

    public int b(int r5, java.lang.CharSequence r6) {
            r4 = this;
            int r0 = r5 + 4
            int r1 = r6.length()
            if (r0 < r1) goto L27
            r4.B = r5
            r4.n()
            int r5 = r4.B
            int r5 = r5 + 4
            int r0 = r6.length()
            if (r5 >= r0) goto L1e
            int r5 = r4.B
            int r4 = r4.b(r5, r6)
            return r4
        L1e:
            r5 = 0
            r6 = 6
            java.lang.String r0 = "Unexpected EOF during unicode escape"
            r1 = 0
            q(r4, r0, r5, r1, r6)
            throw r1
        L27:
            java.lang.Object r1 = r4.Y
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            int r2 = r4.r(r5, r6)
            int r2 = r2 << 12
            int r3 = r5 + 1
            int r3 = r4.r(r3, r6)
            int r3 = r3 << 8
            int r2 = r2 + r3
            int r3 = r5 + 2
            int r3 = r4.r(r3, r6)
            int r3 = r3 << 4
            int r2 = r2 + r3
            int r5 = r5 + 3
            int r4 = r4.r(r5, r6)
            int r4 = r4 + r2
            char r4 = (char) r4
            r1.append(r4)
            return r0
    }

    public void c(int r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.Y
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.CharSequence r1 = r1.s()
            r0.append(r1, r2, r3)
            return
    }

    public abstract boolean d();

    public void e(int r9, java.lang.String r10) {
            r8 = this;
            java.lang.CharSequence r0 = r8.s()
            int r0 = r0.length()
            int r0 = r0 - r9
            int r1 = r10.length()
            r2 = 6
            r3 = 0
            r4 = 0
            if (r0 < r1) goto L51
            int r0 = r10.length()
            r1 = r3
        L17:
            if (r1 >= r0) goto L49
            char r5 = r10.charAt(r1)
            java.lang.CharSequence r6 = r8.s()
            int r7 = r9 + r1
            char r6 = r6.charAt(r7)
            r6 = r6 | 32
            if (r5 != r6) goto L2e
            int r1 = r1 + 1
            goto L17
        L2e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Expected valid boolean literal prefix, but had '"
            r9.<init>(r10)
            java.lang.String r10 = r8.m()
            r9.append(r10)
            r10 = 39
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            q(r8, r9, r3, r4, r2)
            throw r4
        L49:
            int r10 = r10.length()
            int r10 = r10 + r9
            r8.B = r10
            return
        L51:
            java.lang.String r9 = "Unexpected end of boolean literal"
            q(r8, r9, r3, r4, r2)
            throw r4
    }

    public abstract java.lang.String f();

    public abstract byte g();

    public byte h(byte r6) {
            r5 = this;
            byte r0 = r5.g()
            if (r0 == r6) goto L3e
            java.lang.String r6 = defpackage.l.S(r6)
            int r0 = r5.B
            if (r0 <= 0) goto L11
            int r1 = r0 + (-1)
            goto L12
        L11:
            r1 = r0
        L12:
            java.lang.CharSequence r2 = r5.s()
            int r2 = r2.length()
            if (r0 == r2) goto L2c
            if (r1 >= 0) goto L1f
            goto L2c
        L1f:
            java.lang.CharSequence r0 = r5.s()
            char r0 = r0.charAt(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L2e
        L2c:
            java.lang.String r0 = "EOF"
        L2e:
            java.lang.String r2 = ", but had '"
            java.lang.String r3 = "' instead"
            java.lang.String r4 = "Expected "
            java.lang.String r6 = defpackage.lb1.n(r4, r6, r2, r0, r3)
            r0 = 4
            r2 = 0
            q(r5, r6, r1, r2, r0)
            throw r2
        L3e:
            return r0
    }

    public boolean hasNext() {
            r0 = this;
            java.lang.Object r0 = r0.Y
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public abstract void i(char r1);

    public long j() {
            r22 = this;
            r0 = r22
            int r1 = r0.y()
            int r1 = r0.x(r1)
            java.lang.CharSequence r2 = r0.s()
            int r2 = r2.length()
            java.lang.String r3 = "EOF"
            r4 = 6
            r5 = 0
            r6 = 0
            if (r1 >= r2) goto L1d7
            r2 = -1
            if (r1 == r2) goto L1d7
            java.lang.CharSequence r2 = r0.s()
            char r2 = r2.charAt(r1)
            r7 = 34
            if (r2 != r7) goto L3a
            int r1 = r1 + 1
            java.lang.CharSequence r2 = r0.s()
            int r2 = r2.length()
            if (r1 == r2) goto L36
            r2 = 1
            goto L3b
        L36:
            q(r0, r3, r6, r5, r4)
            throw r5
        L3a:
            r2 = r6
        L3b:
            r11 = r1
            r8 = r6
            r12 = r8
            r13 = r12
            r9 = 0
            r14 = 0
            r16 = 0
        L45:
            java.lang.CharSequence r18 = r0.s()
            int r7 = r18.length()
            java.lang.String r4 = "Numeric value overflow"
            if (r11 == r7) goto L131
            java.lang.CharSequence r7 = r0.s()
            char r7 = r7.charAt(r11)
            r5 = 101(0x65, float:1.42E-43)
            java.lang.String r6 = "' in numeric literal"
            r19 = r2
            java.lang.String r2 = "Unexpected symbol '"
            if (r7 == r5) goto L6c
            r5 = 69
            if (r7 != r5) goto L68
            goto L6c
        L68:
            r20 = r12
            r12 = 0
            goto L91
        L6c:
            if (r12 != 0) goto L68
            if (r11 == r1) goto L7c
            int r11 = r11 + 1
            r2 = r19
            r4 = 6
            r5 = 0
            r6 = 0
            r7 = 34
            r8 = 1
            r12 = 1
            goto L45
        L7c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5 = 4
            q(r0, r1, r11, r2, r5)
            throw r2
        L91:
            java.lang.String r5 = "Unexpected symbol '-' in numeric literal"
            r12 = 45
            if (r7 != r12) goto Lae
            if (r20 == 0) goto Lae
            if (r11 == r1) goto La8
            int r11 = r11 + 1
            r2 = r19
            r12 = r20
            r4 = 6
            r5 = 0
            r6 = 0
            r7 = 34
            r8 = 0
            goto L45
        La8:
            r2 = 4
            r4 = 0
            q(r0, r5, r11, r4, r2)
            throw r4
        Lae:
            r12 = 0
            r12 = 43
            if (r7 != r12) goto Lcc
            if (r20 == 0) goto Lcc
            if (r11 == r1) goto Lc4
            int r11 = r11 + 1
            r2 = r19
            r12 = r20
            r4 = 6
            r5 = 0
            r6 = 0
            r7 = 34
            r8 = 1
            goto L45
        Lc4:
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r12 = 4
            q(r0, r1, r11, r2, r12)
            throw r2
        Lcc:
            r21 = r13
            r13 = 0
            r12 = 45
            if (r7 != r12) goto Le8
            if (r11 != r1) goto Le3
            int r11 = r11 + 1
            r5 = r13
            r2 = r19
            r12 = r20
            r4 = 6
            r6 = 0
            r7 = 34
            r13 = 1
            goto L45
        Le3:
            r2 = 4
            q(r0, r5, r11, r13, r2)
            throw r13
        Le8:
            byte r5 = defpackage.l.n(r7)
            if (r5 != 0) goto L137
            int r5 = r11 + 1
            int r12 = r7 + (-48)
            if (r12 < 0) goto L11c
            r13 = 10
            if (r12 >= r13) goto L11c
            r6 = 10
            if (r20 == 0) goto L10d
            long r9 = r9 * r6
            long r6 = (long) r12
            long r9 = r9 + r6
        Lff:
            r11 = r5
            r2 = r19
            r12 = r20
            r13 = r21
            r4 = 6
            r5 = 0
            r6 = 0
            r7 = 34
            goto L45
        L10d:
            long r14 = r14 * r6
            long r6 = (long) r12
            long r14 = r14 - r6
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 > 0) goto L115
            goto Lff
        L115:
            r2 = 6
            r5 = 0
            r12 = 0
            q(r0, r4, r5, r12, r2)
            throw r12
        L11c:
            r12 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 4
            q(r0, r1, r11, r12, r2)
            throw r12
        L131:
            r19 = r2
            r20 = r12
            r21 = r13
        L137:
            if (r11 == r1) goto L13b
            r2 = 1
            goto L13c
        L13b:
            r2 = 0
        L13c:
            if (r1 == r11) goto L145
            if (r21 == 0) goto L148
            int r5 = r11 + (-1)
            if (r1 == r5) goto L145
            goto L148
        L145:
            r12 = 0
            goto L1d0
        L148:
            if (r19 == 0) goto L16a
            if (r2 == 0) goto L163
            java.lang.CharSequence r1 = r0.s()
            char r1 = r1.charAt(r11)
            r2 = 34
            if (r1 != r2) goto L15b
            int r11 = r11 + 1
            goto L16a
        L15b:
            java.lang.String r1 = "Expected closing quotation mark"
            r2 = 4
            r12 = 0
            q(r0, r1, r11, r12, r2)
            throw r12
        L163:
            r2 = 6
            r5 = 0
            r12 = 0
            q(r0, r3, r5, r12, r2)
            throw r12
        L16a:
            r0.B = r11
            if (r20 == 0) goto L198
            double r1 = (double) r14
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r8 != 0) goto L17a
            double r7 = (double) r9
            double r7 = -r7
            double r5 = java.lang.Math.pow(r5, r7)
            goto L182
        L17a:
            r3 = 1
            if (r8 != r3) goto L1bb
            double r7 = (double) r9
            double r5 = java.lang.Math.pow(r5, r7)
        L182:
            double r1 = r1 * r5
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L1b4
            r5 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L1b4
            double r5 = java.lang.Math.floor(r1)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L19a
            long r14 = (long) r1
        L198:
            r12 = 0
            goto L1bf
        L19a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't convert "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " to Long"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 6
            r5 = 0
            r12 = 0
            q(r0, r1, r5, r12, r2)
            throw r12
        L1b4:
            r2 = 6
            r5 = 0
            r12 = 0
            q(r0, r4, r5, r12, r2)
            throw r12
        L1bb:
            defpackage.i.d()
            return r16
        L1bf:
            if (r21 == 0) goto L1c2
            return r14
        L1c2:
            r1 = -9223372036854775808
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 == 0) goto L1ca
            long r0 = -r14
            return r0
        L1ca:
            r2 = 6
            r5 = 0
            q(r0, r4, r5, r12, r2)
            throw r12
        L1d0:
            java.lang.String r1 = "Expected numeric literal"
            r2 = 4
            q(r0, r1, r11, r12, r2)
            throw r12
        L1d7:
            r2 = r4
            r12 = r5
            r5 = r6
            q(r0, r3, r5, r12, r2)
            throw r12
    }

    public java.lang.String k() {
            r2 = this;
            java.lang.Object r0 = r2.X
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Ld
            r0.getClass()
            r1 = 0
            r2.X = r1
            return r0
        Ld:
            java.lang.String r2 = r2.f()
            return r2
    }

    public java.lang.String l(java.lang.CharSequence r11, int r12, int r13) {
            r10 = this;
            java.lang.Object r0 = r10.Y
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r11.getClass()
            char r1 = r11.charAt(r13)
            r2 = 0
            r3 = r2
        Ld:
            r4 = 34
            r5 = 1
            if (r1 == r4) goto L91
            r4 = 92
            r6 = 4
            java.lang.String r7 = "Unexpected EOF"
            r8 = 0
            r9 = -1
            if (r1 != r4) goto L75
            r10.c(r12, r13)
            int r13 = r13 + 1
            int r12 = r10.x(r13)
            r13 = 6
            if (r12 == r9) goto L6f
            java.lang.CharSequence r1 = r10.s()
            int r3 = r12 + 1
            char r12 = r1.charAt(r12)
            r1 = 117(0x75, float:1.64E-43)
            if (r12 != r1) goto L3e
            java.lang.CharSequence r12 = r10.s()
            int r3 = r10.b(r3, r12)
            goto L4b
        L3e:
            if (r12 >= r1) goto L45
            char[] r1 = defpackage.mm0.a
            char r1 = r1[r12]
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 == 0) goto L58
            r0.append(r1)
        L4b:
            int r12 = r10.x(r3)
            if (r12 == r9) goto L54
        L51:
            r13 = r12
            r3 = r5
            goto L8b
        L54:
            q(r10, r7, r12, r8, r6)
            throw r8
        L58:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid escaped char '"
            r11.<init>(r0)
            r11.append(r12)
            r12 = 39
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            q(r10, r11, r2, r8, r13)
            throw r8
        L6f:
            java.lang.String r11 = "Expected escape sequence to continue, got EOF"
            q(r10, r11, r2, r8, r13)
            throw r8
        L75:
            int r13 = r13 + 1
            int r1 = r11.length()
            if (r13 < r1) goto L8b
            r10.c(r12, r13)
            int r12 = r10.x(r13)
            if (r12 == r9) goto L87
            goto L51
        L87:
            q(r10, r7, r12, r8, r6)
            throw r8
        L8b:
            char r1 = r11.charAt(r13)
            goto Ld
        L91:
            if (r3 != 0) goto L98
            java.lang.String r11 = r10.z(r12, r13)
            goto La2
        L98:
            r10.c(r12, r13)
            java.lang.String r11 = r0.toString()
            r0.setLength(r2)
        La2:
            int r13 = r13 + r5
            r10.B = r13
            return r11
    }

    public java.lang.String m() {
            r7 = this;
            java.lang.Object r0 = r7.Y
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.Object r1 = r7.X
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            if (r1 == 0) goto L11
            r1.getClass()
            r7.X = r2
            return r1
        L11:
            int r1 = r7.y()
            java.lang.CharSequence r3 = r7.s()
            int r3 = r3.length()
            if (r1 >= r3) goto La1
            r3 = -1
            if (r1 == r3) goto La1
            java.lang.CharSequence r4 = r7.s()
            char r4 = r4.charAt(r1)
            byte r4 = defpackage.l.n(r4)
            r5 = 1
            if (r4 != r5) goto L36
            java.lang.String r7 = r7.k()
            return r7
        L36:
            r6 = 0
            if (r4 != 0) goto L86
            r2 = r6
        L3a:
            java.lang.CharSequence r4 = r7.s()
            char r4 = r4.charAt(r1)
            byte r4 = defpackage.l.n(r4)
            if (r4 != 0) goto L6f
            int r1 = r1 + 1
            java.lang.CharSequence r4 = r7.s()
            int r4 = r4.length()
            if (r1 < r4) goto L3a
            int r2 = r7.B
            r7.c(r2, r1)
            int r2 = r7.x(r1)
            if (r2 != r3) goto L6c
            r7.B = r1
            r7.c(r6, r6)
            java.lang.String r7 = r0.toString()
            r0.setLength(r6)
            return r7
        L6c:
            r1 = r2
            r2 = r5
            goto L3a
        L6f:
            int r3 = r7.B
            if (r2 != 0) goto L78
            java.lang.String r0 = r7.z(r3, r1)
            goto L83
        L78:
            r7.c(r3, r1)
            java.lang.String r2 = r0.toString()
            r0.setLength(r6)
            r0 = r2
        L83:
            r7.B = r1
            return r0
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected beginning of the string, but got "
            r0.<init>(r3)
            java.lang.CharSequence r3 = r7.s()
            char r1 = r3.charAt(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 6
            q(r7, r0, r6, r2, r1)
            throw r2
        La1:
            java.lang.String r0 = "EOF"
            r3 = 4
            q(r7, r0, r1, r2, r3)
            throw r2
    }

    public void n() {
            r0 = this;
            return
    }

    public void o() {
            r4 = this;
            byte r0 = r4.g()
            r1 = 10
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected EOF after parsing, but had "
            r0.<init>(r1)
            java.lang.CharSequence r1 = r4.s()
            int r2 = r4.B
            int r2 = r2 + (-1)
            char r1 = r1.charAt(r2)
            r0.append(r1)
            java.lang.String r1 = " instead"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 6
            r3 = 0
            q(r4, r0, r1, r3, r2)
            throw r3
    }

    public void p(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            java.lang.Object r0 = r2.R
            aj r0 = (defpackage.aj) r0
            java.lang.String r0 = r0.c()
            java.lang.CharSequence r1 = r2.s()
            r1.getClass()
            java.lang.Object r2 = r2.L
            td3 r2 = (defpackage.td3) r2
            boolean r2 = r2.g
            if (r2 == 0) goto L20
            java.lang.CharSequence r2 = defpackage.hi2.H(r4, r1)
            java.lang.String r2 = r2.toString()
            goto L21
        L20:
            r2 = 0
        L21:
            ae3 r1 = new ae3
            java.lang.String r2 = defpackage.hi2.x(r3, r0, r4, r5, r2)
            r1.<init>(r2)
            throw r1
    }

    public int r(int r3, java.lang.CharSequence r4) {
            r2 = this;
            char r3 = r4.charAt(r3)
            r4 = 48
            if (r4 > r3) goto Le
            r0 = 58
            if (r3 >= r0) goto Le
            int r3 = r3 - r4
            return r3
        Le:
            r4 = 97
            if (r4 > r3) goto L19
            r4 = 103(0x67, float:1.44E-43)
            if (r3 >= r4) goto L19
            int r3 = r3 + (-87)
            return r3
        L19:
            r4 = 65
            if (r4 > r3) goto L24
            r4 = 71
            if (r3 >= r4) goto L24
            int r3 = r3 + (-55)
            return r3
        L24:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid toHexChar char '"
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = "' in unicode escape"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r0 = 6
            r1 = 0
            q(r2, r3, r4, r1, r0)
            throw r1
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.L
            om6 r0 = (defpackage.om6) r0
            nm6 r1 = r0.d()
            int r1 = r1.d
            int r2 = r3.B
            if (r1 != r2) goto L2b
            java.lang.Object r1 = r3.X
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r1.getKey()
            r0.remove(r1)
            r1 = 0
            r3.X = r1
            nm6 r0 = r0.d()
            int r0 = r0.d
            r3.B = r0
            return
        L27:
            defpackage.e41.m()
            return
        L2b:
            defpackage.i.l()
            return
    }

    public abstract java.lang.CharSequence s();

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JsonReader(source='"
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.s()
            r0.append(r1)
            java.lang.String r1 = "', currentPosition="
            r0.append(r1)
            int r2 = r2.B
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }

    public abstract java.lang.String u(java.lang.String r1);

    public byte v() {
            r5 = this;
            java.lang.CharSequence r0 = r5.s()
            int r1 = r5.B
        L6:
            int r1 = r5.x(r1)
            r2 = -1
            r3 = 10
            if (r1 == r2) goto L2b
            char r2 = r0.charAt(r1)
            r4 = 9
            if (r2 == r4) goto L28
            if (r2 == r3) goto L28
            r3 = 13
            if (r2 == r3) goto L28
            r3 = 32
            if (r2 == r3) goto L28
            r5.B = r1
            byte r5 = defpackage.l.n(r2)
            return r5
        L28:
            int r1 = r1 + 1
            goto L6
        L2b:
            r5.B = r1
            return r3
    }

    public java.lang.String w() {
            r2 = this;
            r0 = 1
            byte r1 = r2.v()
            if (r1 == r0) goto L9
            r2 = 0
            return r2
        L9:
            java.lang.String r0 = r2.k()
            r2.X = r0
            return r0
    }

    public abstract int x(int r1);

    public abstract int y();

    public java.lang.String z(int r1, int r2) {
            r0 = this;
            java.lang.CharSequence r0 = r0.s()
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
