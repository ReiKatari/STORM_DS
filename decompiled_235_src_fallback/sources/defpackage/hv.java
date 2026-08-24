package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public abstract class hv {
    public static final defpackage.b40 a = null;
    public static final defpackage.b40 b = null;
    public static final defpackage.zv0 c = null;
    public static final defpackage.zv0 d = null;
    public static final defpackage.zv0 e = null;
    public static final defpackage.th1 f = null;
    public static defpackage.op5 g;
    public static final java.lang.Object h = null;
    public static final java.lang.StackTraceElement[] i = null;
    public static final defpackage.r76 j = null;
    public static final defpackage.hd2 k = null;
    public static defpackage.e33 l;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static defpackage.e33 o;

    static {
            b40 r0 = new b40
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.<init>(r1)
            defpackage.hv.a = r0
            b40 r0 = new b40
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1)
            defpackage.hv.b = r0
            fn0 r0 = new fn0
            r1 = 19
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -1520532968(0xffffffffa55e8218, float:-1.9299508E-16)
            r3 = 0
            r1.<init>(r2, r3, r0)
            defpackage.hv.c = r1
            fn0 r0 = new fn0
            r1 = 20
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -525934473(0xffffffffe0a6e077, float:-9.6197935E19)
            r1.<init>(r2, r3, r0)
            defpackage.hv.d = r1
            iw0 r0 = new iw0
            r1 = 22
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -531717168(0xffffffffe04ea3d0, float:-5.9559894E19)
            r1.<init>(r2, r3, r0)
            defpackage.hv.e = r1
            th1 r0 = new th1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            defpackage.hv.f = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.hv.h = r0
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            defpackage.hv.i = r0
            r76 r0 = new r76
            r1 = 21
            r0.<init>(r1)
            defpackage.hv.j = r0
            hd2 r0 = new hd2
            r1 = 0
            r0.<init>(r1)
            defpackage.hv.k = r0
            return
    }

    public static final boolean A(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static boolean B(android.content.Context r9, android.net.Uri r10) {
            java.lang.String r1 = "Failed query: "
            android.content.ContentResolver r2 = r9.getContentResolver()
            r9 = 0
            r8 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r10
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            int r10 = r8.getCount()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r10 <= 0) goto L1d
            r9 = 1
        L1d:
            k(r8)
            return r9
        L21:
            r0 = move-exception
            r9 = r0
            goto L3b
        L24:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L21
            r2.append(r10)     // Catch: java.lang.Throwable -> L21
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L21
            android.util.Log.w(r0, r10)     // Catch: java.lang.Throwable -> L21
            k(r8)
            return r9
        L3b:
            k(r8)
            throw r9
    }

    public static int C(java.lang.Exception r7) {
            boolean r0 = r7 instanceof android.hardware.camera2.CameraAccessException
            r1 = 0
            r2 = 11
            java.lang.String r3 = "CXCP"
            if (r0 == 0) goto L36
            android.hardware.camera2.CameraAccessException r7 = (android.hardware.camera2.CameraAccessException) r7
            int r0 = r7.getReason()
            r4 = 3
            r5 = 1
            if (r0 == r5) goto L35
            r6 = 2
            if (r0 == r6) goto L33
            if (r0 == r4) goto L32
            r1 = 4
            if (r0 == r1) goto L31
            r1 = 5
            if (r0 == r1) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected CameraAccessException: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.w(r3, r7)
            return r2
        L30:
            return r6
        L31:
            return r5
        L32:
            return r1
        L33:
            r7 = 6
            return r7
        L35:
            return r4
        L36:
            boolean r0 = r7 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L3c
            r7 = 7
            return r7
        L3c:
            boolean r0 = r7 instanceof java.lang.SecurityException
            if (r0 == 0) goto L43
            r7 = 8
            return r7
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 != r4) goto L6e
            boolean r0 = r7 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L4e
            goto L69
        L4e:
            r0 = r7
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r0.getClass()
            int r4 = r0.length
            if (r4 != 0) goto L5d
            r0 = 0
            goto L63
        L5d:
            r0 = r0[r1]
            java.lang.String r0 = r0.getMethodName()
        L63:
            java.lang.String r1 = "_enableShutterSound"
            boolean r1 = defpackage.nb3.k(r0, r1)
        L69:
            if (r1 == 0) goto L6e
            r7 = 10
            return r7
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected throwable: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.w(r3, r7)
            return r2
    }

    public static final java.lang.Object D(android.content.Context r0, java.lang.Class r1) {
            r0.getClass()
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = defpackage.vy7.k0(r0)
            java.lang.Object r0 = defpackage.q60.B(r1, r0)
            return r0
    }

    public static final defpackage.e33 E() {
            e33 r0 = defpackage.hv.l
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Add"
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
            r3 = 1100480512(0x41980000, float:19.0)
            r5 = 1095761920(0x41500000, float:13.0)
            r2.o(r3, r5)
            r3 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r2.l(r3)
            r5 = 1086324736(0x40c00000, float:6.0)
            r2.u(r5)
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r2.l(r6)
            r2.u(r3)
            r3 = 1084227584(0x40a00000, float:5.0)
            r2.k(r3)
            r2.u(r6)
            r2.l(r5)
            r2.t(r3)
            r3 = 1073741824(0x40000000, float:2.0)
            r2.l(r3)
            r2.u(r5)
            r2.l(r5)
            r2.u(r3)
            r2.g()
            java.util.ArrayList r2 = r2.b
            defpackage.d33.a(r1, r2, r4, r0)
            e33 r0 = r1.b()
            defpackage.hv.l = r0
            return r0
    }

    public static final defpackage.l61 F(defpackage.m16 r3, boolean r4, defpackage.s41 r5) {
            l61 r5 = r5.b()
            w31 r0 = defpackage.b97.B
            j61 r5 = r5.Z(r0)
            b97 r5 = (defpackage.b97) r5
            r0 = 0
            if (r5 == 0) goto L12
            n61 r5 = r5.A
            goto L13
        L12:
            r5 = r0
        L13:
            boolean r1 = r3.k()
            java.lang.String r2 = "coroutineScope"
            if (r1 == 0) goto L44
            if (r5 == 0) goto L2c
            o41 r3 = r3.a
            if (r3 == 0) goto L28
            l61 r3 = r3.B
            l61 r3 = r3.N(r5)
            return r3
        L28:
            defpackage.nb3.a0(r2)
            throw r0
        L2c:
            if (r4 == 0) goto L39
            l61 r3 = r3.b
            if (r3 == 0) goto L33
            return r3
        L33:
            java.lang.String r3 = "transactionContext"
            defpackage.nb3.a0(r3)
            throw r0
        L39:
            o41 r3 = r3.a
            if (r3 == 0) goto L40
            l61 r3 = r3.B
            return r3
        L40:
            defpackage.nb3.a0(r2)
            throw r0
        L44:
            o41 r3 = r3.a
            if (r3 == 0) goto L54
            l61 r3 = r3.B
            if (r5 == 0) goto L4d
            goto L4f
        L4d:
            vt1 r5 = defpackage.vt1.A
        L4f:
            l61 r3 = r3.N(r5)
            return r3
        L54:
            defpackage.nb3.a0(r2)
            throw r0
    }

    public static final defpackage.a74 G(defpackage.a74 r1, defpackage.qn2 r2) {
            c50 r0 = new c50
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static final defpackage.a74 H(defpackage.a74 r14, float r15, float r16, float r17, float r18, float r19, long r20, defpackage.ke6 r22, boolean r23, long r24, long r26) {
            vt2 r0 = new vt2
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r12)
            a74 r14 = r14.d(r0)
            return r14
    }

    public static defpackage.a74 I(defpackage.a74 r17, float r18, float r19, float r20, float r21, float r22, defpackage.ke6 r23, int r24) {
            r0 = r24
            r1 = r0 & 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto La
            r4 = r2
            goto Lc
        La:
            r4 = r18
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L12
            r5 = r2
            goto L14
        L12:
            r5 = r19
        L14:
            r1 = r0 & 4
            if (r1 == 0) goto L1a
            r6 = r2
            goto L1c
        L1a:
            r6 = r20
        L1c:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L23
            r7 = r2
            goto L25
        L23:
            r7 = r21
        L25:
            r1 = r0 & 16
            if (r1 == 0) goto L2b
            r8 = r2
            goto L2d
        L2b:
            r8 = r22
        L2d:
            long r9 = defpackage.i97.b
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L37
            jy2 r1 = defpackage.u24.m
            r11 = r1
            goto L39
        L37:
            r11 = r23
        L39:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L40
            r0 = 0
        L3e:
            r12 = r0
            goto L42
        L40:
            r0 = 1
            goto L3e
        L42:
            long r13 = defpackage.yt2.a
            r15 = r13
            r3 = r17
            a74 r0 = H(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r15)
            return r0
    }

    public static void J(java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2b
            r0 = 0
        L7:
            java.lang.Object r1 = r3.get(r0)     // Catch: defpackage.hg1 -> L19
            ig1 r1 = (defpackage.ig1) r1     // Catch: defpackage.hg1 -> L19
            r1.d()     // Catch: defpackage.hg1 -> L19
            int r0 = r0 + 1
            int r1 = r3.size()     // Catch: defpackage.hg1 -> L19
            if (r0 < r1) goto L7
            goto L2b
        L19:
            r1 = move-exception
            int r0 = r0 + (-1)
        L1c:
            if (r0 < 0) goto L2a
            java.lang.Object r2 = r3.get(r0)
            ig1 r2 = (defpackage.ig1) r2
            r2.b()
            int r0 = r0 + (-1)
            goto L1c
        L2a:
            throw r1
        L2b:
            return
    }

    public static final defpackage.ap6 K(defpackage.w61 r1, defpackage.l61 r2, defpackage.a71 r3, defpackage.eo2 r4) {
            l61 r1 = defpackage.mb3.M(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L10
            ur3 r2 = new ur3
            r2.<init>(r1, r4)
            goto L16
        L10:
            ap6 r2 = new ap6
            r0 = 1
            r2.<init>(r1, r0)
        L16:
            r3.invoke(r4, r2, r2)
            return r2
    }

    public static /* synthetic */ defpackage.ap6 L(defpackage.w61 r1, defpackage.l61 r2, defpackage.a71 r3, defpackage.eo2 r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            vt1 r2 = defpackage.vt1.A
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            a71 r3 = defpackage.a71.DEFAULT
        Lc:
            ap6 r1 = K(r1, r2, r3, r4)
            return r1
    }

    public static final long M(float r9, long r10, long r12) {
            yk4 r0 = defpackage.qt0.x
            long r10 = defpackage.kt0.b(r10, r0)
            long r1 = defpackage.kt0.b(r12, r0)
            float r3 = defpackage.kt0.e(r10)
            float r4 = defpackage.kt0.i(r10)
            float r5 = defpackage.kt0.h(r10)
            float r10 = defpackage.kt0.f(r10)
            float r11 = defpackage.kt0.e(r1)
            float r6 = defpackage.kt0.i(r1)
            float r7 = defpackage.kt0.h(r1)
            float r1 = defpackage.kt0.f(r1)
            r2 = 0
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L30
            r9 = r2
        L30:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L37
            r9 = r2
        L37:
            float r2 = defpackage.oi2.L(r4, r6, r9)
            float r4 = defpackage.oi2.L(r5, r7, r9)
            float r10 = defpackage.oi2.L(r10, r1, r9)
            float r9 = defpackage.oi2.L(r3, r11, r9)
            long r9 = h(r2, r4, r10, r9, r0)
            nt0 r11 = defpackage.kt0.g(r12)
            long r9 = defpackage.kt0.b(r9, r11)
            return r9
    }

    public static final float N(long r7) {
            nt0 r0 = defpackage.kt0.g(r7)
            long r1 = r0.b
            r3 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r1 = defpackage.q60.A(r1, r3)
            if (r1 != 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The specified color must be encoded in an RGB color space. The supplied color space is "
            r1.<init>(r2)
            long r2 = r0.b
            java.lang.String r2 = defpackage.q60.a0(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.o53.a(r1)
        L28:
            cq5 r0 = (defpackage.cq5) r0
            yp5 r0 = r0.p
            float r1 = defpackage.kt0.i(r7)
            double r1 = (double) r1
            double r1 = r0.c(r1)
            float r3 = defpackage.kt0.h(r7)
            double r3 = (double) r3
            double r3 = r0.c(r3)
            float r7 = defpackage.kt0.f(r7)
            double r7 = (double) r7
            double r7 = r0.c(r7)
            r5 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r1 = r1 * r5
            r5 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r3 = r3 * r5
            double r3 = r3 + r1
            r0 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r7 = r7 * r0
            double r7 = r7 + r3
            float r7 = (float) r7
            r8 = 0
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L62
            r7 = r8
        L62:
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L69
            return r8
        L69:
            return r7
    }

    public static final java.lang.Object Q(defpackage.m16 r8, boolean r9, boolean r10, defpackage.qn2 r11) {
            r8.getClass()
            java.lang.ThreadLocal r0 = r8.i
            r8.a()
            boolean r1 = r8.k()
            if (r1 == 0) goto L30
            boolean r1 = r8.l()
            if (r1 != 0) goto L30
            java.lang.Object r1 = r0.get()
            l61 r1 = (defpackage.l61) r1
            r2 = 0
            if (r1 == 0) goto L26
            w31 r3 = defpackage.b97.B
            j61 r1 = r1.Z(r3)
            b97 r1 = (defpackage.b97) r1
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 != 0) goto L2a
            goto L30
        L2a:
            java.lang.String r8 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            defpackage.i.m(r8)
            return r2
        L30:
            java.lang.Object r0 = r0.get()
            l61 r0 = (defpackage.l61) r0
            if (r0 != 0) goto L3a
            vt1 r0 = defpackage.vt1.A
        L3a:
            r2 = r0
            u81 r1 = new u81
            r7 = 0
            r3 = r8
            r5 = r9
            r4 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.hi2.L(r1)
            return r8
    }

    public static final java.lang.Object R(defpackage.m16 r8, defpackage.qn2 r9, defpackage.s41 r10) {
            boolean r0 = r10 instanceof defpackage.v81
            if (r0 == 0) goto L13
            r0 = r10
            v81 r0 = (defpackage.v81) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            v81 r0 = new v81
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.oi2.Y(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r7
        L37:
            hw6 r8 = r0.X
            r9 = r8
            qn2 r9 = (defpackage.qn2) r9
            m16 r8 = r0.R
            defpackage.oi2.Y(r10)
            goto L94
        L42:
            defpackage.oi2.Y(r10)
            return r10
        L46:
            defpackage.oi2.Y(r10)
            return r10
        L4a:
            defpackage.oi2.Y(r10)
            boolean r10 = r8.k()
            if (r10 == 0) goto L62
            yc r10 = new yc
            r10.<init>(r8, r9, r7, r4)
            r0.Z = r6
            java.lang.Object r8 = defpackage.qo2.X(r0, r10, r8)
            if (r8 != r1) goto L61
            goto La7
        L61:
            return r8
        L62:
            boolean r10 = r8.k()
            if (r10 == 0) goto L84
            boolean r10 = r8.n()
            if (r10 == 0) goto L84
            boolean r10 = r8.l()
            if (r10 == 0) goto L84
            x81 r10 = new x81
            r10.<init>(r8, r7, r9, r6)
            r0.Z = r5
            r9 = 0
            java.lang.Object r8 = r8.q(r9, r10, r0)
            if (r8 != r1) goto L83
            goto La7
        L83:
            return r8
        L84:
            r0.R = r8
            r10 = r9
            hw6 r10 = (defpackage.hw6) r10
            r0.X = r10
            r0.Z = r4
            l61 r10 = F(r8, r6, r0)
            if (r10 != r1) goto L94
            goto La7
        L94:
            l61 r10 = (defpackage.l61) r10
            z r2 = new z
            r2.<init>(r7, r9, r8)
            r0.R = r7
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = d0(r10, r2, r0)
            if (r8 != r1) goto La8
        La7:
            return r1
        La8:
            return r8
    }

    public static final java.lang.Object S(defpackage.r41 r14, defpackage.m16 r15, boolean r16, boolean r17, defpackage.qn2 r18) {
            boolean r0 = r14 instanceof defpackage.y81
            if (r0 == 0) goto L14
            r0 = r14
            y81 r0 = (defpackage.y81) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e0 = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            y81 r0 = new y81
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.d0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.e0
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            if (r1 == 0) goto L4a
            if (r1 == r8) goto L46
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.oi2.Y(r0)
            return r0
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r2
        L36:
            boolean r1 = r14.Z
            boolean r4 = r14.Y
            qn2 r5 = r14.X
            m16 r6 = r14.R
            defpackage.oi2.Y(r0)
            r12 = r1
            r11 = r4
            r13 = r5
            r10 = r6
            goto L95
        L46:
            defpackage.oi2.Y(r0)
            return r0
        L4a:
            defpackage.oi2.Y(r0)
            boolean r0 = r15.k()
            if (r0 == 0) goto L79
            boolean r0 = r15.n()
            if (r0 == 0) goto L79
            boolean r0 = r15.l()
            if (r0 == 0) goto L79
            s81 r0 = new s81
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.e0 = r8
            java.lang.Object r14 = r15.q(r1, r2, r14)
            if (r14 != r7) goto L78
            goto La9
        L78:
            return r14
        L79:
            r1 = r16
            r5 = r17
            r14.R = r15
            r6 = r18
            r14.X = r6
            r14.Y = r1
            r14.Z = r5
            r14.e0 = r4
            l61 r4 = F(r15, r5, r14)
            if (r4 != r7) goto L90
            goto La9
        L90:
            r10 = r15
            r11 = r1
            r0 = r4
            r12 = r5
            r13 = r6
        L95:
            l61 r0 = (defpackage.l61) r0
            t81 r8 = new t81
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.R = r2
            r14.X = r2
            r14.e0 = r3
            java.lang.Object r14 = d0(r0, r8, r14)
            if (r14 != r7) goto Laa
        La9:
            return r7
        Laa:
            return r14
    }

    public static long T(android.content.Context r8, android.net.Uri r9, java.lang.String r10, long r11) {
            java.lang.String r1 = "Failed query: "
            android.content.ContentResolver r2 = r8.getContentResolver()
            r8 = 0
            java.lang.String[] r4 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            if (r9 == 0) goto L2e
            r9 = 0
            boolean r10 = r8.isNull(r9)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            if (r10 != 0) goto L2e
            long r9 = r8.getLong(r9)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            k(r8)
            return r9
        L28:
            r0 = move-exception
            r9 = r0
            goto L47
        L2b:
            r0 = move-exception
            r9 = r0
            goto L32
        L2e:
            k(r8)
            return r11
        L32:
            java.lang.String r10 = "DocumentFile"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            r0.append(r9)     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r10, r9)     // Catch: java.lang.Throwable -> L28
            k(r8)
            return r11
        L47:
            k(r8)
            throw r9
    }

    public static java.lang.String U(android.content.Context r9, android.net.Uri r10, java.lang.String r11) {
            java.lang.String r1 = "Failed query: "
            android.content.ContentResolver r2 = r9.getContentResolver()
            r9 = 0
            java.lang.String[] r4 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L38
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L38
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            if (r11 == 0) goto L2e
            r11 = 0
            boolean r0 = r10.isNull(r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            if (r0 != 0) goto L2e
            java.lang.String r9 = r10.getString(r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            k(r10)
            return r9
        L28:
            r0 = move-exception
            r9 = r0
            goto L50
        L2b:
            r0 = move-exception
            r11 = r0
            goto L3b
        L2e:
            k(r10)
            return r9
        L32:
            r0 = move-exception
            r10 = r0
            r8 = r10
            r10 = r9
            r9 = r8
            goto L50
        L38:
            r0 = move-exception
            r11 = r0
            r10 = r9
        L3b:
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28
            r2.append(r11)     // Catch: java.lang.Throwable -> L28
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> L28
            k(r10)
            return r9
        L50:
            k(r10)
            throw r9
    }

    public static final java.lang.Object V(defpackage.l61 r5, defpackage.eo2 r6) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            d90 r1 = defpackage.d90.r0
            j61 r2 = r5.Z(r1)
            n61 r2 = (defpackage.n61) r2
            vt1 r3 = defpackage.vt1.A
            r4 = 1
            if (r2 != 0) goto L2c
            l62 r2 = defpackage.m57.a()
            l61 r5 = r5.N(r2)
            l61 r5 = defpackage.mb3.A(r3, r5, r4)
            xe1 r3 = defpackage.xk1.a
            if (r5 == r3) goto L46
            j61 r1 = r5.Z(r1)
            if (r1 != 0) goto L46
            l61 r5 = r5.N(r3)
            goto L46
        L2c:
            java.lang.ThreadLocal r2 = defpackage.m57.a
            java.lang.Object r2 = r2.get()
            l62 r2 = (defpackage.l62) r2
            l61 r5 = defpackage.mb3.A(r3, r5, r4)
            xe1 r3 = defpackage.xk1.a
            if (r5 == r3) goto L46
            j61 r1 = r5.Z(r1)
            if (r1 != 0) goto L46
            l61 r5 = r5.N(r3)
        L46:
            k50 r1 = new k50
            r1.<init>(r5, r0, r2)
            a71 r5 = defpackage.a71.DEFAULT
            r5.invoke(r6, r1, r1)
            r5 = 0
            l62 r6 = r1.Z
            if (r6 == 0) goto L5a
            int r0 = defpackage.l62.Y
            r6.p0(r5)
        L5a:
            if (r6 == 0) goto L63
            long r2 = r6.q0()     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r0 = move-exception
            goto L9e
        L63:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L68:
            boolean r0 = r1.W()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L80
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)     // Catch: java.lang.Throwable -> L61
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5a
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            r1.s(r0)     // Catch: java.lang.Throwable -> L61
            goto L5a
        L80:
            if (r6 == 0) goto L87
            int r0 = defpackage.l62.Y
            r6.n0(r5)
        L87:
            java.lang.Object r5 = r1.Q()
            java.lang.Object r5 = defpackage.fd3.a(r5)
            boolean r6 = r5 instanceof defpackage.av0
            if (r6 == 0) goto L97
            r6 = r5
            av0 r6 = (defpackage.av0) r6
            goto L98
        L97:
            r6 = 0
        L98:
            if (r6 != 0) goto L9b
            return r5
        L9b:
            java.lang.Throwable r5 = r6.a
            throw r5
        L9e:
            if (r6 == 0) goto La5
            int r1 = defpackage.l62.Y
            r6.n0(r5)
        La5:
            throw r0
    }

    public static /* synthetic */ java.lang.Object W(defpackage.eo2 r1) {
            vt1 r0 = defpackage.vt1.A
            java.lang.Object r1 = V(r0, r1)
            return r1
    }

    public static final void X(android.graphics.Matrix r21, float[] r22) {
            r0 = 0
            r1 = r22[r0]
            r2 = 1
            r3 = r22[r2]
            r4 = 2
            r5 = r22[r4]
            r6 = 3
            r7 = r22[r6]
            r8 = 4
            r9 = r22[r8]
            r10 = 5
            r11 = r22[r10]
            r12 = 6
            r13 = r22[r12]
            r14 = 7
            r15 = r22[r14]
            r16 = 8
            r17 = r22[r16]
            r18 = 12
            r18 = r22[r18]
            r19 = 13
            r19 = r22[r19]
            r20 = 15
            r20 = r22[r20]
            r22[r0] = r1
            r22[r2] = r9
            r22[r4] = r18
            r22[r6] = r3
            r22[r8] = r11
            r22[r10] = r19
            r22[r12] = r7
            r22[r14] = r15
            r22[r16] = r20
            r21.setValues(r22)
            r22[r0] = r1
            r22[r2] = r3
            r22[r4] = r5
            r22[r6] = r7
            r22[r8] = r9
            r22[r10] = r11
            r22[r12] = r13
            r22[r14] = r15
            r22[r16] = r17
            return
    }

    public static final void Y(android.graphics.Matrix r18, float[] r19) {
            r18.getValues(r19)
            r0 = 0
            r1 = r19[r0]
            r2 = 1
            r3 = r19[r2]
            r4 = 2
            r5 = r19[r4]
            r6 = 3
            r7 = r19[r6]
            r8 = 4
            r9 = r19[r8]
            r10 = 5
            r11 = r19[r10]
            r12 = 6
            r13 = r19[r12]
            r14 = 7
            r15 = r19[r14]
            r16 = 8
            r17 = r19[r16]
            r19[r0] = r1
            r19[r2] = r7
            r0 = 0
            r19[r4] = r0
            r19[r6] = r13
            r19[r8] = r3
            r19[r10] = r9
            r19[r12] = r0
            r19[r14] = r15
            r19[r16] = r0
            r1 = 9
            r19[r1] = r0
            r1 = 10
            r2 = 1065353216(0x3f800000, float:1.0)
            r19[r1] = r2
            r1 = 11
            r19[r1] = r0
            r1 = 12
            r19[r1] = r5
            r1 = 13
            r19[r1] = r11
            r1 = 14
            r19[r1] = r0
            r0 = 15
            r19[r0] = r17
            return
    }

    public static void Z(defpackage.u63 r11, float r12) {
            java.lang.Object r0 = r11.B
            v16 r0 = (defpackage.v16) r0
            java.lang.Object r1 = r11.L
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            boolean r2 = r1.getUseCompatPadding()
            boolean r3 = r1.getPreventCornerOverlap()
            float r4 = r0.e
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 != 0) goto L1f
            boolean r4 = r0.f
            if (r4 != r2) goto L1f
            boolean r4 = r0.g
            if (r4 != r3) goto L1f
            goto L2c
        L1f:
            r0.e = r12
            r0.f = r2
            r0.g = r3
            r12 = 0
            r0.b(r12)
            r0.invalidateSelf()
        L2c:
            boolean r12 = r1.getUseCompatPadding()
            if (r12 != 0) goto L37
            r12 = 0
            r11.G(r12, r12, r12, r12)
            return
        L37:
            java.lang.Object r12 = r11.B
            v16 r12 = (defpackage.v16) r12
            float r0 = r12.e
            float r12 = r12.a
            boolean r2 = r1.getPreventCornerOverlap()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 == 0) goto L51
            double r5 = (double) r0
            double r7 = defpackage.w16.a
            double r7 = r3 - r7
            double r9 = (double) r12
            double r7 = r7 * r9
            double r7 = r7 + r5
            float r2 = (float) r7
            goto L54
        L51:
            int r2 = defpackage.w16.b
            r2 = r0
        L54:
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
            boolean r1 = r1.getPreventCornerOverlap()
            r5 = 1069547520(0x3fc00000, float:1.5)
            if (r1 == 0) goto L6c
            float r0 = r0 * r5
            double r0 = (double) r0
            double r5 = defpackage.w16.a
            double r3 = r3 - r5
            double r5 = (double) r12
            double r3 = r3 * r5
            double r3 = r3 + r0
            float r12 = (float) r3
            goto L6e
        L6c:
            float r12 = r0 * r5
        L6e:
            double r0 = (double) r12
            double r0 = java.lang.Math.ceil(r0)
            int r12 = (int) r0
            r11.G(r2, r12, r2, r12)
            return
    }

    public static final long a(float r21, float r22, float r23, float r24, defpackage.nt0 r25) {
            r0 = r25
            boolean r1 = r0.c()
            r2 = 16
            r3 = 32
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r1 == 0) goto L61
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 >= 0) goto L17
            r0 = r6
            goto L19
        L17:
            r0 = r24
        L19:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1e
            r0 = r5
        L1e:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            float r0 = r0 + r4
            int r0 = (int) r0
            int r0 = r0 << 24
            int r7 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r7 >= 0) goto L2b
            r7 = r6
            goto L2d
        L2b:
            r7 = r21
        L2d:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 <= 0) goto L32
            r7 = r5
        L32:
            float r7 = r7 * r1
            float r7 = r7 + r4
            int r7 = (int) r7
            int r2 = r7 << 16
            r0 = r0 | r2
            int r2 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r2 >= 0) goto L3e
            r2 = r6
            goto L40
        L3e:
            r2 = r22
        L40:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L45
            r2 = r5
        L45:
            float r2 = r2 * r1
            float r2 = r2 + r4
            int r2 = (int) r2
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 >= 0) goto L50
            goto L52
        L50:
            r6 = r23
        L52:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L57
            goto L58
        L57:
            r5 = r6
        L58:
            float r5 = r5 * r1
            float r5 = r5 + r4
            int r1 = (int) r5
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 << r3
            int r2 = defpackage.kt0.i
            return r0
        L61:
            long r7 = r0.b
            long r7 = r7 >> r3
            int r1 = (int) r7
            r7 = 3
            if (r1 != r7) goto L69
            goto L6e
        L69:
            java.lang.String r1 = "Color only works with ColorSpaces with 3 components"
            defpackage.o53.a(r1)
        L6e:
            int r1 = r0.c
            r7 = -1
            if (r1 == r7) goto L74
            goto L79
        L74:
            java.lang.String r7 = "Unknown color space, please use a color space in ColorSpaces"
            defpackage.o53.a(r7)
        L79:
            r7 = 0
            float r8 = r0.b(r7)
            float r9 = r0.a(r7)
            int r10 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r10 >= 0) goto L87
            goto L89
        L87:
            r8 = r21
        L89:
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L8e
            goto L8f
        L8e:
            r9 = r8
        L8f:
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            int r9 = r8 >>> 31
            int r10 = r8 >>> 23
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            r12 = 8388607(0x7fffff, float:1.1754942E-38)
            r13 = r8 & r12
            r14 = 8388608(0x800000, float:1.1754944E-38)
            r15 = -10
            r16 = 49
            r17 = 512(0x200, float:7.17E-43)
            r18 = r2
            r2 = 31
            r19 = r3
            r3 = 1
            if (r10 != r11) goto Lb8
            if (r13 == 0) goto Lb5
            r8 = r17
            goto Lb6
        Lb5:
            r8 = r7
        Lb6:
            r10 = r2
            goto Le6
        Lb8:
            int r10 = r10 + (-112)
            if (r10 < r2) goto Lc0
            r8 = r7
            r10 = r16
            goto Le6
        Lc0:
            if (r10 > 0) goto Ld6
            if (r10 < r15) goto Ld3
            r8 = r13 | r14
            int r10 = 1 - r10
            int r8 = r8 >> r10
            r10 = r8 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto Lcf
            int r8 = r8 + 8192
        Lcf:
            int r8 = r8 >> 13
            r10 = r7
            goto Le6
        Ld3:
            r8 = r7
            r10 = r8
            goto Le6
        Ld6:
            int r13 = r13 >> 13
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto Le5
            int r8 = r10 << 10
            r8 = r8 | r13
            int r8 = r8 + r3
            int r9 = r9 << 15
            r8 = r8 | r9
        Le3:
            short r8 = (short) r8
            goto Led
        Le5:
            r8 = r13
        Le6:
            int r9 = r9 << 15
            int r10 = r10 << 10
            r9 = r9 | r10
            r8 = r8 | r9
            goto Le3
        Led:
            float r9 = r0.b(r3)
            float r10 = r0.a(r3)
            int r13 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r13 >= 0) goto Lfa
            goto Lfc
        Lfa:
            r9 = r22
        Lfc:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 <= 0) goto L101
            goto L102
        L101:
            r10 = r9
        L102:
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            int r10 = r9 >>> 31
            int r13 = r9 >>> 23
            r13 = r13 & r11
            r20 = r9 & r12
            if (r13 != r11) goto L117
            if (r20 == 0) goto L114
            r9 = r17
            goto L115
        L114:
            r9 = r7
        L115:
            r13 = r2
            goto L147
        L117:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L11f
            r9 = r7
            r13 = r16
            goto L147
        L11f:
            if (r13 > 0) goto L135
            if (r13 < r15) goto L132
            r9 = r20 | r14
            int r13 = 1 - r13
            int r9 = r9 >> r13
            r13 = r9 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L12e
            int r9 = r9 + 8192
        L12e:
            int r9 = r9 >> 13
            r13 = r7
            goto L147
        L132:
            r9 = r7
            r13 = r9
            goto L147
        L135:
            int r20 = r20 >> 13
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L145
            int r9 = r13 << 10
            r9 = r9 | r20
            int r9 = r9 + r3
            int r10 = r10 << 15
            r9 = r9 | r10
        L143:
            short r9 = (short) r9
            goto L14e
        L145:
            r9 = r20
        L147:
            int r10 = r10 << 15
            int r13 = r13 << 10
            r10 = r10 | r13
            r9 = r9 | r10
            goto L143
        L14e:
            r10 = 2
            float r13 = r0.b(r10)
            float r0 = r0.a(r10)
            int r10 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r10 >= 0) goto L15c
            goto L15e
        L15c:
            r13 = r23
        L15e:
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 <= 0) goto L163
            goto L164
        L163:
            r0 = r13
        L164:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r10 = r0 >>> 31
            int r13 = r0 >>> 23
            r13 = r13 & r11
            r12 = r12 & r0
            if (r13 != r11) goto L177
            if (r12 == 0) goto L174
            r7 = r17
        L174:
            r0 = r7
            r7 = r2
            goto L1a4
        L177:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L17f
            r0 = r7
            r7 = r16
            goto L1a4
        L17f:
            if (r13 > 0) goto L193
            if (r13 < r15) goto L191
            r0 = r12 | r14
            int r2 = 1 - r13
            int r0 = r0 >> r2
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L18e
            int r0 = r0 + 8192
        L18e:
            int r0 = r0 >> 13
            goto L1a4
        L191:
            r0 = r7
            goto L1a4
        L193:
            int r7 = r12 >> 13
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1a2
            int r0 = r13 << 10
            r0 = r0 | r7
            int r0 = r0 + r3
            int r2 = r10 << 15
            r0 = r0 | r2
        L1a0:
            short r0 = (short) r0
            goto L1ab
        L1a2:
            r0 = r7
            r7 = r13
        L1a4:
            int r2 = r10 << 15
            int r3 = r7 << 10
            r2 = r2 | r3
            r0 = r0 | r2
            goto L1a0
        L1ab:
            int r2 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r2 >= 0) goto L1b0
            goto L1b2
        L1b0:
            r6 = r24
        L1b2:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1b7
            goto L1b8
        L1b7:
            r5 = r6
        L1b8:
            r2 = 1149222912(0x447fc000, float:1023.0)
            float r5 = r5 * r2
            float r5 = r5 + r4
            int r2 = (int) r5
            long r3 = (long) r8
            r5 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r5
            r7 = 48
            long r3 = r3 << r7
            long r7 = (long) r9
            long r7 = r7 & r5
            long r7 = r7 << r19
            long r3 = r3 | r7
            long r7 = (long) r0
            long r5 = r5 & r7
            long r5 = r5 << r18
            long r3 = r3 | r5
            long r5 = (long) r2
            r7 = 1023(0x3ff, double:5.054E-321)
            long r5 = r5 & r7
            r0 = 6
            long r5 = r5 << r0
            long r2 = r3 | r5
            long r0 = (long) r1
            r4 = 63
            long r0 = r0 & r4
            long r0 = r0 | r2
            int r2 = defpackage.kt0.i
            return r0
    }

    public static final void a0(defpackage.ar0 r5, java.lang.String r6) {
            r5.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "in the polymorphic scope of '"
            r0.<init>(r1)
            java.lang.String r1 = r5.c()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            fc6 r1 = new fc6
            if (r6 != 0) goto L27
            java.lang.String r5 = "Class discriminator was missing and no default serializers were registered "
            r6 = 46
            java.lang.String r5 = defpackage.i61.k(r6, r5, r0)
            goto L48
        L27:
            java.lang.String r2 = "' is not found "
            java.lang.String r3 = ".\nCheck if class with serial name '"
            java.lang.String r4 = "Serializer for subclass '"
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r6, r2, r0, r3)
            java.lang.String r2 = "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '"
            java.lang.String r3 = "' has to be '@Serializable', and the base class '"
            defpackage.i61.B(r0, r6, r2, r6, r3)
            java.lang.String r5 = r5.c()
            r0.append(r5)
            java.lang.String r5 = "' has to be sealed and '@Serializable'."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L48:
            r1.<init>(r5)
            throw r1
    }

    public static final long b(int r2) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            int r2 = defpackage.kt0.i
            return r0
    }

    public static final int b0(long r1) {
            float[] r0 = defpackage.qt0.a
            cq5 r0 = defpackage.qt0.e
            long r1 = defpackage.kt0.b(r1, r0)
            r0 = 32
            long r1 = r1 >>> r0
            int r1 = (int) r1
            return r1
    }

    public static final long c(long r1) {
            r0 = 32
            long r1 = r1 << r0
            int r0 = defpackage.kt0.i
            return r1
    }

    public static java.lang.String c0(long r4) {
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = 41
            if (r5 != 0) goto L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CornerRadius.circular("
            r4.<init>(r5)
            float r5 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r5 = defpackage.gi2.Q(r5)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "CornerRadius.elliptical("
            r5.<init>(r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = defpackage.gi2.Q(r0)
            r5.append(r0)
            java.lang.String r0 = ", "
            r5.append(r0)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.String r4 = defpackage.gi2.Q(r4)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            return r4
    }

    public static final void d(defpackage.pq r11, defpackage.eo2 r12, defpackage.px0 r13, int r14) {
            xq2 r13 = (defpackage.xq2) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.d0(r0)
            r93 r0 = r13.x
            xv4 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            km4 r3 = defpackage.tx0.b
            r13.Y(r2, r3)
            java.lang.Object r2 = r13.P()
            vs0 r3 = defpackage.ox0.a
            boolean r3 = defpackage.nb3.k(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            nk7 r2 = (defpackage.nk7) r2
        L29:
            java.lang.Object r3 = r11.f
            l55 r3 = (defpackage.l55) r3
            nk7 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.l0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L52
            boolean r2 = r11.e
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4e
        L4a:
            xv4 r1 = r1.d(r3, r5)
        L4e:
            r13.J = r7
        L50:
            r2 = r8
            goto L8d
        L52:
            lk6 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            xv4 r6 = (defpackage.xv4) r6
            boolean r9 = r13.E()
            if (r9 == 0) goto L69
            if (r2 != 0) goto L74
        L69:
            boolean r9 = r11.e
            if (r9 != 0) goto L82
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L74
            goto L82
        L74:
            if (r2 == 0) goto L7b
            boolean r2 = r13.w
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            boolean r2 = r13.w
            if (r2 == 0) goto L80
            goto L86
        L80:
            r1 = r6
            goto L86
        L82:
            xv4 r1 = r1.d(r3, r5)
        L86:
            boolean r2 = r13.y
            if (r2 != 0) goto L8c
            if (r6 == r1) goto L50
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L96
            boolean r3 = r13.S
            if (r3 != 0) goto L96
            r13.N(r1)
        L96:
            boolean r3 = r13.w
            r0.c(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            km4 r3 = defpackage.tx0.c
            r13.W(r3, r2, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.o(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lbe
            goto Lbf
        Lbe:
            r7 = r8
        Lbf:
            r13.w = r7
            r13.K = r4
            cf5 r13 = r13.t()
            if (r13 == 0) goto Ld1
            hp r0 = new hp
            r1 = 3
            r0.<init>(r11, r14, r1, r12)
            r13.d = r0
        Ld1:
            return
    }

    public static final java.lang.Object d0(defpackage.l61 r5, defpackage.eo2 r6, defpackage.r41 r7) {
            l61 r0 = r7.b()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            lw0 r2 = new lw0
            r3 = 21
            r4 = 0
            r2.<init>(r3, r4)
            java.lang.Object r1 = r5.x(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1f
            l61 r5 = r0.N(r5)
            goto L23
        L1f:
            l61 r5 = defpackage.mb3.A(r0, r5, r4)
        L23:
            defpackage.yh2.o(r5)
            r1 = 1
            if (r5 != r0) goto L33
            o66 r0 = new o66
            r0.<init>(r7, r5)
            java.lang.Object r5 = defpackage.mp2.Z(r0, r1, r0, r6)
            goto L9a
        L33:
            d90 r2 = defpackage.d90.r0
            j61 r3 = r5.Z(r2)
            j61 r0 = r0.Z(r2)
            boolean r0 = defpackage.nb3.k(r3, r0)
            r2 = 0
            if (r0 == 0) goto L5d
            eg7 r0 = new eg7
            r0.<init>(r7, r5)
            l61 r5 = r0.X
            java.lang.Object r7 = defpackage.k57.c(r5, r2)
            java.lang.Object r6 = defpackage.mp2.Z(r0, r1, r0, r6)     // Catch: java.lang.Throwable -> L58
            defpackage.k57.a(r5, r7)
            r5 = r6
            goto L9a
        L58:
            r6 = move-exception
            defpackage.k57.a(r5, r7)
            throw r6
        L5d:
            pk1 r0 = new pk1
            r0.<init>(r7, r5)
            r41 r5 = defpackage.np2.F(r6, r0, r0)     // Catch: java.lang.Throwable -> L9d
            r41 r5 = defpackage.np2.V(r5)     // Catch: java.lang.Throwable -> L9d
            jg7 r6 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L9d
            defpackage.ok1.a(r5, r6)     // Catch: java.lang.Throwable -> L9d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.pk1.Z
        L71:
            int r6 = r5.get(r0)
            if (r6 == 0) goto L92
            r5 = 2
            if (r6 != r5) goto L8c
            java.lang.Object r5 = r0.Q()
            java.lang.Object r5 = defpackage.fd3.a(r5)
            boolean r6 = r5 instanceof defpackage.av0
            if (r6 != 0) goto L87
            goto L9a
        L87:
            av0 r5 = (defpackage.av0) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        L8c:
            java.lang.String r5 = "Already suspended"
            defpackage.i.m(r5)
            return r2
        L92:
            boolean r6 = r5.compareAndSet(r0, r4, r1)
            if (r6 == 0) goto L71
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
        L9a:
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            return r5
        L9d:
            r5 = move-exception
            boolean r6 = r5 instanceof defpackage.mk1
            if (r6 == 0) goto La6
            mk1 r5 = (defpackage.mk1) r5
            java.lang.Throwable r5 = r5.A
        La6:
            em5 r6 = defpackage.oi2.p(r5)
            r0.i(r6)
            throw r5
    }

    public static final void e(defpackage.pq[] r10, defpackage.eo2 r11, defpackage.px0 r12, int r13) {
            xq2 r12 = (defpackage.xq2) r12
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r12.d0(r0)
            r93 r0 = r12.x
            xv4 r1 = r12.l()
            r2 = 201(0xc9, float:2.82E-43)
            km4 r3 = defpackage.tx0.b
            r12.Y(r2, r3)
            boolean r2 = r12.S
            km4 r3 = defpackage.tx0.d
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            xv4 r2 = defpackage.xv4.R
            xv4 r2 = defpackage.q60.c0(r10, r1, r2)
            r1.getClass()
            wv4 r7 = new wv4
            r7.<init>(r1)
            r7.Z = r1
            r7.putAll(r2)
            xv4 r1 = r7.d()
            r12.Y(r4, r3)
            r12.H()
            r12.m0(r1)
            r12.H()
            r12.m0(r2)
            r12.p(r6)
            r12.J = r5
        L4a:
            r2 = r6
            goto Lb6
        L4c:
            lk6 r2 = r12.G
            int r7 = r2.g
            java.lang.Object r2 = r2.h(r7, r6)
            r2.getClass()
            xv4 r2 = (defpackage.xv4) r2
            lk6 r7 = r12.G
            int r8 = r7.g
            java.lang.Object r7 = r7.h(r8, r5)
            r7.getClass()
            xv4 r7 = (defpackage.xv4) r7
            xv4 r8 = defpackage.q60.c0(r10, r1, r7)
            boolean r9 = r12.E()
            if (r9 == 0) goto L88
            boolean r9 = r12.y
            if (r9 != 0) goto L88
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7b
            goto L88
        L7b:
            int r1 = r12.l
            lk6 r3 = r12.G
            int r3 = r3.s()
            int r3 = r3 + r1
            r12.l = r3
            r1 = r2
            goto L4a
        L88:
            r1.getClass()
            wv4 r7 = new wv4
            r7.<init>(r1)
            r7.Z = r1
            r7.putAll(r8)
            xv4 r1 = r7.d()
            r12.Y(r4, r3)
            r12.H()
            r12.m0(r1)
            r12.H()
            r12.m0(r8)
            r12.p(r6)
            boolean r3 = r12.y
            if (r3 != 0) goto Lb5
            boolean r2 = defpackage.nb3.k(r1, r2)
            if (r2 != 0) goto L4a
        Lb5:
            r2 = r5
        Lb6:
            if (r2 == 0) goto Lbf
            boolean r3 = r12.S
            if (r3 != 0) goto Lbf
            r12.N(r1)
        Lbf:
            boolean r3 = r12.w
            r0.c(r3)
            r12.w = r2
            r12.K = r1
            r2 = 202(0xca, float:2.83E-43)
            km4 r3 = defpackage.tx0.c
            r12.W(r3, r2, r6, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.o(r12, r1)
            r12.p(r6)
            r12.p(r6)
            int r0 = r0.b()
            if (r0 == 0) goto Le7
            goto Le8
        Le7:
            r5 = r6
        Le8:
            r12.w = r5
            r0 = 0
            r12.K = r0
            cf5 r12 = r12.t()
            if (r12 == 0) goto Lfb
            hp r0 = new hp
            r1 = 4
            r0.<init>(r10, r13, r1, r11)
            r12.d = r0
        Lfb:
            return
    }

    public static final void f(java.lang.String r27, java.lang.String r28, defpackage.on2 r29, defpackage.a74 r30, defpackage.px0 r31, int r32) {
            r0 = r27
            r1 = r28
            r2 = r30
            r29.getClass()
            r8 = r31
            xq2 r8 = (defpackage.xq2) r8
            r3 = -1318050154(0xffffffffb1702696, float:-3.494653E-9)
            r8.d0(r3)
            boolean r3 = r8.f(r0)
            if (r3 == 0) goto L1b
            r3 = 4
            goto L1c
        L1b:
            r3 = 2
        L1c:
            r3 = r32 | r3
            boolean r4 = r8.f(r1)
            if (r4 == 0) goto L27
            r4 = 32
            goto L29
        L27:
            r4 = 16
        L29:
            r3 = r3 | r4
            r14 = r29
            boolean r4 = r8.h(r14)
            if (r4 == 0) goto L35
            r4 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r4 = 128(0x80, float:1.8E-43)
        L37:
            r3 = r3 | r4
            boolean r4 = r8.f(r2)
            if (r4 == 0) goto L41
            r4 = 2048(0x800, float:2.87E-42)
            goto L43
        L41:
            r4 = 1024(0x400, float:1.435E-42)
        L43:
            r3 = r3 | r4
            r4 = r3 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 == r5) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            r5 = r3 & 1
            boolean r4 = r8.S(r5, r4)
            if (r4 == 0) goto L255
            es7 r4 = defpackage.bl2.F(r8)
            r5 = 1090519040(0x41000000, float:8.0)
            y16 r9 = defpackage.z16.b(r5)
            java.lang.Object r10 = r8.P()
            vs0 r11 = defpackage.ox0.a
            if (r10 != r11) goto L6b
            r94 r10 = defpackage.i61.f(r8)
        L6b:
            r94 r10 = (defpackage.r94) r10
            r11 = 6
            qa4 r12 = defpackage.bw7.a(r10, r8, r11)
            r13 = 1065353216(0x3f800000, float:1.0)
            a74 r15 = defpackage.dj6.c(r2, r13)
            r7 = 1094713344(0x41400000, float:12.0)
            a74 r7 = defpackage.ge7.P(r15, r7, r13)
            a74 r7 = defpackage.u24.g(r7, r9)
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            x64 r15 = defpackage.x64.a
            if (r12 == 0) goto L99
            r12 = 1077936128(0x40400000, float:3.0)
            long r13 = r4.j
            a74 r9 = defpackage.ak7.I(r15, r12, r13, r9)
            goto L9a
        L99:
            r9 = r15
        L9a:
            a74 r9 = r7.d(r9)
            r13 = 0
            r7 = r15
            r15 = 28
            r12 = r11
            r11 = 0
            r14 = r12
            r12 = 0
            r14 = r29
            a74 r9 = defpackage.mb3.t(r9, r10, r11, r12, r13, r14, r15)
            r10 = 1092616192(0x41200000, float:10.0)
            a74 r5 = defpackage.ge7.P(r9, r5, r10)
            d40 r9 = defpackage.d90.i0
            du r10 = defpackage.ju.a
            r11 = 48
            l26 r9 = defpackage.k26.a(r10, r9, r8, r11)
            long r10 = r8.T
            int r10 = java.lang.Long.hashCode(r10)
            xv4 r11 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r8.f0()
            boolean r13 = r8.S
            if (r13 == 0) goto Ldc
            r8.k(r12)
            goto Ldf
        Ldc:
            r8.o0()
        Ldf:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r8, r13, r9)
            pn r14 = defpackage.ix0.e
            defpackage.yh2.K(r8, r14, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            pn r11 = defpackage.ix0.g
            defpackage.yh2.K(r8, r11, r9)
            ne r15 = defpackage.ix0.h
            defpackage.yh2.F(r8, r15)
            pn r9 = defpackage.ix0.d
            defpackage.yh2.K(r8, r9, r5)
            r5 = 1110966272(0x42380000, float:46.0)
            a74 r5 = defpackage.dj6.i(r7, r5)
            r10 = 1086324736(0x40c00000, float:6.0)
            y16 r10 = defpackage.z16.b(r10)
            a74 r5 = defpackage.u24.g(r5, r10)
            r16 = r7
            long r6 = r4.m
            jy2 r10 = defpackage.u24.m
            a74 r5 = defpackage.vy7.L(r5, r6, r10)
            e40 r6 = defpackage.d90.Z
            r10 = 0
            e34 r6 = defpackage.h70.d(r6, r10)
            r17 = r11
            long r10 = r8.T
            int r10 = java.lang.Long.hashCode(r10)
            xv4 r11 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            r8.f0()
            boolean r7 = r8.S
            if (r7 == 0) goto L138
            r8.k(r12)
            goto L13b
        L138:
            r8.o0()
        L13b:
            defpackage.yh2.K(r8, r13, r6)
            defpackage.yh2.K(r8, r14, r11)
            r11 = r17
            defpackage.i61.w(r10, r8, r11, r8, r15)
            defpackage.yh2.K(r8, r9, r5)
            r5 = r3
            e33 r3 = defpackage.hi2.A()
            long r6 = r4.l
            r10 = 1103101952(0x41c00000, float:24.0)
            r0 = r16
            a74 r10 = defpackage.dj6.i(r0, r10)
            r16 = r9
            r9 = 432(0x1b0, float:6.05E-43)
            r17 = r5
            r5 = r10
            r10 = 0
            r19 = r4
            r4 = 0
            r2 = r0
            r1 = r16
            r25 = r17
            r0 = 1
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r8.p(r0)
            r3 = 1095761920(0x41500000, float:13.0)
            a74 r2 = defpackage.dj6.l(r2, r3)
            defpackage.gi2.h(r8, r2)
            vn3 r2 = new vn3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r0)
            d90 r3 = defpackage.ju.d
            c40 r4 = defpackage.d90.k0
            r5 = 6
            yt0 r3 = defpackage.wt0.a(r3, r4, r8, r5)
            long r4 = r8.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r8.l()
            a74 r2 = defpackage.l.E(r8, r2)
            r8.f0()
            boolean r6 = r8.S
            if (r6 == 0) goto L1a1
            r8.k(r12)
            goto L1a4
        L1a1:
            r8.o0()
        L1a4:
            defpackage.yh2.K(r8, r13, r3)
            defpackage.yh2.K(r8, r14, r5)
            defpackage.i61.w(r4, r8, r11, r8, r15)
            defpackage.yh2.K(r8, r1, r2)
            r1 = r19
            long r2 = r1.g
            r23 = 14
            long r4 = defpackage.hi2.E(r23)
            r6 = 18
            long r11 = defpackage.hi2.E(r6)
            oj2 r6 = defpackage.oj2.d0
            r7 = r25 & 14
            r9 = 199680(0x30c00, float:2.79811E-40)
            r20 = r7 | r9
            r21 = 3126(0xc36, float:4.38E-42)
            r22 = 119762(0x1d3d2, float:1.67822E-40)
            r1 = 0
            r7 = 0
            r10 = r19
            r19 = r8
            r8 = 0
            r13 = r10
            r10 = 0
            r14 = r13
            r13 = 2
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 1
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r24 = r18
            r18 = 0
            r0 = r27
            r26 = r24
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r19
            int r1 = r28.length()
            if (r1 <= 0) goto L243
            r1 = r28
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L243
            r2 = -1246224798(0xffffffffb5b81e62, float:-1.3717911E-6)
            r8.b0(r2)
            r10 = r26
            long r2 = r10.i
            r4 = 12
            long r4 = defpackage.hi2.E(r4)
            r6 = 15
            long r11 = defpackage.hi2.E(r6)
            int r6 = r25 >> 3
            r6 = r6 & 14
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            r21 = 3126(0xc36, float:4.38E-42)
            r22 = 119794(0x1d3f2, float:1.67867E-40)
            r1 = 0
            r20 = r6
            r6 = 0
            r7 = 0
            r19 = r8
            r8 = 0
            r10 = 0
            r13 = 2
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r0 = r28
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r19
            r10 = 0
            r8.p(r10)
        L241:
            r0 = 1
            goto L24e
        L243:
            r10 = 0
            r0 = -1245949518(0xffffffffb5bc51b2, float:-1.4030868E-6)
            r8.b0(r0)
            r8.p(r10)
            goto L241
        L24e:
            r8.p(r0)
            r8.p(r0)
            goto L258
        L255:
            r8.V()
        L258:
            cf5 r7 = r8.t()
            if (r7 == 0) goto L270
            dx5 r0 = new dx5
            r6 = 1
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L270:
            return
    }

    public static final void g(defpackage.pq5 r60, java.lang.String r61, java.lang.String r62, boolean r63, boolean r64, boolean r65, defpackage.on2 r66, defpackage.on2 r67, defpackage.on2 r68, defpackage.a74 r69, defpackage.px0 r70, int r71) {
            r0 = r60
            r12 = r64
            r13 = r65
            r14 = r69
            long r1 = r0.j
            r66.getClass()
            r67.getClass()
            r68.getClass()
            r8 = r70
            xq2 r8 = (defpackage.xq2) r8
            r3 = 1445968064(0x562fb8c0, float:4.8302008E13)
            r8.d0(r3)
            boolean r3 = r8.h(r0)
            if (r3 == 0) goto L25
            r3 = 4
            goto L26
        L25:
            r3 = 2
        L26:
            r3 = r71 | r3
            r9 = r61
            boolean r5 = r8.f(r9)
            if (r5 == 0) goto L33
            r5 = 32
            goto L35
        L33:
            r5 = 16
        L35:
            r3 = r3 | r5
            r10 = r62
            boolean r5 = r8.f(r10)
            if (r5 == 0) goto L41
            r5 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r5 = 128(0x80, float:1.8E-43)
        L43:
            r3 = r3 | r5
            r11 = r63
            boolean r5 = r8.g(r11)
            if (r5 == 0) goto L4f
            r5 = 2048(0x800, float:2.87E-42)
            goto L51
        L4f:
            r5 = 1024(0x400, float:1.435E-42)
        L51:
            r3 = r3 | r5
            boolean r5 = r8.g(r12)
            if (r5 == 0) goto L5b
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L5d
        L5b:
            r5 = 8192(0x2000, float:1.148E-41)
        L5d:
            r3 = r3 | r5
            boolean r5 = r8.g(r13)
            if (r5 == 0) goto L67
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L69
        L67:
            r5 = 65536(0x10000, float:9.1835E-41)
        L69:
            r3 = r3 | r5
            r15 = r66
            boolean r5 = r8.h(r15)
            if (r5 == 0) goto L75
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L77
        L75:
            r5 = 524288(0x80000, float:7.34684E-40)
        L77:
            r3 = r3 | r5
            r5 = r67
            boolean r6 = r8.h(r5)
            if (r6 == 0) goto L83
            r6 = 8388608(0x800000, float:1.1754944E-38)
            goto L85
        L83:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L85:
            r3 = r3 | r6
            r6 = r68
            boolean r7 = r8.h(r6)
            if (r7 == 0) goto L91
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            goto L93
        L91:
            r7 = 33554432(0x2000000, float:9.403955E-38)
        L93:
            r3 = r3 | r7
            boolean r7 = r8.f(r14)
            if (r7 == 0) goto L9d
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L9f
        L9d:
            r7 = 268435456(0x10000000, float:2.524355E-29)
        L9f:
            r38 = r3 | r7
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r38 & r3
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 == r7) goto Lad
            r3 = 1
            goto Lae
        Lad:
            r3 = 0
        Lae:
            r7 = r38 & 1
            boolean r3 = r8.S(r7, r3)
            if (r3 == 0) goto L8e8
            es7 r3 = defpackage.bl2.F(r8)
            nq6 r7 = defpackage.kf.b
            java.lang.Object r7 = r8.j(r7)
            android.content.Context r7 = (android.content.Context) r7
            r16 = 1090519040(0x41000000, float:8.0)
            y16 r11 = defpackage.z16.b(r16)
            java.lang.Object r4 = r8.P()
            vs0 r0 = defpackage.ox0.a
            if (r4 != r0) goto Ld4
            r94 r4 = defpackage.i61.f(r8)
        Ld4:
            r0 = r4
            r94 r0 = (defpackage.r94) r0
            r4 = 6
            qa4 r17 = defpackage.bw7.a(r0, r8, r4)
            qa4 r4 = defpackage.gi2.u(r0, r8)
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r18 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto Lf6
            r4 = 1064682127(0x3f75c28f, float:0.96)
        Lf3:
            r19 = r0
            goto Lf8
        Lf6:
            r4 = r7
            goto Lf3
        Lf8:
            r0 = 1165623296(0x457a0000, float:4000.0)
            r22 = r1
            r1 = 0
            r2 = 4
            io6 r0 = defpackage.ge7.U(r7, r0, r1, r2)
            r1 = r7
            r7 = 3120(0xc30, float:4.372E-42)
            r34 = r8
            r8 = 20
            java.lang.String r5 = "press"
            r2 = r4
            r4 = r0
            r0 = r3
            r3 = r2
            r2 = r1
            r1 = r18
            r6 = r34
            pp6 r3 = defpackage.in.b(r3, r4, r5, r6, r7, r8)
            r8 = r6
            a74 r4 = defpackage.dj6.c(r14, r2)
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            a74 r3 = defpackage.ln2.X(r4, r3)
            r4 = 1092616192(0x41200000, float:10.0)
            r5 = 1075838976(0x40200000, float:2.5)
            a74 r3 = defpackage.ge7.P(r3, r4, r5)
            a74 r3 = defpackage.u24.g(r3, r11)
            long r6 = r0.c
            jy2 r4 = defpackage.u24.m
            a74 r3 = defpackage.vy7.L(r3, r6, r4)
            r6 = 1061158912(0x3f400000, float:0.75)
            r7 = r1
            long r1 = r0.f
            a74 r1 = defpackage.ak7.I(r3, r6, r1, r11)
            java.lang.Object r2 = r17.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            x64 r3 = defpackage.x64.a
            if (r2 == 0) goto L15e
            r2 = r7
            long r6 = r0.j
            a74 r6 = defpackage.ak7.I(r3, r5, r6, r11)
            goto L160
        L15e:
            r2 = r7
            r6 = r3
        L160:
            a74 r1 = r1.d(r6)
            r17 = 0
            r20 = 444(0x1bc, float:6.22E-43)
            r18 = r67
            r16 = r19
            r19 = r15
            r15 = r1
            a74 r1 = defpackage.mb3.v(r15, r16, r17, r18, r19, r20)
            r6 = 1088421888(0x40e00000, float:7.0)
            r7 = 1092616192(0x41200000, float:10.0)
            a74 r1 = defpackage.ge7.P(r1, r7, r6)
            d40 r15 = defpackage.d90.i0
            du r6 = defpackage.ju.a
            r11 = 48
            l26 r5 = defpackage.k26.a(r6, r15, r8, r11)
            long r11 = r8.T
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r8.l()
            a74 r1 = defpackage.l.E(r8, r1)
            ix0 r17 = defpackage.jx0.i
            r17.getClass()
            r17 = r6
            iy0 r6 = defpackage.ix0.b
            r8.f0()
            boolean r7 = r8.S
            if (r7 == 0) goto L1a7
            r8.k(r6)
            goto L1aa
        L1a7:
            r8.o0()
        L1aa:
            pn r7 = defpackage.ix0.f
            defpackage.yh2.K(r8, r7, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r8, r5, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            pn r12 = defpackage.ix0.g
            defpackage.yh2.K(r8, r12, r11)
            ne r11 = defpackage.ix0.h
            defpackage.yh2.F(r8, r11)
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r8, r13, r1)
            r1 = 1111490560(0x42400000, float:48.0)
            a74 r1 = defpackage.dj6.l(r3, r1)
            r18 = r0
            r0 = 1066342266(0x3f8f177a, float:1.117904)
            a74 r0 = defpackage.ak7.H(r1, r0)
            r1 = 1086324736(0x40c00000, float:6.0)
            y16 r1 = defpackage.z16.b(r1)
            a74 r0 = defpackage.u24.g(r0, r1)
            e40 r1 = defpackage.d90.L
            r19 = r2
            r20 = r3
            r2 = 0
            e34 r3 = defpackage.h70.d(r1, r2)
            r27 = r3
            long r2 = r8.T
            int r2 = java.lang.Long.hashCode(r2)
            xv4 r3 = r8.l()
            a74 r0 = defpackage.l.E(r8, r0)
            r8.f0()
            r28 = r1
            boolean r1 = r8.S
            if (r1 == 0) goto L20a
            r8.k(r6)
        L207:
            r1 = r27
            goto L20e
        L20a:
            r8.o0()
            goto L207
        L20e:
            defpackage.yh2.K(r8, r7, r1)
            defpackage.yh2.K(r8, r5, r3)
            defpackage.i61.w(r2, r8, r12, r8, r11)
            defpackage.yh2.K(r8, r13, r0)
            vs0 r0 = defpackage.vs0.Y
            r1 = 18
            long r1 = defpackage.hi2.E(r1)
            lc2 r3 = defpackage.dj6.c
            r27 = r0
            r0 = r38 & 14
            r0 = r0 | 27648(0x6c00, float:3.8743E-41)
            int r29 = r38 >> 3
            r29 = r29 & 112(0x70, float:1.57E-43)
            r0 = r0 | r29
            r29 = r0
            int r0 = r38 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r29 | r0
            int r29 = r38 << 9
            r30 = 3670016(0x380000, float:5.142788E-39)
            r29 = r29 & r30
            r0 = r0 | r29
            r29 = r11
            r11 = 160(0xa0, float:2.24E-43)
            r30 = r6
            r6 = 0
            r34 = r8
            r8 = 0
            r46 = r5
            r47 = r7
            r44 = r12
            r43 = r13
            r70 = r15
            r50 = r17
            r42 = r18
            r41 = r19
            r14 = r20
            r39 = r22
            r13 = r27
            r12 = r28
            r45 = r29
            r48 = r30
            r7 = r63
            r15 = r4
            r4 = r1
            r2 = r9
            r1 = r10
            r9 = r34
            r10 = r0
            r0 = r60
            defpackage.hf.u(r0, r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r8 = r9
            boolean r1 = r0.k
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L30d
            r1 = -2075019145(0xffffffff8451b877, float:-2.4652534E-36)
            r8.b0(r1)
            e40 r1 = defpackage.d90.X
            a74 r1 = r13.n(r14, r1)
            a74 r1 = defpackage.ge7.O(r1, r2)
            y16 r3 = defpackage.z16.a
            a74 r1 = defpackage.u24.g(r1, r3)
            int r3 = defpackage.kt0.i
            long r3 = defpackage.kt0.b
            r5 = 1059481190(0x3f266666, float:0.65)
            long r3 = defpackage.kt0.c(r5, r3)
            a74 r1 = defpackage.vy7.L(r1, r3, r15)
            a74 r1 = defpackage.ge7.O(r1, r2)
            r11 = 0
            e34 r3 = defpackage.h70.d(r12, r11)
            long r4 = r8.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r8.l()
            a74 r1 = defpackage.l.E(r8, r1)
            r8.f0()
            boolean r6 = r8.S
            if (r6 == 0) goto L2c6
            r6 = r48
            r8.k(r6)
        L2c3:
            r7 = r47
            goto L2cc
        L2c6:
            r6 = r48
            r8.o0()
            goto L2c3
        L2cc:
            defpackage.yh2.K(r8, r7, r3)
            r3 = r46
            defpackage.yh2.K(r8, r3, r5)
            r5 = r44
            r9 = r45
            defpackage.i61.w(r4, r8, r5, r8, r9)
            r4 = r43
            defpackage.yh2.K(r8, r4, r1)
            e33 r3 = defpackage.kj2.D()
            r30 = r6
            r47 = r7
            long r6 = defpackage.es7.q
            r1 = 1092616192(0x41200000, float:10.0)
            a74 r5 = defpackage.dj6.i(r14, r1)
            r29 = r9
            r9 = 3504(0xdb0, float:4.91E-42)
            r10 = 0
            r4 = 0
            r54 = r29
            r1 = r30
            r55 = r43
            r53 = r44
            r52 = r46
            r51 = r47
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r3 = 1
            r8.p(r3)
            r8.p(r11)
            goto L324
        L30d:
            r55 = r43
            r53 = r44
            r54 = r45
            r52 = r46
            r51 = r47
            r1 = r48
            r3 = 1
            r11 = 0
            r4 = -2074414676(0xffffffff845af1ac, float:-2.5736747E-36)
            r8.b0(r4)
            r8.p(r11)
        L324:
            r4 = 1060320051(0x3f333333, float:0.7)
            if (r65 == 0) goto L3bd
            r5 = -2074355001(0xffffffff845bdac7, float:-2.5843784E-36)
            r8.b0(r5)
            e40 r5 = defpackage.d90.g0
            a74 r5 = r13.n(r14, r5)
            a74 r5 = defpackage.ge7.O(r5, r2)
            r6 = 1077936128(0x40400000, float:3.0)
            y16 r6 = defpackage.z16.b(r6)
            a74 r5 = defpackage.u24.g(r5, r6)
            int r6 = defpackage.kt0.i
            long r6 = defpackage.kt0.b
            long r6 = defpackage.kt0.c(r4, r6)
            a74 r5 = defpackage.vy7.L(r5, r6, r15)
            r6 = 1075838976(0x40200000, float:2.5)
            r13 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.ge7.P(r5, r6, r13)
            e34 r7 = defpackage.h70.d(r12, r11)
            long r9 = r8.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            r8.f0()
            boolean r3 = r8.S
            if (r3 == 0) goto L376
            r8.k(r1)
        L373:
            r3 = r51
            goto L37a
        L376:
            r8.o0()
            goto L373
        L37a:
            defpackage.yh2.K(r8, r3, r7)
            r7 = r52
            defpackage.yh2.K(r8, r7, r10)
            r10 = r53
            r2 = r54
            defpackage.i61.w(r9, r8, r10, r8, r2)
            r9 = r55
            defpackage.yh2.K(r8, r9, r5)
            r47 = r3
            e33 r3 = defpackage.q60.F()
            r26 = r6
            r46 = r7
            long r6 = defpackage.es7.p
            r5 = 1092091904(0x41180000, float:9.5)
            a74 r5 = defpackage.dj6.i(r14, r5)
            r9 = 3504(0xdb0, float:4.91E-42)
            r44 = r10
            r10 = 0
            r16 = r4
            r4 = 0
            r49 = r26
            r58 = r44
            r57 = r46
            r56 = r47
            r59 = r55
            r13 = 1
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r8.p(r13)
            r8.p(r11)
            goto L3d3
        L3bd:
            r13 = r3
            r56 = r51
            r57 = r52
            r58 = r53
            r2 = r54
            r59 = r55
            r49 = 1075838976(0x40200000, float:2.5)
            r3 = -2073704404(0xffffffff8465c82c, float:-2.7010735E-36)
            r8.b0(r3)
            r8.p(r11)
        L3d3:
            r8.p(r13)
            r3 = 1094713344(0x41400000, float:12.0)
            a74 r3 = defpackage.dj6.l(r14, r3)
            defpackage.gi2.h(r8, r3)
            vn3 r3 = new vn3
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r13)
            c40 r4 = defpackage.d90.k0
            eu r5 = defpackage.ju.c
            yt0 r4 = defpackage.wt0.a(r5, r4, r8, r11)
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r8.l()
            a74 r3 = defpackage.l.E(r8, r3)
            r8.f0()
            boolean r9 = r8.S
            if (r9 == 0) goto L409
            r8.k(r1)
        L406:
            r9 = r56
            goto L40d
        L409:
            r8.o0()
            goto L406
        L40d:
            defpackage.yh2.K(r8, r9, r4)
            r4 = r57
            defpackage.yh2.K(r8, r4, r7)
            r7 = r58
            defpackage.i61.w(r6, r8, r7, r8, r2)
            r6 = r59
            defpackage.yh2.K(r8, r6, r3)
            r3 = r15
            java.lang.String r15 = defpackage.hf.k0(r0)
            r10 = r42
            r42 = r12
            long r11 = r10.g
            pi2 r22 = defpackage.qs7.a
            r16 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r19 = defpackage.hi2.D(r16)
            r16 = 4625619029774565376(0x4031800000000000, double:17.5)
            long r26 = defpackage.hi2.D(r16)
            oj2 r21 = defpackage.oj2.e0
            r13 = 1065353216(0x3f800000, float:1.0)
            a74 r16 = defpackage.dj6.c(r14, r13)
            r36 = 3126(0xc36, float:4.38E-42)
            r37 = 119696(0x1d390, float:1.6773E-40)
            r23 = 0
            r25 = 0
            r28 = 2
            r29 = 0
            r30 = 3
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 1772592(0x1b0c30, float:2.48393E-39)
            r34 = r8
            r17 = r11
            r11 = r3
            r3 = r70
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r12 = r21
            java.lang.String r13 = r0.b
            boolean r15 = defpackage.qs6.v0(r13)
            if (r15 != 0) goto L47e
            r45 = r2
            r44 = r3
            r55 = r6
            r41 = r11
            r70 = r12
            r24 = r14
        L47b:
            r15 = r13
            goto L551
        L47e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Date r15 = r0.g
            if (r15 == 0) goto L4b1
            long r16 = r15.getTime()
            long r18 = java.lang.System.currentTimeMillis()
            r20 = 60000(0xea60, double:2.9644E-319)
            java.lang.CharSequence r15 = android.text.format.DateUtils.getRelativeTimeSpanString(r16, r18, r20)
            java.lang.String r15 = r15.toString()
            r70 = r12
            r12 = 2131952550(0x7f1303a6, float:1.9541546E38)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            r24 = r14
            r14 = r41
            java.lang.String r12 = r14.getString(r12, r15)
            r13.add(r12)
        L4ae:
            r41 = r11
            goto L4b8
        L4b1:
            r70 = r12
            r24 = r14
            r14 = r41
            goto L4ae
        L4b8:
            r11 = 0
            r45 = r2
            r44 = r3
            r2 = r39
            boolean r15 = defpackage.oq1.d(r2, r11)
            if (r15 != 0) goto L530
            boolean r11 = defpackage.oq1.d(r2, r11)
            if (r11 == 0) goto L4d3
            java.lang.String r11 = ""
            r39 = r2
            r55 = r6
            goto L521
        L4d3:
            uq1 r11 = defpackage.uq1.HOURS
            long r11 = defpackage.oq1.k(r2, r11)
            uq1 r15 = defpackage.uq1.MINUTES
            long r15 = defpackage.oq1.k(r2, r15)
            r17 = 60
            r39 = r2
            long r2 = r15 % r17
            r15 = 1
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            r18 = r15
            java.lang.String r15 = "m"
            if (r17 < 0) goto L509
            r55 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            java.lang.String r11 = "h "
            r6.append(r11)
            r6.append(r2)
            r6.append(r15)
            java.lang.String r11 = r6.toString()
            goto L521
        L509:
            r55 = r6
            int r6 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r6 < 0) goto L51f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r15)
            java.lang.String r11 = r6.toString()
            goto L521
        L51f:
            java.lang.String r11 = "<1m"
        L521:
            java.lang.Object[] r2 = new java.lang.Object[]{r11}
            r3 = 2131952583(0x7f1303c7, float:1.9541613E38)
            java.lang.String r2 = r14.getString(r3, r2)
            r13.add(r2)
            goto L534
        L530:
            r39 = r2
            r55 = r6
        L534:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L53f
            java.lang.String r2 = r0.c
            r13.add(r2)
        L53f:
            r20 = 0
            r21 = 62
            java.lang.String r17 = " • "
            r18 = 0
            r19 = 0
            r16 = r13
            java.lang.String r13 = defpackage.gt0.P0(r16, r17, r18, r19, r20, r21)
            goto L47b
        L551:
            int r2 = r15.length()
            r11 = 14
            if (r2 <= 0) goto L5a6
            r2 = -1090204374(0xffffffffbf04cd2a, float:-0.51875556)
            r8.b0(r2)
            long r2 = r10.i
            pi2 r22 = defpackage.qs7.b
            r12 = 4622663542519103488(0x4027000000000000, double:11.5)
            long r19 = defpackage.hi2.D(r12)
            long r12 = defpackage.hi2.E(r11)
            r28 = 0
            r29 = 13
            r25 = 0
            r27 = 0
            r26 = r49
            a74 r16 = defpackage.ge7.S(r24, r25, r26, r27, r28, r29)
            r14 = r24
            r36 = 3126(0xc36, float:4.38E-42)
            r37 = 119728(0x1d3b0, float:1.67775E-40)
            r21 = 0
            r23 = 0
            r25 = 0
            r28 = 2
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 1575984(0x180c30, float:2.208424E-39)
            r17 = r2
            r34 = r8
            r26 = r12
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 0
            r8.p(r2)
        L5a4:
            r13 = 1
            goto L5b3
        L5a6:
            r14 = r24
            r2 = 0
            r3 = -1089804164(0xffffffffbf0ae87c, float:-0.54260993)
            r8.b0(r3)
            r8.p(r2)
            goto L5a4
        L5b3:
            r8.p(r13)
            r2 = 1092616192(0x41200000, float:10.0)
            a74 r3 = defpackage.dj6.l(r14, r2)
            defpackage.gi2.h(r8, r3)
            vr4 r2 = defpackage.hf.j0(r0)
            c40 r3 = defpackage.d90.m0
            r6 = 48
            yt0 r3 = defpackage.wt0.a(r5, r3, r8, r6)
            long r12 = r8.T
            int r5 = java.lang.Long.hashCode(r12)
            xv4 r12 = r8.l()
            a74 r13 = defpackage.l.E(r8, r14)
            r8.f0()
            boolean r15 = r8.S
            if (r15 == 0) goto L5e4
            r8.k(r1)
            goto L5e7
        L5e4:
            r8.o0()
        L5e7:
            defpackage.yh2.K(r8, r9, r3)
            defpackage.yh2.K(r8, r4, r12)
            r12 = r45
            defpackage.i61.w(r5, r8, r7, r8, r12)
            r3 = r55
            defpackage.yh2.K(r8, r3, r13)
            r5 = r44
            r13 = r50
            l26 r15 = defpackage.k26.a(r13, r5, r8, r6)
            r44 = r7
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r8.l()
            r45 = r11
            a74 r11 = defpackage.l.E(r8, r14)
            r8.f0()
            r18 = r10
            boolean r10 = r8.S
            if (r10 == 0) goto L61e
            r8.k(r1)
            goto L621
        L61e:
            r8.o0()
        L621:
            defpackage.yh2.K(r8, r9, r15)
            defpackage.yh2.K(r8, r4, r7)
            r7 = r44
            defpackage.i61.w(r6, r8, r7, r8, r12)
            defpackage.yh2.K(r8, r3, r11)
            if (r65 == 0) goto L75b
            r6 = -488318828(0xffffffffe2e4d894, float:-2.1107319E21)
            r8.b0(r6)
            r30 = 0
            r31 = 11
            r27 = 0
            r28 = 0
            r29 = 1084227584(0x40a00000, float:5.0)
            r26 = r14
            a74 r6 = defpackage.ge7.S(r26, r27, r28, r29, r30, r31)
            r10 = 1082130432(0x40800000, float:4.0)
            y16 r11 = defpackage.z16.b(r10)
            a74 r6 = defpackage.u24.g(r6, r11)
            r19 = 4279179050(0xff0f172a, double:2.114195361E-314)
            r15 = r10
            long r10 = c(r19)
            r17 = r15
            r15 = 1062836634(0x3f59999a, float:0.85)
            long r10 = defpackage.kt0.c(r15, r10)
            r15 = r41
            a74 r6 = defpackage.vy7.L(r6, r10, r15)
            long r10 = defpackage.es7.p
            r50 = r13
            r44 = r14
            r15 = 1060320051(0x3f333333, float:0.7)
            long r13 = defpackage.kt0.c(r15, r10)
            r20 = r10
            y16 r10 = defpackage.z16.b(r17)
            a74 r6 = defpackage.ak7.I(r6, r15, r13, r10)
            r15 = r17
            r10 = 1073741824(0x40000000, float:2.0)
            a74 r6 = defpackage.ge7.P(r6, r15, r10)
            r11 = r42
            r10 = 0
            e34 r13 = defpackage.h70.d(r11, r10)
            long r14 = r8.T
            int r10 = java.lang.Long.hashCode(r14)
            xv4 r14 = r8.l()
            a74 r6 = defpackage.l.E(r8, r6)
            r8.f0()
            boolean r15 = r8.S
            if (r15 == 0) goto L6a9
            r8.k(r1)
            goto L6ac
        L6a9:
            r8.o0()
        L6ac:
            defpackage.yh2.K(r8, r9, r13)
            defpackage.yh2.K(r8, r4, r14)
            defpackage.i61.w(r10, r8, r7, r8, r12)
            defpackage.yh2.K(r8, r3, r6)
            r13 = r50
            r6 = 48
            l26 r5 = defpackage.k26.a(r13, r5, r8, r6)
            long r13 = r8.T
            int r6 = java.lang.Long.hashCode(r13)
            xv4 r10 = r8.l()
            r14 = r44
            a74 r13 = defpackage.l.E(r8, r14)
            r8.f0()
            boolean r15 = r8.S
            if (r15 == 0) goto L6db
            r8.k(r1)
            goto L6de
        L6db:
            r8.o0()
        L6de:
            defpackage.yh2.K(r8, r9, r5)
            defpackage.yh2.K(r8, r4, r10)
            defpackage.i61.w(r6, r8, r7, r8, r12)
            defpackage.yh2.K(r8, r3, r13)
            r55 = r3
            e33 r3 = defpackage.q60.F()
            r5 = 1092616192(0x41200000, float:10.0)
            a74 r5 = defpackage.dj6.i(r14, r5)
            r47 = r9
            r9 = 3504(0xdb0, float:4.91E-42)
            r10 = 0
            r46 = r4
            java.lang.String r4 = "Achievements"
            r44 = r7
            r13 = r18
            r6 = r20
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            a74 r3 = defpackage.dj6.l(r14, r10)
            defpackage.gi2.h(r8, r3)
            r3 = 8
            long r22 = defpackage.hi2.E(r3)
            oj2 r24 = defpackage.oj2.f0
            s47 r33 = new s47
            r30 = 0
            r32 = 16777208(0xfffff8, float:2.3509876E-38)
            r25 = 0
            r27 = 0
            r29 = 0
            r19 = r33
            r19.<init>(r20, r22, r24, r25, r27, r29, r30, r32)
            r36 = 0
            r37 = 65534(0xfffe, float:9.1833E-41)
            java.lang.String r15 = "RA"
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 6
            r34 = r8
            r9 = r41
            r10 = r47
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r3 = 1
            r4 = 0
            defpackage.i61.y(r8, r3, r3, r4)
            goto L772
        L75b:
            r55 = r3
            r46 = r4
            r44 = r7
            r10 = r9
            r13 = r18
            r9 = r41
            r11 = r42
            r4 = 0
            r3 = -486962857(0xffffffffe2f98957, float:-2.3015678E21)
            r8.b0(r3)
            r8.p(r4)
        L772:
            r3 = -486913753(0xffffffffe2fa4927, float:-2.3084786E21)
            r8.b0(r3)
            java.lang.Object r3 = r2.A
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.B
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r30 = 0
            r31 = 11
            r27 = 0
            r28 = 0
            r29 = 1084227584(0x40a00000, float:5.0)
            r26 = r14
            a74 r5 = defpackage.ge7.S(r26, r27, r28, r29, r30, r31)
            r7 = 384(0x180, float:5.38E-43)
            r34 = r8
            r8 = 0
            r6 = r34
            r15 = r44
            r2 = r46
            r0 = r55
            defpackage.hf.k(r3, r4, r5, r6, r7, r8)
            r8 = r6
            r4 = 0
            r8.p(r4)
            r3 = 1082130432(0x40800000, float:4.0)
            y16 r5 = defpackage.z16.b(r3)
            a74 r5 = defpackage.u24.g(r14, r5)
            long r6 = r13.d
            a74 r5 = defpackage.vy7.L(r5, r6, r9)
            r6 = 1085276160(0x40b00000, float:5.5)
            r7 = 1073741824(0x40000000, float:2.0)
            a74 r5 = defpackage.ge7.P(r5, r6, r7)
            e34 r6 = defpackage.h70.d(r11, r4)
            long r3 = r8.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r8.l()
            a74 r5 = defpackage.l.E(r8, r5)
            r8.f0()
            boolean r11 = r8.S
            if (r11 == 0) goto L7db
            r8.k(r1)
            goto L7de
        L7db:
            r8.o0()
        L7de:
            defpackage.yh2.K(r8, r10, r6)
            defpackage.yh2.K(r8, r2, r4)
            defpackage.i61.w(r3, r8, r15, r8, r12)
            defpackage.yh2.K(r8, r0, r5)
            r0 = r60
            boolean r1 = r0.h
            if (r1 == 0) goto L7f4
            java.lang.String r1 = "DSi"
        L7f2:
            r15 = r1
            goto L7f7
        L7f4:
            java.lang.String r1 = "DS"
            goto L7f2
        L7f7:
            long r1 = r13.h
            sr2 r22 = defpackage.qs7.c
            r3 = 4620974692658839552(0x4021000000000000, double:8.5)
            long r19 = defpackage.hi2.D(r3)
            r3 = 4621537642612260864(0x4023000000000000, double:9.5)
            long r26 = defpackage.hi2.D(r3)
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            long r23 = defpackage.hi2.D(r3)
            r36 = 6
            r37 = 129810(0x1fb12, float:1.81903E-40)
            r16 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 14355456(0xdb0c00, float:2.0116278E-38)
            r21 = r70
            r17 = r1
            r34 = r8
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r3 = 1
            r8.p(r3)
            r8.p(r3)
            java.lang.String r15 = defpackage.hf.P(r39)
            int r1 = r15.length()
            r2 = 10
            if (r1 <= 0) goto L88c
            r1 = 1573251828(0x5dc5eaf4, float:1.782685E18)
            r8.b0(r1)
            long r3 = r13.i
            long r19 = defpackage.hi2.E(r2)
            r1 = 12
            long r5 = defpackage.hi2.E(r1)
            r30 = 0
            r31 = 13
            r27 = 0
            r29 = 0
            r26 = r14
            r28 = 1082130432(0x40800000, float:4.0)
            a74 r16 = defpackage.ge7.S(r26, r27, r28, r29, r30, r31)
            r36 = 6
            r37 = 129968(0x1fbb0, float:1.82124E-40)
            r21 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 1575984(0x180c30, float:2.208424E-39)
            r17 = r3
            r26 = r5
            r34 = r8
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = 0
            r8.p(r4)
        L88a:
            r3 = 1
            goto L897
        L88c:
            r4 = 0
            r1 = 1573541523(0x5dca5693, float:1.8225003E18)
            r8.b0(r1)
            r8.p(r4)
            goto L88a
        L897:
            r8.p(r3)
            if (r64 == 0) goto L8d9
            r1 = 2024801160(0x78b00388, float:2.855987E34)
            r8.b0(r1)
            r1 = 1107820544(0x42080000, float:34.0)
            a74 r16 = defpackage.dj6.i(r14, r1)
            r20 = 0
            r21 = 14
            r18 = 0
            r19 = 0
            r17 = r7
            a74 r4 = defpackage.ge7.S(r16, r17, r18, r19, r20, r21)
            d4 r1 = new d4
            r1.<init>(r13, r2)
            r2 = 178170693(0xa9eab45, float:1.5279271E-32)
            zv0 r6 = defpackage.n16.I(r2, r1, r8)
            int r1 = r38 >> 24
            r1 = r1 & 14
            r1 = r1 | 24624(0x6030, float:3.4506E-41)
            r9 = 12
            r5 = 0
            r3 = r68
            r7 = r8
            r8 = r1
            defpackage.ej2.b(r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            r4 = 0
            r8.p(r4)
        L8d7:
            r3 = 1
            goto L8e4
        L8d9:
            r4 = 0
            r1 = 2025229766(0x78b68dc6, float:2.9621048E34)
            r8.b0(r1)
            r8.p(r4)
            goto L8d7
        L8e4:
            r8.p(r3)
            goto L8eb
        L8e8:
            r8.V()
        L8eb:
            cf5 r12 = r8.t()
            if (r12 == 0) goto L90e
            zy5 r0 = new zy5
            r1 = r60
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r6 = r65
            r7 = r66
            r8 = r67
            r9 = r68
            r10 = r69
            r11 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.d = r0
        L90e:
            return
    }

    public static final long h(float r17, float r18, float r19, float r20, defpackage.nt0 r21) {
            r0 = r20
            boolean r1 = r21.c()
            r2 = 32
            r3 = 16
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L2d
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            float r0 = r0 + r4
            int r0 = (int) r0
            int r0 = r0 << 24
            float r5 = r17 * r1
            float r5 = r5 + r4
            int r5 = (int) r5
            int r3 = r5 << 16
            r0 = r0 | r3
            float r3 = r18 * r1
            float r3 = r3 + r4
            int r3 = (int) r3
            int r3 = r3 << 8
            r0 = r0 | r3
            float r1 = r1 * r19
            float r1 = r1 + r4
            int r1 = (int) r1
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 << r2
            int r2 = defpackage.kt0.i
            return r0
        L2d:
            int r1 = java.lang.Float.floatToRawIntBits(r17)
            int r5 = r1 >>> 31
            int r6 = r1 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            r8 = 8388607(0x7fffff, float:1.1754942E-38)
            r9 = r1 & r8
            r10 = 8388608(0x800000, float:1.1754944E-38)
            r11 = -10
            r12 = 49
            r13 = 512(0x200, float:7.17E-43)
            r14 = 0
            r15 = 31
            if (r6 != r7) goto L51
            if (r9 == 0) goto L4e
            r1 = r13
            goto L4f
        L4e:
            r1 = r14
        L4f:
            r6 = r15
            goto L7f
        L51:
            int r6 = r6 + (-112)
            if (r6 < r15) goto L58
            r6 = r12
            r1 = r14
            goto L7f
        L58:
            if (r6 > 0) goto L6e
            if (r6 < r11) goto L6b
            r1 = r9 | r10
            int r6 = 1 - r6
            int r1 = r1 >> r6
            r6 = r1 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L67
            int r1 = r1 + 8192
        L67:
            int r1 = r1 >> 13
            r6 = r14
            goto L7f
        L6b:
            r1 = r14
            r6 = r1
            goto L7f
        L6e:
            int r9 = r9 >> 13
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L7e
            int r1 = r6 << 10
            r1 = r1 | r9
            int r1 = r1 + 1
            int r5 = r5 << 15
            r1 = r1 | r5
        L7c:
            short r1 = (short) r1
            goto L86
        L7e:
            r1 = r9
        L7f:
            int r5 = r5 << 15
            int r6 = r6 << 10
            r5 = r5 | r6
            r1 = r1 | r5
            goto L7c
        L86:
            int r5 = java.lang.Float.floatToRawIntBits(r18)
            int r6 = r5 >>> 31
            int r9 = r5 >>> 23
            r9 = r9 & r7
            r16 = r5 & r8
            if (r9 != r7) goto L9a
            if (r16 == 0) goto L97
            r5 = r13
            goto L98
        L97:
            r5 = r14
        L98:
            r9 = r15
            goto Lca
        L9a:
            int r9 = r9 + (-112)
            if (r9 < r15) goto La1
            r9 = r12
            r5 = r14
            goto Lca
        La1:
            if (r9 > 0) goto Lb7
            if (r9 < r11) goto Lb4
            r5 = r16 | r10
            int r9 = 1 - r9
            int r5 = r5 >> r9
            r9 = r5 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto Lb0
            int r5 = r5 + 8192
        Lb0:
            int r5 = r5 >> 13
            r9 = r14
            goto Lca
        Lb4:
            r5 = r14
            r9 = r5
            goto Lca
        Lb7:
            int r16 = r16 >> 13
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto Lc8
            int r5 = r9 << 10
            r5 = r5 | r16
            int r5 = r5 + 1
            int r6 = r6 << 15
            r5 = r5 | r6
        Lc6:
            short r5 = (short) r5
            goto Ld1
        Lc8:
            r5 = r16
        Lca:
            int r6 = r6 << 15
            int r9 = r9 << 10
            r6 = r6 | r9
            r5 = r5 | r6
            goto Lc6
        Ld1:
            int r6 = java.lang.Float.floatToRawIntBits(r19)
            int r9 = r6 >>> 31
            r16 = r2
            int r2 = r6 >>> 23
            r2 = r2 & r7
            r8 = r8 & r6
            if (r2 != r7) goto Le6
            if (r8 == 0) goto Le2
            goto Le3
        Le2:
            r13 = r14
        Le3:
            r14 = r13
            r12 = r15
            goto L113
        Le6:
            int r2 = r2 + (-112)
            if (r2 < r15) goto Leb
            goto L113
        Leb:
            if (r2 > 0) goto L102
            if (r2 < r11) goto L100
            r6 = r8 | r10
            int r2 = 1 - r2
            int r2 = r6 >> r2
            r6 = r2 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto Lfb
            int r2 = r2 + 8192
        Lfb:
            int r2 = r2 >> 13
            r12 = r14
            r14 = r2
            goto L113
        L100:
            r12 = r14
            goto L113
        L102:
            int r14 = r8 >> 13
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L112
            int r2 = r2 << 10
            r2 = r2 | r14
            int r2 = r2 + 1
            int r6 = r9 << 15
            r2 = r2 | r6
        L110:
            short r2 = (short) r2
            goto L11a
        L112:
            r12 = r2
        L113:
            int r2 = r9 << 15
            int r6 = r12 << 10
            r2 = r2 | r6
            r2 = r2 | r14
            goto L110
        L11a:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r6)
            r6 = 0
            float r0 = java.lang.Math.max(r6, r0)
            r6 = 1149222912(0x447fc000, float:1023.0)
            float r0 = r0 * r6
            float r0 = r0 + r4
            int r0 = (int) r0
            r4 = r21
            int r4 = r4.c
            long r6 = (long) r1
            r8 = 65535(0xffff, double:3.23786E-319)
            long r6 = r6 & r8
            r1 = 48
            long r6 = r6 << r1
            long r10 = (long) r5
            long r10 = r10 & r8
            long r10 = r10 << r16
            long r5 = r6 | r10
            long r1 = (long) r2
            long r1 = r1 & r8
            long r1 = r1 << r3
            long r1 = r1 | r5
            long r5 = (long) r0
            r7 = 1023(0x3ff, double:5.054E-321)
            long r5 = r5 & r7
            r0 = 6
            long r5 = r5 << r0
            long r0 = r1 | r5
            long r2 = (long) r4
            r4 = 63
            long r2 = r2 & r4
            long r0 = r0 | r2
            int r2 = defpackage.kt0.i
            return r0
    }

    public static defpackage.kg1 i(defpackage.w61 r1, defpackage.l61 r2, defpackage.a71 r3, defpackage.eo2 r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            vt1 r2 = defpackage.vt1.A
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            a71 r3 = defpackage.a71.DEFAULT
        Lc:
            l61 r1 = defpackage.mb3.M(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L1c
            jo3 r2 = new jo3
            r2.<init>(r1, r4)
            goto L22
        L1c:
            kg1 r2 = new kg1
            r5 = 1
            r2.<init>(r1, r5)
        L22:
            r3.invoke(r4, r2, r2)
            return r2
    }

    public static final defpackage.a74 j(defpackage.a74 r1, defpackage.s70 r2) {
            q70 r0 = new q70
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static void k(android.database.Cursor r0) {
            if (r0 == 0) goto L8
            defpackage.lb1.v(r0)     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static final long l(long r9, long r11) {
            nt0 r0 = defpackage.kt0.g(r11)
            long r9 = defpackage.kt0.b(r9, r0)
            float r0 = defpackage.kt0.e(r11)
            float r1 = defpackage.kt0.e(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r1
            float r3 = r0 * r2
            float r3 = r3 + r1
            float r4 = defpackage.kt0.i(r9)
            float r5 = defpackage.kt0.i(r11)
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 != 0) goto L25
            r5 = r6
            goto L2a
        L25:
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r5 = r5 * r2
            float r5 = r5 + r4
            float r5 = r5 / r3
        L2a:
            float r4 = defpackage.kt0.h(r9)
            float r8 = defpackage.kt0.h(r11)
            if (r7 != 0) goto L36
            r8 = r6
            goto L3b
        L36:
            float r4 = r4 * r1
            float r8 = r8 * r0
            float r8 = r8 * r2
            float r8 = r8 + r4
            float r8 = r8 / r3
        L3b:
            float r9 = defpackage.kt0.f(r9)
            float r10 = defpackage.kt0.f(r11)
            if (r7 != 0) goto L46
            goto L4c
        L46:
            float r9 = r9 * r1
            float r10 = r10 * r0
            float r10 = r10 * r2
            float r10 = r10 + r9
            float r6 = r10 / r3
        L4c:
            nt0 r9 = defpackage.kt0.g(r11)
            long r9 = h(r5, r8, r6, r3, r9)
            return r9
    }

    public static int m(byte[] r2, int r3, defpackage.ou r4) {
            int r3 = w(r2, r3, r4)
            int r0 = r4.a
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            ca0 r2 = defpackage.ea0.B
            r4.c = r2
            return r3
        L13:
            ca0 r2 = defpackage.ea0.c(r2, r3, r0)
            r4.c = r2
            int r3 = r3 + r0
            return r3
        L1b:
            ub3 r2 = defpackage.ub3.e()
            throw r2
        L20:
            ub3 r2 = defpackage.ub3.c()
            throw r2
    }

    public static int n(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static long o(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    public static int p(defpackage.j66 r7, byte[] r8, int r9, int r10, int r11, defpackage.ou r12) {
            r0 = r7
            i54 r0 = (defpackage.i54) r0
            java.lang.Object r1 = r0.j()
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r7 = r0.F(r1, r2, r3, r4, r5, r6)
            r0.a(r1)
            r6.c = r1
            return r7
    }

    public static int q(defpackage.j66 r6, byte[] r7, int r8, int r9, defpackage.ou r10) {
            int r0 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto Lc
            int r0 = v(r8, r7, r0, r10)
            int r8 = r10.a
        Lc:
            r3 = r0
            if (r8 < 0) goto L24
            int r9 = r9 - r3
            if (r8 > r9) goto L24
            java.lang.Object r1 = r6.j()
            int r4 = r3 + r8
            r0 = r6
            r2 = r7
            r5 = r10
            r0.h(r1, r2, r3, r4, r5)
            r0.a(r1)
            r5.c = r1
            return r4
        L24:
            ub3 r6 = defpackage.ub3.e()
            throw r6
    }

    public static int r(defpackage.j66 r2, int r3, byte[] r4, int r5, int r6, defpackage.z93 r7, defpackage.ou r8) {
            int r5 = q(r2, r4, r5, r6, r8)
            java.lang.Object r0 = r8.c
            r7.add(r0)
        L9:
            if (r5 >= r6) goto L1e
            int r0 = w(r4, r5, r8)
            int r1 = r8.a
            if (r3 == r1) goto L14
            goto L1e
        L14:
            int r5 = q(r2, r4, r0, r6, r8)
            java.lang.Object r0 = r8.c
            r7.add(r0)
            goto L9
        L1e:
            return r5
    }

    public static int s(byte[] r3, int r4, defpackage.ou r5) {
            int r4 = w(r3, r4, r5)
            int r0 = r5.a
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.c = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = defpackage.aa3.a
            r1.<init>(r3, r4, r0, r2)
            r5.c = r1
            int r4 = r4 + r0
            return r4
        L1a:
            ub3 r3 = defpackage.ub3.c()
            throw r3
    }

    public static int t(byte[] r2, int r3, defpackage.ou r4) {
            int r3 = w(r2, r3, r4)
            int r0 = r4.a
            if (r0 < 0) goto L19
            if (r0 != 0) goto Lf
            java.lang.String r2 = ""
            r4.c = r2
            return r3
        Lf:
            nj2 r1 = defpackage.xj7.a
            java.lang.String r2 = r1.m(r2, r3, r0)
            r4.c = r2
            int r3 = r3 + r0
            return r3
        L19:
            ub3 r2 = defpackage.ub3.c()
            throw r2
    }

    public static int u(int r8, byte[] r9, int r10, int r11, defpackage.mg7 r12, defpackage.ou r13) {
            int r0 = r8 >>> 3
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto L9f
            r0 = r8 & 7
            if (r0 == 0) goto L8f
            r2 = 1
            if (r0 == r2) goto L80
            r2 = 2
            if (r0 == r2) goto L57
            r2 = 3
            if (r0 == r2) goto L2a
            r11 = 5
            if (r0 != r11) goto L24
            int r9 = n(r9, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.c(r8, r9)
            int r10 = r10 + 4
            return r10
        L24:
            ub3 r8 = new ub3
            r8.<init>(r1)
            throw r8
        L2a:
            mg7 r6 = defpackage.mg7.b()
            r0 = r8 & (-8)
            r0 = r0 | 4
            r1 = 0
        L33:
            if (r10 >= r11) goto L3f
            int r4 = w(r9, r10, r13)
            int r2 = r13.a
            if (r2 != r0) goto L41
            r1 = r2
            r10 = r4
        L3f:
            r5 = r11
            goto L4a
        L41:
            r3 = r9
            r5 = r11
            r7 = r13
            int r10 = u(r2, r3, r4, r5, r6, r7)
            r1 = r2
            goto L33
        L4a:
            if (r10 > r5) goto L52
            if (r1 != r0) goto L52
            r12.c(r8, r6)
            return r10
        L52:
            ub3 r8 = defpackage.ub3.d()
            throw r8
        L57:
            r3 = r9
            r7 = r13
            int r9 = w(r3, r10, r7)
            int r10 = r7.a
            if (r10 < 0) goto L7b
            int r11 = r3.length
            int r11 = r11 - r9
            if (r10 > r11) goto L76
            if (r10 != 0) goto L6d
            ca0 r11 = defpackage.ea0.B
            r12.c(r8, r11)
            goto L74
        L6d:
            ca0 r11 = defpackage.ea0.c(r3, r9, r10)
            r12.c(r8, r11)
        L74:
            int r9 = r9 + r10
            return r9
        L76:
            ub3 r8 = defpackage.ub3.e()
            throw r8
        L7b:
            ub3 r8 = defpackage.ub3.c()
            throw r8
        L80:
            r3 = r9
            long r0 = o(r3, r10)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r12.c(r8, r9)
            int r10 = r10 + 8
            return r10
        L8f:
            r3 = r9
            r7 = r13
            int r9 = y(r3, r10, r7)
            long r10 = r7.b
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12.c(r8, r10)
            return r9
        L9f:
            ub3 r8 = new ub3
            r8.<init>(r1)
            throw r8
    }

    public static int v(int r2, byte[] r3, int r4, defpackage.ou r5) {
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r0 = r4 + 1
            r1 = r3[r4]
            if (r1 < 0) goto Le
            int r3 = r1 << 7
            r2 = r2 | r3
            r5.a = r2
            return r0
        Le:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << 7
            r2 = r2 | r1
            int r1 = r4 + 2
            r0 = r3[r0]
            if (r0 < 0) goto L1f
            int r3 = r0 << 14
            r2 = r2 | r3
            r5.a = r2
            return r1
        L1f:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 14
            r2 = r2 | r0
            int r0 = r4 + 3
            r1 = r3[r1]
            if (r1 < 0) goto L30
            int r3 = r1 << 21
            r2 = r2 | r3
            r5.a = r2
            return r0
        L30:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << 21
            r2 = r2 | r1
            int r4 = r4 + 4
            r0 = r3[r0]
            if (r0 < 0) goto L41
            int r3 = r0 << 28
            r2 = r2 | r3
            r5.a = r2
            return r4
        L41:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r2 = r2 | r0
        L46:
            int r0 = r4 + 1
            r4 = r3[r4]
            if (r4 >= 0) goto L4e
            r4 = r0
            goto L46
        L4e:
            r5.a = r2
            return r0
    }

    public static int w(byte[] r1, int r2, defpackage.ou r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.a = r2
            return r0
        L9:
            int r1 = v(r2, r1, r0, r3)
            return r1
    }

    public static int x(int r2, byte[] r3, int r4, int r5, defpackage.z93 r6, defpackage.ou r7) {
            a93 r6 = (defpackage.a93) r6
            int r4 = w(r3, r4, r7)
            int r0 = r7.a
            r6.b(r0)
        Lb:
            if (r4 >= r5) goto L20
            int r0 = w(r3, r4, r7)
            int r1 = r7.a
            if (r2 == r1) goto L16
            goto L20
        L16:
            int r4 = w(r3, r0, r7)
            int r0 = r7.a
            r6.b(r0)
            goto Lb
        L20:
            return r4
    }

    public static int y(byte[] r9, int r10, defpackage.ou r11) {
            int r0 = r10 + 1
            r1 = r9[r10]
            long r1 = (long) r1
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto Le
            r11.b = r1
            return r0
        Le:
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            int r10 = r10 + 2
            r0 = r9[r0]
            r3 = r0 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r1 = r1 | r3
            r3 = r5
        L1c:
            if (r0 >= 0) goto L2c
            int r0 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r1 = r1 | r6
            r8 = r0
            r0 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.b = r1
            return r10
    }

    public static final void z(defpackage.e36 r4) {
            r4.getClass()
            kw3 r0 = defpackage.hf.I()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            j36 r1 = r4.i0(r1)
        Ld:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.String r2 = r1.R(r3)     // Catch: java.lang.Throwable -> L1c
            r0.add(r2)     // Catch: java.lang.Throwable -> L1c
            goto Ld
        L1c:
            r4 = move-exception
            goto L4c
        L1e:
            r2 = 0
            defpackage.lb4.p(r1, r2)
            kw3 r0 = defpackage.hf.A(r0)
            java.util.ListIterator r0 = r0.listIterator(r3)
        L2a:
            r1 = r0
            xx2 r1 = (defpackage.xx2) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L2a
            java.lang.String r2 = "DROP TRIGGER IF EXISTS "
            java.lang.String r1 = r2.concat(r1)
            defpackage.ii2.s(r4, r1)
            goto L2a
        L4b:
            return
        L4c:
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            defpackage.lb4.p(r1, r4)
            throw r0
    }

    public abstract void O(java.lang.Throwable r1);

    public abstract void P(defpackage.eb r1);
}
