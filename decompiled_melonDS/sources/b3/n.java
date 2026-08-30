package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface n extends p {
    @Override // b3.p
    default boolean a(mc.l lVar) {
        return ((Boolean) lVar.k(this)).booleanValue();
    }

    @Override // b3.p
    default Object b(Object obj, mc.p pVar) {
        return pVar.j(obj, this);
    }
}
