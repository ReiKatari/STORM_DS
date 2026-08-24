package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m66  reason: default package */
/* loaded from: classes.dex */
public abstract class m66 {
    public static final java.lang.Class a = null;
    public static final defpackage.ng7 b = null;
    public static final defpackage.ng7 c = null;
    public static final defpackage.ng7 d = null;

    static {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            defpackage.m66.a = r0
            r0 = 0
            ng7 r0 = w(r0)
            defpackage.m66.b = r0
            r0 = 1
            ng7 r0 = w(r0)
            defpackage.m66.c = r0
            ng7 r0 = new ng7
            r0.<init>()
            defpackage.m66.d = r0
            return
    }

    public static void A(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L60
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L60
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L45
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2b
            java.lang.Object r1 = r3.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r5 = r5 + 1
            int r2 = r2 + 1
            goto L15
        L2b:
            r4.s(r5)
        L2e:
            int r2 = r3.size()
            if (r0 >= r2) goto L60
            java.lang.Object r2 = r3.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            byte r2 = (byte) r2
            r4.k(r2)
            int r0 = r0 + 1
            goto L2e
        L45:
            r5 = r0
        L46:
            int r1 = r3.size()
            if (r5 >= r1) goto L60
            java.lang.Object r1 = r3.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r4.r(r2, r0)
            byte r1 = (byte) r1
            r4.k(r1)
            int r5 = r5 + 1
            goto L46
        L60:
            return
    }

    public static void B(int r5, java.util.List r6, defpackage.os0 r7) {
            if (r6 == 0) goto L39
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L39
            r7.getClass()
            r0 = 0
        Lc:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r7.B
            ms0 r1 = (defpackage.ms0) r1
            java.lang.Object r2 = r6.get(r0)
            ea0 r2 = (defpackage.ea0) r2
            r3 = 2
            r1.r(r5, r3)
            int r3 = r2.size()
            r1.s(r3)
            ca0 r2 = (defpackage.ca0) r2
            byte[] r3 = r2.R
            int r4 = r2.g()
            int r2 = r2.size()
            r1.l(r3, r4, r2)
            int r0 = r0 + 1
            goto Lc
        L39:
            return
    }

    public static void C(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L65
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L65
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L48
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L2b
            java.lang.Object r1 = r4.get(r3)
            java.lang.Double r1 = (java.lang.Double) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L15
        L2b:
            r5.s(r6)
        L2e:
            int r3 = r4.size()
            if (r0 >= r3) goto L65
            java.lang.Object r3 = r4.get(r0)
            java.lang.Double r3 = (java.lang.Double) r3
            double r1 = r3.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r5.p(r1)
            int r0 = r0 + 1
            goto L2e
        L48:
            int r6 = r4.size()
            if (r0 >= r6) goto L65
            java.lang.Object r6 = r4.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            r5.getClass()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r5.o(r3, r1)
            int r0 = r0 + 1
            goto L48
        L65:
            return
    }

