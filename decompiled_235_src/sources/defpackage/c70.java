package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Locale;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c70  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c70 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ c70(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        boolean z;
        boolean z2;
        boolean z3;
        lp2 lp2Var;
        Long valueOf;
        lp2 lp2Var2;
        Long valueOf2;
        lp2 lp2Var3;
        Long valueOf3;
        lp2 lp2Var4;
        Long valueOf4;
        Long l;
        boolean z4;
        fa5 fa5Var;
        yw7 yw7Var;
        boolean z5;
        String R;
        Integer valueOf5;
        Boolean bool;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        iw7 iw7Var;
        Integer valueOf6;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        String str = this.B;
        switch (i) {
            case 0:
                n14 n14Var = (n14) obj;
                n14Var.getClass();
                Object obj2 = ((l14) n14Var.a()).get(1);
                return str + "\t" + obj2;
            case 1:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("DELETE FROM cheat_database WHERE name = ?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 2:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    i0.w(1, str);
                    if (i0.f0()) {
                        z = false;
                        if (((int) i0.getLong(0)) != 0) {
                            z2 = true;
                            i0.close();
                            return Boolean.valueOf(z2);
                        }
                    } else {
                        z = false;
                    }
                    z2 = z;
                    i0.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 3:
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                i0 = e36Var3.i0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    i0.w(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        arrayList.add(i0.R(0));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                i0 = e36Var4.i0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    i0.w(1, str);
                    if (i0.f0()) {
                        if (((int) i0.getLong(0)) != 0) {
                            z3 = true;
                            i0.close();
                            return Boolean.valueOf(z3);
                        }
                    }
                    z3 = false;
                    i0.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 5:
                jt5 jt5Var = (jt5) obj;
                jt5Var.getClass();
                return jt5.a(jt5Var, null, null, null, null, null, false, null, null, null, null, null, null, null, this.B, null, null, null, null, 253951);
            case 6:
                jt5 jt5Var2 = (jt5) obj;
                jt5Var2.getClass();
                return jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, this.B, null, null, null, null, null, 258047);
            case 7:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                i0 = e36Var5.i0("SELECT * FROM game WHERE game_checksum = ? LIMIT 1");
                try {
                    i0.w(1, str);
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "name");
                    int B3 = ej2.B(i0, "game_code");
                    int B4 = ej2.B(i0, "game_checksum");
                    if (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(B));
                        }
                        lp2Var = new lp2(valueOf, i0.R(B2), i0.R(B3), i0.R(B4));
                    } else {
                        lp2Var = null;
                    }
                    return lp2Var;
                } finally {
                }
            case 8:
                e36 e36Var6 = (e36) obj;
                e36Var6.getClass();
                i0 = e36Var6.i0("SELECT * FROM game WHERE game_code = ? LIMIT 1");
                try {
                    i0.w(1, str);
                    int B5 = ej2.B(i0, "id");
                    int B6 = ej2.B(i0, "name");
                    int B7 = ej2.B(i0, "game_code");
                    int B8 = ej2.B(i0, "game_checksum");
                    if (i0.f0()) {
                        if (i0.isNull(B5)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(i0.getLong(B5));
                        }
                        lp2Var2 = new lp2(valueOf2, i0.R(B6), i0.R(B7), i0.R(B8));
                    } else {
                        lp2Var2 = null;
                    }
                    return lp2Var2;
                } finally {
                }
            case 9:
                e36 e36Var7 = (e36) obj;
                e36Var7.getClass();
                i0 = e36Var7.i0("SELECT * FROM game WHERE game_code LIKE ? || '%' LIMIT 1");
                try {
                    i0.w(1, str);
                    int B9 = ej2.B(i0, "id");
                    int B10 = ej2.B(i0, "name");
                    int B11 = ej2.B(i0, "game_code");
                    int B12 = ej2.B(i0, "game_checksum");
                    if (i0.f0()) {
                        if (i0.isNull(B9)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(i0.getLong(B9));
                        }
                        lp2Var3 = new lp2(valueOf3, i0.R(B10), i0.R(B11), i0.R(B12));
                    } else {
                        lp2Var3 = null;
                    }
                    return lp2Var3;
                } finally {
                }
            case 10:
                e36 e36Var8 = (e36) obj;
                e36Var8.getClass();
                i0 = e36Var8.i0("SELECT * FROM game WHERE name LIKE '%' || ? || '%' LIMIT 1");
                try {
                    i0.w(1, str);
                    int B13 = ej2.B(i0, "id");
                    int B14 = ej2.B(i0, "name");
                    int B15 = ej2.B(i0, "game_code");
                    int B16 = ej2.B(i0, "game_checksum");
                    if (i0.f0()) {
                        if (i0.isNull(B13)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(i0.getLong(B13));
                        }
                        lp2Var4 = new lp2(valueOf4, i0.R(B14), i0.R(B15), i0.R(B16));
                    } else {
                        lp2Var4 = null;
                    }
                    return lp2Var4;
                } finally {
                }
            case 11:
                gb6 gb6Var = (gb6) obj;
                eb6.b(gb6Var, str);
                eb6.d(gb6Var, 5);
                return jg7Var;
            case 12:
                e36 e36Var9 = (e36) obj;
                e36Var9.getClass();
                i0 = e36Var9.i0("SELECT long_value FROM Preference where `key`=?");
                try {
                    i0.w(1, str);
                    if (!i0.f0() || i0.isNull(0)) {
                        l = null;
                    } else {
                        l = Long.valueOf(i0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 13:
                pq5 pq5Var = (pq5) obj;
                o41 o41Var = ReleaseStateCommandReceiver.a;
                pq5Var.getClass();
                if (str != null) {
                    String str2 = pq5Var.a;
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!qs6.j0(lowerCase, str, false)) {
                        String lowerCase2 = pq5Var.c.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!qs6.j0(lowerCase2, str, false)) {
                            String uri = pq5Var.d.toString();
                            uri.getClass();
                            String lowerCase3 = uri.toLowerCase(locale);
                            lowerCase3.getClass();
                            if (!qs6.j0(lowerCase3, str, false)) {
                                z4 = false;
                                return Boolean.valueOf(z4);
                            }
                        }
                    }
                }
                z4 = true;
                return Boolean.valueOf(z4);
            case 14:
                e36 e36Var10 = (e36) obj;
                e36Var10.getClass();
                i0 = e36Var10.i0("SELECT * FROM ra_game_hash_library WHERE game_hash = ?");
                try {
                    i0.w(1, str);
                    int B17 = ej2.B(i0, "game_hash");
                    int B18 = ej2.B(i0, "game_id");
                    if (i0.f0()) {
                        fa5Var = new fa5(i0.R(B17), i0.getLong(B18));
                    } else {
                        fa5Var = null;
                    }
                    return fa5Var;
                } finally {
                }
            case 15:
                String str3 = (String) obj;
                str3.getClass();
                if (qs6.v0(str3)) {
                    if (str3.length() >= str.length()) {
                        return str3;
                    }
                    return str;
                }
                return str.concat(str3);
            case 16:
                e36 e36Var11 = (e36) obj;
                e36Var11.getClass();
                i0 = e36Var11.i0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 17:
                fg3[] fg3VarArr = eb6.a;
                ((gb6) obj).a(bb6.M, str);
                return jg7Var;
            case 18:
                gb6 gb6Var2 = (gb6) obj;
                eb6.b(gb6Var2, str);
                eb6.d(gb6Var2, 5);
                return jg7Var;
            case 19:
                e36 e36Var12 = (e36) obj;
                e36Var12.getClass();
                i0 = e36Var12.i0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    i0.w(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        arrayList2.add(i0.R(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 20:
                e36 e36Var13 = (e36) obj;
                e36Var13.getClass();
                i0 = e36Var13.i0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e36 e36Var14 = (e36) obj;
                e36Var14.getClass();
                i0 = e36Var14.i0("SELECT * FROM workspec WHERE id=?");
                try {
                    i0.w(1, str);
                    int B19 = ej2.B(i0, "id");
                    int B20 = ej2.B(i0, "state");
                    int B21 = ej2.B(i0, "worker_class_name");
                    int B22 = ej2.B(i0, "input_merger_class_name");
                    int B23 = ej2.B(i0, "input");
                    int B24 = ej2.B(i0, "output");
                    int B25 = ej2.B(i0, "initial_delay");
                    int B26 = ej2.B(i0, "interval_duration");
                    int B27 = ej2.B(i0, "flex_duration");
                    int B28 = ej2.B(i0, "run_attempt_count");
                    int B29 = ej2.B(i0, "backoff_policy");
                    int B30 = ej2.B(i0, "backoff_delay_duration");
                    int B31 = ej2.B(i0, "last_enqueue_time");
                    int B32 = ej2.B(i0, "minimum_retention_duration");
                    int B33 = ej2.B(i0, "schedule_requested_at");
                    int B34 = ej2.B(i0, "run_in_foreground");
                    int B35 = ej2.B(i0, "out_of_quota_policy");
                    int B36 = ej2.B(i0, "period_count");
                    int B37 = ej2.B(i0, "generation");
                    int B38 = ej2.B(i0, "next_schedule_time_override");
                    int B39 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B40 = ej2.B(i0, "stop_reason");
                    int B41 = ej2.B(i0, "trace_tag");
                    int B42 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B43 = ej2.B(i0, "required_network_type");
                    int B44 = ej2.B(i0, "required_network_request");
                    int B45 = ej2.B(i0, "requires_charging");
                    int B46 = ej2.B(i0, "requires_device_idle");
                    int B47 = ej2.B(i0, "requires_battery_not_low");
                    int B48 = ej2.B(i0, "requires_storage_not_low");
                    int B49 = ej2.B(i0, "trigger_content_update_delay");
                    int B50 = ej2.B(i0, "trigger_max_content_delay");
                    int B51 = ej2.B(i0, "content_uri_triggers");
                    if (i0.f0()) {
                        String R2 = i0.R(B19);
                        iw7 f = ds7.f((int) i0.getLong(B20));
                        String R3 = i0.R(B21);
                        String R4 = i0.R(B22);
                        byte[] blob = i0.getBlob(B23);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        xb1 k2 = u24.k(i0.getBlob(B24));
                        long j = i0.getLong(B25);
                        long j2 = i0.getLong(B26);
                        long j3 = i0.getLong(B27);
                        int i2 = (int) i0.getLong(B28);
                        w10 c = ds7.c((int) i0.getLong(B29));
                        long j4 = i0.getLong(B30);
                        long j5 = i0.getLong(B31);
                        long j6 = i0.getLong(B32);
                        long j7 = i0.getLong(B33);
                        if (((int) i0.getLong(B34)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        oo4 e = ds7.e((int) i0.getLong(B35));
                        int i3 = (int) i0.getLong(B36);
                        int i4 = (int) i0.getLong(B37);
                        long j8 = i0.getLong(B38);
                        int i5 = (int) i0.getLong(B39);
                        int i6 = (int) i0.getLong(B40);
                        if (i0.isNull(B41)) {
                            R = null;
                        } else {
                            R = i0.R(B41);
                        }
                        if (i0.isNull(B42)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf((int) i0.getLong(B42));
                        }
                        if (valueOf5 != null) {
                            if (valueOf5.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        } else {
                            bool = null;
                        }
                        kf4 d = ds7.d((int) i0.getLong(B43));
                        af4 h = ds7.h(i0.getBlob(B44));
                        if (((int) i0.getLong(B45)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (((int) i0.getLong(B46)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (((int) i0.getLong(B47)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (((int) i0.getLong(B48)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        yw7Var = new yw7(R2, f, R3, R4, k, k2, j, j2, j3, new p21(h, d, z6, z7, z8, z9, i0.getLong(B49), i0.getLong(B50), ds7.a(i0.getBlob(B51))), i2, c, j4, j5, j6, j7, z5, e, i3, i4, j8, i5, i6, R, bool);
                    } else {
                        yw7Var = null;
                    }
                    return yw7Var;
                } finally {
                }
            case 22:
                e36 e36Var15 = (e36) obj;
                e36Var15.getClass();
                i0 = e36Var15.i0("SELECT state FROM workspec WHERE id=?");
                try {
                    i0.w(1, str);
                    if (i0.f0()) {
                        if (i0.isNull(0)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf((int) i0.getLong(0));
                        }
                        if (valueOf6 != null) {
                            iw7Var = ds7.f(valueOf6.intValue());
                            return iw7Var;
                        }
                    }
                    iw7Var = null;
                    return iw7Var;
                } finally {
                }
            case ConnectionResult.API_DISABLED /* 23 */:
                e36 e36Var16 = (e36) obj;
                e36Var16.getClass();
                i0 = e36Var16.i0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.w(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.f0()) {
                        arrayList3.add(i0.R(0));
                    }
                    return arrayList3;
                } finally {
                }
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                e36 e36Var17 = (e36) obj;
                e36Var17.getClass();
                i0 = e36Var17.i0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    int D = oi2.D(e36Var17);
                    i0.close();
                    return Integer.valueOf(D);
                } finally {
                }
            case 25:
                e36 e36Var18 = (e36) obj;
                e36Var18.getClass();
                i0 = e36Var18.i0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    int D2 = oi2.D(e36Var18);
                    i0.close();
                    return Integer.valueOf(D2);
                } finally {
                }
            case SubAllocator.N4 /* 26 */:
                e36 e36Var19 = (e36) obj;
                e36Var19.getClass();
                i0 = e36Var19.i0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            case 27:
                e36 e36Var20 = (e36) obj;
                e36Var20.getClass();
                i0 = e36Var20.i0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    i0.w(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (i0.f0()) {
                        byte[] blob2 = i0.getBlob(0);
                        xb1 xb1Var2 = xb1.b;
                        arrayList4.add(u24.k(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 28:
                e36 e36Var21 = (e36) obj;
                e36Var21.getClass();
                i0 = e36Var21.i0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    int D3 = oi2.D(e36Var21);
                    i0.close();
                    return Integer.valueOf(D3);
                } finally {
                }
            default:
                e36 e36Var22 = (e36) obj;
                e36Var22.getClass();
                i0 = e36Var22.i0("DELETE FROM workspec WHERE id=?");
                try {
                    i0.w(1, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
        }
    }
}
