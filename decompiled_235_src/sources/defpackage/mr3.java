package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mr3 implements qn2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ int B;

    public /* synthetic */ mr3(int i) {
        this.B = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        qn2 qn2Var;
        j36 j36Var;
        boolean z;
        String R;
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
                nq3 nq3Var = (nq3) obj;
                vl6 t = ln2.t();
                if (t != null) {
                    qn2Var = t.e();
                } else {
                    qn2Var = null;
                }
                ln2.V(t, ln2.N(t), qn2Var);
                int i5 = nq3Var.a;
                if (i5 == -1) {
                    i5 = 2;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    nq3Var.a(i4 + i6);
                }
                return jg7.a;
            default:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    i0.c(1, i4);
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "state");
                    int B3 = ej2.B(i0, "worker_class_name");
                    int B4 = ej2.B(i0, "input_merger_class_name");
                    int B5 = ej2.B(i0, "input");
                    int B6 = ej2.B(i0, "output");
                    int B7 = ej2.B(i0, "initial_delay");
                    int B8 = ej2.B(i0, "interval_duration");
                    int B9 = ej2.B(i0, "flex_duration");
                    int B10 = ej2.B(i0, "run_attempt_count");
                    int B11 = ej2.B(i0, "backoff_policy");
                    int B12 = ej2.B(i0, "backoff_delay_duration");
                    int B13 = ej2.B(i0, "last_enqueue_time");
                    int B14 = ej2.B(i0, "minimum_retention_duration");
                    int B15 = ej2.B(i0, "schedule_requested_at");
                    int B16 = ej2.B(i0, "run_in_foreground");
                    int B17 = ej2.B(i0, "out_of_quota_policy");
                    int B18 = ej2.B(i0, "period_count");
                    int B19 = ej2.B(i0, "generation");
                    int B20 = ej2.B(i0, "next_schedule_time_override");
                    int B21 = ej2.B(i0, "next_schedule_time_override_generation");
                    int B22 = ej2.B(i0, "stop_reason");
                    int B23 = ej2.B(i0, "trace_tag");
                    int B24 = ej2.B(i0, "backoff_on_system_interruptions");
                    int B25 = ej2.B(i0, "required_network_type");
                    int B26 = ej2.B(i0, "required_network_request");
                    int B27 = ej2.B(i0, "requires_charging");
                    int B28 = ej2.B(i0, "requires_device_idle");
                    int B29 = ej2.B(i0, "requires_battery_not_low");
                    int B30 = ej2.B(i0, "requires_storage_not_low");
                    int B31 = ej2.B(i0, "trigger_content_update_delay");
                    int B32 = ej2.B(i0, "trigger_max_content_delay");
                    int B33 = ej2.B(i0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        String R2 = i0.R(B);
                        ArrayList arrayList2 = arrayList;
                        int i7 = B;
                        iw7 f = ds7.f((int) i0.getLong(B2));
                        String R3 = i0.R(B3);
                        String R4 = i0.R(B4);
                        byte[] blob = i0.getBlob(B5);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        xb1 k2 = u24.k(i0.getBlob(B6));
                        long j = i0.getLong(B7);
                        long j2 = i0.getLong(B8);
                        long j3 = i0.getLong(B9);
                        int i8 = (int) i0.getLong(B10);
                        w10 c = ds7.c((int) i0.getLong(B11));
                        long j4 = i0.getLong(B12);
                        long j5 = i0.getLong(B13);
                        long j6 = i0.getLong(B14);
                        int i9 = B15;
                        long j7 = i0.getLong(i9);
                        int i10 = B14;
                        int i11 = B16;
                        if (((int) i0.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i12 = B17;
                        oo4 e = ds7.e((int) i0.getLong(i12));
                        int i13 = B18;
                        int i14 = B2;
                        int i15 = (int) i0.getLong(i13);
                        int i16 = B19;
                        int i17 = (int) i0.getLong(i16);
                        int i18 = B20;
                        long j8 = i0.getLong(i18);
                        int i19 = B13;
                        int i20 = B21;
                        int i21 = (int) i0.getLong(i20);
                        int i22 = B22;
                        int i23 = (int) i0.getLong(i22);
                        int i24 = B23;
                        if (i0.isNull(i24)) {
                            R = null;
                        } else {
                            R = i0.R(i24);
                        }
                        int i25 = B24;
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
                        int i26 = B25;
                        kf4 d = ds7.d((int) i0.getLong(i26));
                        int i27 = B26;
                        af4 h = ds7.h(i0.getBlob(i27));
                        B25 = i26;
                        B26 = i27;
                        int i28 = B27;
                        if (((int) i0.getLong(i28)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        B27 = i28;
                        int i29 = B28;
                        if (((int) i0.getLong(i29)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i30 = B29;
                        if (((int) i0.getLong(i30)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        B29 = i30;
                        int i31 = B30;
                        if (((int) i0.getLong(i31)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i32 = B31;
                        int i33 = B32;
                        int i34 = B33;
                        B33 = i34;
                        j36Var = i0;
                        try {
                            arrayList2.add(new yw7(R2, f, R3, R4, k, k2, j, j2, j3, new p21(h, d, z2, z3, z4, z5, i0.getLong(i32), i0.getLong(i33), ds7.a(i0.getBlob(i34))), i8, c, j4, j5, j6, j7, z, e, i15, i17, j8, i, i23, R, bool));
                            B32 = i33;
                            B13 = i19;
                            B20 = i18;
                            B21 = i20;
                            B23 = i24;
                            arrayList = arrayList2;
                            B28 = i29;
                            B2 = i14;
                            i0 = j36Var;
                            B18 = i13;
                            B31 = i32;
                            B14 = i10;
                            B15 = i9;
                            B16 = i11;
                            B17 = i12;
                            B19 = i16;
                            B22 = i2;
                            B24 = i25;
                            B30 = i31;
                            B = i7;
                        } catch (Throwable th) {
                            th = th;
                            j36Var.close();
                            throw th;
                        }
                    }
                    j36 j36Var2 = i0;
                    ArrayList arrayList3 = arrayList;
                    j36Var2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    j36Var = i0;
                }
        }
    }

    public /* synthetic */ mr3(pr3 pr3Var, int i) {
        this.B = i;
    }
}
