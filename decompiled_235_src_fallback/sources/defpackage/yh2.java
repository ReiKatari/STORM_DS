package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh2  reason: default package */
/* loaded from: classes.dex */
public abstract class yh2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static defpackage.e33 c;

    public static final boolean A(defpackage.vh2 r2) {
            eg4 r0 = r2.d0
            if (r0 == 0) goto L1e
            sm3 r0 = r0.k0
            if (r0 == 0) goto L1e
            boolean r0 = r0.I()
            r1 = 1
            if (r0 != r1) goto L1e
            eg4 r2 = r2.d0
            if (r2 == 0) goto L1e
            sm3 r2 = r2.k0
            if (r2 == 0) goto L1e
            boolean r2 = r2.H()
            if (r2 != r1) goto L1e
            return r1
        L1e:
            r2 = 0
            return r2
    }

    public static defpackage.tb0 B(defpackage.l61 r3, defpackage.eo2 r4) {
            a71 r0 = defpackage.a71.DEFAULT
            r3.getClass()
            r0.getClass()
            em2 r1 = new em2
            r2 = 1
            r1.<init>(r3, r0, r4, r2)
            tb0 r3 = defpackage.ak7.W(r1)
            return r3
    }

    public static final defpackage.f34 C(defpackage.i26 r23, int r24, int r25, int r26, int r27, int r28, defpackage.g34 r29, java.util.List r30, defpackage.dx4[] r31, int r32, int r33, int[] r34, int r35) {
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r30
            r9 = r33
            long r5 = (long) r3
            int r7 = r9 - r32
            int[] r8 = new int[r7]
            r12 = r32
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L1b:
            if (r12 >= r9) goto L8e
            java.lang.Object r18 = r4.get(r12)
            r11 = r18
            x24 r11 = (defpackage.x24) r11
            j26 r18 = defpackage.jx2.t(r11)
            float r18 = defpackage.jx2.v(r18)
            int r19 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r19 <= 0) goto L3a
            float r16 = r16 + r18
            int r13 = r13 + 1
            r19 = r5
            r21 = r12
            goto L89
        L3a:
            int r15 = r1 - r14
            r18 = r31[r12]
            r19 = r5
            if (r18 != 0) goto L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r5) goto L50
            r21 = r12
            r22 = r13
            r5 = 2147483647(0x7fffffff, float:NaN)
        L4e:
            r6 = 0
            goto L5a
        L50:
            r21 = r12
            r22 = r13
            if (r15 >= 0) goto L58
            r5 = 0
            goto L4e
        L58:
            r5 = r15
            goto L4e
        L5a:
            long r12 = r0.c(r6, r5, r2, r6)
            dx4 r18 = r11.y(r12)
        L62:
            r5 = r18
            goto L6a
        L65:
            r21 = r12
            r22 = r13
            goto L62
        L6a:
            int r6 = r0.j(r5)
            int r11 = r0.h(r5)
            int r12 = r21 - r32
            r8[r12] = r6
            int r12 = r15 - r6
            if (r12 >= 0) goto L7b
            r12 = 0
        L7b:
            int r15 = java.lang.Math.min(r3, r12)
            int r6 = r6 + r15
            int r14 = r14 + r6
            int r10 = java.lang.Math.max(r10, r11)
            r31[r21] = r5
            r13 = r22
        L89:
            int r12 = r21 + 1
            r5 = r19
            goto L1b
        L8e:
            r19 = r5
            r22 = r13
            if (r22 != 0) goto L98
            int r14 = r14 - r15
            r6 = 0
            goto L15f
        L98:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L9f
            r3 = r1
            goto La1
        L9f:
            r3 = r24
        La1:
            r5 = 1
            int r13 = r22 + (-1)
            long r11 = (long) r13
            long r11 = r11 * r19
            int r3 = r3 - r14
            long r5 = (long) r3
            long r5 = r5 - r11
            r19 = 0
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto Lb2
            r5 = r19
        Lb2:
            float r3 = (float) r5
            float r3 = r3 / r16
            r13 = r32
        Lb7:
            if (r13 >= r9) goto Ld4
            java.lang.Object r15 = r4.get(r13)
            x24 r15 = (defpackage.x24) r15
            j26 r15 = defpackage.jx2.t(r15)
            float r15 = defpackage.jx2.v(r15)
            float r15 = r15 * r3
            int r15 = java.lang.Math.round(r15)
            r19 = r5
            long r5 = (long) r15
            long r5 = r19 - r5
            int r13 = r13 + 1
            goto Lb7
        Ld4:
            r19 = r5
            r15 = r32
            r13 = r10
            r10 = 0
        Lda:
            if (r15 >= r9) goto L153
            r16 = r31[r15]
            if (r16 != 0) goto L145
            java.lang.Object r16 = r4.get(r15)
            r1 = r16
            x24 r1 = (defpackage.x24) r1
            r16 = r3
            j26 r3 = defpackage.jx2.t(r1)
            float r18 = defpackage.jx2.v(r3)
            int r19 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r19 <= 0) goto Lf7
            goto Lfc
        Lf7:
            java.lang.String r19 = "All weights <= 0 should have placeables"
            defpackage.n53.b(r19)
        Lfc:
            int r4 = java.lang.Long.signum(r5)
            r19 = r5
            long r5 = (long) r4
            long r5 = r19 - r5
            float r18 = r18 * r16
            int r18 = java.lang.Math.round(r18)
            int r4 = r18 + r4
            r19 = r5
            r5 = 0
            int r6 = java.lang.Math.max(r5, r4)
            if (r3 == 0) goto L119
            boolean r3 = r3.b
            goto L11a
        L119:
            r3 = 1
        L11a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L124
            if (r6 == r5) goto L124
            r3 = r6
        L122:
            r4 = 1
            goto L126
        L124:
            r3 = 0
            goto L122
        L126:
            long r5 = r0.c(r3, r6, r2, r4)
            dx4 r1 = r1.y(r5)
            int r3 = r0.j(r1)
            int r5 = r0.h(r1)
            int r6 = r15 - r32
            r8[r6] = r3
            int r10 = r10 + r3
            int r3 = java.lang.Math.max(r13, r5)
            r31[r15] = r1
            r13 = r3
            r5 = r19
            goto L14a
        L145:
            r16 = r3
            r19 = r5
            r4 = 1
        L14a:
            int r15 = r15 + 1
            r1 = r26
            r4 = r30
            r3 = r16
            goto Lda
        L153:
            long r1 = (long) r10
            long r1 = r1 + r11
            int r6 = (int) r1
            int r1 = r26 - r14
            if (r6 >= 0) goto L15b
            r6 = 0
        L15b:
            if (r6 <= r1) goto L15e
            r6 = r1
        L15e:
            r10 = r13
        L15f:
            int r6 = r6 + r14
            if (r6 >= 0) goto L163
            r6 = 0
        L163:
            r1 = r24
            int r4 = java.lang.Math.max(r6, r1)
            r1 = r25
            r5 = 0
            int r1 = java.lang.Math.max(r1, r5)
            int r5 = java.lang.Math.max(r10, r1)
            int[] r3 = new int[r7]
            r2 = r29
            r0.b(r4, r8, r3, r2)
            r1 = r31
            r8 = r32
            r6 = r34
            r7 = r35
            f34 r0 = r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static final java.lang.Class D(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        L7:
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L19
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getRawType()
            r2.getClass()
            java.lang.Class r2 = D(r2)
            return r2
        L19:
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L34
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            java.lang.reflect.Type[] r2 = r2.getUpperBounds()
            r2.getClass()
            java.lang.Object r2 = defpackage.fv.D0(r2)
            r2.getClass()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Class r2 = D(r2)
            return r2
        L34:
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L46
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            r2.getClass()
            java.lang.Class r2 = D(r2)
            return r2
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.Class r2 = r2.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r1 = " has type "
            defpackage.fa6.g(r0, r1, r2)
            r2 = 0
            return r2
    }

    public static final java.lang.String E(java.io.Reader r4) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            char[] r1 = new char[r1]
            int r2 = r4.read(r1)
        Ld:
            if (r2 < 0) goto L18
            r3 = 0
            r0.write(r1, r3, r2)
            int r2 = r4.read(r1)
            goto Ld
        L18:
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
    }

    public static final void F(defpackage.px0 r2, defpackage.qn2 r3) {
            no3 r0 = new no3
            r1 = 2
            r0.<init>(r1, r3)
            xq2 r2 = (defpackage.xq2) r2
            jg7 r3 = defpackage.jg7.a
            r2.b(r0, r3)
            return
    }

    public static final defpackage.gg3 G(defpackage.jd1 r1, java.lang.Class r2, java.util.List r3) {
            r0 = 0
            gg3[] r0 = new defpackage.gg3[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            gg3[] r3 = (defpackage.gg3[]) r3
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            gg3[] r3 = (defpackage.gg3[]) r3
            gg3 r3 = defpackage.jx2.p(r2, r3)
            if (r3 == 0) goto L17
            return r3
        L17:
            ar0 r3 = defpackage.gh5.a(r2)
            p04 r0 = defpackage.a35.a
            java.lang.Object r3 = r0.get(r3)
            gg3 r3 = (defpackage.gg3) r3
            if (r3 != 0) goto L3a
            r1.getClass()
            boolean r1 = r2.isInterface()
            if (r1 == 0) goto L38
            fz4 r1 = new fz4
            ar0 r2 = defpackage.gh5.a(r2)
            r1.<init>(r2)
            return r1
        L38:
            r1 = 0
            return r1
        L3a:
            return r3
    }

    public static final defpackage.g53 H(java.lang.String r0, defpackage.px0 r1, int r2) {
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r0 = r1.P()
            vs0 r2 = defpackage.ox0.a
            if (r0 != r2) goto L12
            g53 r0 = new g53
            r0.<init>()
            r1.l0(r0)
        L12:
            g53 r0 = (defpackage.g53) r0
            r2 = 0
            r0.a(r1, r2)
            return r0
    }

    public static final defpackage.rc4 I(defpackage.qd4[] r8, defpackage.px0 r9) {
            nq6 r0 = defpackage.kf.b
            r4 = r9
            xq2 r4 = (defpackage.xq2) r4
            java.lang.Object r9 = r4.j(r0)
            android.content.Context r9 = (android.content.Context) r9
            int r0 = r8.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r0)
            ep3 r0 = new ep3
            r2 = 3
            r7 = 0
            r0.<init>(r2, r7)
            zn3 r2 = new zn3
            r3 = 2
            r2.<init>(r9, r3)
            r3 = r2
            ap3 r2 = new ap3
            r5 = 28
            r2.<init>(r5, r0, r3)
            boolean r0 = r4.h(r9)
            java.lang.Object r3 = r4.P()
            if (r0 != 0) goto L33
            vs0 r0 = defpackage.ox0.a
            if (r3 != r0) goto L3c
        L33:
            ej0 r3 = new ej0
            r0 = 5
            r3.<init>(r9, r0)
            r4.l0(r3)
        L3c:
            on2 r3 = (defpackage.on2) r3
            r5 = 0
            r6 = 4
            java.lang.Object r9 = defpackage.qo2.K(r1, r2, r3, r4, r5, r6)
            rc4 r9 = (defpackage.rc4) r9
            int r0 = r8.length
        L47:
            if (r7 >= r0) goto L55
            r1 = r8[r7]
            zb4 r2 = r9.b
            rd4 r2 = r2.s
            r2.a(r1)
            int r7 = r7 + 1
            goto L47
        L55:
            return r9
    }

    public static final defpackage.gg3 J(defpackage.jd1 r7, java.lang.reflect.Type r8, boolean r9) {
            boolean r0 = r8 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L65
            java.lang.reflect.GenericArrayType r8 = (java.lang.reflect.GenericArrayType) r8
            java.lang.reflect.Type r8 = r8.getGenericComponentType()
            boolean r0 = r8 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L1f
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            r8.getClass()
            java.lang.Object r8 = defpackage.fv.D0(r8)
            java.lang.reflect.Type r8 = (java.lang.reflect.Type) r8
        L1f:
            r8.getClass()
            if (r9 == 0) goto L29
            gg3 r7 = defpackage.jx2.L(r7, r8)
            goto L34
        L29:
            r7.getClass()
            gg3 r7 = J(r7, r8, r2)
            if (r7 != 0) goto L34
            goto Lee
        L34:
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L48
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r8 = r8.getRawType()
            r8.getClass()
            java.lang.Class r8 = (java.lang.Class) r8
            ar0 r8 = defpackage.gh5.a(r8)
            goto L4e
        L48:
            boolean r9 = r8 instanceof defpackage.ar0
            if (r9 == 0) goto L57
            ar0 r8 = (defpackage.ar0) r8
        L4e:
            r8.getClass()
            eh5 r9 = new eh5
            r9.<init>(r8, r7)
            return r9
        L57:
            java.lang.Class r7 = r8.getClass()
            ar0 r7 = defpackage.gh5.a(r7)
            java.lang.String r8 = "unsupported type in GenericArray: "
            defpackage.e41.z(r7, r8)
            return r1
        L65:
            boolean r0 = r8 instanceof java.lang.Class
            if (r0 == 0) goto La4
            java.lang.Class r8 = (java.lang.Class) r8
            boolean r0 = r8.isArray()
            if (r0 == 0) goto L9d
            java.lang.Class r0 = r8.getComponentType()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L9d
            java.lang.Class r8 = r8.getComponentType()
            r8.getClass()
            if (r9 == 0) goto L89
            gg3 r7 = defpackage.jx2.L(r7, r8)
            goto L93
        L89:
            r7.getClass()
            gg3 r7 = J(r7, r8, r2)
            if (r7 != 0) goto L93
            goto Lee
        L93:
            ar0 r8 = defpackage.gh5.a(r8)
            eh5 r9 = new eh5
            r9.<init>(r8, r7)
            return r9
        L9d:
            yt1 r9 = defpackage.yt1.A
            gg3 r7 = G(r7, r8, r9)
            return r7
        La4:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            r3 = 1
            if (r0 == 0) goto L1dc
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r0 = r8.getRawType()
            r0.getClass()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()
            r8.getClass()
            if (r9 == 0) goto Ld6
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = r8.length
            r9.<init>(r1)
            int r1 = r8.length
            r4 = r2
        Lc5:
            if (r4 >= r1) goto Lf5
            r5 = r8[r4]
            r5.getClass()
            gg3 r5 = defpackage.jx2.L(r7, r5)
            r9.add(r5)
            int r4 = r4 + 1
            goto Lc5
        Ld6:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r4 = r8.length
            r9.<init>(r4)
            int r4 = r8.length
            r5 = r2
        Lde:
            if (r5 >= r4) goto Lf5
            r6 = r8[r5]
            r6.getClass()
            r7.getClass()
            gg3 r6 = J(r7, r6, r2)
            if (r6 != 0) goto Lef
        Lee:
            return r1
        Lef:
            r9.add(r6)
            int r5 = r5 + 1
            goto Lde
        Lf5:
            java.lang.Class<java.util.Set> r8 = java.util.Set.class
            boolean r8 = r8.isAssignableFrom(r0)
            r1 = 2
            if (r8 == 0) goto L10d
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            r7.getClass()
            ru r8 = new ru
            r8.<init>(r7, r1)
            return r8
        L10d:
            java.lang.Class<java.util.List> r8 = java.util.List.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 != 0) goto L1cd
            java.lang.Class<java.util.Collection> r8 = java.util.Collection.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L11f
            goto L1cd
        L11f:
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L13f
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            java.lang.Object r8 = r9.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            r7.getClass()
            r8.getClass()
            qw2 r9 = new qw2
            r9.<init>(r7, r8, r3)
            return r9
        L13f:
            java.lang.Class<java.util.Map$Entry> r8 = java.util.Map.Entry.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L15f
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            java.lang.Object r8 = r9.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            r7.getClass()
            r8.getClass()
            w04 r9 = new w04
            r9.<init>(r7, r8, r2)
            return r9
        L15f:
            java.lang.Class<vr4> r8 = defpackage.vr4.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L17f
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            java.lang.Object r8 = r9.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            r7.getClass()
            r8.getClass()
            w04 r9 = new w04
            r9.<init>(r7, r8, r3)
            return r9
        L17f:
            java.lang.Class<oc7> r8 = defpackage.oc7.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L1a8
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            java.lang.Object r8 = r9.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r9 = r9.get(r1)
            gg3 r9 = (defpackage.gg3) r9
            r7.getClass()
            r8.getClass()
            r9.getClass()
            pc7 r0 = new pc7
            r0.<init>(r7, r8, r9)
            return r0
        L1a8:
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r9, r1)
            r8.<init>(r1)
            int r1 = r9.size()
        L1b7:
            if (r2 >= r1) goto L1c8
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            gg3 r3 = (defpackage.gg3) r3
            r3.getClass()
            r8.add(r3)
            goto L1b7
        L1c8:
            gg3 r7 = G(r7, r0, r8)
            return r7
        L1cd:
            java.lang.Object r7 = r9.get(r2)
            gg3 r7 = (defpackage.gg3) r7
            r7.getClass()
            ru r8 = new ru
            r8.<init>(r7, r2)
            return r8
        L1dc:
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L1f7
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            r8.getClass()
            java.lang.Object r8 = defpackage.fv.D0(r8)
            r8.getClass()
            java.lang.reflect.Type r8 = (java.lang.reflect.Type) r8
            gg3 r7 = J(r7, r8, r3)
            return r7
        L1f7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.Class r8 = r8.getClass()
            ar0 r8 = defpackage.gh5.a(r8)
            java.lang.String r9 = " has type "
            defpackage.fa6.g(r7, r9, r8)
            return r1
    }

    public static final void K(defpackage.px0 r1, defpackage.eo2 r2, java.lang.Object r3) {
            r0 = r1
            xq2 r0 = (defpackage.xq2) r0
            boolean r0 = r0.S
            if (r0 != 0) goto L16
            r0 = r1
            xq2 r0 = (defpackage.xq2) r0
            java.lang.Object r0 = r0.P()
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L15
            goto L16
        L15:
            return
        L16:
            xq2 r1 = (defpackage.xq2) r1
            r1.l0(r3)
            r1.b(r2, r3)
            return
    }

    public static final java.lang.String L(byte[] r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r2 = r0.digest(r2)
            r2.getClass()
            x84 r0 = new x84
            r1 = 16
            r0.<init>(r1)
            java.lang.String r2 = defpackage.fv.L0(r2, r0)
            return r2
    }

    public static final java.lang.String[] M(defpackage.px0 r1, int r2) {
            py0 r0 = defpackage.kf.c
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r0)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.String[] r1 = r1.getStringArray(r2)
            return r1
    }

    public static final java.lang.String N(int r1, java.lang.Object[] r2, defpackage.px0 r3) {
            py0 r0 = defpackage.kf.c
            xq2 r3 = (defpackage.xq2) r3
            java.lang.Object r3 = r3.j(r0)
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r1 = r3.getString(r1, r2)
            return r1
    }

    public static final java.lang.String O(defpackage.px0 r1, int r2) {
            py0 r0 = defpackage.kf.c
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r0)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    public static final int P(defpackage.jr3 r5) {
            java.util.List r0 = r5.k
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            int r1 = r0.size()
            r3 = r2
        Lf:
            if (r2 >= r1) goto L1d
            java.lang.Object r4 = r0.get(r2)
            kr3 r4 = (defpackage.kr3) r4
            int r4 = r4.m
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Lf
        L1d:
            int r0 = r0.size()
            int r3 = r3 / r0
            int r5 = r5.q
            int r3 = r3 + r5
            return r3
    }

    public static final void Q(android.hardware.camera2.CaptureRequest.Builder r2, java.lang.Object r3, java.lang.Object r4) {
            if (r3 == 0) goto L34
            boolean r0 = r3 instanceof android.hardware.camera2.CaptureRequest.Key
            if (r0 == 0) goto L34
            r0 = r3
            android.hardware.camera2.CaptureRequest$Key r0 = (android.hardware.camera2.CaptureRequest.Key) r0     // Catch: java.lang.IllegalArgumentException -> Ld
            r2.set(r0, r4)     // Catch: java.lang.IllegalArgumentException -> Ld
            return
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to set ["
            r0.<init>(r1)
            android.hardware.camera2.CaptureRequest$Key r3 = (android.hardware.camera2.CaptureRequest.Key) r3
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "] on CaptureRequest.Builder"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "CXCP"
            android.util.Log.w(r4, r3, r2)
        L34:
            return
    }

    public static final void R(android.hardware.camera2.CaptureRequest.Builder r2, java.util.Map r3) {
            r3.getClass()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            Q(r2, r1, r0)
            goto Lb
        L23:
            return
    }

    public static final long a(float r4, boolean r5, boolean r6) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            r2 = 0
            if (r5 == 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = r2
        Ld:
            if (r6 == 0) goto L11
            r2 = 2
        L11:
            long r4 = r4 | r2
            r6 = 32
            long r0 = r0 << r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final void b(defpackage.ue1 r17, defpackage.a74 r18, defpackage.lq4 r19, defpackage.cs1 r20, defpackage.d40 r21, defpackage.ql6 r22, boolean r23, defpackage.ae4 r24, defpackage.cs1 r25, defpackage.sg r26, defpackage.zv0 r27, defpackage.px0 r28, int r29) {
            r1 = r17
            r12 = r28
            xq2 r12 = (defpackage.xq2) r12
            r0 = 1860873769(0x6eeaae29, float:3.631502E28)
            r12.d0(r0)
            boolean r0 = r12.f(r1)
            r2 = 4
            if (r0 == 0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = 2
        L16:
            r0 = r29 | r0
            r3 = 811298176(0x305b6d80, float:7.9827345E-10)
            r0 = r0 | r3
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r3 & r0
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L29
            r3 = r6
            goto L2a
        L29:
            r3 = r5
        L2a:
            r4 = r0 & 1
            boolean r3 = r12.S(r4, r3)
            if (r3 == 0) goto L13b
            r12.X()
            r3 = r29 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r3 == 0) goto L57
            boolean r3 = r12.B()
            if (r3 == 0) goto L43
            goto L57
        L43:
            r12.V()
            r0 = r0 & r4
            r2 = r19
            r7 = r20
            r9 = r21
            r4 = r22
            r8 = r24
            r10 = r25
            r6 = r26
            goto L11a
        L57:
            pq4 r3 = new pq4
            r7 = 0
            r3.<init>(r7, r7, r7, r7)
            cs1 r8 = defpackage.cs1.j0
            d40 r9 = defpackage.d90.i0
            r10 = r0 & 14
            r11 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r11
            fr4 r11 = new fr4
            r11.<init>()
            oc1 r13 = defpackage.eo6.a(r12)
            of5 r14 = defpackage.vq7.a
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 1137180672(0x43c80000, float:400.0)
            io6 r7 = defpackage.ge7.U(r7, r15, r14, r5)
            nq6 r14 = defpackage.ky0.h
            java.lang.Object r14 = r12.j(r14)
            qh1 r14 = (defpackage.qh1) r14
            nq6 r15 = defpackage.ky0.n
            java.lang.Object r15 = r12.j(r15)
            kk3 r15 = (defpackage.kk3) r15
            r16 = r10 & 14
            r28 = r4
            r4 = r16 ^ 6
            if (r4 <= r2) goto L9b
            boolean r4 = r12.f(r1)
            if (r4 != 0) goto L9f
        L9b:
            r4 = r10 & 6
            if (r4 != r2) goto La1
        L9f:
            r4 = r5
            goto La2
        La1:
            r4 = r6
        La2:
            boolean r10 = r12.f(r13)
            r4 = r4 | r10
            boolean r10 = r12.f(r7)
            r4 = r4 | r10
            boolean r10 = r12.f(r11)
            r4 = r4 | r10
            boolean r10 = r12.f(r14)
            r4 = r4 | r10
            int r10 = r15.ordinal()
            boolean r10 = r12.d(r10)
            r4 = r4 | r10
            java.lang.Object r10 = r12.P()
            vs0 r14 = defpackage.ox0.a
            if (r4 != 0) goto Lc9
            if (r10 != r14) goto Lde
        Lc9:
            l4 r4 = new l4
            r10 = 8
            r4.<init>(r10, r1, r15)
            ap3 r10 = new ap3
            r10.<init>(r1, r4, r11)
            ql6 r4 = new ql6
            r4.<init>(r10, r13, r7)
            r12.l0(r4)
            r10 = r4
        Lde:
            r4 = r10
            ql6 r4 = (defpackage.ql6) r4
            r7 = r0 & r28
            lo4 r10 = defpackage.lo4.Horizontal
            r0 = r0 & 14
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r11 = r0 & 14
            r11 = r11 ^ 6
            if (r11 <= r2) goto Lf5
            boolean r11 = r12.f(r1)
            if (r11 != 0) goto Lfb
        Lf5:
            r0 = r0 & 6
            if (r0 != r2) goto Lfa
            goto Lfb
        Lfa:
            r5 = r6
        Lfb:
            java.lang.Object r0 = r12.P()
            if (r5 != 0) goto L103
            if (r0 != r14) goto L10b
        L103:
            te1 r0 = new te1
            r0.<init>(r1, r10)
            r12.l0(r0)
        L10b:
            te1 r0 = (defpackage.te1) r0
            cs1 r2 = defpackage.cs1.l0
            sg r5 = defpackage.xp4.a(r12)
            r6 = r8
            r8 = r0
            r0 = r7
            r7 = r6
            r10 = r2
            r2 = r3
            r6 = r5
        L11a:
            r12.q()
            lo4 r3 = defpackage.lo4.Horizontal
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = 907570566(0x36186d86, float:2.2713516E-6)
            r13 = r0 | r5
            r14 = 1797510(0x1b6d86, float:2.518848E-39)
            r0 = r18
            r5 = r23
            r11 = r27
            defpackage.ln2.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r2
            r5 = r9
            r9 = r10
            r10 = r6
            r6 = r4
            r4 = r7
            goto L14c
        L13b:
            r12.V()
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
        L14c:
            cf5 r13 = r12.t()
            if (r13 == 0) goto L163
            wq4 r0 = new wq4
            r1 = r17
            r2 = r18
            r7 = r23
            r11 = r27
            r12 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.d = r0
        L163:
            return
    }

    public static defpackage.tc3 c() {
            tc3 r0 = new tc3
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static final defpackage.fy7 d(long r4) {
            fy7 r0 = new fy7
            int r1 = (int) r4
            r2 = 32
            long r4 = r4 >> r2
            int r4 = (int) r4
            int r5 = ~r1
            int r2 = r1 << 10
            int r3 = r4 >>> 4
            r2 = r2 ^ r3
            r0.<init>()
            r0.B = r1
            r0.L = r4
            r3 = 0
            r0.R = r3
            r0.X = r3
            r0.Y = r5
            r0.Z = r2
            r4 = r4 | r1
            r4 = r4 | r5
            if (r4 == 0) goto L2c
        L21:
            r4 = 64
            if (r3 >= r4) goto L2b
            r0.d()
            int r3 = r3 + 1
            goto L21
        L2b:
            return r0
        L2c:
            java.lang.String r4 = "Initial state must have at least one non-zero element."
            defpackage.i.h(r4)
            r4 = 0
            return r4
    }

    public static final void e(java.lang.String r10, java.util.List r11, int r12, defpackage.qn2 r13, defpackage.on2 r14, defpackage.px0 r15, int r16) {
            r7 = r16
            r8 = r15
            xq2 r8 = (defpackage.xq2) r8
            r0 = -1472832339(0xffffffffa8365cad, float:-1.0123125E-14)
            r8.d0(r0)
            r0 = r7 & 6
            if (r0 != 0) goto L1a
            boolean r0 = r8.f(r10)
            if (r0 == 0) goto L17
            r0 = 4
            goto L18
        L17:
            r0 = 2
        L18:
            r0 = r0 | r7
            goto L1b
        L1a:
            r0 = r7
        L1b:
            r2 = r7 & 48
            if (r2 != 0) goto L2b
            boolean r4 = r8.h(r11)
            if (r4 == 0) goto L28
            r4 = 32
            goto L2a
        L28:
            r4 = 16
        L2a:
            r0 = r0 | r4
        L2b:
            r4 = r7 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L3b
            boolean r5 = r8.d(r12)
            if (r5 == 0) goto L38
            r5 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r5 = 128(0x80, float:1.8E-43)
        L3a:
            r0 = r0 | r5
        L3b:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L4b
            boolean r6 = r8.h(r13)
            if (r6 == 0) goto L48
            r6 = 2048(0x800, float:2.87E-42)
            goto L4a
        L48:
            r6 = 1024(0x400, float:1.435E-42)
        L4a:
            r0 = r0 | r6
        L4b:
            r6 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L5b
            boolean r6 = r8.h(r14)
            if (r6 == 0) goto L58
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L5a
        L58:
            r6 = 8192(0x2000, float:1.148E-41)
        L5a:
            r0 = r0 | r6
        L5b:
            r9 = r0
            r0 = r9 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r0 == r6) goto L64
            r0 = 1
            goto L65
        L64:
            r0 = 0
        L65:
            r6 = r9 & 1
            boolean r0 = r8.S(r6, r0)
            if (r0 == 0) goto L8a
            l01 r0 = new l01
            r6 = 1
            r5 = r10
            r1 = r11
            r4 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = 960321110(0x393d5656, float:1.8056607E-4)
            zv0 r0 = defpackage.n16.I(r1, r0, r8)
            int r1 = r9 >> 12
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r2 = 0
            defpackage.u24.c(r14, r2, r0, r8, r1)
            goto L8d
        L8a:
            r8.V()
        L8d:
            cf5 r8 = r8.t()
            if (r8 == 0) goto La2
            sp5 r0 = new sp5
            r7 = 1
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        La2:
            return
    }

    public static final void f(java.lang.String r18, java.lang.String r19, java.util.List r20, int r21, defpackage.qn2 r22, boolean r23, float r24, defpackage.px0 r25, int r26) {
            r0 = r18
            r7 = r19
            r8 = r24
            r0.getClass()
            r7.getClass()
            r22.getClass()
            r5 = r25
            xq2 r5 = (defpackage.xq2) r5
            r1 = 1352551305(0x509e4b89, float:2.1246003E10)
            r5.d0(r1)
            boolean r1 = r5.f(r0)
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r26 | r1
            boolean r2 = r5.f(r7)
            if (r2 == 0) goto L2d
            r2 = 32
            goto L2f
        L2d:
            r2 = 16
        L2f:
            r1 = r1 | r2
            r3 = r20
            boolean r2 = r5.h(r3)
            if (r2 == 0) goto L3b
            r2 = 256(0x100, float:3.59E-43)
            goto L3d
        L3b:
            r2 = 128(0x80, float:1.8E-43)
        L3d:
            r1 = r1 | r2
            r2 = r21
            boolean r4 = r5.d(r2)
            if (r4 == 0) goto L49
            r4 = 2048(0x800, float:2.87E-42)
            goto L4b
        L49:
            r4 = 1024(0x400, float:1.435E-42)
        L4b:
            r1 = r1 | r4
            r4 = r22
            boolean r6 = r5.h(r4)
            if (r6 == 0) goto L57
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L59
        L57:
            r6 = 8192(0x2000, float:1.148E-41)
        L59:
            r1 = r1 | r6
            r6 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r6
            boolean r6 = r5.c(r8)
            if (r6 == 0) goto L66
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L68
        L66:
            r6 = 524288(0x80000, float:7.34684E-40)
        L68:
            r1 = r1 | r6
            r6 = 599187(0x92493, float:8.3964E-40)
            r6 = r6 & r1
            r9 = 599186(0x92492, float:8.39638E-40)
            r10 = 1
            r11 = 0
            if (r6 == r9) goto L76
            r6 = r10
            goto L77
        L76:
            r6 = r11
        L77:
            r9 = r1 & 1
            boolean r6 = r5.S(r9, r6)
            if (r6 == 0) goto L131
            java.lang.Object r6 = r5.P()
            vs0 r9 = defpackage.ox0.a
            if (r6 != r9) goto L90
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            vs4 r6 = defpackage.np2.Y(r6)
            r5.l0(r6)
        L90:
            qa4 r6 = (defpackage.qa4) r6
            py0 r12 = defpackage.g31.a
            r13 = -1573274739(0xffffffffa239bb8d, float:-2.5171464E-18)
            r5.b0(r13)
            py0 r13 = defpackage.j31.a
            java.lang.Object r13 = r5.j(r13)
            kt0 r13 = (defpackage.kt0) r13
            long r13 = r13.a
            nq6 r15 = defpackage.vt0.a
            java.lang.Object r15 = r5.j(r15)
            ut0 r15 = (defpackage.ut0) r15
            boolean r15 = r15.k()
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r15 == 0) goto Lbe
            float r13 = defpackage.hv.N(r13)
            double r13 = (double) r13
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto Lca
            goto Lc7
        Lbe:
            float r13 = defpackage.hv.N(r13)
            double r13 = (double) r13
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto Lca
        Lc7:
            r13 = 1065353216(0x3f800000, float:1.0)
            goto Lcd
        Lca:
            r13 = 1063172178(0x3f5eb852, float:0.87)
        Lcd:
            r5.p(r11)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            pq r12 = r12.a(r13)
            uc1 r13 = new uc1
            r13.<init>(r8, r6, r0, r7)
            r14 = 1427320905(0x55133049, float:1.0114725E13)
            zv0 r13 = defpackage.n16.I(r14, r13, r5)
            r14 = 56
            defpackage.hv.d(r12, r13, r5, r14)
            java.lang.Object r12 = r6.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L126
            r12 = -1526048517(0xffffffffa50a58fb, float:-1.199974E-16)
            r5.b0(r12)
            java.lang.Object r12 = r5.P()
            if (r12 != r9) goto L10b
            oe4 r12 = new oe4
            r9 = 24
            r12.<init>(r6, r9)
            r5.l0(r12)
        L10b:
            on2 r12 = (defpackage.on2) r12
            r6 = r1 & 14
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            int r1 = r1 >> 3
            r9 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 | r9
            r9 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 | r9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r1
            r1 = r3
            r3 = r4
            r4 = r12
            e(r0, r1, r2, r3, r4, r5, r6)
            r5.p(r11)
            goto L12f
        L126:
            r0 = -1525804423(0xffffffffa50e1279, float:-1.2322795E-16)
            r5.b0(r0)
            r5.p(r11)
        L12f:
            r6 = r10
            goto L136
        L131:
            r5.V()
            r6 = r23
        L136:
            cf5 r9 = r5.t()
            if (r9 == 0) goto L14f
            ni6 r0 = new ni6
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r2 = r7
            r7 = r8
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L14f:
            return
    }

    public static final void g(androidx.preference.Preference r3, defpackage.x05 r4) {
            r3.getClass()
            x05 r0 = r3.getOnPreferenceChangeListener()
            boolean r1 = r0 instanceof defpackage.wx0
            if (r1 == 0) goto L13
            wx0 r0 = (defpackage.wx0) r0
            java.util.ArrayList r3 = r0.a
            r3.add(r4)
            return
        L13:
            wx0 r1 = new wx0
            r1.<init>()
            java.util.ArrayList r2 = r1.a
            if (r0 == 0) goto L1f
            r2.add(r0)
        L1f:
            r2.add(r4)
            r3.setOnPreferenceChangeListener(r1)
            return
    }

    public static final defpackage.e53 h(defpackage.g53 r9, float r10, float r11, defpackage.d53 r12, java.lang.String r13, defpackage.px0 r14, int r15, int r16) {
            r1 = r16 & 8
            if (r1 == 0) goto L6
            java.lang.String r13 = "FloatAnimation"
        L6:
            r5 = r13
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            wc7 r3 = defpackage.nw7.e0
            r10 = r15 & 1022(0x3fe, float:1.432E-42)
            int r11 = r15 << 3
            r13 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            r7 = r10 | r11
            r8 = 0
            r0 = r9
            r4 = r12
            r6 = r14
            e53 r9 = j(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static final java.lang.Object i(defpackage.f86 r5, float r6, defpackage.io6 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.h76
            if (r0 == 0) goto L13
            r0 = r8
            h76 r0 = (defpackage.h76) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h76 r0 = new h76
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ah5 r5 = r0.R
            defpackage.oi2.Y(r8)
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            ah5 r8 = new ah5
            r8.<init>()
            i76 r2 = new i76
            r2.<init>(r6, r7, r8, r3)
            r0.R = r8
            r0.Y = r4
            xa4 r6 = defpackage.xa4.Default
            java.lang.Object r5 = r5.d(r6, r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = r8
        L4b:
            float r5 = r5.A
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
    }

    public static final defpackage.e53 j(defpackage.g53 r6, java.lang.Number r7, java.lang.Number r8, defpackage.wc7 r9, defpackage.d53 r10, java.lang.String r11, defpackage.px0 r12, int r13, int r14) {
            xq2 r12 = (defpackage.xq2) r12
            java.lang.Object r11 = r12.P()
            vs0 r14 = defpackage.ox0.a
            if (r11 != r14) goto L1a
            e53 r0 = new e53
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r3
            r12.l0(r0)
            r11 = r0
            goto L1c
        L1a:
            r1 = r6
            r9 = r8
        L1c:
            r8 = r11
            e53 r8 = (defpackage.e53) r8
            r6 = r13 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            r0 = 1
            r2 = 0
            if (r6 <= r11) goto L2f
            boolean r6 = r12.h(r9)
            if (r6 != 0) goto L33
        L2f:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != r11) goto L35
        L33:
            r6 = r0
            goto L36
        L35:
            r6 = r2
        L36:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            r11 = r11 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r11 <= r3) goto L46
            boolean r11 = r12.h(r10)
            if (r11 != 0) goto L4c
        L46:
            r11 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r11 != r3) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            r6 = r6 | r0
            java.lang.Object r11 = r12.P()
            if (r6 != 0) goto L55
            if (r11 != r14) goto L5f
        L55:
            hf0 r6 = new hf0
            r11 = 3
            r6.<init>(r7, r8, r9, r10, r11)
            r12.l0(r6)
            r11 = r6
        L5f:
            on2 r11 = (defpackage.on2) r11
            defpackage.mb3.n(r11, r12)
            boolean r6 = r12.h(r1)
            java.lang.Object r7 = r12.P()
            if (r6 != 0) goto L70
            if (r7 != r14) goto L7a
        L70:
            bi2 r7 = new bi2
            r6 = 8
            r7.<init>(r6, r1, r8)
            r12.l0(r7)
        L7a:
            qn2 r7 = (defpackage.qn2) r7
            defpackage.mb3.d(r8, r7, r12)
            return r8
    }

    public static final defpackage.sq2 k(defpackage.sq2 r1) {
            r0 = 0
            if (r1 == 0) goto L4
            goto L5
        L4:
            r1 = r0
        L5:
            if (r1 == 0) goto L8
            return r1
        L8:
            java.lang.String r1 = "Inconsistent composition"
            defpackage.tx0.b(r1)
            defpackage.e41.c()
            return r0
    }

    public static final float l(long r0, float r2, long r3, long r5) {
            long r0 = defpackage.kt0.c(r2, r0)
            long r0 = defpackage.hv.l(r0, r5)
            long r2 = defpackage.hv.l(r3, r0)
            float r2 = defpackage.hv.N(r2)
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r2 = r2 + r3
            float r0 = defpackage.hv.N(r0)
            float r0 = r0 + r3
            float r1 = java.lang.Math.max(r2, r0)
            float r0 = java.lang.Math.min(r2, r0)
            float r1 = r1 / r0
            return r1
    }

    public static final void m(defpackage.l61 r1, java.util.concurrent.CancellationException r2) {
            vs0 r0 = defpackage.vs0.h0
            j61 r1 = r1.Z(r0)
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto Ld
            r1.h(r2)
        Ld:
            return
    }

    public static final java.lang.Object n(defpackage.rc3 r1, defpackage.hw6 r2) {
            r0 = 0
            r1.h(r0)
            java.lang.Object r1 = r1.c0(r2)
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r2) goto Ld
            return r1
        Ld:
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    public static final void o(defpackage.l61 r1) {
            vs0 r0 = defpackage.vs0.h0
            j61 r1 = r1.Z(r0)
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto L16
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.util.concurrent.CancellationException r1 = r1.v()
            throw r1
        L16:
            return
    }

    public static final defpackage.gx3 p(java.util.concurrent.Executor r2, java.lang.String r3, defpackage.on2 r4) {
            r2.getClass()
            em2 r0 = new em2
            r1 = 2
            r0.<init>(r2, r3, r4, r1)
            tb0 r2 = defpackage.ak7.W(r0)
            return r2
    }

    public static final defpackage.vh2 q(defpackage.vh2 r1) {
            zp4 r1 = defpackage.nc1.g0(r1)
            te r1 = (defpackage.te) r1
            ah2 r1 = r1.getFocusOwner()
            eh2 r1 = (defpackage.eh2) r1
            vh2 r1 = r1.f()
            if (r1 == 0) goto L17
            boolean r0 = r1.j0
            if (r0 == 0) goto L17
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static final defpackage.of5 r(defpackage.vh2 r2) {
            boolean r0 = r2.j0
            if (r0 != 0) goto L5
            goto L1d
        L5:
            eg4 r0 = r2.d0
            if (r0 == 0) goto L1d
            jk3 r0 = defpackage.ej2.w(r0)
            boolean r1 = r0.t()
            if (r1 == 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L18
            goto L1d
        L18:
            of5 r2 = r2.U0(r0)
            return r2
        L1d:
            of5 r2 = defpackage.of5.e
            return r2
    }

    public static defpackage.k64 s(defpackage.k64 r2, defpackage.kk3 r3, defpackage.s47 r4, defpackage.qh1 r5, defpackage.ki2 r6) {
            if (r2 == 0) goto L23
            kk3 r0 = r2.a
            if (r3 != r0) goto L23
            s47 r0 = defpackage.gi2.N(r4, r3)
            s47 r1 = r2.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
            float r0 = r5.a()
            th1 r1 = r2.c
            float r1 = r1.A
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            ki2 r0 = r2.d
            if (r6 != r0) goto L23
            return r2
        L23:
            k64 r2 = defpackage.k64.h
            if (r2 == 0) goto L48
            kk3 r0 = r2.a
            if (r3 != r0) goto L48
            s47 r0 = defpackage.gi2.N(r4, r3)
            s47 r1 = r2.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            float r0 = r5.a()
            th1 r1 = r2.c
            float r1 = r1.A
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            ki2 r0 = r2.d
            if (r6 != r0) goto L48
            return r2
        L48:
            k64 r2 = new k64
            s47 r4 = defpackage.gi2.N(r4, r3)
            float r0 = r5.a()
            float r5 = r5.Y()
            th1 r1 = new th1
            r1.<init>(r0, r5)
            r2.<init>(r3, r4, r1, r6)
            defpackage.k64.h = r2
            return r2
    }

    public static final defpackage.vh2 t(defpackage.vh2 r8) {
            z64 r0 = r8.A
            boolean r0 = r0.j0
            r1 = 0
            if (r0 != 0) goto L9
            goto Laf
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.p53.c(r0)
        L10:
            ua4 r0 = new ua4
            r2 = 16
            z64[] r3 = new defpackage.z64[r2]
            r0.<init>(r3)
            z64 r8 = r8.A
            z64 r3 = r8.Y
            if (r3 != 0) goto L23
            defpackage.nc1.z(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.L
            if (r8 == 0) goto Laf
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            z64 r8 = (defpackage.z64) r8
            int r3 = r8.R
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.nc1.z(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.L
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lac
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof defpackage.vh2
            r5 = 1
            if (r4 == 0) goto L71
            vh2 r8 = (defpackage.vh2) r8
            z64 r4 = r8.A
            boolean r4 = r4.j0
            if (r4 == 0) goto La7
            sh2 r4 = r8.W0()
            int[] r6 = defpackage.xh2.b
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L70
            r5 = 2
            if (r4 == r5) goto L70
            r5 = 3
            if (r4 == r5) goto L70
            r8 = 4
            if (r4 != r8) goto L6c
            goto La7
        L6c:
            defpackage.i.d()
            return r1
        L70:
            return r8
        L71:
            int r4 = r8.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La7
            boolean r4 = r8 instanceof defpackage.zg1
            if (r4 == 0) goto La7
            r4 = r8
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r6 = 0
        L81:
            if (r4 == 0) goto La4
            int r7 = r4.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La1
            int r6 = r6 + 1
            if (r6 != r5) goto L8f
            r8 = r4
            goto La1
        L8f:
            if (r3 != 0) goto L98
            ua4 r3 = new ua4
            z64[] r7 = new defpackage.z64[r2]
            r3.<init>(r7)
        L98:
            if (r8 == 0) goto L9e
            r3.b(r8)
            r8 = r1
        L9e:
            r3.b(r4)
        La1:
            z64 r4 = r4.Y
            goto L81
        La4:
            if (r6 != r5) goto La7
            goto L45
        La7:
            z64 r8 = defpackage.nc1.A(r3)
            goto L45
        Lac:
            z64 r8 = r8.Y
            goto L3c
        Laf:
            return r1
    }

    public static final defpackage.rc3 u(defpackage.l61 r1) {
            vs0 r0 = defpackage.vs0.h0
            j61 r0 = r1.Z(r0)
            rc3 r0 = (defpackage.rc3) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Current context doesn't contain Job in it: "
            defpackage.e41.h(r1, r0)
            r1 = 0
            return r1
    }

    public static final defpackage.e33 v() {
            e33 r0 = defpackage.yh2.c
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.VideogameAsset"
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
            r2 = 1101529088(0x41a80000, float:21.0)
            r11 = 1086324736(0x40c00000, float:6.0)
            r4.o(r2, r11)
            r2 = 1077936128(0x40400000, float:3.0)
            r4.m(r2, r11)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r6 = 0
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r12 = 1090519040(0x41000000, float:8.0)
            r4.u(r12)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1099956224(0x41900000, float:18.0)
            r4.l(r5)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1102577664(0x41b80000, float:23.0)
            r4.m(r5, r12)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 0
            r6 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r7 = -1083808154(0xffffffffbf666666, float:-0.9)
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.g()
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1095761920(0x41500000, float:13.0)
            r4.o(r5, r6)
            r4.m(r12, r6)
            r4.u(r2)
            r5 = 1098907648(0x41800000, float:16.0)
            r4.m(r11, r5)
            r5 = -1069547520(0xffffffffc0400000, float:-3.0)
            r4.u(r5)
            r4.m(r2, r6)
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.u(r5)
            r4.l(r2)
            r4.m(r11, r12)
            r5 = 1073741824(0x40000000, float:2.0)
            r4.l(r5)
            r4.u(r2)
            r4.l(r2)
            r4.u(r5)
            r4.g()
            r2 = 1098383360(0x41780000, float:15.5)
            r5 = 1097859072(0x41700000, float:15.0)
            r4.o(r2, r5)
            r9 = -1077936128(0xffffffffbfc00000, float:-1.5)
            r10 = -1077936128(0xffffffffbfc00000, float:-1.5)
            r5 = -1084982559(0xffffffffbf547ae1, float:-0.83)
            r6 = 0
            r7 = -1077936128(0xffffffffbfc00000, float:-1.5)
            r8 = -1087666913(0xffffffffbf2b851f, float:-0.67)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1059816735(0x3f2b851f, float:0.67)
            r11 = -1077936128(0xffffffffbfc00000, float:-1.5)
            r12 = 1069547520(0x3fc00000, float:1.5)
            r4.q(r2, r11, r12, r11)
            r4.q(r12, r2, r12, r12)
            r13 = -1087666913(0xffffffffbf2b851f, float:-0.67)
            r4.q(r13, r12, r11, r12)
            r4.g()
            r5 = 1094713344(0x41400000, float:12.0)
            r14 = 1100742656(0x419c0000, float:19.5)
            r4.o(r14, r5)
            r5 = -1084982559(0xffffffffbf547ae1, float:-0.83)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1100307497(0x41955c29, float:18.67)
            r6 = 1091567616(0x41100000, float:9.0)
            r4.p(r5, r6, r14, r6)
            r4.q(r12, r2, r12, r12)
            r4.q(r13, r12, r11, r12)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.yh2.c = r0
            return r0
    }

    public static final boolean w(defpackage.fp r6) {
            java.lang.String r0 = r6.B
            int r0 = r0.length()
            java.util.List r6 = r6.A
            r1 = 0
            if (r6 == 0) goto L2d
            int r2 = r6.size()
            r3 = r1
        L10:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            ep r4 = (defpackage.ep) r4
            java.lang.Object r5 = r4.a
            boolean r5 = r5 instanceof defpackage.pv3
            if (r5 == 0) goto L2a
            int r5 = r4.b
            int r4 = r4.c
            boolean r4 = defpackage.gp.b(r1, r0, r5, r4)
            if (r4 == 0) goto L2a
            r6 = 1
            return r6
        L2a:
            int r3 = r3 + 1
            goto L10
        L2d:
            return r1
    }

    public static final void x(defpackage.px0 r1, java.lang.Integer r2, defpackage.eo2 r3) {
            r0 = r1
            xq2 r0 = (defpackage.xq2) r0
            boolean r0 = r0.S
            if (r0 == 0) goto Lc
            xq2 r1 = (defpackage.xq2) r1
            r1.b(r3, r2)
        Lc:
            return
    }

    public static final defpackage.il1 y(defpackage.rc3 r10, boolean r11, defpackage.uc3 r12) {
            boolean r0 = r10 instanceof defpackage.ed3
            if (r0 == 0) goto Lb
            ed3 r10 = (defpackage.ed3) r10
            il1 r10 = r10.V(r11, r12)
            return r10
        Lb:
            boolean r0 = r12.q()
            a0 r1 = new a0
            r8 = 0
            r9 = 24
            r2 = 1
            java.lang.Class<uc3> r4 = defpackage.uc3.class
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            il1 r10 = r10.e0(r0, r11, r1)
            return r10
    }

    public static final boolean z(defpackage.l61 r1) {
            vs0 r0 = defpackage.vs0.h0
            j61 r1 = r1.Z(r0)
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto Lf
            boolean r1 = r1.e()
            return r1
        Lf:
            r1 = 1
            return r1
    }
}
