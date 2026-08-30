package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tt  reason: default package */
/* loaded from: classes.dex */
public final class tt implements CharSequence {
    public final char[] A;
    public int B;

    public tt(char[] cArr) {
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
        return gh6.c0(this.A, i, Math.min(i2, this.B));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.B;
        return gh6.c0(this.A, 0, Math.min(i, i));
    }
}
