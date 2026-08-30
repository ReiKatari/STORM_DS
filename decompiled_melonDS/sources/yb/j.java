package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Serializable {
    public final Object A;
    public final Object B;

    public j(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (nc.k.a(this.A, jVar.A) && nc.k.a(this.B, jVar.B)) {
            return true;
        }
        return false;
    }

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

    public final String toString() {
        return "(" + this.A + ", " + this.B + ')';
    }
}
