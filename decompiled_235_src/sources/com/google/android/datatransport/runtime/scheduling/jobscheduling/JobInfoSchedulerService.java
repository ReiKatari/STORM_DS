package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int A = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        sb7.b(getApplicationContext());
        bt a = fz.a();
        if (string != null) {
            a.B = string;
            a.R = d35.b(i);
            if (string2 != null) {
                a.L = Base64.decode(string2, 0);
            }
            p87 p87Var = sb7.a().d;
            ((Executor) p87Var.e).execute(new rh7(p87Var, a.A(), i2, new uo2(10, this, jobParameters)));
            return true;
        }
        u34.x("Null backendName");
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
