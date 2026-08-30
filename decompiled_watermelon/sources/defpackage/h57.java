package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h57  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h57 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ h57(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [eu, m66] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eu, m66] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 2;
        int i2 = 1;
        switch (this.A) {
            case 0:
                j57 j57Var = (j57) this.B;
                p63 p63Var = (p63) this.L;
                Throwable th = (Throwable) obj;
                synchronized (j57Var.k) {
                    j57Var.w.remove(p63Var);
                }
                return o27.a;
            case 1:
                dg7 dg7Var = (dg7) this.B;
                View view = (View) this.L;
                ch1 ch1Var = (ch1) obj;
                dg7Var.a(view);
                return new sy(11, dg7Var, view);
            case 2:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                ((ph7) this.B).b.V(ls5Var, (oh7) this.L);
                return o27.a;
            case 3:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                ((rh7) this.B).b.V(ls5Var2, (qh7) this.L);
                return o27.a;
            case 4:
                String str = (String) this.B;
                di7 di7Var = (di7) this.L;
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                ns5 i0 = ls5Var3.i0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.M(1, str);
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
                    di7Var.b(ls5Var3, m66Var);
                    di7Var.a(ls5Var3, m66Var2);
                    ArrayList arrayList = new ArrayList();
                    Map map = m66Var;
                    Map map2 = m66Var2;
                    while (i0.a0()) {
                        String q3 = i0.q(i3);
                        ih7 h = ii7.h((int) i0.getLong(i2));
                        byte[] blob = i0.getBlob(i);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        int i4 = (int) i0.getLong(3);
                        int i5 = (int) i0.getLong(4);
                        long j = i0.getLong(14);
                        long j2 = i0.getLong(15);
                        long j3 = i0.getLong(16);
                        Map map3 = map;
                        f00 e = ii7.e((int) i0.getLong(17));
                        long j4 = i0.getLong(18);
                        long j5 = i0.getLong(19);
                        int i6 = (int) i0.getLong(20);
                        long j6 = i0.getLong(21);
                        int i7 = (int) i0.getLong(22);
                        Map map4 = map2;
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
                        Object i02 = zt3.i0(i0.q(0), map3);
                        i02.getClass();
                        List list = (List) i02;
                        Object i03 = zt3.i0(i0.q(0), map4);
                        i03.getClass();
                        arrayList.add(new wh7(q3, h, D, j, j2, j3, kz0Var, i4, e, j4, j5, i6, i5, j6, i7, list, (List) i03));
                        map2 = map4;
                        map = map3;
                        i = 2;
                        i2 = 1;
                        i3 = 0;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 5:
                ih7 ih7Var = (ih7) this.B;
                String str2 = (String) this.L;
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                ns5 i04 = ls5Var4.i0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    i04.g(1, ii7.j(ih7Var));
                    i04.M(2, str2);
                    i04.a0();
                    int I = cg2.I(ls5Var4);
                    i04.close();
                    return Integer.valueOf(I);
                } finally {
                }
            case ig7.b /* 6 */:
                ls5 ls5Var5 = (ls5) obj;
                ls5Var5.getClass();
                ((di7) this.B).b.V(ls5Var5, (xh7) this.L);
                return o27.a;
            case 7:
                g81 g81Var2 = (g81) this.B;
                String str3 = (String) this.L;
                ls5 ls5Var6 = (ls5) obj;
                ls5Var6.getClass();
                ns5 i05 = ls5Var6.i0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    g81 g81Var3 = g81.b;
                    i05.j(1, a53.Q(g81Var2));
                    i05.M(2, str3);
                    i05.a0();
                    i05.close();
                    return o27.a;
                } finally {
                }
            default:
                ls5 ls5Var7 = (ls5) obj;
                ls5Var7.getClass();
                ((gi7) this.B).b.V(ls5Var7, (fi7) this.L);
                return o27.a;
        }
    }
}
