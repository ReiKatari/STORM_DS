package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm4  reason: default package */
/* loaded from: classes.dex */
public final class hm4 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.util.Set e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final double h;
    public final boolean i;

    public hm4(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.Set r5, java.lang.String r6, java.lang.String r7, double r8, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L6b
        L4:
            boolean r0 = r5 instanceof defpackage.hm4
            if (r0 != 0) goto L9
            goto L69
        L9:
            hm4 r5 = (defpackage.hm4) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L69
        L16:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L69
        L21:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L69
        L2c:
            java.lang.String r0 = r4.d
            java.lang.String r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L69
        L37:
            java.util.Set r0 = r4.e
            java.util.Set r1 = r5.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L69
        L42:
            java.lang.String r0 = r4.f
            java.lang.String r1 = r5.f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L69
        L4d:
            java.lang.String r0 = r4.g
            java.lang.String r1 = r5.g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            goto L69
        L58:
            double r0 = r4.h
            double r2 = r5.h
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 == 0) goto L63
            goto L69
        L63:
            boolean r4 = r4.i
            boolean r5 = r5.i
            if (r4 == r5) goto L6b
        L69:
            r4 = 0
            return r4
        L6b:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.Set r2 = r4.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.f
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            double r2 = r4.h
            int r2 = java.lang.Double.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r4 = r4.i
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", version="
            java.lang.String r2 = "OnlineVulkanDriver(id="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", releaseDate="
            java.lang.String r2 = ", supportedGpuSeries="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.util.Set r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", downloadUrl="
            r0.append(r1)
            java.lang.String r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", fileSizeMb="
            r0.append(r1)
            double r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", isRecommended="
            r0.append(r1)
            boolean r5 = r5.i
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
