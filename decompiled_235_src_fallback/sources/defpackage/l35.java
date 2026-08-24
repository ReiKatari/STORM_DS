package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l35  reason: default package */
/* loaded from: classes.dex */
public abstract class l35 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "ProcessUtils"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.l35.a = r0
            return
    }

    public static final boolean a(android.content.Context r4, defpackage.az0 r5) {
            r4.getClass()
            r5.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r5 < r0) goto L11
            java.lang.String r5 = defpackage.pp.i()
            goto L76
        L11:
            r5 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<lw7> r1 = defpackage.lw7.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L38
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "currentProcessName"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r5)     // Catch: java.lang.Throwable -> L38
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.invoke(r5, r5)     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L44
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L38
            r5 = r0
            goto L76
        L38:
            r0 = move-exception
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.l35.a
            java.lang.String r3 = "Unable to check ActivityThread for processName"
            r1.c(r2, r3, r0)
        L44:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r4.getSystemService(r1)
            r1.getClass()
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r1 = r1.getRunningAppProcesses()
            if (r1 == 0) goto L76
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            r3 = r2
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r3 = r3.pid
            if (r3 != r0) goto L5d
            goto L70
        L6f:
            r2 = r5
        L70:
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            if (r2 == 0) goto L76
            java.lang.String r5 = r2.processName
        L76:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.processName
            boolean r4 = defpackage.nb3.k(r5, r4)
            return r4
    }
}
