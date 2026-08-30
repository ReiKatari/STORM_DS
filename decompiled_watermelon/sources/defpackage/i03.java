package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: i03 */
/* loaded from: classes.dex */
public final class i03 {
    public static final int c = 0;
    private final yz2 a;
    private final int b;
    public static final b Companion = new b(null);
    private static final gh3[] d = {yf2.H(wk3.PUBLICATION, new do1(16)), null};

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: i03$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        public static final int b;
        private static final h06 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            hp4 hp4Var = new hp4("me.magnum.melonds.migrations.legacy.input.InputConfigDto33", aVar, 2);
            hp4Var.l("a", false);
            hp4Var.l("b", false);
            descriptor = hp4Var;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{i03.d[0].getValue(), g33.a};
        }

        @Override // defpackage.kl2
        public /* bridge */ m93[] c() {
            return dk7.i;
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }

        @Override // defpackage.m93
        /* renamed from: f */
        public final i03 b(b91 b91Var) {
            b91Var.getClass();
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = i03.d;
            c.getClass();
            boolean z = true;
            int i = 0;
            int i2 = 0;
            yz2 yz2Var = null;
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
                        yz2Var = (yz2) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), yz2Var);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new i03(i, yz2Var, i2, null);
        }

        @Override // defpackage.m93
        /* renamed from: g */
        public final void d(mz1 mz1Var, i03 i03Var) {
            mz1Var.getClass();
            i03Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            i03.l(i03Var, c, h06Var);
            c.a(h06Var);
        }
    }

    public /* synthetic */ i03(int i, yz2 yz2Var, int i2, o06 o06Var) {
        if (3 == (i & 3)) {
            this.a = yz2Var;
            this.b = i2;
            return;
        }
        ep2.H(i, 3, a.a.e());
        throw null;
    }

    public static final m93 b() {
        yz2[] values = yz2.values();
        values.getClass();
        return new g12("me.magnum.melonds.domain.model.Input", values);
    }

    public static /* synthetic */ i03 g(i03 i03Var, yz2 yz2Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            yz2Var = i03Var.a;
        }
        if ((i2 & 2) != 0) {
            i = i03Var.b;
        }
        return i03Var.f(yz2Var, i);
    }

    public static final /* synthetic */ void l(i03 i03Var, zu0 zu0Var, h06 h06Var) {
        zu0Var.F(h06Var, 0, (m93) d[0].getValue(), i03Var.a);
        zu0Var.q(1, i03Var.b, h06Var);
    }

    public final yz2 d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i03)) {
            return false;
        }
        i03 i03Var = (i03) obj;
        if (this.a == i03Var.a && this.b == i03Var.b) {
            return true;
        }
        return false;
    }

    public final i03 f(yz2 yz2Var, int i) {
        yz2Var.getClass();
        return new i03(yz2Var, i);
    }

    public final yz2 h() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final int j() {
        return this.b;
    }

    public String toString() {
        yz2 yz2Var = this.a;
        int i = this.b;
        return "InputConfigDto33(input=" + yz2Var + ", key=" + i + ")";
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: i03$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(n91 n91Var) {
            this();
        }

        public final m93 serializer() {
            return a.a;
        }

        private b() {
        }
    }

    public i03(yz2 yz2Var, int i) {
        yz2Var.getClass();
        this.a = yz2Var;
        this.b = i;
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }
}
