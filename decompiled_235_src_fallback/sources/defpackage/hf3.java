package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf3  reason: default package */
/* loaded from: classes.dex */
public class hf3 implements java.io.Closeable {
    public final java.io.Reader A;
    public defpackage.ls6 B;
    public final int L;
    public final char[] R;
    public int X;
    public int Y;
    public int Z;
    public int d0;
    public int e0;
    public long f0;
    public int g0;
    public java.lang.String h0;
    public int[] i0;
    public int j0;
    public java.lang.String[] k0;
    public int[] l0;

    static {
            x31 r0 = new x31
            r1 = 12
            r0.<init>(r1)
            defpackage.x31.B = r0
            return
    }

    public hf3(java.io.Reader r5) {
            r4 = this;
            r4.<init>()
            ls6 r0 = defpackage.ls6.LEGACY_STRICT
            r4.B = r0
            r0 = 255(0xff, float:3.57E-43)
            r4.L = r0
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]
            r4.R = r0
            r0 = 0
            r4.X = r0
            r4.Y = r0
            r4.Z = r0
            r4.d0 = r0
            r4.e0 = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.i0 = r2
            r3 = 1
            r4.j0 = r3
            r3 = 6
            r2[r0] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.k0 = r0
            int[] r0 = new int[r1]
            r4.l0 = r0
            java.lang.String r0 = "in == null"
            java.util.Objects.requireNonNull(r5, r0)
            r4.A = r5
            return
    }

    public final java.lang.String A(boolean r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r4.j0
            if (r1 >= r2) goto L4c
            int[] r3 = r4.i0
            r3 = r3[r1]
            switch(r3) {
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L1f;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                default: goto L13;
            }
        L13:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Unknown scope value: "
            java.lang.String r5 = defpackage.lb1.g(r3, r5)
            r4.<init>(r5)
            throw r4
        L1f:
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r4.k0
            r2 = r2[r1]
            if (r2 == 0) goto L49
            r0.append(r2)
            goto L49
        L2e:
            int[] r3 = r4.l0
            r3 = r3[r1]
            if (r5 == 0) goto L3c
            if (r3 <= 0) goto L3c
            int r2 = r2 + (-1)
            if (r1 != r2) goto L3c
            int r3 = r3 + (-1)
        L3c:
            r2 = 91
            r0.append(r2)
            r0.append(r3)
            r2 = 93
            r0.append(r2)
        L49:
            int r1 = r1 + 1
            goto L8
        L4c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public java.lang.String D() {
            r1 = this;
            r0 = 1
            java.lang.String r1 = r1.A(r0)
            return r1
    }

    public boolean F() {
            r1 = this;
            int r0 = r1.e0
            if (r0 != 0) goto L8
            int r0 = r1.n()
        L8:
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r1 = 17
            if (r0 == r1) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public final boolean J(char r2) {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L3c
            r0 = 10
            if (r2 == r0) goto L3c
            r0 = 12
            if (r2 == r0) goto L3c
            r0 = 13
            if (r2 == r0) goto L3c
            r0 = 32
            if (r2 == r0) goto L3c
            r0 = 35
            if (r2 == r0) goto L39
            r0 = 44
            if (r2 == r0) goto L3c
            r0 = 47
            if (r2 == r0) goto L39
            r0 = 61
            if (r2 == r0) goto L39
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L3c
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L3c
            r0 = 59
            if (r2 == r0) goto L39
            switch(r2) {
                case 91: goto L3c;
                case 92: goto L39;
                case 93: goto L3c;
                default: goto L37;
            }
        L37:
            r1 = 1
            return r1
        L39:
            r1.k()
        L3c:
            r1 = 0
            return r1
    }

    final java.lang.String N() {
            r5 = this;
            int r0 = r5.Z
            int r0 = r0 + 1
            int r1 = r5.X
            int r2 = r5.d0
            int r1 = r1 - r2
            int r1 = r1 + 1
            java.lang.String r2 = " column "
            java.lang.String r3 = " path "
            java.lang.String r4 = " at line "
            java.lang.StringBuilder r0 = defpackage.i61.q(r0, r1, r4, r2, r3)
            java.lang.String r5 = r5.x()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public boolean U() {
            r4 = this;
            int r0 = r4.e0
            if (r0 != 0) goto L8
            int r0 = r4.n()
        L8:
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            r4.e0 = r2
            int[] r0 = r4.l0
            int r4 = r4.j0
            int r4 = r4 - r3
            r1 = r0[r4]
            int r1 = r1 + r3
            r0[r4] = r1
            return r3
        L1a:
            r1 = 6
            if (r0 != r1) goto L2a
            r4.e0 = r2
            int[] r0 = r4.l0
            int r4 = r4.j0
            int r4 = r4 - r3
            r1 = r0[r4]
            int r1 = r1 + r3
            r0[r4] = r1
            return r2
        L2a:
            java.lang.String r0 = "a boolean"
            java.lang.IllegalStateException r4 = r4.w0(r0)
            throw r4
    }

    public double X() {
            r6 = this;
            int r0 = r6.e0
            if (r0 != 0) goto L8
            int r0 = r6.n()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1f
            r6.e0 = r2
            int[] r0 = r6.l0
            int r1 = r6.j0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r6.f0
            double r0 = (double) r0
            return r0
        L1f:
            r1 = 16
            r3 = 11
            if (r0 != r1) goto L3a
            java.lang.String r0 = new java.lang.String
            int r1 = r6.X
            int r4 = r6.g0
            char[] r5 = r6.R
            r0.<init>(r5, r1, r4)
            r6.h0 = r0
            int r0 = r6.X
            int r1 = r6.g0
            int r0 = r0 + r1
            r6.X = r0
            goto L65
        L3a:
            r1 = 8
            if (r0 == r1) goto L58
            r4 = 9
            if (r0 != r4) goto L43
            goto L58
        L43:
            r1 = 10
            if (r0 != r1) goto L4e
            java.lang.String r0 = r6.m0()
            r6.h0 = r0
            goto L65
        L4e:
            if (r0 != r3) goto L51
            goto L65
        L51:
            java.lang.String r0 = "a double"
            java.lang.IllegalStateException r6 = r6.w0(r0)
            throw r6
        L58:
            if (r0 != r1) goto L5d
            r0 = 39
            goto L5f
        L5d:
            r0 = 34
        L5f:
            java.lang.String r0 = r6.k0(r0)
            r6.h0 = r0
        L65:
            r6.e0 = r3
            java.lang.String r0 = r6.h0
            double r0 = java.lang.Double.parseDouble(r0)
            ls6 r3 = r6.B
            ls6 r4 = defpackage.ls6.LENIENT
            r5 = 0
            if (r3 == r4) goto L93
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L81
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L81
            goto L93
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JSON forbids NaN and infinities: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.v0(r0)
            throw r5
        L93:
            r6.h0 = r5
            r6.e0 = r2
            int[] r2 = r6.l0
            int r6 = r6.j0
            int r6 = r6 + (-1)
            r3 = r2[r6]
            int r3 = r3 + 1
            r2[r6] = r3
            return r0
    }

    public int Z() {
            r7 = this;
            int r0 = r7.e0
            if (r0 != 0) goto L8
            int r0 = r7.n()
        L8:
            r1 = 15
            java.lang.String r2 = "Expected an int but was "
            r3 = 0
            if (r0 != r1) goto L41
            long r0 = r7.f0
            int r4 = (int) r0
            long r5 = (long) r4
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L26
            r7.e0 = r3
            int[] r0 = r7.l0
            int r7 = r7.j0
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r4
        L26:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            long r3 = r7.f0
            java.lang.String r7 = r7.N()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L41:
            r1 = 16
            if (r0 != r1) goto L5a
            java.lang.String r0 = new java.lang.String
            int r1 = r7.X
            int r4 = r7.g0
            char[] r5 = r7.R
            r0.<init>(r5, r1, r4)
            r7.h0 = r0
            int r0 = r7.X
            int r1 = r7.g0
            int r0 = r0 + r1
            r7.X = r0
            goto L9e
        L5a:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L6e
            r5 = 9
            if (r0 == r5) goto L6e
            if (r0 != r1) goto L67
            goto L6e
        L67:
            java.lang.String r0 = "an int"
            java.lang.IllegalStateException r7 = r7.w0(r0)
            throw r7
        L6e:
            if (r0 != r1) goto L77
            java.lang.String r0 = r7.m0()
            r7.h0 = r0
            goto L84
        L77:
            if (r0 != r4) goto L7c
            r0 = 39
            goto L7e
        L7c:
            r0 = 34
        L7e:
            java.lang.String r0 = r7.k0(r0)
            r7.h0 = r0
        L84:
            java.lang.String r0 = r7.h0
            r7.x0(r0)
            java.lang.String r0 = r7.h0     // Catch: java.lang.NumberFormatException -> L9e
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9e
            r7.e0 = r3     // Catch: java.lang.NumberFormatException -> L9e
            int[] r1 = r7.l0     // Catch: java.lang.NumberFormatException -> L9e
            int r4 = r7.j0     // Catch: java.lang.NumberFormatException -> L9e
            int r4 = r4 + (-1)
            r5 = r1[r4]     // Catch: java.lang.NumberFormatException -> L9e
            int r5 = r5 + 1
            r1[r4] = r5     // Catch: java.lang.NumberFormatException -> L9e
            return r0
        L9e:
            r0 = 11
            r7.e0 = r0
            java.lang.String r0 = r7.h0
            double r0 = java.lang.Double.parseDouble(r0)
            int r4 = (int) r0
            double r5 = (double) r4
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc0
            r0 = 0
            r7.h0 = r0
            r7.e0 = r3
            int[] r0 = r7.l0
            int r7 = r7.j0
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r4
        Lc0:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r7.h0
            java.lang.String r7 = r7.N()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.<init>(r7)
            throw r0
    }

    public long a0() {
            r7 = this;
            int r0 = r7.e0
            if (r0 != 0) goto L8
            int r0 = r7.n()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1e
            r7.e0 = r2
            int[] r0 = r7.l0
            int r1 = r7.j0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r7.f0
            return r0
        L1e:
            r1 = 16
            if (r0 != r1) goto L37
            java.lang.String r0 = new java.lang.String
            int r1 = r7.X
            int r3 = r7.g0
            char[] r4 = r7.R
            r0.<init>(r4, r1, r3)
            r7.h0 = r0
            int r0 = r7.X
            int r1 = r7.g0
            int r0 = r0 + r1
            r7.X = r0
            goto L7b
        L37:
            r1 = 10
            r3 = 8
            if (r0 == r3) goto L4b
            r4 = 9
            if (r0 == r4) goto L4b
            if (r0 != r1) goto L44
            goto L4b
        L44:
            java.lang.String r0 = "a long"
            java.lang.IllegalStateException r7 = r7.w0(r0)
            throw r7
        L4b:
            if (r0 != r1) goto L54
            java.lang.String r0 = r7.m0()
            r7.h0 = r0
            goto L61
        L54:
            if (r0 != r3) goto L59
            r0 = 39
            goto L5b
        L59:
            r0 = 34
        L5b:
            java.lang.String r0 = r7.k0(r0)
            r7.h0 = r0
        L61:
            java.lang.String r0 = r7.h0
            r7.x0(r0)
            java.lang.String r0 = r7.h0     // Catch: java.lang.NumberFormatException -> L7b
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7b
            r7.e0 = r2     // Catch: java.lang.NumberFormatException -> L7b
            int[] r3 = r7.l0     // Catch: java.lang.NumberFormatException -> L7b
            int r4 = r7.j0     // Catch: java.lang.NumberFormatException -> L7b
            int r4 = r4 + (-1)
            r5 = r3[r4]     // Catch: java.lang.NumberFormatException -> L7b
            int r5 = r5 + 1
            r3[r4] = r5     // Catch: java.lang.NumberFormatException -> L7b
            return r0
        L7b:
            r0 = 11
            r7.e0 = r0
            java.lang.String r0 = r7.h0
            double r0 = java.lang.Double.parseDouble(r0)
            long r3 = (long) r0
            double r5 = (double) r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L9d
            r0 = 0
            r7.h0 = r0
            r7.e0 = r2
            int[] r0 = r7.l0
            int r7 = r7.j0
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r3
        L9d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r7.h0
            java.lang.String r7 = r7.N()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a long but was "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
    }

    public java.lang.String c0() {
            r2 = this;
            int r0 = r2.e0
            if (r0 != 0) goto L8
            int r0 = r2.n()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r0 = r2.m0()
            goto L26
        L11:
            r1 = 12
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r2.k0(r0)
            goto L26
        L1c:
            r1 = 13
            if (r0 != r1) goto L32
            r0 = 34
            java.lang.String r0 = r2.k0(r0)
        L26:
            r1 = 0
            r2.e0 = r1
            java.lang.String[] r1 = r2.k0
            int r2 = r2.j0
            int r2 = r2 + (-1)
            r1[r2] = r0
            return r0
        L32:
            java.lang.String r0 = "a name"
            java.lang.IllegalStateException r2 = r2.w0(r0)
            throw r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            r0 = 0
            r3.e0 = r0
            int[] r1 = r3.i0
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.j0 = r0
            java.io.Reader r3 = r3.A
            r3.close()
            return
    }

    public void e() {
            r3 = this;
            int r0 = r3.e0
            if (r0 != 0) goto L8
            int r0 = r3.n()
        L8:
            r1 = 3
            if (r0 != r1) goto L1a
            r0 = 1
            r3.o0(r0)
            int[] r1 = r3.l0
            int r2 = r3.j0
            int r2 = r2 - r0
            r0 = 0
            r1[r2] = r0
            r3.e0 = r0
            return
        L1a:
            java.lang.String r0 = "BEGIN_ARRAY"
            java.lang.IllegalStateException r3 = r3.w0(r0)
            throw r3
    }

    public final int e0(boolean r10) {
            r9 = this;
            int r0 = r9.X
            int r1 = r9.Y
        L4:
            r2 = 1
            if (r0 != r1) goto L27
            r9.X = r0
            boolean r0 = r9.v(r2)
            if (r0 != 0) goto L23
            if (r10 != 0) goto L13
            r9 = -1
            return r9
        L13:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r9 = r9.N()
            java.lang.String r0 = "End of input"
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        L23:
            int r0 = r9.X
            int r1 = r9.Y
        L27:
            int r3 = r0 + 1
            char[] r4 = r9.R
            char r5 = r4[r0]
            r6 = 10
            if (r5 != r6) goto L3a
            int r0 = r9.Z
            int r0 = r0 + r2
            r9.Z = r0
            r9.d0 = r3
            goto Ld6
        L3a:
            r7 = 32
            if (r5 == r7) goto Ld6
            r7 = 13
            if (r5 == r7) goto Ld6
            r7 = 9
            if (r5 != r7) goto L48
            goto Ld6
        L48:
            r7 = 47
            if (r5 != r7) goto Lc1
            r9.X = r3
            r8 = 2
            if (r3 != r1) goto L5f
            r9.X = r0
            boolean r0 = r9.v(r8)
            int r1 = r9.X
            int r1 = r1 + r2
            r9.X = r1
            if (r0 != 0) goto L5f
            goto L6c
        L5f:
            r9.k()
            int r0 = r9.X
            char r1 = r4[r0]
            r3 = 42
            if (r1 == r3) goto L79
            if (r1 == r7) goto L6d
        L6c:
            return r5
        L6d:
            int r0 = r0 + 1
            r9.X = r0
            r9.s0()
            int r0 = r9.X
            int r1 = r9.Y
            goto L4
        L79:
            int r0 = r0 + 1
            r9.X = r0
        L7d:
            int r0 = r9.X
            int r0 = r0 + r8
            int r1 = r9.Y
            if (r0 <= r1) goto L92
            boolean r0 = r9.v(r8)
            if (r0 == 0) goto L8b
            goto L92
        L8b:
            java.lang.String r10 = "Unterminated comment"
            r9.v0(r10)
            r9 = 0
            throw r9
        L92:
            int r0 = r9.X
            char r1 = r4[r0]
            if (r1 != r6) goto La2
            int r1 = r9.Z
            int r1 = r1 + r2
            r9.Z = r1
            int r0 = r0 + 1
            r9.d0 = r0
            goto Lb2
        La2:
            r0 = 0
        La3:
            int r1 = r9.X
            if (r0 >= r8) goto Lbb
            int r1 = r1 + r0
            char r1 = r4[r1]
            java.lang.String r3 = "*/"
            char r3 = r3.charAt(r0)
            if (r1 == r3) goto Lb8
        Lb2:
            int r0 = r9.X
            int r0 = r0 + r2
            r9.X = r0
            goto L7d
        Lb8:
            int r0 = r0 + 1
            goto La3
        Lbb:
            int r0 = r1 + 2
            int r1 = r9.Y
            goto L4
        Lc1:
            r0 = 35
            if (r5 != r0) goto Ld3
            r9.X = r3
            r9.k()
            r9.s0()
            int r0 = r9.X
            int r1 = r9.Y
            goto L4
        Ld3:
            r9.X = r3
            return r5
        Ld6:
            r0 = r3
            goto L4
    }

    public void h() {
            r2 = this;
            int r0 = r2.e0
            if (r0 != 0) goto L8
            int r0 = r2.n()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 3
            r2.o0(r0)
            r0 = 0
            r2.e0 = r0
            return
        L13:
            java.lang.String r0 = "BEGIN_OBJECT"
            java.lang.IllegalStateException r2 = r2.w0(r0)
            throw r2
    }

    public void j0() {
            r2 = this;
            int r0 = r2.e0
            if (r0 != 0) goto L8
            int r0 = r2.n()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r0 = 0
            r2.e0 = r0
            int[] r0 = r2.l0
            int r2 = r2.j0
            int r2 = r2 + (-1)
            r1 = r0[r2]
            int r1 = r1 + 1
            r0[r2] = r1
            return
        L1b:
            java.lang.String r0 = "null"
            java.lang.IllegalStateException r2 = r2.w0(r0)
            throw r2
    }

    public final void k() {
            r2 = this;
            ls6 r0 = r2.B
            ls6 r1 = defpackage.ls6.LENIENT
            if (r0 != r1) goto L7
            return
        L7:
            java.lang.String r0 = "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"
            r2.v0(r0)
            r2 = 0
            throw r2
    }

    public final java.lang.String k0(char r12) {
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.X
            int r3 = r11.Y
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.R
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            ls6 r9 = r11.B
            ls6 r10 = defpackage.ls6.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.v0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.X = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.X = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.p0()
            r1.append(r2)
            int r2 = r11.X
            int r3 = r11.Y
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.Z
            int r2 = r2 + r6
            r11.Z = r2
            r11.d0 = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.X = r2
            boolean r2 = r11.v(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.v0(r12)
            throw r0
    }

    public java.lang.String l0() {
            r4 = this;
            int r0 = r4.e0
            if (r0 != 0) goto L8
            int r0 = r4.n()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r0 = r4.m0()
            goto L52
        L11:
            r1 = 8
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r4.k0(r0)
            goto L52
        L1c:
            r1 = 9
            if (r0 != r1) goto L27
            r0 = 34
            java.lang.String r0 = r4.k0(r0)
            goto L52
        L27:
            r1 = 11
            if (r0 != r1) goto L31
            java.lang.String r0 = r4.h0
            r1 = 0
            r4.h0 = r1
            goto L52
        L31:
            r1 = 15
            if (r0 != r1) goto L3c
            long r0 = r4.f0
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L52
        L3c:
            r1 = 16
            if (r0 != r1) goto L62
            java.lang.String r0 = new java.lang.String
            int r1 = r4.X
            int r2 = r4.g0
            char[] r3 = r4.R
            r0.<init>(r3, r1, r2)
            int r1 = r4.X
            int r2 = r4.g0
            int r1 = r1 + r2
            r4.X = r1
        L52:
            r1 = 0
            r4.e0 = r1
            int[] r1 = r4.l0
            int r4 = r4.j0
            int r4 = r4 + (-1)
            r2 = r1[r4]
            int r2 = r2 + 1
            r1[r4] = r2
            return r0
        L62:
            java.lang.String r0 = "a string"
            java.lang.IllegalStateException r4 = r4.w0(r0)
            throw r4
    }

    public final java.lang.String m0() {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.X
            int r4 = r3 + r2
            int r5 = r7.Y
            char[] r6 = r7.R
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.k()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.v(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.X
            r0.append(r6, r3, r2)
            int r3 = r7.X
            int r3 = r3 + r2
            r7.X = r3
            r2 = 1
            boolean r2 = r7.v(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.X
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.X
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.X
            int r2 = r2 + r1
            r7.X = r2
            return r0
    }

    public final int n() {
            r26 = this;
            r0 = r26
            int[] r1 = r0.i0
            int r2 = r0.j0
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            r8 = 10
            r10 = 39
            r11 = 6
            r12 = 93
            r13 = 59
            r14 = 44
            r15 = 3
            r16 = 0
            char[] r6 = r0.R
            r7 = 4
            r9 = 5
            r20 = 7
            r5 = 2
            if (r4 != r3) goto L25
            r1[r2] = r5
            goto Le3
        L25:
            if (r4 != r5) goto L3f
            int r1 = r0.e0(r3)
            if (r1 == r14) goto Le3
            if (r1 == r13) goto L3a
            if (r1 != r12) goto L34
            r0.e0 = r7
            return r7
        L34:
            java.lang.String r1 = "Unterminated array"
            r0.v0(r1)
            throw r16
        L3a:
            r0.k()
            goto Le3
        L3f:
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r15) goto L45
            if (r4 != r9) goto L49
        L45:
            r21 = r7
            goto L2d7
        L49:
            if (r4 != r7) goto L7b
            r1[r2] = r9
            int r1 = r0.e0(r3)
            r2 = 58
            if (r1 == r2) goto Le3
            r2 = 61
            if (r1 != r2) goto L75
            r0.k()
            int r1 = r0.X
            int r2 = r0.Y
            if (r1 < r2) goto L68
            boolean r1 = r0.v(r3)
            if (r1 == 0) goto Le3
        L68:
            int r1 = r0.X
            char r2 = r6[r1]
            r5 = 62
            if (r2 != r5) goto Le3
            int r1 = r1 + r3
            r0.X = r1
            goto Le3
        L75:
            java.lang.String r1 = "Expected ':'"
            r0.v0(r1)
            throw r16
        L7b:
            if (r4 != r11) goto Lc5
            ls6 r1 = r0.B
            ls6 r2 = defpackage.ls6.LENIENT
            if (r1 != r2) goto Lbd
            r0.e0(r3)
            int r1 = r0.X
            int r2 = r1 + (-1)
            r0.X = r2
            int r1 = r1 + 4
            int r2 = r0.Y
            if (r1 <= r2) goto L99
            boolean r1 = r0.v(r9)
            if (r1 != 0) goto L99
            goto Lbd
        L99:
            int r1 = r0.X
            char r2 = r6[r1]
            r7 = 41
            if (r2 != r7) goto Lbd
            int r2 = r1 + 1
            char r2 = r6[r2]
            if (r2 != r12) goto Lbd
            int r2 = r1 + 2
            char r2 = r6[r2]
            if (r2 != r5) goto Lbd
            int r2 = r1 + 3
            char r2 = r6[r2]
            if (r2 != r10) goto Lbd
            int r2 = r1 + 4
            char r2 = r6[r2]
            if (r2 == r8) goto Lba
            goto Lbd
        Lba:
            int r1 = r1 + r9
            r0.X = r1
        Lbd:
            int[] r1 = r0.i0
            int r2 = r0.j0
            int r2 = r2 - r3
            r1[r2] = r20
            goto Le3
        Lc5:
            r1 = r20
            if (r4 != r1) goto Ldf
            r1 = 0
            int r2 = r0.e0(r1)
            r1 = -1
            if (r2 != r1) goto Ld6
            r1 = 17
            r0.e0 = r1
            return r1
        Ld6:
            r0.k()
            int r1 = r0.X
            int r1 = r1 - r3
            r0.X = r1
            goto Le3
        Ldf:
            r1 = 8
            if (r4 == r1) goto L2cf
        Le3:
            int r1 = r0.e0(r3)
            r2 = 34
            if (r1 == r2) goto L2ca
            if (r1 == r10) goto L2c2
            if (r1 == r14) goto L2a9
            if (r1 == r13) goto L2a9
            r2 = 91
            if (r1 == r2) goto L2a6
            if (r1 == r12) goto L29f
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L29b
            int r1 = r0.X
            int r1 = r1 - r3
            r0.X = r1
            char r1 = r6[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L12c
            r2 = 84
            if (r1 != r2) goto L10b
            goto L12c
        L10b:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L126
            r2 = 70
            if (r1 != r2) goto L114
            goto L126
        L114:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L120
            r2 = 78
            if (r1 != r2) goto L11d
            goto L120
        L11d:
            r1 = 0
            goto L186
        L120:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r4 = 7
            goto L131
        L126:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r4 = r11
            goto L131
        L12c:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r4 = r9
        L131:
            ls6 r5 = r0.B
            ls6 r7 = defpackage.ls6.STRICT
            if (r5 == r7) goto L139
            r5 = r3
            goto L13a
        L139:
            r5 = 0
        L13a:
            int r7 = r1.length()
            r10 = 0
        L13f:
            int r12 = r0.X
            int r13 = r0.Y
            if (r10 >= r7) goto L167
            int r12 = r12 + r10
            if (r12 < r13) goto L151
            int r12 = r10 + 1
            boolean r12 = r0.v(r12)
            if (r12 != 0) goto L151
            goto L11d
        L151:
            int r12 = r0.X
            int r12 = r12 + r10
            char r12 = r6[r12]
            char r13 = r1.charAt(r10)
            if (r12 == r13) goto L164
            if (r5 == 0) goto L11d
            char r13 = r2.charAt(r10)
            if (r12 != r13) goto L11d
        L164:
            int r10 = r10 + 1
            goto L13f
        L167:
            int r12 = r12 + r7
            if (r12 < r13) goto L172
            int r1 = r7 + 1
            boolean r1 = r0.v(r1)
            if (r1 == 0) goto L17e
        L172:
            int r1 = r0.X
            int r1 = r1 + r7
            char r1 = r6[r1]
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L17e
            goto L11d
        L17e:
            int r1 = r0.X
            int r1 = r1 + r7
            r0.X = r1
            r0.e0 = r4
            r1 = r4
        L186:
            if (r1 == 0) goto L189
            return r1
        L189:
            int r1 = r0.X
            int r2 = r0.Y
            r10 = r2
            r13 = r3
            r2 = 0
            r4 = 0
            r7 = 0
            r12 = 0
            r17 = 0
        L196:
            int r14 = r1 + r2
            if (r14 != r10) goto L1b1
            int r1 = r6.length
            if (r2 != r1) goto L1a0
        L19d:
            r9 = 0
            goto L280
        L1a0:
            int r1 = r2 + 1
            boolean r1 = r0.v(r1)
            if (r1 != 0) goto L1ad
            r24 = r4
        L1aa:
            r8 = 2
            goto L229
        L1ad:
            int r1 = r0.X
            int r10 = r0.Y
        L1b1:
            int r14 = r1 + r2
            char r14 = r6[r14]
            r8 = 43
            if (r14 == r8) goto L276
            r8 = 69
            if (r14 == r8) goto L26e
            r8 = 101(0x65, float:1.42E-43)
            if (r14 == r8) goto L26e
            r8 = 45
            if (r14 == r8) goto L264
            r8 = 46
            if (r14 == r8) goto L25f
            r8 = 48
            if (r14 < r8) goto L1d1
            r8 = 57
            if (r14 <= r8) goto L1d4
        L1d1:
            r24 = r4
            goto L222
        L1d4:
            if (r12 == r3) goto L21b
            if (r12 != 0) goto L1d9
            goto L21b
        L1d9:
            r8 = 2
            if (r12 != r8) goto L204
            int r8 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r8 != 0) goto L1e1
            goto L19d
        L1e1:
            r22 = 10
            long r22 = r22 * r4
            int r14 = r14 + (-48)
            r24 = r4
            long r3 = (long) r14
            long r22 = r22 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r3 > 0) goto L1fe
            if (r3 != 0) goto L1fc
            int r3 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r3 >= 0) goto L1fc
            goto L1fe
        L1fc:
            r3 = 0
            goto L1ff
        L1fe:
            r3 = 1
        L1ff:
            r13 = r13 & r3
            r4 = r22
            goto L279
        L204:
            r24 = r4
            if (r12 != r15) goto L20d
            r4 = r24
            r12 = 4
            goto L279
        L20d:
            if (r12 == r9) goto L216
            if (r12 != r11) goto L212
            goto L216
        L212:
            r4 = r24
            goto L279
        L216:
            r4 = r24
            r12 = 7
            goto L279
        L21b:
            int r14 = r14 + (-48)
            int r3 = -r14
            long r4 = (long) r3
            r12 = 2
            goto L279
        L222:
            boolean r1 = r0.J(r14)
            if (r1 != 0) goto L19d
            goto L1aa
        L229:
            if (r12 != r8) goto L250
            if (r13 == 0) goto L236
            r3 = -9223372036854775808
            int r1 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r1 != 0) goto L238
            if (r7 == 0) goto L236
            goto L238
        L236:
            r8 = 2
            goto L250
        L238:
            int r1 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r1 != 0) goto L23e
            if (r7 != 0) goto L236
        L23e:
            r4 = r24
            if (r7 == 0) goto L243
            goto L244
        L243:
            long r4 = -r4
        L244:
            r0.f0 = r4
            int r1 = r0.X
            int r1 = r1 + r2
            r0.X = r1
            r9 = 15
            r0.e0 = r9
            goto L280
        L250:
            if (r12 == r8) goto L258
            r1 = 4
            if (r12 == r1) goto L258
            r1 = 7
            if (r12 != r1) goto L19d
        L258:
            r0.g0 = r2
            r9 = 16
            r0.e0 = r9
            goto L280
        L25f:
            r3 = 2
            if (r12 != r3) goto L19d
            r12 = r15
            goto L279
        L264:
            r3 = 2
            if (r12 != 0) goto L26a
            r7 = 1
            r12 = 1
            goto L279
        L26a:
            if (r12 != r9) goto L19d
        L26c:
            r12 = r11
            goto L279
        L26e:
            r3 = 2
            if (r12 == r3) goto L274
            r3 = 4
            if (r12 != r3) goto L19d
        L274:
            r12 = r9
            goto L279
        L276:
            if (r12 != r9) goto L19d
            goto L26c
        L279:
            int r2 = r2 + 1
            r3 = 1
            r8 = 10
            goto L196
        L280:
            if (r9 == 0) goto L283
            return r9
        L283:
            int r1 = r0.X
            char r1 = r6[r1]
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L295
            r0.k()
            r1 = 10
            r0.e0 = r1
            return r1
        L295:
            java.lang.String r1 = "Expected value"
            r0.v0(r1)
            throw r16
        L29b:
            r8 = r3
            r0.e0 = r8
            return r8
        L29f:
            r8 = r3
            if (r4 != r8) goto L2aa
            r1 = 4
            r0.e0 = r1
            return r1
        L2a6:
            r0.e0 = r15
            return r15
        L2a9:
            r8 = r3
        L2aa:
            if (r4 == r8) goto L2b6
            r3 = 2
            if (r4 != r3) goto L2b0
            goto L2b6
        L2b0:
            java.lang.String r1 = "Unexpected value"
            r0.v0(r1)
            throw r16
        L2b6:
            r0.k()
            int r1 = r0.X
            int r1 = r1 - r8
            r0.X = r1
            r1 = 7
            r0.e0 = r1
            return r1
        L2c2:
            r0.k()
            r1 = 8
            r0.e0 = r1
            return r1
        L2ca:
            r1 = 9
            r0.e0 = r1
            return r1
        L2cf:
            java.lang.String r0 = "JsonReader is closed"
            defpackage.i.m(r0)
            r19 = 0
            return r19
        L2d7:
            r1[r2] = r21
            if (r4 != r9) goto L2f3
            r8 = 1
            int r1 = r0.e0(r8)
            if (r1 == r14) goto L2f3
            if (r1 == r13) goto L2f0
            if (r1 != r5) goto L2ea
            r8 = 2
            r0.e0 = r8
            return r8
        L2ea:
            java.lang.String r1 = "Unterminated object"
            r0.v0(r1)
            throw r16
        L2f0:
            r0.k()
        L2f3:
            r8 = 1
            int r1 = r0.e0(r8)
            r2 = 34
            if (r1 == r2) goto L32c
            if (r1 == r10) goto L324
            java.lang.String r2 = "Expected name"
            if (r1 == r5) goto L31a
            r0.k()
            int r3 = r0.X
            int r3 = r3 - r8
            r0.X = r3
            char r1 = (char) r1
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L316
            r1 = 14
            r0.e0 = r1
            return r1
        L316:
            r0.v0(r2)
            throw r16
        L31a:
            if (r4 == r9) goto L320
            r8 = 2
            r0.e0 = r8
            return r8
        L320:
            r0.v0(r2)
            throw r16
        L324:
            r0.k()
            r1 = 12
            r0.e0 = r1
            return r1
        L32c:
            r1 = 13
            r0.e0 = r1
            return r1
    }

    public defpackage.jf3 n0() {
            r1 = this;
            int r0 = r1.e0
            if (r0 != 0) goto L8
            int r0 = r1.n()
        L8:
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L1a;
                case 12: goto L17;
                case 13: goto L17;
                case 14: goto L17;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L11:
            jf3 r1 = defpackage.jf3.END_DOCUMENT
            return r1
        L14:
            jf3 r1 = defpackage.jf3.NUMBER
            return r1
        L17:
            jf3 r1 = defpackage.jf3.NAME
            return r1
        L1a:
            jf3 r1 = defpackage.jf3.STRING
            return r1
        L1d:
            jf3 r1 = defpackage.jf3.NULL
            return r1
        L20:
            jf3 r1 = defpackage.jf3.BOOLEAN
            return r1
        L23:
            jf3 r1 = defpackage.jf3.END_ARRAY
            return r1
        L26:
            jf3 r1 = defpackage.jf3.BEGIN_ARRAY
            return r1
        L29:
            jf3 r1 = defpackage.jf3.END_OBJECT
            return r1
        L2c:
            jf3 r1 = defpackage.jf3.BEGIN_OBJECT
            return r1
    }

    public final void o0(int r4) {
            r3 = this;
            int r0 = r3.j0
            int r1 = r0 + (-1)
            int r2 = r3.L
            if (r1 >= r2) goto L32
            int[] r1 = r3.i0
            int r2 = r1.length
            if (r0 != r2) goto L27
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.i0 = r1
            int[] r1 = r3.l0
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.l0 = r1
            java.lang.String[] r1 = r3.k0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.k0 = r0
        L27:
            int[] r0 = r3.i0
            int r1 = r3.j0
            int r2 = r1 + 1
            r3.j0 = r2
            r0[r1] = r4
            return
        L32:
            i04 r4 = new i04
            java.lang.String r0 = "Nesting limit "
            java.lang.String r1 = " reached"
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r2, r1)
            java.lang.String r3 = r3.N()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final char p0() {
            r9 = this;
            int r0 = r9.X
            int r1 = r9.Y
            r2 = 0
            java.lang.String r3 = "Unterminated escape sequence"
            r4 = 1
            if (r0 != r1) goto L15
            boolean r0 = r9.v(r4)
            if (r0 == 0) goto L11
            goto L15
        L11:
            r9.v0(r3)
            throw r2
        L15:
            int r0 = r9.X
            int r1 = r0 + 1
            r9.X = r1
            char[] r5 = r9.R
            char r6 = r5[r0]
            r7 = 10
            if (r6 == r7) goto Lb7
            r1 = 34
            if (r6 == r1) goto Lca
            r1 = 39
            if (r6 == r1) goto Lc4
            r1 = 47
            if (r6 == r1) goto Lca
            r1 = 92
            if (r6 == r1) goto Lca
            r1 = 98
            if (r6 == r1) goto Lb4
            r1 = 102(0x66, float:1.43E-43)
            if (r6 == r1) goto Lb1
            r4 = 110(0x6e, float:1.54E-43)
            if (r6 == r4) goto Lb0
            r4 = 114(0x72, float:1.6E-43)
            if (r6 == r4) goto Lad
            r4 = 116(0x74, float:1.63E-43)
            if (r6 == r4) goto Laa
            r4 = 117(0x75, float:1.64E-43)
            if (r6 != r4) goto La4
            int r0 = r0 + 5
            int r4 = r9.Y
            r6 = 4
            if (r0 <= r4) goto L5d
            boolean r0 = r9.v(r6)
            if (r0 == 0) goto L59
            goto L5d
        L59:
            r9.v0(r3)
            throw r2
        L5d:
            int r0 = r9.X
            int r3 = r0 + 4
            r4 = 0
        L62:
            if (r0 >= r3) goto L9d
            char r7 = r5[r0]
            int r4 = r4 << 4
            r8 = 48
            if (r7 < r8) goto L75
            r8 = 57
            if (r7 > r8) goto L75
            int r7 = r7 + (-48)
        L72:
            int r7 = r7 + r4
            r4 = r7
            goto L89
        L75:
            r8 = 97
            if (r7 < r8) goto L7e
            if (r7 > r1) goto L7e
            int r7 = r7 + (-87)
            goto L72
        L7e:
            r8 = 65
            if (r7 < r8) goto L8c
            r8 = 70
            if (r7 > r8) goto L8c
            int r7 = r7 + (-55)
            goto L72
        L89:
            int r0 = r0 + 1
            goto L62
        L8c:
            java.lang.String r0 = new java.lang.String
            int r1 = r9.X
            r0.<init>(r5, r1, r6)
            java.lang.String r1 = "Malformed Unicode escape \\u"
            java.lang.String r0 = r1.concat(r0)
            r9.v0(r0)
            throw r2
        L9d:
            int r0 = r9.X
            int r0 = r0 + r6
            r9.X = r0
            char r9 = (char) r4
            return r9
        La4:
            java.lang.String r0 = "Invalid escape sequence"
            r9.v0(r0)
            throw r2
        Laa:
            r9 = 9
            return r9
        Lad:
            r9 = 13
            return r9
        Lb0:
            return r7
        Lb1:
            r9 = 12
            return r9
        Lb4:
            r9 = 8
            return r9
        Lb7:
            ls6 r0 = r9.B
            ls6 r3 = defpackage.ls6.STRICT
            if (r0 == r3) goto Ld1
            int r0 = r9.Z
            int r0 = r0 + r4
            r9.Z = r0
            r9.d0 = r1
        Lc4:
            ls6 r0 = r9.B
            ls6 r1 = defpackage.ls6.STRICT
            if (r0 == r1) goto Lcb
        Lca:
            return r6
        Lcb:
            java.lang.String r0 = "Invalid escaped character \"'\" in strict mode"
            r9.v0(r0)
            throw r2
        Ld1:
            java.lang.String r0 = "Cannot escape a newline character in strict mode"
            r9.v0(r0)
            throw r2
    }

    public final void q0(defpackage.ls6 r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.B = r1
            return
    }

    public void r() {
            r3 = this;
            int r0 = r3.e0
            if (r0 != 0) goto L8
            int r0 = r3.n()
        L8:
            r1 = 4
            if (r0 != r1) goto L1f
            int r0 = r3.j0
            int r1 = r0 + (-1)
            r3.j0 = r1
            int[] r1 = r3.l0
            int r0 = r0 + (-2)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.e0 = r0
            return
        L1f:
            java.lang.String r0 = "END_ARRAY"
            java.lang.IllegalStateException r3 = r3.w0(r0)
            throw r3
    }

    public final void r0(char r6) {
            r5 = this;
        L0:
            int r0 = r5.X
            int r1 = r5.Y
        L4:
            r2 = 1
            if (r0 >= r1) goto L2d
            int r3 = r0 + 1
            char[] r4 = r5.R
            char r0 = r4[r0]
            if (r0 != r6) goto L12
            r5.X = r3
            return
        L12:
            r4 = 92
            if (r0 != r4) goto L20
            r5.X = r3
            r5.p0()
            int r0 = r5.X
            int r1 = r5.Y
            goto L4
        L20:
            r4 = 10
            if (r0 != r4) goto L2b
            int r0 = r5.Z
            int r0 = r0 + r2
            r5.Z = r0
            r5.d0 = r3
        L2b:
            r0 = r3
            goto L4
        L2d:
            r5.X = r0
            boolean r0 = r5.v(r2)
            if (r0 == 0) goto L36
            goto L0
        L36:
            java.lang.String r6 = "Unterminated string"
            r5.v0(r6)
            r5 = 0
            throw r5
    }

    public final void s0() {
            r4 = this;
        L0:
            int r0 = r4.X
            int r1 = r4.Y
            r2 = 1
            if (r0 < r1) goto Ld
            boolean r0 = r4.v(r2)
            if (r0 == 0) goto L27
        Ld:
            int r0 = r4.X
            int r1 = r0 + 1
            r4.X = r1
            char[] r3 = r4.R
            char r0 = r3[r0]
            r3 = 10
            if (r0 != r3) goto L23
            int r0 = r4.Z
            int r0 = r0 + r2
            r4.Z = r0
            r4.d0 = r1
            return
        L23:
            r1 = 13
            if (r0 != r1) goto L0
        L27:
            return
    }

    public final void t0() {
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.X
            int r2 = r1 + r0
            int r3 = r4.Y
            if (r2 >= r3) goto L51
            char[] r2 = r4.R
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.k()
        L4b:
            int r1 = r4.X
            int r1 = r1 + r0
            r4.X = r1
            return
        L51:
            int r1 = r1 + r0
            r4.X = r1
            r0 = 1
            boolean r0 = r4.v(r0)
            if (r0 != 0) goto L0
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r1.N()
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public void u() {
            r5 = this;
            int r0 = r5.e0
            if (r0 != 0) goto L8
            int r0 = r5.n()
        L8:
            r1 = 2
            if (r0 != r1) goto L23
            int r0 = r5.j0
            int r2 = r0 + (-1)
            r5.j0 = r2
            java.lang.String[] r3 = r5.k0
            r4 = 0
            r3[r2] = r4
            int[] r2 = r5.l0
            int r0 = r0 - r1
            r1 = r2[r0]
            int r1 = r1 + 1
            r2[r0] = r1
            r0 = 0
            r5.e0 = r0
            return
        L23:
            java.lang.String r0 = "END_OBJECT"
            java.lang.IllegalStateException r5 = r5.w0(r0)
            throw r5
    }

    public void u0() {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.e0
            if (r2 != 0) goto La
            int r2 = r7.n()
        La:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L6f;
                case 2: goto L5f;
                case 3: goto L59;
                case 4: goto L51;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L4d;
                case 9: goto L49;
                case 10: goto L45;
                case 11: goto L14;
                case 12: goto L38;
                case 13: goto L2b;
                case 14: goto L1e;
                case 15: goto L14;
                case 16: goto L16;
                case 17: goto L15;
                default: goto L14;
            }
        L14:
            goto L74
        L15:
            return
        L16:
            int r2 = r7.X
            int r3 = r7.g0
            int r2 = r2 + r3
            r7.X = r2
            goto L74
        L1e:
            r7.t0()
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.k0
            int r3 = r7.j0
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L2b:
            r7.r0(r4)
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.k0
            int r3 = r7.j0
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L38:
            r7.r0(r3)
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.k0
            int r3 = r7.j0
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L45:
            r7.t0()
            goto L74
        L49:
            r7.r0(r4)
            goto L74
        L4d:
            r7.r0(r3)
            goto L74
        L51:
            int r2 = r7.j0
            int r2 = r2 - r6
            r7.j0 = r2
        L56:
            int r1 = r1 + (-1)
            goto L74
        L59:
            r7.o0(r6)
        L5c:
            int r1 = r1 + 1
            goto L74
        L5f:
            if (r1 != 0) goto L69
            java.lang.String[] r2 = r7.k0
            int r3 = r7.j0
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L69:
            int r2 = r7.j0
            int r2 = r2 - r6
            r7.j0 = r2
            goto L56
        L6f:
            r2 = 3
            r7.o0(r2)
            goto L5c
        L74:
            r7.e0 = r0
            if (r1 > 0) goto L2
            int[] r0 = r7.l0
            int r7 = r7.j0
            int r7 = r7 - r6
            r1 = r0[r7]
            int r1 = r1 + r6
            r0[r7] = r1
            return
    }

    public final boolean v(int r8) {
            r7 = this;
            int r0 = r7.d0
            int r1 = r7.X
            int r0 = r0 - r1
            r7.d0 = r0
            int r0 = r7.Y
            r2 = 0
            char[] r3 = r7.R
            if (r0 == r1) goto L15
            int r0 = r0 - r1
            r7.Y = r0
            java.lang.System.arraycopy(r3, r1, r3, r2, r0)
            goto L17
        L15:
            r7.Y = r2
        L17:
            r7.X = r2
        L19:
            int r0 = r7.Y
            int r1 = r3.length
            int r1 = r1 - r0
            java.io.Reader r4 = r7.A
            int r0 = r4.read(r3, r0, r1)
            r1 = -1
            if (r0 == r1) goto L4b
            int r1 = r7.Y
            int r1 = r1 + r0
            r7.Y = r1
            int r0 = r7.Z
            r4 = 1
            if (r0 != 0) goto L48
            int r0 = r7.d0
            if (r0 != 0) goto L48
            if (r1 <= 0) goto L48
            char r5 = r3[r2]
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L48
            int r5 = r7.X
            int r5 = r5 + r4
            r7.X = r5
            int r0 = r0 + 1
            r7.d0 = r0
            int r8 = r8 + 1
        L48:
            if (r1 < r8) goto L19
            return r4
        L4b:
            return r2
    }

    public final void v0(java.lang.String r3) {
            r2 = this;
            i04 r0 = new i04
            java.lang.StringBuilder r3 = defpackage.lb1.s(r3)
            java.lang.String r2 = r2.N()
            r3.append(r2)
            java.lang.String r2 = "\nSee "
            r3.append(r2)
            java.lang.String r2 = "malformed-json"
            java.lang.String r1 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r1.concat(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
    }

    public final java.lang.IllegalStateException w0(java.lang.String r5) {
            r4 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r0 != r1) goto Lb
            java.lang.String r0 = "adapter-not-null-safe"
            goto Ld
        Lb:
            java.lang.String r0 = "unexpected-json-structure"
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Expected "
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r5 = defpackage.i61.t(r2, r5, r3)
            jf3 r2 = r4.n0()
            r5.append(r2)
            java.lang.String r4 = r4.N()
            r5.append(r4)
            java.lang.String r4 = "\nSee "
            r5.append(r4)
            java.lang.String r4 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r4 = r4.concat(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.<init>(r4)
            return r1
    }

    public java.lang.String x() {
            r1 = this;
            r0 = 0
            java.lang.String r1 = r1.A(r0)
            return r1
    }

    public final void x0(java.lang.String r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L1d
            char r1 = r4.charAt(r0)
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 > r2) goto L12
            int r0 = r0 + 1
            goto L1
        L12:
            java.lang.String r0 = "String contains non-ASCII characters: "
            java.lang.String r4 = r0.concat(r4)
            r3.v0(r4)
            r3 = 0
            throw r3
        L1d:
            return
    }
}
