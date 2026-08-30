package wa;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements ParameterizedType, Serializable {
    public final Type A;
    public final Type B;
    public final Type[] L;

    public g(Type type, Class cls, Type... typeArr) {
        Type a10;
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            fj.j.r(cls, "Must specify owner type for ");
            throw null;
        }
        if (type == null) {
            a10 = null;
        } else {
            a10 = i.a(type);
        }
        this.A = a10;
        this.B = i.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.L = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.L[i2]);
            i.b(this.L[i2]);
            Type[] typeArr3 = this.L;
            typeArr3[i2] = i.a(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && i.d(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.L.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.A;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.B;
    }

    public final int hashCode() {
        int i2;
        int hashCode = Arrays.hashCode(this.L) ^ this.B.hashCode();
        Type type = this.A;
        if (type != null) {
            i2 = type.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        Type[] typeArr = this.L;
        int length = typeArr.length;
        Type type = this.B;
        if (length == 0) {
            return i.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(i.k(type));
        sb2.append("<");
        sb2.append(i.k(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb2.append(", ");
            sb2.append(i.k(typeArr[i2]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
