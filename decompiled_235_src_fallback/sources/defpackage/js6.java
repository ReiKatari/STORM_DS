package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js6  reason: default package */
/* loaded from: classes.dex */
public final class js6 implements java.lang.CharSequence {
    public char[] A;
    public java.lang.String B;

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            char[] r0 = r0.A
            char r0 = r0[r1]
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            char[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r1.A
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.B
            if (r0 != 0) goto Ld
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.A
            r0.<init>(r1)
            r2.B = r0
        Ld:
            java.lang.String r2 = r2.B
            return r2
    }
}
