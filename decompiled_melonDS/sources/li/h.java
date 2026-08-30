package li;

import nd.a1;
import nd.c1;
import nd.d0;
import nd.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class h {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f9154a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9155b;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9156a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.h$a] */
        static {
            ?? obj = new Object();
            f9156a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.RankInfoDto", obj, 2);
            c1Var.l("NumEntries", false);
            c1Var.l("Rank", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            boolean z10 = true;
            int i2 = 0;
            int i10 = 0;
            int i11 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 == 1) {
                            i11 = a10.n(eVar, 1);
                            i2 |= 2;
                        } else {
                            throw new jd.k(g10);
                        }
                    } else {
                        i10 = a10.n(eVar, 0);
                        i2 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new h(i2, i10, i11);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            l0 l0Var = l0.f10328a;
            return new jd.a[]{l0Var, l0Var};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar = (ij.a) a10;
            aVar.H(0, hVar.f9154a, eVar);
            aVar.H(1, hVar.f9155b, eVar);
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
            return a.f9156a;
        }
    }

    public /* synthetic */ h(int i2, int i10, int i11) {
        if (3 == (i2 & 3)) {
            this.f9154a = i10;
            this.f9155b = i11;
            return;
        }
        a1.j(i2, 3, a.f9156a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f9154a == hVar.f9154a && this.f9155b == hVar.f9155b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9155b) + (Integer.hashCode(this.f9154a) * 31);
    }

    public final String toString() {
        return "RankInfoDto(numEntries=" + this.f9154a + ", rank=" + this.f9155b + ")";
    }
}
