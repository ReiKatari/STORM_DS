package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo2  reason: default package */
/* loaded from: classes.dex */
public final class uo2 implements WildcardType {
    public final /* synthetic */ int A;
    public final Type B;
    public final Type L;

    public uo2(Type[] typeArr, Type[] typeArr2, int i) {
        this.A = i;
        switch (i) {
            case 1:
                if (typeArr2.length <= 1) {
                    if (typeArr.length == 1) {
                        if (typeArr2.length == 1) {
                            typeArr2[0].getClass();
                            ct3.H(typeArr2[0]);
                            if (typeArr[0] == Object.class) {
                                this.L = typeArr2[0];
                                this.B = Object.class;
                                return;
                            }
                            c44.r();
                            throw null;
                        }
                        typeArr[0].getClass();
                        ct3.H(typeArr[0]);
                        this.L = null;
                        this.B = typeArr[0];
                        return;
                    }
                    c44.r();
                    throw null;
                }
                c44.r();
                throw null;
            default:
                if (typeArr2.length <= 1) {
                    if (typeArr.length == 1) {
                        if (typeArr2.length == 1) {
                            Objects.requireNonNull(typeArr2[0]);
                            l07.y(typeArr2[0]);
                            if (typeArr[0] == Object.class) {
                                this.L = l07.u(typeArr2[0]);
                                this.B = Object.class;
                                return;
                            }
                            i.i("When lower bound is specified, upper bound must be Object");
                            throw null;
                        }
                        Objects.requireNonNull(typeArr[0]);
                        l07.y(typeArr[0]);
                        this.L = null;
                        this.B = l07.u(typeArr[0]);
                        return;
                    }
                    i.i("Exactly one upper bound must be specified");
                    throw null;
                }
                i.i("At most one lower bound is supported");
                throw null;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof WildcardType) || !l07.I(this, (WildcardType) obj)) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof WildcardType) || !ct3.b0(this, (WildcardType) obj)) {
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
                return type != null ? new Type[]{type} : l07.g;
            default:
                return type != null ? new Type[]{type} : ct3.k0;
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
                    return "? super " + l07.w0(type);
                } else if (type2 == Object.class) {
                    return "?";
                } else {
                    return "? extends " + l07.w0(type2);
                }
            default:
                if (type != null) {
                    return "? super " + ct3.W0(type);
                } else if (type2 == Object.class) {
                    return "?";
                } else {
                    return "? extends " + ct3.W0(type2);
                }
        }
    }
}
