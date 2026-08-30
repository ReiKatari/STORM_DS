package cc;

import mc.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements e {
    public final f A;

    public a(f fVar) {
        this.A = fVar;
    }

    @Override // cc.g
    public final /* bridge */ g H(g gVar) {
        return pc.a.G(this, gVar);
    }

    @Override // cc.g
    public final Object L(Object obj, p pVar) {
        return pVar.j(obj, this);
    }

    @Override // cc.e
    public final f getKey() {
        return this.A;
    }

    @Override // cc.g
    public /* bridge */ g m(f fVar) {
        return pc.a.F(this, fVar);
    }

    @Override // cc.g
    public /* bridge */ e t(f fVar) {
        return pc.a.w(this, fVar);
    }
}
