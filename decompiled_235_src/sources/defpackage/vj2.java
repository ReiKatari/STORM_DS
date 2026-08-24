package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vj2  reason: default package */
/* loaded from: classes.dex */
public final class vj2 implements Runnable {
    public static final String X = ga0.h("ForceStopRunnable");
    public static final long Y = 315360000000L;
    public final Context A;
    public final lw7 B;
    public final k13 L;
    public int R = 0;

    public vj2(Context context, lw7 lw7Var) {
        this.A = context.getApplicationContext();
        this.B = lw7Var;
        this.L = lw7Var.g;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + Y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        k13 k13Var = this.L;
        lw7 lw7Var = this.B;
        WorkDatabase workDatabase = lw7Var.c;
        az0 az0Var = lw7Var.b;
        k13 k13Var2 = lw7Var.g;
        workDatabase = lw7Var.c;
        String str = ux6.Y;
        Context context = this.A;
        JobScheduler a = vc3.a(context);
        ArrayList b = ux6.b(context, a);
        List<String> list = (List) hv.Q(workDatabase.t().a, true, false, new r76(20));
        if (b != null) {
            i = b.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (b != null && !b.isEmpty()) {
            int size = b.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = b.get(i4);
                i4++;
                JobInfo jobInfo = (JobInfo) obj;
                gw7 f = ux6.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    ux6.a(a, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    ga0.f().b(ux6.Y, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                dx7 w = workDatabase.w();
                for (String str2 : list) {
                    w.e(-1L, str2);
                }
                workDatabase.p();
                workDatabase.f();
            } catch (Throwable th) {
                throw th;
            }
        }
        dx7 w2 = workDatabase.w();
        sw7 v = workDatabase.v();
        workDatabase.b();
        try {
            List<yw7> list2 = (List) hv.Q(w2.a, true, false, new rk7(16));
            if (list2 != null && !list2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (yw7 yw7Var : list2) {
                    iw7 iw7Var = iw7.ENQUEUED;
                    String str3 = yw7Var.a;
                    w2.h(iw7Var, str3);
                    w2.i(-512, str3);
                    w2.e(-1L, str3);
                }
            }
            hv.Q(v.a, false, true, new rk7(14));
            workDatabase.p();
            workDatabase.f();
            if (!z2 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            Long a2 = k13Var2.a.s().a("reschedule_needed");
            long j = 0;
            String str4 = X;
            if (a2 != null && a2.longValue() == 1) {
                ga0.f().b(str4, "Rescheduling Workers.");
                lw7Var.f();
                k13Var2.getClass();
                b15 b15Var = new b15("reschedule_needed", 0L);
                c15 s = k13Var2.a.s();
                hv.Q(s.a, false, true, new qk4(5, s, b15Var));
                return;
            }
            try {
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    i3 = 570425344;
                } else {
                    i3 = 536870912;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
            } catch (IllegalArgumentException e) {
                e = e;
                if (ga0.f().b <= 5) {
                    Log.w(str4, "Ignoring exception", e);
                }
                ga0.f().b(str4, "Application was force-stopped, rescheduling.");
                lw7Var.f();
                az0Var.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                k13Var.getClass();
                b15 b15Var2 = new b15("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                c15 s2 = k13Var.a.s();
                hv.Q(s2.a, false, true, new qk4(5, s2, b15Var2));
                return;
            } catch (SecurityException e2) {
                e = e2;
                if (ga0.f().b <= 5) {
                }
                ga0.f().b(str4, "Application was force-stopped, rescheduling.");
                lw7Var.f();
                az0Var.d.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                k13Var.getClass();
                b15 b15Var22 = new b15("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                c15 s22 = k13Var.a.s();
                hv.Q(s22.a, false, true, new qk4(5, s22, b15Var22));
                return;
            }
            if (i2 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a3 = k13Var.a.s().a("last_force_stop_ms");
                    if (a3 != null) {
                        j = a3.longValue();
                    }
                    for (int i5 = 0; i5 < historicalProcessExitReasons.size(); i5++) {
                        ApplicationExitInfo d = m2.d(historicalProcessExitReasons.get(i5));
                        reason = d.getReason();
                        if (reason == 10) {
                            timestamp = d.getTimestamp();
                            if (timestamp >= j) {
                                ga0.f().b(str4, "Application was force-stopped, rescheduling.");
                                lw7Var.f();
                                az0Var.d.getClass();
                                long currentTimeMillis22 = System.currentTimeMillis();
                                k13Var.getClass();
                                b15 b15Var222 = new b15("last_force_stop_ms", Long.valueOf(currentTimeMillis22));
                                c15 s222 = k13Var.a.s();
                                hv.Q(s222.a, false, true, new qk4(5, s222, b15Var222));
                                return;
                            }
                        }
                    }
                }
                if (!z3) {
                    ga0.f().b(str4, "Found unfinished work, scheduling it.");
                    h66.b(az0Var, workDatabase, lw7Var.e);
                    return;
                }
                return;
            }
            if (broadcast == null) {
                c(context);
                ga0.f().b(str4, "Application was force-stopped, rescheduling.");
                lw7Var.f();
                az0Var.d.getClass();
                long currentTimeMillis222 = System.currentTimeMillis();
                k13Var.getClass();
                b15 b15Var2222 = new b15("last_force_stop_ms", Long.valueOf(currentTimeMillis222));
                c15 s2222 = k13Var.a.s();
                hv.Q(s2222.a, false, true, new qk4(5, s2222, b15Var2222));
                return;
            }
            if (!z3) {
            }
        } finally {
            workDatabase.f();
        }
    }

    public final boolean b() {
        az0 az0Var = this.B.b;
        az0Var.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = X;
        if (isEmpty) {
            ga0.f().b(str, "The default process name was not specified.");
            return true;
        }
        boolean a = l35.a(this.A, az0Var);
        ga0 f = ga0.f();
        f.b(str, "Is default app process = " + a);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.A;
        String str2 = X;
        lw7 lw7Var = this.B;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    bw7.b(context);
                    ga0.f().b(str2, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.R + 1;
                        this.R = i;
                        if (i >= 3) {
                            if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            ga0.f().e(str2, str, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            lw7Var.b.getClass();
                            throw illegalStateException;
                        }
                        ga0 f = ga0.f();
                        f.c(str2, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.R * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    ga0.f().d(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    lw7Var.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            lw7Var.e();
        }
    }
}
