package bb;

import a0.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import wa.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f2155a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f2156b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2157c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a10 = i.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(a10);
                }
                this.f2156b = a10;
                this.f2155a = i.g(a10);
                this.f2157c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            j.p("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        j.p("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public static void a(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i2 = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i2 < length) {
                    a(actualTypeArguments[i2]);
                    i2++;
                }
                return;
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i2 < length2) {
                    a(upperBounds[i2]);
                    i2++;
                }
                return;
            } else if (type != null) {
                return;
            } else {
                j.h("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                return;
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        StringBuilder sb2 = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
        sb2.append(typeVariable.getName());
        sb2.append(" declared by ");
        sb2.append(typeVariable.getGenericDeclaration());
        fj.j.k(sb2, "\nSee ", "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (i.d(this.f2156b, ((a) obj).f2156b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2157c;
    }

    public final String toString() {
        return i.k(this.f2156b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = i.a(type);
        this.f2156b = a10;
        this.f2155a = i.g(a10);
        this.f2157c = a10.hashCode();
    }
}
