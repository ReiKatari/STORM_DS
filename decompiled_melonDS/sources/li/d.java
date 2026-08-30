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
public final class d {
    public static final b Companion = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final yb.f[] f9133g = {null, null, null, null, null, p7.a.s(yb.h.PUBLICATION, new v3(16))};

    /* renamed from: a  reason: collision with root package name */
    public final long f9134a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9135b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9136c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f9137d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9138e;

    /* renamed from: f  reason: collision with root package name */
    public final List f9139f;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9140a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, li.d$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9140a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.GameAchievementSetsDto", obj, 6);
            c1Var.l("GameId", false);
            c1Var.l("Title", false);
            c1Var.l("ImageIconUrl", false);
            c1Var.l("RichPresenceGameId", false);
            c1Var.l("RichPresencePatch", false);
            c1Var.l("Sets", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            yb.f[] fVarArr = d.f9133g;
            List list = null;
            int i2 = 0;
            long j2 = 0;
            String str = null;
            String str2 = null;
            Long l10 = null;
            String str3 = null;
            boolean z10 = true;
            while (z10) {
                int g10 = a10.g(eVar);
                switch (g10) {
                    case -1:
                        z10 = false;
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
                        l10 = (Long) a10.r(eVar, 3, q0.f10352a, l10);
                        i2 |= 8;
                        break;
                    case 4:
                        str3 = (String) a10.r(eVar, 4, o1.f10343a, str3);
                        i2 |= 16;
                        break;
                    case l1.c.f8511g /* 5 */:
                        list = (List) a10.r(eVar, 5, (jd.a) fVarArr[5].getValue(), list);
                        i2 |= 32;
                        break;
                    default:
                        throw new jd.k(g10);
                }
            }
            a10.b(eVar);
            return new d(i2, j2, str, str2, l10, str3, list);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            yb.f[] fVarArr = d.f9133g;
            q0 q0Var = q0.f10352a;
            o1 o1Var = o1.f10343a;
            return new jd.a[]{q0Var, o1Var, o1Var, a.a.C(q0Var), a.a.C(o1Var), a.a.C((jd.a) fVarArr[5].getValue())};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            d dVar2 = (d) obj;
            dVar2.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            yb.f[] fVarArr = d.f9133g;
            ij.a aVar = (ij.a) a10;
            aVar.I(eVar, 0, dVar2.f9134a);
            aVar.K(eVar, 1, dVar2.f9135b);
            aVar.K(eVar, 2, dVar2.f9136c);
            aVar.g(eVar, 3, q0.f10352a, dVar2.f9137d);
            aVar.g(eVar, 4, o1.f10343a, dVar2.f9138e);
            aVar.g(eVar, 5, (jd.a) fVarArr[5].getValue(), dVar2.f9139f);
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
            return a.f9140a;
        }
    }

    public /* synthetic */ d(int i2, long j2, String str, String str2, Long l10, String str3, List list) {
        if (63 == (i2 & 63)) {
            this.f9134a = j2;
            this.f9135b = str;
            this.f9136c = str2;
            this.f9137d = l10;
            this.f9138e = str3;
            this.f9139f = list;
            return;
        }
        a1.j(i2, 63, a.f9140a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9134a == dVar.f9134a && nc.k.a(this.f9135b, dVar.f9135b) && nc.k.a(this.f9136c, dVar.f9136c) && nc.k.a(this.f9137d, dVar.f9137d) && nc.k.a(this.f9138e, dVar.f9138e) && nc.k.a(this.f9139f, dVar.f9139f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int d4 = w.d.d(w.d.d(Long.hashCode(this.f9134a) * 31, 31, this.f9135b), 31, this.f9136c);
        int i2 = 0;
        Long l10 = this.f9137d;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i10 = (d4 + hashCode) * 31;
        String str = this.f9138e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        List list = this.f9139f;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i11 + i2;
    }

    public final String toString() {
        return "GameAchievementSetsDto(id=" + this.f9134a + ", title=" + this.f9135b + ", iconUrl=" + this.f9136c + ", richPresenceGameId=" + this.f9137d + ", richPresencePatch=" + this.f9138e + ", sets=" + this.f9139f + ")";
    }
}
