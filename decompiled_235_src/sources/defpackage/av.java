package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av  reason: default package */
/* loaded from: classes.dex */
public class av implements zc7 {
    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        Type componentType;
        Type type = ie7Var.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new bv(su2Var, su2Var.d(new ie7(componentType)), q60.J(componentType));
    }
}
