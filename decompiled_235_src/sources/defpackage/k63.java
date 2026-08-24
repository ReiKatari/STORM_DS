package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: k63  reason: default package */
/* loaded from: classes.dex */
public final class k63 {
    public static final d Companion = new Object();
    public static final go3[] d = {kj2.M(xr3.PUBLICATION, new ns1(16)), null, null};
    public final b63 a;
    public final b b;
    public final b c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: k63$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, k63$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.melonds.impl.dtos.input.InputConfigDto", obj, 3);
            ly4Var.l("input", false);
            ly4Var.l("assignment", false);
            ly4Var.l("altAssignment", true);
            descriptor = ly4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            c cVar = c.a;
            return new gg3[]{k63.d[0].getValue(), cVar, cVar};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = k63.d;
            c.getClass();
            b63 b63Var = null;
            boolean z = true;
            int i = 0;
            b bVar = null;
            b bVar2 = null;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q != 1) {
                            if (q == 2) {
                                bVar2 = (b) c.G(wb6Var, 2, c.a, bVar2);
                                i |= 4;
                            } else {
                                throw new lg7(q);
                            }
                        } else {
                            bVar = (b) c.G(wb6Var, 1, c.a, bVar);
                            i |= 2;
                        }
                    } else {
                        b63Var = (b63) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), b63Var);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new k63(i, b63Var, bVar, bVar2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            k63 k63Var = (k63) obj;
            k63Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            b63 b63Var = k63Var.a;
            b bVar = k63Var.c;
            c.w(wb6Var, 0, (gg3) k63.d[0].getValue(), b63Var);
            c cVar = c.a;
            c.w(wb6Var, 1, cVar, k63Var.b);
            if (c.i(wb6Var) || !nb3.k(bVar, b.d.INSTANCE)) {
                c.w(wb6Var, 2, cVar, bVar);
            }
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k63$c */
    /* loaded from: classes.dex */
    public static final class c implements gg3 {
        public static final c a = new Object();
        public static final yb6 b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k63$c] */
        static {
            wb6[] wb6VarArr = new wb6[0];
            if (!qs6.v0("InputAssignmentDto")) {
                br0 br0Var = new br0("InputAssignmentDto");
                b = new yb6("InputAssignmentDto", bt6.e, br0Var.c.size(), fv.T0(wb6VarArr), br0Var);
                return;
            }
            i.h("Blank serial names are prohibited");
        }

        public static Integer f(ye3 ye3Var) {
            de3 de3Var = (de3) ye3Var.get("deviceId");
            if (de3Var != null && !(de3Var instanceof ue3)) {
                Integer h0 = xs6.h0(fe3.h(de3Var).a());
                if (h0 != null) {
                    return h0;
                }
                throw new IllegalArgumentException("Field 'deviceId' must be an int");
            }
            return null;
        }

        public static de3 g(ye3 ye3Var, String str) {
            de3 de3Var = (de3) ye3Var.get(str);
            if (de3Var != null) {
                return de3Var;
            }
            throw new IllegalArgumentException(lb1.A("Missing input assignment field '", str, "'"));
        }

        public static int h(ye3 ye3Var, String str) {
            Integer h0 = xs6.h0(fe3.h(g(ye3Var, str)).a());
            if (h0 != null) {
                return h0.intValue();
            }
            throw new IllegalArgumentException(lb1.A("Field '", str, "' must be an int"));
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            yd3 yd3Var;
            Object em5Var;
            String str = null;
            if (sc1Var instanceof yd3) {
                yd3Var = (yd3) sc1Var;
            } else {
                yd3Var = null;
            }
            if (yd3Var != null) {
                ye3 g = fe3.g(yd3Var.y());
                de3 de3Var = (de3) g.get("type");
                if (de3Var != null) {
                    df3 h = fe3.h(de3Var);
                    if (!(h instanceof ue3)) {
                        str = h.a();
                    }
                }
                if (str == null || qs6.v0(str)) {
                    if (g.containsKey("keyCode")) {
                        str = "key";
                    } else if (!g.containsKey("axisCode")) {
                        str = "none";
                    } else {
                        str = "axis";
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode != 106079) {
                    if (hashCode != 3008417) {
                        if (hashCode == 3387192 && str.equals("none")) {
                            return b.d.INSTANCE;
                        }
                    } else if (str.equals("axis")) {
                        Integer f = f(g);
                        int h2 = h(g, "axisCode");
                        String a2 = fe3.h(g(g, "direction")).a();
                        try {
                            em5Var = d63.valueOf(a2);
                        } catch (Throwable th) {
                            em5Var = new em5(th);
                        }
                        if (hm5.a(em5Var) == null) {
                            return new b.a(f, h2, (d63) em5Var);
                        }
                        throw new IllegalArgumentException(lb1.A("Field 'direction' has invalid direction '", a2, "'"));
                    }
                } else if (str.equals("key")) {
                    return new b.c(h(g, "keyCode"), f(g));
                }
                throw new IllegalArgumentException("Unknown input assignment type");
            }
            throw new IllegalArgumentException("InputAssignmentDto only supports JSON");
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            hs6 hs6Var;
            b bVar = (b) obj;
            bVar.getClass();
            if (x32Var instanceof hs6) {
                hs6Var = (hs6) x32Var;
            } else {
                hs6Var = null;
            }
            if (hs6Var != null) {
                wb1 wb1Var = new wb1(3, (byte) 0);
                if (bVar instanceof b.d) {
                    wb1Var.i("type", fe3.b("none"));
                } else if (bVar instanceof b.c) {
                    wb1Var.i("type", fe3.b("key"));
                    b.c cVar = (b.c) bVar;
                    Integer num = cVar.a;
                    if (num == null) {
                        wb1Var.i("deviceId", ue3.INSTANCE);
                    } else {
                        wb1Var.i("deviceId", fe3.a(num));
                    }
                    wb1Var.i("keyCode", fe3.a(Integer.valueOf(cVar.b)));
                } else if (bVar instanceof b.a) {
                    wb1Var.i("type", fe3.b("axis"));
                    b.a aVar = (b.a) bVar;
                    Integer num2 = aVar.a;
                    if (num2 == null) {
                        wb1Var.i("deviceId", ue3.INSTANCE);
                    } else {
                        wb1Var.i("deviceId", fe3.a(num2));
                    }
                    wb1Var.i("axisCode", fe3.a(Integer.valueOf(aVar.b)));
                    wb1Var.i("direction", fe3.b(aVar.c.name()));
                } else {
                    i.d();
                    return;
                }
                hs6Var.j(he3.a, new ye3(wb1Var.b));
                return;
            }
            throw new IllegalArgumentException("InputAssignmentDto only supports JSON");
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return b;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k63$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ k63(int i, b63 b63Var, b bVar, b bVar2) {
        if (3 == (i & 3)) {
            this.a = b63Var;
            this.b = bVar;
            if ((i & 4) == 0) {
                this.c = b.d.INSTANCE;
                return;
            } else {
                this.c = bVar2;
                return;
            }
        }
        ii2.S(i, 3, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k63)) {
            return false;
        }
        k63 k63Var = (k63) obj;
        if (this.a == k63Var.a && nb3.k(this.b, k63Var.b) && nb3.k(this.c, k63Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputConfigDto(input=" + this.a + ", assignment=" + this.b + ", altAssignment=" + this.c + ")";
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @cc6(with = c.class)
    /* renamed from: k63$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final C0002b Companion = new Object();

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: k63$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002b {
            public final gg3 serializer() {
                return c.a;
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @cc6
        /* renamed from: k63$b$d */
        /* loaded from: classes.dex */
        public static final class d extends b {
            public static final d INSTANCE = new Object();
            public static final /* synthetic */ go3 a = kj2.M(xr3.PUBLICATION, new ns1(18));

            public final boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return -1355695634;
            }

            public final gg3 serializer() {
                return (gg3) a.getValue();
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @cc6
        /* renamed from: k63$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public static final C0003b Companion = new Object();
            public final Integer a;
            public final int b;

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            @di1
            /* renamed from: k63$b$c$a */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class a implements qr2 {
                public static final a a;
                private static final wb6 descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, k63$b$c$a] */
                static {
                    ?? obj = new Object();
                    a = obj;
                    ly4 ly4Var = new ly4("key", obj, 2);
                    ly4Var.l("deviceId", false);
                    ly4Var.l("keyCode", false);
                    descriptor = ly4Var;
                }

                @Override // defpackage.qr2
                public final gg3[] b() {
                    o93 o93Var = o93.a;
                    return new gg3[]{q60.I(o93Var), o93Var};
                }

                @Override // defpackage.gg3
                public final Object c(sc1 sc1Var) {
                    wb6 wb6Var = descriptor;
                    ux0 c = sc1Var.c(wb6Var);
                    c.getClass();
                    Integer num = null;
                    boolean z = true;
                    int i = 0;
                    int i2 = 0;
                    while (z) {
                        int q = c.q(wb6Var);
                        if (q != -1) {
                            if (q != 0) {
                                if (q == 1) {
                                    i2 = c.H(wb6Var, 1);
                                    i |= 2;
                                } else {
                                    throw new lg7(q);
                                }
                            } else {
                                num = (Integer) c.P(wb6Var, 0, o93.a, num);
                                i |= 1;
                            }
                        } else {
                            z = false;
                        }
                    }
                    c.a(wb6Var);
                    return new c(i, num, i2);
                }

                @Override // defpackage.gg3
                public final void d(x32 x32Var, Object obj) {
                    c cVar = (c) obj;
                    cVar.getClass();
                    wb6 wb6Var = descriptor;
                    vx0 c = x32Var.c(wb6Var);
                    c.V(wb6Var, 0, o93.a, cVar.a);
                    c.O(1, cVar.b, wb6Var);
                    c.a(wb6Var);
                }

                @Override // defpackage.gg3
                public final wb6 e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            /* renamed from: k63$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0003b {
                public final gg3 serializer() {
                    return a.a;
                }
            }

            public c(int i, Integer num, int i2) {
                if (3 == (i & 3)) {
                    this.a = num;
                    this.b = i2;
                    return;
                }
                ii2.S(i, 3, a.a.e());
                throw null;
            }

            public c(int i, Integer num) {
                this.a = num;
                this.b = i;
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @cc6
        /* renamed from: k63$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {
            public static final C0001b Companion = new Object();
            public static final go3[] d = {null, null, kj2.M(xr3.PUBLICATION, new ns1(17))};
            public final Integer a;
            public final int b;
            public final d63 c;

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            @di1
            /* renamed from: k63$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class C0000a implements qr2 {
                public static final C0000a a;
                private static final wb6 descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, k63$b$a$a] */
                static {
                    ?? obj = new Object();
                    a = obj;
                    ly4 ly4Var = new ly4("axis", obj, 3);
                    ly4Var.l("deviceId", false);
                    ly4Var.l("axisCode", false);
                    ly4Var.l("direction", false);
                    descriptor = ly4Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.qr2
                public final gg3[] b() {
                    go3[] go3VarArr = a.d;
                    o93 o93Var = o93.a;
                    return new gg3[]{q60.I(o93Var), o93Var, go3VarArr[2].getValue()};
                }

                @Override // defpackage.gg3
                public final Object c(sc1 sc1Var) {
                    wb6 wb6Var = descriptor;
                    ux0 c = sc1Var.c(wb6Var);
                    go3[] go3VarArr = a.d;
                    c.getClass();
                    Integer num = null;
                    boolean z = true;
                    int i = 0;
                    int i2 = 0;
                    d63 d63Var = null;
                    while (z) {
                        int q = c.q(wb6Var);
                        if (q != -1) {
                            if (q != 0) {
                                if (q != 1) {
                                    if (q == 2) {
                                        d63Var = (d63) c.G(wb6Var, 2, (gg3) go3VarArr[2].getValue(), d63Var);
                                        i |= 4;
                                    } else {
                                        throw new lg7(q);
                                    }
                                } else {
                                    i2 = c.H(wb6Var, 1);
                                    i |= 2;
                                }
                            } else {
                                num = (Integer) c.P(wb6Var, 0, o93.a, num);
                                i |= 1;
                            }
                        } else {
                            z = false;
                        }
                    }
                    c.a(wb6Var);
                    return new a(i, num, i2, d63Var);
                }

                @Override // defpackage.gg3
                public final void d(x32 x32Var, Object obj) {
                    a aVar = (a) obj;
                    aVar.getClass();
                    wb6 wb6Var = descriptor;
                    vx0 c = x32Var.c(wb6Var);
                    go3[] go3VarArr = a.d;
                    c.V(wb6Var, 0, o93.a, aVar.a);
                    c.O(1, aVar.b, wb6Var);
                    c.w(wb6Var, 2, (gg3) go3VarArr[2].getValue(), aVar.c);
                    c.a(wb6Var);
                }

                @Override // defpackage.gg3
                public final wb6 e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
            /* renamed from: k63$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0001b {
                public final gg3 serializer() {
                    return C0000a.a;
                }
            }

            public a(int i, Integer num, int i2, d63 d63Var) {
                if (7 == (i & 7)) {
                    this.a = num;
                    this.b = i2;
                    this.c = d63Var;
                    return;
                }
                ii2.S(i, 7, C0000a.a.e());
                throw null;
            }

            public a(Integer num, int i, d63 d63Var) {
                d63Var.getClass();
                this.a = num;
                this.b = i;
                this.c = d63Var;
            }
        }
    }

    public k63(b63 b63Var, b bVar, b bVar2) {
        b63Var.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = b63Var;
        this.b = bVar;
        this.c = bVar2;
    }
}
