package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j64  reason: default package */
/* loaded from: classes.dex */
public final class j64 extends defpackage.i64 {
    public static final defpackage.j64 d = null;
    public static final defpackage.j64 e = null;
    public static final defpackage.j64 f = null;
    public static final defpackage.j64 g = null;
    public static final defpackage.j64 h = null;
    public static final defpackage.j64 i = null;
    public static final defpackage.j64 j = null;
    public static final defpackage.j64 k = null;
    public static final defpackage.j64 l = null;
    public static final defpackage.j64 m = null;
    public final /* synthetic */ int c;

    static {
            j64 r0 = new j64
            r1 = 12
            r2 = 0
            r3 = 11
            r0.<init>(r3, r1, r2)
            defpackage.j64.d = r0
            j64 r0 = new j64
            r1 = 13
            r2 = 1
            r3 = 12
            r0.<init>(r3, r1, r2)
            defpackage.j64.e = r0
            j64 r0 = new j64
            r1 = 16
            r2 = 2
            r3 = 15
            r0.<init>(r3, r1, r2)
            defpackage.j64.f = r0
            j64 r0 = new j64
            r1 = 17
            r2 = 3
            r3 = 16
            r0.<init>(r3, r1, r2)
            defpackage.j64.g = r0
            j64 r0 = new j64
            r1 = 2
            r2 = 4
            r3 = 1
            r0.<init>(r3, r1, r2)
            defpackage.j64.h = r0
            j64 r0 = new j64
            r1 = 4
            r2 = 5
            r3 = 3
            r0.<init>(r3, r1, r2)
            defpackage.j64.i = r0
            j64 r0 = new j64
            r1 = 5
            r2 = 6
            r3 = 4
            r0.<init>(r3, r1, r2)
            defpackage.j64.j = r0
            j64 r0 = new j64
            r1 = 7
            r2 = 7
            r3 = 6
            r0.<init>(r3, r1, r2)
            defpackage.j64.k = r0
            j64 r0 = new j64
            r1 = 8
            r2 = 8
            r3 = 7
            r0.<init>(r3, r1, r2)
            defpackage.j64.l = r0
            j64 r0 = new j64
            r1 = 9
            r2 = 9
            r3 = 8
            r0.<init>(r3, r1, r2)
            defpackage.j64.m = r0
            return
    }

