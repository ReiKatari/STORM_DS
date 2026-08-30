package n2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements Iterator, oc.a {
    public final e2 A;
    public final int B;
    public int L;
    public final int R;

    public l0(e2 e2Var, int i2, int i10) {
        this.A = e2Var;
        this.B = i10;
        this.L = i2;
        this.R = e2Var.f9899b0;
        if (e2Var.Z) {
            g2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.L < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        e2 e2Var = this.A;
        int i2 = e2Var.f9899b0;
        int i10 = this.R;
        if (i2 != i10) {
            g2.e();
        }
        int i11 = this.L;
        this.L = e2Var.A[(i11 * 5) + 3] + i11;
        return new f2(e2Var, i11, i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
