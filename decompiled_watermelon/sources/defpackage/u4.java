package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;

    public /* synthetic */ u4(int i, long j) {
        this.A = i;
        this.B = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [ey4] */
    /* JADX WARN: Type inference failed for: r22v0, types: [rk0] */
    /* JADX WARN: Type inference failed for: r22v2, types: [l15] */
    /* JADX WARN: Type inference failed for: r6v3, types: [u05] */
    /* JADX WARN: Type inference failed for: r7v8, types: [iy4] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ih0 ih0Var;
        Object kc5Var;
        ns5 i0;
        Long valueOf;
        boolean z;
        Long valueOf2;
        String q;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String q2;
        int i;
        int i2;
        Integer valueOf3;
        Boolean bool;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i3 = this.A;
        o27 o27Var = o27.a;
        String str = null;
        long j = this.B;
        switch (i3) {
            case 0:
                g80 g80Var = (g80) obj;
                g80Var.getClass();
                float b = g80Var.b() * 40.0f;
                return g80Var.a(new n4(b, sn1.o(l07.c0(new xq0(j), new xq0(xq0.b(RecyclerView.A1, j))), Float.intBitsToFloat((int) (g80Var.A.d() & 4294967295L)) - b, Float.intBitsToFloat((int) (g80Var.A.d() & 4294967295L)), 8), 0));
            case 1:
                g80 g80Var2 = (g80) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (g80Var2.A.d() >> 32)) / 2.0f;
                return g80Var2.a(new ef(intBitsToFloat, se.n(g80Var2, intBitsToFloat), new b30(5, j), 0));
            case 2:
                y50 y50Var = (y50) obj;
                mi2 mi2Var = y50Var.b;
                if (mi2Var != null && (ih0Var = y50Var.a) != null) {
                    try {
                        kc5Var = mi2Var.n(Long.valueOf(j));
                    } catch (Throwable th) {
                        kc5Var = new kc5(th);
                    }
                    ih0Var.k(kc5Var);
                }
                return o27Var;
            case 3:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("DELETE FROM cheat WHERE id = ?");
                try {
                    i0.g(1, j);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 4:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT * FROM cheat WHERE id = ?");
                try {
                    i0.g(1, j);
                    int r = hi2.r(i0, "id");
                    int r2 = hi2.r(i0, "cheat_folder_id");
                    int r3 = hi2.r(i0, "cheat_database_id");
                    int r4 = hi2.r(i0, "name");
                    int r5 = hi2.r(i0, "description");
                    int r6 = hi2.r(i0, "code");
                    int r7 = hi2.r(i0, "enabled");
                    if (i0.a0()) {
                        if (i0.isNull(r)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(r));
                        }
                        long j2 = i0.getLong(r2);
                        long j3 = i0.getLong(r3);
                        String q3 = i0.q(r4);
                        if (!i0.isNull(r5)) {
                            str = i0.q(r5);
                        }
                        String str2 = str;
                        String q4 = i0.q(r6);
                        if (((int) i0.getLong(r7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        str = new rk0(valueOf, j2, j3, q3, str2, q4, z);
                    }
                    return str;
                } finally {
                }
            case 5:
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                i0 = ls5Var3.i0("SELECT * FROM cheat WHERE cheat_folder_id = ?");
                try {
                    i0.g(1, j);
                    int r8 = hi2.r(i0, "id");
                    int r9 = hi2.r(i0, "cheat_folder_id");
                    int r10 = hi2.r(i0, "cheat_database_id");
                    int r11 = hi2.r(i0, "name");
                    int r12 = hi2.r(i0, "description");
                    int r13 = hi2.r(i0, "code");
                    int r14 = hi2.r(i0, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        if (i0.isNull(r8)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(i0.getLong(r8));
                        }
                        long j4 = i0.getLong(r9);
                        long j5 = i0.getLong(r10);
                        String q5 = i0.q(r11);
                        if (i0.isNull(r12)) {
                            q = null;
                        } else {
                            q = i0.q(r12);
                        }
                        String q6 = i0.q(r13);
                        if (((int) i0.getLong(r14)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new rk0(valueOf2, j4, j5, q5, q, q6, z2));
                    }
                    return arrayList;
                } finally {
                }
            case ig7.b /* 6 */:
                ((rz5) obj).b(az5.a, new zy5(dp2.Cursor, this.B, yy5.Middle, true));
                return o27Var;
            case 7:
                return Long.valueOf(j);
            case 8:
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                i0 = ls5Var4.i0("DELETE FROM ra_achievement_set WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 9:
                ls5 ls5Var5 = (ls5) obj;
                ls5Var5.getClass();
                i0 = ls5Var5.i0("DELETE FROM ra_leaderboard WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 10:
                ls5 ls5Var6 = (ls5) obj;
                ls5Var6.getClass();
                i0 = ls5Var6.i0("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    int r15 = hi2.r(i0, "game_id");
                    int r16 = hi2.r(i0, "rich_presence_patch");
                    int r17 = hi2.r(i0, "title");
                    int r18 = hi2.r(i0, "icon");
                    if (i0.a0()) {
                        long j6 = i0.getLong(r15);
                        if (!i0.isNull(r16)) {
                            str = i0.q(r16);
                        }
                        str = new u05(j6, str, i0.q(r17), i0.q(r18));
                    }
                    return str;
                } finally {
                }
            case 11:
                ls5 ls5Var7 = (ls5) obj;
                ls5Var7.getClass();
                i0 = ls5Var7.i0("SELECT * FROM ra_leaderboard WHERE id = ?");
                try {
                    i0.g(1, j);
                    int r19 = hi2.r(i0, "id");
                    int r20 = hi2.r(i0, "game_id");
                    int r21 = hi2.r(i0, "set_id");
                    int r22 = hi2.r(i0, "mem");
                    int r23 = hi2.r(i0, "format");
                    int r24 = hi2.r(i0, "lower_is_better");
                    int r25 = hi2.r(i0, "title");
                    int r26 = hi2.r(i0, "description");
                    int r27 = hi2.r(i0, "hidden");
                    if (i0.a0()) {
                        long j7 = i0.getLong(r19);
                        long j8 = i0.getLong(r20);
                        long j9 = i0.getLong(r21);
                        String q7 = i0.q(r22);
                        String q8 = i0.q(r23);
                        if (((int) i0.getLong(r24)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String q9 = i0.q(r25);
                        String q10 = i0.q(r26);
                        if (((int) i0.getLong(r27)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        str = new l15(j7, j8, j9, q7, q8, z3, q9, q10, z4);
                    }
                    return str;
                } finally {
                }
            case mj2.L /* 12 */:
                ls5 ls5Var8 = (ls5) obj;
                ls5Var8.getClass();
                i0 = ls5Var8.i0("SELECT * FROM ra_achievement WHERE id = ?");
                try {
                    i0.g(1, j);
                    int r28 = hi2.r(i0, "id");
                    int r29 = hi2.r(i0, "game_id");
                    int r30 = hi2.r(i0, "set_id");
                    int r31 = hi2.r(i0, "total_awards_casual");
                    int r32 = hi2.r(i0, "total_awards_hardcore");
                    int r33 = hi2.r(i0, "title");
                    int r34 = hi2.r(i0, "description");
                    int r35 = hi2.r(i0, "points");
                    int r36 = hi2.r(i0, "display_order");
                    int r37 = hi2.r(i0, "badge_url_unlocked");
                    int r38 = hi2.r(i0, "badge_url_locked");
                    int r39 = hi2.r(i0, "memory_address");
                    int r40 = hi2.r(i0, "type");
                    if (i0.a0()) {
                        str = new ey4(i0.getLong(r28), i0.getLong(r29), i0.getLong(r30), (int) i0.getLong(r31), (int) i0.getLong(r32), i0.q(r33), i0.q(r34), (int) i0.getLong(r35), (int) i0.getLong(r36), i0.q(r37), i0.q(r38), i0.q(r39), (int) i0.getLong(r40));
                    }
                    return str;
                } finally {
                }
            case 13:
                ls5 ls5Var9 = (ls5) obj;
                ls5Var9.getClass();
                i0 = ls5Var9.i0("SELECT * FROM ra_achievement_set WHERE id = ?");
                try {
                    i0.g(1, j);
                    int r41 = hi2.r(i0, "id");
                    int r42 = hi2.r(i0, "game_id");
                    int r43 = hi2.r(i0, "title");
                    int r44 = hi2.r(i0, "type");
                    int r45 = hi2.r(i0, "icon_url");
                    if (i0.a0()) {
                        long j10 = i0.getLong(r41);
                        long j11 = i0.getLong(r42);
                        if (!i0.isNull(r43)) {
                            str = i0.q(r43);
                        }
                        str = new iy4(j10, j11, str, i0.q(r44), i0.q(r45));
                    }
                    return str;
                } finally {
                }
            case 14:
                ls5 ls5Var10 = (ls5) obj;
                ls5Var10.getClass();
                i0 = ls5Var10.i0("SELECT game_hash FROM ra_game_hash_library WHERE game_id = ? LIMIT 1");
                try {
                    i0.g(1, j);
                    if (i0.a0() && !i0.isNull(0)) {
                        str = i0.q(0);
                    }
                    return str;
                } finally {
                }
            case ig7.e /* 15 */:
                ls5 ls5Var11 = (ls5) obj;
                ls5Var11.getClass();
                i0 = ls5Var11.i0("DELETE FROM ra_achievement WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 16:
                ls5 ls5Var12 = (ls5) obj;
                ls5Var12.getClass();
                i0 = ls5Var12.i0("DELETE FROM ra_user_achievement WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 17:
                g80 g80Var3 = (g80) obj;
                g80Var3.getClass();
                float b2 = g80Var3.b() * 3.0f;
                float l = io2.l((g80Var3.b() * 1.0f) / b2, RecyclerView.A1, 1.0f);
                ti4 ti4Var = new ti4(Float.valueOf((float) RecyclerView.A1), new xq0(j));
                ti4 ti4Var2 = new ti4(Float.valueOf(l), new xq0(j));
                Float valueOf4 = Float.valueOf(l);
                long j12 = xq0.g;
                return g80Var3.a(new yb(8, new n95(29, sn1.n(new ti4[]{ti4Var, ti4Var2, new ti4(valueOf4, new xq0(j12)), new ti4(Float.valueOf(1.0f), new xq0(j12))}, b2))));
            default:
                ls5 ls5Var13 = (ls5) obj;
                ls5Var13.getClass();
                i0 = ls5Var13.i0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    i0.g(1, j);
                    int r46 = hi2.r(i0, "id");
                    int r47 = hi2.r(i0, "state");
                    int r48 = hi2.r(i0, "worker_class_name");
                    int r49 = hi2.r(i0, "input_merger_class_name");
                    int r50 = hi2.r(i0, "input");
                    int r51 = hi2.r(i0, "output");
                    int r52 = hi2.r(i0, "initial_delay");
                    int r53 = hi2.r(i0, "interval_duration");
                    int r54 = hi2.r(i0, "flex_duration");
                    int r55 = hi2.r(i0, "run_attempt_count");
                    int r56 = hi2.r(i0, "backoff_policy");
                    int r57 = hi2.r(i0, "backoff_delay_duration");
                    int r58 = hi2.r(i0, "last_enqueue_time");
                    int r59 = hi2.r(i0, "minimum_retention_duration");
                    int r60 = hi2.r(i0, "schedule_requested_at");
                    int r61 = hi2.r(i0, "run_in_foreground");
                    int r62 = hi2.r(i0, "out_of_quota_policy");
                    int r63 = hi2.r(i0, "period_count");
                    int r64 = hi2.r(i0, "generation");
                    int r65 = hi2.r(i0, "next_schedule_time_override");
                    int r66 = hi2.r(i0, "next_schedule_time_override_generation");
                    int r67 = hi2.r(i0, "stop_reason");
                    int r68 = hi2.r(i0, "trace_tag");
                    int r69 = hi2.r(i0, "backoff_on_system_interruptions");
                    int r70 = hi2.r(i0, "required_network_type");
                    int r71 = hi2.r(i0, "required_network_request");
                    int r72 = hi2.r(i0, "requires_charging");
                    int r73 = hi2.r(i0, "requires_device_idle");
                    int r74 = hi2.r(i0, "requires_battery_not_low");
                    int r75 = hi2.r(i0, "requires_storage_not_low");
                    int r76 = hi2.r(i0, "trigger_content_update_delay");
                    int r77 = hi2.r(i0, "trigger_max_content_delay");
                    int r78 = hi2.r(i0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.a0()) {
                        String q11 = i0.q(r46);
                        int i4 = r58;
                        int i5 = r59;
                        ih7 h = ii7.h((int) i0.getLong(r47));
                        String q12 = i0.q(r48);
                        String q13 = i0.q(r49);
                        byte[] blob = i0.getBlob(r50);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        g81 D2 = a53.D(i0.getBlob(r51));
                        long j13 = i0.getLong(r52);
                        long j14 = i0.getLong(r53);
                        long j15 = i0.getLong(r54);
                        int i6 = (int) i0.getLong(r55);
                        int i7 = r47;
                        int i8 = r48;
                        f00 e = ii7.e((int) i0.getLong(r56));
                        long j16 = i0.getLong(r57);
                        long j17 = i0.getLong(i4);
                        long j18 = i0.getLong(i5);
                        int i9 = r46;
                        int i10 = r60;
                        long j19 = i0.getLong(i10);
                        r60 = i10;
                        int i11 = r61;
                        if (((int) i0.getLong(i11)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i12 = r62;
                        int i13 = r49;
                        mf4 g = ii7.g((int) i0.getLong(i12));
                        int i14 = r63;
                        int i15 = r50;
                        int i16 = (int) i0.getLong(i14);
                        int i17 = r64;
                        int i18 = (int) i0.getLong(i17);
                        int i19 = r65;
                        long j20 = i0.getLong(i19);
                        int i20 = r66;
                        int i21 = (int) i0.getLong(i20);
                        int i22 = r67;
                        int i23 = (int) i0.getLong(i22);
                        int i24 = r68;
                        if (i0.isNull(i24)) {
                            q2 = null;
                        } else {
                            q2 = i0.q(i24);
                        }
                        int i25 = r69;
                        if (i0.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf3 = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf3 = Integer.valueOf((int) i0.getLong(i25));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        } else {
                            bool = null;
                        }
                        int i26 = r70;
                        v64 f = ii7.f((int) i0.getLong(i26));
                        int i27 = r71;
                        m64 k = ii7.k(i0.getBlob(i27));
                        r70 = i26;
                        r71 = i27;
                        int i28 = r72;
                        if (((int) i0.getLong(i28)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        r72 = i28;
                        int i29 = r73;
                        if (((int) i0.getLong(i29)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i30 = r74;
                        if (((int) i0.getLong(i30)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        r74 = i30;
                        int i31 = r75;
                        if (((int) i0.getLong(i31)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i32 = r76;
                        int i33 = r77;
                        int i34 = r78;
                        arrayList2.add(new xh7(q11, h, q12, q13, D, D2, j13, j14, j15, new kz0(k, f, z6, z7, z8, z9, i0.getLong(i32), i0.getLong(i33), ii7.a(i0.getBlob(i34))), i6, e, j16, j17, j18, j19, z5, g, i16, i18, j20, i, i23, q2, bool));
                        r75 = i31;
                        r49 = i13;
                        r62 = i12;
                        r64 = i17;
                        r67 = i2;
                        r69 = i25;
                        r78 = i34;
                        r76 = i32;
                        r77 = i33;
                        r47 = i7;
                        r46 = i9;
                        r58 = i4;
                        r48 = i8;
                        r59 = i5;
                        r61 = i11;
                        r65 = i19;
                        r66 = i20;
                        r68 = i24;
                        r73 = i29;
                        r50 = i15;
                        r63 = i14;
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
