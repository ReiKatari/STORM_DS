package n1;

import java.util.ArrayList;
import p1.m0;
import p8.c0;
import p8.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements mc.l {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ int B;

    public /* synthetic */ t(int i2) {
        this.B = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        mc.l lVar;
        boolean z10;
        String n10;
        int i2;
        int i10;
        Integer valueOf;
        Boolean bool;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11 = this.A;
        int i12 = this.B;
        switch (i11) {
            case 0:
                m0 m0Var = (m0) obj;
                z2.f e6 = z2.q.e();
                if (e6 != null) {
                    lVar = e6.e();
                } else {
                    lVar = null;
                }
                z2.q.k(e6, z2.q.h(e6), lVar);
                int i13 = m0Var.f11231a;
                if (i13 == -1) {
                    i13 = 2;
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    m0Var.a(i12 + i14);
                }
                return yb.y.f14813a;
            default:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                t7.c T = aVar.T("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    T.g(1, i12);
                    int t5 = p7.m.t(T, "id");
                    int t10 = p7.m.t(T, "state");
                    int t11 = p7.m.t(T, "worker_class_name");
                    int t12 = p7.m.t(T, "input_merger_class_name");
                    int t13 = p7.m.t(T, "input");
                    int t14 = p7.m.t(T, "output");
                    int t15 = p7.m.t(T, "initial_delay");
                    int t16 = p7.m.t(T, "interval_duration");
                    int t17 = p7.m.t(T, "flex_duration");
                    int t18 = p7.m.t(T, "run_attempt_count");
                    int t19 = p7.m.t(T, "backoff_policy");
                    int t20 = p7.m.t(T, "backoff_delay_duration");
                    int t21 = p7.m.t(T, "last_enqueue_time");
                    int t22 = p7.m.t(T, "minimum_retention_duration");
                    int t23 = p7.m.t(T, "schedule_requested_at");
                    int t24 = p7.m.t(T, "run_in_foreground");
                    int t25 = p7.m.t(T, "out_of_quota_policy");
                    int t26 = p7.m.t(T, "period_count");
                    int t27 = p7.m.t(T, "generation");
                    int t28 = p7.m.t(T, "next_schedule_time_override");
                    int t29 = p7.m.t(T, "next_schedule_time_override_generation");
                    int t30 = p7.m.t(T, "stop_reason");
                    int t31 = p7.m.t(T, "trace_tag");
                    int t32 = p7.m.t(T, "backoff_on_system_interruptions");
                    int t33 = p7.m.t(T, "required_network_type");
                    int t34 = p7.m.t(T, "required_network_request");
                    int t35 = p7.m.t(T, "requires_charging");
                    int t36 = p7.m.t(T, "requires_device_idle");
                    int t37 = p7.m.t(T, "requires_battery_not_low");
                    int t38 = p7.m.t(T, "requires_storage_not_low");
                    int t39 = p7.m.t(T, "trigger_content_update_delay");
                    int t40 = p7.m.t(T, "trigger_max_content_delay");
                    int t41 = p7.m.t(T, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        String n11 = T.n(t5);
                        int i15 = t22;
                        int i16 = t5;
                        e0 x9 = p7.m.x((int) T.getLong(t10));
                        String n12 = T.n(t11);
                        String n13 = T.n(t12);
                        byte[] blob = T.getBlob(t13);
                        p8.h hVar = p8.h.f11493b;
                        p8.h v10 = p7.j.v(blob);
                        p8.h v11 = p7.j.v(T.getBlob(t14));
                        long j2 = T.getLong(t15);
                        long j10 = T.getLong(t16);
                        long j11 = T.getLong(t17);
                        int i17 = (int) T.getLong(t18);
                        p8.a u4 = p7.m.u((int) T.getLong(t19));
                        long j12 = T.getLong(t20);
                        long j13 = T.getLong(t21);
                        long j14 = T.getLong(i15);
                        int i18 = t23;
                        long j15 = T.getLong(i18);
                        int i19 = t20;
                        int i20 = t24;
                        int i21 = t21;
                        if (((int) T.getLong(i20)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i22 = t25;
                        c0 w10 = p7.m.w((int) T.getLong(i22));
                        int i23 = t10;
                        int i24 = t26;
                        int i25 = t11;
                        int i26 = (int) T.getLong(i24);
                        int i27 = t27;
                        int i28 = (int) T.getLong(i27);
                        int i29 = t28;
                        long j16 = T.getLong(i29);
                        int i30 = t29;
                        int i31 = (int) T.getLong(i30);
                        int i32 = t30;
                        int i33 = (int) T.getLong(i32);
                        int i34 = t31;
                        if (T.isNull(i34)) {
                            n10 = null;
                        } else {
                            n10 = T.n(i34);
                        }
                        int i35 = t32;
                        if (T.isNull(i35)) {
                            i2 = i31;
                            i10 = i32;
                            valueOf = null;
                        } else {
                            i2 = i31;
                            i10 = i32;
                            valueOf = Integer.valueOf((int) T.getLong(i35));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            bool = Boolean.valueOf(z15);
                        } else {
                            bool = null;
                        }
                        int i36 = t33;
                        p8.w v12 = p7.m.v((int) T.getLong(i36));
                        int i37 = t34;
                        y8.f H = p7.m.H(T.getBlob(i37));
                        int i38 = t35;
                        if (((int) T.getLong(i38)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i39 = t36;
                        if (((int) T.getLong(i39)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i40 = t37;
                        if (((int) T.getLong(i40)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t37 = i40;
                        int i41 = t38;
                        if (((int) T.getLong(i41)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i42 = t39;
                        int i43 = t40;
                        int i44 = t41;
                        t41 = i44;
                        arrayList.add(new x8.p(n11, x9, n12, n13, v10, v11, j2, j10, j11, new p8.e(H, v12, z11, z12, z13, z14, T.getLong(i42), T.getLong(i43), p7.m.f(T.getBlob(i44))), i17, u4, j12, j13, j14, j15, z10, w10, i26, i28, j16, i2, i33, n10, bool));
                        t39 = i42;
                        t40 = i43;
                        t20 = i19;
                        t21 = i21;
                        t23 = i18;
                        t25 = i22;
                        t24 = i20;
                        t28 = i29;
                        t27 = i27;
                        t29 = i30;
                        t30 = i10;
                        t32 = i35;
                        t22 = i15;
                        t31 = i34;
                        t38 = i41;
                        t10 = i23;
                        t33 = i36;
                        t34 = i37;
                        t35 = i38;
                        t5 = i16;
                        t36 = i39;
                        t11 = i25;
                        t26 = i24;
                    }
                    T.close();
                    return arrayList;
                } catch (Throwable th2) {
                    T.close();
                    throw th2;
                }
        }
    }

    public /* synthetic */ t(x xVar, int i2) {
        this.B = i2;
    }
}
