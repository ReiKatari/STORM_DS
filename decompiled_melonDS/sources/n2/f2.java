package n2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f2 implements a3.d, Iterable, oc.a {
    public final e2 A;
    public final int B;
    public final int L;

    public f2(e2 e2Var, int i2, int i10) {
        this.A = e2Var;
        this.B = i2;
        this.L = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2) {
            f2 f2Var = (f2) obj;
            if (f2Var.B == this.B && f2Var.L == this.L && f2Var.A.equals(this.A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A.hashCode() * 31) + this.B;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e2 e2Var = this.A;
        if (e2Var.f9899b0 != this.L) {
            g2.e();
        }
        int i2 = this.B;
        e2Var.f(i2);
        return new l0(e2Var, i2 + 1, e2Var.A[(i2 * 5) + 3] + i2);
    }
}
