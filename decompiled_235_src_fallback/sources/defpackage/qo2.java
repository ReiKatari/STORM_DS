package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo2  reason: default package */
/* loaded from: classes.dex */
public abstract class qo2 {
    public static final /* synthetic */ int a = 0;

    public static defpackage.ac4 B(defpackage.ap7 r3) {
            m9 r0 = defpackage.bc4.a
            h71 r1 = defpackage.h71.b
            r0.getClass()
            r1.getClass()
            eb r2 = new eb
            r2.<init>(r3, r0, r1)
            java.lang.Class<ac4> r3 = defpackage.ac4.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r0 = r3.b()
            if (r0 == 0) goto L28
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r1.concat(r0)
            qo7 r3 = r2.G(r3, r0)
            ac4 r3 = (defpackage.ac4) r3
            return r3
        L28:
            java.lang.String r3 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public static defpackage.rb6 C(defpackage.eo2 r1) {
            rb6 r0 = new rb6
            r0.<init>()
            r41 r1 = defpackage.np2.F(r1, r0, r0)
            r0.R = r1
            return r0
    }

    public static java.math.BigDecimal D(java.lang.String r5) {
            n(r5)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r5)
            int r1 = r0.scale()
            long r1 = (long) r1
            long r1 = java.lang.Math.abs(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            return r0
        L18:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number has unsupported scale: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    public static android.graphics.PorterDuff.Mode E(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public static final java.util.List G(defpackage.j36 r10) {
            java.lang.String r0 = "id"
            int r0 = defpackage.ej2.s(r10, r0)
            java.lang.String r1 = "seq"
            int r1 = defpackage.ej2.s(r10, r1)
            java.lang.String r2 = "from"
            int r2 = defpackage.ej2.s(r10, r2)
            java.lang.String r3 = "to"
            int r3 = defpackage.ej2.s(r10, r3)
            kw3 r4 = defpackage.hf.I()
        L1c:
            boolean r5 = r10.f0()
            if (r5 == 0) goto L3d
            yj2 r5 = new yj2
            long r6 = r10.getLong(r0)
            int r6 = (int) r6
            long r7 = r10.getLong(r1)
            int r7 = (int) r7
            java.lang.String r8 = r10.R(r2)
            java.lang.String r9 = r10.R(r3)
            r5.<init>(r8, r6, r7, r9)
            r4.add(r5)
            goto L1c
        L3d:
            kw3 r10 = defpackage.hf.A(r4)
            java.util.List r10 = defpackage.gt0.c1(r10)
            return r10
    }

    public static final defpackage.py6 H(defpackage.e36 r13, java.lang.String r14, boolean r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            j36 r13 = r13.i0(r0)
            java.lang.String r0 = "seqno"
            int r0 = defpackage.ej2.s(r13, r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "cid"
            int r1 = defpackage.ej2.s(r13, r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "name"
            int r2 = defpackage.ej2.s(r13, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "desc"
            int r3 = defpackage.ej2.s(r13, r3)     // Catch: java.lang.Throwable -> L69
            r4 = -1
            r5 = 0
            if (r0 == r4) goto Lf6
            if (r1 == r4) goto Lf6
            if (r2 == r4) goto Lf6
            if (r3 != r4) goto L3b
            goto Lf6
        L3b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L69
            r6.<init>()     // Catch: java.lang.Throwable -> L69
        L45:
            boolean r7 = r13.f0()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L7d
            long r7 = r13.getLong(r1)     // Catch: java.lang.Throwable -> L69
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L69
            if (r7 >= 0) goto L53
            goto L45
        L53:
            long r7 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L69
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L69
            java.lang.String r8 = r13.R(r2)     // Catch: java.lang.Throwable -> L69
            long r9 = r13.getLong(r3)     // Catch: java.lang.Throwable -> L69
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L6c
            java.lang.String r9 = "DESC"
            goto L6e
        L69:
            r14 = move-exception
            goto Lfa
        L6c:
            java.lang.String r9 = "ASC"
        L6e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            r4.put(r10, r8)     // Catch: java.lang.Throwable -> L69
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            r6.put(r7, r9)     // Catch: java.lang.Throwable -> L69
            goto L45
        L7d:
            java.util.Set r0 = r4.entrySet()     // Catch: java.lang.Throwable -> L69
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L69
            tp5 r1 = new tp5     // Catch: java.lang.Throwable -> L69
            r2 = 6
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = defpackage.gt0.d1(r0, r1)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r2 = 10
            int r3 = defpackage.ht0.v0(r0, r2)     // Catch: java.lang.Throwable -> L69
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        L9c:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L69
            r1.add(r3)     // Catch: java.lang.Throwable -> L69
            goto L9c
        Lb2:
            java.util.List r0 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L69
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L69
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L69
            tp5 r3 = new tp5     // Catch: java.lang.Throwable -> L69
            r4 = 7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L69
            java.util.List r1 = defpackage.gt0.d1(r1, r3)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            int r2 = defpackage.ht0.v0(r1, r2)     // Catch: java.lang.Throwable -> L69
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        Ld3:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L69
            r3.add(r2)     // Catch: java.lang.Throwable -> L69
            goto Ld3
        Le9:
            java.util.List r1 = defpackage.gt0.k1(r3)     // Catch: java.lang.Throwable -> L69
            py6 r2 = new py6     // Catch: java.lang.Throwable -> L69
            r2.<init>(r14, r15, r0, r1)     // Catch: java.lang.Throwable -> L69
            defpackage.lb4.p(r13, r5)
            return r2
        Lf6:
            defpackage.lb4.p(r13, r5)
            return r5
        Lfa:
            throw r14     // Catch: java.lang.Throwable -> Lfb
        Lfb:
            r15 = move-exception
            defpackage.lb4.p(r13, r14)
            throw r15
    }

    public static final java.lang.Object I(java.lang.Object[] r7, defpackage.on2 r8, defpackage.px0 r9, int r10) {
            int r0 = r7.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r0)
            ap3 r2 = defpackage.jw2.A
            int r7 = r10 << 6
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r5 = r7 | 384(0x180, float:5.38E-43)
            r6 = 0
            r3 = r8
            r4 = r9
            java.lang.Object r7 = K(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final java.lang.Object J(java.lang.Object[] r7, defpackage.j56 r8, defpackage.on2 r9, defpackage.px0 r10, int r11) {
            int r0 = r7.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r0)
            int r7 = r11 << 3
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r11 = 384(0x180, float:5.38E-43)
            r5 = r11 | r7
            r6 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r7 = K(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final java.lang.Object K(java.lang.Object[] r10, defpackage.j56 r11, defpackage.on2 r12, defpackage.px0 r13, int r14, int r15) {
            xq2 r13 = (defpackage.xq2) r13
            long r0 = r13.T
            r15 = 36
            defpackage.g04.y(r15)
            java.lang.String r5 = java.lang.Long.toString(r0, r15)
            r5.getClass()
            r11.getClass()
            nq6 r15 = defpackage.s46.a
            java.lang.Object r15 = r13.j(r15)
            r4 = r15
            q46 r4 = (defpackage.q46) r4
            java.lang.Object r15 = r13.P()
            r0 = 0
            vs0 r1 = defpackage.ox0.a
            if (r15 != r1) goto L46
            if (r4 == 0) goto L32
            java.lang.Object r15 = r4.e(r5)
            if (r15 == 0) goto L32
            java.lang.Object r15 = r11.c(r15)
            goto L33
        L32:
            r15 = r0
        L33:
            if (r15 != 0) goto L39
            java.lang.Object r15 = r12.c()
        L39:
            r6 = r15
            n46 r2 = new n46
            r7 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r13.l0(r2)
            r15 = r2
            goto L48
        L46:
            r7 = r10
            r3 = r11
        L48:
            n46 r15 = (defpackage.n46) r15
            java.lang.Object[] r10 = r15.X
            boolean r10 = java.util.Arrays.equals(r7, r10)
            if (r10 == 0) goto L54
            java.lang.Object r0 = r15.R
        L54:
            if (r0 != 0) goto L5a
            java.lang.Object r0 = r12.c()
        L5a:
            boolean r10 = r13.h(r15)
            r11 = r14 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r12 = 32
            if (r11 <= r12) goto L6c
            boolean r11 = r13.h(r3)
            if (r11 != 0) goto L70
        L6c:
            r11 = r14 & 48
            if (r11 != r12) goto L72
        L70:
            r11 = 1
            goto L73
        L72:
            r11 = 0
        L73:
            r10 = r10 | r11
            boolean r11 = r13.h(r4)
            r10 = r10 | r11
            boolean r11 = r13.f(r5)
            r10 = r10 | r11
            boolean r11 = r13.h(r0)
            r10 = r10 | r11
            boolean r11 = r13.h(r7)
            r10 = r10 | r11
            java.lang.Object r11 = r13.P()
            if (r10 != 0) goto L93
            if (r11 != r1) goto L91
            goto L93
        L91:
            r7 = r0
            goto La3
        L93:
            cj5 r2 = new cj5
            r9 = 0
            r6 = r5
            r8 = r7
            r7 = r0
            r5 = r4
            r4 = r3
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r13.l0(r2)
            r11 = r2
        La3:
            on2 r11 = (defpackage.on2) r11
            defpackage.mb3.n(r11, r13)
            return r7
    }

    public static final void L(java.lang.Object[] r1, int r2, int r3) {
            r1.getClass()
        L3:
            if (r2 >= r3) goto Lb
            r0 = 0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L3
        Lb:
            return
    }

    public static android.util.TypedValue M(android.content.Context r2, int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public static boolean N(android.content.Context r1, int r2, boolean r3) {
            android.util.TypedValue r1 = M(r1, r2)
            if (r1 == 0) goto L14
            int r2 = r1.type
            r0 = 18
            if (r2 != r0) goto L14
            int r1 = r1.data
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
        L14:
            return r3
    }

    public static android.util.TypedValue O(android.content.Context r1, int r2, java.lang.String r3) {
            android.util.TypedValue r0 = M(r1, r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.String P(android.content.Context r1, java.lang.Boolean r2, boolean r3) {
            if (r2 != 0) goto L13
            if (r3 == 0) goto L8
            r2 = 2131952463(0x7f13034f, float:1.954137E38)
            goto Lb
        L8:
            r2 = 2131952462(0x7f13034e, float:1.9541367E38)
        Lb:
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            if (r3 == 0) goto L21
            r2 = 2131952453(0x7f130345, float:1.954135E38)
            goto L24
        L21:
            r2 = 2131952454(0x7f130346, float:1.9541351E38)
        L24:
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
        L2c:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3f
            r2 = 2131952452(0x7f130344, float:1.9541347E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
        L3f:
            defpackage.i.d()
            r1 = 0
            return r1
    }

    public static final long Q(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Math.round(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = java.lang.Math.round(r6)
            long r4 = (long) r1
            long r0 = r4 << r0
            long r6 = (long) r6
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static final long R(long r2, defpackage.hn3 r4) {
            hn3 r0 = defpackage.hn3.Horizontal
            if (r4 != r0) goto L19
            int r4 = defpackage.q21.j(r2)
            int r0 = defpackage.q21.h(r2)
            int r1 = defpackage.q21.i(r2)
            int r2 = defpackage.q21.g(r2)
            long r2 = defpackage.s21.a(r4, r0, r1, r2)
            return r2
        L19:
            int r4 = defpackage.q21.i(r2)
            int r0 = defpackage.q21.g(r2)
            int r1 = defpackage.q21.j(r2)
            int r2 = defpackage.q21.h(r2)
            long r2 = defpackage.s21.a(r4, r0, r1, r2)
            return r2
    }

    public static final long S(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = (float) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = (float) r6
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r0 = r4 << r0
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static final defpackage.ze7 T(int r1, java.lang.String r2) {
            mf7 r1 = U(r1, r2)
            if (r1 == 0) goto L1c
            int r1 = r1.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r1
            r0 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r2 = java.lang.Integer.compare(r2, r0)
            if (r2 <= 0) goto L15
            goto L1c
        L15:
            byte r1 = (byte) r1
            ze7 r2 = new ze7
            r2.<init>(r1)
            return r2
        L1c:
            r1 = 0
            return r1
    }

    public static final defpackage.mf7 U(int r12, java.lang.String r13) {
            defpackage.g04.y(r12)
            int r0 = r13.length()
            if (r0 != 0) goto La
            goto L5c
        La:
            r1 = 0
            char r2 = r13.charAt(r1)
            r3 = 48
            int r3 = defpackage.nb3.p(r2, r3)
            if (r3 >= 0) goto L1f
            r3 = 1
            if (r0 == r3) goto L5c
            r4 = 43
            if (r2 == r4) goto L20
            goto L5c
        L1f:
            r3 = r1
        L20:
            r2 = 119304647(0x71c71c7, float:1.1769572E-34)
            r4 = r2
        L24:
            if (r3 >= r0) goto L62
            char r5 = r13.charAt(r3)
            int r5 = java.lang.Character.digit(r5, r12)
            if (r5 >= 0) goto L31
            goto L5c
        L31:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r1 ^ r6
            r8 = r4 ^ r6
            int r8 = java.lang.Integer.compare(r7, r8)
            if (r8 <= 0) goto L51
            if (r4 != r2) goto L5c
            long r8 = (long) r12
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r10 = r10 / r8
            int r4 = (int) r10
            r8 = r4 ^ r6
            int r7 = java.lang.Integer.compare(r7, r8)
            if (r7 <= 0) goto L51
            goto L5c
        L51:
            int r1 = r1 * r12
            int r5 = r5 + r1
            r7 = r5 ^ r6
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.compare(r7, r1)
            if (r1 >= 0) goto L5e
        L5c:
            r12 = 0
            return r12
        L5e:
            int r3 = r3 + 1
            r1 = r5
            goto L24
        L62:
            mf7 r12 = new mf7
            r12.<init>(r1)
            return r12
    }

    public static final defpackage.rf7 V(java.lang.String r16) {
            r0 = r16
            r0.getClass()
            r1 = 10
            defpackage.g04.y(r1)
            int r2 = r0.length()
            if (r2 != 0) goto L11
            goto L71
        L11:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = defpackage.nb3.p(r4, r5)
            if (r5 >= 0) goto L26
            r3 = 1
            if (r2 == r3) goto L71
            r5 = 43
            if (r4 == r5) goto L26
            goto L71
        L26:
            r4 = 0
            r6 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r8 = r6
        L2e:
            if (r3 >= r2) goto L7a
            char r10 = r0.charAt(r3)
            int r10 = java.lang.Character.digit(r10, r1)
            if (r10 >= 0) goto L3b
            goto L71
        L3b:
            r11 = -9223372036854775808
            long r13 = r4 ^ r11
            r15 = r2
            long r1 = r8 ^ r11
            int r1 = java.lang.Long.compare(r13, r1)
            if (r1 <= 0) goto L5d
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L71
            r1 = -7378697629483820647(0x9999999999999999, double:-2.353437368264535E-185)
            int r1 = java.lang.Long.compare(r13, r1)
            if (r1 <= 0) goto L58
            goto L71
        L58:
            r8 = 1844674407370955161(0x1999999999999999, double:2.353437368264535E-185)
        L5d:
            r1 = 10
            long r4 = r4 * r1
            long r1 = (long) r10
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r13
            long r1 = r1 + r4
            long r13 = r1 ^ r11
            long r4 = r4 ^ r11
            int r4 = java.lang.Long.compare(r13, r4)
            if (r4 >= 0) goto L73
        L71:
            r0 = 0
            return r0
        L73:
            int r3 = r3 + 1
            r4 = r1
            r2 = r15
            r1 = 10
            goto L2e
        L7a:
            rf7 r0 = new rf7
            r0.<init>(r4)
            return r0
    }

    public static final void W(int r4, int r5) {
            r0 = 0
            r1 = 1
            if (r4 <= 0) goto L8
            if (r5 <= 0) goto L8
            r2 = r1
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 != 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "both minLines "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " and maxLines "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " must be greater than zero"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            defpackage.s53.a(r2)
        L29:
            if (r4 > r5) goto L2c
            r0 = r1
        L2c:
            if (r0 != 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "minLines "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " must be less than or equal to maxLines "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            defpackage.s53.a(r4)
        L47:
            return
    }

    public static final java.lang.Object X(defpackage.r41 r3, defpackage.qn2 r4, defpackage.m16 r5) {
            w81 r0 = new w81
            r1 = 0
            r0.<init>(r4, r1)
            l61 r4 = r3.b()
            w31 r2 = defpackage.b97.B
            j61 r4 = r4.Z(r2)
            b97 r4 = (defpackage.b97) r4
            if (r4 == 0) goto L17
            n61 r4 = r4.A
            goto L18
        L17:
            r4 = r1
        L18:
            if (r4 == 0) goto L1f
            java.lang.Object r3 = defpackage.hv.d0(r4, r0, r3)
            return r3
        L1f:
            rj0 r4 = new rj0
            r41 r3 = defpackage.np2.V(r3)
            r2 = 1
            r4.<init>(r2, r3)
            r4.v()
            zb6 r3 = r5.d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            if (r3 == 0) goto L3c
            h15 r1 = new h15     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            r2 = 3
            r1.<init>(r4, r5, r0, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            r3.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            goto L4c
        L3a:
            r3 = move-exception
            goto L42
        L3c:
            java.lang.String r3 = "internalTransactionExecutor"
            defpackage.nb3.a0(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            throw r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to acquire a thread to perform the database transaction."
            r5.<init>(r0, r3)
            r4.w(r5)
        L4c:
            java.lang.Object r3 = r4.s()
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            return r3
    }

    public static final void a(defpackage.a74 r67, defpackage.lq4 r68, defpackage.pq5 r69, defpackage.zt5 r70, defpackage.qn2 r71, defpackage.on2 r72, defpackage.px0 r73, int r74) {
            r1 = r67
            r2 = r68
            r4 = r70
            r10 = r71
            r0 = r72
            r14 = r73
            xq2 r14 = (defpackage.xq2) r14
            r3 = -1491308090(0xffffffffa71c71c6, float:-2.1711026E-15)
            r14.d0(r3)
            boolean r3 = r14.f(r1)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r74 | r3
            boolean r6 = r14.f(r2)
            r15 = 16
            if (r6 == 0) goto L2a
            r6 = 32
            goto L2b
        L2a:
            r6 = r15
        L2b:
            r3 = r3 | r6
            r11 = r69
            boolean r6 = r14.h(r11)
            if (r6 == 0) goto L37
            r6 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r6 = 128(0x80, float:1.8E-43)
        L39:
            r3 = r3 | r6
            boolean r6 = r14.h(r4)
            if (r6 == 0) goto L43
            r6 = 2048(0x800, float:2.87E-42)
            goto L45
        L43:
            r6 = 1024(0x400, float:1.435E-42)
        L45:
            r3 = r3 | r6
            boolean r6 = r14.h(r10)
            if (r6 == 0) goto L4f
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L51
        L4f:
            r6 = 8192(0x2000, float:1.148E-41)
        L51:
            r3 = r3 | r6
            boolean r6 = r14.h(r0)
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r6 == 0) goto L5c
            r6 = r7
            goto L5e
        L5c:
            r6 = 65536(0x10000, float:9.1835E-41)
        L5e:
            r3 = r3 | r6
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r3
            r8 = 74898(0x12492, float:1.04954E-40)
            r13 = 0
            if (r6 == r8) goto L6b
            r6 = 1
            goto L6c
        L6b:
            r6 = r13
        L6c:
            r8 = r3 & 1
            boolean r6 = r14.S(r8, r6)
            if (r6 == 0) goto L5d5
            nq6 r6 = defpackage.kf.b
            java.lang.Object r6 = r14.j(r6)
            android.content.Context r6 = (android.content.Context) r6
            j37 r8 = defpackage.mp2.T(r14)
            mi6 r16 = defpackage.jx2.J(r14)
            mi6 r17 = defpackage.jx2.J(r14)
            mi6 r28 = defpackage.jx2.J(r14)
            mi6 r29 = defpackage.jx2.J(r14)
            mi6 r18 = defpackage.jx2.J(r14)
            mi6 r20 = defpackage.jx2.J(r14)
            mi6 r22 = defpackage.jx2.J(r14)
            r19 = r15
            mi6 r15 = defpackage.jx2.J(r14)
            mi6 r30 = defpackage.jx2.J(r14)
            j37 r25 = defpackage.mp2.T(r14)
            j37 r27 = defpackage.mp2.T(r14)
            c9 r5 = new c9
            r12 = 5
            r5.<init>(r12)
            r23 = 458752(0x70000, float:6.42848E-40)
            r9 = r3 & r23
            if (r9 != r7) goto Lbc
            r7 = 1
            goto Lbd
        Lbc:
            r7 = r13
        Lbd:
            java.lang.Object r9 = r14.P()
            r23 = r8
            vs0 r8 = defpackage.ox0.a
            if (r7 != 0) goto Lc9
            if (r9 != r8) goto Ld1
        Lc9:
            mn0 r9 = new mn0
            r9.<init>(r12, r0)
            r14.l0(r9)
        Ld1:
            qn2 r9 = (defpackage.qn2) r9
            j04 r31 = defpackage.l.K(r5, r9, r14, r13)
            c9 r5 = new c9
            r5.<init>(r12)
            r7 = 57344(0xe000, float:8.0356E-41)
            r9 = r3 & r7
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r3) goto Le7
            r3 = 1
            goto Le8
        Le7:
            r3 = r13
        Le8:
            java.lang.Object r7 = r14.P()
            if (r3 != 0) goto Lf0
            if (r7 != r8) goto Lfa
        Lf0:
            y00 r7 = new y00
            r3 = 15
            r7.<init>(r3, r10)
            r14.l0(r7)
        Lfa:
            qn2 r7 = (defpackage.qn2) r7
            j04 r32 = defpackage.l.K(r5, r7, r14, r13)
            zj1 r3 = new zj1
            sv4 r5 = defpackage.sv4.READ
            r7 = 1
            r3.<init>(r5, r7)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r5) goto L10e
            r5 = 1
            goto L10f
        L10e:
            r5 = r13
        L10f:
            java.lang.Object r7 = r14.P()
            r12 = 17
            if (r5 != 0) goto L119
            if (r7 != r8) goto L121
        L119:
            y00 r7 = new y00
            r7.<init>(r12, r10)
            r14.l0(r7)
        L121:
            qn2 r7 = (defpackage.qn2) r7
            j04 r33 = defpackage.l.K(r3, r7, r14, r13)
            zj1 r3 = new zj1
            sv4 r5 = defpackage.sv4.READ_WRITE
            r7 = 1
            r3.<init>(r5, r7)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r5) goto L135
            r7 = 1
            goto L136
        L135:
            r7 = r13
        L136:
            java.lang.Object r5 = r14.P()
            r13 = 18
            if (r7 != 0) goto L140
            if (r5 != r8) goto L148
        L140:
            y00 r5 = new y00
            r5.<init>(r13, r10)
            r14.l0(r5)
        L148:
            qn2 r5 = (defpackage.qn2) r5
            r7 = 0
            j04 r34 = defpackage.l.K(r3, r5, r14, r7)
            r3 = 2130903069(0x7f03001d, float:1.7412946E38)
            java.lang.String[] r3 = defpackage.yh2.M(r14, r3)
            r5 = 2130903070(0x7f03001e, float:1.7412948E38)
            java.lang.String[] r5 = defpackage.yh2.M(r14, r5)
            r7 = 2130903083(0x7f03002b, float:1.7412974E38)
            java.lang.String[] r35 = defpackage.yh2.M(r14, r7)
            r7 = 2130903071(0x7f03001f, float:1.741295E38)
            java.lang.String[] r36 = defpackage.yh2.M(r14, r7)
            r7 = 2130903119(0x7f03004f, float:1.7413047E38)
            java.lang.String[] r7 = defpackage.yh2.M(r14, r7)
            r12 = 2130903117(0x7f03004d, float:1.7413043E38)
            java.lang.String[] r12 = defpackage.yh2.M(r14, r12)
            r13 = 2130903115(0x7f03004b, float:1.7413039E38)
            java.lang.String[] r13 = defpackage.yh2.M(r14, r13)
            r0 = 2131952787(0x7f130493, float:1.9542027E38)
            defpackage.yh2.O(r14, r0)
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L19b
            android.content.pm.ConfigurationInfo r0 = r0.getDeviceConfigurationInfo()
            if (r0 == 0) goto L19b
            int r0 = r0.reqGlEsVersion
        L198:
            r37 = r8
            goto L19d
        L19b:
            r0 = 0
            goto L198
        L19d:
            r8 = 196610(0x30002, float:2.75509E-40)
            if (r0 < r8) goto L1a4
            r0 = 1
            goto L1a5
        L1a4:
            r0 = 0
        L1a5:
            if (r0 == 0) goto L1b8
            java.lang.String r8 = android.os.Build.HARDWARE
            r38 = r0
            java.lang.String r0 = "qcom"
            r39 = r9
            r9 = 1
            boolean r0 = defpackage.xs6.Z(r8, r0, r9)
            if (r0 == 0) goto L1bc
            r0 = 1
            goto L1bd
        L1b8:
            r38 = r0
            r39 = r9
        L1bc:
            r0 = 0
        L1bd:
            me.magnum.melonds.domain.model.VideoRenderer r8 = r4.l
            me.magnum.melonds.domain.model.VideoRenderer r9 = r4.m
            r40 = r8
            if (r40 == 0) goto L1e2
            int[] r41 = defpackage.yt5.a
            int r42 = r40.ordinal()
            r8 = r41[r42]
            r41 = r0
            r0 = 1
            if (r8 == r0) goto L1da
            r0 = 2
            if (r8 == r0) goto L1d7
            r0 = 1
            goto L1dc
        L1d7:
            r0 = r41
            goto L1dc
        L1da:
            r0 = r38
        L1dc:
            if (r0 == 0) goto L1df
            goto L1e5
        L1df:
            r40 = 0
            goto L1e5
        L1e2:
            r41 = r0
            goto L1df
        L1e5:
            if (r40 != 0) goto L1e9
            r0 = r9
            goto L1eb
        L1e9:
            r0 = r40
        L1eb:
            me.magnum.melonds.domain.model.VideoFiltering r8 = r4.r
            if (r8 == 0) goto L1f8
            boolean r42 = r8.isSupportedByRenderer(r0)
            if (r42 == 0) goto L1f8
            r42 = r8
            goto L1fa
        L1f8:
            r42 = 0
        L1fa:
            me.magnum.melonds.domain.model.VideoFiltering r8 = r4.s
            boolean r44 = r8.isSupportedByRenderer(r0)
            if (r44 == 0) goto L203
            goto L204
        L203:
            r8 = 0
        L204:
            if (r8 != 0) goto L208
            me.magnum.melonds.domain.model.VideoFiltering r8 = me.magnum.melonds.domain.model.VideoFiltering.NONE
        L208:
            r73 = r8
            if (r42 != 0) goto L20f
            r44 = r73
            goto L211
        L20f:
            r44 = r42
        L211:
            me.magnum.melonds.domain.model.ConsoleType r8 = r4.b
            int r8 = r8.ordinal()
            r21 = 1
            int r8 = r8 + 1
            java.lang.Object r8 = defpackage.fv.J0(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r45 = ""
            if (r8 != 0) goto L230
            java.lang.Object r8 = defpackage.fv.E0(r3)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L230
            r46 = r45
            goto L232
        L230:
            r46 = r8
        L232:
            me.magnum.melonds.domain.model.MicSource r8 = r4.d
            int r8 = r8.ordinal()
            r21 = 1
            int r8 = r8 + 1
            java.lang.Object r8 = defpackage.fv.J0(r8, r5)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L24d
            java.lang.Object r8 = defpackage.fv.E0(r5)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L24d
            goto L24f
        L24d:
            r45 = r8
        L24f:
            r8 = 2131952009(0x7f130189, float:1.9540449E38)
            java.lang.String r47 = r6.getString(r8)
            r47.getClass()
            java.lang.String r8 = r4.g
            r48 = r3
            r3 = 2131952302(0x7f1302ae, float:1.9541043E38)
            if (r8 != 0) goto L269
            java.lang.String r8 = r6.getString(r3)
            r8.getClass()
        L269:
            r49 = r8
            int r8 = r9.ordinal()
            java.lang.Object r8 = defpackage.fv.J0(r8, r7)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L27b
            java.lang.String r8 = r9.name()
        L27b:
            r50 = r8
            boolean r8 = r4.o
            if (r8 == 0) goto L28b
            r8 = 2131952358(0x7f1302e6, float:1.9541156E38)
            java.lang.String r8 = r6.getString(r8)
        L288:
            r51 = r8
            goto L293
        L28b:
            r8 = 2131952304(0x7f1302b0, float:1.9541047E38)
            java.lang.String r8 = r6.getString(r8)
            goto L288
        L293:
            r51.getClass()
            int r8 = r4.q
            r21 = 1
            int r8 = r8 + (-1)
            l93 r9 = defpackage.fv.G0(r12)
            int r8 = defpackage.gi2.r(r8, r9)
            java.lang.Object r8 = defpackage.fv.J0(r8, r12)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L2ae
            java.lang.String r8 = "1x"
        L2ae:
            r52 = r8
            int r8 = r73.ordinal()
            java.lang.Object r8 = defpackage.fv.J0(r8, r13)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L2c0
            java.lang.String r8 = r73.name()
        L2c0:
            r53 = r8
            java.lang.String r8 = r4.u
            if (r8 != 0) goto L2cd
            java.lang.String r8 = r6.getString(r3)
            r8.getClass()
        L2cd:
            r54 = r8
            java.lang.String r8 = r4.w
            if (r8 != 0) goto L2da
            java.lang.String r8 = r6.getString(r3)
            r8.getClass()
        L2da:
            r55 = r8
            kw3 r3 = defpackage.hf.I()
            r8 = 0
            r3.add(r8)
            me.magnum.melonds.domain.model.VideoRenderer r8 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            r3.add(r8)
            if (r38 == 0) goto L2f0
            me.magnum.melonds.domain.model.VideoRenderer r8 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
            r3.add(r8)
        L2f0:
            me.magnum.melonds.domain.model.VideoRenderer r8 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r3.add(r8)
            if (r41 == 0) goto L2fc
            me.magnum.melonds.domain.model.VideoRenderer r8 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE
            r3.add(r8)
        L2fc:
            kw3 r38 = defpackage.hf.A(r3)
            r43 = 0
            java.util.List r3 = defpackage.hf.b0(r43)
            t52 r8 = me.magnum.melonds.domain.model.VideoFiltering.getEntries()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L313:
            boolean r41 = r8.hasNext()
            if (r41 == 0) goto L330
            java.lang.Object r4 = r8.next()
            r73 = r5
            r5 = r4
            me.magnum.melonds.domain.model.VideoFiltering r5 = (me.magnum.melonds.domain.model.VideoFiltering) r5
            boolean r5 = r5.isSupportedByRenderer(r0)
            if (r5 == 0) goto L32b
            r9.add(r4)
        L32b:
            r4 = r70
            r5 = r73
            goto L313
        L330:
            r73 = r5
            java.util.ArrayList r41 = defpackage.gt0.V0(r3, r9)
            s76 r3 = defpackage.nb3.U(r14)
            r9 = 1
            a74 r56 = defpackage.nb3.W(r1, r3, r9)
            nq6 r3 = defpackage.ky0.n
            java.lang.Object r4 = r14.j(r3)
            kk3 r4 = (defpackage.kk3) r4
            float r57 = defpackage.ge7.r(r2, r4)
            java.lang.Object r3 = r14.j(r3)
            kk3 r3 = (defpackage.kk3) r3
            float r59 = defpackage.ge7.q(r2, r3)
            r60 = 0
            r61 = 10
            r58 = 0
            a74 r3 = defpackage.ge7.S(r56, r57, r58, r59, r60, r61)
            eu r4 = defpackage.ju.c
            c40 r5 = defpackage.d90.k0
            r8 = 0
            yt0 r4 = defpackage.wt0.a(r4, r5, r14, r8)
            long r8 = r14.T
            int r5 = java.lang.Long.hashCode(r8)
            xv4 r8 = r14.l()
            a74 r3 = defpackage.l.E(r14, r3)
            ix0 r9 = defpackage.jx0.i
            r9.getClass()
            iy0 r9 = defpackage.ix0.b
            r14.f0()
            r56 = r0
            boolean r0 = r14.S
            if (r0 == 0) goto L38a
            r14.k(r9)
            goto L38d
        L38a:
            r14.o0()
        L38d:
            pn r0 = defpackage.ix0.f
            defpackage.yh2.K(r14, r0, r4)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r14, r0, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            pn r4 = defpackage.ix0.g
            defpackage.yh2.K(r14, r4, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r14, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r14, r0, r3)
            r0 = 2131952531(0x7f130393, float:1.9541507E38)
            java.lang.String r0 = defpackage.yh2.O(r14, r0)
            dq3 r3 = new dq3
            r8 = 4
            r4 = r70
            r9 = r6
            r5 = r11
            r6 = r23
            r11 = r43
            r24 = 16384(0x4000, float:2.2959E-41)
            r26 = 0
            r23 = r7
            r7 = r10
            r10 = r12
            r12 = r73
            r3.<init>(r4, r5, r6, r7, r8)
            r43 = r6
            r4 = 2117585922(0x7e37cc02, float:6.1077E37)
            zv0 r3 = defpackage.n16.I(r4, r3, r14)
            r4 = 384(0x180, float:5.38E-43)
            defpackage.lt5.b(r0, r11, r3, r14, r4)
            r0 = 2131951832(0x7f1300d8, float:1.954009E38)
            java.lang.String r0 = defpackage.yh2.O(r14, r0)
            ut5 r3 = new ut5
            r1 = r17
            r17 = r13
            r13 = r1
            r7 = r69
            r1 = r4
            r2 = r11
            r8 = r16
            r16 = r23
            r63 = r37
            r62 = r39
            r11 = r45
            r5 = r46
            r6 = r48
            r4 = r70
            r23 = r10
            r10 = r71
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 584870393(0x22dc69f9, float:5.9743322E-18)
            zv0 r3 = defpackage.n16.I(r4, r3, r14)
            defpackage.lt5.b(r0, r2, r3, r14, r1)
            r0 = 2131952112(0x7f1301f0, float:1.9540658E38)
            java.lang.String r0 = defpackage.yh2.O(r14, r0)
            vt5 r3 = new vt5
            r64 = r8
            r7 = r9
            r65 = r13
            r1 = r14
            r9 = r16
            r6 = r18
            r8 = r38
            r4 = r40
            r16 = r41
            r12 = r42
            r14 = r44
            r5 = r50
            r19 = r51
            r21 = r52
            r13 = r53
            r24 = r54
            r26 = r55
            r11 = r56
            r18 = r70
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12 = r6
            r9 = r7
            r13 = r20
            r14 = r22
            r4 = -455421446(0xffffffffe4dad1fa, float:-3.2292165E22)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            r4 = 384(0x180, float:5.38E-43)
            defpackage.lt5.b(r0, r2, r3, r1, r4)
            r0 = 2131952109(0x7f1301ed, float:1.9540651E38)
            java.lang.String r0 = defpackage.yh2.O(r1, r0)
            xn3 r3 = new xn3
            r11 = r69
            r8 = r9
            r16 = r15
            r7 = r28
            r10 = r31
            r6 = r35
            r5 = r47
            r9 = r71
            r15 = r4
            r4 = r70
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r11 = r7
            r9 = r8
            r4 = -1495713285(0xffffffffa6d939fb, float:-1.5073115E-15)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            defpackage.lt5.b(r0, r2, r3, r1, r15)
            r0 = 2131952110(0x7f1301ee, float:1.9540653E38)
            java.lang.String r0 = defpackage.yh2.O(r1, r0)
            dq3 r3 = new dq3
            r8 = 5
            r5 = r70
            r7 = r71
            r4 = r9
            r6 = r30
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r6
            r4 = 1758962172(0x68d7a1fc, float:8.146375E24)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            defpackage.lt5.b(r0, r2, r3, r1, r15)
            r0 = 2131951833(0x7f1300d9, float:1.9540092E38)
            java.lang.String r0 = defpackage.yh2.O(r1, r0)
            dq3 r3 = new dq3
            r8 = 6
            r4 = r70
            r6 = r9
            r7 = r32
            r5 = r49
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = 718670333(0x2ad609fd, float:3.8020967E-13)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            defpackage.lt5.b(r0, r2, r3, r1, r15)
            r0 = 2131952107(0x7f1301eb, float:1.9540647E38)
            java.lang.String r0 = defpackage.yh2.O(r1, r0)
            ln3 r3 = new ln3
            r4 = r70
            r8 = r71
            r7 = r9
            r66 = r10
            r6 = r29
            r9 = r33
            r10 = r34
            r5 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r10 = r8
            r4 = -321621506(0xffffffffecd471fe, float:-2.0546447E27)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            defpackage.lt5.b(r0, r2, r3, r1, r15)
            float r0 = r68.a()
            r2 = 1119879168(0x42c00000, float:96.0)
            float r0 = r0 + r2
            x64 r2 = defpackage.x64.a
            a74 r0 = defpackage.dj6.e(r2, r0)
            defpackage.gi2.h(r1, r0)
            r0 = 1
            r1.p(r0)
            r2 = 2131952104(0x7f1301e8, float:1.9540641E38)
            java.lang.String r3 = defpackage.yh2.O(r1, r2)
            java.lang.Object r2 = r1.P()
            r15 = r63
            if (r2 != r15) goto L506
            gn5 r2 = new gn5
            r4 = 16
            r2.<init>(r4)
            r1.l0(r2)
        L506:
            r5 = r2
            qn2 r5 = (defpackage.qn2) r5
            r2 = r62
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r4) goto L511
            r7 = r0
            goto L512
        L511:
            r7 = 0
        L512:
            java.lang.Object r8 = r1.P()
            if (r7 != 0) goto L51a
            if (r8 != r15) goto L524
        L51a:
            j91 r8 = new j91
            r7 = 12
            r8.<init>(r7, r10)
            r1.l0(r8)
        L524:
            on2 r8 = (defpackage.on2) r8
            r7 = r6
            r6 = r8
            r8 = 384(0x180, float:5.38E-43)
            r9 = 0
            r0 = r7
            r7 = r1
            r1 = r0
            r0 = r4
            r4 = r43
            defpackage.mp2.e(r3, r4, r5, r6, r7, r8, r9)
            r8 = r64
            r3 = 0
            defpackage.jx2.e(r8, r7, r3)
            r4 = r65
            defpackage.jx2.e(r4, r7, r3)
            defpackage.jx2.e(r11, r7, r3)
            defpackage.jx2.e(r1, r7, r3)
            defpackage.jx2.e(r12, r7, r3)
            defpackage.jx2.e(r13, r7, r3)
            defpackage.jx2.e(r14, r7, r3)
            r1 = r16
            defpackage.jx2.e(r1, r7, r3)
            r6 = r66
            defpackage.jx2.e(r6, r7, r3)
            r1 = 2131952846(0x7f1304ce, float:1.9542146E38)
            java.lang.String r1 = defpackage.yh2.O(r7, r1)
            java.lang.Object r4 = r7.P()
            if (r4 != r15) goto L56f
            gn5 r4 = new gn5
            r5 = 17
            r4.<init>(r5)
            r7.l0(r4)
        L56f:
            r5 = r4
            qn2 r5 = (defpackage.qn2) r5
            if (r2 != r0) goto L576
            r12 = 1
            goto L577
        L576:
            r12 = r3
        L577:
            java.lang.Object r4 = r7.P()
            if (r12 != 0) goto L57f
            if (r4 != r15) goto L589
        L57f:
            j91 r4 = new j91
            r6 = 13
            r4.<init>(r6, r10)
            r7.l0(r4)
        L589:
            r6 = r4
            on2 r6 = (defpackage.on2) r6
            r8 = 384(0x180, float:5.38E-43)
            r9 = 0
            r26 = r3
            r4 = r25
            r3 = r1
            defpackage.mp2.e(r3, r4, r5, r6, r7, r8, r9)
            r1 = 2131952844(0x7f1304cc, float:1.9542142E38)
            java.lang.String r3 = defpackage.yh2.O(r7, r1)
            java.lang.Object r1 = r7.P()
            if (r1 != r15) goto L5ae
            gn5 r1 = new gn5
            r4 = 18
            r1.<init>(r4)
            r7.l0(r1)
        L5ae:
            r5 = r1
            qn2 r5 = (defpackage.qn2) r5
            if (r2 != r0) goto L5b5
            r12 = 1
            goto L5b7
        L5b5:
            r12 = r26
        L5b7:
            java.lang.Object r0 = r7.P()
            if (r12 != 0) goto L5bf
            if (r0 != r15) goto L5c9
        L5bf:
            j91 r0 = new j91
            r1 = 14
            r0.<init>(r1, r10)
            r7.l0(r0)
        L5c9:
            r6 = r0
            on2 r6 = (defpackage.on2) r6
            r8 = 384(0x180, float:5.38E-43)
            r9 = 0
            r4 = r27
            defpackage.mp2.e(r3, r4, r5, r6, r7, r8, r9)
            goto L5d9
        L5d5:
            r7 = r14
            r7.V()
        L5d9:
            cf5 r8 = r7.t()
            if (r8 == 0) goto L5f3
            c4 r0 = new c4
            r1 = r67
            r2 = r68
            r3 = r69
            r4 = r70
            r6 = r72
            r7 = r74
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L5f3:
            return
    }

    public static final void b(defpackage.zn5 r48, defpackage.zn5 r49, defpackage.px0 r50, int r51) {
            r0 = r48
            r1 = r49
            r3 = r50
            xq2 r3 = (defpackage.xq2) r3
            r4 = 537291603(0x20066b53, float:1.1385752E-19)
            r3.d0(r4)
            boolean r4 = r3.f(r0)
            if (r4 == 0) goto L16
            r4 = 4
            goto L17
        L16:
            r4 = 2
        L17:
            r4 = r51 | r4
            boolean r6 = r3.f(r1)
            r7 = 32
            if (r6 == 0) goto L23
            r6 = r7
            goto L25
        L23:
            r6 = 16
        L25:
            r4 = r4 | r6
            r6 = r4 & 19
            r8 = 18
            r10 = 0
            if (r6 == r8) goto L2f
            r6 = 1
            goto L30
        L2f:
            r6 = r10
        L30:
            r8 = r4 & 1
            boolean r6 = r3.S(r8, r6)
            if (r6 == 0) goto L371
            nq6 r6 = defpackage.ye7.b
            java.lang.Object r8 = r3.j(r6)
            xe7 r8 = (defpackage.xe7) r8
            s47 r8 = r8.i
            ds4 r8 = r8.b
            long r11 = r8.c
            py0 r8 = defpackage.kf.c
            java.lang.Object r8 = r3.j(r8)
            android.content.res.Resources r8 = (android.content.res.Resources) r8
            java.lang.String r13 = "spinner-rotation"
            g53 r13 = defpackage.yh2.H(r13, r3, r10)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r7) goto L5a
            r4 = 1
            goto L5b
        L5a:
            r4 = r10
        L5b:
            java.lang.Object r7 = r3.P()
            java.lang.String r14 = "pending-leaderboard"
            java.lang.String r15 = "pending-achievement"
            r50 = r4
            java.lang.String r4 = "checkmark"
            java.lang.String r9 = "spinner"
            if (r50 != 0) goto L7b
            vs0 r10 = defpackage.ox0.a
            if (r7 != r10) goto L70
            goto L7b
        L70:
            r2 = r4
            r25 = r6
            r1 = r7
            r7 = r9
            r18 = r11
            r20 = r13
            goto L171
        L7b:
            if (r1 == 0) goto L80
            int r7 = r1.a
            goto L81
        L80:
            r7 = 0
        L81:
            if (r1 == 0) goto L86
            int r10 = r1.b
            goto L87
        L86:
            r10 = 0
        L87:
            dp r5 = new dp
            r5.<init>()
            r18 = r11
            if (r0 == 0) goto L93
            int r11 = r0.a
            goto L94
        L93:
            r11 = 0
        L94:
            java.lang.String r12 = " "
            r20 = r11
            java.lang.String r11 = "\u2003"
            r21 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            r23 = 1069547520(0x3fc00000, float:1.5)
            if (r20 <= 0) goto L102
            r20 = r13
            ds4 r13 = new ds4
            defpackage.hi2.v(r18)
            long r1 = r18 & r21
            float r24 = defpackage.x47.c(r18)
            r25 = r6
            float r6 = r24 * r23
            long r1 = defpackage.hi2.J(r6, r1)
            g37 r6 = new g37
            r24 = r3
            r26 = r4
            long r3 = defpackage.g90.a
            r27 = r10
            r10 = 2
            r6.<init>(r10, r3)
            r13.<init>(r1, r6)
            int r1 = r5.e(r13)
            defpackage.oi2.i(r5, r15)     // Catch: java.lang.Throwable -> Lf3
            r5.b(r11)     // Catch: java.lang.Throwable -> Lf3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lf3
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> Lf3
            r3 = 2131886082(0x7f120002, float:1.9406733E38)
            java.lang.String r2 = r8.getQuantityString(r3, r7, r2)     // Catch: java.lang.Throwable -> Lf3
            r2.getClass()     // Catch: java.lang.Throwable -> Lf3
            r5.b(r2)     // Catch: java.lang.Throwable -> Lf3
            r5.b(r12)     // Catch: java.lang.Throwable -> Lf3
            if (r7 <= 0) goto Lf5
            defpackage.oi2.i(r5, r9)     // Catch: java.lang.Throwable -> Lf3
            r2 = r26
            goto Lfa
        Lf3:
            r0 = move-exception
            goto Lfe
        Lf5:
            r2 = r26
            defpackage.oi2.i(r5, r2)     // Catch: java.lang.Throwable -> Lf3
        Lfa:
            r5.d(r1)
            goto L10b
        Lfe:
            r5.d(r1)
            throw r0
        L102:
            r24 = r3
            r2 = r4
            r25 = r6
            r27 = r10
            r20 = r13
        L10b:
            if (r0 == 0) goto L110
            int r1 = r0.b
            goto L111
        L110:
            r1 = 0
        L111:
            if (r1 <= 0) goto L167
            ds4 r1 = new ds4
            defpackage.hi2.v(r18)
            long r3 = r18 & r21
            float r6 = defpackage.x47.c(r18)
            float r6 = r6 * r23
            long r3 = defpackage.hi2.J(r6, r3)
            g37 r6 = new g37
            r7 = r9
            long r9 = defpackage.g90.a
            r13 = 2
            r6.<init>(r13, r9)
            r1.<init>(r3, r6)
            int r1 = r5.e(r1)
            defpackage.oi2.i(r5, r14)     // Catch: java.lang.Throwable -> L15a
            r5.b(r11)     // Catch: java.lang.Throwable -> L15a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r27)     // Catch: java.lang.Throwable -> L15a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L15a
            r4 = 2131886083(0x7f120003, float:1.9406735E38)
            r10 = r27
            java.lang.String r3 = r8.getQuantityString(r4, r10, r3)     // Catch: java.lang.Throwable -> L15a
            r3.getClass()     // Catch: java.lang.Throwable -> L15a
            r5.b(r3)     // Catch: java.lang.Throwable -> L15a
            r5.b(r12)     // Catch: java.lang.Throwable -> L15a
            if (r10 <= 0) goto L15c
            defpackage.oi2.i(r5, r7)     // Catch: java.lang.Throwable -> L15a
            goto L15f
        L15a:
            r0 = move-exception
            goto L163
        L15c:
            defpackage.oi2.i(r5, r2)     // Catch: java.lang.Throwable -> L15a
        L15f:
            r5.d(r1)
            goto L168
        L163:
            r5.d(r1)
            throw r0
        L167:
            r7 = r9
        L168:
            fp r1 = r5.f()
            r3 = r24
            r3.l0(r1)
        L171:
            fp r1 = (defpackage.fp) r1
            eu r4 = defpackage.ju.c
            c40 r5 = defpackage.d90.k0
            r6 = 0
            yt0 r4 = defpackage.wt0.a(r4, r5, r3, r6)
            long r9 = r3.T
            int r5 = java.lang.Long.hashCode(r9)
            xv4 r9 = r3.l()
            x64 r10 = defpackage.x64.a
            a74 r11 = defpackage.l.E(r3, r10)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r3.f0()
            boolean r13 = r3.S
            if (r13 == 0) goto L19e
            r3.k(r12)
            goto L1a1
        L19e:
            r3.o0()
        L1a1:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r3, r12, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r3, r4, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r3, r5, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r3, r4)
            pn r4 = defpackage.ix0.d
            defpackage.yh2.K(r3, r4, r11)
            r4 = 2131952493(0x7f13036d, float:1.954143E38)
            java.lang.String r4 = defpackage.yh2.O(r3, r4)
            r5 = r25
            java.lang.Object r9 = r3.j(r5)
            xe7 r9 = (defpackage.xe7) r9
            s47 r9 = r9.i
            r24 = 0
            r25 = 65534(0xfffe, float:9.1833E-41)
            r21 = r3
            r3 = r4
            r4 = 0
            r11 = r5
            r12 = r6
            r5 = 0
            r17 = r7
            r13 = r8
            r7 = 0
            r22 = r21
            r21 = r9
            r9 = 0
            r23 = r10
            r10 = 0
            r26 = r11
            r27 = r12
            r11 = 0
            r28 = r13
            r13 = 0
            r29 = r14
            r30 = r15
            r14 = 0
            r31 = 1
            r16 = 0
            r32 = r17
            r17 = 0
            r33 = r18
            r18 = 0
            r19 = 0
            r35 = r20
            r20 = 0
            r36 = r23
            r23 = 0
            r50 = r1
            r41 = r2
            r2 = r26
            r37 = r28
            r39 = r29
            r40 = r30
            r0 = r31
            r42 = r32
            r38 = r35
            r1 = r36
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = r22
            r4 = 0
            r5 = 1090519040(0x41000000, float:8.0)
            a74 r4 = defpackage.ge7.Q(r1, r4, r5, r0)
            java.lang.Object r1 = r3.j(r2)
            xe7 r1 = (defpackage.xe7) r1
            s47 r1 = r1.i
            w53 r5 = new w53
            hx4 r6 = new hx4
            r7 = r33
            r6.<init>(r7, r7)
            zv0 r9 = defpackage.lb4.d
            r5.<init>(r6, r9)
            vr4 r6 = new vr4
            r9 = r40
            r6.<init>(r9, r5)
            w53 r5 = new w53
            hx4 r9 = new hx4
            r9.<init>(r7, r7)
            zv0 r10 = defpackage.lb4.e
            r5.<init>(r9, r10)
            vr4 r9 = new vr4
            r10 = r39
            r9.<init>(r10, r5)
            w53 r5 = new w53
            hx4 r10 = new hx4
            r10.<init>(r7, r7)
            ov4 r7 = new ov4
            r8 = r38
            r12 = 0
            r7.<init>(r8, r12)
            r8 = -1509985660(0xffffffffa5ff7284, float:-4.4313047E-16)
            zv0 r7 = defpackage.n16.I(r8, r7, r3)
            r5.<init>(r10, r7)
            vr4 r7 = new vr4
            r8 = r42
            r7.<init>(r8, r5)
            w53 r5 = new w53
            hx4 r8 = new hx4
            java.lang.Object r10 = r3.j(r2)
            xe7 r10 = (defpackage.xe7) r10
            s47 r10 = r10.i
            nn6 r10 = r10.a
            long r10 = r10.b
            java.lang.Object r12 = r3.j(r2)
            xe7 r12 = (defpackage.xe7) r12
            s47 r12 = r12.i
            nn6 r12 = r12.a
            long r12 = r12.b
            r8.<init>(r10, r12)
            zv0 r10 = defpackage.lb4.f
            r5.<init>(r8, r10)
            vr4 r8 = new vr4
            r10 = r41
            r8.<init>(r10, r5)
            vr4[] r5 = new defpackage.vr4[]{r6, r9, r7, r8}
            java.util.Map r18 = defpackage.c14.m0(r5)
            r24 = 98300(0x17ffc, float:1.37748E-40)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r19 = 0
            r22 = 48
            r20 = r1
            r21 = r3
            r3 = r50
            defpackage.x37.c(r3, r4, r5, r7, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r21
            dp r1 = new dp
            r1.<init>()
            r4 = 2131952491(0x7f13036b, float:1.9541426E38)
            r13 = r37
            java.lang.String r4 = r13.getString(r4)
            r1.append(r4)
            r4 = 10
            r1.append(r4)
            nn6 r28 = new nn6
            oj2 r33 = defpackage.oj2.e0
            r46 = 0
            r47 = 65531(0xfffb, float:9.1828E-41)
            r29 = 0
            r31 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r28.<init>(r29, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r45, r46, r47)
            r4 = r28
            cp r5 = new cp
            java.lang.StringBuilder r6 = r1.A
            int r6 = r6.length()
            r7 = 12
            r12 = 0
            r5.<init>(r4, r6, r12, r7)
            java.util.ArrayList r4 = r1.B
            r4.add(r5)
            java.util.ArrayList r6 = r1.L
            r6.add(r5)
            int r4 = r4.size()
            int r4 = r4 - r0
            r5 = 2131952494(0x7f13036e, float:1.9541432E38)
            java.lang.String r5 = r13.getString(r5)     // Catch: java.lang.Throwable -> L36c
            r5.getClass()     // Catch: java.lang.Throwable -> L36c
            r1.b(r5)     // Catch: java.lang.Throwable -> L36c
            r1.d(r4)
            fp r1 = r1.f()
            java.lang.Object r2 = r3.j(r2)
            xe7 r2 = (defpackage.xe7) r2
            s47 r2 = r2.i
            r23 = 0
            r24 = 131070(0x1fffe, float:1.83668E-40)
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r20 = r2
            r21 = r3
            r3 = r1
            defpackage.x37.c(r3, r4, r5, r7, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r21
            r3.p(r0)
            goto L374
        L36c:
            r0 = move-exception
            r1.d(r4)
            throw r0
        L371:
            r3.V()
        L374:
            cf5 r0 = r3.t()
            if (r0 == 0) goto L389
            ql1 r1 = new ql1
            r2 = 29
            r3 = r48
            r4 = r49
            r5 = r51
            r1.<init>(r3, r5, r2, r4)
            r0.d = r1
        L389:
            return
    }

    public static final java.lang.String c(android.content.Context r1, java.lang.String r2) {
            r0 = 2131952788(0x7f130494, float:1.9542029E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r1.getString(r0, r2)
            r1.getClass()
            return r1
    }

    public static final void d(defpackage.px0 r25, int r26) {
            r1 = r25
            xq2 r1 = (defpackage.xq2) r1
            r2 = -1829798492(0xffffffff92ef7da4, float:-1.5113993E-27)
            r1.d0(r2)
            r2 = 1
            r3 = 0
            if (r26 == 0) goto L10
            r4 = r2
            goto L11
        L10:
            r4 = r3
        L11:
            r5 = r26 & 1
            boolean r4 = r1.S(r5, r4)
            if (r4 == 0) goto L12f
            gu r4 = new gu
            i r5 = new i
            r5.<init>(r2)
            r6 = 1090519040(0x41000000, float:8.0)
            r4.<init>(r6, r2, r5)
            c40 r5 = defpackage.d90.k0
            r6 = 6
            yt0 r4 = defpackage.wt0.a(r4, r5, r1, r6)
            long r5 = r1.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r1.l()
            x64 r7 = defpackage.x64.a
            a74 r7 = defpackage.l.E(r1, r7)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r1.f0()
            boolean r9 = r1.S
            if (r9 == 0) goto L4e
            r1.k(r8)
            goto L51
        L4e:
            r1.o0()
        L51:
            pn r8 = defpackage.ix0.f
            defpackage.yh2.K(r1, r8, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r1, r4, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r1, r5, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r1, r4)
            pn r4 = defpackage.ix0.d
            defpackage.yh2.K(r1, r4, r7)
            r4 = 1163639459(0x455bbaa3, float:3515.6648)
            r1.b0(r4)
            dp r4 = new dp
            r4.<init>()
            r5 = 2131952495(0x7f13036f, float:1.9541434E38)
            java.lang.String r5 = defpackage.yh2.O(r1, r5)
            r4.b(r5)
            java.lang.String r5 = " "
            r4.b(r5)
            java.lang.String r5 = "checkmark"
            defpackage.oi2.i(r4, r5)
            fp r4 = r4.f()
            r1.p(r3)
            nq6 r3 = defpackage.ye7.b
            java.lang.Object r6 = r1.j(r3)
            xe7 r6 = (defpackage.xe7) r6
            s47 r6 = r6.i
            oj2 r7 = defpackage.oj2.e0
            w53 r8 = new w53
            hx4 r9 = new hx4
            java.lang.Object r10 = r1.j(r3)
            xe7 r10 = (defpackage.xe7) r10
            s47 r10 = r10.i
            nn6 r10 = r10.a
            long r10 = r10.b
            java.lang.Object r12 = r1.j(r3)
            xe7 r12 = (defpackage.xe7) r12
            s47 r12 = r12.i
            nn6 r12 = r12.a
            long r12 = r12.b
            r9.<init>(r10, r12)
            zv0 r10 = defpackage.lb4.g
            r8.<init>(r9, r10)
            java.util.Map r16 = java.util.Collections.singletonMap(r5, r8)
            r16.getClass()
            r21 = 0
            r22 = 98270(0x17fde, float:1.37706E-40)
            r5 = r2
            r2 = 0
            r19 = r1
            r8 = r3
            r1 = r4
            r3 = 0
            r9 = r5
            r18 = r6
            r5 = 0
            r10 = r8
            r11 = r9
            r8 = 0
            r12 = r10
            r13 = r11
            r10 = 0
            r14 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r17 = r14
            r14 = 0
            r20 = r15
            r15 = 0
            r23 = r17
            r17 = 0
            r24 = r20
            r20 = 196608(0x30000, float:2.75506E-40)
            r0 = r23
            defpackage.x37.c(r1, r2, r3, r5, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r19
            r2 = 2131952492(0x7f13036c, float:1.9541428E38)
            java.lang.String r2 = defpackage.yh2.O(r1, r2)
            java.lang.Object r0 = r1.j(r0)
            xe7 r0 = (defpackage.xe7) r0
            s47 r0 = r0.i
            r22 = 0
            r23 = 65534(0xfffe, float:9.1833E-41)
            r1 = r2
            r2 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = r19
            r19 = r0
            defpackage.x37.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r20
            r15 = 1
            r1.p(r15)
            goto L132
        L12f:
            r1.V()
        L132:
            cf5 r0 = r1.t()
            if (r0 == 0) goto L141
            ep3 r1 = new ep3
            r2 = r26
            r1.<init>(r2)
            r0.d = r1
        L141:
            return
    }

    public static final long e(int r2) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            int r2 = defpackage.kg3.X
            return r0
    }

    public static final void f(java.lang.Object r17, int r18, defpackage.mq3 r19, defpackage.zv0 r20, defpackage.px0 r21, int r22) {
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r22
            r0 = r21
            xq2 r0 = (defpackage.xq2) r0
            r6 = 872548579(0x340208e3, float:1.2110426E-7)
            r0.d0(r6)
            r6 = r5 & 6
            if (r6 != 0) goto L23
            boolean r6 = r0.h(r1)
            if (r6 == 0) goto L20
            r6 = 4
            goto L21
        L20:
            r6 = 2
        L21:
            r6 = r6 | r5
            goto L24
        L23:
            r6 = r5
        L24:
            r7 = r5 & 48
            if (r7 != 0) goto L34
            boolean r7 = r0.d(r2)
            if (r7 == 0) goto L31
            r7 = 32
            goto L33
        L31:
            r7 = 16
        L33:
            r6 = r6 | r7
        L34:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L44
            boolean r7 = r0.h(r3)
            if (r7 == 0) goto L41
            r7 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r7 = 128(0x80, float:1.8E-43)
        L43:
            r6 = r6 | r7
        L44:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L54
            boolean r7 = r0.h(r4)
            if (r7 == 0) goto L51
            r7 = 2048(0x800, float:2.87E-42)
            goto L53
        L51:
            r7 = 1024(0x400, float:1.435E-42)
        L53:
            r6 = r6 | r7
        L54:
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 == r8) goto L5c
            r7 = 1
            goto L5d
        L5c:
            r7 = 0
        L5d:
            r8 = r6 & 1
            boolean r7 = r0.S(r8, r7)
            if (r7 == 0) goto Lf1
            boolean r7 = r0.f(r1)
            boolean r8 = r0.f(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r0.P()
            vs0 r9 = defpackage.ox0.a
            if (r7 != 0) goto L78
            if (r8 != r9) goto L80
        L78:
            lq3 r8 = new lq3
            r8.<init>(r1, r3)
            r0.l0(r8)
        L80:
            lq3 r8 = (defpackage.lq3) r8
            r8.c = r2
            vs4 r7 = r8.g
            py0 r10 = defpackage.zw4.a
            java.lang.Object r11 = r0.j(r10)
            lq3 r11 = (defpackage.lq3) r11
            vl6 r12 = defpackage.ln2.t()
            if (r12 == 0) goto L99
            qn2 r14 = r12.e()
            goto L9a
        L99:
            r14 = 0
        L9a:
            vl6 r15 = defpackage.ln2.N(r12)
            java.lang.Object r16 = r7.getValue()     // Catch: java.lang.Throwable -> Lb7
            r13 = r16
            lq3 r13 = (defpackage.lq3) r13     // Catch: java.lang.Throwable -> Lb7
            if (r11 == r13) goto Lc2
            r7.setValue(r11)     // Catch: java.lang.Throwable -> Lb7
            int r7 = r8.d     // Catch: java.lang.Throwable -> Lb7
            if (r7 <= 0) goto Lc2
            lq3 r7 = r8.e     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto Lb9
            r7.b()     // Catch: java.lang.Throwable -> Lb7
            goto Lb9
        Lb7:
            r0 = move-exception
            goto Led
        Lb9:
            if (r11 == 0) goto Lbf
            r11.a()     // Catch: java.lang.Throwable -> Lb7
            goto Lc0
        Lbf:
            r11 = 0
        Lc0:
            r8.e = r11     // Catch: java.lang.Throwable -> Lb7
        Lc2:
            defpackage.ln2.V(r12, r15, r14)
            boolean r7 = r0.f(r8)
            java.lang.Object r11 = r0.P()
            r12 = 6
            if (r7 != 0) goto Ld2
            if (r11 != r9) goto Lda
        Ld2:
            bg2 r11 = new bg2
            r11.<init>(r8, r12)
            r0.l0(r11)
        Lda:
            qn2 r11 = (defpackage.qn2) r11
            defpackage.mb3.d(r8, r11, r0)
            pq r7 = r10.a(r8)
            int r6 = r6 >> r12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = 8
            r6 = r6 | r8
            defpackage.hv.d(r7, r4, r0, r6)
            goto Lf4
        Led:
            defpackage.ln2.V(r12, r15, r14)
            throw r0
        Lf1:
            r0.V()
        Lf4:
            cf5 r6 = r0.t()
            if (r6 == 0) goto L101
            g4 r0 = new g4
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L101:
            return
    }

    public static final void g(defpackage.a74 r11, defpackage.px0 r12, int r13) {
            r7 = r12
            xq2 r7 = (defpackage.xq2) r7
            r12 = -1625210322(0xffffffff9f21422e, float:-3.414782E-20)
            r7.d0(r12)
            boolean r12 = r7.f(r11)
            r0 = 2
            if (r12 == 0) goto L12
            r12 = 4
            goto L13
        L12:
            r12 = r0
        L13:
            r12 = r12 | r13
            r1 = r12 & 3
            r2 = 0
            r10 = 1
            if (r1 == r0) goto L1c
            r0 = r10
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r12 = r12 & r10
            boolean r12 = r7.S(r12, r0)
            if (r12 == 0) goto L8e
            e40 r12 = defpackage.d90.L
            e34 r12 = defpackage.h70.d(r12, r2)
            long r0 = r7.T
            int r0 = java.lang.Long.hashCode(r0)
            xv4 r1 = r7.l()
            a74 r2 = defpackage.l.E(r7, r11)
            ix0 r3 = defpackage.jx0.i
            r3.getClass()
            iy0 r3 = defpackage.ix0.b
            r7.f0()
            boolean r4 = r7.S
            if (r4 == 0) goto L4a
            r7.k(r3)
            goto L4d
        L4a:
            r7.o0()
        L4d:
            pn r3 = defpackage.ix0.f
            defpackage.yh2.K(r7, r3, r12)
            pn r12 = defpackage.ix0.e
            defpackage.yh2.K(r7, r12, r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            pn r0 = defpackage.ix0.g
            defpackage.yh2.K(r7, r0, r12)
            ne r12 = defpackage.ix0.h
            defpackage.yh2.F(r7, r12)
            pn r12 = defpackage.ix0.d
            defpackage.yh2.K(r7, r12, r2)
            vs0 r12 = defpackage.vs0.Y
            x64 r0 = defpackage.x64.a
            e40 r1 = defpackage.d90.Z
            a74 r0 = r12.n(r0, r1)
            nq6 r12 = defpackage.vt0.a
            java.lang.Object r12 = r7.j(r12)
            ut0 r12 = (defpackage.ut0) r12
            long r1 = r12.i()
            r8 = 0
            r9 = 28
            r3 = 0
            r4 = 0
            r6 = 0
            defpackage.e45.a(r0, r1, r3, r4, r6, r7, r8, r9)
            r7.p(r10)
            goto L91
        L8e:
            r7.V()
        L91:
            cf5 r12 = r7.t()
            if (r12 == 0) goto L9f
            v00 r0 = new v00
            r1 = 3
            r0.<init>(r11, r13, r1)
            r12.d = r0
        L9f:
            return
    }

    public static final void h(defpackage.le2 r16, defpackage.on2 r17, defpackage.on2 r18, defpackage.px0 r19, int r20) {
            r1 = r16
            r2 = r17
            r0 = r18
            r1.getClass()
            r2.getClass()
            r0.getClass()
            r8 = r19
            xq2 r8 = (defpackage.xq2) r8
            r3 = -778426770(0xffffffffd19a266e, float:-8.275871E10)
            r8.d0(r3)
            boolean r3 = r8.h(r1)
            r9 = 2
            if (r3 == 0) goto L22
            r3 = 4
            goto L23
        L22:
            r3 = r9
        L23:
            r3 = r20 | r3
            boolean r4 = r8.h(r2)
            r5 = 32
            if (r4 == 0) goto L2f
            r4 = r5
            goto L31
        L2f:
            r4 = 16
        L31:
            r3 = r3 | r4
            boolean r4 = r8.h(r0)
            if (r4 == 0) goto L3b
            r4 = 256(0x100, float:3.59E-43)
            goto L3d
        L3b:
            r4 = 128(0x80, float:1.8E-43)
        L3d:
            r3 = r3 | r4
            r4 = r3 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 0
            r10 = 1
            if (r4 == r6) goto L48
            r4 = r10
            goto L49
        L48:
            r4 = r7
        L49:
            r6 = r3 & 1
            boolean r4 = r8.S(r6, r4)
            if (r4 == 0) goto Lfd
            r4 = r3 & 14
            r4 = r4 | 48
            r6 = 0
            qa4 r4 = defpackage.nb3.l(r1, r6, r8, r4)
            java.lang.Object r11 = r4.getValue()
            zn5 r11 = (defpackage.zn5) r11
            if (r11 == 0) goto L64
            r11 = r10
            goto L65
        L64:
            r11 = r7
        L65:
            boolean r11 = r8.g(r11)
            java.lang.Object r12 = r8.P()
            vs0 r13 = defpackage.ox0.a
            if (r11 != 0) goto L73
            if (r12 != r13) goto L7d
        L73:
            java.lang.Object r11 = r4.getValue()
            r12 = r11
            zn5 r12 = (defpackage.zn5) r12
            r8.l0(r12)
        L7d:
            zn5 r12 = (defpackage.zn5) r12
            java.lang.Object r11 = r8.P()
            if (r11 != r13) goto L8e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            vs4 r11 = defpackage.np2.Y(r11)
            r8.l0(r11)
        L8e:
            qa4 r11 = (defpackage.qa4) r11
            java.lang.Object r14 = r4.getValue()
            zn5 r14 = (defpackage.zn5) r14
            boolean r15 = r8.f(r4)
            r3 = r3 & 112(0x70, float:1.57E-43)
            if (r3 != r5) goto L9f
            r7 = r10
        L9f:
            r3 = r15 | r7
            java.lang.Object r5 = r8.P()
            if (r3 != 0) goto Lae
            if (r5 != r13) goto Laa
            goto Lae
        Laa:
            r10 = r2
            r2 = r5
            r5 = r11
            goto Lbc
        Lae:
            u12 r2 = new u12
            r7 = 20
            r3 = r17
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r10 = r3
            r8.l0(r2)
        Lbc:
            eo2 r2 = (defpackage.eo2) r2
            defpackage.mb3.i(r8, r2, r14)
            r2 = 2131952490(0x7f13036a, float:1.9541424E38)
            java.lang.String r2 = defpackage.yh2.O(r8, r2)
            java.lang.Object r3 = r8.P()
            if (r3 != r13) goto Ld8
            c5 r3 = new c5
            r6 = 17
            r3.<init>(r6)
            r8.l0(r3)
        Ld8:
            on2 r3 = (defpackage.on2) r3
            m4 r6 = new m4
            r7 = 6
            r6.<init>(r12, r5, r4, r7)
            r4 = -1186299645(0xffffffffb94a8103, float:-1.9312282E-4)
            zv0 r4 = defpackage.n16.I(r4, r6, r8)
            pn0 r5 = new pn0
            r5.<init>(r0, r10, r9)
            r6 = -913176187(0xffffffffc9920985, float:-1196336.6)
            zv0 r5 = defpackage.n16.I(r6, r5, r8)
            r7 = r8
            r8 = 3504(0xdb0, float:4.91E-42)
            r9 = 16
            r6 = 0
            defpackage.q60.a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L102
        Lfd:
            r10 = r2
            r7 = r8
            r7.V()
        L102:
            cf5 r6 = r7.t()
            if (r6 == 0) goto L116
            x3 r0 = new x3
            r5 = 26
            r3 = r18
            r4 = r20
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L116:
            return
    }

    public static final void i(defpackage.a74 r16, defpackage.ra5 r17, defpackage.px0 r18, int r19) {
            r0 = r16
            r13 = r17
            r14 = r19
            r0.getClass()
            r13.getClass()
            r10 = r18
            xq2 r10 = (defpackage.xq2) r10
            r1 = 765706284(0x2da3c02c, float:1.8616296E-11)
            r10.d0(r1)
            boolean r1 = r10.f(r0)
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = 2
        L1f:
            r1 = r1 | r14
            boolean r2 = r10.h(r13)
            if (r2 == 0) goto L29
            r2 = 32
            goto L2b
        L29:
            r2 = 16
        L2b:
            r1 = r1 | r2
            r2 = r1 & 19
            r3 = 18
            r15 = 0
            if (r2 == r3) goto L35
            r2 = 1
            goto L36
        L35:
            r2 = r15
        L36:
            r3 = r1 & 1
            boolean r2 = r10.S(r3, r2)
            if (r2 == 0) goto L1bf
            java.net.URL r2 = r13.a()
            if (r2 == 0) goto L49
            java.lang.String r2 = r2.toString()
            goto L4a
        L49:
            r2 = 0
        L4a:
            boolean r3 = r13 instanceof defpackage.qa5
            r4 = 2131952420(0x7f130324, float:1.9541282E38)
            if (r3 == 0) goto L97
            r3 = 584785047(0x22db1c97, float:5.939034E-18)
            r10.b0(r3)
            r3 = r1
            r1 = r2
            y16 r2 = defpackage.ls7.a
            r5 = r3
            e33 r3 = defpackage.q60.F()
            java.lang.String r4 = defpackage.yh2.O(r10, r4)
            r6 = r13
            qa5 r6 = (defpackage.qa5) r6
            java.lang.String r7 = r6.b
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8 = 2131952423(0x7f130327, float:1.9541288E38)
            java.lang.String r7 = defpackage.yh2.N(r8, r7, r10)
            boolean r6 = r6.c
            if (r6 == 0) goto L7c
            r6 = 2131952421(0x7f130325, float:1.9541284E38)
            goto L7f
        L7c:
            r6 = 2131952422(0x7f130326, float:1.9541286E38)
        L7f:
            java.lang.String r6 = defpackage.yh2.O(r10, r6)
            r5 = r5 & 14
            r11 = r5 | 384(0x180, float:5.38E-43)
            r12 = 384(0x180, float:5.38E-43)
            r5 = r7
            r7 = 0
            r8 = 0
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            r0 = r16
            goto L1c2
        L97:
            r5 = r1
            r1 = r2
            boolean r0 = r13 instanceof defpackage.ma5
            r2 = 2131952394(0x7f13030a, float:1.954123E38)
            if (r0 == 0) goto Le2
            r0 = 585363941(0x22e3f1e5, float:6.178459E-18)
            r10.b0(r0)
            e33 r3 = defpackage.ej2.G()
            java.lang.String r4 = defpackage.yh2.O(r10, r2)
            r0 = 2131951667(0x7f130033, float:1.9539755E38)
            java.lang.String r0 = defpackage.yh2.O(r10, r0)
            r2 = r13
            ma5 r2 = (defpackage.ma5) r2
            int r6 = r2.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2}
            r6 = 2131952389(0x7f130305, float:1.954122E38)
            java.lang.String r6 = defpackage.yh2.N(r6, r2, r10)
            r11 = r5 & 14
            r12 = 388(0x184, float:5.44E-43)
            r2 = 0
            r7 = 0
            r8 = 0
            r5 = r0
            r0 = r16
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            goto L1c2
        Le2:
            boolean r0 = r13 instanceof defpackage.na5
            if (r0 == 0) goto L115
            r0 = 585939146(0x22ecb8ca, float:6.416358E-18)
            r10.b0(r0)
            e33 r3 = defpackage.ej2.G()
            java.lang.String r4 = defpackage.yh2.O(r10, r2)
            r0 = 2131952004(0x7f130184, float:1.9540438E38)
            java.lang.String r0 = defpackage.yh2.O(r10, r0)
            r2 = 2131952393(0x7f130309, float:1.9541227E38)
            java.lang.String r6 = defpackage.yh2.O(r10, r2)
            r11 = r5 & 14
            r12 = 388(0x184, float:5.44E-43)
            r2 = 0
            r7 = 0
            r8 = 0
            r5 = r0
            r0 = r16
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            goto L1c2
        L115:
            boolean r0 = r13 instanceof defpackage.la5
            r2 = 113246208(0x6c00000, float:7.2222373E-35)
            if (r0 == 0) goto L14d
            r0 = 586375657(0x22f361e9, float:6.596895E-18)
            r10.b0(r0)
            e33 r3 = defpackage.ds7.b()
            java.lang.String r4 = defpackage.yh2.O(r10, r4)
            r0 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r0 = defpackage.yh2.O(r10, r0)
            r6 = 2131951666(0x7f130032, float:1.9539753E38)
            java.lang.String r6 = defpackage.yh2.O(r10, r6)
            es7 r7 = defpackage.fs7.a
            long r8 = r7.j
            r5 = r5 & 14
            r11 = r5 | r2
            r12 = 4
            r2 = 0
            r7 = 2
            r5 = r0
            r0 = r16
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            goto L1c2
        L14d:
            boolean r0 = r13 instanceof defpackage.oa5
            if (r0 == 0) goto L182
            r0 = 586911461(0x22fb8ee5, float:6.818498E-18)
            r10.b0(r0)
            e33 r3 = defpackage.ds7.b()
            java.lang.String r4 = defpackage.yh2.O(r10, r4)
            r0 = 2131951668(0x7f130034, float:1.9539757E38)
            java.lang.String r0 = defpackage.yh2.O(r10, r0)
            r6 = 2131951669(0x7f130035, float:1.953976E38)
            java.lang.String r6 = defpackage.yh2.O(r10, r6)
            es7 r7 = defpackage.fs7.a
            long r8 = r7.j
            r5 = r5 & 14
            r11 = r5 | r2
            r12 = 4
            r2 = 0
            r7 = 2
            r5 = r0
            r0 = r16
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            goto L1c2
        L182:
            boolean r0 = r13 instanceof defpackage.pa5
            if (r0 == 0) goto L1b7
            r0 = 587461463(0x2303f357, float:7.1530534E-18)
            r10.b0(r0)
            e33 r3 = defpackage.ds7.b()
            java.lang.String r4 = defpackage.yh2.O(r10, r4)
            r0 = 2131952308(0x7f1302b4, float:1.9541055E38)
            java.lang.String r0 = defpackage.yh2.O(r10, r0)
            r6 = 2131952307(0x7f1302b3, float:1.9541053E38)
            java.lang.String r6 = defpackage.yh2.O(r10, r6)
            es7 r7 = defpackage.fs7.a
            long r8 = r7.j
            r5 = r5 & 14
            r11 = r5 | r2
            r12 = 4
            r2 = 0
            r7 = 2
            r5 = r0
            r0 = r16
            defpackage.ls7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r10.p(r15)
            goto L1c2
        L1b7:
            r0 = 1404338292(0x53b48074, float:1.5504984E12)
            ug r0 = defpackage.xg6.f(r10, r0, r15)
            throw r0
        L1bf:
            r10.V()
        L1c2:
            cf5 r1 = r10.t()
            if (r1 == 0) goto L1cf
            sa5 r2 = new sa5
            r2.<init>(r0, r14, r15, r13)
            r1.d = r2
        L1cf:
            return
    }

    public static final void j(defpackage.a74 r15, defpackage.lq4 r16, defpackage.pq5 r17, defpackage.cu5 r18, defpackage.qn2 r19, defpackage.on2 r20, defpackage.eo2 r21, defpackage.px0 r22, int r23) {
            r7 = r21
            r15.getClass()
            r16.getClass()
            r17.getClass()
            r18.getClass()
            r19.getClass()
            r20.getClass()
            r0 = r22
            xq2 r0 = (defpackage.xq2) r0
            r1 = 1562456105(0x5d213029, float:7.259268E17)
            r0.d0(r1)
            boolean r1 = r0.f(r15)
            if (r1 == 0) goto L26
            r1 = 4
            goto L27
        L26:
            r1 = 2
        L27:
            r1 = r23 | r1
            r11 = r16
            boolean r2 = r0.f(r11)
            if (r2 == 0) goto L34
            r2 = 32
            goto L36
        L34:
            r2 = 16
        L36:
            r1 = r1 | r2
            r12 = r17
            boolean r2 = r0.h(r12)
            if (r2 == 0) goto L42
            r2 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r2 = 128(0x80, float:1.8E-43)
        L44:
            r1 = r1 | r2
            r9 = r18
            boolean r2 = r0.f(r9)
            if (r2 == 0) goto L50
            r2 = 2048(0x800, float:2.87E-42)
            goto L52
        L50:
            r2 = 1024(0x400, float:1.435E-42)
        L52:
            r1 = r1 | r2
            r13 = r19
            boolean r2 = r0.h(r13)
            if (r2 == 0) goto L5e
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L60
        L5e:
            r2 = 8192(0x2000, float:1.148E-41)
        L60:
            r1 = r1 | r2
            r14 = r20
            boolean r2 = r0.h(r14)
            if (r2 == 0) goto L6c
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L6e
        L6c:
            r2 = 65536(0x10000, float:9.1835E-41)
        L6e:
            r1 = r1 | r2
            boolean r2 = r0.h(r7)
            if (r2 == 0) goto L78
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L7a
        L78:
            r2 = 524288(0x80000, float:7.34684E-40)
        L7a:
            r1 = r1 | r2
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r1
            r3 = 599186(0x92492, float:8.39638E-40)
            r4 = 1
            if (r2 == r3) goto L87
            r2 = r4
            goto L88
        L87:
            r2 = 0
        L88:
            r1 = r1 & r4
            boolean r1 = r0.S(r1, r2)
            if (r1 == 0) goto La8
            py0 r1 = defpackage.lt5.a
            pq r1 = r1.a(r7)
            c4 r8 = new c4
            r10 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2 = -1152441111(0xffffffffbb4f24e9, float:-0.0031607694)
            zv0 r2 = defpackage.n16.I(r2, r8, r0)
            r3 = 56
            defpackage.hv.d(r1, r2, r0, r3)
            goto Lab
        La8:
            r0.V()
        Lab:
            cf5 r9 = r0.t()
            if (r9 == 0) goto Lc5
            fo0 r0 = new fo0
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        Lc5:
            return
    }

    public static final long k(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final java.lang.String l(java.lang.Object[] r3, int r4, int r5, defpackage.d1 r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L2a
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            if (r2 != r6) goto L24
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L27
        L24:
            r0.append(r2)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static void n(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 0
            r2 = 30
            java.lang.String r3 = r3.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number string too large: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "..."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void o(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.Object p(defpackage.r41 r2, defpackage.qn2 r3, defpackage.m16 r4) {
            boolean r0 = r4.k()
            if (r0 == 0) goto L17
            boolean r0 = r4.n()
            if (r0 == 0) goto L17
            boolean r0 = r4.l()
            if (r0 == 0) goto L17
            java.lang.Object r2 = r3.g(r2)
            return r2
        L17:
            l61 r0 = r2.b()
            wj0 r1 = defpackage.wj0.L
            j61 r0 = r0.Z(r1)
            if (r0 != 0) goto L28
            java.lang.Object r2 = r3.g(r2)
            return r2
        L28:
            java.lang.Object r2 = X(r2, r3, r4)
            return r2
    }

    public static long q(long r4, defpackage.hn3 r6) {
            hn3 r0 = defpackage.hn3.Horizontal
            if (r6 != r0) goto L9
            int r1 = defpackage.q21.j(r4)
            goto Ld
        L9:
            int r1 = defpackage.q21.i(r4)
        Ld:
            if (r6 != r0) goto L14
            int r2 = defpackage.q21.h(r4)
            goto L18
        L14:
            int r2 = defpackage.q21.g(r4)
        L18:
            if (r6 != r0) goto L1f
            int r3 = defpackage.q21.i(r4)
            goto L23
        L1f:
            int r3 = defpackage.q21.j(r4)
        L23:
            if (r6 != r0) goto L2a
            int r4 = defpackage.q21.g(r4)
            goto L2e
        L2a:
            int r4 = defpackage.q21.h(r4)
        L2e:
            long r4 = defpackage.s21.a(r1, r2, r3, r4)
            return r4
    }

    public static long r(int r2, long r3) {
            int r0 = defpackage.q21.h(r3)
            r2 = r2 & 4
            r1 = 0
            if (r2 == 0) goto Le
            int r2 = defpackage.q21.i(r3)
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r3 = defpackage.q21.g(r3)
            long r2 = defpackage.s21.a(r1, r0, r2, r3)
            return r2
    }

    public static defpackage.k54 s(defpackage.ar0 r2, java.lang.String r3) {
            java.util.HashMap r0 = defpackage.k54.c
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            k54 r1 = new k54     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L28
        L14:
            k54 r1 = (defpackage.k54) r1     // Catch: java.lang.Throwable -> L12
            ar0 r3 = r1.b     // Catch: java.lang.Throwable -> L12
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L20
            monitor-exit(r0)
            return r1
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "Check failed."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L28:
            monitor-exit(r0)
            throw r2
    }

    public static android.content.Intent t(android.content.Context r14, defpackage.pa r15) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            r3 = 0
            if (r0 < r1) goto L97
            java.lang.Class r1 = defpackage.is1.f()
            java.lang.Object r14 = r14.getSystemService(r1)
            android.content.pm.ShortcutManager r14 = defpackage.is1.e(r14)
            defpackage.is1.g()
            java.lang.Object r1 = r15.B
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r4 = r15.L
            java.lang.String r4 = (java.lang.String) r4
            android.content.pm.ShortcutInfo$Builder r1 = defpackage.is1.a(r1, r4)
            java.lang.Object r4 = r15.X
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.content.pm.ShortcutInfo$Builder r1 = defpackage.is1.b(r1, r4)
            java.lang.Object r4 = r15.R
            android.content.Intent[] r4 = (android.content.Intent[]) r4
            android.content.pm.ShortcutInfo$Builder r1 = defpackage.is1.c(r1, r4)
            java.lang.Object r4 = r15.Y
            androidx.core.graphics.drawable.IconCompat r4 = (androidx.core.graphics.drawable.IconCompat) r4
            if (r4 == 0) goto L44
            java.lang.Object r5 = r15.B
            android.content.Context r5 = (android.content.Context) r5
            android.graphics.drawable.Icon r4 = r4.f(r5)
            defpackage.is1.i(r1, r4)
        L44:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L4d
            defpackage.is1.h(r1)
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L56
            defpackage.is1.m(r1)
        L56:
            defpackage.is1.n(r1)
            java.lang.Object r4 = r15.Z
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4
            if (r4 == 0) goto L62
            defpackage.is1.j(r1, r4)
        L62:
            r4 = 29
            if (r0 < r4) goto L6a
            defpackage.r74.r(r1)
            goto L87
        L6a:
            java.lang.Object r4 = r15.Z
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4
            if (r4 != 0) goto L77
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            r15.Z = r4
        L77:
            java.lang.Object r4 = r15.Z
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4
            java.lang.String r5 = "extraLongLived"
            r4.putBoolean(r5, r2)
            java.lang.Object r4 = r15.Z
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4
            defpackage.is1.j(r1, r4)
        L87:
            r4 = 33
            if (r0 < r4) goto L8e
            defpackage.r2.l(r1)
        L8e:
            android.content.pm.ShortcutInfo r0 = defpackage.is1.d(r1)
            android.content.Intent r14 = defpackage.q66.f(r14, r0)
            goto L98
        L97:
            r14 = r3
        L98:
            if (r14 != 0) goto L9f
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
        L9f:
            java.lang.Object r0 = r15.R
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            int r1 = r0.length
            r4 = 1
            int r1 = r1 - r4
            r0 = r0[r1]
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r0 = r14.putExtra(r1, r0)
            java.lang.Object r1 = r15.X
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "android.intent.extra.shortcut.NAME"
            r0.putExtra(r5, r1)
            java.lang.Object r0 = r15.Y
            androidx.core.graphics.drawable.IconCompat r0 = (androidx.core.graphics.drawable.IconCompat) r0
            if (r0 == 0) goto L1b1
            java.lang.Object r15 = r15.B
            android.content.Context r15 = (android.content.Context) r15
            int r1 = r0.a
            r5 = 2
            if (r1 != r5) goto L165
            java.lang.Object r1 = r0.b
            if (r1 == 0) goto L165
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = ":"
            boolean r7 = r1.contains(r6)
            if (r7 != 0) goto Lda
            goto L165
        Lda:
            r7 = -1
            java.lang.String[] r8 = r1.split(r6, r7)
            r8 = r8[r4]
            java.lang.String r9 = "/"
            java.lang.String[] r10 = r8.split(r9, r7)
            r10 = r10[r2]
            java.lang.String[] r8 = r8.split(r9, r7)
            r8 = r8[r4]
            java.lang.String[] r6 = r1.split(r6, r7)
            r6 = r6[r2]
            java.lang.String r7 = "0_resource_name_obfuscated"
            boolean r7 = r7.equals(r8)
            java.lang.String r9 = "IconCompat"
            if (r7 == 0) goto L105
            java.lang.String r1 = "Found obfuscated resource, not trying to update resource id for it"
            android.util.Log.i(r9, r1)
            goto L165
        L105:
            java.lang.String r7 = r0.d()
            java.lang.String r11 = "android"
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L116
            android.content.res.Resources r11 = android.content.res.Resources.getSystem()
            goto L142
        L116:
            android.content.pm.PackageManager r11 = r15.getPackageManager()
            r12 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r12 = r11.getApplicationInfo(r7, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L127
            if (r12 == 0) goto L129
            android.content.res.Resources r11 = r11.getResourcesForApplication(r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L127
            goto L142
        L127:
            r11 = move-exception
            goto L12b
        L129:
            r11 = r3
            goto L142
        L12b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unable to find pkg="
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r13 = " for icon"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r9, r12, r11)
            goto L129
        L142:
            int r6 = r11.getIdentifier(r8, r10, r6)
            int r8 = r0.e
            if (r8 == r6) goto L165
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Id has changed for "
            r8.<init>(r10)
            r8.append(r7)
            java.lang.String r7 = " "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            android.util.Log.i(r9, r1)
            r0.e = r6
        L165:
            int r1 = r0.a
            if (r1 == r4) goto L1a8
            if (r1 == r5) goto L17d
            r15 = 5
            if (r1 != r15) goto L177
            java.lang.Object r15 = r0.b
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            android.graphics.Bitmap r15 = androidx.core.graphics.drawable.IconCompat.a(r15, r4)
            goto L1ac
        L177:
            java.lang.String r14 = "Icon type not supported for intent shortcuts"
            defpackage.i.h(r14)
            return r3
        L17d:
            java.lang.String r1 = r0.d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L191
            android.content.Context r15 = r15.createPackageContext(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L191
            java.lang.String r1 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r2 = r0.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L191
            android.content.Intent$ShortcutIconResource r15 = android.content.Intent.ShortcutIconResource.fromContext(r15, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L191
            r14.putExtra(r1, r15)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L191
            goto L1b1
        L191:
            r14 = move-exception
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.Object r0 = r0.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't find package "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0, r14)
            throw r15
        L1a8:
            java.lang.Object r15 = r0.b
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
        L1ac:
            java.lang.String r0 = "android.intent.extra.shortcut.ICON"
            r14.putExtra(r0, r15)
        L1b1:
            return r14
    }

    public static java.lang.String u(defpackage.ea0 r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L8f
            byte r2 = r5.a(r1)
            r3 = 34
            if (r2 == r3) goto L86
            r3 = 39
            if (r2 == r3) goto L80
            r3 = 92
            if (r2 == r3) goto L7a
            switch(r2) {
                case 7: goto L74;
                case 8: goto L6e;
                case 9: goto L68;
                case 10: goto L62;
                case 11: goto L5c;
                case 12: goto L56;
                case 13: goto L50;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L30
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L30
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L30:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L50:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L8b
        L56:
            java.lang.String r2 = "\\f"
            r0.append(r2)
            goto L8b
        L5c:
            java.lang.String r2 = "\\v"
            r0.append(r2)
            goto L8b
        L62:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L8b
        L68:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L8b
        L6e:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L8b
        L74:
            java.lang.String r2 = "\\a"
            r0.append(r2)
            goto L8b
        L7a:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L8b
        L80:
            java.lang.String r2 = "\\'"
            r0.append(r2)
            goto L8b
        L86:
            java.lang.String r2 = "\\\""
            r0.append(r2)
        L8b:
            int r1 = r1 + 1
            goto La
        L8f:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static final java.lang.Object v(defpackage.jz4 r2, java.lang.String r3, defpackage.s41 r4) {
            h37 r0 = new h37
            r1 = 6
            r0.<init>(r1)
            java.lang.Object r2 = r2.b(r3, r0, r4)
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r2 != r3) goto Lf
            return r2
        Lf:
            jg7 r2 = defpackage.jg7.a
            return r2
    }

    public static final int w(int r3, java.lang.CharSequence r4) {
            int r0 = r4.length()
        L4:
            if (r3 >= r0) goto L12
            char r1 = r4.charAt(r3)
            r2 = 10
            if (r1 != r2) goto Lf
            return r3
        Lf:
            int r3 = r3 + 1
            goto L4
        L12:
            int r3 = r4.length()
            return r3
    }

    public static final int x(int r2, java.lang.CharSequence r3) {
        L0:
            if (r2 <= 0) goto L10
            int r0 = r2 + (-1)
            char r0 = r3.charAt(r0)
            r1 = 10
            if (r0 != r1) goto Ld
            return r2
        Ld:
            int r2 = r2 + (-1)
            goto L0
        L10:
            r2 = 0
            return r2
    }

    public static /* synthetic */ defpackage.le2 y(defpackage.ro2 r1, defpackage.l61 r2, int r3, defpackage.m80 r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            vt1 r2 = defpackage.vt1.A
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            r3 = -3
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L11
            m80 r4 = defpackage.m80.SUSPEND
        L11:
            le2 r1 = r1.c(r2, r3, r4)
            return r1
    }

    public static final java.lang.String z(java.lang.Object r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public abstract java.lang.Object A(defpackage.ar0 r1);

    public abstract defpackage.qo2 F(defpackage.ar0 r1, java.lang.Object r2);

    public abstract void m();
}
