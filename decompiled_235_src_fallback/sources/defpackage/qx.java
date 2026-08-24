package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx  reason: default package */
/* loaded from: classes.dex */
public final class qx {
    public final defpackage.m00 a;
    public final long b;

    public qx(defpackage.m00 r1, long r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.a = r1
            r0.b = r2
            return
        La:
            java.lang.String r0 = "Null status"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.qx
            r2 = 0
            if (r1 == 0) goto L1e
            qx r6 = (defpackage.qx) r6
            m00 r1 = r5.a
            m00 r3 = r6.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e
            long r3 = r5.b
            long r5 = r6.b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L1e
            return r0
        L1e:
            return r2
    }

    public final int hashCode() {
            r6 = this;
            m00 r0 = r6.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            r1 = 32
            long r2 = r6.b
            long r4 = r2 >>> r1
            long r1 = r4 ^ r2
            int r6 = (int) r1
            r6 = r6 ^ r0
            return r6
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackendResponse{status="
            r0.<init>(r1)
            m00 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", nextRequestWaitMillis="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = "}"
            java.lang.String r3 = defpackage.lb1.p(r0, r1, r3)
            return r3
    }
}
