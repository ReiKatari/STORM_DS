package i4;

import a4.j1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6709a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.l f6710b;

    public b(mc.l lVar, boolean z10) {
        this.f6709a = z10;
        this.f6710b = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.d, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f6713i0 = this.f6709a;
        oVar.f6714j0 = this.f6710b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f6709a != bVar.f6709a || this.f6710b != bVar.f6710b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        d dVar = (d) oVar;
        dVar.f6713i0 = this.f6709a;
        dVar.f6714j0 = this.f6710b;
    }

    public final int hashCode() {
        return this.f6710b.hashCode() + (Boolean.hashCode(this.f6709a) * 31);
    }
}
