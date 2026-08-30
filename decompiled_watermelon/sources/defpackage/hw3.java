package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import me.magnum.melonds.database.MelonDatabase_Impl;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hw3  reason: default package */
/* loaded from: classes.dex */
public final class hw3 extends io1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ sq5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw3(MelonDatabase_Impl melonDatabase_Impl) {
        super("87f13c623fa68b88b9c3e9bff84b16cd", 9, "67e37bbfd69943fb82d1c33201fa5bf9");
        this.e = melonDatabase_Impl;
    }

    private final i40 w(ls5 ls5Var) {
        ls5Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new dm6("id", "INTEGER", false, 1, null, 1));
        linkedHashMap.put("name", new dm6("name", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new fm6("index_cheat_database_name", true, l07.b0("name"), l07.b0("ASC")));
        gm6 gm6Var = new gm6("cheat_database", linkedHashMap, linkedHashSet, linkedHashSet2);
        gm6 P = ln2.P(ls5Var, "cheat_database");
        if (!gm6Var.equals(P)) {
            return new i40("cheat_database(me.magnum.melonds.database.entities.CheatDatabaseEntity).\n Expected:\n" + gm6Var + "\n Found:\n" + P, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new dm6("id", "INTEGER", false, 1, null, 1));
        linkedHashMap2.put("name", new dm6("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("game_code", new dm6("game_code", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("game_checksum", new dm6("game_checksum", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new fm6("game_code_checksum_index", true, l07.c0("game_code", "game_checksum"), l07.c0("ASC", "ASC")));
        gm6 gm6Var2 = new gm6("game", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        gm6 P2 = ln2.P(ls5Var, "game");
        if (!gm6Var2.equals(P2)) {
            return new i40("game(me.magnum.melonds.database.entities.GameEntity).\n Expected:\n" + gm6Var2 + "\n Found:\n" + P2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new dm6("id", "INTEGER", false, 1, null, 1));
        linkedHashMap3.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("name", new dm6("name", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new em6("game", "CASCADE", "NO ACTION", l07.b0("game_id"), l07.b0("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new fm6("index_cheat_folder_game_id", false, l07.b0("game_id"), l07.b0("ASC")));
        gm6 gm6Var3 = new gm6("cheat_folder", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        gm6 P3 = ln2.P(ls5Var, "cheat_folder");
        if (!gm6Var3.equals(P3)) {
            return new i40("cheat_folder(me.magnum.melonds.database.entities.CheatFolderEntity).\n Expected:\n" + gm6Var3 + "\n Found:\n" + P3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new dm6("id", "INTEGER", false, 1, null, 1));
        linkedHashMap4.put("cheat_folder_id", new dm6("cheat_folder_id", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("cheat_database_id", new dm6("cheat_database_id", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("name", new dm6("name", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("description", new dm6("description", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("code", new dm6("code", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("enabled", new dm6("enabled", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new em6("cheat_folder", "CASCADE", "NO ACTION", l07.b0("cheat_folder_id"), l07.b0("id")));
        linkedHashSet7.add(new em6("cheat_database", "CASCADE", "NO ACTION", l07.b0("cheat_database_id"), l07.b0("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new fm6("index_cheat_cheat_folder_id", false, l07.b0("cheat_folder_id"), l07.b0("ASC")));
        linkedHashSet8.add(new fm6("index_cheat_cheat_database_id", false, l07.b0("cheat_database_id"), l07.b0("ASC")));
        gm6 gm6Var4 = new gm6("cheat", linkedHashMap4, linkedHashSet7, linkedHashSet8);
        gm6 P4 = ln2.P(ls5Var, "cheat");
        if (!gm6Var4.equals(P4)) {
            return new i40("cheat(me.magnum.melonds.database.entities.CheatEntity).\n Expected:\n" + gm6Var4 + "\n Found:\n" + P4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("game_id", new dm6("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("rich_presence_patch", new dm6("rich_presence_patch", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("title", new dm6("title", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("icon", new dm6("icon", "TEXT", true, 0, null, 1));
        gm6 gm6Var5 = new gm6("ra_game", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        gm6 P5 = ln2.P(ls5Var, "ra_game");
        if (!gm6Var5.equals(P5)) {
            return new i40("ra_game(me.magnum.melonds.database.entities.retroachievements.RAGameEntity).\n Expected:\n" + gm6Var5 + "\n Found:\n" + P5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new dm6("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap6.put("title", new dm6("title", "TEXT", false, 0, null, 1));
        linkedHashMap6.put("type", new dm6("type", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("icon_url", new dm6("icon_url", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new fm6("index_ra_achievement_set_game_id", false, l07.b0("game_id"), l07.b0("ASC")));
        gm6 gm6Var6 = new gm6("ra_achievement_set", linkedHashMap6, linkedHashSet9, linkedHashSet10);
        gm6 P6 = ln2.P(ls5Var, "ra_achievement_set");
        if (!gm6Var6.equals(P6)) {
            return new i40("ra_achievement_set(me.magnum.melonds.database.entities.retroachievements.RAAchievementSetEntity).\n Expected:\n" + gm6Var6 + "\n Found:\n" + P6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new dm6("id", "INTEGER", true, 1, null, 1));
        linkedHashMap7.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("set_id", new dm6("set_id", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("total_awards_casual", new dm6("total_awards_casual", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("total_awards_hardcore", new dm6("total_awards_hardcore", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("title", new dm6("title", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("description", new dm6("description", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("points", new dm6("points", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("display_order", new dm6("display_order", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("badge_url_unlocked", new dm6("badge_url_unlocked", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("badge_url_locked", new dm6("badge_url_locked", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("memory_address", new dm6("memory_address", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("type", new dm6("type", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new fm6("index_ra_achievement_set_id", false, l07.b0("set_id"), l07.b0("ASC")));
        gm6 gm6Var7 = new gm6("ra_achievement", linkedHashMap7, linkedHashSet11, linkedHashSet12);
        gm6 P7 = ln2.P(ls5Var, "ra_achievement");
        if (!gm6Var7.equals(P7)) {
            return new i40("ra_achievement(me.magnum.melonds.database.entities.retroachievements.RAAchievementEntity).\n Expected:\n" + gm6Var7 + "\n Found:\n" + P7, false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("game_id", new dm6("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap8.put("achievement_id", new dm6("achievement_id", "INTEGER", true, 2, null, 1));
        linkedHashMap8.put("is_unlocked", new dm6("is_unlocked", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("is_hardcore", new dm6("is_hardcore", "INTEGER", true, 3, null, 1));
        gm6 gm6Var8 = new gm6("ra_user_achievement", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
        gm6 P8 = ln2.P(ls5Var, "ra_user_achievement");
        if (!gm6Var8.equals(P8)) {
            return new i40("ra_user_achievement(me.magnum.melonds.database.entities.retroachievements.RAUserAchievementEntity).\n Expected:\n" + gm6Var8 + "\n Found:\n" + P8, false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("id", new dm6("id", "INTEGER", true, 1, null, 1));
        linkedHashMap9.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("set_id", new dm6("set_id", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("mem", new dm6("mem", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("format", new dm6("format", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("lower_is_better", new dm6("lower_is_better", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("title", new dm6("title", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("description", new dm6("description", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("hidden", new dm6("hidden", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new fm6("index_ra_leaderboard_set_id", false, l07.b0("set_id"), l07.b0("ASC")));
        gm6 gm6Var9 = new gm6("ra_leaderboard", linkedHashMap9, linkedHashSet13, linkedHashSet14);
        gm6 P9 = ln2.P(ls5Var, "ra_leaderboard");
        if (!gm6Var9.equals(P9)) {
            return new i40("ra_leaderboard(me.magnum.melonds.database.entities.retroachievements.RALeaderboardEntity).\n Expected:\n" + gm6Var9 + "\n Found:\n" + P9, false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("game_id", new dm6("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap10.put("last_achievement_set_updated", new dm6("last_achievement_set_updated", "INTEGER", false, 0, null, 1));
        linkedHashMap10.put("last_user_data_updated", new dm6("last_user_data_updated", "INTEGER", false, 0, null, 1));
        linkedHashMap10.put("last_hardcore_user_data_updated", new dm6("last_hardcore_user_data_updated", "INTEGER", false, 0, null, 1));
        gm6 gm6Var10 = new gm6("ra_game_set_metadata", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
        gm6 P10 = ln2.P(ls5Var, "ra_game_set_metadata");
        if (!gm6Var10.equals(P10)) {
            return new i40("ra_game_set_metadata(me.magnum.melonds.database.entities.retroachievements.RAGameSetMetadata).\n Expected:\n" + gm6Var10 + "\n Found:\n" + P10, false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("game_hash", new dm6("game_hash", "TEXT", true, 1, null, 1));
        linkedHashMap11.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        gm6 gm6Var11 = new gm6("ra_game_hash_library", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
        gm6 P11 = ln2.P(ls5Var, "ra_game_hash_library");
        if (!gm6Var11.equals(P11)) {
            return new i40("ra_game_hash_library(me.magnum.melonds.database.entities.retroachievements.RAGameHashEntity).\n Expected:\n" + gm6Var11 + "\n Found:\n" + P11, false);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("achievement_id", new dm6("achievement_id", "INTEGER", true, 1, null, 1));
        linkedHashMap12.put("game_id", new dm6("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap12.put("for_hardcore_mode", new dm6("for_hardcore_mode", "INTEGER", true, 2, null, 1));
        linkedHashMap12.put("created_at_epoch_ms", new dm6("created_at_epoch_ms", "INTEGER", true, 0, "0", 1));
        gm6 gm6Var12 = new gm6("ra_pending_achievement_award", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
        gm6 P12 = ln2.P(ls5Var, "ra_pending_achievement_award");
        if (!gm6Var12.equals(P12)) {
            return new i40("ra_pending_achievement_award(me.magnum.melonds.database.entities.retroachievements.RAPendingAchievementSubmissionEntity).\n Expected:\n" + gm6Var12 + "\n Found:\n" + P12, false);
        }
        return new i40((String) null, true);
    }

    @Override // defpackage.io1
    public final void a(ls5 ls5Var) {
        int i = this.d;
        ls5Var.getClass();
        switch (i) {
            case 0:
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)");
                yf2.o(ls5Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)");
                yf2.o(ls5Var, "CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `cheat_folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `game_id` INTEGER NOT NULL, `name` TEXT NOT NULL, FOREIGN KEY(`game_id`) REFERENCES `game`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_cheat_folder_game_id` ON `cheat_folder` (`game_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_achievement_set` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `title` TEXT, `type` TEXT NOT NULL, `icon_url` TEXT NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, `created_at_epoch_ms` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                yf2.o(ls5Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '87f13c623fa68b88b9c3e9bff84b16cd')");
                return;
            default:
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                yf2.o(ls5Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                return;
        }
    }

    @Override // defpackage.io1
    public final void c(ls5 ls5Var) {
        int i = this.d;
        ls5Var.getClass();
        switch (i) {
            case 0:
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `cheat_database`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `game`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `cheat_folder`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `cheat`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_game`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_achievement_set`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_achievement`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_user_achievement`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_leaderboard`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_game_set_metadata`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_game_hash_library`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `ra_pending_achievement_award`");
                return;
            default:
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `Dependency`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `WorkSpec`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `WorkTag`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `WorkName`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `WorkProgress`");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS `Preference`");
                return;
        }
    }

    @Override // defpackage.io1
    public final void r(ls5 ls5Var) {
        int i = this.d;
        ls5Var.getClass();
    }

    @Override // defpackage.io1
    public final void s(ls5 ls5Var) {
        int i = this.d;
        sq5 sq5Var = this.e;
        ls5Var.getClass();
        switch (i) {
            case 0:
                yf2.o(ls5Var, "PRAGMA foreign_keys = ON");
                ((MelonDatabase_Impl) sq5Var).m(ls5Var);
                return;
            default:
                yf2.o(ls5Var, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) sq5Var).m(ls5Var);
                return;
        }
    }

    @Override // defpackage.io1
    public final void t(ls5 ls5Var) {
        int i = this.d;
        ls5Var.getClass();
    }

    @Override // defpackage.io1
    public final void u(ls5 ls5Var) {
        int i = this.d;
        ls5Var.getClass();
        switch (i) {
            case 0:
                mh7.I(ls5Var);
                return;
            default:
                mh7.I(ls5Var);
                return;
        }
    }

    @Override // defpackage.io1
    public final i40 v(ls5 ls5Var) {
        switch (this.d) {
            case 0:
                return w(ls5Var);
            default:
                ls5Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new dm6("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("prerequisite_id", new dm6("prerequisite_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("work_spec_id"), l07.b0("id")));
                linkedHashSet.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("prerequisite_id"), l07.b0("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new fm6("index_Dependency_work_spec_id", false, l07.b0("work_spec_id"), l07.b0("ASC")));
                linkedHashSet2.add(new fm6("index_Dependency_prerequisite_id", false, l07.b0("prerequisite_id"), l07.b0("ASC")));
                gm6 gm6Var = new gm6("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                gm6 P = ln2.P(ls5Var, "Dependency");
                if (!gm6Var.equals(P)) {
                    return new i40("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gm6Var + "\n Found:\n" + P, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new dm6("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("state", new dm6("state", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("worker_class_name", new dm6("worker_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input_merger_class_name", new dm6("input_merger_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input", new dm6("input", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("output", new dm6("output", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("initial_delay", new dm6("initial_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("interval_duration", new dm6("interval_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("flex_duration", new dm6("flex_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_attempt_count", new dm6("run_attempt_count", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_policy", new dm6("backoff_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_delay_duration", new dm6("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("last_enqueue_time", new dm6("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                linkedHashMap2.put("minimum_retention_duration", new dm6("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("schedule_requested_at", new dm6("schedule_requested_at", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_in_foreground", new dm6("run_in_foreground", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("out_of_quota_policy", new dm6("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("period_count", new dm6("period_count", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("generation", new dm6("generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("next_schedule_time_override", new dm6("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                linkedHashMap2.put("next_schedule_time_override_generation", new dm6("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("stop_reason", new dm6("stop_reason", "INTEGER", true, 0, "-256", 1));
                linkedHashMap2.put("trace_tag", new dm6("trace_tag", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("backoff_on_system_interruptions", new dm6("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("required_network_type", new dm6("required_network_type", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("required_network_request", new dm6("required_network_request", "BLOB", true, 0, "x''", 1));
                linkedHashMap2.put("requires_charging", new dm6("requires_charging", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_device_idle", new dm6("requires_device_idle", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_battery_not_low", new dm6("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_storage_not_low", new dm6("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_content_update_delay", new dm6("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_max_content_delay", new dm6("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("content_uri_triggers", new dm6("content_uri_triggers", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new fm6("index_WorkSpec_schedule_requested_at", false, l07.b0("schedule_requested_at"), l07.b0("ASC")));
                linkedHashSet4.add(new fm6("index_WorkSpec_last_enqueue_time", false, l07.b0("last_enqueue_time"), l07.b0("ASC")));
                gm6 gm6Var2 = new gm6("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                gm6 P2 = ln2.P(ls5Var, "WorkSpec");
                if (!gm6Var2.equals(P2)) {
                    return new i40("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gm6Var2 + "\n Found:\n" + P2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new dm6("tag", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("work_spec_id", new dm6("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("work_spec_id"), l07.b0("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new fm6("index_WorkTag_work_spec_id", false, l07.b0("work_spec_id"), l07.b0("ASC")));
                gm6 gm6Var3 = new gm6("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                gm6 P3 = ln2.P(ls5Var, "WorkTag");
                if (!gm6Var3.equals(P3)) {
                    return new i40("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gm6Var3 + "\n Found:\n" + P3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new dm6("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("generation", new dm6("generation", "INTEGER", true, 2, "0", 1));
                linkedHashMap4.put("system_id", new dm6("system_id", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("work_spec_id"), l07.b0("id")));
                gm6 gm6Var4 = new gm6("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                gm6 P4 = ln2.P(ls5Var, "SystemIdInfo");
                if (!gm6Var4.equals(P4)) {
                    return new i40("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gm6Var4 + "\n Found:\n" + P4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new dm6("name", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("work_spec_id", new dm6("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("work_spec_id"), l07.b0("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new fm6("index_WorkName_work_spec_id", false, l07.b0("work_spec_id"), l07.b0("ASC")));
                gm6 gm6Var5 = new gm6("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                gm6 P5 = ln2.P(ls5Var, "WorkName");
                if (!gm6Var5.equals(P5)) {
                    return new i40("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gm6Var5 + "\n Found:\n" + P5, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new dm6("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap6.put("progress", new dm6("progress", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new em6("WorkSpec", "CASCADE", "CASCADE", l07.b0("work_spec_id"), l07.b0("id")));
                gm6 gm6Var6 = new gm6("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                gm6 P6 = ln2.P(ls5Var, "WorkProgress");
                if (!gm6Var6.equals(P6)) {
                    return new i40("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gm6Var6 + "\n Found:\n" + P6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new dm6("key", "TEXT", true, 1, null, 1));
                linkedHashMap7.put("long_value", new dm6("long_value", "INTEGER", false, 0, null, 1));
                gm6 gm6Var7 = new gm6("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                gm6 P7 = ln2.P(ls5Var, "Preference");
                if (!gm6Var7.equals(P7)) {
                    return new i40("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gm6Var7 + "\n Found:\n" + P7, false);
                }
                return new i40((String) null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw3(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }
}
