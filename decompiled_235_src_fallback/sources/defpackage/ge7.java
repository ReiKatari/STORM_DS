package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge7  reason: default package */
/* loaded from: classes.dex */
public abstract class ge7 {
    public static final defpackage.du a = null;
    public static final defpackage.du b = null;
    public static final defpackage.zv0 c = null;
    public static final defpackage.zv0 d = null;
    public static final defpackage.zv0 e = null;
    public static final defpackage.zv0 f = null;
    public static final defpackage.zv0 g = null;
    public static final defpackage.zv0 h = null;
    public static final java.lang.Object i = null;
    public static final java.lang.Object j = null;
    public static defpackage.e33 k;
    public static final /* synthetic */ int l = 0;

    static {
            du r0 = new du
            r1 = 0
            r0.<init>(r1)
            defpackage.ge7.a = r0
            du r0 = new du
            r1 = 1
            r0.<init>(r1)
            defpackage.ge7.b = r0
            kw0 r0 = new kw0
            r1 = 19
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = 2071362912(0x7b767d60, float:1.2798479E36)
            r3 = 0
            r1.<init>(r2, r3, r0)
            defpackage.ge7.c = r1
            kw0 r0 = new kw0
            r1 = 20
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = 995300247(0x3b531397, float:0.0032207721)
            r1.<init>(r2, r3, r0)
            defpackage.ge7.d = r1
            iw0 r0 = new iw0
            r1 = 7
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = 2130912738(0x7f0325e2, float:1.7432557E38)
            r1.<init>(r2, r3, r0)
            defpackage.ge7.e = r1
            iw0 r0 = new iw0
            r1 = 8
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -111945959(0xfffffffff953d719, float:-6.8746083E34)
            r1.<init>(r2, r3, r0)
            defpackage.ge7.f = r1
            iw0 r0 = new iw0
            r1 = 9
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -887041510(0xffffffffcb20d21a, float:-1.0539546E7)
            r1.<init>(r2, r3, r0)
            defpackage.ge7.g = r1
            iw0 r0 = new iw0
            r1 = 10
            r0.<init>(r1)
            zv0 r1 = new zv0
            r2 = -1662137061(0xffffffff9cedcd1b, float:-1.5736363E-21)
            r1.<init>(r2, r3, r0)
            defpackage.ge7.h = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ge7.i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ge7.j = r0
            return
    }

