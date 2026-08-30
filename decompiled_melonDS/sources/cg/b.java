package cg;

import jd.g;
import jd.k;
import ld.e;
import md.d;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.k1;
import nd.l0;
import nd.z;
import oe.s;
import yb.c;
import yb.f;
import yb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c */
    public static final int f2876c = 0;

    /* renamed from: a */
    private final s f2878a;

    /* renamed from: b */
    private final int f2879b;
    public static final C0002b Companion = new C0002b(null);

    /* renamed from: d */
    private static final f[] f2877d = {p7.a.s(h.PUBLICATION, new a3.g(9)), null};

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a */
        public static final a f2880a;

        /* renamed from: b */
        public static final int f2881b;
        private static final e descriptor;

        static {
            a aVar = new a();
            f2880a = aVar;
            f2881b = 8;
            c1 c1Var = new c1("me.magnum.melonds.migrations.legacy.input.InputConfigDto33", aVar, 2);
            c1Var.l("a", false);
            c1Var.l("b", false);
            descriptor = c1Var;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{b.f2877d[0].getValue(), l0.f10328a};
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
        public final b a(md.c cVar) {
            cVar.getClass();
            e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            f[] fVarArr = b.f2877d;
            boolean z10 = true;
            int i2 = 0;
            int i10 = 0;
            s sVar = null;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 == 1) {
                            i10 = a10.n(eVar, 1);
                            i2 |= 2;
                        } else {
                            throw new k(g10);
                        }
                    } else {
                        sVar = (s) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), sVar);
                        i2 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new b(i2, sVar, i10, null);
        }

        @Override // jd.a
        /* renamed from: g */
        public final void d(d dVar, b bVar) {
            dVar.getClass();
            bVar.getClass();
            e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            b.l(bVar, a10, eVar);
            a10.b(eVar);
        }
    }

    public /* synthetic */ b(int i2, s sVar, int i10, k1 k1Var) {
        if (3 == (i2 & 3)) {
            this.f2878a = sVar;
            this.f2879b = i10;
            return;
        }
        a1.j(i2, 3, a.f2880a.e());
        throw null;
    }

    public static final jd.a b() {
        s[] values = s.values();
        values.getClass();
        return new z("me.magnum.melonds.domain.model.Input", values);
    }

    public static /* synthetic */ b g(b bVar, s sVar, int i2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = bVar.f2878a;
        }
        if ((i10 & 2) != 0) {
            i2 = bVar.f2879b;
        }
        return bVar.f(sVar, i2);
    }

    public static final /* synthetic */ void l(b bVar, md.b bVar2, e eVar) {
        ij.a aVar = (ij.a) bVar2;
        aVar.J(eVar, 0, (jd.a) f2877d[0].getValue(), bVar.f2878a);
        aVar.H(1, bVar.f2879b, eVar);
    }

    public final s d() {
        return this.f2878a;
    }

    public final int e() {
        return this.f2879b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2878a == bVar.f2878a && this.f2879b == bVar.f2879b) {
            return true;
        }
        return false;
    }

    public final b f(s sVar, int i2) {
        sVar.getClass();
        return new b(sVar, i2);
    }

    public final s h() {
        return this.f2878a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2879b) + (this.f2878a.hashCode() * 31);
    }

    public final int j() {
        return this.f2879b;
    }

    public String toString() {
        s sVar = this.f2878a;
        int i2 = this.f2879b;
        return "InputConfigDto33(input=" + sVar + ", key=" + i2 + ")";
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: cg.b$b */
    /* loaded from: classes.dex */
    public static final class C0002b {
        public /* synthetic */ C0002b(nc.f fVar) {
            this();
        }

        public final jd.a serializer() {
            return a.f2880a;
        }

        private C0002b() {
        }
    }

    public b(s sVar, int i2) {
        sVar.getClass();
        this.f2878a = sVar;
        this.f2879b = i2;
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }
}
