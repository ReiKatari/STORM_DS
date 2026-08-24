package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np2  reason: default package */
/* loaded from: classes.dex */
public abstract class np2 {
    public static defpackage.e33 b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ np2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public static void A(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            defpackage.i.m(r0)
            return
    }

    public static final defpackage.qa4 B(defpackage.le2 r4, java.lang.Object r5, defpackage.l61 r6, defpackage.px0 r7, int r8, int r9) {
            r8 = 2
            r9 = r9 & r8
            if (r9 == 0) goto L6
            vt1 r6 = defpackage.vt1.A
        L6:
            xq2 r7 = (defpackage.xq2) r7
            boolean r9 = r7.h(r6)
            boolean r0 = r7.h(r4)
            r9 = r9 | r0
            java.lang.Object r0 = r7.P()
            r1 = 0
            vs0 r2 = defpackage.ox0.a
            if (r9 != 0) goto L1c
            if (r0 != r2) goto L26
        L1c:
            vy5 r0 = new vy5
            r9 = 9
            r0.<init>(r6, r4, r1, r9)
            r7.l0(r0)
        L26:
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r9 = r7.P()
            if (r9 != r2) goto L35
            vs4 r9 = Y(r5)
            r7.l0(r9)
        L35:
            qa4 r9 = (defpackage.qa4) r9
            boolean r5 = r7.h(r0)
            java.lang.Object r3 = r7.P()
            if (r5 != 0) goto L43
            if (r3 != r2) goto L4b
        L43:
            km6 r3 = new km6
            r3.<init>(r0, r9, r1, r8)
            r7.l0(r3)
        L4b:
            eo2 r3 = (defpackage.eo2) r3
            defpackage.mb3.j(r4, r6, r3, r7)
            return r9
    }

    public static final defpackage.qa4 C(defpackage.rp6 r6, defpackage.px0 r7) {
            java.lang.Object r1 = r6.getValue()
            r4 = 0
            r5 = 0
            vt1 r2 = defpackage.vt1.A
            r0 = r6
            r3 = r7
            qa4 r6 = B(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final defpackage.fd4 D(defpackage.wb6 r7, java.util.Map r8) {
            java.util.Set r0 = r8.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            r4 = r1
            hg3 r4 = (defpackage.hg3) r4
            r7.getClass()
            r4.getClass()
            boolean r5 = r7.c()
            boolean r6 = r4.a()
            if (r5 == r6) goto L2b
            r4 = r2
            goto L3b
        L2b:
            jd1 r5 = defpackage.ic6.a
            gg3 r4 = defpackage.jx2.N(r5, r4)
            if (r4 == 0) goto L3e
            wb6 r4 = r4.e()
            boolean r4 = r7.equals(r4)
        L3b:
            if (r4 == 0) goto La
            goto L4b
        L3e:
            java.lang.String r7 = r7.a()
            java.lang.String r8 = "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration."
            java.lang.String r0 = "Cannot find KSerializer for ["
            defpackage.e41.g(r7, r8, r0)
            return r3
        L4a:
            r1 = r3
        L4b:
            hg3 r1 = (defpackage.hg3) r1
            if (r1 == 0) goto L56
            java.lang.Object r8 = r8.get(r1)
            fd4 r8 = (defpackage.fd4) r8
            goto L57
        L56:
            r8 = r3
        L57:
            if (r8 == 0) goto L5a
            goto L5b
        L5a:
            r8 = r3
        L5b:
            wf7 r0 = defpackage.wf7.r
            if (r8 != 0) goto L145
            r7.getClass()
            ab3 r8 = defpackage.ii2.U(r7)
            int[] r1 = defpackage.gd4.a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            java.lang.Class<java.lang.Enum> r4 = java.lang.Enum.class
            switch(r8) {
                case 1: goto L141;
                case 2: goto L13d;
                case 3: goto L139;
                case 4: goto L135;
                case 5: goto L131;
                case 6: goto L12d;
                case 7: goto L129;
                case 8: goto Lf8;
                case 9: goto Lf5;
                case 10: goto Lf2;
                case 11: goto Lef;
                case 12: goto Lec;
                case 13: goto Le9;
                case 14: goto Le6;
                case 15: goto Le3;
                case 16: goto Le0;
                case 17: goto Ldd;
                case 18: goto Lda;
                case 19: goto Lbf;
                case 20: goto L87;
                case 21: goto L76;
                default: goto L73;
            }
        L73:
            r8 = r0
            goto L145
        L76:
            java.lang.Class r7 = defpackage.oi2.y(r7)
            boolean r8 = r4.isAssignableFrom(r7)
            if (r8 == 0) goto L73
            ca3 r8 = new ca3
            r8.<init>(r7)
            goto L145
        L87:
            wb6 r8 = r7.j(r2)
            ab3 r8 = defpackage.ii2.U(r8)
            int r8 = r8.ordinal()
            r8 = r1[r8]
            switch(r8) {
                case 1: goto Lbc;
                case 2: goto Lb9;
                case 3: goto Lb6;
                case 4: goto Lb3;
                case 5: goto Lb0;
                case 6: goto Lad;
                case 7: goto La8;
                case 8: goto L99;
                default: goto L98;
            }
        L98:
            goto L73
        L99:
            ba3 r8 = new ba3
            wb6 r7 = r7.j(r2)
            java.lang.Class r7 = defpackage.oi2.y(r7)
            r8.<init>(r7)
            goto L145
        La8:
            p50 r7 = defpackage.fd4.g
        Laa:
            r8 = r7
            goto L145
        Lad:
            p50 r7 = defpackage.fd4.j
            goto Laa
        Lb0:
            za3 r7 = defpackage.f04.w
            goto Laa
        Lb3:
            p50 r7 = defpackage.fd4.m
            goto Laa
        Lb6:
            p50 r7 = defpackage.fd4.d
            goto Laa
        Lb9:
            za3 r7 = defpackage.f04.u
            goto Laa
        Lbc:
            p50 r7 = defpackage.fd4.p
            goto Laa
        Lbf:
            wb6 r7 = r7.j(r2)
            ab3 r7 = defpackage.ii2.U(r7)
            int r7 = r7.ordinal()
            r7 = r1[r7]
            r8 = 1
            if (r7 == r8) goto Ld7
            r8 = 2
            if (r7 == r8) goto Ld4
            goto L73
        Ld4:
            za3 r7 = defpackage.f04.t
            goto Laa
        Ld7:
            p50 r7 = defpackage.fd4.o
            goto Laa
        Lda:
            p50 r7 = defpackage.fd4.f
            goto Laa
        Ldd:
            p50 r7 = defpackage.fd4.i
            goto Laa
        Le0:
            za3 r7 = defpackage.f04.v
            goto Laa
        Le3:
            p50 r7 = defpackage.fd4.l
            goto Laa
        Le6:
            p50 r7 = defpackage.fd4.c
            goto Laa
        Le9:
            wf7 r7 = defpackage.f04.r
            goto Laa
        Lec:
            wf7 r7 = defpackage.f04.q
            goto Laa
        Lef:
            wf7 r7 = defpackage.f04.p
            goto Laa
        Lf2:
            wf7 r7 = defpackage.f04.n
            goto Laa
        Lf5:
            wf7 r7 = defpackage.f04.m
            goto Laa
        Lf8:
            java.lang.Class r7 = defpackage.oi2.y(r7)
            java.lang.Class<android.os.Parcelable> r8 = android.os.Parcelable.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 == 0) goto L10a
            dd4 r8 = new dd4
            r8.<init>(r7)
            goto L125
        L10a:
            boolean r8 = r4.isAssignableFrom(r7)
            if (r8 == 0) goto L116
            cd4 r8 = new cd4
            r8.<init>(r7)
            goto L125
        L116:
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 == 0) goto L124
            ed4 r8 = new ed4
            r8.<init>(r7)
            goto L125
        L124:
            r8 = r3
        L125:
            if (r8 != 0) goto L145
            goto L73
        L129:
            q50 r7 = defpackage.fd4.e
            goto Laa
        L12d:
            q50 r7 = defpackage.fd4.h
            goto Laa
        L131:
            wf7 r7 = defpackage.f04.o
            goto Laa
        L135:
            q50 r7 = defpackage.fd4.k
            goto Laa
        L139:
            q50 r7 = defpackage.fd4.b
            goto Laa
        L13d:
            q50 r7 = defpackage.fd4.n
            goto Laa
        L141:
            wf7 r7 = defpackage.f04.s
            goto Laa
        L145:
            boolean r7 = r8.equals(r0)
            if (r7 == 0) goto L14c
            return r3
        L14c:
            return r8
    }

    public static defpackage.qa4 E() {
            vs0 r0 = defpackage.vs0.j0
            vs4 r1 = new vs4
            jg7 r2 = defpackage.jg7.a
            r1.<init>(r2, r0)
            return r1
    }

    public static defpackage.r41 F(defpackage.eo2 r2, java.lang.Object r3, defpackage.r41 r4) {
            r2.getClass()
            r4.getClass()
            boolean r0 = r2 instanceof defpackage.d20
            if (r0 == 0) goto L11
            d20 r2 = (defpackage.d20) r2
            r41 r2 = r2.q(r4, r3)
            return r2
        L11:
            l61 r0 = r4.b()
            vt1 r1 = defpackage.vt1.A
            if (r0 != r1) goto L1f
            ob3 r0 = new ob3
            r0.<init>(r2, r3, r4)
            return r0
        L1f:
            pb3 r1 = new pb3
            r1.<init>(r4, r0, r2, r3)
            return r1
    }

    public static byte[] G(java.lang.String r7) {
            int r0 = r7.length()
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L3f
            int r0 = r7.length()
            int r0 = r0 / 2
            byte[] r2 = new byte[r0]
            r3 = 0
        L12:
            if (r3 >= r0) goto L3e
            int r4 = r3 * 2
            char r5 = r7.charAt(r4)
            r6 = 16
            int r5 = java.lang.Character.digit(r5, r6)
            int r4 = r4 + 1
            char r4 = r7.charAt(r4)
            int r4 = java.lang.Character.digit(r4, r6)
            r6 = -1
            if (r5 == r6) goto L38
            if (r4 == r6) goto L38
            int r5 = r5 * 16
            int r5 = r5 + r4
            byte r4 = (byte) r5
            r2[r3] = r4
            int r3 = r3 + 1
            goto L12
        L38:
            java.lang.String r7 = "input is not hexadecimal"
            defpackage.i.h(r7)
            return r1
        L3e:
            return r2
        L3f:
            java.lang.String r7 = "Expected a string of even length"
            defpackage.i.h(r7)
            return r1
    }

    public static final defpackage.ua4 H() {
            m44 r0 = defpackage.jm6.b
            java.lang.Object r1 = r0.f()
            ua4 r1 = (defpackage.ua4) r1
            if (r1 != 0) goto L15
            ua4 r1 = new ua4
            r2 = 0
            wq2[] r2 = new defpackage.wq2[r2]
            r1.<init>(r2)
            r0.F(r1)
        L15:
            return r1
    }

