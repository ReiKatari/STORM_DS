package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements k22 {
    public static final String X = y70.h("SystemJobService");
    public kh7 A;
    public final HashMap B = new HashMap();
    public final e81 L = new e81(9, (byte) 0);
    public wv6 R;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        i.n(wh1.A("Cannot invoke ", str, " on a background thread"));
    }

    public static gh7 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new gh7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.k22
    public final void d(gh7 gh7Var, boolean z) {
        a("onExecuted");
        y70 f = y70.f();
        f.b(X, gh7Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.B.remove(gh7Var);
        this.L.k(gh7Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            kh7 b = kh7.b(getApplicationContext());
            this.A = b;
            ku4 ku4Var = b.f;
            this.R = new wv6(ku4Var, b.d);
            ku4Var.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                y70.f().j(X, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        kh7 kh7Var = this.A;
        if (kh7Var != null) {
            ku4 ku4Var = kh7Var.f;
            synchronized (ku4Var.k) {
                ku4Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        kh7 kh7Var = this.A;
        String str = X;
        if (kh7Var == null) {
            y70.f().b(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        gh7 b = b(jobParameters);
        if (b == null) {
            y70.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.B;
        if (hashMap.containsKey(b)) {
            y70 f = y70.f();
            f.b(str, "Job is already being executed by SystemJobService: " + b);
            return false;
        }
        y70 f2 = y70.f();
        f2.b(str, "onStartJob for " + b);
        hashMap.put(b, jobParameters);
        so1 so1Var = new so1();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            dp.h(jobParameters);
        }
        this.R.k(this.L.m(b), so1Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        a("onStopJob");
        if (this.A == null) {
            y70.f().b(X, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        gh7 b = b(jobParameters);
        if (b == null) {
            y70.f().d(X, "WorkSpec id not found!");
            return false;
        }
        y70 f = y70.f();
        String str = X;
        f.b(str, "onStopJob for " + b);
        this.B.remove(b);
        td6 k = this.L.k(b);
        if (k != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = ip.f(jobParameters);
            } else {
                i = -512;
            }
            wv6 wv6Var = this.R;
            wv6Var.getClass();
            wv6Var.l(k, i);
        }
        ku4 ku4Var = this.A.f;
        String str2 = b.a;
        synchronized (ku4Var.k) {
            contains = ku4Var.i.contains(str2);
        }
        return !contains;
    }
}
