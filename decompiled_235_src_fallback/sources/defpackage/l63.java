package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: l63  reason: default package */
/* loaded from: classes.dex */
public final class l63 {
    public static final defpackage.l63.b Companion = null;
    public static final int c = 0;
    private static final defpackage.go3[] d = null;
    private final defpackage.b63 a;
    private final int b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: l63$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.l63.a a = null;
        public static final int b = 0;
        private static final defpackage.wb6 descriptor = null;

        static {
                l63$a r0 = new l63$a
                r0.<init>()
                defpackage.l63.a.a = r0
                r1 = 8
                defpackage.l63.a.b = r1
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.melonds.migrations.legacy.input.InputConfigDto33"
                r3 = 2
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "a"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "b"
                r1.l(r0, r2)
                defpackage.l63.a.descriptor = r1
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.qr2
        public /* bridge */ defpackage.gg3[] a() {
                r0 = this;
                gg3[] r0 = defpackage.nc1.h
                return r0
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                go3[] r2 = defpackage.l63.c()
                r0 = 2
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                r2 = r2[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                r2 = 1
                o93 r1 = defpackage.o93.a
                r0[r2] = r1
                return r0
        }

        @Override // defpackage.gg3
        public /* bridge */ /* synthetic */ java.lang.Object c(defpackage.sc1 r1) {
                r0 = this;
                l63 r0 = r0.f(r1)
                return r0
        }

        @Override // defpackage.gg3
        public /* bridge */ /* synthetic */ void d(defpackage.x32 r1, java.lang.Object r2) {
                r0 = this;
                l63 r2 = (defpackage.l63) r2
                r0.g(r1, r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.l63.a.descriptor
                return r0
        }

        public final defpackage.l63 f(defpackage.sc1 r11) {
                r10 = this;
                r11.getClass()
                wb6 r10 = defpackage.l63.a.descriptor
                ux0 r11 = r11.c(r10)
                go3[] r0 = defpackage.l63.c()
                r11.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r4 = r1
                r5 = r2
                r7 = r5
                r6 = r3
            L17:
                if (r4 == 0) goto L44
                int r8 = r11.q(r10)
                r9 = -1
                if (r8 == r9) goto L42
                if (r8 == 0) goto L31
                if (r8 != r1) goto L2b
                int r7 = r11.H(r10, r1)
                r5 = r5 | 2
                goto L17
            L2b:
                lg7 r10 = new lg7
                r10.<init>(r8)
                throw r10
            L31:
                r8 = r0[r2]
                java.lang.Object r8 = r8.getValue()
                gg3 r8 = (defpackage.gg3) r8
                java.lang.Object r6 = r11.G(r10, r2, r8, r6)
                b63 r6 = (defpackage.b63) r6
                r5 = r5 | 1
                goto L17
            L42:
                r4 = r2
                goto L17
            L44:
                r11.a(r10)
                l63 r10 = new l63
                r10.<init>(r5, r6, r7, r3)
                return r10
        }

        public final void g(defpackage.x32 r1, defpackage.l63 r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                wb6 r0 = defpackage.l63.a.descriptor
                vx0 r1 = r1.c(r0)
                defpackage.l63.l(r2, r1, r0)
                r1.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: l63$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(defpackage.id1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final defpackage.gg3 serializer() {
                r0 = this;
                l63$a r0 = defpackage.l63.a.a
                return r0
        }
    }

    static {
            l63$b r0 = new l63$b
            r1 = 0
            r0.<init>(r1)
            defpackage.l63.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            ns1 r2 = new ns1
            r3 = 19
            r2.<init>(r3)
            go3 r0 = defpackage.kj2.M(r0, r2)
            r2 = 2
            go3[] r2 = new defpackage.go3[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            defpackage.l63.d = r2
            return
    }

    public /* synthetic */ l63(int r2, defpackage.b63 r3, int r4, defpackage.dc6 r5) {
            r1 = this;
            r5 = r2 & 3
            r0 = 3
            if (r0 != r5) goto Ld
            r1.<init>()
            r1.a = r3
            r1.b = r4
            return
        Ld:
            l63$a r1 = defpackage.l63.a.a
            wb6 r1 = r1.e()
            defpackage.ii2.S(r2, r0, r1)
            r1 = 0
            throw r1
    }

    public l63(defpackage.b63 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static /* synthetic */ defpackage.gg3 a() {
            gg3 r0 = b()
            return r0
    }

    private static final defpackage.gg3 b() {
            b63[] r0 = defpackage.b63.values()
            r0.getClass()
            v52 r1 = new v52
            java.lang.String r2 = "me.magnum.melonds.domain.model.Input"
            r1.<init>(r2, r0)
            return r1
    }

    public static final /* synthetic */ defpackage.go3[] c() {
            go3[] r0 = defpackage.l63.d
            return r0
    }

    public static /* synthetic */ defpackage.l63 g(defpackage.l63 r0, defpackage.b63 r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            b63 r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = r0.b
        Lc:
            l63 r0 = r0.f(r1, r2)
            return r0
    }

    public static /* synthetic */ void i() {
            return
    }

    public static /* synthetic */ void k() {
            return
    }

    public static final /* synthetic */ void l(defpackage.l63 r3, defpackage.vx0 r4, defpackage.wb6 r5) {
            go3[] r0 = defpackage.l63.d
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            gg3 r0 = (defpackage.gg3) r0
            b63 r2 = r3.a
            r4.w(r5, r1, r0, r2)
            r0 = 1
            int r3 = r3.b
            r4.O(r0, r3, r5)
            return
    }

    public final defpackage.b63 d() {
            r0 = this;
            b63 r0 = r0.a
            return r0
    }

    public final int e() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.l63
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l63 r5 = (defpackage.l63) r5
            b63 r1 = r4.a
            b63 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final defpackage.l63 f(defpackage.b63 r1, int r2) {
            r0 = this;
            r1.getClass()
            l63 r0 = new l63
            r0.<init>(r1, r2)
            return r0
    }

    public final defpackage.b63 h() {
            r0 = this;
            b63 r0 = r0.a
            return r0
    }

    public int hashCode() {
            r1 = this;
            b63 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final int j() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            b63 r0 = r3.a
            int r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "InputConfigDto33(input="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", key="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
