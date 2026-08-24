package defpackage;

import defpackage.l63;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: w41 */
/* loaded from: classes.dex */
public final class w41 {
    public static final b Companion = new b(null);
    public static final int b = 8;
    private static final go3[] c = {kj2.M(xr3.PUBLICATION, new c5(25))};
    private final List<l63> a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: w41$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        public static final int b;
        private static final wb6 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            ly4 ly4Var = new ly4("me.magnum.melonds.migrations.legacy.input.ControllerConfigurationDto33", aVar, 1);
            ly4Var.l("a", false);
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
            return new gg3[]{w41.c[0].getValue()};
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }

        @Override // defpackage.gg3
        /* renamed from: f */
        public final w41 c(sc1 sc1Var) {
            sc1Var.getClass();
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = w41.c;
            c.getClass();
            boolean z = true;
            int i = 0;
            List list = null;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q == 0) {
                        list = (List) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), list);
                        i = 1;
                    } else {
                        throw new lg7(q);
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new w41(i, list, null);
        }

        @Override // defpackage.gg3
        /* renamed from: g */
        public final void d(x32 x32Var, w41 w41Var) {
            x32Var.getClass();
            w41Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            w41.i(w41Var, c, wb6Var);
            c.a(wb6Var);
        }
    }

    public /* synthetic */ w41(int i, List list, dc6 dc6Var) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            ii2.S(i, 1, a.a.e());
            throw null;
        }
    }

    public static final /* synthetic */ gg3 b() {
        return new ru(l63.a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w41 f(w41 w41Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = w41Var.a;
        }
        return w41Var.e(list);
    }

    public static final /* synthetic */ void i(w41 w41Var, vx0 vx0Var, wb6 wb6Var) {
        vx0Var.w(wb6Var, 0, (gg3) c[0].getValue(), w41Var.a);
    }

    public final List<l63> d() {
        return this.a;
    }

    public final w41 e(List<l63> list) {
        list.getClass();
        return new w41(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w41) && nb3.k(this.a, ((w41) obj).a)) {
            return true;
        }
        return false;
    }

    public final List<l63> g() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<l63> list = this.a;
        return "ControllerConfigurationDto33(inputMapper=" + list + ")";
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: w41$b */
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

    public static /* synthetic */ void h() {
    }

    public w41(List<l63> list) {
        list.getClass();
        this.a = list;
    }
}
