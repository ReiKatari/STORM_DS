package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mk3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mk3 implements mi2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ int B;

    public /* synthetic */ mk3(int i) {
        this.B = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        mi2 mi2Var;
        ns5 ns5Var;
        boolean z;
        String q;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = this.A;
        int i4 = this.B;
        switch (i3) {
            case 0:
                oj3 oj3Var = (oj3) obj;
                ga6 z7 = io2.z();
                if (z7 != null) {
                    mi2Var = z7.e();
                } else {
                    mi2Var = null;
                }
                io2.l0(z7, io2.Y(z7), mi2Var);
                int i5 = oj3Var.a;
                if (i5 == -1) {
                    i5 = 2;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    oj3Var.a(i4 + i6);
                }
                return o27.a;
            default:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                ns5 i0 = ls5Var.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    i0.g(1, i4);
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
                        ArrayList arrayList2 = arrayList;
                        int i7 = r;
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
                        int i8 = (int) i0.getLong(r10);
                        f00 e = ii7.e((int) i0.getLong(r11));
                        long j4 = i0.getLong(r12);
                        long j5 = i0.getLong(r13);
                        long j6 = i0.getLong(r14);
                        int i9 = r15;
                        long j7 = i0.getLong(i9);
                        int i10 = r14;
                        int i11 = r16;
                        if (((int) i0.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i12 = r17;
                        mf4 g = ii7.g((int) i0.getLong(i12));
                        int i13 = r18;
                        int i14 = r2;
                        int i15 = (int) i0.getLong(i13);
                        int i16 = r19;
                        int i17 = (int) i0.getLong(i16);
                        int i18 = r20;
                        long j8 = i0.getLong(i18);
                        int i19 = r13;
                        int i20 = r21;
                        int i21 = (int) i0.getLong(i20);
                        int i22 = r22;
                        int i23 = (int) i0.getLong(i22);
                        int i24 = r23;
                        if (i0.isNull(i24)) {
                            q = null;
                        } else {
                            q = i0.q(i24);
                        }
                        int i25 = r24;
                        if (i0.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf = Integer.valueOf((int) i0.getLong(i25));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            bool = Boolean.valueOf(z6);
                        } else {
                            bool = null;
                        }
                        int i26 = r25;
                        v64 f = ii7.f((int) i0.getLong(i26));
                        int i27 = r26;
                        m64 k = ii7.k(i0.getBlob(i27));
                        r25 = i26;
                        r26 = i27;
                        int i28 = r27;
                        if (((int) i0.getLong(i28)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        r27 = i28;
                        int i29 = r28;
                        if (((int) i0.getLong(i29)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i30 = r29;
                        if (((int) i0.getLong(i30)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r29 = i30;
                        int i31 = r30;
                        if (((int) i0.getLong(i31)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i32 = r31;
                        int i33 = r32;
                        int i34 = r33;
                        r33 = i34;
                        ns5Var = i0;
                        try {
                            arrayList2.add(new xh7(q2, h, q3, q4, D, D2, j, j2, j3, new kz0(k, f, z2, z3, z4, z5, i0.getLong(i32), i0.getLong(i33), ii7.a(i0.getBlob(i34))), i8, e, j4, j5, j6, j7, z, g, i15, i17, j8, i, i23, q, bool));
                            r32 = i33;
                            r13 = i19;
                            r20 = i18;
                            r21 = i20;
                            r23 = i24;
                            arrayList = arrayList2;
                            r28 = i29;
                            r2 = i14;
                            i0 = ns5Var;
                            r18 = i13;
                            r31 = i32;
                            r14 = i10;
                            r15 = i9;
                            r16 = i11;
                            r17 = i12;
                            r19 = i16;
                            r22 = i2;
                            r24 = i25;
                            r30 = i31;
                            r = i7;
                        } catch (Throwable th) {
                            th = th;
                            ns5Var.close();
                            throw th;
                        }
                    }
                    ns5 ns5Var2 = i0;
                    ArrayList arrayList3 = arrayList;
                    ns5Var2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    ns5Var = i0;
                }
        }
    }

    public /* synthetic */ mk3(pk3 pk3Var, int i) {
        this.B = i;
    }
}
