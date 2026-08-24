package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mr3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    public /* synthetic */ mr3(int r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ mr3(defpackage.pr3 r1, int r2) {
            r0 = this;
            r1 = 0
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r84) {
            r83 = this;
            r0 = r83
            int r1 = r0.A
            int r0 = r0.B
            switch(r1) {
                case 0: goto L2cb;
                default: goto L9;
            }
        L9:
            r1 = r84
            e36 r1 = (defpackage.e36) r1
            r1.getClass()
            java.lang.String r4 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))"
            j36 r1 = r1.i0(r4)
            long r4 = (long) r0
            r0 = 1
            r1.c(r0, r4)     // Catch: java.lang.Throwable -> L202
            java.lang.String r4 = "id"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L202
            java.lang.String r5 = "state"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L202
            java.lang.String r6 = "worker_class_name"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L202
            java.lang.String r7 = "input_merger_class_name"
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L202
            java.lang.String r8 = "input"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L202
            java.lang.String r9 = "output"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L202
            java.lang.String r10 = "initial_delay"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L202
            java.lang.String r11 = "interval_duration"
            int r11 = defpackage.ej2.B(r1, r11)     // Catch: java.lang.Throwable -> L202
            java.lang.String r12 = "flex_duration"
            int r12 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L202
            java.lang.String r13 = "run_attempt_count"
            int r13 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L202
            java.lang.String r14 = "backoff_policy"
            int r14 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L202
            java.lang.String r15 = "backoff_delay_duration"
            int r15 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L202
            java.lang.String r0 = "last_enqueue_time"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L202
            java.lang.String r2 = "minimum_retention_duration"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L202
            java.lang.String r3 = "schedule_requested_at"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r84 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r16 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r17 = r3
            java.lang.String r3 = "period_count"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r18 = r3
            java.lang.String r3 = "generation"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r19 = r3
            java.lang.String r3 = "next_schedule_time_override"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r20 = r3
            java.lang.String r3 = "next_schedule_time_override_generation"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r21 = r3
            java.lang.String r3 = "stop_reason"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r22 = r3
            java.lang.String r3 = "trace_tag"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r23 = r3
            java.lang.String r3 = "backoff_on_system_interruptions"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r24 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r25 = r3
            java.lang.String r3 = "required_network_request"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r26 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r27 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r28 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r29 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r30 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r31 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r32 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L202
            r33 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L202
            r3.<init>()     // Catch: java.lang.Throwable -> L202
        L10c:
            boolean r34 = r1.f0()     // Catch: java.lang.Throwable -> L202
            if (r34 == 0) goto L2c0
            java.lang.String r36 = r1.R(r4)     // Catch: java.lang.Throwable -> L202
            r69 = r3
            r34 = r4
            long r3 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            iw7 r37 = defpackage.ds7.f(r3)     // Catch: java.lang.Throwable -> L202
            java.lang.String r38 = r1.R(r6)     // Catch: java.lang.Throwable -> L202
            java.lang.String r39 = r1.R(r7)     // Catch: java.lang.Throwable -> L202
            byte[] r3 = r1.getBlob(r8)     // Catch: java.lang.Throwable -> L202
            xb1 r4 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L202
            xb1 r40 = defpackage.u24.k(r3)     // Catch: java.lang.Throwable -> L202
            byte[] r3 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L202
            xb1 r41 = defpackage.u24.k(r3)     // Catch: java.lang.Throwable -> L202
            long r42 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L202
            long r44 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L202
            long r46 = r1.getLong(r12)     // Catch: java.lang.Throwable -> L202
            long r3 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            r49 = r3
            long r3 = r1.getLong(r14)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            w10 r50 = defpackage.ds7.c(r3)     // Catch: java.lang.Throwable -> L202
            long r51 = r1.getLong(r15)     // Catch: java.lang.Throwable -> L202
            long r53 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L202
            long r55 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L202
            r3 = r84
            long r57 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            r84 = r2
            r4 = r16
            r16 = r3
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            if (r2 == 0) goto L17f
            r59 = 1
        L17a:
            r2 = r17
            r17 = r4
            goto L182
        L17f:
            r59 = 0
            goto L17a
        L182:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            oo4 r60 = defpackage.ds7.e(r3)     // Catch: java.lang.Throwable -> L202
            r3 = r18
            r18 = r5
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L202
            r70 = r3
            r5 = r19
            r19 = r2
            long r2 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            r3 = r20
            long r63 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            r20 = r0
            r62 = r2
            r0 = r21
            r21 = r3
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            r61 = r4
            r3 = r22
            r22 = r5
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L202
            r5 = r23
            boolean r23 = r1.isNull(r5)     // Catch: java.lang.Throwable -> L202
            if (r23 == 0) goto L1cc
            r67 = 0
        L1c7:
            r23 = r0
            r0 = r24
            goto L1d3
        L1cc:
            java.lang.String r23 = r1.R(r5)     // Catch: java.lang.Throwable -> L202
            r67 = r23
            goto L1c7
        L1d3:
            boolean r24 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L202
            if (r24 == 0) goto L1df
            r65 = r2
            r24 = r3
            r2 = 0
            goto L1ec
        L1df:
            r65 = r2
            r24 = r3
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L202
        L1ec:
            if (r2 == 0) goto L207
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L202
            if (r2 == 0) goto L1f6
            r2 = 1
            goto L1f7
        L1f6:
            r2 = 0
        L1f7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L202
            r68 = r2
        L1fd:
            r66 = r4
            r2 = r25
            goto L20a
        L202:
            r0 = move-exception
            r31 = r1
            goto L2c7
        L207:
            r68 = 0
            goto L1fd
        L20a:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            kf4 r73 = defpackage.ds7.d(r3)     // Catch: java.lang.Throwable -> L202
            r3 = r26
            byte[] r4 = r1.getBlob(r3)     // Catch: java.lang.Throwable -> L202
            af4 r72 = defpackage.ds7.h(r4)     // Catch: java.lang.Throwable -> L202
            r25 = r2
            r26 = r3
            r4 = r27
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            if (r2 == 0) goto L231
            r74 = 1
        L22c:
            r27 = r4
            r2 = r28
            goto L234
        L231:
            r74 = 0
            goto L22c
        L234:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L202
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L202
            if (r3 == 0) goto L242
            r75 = 1
        L23d:
            r28 = r5
            r3 = r29
            goto L245
        L242:
            r75 = 0
            goto L23d
        L245:
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L202
            if (r4 == 0) goto L254
            r76 = 1
        L24e:
            r5 = r2
            r29 = r3
            r4 = r30
            goto L257
        L254:
            r76 = 0
            goto L24e
        L257:
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L202
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L202
            if (r2 == 0) goto L263
            r77 = 1
        L260:
            r2 = r31
            goto L266
        L263:
            r77 = 0
            goto L260
        L266:
            long r78 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L202
            r3 = r32
            long r80 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L202
            r30 = r0
            r0 = r33
            byte[] r31 = r1.getBlob(r0)     // Catch: java.lang.Throwable -> L202
            java.util.LinkedHashSet r82 = defpackage.ds7.a(r31)     // Catch: java.lang.Throwable -> L202
            p21 r48 = new p21     // Catch: java.lang.Throwable -> L202
            r71 = r48
            r71.<init>(r72, r73, r74, r75, r76, r77, r78, r80, r82)     // Catch: java.lang.Throwable -> L202
            r48 = r71
            yw7 r35 = new yw7     // Catch: java.lang.Throwable -> L202
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r67, r68)     // Catch: java.lang.Throwable -> L202
            r33 = r0
            r0 = r35
            r31 = r1
            r1 = r69
            r1.add(r0)     // Catch: java.lang.Throwable -> L2be
            r32 = r3
            r0 = r20
            r20 = r21
            r21 = r23
            r23 = r28
            r3 = r1
            r28 = r5
            r5 = r18
            r1 = r31
            r18 = r70
            r31 = r2
            r2 = r84
            r84 = r16
            r16 = r17
            r17 = r19
            r19 = r22
            r22 = r24
            r24 = r30
            r30 = r4
            r4 = r34
            goto L10c
        L2be:
            r0 = move-exception
            goto L2c7
        L2c0:
            r31 = r1
            r1 = r3
            r31.close()
            return r1
        L2c7:
            r31.close()
            throw r0
        L2cb:
            r1 = r84
            nq3 r1 = (defpackage.nq3) r1
            vl6 r2 = defpackage.ln2.t()
            if (r2 == 0) goto L2da
            qn2 r3 = r2.e()
            goto L2db
        L2da:
            r3 = 0
        L2db:
            vl6 r4 = defpackage.ln2.N(r2)
            defpackage.ln2.V(r2, r4, r3)
            int r2 = r1.a
            r3 = -1
            if (r2 != r3) goto L2e8
            r2 = 2
        L2e8:
            r3 = 0
        L2e9:
            if (r3 >= r2) goto L2f3
            int r4 = r0 + r3
            r1.a(r4)
            int r3 = r3 + 1
            goto L2e9
        L2f3:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
