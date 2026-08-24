package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz  reason: default package */
/* loaded from: classes.dex */
public final class cz {
    public final android.graphics.Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final android.graphics.Matrix e;
    public final boolean f;

    public cz(android.graphics.Rect r2, int r3, int r4, boolean r5, android.graphics.Matrix r6, boolean r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L1b
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            if (r6 == 0) goto L15
            r1.e = r6
            r1.f = r7
            return
        L15:
            java.lang.String r1 = "Null getSensorToBufferTransform"
            defpackage.u34.x(r1)
            throw r0
        L1b:
            java.lang.String r1 = "Null getCropRect"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.cz
            r2 = 0
            if (r1 == 0) goto L38
            cz r5 = (defpackage.cz) r5
            android.graphics.Rect r1 = r4.a
            android.graphics.Rect r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L38
            int r1 = r4.c
            int r3 = r5.c
            if (r1 != r3) goto L38
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 != r3) goto L38
            android.graphics.Matrix r1 = r4.e
            android.graphics.Matrix r3 = r5.e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 != r5) goto L38
            return r0
        L38:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            android.graphics.Rect r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r5.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r5.c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r5.d
            r3 = 1237(0x4d5, float:1.733E-42)
            r4 = 1231(0x4cf, float:1.725E-42)
            if (r2 == 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r2 = r5.e
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r5 = r5.f
            if (r5 == 0) goto L2d
            r3 = r4
        L2d:
            r5 = r0 ^ r3
            return r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransformationInfo{getCropRect="
            r0.<init>(r1)
            android.graphics.Rect r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", getRotationDegrees="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", getTargetRotation="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", hasCameraTransform="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", getSensorToBufferTransform="
            r0.append(r1)
            android.graphics.Matrix r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", isMirroring="
            r0.append(r1)
            boolean r2 = r2.f
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
