package a3;

import java.util.List;
import mc.p;
import n2.r;
import o2.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements j0, cc.e {
    public static final x8.e B = new x8.e(2);
    public final r A;

    public f(r rVar) {
        this.A = rVar;
    }

    @Override // cc.g
    public final /* bridge */ cc.g H(cc.g gVar) {
        return pc.a.G(this, gVar);
    }

    @Override // cc.g
    public final Object L(Object obj, p pVar) {
        return pVar.j(obj, this);
    }

    @Override // o2.j0
    public final List b(Integer num) {
        return this.A.E();
    }

    @Override // cc.e
    public final cc.f getKey() {
        return B;
    }

    @Override // cc.g
    public final /* bridge */ cc.g m(cc.f fVar) {
        return pc.a.F(this, fVar);
    }

    @Override // cc.g
    public final /* bridge */ cc.e t(cc.f fVar) {
        return pc.a.w(this, fVar);
    }
}
