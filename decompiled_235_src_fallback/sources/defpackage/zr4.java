package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr4  reason: default package */
/* loaded from: classes.dex */
public final class zr4 {
    public final defpackage.gj a;
    public final int b;
    public final int c;

    public zr4(defpackage.gj r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L20
        L3:
            boolean r0 = r4 instanceof defpackage.zr4
            r1 = 0
            if (r0 != 0) goto L9
            goto L1f
        L9:
            zr4 r4 = (defpackage.zr4) r4
            gj r0 = r3.a
            gj r2 = r4.a
            if (r0 == r2) goto L12
            return r1
        L12:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L19
            goto L1f
        L19:
            int r3 = r3.c
            int r4 = r4.c
            if (r3 == r4) goto L20
        L1f:
            return r1
        L20:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            gj r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.c
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphIntrinsicInfo(intrinsics="
            r0.<init>(r1)
            gj r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
