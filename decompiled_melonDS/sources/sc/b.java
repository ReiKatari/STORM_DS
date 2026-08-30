package sc;

import a0.j;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b implements Iterable, oc.a {
    public final int A;
    public final int B;
    public final int L;

    public b(int i2, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.A = i2;
                this.B = a.a.E(i2, i10, i11);
                this.L = i11;
                return;
            }
            j.h("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        j.h("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.A == bVar.A && this.B == bVar.B && this.L == bVar.L) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A * 31) + this.B) * 31) + this.L;
    }

    public boolean isEmpty() {
        int i2 = this.B;
        int i10 = this.L;
        int i11 = this.A;
        if (i10 > 0) {
            if (i11 <= i2) {
                return false;
            }
            return true;
        } else if (i11 >= i2) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.A, this.B, this.L);
    }

    public String toString() {
        StringBuilder sb2;
        int i2 = this.B;
        int i10 = this.L;
        int i11 = this.A;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i2);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i2);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
