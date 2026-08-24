package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm0  reason: default package */
/* loaded from: classes.dex */
public final class tm0 extends hf {
    public final /* synthetic */ int u;

    public tm0(bn5 bn5Var) {
        this.u = 7;
    }

    @Override // defpackage.hf
    public final String J() {
        switch (this.u) {
            case 0:
                return "INSERT OR REPLACE INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR ABORT INTO `cheat_database` (`id`,`name`) VALUES (?,?)";
            case 3:
                return "INSERT OR ABORT INTO `cheat_folder` (`id`,`game_id`,`name`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `game` (`id`,`name`,`game_code`,`game_checksum`) VALUES (?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `ra_game_set_metadata` (`game_id`,`last_achievement_set_updated`,`last_user_data_updated`,`last_hardcore_user_data_updated`) VALUES (?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `ra_achievement_set` (`id`,`game_id`,`title`,`type`,`icon_url`) VALUES (?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `ra_achievement` (`id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `ra_leaderboard` (`id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `ra_user_achievement` (`game_id`,`achievement_id`,`is_unlocked`,`is_hardcore`) VALUES (?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `ra_pending_achievement_award` (`achievement_id`,`game_id`,`for_hardcore_mode`,`created_at_epoch_ms`) VALUES (?,?,?,?)";
            case 13:
                return "INSERT OR ABORT INTO `ra_game_hash_library` (`game_hash`,`game_id`) VALUES (?,?)";
            case 14:
                return "INSERT INTO `ra_game` (`game_id`,`rich_presence_patch`,`title`,`icon`) VALUES (?,?,?,?)";
            case 15:
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257  */
    @Override // defpackage.hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(j36 j36Var, Object obj) {
        Long l;
        Long l2;
        int i;
        int i2;
        Integer num;
        int i3;
        int[] j1;
        boolean hasTransport;
        int[] j12;
        boolean hasCapability;
        byte[] byteArray;
        Set<n21> set;
        byte[] byteArray2;
        int i4 = 5;
        switch (this.u) {
            case 0:
                zm0 zm0Var = (zm0) obj;
                j36Var.getClass();
                zm0Var.getClass();
                Long l3 = zm0Var.a;
                if (l3 == null) {
                    j36Var.f(1);
                } else {
                    j36Var.c(1, l3.longValue());
                }
                j36Var.c(2, zm0Var.b);
                j36Var.c(3, zm0Var.c);
                j36Var.w(4, zm0Var.d);
                String str = zm0Var.e;
                if (str == null) {
                    j36Var.f(5);
                } else {
                    j36Var.w(5, str);
                }
                j36Var.w(6, zm0Var.f);
                j36Var.c(7, zm0Var.g ? 1L : 0L);
                return;
            case 1:
                zm0 zm0Var2 = (zm0) obj;
                j36Var.getClass();
                zm0Var2.getClass();
                Long l4 = zm0Var2.a;
                if (l4 == null) {
                    j36Var.f(1);
                } else {
                    j36Var.c(1, l4.longValue());
                }
                j36Var.c(2, zm0Var2.b);
                j36Var.c(3, zm0Var2.c);
                j36Var.w(4, zm0Var2.d);
                String str2 = zm0Var2.e;
                if (str2 == null) {
                    j36Var.f(5);
                } else {
                    j36Var.w(5, str2);
                }
                j36Var.w(6, zm0Var2.f);
                j36Var.c(7, zm0Var2.g ? 1L : 0L);
                return;
            case 2:
                ym0 ym0Var = (ym0) obj;
                j36Var.getClass();
                ym0Var.getClass();
                Long l5 = ym0Var.a;
                if (l5 == null) {
                    j36Var.f(1);
                } else {
                    j36Var.c(1, l5.longValue());
                }
                j36Var.w(2, ym0Var.b);
                return;
            case 3:
                cn0 cn0Var = (cn0) obj;
                j36Var.getClass();
                cn0Var.getClass();
                Long l6 = cn0Var.a;
                if (l6 == null) {
                    j36Var.f(1);
                } else {
                    j36Var.c(1, l6.longValue());
                }
                j36Var.c(2, cn0Var.b);
                j36Var.w(3, cn0Var.c);
                return;
            case 4:
                vh1 vh1Var = (vh1) obj;
                j36Var.getClass();
                vh1Var.getClass();
                j36Var.w(1, vh1Var.a);
                j36Var.w(2, vh1Var.b);
                return;
            case 5:
                lp2 lp2Var = (lp2) obj;
                j36Var.getClass();
                lp2Var.getClass();
                Long l7 = lp2Var.a;
                if (l7 == null) {
                    j36Var.f(1);
                } else {
                    j36Var.c(1, l7.longValue());
                }
                j36Var.w(2, lp2Var.b);
                j36Var.w(3, lp2Var.c);
                j36Var.w(4, lp2Var.d);
                return;
            case 6:
                b15 b15Var = (b15) obj;
                j36Var.getClass();
                b15Var.getClass();
                j36Var.w(1, b15Var.a);
                j36Var.c(2, b15Var.b.longValue());
                return;
            case 7:
                ia5 ia5Var = (ia5) obj;
                j36Var.getClass();
                ia5Var.getClass();
                j36Var.c(1, ia5Var.a);
                s83 s83Var = ia5Var.b;
                Long l8 = null;
                if (s83Var != null) {
                    l = Long.valueOf(s83Var.b());
                } else {
                    l = null;
                }
                if (l == null) {
                    j36Var.f(2);
                } else {
                    j36Var.c(2, l.longValue());
                }
                s83 s83Var2 = ia5Var.c;
                if (s83Var2 != null) {
                    l2 = Long.valueOf(s83Var2.b());
                } else {
                    l2 = null;
                }
                if (l2 == null) {
                    j36Var.f(3);
                } else {
                    j36Var.c(3, l2.longValue());
                }
                s83 s83Var3 = ia5Var.d;
                if (s83Var3 != null) {
                    l8 = Long.valueOf(s83Var3.b());
                }
                if (l8 == null) {
                    j36Var.f(4);
                    return;
                } else {
                    j36Var.c(4, l8.longValue());
                    return;
                }
            case 8:
                t75 t75Var = (t75) obj;
                j36Var.getClass();
                t75Var.getClass();
                j36Var.c(1, t75Var.a);
                j36Var.c(2, t75Var.b);
                String str3 = t75Var.c;
                if (str3 == null) {
                    j36Var.f(3);
                } else {
                    j36Var.w(3, str3);
                }
                j36Var.w(4, t75Var.d);
                j36Var.w(5, t75Var.e);
                return;
            case 9:
                p75 p75Var = (p75) obj;
                j36Var.getClass();
                p75Var.getClass();
                j36Var.c(1, p75Var.a);
                j36Var.c(2, p75Var.b);
                j36Var.c(3, p75Var.c);
                j36Var.c(4, p75Var.d);
                j36Var.c(5, p75Var.e);
                j36Var.w(6, p75Var.f);
                j36Var.w(7, p75Var.g);
                j36Var.c(8, p75Var.h);
                j36Var.c(9, p75Var.i);
                j36Var.w(10, p75Var.j);
                j36Var.w(11, p75Var.k);
                j36Var.w(12, p75Var.l);
                j36Var.c(13, p75Var.m);
                return;
            case 10:
                va5 va5Var = (va5) obj;
                j36Var.getClass();
                va5Var.getClass();
                j36Var.c(1, va5Var.a);
                j36Var.c(2, va5Var.b);
                j36Var.c(3, va5Var.c);
                j36Var.w(4, va5Var.d);
                j36Var.w(5, va5Var.e);
                j36Var.c(6, va5Var.f ? 1L : 0L);
                j36Var.w(7, va5Var.g);
                j36Var.w(8, va5Var.h);
                j36Var.c(9, va5Var.i ? 1L : 0L);
                return;
            case 11:
                fb5 fb5Var = (fb5) obj;
                j36Var.getClass();
                fb5Var.getClass();
                j36Var.c(1, fb5Var.a);
                j36Var.c(2, fb5Var.b);
                j36Var.c(3, fb5Var.c ? 1L : 0L);
                j36Var.c(4, fb5Var.d ? 1L : 0L);
                return;
            case 12:
                ab5 ab5Var = (ab5) obj;
                j36Var.getClass();
                ab5Var.getClass();
                j36Var.c(1, ab5Var.a);
                j36Var.c(2, ab5Var.b);
                j36Var.c(3, ab5Var.c ? 1L : 0L);
                j36Var.c(4, ab5Var.d);
                return;
            case 13:
                fa5 fa5Var = (fa5) obj;
                j36Var.getClass();
                fa5Var.getClass();
                j36Var.w(1, fa5Var.a);
                j36Var.c(2, fa5Var.b);
                return;
            case 14:
                ea5 ea5Var = (ea5) obj;
                j36Var.getClass();
                ea5Var.getClass();
                j36Var.c(1, ea5Var.a);
                String str4 = ea5Var.b;
                if (str4 == null) {
                    j36Var.f(2);
                } else {
                    j36Var.w(2, str4);
                }
                j36Var.w(3, ea5Var.c);
                j36Var.w(4, ea5Var.d);
                return;
            case 15:
                nx6 nx6Var = (nx6) obj;
                j36Var.getClass();
                nx6Var.getClass();
                j36Var.w(1, nx6Var.a);
                j36Var.c(2, nx6Var.b);
                j36Var.c(3, nx6Var.c);
                return;
            case 16:
                pw7 pw7Var = (pw7) obj;
                j36Var.getClass();
                pw7Var.getClass();
                j36Var.w(1, pw7Var.a);
                j36Var.w(2, pw7Var.b);
                return;
            case 17:
                rw7 rw7Var = (rw7) obj;
                j36Var.getClass();
                rw7Var.getClass();
                j36Var.w(1, rw7Var.a);
                xb1 xb1Var = xb1.b;
                j36Var.d(u24.H(rw7Var.b), 2);
                return;
            case 18:
                yw7 yw7Var = (yw7) obj;
                j36Var.getClass();
                yw7Var.getClass();
                j36Var.w(1, yw7Var.a);
                j36Var.c(2, ds7.g(yw7Var.b));
                j36Var.w(3, yw7Var.c);
                j36Var.w(4, yw7Var.d);
                xb1 xb1Var2 = xb1.b;
                j36Var.d(u24.H(yw7Var.e), 5);
                j36Var.d(u24.H(yw7Var.f), 6);
                j36Var.c(7, yw7Var.g);
                j36Var.c(8, yw7Var.h);
                j36Var.c(9, yw7Var.i);
                j36Var.c(10, yw7Var.k);
                w10 w10Var = yw7Var.l;
                w10Var.getClass();
                int i5 = gx7.b[w10Var.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        i = 1;
                    } else {
                        i.d();
                        return;
                    }
                } else {
                    i = 0;
                }
                j36Var.c(11, i);
                j36Var.c(12, yw7Var.m);
                j36Var.c(13, yw7Var.n);
                j36Var.c(14, yw7Var.o);
                j36Var.c(15, yw7Var.p);
                j36Var.c(16, yw7Var.q ? 1L : 0L);
                oo4 oo4Var = yw7Var.r;
                oo4Var.getClass();
                int i6 = gx7.d[oo4Var.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        i2 = 1;
                    } else {
                        i.d();
                        return;
                    }
                } else {
                    i2 = 0;
                }
                j36Var.c(17, i2);
                j36Var.c(18, yw7Var.s);
                j36Var.c(19, yw7Var.t);
                j36Var.c(20, yw7Var.u);
                j36Var.c(21, yw7Var.v);
                j36Var.c(22, yw7Var.w);
                String str5 = yw7Var.x;
                if (str5 == null) {
                    j36Var.f(23);
                } else {
                    j36Var.w(23, str5);
                }
                Boolean bool = yw7Var.y;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    j36Var.f(24);
                } else {
                    j36Var.c(24, num.intValue());
                }
                p21 p21Var = yw7Var.j;
                kf4 kf4Var = p21Var.a;
                kf4Var.getClass();
                int i7 = gx7.c[kf4Var.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (Build.VERSION.SDK_INT < 30 || kf4Var != kf4.TEMPORARILY_UNMETERED) {
                                        u34.C(kf4Var, " to int", "Could not convert ");
                                    }
                                } else {
                                    i4 = 4;
                                }
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 2;
                        }
                    } else {
                        i4 = 1;
                    }
                    j36Var.c(25, i4);
                    af4 af4Var = p21Var.b;
                    af4Var.getClass();
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        byteArray = new byte[0];
                    } else {
                        NetworkRequest networkRequest = (NetworkRequest) af4Var.a;
                        if (networkRequest == null) {
                            byteArray = new byte[0];
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                if (i3 >= 31) {
                                    j1 = networkRequest.getTransportTypes();
                                    j1.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i8 = 0; i8 < 10; i8++) {
                                        int i9 = iArr[i8];
                                        hasTransport = networkRequest.hasTransport(i9);
                                        if (hasTransport) {
                                            arrayList.add(Integer.valueOf(i9));
                                        }
                                    }
                                    j1 = gt0.j1(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    j12 = networkRequest.getCapabilities();
                                    j12.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i10 = 0; i10 < 30; i10++) {
                                        int i11 = iArr2[i10];
                                        hasCapability = networkRequest.hasCapability(i11);
                                        if (hasCapability) {
                                            arrayList2.add(Integer.valueOf(i11));
                                        }
                                    }
                                    j12 = gt0.j1(arrayList2);
                                }
                                objectOutputStream.writeInt(j1.length);
                                for (int i12 : j1) {
                                    objectOutputStream.writeInt(i12);
                                }
                                objectOutputStream.writeInt(j12.length);
                                for (int i13 : j12) {
                                    objectOutputStream.writeInt(i13);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } finally {
                            }
                        }
                    }
                    j36Var.d(byteArray, 26);
                    j36Var.c(27, p21Var.c ? 1L : 0L);
                    j36Var.c(28, p21Var.d ? 1L : 0L);
                    j36Var.c(29, p21Var.e ? 1L : 0L);
                    j36Var.c(30, p21Var.f ? 1L : 0L);
                    j36Var.c(31, p21Var.g);
                    j36Var.c(32, p21Var.h);
                    set = p21Var.i;
                    set.getClass();
                    if (!set.isEmpty()) {
                        byteArray2 = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                            objectOutputStream2.writeInt(set.size());
                            for (n21 n21Var : set) {
                                objectOutputStream2.writeUTF(n21Var.a.toString());
                                objectOutputStream2.writeBoolean(n21Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } finally {
                        }
                    }
                    j36Var.d(byteArray2, 33);
                    return;
                }
                i4 = 0;
                j36Var.c(25, i4);
                af4 af4Var2 = p21Var.b;
                af4Var2.getClass();
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                }
                j36Var.d(byteArray, 26);
                j36Var.c(27, p21Var.c ? 1L : 0L);
                j36Var.c(28, p21Var.d ? 1L : 0L);
                j36Var.c(29, p21Var.e ? 1L : 0L);
                j36Var.c(30, p21Var.f ? 1L : 0L);
                j36Var.c(31, p21Var.g);
                j36Var.c(32, p21Var.h);
                set = p21Var.i;
                set.getClass();
                if (!set.isEmpty()) {
                }
                j36Var.d(byteArray2, 33);
                return;
            default:
                ex7 ex7Var = (ex7) obj;
                j36Var.getClass();
                ex7Var.getClass();
                j36Var.w(1, ex7Var.a);
                j36Var.w(2, ex7Var.b);
                return;
        }
    }

    public /* synthetic */ tm0(int i) {
        this.u = i;
    }
}
