package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj2  reason: default package */
/* loaded from: classes.dex */
public abstract class uj2 implements defpackage.kp7 {
    public static boolean a = false;
    public static java.lang.reflect.Method b = null;
    public static boolean c = false;
    public static java.lang.reflect.Field d;
    public static defpackage.e33 e;
    public static final /* synthetic */ int f = 0;
    public static defpackage.e33 g;

    public static final int A(int r7, java.util.List r8) {
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L8:
            if (r3 > r0) goto L2b
            int r4 = r3 + r0
            int r4 = r4 >>> r1
            java.lang.Object r5 = r8.get(r4)
            yr4 r5 = (defpackage.yr4) r5
            int r6 = r5.d
            if (r6 <= r7) goto L19
            r5 = r1
            goto L20
        L19:
            int r5 = r5.e
            if (r5 > r7) goto L1f
            r5 = -1
            goto L20
        L1f:
            r5 = r2
        L20:
            if (r5 >= 0) goto L25
            int r3 = r4 + 1
            goto L8
        L25:
            if (r5 <= 0) goto L2a
            int r0 = r4 + (-1)
            goto L8
        L2a:
            return r4
        L2b:
            int r3 = r3 + r1
            int r7 = -r3
            return r7
    }

    public static final int B(java.util.ArrayList r7, float r8) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L7
            return r1
        L7:
            java.lang.Object r0 = defpackage.gt0.Q0(r7)
            yr4 r0 = (defpackage.yr4) r0
            float r0 = r0.g
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L1a
            int r7 = r7.size()
            int r7 = r7 - r2
            return r7
        L1a:
            int r0 = r7.size()
            int r0 = r0 - r2
            r3 = r1
        L20:
            if (r3 > r0) goto L47
            int r4 = r3 + r0
            int r4 = r4 >>> r2
            java.lang.Object r5 = r7.get(r4)
            yr4 r5 = (defpackage.yr4) r5
            float r6 = r5.f
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L33
            r5 = r2
            goto L3c
        L33:
            float r5 = r5.g
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L3b
            r5 = -1
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 >= 0) goto L41
            int r3 = r4 + 1
            goto L20
        L41:
            if (r5 <= 0) goto L46
            int r0 = r4 + (-1)
            goto L20
        L46:
            return r4
        L47:
            int r3 = r3 + r2
            int r7 = -r3
            return r7
    }

    public static final void C(java.util.ArrayList r5, long r6, defpackage.qn2 r8) {
            int r0 = defpackage.k47.f(r6)
            int r0 = z(r0, r5)
            int r1 = r5.size()
        Lc:
            if (r0 >= r1) goto L28
            java.lang.Object r2 = r5.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            int r3 = r2.b
            int r4 = defpackage.k47.e(r6)
            if (r3 >= r4) goto L28
            int r3 = r2.b
            int r4 = r2.c
            if (r3 == r4) goto L25
            r8.g(r2)
        L25:
            int r0 = r0 + 1
            goto Lc
        L28:
            return
    }

    public static final boolean D(int r8, defpackage.ln r9, defpackage.vh2 r10, defpackage.of5 r11) {
            boolean r0 = b0(r8, r9, r10, r11)
            if (r0 == 0) goto L8
            r8 = 1
            return r8
        L8:
            zp4 r0 = defpackage.nc1.g0(r10)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r2 = r0.f()
            am4 r1 = new am4
            r7 = 1
            r5 = r8
            r6 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.nb3.X(r3, r5, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L2f
            boolean r8 = r8.booleanValue()
            return r8
        L2f:
            r8 = 0
            return r8
    }

    public static final java.util.ArrayList G(defpackage.eb3 r5) {
            r5.getClass()
            kz3 r5 = (defpackage.kz3) r5
            sm3 r5 = r5.F0()
            boolean r0 = V(r5)
            java.util.List r5 = r5.o()
            java.util.ArrayList r1 = new java.util.ArrayList
            aa4 r5 = (defpackage.aa4) r5
            java.lang.Object r2 = r5.B
            ua4 r2 = (defpackage.ua4) r2
            int r3 = r2.L
            r1.<init>(r3)
            int r2 = r2.L
            r3 = 0
        L21:
            if (r3 >= r2) goto L3a
            java.lang.Object r4 = r5.get(r3)
            sm3 r4 = (defpackage.sm3) r4
            if (r0 == 0) goto L30
            java.util.List r4 = r4.l()
            goto L34
        L30:
            java.util.List r4 = r4.m()
        L34:
            r1.add(r4)
            int r3 = r3 + 1
            goto L21
        L3a:
            return r1
    }

    public static final int I(android.os.Bundle r2, java.lang.String r3) {
            r3.getClass()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.getInt(r3, r0)
            if (r1 != r0) goto L1a
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2.getInt(r3, r0)
            if (r2 == r0) goto L15
            goto L1a
        L15:
            defpackage.xk2.B(r3)
            r2 = 0
            throw r2
        L1a:
            return r1
    }

    public static final defpackage.e33 L() {
            e33 r0 = defpackage.uj2.e
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "AutoMirrored.Filled.Logout"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1088421888(0x40e00000, float:7.0)
            r5 = 1099431936(0x41880000, float:17.0)
            r4.o(r5, r2)
            r2 = -1078691103(0xffffffffbfb47ae1, float:-1.41)
            r6 = 1068792545(0x3fb47ae1, float:1.41)
            r4.n(r2, r6)
            r2 = 1100045353(0x41915c29, float:18.17)
            r6 = 1093664768(0x41300000, float:11.0)
            r4.m(r2, r6)
            r2 = 1090519040(0x41000000, float:8.0)
            r4.k(r2)
            r6 = 1073741824(0x40000000, float:2.0)
            r4.u(r6)
            r6 = 1092794450(0x4122b852, float:10.17)
            r4.l(r6)
            r6 = -1071309128(0xffffffffc0251eb8, float:-2.58)
            r7 = 1076174520(0x40251eb8, float:2.58)
            r4.n(r6, r7)
            r4.m(r5, r5)
            r5 = -1063256064(0xffffffffc0a00000, float:-5.0)
            r11 = 1084227584(0x40a00000, float:5.0)
            r4.n(r11, r5)
            r4.g()
            r12 = 1082130432(0x40800000, float:4.0)
            r4.o(r12, r11)
            r4.l(r2)
            r5 = 1077936128(0x40400000, float:3.0)
            r4.t(r5)
            r4.k(r12)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r6 = 0
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1096810496(0x41600000, float:14.0)
            r4.u(r5)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.l(r2)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.u(r2)
            r4.k(r12)
            r4.t(r11)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.uj2.e = r0
            return r0
    }

    public static final android.os.Bundle N(android.os.Bundle r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            defpackage.xk2.B(r1)
            r0 = 0
            throw r0
    }

    public static final java.util.ArrayList O(android.os.Bundle r3, java.lang.String r4) {
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Class r0 = r0.a
            r0.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L16
            java.util.ArrayList r3 = defpackage.r2.d(r3, r4, r0)
            goto L1a
        L16:
            java.util.ArrayList r3 = r3.getParcelableArrayList(r4)
        L1a:
            if (r3 == 0) goto L1d
            return r3
        L1d:
            defpackage.xk2.B(r4)
            r3 = 0
            throw r3
    }

    public static final java.lang.String P(android.os.Bundle r0, java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto La
            return r0
        La:
            defpackage.xk2.B(r1)
            r0 = 0
            throw r0
    }

    public static final java.lang.String[] Q(android.os.Bundle r0, java.lang.String r1) {
            r1.getClass()
            java.lang.String[] r0 = r0.getStringArray(r1)
            if (r0 == 0) goto La
            return r0
        La:
            defpackage.xk2.B(r1)
            r0 = 0
            throw r0
    }

    public static final int R(int r0, int r1) {
            int r0 = r0 >> r1
            r0 = r0 & 31
            return r0
    }

    public static final boolean S(defpackage.of5 r2, defpackage.of5 r3, defpackage.of5 r4, int r5) {
            boolean r0 = T(r5, r2, r4)
            if (r0 != 0) goto L7
            goto L2a
        L7:
            boolean r0 = T(r5, r3, r4)
            if (r0 != 0) goto Le
            goto L28
        Le:
            boolean r0 = p(r4, r2, r3, r5)
            if (r0 == 0) goto L15
            goto L28
        L15:
            boolean r0 = p(r4, r3, r2, r5)
            if (r0 == 0) goto L1c
            goto L2a
        L1c:
            long r0 = U(r5, r4, r2)
            long r2 = U(r5, r4, r3)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2a
        L28:
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static final boolean T(int r3, defpackage.of5 r4, defpackage.of5 r5) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L1b
            float r3 = r5.c
            float r5 = r5.a
            float r0 = r4.c
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L13
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L1a
        L13:
            float r3 = r4.a
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1a
            return r2
        L1a:
            return r1
        L1b:
            r0 = 4
            if (r3 != r0) goto L34
            float r3 = r5.a
            float r5 = r5.c
            float r0 = r4.a
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L2c
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L33
        L2c:
            float r3 = r4.c
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L33
            return r2
        L33:
            return r1
        L34:
            r0 = 5
            if (r3 != r0) goto L4d
            float r3 = r5.d
            float r5 = r5.b
            float r0 = r4.d
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L45
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L4c
        L45:
            float r3 = r4.b
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4c
            return r2
        L4c:
            return r1
        L4d:
            r0 = 6
            if (r3 != r0) goto L66
            float r3 = r5.b
            float r5 = r5.d
            float r0 = r4.b
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L5e
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L65
        L5e:
            float r3 = r4.d
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L65
            return r2
        L65:
            return r1
        L66:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            defpackage.i.m(r3)
            return r1
    }

    public static final long U(int r10, defpackage.of5 r11, defpackage.of5 r12) {
            r0 = 0
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            if (r10 != r6) goto L10
            float r7 = r11.a
            float r8 = r12.c
        Le:
            float r7 = r7 - r8
            goto L25
        L10:
            if (r10 != r5) goto L17
            float r7 = r12.a
            float r8 = r11.c
            goto Le
        L17:
            if (r10 != r4) goto L1e
            float r7 = r11.b
            float r8 = r12.d
            goto Le
        L1e:
            if (r10 != r3) goto L60
            float r7 = r12.b
            float r8 = r11.d
            goto Le
        L25:
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 >= 0) goto L2b
            r7 = r8
        L2b:
            long r7 = (long) r7
            r9 = 1073741824(0x40000000, float:2.0)
            if (r10 != r6) goto L31
            goto L33
        L31:
            if (r10 != r5) goto L43
        L33:
            float r10 = r11.b
            float r11 = r11.d
            float r11 = r11 - r10
            float r11 = r11 / r9
            float r11 = r11 + r10
            float r10 = r12.b
            float r12 = r12.d
        L3e:
            float r12 = r12 - r10
            float r12 = r12 / r9
            float r12 = r12 + r10
            float r11 = r11 - r12
            goto L54
        L43:
            if (r10 != r4) goto L46
            goto L48
        L46:
            if (r10 != r3) goto L5c
        L48:
            float r10 = r11.a
            float r11 = r11.c
            float r11 = r11 - r10
            float r11 = r11 / r9
            float r11 = r11 + r10
            float r10 = r12.a
            float r12 = r12.c
            goto L3e
        L54:
            long r10 = (long) r11
            r0 = 13
            long r0 = r0 * r7
            long r0 = r0 * r7
            long r10 = r10 * r10
            long r10 = r10 + r0
            return r10
        L5c:
            defpackage.i.m(r2)
            return r0
        L60:
            defpackage.i.m(r2)
            return r0
    }

    public static final boolean V(defpackage.sm3 r3) {
            wm3 r0 = r3.C0
            om3 r0 = r0.d
            int[] r1 = defpackage.h34.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L31
            r2 = 2
            if (r0 == r2) goto L31
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 == r1) goto L30
            r1 = 5
            if (r0 != r1) goto L2d
            sm3 r3 = r3.v()
            if (r3 == 0) goto L27
            boolean r3 = V(r3)
            return r3
        L27:
            java.lang.String r3 = "no parent for idle node"
            defpackage.i.h(r3)
            return r2
        L2d:
            defpackage.i.d()
        L30:
            return r2
        L31:
            return r1
    }

    public static final boolean W(float r4, float r5, defpackage.hj r6) {
            of5 r0 = new of5
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            float r2 = r4 - r1
            float r3 = r5 - r1
            float r4 = r4 + r1
            float r5 = r5 + r1
            r0.<init>(r2, r3, r4, r5)
            hj r4 = defpackage.lj.a()
            defpackage.hj.b(r4, r0)
            hj r5 = defpackage.lj.a()
            r0 = 1
            r5.f(r6, r4, r0)
            android.graphics.Path r6 = r5.a
            boolean r6 = r6.isEmpty()
            r5.g()
            r4.g()
            r4 = r6 ^ 1
            return r4
    }

    public static final boolean X(android.os.Bundle r1, java.lang.String r2) {
            r2.getClass()
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L11
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final boolean Z(float r2, float r3, float r4, float r5, long r6) {
            float r2 = r2 - r4
            float r3 = r3 - r5
            r4 = 32
            long r4 = r6 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r2 = r2 * r2
            float r4 = r4 * r4
            float r2 = r2 / r4
            float r3 = r3 * r3
            float r5 = r5 * r5
            float r3 = r3 / r5
            float r3 = r3 + r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public static final defpackage.xd5 a0(defpackage.xd5 r7, java.lang.String r8, java.util.concurrent.Executor r9, defpackage.on2 r10) {
            r7.getClass()
            r9.getClass()
            s94 r4 = new s94
            un4 r0 = defpackage.xd5.l0
            r4.<init>(r0)
            qb0 r5 = new qb0
            r5.<init>()
            hl5 r0 = new hl5
            r0.<init>()
            r5.c = r0
            tb0 r6 = new tb0
            r6.<init>(r5)
            r5.b = r6
            java.lang.Class<i61> r0 = defpackage.i61.class
            r5.a = r0
            q30 r0 = new q30     // Catch: java.lang.Exception -> L36
            r1 = r7
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L36
            r9.execute(r0)     // Catch: java.lang.Exception -> L36
            jg7 r7 = defpackage.jg7.a
            if (r7 == 0) goto L3b
            r5.a = r7     // Catch: java.lang.Exception -> L36
            goto L3b
        L36:
            r0 = move-exception
            r7 = r0
            r6.b(r7)
        L3b:
            xd5 r7 = new xd5
            r8 = 13
            r7.<init>(r8)
            return r7
    }

    public static final boolean b0(int r10, defpackage.ln r11, defpackage.vh2 r12, defpackage.of5 r13) {
            ua4 r0 = new ua4
            r1 = 16
            vh2[] r2 = new defpackage.vh2[r1]
            r0.<init>(r2)
            z64 r2 = r12.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L14
            java.lang.String r2 = "visitChildren called on an unattached node"
            defpackage.p53.c(r2)
        L14:
            ua4 r2 = new ua4
            z64[] r3 = new defpackage.z64[r1]
            r2.<init>(r3)
            z64 r12 = r12.A
            z64 r3 = r12.Y
            if (r3 != 0) goto L25
            defpackage.nc1.z(r2, r12)
            goto L28
        L25:
            r2.b(r3)
        L28:
            int r12 = r2.L
            r3 = 1
            r4 = 0
            if (r12 == 0) goto L98
            int r12 = r12 + (-1)
            java.lang.Object r12 = r2.l(r12)
            z64 r12 = (defpackage.z64) r12
            int r5 = r12.R
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L40
            defpackage.nc1.z(r2, r12)
            goto L28
        L40:
            if (r12 == 0) goto L28
            int r5 = r12.L
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L95
            r5 = 0
            r6 = r5
        L4a:
            if (r12 == 0) goto L28
            boolean r7 = r12 instanceof defpackage.vh2
            if (r7 == 0) goto L5a
            vh2 r12 = (defpackage.vh2) r12
            boolean r7 = r12.j0
            if (r7 == 0) goto L90
            r0.b(r12)
            goto L90
        L5a:
            int r7 = r12.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            boolean r7 = r12 instanceof defpackage.zg1
            if (r7 == 0) goto L90
            r7 = r12
            zg1 r7 = (defpackage.zg1) r7
            z64 r7 = r7.l0
            r8 = r4
        L6a:
            if (r7 == 0) goto L8d
            int r9 = r7.L
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L8a
            int r8 = r8 + 1
            if (r8 != r3) goto L78
            r12 = r7
            goto L8a
        L78:
            if (r6 != 0) goto L81
            ua4 r6 = new ua4
            z64[] r9 = new defpackage.z64[r1]
            r6.<init>(r9)
        L81:
            if (r12 == 0) goto L87
            r6.b(r12)
            r12 = r5
        L87:
            r6.b(r7)
        L8a:
            z64 r7 = r7.Y
            goto L6a
        L8d:
            if (r8 != r3) goto L90
            goto L4a
        L90:
            z64 r12 = defpackage.nc1.A(r6)
            goto L4a
        L95:
            z64 r12 = r12.Y
            goto L40
        L98:
            int r12 = r0.L
            if (r12 == 0) goto Lc1
            vh2 r12 = x(r0, r13, r10)
            if (r12 != 0) goto La3
            goto Lc1
        La3:
            ih2 r1 = r12.T0()
            boolean r1 = r1.a
            if (r1 == 0) goto Lb6
            java.lang.Object r10 = r11.g(r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        Lb6:
            boolean r1 = D(r10, r11, r12, r13)
            if (r1 == 0) goto Lbd
            return r3
        Lbd:
            r0.j(r12)
            goto L98
        Lc1:
            return r4
    }

    public static final android.view.inputmethod.ExtractedText c0(defpackage.c37 r4) {
            android.view.inputmethod.ExtractedText r0 = new android.view.inputmethod.ExtractedText
            r0.<init>()
            fp r1 = r4.a
            java.lang.String r1 = r1.B
            r0.text = r1
            r2 = 0
            r0.startOffset = r2
            int r1 = r1.length()
            r0.partialEndOffset = r1
            r1 = -1
            r0.partialStartOffset = r1
            long r1 = r4.b
            int r3 = defpackage.k47.f(r1)
            r0.selectionStart = r3
            int r1 = defpackage.k47.e(r1)
            r0.selectionEnd = r1
            fp r4 = r4.a
            java.lang.String r4 = r4.B
            r1 = 10
            boolean r4 = defpackage.qs6.k0(r4, r1)
            r4 = r4 ^ 1
            r0.flags = r4
            return r0
    }

    public static defpackage.zh d(int r3, int r4, int r5, int r6) {
            r6 = r6 & 4
            if (r6 == 0) goto L5
            r5 = 0
        L5:
            cq5 r6 = defpackage.qt0.e
            android.graphics.Bitmap$Config r0 = defpackage.l.R(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L1e
            android.graphics.Bitmap$Config r5 = defpackage.l.R(r5)
            android.graphics.ColorSpace r6 = defpackage.pt0.a(r6)
            android.graphics.Bitmap r3 = defpackage.k2.c(r3, r4, r5, r6)
            goto L27
        L1e:
            r5 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r3, r4, r0)
            r4 = 1
            r3.setHasAlpha(r4)
        L27:
            zh r4 = new zh
            r4.<init>(r3)
            return r4
    }

    public static java.lang.String d0(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Clamp"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "Repeated"
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            java.lang.String r1 = "Mirror"
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            java.lang.String r1 = "Decal"
            return r1
        L17:
            java.lang.String r1 = "Unknown"
            return r1
    }

    public static final defpackage.hd4 e(android.window.BackEvent r7) {
            float r2 = defpackage.rv2.a(r7)
            float r3 = defpackage.rv2.n(r7)
            float r1 = defpackage.rv2.r(r7)
            int r4 = defpackage.rv2.c(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 36
            if (r0 < r5) goto L1b
            long r5 = defpackage.np.d(r7)
            goto L1d
        L1b:
            r5 = 0
        L1d:
            hd4 r0 = new hd4
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static final java.lang.Boolean e0(int r9, defpackage.ln r10, defpackage.vh2 r11, defpackage.of5 r12) {
            sh2 r0 = r11.W0()
            int[] r1 = defpackage.uc7.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L49
            if (r0 == r5) goto L40
            if (r0 == r4) goto L40
            if (r0 != r3) goto L3c
            ih2 r0 = r11.T0()
            boolean r0 = r0.a
            if (r0 == 0) goto L28
            java.lang.Object r9 = r10.g(r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            return r9
        L28:
            if (r12 != 0) goto L33
            boolean r9 = y(r11, r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L33:
            boolean r9 = b0(r9, r10, r11, r12)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L3c:
            defpackage.i.d()
            return r2
        L40:
            boolean r9 = y(r11, r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L49:
            vh2 r0 = defpackage.yh2.t(r11)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto Laf
            sh2 r8 = r0.W0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L7a
            if (r1 == r5) goto L6b
            if (r1 == r4) goto L6b
            if (r1 == r3) goto L67
            defpackage.i.d()
            return r2
        L67:
            defpackage.i.m(r7)
            return r2
        L6b:
            if (r12 != 0) goto L71
            of5 r12 = defpackage.yh2.r(r0)
        L71:
            boolean r9 = D(r9, r10, r11, r12)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L7a:
            java.lang.Boolean r1 = e0(r9, r10, r0, r12)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 != 0) goto L87
            return r1
        L87:
            if (r12 != 0) goto La6
            sh2 r12 = r0.W0()
            sh2 r1 = defpackage.sh2.ActiveParent
            if (r12 != r1) goto La0
            vh2 r12 = defpackage.yh2.q(r0)
            if (r12 == 0) goto L9c
            of5 r12 = defpackage.yh2.r(r12)
            goto La6
        L9c:
            defpackage.i.m(r7)
            return r2
        La0:
            java.lang.String r9 = "Searching for active node in inactive hierarchy"
            defpackage.i.m(r9)
            return r2
        La6:
            boolean r9 = D(r9, r10, r11, r12)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Laf:
            defpackage.i.m(r7)
            return r2
    }

    public static final void f(defpackage.a74 r16, defpackage.lq4 r17, defpackage.oi4 r18, defpackage.on2 r19, defpackage.px0 r20, int r21) {
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0 = r20
            xq2 r0 = (defpackage.xq2) r0
            r5 = 843875199(0x324c837f, float:1.1904262E-8)
            r0.d0(r5)
            boolean r5 = r0.f(r1)
            if (r5 == 0) goto L26
            r5 = 4
            goto L27
        L26:
            r5 = 2
        L27:
            r5 = r21 | r5
            boolean r6 = r0.f(r2)
            if (r6 == 0) goto L32
            r6 = 32
            goto L34
        L32:
            r6 = 16
        L34:
            r5 = r5 | r6
            boolean r6 = r0.f(r3)
            if (r6 == 0) goto L3e
            r6 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r6 = 128(0x80, float:1.8E-43)
        L40:
            r5 = r5 | r6
            boolean r6 = r0.h(r4)
            if (r6 == 0) goto L4a
            r6 = 2048(0x800, float:2.87E-42)
            goto L4c
        L4a:
            r6 = 1024(0x400, float:1.435E-42)
        L4c:
            r5 = r5 | r6
            r6 = r5 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L57
            r6 = r9
            goto L58
        L57:
            r6 = r8
        L58:
            r7 = r5 & 1
            boolean r6 = r0.S(r7, r6)
            if (r6 == 0) goto Lf4
            s76 r6 = defpackage.nb3.U(r0)
            a74 r10 = defpackage.nb3.W(r1, r6, r9)
            nq6 r6 = defpackage.ky0.n
            java.lang.Object r7 = r0.j(r6)
            kk3 r7 = (defpackage.kk3) r7
            float r11 = defpackage.ge7.r(r2, r7)
            java.lang.Object r6 = r0.j(r6)
            kk3 r6 = (defpackage.kk3) r6
            float r13 = defpackage.ge7.q(r2, r6)
            r14 = 0
            r15 = 10
            r12 = 0
            a74 r6 = defpackage.ge7.S(r10, r11, r12, r13, r14, r15)
            eu r7 = defpackage.ju.c
            c40 r10 = defpackage.d90.k0
            yt0 r7 = defpackage.wt0.a(r7, r10, r0, r8)
            long r10 = r0.T
            int r8 = java.lang.Long.hashCode(r10)
            xv4 r10 = r0.l()
            a74 r6 = defpackage.l.E(r0, r6)
            ix0 r11 = defpackage.jx0.i
            r11.getClass()
            iy0 r11 = defpackage.ix0.b
            r0.f0()
            boolean r12 = r0.S
            if (r12 == 0) goto Lae
            r0.k(r11)
            goto Lb1
        Lae:
            r0.o0()
        Lb1:
            pn r11 = defpackage.ix0.f
            defpackage.yh2.K(r0, r11, r7)
            pn r7 = defpackage.ix0.e
            defpackage.yh2.K(r0, r7, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            pn r8 = defpackage.ix0.g
            defpackage.yh2.K(r0, r8, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r0, r7)
            pn r7 = defpackage.ix0.d
            defpackage.yh2.K(r0, r7, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            x64 r7 = defpackage.x64.a
            a74 r6 = defpackage.dj6.c(r7, r6)
            int r5 = r5 >> 3
            r8 = r5 & 112(0x70, float:1.57E-43)
            r8 = r8 | 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r5 = r5 | r8
            defpackage.q60.h(r6, r3, r4, r0, r5)
            float r5 = r2.a()
            r6 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 + r6
            a74 r5 = defpackage.dj6.e(r7, r5)
            defpackage.gi2.h(r0, r5)
            r0.p(r9)
            goto Lf7
        Lf4:
            r0.V()
        Lf7:
            cf5 r7 = r0.t()
            if (r7 == 0) goto L108
            p4 r0 = new p4
            r6 = 11
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L108:
            return
    }

    public static final defpackage.of5 f0(defpackage.jk3 r11) {
            r0 = 1
            of5 r0 = defpackage.ej2.k(r11, r0)
            long r1 = r0.d()
            long r1 = r11.A(r1)
            float r3 = r0.c
            float r0 = r0.d
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            r0 = 32
            long r3 = r3 << r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            long r3 = r11.A(r3)
            of5 r11 = new of5
            long r5 = r1 >> r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r9 = r3 >> r0
            int r0 = (int) r9
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r2 = r3 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r11.<init>(r5, r1, r0, r2)
            return r11
    }

    public static final void g(java.lang.String r33, boolean r34, defpackage.qn2 r35, float r36, defpackage.px0 r37, int r38) {
            r0 = r34
            r8 = r35
            r9 = r36
            r33.getClass()
            r8.getClass()
            r5 = r37
            xq2 r5 = (defpackage.xq2) r5
            r1 = 1457840675(0x56e4e223, float:1.2582995E14)
            r5.d0(r1)
            r10 = r33
            boolean r1 = r5.f(r10)
            r2 = 2
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = r2
        L22:
            r1 = r38 | r1
            boolean r3 = r5.g(r0)
            r4 = 32
            if (r3 == 0) goto L2e
            r3 = r4
            goto L30
        L2e:
            r3 = 16
        L30:
            r1 = r1 | r3
            boolean r3 = r5.h(r8)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L3b
            r3 = r6
            goto L3d
        L3b:
            r3 = 128(0x80, float:1.8E-43)
        L3d:
            r1 = r1 | r3
            boolean r3 = r5.c(r9)
            if (r3 == 0) goto L47
            r3 = 2048(0x800, float:2.87E-42)
            goto L49
        L47:
            r3 = 1024(0x400, float:1.435E-42)
        L49:
            r1 = r1 | r3
            r3 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r11 = 0
            r12 = 1
            if (r3 == r7) goto L54
            r3 = r12
            goto L55
        L54:
            r3 = r11
        L55:
            r7 = r1 & 1
            boolean r3 = r5.S(r7, r3)
            if (r3 == 0) goto L16f
            x64 r3 = defpackage.x64.a
            r7 = 1065353216(0x3f800000, float:1.0)
            a74 r13 = defpackage.dj6.c(r3, r7)
            r14 = r1 & 896(0x380, float:1.256E-42)
            if (r14 != r6) goto L6b
            r6 = r12
            goto L6c
        L6b:
            r6 = r11
        L6c:
            r14 = r1 & 112(0x70, float:1.57E-43)
            if (r14 != r4) goto L72
            r4 = r12
            goto L73
        L72:
            r4 = r11
        L73:
            r4 = r4 | r6
            java.lang.Object r6 = r5.P()
            if (r4 != 0) goto L7e
            vs0 r4 = defpackage.ox0.a
            if (r6 != r4) goto L86
        L7e:
            q01 r6 = new q01
            r6.<init>(r8, r0, r2)
            r5.l0(r6)
        L86:
            on2 r6 = (defpackage.on2) r6
            r4 = 15
            r14 = 0
            a74 r4 = defpackage.mb3.u(r13, r11, r14, r6, r4)
            r6 = 3
            a74 r4 = defpackage.nw7.f0(r4, r11, r14, r6)
            r11 = 1111490560(0x42400000, float:48.0)
            r13 = 0
            a74 r2 = defpackage.dj6.f(r4, r11, r13, r2)
            r4 = 1090519040(0x41000000, float:8.0)
            a74 r2 = defpackage.ge7.R(r2, r9, r4, r9, r4)
            d40 r4 = defpackage.d90.i0
            du r11 = defpackage.ju.a
            r13 = 48
            l26 r4 = defpackage.k26.a(r11, r4, r5, r13)
            long r14 = r5.T
            int r11 = java.lang.Long.hashCode(r14)
            xv4 r14 = r5.l()
            a74 r2 = defpackage.l.E(r5, r2)
            ix0 r15 = defpackage.jx0.i
            r15.getClass()
            iy0 r15 = defpackage.ix0.b
            r5.f0()
            r37 = r6
            boolean r6 = r5.S
            if (r6 == 0) goto Lcd
            r5.k(r15)
            goto Ld0
        Lcd:
            r5.o0()
        Ld0:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r5, r6, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r5, r4, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            pn r6 = defpackage.ix0.g
            defpackage.yh2.K(r5, r6, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r5, r4)
            pn r4 = defpackage.ix0.d
            defpackage.yh2.K(r5, r4, r2)
            vn3 r11 = new vn3
            r11.<init>(r7, r12)
            nq6 r2 = defpackage.ye7.b
            java.lang.Object r2 = r5.j(r2)
            xe7 r2 = (defpackage.xe7) r2
            s47 r2 = r2.i
            r30 = r1 & 14
            r31 = 3120(0xc30, float:4.372E-42)
            r32 = 55292(0xd7fc, float:7.748E-41)
            r6 = r12
            r4 = r13
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 2
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = r2
            r29 = r5
            defpackage.x37.b(r10, r11, r12, r14, r16, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 1098907648(0x41800000, float:16.0)
            a74 r2 = defpackage.dj6.l(r3, r2)
            defpackage.gi2.h(r5, r2)
            nq6 r2 = defpackage.kf.b
            java.lang.Object r2 = r5.j(r2)
            android.content.Context r2 = (android.content.Context) r2
            py0 r3 = defpackage.kf.c
            java.lang.Object r3 = r5.j(r3)
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            android.content.res.Resources$Theme r2 = r2.getTheme()
            java.lang.ThreadLocal r7 = defpackage.sl5.a
            r7 = 2131100624(0x7f0603d0, float:1.7813635E38)
            int r2 = r3.getColor(r7, r2)
            long r14 = defpackage.hv.b(r2)
            r16 = 0
            r19 = 1015(0x3f7, float:1.422E-42)
            r10 = 0
            r18 = r5
            rf1 r2 = defpackage.nj2.i(r10, r12, r14, r16, r18, r19)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | r4
            r7 = 28
            r3 = r6
            r6 = r1
            r1 = 0
            r4 = r2
            r2 = 0
            r10 = r3
            r3 = 0
            defpackage.bx6.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r5.p(r10)
            goto L172
        L16f:
            r5.V()
        L172:
            cf5 r6 = r5.t()
            if (r6 == 0) goto L187
            cq1 r0 = new cq1
            r1 = r33
            r2 = r34
            r5 = r38
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L187:
            return
    }

    public static final void h(defpackage.a74 r24, defpackage.eo2 r25, defpackage.eo2 r26, defpackage.fo2 r27, defpackage.eo2 r28, defpackage.eo2 r29, boolean r30, float r31, defpackage.lq4 r32, defpackage.px0 r33, int r34) {
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r34
            e40 r0 = defpackage.d90.L
            e40 r11 = defpackage.d90.Z
            r12 = r33
            xq2 r12 = (defpackage.xq2) r12
            r13 = -1595074580(0xffffffffa0ed17ec, float:-4.0165192E-19)
            r12.d0(r13)
            r13 = r10 & 6
            if (r13 != 0) goto L31
            boolean r13 = r12.f(r1)
            if (r13 == 0) goto L2e
            r13 = 4
            goto L2f
        L2e:
            r13 = 2
        L2f:
            r13 = r13 | r10
            goto L32
        L31:
            r13 = r10
        L32:
            r14 = r10 & 48
            if (r14 != 0) goto L42
            boolean r14 = r12.h(r2)
            if (r14 == 0) goto L3f
            r14 = 32
            goto L41
        L3f:
            r14 = 16
        L41:
            r13 = r13 | r14
        L42:
            r14 = r10 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L52
            boolean r14 = r12.h(r3)
            if (r14 == 0) goto L4f
            r14 = 256(0x100, float:3.59E-43)
            goto L51
        L4f:
            r14 = 128(0x80, float:1.8E-43)
        L51:
            r13 = r13 | r14
        L52:
            r14 = r10 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L62
            boolean r14 = r12.h(r4)
            if (r14 == 0) goto L5f
            r14 = 2048(0x800, float:2.87E-42)
            goto L61
        L5f:
            r14 = 1024(0x400, float:1.435E-42)
        L61:
            r13 = r13 | r14
        L62:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L72
            boolean r14 = r12.h(r5)
            if (r14 == 0) goto L6f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L71
        L6f:
            r14 = 8192(0x2000, float:1.148E-41)
        L71:
            r13 = r13 | r14
        L72:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L83
            boolean r14 = r12.h(r6)
            if (r14 == 0) goto L80
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L82
        L80:
            r14 = 65536(0x10000, float:9.1835E-41)
        L82:
            r13 = r13 | r14
        L83:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L94
            boolean r14 = r12.g(r7)
            if (r14 == 0) goto L91
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L93
        L91:
            r14 = 524288(0x80000, float:7.34684E-40)
        L93:
            r13 = r13 | r14
        L94:
            r14 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r14 & r10
            if (r14 != 0) goto La5
            boolean r14 = r12.c(r8)
            if (r14 == 0) goto La2
            r14 = 8388608(0x800000, float:1.1754944E-38)
            goto La4
        La2:
            r14 = 4194304(0x400000, float:5.877472E-39)
        La4:
            r13 = r13 | r14
        La5:
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 & r10
            if (r14 != 0) goto Lb6
            boolean r14 = r12.f(r9)
            if (r14 == 0) goto Lb3
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb5
        Lb3:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        Lb5:
            r13 = r13 | r14
        Lb6:
            r14 = 38347923(0x2492493, float:1.4777644E-37)
            r14 = r14 & r13
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 == r15) goto Lc1
            r14 = 1
            goto Lc2
        Lc1:
            r14 = 0
        Lc2:
            r15 = r13 & 1
            boolean r14 = r12.S(r15, r14)
            if (r14 == 0) goto L369
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r15) goto Ld3
            r14 = 1
            goto Ld4
        Ld3:
            r14 = 0
        Ld4:
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r15 & r13
            r10 = 8388608(0x800000, float:1.1754944E-38)
            if (r15 != r10) goto Ldd
            r10 = 1
            goto Lde
        Ldd:
            r10 = 0
        Lde:
            r10 = r10 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r13
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r14 != r15) goto Le8
            r14 = 1
            goto Le9
        Le8:
            r14 = 0
        Le9:
            r10 = r10 | r14
            java.lang.Object r14 = r12.P()
            if (r10 != 0) goto Lf4
            vs0 r10 = defpackage.ox0.a
            if (r14 != r10) goto Lfc
        Lf4:
            a27 r14 = new a27
            r14.<init>(r7, r8, r9)
            r12.l0(r14)
        Lfc:
            a27 r14 = (defpackage.a27) r14
            nq6 r10 = defpackage.ky0.n
            java.lang.Object r10 = r12.j(r10)
            kk3 r10 = (defpackage.kk3) r10
            int r15 = defpackage.ge7.B(r12)
            xv4 r7 = r12.l()
            a74 r8 = defpackage.l.E(r12, r1)
            ix0 r16 = defpackage.jx0.i
            r16.getClass()
            iy0 r1 = defpackage.ix0.b
            r12.f0()
            r16 = r13
            boolean r13 = r12.S
            if (r13 == 0) goto L126
            r12.k(r1)
            goto L129
        L126:
            r12.o0()
        L129:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r12, r13, r14)
            pn r14 = defpackage.ix0.e
            defpackage.yh2.K(r12, r14, r7)
            pn r7 = defpackage.ix0.g
            boolean r2 = r12.S
            if (r2 != 0) goto L147
            java.lang.Object r2 = r12.P()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L14a
        L147:
            defpackage.i61.v(r15, r12, r15, r7)
        L14a:
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r12, r2, r8)
            m64 r3 = defpackage.m64.a
            x64 r8 = defpackage.x64.a
            if (r5 == 0) goto L1bc
            r15 = -1444611617(0xffffffffa9e4f9df, float:-1.016858E-13)
            r12.b0(r15)
            java.lang.String r15 = "Leading"
            a74 r15 = defpackage.lb4.D(r8, r15)
            nq6 r17 = defpackage.u93.a
            a74 r15 = r15.d(r3)
            r17 = r0
            r0 = 0
            e34 r4 = defpackage.h70.d(r11, r0)
            int r0 = defpackage.ge7.B(r12)
            xv4 r9 = r12.l()
            a74 r15 = defpackage.l.E(r12, r15)
            r12.f0()
            r18 = r10
            boolean r10 = r12.S
            if (r10 == 0) goto L187
            r12.k(r1)
            goto L18a
        L187:
            r12.o0()
        L18a:
            defpackage.yh2.K(r12, r13, r4)
            defpackage.yh2.K(r12, r14, r9)
            boolean r4 = r12.S
            if (r4 != 0) goto L1a2
            java.lang.Object r4 = r12.P()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r4 = defpackage.nb3.k(r4, r9)
            if (r4 != 0) goto L1a5
        L1a2:
            defpackage.i61.v(r0, r12, r0, r7)
        L1a5:
            defpackage.yh2.K(r12, r2, r15)
            int r0 = r16 >> 12
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.o(r12, r0)
            r0 = 1
            r12.p(r0)
            r0 = 0
            r12.p(r0)
            goto L1ca
        L1bc:
            r17 = r0
            r18 = r10
            r0 = 0
            r4 = -1444365601(0xffffffffa9e8badf, float:-1.03352866E-13)
            r12.b0(r4)
            r12.p(r0)
        L1ca:
            if (r6 == 0) goto L232
            r4 = -1444322883(0xffffffffa9e961bd, float:-1.03642335E-13)
            r12.b0(r4)
            java.lang.String r4 = "Trailing"
            a74 r4 = defpackage.lb4.D(r8, r4)
            nq6 r9 = defpackage.u93.a
            a74 r3 = r4.d(r3)
            e34 r4 = defpackage.h70.d(r11, r0)
            int r0 = defpackage.ge7.B(r12)
            xv4 r9 = r12.l()
            a74 r3 = defpackage.l.E(r12, r3)
            r12.f0()
            boolean r10 = r12.S
            if (r10 == 0) goto L1f9
            r12.k(r1)
            goto L1fc
        L1f9:
            r12.o0()
        L1fc:
            defpackage.yh2.K(r12, r13, r4)
            defpackage.yh2.K(r12, r14, r9)
            boolean r4 = r12.S
            if (r4 != 0) goto L214
            java.lang.Object r4 = r12.P()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r4 = defpackage.nb3.k(r4, r9)
            if (r4 != 0) goto L217
        L214:
            defpackage.i61.v(r0, r12, r0, r7)
        L217:
            defpackage.yh2.K(r12, r2, r3)
            int r0 = r16 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.o(r12, r0)
            r0 = 1
            r12.p(r0)
            r0 = 0
            r12.p(r0)
        L22d:
            r9 = r32
            r10 = r18
            goto L23c
        L232:
            r3 = -1444074945(0xffffffffa9ed2a3f, float:-1.0532243E-13)
            r12.b0(r3)
            r12.p(r0)
            goto L22d
        L23c:
            float r0 = defpackage.ge7.r(r9, r10)
            float r3 = defpackage.ge7.q(r9, r10)
            r4 = 0
            r10 = 1094713344(0x41400000, float:12.0)
            if (r5 == 0) goto L24f
            float r0 = r0 - r10
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 >= 0) goto L24f
            r0 = r4
        L24f:
            r19 = r0
            if (r6 == 0) goto L259
            float r3 = r3 - r10
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L259
            r3 = r4
        L259:
            r21 = r3
            r22 = 0
            r23 = 10
            r20 = 0
            r18 = r8
            a74 r0 = defpackage.ge7.S(r18, r19, r20, r21, r22, r23)
            r3 = r18
            if (r27 == 0) goto L28d
            r4 = -1443222972(0xffffffffa9fa2a44, float:-1.1109562E-13)
            r12.b0(r4)
            java.lang.String r4 = "Hint"
            a74 r4 = defpackage.lb4.D(r3, r4)
            a74 r4 = r4.d(r0)
            int r8 = r16 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = r27
            r10.e(r4, r12, r8)
            r4 = 0
            r12.p(r4)
            goto L299
        L28d:
            r10 = r27
            r4 = 0
            r8 = -1443135521(0xffffffffa9fb7fdf, float:-1.1168821E-13)
            r12.b0(r8)
            r12.p(r4)
        L299:
            if (r26 == 0) goto L2ff
            r8 = -1443101018(0xffffffffa9fc06a6, float:-1.11922014E-13)
            r12.b0(r8)
            java.lang.String r8 = "Label"
            a74 r8 = defpackage.lb4.D(r3, r8)
            a74 r8 = r8.d(r0)
            r11 = r17
            e34 r15 = defpackage.h70.d(r11, r4)
            int r4 = defpackage.ge7.B(r12)
            xv4 r5 = r12.l()
            a74 r8 = defpackage.l.E(r12, r8)
            r12.f0()
            boolean r6 = r12.S
            if (r6 == 0) goto L2c8
            r12.k(r1)
            goto L2cb
        L2c8:
            r12.o0()
        L2cb:
            defpackage.yh2.K(r12, r13, r15)
            defpackage.yh2.K(r12, r14, r5)
            boolean r5 = r12.S
            if (r5 != 0) goto L2e3
            java.lang.Object r5 = r12.P()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = defpackage.nb3.k(r5, r6)
            if (r5 != 0) goto L2e6
        L2e3:
            defpackage.i61.v(r4, r12, r4, r7)
        L2e6:
            defpackage.yh2.K(r12, r2, r8)
            int r4 = r16 >> 6
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r26
            r5.o(r12, r4)
            r4 = 1
            r12.p(r4)
            r6 = 0
            r12.p(r6)
            goto L30e
        L2ff:
            r5 = r26
            r6 = r4
            r11 = r17
            r4 = 1
            r8 = -1443015489(0xffffffffa9fd54bf, float:-1.1250158E-13)
            r12.b0(r8)
            r12.p(r6)
        L30e:
            java.lang.String r6 = "TextField"
            a74 r3 = defpackage.lb4.D(r3, r6)
            a74 r0 = r3.d(r0)
            e34 r3 = defpackage.h70.d(r11, r4)
            int r4 = defpackage.ge7.B(r12)
            xv4 r6 = r12.l()
            a74 r0 = defpackage.l.E(r12, r0)
            r12.f0()
            boolean r8 = r12.S
            if (r8 == 0) goto L333
            r12.k(r1)
            goto L336
        L333:
            r12.o0()
        L336:
            defpackage.yh2.K(r12, r13, r3)
            defpackage.yh2.K(r12, r14, r6)
            boolean r1 = r12.S
            if (r1 != 0) goto L34e
            java.lang.Object r1 = r12.P()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L351
        L34e:
            defpackage.i61.v(r4, r12, r4, r7)
        L351:
            defpackage.yh2.K(r12, r2, r0)
            int r0 = r16 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r25
            r2.o(r12, r0)
            r0 = 1
            r12.p(r0)
            r12.p(r0)
            goto L36e
        L369:
            r5 = r3
            r10 = r4
            r12.V()
        L36e:
            cf5 r11 = r12.t()
            if (r11 == 0) goto L389
            x17 r0 = new x17
            r1 = r24
            r6 = r29
            r7 = r30
            r8 = r31
            r3 = r5
            r4 = r10
            r5 = r28
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.d = r0
        L389:
            return
    }

    public static final int i(defpackage.kz3 r4, defpackage.ey2 r5) {
            kz3 r0 = r4.z0()
            if (r0 == 0) goto L7
            goto L1d
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child of "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " cannot be null when calculating alignment line"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.p53.c(r1)
        L1d:
            f34 r1 = r4.G0()
            java.util.Map r1 = r1.b()
            boolean r1 = r1.containsKey(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L42
            f34 r4 = r4.G0()
            java.util.Map r4 = r4.b()
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L48
            int r4 = r4.intValue()
            return r4
        L42:
            int r1 = r0.X(r5)
            if (r1 != r2) goto L49
        L48:
            return r2
        L49:
            r2 = 1
            r0.f0 = r2
            r4.g0 = r2
            r4.M0()
            r2 = 0
            r0.f0 = r2
            r4.g0 = r2
            boolean r4 = r5 instanceof defpackage.ey2
            if (r4 == 0) goto L67
            long r4 = r0.I0()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
        L64:
            int r4 = (int) r4
            int r1 = r1 + r4
            return r1
        L67:
            long r4 = r0.I0()
            r0 = 32
            long r4 = r4 >> r0
            goto L64
    }

    public static final int j(int r2, boolean r3, int r4, int r5, int r6, int r7, long r8, float r10, defpackage.lq4 r11) {
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r10
            float r1 = r11.d()
            float r1 = r1 * r10
            float r11 = r11.a()
            float r11 = r11 * r10
            int r2 = java.lang.Math.max(r2, r7)
            if (r3 == 0) goto L19
            float r3 = (float) r4
            float r3 = r3 + r0
            float r2 = (float) r2
            float r3 = r3 + r2
            float r3 = r3 + r11
            goto L1d
        L19:
            float r2 = (float) r2
            float r1 = r1 + r2
            float r3 = r1 + r11
        L1d:
            int r2 = defpackage.u24.E(r3)
            int r3 = java.lang.Math.max(r5, r6)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = defpackage.s21.f(r2, r8)
            return r2
    }

    public static final defpackage.e55 k(defpackage.e55 r2, long r3) {
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto Lb
            r90 r2 = r2.e()
            goto Lf
        Lb:
            r90 r2 = r2.d()
        Lf:
            e55 r3 = new e55
            r3.<init>(r2)
            return r3
    }

    public static final void m(defpackage.qo7 r1, defpackage.d56 r2, defpackage.ut3 r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.AutoCloseable r1 = r1.c(r0)
            w46 r1 = (defpackage.w46) r1
            if (r1 == 0) goto L34
            boolean r0 = r1.L
            if (r0 != 0) goto L34
            r1.e(r3, r2)
            tt3 r1 = r3.b()
            tt3 r0 = defpackage.tt3.INITIALIZED
            if (r1 == r0) goto L31
            tt3 r0 = defpackage.tt3.STARTED
            boolean r1 = r1.isAtLeast(r0)
            if (r1 == 0) goto L28
            goto L31
        L28:
            se1 r1 = new se1
            r1.<init>(r3, r2)
            r3.a(r1)
            return
        L31:
            r2.d()
        L34:
            return
    }

    public static final java.lang.Object n(defpackage.mw6 r8, defpackage.py4 r9, defpackage.d20 r10) {
            boolean r0 = r10 instanceof defpackage.sj2
            if (r0 == 0) goto L13
            r0 = r10
            sj2 r0 = (defpackage.sj2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            sj2 r0 = new sj2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            py4 r8 = r0.X
            mw6 r9 = r0.R
            defpackage.oi2.Y(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L36:
            defpackage.oi2.Y(r10)
            ow6 r10 = r8.Y
            oy4 r10 = r10.p0
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L44:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L76
        L50:
            r0.R = r8
            r0.X = r9
            r0.Z = r4
            java.lang.Object r10 = r8.c(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            oy4 r10 = (defpackage.oy4) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L66:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L73
            goto L50
        L73:
            int r5 = r5 + 1
            goto L66
        L76:
            int r5 = r5 + 1
            goto L44
        L79:
            jg7 r8 = defpackage.jg7.a
            return r8
    }

    public static final java.lang.Object o(defpackage.zy4 r4, defpackage.eo2 r5, defpackage.r41 r6) {
            l61 r0 = r6.b()
            tj2 r1 = new tj2
            r2 = 0
            r3 = 0
            r1.<init>(r0, r5, r2, r3)
            ow6 r4 = (defpackage.ow6) r4
            java.lang.Object r4 = r4.R0(r1, r6)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L16
            return r4
        L16:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public static final boolean p(defpackage.of5 r18, defpackage.of5 r19, defpackage.of5 r20, int r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = q(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = q(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.i.m(r4)
            return r12
        L94:
            defpackage.i.m(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.i.m(r4)
        L9c:
            return r12
    }

    public static final boolean q(int r3, defpackage.of5 r4, defpackage.of5 r5) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L6
            goto L9
        L6:
            r0 = 4
            if (r3 != r0) goto L1b
        L9:
            float r3 = r4.d
            float r0 = r5.b
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1a
            float r3 = r4.b
            float r4 = r5.d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L1a
            return r2
        L1a:
            return r1
        L1b:
            r0 = 5
            if (r3 != r0) goto L1f
            goto L22
        L1f:
            r0 = 6
            if (r3 != r0) goto L34
        L22:
            float r3 = r4.c
            float r0 = r5.a
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L33
            float r3 = r4.a
            float r4 = r5.c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L33
            return r2
        L33:
            return r1
        L34:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            defpackage.i.m(r3)
            return r1
    }

    public static final java.lang.String r(defpackage.id3 r2, defpackage.wb6 r3) {
            r3.getClass()
            r2.getClass()
            java.util.List r3 = r3.getAnnotations()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            boolean r1 = r0 instanceof defpackage.sd3
            if (r1 == 0) goto Le
            sd3 r0 = (defpackage.sd3) r0
            java.lang.String r2 = r0.discriminator()
            return r2
        L25:
            td3 r2 = r2.a
            java.lang.String r2 = r2.d
            return r2
    }

    public static final void s(defpackage.vh2 r8, defpackage.ua4 r9) {
            z64 r0 = r8.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            ua4 r0 = new ua4
            r1 = 16
            z64[] r2 = new defpackage.z64[r1]
            r0.<init>(r2)
            z64 r8 = r8.A
            z64 r2 = r8.Y
            if (r2 != 0) goto L1e
            defpackage.nc1.z(r0, r8)
            goto L21
        L1e:
            r0.b(r2)
        L21:
            int r8 = r0.L
            if (r8 == 0) goto La5
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            z64 r8 = (defpackage.z64) r8
            int r2 = r8.R
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L37
            defpackage.nc1.z(r0, r8)
            goto L21
        L37:
            if (r8 == 0) goto L21
            int r2 = r8.L
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto La2
            r2 = 0
            r3 = r2
        L41:
            if (r8 == 0) goto L21
            boolean r4 = r8 instanceof defpackage.vh2
            if (r4 == 0) goto L66
            vh2 r8 = (defpackage.vh2) r8
            boolean r4 = r8.j0
            if (r4 == 0) goto L9d
            sm3 r4 = defpackage.nc1.f0(r8)
            boolean r4 = r4.K0
            if (r4 == 0) goto L56
            goto L9d
        L56:
            ih2 r4 = r8.T0()
            boolean r4 = r4.a
            if (r4 == 0) goto L62
            r9.b(r8)
            goto L9d
        L62:
            s(r8, r9)
            goto L9d
        L66:
            int r4 = r8.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9d
            boolean r4 = r8 instanceof defpackage.zg1
            if (r4 == 0) goto L9d
            r4 = r8
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r5 = 0
        L76:
            r6 = 1
            if (r4 == 0) goto L9a
            int r7 = r4.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L97
            int r5 = r5 + 1
            if (r5 != r6) goto L85
            r8 = r4
            goto L97
        L85:
            if (r3 != 0) goto L8e
            ua4 r3 = new ua4
            z64[] r6 = new defpackage.z64[r1]
            r3.<init>(r6)
        L8e:
            if (r8 == 0) goto L94
            r3.b(r8)
            r8 = r2
        L94:
            r3.b(r4)
        L97:
            z64 r4 = r4.Y
            goto L76
        L9a:
            if (r5 != r6) goto L9d
            goto L41
        L9d:
            z64 r8 = defpackage.nc1.A(r3)
            goto L41
        La2:
            z64 r8 = r8.Y
            goto L37
        La5:
            return
    }

    public static android.text.StaticLayout t(java.lang.CharSequence r1, android.text.TextPaint r2, int r3, int r4, android.text.TextDirectionHeuristic r5, android.text.Layout.Alignment r6, int r7, android.text.TextUtils.TruncateAt r8, int r9, int r10, boolean r11, int r12, int r13, int r14, int r15) {
            if (r4 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "invalid start value"
            defpackage.q53.a(r0)
        L8:
            int r0 = r1.length()
            if (r4 < 0) goto L11
            if (r4 > r0) goto L11
            goto L16
        L11:
            java.lang.String r0 = "invalid end value"
            defpackage.q53.a(r0)
        L16:
            if (r7 < 0) goto L19
            goto L1e
        L19:
            java.lang.String r0 = "invalid maxLines value"
            defpackage.q53.a(r0)
        L1e:
            if (r3 < 0) goto L21
            goto L26
        L21:
            java.lang.String r0 = "invalid width value"
            defpackage.q53.a(r0)
        L26:
            if (r9 < 0) goto L29
            goto L2e
        L29:
            java.lang.String r0 = "invalid ellipsizedWidth value"
            defpackage.q53.a(r0)
        L2e:
            r0 = 0
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r1, r0, r4, r2, r3)
            r1.setTextDirection(r5)
            r1.setAlignment(r6)
            r1.setMaxLines(r7)
            r1.setEllipsize(r8)
            r1.setEllipsizedWidth(r9)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setLineSpacing(r2, r3)
            r1.setIncludePad(r11)
            r1.setBreakStrategy(r12)
            r1.setHyphenationFrequency(r15)
            r2 = 0
            r1.setIndents(r2, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L5e
            defpackage.q66.v(r1, r10)
        L5e:
            r3 = 28
            if (r2 < r3) goto L65
            defpackage.o05.n(r1)
        L65:
            r3 = 33
            if (r2 < r3) goto L7c
            android.graphics.text.LineBreakConfig$Builder r3 = defpackage.a81.c()
            android.graphics.text.LineBreakConfig$Builder r3 = defpackage.a81.d(r3, r13)
            android.graphics.text.LineBreakConfig$Builder r3 = defpackage.a81.t(r3, r14)
            android.graphics.text.LineBreakConfig r3 = defpackage.a81.e(r3)
            defpackage.a81.n(r1, r3)
        L7c:
            r3 = 35
            if (r2 < r3) goto L83
            defpackage.xp.l(r1)
        L83:
            android.text.StaticLayout r1 = r1.build()
            return r1
    }

    public static android.os.Handler u(android.os.Looper r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r4 = defpackage.pp.b(r4)
            return r4
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1}     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            return r0
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r0 = move-exception
            goto L48
        L2d:
            r0 = move-exception
            goto L48
        L2f:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            boolean r0 = r4 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L45
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 == 0) goto L3f
            java.lang.Error r4 = (java.lang.Error) r4
            throw r4
        L3f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L45:
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L48:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
    }

    public static boolean v(android.view.View r4, android.view.KeyEvent r5) {
            java.util.WeakHashMap r0 = defpackage.ao7.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto Lb
            goto L9c
        Lb:
            java.util.ArrayList r0 = defpackage.zn7.d
            r0 = 2131427954(0x7f0b0272, float:1.8477539E38)
            java.lang.Object r1 = r4.getTag(r0)
            zn7 r1 = (defpackage.zn7) r1
            r3 = 0
            if (r1 != 0) goto L27
            zn7 r1 = new zn7
            r1.<init>()
            r1.a = r3
            r1.b = r3
            r1.c = r3
            r4.setTag(r0, r1)
        L27:
            java.lang.ref.WeakReference r4 = r1.c
            if (r4 == 0) goto L32
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L32
            goto L9c
        L32:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r1.c = r4
            android.util.SparseArray r4 = r1.b
            if (r4 != 0) goto L44
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r1.b = r4
        L44:
            android.util.SparseArray r4 = r1.b
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto L60
            int r0 = r5.getKeyCode()
            int r0 = r4.indexOfKey(r0)
            if (r0 < 0) goto L60
            java.lang.Object r3 = r4.valueAt(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4.removeAt(r0)
        L60:
            if (r3 != 0) goto L6d
            int r5 = r5.getKeyCode()
            java.lang.Object r4 = r4.get(r5)
            r3 = r4
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
        L6d:
            if (r3 == 0) goto L9c
            java.lang.Object r4 = r3.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L9b
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L9b
            r5 = 2131427955(0x7f0b0273, float:1.847754E38)
            java.lang.Object r4 = r4.getTag(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L9b
            int r5 = r4.size()
            int r5 = r5 - r1
            if (r5 >= 0) goto L90
            goto L9b
        L90:
            java.lang.Object r4 = r4.get(r5)
            r4.getClass()
            defpackage.u34.a()
            return r2
        L9b:
            return r1
        L9c:
            return r2
    }

    public static boolean w(defpackage.xg3 r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.j(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = defpackage.uj2.a
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.uj2.b = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.uj2.a = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.uj2.b
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ao7.d(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = defpackage.uj2.c
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.uj2.d = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.uj2.c = r3
        L9b:
            java.lang.reflect.Field r6 = defpackage.uj2.d
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ao7.d(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = defpackage.ao7.d(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.j(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
    }

    public static final defpackage.vh2 x(defpackage.ua4 r7, defpackage.of5 r8, int r9) {
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r9 != r0) goto L12
            float r0 = r8.c
            float r4 = r8.a
            float r0 = r0 - r4
            float r0 = r0 + r3
            of5 r0 = r8.h(r0, r2)
            goto L3d
        L12:
            r0 = 4
            if (r9 != r0) goto L21
            float r0 = r8.c
            float r4 = r8.a
            float r0 = r0 - r4
            float r0 = r0 + r3
            float r0 = -r0
            of5 r0 = r8.h(r0, r2)
            goto L3d
        L21:
            r0 = 5
            if (r9 != r0) goto L2f
            float r0 = r8.d
            float r4 = r8.b
            float r0 = r0 - r4
            float r0 = r0 + r3
            of5 r0 = r8.h(r2, r0)
            goto L3d
        L2f:
            r0 = 6
            if (r9 != r0) goto L5e
            float r0 = r8.d
            float r4 = r8.b
            float r0 = r0 - r4
            float r0 = r0 + r3
            float r0 = -r0
            of5 r0 = r8.h(r2, r0)
        L3d:
            java.lang.Object[] r2 = r7.A
            int r7 = r7.L
            r3 = 0
        L42:
            if (r3 >= r7) goto L5d
            r4 = r2[r3]
            vh2 r4 = (defpackage.vh2) r4
            boolean r5 = defpackage.yh2.A(r4)
            if (r5 == 0) goto L5a
            of5 r5 = defpackage.yh2.r(r4)
            boolean r6 = S(r5, r0, r8, r9)
            if (r6 == 0) goto L5a
            r1 = r4
            r0 = r5
        L5a:
            int r3 = r3 + 1
            goto L42
        L5d:
            return r1
        L5e:
            java.lang.String r7 = "This function should only be used for 2-D focus search"
            defpackage.i.m(r7)
            return r1
    }

    public static final boolean y(defpackage.vh2 r4, int r5, defpackage.qn2 r6) {
            ua4 r0 = new ua4
            r1 = 16
            vh2[] r1 = new defpackage.vh2[r1]
            r0.<init>(r1)
            s(r4, r0)
            int r1 = r0.L
            r2 = 1
            r3 = 0
            if (r1 > r2) goto L29
            if (r1 != 0) goto L16
            r4 = 0
            goto L1a
        L16:
            java.lang.Object[] r4 = r0.A
            r4 = r4[r3]
        L1a:
            vh2 r4 = (defpackage.vh2) r4
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.g(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L29:
            r1 = 7
            r2 = 4
            if (r5 != r1) goto L2e
            r5 = r2
        L2e:
            if (r5 != r2) goto L31
            goto L34
        L31:
            r1 = 6
            if (r5 != r1) goto L42
        L34:
            of5 r4 = defpackage.yh2.r(r4)
            of5 r1 = new of5
            float r2 = r4.a
            float r4 = r4.b
            r1.<init>(r2, r4, r2, r4)
            goto L56
        L42:
            r1 = 3
            if (r5 != r1) goto L46
            goto L49
        L46:
            r1 = 5
            if (r5 != r1) goto L68
        L49:
            of5 r4 = defpackage.yh2.r(r4)
            of5 r1 = new of5
            float r2 = r4.c
            float r4 = r4.d
            r1.<init>(r2, r4, r2, r4)
        L56:
            vh2 r4 = x(r0, r1, r5)
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.g(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L67:
            return r3
        L68:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            defpackage.i.m(r4)
            return r3
    }

    public static final int z(int r7, java.util.List r8) {
            java.lang.Object r0 = defpackage.gt0.Q0(r8)
            yr4 r0 = (defpackage.yr4) r0
            int r0 = r0.c
            java.lang.Object r1 = defpackage.gt0.Q0(r8)
            yr4 r1 = (defpackage.yr4) r1
            int r1 = r1.c
            if (r7 > r1) goto L13
            goto L2c
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Index "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " should be less or equal than last line's end "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.q53.a(r0)
        L2c:
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L34:
            if (r3 > r0) goto L56
            int r4 = r3 + r0
            int r4 = r4 >>> r1
            java.lang.Object r5 = r8.get(r4)
            yr4 r5 = (defpackage.yr4) r5
            int r6 = r5.b
            if (r6 <= r7) goto L45
            r5 = r1
            goto L4c
        L45:
            int r5 = r5.c
            if (r5 > r7) goto L4b
            r5 = -1
            goto L4c
        L4b:
            r5 = r2
        L4c:
            if (r5 >= 0) goto L51
            int r3 = r4 + 1
            goto L34
        L51:
            if (r5 <= 0) goto L58
            int r0 = r4 + (-1)
            goto L34
        L56:
            int r3 = r3 + r1
            int r4 = -r3
        L58:
            if (r4 < 0) goto L61
            int r0 = r8.size()
            if (r4 >= r0) goto L61
            return r4
        L61:
            java.lang.String r0 = "Found paragraph index "
            java.lang.String r1 = " should be in range [0, "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r4, r1)
            int r1 = r8.size()
            r0.append(r1)
            java.lang.String r1 = ").\nDebug info: index="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ", paragraphs=["
            r0.append(r7)
            x84 r7 = new x84
            r7.<init>(r2)
            r1 = 31
            r2 = 0
            java.lang.String r7 = defpackage.ex3.a(r1, r7, r2, r8)
            r0.append(r7)
            r7 = 93
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            defpackage.q53.a(r7)
            return r4
    }

    public abstract java.lang.reflect.Method E(java.lang.Class r1, java.lang.reflect.Field r2);

    public abstract java.lang.reflect.Constructor F(java.lang.Class r1);

    public java.lang.Object H(int r2) {
            r1 = this;
            ei r1 = r1.J()
            bb3 r1 = r1.d(r2)
            int r0 = r1.a
            int r2 = r2 - r0
            vp3 r1 = r1.c
            qn2 r1 = r1.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.g(r2)
            return r1
    }

    public abstract defpackage.ei J();

    public java.lang.Object K(int r2) {
            r1 = this;
            ei r1 = r1.J()
            bb3 r1 = r1.d(r2)
            int r0 = r1.a
            int r0 = r2 - r0
            vp3 r1 = r1.c
            qn2 r1 = r1.getKey()
            if (r1 == 0) goto L20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.g(r0)
            if (r1 != 0) goto L1f
            goto L20
        L1f:
            return r1
        L20:
            pe1 r1 = new pe1
            r1.<init>(r2)
            return r1
    }

    public abstract java.lang.String[] M(java.lang.Class r1);

    public abstract boolean Y(java.lang.Class r1);

    @Override // defpackage.kp7
    public void a() {
            r0 = this;
            return
    }

    @Override // defpackage.kp7
    public void b() {
            r0 = this;
            return
    }

    public abstract void l(defpackage.ok5 r1, java.lang.Object r2);
}
