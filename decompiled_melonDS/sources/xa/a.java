package xa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a implements ua.v {
    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        Type componentType;
        Type type = aVar.f2156b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(hVar, hVar.c(new bb.a(componentType)), wa.i.g(componentType));
    }
}
