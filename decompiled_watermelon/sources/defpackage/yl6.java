package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yl6  reason: default package */
/* loaded from: classes.dex */
public final class yl6 implements zu5 {
    public static final String Y = y70.h("SystemJobScheduler");
    public final Context A;
    public final JobScheduler B;
    public final xl6 L;
    public final WorkDatabase R;
    public final ew0 X;

    public yl6(Context context, WorkDatabase workDatabase, ew0 ew0Var) {
        JobScheduler a = g63.a(context);
        xl6 xl6Var = new xl6(context, ew0Var.d, ew0Var.l);
        this.A = context;
        this.B = a;
        this.L = xl6Var;
        this.R = workDatabase;
        this.X = ew0Var;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            y70.f().e(Y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = g63.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            y70.f().e(g63.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static gh7 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new gh7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.zu5
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.A;
        JobScheduler jobScheduler = this.B;
        ArrayList d = d(context, jobScheduler);
        if (d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d.size();
            int i = 0;
            while (i < size) {
                Object obj = d.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                gh7 f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                b(jobScheduler, ((Integer) obj2).intValue());
            }
            tl6 t = this.R.t();
            t.getClass();
            str.getClass();
            mh7.X(t.a, false, true, new ok0(str, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // defpackage.zu5
    public final void c(xh7... xh7VarArr) {
        int intValue;
        boolean z;
        boolean z2;
        ew0 ew0Var = this.X;
        WorkDatabase workDatabase = this.R;
        ?? r5 = 0;
        final gv2 gv2Var = new gv2(workDatabase, 0);
        int length = xh7VarArr.length;
        int i = 0;
        while (i < length) {
            xh7 xh7Var = xh7VarArr[i];
            workDatabase.b();
            try {
                di7 w = workDatabase.w();
                String str = xh7Var.a;
                xh7 d = w.d(str);
                String str2 = Y;
                if (d == null) {
                    y70.f().j(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                    z2 = r5;
                } else if (d.b != ih7.ENQUEUED) {
                    y70.f().j(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                    z2 = r5;
                } else {
                    gh7 b = ei7.b(xh7Var);
                    int i2 = b.b;
                    String str3 = b.a;
                    tl6 t = workDatabase.t();
                    t.getClass();
                    str3.getClass();
                    rl6 rl6Var = (rl6) mh7.X(t.a, true, r5, new sl6(str3, i2, r5));
                    if (rl6Var != null) {
                        intValue = rl6Var.c;
                    } else {
                        ew0Var.getClass();
                        final int i3 = ew0Var.i;
                        WorkDatabase workDatabase2 = gv2Var.a;
                        Callable callable = new Callable() { // from class: fv2
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i4;
                                int i5;
                                WorkDatabase workDatabase3 = gv2.this.a;
                                Long a = workDatabase3.s().a("next_job_scheduler_id");
                                int i6 = 0;
                                if (a != null) {
                                    i4 = (int) a.longValue();
                                } else {
                                    i4 = 0;
                                }
                                if (i4 == Integer.MAX_VALUE) {
                                    i5 = 0;
                                } else {
                                    i5 = i4 + 1;
                                }
                                as4 s = workDatabase3.s();
                                mh7.X(s.a, false, true, new zr4(0, s, new yr4(Long.valueOf(i5), "next_job_scheduler_id")));
                                if (i4 >= 0 && i4 <= i3) {
                                    i6 = i4;
                                } else {
                                    as4 s2 = workDatabase3.s();
                                    mh7.X(s2.a, false, true, new zr4(0, s2, new yr4(1L, "next_job_scheduler_id")));
                                }
                                return Integer.valueOf(i6);
                            }
                        };
                        workDatabase2.getClass();
                        Object o = workDatabase2.o(new bz2(18, callable));
                        o.getClass();
                        intValue = ((Number) o).intValue();
                    }
                    if (rl6Var == null) {
                        rl6 rl6Var2 = new rl6(str3, i2, intValue);
                        tl6 t2 = workDatabase.t();
                        t2.getClass();
                        sq5 sq5Var = t2.a;
                        zr4 zr4Var = new zr4(15, t2, rl6Var2);
                        z = false;
                        mh7.X(sq5Var, false, true, zr4Var);
                    } else {
                        z = false;
                    }
                    g(xh7Var, intValue);
                    workDatabase.p();
                    z2 = z;
                }
                i++;
                r5 = z2;
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // defpackage.zu5
    public final boolean e() {
        return true;
    }

    public final void g(xh7 xh7Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ArrayList d;
        List<JobInfo> list;
        int i4;
        String str;
        int i5;
        String str2;
        int i6;
        xl6 xl6Var = this.L;
        xl6Var.getClass();
        kz0 kz0Var = xh7Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str3 = xh7Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str3);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", xh7Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", xh7Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, xl6Var.a);
        boolean z3 = kz0Var.c;
        Set<iz0> set = kz0Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z3);
        boolean z4 = kz0Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z4).setExtras(persistableBundle);
        NetworkRequest a = kz0Var.a();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28 && a != null) {
            extras.getClass();
            extras.setRequiredNetwork(a);
        } else {
            v64 v64Var = kz0Var.a;
            if (i7 >= 30 && v64Var == v64.TEMPORARILY_UNMETERED) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i8 = wl6.a[v64Var.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5 && i7 >= 26) {
                                    i2 = 4;
                                } else {
                                    y70.f().b(xl6.d, "API version too low. Cannot convert network type value " + v64Var);
                                }
                            } else {
                                i2 = 3;
                            }
                        } else {
                            i2 = 2;
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z4) {
            if (xh7Var.l == f00.LINEAR) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            extras.setBackoffCriteria(xh7Var.m, i6);
        }
        long a2 = xh7Var.a();
        xl6Var.b.getClass();
        long max = Math.max(a2 - System.currentTimeMillis(), 0L);
        if (i7 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!xh7Var.q && xl6Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (iz0 iz0Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(iz0Var.a, iz0Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(kz0Var.g);
            extras.setTriggerContentMaxDelay(kz0Var.h);
        }
        extras.setPersisted(false);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            extras.setRequiresBatteryNotLow(kz0Var.e);
            extras.setRequiresStorageNotLow(kz0Var.f);
        }
        if (xh7Var.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i9 >= 31 && xh7Var.q && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i9 >= 35 && (str2 = xh7Var.x) != null) {
            extras.setTraceTag(str2);
        }
        JobInfo build = extras.build();
        String str4 = Y;
        y70.f().b(str4, "Scheduling work ID " + str3 + "Job ID " + i);
        try {
            if (this.B.schedule(build) == 0) {
                y70.f().j(str4, "Unable to schedule work ID " + str3);
                if (xh7Var.q && xh7Var.r == mf4.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    xh7Var.q = false;
                    y70.f().b(str4, "Scheduling a non-expedited job (work ID " + str3 + ")");
                    g(xh7Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str5 = g63.a;
            Context context = this.A;
            context.getClass();
            WorkDatabase workDatabase = this.R;
            workDatabase.getClass();
            ew0 ew0Var = this.X;
            ew0Var.getClass();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                i3 = 150;
            } else {
                i3 = 100;
            }
            int size = ((List) mh7.X(workDatabase.w().a, true, false, new s67(27))).size();
            String str6 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i10 >= 34) {
                JobScheduler a3 = g63.a(context);
                String str7 = null;
                try {
                    list = a3.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th) {
                    y70.f().e(g63.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList d2 = d(context, a3);
                    if (d2 != null) {
                        i4 = list.size() - d2.size();
                    } else {
                        i4 = 0;
                    }
                    if (i4 == 0) {
                        str = null;
                    } else {
                        str = i4 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d3 = d(context, (JobScheduler) systemService);
                    if (d3 != null) {
                        i5 = d3.size();
                    } else {
                        i5 = 0;
                    }
                    if (i5 != 0) {
                        str7 = i5 + " from WorkManager in the default namespace";
                    }
                    str6 = tq0.S0(nu.o0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str7}), ",\n", null, null, null, 62);
                }
            } else {
                if (d(context, g63.a(context)) != null) {
                    str6 = d.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i3);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(str6);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String g = ej6.g(sb, ew0Var.k, '.');
            y70.f().d(str4, g);
            throw new IllegalStateException(g, e);
        } catch (Throwable th2) {
            y70.f().e(str4, "Unable to schedule " + xh7Var, th2);
        }
    }
}
