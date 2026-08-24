package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b72 {
    public static final String X = ga0.h("SystemJobService");
    public lw7 A;
    public final HashMap B = new HashMap();
    public final wb1 L = new wb1(9, (byte) 0);
    public rr6 R;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        i.m(lb1.A("Cannot invoke ", str, " on a background thread"));
    }

    public static gw7 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new gw7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.b72
    public final void b(gw7 gw7Var, boolean z) {
        a("onExecuted");
        ga0 f = ga0.f();
        f.b(X, gw7Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.B.remove(gw7Var);
        this.L.k(gw7Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            lw7 b = lw7.b(getApplicationContext());
            this.A = b;
            o35 o35Var = b.f;
            this.R = new rr6(o35Var, b.d);
            o35Var.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                ga0.f().j(X, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        lw7 lw7Var = this.A;
        if (lw7Var != null) {
            o35 o35Var = lw7Var.f;
            synchronized (o35Var.k) {
                o35Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        lw7 lw7Var = this.A;
        String str = X;
        if (lw7Var == null) {
            ga0.f().b(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        gw7 c = c(jobParameters);
        if (c == null) {
            ga0.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.B;
        if (hashMap.containsKey(c)) {
            ga0 f = ga0.f();
            f.b(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        ga0 f2 = ga0.f();
        f2.b(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        rr6 rr6Var = new rr6(17);
        if (jobParameters.getTriggeredContentUris() != null) {
            rr6Var.L = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            rr6Var.B = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            pp.h(jobParameters);
        }
        this.R.p(this.L.m(c), rr6Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        a("onStopJob");
        if (this.A == null) {
            ga0.f().b(X, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        gw7 c = c(jobParameters);
        if (c == null) {
            ga0.f().d(X, "WorkSpec id not found!");
            return false;
        }
        ga0 f = ga0.f();
        String str = X;
        f.b(str, "onStopJob for " + c);
        this.B.remove(c);
        jp6 k = this.L.k(c);
        if (k != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = up.f(jobParameters);
            } else {
                i = -512;
            }
            rr6 rr6Var = this.R;
            rr6Var.getClass();
            rr6Var.q(k, i);
        }
        o35 o35Var = this.A.f;
        String str2 = c.a;
        synchronized (o35Var.k) {
            contains = o35Var.i.contains(str2);
        }
        return !contains;
    }
}
