package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln2  reason: default package */
/* loaded from: classes.dex */
public abstract class ln2 {
    public static final /* synthetic */ int a = 0;
    public static long b;
    public static java.lang.reflect.Method c;
    public static java.lang.reflect.Method d;
    public static java.lang.reflect.Method e;
    public static java.lang.reflect.Method f;

    public static final defpackage.fp A(defpackage.c37 r3) {
            fp r0 = r3.a
            long r1 = r3.b
            r0.getClass()
            int r3 = defpackage.k47.f(r1)
            int r1 = defpackage.k47.e(r1)
            fp r3 = r0.c(r3, r1)
            return r3
    }

    public static final defpackage.fp C(defpackage.c37 r4, int r5) {
            fp r0 = r4.a
            fp r1 = r4.a
            long r2 = r4.b
            int r4 = defpackage.k47.e(r2)
            int r2 = defpackage.k47.e(r2)
            int r3 = r2 + r5
            r2 = r2 ^ r3
            r5 = r5 ^ r3
            r5 = r5 & r2
            if (r5 >= 0) goto L1b
            java.lang.String r5 = r1.B
            int r3 = r5.length()
        L1b:
            java.lang.String r5 = r1.B
            int r5 = r5.length()
            int r5 = java.lang.Math.min(r3, r5)
            fp r4 = r0.c(r4, r5)
            return r4
    }

    public static final defpackage.fp D(defpackage.c37 r4, int r5) {
            fp r0 = r4.a
            long r1 = r4.b
            int r4 = defpackage.k47.f(r1)
            int r3 = r4 - r5
            r5 = r5 ^ r4
            r4 = r4 ^ r3
            r4 = r4 & r5
            r5 = 0
            if (r4 >= 0) goto L11
            r3 = r5
        L11:
            int r4 = java.lang.Math.max(r5, r3)
            int r5 = defpackage.k47.f(r1)
            fp r4 = r0.c(r4, r5)
            return r4
    }

    public static final defpackage.a47 E(defpackage.ta6 r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            fb6 r1 = defpackage.sa6.a
            ja4 r2 = r2.A
            java.lang.Object r2 = r2.g(r1)
            r1 = 0
            if (r2 != 0) goto L11
            r2 = r1
        L11:
            y1 r2 = (defpackage.y1) r2
            if (r2 == 0) goto L2f
            ao2 r2 = r2.b
            qn2 r2 = (defpackage.qn2) r2
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.g(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            a47 r2 = (defpackage.a47) r2
            return r2
        L2f:
            return r1
    }

    public static void F(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            java.lang.reflect.InvocationTargetException r3 = (java.lang.reflect.InvocationTargetException) r3
            java.lang.Throwable r2 = r3.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto Lf
            throw r2
        Lf:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to call "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " via reflection"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "Trace"
            android.util.Log.v(r0, r2, r3)
            return
    }

    public static final boolean G(java.lang.String r2) {
            r0 = 0
            r1 = 9
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            boolean r2 = defpackage.qs6.v0(r2)
            return r2
    }

    public static final boolean H() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = defpackage.rp.f()
            return r0
        Lb:
            java.lang.String r0 = "isTagEnabled"
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.reflect.Method r2 = defpackage.ln2.c     // Catch: java.lang.Exception -> L2d
            r3 = 0
            if (r2 != 0) goto L2f
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L2d
            long r4 = r2.getLong(r3)     // Catch: java.lang.Exception -> L2d
            defpackage.ln2.b = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L2d
            defpackage.ln2.c = r1     // Catch: java.lang.Exception -> L2d
            goto L2f
        L2d:
            r1 = move-exception
            goto L53
        L2f:
            java.lang.reflect.Method r1 = defpackage.ln2.c     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L4b
            long r4 = defpackage.ln2.b     // Catch: java.lang.Exception -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L2d
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L2d
            r1.getClass()     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L2d
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L2d
            return r0
        L4b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2d
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2d
            throw r2     // Catch: java.lang.Exception -> L2d
        L53:
            F(r0, r1)
            r0 = 0
            return r0
    }

    public static final java.lang.String L(java.util.Collection r6) {
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            r5 = 62
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            java.lang.String r6 = defpackage.rs6.Q(r6)
            java.lang.String r0 = " }"
            java.lang.String r0 = defpackage.rs6.Q(r0)
            java.lang.String r6 = r6.concat(r0)
            return r6
    }

    public static final java.lang.String M(java.util.Collection r6) {
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            r5 = 62
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            java.lang.String r6 = defpackage.rs6.Q(r6)
            java.lang.String r0 = "},"
            java.lang.String r0 = defpackage.rs6.Q(r0)
            java.lang.String r6 = r6.concat(r0)
            return r6
    }

    public static defpackage.vl6 N(defpackage.vl6 r6) {
            boolean r0 = r6 instanceof defpackage.nb7
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r6
            nb7 r0 = (defpackage.nb7) r0
            long r2 = r0.t
            long r4 = defpackage.kj2.s()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r0.r = r1
            return r6
        L15:
            boolean r0 = r6 instanceof defpackage.ob7
            if (r0 == 0) goto L29
            r0 = r6
            ob7 r0 = (defpackage.ob7) r0
            long r2 = r0.i
            long r4 = defpackage.kj2.s()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L29
            r0.h = r1
            return r6
        L29:
            r0 = 0
            vl6 r6 = defpackage.bm6.g(r6, r1, r0)
            r6.j()
            return r6
    }

    public static final defpackage.da5 O(defpackage.ka5 r28) {
            r0 = r28
            ea5 r1 = r0.a
            long r3 = r1.a
            java.lang.String r7 = r1.b
            java.lang.String r5 = r1.c
            java.net.URL r6 = new java.net.URL
            java.lang.String r1 = r1.d
            r6.<init>(r1)
            java.util.List r0 = r0.b
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r2 = defpackage.ht0.v0(r0, r1)
            r8.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r0.next()
            v75 r2 = (defpackage.v75) r2
            java.util.List r9 = r2.b
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = defpackage.ht0.v0(r9, r1)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L3d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L51
            java.lang.Object r11 = r9.next()
            p75 r11 = (defpackage.p75) r11
            o75 r11 = defpackage.kn2.S(r11)
            r10.add(r11)
            goto L3d
        L51:
            java.util.List r9 = r2.c
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = defpackage.ht0.v0(r9, r1)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto La4
            java.lang.Object r12 = r9.next()
            va5 r12 = (defpackage.va5) r12
            r12.getClass()
            ta5 r13 = new ta5
            long r14 = r12.a
            r26 = r2
            long r1 = r12.b
            r27 = r0
            r16 = r1
            long r0 = r12.c
            java.lang.String r2 = r12.d
            r18 = r0
            java.lang.String r0 = r12.e
            boolean r1 = r12.f
            r21 = r0
            java.lang.String r0 = r12.g
            r23 = r0
            java.lang.String r0 = r12.h
            boolean r12 = r12.i
            r24 = r0
            r22 = r1
            r20 = r2
            r25 = r12
            r13.<init>(r14, r16, r18, r20, r21, r22, r23, r24, r25)
            r11.add(r13)
            r2 = r26
            r0 = r27
            r1 = 10
            goto L60
        La4:
            r27 = r0
            t75 r0 = r2.a
            r18 = r10
            s75 r10 = new s75
            r19 = r11
            long r11 = r0.a
            long r13 = r0.b
            java.lang.String r1 = r0.c
            java.lang.String r2 = r0.d
            r75 r15 = defpackage.r75.valueOf(r2)
            java.net.URI r2 = new java.net.URI
            java.lang.String r0 = r0.e
            r2.<init>(r0)
            java.net.URL r17 = r2.toURL()
            r17.getClass()
            r16 = r1
            r10.<init>(r11, r13, r15, r16, r17, r18, r19)
            r8.add(r10)
            r0 = r27
            r1 = 10
            goto L22
        Ld6:
            da5 r2 = new da5
            r2.<init>(r3, r5, r6, r7, r8)
            return r2
    }

