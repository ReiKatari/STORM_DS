package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch4  reason: default package */
/* loaded from: classes.dex */
public final class ch4 {
    public static final java.lang.Object c = null;
    public static java.lang.String d;
    public static java.util.HashSet e;
    public static final java.lang.Object f = null;
    public static defpackage.bh4 g;
    public final android.content.Context a;
    public final android.app.NotificationManager b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ch4.c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            defpackage.ch4.e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ch4.f = r0
            return
    }

    public ch4(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.b = r2
            return
    }

    public final void a(android.app.Notification r6) {
            r5 = this;
            android.os.Bundle r0 = r6.extras
            r1 = 2002(0x7d2, float:2.805E-42)
            r2 = 0
            if (r0 == 0) goto L46
            java.lang.String r3 = "android.support.useSideChannel"
            boolean r0 = r0.getBoolean(r3)
            if (r0 == 0) goto L46
            yg4 r0 = new yg4
            android.content.Context r3 = r5.a
            java.lang.String r3 = r3.getPackageName()
            r0.<init>(r3, r6)
            java.lang.Object r3 = defpackage.ch4.f
            monitor-enter(r3)
            bh4 r6 = defpackage.ch4.g     // Catch: java.lang.Throwable -> L2f
            if (r6 != 0) goto L31
            bh4 r6 = new bh4     // Catch: java.lang.Throwable -> L2f
            android.content.Context r4 = r5.a     // Catch: java.lang.Throwable -> L2f
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            defpackage.ch4.g = r6     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L44
        L31:
            bh4 r6 = defpackage.ch4.g     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r6 = r6.b     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            android.os.Message r6 = r6.obtainMessage(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            android.app.NotificationManager r5 = r5.b
            r5.cancel(r2, r1)
            return
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r5
        L46:
            android.app.NotificationManager r5 = r5.b
            r5.notify(r2, r1, r6)
            return
    }
}
