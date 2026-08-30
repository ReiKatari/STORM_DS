package s8;

import a2.n;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g2.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import k7.t;
import p7.l;
import p8.c0;
import p8.e0;
import p8.v;
import p8.w;
import q8.f;
import q8.r;
import u1.h1;
import u1.l1;
import x8.g;
import x8.h;
import x8.i;
import x8.p;
import x8.u;
import y8.e;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements f {
    public static final String Y = v.g("SystemJobScheduler");
    public final Context A;
    public final JobScheduler B;
    public final c L;
    public final WorkDatabase R;
    public final p8.b X;

    public d(Context context, WorkDatabase workDatabase, p8.b bVar) {
        JobScheduler a10 = a.a(context);
        c cVar = new c(context, bVar.f11455d, bVar.f11463l);
        this.A = context;
        this.B = a10;
        this.L = cVar;
        this.R = workDatabase;
        this.X = bVar;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th2) {
            v.e().d(Y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th2);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = a.f12843a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th2) {
            v.e().d(a.f12843a, "getAllPendingJobs() is not reliable on this device.", th2);
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

    public static i f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // q8.f
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.A;
        JobScheduler jobScheduler = this.B;
        ArrayList d4 = d(context, jobScheduler);
        if (d4 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d4.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = d4.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                i f8 = f(jobInfo);
                if (f8 != null && str.equals(f8.f14391a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                b(jobScheduler, ((Integer) obj2).intValue());
            }
            h t5 = this.R.t();
            t5.getClass();
            str.getClass();
            r.K(t5.f14389a, false, true, new z1(str, 9));
        }
    }

    @Override // q8.f
    public final void c(p... pVarArr) {
        int intValue;
        p8.b bVar = this.X;
        WorkDatabase workDatabase = this.R;
        final e eVar = new e(workDatabase, 0);
        boolean z10 = false;
        for (p pVar : pVarArr) {
            workDatabase.b();
            try {
                u w10 = workDatabase.w();
                String str = pVar.f14420a;
                p d4 = w10.d(str);
                String str2 = Y;
                if (d4 == null) {
                    v.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (d4.f14421b != e0.ENQUEUED) {
                    v.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    i k10 = l.k(pVar);
                    int i2 = k10.f14392b;
                    String str3 = k10.f14391a;
                    h t5 = workDatabase.t();
                    t5.getClass();
                    str3.getClass();
                    x8.f fVar = (x8.f) r.K(t5.f14389a, true, z10, new g(str3, i2, 0));
                    if (fVar != null) {
                        intValue = fVar.f14388c;
                    } else {
                        bVar.getClass();
                        final int i10 = bVar.f11460i;
                        WorkDatabase workDatabase2 = eVar.f14794a;
                        Callable callable = new Callable() { // from class: y8.d
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i11;
                                int i12;
                                WorkDatabase workDatabase3 = e.this.f14794a;
                                Long a10 = workDatabase3.s().a("next_job_scheduler_id");
                                int i13 = 0;
                                if (a10 != null) {
                                    i11 = (int) a10.longValue();
                                } else {
                                    i11 = 0;
                                }
                                if (i11 == Integer.MAX_VALUE) {
                                    i12 = 0;
                                } else {
                                    i12 = i11 + 1;
                                }
                                x8.d s10 = workDatabase3.s();
                                r.K(s10.f14384a, false, true, new l1(5, s10, new x8.c(Long.valueOf(i12), "next_job_scheduler_id")));
                                if (i11 >= 0 && i11 <= i10) {
                                    i13 = i11;
                                } else {
                                    x8.d s11 = workDatabase3.s();
                                    r.K(s11.f14384a, false, true, new l1(5, s11, new x8.c(Long.valueOf(1), "next_job_scheduler_id")));
                                }
                                return Integer.valueOf(i13);
                            }
                        };
                        workDatabase2.getClass();
                        Object o5 = workDatabase2.o(new n(28, callable));
                        o5.getClass();
                        intValue = ((Number) o5).intValue();
                    }
                    if (fVar == null) {
                        x8.f fVar2 = new x8.f(str3, i2, intValue);
                        h t10 = workDatabase.t();
                        t10.getClass();
                        t tVar = t10.f14389a;
                        l1 l1Var = new l1(6, t10, fVar2);
                        z10 = false;
                        r.K(tVar, false, true, l1Var);
                    } else {
                        z10 = false;
                    }
                    g(pVar, intValue);
                    workDatabase.p();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // q8.f
    public final boolean e() {
        return true;
    }

    public final void g(p pVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList d4;
        List<JobInfo> list;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        c cVar = this.L;
        cVar.getClass();
        p8.e eVar = pVar.f14429j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str3 = pVar.f14420a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str3);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f14438t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i2, cVar.f12846a);
        boolean z12 = eVar.f11473c;
        Set<p8.d> set = eVar.f11479i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z12);
        boolean z13 = eVar.f11474d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z13).setExtras(persistableBundle);
        NetworkRequest a10 = eVar.a();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28 && a10 != null) {
            extras.getClass();
            extras.setRequiredNetwork(a10);
        } else {
            w wVar = eVar.f11471a;
            if (i15 >= 30 && wVar == w.TEMPORARILY_UNMETERED) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i16 = b.f12844a[wVar.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5 && i15 >= 26) {
                                    i10 = 4;
                                } else {
                                    v.e().a(c.f12845d, "API version too low. Cannot convert network type value " + wVar);
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 2;
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                extras.setRequiredNetworkType(i10);
            }
        }
        if (!z13) {
            if (pVar.f14431l == p8.a.LINEAR) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            extras.setBackoffCriteria(pVar.m, i14);
        }
        long a11 = pVar.a();
        cVar.f12847b.getClass();
        long max = Math.max(a11 - System.currentTimeMillis(), 0L);
        if (i15 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f14435q && cVar.f12848c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (p8.d dVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f11466a, dVar.f11467b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f11477g);
            extras.setTriggerContentMaxDelay(eVar.f11478h);
        }
        extras.setPersisted(false);
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            extras.setRequiresBatteryNotLow(eVar.f11475e);
            extras.setRequiresStorageNotLow(eVar.f11476f);
        }
        if (pVar.f14430k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i17 >= 31 && pVar.f14435q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i17 >= 35 && (str2 = pVar.f14442x) != null) {
            extras.setTraceTag(str2);
        }
        JobInfo build = extras.build();
        String str4 = Y;
        v.e().a(str4, "Scheduling work ID " + str3 + "Job ID " + i2);
        try {
            if (this.B.schedule(build) == 0) {
                v.e().h(str4, "Unable to schedule work ID " + str3);
                if (pVar.f14435q && pVar.f14436r == c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f14435q = false;
                    v.e().a(str4, "Scheduling a non-expedited job (work ID " + str3 + ")");
                    g(pVar, i2);
                }
            }
        } catch (IllegalStateException e6) {
            String str5 = a.f12843a;
            Context context = this.A;
            context.getClass();
            WorkDatabase workDatabase = this.R;
            workDatabase.getClass();
            p8.b bVar = this.X;
            bVar.getClass();
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 31) {
                i11 = 150;
            } else {
                i11 = 100;
            }
            int size = ((List) r.K(workDatabase.w().f14444a, true, false, new h1(16))).size();
            String str6 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i18 >= 34) {
                JobScheduler a12 = a.a(context);
                String str7 = null;
                try {
                    list = a12.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th2) {
                    v.e().d(a.f12843a, "getAllPendingJobs() is not reliable on this device.", th2);
                    list = null;
                }
                if (list != null) {
                    ArrayList d10 = d(context, a12);
                    if (d10 != null) {
                        i12 = list.size() - d10.size();
                    } else {
                        i12 = 0;
                    }
                    if (i12 == 0) {
                        str = null;
                    } else {
                        str = i12 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d11 = d(context, (JobScheduler) systemService);
                    if (d11 != null) {
                        i13 = d11.size();
                    } else {
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        str7 = i13 + " from WorkManager in the default namespace";
                    }
                    str6 = zb.l.Y(k.v(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str7}), ",\n", null, null, null, 62);
                }
            } else {
                if (d(context, a.a(context)) != null) {
                    str6 = d4.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i11);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(str6);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String p10 = w.d.p(sb2, bVar.f11462k, '.');
            v.e().c(str4, p10);
            throw new IllegalStateException(p10, e6);
        } catch (Throwable th3) {
            v.e().d(str4, "Unable to schedule " + pVar, th3);
        }
    }
}
