package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x8  reason: default package */
/* loaded from: classes.dex */
public abstract class x8 {
    public static final java.lang.Class a = null;
    public static final java.lang.reflect.Field b = null;
    public static final java.lang.reflect.Field c = null;
    public static final java.lang.reflect.Method d = null;
    public static final java.lang.reflect.Method e = null;
    public static final java.lang.reflect.Method f = null;
    public static final android.os.Handler g = null;

    static {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            defpackage.x8.g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            defpackage.x8.a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            defpackage.x8.b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            defpackage.x8.c = r0
            java.lang.Class r0 = defpackage.x8.a
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.String r5 = "performStopActivity"
            if (r0 != 0) goto L3f
        L3d:
            r0 = r1
            goto L4c
        L3f:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r4, r3, r6}     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L3d
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3d
        L4c:
            defpackage.x8.d = r0
            java.lang.Class r0 = defpackage.x8.a
            if (r0 != 0) goto L54
        L52:
            r0 = r1
            goto L5f
        L54:
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r3}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r3)     // Catch: java.lang.Throwable -> L52
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L52
        L5f:
            defpackage.x8.e = r0
            java.lang.Class r0 = defpackage.x8.a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 == r4) goto L6d
            r4 = 27
            if (r3 != r4) goto L8e
        L6d:
            if (r0 != 0) goto L70
            goto L8e
        L70:
            java.lang.String r3 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L8e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L8e
            java.lang.Class<android.content.res.Configuration> r9 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r10 = android.content.res.Configuration.class
            r11 = r8
            r12 = r8
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L8e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L8e
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L8e
            r1 = r0
        L8e:
            defpackage.x8.f = r1
            return
    }
}