    public static android.content.res.ColorStateList A(android.content.Context r8, int r9) {
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            rl5 r1 = new rl5
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.sl5.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.sl5.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            ql5 r5 = (defpackage.ql5) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.sl5.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.rt0.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.sl5.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.sl5.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            ql5 r0 = new ql5     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    public static final int B(defpackage.px0 r2) {
            r2.getClass()
            xq2 r2 = (defpackage.xq2) r2
            long r0 = r2.T
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public static final long C(defpackage.px0 r2) {
            xq2 r2 = (defpackage.xq2) r2
            long r0 = r2.T
            return r0
    }

    public static android.view.Display D(defpackage.jq r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            android.view.Display r2 = defpackage.q2.d(r2)
            return r2
        Lb:
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            return r2
    }

    public static final defpackage.bq6 E(defpackage.mm6 r1) {
            bq6 r0 = r1.A
            r0.getClass()
            hq6 r1 = defpackage.bm6.t(r0, r1)
            bq6 r1 = (defpackage.bq6) r1
            return r1
    }

    public static final int F(defpackage.mm6 r0) {
            bq6 r0 = r0.A
            r0.getClass()
            hq6 r0 = defpackage.bm6.h(r0)
            bq6 r0 = (defpackage.bq6) r0
            int r0 = r0.e
            return r0
    }

    public static defpackage.d53 G(defpackage.pq1 r0, defpackage.ck5 r1, int r2) {
            r2 = r2 & 2
            if (r2 == 0) goto L6
            ck5 r1 = defpackage.ck5.Restart
        L6:
            d53 r2 = new d53
            r2.<init>(r0, r1)
            return r2
    }

    public static boolean H(java.lang.String r1) {
            java.lang.String r0 = "Connection"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Keep-Alive"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authenticate"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "TE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Trailers"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Transfer-Encoding"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Upgrade"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L42
            r1 = 1
            return r1
        L42:
            r1 = 0
            return r1
    }

    public static boolean I(int r3, java.lang.Object r4) {
            boolean r0 = r4 instanceof defpackage.ao2
            r1 = 0
            if (r0 == 0) goto La9
            boolean r0 = r4 instanceof defpackage.oo2
            r2 = 1
            if (r0 == 0) goto L12
            oo2 r4 = (defpackage.oo2) r4
            int r4 = r4.d()
            goto La6
        L12:
            boolean r0 = r4 instanceof defpackage.on2
            if (r0 == 0) goto L19
            r4 = r1
            goto La6
        L19:
            boolean r0 = r4 instanceof defpackage.qn2
            if (r0 == 0) goto L20
            r4 = r2
            goto La6
        L20:
            boolean r0 = r4 instanceof defpackage.eo2
            if (r0 == 0) goto L27
            r4 = 2
            goto La6
        L27:
            boolean r0 = r4 instanceof defpackage.fo2
            if (r0 == 0) goto L2e
            r4 = 3
            goto La6
        L2e:
            boolean r0 = r4 instanceof defpackage.go2
            if (r0 == 0) goto L35
            r4 = 4
            goto La6
        L35:
            boolean r0 = r4 instanceof defpackage.ho2
            if (r0 == 0) goto L3c
            r4 = 5
            goto La6
        L3c:
            boolean r0 = r4 instanceof defpackage.io2
            if (r0 == 0) goto L43
            r4 = 6
            goto La6
        L43:
            boolean r0 = r4 instanceof defpackage.jo2
            if (r0 == 0) goto L4a
            r4 = 7
            goto La6
        L4a:
            boolean r0 = r4 instanceof defpackage.ko2
            if (r0 == 0) goto L51
            r4 = 8
            goto La6
        L51:
            boolean r0 = r4 instanceof defpackage.lo2
            if (r0 == 0) goto L58
            r4 = 9
            goto La6
        L58:
            boolean r0 = r4 instanceof defpackage.pn2
            if (r0 == 0) goto L5f
            r4 = 10
            goto La6
        L5f:
            boolean r0 = r4 instanceof defpackage.rn2
            if (r0 == 0) goto L66
            r4 = 11
            goto La6
        L66:
            boolean r0 = r4 instanceof defpackage.tn2
            if (r0 == 0) goto L6d
            r4 = 13
            goto La6
        L6d:
            boolean r0 = r4 instanceof defpackage.un2
            if (r0 == 0) goto L74
            r4 = 14
            goto La6
        L74:
            boolean r0 = r4 instanceof defpackage.vn2
            if (r0 == 0) goto L7b
            r4 = 15
            goto La6
        L7b:
            boolean r0 = r4 instanceof defpackage.wn2
            if (r0 == 0) goto L82
            r4 = 16
            goto La6
        L82:
            boolean r0 = r4 instanceof defpackage.xn2
            if (r0 == 0) goto L89
            r4 = 17
            goto La6
        L89:
            boolean r0 = r4 instanceof defpackage.yn2
            if (r0 == 0) goto L90
            r4 = 18
            goto La6
        L90:
            boolean r0 = r4 instanceof defpackage.zn2
            if (r0 == 0) goto L97
            r4 = 19
            goto La6
        L97:
            boolean r0 = r4 instanceof defpackage.bo2
            if (r0 == 0) goto L9e
            r4 = 20
            goto La6
        L9e:
            boolean r4 = r4 instanceof defpackage.co2
            if (r4 == 0) goto La5
            r4 = 21
            goto La6
        La5:
            r4 = -1
        La6:
            if (r4 != r3) goto La9
            return r2
        La9:
            return r1
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
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "m55xq"
            r2 = 1
            boolean r0 = defpackage.xs6.Z(r0, r1, r2)
            if (r0 == 0) goto L24
            return r2
        L24:
            r0 = 0
            return r0
    }

    public static final defpackage.ci3 K(defpackage.qn2 r2) {
            ci3 r0 = new ci3
            bi3 r1 = new bi3
            r1.<init>()
            r2.g(r1)
            r0.<init>(r1)
            return r0
    }

    public static final defpackage.a74 L(defpackage.a74 r1, defpackage.fo2 r2) {
            zl3 r0 = new zl3
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static final boolean M(defpackage.mm6 r7, defpackage.qn2 r8) {
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r7.A     // Catch: java.lang.Throwable -> L50
            r1.getClass()     // Catch: java.lang.Throwable -> L50
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L50
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L50
            int r2 = r1.d     // Catch: java.lang.Throwable -> L50
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            r1.getClass()
            jw4 r0 = r1.f()
            java.lang.Object r3 = r8.g(r0)
            h1 r0 = r0.c()
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L49
            bq6 r1 = r7.A
            r1.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L46
            hq6 r1 = defpackage.bm6.w(r1, r7, r5)     // Catch: java.lang.Throwable -> L46
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L46
            r6 = 1
            boolean r0 = o(r1, r2, r0, r6)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            defpackage.bm6.n(r5, r7)
            if (r0 == 0) goto L0
            goto L49
        L46:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L49:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r7 = r3.booleanValue()
            return r7
        L50:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public static final defpackage.a74 N(defpackage.a74 r1, defpackage.lq4 r2) {
            oq4 r0 = new oq4
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static final defpackage.a74 O(defpackage.a74 r1, float r2) {
            jq4 r0 = new jq4
            r0.<init>(r2, r2, r2, r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static final defpackage.a74 P(defpackage.a74 r1, float r2, float r3) {
            jq4 r0 = new jq4
            r0.<init>(r2, r3, r2, r3)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static defpackage.a74 Q(defpackage.a74 r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            a74 r2 = P(r2, r3, r4)
            return r2
    }

    public static final defpackage.a74 R(defpackage.a74 r1, float r2, float r3, float r4, float r5) {
            jq4 r0 = new jq4
            r0.<init>(r2, r3, r4, r5)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static defpackage.a74 S(defpackage.a74 r2, float r3, float r4, float r5, float r6, int r7) {
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r7 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r7 = r7 & 8
            if (r7 == 0) goto L15
            r6 = r1
        L15:
            a74 r2 = R(r2, r3, r4, r5, r6)
            return r2
    }

    public static final defpackage.vq2 T(defpackage.px0 r8) {
            r1 = r8
            xq2 r1 = (defpackage.xq2) r1
            r8 = 206(0xce, float:2.89E-43)
            km4 r0 = defpackage.tx0.e
            r1.Y(r8, r0)
            boolean r8 = r1.S
            if (r8 == 0) goto L13
            pk6 r8 = r1.I
            defpackage.pk6.z(r8)
        L13:
            java.lang.Object r8 = r1.H()
            boolean r0 = r8 instanceof defpackage.br2
            if (r0 == 0) goto L1e
            br2 r8 = (defpackage.br2) r8
            goto L1f
        L1e:
            r8 = 0
        L1f:
            if (r8 != 0) goto L3e
            np5 r8 = new np5
            uq2 r7 = new uq2
            vq2 r0 = new vq2
            long r2 = r1.T
            boolean r4 = r1.q
            boolean r5 = r1.C
            ey0 r6 = r1.h
            os0 r6 = r6.p0
            r0.<init>(r1, r2, r4, r5, r6)
            r7.<init>(r0)
            r0 = -1
            r8.<init>(r7, r0)
            r1.m0(r8)
        L3e:
            bj5 r8 = r8.a
            r8.getClass()
            uq2 r8 = (defpackage.uq2) r8
            vq2 r8 = r8.A
            xv4 r0 = r1.l()
            vs4 r2 = r8.f
            r2.setValue(r0)
            r0 = 0
            r1.p(r0)
            return r8
    }

    public static defpackage.io6 U(float r1, float r2, java.lang.Object r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            r1 = 1065353216(0x3f800000, float:1.0)
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Ld
            r2 = 1153138688(0x44bb8000, float:1500.0)
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            r3 = 0
        L12:
            io6 r4 = new io6
            r4.<init>(r1, r2, r3)
            return r4
    }

    public static boolean V() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Google"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.util.Set r1 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r0 = r1.contains(r0)
            return r0
    }

    public static boolean W() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L41
        L19:
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.util.Set r1 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.d
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.xs6.g0(r0, r3, r2)
            if (r3 == 0) goto L2d
            r0 = 1
            return r0
        L41:
            return r2
    }

    public static void X(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.String r0 = " cannot be cast to "
            java.lang.String r1 = defpackage.lb1.m(r1, r0, r2)
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<ge7> r1 = defpackage.ge7.class
            java.lang.String r1 = r1.getName()
            defpackage.nb3.V(r2, r1)
            throw r2
    }

    public static defpackage.sc7 Y(int r1, int r2, defpackage.hr1 r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            r1 = 300(0x12c, float:4.2E-43)
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Lb
            r2 = 0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            v71 r3 = defpackage.ir1.a
        L11:
            sc7 r4 = new sc7
            r4.<init>(r1, r2, r3)
            return r4
    }

    public static final void a(java.util.List r32, long r33, defpackage.qn2 r35, defpackage.px0 r36, int r37) {
            r1 = r32
            r11 = r33
            r3 = r35
            r1.getClass()
            r3.getClass()
            r7 = r36
            xq2 r7 = (defpackage.xq2) r7
            r0 = -1816202422(0xffffffff93bef34a, float:-4.8202645E-27)
            r7.d0(r0)
            boolean r0 = r7.h(r1)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r37 | r0
            boolean r2 = r7.e(r11)
            r14 = 32
            if (r2 == 0) goto L2b
            r2 = r14
            goto L2d
        L2b:
            r2 = 16
        L2d:
            r0 = r0 | r2
            boolean r2 = r7.h(r3)
            if (r2 == 0) goto L37
            r2 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r2 = 128(0x80, float:1.8E-43)
        L39:
            r0 = r0 | r2
            r2 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            if (r2 == r4) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = r5
        L44:
            r4 = r0 & 1
            boolean r2 = r7.S(r4, r2)
            if (r2 == 0) goto L32c
            nq6 r2 = defpackage.vt0.a
            java.lang.Object r4 = r7.j(r2)
            ut0 r4 = (defpackage.ut0) r4
            long r8 = r4.c()
            java.lang.Object r2 = r7.j(r2)
            ut0 r2 = (defpackage.ut0) r2
            long r10 = r2.i()
            boolean r2 = r7.f(r1)
            r12 = r0 & 112(0x70, float:1.57E-43)
            if (r12 != r14) goto L6c
            r4 = 1
            goto L6d
        L6c:
            r4 = r5
        L6d:
            r2 = r2 | r4
            java.lang.Object r4 = r7.P()
            vs0 r6 = defpackage.ox0.a
            if (r2 != 0) goto L78
            if (r4 != r6) goto L9f
        L78:
            java.util.Iterator r2 = r1.iterator()
            r4 = r5
        L7d:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L97
            java.lang.Object r16 = r2.next()
            r14 = r16
            c6 r14 = (defpackage.c6) r14
            long r13 = r14.a
            int r13 = (r13 > r33 ? 1 : (r13 == r33 ? 0 : -1))
            if (r13 != 0) goto L92
            goto L98
        L92:
            int r4 = r4 + 1
            r14 = 32
            goto L7d
        L97:
            r4 = -1
        L98:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.l0(r4)
        L9f:
            java.lang.Number r4 = (java.lang.Number) r4
            int r2 = r4.intValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r6) goto Laf
            r94 r4 = defpackage.i61.f(r7)
        Laf:
            r13 = r4
            r94 r13 = (defpackage.r94) r13
            r4 = 6
            qa4 r14 = defpackage.bw7.a(r13, r7, r4)
            java.lang.Object r4 = r14.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            r15 = 0
            r3 = 2
            ga7 r4 = defpackage.n16.N(r4, r15, r7, r5, r3)
            gx0 r3 = r4.a
            r19 = r4
            float r4 = (float) r2
            r20 = r8
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 22
            r22 = r5
            r5 = 0
            r23 = r6
            java.lang.String r6 = "Tab position"
            r25 = r20
            r20 = r10
            r11 = r22
            r10 = r23
            pp6 r9 = defpackage.in.b(r4, r5, r6, r7, r8, r9)
            wc7 r8 = defpackage.nw7.e0
            boolean r4 = r19.g()
            if (r4 != 0) goto L124
            r4 = 1666573488(0x6355e4b0, float:3.9456352E21)
            r7.b0(r4)
            r4 = r19
            boolean r5 = r7.f(r4)
            java.lang.Object r6 = r7.P()
            if (r5 != 0) goto L100
            if (r6 != r10) goto L11b
        L100:
            vl6 r5 = defpackage.ln2.t()
            if (r5 == 0) goto L10b
            qn2 r6 = r5.e()
            goto L10c
        L10b:
            r6 = r15
        L10c:
            vl6 r15 = defpackage.ln2.N(r5)
            java.lang.Object r3 = r3.f()     // Catch: java.lang.Throwable -> L11f
            defpackage.ln2.V(r5, r15, r6)
            r7.l0(r3)
            r6 = r3
        L11b:
            r7.p(r11)
            goto L133
        L11f:
            r0 = move-exception
            defpackage.ln2.V(r5, r15, r6)
            throw r0
        L124:
            r4 = r19
            r5 = 1666827533(0x6359c50d, float:4.0171425E21)
            r7.b0(r5)
            r7.p(r11)
            java.lang.Object r6 = r3.f()
        L133:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r3 = r6.booleanValue()
            r5 = 195499522(0xba71602, float:6.4359174E-32)
            r7.b0(r5)
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L145
            r3 = r15
            goto L147
        L145:
            r3 = 1061158912(0x3f400000, float:0.75)
        L147:
            r7.p(r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r22 = r7.f(r4)
            java.lang.Object r6 = r7.P()
            if (r22 != 0) goto L15a
            if (r6 != r10) goto L166
        L15a:
            k7 r6 = new k7
            r6.<init>(r4, r11)
            ii1 r6 = defpackage.np2.I(r6)
            r7.l0(r6)
        L166:
            pp6 r6 = (defpackage.pp6) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7.b0(r5)
            if (r6 == 0) goto L179
            r6 = r15
            goto L17b
        L179:
            r6 = 1061158912(0x3f400000, float:0.75)
        L17b:
            r7.p(r11)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            boolean r5 = r7.f(r4)
            java.lang.Object r15 = r7.P()
            if (r5 != 0) goto L192
            if (r15 != r10) goto L18f
            goto L192
        L18f:
            r5 = r15
            r15 = 1
            goto L19f
        L192:
            k7 r5 = new k7
            r15 = 1
            r5.<init>(r4, r15)
            ii1 r5 = defpackage.np2.I(r5)
            r7.l0(r5)
        L19f:
            pp6 r5 = (defpackage.pp6) r5
            java.lang.Object r5 = r5.getValue()
            aa7 r5 = (defpackage.aa7) r5
            r5 = -985243360(0xffffffffc5466120, float:-3174.0703)
            r7.b0(r5)
            r5 = 7
            r15 = 0
            r22 = r3
            r3 = 0
            io6 r5 = U(r15, r15, r3, r5)
            r7.p(r11)
            r23 = r10
            r10 = 0
            r29 = r9
            r27 = r20
            r15 = r23
            r3 = 1
            r9 = r7
            r7 = r5
            r5 = r22
            ca7 r10 = defpackage.n16.t(r4, r5, r6, r7, r8, r9, r10)
            r6 = r9
            java.lang.Object r4 = r6.P()
            if (r4 != r15) goto L1db
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            gn r4 = defpackage.nb3.b(r4)
            r6.l0(r4)
        L1db:
            r7 = r4
            gn r7 = (defpackage.gn) r7
            pr3 r8 = defpackage.qr3.a(r6)
            nq6 r4 = defpackage.ky0.n
            java.lang.Object r4 = r6.j(r4)
            r5 = r4
            kk3 r5 = (defpackage.kk3) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r9 = r6.f(r8)
            boolean r20 = r6.d(r2)
            r9 = r9 | r20
            boolean r20 = r6.h(r7)
            r9 = r9 | r20
            java.lang.Object r3 = r6.P()
            if (r9 != 0) goto L207
            if (r3 != r15) goto L210
        L207:
            m7 r3 = new m7
            r9 = 0
            r3.<init>(r8, r7, r2, r9)
            r6.l0(r3)
        L210:
            eo2 r3 = (defpackage.eo2) r3
            defpackage.mb3.i(r6, r3, r4)
            x64 r3 = defpackage.x64.a
            r4 = 1
            a74 r3 = defpackage.nw7.f0(r3, r11, r13, r4)
            r76 r9 = new r76
            r13 = 2
            r9.<init>(r13)
            a74 r9 = defpackage.ua6.a(r3, r11, r9)
            boolean r3 = r6.f(r14)
            int r13 = r5.ordinal()
            boolean r13 = r6.d(r13)
            r3 = r3 | r13
            boolean r13 = r6.h(r1)
            r3 = r3 | r13
            boolean r13 = r6.d(r2)
            r3 = r3 | r13
            r13 = r0 & 896(0x380, float:1.256E-42)
            r0 = 256(0x100, float:3.59E-43)
            if (r13 != r0) goto L245
            r0 = r4
            goto L246
        L245:
            r0 = r11
        L246:
            r0 = r0 | r3
            java.lang.Object r3 = r6.P()
            if (r0 != 0) goto L254
            if (r3 != r15) goto L250
            goto L254
        L250:
            r0 = r3
            r14 = r4
            r3 = r5
            goto L262
        L254:
            n7 r0 = new n7
            r3 = r14
            r14 = r4
            r4 = r3
            r3 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r3 = r5
            r6.l0(r0)
        L262:
            qn2 r0 = (defpackage.qn2) r0
            a74 r0 = defpackage.u24.B(r9, r0)
            r2 = 1098907648(0x41800000, float:16.0)
            r4 = 0
            a74 r0 = Q(r0, r4, r2, r14)
            boolean r4 = r6.f(r8)
            boolean r5 = r6.h(r1)
            r4 = r4 | r5
            int r5 = r3.ordinal()
            boolean r5 = r6.d(r5)
            r4 = r4 | r5
            r5 = r3
            r2 = r25
            boolean r9 = r6.e(r2)
            r4 = r4 | r9
            r9 = r29
            boolean r19 = r6.f(r9)
            r4 = r4 | r19
            boolean r19 = r6.h(r7)
            r4 = r4 | r19
            boolean r19 = r6.f(r10)
            r4 = r4 | r19
            r19 = r12
            r11 = r27
            boolean r20 = r6.e(r11)
            r4 = r4 | r20
            java.lang.Object r14 = r6.P()
            if (r4 != 0) goto L2af
            if (r14 != r15) goto L2b1
        L2af:
            r4 = r0
            goto L2b9
        L2b1:
            r2 = r14
            r14 = r0
            r0 = r2
            r12 = r6
            r2 = r8
            r11 = 1098907648(0x41800000, float:16.0)
            goto L2d6
        L2b9:
            g7 r0 = new g7
            r14 = r4
            r30 = r2
            r2 = r1
            r3 = r5
            r1 = r8
            r4 = r30
            r30 = r11
            r12 = r6
            r6 = r7
            r7 = r30
            r11 = 1098907648(0x41800000, float:16.0)
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10)
            r30 = r2
            r2 = r1
            r1 = r30
            r12.l0(r0)
        L2d6:
            qn2 r0 = (defpackage.qn2) r0
            a74 r0 = defpackage.q60.y(r14, r0)
            r3 = 2
            pq4 r3 = i(r3, r11)
            boolean r4 = r12.h(r1)
            r5 = r19
            r6 = 32
            if (r5 != r6) goto L2ed
            r10 = 1
            goto L2ee
        L2ed:
            r10 = 0
        L2ee:
            r4 = r4 | r10
            r5 = 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L2f5
            r10 = 1
            goto L2f6
        L2f5:
            r10 = 0
        L2f6:
            r4 = r4 | r10
            java.lang.Object r5 = r12.P()
            if (r4 != 0) goto L305
            if (r5 != r15) goto L300
            goto L305
        L300:
            r6 = r33
            r4 = r35
            goto L311
        L305:
            h7 r5 = new h7
            r6 = r33
            r4 = r35
            r5.<init>(r1, r6, r4)
            r12.l0(r5)
        L311:
            r21 = r5
            qn2 r21 = (defpackage.qn2) r21
            r23 = 24960(0x6180, float:3.4976E-41)
            r24 = 488(0x1e8, float:6.84E-43)
            d90 r16 = defpackage.ju.d
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r0
            r14 = r2
            r15 = r3
            r22 = r12
            defpackage.gi2.f(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L335
        L32c:
            r30 = r11
            r12 = r7
            r6 = r30
            r4 = r3
            r12.V()
        L335:
            cf5 r8 = r12.t()
            if (r8 == 0) goto L347
            i7 r0 = new i7
            r6 = 0
            r2 = r33
            r5 = r37
            r0.<init>(r1, r2, r4, r5, r6)
            r8.d = r0
        L347:
            return
    }

    public static final void b(boolean r16, defpackage.on2 r17, defpackage.px0 r18, int r19, int r20) {
            r0 = r17
            r1 = r19
            r2 = r20
            r7 = r18
            xq2 r7 = (defpackage.xq2) r7
            r3 = -361453782(0xffffffffea74a72a, float:-7.3941827E25)
            r7.d0(r3)
            r3 = r2 & 1
            r4 = 4
            if (r3 == 0) goto L1b
            r5 = r1 | 6
            r6 = r5
            r5 = r16
            goto L27
        L1b:
            r5 = r16
            boolean r6 = r7.g(r5)
            if (r6 == 0) goto L25
            r6 = r4
            goto L26
        L25:
            r6 = 2
        L26:
            r6 = r6 | r1
        L27:
            boolean r8 = r7.h(r0)
            r9 = 32
            if (r8 == 0) goto L31
            r8 = r9
            goto L33
        L31:
            r8 = 16
        L33:
            r6 = r6 | r8
            r8 = r6 & 19
            r10 = 18
            r11 = 0
            if (r8 == r10) goto L3d
            r8 = 1
            goto L3e
        L3d:
            r8 = r11
        L3e:
            r10 = r6 & 1
            boolean r8 = r7.S(r10, r8)
            if (r8 == 0) goto L14c
            if (r3 == 0) goto L4a
            r10 = 1
            goto L4b
        L4a:
            r10 = r5
        L4b:
            id4 r3 = defpackage.ay3.a(r7)
            if (r3 != 0) goto L5f
            r3 = 535274673(0x1fe7a4b1, float:9.8104764E-20)
            r7.b0(r3)
            jl4 r3 = defpackage.by3.a(r7)
        L5b:
            r7.p(r11)
            goto L66
        L5f:
            r5 = 535271790(0x1fe7996e, float:9.8086134E-20)
            r7.b0(r5)
            goto L5b
        L66:
            if (r3 == 0) goto L146
            boolean r5 = r7.f(r3)
            java.lang.Object r8 = r7.P()
            vs0 r13 = defpackage.ox0.a
            if (r5 != 0) goto L76
            if (r8 != r13) goto L9f
        L76:
            e00 r8 = new e00
            boolean r5 = r3 instanceof defpackage.id4
            r14 = 0
            if (r5 == 0) goto L81
            r5 = r3
            id4 r5 = (defpackage.id4) r5
            goto L82
        L81:
            r5 = r14
        L82:
            if (r5 == 0) goto L89
            eb r5 = r5.a()
            goto L8a
        L89:
            r5 = r14
        L8a:
            boolean r15 = r3 instanceof defpackage.jl4
            if (r15 == 0) goto L92
            r15 = r3
            jl4 r15 = (defpackage.jl4) r15
            goto L93
        L92:
            r15 = r14
        L93:
            if (r15 == 0) goto L99
            il4 r14 = r15.b()
        L99:
            r8.<init>(r5, r14)
            r7.l0(r8)
        L9f:
            r14 = r8
            e00 r14 = (defpackage.e00) r14
            long r11 = r7.T
            boolean r5 = r7.f(r14)
            boolean r15 = r7.e(r11)
            r5 = r5 | r15
            java.lang.Object r15 = r7.P()
            if (r5 != 0) goto Lb5
            if (r15 != r13) goto Lcb
        Lb5:
            pw0 r15 = new pw0
            f00 r5 = new f00
            r5.<init>(r11, r3)
            r15.<init>(r5)
            c5 r3 = new c5
            r5 = 17
            r3.<init>(r5)
            r15.c = r3
            r7.l0(r15)
        Lcb:
            pw0 r15 = (defpackage.pw0) r15
            r3 = -585307852(0xffffffffdd1ce934, float:-7.066641E17)
            r7.b0(r3)
            boolean r3 = r7.h(r15)
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != r9) goto Ldd
            r5 = 1
            goto Lde
        Ldd:
            r5 = 0
        Lde:
            r3 = r3 | r5
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto Le7
            if (r5 != r13) goto Lf1
        Le7:
            q6 r5 = new q6
            r3 = 8
            r5.<init>(r3, r15, r0)
            r7.l0(r5)
        Lf1:
            on2 r5 = (defpackage.on2) r5
            defpackage.mb3.n(r5, r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            boolean r5 = r7.h(r15)
            r6 = r6 & 14
            if (r6 != r4) goto L104
            r12 = 1
            goto L105
        L104:
            r12 = 0
        L105:
            r4 = r5 | r12
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto L10f
            if (r5 != r13) goto L118
        L10f:
            g00 r5 = new g00
            r4 = 0
            r5.<init>(r15, r10, r4)
            r7.l0(r5)
        L118:
            qn2 r5 = (defpackage.qn2) r5
            r8 = r6
            r6 = r5
            r5 = 0
            r4 = r15
            defpackage.xk2.b(r3, r4, r5, r6, r7, r8)
            boolean r3 = r7.h(r14)
            boolean r5 = r7.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L132
            if (r5 != r13) goto L13b
        L132:
            y r5 = new y
            r3 = 3
            r5.<init>(r3, r14, r4)
            r7.l0(r5)
        L13b:
            qn2 r5 = (defpackage.qn2) r5
            defpackage.mb3.e(r14, r4, r5, r7)
            r4 = 0
            r7.p(r4)
            r5 = r10
            goto L14f
        L146:
            java.lang.String r0 = "No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two."
            defpackage.i.m(r0)
            return
        L14c:
            r7.V()
        L14f:
            cf5 r3 = r7.t()
            if (r3 == 0) goto L15c
            h00 r4 = new h00
            r4.<init>(r5, r0, r1, r2)
            r3.d = r4
        L15c:
            return
    }

    public static final defpackage.wd c(defpackage.zh r2) {
            android.graphics.Canvas r0 = defpackage.xd.a
            wd r0 = new wd
            r0.<init>()
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = defpackage.l.h(r2)
            r1.<init>(r2)
            r0.a = r1
            return r0
    }

    public static final void d(defpackage.a74 r33, defpackage.co0 r34, defpackage.on2 r35, defpackage.px0 r36, int r37) {
            r2 = r34
            r3 = r35
            r33.getClass()
            r2.getClass()
            me.magnum.melonds.domain.model.Cheat r0 = r2.a
            r3.getClass()
            r1 = r36
            xq2 r1 = (defpackage.xq2) r1
            r4 = 1315035595(0x4e61d9cb, float:9.472867E8)
            r1.d0(r4)
            boolean r4 = r1.f(r2)
            if (r4 == 0) goto L22
            r4 = 32
            goto L24
        L22:
            r4 = 16
        L24:
            r4 = r37 | r4
            boolean r5 = r1.h(r3)
            if (r5 == 0) goto L2f
            r5 = 256(0x100, float:3.59E-43)
            goto L31
        L2f:
            r5 = 128(0x80, float:1.8E-43)
        L31:
            r12 = r4 | r5
            r4 = r12 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r14 = 1
            if (r4 == r5) goto L3c
            r4 = r14
            goto L3d
        L3c:
            r4 = 0
        L3d:
            r5 = r12 & 1
            boolean r4 = r1.S(r5, r4)
            if (r4 == 0) goto L293
            es7 r15 = defpackage.bl2.F(r1)
            java.lang.Object r4 = r1.P()
            vs0 r10 = defpackage.ox0.a
            if (r4 != r10) goto L55
            r94 r4 = defpackage.i61.f(r1)
        L55:
            r94 r4 = (defpackage.r94) r4
            r5 = 6
            qa4 r6 = defpackage.bw7.a(r4, r1, r5)
            r7 = 1095761920(0x41500000, float:13.0)
            y16 r8 = defpackage.z16.b(r7)
            r9 = r33
            a74 r5 = defpackage.u24.g(r9, r8)
            java.lang.Object r16 = r6.getValue()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            if (r16 == 0) goto L79
            r17 = r12
            long r11 = r15.e
            goto L7d
        L79:
            r17 = r12
            long r11 = r15.d
        L7d:
            jy2 r7 = defpackage.u24.m
            a74 r5 = defpackage.vy7.L(r5, r11, r7)
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L97
            r6 = 1073741824(0x40000000, float:2.0)
            long r11 = r15.j
            a74 r5 = defpackage.ak7.I(r5, r6, r11, r8)
        L97:
            r7 = 0
            r9 = 28
            r3 = r5
            r5 = 0
            r6 = 0
            r8 = r35
            r11 = 6
            r12 = 1095761920(0x41500000, float:13.0)
            a74 r3 = defpackage.mb3.t(r3, r4, r5, r6, r7, r8, r9)
            r4 = 1096810496(0x41600000, float:14.0)
            r5 = 1093664768(0x41300000, float:11.0)
            a74 r3 = R(r3, r4, r5, r4, r5)
            d40 r4 = defpackage.d90.i0
            du r5 = defpackage.ju.a
            r6 = 48
            l26 r5 = defpackage.k26.a(r5, r4, r1, r6)
            long r6 = r1.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r1.l()
            a74 r3 = defpackage.l.E(r1, r3)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r1.f0()
            boolean r9 = r1.S
            if (r9 == 0) goto Ld8
            r1.k(r8)
            goto Ldb
        Ld8:
            r1.o0()
        Ldb:
            pn r9 = defpackage.ix0.f
            defpackage.yh2.K(r1, r9, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r1, r5, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            pn r7 = defpackage.ix0.g
            defpackage.yh2.K(r1, r7, r6)
            ne r6 = defpackage.ix0.h
            defpackage.yh2.F(r1, r6)
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r1, r13, r3)
            vn3 r3 = new vn3
            r12 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r12, r14)
            gu r12 = new gu
            i r11 = new i
            r11.<init>(r14)
            r26 = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r12.<init>(r0, r14, r11)
            c40 r0 = defpackage.d90.k0
            r11 = 6
            yt0 r0 = defpackage.wt0.a(r12, r0, r1, r11)
            long r11 = r1.T
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r1.l()
            a74 r3 = defpackage.l.E(r1, r3)
            r1.f0()
            boolean r14 = r1.S
            if (r14 == 0) goto L12d
            r1.k(r8)
            goto L130
        L12d:
            r1.o0()
        L130:
            defpackage.yh2.K(r1, r9, r0)
            defpackage.yh2.K(r1, r5, r12)
            defpackage.i61.w(r11, r1, r7, r1, r6)
            defpackage.yh2.K(r1, r13, r3)
            gu r0 = new gu
            i r3 = new i
            r11 = 1
            r3.<init>(r11)
            r12 = 1086324736(0x40c00000, float:6.0)
            r0.<init>(r12, r11, r3)
            r3 = 54
            l26 r0 = defpackage.k26.a(r0, r4, r1, r3)
            long r3 = r1.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r1.l()
            x64 r12 = defpackage.x64.a
            a74 r14 = defpackage.l.E(r1, r12)
            r1.f0()
            boolean r11 = r1.S
            if (r11 == 0) goto L16a
            r1.k(r8)
            goto L16d
        L16a:
            r1.o0()
        L16d:
            defpackage.yh2.K(r1, r9, r0)
            defpackage.yh2.K(r1, r5, r4)
            defpackage.i61.w(r3, r1, r7, r1, r6)
            defpackage.yh2.K(r1, r13, r14)
            r0 = 1095761920(0x41500000, float:13.0)
            a74 r5 = defpackage.dj6.i(r12, r0)
            e33 r3 = defpackage.hi2.A()
            long r6 = r15.i
            r9 = 432(0x1b0, float:6.05E-43)
            r0 = r10
            r10 = 0
            r4 = 0
            r8 = r1
            r1 = r0
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r22 = r8
            java.lang.String r3 = r2.b
            long r5 = r15.i
            sr2 r10 = defpackage.qs7.c
            r4 = 9
            long r7 = defpackage.hi2.E(r4)
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 120754(0x1d7b2, float:1.69212E-40)
            r4 = 0
            r9 = 0
            r13 = r12
            r11 = 0
            r14 = r13
            r13 = 0
            r20 = r14
            r18 = r15
            r14 = 0
            r21 = 256(0x100, float:3.59E-43)
            r16 = 2
            r23 = r17
            r17 = 0
            r27 = r18
            r18 = 1
            r28 = 1
            r19 = 0
            r29 = r20
            r20 = 0
            r30 = r21
            r21 = 0
            r31 = r23
            r23 = 1575936(0x180c00, float:2.208357E-39)
            r2 = r27
            r0 = r28
            r32 = r31
            r27 = r1
            r1 = r29
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r22
            r7.p(r0)
            java.lang.String r3 = r26.getName()
            long r5 = r2.g
            r8 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r8 = defpackage.hi2.D(r8)
            r7 = r8
            oj2 r9 = defpackage.oj2.Z
            r25 = 120786(0x1d7d2, float:1.69257E-40)
            r10 = 0
            r23 = 199680(0x30c00, float:2.79811E-40)
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r22
            java.lang.String r3 = r26.getDescription()
            if (r3 == 0) goto L247
            boolean r3 = defpackage.qs6.v0(r3)
            r3 = r3 ^ r0
            if (r3 != r0) goto L247
            r3 = 1071540310(0x3fde6856, float:1.7375591)
            r7.b0(r3)
            java.lang.String r3 = r26.getDescription()
            r3.getClass()
            long r5 = r2.i
            r8 = 4622663542519103488(0x4027000000000000, double:11.5)
            long r8 = defpackage.hi2.D(r8)
            r2 = 15
            long r14 = defpackage.hi2.E(r2)
            r24 = 3126(0xc36, float:4.38E-42)
            r25 = 119794(0x1d3f2, float:1.67867E-40)
            r4 = 0
            r22 = r7
            r7 = r8
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r16 = 2
            r17 = 0
            r18 = 2
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r22
            r2 = 0
            r7.p(r2)
            goto L251
        L247:
            r2 = 0
            r3 = 1071837693(0x3fe2f1fd, float:1.7730099)
            r7.b0(r3)
            r7.p(r2)
        L251:
            r7.p(r0)
            r3 = 1092616192(0x41200000, float:10.0)
            a74 r1 = defpackage.dj6.l(r1, r3)
            defpackage.gi2.h(r7, r1)
            boolean r3 = r26.getEnabled()
            r1 = r32
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r1 != r4) goto L26b
            r13 = r0
            goto L26c
        L26b:
            r13 = r2
        L26c:
            java.lang.Object r1 = r7.P()
            if (r13 != 0) goto L27a
            r2 = r27
            if (r1 != r2) goto L277
            goto L27a
        L277:
            r2 = r35
            goto L284
        L27a:
            mn0 r1 = new mn0
            r2 = r35
            r1.<init>(r0, r2)
            r7.l0(r1)
        L284:
            r4 = r1
            qn2 r4 = (defpackage.qn2) r4
            r8 = 0
            r9 = 12
            r5 = 0
            r6 = 0
            defpackage.is7.f(r3, r4, r5, r6, r7, r8, r9)
            r7.p(r0)
            goto L298
        L293:
            r7 = r1
            r2 = r3
            r7.V()
        L298:
            cf5 r6 = r7.t()
            if (r6 == 0) goto L2ae
            x3 r0 = new x3
            r5 = 8
            r1 = r33
            r4 = r37
            r3 = r2
            r2 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L2ae:
            return
    }

    public static final void e(defpackage.a74 r39, me.magnum.melonds.domain.model.DSiWareTitle r40, defpackage.on2 r41, defpackage.on2 r42, defpackage.qn2 r43, defpackage.qn2 r44, defpackage.on2 r45, defpackage.px0 r46, int r47) {
            r0 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r39.getClass()
            r0.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r45.getClass()
            r7 = r46
            xq2 r7 = (defpackage.xq2) r7
            r1 = 763148317(0x2d7cb81d, float:1.4365423E-11)
            r7.d0(r1)
            boolean r1 = r7.h(r0)
            if (r1 == 0) goto L32
            r1 = 32
            goto L34
        L32:
            r1 = 16
        L34:
            r1 = r47 | r1
            boolean r2 = r7.h(r9)
            if (r2 == 0) goto L3f
            r2 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r2 = 128(0x80, float:1.8E-43)
        L41:
            r1 = r1 | r2
            boolean r2 = r7.h(r10)
            if (r2 == 0) goto L4b
            r2 = 2048(0x800, float:2.87E-42)
            goto L4d
        L4b:
            r2 = 1024(0x400, float:1.435E-42)
        L4d:
            r1 = r1 | r2
            boolean r2 = r7.h(r11)
            if (r2 == 0) goto L57
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L59
        L57:
            r2 = 8192(0x2000, float:1.148E-41)
        L59:
            r1 = r1 | r2
            boolean r2 = r7.h(r12)
            if (r2 == 0) goto L63
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L65
        L63:
            r2 = 65536(0x10000, float:9.1835E-41)
        L65:
            r1 = r1 | r2
            r2 = r45
            boolean r3 = r7.h(r2)
            if (r3 == 0) goto L71
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L73
        L71:
            r3 = 524288(0x80000, float:7.34684E-40)
        L73:
            r1 = r1 | r3
            r3 = 599187(0x92493, float:8.3964E-40)
            r3 = r3 & r1
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r3 == r4) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r4 = r1 & 1
            boolean r3 = r7.S(r4, r3)
            if (r3 == 0) goto L3eb
            es7 r3 = defpackage.bl2.F(r7)
            boolean r4 = r7.f(r0)
            java.lang.Object r8 = r7.P()
            vs0 r14 = defpackage.ox0.a
            if (r4 != 0) goto L9a
            if (r8 != r14) goto La3
        L9a:
            i91 r4 = defpackage.i91.NONE
            vs4 r8 = defpackage.np2.Y(r4)
            r7.l0(r8)
        La3:
            qa4 r8 = (defpackage.qa4) r8
            r4 = 1082130432(0x40800000, float:4.0)
            r13 = 1094713344(0x41400000, float:12.0)
            r6 = r39
            a74 r4 = P(r6, r13, r4)
            r15 = 1092616192(0x41200000, float:10.0)
            y16 r13 = defpackage.z16.b(r15)
            a74 r4 = defpackage.u24.g(r4, r13)
            long r5 = r3.c
            jy2 r13 = defpackage.u24.m
            a74 r4 = defpackage.vy7.L(r4, r5, r13)
            long r5 = r3.f
            r22 = r15
            y16 r15 = defpackage.z16.b(r22)
            r0 = 1065353216(0x3f800000, float:1.0)
            a74 r4 = defpackage.ak7.I(r4, r0, r5, r15)
            r5 = 1086324736(0x40c00000, float:6.0)
            r6 = 1091567616(0x41100000, float:9.0)
            r15 = r22
            a74 r4 = R(r4, r15, r6, r5, r6)
            d40 r5 = defpackage.d90.i0
            du r6 = defpackage.ju.a
            r15 = 48
            l26 r5 = defpackage.k26.a(r6, r5, r7, r15)
            r6 = r1
            long r0 = r7.T
            int r0 = java.lang.Long.hashCode(r0)
            xv4 r1 = r7.l()
            a74 r4 = defpackage.l.E(r7, r4)
            ix0 r22 = defpackage.jx0.i
            r22.getClass()
            r22 = r6
            iy0 r6 = defpackage.ix0.b
            r7.f0()
            boolean r15 = r7.S
            if (r15 == 0) goto L106
            r7.k(r6)
            goto L109
        L106:
            r7.o0()
        L109:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r7, r15, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r7, r5, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            pn r1 = defpackage.ix0.g
            defpackage.yh2.K(r7, r1, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r7, r0)
            pn r12 = defpackage.ix0.d
            defpackage.yh2.K(r7, r12, r4)
            long r9 = r40.getTitleId()
            boolean r4 = r7.e(r9)
            java.lang.Object r9 = r7.P()
            if (r4 != 0) goto L136
            if (r9 != r14) goto L140
        L136:
            java.lang.Object r4 = r2.c()
            r9 = r4
            ix5 r9 = (defpackage.ix5) r9
            r7.l0(r9)
        L140:
            ix5 r9 = (defpackage.ix5) r9
            r4 = 1110966272(0x42380000, float:46.0)
            x64 r10 = defpackage.x64.a
            a74 r4 = defpackage.dj6.i(r10, r4)
            r24 = 1090519040(0x41000000, float:8.0)
            y16 r2 = defpackage.z16.b(r24)
            a74 r2 = defpackage.u24.g(r4, r2)
            r36 = r10
            long r10 = r3.d
            a74 r2 = defpackage.vy7.L(r2, r10, r13)
            e40 r4 = defpackage.d90.L
            r13 = 0
            e34 r4 = defpackage.h70.d(r4, r13)
            long r10 = r7.T
            int r10 = java.lang.Long.hashCode(r10)
            xv4 r11 = r7.l()
            a74 r2 = defpackage.l.E(r7, r2)
            r7.f0()
            boolean r13 = r7.S
            if (r13 == 0) goto L17c
            r7.k(r6)
            goto L17f
        L17c:
            r7.o0()
        L17f:
            defpackage.yh2.K(r7, r15, r4)
            defpackage.yh2.K(r7, r5, r11)
            defpackage.i61.w(r10, r7, r1, r7, r0)
            defpackage.yh2.K(r7, r12, r2)
            lc2 r2 = defpackage.dj6.c
            android.graphics.Bitmap r4 = r9.a
            if (r4 == 0) goto L19a
            zh r10 = new zh
            r10.<init>(r4)
            r4 = r10
            r10 = 1
            r13 = 0
            goto L1a2
        L19a:
            r4 = 28
            r10 = 1
            r13 = 0
            zh r4 = defpackage.uj2.d(r10, r10, r13, r4)
        L1a2:
            jx5 r9 = r9.b
            int[] r11 = defpackage.o91.a
            int r9 = r9.ordinal()
            r9 = r11[r9]
            if (r9 == r10) goto L1b9
            r11 = 2
            if (r9 != r11) goto L1b5
            r21 = r10
        L1b3:
            r9 = r5
            goto L1bc
        L1b5:
            defpackage.i.d()
            return
        L1b9:
            r21 = r13
            goto L1b3
        L1bc:
            r5 = 432(0x1b0, float:6.05E-43)
            r11 = r6
            r6 = 120(0x78, float:1.68E-43)
            r13 = r9
            r9 = r10
            r18 = r14
            r10 = r22
            r14 = r1
            r1 = r4
            r4 = r7
            r7 = r3
            r3 = r21
            defpackage.bl2.c(r1, r2, r3, r4, r5, r6)
            r4.p(r9)
            r2 = r36
            r1 = 1094713344(0x41400000, float:12.0)
            a74 r1 = defpackage.dj6.l(r2, r1)
            defpackage.gi2.h(r4, r1)
            vn3 r1 = new vn3
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3, r9)
            eu r3 = defpackage.ju.c
            c40 r5 = defpackage.d90.k0
            r6 = 0
            yt0 r3 = defpackage.wt0.a(r3, r5, r4, r6)
            long r5 = r4.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r4.l()
            a74 r1 = defpackage.l.E(r4, r1)
            r4.f0()
            boolean r9 = r4.S
            if (r9 == 0) goto L207
            r4.k(r11)
            goto L20a
        L207:
            r4.o0()
        L20a:
            defpackage.yh2.K(r4, r15, r3)
            defpackage.yh2.K(r4, r13, r6)
            defpackage.i61.w(r5, r4, r14, r4, r0)
            defpackage.yh2.K(r4, r12, r1)
            r9 = r13
            java.lang.String r13 = r40.getName()
            long r5 = r7.g
            pi2 r20 = defpackage.qs7.a
            r1 = 15
            r21 = r18
            r3 = 2048(0x800, float:2.87E-42)
            long r17 = defpackage.hi2.E(r1)
            r22 = 19
            long r24 = defpackage.hi2.E(r22)
            r22 = 131072(0x20000, float:1.83671E-40)
            oj2 r19 = defpackage.oj2.d0
            r34 = 3126(0xc36, float:4.38E-42)
            r35 = 119698(0x1d392, float:1.67733E-40)
            r23 = r14
            r14 = 0
            r27 = r21
            r26 = r22
            r21 = 0
            r28 = r23
            r23 = 0
            r29 = r26
            r26 = 2
            r30 = r27
            r27 = 0
            r31 = r28
            r28 = 1
            r32 = r29
            r29 = 0
            r33 = r30
            r30 = 0
            r37 = r31
            r31 = 0
            r38 = r33
            r33 = 1772544(0x1b0c00, float:2.483863E-39)
            r3 = r15
            r1 = r38
            r15 = r5
            r5 = r32
            r6 = 16384(0x4000, float:2.2959E-41)
            r32 = r4
            r4 = r37
            defpackage.x37.b(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.String r13 = r40.getProducer()
            long r14 = r7.i
            sr2 r20 = defpackage.qs7.c
            r16 = 11
            long r17 = defpackage.hi2.E(r16)
            r38 = 14
            long r24 = defpackage.hi2.E(r38)
            r35 = 119730(0x1d3b2, float:1.67777E-40)
            r15 = r14
            r14 = 0
            r19 = 0
            r33 = 1575936(0x180c00, float:2.208357E-39)
            defpackage.x37.b(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r13 = r32
            r14 = 1
            r13.p(r14)
            r14 = 1108869120(0x42180000, float:38.0)
            a74 r14 = defpackage.dj6.i(r2, r14)
            y16 r15 = defpackage.z16.a
            a74 r14 = defpackage.u24.g(r14, r15)
            boolean r15 = r13.f(r8)
            java.lang.Object r5 = r13.P()
            if (r15 != 0) goto L2b0
            if (r5 != r1) goto L2ba
        L2b0:
            f4 r5 = new f4
            r15 = 17
            r5.<init>(r8, r15)
            r13.l0(r5)
        L2ba:
            on2 r5 = (defpackage.on2) r5
            r15 = 0
            r18 = r1
            r1 = 0
            r6 = 15
            a74 r5 = defpackage.mb3.u(r14, r1, r15, r5, r6)
            e40 r6 = defpackage.d90.Z
            e34 r6 = defpackage.h70.d(r6, r1)
            long r14 = r13.T
            int r1 = java.lang.Long.hashCode(r14)
            xv4 r14 = r13.l()
            a74 r5 = defpackage.l.E(r13, r5)
            r13.f0()
            boolean r15 = r13.S
            if (r15 == 0) goto L2e5
            r13.k(r11)
            goto L2e8
        L2e5:
            r13.o0()
        L2e8:
            defpackage.yh2.K(r13, r3, r6)
            defpackage.yh2.K(r13, r9, r14)
            defpackage.i61.w(r1, r13, r4, r13, r0)
            defpackage.yh2.K(r13, r12, r5)
            r0 = 1102053376(0x41b00000, float:22.0)
            a74 r3 = defpackage.dj6.i(r2, r0)
            r0 = 2131230964(0x7f0800f4, float:1.8077996E38)
            sr4 r1 = defpackage.kj2.R(r13, r0)
            r0 = 2131951851(0x7f1300eb, float:1.9540128E38)
            java.lang.String r2 = defpackage.yh2.O(r13, r0)
            long r4 = r7.i
            r7 = 392(0x188, float:5.5E-43)
            r0 = r8
            r8 = 0
            r6 = r13
            r13 = r18
            r9 = 131072(0x20000, float:1.83671E-40)
            r11 = 16384(0x4000, float:2.2959E-41)
            r12 = 256(0x100, float:3.59E-43)
            defpackage.i13.b(r1, r2, r3, r4, r6, r7, r8)
            r4 = r6
            r14 = 1
            r4.p(r14)
            r4.p(r14)
            java.lang.Object r1 = r0.getValue()
            i91 r1 = (defpackage.i91) r1
            boolean r2 = r4.f(r0)
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L334
            if (r3 != r13) goto L33e
        L334:
            j4 r3 = new j4
            r2 = 8
            r3.<init>(r0, r2)
            r4.l0(r3)
        L33e:
            r2 = r3
            qn2 r2 = (defpackage.qn2) r2
            boolean r3 = r4.f(r0)
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != r6) goto L34d
            r5 = 1
            goto L34e
        L34d:
            r5 = 0
        L34e:
            r3 = r3 | r5
            java.lang.Object r5 = r4.P()
            if (r3 != 0) goto L35b
            if (r5 != r13) goto L358
            goto L35b
        L358:
            r14 = r42
            goto L366
        L35b:
            s00 r5 = new s00
            r3 = 6
            r14 = r42
            r5.<init>(r14, r0, r3)
            r4.l0(r5)
        L366:
            r3 = r5
            on2 r3 = (defpackage.on2) r3
            boolean r5 = r4.f(r0)
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != r12) goto L373
            r6 = 1
            goto L374
        L373:
            r6 = 0
        L374:
            r5 = r5 | r6
            java.lang.Object r6 = r4.P()
            if (r5 != 0) goto L381
            if (r6 != r13) goto L37e
            goto L381
        L37e:
            r12 = r41
            goto L38c
        L381:
            s00 r6 = new s00
            r5 = 7
            r12 = r41
            r6.<init>(r12, r0, r5)
            r4.l0(r6)
        L38c:
            on2 r6 = (defpackage.on2) r6
            boolean r5 = r4.f(r0)
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r10
            if (r7 != r11) goto L39a
            r7 = 1
            goto L39b
        L39a:
            r7 = 0
        L39b:
            r5 = r5 | r7
            java.lang.Object r7 = r4.P()
            if (r5 != 0) goto L3a9
            if (r7 != r13) goto L3a5
            goto L3a9
        L3a5:
            r11 = r43
            r5 = 0
            goto L3b4
        L3a9:
            l91 r7 = new l91
            r11 = r43
            r5 = 0
            r7.<init>(r11, r0, r5)
            r4.l0(r7)
        L3b4:
            qn2 r7 = (defpackage.qn2) r7
            boolean r8 = r4.f(r0)
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != r9) goto L3c0
            r5 = 1
        L3c0:
            r5 = r5 | r8
            java.lang.Object r8 = r4.P()
            if (r5 != 0) goto L3cd
            if (r8 != r13) goto L3ca
            goto L3cd
        L3ca:
            r9 = r44
            goto L3d8
        L3cd:
            l91 r8 = new l91
            r9 = r44
            r5 = 1
            r8.<init>(r9, r0, r5)
            r4.l0(r8)
        L3d8:
            qn2 r8 = (defpackage.qn2) r8
            int r0 = r10 >> 3
            r0 = r0 & 14
            r5 = r7
            r7 = r4
            r4 = r6
            r6 = r8
            r8 = r0
            r0 = r40
            g(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r32 = r7
            goto L3f4
        L3eb:
            r14 = r12
            r12 = r9
            r9 = r14
            r32 = r7
            r14 = r10
            r32.V()
        L3f4:
            cf5 r10 = r32.t()
            if (r10 == 0) goto L40f
            fo0 r0 = new fo0
            r9 = 2
            r1 = r39
            r2 = r40
            r6 = r44
            r7 = r45
            r8 = r47
            r5 = r11
            r3 = r12
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d = r0
        L40f:
            return
    }

    public static final void f(defpackage.bb1 r11, boolean r12, defpackage.on2 r13, defpackage.px0 r14, int r15) {
            r4 = r14
            xq2 r4 = (defpackage.xq2) r4
            r0 = -1003493178(0xffffffffc42fe8c6, float:-703.6371)
            r4.d0(r0)
            boolean r0 = r4.g(r12)
            if (r0 == 0) goto L12
            r0 = 32
            goto L14
        L12:
            r0 = 16
        L14:
            r0 = r0 | r15
            boolean r2 = r4.h(r13)
            if (r2 == 0) goto L1e
            r2 = 256(0x100, float:3.59E-43)
            goto L20
        L1e:
            r2 = 128(0x80, float:1.8E-43)
        L20:
            r0 = r0 | r2
            r2 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 == r5) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            r5 = r0 & 1
            boolean r2 = r4.S(r5, r2)
            if (r2 == 0) goto L46
            r2 = r0
            java.lang.String r0 = r11.getFileName()
            r5 = r2 & 112(0x70, float:1.57E-43)
            int r2 = r2 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r2
            r6 = 4
            r2 = 0
            r1 = r12
            r3 = r13
            defpackage.mb3.c(r0, r1, r2, r3, r4, r5, r6)
            goto L49
        L46:
            r4.V()
        L49:
            cf5 r0 = r4.t()
            if (r0 == 0) goto L5b
            k91 r5 = new k91
            r10 = 0
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.d = r5
        L5b:
            return
    }

    public static final void g(me.magnum.melonds.domain.model.DSiWareTitle r16, defpackage.i91 r17, defpackage.qn2 r18, defpackage.on2 r19, defpackage.on2 r20, defpackage.qn2 r21, defpackage.qn2 r22, defpackage.px0 r23, int r24) {
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r24
            r0 = r23
            xq2 r0 = (defpackage.xq2) r0
            r2 = -1163182073(0xffffffffbaab4007, float:-0.0013065346)
            r0.d0(r2)
            r2 = r8 & 6
            r9 = 2
            r10 = 4
            if (r2 != 0) goto L29
            boolean r2 = r0.h(r1)
            if (r2 == 0) goto L26
            r2 = r10
            goto L27
        L26:
            r2 = r9
        L27:
            r2 = r2 | r8
            goto L2a
        L29:
            r2 = r8
        L2a:
            r11 = r8 & 48
            if (r11 != 0) goto L3e
            int r11 = r17.ordinal()
            boolean r11 = r0.d(r11)
            if (r11 == 0) goto L3b
            r11 = 32
            goto L3d
        L3b:
            r11 = 16
        L3d:
            r2 = r2 | r11
        L3e:
            r11 = r8 & 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r11 != 0) goto L4f
            boolean r11 = r0.h(r3)
            if (r11 == 0) goto L4c
            r11 = r12
            goto L4e
        L4c:
            r11 = 128(0x80, float:1.8E-43)
        L4e:
            r2 = r2 | r11
        L4f:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L5f
            boolean r11 = r0.h(r4)
            if (r11 == 0) goto L5c
            r11 = 2048(0x800, float:2.87E-42)
            goto L5e
        L5c:
            r11 = 1024(0x400, float:1.435E-42)
        L5e:
            r2 = r2 | r11
        L5f:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L6f
            boolean r11 = r0.h(r5)
            if (r11 == 0) goto L6c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L6e
        L6c:
            r11 = 8192(0x2000, float:1.148E-41)
        L6e:
            r2 = r2 | r11
        L6f:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r8
            if (r11 != 0) goto L80
            boolean r11 = r0.h(r6)
            if (r11 == 0) goto L7d
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L7f
        L7d:
            r11 = 65536(0x10000, float:9.1835E-41)
        L7f:
            r2 = r2 | r11
        L80:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r8
            if (r11 != 0) goto L91
            boolean r11 = r0.h(r7)
            if (r11 == 0) goto L8e
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L90
        L8e:
            r11 = 524288(0x80000, float:7.34684E-40)
        L90:
            r2 = r2 | r11
        L91:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r2
            r13 = 599186(0x92492, float:8.39638E-40)
            r14 = 1
            if (r11 == r13) goto L9d
            r11 = r14
            goto L9e
        L9d:
            r11 = 0
        L9e:
            r13 = r2 & 1
            boolean r11 = r0.S(r13, r11)
            if (r11 == 0) goto L181
            int[] r11 = defpackage.o91.b
            int r13 = r17.ordinal()
            r11 = r11[r13]
            if (r11 == r14) goto L176
            r13 = 3
            vs0 r15 = defpackage.ox0.a
            r14 = 384(0x180, float:5.38E-43)
            if (r11 == r9) goto L13c
            if (r11 == r13) goto L101
            if (r11 != r10) goto Lf8
            r9 = -558853799(0xffffffffdeb09159, float:-6.361524E18)
            r0.b0(r9)
            r9 = 2131951870(0x7f1300fe, float:1.9540167E38)
            java.lang.String r9 = defpackage.yh2.O(r0, r9)
            r2 = r2 & 896(0x380, float:1.256E-42)
            if (r2 != r12) goto Lce
            r2 = 1
            goto Lcf
        Lce:
            r2 = 0
        Lcf:
            java.lang.Object r10 = r0.P()
            if (r2 != 0) goto Ld7
            if (r10 != r15) goto Le0
        Ld7:
            j91 r10 = new j91
            r2 = 7
            r10.<init>(r2, r3)
            r0.l0(r10)
        Le0:
            on2 r10 = (defpackage.on2) r10
            m91 r2 = new m91
            r11 = 1
            r2.<init>(r11, r7, r1)
            r11 = 370896624(0x161b6ef0, float:1.2555806E-25)
            zv0 r2 = defpackage.n16.I(r11, r2, r0)
            defpackage.mb3.b(r9, r10, r2, r0, r14)
            r2 = 0
            r0.p(r2)
            goto L184
        Lf8:
            r2 = 0
            r1 = -1126463078(0xffffffffbcdb899a, float:-0.026799012)
            ug r0 = defpackage.xg6.f(r0, r1, r2)
            throw r0
        L101:
            r11 = 1
            r9 = -559533319(0xffffffffdea632f9, float:-5.987954E18)
            r0.b0(r9)
            r9 = 2131951874(0x7f130102, float:1.9540175E38)
            java.lang.String r9 = defpackage.yh2.O(r0, r9)
            r2 = r2 & 896(0x380, float:1.256E-42)
            if (r2 != r12) goto L114
            goto L115
        L114:
            r11 = 0
        L115:
            java.lang.Object r2 = r0.P()
            if (r11 != 0) goto L11d
            if (r2 != r15) goto L126
        L11d:
            j91 r2 = new j91
            r10 = 6
            r2.<init>(r10, r3)
            r0.l0(r2)
        L126:
            on2 r2 = (defpackage.on2) r2
            m91 r10 = new m91
            r11 = 0
            r10.<init>(r11, r6, r1)
            r12 = -207869521(0xfffffffff39c29af, float:-2.4744988E31)
            zv0 r10 = defpackage.n16.I(r12, r10, r0)
            defpackage.mb3.b(r9, r2, r10, r0, r14)
            r0.p(r11)
            goto L184
        L13c:
            r11 = 1
            r9 = -560553994(0xffffffffde969ff6, float:-5.426832E18)
            r0.b0(r9)
            java.lang.String r9 = r1.getName()
            r2 = r2 & 896(0x380, float:1.256E-42)
            if (r2 != r12) goto L14c
            goto L14d
        L14c:
            r11 = 0
        L14d:
            java.lang.Object r2 = r0.P()
            if (r11 != 0) goto L158
            if (r2 != r15) goto L156
            goto L158
        L156:
            r11 = 0
            goto L161
        L158:
            j91 r2 = new j91
            r11 = 0
            r2.<init>(r11, r3)
            r0.l0(r2)
        L161:
            on2 r2 = (defpackage.on2) r2
            m4 r10 = new m4
            r10.<init>(r4, r3, r5, r13)
            r12 = -786635666(0xffffffffd11ce46e, float:-4.2115457E10)
            zv0 r10 = defpackage.n16.I(r12, r10, r0)
            defpackage.mb3.b(r9, r2, r10, r0, r14)
            r0.p(r11)
            goto L184
        L176:
            r11 = 0
            r2 = -560639988(0xffffffffde95500c, float:-5.3795564E18)
            r0.b0(r2)
            r0.p(r11)
            goto L184
        L181:
            r0.V()
        L184:
            cf5 r9 = r0.t()
            if (r9 == 0) goto L193
            n91 r0 = new n91
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L193:
            return
    }

    public static final void h(defpackage.a74 r29, defpackage.c6 r30, boolean r31, defpackage.on2 r32, defpackage.px0 r33, int r34) {
            r2 = r30
            r3 = r31
            r4 = r32
            r10 = r33
            xq2 r10 = (defpackage.xq2) r10
            r0 = -1758575878(0xffffffff972e42fa, float:-5.630697E-25)
            r10.d0(r0)
            r0 = r34 | 6
            boolean r1 = r10.h(r2)
            r13 = 16
            if (r1 == 0) goto L1d
            r1 = 32
            goto L1e
        L1d:
            r1 = r13
        L1e:
            r0 = r0 | r1
            boolean r1 = r10.g(r3)
            if (r1 == 0) goto L28
            r1 = 256(0x100, float:3.59E-43)
            goto L2a
        L28:
            r1 = 128(0x80, float:1.8E-43)
        L2a:
            r0 = r0 | r1
            boolean r1 = r10.h(r4)
            if (r1 == 0) goto L34
            r1 = 2048(0x800, float:2.87E-42)
            goto L36
        L34:
            r1 = 1024(0x400, float:1.435E-42)
        L36:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r14 = 0
            r15 = 1
            if (r1 == r5) goto L41
            r1 = r15
            goto L42
        L41:
            r1 = r14
        L42:
            r0 = r0 & r15
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L19e
            y16 r0 = defpackage.z16.a()
            x64 r1 = defpackage.x64.a
            a74 r0 = defpackage.u24.g(r1, r0)
            r5 = 0
            r6 = 14
            a74 r0 = defpackage.g04.P(r0, r3, r5, r4, r6)
            r5 = 1107296256(0x42000000, float:32.0)
            r6 = 1090519040(0x41000000, float:8.0)
            a74 r0 = P(r0, r5, r6)
            d40 r5 = defpackage.d90.i0
            c40 r7 = defpackage.d90.l0
            gu r8 = new gu
            h61 r9 = new h61
            r11 = 2
            r9.<init>(r7, r11)
            r8.<init>(r6, r15, r9)
            r6 = 54
            l26 r5 = defpackage.k26.a(r8, r5, r10, r6)
            long r6 = r10.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r10.l()
            a74 r0 = defpackage.l.E(r10, r0)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r10.f0()
            boolean r9 = r10.S
            if (r9 == 0) goto L97
            r10.k(r8)
            goto L9a
        L97:
            r10.o0()
        L9a:
            pn r8 = defpackage.ix0.f
            defpackage.yh2.K(r10, r8, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r10, r5, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            pn r6 = defpackage.ix0.g
            defpackage.yh2.K(r10, r6, r5)
            ne r5 = defpackage.ix0.h
            defpackage.yh2.F(r10, r5)
            pn r5 = defpackage.ix0.d
            defpackage.yh2.K(r10, r5, r0)
            nq6 r0 = defpackage.q83.a
            java.lang.Object r0 = r10.j(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 1103101952(0x41c00000, float:24.0)
            if (r0 == 0) goto Le1
            r0 = 130077244(0x7c0d23c, float:2.9012514E-34)
            r10.b0(r0)
            a74 r0 = defpackage.dj6.i(r1, r5)
            long r5 = defpackage.kt0.c
            jy2 r7 = defpackage.u24.m
            a74 r0 = defpackage.vy7.L(r0, r5, r7)
            r5 = 6
            defpackage.h70.a(r0, r10, r5)
            r10.p(r14)
            goto L114
        Le1:
            r0 = 130175607(0x7c25277, float:2.9238344E-34)
            r10.b0(r0)
            a74 r7 = defpackage.dj6.i(r1, r5)
            x23 r0 = new x23
            nq6 r5 = defpackage.kf.b
            java.lang.Object r5 = r10.j(r5)
            android.content.Context r5 = (android.content.Context) r5
            r0.<init>(r5)
            java.net.URL r5 = r2.d
            java.lang.String r5 = r5.toString()
            r0.c = r5
            r0.b(r15)
            z23 r5 = r0.a()
            r11 = 432(0x1b0, float:6.05E-43)
            r12 = 4088(0xff8, float:5.729E-42)
            r6 = 0
            r8 = 0
            r9 = 0
            defpackage.gi2.b(r5, r6, r7, r8, r9, r10, r11, r12)
            r10.p(r14)
        L114:
            java.lang.String r0 = r2.b
            if (r0 != 0) goto L124
            r0 = 2082420514(0x7c1f3722, float:3.3067737E36)
            r5 = 2131952390(0x7f130306, float:1.9541221E38)
            java.lang.String r0 = defpackage.i61.l(r10, r0, r5, r10, r14)
        L122:
            r5 = r0
            goto L12e
        L124:
            r5 = 2082420018(0x7c1f3532, float:3.3066165E36)
            r10.b0(r5)
            r10.p(r14)
            goto L122
        L12e:
            nq6 r0 = defpackage.ye7.b
            java.lang.Object r0 = r10.j(r0)
            xe7 r0 = (defpackage.xe7) r0
            s47 r0 = r0.j
            if (r3 == 0) goto L151
            r6 = 2082425129(0x7c1f4929, float:3.3082363E36)
            r10.b0(r6)
            nq6 r6 = defpackage.vt0.a
            java.lang.Object r6 = r10.j(r6)
            ut0 r6 = (defpackage.ut0) r6
            long r6 = r6.e()
        L14c:
            r10.p(r14)
            r7 = r6
            goto L164
        L151:
            r6 = 2082426343(0x7c1f4de7, float:3.308621E36)
            r10.b0(r6)
            nq6 r6 = defpackage.vt0.a
            java.lang.Object r6 = r10.j(r6)
            ut0 r6 = (defpackage.ut0) r6
            long r6 = r6.f()
            goto L14c
        L164:
            long r16 = defpackage.hi2.E(r13)
            r26 = 3078(0xc06, float:4.313E-42)
            r27 = 56314(0xdbfa, float:7.8913E-41)
            r6 = 0
            r24 = r10
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 2
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r25 = 0
            r28 = r23
            r23 = r0
            r0 = r28
            defpackage.x37.b(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10 = r24
            r10.p(r0)
            goto L1a3
        L19e:
            r10.V()
            r1 = r29
        L1a3:
            cf5 r6 = r10.t()
            if (r6 == 0) goto L1b2
            j7 r0 = new j7
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1b2:
            return
    }

    public static defpackage.pq4 i(int r2, float r3) {
            r0 = r2 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r2 = r2 & 2
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 1109393408(0x42200000, float:40.0)
        Ld:
            pq4 r2 = new pq4
            r2.<init>(r3, r1, r3, r1)
            return r2
    }

    public static defpackage.pq4 j(float r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            r3 = r1
        Lb:
            r0 = r5 & 4
            if (r0 == 0) goto L11
            r0 = r1
            goto L13
        L11:
            r0 = 1082130432(0x40800000, float:4.0)
        L13:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            r4 = r1
        L18:
            pq4 r5 = new pq4
            r5.<init>(r2, r3, r0, r4)
            return r5
    }

    public static final void k(me.magnum.melonds.ui.emulator.rewind.model.RewindWindow r47, defpackage.qn2 r48, defpackage.on2 r49, defpackage.px0 r50, int r51) {
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r51
            r2.getClass()
            r3.getClass()
            r14 = r50
            xq2 r14 = (defpackage.xq2) r14
            r0 = 1237287984(0x49bf8430, float:1568902.0)
            r14.d0(r0)
            r0 = r4 & 6
            if (r0 != 0) goto L27
            boolean r0 = r14.h(r1)
            if (r0 == 0) goto L24
            r0 = 4
            goto L25
        L24:
            r0 = 2
        L25:
            r0 = r0 | r4
            goto L28
        L27:
            r0 = r4
        L28:
            r5 = r4 & 48
            if (r5 != 0) goto L38
            boolean r5 = r14.h(r2)
            if (r5 == 0) goto L35
            r5 = 32
            goto L37
        L35:
            r5 = 16
        L37:
            r0 = r0 | r5
        L38:
            r5 = r4 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L49
            boolean r5 = r14.h(r3)
            if (r5 == 0) goto L46
            r5 = r8
            goto L48
        L46:
            r5 = 128(0x80, float:1.8E-43)
        L48:
            r0 = r0 | r5
        L49:
            r5 = r0 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 1
            r11 = 0
            if (r5 == r9) goto L53
            r5 = r10
            goto L54
        L53:
            r5 = r11
        L54:
            r9 = r0 & 1
            boolean r5 = r14.S(r9, r5)
            if (r5 == 0) goto L3bd
            es7 r5 = defpackage.bl2.F(r14)
            java.lang.Object r9 = r14.P()
            vs0 r12 = defpackage.ox0.a
            if (r9 != r12) goto L70
            nh2 r9 = new nh2
            r9.<init>()
            r14.l0(r9)
        L70:
            nh2 r9 = (defpackage.nh2) r9
            boolean r13 = r14.f(r1)
            java.lang.Object r15 = r14.P()
            if (r13 != 0) goto L7e
            if (r15 != r12) goto L8e
        L7e:
            java.util.ArrayList r13 = r1.getRewindStates()
            tp5 r15 = new tp5
            r15.<init>(r11)
            java.util.List r15 = defpackage.gt0.d1(r13, r15)
            r14.l0(r15)
        L8e:
            java.util.List r15 = (java.util.List) r15
            r13 = r0 & 896(0x380, float:1.256E-42)
            if (r13 != r8) goto L99
            r16 = r10
        L96:
            r50 = 16
            goto L9c
        L99:
            r16 = r11
            goto L96
        L9c:
            java.lang.Object r6 = r14.P()
            r17 = r15
            r15 = 15
            if (r16 != 0) goto La8
            if (r6 != r12) goto Lb0
        La8:
            x7 r6 = new x7
            r6.<init>(r15, r3)
            r14.l0(r6)
        Lb0:
            on2 r6 = (defpackage.on2) r6
            b(r11, r6, r14, r11, r10)
            lc2 r6 = defpackage.dj6.c
            long r10 = r5.b
            r7 = 1064682127(0x3f75c28f, float:0.96)
            long r10 = defpackage.kt0.c(r7, r10)
            jy2 r7 = defpackage.u24.m
            a74 r6 = defpackage.vy7.L(r6, r10, r7)
            rk7 r10 = defpackage.nc1.o
            a74 r6 = defpackage.nc1.j0(r6, r10)
            if (r13 != r8) goto Ld0
            r8 = 1
            goto Ld1
        Ld0:
            r8 = 0
        Ld1:
            java.lang.Object r10 = r14.P()
            if (r8 != 0) goto Ld9
            if (r10 != r12) goto Le2
        Ld9:
            m01 r10 = new m01
            r8 = 3
            r10.<init>(r8, r3)
            r14.l0(r10)
        Le2:
            qn2 r10 = (defpackage.qn2) r10
            a74 r6 = defpackage.u24.B(r6, r10)
            eu r8 = defpackage.ju.c
            c40 r10 = defpackage.d90.k0
            r11 = 0
            yt0 r8 = defpackage.wt0.a(r8, r10, r14, r11)
            r10 = r12
            long r11 = r14.T
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r14.l()
            a74 r6 = defpackage.l.E(r14, r6)
            ix0 r13 = defpackage.jx0.i
            r13.getClass()
            iy0 r13 = defpackage.ix0.b
            r14.f0()
            boolean r15 = r14.S
            if (r15 == 0) goto L112
            r14.k(r13)
            goto L115
        L112:
            r14.o0()
        L115:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r14, r15, r8)
            pn r8 = defpackage.ix0.e
            defpackage.yh2.K(r14, r8, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            pn r12 = defpackage.ix0.g
            defpackage.yh2.K(r14, r12, r11)
            ne r11 = defpackage.ix0.h
            defpackage.yh2.F(r14, r11)
            r28 = r0
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r14, r0, r6)
            d40 r6 = defpackage.d90.i0
            x64 r4 = defpackage.x64.a
            r2 = 1065353216(0x3f800000, float:1.0)
            r21 = r7
            a74 r7 = defpackage.dj6.c(r4, r2)
            r2 = 1090519040(0x41000000, float:8.0)
            r1 = 1101004800(0x41a00000, float:20.0)
            r3 = 1094713344(0x41400000, float:12.0)
            a74 r2 = R(r7, r1, r2, r3, r2)
            du r7 = defpackage.ju.a
            r3 = 48
            l26 r3 = defpackage.k26.a(r7, r6, r14, r3)
            r7 = r2
            long r1 = r14.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r14.l()
            a74 r7 = defpackage.l.E(r14, r7)
            r14.f0()
            r22 = r6
            boolean r6 = r14.S
            if (r6 == 0) goto L16e
            r14.k(r13)
            goto L171
        L16e:
            r14.o0()
        L171:
            defpackage.yh2.K(r14, r15, r3)
            defpackage.yh2.K(r14, r8, r2)
            defpackage.i61.w(r1, r14, r12, r14, r11)
            defpackage.yh2.K(r14, r0, r7)
            r1 = 2131952499(0x7f130373, float:1.9541442E38)
            java.lang.String r2 = defpackage.yh2.O(r14, r1)
            r3 = r8
            long r7 = r5.g
            r6 = r12
            pi2 r12 = defpackage.qs7.a
            long r23 = defpackage.hi2.E(r50)
            r25 = r11
            oj2 r11 = defpackage.oj2.d0
            r26 = r6
            vn3 r6 = new vn3
            r16 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r6.<init>(r1, r2)
            r1 = r26
            r26 = 0
            r27 = 130960(0x1ff90, float:1.83514E-40)
            r29 = r9
            r30 = r10
            r9 = r23
            r23 = r13
            r24 = r14
            r13 = 0
            r31 = r15
            r15 = 0
            r33 = r5
            r5 = r16
            r32 = r17
            r16 = 0
            r34 = 0
            r18 = 0
            r35 = 32
            r19 = 0
            r36 = 15
            r20 = 0
            r37 = r21
            r21 = 0
            r38 = r22
            r22 = 0
            r39 = r23
            r23 = 0
            r40 = r25
            r25 = 1772544(0x1b0c00, float:2.483863E-39)
            r2 = r34
            r34 = r1
            r1 = r2
            r35 = r3
            r43 = r30
            r3 = r31
            r41 = r37
            r2 = r39
            r42 = r40
            r31 = r0
            r30 = r29
            r0 = r36
            defpackage.x37.b(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14 = r24
            r5 = 1108869120(0x42180000, float:38.0)
            a74 r5 = defpackage.dj6.i(r4, r5)
            y16 r6 = defpackage.z16.a
            a74 r5 = defpackage.u24.g(r5, r6)
            r13 = 0
            r15 = r49
            a74 r0 = defpackage.mb3.u(r5, r1, r13, r15, r0)
            e40 r5 = defpackage.d90.Z
            e34 r6 = defpackage.h70.d(r5, r1)
            long r7 = r14.T
            int r7 = java.lang.Long.hashCode(r7)
            xv4 r8 = r14.l()
            a74 r0 = defpackage.l.E(r14, r0)
            r14.f0()
            boolean r9 = r14.S
            if (r9 == 0) goto L227
            r14.k(r2)
            goto L22a
        L227:
            r14.o0()
        L22a:
            defpackage.yh2.K(r14, r3, r6)
            r6 = r35
            defpackage.yh2.K(r14, r6, r8)
            r8 = r34
            r9 = r42
            defpackage.i61.w(r7, r14, r8, r14, r9)
            r7 = r31
            defpackage.yh2.K(r14, r7, r0)
            r0 = r5
            e33 r5 = defpackage.n16.y()
            r10 = 2131951750(0x7f130086, float:1.9539923E38)
            java.lang.String r6 = defpackage.yh2.O(r14, r10)
            r40 = r9
            r11 = r33
            long r8 = r11.g
            r12 = 1101004800(0x41a00000, float:20.0)
            a74 r12 = defpackage.dj6.i(r4, r12)
            r11 = 384(0x180, float:5.38E-43)
            r7 = r12
            r12 = 0
            r46 = r0
            r10 = r14
            r45 = r31
            r0 = r33
            r13 = r34
            r14 = r35
            r44 = r40
            defpackage.i13.a(r5, r6, r7, r8, r10, r11, r12)
            r8 = r10
            r5 = 1
            r8.p(r5)
            r8.p(r5)
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r7 = defpackage.dj6.c(r4, r6)
            a74 r7 = defpackage.dj6.e(r7, r6)
            long r9 = r0.f
            r11 = r41
            a74 r7 = defpackage.vy7.L(r7, r9, r11)
            defpackage.h70.a(r7, r8, r1)
            vn3 r7 = new vn3
            r7.<init>(r6, r5)
            r5 = r46
            e34 r5 = defpackage.h70.d(r5, r1)
            long r9 = r8.T
            int r6 = java.lang.Long.hashCode(r9)
            xv4 r9 = r8.l()
            a74 r7 = defpackage.l.E(r8, r7)
            r8.f0()
            boolean r10 = r8.S
            if (r10 == 0) goto L2ab
            r8.k(r2)
            goto L2ae
        L2ab:
            r8.o0()
        L2ae:
            defpackage.yh2.K(r8, r3, r5)
            defpackage.yh2.K(r8, r14, r9)
            r9 = r44
            defpackage.i61.w(r6, r8, r13, r8, r9)
            r2 = r45
            defpackage.yh2.K(r8, r2, r7)
            boolean r2 = r32.isEmpty()
            if (r2 == 0) goto L30b
            r2 = -1447331983(0xffffffffa9bb7771, float:-8.325188E-14)
            r8.b0(r2)
            r2 = 2131952499(0x7f130373, float:1.9541442E38)
            java.lang.String r5 = defpackage.yh2.O(r8, r2)
            long r2 = r0.i
            sr2 r12 = defpackage.qs7.c
            r0 = 12
            long r9 = defpackage.hi2.E(r0)
            r26 = 0
            r27 = 130994(0x1ffb2, float:1.83562E-40)
            r6 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r0 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 1575936(0x180c00, float:2.208357E-39)
            r24 = r8
            r7 = r2
            defpackage.x37.b(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14 = r24
            r14.p(r1)
            r3 = r47
            r2 = r48
            r4 = r30
        L308:
            r5 = 1
            goto L379
        L30b:
            r14 = r8
            r0 = 0
            r2 = -1447065848(0xffffffffa9bf8708, float:-8.505528E-14)
            r14.b0(r2)
            gu r8 = new gu
            i r2 = new i
            r5 = 1
            r2.<init>(r5)
            r3 = 1094713344(0x41400000, float:12.0)
            r8.<init>(r3, r5, r2)
            pq4 r7 = new pq4
            r2 = 1103101952(0x41c00000, float:24.0)
            r7.<init>(r2, r3, r2, r3)
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.dj6.c(r4, r6)
            r15 = r32
            boolean r2 = r14.h(r15)
            r3 = r47
            boolean r4 = r14.h(r3)
            r2 = r2 | r4
            r4 = r28 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r4 != r6) goto L342
            r10 = 1
            goto L343
        L342:
            r10 = r1
        L343:
            r2 = r2 | r10
            java.lang.Object r4 = r14.P()
            if (r2 != 0) goto L354
            r10 = r43
            if (r4 != r10) goto L34f
            goto L354
        L34f:
            r2 = r48
            r6 = r30
            goto L360
        L354:
            cn r4 = new cn
            r2 = r48
            r6 = r30
            r4.<init>(r15, r3, r6, r2)
            r14.l0(r4)
        L360:
            r13 = r4
            qn2 r13 = (defpackage.qn2) r13
            r15 = 221574(0x36186, float:3.10491E-40)
            r16 = 458(0x1ca, float:6.42E-43)
            r30 = r6
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r30
            r9 = r38
            defpackage.gi2.f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14.p(r1)
            goto L308
        L379:
            r14.p(r5)
            rq2 r1 = new rq2
            r5 = 2131952373(0x7f1302f5, float:1.9541187E38)
            java.lang.String r5 = defpackage.yh2.O(r14, r5)
            r1.<init>(r0, r5)
            rq2 r0 = new rq2
            r5 = 2131952160(0x7f130220, float:1.9540755E38)
            java.lang.String r5 = defpackage.yh2.O(r14, r5)
            java.lang.String r6 = "A"
            r0.<init>(r6, r5)
            rq2 r5 = new rq2
            java.lang.String r6 = "B"
            r7 = 2131951750(0x7f130086, float:1.9539923E38)
            java.lang.String r7 = defpackage.yh2.O(r14, r7)
            r5.<init>(r6, r7)
            rq2[] r0 = new defpackage.rq2[]{r1, r0, r5}
            java.util.List r5 = defpackage.hf.c0(r0)
            r9 = 0
            r10 = 6
            r6 = 0
            r7 = 0
            r8 = r14
            defpackage.is7.a(r5, r6, r7, r8, r9, r10)
            r5 = 1
            r14.p(r5)
            r0 = 6
            defpackage.is7.b(r4, r14, r0)
            goto L3c1
        L3bd:
            r3 = r1
            r14.V()
        L3c1:
            cf5 r6 = r14.t()
            if (r6 == 0) goto L3d5
            rl r0 = new rl
            r5 = 17
            r4 = r51
            r1 = r3
            r3 = r49
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L3d5:
            return
    }

    public static final void l(me.magnum.melonds.ui.emulator.rewind.model.RewindWindow r32, me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r33, int r34, defpackage.nh2 r35, defpackage.on2 r36, defpackage.px0 r37, int r38) {
            r2 = r33
            r3 = r34
            r4 = r35
            r6 = r38
            r10 = r37
            xq2 r10 = (defpackage.xq2) r10
            r0 = 2010886556(0x77dbb19c, float:8.911839E33)
            r10.d0(r0)
            r0 = r6 & 6
            r1 = r32
            if (r0 != 0) goto L23
            boolean r0 = r10.h(r1)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r6
            goto L24
        L23:
            r0 = r6
        L24:
            r5 = r6 & 48
            if (r5 != 0) goto L34
            boolean r5 = r10.h(r2)
            if (r5 == 0) goto L31
            r5 = 32
            goto L33
        L31:
            r5 = 16
        L33:
            r0 = r0 | r5
        L34:
            r5 = r6 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L44
            boolean r5 = r10.d(r3)
            if (r5 == 0) goto L41
            r5 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r5 = 128(0x80, float:1.8E-43)
        L43:
            r0 = r0 | r5
        L44:
            r5 = r6 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L54
            boolean r5 = r10.f(r4)
            if (r5 == 0) goto L51
            r5 = 2048(0x800, float:2.87E-42)
            goto L53
        L51:
            r5 = 1024(0x400, float:1.435E-42)
        L53:
            r0 = r0 | r5
        L54:
            r5 = r6 & 24576(0x6000, float:3.4438E-41)
            r15 = r36
            if (r5 != 0) goto L66
            boolean r5 = r10.h(r15)
            if (r5 == 0) goto L63
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L65
        L63:
            r5 = 8192(0x2000, float:1.148E-41)
        L65:
            r0 = r0 | r5
        L66:
            r5 = r0 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r8 = 1
            if (r5 == r7) goto L6f
            r5 = r8
            goto L70
        L6f:
            r5 = 0
        L70:
            r0 = r0 & r8
            boolean r0 = r10.S(r0, r5)
            if (r0 == 0) goto L35f
            es7 r5 = defpackage.bl2.F(r10)
            nq6 r0 = defpackage.kf.b
            java.lang.Object r0 = r10.j(r0)
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r0 = r10.P()
            vs0 r11 = defpackage.ox0.a
            if (r0 != r11) goto L90
            r94 r0 = defpackage.i61.f(r10)
        L90:
            r12 = r0
            r94 r12 = (defpackage.r94) r12
            r0 = 6
            qa4 r17 = defpackage.bw7.a(r12, r10, r0)
            r0 = 1092616192(0x41200000, float:10.0)
            y16 r13 = defpackage.z16.b(r0)
            if (r3 != 0) goto La3
            r18 = r8
            goto La5
        La3:
            r18 = 0
        La5:
            float r0 = (float) r3
            r14 = 1028443341(0x3d4ccccd, float:0.05)
            float r0 = r0 * r14
            r19 = 1065353216(0x3f800000, float:1.0)
            float r0 = r19 - r0
            r14 = 1057803469(0x3f0ccccd, float:0.55)
            int r16 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r16 >= 0) goto Lb8
            r20 = r14
            goto Lba
        Lb8:
            r20 = r0
        Lba:
            boolean r0 = r10.f(r2)
            java.lang.Object r14 = r10.P()
            if (r0 != 0) goto Lc6
            if (r14 != r11) goto Lde
        Lc6:
            android.graphics.Bitmap r0 = r2.getScreenshot()     // Catch: java.lang.Throwable -> Lcb
            goto Ld2
        Lcb:
            r0 = move-exception
            em5 r14 = new em5
            r14.<init>(r0)
            r0 = r14
        Ld2:
            boolean r14 = r0 instanceof defpackage.em5
            if (r14 == 0) goto Ld8
            r0 = 0
        Ld8:
            r14 = r0
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            r10.l0(r14)
        Lde:
            r0 = r14
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r14 = r10.f(r2)
            java.lang.Object r8 = r10.P()
            if (r14 != 0) goto Led
            if (r8 != r11) goto Lf0
        Led:
            r26 = r10
            goto Lf2
        Lf0:
            r11 = r8
            goto L100
        Lf2:
            long r9 = r32.m5getDeltaFromEmulationTimeToRewindState5sfh64U(r33)
            oq1 r11 = new oq1
            r11.<init>(r9)
            r10 = r26
            r10.l0(r11)
        L100:
            oq1 r11 = (defpackage.oq1) r11
            r26 = r10
            long r9 = r11.A
            c40 r11 = defpackage.d90.l0
            x64 r14 = defpackage.x64.a
            if (r4 == 0) goto L113
            a74 r16 = defpackage.ak7.S(r14, r4)
            r21 = r14
            goto L117
        L113:
            r16 = r14
            r21 = r16
        L117:
            r14 = 0
            r22 = r11
            r11 = r16
            r16 = 508(0x1fc, float:7.12E-43)
            r23 = r13
            r13 = 0
            r1 = r22
            r8 = r23
            r30 = r9
            r9 = r21
            r21 = r30
            a74 r10 = defpackage.mb3.v(r11, r12, r13, r14, r15, r16)
            eu r11 = defpackage.ju.c
            r12 = 48
            r13 = r26
            yt0 r1 = defpackage.wt0.a(r11, r1, r13, r12)
            long r11 = r13.T
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r13.l()
            a74 r10 = defpackage.l.E(r13, r10)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r13.f0()
            boolean r15 = r13.S
            if (r15 == 0) goto L159
            r13.k(r14)
            goto L15c
        L159:
            r13.o0()
        L15c:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r13, r15, r1)
            pn r1 = defpackage.ix0.e
            defpackage.yh2.K(r13, r1, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            pn r12 = defpackage.ix0.g
            defpackage.yh2.K(r13, r12, r11)
            ne r11 = defpackage.ix0.h
            defpackage.yh2.F(r13, r11)
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r13, r2, r10)
            r10 = 1122762752(0x42ec0000, float:118.0)
            a74 r10 = defpackage.dj6.l(r9, r10)
            r3 = 1068149419(0x3faaaaab, float:1.3333334)
            a74 r3 = defpackage.ak7.H(r10, r3)
            java.lang.Object r10 = r17.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L195
            r10 = r19
            goto L197
        L195:
            r10 = r20
        L197:
            a74 r3 = defpackage.jw2.j(r3, r10)
            a74 r3 = defpackage.u24.g(r3, r8)
            r10 = r7
            long r6 = r5.d
            r16 = r9
            r19 = r10
            long r9 = r5.j
            jy2 r4 = defpackage.u24.m
            a74 r3 = defpackage.vy7.L(r3, r6, r4)
            java.lang.Object r6 = r17.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L1bd
            r6 = 1077936128(0x40400000, float:3.0)
            goto L1bf
        L1bd:
            r6 = 1073741824(0x40000000, float:2.0)
        L1bf:
            java.lang.Object r17 = r17.getValue()
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r17 = r17.booleanValue()
            if (r17 == 0) goto L1ce
            r25 = r9
            goto L1e1
        L1ce:
            if (r18 == 0) goto L1dd
            r5 = 1061158912(0x3f400000, float:0.75)
            long r25 = defpackage.kt0.c(r5, r9)
            r30 = r25
            r25 = r9
            r9 = r30
            goto L1e1
        L1dd:
            r25 = r9
            long r9 = r5.f
        L1e1:
            a74 r3 = defpackage.ak7.I(r3, r6, r9, r8)
            e40 r5 = defpackage.d90.L
            r8 = 0
            e34 r6 = defpackage.h70.d(r5, r8)
            long r9 = r13.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r13.l()
            a74 r3 = defpackage.l.E(r13, r3)
            r13.f0()
            boolean r7 = r13.S
            if (r7 == 0) goto L205
            r13.k(r14)
            goto L208
        L205:
            r13.o0()
        L208:
            defpackage.yh2.K(r13, r15, r6)
            defpackage.yh2.K(r13, r1, r10)
            defpackage.i61.w(r9, r13, r12, r13, r11)
            defpackage.yh2.K(r13, r2, r3)
            vs0 r3 = defpackage.vs0.Y
            if (r0 == 0) goto L23e
            r6 = -339602527(0xffffffffebc213a1, float:-4.692486E26)
            r13.b0(r6)
            zh r7 = new zh
            r7.<init>(r0)
            r24 = r8
            lc2 r8 = defpackage.dj6.c
            r0 = r11
            r11 = 25008(0x61b0, float:3.5044E-41)
            r6 = r12
            r12 = 232(0xe8, float:3.25E-43)
            r9 = 0
            r37 = r2
            r10 = r13
            r2 = r16
            r13 = r0
            r0 = r6
            r6 = r24
            defpackage.bl2.c(r7, r8, r9, r10, r11, r12)
            r10.p(r6)
            goto L24f
        L23e:
            r37 = r2
            r6 = r8
            r0 = r12
            r10 = r13
            r2 = r16
            r13 = r11
            r7 = -339364726(0xffffffffebc5b48a, float:-4.780219E26)
            r10.b0(r7)
            r10.p(r6)
        L24f:
            e40 r7 = defpackage.d90.e0
            a74 r2 = r3.n(r2, r7)
            r3 = 1086324736(0x40c00000, float:6.0)
            a74 r2 = O(r2, r3)
            r3 = 1082130432(0x40800000, float:4.0)
            y16 r3 = defpackage.z16.b(r3)
            a74 r2 = defpackage.u24.g(r2, r3)
            if (r18 == 0) goto L26a
            r7 = r25
            goto L272
        L26a:
            long r7 = defpackage.kt0.b
            r3 = 1056964608(0x3f000000, float:0.5)
            long r7 = defpackage.kt0.c(r3, r7)
        L272:
            a74 r2 = defpackage.vy7.L(r2, r7, r4)
            r3 = 1088421888(0x40e00000, float:7.0)
            r4 = 1073741824(0x40000000, float:2.0)
            a74 r2 = P(r2, r3, r4)
            e34 r3 = defpackage.h70.d(r5, r6)
            long r4 = r10.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r10.l()
            a74 r2 = defpackage.l.E(r10, r2)
            r10.f0()
            boolean r7 = r10.S
            if (r7 == 0) goto L29b
            r10.k(r14)
            goto L29e
        L29b:
            r10.o0()
        L29e:
            defpackage.yh2.K(r10, r15, r3)
            defpackage.yh2.K(r10, r1, r5)
            defpackage.i61.w(r4, r10, r0, r10, r13)
            r0 = r37
            defpackage.yh2.K(r10, r0, r2)
            if (r18 == 0) goto L2bd
            r0 = 708622609(0x2a3cb911, float:1.6761962E-13)
            r1 = 2131952505(0x7f130379, float:1.9541455E38)
            java.lang.String r0 = defpackage.i61.l(r10, r0, r1, r10, r6)
            r3 = 1
        L2b9:
            r7 = r0
            r26 = r10
            goto L32b
        L2bd:
            r0 = 708710897(0x2a3e11f1, float:1.6881615E-13)
            r10.b0(r0)
            r10.p(r6)
            long r0 = defpackage.oq1.e(r21)
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r5 = "%.2f"
            if (r4 < 0) goto L303
            double r6 = r0 / r2
            int r4 = (int) r6
            double r0 = r0 % r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            r1 = 2131952507(0x7f13037b, float:1.9541459E38)
            r2 = r19
            java.lang.String r0 = r2.getString(r1, r0)
            r0.getClass()
            goto L324
        L303:
            r2 = r19
            r3 = 1
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 2131952508(0x7f13037c, float:1.954146E38)
            java.lang.String r0 = r2.getString(r1, r0)
            r0.getClass()
        L324:
            java.lang.String r1 = "-"
            java.lang.String r0 = r1.concat(r0)
            goto L2b9
        L32b:
            long r9 = defpackage.kt0.d
            sr2 r14 = defpackage.qs7.c
            r0 = 4620974692658839552(0x4021000000000000, double:8.5)
            long r11 = defpackage.hi2.D(r0)
            r0 = 10
            long r18 = defpackage.hi2.E(r0)
            oj2 r13 = defpackage.oj2.d0
            r28 = 6
            r29 = 129938(0x1fb92, float:1.82082E-40)
            r8 = 0
            r15 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1772928(0x1b0d80, float:2.484401E-39)
            defpackage.x37.b(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10 = r26
            defpackage.i61.y(r10, r3, r3, r3)
            goto L362
        L35f:
            r10.V()
        L362:
            cf5 r8 = r10.t()
            if (r8 == 0) goto L37c
            sp5 r0 = new sp5
            r7 = 0
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L37c:
            return
    }

    public static final void m(int r3, int r4) {
            if (r3 < 0) goto L5
            if (r3 >= r4) goto L5
            return
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ") is out of bound of [0, "
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.util.Map n(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.zf3
            if (r0 == 0) goto L10
            boolean r0 = r1 instanceof defpackage.cg3
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "kotlin.collections.MutableMap"
            X(r1, r0)
            r1 = 0
            throw r1
        L10:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.ClassCastException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.Class<ge7> r0 = defpackage.ge7.class
            java.lang.String r0 = r0.getName()
            defpackage.nb3.V(r1, r0)
            throw r1
    }

    public static final boolean o(defpackage.bq6 r2, int r3, defpackage.h1 r4, boolean r5) {
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            int r1 = r2.d     // Catch: java.lang.Throwable -> L12
            if (r1 != r3) goto L18
            r2.c = r4     // Catch: java.lang.Throwable -> L12
            r3 = 1
            if (r5 == 0) goto L14
            int r4 = r2.e     // Catch: java.lang.Throwable -> L12
            int r4 = r4 + r3
            r2.e = r4     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L1b
        L14:
            int r1 = r1 + r3
            r2.d = r1     // Catch: java.lang.Throwable -> L12
            goto L19
        L18:
            r3 = 0
        L19:
            monitor-exit(r0)
            return r3
        L1b:
            monitor-exit(r0)
            throw r2
    }

    public static void p(int r2, java.lang.Object r3) {
            if (r3 == 0) goto L1c
            boolean r0 = I(r2, r3)
            if (r0 == 0) goto L9
            goto L1c
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            X(r3, r2)
            r2 = 0
            throw r2
        L1c:
            return
    }

    public static final float q(defpackage.lq4 r1, defpackage.kk3 r2) {
            kk3 r0 = defpackage.kk3.Ltr
            if (r2 != r0) goto L9
            float r1 = r1.c(r2)
            return r1
        L9:
            float r1 = r1.b(r2)
            return r1
    }

    public static final float r(defpackage.lq4 r1, defpackage.kk3 r2) {
            kk3 r0 = defpackage.kk3.Ltr
            if (r2 != r0) goto L9
            float r1 = r1.b(r2)
            return r1
        L9:
            float r1 = r1.c(r2)
            return r1
    }

    public static int s(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L2e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L21
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L21
            ch4 r4 = new ch4
            r4.<init>(r3)
            android.app.NotificationManager r3 = r4.b
            boolean r3 = r3.areNotificationsEnabled()
            if (r3 == 0) goto L1f
            return r0
        L1f:
            r3 = -1
            return r3
        L21:
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r3 = r3.checkPermission(r4, r0, r1)
            return r3
        L2e:
            java.lang.String r3 = "permission must be non-null"
            defpackage.u34.x(r3)
            return r0
    }

    public static final void t(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            defpackage.mb3.q(r1, r0)
        L10:
            return
    }

    public static defpackage.yw2 u(defpackage.yw2 r10, defpackage.yw2 r11) {
            ww2 r0 = new ww2
            r1 = 0
            r0.<init>(r1, r1)
            int r2 = r10.size()
            r3 = r1
        Lb:
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "Content-Length"
            if (r3 >= r2) goto L51
            java.lang.String r7 = r10.b(r3)
            java.lang.String r8 = r10.d(r3)
            java.lang.String r9 = "Warning"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L2c
            java.lang.String r9 = "1"
            boolean r9 = defpackage.xs6.g0(r8, r9, r1)
            if (r9 == 0) goto L2c
            goto L4e
        L2c:
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 != 0) goto L4b
            boolean r5 = r5.equalsIgnoreCase(r7)
            if (r5 != 0) goto L4b
            boolean r4 = r4.equalsIgnoreCase(r7)
            if (r4 == 0) goto L3f
            goto L4b
        L3f:
            boolean r4 = H(r7)
            if (r4 == 0) goto L4b
            java.lang.String r4 = r11.a(r7)
            if (r4 != 0) goto L4e
        L4b:
            r0.e(r7, r8)
        L4e:
            int r3 = r3 + 1
            goto Lb
        L51:
            int r10 = r11.size()
        L55:
            if (r1 >= r10) goto L7e
            java.lang.String r2 = r11.b(r1)
            boolean r3 = r6.equalsIgnoreCase(r2)
            if (r3 != 0) goto L7b
            boolean r3 = r5.equalsIgnoreCase(r2)
            if (r3 != 0) goto L7b
            boolean r3 = r4.equalsIgnoreCase(r2)
            if (r3 == 0) goto L6e
            goto L7b
        L6e:
            boolean r3 = H(r2)
            if (r3 == 0) goto L7b
            java.lang.String r3 = r11.d(r1)
            r0.e(r2, r3)
        L7b:
            int r1 = r1 + 1
            goto L55
        L7e:
            yw2 r10 = r0.f()
            return r10
    }

    public static final boolean v(defpackage.of5 r2, float r3, float r4) {
            float r0 = r2.a
            float r1 = r2.c
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L1a
            float r3 = r2.b
            float r2 = r2.d
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 > 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static final long w(long r6, defpackage.uq1 r8) {
            r8.getClass()
            int[] r0 = defpackage.vq1.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            r4 = 1
            if (r0 == r1) goto L31
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 == r1) goto L29
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 != r1) goto L20
            r0 = r4
            goto L34
        L20:
            java.lang.String r6 = "Wrong unit for millisMultiplier: "
            defpackage.e41.h(r8, r6)
            return r2
        L26:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L34
        L29:
            r0 = 60000(0xea60, double:2.9644E-319)
            goto L34
        L2d:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L34
        L31:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
        L34:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L39
            return r2
        L39:
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r8 != 0) goto L48
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L47
            goto L6b
        L47:
            return r0
        L48:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L52
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L51
            goto L6b
        L51:
            return r6
        L52:
            int r8 = java.lang.Long.numberOfLeadingZeros(r6)
            int r8 = 128 - r8
            int r4 = java.lang.Long.numberOfLeadingZeros(r0)
            int r8 = r8 - r4
            r4 = 63
            if (r8 >= r4) goto L63
            long r6 = r6 * r0
            return r6
        L63:
            if (r8 <= r4) goto L66
            goto L6b
        L66:
            long r6 = r6 * r0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L6c
        L6b:
            return r2
        L6c:
            return r6
    }

    public static void x(defpackage.qf r6, android.util.LongSparseArray r7) {
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = defpackage.ma.n(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = defpackage.ma.k(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = defpackage.ma.o(r4)
            if (r4 == 0) goto L58
            g93 r5 = r6.c()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            za6 r2 = (defpackage.za6) r2
            if (r2 == 0) goto L58
            xa6 r2 = r2.a
            if (r2 == 0) goto L58
            ta6 r2 = r2.d
            fb6 r3 = defpackage.sa6.l
            ja4 r2 = r2.A
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            y1 r2 = (defpackage.y1) r2
            if (r2 == 0) goto L58
            ao2 r2 = r2.b
            qn2 r2 = (defpackage.qn2) r2
            if (r2 == 0) goto L58
            fp r3 = new fp
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.g(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
    }

    public static final defpackage.a74 y(defpackage.a74 r2, defpackage.qn2 r3) {
            gh2 r0 = new gh2
            jh2 r1 = new jh2
            r1.<init>(r3)
            r0.<init>(r1)
            a74 r2 = r2.d(r0)
            return r2
    }

    public static final defpackage.e33 z() {
            e33 r0 = defpackage.ge7.k
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Bolt"
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
            r2 = 1093664768(0x41300000, float:11.0)
            r5 = 1101529088(0x41a80000, float:21.0)
            r4.o(r2, r5)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.l(r2)
            r5 = -1059061760(0xffffffffc0e00000, float:-7.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r4.n(r11, r5)
            r5 = 1089470464(0x40f00000, float:7.5)
            r4.k(r5)
            r9 = -1094545572(0xffffffffbec28f5c, float:-0.38)
            r10 = -1087834685(0xffffffffbf28f5c3, float:-0.66)
            r5 = -1089176863(0xffffffffbf147ae1, float:-0.58)
            r6 = 0
            r7 = -1089344635(0xffffffffbf11eb85, float:-0.57)
            r8 = -1096558838(0xffffffffbea3d70a, float:-0.32)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = 1032805417(0x3d8f5c29, float:0.07)
            r10 = -1107967345(0xffffffffbdf5c28f, float:-0.12)
            r5 = 1044549468(0x3e428f5c, float:0.19)
            r6 = -1095887749(0xffffffffbeae147b, float:-0.34)
            r7 = 1028443341(0x3d4ccccd, float:0.05)
            r8 = -1113336054(0xffffffffbda3d70a, float:-0.08)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = 1095761920(0x41500000, float:13.0)
            r10 = 1077936128(0x40400000, float:3.0)
            r5 = 1091022356(0x4107ae14, float:8.48)
            r6 = 1093601853(0x412f0a3d, float:10.94)
            r7 = 1093056594(0x4126b852, float:10.42)
            r8 = 1089554350(0x40f147ae, float:7.54)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.l(r11)
            r5 = 1088421888(0x40e00000, float:7.0)
            r4.n(r2, r5)
            r2 = 1080033280(0x40600000, float:3.5)
            r4.l(r2)
            r9 = 1055957975(0x3ef0a3d7, float:0.47)
            r10 = 1057132380(0x3f028f5c, float:0.51)
            r5 = 1056629064(0x3efae148, float:0.49)
            r6 = 0
            r7 = 1057971241(0x3f0f5c29, float:0.56)
            r8 = 1051260355(0x3ea8f5c3, float:0.33)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = -1114678231(0xffffffffbd8f5c29, float:-0.07)
            r5 = 1041865114(0x3e19999a, float:0.15)
            r4.n(r2, r5)
            r9 = 1093664768(0x41300000, float:11.0)
            r10 = 1101529088(0x41a80000, float:21.0)
            r5 = 1095719977(0x414f5c29, float:12.96)
            r6 = 1099720294(0x418c6666, float:17.55)
            r7 = 1093664768(0x41300000, float:11.0)
            r8 = 1101529088(0x41a80000, float:21.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.ge7.k = r0
            return r0
    }
}
