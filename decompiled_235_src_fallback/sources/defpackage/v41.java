package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: v41  reason: default package */
/* loaded from: classes.dex */
public final class v41 {
    public static final defpackage.v41.b Companion = null;
    public static final defpackage.go3[] c = null;
    public final java.util.List a;
    public final defpackage.v41.c b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: v41$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.v41.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                v41$a r0 = new v41$a
                r0.<init>()
                defpackage.v41.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto"
                r3 = 2
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "inputMapper"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "slot2AnalogMapping"
                r2 = 1
                r1.l(r0, r2)
                defpackage.v41.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                go3[] r2 = defpackage.v41.c
                r0 = 2
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                r2 = r2[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                r2 = 1
                v41$c$a r1 = defpackage.v41.c.a.a
                r0[r2] = r1
                return r0
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r10) {
                r9 = this;
                wb6 r9 = defpackage.v41.a.descriptor
                ux0 r10 = r10.c(r9)
                go3[] r0 = defpackage.v41.c
                r10.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r5 = r1
                r6 = r2
                r4 = r3
            L11:
                if (r5 == 0) goto L42
                int r7 = r10.q(r9)
                r8 = -1
                if (r7 == r8) goto L40
                if (r7 == 0) goto L2f
                if (r7 != r1) goto L29
                v41$c$a r7 = defpackage.v41.c.a.a
                java.lang.Object r4 = r10.G(r9, r1, r7, r4)
                v41$c r4 = (defpackage.v41.c) r4
                r6 = r6 | 2
                goto L11
            L29:
                lg7 r9 = new lg7
                r9.<init>(r7)
                throw r9
            L2f:
                r7 = r0[r2]
                java.lang.Object r7 = r7.getValue()
                gg3 r7 = (defpackage.gg3) r7
                java.lang.Object r3 = r10.G(r9, r2, r7, r3)
                java.util.List r3 = (java.util.List) r3
                r6 = r6 | 1
                goto L11
            L40:
                r5 = r2
                goto L11
            L42:
                r10.a(r9)
                v41 r9 = new v41
                r9.<init>(r6, r3, r4)
                return r9
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                v41 r5 = (defpackage.v41) r5
                r5.getClass()
                wb6 r3 = defpackage.v41.a.descriptor
                vx0 r4 = r4.c(r3)
                go3[] r0 = defpackage.v41.c
                r1 = 0
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                java.util.List r2 = r5.a
                v41$c r5 = r5.b
                r4.w(r3, r1, r0, r2)
                boolean r0 = r4.i(r3)
                if (r0 == 0) goto L24
                goto L2f
            L24:
                v41$c r0 = new v41$c
                r0.<init>()
                boolean r0 = defpackage.nb3.k(r5, r0)
                if (r0 != 0) goto L35
            L2f:
                v41$c$a r0 = defpackage.v41.c.a.a
                r1 = 1
                r4.w(r3, r1, r0, r5)
            L35:
                r4.a(r3)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.v41.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: v41$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static defpackage.v41 a(defpackage.u41 r12) {
                r12.getClass()
                java.util.ArrayList r0 = r12.b
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = defpackage.ht0.v0(r0, r2)
                r1.<init>(r2)
                int r2 = r0.size()
                r3 = 0
            L15:
                if (r3 >= r2) goto L93
                java.lang.Object r4 = r0.get(r3)
                int r3 = r3 + 1
                i63 r4 = (defpackage.i63) r4
                k63$d r5 = defpackage.k63.Companion
                r5.getClass()
                r4.getClass()
                h63 r5 = r4.c
                k63 r6 = new k63
                b63 r7 = r4.a
                h63 r4 = r4.b
                boolean r8 = r4 instanceof defpackage.g63
                r9 = 0
                if (r8 == 0) goto L37
                k63$b$d r4 = defpackage.k63.b.d.INSTANCE
                goto L5a
            L37:
                boolean r8 = r4 instanceof defpackage.f63
                if (r8 == 0) goto L48
                k63$b$c r8 = new k63$b$c
                f63 r4 = (defpackage.f63) r4
                java.lang.Integer r10 = r4.a
                int r4 = r4.b
                r8.<init>(r4, r10)
            L46:
                r4 = r8
                goto L5a
            L48:
                boolean r8 = r4 instanceof defpackage.e63
                if (r8 == 0) goto L8f
                k63$b$a r8 = new k63$b$a
                e63 r4 = (defpackage.e63) r4
                java.lang.Integer r10 = r4.a
                int r11 = r4.b
                d63 r4 = r4.c
                r8.<init>(r10, r11, r4)
                goto L46
            L5a:
                boolean r8 = r5 instanceof defpackage.g63
                if (r8 == 0) goto L61
                k63$b$d r5 = defpackage.k63.b.d.INSTANCE
                goto L84
            L61:
                boolean r8 = r5 instanceof defpackage.f63
                if (r8 == 0) goto L72
                k63$b$c r8 = new k63$b$c
                f63 r5 = (defpackage.f63) r5
                java.lang.Integer r9 = r5.a
                int r5 = r5.b
                r8.<init>(r5, r9)
            L70:
                r5 = r8
                goto L84
            L72:
                boolean r8 = r5 instanceof defpackage.e63
                if (r8 == 0) goto L8b
                k63$b$a r8 = new k63$b$a
                e63 r5 = (defpackage.e63) r5
                java.lang.Integer r9 = r5.a
                int r10 = r5.b
                d63 r5 = r5.c
                r8.<init>(r9, r10, r5)
                goto L70
            L84:
                r6.<init>(r7, r4, r5)
                r1.add(r6)
                goto L15
            L8b:
                defpackage.i.d()
                return r9
            L8f:
                defpackage.i.d()
                return r9
            L93:
                v41 r0 = new v41
                v41$c$b r2 = defpackage.v41.c.Companion
                kk6 r12 = r12.a
                r2.getClass()
                r12.getClass()
                v41$c r3 = new v41$c
                java.lang.Integer r4 = r12.a
                boolean r2 = r12.b
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                int r6 = r12.c
                int r7 = r12.d
                boolean r8 = r12.e
                boolean r9 = r12.f
                float r10 = r12.g
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r0.<init>(r1, r3)
                return r0
        }

        public final defpackage.gg3 serializer() {
                r0 = this;
                v41$a r0 = defpackage.v41.a.a
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.cc6
    /* renamed from: v41$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final defpackage.v41.c.b Companion = null;
        public final java.lang.Integer a;
        public final java.lang.Boolean b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final float g;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @defpackage.di1
        /* renamed from: v41$c$a */
        /* loaded from: classes.dex */
        public static final /* synthetic */ class a implements defpackage.qr2 {
            public static final defpackage.v41.c.a a = null;
            private static final defpackage.wb6 descriptor = null;

            static {
                    v41$c$a r0 = new v41$c$a
                    r0.<init>()
                    defpackage.v41.c.a.a = r0
                    ly4 r1 = new ly4
                    java.lang.String r2 = "me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto.Slot2AnalogMappingDto"
                    r3 = 7
                    r1.<init>(r2, r0, r3)
                    java.lang.String r0 = "deviceId"
                    r2 = 1
                    r1.l(r0, r2)
                    java.lang.String r0 = "useDeviceFilter"
                    r1.l(r0, r2)
                    java.lang.String r0 = "axisXCode"
                    r1.l(r0, r2)
                    java.lang.String r0 = "axisYCode"
                    r1.l(r0, r2)
                    java.lang.String r0 = "invertX"
                    r1.l(r0, r2)
                    java.lang.String r0 = "invertY"
                    r1.l(r0, r2)
                    java.lang.String r0 = "deadzone"
                    r1.l(r0, r2)
                    defpackage.v41.c.a.descriptor = r1
                    return
            }

            @Override // defpackage.qr2
            public final defpackage.gg3[] b() {
                    r5 = this;
                    o93 r5 = defpackage.o93.a
                    gg3 r0 = defpackage.q60.I(r5)
                    u50 r1 = defpackage.u50.a
                    gg3 r2 = defpackage.q60.I(r1)
                    r3 = 7
                    gg3[] r3 = new defpackage.gg3[r3]
                    r4 = 0
                    r3[r4] = r0
                    r0 = 1
                    r3[r0] = r2
                    r0 = 2
                    r3[r0] = r5
                    r0 = 3
                    r3[r0] = r5
                    r5 = 4
                    r3[r5] = r1
                    r5 = 5
                    r3[r5] = r1
                    be2 r5 = defpackage.be2.a
                    r0 = 6
                    r3[r0] = r5
                    return r3
            }

            @Override // defpackage.gg3
            public final java.lang.Object c(defpackage.sc1 r14) {
                    r13 = this;
                    wb6 r13 = defpackage.v41.c.a.descriptor
                    ux0 r14 = r14.c(r13)
                    r14.getClass()
                    r0 = 1
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r5 = r1
                    r8 = r5
                    r9 = r8
                    r10 = r9
                    r11 = r10
                    r6 = r2
                    r7 = r6
                    r12 = r3
                    r2 = r0
                L16:
                    if (r2 == 0) goto L67
                    int r3 = r14.q(r13)
                    switch(r3) {
                        case -1: goto L65;
                        case 0: goto L59;
                        case 1: goto L4d;
                        case 2: goto L45;
                        case 3: goto L3d;
                        case 4: goto L35;
                        case 5: goto L2d;
                        case 6: goto L25;
                        default: goto L1f;
                    }
                L1f:
                    lg7 r13 = new lg7
                    r13.<init>(r3)
                    throw r13
                L25:
                    r3 = 6
                    float r12 = r14.p(r13, r3)
                    r5 = r5 | 64
                    goto L16
                L2d:
                    r3 = 5
                    boolean r11 = r14.W(r13, r3)
                    r5 = r5 | 32
                    goto L16
                L35:
                    r3 = 4
                    boolean r10 = r14.W(r13, r3)
                    r5 = r5 | 16
                    goto L16
                L3d:
                    r3 = 3
                    int r9 = r14.H(r13, r3)
                    r5 = r5 | 8
                    goto L16
                L45:
                    r3 = 2
                    int r8 = r14.H(r13, r3)
                    r5 = r5 | 4
                    goto L16
                L4d:
                    u50 r3 = defpackage.u50.a
                    java.lang.Object r3 = r14.P(r13, r0, r3, r7)
                    r7 = r3
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    r5 = r5 | 2
                    goto L16
                L59:
                    o93 r3 = defpackage.o93.a
                    java.lang.Object r3 = r14.P(r13, r1, r3, r6)
                    r6 = r3
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    r5 = r5 | 1
                    goto L16
                L65:
                    r2 = r1
                    goto L16
                L67:
                    r14.a(r13)
                    v41$c r4 = new v41$c
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    return r4
            }

            @Override // defpackage.gg3
            public final void d(defpackage.x32 r9, java.lang.Object r10) {
                    r8 = this;
                    v41$c r10 = (defpackage.v41.c) r10
                    r10.getClass()
                    float r8 = r10.g
                    boolean r0 = r10.f
                    boolean r1 = r10.e
                    int r2 = r10.d
                    int r3 = r10.c
                    java.lang.Boolean r4 = r10.b
                    java.lang.Integer r10 = r10.a
                    wb6 r5 = defpackage.v41.c.a.descriptor
                    vx0 r9 = r9.c(r5)
                    boolean r6 = r9.i(r5)
                    if (r6 == 0) goto L20
                    goto L22
                L20:
                    if (r10 == 0) goto L28
                L22:
                    o93 r6 = defpackage.o93.a
                    r7 = 0
                    r9.V(r5, r7, r6, r10)
                L28:
                    boolean r10 = r9.i(r5)
                    r6 = 1
                    if (r10 == 0) goto L30
                    goto L32
                L30:
                    if (r4 == 0) goto L37
                L32:
                    u50 r10 = defpackage.u50.a
                    r9.V(r5, r6, r10, r4)
                L37:
                    boolean r10 = r9.i(r5)
                    if (r10 == 0) goto L3e
                    goto L40
                L3e:
                    if (r3 == 0) goto L44
                L40:
                    r10 = 2
                    r9.O(r10, r3, r5)
                L44:
                    boolean r10 = r9.i(r5)
                    if (r10 == 0) goto L4b
                    goto L4d
                L4b:
                    if (r2 == r6) goto L51
                L4d:
                    r10 = 3
                    r9.O(r10, r2, r5)
                L51:
                    boolean r10 = r9.i(r5)
                    if (r10 == 0) goto L58
                    goto L5a
                L58:
                    if (r1 == 0) goto L5e
                L5a:
                    r10 = 4
                    r9.u(r5, r10, r1)
                L5e:
                    boolean r10 = r9.i(r5)
                    if (r10 == 0) goto L65
                    goto L67
                L65:
                    if (r0 == 0) goto L6b
                L67:
                    r10 = 5
                    r9.u(r5, r10, r0)
                L6b:
                    boolean r10 = r9.i(r5)
                    if (r10 == 0) goto L72
                    goto L7b
                L72:
                    r10 = 1036831949(0x3dcccccd, float:0.1)
                    int r10 = java.lang.Float.compare(r8, r10)
                    if (r10 == 0) goto L7f
                L7b:
                    r10 = 6
                    r9.f0(r5, r10, r8)
                L7f:
                    r9.a(r5)
                    return
            }

            @Override // defpackage.gg3
            public final defpackage.wb6 e() {
                    r0 = this;
                    wb6 r0 = defpackage.v41.c.a.descriptor
                    return r0
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: v41$c$b */
        /* loaded from: classes.dex */
        public static final class b {
            public final defpackage.gg3 serializer() {
                    r0 = this;
                    v41$c$a r0 = defpackage.v41.c.a.a
                    return r0
            }
        }

        static {
                v41$c$b r0 = new v41$c$b
                r0.<init>()
                defpackage.v41.c.Companion = r0
                return
        }

        public /* synthetic */ c() {
                r8 = this;
                r6 = 0
                r7 = 1036831949(0x3dcccccd, float:0.1)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public /* synthetic */ c(int r3, java.lang.Integer r4, java.lang.Boolean r5, int r6, int r7, boolean r8, boolean r9, float r10) {
                r2 = this;
                r2.<init>()
                r0 = r3 & 1
                r1 = 0
                if (r0 != 0) goto Lb
                r2.a = r1
                goto Ld
            Lb:
                r2.a = r4
            Ld:
                r4 = r3 & 2
                if (r4 != 0) goto L14
                r2.b = r1
                goto L16
            L14:
                r2.b = r5
            L16:
                r4 = r3 & 4
                r5 = 0
                if (r4 != 0) goto L1e
                r2.c = r5
                goto L20
            L1e:
                r2.c = r6
            L20:
                r4 = r3 & 8
                if (r4 != 0) goto L28
                r4 = 1
                r2.d = r4
                goto L2a
            L28:
                r2.d = r7
            L2a:
                r4 = r3 & 16
                if (r4 != 0) goto L31
                r2.e = r5
                goto L33
            L31:
                r2.e = r8
            L33:
                r4 = r3 & 32
                if (r4 != 0) goto L3a
                r2.f = r5
                goto L3c
            L3a:
                r2.f = r9
            L3c:
                r3 = r3 & 64
                if (r3 != 0) goto L46
                r3 = 1036831949(0x3dcccccd, float:0.1)
                r2.g = r3
                return
            L46:
                r2.g = r10
                return
        }

        public c(java.lang.Integer r1, java.lang.Boolean r2, int r3, int r4, boolean r5, boolean r6, float r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof defpackage.v41.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                v41$c r5 = (defpackage.v41.c) r5
                java.lang.Integer r1 = r4.a
                java.lang.Integer r3 = r5.a
                boolean r1 = defpackage.nb3.k(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Boolean r1 = r4.b
                java.lang.Boolean r3 = r5.b
                boolean r1 = defpackage.nb3.k(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                int r1 = r4.c
                int r3 = r5.c
                if (r1 == r3) goto L29
                return r2
            L29:
                int r1 = r4.d
                int r3 = r5.d
                if (r1 == r3) goto L30
                return r2
            L30:
                boolean r1 = r4.e
                boolean r3 = r5.e
                if (r1 == r3) goto L37
                return r2
            L37:
                boolean r1 = r4.f
                boolean r3 = r5.f
                if (r1 == r3) goto L3e
                return r2
            L3e:
                float r4 = r4.g
                float r5 = r5.g
                int r4 = java.lang.Float.compare(r4, r5)
                if (r4 == 0) goto L49
                return r2
            L49:
                return r0
        }

        public final int hashCode() {
                r4 = this;
                r0 = 0
                java.lang.Integer r1 = r4.a
                if (r1 != 0) goto L7
                r1 = r0
                goto Lb
            L7:
                int r1 = r1.hashCode()
            Lb:
                r2 = 31
                int r1 = r1 * r2
                java.lang.Boolean r3 = r4.b
                if (r3 != 0) goto L13
                goto L17
            L13:
                int r0 = r3.hashCode()
            L17:
                int r1 = r1 + r0
                int r1 = r1 * r2
                int r0 = r4.c
                int r0 = defpackage.lb1.a(r0, r1, r2)
                int r1 = r4.d
                int r0 = defpackage.lb1.a(r1, r0, r2)
                boolean r1 = r4.e
                int r0 = defpackage.xg6.e(r0, r1, r2)
                boolean r1 = r4.f
                int r0 = defpackage.xg6.e(r0, r1, r2)
                float r4 = r4.g
                int r4 = java.lang.Float.hashCode(r4)
                int r4 = r4 + r0
                return r4
        }

        public final java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Slot2AnalogMappingDto(deviceId="
                r0.<init>(r1)
                java.lang.Integer r1 = r5.a
                r0.append(r1)
                java.lang.String r1 = ", useDeviceFilter="
                r0.append(r1)
                java.lang.Boolean r1 = r5.b
                r0.append(r1)
                java.lang.String r1 = ", axisXCode="
                r0.append(r1)
                java.lang.String r1 = ", axisYCode="
                java.lang.String r2 = ", invertX="
                int r3 = r5.c
                int r4 = r5.d
                defpackage.lb1.x(r0, r3, r1, r4, r2)
                boolean r1 = r5.e
                r0.append(r1)
                java.lang.String r1 = ", invertY="
                r0.append(r1)
                boolean r1 = r5.f
                r0.append(r1)
                java.lang.String r1 = ", deadzone="
                r0.append(r1)
                float r5 = r5.g
                r0.append(r5)
                java.lang.String r5 = ")"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                return r5
        }
    }

    static {
            v41$b r0 = new v41$b
            r0.<init>()
            defpackage.v41.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            c5 r1 = new c5
            r2 = 24
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 2
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            r2 = 1
            r1[r2] = r0
            defpackage.v41.c = r1
            return
    }

    public /* synthetic */ v41(int r3, java.util.List r4, defpackage.v41.c r5) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r1 != r0) goto L19
            r2.<init>()
            r2.a = r4
            r3 = r3 & 2
            if (r3 != 0) goto L16
            v41$c r3 = new v41$c
            r3.<init>()
            r2.b = r3
            return
        L16:
            r2.b = r5
            return
        L19:
            v41$a r2 = defpackage.v41.a.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public v41(java.util.List r1, defpackage.v41.c r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final defpackage.u41 a() {
            r18 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            java.util.List r3 = r0.a
            int r2 = defpackage.ht0.v0(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()
            k63 r3 = (defpackage.k63) r3
            i63 r4 = new i63
            b63 r5 = r3.a
            k63$b r6 = r3.b
            boolean r7 = r6 instanceof defpackage.k63.b.d
            r8 = 0
            g63 r9 = defpackage.g63.a
            if (r7 == 0) goto L2e
            r7 = r9
            goto L4f
        L2e:
            boolean r7 = r6 instanceof defpackage.k63.b.c
            if (r7 == 0) goto L3e
            f63 r7 = new f63
            k63$b$c r6 = (defpackage.k63.b.c) r6
            java.lang.Integer r10 = r6.a
            int r6 = r6.b
            r7.<init>(r6, r10)
            goto L4f
        L3e:
            boolean r7 = r6 instanceof defpackage.k63.b.a
            if (r7 == 0) goto L82
            e63 r7 = new e63
            k63$b$a r6 = (defpackage.k63.b.a) r6
            java.lang.Integer r10 = r6.a
            int r11 = r6.b
            d63 r6 = r6.c
            r7.<init>(r10, r11, r6)
        L4f:
            k63$b r3 = r3.c
            boolean r6 = r3 instanceof defpackage.k63.b.d
            if (r6 == 0) goto L56
            goto L77
        L56:
            boolean r6 = r3 instanceof defpackage.k63.b.c
            if (r6 == 0) goto L66
            f63 r9 = new f63
            k63$b$c r3 = (defpackage.k63.b.c) r3
            java.lang.Integer r6 = r3.a
            int r3 = r3.b
            r9.<init>(r3, r6)
            goto L77
        L66:
            boolean r6 = r3 instanceof defpackage.k63.b.a
            if (r6 == 0) goto L7e
            e63 r9 = new e63
            k63$b$a r3 = (defpackage.k63.b.a) r3
            java.lang.Integer r6 = r3.a
            int r8 = r3.b
            d63 r3 = r3.c
            r9.<init>(r6, r8, r3)
        L77:
            r4.<init>(r5, r7, r9)
            r1.add(r4)
            goto L13
        L7e:
            defpackage.i.d()
            return r8
        L82:
            defpackage.i.d()
            return r8
        L86:
            kk6 r10 = new kk6
            v41$c r0 = r0.b
            java.lang.Integer r11 = r0.a
            java.lang.Boolean r2 = r0.b
            if (r2 == 0) goto L96
            boolean r2 = r2.booleanValue()
        L94:
            r12 = r2
            goto L9c
        L96:
            if (r11 == 0) goto L9a
            r2 = 1
            goto L94
        L9a:
            r2 = 0
            goto L94
        L9c:
            int r13 = r0.c
            int r14 = r0.d
            boolean r15 = r0.e
            boolean r2 = r0.f
            float r0 = r0.g
            r17 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            u41 r0 = new u41
            r0.<init>(r1, r10)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.v41
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v41 r5 = (defpackage.v41) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            v41$c r4 = r4.b
            v41$c r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            v41$c r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ControllerConfigurationDto(inputMapper="
            r0.<init>(r1)
            java.util.List r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", slot2AnalogMapping="
            r0.append(r1)
            v41$c r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
