package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f9665a;

    /* renamed from: b  reason: collision with root package name */
    public final a4.n f9666b;

    public a(oi.b bVar, a4.n nVar) {
        this.f9665a = bVar;
        this.f9666b = nVar;
    }

    @Override // mh.h
    public final a4.n a() {
        return this.f9666b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f9665a.equals(aVar.f9665a) || !this.f9666b.equals(aVar.f9666b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9666b.hashCode() + (this.f9665a.hashCode() * 31);
    }

    public final String toString() {
        return "AchievementPrimed(achievement=" + this.f9665a + ", state=" + this.f9666b + ")";
    }
}
