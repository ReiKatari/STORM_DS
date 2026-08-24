package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si2  reason: default package */
/* loaded from: classes.dex */
public final class si2 {
    public java.lang.String a;
    public java.lang.String b;
    public java.util.List c;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.si2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            si2 r5 = (defpackage.si2) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.util.List r4 = r4.c
            java.util.List r5 = r5.c
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            java.lang.String r1 = r2.b
            java.util.List r2 = r2.c
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = java.util.Objects.hash(r2)
            return r2
    }
}
