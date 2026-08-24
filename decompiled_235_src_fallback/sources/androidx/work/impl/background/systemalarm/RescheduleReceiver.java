package androidx.work.impl.background.systemalarm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "RescheduleReceiver"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.impl.background.systemalarm.RescheduleReceiver.a = r0
            return
    }

    public RescheduleReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Received intent "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.b(r1, r6)
            lw7 r5 = defpackage.lw7.b(r5)     // Catch: java.lang.IllegalStateException -> L3f
            android.content.BroadcastReceiver$PendingResult r4 = r4.goAsync()     // Catch: java.lang.IllegalStateException -> L3f
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L3f
            java.lang.Object r6 = defpackage.lw7.m     // Catch: java.lang.IllegalStateException -> L3f
            monitor-enter(r6)     // Catch: java.lang.IllegalStateException -> L3f
            android.content.BroadcastReceiver$PendingResult r0 = r5.i     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2f
            r0.finish()     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r4 = move-exception
            goto L3d
        L2f:
            r5.i = r4     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r5.h     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3b
            r4.finish()     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r5.i = r4     // Catch: java.lang.Throwable -> L2d
        L3b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            return
        L3d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.IllegalStateException -> L3f
        L3f:
            r4 = move-exception
            ga0 r5 = defpackage.ga0.f()
            java.lang.String r6 = androidx.work.impl.background.systemalarm.RescheduleReceiver.a
            java.lang.String r0 = "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."
            r5.e(r6, r0, r4)
            return
    }
}
