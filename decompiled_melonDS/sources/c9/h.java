package c9;

import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements cd.i, nc.g {
    public final /* synthetic */ k A;

    public h(k kVar) {
        this.A = kVar;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        this.A.k((g) obj);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return y.f14813a;
    }

    @Override // nc.g
    public final yb.d b() {
        return new nc.a(2, 4, k.class, this.A, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cd.i) && (obj instanceof nc.g)) {
            return b().equals(((nc.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
