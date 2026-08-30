package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements v, zc.u {
    public final r A;
    public final cc.g B;

    public s(r rVar, cc.g gVar) {
        gVar.getClass();
        this.A = rVar;
        this.B = gVar;
        if (rVar.b() == q.DESTROYED) {
            zc.x.e(gVar, null);
        }
    }

    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        r rVar = this.A;
        if (rVar.b().compareTo(q.DESTROYED) <= 0) {
            rVar.c(this);
            zc.x.e(this.B, null);
        }
    }

    @Override // zc.u
    public final cc.g v() {
        return this.B;
    }
}
