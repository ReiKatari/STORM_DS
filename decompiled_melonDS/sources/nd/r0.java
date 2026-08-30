package nd;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 implements Map.Entry, oc.a {
    public final Object A;
    public final Object B;

    public r0(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (nc.k.a(this.A, r0Var.A) && nc.k.a(this.B, r0Var.B)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        Object obj = this.A;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.B;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i10 + i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.A + ", value=" + this.B + ')';
    }
}
