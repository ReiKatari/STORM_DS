package cd;

import h1.d3;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;

    public /* synthetic */ k(int i2, long j2) {
        this.A = i2;
        this.B = j2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        ie.b bVar;
        Long valueOf;
        String n10;
        boolean z10;
        Long valueOf2;
        String n11;
        boolean z11;
        je.b bVar2;
        String n12;
        je.d dVar;
        String n13;
        je.h hVar;
        boolean z12;
        boolean z13;
        je.a aVar;
        zc.h hVar2;
        Object kVar;
        boolean z14;
        String n14;
        int i2;
        int i10;
        Integer valueOf3;
        Boolean bool;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i11 = this.A;
        yb.y yVar = yb.y.f14813a;
        long j2 = this.B;
        switch (i11) {
            case 0:
                return Long.valueOf(j2);
            case DSiCameraSource.FrontCamera /* 1 */:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("DELETE FROM cheat WHERE id = ?");
                try {
                    T.g(1, j2);
                    T.N();
                    return yVar;
                } finally {
                }
            case 2:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                T = aVar3.T("SELECT * FROM cheat WHERE id = ?");
                try {
                    T.g(1, j2);
                    int t5 = p7.m.t(T, "id");
                    int t10 = p7.m.t(T, "cheat_folder_id");
                    int t11 = p7.m.t(T, "cheat_database_id");
                    int t12 = p7.m.t(T, "name");
                    int t13 = p7.m.t(T, "description");
                    int t14 = p7.m.t(T, "code");
                    int t15 = p7.m.t(T, "enabled");
                    if (T.N()) {
                        if (T.isNull(t5)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(T.getLong(t5));
                        }
                        long j10 = T.getLong(t10);
                        long j11 = T.getLong(t11);
                        String n15 = T.n(t12);
                        if (T.isNull(t13)) {
                            n10 = null;
                        } else {
                            n10 = T.n(t13);
                        }
                        String n16 = T.n(t14);
                        if (((int) T.getLong(t15)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bVar = new ie.b(valueOf, j10, j11, n15, n10, n16, z10);
                    } else {
                        bVar = null;
                    }
                    return bVar;
                } finally {
                }
            case 3:
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                T = aVar4.T("SELECT * FROM cheat WHERE cheat_folder_id = ?");
                try {
                    T.g(1, j2);
                    int t16 = p7.m.t(T, "id");
                    int t17 = p7.m.t(T, "cheat_folder_id");
                    int t18 = p7.m.t(T, "cheat_database_id");
                    int t19 = p7.m.t(T, "name");
                    int t20 = p7.m.t(T, "description");
                    int t21 = p7.m.t(T, "code");
                    int t22 = p7.m.t(T, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        if (T.isNull(t16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(T.getLong(t16));
                        }
                        long j12 = T.getLong(t17);
                        long j13 = T.getLong(t18);
                        String n17 = T.n(t19);
                        if (T.isNull(t20)) {
                            n11 = null;
                        } else {
                            n11 = T.n(t20);
                        }
                        String n18 = T.n(t21);
                        if (((int) T.getLong(t22)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new ie.b(valueOf2, j12, j13, n17, n11, n18, z11));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                t7.a aVar5 = (t7.a) obj;
                aVar5.getClass();
                T = aVar5.T("SELECT * FROM ra_achievement_set WHERE id = ?");
                try {
                    T.g(1, j2);
                    int t23 = p7.m.t(T, "id");
                    int t24 = p7.m.t(T, "game_id");
                    int t25 = p7.m.t(T, "title");
                    int t26 = p7.m.t(T, "type");
                    int t27 = p7.m.t(T, "icon_url");
                    if (T.N()) {
                        long j14 = T.getLong(t23);
                        long j15 = T.getLong(t24);
                        if (T.isNull(t25)) {
                            n12 = null;
                        } else {
                            n12 = T.n(t25);
                        }
                        bVar2 = new je.b(j14, j15, n12, T.n(t26), T.n(t27));
                    } else {
                        bVar2 = null;
                    }
                    return bVar2;
                } finally {
                }
            case l1.c.f8511g /* 5 */:
                t7.a aVar6 = (t7.a) obj;
                aVar6.getClass();
                T = aVar6.T("DELETE FROM ra_leaderboard WHERE game_id = ?");
                try {
                    T.g(1, j2);
                    T.N();
                    return yVar;
                } finally {
                }
            case l1.c.f8509e /* 6 */:
                t7.a aVar7 = (t7.a) obj;
                aVar7.getClass();
                T = aVar7.T("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    T.g(1, j2);
                    int t28 = p7.m.t(T, "game_id");
                    int t29 = p7.m.t(T, "rich_presence_patch");
                    int t30 = p7.m.t(T, "title");
                    int t31 = p7.m.t(T, "icon");
                    if (T.N()) {
                        long j16 = T.getLong(t28);
                        if (T.isNull(t29)) {
                            n13 = null;
                        } else {
                            n13 = T.n(t29);
                        }
                        dVar = new je.d(j16, n13, T.n(t30), T.n(t31));
                    } else {
                        dVar = null;
                    }
                    return dVar;
                } finally {
                }
            case 7:
                t7.a aVar8 = (t7.a) obj;
                aVar8.getClass();
                T = aVar8.T("DELETE FROM ra_achievement WHERE game_id = ?");
                try {
                    T.g(1, j2);
                    T.N();
                    return yVar;
                } finally {
                }
            case 8:
                t7.a aVar9 = (t7.a) obj;
                aVar9.getClass();
                T = aVar9.T("SELECT * FROM ra_leaderboard WHERE id = ?");
                try {
                    T.g(1, j2);
                    int t32 = p7.m.t(T, "id");
                    int t33 = p7.m.t(T, "game_id");
                    int t34 = p7.m.t(T, "set_id");
                    int t35 = p7.m.t(T, "mem");
                    int t36 = p7.m.t(T, "format");
                    int t37 = p7.m.t(T, "lower_is_better");
                    int t38 = p7.m.t(T, "title");
                    int t39 = p7.m.t(T, "description");
                    int t40 = p7.m.t(T, "hidden");
                    if (T.N()) {
                        long j17 = T.getLong(t32);
                        long j18 = T.getLong(t33);
                        long j19 = T.getLong(t34);
                        String n19 = T.n(t35);
                        String n20 = T.n(t36);
                        if (((int) T.getLong(t37)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        String n21 = T.n(t38);
                        String n22 = T.n(t39);
                        if (((int) T.getLong(t40)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        hVar = new je.h(j17, j18, j19, n19, n20, z12, n21, n22, z13);
                    } else {
                        hVar = null;
                    }
                    return hVar;
                } finally {
                }
            case l1.c.f8508d /* 9 */:
                t7.a aVar10 = (t7.a) obj;
                aVar10.getClass();
                T = aVar10.T("DELETE FROM ra_user_achievement WHERE game_id = ?");
                try {
                    T.g(1, j2);
                    T.N();
                    return yVar;
                } finally {
                }
            case l1.c.f8510f /* 10 */:
                t7.a aVar11 = (t7.a) obj;
                aVar11.getClass();
                T = aVar11.T("SELECT * FROM ra_achievement WHERE id = ?");
                try {
                    T.g(1, j2);
                    int t41 = p7.m.t(T, "id");
                    int t42 = p7.m.t(T, "game_id");
                    int t43 = p7.m.t(T, "set_id");
                    int t44 = p7.m.t(T, "total_awards_casual");
                    int t45 = p7.m.t(T, "total_awards_hardcore");
                    int t46 = p7.m.t(T, "title");
                    int t47 = p7.m.t(T, "description");
                    int t48 = p7.m.t(T, "points");
                    int t49 = p7.m.t(T, "display_order");
                    int t50 = p7.m.t(T, "badge_url_unlocked");
                    int t51 = p7.m.t(T, "badge_url_locked");
                    int t52 = p7.m.t(T, "memory_address");
                    int t53 = p7.m.t(T, "type");
                    if (T.N()) {
                        aVar = new je.a(T.getLong(t41), T.getLong(t42), T.getLong(t43), (int) T.getLong(t44), (int) T.getLong(t45), T.n(t46), T.n(t47), (int) T.getLong(t48), (int) T.getLong(t49), T.n(t50), T.n(t51), T.n(t52), (int) T.getLong(t53));
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                }
            case 11:
                t7.a aVar12 = (t7.a) obj;
                aVar12.getClass();
                T = aVar12.T("DELETE FROM ra_achievement_set WHERE game_id = ?");
                try {
                    T.g(1, j2);
                    T.N();
                    return yVar;
                } finally {
                }
            case 12:
                f3.c cVar = (f3.c) obj;
                cVar.getClass();
                float b10 = cVar.b() * mh.x.f9706c;
                return cVar.a(new d3(b10, na.f.l(p7.t.y(new i3.s(i3.s.b(j2, 0.0f)), new i3.s(j2)), 0.0f, b10, 10), na.f.l(p7.t.y(new i3.s(j2), new i3.s(i3.s.b(j2, 0.0f))), Float.intBitsToFloat((int) (cVar.A.c() & 4294967295L)) - b10, Float.intBitsToFloat((int) (cVar.A.c() & 4294967295L)), 8), 1));
            case 13:
                n2.d dVar2 = (n2.d) obj;
                mc.l lVar = dVar2.f9879b;
                if (lVar != null && (hVar2 = dVar2.f9878a) != null) {
                    try {
                        kVar = lVar.k(Long.valueOf(j2));
                    } catch (Throwable th2) {
                        kVar = new yb.k(th2);
                    }
                    hVar2.h(kVar);
                }
                return yVar;
            case 14:
                f3.c cVar2 = (f3.c) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (cVar2.A.c() >> 32)) / 2.0f;
                return cVar2.a(new d3(intBitsToFloat, pc.a.r(cVar2, intBitsToFloat), new i3.l(5, j2), 3));
            case l1.c.f8512h /* 15 */:
                ((i4.x) obj).a(f2.i0.f4745c, new f2.h0(u1.c0.Cursor, this.B, f2.g0.Middle, true));
                return yVar;
            default:
                t7.a aVar13 = (t7.a) obj;
                aVar13.getClass();
                T = aVar13.T("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    T.g(1, j2);
                    int t54 = p7.m.t(T, "id");
                    int t55 = p7.m.t(T, "state");
                    int t56 = p7.m.t(T, "worker_class_name");
                    int t57 = p7.m.t(T, "input_merger_class_name");
                    int t58 = p7.m.t(T, "input");
                    int t59 = p7.m.t(T, "output");
                    int t60 = p7.m.t(T, "initial_delay");
                    int t61 = p7.m.t(T, "interval_duration");
                    int t62 = p7.m.t(T, "flex_duration");
                    int t63 = p7.m.t(T, "run_attempt_count");
                    int t64 = p7.m.t(T, "backoff_policy");
                    int t65 = p7.m.t(T, "backoff_delay_duration");
                    int t66 = p7.m.t(T, "last_enqueue_time");
                    int t67 = p7.m.t(T, "minimum_retention_duration");
                    int t68 = p7.m.t(T, "schedule_requested_at");
                    int t69 = p7.m.t(T, "run_in_foreground");
                    int t70 = p7.m.t(T, "out_of_quota_policy");
                    int t71 = p7.m.t(T, "period_count");
                    int t72 = p7.m.t(T, "generation");
                    int t73 = p7.m.t(T, "next_schedule_time_override");
                    int t74 = p7.m.t(T, "next_schedule_time_override_generation");
                    int t75 = p7.m.t(T, "stop_reason");
                    int t76 = p7.m.t(T, "trace_tag");
                    int t77 = p7.m.t(T, "backoff_on_system_interruptions");
                    int t78 = p7.m.t(T, "required_network_type");
                    int t79 = p7.m.t(T, "required_network_request");
                    int t80 = p7.m.t(T, "requires_charging");
                    int t81 = p7.m.t(T, "requires_device_idle");
                    int t82 = p7.m.t(T, "requires_battery_not_low");
                    int t83 = p7.m.t(T, "requires_storage_not_low");
                    int t84 = p7.m.t(T, "trigger_content_update_delay");
                    int t85 = p7.m.t(T, "trigger_max_content_delay");
                    int t86 = p7.m.t(T, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (T.N()) {
                        String n23 = T.n(t54);
                        int i12 = t54;
                        ArrayList arrayList3 = arrayList2;
                        p8.e0 x9 = p7.m.x((int) T.getLong(t55));
                        String n24 = T.n(t56);
                        String n25 = T.n(t57);
                        byte[] blob = T.getBlob(t58);
                        p8.h hVar3 = p8.h.f11493b;
                        p8.h v10 = p7.j.v(blob);
                        p8.h v11 = p7.j.v(T.getBlob(t59));
                        long j20 = T.getLong(t60);
                        long j21 = T.getLong(t61);
                        long j22 = T.getLong(t62);
                        int i13 = (int) T.getLong(t63);
                        p8.a u4 = p7.m.u((int) T.getLong(t64));
                        long j23 = T.getLong(t65);
                        long j24 = T.getLong(t66);
                        long j25 = T.getLong(t67);
                        int i14 = t68;
                        long j26 = T.getLong(i14);
                        int i15 = t55;
                        int i16 = t69;
                        int i17 = t56;
                        if (((int) T.getLong(i16)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i18 = t70;
                        p8.c0 w10 = p7.m.w((int) T.getLong(i18));
                        int i19 = t71;
                        int i20 = (int) T.getLong(i19);
                        int i21 = t72;
                        int i22 = (int) T.getLong(i21);
                        int i23 = t73;
                        long j27 = T.getLong(i23);
                        int i24 = t74;
                        int i25 = (int) T.getLong(i24);
                        int i26 = t75;
                        int i27 = (int) T.getLong(i26);
                        int i28 = t76;
                        if (T.isNull(i28)) {
                            n14 = null;
                        } else {
                            n14 = T.n(i28);
                        }
                        int i29 = t77;
                        if (T.isNull(i29)) {
                            i2 = i25;
                            i10 = i26;
                            valueOf3 = null;
                        } else {
                            i2 = i25;
                            i10 = i26;
                            valueOf3 = Integer.valueOf((int) T.getLong(i29));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            bool = Boolean.valueOf(z19);
                        } else {
                            bool = null;
                        }
                        t77 = i29;
                        int i30 = t78;
                        p8.w v12 = p7.m.v((int) T.getLong(i30));
                        int i31 = t79;
                        y8.f H = p7.m.H(T.getBlob(i31));
                        t78 = i30;
                        int i32 = t80;
                        if (((int) T.getLong(i32)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        t80 = i32;
                        int i33 = t81;
                        if (((int) T.getLong(i33)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t81 = i33;
                        int i34 = t82;
                        if (((int) T.getLong(i34)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        t82 = i34;
                        int i35 = t83;
                        if (((int) T.getLong(i35)) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        int i36 = t84;
                        int i37 = t85;
                        t84 = i36;
                        int i38 = t86;
                        t86 = i38;
                        t85 = i37;
                        arrayList2 = arrayList3;
                        arrayList2.add(new x8.p(n23, x9, n24, n25, v10, v11, j20, j21, j22, new p8.e(H, v12, z15, z16, z17, z18, T.getLong(i36), T.getLong(i37), p7.m.f(T.getBlob(i38))), i13, u4, j23, j24, j25, j26, z14, w10, i20, i22, j27, i2, i27, n14, bool));
                        t83 = i35;
                        t54 = i12;
                        t55 = i15;
                        t68 = i14;
                        t71 = i19;
                        t72 = i21;
                        t73 = i23;
                        t74 = i24;
                        t75 = i10;
                        t76 = i28;
                        t79 = i31;
                        t56 = i17;
                        t69 = i16;
                        t70 = i18;
                    }
                    return arrayList2;
                } catch (Throwable th3) {
                    throw th3;
                }
        }
    }
}
