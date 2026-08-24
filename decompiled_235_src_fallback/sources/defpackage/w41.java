package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: w41  reason: default package */
/* loaded from: classes.dex */
public final class w41 {
    public static final defpackage.w41.b Companion = null;
    public static final int b = 0;
    private static final defpackage.go3[] c = null;
    private final java.util.List<defpackage.l63> a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: w41$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.w41.a a = null;
        public static final int b = 0;
        private static final defpackage.wb6 descriptor = null;

        static {
                w41$a r0 = new w41$a
                r0.<init>()
                defpackage.w41.a.a = r0
                r1 = 8
                defpackage.w41.a.b = r1
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.melonds.migrations.legacy.input.ControllerConfigurationDto33"
                r3 = 1
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "a"
                r2 = 0
                r1.l(r0, r2)
                defpackage.w41.a.descriptor = r1
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
                go3[] r2 = defpackage.w41.c()
                r0 = 1
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                r2 = r2[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                return r0
        }

        @Override // defpackage.gg3
        public /* bridge */ /* synthetic */ java.lang.Object c(defpackage.sc1 r1) {
                r0 = this;
                w41 r0 = r0.f(r1)
                return r0
        }

        @Override // defpackage.gg3
        public /* bridge */ /* synthetic */ void d(defpackage.x32 r1, java.lang.Object r2) {
                r0 = this;
                w41 r2 = (defpackage.w41) r2
                r0.g(r1, r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.w41.a.descriptor
                return r0
        }

        public final defpackage.w41 f(defpackage.sc1 r10) {
                r9 = this;
                r10.getClass()
                wb6 r9 = defpackage.w41.a.descriptor
                ux0 r10 = r10.c(r9)
                go3[] r0 = defpackage.w41.c()
                r10.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r4 = r1
                r5 = r2
                r6 = r3
            L16:
                if (r4 == 0) goto L3a
                int r7 = r10.q(r9)
                r8 = -1
                if (r7 == r8) goto L38
                if (r7 != 0) goto L32
                r5 = r0[r2]
                java.lang.Object r5 = r5.getValue()
                gg3 r5 = (defpackage.gg3) r5
                java.lang.Object r5 = r10.G(r9, r2, r5, r6)
                r6 = r5
                java.util.List r6 = (java.util.List) r6
                r5 = r1
                goto L16
            L32:
                lg7 r9 = new lg7
                r9.<init>(r7)
                throw r9
            L38:
                r4 = r2
                goto L16
            L3a:
                r10.a(r9)
                w41 r9 = new w41
                r9.<init>(r5, r6, r3)
                return r9
        }

        public final void g(defpackage.x32 r1, defpackage.w41 r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                wb6 r0 = defpackage.w41.a.descriptor
                vx0 r1 = r1.c(r0)
                defpackage.w41.i(r2, r1, r0)
                r1.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: w41$b */
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
                w41$a r0 = defpackage.w41.a.a
                return r0
        }
    }

    static {
            w41$b r0 = new w41$b
            r1 = 0
            r0.<init>(r1)
            defpackage.w41.Companion = r0
            r0 = 8
            defpackage.w41.b = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            c5 r1 = new c5
            r2 = 25
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 1
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r1[r2] = r0
            defpackage.w41.c = r1
            return
    }

    public /* synthetic */ w41(int r2, java.util.List r3, defpackage.dc6 r4) {
            r1 = this;
            r4 = r2 & 1
            r0 = 1
            if (r0 != r4) goto Lb
            r1.<init>()
            r1.a = r3
            return
        Lb:
            w41$a r1 = defpackage.w41.a.a
            wb6 r1 = r1.e()
            defpackage.ii2.S(r2, r0, r1)
            r1 = 0
            throw r1
    }

    public w41(java.util.List<defpackage.l63> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public static /* synthetic */ defpackage.gg3 a() {
            gg3 r0 = b()
            return r0
    }

    private static final /* synthetic */ defpackage.gg3 b() {
            ru r0 = new ru
            l63$a r1 = defpackage.l63.a.a
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static final /* synthetic */ defpackage.go3[] c() {
            go3[] r0 = defpackage.w41.c
            return r0
    }

    public static /* synthetic */ defpackage.w41 f(defpackage.w41 r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<l63> r1 = r0.a
        L6:
            w41 r0 = r0.e(r1)
            return r0
    }

    public static /* synthetic */ void h() {
            return
    }

    public static final /* synthetic */ void i(defpackage.w41 r2, defpackage.vx0 r3, defpackage.wb6 r4) {
            go3[] r0 = defpackage.w41.c
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            gg3 r0 = (defpackage.gg3) r0
            java.util.List<l63> r2 = r2.a
            r3.w(r4, r1, r0, r2)
            return
    }

    public final java.util.List<defpackage.l63> d() {
            r0 = this;
            java.util.List<l63> r0 = r0.a
            return r0
    }

    public final defpackage.w41 e(java.util.List<defpackage.l63> r1) {
            r0 = this;
            r1.getClass()
            w41 r0 = new w41
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.w41
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            w41 r4 = (defpackage.w41) r4
            java.util.List<l63> r3 = r3.a
            java.util.List<l63> r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<defpackage.l63> g() {
            r0 = this;
            java.util.List<l63> r0 = r0.a
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.util.List<l63> r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.util.List<l63> r2 = r2.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ControllerConfigurationDto33(inputMapper="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
