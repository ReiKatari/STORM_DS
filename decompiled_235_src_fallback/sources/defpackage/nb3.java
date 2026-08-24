package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb3  reason: default package */
/* loaded from: classes.dex */
public abstract class nb3 {
    public static final defpackage.wo a = null;
    public static final defpackage.xo b = null;
    public static final defpackage.yo c = null;
    public static final defpackage.zo d = null;
    public static final defpackage.wo e = null;
    public static final defpackage.xo f = null;
    public static final defpackage.yo g = null;
    public static final defpackage.zo h = null;
    public static final java.lang.Object[] i = null;
    public static final defpackage.zv0 j = null;
    public static final java.lang.Object k = null;
    public static final defpackage.p33 l = null;
    public static final int[] m = null;
    public static final int[] n = null;
    public static final int[] o = null;
    public static final int[] p = null;
    public static final int[] q = null;
    public static final byte[] r = null;
    public static final byte[] s = null;
    public static final defpackage.sj t = null;
    public static defpackage.e33 u;
    public static defpackage.e33 v;
    public static final /* synthetic */ int w = 0;

    static {
            wo r0 = new wo
            r1 = 2139095040(0x7f800000, float:Infinity)
            r0.<init>(r1)
            defpackage.nb3.a = r0
            xo r0 = new xo
            r0.<init>(r1, r1)
            defpackage.nb3.b = r0
            yo r0 = new yo
            r0.<init>(r1, r1, r1)
            defpackage.nb3.c = r0
            zo r0 = new zo
            r0.<init>(r1, r1, r1, r1)
            defpackage.nb3.d = r0
            wo r0 = new wo
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            r0.<init>(r1)
            defpackage.nb3.e = r0
            xo r0 = new xo
            r0.<init>(r1, r1)
            defpackage.nb3.f = r0
            yo r0 = new yo
            r0.<init>(r1, r1, r1)
            defpackage.nb3.g = r0
            zo r0 = new zo
            r0.<init>(r1, r1, r1, r1)
            defpackage.nb3.h = r0
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            defpackage.nb3.i = r1
            fn0 r1 = new fn0
            r2 = 23
            r1.<init>(r2)
            zv0 r2 = new zv0
            r3 = -544900339(0xffffffffdf857b0d, float:-1.9236591E19)
            r2.<init>(r3, r0, r1)
            defpackage.nb3.j = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            defpackage.nb3.k = r1
            p33 r1 = new p33
            r1.<init>(r0)
            defpackage.nb3.l = r1
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x00a4: FILL_ARRAY_DATA  , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000} // fill-array
            defpackage.nb3.m = r1
            int[] r0 = new int[r0]
            r0 = {x00bc: FILL_ARRAY_DATA  , data: [1, 2, 4, 5, 7, 8, 10, 11, 13, 14} // fill-array
            defpackage.nb3.n = r0
            r0 = 3
            r1 = 6
            int[] r0 = new int[]{r0, r1}
            defpackage.nb3.o = r0
            int[] r0 = new int[r1]
            r0 = {x00d4: FILL_ARRAY_DATA  , data: [1, 2, 4, 5, 7, 8} // fill-array
            defpackage.nb3.p = r0
            r0 = 15
            r1 = 13
            r2 = 14
            int[] r0 = new int[]{r1, r0, r2}
            defpackage.nb3.q = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x00e4: FILL_ARRAY_DATA  , data: [112, 114, 111, 0} // fill-array
            defpackage.nb3.r = r1
            byte[] r0 = new byte[r0]
            r0 = {x00ea: FILL_ARRAY_DATA  , data: [112, 114, 109, 0} // fill-array
            defpackage.nb3.s = r0
            sj r0 = new sj
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1)
            defpackage.nb3.t = r0
            return
    }

    public static final void A(defpackage.l61 r4, java.lang.Throwable r5) {
            java.util.List r0 = defpackage.p61.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            o61 r1 = (defpackage.o61) r1
            r1.u(r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            if (r5 != r1) goto L1b
            r2 = r5
            goto L25
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Exception while trying to handle coroutine exception"
            r2.<init>(r3, r1)
            defpackage.mb3.q(r2, r5)
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r1.getUncaughtExceptionHandler()
            r3.uncaughtException(r1, r2)
            goto L6
        L31:
            vi1 r0 = new vi1     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L39
            defpackage.mb3.q(r5, r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            r0.uncaughtException(r4, r5)
            return
    }

    public static final boolean B(android.graphics.Bitmap.Config r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Le
            android.graphics.Bitmap$Config r0 = defpackage.k2.A()
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public static boolean C() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Huawei"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "HWANE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean D() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Nokia"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2b
        L18:
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "B2N"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L2d
            java.lang.String r1 = "B2N_sprout"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            return r0
        L2d:
            r0 = 1
            return r0
    }

    public static boolean E() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "OnePlus"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "OnePlus6"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean F() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "OnePlus"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "OnePlus6T"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean G() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Redmi"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "joyeuse"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean H() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
        L19:
            java.lang.String r0 = "a05s"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.lang.String r1 = "SM-A057"
            boolean r0 = defpackage.qs6.j0(r0, r1, r2)
            if (r0 == 0) goto L3b
            r0 = 1
            return r0
        L3b:
            return r2
    }

    public static boolean I() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2a
        L18:
            java.lang.String r0 = "J7XELTE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L2a
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }

    public static boolean J() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2a
        L18:
            java.lang.String r0 = "ON7XELTE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L2a
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }

