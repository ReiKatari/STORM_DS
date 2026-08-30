package ee;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import k0.g;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q8.r;
import v7.j;
import x8.e;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends n7.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4475c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i2) {
        super(2, 3);
        this.f4475c = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                super(14, 15);
                this.f4476d = new Object();
                return;
            case 2:
                super(19, 20);
                this.f4476d = new l7.a(12);
                return;
            default:
                this.f4476d = new e(13);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, u7.e] */
    @Override // n7.a
    public final void a(t7.a aVar) {
        long j2;
        String str;
        int i2 = this.f4475c;
        aVar.getClass();
        switch (i2) {
            case 0:
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)");
                k.r(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)");
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `_new_game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `database_id` INTEGER, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT, FOREIGN KEY(`database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                k.r(aVar, "INSERT INTO `_new_game` (`id`,`name`,`game_code`,`game_checksum`) SELECT `id`,`name`,`game_code`,`game_checksum` FROM `game`");
                k.r(aVar, "DROP TABLE `game`");
                k.r(aVar, "ALTER TABLE `_new_game` RENAME TO `game`");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_game_game_code` ON `game` (`game_code`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_game_game_checksum` ON `game` (`game_checksum`)");
                t7.c T = aVar.T("PRAGMA foreign_key_check(`game`)");
                try {
                    if (!T.N()) {
                        r.q(T, null);
                        e eVar = (e) this.f4476d;
                        if (aVar instanceof w7.a) {
                            v7.b bVar = ((w7.a) aVar).A;
                            eVar.getClass();
                            bVar.getClass();
                            Cursor B = bVar.B(new Object());
                            if (B.moveToFirst() && B.getInt(0) > 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("name", "DeadSkullzJr's NDS Cheat Database");
                                bVar.w("UPDATE game SET database_id = ?", new Long[]{Long.valueOf(bVar.z(4, contentValues))});
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new SQLException(p7.a.t(T));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        r.q(T, th2);
                        throw th3;
                    }
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                k.r(aVar, "DROP TABLE `WorkSpec`");
                k.r(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                g gVar = (g) this.f4476d;
                if (aVar instanceof w7.a) {
                    v7.b bVar2 = ((w7.a) aVar).A;
                    gVar.getClass();
                    bVar2.getClass();
                    bVar2.v("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues2 = new ContentValues(1);
                    contentValues2.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    Object[] objArr = new Object[0];
                    bVar2.getClass();
                    if (contentValues2.size() != 0) {
                        int size = contentValues2.size();
                        int length = objArr.length + size;
                        Object[] objArr2 = new Object[length];
                        StringBuilder sb2 = new StringBuilder("UPDATE ");
                        sb2.append(v7.b.B[3]);
                        sb2.append("WorkSpec SET ");
                        int i10 = 0;
                        for (String str2 : contentValues2.keySet()) {
                            if (i10 > 0) {
                                str = ",";
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            sb2.append(str2);
                            objArr2[i10] = contentValues2.get(str2);
                            sb2.append("=?");
                            i10++;
                        }
                        for (int i11 = size; i11 < length; i11++) {
                            objArr2[i11] = objArr[i11 - size];
                        }
                        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                        }
                        j m = bVar2.m(sb2.toString());
                        int length2 = objArr2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            Object obj = objArr2[i12];
                            i12++;
                            if (obj == null) {
                                m.e(i12);
                            } else if (obj instanceof byte[]) {
                                m.j(i12, (byte[]) obj);
                            } else if (obj instanceof Float) {
                                m.u(((Number) obj).floatValue(), i12);
                            } else if (obj instanceof Double) {
                                m.u(((Number) obj).doubleValue(), i12);
                            } else if (obj instanceof Long) {
                                m.g(i12, ((Number) obj).longValue());
                            } else if (obj instanceof Integer) {
                                m.g(i12, ((Number) obj).intValue());
                            } else if (obj instanceof Short) {
                                m.g(i12, ((Number) obj).shortValue());
                            } else if (obj instanceof Byte) {
                                m.g(i12, ((Number) obj).byteValue());
                            } else if (obj instanceof String) {
                                m.r(i12, (String) obj);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    j2 = 1;
                                } else {
                                    j2 = 0;
                                }
                                m.g(i12, j2);
                            } else {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i12 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                        }
                        m.B.executeUpdateDelete();
                        return;
                    }
                    a0.j.h("Empty values");
                    return;
                }
                return;
            default:
                k.r(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                k.r(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                k.r(aVar, "DROP TABLE `WorkSpec`");
                k.r(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                k.r(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                l7.a aVar2 = (l7.a) this.f4476d;
                if (aVar instanceof w7.a) {
                    v7.b bVar3 = ((w7.a) aVar).A;
                    aVar2.getClass();
                    bVar3.getClass();
                    bVar3.v("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
