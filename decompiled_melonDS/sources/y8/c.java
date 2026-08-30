package y8;

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
import p8.v;
import q8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final String X = v.g("ForceStopRunnable");
    public static final long Y = 315360000000L;
    public final Context A;
    public final p B;
    public final e L;
    public int R = 0;

    public c(Context context, p pVar) {
        this.A = context.getApplicationContext();
        this.B = pVar;
        this.L = pVar.f12377g;
    }

    public static void c(Context context) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 167772160;
        } else {
            i2 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long currentTimeMillis = System.currentTimeMillis() + Y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.a():void");
    }

    public final boolean b() {
        p8.b bVar = this.B.f12372b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = X;
        if (isEmpty) {
            v.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a10 = i.a(this.A, bVar);
        v e6 = v.e();
        e6.a(str, "Is default app process = " + a10);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.A;
        String str2 = X;
        p pVar = this.B;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    zb.k.D(context);
                    v.e().a(str2, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e6) {
                        int i2 = this.R + 1;
                        this.R = i2;
                        if (i2 >= 3) {
                            if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            v.e().d(str2, str, e6);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e6);
                            pVar.f12372b.getClass();
                            throw illegalStateException;
                        }
                        v e10 = v.e();
                        e10.b(str2, "Retrying after " + (i2 * 300), e6);
                        try {
                            Thread.sleep(this.R * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    v.e().c(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    pVar.f12372b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.c();
        }
    }
}
