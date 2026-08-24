package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ky  reason: default package */
/* loaded from: classes.dex */
public final class ky {
    public final java.lang.Object a;

    public ky(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ky
            r2 = 0
            if (r1 == 0) goto L13
            ky r4 = (defpackage.ky) r4
            java.lang.Object r3 = r3.a
            java.lang.Object r4 = r4.a
            if (r3 == r4) goto L12
            return r2
        L12:
            return r0
        L13:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r1 = r1.a
            int r1 = r1.hashCode()
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Identifier{value="
            r0.<init>(r1)
            java.lang.Object r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
