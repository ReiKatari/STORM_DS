package wa;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements GenericArrayType, Serializable {
    public final Type A;

    public f(Type type) {
        Objects.requireNonNull(type);
        this.A = i.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && i.d(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.A;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return i.k(this.A) + "[]";
    }
}
