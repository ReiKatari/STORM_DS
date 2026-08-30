package wa;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements WildcardType, Serializable {
    public final Type A;
    public final Type B;

    public h(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Objects.requireNonNull(typeArr2[0]);
                    i.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.B = i.a(typeArr2[0]);
                        this.A = Object.class;
                        return;
                    }
                    a0.j.h("When lower bound is specified, upper bound must be Object");
                    throw null;
                }
                Objects.requireNonNull(typeArr[0]);
                i.b(typeArr[0]);
                this.B = null;
                this.A = i.a(typeArr[0]);
                return;
            }
            a0.j.h("Exactly one upper bound must be specified");
            throw null;
        }
        a0.j.h("At most one lower bound is supported");
        throw null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && i.d(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.B;
        return type != null ? new Type[]{type} : i.f14181a;
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
            return "? super " + i.k(type);
        }
        Type type2 = this.A;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + i.k(type2);
    }
}
