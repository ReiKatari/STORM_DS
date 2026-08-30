package wa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements CharSequence {
    public char[] A;
    public String B;

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.A[i2];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i10) {
        return new String(this.A, i2, i10 - i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.B == null) {
            this.B = new String(this.A);
        }
        return this.B;
    }
}
