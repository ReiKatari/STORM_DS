package ee;

import a0.l;
import androidx.work.impl.WorkDatabase_Impl;
import j7.e0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k7.t;
import me.magnum.melonds.database.MelonDatabase_Impl;
import p7.p;
import p7.q;
import p7.r;
import p7.s;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4478d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f4479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MelonDatabase_Impl melonDatabase_Impl) {
        super("467b317c097f4f14a1fd3235f46f25aa", 8, "76e1000c94b99049c8aac386a804519c");
        this.f4479e = melonDatabase_Impl;
    }

    private final l w(t7.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new p("id", "INTEGER", false, 1, null, 1));
        linkedHashMap.put("name", new p("name", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new r("index_cheat_database_name", true, p7.t.x("name"), p7.t.x("ASC")));
        s sVar = new s("cheat_database", linkedHashMap, linkedHashSet, linkedHashSet2);
        s H = k.H(aVar, "cheat_database");
        if (!sVar.equals(H)) {
            return new l("cheat_database(me.magnum.melonds.database.entities.CheatDatabaseEntity).\n Expected:\n" + sVar + "\n Found:\n" + H, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new p("id", "INTEGER", false, 1, null, 1));
        linkedHashMap2.put("name", new p("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("game_code", new p("game_code", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("game_checksum", new p("game_checksum", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new r("game_code_checksum_index", true, p7.t.y("game_code", "game_checksum"), p7.t.y("ASC", "ASC")));
        s sVar2 = new s("game", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        s H2 = k.H(aVar, "game");
        if (!sVar2.equals(H2)) {
            return new l("game(me.magnum.melonds.database.entities.GameEntity).\n Expected:\n" + sVar2 + "\n Found:\n" + H2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new p("id", "INTEGER", false, 1, null, 1));
        linkedHashMap3.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("name", new p("name", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new q("game", "CASCADE", "NO ACTION", p7.t.x("game_id"), p7.t.x("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new r("index_cheat_folder_game_id", false, p7.t.x("game_id"), p7.t.x("ASC")));
        s sVar3 = new s("cheat_folder", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        s H3 = k.H(aVar, "cheat_folder");
        if (!sVar3.equals(H3)) {
            return new l("cheat_folder(me.magnum.melonds.database.entities.CheatFolderEntity).\n Expected:\n" + sVar3 + "\n Found:\n" + H3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new p("id", "INTEGER", false, 1, null, 1));
        linkedHashMap4.put("cheat_folder_id", new p("cheat_folder_id", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("cheat_database_id", new p("cheat_database_id", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("name", new p("name", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("description", new p("description", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("code", new p("code", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("enabled", new p("enabled", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new q("cheat_folder", "CASCADE", "NO ACTION", p7.t.x("cheat_folder_id"), p7.t.x("id")));
        linkedHashSet7.add(new q("cheat_database", "CASCADE", "NO ACTION", p7.t.x("cheat_database_id"), p7.t.x("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new r("index_cheat_cheat_folder_id", false, p7.t.x("cheat_folder_id"), p7.t.x("ASC")));
        linkedHashSet8.add(new r("index_cheat_cheat_database_id", false, p7.t.x("cheat_database_id"), p7.t.x("ASC")));
        s sVar4 = new s("cheat", linkedHashMap4, linkedHashSet7, linkedHashSet8);
        s H4 = k.H(aVar, "cheat");
        if (!sVar4.equals(H4)) {
            return new l("cheat(me.magnum.melonds.database.entities.CheatEntity).\n Expected:\n" + sVar4 + "\n Found:\n" + H4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("game_id", new p("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("rich_presence_patch", new p("rich_presence_patch", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("title", new p("title", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("icon", new p("icon", "TEXT", true, 0, null, 1));
        s sVar5 = new s("ra_game", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        s H5 = k.H(aVar, "ra_game");
        if (!sVar5.equals(H5)) {
            return new l("ra_game(me.magnum.melonds.database.entities.retroachievements.RAGameEntity).\n Expected:\n" + sVar5 + "\n Found:\n" + H5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new p("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap6.put("title", new p("title", "TEXT", false, 0, null, 1));
        linkedHashMap6.put("type", new p("type", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("icon_url", new p("icon_url", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new r("index_ra_achievement_set_game_id", false, p7.t.x("game_id"), p7.t.x("ASC")));
        s sVar6 = new s("ra_achievement_set", linkedHashMap6, linkedHashSet9, linkedHashSet10);
        s H6 = k.H(aVar, "ra_achievement_set");
        if (!sVar6.equals(H6)) {
            return new l("ra_achievement_set(me.magnum.melonds.database.entities.retroachievements.RAAchievementSetEntity).\n Expected:\n" + sVar6 + "\n Found:\n" + H6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new p("id", "INTEGER", true, 1, null, 1));
        linkedHashMap7.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("set_id", new p("set_id", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("total_awards_casual", new p("total_awards_casual", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("total_awards_hardcore", new p("total_awards_hardcore", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("title", new p("title", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("description", new p("description", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("points", new p("points", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("display_order", new p("display_order", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("badge_url_unlocked", new p("badge_url_unlocked", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("badge_url_locked", new p("badge_url_locked", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("memory_address", new p("memory_address", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("type", new p("type", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new r("index_ra_achievement_set_id", false, p7.t.x("set_id"), p7.t.x("ASC")));
        s sVar7 = new s("ra_achievement", linkedHashMap7, linkedHashSet11, linkedHashSet12);
        s H7 = k.H(aVar, "ra_achievement");
        if (!sVar7.equals(H7)) {
            return new l("ra_achievement(me.magnum.melonds.database.entities.retroachievements.RAAchievementEntity).\n Expected:\n" + sVar7 + "\n Found:\n" + H7, false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("game_id", new p("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap8.put("achievement_id", new p("achievement_id", "INTEGER", true, 2, null, 1));
        linkedHashMap8.put("is_unlocked", new p("is_unlocked", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("is_hardcore", new p("is_hardcore", "INTEGER", true, 3, null, 1));
        s sVar8 = new s("ra_user_achievement", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
        s H8 = k.H(aVar, "ra_user_achievement");
        if (!sVar8.equals(H8)) {
            return new l("ra_user_achievement(me.magnum.melonds.database.entities.retroachievements.RAUserAchievementEntity).\n Expected:\n" + sVar8 + "\n Found:\n" + H8, false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("id", new p("id", "INTEGER", true, 1, null, 1));
        linkedHashMap9.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("set_id", new p("set_id", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("mem", new p("mem", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("format", new p("format", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("lower_is_better", new p("lower_is_better", "INTEGER", true, 0, null, 1));
        linkedHashMap9.put("title", new p("title", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("description", new p("description", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("hidden", new p("hidden", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new r("index_ra_leaderboard_set_id", false, p7.t.x("set_id"), p7.t.x("ASC")));
        s sVar9 = new s("ra_leaderboard", linkedHashMap9, linkedHashSet13, linkedHashSet14);
        s H9 = k.H(aVar, "ra_leaderboard");
        if (!sVar9.equals(H9)) {
            return new l("ra_leaderboard(me.magnum.melonds.database.entities.retroachievements.RALeaderboardEntity).\n Expected:\n" + sVar9 + "\n Found:\n" + H9, false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("game_id", new p("game_id", "INTEGER", true, 1, null, 1));
        linkedHashMap10.put("last_achievement_set_updated", new p("last_achievement_set_updated", "INTEGER", false, 0, null, 1));
        linkedHashMap10.put("last_user_data_updated", new p("last_user_data_updated", "INTEGER", false, 0, null, 1));
        linkedHashMap10.put("last_hardcore_user_data_updated", new p("last_hardcore_user_data_updated", "INTEGER", false, 0, null, 1));
        s sVar10 = new s("ra_game_set_metadata", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
        s H10 = k.H(aVar, "ra_game_set_metadata");
        if (!sVar10.equals(H10)) {
            return new l("ra_game_set_metadata(me.magnum.melonds.database.entities.retroachievements.RAGameSetMetadata).\n Expected:\n" + sVar10 + "\n Found:\n" + H10, false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("game_hash", new p("game_hash", "TEXT", true, 1, null, 1));
        linkedHashMap11.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        s sVar11 = new s("ra_game_hash_library", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
        s H11 = k.H(aVar, "ra_game_hash_library");
        if (!sVar11.equals(H11)) {
            return new l("ra_game_hash_library(me.magnum.melonds.database.entities.retroachievements.RAGameHashEntity).\n Expected:\n" + sVar11 + "\n Found:\n" + H11, false);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("achievement_id", new p("achievement_id", "INTEGER", true, 1, null, 1));
        linkedHashMap12.put("game_id", new p("game_id", "INTEGER", true, 0, null, 1));
        linkedHashMap12.put("for_hardcore_mode", new p("for_hardcore_mode", "INTEGER", true, 2, null, 1));
        s sVar12 = new s("ra_pending_achievement_award", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
        s H12 = k.H(aVar, "ra_pending_achievement_award");
        if (!sVar12.equals(H12)) {
            return new l("ra_pending_achievement_award(me.magnum.melonds.database.entities.retroachievements.RAPendingAchievementSubmissionEntity).\n Expected:\n" + sVar12 + "\n Found:\n" + H12, false);
        }
        return new l((String) null, true);
    }

    @Override // j7.e0
    public final void a(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
        switch (i2) {
            case 0:
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)");
                k.r(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)");
                k.r(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `cheat_folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `game_id` INTEGER NOT NULL, `name` TEXT NOT NULL, FOREIGN KEY(`game_id`) REFERENCES `game`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_cheat_folder_game_id` ON `cheat_folder` (`game_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_achievement_set` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `title` TEXT, `type` TEXT NOT NULL, `icon_url` TEXT NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k.r(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '467b317c097f4f14a1fd3235f46f25aa')");
                return;
            default:
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k.r(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                return;
        }
    }

    @Override // j7.e0
    public final void c(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
        switch (i2) {
            case 0:
                k.r(aVar, "DROP TABLE IF EXISTS `cheat_database`");
                k.r(aVar, "DROP TABLE IF EXISTS `game`");
                k.r(aVar, "DROP TABLE IF EXISTS `cheat_folder`");
                k.r(aVar, "DROP TABLE IF EXISTS `cheat`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_game`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_achievement_set`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_achievement`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_user_achievement`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_leaderboard`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_game_set_metadata`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_game_hash_library`");
                k.r(aVar, "DROP TABLE IF EXISTS `ra_pending_achievement_award`");
                return;
            default:
                k.r(aVar, "DROP TABLE IF EXISTS `Dependency`");
                k.r(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
                k.r(aVar, "DROP TABLE IF EXISTS `WorkTag`");
                k.r(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                k.r(aVar, "DROP TABLE IF EXISTS `WorkName`");
                k.r(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
                k.r(aVar, "DROP TABLE IF EXISTS `Preference`");
                return;
        }
    }

    @Override // j7.e0
    public final void r(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
    }

    @Override // j7.e0
    public final void s(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
        switch (i2) {
            case 0:
                k.r(aVar, "PRAGMA foreign_keys = ON");
                ((MelonDatabase_Impl) this.f4479e).m(aVar);
                return;
            default:
                k.r(aVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f4479e).m(aVar);
                return;
        }
    }

    @Override // j7.e0
    public final void t(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
    }

    @Override // j7.e0
    public final void u(t7.a aVar) {
        int i2 = this.f4478d;
        aVar.getClass();
        switch (i2) {
            case 0:
                q8.r.v(aVar);
                return;
            default:
                q8.r.v(aVar);
                return;
        }
    }

    @Override // j7.e0
    public final l v(t7.a aVar) {
        switch (this.f4478d) {
            case 0:
                return w(aVar);
            default:
                aVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new p("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("prerequisite_id", new p("prerequisite_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("work_spec_id"), p7.t.x("id")));
                linkedHashSet.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("prerequisite_id"), p7.t.x("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new r("index_Dependency_work_spec_id", false, p7.t.x("work_spec_id"), p7.t.x("ASC")));
                linkedHashSet2.add(new r("index_Dependency_prerequisite_id", false, p7.t.x("prerequisite_id"), p7.t.x("ASC")));
                s sVar = new s("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                s H = k.H(aVar, "Dependency");
                if (!sVar.equals(H)) {
                    return new l("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + sVar + "\n Found:\n" + H, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new p("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("state", new p("state", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("worker_class_name", new p("worker_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input_merger_class_name", new p("input_merger_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input", new p("input", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("output", new p("output", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("initial_delay", new p("initial_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("interval_duration", new p("interval_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("flex_duration", new p("flex_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_attempt_count", new p("run_attempt_count", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_policy", new p("backoff_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_delay_duration", new p("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("last_enqueue_time", new p("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                linkedHashMap2.put("minimum_retention_duration", new p("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("schedule_requested_at", new p("schedule_requested_at", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_in_foreground", new p("run_in_foreground", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("out_of_quota_policy", new p("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("period_count", new p("period_count", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("generation", new p("generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("next_schedule_time_override", new p("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                linkedHashMap2.put("next_schedule_time_override_generation", new p("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("stop_reason", new p("stop_reason", "INTEGER", true, 0, "-256", 1));
                linkedHashMap2.put("trace_tag", new p("trace_tag", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("backoff_on_system_interruptions", new p("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("required_network_type", new p("required_network_type", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("required_network_request", new p("required_network_request", "BLOB", true, 0, "x''", 1));
                linkedHashMap2.put("requires_charging", new p("requires_charging", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_device_idle", new p("requires_device_idle", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_battery_not_low", new p("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_storage_not_low", new p("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_content_update_delay", new p("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_max_content_delay", new p("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("content_uri_triggers", new p("content_uri_triggers", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new r("index_WorkSpec_schedule_requested_at", false, p7.t.x("schedule_requested_at"), p7.t.x("ASC")));
                linkedHashSet4.add(new r("index_WorkSpec_last_enqueue_time", false, p7.t.x("last_enqueue_time"), p7.t.x("ASC")));
                s sVar2 = new s("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                s H2 = k.H(aVar, "WorkSpec");
                if (!sVar2.equals(H2)) {
                    return new l("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + sVar2 + "\n Found:\n" + H2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new p("tag", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("work_spec_id", new p("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("work_spec_id"), p7.t.x("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new r("index_WorkTag_work_spec_id", false, p7.t.x("work_spec_id"), p7.t.x("ASC")));
                s sVar3 = new s("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                s H3 = k.H(aVar, "WorkTag");
                if (!sVar3.equals(H3)) {
                    return new l("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + sVar3 + "\n Found:\n" + H3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new p("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("generation", new p("generation", "INTEGER", true, 2, "0", 1));
                linkedHashMap4.put("system_id", new p("system_id", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("work_spec_id"), p7.t.x("id")));
                s sVar4 = new s("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                s H4 = k.H(aVar, "SystemIdInfo");
                if (!sVar4.equals(H4)) {
                    return new l("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + sVar4 + "\n Found:\n" + H4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new p("name", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("work_spec_id", new p("work_spec_id", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("work_spec_id"), p7.t.x("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new r("index_WorkName_work_spec_id", false, p7.t.x("work_spec_id"), p7.t.x("ASC")));
                s sVar5 = new s("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                s H5 = k.H(aVar, "WorkName");
                if (!sVar5.equals(H5)) {
                    return new l("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + sVar5 + "\n Found:\n" + H5, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new p("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap6.put("progress", new p("progress", "BLOB", true, 0, null, 1));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new q("WorkSpec", "CASCADE", "CASCADE", p7.t.x("work_spec_id"), p7.t.x("id")));
                s sVar6 = new s("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                s H6 = k.H(aVar, "WorkProgress");
                if (!sVar6.equals(H6)) {
                    return new l("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + sVar6 + "\n Found:\n" + H6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new p("key", "TEXT", true, 1, null, 1));
                linkedHashMap7.put("long_value", new p("long_value", "INTEGER", false, 0, null, 1));
                s sVar7 = new s("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                s H7 = k.H(aVar, "Preference");
                if (!sVar7.equals(H7)) {
                    return new l("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + sVar7 + "\n Found:\n" + H7, false);
                }
                return new l((String) null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.f4479e = workDatabase_Impl;
    }
}
