package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi2  reason: default package */
/* loaded from: classes.dex */
public abstract class gi2 {
    public static defpackage.e33 a = null;
    public static defpackage.e33 b = null;
    public static java.lang.String c = "file_name";
    public static final /* synthetic */ int d = 0;

    public static final defpackage.rc4 A(android.content.Context r3) {
            rc4 r0 = new rc4
            r3.getClass()
            r0.<init>(r3)
            zb4 r3 = r0.b
            rd4 r1 = r3.s
            sw0 r2 = new sw0
            r2.<init>(r1)
            r1.a(r2)
            rd4 r3 = r3.s
            uw0 r1 = new uw0
            r1.<init>()
            r3.a(r1)
            ij1 r1 = new ij1
            r1.<init>()
            r3.a(r1)
            return r0
    }

    public static android.view.View B(android.view.View r3, int r4) {
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L5
            goto L1c
        L5:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1c
            android.view.View r2 = r3.getChildAt(r1)
            android.view.View r2 = r2.findViewById(r4)
            if (r2 == 0) goto L19
            return r2
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r3 = 0
            return r3
    }

    public static defpackage.ua7 C(org.json.JSONObject r8) {
            java.lang.String r0 = "id"
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r8.optString(r0, r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "left"
            double r1 = r8.getDouble(r1)     // Catch: java.lang.Throwable -> L56
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L56
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            float r1 = p(r1, r3, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "top"
            double r4 = r8.getDouble(r4)     // Catch: java.lang.Throwable -> L56
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L56
            float r4 = p(r4, r3, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "right"
            double r5 = r8.getDouble(r5)     // Catch: java.lang.Throwable -> L56
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L56
            float r5 = p(r5, r3, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "bottom"
            double r6 = r8.getDouble(r6)     // Catch: java.lang.Throwable -> L56
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L56
            float r2 = p(r6, r3, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "name"
            java.lang.String r6 = ""
            java.lang.String r8 = r8.optString(r3, r6)     // Catch: java.lang.Throwable -> L56
            ua7 r3 = new ua7     // Catch: java.lang.Throwable -> L56
            r0.getClass()     // Catch: java.lang.Throwable -> L56
            android.graphics.RectF r6 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L56
            r6.<init>(r1, r4, r5, r2)     // Catch: java.lang.Throwable -> L56
            r8.getClass()     // Catch: java.lang.Throwable -> L56
            r3.<init>(r0, r6, r8)     // Catch: java.lang.Throwable -> L56
            goto L5c
        L56:
            r8 = move-exception
            em5 r3 = new em5
            r3.<init>(r8)
        L5c:
            boolean r8 = r3 instanceof defpackage.em5
            if (r8 == 0) goto L61
            r3 = 0
        L61:
            ua7 r3 = (defpackage.ua7) r3
            return r3
    }

    public static defpackage.ut0 E(defpackage.px0 r1) {
            nq6 r0 = defpackage.vt0.a
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r0)
            ut0 r1 = (defpackage.ut0) r1
            return r1
    }

    public static final defpackage.e33 F() {
            e33 r0 = defpackage.gi2.a
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Info"
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
            r2 = 1094713344(0x41400000, float:12.0)
            r11 = 1073741824(0x40000000, float:2.0)
            r4.o(r2, r11)
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1094713344(0x41400000, float:12.0)
            r5 = 1087331369(0x40cf5c29, float:6.48)
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 1087331369(0x40cf5c29, float:6.48)
            r4.h(r5, r6, r7, r8, r9, r10)
            r5 = 1083137065(0x408f5c29, float:4.48)
            r6 = 1092616192(0x41200000, float:10.0)
            r4.q(r5, r6, r6, r6)
            r5 = -1064346583(0xffffffffc08f5c29, float:-4.48)
            r7 = -1054867456(0xffffffffc1200000, float:-10.0)
            r4.q(r6, r5, r6, r7)
            r5 = 1099704566(0x418c28f6, float:17.52)
            r4.p(r5, r11, r2, r11)
            r4.g()
            r2 = 1099431936(0x41880000, float:17.0)
            r5 = 1095761920(0x41500000, float:13.0)
            r4.o(r5, r2)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.l(r2)
            r6 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r4.u(r6)
            r4.l(r11)
            r6 = 1086324736(0x40c00000, float:6.0)
            r4.u(r6)
            r4.g()
            r6 = 1091567616(0x41100000, float:9.0)
            r4.o(r5, r6)
            r4.l(r2)
            r2 = 1093664768(0x41300000, float:11.0)
            r5 = 1088421888(0x40e00000, float:7.0)
            r4.m(r2, r5)
            r4.l(r11)
            r4.u(r11)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.gi2.a = r0
            return r0
    }

    public static final int G(defpackage.cr4 r4) {
            lo4 r0 = r4.e
            lo4 r1 = defpackage.lo4.Vertical
            if (r0 != r1) goto L12
            long r0 = r4.e()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L10:
            int r4 = (int) r0
            return r4
        L12:
            long r0 = r4.e()
            r4 = 32
            long r0 = r0 >> r4
            goto L10
    }

    public static final defpackage.e33 H() {
            e33 r0 = defpackage.gi2.b
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.PlayArrow"
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
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 32
            r2.<init>(r3)
            tt4 r3 = new tt4
            r4 = 1090519040(0x41000000, float:8.0)
            r5 = 1084227584(0x40a00000, float:5.0)
            r3.<init>(r4, r5)
            r2.add(r3)
            fu4 r3 = new fu4
            r4 = 1096810496(0x41600000, float:14.0)
            r3.<init>(r4)
            r2.add(r3)
            au4 r3 = new au4
            r4 = 1093664768(0x41300000, float:11.0)
            r5 = -1059061760(0xffffffffc0e00000, float:-7.0)
            r3.<init>(r4, r5)
            r2.add(r3)
            pt4 r3 = defpackage.pt4.c
            r2.add(r3)
            r3 = 0
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.gi2.b = r0
            return r0
    }

    public static defpackage.xe7 I(defpackage.px0 r1) {
            nq6 r0 = defpackage.ye7.b
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r0)
            xe7 r1 = (defpackage.xe7) r1
            return r1
    }

    public static final long J(float r4, long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = defpackage.oi2.L(r1, r2, r4)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r4 = defpackage.oi2.L(r5, r6, r4)
            int r5 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            long r4 = r5 << r0
            long r6 = r7 & r2
            long r4 = r4 | r6
            return r4
    }

    public static final defpackage.s47 N(defpackage.s47 r28, defpackage.kk3 r29) {
            r0 = r28
            s47 r1 = new s47
            nn6 r2 = r0.a
            e37 r3 = defpackage.on6.d
            e37 r3 = r2.a
            d37 r4 = defpackage.d37.a
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L14
        L12:
            r5 = r3
            goto L17
        L14:
            e37 r3 = defpackage.on6.d
            goto L12
        L17:
            long r3 = r2.b
            y47[] r6 = defpackage.x47.b
            r24 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r6 = r3 & r24
            r26 = 0
            int r6 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r6 != 0) goto L2a
            long r3 = defpackage.on6.a
        L2a:
            r6 = r3
            oj2 r3 = r2.c
            if (r3 != 0) goto L31
            oj2 r3 = defpackage.oj2.Y
        L31:
            r8 = r3
            ij2 r3 = r2.d
            if (r3 == 0) goto L39
            int r3 = r3.a
            goto L3a
        L39:
            r3 = 0
        L3a:
            ij2 r9 = new ij2
            r9.<init>(r3)
            jj2 r3 = r2.e
            if (r3 == 0) goto L46
            int r3 = r3.a
            goto L49
        L46:
            r3 = 65535(0xffff, float:9.1834E-41)
        L49:
            jj2 r10 = new jj2
            r10.<init>(r3)
            li2 r3 = r2.f
            if (r3 != 0) goto L54
            zd1 r3 = defpackage.li2.A
        L54:
            r11 = r3
            java.lang.String r3 = r2.g
            if (r3 != 0) goto L5b
            java.lang.String r3 = ""
        L5b:
            r12 = r3
            long r3 = r2.h
            long r13 = r3 & r24
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 != 0) goto L66
            long r3 = defpackage.on6.b
        L66:
            r13 = r3
            x20 r3 = r2.i
            r4 = 0
            if (r3 == 0) goto L6f
            float r3 = r3.a
            goto L70
        L6f:
            r3 = r4
        L70:
            boolean r15 = java.lang.Float.isNaN(r3)
            if (r15 == 0) goto L77
            goto L78
        L77:
            r4 = r3
        L78:
            x20 r15 = new x20
            r15.<init>(r4)
            f37 r3 = r2.j
            if (r3 != 0) goto L83
            f37 r3 = defpackage.f37.c
        L83:
            r16 = r3
            gy3 r3 = r2.k
            if (r3 != 0) goto L91
            gy3 r3 = defpackage.gy3.L
            bt r3 = defpackage.nx4.a
            gy3 r3 = r3.H()
        L91:
            r17 = r3
            long r3 = r2.l
            r18 = 16
            int r18 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r18 == 0) goto L9e
        L9b:
            r18 = r3
            goto La1
        L9e:
            long r3 = defpackage.on6.c
            goto L9b
        La1:
            b17 r3 = r2.m
            if (r3 != 0) goto La7
            b17 r3 = defpackage.b17.b
        La7:
            r20 = r3
            ge6 r3 = r2.n
            if (r3 != 0) goto Laf
            ge6 r3 = defpackage.ge6.d
        Laf:
            r21 = r3
            cy4 r3 = r2.o
            oo1 r2 = r2.p
            if (r2 != 0) goto Lb9
            kc2 r2 = defpackage.kc2.a
        Lb9:
            r23 = r2
            nn6 r4 = new nn6
            r22 = r3
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23)
            ds4 r2 = r0.b
            int r3 = defpackage.es4.b
            ds4 r5 = new ds4
            int r3 = r2.a
            r6 = 5
            if (r3 != 0) goto Lce
            r3 = r6
        Lce:
            int r7 = r2.b
            r8 = 3
            r9 = 0
            r10 = 1
            r11 = 2
            if (r7 != r8) goto Lea
            int[] r7 = defpackage.t47.a
            int r8 = r29.ordinal()
            r7 = r7[r8]
            if (r7 == r10) goto Le8
            if (r7 != r11) goto Le4
        Le2:
            r7 = r6
            goto Lff
        Le4:
            defpackage.i.d()
            return r9
        Le8:
            r6 = 4
            goto Le2
        Lea:
            if (r7 != 0) goto Lff
            int[] r6 = defpackage.t47.a
            int r7 = r29.ordinal()
            r6 = r6[r7]
            if (r6 == r10) goto Lfe
            if (r6 != r11) goto Lfa
            r7 = r11
            goto Lff
        Lfa:
            defpackage.i.d()
            return r9
        Lfe:
            r7 = r10
        Lff:
            long r8 = r2.c
            long r11 = r8 & r24
            int r6 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r6 != 0) goto L109
            long r8 = defpackage.es4.a
        L109:
            g37 r6 = r2.d
            if (r6 != 0) goto L10f
            g37 r6 = defpackage.g37.c
        L10f:
            ux4 r11 = r2.e
            xu3 r12 = r2.f
            int r13 = r2.g
            if (r13 != 0) goto L119
            int r13 = defpackage.su3.b
        L119:
            int r14 = r2.h
            if (r14 != 0) goto L11e
            r14 = r10
        L11e:
            i47 r2 = r2.i
            if (r2 != 0) goto L124
            i47 r2 = defpackage.i47.c
        L124:
            r15 = r2
            r10 = r6
            r6 = r3
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15)
            hy4 r0 = r0.c
            r1.<init>(r4, r5, r0)
            return r1
    }

    public static final defpackage.gg3 O(defpackage.jd1 r5, defpackage.hg3 r6, boolean r7) {
            ar0 r0 = defpackage.q60.O(r6)
            boolean r1 = r6.a()
            java.util.List r6 = r6.b()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto Lad
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L47
            boolean r6 = defpackage.jx2.y(r0)
            if (r6 == 0) goto L31
            r5.getClass()
        L31:
            u63 r6 = defpackage.hc6.a
            if (r1 != 0) goto L40
            u63 r6 = defpackage.hc6.a
            gg3 r6 = r6.k(r0)
            if (r6 == 0) goto L3e
            goto L62
        L3e:
            r6 = r3
            goto L62
        L40:
            u63 r6 = defpackage.hc6.b
            gg3 r6 = r6.k(r0)
            goto L62
        L47:
            r5.getClass()
            u63 r6 = defpackage.hc6.a
            if (r1 != 0) goto L55
            u63 r6 = defpackage.hc6.c
            java.lang.Object r6 = r6.l(r0, r2)
            goto L5b
        L55:
            u63 r6 = defpackage.hc6.d
            java.lang.Object r6 = r6.l(r0, r2)
        L5b:
            boolean r4 = r6 instanceof defpackage.em5
            if (r4 == 0) goto L60
            r6 = r3
        L60:
            gg3 r6 = (defpackage.gg3) r6
        L62:
            if (r6 == 0) goto L65
            return r6
        L65:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L83
            gg3 r6 = defpackage.jx2.M(r0)
            if (r6 != 0) goto La2
            r5.getClass()
            boolean r5 = defpackage.jx2.y(r0)
            if (r5 == 0) goto L81
            fz4 r5 = new fz4
            r5.<init>(r0)
        L7f:
            r6 = r5
            goto La2
        L81:
            r6 = r3
            goto La2
        L83:
            java.util.ArrayList r5 = defpackage.jx2.O(r5, r2, r7)
            if (r5 != 0) goto L8a
            goto Lac
        L8a:
            t46 r6 = new t46
            r7 = 7
            r6.<init>(r2, r7)
            gg3 r6 = defpackage.jx2.C(r0, r5, r6)
            if (r6 != 0) goto La2
            boolean r5 = defpackage.jx2.y(r0)
            if (r5 == 0) goto L81
            fz4 r5 = new fz4
            r5.<init>(r0)
            goto L7f
        La2:
            if (r6 == 0) goto Lac
            if (r1 == 0) goto Lab
            gg3 r5 = defpackage.q60.I(r6)
            return r5
        Lab:
            return r6
        Lac:
            return r3
        Lad:
            java.lang.ClassCastException r5 = defpackage.i61.j(r6)
            throw r5
    }

    public static defpackage.j93 P(int r2, defpackage.l93 r3) {
            r3.getClass()
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L1e
            int r0 = r3.A
            int r1 = r3.B
            int r3 = r3.L
            if (r3 <= 0) goto L17
            goto L18
        L17:
            int r2 = -r2
        L18:
            j93 r3 = new j93
            r3.<init>(r0, r1, r2)
            return r3
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Step must be positive, was: "
            r3.<init>(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final java.lang.String Q(float r5) {
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L9
            java.lang.String r5 = "NaN"
            return r5
        L9:
            boolean r0 = java.lang.Float.isInfinite(r5)
            if (r0 == 0) goto L1a
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L17
            java.lang.String r5 = "-Infinity"
            return r5
        L17:
            java.lang.String r5 = "Infinity"
            return r5
        L1a:
            r0 = 0
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r3 = (double) r0
            double r1 = java.lang.Math.pow(r1, r3)
            float r1 = (float) r1
            float r5 = r5 * r1
            int r2 = (int) r5
            float r3 = (float) r2
            float r5 = r5 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L34
            int r2 = r2 + 1
        L34:
            float r5 = (float) r2
            float r5 = r5 / r1
            if (r0 <= 0) goto L3d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L3d:
            int r5 = (int) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
    }

    public static defpackage.l93 R(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > r0) goto L9
            l93 r2 = defpackage.l93.R
            l93 r2 = defpackage.l93.R
            return r2
        L9:
            l93 r0 = new l93
            r1 = 1
            int r3 = r3 - r1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static final void a(defpackage.z23 r12, defpackage.a74 r13, defpackage.sr4 r14, defpackage.sr4 r15, defpackage.px0 r16, int r17) {
            r9 = r16
            xq2 r9 = (defpackage.xq2) r9
            r0 = 1693837359(0x64f5e82f, float:3.6289463E22)
            r9.c0(r0)
            e40 r5 = defpackage.d90.Z
            nq6 r0 = defpackage.yx3.a
            pe5 r0 = defpackage.kn2.E(r0, r9)
            r1 = 3
            int r2 = r17 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2392632(0x248238, float:3.352792E-39)
            r2 = r2 | r3
            r3 = -1481548872(0xffffffffa7b15bb8, float:-4.922681E-15)
            r9.c0(r3)
            nw r3 = new nw
            w31 r4 = defpackage.y52.a
            r3.<init>(r12, r4, r0)
            ve5 r12 = defpackage.dk7.b
            if (r14 != 0) goto L34
            if (r15 != 0) goto L34
            if (r15 == 0) goto L31
            goto L34
        L31:
            k4 r12 = defpackage.lw.p0
            goto L39
        L34:
            s27 r12 = new s27
            r12.<init>(r14, r15, r15, r1)
        L39:
            int r14 = r2 >> 3
            r14 = r14 & 896(0x380, float:1.256E-42)
            r15 = 48
            r10 = r15 | r14
            r11 = 0
            r1 = 0
            r4 = 0
            w31 r6 = defpackage.y31.b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r2 = r13
            r0 = r3
            r3 = r12
            defpackage.f04.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12 = 0
            r9.p(r12)
            r9.p(r12)
            return
    }

    public static final void b(java.lang.Object r16, java.lang.String r17, defpackage.a74 r18, defpackage.z31 r19, float r20, defpackage.px0 r21, int r22, int r23) {
            r0 = r23
            r9 = r21
            xq2 r9 = (defpackage.xq2) r9
            r1 = 1451072229(0x567d9ae5, float:6.9710427E13)
            r9.c0(r1)
            e40 r5 = defpackage.d90.Z
            r1 = r0 & 64
            if (r1 == 0) goto L16
            w31 r1 = defpackage.y31.b
            r6 = r1
            goto L18
        L16:
            r6 = r19
        L18:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L20
            r1 = 1065353216(0x3f800000, float:1.0)
            r7 = r1
            goto L22
        L20:
            r7 = r20
        L22:
            r0 = r0 & 512(0x200, float:7.17E-43)
            r12 = 0
            if (r0 == 0) goto L2a
            r0 = 1
            r8 = r0
            goto L2b
        L2a:
            r8 = r12
        L2b:
            nq6 r0 = defpackage.yx3.a
            pe5 r0 = defpackage.kn2.E(r0, r9)
            r1 = r22 & 112(0x70, float:1.57E-43)
            r1 = r1 | 520(0x208, float:7.29E-43)
            int r2 = r22 << 3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r4 = r2 & r3
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r10 = r2 & r4
            r1 = r1 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r11 = r2 & r10
            r1 = r1 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r2 & r11
            r1 = r1 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r2 & r13
            r1 = r1 | r14
            r14 = 1879048192(0x70000000, float:1.5845633E29)
            r2 = r2 & r14
            r1 = r1 | r2
            int r2 = r22 >> 27
            r2 = r2 & 14
            r15 = 2032051394(0x791ea4c2, float:5.1482787E34)
            r9.c0(r15)
            nw r15 = new nw
            r19 = r3
            w31 r3 = defpackage.y52.a
            r20 = r4
            r4 = r16
            r15.<init>(r4, r3, r0)
            r0 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r1 & r19
            r0 = r0 | r3
            r3 = r1 & r20
            r0 = r0 | r3
            r3 = r1 & r10
            r0 = r0 | r3
            r3 = r1 & r11
            r0 = r0 | r3
            r1 = r1 & r13
            r0 = r0 | r1
            int r1 = r2 << 27
            r1 = r1 & r14
            r10 = r0 | r1
            r11 = 0
            k4 r3 = defpackage.lw.p0
            r4 = 0
            r1 = r17
            r2 = r18
            r0 = r15
            defpackage.f04.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r12)
            r9.p(r12)
            return
    }

    public static final void c(defpackage.a74 r27, defpackage.an0 r28, defpackage.on2 r29, defpackage.px0 r30, int r31) {
            r2 = r28
            r3 = r29
            r27.getClass()
            r2.getClass()
            r3.getClass()
            r9 = r30
            xq2 r9 = (defpackage.xq2) r9
            r0 = -2038549408(0xffffffff867e3460, float:-4.781057E-35)
            r9.d0(r0)
            boolean r0 = r9.h(r2)
            if (r0 == 0) goto L20
            r0 = 32
            goto L22
        L20:
            r0 = 16
        L22:
            r0 = r31 | r0
            boolean r1 = r9.h(r3)
            r4 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2e
            r1 = r4
            goto L30
        L2e:
            r1 = 128(0x80, float:1.8E-43)
        L30:
            r0 = r0 | r1
            r1 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r1 == r5) goto L39
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            r5 = r0 & 1
            boolean r1 = r9.S(r5, r1)
            if (r1 == 0) goto L1cc
            es7 r1 = defpackage.bl2.F(r9)
            java.lang.Object r5 = r9.P()
            vs0 r7 = defpackage.ox0.a
            if (r5 != r7) goto L52
            r94 r5 = defpackage.i61.f(r9)
        L52:
            r14 = r5
            r94 r14 = (defpackage.r94) r14
            r5 = 6
            qa4 r5 = defpackage.bw7.a(r14, r9, r5)
            r8 = 1095761920(0x41500000, float:13.0)
            y16 r10 = defpackage.z16.b(r8)
            r11 = r27
            a74 r13 = defpackage.u24.g(r11, r10)
            java.lang.Object r15 = r5.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L77
            r23 = r9
            long r8 = r1.e
            goto L7b
        L77:
            r23 = r9
            long r8 = r1.d
        L7b:
            jy2 r15 = defpackage.u24.m
            a74 r8 = defpackage.vy7.L(r13, r8, r15)
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L95
            r5 = 1073741824(0x40000000, float:2.0)
            long r12 = r1.j
            a74 r8 = defpackage.ak7.I(r8, r5, r12, r10)
        L95:
            r13 = r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != r4) goto L9c
            r0 = 1
            goto L9d
        L9c:
            r0 = 0
        L9d:
            java.lang.Object r4 = r23.P()
            if (r0 != 0) goto La9
            if (r4 != r7) goto La6
            goto La9
        La6:
            r9 = r23
            goto Lb5
        La9:
            x7 r4 = new x7
            r0 = 8
            r4.<init>(r0, r3)
            r9 = r23
            r9.l0(r4)
        Lb5:
            r18 = r4
            on2 r18 = (defpackage.on2) r18
            r19 = 28
            r0 = r15
            r15 = 0
            r16 = 0
            r17 = 0
            a74 r4 = defpackage.mb3.t(r13, r14, r15, r16, r17, r18, r19)
            r5 = 1096810496(0x41600000, float:14.0)
            r7 = 1095761920(0x41500000, float:13.0)
            a74 r4 = defpackage.ge7.P(r4, r5, r7)
            d40 r5 = defpackage.d90.i0
            du r7 = defpackage.ju.a
            r8 = 48
            l26 r5 = defpackage.k26.a(r7, r5, r9, r8)
            long r7 = r9.T
            int r7 = java.lang.Long.hashCode(r7)
            xv4 r8 = r9.l()
            a74 r4 = defpackage.l.E(r9, r4)
            ix0 r10 = defpackage.jx0.i
            r10.getClass()
            iy0 r10 = defpackage.ix0.b
            r9.f0()
            boolean r12 = r9.S
            if (r12 == 0) goto Lf7
            r9.k(r10)
            goto Lfa
        Lf7:
            r9.o0()
        Lfa:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r9, r12, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r9, r5, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            pn r8 = defpackage.ix0.g
            defpackage.yh2.K(r9, r8, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r9, r7)
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r9, r13, r4)
            r4 = 1107820544(0x42080000, float:34.0)
            x64 r14 = defpackage.x64.a
            a74 r4 = defpackage.dj6.i(r14, r4)
            r15 = 1091567616(0x41100000, float:9.0)
            y16 r15 = defpackage.z16.b(r15)
            a74 r4 = defpackage.u24.g(r4, r15)
            r15 = r7
            long r6 = r1.m
            a74 r0 = defpackage.vy7.L(r4, r6, r0)
            e40 r4 = defpackage.d90.Z
            r6 = 0
            e34 r4 = defpackage.h70.d(r4, r6)
            long r6 = r9.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r9.l()
            a74 r0 = defpackage.l.E(r9, r0)
            r9.f0()
            boolean r3 = r9.S
            if (r3 == 0) goto L150
            r9.k(r10)
            goto L153
        L150:
            r9.o0()
        L153:
            defpackage.yh2.K(r9, r12, r4)
            defpackage.yh2.K(r9, r5, r7)
            defpackage.i61.w(r6, r9, r8, r9, r15)
            defpackage.yh2.K(r9, r13, r0)
            e33 r4 = defpackage.hi2.A()
            long r7 = r1.l
            r0 = 1100480512(0x41980000, float:19.0)
            a74 r6 = defpackage.dj6.i(r14, r0)
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 0
            r5 = 0
            defpackage.i13.a(r4, r5, r6, r7, r9, r10, r11)
            r0 = 1
            r9.p(r0)
            r3 = 1094713344(0x41400000, float:12.0)
            a74 r3 = defpackage.dj6.l(r14, r3)
            h(r9, r3)
            vn3 r5 = new vn3
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r3, r0)
            java.lang.String r4 = r2.b
            long r6 = r1.g
            r10 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r10 = defpackage.hi2.D(r10)
            r23 = r9
            r8 = r10
            oj2 r10 = defpackage.oj2.d0
            r25 = 3120(0xc30, float:4.372E-42)
            r26 = 120784(0x1d7d0, float:1.69254E-40)
            r11 = 0
            r12 = 0
            r3 = r14
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 199680(0x30c00, float:2.79811E-40)
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            e33 r4 = defpackage.mp2.J()
            long r7 = r1.i
            r1 = 1101004800(0x41a00000, float:20.0)
            a74 r6 = defpackage.dj6.i(r3, r1)
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 0
            r5 = 0
            defpackage.i13.a(r4, r5, r6, r7, r9, r10, r11)
            r9.p(r0)
            goto L1cf
        L1cc:
            r9.V()
        L1cf:
            cf5 r6 = r9.t()
            if (r6 == 0) goto L1e4
            x3 r0 = new x3
            r5 = 17
            r1 = r27
            r3 = r29
            r4 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1e4:
            return
    }

    public static final void d(java.util.UUID r17, me.magnum.melonds.domain.model.layout.BackgroundMode r18, defpackage.eo2 r19, defpackage.on2 r20, defpackage.qn2 r21, defpackage.on2 r22, defpackage.on2 r23, defpackage.px0 r24, int r25) {
            r1 = r17
            r3 = r19
            r5 = r22
            r0 = r23
            r18.getClass()
            r3.getClass()
            r20.getClass()
            r21.getClass()
            r5.getClass()
            r0.getClass()
            r9 = r24
            xq2 r9 = (defpackage.xq2) r9
            r2 = -1099541442(0xffffffffbe76543e, float:-0.24055573)
            r9.d0(r2)
            boolean r2 = r9.h(r1)
            if (r2 == 0) goto L2c
            r2 = 4
            goto L2d
        L2c:
            r2 = 2
        L2d:
            r2 = r25 | r2
            int r4 = r18.ordinal()
            boolean r4 = r9.d(r4)
            if (r4 == 0) goto L3c
            r4 = 32
            goto L3e
        L3c:
            r4 = 16
        L3e:
            r2 = r2 | r4
            boolean r4 = r9.h(r3)
            if (r4 == 0) goto L48
            r4 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r4 = 128(0x80, float:1.8E-43)
        L4a:
            r2 = r2 | r4
            r11 = r20
            boolean r4 = r9.h(r11)
            if (r4 == 0) goto L56
            r4 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r4 = 1024(0x400, float:1.435E-42)
        L58:
            r2 = r2 | r4
            r14 = r21
            boolean r4 = r9.h(r14)
            if (r4 == 0) goto L64
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L66
        L64:
            r4 = 8192(0x2000, float:1.148E-41)
        L66:
            r2 = r2 | r4
            boolean r4 = r9.h(r5)
            if (r4 == 0) goto L70
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L72
        L70:
            r4 = 65536(0x10000, float:9.1835E-41)
        L72:
            r2 = r2 | r4
            boolean r4 = r9.h(r0)
            if (r4 == 0) goto L7c
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L7e
        L7c:
            r4 = 524288(0x80000, float:7.34684E-40)
        L7e:
            r2 = r2 | r4
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r2
            r6 = 599186(0x92492, float:8.39638E-40)
            r7 = 1
            if (r4 == r6) goto L8b
            r4 = r7
            goto L8c
        L8b:
            r4 = 0
        L8c:
            r6 = r2 & 1
            boolean r4 = r9.S(r6, r4)
            if (r4 == 0) goto L100
            java.lang.Object r4 = r9.P()
            r6 = 0
            vs0 r8 = defpackage.ox0.a
            if (r4 != r8) goto La4
            vs4 r4 = defpackage.np2.Y(r6)
            r9.l0(r4)
        La4:
            r15 = r4
            qa4 r15 = (defpackage.qa4) r15
            qa4 r4 = defpackage.np2.b0(r3, r9)
            boolean r10 = r9.h(r1)
            boolean r12 = r9.f(r4)
            r10 = r10 | r12
            java.lang.Object r12 = r9.P()
            if (r10 != 0) goto Lbc
            if (r12 != r8) goto Lc4
        Lbc:
            l5 r12 = new l5
            r12.<init>(r1, r4, r15, r6)
            r9.l0(r12)
        Lc4:
            eo2 r12 = (defpackage.eo2) r12
            defpackage.mb3.i(r9, r12, r1)
            r4 = 2130903048(0x7f030008, float:1.7412903E38)
            java.lang.String[] r12 = defpackage.yh2.M(r9, r4)
            r4 = 2131952128(0x7f130200, float:1.954069E38)
            java.lang.String r4 = defpackage.yh2.O(r9, r4)
            u91 r10 = new u91
            r16 = 2
            r13 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6 = 62324307(0x3b6fe53, float:1.0755389E-36)
            zv0 r6 = defpackage.n16.I(r6, r10, r9)
            pn0 r8 = new pn0
            r8.<init>(r5, r0, r7)
            r7 = 882420181(0x3498a9d5, float:2.8435775E-7)
            zv0 r7 = defpackage.n16.I(r7, r8, r9)
            int r2 = r2 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r10 = r2 | 3456(0xd80, float:4.843E-42)
            r11 = 16
            r8 = 0
            defpackage.q60.a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L103
        L100:
            r9.V()
        L103:
            cf5 r9 = r9.t()
            if (r9 == 0) goto L11c
            fo0 r0 = new fo0
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L11c:
            return
    }

    public static final void e(defpackage.a74 r27, defpackage.pr3 r28, defpackage.lq4 r29, defpackage.iu r30, defpackage.c40 r31, defpackage.sd2 r32, boolean r33, defpackage.sg r34, defpackage.qn2 r35, defpackage.px0 r36, int r37, int r38) {
            r10 = r37
            r0 = r36
            xq2 r0 = (defpackage.xq2) r0
            r1 = 53695811(0x3335543, float:5.270125E-37)
            r0.d0(r1)
            r1 = r38 & 1
            if (r1 == 0) goto L16
            r2 = r10 | 6
            r3 = r2
            r2 = r27
            goto L2a
        L16:
            r2 = r10 & 6
            if (r2 != 0) goto L27
            r2 = r27
            boolean r3 = r0.f(r2)
            if (r3 == 0) goto L24
            r3 = 4
            goto L25
        L24:
            r3 = 2
        L25:
            r3 = r3 | r10
            goto L2a
        L27:
            r2 = r27
            r3 = r10
        L2a:
            r4 = r10 & 48
            if (r4 != 0) goto L43
            r4 = r38 & 2
            if (r4 != 0) goto L3d
            r4 = r28
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L3f
            r5 = 32
            goto L41
        L3d:
            r4 = r28
        L3f:
            r5 = 16
        L41:
            r3 = r3 | r5
            goto L45
        L43:
            r4 = r28
        L45:
            r5 = r38 & 4
            if (r5 == 0) goto L4e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L4b:
            r6 = r29
            goto L60
        L4e:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L4b
            r6 = r29
            boolean r7 = r0.f(r6)
            if (r7 == 0) goto L5d
            r7 = 256(0x100, float:3.59E-43)
            goto L5f
        L5d:
            r7 = 128(0x80, float:1.8E-43)
        L5f:
            r3 = r3 | r7
        L60:
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r7 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L7b
            r7 = r38 & 16
            if (r7 != 0) goto L75
            r7 = r30
            boolean r8 = r0.f(r7)
            if (r8 == 0) goto L77
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L79
        L75:
            r7 = r30
        L77:
            r8 = 8192(0x2000, float:1.148E-41)
        L79:
            r3 = r3 | r8
            goto L7d
        L7b:
            r7 = r30
        L7d:
            r8 = r38 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L87
            r3 = r3 | r9
        L84:
            r9 = r31
            goto L98
        L87:
            r9 = r9 & r10
            if (r9 != 0) goto L84
            r9 = r31
            boolean r11 = r0.f(r9)
            if (r11 == 0) goto L95
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L97
        L95:
            r11 = 65536(0x10000, float:9.1835E-41)
        L97:
            r3 = r3 | r11
        L98:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r10
            if (r11 != 0) goto La0
            r11 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r11
        La0:
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 | r3
            r12 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 & r10
            if (r12 != 0) goto Lab
            r11 = 46137344(0x2c00000, float:2.8211864E-37)
            r11 = r11 | r3
        Lab:
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 & r10
            if (r3 != 0) goto Lbf
            r3 = r35
            boolean r12 = r0.h(r3)
            if (r12 == 0) goto Lbb
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lbd
        Lbb:
            r12 = 268435456(0x10000000, float:2.524355E-29)
        Lbd:
            r11 = r11 | r12
            goto Lc1
        Lbf:
            r3 = r35
        Lc1:
            r12 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r12 & r11
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 1
            if (r12 == r13) goto Lcd
            r12 = r14
            goto Lce
        Lcd:
            r12 = 0
        Lce:
            r13 = r11 & 1
            boolean r12 = r0.S(r13, r12)
            if (r12 == 0) goto L19c
            r0.X()
            r12 = r10 & 1
            r13 = -238551041(0xfffffffff1c7ffff, float:-1.9807039E30)
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L108
            boolean r12 = r0.B()
            if (r12 == 0) goto Lea
            goto L108
        Lea:
            r0.V()
            r1 = r38 & 2
            if (r1 == 0) goto Lf3
            r11 = r11 & (-113(0xffffffffffffff8f, float:NaN))
        Lf3:
            r1 = r38 & 16
            if (r1 == 0) goto Lf8
            r11 = r11 & r15
        Lf8:
            r1 = r11 & r13
            r15 = r32
            r16 = r33
            r17 = r34
            r11 = r2
        L101:
            r12 = r4
            r13 = r6
            r19 = r7
            r18 = r9
            goto L15a
        L108:
            if (r1 == 0) goto L10d
            x64 r1 = defpackage.x64.a
            goto L10e
        L10d:
            r1 = r2
        L10e:
            r2 = r38 & 2
            if (r2 == 0) goto L119
            pr3 r2 = defpackage.qr3.a(r0)
            r11 = r11 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r2
        L119:
            if (r5 == 0) goto L122
            pq4 r2 = new pq4
            r5 = 0
            r2.<init>(r5, r5, r5, r5)
            r6 = r2
        L122:
            r2 = r38 & 16
            if (r2 == 0) goto L12a
            r11 = r11 & r15
            eu r2 = defpackage.ju.c
            r7 = r2
        L12a:
            if (r8 == 0) goto L12f
            c40 r2 = defpackage.d90.k0
            r9 = r2
        L12f:
            oc1 r2 = defpackage.eo6.a(r0)
            boolean r5 = r0.f(r2)
            java.lang.Object r8 = r0.P()
            if (r5 != 0) goto L141
            vs0 r5 = defpackage.ox0.a
            if (r8 != r5) goto L149
        L141:
            wd1 r8 = new wd1
            r8.<init>(r2)
            r0.l0(r8)
        L149:
            r2 = r8
            wd1 r2 = (defpackage.wd1) r2
            sg r5 = defpackage.xp4.a(r0)
            r8 = r11 & r13
            r11 = r1
            r15 = r2
            r17 = r5
            r1 = r8
            r16 = r14
            goto L101
        L15a:
            r0.q()
            r2 = r1 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r1 << 12
            r5 = 1879048192(0x70000000, float:1.5845633E29)
            r4 = r4 & r5
            r24 = r2 | r4
            int r2 = r1 >> 12
            r2 = r2 & 14
            int r1 = r1 >> 18
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r25 = r2 | r1
            r26 = 6400(0x1900, float:8.968E-42)
            r14 = 1
            r20 = 0
            r21 = 0
            r23 = r0
            r22 = r3
            defpackage.jx2.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r5 = r18
            r4 = r19
            goto L1ac
        L19c:
            r23 = r0
            r23.V()
            r8 = r34
            r1 = r2
            r2 = r4
            r3 = r6
            r4 = r7
            r5 = r9
            r6 = r32
            r7 = r33
        L1ac:
            cf5 r13 = r23.t()
            if (r13 == 0) goto L1be
            l90 r0 = new l90
            r12 = 1
            r9 = r35
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.d = r0
        L1be:
            return
    }

    public static final void f(defpackage.a74 r27, defpackage.pr3 r28, defpackage.lq4 r29, defpackage.fu r30, defpackage.d40 r31, defpackage.sd2 r32, boolean r33, defpackage.sg r34, defpackage.qn2 r35, defpackage.px0 r36, int r37, int r38) {
            r10 = r37
            r0 = r36
            xq2 r0 = (defpackage.xq2) r0
            r1 = -1884325601(0xffffffff8faf791f, float:-1.7302986E-29)
            r0.d0(r1)
            r1 = r38 & 1
            if (r1 == 0) goto L16
            r2 = r10 | 6
            r3 = r2
            r2 = r27
            goto L2a
        L16:
            r2 = r10 & 6
            if (r2 != 0) goto L27
            r2 = r27
            boolean r3 = r0.f(r2)
            if (r3 == 0) goto L24
            r3 = 4
            goto L25
        L24:
            r3 = 2
        L25:
            r3 = r3 | r10
            goto L2a
        L27:
            r2 = r27
            r3 = r10
        L2a:
            r4 = r10 & 48
            if (r4 != 0) goto L43
            r4 = r38 & 2
            if (r4 != 0) goto L3d
            r4 = r28
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L3f
            r5 = 32
            goto L41
        L3d:
            r4 = r28
        L3f:
            r5 = 16
        L41:
            r3 = r3 | r5
            goto L45
        L43:
            r4 = r28
        L45:
            r5 = r38 & 4
            if (r5 == 0) goto L4e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L4b:
            r6 = r29
            goto L60
        L4e:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L4b
            r6 = r29
            boolean r7 = r0.f(r6)
            if (r7 == 0) goto L5d
            r7 = 256(0x100, float:3.59E-43)
            goto L5f
        L5d:
            r7 = 128(0x80, float:1.8E-43)
        L5f:
            r3 = r3 | r7
        L60:
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r7 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L75
            r7 = r30
            boolean r8 = r0.f(r7)
            if (r8 == 0) goto L71
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L73
        L71:
            r8 = 8192(0x2000, float:1.148E-41)
        L73:
            r3 = r3 | r8
            goto L77
        L75:
            r7 = r30
        L77:
            r8 = r38 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L81
            r3 = r3 | r9
        L7e:
            r9 = r31
            goto L92
        L81:
            r9 = r9 & r10
            if (r9 != 0) goto L7e
            r9 = r31
            boolean r11 = r0.f(r9)
            if (r11 == 0) goto L8f
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L91
        L8f:
            r11 = 65536(0x10000, float:9.1835E-41)
        L91:
            r3 = r3 | r11
        L92:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r10
            if (r11 != 0) goto L9a
            r11 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r11
        L9a:
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 | r3
            r12 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 & r10
            if (r12 != 0) goto La5
            r11 = 46137344(0x2c00000, float:2.8211864E-37)
            r11 = r11 | r3
        La5:
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 & r10
            if (r3 != 0) goto Lb9
            r3 = r35
            boolean r12 = r0.h(r3)
            if (r12 == 0) goto Lb5
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lb7
        Lb5:
            r12 = 268435456(0x10000000, float:2.524355E-29)
        Lb7:
            r11 = r11 | r12
            goto Lbb
        Lb9:
            r3 = r35
        Lbb:
            r12 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r12 & r11
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 1
            if (r12 == r13) goto Lc7
            r12 = r14
            goto Lc8
        Lc7:
            r12 = 0
        Lc8:
            r13 = r11 & 1
            boolean r12 = r0.S(r13, r12)
            if (r12 == 0) goto L183
            r0.X()
            r12 = r10 & 1
            r13 = -238551041(0xfffffffff1c7ffff, float:-1.9807039E30)
            if (r12 == 0) goto Lf8
            boolean r12 = r0.B()
            if (r12 == 0) goto Le1
            goto Lf8
        Le1:
            r0.V()
            r1 = r38 & 2
            if (r1 == 0) goto Lea
            r11 = r11 & (-113(0xffffffffffffff8f, float:NaN))
        Lea:
            r1 = r11 & r13
            r15 = r32
            r16 = r33
            r17 = r34
            r11 = r2
        Lf3:
            r12 = r4
            r13 = r6
            r20 = r9
            goto L142
        Lf8:
            if (r1 == 0) goto Lfd
            x64 r1 = defpackage.x64.a
            goto Lfe
        Lfd:
            r1 = r2
        Lfe:
            r2 = r38 & 2
            if (r2 == 0) goto L109
            pr3 r2 = defpackage.qr3.a(r0)
            r11 = r11 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r2
        L109:
            if (r5 == 0) goto L112
            pq4 r2 = new pq4
            r5 = 0
            r2.<init>(r5, r5, r5, r5)
            r6 = r2
        L112:
            if (r8 == 0) goto L117
            d40 r2 = defpackage.d90.h0
            r9 = r2
        L117:
            oc1 r2 = defpackage.eo6.a(r0)
            boolean r5 = r0.f(r2)
            java.lang.Object r8 = r0.P()
            if (r5 != 0) goto L129
            vs0 r5 = defpackage.ox0.a
            if (r8 != r5) goto L131
        L129:
            wd1 r8 = new wd1
            r8.<init>(r2)
            r0.l0(r8)
        L131:
            r2 = r8
            wd1 r2 = (defpackage.wd1) r2
            sg r5 = defpackage.xp4.a(r0)
            r8 = r11 & r13
            r11 = r1
            r15 = r2
            r17 = r5
            r1 = r8
            r16 = r14
            goto Lf3
        L142:
            r0.q()
            r2 = r1 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r24 = r2 | r4
            int r2 = r1 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r4 = r1 >> 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r1 = r1 >> 18
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r25 = r2 | r1
            r26 = 1792(0x700, float:2.511E-42)
            r14 = 0
            r18 = 0
            r19 = 0
            r23 = r0
            r22 = r3
            r21 = r7
            defpackage.jx2.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r5 = r20
            goto L192
        L183:
            r23 = r0
            r23.V()
            r7 = r33
            r8 = r34
            r1 = r2
            r2 = r4
            r3 = r6
            r5 = r9
            r6 = r32
        L192:
            cf5 r13 = r23.t()
            if (r13 == 0) goto L1a6
            l90 r0 = new l90
            r12 = 2
            r4 = r30
            r9 = r35
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.d = r0
        L1a6:
            return
    }

    public static final void g(defpackage.zv0 r9, defpackage.px0 r10, int r11) {
            xq2 r10 = (defpackage.xq2) r10
            r0 = -709502251(0xffffffffd5b5dad5, float:-2.4993935E13)
            r10.d0(r0)
            r0 = r11 & 3
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = r2
        L11:
            r3 = r11 & 1
            boolean r0 = r10.S(r3, r0)
            if (r0 == 0) goto L79
            nq6 r0 = defpackage.s46.a
            java.lang.Object r3 = r10.j(r0)
            q46 r3 = (defpackage.q46) r3
            p46 r4 = defpackage.nj2.C(r10)
            java.lang.Object[] r5 = new java.lang.Object[]{r3}
            ep3 r6 = new ep3
            r6.<init>(r1, r2)
            bi2 r1 = new bi2
            r7 = 18
            r1.<init>(r7, r3, r4)
            ap3 r7 = new ap3
            r8 = 28
            r7.<init>(r8, r6, r1)
            boolean r1 = r10.h(r3)
            boolean r6 = r10.h(r4)
            r1 = r1 | r6
            java.lang.Object r6 = r10.P()
            if (r1 != 0) goto L4f
            vs0 r1 = defpackage.ox0.a
            if (r6 != r1) goto L59
        L4f:
            ci2 r6 = new ci2
            r1 = 11
            r6.<init>(r1, r3, r4)
            r10.l0(r6)
        L59:
            on2 r6 = (defpackage.on2) r6
            java.lang.Object r1 = defpackage.qo2.J(r5, r7, r6, r10, r2)
            rr3 r1 = (defpackage.rr3) r1
            pq r0 = r0.a(r1)
            ql1 r2 = new ql1
            r3 = 22
            r2.<init>(r3, r9, r1)
            r1 = -412824043(0xffffffffe764ce15, float:-1.0805011E24)
            zv0 r1 = defpackage.n16.I(r1, r2, r10)
            r2 = 56
            defpackage.hv.d(r0, r1, r10, r2)
            goto L7c
        L79:
            r10.V()
        L7c:
            cf5 r10 = r10.t()
            if (r10 == 0) goto L8a
            eq r0 = new eq
            r1 = 4
            r0.<init>(r9, r11, r1)
            r10.d = r0
        L8a:
            return
    }

    public static final void h(defpackage.px0 r6, defpackage.a74 r7) {
            fc r0 = defpackage.fc.m
            r1 = r6
            xq2 r1 = (defpackage.xq2) r1
            long r2 = r1.T
            int r2 = java.lang.Long.hashCode(r2)
            a74 r7 = defpackage.l.E(r6, r7)
            xv4 r1 = r1.l()
            ix0 r3 = defpackage.jx0.i
            r3.getClass()
            iy0 r3 = defpackage.ix0.b
            r4 = r6
            xq2 r4 = (defpackage.xq2) r4
            r4.f0()
            boolean r5 = r4.S
            if (r5 == 0) goto L28
            r4.k(r3)
            goto L2b
        L28:
            r4.o0()
        L2b:
            pn r3 = defpackage.ix0.f
            defpackage.yh2.K(r6, r3, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r6, r0, r1)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r6, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r6, r0, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            pn r0 = defpackage.ix0.g
            defpackage.yh2.K(r6, r0, r7)
            r6 = 1
            r4.p(r6)
            return
    }

    public static final float i(defpackage.cx4 r6, boolean r7, defpackage.hy2[] r8, float r9) {
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.c(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
    }

    public static final void j(defpackage.x32 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof defpackage.hs6
            if (r0 == 0) goto Lb
            r0 = r1
            hs6 r0 = (defpackage.hs6) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Class r1 = r1.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r0 = "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got "
            defpackage.e41.z(r1, r0)
            return
    }

    public static final void k(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L14
            java.lang.String r1 = "?"
            r2.append(r1)
            int r1 = r3 + (-1)
            if (r0 >= r1) goto L11
            java.lang.String r1 = ","
            r2.append(r1)
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    public static final defpackage.yd3 l(defpackage.sc1 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.yd3
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = r2
            yd3 r0 = (defpackage.yd3) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.Class r2 = r2.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r0 = "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got "
            defpackage.e41.z(r2, r0)
            return r1
    }

    public static final java.lang.Object m(defpackage.gx3 r2, defpackage.s41 r3) {
            boolean r0 = r2.isDone()     // Catch: java.util.concurrent.ExecutionException -> L30
            if (r0 == 0) goto Lb
            java.lang.Object r2 = defpackage.r1.f(r2)     // Catch: java.util.concurrent.ExecutionException -> L30
            return r2
        Lb:
            rj0 r0 = new rj0
            r41 r3 = defpackage.np2.V(r3)
            r1 = 1
            r0.<init>(r1, r3)
            m67 r3 = new m67
            r3.<init>(r2, r0, r1)
            sj1 r1 = defpackage.sj1.INSTANCE
            r2.a(r1, r3)
            mc r3 = new mc
            r1 = 19
            r3.<init>(r2, r1)
            r0.z(r3)
            java.lang.Object r2 = r0.s()
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r2
        L30:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            if (r2 == 0) goto L38
            throw r2
        L38:
            ti3 r2 = new ti3
            r2.<init>()
            java.lang.Class<nb3> r3 = defpackage.nb3.class
            java.lang.String r3 = r3.getName()
            defpackage.nb3.V(r2, r3)
            throw r2
    }

    public static double o(double r1, double r3, double r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.<init>(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static float p(float r2, float r3, float r4) {
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r4
        Le:
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static int q(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static int r(int r3, defpackage.l93 r4) {
            int r0 = r4.B
            int r1 = r4.A
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r4 = r4.intValue()
            if (r3 >= r4) goto L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r3 = r3.intValue()
            return r3
        L1d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r4 = r4.intValue()
            if (r3 <= r4) goto L2f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r3 = r3.intValue()
        L2f:
            return r3
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.<init>(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public static long s(long r1, long r3, long r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.String r0 = " is less than minimum "
            java.lang.StringBuilder r2 = defpackage.xg6.s(r5, r2, r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Comparable t(java.lang.Comparable r3, defpackage.bs0 r4) {
            r4.getClass()
            float r0 = r4.b
            float r1 = r4.a
            boolean r2 = r4.c()
            if (r2 != 0) goto L3f
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            boolean r4 = defpackage.bs0.d(r3, r4)
            if (r4 == 0) goto L26
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            boolean r4 = defpackage.bs0.d(r4, r3)
            if (r4 != 0) goto L26
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            return r3
        L26:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            boolean r4 = defpackage.bs0.d(r4, r3)
            if (r4 == 0) goto L3e
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            boolean r4 = defpackage.bs0.d(r3, r4)
            if (r4 != 0) goto L3e
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
        L3e:
            return r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.<init>(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public static final defpackage.qa4 u(defpackage.r94 r4, defpackage.px0 r5) {
            xq2 r5 = (defpackage.xq2) r5
            java.lang.Object r0 = r5.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L13
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r5.l0(r0)
        L13:
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r2 = r5.P()
            if (r2 != r1) goto L25
            vg2 r2 = new vg2
            r1 = 1
            r3 = 0
            r2.<init>(r4, r0, r3, r1)
            r5.l0(r2)
        L25:
            eo2 r2 = (defpackage.eo2) r2
            defpackage.mb3.i(r5, r2, r4)
            return r0
    }

    public static byte[] v(java.lang.String r4, byte[] r5, byte[] r6, byte[] r7, int r8) {
            p42 r0 = defpackage.p42.f
            java.lang.Object r0 = r0.a(r4)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            int r1 = r0.getMacLength()
            int r1 = r1 * 255
            if (r8 > r1) goto L5d
            int r1 = r6.length
            if (r1 != 0) goto L22
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            int r1 = r0.getMacLength()
            byte[] r1 = new byte[r1]
            r6.<init>(r1, r4)
            r0.init(r6)
            goto L2a
        L22:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            r1.<init>(r6, r4)
            r0.init(r1)
        L2a:
            byte[] r5 = r0.doFinal(r5)
            byte[] r6 = new byte[r8]
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            r1.<init>(r5, r4)
            r0.init(r1)
            r4 = 0
            byte[] r5 = new byte[r4]
            r1 = 1
            r2 = r4
        L3d:
            r0.update(r5)
            r0.update(r7)
            byte r5 = (byte) r1
            r0.update(r5)
            byte[] r5 = r0.doFinal()
            int r3 = r5.length
            int r3 = r3 + r2
            if (r3 >= r8) goto L58
            int r3 = r5.length
            java.lang.System.arraycopy(r5, r4, r6, r2, r3)
            int r3 = r5.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3d
        L58:
            int r8 = r8 - r2
            java.lang.System.arraycopy(r5, r4, r6, r2, r8)
            return r6
        L5d:
            java.lang.String r4 = "size too large"
            defpackage.e41.v(r4)
            r4 = 0
            return r4
    }

    public static int w(defpackage.sg5 r0, defpackage.ts1 r1, android.view.View r2, android.view.View r3, defpackage.gg5 r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L35
            int r0 = r0.b()
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            if (r3 != 0) goto L11
            goto L35
        L11:
            if (r5 != 0) goto L23
            int r0 = defpackage.gg5.G(r2)
            int r1 = defpackage.gg5.G(r3)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + 1
            return r0
        L23:
            int r0 = r1.d(r3)
            int r2 = r1.g(r2)
            int r0 = r0 - r2
            int r1 = r1.n()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L35:
            r0 = 0
            return r0
    }

    public static int x(defpackage.sg5 r3, defpackage.ts1 r4, android.view.View r5, android.view.View r6, defpackage.gg5 r7, boolean r8, boolean r9) {
            int r7 = r7.v()
            r0 = 0
            if (r7 == 0) goto L70
            int r7 = r3.b()
            if (r7 == 0) goto L70
            if (r5 == 0) goto L70
            if (r6 != 0) goto L12
            goto L70
        L12:
            int r7 = defpackage.gg5.G(r5)
            int r1 = defpackage.gg5.G(r6)
            int r7 = java.lang.Math.min(r7, r1)
            int r1 = defpackage.gg5.G(r5)
            int r2 = defpackage.gg5.G(r6)
            int r1 = java.lang.Math.max(r1, r2)
            if (r9 == 0) goto L38
            int r3 = r3.b()
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r0, r3)
            goto L3c
        L38:
            int r3 = java.lang.Math.max(r0, r7)
        L3c:
            if (r8 != 0) goto L3f
            return r3
        L3f:
            int r7 = r4.d(r6)
            int r8 = r4.g(r5)
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = defpackage.gg5.G(r5)
            int r6 = defpackage.gg5.G(r6)
            int r8 = r8 - r6
            int r6 = java.lang.Math.abs(r8)
            int r6 = r6 + 1
            float r7 = (float) r7
            float r6 = (float) r6
            float r7 = r7 / r6
            float r3 = (float) r3
            float r3 = r3 * r7
            int r6 = r4.m()
            int r4 = r4.g(r5)
            int r6 = r6 - r4
            float r4 = (float) r6
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            return r3
        L70:
            return r0
    }

    public static int y(defpackage.sg5 r0, defpackage.ts1 r1, android.view.View r2, android.view.View r3, defpackage.gg5 r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L3b
            int r4 = r0.b()
            if (r4 == 0) goto L3b
            if (r2 == 0) goto L3b
            if (r3 != 0) goto L11
            goto L3b
        L11:
            if (r5 != 0) goto L18
            int r0 = r0.b()
            return r0
        L18:
            int r4 = r1.d(r3)
            int r1 = r1.g(r2)
            int r4 = r4 - r1
            int r1 = defpackage.gg5.G(r2)
            int r2 = defpackage.gg5.G(r3)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            float r2 = (float) r4
            float r1 = (float) r1
            float r2 = r2 / r1
            int r0 = r0.b()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            return r0
        L3b:
            r0 = 0
            return r0
    }

    public abstract java.lang.Object D(defpackage.j41 r1);

    public abstract void K(int r1);

    public abstract void L(android.graphics.Typeface r1);

    public abstract void M(android.graphics.Typeface r1, boolean r2);

    public void n(int r4) {
            r3 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            om r1 = new om
            r2 = 5
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    public abstract boolean z(defpackage.j41 r1);
}
