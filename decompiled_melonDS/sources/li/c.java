package li;

import nd.a1;
import nd.c1;
import nd.d0;
import nd.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9127a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9129c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9130d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9131e;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9132a;
        private static final ld.e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [li.c$a, nd.d0, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9132a = obj;
            c1 c1Var = new c1("me.magnum.rcheevosapi.dto.AwardAchievementResponseDto", obj, 5);
            c1Var.l("Success", false);
            c1Var.l("AchievementsRemaining", false);
            c1Var.l("Score", false);
            c1Var.l("SoftcoreScore", false);
            c1Var.l("AchievementID", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            ld.e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            boolean z10 = true;
            int i2 = 0;
            boolean z11 = false;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 != 1) {
                            if (g10 != 2) {
                                if (g10 != 3) {
                                    if (g10 == 4) {
                                        i13 = a10.n(eVar, 4);
                                        i2 |= 16;
                                    } else {
                                        throw new jd.k(g10);
                                    }
                                } else {
                                    i12 = a10.n(eVar, 3);
                                    i2 |= 8;
                                }
                            } else {
                                i11 = a10.n(eVar, 2);
                                i2 |= 4;
                            }
                        } else {
                            i10 = a10.n(eVar, 1);
                            i2 |= 2;
                        }
                    } else {
                        z11 = a10.w(eVar, 0);
                        i2 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new c(i2, z11, i10, i11, i12, i13);
        }

        @Override // nd.d0
        public final jd.a[] b() {
            l0 l0Var = l0.f10328a;
            return new jd.a[]{nd.g.f10305a, l0Var, l0Var, l0Var, l0Var};
        }

        @Override // jd.a
        public final void d(md.d dVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            ld.e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ij.a aVar = (ij.a) a10;
            aVar.E(eVar, 0, cVar.f9127a);
            aVar.H(1, cVar.f9128b, eVar);
            aVar.H(2, cVar.f9129c, eVar);
            aVar.H(3, cVar.f9130d, eVar);
            aVar.H(4, cVar.f9131e, eVar);
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
            return a.f9132a;
        }
    }

    public /* synthetic */ c(int i2, boolean z10, int i10, int i11, int i12, int i13) {
        if (31 == (i2 & 31)) {
            this.f9127a = z10;
            this.f9128b = i10;
            this.f9129c = i11;
            this.f9130d = i12;
            this.f9131e = i13;
            return;
        }
        a1.j(i2, 31, a.f9132a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9127a == cVar.f9127a && this.f9128b == cVar.f9128b && this.f9129c == cVar.f9129c && this.f9130d == cVar.f9130d && this.f9131e == cVar.f9131e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9131e) + w.d.c(this.f9130d, w.d.c(this.f9129c, w.d.c(this.f9128b, Boolean.hashCode(this.f9127a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AwardAchievementResponseDto(success=");
        sb2.append(this.f9127a);
        sb2.append(", achievementsRemaining=");
        sb2.append(this.f9128b);
        sb2.append(", score=");
        sb2.append(this.f9129c);
        sb2.append(", softcoreScore=");
        sb2.append(this.f9130d);
        sb2.append(", achievementId=");
        return w.d.q(sb2, this.f9131e, ")");
    }
}
