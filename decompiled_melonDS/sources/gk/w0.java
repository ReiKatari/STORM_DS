package gk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 implements ParameterizedType {
    public final Type A;
    public final Type B;
    public final Type[] L;

    public w0(Type type, Type type2, Type... typeArr) {
        boolean z10;
        if (type2 instanceof Class) {
            if (type == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != (((Class) type2).getEnclosingClass() == null)) {
                fj.j.b();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            y0.d(type3);
        }
        this.A = type;
        this.B = type2;
        this.L = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && y0.e(this, (ParameterizedType) obj)) {
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
            return y0.s(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(y0.s(type));
        sb2.append("<");
        sb2.append(y0.s(typeArr[0]));
        for (int i2 = 1; i2 < typeArr.length; i2++) {
            sb2.append(", ");
            sb2.append(y0.s(typeArr[i2]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
