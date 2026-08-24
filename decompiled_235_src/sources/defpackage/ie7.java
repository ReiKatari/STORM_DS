package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie7  reason: default package */
/* loaded from: classes.dex */
public class ie7<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public ie7() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == ie7.class) {
                Type l = q60.l(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(l);
                }
                this.b = l;
                this.a = q60.J(l);
                this.c = l.hashCode();
                return;
            }
        } else if (genericSuperclass == ie7.class) {
            i.m("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        i.m("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public static void a(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    a(actualTypeArguments[i]);
                    i++;
                }
                return;
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    a(upperBounds[i]);
                    i++;
                }
                return;
            } else if (type != null) {
                return;
            } else {
                i.h("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                return;
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
        sb.append(typeVariable.getName());
        sb.append(" declared by ");
        sb.append(typeVariable.getGenericDeclaration());
        fa6.g(sb, "\nSee ", "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ie7) {
            if (q60.z(this.b, ((ie7) obj).b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return q60.b0(this.b);
    }

    public ie7(Type type) {
        Objects.requireNonNull(type);
        Type l = q60.l(type);
        this.b = l;
        this.a = q60.J(l);
        this.c = l.hashCode();
    }
}
