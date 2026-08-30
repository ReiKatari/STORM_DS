package fc;

import java.io.Serializable;
import java.util.RandomAccess;
import zb.e;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends e implements a, RandomAccess, Serializable {
    public final Enum[] A;

    public b(Enum[] enumArr) {
        enumArr.getClass();
        this.A = enumArr;
    }

    @Override // zb.b
    public final int a() {
        return this.A.length;
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        if (((Enum) k.z(r42.ordinal(), this.A)) != r42) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Enum[] enumArr = this.A;
        int length = enumArr.length;
        if (i2 >= 0 && i2 < length) {
            return enumArr[i2];
        }
        wa.b.f(kc.a.d(i2, length, "index: ", ", size: "));
        return null;
    }

    @Override // zb.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) k.z(ordinal, this.A)) != r42) {
            return -1;
        }
        return ordinal;
    }

    @Override // zb.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) k.z(ordinal, this.A)) != r42) {
            return -1;
        }
        return ordinal;
    }
}
