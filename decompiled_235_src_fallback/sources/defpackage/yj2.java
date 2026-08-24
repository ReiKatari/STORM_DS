package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj2  reason: default package */
/* loaded from: classes.dex */
public final class yj2 implements java.lang.Comparable {
    public final int A;
    public final int B;
    public final java.lang.String L;
    public final java.lang.String R;

    public yj2(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r2
            r0.B = r3
            r0.L = r1
            r0.R = r4
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            yj2 r3 = (defpackage.yj2) r3
            r3.getClass()
            int r0 = r2.A
            int r1 = r3.A
            int r0 = r0 - r1
            if (r0 != 0) goto L12
            int r2 = r2.B
            int r3 = r3.B
            int r2 = r2 - r3
            return r2
        L12:
            return r0
    }
}
