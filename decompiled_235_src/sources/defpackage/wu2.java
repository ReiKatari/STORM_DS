package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu2  reason: default package */
/* loaded from: classes.dex */
public final class wu2 implements WildcardType {
    public final /* synthetic */ int A;
    public final Type B;
    public final Type L;

    public wu2(Type[] typeArr, Type[] typeArr2, int i) {
        this.A = i;
        switch (i) {
            case 1:
                if (typeArr2.length <= 1) {
                    if (typeArr.length == 1) {
                        if (typeArr2.length == 1) {
                            typeArr2[0].getClass();
                            ak7.K(typeArr2[0]);
                            if (typeArr[0] == Object.class) {
                                this.L = typeArr2[0];
                                this.B = Object.class;
                                return;
                            }
                            u34.t();
                            throw null;
                        }
                        typeArr[0].getClass();
                        ak7.K(typeArr[0]);
                        this.L = null;
                        this.B = typeArr[0];
                        return;
                    }
                    u34.t();
                    throw null;
                }
                u34.t();
                throw null;
            default:
                if (typeArr2.length <= 1) {
                    if (typeArr.length == 1) {
                        if (typeArr2.length == 1) {
                            Objects.requireNonNull(typeArr2[0]);
                            q60.p(typeArr2[0]);
                            if (typeArr[0] == Object.class) {
                                this.L = q60.l(typeArr2[0]);
                                this.B = Object.class;
                                return;
                            }
                            i.h("When lower bound is specified, upper bound must be Object");
                            throw null;
                        }
                        Objects.requireNonNull(typeArr[0]);
                        q60.p(typeArr[0]);
                        this.L = null;
                        this.B = q60.l(typeArr[0]);
                        return;
                    }
                    i.h("Exactly one upper bound must be specified");
                    throw null;
                }
                i.h("At most one lower bound is supported");
                throw null;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof WildcardType) || !q60.z(this, (WildcardType) obj)) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof WildcardType) || !ak7.Q(this, (WildcardType) obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        int i = this.A;
        Type type = this.L;
        switch (i) {
            case 0:
                return type != null ? new Type[]{type} : q60.h;
            default:
                return type != null ? new Type[]{type} : ak7.h;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        int i = this.A;
        Type type = this.B;
        switch (i) {
            case 0:
                return new Type[]{type};
            default:
                return new Type[]{type};
        }
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A;
        Type type = this.B;
        int i2 = 1;
        Type type2 = this.L;
        switch (i) {
            case 0:
                if (type2 != null) {
                    i2 = type2.hashCode() + 31;
                }
                hashCode = type.hashCode();
                break;
            default:
                if (type2 != null) {
                    i2 = type2.hashCode() + 31;
                }
                hashCode = type.hashCode();
                break;
        }
        return (hashCode + 31) ^ i2;
    }

    public final String toString() {
        int i = this.A;
        Type type = this.L;
        Type type2 = this.B;
        switch (i) {
            case 0:
                if (type != null) {
                    return "? super " + q60.b0(type);
                } else if (type2 == Object.class) {
                    return "?";
                } else {
                    return "? extends " + q60.b0(type2);
                }
            default:
                if (type != null) {
                    return "? super " + ak7.J0(type);
                } else if (type2 == Object.class) {
                    return "?";
                } else {
                    return "? extends " + ak7.J0(type2);
                }
        }
    }
}
