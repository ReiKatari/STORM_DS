package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp2  reason: default package */
/* loaded from: classes.dex */
public abstract class mp2 {
    public static defpackage.e33 a = null;
    public static final /* synthetic */ int b = 0;
    public static boolean c = true;
    public static java.lang.reflect.Field d;
    public static boolean e;

    public static int A(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r2 = defpackage.qo2.M(r1, r2)
            if (r2 == 0) goto L16
            int r0 = r2.resourceId
            if (r0 == 0) goto Lf
            int r1 = r1.getColor(r0)
            goto L11
        Lf:
            int r1 = r2.data
        L11:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1e
            int r1 = r1.intValue()
            return r1
        L1e:
            return r3
    }

    public static int B(android.view.View r2, int r3) {
            android.content.Context r0 = r2.getContext()
            android.content.Context r1 = r2.getContext()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            android.util.TypedValue r2 = defpackage.qo2.O(r1, r3, r2)
            int r3 = r2.resourceId
            if (r3 == 0) goto L1d
            int r2 = r0.getColor(r3)
            return r2
        L1d:
            int r2 = r2.data
            return r2
    }

    public static java.lang.String C(defpackage.rh r1, int r2) {
            r1.getClass()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 > r0) goto Ld
            java.lang.String r1 = java.lang.String.valueOf(r2)
            return r1
        Ld:
            android.content.Context r1 = r1.a     // Catch: android.content.res.Resources.NotFoundException -> L1e
            r1.getClass()     // Catch: android.content.res.Resources.NotFoundException -> L1e
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L1e
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L1e
            r1.getClass()     // Catch: android.content.res.Resources.NotFoundException -> L1e
            return r1
        L1e:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            return r1
    }

    public static final float D(android.text.Layout r4, int r5, android.graphics.Paint r6) {
            float r0 = r4.getLineLeft(r5)
            java.lang.ThreadLocal r1 = defpackage.d47.a
            int r1 = r4.getEllipsisCount(r5)
            r2 = 0
            if (r1 <= 0) goto L59
            int r1 = r4.getParagraphDirection(r5)
            r3 = 1
            if (r1 != r3) goto L59
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L59
            int r1 = r4.getLineStart(r5)
            int r2 = r4.getEllipsisStart(r5)
            int r2 = r2 + r1
            float r1 = r4.getPrimaryHorizontal(r2)
            float r1 = r1 - r0
            java.lang.String r2 = "…"
            float r6 = r6.measureText(r2)
            float r6 = r6 + r1
            android.text.Layout$Alignment r5 = r4.getParagraphAlignment(r5)
            if (r5 != 0) goto L35
            r5 = -1
            goto L3d
        L35:
            int[] r1 = defpackage.h43.a
            int r5 = r5.ordinal()
            r5 = r1[r5]
        L3d:
            if (r5 != r3) goto L4e
            float r5 = java.lang.Math.abs(r0)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
        L4c:
            float r4 = r4 + r5
            return r4
        L4e:
            float r5 = java.lang.Math.abs(r0)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r6
            goto L4c
        L59:
            return r2
    }

    public static final float E(android.text.Layout r3, int r4, android.graphics.Paint r5) {
            java.lang.ThreadLocal r0 = defpackage.d47.a
            int r0 = r3.getEllipsisCount(r4)
            if (r0 <= 0) goto L6d
            int r0 = r3.getParagraphDirection(r4)
            r1 = -1
            if (r0 != r1) goto L6d
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r2 = r3.getLineRight(r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r3.getLineStart(r4)
            int r2 = r3.getEllipsisStart(r4)
            int r2 = r2 + r0
            float r0 = r3.getPrimaryHorizontal(r2)
            float r2 = r3.getLineRight(r4)
            float r2 = r2 - r0
            java.lang.String r0 = "…"
            float r5 = r5.measureText(r0)
            float r5 = r5 + r2
            android.text.Layout$Alignment r0 = r3.getParagraphAlignment(r4)
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            int[] r1 = defpackage.h43.a
            int r0 = r0.ordinal()
            r1 = r1[r0]
        L44:
            r0 = 1
            if (r1 != r0) goto L5c
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r3.getLineRight(r4)
            float r0 = r0 - r4
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
        L5a:
            float r0 = r0 - r3
            return r0
        L5c:
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r3.getLineRight(r4)
            float r0 = r0 - r4
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r5
            goto L5a
        L6d:
            r3 = 0
            return r3
    }

    public static final defpackage.ws1 F() {
            boolean r0 = defpackage.ws1.d()
            if (r0 == 0) goto L12
            ws1 r0 = defpackage.ws1.a()
            int r1 = r0.c()
            r2 = 1
            if (r1 != r2) goto L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static defpackage.qb6 G(defpackage.ic4 r2) {
            r2.getClass()
            x84 r0 = new x84
            r1 = 10
            r0.<init>(r1)
            qb6 r2 = defpackage.sb6.Z(r2, r0)
            return r2
    }

    public static java.lang.String H(int r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r2 & 4
            if (r1 == 0) goto Le
            java.lang.String r1 = "IMAGE_CAPTURE"
            r0.add(r1)
        Le:
            r1 = r2 & 1
            if (r1 == 0) goto L17
            java.lang.String r1 = "PREVIEW"
            r0.add(r1)
        L17:
            r2 = r2 & 2
            if (r2 == 0) goto L20
            java.lang.String r2 = "VIDEO_CAPTURE"
            r0.add(r2)
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
        L2f:
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.append(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.String r1 = "|"
            r2.append(r1)
            goto L2f
        L44:
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static final defpackage.q45 I(long r3) {
            r0 = 25769803776(0x600000000, double:1.2731974746E-313)
            long r3 = r3 & r0
            q45 r0 = defpackage.q45.DEFAULT
            long r1 = r0.getSignature$kotlinx_serialization_protobuf()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L11
            return r0
        L11:
            q45 r0 = defpackage.q45.SIGNED
            long r1 = r0.getSignature$kotlinx_serialization_protobuf()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L1c
            return r0
        L1c:
            q45 r3 = defpackage.q45.FIXED
            return r3
    }

    public static final defpackage.e33 J() {
            e33 r0 = defpackage.mp2.a
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "AutoMirrored.Filled.KeyboardArrowRight"
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
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 32
            r2.<init>(r3)
            tt4 r3 = new tt4
            r4 = 1091137700(0x410970a4, float:8.59)
            r5 = 1099216978(0x4184b852, float:16.59)
            r3.<init>(r4, r5)
            r2.add(r3)
            st4 r3 = new st4
            r5 = 1095940178(0x4152b852, float:13.17)
            r6 = 1094713344(0x41400000, float:12.0)
            r3.<init>(r5, r6)
            r2.add(r3)
            st4 r3 = new st4
            r5 = 1089281720(0x40ed1eb8, float:7.41)
            r3.<init>(r4, r5)
            r2.add(r3)
            st4 r3 = new st4
            r4 = 1092616192(0x41200000, float:10.0)
            r5 = 1086324736(0x40c00000, float:6.0)
            r3.<init>(r4, r5)
            r2.add(r3)
            au4 r3 = new au4
            r3.<init>(r5, r5)
            r2.add(r3)
            au4 r3 = new au4
            r4 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r3.<init>(r4, r5)
            r2.add(r3)
            au4 r3 = new au4
            r4 = -1078691103(0xffffffffbfb47ae1, float:-1.41)
            r3.<init>(r4, r4)
            r2.add(r3)
            pt4 r3 = defpackage.pt4.c
            r2.add(r3)
            r3 = 0
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.mp2.a = r0
            return r0
    }

    public static boolean L(int r21) {
            if (r21 == 0) goto Lcb
            java.lang.ThreadLocal r1 = defpackage.tt0.a
            java.lang.Object r2 = r1.get()
            double[] r2 = (double[]) r2
            r3 = 3
            if (r2 != 0) goto L12
            double[] r2 = new double[r3]
            r1.set(r2)
        L12:
            int r1 = android.graphics.Color.red(r21)
            int r4 = android.graphics.Color.green(r21)
            int r5 = android.graphics.Color.blue(r21)
            int r6 = r2.length
            if (r6 != r3) goto Lc3
            double r6 = (double) r1
            r8 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r6 = r6 / r8
            r10 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r12 = 4612586738352862003(0x4003333333333333, double:2.4)
            r14 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r16 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r18 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r1 >= 0) goto L48
            double r6 = r6 / r18
            goto L4f
        L48:
            double r6 = r6 + r16
            double r6 = r6 / r14
            double r6 = java.lang.Math.pow(r6, r12)
        L4f:
            double r3 = (double) r4
            double r3 = r3 / r8
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L5a
            double r3 = r3 / r18
        L57:
            r20 = 0
            goto L62
        L5a:
            double r3 = r3 + r16
            double r3 = r3 / r14
            double r3 = java.lang.Math.pow(r3, r12)
            goto L57
        L62:
            double r0 = (double) r5
            double r0 = r0 / r8
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 >= 0) goto L6b
            double r0 = r0 / r18
            goto L72
        L6b:
            double r0 = r0 + r16
            double r0 = r0 / r14
            double r0 = java.lang.Math.pow(r0, r12)
        L72:
            r8 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r8 = r8 * r6
            r10 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r10 = r10 * r3
            double r10 = r10 + r8
            r8 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r8 = r8 * r0
            double r8 = r8 + r10
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r10
            r2[r20] = r8
            r8 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r8 = r8 * r6
            r12 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r12 = r12 * r3
            double r12 = r12 + r8
            r8 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r8 = r8 * r0
            double r8 = r8 + r12
            double r8 = r8 * r10
            r5 = 1
            r2[r5] = r8
            r12 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r6 = r6 * r12
            r12 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r3 = r3 * r12
            double r3 = r3 + r6
            r6 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r0 = r0 * r6
            double r0 = r0 + r3
            double r0 = r0 * r10
            r3 = 2
            r2[r3] = r0
            double r8 = r8 / r10
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lcd
            return r5
        Lc3:
            r20 = 0
            java.lang.String r0 = "outXyz must have a length of 3."
            defpackage.i.h(r0)
            return r20
        Lcb:
            r20 = 0
        Lcd:
            return r20
    }

    public static final boolean M(defpackage.lr3 r1, int r2) {
            int r0 = r1.c()
            int r1 = r1.e()
            if (r2 > r1) goto Le
            if (r0 > r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static final boolean N(long r2) {
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public static final boolean O(defpackage.wb6 r3) {
            r3.getClass()
            boolean r0 = r3.h()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            int r0 = r3.f()
            if (r0 != r1) goto L31
            wb6 r3 = r3.j(r2)
            boolean r3 = O(r3)
            if (r3 == 0) goto L31
            goto L30
        L1c:
            np2 r0 = r3.e()
            boolean r0 = r0 instanceof defpackage.v25
            if (r0 == 0) goto L31
            np2 r3 = r3.e()
            v25 r0 = defpackage.v25.m
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 != 0) goto L31
        L30:
            return r1
        L31:
            return r2
    }

    public static final boolean P(defpackage.u16 r6) {
            long r0 = r6.e
            r2 = 32
            long r2 = r0 >>> r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.g
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.h
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L24
            r6 = 1
            return r6
        L24:
            r6 = 0
            return r6
    }

    public static int Q(float r1, int r2, int r3) {
            int r0 = android.graphics.Color.alpha(r3)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)
            int r1 = defpackage.tt0.d(r3, r1)
            int r1 = defpackage.tt0.b(r1, r2)
            return r1
    }

    public static final void R(float[] r16, float[] r17, int r18, float[] r19) {
            r0 = r18
            if (r0 != 0) goto L9
            java.lang.String r1 = "At least one point must be provided"
            defpackage.p53.a(r1)
        L9:
            r1 = 2
            if (r1 < r0) goto Le
            int r1 = r0 + (-1)
        Le:
            int r2 = r1 + 1
            float[][] r3 = new float[r2]
            r4 = 0
            r5 = r4
        L14:
            if (r5 >= r2) goto L1d
            float[] r6 = new float[r0]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L14
        L1d:
            r5 = r4
        L1e:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 >= r0) goto L3c
            r7 = r3[r4]
            r7[r5] = r6
            r6 = 1
        L27:
            if (r6 >= r2) goto L39
            int r7 = r6 + (-1)
            r7 = r3[r7]
            r7 = r7[r5]
            r8 = r16[r5]
            float r7 = r7 * r8
            r8 = r3[r6]
            r8[r5] = r7
            int r6 = r6 + 1
            goto L27
        L39:
            int r5 = r5 + 1
            goto L1e
        L3c:
            float[][] r5 = new float[r2]
            r7 = r4
        L3f:
            if (r7 >= r2) goto L48
            float[] r8 = new float[r0]
            r5[r7] = r8
            int r7 = r7 + 1
            goto L3f
        L48:
            float[][] r7 = new float[r2]
            r8 = r4
        L4b:
            if (r8 >= r2) goto L54
            float[] r9 = new float[r2]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L4b
        L54:
            r8 = r4
        L55:
            if (r8 >= r2) goto Lb4
            r9 = r5[r8]
            r10 = r3[r8]
            r10.getClass()
            r9.getClass()
            java.lang.System.arraycopy(r10, r4, r9, r4, r0)
            r10 = r4
        L65:
            if (r10 >= r8) goto L7e
            r11 = r5[r10]
            float r12 = s(r9, r11)
            r13 = r4
        L6e:
            if (r13 >= r0) goto L7b
            r14 = r9[r13]
            r15 = r11[r13]
            float r15 = r15 * r12
            float r14 = r14 - r15
            r9[r13] = r14
            int r13 = r13 + 1
            goto L6e
        L7b:
            int r10 = r10 + 1
            goto L65
        L7e:
            float r10 = s(r9, r9)
            double r10 = (double) r10
            double r10 = java.lang.Math.sqrt(r10)
            float r10 = (float) r10
            r11 = 897988541(0x358637bd, float:1.0E-6)
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 >= 0) goto L90
            r10 = r11
        L90:
            float r10 = r6 / r10
            r11 = r4
        L93:
            if (r11 >= r0) goto L9d
            r12 = r9[r11]
            float r12 = r12 * r10
            r9[r11] = r12
            int r11 = r11 + 1
            goto L93
        L9d:
            r10 = r7[r8]
            r11 = r4
        La0:
            if (r11 >= r2) goto Lb1
            if (r11 >= r8) goto La6
            r12 = 0
            goto Lac
        La6:
            r12 = r3[r11]
            float r12 = s(r9, r12)
        Lac:
            r10[r11] = r12
            int r11 = r11 + 1
            goto La0
        Lb1:
            int r8 = r8 + 1
            goto L55
        Lb4:
            r0 = r1
        Lb5:
            r2 = -1
            if (r2 >= r0) goto Lda
            r2 = r5[r0]
            r3 = r17
            float r2 = s(r2, r3)
            r4 = r7[r0]
            int r6 = r0 + 1
            if (r6 > r1) goto Ld2
            r8 = r1
        Lc7:
            r9 = r4[r8]
            r10 = r19[r8]
            float r9 = r9 * r10
            float r2 = r2 - r9
            if (r8 == r6) goto Ld2
            int r8 = r8 + (-1)
            goto Lc7
        Ld2:
            r4 = r4[r0]
            float r2 = r2 / r4
            r19[r0] = r2
            int r0 = r0 + (-1)
            goto Lb5
        Lda:
            return
    }

    public static defpackage.q54 S(java.nio.MappedByteBuffer r14) {
            java.nio.ByteBuffer r14 = r14.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r14.order(r0)
            int r0 = r14.position()
            int r0 = r0 + 4
            r14.position(r0)
            short r0 = r14.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            r2 = 0
            java.lang.String r3 = "Cannot read metadata."
            if (r0 > r1) goto Ld4
            int r1 = r14.position()
            int r1 = r1 + 6
            r14.position(r1)
            r1 = 0
            r4 = r1
        L2c:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = -1
            if (r4 >= r0) goto L5a
            int r9 = r14.getInt()
            int r10 = r14.position()
            int r10 = r10 + 4
            r14.position(r10)
            int r10 = r14.getInt()
            long r10 = (long) r10
            long r10 = r10 & r5
            int r12 = r14.position()
            int r12 = r12 + 4
            r14.position(r12)
            r12 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r12 != r9) goto L57
            goto L5b
        L57:
            int r4 = r4 + 1
            goto L2c
        L5a:
            r10 = r7
        L5b:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto Ld0
            int r0 = r14.position()
            long r7 = (long) r0
            long r7 = r10 - r7
            int r0 = (int) r7
            int r4 = r14.position()
            int r4 = r4 + r0
            r14.position(r4)
            int r0 = r14.position()
            int r0 = r0 + 12
            r14.position(r0)
            int r0 = r14.getInt()
            long r7 = (long) r0
            long r7 = r7 & r5
        L7e:
            long r12 = (long) r1
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto Ld0
            int r0 = r14.getInt()
            int r4 = r14.getInt()
            long r12 = (long) r4
            long r12 = r12 & r5
            r14.getInt()
            r4 = 1164798569(0x456d6a69, float:3798.6506)
            if (r4 == r0) goto L9e
            r4 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r4 != r0) goto L9b
            goto L9e
        L9b:
            int r1 = r1 + 1
            goto L7e
        L9e:
            long r12 = r12 + r10
            int r0 = (int) r12
            r14.position(r0)
            q54 r0 = new q54
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r1)
            int r1 = r14.position()
            int r1 = r14.getInt(r1)
            int r2 = r14.position()
            int r2 = r2 + r1
            r0.R = r14
            r0.A = r2
            int r14 = r14.getInt(r2)
            int r2 = r2 - r14
            r0.B = r2
            java.lang.Object r14 = r0.R
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            short r14 = r14.getShort(r2)
            r0.L = r14
            return r0
        Ld0:
            defpackage.e41.i(r3)
            return r2
        Ld4:
            defpackage.e41.i(r3)
            return r2
    }

    public static final defpackage.j37 T(defpackage.px0 r2) {
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r0 = r2.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L12
            j37 r0 = new j37
            r0.<init>()
            r2.l0(r0)
        L12:
            j37 r0 = (defpackage.j37) r0
            return r0
    }

    public static final boolean U(defpackage.ja4 r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.Object r0 = r3.g(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof defpackage.ka4
            if (r2 == 0) goto L1e
            ka4 r0 = (defpackage.ka4) r0
            boolean r5 = r0.l(r5)
            if (r5 == 0) goto L1d
            boolean r0 = r0.g()
            if (r0 == 0) goto L1d
            r3.k(r4)
        L1d:
            return r5
        L1e:
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L29
            r3.k(r4)
            r3 = 1
            return r3
        L29:
            return r1
    }

    public static final void V(java.util.List r3, defpackage.qn2 r4) {
            r3.getClass()
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            java.lang.Object r2 = r4.g(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            r1 = -1
        L23:
            if (r1 < 0) goto L28
            r3.remove(r1)
        L28:
            return
    }

    public static final void W(defpackage.ja4 r13, java.lang.Object r14) {
            long[] r0 = r13.a
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
            r2 = 0
            r3 = r2
        L9:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L23:
            if (r8 >= r6) goto L55
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L51
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Object[] r10 = r13.b
            r10 = r10[r9]
            java.lang.Object[] r10 = r13.c
            r10 = r10[r9]
            boolean r11 = r10 instanceof defpackage.ka4
            if (r11 == 0) goto L47
            ka4 r10 = (defpackage.ka4) r10
            r10.l(r14)
            boolean r10 = r10.g()
            goto L4c
        L47:
            if (r10 != r14) goto L4b
            r10 = 1
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L51
            r13.l(r9)
        L51:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L23
        L55:
            if (r6 != r7) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto L9
        L5c:
            return
    }

    public static final boolean X(me.magnum.melonds.domain.model.VideoRenderer r1, boolean r2) {
            r1.getClass()
            int[] r0 = defpackage.tj5.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1d
            r2 = 2
            if (r1 == r2) goto L1c
            r2 = 3
            r0 = 0
            if (r1 == r2) goto L1c
            r2 = 4
            if (r1 != r2) goto L19
            goto L1c
        L19:
            defpackage.i.d()
        L1c:
            return r0
        L1d:
            return r2
    }

    public static final java.lang.Object Z(defpackage.o66 r2, boolean r3, defpackage.o66 r4, defpackage.eo2 r5) {
            r0 = 0
            boolean r1 = r5 instanceof defpackage.d20     // Catch: java.lang.Throwable -> La defpackage.mk1 -> Lc
            if (r1 != 0) goto Le
            java.lang.Object r4 = defpackage.np2.k0(r5, r4, r2)     // Catch: java.lang.Throwable -> La defpackage.mk1 -> Lc
            goto L1d
        La:
            r4 = move-exception
            goto L17
        Lc:
            r3 = move-exception
            goto L57
        Le:
            r1 = 2
            defpackage.ge7.p(r1, r5)     // Catch: java.lang.Throwable -> La defpackage.mk1 -> Lc
            java.lang.Object r4 = r5.o(r4, r2)     // Catch: java.lang.Throwable -> La defpackage.mk1 -> Lc
            goto L1d
        L17:
            av0 r5 = new av0
            r5.<init>(r4, r0)
            r4 = r5
        L1d:
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L22
            goto L2a
        L22:
            java.lang.Object r0 = r2.d0(r4)
            gr1 r1 = defpackage.fd3.b
            if (r0 != r1) goto L2b
        L2a:
            return r5
        L2b:
            r2.w0()
            boolean r5 = r0 instanceof defpackage.av0
            if (r5 == 0) goto L52
            if (r3 != 0) goto L4d
            r3 = r0
            av0 r3 = (defpackage.av0) r3
            java.lang.Throwable r3 = r3.a
            boolean r5 = r3 instanceof defpackage.c67
            if (r5 == 0) goto L4d
            c67 r3 = (defpackage.c67) r3
            rc3 r3 = r3.A
            if (r3 != r2) goto L4d
            boolean r2 = r4 instanceof defpackage.av0
            if (r2 != 0) goto L48
            goto L56
        L48:
            av0 r4 = (defpackage.av0) r4
            java.lang.Throwable r2 = r4.a
            throw r2
        L4d:
            av0 r0 = (defpackage.av0) r0
            java.lang.Throwable r2 = r0.a
            throw r2
        L52:
            java.lang.Object r4 = defpackage.fd3.a(r0)
        L56:
            return r4
        L57:
            av0 r4 = new av0
            java.lang.Throwable r3 = r3.A
            r4.<init>(r3, r0)
            r2.b0(r4)
            throw r3
    }

    public static final void a(defpackage.a74 r27, defpackage.cp2 r28, defpackage.on2 r29, defpackage.px0 r30, int r31) {
            r2 = r28
            r3 = r29
            r27.getClass()
            r2.getClass()
            r3.getClass()
            r9 = r30
            xq2 r9 = (defpackage.xq2) r9
            r0 = -1995127703(0xffffffff8914c469, float:-1.7907204E-33)
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
            if (r1 == 0) goto L1d3
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
            r0 = 9
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
            long r6 = r1.j
            r3 = 1040522936(0x3e051eb8, float:0.13)
            long r6 = defpackage.kt0.c(r3, r6)
            a74 r0 = defpackage.vy7.L(r4, r6, r0)
            e40 r3 = defpackage.d90.Z
            r4 = 0
            e34 r3 = defpackage.h70.d(r3, r4)
            long r6 = r9.T
            int r4 = java.lang.Long.hashCode(r6)
            xv4 r6 = r9.l()
            a74 r0 = defpackage.l.E(r9, r0)
            r9.f0()
            boolean r7 = r9.S
            if (r7 == 0) goto L157
            r9.k(r10)
            goto L15a
        L157:
            r9.o0()
        L15a:
            defpackage.yh2.K(r9, r12, r3)
            defpackage.yh2.K(r9, r5, r6)
            defpackage.i61.w(r4, r9, r8, r9, r15)
            defpackage.yh2.K(r9, r13, r0)
            e33 r4 = defpackage.yh2.v()
            long r7 = r1.j
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
            defpackage.gi2.h(r9, r3)
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
            e33 r4 = J()
            long r7 = r1.i
            r1 = 1101004800(0x41a00000, float:20.0)
            a74 r6 = defpackage.dj6.i(r3, r1)
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 0
            r5 = 0
            defpackage.i13.a(r4, r5, r6, r7, r9, r10, r11)
            r9.p(r0)
            goto L1d6
        L1d3:
            r9.V()
        L1d6:
            cf5 r6 = r9.t()
            if (r6 == 0) goto L1eb
            x3 r0 = new x3
            r5 = 18
            r1 = r27
            r3 = r29
            r4 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1eb:
            return
    }

    public static java.lang.String a0(long r2) {
            java.lang.String r0 = "RASetId(id="
            java.lang.String r1 = ")"
            java.lang.String r2 = defpackage.lb1.i(r2, r0, r1)
            return r2
    }

    public static final defpackage.x25 b(java.lang.String r4, defpackage.v25 r5) {
            boolean r0 = defpackage.qs6.v0(r4)
            r1 = 0
            if (r0 != 0) goto L62
            p04 r0 = defpackage.a35.a
            java.util.Collection r0 = r0.values()
            r04 r0 = (defpackage.r04) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            r2 = r0
            o04 r2 = (defpackage.o04) r2
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L5c
            r2 = r0
            m04 r2 = (defpackage.m04) r2
            java.lang.Object r2 = r2.next()
            gg3 r2 = (defpackage.gg3) r2
            wb6 r3 = r2.e()
            java.lang.String r3 = r3.a()
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L34
            goto L13
        L34:
            java.lang.String r5 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            java.lang.String r0 = " there already exists "
            java.lang.StringBuilder r4 = defpackage.i61.t(r5, r4, r0)
            java.lang.Class r5 = r2.getClass()
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r4.append(r5)
            java.lang.String r5 = ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = defpackage.rs6.R(r4)
            defpackage.i.h(r4)
            return r1
        L5c:
            x25 r0 = new x25
            r0.<init>(r4, r5)
            return r0
        L62:
            java.lang.String r4 = "Blank serial names are prohibited"
            defpackage.i.h(r4)
            return r1
    }

    public static final defpackage.u16 c(float r17, float r18, float r19, float r20, long r21) {
            r0 = 32
            long r1 = r21 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r21 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r1
            long r0 = r5 << r0
            long r2 = r2 & r7
            long r9 = r0 | r2
            u16 r4 = new u16
            r11 = r9
            r13 = r9
            r15 = r9
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.<init>(r5, r6, r7, r8, r9, r11, r13, r15)
            return r4
    }

    public static final void d(defpackage.a74 r7, defpackage.zv0 r8, defpackage.px0 r9, int r10) {
            xq2 r9 = (defpackage.xq2) r9
            r0 = -1854833411(0xffffffff91717cfd, float:-1.9050063E-28)
            r9.d0(r0)
            boolean r0 = r9.f(r7)
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r10
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0 = r0 & r3
            boolean r0 = r9.S(r0, r1)
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r9.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L30
            fc r0 = defpackage.fc.k
            r9.l0(r0)
        L30:
            e34 r0 = (defpackage.e34) r0
            long r1 = r9.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r9.l()
            a74 r4 = defpackage.l.E(r9, r7)
            ix0 r5 = defpackage.jx0.i
            r5.getClass()
            iy0 r5 = defpackage.ix0.b
            r9.f0()
            boolean r6 = r9.S
            if (r6 == 0) goto L52
            r9.k(r5)
            goto L55
        L52:
            r9.o0()
        L55:
            pn r5 = defpackage.ix0.f
            defpackage.yh2.K(r9, r5, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r9, r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            pn r1 = defpackage.ix0.g
            defpackage.yh2.K(r9, r1, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r9, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r9, r0, r4)
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.o(r9, r0)
            r9.p(r3)
            goto L81
        L7e:
            r9.V()
        L81:
            cf5 r9 = r9.t()
            if (r9 == 0) goto L90
            sa5 r0 = new sa5
            r1 = 9
            r0.<init>(r7, r10, r1, r8)
            r9.d = r0
        L90:
            return
    }

    public static final void e(java.lang.String r17, defpackage.j37 r18, defpackage.qn2 r19, defpackage.on2 r20, defpackage.px0 r21, int r22, int r23) {
            r2 = r18
            r9 = r22
            r17.getClass()
            r2.getClass()
            r10 = r21
            xq2 r10 = (defpackage.xq2) r10
            r0 = 1637213593(0x6195e599, float:3.4563864E20)
            r10.d0(r0)
            r11 = r17
            boolean r0 = r10.f(r11)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r9
            boolean r1 = r10.f(r2)
            r3 = 32
            if (r1 == 0) goto L2a
            r1 = r3
            goto L2c
        L2a:
            r1 = 16
        L2c:
            r0 = r0 | r1
            r1 = r23 & 4
            if (r1 == 0) goto L36
            r0 = r0 | 384(0x180, float:5.38E-43)
        L33:
            r4 = r19
            goto L48
        L36:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L33
            r4 = r19
            boolean r5 = r10.h(r4)
            if (r5 == 0) goto L45
            r5 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r5 = 128(0x80, float:1.8E-43)
        L47:
            r0 = r0 | r5
        L48:
            r5 = r23 & 8
            if (r5 == 0) goto L52
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r6 = r20
        L50:
            r12 = r0
            goto L61
        L52:
            r6 = r20
            boolean r7 = r10.h(r6)
            if (r7 == 0) goto L5d
            r7 = 2048(0x800, float:2.87E-42)
            goto L5f
        L5d:
            r7 = 1024(0x400, float:1.435E-42)
        L5f:
            r0 = r0 | r7
            goto L50
        L61:
            r0 = r12 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r13 = 0
            r8 = 1
            if (r0 == r7) goto L6b
            r0 = r8
            goto L6c
        L6b:
            r0 = r13
        L6c:
            r7 = r12 & 1
            boolean r0 = r10.S(r7, r0)
            if (r0 == 0) goto L123
            vs0 r0 = defpackage.ox0.a
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r10.P()
            if (r1 != r0) goto L86
            h37 r1 = new h37
            r1.<init>(r13)
            r10.l0(r1)
        L86:
            qn2 r1 = (defpackage.qn2) r1
            r14 = r1
            goto L8b
        L8a:
            r14 = r4
        L8b:
            if (r5 == 0) goto L90
            r1 = 0
            r15 = r1
            goto L91
        L90:
            r15 = r6
        L91:
            vs4 r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L114
            r1 = 581821416(0x22ade3e8, float:4.713305E-18)
            r10.b0(r1)
            java.lang.Object r1 = r10.P()
            if (r1 != r0) goto Lb4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r1)
            r10.l0(r1)
        Lb4:
            qa4 r1 = (defpackage.qa4) r1
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != r3) goto Lbb
            goto Lbc
        Lbb:
            r8 = r13
        Lbc:
            java.lang.Object r3 = r10.P()
            if (r8 != 0) goto Lc8
            if (r3 != r0) goto Lc5
            goto Lc8
        Lc5:
            r13 = r1
            r8 = r2
            goto Le5
        Lc8:
            i4 r0 = new i4
            r7 = 0
            r8 = 10
            r3 = r1
            r1 = 0
            r4 = r3
            java.lang.Class<j37> r3 = defpackage.j37.class
            r5 = r4
            java.lang.String r4 = "cancel"
            r6 = r5
            java.lang.String r5 = "cancel$app()V"
            r16 = r6
            r6 = 0
            r13 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = r2
            r10.l0(r0)
            r3 = r0
        Le5:
            po2 r3 = (defpackage.po2) r3
            r1 = r3
            on2 r1 = (defpackage.on2) r1
            m4 r0 = new m4
            r0.<init>(r8, r14, r13)
            r2 = -111579201(0xfffffffff9596fbf, float:-7.056218E34)
            zv0 r2 = defpackage.n16.I(r2, r0, r10)
            e46 r0 = new e46
            r3 = 3
            r0.<init>(r8, r15, r13, r3)
            r3 = 1254270461(0x4ac2a5fd, float:6378238.5)
            zv0 r3 = defpackage.n16.I(r3, r0, r10)
            r0 = r12 & 14
            r6 = r0 | 3456(0xd80, float:4.843E-42)
            r7 = 16
            r4 = 0
            r5 = r10
            r0 = r11
            defpackage.q60.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            r5.p(r0)
            goto L120
        L114:
            r8 = r2
            r5 = r10
            r0 = r13
            r1 = 583975017(0x22cec069, float:5.6040134E-18)
            r5.b0(r1)
            r5.p(r0)
        L120:
            r3 = r14
            r4 = r15
            goto L12a
        L123:
            r8 = r2
            r5 = r10
            r5.V()
            r3 = r4
            r4 = r6
        L12a:
            cf5 r7 = r5.t()
            if (r7 == 0) goto L13d
            sp5 r0 = new sp5
            r1 = r17
            r6 = r23
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L13d:
            return
    }

    public static final int f(int r5, defpackage.ua4 r6) {
            int r0 = r6.L
            int r0 = r0 + (-1)
            r1 = 0
        L5:
            if (r1 >= r0) goto L27
            int r2 = r0 - r1
            int r2 = r2 / 2
            int r2 = r2 + r1
            java.lang.Object[] r3 = r6.A
            r4 = r3[r2]
            bb3 r4 = (defpackage.bb3) r4
            int r4 = r4.a
            if (r4 != r5) goto L17
            goto L23
        L17:
            if (r4 >= r5) goto L24
            int r1 = r2 + 1
            r3 = r3[r1]
            bb3 r3 = (defpackage.bb3) r3
            int r3 = r3.a
            if (r5 >= r3) goto L5
        L23:
            return r2
        L24:
            int r0 = r2 + (-1)
            goto L5
        L27:
            return r1
    }

    public static final void g(defpackage.ja4 r4, java.lang.Object r5, java.lang.Object r6) {
            int r0 = r4.f(r5)
            if (r0 >= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            java.lang.Object[] r2 = r4.c
            r2 = r2[r0]
        L11:
            if (r2 != 0) goto L14
            goto L2f
        L14:
            boolean r3 = r2 instanceof defpackage.ka4
            if (r3 == 0) goto L1f
            r3 = r2
            ka4 r3 = (defpackage.ka4) r3
            r3.a(r6)
            goto L2e
        L1f:
            if (r2 == r6) goto L2e
            ka4 r3 = new ka4
            r3.<init>()
            r3.a(r2)
            r3.a(r6)
            r6 = r3
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r1 == 0) goto L3b
            int r0 = ~r0
            java.lang.Object[] r1 = r4.b
            r1[r0] = r5
            java.lang.Object[] r4 = r4.c
            r4[r0] = r6
            return
        L3b:
            java.lang.Object[] r4 = r4.c
            r4[r0] = r6
            return
    }

    public static final void h(defpackage.j97 r17, defpackage.vy4 r18, long r19) {
            r0 = r18
            r1 = r17
            r2 = r19
            java.lang.Object r1 = r1.B
            bg1 r1 = (defpackage.bg1) r1
            r1.getClass()
            java.lang.Object r4 = r1.L
            rl7 r4 = (defpackage.rl7) r4
            java.lang.Object r5 = r1.B
            rl7 r5 = (defpackage.rl7) r5
            boolean r6 = defpackage.ej2.n(r0)
            long r7 = r0.b
            r9 = 0
            r11 = 0
            r12 = 0
            if (r6 == 0) goto L31
            yb1[] r6 = r5.d
            defpackage.fv.B0(r6, r11)
            r5.e = r12
            yb1[] r6 = r4.d
            defpackage.fv.B0(r6, r11)
            r4.e = r12
            r1.A = r9
        L31:
            boolean r6 = defpackage.ej2.p(r0)
            if (r6 != 0) goto L66
            java.util.List r6 = r0.b()
            int r13 = r6.size()
            r14 = r12
        L40:
            if (r14 >= r13) goto L5d
            java.lang.Object r15 = r6.get(r14)
            vx2 r15 = (defpackage.vx2) r15
            long r9 = r15.a
            r16 = r13
            long r12 = r15.e
            long r12 = defpackage.jk4.f(r12, r2)
            r1.e(r9, r12)
            int r14 = r14 + 1
            r13 = r16
            r9 = 0
            r12 = 0
            goto L40
        L5d:
            long r9 = r0.n
            long r2 = defpackage.jk4.f(r9, r2)
            r1.e(r7, r2)
        L66:
            boolean r0 = defpackage.ej2.p(r0)
            if (r0 == 0) goto L89
            long r2 = r1.A
            long r2 = r7 - r2
            r9 = 40
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L89
            yb1[] r0 = r5.d
            defpackage.fv.B0(r0, r11)
            r0 = 0
            r5.e = r0
            yb1[] r2 = r4.d
            defpackage.fv.B0(r2, r11)
            r4.e = r0
            r2 = 0
            r1.A = r2
        L89:
            r1.A = r7
            return
    }

    public static final java.lang.Object i(defpackage.lr3 r27, int r28, int r29, defpackage.qh1 r30, defpackage.s41 r31) {
            r1 = r28
            r0 = r30
            r2 = r31
            boolean r3 = r2 instanceof defpackage.sq3
            if (r3 == 0) goto L19
            r3 = r2
            sq3 r3 = (defpackage.sq3) r3
            int r4 = r3.k0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.k0 = r4
            goto L1e
        L19:
            sq3 r3 = new sq3
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.j0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.k0
            r6 = 30
            r7 = 0
            r8 = 2
            r9 = 0
            r11 = 1
            if (r5 == 0) goto L63
            if (r5 == r11) goto L3f
            if (r5 != r8) goto L39
            int r0 = r3.d0
            lr3 r1 = r3.R
            defpackage.oi2.Y(r2)
            goto L211
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L3f:
            int r0 = r3.f0
            float r1 = r3.i0
            float r5 = r3.h0
            float r12 = r3.g0
            int r13 = r3.e0
            int r14 = r3.d0
            bh5 r15 = r3.Z
            dh5 r10 = r3.Y
            zg5 r8 = r3.X
            lr3 r9 = r3.R
            defpackage.oi2.Y(r2)     // Catch: defpackage.fc3 -> L5f
            r2 = r10
            r10 = r9
            r9 = r2
            r2 = r1
            r25 = r13
            r1 = r14
            goto L185
        L5f:
            r0 = move-exception
            r6 = r14
            goto L1c2
        L63:
            defpackage.oi2.Y(r2)
            float r2 = (float) r1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L6c
            goto L71
        L6c:
            java.lang.String r2 = "Index should be non-negative"
            defpackage.s53.a(r2)
        L71:
            r2 = 1159479296(0x451c4000, float:2500.0)
            float r2 = r0.e0(r2)     // Catch: defpackage.fc3 -> L1bd
            r5 = 1153138688(0x44bb8000, float:1500.0)
            float r5 = r0.e0(r5)     // Catch: defpackage.fc3 -> L1bd
            r8 = 1112014848(0x42480000, float:50.0)
            float r0 = r0.e0(r8)     // Catch: defpackage.fc3 -> L1bd
            zg5 r8 = new zg5     // Catch: defpackage.fc3 -> L1bd
            r8.<init>()     // Catch: defpackage.fc3 -> L1bd
            r8.A = r11     // Catch: defpackage.fc3 -> L1bd
            dh5 r9 = new dh5     // Catch: defpackage.fc3 -> L1bd
            r9.<init>()     // Catch: defpackage.fc3 -> L1bd
            uo r10 = defpackage.ak7.f(r7, r7, r6)     // Catch: defpackage.fc3 -> L1bd
            r9.A = r10     // Catch: defpackage.fc3 -> L1bd
            boolean r10 = M(r27, r28)     // Catch: defpackage.fc3 -> L1bd
            if (r10 != 0) goto L1ad
            r10 = r27
            f86 r12 = r10.c     // Catch: defpackage.fc3 -> Lf8
            pr3 r12 = (defpackage.pr3) r12     // Catch: defpackage.fc3 -> Lf8
            int r12 = r12.h()     // Catch: defpackage.fc3 -> Lf8
            if (r1 <= r12) goto Lab
            r12 = r11
            goto Lac
        Lab:
            r12 = 0
        Lac:
            bh5 r13 = new bh5     // Catch: defpackage.fc3 -> Lf8
            r13.<init>()     // Catch: defpackage.fc3 -> Lf8
            r13.A = r11     // Catch: defpackage.fc3 -> Lf8
            r23 = r2
            r2 = r0
            r0 = r12
            r12 = r23
            r25 = r29
            r24 = r13
        Lbd:
            r23 = r5
            boolean r5 = r8.A     // Catch: defpackage.fc3 -> L1a1
            if (r5 == 0) goto L214
            int r5 = r10.a     // Catch: defpackage.fc3 -> L1a7
            switch(r5) {
                case 0: goto Ld1;
                default: goto Lc8;
            }     // Catch: defpackage.fc3 -> L1a7
        Lc8:
            f86 r5 = r10.c     // Catch: defpackage.fc3 -> L1a7
            nr4 r5 = (defpackage.nr4) r5     // Catch: defpackage.fc3 -> L1a7
            int r5 = r5.n()     // Catch: defpackage.fc3 -> L1a7
            goto Ldb
        Ld1:
            f86 r5 = r10.c     // Catch: defpackage.fc3 -> L1a7
            pr3 r5 = (defpackage.pr3) r5     // Catch: defpackage.fc3 -> L1a7
            jr3 r5 = r5.j()     // Catch: defpackage.fc3 -> L1a7
            int r5 = r5.n     // Catch: defpackage.fc3 -> L1a7
        Ldb:
            if (r5 <= 0) goto L214
            int r5 = r10.b(r1)     // Catch: defpackage.fc3 -> L1a1
            int r13 = java.lang.Math.abs(r5)     // Catch: defpackage.fc3 -> L1a1
            float r13 = (float) r13
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 >= 0) goto Lfd
            float r5 = (float) r5
            float r5 = java.lang.Math.abs(r5)     // Catch: defpackage.fc3 -> Lf8
            float r5 = java.lang.Math.max(r5, r2)     // Catch: defpackage.fc3 -> Lf8
            if (r0 == 0) goto Lf6
            goto L102
        Lf6:
            float r5 = -r5
            goto L102
        Lf8:
            r0 = move-exception
        Lf9:
            r6 = r1
        Lfa:
            r9 = r10
            goto L1c2
        Lfd:
            if (r0 == 0) goto L101
            r5 = r12
            goto L102
        L101:
            float r5 = -r12
        L102:
            java.lang.Object r13 = r9.A     // Catch: defpackage.fc3 -> L1a1
            uo r13 = (defpackage.uo) r13     // Catch: defpackage.fc3 -> L1a1
            uo r13 = defpackage.ak7.O(r13, r7, r7, r6)     // Catch: defpackage.fc3 -> L1a1
            r9.A = r13     // Catch: defpackage.fc3 -> L1a1
            ah5 r20 = new ah5     // Catch: defpackage.fc3 -> L1a1
            r20.<init>()     // Catch: defpackage.fc3 -> L1a1
            java.lang.Float r14 = new java.lang.Float     // Catch: defpackage.fc3 -> L1a7
            r14.<init>(r5)     // Catch: defpackage.fc3 -> L1a7
            java.lang.Object r15 = r9.A     // Catch: defpackage.fc3 -> L1a1
            uo r15 = (defpackage.uo) r15     // Catch: defpackage.fc3 -> L1a1
            java.lang.Object r15 = r15.a()     // Catch: defpackage.fc3 -> L1a1
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: defpackage.fc3 -> L1a1
            float r15 = r15.floatValue()     // Catch: defpackage.fc3 -> L1a1
            int r15 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r15 != 0) goto L12a
            r15 = r11
            goto L12b
        L12a:
            r15 = 0
        L12b:
            r15 = r15 ^ r11
            if (r0 == 0) goto L131
            r22 = r11
            goto L133
        L131:
            r22 = 0
        L133:
            rq3 r16 = new rq3     // Catch: defpackage.fc3 -> L1a1
            r18 = r1
            r19 = r5
            r21 = r8
            r26 = r9
            r17 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: defpackage.fc3 -> L199
            r9 = r17
            r6 = r18
            r8 = r21
            r5 = r23
            r1 = r24
            r7 = r25
            r10 = r26
            r3.R = r9     // Catch: defpackage.fc3 -> L195
            r3.X = r8     // Catch: defpackage.fc3 -> L195
            r3.Y = r10     // Catch: defpackage.fc3 -> L195
            r3.Z = r1     // Catch: defpackage.fc3 -> L195
            r3.d0 = r6     // Catch: defpackage.fc3 -> L195
            r3.e0 = r7     // Catch: defpackage.fc3 -> L195
            r3.g0 = r12     // Catch: defpackage.fc3 -> L195
            r3.h0 = r5     // Catch: defpackage.fc3 -> L195
            r3.i0 = r2     // Catch: defpackage.fc3 -> L195
            r3.f0 = r0     // Catch: defpackage.fc3 -> L195
            r3.k0 = r11     // Catch: defpackage.fc3 -> L195
            r18 = 0
            r22 = 2
            r21 = r3
            r17 = r14
            r19 = r15
            r20 = r16
            r16 = r13
            java.lang.Object r3 = defpackage.kj2.o(r16, r17, r18, r19, r20, r21, r22)     // Catch: defpackage.fc3 -> L191
            if (r3 != r4) goto L17c
            goto L20e
        L17c:
            r3 = r10
            r10 = r9
            r9 = r3
            r15 = r1
            r1 = r6
            r25 = r7
            r3 = r21
        L185:
            int r6 = r15.A     // Catch: defpackage.fc3 -> Lf8
            int r6 = r6 + r11
            r15.A = r6     // Catch: defpackage.fc3 -> Lf8
            r24 = r15
            r6 = 30
            r7 = 0
            goto Lbd
        L191:
            r0 = move-exception
        L192:
            r3 = r21
            goto L1c2
        L195:
            r0 = move-exception
            r21 = r3
            goto L1c2
        L199:
            r0 = move-exception
            r21 = r3
            r9 = r17
            r6 = r18
            goto L1c2
        L1a1:
            r0 = move-exception
            r6 = r1
            r21 = r3
            goto Lfa
        L1a7:
            r0 = move-exception
            r6 = r1
            r21 = r3
            r9 = r10
            goto L192
        L1ad:
            r10 = r27
            int r0 = r27.b(r28)     // Catch: defpackage.fc3 -> Lf8
            fc3 r2 = new fc3     // Catch: defpackage.fc3 -> Lf8
            java.lang.Object r5 = r9.A     // Catch: defpackage.fc3 -> Lf8
            uo r5 = (defpackage.uo) r5     // Catch: defpackage.fc3 -> Lf8
            r2.<init>(r0, r5)     // Catch: defpackage.fc3 -> Lf8
            throw r2     // Catch: defpackage.fc3 -> Lf8
        L1bd:
            r0 = move-exception
            r10 = r27
            goto Lf9
        L1c2:
            uo r1 = r0.B
            r2 = 30
            r5 = 0
            uo r16 = defpackage.ak7.O(r1, r5, r5, r2)
            int r0 = r0.A
            float r0 = (float) r0
            ah5 r1 = new ah5
            r1.<init>()
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            java.lang.Object r7 = r16.a()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L1e8
            r10 = r11
            goto L1e9
        L1e8:
            r10 = 0
        L1e9:
            r19 = r10 ^ 1
            uf r5 = new uf
            r5.<init>(r0, r1, r9, r11)
            r3.R = r9
            r1 = 0
            r3.X = r1
            r3.Y = r1
            r3.Z = r1
            r3.d0 = r6
            r1 = 2
            r3.k0 = r1
            r18 = 0
            r22 = 2
            r17 = r2
            r21 = r3
            r20 = r5
            java.lang.Object r0 = defpackage.kj2.o(r16, r17, r18, r19, r20, r21, r22)
            if (r0 != r4) goto L20f
        L20e:
            return r4
        L20f:
            r0 = r6
            r1 = r9
        L211:
            r1.f(r0)
        L214:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static final boolean j(boolean r0, defpackage.lr3 r1, int r2) {
            if (r0 == 0) goto L16
            int r0 = r1.c()
            if (r0 <= r2) goto L9
            goto L29
        L9:
            int r0 = r1.c()
            if (r0 != r2) goto L2b
            int r0 = r1.d()
            if (r0 <= 0) goto L2b
            goto L29
        L16:
            int r0 = r1.c()
            if (r0 >= r2) goto L1d
            goto L29
        L1d:
            int r0 = r1.c()
            if (r0 != r2) goto L2b
            int r0 = r1.d()
            if (r0 >= 0) goto L2b
        L29:
            r0 = 1
            return r0
        L2b:
            r0 = 0
            return r0
    }

    public static final int k(long[] r5, long r6) {
            int r0 = r5.length
            int r0 = r0 + (-1)
            r1 = 0
        L4:
            if (r1 > r0) goto L19
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            r3 = r5[r2]
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L13
            int r1 = r2 + 1
            goto L4
        L13:
            if (r3 >= 0) goto L18
            int r0 = r2 + (-1)
            goto L4
        L18:
            return r2
        L19:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    public static final defpackage.yb6 l(java.lang.String r8, defpackage.np2 r9, defpackage.wb6[] r10, defpackage.qn2 r11) {
            boolean r0 = defpackage.qs6.v0(r8)
            r1 = 0
            if (r0 != 0) goto L2f
            bt6 r0 = defpackage.bt6.e
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L29
            br0 r7 = new br0
            r7.<init>(r8)
            r11.g(r7)
            yb6 r2 = new yb6
            java.util.ArrayList r11 = r7.c
            int r5 = r11.size()
            java.util.List r6 = defpackage.fv.T0(r10)
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L29:
            java.lang.String r8 = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead"
            defpackage.i.h(r8)
            return r1
        L2f:
            java.lang.String r8 = "Blank serial names are prohibited"
            defpackage.i.h(r8)
            return r1
    }

    public static defpackage.yb6 m(java.lang.String r8, defpackage.np2 r9, defpackage.wb6[] r10) {
            boolean r0 = defpackage.qs6.v0(r8)
            r1 = 0
            if (r0 != 0) goto L2c
            bt6 r0 = defpackage.bt6.e
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L26
            br0 r7 = new br0
            r7.<init>(r8)
            yb6 r2 = new yb6
            java.util.ArrayList r0 = r7.c
            int r5 = r0.size()
            java.util.List r6 = defpackage.fv.T0(r10)
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L26:
            java.lang.String r8 = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead"
            defpackage.i.h(r8)
            return r1
        L2c:
            java.lang.String r8 = "Blank serial names are prohibited"
            defpackage.i.h(r8)
            return r1
    }

    public static final void n(int r2, int r3, defpackage.wb6 r4) {
            if (r2 <= 0) goto L3
            return
        L3:
            fc6 r0 = new fc6
            java.lang.String r3 = r4.g(r3)
            java.lang.String r4 = r4.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not allowed in ProtoNumber for property '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' of '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "', because protobuf supports field numbers in range 1..2147483647"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static void o(java.lang.Object r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.String r0 = "Cannot return null from a non-@Nullable @Provides method"
            defpackage.u34.x(r0)
            return
    }

    public static int p(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L30
        L14:
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            r0 = 0
            if (r7 != 0) goto L1d
            goto L83
        L1d:
            if (r2 != 0) goto L31
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L30
            int r4 = r2.length
            if (r4 > 0) goto L2d
            goto L30
        L2d:
            r2 = r2[r0]
            goto L31
        L30:
            return r3
        L31:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L77
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L77
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L6c
            java.lang.Object r3 = r6.getSystemService(r5)
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3
            int r4 = android.os.Binder.getCallingUid()
            r5 = 1
            if (r3 != 0) goto L58
            r2 = r5
            goto L5c
        L58:
            int r2 = r3.checkOpNoThrow(r7, r4, r2)
        L5c:
            if (r2 == 0) goto L5f
            goto L81
        L5f:
            java.lang.String r6 = defpackage.rp.d(r6)
            if (r3 != 0) goto L66
            goto L6a
        L66:
            int r5 = r3.checkOpNoThrow(r7, r1, r6)
        L6a:
            r2 = r5
            goto L81
        L6c:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
            goto L81
        L77:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
        L81:
            if (r2 != 0) goto L84
        L83:
            return r0
        L84:
            r6 = -2
            return r6
    }

    public static defpackage.ja4 q() {
            long[] r0 = defpackage.b66.a
            ja4 r0 = new ja4
            r0.<init>()
            return r0
    }

    public static byte[] r(int r6, int r7, int r8, int r9, short r10, long r11, byte[] r13) {
            r0 = 520(0x208, float:7.29E-43)
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r2 = 65537(0x10001, float:9.1837E-41)
            r3 = 0
            r1.putInt(r3, r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            r2.getClass()
            java.lang.String r4 = "Root-CA00000001-CP0000000b"
            byte[] r2 = r4.getBytes(r2)
            r2.getClass()
            int r4 = r2.length
            r5 = 64
            if (r4 <= r5) goto L29
            r4 = r5
        L29:
            r5 = 320(0x140, float:4.48E-43)
            java.lang.System.arraycopy(r2, r3, r0, r5, r4)
            r2 = 388(0x184, float:5.44E-43)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r1.putLong(r2, r4)
            r2 = 396(0x18c, float:5.55E-43)
            r1.putInt(r2, r6)
            r6 = 400(0x190, float:5.6E-43)
            r1.putInt(r6, r7)
            r6 = 410(0x19a, float:5.75E-43)
            r1.putInt(r6, r8)
            r6 = 414(0x19e, float:5.8E-43)
            r1.putInt(r6, r9)
            r6 = 476(0x1dc, float:6.67E-43)
            r1.putShort(r6, r10)
            r6 = 478(0x1de, float:6.7E-43)
            r7 = 1
            r1.putShort(r6, r7)
            r6 = 480(0x1e0, float:6.73E-43)
            r1.putShort(r6, r3)
            r6 = 484(0x1e4, float:6.78E-43)
            r1.putInt(r6, r3)
            r6 = 488(0x1e8, float:6.84E-43)
            r1.putShort(r6, r3)
            r6 = 490(0x1ea, float:6.87E-43)
            r1.putShort(r6, r7)
            r6 = 492(0x1ec, float:6.9E-43)
            r1.putLong(r6, r11)
            if (r13 == 0) goto L7c
            int r6 = r13.length
            r7 = 20
            if (r6 < r7) goto L7c
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.System.arraycopy(r13, r3, r0, r6, r7)
        L7c:
            return r0
    }

    public static final float s(float[] r5, float[] r6) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r5[r2]
            r4 = r6[r2]
            float r3 = r3 * r4
            float r1 = r1 + r3
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static final long t(defpackage.wb6 r10, int r11) {
            r10.getClass()
            java.util.List r0 = r10.i(r11)
            r1 = 1
            int r11 = r11 + r1
            q45 r2 = defpackage.q45.DEFAULT
            int r3 = r0.size()
            r4 = 0
            r7 = r11
            r5 = r4
            r6 = r5
        L13:
            if (r4 >= r3) goto L42
            java.lang.Object r8 = r0.get(r4)
            java.lang.annotation.Annotation r8 = (java.lang.annotation.Annotation) r8
            boolean r9 = r8 instanceof defpackage.r45
            if (r9 == 0) goto L29
            r45 r8 = (defpackage.r45) r8
            int r7 = r8.number()
            n(r7, r4, r10)
            goto L3f
        L29:
            boolean r9 = r8 instanceof defpackage.v45
            if (r9 == 0) goto L34
            v45 r8 = (defpackage.v45) r8
            q45 r2 = r8.type()
            goto L3f
        L34:
            boolean r9 = r8 instanceof defpackage.t45
            if (r9 == 0) goto L3a
            r6 = r1
            goto L3f
        L3a:
            boolean r8 = r8 instanceof defpackage.s45
            if (r8 == 0) goto L3f
            r5 = r1
        L3f:
            int r4 = r4 + 1
            goto L13
        L42:
            if (r5 == 0) goto L45
            goto L46
        L45:
            r11 = r7
        L46:
            r0 = 0
            if (r6 == 0) goto L50
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L51
        L50:
            r3 = r0
        L51:
            if (r5 == 0) goto L58
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
        L58:
            long r0 = r0 | r3
            long r2 = r2.getSignature$kotlinx_serialization_protobuf()
            long r0 = r0 | r2
            long r10 = (long) r11
            long r10 = r10 | r0
            return r10
    }

    public static final int u(defpackage.wb6 r5, int r6, boolean r7) {
            r5.getClass()
            java.util.List r0 = r5.i(r6)
            if (r7 == 0) goto La
            goto Lc
        La:
            int r6 = r6 + 1
        Lc:
            int r1 = r0.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = r0.get(r2)
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            boolean r4 = r3 instanceof defpackage.s45
            if (r4 == 0) goto L1f
            r5 = -2
            return r5
        L1f:
            boolean r4 = r3 instanceof defpackage.r45
            if (r4 == 0) goto L2e
            r45 r3 = (defpackage.r45) r3
            int r6 = r3.number()
            if (r7 != 0) goto L2e
            n(r6, r2, r5)
        L2e:
            int r2 = r2 + 1
            goto L11
        L31:
            return r6
    }

    public static final long v(long r0, boolean r2, int r3, float r4) {
            if (r2 != 0) goto Ld
            r2 = 2
            if (r3 != r2) goto L6
            goto Ld
        L6:
            r2 = 4
            if (r3 != r2) goto La
            goto Ld
        La:
            r2 = 5
            if (r3 != r2) goto L18
        Ld:
            boolean r2 = defpackage.q21.d(r0)
            if (r2 == 0) goto L18
            int r2 = defpackage.q21.h(r0)
            goto L1b
        L18:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1b:
            int r3 = defpackage.q21.j(r0)
            if (r3 != r2) goto L22
            goto L2e
        L22:
            int r3 = defpackage.ii2.q(r4)
            int r4 = defpackage.q21.j(r0)
            int r2 = defpackage.gi2.q(r3, r4, r2)
        L2e:
            int r0 = defpackage.q21.g(r0)
            r1 = 0
            long r0 = defpackage.nb3.t(r1, r2, r1, r0)
            return r0
    }

    public static final int w(int r11, java.lang.String r12) {
            ws1 r0 = F()
            r1 = 0
            if (r0 == 0) goto L76
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            java.lang.String r2 = "Not initialized yet"
            defpackage.np2.A(r2, r4)
            java.lang.String r2 = "charSequence cannot be null"
            defpackage.np2.x(r12, r2)
            ss1 r0 = r0.e
            bt r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L2b
            int r2 = r12.length()
            if (r11 < r2) goto L2d
        L2b:
            r5 = r12
            goto L6c
        L2d:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<se7> r6 = defpackage.se7.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            se7[] r5 = (defpackage.se7[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L49
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6d
        L49:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            ht1 r10 = new ht1
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.Q(r5, r6, r7, r8, r9, r10)
            ht1 r12 = (defpackage.ht1) r12
            int r2 = r12.L
            goto L6d
        L6c:
            r2 = r0
        L6d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L74
            goto L77
        L74:
            r1 = r12
            goto L77
        L76:
            r5 = r12
        L77:
            if (r1 == 0) goto L7e
            int r11 = r1.intValue()
            return r11
        L7e:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
    }

    public static final int x(int r4, java.lang.String r5) {
            ws1 r0 = F()
            r1 = 0
            if (r0 == 0) goto L1f
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.b(r2, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            r3 = -1
            if (r2 != r3) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L26
            int r4 = r1.intValue()
            return r4
        L26:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
    }

    public static final java.util.List y(defpackage.wb6 r4, defpackage.jd1 r5) {
            r4.getClass()
            r5.getClass()
            np2 r5 = r4.e()
            dz4 r0 = defpackage.dz4.e
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L28
            ar0 r5 = defpackage.n16.x(r4)
            yt1 r0 = defpackage.yt1.A
            if (r5 != 0) goto L1b
            goto L42
        L1b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r0 = defpackage.ht0.v0(r0, r1)
            r5.<init>(r0)
            r0 = r5
            goto L42
        L28:
            dz4 r0 = defpackage.dz4.f
            boolean r5 = defpackage.nb3.k(r5, r0)
            if (r5 == 0) goto L9c
            r5 = 1
            wb6 r5 = r4.j(r5)
            r5.getClass()
            dv r0 = new dv
            r1 = 4
            r0.<init>(r5, r1)
            java.util.List r0 = defpackage.gt0.k1(r0)
        L42:
            java.util.Iterator r5 = r0.iterator()
        L46:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r5.next()
            wb6 r1 = (defpackage.wb6) r1
            r2 = 0
            java.util.List r2 = r1.i(r2)
            if (r2 == 0) goto L5f
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L74
        L5f:
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r2.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            boolean r3 = r3 instanceof defpackage.r45
            if (r3 == 0) goto L63
            goto L46
        L74:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.a()
            java.lang.String r4 = r4.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " implementing oneOf type "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " should have @ProtoNumber annotation in its single property."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
        L9b:
            return r0
        L9c:
            java.lang.String r4 = r4.a()
            java.lang.String r5 = " should be abstract or sealed or interface to be used as @ProtoOneOf property."
            java.lang.String r0 = "Class "
            defpackage.u34.h(r4, r5, r0)
            r4 = 0
            return r4
    }

    public float K(android.view.View r1) {
            r0 = this;
            boolean r0 = defpackage.mp2.c
            if (r0 == 0) goto Lc
            float r0 = defpackage.r74.b(r1)     // Catch: java.lang.NoSuchMethodError -> L9
            return r0
        L9:
            r0 = 0
            defpackage.mp2.c = r0
        Lc:
            float r0 = r1.getAlpha()
            return r0
    }

    public void Y(android.view.View r1, float r2) {
            r0 = this;
            boolean r0 = defpackage.mp2.c
            if (r0 == 0) goto Lb
            defpackage.r74.y(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            defpackage.mp2.c = r0
        Lb:
            r1.setAlpha(r2)
            return
    }

    public abstract defpackage.of5 z();
}
