package li;

import g2.v3;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.o1;
import nd.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class b {
    public static final C0004b Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final yb.f[] f9118h;

    /* renamed from: a  reason: collision with root package name */
    public final String f9119a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9120b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9121c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9122d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9123e;

    /* renamed from: f  reason: collision with root package name */
    public final List f9124f;

    /* renamed from: g  reason: collision with root package name */
    public final List f9125g;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9126a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [li.b$a, nd.d0, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9126a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.AchievementSetDto", obj, 7);
            c1Var.l("Title", false);
            c1Var.l("Type", false);
            c1Var.l("AchievementSetId", false);
            c1Var.l("GameId", false);
            c1Var.l("ImageIconUrl", false);
            c1Var.l("Achievements", false);
            c1Var.l("Leaderboards", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            yb.f[] fVarArr = b.f9118h;
            List list = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long j2 = 0;
            long j10 = 0;
            int i2 = 0;
            boolean z10 = true;
            List list2 = null;
            while (z10) {
                int g10 = a10.g(eVar);
                switch (g10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str = (String) a10.r(eVar, 0, o1.f10343a, str);
                        i2 |= 1;
                        break;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        str2 = a10.m(eVar, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        j2 = a10.f(eVar, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        j10 = a10.f(eVar, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str3 = a10.m(eVar, 4);
                        i2 |= 16;
                        break;
                    case l1.c.f8511g /* 5 */:
                        list = (List) a10.o(eVar, 5, (jd.a) fVarArr[5].getValue(), list);
                        i2 |= 32;
                        break;
                    case l1.c.f8509e /* 6 */:
                        list2 = (List) a10.o(eVar, 6, (jd.a) fVarArr[6].getValue(), list2);
                        i2 |= 64;
                        break;
                    default:
                        throw new jd.k(g10);
                }
            }
            a10.b(eVar);
            return new b(i2, str, str2, j2, j10, str3, list, list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            yb.f[] fVarArr = b.f9118h;
            o1 o1Var = o1.f10343a;
            q0 q0Var = q0.f10352a;
            return new jd.a[]{a.a.C(o1Var), o1Var, q0Var, q0Var, o1Var, fVarArr[5].getValue(), fVarArr[6].getValue()};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            yb.f[] fVarArr = b.f9118h;
            a10.g(eVar, 0, o1.f10343a, bVar.f9119a);
            ij.a aVar = (ij.a) a10;
            aVar.K(eVar, 1, bVar.f9120b);
            aVar.I(eVar, 2, bVar.f9121c);
            aVar.I(eVar, 3, bVar.f9122d);
            aVar.K(eVar, 4, bVar.f9123e);
            aVar.J(eVar, 5, (jd.a) fVarArr[5].getValue(), bVar.f9124f);
            aVar.J(eVar, 6, (jd.a) fVarArr[6].getValue(), bVar.f9125g);
            a10.b(eVar);
        }

        @Override // jd.a
        public final ld.e e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: li.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0004b {
        public final jd.a serializer() {
            return a.f9126a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [li.b$b, java.lang.Object] */
    static {
        yb.h hVar = yb.h.PUBLICATION;
        f9118h = new yb.f[]{null, null, null, null, null, p7.a.s(hVar, new v3(14)), p7.a.s(hVar, new v3(15))};
    }

    public /* synthetic */ b(int i2, String str, String str2, long j2, long j10, String str3, List list, List list2) {
        if (127 == (i2 & 127)) {
            this.f9119a = str;
            this.f9120b = str2;
            this.f9121c = j2;
            this.f9122d = j10;
            this.f9123e = str3;
            this.f9124f = list;
            this.f9125g = list2;
            return;
        }
        a1.j(i2, 127, a.f9126a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (nc.k.a(this.f9119a, bVar.f9119a) && nc.k.a(this.f9120b, bVar.f9120b) && this.f9121c == bVar.f9121c && this.f9122d == bVar.f9122d && nc.k.a(this.f9123e, bVar.f9123e) && nc.k.a(this.f9124f, bVar.f9124f) && nc.k.a(this.f9125g, bVar.f9125g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f9119a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d4 = w.d.d(w.d.f(this.f9122d, w.d.f(this.f9121c, w.d.d(hashCode * 31, 31, this.f9120b), 31), 31), 31, this.f9123e);
        return this.f9125g.hashCode() + ((this.f9124f.hashCode() + d4) * 31);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("AchievementSetDto(title=", this.f9119a, ", type=", this.f9120b, ", setId=");
        k10.append(this.f9121c);
        k10.append(", gameId=");
        k10.append(this.f9122d);
        k10.append(", iconUrl=");
        k10.append(this.f9123e);
        k10.append(", achievements=");
        k10.append(this.f9124f);
        k10.append(", leaderboards=");
        k10.append(this.f9125g);
        k10.append(")");
        return k10.toString();
    }
}
