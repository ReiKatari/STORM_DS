package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ok0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ok0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ ok0(String str, int i) {
        this.A = i;
        this.B = str;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [vh7, java.lang.Object] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        boolean z;
        boolean z2;
        boolean z3;
        Long l;
        boolean z4;
        v05 v05Var;
        xh7 xh7Var;
        boolean z5;
        String q;
        Integer valueOf;
        Boolean bool;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ih7 ih7Var;
        Integer valueOf2;
        int i = this.A;
        o27 o27Var = o27.a;
        String str = this.B;
        switch (i) {
            case 0:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("DELETE FROM cheat_database WHERE name = ?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 1:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    i0.M(1, str);
                    if (i0.a0()) {
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
            case 2:
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                i0 = ls5Var3.i0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    i0.M(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        arrayList.add(i0.q(0));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                i0 = ls5Var4.i0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    i0.M(1, str);
                    if (i0.a0()) {
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
            case 4:
                ti5 ti5Var = (ti5) obj;
                ti5Var.getClass();
                return ti5.a(ti5Var, null, null, null, null, null, false, null, null, null, null, null, null, null, this.B, null, 24575);
            case 5:
                ti5 ti5Var2 = (ti5) obj;
                ti5Var2.getClass();
                return ti5.a(ti5Var2, null, null, null, null, null, false, null, null, null, null, null, null, this.B, null, null, 28671);
            case ig7.b /* 6 */:
                rz5 rz5Var = (rz5) obj;
                pz5.b(rz5Var, str);
                pz5.d(rz5Var, 5);
                return o27Var;
            case 7:
                ls5 ls5Var5 = (ls5) obj;
                ls5Var5.getClass();
                i0 = ls5Var5.i0("SELECT long_value FROM Preference where `key`=?");
                try {
                    i0.M(1, str);
                    if (!i0.a0() || i0.isNull(0)) {
                        l = null;
                    } else {
                        l = Long.valueOf(i0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 8:
                rg5 rg5Var = (rg5) obj;
                g11 g11Var = ReleaseStateCommandReceiver.a;
                rg5Var.getClass();
                if (str != null) {
                    String str2 = rg5Var.a;
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!zg6.q0(lowerCase, str, false)) {
                        String lowerCase2 = rg5Var.c.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!zg6.q0(lowerCase2, str, false)) {
                            String uri = rg5Var.d.toString();
                            uri.getClass();
                            String lowerCase3 = uri.toLowerCase(locale);
                            lowerCase3.getClass();
                            if (!zg6.q0(lowerCase3, str, false)) {
                                z4 = false;
                                return Boolean.valueOf(z4);
                            }
                        }
                    }
                }
                z4 = true;
                return Boolean.valueOf(z4);
            case 9:
                ls5 ls5Var6 = (ls5) obj;
                ls5Var6.getClass();
                i0 = ls5Var6.i0("SELECT * FROM ra_game_hash_library WHERE game_hash = ?");
                try {
                    i0.M(1, str);
                    int r = hi2.r(i0, "game_hash");
                    int r2 = hi2.r(i0, "game_id");
                    if (i0.a0()) {
                        v05Var = new v05(i0.getLong(r2), i0.q(r));
                    } else {
                        v05Var = null;
                    }
                    return v05Var;
                } finally {
                }
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                if (zg6.B0(str3)) {
                    if (str3.length() >= str.length()) {
                        return str3;
                    }
                    return str;
                }
                return str.concat(str3);
            case 11:
                ls5 ls5Var7 = (ls5) obj;
                ls5Var7.getClass();
                i0 = ls5Var7.i0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case mj2.L /* 12 */:
                l93[] l93VarArr = pz5.a;
                ((rz5) obj).b(mz5.M, str);
                return o27Var;
            case 13:
                rz5 rz5Var2 = (rz5) obj;
                pz5.b(rz5Var2, str);
                pz5.d(rz5Var2, 5);
                return o27Var;
            case 14:
                ls5 ls5Var8 = (ls5) obj;
                ls5Var8.getClass();
                i0 = ls5Var8.i0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    i0.M(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.a0()) {
                        arrayList2.add(i0.q(0));
                    }
                    return arrayList2;
                } finally {
                }
            case ig7.e /* 15 */:
                ls5 ls5Var9 = (ls5) obj;
                ls5Var9.getClass();
                i0 = ls5Var9.i0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 16:
                ls5 ls5Var10 = (ls5) obj;
                ls5Var10.getClass();
                i0 = ls5Var10.i0("SELECT * FROM workspec WHERE id=?");
                try {
                    i0.M(1, str);
                    int r3 = hi2.r(i0, "id");
                    int r4 = hi2.r(i0, "state");
                    int r5 = hi2.r(i0, "worker_class_name");
                    int r6 = hi2.r(i0, "input_merger_class_name");
                    int r7 = hi2.r(i0, "input");
                    int r8 = hi2.r(i0, "output");
                    int r9 = hi2.r(i0, "initial_delay");
                    int r10 = hi2.r(i0, "interval_duration");
                    int r11 = hi2.r(i0, "flex_duration");
                    int r12 = hi2.r(i0, "run_attempt_count");
                    int r13 = hi2.r(i0, "backoff_policy");
                    int r14 = hi2.r(i0, "backoff_delay_duration");
                    int r15 = hi2.r(i0, "last_enqueue_time");
                    int r16 = hi2.r(i0, "minimum_retention_duration");
                    int r17 = hi2.r(i0, "schedule_requested_at");
                    int r18 = hi2.r(i0, "run_in_foreground");
                    int r19 = hi2.r(i0, "out_of_quota_policy");
                    int r20 = hi2.r(i0, "period_count");
                    int r21 = hi2.r(i0, "generation");
                    int r22 = hi2.r(i0, "next_schedule_time_override");
                    int r23 = hi2.r(i0, "next_schedule_time_override_generation");
                    int r24 = hi2.r(i0, "stop_reason");
                    int r25 = hi2.r(i0, "trace_tag");
                    int r26 = hi2.r(i0, "backoff_on_system_interruptions");
                    int r27 = hi2.r(i0, "required_network_type");
                    int r28 = hi2.r(i0, "required_network_request");
                    int r29 = hi2.r(i0, "requires_charging");
                    int r30 = hi2.r(i0, "requires_device_idle");
                    int r31 = hi2.r(i0, "requires_battery_not_low");
                    int r32 = hi2.r(i0, "requires_storage_not_low");
                    int r33 = hi2.r(i0, "trigger_content_update_delay");
                    int r34 = hi2.r(i0, "trigger_max_content_delay");
                    int r35 = hi2.r(i0, "content_uri_triggers");
                    if (i0.a0()) {
                        String q2 = i0.q(r3);
                        ih7 h = ii7.h((int) i0.getLong(r4));
                        String q3 = i0.q(r5);
                        String q4 = i0.q(r6);
                        byte[] blob = i0.getBlob(r7);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        g81 D2 = a53.D(i0.getBlob(r8));
                        long j = i0.getLong(r9);
                        long j2 = i0.getLong(r10);
                        long j3 = i0.getLong(r11);
                        int i2 = (int) i0.getLong(r12);
                        f00 e = ii7.e((int) i0.getLong(r13));
                        long j4 = i0.getLong(r14);
                        long j5 = i0.getLong(r15);
                        long j6 = i0.getLong(r16);
                        long j7 = i0.getLong(r17);
                        if (((int) i0.getLong(r18)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        mf4 g = ii7.g((int) i0.getLong(r19));
                        int i3 = (int) i0.getLong(r20);
                        int i4 = (int) i0.getLong(r21);
                        long j8 = i0.getLong(r22);
                        int i5 = (int) i0.getLong(r23);
                        int i6 = (int) i0.getLong(r24);
                        if (i0.isNull(r25)) {
                            q = null;
                        } else {
                            q = i0.q(r25);
                        }
                        if (i0.isNull(r26)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) i0.getLong(r26));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        } else {
                            bool = null;
                        }
                        v64 f = ii7.f((int) i0.getLong(r27));
                        m64 k = ii7.k(i0.getBlob(r28));
                        if (((int) i0.getLong(r29)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (((int) i0.getLong(r30)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (((int) i0.getLong(r31)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (((int) i0.getLong(r32)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        xh7Var = new xh7(q2, h, q3, q4, D, D2, j, j2, j3, new kz0(k, f, z6, z7, z8, z9, i0.getLong(r33), i0.getLong(r34), ii7.a(i0.getBlob(r35))), i2, e, j4, j5, j6, j7, z5, g, i3, i4, j8, i5, i6, q, bool);
                    } else {
                        xh7Var = null;
                    }
                    return xh7Var;
                } finally {
                }
            case 17:
                ls5 ls5Var11 = (ls5) obj;
                ls5Var11.getClass();
                i0 = ls5Var11.i0("SELECT state FROM workspec WHERE id=?");
                try {
                    i0.M(1, str);
                    if (i0.a0()) {
                        if (i0.isNull(0)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) i0.getLong(0));
                        }
                        if (valueOf2 != null) {
                            ih7Var = ii7.h(valueOf2.intValue());
                            return ih7Var;
                        }
                    }
                    ih7Var = null;
                    return ih7Var;
                } finally {
                }
            case 18:
                ls5 ls5Var12 = (ls5) obj;
                ls5Var12.getClass();
                i0 = ls5Var12.i0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.M(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.a0()) {
                        arrayList3.add(i0.q(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 19:
                ls5 ls5Var13 = (ls5) obj;
                ls5Var13.getClass();
                i0 = ls5Var13.i0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    int I = cg2.I(ls5Var13);
                    i0.close();
                    return Integer.valueOf(I);
                } finally {
                }
            case 20:
                ls5 ls5Var14 = (ls5) obj;
                ls5Var14.getClass();
                i0 = ls5Var14.i0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    int I2 = cg2.I(ls5Var14);
                    i0.close();
                    return Integer.valueOf(I2);
                } finally {
                }
            case 21:
                ls5 ls5Var15 = (ls5) obj;
                ls5Var15.getClass();
                i0 = ls5Var15.i0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 22:
                ls5 ls5Var16 = (ls5) obj;
                ls5Var16.getClass();
                i0 = ls5Var16.i0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    i0.M(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (i0.a0()) {
                        byte[] blob2 = i0.getBlob(0);
                        g81 g81Var2 = g81.b;
                        arrayList4.add(a53.D(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 23:
                ls5 ls5Var17 = (ls5) obj;
                ls5Var17.getClass();
                i0 = ls5Var17.i0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    int I3 = cg2.I(ls5Var17);
                    i0.close();
                    return Integer.valueOf(I3);
                } finally {
                }
            case 24:
                ls5 ls5Var18 = (ls5) obj;
                ls5Var18.getClass();
                i0 = ls5Var18.i0("DELETE FROM workspec WHERE id=?");
                try {
                    i0.M(1, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            case 25:
                ls5 ls5Var19 = (ls5) obj;
                ls5Var19.getClass();
                i0 = ls5Var19.i0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.M(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (i0.a0()) {
                        String q5 = i0.q(0);
                        ih7 h2 = ii7.h((int) i0.getLong(1));
                        q5.getClass();
                        h2.getClass();
                        ?? obj2 = new Object();
                        obj2.a = q5;
                        obj2.b = h2;
                        arrayList5.add(obj2);
                    }
                    return arrayList5;
                } finally {
                }
            default:
                ls5 ls5Var20 = (ls5) obj;
                ls5Var20.getClass();
                i0 = ls5Var20.i0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    i0.M(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (i0.a0()) {
                        arrayList6.add(i0.q(0));
                    }
                    return arrayList6;
                } finally {
                }
        }
    }
}
