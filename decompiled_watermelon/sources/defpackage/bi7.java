package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bi7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bi7 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ bi7(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eu, java.util.Map, m66] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eu, m66] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                di7 di7Var = (di7) obj2;
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                ns5 i0 = ls5Var.i0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                int i2 = 1;
                try {
                    i0.M(1, "cheat_import_worker");
                    int i3 = 0;
                    ?? m66Var = new m66(0);
                    ?? m66Var2 = new m66(0);
                    while (i0.a0()) {
                        String q = i0.q(0);
                        if (!m66Var.containsKey(q)) {
                            m66Var.put(q, new ArrayList());
                        }
                        String q2 = i0.q(0);
                        if (!m66Var2.containsKey(q2)) {
                            m66Var2.put(q2, new ArrayList());
                        }
                    }
                    i0.reset();
                    di7Var.b(ls5Var, m66Var);
                    di7Var.a(ls5Var, m66Var2);
                    ArrayList arrayList = new ArrayList();
                    Map map = m66Var2;
                    while (i0.a0()) {
                        String q3 = i0.q(i3);
                        ih7 h = ii7.h((int) i0.getLong(i2));
                        byte[] blob = i0.getBlob(2);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        int i4 = (int) i0.getLong(3);
                        int i5 = (int) i0.getLong(4);
                        long j = i0.getLong(14);
                        long j2 = i0.getLong(15);
                        long j3 = i0.getLong(16);
                        Map map2 = map;
                        f00 e = ii7.e((int) i0.getLong(17));
                        long j4 = i0.getLong(18);
                        long j5 = i0.getLong(19);
                        int i6 = (int) i0.getLong(20);
                        long j6 = i0.getLong(21);
                        int i7 = (int) i0.getLong(22);
                        v64 f = ii7.f((int) i0.getLong(5));
                        m64 k = ii7.k(i0.getBlob(6));
                        if (((int) i0.getLong(7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((int) i0.getLong(8)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) i0.getLong(9)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) i0.getLong(10)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        kz0 kz0Var = new kz0(k, f, z, z2, z3, z4, i0.getLong(11), i0.getLong(12), ii7.a(i0.getBlob(13)));
                        Object i02 = zt3.i0(i0.q(0), m66Var);
                        i02.getClass();
                        List list = (List) i02;
                        Map map3 = map2;
                        Object i03 = zt3.i0(i0.q(0), map3);
                        i03.getClass();
                        arrayList.add(new wh7(q3, h, D, j, j2, j3, kz0Var, i4, e, j4, j5, i6, i5, j6, i7, list, (List) i03));
                        i3 = 0;
                        i2 = 1;
                        map = map3;
                    }
                    i0.close();
                    return arrayList;
                } catch (Throwable th) {
                    i0.close();
                    throw th;
                }
            default:
                String str = (String) obj;
                str.getClass();
                return ((hv1) obj2).b.getString(R.string.use_global_preference_with_value, str);
        }
    }
}
