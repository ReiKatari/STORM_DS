package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj2  reason: default package */
/* loaded from: classes.dex */
public abstract class kj2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static int c = 3;
    public static defpackage.e33 d;
    public static final /* synthetic */ int e = 0;
    public static defpackage.e33 f;
    public static defpackage.e33 g;
    public static defpackage.e33 h;

    public static float A(java.lang.String[] r2, int r3) {
            r2 = r2[r3]
            float r2 = java.lang.Float.parseFloat(r2)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L12
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Motion easing control point value must be between 0 and 1; instead got: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final defpackage.e33 B() {
            e33 r0 = defpackage.kj2.d
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "AutoMirrored.Filled.OpenInNew"
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
            r2 = 1100480512(0x41980000, float:19.0)
            r4.o(r2, r2)
            r5 = 1084227584(0x40a00000, float:5.0)
            r4.k(r5)
            r4.t(r5)
            r11 = 1088421888(0x40e00000, float:7.0)
            r4.l(r11)
            r12 = 1077936128(0x40400000, float:3.0)
            r4.t(r12)
            r4.k(r5)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081207685(0xffffffffbf8e147b, float:-1.11)
            r6 = 0
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r13 = 1096810496(0x41600000, float:14.0)
            r4.u(r13)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063507722(0x3f63d70a, float:0.89)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.l(r13)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = -1059061760(0xffffffffc0e00000, float:-7.0)
            r4.u(r5)
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.l(r6)
            r4.u(r11)
            r4.g()
            r4.o(r13, r12)
            r6 = 1073741824(0x40000000, float:2.0)
            r4.u(r6)
            r7 = 1080410767(0x4065c28f, float:3.59)
            r4.l(r7)
            r7 = -1055045714(0xffffffffc11d47ae, float:-9.83)
            r8 = 1092437934(0x411d47ae, float:9.83)
            r4.n(r7, r8)
            r7 = 1068792545(0x3fb47ae1, float:1.41)
            r4.n(r7, r7)
            r7 = 1087184568(0x40cd1eb8, float:6.41)
            r4.m(r2, r7)
            r2 = 1092616192(0x41200000, float:10.0)
            r4.t(r2)
            r4.l(r6)
            r4.t(r12)
            r4.l(r5)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.kj2.d = r0
            return r0
    }

    public static final defpackage.e33 C() {
            e33 r0 = defpackage.kj2.f
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Save"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1099431936(0x41880000, float:17.0)
            r11 = 1077936128(0x40400000, float:3.0)
            r4.o(r2, r11)
            r2 = 1084227584(0x40a00000, float:5.0)
            r4.m(r2, r11)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081207685(0xffffffffbf8e147b, float:-1.11)
            r6 = 0
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r12 = 1096810496(0x41600000, float:14.0)
            r4.u(r12)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063507722(0x3f63d70a, float:0.89)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.l(r12)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1101529088(0x41a80000, float:21.0)
            r6 = 1088421888(0x40e00000, float:7.0)
            r4.m(r5, r6)
            r5 = -1065353216(0xffffffffc0800000, float:-4.0)
            r4.n(r5, r5)
            r4.g()
            r5 = 1094713344(0x41400000, float:12.0)
            r6 = 1100480512(0x41980000, float:19.0)
            r4.o(r5, r6)
            r9 = -1069547520(0xffffffffc0400000, float:-3.0)
            r10 = -1069547520(0xffffffffc0400000, float:-3.0)
            r5 = -1076593951(0xffffffffbfd47ae1, float:-1.66)
            r6 = 0
            r7 = -1069547520(0xffffffffc0400000, float:-3.0)
            r8 = -1079278305(0xffffffffbfab851f, float:-1.34)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1068205343(0x3fab851f, float:1.34)
            r6 = -1069547520(0xffffffffc0400000, float:-3.0)
            r4.q(r5, r6, r11, r6)
            r4.q(r11, r5, r11, r11)
            r5 = -1079278305(0xffffffffbfab851f, float:-1.34)
            r4.q(r5, r11, r6, r11)
            r4.g()
            r5 = 1097859072(0x41700000, float:15.0)
            r6 = 1091567616(0x41100000, float:9.0)
            r4.o(r5, r6)
            r4.m(r2, r6)
            r4.m(r2, r2)
            r2 = 1092616192(0x41200000, float:10.0)
            r4.l(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            r4.u(r2)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.kj2.f = r0
            return r0
    }

    public static final defpackage.e33 D() {
            e33 r0 = defpackage.kj2.g
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Star"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r2 = new ww2
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 1099573494(0x418a28f6, float:17.27)
            r5 = 1094713344(0x41400000, float:12.0)
            r2.o(r5, r3)
            r3 = 1100050596(0x419170a4, float:18.18)
            r6 = 1101529088(0x41a80000, float:21.0)
            r2.m(r3, r6)
            r3 = -1076761723(0xffffffffbfd1eb85, float:-1.64)
            r7 = -1058998845(0xffffffffc0e0f5c3, float:-7.03)
            r2.n(r3, r7)
            r3 = 1102053376(0x41b00000, float:22.0)
            r7 = 1091819274(0x4113d70a, float:9.24)
            r2.m(r3, r7)
            r3 = -1058663301(0xffffffffc0e6147b, float:-7.19)
            r8 = -1088673546(0xffffffffbf1c28f6, float:-0.61)
            r2.n(r3, r8)
            r3 = 1073741824(0x40000000, float:2.0)
            r2.m(r5, r3)
            r5 = 1091766845(0x41130a3d, float:9.19)
            r8 = 1091179643(0x410a147b, float:8.63)
            r2.m(r5, r8)
            r2.m(r3, r7)
            r3 = 1085192274(0x40aeb852, float:5.46)
            r5 = 1083661353(0x40975c29, float:4.73)
            r2.n(r3, r5)
            r3 = 1085947249(0x40ba3d71, float:5.82)
            r2.m(r3, r6)
            r2.g()
            java.util.ArrayList r2 = r2.b
            defpackage.d33.a(r1, r2, r4, r0)
            e33 r0 = r1.b()
            defpackage.kj2.g = r0
            return r0
    }

    public static void E(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = c0(r1)
            r0 = 4
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.i(r1, r2)
        Le:
            return
    }

    public static boolean F(java.lang.String r1) {
            java.lang.String r1 = c0(r1)
            r0 = 3
            boolean r1 = J(r0, r1)
            return r1
    }

    public static boolean G() {
            java.lang.String r0 = "CXCP"
            java.lang.String r0 = c0(r0)
            r1 = 6
            boolean r0 = J(r1, r0)
            return r0
    }

    public static boolean H() {
            java.lang.String r0 = "CXCP"
            java.lang.String r0 = c0(r0)
            r1 = 4
            boolean r0 = J(r1, r0)
            return r0
    }

    public static boolean I(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "("
            java.lang.String r2 = r2.concat(r0)
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L16
            java.lang.String r2 = ")"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean J(int r1, java.lang.String r2) {
            int r0 = defpackage.kj2.c
            if (r0 <= r1) goto Ld
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static boolean K(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean L() {
            java.lang.String r0 = "CXCP"
            java.lang.String r0 = c0(r0)
            r1 = 5
            boolean r0 = J(r1, r0)
            return r0
    }

    public static defpackage.go3 M(defpackage.xr3 r2, defpackage.on2 r3) {
            xd5 r0 = defpackage.xd5.u0
            r2.getClass()
            int[] r1 = defpackage.mp3.a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L2f
            r1 = 2
            if (r2 == r1) goto L25
            r1 = 3
            if (r2 != r1) goto L20
            bh7 r2 = new bh7
            r2.<init>()
            r2.A = r3
            r2.B = r0
            return r2
        L20:
            defpackage.i.d()
            r2 = 0
            return r2
        L25:
            u36 r2 = new u36
            r2.<init>()
            r2.A = r3
            r2.B = r0
            return r2
        L2f:
            ex6 r2 = new ex6
            r2.<init>(r3)
            return r2
    }

    public static defpackage.ex6 N(defpackage.on2 r1) {
            r1.getClass()
            ex6 r0 = new ex6
            r0.<init>(r1)
            return r0
    }

    public static final defpackage.ge6 O(defpackage.ge6 r8, defpackage.ge6 r9, float r10) {
            ge6 r0 = new ge6
            long r1 = r8.a
            long r3 = r9.a
            long r2 = defpackage.hv.M(r10, r1, r3)
            long r4 = r8.b
            long r6 = r9.b
            long r4 = defpackage.gi2.J(r10, r4, r6)
            float r8 = r8.c
            float r9 = r9.c
            float r1 = defpackage.oi2.L(r8, r9, r10)
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static final java.lang.Object P(defpackage.mw6 r17, defpackage.ci r18, defpackage.ei r19, defpackage.oy4 r20, defpackage.d20 r21) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            u34 r7 = defpackage.xd5.o0
            boolean r4 = r3 instanceof defpackage.ia6
            if (r4 == 0) goto L1e
            r4 = r3
            ia6 r4 = (defpackage.ia6) r4
            int r5 = r4.d0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r5 & r6
            if (r8 == 0) goto L1e
            int r5 = r5 - r6
            r4.d0 = r5
        L1c:
            r8 = r4
            goto L24
        L1e:
            ia6 r4 = new ia6
            r4.<init>(r3)
            goto L1c
        L24:
            java.lang.Object r3 = r8.Z
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r8.d0
            r10 = 0
            r11 = 2
            r12 = 1
            if (r4 == 0) goto L58
            if (r4 == r12) goto L4d
            if (r4 != r11) goto L46
            zg5 r0 = r8.Y
            ci r1 = r8.X
            mw6 r2 = r8.R
            defpackage.oi2.Y(r3)     // Catch: java.lang.Throwable -> L43
            r16 = r2
            r2 = r0
            r0 = r16
            goto L169
        L43:
            r0 = move-exception
            goto L197
        L46:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L4d:
            ci r1 = r8.X
            mw6 r0 = r8.R
            defpackage.oi2.Y(r3)     // Catch: java.lang.Throwable -> L55
            goto Lb5
        L55:
            r0 = move-exception
            goto Le0
        L58:
            defpackage.oi2.Y(r3)
            java.util.List r3 = r2.a
            java.lang.Object r3 = r3.get(r10)
            r13 = r3
            vy4 r13 = (defpackage.vy4) r13
            int r2 = r2.e
            r2 = r2 & r12
            r3 = -1
            if (r2 == 0) goto Le4
            long r4 = r13.c
            java.lang.Object r2 = r1.R
            p27 r2 = (defpackage.p27) r2
            jt3 r6 = r2.d
            if (r6 == 0) goto L98
            b47 r6 = r6.d()
            if (r6 != 0) goto L7b
            goto L98
        L7b:
            boolean r6 = r2.k()
            if (r6 != 0) goto L82
            goto L98
        L82:
            r2.t = r3
            nh2 r3 = r2.l
            if (r3 == 0) goto L8b
            defpackage.nh2.a(r3)
        L8b:
            c37 r2 = r2.n()
            r3 = r4
            r5 = 0
            u34 r6 = defpackage.xd5.o0
            r1.q(r2, r3, r5, r6)
            r2 = r12
            goto L99
        L98:
            r2 = r10
        L99:
            if (r2 == 0) goto L19b
            r13.a()     // Catch: java.lang.Throwable -> L55
            long r2 = r13.a     // Catch: java.lang.Throwable -> L55
            ro5 r4 = new ro5     // Catch: java.lang.Throwable -> L55
            r5 = 9
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L55
            r8.R = r0     // Catch: java.lang.Throwable -> L55
            r8.X = r1     // Catch: java.lang.Throwable -> L55
            r8.d0 = r12     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = defpackage.sn1.e(r0, r2, r4, r8)     // Catch: java.lang.Throwable -> L55
            if (r3 != r9) goto Lb5
            goto L168
        Lb5:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L55
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto Ldb
            ow6 r0 = r0.Y     // Catch: java.lang.Throwable -> L55
            oy4 r0 = r0.p0     // Catch: java.lang.Throwable -> L55
            java.util.List r0 = r0.a     // Catch: java.lang.Throwable -> L55
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L55
        Lc7:
            if (r10 >= r2) goto Ldb
            java.lang.Object r3 = r0.get(r10)     // Catch: java.lang.Throwable -> L55
            vy4 r3 = (defpackage.vy4) r3     // Catch: java.lang.Throwable -> L55
            boolean r4 = defpackage.ej2.o(r3)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto Ld8
            r3.a()     // Catch: java.lang.Throwable -> L55
        Ld8:
            int r10 = r10 + 1
            goto Lc7
        Ldb:
            r1.n()
            goto L19b
        Le0:
            r1.n()
            throw r0
        Le4:
            r2 = r19
            int r14 = r2.B
            if (r14 == r12) goto Lf3
            if (r14 == r11) goto Lf0
            fa6 r2 = defpackage.xd5.q0
        Lee:
            r6 = r2
            goto Lf4
        Lf0:
            fa6 r2 = defpackage.xd5.p0
            goto Lee
        Lf3:
            r6 = r7
        Lf4:
            long r4 = r13.c
            java.lang.Object r2 = r1.R
            p27 r2 = (defpackage.p27) r2
            boolean r15 = r2.k()
            if (r15 == 0) goto L142
            c37 r15 = r2.n()
            fp r15 = r15.a
            java.lang.String r15 = r15.B
            int r15 = r15.length()
            if (r15 != 0) goto L10f
            goto L142
        L10f:
            jt3 r15 = r2.d
            if (r15 == 0) goto L142
            b47 r15 = r15.d()
            if (r15 != 0) goto L11a
            goto L142
        L11a:
            nh2 r15 = r2.l
            if (r15 == 0) goto L121
            defpackage.nh2.a(r15)
        L121:
            r2.o = r4
            r2.t = r3
            r2.h(r12)
            c37 r3 = r2.n()
            long r4 = r2.o
            r2 = r3
            r3 = r4
            r5 = 1
            long r2 = r1.q(r2, r3, r5, r6)
            if (r14 < r11) goto L140
            r1.B = r12
            k47 r4 = new k47
            r4.<init>(r2)
            r1.L = r4
        L140:
            r2 = r12
            goto L143
        L142:
            r2 = r10
        L143:
            if (r2 == 0) goto L19b
            zg5 r2 = new zg5     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            boolean r3 = r6.equals(r7)     // Catch: java.lang.Throwable -> L43
            r3 = r3 ^ r12
            r2.A = r3     // Catch: java.lang.Throwable -> L43
            long r3 = r13.a     // Catch: java.lang.Throwable -> L43
            t00 r5 = new t00     // Catch: java.lang.Throwable -> L43
            r7 = 24
            r5.<init>(r1, r6, r2, r7)     // Catch: java.lang.Throwable -> L43
            r8.R = r0     // Catch: java.lang.Throwable -> L43
            r8.X = r1     // Catch: java.lang.Throwable -> L43
            r8.Y = r2     // Catch: java.lang.Throwable -> L43
            r8.d0 = r11     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = defpackage.sn1.e(r0, r3, r5, r8)     // Catch: java.lang.Throwable -> L43
            if (r3 != r9) goto L169
        L168:
            return r9
        L169:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L193
            boolean r2 = r2.A     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L193
            ow6 r0 = r0.Y     // Catch: java.lang.Throwable -> L43
            oy4 r0 = r0.p0     // Catch: java.lang.Throwable -> L43
            java.util.List r0 = r0.a     // Catch: java.lang.Throwable -> L43
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L43
        L17f:
            if (r10 >= r2) goto L193
            java.lang.Object r3 = r0.get(r10)     // Catch: java.lang.Throwable -> L43
            vy4 r3 = (defpackage.vy4) r3     // Catch: java.lang.Throwable -> L43
            boolean r4 = defpackage.ej2.o(r3)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L190
            r3.a()     // Catch: java.lang.Throwable -> L43
        L190:
            int r10 = r10 + 1
            goto L17f
        L193:
            r1.n()
            goto L19b
        L197:
            r1.n()
            throw r0
        L19b:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static java.util.List Q(defpackage.pk6 r24, int r25, defpackage.pk6 r26, boolean r27, boolean r28, boolean r29) {
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.u(r25)
            int r4 = r1 + r3
            int r5 = r24.f(r25)
            int r6 = r0.f(r4)
            int r7 = r6 - r5
            r9 = 1
            if (r1 < 0) goto L2b
            int[] r10 = r0.b
            int r11 = r24.r(r25)
            int r11 = r11 * 5
            int r11 = r11 + r9
            r10 = r10[r11]
            r11 = 201326592(0xc000000, float:9.8607613E-32)
            r10 = r10 & r11
            if (r10 == 0) goto L2b
            r10 = r9
            goto L2c
        L2b:
            r10 = 0
        L2c:
            r2.w(r3)
            int r11 = r2.t
            r2.x(r7, r11)
            int r11 = r0.g
            if (r11 >= r4) goto L3b
            r0.B(r4)
        L3b:
            int r11 = r0.k
            if (r11 >= r6) goto L42
            r0.C(r6, r4)
        L42:
            int[] r6 = r2.b
            int r11 = r2.t
            int[] r12 = r0.b
            int r13 = r11 * 5
            int r14 = r1 * 5
            int r15 = r4 * 5
            defpackage.fv.r0(r13, r14, r15, r12, r6)
            java.lang.Object[] r12 = r2.c
            int r14 = r2.i
            java.lang.Object[] r15 = r0.c
            java.lang.System.arraycopy(r15, r5, r12, r14, r7)
            int r15 = r2.v
            int r16 = r13 + 2
            r6[r16] = r15
            int r16 = r11 - r1
            int r8 = r11 + r3
            int r18 = r2.g(r6, r11)
            int r18 = r14 - r18
            r19 = r9
            int r9 = r2.m
            r20 = r9
            int r9 = r2.l
            int r12 = r12.length
            r21 = r10
            r10 = r20
            r20 = r13
            r13 = r11
        L7a:
            if (r13 >= r8) goto Laf
            if (r13 == r11) goto L88
            int r22 = r13 * 5
            int r22 = r22 + 2
            r23 = r6[r22]
            int r23 = r23 + r16
            r6[r22] = r23
        L88:
            int r22 = r2.g(r6, r13)
            r23 = r6
            int r6 = r22 + r18
            if (r10 >= r13) goto L96
            r22 = r11
            r11 = 0
            goto L9a
        L96:
            r22 = r11
            int r11 = r2.k
        L9a:
            int r6 = defpackage.pk6.i(r6, r11, r9, r12)
            int r11 = r13 * 5
            int r11 = r11 + 4
            r23[r11] = r6
            if (r13 != r10) goto La8
            int r10 = r10 + 1
        La8:
            int r13 = r13 + 1
            r11 = r22
            r6 = r23
            goto L7a
        Laf:
            r23 = r6
            r2.m = r10
            java.util.ArrayList r6 = r0.d
            int r9 = r0.p()
            int r6 = defpackage.ok6.a(r6, r1, r9)
            java.util.ArrayList r9 = r0.d
            int r10 = r0.p()
            int r4 = defpackage.ok6.a(r9, r4, r10)
            if (r6 >= r4) goto L100
            java.util.ArrayList r9 = r0.d
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4 - r6
            r10.<init>(r11)
            r11 = r6
        Ld3:
            if (r11 >= r4) goto Le7
            java.lang.Object r12 = r9.get(r11)
            sq2 r12 = (defpackage.sq2) r12
            int r13 = r12.a
            int r13 = r13 + r16
            r12.a = r13
            r10.add(r12)
            int r11 = r11 + 1
            goto Ld3
        Le7:
            java.util.ArrayList r11 = r2.d
            int r12 = r2.t
            int r13 = r2.p()
            int r11 = defpackage.ok6.a(r11, r12, r13)
            java.util.ArrayList r12 = r2.d
            r12.addAll(r11, r10)
            java.util.List r4 = r9.subList(r6, r4)
            r4.clear()
            goto L102
        L100:
            yt1 r10 = defpackage.yt1.A
        L102:
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L126
            java.util.HashMap r4 = r0.e
            java.util.HashMap r6 = r2.e
            if (r4 == 0) goto L126
            if (r6 == 0) goto L126
            int r6 = r10.size()
            r9 = 0
        L115:
            if (r9 >= r6) goto L126
            java.lang.Object r11 = r10.get(r9)
            sq2 r11 = (defpackage.sq2) r11
            java.lang.Object r11 = r4.get(r11)
            zq2 r11 = (defpackage.zq2) r11
            int r9 = r9 + 1
            goto L115
        L126:
            int r4 = r2.v
            r2.O(r15)
            int[] r4 = r0.b
            int r4 = r0.E(r4, r1)
            if (r29 != 0) goto L136
            r17 = 0
            goto L173
        L136:
            if (r27 == 0) goto L168
            if (r4 < 0) goto L13d
            r17 = r19
            goto L13f
        L13d:
            r17 = 0
        L13f:
            if (r17 == 0) goto L14d
            r0.P()
            int r3 = r0.t
            int r4 = r4 - r3
            r0.a(r4)
            r0.P()
        L14d:
            int r3 = r0.t
            int r1 = r1 - r3
            r0.a(r1)
            boolean r1 = r0.H()
            if (r17 == 0) goto L165
            r0.M()
            r0.j()
            r0.M()
            r0.j()
        L165:
            r17 = r1
            goto L173
        L168:
            boolean r3 = r0.I(r1, r3)
            int r1 = r1 + (-1)
            r0.J(r5, r7, r1)
            r17 = r3
        L173:
            if (r17 == 0) goto L17a
            java.lang.String r0 = "Unexpectedly removed anchors"
            defpackage.tx0.a(r0)
        L17a:
            int r0 = r2.o
            int r13 = r20 + 1
            r1 = r23[r13]
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r1
            if (r3 == 0) goto L188
            r9 = r19
            goto L18d
        L188:
            r3 = 67108863(0x3ffffff, float:1.5046327E-36)
            r9 = r1 & r3
        L18d:
            int r0 = r0 + r9
            r2.o = r0
            if (r28 == 0) goto L197
            r2.t = r8
            int r14 = r14 + r7
            r2.i = r14
        L197:
            if (r21 == 0) goto L19c
            r2.T(r15)
        L19c:
            return r10
    }

    public static final defpackage.sr4 R(defpackage.px0 r55, int r56) {
            r0 = r56
            nq6 r1 = defpackage.kf.b
            r2 = r55
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r1 = r2.j(r1)
            android.content.Context r1 = (android.content.Context) r1
            py0 r3 = defpackage.kf.c
            java.lang.Object r3 = r2.j(r3)
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            nq6 r4 = defpackage.kf.e
            java.lang.Object r4 = r2.j(r4)
            ml5 r4 = (defpackage.ml5) r4
            monitor-enter(r4)
            p94 r5 = r4.a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L43
            android.util.TypedValue r5 = (android.util.TypedValue) r5     // Catch: java.lang.Throwable -> L43
            r6 = 1
            if (r5 != 0) goto L46
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            r3.getValue(r0, r5, r6)     // Catch: java.lang.Throwable -> L43
            p94 r7 = r4.a     // Catch: java.lang.Throwable -> L43
            int r8 = r7.d(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r9 = r7.c     // Catch: java.lang.Throwable -> L43
            r10 = r9[r8]     // Catch: java.lang.Throwable -> L43
            int[] r7 = r7.b     // Catch: java.lang.Throwable -> L43
            r7[r8] = r0     // Catch: java.lang.Throwable -> L43
            r9[r8] = r5     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
            goto L5d5
        L46:
            monitor-exit(r4)
            java.lang.CharSequence r4 = r5.string
            r8 = 0
            if (r4 == 0) goto L579
            java.lang.String r9 = ".xml"
            boolean r9 = defpackage.qs6.l0(r4, r9)
            if (r9 != r6) goto L579
            r4 = -1771798434(0xffffffff9664805e, float:-1.8458199E-25)
            r2.b0(r4)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r4 = r5.changingConfigurations
            nq6 r5 = defpackage.kf.d
            java.lang.Object r5 = r2.j(r5)
            h33 r5 = (defpackage.h33) r5
            g33 r9 = new g33
            r9.<init>(r1, r0)
            java.util.HashMap r10 = r5.a
            java.lang.Object r10 = r10.get(r9)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r10.get()
            f33 r10 = (defpackage.f33) r10
            goto L7f
        L7e:
            r10 = 0
        L7f:
            if (r10 != 0) goto L56a
            android.content.res.XmlResourceParser r0 = r3.getXml(r0)
            int r10 = r0.next()
        L89:
            r11 = 2
            if (r10 == r11) goto L93
            if (r10 == r6) goto L93
            int r10 = r0.next()
            goto L89
        L93:
            if (r10 != r11) goto L562
            java.lang.String r10 = r0.getName()
            java.lang.String r12 = "vector"
            boolean r10 = defpackage.nb3.k(r10, r12)
            if (r10 == 0) goto L55a
            java.lang.String r10 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r0)
            wm r13 = new wm
            r13.<init>(r0)
            org.xmlpull.v1.XmlPullParser r14 = r13.a
            int[] r15 = defpackage.mb3.a
            android.content.res.TypedArray r15 = defpackage.xk2.D(r3, r1, r12, r15)
            r55 = 0
            int r7 = r15.getChangingConfigurations()
            r13.b(r7)
            java.lang.String r7 = "autoMirrored"
            boolean r7 = defpackage.xk2.v(r0, r7)
            r6 = 5
            if (r7 != 0) goto Lc9
            r26 = r8
            goto Lcf
        Lc9:
            boolean r7 = r15.getBoolean(r6, r8)
            r26 = r7
        Lcf:
            int r7 = r15.getChangingConfigurations()
            r13.b(r7)
            java.lang.String r7 = "viewportWidth"
            r8 = 7
            r6 = 0
            float r21 = r13.a(r15, r7, r8, r6)
            java.lang.String r7 = "viewportHeight"
            r8 = 8
            float r22 = r13.a(r15, r7, r8, r6)
            int r7 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r7 <= 0) goto L53f
            int r7 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r7 <= 0) goto L524
            r7 = 3
            float r17 = r15.getDimension(r7, r6)
            int r8 = r15.getChangingConfigurations()
            r13.b(r8)
            float r8 = r15.getDimension(r11, r6)
            int r6 = r15.getChangingConfigurations()
            r13.b(r6)
            r6 = 1
            boolean r16 = r15.hasValue(r6)
            if (r16 == 0) goto L136
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r15.getValue(r6, r7)
            int r6 = r7.type
            if (r6 != r11) goto L11d
            long r6 = defpackage.kt0.h
        L11a:
            r23 = r6
            goto L139
        L11d:
            android.content.res.ColorStateList r6 = defpackage.xk2.p(r15, r0, r1)
            int r7 = r15.getChangingConfigurations()
            r13.b(r7)
            if (r6 == 0) goto L133
            int r6 = r6.getDefaultColor()
            long r6 = defpackage.hv.b(r6)
            goto L11a
        L133:
            long r6 = defpackage.kt0.h
            goto L11a
        L136:
            long r6 = defpackage.kt0.h
            goto L11a
        L139:
            r6 = 6
            r7 = -1
            int r11 = r15.getInt(r6, r7)
            int r6 = r15.getChangingConfigurations()
            r13.b(r6)
            r6 = 9
            if (r11 == r7) goto L155
            r7 = 3
            if (r11 == r7) goto L166
            r7 = 5
            if (r11 == r7) goto L155
            if (r11 == r6) goto L163
            switch(r11) {
                case 14: goto L160;
                case 15: goto L15b;
                case 16: goto L158;
                default: goto L155;
            }
        L155:
            r25 = 5
            goto L168
        L158:
            r25 = 12
            goto L168
        L15b:
            r7 = 14
            r25 = r7
            goto L168
        L160:
            r25 = 13
            goto L168
        L163:
            r25 = r6
            goto L168
        L166:
            r25 = 3
        L168:
            android.util.DisplayMetrics r7 = r3.getDisplayMetrics()
            float r7 = r7.density
            float r19 = r17 / r7
            android.util.DisplayMetrics r7 = r3.getDisplayMetrics()
            float r7 = r7.density
            float r20 = r8 / r7
            r15.recycle()
            d33 r17 = new d33
            r18 = 0
            r27 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r26, r27)
            r7 = r17
            java.util.ArrayList r8 = r7.i
            r11 = 0
        L189:
            int r15 = r0.getEventType()
            r6 = 1
            if (r15 == r6) goto L19d
            int r15 = r0.getDepth()
            if (r15 >= r6) goto L1a3
            int r6 = r0.getEventType()
            r15 = 3
            if (r6 != r15) goto L1a4
        L19d:
            r17 = r2
            r20 = r4
            goto L50a
        L1a3:
            r15 = 3
        L1a4:
            java.lang.String r6 = "group"
            yt1 r39 = defpackage.yt1.A
            java.lang.String r18 = ""
            t9 r15 = r13.c
            r19 = r0
            int r0 = r14.getEventType()
            r20 = r4
            r4 = 2
            if (r0 == r4) goto L239
            r4 = 3
            if (r0 == r4) goto L1c2
        L1ba:
            r17 = r2
            r21 = r10
            r22 = r11
            goto L2d7
        L1c2:
            java.lang.String r0 = r14.getName()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1ba
            int r11 = r11 + 1
            r0 = 0
        L1cf:
            if (r0 >= r11) goto L22b
            boolean r4 = r7.k
            if (r4 == 0) goto L1d8
            defpackage.p53.c(r10)
        L1d8:
            int r4 = r8.size()
            r16 = 1
            int r4 = r4 + (-1)
            java.lang.Object r4 = r8.remove(r4)
            c33 r4 = (defpackage.c33) r4
            int r6 = r8.size()
            int r6 = r6 + (-1)
            java.lang.Object r6 = r8.get(r6)
            c33 r6 = (defpackage.c33) r6
            java.util.ArrayList r6 = r6.j
            dl7 r30 = new dl7
            java.lang.String r15 = r4.a
            r18 = r0
            float r0 = r4.b
            r32 = r0
            float r0 = r4.c
            r33 = r0
            float r0 = r4.d
            r34 = r0
            float r0 = r4.e
            r35 = r0
            float r0 = r4.f
            r36 = r0
            float r0 = r4.g
            r37 = r0
            float r0 = r4.h
            r38 = r0
            java.util.List r0 = r4.i
            java.util.ArrayList r4 = r4.j
            r39 = r0
            r40 = r4
            r31 = r15
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = r30
            r6.add(r0)
            int r0 = r18 + 1
            goto L1cf
        L22b:
            r17 = r2
            r21 = r10
            r6 = 1
            r11 = 5
            r22 = 0
        L233:
            r28 = 8
            r29 = 6
            goto L4f9
        L239:
            java.lang.String r0 = r14.getName()
            if (r0 == 0) goto L1ba
            int r4 = r0.hashCode()
            r21 = r10
            r10 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r4 == r10) goto L47f
            r10 = 3433509(0x346425, float:4.811371E-39)
            r22 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r4 == r10) goto L2db
            r10 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r4 == r10) goto L25a
        L258:
            goto L2d5
        L25a:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L261
        L260:
            goto L258
        L261:
            int[] r0 = defpackage.mb3.b
            android.content.res.TypedArray r0 = defpackage.xk2.D(r3, r1, r12, r0)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            java.lang.String r4 = "rotation"
            r6 = 5
            r10 = 0
            float r32 = r13.a(r0, r4, r6, r10)
            r6 = 1
            float r33 = r0.getFloat(r6, r10)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            r4 = 2
            float r34 = r0.getFloat(r4, r10)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            java.lang.String r4 = "scaleX"
            r15 = 3
            float r35 = r13.a(r0, r4, r15, r11)
            java.lang.String r4 = "scaleY"
            r6 = 4
            float r36 = r13.a(r0, r4, r6, r11)
            java.lang.String r4 = "translateX"
            r6 = 6
            float r37 = r13.a(r0, r4, r6, r10)
            java.lang.String r4 = "translateY"
            r6 = 7
            float r38 = r13.a(r0, r4, r6, r10)
            r4 = 0
            java.lang.String r6 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            if (r6 != 0) goto L2bb
            r31 = r18
            goto L2bd
        L2bb:
            r31 = r6
        L2bd:
            r0.recycle()
            int r0 = defpackage.el7.a
            boolean r0 = r7.k
            if (r0 == 0) goto L2c9
            defpackage.p53.c(r21)
        L2c9:
            c33 r30 = new c33
            r40 = 512(0x200, float:7.17E-43)
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = r30
            r8.add(r0)
        L2d5:
            r17 = r2
        L2d7:
            r6 = 1
            r11 = 5
            goto L233
        L2db:
            java.lang.String r4 = "path"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L2e5
            goto L260
        L2e5:
            int[] r0 = defpackage.mb3.c
            android.content.res.TypedArray r0 = defpackage.xk2.D(r3, r1, r12, r0)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            java.lang.String r4 = "pathData"
            java.lang.String r6 = "http://schemas.android.com/apk/res/android"
            java.lang.String r4 = r14.getAttributeValue(r6, r4)
            if (r4 == 0) goto L474
            r4 = 0
            java.lang.String r6 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            if (r6 != 0) goto L30e
            r41 = r18
        L30c:
            r4 = 2
            goto L311
        L30e:
            r41 = r6
            goto L30c
        L311:
            java.lang.String r6 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            if (r6 != 0) goto L323
            int r4 = defpackage.el7.a
        L320:
            r42 = r39
            goto L328
        L323:
            java.util.ArrayList r39 = defpackage.t9.a(r15, r6)
            goto L320
        L328:
            java.lang.String r4 = "fillColor"
            r6 = 1
            ei r4 = defpackage.xk2.q(r0, r14, r1, r4, r6)
            int r6 = r0.getChangingConfigurations()
            r13.b(r6)
            java.lang.String r6 = "fillAlpha"
            r10 = 12
            float r45 = r13.a(r0, r6, r10, r11)
            java.lang.String r6 = "strokeLineCap"
            boolean r6 = defpackage.xk2.v(r14, r6)
            if (r6 != 0) goto L34a
            r6 = -1
            r15 = 8
            goto L353
        L34a:
            r6 = -1
            r15 = 8
            int r18 = r0.getInt(r15, r6)
            r6 = r18
        L353:
            int r10 = r0.getChangingConfigurations()
            r13.b(r10)
            if (r6 == 0) goto L362
            r10 = 1
            if (r6 == r10) goto L368
            r10 = 2
            if (r6 == r10) goto L365
        L362:
            r49 = 0
            goto L36a
        L365:
            r49 = 2
            goto L36a
        L368:
            r49 = 1
        L36a:
            java.lang.String r6 = "strokeLineJoin"
            boolean r6 = defpackage.xk2.v(r14, r6)
            if (r6 != 0) goto L374
            r6 = -1
            goto L37d
        L374:
            r6 = 9
            r10 = -1
            int r17 = r0.getInt(r6, r10)
            r6 = r17
        L37d:
            int r10 = r0.getChangingConfigurations()
            r13.b(r10)
            if (r6 == 0) goto L396
            r10 = 1
            if (r6 == r10) goto L392
            r10 = 2
            if (r6 == r10) goto L38f
        L38c:
            r50 = 0
            goto L398
        L38f:
            r50 = r10
            goto L398
        L392:
            r10 = 2
            r50 = 1
            goto L398
        L396:
            r10 = 2
            goto L38c
        L398:
            java.lang.String r6 = "strokeMiterLimit"
            r10 = 10
            r15 = 1082130432(0x40800000, float:4.0)
            float r51 = r13.a(r0, r6, r10, r15)
            java.lang.String r6 = "strokeColor"
            r10 = 3
            ei r6 = defpackage.xk2.q(r0, r14, r1, r6, r10)
            int r15 = r0.getChangingConfigurations()
            r13.b(r15)
            java.lang.String r15 = "strokeAlpha"
            r10 = 11
            float r47 = r13.a(r0, r15, r10, r11)
            java.lang.String r10 = "strokeWidth"
            r15 = 4
            float r48 = r13.a(r0, r10, r15, r11)
            java.lang.String r10 = "trimPathEnd"
            r15 = 6
            float r53 = r13.a(r0, r10, r15, r11)
            java.lang.String r10 = "trimPathOffset"
            r17 = r2
            r2 = 0
            r11 = 7
            float r54 = r13.a(r0, r10, r11, r2)
            java.lang.String r10 = "trimPathStart"
            r11 = 5
            float r52 = r13.a(r0, r10, r11, r2)
            java.lang.String r10 = "fillType"
            boolean r10 = defpackage.xk2.v(r14, r10)
            if (r10 != 0) goto L3e4
            r2 = 13
            r18 = 0
            goto L3eb
        L3e4:
            r2 = 13
            r10 = 0
            int r18 = r0.getInt(r2, r10)
        L3eb:
            int r10 = r0.getChangingConfigurations()
            r13.b(r10)
            r0.recycle()
            java.lang.Object r0 = r4.L
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 == 0) goto L3fc
            goto L400
        L3fc:
            int r10 = r4.B
            if (r10 == 0) goto L41c
        L400:
            if (r0 == 0) goto L40c
            g80 r4 = new g80
            r4.<init>(r0)
            r23 = r3
            r44 = r4
            goto L420
        L40c:
            cn6 r0 = new cn6
            int r4 = r4.B
            r23 = r3
            long r2 = defpackage.hv.b(r4)
            r0.<init>(r2)
            r44 = r0
            goto L420
        L41c:
            r23 = r3
            r44 = r55
        L420:
            java.lang.Object r0 = r6.L
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 == 0) goto L427
            goto L42b
        L427:
            int r2 = r6.B
            if (r2 == 0) goto L441
        L42b:
            if (r0 == 0) goto L435
            g80 r2 = new g80
            r2.<init>(r0)
        L432:
            r46 = r2
            goto L443
        L435:
            cn6 r2 = new cn6
            int r0 = r6.B
            long r3 = defpackage.hv.b(r0)
            r2.<init>(r3)
            goto L432
        L441:
            r46 = r55
        L443:
            if (r18 != 0) goto L448
            r43 = 0
            goto L44a
        L448:
            r43 = 1
        L44a:
            boolean r0 = r7.k
            if (r0 == 0) goto L451
            defpackage.p53.c(r21)
        L451:
            int r0 = r8.size()
            r16 = 1
            int r0 = r0 + (-1)
            java.lang.Object r0 = r8.get(r0)
            c33 r0 = (defpackage.c33) r0
            java.util.ArrayList r0 = r0.j
            hl7 r40 = new hl7
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r2 = r40
            r0.add(r2)
            r29 = r15
            r3 = r23
            r6 = 1
            r28 = 8
            goto L4f9
        L474:
            r17 = r2
            java.lang.String r0 = "No path data available"
            defpackage.i.h(r0)
            r7 = r55
            goto L518
        L47f:
            r17 = r2
            r23 = r3
            r22 = r11
            r11 = 5
            r28 = 8
            r29 = 6
            java.lang.String r2 = "clip-path"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L496
            r3 = r23
            r6 = 1
            goto L4f9
        L496:
            int[] r0 = defpackage.mb3.d
            r3 = r23
            android.content.res.TypedArray r0 = defpackage.xk2.D(r3, r1, r12, r0)
            int r2 = r0.getChangingConfigurations()
            r13.b(r2)
            r4 = 0
            java.lang.String r2 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            if (r2 != 0) goto L4b7
            r41 = r18
        L4b5:
            r6 = 1
            goto L4ba
        L4b7:
            r41 = r2
            goto L4b5
        L4ba:
            java.lang.String r2 = r0.getString(r6)
            int r4 = r0.getChangingConfigurations()
            r13.b(r4)
            if (r2 != 0) goto L4cc
            int r2 = defpackage.el7.a
        L4c9:
            r49 = r39
            goto L4d1
        L4cc:
            java.util.ArrayList r39 = defpackage.t9.a(r15, r2)
            goto L4c9
        L4d1:
            r0.recycle()
            boolean r0 = r7.k
            if (r0 == 0) goto L4db
            defpackage.p53.c(r21)
        L4db:
            c33 r40 = new c33
            r50 = 512(0x200, float:7.17E-43)
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 1065353216(0x3f800000, float:1.0)
            r46 = 1065353216(0x3f800000, float:1.0)
            r47 = 0
            r48 = 0
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r0 = r40
            r8.add(r0)
            int r0 = r22 + 1
            r22 = r0
        L4f9:
            r19.next()
            r2 = r17
            r0 = r19
            r4 = r20
            r10 = r21
            r11 = r22
            r6 = 9
            goto L189
        L50a:
            int r0 = r13.b
            r0 = r20 | r0
            f33 r1 = new f33
            e33 r2 = r7.b()
            r1.<init>(r2, r0)
            r7 = r1
        L518:
            java.util.HashMap r0 = r5.a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r7)
            r0.put(r9, r1)
            r10 = r7
            goto L56c
        L524:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r15.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<VectorGraphic> tag requires viewportHeight > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L53f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r15.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<VectorGraphic> tag requires viewportWidth > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L55a:
            r55 = 0
            java.lang.String r0 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"
            defpackage.i.h(r0)
            return r55
        L562:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L56a:
            r17 = r2
        L56c:
            e33 r0 = r10.a
            r2 = r17
            gl7 r0 = defpackage.kn2.Z(r0, r2)
            r4 = 0
            r2.p(r4)
            return r0
        L579:
            r55 = 0
            r5 = -1771643000(0xffffffff9666df88, float:-1.8649786E-25)
            r2.b0(r5)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            boolean r5 = r2.f(r4)
            boolean r6 = r2.d(r0)
            r5 = r5 | r6
            boolean r1 = r2.f(r1)
            r1 = r1 | r5
            java.lang.Object r5 = r2.P()
            if (r1 != 0) goto L59d
            vs0 r1 = defpackage.ox0.a
            if (r5 != r1) goto L5b4
        L59d:
            r1 = r55
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0, r1)     // Catch: java.lang.Exception -> L5c0
            r0.getClass()     // Catch: java.lang.Exception -> L5c0
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Exception -> L5c0
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Exception -> L5c0
            zh r5 = new zh     // Catch: java.lang.Exception -> L5c0
            r5.<init>(r0)     // Catch: java.lang.Exception -> L5c0
            r2.l0(r5)
        L5b4:
            zh r5 = (defpackage.zh) r5
            w40 r0 = new w40
            r0.<init>(r5)
            r4 = 0
            r2.p(r4)
            return r0
        L5c0:
            r0 = move-exception
            ug r1 = new ug
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error attempting to load resource: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L5d5:
            monitor-exit(r4)
            throw r0
    }

    public static defpackage.a74 S(defpackage.a74 r1, defpackage.sj r2) {
            ry4 r0 = new ry4
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static void T(float r9, float[] r10) {
            r0 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            android.opengl.Matrix.translateM(r10, r0, r1, r1, r2)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r6 = 0
            r5 = r9
            r3 = r10
            android.opengl.Matrix.rotateM(r3, r4, r5, r6, r7, r8)
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            android.opengl.Matrix.translateM(r3, r0, r9, r9, r2)
            return
    }

    public static void U(float[] r4) {
            r0 = 0
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            android.opengl.Matrix.translateM(r4, r0, r1, r2, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.opengl.Matrix.scaleM(r4, r0, r2, r3, r2)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1090519040(0xffffffffbf000000, float:-0.5)
            android.opengl.Matrix.translateM(r4, r0, r2, r3, r1)
            return
    }

    public static void V(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.internal.CheckableImageButton r6, android.content.res.ColorStateList r7) {
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            if (r1 == 0) goto L3e
            if (r7 == 0) goto L3e
            boolean r1 = r7.isStateful()
            if (r1 != 0) goto L13
            goto L3e
        L13:
            int[] r5 = r5.getDrawableState()
            int[] r1 = r6.getDrawableState()
            int r2 = r5.length
            int r3 = r5.length
            int r4 = r1.length
            int r3 = r3 + r4
            int[] r5 = java.util.Arrays.copyOf(r5, r3)
            r3 = 0
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r5, r2, r4)
            int r1 = r7.getDefaultColor()
            int r5 = r7.getColorForState(r5, r1)
            android.graphics.drawable.Drawable r7 = r0.mutate()
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r7.setTintList(r5)
            r6.setImageDrawable(r7)
        L3e:
            return
    }

    public static int W(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r1 = defpackage.qo2.M(r1, r2)
            if (r1 == 0) goto Lf
            int r2 = r1.type
            r0 = 16
            if (r2 != r0) goto Lf
            int r1 = r1.data
            return r1
        Lf:
            return r3
    }

    public static android.animation.TimeInterpolator X(android.content.Context r6, int r7, android.animation.TimeInterpolator r8) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r2 = 1
            boolean r7 = r1.resolveAttribute(r7, r0, r2)
            if (r7 != 0) goto L11
            return r8
        L11:
            int r7 = r0.type
            r8 = 0
            r1 = 3
            if (r7 != r1) goto La6
            java.lang.CharSequence r7 = r0.string
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "cubic-bezier"
            boolean r4 = I(r7, r3)
            java.lang.String r5 = "path"
            if (r4 != 0) goto L35
            boolean r4 = I(r7, r5)
            if (r4 == 0) goto L2e
            goto L35
        L2e:
            int r7 = r0.resourceId
            android.view.animation.Interpolator r6 = android.view.animation.AnimationUtils.loadInterpolator(r6, r7)
            return r6
        L35:
            boolean r6 = I(r7, r3)
            if (r6 == 0) goto L6f
            int r6 = r7.length()
            int r6 = r6 - r2
            r0 = 13
            java.lang.String r6 = r7.substring(r0, r6)
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r0 = 4
            if (r7 != r0) goto L68
            r7 = 0
            float r7 = A(r6, r7)
            float r8 = A(r6, r2)
            r0 = 2
            float r0 = A(r6, r0)
            float r6 = A(r6, r1)
            android.view.animation.PathInterpolator r1 = new android.view.animation.PathInterpolator
            r1.<init>(r7, r8, r0, r6)
            return r1
        L68:
            java.lang.String r7 = "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "
            int r6 = r6.length
            defpackage.e41.n(r6, r7)
            return r8
        L6f:
            boolean r6 = I(r7, r5)
            if (r6 == 0) goto L9c
            int r6 = r7.length()
            int r6 = r6 - r2
            r0 = 5
            java.lang.String r6 = r7.substring(r0, r6)
            android.view.animation.PathInterpolator r7 = new android.view.animation.PathInterpolator
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            iu4[] r1 = defpackage.kn2.B(r6)
            defpackage.iu4.b(r1, r0)     // Catch: java.lang.RuntimeException -> L91
            r7.<init>(r0)
            return r7
        L91:
            r7 = move-exception
            java.lang.String r0 = "Error in parsing "
            java.lang.String r6 = r0.concat(r6)
            defpackage.u34.p(r6, r7)
            return r8
        L9c:
            java.lang.String r6 = "Invalid motion easing type: "
            java.lang.String r6 = r6.concat(r7)
            defpackage.i.h(r6)
            return r8
        La6:
            java.lang.String r6 = "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."
            defpackage.i.h(r6)
            return r8
    }

    public static void Y(com.google.android.material.internal.CheckableImageButton r3, android.view.View.OnLongClickListener r4) {
            boolean r0 = r3.hasOnClickListeners()
            r1 = 0
            r2 = 1
            if (r4 == 0) goto La
            r4 = r2
            goto Lb
        La:
            r4 = r1
        Lb:
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L10
        Lf:
            r1 = r2
        L10:
            r3.setFocusable(r1)
            r3.setClickable(r0)
            r3.setPressable(r0)
            r3.setLongClickable(r4)
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 2
        L20:
            r3.setImportantForAccessibility(r2)
            return
    }

    public static final java.lang.Object Z(int r6, java.lang.Object r7, defpackage.ll5 r8, defpackage.oj2 r9, int r10) {
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            oj2 r0 = r8.b
            boolean r0 = defpackage.nb3.k(r0, r9)
            if (r0 != 0) goto L29
            oj2 r0 = defpackage.oj2.R
            int r3 = r9.a(r0)
            if (r3 < 0) goto L29
            oj2 r3 = r8.b
            int r3 = r3.A
            int r0 = r0.A
            int r0 = defpackage.nb3.p(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.A
            goto L66
        L62:
            oj2 r9 = r8.b
            int r9 = r9.A
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.yr1.f(r7, r9, r1)
            return r6
    }

    public static final void a(defpackage.r3 r8, defpackage.px0 r9, int r10) {
            r5 = r9
            xq2 r5 = (defpackage.xq2) r5
            r9 = 1372074852(0x51c83364, float:1.0748196E11)
            r5.d0(r9)
            boolean r9 = r5.h(r8)
            r0 = 2
            if (r9 == 0) goto L12
            r9 = 4
            goto L13
        L12:
            r9 = r0
        L13:
            r9 = r9 | r10
            r1 = r9 & 3
            r2 = 1
            if (r1 == r0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r9 = r9 & r2
            boolean r9 = r5.S(r9, r0)
            if (r9 == 0) goto L46
            x64 r9 = defpackage.x64.a
            r0 = 1090519040(0x41000000, float:8.0)
            a74 r0 = defpackage.ge7.O(r9, r0)
            java.net.URL r1 = r8.c
            bt r2 = r8.e
            ov4 r9 = new ov4
            r3 = 8
            r9.<init>(r8, r3)
            r3 = 759418494(0x2d43ce7e, float:1.1130317E-11)
            zv0 r4 = defpackage.n16.I(r3, r9, r5)
            r6 = 24582(0x6006, float:3.4447E-41)
            r7 = 8
            r3 = 0
            defpackage.f04.a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L49
        L46:
            r5.V()
        L49:
            cf5 r9 = r5.t()
            if (r9 == 0) goto L58
            z5 r0 = new z5
            r1 = 17
            r0.<init>(r8, r10, r1)
            r9.d = r0
        L58:
            return
    }

    public static final defpackage.vr4 a0(java.lang.Object r1, java.lang.Object r2) {
            vr4 r0 = new vr4
            r0.<init>(r1, r2)
            return r0
    }

    public static final defpackage.of5 b(long r8, long r10) {
            of5 r0 = new of5
            r1 = 32
            long r2 = r8 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r10 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r8
            r0.<init>(r3, r9, r1, r10)
            return r0
    }

    public static final java.lang.Object b0(defpackage.mw6 r12, defpackage.g17 r13, defpackage.oy4 r14, defpackage.d20 r15) {
            boolean r0 = r15 instanceof defpackage.ja6
            if (r0 == 0) goto L13
            r0 = r15
            ja6 r0 = (defpackage.ja6) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            ja6 r0 = new ja6
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L34
            g17 r13 = r0.X
            mw6 r12 = r0.R
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L31
            goto La1
        L31:
            r12 = move-exception
            goto Ld1
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r3
        L3a:
            vy4 r12 = r0.Y
            g17 r13 = r0.X
            mw6 r14 = r0.R
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L31
            r11 = r14
            r14 = r12
            r12 = r11
            goto L63
        L47:
            defpackage.oi2.Y(r15)
            java.util.List r14 = r14.a     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r14 = defpackage.gt0.H0(r14)     // Catch: java.util.concurrent.CancellationException -> L31
            vy4 r14 = (defpackage.vy4) r14     // Catch: java.util.concurrent.CancellationException -> L31
            long r7 = r14.a     // Catch: java.util.concurrent.CancellationException -> L31
            r0.R = r12     // Catch: java.util.concurrent.CancellationException -> L31
            r0.X = r13     // Catch: java.util.concurrent.CancellationException -> L31
            r0.Y = r14     // Catch: java.util.concurrent.CancellationException -> L31
            r0.d0 = r6     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r15 = defpackage.sn1.b(r12, r7, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r15 != r1) goto L63
            goto La0
        L63:
            vy4 r15 = (defpackage.vy4) r15     // Catch: java.util.concurrent.CancellationException -> L31
            if (r15 == 0) goto Lce
            long r7 = r15.c     // Catch: java.util.concurrent.CancellationException -> L31
            fo7 r2 = r12.f()     // Catch: java.util.concurrent.CancellationException -> L31
            int r9 = r14.i     // Catch: java.util.concurrent.CancellationException -> L31
            float r2 = defpackage.sn1.g(r2, r9)     // Catch: java.util.concurrent.CancellationException -> L31
            long r9 = r14.c     // Catch: java.util.concurrent.CancellationException -> L31
            long r9 = defpackage.jk4.e(r9, r7)     // Catch: java.util.concurrent.CancellationException -> L31
            float r14 = defpackage.jk4.d(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 >= 0) goto L83
            r14 = r6
            goto L84
        L83:
            r14 = r4
        L84:
            if (r14 == 0) goto Lce
            fa6 r14 = defpackage.ma6.a     // Catch: java.util.concurrent.CancellationException -> L31
            r13.a(r7, r14)     // Catch: java.util.concurrent.CancellationException -> L31
            long r14 = r15.a     // Catch: java.util.concurrent.CancellationException -> L31
            cz3 r2 = new cz3     // Catch: java.util.concurrent.CancellationException -> L31
            r2.<init>(r13, r6)     // Catch: java.util.concurrent.CancellationException -> L31
            r0.R = r12     // Catch: java.util.concurrent.CancellationException -> L31
            r0.X = r13     // Catch: java.util.concurrent.CancellationException -> L31
            r0.Y = r3     // Catch: java.util.concurrent.CancellationException -> L31
            r0.d0 = r5     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r15 = defpackage.sn1.e(r12, r14, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r15 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L31
            boolean r14 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L31
            if (r14 == 0) goto Lcb
            ow6 r12 = r12.Y     // Catch: java.util.concurrent.CancellationException -> L31
            oy4 r12 = r12.p0     // Catch: java.util.concurrent.CancellationException -> L31
            java.util.List r12 = r12.a     // Catch: java.util.concurrent.CancellationException -> L31
            int r14 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L31
        Lb3:
            if (r4 >= r14) goto Lc7
            java.lang.Object r15 = r12.get(r4)     // Catch: java.util.concurrent.CancellationException -> L31
            vy4 r15 = (defpackage.vy4) r15     // Catch: java.util.concurrent.CancellationException -> L31
            boolean r0 = defpackage.ej2.o(r15)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r0 == 0) goto Lc4
            r15.a()     // Catch: java.util.concurrent.CancellationException -> L31
        Lc4:
            int r4 = r4 + 1
            goto Lb3
        Lc7:
            r13.b()     // Catch: java.util.concurrent.CancellationException -> L31
            goto Lce
        Lcb:
            r13.onCancel()     // Catch: java.util.concurrent.CancellationException -> L31
        Lce:
            jg7 r12 = defpackage.jg7.a
            return r12
        Ld1:
            r13.onCancel()
            throw r12
    }

    public static final void c(java.lang.String r12, defpackage.on2 r13, defpackage.eo2 r14, defpackage.px0 r15, int r16) {
            r13.getClass()
            r14.getClass()
            r5 = r15
            xq2 r5 = (defpackage.xq2) r5
            r0 = 1397612710(0x534de0a6, float:8.842373E11)
            r5.d0(r0)
            r0 = r16 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r5.f(r12)
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r16 | r0
            goto L22
        L20:
            r0 = r16
        L22:
            r3 = r16 & 48
            if (r3 != 0) goto L32
            boolean r3 = r5.h(r13)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r0 = r0 | r3
        L32:
            boolean r4 = r5.h(r14)
            if (r4 == 0) goto L3b
            r4 = 256(0x100, float:3.59E-43)
            goto L3d
        L3b:
            r4 = 128(0x80, float:1.8E-43)
        L3d:
            r0 = r0 | r4
            r4 = r0 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 0
            r8 = 1
            if (r4 == r6) goto L48
            r4 = r8
            goto L49
        L48:
            r4 = r7
        L49:
            r6 = r0 & 1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto La8
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r6 = r0 & 14
            if (r6 != r2) goto L59
            r2 = r8
            goto L5a
        L59:
            r2 = r7
        L5a:
            java.lang.Object r6 = r5.P()
            vs0 r10 = defpackage.ox0.a
            if (r2 != 0) goto L64
            if (r6 != r10) goto L6c
        L64:
            lc4 r6 = new lc4
            r6.<init>(r12, r8)
            r5.l0(r6)
        L6c:
            on2 r6 = (defpackage.on2) r6
            java.lang.Object r2 = defpackage.qo2.I(r4, r6, r5, r7)
            qa4 r2 = (defpackage.qa4) r2
            java.lang.Object r4 = r5.P()
            if (r4 != r10) goto L83
            java.lang.String r4 = ""
            vs4 r4 = defpackage.np2.Y(r4)
            r5.l0(r4)
        L83:
            r8 = r4
            qa4 r8 = (defpackage.qa4) r8
            jj1 r3 = new jj1
            r4 = 3
            r3.<init>(r4, r7, r7)
            jn5 r6 = new jn5
            r11 = 1
            r9 = r13
            r10 = r14
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = 1384474927(0x5285692f, float:2.8649767E11)
            zv0 r2 = defpackage.n16.I(r2, r6, r5)
            int r0 = r0 >> r4
            r0 = r0 & 14
            r6 = r0 | 432(0x1b0, float:6.05E-43)
            r7 = 0
            r4 = r2
            r2 = r13
            defpackage.nw7.o(r2, r3, r4, r5, r6, r7)
            goto Lab
        La8:
            r5.V()
        Lab:
            cf5 r6 = r5.t()
            if (r6 == 0) goto Lbf
            rl r0 = new rl
            r5 = 16
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        Lbf:
            return
    }

    public static java.lang.String c0(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 > r1) goto L13
            int r0 = r2.length()
            r1 = 23
            if (r1 >= r0) goto L13
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L13:
            return r2
    }

    public static void d(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            boolean r0 = K(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L41
            boolean r0 = K(r4)
            if (r0 != 0) goto L41
            boolean r0 = K(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            int r2 = r2 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r2 = r2 | r3
            r3 = r4 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r5 & 63
            r2 = r2 | r3
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r6[r7] = r3
            int r7 = r7 + 1
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            ub3 r2 = defpackage.ub3.a()
            throw r2
    }

    public static final void d0(defpackage.so r5, defpackage.uo r6) {
            vs4 r0 = r5.e
            java.lang.Object r0 = r0.getValue()
            vs4 r1 = r6.B
            r1.setValue(r0)
            ap r0 = r6.L
            ap r1 = r5.f
            int r2 = r0.b()
            r3 = 0
        L14:
            if (r3 >= r2) goto L20
            float r4 = r1.a(r3)
            r0.e(r3, r4)
            int r3 = r3 + 1
            goto L14
        L20:
            long r0 = r5.h
            r6.X = r0
            long r0 = r5.g
            r6.R = r0
            vs4 r5 = r5.i
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.Y = r5
            return
    }

    public static void e(byte r1, byte r2, char[] r3, int r4) {
            r0 = -62
            if (r1 < r0) goto L15
            boolean r0 = K(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            ub3 r1 = defpackage.ub3.a()
            throw r1
    }

    public static boolean e0(defpackage.k21 r5, defpackage.k21 r6, defpackage.k21 r7, defpackage.k21 r8) {
            k21 r0 = defpackage.k21.FIXED
            r1 = 1
            r2 = 0
            if (r7 == r0) goto L13
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r7 == r3) goto L13
            k21 r4 = defpackage.k21.MATCH_PARENT
            if (r7 != r4) goto L11
            if (r5 == r3) goto L11
            goto L13
        L11:
            r5 = r2
            goto L14
        L13:
            r5 = r1
        L14:
            if (r8 == r0) goto L23
            k21 r7 = defpackage.k21.WRAP_CONTENT
            if (r8 == r7) goto L23
            k21 r0 = defpackage.k21.MATCH_PARENT
            if (r8 != r0) goto L21
            if (r6 == r7) goto L21
            goto L23
        L21:
            r6 = r2
            goto L24
        L23:
            r6 = r1
        L24:
            if (r5 != 0) goto L2a
            if (r6 == 0) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            return r1
    }

    public static void f(byte r2, byte r3, byte r4, char[] r5, int r6) {
            boolean r0 = K(r3)
            if (r0 != 0) goto L2a
            r0 = -32
            r1 = -96
            if (r2 != r0) goto Le
            if (r3 < r1) goto L2a
        Le:
            r0 = -19
            if (r2 != r0) goto L14
            if (r3 >= r1) goto L2a
        L14:
            boolean r0 = K(r4)
            if (r0 != 0) goto L2a
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2a:
            ub3 r2 = defpackage.ub3.a()
            throw r2
    }

    public static void f0(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = c0(r1)
            r0 = 5
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.w(r1, r2)
        Le:
            return
    }

    public static final java.lang.Object g(defpackage.mw6 r7, defpackage.d20 r8) {
            boolean r0 = r8 instanceof defpackage.ha6
            if (r0 == 0) goto L13
            r0 = r8
            ha6 r0 = (defpackage.ha6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ha6 r0 = new ha6
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            mw6 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L30:
            defpackage.oi2.Y(r8)
        L33:
            py4 r8 = defpackage.py4.Main
            r0.R = r7
            r0.Y = r3
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            oy4 r8 = (defpackage.oy4) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = defpackage.ej2.m(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
    }

    public static void g0(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.String r1 = c0(r1)
            r0 = 5
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.w(r1, r2, r3)
        Le:
            return
    }

    public static final boolean h(int r2, android.view.KeyEvent r3) {
            long r0 = defpackage.xk2.m(r3)
            r3 = 32
            long r0 = r0 >> r3
            int r3 = (int) r0
            if (r3 != r2) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public static final java.lang.Object i(defpackage.mw6 r11, defpackage.g17 r12, defpackage.oy4 r13, int r14, defpackage.d20 r15) {
            boolean r0 = r15 instanceof defpackage.ka6
            if (r0 == 0) goto L13
            r0 = r15
            ka6 r0 = (defpackage.ka6) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            ka6 r0 = new ka6
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L35
            g17 r12 = r0.X
            mw6 r11 = r0.R
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L32
            goto Lc4
        L32:
            r11 = move-exception
            goto Lf3
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r3
        L3b:
            long r11 = r0.Z
            ch5 r13 = r0.Y
            g17 r14 = r0.X
            mw6 r2 = r0.R
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L4a
            r7 = r11
            r12 = r14
            r11 = r2
            goto L91
        L4a:
            r11 = move-exception
            r12 = r14
            goto Lf3
        L4e:
            defpackage.oi2.Y(r15)
            java.util.List r13 = r13.a     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r13 = defpackage.gt0.H0(r13)     // Catch: java.util.concurrent.CancellationException -> L32
            vy4 r13 = (defpackage.vy4) r13     // Catch: java.util.concurrent.CancellationException -> L32
            long r7 = r13.a     // Catch: java.util.concurrent.CancellationException -> L32
            long r9 = r13.c     // Catch: java.util.concurrent.CancellationException -> L32
            if (r14 <= r5) goto L62
            fa6 r13 = defpackage.xd5.q0     // Catch: java.util.concurrent.CancellationException -> L32
            goto L64
        L62:
            fa6 r13 = defpackage.xd5.p0     // Catch: java.util.concurrent.CancellationException -> L32
        L64:
            r12.a(r9, r13)     // Catch: java.util.concurrent.CancellationException -> L32
            ch5 r13 = new ch5     // Catch: java.util.concurrent.CancellationException -> L32
            r13.<init>()     // Catch: java.util.concurrent.CancellationException -> L32
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r13.A = r14     // Catch: java.util.concurrent.CancellationException -> L32
            fo7 r14 = r11.f()     // Catch: java.util.concurrent.CancellationException -> L32
            long r14 = r14.b()     // Catch: java.util.concurrent.CancellationException -> L32
            la6 r2 = new la6     // Catch: java.util.concurrent.CancellationException -> L32
            r2.<init>(r7, r13, r3)     // Catch: java.util.concurrent.CancellationException -> L32
            r0.R = r11     // Catch: java.util.concurrent.CancellationException -> L32
            r0.X = r12     // Catch: java.util.concurrent.CancellationException -> L32
            r0.Y = r13     // Catch: java.util.concurrent.CancellationException -> L32
            r0.Z = r7     // Catch: java.util.concurrent.CancellationException -> L32
            r0.e0 = r6     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r15 = r11.l(r14, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r1) goto L91
            goto Lc3
        L91:
            im1 r15 = (defpackage.im1) r15     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != 0) goto L97
            im1 r15 = defpackage.im1.Timeout     // Catch: java.util.concurrent.CancellationException -> L32
        L97:
            im1 r14 = defpackage.im1.Cancel     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto L9f
            r12.onCancel()     // Catch: java.util.concurrent.CancellationException -> L32
            return r4
        L9f:
            im1 r14 = defpackage.im1.Up     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto La7
            r12.b()     // Catch: java.util.concurrent.CancellationException -> L32
            return r4
        La7:
            im1 r14 = defpackage.im1.Drag     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto Lb0
            long r13 = r13.A     // Catch: java.util.concurrent.CancellationException -> L32
            r12.e(r13)     // Catch: java.util.concurrent.CancellationException -> L32
        Lb0:
            cz3 r13 = new cz3     // Catch: java.util.concurrent.CancellationException -> L32
            r13.<init>(r12, r5)     // Catch: java.util.concurrent.CancellationException -> L32
            r0.R = r11     // Catch: java.util.concurrent.CancellationException -> L32
            r0.X = r12     // Catch: java.util.concurrent.CancellationException -> L32
            r0.Y = r3     // Catch: java.util.concurrent.CancellationException -> L32
            r0.e0 = r5     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r15 = defpackage.sn1.e(r11, r7, r13, r0)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L32
            boolean r13 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L32
            if (r13 == 0) goto Lef
            ow6 r11 = r11.Y     // Catch: java.util.concurrent.CancellationException -> L32
            oy4 r11 = r11.p0     // Catch: java.util.concurrent.CancellationException -> L32
            java.util.List r11 = r11.a     // Catch: java.util.concurrent.CancellationException -> L32
            int r13 = r11.size()     // Catch: java.util.concurrent.CancellationException -> L32
            r14 = 0
        Ld7:
            if (r14 >= r13) goto Leb
            java.lang.Object r15 = r11.get(r14)     // Catch: java.util.concurrent.CancellationException -> L32
            vy4 r15 = (defpackage.vy4) r15     // Catch: java.util.concurrent.CancellationException -> L32
            boolean r0 = defpackage.ej2.o(r15)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r0 == 0) goto Le8
            r15.a()     // Catch: java.util.concurrent.CancellationException -> L32
        Le8:
            int r14 = r14 + 1
            goto Ld7
        Leb:
            r12.b()     // Catch: java.util.concurrent.CancellationException -> L32
            return r4
        Lef:
            r12.onCancel()     // Catch: java.util.concurrent.CancellationException -> L32
            return r4
        Lf3:
            r12.onCancel()
            throw r11
    }

    public static final java.lang.Object j(float r6, float r7, float r8, defpackage.to r9, defpackage.eo2 r10, defpackage.s41 r11) {
            wc7 r2 = defpackage.nw7.e0
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r6)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r7)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r8)
            qn2 r7 = r2.a
            java.lang.Object r6 = r7.g(r6)
            ap r6 = (defpackage.ap) r6
            if (r6 != 0) goto L25
            java.lang.Object r6 = r7.g(r3)
            ap r6 = (defpackage.ap) r6
            ap r6 = r6.c()
        L25:
            r5 = r6
            jz6 r7 = new jz6
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            uo r6 = new uo
            r8 = 56
            r6.<init>(r2, r3, r5, r8)
            r8 = r10
            ro5 r10 = new ro5
            r9 = 15
            r10.<init>(r8, r9)
            r8 = -9223372036854775808
            java.lang.Object r6 = k(r6, r7, r8, r10, r11)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            jg7 r8 = defpackage.jg7.a
            if (r6 != r7) goto L49
            goto L4a
        L49:
            r6 = r8
        L4a:
            if (r6 != r7) goto L4d
            return r6
        L4d:
            return r8
    }

    public static final java.lang.Object k(defpackage.uo r25, defpackage.lo r26, long r27, defpackage.qn2 r29, defpackage.s41 r30) {
            r3 = r26
            r0 = r30
            d90 r8 = defpackage.d90.u0
            boolean r1 = r0 instanceof defpackage.gw6
            if (r1 == 0) goto L1a
            r1 = r0
            gw6 r1 = (defpackage.gw6) r1
            int r2 = r1.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L1a
            int r2 = r2 - r4
            r1.e0 = r2
        L18:
            r9 = r1
            goto L20
        L1a:
            gw6 r1 = new gw6
            r1.<init>(r0)
            goto L18
        L20:
            l61 r0 = r9.B
            java.lang.Object r1 = r9.d0
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.e0
            r11 = 26
            r12 = 0
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L53
            if (r2 == r14) goto L4a
            if (r2 != r13) goto L43
            dh5 r2 = r9.Z
            qn2 r0 = r9.Y
            lo r3 = r9.X
            uo r4 = r9.R
        L3b:
            defpackage.oi2.Y(r1)     // Catch: java.util.concurrent.CancellationException -> L40
            goto Lc7
        L40:
            r0 = move-exception
            goto L197
        L43:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L4a:
            dh5 r2 = r9.Z
            qn2 r0 = r9.Y
            lo r3 = r9.X
            uo r4 = r9.R
            goto L3b
        L53:
            defpackage.oi2.Y(r1)
            r1 = 0
            java.lang.Object r16 = r3.g(r1)
            ap r18 = r3.d(r1)
            dh5 r1 = new dh5
            r1.<init>()
            r4 = -9223372036854775808
            int r2 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r2 != 0) goto Ld6
            r0.getClass()     // Catch: java.util.concurrent.CancellationException -> Ld2
            float r6 = y(r0)     // Catch: java.util.concurrent.CancellationException -> Ld2
            dw6 r0 = new dw6     // Catch: java.util.concurrent.CancellationException -> Ld2
            r5 = r25
            r7 = r29
            r2 = r16
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> Lcf
            r7 = r1
            r9.R = r5     // Catch: java.util.concurrent.CancellationException -> Lcd
            r9.X = r3     // Catch: java.util.concurrent.CancellationException -> Lcd
            r6 = r29
            r9.Y = r6     // Catch: java.util.concurrent.CancellationException -> Lcd
            r9.Z = r7     // Catch: java.util.concurrent.CancellationException -> Lcd
            r9.e0 = r14     // Catch: java.util.concurrent.CancellationException -> Lcd
            boolean r1 = r3.a()     // Catch: java.util.concurrent.CancellationException -> Lcd
            if (r1 == 0) goto Laf
            l61 r1 = r9.b()     // Catch: java.util.concurrent.CancellationException -> Lcd
            j61 r1 = r1.Z(r8)     // Catch: java.util.concurrent.CancellationException -> Lcd
            if (r1 != 0) goto La9
            l61 r1 = r9.b()     // Catch: java.util.concurrent.CancellationException -> Lcd
            um r1 = defpackage.ii2.x(r1)     // Catch: java.util.concurrent.CancellationException -> Lcd
            java.lang.Object r0 = r1.a(r0, r9)     // Catch: java.util.concurrent.CancellationException -> Lcd
            goto Lc0
        La9:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.concurrent.CancellationException -> Lcd
            r0.<init>()     // Catch: java.util.concurrent.CancellationException -> Lcd
            throw r0     // Catch: java.util.concurrent.CancellationException -> Lcd
        Laf:
            y00 r1 = new y00     // Catch: java.util.concurrent.CancellationException -> Lcd
            r1.<init>(r11, r0)     // Catch: java.util.concurrent.CancellationException -> Lcd
            l61 r0 = r9.b()     // Catch: java.util.concurrent.CancellationException -> Lcd
            um r0 = defpackage.ii2.x(r0)     // Catch: java.util.concurrent.CancellationException -> Lcd
            java.lang.Object r0 = r0.a(r1, r9)     // Catch: java.util.concurrent.CancellationException -> Lcd
        Lc0:
            if (r0 != r10) goto Lc4
            goto L185
        Lc4:
            r4 = r5
            r0 = r6
            r2 = r7
        Lc7:
            r1 = r2
            goto L10c
        Lc9:
            r4 = r5
        Lca:
            r2 = r7
            goto L197
        Lcd:
            r0 = move-exception
            goto Lc9
        Lcf:
            r0 = move-exception
        Ld0:
            r7 = r1
            goto Lc9
        Ld2:
            r0 = move-exception
            r5 = r25
            goto Ld0
        Ld6:
            r5 = r25
            r6 = r29
            r7 = r1
            so r15 = new so     // Catch: java.util.concurrent.CancellationException -> L192
            wc7 r17 = r3.c()     // Catch: java.util.concurrent.CancellationException -> L192
            java.lang.Object r21 = r3.h()     // Catch: java.util.concurrent.CancellationException -> L192
            ew6 r1 = new ew6     // Catch: java.util.concurrent.CancellationException -> L192
            r1.<init>(r12, r5)     // Catch: java.util.concurrent.CancellationException -> L192
            r22 = r27
            r19 = r27
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r21, r22, r24)     // Catch: java.util.concurrent.CancellationException -> L192
            r0.getClass()     // Catch: java.util.concurrent.CancellationException -> L192
            float r0 = y(r0)     // Catch: java.util.concurrent.CancellationException -> L192
            r1 = r27
            r4 = r3
            r3 = r0
            r0 = r15
            u(r0, r1, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L192
            r15 = r0
            r7.A = r15     // Catch: java.util.concurrent.CancellationException -> L192
            r4 = r25
            r3 = r26
            r0 = r29
            r1 = r7
        L10c:
            java.lang.Object r2 = r1.A     // Catch: java.util.concurrent.CancellationException -> L18c
            r2.getClass()     // Catch: java.util.concurrent.CancellationException -> L18c
            so r2 = (defpackage.so) r2     // Catch: java.util.concurrent.CancellationException -> L18c
            vs4 r2 = r2.i     // Catch: java.util.concurrent.CancellationException -> L18c
            java.lang.Object r2 = r2.getValue()     // Catch: java.util.concurrent.CancellationException -> L18c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.util.concurrent.CancellationException -> L18c
            boolean r2 = r2.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L18c
            if (r2 == 0) goto L18f
            l61 r2 = r9.B     // Catch: java.util.concurrent.CancellationException -> L18c
            r2.getClass()     // Catch: java.util.concurrent.CancellationException -> L18c
            float r2 = y(r2)     // Catch: java.util.concurrent.CancellationException -> L18c
            fw6 r5 = new fw6     // Catch: java.util.concurrent.CancellationException -> L18c
            r30 = r0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r4
            r25 = r5
            r25.<init>(r26, r27, r28, r29, r30)     // Catch: java.util.concurrent.CancellationException -> L186
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            r0 = r30
            r9.R = r4     // Catch: java.util.concurrent.CancellationException -> L40
            r9.X = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r9.Y = r0     // Catch: java.util.concurrent.CancellationException -> L40
            r9.Z = r2     // Catch: java.util.concurrent.CancellationException -> L40
            r9.e0 = r13     // Catch: java.util.concurrent.CancellationException -> L40
            boolean r5 = r3.a()     // Catch: java.util.concurrent.CancellationException -> L40
            if (r5 == 0) goto L172
            l61 r5 = r9.b()     // Catch: java.util.concurrent.CancellationException -> L40
            j61 r5 = r5.Z(r8)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r5 != 0) goto L16c
            l61 r5 = r9.b()     // Catch: java.util.concurrent.CancellationException -> L40
            um r5 = defpackage.ii2.x(r5)     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r1 = r5.a(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L183
        L16c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.concurrent.CancellationException -> L40
            r0.<init>()     // Catch: java.util.concurrent.CancellationException -> L40
            throw r0     // Catch: java.util.concurrent.CancellationException -> L40
        L172:
            y00 r5 = new y00     // Catch: java.util.concurrent.CancellationException -> L40
            r5.<init>(r11, r1)     // Catch: java.util.concurrent.CancellationException -> L40
            l61 r1 = r9.b()     // Catch: java.util.concurrent.CancellationException -> L40
            um r1 = defpackage.ii2.x(r1)     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r1 = r1.a(r5, r9)     // Catch: java.util.concurrent.CancellationException -> L40
        L183:
            if (r1 != r10) goto Lc7
        L185:
            return r10
        L186:
            r0 = move-exception
            r2 = r26
            r4 = r29
            goto L197
        L18c:
            r0 = move-exception
            r2 = r1
            goto L197
        L18f:
            jg7 r0 = defpackage.jg7.a
            return r0
        L192:
            r0 = move-exception
            r4 = r25
            goto Lca
        L197:
            java.lang.Object r1 = r2.A
            so r1 = (defpackage.so) r1
            if (r1 == 0) goto L1a4
            vs4 r1 = r1.i
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.setValue(r3)
        L1a4:
            java.lang.Object r1 = r2.A
            so r1 = (defpackage.so) r1
            if (r1 == 0) goto L1b4
            long r1 = r1.g
            long r5 = r4.R
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L1b4
            r4.Y = r12
        L1b4:
            throw r0
    }

    public static /* synthetic */ java.lang.Object l(float r6, float r7, defpackage.to r8, defpackage.eo2 r9, defpackage.s41 r10, int r11) {
            r11 = r11 & 8
            if (r11 == 0) goto Lb
            r8 = 7
            r11 = 0
            r0 = 0
            io6 r8 = defpackage.ge7.U(r11, r11, r0, r8)
        Lb:
            r3 = r8
            r2 = 0
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            java.lang.Object r6 = j(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final java.lang.Object m(defpackage.uo r9, defpackage.oc1 r10, boolean r11, defpackage.qn2 r12, defpackage.s41 r13) {
            vs4 r0 = r9.B
            java.lang.Object r0 = r0.getValue()
            ap r1 = r9.L
            wc7 r2 = r9.A
            qa r4 = new qa
            r4.<init>(r10, r2, r0, r1)
            if (r11 == 0) goto L18
            long r10 = r9.R
        L13:
            r3 = r9
            r5 = r10
            r7 = r12
            r8 = r13
            goto L1b
        L18:
            r10 = -9223372036854775808
            goto L13
        L1b:
            java.lang.Object r9 = k(r3, r4, r5, r7, r8)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r9 != r10) goto L24
            return r9
        L24:
            jg7 r9 = defpackage.jg7.a
            return r9
    }

    public static final java.lang.Object n(defpackage.uo r7, java.lang.Float r8, defpackage.to r9, boolean r10, defpackage.qn2 r11, defpackage.s41 r12) {
            vs4 r0 = r7.B
            java.lang.Object r4 = r0.getValue()
            wc7 r3 = r7.A
            ap r6 = r7.L
            jz6 r1 = new jz6
            r5 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r1
            if (r10 == 0) goto L17
            long r9 = r7.R
            goto L19
        L17:
            r9 = -9223372036854775808
        L19:
            java.lang.Object r7 = k(r7, r8, r9, r11, r12)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L22
            return r7
        L22:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    public static /* synthetic */ java.lang.Object o(defpackage.uo r6, java.lang.Float r7, defpackage.io6 r8, boolean r9, defpackage.qn2 r10, defpackage.s41 r11, int r12) {
            r0 = r12 & 2
            if (r0 == 0) goto Lb
            r8 = 7
            r0 = 0
            r1 = 0
            io6 r8 = defpackage.ge7.U(r0, r0, r1, r8)
        Lb:
            r2 = r8
            r8 = r12 & 8
            if (r8 == 0) goto L17
            r76 r10 = new r76
            r8 = 15
            r10.<init>(r8)
        L17:
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r6 = n(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static void p(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.internal.CheckableImageButton r6, android.content.res.ColorStateList r7, android.graphics.PorterDuff.Mode r8) {
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r7 == 0) goto L37
            boolean r1 = r7.isStateful()
            if (r1 == 0) goto L37
            int[] r5 = r5.getDrawableState()
            int[] r1 = r6.getDrawableState()
            int r2 = r5.length
            int r3 = r5.length
            int r4 = r1.length
            int r3 = r3 + r4
            int[] r5 = java.util.Arrays.copyOf(r5, r3)
            r3 = 0
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r5, r2, r4)
            int r1 = r7.getDefaultColor()
            int r5 = r7.getColorForState(r5, r1)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.setTintList(r5)
            goto L3a
        L37:
            r0.setTintList(r7)
        L3a:
            if (r8 == 0) goto L3f
            r0.setTintMode(r8)
        L3f:
            android.graphics.drawable.Drawable r5 = r6.getDrawable()
            if (r5 == r0) goto L48
            r6.setImageDrawable(r0)
        L48:
            return
    }

    public static final java.lang.Object q(defpackage.r35 r5, defpackage.on2 r6, defpackage.r41 r7) {
            boolean r0 = r7 instanceof defpackage.p35
            if (r0 == 0) goto L13
            r0 = r7
            p35 r0 = (defpackage.p35) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            p35 r0 = new p35
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            on2 r6 = r0.R
            defpackage.oi2.Y(r7)     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r5 = move-exception
            goto L69
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L32:
            defpackage.oi2.Y(r7)
            l61 r7 = r0.B
            r7.getClass()
            vs0 r2 = defpackage.vs0.h0
            j61 r7 = r7.Z(r2)
            if (r7 != r5) goto L6d
            r0.R = r6     // Catch: java.lang.Throwable -> L2a
            r0.Y = r4     // Catch: java.lang.Throwable -> L2a
            rj0 r7 = new rj0     // Catch: java.lang.Throwable -> L2a
            r41 r0 = defpackage.np2.V(r0)     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2a
            r7.v()     // Catch: java.lang.Throwable -> L2a
            rp2 r0 = new rp2     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r7, r4)     // Catch: java.lang.Throwable -> L2a
            v80 r5 = r5.Y     // Catch: java.lang.Throwable -> L2a
            r5.D(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.s()     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L63
            return r1
        L63:
            r6.c()
            jg7 r5 = defpackage.jg7.a
            return r5
        L69:
            r6.c()
            throw r5
        L6d:
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            defpackage.i.m(r5)
            return r3
    }

    public static android.widget.ImageView.ScaleType r(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 5
            if (r1 == r0) goto L17
            r0 = 6
            if (r1 == r0) goto L14
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            return r1
        L14:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            return r1
        L17:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            return r1
        L1a:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            return r1
        L1d:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            return r1
        L20:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            return r1
        L23:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            return r1
    }

    public static final long s() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            return r0
    }

    public static void t(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = c0(r1)
            r0 = 3
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.d(r1, r2)
        Le:
            return
    }

    public static final void u(defpackage.so r2, long r3, float r5, defpackage.lo r6, defpackage.uo r7, defpackage.qn2 r8) {
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            long r0 = r6.b()
            goto L11
        La:
            long r0 = r2.c
            long r0 = r3 - r0
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
        L11:
            r2.g = r3
            java.lang.Object r3 = r6.g(r0)
            vs4 r4 = r2.e
            r4.setValue(r3)
            ap r3 = r6.d(r0)
            r2.f = r3
            boolean r3 = r6.e(r0)
            if (r3 == 0) goto L33
            long r3 = r2.g
            r2.h = r3
            vs4 r3 = r2.i
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
        L33:
            d0(r2, r7)
            r8.g(r2)
            return
    }

    public static void v(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = c0(r1)
            r0 = 6
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.e(r1, r2)
        Le:
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.String r1 = c0(r1)
            r0 = 6
            boolean r0 = J(r0, r1)
            if (r0 == 0) goto Le
            android.util.Log.e(r1, r2, r3)
        Le:
            return
    }

    public static defpackage.zs7 x(defpackage.l21 r7, int r8, java.util.ArrayList r9, defpackage.zs7 r10) {
            if (r8 != 0) goto L5
            int r0 = r7.r0
            goto L7
        L5:
            int r0 = r7.s0
        L7:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L2f
            if (r10 == 0) goto L11
            int r3 = r10.b
            if (r0 == r3) goto L2f
        L11:
            r3 = r1
        L12:
            int r4 = r9.size()
            if (r3 >= r4) goto L32
            java.lang.Object r4 = r9.get(r3)
            zs7 r4 = (defpackage.zs7) r4
            int r5 = r4.b
            if (r5 != r0) goto L2c
            if (r10 == 0) goto L2a
            r10.c(r8, r4)
            r9.remove(r10)
        L2a:
            r10 = r4
            goto L32
        L2c:
            int r3 = r3 + 1
            goto L12
        L2f:
            if (r0 == r2) goto L32
            return r10
        L32:
            r0 = 1
            if (r10 != 0) goto L8f
            boolean r3 = r7 instanceof defpackage.gx2
            if (r3 == 0) goto L6f
            r3 = r7
            gx2 r3 = (defpackage.gx2) r3
            r4 = r1
        L3d:
            int r5 = r3.u0
            if (r4 >= r5) goto L56
            l21[] r5 = r3.t0
            r5 = r5[r4]
            if (r8 != 0) goto L4c
            int r6 = r5.r0
            if (r6 == r2) goto L4c
            goto L57
        L4c:
            if (r8 != r0) goto L53
            int r6 = r5.s0
            if (r6 == r2) goto L53
            goto L57
        L53:
            int r4 = r4 + 1
            goto L3d
        L56:
            r6 = r2
        L57:
            if (r6 == r2) goto L6f
            r3 = r1
        L5a:
            int r4 = r9.size()
            if (r3 >= r4) goto L6f
            java.lang.Object r4 = r9.get(r3)
            zs7 r4 = (defpackage.zs7) r4
            int r5 = r4.b
            if (r5 != r6) goto L6c
            r10 = r4
            goto L6f
        L6c:
            int r3 = r3 + 1
            goto L5a
        L6f:
            if (r10 != 0) goto L8c
            zs7 r10 = new zs7
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.a = r3
            r3 = 0
            r10.d = r3
            r10.e = r2
            int r2 = defpackage.zs7.f
            int r3 = r2 + 1
            defpackage.zs7.f = r3
            r10.b = r2
            r10.c = r8
        L8c:
            r9.add(r10)
        L8f:
            java.util.ArrayList r2 = r10.a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L98
            return r10
        L98:
            r2.add(r7)
            boolean r2 = r7 instanceof defpackage.av2
            if (r2 == 0) goto Lac
            r2 = r7
            av2 r2 = (defpackage.av2) r2
            h11 r3 = r2.w0
            int r2 = r2.x0
            if (r2 != 0) goto La9
            r1 = r0
        La9:
            r3.c(r1, r10, r9)
        Lac:
            int r0 = r10.b
            if (r8 != 0) goto Lbd
            r7.r0 = r0
            h11 r0 = r7.I
            r0.c(r8, r10, r9)
            h11 r0 = r7.K
            r0.c(r8, r10, r9)
            goto Lce
        Lbd:
            r7.s0 = r0
            h11 r0 = r7.J
            r0.c(r8, r10, r9)
            h11 r0 = r7.M
            r0.c(r8, r10, r9)
            h11 r0 = r7.L
            r0.c(r8, r10, r9)
        Lce:
            h11 r7 = r7.P
            r7.c(r8, r10, r9)
            return r10
    }

    public static final float y(defpackage.l61 r1) {
            cs1 r0 = defpackage.cs1.f0
            j61 r1 = r1.Z(r0)
            n74 r1 = (defpackage.n74) r1
            if (r1 == 0) goto Lf
            float r1 = r1.F()
            goto L11
        Lf:
            r1 = 1065353216(0x3f800000, float:1.0)
        L11:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            return r1
        L17:
            java.lang.String r0 = "negative scale factor"
            defpackage.t05.b(r0)
            return r1
    }

    public static final java.lang.Class z(defpackage.ar0 r2) {
            r2.getClass()
            java.lang.Class r2 = r2.a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L7d;
                case 104431: goto L71;
                case 3039496: goto L65;
                case 3052374: goto L59;
                case 3327612: goto L4d;
                case 3625364: goto L41;
                case 64711720: goto L35;
                case 97526364: goto L29;
                case 109413500: goto L1b;
                default: goto L19;
            }
        L19:
            goto L88
        L1b:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L88
        L25:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            goto L88
        L29:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L88
        L32:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            goto L88
        L35:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L88
        L3e:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            goto L88
        L41:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4a
            goto L88
        L4a:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            goto L88
        L4d:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L88
        L56:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            goto L88
        L59:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L88
        L62:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            goto L88
        L65:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            goto L88
        L6e:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            goto L88
        L71:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7a
            goto L88
        L7a:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            goto L88
        L7d:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            goto L88
        L86:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
        L88:
            return r2
    }
}
