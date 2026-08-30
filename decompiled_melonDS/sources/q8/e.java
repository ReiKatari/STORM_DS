package q8;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends n7.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12352c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Context f12353d;

    public e(Context context) {
        super(9, 10);
        this.f12353d = context;
    }

    @Override // n7.a
    public final void b(v7.b bVar) {
        int i2 = this.f12352c;
        bVar.getClass();
        switch (i2) {
            case 0:
                if (this.f10096b >= 10) {
                    bVar.w("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f12353d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f12353d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j2 = 0;
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j2 = 1;
                    }
                    bVar.d();
                    try {
                        bVar.w("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        bVar.w("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        bVar.F();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.d();
                    try {
                        bVar.w("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        bVar.w("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.F();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public e(Context context, int i2, int i10) {
        super(i2, i10);
        this.f12353d = context;
    }
}
