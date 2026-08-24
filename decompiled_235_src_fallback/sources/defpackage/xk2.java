package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk2  reason: default package */
/* loaded from: classes.dex */
public abstract class xk2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static defpackage.e33 c;
    public static defpackage.e33 d;

    public static boolean A() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Vivo"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "vivo 1805"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static final void B(java.lang.String r3) {
            r3.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No valid saved state was found for the key '"
            java.lang.String r2 = "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."
            java.lang.String r3 = defpackage.lb1.A(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public static final java.util.ArrayList C(java.util.Map r4, defpackage.qn2 r5) {
            r4.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            rb4 r2 = (defpackage.rb4) r2
            if (r2 == 0) goto L2b
            boolean r3 = r2.b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r3.getClass()
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L10
            boolean r2 = r2.c
            if (r2 != 0) goto L10
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L10
        L45:
            java.util.Set r4 = r0.keySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.g(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L54
            r0.add(r1)
            goto L54
        L71:
            return r0
    }

    public static android.content.res.TypedArray D(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    public static defpackage.ei E(java.lang.String r8) {
            java.lang.String r0 = "HTTP/1."
            r1 = 0
            boolean r0 = defpackage.xs6.g0(r8, r0, r1)
            r2 = 4
            r3 = 32
            java.lang.String r4 = "Unexpected status line: "
            if (r0 == 0) goto L44
            int r0 = r8.length()
            r1 = 9
            if (r0 < r1) goto L3a
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r3) goto L3a
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L37
            r5 = 1
            if (r0 != r5) goto L2d
            k55 r0 = defpackage.k55.HTTP_1_1
            goto L5c
        L2d:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
        L37:
            k55 r0 = defpackage.k55.HTTP_1_0
            goto L5c
        L3a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
        L44:
            java.lang.String r0 = "ICY "
            boolean r0 = defpackage.xs6.g0(r8, r0, r1)
            if (r0 == 0) goto L50
            k55 r0 = defpackage.k55.HTTP_1_0
            r1 = r2
            goto L5c
        L50:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = defpackage.xs6.g0(r8, r0, r1)
            if (r0 == 0) goto Laa
            k55 r0 = defpackage.k55.HTTP_1_1
            r1 = 12
        L5c:
            int r5 = r8.length()
            int r6 = r1 + 3
            if (r5 < r6) goto La0
            java.lang.String r5 = r8.substring(r1, r6)
            java.lang.Integer r5 = defpackage.xs6.h0(r5)
            if (r5 == 0) goto L96
            int r5 = r5.intValue()
            int r7 = r8.length()
            if (r7 <= r6) goto L8e
            char r6 = r8.charAt(r6)
            if (r6 != r3) goto L84
            int r1 = r1 + r2
            java.lang.String r8 = r8.substring(r1)
            goto L90
        L84:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
        L8e:
            java.lang.String r8 = ""
        L90:
            ei r1 = new ei
            r1.<init>(r0, r5, r8)
            return r1
        L96:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
        La0:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
        Laa:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r4.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    public static final void F(defpackage.pk6 r2, defpackage.nt r3, int r4) {
        L0:
            int r0 = r2.v
            if (r4 <= r0) goto L8
            int r1 = r2.u
            if (r4 < r1) goto Lc
        L8:
            if (r0 != 0) goto Ld
            if (r4 != 0) goto Ld
        Lc:
            return
        Ld:
            r2.M()
            int r0 = r2.v
            boolean r0 = r2.y(r0)
            if (r0 == 0) goto L1b
            r3.j()
        L1b:
            r2.j()
            goto L0
    }

    public static defpackage.a74 G(defpackage.a74 r17, defpackage.n65 r18) {
            a0 r0 = new a0
            r7 = 0
            r8 = 29
            r1 = 1
            java.lang.Class<n65> r3 = defpackage.n65.class
            java.lang.String r4 = "onPull"
            java.lang.String r5 = "onPull$material(F)F"
            r6 = 0
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            yv0 r9 = new yv0
            r15 = 4
            r16 = 2
            r10 = 2
            java.lang.Class<n65> r12 = defpackage.n65.class
            java.lang.String r13 = "onRelease"
            java.lang.String r14 = "onRelease$material(F)F"
            r11 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            ap3 r1 = new ap3
            r2 = 19
            r1.<init>(r2, r0, r9)
            r0 = r17
            a74 r0 = defpackage.mb3.L(r0, r1)
            return r0
    }

    public static android.os.Parcelable H(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable r2 = defpackage.r2.k(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.readParcelable(r3)
            if (r2 == 0) goto L41
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L18
            goto L41
        L18:
            android.os.BadParcelableException r3 = new android.os.BadParcelableException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Parcelable "
            r0.<init>(r1)
            java.lang.Class r2 = r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r4.getName()
            java.lang.String r4 = " is not a subclass of required class "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " provided in the parameter"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L41:
            return r2
    }

    public static final java.lang.Object I(defpackage.d67 r4, defpackage.eo2 r5) {
            r41 r0 = r4.Y
            l61 r0 = r0.b()
            ug1 r0 = defpackage.q60.D(r0)
            long r1 = r4.Z
            l61 r3 = r4.X
            il1 r0 = r0.A(r1, r4, r3)
            ll1 r1 = new ll1
            r1.<init>(r0)
            r0 = 1
            defpackage.yh2.y(r4, r0, r1)
            r0 = 0
            java.lang.Object r4 = defpackage.mp2.Z(r4, r0, r4, r5)
            return r4
    }

    public static int J(android.content.Context r1, int r2) {
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            int[] r2 = new int[]{r2}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0, r2)
            r2 = 0
            r0 = -1
            int r2 = r1.getResourceId(r2, r0)
            r1.recycle()
            return r2
    }

    public static final void K(java.lang.String r3, int r4, java.lang.String r5) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " at index "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = ", but was '"
            r1.append(r5)
            char r3 = r3.charAt(r4)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final boolean L(java.lang.String r1, defpackage.on2 r2) {
            java.lang.String r0 = "ReflectionGuard"
            java.lang.Object r2 = r2.c()     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.NoSuchMethodException -> L1c java.lang.ClassNotFoundException -> L26
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.NoSuchMethodException -> L1c java.lang.ClassNotFoundException -> L26
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.NoSuchMethodException -> L1c java.lang.ClassNotFoundException -> L26
            if (r2 != 0) goto L11
            android.util.Log.e(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.NoSuchMethodException -> L1c java.lang.ClassNotFoundException -> L26
        L11:
            return r2
        L12:
            java.lang.String r2 = "NoSuchField: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.e(r0, r1)
            goto L2f
        L1c:
            java.lang.String r2 = "NoSuchMethod: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.e(r0, r1)
            goto L2f
        L26:
            java.lang.String r2 = "ClassNotFound: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.e(r0, r1)
        L2f:
            r1 = 0
            return r1
    }

    public static final java.lang.Object M(long r2, defpackage.eo2 r4, defpackage.s41 r5) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L12
            d67 r0 = new d67
            r0.<init>(r2, r5)
            java.lang.Object r2 = I(r0, r4)
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r2
        L12:
            c67 r2 = new c67
            java.lang.String r3 = "Timed out immediately"
            r4 = 0
            r2.<init>(r3, r4)
            throw r2
    }

    public static final java.lang.Object N(long r7, defpackage.eo2 r9, defpackage.r41 r10) {
            boolean r0 = r10 instanceof defpackage.e67
            if (r0 == 0) goto L13
            r0 = r10
            e67 r0 = (defpackage.e67) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            e67 r0 = new e67
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            dh5 r7 = r0.R
            defpackage.oi2.Y(r10)     // Catch: defpackage.c67 -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L56
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L32:
            defpackage.oi2.Y(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3c
            goto L5c
        L3c:
            dh5 r10 = new dh5
            r10.<init>()
            r0.R = r10     // Catch: defpackage.c67 -> L54
            r0.Y = r4     // Catch: defpackage.c67 -> L54
            d67 r2 = new d67     // Catch: defpackage.c67 -> L54
            r2.<init>(r7, r0)     // Catch: defpackage.c67 -> L54
            r10.A = r2     // Catch: defpackage.c67 -> L54
            java.lang.Object r7 = I(r2, r9)     // Catch: defpackage.c67 -> L54
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        L54:
            r8 = move-exception
            r7 = r10
        L56:
            rc3 r9 = r8.A
            java.lang.Object r7 = r7.A
            if (r9 != r7) goto L5d
        L5c:
            return r3
        L5d:
            throw r8
    }

    public static final void a(defpackage.el6 r17, defpackage.a74 r18, defpackage.px0 r19, int r20) {
            r2 = r17
            r7 = r18
            r8 = r20
            zv0 r0 = defpackage.q60.g
            r9 = r19
            xq2 r9 = (defpackage.xq2) r9
            r1 = 1354335728(0x50b985f0, float:2.4900502E10)
            r9.d0(r1)
            r1 = r8 & 6
            if (r1 != 0) goto L2a
            r1 = r8 & 8
            if (r1 != 0) goto L1f
            boolean r1 = r9.f(r2)
            goto L23
        L1f:
            boolean r1 = r9.h(r2)
        L23:
            if (r1 == 0) goto L27
            r1 = 4
            goto L28
        L27:
            r1 = 2
        L28:
            r1 = r1 | r8
            goto L2b
        L2a:
            r1 = r8
        L2b:
            r3 = r8 & 48
            if (r3 != 0) goto L3b
            boolean r3 = r9.f(r7)
            if (r3 == 0) goto L38
            r3 = 32
            goto L3a
        L38:
            r3 = 16
        L3a:
            r1 = r1 | r3
        L3b:
            r3 = r8 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L4b
            boolean r0 = r9.h(r0)
            if (r0 == 0) goto L48
            r0 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r0 = 128(0x80, float:1.8E-43)
        L4a:
            r1 = r1 | r0
        L4b:
            r0 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r10 = 1
            r11 = 0
            if (r0 == r3) goto L55
            r0 = r10
            goto L56
        L55:
            r0 = r11
        L56:
            r1 = r1 & r10
            boolean r0 = r9.S(r1, r0)
            if (r0 == 0) goto L1c5
            java.lang.Object r0 = r9.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L7b
            k92 r0 = new k92
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
            r9.l0(r0)
        L7b:
            r4 = r0
            k92 r4 = (defpackage.k92) r4
            r0 = 7
            java.lang.String r5 = defpackage.ii2.z(r9, r0)
            java.lang.Object r0 = r4.a
            java.util.ArrayList r12 = r4.b
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L117
            r0 = 93279711(0x58f55df, float:1.34792E-35)
            r9.b0(r0)
            r4.a = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.size()
            r0.<init>(r1)
            int r1 = r12.size()
            r3 = r11
        La3:
            if (r3 >= r1) goto Lb5
            java.lang.Object r6 = r12.get(r3)
            j92 r6 = (defpackage.j92) r6
            java.lang.Object r6 = r6.a
            el6 r6 = (defpackage.el6) r6
            r0.add(r6)
            int r3 = r3 + 1
            goto La3
        Lb5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            boolean r0 = r3.contains(r2)
            if (r0 != 0) goto Lc3
            r3.add(r2)
        Lc3:
            r12.clear()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r3.size()
            r13.<init>(r0)
            int r0 = r3.size()
            r1 = r11
        Ld4:
            if (r1 >= r0) goto Le2
            java.lang.Object r6 = r3.get(r1)
            if (r6 == 0) goto Ldf
            r13.add(r6)
        Ldf:
            int r1 = r1 + 1
            goto Ld4
        Le2:
            int r14 = r13.size()
            r15 = r11
        Le7:
            if (r15 >= r14) goto L111
            java.lang.Object r0 = r13.get(r15)
            r1 = r0
            el6 r1 = (defpackage.el6) r1
            j92 r0 = new j92
            r6 = r0
            u91 r0 = new u91
            r16 = r6
            r6 = 5
            r19 = r10
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = -1032415134(0xffffffffc2769862, float:-61.64881)
            zv0 r0 = defpackage.n16.I(r6, r0, r9)
            r10.<init>(r1, r0)
            r12.add(r10)
            int r15 = r15 + 1
            r10 = r19
            goto Le7
        L111:
            r19 = r10
            r9.p(r11)
            goto L122
        L117:
            r19 = r10
            r0 = 95881138(0x5b707b2, float:1.7212064E-35)
            r9.b0(r0)
            r9.p(r11)
        L122:
            e40 r0 = defpackage.d90.L
            e34 r0 = defpackage.h70.d(r0, r11)
            int r1 = defpackage.ge7.B(r9)
            xv4 r3 = r9.l()
            a74 r5 = defpackage.l.E(r9, r7)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            iy0 r6 = defpackage.ix0.b
            r9.f0()
            boolean r10 = r9.S
            if (r10 == 0) goto L146
            r9.k(r6)
            goto L149
        L146:
            r9.o0()
        L149:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r9, r6, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r9, r0, r3)
            pn r0 = defpackage.ix0.g
            boolean r3 = r9.S
            if (r3 != 0) goto L167
            java.lang.Object r3 = r9.P()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r3 = defpackage.nb3.k(r3, r6)
            if (r3 != 0) goto L16a
        L167:
            defpackage.i61.v(r1, r9, r1, r0)
        L16a:
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r9, r0, r5)
            cf5 r0 = r9.A()
            if (r0 == 0) goto L1bf
            int r1 = r0.b
            r1 = r1 | 1
            r0.b = r1
            r4.c = r0
            r0 = -1757732554(0xffffffff973b2136, float:-6.0464877E-25)
            r9.b0(r0)
            int r0 = r12.size()
            r1 = r11
        L188:
            if (r1 >= r0) goto L1b6
            java.lang.Object r3 = r12.get(r1)
            j92 r3 = (defpackage.j92) r3
            java.lang.Object r4 = r3.a
            el6 r4 = (defpackage.el6) r4
            zv0 r3 = r3.b
            r5 = -1515535286(0xffffffffa5aac44a, float:-2.962331E-16)
            r9.Z(r5, r4)
            bl6 r5 = new bl6
            r5.<init>(r4, r11)
            r4 = 2017516783(0x7840dcef, float:1.5646907E34)
            zv0 r4 = defpackage.n16.I(r4, r5, r9)
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.e(r4, r9, r5)
            r9.p(r11)
            int r1 = r1 + 1
            goto L188
        L1b6:
            r9.p(r11)
            r0 = r19
            r9.p(r0)
            goto L1c8
        L1bf:
            java.lang.String r0 = "no recompose scope found"
            defpackage.i.m(r0)
            return
        L1c5:
            r9.V()
        L1c8:
            cf5 r0 = r9.t()
            if (r0 == 0) goto L1d7
            hp r1 = new hp
            r3 = 12
            r1.<init>(r2, r8, r3, r7)
            r0.d = r1
        L1d7:
            return
    }

    public static final void b(java.lang.Boolean r10, java.lang.Object r11, defpackage.hu3 r12, defpackage.qn2 r13, defpackage.px0 r14, int r15) {
            xq2 r14 = (defpackage.xq2) r14
            r0 = 696924721(0x298a3a31, float:6.138526E-14)
            r14.d0(r0)
            r0 = r15 & 6
            if (r0 != 0) goto L17
            boolean r0 = r14.h(r10)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r15
            goto L18
        L17:
            r0 = r15
        L18:
            r1 = r15 & 48
            if (r1 != 0) goto L28
            boolean r1 = r14.h(r11)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L2e
            r0 = r0 | 128(0x80, float:1.8E-43)
        L2e:
            r1 = r15 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L3e
            boolean r1 = r14.h(r13)
            if (r1 == 0) goto L3b
            r1 = 2048(0x800, float:2.87E-42)
            goto L3d
        L3b:
            r1 = 1024(0x400, float:1.435E-42)
        L3d:
            r0 = r0 | r1
        L3e:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 == r2) goto L46
            r1 = 1
            goto L47
        L46:
            r1 = 0
        L47:
            r2 = r0 & 1
            boolean r1 = r14.S(r2, r1)
            if (r1 == 0) goto L9e
            r14.X()
            r1 = r15 & 1
            if (r1 == 0) goto L63
            boolean r1 = r14.B()
            if (r1 == 0) goto L5d
            goto L63
        L5d:
            r14.V()
        L60:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L6c
        L63:
            l55 r12 = defpackage.zx3.a
            java.lang.Object r12 = r14.j(r12)
            hu3 r12 = (defpackage.hu3) r12
            goto L60
        L6c:
            r14.q()
            boolean r1 = r14.f(r10)
            boolean r2 = r14.f(r11)
            r1 = r1 | r2
            boolean r2 = r14.f(r12)
            r1 = r1 | r2
            java.lang.Object r2 = r14.P()
            if (r1 != 0) goto L87
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto L93
        L87:
            ou3 r2 = new ou3
            ut3 r1 = r12.getLifecycle()
            r2.<init>(r1)
            r14.l0(r2)
        L93:
            ou3 r2 = (defpackage.ou3) r2
            int r0 = r0 >> 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            c(r12, r2, r13, r14, r0)
        L9c:
            r6 = r12
            goto La2
        L9e:
            r14.V()
            goto L9c
        La2:
            cf5 r12 = r14.t()
            if (r12 == 0) goto Lb4
            i10 r3 = new i10
            r9 = 4
            r4 = r10
            r5 = r11
            r7 = r13
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.d = r3
        Lb4:
            return
    }

    public static final void c(defpackage.hu3 r7, defpackage.ou3 r8, defpackage.qn2 r9, defpackage.px0 r10, int r11) {
            xq2 r10 = (defpackage.xq2) r10
            r0 = 228371534(0xd9cac4e, float:9.655723E-31)
            r10.d0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L17
            boolean r0 = r10.h(r7)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r11
            goto L18
        L17:
            r0 = r11
        L18:
            r1 = r11 & 48
            r2 = 16
            if (r1 != 0) goto L29
            boolean r1 = r10.h(r8)
            if (r1 == 0) goto L27
            r1 = 32
            goto L28
        L27:
            r1 = r2
        L28:
            r0 = r0 | r1
        L29:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L3a
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L37
            r1 = r3
            goto L39
        L37:
            r1 = 128(0x80, float:1.8E-43)
        L39:
            r0 = r0 | r1
        L3a:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            r6 = 1
            if (r1 == r4) goto L44
            r1 = r6
            goto L45
        L44:
            r1 = r5
        L45:
            r4 = r0 & 1
            boolean r1 = r10.S(r4, r1)
            if (r1 == 0) goto L75
            boolean r1 = r10.h(r8)
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != r3) goto L56
            r5 = r6
        L56:
            r0 = r1 | r5
            boolean r1 = r10.h(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L67
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L6f
        L67:
            t00 r1 = new t00
            r1.<init>(r7, r8, r9, r2)
            r10.l0(r1)
        L6f:
            qn2 r1 = (defpackage.qn2) r1
            defpackage.mb3.e(r7, r8, r1, r10)
            goto L78
        L75:
            r10.V()
        L78:
            cf5 r10 = r10.t()
            if (r10 == 0) goto L8b
            rl r0 = new rl
            r5 = 14
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        L8b:
            return
    }

    public static final void d(defpackage.cq3 r6, java.lang.Object r7, int r8, java.lang.Object r9, defpackage.px0 r10, int r11) {
            xq2 r10 = (defpackage.xq2) r10
            r0 = 1439843069(0x55d242fd, float:2.8898144E13)
            r10.d0(r0)
            boolean r0 = r10.f(r6)
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r11
            boolean r1 = r10.f(r7)
            if (r1 == 0) goto L1b
            r1 = 32
            goto L1d
        L1b:
            r1 = 16
        L1d:
            r0 = r0 | r1
            boolean r1 = r10.d(r8)
            if (r1 == 0) goto L27
            r1 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r1 = 128(0x80, float:1.8E-43)
        L29:
            r0 = r0 | r1
            boolean r1 = r10.f(r9)
            if (r1 == 0) goto L33
            r1 = 2048(0x800, float:2.87E-42)
            goto L35
        L33:
            r1 = 1024(0x400, float:1.435E-42)
        L35:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            r3 = 1
            if (r1 == r2) goto L3f
            r1 = r3
            goto L40
        L3f:
            r1 = 0
        L40:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L5c
            r0 = r7
            o46 r0 = (defpackage.o46) r0
            hp r1 = new hp
            r1.<init>(r8, r6, r9)
            r2 = 980966366(0x3a785bde, float:9.4741385E-4)
            zv0 r1 = defpackage.n16.I(r2, r1, r10)
            r2 = 48
            r0.b(r9, r1, r10, r2)
            goto L5f
        L5c:
            r10.V()
        L5f:
            cf5 r10 = r10.t()
            if (r10 == 0) goto L71
            rl r0 = new rl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        L71:
            return
    }

    public static final void e(defpackage.gl6 r8, defpackage.a74 r9, defpackage.fo2 r10, defpackage.px0 r11, int r12) {
            xq2 r11 = (defpackage.xq2) r11
            r0 = 1351125615(0x50888a6f, float:1.832619E10)
            r11.d0(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L17
            boolean r0 = r11.f(r8)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r12
            goto L18
        L17:
            r0 = r12
        L18:
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 == r2) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            r2 = r0 & 1
            boolean r1 = r11.S(r2, r1)
            if (r1 == 0) goto L72
            zv0 r10 = defpackage.q60.g
            vs4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            el6 r9 = (defpackage.el6) r9
            nq6 r1 = defpackage.ky0.a
            java.lang.Object r1 = r11.j(r1)
            i2 r1 = (defpackage.i2) r1
            boolean r2 = r11.h(r9)
            boolean r3 = r11.h(r1)
            r2 = r2 | r3
            java.lang.Object r3 = r11.P()
            if (r2 != 0) goto L50
            vs0 r2 = defpackage.ox0.a
            if (r3 != r2) goto L5b
        L50:
            bf4 r3 = new bf4
            r2 = 0
            r4 = 18
            r3.<init>(r9, r1, r2, r4)
            r11.l0(r3)
        L5b:
            eo2 r3 = (defpackage.eo2) r3
            defpackage.mb3.i(r11, r3, r9)
            vs4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            el6 r9 = (defpackage.el6) r9
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            x64 r1 = defpackage.x64.a
            a(r9, r1, r11, r0)
            r4 = r1
        L70:
            r5 = r10
            goto L77
        L72:
            r11.V()
            r4 = r9
            goto L70
        L77:
            cf5 r9 = r11.t()
            if (r9 == 0) goto L88
            rl r2 = new rl
            r7 = 26
            r3 = r8
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r9.d = r2
        L88:
            return
    }

    public static final defpackage.of5 f(defpackage.cx4 r1, int r2, defpackage.p97 r3, defpackage.a47 r4, boolean r5, int r6) {
            if (r4 == 0) goto Ld
            mk4 r3 = r3.b
            int r2 = r3.s(r2)
            of5 r2 = r4.c(r2)
            goto Lf
        Ld:
            of5 r2 = defpackage.of5.e
        Lf:
            float r3 = r2.a
            r4 = 1073741824(0x40000000, float:2.0)
            int r1 = r1.r0(r4)
            if (r5 == 0) goto L1e
            float r4 = (float) r6
            float r4 = r4 - r3
            float r0 = (float) r1
            float r4 = r4 - r0
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r5 == 0) goto L24
            float r1 = (float) r6
            float r1 = r1 - r3
            goto L26
        L24:
            float r1 = (float) r1
            float r1 = r1 + r3
        L26:
            float r3 = r2.b
            float r2 = r2.d
            of5 r5 = new of5
            r5.<init>(r4, r3, r1, r2)
            return r5
    }

    public static final void g(defpackage.fz4 r0, defpackage.ux0 r1, java.lang.String r2) {
            r0.getClass()
            jd1 r1 = r1.b()
            ar0 r0 = r0.a
            r1.getClass()
            r0.getClass()
            defpackage.hv.a0(r0, r2)
            r0 = 0
            throw r0
    }

    public static final void h(defpackage.fz4 r0, defpackage.x32 r1, java.lang.Object r2) {
            r0.getClass()
            r2.getClass()
            jd1 r1 = r1.b()
            ar0 r0 = r0.a
            r1.getClass()
            r0.getClass()
            r0.d(r2)
            java.lang.Class r1 = r2.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r2 = r1.c()
            if (r2 != 0) goto L27
            java.lang.String r2 = java.lang.String.valueOf(r1)
        L27:
            defpackage.hv.a0(r0, r2)
            r0 = 0
            throw r0
    }

    public static final void i(long r4, byte[] r6, int r7, int r8, int r9) {
            int r8 = 7 - r8
            int r9 = 8 - r9
            if (r9 > r8) goto L23
        L6:
            int r0 = r8 << 3
            long r0 = r4 >> r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r0 = (int) r0
            int[] r1 = defpackage.hx2.a
            r0 = r1[r0]
            int r1 = r7 + 1
            int r2 = r0 >> 8
            byte r2 = (byte) r2
            r6[r7] = r2
            int r7 = r7 + 2
            byte r0 = (byte) r0
            r6[r1] = r0
            if (r8 == r9) goto L23
            int r8 = r8 + (-1)
            goto L6
        L23:
            return
    }

    public static defpackage.pv2 j(javax.net.ssl.SSLSession r6) {
            java.lang.String r0 = r6.getCipherSuite()
            r1 = 0
            if (r0 == 0) goto L69
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5f
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5f
            cs1 r2 = defpackage.rq0.b
            rq0 r0 = r2.r(r0)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L59
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L53
            k67 r1 = defpackage.l67.Companion
            r1.getClass()
            l67 r1 = defpackage.k67.a(r2)
            java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3d
            java.util.List r2 = defpackage.az7.k(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3d
            goto L3f
        L3d:
            yt1 r2 = defpackage.yt1.A
        L3f:
            pv2 r3 = new pv2
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            java.util.List r6 = defpackage.az7.k(r6)
            b5 r4 = new b5
            r5 = 2
            r4.<init>(r5, r2)
            r3.<init>(r1, r0, r6, r4)
            return r3
        L53:
            java.lang.String r6 = "tlsVersion == NONE"
            defpackage.e41.i(r6)
            return r1
        L59:
            java.lang.String r6 = "tlsVersion == null"
            defpackage.i.m(r6)
            return r1
        L5f:
            java.lang.String r6 = "cipherSuite == "
            java.lang.String r6 = r6.concat(r0)
            defpackage.e41.i(r6)
            return r1
        L69:
            java.lang.String r6 = "cipherSuite == null"
            defpackage.i.m(r6)
            return r1
    }

    public static defpackage.n34 k(java.lang.String r13) {
            r13.getClass()
            xh5 r0 = defpackage.n34.d
            r1 = 0
            n14 r0 = r0.b(r1, r13)
            r2 = 34
            r3 = 0
            if (r0 == 0) goto Lc3
            java.util.List r4 = r0.a()
            l14 r4 = (defpackage.l14) r4
            r5 = 1
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r6)
            r4.getClass()
            java.util.List r7 = r0.a()
            l14 r7 = (defpackage.l14) r7
            r8 = 2
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = r7.toLowerCase(r6)
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            l93 r0 = r0.b()
            int r0 = r0.B
        L44:
            int r0 = r0 + r5
            int r9 = r13.length()
            if (r0 >= r9) goto Lb5
            xh5 r9 = defpackage.n34.e
            n14 r9 = r9.b(r0, r13)
            if (r9 == 0) goto La9
            m14 r0 = r9.c
            k14 r10 = r0.b(r5)
            if (r10 == 0) goto L5e
            java.lang.String r10 = r10.a
            goto L5f
        L5e:
            r10 = r3
        L5f:
            if (r10 != 0) goto L68
            l93 r0 = r9.b()
            int r0 = r0.B
            goto L44
        L68:
            k14 r11 = r0.b(r8)
            if (r11 == 0) goto L71
            java.lang.String r11 = r11.a
            goto L72
        L71:
            r11 = r3
        L72:
            if (r11 != 0) goto L7f
            r11 = 3
            k14 r0 = r0.b(r11)
            r0.getClass()
            java.lang.String r11 = r0.a
            goto L9c
        L7f:
            r0 = 39
            boolean r12 = defpackage.qs6.L0(r11, r0)
            if (r12 == 0) goto L9c
            boolean r0 = defpackage.qs6.m0(r11, r0)
            if (r0 == 0) goto L9c
            int r0 = r11.length()
            if (r0 <= r8) goto L9c
            int r0 = r11.length()
            int r0 = r0 - r5
            java.lang.String r11 = r11.substring(r5, r0)
        L9c:
            r7.add(r10)
            r7.add(r11)
            l93 r0 = r9.b()
            int r0 = r0.B
            goto L44
        La9:
            java.lang.String r0 = r13.substring(r0)
            java.lang.String r1 = "\" for: \""
            java.lang.String r4 = "Parameter is not formatted correctly: \""
            defpackage.e41.s(r4, r0, r1, r13, r2)
            return r3
        Lb5:
            n34 r0 = new n34
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r7.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.<init>(r13, r4, r6, r1)
            return r0
        Lc3:
            java.lang.String r0 = "No subtype found for: \""
            java.lang.String r13 = defpackage.i61.k(r2, r0, r13)
            defpackage.i.h(r13)
            return r3
    }

    public static int l(android.content.Context r2, int r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            r2.resolveAttribute(r3, r0, r1)
            int r2 = r0.resourceId
            if (r2 == 0) goto L12
            return r3
        L12:
            return r4
    }

    public static final long m(android.view.KeyEvent r2) {
            int r2 = r2.getKeyCode()
            long r0 = defpackage.qo2.e(r2)
            return r0
    }

    public static final int n(defpackage.nj3 r1) {
            r1.getClass()
            int[] r0 = defpackage.b83.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L63;
                case 2: goto L5f;
                case 3: goto L5b;
                case 4: goto L57;
                case 5: goto L53;
                case 6: goto L4f;
                case 7: goto L4b;
                case 8: goto L47;
                case 9: goto L43;
                case 10: goto L3f;
                case 11: goto L3b;
                case 12: goto L37;
                case 13: goto L33;
                case 14: goto L2f;
                case 15: goto L2b;
                case 16: goto L27;
                case 17: goto L23;
                case 18: goto L1f;
                case 19: goto L1b;
                case 20: goto L17;
                case 21: goto L13;
                default: goto Le;
            }
        Le:
            defpackage.i.d()
            r1 = 0
            return r1
        L13:
            r1 = 2131952074(0x7f1301ca, float:1.954058E38)
            return r1
        L17:
            r1 = 2131951740(0x7f13007c, float:1.9539903E38)
            return r1
        L1b:
            r1 = 2131952499(0x7f130373, float:1.9541442E38)
            return r1
        L1f:
            r1 = 2131952063(0x7f1301bf, float:1.9540558E38)
            return r1
        L23:
            r1 = 2131952064(0x7f1301c0, float:1.954056E38)
            return r1
        L27:
            r1 = 2131952073(0x7f1301c9, float:1.9540578E38)
            return r1
        L2b:
            r1 = 2131952445(0x7f13033d, float:1.9541333E38)
            return r1
        L2f:
            r1 = 2131952075(0x7f1301cb, float:1.9540583E38)
            return r1
        L33:
            r1 = 2131952061(0x7f1301bd, float:1.9540554E38)
            return r1
        L37:
            r1 = 2131952045(0x7f1301ad, float:1.9540522E38)
            return r1
        L3b:
            r1 = 2131952062(0x7f1301be, float:1.9540556E38)
            return r1
        L3f:
            r1 = 2131952060(0x7f1301bc, float:1.9540552E38)
            return r1
        L43:
            r1 = 2131952070(0x7f1301c6, float:1.9540572E38)
            return r1
        L47:
            r1 = 2131952071(0x7f1301c7, float:1.9540574E38)
            return r1
        L4b:
            r1 = 2131952065(0x7f1301c1, float:1.9540562E38)
            return r1
        L4f:
            r1 = 2131952055(0x7f1301b7, float:1.9540542E38)
            return r1
        L53:
            r1 = 2131952040(0x7f1301a8, float:1.9540512E38)
            return r1
        L57:
            r1 = 2131952044(0x7f1301ac, float:1.954052E38)
            return r1
        L5b:
            r1 = 2131952014(0x7f13018e, float:1.9540459E38)
            return r1
        L5f:
            r1 = 2131951733(0x7f130075, float:1.9539889E38)
            return r1
        L63:
            r1 = 2131952726(0x7f130456, float:1.9541903E38)
            return r1
    }

    public static java.lang.String o(java.lang.Class r4) {
            java.util.LinkedHashMap r0 = defpackage.rd4.b
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L35
            java.lang.Class<pd4> r1 = defpackage.pd4.class
            java.lang.annotation.Annotation r1 = r4.getAnnotation(r1)
            pd4 r1 = (defpackage.pd4) r1
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = r1.value()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L27
            int r3 = r1.length()
            if (r3 <= 0) goto L27
            r0.put(r4, r1)
            goto L35
        L27:
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = "No @Navigator.Name annotation found for "
            java.lang.String r4 = r0.concat(r4)
            defpackage.i.f(r4)
            return r2
        L35:
            r1.getClass()
            return r1
    }

    public static android.content.res.ColorStateList p(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
            java.lang.String r0 = "tint"
            boolean r5 = v(r5, r0)
            r0 = 0
            if (r5 == 0) goto L57
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r1 = 1
            r4.getValue(r1, r5)
            int r2 = r5.type
            r3 = 2
            if (r2 == r3) goto L43
            r3 = 28
            if (r2 < r3) goto L26
            r3 = 31
            if (r2 > r3) goto L26
            int r4 = r5.data
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            return r4
        L26:
            android.content.res.Resources r5 = r4.getResources()
            r2 = 0
            int r4 = r4.getResourceId(r1, r2)
            java.lang.ThreadLocal r1 = defpackage.rt0.a
            android.content.res.XmlResourceParser r4 = r5.getXml(r4)     // Catch: java.lang.Exception -> L3a
            android.content.res.ColorStateList r4 = defpackage.rt0.a(r5, r4, r6)     // Catch: java.lang.Exception -> L3a
            return r4
        L3a:
            r4 = move-exception
            java.lang.String r5 = "CSLCompat"
            java.lang.String r6 = "Failed to inflate ColorStateList."
            android.util.Log.e(r5, r6, r4)
            return r0
        L43:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve attribute at index 1: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L57:
            return r0
    }

    public static defpackage.ei q(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6, java.lang.String r7, int r8) {
            boolean r5 = v(r5, r7)
            r7 = 3
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L3c
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.getValue(r8, r5)
            int r2 = r5.type
            r3 = 28
            if (r2 < r3) goto L23
            r3 = 31
            if (r2 > r3) goto L23
            int r4 = r5.data
            ei r5 = new ei
            r5.<init>(r0, r4, r7, r0)
            return r5
        L23:
            android.content.res.Resources r5 = r4.getResources()
            int r4 = r4.getResourceId(r8, r1)
            ei r4 = defpackage.ei.c(r5, r4, r6)     // Catch: java.lang.Exception -> L30
            goto L39
        L30:
            r4 = move-exception
            java.lang.String r5 = "ComplexColorCompat"
            java.lang.String r6 = "Failed to inflate ComplexColor."
            android.util.Log.e(r5, r6, r4)
            r4 = r0
        L39:
            if (r4 == 0) goto L3c
            return r4
        L3c:
            ei r4 = new ei
            r4.<init>(r0, r1, r7, r0)
            return r4
    }

    public static final java.lang.Object r(defpackage.ta6 r0, defpackage.fb6 r1) {
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L9
            r0 = 0
        L9:
            return r0
    }

    public static final android.view.ViewParent s(android.view.View r1) {
            r1.getClass()
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 2131428075(0x7f0b02eb, float:1.8477784E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof android.view.ViewParent
            if (r0 == 0) goto L18
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static final defpackage.mz3 t(defpackage.mz3 r2) {
            eg4 r2 = r2.k0
            sm3 r2 = r2.k0
        L4:
            sm3 r0 = r2.v()
            r1 = 0
            if (r0 == 0) goto Le
            sm3 r0 = r0.e0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L35
            sm3 r0 = r2.v()
            if (r0 == 0) goto L19
            sm3 r1 = r0.e0
        L19:
            r1.getClass()
            boolean r0 = r1.d0
            if (r0 == 0) goto L28
            sm3 r2 = r2.v()
            r2.getClass()
            goto L4
        L28:
            sm3 r2 = r2.v()
            r2.getClass()
            sm3 r2 = r2.e0
            r2.getClass()
            goto L4
        L35:
            if0 r2 = r2.B0
            java.lang.Object r2 = r2.e
            eg4 r2 = (defpackage.eg4) r2
            mz3 r2 = r2.W0()
            r2.getClass()
            return r2
    }

    public static final int u(android.view.KeyEvent r1) {
            int r1 = r1.getAction()
            if (r1 == 0) goto Lc
            r0 = 1
            if (r1 == r0) goto Lb
            r1 = 0
            return r1
        Lb:
            return r0
        Lc:
            r1 = 2
            return r1
    }

    public static boolean v(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final void w(defpackage.jm3 r0) {
            sm3 r0 = defpackage.nc1.f0(r0)
            r0.E()
            return
    }

    public static boolean x() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Blu"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "studio x10"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean y() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Itel"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "itel w6004"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static boolean z() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Positivo"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
        L18:
            java.lang.String r0 = "twist 2 pro"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }
}
