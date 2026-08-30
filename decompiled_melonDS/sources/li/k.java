package li;

import g2.v3;
import java.util.List;
import nd.a1;
import nd.c1;
import nd.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class k {
    public static final b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final yb.f[] f9165b = {p7.a.s(yb.h.PUBLICATION, new v3(18))};

    /* renamed from: a  reason: collision with root package name */
    public final List f9166a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9167a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.k$a] */
        static {
            ?? obj = new Object();
            f9167a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.UserUnlocksDto", obj, 1);
            c1Var.l("UserUnlocks", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            yb.f[] fVarArr = k.f9165b;
            List list = null;
            boolean z10 = true;
            int i2 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 == 0) {
                        list = (List) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), list);
                        i2 = 1;
                    } else {
                        throw new jd.k(g10);
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new k(i2, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{k.f9165b[0].getValue()};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ((ij.a) a10).J(eVar, 0, (jd.a) k.f9165b[0].getValue(), kVar.f9166a);
            a10.b(eVar);
        }

        @Override // jd.a
        public final ld.e e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class b {
        public final jd.a serializer() {
            return a.f9167a;
        }
    }

    public /* synthetic */ k(int i2, List list) {
        if (1 == (i2 & 1)) {
            this.f9166a = list;
        } else {
            a1.j(i2, 1, a.f9167a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && nc.k.a(this.f9166a, ((k) obj).f9166a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9166a.hashCode();
    }

    public final String toString() {
        return "UserUnlocksDto(userUnlocks=" + this.f9166a + ")";
    }
}
