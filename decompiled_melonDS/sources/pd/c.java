package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements CharSequence {
    public final char[] A;
    public int B;

    public c(char[] cArr) {
        this.A = cArr;
        this.B = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.A[i2];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i10) {
        return vc.o.M(this.A, i2, Math.min(i10, this.B));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i2 = this.B;
        return vc.o.M(this.A, 0, Math.min(i2, i2));
    }
}
