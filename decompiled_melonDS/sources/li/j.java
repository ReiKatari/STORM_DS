package li;

import nd.a1;
import nd.c1;
import nd.d0;
import nd.o1;
import nd.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class j {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f9161a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9162b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9163c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9164a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.j$a] */
        static {
            ?? obj = new Object();
            f9164a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.UserLoginDto", obj, 3);
            c1Var.l("Token", false);
            c1Var.l("Score", false);
            c1Var.l("SoftcoreScore", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            int i2 = 0;
            String str = null;
            long j2 = 0;
            long j10 = 0;
            boolean z10 = true;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 != 1) {
                            if (g10 == 2) {
                                j10 = a10.f(eVar, 2);
                                i2 |= 4;
                            } else {
                                throw new jd.k(g10);
                            }
                        } else {
                            j2 = a10.f(eVar, 1);
                            i2 |= 2;
                        }
                    } else {
                        str = a10.m(eVar, 0);
                        i2 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new j(i2, str, j2, j10);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            q0 q0Var = q0.f10352a;
            return new jd.a[]{o1.f10343a, q0Var, q0Var};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar = (ij.a) a10;
            aVar.K(eVar, 0, jVar.f9161a);
            aVar.I(eVar, 1, jVar.f9162b);
            aVar.I(eVar, 2, jVar.f9163c);
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
            return a.f9164a;
        }
    }

    public /* synthetic */ j(int i2, String str, long j2, long j10) {
        if (7 == (i2 & 7)) {
            this.f9161a = str;
            this.f9162b = j2;
            this.f9163c = j10;
            return;
        }
        a1.j(i2, 7, a.f9164a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (nc.k.a(this.f9161a, jVar.f9161a) && this.f9162b == jVar.f9162b && this.f9163c == jVar.f9163c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9163c) + w.d.f(this.f9162b, this.f9161a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UserLoginDto(token=" + this.f9161a + ", score=" + this.f9162b + ", softcoreScore=" + this.f9163c + ")";
    }
}
