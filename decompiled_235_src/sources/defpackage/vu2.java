package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu2  reason: default package */
/* loaded from: classes.dex */
public final class vu2 implements ParameterizedType {
    public final /* synthetic */ int A = 0;
    public final Type B;
    public final Type L;
    public final Type[] R;

    public vu2(Type type, Class cls, Type[] typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            e41.w(cls, "Must specify owner type for ");
            throw null;
        }
        this.B = type != null ? q60.l(type) : null;
        this.L = q60.l(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.R = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.R[i]);
            q60.p(this.R[i]);
            Type[] typeArr3 = this.R;
            typeArr3[i] = q60.l(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof ParameterizedType) || !q60.z(this, (ParameterizedType) obj)) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof ParameterizedType) || !ak7.Q(this, (ParameterizedType) obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        int i = this.A;
        Type[] typeArr = this.R;
        switch (i) {
            case 0:
                return (Type[]) typeArr.clone();
            default:
                return (Type[]) typeArr.clone();
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L;
        }
    }

    public final int hashCode() {
        int i = this.A;
        int i2 = 0;
        Type type = this.B;
        Type type2 = this.L;
        Type[] typeArr = this.R;
        switch (i) {
            case 0:
                int hashCode = Arrays.hashCode(typeArr) ^ type2.hashCode();
                if (type != null) {
                    i2 = type.hashCode();
                }
                return hashCode ^ i2;
            default:
                int hashCode2 = Arrays.hashCode(typeArr) ^ type2.hashCode();
                if (type != null) {
                    i2 = type.hashCode();
                }
                return hashCode2 ^ i2;
        }
    }

    public final String toString() {
        int i = this.A;
        Type[] typeArr = this.R;
        int i2 = 1;
        Type type = this.L;
        switch (i) {
            case 0:
                int length = typeArr.length;
                if (length == 0) {
                    return q60.b0(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(q60.b0(type));
                sb.append("<");
                sb.append(q60.b0(typeArr[0]));
                while (i2 < length) {
                    sb.append(", ");
                    sb.append(q60.b0(typeArr[i2]));
                    i2++;
                }
                sb.append(">");
                return sb.toString();
            default:
                if (typeArr.length == 0) {
                    return ak7.J0(type);
                }
                StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
                sb2.append(ak7.J0(type));
                sb2.append("<");
                sb2.append(ak7.J0(typeArr[0]));
                while (i2 < typeArr.length) {
                    sb2.append(", ");
                    sb2.append(ak7.J0(typeArr[i2]));
                    i2++;
                }
                sb2.append(">");
                return sb2.toString();
        }
    }

    public vu2(Type type, Type type2, Type[] typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                u34.t();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            ak7.K(type3);
        }
        this.B = type;
        this.L = type2;
        this.R = (Type[]) typeArr.clone();
    }
}
