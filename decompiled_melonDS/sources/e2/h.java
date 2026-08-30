package e2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f4208a;

    /* renamed from: b  reason: collision with root package name */
    public l4.h f4209b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4210c = false;

    /* renamed from: d  reason: collision with root package name */
    public d f4211d = null;

    public h(l4.h hVar, l4.h hVar2) {
        this.f4208a = hVar;
        this.f4209b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (nc.k.a(this.f4208a, hVar.f4208a) && nc.k.a(this.f4209b, hVar.f4209b) && this.f4210c == hVar.f4210c && nc.k.a(this.f4211d, hVar.f4211d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e((this.f4209b.hashCode() + (this.f4208a.hashCode() * 31)) * 31, this.f4210c, 31);
        d dVar = this.f4211d;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return e6 + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f4208a) + ", substitution=" + ((Object) this.f4209b) + ", isShowingSubstitution=" + this.f4210c + ", layoutCache=" + this.f4211d + ')';
    }
}
