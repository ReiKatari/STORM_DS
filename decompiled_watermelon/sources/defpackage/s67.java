package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s67 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ s67(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
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
        boolean z7;
        String q2;
        int i3;
        Integer valueOf2;
        Boolean bool2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String q3;
        int i4;
        Integer valueOf3;
        Boolean bool3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        switch (this.A) {
            case 0:
                return new ko(((Float) obj).floatValue());
            case 1:
                return new ko(((Integer) obj).intValue());
            case 2:
                return Integer.valueOf((int) ((ko) obj).a);
            case 3:
                return new ko(((ji1) obj).A);
            case 4:
                return new ji1(((ko) obj).a);
            case 5:
                mi1 mi1Var = (mi1) obj;
                return new lo(Float.intBitsToFloat((int) (mi1Var.a >> 32)), Float.intBitsToFloat((int) (mi1Var.a & 4294967295L)));
            case ig7.b /* 6 */:
                lo loVar = (lo) obj;
                return new mi1((Float.floatToRawIntBits(loVar.a) << 32) | (Float.floatToRawIntBits(loVar.b) & 4294967295L));
            case 7:
                i76 i76Var = (i76) obj;
                return new lo(Float.intBitsToFloat((int) (i76Var.a >> 32)), Float.intBitsToFloat((int) (i76Var.a & 4294967295L)));
            case 8:
                lo loVar2 = (lo) obj;
                return new i76((Float.floatToRawIntBits(loVar2.a) << 32) | (Float.floatToRawIntBits(loVar2.b) & 4294967295L));
            case 9:
                mb4 mb4Var = (mb4) obj;
                return new lo(Float.intBitsToFloat((int) (mb4Var.a >> 32)), Float.intBitsToFloat((int) (mb4Var.a & 4294967295L)));
            case 10:
                lo loVar3 = (lo) obj;
                return new mb4((Float.floatToRawIntBits(loVar3.a) << 32) | (Float.floatToRawIntBits(loVar3.b) & 4294967295L));
            case 11:
                long j = ((a33) obj).a;
                return new lo((int) (j >> 32), (int) (j & 4294967295L));
            case mj2.L /* 12 */:
                lo loVar4 = (lo) obj;
                return new a33((Math.round(loVar4.a) << 32) | (Math.round(loVar4.b) & 4294967295L));
            case 13:
                long j2 = ((i33) obj).a;
                return new lo((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 14:
                lo loVar5 = (lo) obj;
                int round = Math.round(loVar5.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(loVar5.b);
                if (round2 < 0) {
                    round2 = 0;
                }
                return new i33((round << 32) | (round2 & 4294967295L));
            case ig7.e /* 15 */:
                y55 y55Var = (y55) obj;
                return new no(y55Var.a, y55Var.b, y55Var.c, y55Var.d);
            case 16:
                no noVar = (no) obj;
                return new y55(noVar.a, noVar.b, noVar.c, noVar.d);
            case 17:
                return Float.valueOf(((ko) obj).a);
            case 18:
                ((Boolean) obj).getClass();
                return o27.a;
            case 19:
                return ((dg7) obj).l;
            case 20:
                return ((dg7) obj).g;
            case 21:
                return ((dg7) obj).b;
            case 22:
                return ((dg7) obj).f;
            case 23:
                return ((dg7) obj).e;
            case 24:
                ng7 ng7Var = (ng7) obj;
                ng7Var.getClass();
                return ng7Var;
            case 25:
                fy0 fy0Var = (fy0) obj;
                fy0Var.getClass();
                return fy0Var.getClass().getSimpleName();
            case 26:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("DELETE FROM WorkProgress");
                try {
                    i0.a0();
                    i0.close();
                    return o27.a;
                } finally {
                    i0.close();
                }
            case 27:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                        String q4 = i0.q(r);
                        int i5 = r14;
                        int i6 = r13;
                        ih7 h = ii7.h((int) i0.getLong(r2));
                        String q5 = i0.q(r3);
                        String q6 = i0.q(r4);
                        byte[] blob = i0.getBlob(r5);
                        g81 g81Var = g81.b;
                        g81 D = a53.D(blob);
                        g81 D2 = a53.D(i0.getBlob(r6));
                        long j3 = i0.getLong(r7);
                        long j4 = i0.getLong(r8);
                        long j5 = i0.getLong(r9);
                        int i7 = (int) i0.getLong(r10);
                        int i8 = r2;
                        int i9 = r;
                        f00 e = ii7.e((int) i0.getLong(r11));
                        long j6 = i0.getLong(r12);
                        long j7 = i0.getLong(i6);
                        long j8 = i0.getLong(i5);
                        int i10 = r15;
                        long j9 = i0.getLong(i10);
                        r15 = i10;
                        int i11 = r16;
                        int i12 = r3;
                        if (((int) i0.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i13 = r17;
                        mf4 g = ii7.g((int) i0.getLong(i13));
                        r17 = i13;
                        int i14 = r18;
                        int i15 = (int) i0.getLong(i14);
                        r18 = i14;
                        int i16 = r19;
                        int i17 = (int) i0.getLong(i16);
                        int i18 = r20;
                        long j10 = i0.getLong(i18);
                        int i19 = r21;
                        int i20 = (int) i0.getLong(i19);
                        int i21 = r22;
                        int i22 = (int) i0.getLong(i21);
                        int i23 = r23;
                        if (i0.isNull(i23)) {
                            q = null;
                        } else {
                            q = i0.q(i23);
                        }
                        int i24 = r24;
                        if (i0.isNull(i24)) {
                            i = i20;
                            i2 = i21;
                            valueOf = null;
                        } else {
                            i = i20;
                            i2 = i21;
                            valueOf = Integer.valueOf((int) i0.getLong(i24));
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
                        r24 = i24;
                        int i25 = r25;
                        v64 f = ii7.f((int) i0.getLong(i25));
                        int i26 = r26;
                        m64 k = ii7.k(i0.getBlob(i26));
                        r25 = i25;
                        int i27 = r27;
                        if (((int) i0.getLong(i27)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        r27 = i27;
                        int i28 = r28;
                        if (((int) i0.getLong(i28)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r28 = i28;
                        int i29 = r29;
                        if (((int) i0.getLong(i29)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r29 = i29;
                        int i30 = r30;
                        if (((int) i0.getLong(i30)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i31 = r31;
                        int i32 = r32;
                        r31 = i31;
                        int i33 = r33;
                        r33 = i33;
                        arrayList.add(new xh7(q4, h, q5, q6, D, D2, j3, j4, j5, new kz0(k, f, z2, z3, z4, z5, i0.getLong(i31), i0.getLong(i32), ii7.a(i0.getBlob(i33))), i7, e, j6, j7, j8, j9, z, g, i15, i17, j10, i, i22, q, bool));
                        r32 = i32;
                        r30 = i30;
                        r = i9;
                        r13 = i6;
                        r2 = i8;
                        r3 = i12;
                        r16 = i11;
                        r19 = i16;
                        r20 = i18;
                        r21 = i19;
                        r22 = i2;
                        r23 = i23;
                        r26 = i26;
                        r14 = i5;
                    }
                    return arrayList;
                } finally {
                }
            case 28:
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                i0 = ls5Var3.i0("SELECT * FROM workspec WHERE state=1");
                try {
                    int r34 = hi2.r(i0, "id");
                    int r35 = hi2.r(i0, "state");
                    int r36 = hi2.r(i0, "worker_class_name");
                    int r37 = hi2.r(i0, "input_merger_class_name");
                    int r38 = hi2.r(i0, "input");
                    int r39 = hi2.r(i0, "output");
                    int r40 = hi2.r(i0, "initial_delay");
                    int r41 = hi2.r(i0, "interval_duration");
                    int r42 = hi2.r(i0, "flex_duration");
                    int r43 = hi2.r(i0, "run_attempt_count");
                    int r44 = hi2.r(i0, "backoff_policy");
                    int r45 = hi2.r(i0, "backoff_delay_duration");
                    int r46 = hi2.r(i0, "last_enqueue_time");
                    int r47 = hi2.r(i0, "minimum_retention_duration");
                    int r48 = hi2.r(i0, "schedule_requested_at");
                    int r49 = hi2.r(i0, "run_in_foreground");
                    int r50 = hi2.r(i0, "out_of_quota_policy");
                    int r51 = hi2.r(i0, "period_count");
                    int r52 = hi2.r(i0, "generation");
                    int r53 = hi2.r(i0, "next_schedule_time_override");
                    int r54 = hi2.r(i0, "next_schedule_time_override_generation");
                    int r55 = hi2.r(i0, "stop_reason");
                    int r56 = hi2.r(i0, "trace_tag");
                    int r57 = hi2.r(i0, "backoff_on_system_interruptions");
                    int r58 = hi2.r(i0, "required_network_type");
                    int r59 = hi2.r(i0, "required_network_request");
                    int r60 = hi2.r(i0, "requires_charging");
                    int r61 = hi2.r(i0, "requires_device_idle");
                    int r62 = hi2.r(i0, "requires_battery_not_low");
                    int r63 = hi2.r(i0, "requires_storage_not_low");
                    int r64 = hi2.r(i0, "trigger_content_update_delay");
                    int r65 = hi2.r(i0, "trigger_max_content_delay");
                    int r66 = hi2.r(i0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.a0()) {
                        String q7 = i0.q(r34);
                        int i34 = r47;
                        int i35 = r46;
                        ih7 h2 = ii7.h((int) i0.getLong(r35));
                        String q8 = i0.q(r36);
                        String q9 = i0.q(r37);
                        byte[] blob2 = i0.getBlob(r38);
                        g81 g81Var2 = g81.b;
                        g81 D3 = a53.D(blob2);
                        g81 D4 = a53.D(i0.getBlob(r39));
                        long j11 = i0.getLong(r40);
                        long j12 = i0.getLong(r41);
                        long j13 = i0.getLong(r42);
                        int i36 = (int) i0.getLong(r43);
                        int i37 = r35;
                        int i38 = r34;
                        f00 e2 = ii7.e((int) i0.getLong(r44));
                        long j14 = i0.getLong(r45);
                        long j15 = i0.getLong(i35);
                        long j16 = i0.getLong(i34);
                        int i39 = r48;
                        long j17 = i0.getLong(i39);
                        int i40 = r49;
                        int i41 = r36;
                        if (((int) i0.getLong(i40)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i42 = r50;
                        mf4 g2 = ii7.g((int) i0.getLong(i42));
                        r50 = i42;
                        int i43 = r51;
                        int i44 = (int) i0.getLong(i43);
                        r51 = i43;
                        int i45 = r52;
                        int i46 = (int) i0.getLong(i45);
                        long j18 = i0.getLong(r53);
                        int i47 = r54;
                        int i48 = (int) i0.getLong(i47);
                        r52 = i45;
                        r54 = i47;
                        int i49 = r55;
                        int i50 = (int) i0.getLong(i49);
                        int i51 = r56;
                        if (i0.isNull(i51)) {
                            q2 = null;
                        } else {
                            q2 = i0.q(i51);
                        }
                        int i52 = r57;
                        if (i0.isNull(i52)) {
                            i3 = i50;
                            r56 = i51;
                            valueOf2 = null;
                        } else {
                            i3 = i50;
                            r56 = i51;
                            valueOf2 = Integer.valueOf((int) i0.getLong(i52));
                        }
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bool2 = Boolean.valueOf(z12);
                        } else {
                            bool2 = null;
                        }
                        r57 = i52;
                        r55 = i49;
                        int i53 = r58;
                        v64 f2 = ii7.f((int) i0.getLong(i53));
                        int i54 = r59;
                        m64 k2 = ii7.k(i0.getBlob(i54));
                        r58 = i53;
                        int i55 = r60;
                        if (((int) i0.getLong(i55)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        r59 = i54;
                        r60 = i55;
                        int i56 = r61;
                        if (((int) i0.getLong(i56)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        r61 = i56;
                        int i57 = r62;
                        if (((int) i0.getLong(i57)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i58 = r63;
                        if (((int) i0.getLong(i58)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i59 = r64;
                        int i60 = r65;
                        r62 = i57;
                        int i61 = r66;
                        r66 = i61;
                        arrayList2.add(new xh7(q7, h2, q8, q9, D3, D4, j11, j12, j13, new kz0(k2, f2, z8, z9, z10, z11, i0.getLong(i59), i0.getLong(i60), ii7.a(i0.getBlob(i61))), i36, e2, j14, j15, j16, j17, z7, g2, i44, i46, j18, i48, i3, q2, bool2));
                        r63 = i58;
                        r64 = i59;
                        r65 = i60;
                        r47 = i34;
                        r34 = i38;
                        r35 = i37;
                        r36 = i41;
                        r49 = i40;
                        r48 = i39;
                        r46 = i35;
                    }
                    return arrayList2;
                } finally {
                }
            default:
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                i0 = ls5Var4.i0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int r67 = hi2.r(i0, "id");
                    int r68 = hi2.r(i0, "state");
                    int r69 = hi2.r(i0, "worker_class_name");
                    int r70 = hi2.r(i0, "input_merger_class_name");
                    int r71 = hi2.r(i0, "input");
                    int r72 = hi2.r(i0, "output");
                    int r73 = hi2.r(i0, "initial_delay");
                    int r74 = hi2.r(i0, "interval_duration");
                    int r75 = hi2.r(i0, "flex_duration");
                    int r76 = hi2.r(i0, "run_attempt_count");
                    int r77 = hi2.r(i0, "backoff_policy");
                    int r78 = hi2.r(i0, "backoff_delay_duration");
                    int r79 = hi2.r(i0, "last_enqueue_time");
                    int r80 = hi2.r(i0, "minimum_retention_duration");
                    int r81 = hi2.r(i0, "schedule_requested_at");
                    int r82 = hi2.r(i0, "run_in_foreground");
                    int r83 = hi2.r(i0, "out_of_quota_policy");
                    int r84 = hi2.r(i0, "period_count");
                    int r85 = hi2.r(i0, "generation");
                    int r86 = hi2.r(i0, "next_schedule_time_override");
                    int r87 = hi2.r(i0, "next_schedule_time_override_generation");
                    int r88 = hi2.r(i0, "stop_reason");
                    int r89 = hi2.r(i0, "trace_tag");
                    int r90 = hi2.r(i0, "backoff_on_system_interruptions");
                    int r91 = hi2.r(i0, "required_network_type");
                    int r92 = hi2.r(i0, "required_network_request");
                    int r93 = hi2.r(i0, "requires_charging");
                    int r94 = hi2.r(i0, "requires_device_idle");
                    int r95 = hi2.r(i0, "requires_battery_not_low");
                    int r96 = hi2.r(i0, "requires_storage_not_low");
                    int r97 = hi2.r(i0, "trigger_content_update_delay");
                    int r98 = hi2.r(i0, "trigger_max_content_delay");
                    int r99 = hi2.r(i0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.a0()) {
                        String q10 = i0.q(r67);
                        int i62 = r80;
                        int i63 = r79;
                        ih7 h3 = ii7.h((int) i0.getLong(r68));
                        String q11 = i0.q(r69);
                        String q12 = i0.q(r70);
                        byte[] blob3 = i0.getBlob(r71);
                        g81 g81Var3 = g81.b;
                        g81 D5 = a53.D(blob3);
                        g81 D6 = a53.D(i0.getBlob(r72));
                        long j19 = i0.getLong(r73);
                        long j20 = i0.getLong(r74);
                        long j21 = i0.getLong(r75);
                        int i64 = (int) i0.getLong(r76);
                        int i65 = r68;
                        int i66 = r67;
                        f00 e3 = ii7.e((int) i0.getLong(r77));
                        long j22 = i0.getLong(r78);
                        long j23 = i0.getLong(i63);
                        long j24 = i0.getLong(i62);
                        int i67 = r81;
                        long j25 = i0.getLong(i67);
                        int i68 = r82;
                        int i69 = r69;
                        if (((int) i0.getLong(i68)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i70 = r83;
                        mf4 g3 = ii7.g((int) i0.getLong(i70));
                        r83 = i70;
                        int i71 = r84;
                        int i72 = (int) i0.getLong(i71);
                        r84 = i71;
                        int i73 = r85;
                        int i74 = (int) i0.getLong(i73);
                        long j26 = i0.getLong(r86);
                        int i75 = r87;
                        int i76 = (int) i0.getLong(i75);
                        r85 = i73;
                        r87 = i75;
                        int i77 = r88;
                        int i78 = (int) i0.getLong(i77);
                        int i79 = r89;
                        if (i0.isNull(i79)) {
                            q3 = null;
                        } else {
                            q3 = i0.q(i79);
                        }
                        int i80 = r90;
                        if (i0.isNull(i80)) {
                            i4 = i78;
                            r89 = i79;
                            valueOf3 = null;
                        } else {
                            i4 = i78;
                            r89 = i79;
                            valueOf3 = Integer.valueOf((int) i0.getLong(i80));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            bool3 = Boolean.valueOf(z18);
                        } else {
                            bool3 = null;
                        }
                        r90 = i80;
                        r88 = i77;
                        int i81 = r91;
                        v64 f3 = ii7.f((int) i0.getLong(i81));
                        int i82 = r92;
                        m64 k3 = ii7.k(i0.getBlob(i82));
                        r91 = i81;
                        int i83 = r93;
                        if (((int) i0.getLong(i83)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r92 = i82;
                        r93 = i83;
                        int i84 = r94;
                        if (((int) i0.getLong(i84)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        r94 = i84;
                        int i85 = r95;
                        if (((int) i0.getLong(i85)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        int i86 = r96;
                        if (((int) i0.getLong(i86)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        int i87 = r97;
                        int i88 = r98;
                        r95 = i85;
                        int i89 = r99;
                        r99 = i89;
                        arrayList3.add(new xh7(q10, h3, q11, q12, D5, D6, j19, j20, j21, new kz0(k3, f3, z14, z15, z16, z17, i0.getLong(i87), i0.getLong(i88), ii7.a(i0.getBlob(i89))), i64, e3, j22, j23, j24, j25, z13, g3, i72, i74, j26, i76, i4, q3, bool3));
                        r96 = i86;
                        r97 = i87;
                        r98 = i88;
                        r80 = i62;
                        r67 = i66;
                        r68 = i65;
                        r69 = i69;
                        r82 = i68;
                        r81 = i67;
                        r79 = i63;
                    }
                    return arrayList3;
                } finally {
                }
        }
    }
}
