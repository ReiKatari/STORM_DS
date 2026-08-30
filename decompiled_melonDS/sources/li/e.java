package li;

import g2.v3;
import java.util.Map;
import nd.a1;
import nd.c1;
import nd.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class e {
    public static final b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final yb.f[] f9141b = {p7.a.s(yb.h.PUBLICATION, new v3(17))};

    /* renamed from: a  reason: collision with root package name */
    public final Map f9142a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9143a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [li.e$a, nd.d0, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9143a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.HashLibraryDto", obj, 1);
            c1Var.l("MD5List", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            yb.f[] fVarArr = e.f9141b;
            Map map = null;
            boolean z10 = true;
            int i2 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 == 0) {
                        map = (Map) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), map);
                        i2 = 1;
                    } else {
                        throw new jd.k(g10);
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new e(i2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{e.f9141b[0].getValue()};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            ld.e eVar2 = descriptor;
            md.b a10 = dVar.a(eVar2);
            ((ij.a) a10).J(eVar2, 0, (jd.a) e.f9141b[0].getValue(), eVar.f9142a);
            a10.b(eVar2);
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
            return a.f9143a;
        }
    }

    public /* synthetic */ e(int i2, Map map) {
        if (1 == (i2 & 1)) {
            this.f9142a = map;
        } else {
            a1.j(i2, 1, a.f9143a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && nc.k.a(this.f9142a, ((e) obj).f9142a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9142a.hashCode();
    }

    public final String toString() {
        return "HashLibraryDto(md5List=" + this.f9142a + ")";
    }
}
