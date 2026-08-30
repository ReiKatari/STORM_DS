package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements kx4 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r0.equalsIgnoreCase("Sony") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r2.equalsIgnoreCase("Xiaomi") != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    static {
        /*
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r1 = defpackage.b53.x(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.a = r1
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = defpackage.b53.x(r0, r1)
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
            boolean r1 = defpackage.nu.a0(r1, r2)
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
            java.util.List r0 = defpackage.l07.c0(r0)
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
            boolean r1 = defpackage.gh6.n0(r2, r1, r4)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.<clinit>():void");
    }
}
