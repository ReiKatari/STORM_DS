package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r34  reason: default package */
/* loaded from: classes.dex */
public final class r34 extends i64 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r34(int i) {
        super(2, 3);
        this.c = i;
        switch (i) {
            case 1:
                super(14, 15);
                this.d = new xd5(23);
                return;
            case 2:
                super(19, 20);
                this.d = new d90(24);
                return;
            default:
                this.d = new w31(15);
                return;
        }
    }

    @Override // defpackage.i64
    public final void b(e36 e36Var) {
        String str;
        int i = this.c;
        int i2 = 0;
        e36Var.getClass();
        switch (i) {
            case 0:
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)");
                ii2.s(e36Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `database_id` INTEGER, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT, FOREIGN KEY(`database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                ii2.s(e36Var, "INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`");
                ii2.s(e36Var, "DROP TABLE `game`");
                ii2.s(e36Var, "ALTER TABLE `_new_game` RENAME TO `game`");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_game_game_code` ON `game` (`game_code`)");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_game_game_checksum` ON `game` (`game_checksum`)");
                j36 i0 = e36Var.i0("PRAGMA foreign_key_check(`game`)");
                try {
                    if (!i0.f0()) {
                        lb4.p(i0, null);
                        if (e36Var instanceof mu6) {
                            vm2 vm2Var = ((mu6) e36Var).A;
                            vm2Var.getClass();
                            Cursor A = vm2Var.A("SELECT COUNT(*) FROM game");
                            if (A.moveToFirst() && A.getInt(0) > 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("name", "DeadSkullzJr's NDS Cheat Database");
                                vm2Var.u("UPDATE game SET database_id = ?", new Long[]{Long.valueOf(vm2Var.v("cheat_database", 4, contentValues))});
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new SQLException(q60.R(i0));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb4.p(i0, th);
                        throw th2;
                    }
                }
            case 1:
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                ii2.s(e36Var, "DROP TABLE `WorkSpec`");
                ii2.s(e36Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (e36Var instanceof mu6) {
                    vm2 vm2Var2 = ((mu6) e36Var).A;
                    vm2Var2.getClass();
                    vm2Var2.r("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues2 = new ContentValues(1);
                    contentValues2.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    Object[] objArr = new Object[0];
                    if (contentValues2.size() != 0) {
                        int size = contentValues2.size();
                        int length = objArr.length + size;
                        Object[] objArr2 = new Object[length];
                        StringBuilder sb = new StringBuilder("UPDATE ");
                        sb.append(vm2.B[3]);
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
                        dn2 k = vm2Var2.k(sb.toString());
                        np2.p(k, objArr2);
                        k.B.executeUpdateDelete();
                        return;
                    }
                    i.h("Empty values");
                    return;
                }
                return;
            default:
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                ii2.s(e36Var, "DROP TABLE `WorkSpec`");
                ii2.s(e36Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (e36Var instanceof mu6) {
                    vm2 vm2Var3 = ((mu6) e36Var).A;
                    vm2Var3.getClass();
                    vm2Var3.r("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
