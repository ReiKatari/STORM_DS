package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og0  reason: default package */
/* loaded from: classes.dex */
public final class og0 {
    public final android.hardware.camera2.CameraDevice.StateCallback a;
    public final defpackage.u63 b;
    public final defpackage.sq1 c;

    public og0(android.hardware.camera2.CameraDevice.StateCallback r1, defpackage.u63 r2, defpackage.sq1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.og0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            og0 r5 = (defpackage.og0) r5
            android.hardware.camera2.CameraDevice$StateCallback r1 = r4.a
            android.hardware.camera2.CameraDevice$StateCallback r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            u63 r1 = r4.b
            u63 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            sq1 r4 = r4.c
            sq1 r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            android.hardware.camera2.CameraDevice$StateCallback r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            u63 r2 = r4.b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sq1 r4 = r4.c
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            long r2 = r4.a
            int r0 = java.lang.Long.hashCode(r2)
        L25:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraInteropConfig(cameraDeviceStateCallback="
            r0.<init>(r1)
            android.hardware.camera2.CameraDevice$StateCallback r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cameraCaptureSessionListener="
            r0.append(r1)
            u63 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cameraOpenRetryMaxTimeoutNs="
            r0.append(r1)
            sq1 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
