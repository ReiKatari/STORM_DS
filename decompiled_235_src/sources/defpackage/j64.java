package defpackage;

import android.content.ContentValues;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j64  reason: default package */
/* loaded from: classes.dex */
public final class j64 extends i64 {
    public static final j64 d = new j64(11, 12, 0);
    public static final j64 e = new j64(12, 13, 1);
    public static final j64 f = new j64(15, 16, 2);
    public static final j64 g = new j64(16, 17, 3);
    public static final j64 h = new j64(1, 2, 4);
    public static final j64 i = new j64(3, 4, 5);
    public static final j64 j = new j64(4, 5, 6);
    public static final j64 k = new j64(6, 7, 7);
    public static final j64 l = new j64(7, 8, 8);
    public static final j64 m = new j64(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j64(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    @Override // defpackage.i64
    public void a(vm2 vm2Var) {
        switch (this.c) {
            case 0:
                vm2Var.getClass();
                vm2Var.r("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                vm2Var.getClass();
                vm2Var.r("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                vm2Var.r("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                vm2Var.getClass();
                vm2Var.r("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                vm2Var.r("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                vm2Var.r("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                vm2Var.r("DROP TABLE `SystemIdInfo`");
                vm2Var.r("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                vm2Var.getClass();
                vm2Var.r(rs6.R("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                vm2Var.r("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                vm2Var.r("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                vm2Var.r("DROP TABLE `WorkSpec`");
                vm2Var.r("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                return;
            case 4:
                vm2Var.getClass();
                vm2Var.r("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                vm2Var.r("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                vm2Var.r("DROP TABLE IF EXISTS alarmInfo");
                vm2Var.r("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 5:
                vm2Var.getClass();
                vm2Var.r("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 6:
                vm2Var.getClass();
                vm2Var.r("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                vm2Var.r("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 7:
                vm2Var.getClass();
                vm2Var.r("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 8:
                vm2Var.getClass();
                vm2Var.r("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                vm2Var.getClass();
                vm2Var.r("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
            case 11:
            default:
                super.a(vm2Var);
                return;
            case 12:
                vm2Var.getClass();
                vm2Var.r("ALTER TABLE game ADD COLUMN game_checksum TEXT");
                vm2Var.r("CREATE INDEX index_game_game_checksum ON game(game_checksum)");
                return;
            case 13:
                vm2Var.getClass();
                vm2Var.r("DELETE FROM game WHERE game_checksum IS NULL");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `_new_cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                vm2Var.r("INSERT INTO `_new_cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) SELECT `cheat`.`id`,`cheat`.`cheat_folder_id`,`game`.`database_id`,`cheat`.`name`,`cheat`.`description`,`cheat`.`code`,`cheat`.`enabled` FROM `cheat` LEFT JOIN `cheat_folder` ON `cheat`.`cheat_folder_id` = `cheat_folder`.`id` LEFT JOIN `game` ON `cheat_folder`.`game_id` = `game`.`id`");
                vm2Var.r("DROP TABLE `cheat`");
                vm2Var.r("ALTER TABLE `_new_cheat` RENAME TO `cheat`");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)");
                vm2Var.r("INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`");
                vm2Var.r("DROP TABLE `game`");
                vm2Var.r("ALTER TABLE `_new_game` RENAME TO `game`");
                vm2Var.r("DELETE FROM game WHERE id NOT IN (SELECT MIN(id) FROM game GROUP BY game_code, game_checksum)");
                vm2Var.r("CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)");
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", (Long) 0L);
                contentValues.put("name", "__custom_cheat_database");
                vm2Var.v("cheat_database", 5, contentValues);
                return;
            case 14:
                vm2Var.getClass();
                vm2Var.r("DROP TABLE ra_game");
                vm2Var.r("\n            CREATE TABLE IF NOT EXISTS ra_game (\n                game_id INTEGER PRIMARY KEY NOT NULL,\n                rich_presence_patch TEXT,\n                title TEXT NOT NULL,\n                icon TEXT NOT NULL\n            )\n        ");
                return;
            case 15:
                vm2Var.getClass();
                vm2Var.r("DROP TABLE IF EXISTS `ra_achievement`");
                vm2Var.r("DROP TABLE IF EXISTS `ra_leaderboard`");
                vm2Var.r("DROP INDEX IF EXISTS `index_ra_achievement_game_id`");
                vm2Var.r("DROP INDEX IF EXISTS `index_ra_leaderboard_game_id`");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `ra_achievement` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `total_awards_casual` INTEGER NOT NULL,\n    `total_awards_hardcore` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `points` INTEGER NOT NULL,\n    `display_order` INTEGER NOT NULL,\n    `badge_url_unlocked` TEXT NOT NULL,\n    `badge_url_locked` TEXT NOT NULL,\n    `memory_address` TEXT NOT NULL,\n    `type` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `ra_leaderboard` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `mem` TEXT NOT NULL,\n    `format` TEXT NOT NULL,\n    `lower_is_better` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `hidden` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                vm2Var.r("CREATE TABLE IF NOT EXISTS `ra_achievement_set` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `title` TEXT,\n    `type` TEXT NOT NULL,\n    `icon_url` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)");
                vm2Var.r("CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)");
                return;
            case 16:
                vm2Var.getClass();
                vm2Var.r("ALTER TABLE ra_pending_achievement_award ADD COLUMN created_at_epoch_ms INTEGER NOT NULL DEFAULT 0");
                return;
        }
    }

    @Override // defpackage.i64
    public void b(e36 e36Var) {
        switch (this.c) {
            case 10:
                e36Var.getClass();
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_game_id` ON `ra_achievement` (`game_id`)");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))");
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))");
                return;
            case 11:
                e36Var.getClass();
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_game_id` ON `ra_leaderboard` (`game_id`)");
                return;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                super.b(e36Var);
                return;
            case 17:
                e36Var.getClass();
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                ii2.s(e36Var, "DROP TABLE `WorkSpec`");
                ii2.s(e36Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            case 18:
                e36Var.getClass();
                ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ii2.s(e36Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                ii2.s(e36Var, "DROP TABLE `WorkSpec`");
                ii2.s(e36Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                ii2.s(e36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                return;
            case 19:
                e36Var.getClass();
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                return;
            case 20:
                e36Var.getClass();
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e36Var.getClass();
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                return;
            case 22:
                e36Var.getClass();
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                e36Var.getClass();
                ii2.s(e36Var, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
                return;
        }
    }
}
