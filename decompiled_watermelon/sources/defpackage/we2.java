package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
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
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we2  reason: default package */
/* loaded from: classes.dex */
public final class we2 implements Runnable {
    public static final String X = y70.h("ForceStopRunnable");
    public static final long Y = 315360000000L;
    public final Context A;
    public final kh7 B;
    public final gv2 L;
    public int R = 0;

    public we2(Context context, kh7 kh7Var) {
        this.A = context.getApplicationContext();
        this.B = kh7Var;
        this.L = kh7Var.g;
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
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we2.a():void");
    }

    public final boolean b() {
        ew0 ew0Var = this.B.b;
        ew0Var.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = X;
        if (isEmpty) {
            y70.f().b(str, "The default process name was not specified.");
            return true;
        }
        boolean a = hu4.a(this.A, ew0Var);
        y70 f = y70.f();
        f.b(str, "Is default app process = " + a);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.A;
        String str2 = X;
        kh7 kh7Var = this.B;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    bh7.b(context);
                    y70.f().b(str2, "Performing cleanup operations.");
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
                            y70.f().e(str2, str, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            kh7Var.b.getClass();
                            throw illegalStateException;
                        }
                        y70 f = y70.f();
                        f.c(str2, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.R * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    y70.f().d(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    kh7Var.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            kh7Var.e();
        }
    }
}
