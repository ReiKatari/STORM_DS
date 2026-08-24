package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy  reason: default package */
/* loaded from: classes.dex */
public final class cy {
    public final defpackage.qv6 a;
    public final defpackage.qv6 b;
    public final java.util.ArrayList c;

    public cy(defpackage.qv6 r2, defpackage.qv6 r3, java.util.ArrayList r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L15
            r1.a = r2
            if (r3 == 0) goto Lf
            r1.b = r3
            r1.c = r4
            return
        Lf:
            java.lang.String r1 = "Null secondarySurfaceEdge"
            defpackage.u34.x(r1)
            throw r0
        L15:
            java.lang.String r1 = "Null primarySurfaceEdge"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof defpackage.cy
            if (r0 == 0) goto L29
            cy r3 = (defpackage.cy) r3
            qv6 r0 = r2.a
            qv6 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            qv6 r0 = r2.b
            qv6 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            java.util.ArrayList r2 = r2.c
            java.util.ArrayList r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            qv6 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            qv6 r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.ArrayList r3 = r3.c
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "In{primarySurfaceEdge="
            r0.<init>(r1)
            qv6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", secondarySurfaceEdge="
            r0.append(r1)
            qv6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", outConfigs="
            r0.append(r1)
            java.util.ArrayList r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