    public static boolean K() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L33
        L18:
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "q4q"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "SCG16"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "SC-55C"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            r0 = 1
            return r0
    }

    public static final defpackage.yc1 L(java.lang.CharSequence r2, java.lang.String r3, int r4, defpackage.qn2 r5) {
            char r0 = r2.charAt(r4)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            java.lang.Object r5 = r5.g(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected "
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r3 = ", but got '"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "' at position "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            yc1 r2 = M(r2, r3)
            return r2
    }

    public static final defpackage.yc1 M(java.lang.CharSequence r2, java.lang.String r3) {
            yc1 r0 = new yc1
            java.lang.String r1 = " when parsing an Instant from \""
            java.lang.StringBuilder r3 = defpackage.i61.r(r3, r1)
            r1 = 64
            java.lang.String r1 = e0(r1, r2)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            return r0
    }

    public static final int N(int r1, java.lang.CharSequence r2) {
            char r0 = r2.charAt(r1)
            int r0 = r0 + (-48)
            int r0 = r0 * 10
            int r1 = r1 + 1
            char r1 = r2.charAt(r1)
            int r1 = r1 + (-48)
            int r1 = r1 + r0
            return r1
    }

    public static int[] O(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = defpackage.nw7.m0(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static defpackage.ti1[] P(java.io.FileInputStream r7, byte[] r8, byte[] r9, defpackage.ti1[] r10) {
            byte[] r0 = defpackage.f04.C
            boolean r1 = java.util.Arrays.equals(r8, r0)
            r2 = 0
            java.lang.String r3 = "Unsupported meta version"
            java.lang.String r4 = "Content found after the end of file"
            r5 = 4
            if (r1 == 0) goto L5b
            byte[] r1 = defpackage.f04.x
            boolean r9 = java.util.Arrays.equals(r1, r9)
            if (r9 != 0) goto L55
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L51
            r8 = 1
            long r8 = defpackage.nw7.m0(r7, r8)
            int r8 = (int) r8
            long r0 = defpackage.nw7.m0(r7, r5)
            long r5 = defpackage.nw7.m0(r7, r5)
            int r9 = (int) r5
            int r0 = (int) r0
            byte[] r9 = defpackage.nw7.l0(r7, r9, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L4d
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r9)
            ti1[] r8 = Q(r7, r8, r10)     // Catch: java.lang.Throwable -> L43
            r7.close()
            return r8
        L43:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r7 = move-exception
            r8.addSuppressed(r7)
        L4c:
            throw r8
        L4d:
            defpackage.i.m(r4)
            return r2
        L51:
            defpackage.i.m(r3)
            return r2
        L55:
            java.lang.String r7 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            defpackage.i.m(r7)
            return r2
        L5b:
            byte[] r0 = defpackage.f04.D
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L98
            r8 = 2
            long r0 = defpackage.nw7.m0(r7, r8)
            int r8 = (int) r0
            long r0 = defpackage.nw7.m0(r7, r5)
            long r5 = defpackage.nw7.m0(r7, r5)
            int r3 = (int) r5
            int r0 = (int) r0
            byte[] r0 = defpackage.nw7.l0(r7, r3, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L94
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r0)
            ti1[] r8 = R(r7, r9, r8, r10)     // Catch: java.lang.Throwable -> L8a
            r7.close()
            return r8
        L8a:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r7 = move-exception
            r8.addSuppressed(r7)
        L93:
            throw r8
        L94:
            defpackage.i.m(r4)
            return r2
        L98:
            defpackage.i.m(r3)
            return r2
    }

    public static defpackage.ti1[] Q(java.io.ByteArrayInputStream r9, int r10, defpackage.ti1[] r11) {
            int r0 = r9.available()
            r1 = 0
            if (r0 != 0) goto La
            ti1[] r9 = new defpackage.ti1[r1]
            return r9
        La:
            int r0 = r11.length
            r2 = 0
            if (r10 != r0) goto L54
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r3 = new int[r10]
            r4 = r1
        L13:
            if (r4 >= r10) goto L32
            r5 = 2
            long r6 = defpackage.nw7.m0(r9, r5)
            int r6 = (int) r6
            long r7 = defpackage.nw7.m0(r9, r5)
            int r5 = (int) r7
            r3[r4] = r5
            java.lang.String r5 = new java.lang.String
            byte[] r6 = defpackage.nw7.k0(r9, r6)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r6, r7)
            r0[r4] = r5
            int r4 = r4 + 1
            goto L13
        L32:
            if (r1 >= r10) goto L53
            r4 = r11[r1]
            java.lang.String r5 = r4.b
            r6 = r0[r1]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4d
            r5 = r3[r1]
            r4.e = r5
            int[] r5 = O(r9, r5)
            r4.h = r5
            int r1 = r1 + 1
            goto L32
        L4d:
            java.lang.String r9 = "Order of dexfiles in metadata did not match baseline"
            defpackage.i.m(r9)
            return r2
        L53:
            return r11
        L54:
            java.lang.String r9 = "Mismatched number of dex files found in metadata"
            defpackage.i.m(r9)
            return r2
    }

    public static defpackage.ti1[] R(java.io.ByteArrayInputStream r10, byte[] r11, int r12, defpackage.ti1[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            ti1[] r10 = new defpackage.ti1[r1]
            return r10
        La:
            int r0 = r13.length
            r2 = 0
            if (r12 != r0) goto L82
            r0 = r1
        Lf:
            if (r0 >= r12) goto L81
            r3 = 2
            defpackage.nw7.m0(r10, r3)
            long r4 = defpackage.nw7.m0(r10, r3)
            int r4 = (int) r4
            java.lang.String r5 = new java.lang.String
            byte[] r4 = defpackage.nw7.k0(r10, r4)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r4, r6)
            r4 = 4
            long r6 = defpackage.nw7.m0(r10, r4)
            long r3 = defpackage.nw7.m0(r10, r3)
            int r3 = (int) r3
            int r4 = r13.length
            if (r4 > 0) goto L34
        L32:
            r4 = r2
            goto L60
        L34:
            java.lang.String r4 = "!"
            int r4 = r5.indexOf(r4)
            if (r4 >= 0) goto L42
            java.lang.String r4 = ":"
            int r4 = r5.indexOf(r4)
        L42:
            if (r4 <= 0) goto L4b
            int r4 = r4 + 1
            java.lang.String r4 = r5.substring(r4)
            goto L4c
        L4b:
            r4 = r5
        L4c:
            r8 = r1
        L4d:
            int r9 = r13.length
            if (r8 >= r9) goto L32
            r9 = r13[r8]
            java.lang.String r9 = r9.b
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L5d
            r4 = r13[r8]
            goto L60
        L5d:
            int r8 = r8 + 1
            goto L4d
        L60:
            if (r4 == 0) goto L77
            r4.d = r6
            int[] r5 = O(r10, r3)
            byte[] r6 = defpackage.f04.B
            boolean r6 = java.util.Arrays.equals(r11, r6)
            if (r6 == 0) goto L74
            r4.e = r3
            r4.h = r5
        L74:
            int r0 = r0 + 1
            goto Lf
        L77:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r5)
            defpackage.i.m(r10)
            return r2
        L81:
            return r13
        L82:
            java.lang.String r10 = "Mismatched number of dex files found in metadata"
            defpackage.i.m(r10)
            return r2
    }

    public static defpackage.ti1[] S(java.io.FileInputStream r6, byte[] r7, java.lang.String r8) {
            byte[] r0 = defpackage.f04.y
            boolean r7 = java.util.Arrays.equals(r7, r0)
            r0 = 0
            if (r7 == 0) goto L41
            r7 = 1
            long r1 = defpackage.nw7.m0(r6, r7)
            int r7 = (int) r1
            r1 = 4
            long r2 = defpackage.nw7.m0(r6, r1)
            long r4 = defpackage.nw7.m0(r6, r1)
            int r1 = (int) r4
            int r2 = (int) r2
            byte[] r1 = defpackage.nw7.l0(r6, r1, r2)
            int r6 = r6.read()
            if (r6 > 0) goto L3b
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r1)
            ti1[] r7 = T(r6, r8, r7)     // Catch: java.lang.Throwable -> L31
            r6.close()
            return r7
        L31:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r6 = move-exception
            r7.addSuppressed(r6)
        L3a:
            throw r7
        L3b:
            java.lang.String r6 = "Content found after the end of file"
            defpackage.i.m(r6)
            return r0
        L41:
            java.lang.String r6 = "Unsupported version"
            defpackage.i.m(r6)
            return r0
    }

    public static defpackage.ti1[] T(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            ti1[] r0 = new defpackage.ti1[r3]
            return r0
        Le:
            ti1[] r2 = new defpackage.ti1[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = defpackage.nw7.m0(r0, r5)
            int r6 = (int) r6
            long r7 = defpackage.nw7.m0(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = defpackage.nw7.m0(r0, r5)
            long r12 = defpackage.nw7.m0(r0, r5)
            long r9 = defpackage.nw7.m0(r0, r5)
            ti1 r5 = new ti1
            java.lang.String r11 = new java.lang.String
            byte[] r6 = defpackage.nw7.k0(r0, r6)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r11.<init>(r6, r15)
            int r15 = (int) r7
            int r6 = (int) r9
            int[] r7 = new int[r14]
            java.util.TreeMap r18 = new java.util.TreeMap
            r18.<init>()
            r10 = r20
            r9 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            r2[r4] = r9
            int r4 = r4 + 1
            goto L11
        L50:
            r4 = r3
        L51:
            if (r4 >= r1) goto L11b
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f
            int r9 = r6.g
            java.util.TreeMap r10 = r6.i
            int r7 = r7 - r8
            r8 = r3
        L61:
            int r11 = r0.available()
            r12 = 7
            if (r11 <= r7) goto Lb4
            long r13 = defpackage.nw7.m0(r0, r5)
            int r11 = (int) r13
            int r8 = r8 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r14)
            long r14 = defpackage.nw7.m0(r0, r5)
            int r11 = (int) r14
        L7f:
            if (r11 <= 0) goto L61
            defpackage.nw7.m0(r0, r5)
            long r14 = defpackage.nw7.m0(r0, r13)
            int r14 = (int) r14
            r15 = 6
            if (r14 != r15) goto L90
        L8c:
            r15 = r3
            r16 = r4
            goto Lae
        L90:
            if (r14 != r12) goto L93
            goto L8c
        L93:
            if (r14 <= 0) goto L8c
            defpackage.nw7.m0(r0, r13)
            r15 = r3
            r16 = r4
            long r3 = defpackage.nw7.m0(r0, r13)
            int r3 = (int) r3
        La0:
            if (r3 <= 0) goto La8
            defpackage.nw7.m0(r0, r5)
            int r3 = r3 + (-1)
            goto La0
        La8:
            int r14 = r14 + (-1)
            r3 = r15
            r4 = r16
            goto L93
        Lae:
            int r11 = r11 + (-1)
            r3 = r15
            r4 = r16
            goto L7f
        Lb4:
            r15 = r3
            r16 = r4
            int r3 = r0.available()
            if (r3 != r7) goto L114
            int r3 = r6.e
            int[] r3 = O(r0, r3)
            r6.h = r3
            int r3 = r9 * 2
            int r3 = r3 + r12
            r3 = r3 & (-8)
            int r3 = r3 / 8
            byte[] r3 = defpackage.nw7.k0(r0, r3)
            java.util.BitSet r3 = java.util.BitSet.valueOf(r3)
            r4 = r15
        Ld5:
            if (r4 >= r9) goto L10f
            boolean r6 = r3.get(r4)
            if (r6 == 0) goto Ldf
            r6 = r5
            goto Le0
        Ldf:
            r6 = r15
        Le0:
            int r7 = r4 + r9
            boolean r7 = r3.get(r7)
            if (r7 == 0) goto Lea
            r6 = r6 | 4
        Lea:
            if (r6 == 0) goto L10c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto Lfc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        Lfc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r7 = r7.intValue()
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.put(r8, r6)
        L10c:
            int r4 = r4 + 1
            goto Ld5
        L10f:
            int r4 = r16 + 1
            r3 = r15
            goto L51
        L114:
            java.lang.String r0 = "Read too much data during profile line parse"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L11b:
            return r2
    }

    public static final defpackage.s76 U(defpackage.px0 r4) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = r4
            xq2 r2 = (defpackage.xq2) r2
            boolean r2 = r2.d(r0)
            xq2 r4 = (defpackage.xq2) r4
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L16
            vs0 r2 = defpackage.ox0.a
            if (r3 != r2) goto L1f
        L16:
            kt5 r3 = new kt5
            r2 = 6
            r3.<init>(r2)
            r4.l0(r3)
        L1f:
            on2 r3 = (defpackage.on2) r3
            ap3 r2 = defpackage.s76.j
            java.lang.Object r4 = defpackage.qo2.J(r1, r2, r3, r4, r0)
            s76 r4 = (defpackage.s76) r4
            return r4
    }

    public static void V(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    public static defpackage.a74 W(defpackage.a74 r10, defpackage.s76 r11, boolean r12) {
            if (r12 == 0) goto L6
            lo4 r0 = defpackage.lo4.Vertical
        L4:
            r6 = r0
            goto L9
        L6:
            lo4 r0 = defpackage.lo4.Horizontal
            goto L4
        L9:
            r94 r5 = r11.d
            lo4 r0 = defpackage.lo4.Vertical
            x64 r1 = defpackage.x64.a
            if (r6 != r0) goto L18
            jy2 r0 = defpackage.jy2.c
            a74 r0 = defpackage.u24.g(r1, r0)
            goto L1e
        L18:
            jy2 r0 = defpackage.jy2.b
            a74 r0 = defpackage.u24.g(r1, r0)
        L1e:
            a74 r10 = r10.d(r0)
            t76 r1 = new t76
            r9 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = 1
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            a74 r10 = r10.d(r1)
            g86 r11 = new g86
            r11.<init>(r7, r12)
            a74 r10 = r10.d(r11)
            return r10
    }

    public static final java.lang.Object X(defpackage.vh2 r10, int r11, defpackage.qn2 r12) {
            z64 r0 = r10.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            z64 r0 = r10.A
            z64 r0 = r0.X
            sm3 r1 = defpackage.nc1.f0(r10)
        L13:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L86
            if0 r5 = r1.B0
            java.lang.Object r5 = r5.g
            z64 r5 = (defpackage.z64) r5
            int r5 = r5.R
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L75
        L24:
            if (r0 == 0) goto L75
            int r5 = r0.L
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L72
            r5 = r0
            r6 = r4
        L2e:
            if (r5 == 0) goto L72
            boolean r7 = r5 instanceof defpackage.vh2
            if (r7 == 0) goto L35
            goto L87
        L35:
            int r7 = r5.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L6d
            boolean r7 = r5 instanceof defpackage.zg1
            if (r7 == 0) goto L6d
            r7 = r5
            zg1 r7 = (defpackage.zg1) r7
            z64 r7 = r7.l0
            r8 = r2
        L45:
            if (r7 == 0) goto L6a
            int r9 = r7.L
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L67
            int r8 = r8 + 1
            if (r8 != r3) goto L53
            r5 = r7
            goto L67
        L53:
            if (r6 != 0) goto L5e
            ua4 r6 = new ua4
            r9 = 16
            z64[] r9 = new defpackage.z64[r9]
            r6.<init>(r9)
        L5e:
            if (r5 == 0) goto L64
            r6.b(r5)
            r5 = r4
        L64:
            r6.b(r7)
        L67:
            z64 r7 = r7.Y
            goto L45
        L6a:
            if (r8 != r3) goto L6d
            goto L2e
        L6d:
            z64 r5 = defpackage.nc1.A(r6)
            goto L2e
        L72:
            z64 r0 = r0.X
            goto L24
        L75:
            sm3 r1 = r1.v()
            if (r1 == 0) goto L84
            if0 r0 = r1.B0
            if (r0 == 0) goto L84
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L13
        L84:
            r0 = r4
            goto L13
        L86:
            r5 = r4
        L87:
            vh2 r5 = (defpackage.vh2) r5
            if (r5 == 0) goto L9b
            sp3 r0 = r5.V0()
            sp3 r1 = r10.V0()
            boolean r0 = k(r0, r1)
            if (r0 == 0) goto L9b
            goto L175
        L9b:
            sp3 r10 = r10.V0()
            if (r10 == 0) goto L175
            r0 = 5
            r1 = 2
            if (r11 != r0) goto La7
        La5:
            r3 = r0
            goto Lb9
        La7:
            r0 = 6
            if (r11 != r0) goto Lab
            goto La5
        Lab:
            r0 = 3
            if (r11 != r0) goto Laf
            goto La5
        Laf:
            r0 = 4
            if (r11 != r0) goto Lb3
            goto La5
        Lb3:
            if (r11 != r3) goto Lb7
            r3 = r1
            goto Lb9
        Lb7:
            if (r11 != r1) goto L170
        Lb9:
            tp3 r11 = r10.k0
            int r11 = r11.a()
            if (r11 <= 0) goto L169
            tp3 r11 = r10.k0
            boolean r11 = r11.d()
            if (r11 == 0) goto L169
            boolean r11 = r10.j0
            if (r11 != 0) goto Lcf
            goto L169
        Lcf:
            boolean r11 = r10.S0(r3)
            tp3 r0 = r10.k0
            if (r11 == 0) goto Ldc
            int r11 = r0.b()
            goto Le0
        Ldc:
            int r11 = r0.e()
        Le0:
            dh5 r0 = new dh5
            r0.<init>()
            p70 r5 = r10.l0
            r5.getClass()
            np3 r6 = new np3
            r6.<init>(r11, r11)
            ua4 r11 = r5.a
            r11.b(r6)
            r0.A = r6
            tp3 r11 = r10.k0
            int r11 = r11.c()
            int r11 = r11 * r1
            tp3 r1 = r10.k0
            int r1 = r1.a()
            if (r11 <= r1) goto L106
            r11 = r1
        L106:
            if (r4 != 0) goto L156
            java.lang.Object r1 = r0.A
            np3 r1 = (defpackage.np3) r1
            boolean r1 = r10.R0(r1, r3)
            if (r1 == 0) goto L156
            if (r2 >= r11) goto L156
            java.lang.Object r1 = r0.A
            np3 r1 = (defpackage.np3) r1
            int r4 = r1.a
            int r1 = r1.b
            boolean r5 = r10.S0(r3)
            if (r5 == 0) goto L125
            int r1 = r1 + 1
            goto L127
        L125:
            int r4 = r4 + (-1)
        L127:
            p70 r5 = r10.l0
            r5.getClass()
            np3 r6 = new np3
            r6.<init>(r4, r1)
            ua4 r1 = r5.a
            r1.b(r6)
            p70 r1 = r10.l0
            java.lang.Object r4 = r0.A
            np3 r4 = (defpackage.np3) r4
            ua4 r1 = r1.a
            r1.j(r4)
            r0.A = r6
            int r2 = r2 + 1
            sm3 r1 = defpackage.nc1.f0(r10)
            r1.k()
            rp3 r1 = new rp3
            r1.<init>(r10, r0, r3)
            java.lang.Object r4 = r12.g(r1)
            goto L106
        L156:
            p70 r11 = r10.l0
            java.lang.Object r12 = r0.A
            np3 r12 = (defpackage.np3) r12
            ua4 r11 = r11.a
            r11.j(r12)
            sm3 r10 = defpackage.nc1.f0(r10)
            r10.k()
            return r4
        L169:
            pp3 r10 = defpackage.sp3.n0
            java.lang.Object r10 = r12.g(r10)
            return r10
        L170:
            java.lang.String r10 = "Unsupported direction for beyond bounds layout"
            defpackage.i.m(r10)
        L175:
            return r4
    }

    public static void Y(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static int Z(int r1) {
            if (r1 == 0) goto L1f
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 != r0) goto Le
            r1 = 270(0x10e, float:3.78E-43)
            return r1
        Le:
            java.lang.String r0 = "Unsupported surface rotation: "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L19:
            r1 = 180(0xb4, float:2.52E-43)
            return r1
        L1c:
            r1 = 90
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static final void a(defpackage.on2 r14, defpackage.zv0 r15, defpackage.a74 r16, defpackage.eo2 r17, defpackage.eo2 r18, defpackage.ke6 r19, long r20, long r22, defpackage.jj1 r24, defpackage.px0 r25, int r26) {
            r6 = r20
            r12 = r26
            r10 = r25
            xq2 r10 = (defpackage.xq2) r10
            r0 = 1409209698(0x53fed562, float:2.1890033E12)
            r10.d0(r0)
            r0 = r12 | 384(0x180, float:5.38E-43)
            r5 = r19
            boolean r1 = r10.f(r5)
            if (r1 == 0) goto L1b
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L1d
        L1b:
            r1 = 65536(0x10000, float:9.1835E-41)
        L1d:
            r0 = r0 | r1
            boolean r1 = r10.e(r6)
            if (r1 == 0) goto L27
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L29
        L27:
            r1 = 524288(0x80000, float:7.34684E-40)
        L29:
            r0 = r0 | r1
            r1 = 104857600(0x6400000, float:3.6111186E-35)
            r0 = r0 | r1
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r0
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L3a
            r1 = r4
            goto L3b
        L3a:
            r1 = r3
        L3b:
            r0 = r0 & r4
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L89
            r10.X()
            r0 = r12 & 1
            if (r0 == 0) goto L5a
            boolean r0 = r10.B()
            if (r0 == 0) goto L50
            goto L5a
        L50:
            r10.V()
            r2 = r16
            r8 = r22
            r11 = r24
            goto L69
        L5a:
            long r0 = defpackage.vt0.b(r6, r10)
            jj1 r2 = new jj1
            r4 = 7
            r2.<init>(r4, r3, r3)
            x64 r3 = defpackage.x64.a
            r8 = r0
            r11 = r2
            r2 = r3
        L69:
            r10.q()
            gc r0 = new gc
            r1 = r15
            r3 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r6 = r2
            r1 = -488319269(0xffffffffe2e4d6db, float:-2.1106698E21)
            zv0 r2 = defpackage.n16.I(r1, r0, r10)
            r4 = 438(0x1b6, float:6.14E-43)
            r5 = 0
            r0 = r14
            r3 = r10
            r1 = r11
            defpackage.nw7.o(r0, r1, r2, r3, r4, r5)
            r9 = r8
            goto L93
        L89:
            r3 = r10
            r3.V()
            r6 = r16
            r9 = r22
            r11 = r24
        L93:
            cf5 r13 = r3.t()
            if (r13 == 0) goto Lab
            jd r0 = new jd
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r7 = r20
            r3 = r6
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            r13.d = r0
        Lab:
            return
    }

    public static void a0(java.lang.String r2) {
            java.lang.String r0 = "lateinit property "
            java.lang.String r1 = " has not been initialized"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            ug r0 = new ug
            r0.<init>(r2)
            java.lang.Class<nb3> r2 = defpackage.nb3.class
            java.lang.String r2 = r2.getName()
            V(r0, r2)
            throw r0
    }

    public static defpackage.gn b(float r4) {
            gn r0 = new gn
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            wc7 r1 = defpackage.nw7.e0
            r2 = 1008981770(0x3c23d70a, float:0.01)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 8
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    public static final java.lang.Object[] b0(java.util.Collection r4) {
            r4.getClass()
            int r0 = r4.size()
            java.lang.Object[] r1 = defpackage.nb3.i
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r4 = r4.iterator()
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L17
            return r1
        L17:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1a:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L46
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2c
            return r0
        L2c:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L40
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L3a
            goto L40
        L3a:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L40:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L44:
            r1 = r2
            goto L1a
        L46:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L44
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            return r4
    }

    public static defpackage.v80 c(int r3, defpackage.m80 r4, defpackage.qn2 r5, int r6) {
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r6 & 2
            if (r0 == 0) goto Lc
            m80 r4 = defpackage.m80.SUSPEND
        Lc:
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L12
            r5 = r0
        L12:
            r6 = -2
            r2 = 1
            if (r3 == r6) goto L58
            r6 = -1
            if (r3 == r6) goto L46
            if (r3 == 0) goto L36
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r6) goto L30
            m80 r6 = defpackage.m80.SUSPEND
            if (r4 != r6) goto L2a
            v80 r4 = new v80
            r4.<init>(r3, r5)
            return r4
        L2a:
            hz0 r6 = new hz0
            r6.<init>(r3, r4, r5)
            return r6
        L30:
            v80 r3 = new v80
            r3.<init>(r6, r5)
            return r3
        L36:
            m80 r3 = defpackage.m80.SUSPEND
            if (r4 != r3) goto L40
            v80 r3 = new v80
            r3.<init>(r1, r5)
            return r3
        L40:
            hz0 r3 = new hz0
            r3.<init>(r2, r4, r5)
            return r3
        L46:
            m80 r3 = defpackage.m80.SUSPEND
            if (r4 != r3) goto L52
            hz0 r3 = new hz0
            m80 r4 = defpackage.m80.DROP_OLDEST
            r3.<init>(r2, r4, r5)
            return r3
        L52:
            java.lang.String r3 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            defpackage.i.h(r3)
            return r0
        L58:
            m80 r3 = defpackage.m80.SUSPEND
            if (r4 != r3) goto L69
            v80 r3 = new v80
            tl0 r4 = defpackage.ul0.h
            r4.getClass()
            int r4 = defpackage.tl0.b
            r3.<init>(r4, r5)
            return r3
        L69:
            hz0 r3 = new hz0
            r3.<init>(r2, r4, r5)
            return r3
    }

    public static final java.lang.Object[] c0(java.util.Collection r5, java.lang.Object[] r6) {
            r5.getClass()
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L14
            int r5 = r6.length
            if (r5 <= 0) goto L23
            r6[r2] = r1
            return r6
        L14:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L24
            int r5 = r6.length
            if (r5 <= 0) goto L23
            r6[r2] = r1
        L23:
            return r6
        L24:
            int r3 = r6.length
            if (r0 > r3) goto L29
            r0 = r6
            goto L3a
        L29:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3a:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L66
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L4c
            return r0
        L4c:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L60
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L5a
            goto L60
        L5a:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L60:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
        L64:
            r2 = r3
            goto L3a
        L66:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L64
            if (r0 != r6) goto L71
            r6[r3] = r1
            return r6
        L71:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            return r5
    }

    public static final void d(defpackage.a74 r18, defpackage.lq4 r19, java.util.List r20, defpackage.qn2 r21, defpackage.eo2 r22, defpackage.lq4 r23, defpackage.px0 r24, int r25, int r26) {
            r1 = r18
            r7 = r20
            r5 = r22
            r0 = r25
            r11 = r24
            xq2 r11 = (defpackage.xq2) r11
            r2 = 1764478774(0x692bcf36, float:1.2981553E25)
            r11.d0(r2)
            r2 = r0 & 6
            if (r2 != 0) goto L21
            boolean r2 = r11.f(r1)
            if (r2 == 0) goto L1e
            r2 = 4
            goto L1f
        L1e:
            r2 = 2
        L1f:
            r2 = r2 | r0
            goto L22
        L21:
            r2 = r0
        L22:
            r3 = r0 & 48
            r15 = r19
            if (r3 != 0) goto L34
            boolean r3 = r11.f(r15)
            if (r3 == 0) goto L31
            r3 = 32
            goto L33
        L31:
            r3 = 16
        L33:
            r2 = r2 | r3
        L34:
            r3 = r0 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L44
            boolean r3 = r11.h(r7)
            if (r3 == 0) goto L41
            r3 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r3 = 128(0x80, float:1.8E-43)
        L43:
            r2 = r2 | r3
        L44:
            r3 = r0 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L57
            r3 = r21
            boolean r6 = r11.h(r3)
            if (r6 == 0) goto L53
            r6 = 2048(0x800, float:2.87E-42)
            goto L55
        L53:
            r6 = 1024(0x400, float:1.435E-42)
        L55:
            r2 = r2 | r6
            goto L59
        L57:
            r3 = r21
        L59:
            r6 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L69
            boolean r6 = r11.h(r5)
            if (r6 == 0) goto L66
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L68
        L66:
            r6 = 8192(0x2000, float:1.148E-41)
        L68:
            r2 = r2 | r6
        L69:
            r6 = r26 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L73
            r2 = r2 | r9
        L70:
            r9 = r23
            goto L84
        L73:
            r9 = r9 & r0
            if (r9 != 0) goto L70
            r9 = r23
            boolean r10 = r11.f(r9)
            if (r10 == 0) goto L81
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L83
        L81:
            r10 = 65536(0x10000, float:9.1835E-41)
        L83:
            r2 = r2 | r10
        L84:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r2
            r12 = 74898(0x12492, float:1.04954E-40)
            r14 = 0
            if (r10 == r12) goto L90
            r10 = 1
            goto L91
        L90:
            r10 = r14
        L91:
            r12 = r2 & 1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L191
            if (r6 == 0) goto L9e
            pq4 r6 = defpackage.px5.a
            goto L9f
        L9e:
            r6 = r9
        L9f:
            pr3 r9 = defpackage.qr3.a(r11)
            java.lang.Object r10 = r11.P()
            vs0 r12 = defpackage.ox0.a
            if (r10 != r12) goto Lb7
            sa1 r10 = new sa1
            r10.<init>(r9, r14)
            ii1 r10 = defpackage.np2.I(r10)
            r11.l0(r10)
        Lb7:
            pp6 r10 = (defpackage.pp6) r10
            eu r8 = defpackage.ju.c
            c40 r13 = defpackage.d90.k0
            yt0 r8 = defpackage.wt0.a(r8, r13, r11, r14)
            long r14 = r11.T
            int r14 = java.lang.Long.hashCode(r14)
            xv4 r15 = r11.l()
            a74 r13 = defpackage.l.E(r11, r1)
            ix0 r16 = defpackage.jx0.i
            r16.getClass()
            iy0 r4 = defpackage.ix0.b
            r11.f0()
            boolean r0 = r11.S
            if (r0 == 0) goto Le1
            r11.k(r4)
            goto Le4
        Le1:
            r11.o0()
        Le4:
            pn r0 = defpackage.ix0.f
            defpackage.yh2.K(r11, r0, r8)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r11, r0, r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            pn r4 = defpackage.ix0.g
            defpackage.yh2.K(r11, r4, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r11, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r11, r0, r13)
            java.lang.Object r0 = r10.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12a
            r0 = 1262543969(0x4b40e461, float:1.2641377E7)
            r11.b0(r0)
            r13 = 0
            r14 = 15
            r8 = 0
            r0 = r9
            r9 = 0
            r4 = r12
            r12 = r11
            r11 = 0
            r15 = r0
            r17 = r4
            r0 = 0
            r4 = 131072(0x20000, float:1.83671E-40)
            defpackage.l.c(r8, r9, r11, r12, r13, r14)
            r12.p(r0)
            goto L13a
        L12a:
            r15 = r9
            r17 = r12
            r0 = 0
            r4 = 131072(0x20000, float:1.83671E-40)
            r12 = r11
            r8 = 1262575682(0x4b416042, float:1.267309E7)
            r12.b0(r8)
            r12.p(r0)
        L13a:
            boolean r8 = r12.h(r7)
            r9 = r2 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 != r10) goto L146
            r13 = 1
            goto L147
        L146:
            r13 = r0
        L147:
            r8 = r8 | r13
            boolean r9 = r12.h(r5)
            r8 = r8 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r2
            if (r9 != r4) goto L154
            r13 = 1
            goto L155
        L154:
            r13 = r0
        L155:
            r0 = r8 | r13
            java.lang.Object r4 = r12.P()
            if (r0 != 0) goto L161
            r0 = r17
            if (r4 != r0) goto L163
        L161:
            r0 = r2
            goto L166
        L163:
            r0 = r2
            r14 = r6
            goto L173
        L166:
            cn r2 = new cn
            r3 = 4
            r4 = r21
            r2.<init>(r3, r4, r5, r6, r7)
            r14 = r6
            r12.l0(r2)
            r4 = r2
        L173:
            r10 = r4
            qn2 r10 = (defpackage.qn2) r10
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r13 = 505(0x1f9, float:7.08E-43)
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r19
            r11 = r12
            r3 = r15
            r12 = r0
            defpackage.gi2.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r12 = r11
            r0 = 1
            r12.p(r0)
            r6 = r14
            goto L196
        L191:
            r12 = r11
            r12.V()
            r6 = r9
        L196:
            cf5 r9 = r12.t()
            if (r9 == 0) goto L1af
            ta1 r0 = new ta1
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L1af:
            return
    }

    public static boolean d0(java.io.ByteArrayOutputStream r18, byte[] r19, defpackage.ti1[] r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            byte[] r3 = defpackage.f04.B
            byte[] r4 = defpackage.f04.A
            byte[] r5 = defpackage.f04.x
            boolean r6 = java.util.Arrays.equals(r1, r5)
            r7 = 4
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L249
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 3
            r1.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            int r6 = r2.length     // Catch: java.lang.Throwable -> L63
            defpackage.nw7.x0(r3, r6)     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11 = r6
            r10 = r8
        L2c:
            int r12 = r2.length     // Catch: java.lang.Throwable -> L63
            if (r10 >= r12) goto L65
            r12 = r2[r10]     // Catch: java.lang.Throwable -> L63
            long r13 = r12.c     // Catch: java.lang.Throwable -> L63
            defpackage.nw7.w0(r3, r13, r7)     // Catch: java.lang.Throwable -> L63
            long r13 = r12.d     // Catch: java.lang.Throwable -> L63
            defpackage.nw7.w0(r3, r13, r7)     // Catch: java.lang.Throwable -> L63
            int r13 = r12.g     // Catch: java.lang.Throwable -> L63
            long r13 = (long) r13     // Catch: java.lang.Throwable -> L63
            defpackage.nw7.w0(r3, r13, r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r12.a     // Catch: java.lang.Throwable -> L63
            java.lang.String r12 = r12.b     // Catch: java.lang.Throwable -> L63
            java.lang.String r12 = v(r13, r12, r5)     // Catch: java.lang.Throwable -> L63
            int r11 = r11 + 14
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L63
            byte[] r14 = r12.getBytes(r13)     // Catch: java.lang.Throwable -> L63
            int r14 = r14.length     // Catch: java.lang.Throwable -> L63
            defpackage.nw7.x0(r3, r14)     // Catch: java.lang.Throwable -> L63
            int r11 = r11 + r14
            byte[] r12 = r12.getBytes(r13)     // Catch: java.lang.Throwable -> L63
            r3.write(r12)     // Catch: java.lang.Throwable -> L63
            int r10 = r10 + 1
            goto L2c
        L60:
            r1 = r0
            goto L240
        L63:
            r0 = move-exception
            goto L60
        L65:
            byte[] r5 = r3.toByteArray()     // Catch: java.lang.Throwable -> L63
            int r10 = r5.length     // Catch: java.lang.Throwable -> L63
            java.lang.String r12 = ", does not match actual size "
            java.lang.String r13 = "Expected size "
            if (r11 != r10) goto L224
            ay7 r10 = new ay7     // Catch: java.lang.Throwable -> L63
            bb2 r11 = defpackage.bb2.DEX_FILES     // Catch: java.lang.Throwable -> L63
            r10.<init>(r11, r5, r8)     // Catch: java.lang.Throwable -> L63
            r3.close()
            r1.add(r10)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r5 = r8
            r10 = r5
        L84:
            int r11 = r2.length     // Catch: java.lang.Throwable -> Lb7
            if (r5 >= r11) goto Lb9
            r11 = r2[r5]     // Catch: java.lang.Throwable -> Lb7
            defpackage.nw7.x0(r3, r5)     // Catch: java.lang.Throwable -> Lb7
            int r10 = r10 + 4
            int r14 = r11.e     // Catch: java.lang.Throwable -> Lb7
            defpackage.nw7.x0(r3, r14)     // Catch: java.lang.Throwable -> Lb7
            int r14 = r11.e     // Catch: java.lang.Throwable -> Lb7
            int r14 = r14 * r6
            int r10 = r10 + r14
            int[] r11 = r11.h     // Catch: java.lang.Throwable -> Lb7
            int r14 = r11.length     // Catch: java.lang.Throwable -> Lb7
            r15 = r8
            r16 = r15
        L9d:
            if (r15 >= r14) goto Laf
            r17 = r11[r15]     // Catch: java.lang.Throwable -> Lb7
            r19 = r6
            int r6 = r17 - r16
            defpackage.nw7.x0(r3, r6)     // Catch: java.lang.Throwable -> Lb7
            int r15 = r15 + 1
            r6 = r19
            r16 = r17
            goto L9d
        Laf:
            r19 = r6
            int r5 = r5 + 1
            goto L84
        Lb4:
            r1 = r0
            goto L21b
        Lb7:
            r0 = move-exception
            goto Lb4
        Lb9:
            r19 = r6
            byte[] r5 = r3.toByteArray()     // Catch: java.lang.Throwable -> Lb7
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lb7
            if (r10 != r6) goto L1ff
            ay7 r6 = new ay7     // Catch: java.lang.Throwable -> Lb7
            bb2 r10 = defpackage.bb2.CLASSES     // Catch: java.lang.Throwable -> Lb7
            r6.<init>(r10, r5, r9)     // Catch: java.lang.Throwable -> Lb7
            r3.close()
            r1.add(r6)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r5 = r8
            r6 = r5
        Ld6:
            int r10 = r2.length     // Catch: java.lang.Throwable -> L13d
            if (r5 >= r10) goto L157
            r10 = r2[r5]     // Catch: java.lang.Throwable -> L13d
            java.util.TreeMap r11 = r10.i     // Catch: java.lang.Throwable -> L13d
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L13d
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L13d
            r14 = r8
        Le6:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L13d
            if (r15 == 0) goto Lfe
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L13d
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L13d
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L13d
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L13d
            r14 = r14 | r15
            goto Le6
        Lfe:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L13d
            r11.<init>()     // Catch: java.lang.Throwable -> L13d
            i0(r11, r14, r10)     // Catch: java.lang.Throwable -> L14c
            byte[] r15 = r11.toByteArray()     // Catch: java.lang.Throwable -> L14c
            r11.close()     // Catch: java.lang.Throwable -> L13d
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L13d
            r11.<init>()     // Catch: java.lang.Throwable -> L13d
            j0(r11, r10)     // Catch: java.lang.Throwable -> L141
            byte[] r10 = r11.toByteArray()     // Catch: java.lang.Throwable -> L141
            r11.close()     // Catch: java.lang.Throwable -> L13d
            defpackage.nw7.x0(r3, r5)     // Catch: java.lang.Throwable -> L13d
            int r11 = r15.length     // Catch: java.lang.Throwable -> L13d
            int r11 = r11 + 2
            int r8 = r10.length     // Catch: java.lang.Throwable -> L13d
            int r11 = r11 + r8
            int r6 = r6 + 6
            r17 = r10
            long r9 = (long) r11     // Catch: java.lang.Throwable -> L13d
            defpackage.nw7.w0(r3, r9, r7)     // Catch: java.lang.Throwable -> L13d
            defpackage.nw7.x0(r3, r14)     // Catch: java.lang.Throwable -> L13d
            r3.write(r15)     // Catch: java.lang.Throwable -> L13d
            r9 = r17
            r3.write(r9)     // Catch: java.lang.Throwable -> L13d
            int r6 = r6 + r11
            int r5 = r5 + 1
            r8 = 0
            r9 = 1
            goto Ld6
        L13d:
            r0 = move-exception
            r1 = r0
            goto L1f6
        L141:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L147
            goto L14b
        L147:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L13d
        L14b:
            throw r1     // Catch: java.lang.Throwable -> L13d
        L14c:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L152
            goto L156
        L152:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L13d
        L156:
            throw r1     // Catch: java.lang.Throwable -> L13d
        L157:
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Throwable -> L13d
            int r5 = r2.length     // Catch: java.lang.Throwable -> L13d
            if (r6 != r5) goto L1da
            ay7 r5 = new ay7     // Catch: java.lang.Throwable -> L13d
            bb2 r6 = defpackage.bb2.METHODS     // Catch: java.lang.Throwable -> L13d
            r8 = 1
            r5.<init>(r6, r2, r8)     // Catch: java.lang.Throwable -> L13d
            r3.close()
            r1.add(r5)
            int r2 = r1.size()
            int r2 = r2 * 16
            long r2 = (long) r2
            r5 = 12
            long r5 = r5 + r2
            int r2 = r1.size()
            long r2 = (long) r2
            defpackage.nw7.w0(r0, r2, r7)
            r2 = 0
        L17f:
            int r3 = r1.size()
            if (r2 >= r3) goto L1c4
            java.lang.Object r3 = r1.get(r2)
            ay7 r3 = (defpackage.ay7) r3
            bb2 r9 = r3.a
            byte[] r10 = r3.b
            long r11 = r9.getValue()
            defpackage.nw7.w0(r0, r11, r7)
            defpackage.nw7.w0(r0, r5, r7)
            boolean r3 = r3.c
            if (r3 == 0) goto L1b2
            int r3 = r10.length
            long r11 = (long) r3
            byte[] r3 = defpackage.nw7.Q(r10)
            r4.add(r3)
            int r9 = r3.length
            long r9 = (long) r9
            defpackage.nw7.w0(r0, r9, r7)
            defpackage.nw7.w0(r0, r11, r7)
            int r3 = r3.length
        L1af:
            long r9 = (long) r3
            long r5 = r5 + r9
            goto L1c1
        L1b2:
            r4.add(r10)
            int r3 = r10.length
            long r11 = (long) r3
            defpackage.nw7.w0(r0, r11, r7)
            r11 = 0
            defpackage.nw7.w0(r0, r11, r7)
            int r3 = r10.length
            goto L1af
        L1c1:
            int r2 = r2 + 1
            goto L17f
        L1c4:
            r1 = 0
        L1c5:
            int r2 = r4.size()
            if (r1 >= r2) goto L1d7
            java.lang.Object r2 = r4.get(r1)
            byte[] r2 = (byte[]) r2
            r0.write(r2)
            int r1 = r1 + 1
            goto L1c5
        L1d7:
            r8 = 1
            goto L36f
        L1da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13d
            r0.<init>()     // Catch: java.lang.Throwable -> L13d
            r0.append(r13)     // Catch: java.lang.Throwable -> L13d
            r0.append(r6)     // Catch: java.lang.Throwable -> L13d
            r0.append(r12)     // Catch: java.lang.Throwable -> L13d
            int r1 = r2.length     // Catch: java.lang.Throwable -> L13d
            r0.append(r1)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L13d
            throw r1     // Catch: java.lang.Throwable -> L13d
        L1f6:
            r3.close()     // Catch: java.lang.Throwable -> L1fa
            goto L1fe
        L1fa:
            r0 = move-exception
            r1.addSuppressed(r0)
        L1fe:
            throw r1
        L1ff:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb7
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb7
            r0.append(r10)     // Catch: java.lang.Throwable -> Lb7
            r0.append(r12)     // Catch: java.lang.Throwable -> Lb7
            int r1 = r5.length     // Catch: java.lang.Throwable -> Lb7
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            throw r1     // Catch: java.lang.Throwable -> Lb7
        L21b:
            r3.close()     // Catch: java.lang.Throwable -> L21f
            goto L223
        L21f:
            r0 = move-exception
            r1.addSuppressed(r0)
        L223:
            throw r1
        L224:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0.append(r13)     // Catch: java.lang.Throwable -> L63
            r0.append(r11)     // Catch: java.lang.Throwable -> L63
            r0.append(r12)     // Catch: java.lang.Throwable -> L63
            int r1 = r5.length     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L63
        L240:
            r3.close()     // Catch: java.lang.Throwable -> L244
            goto L248
        L244:
            r0 = move-exception
            r1.addSuppressed(r0)
        L248:
            throw r1
        L249:
            byte[] r5 = defpackage.f04.y
            boolean r6 = java.util.Arrays.equals(r1, r5)
            if (r6 == 0) goto L26d
            byte[] r1 = r(r2, r5)
            int r2 = r2.length
            long r2 = (long) r2
            r8 = 1
            defpackage.nw7.w0(r0, r2, r8)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.nw7.w0(r0, r2, r7)
            byte[] r1 = defpackage.nw7.Q(r1)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.nw7.w0(r0, r2, r7)
            r0.write(r1)
            return r8
        L26d:
            r8 = 1
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L2e1
            int r1 = r2.length
            long r5 = (long) r1
            defpackage.nw7.w0(r0, r5, r8)
            int r1 = r2.length
            r3 = 0
        L27b:
            if (r3 >= r1) goto L1d7
            r5 = r2[r3]
            java.util.TreeMap r6 = r5.i
            int r6 = r6.size()
            int r6 = r6 * r7
            java.lang.String r9 = r5.a
            java.lang.String r10 = r5.b
            java.lang.String r9 = v(r9, r10, r4)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r11 = r9.getBytes(r10)
            int r11 = r11.length
            defpackage.nw7.x0(r0, r11)
            int[] r11 = r5.h
            int r11 = r11.length
            defpackage.nw7.x0(r0, r11)
            long r11 = (long) r6
            defpackage.nw7.w0(r0, r11, r7)
            long r11 = r5.c
            defpackage.nw7.w0(r0, r11, r7)
            byte[] r6 = r9.getBytes(r10)
            r0.write(r6)
            java.util.TreeMap r6 = r5.i
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L2b8:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L2d0
            java.lang.Object r9 = r6.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            defpackage.nw7.x0(r0, r9)
            r9 = 0
            defpackage.nw7.x0(r0, r9)
            goto L2b8
        L2d0:
            int[] r5 = r5.h
            int r6 = r5.length
            r9 = 0
        L2d4:
            if (r9 >= r6) goto L2de
            r10 = r5[r9]
            defpackage.nw7.x0(r0, r10)
            int r9 = r9 + 1
            goto L2d4
        L2de:
            int r3 = r3 + 1
            goto L27b
        L2e1:
            byte[] r4 = defpackage.f04.z
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L305
            byte[] r1 = r(r2, r4)
            int r2 = r2.length
            long r2 = (long) r2
            r8 = 1
            defpackage.nw7.w0(r0, r2, r8)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.nw7.w0(r0, r2, r7)
            byte[] r1 = defpackage.nw7.Q(r1)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.nw7.w0(r0, r2, r7)
            r0.write(r1)
            return r8
        L305:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L370
            int r1 = r2.length
            defpackage.nw7.x0(r0, r1)
            int r1 = r2.length
            r9 = 0
        L311:
            if (r9 >= r1) goto L1d7
            r4 = r2[r9]
            java.lang.String r5 = r4.a
            java.util.TreeMap r6 = r4.i
            java.lang.String r10 = r4.b
            java.lang.String r5 = v(r5, r10, r3)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r11 = r5.getBytes(r10)
            int r11 = r11.length
            defpackage.nw7.x0(r0, r11)
            int r11 = r6.size()
            defpackage.nw7.x0(r0, r11)
            int[] r11 = r4.h
            int r11 = r11.length
            defpackage.nw7.x0(r0, r11)
            long r11 = r4.c
            defpackage.nw7.w0(r0, r11, r7)
            byte[] r5 = r5.getBytes(r10)
            r0.write(r5)
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L34a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L35e
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            defpackage.nw7.x0(r0, r6)
            goto L34a
        L35e:
            int[] r4 = r4.h
            int r5 = r4.length
            r6 = 0
        L362:
            if (r6 >= r5) goto L36c
            r10 = r4[r6]
            defpackage.nw7.x0(r0, r10)
            int r6 = r6 + 1
            goto L362
        L36c:
            int r9 = r9 + 1
            goto L311
        L36f:
            return r8
        L370:
            r16 = 0
            return r16
    }

    public static final void e(defpackage.xa1 r11, defpackage.on2 r12, defpackage.qn2 r13, defpackage.px0 r14, int r15) {
            r12.getClass()
            r13.getClass()
            r4 = r14
            xq2 r4 = (defpackage.xq2) r4
            r0 = 1504194021(0x59a82de5, float:5.917282E15)
            r4.d0(r0)
            r0 = r15 | 2
            boolean r2 = r4.h(r12)
            if (r2 == 0) goto L1a
            r2 = 32
            goto L1c
        L1a:
            r2 = 16
        L1c:
            r0 = r0 | r2
            boolean r3 = r4.h(r13)
            if (r3 == 0) goto L26
            r3 = 256(0x100, float:3.59E-43)
            goto L28
        L26:
            r3 = 128(0x80, float:1.8E-43)
        L28:
            r0 = r0 | r3
            r3 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 == r5) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            r5 = r0 & 1
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto Lac
            r4.X()
            r3 = r15 & 1
            r5 = 0
            if (r3 == 0) goto L50
            boolean r3 = r4.B()
            if (r3 == 0) goto L49
            goto L50
        L49:
            r4.V()
            r0 = r0 & (-15)
            r6 = r11
            goto L73
        L50:
            bp7 r3 = defpackage.ey3.a(r4)
            if (r3 == 0) goto La6
            boolean r6 = r3 instanceof defpackage.mw2
            if (r6 == 0) goto L62
            r6 = r3
            mw2 r6 = (defpackage.mw2) r6
            j71 r6 = r6.getDefaultViewModelCreationExtras()
            goto L64
        L62:
            h71 r6 = defpackage.h71.b
        L64:
            java.lang.Class<xa1> r7 = defpackage.xa1.class
            ar0 r7 = defpackage.gh5.a(r7)
            qo7 r3 = defpackage.nj2.G(r7, r3, r5, r6, r4)
            xa1 r3 = (defpackage.xa1) r3
            r0 = r0 & (-15)
            r6 = r3
        L73:
            r4.q()
            de5 r3 = r6.e
            qa4 r3 = defpackage.np2.C(r3, r4)
            java.lang.Object r3 = r3.getValue()
            pa1 r3 = (defpackage.pa1) r3
            boolean r7 = r4.h(r6)
            java.lang.Object r8 = r4.P()
            if (r7 != 0) goto L90
            vs0 r7 = defpackage.ox0.a
            if (r8 != r7) goto L9a
        L90:
            z r8 = new z
            r7 = 29
            r8.<init>(r6, r5, r7)
            r4.l0(r8)
        L9a:
            eo2 r8 = (defpackage.eo2) r8
            r5 = r0 & 1008(0x3f0, float:1.413E-42)
            r1 = r12
            r2 = r13
            r0 = r3
            r3 = r8
            f(r0, r1, r2, r3, r4, r5)
            goto Lb0
        La6:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            defpackage.i.m(r0)
            return
        Lac:
            r4.V()
            r6 = r11
        Lb0:
            cf5 r0 = r4.t()
            if (r0 == 0) goto Lc2
            x3 r5 = new x3
            r10 = 13
            r7 = r12
            r8 = r13
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.d = r5
        Lc2:
            return
    }

    public static final java.lang.String e0(int r2, java.lang.CharSequence r3) {
            int r0 = r3.length()
            if (r0 > r2) goto Lb
            java.lang.String r2 = r3.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.CharSequence r2 = r3.subSequence(r1, r2)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "..."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final void f(defpackage.pa1 r12, defpackage.on2 r13, defpackage.qn2 r14, defpackage.eo2 r15, defpackage.px0 r16, int r17) {
            r5 = r17
            r10 = r16
            xq2 r10 = (defpackage.xq2) r10
            r0 = -661086427(0xffffffffd8989f25, float:-1.3424743E15)
            r10.d0(r0)
            r0 = r5 & 6
            if (r0 != 0) goto L1b
            boolean r0 = r10.f(r12)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r0 | r5
            goto L1c
        L1b:
            r0 = r5
        L1c:
            r1 = r5 & 48
            if (r1 != 0) goto L2c
            boolean r1 = r10.h(r13)
            if (r1 == 0) goto L29
            r1 = 32
            goto L2b
        L29:
            r1 = 16
        L2b:
            r0 = r0 | r1
        L2c:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L3c
            boolean r1 = r10.h(r14)
            if (r1 == 0) goto L39
            r1 = 256(0x100, float:3.59E-43)
            goto L3b
        L39:
            r1 = 128(0x80, float:1.8E-43)
        L3b:
            r0 = r0 | r1
        L3c:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L4c
            boolean r1 = r10.h(r15)
            if (r1 == 0) goto L49
            r1 = 2048(0x800, float:2.87E-42)
            goto L4b
        L49:
            r1 = 1024(0x400, float:1.435E-42)
        L4b:
            r0 = r0 | r1
        L4c:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            r3 = 0
            if (r1 == r2) goto L55
            r1 = 1
            goto L56
        L55:
            r1 = r3
        L56:
            r2 = r0 & 1
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto L90
            et7 r1 = defpackage.ft7.b(r10, r3)
            vv7 r1 = r1.a
            r2 = 840(0x348, float:1.177E-42)
            int r1 = r1.a
            if (r1 < r2) goto L7d
            r1 = -2000294509(0xffffffff88c5ed93, float:-1.191236E-33)
            r10.b0(r1)
            r11 = r0 & 8190(0x1ffe, float:1.1477E-41)
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            j(r6, r7, r8, r9, r10, r11)
            r10.p(r3)
            goto L93
        L7d:
            r1 = -2000088018(0xffffffff88c9142e, float:-1.2101992E-33)
            r10.b0(r1)
            r11 = r0 & 8190(0x1ffe, float:1.1477E-41)
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            h(r6, r7, r8, r9, r10, r11)
            r10.p(r3)
            goto L93
        L90:
            r10.V()
        L93:
            cf5 r7 = r10.t()
            if (r7 == 0) goto La5
            ra1 r0 = new ra1
            r6 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        La5:
            return
    }

    public static final void f0(java.util.List r0, java.util.List r1) {
            if (r1 != 0) goto L10
            int r0 = r0.size()
            r1 = 2
            if (r0 < r1) goto La
            goto L1a
        La:
            java.lang.String r0 = "colors must have length of at least 2 if colorStops is omitted."
            defpackage.i.h(r0)
            return
        L10:
            int r0 = r0.size()
            int r1 = r1.size()
            if (r0 != r1) goto L1b
        L1a:
            return
        L1b:
            java.lang.String r0 = "colors and colorStops arguments must have equal length."
            defpackage.i.h(r0)
            return
    }

    public static final void g(defpackage.a74 r28, defpackage.px0 r29, int r30) {
            r0 = r28
            r1 = r30
            r2 = r29
            xq2 r2 = (defpackage.xq2) r2
            r3 = 419579728(0x19024750, float:6.735244E-24)
            r2.d0(r3)
            r3 = r1 & 6
            r4 = 4
            r5 = 2
            if (r3 != 0) goto L1f
            boolean r3 = r2.f(r0)
            if (r3 == 0) goto L1c
            r3 = r4
            goto L1d
        L1c:
            r3 = r5
        L1d:
            r3 = r3 | r1
            goto L20
        L1f:
            r3 = r1
        L20:
            r6 = r3 & 3
            r7 = 0
            r8 = 1
            if (r6 == r5) goto L28
            r5 = r8
            goto L29
        L28:
            r5 = r7
        L29:
            r3 = r3 & r8
            boolean r3 = r2.S(r3, r5)
            if (r3 == 0) goto Lc3
            e40 r3 = defpackage.d90.Z
            e34 r3 = defpackage.h70.d(r3, r7)
            long r5 = r2.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r2.l()
            a74 r9 = defpackage.l.E(r2, r0)
            ix0 r10 = defpackage.jx0.i
            r10.getClass()
            iy0 r10 = defpackage.ix0.b
            r2.f0()
            boolean r11 = r2.S
            if (r11 == 0) goto L56
            r2.k(r10)
            goto L59
        L56:
            r2.o0()
        L59:
            pn r10 = defpackage.ix0.f
            defpackage.yh2.K(r2, r10, r3)
            pn r3 = defpackage.ix0.e
            defpackage.yh2.K(r2, r3, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r2, r5, r3)
            ne r3 = defpackage.ix0.h
            defpackage.yh2.F(r2, r3)
            pn r3 = defpackage.ix0.d
            defpackage.yh2.K(r2, r3, r9)
            r3 = 2131952293(0x7f1302a5, float:1.9541025E38)
            java.lang.String r3 = defpackage.yh2.O(r2, r3)
            r23 = 0
            r24 = 131070(0x1fffe, float:1.83668E-40)
            r21 = r2
            r2 = r3
            r3 = 0
            r6 = r4
            r4 = 0
            r9 = r6
            r10 = r7
            r6 = 0
            r11 = r8
            r8 = 0
            r12 = r9
            r9 = 0
            r13 = r10
            r14 = r11
            r10 = 0
            r15 = r12
            r12 = 0
            r16 = r13
            r17 = r14
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = r17
            r17 = 0
            r22 = r18
            r18 = 0
            r25 = r19
            r19 = 0
            r26 = r20
            r20 = 0
            r27 = r22
            r22 = 0
            r0 = r26
            defpackage.x37.b(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r21
            r2.p(r0)
            goto Lc6
        Lc3:
            r2.V()
        Lc6:
            cf5 r0 = r2.t()
            if (r0 == 0) goto Ld7
            f5 r2 = new f5
            r13 = 0
            r15 = 4
            r3 = r28
            r2.<init>(r3, r1, r15, r13)
            r0.d = r2
        Ld7:
            return
    }

    public static void g0(java.io.ByteArrayOutputStream r8, defpackage.ti1 r9) {
            j0(r8, r9)
            int r0 = r9.g
            int[] r1 = r9.h
            int r2 = r1.length
            r3 = 0
            r4 = r3
        La:
            if (r3 >= r2) goto L17
            r5 = r1[r3]
            int r4 = r5 - r4
            defpackage.nw7.x0(r8, r4)
            int r3 = r3 + 1
            r4 = r5
            goto La
        L17:
            int r1 = r0 * 2
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r9 = r9.i
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L2b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L5c
            int r4 = r3 / 8
            r6 = r1[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r1[r4] = r6
        L5c:
            r2 = r2 & 4
            if (r2 == 0) goto L2b
            int r3 = r3 + r0
            int r2 = r3 / 8
            r4 = r1[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            goto L2b
        L6e:
            r8.write(r1)
            return
    }

    public static final void h(defpackage.pa1 r9, defpackage.on2 r10, defpackage.qn2 r11, defpackage.eo2 r12, defpackage.px0 r13, int r14) {
            r7 = r13
            xq2 r7 = (defpackage.xq2) r7
            r0 = -83231447(0xfffffffffb09fd29, float:-7.164794E35)
            r7.d0(r0)
            r0 = r14 & 6
            if (r0 != 0) goto L18
            boolean r0 = r7.f(r9)
            if (r0 == 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = 2
        L16:
            r0 = r0 | r14
            goto L19
        L18:
            r0 = r14
        L19:
            r3 = r14 & 48
            if (r3 != 0) goto L29
            boolean r3 = r7.h(r10)
            if (r3 == 0) goto L26
            r3 = 32
            goto L28
        L26:
            r3 = 16
        L28:
            r0 = r0 | r3
        L29:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L39
            boolean r4 = r7.h(r11)
            if (r4 == 0) goto L36
            r4 = 256(0x100, float:3.59E-43)
            goto L38
        L36:
            r4 = 128(0x80, float:1.8E-43)
        L38:
            r0 = r0 | r4
        L39:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L49
            boolean r5 = r7.h(r12)
            if (r5 == 0) goto L46
            r5 = 2048(0x800, float:2.87E-42)
            goto L48
        L46:
            r5 = 1024(0x400, float:1.435E-42)
        L48:
            r0 = r0 | r5
        L49:
            r8 = r0
            r0 = r8 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r0 == r5) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            r5 = r8 & 1
            boolean r0 = r7.S(r5, r0)
            if (r0 == 0) goto L76
            p4 r0 = new p4
            r5 = 6
            r2 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = 479601184(0x1c962220, float:9.934988E-22)
            zv0 r0 = defpackage.n16.I(r2, r0, r7)
            int r2 = r8 >> 3
            r2 = r2 & 14
            r2 = r2 | 48
            defpackage.ln2.c(r10, r0, r7, r2)
            goto L79
        L76:
            r7.V()
        L79:
            cf5 r7 = r7.t()
            if (r7 == 0) goto L8c
            ra1 r0 = new ra1
            r6 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L8c:
            return
    }

    public static void h0(java.io.ByteArrayOutputStream r4, defpackage.ti1 r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            defpackage.nw7.x0(r4, r1)
            int r1 = r5.e
            defpackage.nw7.x0(r4, r1)
            int r1 = r5.f
            long r1 = (long) r1
            r3 = 4
            defpackage.nw7.w0(r4, r1, r3)
            long r1 = r5.c
            defpackage.nw7.w0(r4, r1, r3)
            int r5 = r5.g
            long r1 = (long) r5
            defpackage.nw7.w0(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    public static final void i(defpackage.a74 r12, defpackage.px0 r13, int r14) {
            r7 = r13
            xq2 r7 = (defpackage.xq2) r7
            r13 = 351969663(0x14faa17f, float:2.5307248E-26)
            r7.d0(r13)
            r13 = r14 & 6
            r0 = 2
            if (r13 != 0) goto L19
            boolean r13 = r7.f(r12)
            if (r13 == 0) goto L16
            r13 = 4
            goto L17
        L16:
            r13 = r0
        L17:
            r13 = r13 | r14
            goto L1a
        L19:
            r13 = r14
        L1a:
            r1 = r13 & 3
            r10 = 0
            r11 = 1
            if (r1 == r0) goto L22
            r0 = r11
            goto L23
        L22:
            r0 = r10
        L23:
            r13 = r13 & r11
            boolean r13 = r7.S(r13, r0)
            if (r13 == 0) goto L87
            r13 = 1098907648(0x41800000, float:16.0)
            a74 r13 = defpackage.ge7.O(r12, r13)
            e40 r0 = defpackage.d90.Z
            e34 r0 = defpackage.h70.d(r0, r10)
            long r1 = r7.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r7.l()
            a74 r13 = defpackage.l.E(r7, r13)
            ix0 r3 = defpackage.jx0.i
            r3.getClass()
            iy0 r3 = defpackage.ix0.b
            r7.f0()
            boolean r4 = r7.S
            if (r4 == 0) goto L56
            r7.k(r3)
            goto L59
        L56:
            r7.o0()
        L59:
            pn r3 = defpackage.ix0.f
            defpackage.yh2.K(r7, r3, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r7, r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            pn r1 = defpackage.ix0.g
            defpackage.yh2.K(r7, r1, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r7, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r7, r0, r13)
            r8 = 0
            r9 = 31
            r0 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            defpackage.e45.a(r0, r1, r3, r4, r6, r7, r8, r9)
            r7.p(r11)
            goto L8a
        L87:
            r7.V()
        L8a:
            cf5 r13 = r7.t()
            if (r13 == 0) goto L98
            f5 r0 = new f5
            r1 = 5
            r0.<init>(r12, r14, r1, r10)
            r13.d = r0
        L98:
            return
    }

    public static void i0(java.io.ByteArrayOutputStream r10, int r11, defpackage.ti1 r12) {
            int r0 = r12.g
            r1 = r11 & (-2)
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * r0
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r12 = r12.i
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L1b:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            r5 = 0
            r6 = r4
        L3e:
            r7 = 4
            if (r6 > r7) goto L1b
            if (r6 != r4) goto L46
        L43:
            int r6 = r6 << 1
            goto L3e
        L46:
            r7 = r6 & r11
            if (r7 != 0) goto L4b
            goto L43
        L4b:
            r7 = r6 & r2
            if (r7 != r6) goto L5e
            int r7 = r5 * r0
            int r7 = r7 + r3
            int r8 = r7 / 8
            r9 = r1[r8]
            int r7 = r7 % 8
            int r7 = r4 << r7
            r7 = r7 | r9
            byte r7 = (byte) r7
            r1[r8] = r7
        L5e:
            int r5 = r5 + 1
            goto L43
        L61:
            r10.write(r1)
            return
    }

    public static final void j(defpackage.pa1 r11, defpackage.on2 r12, defpackage.qn2 r13, defpackage.eo2 r14, defpackage.px0 r15, int r16) {
            r10 = r16
            r7 = r15
            xq2 r7 = (defpackage.xq2) r7
            r3 = -289244578(0xffffffffeec27a5e, float:-3.0094012E28)
            r7.d0(r3)
            r3 = r10 & 6
            if (r3 != 0) goto L1a
            boolean r3 = r7.f(r11)
            if (r3 == 0) goto L17
            r3 = 4
            goto L18
        L17:
            r3 = 2
        L18:
            r3 = r3 | r10
            goto L1b
        L1a:
            r3 = r10
        L1b:
            r4 = r10 & 48
            if (r4 != 0) goto L2b
            boolean r4 = r7.h(r12)
            if (r4 == 0) goto L28
            r4 = 32
            goto L2a
        L28:
            r4 = 16
        L2a:
            r3 = r3 | r4
        L2b:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L3b
            boolean r4 = r7.h(r13)
            if (r4 == 0) goto L38
            r4 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r4 = 128(0x80, float:1.8E-43)
        L3a:
            r3 = r3 | r4
        L3b:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L4b
            boolean r4 = r7.h(r14)
            if (r4 == 0) goto L48
            r4 = 2048(0x800, float:2.87E-42)
            goto L4a
        L48:
            r4 = 1024(0x400, float:1.435E-42)
        L4a:
            r3 = r3 | r4
        L4b:
            r4 = r3 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r6 = 0
            r8 = 1
            if (r4 == r5) goto L55
            r4 = r8
            goto L56
        L55:
            r4 = r6
        L56:
            r5 = r3 & 1
            boolean r4 = r7.S(r5, r4)
            if (r4 == 0) goto L8c
            r4 = 2131952613(0x7f1303e5, float:1.9541674E38)
            java.lang.String r4 = defpackage.yh2.O(r7, r4)
            qa1 r5 = new qa1
            r5.<init>(r11, r13, r14, r8)
            r8 = 2112373737(0x7de843e9, float:3.8591688E37)
            zv0 r5 = defpackage.n16.I(r8, r5, r7)
            j10 r8 = new j10
            r9 = 5
            r8.<init>(r12, r9, r6)
            r6 = 433906343(0x19dce2a7, float:2.2839011E-23)
            zv0 r6 = defpackage.n16.I(r6, r8, r7)
            r3 = r3 & 112(0x70, float:1.57E-43)
            r8 = r3 | 28032(0x6d80, float:3.9281E-41)
            r9 = 0
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = 0
            r3 = r12
            defpackage.q60.a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L8f
        L8c:
            r7.V()
        L8f:
            cf5 r7 = r7.t()
            if (r7 == 0) goto La2
            ra1 r0 = new ra1
            r6 = 2
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        La2:
            return
    }

    public static void j0(java.io.ByteArrayOutputStream r4, defpackage.ti1 r5) {
            java.util.TreeMap r5 = r5.i
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            defpackage.nw7.x0(r4, r1)
            defpackage.nw7.x0(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    public static boolean k(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static final defpackage.qa4 l(defpackage.le2 r7, defpackage.pp0 r8, defpackage.px0 r9, int r10) {
            l55 r0 = defpackage.zx3.a
            r1 = r9
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r0 = r1.j(r0)
            hu3 r0 = (defpackage.hu3) r0
            tt3 r4 = defpackage.tt3.STARTED
            ut3 r3 = r0.getLifecycle()
            r6 = r10 & 112(0x70, float:1.57E-43)
            r1 = r7
            r2 = r8
            r5 = r9
            qa4 r7 = m(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final defpackage.qa4 m(defpackage.le2 r9, java.lang.Object r10, defpackage.ut3 r11, defpackage.tt3 r12, defpackage.px0 r13, int r14) {
            vt1 r0 = defpackage.vt1.A
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r11, r12, r0}
            xq2 r13 = (defpackage.xq2) r13
            boolean r2 = r13.h(r11)
            r3 = r14 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 ^ 3072(0xc00, float:4.305E-42)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 <= r4) goto L1e
            int r3 = r12.ordinal()
            boolean r3 = r13.d(r3)
            if (r3 != 0) goto L22
        L1e:
            r14 = r14 & 3072(0xc00, float:4.305E-42)
            if (r14 != r4) goto L24
        L22:
            r14 = 1
            goto L25
        L24:
            r14 = 0
        L25:
            r14 = r14 | r2
            boolean r0 = r13.h(r0)
            r14 = r14 | r0
            boolean r0 = r13.h(r9)
            r14 = r14 | r0
            java.lang.Object r0 = r13.P()
            r6 = 0
            vs0 r8 = defpackage.ox0.a
            if (r14 != 0) goto L3b
            if (r0 != r8) goto L49
        L3b:
            l5 r2 = new l5
            r7 = 11
            r5 = r9
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r13.l0(r2)
            r0 = r2
        L49:
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r9 = r13.P()
            if (r9 != r8) goto L58
            vs4 r9 = defpackage.np2.Y(r10)
            r13.l0(r9)
        L58:
            qa4 r9 = (defpackage.qa4) r9
            r10 = 4
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r1, r10)
            boolean r11 = r13.h(r0)
            java.lang.Object r12 = r13.P()
            if (r11 != 0) goto L6b
            if (r12 != r8) goto L74
        L6b:
            km6 r12 = new km6
            r11 = 3
            r12.<init>(r0, r9, r6, r11)
            r13.l0(r12)
        L74:
            eo2 r12 = (defpackage.eo2) r12
            defpackage.mb3.k(r10, r12, r13)
            return r9
    }

    public static final defpackage.qa4 n(defpackage.rp6 r7, defpackage.px0 r8) {
            l55 r0 = defpackage.zx3.a
            r1 = r8
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r0 = r1.j(r0)
            hu3 r0 = (defpackage.hu3) r0
            tt3 r4 = defpackage.tt3.STARTED
            java.lang.Object r2 = r7.getValue()
            ut3 r3 = r0.getLifecycle()
            r6 = 0
            r1 = r7
            r5 = r8
            qa4 r7 = m(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final java.lang.Object o(defpackage.r41 r6, defpackage.ne2 r7, defpackage.on2 r8, defpackage.fo2 r9, defpackage.le2[] r10) {
            cu0 r0 = new cu0
            r1 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            pe2 r7 = new pe2
            l61 r8 = r6.b()
            r7.<init>(r6, r8)
            r6 = 1
            java.lang.Object r6 = defpackage.mp2.Z(r7, r6, r7, r0)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L1d
            return r6
        L1d:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static int p(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public static int q(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = -1
            return r0
        L6:
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 1
            return r0
    }

    public static byte[] r(defpackage.ti1[] r8, byte[] r9) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r8[r2]
            java.lang.String r5 = r4.a
            java.lang.String r6 = r4.b
            java.lang.String r5 = v(r5, r6, r9)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.e
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f
            int r6 = r6 + r5
            int r4 = r4.g
            int r4 = r4 * 2
            int r4 = r4 + 7
            r4 = r4 & (-8)
            int r4 = r4 / 8
            int r4 = r4 + r6
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L30:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = defpackage.f04.z
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 == 0) goto L53
            int r2 = r8.length
        L3e:
            if (r1 >= r2) goto L72
            r4 = r8[r1]
            java.lang.String r5 = r4.a
            java.lang.String r6 = r4.b
            java.lang.String r5 = v(r5, r6, r9)
            h0(r0, r4, r5)
            g0(r0, r4)
            int r1 = r1 + 1
            goto L3e
        L53:
            int r2 = r8.length
            r4 = r1
        L55:
            if (r4 >= r2) goto L67
            r5 = r8[r4]
            java.lang.String r6 = r5.a
            java.lang.String r7 = r5.b
            java.lang.String r6 = v(r6, r7, r9)
            h0(r0, r5, r6)
            int r4 = r4 + 1
            goto L55
        L67:
            int r9 = r8.length
        L68:
            if (r1 >= r9) goto L72
            r2 = r8[r1]
            g0(r0, r2)
            int r1 = r1 + 1
            goto L68
        L72:
            int r8 = r0.size()
            if (r8 != r3) goto L7d
            byte[] r8 = r0.toByteArray()
            return r8
        L7d:
            int r8 = r0.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "The bytes saved do not match expectation. actual="
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " expected="
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
    }

    public static long s(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r6 = java.lang.Math.min(r6, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r1) goto Le
            r7 = r1
            goto L12
        Le:
            int r7 = java.lang.Math.min(r7, r0)
        L12:
            if (r7 != r1) goto L16
            r2 = r6
            goto L17
        L16:
            r2 = r7
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r5 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r5)
        L3a:
            int r4 = java.lang.Math.min(r0, r4)
            long r4 = defpackage.s21.a(r4, r1, r6, r7)
            return r4
        L43:
            defpackage.s21.k(r2)
            defpackage.e41.c()
            r4 = 0
            return r4
    }

    public static long t(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r4, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto Le
            r5 = r1
            goto L12
        Le:
            int r5 = java.lang.Math.min(r5, r0)
        L12:
            if (r5 != r1) goto L16
            r2 = r4
            goto L17
        L16:
            r2 = r5
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r7 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r7)
        L3a:
            int r6 = java.lang.Math.min(r0, r6)
            long r4 = defpackage.s21.a(r4, r5, r6, r1)
            return r4
        L43:
            defpackage.s21.k(r2)
            defpackage.e41.c()
            r4 = 0
            return r4
    }

    public static final void u(java.lang.StringBuilder r1, java.lang.StringBuilder r2, int r3) {
            r0 = 10
            if (r3 >= r0) goto L9
            r0 = 48
            r1.append(r0)
        L9:
            r2.append(r3)
            return
    }

    public static java.lang.String v(java.lang.String r6, java.lang.String r7, byte[] r8) {
            byte[] r0 = defpackage.f04.A
            byte[] r1 = defpackage.f04.B
            boolean r2 = java.util.Arrays.equals(r8, r1)
            java.lang.String r3 = "!"
            java.lang.String r4 = ":"
            if (r2 == 0) goto Lf
            goto L15
        Lf:
            boolean r2 = java.util.Arrays.equals(r8, r0)
            if (r2 == 0) goto L17
        L15:
            r2 = r4
            goto L18
        L17:
            r2 = r3
        L18:
            int r5 = r6.length()
            if (r5 > 0) goto L34
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L29
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L29:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L80
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L34:
            java.lang.String r5 = "classes.dex"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L3d
            return r6
        L3d:
            boolean r5 = r7.contains(r3)
            if (r5 != 0) goto L6a
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L4a
            goto L6a
        L4a:
            java.lang.String r2 = ".apk"
            boolean r2 = r7.endsWith(r2)
            if (r2 == 0) goto L53
            goto L80
        L53:
            java.lang.StringBuilder r6 = defpackage.lb1.s(r6)
            boolean r1 = java.util.Arrays.equals(r8, r1)
            if (r1 == 0) goto L5e
            goto L64
        L5e:
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L65
        L64:
            r3 = r4
        L65:
            java.lang.String r6 = defpackage.i61.n(r6, r3, r7)
            return r6
        L6a:
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L75
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L75:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L80
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L80:
            return r7
    }

    public static final int w(android.graphics.Bitmap r4) {
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L3c
            int r4 = r4.getAllocationByteCount()     // Catch: java.lang.Exception -> Lb
            return r4
        Lb:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r1 = r1 * r0
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            if (r4 != r0) goto L1e
            r4 = 1
            goto L3a
        L1e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r2 = 2
            if (r4 != r0) goto L25
        L23:
            r4 = r2
            goto L3a
        L25:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            if (r4 != r0) goto L2a
            goto L23
        L2a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L39
            android.graphics.Bitmap$Config r0 = defpackage.k2.b()
            if (r4 != r0) goto L39
            r4 = 8
            goto L3a
        L39:
            r4 = 4
        L3a:
            int r1 = r1 * r4
            return r1
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot obtain size for recycled bitmap: "
            r0.<init>(r1)
            r0.append(r4)
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            java.lang.String r3 = " ["
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "] + "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final defpackage.e33 x() {
            e33 r0 = defpackage.nb3.v
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Delete"
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
            r2 = 1086324736(0x40c00000, float:6.0)
            r11 = 1100480512(0x41980000, float:19.0)
            r4.o(r2, r11)
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1090519040(0x41000000, float:8.0)
            r4.l(r5)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1088421888(0x40e00000, float:7.0)
            r4.t(r5)
            r4.k(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r4.u(r2)
            r4.g()
            r2 = 1082130432(0x40800000, float:4.0)
            r4.o(r11, r2)
            r5 = -1067450368(0xffffffffc0600000, float:-3.5)
            r4.l(r5)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.n(r5, r5)
            r6 = -1063256064(0xffffffffc0a00000, float:-5.0)
            r4.l(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.n(r5, r6)
            r5 = 1084227584(0x40a00000, float:5.0)
            r4.k(r5)
            r5 = 1073741824(0x40000000, float:2.0)
            r4.u(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            r4.l(r5)
            r4.t(r2)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.nb3.v = r0
            return r0
    }

    public static int y(byte[] r2, int r3) {
            r0 = r2[r3]
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static int z(int r5, boolean r6, int r7) {
            if (r6 == 0) goto L9
            int r0 = r7 - r5
            int r0 = r0 + 360
            int r0 = r0 % 360
            goto Ld
        L9:
            int r0 = r7 + r5
            int r0 = r0 % 360
        Ld:
            java.lang.String r1 = "CameraOrientationUtil"
            java.lang.String r2 = defpackage.kj2.c0(r1)
            r3 = 2
            boolean r2 = defpackage.kj2.J(r3, r2)
            if (r2 == 0) goto L36
            java.lang.String r2 = ", sourceRotationDegrees="
            java.lang.String r3 = ", isOppositeFacing="
            java.lang.String r4 = "getRelativeImageRotation: destRotationDegrees="
            java.lang.StringBuilder r5 = defpackage.i61.q(r5, r7, r4, r2, r3)
            r5.append(r6)
            java.lang.String r6 = ", result="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            defpackage.kj2.t(r1, r5)
        L36:
            return r0
    }
}
