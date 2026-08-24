package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;

    public /* synthetic */ t4(int i, long j) {
        this.A = i;
        this.B = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [p75] */
    /* JADX WARN: Type inference failed for: r27v0, types: [va5] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ea5] */
    /* JADX WARN: Type inference failed for: r7v12, types: [t75] */
    /* JADX WARN: Type inference failed for: r8v4, types: [zm0] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        rj0 rj0Var;
        Object em5Var;
        j36 i0;
        Long valueOf;
        boolean z;
        Long valueOf2;
        String R;
        boolean z2;
        Long valueOf3;
        boolean z3;
        boolean z4;
        boolean z5;
        String R2;
        int i;
        int i2;
        Integer valueOf4;
        Boolean bool;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        String str = null;
        long j = this.B;
        switch (i3) {
            case 0:
                oa0 oa0Var = (oa0) obj;
                oa0Var.getClass();
                float a = oa0Var.a() * 40.0f;
                return oa0Var.b(new n4(a, d90.m(hf.c0(new kt0(j), new kt0(kt0.c(RecyclerView.B1, j))), Float.intBitsToFloat((int) (oa0Var.A.e() & 4294967295L)) - a, Float.intBitsToFloat((int) (oa0Var.A.e() & 4294967295L)), 8), 0));
            case 1:
                oa0 oa0Var2 = (oa0) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (oa0Var2.A.e() >> 32)) / 2.0f;
                return oa0Var2.b(new uf(intBitsToFloat, mb3.x(oa0Var2, intBitsToFloat), new z40(5, j), 0));
            case 2:
                c80 c80Var = (c80) obj;
                qn2 qn2Var = c80Var.b;
                if (qn2Var != null && (rj0Var = c80Var.a) != null) {
                    try {
                        em5Var = qn2Var.g(Long.valueOf(j));
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    rj0Var.i(em5Var);
                }
                return jg7Var;
            case 3:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("DELETE FROM cheat WHERE id = ?");
                try {
                    i0.c(1, j);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 4:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT * FROM cheat WHERE id = ?");
                try {
                    i0.c(1, j);
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "cheat_folder_id");
                    int B3 = ej2.B(i0, "cheat_database_id");
                    int B4 = ej2.B(i0, "name");
                    int B5 = ej2.B(i0, "description");
                    int B6 = ej2.B(i0, "code");
                    int B7 = ej2.B(i0, "enabled");
                    if (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(B));
                        }
                        long j2 = i0.getLong(B2);
                        long j3 = i0.getLong(B3);
                        String R3 = i0.R(B4);
                        if (!i0.isNull(B5)) {
                            str = i0.R(B5);
                        }
                        String str2 = str;
                        String R4 = i0.R(B6);
                        if (((int) i0.getLong(B7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        str = new zm0(valueOf, j2, j3, R3, str2, R4, z);
                    }
                    return str;
                } finally {
                }
            case 5:
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                i0 = e36Var3.i0("SELECT * FROM cheat WHERE cheat_folder_id = ?");
                try {
                    i0.c(1, j);
                    int B8 = ej2.B(i0, "id");
                    int B9 = ej2.B(i0, "cheat_folder_id");
                    int B10 = ej2.B(i0, "cheat_database_id");
                    int B11 = ej2.B(i0, "name");
                    int B12 = ej2.B(i0, "description");
                    int B13 = ej2.B(i0, "code");
                    int B14 = ej2.B(i0, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        if (i0.isNull(B8)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(i0.getLong(B8));
                        }
                        long j4 = i0.getLong(B9);
                        long j5 = i0.getLong(B10);
                        String R5 = i0.R(B11);
                        if (i0.isNull(B12)) {
                            R = null;
                        } else {
                            R = i0.R(B12);
                        }
                        String R6 = i0.R(B13);
                        if (((int) i0.getLong(B14)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new zm0(valueOf2, j4, j5, R5, R, R6, z2));
                    }
                    return arrayList;
                } finally {
                }
            case 6:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                i0 = e36Var4.i0("SELECT * FROM cheat_folder WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    int B15 = ej2.B(i0, "id");
                    int B16 = ej2.B(i0, "game_id");
                    int B17 = ej2.B(i0, "name");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        if (i0.isNull(B15)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(i0.getLong(B15));
                        }
                        arrayList2.add(new cn0(valueOf3, i0.getLong(B16), i0.R(B17)));
                    }
                    return arrayList2;
                } finally {
                }
            case 7:
                no1 no1Var = (no1) obj;
                no1Var.getClass();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (no1Var.e() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L));
                float e0 = no1Var.e0(2.5f);
                kt0 kt0Var = new kt0(j);
                long j6 = kt0.g;
                float f = e0 * 2.0f;
                no1.D0(no1Var, d90.m(hf.c0(kt0Var, new kt0(j6)), RecyclerView.B1, f, 8), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), RecyclerView.B1, null, 120);
                no1.D0(no1Var, d90.k(hf.c0(new kt0(j), new kt0(j6)), RecyclerView.B1, f, 8), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), RecyclerView.B1, null, 120);
                no1.F(no1Var, kt0.c(0.7f, kt0.b), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), no1Var.e(), RecyclerView.B1, new ys6(1.5f, RecyclerView.B1, 0, 0, null, 30), 104);
                return jg7Var;
            case 8:
                ((gb6) obj).a(pa6.a, new oa6(fv2.Cursor, this.B, na6.Middle, true));
                return jg7Var;
            case 9:
                return Long.valueOf(j);
            case 10:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                i0 = e36Var5.i0("DELETE FROM ra_achievement_set WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 11:
                e36 e36Var6 = (e36) obj;
                e36Var6.getClass();
                i0 = e36Var6.i0("DELETE FROM ra_leaderboard WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 12:
                e36 e36Var7 = (e36) obj;
                e36Var7.getClass();
                i0 = e36Var7.i0("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    int B18 = ej2.B(i0, "game_id");
                    int B19 = ej2.B(i0, "rich_presence_patch");
                    int B20 = ej2.B(i0, "title");
                    int B21 = ej2.B(i0, "icon");
                    if (i0.f0()) {
                        long j7 = i0.getLong(B18);
                        if (!i0.isNull(B19)) {
                            str = i0.R(B19);
                        }
                        str = new ea5(j7, str, i0.R(B20), i0.R(B21));
                    }
                    return str;
                } finally {
                }
            case 13:
                e36 e36Var8 = (e36) obj;
                e36Var8.getClass();
                i0 = e36Var8.i0("SELECT * FROM ra_leaderboard WHERE id = ?");
                try {
                    i0.c(1, j);
                    int B22 = ej2.B(i0, "id");
                    int B23 = ej2.B(i0, "game_id");
                    int B24 = ej2.B(i0, "set_id");
                    int B25 = ej2.B(i0, "mem");
                    int B26 = ej2.B(i0, "format");
                    int B27 = ej2.B(i0, "lower_is_better");
                    int B28 = ej2.B(i0, "title");
                    int B29 = ej2.B(i0, "description");
                    int B30 = ej2.B(i0, "hidden");
                    if (i0.f0()) {
                        long j8 = i0.getLong(B22);
                        long j9 = i0.getLong(B23);
                        long j10 = i0.getLong(B24);
                        String R7 = i0.R(B25);
                        String R8 = i0.R(B26);
                        if (((int) i0.getLong(B27)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String R9 = i0.R(B28);
                        String R10 = i0.R(B29);
                        if (((int) i0.getLong(B30)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        str = new va5(j8, j9, j10, R7, R8, z3, R9, R10, z4);
                    }
                    return str;
                } finally {
                }
            case 14:
                e36 e36Var9 = (e36) obj;
                e36Var9.getClass();
                i0 = e36Var9.i0("SELECT * FROM ra_achievement WHERE id = ?");
                try {
                    i0.c(1, j);
                    int B31 = ej2.B(i0, "id");
                    int B32 = ej2.B(i0, "game_id");
                    int B33 = ej2.B(i0, "set_id");
                    int B34 = ej2.B(i0, "total_awards_casual");
                    int B35 = ej2.B(i0, "total_awards_hardcore");
                    int B36 = ej2.B(i0, "title");
                    int B37 = ej2.B(i0, "description");
                    int B38 = ej2.B(i0, "points");
                    int B39 = ej2.B(i0, "display_order");
                    int B40 = ej2.B(i0, "badge_url_unlocked");
                    int B41 = ej2.B(i0, "badge_url_locked");
                    int B42 = ej2.B(i0, "memory_address");
                    int B43 = ej2.B(i0, "type");
                    if (i0.f0()) {
                        str = new p75(i0.getLong(B31), i0.getLong(B32), i0.getLong(B33), (int) i0.getLong(B34), (int) i0.getLong(B35), i0.R(B36), i0.R(B37), (int) i0.getLong(B38), (int) i0.getLong(B39), i0.R(B40), i0.R(B41), i0.R(B42), (int) i0.getLong(B43));
                    }
                    return str;
                } finally {
                }
            case 15:
                e36 e36Var10 = (e36) obj;
                e36Var10.getClass();
                i0 = e36Var10.i0("SELECT * FROM ra_achievement_set WHERE id = ?");
                try {
                    i0.c(1, j);
                    int B44 = ej2.B(i0, "id");
                    int B45 = ej2.B(i0, "game_id");
                    int B46 = ej2.B(i0, "title");
                    int B47 = ej2.B(i0, "type");
                    int B48 = ej2.B(i0, "icon_url");
                    if (i0.f0()) {
                        long j11 = i0.getLong(B44);
                        long j12 = i0.getLong(B45);
                        if (!i0.isNull(B46)) {
                            str = i0.R(B46);
                        }
                        str = new t75(j11, j12, str, i0.R(B47), i0.R(B48));
                    }
                    return str;
                } finally {
                }
            case 16:
                e36 e36Var11 = (e36) obj;
                e36Var11.getClass();
                i0 = e36Var11.i0("SELECT game_hash FROM ra_game_hash_library WHERE game_id = ? LIMIT 1");
                try {
                    i0.c(1, j);
                    if (i0.f0() && !i0.isNull(0)) {
                        str = i0.R(0);
                    }
                    return str;
                } finally {
                }
            case 17:
                e36 e36Var12 = (e36) obj;
                e36Var12.getClass();
                i0 = e36Var12.i0("DELETE FROM ra_achievement WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 18:
                e36 e36Var13 = (e36) obj;
                e36Var13.getClass();
                i0 = e36Var13.i0("DELETE FROM ra_user_achievement WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            default:
                e36 e36Var14 = (e36) obj;
                e36Var14.getClass();
                i0 = e36Var14.i0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    i0.c(1, j);
                    int B49 = ej2.B(i0, "id");
                    int B50 = ej2.B(i0, "state");
                    int B51 = ej2.B(i0, "worker_class_name");
                    int B52 = ej2.B(i0, "input_merger_class_name");
                    int B53 = ej2.B(i0, "input");
                    int B54 = ej2.B(i0, "output");
                    int B55 = ej2.B(i0, "initial_delay");
                    int B56 = ej2.B(i0, "interval_duration");
                    int B57 = ej2.B(i0, "flex_duration");
                    int B58 = ej2.B(i0, "run_attempt_count");
                    int B59 = ej2.B(i0, "backoff_policy");
                    int B60 = ej2.B(i0, "backoff_delay_duration");
                    int B61 = ej2.B(i0, "last_enqueue_time");
                    int B62 = ej2.B(i0, "minimum_retention_duration");
                    int B63 = ej2.B(i0, "schedule_requested_at");
                    int B64 = ej2.B(i0, "run_in_foreground");
                    int B65 = ej2.B(i0, "out_of_quota_policy");
                    int B66 = ej2.B(i0, "period_count");
                    int B67 = ej2.B(i0, "generation");
                    int B68 = ej2.B(i0, "next_schedule_time_override");
                    int B69 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B70 = ej2.B(i0, "stop_reason");
                    int B71 = ej2.B(i0, "trace_tag");
                    int B72 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B73 = ej2.B(i0, "required_network_type");
                    int B74 = ej2.B(i0, "required_network_request");
                    int B75 = ej2.B(i0, "requires_charging");
                    int B76 = ej2.B(i0, "requires_device_idle");
                    int B77 = ej2.B(i0, "requires_battery_not_low");
                    int B78 = ej2.B(i0, "requires_storage_not_low");
                    int B79 = ej2.B(i0, "trigger_content_update_delay");
                    int B80 = ej2.B(i0, "trigger_max_content_delay");
                    int B81 = ej2.B(i0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.f0()) {
                        String R11 = i0.R(B49);
                        int i4 = B60;
                        int i5 = B61;
                        iw7 f2 = ds7.f((int) i0.getLong(B50));
                        String R12 = i0.R(B51);
                        String R13 = i0.R(B52);
                        byte[] blob = i0.getBlob(B53);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        xb1 k2 = u24.k(i0.getBlob(B54));
                        long j13 = i0.getLong(B55);
                        long j14 = i0.getLong(B56);
                        long j15 = i0.getLong(B57);
                        int i6 = (int) i0.getLong(B58);
                        int i7 = B50;
                        int i8 = B51;
                        w10 c = ds7.c((int) i0.getLong(B59));
                        long j16 = i0.getLong(i4);
                        long j17 = i0.getLong(i5);
                        long j18 = i0.getLong(B62);
                        int i9 = B49;
                        int i10 = B63;
                        long j19 = i0.getLong(i10);
                        B63 = i10;
                        int i11 = B64;
                        if (((int) i0.getLong(i11)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i12 = B65;
                        int i13 = B52;
                        oo4 e = ds7.e((int) i0.getLong(i12));
                        int i14 = B66;
                        int i15 = B53;
                        int i16 = (int) i0.getLong(i14);
                        int i17 = B67;
                        int i18 = (int) i0.getLong(i17);
                        int i19 = B68;
                        long j20 = i0.getLong(i19);
                        int i20 = B69;
                        int i21 = (int) i0.getLong(i20);
                        int i22 = B70;
                        int i23 = (int) i0.getLong(i22);
                        int i24 = B71;
                        if (i0.isNull(i24)) {
                            R2 = null;
                        } else {
                            R2 = i0.R(i24);
                        }
                        int i25 = B72;
                        if (i0.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf4 = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf4 = Integer.valueOf((int) i0.getLong(i25));
                        }
                        if (valueOf4 != null) {
                            if (valueOf4.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        } else {
                            bool = null;
                        }
                        int i26 = B73;
                        kf4 d = ds7.d((int) i0.getLong(i26));
                        int i27 = B74;
                        af4 h = ds7.h(i0.getBlob(i27));
                        B73 = i26;
                        B74 = i27;
                        int i28 = B75;
                        if (((int) i0.getLong(i28)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        B75 = i28;
                        int i29 = B76;
                        if (((int) i0.getLong(i29)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i30 = B77;
                        if (((int) i0.getLong(i30)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        B77 = i30;
                        int i31 = B78;
                        if (((int) i0.getLong(i31)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i32 = B79;
                        int i33 = B80;
                        int i34 = B81;
                        arrayList3.add(new yw7(R11, f2, R12, R13, k, k2, j13, j14, j15, new p21(h, d, z6, z7, z8, z9, i0.getLong(i32), i0.getLong(i33), ds7.a(i0.getBlob(i34))), i6, c, j16, j17, j18, j19, z5, e, i16, i18, j20, i, i23, R2, bool));
                        B78 = i31;
                        B52 = i13;
                        B65 = i12;
                        B67 = i17;
                        B70 = i2;
                        B72 = i25;
                        B81 = i34;
                        B79 = i32;
                        B80 = i33;
                        B50 = i7;
                        B49 = i9;
                        B60 = i4;
                        B51 = i8;
                        B61 = i5;
                        B64 = i11;
                        B68 = i19;
                        B69 = i20;
                        B71 = i24;
                        B76 = i29;
                        B53 = i15;
                        B66 = i14;
                    }
                    return arrayList3;
                } finally {
                }
        }
    }
}
