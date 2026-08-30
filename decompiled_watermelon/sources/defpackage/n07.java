package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n07  reason: default package */
/* loaded from: classes.dex */
public class n07<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public n07() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == n07.class) {
                Type u = l07.u(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(u);
                }
                this.b = u;
                this.a = l07.S(u);
                this.c = u.hashCode();
                return;
            }
        } else if (genericSuperclass == n07.class) {
            i.n("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        i.n("Must only create direct subclasses of TypeToken");
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
                i.i("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                return;
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
        sb.append(typeVariable.getName());
        sb.append(" declared by ");
        sb.append(typeVariable.getGenericDeclaration());
        vd6.h(sb, "\nSee ", "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n07) {
            if (l07.I(this.b, ((n07) obj).b)) {
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
        return l07.w0(this.b);
    }

    public n07(Type type) {
        Objects.requireNonNull(type);
        Type u = l07.u(type);
        this.b = u;
        this.a = l07.S(u);
        this.c = u.hashCode();
    }
}
