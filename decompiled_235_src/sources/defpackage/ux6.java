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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux6  reason: default package */
/* loaded from: classes.dex */
public final class ux6 implements e66 {
    public static final String Y = ga0.h("SystemJobScheduler");
    public final Context A;
    public final JobScheduler B;
    public final tx6 L;
    public final WorkDatabase R;
    public final az0 X;

    public ux6(Context context, WorkDatabase workDatabase, az0 az0Var) {
        JobScheduler a = vc3.a(context);
        tx6 tx6Var = new tx6(context, az0Var.d, az0Var.l);
        this.A = context;
        this.B = a;
        this.L = tx6Var;
        this.R = workDatabase;
        this.X = az0Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ga0.f().e(Y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = vc3.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            ga0.f().e(vc3.a, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static gw7 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new gw7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.e66
    public final boolean c() {
        return true;
    }

    @Override // defpackage.e66
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.A;
        JobScheduler jobScheduler = this.B;
        ArrayList b = b(context, jobScheduler);
        if (b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj = b.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                gw7 f = f(jobInfo);
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
                a(jobScheduler, ((Integer) obj2).intValue());
            }
            px6 t = this.R.t();
            t.getClass();
            str.getClass();
            hv.Q(t.a, false, true, new c70(str, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // defpackage.e66
    public final void e(yw7... yw7VarArr) {
        int intValue;
        boolean z;
        boolean z2;
        az0 az0Var = this.X;
        WorkDatabase workDatabase = this.R;
        ?? r5 = 0;
        final k13 k13Var = new k13(workDatabase, 0);
        int length = yw7VarArr.length;
        int i = 0;
        while (i < length) {
            yw7 yw7Var = yw7VarArr[i];
            workDatabase.b();
            try {
                dx7 w = workDatabase.w();
                String str = yw7Var.a;
                yw7 d = w.d(str);
                String str2 = Y;
                if (d == null) {
                    ga0.f().j(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                    z2 = r5;
                } else if (d.b != iw7.ENQUEUED) {
                    ga0.f().j(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                    z2 = r5;
                } else {
                    gw7 a = rr7.a(yw7Var);
                    int i2 = a.b;
                    String str3 = a.a;
                    px6 t = workDatabase.t();
                    t.getClass();
                    str3.getClass();
                    nx6 nx6Var = (nx6) hv.Q(t.a, true, r5, new ox6(str3, i2, r5));
                    if (nx6Var != null) {
                        intValue = nx6Var.c;
                    } else {
                        az0Var.getClass();
                        final int i3 = az0Var.i;
                        WorkDatabase workDatabase2 = k13Var.a;
                        Callable callable = new Callable() { // from class: j13
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i4;
                                int i5;
                                WorkDatabase workDatabase3 = k13.this.a;
                                Long a2 = workDatabase3.s().a("next_job_scheduler_id");
                                int i6 = 0;
                                if (a2 != null) {
                                    i4 = (int) a2.longValue();
                                } else {
                                    i4 = 0;
                                }
                                if (i4 == Integer.MAX_VALUE) {
                                    i5 = 0;
                                } else {
                                    i5 = i4 + 1;
                                }
                                c15 s = workDatabase3.s();
                                hv.Q(s.a, false, true, new qk4(5, s, new b15("next_job_scheduler_id", Long.valueOf(i5))));
                                if (i4 >= 0 && i4 <= i3) {
                                    i6 = i4;
                                } else {
                                    c15 s2 = workDatabase3.s();
                                    hv.Q(s2.a, false, true, new qk4(5, s2, new b15("next_job_scheduler_id", 1L)));
                                }
                                return Integer.valueOf(i6);
                            }
                        };
                        workDatabase2.getClass();
                        Object o = workDatabase2.o(new er2(callable, 25));
                        o.getClass();
                        intValue = ((Number) o).intValue();
                    }
                    if (nx6Var == null) {
                        nx6 nx6Var2 = new nx6(str3, i2, intValue);
                        px6 t2 = workDatabase.t();
                        t2.getClass();
                        m16 m16Var = t2.a;
                        qk4 qk4Var = new qk4(21, t2, nx6Var2);
                        z = false;
                        hv.Q(m16Var, false, true, qk4Var);
                    } else {
                        z = false;
                    }
                    g(yw7Var, intValue);
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

    public final void g(yw7 yw7Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ArrayList b;
        List<JobInfo> list;
        int i4;
        String str;
        int i5;
        String str2;
        int i6;
        tx6 tx6Var = this.L;
        tx6Var.getClass();
        p21 p21Var = yw7Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str3 = yw7Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str3);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", yw7Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", yw7Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, tx6Var.a);
        boolean z3 = p21Var.c;
        Set<n21> set = p21Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z3);
        boolean z4 = p21Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z4).setExtras(persistableBundle);
        NetworkRequest a = p21Var.a();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28 && a != null) {
            extras.getClass();
            extras.setRequiredNetwork(a);
        } else {
            kf4 kf4Var = p21Var.a;
            if (i7 >= 30 && kf4Var == kf4.TEMPORARILY_UNMETERED) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i8 = sx6.a[kf4Var.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5 && i7 >= 26) {
                                    i2 = 4;
                                } else {
                                    ga0.f().b(tx6.d, "API version too low. Cannot convert network type value " + kf4Var);
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
            if (yw7Var.l == w10.LINEAR) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            extras.setBackoffCriteria(yw7Var.m, i6);
        }
        long a2 = yw7Var.a();
        tx6Var.b.getClass();
        long max = Math.max(a2 - System.currentTimeMillis(), 0L);
        if (i7 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!yw7Var.q && tx6Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (n21 n21Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(n21Var.a, n21Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(p21Var.g);
            extras.setTriggerContentMaxDelay(p21Var.h);
        }
        extras.setPersisted(false);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            extras.setRequiresBatteryNotLow(p21Var.e);
            extras.setRequiresStorageNotLow(p21Var.f);
        }
        if (yw7Var.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i9 >= 31 && yw7Var.q && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i9 >= 35 && (str2 = yw7Var.x) != null) {
            extras.setTraceTag(str2);
        }
        JobInfo build = extras.build();
        String str4 = Y;
        ga0.f().b(str4, "Scheduling work ID " + str3 + "Job ID " + i);
        try {
            if (this.B.schedule(build) == 0) {
                ga0.f().j(str4, "Unable to schedule work ID " + str3);
                if (yw7Var.q && yw7Var.r == oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    yw7Var.q = false;
                    ga0.f().b(str4, "Scheduling a non-expedited job (work ID " + str3 + ")");
                    g(yw7Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str5 = vc3.a;
            Context context = this.A;
            context.getClass();
            WorkDatabase workDatabase = this.R;
            workDatabase.getClass();
            az0 az0Var = this.X;
            az0Var.getClass();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                i3 = 150;
            } else {
                i3 = 100;
            }
            int size = ((List) hv.Q(workDatabase.w().a, true, false, new rk7(15))).size();
            String str6 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i10 >= 34) {
                JobScheduler a3 = vc3.a(context);
                String str7 = null;
                try {
                    list = a3.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th) {
                    ga0.f().e(vc3.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList b2 = b(context, a3);
                    if (b2 != null) {
                        i4 = list.size() - b2.size();
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
                    ArrayList b3 = b(context, (JobScheduler) systemService);
                    if (b3 != null) {
                        i5 = b3.size();
                    } else {
                        i5 = 0;
                    }
                    if (i5 != 0) {
                        str7 = i5 + " from WorkManager in the default namespace";
                    }
                    str6 = gt0.P0(fv.C0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str7}), ",\n", null, null, null, 62);
                }
            } else {
                if (b(context, vc3.a(context)) != null) {
                    str6 = b.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i3);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(str6);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String q = xg6.q(sb, az0Var.k, '.');
            ga0.f().d(str4, q);
            throw new IllegalStateException(q, e);
        } catch (Throwable th2) {
            ga0.f().e(str4, "Unable to schedule " + yw7Var, th2);
        }
    }
}