    public static android.graphics.Typeface P(android.content.res.Configuration r2, android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            int r0 = defpackage.sd0.a(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r0 = defpackage.sd0.a(r2)
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            int r0 = defpackage.o05.a(r3)
            int r2 = defpackage.sd0.a(r2)
            int r2 = r2 + r0
            r0 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = defpackage.ej2.q(r2, r0, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = defpackage.yr1.f(r3, r2, r0)
            return r2
        L30:
            r2 = 0
            return r2
    }

    public static java.lang.Object Q(defpackage.gi1 r6, defpackage.on2 r7) {
            m44 r0 = defpackage.bm6.b
            java.lang.Object r0 = r0.f()
            vl6 r0 = (defpackage.vl6) r0
            boolean r1 = r0 instanceof defpackage.nb7
            if (r1 == 0) goto L3b
            r1 = r0
            nb7 r1 = (defpackage.nb7) r1
            long r2 = r1.t
            long r4 = defpackage.kj2.s()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L3b
            qn2 r2 = r1.r
            qn2 r3 = r1.s
            r4 = r0
            nb7 r4 = (defpackage.nb7) r4     // Catch: java.lang.Throwable -> L34
            r5 = 1
            qn2 r6 = defpackage.bm6.k(r6, r2, r5)     // Catch: java.lang.Throwable -> L34
            r4.r = r6     // Catch: java.lang.Throwable -> L34
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> L34
            r0.s = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r7.c()     // Catch: java.lang.Throwable -> L34
            r1.r = r2
            r1.s = r3
            return r6
        L34:
            r0 = move-exception
            r6 = r0
            r1.r = r2
            r1.s = r3
            throw r6
        L3b:
            if (r0 == 0) goto L41
            boolean r1 = r0 instanceof defpackage.oa4
            if (r1 == 0) goto L43
        L41:
            r1 = r0
            goto L48
        L43:
            vl6 r6 = r0.u(r6)
            goto L5a
        L48:
            nb7 r0 = new nb7
            boolean r2 = r1 instanceof defpackage.oa4
            if (r2 == 0) goto L51
            oa4 r1 = (defpackage.oa4) r1
            goto L52
        L51:
            r1 = 0
        L52:
            r4 = 1
            r5 = 0
            r3 = 0
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = r0
        L5a:
            vl6 r1 = r6.j()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.c()     // Catch: java.lang.Throwable -> L6c
            defpackage.vl6.q(r1)     // Catch: java.lang.Throwable -> L69
            r6.c()
            return r7
        L69:
            r0 = move-exception
            r7 = r0
            goto L72
        L6c:
            r0 = move-exception
            r7 = r0
            defpackage.vl6.q(r1)     // Catch: java.lang.Throwable -> L69
            throw r7     // Catch: java.lang.Throwable -> L69
        L72:
            r6.c()
            throw r7
    }

    public static defpackage.yw2 R(java.lang.String... r7) {
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L52
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L17:
            if (r5 >= r3) goto L32
            r6 = r0[r5]
            if (r6 == 0) goto L2c
            r6 = r7[r5]
            java.lang.CharSequence r6 = defpackage.qs6.T0(r6)
            java.lang.String r6 = r6.toString()
            r0[r5] = r6
            int r5 = r5 + 1
            goto L17
        L2c:
            java.lang.String r7 = "Headers cannot be null"
            defpackage.i.h(r7)
            return r2
        L32:
            int r7 = r0.length
            int r7 = r7 + (-1)
            int r7 = defpackage.nj2.s(r4, r7, r1)
            if (r7 < 0) goto L4c
        L3b:
            r1 = r0[r4]
            int r2 = r4 + 1
            r2 = r0[r2]
            defpackage.ft7.c(r1)
            defpackage.ft7.d(r2, r1)
            if (r4 == r7) goto L4c
            int r4 = r4 + 2
            goto L3b
        L4c:
            yw2 r7 = new yw2
            r7.<init>(r0)
            return r7
        L52:
            java.lang.String r7 = "Expected alternating header names and values"
            defpackage.i.h(r7)
            return r2
    }

    public static final void T(defpackage.wu r8, defpackage.qn2 r9) {
            r8.getClass()
            wu r0 = new wu
            r1 = 999(0x3e7, float:1.4E-42)
            r0.<init>(r1)
            int r2 = r8.L
            r3 = 0
            r4 = r3
            r5 = r4
        Lf:
            if (r4 >= r2) goto L2a
            java.lang.Object r6 = r8.f(r4)
            java.lang.Object r7 = r8.i(r4)
            r0.put(r6, r7)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r1) goto Lf
            r9.g(r0)
            r0.clear()
            r5 = r3
            goto Lf
        L2a:
            if (r5 <= 0) goto L2f
            r9.g(r0)
        L2f:
            return
    }

    public static final void U(defpackage.hz3 r9, defpackage.qn2 r10) {
            r9.getClass()
            hz3 r0 = new hz3
            r1 = 999(0x3e7, float:1.4E-42)
            r0.<init>(r1)
            int r2 = r9.i()
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r2) goto L2c
            long r6 = r9.e(r4)
            java.lang.Object r8 = r9.j(r4)
            r0.f(r6, r8)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r1) goto L11
            r10.g(r0)
            r0.a()
            r5 = r3
            goto L11
        L2c:
            if (r5 <= 0) goto L31
            r10.g(r0)
        L31:
            return
    }

    public static void V(defpackage.vl6 r0, defpackage.vl6 r1, defpackage.qn2 r2) {
            if (r0 != r1) goto L1a
            boolean r1 = r0 instanceof defpackage.nb7
            if (r1 == 0) goto Lb
            nb7 r0 = (defpackage.nb7) r0
            r0.r = r2
            return
        Lb:
            boolean r1 = r0 instanceof defpackage.ob7
            if (r1 == 0) goto L14
            ob7 r0 = (defpackage.ob7) r0
            r0.h = r2
            return
        L14:
            java.lang.String r1 = "Non-transparent snapshot was reused: "
            defpackage.e41.h(r0, r1)
            return
        L1a:
            r1.getClass()
            defpackage.vl6.q(r0)
            r1.c()
            return
    }

    public static final defpackage.m93 W(defpackage.of5 r4) {
            m93 r0 = new m93
            float r1 = r4.a
            int r1 = java.lang.Math.round(r1)
            float r2 = r4.b
            int r2 = java.lang.Math.round(r2)
            float r3 = r4.c
            int r3 = java.lang.Math.round(r3)
            float r4 = r4.d
            int r4 = java.lang.Math.round(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final defpackage.a74 X(defpackage.a74 r9, float r10) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            if (r0 != 0) goto L9
            return r9
        L9:
            r7 = 0
            r8 = 524284(0x7fffc, float:7.34678E-40)
            r4 = 0
            r5 = 0
            r6 = 0
            r3 = r10
            r1 = r9
            r2 = r10
            a74 r9 = defpackage.hv.I(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static int Y(int r7, java.lang.CharSequence r8) {
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = defpackage.bl2.H(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L75
            r5 = 32
            if (r4 == r5) goto L75
            if (r4 == r2) goto L69
            r6 = 40
            if (r4 == r6) goto L64
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L72
            if (r3 == r7) goto L78
            goto L77
        L5e:
            if (r0 != 0) goto L61
            goto L77
        L61:
            int r0 = r0 + (-1)
            goto L72
        L64:
            int r0 = r0 + 1
            if (r0 <= r5) goto L72
            goto L78
        L69:
            int r4 = r3 + 1
            boolean r5 = defpackage.bl2.H(r4, r8)
            if (r5 == 0) goto L72
            r3 = r4
        L72:
            int r3 = r3 + 1
            goto L3b
        L75:
            if (r3 == r7) goto L78
        L77:
            return r3
        L78:
            return r1
        L79:
            int r7 = r8.length()
            return r7
    }

    public static int Z(int r2, java.lang.CharSequence r3) {
        L0:
            int r0 = r3.length()
            if (r2 >= r0) goto L1d
            char r0 = r3.charAt(r2)
            switch(r0) {
                case 91: goto L1b;
                case 92: goto Lf;
                case 93: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L18
        Le:
            return r2
        Lf:
            int r0 = r2 + 1
            boolean r1 = defpackage.bl2.H(r0, r3)
            if (r1 == 0) goto L18
            r2 = r0
        L18:
            int r2 = r2 + 1
            goto L0
        L1b:
            r2 = -1
            return r2
        L1d:
            int r2 = r3.length()
            return r2
    }

    public static final void a(defpackage.ta4 r18, defpackage.qa4 r19, defpackage.s76 r20, defpackage.a74 r21, defpackage.zv0 r22, defpackage.px0 r23, int r24) {
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r11 = r23
            xq2 r11 = (defpackage.xq2) r11
            r0 = 1077393800(0x4037b988, float:2.870699)
            r11.d0(r0)
            boolean r0 = r11.f(r1)
            r2 = 2
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = r2
        L1c:
            r0 = r24 | r0
            boolean r7 = r11.f(r3)
            if (r7 == 0) goto L27
            r7 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r7 = 128(0x80, float:1.8E-43)
        L29:
            r0 = r0 | r7
            boolean r7 = r11.f(r4)
            if (r7 == 0) goto L33
            r7 = 2048(0x800, float:2.87E-42)
            goto L35
        L33:
            r7 = 1024(0x400, float:1.435E-42)
        L35:
            r0 = r0 | r7
            boolean r7 = r11.h(r5)
            if (r7 == 0) goto L3f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L41
        L3f:
            r7 = 8192(0x2000, float:1.148E-41)
        L41:
            r0 = r0 | r7
            r7 = r0 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            r9 = 1
            r13 = 0
            if (r7 == r8) goto L4c
            r7 = r9
            goto L4d
        L4c:
            r7 = r13
        L4d:
            r8 = r0 & 1
            boolean r7 = r11.S(r8, r7)
            if (r7 == 0) goto L185
            r0 = r0 & 14
            r7 = 48
            r0 = r0 | r7
            java.lang.String r7 = "DropDownMenu"
            ga7 r0 = defpackage.n16.J(r1, r7, r11, r0, r13)
            wc7 r10 = defpackage.nw7.e0
            gx0 r7 = r0.a
            vs4 r14 = r0.d
            java.lang.Object r7 = r7.f()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1833869404(0xffffffff92b15fa4, float:-1.1193848E-27)
            r11.b0(r8)
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            if (r7 == 0) goto L7e
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L7f
        L7e:
            r7 = r12
        L7f:
            r11.p(r13)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r16 = r14.getValue()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            r11.b0(r8)
            if (r16 == 0) goto L97
            r12 = 1065353216(0x3f800000, float:1.0)
        L97:
            r11.p(r13)
            java.lang.Float r8 = java.lang.Float.valueOf(r12)
            aa7 r12 = r0.f()
            r15 = 445475263(0x1a8d69bf, float:5.8487075E-23)
            r11.b0(r15)
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r12 = r12.b(r15, r6)
            r17 = r12
            if (r17 == 0) goto Lc0
            r9 = 120(0x78, float:1.68E-43)
            v71 r12 = defpackage.ir1.b
            sc7 r2 = defpackage.ge7.Y(r9, r13, r12, r2)
            r9 = r2
            r2 = r13
            r12 = 0
            goto Lca
        Lc0:
            r2 = 74
            r12 = 0
            r13 = 4
            sc7 r2 = defpackage.ge7.Y(r9, r2, r12, r13)
            r9 = r2
            r2 = 0
        Lca:
            r11.p(r2)
            r17 = r12
            r12 = 0
            r2 = r6
            r6 = r0
            r0 = r2
            r2 = r17
            ca7 r13 = defpackage.n16.t(r6, r7, r8, r9, r10, r11, r12)
            gx0 r7 = r6.a
            java.lang.Object r7 = r7.f()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1578341192(0xffffffffa1ec6cb8, float:-1.602076E-18)
            r11.b0(r8)
            if (r7 == 0) goto Lf1
            r7 = 1065353216(0x3f800000, float:1.0)
        Lef:
            r9 = 0
            goto Lf3
        Lf1:
            r7 = 0
            goto Lef
        Lf3:
            r11.p(r9)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r11.b0(r8)
            if (r14 == 0) goto L10c
            r16 = 1065353216(0x3f800000, float:1.0)
            goto L10e
        L10c:
            r16 = 0
        L10e:
            r11.p(r9)
            java.lang.Float r8 = java.lang.Float.valueOf(r16)
            aa7 r14 = r6.f()
            r12 = 701003475(0x29c876d3, float:8.902397E-14)
            r11.b0(r12)
            boolean r0 = r14.b(r15, r0)
            r12 = 6
            if (r0 == 0) goto L12d
            r0 = 30
            sc7 r0 = defpackage.ge7.Y(r0, r9, r2, r12)
            goto L133
        L12d:
            r0 = 75
            sc7 r0 = defpackage.ge7.Y(r0, r9, r2, r12)
        L133:
            r11.p(r9)
            r9 = r0
            r12 = 0
            ca7 r0 = defpackage.n16.t(r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = r11.f(r13)
            boolean r6 = r11.f(r0)
            r2 = r2 | r6
            java.lang.Object r6 = r11.P()
            if (r2 != 0) goto L153
            vs0 r2 = defpackage.ox0.a
            if (r6 != r2) goto L150
            goto L153
        L150:
            r15 = r19
            goto L15f
        L153:
            t00 r6 = new t00
            r2 = 17
            r15 = r19
            r6.<init>(r15, r13, r0, r2)
            r11.l0(r6)
        L15f:
            qn2 r6 = (defpackage.qn2) r6
            x64 r0 = defpackage.x64.a
            a74 r6 = defpackage.hv.G(r0, r6)
            x3 r0 = new x3
            r2 = 22
            r0.<init>(r4, r3, r5, r2)
            r2 = -707086267(0xffffffffd5dab845, float:-3.006062E13)
            zv0 r0 = defpackage.n16.I(r2, r0, r11)
            r13 = 1769472(0x1b0000, float:2.479558E-39)
            r14 = 30
            r7 = 0
            r8 = 0
            r10 = 1090519040(0x41000000, float:8.0)
            r12 = r11
            r11 = r0
            defpackage.hf.b(r6, r7, r8, r10, r11, r12, r13, r14)
            r11 = r12
            goto L18a
        L185:
            r15 = r19
            r11.V()
        L18a:
            cf5 r7 = r11.t()
            if (r7 == 0) goto L19a
            qi r0 = new qi
            r6 = r24
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L19a:
            return
    }

    public static int a0(java.lang.CharSequence r3, int r4, char r5) {
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L28
            char r0 = r3.charAt(r4)
            r1 = 92
            if (r0 != r1) goto L18
            int r1 = r4 + 1
            boolean r2 = defpackage.bl2.H(r1, r3)
            if (r2 == 0) goto L18
            r4 = r1
            goto L25
        L18:
            if (r0 != r5) goto L1b
            return r4
        L1b:
            r1 = 41
            if (r5 != r1) goto L25
            r1 = 40
            if (r0 != r1) goto L25
            r3 = -1
            return r3
        L25:
            int r4 = r4 + 1
            goto L0
        L28:
            int r3 = r3.length()
            return r3
    }

    public static final void b(defpackage.on2 r14, defpackage.a74 r15, defpackage.lq4 r16, defpackage.fo2 r17, defpackage.px0 r18, int r19) {
            r3 = r16
            r4 = r17
            r5 = r19
            r0 = r18
            xq2 r0 = (defpackage.xq2) r0
            r1 = -674391690(0xffffffffd7cd9976, float:-4.52118E14)
            r0.d0(r1)
            r1 = r5 & 6
            if (r1 != 0) goto L1f
            boolean r1 = r0.h(r14)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r1 | r5
            goto L20
        L1f:
            r1 = r5
        L20:
            r2 = r5 & 48
            if (r2 != 0) goto L30
            boolean r6 = r0.f(r15)
            if (r6 == 0) goto L2d
            r6 = 32
            goto L2f
        L2d:
            r6 = 16
        L2f:
            r1 = r1 | r6
        L30:
            r6 = r5 & 384(0x180, float:5.38E-43)
            r13 = 1
            if (r6 != 0) goto L41
            boolean r6 = r0.g(r13)
            if (r6 == 0) goto L3e
            r6 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r6 = 128(0x80, float:1.8E-43)
        L40:
            r1 = r1 | r6
        L41:
            r6 = r5 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L51
            boolean r6 = r0.f(r3)
            if (r6 == 0) goto L4e
            r6 = 2048(0x800, float:2.87E-42)
            goto L50
        L4e:
            r6 = 1024(0x400, float:1.435E-42)
        L50:
            r1 = r1 | r6
        L51:
            r6 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L62
            r6 = 0
            boolean r6 = r0.f(r6)
            if (r6 == 0) goto L5f
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L61
        L5f:
            r6 = 8192(0x2000, float:1.148E-41)
        L61:
            r1 = r1 | r6
        L62:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r5
            if (r6 != 0) goto L73
            boolean r6 = r0.h(r4)
            if (r6 == 0) goto L70
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L72
        L70:
            r6 = 65536(0x10000, float:9.1835E-41)
        L72:
            r1 = r1 | r6
        L73:
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r1
            r7 = 74898(0x12492, float:1.04954E-40)
            if (r6 == r7) goto L7e
            r6 = r13
            goto L7f
        L7e:
            r6 = 0
        L7f:
            r1 = r1 & r13
            boolean r1 = r0.S(r1, r6)
            if (r1 == 0) goto L11c
            r6 = 0
            r1 = 6
            kq5 r8 = defpackage.jq5.a(r1, r6, r13)
            r10 = 0
            r12 = 24
            r7 = 0
            r9 = 1
            r11 = r14
            r6 = r15
            a74 r1 = defpackage.mb3.t(r6, r7, r8, r9, r10, r11, r12)
            r2 = 1065353216(0x3f800000, float:1.0)
            a74 r1 = defpackage.dj6.c(r1, r2)
            r2 = 1133248512(0x438c0000, float:280.0)
            r6 = 2143289344(0x7fc00000, float:NaN)
            r7 = 1121976320(0x42e00000, float:112.0)
            r8 = 1111490560(0x42400000, float:48.0)
            a74 r1 = defpackage.dj6.k(r1, r7, r8, r2, r6)
            a74 r1 = defpackage.ge7.N(r1, r3)
            d40 r2 = defpackage.d90.i0
            du r6 = defpackage.ju.a
            r7 = 48
            l26 r2 = defpackage.k26.a(r6, r2, r0, r7)
            int r6 = defpackage.ge7.B(r0)
            xv4 r8 = r0.l()
            a74 r1 = defpackage.l.E(r0, r1)
            ix0 r9 = defpackage.jx0.i
            r9.getClass()
            iy0 r9 = defpackage.ix0.b
            r0.f0()
            boolean r10 = r0.S
            if (r10 == 0) goto Ld6
            r0.k(r9)
            goto Ld9
        Ld6:
            r0.o0()
        Ld9:
            pn r9 = defpackage.ix0.f
            defpackage.yh2.K(r0, r9, r2)
            pn r2 = defpackage.ix0.e
            defpackage.yh2.K(r0, r2, r8)
            pn r2 = defpackage.ix0.g
            boolean r8 = r0.S
            if (r8 != 0) goto Lf7
            java.lang.Object r8 = r0.P()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 != 0) goto Lfa
        Lf7:
            defpackage.i61.v(r6, r0, r6, r2)
        Lfa:
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r0, r2, r1)
            nq6 r1 = defpackage.ye7.b
            java.lang.Object r1 = r0.j(r1)
            xe7 r1 = (defpackage.xe7) r1
            s47 r1 = r1.g
            fq r2 = new fq
            r2.<init>(r4, r13)
            r6 = -77738101(0xfffffffffb5dcf8b, float:-1.1517071E36)
            zv0 r2 = defpackage.n16.I(r6, r2, r0)
            defpackage.x37.a(r1, r2, r0, r7)
            r0.p(r13)
            goto L11f
        L11c:
            r0.V()
        L11f:
            cf5 r6 = r0.t()
            if (r6 == 0) goto L12e
            i10 r0 = new i10
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L12e:
            return
    }

    public static final void b0(defpackage.zm r2, int r3) {
            java.util.HashMap r2 = r2.getLayoutNodeToHolder()
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            sm3 r1 = (defpackage.sm3) r1
            int r1 = r1.B
            if (r1 != r3) goto Le
            goto L27
        L26:
            r0 = 0
        L27:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L35
            java.lang.Object r2 = r0.getValue()
            if (r2 != 0) goto L32
            goto L35
        L32:
            defpackage.u34.a()
        L35:
            return
    }

    public static final void c(defpackage.on2 r16, defpackage.zv0 r17, defpackage.px0 r18, int r19) {
            r0 = r16
            r1 = r17
            r2 = r19
            r0.getClass()
            r3 = r18
            xq2 r3 = (defpackage.xq2) r3
            r4 = -1642214335(0xffffffff9e1dcc41, float:-8.3537495E-21)
            r3.d0(r4)
            r4 = r2 & 6
            r6 = 4
            if (r4 != 0) goto L23
            boolean r4 = r3.h(r0)
            if (r4 == 0) goto L20
            r4 = r6
            goto L21
        L20:
            r4 = 2
        L21:
            r4 = r4 | r2
            goto L24
        L23:
            r4 = r2
        L24:
            r7 = r2 & 48
            if (r7 != 0) goto L34
            boolean r7 = r3.h(r1)
            if (r7 == 0) goto L31
            r7 = 32
            goto L33
        L31:
            r7 = 16
        L33:
            r4 = r4 | r7
        L34:
            r7 = r4 & 19
            r8 = 18
            r9 = 1
            r10 = 0
            if (r7 == r8) goto L3e
            r7 = r9
            goto L3f
        L3e:
            r7 = r10
        L3f:
            r4 = r4 & r9
            boolean r4 = r3.S(r4, r7)
            if (r4 == 0) goto Leb
            nq6 r4 = defpackage.kf.f
            java.lang.Object r4 = r3.j(r4)
            android.view.View r4 = (android.view.View) r4
            vq2 r7 = defpackage.ge7.T(r3)
            qa4 r8 = defpackage.np2.b0(r1, r3)
            qa4 r11 = defpackage.np2.b0(r0, r3)
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Object r13 = r3.P()
            r14 = 3
            vs0 r15 = defpackage.ox0.a
            if (r13 != r15) goto L6d
            ns1 r13 = new ns1
            r13.<init>(r14)
            r3.l0(r13)
        L6d:
            on2 r13 = (defpackage.on2) r13
            r5 = 48
            java.lang.Object r12 = defpackage.qo2.I(r12, r13, r3, r5)
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Object r13 = r3.P()
            if (r13 != r15) goto L87
            ns1 r13 = new ns1
            r13.<init>(r6)
            r3.l0(r13)
        L87:
            on2 r13 = (defpackage.on2) r13
            java.lang.Object r5 = defpackage.qo2.I(r10, r13, r3, r5)
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r6 = r3.P()
            if (r6 != r15) goto Lc9
            mn2 r6 = new mn2
            java.lang.Object r10 = r5.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r12.getClass()
            r6.<init>(r4, r10, r12)
            e4 r4 = new e4
            r4.<init>(r8, r14)
            zv0 r8 = new zv0
            r10 = -1221710001(0xffffffffb72e2f4f, float:-1.0382223E-5)
            r8.<init>(r10, r9, r4)
            r6.setParentCompositionContext(r7)
            vs4 r4 = r6.m0
            r4.setValue(r8)
            r6.l0 = r9
            java.lang.Object r4 = r11.getValue()
            on2 r4 = (defpackage.on2) r4
            r6.k0 = r4
            r3.l0(r6)
        Lc9:
            mn2 r6 = (defpackage.mn2) r6
            boolean r4 = r3.h(r6)
            boolean r7 = r3.f(r5)
            r4 = r4 | r7
            java.lang.Object r7 = r3.P()
            if (r4 != 0) goto Ldc
            if (r7 != r15) goto Le5
        Ldc:
            bi2 r7 = new bi2
            r4 = 2
            r7.<init>(r4, r6, r5)
            r3.l0(r7)
        Le5:
            qn2 r7 = (defpackage.qn2) r7
            defpackage.mb3.d(r6, r7, r3)
            goto Lee
        Leb:
            r3.V()
        Lee:
            cf5 r3 = r3.t()
            if (r3 == 0) goto Lfc
            hp r4 = new hp
            r5 = 5
            r4.<init>(r0, r2, r5, r1)
            r3.d = r4
        Lfc:
            return
    }

    public static final void d(defpackage.a74 r42, defpackage.ue1 r43, defpackage.lq4 r44, defpackage.lo4 r45, defpackage.ql6 r46, boolean r47, defpackage.sg r48, defpackage.cs1 r49, defpackage.ae4 r50, defpackage.d40 r51, defpackage.cs1 r52, defpackage.zv0 r53, defpackage.px0 r54, int r55, int r56) {
            r1 = r42
            r3 = r43
            r5 = r44
            r0 = r46
            r12 = r47
            r6 = r49
            r13 = r50
            r9 = r51
            r10 = r52
            r14 = r53
            r15 = r55
            r2 = r56
            c40 r4 = defpackage.d90.l0
            r7 = r54
            xq2 r7 = (defpackage.xq2) r7
            r8 = -572816025(0xffffffffdddb8567, float:-1.9772703E18)
            r7.d0(r8)
            r8 = r15 & 6
            r54 = r8
            if (r54 != 0) goto L38
            boolean r16 = r7.f(r1)
            if (r16 == 0) goto L33
            r16 = 4
            goto L35
        L33:
            r16 = 2
        L35:
            r16 = r15 | r16
            goto L3a
        L38:
            r16 = r15
        L3a:
            r17 = r15 & 48
            r18 = 16
            if (r17 != 0) goto L4d
            boolean r17 = r7.f(r3)
            if (r17 == 0) goto L49
            r17 = 32
            goto L4b
        L49:
            r17 = r18
        L4b:
            r16 = r16 | r17
        L4d:
            r11 = r15 & 384(0x180, float:5.38E-43)
            r19 = 128(0x80, float:1.8E-43)
            if (r11 != 0) goto L60
            boolean r11 = r7.f(r5)
            if (r11 == 0) goto L5c
            r11 = 256(0x100, float:3.59E-43)
            goto L5e
        L5c:
            r11 = r19
        L5e:
            r16 = r16 | r11
        L60:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            r20 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r22 = r11
            if (r22 != 0) goto L76
            boolean r22 = r7.g(r8)
            if (r22 == 0) goto L72
            r22 = 2048(0x800, float:2.87E-42)
            goto L74
        L72:
            r22 = r20
        L74:
            r16 = r16 | r22
        L76:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            r23 = 8192(0x2000, float:1.148E-41)
            if (r11 != 0) goto L8d
            int r11 = r45.ordinal()
            boolean r11 = r7.d(r11)
            if (r11 == 0) goto L89
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L8b
        L89:
            r11 = r23
        L8b:
            r16 = r16 | r11
        L8d:
            r11 = 196608(0x30000, float:2.75506E-40)
            r24 = r15 & r11
            r25 = 65536(0x10000, float:9.1835E-41)
            if (r24 != 0) goto La2
            boolean r24 = r7.f(r0)
            if (r24 == 0) goto L9e
            r24 = 131072(0x20000, float:1.83671E-40)
            goto La0
        L9e:
            r24 = r25
        La0:
            r16 = r16 | r24
        La2:
            r24 = 1572864(0x180000, float:2.204052E-39)
            r26 = r15 & r24
            r27 = 524288(0x80000, float:7.34684E-40)
            r28 = r11
            if (r26 != 0) goto Lb9
            boolean r26 = r7.g(r12)
            if (r26 == 0) goto Lb5
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto Lb7
        Lb5:
            r26 = r27
        Lb7:
            r16 = r16 | r26
        Lb9:
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r29 = r15 & r26
            r8 = r48
            if (r29 != 0) goto Lce
            boolean r30 = r7.f(r8)
            if (r30 == 0) goto Lca
            r30 = 8388608(0x800000, float:1.1754944E-38)
            goto Lcc
        Lca:
            r30 = 4194304(0x400000, float:5.877472E-39)
        Lcc:
            r16 = r16 | r30
        Lce:
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r31 = r15 & r30
            if (r31 != 0) goto Le2
            r11 = 0
            boolean r32 = r7.d(r11)
            if (r32 == 0) goto Lde
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto Le0
        Lde:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        Le0:
            r16 = r16 | r11
        Le2:
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r15 & r11
            r33 = r11
            r11 = 0
            if (r32 != 0) goto Lf8
            boolean r32 = r7.c(r11)
            if (r32 == 0) goto Lf4
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lf6
        Lf4:
            r32 = 268435456(0x10000000, float:2.524355E-29)
        Lf6:
            r16 = r16 | r32
        Lf8:
            r32 = r2 & 6
            if (r32 != 0) goto L10a
            boolean r32 = r7.f(r6)
            if (r32 == 0) goto L105
            r32 = 4
            goto L107
        L105:
            r32 = 2
        L107:
            r32 = r2 | r32
            goto L10c
        L10a:
            r32 = r2
        L10c:
            r34 = r2 & 48
            if (r34 != 0) goto L11a
            boolean r34 = r7.h(r13)
            if (r34 == 0) goto L118
            r18 = 32
        L118:
            r32 = r32 | r18
        L11a:
            r11 = r2 & 384(0x180, float:5.38E-43)
            r8 = 0
            if (r11 != 0) goto L129
            boolean r11 = r7.h(r8)
            if (r11 == 0) goto L127
            r19 = 256(0x100, float:3.59E-43)
        L127:
            r32 = r32 | r19
        L129:
            r11 = r2 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L137
            boolean r11 = r7.f(r4)
            if (r11 == 0) goto L135
            r20 = 2048(0x800, float:2.87E-42)
        L135:
            r32 = r32 | r20
        L137:
            r11 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L145
            boolean r11 = r7.f(r9)
            if (r11 == 0) goto L143
            r23 = 16384(0x4000, float:2.2959E-41)
        L143:
            r32 = r32 | r23
        L145:
            r11 = r2 & r28
            if (r11 != 0) goto L153
            boolean r11 = r7.f(r10)
            if (r11 == 0) goto L151
            r25 = 131072(0x20000, float:1.83671E-40)
        L151:
            r32 = r32 | r25
        L153:
            r11 = r2 & r24
            if (r11 != 0) goto L161
            boolean r11 = r7.h(r14)
            if (r11 == 0) goto L15f
            r27 = 1048576(0x100000, float:1.469368E-39)
        L15f:
            r32 = r32 | r27
        L161:
            r11 = r32
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r16 & r19
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r2) goto L179
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r11
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r2 == r8) goto L177
            goto L179
        L177:
            r2 = 0
            goto L17a
        L179:
            r2 = 1
        L17a:
            r8 = r16 & 1
            boolean r2 = r7.S(r8, r2)
            if (r2 == 0) goto L4cb
            r2 = r16 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r2 != r8) goto L18a
            r8 = 1
            goto L18b
        L18a:
            r8 = 0
        L18b:
            java.lang.Object r15 = r7.P()
            vs0 r13 = defpackage.ox0.a
            if (r8 != 0) goto L195
            if (r15 != r13) goto L19e
        L195:
            iq3 r15 = new iq3
            r8 = 0
            r15.<init>(r3, r8)
            r7.l0(r15)
        L19e:
            on2 r15 = (defpackage.on2) r15
            int r23 = r16 >> 3
            r25 = r23 & 14
            int r8 = r11 >> 15
            r27 = r8 & 112(0x70, float:1.57E-43)
            r27 = r25 | r27
            r32 = r8
            r8 = r11 & 896(0x380, float:1.256E-42)
            r8 = r27 | r8
            r27 = r8
            qa4 r8 = defpackage.np2.b0(r14, r7)
            r34 = r11
            r11 = 0
            qa4 r11 = defpackage.np2.b0(r11, r7)
            r20 = r27 & 14
            r14 = r20 ^ 6
            r12 = 4
            if (r14 <= r12) goto L1ca
            boolean r14 = r7.f(r3)
            if (r14 != 0) goto L1ce
        L1ca:
            r14 = r27 & 6
            if (r14 != r12) goto L1d0
        L1ce:
            r12 = 1
            goto L1d1
        L1d0:
            r12 = 0
        L1d1:
            boolean r14 = r7.f(r8)
            r12 = r12 | r14
            boolean r14 = r7.f(r11)
            r12 = r12 | r14
            boolean r14 = r7.f(r15)
            r12 = r12 | r14
            java.lang.Object r14 = r7.P()
            if (r12 != 0) goto L1e8
            if (r14 != r13) goto L214
        L1e8:
            vs0 r12 = defpackage.vs0.s0
            u6 r14 = new u6
            r1 = 13
            r14.<init>(r8, r11, r15, r1)
            ii1 r1 = defpackage.np2.J(r14, r12)
            ci2 r8 = new ci2
            r11 = 10
            r8.<init>(r11, r1, r3)
            ii1 r39 = defpackage.np2.J(r8, r12)
            qo3 r35 = new qo3
            r36 = 0
            r37 = 1
            java.lang.Class<pp6> r38 = defpackage.pp6.class
            java.lang.String r40 = "value"
            java.lang.String r41 = "getValue()Ljava/lang/Object;"
            r35.<init>(r36, r37, r38, r39, r40, r41)
            r14 = r35
            r7.l0(r14)
        L214:
            qo3 r14 = (defpackage.qo3) r14
            java.lang.Object r1 = r7.P()
            if (r1 != r13) goto L223
            w61 r1 = defpackage.mb3.w(r7)
            r7.l0(r1)
        L223:
            r11 = r1
            w61 r11 = (defpackage.w61) r11
            r8 = 32
            if (r2 != r8) goto L22c
            r1 = 1
            goto L22d
        L22c:
            r1 = 0
        L22d:
            java.lang.Object r8 = r7.P()
            if (r1 != 0) goto L235
            if (r8 != r13) goto L23e
        L235:
            iq3 r8 = new iq3
            r1 = 1
            r8.<init>(r3, r1)
            r7.l0(r8)
        L23e:
            on2 r8 = (defpackage.on2) r8
            r1 = 65520(0xfff0, float:9.1813E-41)
            r1 = r16 & r1
            int r12 = r16 >> 9
            r15 = 458752(0x70000, float:6.42848E-40)
            r20 = r12 & r15
            r1 = r1 | r20
            r20 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r20
            r1 = r1 | r12
            int r12 = r34 << 21
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r27
            r1 = r1 | r12
            int r12 = r34 << 15
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r12 & r34
            r1 = r1 | r35
            r35 = 1879048192(0x70000000, float:1.5845633E29)
            r12 = r12 & r35
            r1 = r1 | r12
            r12 = r1 & 112(0x70, float:1.57E-43)
            r12 = r12 ^ 48
            r36 = r15
            r15 = 32
            if (r12 <= r15) goto L276
            boolean r12 = r7.f(r3)
            if (r12 != 0) goto L27a
        L276:
            r12 = r1 & 48
            if (r12 != r15) goto L27c
        L27a:
            r12 = 1
            goto L27d
        L27c:
            r12 = 0
        L27d:
            r15 = r1 & 896(0x380, float:1.256E-42)
            r15 = r15 ^ 384(0x180, float:5.38E-43)
            r37 = r2
            r2 = 256(0x100, float:3.59E-43)
            if (r15 <= r2) goto L28d
            boolean r15 = r7.f(r5)
            if (r15 != 0) goto L291
        L28d:
            r15 = r1 & 384(0x180, float:5.38E-43)
            if (r15 != r2) goto L293
        L291:
            r2 = 1
            goto L294
        L293:
            r2 = 0
        L294:
            r2 = r2 | r12
            r12 = r1 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r12 <= r15) goto L2a4
            r12 = 0
            boolean r21 = r7.g(r12)
            if (r21 != 0) goto L2a8
        L2a4:
            r12 = r1 & 3072(0xc00, float:4.305E-42)
            if (r12 != r15) goto L2aa
        L2a8:
            r12 = 1
            goto L2ab
        L2aa:
            r12 = 0
        L2ab:
            r2 = r2 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r1
            r12 = r12 ^ 24576(0x6000, float:3.4438E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 <= r15) goto L2c0
            int r12 = r45.ordinal()
            boolean r12 = r7.d(r12)
            if (r12 != 0) goto L2c4
        L2c0:
            r12 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r12 != r15) goto L2c6
        L2c4:
            r12 = 1
            goto L2c7
        L2c6:
            r12 = 0
        L2c7:
            r2 = r2 | r12
            r12 = r1 & r34
            r12 = r12 ^ r30
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 <= r15) goto L2d6
            boolean r4 = r7.f(r4)
            if (r4 != 0) goto L2da
        L2d6:
            r4 = r1 & r30
            if (r4 != r15) goto L2dc
        L2da:
            r4 = 1
            goto L2dd
        L2dc:
            r4 = 0
        L2dd:
            r2 = r2 | r4
            r4 = r1 & r35
            r4 = r4 ^ r33
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 <= r12) goto L2ec
            boolean r4 = r7.f(r9)
            if (r4 != 0) goto L2f0
        L2ec:
            r4 = r1 & r33
            if (r4 != r12) goto L2f2
        L2f0:
            r4 = 1
            goto L2f3
        L2f2:
            r4 = 0
        L2f3:
            r2 = r2 | r4
            r4 = r1 & r20
            r4 = r4 ^ r24
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r4 <= r12) goto L303
            r4 = 0
            boolean r4 = r7.c(r4)
            if (r4 != 0) goto L307
        L303:
            r4 = r1 & r24
            if (r4 != r12) goto L309
        L307:
            r4 = 1
            goto L30a
        L309:
            r4 = 0
        L30a:
            r2 = r2 | r4
            r4 = r1 & r27
            r4 = r4 ^ r26
            r12 = 8388608(0x800000, float:1.1754944E-38)
            if (r4 <= r12) goto L319
            boolean r4 = r7.f(r6)
            if (r4 != 0) goto L31d
        L319:
            r4 = r1 & r26
            if (r4 != r12) goto L31f
        L31d:
            r4 = 1
            goto L320
        L31f:
            r4 = 0
        L320:
            r2 = r2 | r4
            r4 = r32 & 14
            r4 = r4 ^ 6
            r12 = 4
            if (r4 <= r12) goto L32e
            boolean r4 = r7.f(r10)
            if (r4 != 0) goto L332
        L32e:
            r4 = r32 & 6
            if (r4 != r12) goto L334
        L332:
            r4 = 1
            goto L335
        L334:
            r4 = 0
        L335:
            r2 = r2 | r4
            boolean r4 = r7.f(r8)
            r2 = r2 | r4
            r4 = r1 & r36
            r4 = r4 ^ r28
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r15) goto L34b
            r4 = 0
            boolean r18 = r7.d(r4)
            if (r18 != 0) goto L350
            goto L34c
        L34b:
            r4 = 0
        L34c:
            r1 = r1 & r28
            if (r1 != r15) goto L352
        L350:
            r1 = 1
            goto L353
        L352:
            r1 = r4
        L353:
            r1 = r1 | r2
            boolean r2 = r7.f(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L36b
            if (r2 != r13) goto L362
            goto L36b
        L362:
            r4 = r45
            r1 = r7
            r10 = r14
            r14 = r37
            r15 = 32
            goto L37c
        L36b:
            br4 r2 = new br4
            r4 = r45
            r1 = r7
            r7 = r14
            r14 = r37
            r15 = 32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r7
            r1.l0(r2)
        L37c:
            r18 = r2
            eq3 r18 = (defpackage.eq3) r18
            lo4 r2 = defpackage.lo4.Vertical
            if (r4 != r2) goto L386
            r8 = 1
            goto L387
        L386:
            r8 = 0
        L387:
            r5 = r25 ^ 6
            if (r5 <= r12) goto L391
            boolean r5 = r1.f(r3)
            if (r5 != 0) goto L395
        L391:
            r5 = r23 & 6
            if (r5 != r12) goto L397
        L395:
            r5 = 1
            goto L398
        L397:
            r5 = 0
        L398:
            boolean r6 = r1.g(r8)
            r5 = r5 | r6
            java.lang.Object r6 = r1.P()
            if (r5 != 0) goto L3a5
            if (r6 != r13) goto L3ad
        L3a5:
            uq3 r6 = new uq3
            r6.<init>(r3, r8)
            r1.l0(r6)
        L3ad:
            tq3 r6 = (defpackage.tq3) r6
            if (r14 != r15) goto L3b3
            r8 = 1
            goto L3b4
        L3b3:
            r8 = 0
        L3b4:
            r5 = r16 & r36
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r5 != r7) goto L3bc
            r5 = 1
            goto L3bd
        L3bc:
            r5 = 0
        L3bd:
            r5 = r5 | r8
            java.lang.Object r7 = r1.P()
            if (r5 != 0) goto L3c6
            if (r7 != r13) goto L3ce
        L3c6:
            rr4 r7 = new rr4
            r7.<init>(r0, r3)
            r1.l0(r7)
        L3ce:
            rr4 r7 = (defpackage.rr4) r7
            py0 r5 = defpackage.b80.a
            java.lang.Object r5 = r1.j(r5)
            z70 r5 = (defpackage.z70) r5
            nq6 r8 = defpackage.ky0.n
            java.lang.Object r8 = r1.j(r8)
            kk3 r8 = (defpackage.kk3) r8
            r9 = -853904960(0xffffffffcd1a71c0, float:-1.6194662E8)
            r1.b0(r9)
            if (r14 != r15) goto L3ea
            r9 = 1
            goto L3eb
        L3ea:
            r9 = 0
        L3eb:
            boolean r14 = r1.f(r5)
            r9 = r9 | r14
            int r14 = r8.ordinal()
            boolean r14 = r1.d(r14)
            r9 = r9 | r14
            java.lang.Object r14 = r1.P()
            if (r9 != 0) goto L401
            if (r14 != r13) goto L409
        L401:
            tq4 r14 = new tq4
            r14.<init>(r3, r5, r8)
            r1.l0(r14)
        L409:
            r9 = r14
            tq4 r9 = (defpackage.tq4) r9
            r8 = 0
            r1.p(r8)
            x64 r14 = defpackage.x64.a
            if (r47 == 0) goto L465
            r5 = -853484445(0xffffffffcd20dc63, float:-1.6867486E8)
            r1.b0(r5)
            int r5 = r16 >> 21
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r25 | r5
            r8 = r5 & 14
            r8 = r8 ^ 6
            if (r8 <= r12) goto L42c
            boolean r8 = r1.f(r3)
            if (r8 != 0) goto L430
        L42c:
            r8 = r5 & 6
            if (r8 != r12) goto L432
        L430:
            r8 = 1
            goto L433
        L432:
            r8 = 0
        L433:
            r12 = r5 & 112(0x70, float:1.57E-43)
            r12 = r12 ^ 48
            if (r12 <= r15) goto L440
            r12 = 0
            boolean r16 = r1.d(r12)
            if (r16 != 0) goto L444
        L440:
            r5 = r5 & 48
            if (r5 != r15) goto L446
        L444:
            r5 = 1
            goto L447
        L446:
            r5 = 0
        L447:
            r5 = r5 | r8
            java.lang.Object r8 = r1.P()
            if (r5 != 0) goto L450
            if (r8 != r13) goto L458
        L450:
            sq4 r8 = new sq4
            r8.<init>(r3)
            r1.l0(r8)
        L458:
            sq4 r8 = (defpackage.sq4) r8
            p70 r5 = r3.u
            a74 r5 = defpackage.ak7.n0(r8, r5, r4)
            r8 = 0
            r1.p(r8)
            goto L470
        L465:
            r8 = 0
            r5 = -853054661(0xffffffffcd276b3b, float:-1.7555141E8)
            r1.b0(r5)
            r1.p(r8)
            r5 = r14
        L470:
            gp3 r8 = r3.x
            r12 = r42
            a74 r8 = r12.d(r8)
            sz r13 = r3.v
            a74 r8 = r8.d(r13)
            r13 = r47
            a74 r6 = defpackage.vy7.p0(r8, r10, r6, r4, r13)
            if (r4 != r2) goto L488
            r8 = 1
            goto L489
        L488:
            r8 = 0
        L489:
            if (r13 == 0) goto L49b
            bj1 r2 = new bj1
            r15 = 1
            r2.<init>(r15, r3, r11, r8)
            r8 = 0
            a74 r2 = defpackage.ua6.a(r14, r8, r2)
            a74 r2 = r6.d(r2)
            goto L49f
        L49b:
            a74 r2 = r6.d(r14)
        L49f:
            a74 r2 = r2.d(r5)
            r94 r8 = r3.p
            r5 = r48
            r6 = r13
            a74 r2 = defpackage.f04.O(r2, r3, r4, r5, r6, r7, r8, r9)
            rg r4 = new rg
            r5 = 2
            r4.<init>(r3, r5)
            a74 r4 = defpackage.jw6.a(r14, r3, r4)
            a74 r2 = r2.d(r4)
            r13 = r50
            a74 r6 = defpackage.mb3.L(r2, r13)
            pq3 r7 = r3.s
            r5 = r10
            r10 = 0
            r9 = r1
            r8 = r18
            defpackage.kn2.e(r5, r6, r7, r8, r9, r10)
            goto L4d0
        L4cb:
            r12 = r1
            r1 = r7
            r1.V()
        L4d0:
            cf5 r15 = r1.t()
            if (r15 == 0) goto L4f6
            jq3 r0 = new jq3
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r8 = r49
            r10 = r51
            r11 = r52
            r14 = r56
            r2 = r3
            r1 = r12
            r9 = r13
            r3 = r44
            r12 = r53
            r13 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.d = r0
        L4f6:
            return
    }

    public static final java.lang.String d0(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "android.widget.Button"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "android.widget.CheckBox"
            return r1
        Lb:
            r0 = 3
            if (r1 != r0) goto L11
            java.lang.String r1 = "android.widget.RadioButton"
            return r1
        L11:
            r0 = 5
            if (r1 != r0) goto L17
            java.lang.String r1 = "android.widget.ImageView"
            return r1
        L17:
            r0 = 6
            if (r1 != r0) goto L1d
            java.lang.String r1 = "android.widget.Spinner"
            return r1
        L1d:
            r0 = 7
            if (r1 != r0) goto L23
            java.lang.String r1 = "android.widget.NumberPicker"
            return r1
        L23:
            r1 = 0
            return r1
    }

    public static final void e(boolean r3, defpackage.eo2 r4, defpackage.px0 r5, int r6) {
            xq2 r5 = (defpackage.xq2) r5
            r0 = 1818896922(0x6c6a2a1a, float:1.13234984E27)
            r5.d0(r0)
            boolean r0 = r5.g(r3)
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r6
            boolean r1 = r5.h(r4)
            if (r1 == 0) goto L1b
            r1 = 32
            goto L1d
        L1b:
            r1 = 16
        L1d:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            if (r1 != r2) goto L2f
            boolean r1 = r5.E()
            if (r1 != 0) goto L2b
            goto L2f
        L2b:
            r5.V()
            goto L34
        L2f:
            r0 = r0 & 126(0x7e, float:1.77E-43)
            defpackage.jx2.d(r3, r4, r5, r0)
        L34:
            cf5 r5 = r5.t()
            if (r5 == 0) goto L41
            v51 r0 = new v51
            r0.<init>(r3, r4, r6)
            r5.d = r0
        L41:
            return
    }

    public static final void e0(java.util.List r32, defpackage.hj r33) {
            r0 = r32
            r1 = r33
            android.graphics.Path r2 = r1.a
            android.graphics.Path r3 = r1.a
            android.graphics.Path$FillType r2 = r2.getFillType()
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.EVEN_ODD
            r5 = 0
            if (r2 != r4) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = r5
        L14:
            r3.rewind()
            r1.h(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L23
            pt4 r2 = defpackage.pt4.c
            goto L29
        L23:
            java.lang.Object r2 = r0.get(r5)
            hu4 r2 = (defpackage.hu4) r2
        L29:
            int r10 = r0.size()
            r11 = 0
            r12 = r5
            r4 = r11
            r5 = r4
            r13 = r5
            r14 = r13
            r18 = r14
            r19 = r18
        L37:
            if (r12 >= r10) goto L2bc
            java.lang.Object r6 = r0.get(r12)
            r15 = r6
            hu4 r15 = (defpackage.hu4) r15
            boolean r6 = r15 instanceof defpackage.pt4
            if (r6 == 0) goto L59
            r3.close()
            r22 = r3
            r20 = r10
            r25 = r11
            r21 = r12
            r23 = r15
            r4 = r18
            r13 = r4
            r5 = r19
            r14 = r5
            goto L2a9
        L59:
            boolean r6 = r15 instanceof defpackage.bu4
            if (r6 == 0) goto L79
            r2 = r15
            bu4 r2 = (defpackage.bu4) r2
            float r6 = r2.c
            float r13 = r13 + r6
            float r2 = r2.d
            float r14 = r14 + r2
            r3.rMoveTo(r6, r2)
            r22 = r3
            r20 = r10
            r25 = r11
            r21 = r12
            r18 = r13
            r19 = r14
        L75:
            r23 = r15
            goto L2a9
        L79:
            boolean r6 = r15 instanceof defpackage.tt4
            if (r6 == 0) goto L96
            r2 = r15
            tt4 r2 = (defpackage.tt4) r2
            float r6 = r2.c
            float r2 = r2.d
            r3.moveTo(r6, r2)
            r14 = r2
            r19 = r14
            r22 = r3
            r13 = r6
            r18 = r13
        L8f:
            r20 = r10
            r25 = r11
            r21 = r12
            goto L75
        L96:
            boolean r6 = r15 instanceof defpackage.au4
            if (r6 == 0) goto La9
            r2 = r15
            au4 r2 = (defpackage.au4) r2
            float r6 = r2.d
            float r2 = r2.c
            r3.rLineTo(r2, r6)
            float r13 = r13 + r2
            float r14 = r14 + r6
        La6:
            r22 = r3
            goto L8f
        La9:
            boolean r6 = r15 instanceof defpackage.st4
            if (r6 == 0) goto Lbc
            r2 = r15
            st4 r2 = (defpackage.st4) r2
            float r6 = r2.d
            float r2 = r2.c
            r1.e(r2, r6)
            r13 = r2
            r22 = r3
            r14 = r6
            goto L8f
        Lbc:
            boolean r6 = r15 instanceof defpackage.zt4
            if (r6 == 0) goto Lca
            r2 = r15
            zt4 r2 = (defpackage.zt4) r2
            float r2 = r2.c
            r3.rLineTo(r2, r11)
            float r13 = r13 + r2
            goto La6
        Lca:
            boolean r6 = r15 instanceof defpackage.rt4
            if (r6 == 0) goto Ld8
            r2 = r15
            rt4 r2 = (defpackage.rt4) r2
            float r2 = r2.c
            r1.e(r2, r14)
            r13 = r2
            goto La6
        Ld8:
            boolean r6 = r15 instanceof defpackage.fu4
            if (r6 == 0) goto Le6
            r2 = r15
            fu4 r2 = (defpackage.fu4) r2
            float r2 = r2.c
            r3.rLineTo(r11, r2)
        Le4:
            float r14 = r14 + r2
            goto La6
        Le6:
            boolean r6 = r15 instanceof defpackage.gu4
            if (r6 == 0) goto Lf4
            r2 = r15
            gu4 r2 = (defpackage.gu4) r2
            float r2 = r2.c
            r1.e(r13, r2)
            r14 = r2
            goto La6
        Lf4:
            boolean r6 = r15 instanceof defpackage.yt4
            if (r6 == 0) goto L116
            r2 = r15
            yt4 r2 = (defpackage.yt4) r2
            float r4 = r2.c
            float r5 = r2.d
            float r6 = r2.e
            float r7 = r2.f
            float r8 = r2.g
            float r9 = r2.h
            r3.rCubicTo(r4, r5, r6, r7, r8, r9)
            float r4 = r2.e
            float r4 = r4 + r13
            float r5 = r2.f
            float r5 = r5 + r14
            float r6 = r2.g
            float r13 = r13 + r6
            float r2 = r2.h
            goto Le4
        L116:
            boolean r6 = r15 instanceof defpackage.qt4
            if (r6 == 0) goto L13a
            r2 = r15
            qt4 r2 = (defpackage.qt4) r2
            float r4 = r2.c
            float r5 = r2.d
            float r6 = r2.e
            float r7 = r2.f
            float r8 = r2.g
            float r9 = r2.h
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            float r4 = r2.e
            float r5 = r2.f
            float r6 = r2.g
            float r2 = r2.h
        L134:
            r14 = r2
            r22 = r3
            r13 = r6
            goto L8f
        L13a:
            boolean r6 = r15 instanceof defpackage.du4
            if (r6 == 0) goto L166
            boolean r2 = r2.a
            if (r2 == 0) goto L149
            float r2 = r13 - r4
            float r4 = r14 - r5
            r5 = r4
            r4 = r2
            goto L14b
        L149:
            r4 = r11
            r5 = r4
        L14b:
            r2 = r15
            du4 r2 = (defpackage.du4) r2
            float r6 = r2.c
            float r7 = r2.d
            float r8 = r2.e
            float r9 = r2.f
            r3.rCubicTo(r4, r5, r6, r7, r8, r9)
            float r4 = r2.c
            float r4 = r4 + r13
            float r5 = r2.d
            float r5 = r5 + r14
            float r6 = r2.e
            float r13 = r13 + r6
            float r2 = r2.f
            goto Le4
        L166:
            boolean r6 = r15 instanceof defpackage.vt4
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L18e
            boolean r2 = r2.a
            if (r2 == 0) goto L175
            float r13 = r13 * r7
            float r13 = r13 - r4
            float r7 = r7 * r14
            float r14 = r7 - r5
        L175:
            r4 = r13
            r5 = r14
            r2 = r15
            vt4 r2 = (defpackage.vt4) r2
            float r6 = r2.c
            float r7 = r2.d
            float r8 = r2.e
            float r9 = r2.f
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            float r4 = r2.c
            float r5 = r2.d
            float r6 = r2.e
            float r2 = r2.f
            goto L134
        L18e:
            boolean r6 = r15 instanceof defpackage.cu4
            if (r6 == 0) goto L1aa
            r2 = r15
            cu4 r2 = (defpackage.cu4) r2
            float r4 = r2.f
            float r5 = r2.e
            float r6 = r2.d
            float r2 = r2.c
            r3.rQuadTo(r2, r6, r5, r4)
            float r2 = r2 + r13
            float r6 = r6 + r14
            float r13 = r13 + r5
            float r14 = r14 + r4
            r4 = r2
            r22 = r3
            r5 = r6
            goto L8f
        L1aa:
            boolean r6 = r15 instanceof defpackage.ut4
            if (r6 == 0) goto L1cc
            r2 = r15
            ut4 r2 = (defpackage.ut4) r2
            float r4 = r2.f
            float r5 = r2.e
            float r6 = r2.d
            float r2 = r2.c
            r3.quadTo(r2, r6, r5, r4)
            r22 = r3
            r14 = r4
            r13 = r5
            r5 = r6
        L1c1:
            r20 = r10
            r25 = r11
            r21 = r12
            r23 = r15
            r4 = r2
            goto L2a9
        L1cc:
            boolean r6 = r15 instanceof defpackage.eu4
            if (r6 == 0) goto L1ed
            boolean r2 = r2.b
            if (r2 == 0) goto L1d9
            float r2 = r13 - r4
            float r4 = r14 - r5
            goto L1db
        L1d9:
            r2 = r11
            r4 = r2
        L1db:
            r5 = r15
            eu4 r5 = (defpackage.eu4) r5
            float r6 = r5.d
            float r5 = r5.c
            r3.rQuadTo(r2, r4, r5, r6)
            float r2 = r2 + r13
            float r4 = r4 + r14
            float r13 = r13 + r5
            float r14 = r14 + r6
            r22 = r3
            r5 = r4
            goto L1c1
        L1ed:
            boolean r6 = r15 instanceof defpackage.wt4
            if (r6 == 0) goto L214
            boolean r2 = r2.b
            if (r2 == 0) goto L1fa
            float r13 = r13 * r7
            float r13 = r13 - r4
            float r7 = r7 * r14
            float r14 = r7 - r5
        L1fa:
            r2 = r15
            wt4 r2 = (defpackage.wt4) r2
            float r4 = r2.d
            float r2 = r2.c
            r3.quadTo(r13, r14, r2, r4)
            r22 = r3
            r20 = r10
            r25 = r11
            r21 = r12
            r5 = r14
            r23 = r15
            r14 = r4
            r4 = r13
            r13 = r2
            goto L2a9
        L214:
            boolean r2 = r15 instanceof defpackage.xt4
            if (r2 == 0) goto L265
            r2 = r15
            xt4 r2 = (defpackage.xt4) r2
            float r4 = r2.h
            float r4 = r4 + r13
            float r5 = r2.i
            float r5 = r5 + r14
            double r6 = (double) r13
            double r8 = (double) r14
            r13 = r6
            double r6 = (double) r4
            r16 = r8
            double r8 = (double) r5
            float r11 = r2.c
            double r0 = (double) r11
            float r11 = r2.d
            r21 = r0
            double r0 = (double) r11
            float r11 = r2.e
            r23 = r0
            double r0 = (double) r11
            boolean r11 = r2.f
            boolean r2 = r2.g
            r20 = r10
            r25 = 0
            r28 = r0
            r1 = r33
            r0 = r15
            r30 = r16
            r17 = r2
            r16 = r11
            r10 = r21
            r22 = r3
            r21 = r12
            r2 = r13
            r12 = r23
            r14 = r28
            r23 = r4
            r24 = r5
            r4 = r30
            p(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r4 = r23
            r13 = r4
            r5 = r24
            r14 = r5
            r23 = r0
            goto L2a9
        L265:
            r22 = r3
            r20 = r10
            r25 = r11
            r21 = r12
            r0 = r15
            boolean r1 = r0 instanceof defpackage.ot4
            if (r1 == 0) goto L2b9
            double r2 = (double) r13
            double r4 = (double) r14
            r15 = r0
            ot4 r15 = (defpackage.ot4) r15
            float r1 = r15.i
            float r6 = r15.h
            r8 = r6
            double r6 = (double) r8
            r10 = r8
            double r8 = (double) r1
            float r11 = r15.c
            double r11 = (double) r11
            float r13 = r15.d
            double r13 = (double) r13
            r23 = r0
            float r0 = r15.e
            r16 = r1
            double r0 = (double) r0
            r26 = r0
            boolean r0 = r15.f
            boolean r1 = r15.g
            r15 = r16
            r16 = r0
            r0 = r15
            r17 = r1
            r24 = r10
            r10 = r11
            r12 = r13
            r14 = r26
            r1 = r33
            p(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r5 = r0
            r14 = r5
            r4 = r24
            r13 = r4
        L2a9:
            int r12 = r21 + 1
            r0 = r32
            r1 = r33
            r10 = r20
            r3 = r22
            r2 = r23
            r11 = r25
            goto L37
        L2b9:
            defpackage.i.d()
        L2bc:
            return
    }

    public static final java.lang.Object f(defpackage.mw6 r7, defpackage.d20 r8) {
            boolean r0 = r8 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r8
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dq5 r0 = new dq5
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
            r0.R = r7
            r0.Y = r3
            py4 r8 = defpackage.py4.Main
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            oy4 r8 = (defpackage.oy4) r8
            int r2 = r8.d
            java.util.List r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = defpackage.ej2.m(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
    }

    public static java.lang.String f0(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto La
            r0 = r2
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 != 0) goto L13
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
            return r2
        L13:
            return r0
    }

    public static final defpackage.z64 g(defpackage.xg1 r2, int r3) {
            z64 r2 = (defpackage.z64) r2
            z64 r2 = r2.A
            z64 r2 = r2.Y
            if (r2 != 0) goto L9
            goto L1f
        L9:
            int r0 = r2.R
            r0 = r0 & r3
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            if (r2 == 0) goto L1f
            int r0 = r2.L
            r1 = r0 & 2
            if (r1 == 0) goto L18
            goto L1f
        L18:
            r0 = r0 & r3
            if (r0 == 0) goto L1c
            return r2
        L1c:
            z64 r2 = r2.Y
            goto Lf
        L1f:
            r2 = 0
            return r2
    }

    public static void h(long r20, defpackage.k80 r22, int r23, java.util.ArrayList r24, int r25, int r26, java.util.ArrayList r27) {
            r0 = r22
            r1 = r23
            r5 = r24
            r2 = r25
            r10 = r26
            r8 = r27
            java.lang.String r3 = "Failed requirement."
            if (r2 >= r10) goto L1a9
            r4 = r2
        L11:
            if (r4 >= r10) goto L26
            java.lang.Object r6 = r5.get(r4)
            da0 r6 = (defpackage.da0) r6
            int r6 = r6.d()
            if (r6 < r1) goto L22
            int r4 = r4 + 1
            goto L11
        L22:
            defpackage.i.h(r3)
            return
        L26:
            java.lang.Object r3 = r24.get(r25)
            da0 r3 = (defpackage.da0) r3
            int r4 = r10 + (-1)
            java.lang.Object r4 = r5.get(r4)
            da0 r4 = (defpackage.da0) r4
            int r6 = r3.d()
            if (r1 != r6) goto L53
            java.lang.Object r3 = r8.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r6 = r5.get(r2)
            da0 r6 = (defpackage.da0) r6
            r19 = r6
            r6 = r2
            r2 = r3
            r3 = r19
            goto L55
        L53:
            r6 = r2
            r2 = -1
        L55:
            byte r7 = r3.i(r1)
            byte r9 = r4.i(r1)
            r14 = 2
            if (r7 == r9) goto L124
            int r3 = r6 + 1
            r4 = 1
        L64:
            if (r3 >= r10) goto L83
            int r7 = r3 + (-1)
            java.lang.Object r7 = r5.get(r7)
            da0 r7 = (defpackage.da0) r7
            byte r7 = r7.i(r1)
            java.lang.Object r9 = r5.get(r3)
            da0 r9 = (defpackage.da0) r9
            byte r9 = r9.i(r1)
            if (r7 == r9) goto L80
            int r4 = r4 + 1
        L80:
            int r3 = r3 + 1
            goto L64
        L83:
            r16 = -1
            r17 = 4
            long r11 = r0.B
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            int r3 = r4 * 2
            long r13 = (long) r3
            long r11 = r11 + r13
            r0.q0(r4)
            r0.q0(r2)
            r2 = r6
        L99:
            if (r2 >= r10) goto Lbd
            java.lang.Object r3 = r5.get(r2)
            da0 r3 = (defpackage.da0) r3
            byte r3 = r3.i(r1)
            if (r2 == r6) goto Lb5
            int r4 = r2 + (-1)
            java.lang.Object r4 = r5.get(r4)
            da0 r4 = (defpackage.da0) r4
            byte r4 = r4.i(r1)
            if (r3 == r4) goto Lba
        Lb5:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.q0(r3)
        Lba:
            int r2 = r2 + 1
            goto L99
        Lbd:
            k80 r4 = new k80
            r4.<init>()
            r7 = r6
        Lc3:
            if (r7 >= r10) goto L120
            java.lang.Object r2 = r5.get(r7)
            da0 r2 = (defpackage.da0) r2
            byte r2 = r2.i(r1)
            int r3 = r7 + 1
            r6 = r3
        Ld2:
            if (r6 >= r10) goto Le4
            java.lang.Object r9 = r5.get(r6)
            da0 r9 = (defpackage.da0) r9
            byte r9 = r9.i(r1)
            if (r2 == r9) goto Le1
            goto Le5
        Le1:
            int r6 = r6 + 1
            goto Ld2
        Le4:
            r6 = r10
        Le5:
            if (r3 != r6) goto L106
            int r2 = r1 + 1
            java.lang.Object r3 = r5.get(r7)
            da0 r3 = (defpackage.da0) r3
            int r3 = r3.d()
            if (r2 != r3) goto L106
            java.lang.Object r2 = r8.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.q0(r2)
            r9 = r8
            r2 = r11
            r8 = r6
            goto L11c
        L106:
            long r2 = r4.B
            long r2 = r2 / r17
            long r2 = r2 + r11
            int r2 = (int) r2
            int r2 = r2 * (-1)
            r0.q0(r2)
            int r5 = r1 + 1
            r9 = r8
            r2 = r11
            r8 = r6
            r6 = r24
            h(r2, r4, r5, r6, r7, r8, r9)
            r5 = r6
        L11c:
            r11 = r2
            r7 = r8
            r8 = r9
            goto Lc3
        L120:
            r0.m0(r4)
            return
        L124:
            r9 = r8
            r16 = -1
            r17 = 4
            int r7 = r3.d()
            int r8 = r4.d()
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 0
            r11 = r1
        L137:
            if (r11 >= r7) goto L148
            byte r12 = r3.i(r11)
            byte r13 = r4.i(r11)
            if (r12 != r13) goto L148
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto L137
        L148:
            long r11 = r0.B
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            long r13 = (long) r8
            long r11 = r11 + r13
            r13 = 1
            long r11 = r11 + r13
            int r4 = -r8
            r0.q0(r4)
            r0.q0(r2)
            int r4 = r1 + r8
        L15d:
            if (r1 >= r4) goto L16b
            byte r2 = r3.i(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.q0(r2)
            int r1 = r1 + 1
            goto L15d
        L16b:
            int r1 = r6 + 1
            if (r1 != r10) goto L18f
            java.lang.Object r1 = r5.get(r6)
            da0 r1 = (defpackage.da0) r1
            int r1 = r1.d()
            if (r4 != r1) goto L189
            java.lang.Object r1 = r9.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.q0(r1)
            return
        L189:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
            return
        L18f:
            k80 r3 = new k80
            r3.<init>()
            long r1 = r3.B
            long r1 = r1 / r17
            long r1 = r1 + r11
            int r1 = (int) r1
            int r1 = r1 * (-1)
            r0.q0(r1)
            r8 = r9
            r7 = r10
            r1 = r11
            h(r1, r3, r4, r5, r6, r7, r8)
            r0.m0(r3)
            return
        L1a9:
            defpackage.i.h(r3)
            return
    }

    public static void k(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.x(r1)
            return
    }

    public static defpackage.ci l(int r0, int r1, int r2, int r3) {
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r1, r2, r3)
            ci r1 = new ci
            r1.<init>(r0)
            return r1
    }

    public static final defpackage.j16 n(android.content.Context r2, java.lang.Class r3, java.lang.String r4) {
            boolean r0 = defpackage.qs6.v0(r4)
            r1 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = ":memory:"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L15
            j16 r0 = new j16
            r0.<init>(r2, r3, r4)
            return r0
        L15:
            java.lang.String r2 = "Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            defpackage.i.h(r2)
            return r1
        L1b:
            java.lang.String r2 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            defpackage.i.h(r2)
            return r1
    }

    public static final boolean o(java.lang.String r8, java.lang.String r9) {
            r8.getClass()
            boolean r0 = r8.equals(r9)
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r8.length()
            r2 = 0
            if (r0 != 0) goto L13
            goto L5a
        L13:
            r0 = r2
            r3 = r0
            r4 = r3
        L16:
            int r5 = r8.length()
            if (r0 >= r5) goto L42
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L29
            if (r5 == r7) goto L29
            goto L5a
        L29:
            if (r5 == r7) goto L3c
            r7 = 41
            if (r5 == r7) goto L30
            goto L3e
        L30:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3e
            int r5 = r8.length()
            int r5 = r5 - r1
            if (r4 == r5) goto L3e
            goto L5a
        L3c:
            int r3 = r3 + 1
        L3e:
            int r0 = r0 + 1
            r4 = r6
            goto L16
        L42:
            if (r3 != 0) goto L5a
            int r0 = r8.length()
            int r0 = r0 - r1
            java.lang.String r8 = r8.substring(r1, r0)
            java.lang.CharSequence r8 = defpackage.qs6.T0(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.nb3.k(r8, r9)
            return r8
        L5a:
            return r2
    }

    public static final void p(defpackage.hj r50, double r51, double r53, double r55, double r57, double r59, double r61, double r63, boolean r65, boolean r66) {
            r1 = r51
            r5 = r55
            r3 = r59
            r7 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r63 / r7
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r9
            double r11 = java.lang.Math.cos(r7)
            double r13 = java.lang.Math.sin(r7)
            double r15 = r1 * r11
            double r17 = r53 * r13
            double r17 = r17 + r15
            double r17 = r17 / r3
            r15 = r9
            double r9 = -r1
            double r9 = r9 * r13
            double r19 = r53 * r11
            double r19 = r19 + r9
            double r19 = r19 / r61
            double r9 = r5 * r11
            double r21 = r57 * r13
            double r21 = r21 + r9
            double r21 = r21 / r3
            double r9 = -r5
            double r9 = r9 * r13
            double r23 = r57 * r11
            double r23 = r23 + r9
            double r23 = r23 / r61
            double r9 = r17 - r21
            double r25 = r19 - r23
            double r27 = r17 + r21
            r29 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r27 = r27 / r29
            double r31 = r19 + r23
            double r31 = r31 / r29
            double r33 = r9 * r9
            double r35 = r25 * r25
            double r35 = r35 + r33
            r33 = 0
            int r0 = (r35 > r33 ? 1 : (r35 == r33 ? 0 : -1))
            if (r0 != 0) goto L58
            goto L1ae
        L58:
            r37 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r39 = r37 / r35
            r41 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r39 = r39 - r41
            int r0 = (r39 > r33 ? 1 : (r39 == r33 ? 0 : -1))
            if (r0 >= 0) goto L84
            double r7 = java.lang.Math.sqrt(r35)
            r9 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
            double r7 = r7 / r9
            float r0 = (float) r7
            double r7 = (double) r0
            double r9 = r3 * r7
            double r11 = r61 * r7
            r0 = r50
            r3 = r53
            r7 = r57
            r13 = r63
            r15 = r65
            r16 = r66
            p(r0, r1, r3, r5, r7, r9, r11, r13, r15, r16)
            return
        L84:
            r0 = r66
            double r1 = java.lang.Math.sqrt(r39)
            double r9 = r9 * r1
            double r1 = r1 * r25
            r5 = r65
            if (r5 != r0) goto L96
            double r27 = r27 - r1
            double r31 = r31 + r9
            goto L9a
        L96:
            double r27 = r27 + r1
            double r31 = r31 - r9
        L9a:
            double r1 = r19 - r31
            double r5 = r17 - r27
            double r1 = java.lang.Math.atan2(r1, r5)
            double r5 = r23 - r31
            double r9 = r21 - r27
            double r5 = java.lang.Math.atan2(r5, r9)
            double r5 = r5 - r1
            int r9 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r9 < 0) goto Lb4
            r17 = 1
            r10 = r17
            goto Lb5
        Lb4:
            r10 = 0
        Lb5:
            if (r0 == r10) goto Lc3
            r17 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            if (r9 <= 0) goto Lc1
            double r5 = r5 - r17
            goto Lc3
        Lc1:
            double r5 = r5 + r17
        Lc3:
            double r27 = r27 * r3
            double r31 = r31 * r61
            double r9 = r27 * r11
            double r17 = r31 * r13
            double r9 = r9 - r17
            double r27 = r27 * r13
            double r31 = r31 * r11
            double r31 = r31 + r27
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r13 = r5 * r11
            double r13 = r13 / r15
            double r13 = java.lang.Math.abs(r13)
            double r13 = java.lang.Math.ceil(r13)
            int r0 = (int) r13
            double r13 = java.lang.Math.cos(r7)
            double r7 = java.lang.Math.sin(r7)
            double r15 = java.lang.Math.cos(r1)
            double r17 = java.lang.Math.sin(r1)
            r56 = r11
            double r11 = -r3
            double r19 = r11 * r13
            double r21 = r19 * r17
            double r23 = r61 * r7
            double r25 = r23 * r15
            double r21 = r21 - r25
            double r11 = r11 * r7
            double r17 = r17 * r11
            double r25 = r61 * r13
            double r15 = r15 * r25
            double r15 = r15 + r17
            r63 = r1
            double r1 = (double) r0
            double r5 = r5 / r1
            r17 = r63
            r27 = r21
            r1 = 0
            r21 = r15
            r15 = r53
        L114:
            if (r1 >= r0) goto L1ae
            double r33 = r17 + r5
            double r35 = java.lang.Math.sin(r33)
            double r39 = java.lang.Math.cos(r33)
            double r41 = r3 * r13
            double r41 = r41 * r39
            double r41 = r41 + r9
            double r43 = r23 * r35
            r2 = r0
            r53 = r1
            double r0 = r41 - r43
            double r41 = r3 * r7
            double r41 = r41 * r39
            double r41 = r41 + r31
            double r43 = r25 * r35
            r54 = r2
            double r2 = r43 + r41
            double r41 = r19 * r35
            double r43 = r23 * r39
            double r41 = r41 - r43
            double r35 = r35 * r11
            double r39 = r39 * r25
            double r35 = r39 + r35
            double r17 = r33 - r17
            double r39 = r17 / r29
            double r39 = java.lang.Math.tan(r39)
            double r17 = java.lang.Math.sin(r17)
            r43 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r45 = r39 * r43
            double r45 = r45 * r39
            double r45 = r45 + r56
            double r39 = java.lang.Math.sqrt(r45)
            double r39 = r39 - r37
            double r39 = r39 * r17
            double r39 = r39 / r43
            double r27 = r27 * r39
            r61 = r5
            double r4 = r27 + r51
            double r21 = r21 * r39
            r63 = r7
            double r6 = r21 + r15
            double r15 = r39 * r41
            r65 = r9
            double r8 = r0 - r15
            double r39 = r39 * r35
            r15 = r11
            double r10 = r2 - r39
            float r4 = (float) r4
            float r5 = (float) r6
            float r6 = (float) r8
            float r7 = (float) r10
            float r8 = (float) r0
            float r9 = (float) r2
            r10 = r50
            android.graphics.Path r11 = r10.a
            r44 = r4
            r45 = r5
            r46 = r6
            r47 = r7
            r48 = r8
            r49 = r9
            r43 = r11
            r43.cubicTo(r44, r45, r46, r47, r48, r49)
            int r4 = r53 + 1
            r5 = r61
            r7 = r63
            r9 = r65
            r51 = r0
            r1 = r4
            r11 = r15
            r17 = r33
            r21 = r35
            r27 = r41
            r0 = r54
            r15 = r2
            r3 = r59
            goto L114
        L1ae:
            return
    }

    public static final java.lang.String q(java.util.Collection r7) {
            r7.getClass()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L24
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r5 = 0
            r6 = 56
            java.lang.String r2 = ",\n"
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\n"
            java.lang.String r7 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = defpackage.rs6.Q(r7)
            java.lang.String r0 = "},"
            java.lang.String r7 = r7.concat(r0)
            return r7
        L24:
            java.lang.String r7 = " }"
            return r7
    }

    public static final defpackage.bp7 r(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof defpackage.bp7
            if (r2 == 0) goto L14
            bp7 r1 = (defpackage.bp7) r1
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

    public static defpackage.vl6 t() {
            m44 r0 = defpackage.bm6.b
            java.lang.Object r0 = r0.f()
            vl6 r0 = (defpackage.vl6) r0
            return r0
    }

    public abstract int B();

    public abstract boolean I(float r1);

    public abstract boolean J(android.view.View r1);

    public abstract boolean K(float r1, float r2);

    public abstract defpackage.c1 S(defpackage.ea0 r1);

    public abstract boolean c0(android.view.View r1, float r2);

    public abstract void g0(android.view.ViewGroup.MarginLayoutParams r1, int r2);

    public abstract void h0(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3);

    public abstract int i(android.view.ViewGroup.MarginLayoutParams r1);

    public abstract void i0(defpackage.c1 r1);

    public abstract float j(int r1);

    public abstract java.lang.Object m(defpackage.c1 r1);

    public abstract int s(android.view.ViewGroup.MarginLayoutParams r1);

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y(android.view.View r1);

    public abstract int z(androidx.coordinatorlayout.widget.CoordinatorLayout r1);
}
