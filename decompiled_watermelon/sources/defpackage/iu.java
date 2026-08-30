package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iu  reason: default package */
/* loaded from: classes.dex */
public class iu implements ez6 {
    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        Type componentType;
        Type type = n07Var.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new ju(qo2Var, qo2Var.d(new n07(componentType)), l07.S(componentType));
    }
}
