package ec;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(cc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.g() != cc.h.A) {
            a0.j.h("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // cc.c
    public final cc.g g() {
        return cc.h.A;
    }
}
