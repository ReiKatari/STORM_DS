package li;

import li.h;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class i {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f9157a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9158b;

    /* renamed from: c  reason: collision with root package name */
    public final h f9159c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9160a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.i$a] */
        static {
            ?? obj = new Object();
            f9160a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.ResponseDto", obj, 3);
            c1Var.l("Score", false);
            c1Var.l("BestScore", false);
            c1Var.l("RankInfo", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            h hVar = null;
            boolean z10 = true;
            int i2 = 0;
            int i10 = 0;
            int i11 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 != 1) {
                            if (g10 == 2) {
                                hVar = (h) a10.o(eVar, 2, h.a.f9156a, hVar);
                                i2 |= 4;
                            } else {
                                throw new jd.k(g10);
                            }
                        } else {
                            i11 = a10.n(eVar, 1);
                            i2 |= 2;
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
            return new i(i2, i10, i11, hVar);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            l0 l0Var = l0.f10328a;
            return new jd.a[]{l0Var, l0Var, h.a.f9156a};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar = (ij.a) a10;
            aVar.H(0, iVar.f9157a, eVar);
            aVar.H(1, iVar.f9158b, eVar);
            aVar.J(eVar, 2, h.a.f9156a, iVar.f9159c);
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
            return a.f9160a;
        }
    }

    public /* synthetic */ i(int i2, int i10, int i11, h hVar) {
        if (7 == (i2 & 7)) {
            this.f9157a = i10;
            this.f9158b = i11;
            this.f9159c = hVar;
            return;
        }
        a1.j(i2, 7, a.f9160a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f9157a == iVar.f9157a && this.f9158b == iVar.f9158b && nc.k.a(this.f9159c, iVar.f9159c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9159c.hashCode() + w.d.c(this.f9158b, Integer.hashCode(this.f9157a) * 31, 31);
    }

    public final String toString() {
        StringBuilder j2 = kc.a.j("ResponseDto(score=", this.f9157a, ", bestScore=", this.f9158b, ", rankInfo=");
        j2.append(this.f9159c);
        j2.append(")");
        return j2.toString();
    }
}
