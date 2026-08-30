package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final o f14582a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14583b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14584c;

    public n(o oVar, int i2, int i10) {
        oVar.getClass();
        this.f14582a = oVar;
        this.f14583b = i2;
        this.f14584c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nc.k.a(this.f14582a, nVar.f14582a) && this.f14583b == nVar.f14583b && this.f14584c == nVar.f14584c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14584c) + w.d.c(this.f14583b, this.f14582a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RARuntimeUserAchievement(userAchievement=");
        sb2.append(this.f14582a);
        sb2.append(", progress=");
        sb2.append(this.f14583b);
        sb2.append(", target=");
        return w.d.q(sb2, this.f14584c, ")");
    }
}
