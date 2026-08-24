package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zy  reason: default package */
/* loaded from: classes.dex */
public final class zy {
    public final android.util.Size a;
    public final android.graphics.Rect b;
    public final defpackage.eg0 c;
    public final int d;
    public final boolean e;

    public zy(android.util.Size r2, android.graphics.Rect r3, defpackage.eg0 r4, int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L19
            r1.a = r2
            if (r3 == 0) goto L13
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
        L13:
            java.lang.String r1 = "Null inputCropRect"
            defpackage.u34.x(r1)
            throw r0
        L19:
            java.lang.String r1 = "Null inputSize"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.zy
            r2 = 0
            if (r1 == 0) goto L3b
            zy r5 = (defpackage.zy) r5
            android.util.Size r1 = r4.a
            android.util.Size r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            android.graphics.Rect r1 = r4.b
            android.graphics.Rect r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            eg0 r1 = r5.c
            eg0 r3 = r4.c
            if (r3 != 0) goto L28
            if (r1 != 0) goto L3b
            goto L2e
        L28:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L3b
        L2e:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 != r3) goto L3b
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 != r5) goto L3b
            return r0
        L3b:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.graphics.Rect r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            eg0 r2 = r3.c
            if (r2 != 0) goto L19
            r2 = 0
            goto L1d
        L19:
            int r2 = r2.hashCode()
        L1d:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r3 = r3.e
            if (r3 == 0) goto L2a
            r3 = 1231(0x4cf, float:1.725E-42)
            goto L2c
        L2a:
            r3 = 1237(0x4d5, float:1.733E-42)
        L2c:
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraInputInfo{inputSize="
            r0.<init>(r1)
            android.util.Size r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", inputCropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cameraInternal="
            r0.append(r1)
            eg0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mirroring="
            r0.append(r1)
            boolean r2 = r2.e
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
