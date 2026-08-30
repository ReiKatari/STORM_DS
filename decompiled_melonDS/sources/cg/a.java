package cg;

import cg.b;
import java.util.List;
import jd.g;
import jd.k;
import ld.e;
import md.d;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.k1;
import yb.c;
import yb.f;
import yb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class a {
    public static final b Companion = new b(null);

    /* renamed from: b */
    public static final int f2871b = 8;

    /* renamed from: c */
    private static final f[] f2872c = {p7.a.s(h.PUBLICATION, new a3.g(8))};

    /* renamed from: a */
    private final List<cg.b> f2873a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @c
    /* renamed from: cg.a$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class C0001a implements d0 {

        /* renamed from: a */
        public static final C0001a f2874a;

        /* renamed from: b */
        public static final int f2875b;
        private static final e descriptor;

        static {
            C0001a c0001a = new C0001a();
            f2874a = c0001a;
            f2875b = 8;
            c1 c1Var = new c1("me.magnum.melonds.migrations.legacy.input.ControllerConfigurationDto33", c0001a, 1);
            c1Var.l("a", false);
            descriptor = c1Var;
        }

        private C0001a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{a.f2872c[0].getValue()};
        }

        @Override // nd.d0
        public /* bridge */ jd.a[] c() {
            return a1.f10267b;
        }

        @Override // jd.a
        public final e e() {
            return descriptor;
        }

        @Override // jd.a
        /* renamed from: f */
        public final a a(md.c cVar) {
            cVar.getClass();
            e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            f[] fVarArr = a.f2872c;
            boolean z10 = true;
            int i2 = 0;
            List list = null;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 == 0) {
                        list = (List) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), list);
                        i2 = 1;
                    } else {
                        throw new k(g10);
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new a(i2, list, null);
        }

        @Override // jd.a
        /* renamed from: g */
        public final void d(d dVar, a aVar) {
            dVar.getClass();
            aVar.getClass();
            e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            a.i(aVar, a10, eVar);
            a10.b(eVar);
        }
    }

    public /* synthetic */ a(int i2, List list, k1 k1Var) {
        if (1 == (i2 & 1)) {
            this.f2873a = list;
        } else {
            a1.j(i2, 1, C0001a.f2874a.e());
            throw null;
        }
    }

    public static final /* synthetic */ jd.a b() {
        return new nd.d(b.a.f2880a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aVar.f2873a;
        }
        return aVar.e(list);
    }

    public static final /* synthetic */ void i(a aVar, md.b bVar, e eVar) {
        ((ij.a) bVar).J(eVar, 0, (jd.a) f2872c[0].getValue(), aVar.f2873a);
    }

    public final List<cg.b> d() {
        return this.f2873a;
    }

    public final a e(List<cg.b> list) {
        list.getClass();
        return new a(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && nc.k.a(this.f2873a, ((a) obj).f2873a)) {
            return true;
        }
        return false;
    }

    public final List<cg.b> g() {
        return this.f2873a;
    }

    public int hashCode() {
        return this.f2873a.hashCode();
    }

    public String toString() {
        List<cg.b> list = this.f2873a;
        return "ControllerConfigurationDto33(inputMapper=" + list + ")";
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(nc.f fVar) {
            this();
        }

        public final jd.a serializer() {
            return C0001a.f2874a;
        }

        private b() {
        }
    }

    public a(List<cg.b> list) {
        list.getClass();
        this.f2873a = list;
    }

    public static /* synthetic */ void h() {
    }
}
