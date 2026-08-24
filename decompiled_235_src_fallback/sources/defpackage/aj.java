package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public final class aj implements defpackage.ja3 {
    public final /* synthetic */ int A;
    public int B;
    public final java.lang.Object L;
    public java.lang.Object R;
    public java.lang.Object X;

    public aj(int r2, defpackage.m80 r3, defpackage.l61 r4, defpackage.le2 r5) {
            r1 = this;
            r0 = 5
            r1.A = r0
            r1.<init>()
            r1.L = r5
            r1.B = r2
            r1.R = r3
            r1.X = r4
            return
    }

    public aj(android.graphics.Bitmap r4, defpackage.in6 r5, defpackage.qw4 r6, int r7) {
            r3 = this;
            r0 = 4
            r3.A = r0
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r4 == 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r5 == 0) goto L10
            r0 = r1
        L10:
            if (r2 == r0) goto L26
            r3.R = r4
            r3.X = r5
            java.lang.StringBuilder r4 = defpackage.ck7.a
            if (r6 == 0) goto L1f
            r3.L = r6
            r3.B = r7
            return
        L1f:
            java.lang.String r3 = "loadedFrom == null"
            defpackage.u34.x(r3)
            r3 = 0
            throw r3
        L26:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    public aj(android.graphics.Paint r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r2 = 3
            r1.B = r2
            return
    }

    public aj(android.os.Bundle r2) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r2.getClass()
            r1.<init>()
            java.lang.String r0 = "nav-entry-state:id"
            java.lang.String r0 = defpackage.uj2.P(r2, r0)
            r1.L = r0
            java.lang.String r0 = "nav-entry-state:destination-id"
            int r0 = defpackage.uj2.I(r2, r0)
            r1.B = r0
            java.lang.String r0 = "nav-entry-state:args"
            android.os.Bundle r0 = defpackage.uj2.N(r2, r0)
            r1.R = r0
            java.lang.String r0 = "nav-entry-state:saved-state"
            android.os.Bundle r2 = defpackage.uj2.N(r2, r0)
            r1.X = r2
            return
    }

    public aj(defpackage.in6 r3, defpackage.qw4 r4) {
            r2 = this;
            r0 = 4
            r2.A = r0
            java.lang.StringBuilder r0 = defpackage.ck7.a
            r0 = 0
            if (r3 == 0) goto Ld
            r1 = 0
            r2.<init>(r0, r3, r4, r1)
            return
        Ld:
            java.lang.String r2 = "source == null"
            defpackage.u34.x(r2)
            throw r0
    }

    public aj(java.io.FileOutputStream r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            v90 r2 = defpackage.v90.c
            r0 = 512(0x200, float:7.17E-43)
            byte[] r2 = r2.c(r0)
            r1.R = r2
            jm0 r2 = defpackage.jm0.c
            r0 = 128(0x80, float:1.8E-43)
            char[] r2 = r2.d(r0)
            r1.X = r2
            return
    }

    public aj(defpackage.sb4 r2, int r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            java.lang.String r0 = r2.Y
            r1.L = r0
            r1.B = r3
            uk1 r2 = r2.d0
            android.os.Bundle r3 = r2.c()
            r1.R = r3
            r3 = 0
            vr4[] r0 = new defpackage.vr4[r3]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            vr4[] r3 = (defpackage.vr4[]) r3
            android.os.Bundle r3 = defpackage.jw2.l(r3)
            r1.X = r3
            java.lang.Object r1 = r2.j
            e56 r1 = (defpackage.e56) r1
            r1.c(r3)
            return
    }

    public aj(defpackage.td3 r4) {
            r3 = this;
            r0 = 1
            r3.A = r0
            r3.<init>()
            r3.L = r4
            r4 = 8
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.R = r0
            int[] r0 = new int[r4]
            r1 = 0
        L11:
            r2 = -1
            if (r1 >= r4) goto L19
            r0[r1] = r2
            int r1 = r1 + 1
            goto L11
        L19:
            r3.X = r0
            r3.B = r2
            return
    }

    public void a(int r3, int r4) {
            r2 = this;
            int r4 = r4 + r3
            java.lang.Object r0 = r2.X
            char[] r0 = (char[]) r0
            int r1 = r0.length
            if (r1 > r4) goto L13
            int r3 = r3 * 2
            if (r4 >= r3) goto Ld
            r4 = r3
        Ld:
            char[] r3 = java.util.Arrays.copyOf(r0, r4)
            r2.X = r3
        L13:
            return
    }

    public void b() {
            r4 = this;
            java.lang.Object r0 = r4.L
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0
            java.lang.Object r1 = r4.R
            byte[] r1 = (byte[]) r1
            int r2 = r4.B
            r3 = 0
            r0.write(r1, r3, r2)
            r4.B = r3
            return
    }

    public java.lang.String c() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$"
            r0.<init>(r1)
            int r1 = r6.B
            int r1 = r1 + 1
            r2 = 0
        Lc:
            if (r2 >= r1) goto L72
            java.lang.Object r3 = r6.R
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r3 = r3[r2]
            boolean r4 = r3 instanceof defpackage.wb6
            if (r4 == 0) goto L54
            wb6 r3 = (defpackage.wb6) r3
            np2 r4 = r3.e()
            bt6 r5 = defpackage.bt6.f
            boolean r4 = defpackage.nb3.k(r4, r5)
            java.lang.Object r5 = r6.X
            int[] r5 = (int[]) r5
            if (r4 == 0) goto L43
            r3 = r5[r2]
            r4 = -1
            if (r3 == r4) goto L6f
            java.lang.String r3 = "["
            r0.append(r3)
            java.lang.Object r3 = r6.X
            int[] r3 = (int[]) r3
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            goto L6f
        L43:
            r4 = r5[r2]
            if (r4 < 0) goto L6f
            java.lang.String r5 = "."
            r0.append(r5)
            java.lang.String r3 = r3.g(r4)
            r0.append(r3)
            goto L6f
        L54:
            cs1 r4 = defpackage.cs1.e0
            if (r3 != r4) goto L5e
            java.lang.String r3 = "[<debug info disabled>]"
            r0.append(r3)
            goto L6f
        L5e:
            xd5 r4 = defpackage.xd5.g0
            if (r3 == r4) goto L6f
            java.lang.String r4 = "['"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "']"
            r0.append(r3)
        L6f:
            int r2 = r2 + 1
            goto Lc
        L72:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // defpackage.ja3
    public void d(char r9) {
            r8 = this;
            java.lang.Object r0 = r8.R
            byte[] r0 = (byte[]) r0
            r1 = 1
            r2 = 128(0x80, float:1.8E-43)
            if (r9 >= r2) goto L1c
            int r2 = r0.length
            int r3 = r8.B
            int r2 = r2 - r3
            if (r2 >= r1) goto L12
            r8.b()
        L12:
            int r1 = r8.B
            int r2 = r1 + 1
            r8.B = r2
            byte r8 = (byte) r9
            r0[r1] = r8
            return
        L1c:
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 63
            if (r9 >= r3) goto L42
            int r1 = r0.length
            int r3 = r8.B
            int r1 = r1 - r3
            r3 = 2
            if (r1 >= r3) goto L2c
            r8.b()
        L2c:
            int r1 = r9 >> 6
            r1 = r1 | 192(0xc0, float:2.69E-43)
            int r5 = r8.B
            int r6 = r5 + 1
            r8.B = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            r9 = r9 & r4
            r9 = r9 | r2
            int r5 = r5 + r3
            r8.B = r5
            byte r8 = (byte) r9
            r0[r6] = r8
            return
        L42:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r9) goto L5e
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r3) goto L5e
            int r9 = r0.length
            int r2 = r8.B
            int r9 = r9 - r2
            if (r9 >= r1) goto L55
            r8.b()
        L55:
            int r9 = r8.B
            int r1 = r9 + 1
            r8.B = r1
            r0[r9] = r4
            return
        L5e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L8d
            int r1 = r0.length
            int r3 = r8.B
            int r1 = r1 - r3
            r3 = 3
            if (r1 >= r3) goto L6c
            r8.b()
        L6c:
            int r1 = r9 >> 12
            r1 = r1 | 224(0xe0, float:3.14E-43)
            int r5 = r8.B
            int r6 = r5 + 1
            r8.B = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            int r1 = r9 >> 6
            r1 = r1 & r4
            r1 = r1 | r2
            int r7 = r5 + 2
            r8.B = r7
            byte r1 = (byte) r1
            r0[r6] = r1
            r9 = r9 & r4
            r9 = r9 | r2
            int r5 = r5 + r3
            r8.B = r5
            byte r8 = (byte) r9
            r0[r7] = r8
            return
        L8d:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lc8
            int r1 = r0.length
            int r3 = r8.B
            int r1 = r1 - r3
            r3 = 4
            if (r1 >= r3) goto L9c
            r8.b()
        L9c:
            int r1 = r9 >> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            int r5 = r8.B
            int r6 = r5 + 1
            r8.B = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            int r1 = r9 >> 12
            r1 = r1 & r4
            r1 = r1 | r2
            int r7 = r5 + 2
            r8.B = r7
            byte r1 = (byte) r1
            r0[r6] = r1
            int r1 = r9 >> 6
            r1 = r1 & r4
            r1 = r1 | r2
            int r6 = r5 + 3
            r8.B = r6
            byte r1 = (byte) r1
            r0[r7] = r1
            r9 = r9 & r4
            r9 = r9 | r2
            int r5 = r5 + r3
            r8.B = r5
            byte r8 = (byte) r9
            r0[r6] = r8
            return
        Lc8:
            le3 r8 = new le3
            java.lang.String r0 = "Unexpected code point: "
            java.lang.String r1 = ". Check your strings for malformed UTF-8 sequences."
            java.lang.String r9 = defpackage.lb1.k(r0, r9, r1)
            r0 = 0
            r1 = 6
            r8.<init>(r9, r1, r0)
            throw r8
    }

    @Override // defpackage.ja3
    public void e(java.lang.String r12) {
            r11 = this;
            r12.getClass()
            int r0 = r12.length()
            r1 = 2
            int r0 = r0 + r1
            r2 = 0
            r11.a(r2, r0)
            java.lang.Object r0 = r11.X
            char[] r0 = (char[]) r0
            r3 = 34
            r0[r2] = r3
            int r4 = r12.length()
            r5 = 1
            r12.getChars(r2, r4, r0, r5)
            int r6 = r4 + 1
            r7 = r5
        L20:
            if (r7 >= r6) goto La5
            char r8 = r0[r7]
            byte[] r9 = defpackage.os6.b
            int r10 = r9.length
            if (r8 >= r10) goto La1
            r8 = r9[r8]
            if (r8 == 0) goto La1
            int r0 = r7 + (-1)
            int r4 = r12.length()
        L33:
            if (r0 >= r4) goto L8f
            r11.a(r7, r1)
            char r6 = r12.charAt(r0)
            byte[] r8 = defpackage.os6.b
            int r9 = r8.length
            if (r6 >= r9) goto L82
            r8 = r8[r6]
            if (r8 != 0) goto L50
            java.lang.Object r8 = r11.X
            char[] r8 = (char[]) r8
            int r9 = r7 + 1
            char r6 = (char) r6
            r8[r7] = r6
        L4e:
            r7 = r9
            goto L8c
        L50:
            if (r8 != r5) goto L72
            java.lang.String[] r8 = defpackage.os6.a
            r6 = r8[r6]
            r6.getClass()
            int r8 = r6.length()
            r11.a(r7, r8)
            java.lang.Object r8 = r11.X
            char[] r8 = (char[]) r8
            int r9 = r6.length()
            r6.getChars(r2, r9, r8, r7)
            int r6 = r6.length()
            int r6 = r6 + r7
            r7 = r6
            goto L8c
        L72:
            java.lang.Object r6 = r11.X
            char[] r6 = (char[]) r6
            r9 = 92
            r6[r7] = r9
            int r9 = r7 + 1
            char r8 = (char) r8
            r6[r9] = r8
            int r7 = r7 + 2
            goto L8c
        L82:
            java.lang.Object r8 = r11.X
            char[] r8 = (char[]) r8
            int r9 = r7 + 1
            char r6 = (char) r6
            r8[r7] = r6
            goto L4e
        L8c:
            int r0 = r0 + 1
            goto L33
        L8f:
            r11.a(r7, r5)
            java.lang.Object r12 = r11.X
            char[] r12 = (char[]) r12
            int r0 = r7 + 1
            r12[r7] = r3
            r11.u(r12, r0)
            r11.b()
            return
        La1:
            int r7 = r7 + 1
            goto L20
        La5:
            r0[r6] = r3
            int r4 = r4 + r1
            r11.u(r0, r4)
            r11.b()
            return
    }

    @Override // defpackage.ja3
    public void f(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.length()
            r1 = 0
            r3.a(r1, r0)
            java.lang.Object r2 = r3.X
            char[] r2 = (char[]) r2
            r4.getChars(r1, r0, r2, r1)
            java.lang.Object r4 = r3.X
            char[] r4 = (char[]) r4
            r3.u(r4, r0)
            return
    }

    public int g() {
            r2 = this;
            java.lang.Object r2 = r2.L
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            android.graphics.Paint$Cap r2 = r2.getStrokeCap()
            if (r2 != 0) goto Lc
            r2 = -1
            goto L14
        Lc:
            int[] r0 = defpackage.bj.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
        L14:
            r0 = 1
            if (r2 == r0) goto L20
            r1 = 2
            if (r2 == r1) goto L1f
            r0 = 3
            if (r2 == r0) goto L1e
            goto L20
        L1e:
            return r1
        L1f:
            return r0
        L20:
            r2 = 0
            return r2
    }

    public int h() {
            r2 = this;
            java.lang.Object r2 = r2.L
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            android.graphics.Paint$Join r2 = r2.getStrokeJoin()
            if (r2 != 0) goto Lc
            r2 = -1
            goto L14
        Lc:
            int[] r0 = defpackage.bj.b
            int r2 = r2.ordinal()
            r2 = r0[r2]
        L14:
            r0 = 1
            if (r2 == r0) goto L20
            r1 = 2
            if (r2 == r1) goto L1f
            r1 = 3
            if (r2 == r1) goto L1e
            goto L20
        L1e:
            return r0
        L1f:
            return r1
        L20:
            r2 = 0
            return r2
    }

    public void i() {
            r5 = this;
            int r0 = r5.B
            int r0 = r0 * 2
            java.lang.Object r1 = r5.R
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r5.R = r1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r0) goto L1a
            r4 = -1
            r1[r3] = r4
            int r3 = r3 + 1
            goto L12
        L1a:
            java.lang.Object r0 = r5.X
            int[] r0 = (int[]) r0
            r3 = 14
            defpackage.fv.v0(r2, r2, r3, r0, r1)
            r5.X = r1
            return
    }

    public void j(float r3) {
            r2 = this;
            java.lang.Object r2 = r2.L
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.rint(r0)
            float r3 = (float) r0
            int r3 = (int) r3
            r2.setAlpha(r3)
            return
    }

    public void k(int r3) {
            r2 = this;
            int r0 = r2.B
            if (r0 != r3) goto L5
            return
        L5:
            r2.B = r3
            java.lang.Object r2 = r2.L
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            android.graphics.BlendMode r3 = defpackage.f04.S(r3)
            defpackage.fq7.f(r2, r3)
            return
        L19:
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = defpackage.f04.T(r3)
            r0.<init>(r3)
            r2.setXfermode(r0)
            return
    }

    public void l(long r1) {
            r0 = this;
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            int r1 = defpackage.hv.b0(r1)
            r0.setColor(r1)
            return
    }

    public void m(defpackage.z40 r1) {
            r0 = this;
            r0.X = r1
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            if (r1 == 0) goto Lb
            android.graphics.ColorFilter r1 = r1.a
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.setColorFilter(r1)
            return
    }

    public void n(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r0 = 1
            if (r2 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 ^ r0
            r1.setFilterBitmap(r2)
            return
    }

    public void o(defpackage.ij r1) {
            r0 = this;
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 0
            r0.setPathEffect(r1)
            return
    }

    public void p(android.graphics.Shader r1) {
            r0 = this;
            r0.R = r1
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setShader(r1)
            return
    }

    public void q(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r0 = 2
            if (r2 != r0) goto La
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.SQUARE
            goto L17
        La:
            r0 = 1
            if (r2 != r0) goto L10
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
            goto L17
        L10:
            if (r2 != 0) goto L15
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            goto L17
        L15:
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
        L17:
            r1.setStrokeCap(r2)
            return
    }

    public void r(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            if (r2 != 0) goto L9
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            goto L17
        L9:
            r0 = 2
            if (r2 != r0) goto Lf
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.BEVEL
            goto L17
        Lf:
            r0 = 1
            if (r2 != r0) goto L15
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
            goto L17
        L15:
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
        L17:
            r1.setStrokeJoin(r2)
            return
    }

    public void s(float r1) {
            r0 = this;
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setStrokeWidth(r1)
            return
    }

    public void t(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r0 = 1
            if (r2 != r0) goto La
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            goto Lc
        La:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
        Lc:
            r1.setStyle(r2)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = r1.c()
            return r1
    }

    public void u(char[] r12, int r13) {
            r11 = this;
            java.lang.Object r0 = r11.R
            byte[] r0 = (byte[]) r0
            if (r13 < 0) goto L12b
            int r1 = r12.length
            if (r13 > r1) goto L111
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r13) goto L110
            char r3 = r12[r2]
            r4 = 128(0x80, float:1.8E-43)
            r5 = 1
            if (r3 >= r4) goto L41
            int r6 = r0.length
            int r7 = r11.B
            int r6 = r6 - r7
            if (r6 >= r5) goto L1d
            r11.b()
        L1d:
            int r5 = r11.B
            int r6 = r5 + 1
            r11.B = r6
            byte r3 = (byte) r3
            r0[r5] = r3
            int r2 = r2 + 1
            int r3 = r0.length
            int r3 = r3 - r6
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r13, r3)
        L2f:
            if (r2 >= r3) goto Lb
            char r5 = r12[r2]
            if (r5 >= r4) goto Lb
            int r6 = r11.B
            int r7 = r6 + 1
            r11.B = r7
            byte r5 = (byte) r5
            r0[r6] = r5
            int r2 = r2 + 1
            goto L2f
        L41:
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 >= r6) goto L68
            int r5 = r0.length
            int r6 = r11.B
            int r5 = r5 - r6
            r6 = 2
            if (r5 >= r6) goto L4f
            r11.b()
        L4f:
            int r5 = r3 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            int r7 = r11.B
            int r8 = r7 + 1
            r11.B = r8
            byte r5 = (byte) r5
            r0[r7] = r5
            r3 = r3 & 63
            r3 = r3 | r4
            int r7 = r7 + r6
            r11.B = r7
            byte r3 = (byte) r3
            r0[r8] = r3
        L65:
            int r2 = r2 + 1
            goto Lb
        L68:
            r6 = 55296(0xd800, float:7.7486E-41)
            r7 = 63
            if (r3 < r6) goto Le3
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r3 <= r6) goto L75
            goto Le3
        L75:
            int r6 = r2 + 1
            if (r6 >= r13) goto L7c
            char r8 = r12[r6]
            goto L7d
        L7c:
            r8 = r1
        L7d:
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r3 > r9) goto Lcf
            r9 = 56320(0xdc00, float:7.8921E-41)
            if (r9 > r8) goto Lcf
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r9) goto Lcf
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            int r3 = r3 << 10
            r5 = r8 & 1023(0x3ff, float:1.434E-42)
            r3 = r3 | r5
            r5 = 65536(0x10000, float:9.1835E-41)
            int r3 = r3 + r5
            int r5 = r0.length
            int r6 = r11.B
            int r5 = r5 - r6
            r6 = 4
            if (r5 >= r6) goto La0
            r11.b()
        La0:
            int r5 = r3 >> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            int r8 = r11.B
            int r9 = r8 + 1
            r11.B = r9
            byte r5 = (byte) r5
            r0[r8] = r5
            int r5 = r3 >> 12
            r5 = r5 & r7
            r5 = r5 | r4
            int r10 = r8 + 2
            r11.B = r10
            byte r5 = (byte) r5
            r0[r9] = r5
            int r5 = r3 >> 6
            r5 = r5 & r7
            r5 = r5 | r4
            int r9 = r8 + 3
            r11.B = r9
            byte r5 = (byte) r5
            r0[r10] = r5
            r3 = r3 & r7
            r3 = r3 | r4
            int r8 = r8 + r6
            r11.B = r8
            byte r3 = (byte) r3
            r0[r9] = r3
            int r2 = r2 + 2
            goto Lb
        Lcf:
            int r2 = r0.length
            int r3 = r11.B
            int r2 = r2 - r3
            if (r2 >= r5) goto Ld8
            r11.b()
        Ld8:
            int r2 = r11.B
            int r3 = r2 + 1
            r11.B = r3
            r0[r2] = r7
            r2 = r6
            goto Lb
        Le3:
            int r5 = r0.length
            int r6 = r11.B
            int r5 = r5 - r6
            r6 = 3
            if (r5 >= r6) goto Led
            r11.b()
        Led:
            int r5 = r3 >> 12
            r5 = r5 | 224(0xe0, float:3.14E-43)
            int r8 = r11.B
            int r9 = r8 + 1
            r11.B = r9
            byte r5 = (byte) r5
            r0[r8] = r5
            int r5 = r3 >> 6
            r5 = r5 & r7
            r5 = r5 | r4
            int r7 = r8 + 2
            r11.B = r7
            byte r5 = (byte) r5
            r0[r9] = r5
            r3 = r3 & 63
            r3 = r3 | r4
            int r8 = r8 + r6
            r11.B = r8
            byte r3 = (byte) r3
            r0[r7] = r3
            goto L65
        L110:
            return
        L111:
            java.lang.String r11 = "count > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r11 = defpackage.xg6.t(r11, r13, r0)
            int r12 = r12.length
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L12b:
            java.lang.String r11 = "count < 0"
            defpackage.i.h(r11)
            return
    }

    @Override // defpackage.ja3
    public void writeLong(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f(r1)
            return
    }
}
