package c9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: a  reason: collision with root package name */
    public final n3.b f2727a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.e f2728b;

    public d(n3.b bVar, m9.e eVar) {
        this.f2727a = bVar;
        this.f2728b = eVar;
    }

    @Override // c9.g
    public final n3.b a() {
        return this.f2727a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!nc.k.a(this.f2727a, dVar.f2727a) || !this.f2728b.equals(dVar.f2728b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        n3.b bVar = this.f2727a;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return this.f2728b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f2727a + ", result=" + this.f2728b + ')';
    }
}
