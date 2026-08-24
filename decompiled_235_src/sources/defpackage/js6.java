package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js6  reason: default package */
/* loaded from: classes.dex */
public final class js6 implements CharSequence {
    public char[] A;
    public String B;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.A[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.A, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.B == null) {
            this.B = new String(this.A);
        }
        return this.B;
    }
}
