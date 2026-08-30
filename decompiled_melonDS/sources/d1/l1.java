package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface l1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        if (nc.k.a(obj, a()) && nc.k.a(obj2, c())) {
            return true;
        }
        return false;
    }

    Object c();
}
