package li;

import me.magnum.melonds.common.camera.DSiCameraSource;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.o1;
import nd.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class f {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f9144a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9145b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9146c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9147d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9148e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9149f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9150g;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9151a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, li.f$a] */
        static {
            ?? obj = new Object();
            f9151a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.LeaderboardDto", obj, 7);
            c1Var.l("ID", false);
            c1Var.l("Mem", false);
            c1Var.l("Format", false);
            c1Var.l("LowerIsBetter", false);
            c1Var.l("Title", false);
            c1Var.l("Description", false);
            c1Var.l("Hidden", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            int i2 = 0;
            boolean z10 = false;
            boolean z11 = false;
            long j2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z12 = true;
            while (z12) {
                int g10 = a10.g(eVar);
                switch (g10) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        j2 = a10.f(eVar, 0);
                        i2 |= 1;
                        break;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        str = a10.m(eVar, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str2 = a10.m(eVar, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        z10 = a10.w(eVar, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str3 = a10.m(eVar, 4);
                        i2 |= 16;
                        break;
                    case l1.c.f8511g /* 5 */:
                        str4 = a10.m(eVar, 5);
                        i2 |= 32;
                        break;
                    case l1.c.f8509e /* 6 */:
                        z11 = a10.w(eVar, 6);
                        i2 |= 64;
                        break;
                    default:
                        throw new jd.k(g10);
                }
            }
            a10.b(eVar);
            return new f(i2, j2, str, str2, z10, str3, str4, z11);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            o1 o1Var = o1.f10343a;
            nd.g gVar = nd.g.f10305a;
            return new jd.a[]{q0.f10352a, o1Var, o1Var, gVar, o1Var, o1Var, gVar};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            f fVar = (f) obj;
            fVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar = (ij.a) a10;
            aVar.I(eVar, 0, fVar.f9144a);
            aVar.K(eVar, 1, fVar.f9145b);
            aVar.K(eVar, 2, fVar.f9146c);
            aVar.E(eVar, 3, fVar.f9147d);
            aVar.K(eVar, 4, fVar.f9148e);
            aVar.K(eVar, 5, fVar.f9149f);
            aVar.E(eVar, 6, fVar.f9150g);
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
            return a.f9151a;
        }
    }

    public /* synthetic */ f(int i2, long j2, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        if (127 == (i2 & 127)) {
            this.f9144a = j2;
            this.f9145b = str;
            this.f9146c = str2;
            this.f9147d = z10;
            this.f9148e = str3;
            this.f9149f = str4;
            this.f9150g = z11;
            return;
        }
        a1.j(i2, 127, a.f9151a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f9144a == fVar.f9144a && nc.k.a(this.f9145b, fVar.f9145b) && nc.k.a(this.f9146c, fVar.f9146c) && this.f9147d == fVar.f9147d && nc.k.a(this.f9148e, fVar.f9148e) && nc.k.a(this.f9149f, fVar.f9149f) && this.f9150g == fVar.f9150g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9150g) + w.d.d(w.d.d(w.d.e(w.d.d(w.d.d(Long.hashCode(this.f9144a) * 31, 31, this.f9145b), 31, this.f9146c), this.f9147d, 31), 31, this.f9148e), 31, this.f9149f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeaderboardDto(id=");
        sb2.append(this.f9144a);
        sb2.append(", mem=");
        sb2.append(this.f9145b);
        sb2.append(", format=");
        sb2.append(this.f9146c);
        sb2.append(", lowerIsBetter=");
        sb2.append(this.f9147d);
        w.d.B(sb2, ", title=", this.f9148e, ", description=", this.f9149f);
        sb2.append(", hidden=");
        sb2.append(this.f9150g);
        sb2.append(")");
        return sb2.toString();
    }
}
