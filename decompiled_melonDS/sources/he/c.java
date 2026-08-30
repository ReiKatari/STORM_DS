package he;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6460b;

    public c(t tVar) {
        this.f6460b = 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259  */
    @Override // a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(t7.c r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he.c.j(t7.c, java.lang.Object):void");
    }

    @Override // a.a
    public final String o() {
        switch (this.f6460b) {
            case 0:
                return "INSERT OR REPLACE INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "INSERT OR ABORT INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR ABORT INTO `cheat_database` (`id`,`name`) VALUES (?,?)";
            case 3:
                return "INSERT OR ABORT INTO `cheat_folder` (`id`,`game_id`,`name`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `game` (`id`,`name`,`game_code`,`game_checksum`) VALUES (?,?,?,?)";
            case l1.c.f8511g /* 5 */:
                return "INSERT OR REPLACE INTO `ra_game_set_metadata` (`game_id`,`last_achievement_set_updated`,`last_user_data_updated`,`last_hardcore_user_data_updated`) VALUES (?,?,?,?)";
            case l1.c.f8509e /* 6 */:
                return "INSERT OR REPLACE INTO `ra_achievement_set` (`id`,`game_id`,`title`,`type`,`icon_url`) VALUES (?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `ra_achievement` (`id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `ra_leaderboard` (`id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden`) VALUES (?,?,?,?,?,?,?,?,?)";
            case l1.c.f8508d /* 9 */:
                return "INSERT OR REPLACE INTO `ra_user_achievement` (`game_id`,`achievement_id`,`is_unlocked`,`is_hardcore`) VALUES (?,?,?,?)";
            case l1.c.f8510f /* 10 */:
                return "INSERT OR REPLACE INTO `ra_pending_achievement_award` (`achievement_id`,`game_id`,`for_hardcore_mode`) VALUES (?,?,?)";
            case 11:
                return "INSERT OR ABORT INTO `ra_game_hash_library` (`game_hash`,`game_id`) VALUES (?,?)";
            case 12:
                return "INSERT INTO `ra_game` (`game_id`,`rich_presence_patch`,`title`,`icon`) VALUES (?,?,?,?)";
            case 13:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case l1.c.f8512h /* 15 */:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 16:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 18:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public /* synthetic */ c(int i2) {
        this.f6460b = i2;
    }
}
