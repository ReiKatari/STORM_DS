package li;

import li.i;
import nd.a1;
import nd.c1;
import nd.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class g {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final i f9152a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9153a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.g$a] */
        static {
            ?? obj = new Object();
            f9153a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.RASubmitLeaderboardEntryResponseDto", obj, 1);
            c1Var.l("Response", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            i iVar = null;
            boolean z10 = true;
            int i2 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 == 0) {
                        iVar = (i) a10.o(eVar, 0, i.a.f9160a, iVar);
                        i2 = 1;
                    } else {
                        throw new jd.k(g10);
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new g(i2, iVar);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{i.a.f9160a};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ((ij.a) a10).J(eVar, 0, i.a.f9160a, gVar.f9152a);
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
            return a.f9153a;
        }
    }

    public /* synthetic */ g(int i2, i iVar) {
        if (1 == (i2 & 1)) {
            this.f9152a = iVar;
        } else {
            a1.j(i2, 1, a.f9153a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && nc.k.a(this.f9152a, ((g) obj).f9152a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9152a.hashCode();
    }

    public final String toString() {
        return "RASubmitLeaderboardEntryResponseDto(response=" + this.f9152a + ")";
    }
}
