package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg0  reason: default package */
/* loaded from: classes.dex */
public final class kg0 {
    public static final /* synthetic */ defpackage.kg0 a = null;
    public static final int[] b = null;

    static {
            kg0 r0 = new kg0
            r0.<init>()
            defpackage.kg0.a = r0
            java.util.HashMap r0 = defpackage.k54.c
            java.lang.Class<li0> r0 = defpackage.li0.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r1 = "androidx.camera.camera2.pipe.scalar.streamConfigurationMap"
            defpackage.qo2.s(r0, r1)
            java.lang.Class<mg0> r0 = defpackage.mg0.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r1 = "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap"
            defpackage.qo2.s(r0, r1)
            java.lang.Class<ne0> r0 = defpackage.ne0.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r1 = "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap"
            defpackage.qo2.s(r0, r1)
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.kg0.b = r0
            return
    }

    public static boolean a(defpackage.lg0 r2) {
            r2.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            r0.getClass()
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r0 = r2.c(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            r1 = 1
            if (r0 == 0) goto L1d
            float r2 = r0.floatValue()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L47
            goto L49
        L1d:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            r0.getClass()
            java.lang.Object r2 = r2.c(r0)
            int[] r2 = (int[]) r2
            if (r2 != 0) goto L2b
            goto L47
        L2b:
            boolean r0 = defpackage.fv.m0(r2, r1)
            if (r0 != 0) goto L49
            r0 = 2
            boolean r0 = defpackage.fv.m0(r2, r0)
            if (r0 != 0) goto L49
            r0 = 4
            boolean r0 = defpackage.fv.m0(r2, r0)
            if (r0 != 0) goto L49
            r0 = 3
            boolean r2 = defpackage.fv.m0(r2, r0)
            if (r2 == 0) goto L47
            goto L49
        L47:
            r2 = 0
            return r2
        L49:
            return r1
    }

    public static boolean b(defpackage.lg0 r2) {
            r2.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L25
            kg0 r0 = defpackage.lg0.g
            r0.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            r0.getClass()
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r2 = r2.c(r0)
            int[] r2 = (int[]) r2
            if (r2 != 0) goto L1f
            int[] r2 = defpackage.kg0.b
        L1f:
            r0 = 2
            boolean r2 = defpackage.fv.m0(r2, r0)
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static boolean c(defpackage.lg0 r1) {
            r1.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            r0.getClass()
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.c(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L13
            goto L1c
        L13:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }
}
