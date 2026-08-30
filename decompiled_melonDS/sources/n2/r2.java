package n2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r2 implements a3.d, Iterable, oc.a {
    public final e2 A;
    public final int B;
    public final w1 L;

    public r2(e2 e2Var, int i2, m0 m0Var, w1 w1Var) {
        this.A = e2Var;
        this.B = i2;
        this.L = w1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r2) {
            r2 r2Var = (r2) obj;
            if (r2Var.B == this.B && r2Var.A.equals(this.A) && r2Var.L.equals(this.L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A.hashCode();
        return this.L.hashCode() + ((hashCode + (this.B * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q2(this.A, this.B, null, this.L);
    }
}
