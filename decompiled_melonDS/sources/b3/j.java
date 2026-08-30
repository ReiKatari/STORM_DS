package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p f1767a;

    /* renamed from: b  reason: collision with root package name */
    public final p f1768b;

    public j(p pVar, p pVar2) {
        this.f1767a = pVar;
        this.f1768b = pVar2;
    }

    @Override // b3.p
    public final boolean a(mc.l lVar) {
        if (this.f1767a.a(lVar) && this.f1768b.a(lVar)) {
            return true;
        }
        return false;
    }

    @Override // b3.p
    public final Object b(Object obj, mc.p pVar) {
        return this.f1768b.b(this.f1767a.b(obj, pVar), pVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f1767a.equals(jVar.f1767a) && nc.k.a(this.f1768b, jVar.f1768b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1768b.hashCode() * 31) + this.f1767a.hashCode();
    }

    public final String toString() {
        return w.d.r(new StringBuilder("["), (String) b("", i.B), ']');
    }
}
