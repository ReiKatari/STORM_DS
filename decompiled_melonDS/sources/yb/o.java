package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Serializable {
    public final Object A;
    public final Object B;
    public final Object L;

    public o(Object obj, Object obj2, Object obj3) {
        this.A = obj;
        this.B = obj2;
        this.L = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (nc.k.a(this.A, oVar.A) && nc.k.a(this.B, oVar.B) && nc.k.a(this.L, oVar.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i2 = 0;
        Object obj = this.A;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.B;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Object obj3 = this.L;
        if (obj3 != null) {
            i2 = obj3.hashCode();
        }
        return i11 + i2;
    }

    public final String toString() {
        return "(" + this.A + ", " + this.B + ", " + this.L + ')';
    }
}
