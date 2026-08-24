package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements defpackage.u65 {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean c = false;
    public static final boolean d = false;
    public static final boolean e = false;

    static {
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r1 = defpackage.nb3.k(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.a = r1
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = defpackage.nb3.k(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.b = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Xiaomi"
            boolean r2 = r0.equalsIgnoreCase(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2c
            java.lang.String r2 = android.os.Build.BRAND
            r2.getClass()
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L4a
        L2c:
            java.lang.String r1 = "aurora"
            java.lang.String r2 = "houji"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = android.os.Build.DEVICE
            r2.getClass()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r5)
            r2.getClass()
            boolean r1 = defpackage.fv.o0(r1, r2)
            if (r1 == 0) goto L4a
            r1 = r4
            goto L4b
        L4a:
            r1 = r3
        L4b:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.c = r1
            r0.getClass()
            java.lang.String r1 = "Sony"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L95
        L63:
            java.lang.String r0 = "SO"
            java.lang.String r1 = "A301SO"
            java.lang.String r2 = "XQ-DQ"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L78
            goto L95
        L78:
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.DEVICE
            r2.getClass()
            boolean r1 = defpackage.xs6.g0(r2, r1, r4)
            if (r1 == 0) goto L7c
            r0 = r4
            goto L96
        L95:
            r0 = r3
        L96:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.d = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lbb
        Lb0:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lbb
            r1 = 34
            if (r0 > r1) goto Lbb
            r3 = r4
        Lbb:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.e = r3
            return
    }
}
