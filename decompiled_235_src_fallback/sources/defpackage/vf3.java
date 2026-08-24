package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf3  reason: default package */
/* loaded from: classes.dex */
public class vf3 implements java.io.Closeable, java.io.Flushable {
    public static final java.util.regex.Pattern h0 = null;
    public static final java.lang.String[] i0 = null;
    public static final java.lang.String[] j0 = null;
    public final java.io.Writer A;
    public int[] B;
    public int L;
    public defpackage.ck2 R;
    public java.lang.String X;
    public java.lang.String Y;
    public boolean Z;
    public defpackage.ls6 d0;
    public boolean e0;
    public java.lang.String f0;
    public boolean g0;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.vf3.h0 = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.vf3.i0 = r0
            r0 = 0
        Lf:
            r1 = 31
            if (r0 > r1) goto L28
            java.lang.String[] r1 = defpackage.vf3.i0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lf
        L28:
            java.lang.String[] r0 = defpackage.vf3.i0
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            defpackage.vf3.j0 = r0
            r1 = 60
            java.lang.String r2 = "\\u003c"
            r0[r1] = r2
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public vf3(java.io.Writer r4) {
            r3 = this;
            r3.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r3.B = r0
            r1 = 0
            r3.L = r1
            int r2 = r0.length
            if (r2 != 0) goto L15
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.B = r0
        L15:
            int[] r0 = r3.B
            int r1 = r3.L
            int r2 = r1 + 1
            r3.L = r2
            r2 = 6
            r0[r1] = r2
            ls6 r0 = defpackage.ls6.LEGACY_STRICT
            r3.d0 = r0
            r0 = 1
            r3.g0 = r0
            java.lang.String r0 = "out == null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.A = r4
            ck2 r4 = defpackage.ck2.d
            r3.F(r4)
            return
    }

