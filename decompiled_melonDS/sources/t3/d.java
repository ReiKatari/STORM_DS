package t3;

import a4.j1;
import b3.o;
import mc.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final l f13108a;

    /* renamed from: b  reason: collision with root package name */
    public final l f13109b;

    public d(l lVar, l lVar2) {
        this.f13108a = lVar;
        this.f13109b = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t3.f, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? oVar = new o();
        oVar.f13110i0 = this.f13108a;
        oVar.f13111j0 = this.f13109b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f13108a == dVar.f13108a && this.f13109b == dVar.f13109b) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        f fVar = (f) oVar;
        fVar.f13110i0 = this.f13108a;
        fVar.f13111j0 = this.f13109b;
    }

    public final int hashCode() {
        int i2;
        int i10 = 0;
        l lVar = this.f13108a;
        if (lVar != null) {
            i2 = lVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = i2 * 31;
        l lVar2 = this.f13109b;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return i11 + i10;
    }
}
