package g2;

import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ z1(String str, int i2) {
        this.A = i2;
        this.B = str;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [x8.n, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        je.e eVar;
        boolean z10;
        boolean z11;
        boolean z12;
        Long l10;
        x8.p pVar;
        boolean z13;
        String n10;
        Integer valueOf;
        Boolean bool;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        p8.e0 e0Var;
        Integer valueOf2;
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        String str = this.B;
        switch (i2) {
            case 0:
                i4.x xVar = (i4.x) obj;
                i4.v.c(xVar, str);
                i4.v.e(xVar, 5);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                tc.c[] cVarArr = i4.v.f6808a;
                ((i4.x) obj).a(i4.t.L, str);
                return yVar;
            case 2:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("DELETE FROM cheat_database WHERE name = ?");
                try {
                    T.C(1, str);
                    T.N();
                    return yVar;
                } finally {
                }
            case 3:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("SELECT * FROM ra_game_hash_library WHERE game_hash = ?");
                try {
                    T.C(1, str);
                    int t5 = p7.m.t(T, "game_hash");
                    int t10 = p7.m.t(T, "game_id");
                    if (T.N()) {
                        eVar = new je.e(T.getLong(t10), T.n(t5));
                    } else {
                        eVar = null;
                    }
                    return eVar;
                } finally {
                }
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (vc.h.j0(str2)) {
                    if (str2.length() >= str.length()) {
                        return str2;
                    }
                    return str;
                }
                return str.concat(str2);
            case l1.c.f8511g /* 5 */:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                T = aVar3.T("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    T.C(1, str);
                    if (T.N()) {
                        z10 = false;
                        if (((int) T.getLong(0)) != 0) {
                            z11 = true;
                            T.close();
                            return Boolean.valueOf(z11);
                        }
                    } else {
                        z10 = false;
                    }
                    z11 = z10;
                    T.close();
                    return Boolean.valueOf(z11);
                } finally {
                }
            case l1.c.f8509e /* 6 */:
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                T = aVar4.T("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    T.C(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        arrayList.add(T.n(0));
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                t7.a aVar5 = (t7.a) obj;
                aVar5.getClass();
                T = aVar5.T("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    T.C(1, str);
                    if (T.N()) {
                        if (((int) T.getLong(0)) != 0) {
                            z12 = true;
                            T.close();
                            return Boolean.valueOf(z12);
                        }
                    }
                    z12 = false;
                    T.close();
                    return Boolean.valueOf(z12);
                } finally {
                }
            case 8:
                t7.a aVar6 = (t7.a) obj;
                aVar6.getClass();
                T = aVar6.T("SELECT long_value FROM Preference where `key`=?");
                try {
                    T.C(1, str);
                    if (!T.N() || T.isNull(0)) {
                        l10 = null;
                    } else {
                        l10 = Long.valueOf(T.getLong(0));
                    }
                    return l10;
                } finally {
                }
            case l1.c.f8508d /* 9 */:
                t7.a aVar7 = (t7.a) obj;
                aVar7.getClass();
                T = aVar7.T("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    T.C(1, str);
                    T.N();
                    return yVar;
                } finally {
                }
            case l1.c.f8510f /* 10 */:
                t7.a aVar8 = (t7.a) obj;
                aVar8.getClass();
                T = aVar8.T("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    T.C(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (T.N()) {
                        arrayList2.add(T.n(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                t7.a aVar9 = (t7.a) obj;
                aVar9.getClass();
                T = aVar9.T("DELETE from WorkProgress where work_spec_id=?");
                try {
                    T.C(1, str);
                    T.N();
                    return yVar;
                } finally {
                }
            case 12:
                t7.a aVar10 = (t7.a) obj;
                aVar10.getClass();
                T = aVar10.T("SELECT * FROM workspec WHERE id=?");
                try {
                    T.C(1, str);
                    int t11 = p7.m.t(T, "id");
                    int t12 = p7.m.t(T, "state");
                    int t13 = p7.m.t(T, "worker_class_name");
                    int t14 = p7.m.t(T, "input_merger_class_name");
                    int t15 = p7.m.t(T, "input");
                    int t16 = p7.m.t(T, "output");
                    int t17 = p7.m.t(T, "initial_delay");
                    int t18 = p7.m.t(T, "interval_duration");
                    int t19 = p7.m.t(T, "flex_duration");
                    int t20 = p7.m.t(T, "run_attempt_count");
                    int t21 = p7.m.t(T, "backoff_policy");
                    int t22 = p7.m.t(T, "backoff_delay_duration");
                    int t23 = p7.m.t(T, "last_enqueue_time");
                    int t24 = p7.m.t(T, "minimum_retention_duration");
                    int t25 = p7.m.t(T, "schedule_requested_at");
                    int t26 = p7.m.t(T, "run_in_foreground");
                    int t27 = p7.m.t(T, "out_of_quota_policy");
                    int t28 = p7.m.t(T, "period_count");
                    int t29 = p7.m.t(T, "generation");
                    int t30 = p7.m.t(T, "next_schedule_time_override");
                    int t31 = p7.m.t(T, "next_schedule_time_override_generation");
                    int t32 = p7.m.t(T, "stop_reason");
                    int t33 = p7.m.t(T, "trace_tag");
                    int t34 = p7.m.t(T, "backoff_on_system_interruptions");
                    int t35 = p7.m.t(T, "required_network_type");
                    int t36 = p7.m.t(T, "required_network_request");
                    int t37 = p7.m.t(T, "requires_charging");
                    int t38 = p7.m.t(T, "requires_device_idle");
                    int t39 = p7.m.t(T, "requires_battery_not_low");
                    int t40 = p7.m.t(T, "requires_storage_not_low");
                    int t41 = p7.m.t(T, "trigger_content_update_delay");
                    int t42 = p7.m.t(T, "trigger_max_content_delay");
                    int t43 = p7.m.t(T, "content_uri_triggers");
                    if (T.N()) {
                        String n11 = T.n(t11);
                        p8.e0 x9 = p7.m.x((int) T.getLong(t12));
                        String n12 = T.n(t13);
                        String n13 = T.n(t14);
                        byte[] blob = T.getBlob(t15);
                        p8.h hVar = p8.h.f11493b;
                        p8.h v10 = p7.j.v(blob);
                        p8.h v11 = p7.j.v(T.getBlob(t16));
                        long j2 = T.getLong(t17);
                        long j10 = T.getLong(t18);
                        long j11 = T.getLong(t19);
                        int i10 = (int) T.getLong(t20);
                        p8.a u4 = p7.m.u((int) T.getLong(t21));
                        long j12 = T.getLong(t22);
                        long j13 = T.getLong(t23);
                        long j14 = T.getLong(t24);
                        long j15 = T.getLong(t25);
                        if (((int) T.getLong(t26)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p8.c0 w10 = p7.m.w((int) T.getLong(t27));
                        int i11 = (int) T.getLong(t28);
                        int i12 = (int) T.getLong(t29);
                        long j16 = T.getLong(t30);
                        int i13 = (int) T.getLong(t31);
                        int i14 = (int) T.getLong(t32);
                        if (T.isNull(t33)) {
                            n10 = null;
                        } else {
                            n10 = T.n(t33);
                        }
                        if (T.isNull(t34)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) T.getLong(t34));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            bool = Boolean.valueOf(z18);
                        } else {
                            bool = null;
                        }
                        p8.w v12 = p7.m.v((int) T.getLong(t35));
                        y8.f H = p7.m.H(T.getBlob(t36));
                        if (((int) T.getLong(t37)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (((int) T.getLong(t38)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (((int) T.getLong(t39)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (((int) T.getLong(t40)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        pVar = new x8.p(n11, x9, n12, n13, v10, v11, j2, j10, j11, new p8.e(H, v12, z14, z15, z16, z17, T.getLong(t41), T.getLong(t42), p7.m.f(T.getBlob(t43))), i10, u4, j12, j13, j14, j15, z13, w10, i11, i12, j16, i13, i14, n10, bool);
                    } else {
                        pVar = null;
                    }
                    return pVar;
                } finally {
                }
            case 13:
                t7.a aVar11 = (t7.a) obj;
                aVar11.getClass();
                T = aVar11.T("SELECT state FROM workspec WHERE id=?");
                try {
                    T.C(1, str);
                    if (T.N()) {
                        if (T.isNull(0)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) T.getLong(0));
                        }
                        if (valueOf2 != null) {
                            e0Var = p7.m.x(valueOf2.intValue());
                            return e0Var;
                        }
                    }
                    e0Var = null;
                    return e0Var;
                } finally {
                }
            case 14:
                t7.a aVar12 = (t7.a) obj;
                aVar12.getClass();
                T = aVar12.T("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T.C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (T.N()) {
                        arrayList3.add(T.n(0));
                    }
                    return arrayList3;
                } finally {
                }
            case l1.c.f8512h /* 15 */:
                t7.a aVar13 = (t7.a) obj;
                aVar13.getClass();
                T = aVar13.T("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    T.C(1, str);
                    T.N();
                    int u10 = p7.l.u(aVar13);
                    T.close();
                    return Integer.valueOf(u10);
                } finally {
                }
            case 16:
                t7.a aVar14 = (t7.a) obj;
                aVar14.getClass();
                T = aVar14.T("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    T.C(1, str);
                    T.N();
                    int u11 = p7.l.u(aVar14);
                    T.close();
                    return Integer.valueOf(u11);
                } finally {
                }
            case 17:
                t7.a aVar15 = (t7.a) obj;
                aVar15.getClass();
                T = aVar15.T("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    T.C(1, str);
                    T.N();
                    return yVar;
                } finally {
                }
            case 18:
                t7.a aVar16 = (t7.a) obj;
                aVar16.getClass();
                T = aVar16.T("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    T.C(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (T.N()) {
                        byte[] blob2 = T.getBlob(0);
                        p8.h hVar2 = p8.h.f11493b;
                        arrayList4.add(p7.j.v(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 19:
                t7.a aVar17 = (t7.a) obj;
                aVar17.getClass();
                T = aVar17.T("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    T.C(1, str);
                    T.N();
                    int u12 = p7.l.u(aVar17);
                    T.close();
                    return Integer.valueOf(u12);
                } finally {
                }
            case 20:
                t7.a aVar18 = (t7.a) obj;
                aVar18.getClass();
                T = aVar18.T("DELETE FROM workspec WHERE id=?");
                try {
                    T.C(1, str);
                    T.N();
                    return yVar;
                } finally {
                }
            case 21:
                t7.a aVar19 = (t7.a) obj;
                aVar19.getClass();
                T = aVar19.T("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T.C(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (T.N()) {
                        String n14 = T.n(0);
                        p8.e0 x10 = p7.m.x((int) T.getLong(1));
                        n14.getClass();
                        x10.getClass();
                        ?? obj2 = new Object();
                        obj2.f14401a = n14;
                        obj2.f14402b = x10;
                        arrayList5.add(obj2);
                    }
                    return arrayList5;
                } finally {
                }
            default:
                t7.a aVar20 = (t7.a) obj;
                aVar20.getClass();
                T = aVar20.T("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    T.C(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (T.N()) {
                        arrayList6.add(T.n(0));
                    }
                    return arrayList6;
                } finally {
                }
        }
    }
}
