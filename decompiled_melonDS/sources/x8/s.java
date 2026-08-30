package x8;

import a1.w0;
import java.util.ArrayList;
import java.util.List;
import p8.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;

    public /* synthetic */ s(u uVar, int i2) {
        this.A = i2;
        this.B = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Map, a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Map, a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, a1.w0, a1.e] */
    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i2 = this.A;
        int i10 = 16;
        int i11 = 15;
        int i12 = 14;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        u uVar = this.B;
        switch (i2) {
            case 0:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T.C(1, "cheat_import_worker");
                    ?? w0Var = new w0(0);
                    ?? w0Var2 = new w0(0);
                    while (T.N()) {
                        String n10 = T.n(0);
                        if (!w0Var.containsKey(n10)) {
                            w0Var.put(n10, new ArrayList());
                        }
                        String n11 = T.n(0);
                        if (!w0Var2.containsKey(n11)) {
                            w0Var2.put(n11, new ArrayList());
                        }
                    }
                    T.reset();
                    uVar.b(aVar, w0Var);
                    uVar.a(aVar, w0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        String n12 = T.n(0);
                        e0 x9 = p7.m.x((int) T.getLong(i16));
                        byte[] blob = T.getBlob(2);
                        p8.h hVar = p8.h.f11493b;
                        p8.h v10 = p7.j.v(blob);
                        int i17 = (int) T.getLong(3);
                        int i18 = (int) T.getLong(4);
                        long j2 = T.getLong(14);
                        long j10 = T.getLong(15);
                        long j11 = T.getLong(16);
                        p8.a u4 = p7.m.u((int) T.getLong(17));
                        long j12 = T.getLong(18);
                        long j13 = T.getLong(19);
                        int i19 = (int) T.getLong(20);
                        long j14 = T.getLong(21);
                        int i20 = (int) T.getLong(22);
                        p8.w v11 = p7.m.v((int) T.getLong(5));
                        y8.f H = p7.m.H(T.getBlob(6));
                        if (((int) T.getLong(7)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (((int) T.getLong(8)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (((int) T.getLong(9)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (((int) T.getLong(10)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p8.e eVar = new p8.e(H, v11, z10, z11, z12, z13, T.getLong(11), T.getLong(12), p7.m.f(T.getBlob(13)));
                        Object D = zb.v.D(T.n(0), w0Var);
                        D.getClass();
                        List list = (List) D;
                        Object D2 = zb.v.D(T.n(0), w0Var2);
                        D2.getClass();
                        arrayList.add(new o(n12, x9, v10, j2, j10, j11, eVar, i17, u4, j12, j13, i19, i18, j14, i20, list, (List) D2));
                        i16 = 1;
                    }
                    T.close();
                    return arrayList;
                } finally {
                }
            default:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T.C(1, "cheat_import_worker");
                    ?? w0Var3 = new w0(0);
                    ?? w0Var4 = new w0(0);
                    while (T.N()) {
                        String n13 = T.n(0);
                        if (!w0Var3.containsKey(n13)) {
                            w0Var3.put(n13, new ArrayList());
                        }
                        String n14 = T.n(0);
                        if (!w0Var4.containsKey(n14)) {
                            w0Var4.put(n14, new ArrayList());
                        }
                    }
                    T.reset();
                    uVar.b(aVar2, w0Var3);
                    uVar.a(aVar2, w0Var4);
                    ArrayList arrayList2 = new ArrayList();
                    while (T.N()) {
                        String n15 = T.n(0);
                        e0 x10 = p7.m.x((int) T.getLong(1));
                        byte[] blob2 = T.getBlob(i15);
                        p8.h hVar2 = p8.h.f11493b;
                        p8.h v12 = p7.j.v(blob2);
                        int i21 = (int) T.getLong(i14);
                        int i22 = (int) T.getLong(i13);
                        long j15 = T.getLong(i12);
                        long j16 = T.getLong(i11);
                        long j17 = T.getLong(i10);
                        p8.a u10 = p7.m.u((int) T.getLong(17));
                        long j18 = T.getLong(18);
                        long j19 = T.getLong(19);
                        int i23 = (int) T.getLong(20);
                        long j20 = T.getLong(21);
                        int i24 = (int) T.getLong(22);
                        p8.w v13 = p7.m.v((int) T.getLong(5));
                        y8.f H2 = p7.m.H(T.getBlob(6));
                        if (((int) T.getLong(7)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (((int) T.getLong(8)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (((int) T.getLong(9)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (((int) T.getLong(10)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        p8.e eVar2 = new p8.e(H2, v13, z14, z15, z16, z17, T.getLong(11), T.getLong(12), p7.m.f(T.getBlob(13)));
                        Object D3 = zb.v.D(T.n(0), w0Var3);
                        D3.getClass();
                        List list2 = (List) D3;
                        Object D4 = zb.v.D(T.n(0), w0Var4);
                        D4.getClass();
                        arrayList2.add(new o(n15, x10, v12, j15, j16, j17, eVar2, i21, u10, j18, j19, i23, i22, j20, i24, list2, (List) D4));
                        i10 = 16;
                        i11 = 15;
                        i12 = 14;
                        i13 = 4;
                        i14 = 3;
                        i15 = 2;
                    }
                    T.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
