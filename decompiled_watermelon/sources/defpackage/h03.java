package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: h03  reason: default package */
/* loaded from: classes.dex */
public final class h03 {
    public static final d Companion = new Object();
    public static final gh3[] d = {yf2.H(wk3.PUBLICATION, new do1(13)), null, null};
    public final yz2 a;
    public final b b;
    public final b c;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: h03$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, h03$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.melonds.impl.dtos.input.InputConfigDto", obj, 3);
            hp4Var.l("input", false);
            hp4Var.l("assignment", false);
            hp4Var.l("altAssignment", true);
            descriptor = hp4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            c cVar = c.a;
            return new m93[]{h03.d[0].getValue(), cVar, cVar};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = h03.d;
            c.getClass();
            yz2 yz2Var = null;
            boolean z = true;
            int i = 0;
            b bVar = null;
            b bVar2 = null;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v != 1) {
                            if (v == 2) {
                                bVar2 = (b) c.U(h06Var, 2, c.a, bVar2);
                                i |= 4;
                            } else {
                                throw new q27(v);
                            }
                        } else {
                            bVar = (b) c.U(h06Var, 1, c.a, bVar);
                            i |= 2;
                        }
                    } else {
                        yz2Var = (yz2) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), yz2Var);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new h03(i, yz2Var, bVar, bVar2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            h03 h03Var = (h03) obj;
            h03Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            yz2 yz2Var = h03Var.a;
            b bVar = h03Var.c;
            c.F(h06Var, 0, (m93) h03.d[0].getValue(), yz2Var);
            c cVar = c.a;
            c.F(h06Var, 1, cVar, h03Var.b);
            if (c.k(h06Var) || !b53.x(bVar, b.d.INSTANCE)) {
                c.F(h06Var, 2, cVar, bVar);
            }
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: h03$c */
    /* loaded from: classes.dex */
    public static final class c implements m93 {
        public static final c a = new Object();
        public static final j06 b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h03$c] */
        static {
            h06[] h06VarArr = new h06[0];
            if (!zg6.B0("InputAssignmentDto")) {
                ro0 ro0Var = new ro0("InputAssignmentDto");
                b = new j06("InputAssignmentDto", kh6.h, ro0Var.c.size(), nu.F0(h06VarArr), ro0Var);
                return;
            }
            i.i("Blank serial names are prohibited");
        }

        public static Integer f(f83 f83Var) {
            k73 k73Var = (k73) f83Var.get("deviceId");
            if (k73Var != null && !(k73Var instanceof b83)) {
                Integer o0 = gh6.o0(m73.h(k73Var).b());
                if (o0 != null) {
                    return o0;
                }
                throw new IllegalArgumentException("Field 'deviceId' must be an int");
            }
            return null;
        }

        public static k73 g(f83 f83Var, String str) {
            k73 k73Var = (k73) f83Var.get(str);
            if (k73Var != null) {
                return k73Var;
            }
            throw new IllegalArgumentException(wh1.A("Missing input assignment field '", str, "'"));
        }

        public static int h(f83 f83Var, String str) {
            Integer o0 = gh6.o0(m73.h(g(f83Var, str)).b());
            if (o0 != null) {
                return o0.intValue();
            }
            throw new IllegalArgumentException(wh1.A("Field '", str, "' must be an int"));
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            f73 f73Var;
            Object kc5Var;
            String str = null;
            if (b91Var instanceof f73) {
                f73Var = (f73) b91Var;
            } else {
                f73Var = null;
            }
            if (f73Var != null) {
                f83 g = m73.g(f73Var.I());
                k73 k73Var = (k73) g.get("type");
                if (k73Var != null) {
                    k83 h = m73.h(k73Var);
                    if (!(h instanceof b83)) {
                        str = h.b();
                    }
                }
                if (str == null || zg6.B0(str)) {
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
                        String b2 = m73.h(g(g, "direction")).b();
                        try {
                            kc5Var = a03.valueOf(b2);
                        } catch (Throwable th) {
                            kc5Var = new kc5(th);
                        }
                        if (nc5.a(kc5Var) == null) {
                            return new b.a(f, h2, (a03) kc5Var);
                        }
                        throw new IllegalArgumentException(wh1.A("Field 'direction' has invalid direction '", b2, "'"));
                    }
                } else if (str.equals("key")) {
                    return new b.c(h(g, "keyCode"), f(g));
                }
                throw new IllegalArgumentException("Unknown input assignment type");
            }
            throw new IllegalArgumentException("InputAssignmentDto only supports JSON");
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            qg6 qg6Var;
            b bVar = (b) obj;
            bVar.getClass();
            if (mz1Var instanceof qg6) {
                qg6Var = (qg6) mz1Var;
            } else {
                qg6Var = null;
            }
            if (qg6Var != null) {
                e81 e81Var = new e81(3, (byte) 0);
                if (bVar instanceof b.d) {
                    e81Var.i("type", m73.b("none"));
                } else if (bVar instanceof b.c) {
                    e81Var.i("type", m73.b("key"));
                    b.c cVar = (b.c) bVar;
                    Integer num = cVar.a;
                    if (num == null) {
                        e81Var.i("deviceId", b83.INSTANCE);
                    } else {
                        e81Var.i("deviceId", m73.a(num));
                    }
                    e81Var.i("keyCode", m73.a(Integer.valueOf(cVar.b)));
                } else if (bVar instanceof b.a) {
                    e81Var.i("type", m73.b("axis"));
                    b.a aVar = (b.a) bVar;
                    Integer num2 = aVar.a;
                    if (num2 == null) {
                        e81Var.i("deviceId", b83.INSTANCE);
                    } else {
                        e81Var.i("deviceId", m73.a(num2));
                    }
                    e81Var.i("axisCode", m73.a(Integer.valueOf(aVar.b)));
                    e81Var.i("direction", m73.b(aVar.c.name()));
                } else {
                    i.c();
                    return;
                }
                qg6Var.l(o73.a, new f83(e81Var.b));
                return;
            }
            throw new IllegalArgumentException("InputAssignmentDto only supports JSON");
        }

        @Override // defpackage.m93
        public final h06 e() {
            return b;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: h03$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ h03(int i, yz2 yz2Var, b bVar, b bVar2) {
        if (3 == (i & 3)) {
            this.a = yz2Var;
            this.b = bVar;
            if ((i & 4) == 0) {
                this.c = b.d.INSTANCE;
                return;
            } else {
                this.c = bVar2;
                return;
            }
        }
        ep2.H(i, 3, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        if (this.a == h03Var.a && b53.x(this.b, h03Var.b) && b53.x(this.c, h03Var.c)) {
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

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @n06(with = c.class)
    /* renamed from: h03$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static final C0002b Companion = new Object();

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        /* renamed from: h03$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002b {
            public final m93 serializer() {
                return c.a;
            }
        }

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @n06
        /* renamed from: h03$b$d */
        /* loaded from: classes.dex */
        public static final class d extends b {
            public static final d INSTANCE = new Object();
            public static final /* synthetic */ gh3 a = yf2.H(wk3.PUBLICATION, new do1(15));

            public final boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return -1355695634;
            }

            public final m93 serializer() {
                return (m93) a.getValue();
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @n06
        /* renamed from: h03$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public static final C0003b Companion = new Object();
            public final Integer a;
            public final int b;

            /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
            @zd1
            /* renamed from: h03$b$c$a */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class a implements kl2 {
                public static final a a;
                private static final h06 descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, h03$b$c$a] */
                static {
                    ?? obj = new Object();
                    a = obj;
                    hp4 hp4Var = new hp4("key", obj, 2);
                    hp4Var.l("deviceId", false);
                    hp4Var.l("keyCode", false);
                    descriptor = hp4Var;
                }

                @Override // defpackage.kl2
                public final m93[] a() {
                    g33 g33Var = g33.a;
                    return new m93[]{l07.R(g33Var), g33Var};
                }

                @Override // defpackage.m93
                public final Object b(b91 b91Var) {
                    h06 h06Var = descriptor;
                    yu0 c = b91Var.c(h06Var);
                    c.getClass();
                    Integer num = null;
                    boolean z = true;
                    int i = 0;
                    int i2 = 0;
                    while (z) {
                        int v = c.v(h06Var);
                        if (v != -1) {
                            if (v != 0) {
                                if (v == 1) {
                                    i2 = c.V(h06Var, 1);
                                    i |= 2;
                                } else {
                                    throw new q27(v);
                                }
                            } else {
                                num = (Integer) c.u(h06Var, 0, g33.a, num);
                                i |= 1;
                            }
                        } else {
                            z = false;
                        }
                    }
                    c.a(h06Var);
                    return new c(i, num, i2);
                }

                @Override // defpackage.m93
                public final void d(mz1 mz1Var, Object obj) {
                    c cVar = (c) obj;
                    cVar.getClass();
                    h06 h06Var = descriptor;
                    zu0 c = mz1Var.c(h06Var);
                    c.N(h06Var, 0, g33.a, cVar.a);
                    c.q(1, cVar.b, h06Var);
                    c.a(h06Var);
                }

                @Override // defpackage.m93
                public final h06 e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
            /* renamed from: h03$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0003b {
                public final m93 serializer() {
                    return a.a;
                }
            }

            public c(int i, Integer num, int i2) {
                if (3 == (i & 3)) {
                    this.a = num;
                    this.b = i2;
                    return;
                }
                ep2.H(i, 3, a.a.e());
                throw null;
            }

            public c(int i, Integer num) {
                this.a = num;
                this.b = i;
            }
        }

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @n06
        /* renamed from: h03$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {
            public static final C0001b Companion = new Object();
            public static final gh3[] d = {null, null, yf2.H(wk3.PUBLICATION, new do1(14))};
            public final Integer a;
            public final int b;
            public final a03 c;

            /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
            @zd1
            /* renamed from: h03$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class C0000a implements kl2 {
                public static final C0000a a;
                private static final h06 descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, h03$b$a$a] */
                static {
                    ?? obj = new Object();
                    a = obj;
                    hp4 hp4Var = new hp4("axis", obj, 3);
                    hp4Var.l("deviceId", false);
                    hp4Var.l("axisCode", false);
                    hp4Var.l("direction", false);
                    descriptor = hp4Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.kl2
                public final m93[] a() {
                    gh3[] gh3VarArr = a.d;
                    g33 g33Var = g33.a;
                    return new m93[]{l07.R(g33Var), g33Var, gh3VarArr[2].getValue()};
                }

                @Override // defpackage.m93
                public final Object b(b91 b91Var) {
                    h06 h06Var = descriptor;
                    yu0 c = b91Var.c(h06Var);
                    gh3[] gh3VarArr = a.d;
                    c.getClass();
                    Integer num = null;
                    boolean z = true;
                    int i = 0;
                    int i2 = 0;
                    a03 a03Var = null;
                    while (z) {
                        int v = c.v(h06Var);
                        if (v != -1) {
                            if (v != 0) {
                                if (v != 1) {
                                    if (v == 2) {
                                        a03Var = (a03) c.U(h06Var, 2, (m93) gh3VarArr[2].getValue(), a03Var);
                                        i |= 4;
                                    } else {
                                        throw new q27(v);
                                    }
                                } else {
                                    i2 = c.V(h06Var, 1);
                                    i |= 2;
                                }
                            } else {
                                num = (Integer) c.u(h06Var, 0, g33.a, num);
                                i |= 1;
                            }
                        } else {
                            z = false;
                        }
                    }
                    c.a(h06Var);
                    return new a(i, num, i2, a03Var);
                }

                @Override // defpackage.m93
                public final void d(mz1 mz1Var, Object obj) {
                    a aVar = (a) obj;
                    aVar.getClass();
                    h06 h06Var = descriptor;
                    zu0 c = mz1Var.c(h06Var);
                    gh3[] gh3VarArr = a.d;
                    c.N(h06Var, 0, g33.a, aVar.a);
                    c.q(1, aVar.b, h06Var);
                    c.F(h06Var, 2, (m93) gh3VarArr[2].getValue(), aVar.c);
                    c.a(h06Var);
                }

                @Override // defpackage.m93
                public final h06 e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
            /* renamed from: h03$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0001b {
                public final m93 serializer() {
                    return C0000a.a;
                }
            }

            public a(int i, Integer num, int i2, a03 a03Var) {
                if (7 == (i & 7)) {
                    this.a = num;
                    this.b = i2;
                    this.c = a03Var;
                    return;
                }
                ep2.H(i, 7, C0000a.a.e());
                throw null;
            }

            public a(Integer num, int i, a03 a03Var) {
                a03Var.getClass();
                this.a = num;
                this.b = i;
                this.c = a03Var;
            }
        }
    }

    public h03(yz2 yz2Var, b bVar, b bVar2) {
        yz2Var.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = yz2Var;
        this.b = bVar;
        this.c = bVar2;
    }
}
