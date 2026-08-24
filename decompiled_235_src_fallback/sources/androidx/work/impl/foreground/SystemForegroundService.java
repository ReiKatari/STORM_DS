package androidx.work.impl.foreground;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SystemForegroundService extends android.app.Service implements defpackage.hu3 {
    public static final java.lang.String X = null;
    public final defpackage.m44 A;
    public boolean B;
    public defpackage.mx6 L;
    public android.app.NotificationManager R;

    static {
            java.lang.String r0 = "SystemFgService"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.impl.foreground.SystemForegroundService.X = r0
            return
    }

    public SystemForegroundService() {
            r1 = this;
            r1.<init>()
            m44 r0 = new m44
            r0.<init>(r1)
            r1.A = r0
            return
    }

    public final void a() {
            r2 = this;
            android.content.Context r0 = r2.getApplicationContext()
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r2.R = r0
            mx6 r0 = new mx6
            android.content.Context r1 = r2.getApplicationContext()
            r0.<init>(r1)
            r2.L = r0
            androidx.work.impl.foreground.SystemForegroundService r1 = r0.e0
            if (r1 == 0) goto L29
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.mx6.f0
            java.lang.String r1 = "A callback already exists."
            r2.d(r0, r1)
            return
        L29:
            r0.e0 = r2
            return
    }

    public final void c() {
            r2 = this;
            m44 r0 = r2.A
            r0.getClass()
            st3 r1 = defpackage.st3.ON_CREATE
            r0.C(r1)
            super.onCreate()
            return
    }

    public final void d() {
            r2 = this;
            m44 r0 = r2.A
            r0.getClass()
            st3 r1 = defpackage.st3.ON_STOP
            r0.C(r1)
            st3 r1 = defpackage.st3.ON_DESTROY
            r0.C(r1)
            super.onDestroy()
            return
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            m44 r0 = r0.A
            java.lang.Object r0 = r0.B
            ku3 r0 = (defpackage.ku3) r0
            return r0
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1.getClass()
            m44 r0 = r0.A
            r0.getClass()
            st3 r1 = defpackage.st3.ON_START
            r0.C(r1)
            r0 = 0
            return r0
    }

    @Override // android.app.Service
    public final void onCreate() {
            r0 = this;
            r0.c()
            r0.a()
            return
    }

    @Override // android.app.Service
    public final void onDestroy() {
            r0 = this;
            r0.d()
            mx6 r0 = r0.L
            r0.e()
            return
    }

    @Override // android.app.Service
    public final void onStart(android.content.Intent r3, int r4) {
            r2 = this;
            m44 r0 = r2.A
            r0.getClass()
            st3 r1 = defpackage.st3.ON_START
            r0.C(r1)
            super.onStart(r3, r4)
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r6, int r7, int r8) {
            r5 = this;
            super.onStartCommand(r6, r7, r8)
            boolean r7 = r5.B
            r0 = 0
            java.lang.String r1 = androidx.work.impl.foreground.SystemForegroundService.X
            if (r7 == 0) goto L1d
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r2 = "Re-initializing SystemForegroundService after a request to shut-down."
            r7.g(r1, r2)
            mx6 r7 = r5.L
            r7.e()
            r5.a()
            r5.B = r0
        L1d:
            if (r6 == 0) goto Le7
            mx6 r5 = r5.L
            r5.getClass()
            java.lang.String r7 = defpackage.mx6.f0
            java.lang.String r2 = r6.getAction()
            java.lang.String r3 = "ACTION_START_FOREGROUND"
            boolean r3 = r3.equals(r2)
            java.lang.String r4 = "KEY_WORKSPEC_ID"
            if (r3 == 0) goto L60
            ga0 r8 = defpackage.ga0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Started foreground service "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r8.g(r7, r1)
            java.lang.String r7 = r6.getStringExtra(r4)
            ow7 r8 = r5.B
            uo2 r1 = new uo2
            r2 = 17
            r1.<init>(r2, r5, r7, r0)
            zb6 r7 = r8.a
            r7.execute(r1)
            r5.d(r6)
            goto Le7
        L60:
            java.lang.String r0 = "ACTION_NOTIFY"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L6d
            r5.d(r6)
            goto Le7
        L6d:
            java.lang.String r0 = "ACTION_CANCEL_WORK"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lba
            ga0 r8 = defpackage.ga0.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Stopping foreground work for "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r8.g(r7, r0)
            java.lang.String r6 = r6.getStringExtra(r4)
            if (r6 == 0) goto Le7
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto Le7
            lw7 r5 = r5.A
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r5.getClass()
            r6.getClass()
            az0 r7 = r5.b
            xd5 r7 = r7.m
            ow7 r8 = r5.d
            zb6 r8 = r8.a
            r8.getClass()
            q6 r0 = new q6
            r1 = 16
            r0.<init>(r1, r5, r6)
            java.lang.String r5 = "CancelWorkById"
            defpackage.uj2.a0(r7, r5, r8, r0)
            goto Le7
        Lba:
            java.lang.String r6 = "ACTION_STOP_FOREGROUND"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Le7
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r0 = "Stopping foreground service"
            r6.g(r7, r0)
            androidx.work.impl.foreground.SystemForegroundService r5 = r5.e0
            if (r5 == 0) goto Le7
            r6 = 1
            r5.B = r6
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r0 = "Shutting down."
            r7.b(r1, r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r7 < r0) goto Le4
            r5.stopForeground(r6)
        Le4:
            r5.stopSelf(r8)
        Le7:
            r5 = 3
            return r5
    }

    public final void onTimeout(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L7
            return
        L7:
            mx6 r2 = r2.L
            r0 = 2048(0x800, float:2.87E-42)
            r2.f(r3, r0)
            return
    }

    public final void onTimeout(int r1, int r2) {
            r0 = this;
            mx6 r0 = r0.L
            r0.f(r1, r2)
            return
    }
}
