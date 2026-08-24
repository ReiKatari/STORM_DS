package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wr4  reason: default package */
/* loaded from: classes.dex */
public final class wr4 {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public wr4(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.wr4
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            wr4 r4 = (defpackage.wr4) r4
            java.lang.Object r0 = r4.a
            java.lang.Object r2 = r3.a
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.Object r4 = r4.b
            java.lang.Object r3 = r3.b
            boolean r3 = java.util.Objects.equals(r4, r3)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            java.lang.Object r2 = r2.b
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r0 = r2.hashCode()
        L14:
            r2 = r1 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pair{"
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.Object r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
