package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs7  reason: default package */
/* loaded from: classes.dex */
public abstract class bs7 {
    static {
            java.lang.String r0 = "WakeLocks"
            defpackage.ga0.h(r0)
            return
    }

    public static final android.os.PowerManager.WakeLock a(android.content.Context r3) {
            java.lang.String r0 = "ProcessorForegroundLck"
            r3.getClass()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "power"
            java.lang.Object r3 = r3.getSystemService(r1)
            r3.getClass()
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            java.lang.String r1 = "WorkManager: "
            java.lang.String r0 = r1.concat(r0)
            r1 = 1
            android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r1, r0)
            cs7 r1 = defpackage.cs7.a
            monitor-enter(r1)
            java.util.WeakHashMap r2 = defpackage.cs7.b     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r2.put(r3, r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            r3.getClass()
            return r3
        L2f:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }
}
