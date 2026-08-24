package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh1  reason: default package */
/* loaded from: classes.dex */
public final class wh1 {
    public final java.lang.Class a;
    public final int b;
    public final int c;

    public wh1(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.b = r1
            r0.c = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.wh1
            if (r0 == 0) goto L1a
            wh1 r3 = (defpackage.wh1) r3
            java.lang.Class r0 = r2.a
            java.lang.Class r1 = r3.a
            if (r0 != r1) goto L1a
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L1a
            int r2 = r2.c
            int r3 = r3.c
            if (r2 != r3) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r3 = r3.c
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency{anInterface="
            r0.<init>(r1)
            java.lang.Class r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.b
            r2 = 1
            if (r1 != r2) goto L19
            java.lang.String r1 = "required"
            goto L20
        L19:
            if (r1 != 0) goto L1e
            java.lang.String r1 = "optional"
            goto L20
        L1e:
            java.lang.String r1 = "set"
        L20:
            r0.append(r1)
            java.lang.String r1 = ", injection="
            r0.append(r1)
            int r3 = r3.c
            if (r3 == 0) goto L43
            if (r3 == r2) goto L40
            r1 = 2
            if (r3 != r1) goto L34
            java.lang.String r3 = "deferred"
            goto L45
        L34:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unsupported injection: "
            java.lang.String r3 = defpackage.lb1.g(r3, r1)
            r0.<init>(r3)
            throw r0
        L40:
            java.lang.String r3 = "provider"
            goto L45
        L43:
            java.lang.String r3 = "direct"
        L45:
            java.lang.String r1 = "}"
            java.lang.String r3 = defpackage.i61.n(r0, r3, r1)
            return r3
    }
}
