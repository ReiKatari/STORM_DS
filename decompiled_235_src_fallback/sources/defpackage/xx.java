package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx  reason: default package */
/* loaded from: classes.dex */
public final class xx {
    public final java.lang.String a;
    public final java.lang.Class b;
    public final java.lang.Object c;

    public xx(java.lang.String r1, java.lang.Class r2, android.hardware.camera2.CaptureRequest.Key r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 == 0) goto Lc
            r0.b = r2
            r0.c = r3
            return
        Lc:
            java.lang.String r0 = "Null valueClass"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.xx
            if (r0 == 0) goto L2e
            xx r3 = (defpackage.xx) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            java.lang.Class r0 = r2.b
            java.lang.Class r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            java.lang.Object r3 = r3.c
            java.lang.Object r2 = r2.c
            if (r2 != 0) goto L26
            if (r3 != 0) goto L2e
            goto L2c
        L26:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2e
        L2c:
            r2 = 1
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Class r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Object r3 = r3.c
            if (r3 != 0) goto L19
            r3 = 0
            goto L1d
        L19:
            int r3 = r3.hashCode()
        L1d:
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Option{id="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", valueClass="
            r0.append(r1)
            java.lang.Class r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", token="
            r0.append(r1)
            java.lang.Object r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
