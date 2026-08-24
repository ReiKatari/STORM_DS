package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu  reason: default package */
/* loaded from: classes.dex */
public final class lu implements java.lang.CharSequence {
    public final char[] A;
    public int B;

    public lu(char[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            int r1 = r1.length
            r0.B = r1
            return
    }

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
            int r0 = r0.B
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            int r0 = r1.B
            int r3 = java.lang.Math.min(r3, r0)
            char[] r1 = r1.A
            java.lang.String r1 = defpackage.xs6.V(r1, r2, r3)
            return r1
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.B
            char[] r2 = r2.A
            int r0 = java.lang.Math.min(r0, r0)
            r1 = 0
            java.lang.String r2 = defpackage.xs6.V(r2, r1, r0)
            return r2
    }
}
