package m6;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements m {
    public final int A;
    public int B = -1;
    public int L = -1;

    public n(int i2) {
        this.A = i2;
    }

    @Override // m6.m
    public final boolean f(CharSequence charSequence, int i2, int i10, u uVar) {
        int i11 = this.A;
        if (i2 <= i11 && i11 < i10) {
            this.B = i2;
            this.L = i10;
            return false;
        } else if (i10 > i11) {
            return false;
        } else {
            return true;
        }
    }

    @Override // m6.m
    public final Object a() {
        return this;
    }
}