    public static void D(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L60
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L60
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L46
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2d
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = defpackage.ms0.f(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L15
        L2d:
            r4.s(r5)
        L30:
            int r2 = r3.size()
            if (r0 >= r2) goto L60
            java.lang.Object r2 = r3.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.q(r2)
            int r0 = r0 + 1
            goto L30
        L46:
            r5 = r0
        L47:
            int r1 = r3.size()
            if (r5 >= r1) goto L60
            java.lang.Object r1 = r3.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.r(r2, r0)
            r4.q(r1)
            int r5 = r5 + 1
            goto L47
        L60:
            return
    }

    public static void E(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L5a
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5a
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L44
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2b
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L15
        L2b:
            r4.s(r5)
        L2e:
            int r2 = r3.size()
            if (r0 >= r2) goto L5a
            java.lang.Object r2 = r3.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.n(r2)
            int r0 = r0 + 1
            goto L2e
        L44:
            int r5 = r3.size()
            if (r0 >= r5) goto L5a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.m(r2, r5)
            int r0 = r0 + 1
            goto L44
        L5a:
            return
    }

    public static void F(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L5a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5a
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L44
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L2b
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L15
        L2b:
            r5.s(r6)
        L2e:
            int r3 = r4.size()
            if (r0 >= r3) goto L5a
            java.lang.Object r3 = r4.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r1 = r3.longValue()
            r5.p(r1)
            int r0 = r0 + 1
            goto L2e
        L44:
            int r6 = r4.size()
            if (r0 >= r6) goto L5a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.o(r3, r1)
            int r0 = r0 + 1
            goto L44
        L5a:
            return
    }

    public static void G(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L65
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L65
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L48
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2b
            java.lang.Object r1 = r3.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L15
        L2b:
            r4.s(r5)
        L2e:
            int r2 = r3.size()
            if (r0 >= r2) goto L65
            java.lang.Object r2 = r3.get(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r4.n(r2)
            int r0 = r0 + 1
            goto L2e
        L48:
            int r5 = r3.size()
            if (r0 >= r5) goto L65
            java.lang.Object r5 = r3.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r4.getClass()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r4.m(r2, r5)
            int r0 = r0 + 1
            goto L48
        L65:
            return
    }

    public static void H(int r2, java.util.List r3, defpackage.os0 r4, defpackage.j66 r5) {
            if (r3 == 0) goto L1c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1c
            r4.getClass()
            r0 = 0
        Lc:
            int r1 = r3.size()
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = r3.get(r0)
            r4.o0(r2, r1, r5)
            int r0 = r0 + 1
            goto Lc
        L1c:
            return
    }

    public static void I(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L60
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L60
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L46
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2d
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = defpackage.ms0.f(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L15
        L2d:
            r4.s(r5)
        L30:
            int r2 = r3.size()
            if (r0 >= r2) goto L60
            java.lang.Object r2 = r3.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.q(r2)
            int r0 = r0 + 1
            goto L30
        L46:
            r5 = r0
        L47:
            int r1 = r3.size()
            if (r5 >= r1) goto L60
            java.lang.Object r1 = r3.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.r(r2, r0)
            r4.q(r1)
            int r5 = r5 + 1
            goto L47
        L60:
            return
    }

    public static void J(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L5c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5c
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L46
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L2d
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = defpackage.ms0.j(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L15
        L2d:
            r5.s(r6)
        L30:
            int r3 = r4.size()
            if (r0 >= r3) goto L5c
            java.lang.Object r3 = r4.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r1 = r3.longValue()
            r5.u(r1)
            int r0 = r0 + 1
            goto L30
        L46:
            int r6 = r4.size()
            if (r0 >= r6) goto L5c
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.t(r3, r1)
            int r0 = r0 + 1
            goto L46
        L5c:
            return
    }

    public static void K(int r2, java.util.List r3, defpackage.os0 r4, defpackage.j66 r5) {
            if (r3 == 0) goto L1c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1c
            r4.getClass()
            r0 = 0
        Lc:
            int r1 = r3.size()
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = r3.get(r0)
            r4.r0(r2, r1, r5)
            int r0 = r0 + 1
            goto Lc
        L1c:
            return
    }

    public static void L(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L5a
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5a
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L44
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2b
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L15
        L2b:
            r4.s(r5)
        L2e:
            int r2 = r3.size()
            if (r0 >= r2) goto L5a
            java.lang.Object r2 = r3.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.n(r2)
            int r0 = r0 + 1
            goto L2e
        L44:
            int r5 = r3.size()
            if (r0 >= r5) goto L5a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.m(r2, r5)
            int r0 = r0 + 1
            goto L44
        L5a:
            return
    }

    public static void M(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L5a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5a
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L44
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L2b
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            java.util.logging.Logger r1 = defpackage.ms0.e
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L15
        L2b:
            r5.s(r6)
        L2e:
            int r3 = r4.size()
            if (r0 >= r3) goto L5a
            java.lang.Object r3 = r4.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r1 = r3.longValue()
            r5.p(r1)
            int r0 = r0 + 1
            goto L2e
        L44:
            int r6 = r4.size()
            if (r0 >= r6) goto L5a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.o(r3, r1)
            int r0 = r0 + 1
            goto L44
        L5a:
            return
    }

    public static void N(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L6f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L6f
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L50
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L32
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            int r1 = defpackage.ms0.i(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L15
        L32:
            r5.s(r6)
        L35:
            int r3 = r4.size()
            if (r0 >= r3) goto L6f
            java.lang.Object r3 = r4.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r6 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r6
            r5.s(r3)
            int r0 = r0 + 1
            goto L35
        L50:
            r6 = r0
        L51:
            int r1 = r4.size()
            if (r6 >= r1) goto L6f
            java.lang.Object r1 = r4.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            r5.r(r3, r0)
            r5.s(r1)
            int r6 = r6 + 1
            goto L51
        L6f:
            return
    }

    public static void O(int r7, java.util.List r8, defpackage.os0 r9, boolean r10) {
            if (r8 == 0) goto L6b
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L6b
            java.lang.Object r9 = r9.B
            ms0 r9 = (defpackage.ms0) r9
            r0 = 63
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L51
            r10 = 2
            r9.r(r7, r10)
            r7 = r2
            r10 = r7
        L18:
            int r3 = r8.size()
            if (r7 >= r3) goto L34
            java.lang.Object r3 = r8.get(r7)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r5 = r3 << r1
            long r3 = r3 >> r0
            long r3 = r3 ^ r5
            int r3 = defpackage.ms0.j(r3)
            int r10 = r10 + r3
            int r7 = r7 + 1
            goto L18
        L34:
            r9.s(r10)
        L37:
            int r7 = r8.size()
            if (r2 >= r7) goto L6b
            java.lang.Object r7 = r8.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            long r3 = r7.longValue()
            long r5 = r3 << r1
            long r3 = r3 >> r0
            long r3 = r3 ^ r5
            r9.u(r3)
            int r2 = r2 + 1
            goto L37
        L51:
            int r10 = r8.size()
            if (r2 >= r10) goto L6b
            java.lang.Object r10 = r8.get(r2)
            java.lang.Long r10 = (java.lang.Long) r10
            long r3 = r10.longValue()
            long r5 = r3 << r1
            long r3 = r3 >> r0
            long r3 = r3 ^ r5
            r9.t(r7, r3)
            int r2 = r2 + 1
            goto L51
        L6b:
            return
    }

    public static void P(int r12, java.util.List r13, defpackage.os0 r14) {
            if (r13 == 0) goto L136
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L136
            java.lang.Object r14 = r14.B
            ms0 r14 = (defpackage.ms0) r14
            boolean r0 = r13 instanceof defpackage.wr3
            java.lang.String r1 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r2 = 2
            r3 = 0
            if (r0 == 0) goto Lb7
            r0 = r13
            wr3 r0 = (defpackage.wr3) r0
            r4 = r3
        L18:
            int r5 = r13.size()
            if (r4 >= r5) goto L136
            java.lang.Object r5 = r0.v(r4)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L98
            java.lang.String r5 = (java.lang.String) r5
            r14.r(r12, r2)
            int r6 = r14.c
            byte[] r7 = r14.b
            int r8 = r14.d
            int r9 = r5.length()     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r9 = r9 * 3
            int r9 = defpackage.ms0.i(r9)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r10 = r5.length()     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r10 = defpackage.ms0.i(r10)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            if (r10 != r9) goto L5d
            int r9 = r8 + r10
            r14.d = r9     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r6 = r6 - r9
            nj2 r11 = defpackage.xj7.a     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r6 = r11.n(r5, r7, r9, r6)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            r14.d = r8     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r7 = r6 - r8
            int r7 = r7 - r10
            r14.s(r7)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            r14.d = r6     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            goto Lb3
        L5b:
            r6 = move-exception
            goto L77
        L5d:
            int r9 = defpackage.xj7.b(r5)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            r14.s(r9)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r9 = r14.d     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r6 = r6 - r9
            nj2 r10 = defpackage.xj7.a     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            int r6 = r10.n(r5, r7, r9, r6)     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            r14.d = r6     // Catch: defpackage.wj7 -> L5b java.lang.IndexOutOfBoundsException -> L70
            goto Lb3
        L70:
            r12 = move-exception
            ns0 r13 = new ns0
            r13.<init>(r12)
            throw r13
        L77:
            r14.d = r8
            java.util.logging.Logger r7 = defpackage.ms0.e
            java.util.logging.Level r8 = java.util.logging.Level.WARNING
            r7.log(r8, r1, r6)
            java.nio.charset.Charset r6 = defpackage.aa3.a
            byte[] r5 = r5.getBytes(r6)
            int r6 = r5.length     // Catch: defpackage.ns0 -> L8f java.lang.IndexOutOfBoundsException -> L91
            r14.s(r6)     // Catch: defpackage.ns0 -> L8f java.lang.IndexOutOfBoundsException -> L91
            int r6 = r5.length     // Catch: defpackage.ns0 -> L8f java.lang.IndexOutOfBoundsException -> L91
            r14.l(r5, r3, r6)     // Catch: defpackage.ns0 -> L8f java.lang.IndexOutOfBoundsException -> L91
            goto Lb3
        L8f:
            r12 = move-exception
            throw r12
        L91:
            r12 = move-exception
            ns0 r13 = new ns0
            r13.<init>(r12)
            throw r13
        L98:
            ea0 r5 = (defpackage.ea0) r5
            r14.r(r12, r2)
            int r6 = r5.size()
            r14.s(r6)
            ca0 r5 = (defpackage.ca0) r5
            byte[] r6 = r5.R
            int r7 = r5.g()
            int r5 = r5.size()
            r14.l(r6, r7, r5)
        Lb3:
            int r4 = r4 + 1
            goto L18
        Lb7:
            r0 = r3
        Lb8:
            int r4 = r13.size()
            if (r0 >= r4) goto L136
            java.lang.Object r4 = r13.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r14.r(r12, r2)
            int r5 = r14.c
            byte[] r6 = r14.b
            int r7 = r14.d
            int r8 = r4.length()     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r8 = r8 * 3
            int r8 = defpackage.ms0.i(r8)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r9 = r4.length()     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r9 = defpackage.ms0.i(r9)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            if (r9 != r8) goto Lf9
            int r8 = r7 + r9
            r14.d = r8     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r5 = r5 - r8
            nj2 r10 = defpackage.xj7.a     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r5 = r10.n(r4, r6, r8, r5)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            r14.d = r7     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r6 = r5 - r7
            int r6 = r6 - r9
            r14.s(r6)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            r14.d = r5     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            goto L12a
        Lf7:
            r5 = move-exception
            goto L113
        Lf9:
            int r8 = defpackage.xj7.b(r4)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            r14.s(r8)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r8 = r14.d     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r5 = r5 - r8
            nj2 r9 = defpackage.xj7.a     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            int r5 = r9.n(r4, r6, r8, r5)     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            r14.d = r5     // Catch: defpackage.wj7 -> Lf7 java.lang.IndexOutOfBoundsException -> L10c
            goto L12a
        L10c:
            r12 = move-exception
            ns0 r13 = new ns0
            r13.<init>(r12)
            throw r13
        L113:
            r14.d = r7
            java.util.logging.Logger r6 = defpackage.ms0.e
            java.util.logging.Level r7 = java.util.logging.Level.WARNING
            r6.log(r7, r1, r5)
            java.nio.charset.Charset r5 = defpackage.aa3.a
            byte[] r4 = r4.getBytes(r5)
            int r5 = r4.length     // Catch: defpackage.ns0 -> L12d java.lang.IndexOutOfBoundsException -> L12f
            r14.s(r5)     // Catch: defpackage.ns0 -> L12d java.lang.IndexOutOfBoundsException -> L12f
            int r5 = r4.length     // Catch: defpackage.ns0 -> L12d java.lang.IndexOutOfBoundsException -> L12f
            r14.l(r4, r3, r5)     // Catch: defpackage.ns0 -> L12d java.lang.IndexOutOfBoundsException -> L12f
        L12a:
            int r0 = r0 + 1
            goto Lb8
        L12d:
            r12 = move-exception
            throw r12
        L12f:
            r12 = move-exception
            ns0 r13 = new ns0
            r13.<init>(r12)
            throw r13
        L136:
            return
    }

    public static void Q(int r2, java.util.List r3, defpackage.os0 r4, boolean r5) {
            if (r3 == 0) goto L60
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L60
            java.lang.Object r4 = r4.B
            ms0 r4 = (defpackage.ms0) r4
            r0 = 0
            if (r5 == 0) goto L46
            r5 = 2
            r4.r(r2, r5)
            r2 = r0
            r5 = r2
        L15:
            int r1 = r3.size()
            if (r2 >= r1) goto L2d
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = defpackage.ms0.i(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L15
        L2d:
            r4.s(r5)
        L30:
            int r2 = r3.size()
            if (r0 >= r2) goto L60
            java.lang.Object r2 = r3.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.s(r2)
            int r0 = r0 + 1
            goto L30
        L46:
            r5 = r0
        L47:
            int r1 = r3.size()
            if (r5 >= r1) goto L60
            java.lang.Object r1 = r3.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.r(r2, r0)
            r4.s(r1)
            int r5 = r5 + 1
            goto L47
        L60:
            return
    }

    public static void R(int r3, java.util.List r4, defpackage.os0 r5, boolean r6) {
            if (r4 == 0) goto L5c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5c
            java.lang.Object r5 = r5.B
            ms0 r5 = (defpackage.ms0) r5
            r0 = 0
            if (r6 == 0) goto L46
            r6 = 2
            r5.r(r3, r6)
            r3 = r0
            r6 = r3
        L15:
            int r1 = r4.size()
            if (r3 >= r1) goto L2d
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = defpackage.ms0.j(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L15
        L2d:
            r5.s(r6)
        L30:
            int r3 = r4.size()
            if (r0 >= r3) goto L5c
            java.lang.Object r3 = r4.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r1 = r3.longValue()
            r5.u(r1)
            int r0 = r0 + 1
            goto L30
        L46:
            int r6 = r4.size()
            if (r0 >= r6) goto L5c
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.t(r3, r1)
            int r0 = r0 + 1
            goto L46
        L5c:
            return
    }

    public static int a(int r2, java.util.List r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = defpackage.ms0.h(r2)
            int r2 = r2 * r0
        Ld:
            int r0 = r3.size()
            if (r1 >= r0) goto L21
            java.lang.Object r0 = r3.get(r1)
            ea0 r0 = (defpackage.ea0) r0
            int r0 = defpackage.ms0.b(r0)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto Ld
        L21:
            return r2
    }

    public static int b(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = c(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int c(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof defpackage.a93
            if (r2 == 0) goto L16
            a93 r4 = (defpackage.a93) r4
            if (r0 > 0) goto L11
            return r1
        L11:
            r4.c(r1)
            r4 = 0
            throw r4
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L2b
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = defpackage.ms0.f(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2b:
            return r2
    }

    public static int d(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = defpackage.ms0.c(r0)
            int r0 = r0 * r1
            return r0
    }

    public static int e(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    public static int f(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = defpackage.ms0.d(r0)
            int r0 = r0 * r1
            return r0
    }

    public static int g(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    public static int h(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = i(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int i(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof defpackage.a93
            if (r2 == 0) goto L16
            a93 r4 = (defpackage.a93) r4
            if (r0 > 0) goto L11
            return r1
        L11:
            r4.c(r1)
            r4 = 0
            throw r4
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L2b
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = defpackage.ms0.f(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2b:
            return r2
    }

    public static int j(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = k(r2)
            int r2 = r2.size()
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r2
            int r1 = r1 + r0
            return r1
    }

    public static int k(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof defpackage.uy3
            if (r2 == 0) goto L16
            uy3 r5 = (defpackage.uy3) r5
            if (r0 > 0) goto L11
            return r1
        L11:
            r5.c(r1)
            r5 = 0
            throw r5
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L2b
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = defpackage.ms0.j(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2b:
            return r2
    }

    public static int l(int r6, java.util.List r7, defpackage.j66 r8) {
            int r0 = r7.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r6 = defpackage.ms0.h(r6)
            int r6 = r6 * r0
        Ld:
            if (r1 >= r0) goto L2f
            java.lang.Object r2 = r7.get(r1)
            c1 r2 = (defpackage.c1) r2
            r2.getClass()
            r3 = r2
            pr2 r3 = (defpackage.pr2) r3
            int r4 = r3.memoizedSerializedSize
            r5 = -1
            if (r4 != r5) goto L26
            int r4 = r8.i(r2)
            r3.memoizedSerializedSize = r4
        L26:
            int r2 = defpackage.ms0.i(r4)
            int r2 = r2 + r4
            int r6 = r6 + r2
            int r1 = r1 + 1
            goto Ld
        L2f:
            return r6
    }

    public static int m(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = n(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int n(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof defpackage.a93
            if (r2 == 0) goto L16
            a93 r5 = (defpackage.a93) r5
            if (r0 > 0) goto L11
            return r1
        L11:
            r5.c(r1)
            r5 = 0
            throw r5
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L30
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = defpackage.ms0.i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L30:
            return r2
    }

    public static int o(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = p(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int p(java.util.List r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof defpackage.uy3
            if (r2 == 0) goto L16
            uy3 r8 = (defpackage.uy3) r8
            if (r0 > 0) goto L11
            return r1
        L11:
            r8.c(r1)
            r8 = 0
            throw r8
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r8.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r5 = 1
            long r5 = r3 << r5
            r7 = 63
            long r3 = r3 >> r7
            long r3 = r3 ^ r5
            int r3 = defpackage.ms0.j(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L32:
            return r2
    }

    public static int q(int r4, java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = defpackage.ms0.h(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof defpackage.wr3
            if (r2 == 0) goto L37
            wr3 r5 = (defpackage.wr3) r5
        L13:
            if (r1 >= r0) goto L36
            java.lang.Object r2 = r5.v(r1)
            boolean r3 = r2 instanceof defpackage.ea0
            if (r3 == 0) goto L2b
            ea0 r2 = (defpackage.ea0) r2
            int r2 = r2.size()
            int r3 = defpackage.ms0.i(r2)
            int r3 = r3 + r2
            int r3 = r3 + r4
            r4 = r3
            goto L33
        L2b:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = defpackage.ms0.g(r2)
            int r2 = r2 + r4
            r4 = r2
        L33:
            int r1 = r1 + 1
            goto L13
        L36:
            return r4
        L37:
            if (r1 >= r0) goto L5a
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof defpackage.ea0
            if (r3 == 0) goto L4f
            ea0 r2 = (defpackage.ea0) r2
            int r2 = r2.size()
            int r3 = defpackage.ms0.i(r2)
            int r3 = r3 + r2
            int r3 = r3 + r4
            r4 = r3
            goto L57
        L4f:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = defpackage.ms0.g(r2)
            int r2 = r2 + r4
            r4 = r2
        L57:
            int r1 = r1 + 1
            goto L37
        L5a:
            return r4
    }

    public static int r(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = s(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int s(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof defpackage.a93
            if (r2 == 0) goto L16
            a93 r4 = (defpackage.a93) r4
            if (r0 > 0) goto L11
            return r1
        L11:
            r4.c(r1)
            r4 = 0
            throw r4
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L2b
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = defpackage.ms0.i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2b:
            return r2
    }

    public static int t(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = u(r2)
            int r1 = defpackage.ms0.h(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    public static int u(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof defpackage.uy3
            if (r2 == 0) goto L16
            uy3 r5 = (defpackage.uy3) r5
            if (r0 > 0) goto L11
            return r1
        L11:
            r5.c(r1)
            r5 = 0
            throw r5
        L16:
            r2 = r1
        L17:
            if (r1 >= r0) goto L2b
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = defpackage.ms0.j(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2b:
            return r2
    }

    public static java.lang.Object v(int r6, java.util.List r7, defpackage.y93 r8, java.lang.Object r9, defpackage.ng7 r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L38
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        Ld:
            if (r1 >= r0) goto L2e
            java.lang.Object r3 = r7.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            boolean r5 = r8.a(r4)
            if (r5 == 0) goto L27
            if (r1 == r2) goto L24
            r7.set(r2, r3)
        L24:
            int r2 = r2 + 1
            goto L2b
        L27:
            java.lang.Object r9 = z(r6, r4, r9, r10)
        L2b:
            int r1 = r1 + 1
            goto Ld
        L2e:
            if (r2 == r0) goto L37
            java.util.List r6 = r7.subList(r2, r0)
            r6.clear()
        L37:
            return r9
        L38:
            java.util.Iterator r7 = r7.iterator()
        L3c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r7.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r8.a(r0)
            if (r1 != 0) goto L3c
            java.lang.Object r9 = z(r6, r0, r9, r10)
            r7.remove()
            goto L3c
        L5a:
            return r9
    }

    public static defpackage.ng7 w(boolean r3) {
            r0 = 0
            java.lang.String r1 = "com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto Lc
            goto L25
        Lc:
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L25
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L25
            ng7 r3 = (defpackage.ng7) r3     // Catch: java.lang.Throwable -> L25
            return r3
        L25:
            return r0
    }

    public static void x(defpackage.ng7 r6, java.lang.Object r7, java.lang.Object r8) {
            r6.getClass()
            pr2 r7 = (defpackage.pr2) r7
            mg7 r6 = r7.unknownFields
            pr2 r8 = (defpackage.pr2) r8
            mg7 r8 = r8.unknownFields
            mg7 r0 = defpackage.mg7.f
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L14
            goto L3e
        L14:
            int r0 = r6.a
            int r1 = r8.a
            int r0 = r0 + r1
            int[] r1 = r6.b
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r8.b
            int r3 = r6.a
            int r4 = r8.a
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.c
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r8.c
            int r6 = r6.a
            int r8 = r8.a
            java.lang.System.arraycopy(r3, r5, r2, r6, r8)
            mg7 r6 = new mg7
            r8 = 1
            r6.<init>(r0, r1, r2, r8)
        L3e:
            r7.unknownFields = r6
            return
    }

    public static boolean y(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static java.lang.Object z(int r2, int r3, java.lang.Object r4, defpackage.ng7 r5) {
            if (r4 != 0) goto L9
            r5.getClass()
            mg7 r4 = defpackage.mg7.b()
        L9:
            long r0 = (long) r3
            r5.getClass()
            r3 = r4
            mg7 r3 = (defpackage.mg7) r3
            int r2 = r2 << 3
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r3.c(r2, r5)
            return r4
    }
}
