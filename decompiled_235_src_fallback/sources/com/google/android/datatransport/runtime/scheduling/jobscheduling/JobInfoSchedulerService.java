package com.google.android.datatransport.runtime.scheduling.jobscheduling;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {
    public static final /* synthetic */ int A = 0;

    public JobInfoSchedulerService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters r7) {
            r6 = this;
            android.os.PersistableBundle r0 = r7.getExtras()
            java.lang.String r1 = "backendName"
            java.lang.String r0 = r0.getString(r1)
            android.os.PersistableBundle r1 = r7.getExtras()
            java.lang.String r2 = "extras"
            java.lang.String r1 = r1.getString(r2)
            android.os.PersistableBundle r2 = r7.getExtras()
            java.lang.String r3 = "priority"
            int r2 = r2.getInt(r3)
            android.os.PersistableBundle r3 = r7.getExtras()
            java.lang.String r4 = "attemptNumber"
            int r3 = r3.getInt(r4)
            android.content.Context r4 = r6.getApplicationContext()
            defpackage.sb7.b(r4)
            bt r4 = defpackage.fz.a()
            r5 = 0
            if (r0 == 0) goto L65
            r4.B = r0
            b35 r0 = defpackage.d35.b(r2)
            r4.R = r0
            if (r1 == 0) goto L46
            byte[] r0 = android.util.Base64.decode(r1, r5)
            r4.L = r0
        L46:
            sb7 r0 = defpackage.sb7.a()
            p87 r0 = r0.d
            fz r1 = r4.A()
            uo2 r2 = new uo2
            r4 = 10
            r2.<init>(r4, r6, r7)
            java.lang.Object r6 = r0.e
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            rh7 r7 = new rh7
            r7.<init>(r0, r1, r3, r2)
            r6.execute(r7)
            r6 = 1
            return r6
        L65:
            java.lang.String r6 = "Null backendName"
            defpackage.u34.x(r6)
            return r5
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
