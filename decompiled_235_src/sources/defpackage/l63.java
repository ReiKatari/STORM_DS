package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: l63 */
/* loaded from: classes.dex */
public final class l63 {
    public static final int c = 0;
    private final b63 a;
    private final int b;
    public static final b Companion = new b(null);
    private static final go3[] d = {kj2.M(xr3.PUBLICATION, new ns1(19)), null};

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: l63$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        public static final int b;
        private static final wb6 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            ly4 ly4Var = new ly4("me.magnum.melonds.migrations.legacy.input.InputConfigDto33", aVar, 2);
            ly4Var.l("a", false);
            ly4Var.l("b", false);
            descriptor = ly4Var;
        }

        private a() {
        }

        @Override // defpackage.qr2
        public /* bridge */ gg3[] a() {
            return nc1.h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{l63.d[0].getValue(), o93.a};
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }

        @Override // defpackage.gg3
        /* renamed from: f */
        public final l63 c(sc1 sc1Var) {
            sc1Var.getClass();
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = l63.d;
            c.getClass();
            boolean z = true;
            int i = 0;
            int i2 = 0;
            b63 b63Var = null;
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
                        b63Var = (b63) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), b63Var);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new l63(i, b63Var, i2, null);
        }

        @Override // defpackage.gg3
        /* renamed from: g */
        public final void d(x32 x32Var, l63 l63Var) {
            x32Var.getClass();
            l63Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            l63.l(l63Var, c, wb6Var);
            c.a(wb6Var);
        }
    }

    public /* synthetic */ l63(int i, b63 b63Var, int i2, dc6 dc6Var) {
        if (3 == (i & 3)) {
            this.a = b63Var;
            this.b = i2;
            return;
        }
        ii2.S(i, 3, a.a.e());
        throw null;
    }

    public static final gg3 b() {
        b63[] values = b63.values();
        values.getClass();
        return new v52("me.magnum.melonds.domain.model.Input", values);
    }

    public static /* synthetic */ l63 g(l63 l63Var, b63 b63Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            b63Var = l63Var.a;
        }
        if ((i2 & 2) != 0) {
            i = l63Var.b;
        }
        return l63Var.f(b63Var, i);
    }

    public static final /* synthetic */ void l(l63 l63Var, vx0 vx0Var, wb6 wb6Var) {
        vx0Var.w(wb6Var, 0, (gg3) d[0].getValue(), l63Var.a);
        vx0Var.O(1, l63Var.b, wb6Var);
    }

    public final b63 d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l63)) {
            return false;
        }
        l63 l63Var = (l63) obj;
        if (this.a == l63Var.a && this.b == l63Var.b) {
            return true;
        }
        return false;
    }

    public final l63 f(b63 b63Var, int i) {
        b63Var.getClass();
        return new l63(b63Var, i);
    }

    public final b63 h() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final int j() {
        return this.b;
    }

    public String toString() {
        b63 b63Var = this.a;
        int i = this.b;
        return "InputConfigDto33(input=" + b63Var + ", key=" + i + ")";
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: l63$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(id1 id1Var) {
            this();
        }

        public final gg3 serializer() {
            return a.a;
        }

        private b() {
        }
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public l63(b63 b63Var, int i) {
        b63Var.getClass();
        this.a = b63Var;
        this.b = i;
    }
}