    public static final defpackage.ii1 I(defpackage.on2 r2) {
            m44 r0 = defpackage.jm6.a
            ii1 r0 = new ii1
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final defpackage.ii1 J(defpackage.on2 r1, defpackage.im6 r2) {
            m44 r0 = defpackage.jm6.a
            ii1 r0 = new ii1
            r0.<init>(r1, r2)
            return r0
    }

    public static final float K(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            float r1 = (float) r1
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r1 = r1 * r2
            return r1
    }

    public static java.lang.String L(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r3 / 16
            java.lang.String r5 = "0123456789abcdef"
            char r4 = r5.charAt(r4)
            r0.append(r4)
            int r3 = r3 % 16
            char r3 = r5.charAt(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L27:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static defpackage.ic4 M(defpackage.mc4 r2) {
            x84 r0 = new x84
            r1 = 11
            r0.<init>(r1)
            qb6 r2 = defpackage.sb6.Z(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r0 = r2.next()
            goto L19
        L24:
            ic4 r0 = (defpackage.ic4) r0
            return r0
        L27:
            java.lang.String r2 = "Sequence is empty."
            defpackage.fa6.e(r2)
            r2 = 0
            return r2
    }

    public static defpackage.bm7 N(java.lang.String r16) {
            r16.getClass()
            java.lang.CharSequence r0 = defpackage.qs6.T0(r16)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "nightly"
            r2 = 1
            boolean r1 = defpackage.xs6.Z(r0, r1, r2)
            if (r1 != 0) goto L129
            java.lang.String r1 = "nightly-release"
            boolean r1 = defpackage.xs6.Z(r0, r1, r2)
            if (r1 == 0) goto L1e
            goto L129
        L1e:
            xh5 r1 = defpackage.bm7.d0
            n14 r1 = r1.c(r0)
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 0
            if (r1 == 0) goto Lb4
            java.util.List r8 = r1.a()
            l14 r8 = (defpackage.l14) r8
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            wl7 r9 = i0(r6)
            java.util.List r6 = r1.a()
            l14 r6 = (defpackage.l14) r6
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            int r10 = java.lang.Integer.parseInt(r6)
            java.util.List r6 = r1.a()
            l14 r6 = (defpackage.l14) r6
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r11 = java.lang.Integer.parseInt(r5)
            java.util.List r5 = r1.a()
            l14 r5 = (defpackage.l14) r5
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r12 = java.lang.Integer.parseInt(r4)
            java.util.List r4 = r1.a()
            l14 r4 = (defpackage.l14) r4
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = defpackage.xs6.h0(r3)
            if (r3 == 0) goto L83
            int r3 = r3.intValue()
            r13 = r3
            goto L84
        L83:
            r13 = r7
        L84:
            java.util.List r1 = r1.a()
            r3 = 6
            l14 r1 = (defpackage.l14) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            if (r3 != 0) goto La1
            java.lang.String r3 = ".fix"
            boolean r0 = defpackage.xs6.Y(r0, r3, r2)
            if (r0 == 0) goto La1
        L9f:
            r14 = r2
            goto Lae
        La1:
            int r0 = r1.length()
            if (r0 != 0) goto La9
            r14 = r7
            goto Lae
        La9:
            int r2 = java.lang.Integer.parseInt(r1)
            goto L9f
        Lae:
            bm7 r8 = new bm7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        Lb4:
            xh5 r1 = defpackage.bm7.e0
            n14 r0 = r1.c(r0)
            if (r0 == 0) goto L11c
            bm7 r8 = new bm7
            java.util.List r1 = r0.a()
            l14 r1 = (defpackage.l14) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            wl7 r9 = i0(r1)
            java.util.List r1 = r0.a()
            l14 r1 = (defpackage.l14) r1
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r10 = java.lang.Integer.parseInt(r1)
            java.util.List r1 = r0.a()
            l14 r1 = (defpackage.l14) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r11 = java.lang.Integer.parseInt(r1)
            java.util.List r1 = r0.a()
            l14 r1 = (defpackage.l14) r1
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            int r12 = java.lang.Integer.parseInt(r1)
            java.util.List r0 = r0.a()
            l14 r0 = (defpackage.l14) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto L114
            int r7 = r0.intValue()
        L114:
            r13 = r7
            r14 = 32
            r15 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L11c:
            java.lang.String r0 = "Invalid version string: "
            r1 = r16
            java.lang.String r0 = r0.concat(r1)
            defpackage.i.h(r0)
            r0 = 0
            return r0
        L129:
            bm7 r0 = defpackage.bm7.Z
            return r0
    }

    public static final int O(defpackage.gg3 r4) {
            wb6 r0 = r4.e()
            java.lang.String r0 = r0.a()
            int r0 = r0.hashCode()
            wb6 r1 = r4.e()
            int r1 = r1.f()
            r2 = 0
        L15:
            if (r2 >= r1) goto L29
            int r0 = r0 * 31
            wb6 r3 = r4.e()
            java.lang.String r3 = r3.g(r2)
            int r3 = r3.hashCode()
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L15
        L29:
            return r0
    }

    public static final java.lang.String P(java.lang.Object r7, java.util.LinkedHashMap r8) {
            r7.getClass()
            java.lang.Class r0 = r7.getClass()
            ar0 r0 = defpackage.gh5.a(r0)
            gg3 r0 = defpackage.jx2.K(r0)
            f26 r1 = new f26
            r1.<init>(r0, r8)
            r2 = r0
            gg3 r2 = (defpackage.gg3) r2
            r2.d(r1, r7)
            java.util.LinkedHashMap r7 = r1.k0
            java.util.Map r7 = defpackage.c14.s0(r7)
            eb r1 = new eb
            r1.<init>(r0)
            l4 r2 = new l4
            r3 = 12
            r2.<init>(r3, r7, r1)
            wb6 r7 = r0.e()
            int r7 = r7.f()
            r3 = 0
        L35:
            if (r3 >= r7) goto L5e
            wb6 r4 = r0.e()
            java.lang.String r4 = r4.g(r3)
            java.lang.Object r5 = r8.get(r4)
            fd4 r5 = (defpackage.fd4) r5
            if (r5 == 0) goto L51
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r2.e(r6, r4, r5)
            int r3 = r3 + 1
            goto L35
        L51:
            java.lang.String r7 = "Cannot locate NavType for argument ["
            r8 = 93
            java.lang.String r7 = defpackage.i61.k(r8, r7, r4)
            defpackage.u34.f(r7)
            r7 = 0
            return r7
        L5e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.Object r8 = r1.L
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            java.lang.Object r8 = r1.R
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            java.lang.Object r8 = r1.X
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static final float Q(int r0, int r1, float[] r2) {
            int r0 = r0 - r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            r0 = r2[r0]
            return r0
    }

    public static android.content.res.ColorStateList R(android.content.Context r2, defpackage.m44 r3, int r4) {
            java.lang.Object r0 = r3.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L18
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r2, r0)
            if (r2 == 0) goto L18
            return r2
        L18:
            android.content.res.ColorStateList r2 = r3.g(r4)
            return r2
    }

    public static android.content.res.ColorStateList S(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = defpackage.ge7.A(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    public static android.graphics.drawable.Drawable T(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r1 = defpackage.hf.S(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
    }

    public static final int U(defpackage.y37 r19, android.text.Layout r20, defpackage.s9 r21, int r22, android.graphics.RectF r23, defpackage.q96 r24, defpackage.z5 r25, boolean r26) {
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            int r7 = r1.getLineTop(r3)
            int r8 = r1.getLineBottom(r3)
            int r9 = r1.getLineStart(r3)
            int r1 = r1.getLineEnd(r3)
            if (r9 != r1) goto L23
        L20:
            r10 = -1
            goto L2c5
        L23:
            int r1 = r1 - r9
            int r1 = r1 * 2
            float[] r11 = new float[r1]
            android.text.Layout r12 = r0.f
            int r13 = r12.getLineStart(r3)
            int r14 = r0.f(r3)
            int r15 = r14 - r13
            int r15 = r15 * 2
            if (r1 < r15) goto L39
            goto L3e
        L39:
            java.lang.String r1 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"
            defpackage.q53.a(r1)
        L3e:
            fy2 r1 = new fy2
            r1.<init>(r0)
            int r0 = r12.getParagraphDirection(r3)
            r15 = 0
            r10 = 1
            if (r0 != r10) goto L4d
            r0 = r10
            goto L4e
        L4d:
            r0 = r15
        L4e:
            r16 = r15
        L50:
            if (r13 >= r14) goto La7
            boolean r17 = r12.isRtlCharAt(r13)
            if (r0 == 0) goto L67
            if (r17 != 0) goto L67
            float r17 = r1.a(r13, r15, r15, r10)
            int r15 = r13 + 1
            float r15 = r1.a(r15, r10, r10, r10)
            r18 = r0
            goto L99
        L67:
            if (r0 == 0) goto L7d
            if (r17 == 0) goto L7d
            r15 = 0
            float r17 = r1.a(r13, r15, r15, r15)
            r18 = r0
            int r0 = r13 + 1
            float r0 = r1.a(r0, r10, r10, r15)
            r15 = r17
            r17 = r0
            goto L99
        L7d:
            r18 = r0
            r15 = 0
            if (r17 == 0) goto L8e
            float r0 = r1.a(r13, r15, r15, r10)
            int r15 = r13 + 1
            float r17 = r1.a(r15, r10, r10, r10)
        L8c:
            r15 = r0
            goto L99
        L8e:
            float r17 = r1.a(r13, r15, r15, r15)
            int r0 = r13 + 1
            float r0 = r1.a(r0, r10, r10, r15)
            goto L8c
        L99:
            r11[r16] = r17
            int r0 = r16 + 1
            r11[r0] = r15
            int r16 = r16 + 2
            int r13 = r13 + 1
            r0 = r18
            r15 = 0
            goto L50
        La7:
            java.lang.Object r0 = r2.a
            android.text.Layout r0 = (android.text.Layout) r0
            int r1 = r0.getLineStart(r3)
            int r3 = r0.getLineEnd(r3)
            r15 = 0
            int r12 = r2.y(r1, r15)
            int r13 = r2.z(r12)
            int r14 = r1 - r13
            int r13 = r3 - r13
            java.text.Bidi r2 = r2.j(r12)
            if (r2 == 0) goto Lf9
            java.text.Bidi r2 = r2.createLineBidi(r14, r13)
            if (r2 != 0) goto Lcd
            goto Lf9
        Lcd:
            int r0 = r2.getRunCount()
            am3[] r3 = new defpackage.am3[r0]
            r15 = 0
        Ld4:
            if (r15 >= r0) goto L106
            am3 r12 = new am3
            int r13 = r2.getRunStart(r15)
            int r13 = r13 + r1
            int r14 = r2.getRunLimit(r15)
            int r14 = r14 + r1
            int r16 = r2.getRunLevel(r15)
            r21 = r0
            int r0 = r16 % 2
            if (r0 != r10) goto Lee
            r0 = r10
            goto Lef
        Lee:
            r0 = 0
        Lef:
            r12.<init>(r13, r0, r14)
            r3[r15] = r12
            int r15 = r15 + 1
            r0 = r21
            goto Ld4
        Lf9:
            am3 r2 = new am3
            boolean r0 = r0.isRtlCharAt(r1)
            r2.<init>(r1, r0, r3)
            am3[] r3 = new defpackage.am3[]{r2}
        L106:
            if (r26 == 0) goto L10d
            l93 r0 = defpackage.fv.G0(r3)
            goto L117
        L10d:
            int r0 = r3.length
            int r0 = r0 - r10
            j93 r1 = new j93
            r2 = -1
            r15 = 0
            r1.<init>(r0, r15, r2)
            r0 = r1
        L117:
            int r1 = r0.A
            int r2 = r0.B
            int r0 = r0.L
            if (r0 <= 0) goto L121
            if (r1 <= r2) goto L125
        L121:
            if (r0 >= 0) goto L20
            if (r2 > r1) goto L20
        L125:
            r12 = r3[r1]
            boolean r13 = r12.c
            int r14 = r12.a
            int r12 = r12.b
            if (r13 == 0) goto L137
            int r15 = r12 + (-1)
            int r15 = r15 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            goto L13d
        L137:
            int r15 = r14 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
        L13d:
            if (r13 == 0) goto L144
            float r16 = Q(r14, r9, r11)
            goto L14a
        L144:
            int r10 = r12 + (-1)
            float r16 = Q(r10, r9, r11)
        L14a:
            float r10 = r4.left
            r17 = r0
            if (r26 == 0) goto L204
            int r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r18 < 0) goto L1a2
            float r0 = r4.right
            int r18 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r18 > 0) goto L1a2
            if (r13 != 0) goto L160
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L166
        L160:
            if (r13 == 0) goto L168
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L168
        L166:
            r0 = r14
            goto L19b
        L168:
            r0 = r12
            r10 = r14
        L16a:
            int r15 = r0 - r10
            r22 = r0
            r0 = 1
            if (r15 <= r0) goto L195
            int r0 = r22 + r10
            int r0 = r0 / 2
            int r15 = r0 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            r16 = r0
            if (r13 != 0) goto L185
            float r0 = r4.left
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L18d
        L185:
            if (r13 == 0) goto L190
            float r0 = r4.right
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L190
        L18d:
            r0 = r16
            goto L16a
        L190:
            r0 = r22
            r10 = r16
            goto L16a
        L195:
            if (r13 == 0) goto L19a
            r0 = r22
            goto L19b
        L19a:
            r0 = r10
        L19b:
            int r0 = r5.d(r0)
            r10 = -1
            if (r0 != r10) goto L1a7
        L1a2:
            r18 = r3
        L1a4:
            r14 = -1
            goto L2b7
        L1a7:
            int r10 = r5.c(r0)
            if (r10 < r12) goto L1ae
            goto L1a2
        L1ae:
            if (r10 >= r14) goto L1b1
            goto L1b2
        L1b1:
            r14 = r10
        L1b2:
            if (r0 <= r12) goto L1b5
            r0 = r12
        L1b5:
            android.graphics.RectF r10 = new android.graphics.RectF
            float r15 = (float) r7
            r22 = r0
            float r0 = (float) r8
            r18 = r3
            r3 = 0
            r10.<init>(r3, r15, r3, r0)
            r0 = r22
        L1c3:
            if (r13 == 0) goto L1cd
            int r3 = r0 + (-1)
            int r3 = r3 - r9
            int r3 = r3 * 2
            r3 = r11[r3]
            goto L1d3
        L1cd:
            int r3 = r14 - r9
            int r3 = r3 * 2
            r3 = r11[r3]
        L1d3:
            r10.left = r3
            if (r13 == 0) goto L1dc
            float r0 = Q(r14, r9, r11)
            goto L1e2
        L1dc:
            int r0 = r0 + (-1)
            float r0 = Q(r0, r9, r11)
        L1e2:
            r10.right = r0
            java.lang.Object r0 = r6.o(r10, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f2
            goto L2b7
        L1f2:
            int r14 = r5.a(r14)
            r0 = -1
            if (r14 == r0) goto L1a4
            if (r14 < r12) goto L1fc
            goto L1a4
        L1fc:
            int r0 = r5.d(r14)
            if (r0 <= r12) goto L1c3
            r0 = r12
            goto L1c3
        L204:
            r18 = r3
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 < 0) goto L25a
            float r0 = r4.right
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r3 > 0) goto L25a
            if (r13 != 0) goto L216
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L21c
        L216:
            if (r13 == 0) goto L220
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 > 0) goto L220
        L21c:
            int r0 = r12 + (-1)
        L21e:
            r15 = 1
            goto L252
        L220:
            r0 = r12
            r3 = r14
        L222:
            int r10 = r0 - r3
            r15 = 1
            if (r10 <= r15) goto L249
            int r10 = r0 + r3
            int r10 = r10 / 2
            int r15 = r10 - r9
            int r15 = r15 * 2
            r15 = r11[r15]
            r22 = r0
            if (r13 != 0) goto L23b
            float r0 = r4.right
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L243
        L23b:
            if (r13 == 0) goto L245
            float r0 = r4.left
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L245
        L243:
            r0 = r10
            goto L222
        L245:
            r0 = r22
            r3 = r10
            goto L222
        L249:
            r22 = r0
            if (r13 == 0) goto L250
            r0 = r22
            goto L21e
        L250:
            r0 = r3
            goto L21e
        L252:
            int r0 = r0 + r15
            int r0 = r5.c(r0)
            r10 = -1
            if (r0 != r10) goto L25c
        L25a:
            r12 = -1
            goto L2b6
        L25c:
            int r3 = r5.d(r0)
            if (r3 > r14) goto L263
            goto L25a
        L263:
            if (r0 >= r14) goto L266
            r0 = r14
        L266:
            if (r3 <= r12) goto L269
            goto L26a
        L269:
            r12 = r3
        L26a:
            android.graphics.RectF r3 = new android.graphics.RectF
            float r10 = (float) r7
            float r15 = (float) r8
            r22 = r0
            r0 = 0
            r3.<init>(r0, r10, r0, r15)
            r0 = r22
        L276:
            if (r13 == 0) goto L280
            int r10 = r12 + (-1)
            int r10 = r10 - r9
            int r10 = r10 * 2
            r10 = r11[r10]
            goto L286
        L280:
            int r10 = r0 - r9
            int r10 = r10 * 2
            r10 = r11[r10]
        L286:
            r3.left = r10
            if (r13 == 0) goto L28f
            float r0 = Q(r0, r9, r11)
            goto L295
        L28f:
            int r0 = r12 + (-1)
            float r0 = Q(r0, r9, r11)
        L295:
            r3.right = r0
            java.lang.Object r0 = r6.o(r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a4
            goto L2b6
        L2a4:
            int r12 = r5.b(r12)
            r10 = -1
            if (r12 == r10) goto L25a
            if (r12 > r14) goto L2ae
            goto L25a
        L2ae:
            int r0 = r5.c(r12)
            if (r0 >= r14) goto L276
            r0 = r14
            goto L276
        L2b6:
            r14 = r12
        L2b7:
            if (r14 < 0) goto L2ba
            return r14
        L2ba:
            if (r1 == r2) goto L20
            int r1 = r1 + r17
            r0 = r17
            r3 = r18
            r10 = 1
            goto L125
        L2c5:
            return r10
    }

    public static defpackage.r41 V(defpackage.r41 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.s41
            if (r0 == 0) goto Lb
            r0 = r2
            s41 r0 = (defpackage.s41) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L2a
            r41 r2 = r0.L
            if (r2 != 0) goto L2a
            l61 r2 = r0.b()
            d90 r1 = defpackage.d90.r0
            j61 r2 = r2.Z(r1)
            n61 r2 = (defpackage.n61) r2
            if (r2 == 0) goto L26
            nk1 r1 = new nk1
            r1.<init>(r2, r0)
            goto L27
        L26:
            r1 = r0
        L27:
            r0.L = r1
            return r1
        L2a:
            return r2
    }

    public static boolean W(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final boolean X(defpackage.wb6 r2) {
            r2.getClass()
            np2 r0 = r2.e()
            bt6 r1 = defpackage.bt6.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L1d
            boolean r0 = r2.h()
            if (r0 == 0) goto L1d
            int r2 = r2.f()
            r0 = 1
            if (r2 != r0) goto L1d
            return r0
        L1d:
            r2 = 0
            return r2
    }

    public static defpackage.vs4 Y(java.lang.Object r2) {
            xd5 r0 = defpackage.xd5.s0
            vs4 r1 = new vs4
            r1.<init>(r2, r0)
            return r1
    }

    public static defpackage.bm7 Z(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L1a
            bm7 r1 = defpackage.bm7.Z
            bm7 r2 = N(r2)     // Catch: java.lang.Throwable -> La
            goto L11
        La:
            r2 = move-exception
            em5 r1 = new em5
            r1.<init>(r2)
            r2 = r1
        L11:
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = r2
        L18:
            bm7 r0 = (defpackage.bm7) r0
        L1a:
            return r0
    }

    public static final void a(defpackage.a74 r11, defpackage.lq4 r12, defpackage.rp0 r13, defpackage.qn2 r14, defpackage.px0 r15, int r16) {
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r8 = r15
            xq2 r8 = (defpackage.xq2) r8
            r0 = 1411501135(0x5421cc4f, float:2.7796699E12)
            r8.d0(r0)
            boolean r0 = r8.f(r12)
            if (r0 == 0) goto L1e
            r0 = 32
            goto L20
        L1e:
            r0 = 16
        L20:
            r0 = r16 | r0
            boolean r1 = r8.f(r13)
            if (r1 == 0) goto L2b
            r1 = 256(0x100, float:3.59E-43)
            goto L2d
        L2b:
            r1 = 128(0x80, float:1.8E-43)
        L2d:
            r0 = r0 | r1
            boolean r1 = r8.h(r14)
            if (r1 == 0) goto L37
            r1 = 2048(0x800, float:2.87E-42)
            goto L39
        L37:
            r1 = 1024(0x400, float:1.435E-42)
        L39:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r10 = 0
            if (r1 == r5) goto L43
            r1 = 1
            goto L44
        L43:
            r1 = r10
        L44:
            r5 = r0 & 1
            boolean r1 = r8.S(r5, r1)
            if (r1 == 0) goto L87
            boolean r1 = r13 instanceof defpackage.pp0
            if (r1 == 0) goto L61
            r0 = -757067682(0xffffffffd2e0105e, float:-4.8117364E11)
            r8.b0(r0)
            a74 r0 = defpackage.ge7.N(r11, r12)
            defpackage.hi2.e(r0, r8, r10)
            r8.p(r10)
            goto L8a
        L61:
            boolean r1 = r13 instanceof defpackage.qp0
            if (r1 == 0) goto L7f
            r1 = -757064749(0xffffffffd2e01bd3, float:-4.8126974E11)
            r8.b0(r1)
            r1 = r13
            qp0 r1 = (defpackage.qp0) r1
            java.lang.Object r1 = r1.a
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            r9 = r0 & 7294(0x1c7e, float:1.0221E-41)
            r4 = r11
            r5 = r12
            r7 = r14
            f(r4, r5, r6, r7, r8, r9)
            r8.p(r10)
            goto L8a
        L7f:
            r0 = -757069238(0xffffffffd2e00a4a, float:-4.8112265E11)
            ug r0 = defpackage.xg6.f(r8, r0, r10)
            throw r0
        L87:
            r8.V()
        L8a:
            cf5 r7 = r8.t()
            if (r7 == 0) goto L9e
            s32 r0 = new s32
            r6 = 1
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L9e:
            return
    }

    public static final defpackage.qa4 a0(android.net.Uri r5, defpackage.eo2 r6, defpackage.xq2 r7) {
            java.lang.Object r0 = r7.P()
            r1 = 0
            vs0 r2 = defpackage.ox0.a
            if (r0 != r2) goto L10
            vs4 r0 = Y(r1)
            r7.l0(r0)
        L10:
            qa4 r0 = (defpackage.qa4) r0
            boolean r3 = r7.h(r6)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L1e
            if (r4 != r2) goto L27
        L1e:
            km6 r4 = new km6
            r2 = 1
            r4.<init>(r6, r0, r1, r2)
            r7.l0(r4)
        L27:
            eo2 r4 = (defpackage.eo2) r4
            defpackage.mb3.i(r7, r4, r5)
            return r0
    }

    public static final void b(defpackage.fk3 r46, boolean r47, defpackage.on2 r48, defpackage.on2 r49, defpackage.on2 r50, defpackage.on2 r51, defpackage.px0 r52, int r53) {
            r1 = r46
            r2 = r47
            r8 = r52
            xq2 r8 = (defpackage.xq2) r8
            r0 = -911611896(0xffffffffc9a9e808, float:-1391873.0)
            r8.d0(r0)
            boolean r0 = r8.h(r1)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r53 | r0
            boolean r4 = r8.g(r2)
            if (r4 == 0) goto L22
            r4 = 32
            goto L24
        L22:
            r4 = 16
        L24:
            r0 = r0 | r4
            r14 = r48
            boolean r4 = r8.h(r14)
            if (r4 == 0) goto L30
            r4 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r4 = 128(0x80, float:1.8E-43)
        L32:
            r0 = r0 | r4
            r4 = r49
            boolean r5 = r8.h(r4)
            if (r5 == 0) goto L3e
            r5 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r5 = 1024(0x400, float:1.435E-42)
        L40:
            r0 = r0 | r5
            r5 = r50
            boolean r6 = r8.h(r5)
            if (r6 == 0) goto L4c
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L4e
        L4c:
            r6 = 8192(0x2000, float:1.148E-41)
        L4e:
            r0 = r0 | r6
            r6 = r51
            boolean r7 = r8.h(r6)
            if (r7 == 0) goto L5a
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L5c
        L5a:
            r7 = 65536(0x10000, float:9.1835E-41)
        L5c:
            r0 = r0 | r7
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r0
            r9 = 74898(0x12492, float:1.04954E-40)
            r11 = 1
            if (r7 == r9) goto L69
            r7 = r11
            goto L6a
        L69:
            r7 = 0
        L6a:
            r0 = r0 & r11
            boolean r0 = r8.S(r0, r7)
            if (r0 == 0) goto L32b
            java.lang.Object r0 = r8.P()
            vs0 r7 = defpackage.ox0.a
            if (r0 != r7) goto L82
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = Y(r0)
            r8.l0(r0)
        L82:
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r9 = r8.P()
            if (r9 != r7) goto L91
            nh2 r9 = defpackage.nh2.b
            mh2 r9 = defpackage.mh2.a
            r8.l0(r9)
        L91:
            mh2 r9 = (defpackage.mh2) r9
            r9.getClass()
            nh2 r9 = new nh2
            r9.<init>()
            nh2 r12 = new nh2
            r12.<init>()
            dk3 r13 = r1.c
            dk3 r15 = defpackage.dk3.CUSTOM
            if (r13 != r15) goto La8
            r13 = r11
            goto La9
        La8:
            r13 = 0
        La9:
            es7 r15 = defpackage.bl2.F(r8)
            java.lang.Object r3 = r8.P()
            if (r3 != r7) goto Lb7
            r94 r3 = defpackage.i61.f(r8)
        Lb7:
            r94 r3 = (defpackage.r94) r3
            r10 = 6
            qa4 r10 = defpackage.bw7.a(r3, r8, r10)
            r17 = 1095761920(0x41500000, float:13.0)
            y16 r11 = defpackage.z16.b(r17)
            x64 r2 = defpackage.x64.a
            r17 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r4 = defpackage.dj6.c(r2, r3)
            a74 r4 = defpackage.u24.g(r4, r11)
            java.lang.Object r19 = r10.getValue()
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            boolean r19 = r19.booleanValue()
            if (r19 == 0) goto Le3
            r20 = r4
            long r3 = r15.e
            goto Le7
        Le3:
            r20 = r4
            long r3 = r15.d
        Le7:
            jy2 r5 = defpackage.u24.m
            r6 = r20
            a74 r3 = defpackage.vy7.L(r6, r3, r5)
            java.lang.Object r4 = r10.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L103
            r4 = 1073741824(0x40000000, float:2.0)
            long r5 = r15.j
            a74 r3 = defpackage.ak7.I(r3, r4, r5, r11)
        L103:
            a74 r3 = defpackage.ak7.S(r3, r9)
            boolean r4 = r8.g(r13)
            boolean r5 = r8.f(r12)
            r4 = r4 | r5
            java.lang.Object r5 = r8.P()
            r6 = 3
            if (r4 != 0) goto L119
            if (r5 != r7) goto L121
        L119:
            g00 r5 = new g00
            r5.<init>(r13, r12, r6)
            r8.l0(r5)
        L121:
            qn2 r5 = (defpackage.qn2) r5
            a74 r3 = defpackage.ge7.y(r3, r5)
            r10 = r13
            r13 = 0
            r4 = r15
            r15 = 28
            r11 = 0
            r5 = r12
            r12 = 0
            r26 = r9
            r9 = r3
            r3 = r26
            r27 = r2
            r26 = r10
            r10 = r17
            r2 = 1
            a74 r9 = defpackage.mb3.t(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r10 = r8.P()
            if (r10 != r7) goto L14d
            eo0 r10 = new eo0
            r10.<init>(r0, r2)
            r8.l0(r10)
        L14d:
            qn2 r10 = (defpackage.qn2) r10
            a74 r9 = defpackage.u24.A(r9, r10)
            r10 = 1082130432(0x40800000, float:4.0)
            r11 = 1096810496(0x41600000, float:14.0)
            r12 = 1086324736(0x40c00000, float:6.0)
            a74 r9 = defpackage.ge7.R(r9, r11, r10, r12, r10)
            d40 r10 = defpackage.d90.i0
            du r11 = defpackage.ju.a
            r13 = 48
            l26 r10 = defpackage.k26.a(r11, r10, r8, r13)
            long r13 = r8.T
            int r11 = java.lang.Long.hashCode(r13)
            xv4 r13 = r8.l()
            a74 r9 = defpackage.l.E(r8, r9)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r8.f0()
            boolean r15 = r8.S
            if (r15 == 0) goto L187
            r8.k(r14)
            goto L18a
        L187:
            r8.o0()
        L18a:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r8, r15, r10)
            pn r10 = defpackage.ix0.e
            defpackage.yh2.K(r8, r10, r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            pn r13 = defpackage.ix0.g
            defpackage.yh2.K(r8, r13, r11)
            ne r11 = defpackage.ix0.h
            defpackage.yh2.F(r8, r11)
            r16 = r7
            pn r7 = defpackage.ix0.d
            defpackage.yh2.K(r8, r7, r9)
            vn3 r9 = new vn3
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r6, r2)
            r6 = 1090519040(0x41000000, float:8.0)
            r18 = r7
            r7 = 0
            a74 r6 = defpackage.ge7.Q(r9, r7, r6, r2)
            java.lang.String r9 = r1.b
            if (r9 != 0) goto L1bf
            java.lang.String r9 = ""
        L1bf:
            r19 = r5
            r20 = r6
            long r5 = r4.g
            nq6 r7 = defpackage.ye7.b
            java.lang.Object r7 = r8.j(r7)
            xe7 r7 = (defpackage.xe7) r7
            s47 r7 = r7.i
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 55288(0xd7f8, float:7.7475E-41)
            r21 = r7
            r22 = r8
            r23 = 0
            r7 = 0
            r28 = r3
            r3 = r9
            r9 = 0
            r29 = r10
            r10 = 0
            r30 = r11
            r31 = r12
            r11 = 0
            r32 = r13
            r13 = 0
            r33 = r14
            r34 = r15
            r14 = 0
            r35 = r16
            r16 = 2
            r36 = 3
            r17 = 0
            r37 = r18
            r18 = 1
            r38 = r19
            r19 = 0
            r39 = r4
            r4 = r20
            r20 = 0
            r40 = r23
            r23 = 0
            r52 = r0
            r41 = r29
            r43 = r30
            r42 = r32
            r45 = r35
            r44 = r37
            r0 = r39
            r1 = r40
            r2 = 2
            r29 = r28
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = r22
            if (r47 == 0) goto L24c
            r3 = -344796843(0xffffffffeb72d155, float:-2.935486E26)
            r8.b0(r3)
            e33 r3 = defpackage.jw2.r()
            long r6 = r0.l
            r0 = r27
            r4 = 1086324736(0x40c00000, float:6.0)
            a74 r1 = defpackage.ge7.Q(r0, r4, r1, r2)
            r2 = 1101004800(0x41a00000, float:20.0)
            a74 r5 = defpackage.dj6.i(r1, r2)
            r9 = 432(0x1b0, float:6.05E-43)
            r10 = 0
            r4 = 0
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r1 = 0
            r8.p(r1)
            goto L258
        L24c:
            r0 = r27
            r1 = 0
            r2 = -344539946(0xffffffffeb76bcd6, float:-2.982875E26)
            r8.b0(r2)
            r8.p(r1)
        L258:
            e40 r2 = defpackage.d90.L
            e34 r1 = defpackage.h70.d(r2, r1)
            long r2 = r8.T
            int r2 = java.lang.Long.hashCode(r2)
            xv4 r3 = r8.l()
            a74 r4 = defpackage.l.E(r8, r0)
            r8.f0()
            boolean r5 = r8.S
            if (r5 == 0) goto L27b
            r5 = r33
            r8.k(r5)
        L278:
            r5 = r34
            goto L27f
        L27b:
            r8.o0()
            goto L278
        L27f:
            defpackage.yh2.K(r8, r5, r1)
            r1 = r41
            defpackage.yh2.K(r8, r1, r3)
            r1 = r42
            r3 = r43
            defpackage.i61.w(r2, r8, r1, r8, r3)
            r1 = r44
            defpackage.yh2.K(r8, r1, r4)
            r5 = r38
            a74 r0 = defpackage.ak7.S(r0, r5)
            r3 = r29
            boolean r1 = r8.f(r3)
            java.lang.Object r2 = r8.P()
            if (r1 != 0) goto L2aa
            r1 = r45
            if (r2 != r1) goto L2b5
            goto L2ac
        L2aa:
            r1 = r45
        L2ac:
            do0 r2 = new do0
            r4 = 3
            r2.<init>(r3, r4)
            r8.l0(r2)
        L2b5:
            qn2 r2 = (defpackage.qn2) r2
            a74 r4 = defpackage.ge7.y(r0, r2)
            java.lang.Object r0 = r8.P()
            if (r0 != r1) goto L2ce
            f4 r0 = new f4
            r2 = 25
            r14 = r52
            r0.<init>(r14, r2)
            r8.l0(r0)
            goto L2d0
        L2ce:
            r14 = r52
        L2d0:
            r3 = r0
            on2 r3 = (defpackage.on2) r3
            zv0 r6 = defpackage.g04.d
            r22 = r8
            r8 = 24582(0x6006, float:3.4447E-41)
            r9 = 12
            r5 = 0
            r7 = r22
            defpackage.ej2.b(r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            java.lang.Object r0 = r14.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            java.lang.Object r0 = r8.P()
            if (r0 != r1) goto L2fc
            f4 r0 = new f4
            r1 = 26
            r0.<init>(r14, r1)
            r8.l0(r0)
        L2fc:
            r4 = r0
            on2 r4 = (defpackage.on2) r4
            xj3 r9 = new xj3
            r10 = r49
            r11 = r50
            r13 = r51
            r12 = r26
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = -1809361819(0xffffffff94275465, float:-8.447989E-27)
            zv0 r10 = defpackage.n16.I(r0, r9, r8)
            r12 = 1572912(0x180030, float:2.204119E-39)
            r5 = 0
            r6 = 0
            r22 = r8
            r8 = 0
            r9 = 0
            r11 = r22
            defpackage.ti.a(r3, r4, r5, r6, r8, r9, r10, r11, r12)
            r8 = r11
            r2 = 1
            r8.p(r2)
            r8.p(r2)
            goto L32e
        L32b:
            r8.V()
        L32e:
            cf5 r8 = r8.t()
            if (r8 == 0) goto L349
            zp1 r0 = new zp1
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L349:
            return
    }

    public static final defpackage.qa4 b0(java.lang.Object r2, defpackage.px0 r3) {
            xq2 r3 = (defpackage.xq2) r3
            java.lang.Object r0 = r3.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L11
            vs4 r0 = Y(r2)
            r3.l0(r0)
        L11:
            qa4 r0 = (defpackage.qa4) r0
            r0.setValue(r2)
            return r0
    }

    public static final void c(defpackage.qa4 r0, boolean r1) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static final java.lang.Object c0(defpackage.ut3 r3, defpackage.tt3 r4, defpackage.eo2 r5, defpackage.r41 r6) {
            tt3 r0 = defpackage.tt3.INITIALIZED
            r1 = 0
            if (r4 == r0) goto L1f
            tt3 r0 = r3.b()
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r0 != r2) goto Le
            goto L1c
        Le:
            l5 r0 = new l5
            r0.<init>(r3, r4, r5, r1)
            java.lang.Object r3 = defpackage.g04.C(r0, r6)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L1c
            return r3
        L1c:
            jg7 r3 = defpackage.jg7.a
            return r3
        L1f:
            java.lang.String r3 = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."
            defpackage.i.h(r3)
            return r1
    }

    public static final void d(defpackage.m20 r24, defpackage.on2 r25, defpackage.px0 r26, int r27) {
            r2 = r24
            r9 = r25
            r2.getClass()
            r9.getClass()
            r10 = r26
            xq2 r10 = (defpackage.xq2) r10
            r0 = -1859478006(0xffffffff912a9e0a, float:-1.3459335E-28)
            r10.d0(r0)
            boolean r0 = r10.h(r2)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r27 | r0
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L28
            r1 = 32
            goto L2a
        L28:
            r1 = 16
        L2a:
            r13 = r0 | r1
            r0 = r13 & 19
            r14 = 18
            r15 = 1
            r1 = 0
            if (r0 == r14) goto L36
            r0 = r15
            goto L37
        L36:
            r0 = r1
        L37:
            r3 = r13 & 1
            boolean r0 = r10.S(r3, r0)
            if (r0 == 0) goto L214
            nq6 r0 = defpackage.kf.b
            java.lang.Object r0 = r10.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            de5 r3 = r2.d
            qa4 r3 = defpackage.nb3.n(r3, r10)
            de5 r4 = r2.f()
            qa4 r4 = defpackage.nb3.n(r4, r10)
            c9 r5 = new c9
            r6 = 5
            r5.<init>(r6)
            java.lang.Object r6 = r10.P()
            vs0 r7 = defpackage.ox0.a
            if (r6 != r7) goto L6d
            v83 r6 = new v83
            r8 = 9
            r6.<init>(r8)
            r10.l0(r6)
        L6d:
            qn2 r6 = (defpackage.qn2) r6
            r8 = 48
            j04 r5 = defpackage.l.K(r5, r6, r10, r8)
            java.lang.Object r6 = r10.P()
            if (r6 != r7) goto L82
            w61 r6 = defpackage.mb3.w(r10)
            r10.l0(r6)
        L82:
            w61 r6 = (defpackage.w61) r6
            java.lang.Object r6 = r10.P()
            if (r6 != r7) goto L92
            r6 = 0
            vs4 r6 = Y(r6)
            r10.l0(r6)
        L92:
            qa4 r6 = (defpackage.qa4) r6
            c9 r8 = new c9
            r8.<init>(r1)
            boolean r16 = r10.h(r2)
            boolean r17 = r10.h(r0)
            r16 = r16 | r17
            java.lang.Object r14 = r10.P()
            r11 = 14
            if (r16 != 0) goto Lad
            if (r14 != r7) goto Lb5
        Lad:
            t00 r14 = new t00
            r14.<init>(r2, r0, r6, r11)
            r10.l0(r14)
        Lb5:
            qn2 r14 = (defpackage.qn2) r14
            j04 r14 = defpackage.l.K(r8, r14, r10, r1)
            c9 r8 = new c9
            r8.<init>(r15)
            boolean r16 = r10.h(r2)
            boolean r18 = r10.h(r0)
            r16 = r16 | r18
            java.lang.Object r11 = r10.P()
            if (r16 != 0) goto Ld2
            if (r11 != r7) goto Ldc
        Ld2:
            bi2 r11 = new bi2
            r15 = 12
            r11.<init>(r15, r2, r0)
            r10.l0(r11)
        Ldc:
            qn2 r11 = (defpackage.qn2) r11
            j04 r11 = defpackage.l.K(r8, r11, r10, r1)
            java.lang.Object r1 = r3.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto Lec
            yt1 r1 = defpackage.yt1.A
        Lec:
            r15 = r1
            java.lang.Object r1 = r4.getValue()
            ba6 r1 = (defpackage.ba6) r1
            java.util.UUID r1 = r1.a
            boolean r3 = r10.h(r2)
            java.lang.Object r4 = r10.P()
            if (r3 != 0) goto L101
            if (r4 != r7) goto L103
        L101:
            r3 = r0
            goto L10e
        L103:
            r9 = r0
            r21 = r1
            r12 = r7
            r19 = r13
            r20 = r15
            r13 = r5
            r15 = r6
            goto L13b
        L10e:
            a0 r0 = new a0
            r4 = r7
            r7 = 0
            r8 = 25
            r19 = r1
            r1 = 1
            r20 = r3
            java.lang.Class<m20> r3 = defpackage.m20.class
            r21 = r4
            java.lang.String r4 = "setSelectedLayoutId"
            r22 = r5
            java.lang.String r5 = "setSelectedLayoutId(Ljava/util/UUID;)V"
            r23 = r6
            r6 = 0
            r9 = r20
            r12 = r21
            r20 = r15
            r21 = r19
            r15 = r23
            r19 = r13
            r13 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.l0(r0)
            r4 = r0
        L13b:
            po2 r4 = (defpackage.po2) r4
            r22 = r4
            qn2 r22 = (defpackage.qn2) r22
            boolean r0 = r10.h(r9)
            boolean r1 = r10.h(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L152
            if (r1 != r12) goto L15b
        L152:
            t91 r1 = new t91
            r0 = 2
            r1.<init>(r9, r13, r0)
            r10.l0(r1)
        L15b:
            r17 = r1
            on2 r17 = (defpackage.on2) r17
            boolean r0 = r10.h(r11)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L16b
            if (r1 != r12) goto L174
        L16b:
            x00 r1 = new x00
            r0 = 1
            r1.<init>(r11, r0)
            r10.l0(r1)
        L174:
            r11 = r1
            on2 r11 = (defpackage.on2) r11
            boolean r0 = r10.h(r14)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L183
            if (r1 != r12) goto L18d
        L183:
            bi2 r1 = new bi2
            r0 = 13
            r1.<init>(r0, r14, r15)
            r10.l0(r1)
        L18d:
            r14 = r1
            qn2 r14 = (defpackage.qn2) r14
            boolean r0 = r10.h(r9)
            boolean r1 = r10.h(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L1a1
            if (r1 != r12) goto L1ab
        L1a1:
            bi2 r1 = new bi2
            r0 = 14
            r1.<init>(r0, r9, r13)
            r10.l0(r1)
        L1ab:
            r9 = r1
            qn2 r9 = (defpackage.qn2) r9
            boolean r0 = r10.h(r2)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L1ba
            if (r1 != r12) goto L1ce
        L1ba:
            a0 r0 = new a0
            r7 = 0
            r8 = 26
            r1 = 1
            java.lang.Class<m20> r3 = defpackage.m20.class
            java.lang.String r4 = "deleteLayout"
            java.lang.String r5 = "deleteLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.l0(r0)
            r1 = r0
        L1ce:
            po2 r1 = (defpackage.po2) r1
            r13 = r1
            qn2 r13 = (defpackage.qn2) r13
            boolean r0 = r10.h(r2)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L1e2
            if (r1 != r12) goto L1e0
            goto L1e2
        L1e0:
            r12 = r2
            goto L1f7
        L1e2:
            a0 r0 = new a0
            r7 = 0
            r8 = 27
            r1 = 1
            java.lang.Class<m20> r3 = defpackage.m20.class
            java.lang.String r4 = "addLayout"
            java.lang.String r5 = "addLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = r2
            r10.l0(r0)
            r1 = r0
        L1f7:
            po2 r1 = (defpackage.po2) r1
            r8 = r1
            qn2 r8 = (defpackage.qn2) r8
            int r0 = r19 << 24
            r1 = 1879048192(0x70000000, float:1.5845633E29)
            r0 = r0 & r1
            r6 = r9
            r4 = r11
            r7 = r13
            r5 = r14
            r3 = r17
            r1 = r21
            r2 = r22
            r9 = r25
            r11 = r0
            r0 = r20
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L218
        L214:
            r12 = r2
            r10.V()
        L218:
            cf5 r0 = r10.t()
            if (r0 == 0) goto L229
            ql1 r1 = new ql1
            r2 = r27
            r3 = 18
            r1.<init>(r12, r2, r3, r9)
            r0.d = r1
        L229:
            return
    }

    public static final java.lang.Object d0(defpackage.hu3 r0, defpackage.tt3 r1, defpackage.eo2 r2, defpackage.hw6 r3) {
            ut3 r0 = r0.getLifecycle()
            java.lang.Object r0 = c0(r0, r1, r2, r3)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Ld
            return r0
        Ld:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static final void e(java.util.List r23, java.util.UUID r24, defpackage.qn2 r25, defpackage.on2 r26, defpackage.on2 r27, defpackage.qn2 r28, defpackage.qn2 r29, defpackage.qn2 r30, defpackage.qn2 r31, defpackage.on2 r32, defpackage.px0 r33, int r34) {
            r4 = r26
            r5 = r27
            r11 = r34
            r0 = r33
            xq2 r0 = (defpackage.xq2) r0
            r1 = -1521231061(0xffffffffa553db2b, float:-1.837559E-16)
            r0.d0(r1)
            r1 = r11 & 6
            r14 = r23
            if (r1 != 0) goto L21
            boolean r1 = r0.h(r14)
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = 2
        L1f:
            r1 = r1 | r11
            goto L22
        L21:
            r1 = r11
        L22:
            r2 = r11 & 48
            r15 = r24
            if (r2 != 0) goto L34
            boolean r2 = r0.h(r15)
            if (r2 == 0) goto L31
            r2 = 32
            goto L33
        L31:
            r2 = 16
        L33:
            r1 = r1 | r2
        L34:
            r2 = r11 & 384(0x180, float:5.38E-43)
            r3 = r25
            if (r2 != 0) goto L46
            boolean r2 = r0.h(r3)
            if (r2 == 0) goto L43
            r2 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r2 = 128(0x80, float:1.8E-43)
        L45:
            r1 = r1 | r2
        L46:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L56
            boolean r2 = r0.h(r4)
            if (r2 == 0) goto L53
            r2 = 2048(0x800, float:2.87E-42)
            goto L55
        L53:
            r2 = 1024(0x400, float:1.435E-42)
        L55:
            r1 = r1 | r2
        L56:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L66
            boolean r2 = r0.h(r5)
            if (r2 == 0) goto L63
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L65
        L63:
            r2 = 8192(0x2000, float:1.148E-41)
        L65:
            r1 = r1 | r2
        L66:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r11
            r6 = r28
            if (r2 != 0) goto L79
            boolean r2 = r0.h(r6)
            if (r2 == 0) goto L76
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L78
        L76:
            r2 = 65536(0x10000, float:9.1835E-41)
        L78:
            r1 = r1 | r2
        L79:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r11
            r7 = r29
            if (r2 != 0) goto L8c
            boolean r2 = r0.h(r7)
            if (r2 == 0) goto L89
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L8b
        L89:
            r2 = 524288(0x80000, float:7.34684E-40)
        L8b:
            r1 = r1 | r2
        L8c:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r11
            r8 = r30
            if (r2 != 0) goto L9f
            boolean r2 = r0.h(r8)
            if (r2 == 0) goto L9c
            r2 = 8388608(0x800000, float:1.1754944E-38)
            goto L9e
        L9c:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L9e:
            r1 = r1 | r2
        L9f:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 & r11
            if (r2 != 0) goto Lb3
            r2 = r31
            boolean r10 = r0.h(r2)
            if (r10 == 0) goto Laf
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb1
        Laf:
            r10 = 33554432(0x2000000, float:9.403955E-38)
        Lb1:
            r1 = r1 | r10
            goto Lb5
        Lb3:
            r2 = r31
        Lb5:
            r10 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r10 & r11
            if (r10 != 0) goto Lc9
            r10 = r32
            boolean r12 = r0.h(r10)
            if (r12 == 0) goto Lc5
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lc7
        Lc5:
            r12 = 268435456(0x10000000, float:2.524355E-29)
        Lc7:
            r1 = r1 | r12
            goto Lcb
        Lc9:
            r10 = r32
        Lcb:
            r12 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r12 & r1
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r9 = 1
            if (r12 == r13) goto Ld7
            r12 = r9
            goto Ld8
        Ld7:
            r12 = 0
        Ld8:
            r13 = r1 & 1
            boolean r12 = r0.S(r13, r12)
            if (r12 == 0) goto L1bf
            java.lang.Object r12 = r0.P()
            vs0 r13 = defpackage.ox0.a
            if (r12 != r13) goto Lf0
            gl6 r12 = new gl6
            r12.<init>()
            r0.l0(r12)
        Lf0:
            gl6 r12 = (defpackage.gl6) r12
            x56 r21 = defpackage.v56.d(r12, r0, r9)
            java.lang.Object r9 = r0.P()
            if (r9 != r13) goto L104
            nh2 r9 = new nh2
            r9.<init>()
            r0.l0(r9)
        L104:
            nh2 r9 = (defpackage.nh2) r9
            r22 = r1
            java.lang.Object r1 = r0.P()
            if (r1 != r13) goto L11c
            r1 = 10
            m80 r2 = defpackage.m80.DROP_OLDEST
            r3 = 0
            r6 = 1
            of6 r1 = defpackage.pf6.b(r3, r1, r2, r6)
            r0.l0(r1)
            goto L11e
        L11c:
            r3 = 0
            r6 = 1
        L11e:
            r19 = r1
            na4 r19 = (defpackage.na4) r19
            java.lang.Object r1 = r0.P()
            if (r1 != r13) goto L131
            sn0 r1 = new sn0
            r2 = 0
            r1.<init>(r9, r2, r6)
            r0.l0(r1)
        L131:
            eo2 r1 = (defpackage.eo2) r1
            jg7 r2 = defpackage.jg7.a
            defpackage.mb3.i(r0, r1, r2)
            es7 r1 = defpackage.bl2.F(r0)
            r2 = 2131952141(0x7f13020d, float:1.9540716E38)
            java.lang.String r2 = defpackage.yh2.O(r0, r2)
            x3 r3 = new x3
            r6 = 21
            r3.<init>(r5, r4, r1, r6)
            r1 = -1932144230(0xffffffff8cd5d19a, float:-3.2943996E-31)
            zv0 r1 = defpackage.n16.I(r1, r3, r0)
            r3 = r12
            xn3 r12 = new xn3
            r16 = r25
            r18 = r28
            r17 = r7
            r20 = r8
            r6 = r13
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r7 = r19
            r8 = -583846817(0xffffffffdd33345f, float:-8.0706566E17)
            zv0 r18 = defpackage.n16.I(r8, r12, r0)
            int r8 = r22 >> 24
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 1597440(0x186000, float:2.23849E-39)
            r20 = r8 | r9
            r17 = r21
            r21 = 12
            r14 = 0
            r15 = 0
            r19 = r0
            r16 = r1
            r12 = r2
            r13 = r10
            defpackage.ps7.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            py0 r1 = defpackage.kf.c
            java.lang.Object r1 = r0.j(r1)
            r15 = r1
            android.content.res.Resources r15 = (android.content.res.Resources) r15
            boolean r1 = r0.h(r7)
            boolean r2 = r0.h(r15)
            r1 = r1 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r22 & r2
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 != r8) goto L19e
            r9 = 1
            goto L19f
        L19e:
            r9 = 0
        L19f:
            r1 = r1 | r9
            java.lang.Object r2 = r0.P()
            if (r1 != 0) goto L1a8
            if (r2 != r6) goto L1b9
        L1a8:
            l5 r12 = new l5
            r17 = 0
            r18 = 20
            r16 = r31
            r14 = r3
            r13 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.l0(r12)
            r2 = r12
        L1b9:
            eo2 r2 = (defpackage.eo2) r2
            defpackage.mb3.i(r0, r2, r7)
            goto L1c2
        L1bf:
            r0.V()
        L1c2:
            cf5 r12 = r0.t()
            if (r12 == 0) goto L1df
            yn3 r0 = new yn3
            r1 = r23
            r2 = r24
            r3 = r25
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.d = r0
        L1df:
            return
    }

    public static final long e0(defpackage.of5 r6) {
            float r0 = r6.c
            float r1 = r6.a
            float r0 = r0 - r1
            float r1 = r6.d
            float r6 = r6.b
            float r1 = r1 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final void f(defpackage.a74 r29, defpackage.lq4 r30, java.util.List r31, defpackage.qn2 r32, defpackage.px0 r33, int r34) {
            r2 = r30
            r3 = r31
            r4 = r32
            r14 = r33
            xq2 r14 = (defpackage.xq2) r14
            r0 = -1123439552(0xffffffffbd09ac40, float:-0.033611536)
            r14.d0(r0)
            boolean r0 = r14.f(r2)
            if (r0 == 0) goto L19
            r0 = 32
            goto L1b
        L19:
            r0 = 16
        L1b:
            r0 = r34 | r0
            boolean r1 = r14.h(r3)
            if (r1 == 0) goto L26
            r1 = 256(0x100, float:3.59E-43)
            goto L28
        L26:
            r1 = 128(0x80, float:1.8E-43)
        L28:
            r0 = r0 | r1
            boolean r1 = r14.h(r4)
            r5 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L33
            r1 = r5
            goto L35
        L33:
            r1 = 1024(0x400, float:1.435E-42)
        L35:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 1
            r8 = 0
            if (r1 == r6) goto L40
            r1 = r7
            goto L41
        L40:
            r1 = r8
        L41:
            r6 = r0 & 1
            boolean r1 = r14.S(r6, r1)
            if (r1 == 0) goto L167
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lef
            r0 = -2002361285(0xffffffff88a6643b, float:-1.0014326E-33)
            r14.b0(r0)
            a74 r0 = defpackage.ge7.N(r29, r30)
            e40 r1 = defpackage.d90.L
            e34 r1 = defpackage.h70.d(r1, r8)
            long r5 = r14.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r14.l()
            a74 r0 = defpackage.l.E(r14, r0)
            ix0 r9 = defpackage.jx0.i
            r9.getClass()
            iy0 r9 = defpackage.ix0.b
            r14.f0()
            boolean r10 = r14.S
            if (r10 == 0) goto L7f
            r14.k(r9)
            goto L82
        L7f:
            r14.o0()
        L82:
            pn r9 = defpackage.ix0.f
            defpackage.yh2.K(r14, r9, r1)
            pn r1 = defpackage.ix0.e
            defpackage.yh2.K(r14, r1, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r14, r5, r1)
            ne r1 = defpackage.ix0.h
            defpackage.yh2.F(r14, r1)
            pn r1 = defpackage.ix0.d
            defpackage.yh2.K(r14, r1, r0)
            vs0 r0 = defpackage.vs0.Y
            x64 r1 = defpackage.x64.a
            r5 = 1103101952(0x41c00000, float:24.0)
            a74 r1 = defpackage.ge7.O(r1, r5)
            e40 r5 = defpackage.d90.Z
            a74 r6 = r0.n(r1, r5)
            r0 = 2131952292(0x7f1302a4, float:1.9541023E38)
            java.lang.String r5 = defpackage.yh2.O(r14, r0)
            wz6 r15 = new wz6
            r0 = 3
            r15.<init>(r0)
            r26 = 0
            r27 = 130556(0x1fdfc, float:1.82948E-40)
            r0 = r7
            r1 = r8
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r24 = r14
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r28 = r1
            r1 = r0
            r0 = r28
            defpackage.x37.b(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14 = r24
            r14.p(r1)
            r14.p(r0)
            goto L16a
        Lef:
            r1 = r7
            r6 = r8
            r7 = -2002034731(0xffffffff88ab5fd5, float:-1.0314218E-33)
            r14.b0(r7)
            a74 r7 = defpackage.q60.s(r29, r30)
            gu r8 = new gu
            i r9 = new i
            r9.<init>(r1)
            r10 = 1090519040(0x41000000, float:8.0)
            r8.<init>(r10, r1, r9)
            nq6 r9 = defpackage.ky0.n
            java.lang.Object r10 = r14.j(r9)
            kk3 r10 = (defpackage.kk3) r10
            float r10 = defpackage.ge7.r(r2, r10)
            r11 = 1098907648(0x41800000, float:16.0)
            float r10 = r10 + r11
            float r12 = r2.d()
            r13 = 1094713344(0x41400000, float:12.0)
            float r12 = r12 + r13
            java.lang.Object r9 = r14.j(r9)
            kk3 r9 = (defpackage.kk3) r9
            float r9 = defpackage.ge7.q(r2, r9)
            float r9 = r9 + r11
            float r13 = r2.a()
            float r13 = r13 + r11
            r11 = r7
            pq4 r7 = new pq4
            r7.<init>(r10, r12, r9, r13)
            boolean r9 = r14.h(r3)
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != r5) goto L13c
            goto L13d
        L13c:
            r1 = r6
        L13d:
            r0 = r9 | r1
            java.lang.Object r1 = r14.P()
            if (r0 != 0) goto L149
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L152
        L149:
            t32 r1 = new t32
            r0 = 2
            r1.<init>(r3, r4, r0)
            r14.l0(r1)
        L152:
            r13 = r1
            qn2 r13 = (defpackage.qn2) r13
            r15 = 24576(0x6000, float:3.4438E-41)
            r16 = 490(0x1ea, float:6.87E-43)
            r0 = r6
            r6 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            r11 = 0
            r12 = 0
            defpackage.gi2.e(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14.p(r0)
            goto L16a
        L167:
            r14.V()
        L16a:
            cf5 r7 = r14.t()
            if (r7 == 0) goto L17c
            u32 r0 = new u32
            r6 = 1
            r1 = r29
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L17c:
            return
    }

    public static final defpackage.g21 f0(defpackage.on2 r2) {
            ji r0 = new ji
            r1 = 0
            r0.<init>(r2, r1)
            g21 r2 = new g21
            r1 = 7
            r2.<init>(r0, r1)
            return r2
    }

    public static final void g(defpackage.a74 r10, defpackage.zv0 r11, defpackage.px0 r12, int r13) {
            xq2 r12 = (defpackage.xq2) r12
            r0 = 790527681(0x2f1e7ec1, float:1.4415048E-10)
            r12.d0(r0)
            r0 = r13 & 6
            r1 = 4
            r2 = 2
            if (r0 != 0) goto L19
            boolean r0 = r12.f(r10)
            if (r0 == 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            r0 = r0 | r13
            goto L1a
        L19:
            r0 = r13
        L1a:
            r3 = r13 & 48
            if (r3 != 0) goto L2a
            boolean r3 = r12.h(r11)
            if (r3 == 0) goto L27
            r3 = 32
            goto L29
        L27:
            r3 = 16
        L29:
            r0 = r0 | r3
        L2a:
            r3 = r0 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L33
            r3 = r5
            goto L34
        L33:
            r3 = 0
        L34:
            r0 = r0 & r5
            boolean r0 = r12.S(r0, r3)
            if (r0 == 0) goto L95
            java.lang.Object r0 = r12.P()
            vs0 r3 = defpackage.ox0.a
            if (r0 != r3) goto L4f
            vs0 r0 = defpackage.vs0.j0
            vs4 r4 = new vs4
            r5 = 0
            r4.<init>(r5, r0)
            r12.l0(r4)
            r0 = r4
        L4f:
            r6 = r0
            qa4 r6 = (defpackage.qa4) r6
            java.lang.Object r0 = r12.P()
            if (r0 != r3) goto L61
            oe4 r0 = new oe4
            r3 = 3
            r0.<init>(r6, r3)
            r12.l0(r0)
        L61:
            r9 = r0
            on2 r9 = (defpackage.on2) r9
            g05 r0 = defpackage.vf1.a
            zv0 r0 = defpackage.nc1.f
            r3 = 6
            h30 r8 = defpackage.nc1.E(r0, r12, r3)
            hm r0 = defpackage.f04.L(r9, r12, r2)
            py0 r2 = defpackage.v07.b
            pq r0 = r2.a(r0)
            py0 r2 = defpackage.v07.a
            pq r2 = r2.a(r8)
            pq[] r0 = new defpackage.pq[]{r0, r2}
            ne4 r4 = new ne4
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 1070596993(0x3fd00381, float:1.6251069)
            zv0 r10 = defpackage.n16.I(r10, r4, r12)
            r11 = 56
            defpackage.hv.e(r0, r10, r12, r11)
            goto L9a
        L95:
            r5 = r10
            r7 = r11
            r12.V()
        L9a:
            cf5 r10 = r12.t()
            if (r10 == 0) goto La7
            im r11 = new im
            r11.<init>(r5, r7, r13, r1)
            r10.d = r11
        La7:
            return
    }

    public static final defpackage.wl5 g0(defpackage.wl5 r5) {
            r5.getClass()
            ul5 r0 = r5.h()
            vg7 r1 = new vg7
            yl5 r5 = r5.Z
            n34 r2 = r5.k()
            long r3 = r5.h()
            r1.<init>(r2, r3)
            r0.g = r1
            wl5 r5 = r0.a()
            return r5
    }

    public static final void h(defpackage.a74 r10, defpackage.zv0 r11, defpackage.px0 r12, int r13) {
            xq2 r12 = (defpackage.xq2) r12
            r0 = 155925518(0x94b3c0e, float:2.4463474E-33)
            r12.d0(r0)
            r0 = r13 & 6
            if (r0 != 0) goto L17
            boolean r0 = r12.f(r10)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r13
            goto L18
        L17:
            r0 = r13
        L18:
            r1 = r13 & 48
            if (r1 != 0) goto L28
            boolean r1 = r12.h(r11)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L32
            r1 = r4
            goto L33
        L32:
            r1 = r3
        L33:
            r2 = r0 & 1
            boolean r1 = r12.S(r2, r1)
            r2 = 3
            if (r1 == 0) goto Le4
            py0 r1 = defpackage.v07.a
            java.lang.Object r1 = r12.j(r1)
            if (r1 == 0) goto L46
            r1 = r4
            goto L47
        L46:
            r1 = r3
        L47:
            py0 r5 = defpackage.v07.b
            java.lang.Object r5 = r12.j(r5)
            if (r5 == 0) goto L51
            r5 = r4
            goto L52
        L51:
            r5 = r3
        L52:
            if (r1 == 0) goto Lb3
            if (r5 == 0) goto Lb3
            r1 = -1977187922(0xffffffff8a2681ae, float:-8.016999E-33)
            r12.b0(r1)
            e40 r1 = defpackage.d90.L
            e34 r1 = defpackage.h70.d(r1, r4)
            long r5 = r12.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r12.l()
            a74 r7 = defpackage.l.E(r12, r10)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r12.f0()
            boolean r9 = r12.S
            if (r9 == 0) goto L82
            r12.k(r8)
            goto L85
        L82:
            r12.o0()
        L85:
            pn r8 = defpackage.ix0.f
            defpackage.yh2.K(r12, r8, r1)
            pn r1 = defpackage.ix0.e
            defpackage.yh2.K(r12, r1, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r12, r5, r1)
            ne r1 = defpackage.ix0.h
            defpackage.yh2.F(r12, r1)
            pn r1 = defpackage.ix0.d
            defpackage.yh2.K(r12, r1, r7)
            int r0 = r0 >> r2
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.o(r12, r0)
            r12.p(r4)
            r12.p(r3)
            goto Le7
        Lb3:
            if (r1 == 0) goto Lc4
            r1 = -1976997706(0xffffffff8a2968b6, float:-8.156748E-33)
            r12.b0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            defpackage.f04.k(r10, r11, r12, r0)
            r12.p(r3)
            goto Le7
        Lc4:
            if (r5 == 0) goto Ld5
            r1 = -1976846922(0xffffffff8a2bb5b6, float:-8.2675265E-33)
            r12.b0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            defpackage.vf1.d(r10, r11, r12, r0)
            r12.p(r3)
            goto Le7
        Ld5:
            r1 = -1976716505(0xffffffff8a2db327, float:-8.363342E-33)
            r12.b0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            g(r10, r11, r12, r0)
            r12.p(r3)
            goto Le7
        Le4:
            r12.V()
        Le7:
            cf5 r12 = r12.t()
            if (r12 == 0) goto Lf4
            im r0 = new im
            r0.<init>(r10, r11, r13, r2)
            r12.d = r0
        Lf4:
            return
    }

    public static final defpackage.x61 h0(java.lang.Throwable r5, defpackage.r41 r6) {
            boolean r0 = r6 instanceof defpackage.si3
            if (r0 == 0) goto L13
            r0 = r6
            si3 r0 = (defpackage.si3) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            si3 r0 = new si3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L31
            r5 = 0
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r5
        L2a:
            defpackage.oi2.Y(r6)
            defpackage.e41.c()
            return r5
        L31:
            defpackage.oi2.Y(r6)
            r0.X = r3
            xe1 r6 = defpackage.xk1.a
            l61 r2 = r0.B
            r2.getClass()
            uo2 r3 = new uo2
            r4 = 11
            r3.<init>(r4, r0, r5)
            r6.j0(r2, r3)
            return r1
    }

    public static final defpackage.ns6 i(defpackage.id3 r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            td3 r1 = r1.a
            ns6 r0 = new ns6
            r0.<init>(r2, r1)
            return r0
    }

    public static defpackage.wl7 i0(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toLowerCase(r0)
            r0.getClass()
            int r1 = r0.hashCode()
            if (r1 == 0) goto L3e
            r2 = 3633(0xe31, float:5.091E-42)
            if (r1 == r2) goto L33
            r2 = 3020272(0x2e15f0, float:4.232303E-39)
            if (r1 == r2) goto L28
            r2 = 92909918(0x589b15e, float:1.2948572E-35)
            if (r1 != r2) goto L49
            java.lang.String r1 = "alpha"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            wl7 r3 = defpackage.wl7.ALPHA
            return r3
        L28:
            java.lang.String r1 = "beta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            wl7 r3 = defpackage.wl7.BETA
            return r3
        L33:
            java.lang.String r1 = "rc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            wl7 r3 = defpackage.wl7.RC
            return r3
        L3e:
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            wl7 r3 = defpackage.wl7.FINAL
            return r3
        L49:
            java.lang.String r0 = "Unknown release qualifier: "
            java.lang.String r3 = r0.concat(r3)
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public static final java.lang.Long j(defpackage.xc5 r2) {
            uc5 r0 = defpackage.uc5.a
            boolean r0 = defpackage.nb3.k(r2, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r2 instanceof defpackage.tc5
            if (r0 == 0) goto L17
            tc5 r2 = (defpackage.tc5) r2
            long r0 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L17:
            boolean r0 = r2 instanceof defpackage.wc5
            if (r0 == 0) goto L24
            wc5 r2 = (defpackage.wc5) r2
            long r0 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L24:
            boolean r0 = r2 instanceof defpackage.vc5
            if (r0 == 0) goto L31
            vc5 r2 = (defpackage.vc5) r2
            long r0 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L31:
            defpackage.i.d()
            return r1
    }

    public static final java.lang.String j0(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = " could not find any NavType for argument "
            java.lang.String r1 = " of type "
            java.lang.String r2 = "Route "
            java.lang.StringBuilder r3 = defpackage.i61.u(r2, r5, r0, r3, r1)
            r3.append(r4)
            java.lang.String r4 = " - typeMap received was "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static final defpackage.sc5 k(defpackage.mc5 r1) {
            int[] r0 = defpackage.rc5.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 != r0) goto L11
            sc5 r1 = defpackage.sc5.TERMINAL_EXIT
            return r1
        L11:
            defpackage.i.d()
            r1 = 0
            return r1
        L16:
            sc5 r1 = defpackage.sc5.RESUMABLE_EXIT
            return r1
    }

    public static java.lang.Object k0(defpackage.eo2 r2, java.lang.Object r3, defpackage.r41 r4) {
            r2.getClass()
            l61 r0 = r4.b()
            vt1 r1 = defpackage.vt1.A
            if (r0 != r1) goto L11
            qb3 r0 = new qb3
            r0.<init>(r4)
            goto L17
        L11:
            rb3 r1 = new rb3
            r1.<init>(r4, r0)
            r0 = r1
        L17:
            r4 = 2
            defpackage.ge7.p(r4, r2)
            java.lang.Object r2 = r2.o(r3, r0)
            return r2
    }

    public static final float l(long r7) {
            r0 = 32
            long r0 = r7 >> r0
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 != 0) goto L1f
            long r5 = r7 & r3
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L1f
            return r2
        L1f:
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r7 = r7 & r3
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            double r0 = (double) r0
            double r7 = (double) r7
            double r7 = java.lang.Math.atan2(r0, r7)
            float r7 = (float) r7
            float r7 = -r7
            r8 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 * r8
            r8 = 1078530011(0x40490fdb, float:3.1415927)
            float r7 = r7 / r8
            return r7
    }

    public static final java.util.List m(defpackage.q61 r19, int r20, int r21, java.util.ArrayList r22, defpackage.o94 r23, int r24, int r25, int r26, defpackage.qn2 r27) {
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            if (r19 == 0) goto L141
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L141
            int r4 = r2.b
            if (r4 == 0) goto L141
            int r5 = r21 - r0
            r6 = -1
            r7 = 0
            if (r5 < 0) goto L48
            if (r4 != 0) goto L1d
            goto L48
        L1d:
            l93 r4 = defpackage.gi2.R(r7, r4)
            int r5 = r4.A
            int r4 = r4.B
            r8 = r6
            if (r5 > r4) goto L37
        L28:
            int r9 = r2.c(r5)
            if (r9 > r0) goto L37
            int r8 = r2.c(r5)
            if (r5 == r4) goto L37
            int r5 = r5 + 1
            goto L28
        L37:
            if (r8 != r6) goto L3c
            o94 r0 = defpackage.f93.a
            goto L4a
        L3c:
            o94 r0 = defpackage.f93.a
            o94 r0 = new o94
            r4 = 1
            r0.<init>(r4)
            r0.a(r8)
            goto L4a
        L48:
            o94 r0 = defpackage.f93.a
        L4a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r8 = r1.size()
            r5.<init>(r8)
            int r8 = r1.size()
            r9 = r7
        L5d:
            if (r9 >= r8) goto L7f
            java.lang.Object r10 = r1.get(r9)
            r11 = r10
            gq3 r11 = (defpackage.gq3) r11
            int r11 = r11.getIndex()
            int[] r12 = r2.a
            int r13 = r2.b
            r14 = r7
        L6f:
            if (r14 >= r13) goto L7c
            r15 = r12[r14]
            if (r15 != r11) goto L79
            r5.add(r10)
            goto L7c
        L79:
            int r14 = r14 + 1
            goto L6f
        L7c:
            int r9 = r9 + 1
            goto L5d
        L7f:
            int[] r2 = r0.a
            int r0 = r0.b
            r8 = r7
        L84:
            if (r8 >= r0) goto L140
            r9 = r2[r8]
            int r10 = r1.size()
            r11 = r7
            r12 = r11
        L8e:
            if (r12 >= r10) goto La2
            java.lang.Object r13 = r1.get(r12)
            int r12 = r12 + 1
            gq3 r13 = (defpackage.gq3) r13
            int r13 = r13.getIndex()
            if (r13 != r9) goto L9f
            goto La3
        L9f:
            int r11 = r11 + 1
            goto L8e
        La2:
            r11 = r6
        La3:
            if (r11 != r6) goto Lb2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = r27
            java.lang.Object r10 = r12.g(r10)
            gq3 r10 = (defpackage.gq3) r10
            goto Lba
        Lb2:
            r12 = r27
            java.lang.Object r10 = r1.remove(r11)
            gq3 r10 = (defpackage.gq3) r10
        Lba:
            int r13 = r10.b()
            r19 = 32
            if (r11 != r6) goto Lca
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Le5
        Lca:
            long r17 = r10.h(r7)
            boolean r11 = r10.e()
            if (r11 == 0) goto Ldd
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r17 & r20
        Ldb:
            int r11 = (int) r14
            goto Le5
        Ldd:
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r17 >> r19
            goto Ldb
        Le5:
            int r14 = r5.size()
            r15 = r7
        Lea:
            if (r15 >= r14) goto Lff
            java.lang.Object r16 = r5.get(r15)
            r17 = r16
            gq3 r17 = (defpackage.gq3) r17
            int r6 = r17.getIndex()
            if (r6 == r9) goto Lfb
            goto L101
        Lfb:
            int r15 = r15 + 1
            r6 = -1
            goto Lea
        Lff:
            r16 = 0
        L101:
            r6 = r16
            gq3 r6 = (defpackage.gq3) r6
            if (r6 == 0) goto L11b
            long r14 = r6.h(r7)
            boolean r6 = r6.e()
            if (r6 == 0) goto L115
            long r14 = r14 & r20
        L113:
            int r6 = (int) r14
            goto L118
        L115:
            long r14 = r14 >> r19
            goto L113
        L118:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L11e
        L11b:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L118
        L11e:
            if (r11 != r9) goto L122
            int r11 = -r3
            goto L127
        L122:
            int r14 = -r3
            int r11 = java.lang.Math.max(r14, r11)
        L127:
            if (r6 == r9) goto L12e
            int r6 = r6 - r13
            int r11 = java.lang.Math.min(r11, r6)
        L12e:
            r10.f()
            r6 = r25
            r9 = r26
            r10.g(r11, r6, r9)
            r4.add(r10)
            int r8 = r8 + 1
            r6 = -1
            goto L84
        L140:
            return r4
        L141:
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    public static final java.lang.Object n(defpackage.gb0 r3, defpackage.r41 r4) {
            rj0 r0 = new rj0
            r41 r4 = V(r4)
            r1 = 1
            r0.<init>(r1, r4)
            r0.v()
            ri3 r4 = new ri3
            r2 = 0
            r4.<init>(r3, r2)
            r0.z(r4)
            sp2 r4 = new sp2
            r4.<init>(r0, r1)
            r3.h(r4)
            java.lang.Object r3 = r0.s()
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            return r3
    }

    public static final java.lang.Object o(defpackage.gb0 r2, defpackage.r41 r3) {
            rj0 r0 = new rj0
            r41 r3 = V(r3)
            r1 = 1
            r0.<init>(r1, r3)
            r0.v()
            ri3 r3 = new ri3
            r3.<init>(r2, r1)
            r0.z(r3)
            sp2 r3 = new sp2
            r1 = 2
            r3.<init>(r0, r1)
            r2.h(r3)
            java.lang.Object r2 = r0.s()
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r2
    }

    public static void p(defpackage.qu6 r4, java.lang.Object[] r5) {
            if (r5 != 0) goto L4
            goto Lb5
        L4:
            int r0 = r5.length
            r1 = 0
        L6:
            if (r1 >= r0) goto Lb5
            r2 = r5[r1]
            int r1 = r1 + 1
            if (r2 != 0) goto L12
            r4.f(r1)
            goto L6
        L12:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L1c
            byte[] r2 = (byte[]) r2
            r4.d(r2, r1)
            goto L6
        L1c:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L2b
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            double r2 = (double) r2
            r4.p(r1, r2)
            goto L6
        L2b:
            boolean r3 = r2 instanceof java.lang.Double
            if (r3 == 0) goto L39
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r4.p(r1, r2)
            goto L6
        L39:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L47
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r4.c(r1, r2)
            goto L6
        L47:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L56
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            r4.c(r1, r2)
            goto L6
        L56:
            boolean r3 = r2 instanceof java.lang.Short
            if (r3 == 0) goto L65
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            long r2 = (long) r2
            r4.c(r1, r2)
            goto L6
        L65:
            boolean r3 = r2 instanceof java.lang.Byte
            if (r3 == 0) goto L74
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            long r2 = (long) r2
            r4.c(r1, r2)
            goto L6
        L74:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L7e
            java.lang.String r2 = (java.lang.String) r2
            r4.m(r1, r2)
            goto L6
        L7e:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L94
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8d
            r2 = 1
            goto L8f
        L8d:
            r2 = 0
        L8f:
            r4.c(r1, r2)
            goto L6
        L94:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot bind "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r0 = " at index "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lb5:
            return
    }

    public static final long q(defpackage.oy4 r7, boolean r8, defpackage.qn2 r9) {
            java.util.List r7 = r7.a
            int r0 = r7.size()
            r1 = 0
            r3 = 0
            r4 = r3
        La:
            if (r3 >= r0) goto L2e
            java.lang.Object r5 = r7.get(r3)
            vy4 r5 = (defpackage.vy4) r5
            java.lang.Object r6 = r9.g(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2b
            if (r8 == 0) goto L23
            long r5 = r5.c
            goto L25
        L23:
            long r5 = r5.g
        L25:
            long r1 = defpackage.jk4.f(r1, r5)
            int r4 = r4 + 1
        L2b:
            int r3 = r3 + 1
            goto La
        L2e:
            if (r4 != 0) goto L36
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r7
        L36:
            float r7 = (float) r4
            long r7 = defpackage.jk4.b(r7, r1)
            return r7
    }

    public static final float r(defpackage.oy4 r8, boolean r9) {
            h37 r0 = new h37
            r1 = 7
            r0.<init>(r1)
            long r0 = q(r8, r9, r0)
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r2 = defpackage.jk4.c(r0, r2)
            r3 = 0
            if (r2 == 0) goto L17
            return r3
        L17:
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L1f:
            if (r4 >= r2) goto L45
            java.lang.Object r6 = r8.get(r4)
            vy4 r6 = (defpackage.vy4) r6
            boolean r7 = r6.d
            if (r7 == 0) goto L42
            boolean r7 = r6.h
            if (r7 == 0) goto L42
            if (r9 == 0) goto L34
            long r6 = r6.c
            goto L36
        L34:
            long r6 = r6.g
        L36:
            long r6 = defpackage.jk4.e(r6, r0)
            float r6 = defpackage.jk4.d(r6)
            float r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r6
        L42:
            int r4 = r4 + 1
            goto L1f
        L45:
            float r8 = (float) r5
            float r3 = r3 / r8
            return r3
    }

    public static void s(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            defpackage.i.h(r0)
            return
    }

    public static void t(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.t()
            return
    }

    public static void u(int r3, int r4, int r5, java.lang.String r6) {
            java.lang.String r0 = ", "
            java.lang.String r1 = " is out of range of ["
            if (r3 < r4) goto L2e
            if (r3 > r5) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r4 = "] (too high)"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r4 = "] (too low)"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            throw r3
    }

    public static void v(int r0) {
            if (r0 < 0) goto L3
            return
        L3:
            defpackage.u34.t()
            return
    }

    public static final void w(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 >= r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r0, r2, r3, r1)
            defpackage.e41.q(r2)
            return
    }

    public static void x(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.x(r1)
            return
    }

    public static final void y(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r0, r2, r3, r1)
            defpackage.e41.q(r2)
            return
    }

    public static final void z(int r3, int r4, int r5) {
            java.lang.String r0 = "fromIndex: "
            if (r3 < 0) goto L13
            if (r4 > r5) goto L13
            if (r3 > r4) goto L9
            return
        L9:
            java.lang.String r5 = " > toIndex: "
            java.lang.String r3 = defpackage.lb1.j(r0, r3, r4, r5)
            defpackage.i.h(r3)
            return
        L13:
            java.lang.String r1 = ", toIndex: "
            java.lang.String r2 = ", size: "
            java.lang.StringBuilder r3 = defpackage.i61.q(r3, r4, r0, r1, r2)
            defpackage.u34.q(r3, r5)
            return
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 20: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.hashCode()
            return r1
        La:
            java.lang.String r1 = r1.toString()
            int r1 = r1.hashCode()
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 20: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Class r1 = r1.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            r1.getClass()
            return r1
    }
}
