package li;

import me.magnum.melonds.common.camera.DSiCameraSource;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.l0;
import nd.o1;
import nd.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class a {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f9106a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f9107b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f9108c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9109d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9110e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9111f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9112g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9113h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9114i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9115j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9116k;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* renamed from: li.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class C0003a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final C0003a f9117a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [li.a$a, nd.d0, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9117a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.AchievementDto", obj, 11);
            c1Var.l("ID", false);
            c1Var.l("NumAwarded", false);
            c1Var.l("NumAwardedHardcore", false);
            c1Var.l("Title", false);
            c1Var.l("Description", false);
            c1Var.l("Points", false);
            c1Var.l("Flags", false);
            c1Var.l("BadgeURL", false);
            c1Var.l("BadgeLockedURL", false);
            c1Var.l("DisplayOrder", false);
            c1Var.l("MemAddr", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            String str = null;
            int i2 = 0;
            int i10 = 0;
            int i11 = 0;
            long j2 = 0;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
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
                        num = (Integer) a10.r(eVar, 1, l0.f10328a, num);
                        i2 |= 2;
                        break;
                    case 2:
                        num2 = (Integer) a10.r(eVar, 2, l0.f10328a, num2);
                        i2 |= 4;
                        break;
                    case 3:
                        str2 = a10.m(eVar, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str3 = a10.m(eVar, 4);
                        i2 |= 16;
                        break;
                    case l1.c.f8511g /* 5 */:
                        i10 = a10.n(eVar, 5);
                        i2 |= 32;
                        break;
                    case l1.c.f8509e /* 6 */:
                        i11 = a10.n(eVar, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        str4 = a10.m(eVar, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        str5 = a10.m(eVar, 8);
                        i2 |= 256;
                        break;
                    case l1.c.f8508d /* 9 */:
                        str = (String) a10.r(eVar, 9, o1.f10343a, str);
                        i2 |= 512;
                        break;
                    case l1.c.f8510f /* 10 */:
                        str6 = a10.m(eVar, 10);
                        i2 |= 1024;
                        break;
                    default:
                        throw new jd.k(g10);
                }
            }
            a10.b(eVar);
            return new a(i2, j2, num, num2, str2, str3, i10, i11, str4, str5, str, str6);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            l0 l0Var = l0.f10328a;
            jd.a C = a.a.C(l0Var);
            jd.a C2 = a.a.C(l0Var);
            o1 o1Var = o1.f10343a;
            return new jd.a[]{q0.f10352a, C, C2, o1Var, o1Var, l0Var, l0Var, o1Var, o1Var, a.a.C(o1Var), o1Var};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar2 = (ij.a) a10;
            aVar2.I(eVar, 0, aVar.f9106a);
            l0 l0Var = l0.f10328a;
            aVar2.g(eVar, 1, l0Var, aVar.f9107b);
            aVar2.g(eVar, 2, l0Var, aVar.f9108c);
            aVar2.K(eVar, 3, aVar.f9109d);
            aVar2.K(eVar, 4, aVar.f9110e);
            aVar2.H(5, aVar.f9111f, eVar);
            aVar2.H(6, aVar.f9112g, eVar);
            aVar2.K(eVar, 7, aVar.f9113h);
            aVar2.K(eVar, 8, aVar.f9114i);
            aVar2.g(eVar, 9, o1.f10343a, aVar.f9115j);
            aVar2.K(eVar, 10, aVar.f9116k);
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
            return C0003a.f9117a;
        }
    }

    public /* synthetic */ a(int i2, long j2, Integer num, Integer num2, String str, String str2, int i10, int i11, String str3, String str4, String str5, String str6) {
        if (2047 == (i2 & 2047)) {
            this.f9106a = j2;
            this.f9107b = num;
            this.f9108c = num2;
            this.f9109d = str;
            this.f9110e = str2;
            this.f9111f = i10;
            this.f9112g = i11;
            this.f9113h = str3;
            this.f9114i = str4;
            this.f9115j = str5;
            this.f9116k = str6;
            return;
        }
        a1.j(i2, 2047, C0003a.f9117a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9106a == aVar.f9106a && nc.k.a(this.f9107b, aVar.f9107b) && nc.k.a(this.f9108c, aVar.f9108c) && nc.k.a(this.f9109d, aVar.f9109d) && nc.k.a(this.f9110e, aVar.f9110e) && this.f9111f == aVar.f9111f && this.f9112g == aVar.f9112g && nc.k.a(this.f9113h, aVar.f9113h) && nc.k.a(this.f9114i, aVar.f9114i) && nc.k.a(this.f9115j, aVar.f9115j) && nc.k.a(this.f9116k, aVar.f9116k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.f9106a) * 31;
        int i2 = 0;
        Integer num = this.f9107b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.f9108c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int d4 = w.d.d(w.d.d(w.d.c(this.f9112g, w.d.c(this.f9111f, w.d.d(w.d.d((i10 + hashCode2) * 31, 31, this.f9109d), 31, this.f9110e), 31), 31), 31, this.f9113h), 31, this.f9114i);
        String str = this.f9115j;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.f9116k.hashCode() + ((d4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AchievementDto(id=");
        sb2.append(this.f9106a);
        sb2.append(", numAwarded=");
        sb2.append(this.f9107b);
        sb2.append(", numAwardedHardcore=");
        sb2.append(this.f9108c);
        sb2.append(", title=");
        sb2.append(this.f9109d);
        sb2.append(", description=");
        sb2.append(this.f9110e);
        sb2.append(", points=");
        sb2.append(this.f9111f);
        sb2.append(", flags=");
        sb2.append(this.f9112g);
        sb2.append(", badgeUrl=");
        sb2.append(this.f9113h);
        w.d.B(sb2, ", badgeUrlLocked=", this.f9114i, ", displayOrder=", this.f9115j);
        sb2.append(", memoryAddress=");
        sb2.append(this.f9116k);
        sb2.append(")");
        return sb2.toString();
    }
}
