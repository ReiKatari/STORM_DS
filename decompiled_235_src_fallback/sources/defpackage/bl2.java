package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl2  reason: default package */
/* loaded from: classes.dex */
public abstract class bl2 implements defpackage.mo2 {
    public static final int A = 9;
    public static final int B = 10;
    public static final int L = 12;
    public static defpackage.e33 R;
    public static final /* synthetic */ int X = 0;
    public static defpackage.e33 Y;

    public bl2() {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public static defpackage.s83 A(int r12, long r13) {
            long r0 = (long) r12
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r4 = r0 / r2
            long r6 = r0 ^ r2
            r8 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto L17
            long r6 = r4 * r2
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 == 0) goto L17
            r6 = -1
            long r4 = r4 + r6
        L17:
            long r6 = r13 + r4
            long r10 = r13 ^ r6
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 >= 0) goto L2e
            long r4 = r4 ^ r13
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 < 0) goto L2e
            int r12 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r12 <= 0) goto L2b
            s83 r12 = defpackage.s83.R
            return r12
        L2b:
            s83 r12 = defpackage.s83.L
            return r12
        L2e:
            r12 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 >= 0) goto L3a
            s83 r12 = defpackage.s83.L
            return r12
        L3a:
            r12 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 <= 0) goto L46
            s83 r12 = defpackage.s83.R
            return r12
        L46:
            long r0 = r0 % r2
            long r12 = r0 ^ r2
            long r4 = -r0
            long r4 = r4 | r0
            long r12 = r12 & r4
            r14 = 63
            long r12 = r12 >> r14
            long r12 = r12 & r2
            long r0 = r0 + r12
            int r12 = (int) r0
            s83 r13 = new s83
            r13.<init>(r12, r6)
            return r13
    }

    public static final defpackage.hu3 B(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof defpackage.hu3
            if (r2 == 0) goto L14
            hu3 r1 = (defpackage.hu3) r1
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            android.view.ViewParent r3 = defpackage.xk2.s(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            android.view.View r3 = (android.view.View) r3
            goto L3
        L23:
            r3 = r0
            goto L3
        L25:
            return r0
    }

    public static final defpackage.au3 C(defpackage.hu3 r5) {
            r5.getClass()
            ut3 r5 = r5.getLifecycle()
            r5.getClass()
            os0 r0 = r5.a
        Lc:
            java.lang.Object r1 = r0.B
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            au3 r1 = (defpackage.au3) r1
            if (r1 == 0) goto L19
            return r1
        L19:
            au3 r1 = new au3
            gu6 r2 = defpackage.oi2.c()
            xe1 r3 = defpackage.xk1.a
            jv2 r3 = defpackage.e04.a
            jv2 r3 = r3.Y
            l61 r2 = defpackage.jw2.y(r2, r3)
            r1.<init>(r5, r2)
            java.lang.Object r2 = r0.B
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
        L30:
            r3 = 0
            boolean r4 = r2.compareAndSet(r3, r1)
            if (r4 == 0) goto L49
            xe1 r5 = defpackage.xk1.a
            jv2 r5 = defpackage.e04.a
            jv2 r5 = r5.Y
            m5 r0 = new m5
            r2 = 20
            r0.<init>(r1, r3, r2)
            r2 = 2
            defpackage.hv.L(r1, r5, r3, r0, r2)
            return r1
        L49:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L30
            goto Lc
    }

    public static final defpackage.sz4 D(android.view.View r2) {
            r0 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            java.lang.Object r1 = r2.getTag(r0)
            sz4 r1 = (defpackage.sz4) r1
            if (r1 != 0) goto L13
            sz4 r1 = new sz4
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    public static final defpackage.e33 E() {
            e33 r0 = defpackage.bl2.R
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Refresh"
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
            r2 = 1099772723(0x418d3333, float:17.65)
            r5 = 1087058739(0x40cb3333, float:6.35)
            r4.o(r2, r5)
            r9 = 1094713344(0x41400000, float:12.0)
            r10 = 1082130432(0x40800000, float:4.0)
            r5 = 1099012506(0x4181999a, float:16.2)
            r6 = 1084017869(0x409ccccd, float:4.9)
            r7 = 1097030697(0x41635c29, float:14.21)
            r8 = 1082130432(0x40800000, float:4.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r9 = -1056985580(0xffffffffc0ffae14, float:-7.99)
            r10 = 1090519040(0x41000000, float:8.0)
            r5 = -1064472412(0xffffffffc08d70a4, float:-4.42)
            r6 = 0
            r7 = -1056985580(0xffffffffc0ffae14, float:-7.99)
            r8 = 1080368824(0x40651eb8, float:3.58)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1080326881(0x40647ae1, float:3.57)
            r5 = 1090498068(0x40ffae14, float:7.99)
            r6 = 1090519040(0x41000000, float:8.0)
            r4.q(r2, r6, r5, r6)
            r9 = 1089952809(0x40f75c29, float:7.73)
            r10 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r5 = 1080997970(0x406eb852, float:3.73)
            r6 = 0
            r7 = 1088086344(0x40dae148, float:6.84)
            r8 = -1071434957(0xffffffffc0233333, float:-2.55)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = -1073406280(0xffffffffc0051eb8, float:-2.08)
            r4.l(r2)
            r9 = -1061892915(0xffffffffc0b4cccd, float:-5.65)
            r10 = 1082130432(0x40800000, float:4.0)
            r5 = -1085150331(0xffffffffbf51eb85, float:-0.82)
            r6 = 1075125944(0x40151eb8, float:2.33)
            r7 = -1069379748(0xffffffffc0428f5c, float:-3.04)
            r8 = 1082130432(0x40800000, float:4.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r10 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r5 = -1068247286(0xffffffffc053d70a, float:-3.31)
            r6 = 0
            r7 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r8 = -1070847754(0xffffffffc02c28f6, float:-2.69)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1076635894(0x402c28f6, float:2.69)
            r5 = 1086324736(0x40c00000, float:6.0)
            r6 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r4.q(r2, r6, r5, r6)
            r9 = 1082591805(0x40870a3d, float:4.22)
            r10 = 1071896330(0x3fe3d70a, float:1.78)
            r5 = 1070889697(0x3fd47ae1, float:1.66)
            r6 = 0
            r7 = 1078523331(0x4048f5c3, float:3.14)
            r8 = 1060152279(0x3f30a3d7, float:0.69)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1095761920(0x41500000, float:13.0)
            r5 = 1093664768(0x41300000, float:11.0)
            r4.m(r2, r5)
            r2 = 1088421888(0x40e00000, float:7.0)
            r4.l(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            r4.t(r2)
            r2 = -1072273818(0xffffffffc0166666, float:-2.35)
            r5 = 1075209830(0x40166666, float:2.35)
            r4.n(r2, r5)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.bl2.R = r0
            return r0
    }

    public static final defpackage.es7 F(defpackage.px0 r1) {
            nq6 r0 = defpackage.fs7.i
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r0)
            es7 r1 = (defpackage.es7) r1
            return r1
    }

    public static final void G(defpackage.va6 r0) {
            sm3 r0 = defpackage.nc1.f0(r0)
            r0.F()
            return
    }

    public static boolean H(int r1, java.lang.CharSequence r2) {
            int r0 = r2.length()
            if (r1 >= r0) goto L19
            char r1 = r2.charAt(r1)
            switch(r1) {
                case 33: goto L17;
                case 34: goto L17;
                case 35: goto L17;
                case 36: goto L17;
                case 37: goto L17;
                case 38: goto L17;
                case 39: goto L17;
                case 40: goto L17;
                case 41: goto L17;
                case 42: goto L17;
                case 43: goto L17;
                case 44: goto L17;
                case 45: goto L17;
                case 46: goto L17;
                case 47: goto L17;
                default: goto Ld;
            }
        Ld:
            switch(r1) {
                case 58: goto L17;
                case 59: goto L17;
                case 60: goto L17;
                case 61: goto L17;
                case 62: goto L17;
                case 63: goto L17;
                case 64: goto L17;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 91: goto L17;
                case 92: goto L17;
                case 93: goto L17;
                case 94: goto L17;
                case 95: goto L17;
                case 96: goto L17;
                default: goto L13;
            }
        L13:
            switch(r1) {
                case 123: goto L17;
                case 124: goto L17;
                case 125: goto L17;
                case 126: goto L17;
                default: goto L16;
            }
        L16:
            goto L19
        L17:
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static boolean I(android.content.Context r4) {
            java.lang.Class<al2> r0 = defpackage.al2.class
            java.lang.Object r4 = defpackage.hv.D(r4, r0)
            al2 r4 = (defpackage.al2) r4
            sb1 r4 = (defpackage.sb1) r4
            r4.getClass()
            java.util.Set r4 = java.util.Collections.EMPTY_SET
            int r0 = r4.size()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            java.lang.String r3 = "Cannot bind the flag @DisableFragmentGetContextFix more than once."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            defpackage.qo2.o(r0, r3, r1)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L28
            return r2
        L28:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static final boolean J(defpackage.sm3 r1) {
            sm3 r0 = r1.e0
            if (r0 == 0) goto L18
            sm3 r0 = r1.v()
            if (r0 == 0) goto Ld
            sm3 r0 = r0.e0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            wm3 r1 = r1.C0
            boolean r1 = r1.b
            if (r1 == 0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static java.lang.String[] K(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            boolean r0 = r5.containsKey(r4)
            r1 = 0
            if (r0 != 0) goto La
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
        La:
            r0 = -1
            int r5 = r5.getInt(r4, r0)
            java.lang.String r2 = "QuirkSettingsLoader"
            if (r5 != r0) goto L1f
            java.lang.String r3 = "Resource ID not found for key: "
            java.lang.String r3 = r3.concat(r4)
            defpackage.kj2.f0(r2, r3)
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
        L1f:
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L28
            java.lang.String[] r3 = r3.getStringArray(r5)     // Catch: android.content.res.Resources.NotFoundException -> L28
            return r3
        L28:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Quirk class names resource not found: "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.kj2.g0(r2, r4, r3)
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
    }

    public static defpackage.s83 L(java.lang.String r26) {
            r0 = r26
            r0.getClass()
            int r1 = r0.length()
            if (r1 != 0) goto L14
            yc1 r1 = new yc1
            java.lang.String r2 = "An empty string is not a valid Instant"
            r1.<init>(r0, r2)
            goto L48f
        L14:
            r1 = 0
            char r2 = r0.charAt(r1)
            r3 = 32
            r4 = 43
            r5 = 45
            r6 = 1
            if (r2 == r4) goto L27
            if (r2 == r5) goto L27
            r7 = r1
            r2 = r3
            goto L28
        L27:
            r7 = r6
        L28:
            r9 = r1
            r8 = r7
        L2a:
            int r10 = r0.length()
            r11 = 58
            r12 = 48
            if (r8 >= r10) goto L47
            char r10 = r0.charAt(r8)
            if (r12 > r10) goto L47
            if (r10 >= r11) goto L47
            int r9 = r9 * 10
            char r10 = r0.charAt(r8)
            int r10 = r10 - r12
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L2a
        L47:
            int r10 = r8 - r7
            java.lang.String r13 = " digits"
            r14 = 10
            if (r10 <= r14) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected at most 10 digits for the year number, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L66:
            if (r10 != r14) goto L8b
            char r7 = r0.charAt(r7)
            r15 = 50
            int r7 = defpackage.nb3.p(r7, r15)
            if (r7 < 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected at most 9 digits for the year number or year 1000000000, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L8b:
            r7 = 4
            if (r10 >= r7) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The year number must be padded to 4 digits, got "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        La5:
            if (r2 != r4) goto Lb1
            if (r10 != r7) goto Lb1
            java.lang.String r1 = "The '+' sign at the start is only valid for year numbers longer than 4 digits"
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        Lb1:
            if (r2 != r3) goto Lbd
            if (r10 == r7) goto Lbd
            java.lang.String r1 = "A '+' or '-' sign is required for year numbers longer than 4 digits"
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        Lbd:
            if (r2 != r5) goto Lc0
            int r9 = -r9
        Lc0:
            int r2 = r0.length()
            int r3 = r8 + 16
            if (r2 >= r3) goto Ld0
            java.lang.String r1 = "The input string is too short"
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        Ld0:
            bz1 r2 = new bz1
            r10 = 28
            r2.<init>(r10)
            java.lang.String r15 = "'-'"
            yc1 r2 = defpackage.nb3.L(r0, r15, r8, r2)
            if (r2 == 0) goto Le2
        Ldf:
            r1 = r2
            goto L48f
        Le2:
            int r2 = r8 + 3
            bz1 r10 = new bz1
            r7 = 29
            r10.<init>(r7)
            yc1 r2 = defpackage.nb3.L(r0, r15, r2, r10)
            if (r2 == 0) goto Lf2
            goto Ldf
        Lf2:
            int r2 = r8 + 6
            v83 r10 = new v83
            r10.<init>(r1)
            java.lang.String r15 = "'T' or 't'"
            yc1 r2 = defpackage.nb3.L(r0, r15, r2, r10)
            if (r2 == 0) goto L102
            goto Ldf
        L102:
            int r2 = r8 + 9
            v83 r10 = new v83
            r10.<init>(r6)
            java.lang.String r15 = "':'"
            yc1 r2 = defpackage.nb3.L(r0, r15, r2, r10)
            if (r2 == 0) goto L112
            goto Ldf
        L112:
            int r2 = r8 + 12
            v83 r10 = new v83
            r1 = 2
            r10.<init>(r1)
            yc1 r2 = defpackage.nb3.L(r0, r15, r2, r10)
            if (r2 == 0) goto L121
            goto Ldf
        L121:
            int[] r2 = defpackage.nb3.n
            r10 = 0
        L124:
            r15 = 3
            if (r10 >= r14) goto L140
            r19 = r2[r10]
            int r7 = r8 + r19
            v83 r1 = new v83
            r1.<init>(r15)
            java.lang.String r15 = "an ASCII digit"
            yc1 r1 = defpackage.nb3.L(r0, r15, r7, r1)
            if (r1 == 0) goto L13a
            goto L48f
        L13a:
            int r10 = r10 + 1
            r1 = 2
            r7 = 29
            goto L124
        L140:
            int r1 = r8 + 1
            int r1 = defpackage.nb3.N(r1, r0)
            int r2 = r8 + 4
            int r2 = defpackage.nb3.N(r2, r0)
            int r7 = r8 + 7
            int r7 = defpackage.nb3.N(r7, r0)
            int r10 = r8 + 10
            int r10 = defpackage.nb3.N(r10, r0)
            int r15 = r8 + 13
            int r15 = defpackage.nb3.N(r15, r0)
            int r8 = r8 + 15
            char r5 = r0.charAt(r8)
            r4 = 46
            r14 = 9
            if (r5 != r4) goto L1ac
            r8 = r3
            r4 = 0
        L16c:
            int r5 = r0.length()
            if (r8 >= r5) goto L185
            char r5 = r0.charAt(r8)
            if (r12 > r5) goto L185
            if (r5 >= r11) goto L185
            int r4 = r4 * 10
            char r5 = r0.charAt(r8)
            int r5 = r5 - r12
            int r4 = r4 + r5
            int r8 = r8 + 1
            goto L16c
        L185:
            int r3 = r8 - r3
            if (r6 > r3) goto L195
            r5 = 10
            if (r3 >= r5) goto L195
            int[] r5 = defpackage.nb3.m
            int r3 = 9 - r3
            r3 = r5[r3]
            int r4 = r4 * r3
            goto L1ad
        L195:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "1..9 digits are supported for the fraction of the second, got "
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L1ac:
            r4 = 0
        L1ad:
            int r3 = r0.length()
            if (r8 < r3) goto L1bb
            java.lang.String r1 = "The UTC offset at the end of the string is missing"
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L1bb:
            char r3 = r0.charAt(r8)
            r5 = 39
            java.lang.String r13 = ", got '"
            r24 = r6
            r12 = 43
            if (r3 == r12) goto L213
            r12 = 45
            if (r3 == r12) goto L213
            r11 = 90
            if (r3 == r11) goto L1f2
            r11 = 122(0x7a, float:1.71E-43)
            if (r3 == r11) goto L1f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected the UTC offset at position "
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r13)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L1f2:
            int r3 = r0.length()
            int r8 = r8 + 1
            if (r3 != r8) goto L1ff
            r6 = 0
        L1fb:
            r3 = r24
            goto L36e
        L1ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Extra text after the instant at position "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L213:
            int r12 = r0.length()
            int r12 = r12 - r8
            if (r12 <= r14) goto L245
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The UTC offset string \""
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r3 = 16
            java.lang.String r2 = defpackage.nb3.e0(r3, r2)
            r1.append(r2)
            java.lang.String r2 = "\" is too long"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L245:
            int r23 = r12 % 3
            if (r23 == 0) goto L26e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid UTC offset string \""
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L26e:
            int[] r23 = defpackage.nb3.o
            r14 = 0
        L271:
            r6 = 2
            if (r14 >= r6) goto L2a5
            r6 = r23[r14]
            int r6 = r6 + r8
            int r5 = r0.length()
            if (r6 < r5) goto L27e
            goto L2a5
        L27e:
            char r5 = r0.charAt(r6)
            if (r5 == r11) goto L2a0
            java.lang.String r1 = "Expected ':' at index "
            java.lang.StringBuilder r1 = defpackage.xg6.t(r1, r6, r13)
            char r2 = r0.charAt(r6)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L2a0:
            int r14 = r14 + 1
            r5 = 39
            goto L271
        L2a5:
            int[] r5 = defpackage.nb3.p
            r6 = 0
        L2a8:
            r14 = 6
            if (r6 >= r14) goto L2e5
            r14 = r5[r6]
            int r14 = r14 + r8
            int r11 = r0.length()
            if (r14 < r11) goto L2b5
            goto L2e5
        L2b5:
            char r11 = r0.charAt(r14)
            r25 = r5
            r5 = 48
            if (r5 > r11) goto L2c9
            r5 = 58
            if (r11 >= r5) goto L2c9
            int r6 = r6 + 1
            r11 = r5
            r5 = r25
            goto L2a8
        L2c9:
            java.lang.String r1 = "Expected an ASCII digit at index "
            java.lang.StringBuilder r1 = defpackage.xg6.t(r1, r14, r13)
            char r2 = r0.charAt(r14)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L2e5:
            int r5 = r8 + 1
            int r5 = defpackage.nb3.N(r5, r0)
            r6 = 3
            if (r12 <= r6) goto L2f6
            int r6 = r8 + 4
            int r6 = defpackage.nb3.N(r6, r0)
        L2f4:
            r14 = 6
            goto L2f8
        L2f6:
            r6 = 0
            goto L2f4
        L2f8:
            if (r12 <= r14) goto L303
            int r11 = r8 + 7
            int r11 = defpackage.nb3.N(r11, r0)
        L300:
            r12 = 59
            goto L305
        L303:
            r11 = 0
            goto L300
        L305:
            if (r6 <= r12) goto L31b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected offset-minute-of-hour in 0..59, got "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L31b:
            if (r11 <= r12) goto L331
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected offset-second-of-minute in 0..59, got "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L331:
            r12 = 17
            if (r5 <= r12) goto L35d
            r12 = 18
            if (r5 != r12) goto L33d
            if (r6 != 0) goto L33d
            if (r11 == 0) goto L35d
        L33d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected an offset in -18:00..+18:00, got "
            r1.<init>(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L35d:
            int r5 = r5 * 3600
            int r6 = r6 * 60
            int r6 = r6 + r5
            int r6 = r6 + r11
            r12 = 45
            if (r3 != r12) goto L369
            r3 = -1
            goto L36b
        L369:
            r3 = r24
        L36b:
            int r6 = r6 * r3
            goto L1fb
        L36e:
            if (r3 > r1) goto L47d
            r5 = 13
            if (r1 >= r5) goto L47d
            if (r3 > r2) goto L467
            r3 = r9 & 3
            if (r3 != 0) goto L386
            int r5 = r9 % 100
            if (r5 != 0) goto L382
            int r5 = r9 % 400
            if (r5 != 0) goto L386
        L382:
            r18 = 1
        L384:
            r5 = 2
            goto L389
        L386:
            r18 = 0
            goto L384
        L389:
            if (r1 == r5) goto L39f
            r5 = 4
            if (r1 == r5) goto L39c
            r14 = 6
            if (r1 == r14) goto L39c
            r5 = 9
            if (r1 == r5) goto L39c
            r5 = 11
            if (r1 == r5) goto L39c
            r5 = 31
            goto L3a6
        L39c:
            r5 = 30
            goto L3a6
        L39f:
            if (r18 == 0) goto L3a4
            r5 = 29
            goto L3a6
        L3a4:
            r5 = 28
        L3a6:
            if (r2 > r5) goto L467
            r5 = 23
            if (r7 <= r5) goto L3c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected hour in 0..23, got "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L3c0:
            r12 = 59
            if (r10 <= r12) goto L3d8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected minute-of-hour in 0..59, got "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L3d8:
            if (r15 <= r12) goto L3ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected second-of-minute in 0..59, got "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L3ee:
            long r11 = (long) r9
            r13 = 365(0x16d, double:1.803E-321)
            long r13 = r13 * r11
            r16 = 0
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 < 0) goto L416
            r16 = 3
            long r16 = r11 + r16
            r20 = 4
            long r16 = r16 / r20
            r20 = 99
            long r20 = r11 + r20
            r22 = 100
            long r20 = r20 / r22
            long r16 = r16 - r20
            r20 = 399(0x18f, double:1.97E-321)
            long r11 = r11 + r20
            r20 = 400(0x190, double:1.976E-321)
            long r11 = r11 / r20
            long r11 = r11 + r16
            long r11 = r11 + r13
            goto L428
        L416:
            r16 = -4
            long r16 = r11 / r16
            r20 = -100
            long r20 = r11 / r20
            long r16 = r16 - r20
            r20 = -400(0xfffffffffffffe70, double:NaN)
            long r11 = r11 / r20
            long r11 = r11 + r16
            long r11 = r13 - r11
        L428:
            int r0 = r1 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            long r13 = (long) r0
            long r11 = r11 + r13
            r24 = 1
            int r2 = r2 + (-1)
            long r13 = (long) r2
            long r11 = r11 + r13
            r5 = 2
            if (r1 <= r5) goto L44b
            r0 = -1
            long r0 = r0 + r11
            if (r3 != 0) goto L448
            int r2 = r9 % 100
            if (r2 != 0) goto L446
            int r9 = r9 % 400
            if (r9 != 0) goto L448
        L446:
            r11 = r0
            goto L44b
        L448:
            r0 = -2
            long r11 = r11 + r0
        L44b:
            r0 = 719528(0xafaa8, double:3.55494E-318)
            long r11 = r11 - r0
            int r7 = r7 * 3600
            int r10 = r10 * 60
            int r10 = r10 + r7
            int r10 = r10 + r15
            r0 = 86400(0x15180, double:4.26873E-319)
            long r11 = r11 * r0
            long r0 = (long) r10
            long r11 = r11 + r0
            long r0 = (long) r6
            long r11 = r11 - r0
            w83 r1 = new w83
            r1.<init>()
            r1.A = r11
            r1.B = r4
            goto L48f
        L467:
            java.lang.String r3 = " of year "
            java.lang.String r4 = ", got "
            java.lang.String r5 = "Expected a valid day-of-month for month "
            java.lang.StringBuilder r1 = defpackage.i61.q(r1, r9, r5, r3, r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
            goto L48f
        L47d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a month number in 1..12, got "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            yc1 r1 = defpackage.nb3.M(r0, r1)
        L48f:
            s83 r0 = r1.toInstant()
            return r0
    }

    public static void M(long r6, defpackage.fp r8, boolean r9, defpackage.bg2 r10) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r9 == 0) goto L7c
            int r9 = defpackage.k47.c
            r9 = 32
            long r2 = r6 >> r9
            int r9 = (int) r2
            long r2 = r6 & r0
            int r2 = (int) r2
            r3 = 10
            if (r9 <= 0) goto L1a
            int r4 = java.lang.Character.codePointBefore(r8, r9)
            goto L1b
        L1a:
            r4 = r3
        L1b:
            java.lang.String r5 = r8.B
            int r5 = r5.length()
            if (r2 >= r5) goto L27
            int r3 = java.lang.Character.codePointAt(r8, r2)
        L27:
            boolean r5 = defpackage.kn2.Q(r4)
            if (r5 == 0) goto L4f
            boolean r5 = defpackage.kn2.P(r3)
            if (r5 != 0) goto L39
            boolean r5 = defpackage.kn2.N(r3)
            if (r5 == 0) goto L4f
        L39:
            int r6 = java.lang.Character.charCount(r4)
            int r9 = r9 - r6
            if (r9 == 0) goto L4a
            int r4 = java.lang.Character.codePointBefore(r8, r9)
            boolean r6 = defpackage.kn2.Q(r4)
            if (r6 != 0) goto L39
        L4a:
            long r6 = defpackage.jx2.f(r9, r2)
            goto L7c
        L4f:
            boolean r5 = defpackage.kn2.Q(r3)
            if (r5 == 0) goto L7c
            boolean r5 = defpackage.kn2.P(r4)
            if (r5 != 0) goto L61
            boolean r4 = defpackage.kn2.N(r4)
            if (r4 == 0) goto L7c
        L61:
            int r6 = java.lang.Character.charCount(r3)
            int r2 = r2 + r6
            java.lang.String r6 = r8.B
            int r6 = r6.length()
            if (r2 == r6) goto L78
            int r3 = java.lang.Character.codePointAt(r8, r2)
            boolean r6 = defpackage.kn2.Q(r3)
            if (r6 != 0) goto L61
        L78:
            long r6 = defpackage.jx2.f(r9, r2)
        L7c:
            dd6 r8 = new dd6
            long r0 = r0 & r6
            int r9 = (int) r0
            r8.<init>(r9, r9)
            int r6 = defpackage.k47.d(r6)
            hh1 r7 = new hh1
            r9 = 0
            r7.<init>(r6, r9)
            r6 = 2
            ds1[] r6 = new defpackage.ds1[r6]
            r6[r9] = r8
            r8 = 1
            r6[r8] = r7
            sv2 r7 = new sv2
            r7.<init>(r6)
            r10.g(r7)
            return
    }

    public static final void N(android.os.Bundle r1, java.lang.String r2, java.util.List r3) {
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L7
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto Ld
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r3 = r0
        Ld:
            r1.putStringArrayList(r2, r3)
            return
    }

    public static java.util.HashSet O(java.lang.String[] r8) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<u65> r6 = defpackage.u65.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            defpackage.kj2.f0(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            defpackage.kj2.g0(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
    }

    public static final void P(defpackage.co4 r3, int r4, java.lang.Object r5) {
            java.lang.Object[] r0 = r3.g
            int r1 = r3.h
            ao4[] r2 = r3.c
            int r3 = r3.d
            int r3 = r3 + (-1)
            r3 = r2[r3]
            int r3 = r3.c
            int r1 = r1 - r3
            int r1 = r1 + r4
            r0[r1] = r5
            return
    }

    public static final void Q(defpackage.co4 r3, int r4, java.lang.Object r5, int r6, java.lang.Object r7) {
            int r0 = r3.h
            ao4[] r1 = r3.c
            int r2 = r3.d
            int r2 = r2 + (-1)
            r1 = r1[r2]
            int r1 = r1.c
            int r0 = r0 - r1
            java.lang.Object[] r3 = r3.g
            int r4 = r4 + r0
            r3[r4] = r5
            int r0 = r0 + r6
            r3[r0] = r7
            return
    }

    public static void R(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            defpackage.m87.a(r2, r3)
            return
        La:
            o87 r0 = defpackage.o87.g0
            r1 = 0
            if (r0 == 0) goto L16
            android.view.View r0 = r0.A
            if (r0 != r2) goto L16
            defpackage.o87.b(r1)
        L16:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L32
            o87 r3 = defpackage.o87.h0
            if (r3 == 0) goto L27
            android.view.View r0 = r3.A
            if (r0 != r2) goto L27
            r3.a()
        L27:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            return
        L32:
            o87 r0 = new o87
            r0.<init>(r2, r3)
            return
    }

    public static int S(char r1, int r2, int r3, java.lang.CharSequence r4) {
        L0:
            if (r2 >= r3) goto Lc
            char r0 = r4.charAt(r2)
            if (r0 == r1) goto L9
            return r2
        L9:
            int r2 = r2 + 1
            goto L0
        Lc:
            return r3
    }

    public static int T(java.lang.CharSequence r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto L12
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto Lf
            r1 = 32
            if (r0 == r1) goto Lf
            return r3
        Lf:
            int r3 = r3 + 1
            goto L0
        L12:
            return r4
    }

    public static final long U(long r4, long r6, long r8, java.lang.String r10) {
            int r0 = defpackage.xx6.a
            java.lang.String r0 = java.lang.System.getProperty(r10)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r4
        Lb:
            java.lang.Long r4 = defpackage.xs6.i0(r0)
            r5 = 39
            java.lang.String r1 = "System property '"
            if (r4 == 0) goto L4d
            long r2 = r4.longValue()
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L22
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "' should be in range "
            r0.append(r10)
            r0.append(r6)
            java.lang.String r6 = ".."
            java.lang.String r7 = ", but is '"
            defpackage.xg6.B(r0, r6, r8, r7)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r10)
            java.lang.String r7 = "' has unrecognized value '"
            r6.append(r7)
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static int V(int r7, int r8, java.lang.String r9) {
            r8 = r8 & 8
            if (r8 == 0) goto L8
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r8 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r0 = (long) r7
            r2 = 1
            long r4 = (long) r8
            r6 = r9
            long r7 = U(r0, r2, r4, r6)
            int r7 = (int) r7
            return r7
    }

    public static final java.lang.Object W(defpackage.sb4 r4, defpackage.ar0 r5) {
            r4.getClass()
            uk1 r0 = r4.d0
            android.os.Bundle r0 = r0.c()
            if (r0 != 0) goto L18
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r0 = (defpackage.vr4[]) r0
            android.os.Bundle r0 = defpackage.jw2.l(r0)
        L18:
            ic4 r4 = r4.B
            java.util.Map r4 = r4.c()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r4.size()
            int r2 = defpackage.c14.k0(r2)
            r1.<init>(r2)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            rb4 r2 = (defpackage.rb4) r2
            fd4 r2 = r2.a
            r1.put(r3, r2)
            goto L35
        L51:
            gg3 r4 = defpackage.jx2.K(r5)
            e26 r5 = new e26
            r5.<init>(r0, r1)
            gg3 r4 = (defpackage.gg3) r4
            java.lang.Object r4 = r4.c(r5)
            return r4
    }

    public static final defpackage.of6 a() {
            r0 = 1
            m80 r1 = defpackage.m80.DROP_OLDEST
            r2 = 0
            of6 r0 = defpackage.pf6.b(r2, r0, r1, r0)
            return r0
    }

    public static final void b(defpackage.sr4 r16, defpackage.a74 r17, defpackage.ic r18, defpackage.z31 r19, float r20, defpackage.px0 r21, int r22, int r23) {
            r2 = r17
            r6 = r22
            r0 = r21
            xq2 r0 = (defpackage.xq2) r0
            r1 = 1142754848(0x441d0e20, float:628.2207)
            r0.d0(r1)
            r8 = r16
            boolean r1 = r0.h(r8)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r1 | r6
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L2a
            boolean r3 = r0.f(r2)
            if (r3 == 0) goto L27
            r3 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r3 = 128(0x80, float:1.8E-43)
        L29:
            r1 = r1 | r3
        L2a:
            r3 = r23 & 8
            if (r3 == 0) goto L33
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r4 = r18
            goto L41
        L33:
            r4 = r18
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L3e
            r5 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r5 = 1024(0x400, float:1.435E-42)
        L40:
            r1 = r1 | r5
        L41:
            r5 = r23 & 16
            if (r5 == 0) goto L4a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L47:
            r7 = r19
            goto L5c
        L4a:
            r7 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L47
            r7 = r19
            boolean r9 = r0.f(r7)
            if (r9 == 0) goto L59
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L5b
        L59:
            r9 = 8192(0x2000, float:1.148E-41)
        L5b:
            r1 = r1 | r9
        L5c:
            r9 = r23 & 32
            if (r9 == 0) goto L66
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            r10 = r20
            goto L74
        L66:
            r10 = r20
            boolean r11 = r0.c(r10)
            if (r11 == 0) goto L71
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L73
        L71:
            r11 = 65536(0x10000, float:9.1835E-41)
        L73:
            r1 = r1 | r11
        L74:
            r11 = r23 & 64
            if (r11 == 0) goto L7c
            r11 = 1572864(0x180000, float:2.204052E-39)
        L7a:
            r1 = r1 | r11
            goto L89
        L7c:
            r11 = 0
            boolean r11 = r0.f(r11)
            if (r11 == 0) goto L86
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L7a
        L86:
            r11 = 524288(0x80000, float:7.34684E-40)
            goto L7a
        L89:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r1
            r12 = 599186(0x92492, float:8.39638E-40)
            r13 = 0
            r14 = 1
            if (r11 == r12) goto L96
            r11 = r14
            goto L97
        L96:
            r11 = r13
        L97:
            r1 = r1 & r14
            boolean r1 = r0.S(r1, r11)
            if (r1 == 0) goto L126
            if (r3 == 0) goto La6
            e40 r1 = defpackage.d90.Z
            r15 = r9
            r9 = r1
            r1 = r15
            goto La8
        La6:
            r1 = r9
            r9 = r4
        La8:
            if (r5 == 0) goto Lae
            w31 r3 = defpackage.y31.b
            r10 = r3
            goto Laf
        Lae:
            r10 = r7
        Laf:
            if (r1 == 0) goto Lb5
            r1 = 1065353216(0x3f800000, float:1.0)
            r11 = r1
            goto Lb7
        Lb5:
            r11 = r20
        Lb7:
            r1 = 1899381698(0x713643c2, float:9.02531E29)
            r0.b0(r1)
            r0.p(r13)
            x64 r1 = defpackage.x64.a
            a74 r1 = r2.d(r1)
            a74 r7 = defpackage.u24.h(r1)
            r13 = 2
            r12 = 0
            a74 r1 = defpackage.ak7.u0(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r0.P()
            vs0 r4 = defpackage.ox0.a
            if (r3 != r4) goto Ldd
            fc r3 = defpackage.fc.j
            r0.l0(r3)
        Ldd:
            e34 r3 = (defpackage.e34) r3
            long r4 = r0.T
            int r4 = java.lang.Long.hashCode(r4)
            a74 r1 = defpackage.l.E(r0, r1)
            xv4 r5 = r0.l()
            ix0 r7 = defpackage.jx0.i
            r7.getClass()
            iy0 r7 = defpackage.ix0.b
            r0.f0()
            boolean r8 = r0.S
            if (r8 == 0) goto Lff
            r0.k(r7)
            goto L102
        Lff:
            r0.o0()
        L102:
            pn r7 = defpackage.ix0.f
            defpackage.yh2.K(r0, r7, r3)
            pn r3 = defpackage.ix0.e
            defpackage.yh2.K(r0, r3, r5)
            ne r3 = defpackage.ix0.h
            defpackage.yh2.F(r0, r3)
            pn r3 = defpackage.ix0.d
            defpackage.yh2.K(r0, r3, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            pn r3 = defpackage.ix0.g
            defpackage.yh2.K(r0, r3, r1)
            r0.p(r14)
            r3 = r9
            r4 = r10
            r5 = r11
            goto L12d
        L126:
            r0.V()
            r5 = r20
            r3 = r4
            r4 = r7
        L12d:
            cf5 r8 = r0.t()
            if (r8 == 0) goto L13e
            k23 r0 = new k23
            r1 = r16
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L13e:
            return
    }

    public static final void c(defpackage.zh r8, defpackage.a74 r9, int r10, defpackage.px0 r11, int r12, int r13) {
            e40 r2 = defpackage.d90.Z
            r0 = r13 & 16
            if (r0 == 0) goto La
            w31 r0 = defpackage.y31.b
        L8:
            r3 = r0
            goto Ld
        La:
            vs0 r0 = defpackage.y31.a
            goto L8
        Ld:
            r13 = r13 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L12
            r10 = 1
        L12:
            r5 = r11
            xq2 r5 = (defpackage.xq2) r5
            boolean r11 = r5.f(r8)
            java.lang.Object r13 = r5.P()
            if (r11 != 0) goto L23
            vs0 r11 = defpackage.ox0.a
            if (r13 != r11) goto L2a
        L23:
            w40 r13 = defpackage.g04.h(r8, r10)
            r5.l0(r13)
        L2a:
            r0 = r13
            w40 r0 = (defpackage.w40) r0
            r8 = r12 & 896(0x380, float:1.256E-42)
            r10 = 56
            r8 = r8 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            r6 = r8 | r10
            r7 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = r9
            b(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static final void d(defpackage.zv0 r5, defpackage.px0 r6, int r7) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = 441837433(0x1a55e779, float:4.423435E-23)
            r6.d0(r0)
            r0 = r7 & 3
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = r7 & 1
            boolean r0 = r6.S(r2, r0)
            if (r0 == 0) goto L68
            java.lang.Object r0 = r6.P()
            vs0 r2 = defpackage.ox0.a
            if (r0 != r2) goto L2a
            tz3 r0 = new tz3
            r0.<init>()
            r6.l0(r0)
        L2a:
            tz3 r0 = (defpackage.tz3) r0
            java.lang.Object r4 = r6.P()
            if (r4 != r2) goto L37
            iy0 r4 = defpackage.iy0.j0
            r6.l0(r4)
        L37:
            on2 r4 = (defpackage.on2) r4
            r6.f0()
            boolean r2 = r6.S
            if (r2 == 0) goto L44
            r6.k(r4)
            goto L47
        L44:
            r6.o0()
        L47:
            boolean r2 = r6.S
            if (r2 == 0) goto L56
            z17 r2 = new z17
            r4 = 6
            r2.<init>(r4)
            jg7 r4 = defpackage.jg7.a
            r6.b(r2, r4)
        L56:
            pn r2 = defpackage.pn.j0
            defpackage.yh2.K(r6, r2, r0)
            r2 = 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.e(r0, r6, r2)
            r6.p(r3)
            goto L6b
        L68:
            r6.V()
        L6b:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L78
            uz3 r0 = new uz3
            r0.<init>(r5, r7, r1)
            r6.d = r0
        L78:
            return
    }

    public static final void e(boolean r5, defpackage.zv0 r6, defpackage.px0 r7, int r8, int r9) {
            xq2 r7 = (defpackage.xq2) r7
            r0 = -1734155591(0xffffffff98a2e2b9, float:-4.210495E-24)
            r7.d0(r0)
            r0 = r8 & 6
            if (r0 != 0) goto L1b
            r0 = r9 & 1
            if (r0 != 0) goto L18
            boolean r0 = r7.g(r5)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r0 | r8
            goto L1c
        L1b:
            r0 = r8
        L1c:
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L26
            r1 = r4
            goto L27
        L26:
            r1 = r3
        L27:
            r0 = r0 & r4
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto Lac
            r7.X()
            r0 = r8 & 1
            if (r0 == 0) goto L42
            boolean r0 = r7.B()
            if (r0 == 0) goto L3c
            goto L42
        L3c:
            r7.V()
            r0 = r9 & 1
            goto L59
        L42:
            r0 = r9 & 1
            if (r0 == 0) goto L59
            py0 r5 = defpackage.kf.a
            java.lang.Object r5 = r7.j(r5)
            android.content.res.Configuration r5 = (android.content.res.Configuration) r5
            int r5 = r5.uiMode
            r5 = r5 & 48
            r0 = 32
            if (r5 != r0) goto L58
            r5 = r4
            goto L59
        L58:
            r5 = r3
        L59:
            r7.q()
            vs4 r0 = defpackage.ht.a
            java.lang.Object r0 = r0.getValue()
            g57 r0 = (defpackage.g57) r0
            int[] r1 = defpackage.a44.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L90;
                case 2: goto L8d;
                case 3: goto L8a;
                case 4: goto L87;
                case 5: goto L84;
                case 6: goto L81;
                case 7: goto L7e;
                case 8: goto L7b;
                case 9: goto L73;
                default: goto L6f;
            }
        L6f:
            defpackage.i.d()
            return
        L73:
            if (r5 == 0) goto L78
            es7 r0 = defpackage.fs7.a
            goto L92
        L78:
            es7 r0 = defpackage.fs7.b
            goto L92
        L7b:
            es7 r0 = defpackage.fs7.a
            goto L92
        L7e:
            es7 r0 = defpackage.fs7.h
            goto L92
        L81:
            es7 r0 = defpackage.fs7.g
            goto L92
        L84:
            es7 r0 = defpackage.fs7.f
            goto L92
        L87:
            es7 r0 = defpackage.fs7.e
            goto L92
        L8a:
            es7 r0 = defpackage.fs7.d
            goto L92
        L8d:
            es7 r0 = defpackage.fs7.c
            goto L92
        L90:
            es7 r0 = defpackage.fs7.b
        L92:
            nq6 r1 = defpackage.fs7.i
            pq r1 = r1.a(r0)
            ql1 r2 = new ql1
            r3 = 24
            r2.<init>(r3, r0, r6)
            r0 = -889841799(0xffffffffcaf61779, float:-8063932.5)
            zv0 r0 = defpackage.n16.I(r0, r2, r7)
            r2 = 56
            defpackage.hv.d(r1, r0, r7, r2)
            goto Laf
        Lac:
            r7.V()
        Laf:
            cf5 r7 = r7.t()
            if (r7 == 0) goto Lbc
            z34 r0 = new z34
            r0.<init>(r5, r6, r8, r9)
            r7.d = r0
        Lbc:
            return
    }

    public static final void f(defpackage.pq5 r27, defpackage.on2 r28, defpackage.qn2 r29, defpackage.px0 r30, int r31) {
            r1 = r27
            r4 = r31
            r1.getClass()
            r28.getClass()
            r29.getClass()
            r8 = r30
            xq2 r8 = (defpackage.xq2) r8
            r0 = 457736354(0x1b4880a2, float:1.6585176E-22)
            r8.d0(r0)
            r0 = r4 & 6
            if (r0 != 0) goto L26
            boolean r0 = r8.h(r1)
            if (r0 == 0) goto L23
            r0 = 4
            goto L24
        L23:
            r0 = 2
        L24:
            r0 = r0 | r4
            goto L27
        L26:
            r0 = r4
        L27:
            r2 = r4 & 48
            r12 = r28
            if (r2 != 0) goto L39
            boolean r2 = r8.h(r12)
            if (r2 == 0) goto L36
            r2 = 32
            goto L38
        L36:
            r2 = 16
        L38:
            r0 = r0 | r2
        L39:
            r2 = r4 & 384(0x180, float:5.38E-43)
            r11 = r29
            if (r2 != 0) goto L4b
            boolean r2 = r8.h(r11)
            if (r2 == 0) goto L48
            r2 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r2 = 128(0x80, float:1.8E-43)
        L4a:
            r0 = r0 | r2
        L4b:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r5 = 0
            if (r2 == r3) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = r5
        L55:
            r3 = r0 & 1
            boolean r2 = r8.S(r3, r2)
            if (r2 == 0) goto L11c
            nq6 r2 = defpackage.kf.b
            java.lang.Object r2 = r8.j(r2)
            r14 = r2
            android.content.Context r14 = (android.content.Context) r14
            F(r8)
            java.lang.Object r2 = r8.P()
            vs0 r3 = defpackage.ox0.a
            if (r2 != r3) goto L7c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            vs4 r2 = defpackage.np2.Y(r2)
            r8.l0(r2)
        L7c:
            r13 = r2
            qa4 r13 = (defpackage.qa4) r13
            boolean r2 = r8.f(r1)
            java.lang.Object r6 = r8.P()
            if (r2 != 0) goto L8b
            if (r6 != r3) goto Lfa
        L8b:
            java.lang.String r18 = defpackage.hf.k0(r1)
            qe4 r15 = new qe4
            r21 = 4
            r22 = 32
            java.lang.String r16 = "r1"
            java.lang.String r17 = "RedTrainer_DS"
            java.lang.String r19 = "Wiimmfi WFC"
            r20 = 2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r2 = r15
            qe4 r19 = new qe4
            r25 = 8
            r26 = 24
            java.lang.String r20 = "r2"
            java.lang.String r21 = "SpeedRacer_99"
            java.lang.String r22 = "Mario Kart DS"
            java.lang.String r23 = "Kaeru WFC"
            r24 = 3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3 = r19
            qe4 r19 = new qe4
            r25 = 4
            r26 = 45
            java.lang.String r20 = "r3"
            java.lang.String r21 = "GhostHunter"
            java.lang.String r22 = "Metroid Prime Hunters"
            java.lang.String r23 = "AltWFC"
            r24 = 1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r6 = r19
            qe4 r19 = new qe4
            r25 = 2
            r26 = 18
            java.lang.String r20 = "r4"
            java.lang.String r21 = "PokéMaster_Alex"
            java.lang.String r22 = "Pokemon HeartGold"
            java.lang.String r23 = "Wiimmfi WFC"
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7 = r19
            qe4 r15 = new qe4
            r21 = 4
            r22 = 4
            java.lang.String r16 = "r5"
            java.lang.String r17 = "Local_Champion"
            java.lang.String r19 = "NiFi Local Mesh"
            r20 = 1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            qe4[] r2 = new defpackage.qe4[]{r2, r3, r6, r7, r15}
            java.util.List r6 = defpackage.hf.c0(r2)
            r8.l0(r6)
        Lfa:
            r10 = r6
            java.util.List r10 = (java.util.List) r10
            jj1 r6 = new jj1
            r2 = 3
            r6.<init>(r2, r5, r5)
            ne4 r9 = new ne4
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3 = 717987385(0x2acb9e39, float:3.6169833E-13)
            zv0 r7 = defpackage.n16.I(r3, r9, r8)
            int r0 = r0 >> r2
            r0 = r0 & 14
            r9 = r0 | 432(0x1b0, float:6.05E-43)
            r10 = 0
            r5 = r28
            defpackage.nw7.o(r5, r6, r7, r8, r9, r10)
            goto L11f
        L11c:
            r8.V()
        L11f:
            cf5 r6 = r8.t()
            if (r6 == 0) goto L132
            rl r0 = new rl
            r5 = 15
            r2 = r28
            r3 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L132:
            return
    }

    public static final void g(defpackage.zv0 r17, defpackage.eo2 r18, defpackage.px0 r19, int r20) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r19
            xq2 r3 = (defpackage.xq2) r3
            r4 = 1302703572(0x4da5add4, float:3.4745408E8)
            r3.d0(r4)
            boolean r4 = r3.h(r0)
            if (r4 == 0) goto L18
            r4 = 4
            goto L19
        L18:
            r4 = 2
        L19:
            r4 = r4 | r2
            boolean r5 = r3.h(r1)
            if (r5 == 0) goto L23
            r5 = 32
            goto L25
        L23:
            r5 = 16
        L25:
            r4 = r4 | r5
            r5 = r4 & 19
            r6 = 18
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L30
            r5 = r8
            goto L31
        L30:
            r5 = r7
        L31:
            r6 = r4 & 1
            boolean r5 = r3.S(r6, r5)
            if (r5 == 0) goto L152
            r13 = 0
            r14 = 10
            x64 r9 = defpackage.x64.a
            r10 = 1098907648(0x41800000, float:16.0)
            r11 = 0
            r12 = 1090519040(0x41000000, float:8.0)
            a74 r5 = defpackage.ge7.S(r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r3.P()
            vs0 r10 = defpackage.ox0.a
            if (r6 != r10) goto L59
            fc r6 = new fc
            r10 = 11
            r6.<init>(r10)
            r3.l0(r6)
        L59:
            e34 r6 = (defpackage.e34) r6
            int r10 = defpackage.ge7.B(r3)
            xv4 r11 = r3.l()
            a74 r5 = defpackage.l.E(r3, r5)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r3.f0()
            boolean r13 = r3.S
            if (r13 == 0) goto L79
            r3.k(r12)
            goto L7c
        L79:
            r3.o0()
        L7c:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r3, r13, r6)
            pn r6 = defpackage.ix0.e
            defpackage.yh2.K(r3, r6, r11)
            pn r11 = defpackage.ix0.g
            boolean r14 = r3.S
            if (r14 != 0) goto L9a
            java.lang.Object r14 = r3.P()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 != 0) goto L9d
        L9a:
            defpackage.i61.v(r10, r3, r10, r11)
        L9d:
            pn r10 = defpackage.ix0.d
            defpackage.yh2.K(r3, r10, r5)
            java.lang.String r5 = "text"
            a74 r5 = defpackage.lb4.D(r9, r5)
            r14 = 0
            r15 = 1086324736(0x40c00000, float:6.0)
            a74 r5 = defpackage.ge7.Q(r5, r14, r15, r8)
            e40 r14 = defpackage.d90.L
            e34 r15 = defpackage.h70.d(r14, r7)
            int r7 = defpackage.ge7.B(r3)
            xv4 r8 = r3.l()
            a74 r5 = defpackage.l.E(r3, r5)
            r3.f0()
            r16 = r4
            boolean r4 = r3.S
            if (r4 == 0) goto Lce
            r3.k(r12)
            goto Ld1
        Lce:
            r3.o0()
        Ld1:
            defpackage.yh2.K(r3, r13, r15)
            defpackage.yh2.K(r3, r6, r8)
            boolean r4 = r3.S
            if (r4 != 0) goto Le9
            java.lang.Object r4 = r3.P()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r4 = defpackage.nb3.k(r4, r8)
            if (r4 != 0) goto Lec
        Le9:
            defpackage.i61.v(r7, r3, r7, r11)
        Lec:
            defpackage.yh2.K(r3, r10, r5)
            r4 = r16 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.o(r3, r4)
            r4 = 1
            r3.p(r4)
            java.lang.String r4 = "action"
            a74 r4 = defpackage.lb4.D(r9, r4)
            r5 = 0
            e34 r5 = defpackage.h70.d(r14, r5)
            int r7 = defpackage.ge7.B(r3)
            xv4 r8 = r3.l()
            a74 r4 = defpackage.l.E(r3, r4)
            r3.f0()
            boolean r9 = r3.S
            if (r9 == 0) goto L11e
            r3.k(r12)
            goto L121
        L11e:
            r3.o0()
        L121:
            defpackage.yh2.K(r3, r13, r5)
            defpackage.yh2.K(r3, r6, r8)
            boolean r5 = r3.S
            if (r5 != 0) goto L139
            java.lang.Object r5 = r3.P()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r5 = defpackage.nb3.k(r5, r6)
            if (r5 != 0) goto L13c
        L139:
            defpackage.i61.v(r7, r3, r7, r11)
        L13c:
            defpackage.yh2.K(r3, r10, r4)
            int r4 = r16 >> 3
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.o(r3, r4)
            r4 = 1
            r3.p(r4)
            r3.p(r4)
            goto L155
        L152:
            r3.V()
        L155:
            cf5 r3 = r3.t()
            if (r3 == 0) goto L162
            hl6 r4 = new hl6
            r4.<init>(r0, r1, r2)
            r3.d = r4
        L162:
            return
    }

    public static final void h(defpackage.qe4 r57, defpackage.on2 r58, defpackage.px0 r59, int r60) {
            r0 = r57
            r1 = r58
            r8 = r59
            xq2 r8 = (defpackage.xq2) r8
            r3 = -860293387(0xffffffffccb8f6f5, float:-9.697476E7)
            r8.d0(r3)
            boolean r3 = r8.f(r0)
            r11 = 4
            if (r3 == 0) goto L17
            r3 = r11
            goto L18
        L17:
            r3 = 2
        L18:
            r3 = r60 | r3
            boolean r4 = r8.h(r1)
            r12 = 32
            if (r4 == 0) goto L24
            r4 = r12
            goto L26
        L24:
            r4 = 16
        L26:
            r3 = r3 | r4
            r4 = r3 & 19
            r5 = 18
            r13 = 0
            if (r4 == r5) goto L30
            r4 = 1
            goto L31
        L30:
            r4 = r13
        L31:
            r5 = r3 & 1
            boolean r4 = r8.S(r5, r4)
            if (r4 == 0) goto L411
            nq6 r4 = defpackage.kf.b
            java.lang.Object r4 = r8.j(r4)
            r15 = r4
            android.content.Context r15 = (android.content.Context) r15
            x64 r4 = defpackage.x64.a
            r5 = 1065353216(0x3f800000, float:1.0)
            a74 r6 = defpackage.dj6.c(r4, r5)
            r7 = 1096810496(0x41600000, float:14.0)
            y16 r9 = defpackage.z16.b(r7)
            a74 r6 = defpackage.u24.g(r6, r9)
            r9 = 4280165427(0xff1e2433, double:2.114682696E-314)
            long r9 = defpackage.hv.c(r9)
            jy2 r14 = defpackage.u24.m
            a74 r6 = defpackage.vy7.L(r6, r9, r14)
            boolean r9 = r8.h(r15)
            r10 = r3 & 14
            if (r10 != r11) goto L6e
            r16 = 1
            goto L70
        L6e:
            r16 = r13
        L70:
            r9 = r9 | r16
            r3 = r3 & 112(0x70, float:1.57E-43)
            if (r3 != r12) goto L79
            r16 = 1
            goto L7b
        L79:
            r16 = r13
        L7b:
            r9 = r9 | r16
            java.lang.Object r5 = r8.P()
            vs0 r11 = defpackage.ox0.a
            if (r9 != 0) goto L87
            if (r5 != r11) goto L8f
        L87:
            me4 r5 = new me4
            r5.<init>(r15, r0, r1, r13)
            r8.l0(r5)
        L8f:
            on2 r5 = (defpackage.on2) r5
            r9 = 0
            r18 = r11
            r11 = 15
            a74 r5 = defpackage.mb3.u(r6, r13, r9, r5, r11)
            a74 r5 = defpackage.ge7.O(r5, r7)
            d40 r6 = defpackage.d90.i0
            du r7 = defpackage.ju.a
            r9 = 48
            l26 r6 = defpackage.k26.a(r7, r6, r8, r9)
            long r11 = r8.T
            int r7 = java.lang.Long.hashCode(r11)
            xv4 r9 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            ix0 r11 = defpackage.jx0.i
            r11.getClass()
            iy0 r11 = defpackage.ix0.b
            r8.f0()
            boolean r12 = r8.S
            if (r12 == 0) goto Lc8
            r8.k(r11)
            goto Lcb
        Lc8:
            r8.o0()
        Lcb:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r8, r12, r6)
            pn r6 = defpackage.ix0.e
            defpackage.yh2.K(r8, r6, r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r8, r9, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r8, r7)
            r22 = r15
            pn r15 = defpackage.ix0.d
            defpackage.yh2.K(r8, r15, r5)
            r5 = 1108869120(0x42180000, float:38.0)
            a74 r5 = defpackage.dj6.i(r4, r5)
            y16 r13 = defpackage.z16.a
            a74 r5 = defpackage.u24.g(r5, r13)
            r26 = 4278248959(0xff00e5ff, double:2.113735835E-314)
            r13 = r3
            long r2 = defpackage.hv.c(r26)
            r24 = r10
            r10 = 1043878380(0x3e3851ec, float:0.18)
            long r2 = defpackage.kt0.c(r10, r2)
            a74 r2 = defpackage.vy7.L(r5, r2, r14)
            e40 r3 = defpackage.d90.Z
            r5 = 0
            e34 r3 = defpackage.h70.d(r3, r5)
            r5 = r13
            r25 = r14
            long r13 = r8.T
            int r10 = java.lang.Long.hashCode(r13)
            xv4 r13 = r8.l()
            a74 r2 = defpackage.l.E(r8, r2)
            r8.f0()
            boolean r14 = r8.S
            if (r14 == 0) goto L130
            r8.k(r11)
            goto L133
        L130:
            r8.o0()
        L133:
            defpackage.yh2.K(r8, r12, r3)
            defpackage.yh2.K(r8, r6, r13)
            defpackage.i61.w(r10, r8, r9, r8, r7)
            defpackage.yh2.K(r8, r15, r2)
            e33 r3 = defpackage.dt7.a()
            r2 = r6
            r10 = r7
            long r6 = defpackage.hv.c(r26)
            r13 = 1101004800(0x41a00000, float:20.0)
            a74 r13 = defpackage.dj6.i(r4, r13)
            r14 = r9
            r9 = 3504(0xdb0, float:4.91E-42)
            r28 = r10
            r10 = 0
            r29 = r4
            r4 = 0
            r16 = r5
            r5 = r13
            r13 = r14
            r1 = r28
            r14 = r2
            r28 = r24
            r2 = r29
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r3 = 1
            r8.p(r3)
            r4 = 1094713344(0x41400000, float:12.0)
            a74 r5 = defpackage.dj6.l(r2, r4)
            defpackage.gi2.h(r8, r5)
            vn3 r5 = new vn3
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r3)
            eu r6 = defpackage.ju.c
            c40 r7 = defpackage.d90.k0
            r9 = 0
            yt0 r6 = defpackage.wt0.a(r6, r7, r8, r9)
            long r3 = r8.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            r8.f0()
            boolean r10 = r8.S
            if (r10 == 0) goto L19c
            r8.k(r11)
            goto L19f
        L19c:
            r8.o0()
        L19f:
            defpackage.yh2.K(r8, r12, r6)
            defpackage.yh2.K(r8, r14, r4)
            defpackage.i61.w(r3, r8, r13, r8, r1)
            defpackage.yh2.K(r8, r15, r5)
            java.lang.String r3 = r0.b
            int r4 = r0.g
            java.lang.String r5 = "'s Match"
            java.lang.String r3 = r3.concat(r5)
            long r5 = defpackage.kt0.d
            pi2 r10 = defpackage.qs7.a
            r19 = 13
            long r23 = defpackage.hi2.E(r19)
            r19 = r9
            oj2 r9 = defpackage.oj2.e0
            r29 = r22
            r22 = r8
            r7 = r23
            r23 = r29
            r29 = 1094713344(0x41400000, float:12.0)
            r24 = 0
            r30 = r25
            r25 = 130962(0x1ff92, float:1.83517E-40)
            r31 = r4
            r4 = 0
            r32 = r11
            r33 = r12
            r11 = 0
            r34 = r13
            r13 = 0
            r35 = r14
            r36 = r15
            r14 = 0
            r37 = r16
            r16 = 0
            r38 = 4
            r17 = 0
            r39 = r18
            r18 = 0
            r40 = r19
            r19 = 0
            r41 = 32
            r20 = 0
            r42 = 15
            r21 = 0
            r43 = r23
            r23 = 1772928(0x1b0d80, float:2.484401E-39)
            r29 = r1
            r44 = r2
            r49 = r31
            r2 = r32
            r47 = r34
            r46 = r35
            r48 = r36
            r45 = r37
            r50 = r39
            r1 = 1
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r31 = r9
            java.lang.String r3 = r0.c
            java.lang.String r4 = r0.d
            java.lang.String r7 = " • "
            java.lang.String r3 = defpackage.lb1.m(r3, r7, r4)
            r4 = 1058642330(0x3f19999a, float:0.6)
            long r5 = defpackage.kt0.c(r4, r5)
            sr2 r10 = defpackage.qs7.c
            r7 = 4621537642612260864(0x4023000000000000, double:9.5)
            long r7 = defpackage.hi2.D(r7)
            r25 = 130994(0x1ffb2, float:1.83562E-40)
            r4 = 0
            r9 = 0
            r23 = 1576320(0x180d80, float:2.208895E-39)
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = r22
            r20 = 0
            r21 = 13
            r17 = 0
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 0
            r16 = r44
            a74 r3 = defpackage.ge7.S(r16, r17, r18, r19, r20, r21)
            gu r4 = new gu
            i r5 = new i
            r5.<init>(r1)
            r6 = 1090519040(0x41000000, float:8.0)
            r4.<init>(r6, r1, r5)
            d40 r5 = defpackage.d90.h0
            r7 = 6
            l26 r4 = defpackage.k26.a(r4, r5, r8, r7)
            long r11 = r8.T
            int r5 = java.lang.Long.hashCode(r11)
            xv4 r7 = r8.l()
            a74 r3 = defpackage.l.E(r8, r3)
            r8.f0()
            boolean r9 = r8.S
            if (r9 == 0) goto L27f
            r8.k(r2)
        L27c:
            r9 = r33
            goto L283
        L27f:
            r8.o0()
            goto L27c
        L283:
            defpackage.yh2.K(r8, r9, r4)
            r4 = r46
            defpackage.yh2.K(r8, r4, r7)
            r11 = r29
            r7 = r47
            defpackage.i61.w(r5, r8, r7, r8, r11)
            r5 = r48
            defpackage.yh2.K(r8, r5, r3)
            int r3 = r0.e
            int r12 = r0.f
            java.lang.String r13 = "Игроки: "
            java.lang.String r14 = "/"
            java.lang.String r3 = defpackage.lb1.j(r13, r3, r12, r14)
            r32 = 4279286145(0xff10b981, double:2.114248273E-314)
            r12 = r6
            long r5 = defpackage.hv.c(r32)
            r29 = 9
            r13 = r7
            r22 = r8
            long r7 = defpackage.hi2.E(r29)
            r24 = 0
            r25 = 130962(0x1ff92, float:1.83517E-40)
            r14 = r4
            r4 = 0
            r15 = r11
            r16 = r12
            r11 = 0
            r47 = r13
            r13 = 0
            r46 = r14
            r17 = r15
            r14 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r23 = r20
            r20 = 0
            r34 = r21
            r21 = 0
            r35 = r23
            r23 = 1772928(0x1b0d80, float:2.484401E-39)
            r51 = r9
            r9 = r31
            r54 = r34
            r56 = r44
            r52 = r46
            r53 = r47
            r55 = r48
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r49
            r3.append(r4)
            java.lang.String r5 = " ms"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 30
            if (r4 >= r5) goto L316
            long r4 = defpackage.hv.c(r32)
        L314:
            r5 = r4
            goto L320
        L316:
            r4 = 4294688548(0xfffbbf24, double:2.121858071E-314)
            long r4 = defpackage.hv.c(r4)
            goto L314
        L320:
            long r7 = defpackage.hi2.E(r29)
            r24 = 0
            r25 = 130994(0x1ffb2, float:1.83562E-40)
            r4 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 1575936(0x180c00, float:2.208357E-39)
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = r22
            r8.p(r1)
            r8.p(r1)
            y16 r3 = defpackage.z16.b(r35)
            r4 = r56
            a74 r3 = defpackage.u24.g(r4, r3)
            long r4 = defpackage.hv.c(r26)
            r6 = r30
            a74 r3 = defpackage.vy7.L(r3, r4, r6)
            r4 = r43
            boolean r5 = r8.h(r4)
            r6 = r28
            r7 = 4
            if (r6 != r7) goto L36b
            r13 = r1
            goto L36c
        L36b:
            r13 = 0
        L36c:
            r5 = r5 | r13
            r13 = r45
            r6 = 32
            if (r13 != r6) goto L375
            r13 = r1
            goto L376
        L375:
            r13 = 0
        L376:
            r5 = r5 | r13
            java.lang.Object r6 = r8.P()
            if (r5 != 0) goto L385
            r5 = r50
            if (r6 != r5) goto L382
            goto L385
        L382:
            r5 = r58
            goto L38f
        L385:
            me4 r6 = new me4
            r5 = r58
            r6.<init>(r4, r0, r5, r1)
            r8.l0(r6)
        L38f:
            on2 r6 = (defpackage.on2) r6
            r4 = 15
            r7 = 0
            r9 = 0
            a74 r3 = defpackage.mb3.u(r3, r9, r7, r6, r4)
            r4 = 1086324736(0x40c00000, float:6.0)
            r7 = 1094713344(0x41400000, float:12.0)
            a74 r3 = defpackage.ge7.P(r3, r7, r4)
            e40 r4 = defpackage.d90.L
            e34 r4 = defpackage.h70.d(r4, r9)
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r8.l()
            a74 r3 = defpackage.l.E(r8, r3)
            r8.f0()
            boolean r9 = r8.S
            if (r9 == 0) goto L3c2
            r8.k(r2)
        L3bf:
            r9 = r51
            goto L3c6
        L3c2:
            r8.o0()
            goto L3bf
        L3c6:
            defpackage.yh2.K(r8, r9, r4)
            r14 = r52
            defpackage.yh2.K(r8, r14, r7)
            r13 = r53
            r15 = r54
            defpackage.i61.w(r6, r8, r13, r8, r15)
            r2 = r55
            defpackage.yh2.K(r8, r2, r3)
            long r5 = defpackage.kt0.b
            r2 = 10
            long r2 = defpackage.hi2.E(r2)
            r24 = 0
            r25 = 130962(0x1ff92, float:1.83517E-40)
            r22 = r8
            r7 = r2
            java.lang.String r3 = "ВОЙТИ"
            r4 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 1772934(0x1b0d86, float:2.48441E-39)
            r2 = r58
            r9 = r31
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = r22
            r8.p(r1)
            r8.p(r1)
            goto L415
        L411:
            r2 = r1
            r8.V()
        L415:
            cf5 r1 = r8.t()
            if (r1 == 0) goto L426
            ql1 r3 = new ql1
            r4 = 26
            r5 = r60
            r3.<init>(r0, r5, r4, r2)
            r1.d = r3
        L426:
            return
    }

    public static final void i(defpackage.a74 r22, defpackage.eo2 r23, defpackage.ke6 r24, long r25, long r27, float r29, defpackage.zv0 r30, defpackage.px0 r31, int r32) {
            r2 = r23
            r9 = r30
            r10 = r32
            r0 = r31
            xq2 r0 = (defpackage.xq2) r0
            r1 = -662779944(0xffffffffd87ec7d8, float:-1.1205371E15)
            r0.d0(r1)
            r1 = r10 & 6
            r11 = r22
            if (r1 != 0) goto L21
            boolean r1 = r0.f(r11)
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = 2
        L1f:
            r1 = r1 | r10
            goto L22
        L21:
            r1 = r10
        L22:
            r3 = r10 & 48
            if (r3 != 0) goto L32
            boolean r3 = r0.h(r2)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r1 = r1 | r3
        L32:
            r3 = r10 & 384(0x180, float:5.38E-43)
            r4 = 0
            if (r3 != 0) goto L43
            boolean r3 = r0.g(r4)
            if (r3 == 0) goto L40
            r3 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r3 = 128(0x80, float:1.8E-43)
        L42:
            r1 = r1 | r3
        L43:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            r12 = r24
            if (r3 != 0) goto L55
            boolean r3 = r0.f(r12)
            if (r3 == 0) goto L52
            r3 = 2048(0x800, float:2.87E-42)
            goto L54
        L52:
            r3 = 1024(0x400, float:1.435E-42)
        L54:
            r1 = r1 | r3
        L55:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            r13 = r25
            if (r3 != 0) goto L67
            boolean r3 = r0.e(r13)
            if (r3 == 0) goto L64
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L66
        L64:
            r3 = 8192(0x2000, float:1.148E-41)
        L66:
            r1 = r1 | r3
        L67:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r10
            r6 = r27
            if (r3 != 0) goto L7a
            boolean r3 = r0.e(r6)
            if (r3 == 0) goto L77
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L79
        L77:
            r3 = 65536(0x10000, float:9.1835E-41)
        L79:
            r1 = r1 | r3
        L7a:
            r3 = 1572864(0x180000, float:2.204052E-39)
            r5 = r10 & r3
            r8 = r29
            if (r5 != 0) goto L8e
            boolean r5 = r0.c(r8)
            if (r5 == 0) goto L8b
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L8d
        L8b:
            r5 = 524288(0x80000, float:7.34684E-40)
        L8d:
            r1 = r1 | r5
        L8e:
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 & r10
            if (r5 != 0) goto L9f
            boolean r5 = r0.h(r9)
            if (r5 == 0) goto L9c
            r5 = 8388608(0x800000, float:1.1754944E-38)
            goto L9e
        L9c:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L9e:
            r1 = r1 | r5
        L9f:
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r5 & r1
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r5 == r15) goto La9
            r4 = 1
        La9:
            r5 = r1 & 1
            boolean r4 = r0.S(r5, r4)
            if (r4 == 0) goto Lf1
            r0.X()
            r4 = r10 & 1
            if (r4 == 0) goto Lc2
            boolean r4 = r0.B()
            if (r4 == 0) goto Lbf
            goto Lc2
        Lbf:
            r0.V()
        Lc2:
            r0.q()
            hl6 r4 = new hl6
            r5 = 3
            r4.<init>(r2, r9, r5)
            r15 = -1429068516(0xffffffffaad2251c, float:-3.7329243E-13)
            zv0 r18 = defpackage.n16.I(r15, r4, r0)
            r4 = r1 & 14
            r3 = r3 | r4
            int r4 = r1 >> 6
            r15 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r15
            r15 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r15
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 >> r5
            r1 = r1 & r4
            r20 = r3 | r1
            r21 = 16
            r19 = r0
            r15 = r6
            r17 = r8
            defpackage.ej2.c(r11, r12, r13, r15, r17, r18, r19, r20, r21)
            goto Lf6
        Lf1:
            r19 = r0
            r19.V()
        Lf6:
            cf5 r11 = r19.t()
            if (r11 == 0) goto L10d
            dq r0 = new dq
            r1 = r22
            r3 = r24
            r4 = r25
            r6 = r27
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10)
            r11.d = r0
        L10d:
            return
    }

    public static final void j(defpackage.el6 r23, defpackage.a74 r24, defpackage.ke6 r25, long r26, long r28, long r30, float r32, defpackage.px0 r33, int r34) {
            r1 = r23
            r11 = r34
            r0 = r33
            xq2 r0 = (defpackage.xq2) r0
            r2 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            r0.d0(r2)
            r2 = r11 & 6
            if (r2 != 0) goto L26
            r2 = r11 & 8
            if (r2 != 0) goto L1b
            boolean r2 = r0.f(r1)
            goto L1f
        L1b:
            boolean r2 = r0.h(r1)
        L1f:
            if (r2 == 0) goto L23
            r2 = 4
            goto L24
        L23:
            r2 = 2
        L24:
            r2 = r2 | r11
            goto L27
        L26:
            r2 = r11
        L27:
            r3 = r2 | 432(0x1b0, float:6.05E-43)
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L2f
            r3 = r2 | 1456(0x5b0, float:2.04E-42)
        L2f:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L35
            r3 = r3 | 8192(0x2000, float:1.148E-41)
        L35:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r11
            if (r2 != 0) goto L3d
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = r3 | r2
        L3d:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r11
            if (r2 != 0) goto L45
            r2 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r2
        L45:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r2
            r4 = 4793491(0x492493, float:6.717112E-39)
            r4 = r4 & r3
            r5 = 4793490(0x492492, float:6.71711E-39)
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L55
            r4 = r7
            goto L56
        L55:
            r4 = r6
        L56:
            r5 = r3 & 1
            boolean r4 = r0.S(r5, r4)
            if (r4 == 0) goto L145
            r0.X()
            r4 = r11 & 1
            r5 = -4193281(0xffffffffffc003ff, float:NaN)
            if (r4 == 0) goto L83
            boolean r4 = r0.B()
            if (r4 == 0) goto L6f
            goto L83
        L6f:
            r0.V()
            r3 = r3 & r5
            r8 = r24
            r14 = r25
            r15 = r26
            r17 = r28
            r19 = r32
            r33 = r2
            r5 = r3
            r2 = r30
            goto Lf0
        L83:
            nq6 r4 = defpackage.ze6.a
            java.lang.Object r4 = r0.j(r4)
            ye6 r4 = (defpackage.ye6) r4
            y16 r4 = r4.a
            nq6 r8 = defpackage.vt0.a
            java.lang.Object r9 = r0.j(r8)
            ut0 r9 = (defpackage.ut0) r9
            long r9 = r9.f()
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            long r9 = defpackage.kt0.c(r12, r9)
            java.lang.Object r12 = r0.j(r8)
            ut0 r12 = (defpackage.ut0) r12
            long r12 = r12.j()
            long r9 = defpackage.hv.l(r9, r12)
            java.lang.Object r12 = r0.j(r8)
            ut0 r12 = (defpackage.ut0) r12
            long r12 = r12.j()
            java.lang.Object r8 = r0.j(r8)
            ut0 r8 = (defpackage.ut0) r8
            boolean r14 = r8.k()
            if (r14 == 0) goto Ldc
            long r14 = r8.g()
            r33 = r2
            r16 = r3
            long r2 = r8.j()
            r8 = 1058642330(0x3f19999a, float:0.6)
            long r2 = defpackage.kt0.c(r8, r2)
            long r2 = defpackage.hv.l(r2, r14)
            goto Le4
        Ldc:
            r33 = r2
            r16 = r3
            long r2 = r8.h()
        Le4:
            r5 = r16 & r5
            x64 r8 = defpackage.x64.a
            r14 = 1086324736(0x40c00000, float:6.0)
            r15 = r9
            r17 = r12
            r19 = r14
            r14 = r4
        Lf0:
            r0.q()
            java.lang.String r4 = r1.b
            if (r4 == 0) goto L10e
            r9 = 593497188(0x23600c64, float:1.2145688E-17)
            r0.b0(r9)
            i7 r9 = new i7
            r9.<init>(r2, r1, r4)
            r4 = 1843479216(0x6de142b0, float:8.7143434E27)
            zv0 r4 = defpackage.n16.I(r4, r9, r0)
            r0.p(r6)
        L10c:
            r13 = r4
            goto L119
        L10e:
            r4 = 593796152(0x23649c38, float:1.2392985E-17)
            r0.b0(r4)
            r0.p(r6)
            r4 = 0
            goto L10c
        L119:
            r4 = 1094713344(0x41400000, float:12.0)
            a74 r12 = defpackage.ge7.O(r8, r4)
            bl6 r4 = new bl6
            r4.<init>(r1, r7)
            r6 = -261845785(0xfffffffff0648ce7, float:-2.829317E29)
            zv0 r20 = defpackage.n16.I(r6, r4, r0)
            r4 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r33
            int r5 = r5 >> 3
            r6 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r6
            r22 = r4 | r5
            r21 = r0
            i(r12, r13, r14, r15, r17, r19, r20, r21, r22)
            r4 = r2
            r2 = r8
            r8 = r4
            r3 = r14
            r4 = r15
            r6 = r17
            r10 = r19
            goto L156
        L145:
            r21 = r0
            r21.V()
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r28
            r8 = r30
            r10 = r32
        L156:
            cf5 r12 = r21.t()
            if (r12 == 0) goto L163
            il6 r0 = new il6
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11)
            r12.d = r0
        L163:
            return
    }

    public static final void k(boolean r16, defpackage.jl5 r17, defpackage.p27 r18, defpackage.px0 r19, int r20) {
            r1 = r16
            r10 = r18
            r11 = r20
            r8 = r19
            xq2 r8 = (defpackage.xq2) r8
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            r8.d0(r0)
            r0 = r11 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r8.g(r1)
            if (r0 == 0) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r0 | r11
            goto L21
        L20:
            r0 = r11
        L21:
            r3 = r11 & 48
            r4 = 32
            if (r3 != 0) goto L36
            int r3 = r17.ordinal()
            boolean r3 = r8.d(r3)
            if (r3 == 0) goto L33
            r3 = r4
            goto L35
        L33:
            r3 = 16
        L35:
            r0 = r0 | r3
        L36:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L46
            boolean r3 = r8.h(r10)
            if (r3 == 0) goto L43
            r3 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r3 = 128(0x80, float:1.8E-43)
        L45:
            r0 = r0 | r3
        L46:
            r3 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 0
            r7 = 1
            if (r3 == r5) goto L50
            r3 = r7
            goto L51
        L50:
            r3 = r6
        L51:
            r5 = r0 & 1
            boolean r3 = r8.S(r5, r3)
            if (r3 == 0) goto L13e
            r3 = r0 & 14
            if (r3 != r2) goto L5f
            r5 = r7
            goto L60
        L5f:
            r5 = r6
        L60:
            boolean r9 = r8.f(r10)
            r5 = r5 | r9
            java.lang.Object r9 = r8.P()
            vs0 r12 = defpackage.ox0.a
            if (r5 != 0) goto L6f
            if (r9 != r12) goto L77
        L6f:
            m27 r9 = new m27
            r9.<init>(r10, r1)
            r8.l0(r9)
        L77:
            g17 r9 = (defpackage.g17) r9
            boolean r5 = r8.h(r10)
            if (r3 != r2) goto L81
            r2 = r7
            goto L82
        L81:
            r2 = r6
        L82:
            r2 = r2 | r5
            java.lang.Object r3 = r8.P()
            if (r2 != 0) goto L8b
            if (r3 != r12) goto L93
        L8b:
            q27 r3 = new q27
            r3.<init>(r10, r1)
            r8.l0(r3)
        L93:
            ok4 r3 = (defpackage.ok4) r3
            c37 r2 = r10.n()
            long r13 = r2.b
            boolean r2 = defpackage.k47.g(r13)
            if (r1 == 0) goto Lab
            c37 r5 = r10.n()
            long r13 = r5.b
            long r4 = r13 >> r4
        La9:
            int r4 = (int) r4
            goto Lb8
        Lab:
            c37 r4 = r10.n()
            long r4 = r4.b
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r13
            goto La9
        Lb8:
            jt3 r5 = r10.d
            r13 = 0
            if (r5 == 0) goto L112
            b47 r5 = r5.d()
            if (r5 == 0) goto L112
            a47 r5 = r5.a
            if (r4 < 0) goto L112
            z37 r14 = r5.a
            v84 r5 = r5.b
            fp r14 = r14.a
            java.lang.String r14 = r14.B
            int r14 = r14.length()
            if (r14 != 0) goto Ld6
            goto L112
        Ld6:
            int r14 = r5.d(r4)
            int r15 = r5.b
            int r15 = r15 - r7
            r19 = r7
            int r7 = r5.f
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r15, r7)
            int r7 = java.lang.Math.min(r14, r7)
            int r6 = r5.c(r7, r6)
            if (r4 <= r6) goto Lf2
            goto L112
        Lf2:
            r5.m(r7)
            java.util.ArrayList r4 = r5.h
            int r5 = defpackage.uj2.A(r7, r4)
            java.lang.Object r4 = r4.get(r5)
            yr4 r4 = (defpackage.yr4) r4
            cj r5 = r4.a
            int r4 = r4.d
            int r7 = r7 - r4
            y37 r4 = r5.d
            float r5 = r4.e(r7)
            float r4 = r4.g(r7)
            float r13 = r5 - r4
        L112:
            r6 = r13
            boolean r4 = r8.h(r9)
            java.lang.Object r5 = r8.P()
            if (r4 != 0) goto L11f
            if (r5 != r12) goto L128
        L11f:
            rg r5 = new rg
            r4 = 7
            r5.<init>(r9, r4)
            r8.l0(r5)
        L128:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r5
            x64 r4 = defpackage.x64.a
            a74 r7 = defpackage.jw6.a(r4, r9, r5)
            int r0 = r0 << 3
            r9 = r0 & 1008(0x3f0, float:1.413E-42)
            r4 = 0
            r0 = r3
            r3 = r2
            r2 = r17
            defpackage.mb3.l(r0, r1, r2, r3, r4, r6, r7, r8, r9)
            goto L141
        L13e:
            r8.V()
        L141:
            cf5 r0 = r8.t()
            if (r0 == 0) goto L150
            yl r2 = new yl
            r3 = r17
            r2.<init>(r1, r3, r10, r11)
            r0.d = r2
        L150:
            return
    }

    public static final void l(defpackage.zv0 r12, defpackage.px0 r13, int r14) {
            xq2 r13 = (defpackage.xq2) r13
            r0 = 343813818(0x147e2eba, float:1.2832938E-26)
            r13.d0(r0)
            boolean r0 = r13.h(r12)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r14
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L1b
            r1 = r4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r2 = r0 & 1
            boolean r1 = r13.S(r2, r1)
            if (r1 == 0) goto Ld2
            java.lang.Object r1 = r13.P()
            vs0 r2 = defpackage.ox0.a
            if (r1 != r2) goto L31
            fc r1 = defpackage.fc.l
            r13.l0(r1)
        L31:
            e34 r1 = (defpackage.e34) r1
            int r2 = defpackage.ge7.B(r13)
            xv4 r5 = r13.l()
            x64 r6 = defpackage.x64.a
            a74 r7 = defpackage.l.E(r13, r6)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r13.f0()
            boolean r9 = r13.S
            if (r9 == 0) goto L53
            r13.k(r8)
            goto L56
        L53:
            r13.o0()
        L56:
            pn r9 = defpackage.ix0.f
            defpackage.yh2.K(r13, r9, r1)
            pn r1 = defpackage.ix0.e
            defpackage.yh2.K(r13, r1, r5)
            pn r5 = defpackage.ix0.g
            boolean r10 = r13.S
            if (r10 != 0) goto L74
            java.lang.Object r10 = r13.P()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 != 0) goto L77
        L74:
            defpackage.i61.v(r2, r13, r2, r5)
        L77:
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r13, r2, r7)
            r7 = 1098907648(0x41800000, float:16.0)
            r10 = 1086324736(0x40c00000, float:6.0)
            a74 r6 = defpackage.ge7.P(r6, r7, r10)
            e40 r7 = defpackage.d90.L
            e34 r3 = defpackage.h70.d(r7, r3)
            int r7 = defpackage.ge7.B(r13)
            xv4 r10 = r13.l()
            a74 r6 = defpackage.l.E(r13, r6)
            r13.f0()
            boolean r11 = r13.S
            if (r11 == 0) goto La1
            r13.k(r8)
            goto La4
        La1:
            r13.o0()
        La4:
            defpackage.yh2.K(r13, r9, r3)
            defpackage.yh2.K(r13, r1, r10)
            boolean r1 = r13.S
            if (r1 != 0) goto Lbc
            java.lang.Object r1 = r13.P()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Lbf
        Lbc:
            defpackage.i61.v(r7, r13, r7, r5)
        Lbf:
            defpackage.yh2.K(r13, r2, r6)
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.o(r13, r0)
            r13.p(r4)
            r13.p(r4)
            goto Ld5
        Ld2:
            r13.V()
        Ld5:
            cf5 r13 = r13.t()
            if (r13 == 0) goto Le4
            eq r0 = new eq
            r1 = 10
            r0.<init>(r12, r14, r1)
            r13.d = r0
        Le4:
            return
    }

    public static defpackage.v65 m(android.content.Context r4, android.os.Bundle r5) {
            java.lang.String r0 = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED"
            r1 = 1
            boolean r0 = r5.getBoolean(r0, r1)
            java.lang.String r1 = "androidx.camera.core.quirks.FORCE_ENABLED"
            java.lang.String[] r1 = K(r4, r1, r5)
            java.lang.String r2 = "androidx.camera.core.quirks.FORCE_DISABLED"
            java.lang.String[] r4 = K(r4, r2, r5)
            java.lang.String r5 = "Loaded quirk settings from metadata:"
            java.lang.String r2 = "QuirkSettingsLoader"
            defpackage.kj2.t(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "  KEY_DEFAULT_QUIRK_ENABLED = "
            r5.<init>(r3)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            defpackage.kj2.t(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "  KEY_QUIRK_FORCE_ENABLED = "
            r5.<init>(r3)
            java.lang.String r3 = java.util.Arrays.toString(r1)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            defpackage.kj2.t(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "  KEY_QUIRK_FORCE_DISABLED = "
            r5.<init>(r3)
            java.lang.String r3 = java.util.Arrays.toString(r4)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            defpackage.kj2.t(r2, r5)
            java.util.HashSet r5 = O(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r5)
            java.util.HashSet r4 = O(r4)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            v65 r4 = new v65
            r4.<init>(r0, r1, r5)
            return r4
    }

    public static final void n(android.view.View r3) {
            r3.getClass()
            qg r0 = new qg
            r1 = 0
            r2 = 3
            r0.<init>(r3, r1, r2)
            rb6 r3 = defpackage.qo2.C(r0)
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            android.view.View r0 = (android.view.View) r0
            sz4 r0 = D(r0)
            java.util.ArrayList r0 = r0.a
            int r1 = defpackage.hf.U(r0)
        L24:
            r2 = -1
            if (r2 >= r1) goto Le
            java.lang.Object r2 = r0.get(r1)
            do7 r2 = (defpackage.do7) r2
            p0 r2 = r2.a
            r2.e()
            int r1 = r1 + (-1)
            goto L24
        L35:
            return
    }

    public static java.lang.String s(java.io.File r6) {
            r6.getClass()
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto La
            goto L50
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r1) goto L22
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L1f
            r0.add(r4)
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r6.length
        L28:
            if (r2 >= r3) goto L38
            r4 = r6[r2]
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L35
            r1.add(r4)
        L35:
            int r2 = r2 + 1
            goto L28
        L38:
            int r6 = r0.size()
            r2 = 1
            if (r6 != r2) goto L50
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L50
            java.lang.Object r6 = defpackage.gt0.H0(r0)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getName()
            return r6
        L50:
            r6 = 0
            return r6
    }

    public static final defpackage.of5 t(defpackage.z64 r1, boolean r2, boolean r3) {
            z64 r0 = r1.A
            boolean r0 = r0.j0
            if (r0 != 0) goto L9
            of5 r1 = defpackage.of5.e
            return r1
        L9:
            r0 = 8
            if (r2 != 0) goto L1a
            eg4 r1 = defpackage.nc1.d0(r1, r0)
            jk3 r2 = defpackage.ej2.w(r1)
            of5 r1 = r2.O(r1, r3)
            return r1
        L1a:
            eg4 r1 = defpackage.nc1.d0(r1, r0)
            of5 r1 = r1.u1()
            return r1
    }

    public static final boolean u(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static void v(java.io.File r10, java.io.File r11, defpackage.no3 r12, defpackage.ap5 r13) {
            defpackage.jc2.x0(r11)
            r11.mkdirs()
            java.io.File r11 = r11.getCanonicalFile()
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> Lbd
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lbd
            int r10 = r0.size()     // Catch: java.lang.Throwable -> L66
            java.util.Enumeration r1 = r0.entries()     // Catch: java.lang.Throwable -> L66
            r2 = 0
            r3 = r2
        L19:
            boolean r4 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto Lb3
            l61 r4 = r13.B     // Catch: java.lang.Throwable -> L66
            r4.getClass()     // Catch: java.lang.Throwable -> L66
            defpackage.yh2.o(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r1.nextElement()     // Catch: java.lang.Throwable -> L66
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch: java.lang.Throwable -> L66
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r11, r6)     // Catch: java.lang.Throwable -> L66
            java.io.File r5 = r5.getCanonicalFile()     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = r5.getPath()     // Catch: java.lang.Throwable -> L66
            r6.getClass()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r11.getPath()     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = java.io.File.separator     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r9.<init>()     // Catch: java.lang.Throwable -> L66
            r9.append(r7)     // Catch: java.lang.Throwable -> L66
            r9.append(r8)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L66
            boolean r6 = defpackage.xs6.g0(r6, r7, r2)     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto Lac
            boolean r6 = r4.isDirectory()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L68
            r5.mkdirs()     // Catch: java.lang.Throwable -> L66
            goto L8c
        L66:
            r10 = move-exception
            goto Lb7
        L68:
            java.io.File r6 = r5.getParentFile()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L71
            r6.mkdirs()     // Catch: java.lang.Throwable -> L66
        L71:
            java.io.InputStream r4 = r0.getInputStream(r4)     // Catch: java.lang.Throwable -> L66
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9d
            r4.getClass()     // Catch: java.lang.Throwable -> L9f
            long r7 = defpackage.f04.w(r4, r6)     // Catch: java.lang.Throwable -> L9f
            r6.close()     // Catch: java.lang.Throwable -> L9d
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L9d
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L9d
            r4.close()     // Catch: java.lang.Throwable -> L66
        L8c:
            int r3 = r3 + 1
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L66
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L66
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L66
            r12.o(r4, r5)     // Catch: java.lang.Throwable -> L66
            goto L19
        L9d:
            r10 = move-exception
            goto La6
        L9f:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> La1
        La1:
            r11 = move-exception
            defpackage.ge7.t(r6, r10)     // Catch: java.lang.Throwable -> L9d
            throw r11     // Catch: java.lang.Throwable -> L9d
        La6:
            throw r10     // Catch: java.lang.Throwable -> La7
        La7:
            r11 = move-exception
            defpackage.ge7.t(r4, r10)     // Catch: java.lang.Throwable -> L66
            throw r11     // Catch: java.lang.Throwable -> L66
        Lac:
            oo5 r10 = new oo5     // Catch: java.lang.Throwable -> L66
            r11 = 0
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L66
            throw r10     // Catch: java.lang.Throwable -> L66
        Lb3:
            r0.close()
            return
        Lb7:
            throw r10     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r11 = move-exception
            defpackage.ge7.t(r0, r10)
            throw r11
        Lbd:
            r10 = move-exception
            oo5 r11 = new oo5
            r11.<init>(r10)
            throw r11
    }

    public static int w(android.view.inputmethod.HandwritingGesture r2, defpackage.bg2 r3) {
            java.lang.String r2 = defpackage.qv2.q(r2)
            if (r2 != 0) goto L8
            r2 = 3
            return r2
        L8:
            pu0 r0 = new pu0
            r1 = 1
            r0.<init>(r2, r1)
            r3.g(r0)
            r2 = 5
            return r2
    }

    public static defpackage.rj2 x(defpackage.rj2[] r10, int r11) {
            r0 = r11 & 1
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L9
        L7:
            r0 = 700(0x2bc, float:9.81E-43)
        L9:
            r11 = r11 & 2
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L11
            r11 = r2
            goto L12
        L11:
            r11 = r1
        L12:
            int r3 = r10.length
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = r1
        L18:
            if (r6 >= r3) goto L36
            r7 = r10[r6]
            int r8 = r7.c
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r7.d
            if (r9 != r11) goto L2b
            r9 = r1
            goto L2c
        L2b:
            r9 = r2
        L2c:
            int r8 = r8 + r9
            if (r4 == 0) goto L31
            if (r5 <= r8) goto L33
        L31:
            r4 = r7
            r5 = r8
        L33:
            int r6 = r6 + 1
            goto L18
        L36:
            return r4
    }

    public static final int y(int r1, defpackage.cq3 r2, java.lang.Object r3) {
            if (r3 == 0) goto L22
            int r0 = r2.a()
            if (r0 != 0) goto L9
            goto L22
        L9:
            int r0 = r2.a()
            if (r1 >= r0) goto L1a
            java.lang.Object r0 = r2.c(r1)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            goto L22
        L1a:
            int r2 = r2.e(r3)
            r3 = -1
            if (r2 == r3) goto L22
            return r2
        L22:
            return r1
    }

    public static defpackage.s83 z(long r8) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L15
            long r4 = r2 * r0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L15
            r4 = -1
            long r2 = r2 + r4
        L15:
            long r8 = r8 % r0
            long r4 = r8 ^ r0
            long r6 = -r8
            long r6 = r6 | r8
            long r4 = r4 & r6
            r6 = 63
            long r4 = r4 >> r6
            long r0 = r0 & r4
            long r8 = r8 + r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r0
            int r8 = (int) r8
            r0 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L31
            s83 r8 = defpackage.s83.L
            return r8
        L31:
            r0 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L3d
            s83 r8 = defpackage.s83.R
            return r8
        L3d:
            s83 r8 = A(r8, r2)
            return r8
    }

    public abstract android.graphics.Typeface o(android.content.Context r1, defpackage.bj2 r2, android.content.res.Resources r3, int r4);

    public abstract android.graphics.Typeface p(android.content.Context r1, defpackage.rj2[] r2, int r3);

    public android.graphics.Typeface q(android.content.Context r1, java.util.List r2, int r3) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "createFromFontInfoWithFallback must only be called on API 29+"
            r0.<init>(r1)
            throw r0
    }

    public android.graphics.Typeface r(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r0 = defpackage.kn2.M(r1)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = defpackage.kn2.x(r0, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r0.delete()
            return r1
        L12:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r0.delete()
            return r1
        L1e:
            r1 = move-exception
            r0.delete()
            throw r1
        L23:
            r0.delete()
            return r1
    }
}
