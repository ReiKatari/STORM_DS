package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: k63  reason: default package */
/* loaded from: classes.dex */
public final class k63 {
    public static final defpackage.k63.d Companion = null;
    public static final defpackage.go3[] d = null;
    public final defpackage.b63 a;
    public final defpackage.k63.b b;
    public final defpackage.k63.b c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: k63$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.k63.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                k63$a r0 = new k63$a
                r0.<init>()
                defpackage.k63.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.melonds.impl.dtos.input.InputConfigDto"
                r3 = 3
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "input"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "assignment"
                r1.l(r0, r2)
                java.lang.String r0 = "altAssignment"
                r2 = 1
                r1.l(r0, r2)
                defpackage.k63.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                go3[] r2 = defpackage.k63.d
                r0 = 3
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                r2 = r2[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                k63$c r2 = defpackage.k63.c.a
                r1 = 1
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                return r0
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r11) {
                r10 = this;
                wb6 r10 = defpackage.k63.a.descriptor
                ux0 r11 = r11.c(r10)
                go3[] r0 = defpackage.k63.d
                r11.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r6 = r1
                r7 = r2
                r4 = r3
                r5 = r4
            L12:
                if (r6 == 0) goto L51
                int r8 = r11.q(r10)
                r9 = -1
                if (r8 == r9) goto L4f
                if (r8 == 0) goto L3e
                if (r8 == r1) goto L33
                r9 = 2
                if (r8 != r9) goto L2d
                k63$c r8 = defpackage.k63.c.a
                java.lang.Object r5 = r11.G(r10, r9, r8, r5)
                k63$b r5 = (defpackage.k63.b) r5
                r7 = r7 | 4
                goto L12
            L2d:
                lg7 r10 = new lg7
                r10.<init>(r8)
                throw r10
            L33:
                k63$c r8 = defpackage.k63.c.a
                java.lang.Object r4 = r11.G(r10, r1, r8, r4)
                k63$b r4 = (defpackage.k63.b) r4
                r7 = r7 | 2
                goto L12
            L3e:
                r8 = r0[r2]
                java.lang.Object r8 = r8.getValue()
                gg3 r8 = (defpackage.gg3) r8
                java.lang.Object r3 = r11.G(r10, r2, r8, r3)
                b63 r3 = (defpackage.b63) r3
                r7 = r7 | 1
                goto L12
            L4f:
                r6 = r2
                goto L12
            L51:
                r11.a(r10)
                k63 r10 = new k63
                r10.<init>(r7, r3, r4, r5)
                return r10
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r5, java.lang.Object r6) {
                r4 = this;
                k63 r6 = (defpackage.k63) r6
                r6.getClass()
                wb6 r4 = defpackage.k63.a.descriptor
                vx0 r5 = r5.c(r4)
                go3[] r0 = defpackage.k63.d
                r1 = 0
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                b63 r2 = r6.a
                k63$b r3 = r6.c
                r5.w(r4, r1, r0, r2)
                k63$c r0 = defpackage.k63.c.a
                k63$b r6 = r6.b
                r1 = 1
                r5.w(r4, r1, r0, r6)
                boolean r6 = r5.i(r4)
                if (r6 == 0) goto L2c
                goto L34
            L2c:
                k63$b$d r6 = defpackage.k63.b.d.INSTANCE
                boolean r6 = defpackage.nb3.k(r3, r6)
                if (r6 != 0) goto L38
            L34:
                r6 = 2
                r5.w(r4, r6, r0, r3)
            L38:
                r5.a(r4)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.k63.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.cc6(with = defpackage.k63.c.class)
    /* renamed from: k63$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final defpackage.k63.b.C0002b Companion = null;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @defpackage.cc6
        /* renamed from: k63$b$a */
        /* loaded from: classes.dex */
        public static final class a extends defpackage.k63.b {
            public static final defpackage.k63.b.a.C0001b Companion = null;
            public static final defpackage.go3[] d = null;
            public final java.lang.Integer a;
            public final int b;
            public final defpackage.d63 c;

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            @defpackage.di1
            /* renamed from: k63$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class C0000a implements defpackage.qr2 {
                public static final defpackage.k63.b.a.C0000a a = null;
                private static final defpackage.wb6 descriptor = null;

                static {
                        k63$b$a$a r0 = new k63$b$a$a
                        r0.<init>()
                        defpackage.k63.b.a.C0000a.a = r0
                        ly4 r1 = new ly4
                        java.lang.String r2 = "axis"
                        r3 = 3
                        r1.<init>(r2, r0, r3)
                        java.lang.String r0 = "deviceId"
                        r2 = 0
                        r1.l(r0, r2)
                        java.lang.String r0 = "axisCode"
                        r1.l(r0, r2)
                        java.lang.String r0 = "direction"
                        r1.l(r0, r2)
                        defpackage.k63.b.a.C0000a.descriptor = r1
                        return
                }

                @Override // defpackage.qr2
                public final defpackage.gg3[] b() {
                        r4 = this;
                        go3[] r4 = defpackage.k63.b.a.d
                        r0 = 3
                        gg3[] r0 = new defpackage.gg3[r0]
                        o93 r1 = defpackage.o93.a
                        gg3 r2 = defpackage.q60.I(r1)
                        r3 = 0
                        r0[r3] = r2
                        r2 = 1
                        r0[r2] = r1
                        r1 = 2
                        r4 = r4[r1]
                        java.lang.Object r4 = r4.getValue()
                        r0[r1] = r4
                        return r0
                }

                @Override // defpackage.gg3
                public final java.lang.Object c(defpackage.sc1 r11) {
                        r10 = this;
                        wb6 r10 = defpackage.k63.b.a.C0000a.descriptor
                        ux0 r11 = r11.c(r10)
                        go3[] r0 = defpackage.k63.b.a.d
                        r11.getClass()
                        r1 = 1
                        r2 = 0
                        r3 = 0
                        r5 = r1
                        r6 = r2
                        r7 = r6
                        r4 = r3
                    L12:
                        if (r5 == 0) goto L4d
                        int r8 = r11.q(r10)
                        r9 = -1
                        if (r8 == r9) goto L4b
                        if (r8 == 0) goto L40
                        if (r8 == r1) goto L39
                        r9 = 2
                        if (r8 != r9) goto L33
                        r8 = r0[r9]
                        java.lang.Object r8 = r8.getValue()
                        gg3 r8 = (defpackage.gg3) r8
                        java.lang.Object r4 = r11.G(r10, r9, r8, r4)
                        d63 r4 = (defpackage.d63) r4
                        r6 = r6 | 4
                        goto L12
                    L33:
                        lg7 r10 = new lg7
                        r10.<init>(r8)
                        throw r10
                    L39:
                        int r7 = r11.H(r10, r1)
                        r6 = r6 | 2
                        goto L12
                    L40:
                        o93 r8 = defpackage.o93.a
                        java.lang.Object r3 = r11.P(r10, r2, r8, r3)
                        java.lang.Integer r3 = (java.lang.Integer) r3
                        r6 = r6 | 1
                        goto L12
                    L4b:
                        r5 = r2
                        goto L12
                    L4d:
                        r11.a(r10)
                        k63$b$a r10 = new k63$b$a
                        r10.<init>(r6, r3, r7, r4)
                        return r10
                }

                @Override // defpackage.gg3
                public final void d(defpackage.x32 r5, java.lang.Object r6) {
                        r4 = this;
                        k63$b$a r6 = (defpackage.k63.b.a) r6
                        r6.getClass()
                        wb6 r4 = defpackage.k63.b.a.C0000a.descriptor
                        vx0 r5 = r5.c(r4)
                        go3[] r0 = defpackage.k63.b.a.d
                        o93 r1 = defpackage.o93.a
                        java.lang.Integer r2 = r6.a
                        r3 = 0
                        r5.V(r4, r3, r1, r2)
                        r1 = 1
                        int r2 = r6.b
                        r5.O(r1, r2, r4)
                        r1 = 2
                        r0 = r0[r1]
                        java.lang.Object r0 = r0.getValue()
                        gg3 r0 = (defpackage.gg3) r0
                        d63 r6 = r6.c
                        r5.w(r4, r1, r0, r6)
                        r5.a(r4)
                        return
                }

                @Override // defpackage.gg3
                public final defpackage.wb6 e() {
                        r0 = this;
                        wb6 r0 = defpackage.k63.b.a.C0000a.descriptor
                        return r0
                }
            }

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            /* renamed from: k63$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0001b {
                public final defpackage.gg3 serializer() {
                        r0 = this;
                        k63$b$a$a r0 = defpackage.k63.b.a.C0000a.a
                        return r0
                }
            }

            static {
                    k63$b$a$b r0 = new k63$b$a$b
                    r0.<init>()
                    defpackage.k63.b.a.Companion = r0
                    xr3 r0 = defpackage.xr3.PUBLICATION
                    ns1 r1 = new ns1
                    r2 = 17
                    r1.<init>(r2)
                    go3 r0 = defpackage.kj2.M(r0, r1)
                    r1 = 3
                    go3[] r1 = new defpackage.go3[r1]
                    r2 = 0
                    r3 = 0
                    r1[r2] = r3
                    r2 = 1
                    r1[r2] = r3
                    r2 = 2
                    r1[r2] = r0
                    defpackage.k63.b.a.d = r1
                    return
            }

            public a(int r3, java.lang.Integer r4, int r5, defpackage.d63 r6) {
                    r2 = this;
                    r0 = r3 & 7
                    r1 = 7
                    if (r1 != r0) goto Lf
                    r2.<init>()
                    r2.a = r4
                    r2.b = r5
                    r2.c = r6
                    return
                Lf:
                    k63$b$a$a r2 = defpackage.k63.b.a.C0000a.a
                    wb6 r2 = r2.e()
                    defpackage.ii2.S(r3, r1, r2)
                    r2 = 0
                    throw r2
            }

            public a(java.lang.Integer r1, int r2, defpackage.d63 r3) {
                    r0 = this;
                    r3.getClass()
                    r0.<init>()
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    return
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: k63$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002b {
            public final defpackage.gg3 serializer() {
                    r0 = this;
                    k63$c r0 = defpackage.k63.c.a
                    return r0
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @defpackage.cc6
        /* renamed from: k63$b$c */
        /* loaded from: classes.dex */
        public static final class c extends defpackage.k63.b {
            public static final defpackage.k63.b.c.C0003b Companion = null;
            public final java.lang.Integer a;
            public final int b;

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            @defpackage.di1
            /* renamed from: k63$b$c$a */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class a implements defpackage.qr2 {
                public static final defpackage.k63.b.c.a a = null;
                private static final defpackage.wb6 descriptor = null;

                static {
                        k63$b$c$a r0 = new k63$b$c$a
                        r0.<init>()
                        defpackage.k63.b.c.a.a = r0
                        ly4 r1 = new ly4
                        java.lang.String r2 = "key"
                        r3 = 2
                        r1.<init>(r2, r0, r3)
                        java.lang.String r0 = "deviceId"
                        r2 = 0
                        r1.l(r0, r2)
                        java.lang.String r0 = "keyCode"
                        r1.l(r0, r2)
                        defpackage.k63.b.c.a.descriptor = r1
                        return
                }

                @Override // defpackage.qr2
                public final defpackage.gg3[] b() {
                        r3 = this;
                        o93 r3 = defpackage.o93.a
                        gg3 r0 = defpackage.q60.I(r3)
                        r1 = 2
                        gg3[] r1 = new defpackage.gg3[r1]
                        r2 = 0
                        r1[r2] = r0
                        r0 = 1
                        r1[r0] = r3
                        return r1
                }

                @Override // defpackage.gg3
                public final java.lang.Object c(defpackage.sc1 r9) {
                        r8 = this;
                        wb6 r8 = defpackage.k63.b.c.a.descriptor
                        ux0 r9 = r9.c(r8)
                        r9.getClass()
                        r0 = 1
                        r1 = 0
                        r2 = 0
                        r3 = r0
                        r4 = r1
                        r5 = r4
                    Lf:
                        if (r3 == 0) goto L36
                        int r6 = r9.q(r8)
                        r7 = -1
                        if (r6 == r7) goto L34
                        if (r6 == 0) goto L29
                        if (r6 != r0) goto L23
                        int r5 = r9.H(r8, r0)
                        r4 = r4 | 2
                        goto Lf
                    L23:
                        lg7 r8 = new lg7
                        r8.<init>(r6)
                        throw r8
                    L29:
                        o93 r6 = defpackage.o93.a
                        java.lang.Object r2 = r9.P(r8, r1, r6, r2)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        r4 = r4 | 1
                        goto Lf
                    L34:
                        r3 = r1
                        goto Lf
                    L36:
                        r9.a(r8)
                        k63$b$c r8 = new k63$b$c
                        r8.<init>(r4, r2, r5)
                        return r8
                }

                @Override // defpackage.gg3
                public final void d(defpackage.x32 r4, java.lang.Object r5) {
                        r3 = this;
                        k63$b$c r5 = (defpackage.k63.b.c) r5
                        r5.getClass()
                        wb6 r3 = defpackage.k63.b.c.a.descriptor
                        vx0 r4 = r4.c(r3)
                        o93 r0 = defpackage.o93.a
                        java.lang.Integer r1 = r5.a
                        r2 = 0
                        r4.V(r3, r2, r0, r1)
                        r0 = 1
                        int r5 = r5.b
                        r4.O(r0, r5, r3)
                        r4.a(r3)
                        return
                }

                @Override // defpackage.gg3
                public final defpackage.wb6 e() {
                        r0 = this;
                        wb6 r0 = defpackage.k63.b.c.a.descriptor
                        return r0
                }
            }

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            /* renamed from: k63$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0003b {
                public final defpackage.gg3 serializer() {
                        r0 = this;
                        k63$b$c$a r0 = defpackage.k63.b.c.a.a
                        return r0
                }
            }

            static {
                    k63$b$c$b r0 = new k63$b$c$b
                    r0.<init>()
                    defpackage.k63.b.c.Companion = r0
                    return
            }

            public c(int r1, java.lang.Integer r2) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r2
                    r0.b = r1
                    return
            }

            public c(int r3, java.lang.Integer r4, int r5) {
                    r2 = this;
                    r0 = r3 & 3
                    r1 = 3
                    if (r1 != r0) goto Ld
                    r2.<init>()
                    r2.a = r4
                    r2.b = r5
                    return
                Ld:
                    k63$b$c$a r2 = defpackage.k63.b.c.a.a
                    wb6 r2 = r2.e()
                    defpackage.ii2.S(r3, r1, r2)
                    r2 = 0
                    throw r2
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @defpackage.cc6
        /* renamed from: k63$b$d */
        /* loaded from: classes.dex */
        public static final class d extends defpackage.k63.b {
            public static final defpackage.k63.b.d INSTANCE = null;
            public static final /* synthetic */ defpackage.go3 a = null;

            static {
                    k63$b$d r0 = new k63$b$d
                    r0.<init>()
                    defpackage.k63.b.d.INSTANCE = r0
                    xr3 r0 = defpackage.xr3.PUBLICATION
                    ns1 r1 = new ns1
                    r2 = 18
                    r1.<init>(r2)
                    go3 r0 = defpackage.kj2.M(r0, r1)
                    defpackage.k63.b.d.a = r0
                    return
            }

            public final boolean equals(java.lang.Object r2) {
                    r1 = this;
                    r0 = 1
                    if (r1 != r2) goto L4
                    return r0
                L4:
                    boolean r1 = r2 instanceof defpackage.k63.b.d
                    if (r1 != 0) goto La
                    r1 = 0
                    return r1
                La:
                    return r0
            }

            public final int hashCode() {
                    r0 = this;
                    r0 = -1355695634(0xffffffffaf31b9ee, float:-1.6164112E-10)
                    return r0
            }

            public final defpackage.gg3 serializer() {
                    r0 = this;
                    go3 r0 = defpackage.k63.b.d.a
                    java.lang.Object r0 = r0.getValue()
                    gg3 r0 = (defpackage.gg3) r0
                    return r0
            }

            public final java.lang.String toString() {
                    r0 = this;
                    java.lang.String r0 = "None"
                    return r0
            }
        }

        static {
                k63$b$b r0 = new k63$b$b
                r0.<init>()
                defpackage.k63.b.Companion = r0
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k63$c */
    /* loaded from: classes.dex */
    public static final class c implements defpackage.gg3 {
        public static final defpackage.k63.c a = null;
        public static final defpackage.yb6 b = null;

        static {
                k63$c r0 = new k63$c
                r0.<init>()
                defpackage.k63.c.a = r0
                r0 = 0
                wb6[] r0 = new defpackage.wb6[r0]
                java.lang.String r2 = "InputAssignmentDto"
                boolean r1 = defpackage.qs6.v0(r2)
                if (r1 != 0) goto L2b
                br0 r6 = new br0
                r6.<init>(r2)
                yb6 r1 = new yb6
                bt6 r3 = defpackage.bt6.e
                java.util.ArrayList r4 = r6.c
                int r4 = r4.size()
                java.util.List r5 = defpackage.fv.T0(r0)
                r1.<init>(r2, r3, r4, r5, r6)
                defpackage.k63.c.b = r1
                return
            L2b:
                java.lang.String r0 = "Blank serial names are prohibited"
                defpackage.i.h(r0)
                return
        }

        public static java.lang.Integer f(defpackage.ye3 r1) {
                java.lang.String r0 = "deviceId"
                java.lang.Object r1 = r1.get(r0)
                de3 r1 = (defpackage.de3) r1
                if (r1 == 0) goto L26
                boolean r0 = r1 instanceof defpackage.ue3
                if (r0 == 0) goto Lf
                goto L26
            Lf:
                df3 r1 = defpackage.fe3.h(r1)
                java.lang.String r1 = r1.a()
                java.lang.Integer r1 = defpackage.xs6.h0(r1)
                if (r1 == 0) goto L1e
                return r1
            L1e:
                fc6 r1 = new fc6
                java.lang.String r0 = "Field 'deviceId' must be an int"
                r1.<init>(r0)
                throw r1
            L26:
                r1 = 0
                return r1
        }

        public static defpackage.de3 g(defpackage.ye3 r2, java.lang.String r3) {
                java.lang.Object r2 = r2.get(r3)
                de3 r2 = (defpackage.de3) r2
                if (r2 == 0) goto L9
                return r2
            L9:
                fc6 r2 = new fc6
                java.lang.String r0 = "Missing input assignment field '"
                java.lang.String r1 = "'"
                java.lang.String r3 = defpackage.lb1.A(r0, r3, r1)
                r2.<init>(r3)
                throw r2
        }

        public static int h(defpackage.ye3 r2, java.lang.String r3) {
                de3 r2 = g(r2, r3)
                df3 r2 = defpackage.fe3.h(r2)
                java.lang.String r2 = r2.a()
                java.lang.Integer r2 = defpackage.xs6.h0(r2)
                if (r2 == 0) goto L17
                int r2 = r2.intValue()
                return r2
            L17:
                fc6 r2 = new fc6
                java.lang.String r0 = "Field '"
                java.lang.String r1 = "' must be an int"
                java.lang.String r3 = defpackage.lb1.A(r0, r3, r1)
                r2.<init>(r3)
                throw r2
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r8) {
                r7 = this;
                boolean r7 = r8 instanceof defpackage.yd3
                r0 = 0
                if (r7 == 0) goto L8
                yd3 r8 = (defpackage.yd3) r8
                goto L9
            L8:
                r8 = r0
            L9:
                if (r8 == 0) goto Lc9
                de3 r7 = r8.y()
                ye3 r7 = defpackage.fe3.g(r7)
                java.lang.String r8 = "type"
                java.lang.Object r8 = r7.get(r8)
                de3 r8 = (defpackage.de3) r8
                if (r8 == 0) goto L2a
                df3 r8 = defpackage.fe3.h(r8)
                boolean r1 = r8 instanceof defpackage.ue3
                if (r1 == 0) goto L26
                goto L2a
            L26:
                java.lang.String r0 = r8.a()
            L2a:
                java.lang.String r8 = "none"
                java.lang.String r1 = "axis"
                java.lang.String r2 = "axisCode"
                java.lang.String r3 = "key"
                java.lang.String r4 = "keyCode"
                if (r0 == 0) goto L3c
                boolean r5 = defpackage.qs6.v0(r0)
                if (r5 == 0) goto L4d
            L3c:
                boolean r0 = r7.containsKey(r4)
                if (r0 == 0) goto L44
                r0 = r3
                goto L4d
            L44:
                boolean r0 = r7.containsKey(r2)
                if (r0 == 0) goto L4c
                r0 = r1
                goto L4d
            L4c:
                r0 = r8
            L4d:
                int r5 = r0.hashCode()
                r6 = 106079(0x19e5f, float:1.48648E-40)
                if (r5 == r6) goto Lad
                r3 = 3008417(0x2de7a1, float:4.21569E-39)
                if (r5 == r3) goto L69
                r7 = 3387192(0x33af38, float:4.746467E-39)
                if (r5 != r7) goto Lc1
                boolean r7 = r0.equals(r8)
                if (r7 == 0) goto Lc1
                k63$b$d r7 = defpackage.k63.b.d.INSTANCE
                return r7
            L69:
                boolean r8 = r0.equals(r1)
                if (r8 == 0) goto Lc1
                k63$b$a r8 = new k63$b$a
                java.lang.Integer r0 = f(r7)
                int r1 = h(r7, r2)
                java.lang.String r2 = "direction"
                de3 r7 = g(r7, r2)
                df3 r7 = defpackage.fe3.h(r7)
                java.lang.String r7 = r7.a()
                d63 r2 = defpackage.d63.valueOf(r7)     // Catch: java.lang.Throwable -> L8c
                goto L93
            L8c:
                r2 = move-exception
                em5 r3 = new em5
                r3.<init>(r2)
                r2 = r3
            L93:
                java.lang.Throwable r3 = defpackage.hm5.a(r2)
                if (r3 != 0) goto L9f
                d63 r2 = (defpackage.d63) r2
                r8.<init>(r0, r1, r2)
                return r8
            L9f:
                fc6 r8 = new fc6
                java.lang.String r0 = "Field 'direction' has invalid direction '"
                java.lang.String r1 = "'"
                java.lang.String r7 = defpackage.lb1.A(r0, r7, r1)
                r8.<init>(r7)
                throw r8
            Lad:
                boolean r8 = r0.equals(r3)
                if (r8 == 0) goto Lc1
                k63$b$c r8 = new k63$b$c
                java.lang.Integer r0 = f(r7)
                int r7 = h(r7, r4)
                r8.<init>(r7, r0)
                return r8
            Lc1:
                fc6 r7 = new fc6
                java.lang.String r8 = "Unknown input assignment type"
                r7.<init>(r8)
                throw r7
            Lc9:
                fc6 r7 = new fc6
                java.lang.String r8 = "InputAssignmentDto only supports JSON"
                r7.<init>(r8)
                throw r7
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                k63$b r5 = (defpackage.k63.b) r5
                r5.getClass()
                boolean r3 = r4 instanceof defpackage.hs6
                if (r3 == 0) goto Lc
                hs6 r4 = (defpackage.hs6) r4
                goto Ld
            Lc:
                r4 = 0
            Ld:
                if (r4 == 0) goto La7
                wb1 r3 = new wb1
                r0 = 3
                r1 = 0
                r3.<init>(r0, r1)
                boolean r0 = r5 instanceof defpackage.k63.b.d
                java.lang.String r1 = "type"
                if (r0 == 0) goto L26
                java.lang.String r5 = "none"
                df3 r5 = defpackage.fe3.b(r5)
                r3.i(r1, r5)
                goto L96
            L26:
                boolean r0 = r5 instanceof defpackage.k63.b.c
                java.lang.String r2 = "deviceId"
                if (r0 == 0) goto L58
                java.lang.String r0 = "key"
                df3 r0 = defpackage.fe3.b(r0)
                r3.i(r1, r0)
                k63$b$c r5 = (defpackage.k63.b.c) r5
                java.lang.Integer r0 = r5.a
                if (r0 != 0) goto L41
                ue3 r0 = defpackage.ue3.INSTANCE
                r3.i(r2, r0)
                goto L48
            L41:
                df3 r0 = defpackage.fe3.a(r0)
                r3.i(r2, r0)
            L48:
                int r5 = r5.b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                df3 r5 = defpackage.fe3.a(r5)
                java.lang.String r0 = "keyCode"
                r3.i(r0, r5)
                goto L96
            L58:
                boolean r0 = r5 instanceof defpackage.k63.b.a
                if (r0 == 0) goto La3
                java.lang.String r0 = "axis"
                df3 r0 = defpackage.fe3.b(r0)
                r3.i(r1, r0)
                k63$b$a r5 = (defpackage.k63.b.a) r5
                java.lang.Integer r0 = r5.a
                if (r0 != 0) goto L71
                ue3 r0 = defpackage.ue3.INSTANCE
                r3.i(r2, r0)
                goto L78
            L71:
                df3 r0 = defpackage.fe3.a(r0)
                r3.i(r2, r0)
            L78:
                int r0 = r5.b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                df3 r0 = defpackage.fe3.a(r0)
                java.lang.String r1 = "axisCode"
                r3.i(r1, r0)
                d63 r5 = r5.c
                java.lang.String r5 = r5.name()
                df3 r5 = defpackage.fe3.b(r5)
                java.lang.String r0 = "direction"
                r3.i(r0, r5)
            L96:
                ye3 r5 = new ye3
                java.util.LinkedHashMap r3 = r3.b
                r5.<init>(r3)
                he3 r3 = defpackage.he3.a
                r4.j(r3, r5)
                return
            La3:
                defpackage.i.d()
                return
            La7:
                fc6 r3 = new fc6
                java.lang.String r4 = "InputAssignmentDto only supports JSON"
                r3.<init>(r4)
                throw r3
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                yb6 r0 = defpackage.k63.c.b
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k63$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final defpackage.gg3 serializer() {
                r0 = this;
                k63$a r0 = defpackage.k63.a.a
                return r0
        }
    }

    static {
            k63$d r0 = new k63$d
            r0.<init>()
            defpackage.k63.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            ns1 r1 = new ns1
            r2 = 16
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 3
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r2 = 0
            r1[r0] = r2
            r0 = 2
            r1[r0] = r2
            defpackage.k63.d = r1
            return
    }

    public /* synthetic */ k63(int r3, defpackage.b63 r4, defpackage.k63.b r5, defpackage.k63.b r6) {
            r2 = this;
            r0 = r3 & 3
            r1 = 3
            if (r1 != r0) goto L18
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r3 = r3 & 4
            if (r3 != 0) goto L15
            k63$b$d r3 = defpackage.k63.b.d.INSTANCE
            r2.c = r3
            return
        L15:
            r2.c = r6
            return
        L18:
            k63$a r2 = defpackage.k63.a.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public k63(defpackage.b63 r1, defpackage.k63.b r2, defpackage.k63.b r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.k63
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k63 r5 = (defpackage.k63) r5
            b63 r1 = r4.a
            b63 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            k63$b r1 = r4.b
            k63$b r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            k63$b r4 = r4.c
            k63$b r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            b63 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k63$b r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            k63$b r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InputConfigDto(input="
            r0.<init>(r1)
            b63 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", assignment="
            r0.append(r1)
            k63$b r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", altAssignment="
            r0.append(r1)
            k63$b r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
