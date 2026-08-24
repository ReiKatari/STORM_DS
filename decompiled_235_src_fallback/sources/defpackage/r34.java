package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r34  reason: default package */
/* loaded from: classes.dex */
public final class r34 extends defpackage.i64 {
    public final /* synthetic */ int c;
    public final java.lang.Object d;

    public r34(int r2) {
            r1 = this;
            r1.c = r2
            switch(r2) {
                case 1: goto L25;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            r2 = 2
            r0 = 3
            r1.<init>(r2, r0)
            w31 r2 = new w31
            r0 = 15
            r2.<init>(r0)
            r1.d = r2
            return
        L14:
            r2 = 19
            r0 = 20
            r1.<init>(r2, r0)
            d90 r2 = new d90
            r0 = 24
            r2.<init>(r0)
            r1.d = r2
            return
        L25:
            r2 = 14
            r0 = 15
            r1.<init>(r2, r0)
            xd5 r2 = new xd5
            r0 = 23
            r2.<init>(r0)
            r1.d = r2
            return
    }

    @Override // defpackage.i64
    public final void b(defpackage.e36 r10) {
            r9 = this;
            int r9 = r9.c
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"
            java.lang.String r2 = "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"
            java.lang.String r3 = "DROP TABLE `WorkSpec`"
            r4 = 0
            r10.getClass()
            switch(r9) {
                case 0: goto Lf5;
                case 1: goto L38;
                default: goto L11;
            }
        L11:
            java.lang.String r9 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            defpackage.ii2.s(r10, r9)
            defpackage.ii2.s(r10, r3)
            defpackage.ii2.s(r10, r2)
            defpackage.ii2.s(r10, r1)
            defpackage.ii2.s(r10, r0)
            boolean r9 = r10 instanceof defpackage.mu6
            if (r9 == 0) goto L37
            mu6 r10 = (defpackage.mu6) r10
            vm2 r9 = r10.A
            r9.getClass()
            java.lang.String r10 = "UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0"
            r9.r(r10)
        L37:
            return
        L38:
            java.lang.String r9 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            defpackage.ii2.s(r10, r9)
            defpackage.ii2.s(r10, r3)
            defpackage.ii2.s(r10, r2)
            defpackage.ii2.s(r10, r1)
            defpackage.ii2.s(r10, r0)
            boolean r9 = r10 instanceof defpackage.mu6
            if (r9 == 0) goto Lf4
            mu6 r10 = (defpackage.mu6) r10
            vm2 r9 = r10.A
            r9.getClass()
            java.lang.String r10 = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0"
            r9.r(r10)
            android.content.ContentValues r10 = new android.content.ContentValues
            r0 = 1
            r10.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "last_enqueue_time"
            r10.put(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r10.size()
            if (r1 == 0) goto Lef
            int r1 = r10.size()
            int r2 = r0.length
            int r2 = r2 + r1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "UPDATE "
            r5.<init>(r6)
            java.lang.String[] r6 = defpackage.vm2.B
            r7 = 3
            r6 = r6[r7]
            r5.append(r6)
            java.lang.String r6 = "WorkSpec SET "
            r5.append(r6)
            java.util.Set r6 = r10.keySet()
            java.util.Iterator r6 = r6.iterator()
        L9d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc5
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r4 <= 0) goto Lae
            java.lang.String r8 = ","
            goto Lb0
        Lae:
            java.lang.String r8 = ""
        Lb0:
            r5.append(r8)
            r5.append(r7)
            int r8 = r4 + 1
            java.lang.Object r7 = r10.get(r7)
            r3[r4] = r7
            java.lang.String r4 = "=?"
            r5.append(r4)
            r4 = r8
            goto L9d
        Lc5:
            r10 = r1
        Lc6:
            if (r10 >= r2) goto Ld1
            int r4 = r10 - r1
            r4 = r0[r4]
            r3[r10] = r4
            int r10 = r10 + 1
            goto Lc6
        Ld1:
            java.lang.String r10 = "last_enqueue_time = 0 AND interval_duration <> 0 "
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto Lde
            java.lang.String r10 = " WHERE last_enqueue_time = 0 AND interval_duration <> 0 "
            r5.append(r10)
        Lde:
            java.lang.String r10 = r5.toString()
            dn2 r9 = r9.k(r10)
            defpackage.np2.p(r9, r3)
            android.database.sqlite.SQLiteStatement r9 = r9.B
            r9.executeUpdateDelete()
            goto Lf4
        Lef:
            java.lang.String r9 = "Empty values"
            defpackage.i.h(r9)
        Lf4:
            return
        Lf5:
            java.lang.String r9 = "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `database_id` INTEGER, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT, FOREIGN KEY(`database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "DROP TABLE `game`"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "ALTER TABLE `_new_game` RENAME TO `game`"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS `index_game_game_code` ON `game` (`game_code`)"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS `index_game_game_checksum` ON `game` (`game_checksum`)"
            defpackage.ii2.s(r10, r9)
            java.lang.String r9 = "PRAGMA foreign_key_check(`game`)"
            j36 r9 = r10.i0(r9)
            boolean r0 = r9.f0()     // Catch: java.lang.Throwable -> L175
            if (r0 != 0) goto L16b
            r0 = 0
            defpackage.lb4.p(r9, r0)
            boolean r9 = r10 instanceof defpackage.mu6
            if (r9 == 0) goto L16a
            mu6 r10 = (defpackage.mu6) r10
            vm2 r9 = r10.A
            r9.getClass()
            java.lang.String r10 = "SELECT COUNT(*) FROM game"
            android.database.Cursor r10 = r9.A(r10)
            boolean r0 = r10.moveToFirst()
            if (r0 == 0) goto L16a
            int r10 = r10.getInt(r4)
            if (r10 <= 0) goto L16a
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r0 = "name"
            java.lang.String r1 = "DeadSkullzJr's NDS Cheat Database"
            r10.put(r0, r1)
            java.lang.String r0 = "cheat_database"
            r1 = 4
            long r0 = r9.v(r0, r1, r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r10 = new java.lang.Long[]{r10}
            java.lang.String r0 = "UPDATE game SET database_id = ?"
            r9.u(r0, r10)
        L16a:
            return
        L16b:
            java.lang.String r10 = defpackage.q60.R(r9)     // Catch: java.lang.Throwable -> L175
            android.database.SQLException r0 = new android.database.SQLException     // Catch: java.lang.Throwable -> L175
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L175
            throw r0     // Catch: java.lang.Throwable -> L175
        L175:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L177
        L177:
            r0 = move-exception
            defpackage.lb4.p(r9, r10)
            throw r0
    }
}
