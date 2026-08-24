package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu  reason: default package */
/* loaded from: classes.dex */
public final class lu implements CharSequence {
    public final char[] A;
    public int B;

    public lu(char[] cArr) {
        this.A = cArr;
        this.B = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.A[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return xs6.V(this.A, i, Math.min(i2, this.B));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.B;
        return xs6.V(this.A, 0, Math.min(i, i));
    }
}
