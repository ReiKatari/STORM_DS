package androidx.work.impl.background.systemjob;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SystemJobService extends android.app.job.JobService implements defpackage.b72 {
    public static final java.lang.String X = null;
    public defpackage.lw7 A;
    public final java.util.HashMap B;
    public final defpackage.wb1 L;
    public defpackage.rr6 R;

    static {
            java.lang.String r0 = "SystemJobService"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.impl.background.systemjob.SystemJobService.X = r0
            return
    }

    public SystemJobService() {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.B = r0
            wb1 r0 = new wb1
            r1 = 9
            r2 = 0
            r0.<init>(r1, r2)
            r3.L = r0
            return
    }

    public static void a(java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto Lf
            return
        Lf:
            java.lang.String r0 = "Cannot invoke "
            java.lang.String r1 = " on a background thread"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            defpackage.i.m(r2)
            return
    }

    public static defpackage.gw7 c(android.app.job.JobParameters r3) {
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r3.getExtras()     // Catch: java.lang.NullPointerException -> L1e
            if (r3 == 0) goto L1e
            boolean r1 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L1e
            if (r1 == 0) goto L1e
            gw7 r1 = new gw7     // Catch: java.lang.NullPointerException -> L1e
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L1e
            java.lang.String r2 = "EXTRA_WORK_SPEC_GENERATION"
            int r3 = r3.getInt(r2)     // Catch: java.lang.NullPointerException -> L1e
            r1.<init>(r0, r3)     // Catch: java.lang.NullPointerException -> L1e
            return r1
        L1e:
            r3 = 0
            return r3
    }

    @Override // defpackage.b72
    public final void b(defpackage.gw7 r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "onExecuted"
            a(r0)
            ga0 r0 = defpackage.ga0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.a
            r1.append(r2)
            java.lang.String r2 = " executed on JobScheduler"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.X
            r0.b(r2, r1)
            java.util.HashMap r0 = r3.B
            java.lang.Object r0 = r0.remove(r4)
            android.app.job.JobParameters r0 = (android.app.job.JobParameters) r0
            wb1 r1 = r3.L
            r1.k(r4)
            if (r0 == 0) goto L33
            r3.jobFinished(r0, r5)
        L33:
            return
    }

    @Override // android.app.Service
    public final void onCreate() {
            r3 = this;
            super.onCreate()
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.IllegalStateException -> L1c
            lw7 r0 = defpackage.lw7.b(r0)     // Catch: java.lang.IllegalStateException -> L1c
            r3.A = r0     // Catch: java.lang.IllegalStateException -> L1c
            o35 r1 = r0.f     // Catch: java.lang.IllegalStateException -> L1c
            rr6 r2 = new rr6     // Catch: java.lang.IllegalStateException -> L1c
            ow7 r0 = r0.d     // Catch: java.lang.IllegalStateException -> L1c
            r2.<init>(r1, r0)     // Catch: java.lang.IllegalStateException -> L1c
            r3.R = r2     // Catch: java.lang.IllegalStateException -> L1c
            r1.a(r3)     // Catch: java.lang.IllegalStateException -> L1c
            return
        L1c:
            r0 = move-exception
            android.app.Application r3 = r3.getApplication()
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L39
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.X
            java.lang.String r1 = "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer."
            r3.j(r0, r1)
            return
        L39:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r1 = "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."
            r3.<init>(r1, r0)
            throw r3
    }

    @Override // android.app.Service
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            lw7 r0 = r2.A
            if (r0 == 0) goto L16
            o35 r0 = r0.f
            java.lang.Object r1 = r0.k
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.j     // Catch: java.lang.Throwable -> L13
            r0.remove(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
        L16:
            return
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters r8) {
            r7 = this;
            java.lang.String r0 = "onStartJob"
            a(r0)
            lw7 r0 = r7.A
            r1 = 1
            r2 = 0
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.X
            if (r0 != 0) goto L1a
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.b(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L1a:
            gw7 r0 = c(r8)
            if (r0 != 0) goto L2a
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r8 = "WorkSpec id not found!"
            r7.d(r3, r8)
            return r2
        L2a:
            java.util.HashMap r4 = r7.B
            boolean r5 = r4.containsKey(r0)
            if (r5 == 0) goto L48
            ga0 r7 = defpackage.ga0.f()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.b(r3, r8)
            return r2
        L48:
            ga0 r2 = defpackage.ga0.f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onStartJob for "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r2.b(r3, r5)
            r4.put(r0, r8)
            rr6 r2 = new rr6
            r3 = 17
            r2.<init>(r3)
            android.net.Uri[] r3 = r8.getTriggeredContentUris()
            if (r3 == 0) goto L77
            android.net.Uri[] r3 = r8.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.L = r3
        L77:
            java.lang.String[] r3 = r8.getTriggeredContentAuthorities()
            if (r3 == 0) goto L87
            java.lang.String[] r3 = r8.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.B = r3
        L87:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L90
            defpackage.pp.h(r8)
        L90:
            rr6 r8 = r7.R
            wb1 r7 = r7.L
            jp6 r7 = r7.m(r0)
            r8.p(r7, r2)
            return r1
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters r7) {
            r6 = this;
            java.lang.String r0 = "onStopJob"
            a(r0)
            lw7 r0 = r6.A
            r1 = 1
            if (r0 != 0) goto L16
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.X
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            r6.b(r7, r0)
            return r1
        L16:
            gw7 r0 = c(r7)
            if (r0 != 0) goto L29
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.X
            java.lang.String r0 = "WorkSpec id not found!"
            r6.d(r7, r0)
            r6 = 0
            return r6
        L29:
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onStopJob for "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.b(r3, r4)
            java.util.HashMap r2 = r6.B
            r2.remove(r0)
            wb1 r2 = r6.L
            jp6 r2 = r2.k(r0)
            if (r2 == 0) goto L62
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L58
            int r7 = defpackage.up.f(r7)
            goto L5a
        L58:
            r7 = -512(0xfffffffffffffe00, float:NaN)
        L5a:
            rr6 r3 = r6.R
            r3.getClass()
            r3.q(r2, r7)
        L62:
            lw7 r6 = r6.A
            o35 r6 = r6.f
            java.lang.String r7 = r0.a
            java.lang.Object r0 = r6.k
            monitor-enter(r0)
            java.util.HashSet r6 = r6.i     // Catch: java.lang.Throwable -> L74
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            r6 = r6 ^ r1
            return r6
        L74:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            throw r6
    }
}
