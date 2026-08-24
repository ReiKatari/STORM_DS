package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz  reason: default package */
/* loaded from: classes.dex */
public final class dz {
    public final android.util.Size a;
    public final java.util.LinkedHashMap b;
    public final android.util.Size c;
    public final java.util.LinkedHashMap d;
    public final android.util.Size e;
    public final java.util.LinkedHashMap f;
    public final java.util.LinkedHashMap g;
    public final java.util.LinkedHashMap h;
    public final java.util.LinkedHashMap i;

    public dz(android.util.Size r1, java.util.LinkedHashMap r2, android.util.Size r3, java.util.LinkedHashMap r4, android.util.Size r5, java.util.LinkedHashMap r6, java.util.LinkedHashMap r7, java.util.LinkedHashMap r8, java.util.LinkedHashMap r9) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
        L18:
            java.lang.String r0 = "Null analysisSize"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L63
        L3:
            boolean r0 = r3 instanceof defpackage.dz
            if (r0 == 0) goto L65
            dz r3 = (defpackage.dz) r3
            android.util.Size r0 = r2.a
            android.util.Size r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r2.b
            java.util.LinkedHashMap r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            android.util.Size r0 = r2.c
            android.util.Size r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r2.d
            java.util.LinkedHashMap r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            android.util.Size r0 = r2.e
            android.util.Size r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r2.f
            java.util.LinkedHashMap r1 = r3.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r2.g
            java.util.LinkedHashMap r1 = r3.g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r2.h
            java.util.LinkedHashMap r1 = r3.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r2 = r2.i
            java.util.LinkedHashMap r3 = r3.i
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L65
        L63:
            r2 = 1
            return r2
        L65:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.d
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.e
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.f
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.g
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.h
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r3 = r3.i
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceSizeDefinition{analysisSize="
            r0.<init>(r1)
            android.util.Size r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", s720pSizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", previewSize="
            r0.append(r1)
            android.util.Size r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", s1440pSizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", recordSize="
            r0.append(r1)
            android.util.Size r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", maximumSizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", maximum4x3SizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", maximum16x9SizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", ultraMaximumSizeMap="
            r0.append(r1)
            java.util.LinkedHashMap r2 = r2.i
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
