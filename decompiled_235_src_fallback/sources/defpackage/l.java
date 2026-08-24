package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public abstract class l {
    public static final char[] a = null;
    public static final defpackage.wf7 b = null;
    public static final defpackage.zv0 c = null;
    public static final defpackage.zv0 d = null;
    public static final defpackage.zv0 e = null;
    public static final defpackage.e30 f = null;
    public static final java.lang.StackTraceElement[] g = null;
    public static final defpackage.tm1 h = null;
    public static final /* synthetic */ int i = 0;
    public static java.lang.reflect.Constructor j;
    public static defpackage.e33 k;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0056: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            defpackage.l.a = r0
            wf7 r0 = new wf7
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1)
            defpackage.l.b = r0
            ew0 r0 = new ew0
            r0.<init>()
            zv0 r1 = new zv0
            r3 = -1571120048(0xffffffffa25a9c50, float:-2.962726E-18)
            r1.<init>(r3, r2, r0)
            defpackage.l.c = r1
            kw0 r0 = new kw0
            r1 = 22
            r0.<init>(r1)
            zv0 r1 = new zv0
            r3 = -1455401925(0xffffffffa940543b, float:-4.2705622E-14)
            r1.<init>(r3, r2, r0)
            defpackage.l.d = r1
            iw0 r0 = new iw0
            r1 = 19
            r0.<init>(r1)
            zv0 r1 = new zv0
            r3 = -1620577933(0xffffffff9f67f173, float:-4.9115875E-20)
            r1.<init>(r3, r2, r0)
            defpackage.l.e = r1
            e30 r0 = new e30
            r0.<init>()
            defpackage.l.f = r0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r2]
            defpackage.l.g = r0
            tm1 r0 = new tm1
            r0.<init>()
            defpackage.l.h = r0
            return
    }

    public static java.lang.Object A(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object[] r5) {
            java.lang.reflect.Constructor r0 = defpackage.l.j
            if (r0 != 0) goto L1a
            java.lang.Class r0 = defpackage.au.f()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)
            r1 = 1
            r0.setAccessible(r1)
            defpackage.l.j = r0
        L1a:
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class<yr2> r2 = defpackage.yr2.class
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.Object r0 = r0.newInstance(r1)
            java.lang.invoke.MethodHandles$Lookup r0 = defpackage.au.k(r0)
            java.lang.invoke.MethodHandle r3 = defpackage.au.j(r0, r3)
            java.lang.invoke.MethodHandle r3 = defpackage.au.i(r3, r4)
            java.lang.Object r3 = defpackage.au.g(r3, r5)
            return r3
    }

    public static final boolean B(defpackage.cf0 r2, java.lang.String r3) {
            r3.getClass()
            r2.getClass()
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = defpackage.nb3.k(r0, r1)
            java.lang.String r1 = "CXCP"
            if (r0 == 0) goto L1f
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L1d
            java.lang.String r2 = "isBackwardCompatible method returns true because robolectric build detected."
            android.util.Log.d(r1, r2)
        L1d:
            r2 = 1
            return r2
        L1f:
            defpackage.xf0.a(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            lg0 r2 = defpackage.cf0.b(r2, r3)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r0.getClass()     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            qc0 r2 = (defpackage.qc0) r2     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            java.lang.Object r2 = r2.c(r0)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            int[] r2 = (int[]) r2     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r0 = 0
            if (r2 == 0) goto L3d
            boolean r2 = defpackage.fv.m0(r2, r0)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            return r2
        L3b:
            r2 = move-exception
            goto L3e
        L3d:
            return r0
        L3e:
            boolean r0 = defpackage.kj2.G()
            if (r0 == 0) goto L4d
            java.lang.String r0 = "Error while accessing metadata for cameraID: "
            java.lang.String r3 = r0.concat(r3)
            android.util.Log.e(r1, r3, r2)
        L4d:
            i53 r3 = new i53
            r3.<init>(r2)
            throw r3
    }

    public static final boolean C(defpackage.o6 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof defpackage.m6
            if (r0 == 0) goto L10
            m6 r1 = (defpackage.m6) r1
            bb5 r1 = r1.a
            eb5 r1 = r1.a
            boolean r1 = r1.b
            return r1
        L10:
            boolean r1 = r1 instanceof defpackage.n6
            if (r1 != 0) goto L19
            defpackage.i.d()
            r1 = 0
            return r1
        L19:
            r1 = 0
            throw r1
    }

    public static final defpackage.a74 D(defpackage.px0 r2, defpackage.a74 r3) {
            ne r0 = defpackage.ne.q0
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L9
            return r3
        L9:
            xq2 r2 = (defpackage.xq2) r2
            r0 = 1219399079(0x48ae8da7, float:357485.22)
            r2.c0(r0)
            o0 r0 = new o0
            r1 = 4
            r0.<init>(r2, r1)
            x64 r1 = defpackage.x64.a
            java.lang.Object r3 = r3.b(r0, r1)
            a74 r3 = (defpackage.a74) r3
            r0 = 0
            r2.p(r0)
            return r3
    }

    public static final defpackage.a74 E(defpackage.px0 r1, defpackage.a74 r2) {
            xq2 r1 = (defpackage.xq2) r1
            r0 = 439770924(0x1a365f2c, float:3.7713597E-23)
            r1.b0(r0)
            a74 r2 = D(r1, r2)
            r0 = 0
            r1.p(r0)
            return r2
    }

    public static defpackage.gx3 F(defpackage.gx3 r4) {
            r4.getClass()
            boolean r0 = r4.isDone()
            if (r0 == 0) goto La
            return r4
        La:
            qb0 r0 = new qb0
            r0.<init>()
            hl5 r1 = new hl5
            r1.<init>()
            r0.c = r1
            tb0 r1 = new tb0
            r1.<init>(r0)
            r0.b = r1
            java.lang.Class<i61> r2 = defpackage.i61.class
            r0.a = r2
            uj1 r2 = defpackage.u24.j()     // Catch: java.lang.Exception -> L3f
            r3 = 0
            J(r3, r4, r0, r2)     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "nonCancellationPropagating["
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3f
            r2.append(r4)     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = "]"
            r2.append(r4)     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L3f
            r0.a = r4     // Catch: java.lang.Exception -> L3f
            goto L43
        L3f:
            r4 = move-exception
            r1.b(r4)
        L43:
            return r1
    }

    public static void G(android.view.inputmethod.EditorInfo r0, android.view.inputmethod.InputConnection r1, android.widget.TextView r2) {
            if (r1 == 0) goto L13
            java.lang.CharSequence r0 = r0.hintText
            if (r0 != 0) goto L13
            android.view.ViewParent r0 = r2.getParent()
        La:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            goto La
        L13:
            return
    }

    public static long H(int r13, java.lang.String r14) {
            r0 = 0
            int r1 = r(r0, r14, r0, r13)
            java.util.regex.Pattern r2 = defpackage.c51.n
            java.util.regex.Matcher r2 = r2.matcher(r14)
            r3 = -1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L12:
            r10 = 2
            r11 = 1
            if (r1 >= r13) goto Lbb
            int r12 = r1 + 1
            int r12 = r(r11, r14, r12, r13)
            r2.region(r1, r12)
            if (r5 != r3) goto L50
            java.util.regex.Pattern r1 = defpackage.c51.n
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L50
            java.lang.String r1 = r2.group(r11)
            r1.getClass()
            int r5 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = r2.group(r10)
            r1.getClass()
            int r8 = java.lang.Integer.parseInt(r1)
            r1 = 3
            java.lang.String r1 = r2.group(r1)
            r1.getClass()
            int r9 = java.lang.Integer.parseInt(r1)
            goto Lb3
        L50:
            if (r6 != r3) goto L6a
            java.util.regex.Pattern r1 = defpackage.c51.m
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L6a
            java.lang.String r1 = r2.group(r11)
            r1.getClass()
            int r6 = java.lang.Integer.parseInt(r1)
            goto Lb3
        L6a:
            if (r7 != r3) goto L9a
            java.util.regex.Pattern r1 = defpackage.c51.l
            java.util.regex.Matcher r10 = r2.usePattern(r1)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L9a
            java.lang.String r7 = r2.group(r11)
            r7.getClass()
            java.util.Locale r10 = java.util.Locale.US
            r10.getClass()
            java.lang.String r7 = r7.toLowerCase(r10)
            r7.getClass()
            java.lang.String r1 = r1.pattern()
            r1.getClass()
            r10 = 6
            int r1 = defpackage.qs6.t0(r1, r7, r0, r0, r10)
            int r7 = r1 / 4
            goto Lb3
        L9a:
            if (r4 != r3) goto Lb3
            java.util.regex.Pattern r1 = defpackage.c51.k
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto Lb3
            java.lang.String r1 = r2.group(r11)
            r1.getClass()
            int r4 = java.lang.Integer.parseInt(r1)
        Lb3:
            int r12 = r12 + 1
            int r1 = r(r0, r14, r12, r13)
            goto L12
        Lbb:
            r13 = 70
            if (r13 > r4) goto Lc5
            r14 = 100
            if (r4 >= r14) goto Lc5
            int r4 = r4 + 1900
        Lc5:
            if (r4 < 0) goto Lcb
            if (r4 >= r13) goto Lcb
            int r4 = r4 + 2000
        Lcb:
            r13 = 1601(0x641, float:2.243E-42)
            r1 = 0
            java.lang.String r14 = "Failed requirement."
            if (r4 < r13) goto L12d
            if (r7 == r3) goto L129
            if (r11 > r6) goto L125
            r13 = 32
            if (r6 >= r13) goto L125
            if (r5 < 0) goto L121
            r13 = 24
            if (r5 >= r13) goto L121
            if (r8 < 0) goto L11d
            r13 = 60
            if (r8 >= r13) goto L11d
            if (r9 < 0) goto L119
            if (r9 >= r13) goto L119
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            java.util.TimeZone r14 = defpackage.az7.a
            r13.<init>(r14)
            r13.setLenient(r0)
            r13.set(r11, r4)
            int r7 = r7 - r11
            r13.set(r10, r7)
            r14 = 5
            r13.set(r14, r6)
            r14 = 11
            r13.set(r14, r5)
            r14 = 12
            r13.set(r14, r8)
            r14 = 13
            r13.set(r14, r9)
            r14 = 14
            r13.set(r14, r0)
            long r13 = r13.getTimeInMillis()
            return r13
        L119:
            defpackage.i.h(r14)
            return r1
        L11d:
            defpackage.i.h(r14)
            return r1
        L121:
            defpackage.i.h(r14)
            return r1
        L125:
            defpackage.i.h(r14)
            return r1
        L129:
            defpackage.i.h(r14)
            return r1
        L12d:
            defpackage.i.h(r14)
            return r1
    }

    public static final defpackage.vr4 I(defpackage.o6 r2) {
            boolean r0 = r2 instanceof defpackage.m6
            r1 = 0
            if (r0 == 0) goto L1c
            m6 r2 = (defpackage.m6) r2
            bb5 r2 = r2.a
            int r0 = r2.b
            if (r0 <= 0) goto L1c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            vr4 r1 = new vr4
            r1.<init>(r0, r2)
        L1c:
            return r1
    }

    public static void J(boolean r3, defpackage.gx3 r4, defpackage.qb0 r5, defpackage.uj1 r6) {
            r4.getClass()
            r5.getClass()
            r6.getClass()
            d51 r0 = new d51
            r1 = 24
            r0.<init>(r5, r1)
            uo2 r1 = new uo2
            r2 = 0
            r1.<init>(r2, r4, r0)
            r4.a(r6, r1)
            if (r3 == 0) goto L2d
            g15 r3 = new g15
            r6 = 11
            r3.<init>(r4, r6)
            uj1 r4 = defpackage.u24.j()
            hl5 r5 = r5.c
            if (r5 == 0) goto L2d
            r5.a(r4, r3)
        L2d:
            return
    }

    public static final defpackage.j04 K(defpackage.b9 r8, defpackage.qn2 r9, defpackage.px0 r10, int r11) {
            defpackage.np2.b0(r8, r10)
            qa4 r5 = defpackage.np2.b0(r9, r10)
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            xq2 r10 = (defpackage.xq2) r10
            java.lang.Object r0 = r10.P()
            vs0 r7 = defpackage.ox0.a
            if (r0 != r7) goto L1d
            c5 r0 = new c5
            r1 = 6
            r0.<init>(r1)
            r10.l0(r0)
        L1d:
            on2 r0 = (defpackage.on2) r0
            r1 = 48
            java.lang.Object r11 = defpackage.qo2.I(r11, r0, r10, r1)
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            py0 r11 = defpackage.wx3.a
            java.lang.Object r11 = r10.j(r11)
            l9 r11 = (defpackage.l9) r11
            r0 = 0
            if (r11 != 0) goto L58
            r11 = 1213380307(0x4852b6d3, float:215771.3)
            r10.b0(r11)
            nq6 r11 = defpackage.kf.b
            java.lang.Object r11 = r10.j(r11)
            android.content.Context r11 = (android.content.Context) r11
        L41:
            boolean r1 = r11 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L51
            boolean r1 = r11 instanceof defpackage.l9
            if (r1 == 0) goto L4a
            goto L52
        L4a:
            android.content.ContextWrapper r11 = (android.content.ContextWrapper) r11
            android.content.Context r11 = r11.getBaseContext()
            goto L41
        L51:
            r11 = r0
        L52:
            l9 r11 = (defpackage.l9) r11
        L54:
            r10.p(r9)
            goto L5f
        L58:
            r1 = 1213379439(0x4852b36f, float:215757.73)
            r10.b0(r1)
            goto L54
        L5f:
            if (r11 == 0) goto Ld6
            j9 r2 = r11.g()
            java.lang.Object r9 = r10.P()
            if (r9 != r7) goto L73
            e9 r9 = new e9
            r9.<init>()
            r10.l0(r9)
        L73:
            r1 = r9
            e9 r1 = (defpackage.e9) r1
            java.lang.Object r9 = r10.P()
            if (r9 != r7) goto L84
            j04 r9 = new j04
            r9.<init>(r1)
            r10.l0(r9)
        L84:
            j04 r9 = (defpackage.j04) r9
            boolean r11 = r10.h(r1)
            boolean r0 = r10.h(r2)
            r11 = r11 | r0
            boolean r0 = r10.f(r3)
            r11 = r11 | r0
            boolean r0 = r10.h(r8)
            r11 = r11 | r0
            boolean r0 = r10.f(r5)
            r11 = r11 | r0
            java.lang.Object r0 = r10.P()
            if (r11 != 0) goto La9
            if (r0 != r7) goto La7
            goto La9
        La7:
            r4 = r8
            goto Lb3
        La9:
            d5 r0 = new d5
            r6 = 1
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.l0(r0)
        Lb3:
            qn2 r0 = (defpackage.qn2) r0
            boolean r8 = r10.f(r2)
            boolean r11 = r10.f(r3)
            r8 = r8 | r11
            boolean r11 = r10.f(r4)
            r8 = r8 | r11
            java.lang.Object r11 = r10.P()
            if (r8 != 0) goto Lcb
            if (r11 != r7) goto Ld3
        Lcb:
            el1 r11 = new el1
            r11.<init>(r0)
            r10.l0(r11)
        Ld3:
            el1 r11 = (defpackage.el1) r11
            return r9
        Ld6:
            java.lang.String r8 = "No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner"
            defpackage.i.m(r8)
            return r0
    }

    public static final void L(defpackage.v2 r7, defpackage.xa6 r8) {
            android.view.accessibility.AccessibilityNodeInfo r7 = r7.a
            ta6 r0 = r8.k()
            fb6 r1 = defpackage.bb6.f
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            r1 = 0
            if (r0 != 0) goto L12
            r0 = r1
        L12:
            bt0 r0 = (defpackage.bt0) r0
            r2 = 0
            if (r0 == 0) goto L23
            int r8 = r0.a
            int r0 = r0.b
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r8 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r8, r0, r2, r2)
            r7.setCollectionInfo(r8)
            return
        L23:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ta6 r3 = r8.k()
            fb6 r4 = defpackage.bb6.e
            ja4 r3 = r3.A
            java.lang.Object r3 = r3.g(r4)
            if (r3 != 0) goto L37
            goto L38
        L37:
            r1 = r3
        L38:
            if (r1 == 0) goto L60
            r1 = 4
            java.util.List r8 = defpackage.xa6.j(r1, r8)
            int r1 = r8.size()
            r3 = r2
        L44:
            if (r3 >= r1) goto L60
            java.lang.Object r4 = r8.get(r3)
            xa6 r4 = (defpackage.xa6) r4
            ta6 r5 = r4.k()
            fb6 r6 = defpackage.bb6.J
            ja4 r5 = r5.A
            boolean r5 = r5.c(r6)
            if (r5 == 0) goto L5d
            r0.add(r4)
        L5d:
            int r3 = r3 + 1
            goto L44
        L60:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L80
            boolean r8 = l(r0)
            r1 = 1
            if (r8 == 0) goto L6f
            r3 = r1
            goto L73
        L6f:
            int r3 = r0.size()
        L73:
            if (r8 == 0) goto L79
            int r1 = r0.size()
        L79:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r8 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r3, r1, r2, r2)
            r7.setCollectionInfo(r8)
        L80:
            return
    }

    public static void M(defpackage.j11 r18, android.view.View r19, float[] r20) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "\""
            java.lang.String r3 = " on View \""
            java.lang.String r4 = "CustomSupport"
            java.lang.String r5 = "unable to interpolate strings "
            java.lang.Class r6 = r1.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "set"
            r7.<init>(r8)
            java.lang.String r8 = r0.b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int[] r8 = defpackage.l81.a     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            i11 r9 = r0.c     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r9 = r9.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r8 = r8[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r9 = 3
            r10 = 2
            java.lang.Class r11 = java.lang.Integer.TYPE
            java.lang.Class r12 = java.lang.Float.TYPE
            r13 = 1
            r14 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            r16 = 0
            r17 = 1132396544(0x437f0000, float:255.0)
            switch(r8) {
                case 1: goto L155;
                case 2: goto L13f;
                case 3: goto Le6;
                case 4: goto L93;
                case 5: goto L7f;
                case 6: goto L5e;
                case 7: goto L3f;
                default: goto L3d;
            }
        L3d:
            goto L1b3
        L3f:
            java.lang.Class[] r0 = new java.lang.Class[]{r12}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        L55:
            r0 = move-exception
            goto L16c
        L58:
            r0 = move-exception
            goto L184
        L5b:
            r0 = move-exception
            goto L19c
        L5e:
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L71
            goto L73
        L71:
            r13 = r16
        L73:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        L7f:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r8.<init>(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.String r0 = r0.b     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r8.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.String r0 = r8.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            throw r6     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
        L93:
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r5 = (double) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r5 = java.lang.Math.pow(r5, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r5 = (float) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r5 = r5 * r17
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r5 = o(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6 = r20[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r11 = (double) r6     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r11 = java.lang.Math.pow(r11, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r6 = (float) r11     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r6 = r6 * r17
            int r6 = (int) r6     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r6 = o(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r8 = r20[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r10 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r10 = java.lang.Math.pow(r10, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r8 = (float) r10     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r8 = r8 * r17
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r8 = o(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r9 = r20[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r9 = r9 * r17
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r9 = o(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r9 = r9 << 24
            int r5 = r5 << 16
            r5 = r5 | r9
            int r6 = r6 << 8
            r5 = r5 | r6
            r5 = r5 | r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        Le6:
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r5 = (double) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r5 = java.lang.Math.pow(r5, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r5 = (float) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r5 = r5 * r17
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r5 = o(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6 = r20[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r11 = (double) r6     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r11 = java.lang.Math.pow(r11, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r6 = (float) r11     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r6 = r6 * r17
            int r6 = (int) r6     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r6 = o(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r8 = r20[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r10 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            double r10 = java.lang.Math.pow(r10, r14)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r8 = (float) r10     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r8 = r8 * r17
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r8 = o(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r9 = r20[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            float r9 = r9 * r17
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r9 = o(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r9 = r9 << 24
            int r5 = r5 << 16
            r5 = r5 | r9
            int r6 = r6 << 8
            r5 = r5 | r6
            r5 = r5 | r8
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r6.setColor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        L13f:
            java.lang.Class[] r0 = new java.lang.Class[]{r12}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        L155:
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r5 = r20[r16]     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5b
            return
        L16c:
            java.lang.String r5 = "Cannot invoke method "
            java.lang.StringBuilder r3 = defpackage.i61.t(r5, r7, r3)
            java.lang.String r1 = defpackage.lb4.y(r1)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1, r0)
            goto L1b3
        L184:
            java.lang.String r5 = "Cannot access method "
            java.lang.StringBuilder r3 = defpackage.i61.t(r5, r7, r3)
            java.lang.String r1 = defpackage.lb4.y(r1)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1, r0)
            goto L1b3
        L19c:
            java.lang.String r5 = "No method "
            java.lang.StringBuilder r3 = defpackage.i61.t(r5, r7, r3)
            java.lang.String r1 = defpackage.lb4.y(r1)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1, r0)
        L1b3:
            return
    }

    public static void N(int r6, defpackage.p11 r7, defpackage.l21 r8, boolean r9) {
            float r0 = r8.e0
            h11 r1 = r8.I
            h11 r2 = r1.f
            int r2 = r2.d()
            h11 r3 = r8.K
            h11 r4 = r3.f
            int r4 = r4.d()
            int r1 = r1.e()
            int r1 = r1 + r2
            int r3 = r3.e()
            int r3 = r4 - r3
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r2 != r4) goto L23
            r0 = r5
            goto L25
        L23:
            r2 = r1
            r4 = r3
        L25:
            int r1 = r8.r()
            int r3 = r4 - r2
            int r3 = r3 - r1
            if (r2 <= r4) goto L31
            int r3 = r2 - r4
            int r3 = r3 - r1
        L31:
            if (r3 <= 0) goto L38
            float r3 = (float) r3
            float r0 = r0 * r3
            float r0 = r0 + r5
        L36:
            int r0 = (int) r0
            goto L3b
        L38:
            float r3 = (float) r3
            float r0 = r0 * r3
            goto L36
        L3b:
            int r0 = r0 + r2
            int r3 = r0 + r1
            if (r2 <= r4) goto L42
            int r3 = r0 - r1
        L42:
            r8.K(r0, r3)
            int r6 = r6 + 1
            y(r6, r7, r8, r9)
            return
    }

    public static void O(int r7, defpackage.l21 r8, defpackage.p11 r9, defpackage.l21 r10, boolean r11) {
            float r0 = r10.e0
            h11 r1 = r10.I
            h11 r2 = r1.f
            int r2 = r2.d()
            int r1 = r1.e()
            int r1 = r1 + r2
            h11 r2 = r10.K
            h11 r3 = r2.f
            int r3 = r3.d()
            int r2 = r2.e()
            int r3 = r3 - r2
            if (r3 < r1) goto L67
            int r2 = r10.r()
            int r4 = r10.h0
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L57
            int r4 = r10.r
            r5 = 2
            if (r4 != r5) goto L45
            boolean r2 = r8 instanceof defpackage.m21
            if (r2 == 0) goto L38
            int r8 = r8.r()
            goto L3e
        L38:
            l21 r8 = r8.U
            int r8 = r8.r()
        L3e:
            float r2 = r10.e0
            float r2 = r2 * r6
            float r8 = (float) r8
            float r2 = r2 * r8
            int r2 = (int) r2
            goto L49
        L45:
            if (r4 != 0) goto L49
            int r2 = r3 - r1
        L49:
            int r8 = r10.u
            int r2 = java.lang.Math.max(r8, r2)
            int r8 = r10.v
            if (r8 <= 0) goto L57
            int r2 = java.lang.Math.min(r8, r2)
        L57:
            int r3 = r3 - r1
            int r3 = r3 - r2
            float r8 = (float) r3
            float r0 = r0 * r8
            float r0 = r0 + r6
            int r8 = (int) r0
            int r1 = r1 + r8
            int r2 = r2 + r1
            r10.K(r1, r2)
            int r7 = r7 + 1
            y(r7, r9, r10, r11)
        L67:
            return
    }

    public static void P(int r6, defpackage.p11 r7, defpackage.l21 r8) {
            float r0 = r8.f0
            h11 r1 = r8.J
            h11 r2 = r1.f
            int r2 = r2.d()
            h11 r3 = r8.L
            h11 r4 = r3.f
            int r4 = r4.d()
            int r1 = r1.e()
            int r1 = r1 + r2
            int r3 = r3.e()
            int r3 = r4 - r3
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r2 != r4) goto L23
            r0 = r5
            goto L25
        L23:
            r2 = r1
            r4 = r3
        L25:
            int r1 = r8.l()
            int r3 = r4 - r2
            int r3 = r3 - r1
            if (r2 <= r4) goto L31
            int r3 = r2 - r4
            int r3 = r3 - r1
        L31:
            if (r3 <= 0) goto L38
            float r3 = (float) r3
            float r0 = r0 * r3
            float r0 = r0 + r5
        L36:
            int r0 = (int) r0
            goto L3b
        L38:
            float r3 = (float) r3
            float r0 = r0 * r3
            goto L36
        L3b:
            int r3 = r2 + r0
            int r5 = r3 + r1
            if (r2 <= r4) goto L45
            int r3 = r2 - r0
            int r5 = r3 - r1
        L45:
            r8.L(r3, r5)
            int r6 = r6 + 1
            U(r6, r7, r8)
            return
    }

    public static void Q(int r7, defpackage.l21 r8, defpackage.p11 r9, defpackage.l21 r10) {
            float r0 = r10.f0
            h11 r1 = r10.J
            h11 r2 = r1.f
            int r2 = r2.d()
            int r1 = r1.e()
            int r1 = r1 + r2
            h11 r2 = r10.L
            h11 r3 = r2.f
            int r3 = r3.d()
            int r2 = r2.e()
            int r3 = r3 - r2
            if (r3 < r1) goto L66
            int r2 = r10.l()
            int r4 = r10.h0
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L56
            int r4 = r10.s
            r5 = 2
            if (r4 != r5) goto L44
            boolean r2 = r8 instanceof defpackage.m21
            if (r2 == 0) goto L38
            int r8 = r8.l()
            goto L3e
        L38:
            l21 r8 = r8.U
            int r8 = r8.l()
        L3e:
            float r2 = r0 * r6
            float r8 = (float) r8
            float r2 = r2 * r8
            int r2 = (int) r2
            goto L48
        L44:
            if (r4 != 0) goto L48
            int r2 = r3 - r1
        L48:
            int r8 = r10.x
            int r2 = java.lang.Math.max(r8, r2)
            int r8 = r10.y
            if (r8 <= 0) goto L56
            int r2 = java.lang.Math.min(r8, r2)
        L56:
            int r3 = r3 - r1
            int r3 = r3 - r2
            float r8 = (float) r3
            float r0 = r0 * r8
            float r0 = r0 + r6
            int r8 = (int) r0
            int r1 = r1 + r8
            int r2 = r2 + r1
            r10.L(r1, r2)
            int r7 = r7 + 1
            U(r7, r9, r10)
        L66:
            return
    }

    public static final android.graphics.Bitmap.Config R(int r3) {
            if (r3 != 0) goto L5
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            return r3
        L5:
            r0 = 1
            if (r3 != r0) goto Lb
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            return r3
        Lb:
            r0 = 2
            if (r3 != r0) goto L11
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            return r3
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1f
            r2 = 3
            if (r3 != r2) goto L1f
            android.graphics.Bitmap$Config r3 = defpackage.k2.b()
            return r3
        L1f:
            if (r0 < r1) goto L29
            r0 = 4
            if (r3 != r0) goto L29
            android.graphics.Bitmap$Config r3 = defpackage.k2.A()
            return r3
        L29:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            return r3
    }

    public static final java.lang.String S(byte r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "quotation mark '\"'"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "string escape sequence '\\'"
            return r1
        Lc:
            r0 = 4
            if (r1 != r0) goto L12
            java.lang.String r1 = "comma ','"
            return r1
        L12:
            r0 = 5
            if (r1 != r0) goto L18
            java.lang.String r1 = "colon ':'"
            return r1
        L18:
            r0 = 6
            if (r1 != r0) goto L1e
            java.lang.String r1 = "start of the object '{'"
            return r1
        L1e:
            r0 = 7
            if (r1 != r0) goto L24
            java.lang.String r1 = "end of the object '}'"
            return r1
        L24:
            r0 = 8
            if (r1 != r0) goto L2b
            java.lang.String r1 = "start of the array '['"
            return r1
        L2b:
            r0 = 9
            if (r1 != r0) goto L32
            java.lang.String r1 = "end of the array ']'"
            return r1
        L32:
            r0 = 10
            if (r1 != r0) goto L39
            java.lang.String r1 = "end of the input"
            return r1
        L39:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L40
            java.lang.String r1 = "invalid token"
            return r1
        L40:
            java.lang.String r1 = "valid token"
            return r1
    }

    public static defpackage.ll0 T(defpackage.gx3 r1, defpackage.aw r2, java.util.concurrent.Executor r3) {
            ll0 r0 = new ll0
            r0.<init>(r2, r1)
            r1.a(r3, r0)
            return r0
    }

    public static void U(int r18, defpackage.p11 r19, defpackage.l21 r20) {
            r0 = r19
            r1 = r20
            boolean r2 = r1.n
            if (r2 == 0) goto La
            goto L112
        La:
            boolean r2 = r1 instanceof defpackage.m21
            if (r2 != 0) goto L22
            boolean r2 = r1.A()
            if (r2 == 0) goto L22
            boolean r2 = m(r1)
            if (r2 == 0) goto L22
            e30 r2 = new e30
            r2.<init>()
            defpackage.m21.W(r1, r0, r2)
        L22:
            g11 r2 = defpackage.g11.TOP
            h11 r2 = r1.j(r2)
            g11 r3 = defpackage.g11.BOTTOM
            h11 r3 = r1.j(r3)
            int r4 = r2.d()
            int r5 = r3.d()
            java.util.HashSet r6 = r2.a
            r8 = 8
            r10 = 1
            if (r6 == 0) goto L10a
            boolean r2 = r2.c
            if (r2 == 0) goto L10a
            java.util.Iterator r2 = r6.iterator()
        L45:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L10a
            java.lang.Object r6 = r2.next()
            h11 r6 = (defpackage.h11) r6
            l21 r11 = r6.d
            int r12 = r18 + 1
            boolean r13 = m(r11)
            h11 r14 = r11.J
            h11 r15 = r11.L
            boolean r16 = r11.A()
            if (r16 == 0) goto L70
            if (r13 == 0) goto L70
            r16 = 0
            e30 r7 = new e30
            r7.<init>()
            defpackage.m21.W(r11, r0, r7)
            goto L72
        L70:
            r16 = 0
        L72:
            if (r6 != r14) goto L7c
            h11 r7 = r15.f
            if (r7 == 0) goto L7c
            boolean r7 = r7.c
            if (r7 != 0) goto L86
        L7c:
            if (r6 != r15) goto L88
            h11 r7 = r14.f
            if (r7 == 0) goto L88
            boolean r7 = r7.c
            if (r7 == 0) goto L88
        L86:
            r7 = r10
            goto L89
        L88:
            r7 = 0
        L89:
            k21[] r9 = r11.T
            r9 = r9[r10]
            r17 = r10
            k21 r10 = defpackage.k21.MATCH_CONSTRAINT
            if (r9 != r10) goto Lc4
            if (r13 == 0) goto L96
            goto Lc4
        L96:
            if (r9 != r10) goto Lca
            int r6 = r11.y
            if (r6 < 0) goto Lca
            int r6 = r11.x
            if (r6 < 0) goto Lca
            int r6 = r11.h0
            if (r6 == r8) goto Lae
            int r6 = r11.s
            if (r6 != 0) goto Lca
            float r6 = r11.X
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 != 0) goto Lca
        Lae:
            boolean r6 = r11.z()
            if (r6 != 0) goto Lca
            boolean r6 = r11.F
            if (r6 != 0) goto Lca
            if (r7 == 0) goto Lca
            boolean r6 = r11.z()
            if (r6 != 0) goto Lca
            Q(r12, r1, r0, r11)
            goto Lca
        Lc4:
            boolean r9 = r11.A()
            if (r9 == 0) goto Lce
        Lca:
            r10 = r17
            goto L45
        Lce:
            if (r6 != r14) goto Le5
            h11 r9 = r15.f
            if (r9 != 0) goto Le5
            int r6 = r14.e()
            int r6 = r6 + r4
            int r7 = r11.l()
            int r7 = r7 + r6
            r11.L(r6, r7)
            U(r12, r0, r11)
            goto Lca
        Le5:
            if (r6 != r15) goto Lfe
            h11 r6 = r14.f
            if (r6 != 0) goto Lfe
            int r6 = r15.e()
            int r6 = r4 - r6
            int r7 = r11.l()
            int r7 = r6 - r7
            r11.L(r7, r6)
            U(r12, r0, r11)
            goto Lca
        Lfe:
            if (r7 == 0) goto Lca
            boolean r6 = r11.z()
            if (r6 != 0) goto Lca
            P(r12, r0, r11)
            goto Lca
        L10a:
            r17 = r10
            r16 = 0
            boolean r2 = r1 instanceof defpackage.av2
            if (r2 == 0) goto L113
        L112:
            return
        L113:
            java.util.HashSet r2 = r3.a
            if (r2 == 0) goto L1de
            boolean r3 = r3.c
            if (r3 == 0) goto L1de
            java.util.Iterator r2 = r2.iterator()
        L11f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1de
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r4 = r3.d
            int r6 = r18 + 1
            boolean r7 = m(r4)
            h11 r9 = r4.J
            h11 r10 = r4.L
            boolean r11 = r4.A()
            if (r11 == 0) goto L147
            if (r7 == 0) goto L147
            e30 r11 = new e30
            r11.<init>()
            defpackage.m21.W(r4, r0, r11)
        L147:
            if (r3 != r9) goto L151
            h11 r11 = r10.f
            if (r11 == 0) goto L151
            boolean r11 = r11.c
            if (r11 != 0) goto L15b
        L151:
            if (r3 != r10) goto L15e
            h11 r11 = r9.f
            if (r11 == 0) goto L15e
            boolean r11 = r11.c
            if (r11 == 0) goto L15e
        L15b:
            r11 = r17
            goto L15f
        L15e:
            r11 = 0
        L15f:
            k21[] r12 = r4.T
            r12 = r12[r17]
            k21 r13 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r13) goto L198
            if (r7 == 0) goto L16a
            goto L198
        L16a:
            if (r12 != r13) goto L11f
            int r3 = r4.y
            if (r3 < 0) goto L11f
            int r3 = r4.x
            if (r3 < 0) goto L11f
            int r3 = r4.h0
            if (r3 == r8) goto L182
            int r3 = r4.s
            if (r3 != 0) goto L11f
            float r3 = r4.X
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L11f
        L182:
            boolean r3 = r4.z()
            if (r3 != 0) goto L11f
            boolean r3 = r4.F
            if (r3 != 0) goto L11f
            if (r11 == 0) goto L11f
            boolean r3 = r4.z()
            if (r3 != 0) goto L11f
            Q(r6, r1, r0, r4)
            goto L11f
        L198:
            boolean r7 = r4.A()
            if (r7 == 0) goto L19f
            goto L11f
        L19f:
            if (r3 != r9) goto L1b7
            h11 r7 = r10.f
            if (r7 != 0) goto L1b7
            int r3 = r9.e()
            int r3 = r3 + r5
            int r7 = r4.l()
            int r7 = r7 + r3
            r4.L(r3, r7)
            U(r6, r0, r4)
            goto L11f
        L1b7:
            if (r3 != r10) goto L1d1
            h11 r3 = r9.f
            if (r3 != 0) goto L1d1
            int r3 = r10.e()
            int r3 = r5 - r3
            int r7 = r4.l()
            int r7 = r3 - r7
            r4.L(r7, r3)
            U(r6, r0, r4)
            goto L11f
        L1d1:
            if (r11 == 0) goto L11f
            boolean r3 = r4.z()
            if (r3 != 0) goto L11f
            P(r6, r0, r4)
            goto L11f
        L1de:
            g11 r2 = defpackage.g11.BASELINE
            h11 r2 = r1.j(r2)
            java.util.HashSet r3 = r2.a
            if (r3 == 0) goto L25f
            boolean r3 = r2.c
            if (r3 == 0) goto L25f
            int r3 = r2.d()
            java.util.HashSet r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
        L1f6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L25f
            java.lang.Object r4 = r2.next()
            h11 r4 = (defpackage.h11) r4
            l21 r5 = r4.d
            int r10 = r18 + 1
            boolean r6 = m(r5)
            h11 r7 = r5.M
            boolean r8 = r5.A()
            if (r8 == 0) goto L21c
            if (r6 == 0) goto L21c
            e30 r8 = new e30
            r8.<init>()
            defpackage.m21.W(r5, r0, r8)
        L21c:
            k21[] r8 = r5.T
            r8 = r8[r17]
            k21 r9 = defpackage.k21.MATCH_CONSTRAINT
            if (r8 != r9) goto L22a
            if (r6 == 0) goto L227
            goto L22a
        L227:
            r4 = r17
            goto L25c
        L22a:
            boolean r6 = r5.A()
            if (r6 == 0) goto L231
            goto L1f6
        L231:
            if (r4 != r7) goto L227
            int r4 = r4.e()
            int r4 = r4 + r3
            boolean r6 = r5.E
            if (r6 != 0) goto L23f
            r4 = r17
            goto L259
        L23f:
            int r6 = r5.b0
            int r6 = r4 - r6
            int r8 = r5.W
            int r8 = r8 + r6
            r5.a0 = r6
            h11 r9 = r5.J
            r9.l(r6)
            h11 r6 = r5.L
            r6.l(r8)
            r7.l(r4)
            r4 = r17
            r5.l = r4
        L259:
            U(r10, r0, r5)
        L25c:
            r17 = r4
            goto L1f6
        L25f:
            r4 = r17
            r1.n = r4
            return
    }

    public static final void a(java.lang.String r11, float r12, defpackage.px0 r13, int r14) {
            r4 = r13
            xq2 r4 = (defpackage.xq2) r4
            r13 = -303455014(0xffffffffede9a4da, float:-9.0386626E27)
            r4.d0(r13)
            boolean r13 = r4.f(r11)
            r8 = 2
            if (r13 == 0) goto L12
            r13 = 4
            goto L13
        L12:
            r13 = r8
        L13:
            r13 = r13 | r14
            r0 = r13 & 19
            r1 = 18
            r9 = 1
            r10 = 0
            if (r0 == r1) goto L1e
            r0 = r9
            goto L1f
        L1e:
            r0 = r10
        L1f:
            r13 = r13 & r9
            boolean r13 = r4.S(r13, r0)
            if (r13 == 0) goto Lf8
            es7 r13 = defpackage.bl2.F(r4)
            r0 = 1047904911(0x3e75c28f, float:0.24)
            float r0 = r0 * r12
            y16 r0 = defpackage.z16.b(r0)
            x64 r1 = defpackage.x64.a
            a74 r2 = defpackage.dj6.i(r1, r12)
            a74 r2 = defpackage.u24.g(r2, r0)
            long r5 = r13.e
            jy2 r3 = defpackage.u24.m
            a74 r2 = defpackage.vy7.L(r2, r5, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            long r5 = r13.f
            a74 r0 = defpackage.ak7.I(r2, r3, r5, r0)
            e40 r2 = defpackage.d90.Z
            e34 r2 = defpackage.h70.d(r2, r10)
            long r5 = r4.T
            int r3 = java.lang.Long.hashCode(r5)
            xv4 r5 = r4.l()
            a74 r0 = E(r4, r0)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            iy0 r6 = defpackage.ix0.b
            r4.f0()
            boolean r7 = r4.S
            if (r7 == 0) goto L72
            r4.k(r6)
            goto L75
        L72:
            r4.o0()
        L75:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r4, r6, r2)
            pn r2 = defpackage.ix0.e
            defpackage.yh2.K(r4, r2, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            pn r3 = defpackage.ix0.g
            defpackage.yh2.K(r4, r3, r2)
            ne r2 = defpackage.ix0.h
            defpackage.yh2.F(r4, r2)
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r4, r2, r0)
            nq6 r0 = defpackage.q83.a
            java.lang.Object r0 = r4.j(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc2
            r0 = 1660904686(0x62ff64ee, float:2.3555962E21)
            r4.b0(r0)
            e33 r0 = defpackage.q60.F()
            long r2 = r13.i
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r12
            a74 r13 = defpackage.dj6.i(r1, r13)
            r6 = 48
            r7 = 0
            r1 = 0
            r5 = r4
            r3 = r2
            r2 = r13
            defpackage.i13.a(r0, r1, r2, r3, r5, r6, r7)
            r4 = r5
            r4.p(r10)
            goto Lf4
        Lc2:
            r13 = 1661038110(0x63016e1e, float:2.3875648E21)
            r4.b0(r13)
            x23 r13 = new x23
            nq6 r0 = defpackage.kf.b
            java.lang.Object r0 = r4.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            r13.<init>(r0)
            r13.c = r11
            r13.b(r9)
            z23 r0 = r13.a()
            r13 = 2131230984(0x7f080108, float:1.8078036E38)
            sr4 r2 = defpackage.kj2.R(r4, r13)
            sr4 r3 = defpackage.kj2.R(r4, r13)
            lc2 r1 = defpackage.dj6.c
            r5 = 37296(0x91b0, float:5.2263E-41)
            defpackage.gi2.a(r0, r1, r2, r3, r4, r5)
            r4.p(r10)
        Lf4:
            r4.p(r9)
            goto Lfb
        Lf8:
            r4.V()
        Lfb:
            cf5 r13 = r4.t()
            if (r13 == 0) goto L108
            fq1 r0 = new fq1
            r0.<init>(r11, r12, r14, r8)
            r13.d = r0
        L108:
            return
    }

    public static final void b(defpackage.o6 r72, boolean r73, defpackage.on2 r74, defpackage.px0 r75, int r76) {
            r2 = r73
            r3 = r74
            r72.getClass()
            r3.getClass()
            r7 = r75
            xq2 r7 = (defpackage.xq2) r7
            r0 = 476282129(0x1c637d11, float:7.5269644E-22)
            r7.d0(r0)
            r1 = r72
            boolean r0 = r7.f(r1)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r76 | r0
            boolean r4 = r7.g(r2)
            if (r4 == 0) goto L2a
            r4 = 32
            goto L2c
        L2a:
            r4 = 16
        L2c:
            r0 = r0 | r4
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 1
            r8 = 0
            if (r4 == r5) goto L37
            r4 = r6
            goto L38
        L37:
            r4 = r8
        L38:
            r0 = r0 & r6
            boolean r0 = r7.S(r0, r4)
            if (r0 == 0) goto L738
            es7 r0 = defpackage.bl2.F(r7)
            o75 r4 = r1.a()
            boolean r27 = C(r1)
            vr4 r5 = I(r1)
            java.lang.Object r9 = r7.P()
            vs0 r10 = defpackage.ox0.a
            if (r9 != r10) goto L61
            x7 r9 = new x7
            r11 = 23
            r9.<init>(r11, r3)
            r7.l0(r9)
        L61:
            on2 r9 = (defpackage.on2) r9
            defpackage.ge7.b(r8, r9, r7, r8, r6)
            lc2 r9 = defpackage.dj6.c
            r11 = 3859285769(0xe6080709, double:1.906740516E-314)
            long r11 = defpackage.hv.c(r11)
            jy2 r13 = defpackage.u24.m
            a74 r9 = defpackage.vy7.L(r9, r11, r13)
            java.lang.Object r11 = r7.P()
            if (r11 != r10) goto L86
            m01 r11 = new m01
            r12 = 5
            r11.<init>(r12, r3)
            r7.l0(r11)
        L86:
            qn2 r11 = (defpackage.qn2) r11
            a74 r14 = defpackage.u24.B(r9, r11)
            java.lang.Object r9 = r7.P()
            if (r9 != r10) goto L96
            r94 r9 = defpackage.i61.f(r7)
        L96:
            r15 = r9
            r94 r15 = (defpackage.r94) r15
            java.lang.Object r9 = r7.P()
            if (r9 != r10) goto La9
            x7 r9 = new x7
            r11 = 24
            r9.<init>(r11, r3)
            r7.l0(r9)
        La9:
            r19 = r9
            on2 r19 = (defpackage.on2) r19
            r20 = 28
            r16 = 0
            r17 = 0
            r18 = 0
            a74 r9 = defpackage.mb3.t(r14, r15, r16, r17, r18, r19, r20)
            e40 r11 = defpackage.d90.Z
            e34 r11 = defpackage.h70.d(r11, r8)
            long r14 = r7.T
            int r12 = java.lang.Long.hashCode(r14)
            xv4 r14 = r7.l()
            a74 r9 = E(r7, r9)
            ix0 r15 = defpackage.jx0.i
            r15.getClass()
            iy0 r15 = defpackage.ix0.b
            r7.f0()
            boolean r8 = r7.S
            if (r8 == 0) goto Ldf
            r7.k(r15)
            goto Le2
        Ldf:
            r7.o0()
        Le2:
            pn r8 = defpackage.ix0.f
            defpackage.yh2.K(r7, r8, r11)
            pn r11 = defpackage.ix0.e
            defpackage.yh2.K(r7, r11, r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            pn r14 = defpackage.ix0.g
            defpackage.yh2.K(r7, r14, r12)
            ne r12 = defpackage.ix0.h
            defpackage.yh2.F(r7, r12)
            pn r6 = defpackage.ix0.d
            defpackage.yh2.K(r7, r6, r9)
            c40 r9 = defpackage.d90.l0
            r1 = 1103101952(0x41c00000, float:24.0)
            x64 r2 = defpackage.x64.a
            a74 r1 = defpackage.ge7.O(r2, r1)
            r3 = 1137180672(0x43c80000, float:400.0)
            r17 = r5
            r5 = 1
            a74 r1 = defpackage.dj6.m(r3, r5, r1)
            r3 = 1099956224(0x41900000, float:18.0)
            y16 r5 = defpackage.z16.b(r3)
            a74 r1 = defpackage.u24.g(r1, r5)
            r28 = r3
            r5 = r4
            long r3 = r0.c
            r19 = r5
            r18 = r6
            long r5 = r0.i
            r20 = r5
            long r5 = r0.l
            a74 r1 = defpackage.vy7.L(r1, r3, r13)
            long r3 = r0.f
            r22 = r5
            y16 r5 = defpackage.z16.b(r28)
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r29 = defpackage.ak7.I(r1, r6, r3, r5)
            java.lang.Object r1 = r7.P()
            if (r1 != r10) goto L147
            r94 r1 = defpackage.i61.f(r7)
        L147:
            r30 = r1
            r94 r30 = (defpackage.r94) r30
            java.lang.Object r1 = r7.P()
            r3 = 17
            if (r1 != r10) goto L15b
            c5 r1 = new c5
            r1.<init>(r3)
            r7.l0(r1)
        L15b:
            r34 = r1
            on2 r34 = (defpackage.on2) r34
            r35 = 28
            r31 = 0
            r32 = 0
            r33 = 0
            a74 r1 = defpackage.mb3.t(r29, r30, r31, r32, r33, r34, r35)
            r4 = 1102053376(0x41b00000, float:22.0)
            a74 r1 = defpackage.ge7.P(r1, r4, r4)
            eu r4 = defpackage.ju.c
            r5 = 48
            yt0 r4 = defpackage.wt0.a(r4, r9, r7, r5)
            long r9 = r7.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r7.l()
            a74 r1 = E(r7, r1)
            r7.f0()
            r24 = r3
            boolean r3 = r7.S
            if (r3 == 0) goto L194
            r7.k(r15)
            goto L197
        L194:
            r7.o0()
        L197:
            defpackage.yh2.K(r7, r8, r4)
            defpackage.yh2.K(r7, r11, r10)
            defpackage.i61.w(r9, r7, r14, r7, r12)
            r3 = r18
            defpackage.yh2.K(r7, r3, r1)
            if (r27 == 0) goto L1b0
            r1 = r19
            java.net.URL r4 = r1.j
        L1ab:
            java.lang.String r4 = r4.toString()
            goto L1b5
        L1b0:
            r1 = r19
            java.net.URL r4 = r1.k
            goto L1ab
        L1b5:
            r4.getClass()
            r9 = 1118306304(0x42a80000, float:84.0)
            a(r4, r9, r7, r5)
            r4 = 1096810496(0x41600000, float:14.0)
            a74 r9 = defpackage.dj6.e(r2, r4)
            defpackage.gi2.h(r7, r9)
            d40 r9 = defpackage.d90.i0
            du r10 = defpackage.ju.a
            l26 r4 = defpackage.k26.a(r10, r9, r7, r5)
            long r5 = r7.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r7.l()
            r26 = r1
            a74 r1 = E(r7, r2)
            r7.f0()
            r29 = r9
            boolean r9 = r7.S
            if (r9 == 0) goto L1eb
            r7.k(r15)
            goto L1ee
        L1eb:
            r7.o0()
        L1ee:
            defpackage.yh2.K(r7, r8, r4)
            defpackage.yh2.K(r7, r11, r6)
            defpackage.i61.w(r5, r7, r14, r7, r12)
            defpackage.yh2.K(r7, r3, r1)
            java.lang.String r4 = r26.a()
            r9 = r7
            long r6 = r0.g
            r1 = r11
            pi2 r11 = defpackage.qs7.a
            long r30 = defpackage.hi2.E(r24)
            r5 = r10
            oj2 r10 = defpackage.oj2.e0
            r24 = r1
            r19 = r3
            r32 = r4
            r1 = 1065353216(0x3f800000, float:1.0)
            double r3 = (double) r1
            r33 = 0
            int r3 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            java.lang.String r35 = "invalid weight; must be greater than zero"
            if (r3 <= 0) goto L21e
        L21c:
            r3 = r5
            goto L222
        L21e:
            defpackage.n53.a(r35)
            goto L21c
        L222:
            vn3 r5 = new vn3
            r36 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r4 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
            if (r4 <= 0) goto L22f
            r4 = r36
        L22d:
            r1 = 0
            goto L231
        L22f:
            r4 = r1
            goto L22d
        L231:
            r5.<init>(r4, r1)
            r4 = r14
            wz6 r14 = new wz6
            r1 = 3
            r14.<init>(r1)
            r38 = 48
            r25 = 0
            r39 = r26
            r26 = 130448(0x1fd90, float:1.82797E-40)
            r41 = r12
            r40 = r13
            r12 = 0
            r42 = r15
            r43 = 1
            r15 = 0
            r44 = r17
            r17 = 0
            r45 = 1096810496(0x41600000, float:14.0)
            r18 = 0
            r46 = r19
            r19 = 0
            r47 = r20
            r20 = 0
            r21 = 0
            r49 = r22
            r22 = 0
            r23 = r24
            r24 = 1772544(0x1b0c00, float:2.483863E-39)
            r58 = r3
            r53 = r4
            r52 = r23
            r1 = r29
            r4 = r32
            r3 = r39
            r54 = r41
            r51 = r44
            r55 = r46
            r56 = r49
            r23 = r9
            r70 = r30
            r30 = r0
            r31 = r8
            r8 = r70
            r0 = 0
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            n75 r4 = r3.m
            n75 r5 = defpackage.n75.UNOFFICIAL
            r6 = 1090519040(0x41000000, float:8.0)
            if (r4 != r5) goto L2ac
            r4 = 925545895(0x372ab5a7, float:1.0175084E-5)
            r9.b0(r4)
            a74 r4 = defpackage.dj6.l(r2, r6)
            defpackage.gi2.h(r9, r4)
            e(r9, r0)
            r9.p(r0)
        L2aa:
            r5 = 1
            goto L2b6
        L2ac:
            r4 = 925647761(0x372c4391, float:1.026773E-5)
            r9.b0(r4)
            r9.p(r0)
            goto L2aa
        L2b6:
            r9.p(r5)
            a74 r4 = defpackage.dj6.e(r2, r6)
            defpackage.gi2.h(r9, r4)
            r5 = r58
            r4 = 48
            l26 r6 = defpackage.k26.a(r5, r1, r9, r4)
            long r7 = r9.T
            int r4 = java.lang.Long.hashCode(r7)
            xv4 r7 = r9.l()
            a74 r8 = E(r9, r2)
            r9.f0()
            boolean r10 = r9.S
            if (r10 == 0) goto L2e5
            r10 = r42
            r9.k(r10)
        L2e2:
            r11 = r31
            goto L2eb
        L2e5:
            r10 = r42
            r9.o0()
            goto L2e2
        L2eb:
            defpackage.yh2.K(r9, r11, r6)
            r6 = r52
            defpackage.yh2.K(r9, r6, r7)
            r7 = r53
            r12 = r54
            defpackage.i61.w(r4, r9, r7, r9, r12)
            r4 = r55
            defpackage.yh2.K(r9, r4, r8)
            if (r27 == 0) goto L30c
            r8 = 1857402206(0x6eb5b55e, float:2.8118023E28)
            r13 = 2131952475(0x7f13035b, float:1.9541394E38)
            java.lang.String r8 = defpackage.i61.l(r9, r8, r13, r9, r0)
            goto L316
        L30c:
            r8 = 1857499360(0x6eb730e0, float:2.8347422E28)
            r13 = 2131952466(0x7f130352, float:1.9541376E38)
            java.lang.String r8 = defpackage.i61.l(r9, r8, r13, r9, r0)
        L316:
            r13 = 1088421888(0x40e00000, float:7.0)
            a74 r13 = defpackage.dj6.i(r2, r13)
            y16 r14 = defpackage.z16.a()
            a74 r13 = defpackage.u24.g(r13, r14)
            if (r27 == 0) goto L32d
            r14 = r56
        L328:
            r58 = r5
            r5 = r40
            goto L330
        L32d:
            r14 = r47
            goto L328
        L330:
            a74 r13 = defpackage.vy7.L(r13, r14, r5)
            defpackage.h70.a(r13, r9, r0)
            r13 = 1086324736(0x40c00000, float:6.0)
            a74 r14 = defpackage.dj6.l(r2, r13)
            defpackage.gi2.h(r9, r14)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toUpperCase(r14)
            r8.getClass()
            if (r27 == 0) goto L34d
            r47 = r56
        L34d:
            r31 = r11
            sr2 r11 = defpackage.qs7.c
            r39 = 4621537642612260864(0x4023000000000000, double:9.5)
            r46 = r4
            r4 = r8
            r23 = r9
            long r8 = defpackage.hi2.D(r39)
            r42 = r10
            oj2 r10 = defpackage.oj2.d0
            r15 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            long r15 = defpackage.hi2.D(r15)
            r25 = 0
            r26 = 130834(0x1ff12, float:1.83337E-40)
            r17 = r5
            r5 = 0
            r18 = r14
            r14 = 0
            r54 = r12
            r19 = r13
            r12 = r15
            r15 = 0
            r20 = r17
            r17 = 0
            r21 = r18
            r18 = 0
            r22 = r19
            r19 = 0
            r24 = r20
            r20 = 0
            r27 = r21
            r21 = 0
            r32 = r22
            r22 = 0
            r37 = r24
            r24 = 14355456(0xdb0c00, float:2.0116278E-38)
            r60 = r6
            r61 = r7
            r0 = r27
            r59 = r31
            r63 = r46
            r6 = r47
            r62 = r54
            r64 = r58
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r4 = 1092616192(0x41200000, float:10.0)
            a74 r5 = defpackage.dj6.l(r2, r4)
            defpackage.gi2.h(r9, r5)
            int r5 = r3.h
            java.lang.String r6 = "· "
            java.lang.String r5 = defpackage.lb1.g(r5, r6)
            long r6 = defpackage.es7.p
            long r12 = defpackage.hi2.D(r39)
            r26 = 130962(0x1ff92, float:1.83517E-40)
            r8 = r4
            r4 = r5
            r5 = 0
            r14 = r8
            r8 = r12
            r12 = 0
            r15 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r24 = r22
            r22 = 0
            r27 = r24
            r24 = 1772928(0x1b0d80, float:2.484401E-39)
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27 = r10
            r9 = r23
            r4 = 1077936128(0x40400000, float:3.0)
            a74 r5 = defpackage.dj6.l(r2, r4)
            defpackage.gi2.h(r9, r5)
            r5 = 2131952378(0x7f1302fa, float:1.9541197E38)
            java.lang.String r5 = defpackage.yh2.O(r9, r5)
            java.lang.String r0 = r5.toUpperCase(r0)
            r0.getClass()
            r5 = 8
            long r12 = defpackage.hi2.E(r5)
            r26 = 130994(0x1ffb2, float:1.83562E-40)
            r5 = 0
            r10 = 0
            r8 = r12
            r12 = 0
            r24 = 1576320(0x180d80, float:2.208895E-39)
            r70 = r4
            r4 = r0
            r0 = r70
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r39 = r6
            r31 = r11
            r9 = r23
            r5 = 1
            r9.p(r5)
            r4 = 1096810496(0x41600000, float:14.0)
            a74 r4 = defpackage.dj6.e(r2, r4)
            defpackage.gi2.h(r9, r4)
            java.lang.String r4 = r3.g
            r5 = r30
            long r6 = r5.h
            r8 = 13
            long r10 = defpackage.hi2.E(r8)
            r8 = 19
            long r15 = defpackage.hi2.E(r8)
            wz6 r14 = new wz6
            r8 = 3
            r14.<init>(r8)
            r25 = 6
            r26 = 129522(0x1f9f2, float:1.81499E-40)
            r5 = 0
            r8 = r10
            r10 = 0
            r11 = 0
            r24 = 3072(0xc00, float:4.305E-42)
            r29 = r0
            r0 = r30
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r30 = 10
            r4 = r51
            if (r4 == 0) goto L5d8
            java.lang.Object r5 = r4.A
            java.lang.Object r4 = r4.B
            r6 = 157436200(0x9624928, float:2.7238158E-33)
            r9.b0(r6)
            r6 = 1098907648(0x41800000, float:16.0)
            a74 r6 = defpackage.dj6.e(r2, r6)
            defpackage.gi2.h(r9, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r7 = defpackage.dj6.c(r2, r6)
            r8 = r64
            r6 = 48
            l26 r10 = defpackage.k26.a(r8, r1, r9, r6)
            long r11 = r9.T
            int r6 = java.lang.Long.hashCode(r11)
            xv4 r11 = r9.l()
            a74 r7 = E(r9, r7)
            r9.f0()
            boolean r12 = r9.S
            if (r12 == 0) goto L4ab
            r12 = r42
            r9.k(r12)
        L4a8:
            r13 = r59
            goto L4b1
        L4ab:
            r12 = r42
            r9.o0()
            goto L4a8
        L4b1:
            defpackage.yh2.K(r9, r13, r10)
            r10 = r60
            defpackage.yh2.K(r9, r10, r11)
            r11 = r61
            r14 = r62
            defpackage.i61.w(r6, r9, r11, r9, r14)
            r6 = r63
            defpackage.yh2.K(r9, r6, r7)
            r32 = r3
            r15 = r4
            r7 = 1065353216(0x3f800000, float:1.0)
            double r3 = (double) r7
            int r3 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r3 <= 0) goto L4d0
            goto L4d3
        L4d0:
            defpackage.n53.a(r35)
        L4d3:
            vn3 r3 = new vn3
            int r4 = (r7 > r36 ? 1 : (r7 == r36 ? 0 : -1))
            if (r4 <= 0) goto L4dd
            r4 = r36
        L4db:
            r7 = 1
            goto L4e0
        L4dd:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L4db
        L4e0:
            r3.<init>(r4, r7)
            r4 = 1086324736(0x40c00000, float:6.0)
            a74 r3 = defpackage.dj6.e(r3, r4)
            y16 r7 = defpackage.z16.b(r29)
            a74 r3 = defpackage.u24.g(r3, r7)
            r7 = r5
            long r4 = r0.d
            r16 = r7
            r7 = r37
            a74 r3 = defpackage.vy7.L(r3, r4, r7)
            e40 r4 = defpackage.d90.L
            r5 = 0
            e34 r4 = defpackage.h70.d(r4, r5)
            r34 = r0
            r33 = r1
            long r0 = r9.T
            int r0 = java.lang.Long.hashCode(r0)
            xv4 r1 = r9.l()
            a74 r3 = E(r9, r3)
            r9.f0()
            boolean r5 = r9.S
            if (r5 == 0) goto L520
            r9.k(r12)
            goto L523
        L520:
            r9.o0()
        L523:
            defpackage.yh2.K(r9, r13, r4)
            defpackage.yh2.K(r9, r10, r1)
            defpackage.i61.w(r0, r9, r11, r9, r14)
            defpackage.yh2.K(r9, r6, r3)
            r4 = r15
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            r1 = 0
            if (r0 != 0) goto L53a
            goto L551
        L53a:
            r5 = r16
            java.lang.Number r5 = (java.lang.Number) r5
            int r0 = r5.intValue()
            float r0 = (float) r0
            r4 = r15
            java.lang.Number r4 = (java.lang.Number) r4
            float r3 = r4.floatValue()
            float r0 = r0 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = defpackage.gi2.p(r0, r1, r3)
        L551:
            a74 r0 = defpackage.dj6.c(r2, r1)
            r4 = 1086324736(0x40c00000, float:6.0)
            a74 r0 = defpackage.dj6.e(r0, r4)
            y16 r1 = defpackage.z16.b(r29)
            a74 r0 = defpackage.u24.g(r0, r1)
            r4 = r56
            a74 r0 = defpackage.vy7.L(r0, r4, r7)
            r1 = 0
            defpackage.h70.a(r0, r9, r1)
            r5 = 1
            r9.p(r5)
            r0 = 1092616192(0x41200000, float:10.0)
            a74 r0 = defpackage.dj6.l(r2, r0)
            defpackage.gi2.h(r9, r0)
            r0 = 2131951661(0x7f13002d, float:1.9539743E38)
            r7 = r16
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r15}
            java.lang.String r4 = defpackage.yh2.N(r0, r1, r9)
            r46 = r6
            r0 = r34
            long r6 = r0.i
            r58 = r8
            r23 = r9
            long r8 = defpackage.hi2.E(r30)
            r25 = 0
            r26 = 130994(0x1ffb2, float:1.83562E-40)
            r5 = 0
            r60 = r10
            r10 = 0
            r42 = r12
            r59 = r13
            r12 = 0
            r54 = r14
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r65 = 1086324736(0x40c00000, float:6.0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1575936(0x180c00, float:2.208357E-39)
            r67 = r11
            r11 = r31
            r1 = r42
            r69 = r46
            r68 = r54
            r3 = r58
            r31 = r59
            r66 = r60
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r5 = 1
            r9.p(r5)
            r5 = 0
            r9.p(r5)
            goto L5f6
        L5d8:
            r33 = r1
            r32 = r3
            r11 = r31
            r1 = r42
            r31 = r59
            r66 = r60
            r67 = r61
            r68 = r62
            r69 = r63
            r3 = r64
            r5 = 0
            r4 = 158709525(0x975b715, float:2.9576887E-33)
            r9.b0(r4)
            r9.p(r5)
        L5f6:
            r4 = 1094713344(0x41400000, float:12.0)
            if (r73 == 0) goto L643
            r5 = 158756707(0x9766f63, float:2.9663547E-33)
            r9.b0(r5)
            a74 r5 = defpackage.dj6.e(r2, r4)
            defpackage.gi2.h(r9, r5)
            r5 = 2131952320(0x7f1302c0, float:1.954108E38)
            java.lang.String r5 = defpackage.yh2.O(r9, r5)
            long r6 = r0.l
            long r12 = defpackage.hi2.E(r30)
            r25 = 0
            r26 = 130962(0x1ff92, float:1.83517E-40)
            r8 = r4
            r4 = r5
            r5 = 0
            r10 = r8
            r23 = r9
            r8 = r12
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1772544(0x1b0c00, float:2.483863E-39)
            r30 = r0
            r0 = r10
            r10 = r27
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r5 = 0
            r9.p(r5)
            goto L650
        L643:
            r30 = r0
            r0 = r4
            r5 = 0
            r4 = 159112277(0x97bdc55, float:3.0316626E-33)
            r9.b0(r4)
            r9.p(r5)
        L650:
            boolean r4 = r32.b()
            if (r4 == 0) goto L6ff
            r4 = 159178555(0x97cdf3b, float:3.043836E-33)
            r9.b0(r4)
            a74 r0 = defpackage.dj6.e(r2, r0)
            defpackage.gi2.h(r9, r0)
            r0 = r33
            r4 = 48
            l26 r0 = defpackage.k26.a(r3, r0, r9, r4)
            long r3 = r9.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r9.l()
            a74 r5 = E(r9, r2)
            r9.f0()
            boolean r6 = r9.S
            if (r6 == 0) goto L686
            r9.k(r1)
        L683:
            r11 = r31
            goto L68a
        L686:
            r9.o0()
            goto L683
        L68a:
            defpackage.yh2.K(r9, r11, r0)
            r1 = r66
            defpackage.yh2.K(r9, r1, r4)
            r11 = r67
            r12 = r68
            defpackage.i61.w(r3, r9, r11, r9, r12)
            r3 = r69
            defpackage.yh2.K(r9, r3, r5)
            r0 = 2131230980(0x7f080104, float:1.8078028E38)
            sr4 r4 = defpackage.kj2.R(r9, r0)
            r0 = 1097859072(0x41700000, float:15.0)
            a74 r6 = defpackage.dj6.i(r2, r0)
            r10 = 3512(0xdb8, float:4.921E-42)
            r11 = 0
            r5 = 0
            r7 = r39
            defpackage.i13.b(r4, r5, r6, r7, r9, r10, r11)
            r4 = 1086324736(0x40c00000, float:6.0)
            a74 r0 = defpackage.dj6.l(r2, r4)
            defpackage.gi2.h(r9, r0)
            r0 = 2131951660(0x7f13002c, float:1.953974E38)
            java.lang.String r4 = defpackage.yh2.O(r9, r0)
            r0 = r30
            long r6 = r0.i
            r0 = 11
            long r0 = defpackage.hi2.E(r0)
            r3 = 15
            long r15 = defpackage.hi2.E(r3)
            r25 = 6
            r26 = 130034(0x1fbf2, float:1.82216E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 3072(0xc00, float:4.305E-42)
            r23 = r9
            r8 = r0
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r5 = 1
            r9.p(r5)
            r5 = 0
            r9.p(r5)
        L6fc:
            r0 = r28
            goto L70a
        L6ff:
            r5 = 0
            r0 = 159910837(0x9880bb5, float:3.275182E-33)
            r9.b0(r0)
            r9.p(r5)
            goto L6fc
        L70a:
            a74 r0 = defpackage.dj6.e(r2, r0)
            defpackage.gi2.h(r9, r0)
            rq2 r0 = new rq2
            r1 = 2131952372(0x7f1302f4, float:1.9541185E38)
            java.lang.String r1 = defpackage.yh2.O(r9, r1)
            java.lang.String r2 = "B"
            r0.<init>(r2, r1)
            java.util.List r4 = defpackage.hf.b0(r0)
            r8 = 384(0x180, float:5.38E-43)
            r23 = r9
            r9 = 2
            r5 = 0
            r6 = 0
            r7 = r23
            defpackage.is7.a(r4, r5, r6, r7, r8, r9)
            r9 = r7
            r5 = 1
            r9.p(r5)
            r9.p(r5)
            goto L73c
        L738:
            r9 = r7
            r9.V()
        L73c:
            cf5 r6 = r9.t()
            if (r6 == 0) goto L752
            k91 r0 = new k91
            r5 = 2
            r1 = r72
            r2 = r73
            r3 = r74
            r4 = r76
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L752:
            return
    }

    public static final void c(defpackage.a74 r10, long r11, float r13, defpackage.px0 r14, int r15, int r16) {
            r0 = r14
            xq2 r0 = (defpackage.xq2) r0
            r1 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r0.d0(r1)
            r1 = r16 & 1
            if (r1 == 0) goto L10
            r2 = r15 | 6
            goto L20
        L10:
            r2 = r15 & 6
            if (r2 != 0) goto L1f
            boolean r2 = r0.f(r10)
            if (r2 == 0) goto L1c
            r2 = 4
            goto L1d
        L1c:
            r2 = 2
        L1d:
            r2 = r2 | r15
            goto L20
        L1f:
            r2 = r15
        L20:
            r3 = r15 & 48
            if (r3 != 0) goto L34
            r3 = r16 & 2
            if (r3 != 0) goto L31
            boolean r3 = r0.e(r11)
            if (r3 == 0) goto L31
            r3 = 32
            goto L33
        L31:
            r3 = 16
        L33:
            r2 = r2 | r3
        L34:
            r3 = r16 & 4
            if (r3 == 0) goto L3b
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L4b
        L3b:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L4b
            boolean r6 = r0.c(r13)
            if (r6 == 0) goto L48
            r6 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r6 = 128(0x80, float:1.8E-43)
        L4a:
            r2 = r2 | r6
        L4b:
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r6 = r2 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L57
            r6 = r9
            goto L58
        L57:
            r6 = r8
        L58:
            r2 = r2 & r9
            boolean r2 = r0.S(r2, r6)
            if (r2 == 0) goto Ld7
            r0.X()
            r2 = r15 & 1
            x64 r6 = defpackage.x64.a
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L76
            boolean r2 = r0.B()
            if (r2 == 0) goto L71
            goto L76
        L71:
            r0.V()
        L74:
            r4 = r13
            goto L93
        L76:
            if (r1 == 0) goto L79
            r10 = r6
        L79:
            r1 = r16 & 2
            if (r1 == 0) goto L90
            nq6 r11 = defpackage.vt0.a
            java.lang.Object r11 = r0.j(r11)
            ut0 r11 = (defpackage.ut0) r11
            long r11 = r11.f()
            r1 = 1039516303(0x3df5c28f, float:0.12)
            long r11 = defpackage.kt0.c(r1, r11)
        L90:
            if (r3 == 0) goto L74
            r4 = r7
        L93:
            r0.q()
            r1 = 0
            boolean r1 = defpackage.om1.b(r4, r1)
            if (r1 == 0) goto Lb5
            r1 = -455979798(0xffffffffe4d24cea, float:-3.1034868E22)
            r0.b0(r1)
            nq6 r1 = defpackage.ky0.h
            java.lang.Object r1 = r0.j(r1)
            qh1 r1 = (defpackage.qh1) r1
            float r1 = r1.a()
            float r1 = r7 / r1
            r0.p(r8)
            goto Lbf
        Lb5:
            r1 = -455913241(0xffffffffe4d350e7, float:-3.118474E22)
            r0.b0(r1)
            r0.p(r8)
            r1 = r4
        Lbf:
            a74 r2 = r10.d(r6)
            a74 r2 = defpackage.dj6.c(r2, r7)
            a74 r1 = defpackage.dj6.e(r2, r1)
            jy2 r2 = defpackage.u24.m
            a74 r1 = defpackage.vy7.L(r1, r11, r2)
            defpackage.h70.a(r1, r0, r8)
        Ld4:
            r1 = r10
            r2 = r11
            goto Ldc
        Ld7:
            r0.V()
            r4 = r13
            goto Ld4
        Ldc:
            cf5 r10 = r0.t()
            if (r10 == 0) goto Lec
            pl1 r0 = new pl1
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r4, r5, r6)
            r10.d = r0
        Lec:
            return
    }

    public static final void d(defpackage.pq5 r33, java.lang.String r34, defpackage.cu5 r35, defpackage.j06 r36, defpackage.oi4 r37, defpackage.on2 r38, defpackage.qn2 r39, defpackage.qn2 r40, defpackage.on2 r41, defpackage.eo2 r42, defpackage.on2 r43, defpackage.qn2 r44, defpackage.on2 r45, defpackage.on2 r46, defpackage.on2 r47, defpackage.qn2 r48, defpackage.eo2 r49, defpackage.px0 r50, int r51) {
            r3 = r33
            r15 = r39
            r3.getClass()
            r35.getClass()
            r36.getClass()
            r37.getClass()
            r38.getClass()
            r15.getClass()
            r40.getClass()
            r41.getClass()
            r42.getClass()
            r43.getClass()
            r44.getClass()
            r45.getClass()
            r46.getClass()
            r47.getClass()
            r0 = r50
            xq2 r0 = (defpackage.xq2) r0
            r1 = -344528107(0xffffffffeb76eb15, float:-2.985059E26)
            r0.d0(r1)
            boolean r1 = r0.h(r3)
            if (r1 == 0) goto L40
            r1 = 4
            goto L41
        L40:
            r1 = 2
        L41:
            r1 = r51 | r1
            r5 = r34
            boolean r6 = r0.f(r5)
            if (r6 == 0) goto L4e
            r6 = 32
            goto L50
        L4e:
            r6 = 16
        L50:
            r1 = r1 | r6
            r6 = r35
            boolean r9 = r0.f(r6)
            r11 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L5d
            r9 = r11
            goto L5f
        L5d:
            r9 = 1024(0x400, float:1.435E-42)
        L5f:
            r1 = r1 | r9
            r9 = r36
            boolean r12 = r0.f(r9)
            if (r12 == 0) goto L6b
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L6d
        L6b:
            r12 = 8192(0x2000, float:1.148E-41)
        L6d:
            r1 = r1 | r12
            r12 = r37
            boolean r16 = r0.f(r12)
            r17 = 65536(0x10000, float:9.1835E-41)
            r18 = 131072(0x20000, float:1.83671E-40)
            if (r16 == 0) goto L7d
            r16 = r18
            goto L7f
        L7d:
            r16 = r17
        L7f:
            r1 = r1 | r16
            r50 = r1
            r1 = r38
            boolean r16 = r0.h(r1)
            r19 = 524288(0x80000, float:7.34684E-40)
            if (r16 == 0) goto L90
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L92
        L90:
            r16 = r19
        L92:
            r16 = r50 | r16
            boolean r21 = r0.h(r15)
            r22 = 4194304(0x400000, float:5.877472E-39)
            if (r21 == 0) goto L9f
            r21 = 8388608(0x800000, float:1.1754944E-38)
            goto La1
        L9f:
            r21 = r22
        La1:
            r16 = r16 | r21
            r7 = r40
            boolean r23 = r0.h(r7)
            if (r23 == 0) goto Lae
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb0
        Lae:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        Lb0:
            r16 = r16 | r23
            r8 = r41
            boolean r24 = r0.h(r8)
            if (r24 == 0) goto Lbd
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lbf
        Lbd:
            r24 = 268435456(0x10000000, float:2.524355E-29)
        Lbf:
            r16 = r16 | r24
            r10 = r42
            boolean r25 = r0.h(r10)
            if (r25 == 0) goto Ld0
            r20 = 4
        Lcb:
            r25 = r11
            r11 = r43
            goto Ld3
        Ld0:
            r20 = 2
            goto Lcb
        Ld3:
            boolean r26 = r0.h(r11)
            if (r26 == 0) goto Ldc
            r21 = 32
            goto Lde
        Ldc:
            r21 = 16
        Lde:
            r20 = r20 | r21
            r13 = r44
            boolean r21 = r0.h(r13)
            if (r21 == 0) goto Leb
            r21 = 256(0x100, float:3.59E-43)
            goto Led
        Leb:
            r21 = 128(0x80, float:1.8E-43)
        Led:
            r20 = r20 | r21
            r14 = r45
            boolean r23 = r0.h(r14)
            if (r23 == 0) goto Lfa
            r24 = r25
            goto Lfc
        Lfa:
            r24 = 1024(0x400, float:1.435E-42)
        Lfc:
            r20 = r20 | r24
            r4 = r46
            boolean r24 = r0.h(r4)
            if (r24 == 0) goto L109
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L10b
        L109:
            r21 = 8192(0x2000, float:1.148E-41)
        L10b:
            r20 = r20 | r21
            r2 = r47
            boolean r21 = r0.h(r2)
            if (r21 == 0) goto L117
            r17 = r18
        L117:
            r17 = r20 | r17
            r1 = r48
            boolean r18 = r0.h(r1)
            if (r18 == 0) goto L123
            r19 = 1048576(0x100000, float:1.469368E-39)
        L123:
            r17 = r17 | r19
            r1 = r49
            boolean r18 = r0.h(r1)
            if (r18 == 0) goto L12f
            r22 = 8388608(0x800000, float:1.1754944E-38)
        L12f:
            r17 = r17 | r22
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r16 & r18
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L148
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r17 & r1
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 == r2) goto L146
            goto L148
        L146:
            r1 = 0
            goto L149
        L148:
            r1 = 1
        L149:
            r2 = r16 & 1
            boolean r1 = r0.S(r2, r1)
            if (r1 == 0) goto L2f1
            es7 r1 = defpackage.bl2.F(r0)
            vv5 r2 = defpackage.vv5.CONFIG
            int r2 = r2.getTabIndex()
            java.lang.Object r4 = r0.P()
            r20 = r1
            vs0 r1 = defpackage.ox0.a
            if (r4 != r1) goto L16e
            kt5 r4 = new kt5
            r5 = 1
            r4.<init>(r5)
            r0.l0(r4)
        L16e:
            on2 r4 = (defpackage.on2) r4
            or4 r5 = defpackage.pr4.a
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            ap3 r5 = defpackage.ue1.G
            r7 = 0
            boolean r7 = r0.c(r7)
            r21 = r7
            java.lang.Object r7 = r0.P()
            if (r21 != 0) goto L186
            if (r7 != r1) goto L18e
        L186:
            mz2 r7 = new mz2
            r7.<init>(r2, r4)
            r0.l0(r7)
        L18e:
            on2 r7 = (defpackage.on2) r7
            r2 = 0
            java.lang.Object r5 = defpackage.qo2.J(r6, r5, r7, r0, r2)
            ue1 r5 = (defpackage.ue1) r5
            vs4 r6 = r5.F
            r6.setValue(r4)
            int r4 = r5.k()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.f(r5)
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r17 & r7
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r7 != r2) goto L1b2
            r2 = 1
            goto L1b3
        L1b2:
            r2 = 0
        L1b3:
            r2 = r2 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r17 & r6
            r50 = r6
            r6 = 8388608(0x800000, float:1.1754944E-38)
            if (r7 != r6) goto L1c0
            r6 = 1
            goto L1c1
        L1c0:
            r6 = 0
        L1c1:
            r2 = r2 | r6
            java.lang.Object r6 = r0.P()
            if (r2 != 0) goto L1ca
            if (r6 != r1) goto L1de
        L1ca:
            ag r24 = new ag
            r28 = 0
            r29 = 13
            r26 = r48
            r27 = r49
            r25 = r5
            r24.<init>(r25, r26, r27, r28, r29)
            r6 = r24
            r0.l0(r6)
        L1de:
            eo2 r6 = (defpackage.eo2) r6
            defpackage.mb3.i(r0, r6, r4)
            java.lang.Object r2 = r0.P()
            if (r2 != r1) goto L1f1
            nh2 r2 = new nh2
            r2.<init>()
            r0.l0(r2)
        L1f1:
            r17 = r2
            nh2 r17 = (defpackage.nh2) r17
            java.lang.Object r2 = r0.P()
            if (r2 != r1) goto L21c
            t52 r2 = defpackage.vv5.getEntries()
            l0 r2 = (defpackage.l0) r2
            int r2 = r2.a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r6 = 0
        L20b:
            if (r6 >= r2) goto L218
            nh2 r7 = new nh2
            r7.<init>()
            r4.add(r7)
            int r6 = r6 + 1
            goto L20b
        L218:
            r0.l0(r4)
            r2 = r4
        L21c:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.P()
            if (r4 != r1) goto L22b
            w61 r4 = defpackage.mb3.w(r0)
            r0.l0(r4)
        L22b:
            w61 r4 = (defpackage.w61) r4
            boolean r6 = r0.f(r4)
            boolean r7 = r0.f(r5)
            r6 = r6 | r7
            java.lang.Object r7 = r0.P()
            if (r6 != 0) goto L23e
            if (r7 != r1) goto L248
        L23e:
            t00 r7 = new t00
            r6 = 21
            r7.<init>(r4, r5, r2, r6)
            r0.l0(r7)
        L248:
            r4 = r7
            qn2 r4 = (defpackage.qn2) r4
            r6 = 1
            et7 r7 = defpackage.ft7.b(r0, r6)
            vv7 r7 = r7.a
            r6 = 600(0x258, float:8.41E-43)
            int r7 = r7.a
            if (r7 < r6) goto L25b
            r21 = 1
            goto L25d
        L25b:
            r21 = 0
        L25d:
            boolean r6 = r0.f(r5)
            boolean r7 = r0.f(r4)
            r6 = r6 | r7
            r7 = r16 & r50
            r50 = r2
            r2 = 8388608(0x800000, float:1.1754944E-38)
            if (r7 != r2) goto L271
            r18 = 1
            goto L273
        L271:
            r18 = 0
        L273:
            r2 = r6 | r18
            boolean r6 = r0.h(r3)
            r2 = r2 | r6
            java.lang.Object r6 = r0.P()
            if (r2 != 0) goto L282
            if (r6 != r1) goto L28a
        L282:
            uv5 r6 = new uv5
            r6.<init>(r5, r4, r15, r3)
            r0.l0(r6)
        L28a:
            qn2 r6 = (defpackage.qn2) r6
            x64 r1 = defpackage.x64.a
            a74 r1 = defpackage.u24.B(r1, r6)
            r2 = r0
            n73 r0 = new n73
            r7 = r49
            r31 = r1
            r15 = r2
            r16 = r4
            r1 = r5
            r6 = r8
            r8 = r9
            r9 = r12
            r12 = r13
            r13 = r14
            r30 = r20
            r4 = r35
            r5 = r40
            r14 = r48
            r2 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 577548834(0x226cb222, float:3.2078267E-18)
            zv0 r12 = defpackage.n16.I(r2, r0, r15)
            r9 = r30
            long r13 = r9.b
            lc2 r0 = defpackage.dj6.c
            r2 = r31
            a74 r18 = r0.d(r2)
            rv5 r0 = new rv5
            r3 = r33
            r4 = r34
            r6 = r38
            r5 = r39
            r7 = r46
            r8 = r47
            r10 = r1
            r11 = r16
            r2 = r17
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 2020246609(0x786a8451, float:1.9026268E34)
            zv0 r7 = defpackage.n16.I(r1, r0, r15)
            r9 = 1572864(0x180000, float:2.204052E-39)
            r10 = 58
            r1 = 0
            r4 = 0
            r6 = 0
            r2 = r13
            r8 = r15
            r0 = r18
            defpackage.ej2.c(r0, r1, r2, r4, r6, r7, r8, r9, r10)
            goto L2f5
        L2f1:
            r15 = r0
            r15.V()
        L2f5:
            cf5 r0 = r15.t()
            if (r0 == 0) goto L32b
            r1 = r0
            sv5 r0 = new sv5
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r46
            r15 = r47
            r16 = r48
            r17 = r49
            r18 = r51
            r32 = r1
            r1 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r32
            r1.d = r0
        L32b:
            return
    }

    public static final void e(defpackage.px0 r24, int r25) {
            r0 = r25
            r1 = r24
            xq2 r1 = (defpackage.xq2) r1
            r2 = 1016375248(0x3c94a7d0, float:0.018146425)
            r1.d0(r2)
            if (r0 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            r3 = r0 & 1
            boolean r2 = r1.S(r3, r2)
            if (r2 == 0) goto L6c
            r2 = 2131952476(0x7f13035c, float:1.9541396E38)
            java.lang.String r2 = defpackage.yh2.O(r1, r2)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            r2.getClass()
            long r3 = defpackage.es7.p
            sr2 r8 = defpackage.qs7.c
            r5 = 4620130267728707584(0x401e000000000000, double:7.5)
            long r5 = defpackage.hi2.D(r5)
            oj2 r7 = defpackage.oj2.d0
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            long r9 = defpackage.hi2.D(r9)
            r11 = 1082130432(0x40800000, float:4.0)
            y16 r11 = defpackage.z16.b(r11)
            x64 r12 = defpackage.x64.a
            r13 = 1065353216(0x3f800000, float:1.0)
            a74 r11 = defpackage.ak7.I(r12, r13, r3, r11)
            r12 = 1084227584(0x40a00000, float:5.0)
            a74 r11 = defpackage.ge7.P(r11, r12, r13)
            r22 = 0
            r23 = 130832(0x1ff10, float:1.83335E-40)
            r20 = r1
            r1 = r2
            r2 = r11
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 14355840(0xdb0d80, float:2.0116817E-38)
            defpackage.x37.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L71
        L6c:
            r20 = r1
            r20.V()
        L71:
            cf5 r1 = r20.t()
            if (r1 == 0) goto L7f
            z17 r2 = new z17
            r3 = 7
            r2.<init>(r0, r3)
            r1.d = r2
        L7f:
            return
    }

    public static final void f(defpackage.a74 r49, defpackage.o6 r50, boolean r51, defpackage.on2 r52, defpackage.qn2 r53, defpackage.px0 r54, int r55) {
            r3 = r51
            r49.getClass()
            r52.getClass()
            r9 = r54
            xq2 r9 = (defpackage.xq2) r9
            r0 = 1705091830(0x65a1a2f6, float:9.541339E22)
            r9.d0(r0)
            r12 = r50
            boolean r0 = r9.f(r12)
            r1 = 32
            if (r0 == 0) goto L1e
            r0 = r1
            goto L20
        L1e:
            r0 = 16
        L20:
            r0 = r55 | r0
            boolean r4 = r9.g(r3)
            if (r4 == 0) goto L2b
            r4 = 256(0x100, float:3.59E-43)
            goto L2d
        L2b:
            r4 = 128(0x80, float:1.8E-43)
        L2d:
            r0 = r0 | r4
            r4 = r52
            boolean r5 = r9.h(r4)
            if (r5 == 0) goto L39
            r5 = 2048(0x800, float:2.87E-42)
            goto L3b
        L39:
            r5 = 1024(0x400, float:1.435E-42)
        L3b:
            r0 = r0 | r5
            r11 = r53
            boolean r5 = r9.h(r11)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L48
            r5 = r6
            goto L4a
        L48:
            r5 = 8192(0x2000, float:1.148E-41)
        L4a:
            r0 = r0 | r5
            r5 = r0 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r5 == r7) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r7 = r0 & 1
            boolean r5 = r9.S(r7, r5)
            if (r5 == 0) goto L515
            es7 r5 = defpackage.bl2.F(r9)
            o75 r7 = r12.a()
            boolean r17 = C(r12)
            vr4 r13 = I(r12)
            java.lang.Object r14 = r9.P()
            vs0 r15 = defpackage.ox0.a
            if (r14 != r15) goto L78
            r94 r14 = defpackage.i61.f(r9)
        L78:
            r94 r14 = (defpackage.r94) r14
            r54 = 16
            r2 = 6
            qa4 r2 = defpackage.bw7.a(r14, r9, r2)
            r19 = 1095761920(0x41500000, float:13.0)
            y16 r8 = defpackage.z16.b(r19)
            java.lang.Object r16 = r2.getValue()
            r20 = r14
            r14 = r16
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            boolean r16 = r9.f(r2)
            r21 = 57344(0xe000, float:8.0356E-41)
            r10 = r0 & r21
            if (r10 != r6) goto La1
            r6 = 1
            goto La2
        La1:
            r6 = 0
        La2:
            r6 = r16 | r6
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto Laa
            r0 = 1
            goto Lab
        Laa:
            r0 = 0
        Lab:
            r0 = r0 | r6
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto Lbb
            if (r1 != r15) goto Lb5
            goto Lbb
        Lb5:
            r10 = r1
            r0 = r13
            r1 = r14
            r13 = r2
            r2 = 0
            goto Lcd
        Lbb:
            ag r10 = new ag
            r15 = 16
            r16 = r14
            r14 = 0
            r0 = r13
            r1 = r16
            r13 = r2
            r2 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r9.l0(r10)
        Lcd:
            eo2 r10 = (defpackage.eo2) r10
            defpackage.mb3.i(r9, r10, r1)
            r1 = r49
            a74 r6 = defpackage.u24.g(r1, r8)
            java.lang.Object r10 = r13.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Le7
            long r10 = r5.e
            goto Le9
        Le7:
            long r10 = r5.d
        Le9:
            jy2 r12 = defpackage.u24.m
            a74 r6 = defpackage.vy7.L(r6, r10, r12)
            java.lang.Object r10 = r13.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L103
            r10 = 1073741824(0x40000000, float:2.0)
            long r13 = r5.j
            a74 r6 = defpackage.ak7.I(r6, r10, r13, r8)
        L103:
            r10 = r6
            r14 = 0
            r16 = 28
            r6 = r12
            r12 = 0
            r13 = 0
            r15 = r4
            r11 = r20
            a74 r4 = defpackage.mb3.t(r10, r11, r12, r13, r14, r15, r16)
            r8 = 1093664768(0x41300000, float:11.0)
            r10 = r19
            a74 r4 = defpackage.ge7.P(r4, r10, r8)
            d40 r8 = defpackage.d90.h0
            du r11 = defpackage.ju.a
            l26 r8 = defpackage.k26.a(r11, r8, r9, r2)
            long r12 = r9.T
            int r12 = java.lang.Long.hashCode(r12)
            xv4 r13 = r9.l()
            a74 r4 = E(r9, r4)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r9.f0()
            boolean r15 = r9.S
            if (r15 == 0) goto L141
            r9.k(r14)
            goto L144
        L141:
            r9.o0()
        L144:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r9, r15, r8)
            pn r8 = defpackage.ix0.e
            defpackage.yh2.K(r9, r8, r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            pn r13 = defpackage.ix0.g
            defpackage.yh2.K(r9, r13, r12)
            ne r12 = defpackage.ix0.h
            defpackage.yh2.F(r9, r12)
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r9, r2, r4)
            if (r17 == 0) goto L16a
            java.net.URL r4 = r7.j
        L165:
            java.lang.String r4 = r4.toString()
            goto L16d
        L16a:
            java.net.URL r4 = r7.k
            goto L165
        L16d:
            r4.getClass()
            r10 = 1109917696(0x42280000, float:42.0)
            r1 = 48
            a(r4, r10, r9, r1)
            r4 = 1094713344(0x41400000, float:12.0)
            x64 r10 = defpackage.x64.a
            a74 r4 = defpackage.dj6.l(r10, r4)
            defpackage.gi2.h(r9, r4)
            n26 r4 = defpackage.n26.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = r6
            r3 = 1
            a74 r6 = r4.b(r10, r1, r3)
            eu r3 = defpackage.ju.c
            c40 r1 = defpackage.d90.k0
            r20 = r7
            r7 = 0
            yt0 r1 = defpackage.wt0.a(r3, r1, r9, r7)
            r7 = r4
            long r3 = r9.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r9.l()
            a74 r6 = E(r9, r6)
            r9.f0()
            r21 = r7
            boolean r7 = r9.S
            if (r7 == 0) goto L1b4
            r9.k(r14)
            goto L1b7
        L1b4:
            r9.o0()
        L1b7:
            defpackage.yh2.K(r9, r15, r1)
            defpackage.yh2.K(r9, r8, r4)
            defpackage.i61.w(r3, r9, r13, r9, r12)
            defpackage.yh2.K(r9, r2, r6)
            d40 r1 = defpackage.d90.i0
            r3 = 48
            l26 r4 = defpackage.k26.a(r11, r1, r9, r3)
            long r6 = r9.T
            int r3 = java.lang.Long.hashCode(r6)
            xv4 r6 = r9.l()
            a74 r7 = E(r9, r10)
            r9.f0()
            r22 = r11
            boolean r11 = r9.S
            if (r11 == 0) goto L1e6
            r9.k(r14)
            goto L1e9
        L1e6:
            r9.o0()
        L1e9:
            defpackage.yh2.K(r9, r15, r4)
            defpackage.yh2.K(r9, r8, r6)
            defpackage.i61.w(r3, r9, r13, r9, r12)
            defpackage.yh2.K(r9, r2, r7)
            java.lang.String r4 = r20.a()
            if (r17 == 0) goto L1fe
            long r6 = r5.g
            goto L200
        L1fe:
            long r6 = r5.h
        L200:
            r3 = 13
            long r23 = defpackage.hi2.E(r3)
            oj2 r3 = defpackage.oj2.d0
            r11 = r21
            r21 = r4
            r4 = r11
            r17 = r3
            r25 = r5
            r3 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = r4.b(r10, r11, r3)
            r3 = r25
            r25 = 3120(0xc30, float:4.372E-42)
            r26 = 120784(0x1d7d0, float:1.69254E-40)
            r11 = 0
            r28 = r12
            r27 = r13
            r12 = 0
            r29 = r14
            r14 = 0
            r31 = r15
            r30 = r16
            r15 = 0
            r32 = r10
            r10 = r17
            r17 = 2
            r33 = 1
            r18 = 0
            r34 = 1095761920(0x41500000, float:13.0)
            r19 = 1
            r35 = r20
            r20 = 0
            r36 = r4
            r4 = r21
            r21 = 0
            r37 = r22
            r22 = 0
            r38 = r8
            r47 = r23
            r23 = r9
            r8 = r47
            r24 = 199680(0x30c00, float:2.79811E-40)
            r43 = r27
            r44 = r28
            r40 = r29
            r39 = r30
            r41 = r31
            r46 = r36
            r45 = r37
            r42 = r38
            r28 = r1
            r27 = r2
            r1 = r32
            r2 = r35
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r29 = r10
            r9 = r23
            n75 r4 = r2.m
            n75 r5 = defpackage.n75.UNOFFICIAL
            if (r4 != r5) goto L292
            r4 = -727011164(0xffffffffd4aab0a4, float:-5.864864E12)
            r9.b0(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            a74 r4 = defpackage.dj6.l(r1, r4)
            defpackage.gi2.h(r9, r4)
            r7 = 0
            e(r9, r7)
            r9.p(r7)
            goto L29c
        L292:
            r7 = 0
            r4 = -726909298(0xffffffffd4ac3e8e, float:-5.918271E12)
            r9.b0(r4)
            r9.p(r7)
        L29c:
            boolean r4 = r2.b()
            if (r4 == 0) goto L2d3
            r4 = -726850212(0xffffffffd4ad255c, float:-5.949249E12)
            r9.b0(r4)
            r4 = 1086324736(0x40c00000, float:6.0)
            a74 r4 = defpackage.dj6.l(r1, r4)
            defpackage.gi2.h(r9, r4)
            r4 = 2131230980(0x7f080104, float:1.8078028E38)
            sr4 r4 = defpackage.kj2.R(r9, r4)
            r5 = 2131951659(0x7f13002b, float:1.9539739E38)
            java.lang.String r5 = defpackage.yh2.O(r9, r5)
            long r7 = defpackage.es7.p
            r10 = 1095761920(0x41500000, float:13.0)
            a74 r6 = defpackage.dj6.i(r1, r10)
            r10 = 3464(0xd88, float:4.854E-42)
            r11 = 0
            defpackage.i13.b(r4, r5, r6, r7, r9, r10, r11)
            r7 = 0
            r9.p(r7)
        L2d1:
            r4 = 1
            goto L2de
        L2d3:
            r7 = 0
            r4 = -726463890(0xffffffffd4b30a6e, float:-6.151793E12)
            r9.b0(r4)
            r9.p(r7)
            goto L2d1
        L2de:
            r9.p(r4)
            java.lang.String r4 = r2.g
            long r6 = r3.i
            r10 = 4622663542519103488(0x4027000000000000, double:11.5)
            long r10 = defpackage.hi2.D(r10)
            long r15 = defpackage.hi2.E(r54)
            r24 = 0
            r25 = 13
            r21 = 0
            r22 = 1073741824(0x40000000, float:2.0)
            r23 = 0
            r20 = r1
            a74 r5 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r30 = r22
            r25 = 3126(0xc36, float:4.38E-42)
            r26 = 119792(0x1d3f0, float:1.67864E-40)
            r23 = r9
            r8 = r10
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r17 = 2
            r18 = 0
            r19 = 2
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 3120(0xc30, float:4.372E-42)
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r31 = 9
            if (r51 == 0) goto L375
            r4 = 987614771(0x3addce33, float:0.0016922414)
            r9.b0(r4)
            r4 = 2131952320(0x7f1302c0, float:1.954108E38)
            java.lang.String r4 = defpackage.yh2.O(r9, r4)
            long r6 = r3.l
            sr2 r11 = defpackage.qs7.c
            r5 = r9
            long r8 = defpackage.hi2.E(r31)
            r24 = 0
            r25 = 13
            r21 = 0
            r22 = 1077936128(0x40400000, float:3.0)
            r23 = 0
            r20 = r1
            a74 r1 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r32 = r20
            r25 = 0
            r26 = 130960(0x1ff90, float:1.83514E-40)
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1772592(0x1b0c30, float:2.48393E-39)
            r23 = r5
            r10 = r29
            r5 = r1
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r7 = 0
            r9.p(r7)
            goto L381
        L375:
            r32 = r1
            r7 = 0
            r1 = 987965970(0x3ae32a12, float:0.0017331264)
            r9.b0(r1)
            r9.p(r7)
        L381:
            if (r0 == 0) goto L4c3
            java.lang.Object r1 = r0.A
            java.lang.Object r0 = r0.B
            r4 = 988057265(0x3ae48eb1, float:0.0017437545)
            r9.b0(r4)
            r24 = 0
            r25 = 13
            r21 = 0
            r22 = 1088421888(0x40e00000, float:7.0)
            r23 = 0
            r20 = r32
            a74 r4 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r8 = r20
            r5 = r28
            r7 = r45
            r6 = 48
            l26 r5 = defpackage.k26.a(r7, r5, r9, r6)
            long r6 = r9.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r9.l()
            a74 r4 = E(r9, r4)
            r9.f0()
            boolean r10 = r9.S
            if (r10 == 0) goto L3c6
            r10 = r40
            r9.k(r10)
        L3c3:
            r11 = r41
            goto L3cc
        L3c6:
            r10 = r40
            r9.o0()
            goto L3c3
        L3cc:
            defpackage.yh2.K(r9, r11, r5)
            r5 = r42
            defpackage.yh2.K(r9, r5, r7)
            r7 = r43
            r12 = r44
            defpackage.i61.w(r6, r9, r7, r9, r12)
            r6 = r27
            defpackage.yh2.K(r9, r6, r4)
            r14 = r46
            r4 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            a74 r14 = r14.b(r8, r4, r13)
            r4 = 1082130432(0x40800000, float:4.0)
            a74 r13 = defpackage.dj6.e(r14, r4)
            y16 r14 = defpackage.z16.b(r30)
            a74 r13 = defpackage.u24.g(r13, r14)
            long r14 = r3.e
            r4 = r39
            a74 r13 = defpackage.vy7.L(r13, r14, r4)
            e40 r14 = defpackage.d90.L
            r15 = 0
            e34 r14 = defpackage.h70.d(r14, r15)
            r16 = r0
            r15 = r1
            long r0 = r9.T
            int r0 = java.lang.Long.hashCode(r0)
            xv4 r1 = r9.l()
            a74 r13 = E(r9, r13)
            r9.f0()
            r17 = r15
            boolean r15 = r9.S
            if (r15 == 0) goto L424
            r9.k(r10)
            goto L427
        L424:
            r9.o0()
        L427:
            defpackage.yh2.K(r9, r11, r14)
            defpackage.yh2.K(r9, r5, r1)
            defpackage.i61.w(r0, r9, r7, r9, r12)
            defpackage.yh2.K(r9, r6, r13)
            r0 = r16
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r5 = 0
            if (r1 != 0) goto L43f
            goto L453
        L43f:
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            float r0 = r0.floatValue()
            float r1 = r1 / r0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r5 = defpackage.gi2.p(r1, r5, r11)
        L453:
            a74 r0 = defpackage.dj6.c(r8, r5)
            r1 = 1082130432(0x40800000, float:4.0)
            a74 r0 = defpackage.dj6.e(r0, r1)
            y16 r1 = defpackage.z16.b(r30)
            a74 r0 = defpackage.u24.g(r0, r1)
            long r5 = r3.l
            a74 r0 = defpackage.vy7.L(r0, r5, r4)
            r7 = 0
            defpackage.h70.a(r0, r9, r7)
            r13 = 1
            r9.p(r13)
            r0 = 1091567616(0x41100000, float:9.0)
            a74 r0 = defpackage.dj6.l(r8, r0)
            defpackage.gi2.h(r9, r0)
            r0 = 2131951661(0x7f13002d, float:1.9539743E38)
            r1 = r16
            r15 = r17
            java.lang.Object[] r1 = new java.lang.Object[]{r15, r1}
            java.lang.String r4 = defpackage.yh2.N(r0, r1, r9)
            long r6 = r3.i
            sr2 r11 = defpackage.qs7.c
            long r0 = defpackage.hi2.E(r31)
            r25 = 0
            r26 = 130994(0x1ffb2, float:1.83562E-40)
            r5 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1575936(0x180c00, float:2.208357E-39)
            r23 = r9
            r47 = r0
            r1 = r8
            r8 = r47
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r13 = 1
            r9.p(r13)
            r7 = 0
            r9.p(r7)
            goto L4d0
        L4c3:
            r1 = r32
            r7 = 0
            r13 = 1
            r0 = 989271442(0x3af71592, float:0.0018851033)
            r9.b0(r0)
            r9.p(r7)
        L4d0:
            r9.p(r13)
            r0 = 1092616192(0x41200000, float:10.0)
            a74 r0 = defpackage.dj6.l(r1, r0)
            defpackage.gi2.h(r9, r0)
            int r0 = r2.h
            java.lang.String r4 = java.lang.String.valueOf(r0)
            long r6 = defpackage.es7.p
            sr2 r11 = defpackage.qs7.c
            r0 = 4622100592565682176(0x4025000000000000, double:10.5)
            long r0 = defpackage.hi2.D(r0)
            r25 = 0
            r26 = 130962(0x1ff92, float:1.83517E-40)
            r5 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1772928(0x1b0d80, float:2.484401E-39)
            r23 = r9
            r10 = r29
            r8 = r0
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r23
            r13 = 1
            r9.p(r13)
            goto L518
        L515:
            r9.V()
        L518:
            cf5 r7 = r9.t()
            if (r7 == 0) goto L531
            si r0 = new si
            r1 = r49
            r2 = r50
            r3 = r51
            r4 = r52
            r5 = r53
            r6 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L531:
            return
    }

    public static final defpackage.p04 g(java.util.Map r10, defpackage.jr6 r11) {
            p04 r0 = new p04
            r0.<init>()
            java.util.ArrayList r11 = r11.Z
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L43
            java.lang.Object r4 = r11.get(r3)
            int r3 = r3 + 1
            ki0 r4 = (defpackage.ki0) r4
            int r5 = r4.a
            kr6 r6 = new kr6
            r6.<init>(r5)
            java.lang.Object r5 = r10.get(r6)
            android.view.Surface r5 = (android.view.Surface) r5
            if (r5 != 0) goto L27
            goto Ld
        L27:
            java.util.ArrayList r4 = r4.b
            int r6 = r4.size()
            r7 = r2
        L2e:
            if (r7 >= r6) goto Ld
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            ir6 r8 = (defpackage.ir6) r8
            int r8 = r8.a
            gp4 r9 = new gp4
            r9.<init>(r8)
            r0.put(r9, r5)
            goto L2e
        L43:
            p04 r10 = r0.b()
            return r10
    }

    public static final android.graphics.Bitmap h(defpackage.zh r1) {
            boolean r0 = r1 instanceof defpackage.zh
            if (r0 == 0) goto L7
            android.graphics.Bitmap r1 = r1.a
            return r1
        L7:
            java.lang.String r1 = "Unable to obtain android.graphics.Bitmap"
            defpackage.fa6.h(r1)
            r1 = 0
            return r1
    }

    public static final java.lang.Object j(defpackage.xg1 r10, defpackage.on2 r11, defpackage.s41 r12) {
            r0 = r10
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            goto Laa
        Lb:
            r0 = r10
            z64 r0 = (defpackage.z64) r0
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L19
            java.lang.String r1 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r1)
        L19:
            z64 r0 = r0.A
            z64 r0 = r0.X
            sm3 r1 = defpackage.nc1.f0(r10)
        L21:
            r2 = 0
            if (r1 == 0) goto L92
            if0 r3 = r1.B0
            java.lang.Object r3 = r3.g
            z64 r3 = (defpackage.z64) r3
            int r3 = r3.R
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L81
        L31:
            if (r0 == 0) goto L81
            int r3 = r0.L
            r3 = r3 & r4
            if (r3 == 0) goto L7e
            r3 = r0
            r5 = r2
        L3a:
            if (r3 == 0) goto L7e
            boolean r6 = r3 instanceof defpackage.o70
            if (r6 == 0) goto L42
            r2 = r3
            goto L92
        L42:
            int r6 = r3.L
            r6 = r6 & r4
            if (r6 == 0) goto L79
            boolean r6 = r3 instanceof defpackage.zg1
            if (r6 == 0) goto L79
            r6 = r3
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L51:
            r8 = 1
            if (r6 == 0) goto L76
            int r9 = r6.L
            r9 = r9 & r4
            if (r9 == 0) goto L73
            int r7 = r7 + 1
            if (r7 != r8) goto L5f
            r3 = r6
            goto L73
        L5f:
            if (r5 != 0) goto L6a
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L6a:
            if (r3 == 0) goto L70
            r5.b(r3)
            r3 = r2
        L70:
            r5.b(r6)
        L73:
            z64 r6 = r6.Y
            goto L51
        L76:
            if (r7 != r8) goto L79
            goto L3a
        L79:
            z64 r3 = defpackage.nc1.A(r5)
            goto L3a
        L7e:
            z64 r0 = r0.X
            goto L31
        L81:
            sm3 r1 = r1.v()
            if (r1 == 0) goto L90
            if0 r0 = r1.B0
            if (r0 == 0) goto L90
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L21
        L90:
            r0 = r2
            goto L21
        L92:
            o70 r2 = (defpackage.o70) r2
            if (r2 != 0) goto L97
            goto Laa
        L97:
            eg4 r10 = defpackage.nc1.e0(r10)
            le r0 = new le
            r1 = 2
            r0.<init>(r1, r11, r10)
            java.lang.Object r10 = r2.G(r10, r0, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto Laa
            return r10
        Laa:
            jg7 r10 = defpackage.jg7.a
            return r10
    }

    public static final defpackage.cp4 k(defpackage.kf0 r34, defpackage.jr6 r35, java.util.Map r36) {
            r0 = r34
            r1 = r35
            r2 = r36
            r0.getClass()
            java.lang.String r3 = r0.a
            java.util.LinkedHashMap r4 = r1.R
            r2.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            p04 r9 = r1.X
            java.util.Set r9 = r9.entrySet()
            q04 r9 = (defpackage.q04) r9
            java.util.Iterator r9 = r9.iterator()
        L30:
            boolean r10 = r9.hasNext()
            java.lang.String r11 = "Required value was null."
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L76
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r14 = r10.getKey()
            kr6 r14 = (defpackage.kr6) r14
            int r14 = r14.a
            java.lang.Object r10 = r10.getValue()
            t23 r10 = (defpackage.t23) r10
            ki0 r14 = r1.e(r14)
            if (r14 == 0) goto L72
            java.util.ArrayList r11 = r14.b
            int r11 = r11.size()
            if (r11 != r12) goto L5d
            goto L30
        L5d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L69
            java.lang.String r0 = "Cannot configure multiple outputs pre-S!"
            defpackage.i.h(r0)
            return r13
        L69:
            java.lang.Class<ui> r0 = defpackage.ui.class
            defpackage.gh5.a(r0)
            r10.getClass()
            throw r13
        L72:
            defpackage.i.m(r11)
            return r13
        L76:
            java.util.ArrayList r9 = r1.Z
            int r10 = r9.size()
            r15 = 0
        L7d:
            if (r15 >= r10) goto L110
            java.lang.Object r16 = r9.get(r15)
            int r15 = r15 + 1
            r17 = r13
            r13 = r16
            ki0 r13 = (defpackage.ki0) r13
            java.util.ArrayList r14 = r13.b
            int r13 = r13.a
            r18 = r9
            int r9 = r14.size()
            if (r9 != r12) goto Lb9
            kr6 r9 = new kr6
            r9.<init>(r13)
            java.lang.Object r9 = r2.get(r9)
            android.view.Surface r9 = (android.view.Surface) r9
            if (r9 == 0) goto Lb4
            java.lang.Object r13 = defpackage.gt0.b1(r14)
            ir6 r13 = (defpackage.ir6) r13
            int r13 = r13.a
            gp4 r14 = new gp4
            r14.<init>(r13)
            r7.put(r14, r9)
        Lb4:
            r13 = r17
            r9 = r18
            goto L7d
        Lb9:
            int r9 = r14.size()
            r12 = 0
        Lbe:
            if (r12 >= r9) goto L109
            java.lang.Object r19 = r14.get(r12)
            int r12 = r12 + 1
            r20 = r9
            r9 = r19
            ir6 r9 = (defpackage.ir6) r9
            java.lang.Object r19 = r4.get(r9)
            if (r19 == 0) goto L105
            r21 = r4
            r4 = r19
            hr6 r4 = (defpackage.hr6) r4
            java.lang.Object r4 = r8.get(r4)
            android.hardware.camera2.params.OutputConfiguration r4 = (android.hardware.camera2.params.OutputConfiguration) r4
            if (r4 == 0) goto Le5
            android.view.Surface r4 = r4.getSurface()
            goto Lf0
        Le5:
            kr6 r4 = new kr6
            r4.<init>(r13)
            java.lang.Object r4 = r2.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
        Lf0:
            if (r4 == 0) goto L100
            int r9 = r9.a
            r19 = r10
            gp4 r10 = new gp4
            r10.<init>(r9)
            r7.put(r10, r4)
            r10 = r19
        L100:
            r9 = r20
            r4 = r21
            goto Lbe
        L105:
            defpackage.i.m(r11)
            return r17
        L109:
            r13 = r17
            r9 = r18
            r12 = 1
            goto L7d
        L110:
            r17 = r13
            java.util.List r4 = r1.L
            java.util.Iterator r4 = r4.iterator()
            r9 = r17
        L11a:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L358
            java.lang.Object r10 = r4.next()
            hr6 r10 = (defpackage.hr6) r10
            java.util.ArrayList r11 = r10.l
            java.util.ArrayList r12 = r10.l
            java.util.List r13 = r10.k
            vs0 r14 = r10.f
            java.lang.Integer r15 = r10.e
            r18 = r4
            java.lang.String r4 = r10.d
            r19 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r25 = r13
            int r13 = r11.size()
            r21 = r14
            r14 = 0
        L144:
            if (r14 >= r13) goto L16b
            java.lang.Object r20 = r11.get(r14)
            int r14 = r14 + 1
            r22 = r13
            r13 = r20
            ki0 r13 = (defpackage.ki0) r13
            int r13 = r13.a
            r20 = r14
            kr6 r14 = new kr6
            r14.<init>(r13)
            java.lang.Object r13 = r2.get(r14)
            android.view.Surface r13 = (android.view.Surface) r13
            if (r13 == 0) goto L166
            r12.add(r13)
        L166:
            r14 = r20
            r13 = r22
            goto L144
        L16b:
            java.lang.Object r13 = r8.get(r10)
            android.hardware.camera2.params.OutputConfiguration r13 = (android.hardware.camera2.params.OutputConfiguration) r13
            java.lang.String r14 = "! Missing surfaces for "
            r31 = r8
            java.lang.String r8 = "Surfaces are not yet available for "
            if (r13 == 0) goto L1d9
            int r4 = r12.size()
            int r12 = r11.size()
            if (r4 != r12) goto L192
            xi r4 = new xi
            r4.<init>(r13)
            r5.add(r4)
            r32 = r7
            r33 = r9
        L18f:
            r7 = 1
            goto L307
        L192:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.size()
            r3 = 0
        L19c:
            if (r3 >= r1) goto L1b8
            java.lang.Object r4 = r11.get(r3)
            int r3 = r3 + 1
            r5 = r4
            ki0 r5 = (defpackage.ki0) r5
            int r5 = r5.a
            kr6 r6 = new kr6
            r6.<init>(r5)
            boolean r5 = r2.containsKey(r6)
            if (r5 != 0) goto L19c
            r0.add(r4)
            goto L19c
        L1b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r10)
            r1.append(r14)
            r1.append(r0)
            r0 = 33
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1d9:
            java.lang.String r13 = "Failed to create AndroidOutputConfiguration for "
            r22 = r15
            java.lang.String r15 = "CXCP"
            r23 = -1
            if (r21 == 0) goto L25a
            r32 = r7
            int r7 = r12.size()
            r33 = r9
            int r9 = r11.size()
            if (r7 == r9) goto L25e
            android.util.Size r7 = r10.b
            rp4 r8 = r10.g
            qp4 r9 = r10.h
            sp4 r12 = r10.i
            int r14 = r19.size()
            r26 = r7
            r7 = 1
            if (r14 <= r7) goto L205
            r27 = 1
            goto L207
        L205:
            r27 = 0
        L207:
            if (r22 == 0) goto L20d
            int r23 = r22.intValue()
        L20d:
            r28 = r23
            boolean r7 = defpackage.nb3.k(r4, r3)
            if (r7 != 0) goto L218
            r29 = r4
            goto L21a
        L218:
            r29 = r17
        L21a:
            r20 = 0
            r30 = 2
            r19 = 0
            r22 = r8
            r23 = r9
            r24 = r12
            xi r4 = defpackage.cs1.q(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r4 != 0) goto L23d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r15, r4)
            goto L18f
        L23d:
            r5.add(r4)
            int r7 = r11.size()
            r8 = 0
        L245:
            if (r8 >= r7) goto L18f
            java.lang.Object r9 = r11.get(r8)
            int r8 = r8 + 1
            ki0 r9 = (defpackage.ki0) r9
            int r9 = r9.a
            kr6 r10 = new kr6
            r10.<init>(r9)
            r6.put(r10, r4)
            goto L245
        L25a:
            r32 = r7
            r33 = r9
        L25e:
            int r7 = r12.size()
            int r9 = r11.size()
            if (r7 != r9) goto L311
            java.lang.Object r7 = defpackage.gt0.H0(r12)
            android.view.Surface r7 = (android.view.Surface) r7
            rp4 r8 = r10.g
            qp4 r9 = r10.h
            sp4 r14 = r10.i
            r20 = r7
            android.util.Size r7 = r10.b
            r26 = r7
            int r7 = r19.size()
            r19 = r8
            r8 = 1
            if (r7 <= r8) goto L286
            r27 = 1
            goto L288
        L286:
            r27 = 0
        L288:
            if (r22 == 0) goto L28e
            int r23 = r22.intValue()
        L28e:
            r28 = r23
            boolean r7 = defpackage.nb3.k(r4, r3)
            if (r7 != 0) goto L299
            r29 = r4
            goto L29b
        L299:
            r29 = r17
        L29b:
            r30 = 6
            r7 = r20
            r20 = 0
            r21 = 0
            r23 = r9
            r24 = r14
            r22 = r19
            r19 = r7
            xi r4 = defpackage.cs1.q(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r4 != 0) goto L2c2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r15, r4)
            goto L18f
        L2c2:
            r7 = 1
            java.util.List r8 = defpackage.gt0.D0(r12, r7)
            java.util.Iterator r8 = r8.iterator()
        L2cb:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L2db
            java.lang.Object r9 = r8.next()
            android.view.Surface r9 = (android.view.Surface) r9
            r4.a(r9)
            goto L2cb
        L2db:
            ji0 r8 = r0.e
            if (r8 == 0) goto L304
            java.util.LinkedHashMap r9 = r1.B
            java.lang.Object r8 = r9.get(r8)
            ki0 r8 = (defpackage.ki0) r8
            if (r8 == 0) goto L2fe
            if (r33 != 0) goto L2fa
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L2fa
            r9 = r4
            r4 = r18
            r8 = r31
            r7 = r32
            goto L11a
        L2fa:
            r5.add(r4)
            goto L307
        L2fe:
            java.lang.String r0 = "Postview Stream in StreamGraph cannot be null for reprocessing request"
            defpackage.i.m(r0)
            return r17
        L304:
            r5.add(r4)
        L307:
            r4 = r18
            r8 = r31
            r7 = r32
            r9 = r33
            goto L11a
        L311:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.size()
            r3 = 0
        L31b:
            if (r3 >= r1) goto L337
            java.lang.Object r4 = r11.get(r3)
            int r3 = r3 + 1
            r5 = r4
            ki0 r5 = (defpackage.ki0) r5
            int r5 = r5.a
            kr6 r6 = new kr6
            r6.<init>(r5)
            boolean r5 = r2.containsKey(r6)
            if (r5 != 0) goto L31b
            r0.add(r4)
            goto L31b
        L337:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r10)
            r1.append(r14)
            r1.append(r0)
            r0 = 33
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L358:
            r32 = r7
            r33 = r9
            cp4 r0 = new cp4
            r1 = r32
            r4 = r33
            r0.<init>(r5, r6, r4, r1)
            return r0
    }

    public static final boolean l(java.util.ArrayList r14) {
            int r0 = r14.size()
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto La
            goto Le7
        La:
            int r0 = r14.size()
            r1 = 0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r0 > r2) goto L1c
            yt1 r14 = defpackage.yt1.A
            goto L92
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r6 = r14.get(r1)
            int r7 = r14.size()
            int r7 = r7 - r2
            r8 = r1
        L2b:
            if (r8 >= r7) goto L91
            int r8 = r8 + 1
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            xa6 r10 = (defpackage.xa6) r10
            xa6 r6 = (defpackage.xa6) r6
            of5 r11 = r6.g()
            long r11 = r11.b()
            long r11 = r11 >> r5
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            of5 r12 = r10.g()
            long r12 = r12.b()
            long r12 = r12 >> r5
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            of5 r6 = r6.g()
            long r12 = r6.b()
            long r12 = r12 & r3
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            of5 r10 = r10.g()
            long r12 = r10.b()
            long r12 = r12 & r3
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r12 = (long) r6
            long r10 = r10 << r5
            long r12 = r12 & r3
            long r10 = r10 | r12
            jk4 r6 = new jk4
            r6.<init>(r10)
            r0.add(r6)
            r6 = r9
            goto L2b
        L91:
            r14 = r0
        L92:
            int r0 = r14.size()
            if (r0 != r2) goto La1
            java.lang.Object r14 = defpackage.gt0.H0(r14)
            jk4 r14 = (defpackage.jk4) r14
            long r6 = r14.a
            goto Ld6
        La1:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lac
            java.lang.String r0 = "Empty collection can't be reduced."
            defpackage.ex3.c(r0)
        Lac:
            java.lang.Object r0 = defpackage.gt0.H0(r14)
            int r6 = r14.size()
            int r6 = r6 - r2
            if (r2 > r6) goto Ld2
            r7 = r2
        Lb8:
            java.lang.Object r8 = r14.get(r7)
            jk4 r8 = (defpackage.jk4) r8
            long r8 = r8.a
            jk4 r0 = (defpackage.jk4) r0
            long r10 = r0.a
            long r8 = defpackage.jk4.f(r10, r8)
            jk4 r0 = new jk4
            r0.<init>(r8)
            if (r7 == r6) goto Ld2
            int r7 = r7 + 1
            goto Lb8
        Ld2:
            jk4 r0 = (defpackage.jk4) r0
            long r6 = r0.a
        Ld6:
            long r8 = r6 >> r5
            int r14 = (int) r8
            float r14 = java.lang.Float.intBitsToFloat(r14)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 >= 0) goto Le8
        Le7:
            return r2
        Le8:
            return r1
    }

    public static boolean m(defpackage.l21 r8) {
            k21[] r0 = r8.T
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r0 = r0[r3]
            l21 r4 = r8.U
            if (r4 == 0) goto Lf
            m21 r4 = (defpackage.m21) r4
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L18
            k21[] r5 = r4.T
            r5 = r5[r1]
            k21 r6 = defpackage.k21.FIXED
        L18:
            if (r4 == 0) goto L20
            k21[] r4 = r4.T
            r4 = r4[r3]
            k21 r5 = defpackage.k21.FIXED
        L20:
            k21 r4 = defpackage.k21.FIXED
            r5 = 0
            if (r2 == r4) goto L56
            boolean r6 = r8.B()
            if (r6 != 0) goto L56
            k21 r6 = defpackage.k21.WRAP_CONTENT
            if (r2 == r6) goto L56
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r2 != r6) goto L43
            int r7 = r8.r
            if (r7 != 0) goto L43
            float r7 = r8.X
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L43
            boolean r7 = r8.u(r1)
            if (r7 != 0) goto L56
        L43:
            if (r2 != r6) goto L54
            int r2 = r8.r
            if (r2 != r3) goto L54
            int r2 = r8.r()
            boolean r2 = r8.v(r1, r2)
            if (r2 == 0) goto L54
            goto L56
        L54:
            r2 = r1
            goto L57
        L56:
            r2 = r3
        L57:
            if (r0 == r4) goto L8a
            boolean r4 = r8.C()
            if (r4 != 0) goto L8a
            k21 r4 = defpackage.k21.WRAP_CONTENT
            if (r0 == r4) goto L8a
            k21 r4 = defpackage.k21.MATCH_CONSTRAINT
            if (r0 != r4) goto L77
            int r6 = r8.s
            if (r6 != 0) goto L77
            float r6 = r8.X
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L77
            boolean r6 = r8.u(r3)
            if (r6 != 0) goto L8a
        L77:
            if (r0 != r4) goto L88
            int r0 = r8.s
            if (r0 != r3) goto L88
            int r0 = r8.l()
            boolean r0 = r8.v(r3, r0)
            if (r0 == 0) goto L88
            goto L8a
        L88:
            r0 = r1
            goto L8b
        L8a:
            r0 = r3
        L8b:
            float r8 = r8.X
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L96
            if (r2 != 0) goto L9a
            if (r0 == 0) goto L96
            goto L9a
        L96:
            if (r2 == 0) goto L9b
            if (r0 == 0) goto L9b
        L9a:
            return r3
        L9b:
            return r1
    }

    public static final byte n(char r1) {
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 >= r0) goto L9
            byte[] r0 = defpackage.mm0.b
            r1 = r0[r1]
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static int o(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static defpackage.a74 p(defpackage.a74 r1, defpackage.fo2 r2) {
            nx0 r0 = new nx0
            r0.<init>(r2)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static int r(boolean r4, java.lang.String r5, int r6, int r7) {
        L0:
            if (r6 >= r7) goto L3c
            char r0 = r5.charAt(r6)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L33
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L33
            r1 = 48
            r3 = 58
            if (r1 > r0) goto L1c
            if (r0 >= r3) goto L1c
            goto L33
        L1c:
            r1 = 97
            if (r1 > r0) goto L25
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L25
            goto L33
        L25:
            r1 = 65
            if (r1 > r0) goto L2e
            r1 = 91
            if (r0 >= r1) goto L2e
            goto L33
        L2e:
            if (r0 != r3) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = r2
        L34:
            r1 = r4 ^ 1
            if (r0 != r1) goto L39
            return r6
        L39:
            int r6 = r6 + 1
            goto L0
        L3c:
            return r7
    }

    public static java.lang.String s(android.content.Context r7, android.net.Uri r8) {
            r7.getClass()
            r0 = 0
            if (r8 != 0) goto L8
            goto L7b
        L8:
            java.lang.String r1 = r8.toString()
            r1.getClass()
            java.lang.String r2 = "://"
            r3 = 0
            r4 = 6
            int r5 = defpackage.qs6.t0(r1, r2, r3, r3, r4)
            r6 = -1
            if (r5 != r6) goto L1c
            r1 = r0
            goto L2d
        L1c:
            l93 r5 = defpackage.gi2.R(r3, r5)
            r5.getClass()
            int r6 = r5.A
            int r5 = r5.B
            int r5 = r5 + 1
            java.lang.String r1 = r1.substring(r6, r5)
        L2d:
            java.lang.String r5 = "content"
            boolean r5 = defpackage.nb3.k(r1, r5)
            if (r5 == 0) goto L61
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r7, r8)
            if (r0 == 0) goto L40
            java.lang.String r7 = t(r7, r8)     // Catch: java.lang.Exception -> L4d
            return r7
        L40:
            java.lang.String r1 = android.provider.DocumentsContract.getTreeDocumentId(r8)     // Catch: java.lang.Exception -> L4d
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r8, r1)     // Catch: java.lang.Exception -> L4d
            java.lang.String r7 = u(r7, r1)     // Catch: java.lang.Exception -> L4d
            return r7
        L4d:
            if (r0 == 0) goto L58
            qi6 r7 = defpackage.zl1.g(r7, r8)
            java.lang.String r7 = r7.i()
            goto L60
        L58:
            qi6 r7 = defpackage.zl1.h(r7, r8)
            java.lang.String r7 = r7.i()
        L60:
            return r7
        L61:
            java.lang.String r7 = "file"
            boolean r7 = defpackage.nb3.k(r1, r7)
            if (r7 == 0) goto L7b
            java.lang.String r7 = r8.toString()
            r7.getClass()
            int r8 = defpackage.qs6.t0(r7, r2, r3, r3, r4)
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)
            return r7
        L7b:
            return r0
    }

    public static java.lang.String t(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "/proc/self/fd/"
            r3.getClass()
            r4.getClass()
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r1)     // Catch: java.lang.Exception -> L3c
            if (r3 == 0) goto L3c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L35
            int r1 = r3.getFd()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r2.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L35
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.lang.Exception -> L3c
            return r4
        L35:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            defpackage.ge7.t(r3, r4)     // Catch: java.lang.Exception -> L3c
            throw r0     // Catch: java.lang.Exception -> L3c
        L3c:
            r3 = 0
            return r3
    }

    public static java.lang.String u(android.content.Context r19, android.net.Uri r20) {
            java.lang.String r1 = "FileUtils"
            r2 = 0
            if (r20 != 0) goto Lb
            java.lang.String r0 = "getAbsolutePathFromTreeUri: called with treeUri == null"
            android.util.Log.w(r1, r0)
            return r2
        Lb:
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r20)
            r0.getClass()
            java.lang.String r3 = ":"
            java.lang.String[] r4 = new java.lang.String[]{r3}
            r5 = 6
            java.util.List r0 = defpackage.qs6.K0(r0, r4, r5)
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r6)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r6 = r0.length
            if (r6 != 0) goto L2b
            r6 = r2
            goto L2e
        L2b:
            r0 = r0[r4]
            r6 = r0
        L2e:
            if (r6 != 0) goto L31
            return r2
        L31:
            java.lang.String r0 = "home"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L51
            java.lang.String r0 = "getVolumePath: isHomeVolume"
            android.util.Log.v(r1, r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOCUMENTS     // Catch: java.lang.Exception -> L4c
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L4c
        L48:
            r17 = 1
            goto L17e
        L4c:
            r0 = move-exception
            r17 = 1
            goto L163
        L51:
            java.lang.String r0 = "downloads"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L69
            java.lang.String r0 = "getVolumePath: isDownloadsVolume"
            android.util.Log.v(r1, r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> L4c
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L4c
            goto L48
        L69:
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            r8 = r19
            java.lang.Object r0 = r8.getSystemService(r0)     // Catch: java.lang.Exception -> L4c
            r0.getClass()     // Catch: java.lang.Exception -> L4c
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0     // Catch: java.lang.Exception -> L4c
            java.lang.String r8 = "android.os.storage.StorageVolume"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L4c
            java.lang.Class r9 = r0.getClass()     // Catch: java.lang.Exception -> L4c
            java.lang.String r10 = "getVolumeList"
            java.lang.reflect.Method r9 = r9.getMethod(r10, r2)     // Catch: java.lang.Exception -> L4c
            java.lang.String r10 = "getUuid"
            java.lang.reflect.Method r10 = r8.getMethod(r10, r2)     // Catch: java.lang.Exception -> L4c
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4c
            r12 = 30
            if (r11 < r12) goto L99
            java.lang.String r11 = "getDirectory"
            java.lang.reflect.Method r11 = r8.getMethod(r11, r2)     // Catch: java.lang.Exception -> L4c
            goto L9f
        L99:
            java.lang.String r11 = "getPath"
            java.lang.reflect.Method r11 = r8.getMethod(r11, r2)     // Catch: java.lang.Exception -> L4c
        L9f:
            java.lang.String r13 = "isPrimary"
            java.lang.reflect.Method r8 = r8.getMethod(r13, r2)     // Catch: java.lang.Exception -> L4c
            java.lang.Object r0 = r9.invoke(r0, r2)     // Catch: java.lang.Exception -> L4c
            r0.getClass()     // Catch: java.lang.Exception -> L4c
            int r9 = java.lang.reflect.Array.getLength(r0)     // Catch: java.lang.Exception -> L4c
            r13 = r4
        Lb1:
            if (r13 >= r9) goto L14f
            java.lang.Object r14 = java.lang.reflect.Array.get(r0, r13)     // Catch: java.lang.Exception -> L4c
            java.lang.Object r15 = r10.invoke(r14, r2)     // Catch: java.lang.Exception -> L4c
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> L4c
            java.lang.Object r16 = r8.invoke(r14, r2)     // Catch: java.lang.Exception -> L4c
            r16.getClass()     // Catch: java.lang.Exception -> L4c
            java.lang.Boolean r16 = (java.lang.Boolean) r16     // Catch: java.lang.Exception -> L4c
            r17 = 1
            boolean r7 = r16.booleanValue()     // Catch: java.lang.Exception -> Ld9
            if (r7 == 0) goto Ldc
            java.lang.String r5 = "primary"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> Ld9
            if (r5 == 0) goto Ldc
            r5 = r17
            goto Ldd
        Ld9:
            r0 = move-exception
            goto L163
        Ldc:
            r5 = r4
        Ldd:
            if (r15 == 0) goto Le7
            boolean r18 = r15.equals(r6)     // Catch: java.lang.Exception -> Ld9
            if (r18 == 0) goto Le7
            r4 = r17
        Le7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L141
            r2.<init>()     // Catch: java.lang.Exception -> L141
            java.lang.String r12 = "Found volume with uuid='"
            r2.append(r12)     // Catch: java.lang.Exception -> L141
            r2.append(r15)     // Catch: java.lang.Exception -> L141
            java.lang.String r12 = "', volumeId='"
            r2.append(r12)     // Catch: java.lang.Exception -> L141
            r2.append(r6)     // Catch: java.lang.Exception -> L141
            java.lang.String r12 = "', primary="
            r2.append(r12)     // Catch: java.lang.Exception -> L141
            r2.append(r7)     // Catch: java.lang.Exception -> L141
            java.lang.String r7 = ", isPrimaryVolume="
            r2.append(r7)     // Catch: java.lang.Exception -> L141
            r2.append(r5)     // Catch: java.lang.Exception -> L141
            java.lang.String r7 = ", isExternalVolume="
            r2.append(r7)     // Catch: java.lang.Exception -> L141
            r2.append(r4)     // Catch: java.lang.Exception -> L141
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L141
            android.util.Log.d(r1, r2)     // Catch: java.lang.Exception -> L141
            if (r5 != 0) goto L128
            if (r4 == 0) goto L120
            goto L128
        L120:
            int r13 = r13 + 1
            r2 = 0
            r4 = 0
            r5 = 6
            r12 = 30
            goto Lb1
        L128:
            java.lang.String r0 = "getVolumePath: isPrimaryVolume || isExternalVolume"
            android.util.Log.v(r1, r0)     // Catch: java.lang.Exception -> L141
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L141
            r2 = 30
            if (r0 < r2) goto L146
            r2 = 0
            java.lang.Object r0 = r11.invoke(r14, r2)     // Catch: java.lang.Exception -> L141
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L141
            if (r0 == 0) goto L144
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L141
            goto L17e
        L141:
            r0 = move-exception
            r2 = 0
            goto L163
        L144:
            r2 = 0
            goto L17e
        L146:
            r2 = 0
            java.lang.Object r0 = r11.invoke(r14, r2)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Ld9
            r2 = r0
            goto L17e
        L14f:
            r17 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r0.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = "/storage/"
            r0.append(r4)     // Catch: java.lang.Exception -> Ld9
            r0.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Exception -> Ld9
            goto L17e
        L163:
            java.lang.String r4 = "getVolumePath exception"
            android.util.Log.w(r1, r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "getVolumePath failed for volumeId='"
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L17e:
            if (r2 != 0) goto L183
            java.lang.String r0 = java.io.File.separator
            return r0
        L183:
            java.lang.String r0 = java.io.File.separator
            r0.getClass()
            r1 = 0
            boolean r4 = defpackage.xs6.Y(r2, r0, r1)
            if (r4 == 0) goto L199
            int r4 = r2.length()
            int r4 = r4 + (-1)
            java.lang.String r2 = r2.substring(r1, r4)
        L199:
            java.lang.String r4 = android.provider.DocumentsContract.getTreeDocumentId(r20)
            r4.getClass()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r5 = 6
            java.util.List r3 = defpackage.qs6.K0(r4, r3, r5)
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r4 = r3.length
            r5 = 2
            if (r4 < r5) goto L1b8
            r3 = r3[r17]
            goto L1b9
        L1b8:
            r3 = r0
        L1b9:
            r3.getClass()
            boolean r4 = defpackage.xs6.Y(r3, r0, r1)
            if (r4 == 0) goto L1cc
            int r4 = r3.length()
            int r4 = r4 + (-1)
            java.lang.String r3 = r3.substring(r1, r4)
        L1cc:
            int r4 = r3.length()
            if (r4 <= 0) goto L1e1
            boolean r1 = defpackage.xs6.g0(r3, r0, r1)
            if (r1 == 0) goto L1dd
            java.lang.String r2 = r2.concat(r3)
            goto L1e1
        L1dd:
            java.lang.String r2 = defpackage.lb1.m(r2, r0, r3)
        L1e1:
            return r2
    }

    public static java.lang.Object v(java.util.concurrent.Future r3) {
            boolean r0 = r3.isDone()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Future was expected to be done, "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            defpackage.np2.A(r1, r0)
            java.lang.Object r3 = w(r3)
            return r3
    }

    public static java.lang.Object w(java.util.concurrent.Future r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    public static void y(int r19, defpackage.p11 r20, defpackage.l21 r21, boolean r22) {
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r1.m
            if (r3 == 0) goto Lc
            goto L11b
        Lc:
            boolean r3 = r1 instanceof defpackage.m21
            if (r3 != 0) goto L24
            boolean r3 = r1.A()
            if (r3 == 0) goto L24
            boolean r3 = m(r1)
            if (r3 == 0) goto L24
            e30 r3 = new e30
            r3.<init>()
            defpackage.m21.W(r1, r0, r3)
        L24:
            g11 r3 = defpackage.g11.LEFT
            h11 r3 = r1.j(r3)
            g11 r4 = defpackage.g11.RIGHT
            h11 r4 = r1.j(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            if (r7 == 0) goto L111
            boolean r3 = r3.c
            if (r3 == 0) goto L111
            java.util.Iterator r3 = r7.iterator()
        L44:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L111
            java.lang.Object r7 = r3.next()
            h11 r7 = (defpackage.h11) r7
            l21 r12 = r7.d
            int r13 = r19 + 1
            boolean r14 = m(r12)
            h11 r15 = r12.I
            r16 = 0
            h11 r8 = r12.K
            boolean r17 = r12.A()
            if (r17 == 0) goto L71
            if (r14 == 0) goto L71
            r17 = 0
            e30 r10 = new e30
            r10.<init>()
            defpackage.m21.W(r12, r0, r10)
            goto L73
        L71:
            r17 = 0
        L73:
            if (r7 != r15) goto L7d
            h11 r10 = r8.f
            if (r10 == 0) goto L7d
            boolean r10 = r10.c
            if (r10 != 0) goto L87
        L7d:
            if (r7 != r8) goto L8b
            h11 r10 = r15.f
            if (r10 == 0) goto L8b
            boolean r10 = r10.c
            if (r10 == 0) goto L8b
        L87:
            r10 = 1
        L88:
            r18 = 1
            goto L8e
        L8b:
            r10 = r17
            goto L88
        L8e:
            k21[] r11 = r12.T
            r11 = r11[r17]
            k21 r9 = defpackage.k21.MATCH_CONSTRAINT
            if (r11 != r9) goto Lca
            if (r14 == 0) goto L99
            goto Lca
        L99:
            if (r11 != r9) goto L44
            int r7 = r12.v
            if (r7 < 0) goto L44
            int r7 = r12.u
            if (r7 < 0) goto L44
            int r7 = r12.h0
            r8 = 8
            if (r7 == r8) goto Lb3
            int r7 = r12.r
            if (r7 != 0) goto L44
            float r7 = r12.X
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 != 0) goto L44
        Lb3:
            boolean r7 = r12.y()
            if (r7 != 0) goto L44
            boolean r7 = r12.F
            if (r7 != 0) goto L44
            if (r10 == 0) goto L44
            boolean r7 = r12.y()
            if (r7 != 0) goto L44
            O(r13, r1, r0, r12, r2)
            goto L44
        Lca:
            boolean r9 = r12.A()
            if (r9 == 0) goto Ld2
            goto L44
        Ld2:
            if (r7 != r15) goto Lea
            h11 r9 = r8.f
            if (r9 != 0) goto Lea
            int r7 = r15.e()
            int r7 = r7 + r5
            int r8 = r12.r()
            int r8 = r8 + r7
            r12.K(r7, r8)
            y(r13, r0, r12, r2)
            goto L44
        Lea:
            if (r7 != r8) goto L104
            h11 r7 = r15.f
            if (r7 != 0) goto L104
            int r7 = r8.e()
            int r7 = r5 - r7
            int r8 = r12.r()
            int r8 = r7 - r8
            r12.K(r8, r7)
            y(r13, r0, r12, r2)
            goto L44
        L104:
            if (r10 == 0) goto L44
            boolean r7 = r12.y()
            if (r7 != 0) goto L44
            N(r13, r0, r12, r2)
            goto L44
        L111:
            r16 = 0
            r17 = 0
            r18 = 1
            boolean r3 = r1 instanceof defpackage.av2
            if (r3 == 0) goto L11c
        L11b:
            return
        L11c:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L1f1
            boolean r4 = r4.c
            if (r4 == 0) goto L1f1
            java.util.Iterator r3 = r3.iterator()
        L128:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1f1
            java.lang.Object r4 = r3.next()
            h11 r4 = (defpackage.h11) r4
            l21 r5 = r4.d
            int r11 = r19 + 1
            boolean r7 = m(r5)
            h11 r8 = r5.I
            h11 r9 = r5.K
            boolean r10 = r5.A()
            if (r10 == 0) goto L150
            if (r7 == 0) goto L150
            e30 r10 = new e30
            r10.<init>()
            defpackage.m21.W(r5, r0, r10)
        L150:
            if (r4 != r8) goto L15a
            h11 r10 = r9.f
            if (r10 == 0) goto L15a
            boolean r10 = r10.c
            if (r10 != 0) goto L164
        L15a:
            if (r4 != r9) goto L167
            h11 r10 = r8.f
            if (r10 == 0) goto L167
            boolean r10 = r10.c
            if (r10 == 0) goto L167
        L164:
            r10 = r18
            goto L169
        L167:
            r10 = r17
        L169:
            k21[] r12 = r5.T
            r12 = r12[r17]
            k21 r13 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r13) goto L173
            if (r7 == 0) goto L176
        L173:
            r7 = 8
            goto L1aa
        L176:
            if (r12 != r13) goto L1a6
            int r4 = r5.v
            if (r4 < 0) goto L1a6
            int r4 = r5.u
            if (r4 < 0) goto L1a6
            int r4 = r5.h0
            r7 = 8
            if (r4 == r7) goto L190
            int r4 = r5.r
            if (r4 != 0) goto L128
            float r4 = r5.X
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 != 0) goto L128
        L190:
            boolean r4 = r5.y()
            if (r4 != 0) goto L128
            boolean r4 = r5.F
            if (r4 != 0) goto L128
            if (r10 == 0) goto L128
            boolean r4 = r5.y()
            if (r4 != 0) goto L128
            O(r11, r1, r0, r5, r2)
            goto L128
        L1a6:
            r7 = 8
            goto L128
        L1aa:
            boolean r12 = r5.A()
            if (r12 == 0) goto L1b2
            goto L128
        L1b2:
            if (r4 != r8) goto L1ca
            h11 r12 = r9.f
            if (r12 != 0) goto L1ca
            int r4 = r8.e()
            int r4 = r4 + r6
            int r8 = r5.r()
            int r8 = r8 + r4
            r5.K(r4, r8)
            y(r11, r0, r5, r2)
            goto L128
        L1ca:
            if (r4 != r9) goto L1e4
            h11 r4 = r8.f
            if (r4 != 0) goto L1e4
            int r4 = r9.e()
            int r4 = r6 - r4
            int r8 = r5.r()
            int r8 = r4 - r8
            r5.K(r8, r4)
            y(r11, r0, r5, r2)
            goto L128
        L1e4:
            if (r10 == 0) goto L128
            boolean r4 = r5.y()
            if (r4 != 0) goto L128
            N(r11, r0, r5, r2)
            goto L128
        L1f1:
            r0 = r18
            r1.m = r0
            return
    }

    public static defpackage.n33 z(java.lang.Object r2) {
            if (r2 != 0) goto L5
            n33 r2 = defpackage.n33.L
            return r2
        L5:
            n33 r0 = new n33
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public abstract void i(defpackage.j36 r1, java.lang.Object r2);

    public abstract java.lang.String q();

    public void x(defpackage.e36 r2, java.lang.Object r3) {
            r1 = this;
            r2.getClass()
            if (r3 != 0) goto L6
            return
        L6:
            java.lang.String r0 = r1.q()
            j36 r0 = r2.i0(r0)
            r1.i(r0, r3)     // Catch: java.lang.Throwable -> L1c
            r0.f0()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            defpackage.lb4.p(r0, r1)
            defpackage.oi2.D(r2)
            return
        L1c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1e
        L1e:
            r2 = move-exception
            defpackage.lb4.p(r0, r1)
            throw r2
    }
}
