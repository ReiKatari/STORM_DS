package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd3  reason: default package */
/* loaded from: classes.dex */
public final class gd3 {
    public final java.lang.Integer a;
    public final java.lang.Object b;

    public gd3(java.lang.Integer r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.gd3
            if (r0 != 0) goto L8
            goto L1f
        L8:
            gd3 r3 = (defpackage.gd3) r3
            java.lang.Integer r0 = r2.a
            java.lang.Integer r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.Object r2 = r2.b
            java.lang.Object r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Integer r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r2 = r2.b
            boolean r1 = r2 instanceof java.lang.Enum
            if (r1 == 0) goto L15
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r2.ordinal()
            goto L1d
        L15:
            if (r2 == 0) goto L1c
            int r2 = r2.hashCode()
            goto L1d
        L1c:
            r2 = 0
        L1d:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JoinedKey(left="
            r0.<init>(r1)
            java.lang.Integer r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            java.lang.Object r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
