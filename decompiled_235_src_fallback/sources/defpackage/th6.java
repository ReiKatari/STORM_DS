package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th6  reason: default package */
/* loaded from: classes.dex */
public abstract class th6 {
    public static int a(androidx.window.sidecar.SidecarDeviceState r3) {
            r3.getClass()
            int r3 = r3.posture     // Catch: java.lang.NoSuchFieldError -> L6
            return r3
        L6:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r0 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r1 = "getPosture"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> L1d
            r3.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L1d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public static int b(androidx.window.sidecar.SidecarDeviceState r1) {
            r1.getClass()
            int r1 = a(r1)
            if (r1 < 0) goto Le
            r0 = 4
            if (r1 <= r0) goto Ld
            goto Le
        Ld:
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.util.List c(androidx.window.sidecar.SidecarWindowLayoutInfo r4) {
            yt1 r0 = defpackage.yt1.A
            r4.getClass()
            java.util.List r4 = r4.displayFeatures     // Catch: java.lang.NoSuchFieldError -> Lb
            if (r4 != 0) goto La
            goto L1e
        La:
            return r4
        Lb:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r1 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r2 = "getDisplayFeatures"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> L1e
            r4.getClass()     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1e
            return r4
        L1e:
            return r0
    }

    public static void d(androidx.window.sidecar.SidecarDeviceState r3, int r4) {
            r3.posture = r4     // Catch: java.lang.NoSuchFieldError -> L3
            return
        L3:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r0 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r1 = "setPosture"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1c
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1c
            r0.invoke(r3, r4)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }
}
