package gk;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements WildcardType {
    public final Type A;
    public final Type B;

    public x0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    y0.d(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.B = typeArr2[0];
                        this.A = Object.class;
                        return;
                    }
                    fj.j.b();
                    throw null;
                }
                typeArr[0].getClass();
                y0.d(typeArr[0]);
                this.B = null;
                this.A = typeArr[0];
                return;
            }
            fj.j.b();
            throw null;
        }
        fj.j.b();
        throw null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && y0.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.B;
        return type != null ? new Type[]{type} : y0.f5814a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.A};
    }

    public final int hashCode() {
        int i2;
        Type type = this.B;
        if (type != null) {
            i2 = type.hashCode() + 31;
        } else {
            i2 = 1;
        }
        return i2 ^ (this.A.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.B;
        if (type != null) {
            return "? super " + y0.s(type);
        }
        Type type2 = this.A;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + y0.s(type2);
    }
}