    public /* synthetic */ j64(int r1, int r2, int r3) {
            r0 = this;
            r0.c = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.i64
    public void a(defpackage.vm2 r3) {
            r2 = this;
            int r0 = r2.c
            switch(r0) {
                case 0: goto L182;
                case 1: goto L174;
                case 2: goto L152;
                case 3: goto L110;
                case 4: goto Lf8;
                case 5: goto Lef;
                case 6: goto Le1;
                case 7: goto Ld8;
                case 8: goto Lcf;
                case 9: goto Lc6;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto Lb8;
                case 13: goto L56;
                case 14: goto L48;
                case 15: goto L12;
                case 16: goto L9;
                default: goto L5;
            }
        L5:
            super.a(r3)
            return
        L9:
            r3.getClass()
            java.lang.String r2 = "ALTER TABLE ra_pending_achievement_award ADD COLUMN created_at_epoch_ms INTEGER NOT NULL DEFAULT 0"
            r3.r(r2)
            return
        L12:
            r3.getClass()
            java.lang.String r2 = "DROP TABLE IF EXISTS `ra_achievement`"
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS `ra_leaderboard`"
            r3.r(r2)
            java.lang.String r2 = "DROP INDEX IF EXISTS `index_ra_achievement_game_id`"
            r3.r(r2)
            java.lang.String r2 = "DROP INDEX IF EXISTS `index_ra_leaderboard_game_id`"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `ra_achievement` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `total_awards_casual` INTEGER NOT NULL,\n    `total_awards_hardcore` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `points` INTEGER NOT NULL,\n    `display_order` INTEGER NOT NULL,\n    `badge_url_unlocked` TEXT NOT NULL,\n    `badge_url_locked` TEXT NOT NULL,\n    `memory_address` TEXT NOT NULL,\n    `type` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `mem` TEXT NOT NULL,\n    `format` TEXT NOT NULL,\n    `lower_is_better` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `hidden` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `ra_achievement_set` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `title` TEXT,\n    `type` TEXT NOT NULL,\n    `icon_url` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)"
            r3.r(r2)
            return
        L48:
            r3.getClass()
            java.lang.String r2 = "DROP TABLE ra_game"
            r3.r(r2)
            java.lang.String r2 = "\n            CREATE TABLE IF NOT EXISTS ra_game (\n                game_id INTEGER PRIMARY KEY NOT NULL,\n                rich_presence_patch TEXT,\n                title TEXT NOT NULL,\n                icon TEXT NOT NULL\n            )\n        "
            r3.r(r2)
            return
        L56:
            r3.getClass()
            java.lang.String r2 = "DELETE FROM game WHERE game_checksum IS NULL"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `_new_cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"
            r3.r(r2)
            java.lang.String r2 = "INSERT INTO `_new_cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) SELECT `cheat`.`id`,`cheat`.`cheat_folder_id`,`game`.`database_id`,`cheat`.`name`,`cheat`.`description`,`cheat`.`code`,`cheat`.`enabled` FROM `cheat` LEFT JOIN `cheat_folder` ON `cheat`.`cheat_folder_id` = `cheat_folder`.`id` LEFT JOIN `game` ON `cheat_folder`.`game_id` = `game`.`id`"
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE `cheat`"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE `_new_cheat` RENAME TO `cheat`"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)"
            r3.r(r2)
            java.lang.String r2 = "INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`"
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE `game`"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE `_new_game` RENAME TO `game`"
            r3.r(r2)
            java.lang.String r2 = "DELETE FROM game WHERE id NOT IN (SELECT MIN(id) FROM game GROUP BY game_code, game_checksum)"
            r3.r(r2)
            java.lang.String r2 = "CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)"
            r3.r(r2)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "id"
            r2.put(r1, r0)
            java.lang.String r0 = "name"
            java.lang.String r1 = "__custom_cheat_database"
            r2.put(r0, r1)
            java.lang.String r0 = "cheat_database"
            r1 = 5
            r3.v(r0, r1, r2)
            return
        Lb8:
            r3.getClass()
            java.lang.String r2 = "ALTER TABLE game ADD COLUMN game_checksum TEXT"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX index_game_game_checksum ON game(game_checksum)"
            r3.r(r2)
            return
        Lc6:
            r3.getClass()
            java.lang.String r2 = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0"
            r3.r(r2)
            return
        Lcf:
            r3.getClass()
            java.lang.String r2 = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    "
            r3.r(r2)
            return
        Ld8:
            r3.getClass()
            java.lang.String r2 = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "
            r3.r(r2)
            return
        Le1:
            r3.getClass()
            java.lang.String r2 = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1"
            r3.r(r2)
            return
        Lef:
            r3.getClass()
            java.lang.String r2 = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    "
            r3.r(r2)
            return
        Lf8:
            r3.getClass()
            java.lang.String r2 = "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "
            r3.r(r2)
            java.lang.String r2 = "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    "
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS alarmInfo"
            r3.r(r2)
            java.lang.String r2 = "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                "
            r3.r(r2)
            return
        L110:
            r3.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "UPDATE WorkSpec\n                SET input_merger_class_name = '"
            r2.<init>(r0)
            java.lang.Class<androidx.work.OverwritingInputMerger> r0 = androidx.work.OverwritingInputMerger.class
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = "'\n                WHERE input_merger_class_name IS NULL\n                "
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = defpackage.rs6.R(r2)
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )"
            r3.r(r2)
            java.lang.String r2 = "INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`"
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE `WorkSpec`"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)"
            r3.r(r2)
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)"
            r3.r(r2)
            return
        L152:
            r3.getClass()
            java.lang.String r2 = "DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0"
            r3.r(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )"
            r3.r(r2)
            java.lang.String r2 = "INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`"
            r3.r(r2)
            java.lang.String r2 = "DROP TABLE `SystemIdInfo`"
            r3.r(r2)
            java.lang.String r2 = "ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`"
            r3.r(r2)
            return
        L174:
            r3.getClass()
            java.lang.String r2 = "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL "
            r3.r(r2)
            java.lang.String r2 = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL"
            r3.r(r2)
            return
        L182:
            r3.getClass()
            java.lang.String r2 = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0"
            r3.r(r2)
            return
    }

    @Override // defpackage.i64
    public void b(defpackage.e36 r5) {
            r4 = this;
            int r0 = r4.c
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"
            java.lang.String r2 = "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"
            java.lang.String r3 = "DROP TABLE `WorkSpec`"
            switch(r0) {
                case 10: goto L87;
                case 11: goto L79;
                case 12: goto Lb;
                case 13: goto Lb;
                case 14: goto Lb;
                case 15: goto Lb;
                case 16: goto Lb;
                case 17: goto L5d;
                case 18: goto L41;
                case 19: goto L33;
                case 20: goto L2a;
                case 21: goto L21;
                case 22: goto L18;
                case 23: goto Lf;
                default: goto Lb;
            }
        Lb:
            super.b(r5)
            return
        Lf:
            r5.getClass()
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL"
            defpackage.ii2.s(r5, r4)
            return
        L18:
            r5.getClass()
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL"
            defpackage.ii2.s(r5, r4)
            return
        L21:
            r5.getClass()
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''"
            defpackage.ii2.s(r5, r4)
            return
        L2a:
            r5.getClass()
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256"
            defpackage.ii2.s(r5, r4)
            return
        L33:
            r5.getClass()
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0"
            defpackage.ii2.s(r5, r4)
            return
        L41:
            r5.getClass()
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            defpackage.ii2.s(r5, r4)
            defpackage.ii2.s(r5, r3)
            defpackage.ii2.s(r5, r2)
            defpackage.ii2.s(r5, r1)
            java.lang.String r4 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"
            defpackage.ii2.s(r5, r4)
            return
        L5d:
            r5.getClass()
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            defpackage.ii2.s(r5, r4)
            defpackage.ii2.s(r5, r3)
            defpackage.ii2.s(r5, r2)
            defpackage.ii2.s(r5, r1)
            java.lang.String r4 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)"
            defpackage.ii2.s(r5, r4)
            return
        L79:
            r5.getClass()
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_game_id` ON `ra_leaderboard` (`game_id`)"
            defpackage.ii2.s(r5, r4)
            return
        L87:
            r5.getClass()
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE INDEX IF NOT EXISTS `index_ra_achievement_game_id` ON `ra_achievement` (`game_id`)"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))"
            defpackage.ii2.s(r5, r4)
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))"
            defpackage.ii2.s(r5, r4)
            return
    }
}
