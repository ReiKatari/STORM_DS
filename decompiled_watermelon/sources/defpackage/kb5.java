package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kb5  reason: default package */
/* loaded from: classes.dex */
public final class kb5 extends py3 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public kb5(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.py3
    public final void a(vh2 vh2Var) {
        int i = this.c;
        Context context = this.d;
        vh2Var.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    vh2Var.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                vh2Var.x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    vh2Var.d();
                    try {
                        vh2Var.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        vh2Var.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        vh2Var.I();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    vh2Var.d();
                    try {
                        vh2Var.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        vh2Var.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        vh2Var.I();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public kb5(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
