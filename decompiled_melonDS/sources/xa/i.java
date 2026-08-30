package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i implements ua.v {
    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        Class cls = aVar.f2155a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new j(cls);
        }
        return null;
    }
}
