package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga  reason: default package */
/* loaded from: classes.dex */
public final class ga {
    public final java.lang.String a;
    public final java.lang.String b;

    public ga(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ga
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ga r5 = (defpackage.ga) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = r2.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r2.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", libraryName="
            java.lang.String r1 = ")"
            java.lang.String r2 = "DriverMetadata(name="
            java.lang.String r3 = r4.a
            java.lang.String r4 = r4.b
            java.lang.String r4 = defpackage.lb1.n(r2, r3, r0, r4, r1)
            return r4
    }
}
