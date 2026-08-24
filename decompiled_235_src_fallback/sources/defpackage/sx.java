package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx  reason: default package */
/* loaded from: classes.dex */
public final class sx {
    public final defpackage.nh0 a;
    public final defpackage.tx b;

    public sx(defpackage.nh0 r1, defpackage.tx r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.a = r1
            r0.b = r2
            return
        La:
            java.lang.String r0 = "Null type"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof defpackage.sx
            if (r0 == 0) goto L24
            sx r3 = (defpackage.sx) r3
            nh0 r0 = r2.a
            nh0 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            tx r3 = r3.b
            tx r2 = r2.b
            if (r2 != 0) goto L1c
            if (r3 != 0) goto L24
            goto L22
        L1c:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            nh0 r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            tx r2 = r2.b
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            int r2 = r2.hashCode()
        L15:
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraState{type="
            r0.<init>(r1)
            nh0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            tx r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
