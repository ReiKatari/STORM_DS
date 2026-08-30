package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ci7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ci7 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ ci7(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        String q;
        int i2;
        int i3;
        Integer valueOf;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        switch (this.A) {
            case 0:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    if (i0.a0()) {
                        i = (int) i0.getLong(0);
                    } else {
                        i = 0;
                    }
                    i0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 1:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (i0.a0()) {
                        if (((int) i0.getLong(0)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = z2;
                    } else {
                        z = false;
                    }
                    i0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 2:
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                i0 = ls5Var3.i0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    i0.g(1, 200L);
                    int r = hi2.r(i0, "id");
                    int r2 = hi2.r(i0, "state");
                    int r3 = hi2.r(i0, "worker_class_name");
                    int r4 = hi2.r(i0, "input_merger_class_name");
                    int r5 = hi2.r(i0, "input");
                    int r6 = hi2.r(i0, "output");
                    int r7 = hi2.r(i0, "initial_delay");
                    int r8 = hi2.r(i0, "interval_duration");
                    int r9 = hi2.r(i0, "flex_duration");
                    int r10 = hi2.r(i0, "run_attempt_count");
                    int r11 = hi2.r(i0, "backoff_policy");
                    int r12 = hi2.r(i0, "backoff_delay_duration");
                    int r13 = hi2.r(i0, "last_enqueue_time");
                    int r14 = hi2.r(i0, "minimum_retention_duration");
                    int r15 = hi2.r(i0, "schedule_requested_at");
                    int r16 = hi2.r(i0, "run_in_foreground");
                    int r17 = hi2.r(i0, "out_of_quota_policy");
                    int r18 = hi2.r(i0, "period_count");
                    int r19 = hi2.r(i0, "generation");
                    int r20 = hi2.r(i0, "next_schedule_time_override");
                    int r21 = hi2.r(i0, "next_schedule_time_override_generation");
                    int r22 = hi2.r(i0, "stop_reason");
                    int r23 = hi2.r(i0, "trace_tag");
                    int r24 = hi2.r(i0, "backoff_on_system_interruptions");
                    int r25 = hi2.r(i0, "required_network_type");
                    int r26 = hi2.r(i0, "required_network_request");
                    int r27 = hi2.r(i0, "requires_charging");
                    int r28 = hi2.r(i0, "requires_device_idle");
                    int r29 = hi2.r(i0, "requires_battery_not_low");
                    int r30 = hi2.r(i0, "requires_storage_not_low");
                    int r31 = hi2.r(i0, "trigger_content_update_delay");
                    int r32 = hi2.r(i0, "trigger_max_content_delay");
                    int r33 = hi2.r(i0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        String q2 = i0.q(r);
                        int i4 = r;
                        int i5 = r14;
                        ih7 h = ii7.h((int) i0.getLong(r2));
                        String q3 = i0.q(r3);
                        String q4 = i0.q(r4);
                        byte[] blob = i0.getBlob(r5);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        g81 D2 = a53.D(i0.getBlob(r6));
                        long j = i0.getLong(r7);
                        long j2 = i0.getLong(r8);
                        long j3 = i0.getLong(r9);
                        int i6 = (int) i0.getLong(r10);
                        f00 e = ii7.e((int) i0.getLong(r11));
                        long j4 = i0.getLong(r12);
                        long j5 = i0.getLong(r13);
                        long j6 = i0.getLong(i5);
                        int i7 = r15;
                        long j7 = i0.getLong(i7);
                        int i8 = r2;
                        int i9 = r16;
                        int i10 = r3;
                        if (((int) i0.getLong(i9)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i11 = r17;
                        mf4 g = ii7.g((int) i0.getLong(i11));
                        int i12 = r18;
                        int i13 = (int) i0.getLong(i12);
                        int i14 = r19;
                        int i15 = (int) i0.getLong(i14);
                        int i16 = r20;
                        long j8 = i0.getLong(i16);
                        int i17 = r21;
                        int i18 = (int) i0.getLong(i17);
                        int i19 = r22;
                        int i20 = (int) i0.getLong(i19);
                        int i21 = r23;
                        Boolean bool = null;
                        if (i0.isNull(i21)) {
                            q = null;
                        } else {
                            q = i0.q(i21);
                        }
                        int i22 = r24;
                        if (i0.isNull(i22)) {
                            i2 = i18;
                            i3 = i19;
                            valueOf = null;
                        } else {
                            i2 = i18;
                            i3 = i19;
                            valueOf = Integer.valueOf((int) i0.getLong(i22));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            bool = Boolean.valueOf(z8);
                        }
                        r24 = i22;
                        int i23 = r25;
                        Boolean bool2 = bool;
                        v64 f = ii7.f((int) i0.getLong(i23));
                        int i24 = r26;
                        m64 k = ii7.k(i0.getBlob(i24));
                        r25 = i23;
                        int i25 = r27;
                        if (((int) i0.getLong(i25)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r27 = i25;
                        int i26 = r28;
                        if (((int) i0.getLong(i26)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        r28 = i26;
                        int i27 = r29;
                        if (((int) i0.getLong(i27)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        r29 = i27;
                        int i28 = r30;
                        if (((int) i0.getLong(i28)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i29 = r31;
                        int i30 = r32;
                        r31 = i29;
                        int i31 = r33;
                        r33 = i31;
                        arrayList.add(new xh7(q2, h, q3, q4, D, D2, j, j2, j3, new kz0(k, f, z4, z5, z6, z7, i0.getLong(i29), i0.getLong(i30), ii7.a(i0.getBlob(i31))), i6, e, j4, j5, j6, j7, z3, g, i13, i15, j8, i2, i20, q, bool2));
                        r32 = i30;
                        r30 = i28;
                        r = i4;
                        r14 = i5;
                        r2 = i8;
                        r15 = i7;
                        r18 = i12;
                        r19 = i14;
                        r20 = i16;
                        r21 = i17;
                        r22 = i3;
                        r23 = i21;
                        r26 = i24;
                        r3 = i10;
                        r16 = i9;
                        r17 = i11;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            default:
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                i0 = ls5Var4.i0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    i0.a0();
                    int I = cg2.I(ls5Var4);
                    i0.close();
                    return Integer.valueOf(I);
                } finally {
                }
        }
    }
}
