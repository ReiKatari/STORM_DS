package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy  reason: default package */
/* loaded from: classes.dex */
public final class qy extends defpackage.te4 {
    public final defpackage.se4 a;
    public final defpackage.re4 b;

    public qy(defpackage.se4 r1, defpackage.re4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.te4
            r2 = 0
            if (r1 == 0) goto L38
            te4 r5 = (defpackage.te4) r5
            se4 r1 = r4.a
            if (r1 != 0) goto L17
            r1 = r5
            qy r1 = (defpackage.qy) r1
            se4 r1 = r1.a
            if (r1 != 0) goto L38
            goto L22
        L17:
            r3 = r5
            qy r3 = (defpackage.qy) r3
            se4 r3 = r3.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
        L22:
            re4 r4 = r4.b
            if (r4 != 0) goto L2d
            qy r5 = (defpackage.qy) r5
            re4 r4 = r5.b
            if (r4 != 0) goto L38
            goto L37
        L2d:
            qy r5 = (defpackage.qy) r5
            re4 r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L38
        L37:
            return r0
        L38:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            se4 r1 = r3.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r2
            int r1 = r1 * r2
            re4 r3 = r3.b
            if (r3 != 0) goto L15
            goto L19
        L15:
            int r0 = r3.hashCode()
        L19:
            r3 = r1 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NetworkConnectionInfo{networkType="
            r0.<init>(r1)
            se4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mobileSubtype="
            r0.append(r1)
            re4 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
