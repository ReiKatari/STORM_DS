package androidx.work.impl.background.systemjob;

import a0.j;
import a6.k;
import a6.m;
import ah.m1;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import p1.a0;
import p8.v;
import p8.x;
import q8.a;
import q8.d;
import q8.p;
import x8.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {
    public static final String X = v.g("SystemJobService");
    public p A;
    public final HashMap B = new HashMap();
    public final m1 L = new m1(6, (byte) 0);
    public a0 R;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        j.p(kc.a.g("Cannot invoke ", str, " on a background thread"));
    }

    public static i c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // q8.a
    public final void b(i iVar, boolean z10) {
        a("onExecuted");
        v e6 = v.e();
        e6.a(X, iVar.f14391a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.B.remove(iVar);
        this.L.k(iVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p a10 = p.a(getApplicationContext());
            this.A = a10;
            d dVar = a10.f12376f;
            this.R = new a0(dVar, a10.f12374d);
            dVar.a(this);
        } catch (IllegalStateException e6) {
            if (Application.class.equals(getApplication().getClass())) {
                v.e().h(X, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.A;
        if (pVar != null) {
            d dVar = pVar.f12376f;
            synchronized (dVar.f12351k) {
                dVar.f12350j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        p pVar = this.A;
        String str = X;
        if (pVar == null) {
            v.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        i c4 = c(jobParameters);
        if (c4 == null) {
            v.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.B;
        if (hashMap.containsKey(c4)) {
            v e6 = v.e();
            e6.a(str, "Job is already being executed by SystemJobService: " + c4);
            return false;
        }
        v e10 = v.e();
        e10.a(str, "onStartJob for " + c4);
        hashMap.put(c4, jobParameters);
        x xVar = new x();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            k.h(jobParameters);
        }
        this.R.I(this.L.l(c4), xVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i2;
        a("onStopJob");
        if (this.A == null) {
            v.e().a(X, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        i c4 = c(jobParameters);
        if (c4 == null) {
            v.e().c(X, "WorkSpec id not found!");
            return false;
        }
        v e6 = v.e();
        String str = X;
        e6.a(str, "onStopJob for " + c4);
        this.B.remove(c4);
        q8.j k10 = this.L.k(c4);
        if (k10 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i2 = m.b(jobParameters);
            } else {
                i2 = -512;
            }
            a0 a0Var = this.R;
            a0Var.getClass();
            a0Var.J(k10, i2);
        }
        d dVar = this.A.f12376f;
        String str2 = c4.f14391a;
        synchronized (dVar.f12351k) {
            contains = dVar.f12349i.contains(str2);
        }
        return !contains;
    }
}