    public defpackage.vf3 A() {
            r2 = this;
            java.lang.String r0 = r2.f0
            if (r0 == 0) goto L10
            boolean r0 = r2.g0
            if (r0 == 0) goto Lc
            r2.j0()
            goto L10
        Lc:
            r0 = 0
            r2.f0 = r0
            return r2
        L10:
            r2.e()
            java.io.Writer r0 = r2.A
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    public final int D() {
            r1 = this;
            int r0 = r1.L
            if (r0 == 0) goto Lb
            int[] r1 = r1.B
            int r0 = r0 + (-1)
            r1 = r1[r0]
            return r1
        Lb:
            java.lang.String r1 = "JsonWriter is closed."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final void F(defpackage.ck2 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            r1.R = r2
            java.lang.String r0 = ","
            r1.Y = r0
            boolean r0 = r2.c
            if (r0 == 0) goto L1e
            java.lang.String r0 = ": "
            r1.X = r0
            java.lang.String r2 = r2.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            java.lang.String r2 = ", "
            r1.Y = r2
            goto L22
        L1e:
            java.lang.String r2 = ":"
            r1.X = r2
        L22:
            ck2 r2 = r1.R
            java.lang.String r2 = r2.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            ck2 r2 = r1.R
            java.lang.String r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            r1.Z = r2
            return
    }

    public final void J(defpackage.ls6 r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.d0 = r1
            return
    }

    public final void N(java.lang.String r8) {
            r7 = this;
            boolean r0 = r7.e0
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.vf3.j0
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.vf3.i0
        L9:
            java.io.Writer r7 = r7.A
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
    }

    public void U(double r3) {
            r2 = this;
            r2.j0()
            ls6 r0 = r2.d0
            ls6 r1 = defpackage.ls6.LENIENT
            if (r0 == r1) goto L2a
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L16
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L16
            goto L2a
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Numeric values must be finite, but was "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L2a:
            r2.e()
            java.io.Writer r2 = r2.A
            java.lang.String r3 = java.lang.Double.toString(r3)
            r2.append(r3)
            return
    }

    public void X(long r1) {
            r0 = this;
            r0.j0()
            r0.e()
            java.io.Writer r0 = r0.A
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.write(r1)
            return
    }

    public void Z(java.lang.Boolean r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.A()
            return
        L6:
            r0.j0()
            r0.e()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L15
            java.lang.String r1 = "true"
            goto L17
        L15:
            java.lang.String r1 = "false"
        L17:
            java.io.Writer r0 = r0.A
            r0.write(r1)
            return
    }

    public void a0(java.lang.Number r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.A()
            return
        L6:
            r2.j0()
            java.lang.String r0 = r3.toString()
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r3 == r1) goto L79
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r3 == r1) goto L79
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r3 == r1) goto L79
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r3 == r1) goto L79
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r3 == r1) goto L79
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r3 == r1) goto L79
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r3 == r1) goto L79
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r3 != r1) goto L32
            goto L79
        L32:
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4b
            goto L68
        L4b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r3 == r1) goto L79
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r3 == r1) goto L79
            java.util.regex.Pattern r1 = defpackage.vf3.h0
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L60
            goto L79
        L60:
            java.lang.String r2 = "String created by "
            java.lang.String r1 = " is not a valid JSON number: "
            defpackage.fa6.f(r2, r3, r1, r0)
            return
        L68:
            ls6 r3 = r2.d0
            ls6 r1 = defpackage.ls6.LENIENT
            if (r3 != r1) goto L6f
            goto L79
        L6f:
            java.lang.String r2 = "Numeric values must be finite, but was "
            java.lang.String r2 = r2.concat(r0)
            defpackage.i.h(r2)
            return
        L79:
            r2.e()
            java.io.Writer r2 = r2.A
            r2.append(r0)
            return
    }

    public void c0(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.A()
            return
        L6:
            r0.j0()
            r0.e()
            r0.N(r1)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.A
            r0.close()
            int r0 = r3.L
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.B
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.L = r0
            return
        L18:
            java.lang.String r3 = "Incomplete document"
            defpackage.e41.i(r3)
            return
    }

    public final void e() {
            r4 = this;
            int r0 = r4.D()
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L47
            java.io.Writer r3 = r4.A
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 == r1) goto L30
            r1 = 6
            r3 = 7
            if (r0 == r1) goto L28
            if (r0 != r3) goto L22
            ls6 r0 = r4.d0
            ls6 r1 = defpackage.ls6.LENIENT
            if (r0 != r1) goto L1c
            goto L28
        L1c:
            java.lang.String r4 = "JSON must have only one top-level value."
            defpackage.i.m(r4)
            return
        L22:
            java.lang.String r4 = "Nesting problem."
            defpackage.i.m(r4)
            return
        L28:
            int[] r0 = r4.B
            int r4 = r4.L
            int r4 = r4 - r2
            r0[r4] = r3
            return
        L30:
            java.lang.String r0 = r4.X
            r3.append(r0)
            int[] r0 = r4.B
            int r4 = r4.L
            int r4 = r4 - r2
            r1 = 5
            r0[r4] = r1
            return
        L3e:
            java.lang.String r0 = r4.Y
            r3.append(r0)
            r4.x()
            return
        L47:
            int[] r0 = r4.B
            int r3 = r4.L
            int r3 = r3 - r2
            r0[r3] = r1
            r4.x()
            return
    }

    public void e0(boolean r1) {
            r0 = this;
            r0.j0()
            r0.e()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "true"
            goto Ld
        Lb:
            java.lang.String r1 = "false"
        Ld:
            java.io.Writer r0 = r0.A
            r0.write(r1)
            return
    }

    public void flush() {
            r1 = this;
            int r0 = r1.L
            if (r0 == 0) goto La
            java.io.Writer r1 = r1.A
            r1.flush()
            return
        La:
            java.lang.String r1 = "JsonWriter is closed."
            defpackage.i.m(r1)
            return
    }

    public void h() {
            r3 = this;
            r3.j0()
            r3.e()
            int r0 = r3.L
            int[] r1 = r3.B
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.B = r0
        L15:
            int[] r0 = r3.B
            int r1 = r3.L
            int r2 = r1 + 1
            r3.L = r2
            r2 = 1
            r0[r1] = r2
            java.io.Writer r3 = r3.A
            r0 = 91
            r3.write(r0)
            return
    }

    public final void j0() {
            r3 = this;
            java.lang.String r0 = r3.f0
            if (r0 == 0) goto L30
            int r0 = r3.D()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r3.A
            java.lang.String r1 = r3.Y
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L2b
        L16:
            r3.x()
            int[] r0 = r3.B
            int r1 = r3.L
            int r1 = r1 + (-1)
            r2 = 4
            r0[r1] = r2
            java.lang.String r0 = r3.f0
            r3.N(r0)
            r0 = 0
            r3.f0 = r0
            return
        L2b:
            java.lang.String r3 = "Nesting problem."
            defpackage.i.m(r3)
        L30:
            return
    }

    public void k() {
            r3 = this;
            r3.j0()
            r3.e()
            int r0 = r3.L
            int[] r1 = r3.B
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.B = r0
        L15:
            int[] r0 = r3.B
            int r1 = r3.L
            int r2 = r1 + 1
            r3.L = r2
            r2 = 3
            r0[r1] = r2
            java.io.Writer r3 = r3.A
            r0 = 123(0x7b, float:1.72E-43)
            r3.write(r0)
            return
    }

    public final void n(char r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.D()
            if (r0 == r4) goto Lf
            if (r0 != r3) goto L9
            goto Lf
        L9:
            java.lang.String r1 = "Nesting problem."
            defpackage.i.m(r1)
            return
        Lf:
            java.lang.String r3 = r1.f0
            if (r3 != 0) goto L24
            int r3 = r1.L
            int r3 = r3 + (-1)
            r1.L = r3
            if (r0 != r4) goto L1e
            r1.x()
        L1e:
            java.io.Writer r1 = r1.A
            r1.write(r2)
            return
        L24:
            java.lang.String r2 = "Dangling name: "
            java.lang.String r1 = r1.f0
            defpackage.e41.z(r1, r2)
            return
    }

    public void r() {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            r3.n(r1, r2, r0)
            return
    }

    public void u() {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            r3.n(r1, r2, r0)
            return
    }

    public void v(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = r2.f0
            if (r0 != 0) goto L1d
            int r0 = r2.D()
            r1 = 3
            if (r0 == r1) goto L1a
            r1 = 5
            if (r0 != r1) goto L14
            goto L1a
        L14:
            java.lang.String r2 = "Please begin an object before writing a name."
            defpackage.i.m(r2)
            return
        L1a:
            r2.f0 = r3
            return
        L1d:
            java.lang.String r2 = "Already wrote a name, expecting a value."
            defpackage.i.m(r2)
            return
    }

    public final void x() {
            r4 = this;
            boolean r0 = r4.Z
            if (r0 == 0) goto L5
            goto L1d
        L5:
            ck2 r0 = r4.R
            java.lang.String r0 = r0.a
            java.io.Writer r1 = r4.A
            r1.write(r0)
            int r0 = r4.L
            r2 = 1
        L11:
            if (r2 >= r0) goto L1d
            ck2 r3 = r4.R
            java.lang.String r3 = r3.b
            r1.write(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            return
    }
}
