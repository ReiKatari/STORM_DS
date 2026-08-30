package ee;

import android.content.ContentValues;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends n7.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i10, int i11) {
        super(i2, i10);
        this.f4477c = i11;
    }

    @Override // n7.a
    public void a(t7.a aVar) {
        switch (this.f4477c) {
            case 0:
                aVar.getClass();
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_ra_achievement_game_id` ON `ra_achievement` (`game_id`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))");
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                aVar.getClass();
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_game_id` ON `ra_leaderboard` (`game_id`)");
                return;
            default:
                super.a(aVar);
                return;
        }
    }

    @Override // n7.a
    public void b(v7.b bVar) {
        switch (this.f4477c) {
            case 2:
                bVar.getClass();
                bVar.v("ALTER TABLE game ADD COLUMN game_checksum TEXT");
                bVar.v("CREATE INDEX index_game_game_checksum ON game(game_checksum)");
                return;
            case 3:
                bVar.getClass();
                bVar.v("DELETE FROM game WHERE game_checksum IS NULL");
                bVar.v("CREATE TABLE IF NOT EXISTS `_new_cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                bVar.v("INSERT INTO `_new_cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) SELECT `cheat`.`id`,`cheat`.`cheat_folder_id`,`game`.`database_id`,`cheat`.`name`,`cheat`.`description`,`cheat`.`code`,`cheat`.`enabled` FROM `cheat` LEFT JOIN `cheat_folder` ON `cheat`.`cheat_folder_id` = `cheat_folder`.`id` LEFT JOIN `game` ON `cheat_folder`.`game_id` = `game`.`id`");
                bVar.v("DROP TABLE `cheat`");
                bVar.v("ALTER TABLE `_new_cheat` RENAME TO `cheat`");
                bVar.v("CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)");
                bVar.v("CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)");
                bVar.v("CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)");
                bVar.v("INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`");
                bVar.v("DROP TABLE `game`");
                bVar.v("ALTER TABLE `_new_game` RENAME TO `game`");
                bVar.v("DELETE FROM game WHERE id NOT IN (SELECT MIN(id) FROM game GROUP BY game_code, game_checksum)");
                bVar.v("CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)");
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", (Long) 0L);
                contentValues.put("name", "__custom_cheat_database");
                bVar.z(5, contentValues);
                return;
            case 4:
                bVar.getClass();
                bVar.v("DROP TABLE ra_game");
                bVar.v("\n            CREATE TABLE IF NOT EXISTS ra_game (\n                game_id INTEGER PRIMARY KEY NOT NULL,\n                rich_presence_patch TEXT,\n                title TEXT NOT NULL,\n                icon TEXT NOT NULL\n            )\n        ");
                return;
            case l1.c.f8511g /* 5 */:
                bVar.getClass();
                bVar.v("DROP TABLE IF EXISTS `ra_achievement`");
                bVar.v("DROP TABLE IF EXISTS `ra_leaderboard`");
                bVar.v("DROP INDEX IF EXISTS `index_ra_achievement_game_id`");
                bVar.v("DROP INDEX IF EXISTS `index_ra_leaderboard_game_id`");
                bVar.v("CREATE TABLE IF NOT EXISTS `ra_achievement` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `total_awards_casual` INTEGER NOT NULL,\n    `total_awards_hardcore` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `points` INTEGER NOT NULL,\n    `display_order` INTEGER NOT NULL,\n    `badge_url_unlocked` TEXT NOT NULL,\n    `badge_url_locked` TEXT NOT NULL,\n    `memory_address` TEXT NOT NULL,\n    `type` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                bVar.v("CREATE TABLE IF NOT EXISTS `ra_leaderboard` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `set_id` INTEGER NOT NULL,\n    `mem` TEXT NOT NULL,\n    `format` TEXT NOT NULL,\n    `lower_is_better` INTEGER NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT NOT NULL,\n    `hidden` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                bVar.v("CREATE TABLE IF NOT EXISTS `ra_achievement_set` (\n    `id` INTEGER NOT NULL,\n    `game_id` INTEGER NOT NULL,\n    `title` TEXT,\n    `type` TEXT NOT NULL,\n    `icon_url` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                bVar.v("CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)");
                bVar.v("CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)");
                bVar.v("CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)");
                return;
            default:
                super.b(bVar);
                return;
        }
    }
}
