package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rk7 implements defpackage.qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ rk7(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    private final java.lang.Object a(java.lang.Object r4) {
            r3 = this;
            e36 r4 = (defpackage.e36) r4
            r4.getClass()
            java.lang.String r3 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            j36 r3 = r4.i0(r3)
            boolean r4 = r3.f0()     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            if (r4 == 0) goto L1d
            long r1 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L1b
            int r4 = (int) r1
            if (r4 == 0) goto L1d
            r0 = 1
            goto L1d
        L1b:
            r4 = move-exception
            goto L25
        L1d:
            r3.close()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L25:
            r3.close()
            throw r4
    }

    private final java.lang.Object b(java.lang.Object r85) {
            r84 = this;
            r0 = r85
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"
            j36 r1 = r0.i0(r1)
            r2 = 200(0xc8, double:9.9E-322)
            r0 = 1
            r1.c(r0, r2)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = "id"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L207
            java.lang.String r3 = "state"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L207
            java.lang.String r4 = "worker_class_name"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L207
            java.lang.String r5 = "input_merger_class_name"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r6 = "input"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L207
            java.lang.String r7 = "output"
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L207
            java.lang.String r8 = "initial_delay"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L207
            java.lang.String r9 = "interval_duration"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L207
            java.lang.String r10 = "flex_duration"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L207
            java.lang.String r11 = "run_attempt_count"
            int r11 = defpackage.ej2.B(r1, r11)     // Catch: java.lang.Throwable -> L207
            java.lang.String r12 = "backoff_policy"
            int r12 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L207
            java.lang.String r13 = "backoff_delay_duration"
            int r13 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L207
            java.lang.String r14 = "last_enqueue_time"
            int r14 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L207
            java.lang.String r15 = "minimum_retention_duration"
            int r15 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L207
            java.lang.String r0 = "schedule_requested_at"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r85 = r0
            java.lang.String r0 = "run_in_foreground"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r16 = r0
            java.lang.String r0 = "out_of_quota_policy"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r17 = r0
            java.lang.String r0 = "period_count"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r18 = r0
            java.lang.String r0 = "generation"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r19 = r0
            java.lang.String r0 = "next_schedule_time_override"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r20 = r0
            java.lang.String r0 = "next_schedule_time_override_generation"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r21 = r0
            java.lang.String r0 = "stop_reason"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r22 = r0
            java.lang.String r0 = "trace_tag"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r23 = r0
            java.lang.String r0 = "backoff_on_system_interruptions"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r24 = r0
            java.lang.String r0 = "required_network_type"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r25 = r0
            java.lang.String r0 = "required_network_request"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r26 = r0
            java.lang.String r0 = "requires_charging"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r27 = r0
            java.lang.String r0 = "requires_device_idle"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r28 = r0
            java.lang.String r0 = "requires_battery_not_low"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r29 = r0
            java.lang.String r0 = "requires_storage_not_low"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r30 = r0
            java.lang.String r0 = "trigger_content_update_delay"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r31 = r0
            java.lang.String r0 = "trigger_max_content_delay"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r32 = r0
            java.lang.String r0 = "content_uri_triggers"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L207
            r33 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L207
            r0.<init>()     // Catch: java.lang.Throwable -> L207
        L104:
            boolean r34 = r1.f0()     // Catch: java.lang.Throwable -> L207
            if (r34 == 0) goto L2bc
            java.lang.String r36 = r1.R(r2)     // Catch: java.lang.Throwable -> L207
            r34 = r14
            r69 = r15
            long r14 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L207
            iw7 r37 = defpackage.ds7.f(r14)     // Catch: java.lang.Throwable -> L207
            java.lang.String r38 = r1.R(r4)     // Catch: java.lang.Throwable -> L207
            java.lang.String r39 = r1.R(r5)     // Catch: java.lang.Throwable -> L207
            byte[] r14 = r1.getBlob(r6)     // Catch: java.lang.Throwable -> L207
            xb1 r15 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L207
            xb1 r40 = defpackage.u24.k(r14)     // Catch: java.lang.Throwable -> L207
            byte[] r14 = r1.getBlob(r7)     // Catch: java.lang.Throwable -> L207
            xb1 r41 = defpackage.u24.k(r14)     // Catch: java.lang.Throwable -> L207
            long r42 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L207
            long r44 = r1.getLong(r9)     // Catch: java.lang.Throwable -> L207
            long r46 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L207
            long r14 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L207
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L207
            r15 = r2
            r70 = r3
            long r2 = r1.getLong(r12)     // Catch: java.lang.Throwable -> L207
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L207
            w10 r50 = defpackage.ds7.c(r2)     // Catch: java.lang.Throwable -> L207
            long r51 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L207
            r2 = r34
            long r53 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            r3 = r69
            long r55 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            r34 = r2
            r2 = r85
            long r57 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            r85 = r2
            r69 = r3
            r2 = r16
            r16 = r4
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto L180
            r59 = 1
        L17b:
            r3 = r17
            r17 = r5
            goto L183
        L180:
            r59 = 0
            goto L17b
        L183:
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L207
            oo4 r60 = defpackage.ds7.e(r4)     // Catch: java.lang.Throwable -> L207
            r5 = r2
            r4 = r18
            r18 = r3
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L207
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L207
            r71 = r5
            r3 = r19
            r19 = r4
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L207
            r5 = r20
            long r63 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L207
            r61 = r2
            r20 = r3
            r62 = r4
            r2 = r21
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L207
            r21 = r2
            r65 = r3
            r4 = r22
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L207
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L207
            r3 = r23
            boolean r22 = r1.isNull(r3)     // Catch: java.lang.Throwable -> L207
            r23 = 0
            if (r22 == 0) goto L1d0
            r67 = r23
        L1cb:
            r66 = r2
            r2 = r24
            goto L1d7
        L1d0:
            java.lang.String r22 = r1.R(r3)     // Catch: java.lang.Throwable -> L207
            r67 = r22
            goto L1cb
        L1d7:
            boolean r22 = r1.isNull(r2)     // Catch: java.lang.Throwable -> L207
            if (r22 == 0) goto L1e4
            r24 = r3
            r22 = r4
            r3 = r23
            goto L1f1
        L1e4:
            r24 = r3
            r22 = r4
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L207
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L207
        L1f1:
            if (r3 == 0) goto L200
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto L1fb
            r3 = 1
            goto L1fc
        L1fb:
            r3 = 0
        L1fc:
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L207
        L200:
            r68 = r23
            r3 = r25
            r23 = r5
            goto L20a
        L207:
            r0 = move-exception
            goto L2c0
        L20a:
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L207
            kf4 r74 = defpackage.ds7.d(r4)     // Catch: java.lang.Throwable -> L207
            r4 = r26
            byte[] r5 = r1.getBlob(r4)     // Catch: java.lang.Throwable -> L207
            af4 r73 = defpackage.ds7.h(r5)     // Catch: java.lang.Throwable -> L207
            r25 = r2
            r26 = r3
            r5 = r27
            long r2 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L207
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L207
            if (r2 == 0) goto L231
            r75 = 1
        L22c:
            r27 = r4
            r2 = r28
            goto L234
        L231:
            r75 = 0
            goto L22c
        L234:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto L242
            r76 = 1
        L23d:
            r28 = r5
            r3 = r29
            goto L245
        L242:
            r76 = 0
            goto L23d
        L245:
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L207
            if (r4 == 0) goto L254
            r77 = 1
        L24e:
            r5 = r2
            r29 = r3
            r4 = r30
            goto L257
        L254:
            r77 = 0
            goto L24e
        L257:
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L207
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L207
            if (r2 == 0) goto L263
            r78 = 1
        L260:
            r2 = r31
            goto L266
        L263:
            r78 = 0
            goto L260
        L266:
            long r79 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L207
            r3 = r32
            long r81 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L207
            r31 = r2
            r2 = r33
            byte[] r30 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L207
            java.util.LinkedHashSet r83 = defpackage.ds7.a(r30)     // Catch: java.lang.Throwable -> L207
            p21 r48 = new p21     // Catch: java.lang.Throwable -> L207
            r72 = r48
            r72.<init>(r73, r74, r75, r76, r77, r78, r79, r81, r83)     // Catch: java.lang.Throwable -> L207
            r48 = r72
            yw7 r35 = new yw7     // Catch: java.lang.Throwable -> L207
            r49 = r14
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r67, r68)     // Catch: java.lang.Throwable -> L207
            r14 = r35
            r0.add(r14)     // Catch: java.lang.Throwable -> L207
            r14 = r28
            r28 = r5
            r5 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r14
            r33 = r2
            r32 = r3
            r30 = r4
            r2 = r15
            r4 = r16
            r14 = r34
            r15 = r69
            r3 = r70
            r16 = r71
            goto L104
        L2bc:
            r1.close()
            return r0
        L2c0:
            r1.close()
            throw r0
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r88) {
            r87 = this;
            r0 = r87
            int r1 = r0.A
            java.lang.String r2 = "generation"
            java.lang.String r3 = "period_count"
            java.lang.String r4 = "out_of_quota_policy"
            java.lang.String r5 = "run_in_foreground"
            java.lang.String r6 = "schedule_requested_at"
            java.lang.String r7 = "minimum_retention_duration"
            java.lang.String r8 = "last_enqueue_time"
            java.lang.String r9 = "backoff_delay_duration"
            java.lang.String r10 = "backoff_policy"
            java.lang.String r11 = "run_attempt_count"
            java.lang.String r12 = "flex_duration"
            java.lang.String r13 = "interval_duration"
            java.lang.String r14 = "initial_delay"
            java.lang.String r15 = "output"
            java.lang.String r0 = "input"
            r16 = r1
            java.lang.String r1 = "input_merger_class_name"
            r17 = r2
            java.lang.String r2 = "worker_class_name"
            r18 = r3
            java.lang.String r3 = "state"
            r19 = r4
            java.lang.String r4 = "id"
            r20 = 1
            r21 = 0
            r22 = r5
            r5 = 0
            switch(r16) {
                case 0: goto La5b;
                case 1: goto La50;
                case 2: goto La3d;
                case 3: goto La33;
                case 4: goto La29;
                case 5: goto L8db;
                case 6: goto L8d1;
                case 7: goto L8ca;
                case 8: goto L8c3;
                case 9: goto L8bc;
                case 10: goto L8b5;
                case 11: goto L8ae;
                case 12: goto L8a6;
                case 13: goto L896;
                case 14: goto L87b;
                case 15: goto L5d2;
                case 16: goto L32f;
                case 17: goto L8e;
                case 18: goto L67;
                case 19: goto L62;
                case 20: goto L5d;
                default: goto L3c;
            }
        L3c:
            r0 = r88
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L58
            int r0 = defpackage.oi2.D(r0)     // Catch: java.lang.Throwable -> L58
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L58:
            r0 = move-exception
            r1.close()
            throw r0
        L5d:
            java.lang.Object r0 = r87.b(r88)
            return r0
        L62:
            java.lang.Object r0 = r87.a(r88)
            return r0
        L67:
            r0 = r88
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"
            j36 r1 = r0.i0(r1)
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L82
            long r2 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L80
            int r5 = (int) r2
            goto L82
        L80:
            r0 = move-exception
            goto L8a
        L82:
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L8a:
            r1.close()
            throw r0
        L8e:
            r5 = r88
            e36 r5 = (defpackage.e36) r5
            r5.getClass()
            r23 = r6
            java.lang.String r6 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time"
            j36 r5 = r5.i0(r6)
            int r4 = defpackage.ej2.B(r5, r4)     // Catch: java.lang.Throwable -> L273
            int r3 = defpackage.ej2.B(r5, r3)     // Catch: java.lang.Throwable -> L273
            int r2 = defpackage.ej2.B(r5, r2)     // Catch: java.lang.Throwable -> L273
            int r1 = defpackage.ej2.B(r5, r1)     // Catch: java.lang.Throwable -> L273
            int r0 = defpackage.ej2.B(r5, r0)     // Catch: java.lang.Throwable -> L273
            int r6 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            int r14 = defpackage.ej2.B(r5, r14)     // Catch: java.lang.Throwable -> L273
            int r13 = defpackage.ej2.B(r5, r13)     // Catch: java.lang.Throwable -> L273
            int r12 = defpackage.ej2.B(r5, r12)     // Catch: java.lang.Throwable -> L273
            int r11 = defpackage.ej2.B(r5, r11)     // Catch: java.lang.Throwable -> L273
            int r10 = defpackage.ej2.B(r5, r10)     // Catch: java.lang.Throwable -> L273
            int r9 = defpackage.ej2.B(r5, r9)     // Catch: java.lang.Throwable -> L273
            int r8 = defpackage.ej2.B(r5, r8)     // Catch: java.lang.Throwable -> L273
            int r7 = defpackage.ej2.B(r5, r7)     // Catch: java.lang.Throwable -> L273
            r15 = r23
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r87 = r15
            r15 = r22
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r88 = r15
            r15 = r19
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r19 = r15
            r15 = r18
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r18 = r15
            r15 = r17
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r17 = r15
            java.lang.String r15 = "next_schedule_time_override"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r22 = r15
            java.lang.String r15 = "next_schedule_time_override_generation"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r23 = r15
            java.lang.String r15 = "stop_reason"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r24 = r15
            java.lang.String r15 = "trace_tag"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r25 = r15
            java.lang.String r15 = "backoff_on_system_interruptions"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r26 = r15
            java.lang.String r15 = "required_network_type"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r27 = r15
            java.lang.String r15 = "required_network_request"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r28 = r15
            java.lang.String r15 = "requires_charging"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r29 = r15
            java.lang.String r15 = "requires_device_idle"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r30 = r15
            java.lang.String r15 = "requires_battery_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r31 = r15
            java.lang.String r15 = "requires_storage_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r32 = r15
            java.lang.String r15 = "trigger_content_update_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r33 = r15
            java.lang.String r15 = "trigger_max_content_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r34 = r15
            java.lang.String r15 = "content_uri_triggers"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L273
            r35 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L273
            r15.<init>()     // Catch: java.lang.Throwable -> L273
        L172:
            boolean r36 = r5.f0()     // Catch: java.lang.Throwable -> L273
            if (r36 == 0) goto L327
            java.lang.String r38 = r5.R(r4)     // Catch: java.lang.Throwable -> L273
            r71 = r7
            r36 = r8
            long r7 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L273
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L273
            iw7 r39 = defpackage.ds7.f(r7)     // Catch: java.lang.Throwable -> L273
            java.lang.String r40 = r5.R(r2)     // Catch: java.lang.Throwable -> L273
            java.lang.String r41 = r5.R(r1)     // Catch: java.lang.Throwable -> L273
            byte[] r7 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L273
            xb1 r8 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L273
            xb1 r42 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L273
            byte[] r7 = r5.getBlob(r6)     // Catch: java.lang.Throwable -> L273
            xb1 r43 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L273
            long r44 = r5.getLong(r14)     // Catch: java.lang.Throwable -> L273
            long r46 = r5.getLong(r13)     // Catch: java.lang.Throwable -> L273
            long r48 = r5.getLong(r12)     // Catch: java.lang.Throwable -> L273
            long r7 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L273
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L273
            r73 = r0
            r72 = r1
            long r0 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L273
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L273
            w10 r52 = defpackage.ds7.c(r0)     // Catch: java.lang.Throwable -> L273
            long r53 = r5.getLong(r9)     // Catch: java.lang.Throwable -> L273
            r0 = r36
            long r55 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            r1 = r71
            long r57 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            r8 = r87
            long r59 = r5.getLong(r8)     // Catch: java.lang.Throwable -> L273
            r36 = r0
            r71 = r1
            r87 = r2
            r0 = r88
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L273
            if (r1 == 0) goto L1ed
            r61 = r20
        L1e8:
            r88 = r3
            r1 = r19
            goto L1f0
        L1ed:
            r61 = 0
            goto L1e8
        L1f0:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L273
            oo4 r62 = defpackage.ds7.e(r2)     // Catch: java.lang.Throwable -> L273
            r3 = r0
            r19 = r1
            r2 = r18
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L273
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L273
            r18 = r2
            r1 = r17
            r17 = r3
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L273
            r3 = r22
            long r65 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L273
            r63 = r0
            r22 = r1
            r64 = r2
            r0 = r23
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L273
            r23 = r0
            r67 = r1
            r2 = r24
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L273
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L273
            r1 = r25
            boolean r24 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L273
            if (r24 == 0) goto L23b
            r69 = r21
        L236:
            r68 = r0
            r0 = r26
            goto L242
        L23b:
            java.lang.String r24 = r5.R(r1)     // Catch: java.lang.Throwable -> L273
            r69 = r24
            goto L236
        L242:
            boolean r24 = r5.isNull(r0)     // Catch: java.lang.Throwable -> L273
            if (r24 == 0) goto L24f
            r25 = r1
            r24 = r2
            r1 = r21
            goto L25c
        L24f:
            r25 = r1
            r24 = r2
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L273
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L273
        L25c:
            if (r1 == 0) goto L276
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L273
            if (r1 == 0) goto L267
            r1 = r20
            goto L268
        L267:
            r1 = 0
        L268:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L273
            r70 = r1
        L26e:
            r26 = r3
            r1 = r27
            goto L279
        L273:
            r0 = move-exception
            goto L32b
        L276:
            r70 = r21
            goto L26e
        L279:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L273
            kf4 r76 = defpackage.ds7.d(r2)     // Catch: java.lang.Throwable -> L273
            r2 = r28
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L273
            af4 r75 = defpackage.ds7.h(r3)     // Catch: java.lang.Throwable -> L273
            r27 = r0
            r28 = r1
            r3 = r29
            long r0 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L273
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L273
            if (r0 == 0) goto L2a0
            r77 = r20
        L29b:
            r29 = r2
            r0 = r30
            goto L2a3
        L2a0:
            r77 = 0
            goto L29b
        L2a3:
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L273
            if (r1 == 0) goto L2b1
            r78 = r20
        L2ac:
            r30 = r3
            r1 = r31
            goto L2b4
        L2b1:
            r78 = 0
            goto L2ac
        L2b4:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L273
            if (r2 == 0) goto L2c3
            r79 = r20
        L2bd:
            r3 = r0
            r31 = r1
            r2 = r32
            goto L2c6
        L2c3:
            r79 = 0
            goto L2bd
        L2c6:
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L273
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L273
            if (r0 == 0) goto L2d2
            r80 = r20
        L2cf:
            r0 = r33
            goto L2d5
        L2d2:
            r80 = 0
            goto L2cf
        L2d5:
            long r81 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L273
            r1 = r34
            long r83 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L273
            r33 = r0
            r0 = r35
            byte[] r32 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L273
            java.util.LinkedHashSet r85 = defpackage.ds7.a(r32)     // Catch: java.lang.Throwable -> L273
            p21 r50 = new p21     // Catch: java.lang.Throwable -> L273
            r74 = r50
            r74.<init>(r75, r76, r77, r78, r79, r80, r81, r83, r85)     // Catch: java.lang.Throwable -> L273
            r50 = r74
            yw7 r37 = new yw7     // Catch: java.lang.Throwable -> L273
            r51 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r55, r57, r59, r61, r62, r63, r64, r65, r67, r68, r69, r70)     // Catch: java.lang.Throwable -> L273
            r7 = r37
            r15.add(r7)     // Catch: java.lang.Throwable -> L273
            r7 = r3
            r3 = r88
            r88 = r17
            r17 = r22
            r22 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r7
            r35 = r0
            r34 = r1
            r32 = r2
            r7 = r71
            r1 = r72
            r0 = r73
            r2 = r87
            r87 = r8
            r8 = r36
            goto L172
        L327:
            r5.close()
            return r15
        L32b:
            r5.close()
            throw r0
        L32f:
            r5 = r6
            r6 = r15
            r15 = r88
            e36 r15 = (defpackage.e36) r15
            r15.getClass()
            r23 = r5
            java.lang.String r5 = "SELECT * FROM workspec WHERE state=1"
            j36 r5 = r15.i0(r5)
            int r4 = defpackage.ej2.B(r5, r4)     // Catch: java.lang.Throwable -> L516
            int r3 = defpackage.ej2.B(r5, r3)     // Catch: java.lang.Throwable -> L516
            int r2 = defpackage.ej2.B(r5, r2)     // Catch: java.lang.Throwable -> L516
            int r1 = defpackage.ej2.B(r5, r1)     // Catch: java.lang.Throwable -> L516
            int r0 = defpackage.ej2.B(r5, r0)     // Catch: java.lang.Throwable -> L516
            int r6 = defpackage.ej2.B(r5, r6)     // Catch: java.lang.Throwable -> L516
            int r14 = defpackage.ej2.B(r5, r14)     // Catch: java.lang.Throwable -> L516
            int r13 = defpackage.ej2.B(r5, r13)     // Catch: java.lang.Throwable -> L516
            int r12 = defpackage.ej2.B(r5, r12)     // Catch: java.lang.Throwable -> L516
            int r11 = defpackage.ej2.B(r5, r11)     // Catch: java.lang.Throwable -> L516
            int r10 = defpackage.ej2.B(r5, r10)     // Catch: java.lang.Throwable -> L516
            int r9 = defpackage.ej2.B(r5, r9)     // Catch: java.lang.Throwable -> L516
            int r8 = defpackage.ej2.B(r5, r8)     // Catch: java.lang.Throwable -> L516
            int r7 = defpackage.ej2.B(r5, r7)     // Catch: java.lang.Throwable -> L516
            r15 = r23
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r87 = r15
            r15 = r22
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r88 = r15
            r15 = r19
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r19 = r15
            r15 = r18
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r18 = r15
            r15 = r17
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r17 = r15
            java.lang.String r15 = "next_schedule_time_override"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r22 = r15
            java.lang.String r15 = "next_schedule_time_override_generation"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r23 = r15
            java.lang.String r15 = "stop_reason"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r24 = r15
            java.lang.String r15 = "trace_tag"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r25 = r15
            java.lang.String r15 = "backoff_on_system_interruptions"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r26 = r15
            java.lang.String r15 = "required_network_type"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r27 = r15
            java.lang.String r15 = "required_network_request"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r28 = r15
            java.lang.String r15 = "requires_charging"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r29 = r15
            java.lang.String r15 = "requires_device_idle"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r30 = r15
            java.lang.String r15 = "requires_battery_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r31 = r15
            java.lang.String r15 = "requires_storage_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r32 = r15
            java.lang.String r15 = "trigger_content_update_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r33 = r15
            java.lang.String r15 = "trigger_max_content_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r34 = r15
            java.lang.String r15 = "content_uri_triggers"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L516
            r35 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L516
            r15.<init>()     // Catch: java.lang.Throwable -> L516
        L415:
            boolean r36 = r5.f0()     // Catch: java.lang.Throwable -> L516
            if (r36 == 0) goto L5ca
            java.lang.String r38 = r5.R(r4)     // Catch: java.lang.Throwable -> L516
            r71 = r7
            r36 = r8
            long r7 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L516
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L516
            iw7 r39 = defpackage.ds7.f(r7)     // Catch: java.lang.Throwable -> L516
            java.lang.String r40 = r5.R(r2)     // Catch: java.lang.Throwable -> L516
            java.lang.String r41 = r5.R(r1)     // Catch: java.lang.Throwable -> L516
            byte[] r7 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L516
            xb1 r8 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L516
            xb1 r42 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L516
            byte[] r7 = r5.getBlob(r6)     // Catch: java.lang.Throwable -> L516
            xb1 r43 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L516
            long r44 = r5.getLong(r14)     // Catch: java.lang.Throwable -> L516
            long r46 = r5.getLong(r13)     // Catch: java.lang.Throwable -> L516
            long r48 = r5.getLong(r12)     // Catch: java.lang.Throwable -> L516
            long r7 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L516
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L516
            r73 = r0
            r72 = r1
            long r0 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L516
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L516
            w10 r52 = defpackage.ds7.c(r0)     // Catch: java.lang.Throwable -> L516
            long r53 = r5.getLong(r9)     // Catch: java.lang.Throwable -> L516
            r0 = r36
            long r55 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            r1 = r71
            long r57 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            r8 = r87
            long r59 = r5.getLong(r8)     // Catch: java.lang.Throwable -> L516
            r36 = r0
            r71 = r1
            r87 = r2
            r0 = r88
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L516
            if (r1 == 0) goto L490
            r61 = r20
        L48b:
            r88 = r3
            r1 = r19
            goto L493
        L490:
            r61 = 0
            goto L48b
        L493:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L516
            oo4 r62 = defpackage.ds7.e(r2)     // Catch: java.lang.Throwable -> L516
            r3 = r0
            r19 = r1
            r2 = r18
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L516
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L516
            r18 = r2
            r1 = r17
            r17 = r3
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L516
            r3 = r22
            long r65 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L516
            r63 = r0
            r22 = r1
            r64 = r2
            r0 = r23
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L516
            r23 = r0
            r67 = r1
            r2 = r24
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L516
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L516
            r1 = r25
            boolean r24 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L516
            if (r24 == 0) goto L4de
            r69 = r21
        L4d9:
            r68 = r0
            r0 = r26
            goto L4e5
        L4de:
            java.lang.String r24 = r5.R(r1)     // Catch: java.lang.Throwable -> L516
            r69 = r24
            goto L4d9
        L4e5:
            boolean r24 = r5.isNull(r0)     // Catch: java.lang.Throwable -> L516
            if (r24 == 0) goto L4f2
            r25 = r1
            r24 = r2
            r1 = r21
            goto L4ff
        L4f2:
            r25 = r1
            r24 = r2
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L516
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L516
        L4ff:
            if (r1 == 0) goto L519
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L516
            if (r1 == 0) goto L50a
            r1 = r20
            goto L50b
        L50a:
            r1 = 0
        L50b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L516
            r70 = r1
        L511:
            r26 = r3
            r1 = r27
            goto L51c
        L516:
            r0 = move-exception
            goto L5ce
        L519:
            r70 = r21
            goto L511
        L51c:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L516
            kf4 r76 = defpackage.ds7.d(r2)     // Catch: java.lang.Throwable -> L516
            r2 = r28
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L516
            af4 r75 = defpackage.ds7.h(r3)     // Catch: java.lang.Throwable -> L516
            r27 = r0
            r28 = r1
            r3 = r29
            long r0 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L516
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L516
            if (r0 == 0) goto L543
            r77 = r20
        L53e:
            r29 = r2
            r0 = r30
            goto L546
        L543:
            r77 = 0
            goto L53e
        L546:
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L516
            if (r1 == 0) goto L554
            r78 = r20
        L54f:
            r30 = r3
            r1 = r31
            goto L557
        L554:
            r78 = 0
            goto L54f
        L557:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L516
            if (r2 == 0) goto L566
            r79 = r20
        L560:
            r3 = r0
            r31 = r1
            r2 = r32
            goto L569
        L566:
            r79 = 0
            goto L560
        L569:
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L516
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L516
            if (r0 == 0) goto L575
            r80 = r20
        L572:
            r0 = r33
            goto L578
        L575:
            r80 = 0
            goto L572
        L578:
            long r81 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L516
            r1 = r34
            long r83 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L516
            r33 = r0
            r0 = r35
            byte[] r32 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L516
            java.util.LinkedHashSet r85 = defpackage.ds7.a(r32)     // Catch: java.lang.Throwable -> L516
            p21 r50 = new p21     // Catch: java.lang.Throwable -> L516
            r74 = r50
            r74.<init>(r75, r76, r77, r78, r79, r80, r81, r83, r85)     // Catch: java.lang.Throwable -> L516
            r50 = r74
            yw7 r37 = new yw7     // Catch: java.lang.Throwable -> L516
            r51 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r55, r57, r59, r61, r62, r63, r64, r65, r67, r68, r69, r70)     // Catch: java.lang.Throwable -> L516
            r7 = r37
            r15.add(r7)     // Catch: java.lang.Throwable -> L516
            r7 = r3
            r3 = r88
            r88 = r17
            r17 = r22
            r22 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r7
            r35 = r0
            r34 = r1
            r32 = r2
            r7 = r71
            r1 = r72
            r0 = r73
            r2 = r87
            r87 = r8
            r8 = r36
            goto L415
        L5ca:
            r5.close()
            return r15
        L5ce:
            r5.close()
            throw r0
        L5d2:
            r86 = r15
            r15 = r6
            r6 = r86
            r5 = r88
            e36 r5 = (defpackage.e36) r5
            r5.getClass()
            r23 = r15
            java.lang.String r15 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"
            j36 r5 = r5.i0(r15)
            int r4 = defpackage.ej2.B(r5, r4)     // Catch: java.lang.Throwable -> L7bd
            int r3 = defpackage.ej2.B(r5, r3)     // Catch: java.lang.Throwable -> L7bd
            int r2 = defpackage.ej2.B(r5, r2)     // Catch: java.lang.Throwable -> L7bd
            int r1 = defpackage.ej2.B(r5, r1)     // Catch: java.lang.Throwable -> L7bd
            int r0 = defpackage.ej2.B(r5, r0)     // Catch: java.lang.Throwable -> L7bd
            int r6 = defpackage.ej2.B(r5, r6)     // Catch: java.lang.Throwable -> L7bd
            int r14 = defpackage.ej2.B(r5, r14)     // Catch: java.lang.Throwable -> L7bd
            int r13 = defpackage.ej2.B(r5, r13)     // Catch: java.lang.Throwable -> L7bd
            int r12 = defpackage.ej2.B(r5, r12)     // Catch: java.lang.Throwable -> L7bd
            int r11 = defpackage.ej2.B(r5, r11)     // Catch: java.lang.Throwable -> L7bd
            int r10 = defpackage.ej2.B(r5, r10)     // Catch: java.lang.Throwable -> L7bd
            int r9 = defpackage.ej2.B(r5, r9)     // Catch: java.lang.Throwable -> L7bd
            int r8 = defpackage.ej2.B(r5, r8)     // Catch: java.lang.Throwable -> L7bd
            int r7 = defpackage.ej2.B(r5, r7)     // Catch: java.lang.Throwable -> L7bd
            r15 = r23
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r87 = r15
            r15 = r22
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r88 = r15
            r15 = r19
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r19 = r15
            r15 = r18
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r18 = r15
            r15 = r17
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r17 = r15
            java.lang.String r15 = "next_schedule_time_override"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r22 = r15
            java.lang.String r15 = "next_schedule_time_override_generation"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r23 = r15
            java.lang.String r15 = "stop_reason"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r24 = r15
            java.lang.String r15 = "trace_tag"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r25 = r15
            java.lang.String r15 = "backoff_on_system_interruptions"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r26 = r15
            java.lang.String r15 = "required_network_type"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r27 = r15
            java.lang.String r15 = "required_network_request"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r28 = r15
            java.lang.String r15 = "requires_charging"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r29 = r15
            java.lang.String r15 = "requires_device_idle"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r30 = r15
            java.lang.String r15 = "requires_battery_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r31 = r15
            java.lang.String r15 = "requires_storage_not_low"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r32 = r15
            java.lang.String r15 = "trigger_content_update_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r33 = r15
            java.lang.String r15 = "trigger_max_content_delay"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r34 = r15
            java.lang.String r15 = "content_uri_triggers"
            int r15 = defpackage.ej2.B(r5, r15)     // Catch: java.lang.Throwable -> L7bd
            r35 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7bd
            r15.<init>()     // Catch: java.lang.Throwable -> L7bd
        L6bb:
            boolean r36 = r5.f0()     // Catch: java.lang.Throwable -> L7bd
            if (r36 == 0) goto L873
            java.lang.String r38 = r5.R(r4)     // Catch: java.lang.Throwable -> L7bd
            r71 = r7
            r36 = r8
            long r7 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L7bd
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L7bd
            iw7 r39 = defpackage.ds7.f(r7)     // Catch: java.lang.Throwable -> L7bd
            java.lang.String r40 = r5.R(r2)     // Catch: java.lang.Throwable -> L7bd
            java.lang.String r41 = r5.R(r1)     // Catch: java.lang.Throwable -> L7bd
            byte[] r7 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L7bd
            xb1 r8 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L7bd
            xb1 r42 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L7bd
            byte[] r7 = r5.getBlob(r6)     // Catch: java.lang.Throwable -> L7bd
            xb1 r43 = defpackage.u24.k(r7)     // Catch: java.lang.Throwable -> L7bd
            long r44 = r5.getLong(r14)     // Catch: java.lang.Throwable -> L7bd
            long r46 = r5.getLong(r13)     // Catch: java.lang.Throwable -> L7bd
            long r48 = r5.getLong(r12)     // Catch: java.lang.Throwable -> L7bd
            long r7 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L7bd
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L7bd
            r72 = r0
            r8 = r1
            long r0 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L7bd
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L7bd
            w10 r52 = defpackage.ds7.c(r0)     // Catch: java.lang.Throwable -> L7bd
            long r53 = r5.getLong(r9)     // Catch: java.lang.Throwable -> L7bd
            r0 = r36
            long r55 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            r1 = r71
            long r57 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            r36 = r0
            r0 = r87
            long r59 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            r87 = r0
            r71 = r1
            r0 = r88
            r88 = r2
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L7bd
            if (r1 == 0) goto L737
            r61 = r20
        L732:
            r1 = r19
            r19 = r3
            goto L73a
        L737:
            r61 = 0
            goto L732
        L73a:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L7bd
            oo4 r62 = defpackage.ds7.e(r2)     // Catch: java.lang.Throwable -> L7bd
            r3 = r0
            r2 = r18
            r18 = r1
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L7bd
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L7bd
            r73 = r3
            r1 = r17
            r17 = r2
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L7bd
            r3 = r22
            long r65 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L7bd
            r63 = r0
            r22 = r1
            r64 = r2
            r0 = r23
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L7bd
            r23 = r0
            r67 = r1
            r2 = r24
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L7bd
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L7bd
            r1 = r25
            boolean r24 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L7bd
            if (r24 == 0) goto L785
            r69 = r21
        L780:
            r68 = r0
            r0 = r26
            goto L78c
        L785:
            java.lang.String r24 = r5.R(r1)     // Catch: java.lang.Throwable -> L7bd
            r69 = r24
            goto L780
        L78c:
            boolean r24 = r5.isNull(r0)     // Catch: java.lang.Throwable -> L7bd
            if (r24 == 0) goto L799
            r25 = r1
            r24 = r2
            r1 = r21
            goto L7a6
        L799:
            r25 = r1
            r24 = r2
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L7bd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L7bd
        L7a6:
            if (r1 == 0) goto L7c0
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L7bd
            if (r1 == 0) goto L7b1
            r1 = r20
            goto L7b2
        L7b1:
            r1 = 0
        L7b2:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L7bd
            r70 = r1
        L7b8:
            r26 = r3
            r1 = r27
            goto L7c3
        L7bd:
            r0 = move-exception
            goto L877
        L7c0:
            r70 = r21
            goto L7b8
        L7c3:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L7bd
            kf4 r76 = defpackage.ds7.d(r2)     // Catch: java.lang.Throwable -> L7bd
            r2 = r28
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L7bd
            af4 r75 = defpackage.ds7.h(r3)     // Catch: java.lang.Throwable -> L7bd
            r27 = r0
            r28 = r1
            r3 = r29
            long r0 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L7bd
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L7bd
            if (r0 == 0) goto L7ea
            r77 = r20
        L7e5:
            r29 = r2
            r0 = r30
            goto L7ed
        L7ea:
            r77 = 0
            goto L7e5
        L7ed:
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L7bd
            if (r1 == 0) goto L7fb
            r78 = r20
        L7f6:
            r30 = r3
            r1 = r31
            goto L7fe
        L7fb:
            r78 = 0
            goto L7f6
        L7fe:
            long r2 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L7bd
            if (r2 == 0) goto L80d
            r79 = r20
        L807:
            r3 = r0
            r31 = r1
            r2 = r32
            goto L810
        L80d:
            r79 = 0
            goto L807
        L810:
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L7bd
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L7bd
            if (r0 == 0) goto L81c
            r80 = r20
        L819:
            r0 = r33
            goto L81f
        L81c:
            r80 = 0
            goto L819
        L81f:
            long r81 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L7bd
            r1 = r34
            long r83 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L7bd
            r33 = r0
            r0 = r35
            byte[] r32 = r5.getBlob(r0)     // Catch: java.lang.Throwable -> L7bd
            java.util.LinkedHashSet r85 = defpackage.ds7.a(r32)     // Catch: java.lang.Throwable -> L7bd
            p21 r50 = new p21     // Catch: java.lang.Throwable -> L7bd
            r74 = r50
            r74.<init>(r75, r76, r77, r78, r79, r80, r81, r83, r85)     // Catch: java.lang.Throwable -> L7bd
            r50 = r74
            yw7 r37 = new yw7     // Catch: java.lang.Throwable -> L7bd
            r51 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r55, r57, r59, r61, r62, r63, r64, r65, r67, r68, r69, r70)     // Catch: java.lang.Throwable -> L7bd
            r7 = r37
            r15.add(r7)     // Catch: java.lang.Throwable -> L7bd
            r7 = r30
            r30 = r3
            r3 = r19
            r19 = r18
            r18 = r17
            r17 = r22
            r22 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r7
            r35 = r0
            r34 = r1
            r32 = r2
            r1 = r8
            r8 = r36
            r7 = r71
            r0 = r72
            r2 = r88
            r88 = r73
            goto L6bb
        L873:
            r5.close()
            return r15
        L877:
            r5.close()
            throw r0
        L87b:
            r0 = r88
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM WorkProgress"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L891
            r1.close()
            jg7 r0 = defpackage.jg7.a
            return r0
        L891:
            r0 = move-exception
            r1.close()
            throw r0
        L896:
            r0 = r88
            k11 r0 = (defpackage.k11) r0
            r0.getClass()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
        L8a6:
            r0 = r88
            nv7 r0 = (defpackage.nv7) r0
            r0.getClass()
            return r0
        L8ae:
            r0 = r88
            dv7 r0 = (defpackage.dv7) r0
            bn r0 = r0.e
            return r0
        L8b5:
            r0 = r88
            dv7 r0 = (defpackage.dv7) r0
            bn r0 = r0.f
            return r0
        L8bc:
            r0 = r88
            dv7 r0 = (defpackage.dv7) r0
            bn r0 = r0.b
            return r0
        L8c3:
            r0 = r88
            dv7 r0 = (defpackage.dv7) r0
            bn r0 = r0.g
            return r0
        L8ca:
            r0 = r88
            dv7 r0 = (defpackage.dv7) r0
            ig7 r0 = r0.l
            return r0
        L8d1:
            r0 = r88
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            jg7 r0 = defpackage.jg7.a
            return r0
        L8db:
            r1 = r88
            no1 r1 = (defpackage.no1) r1
            r1.getClass()
            long r2 = r1.e()
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r11
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 1103101952(0x41c00000, float:24.0)
            float r0 = r0 / r2
            r3 = 1099956224(0x41900000, float:18.0)
            float r13 = r0 * r3
            r3 = 1093664768(0x41300000, float:11.0)
            float r14 = r0 * r3
            r3 = 1077097267(0x40333333, float:2.8)
            float r3 = r3 * r0
            int r4 = java.lang.Float.floatToRawIntBits(r3)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            r15 = 32
            long r3 = r4 << r15
            long r5 = r6 & r11
            long r7 = r3 | r5
            r3 = 4278248959(0xff00e5ff, double:2.113735835E-314)
            long r3 = defpackage.hv.c(r3)
            kt0 r5 = new kt0
            r5.<init>(r3)
            r3 = 4278216447(0xff0066ff, double:2.113719772E-314)
            long r9 = defpackage.hv.c(r3)
            kt0 r6 = new kt0
            r6.<init>(r9)
            kt0[] r5 = new defpackage.kt0[]{r5, r6}
            java.util.List r5 = defpackage.hf.c0(r5)
            r16 = 0
            int r6 = java.lang.Float.floatToRawIntBits(r16)
            long r9 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r16)
            r87 = r2
            r17 = r3
            long r2 = (long) r6
            long r9 = r9 << r15
            long r2 = r2 & r11
            long r2 = r2 | r9
            int r4 = java.lang.Float.floatToRawIntBits(r13)
            long r9 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r14)
            r19 = r11
            long r11 = (long) r4
            long r9 = r9 << r15
            long r11 = r11 & r19
            long r9 = r9 | r11
            bv3 r2 = defpackage.d90.l(r5, r2, r9)
            long r3 = defpackage.hv.c(r17)
            kt0 r5 = new kt0
            r5.<init>(r3)
            r3 = 4286262463(0xff7b2cbf, double:2.117695032E-314)
            long r3 = defpackage.hv.c(r3)
            kt0 r6 = new kt0
            r6.<init>(r3)
            kt0[] r3 = new defpackage.kt0[]{r5, r6}
            java.util.List r3 = defpackage.hf.c0(r3)
            r4 = 1095761920(0x41500000, float:13.0)
            float r11 = r0 * r4
            int r4 = java.lang.Float.floatToRawIntBits(r16)
            long r4 = (long) r4
            int r6 = java.lang.Float.floatToRawIntBits(r11)
            long r9 = (long) r6
            long r4 = r4 << r15
            long r9 = r9 & r19
            long r4 = r4 | r9
            float r6 = r0 * r87
            int r9 = java.lang.Float.floatToRawIntBits(r13)
            long r9 = (long) r9
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r88 = r0
            r87 = r1
            long r0 = (long) r6
            long r9 = r9 << r15
            long r0 = r0 & r19
            long r0 = r0 | r9
            bv3 r0 = defpackage.d90.l(r3, r4, r0)
            int r1 = java.lang.Float.floatToRawIntBits(r13)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r14)
            long r5 = (long) r1
            long r3 = r3 << r15
            long r5 = r5 & r19
            long r5 = r5 | r3
            r9 = 0
            r10 = 240(0xf0, float:3.36E-43)
            r3 = 0
            r1 = r87
            defpackage.no1.E0(r1, r2, r3, r5, r7, r9, r10)
            int r2 = java.lang.Float.floatToRawIntBits(r16)
            long r2 = (long) r2
            int r4 = java.lang.Float.floatToRawIntBits(r11)
            long r4 = (long) r4
            long r2 = r2 << r15
            long r4 = r4 & r19
            long r3 = r2 | r4
            int r2 = java.lang.Float.floatToRawIntBits(r13)
            long r5 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r14)
            long r9 = (long) r2
            long r5 = r5 << r15
            long r9 = r9 & r19
            long r5 = r5 | r9
            r9 = 0
            r10 = 240(0xf0, float:3.36E-43)
            r2 = r0
            defpackage.no1.E0(r1, r2, r3, r5, r7, r9, r10)
            hj r2 = defpackage.lj.a()
            r0 = 1093140480(0x41280000, float:10.5)
            float r0 = r0 * r88
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r88
            android.graphics.Path r4 = r2.a
            r4.moveTo(r0, r3)
            r3 = 1085276160(0x40b00000, float:5.5)
            float r3 = r3 * r88
            r5 = 1094189056(0x41380000, float:11.5)
            float r5 = r5 * r88
            r2.e(r3, r5)
            r3 = 1092091904(0x41180000, float:9.5)
            float r3 = r3 * r88
            r2.e(r3, r5)
            r5 = 1087373312(0x40d00000, float:6.5)
            float r5 = r5 * r88
            r6 = 1102315520(0x41b40000, float:22.5)
            float r6 = r6 * r88
            r2.e(r5, r6)
            r5 = 1096286208(0x41580000, float:13.5)
            float r5 = r5 * r88
            r2.e(r5, r0)
            r2.e(r3, r0)
            r4.close()
            long r3 = defpackage.kt0.d
            r6 = 0
            r7 = 60
            r5 = 0
            defpackage.no1.B0(r1, r2, r3, r5, r6, r7)
            jg7 r0 = defpackage.jg7.a
            return r0
        La29:
            r0 = r88
            zq7 r0 = (defpackage.zq7) r0
            r0.getClass()
            java.lang.String r0 = r0.a
            return r0
        La33:
            r0 = r88
            hm4 r0 = (defpackage.hm4) r0
            r0.getClass()
            java.lang.String r0 = r0.a
            return r0
        La3d:
            r0 = r88
            java.io.File r0 = (java.io.File) r0
            java.lang.String r0 = defpackage.jc2.y0(r0)
            java.lang.String r1 = "slangp"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        La50:
            r0 = r88
            wo r0 = (defpackage.wo) r0
            float r0 = r0.a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        La5b:
            r0 = r88
            zo r0 = (defpackage.zo) r0
            of5 r1 = new of5
            float r2 = r0.a
            float r3 = r0.b
            float r4 = r0.c
            float r0 = r0.d
            r1.<init>(r2, r3, r4, r0)
            return r1
    }
}
