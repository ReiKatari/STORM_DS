package a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends zb.u {
    public int A;
    public final /* synthetic */ x0 B;

    public y0(x0 x0Var) {
        this.B = x0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A < this.B.g()) {
            return true;
        }
        return false;
    }

    @Override // zb.u
    public final int nextInt() {
        int i2 = this.A;
        this.A = i2 + 1;
        return this.B.e(i2);
    }
}
