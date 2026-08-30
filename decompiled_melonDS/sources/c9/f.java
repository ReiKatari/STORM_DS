package c9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final n3.b f2730a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.q f2731b;

    public f(n3.b bVar, m9.q qVar) {
        this.f2730a = bVar;
        this.f2731b = qVar;
    }

    @Override // c9.g
    public final n3.b a() {
        return this.f2730a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!this.f2730a.equals(fVar.f2730a) || !this.f2731b.equals(fVar.f2731b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2731b.hashCode() + (this.f2730a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f2730a + ", result=" + this.f2731b + ')';
    }
}
