package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DisableAbortCapturesOnStopQuirk implements defpackage.u65 {
    public static final boolean a = false;
    public static final boolean b = false;

    static {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r2 = r0.equalsIgnoreCase(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L1a
            java.lang.String r2 = android.os.Build.BRAND
            r2.getClass()
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L26
        L1a:
            java.lang.String r1 = "d2q"
            java.lang.String r2 = android.os.Build.DEVICE
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L26
            r1 = r4
            goto L27
        L26:
            r1 = r3
        L27:
            androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.a = r1
            r0.getClass()
            java.lang.String r1 = "Poco"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L3f
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L4a
        L3f:
            java.lang.String r0 = "M2102J20SG"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L4a
            r3 = r4
        L4a:
            androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.b = r3
            return
    }
}
