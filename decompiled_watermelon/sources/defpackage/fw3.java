package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fw3  reason: default package */
/* loaded from: classes.dex */
public final class fw3 extends py3 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw3(int i) {
        super(2, 3);
        this.c = i;
        switch (i) {
            case 1:
                super(14, 15);
                this.d = new iq0(22);
                return;
            case 2:
                super(19, 20);
                this.d = new sn1(22);
                return;
            default:
                this.d = new vn1(13);
                return;
        }
    }

    @Override // defpackage.py3
    public final void b(ls5 ls5Var) {
        String str;
        int i = this.c;
        int i2 = 0;
        ls5Var.getClass();
        switch (i) {
            case 0:
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)");
                yf2.o(ls5Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `database_id` INTEGER, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT, FOREIGN KEY(`database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                yf2.o(ls5Var, "INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`");
                yf2.o(ls5Var, "DROP TABLE `game`");
                yf2.o(ls5Var, "ALTER TABLE `_new_game` RENAME TO `game`");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_game_game_code` ON `game` (`game_code`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_game_game_checksum` ON `game` (`game_checksum`)");
                ns5 i0 = ls5Var.i0("PRAGMA foreign_key_check(`game`)");
                try {
                    if (!i0.a0()) {
                        iq2.h(i0, null);
                        if (ls5Var instanceof si6) {
                            vh2 vh2Var = ((si6) ls5Var).A;
                            vh2Var.getClass();
                            Cursor F = vh2Var.F("SELECT COUNT(*) FROM game");
                            if (F.moveToFirst() && F.getInt(0) > 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("name", "DeadSkullzJr's NDS Cheat Database");
                                vh2Var.B("UPDATE game SET database_id = ?", new Long[]{Long.valueOf(vh2Var.C("cheat_database", 4, contentValues))});
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new SQLException(dk7.E(i0));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq2.h(i0, th);
                        throw th2;
                    }
                }
            case 1:
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                yf2.o(ls5Var, "DROP TABLE `WorkSpec`");
                yf2.o(ls5Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (ls5Var instanceof si6) {
                    vh2 vh2Var2 = ((si6) ls5Var).A;
                    vh2Var2.getClass();
                    vh2Var2.x("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues2 = new ContentValues(1);
                    contentValues2.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    Object[] objArr = new Object[0];
                    if (contentValues2.size() != 0) {
                        int size = contentValues2.size();
                        int length = objArr.length + size;
                        Object[] objArr2 = new Object[length];
                        StringBuilder sb = new StringBuilder("UPDATE ");
                        sb.append(vh2.B[3]);
                        sb.append("WorkSpec SET ");
                        for (String str2 : contentValues2.keySet()) {
                            if (i2 > 0) {
                                str = ",";
                            } else {
                                str = "";
                            }
                            sb.append(str);
                            sb.append(str2);
                            objArr2[i2] = contentValues2.get(str2);
                            sb.append("=?");
                            i2++;
                        }
                        for (int i3 = size; i3 < length; i3++) {
                            objArr2[i3] = objArr[i3 - size];
                        }
                        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                        }
                        di2 p = vh2Var2.p(sb.toString());
                        me2.h(p, objArr2);
                        p.B.executeUpdateDelete();
                        return;
                    }
                    i.i("Empty values");
                    return;
                }
                return;
            default:
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                yf2.o(ls5Var, "DROP TABLE `WorkSpec`");
                yf2.o(ls5Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (ls5Var instanceof si6) {
                    vh2 vh2Var3 = ((si6) ls5Var).A;
                    vh2Var3.getClass();
                    vh2Var3.x("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
