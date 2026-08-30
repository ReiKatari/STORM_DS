package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f9686a;

    /* renamed from: b  reason: collision with root package name */
    public final a4.n f9687b;

    public g(g0 g0Var, a4.n nVar) {
        this.f9686a = g0Var;
        this.f9687b = nVar;
    }

    @Override // mh.h
    public final a4.n a() {
        return this.f9687b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!this.f9686a.equals(gVar.f9686a) || !this.f9687b.equals(gVar.f9687b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9687b.hashCode() + (this.f9686a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerCommunicationFailed(source=" + this.f9686a + ", state=" + this.f9687b + ")";
    }
}
