package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sg6  reason: default package */
/* loaded from: classes.dex */
public final class sg6 implements CharSequence {
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
