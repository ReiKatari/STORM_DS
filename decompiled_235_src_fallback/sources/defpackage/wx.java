package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx  reason: default package */
/* loaded from: classes.dex */
public final class wx extends defpackage.rr0 {
    public final defpackage.qr0 a;
    public final defpackage.ox b;

    public wx(defpackage.qr0 r1, defpackage.ox r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.rr0
            if (r0 == 0) goto L2e
            rr0 r3 = (defpackage.rr0) r3
            qr0 r0 = r2.a
            if (r0 != 0) goto L15
            r0 = r3
            wx r0 = (defpackage.wx) r0
            qr0 r0 = r0.a
            if (r0 != 0) goto L2e
            goto L20
        L15:
            r1 = r3
            wx r1 = (defpackage.wx) r1
            qr0 r1 = r1.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
        L20:
            wx r3 = (defpackage.wx) r3
            ox r3 = r3.b
            ox r2 = r2.b
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
            r2 = this;
            qr0 r0 = r2.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            ox r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClientInfo{clientType="
            r0.<init>(r1)
            qr0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", androidClientInfo="
            r0.append(r1)
            ox r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
