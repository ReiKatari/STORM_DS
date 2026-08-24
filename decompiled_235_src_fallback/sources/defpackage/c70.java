package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c70  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c70 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;

    public /* synthetic */ c70(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r83) {
            r82 = this;
            r0 = r82
            int r1 = r0.A
            r2 = 5
            java.lang.String r3 = "game_checksum"
            java.lang.String r4 = "game_code"
            java.lang.String r5 = "name"
            java.lang.String r6 = "id"
            jg7 r8 = defpackage.jg7.a
            r9 = 0
            r10 = 1
            java.lang.String r11 = r0.B
            switch(r1) {
                case 0: goto L767;
                case 1: goto L74a;
                case 2: goto L719;
                case 3: goto L6ea;
                case 4: goto L6ba;
                case 5: goto L692;
                case 6: goto L66b;
                case 7: goto L616;
                case 8: goto L5c1;
                case 9: goto L56c;
                case 10: goto L517;
                case 11: goto L50c;
                case 12: goto L4d9;
                case 13: goto L48b;
                case 14: goto L44f;
                case 15: goto L430;
                case 16: goto L413;
                case 17: goto L407;
                case 18: goto L3fc;
                case 19: goto L3cd;
                case 20: goto L3b0;
                case 21: goto L158;
                case 22: goto L11a;
                case 23: goto Led;
                case 24: goto Lc9;
                case 25: goto La5;
                case 26: goto L89;
                case 27: goto L56;
                case 28: goto L32;
                default: goto L16;
            }
        L16:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM workspec WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L2d
            r1.f0()     // Catch: java.lang.Throwable -> L2d
            r1.close()
            return r8
        L2d:
            r0 = move-exception
            r1.close()
            throw r0
        L32:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L51
            r1.f0()     // Catch: java.lang.Throwable -> L51
            int r0 = defpackage.oi2.D(r0)     // Catch: java.lang.Throwable -> L51
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L51:
            r0 = move-exception
            r1.close()
            throw r0
        L56:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
        L6b:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L81
            byte[] r2 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L7f
            xb1 r3 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L7f
            xb1 r2 = defpackage.u24.k(r2)     // Catch: java.lang.Throwable -> L7f
            r0.add(r2)     // Catch: java.lang.Throwable -> L7f
            goto L6b
        L7f:
            r0 = move-exception
            goto L85
        L81:
            r1.close()
            return r0
        L85:
            r1.close()
            throw r0
        L89:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE workspec SET period_count=period_count+1 WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> La0
            r1.f0()     // Catch: java.lang.Throwable -> La0
            r1.close()
            return r8
        La0:
            r0 = move-exception
            r1.close()
            throw r0
        La5:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE workspec SET run_attempt_count=0 WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> Lc4
            r1.f0()     // Catch: java.lang.Throwable -> Lc4
            int r0 = defpackage.oi2.D(r0)     // Catch: java.lang.Throwable -> Lc4
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Lc4:
            r0 = move-exception
            r1.close()
            throw r0
        Lc9:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> Le8
            r1.f0()     // Catch: java.lang.Throwable -> Le8
            int r0 = defpackage.oi2.D(r0)     // Catch: java.lang.Throwable -> Le8
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Le8:
            r0 = move-exception
            r1.close()
            throw r0
        Led:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L110
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L110
            r0.<init>()     // Catch: java.lang.Throwable -> L110
        L102:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L110
            if (r2 == 0) goto L112
            java.lang.String r2 = r1.R(r9)     // Catch: java.lang.Throwable -> L110
            r0.add(r2)     // Catch: java.lang.Throwable -> L110
            goto L102
        L110:
            r0 = move-exception
            goto L116
        L112:
            r1.close()
            return r0
        L116:
            r1.close()
            throw r0
        L11a:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT state FROM workspec WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L14e
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L14e
            if (r0 == 0) goto L143
            boolean r0 = r1.isNull(r9)     // Catch: java.lang.Throwable -> L14e
            if (r0 == 0) goto L138
            r0 = 0
            goto L141
        L138:
            long r2 = r1.getLong(r9)     // Catch: java.lang.Throwable -> L14e
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L14e
        L141:
            if (r0 != 0) goto L145
        L143:
            r7 = 0
            goto L150
        L145:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L14e
            iw7 r7 = defpackage.ds7.f(r0)     // Catch: java.lang.Throwable -> L14e
            goto L150
        L14e:
            r0 = move-exception
            goto L154
        L150:
            r1.close()
            return r7
        L154:
            r1.close()
            throw r0
        L158:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM workspec WHERE id=?"
            j36 r1 = r0.i0(r1)
            r1.w(r10, r11)     // Catch: java.lang.Throwable -> L321
            int r0 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L321
            java.lang.String r2 = "state"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L321
            java.lang.String r3 = "worker_class_name"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L321
            java.lang.String r4 = "input_merger_class_name"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L321
            java.lang.String r5 = "input"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L321
            java.lang.String r6 = "output"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L321
            java.lang.String r8 = "initial_delay"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L321
            java.lang.String r11 = "interval_duration"
            int r11 = defpackage.ej2.B(r1, r11)     // Catch: java.lang.Throwable -> L321
            java.lang.String r12 = "flex_duration"
            int r12 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L321
            java.lang.String r13 = "run_attempt_count"
            int r13 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L321
            java.lang.String r14 = "backoff_policy"
            int r14 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L321
            java.lang.String r15 = "backoff_delay_duration"
            int r15 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L321
            java.lang.String r7 = "last_enqueue_time"
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L321
            java.lang.String r9 = "minimum_retention_duration"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L321
            java.lang.String r10 = "schedule_requested_at"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r82 = r10
            java.lang.String r10 = "run_in_foreground"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r83 = r10
            java.lang.String r10 = "out_of_quota_policy"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r19 = r10
            java.lang.String r10 = "period_count"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r20 = r10
            java.lang.String r10 = "generation"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r21 = r10
            java.lang.String r10 = "next_schedule_time_override"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r22 = r10
            java.lang.String r10 = "next_schedule_time_override_generation"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r23 = r10
            java.lang.String r10 = "stop_reason"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r24 = r10
            java.lang.String r10 = "trace_tag"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r25 = r10
            java.lang.String r10 = "backoff_on_system_interruptions"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r26 = r10
            java.lang.String r10 = "required_network_type"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r27 = r10
            java.lang.String r10 = "required_network_request"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r28 = r10
            java.lang.String r10 = "requires_charging"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r29 = r10
            java.lang.String r10 = "requires_device_idle"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r30 = r10
            java.lang.String r10 = "requires_battery_not_low"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r31 = r10
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r32 = r10
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r33 = r10
            java.lang.String r10 = "trigger_max_content_delay"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            r34 = r10
            java.lang.String r10 = "content_uri_triggers"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L321
            boolean r35 = r1.f0()     // Catch: java.lang.Throwable -> L321
            if (r35 == 0) goto L3a7
            java.lang.String r37 = r1.R(r0)     // Catch: java.lang.Throwable -> L321
            r0 = r9
            r35 = r10
            long r9 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L321
            int r2 = (int) r9     // Catch: java.lang.Throwable -> L321
            iw7 r38 = defpackage.ds7.f(r2)     // Catch: java.lang.Throwable -> L321
            java.lang.String r39 = r1.R(r3)     // Catch: java.lang.Throwable -> L321
            java.lang.String r40 = r1.R(r4)     // Catch: java.lang.Throwable -> L321
            byte[] r2 = r1.getBlob(r5)     // Catch: java.lang.Throwable -> L321
            xb1 r3 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L321
            xb1 r41 = defpackage.u24.k(r2)     // Catch: java.lang.Throwable -> L321
            byte[] r2 = r1.getBlob(r6)     // Catch: java.lang.Throwable -> L321
            xb1 r42 = defpackage.u24.k(r2)     // Catch: java.lang.Throwable -> L321
            long r43 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L321
            long r45 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L321
            long r47 = r1.getLong(r12)     // Catch: java.lang.Throwable -> L321
            long r2 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L321
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L321
            long r3 = r1.getLong(r14)     // Catch: java.lang.Throwable -> L321
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L321
            w10 r51 = defpackage.ds7.c(r3)     // Catch: java.lang.Throwable -> L321
            long r52 = r1.getLong(r15)     // Catch: java.lang.Throwable -> L321
            long r54 = r1.getLong(r7)     // Catch: java.lang.Throwable -> L321
            long r56 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L321
            r0 = r82
            long r58 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L321
            r0 = r83
            long r3 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L321
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L321
            if (r0 == 0) goto L2ba
            r60 = 1
        L2b7:
            r0 = r19
            goto L2bd
        L2ba:
            r60 = 0
            goto L2b7
        L2bd:
            long r3 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L321
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L321
            oo4 r61 = defpackage.ds7.e(r0)     // Catch: java.lang.Throwable -> L321
            r0 = r20
            long r3 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L321
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L321
            r3 = r21
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L321
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L321
            r4 = r22
            long r64 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L321
            r4 = r23
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L321
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L321
            r5 = r24
            long r5 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L321
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L321
            r6 = r25
            boolean r7 = r1.isNull(r6)     // Catch: java.lang.Throwable -> L321
            if (r7 == 0) goto L2f5
            r68 = 0
        L2f2:
            r6 = r26
            goto L2fc
        L2f5:
            java.lang.String r6 = r1.R(r6)     // Catch: java.lang.Throwable -> L321
            r68 = r6
            goto L2f2
        L2fc:
            boolean r7 = r1.isNull(r6)     // Catch: java.lang.Throwable -> L321
            if (r7 == 0) goto L304
            r6 = 0
            goto L30d
        L304:
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L321
        L30d:
            if (r6 == 0) goto L324
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L321
            if (r6 == 0) goto L317
            r6 = 1
            goto L318
        L317:
            r6 = 0
        L318:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L321
            r69 = r7
        L31e:
            r6 = r27
            goto L327
        L321:
            r0 = move-exception
            goto L3ac
        L324:
            r69 = 0
            goto L31e
        L327:
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            kf4 r72 = defpackage.ds7.d(r6)     // Catch: java.lang.Throwable -> L321
            r6 = r28
            byte[] r6 = r1.getBlob(r6)     // Catch: java.lang.Throwable -> L321
            af4 r71 = defpackage.ds7.h(r6)     // Catch: java.lang.Throwable -> L321
            r6 = r29
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            if (r6 == 0) goto L348
            r73 = 1
        L345:
            r6 = r30
            goto L34b
        L348:
            r73 = 0
            goto L345
        L34b:
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            if (r6 == 0) goto L357
            r74 = 1
        L354:
            r6 = r31
            goto L35a
        L357:
            r74 = 0
            goto L354
        L35a:
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            if (r6 == 0) goto L366
            r75 = 1
        L363:
            r6 = r32
            goto L369
        L366:
            r75 = 0
            goto L363
        L369:
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L321
            if (r6 == 0) goto L375
            r76 = 1
        L372:
            r6 = r33
            goto L378
        L375:
            r76 = 0
            goto L372
        L378:
            long r77 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            r6 = r34
            long r79 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L321
            r6 = r35
            byte[] r6 = r1.getBlob(r6)     // Catch: java.lang.Throwable -> L321
            java.util.LinkedHashSet r81 = defpackage.ds7.a(r6)     // Catch: java.lang.Throwable -> L321
            p21 r49 = new p21     // Catch: java.lang.Throwable -> L321
            r70 = r49
            r70.<init>(r71, r72, r73, r74, r75, r76, r77, r79, r81)     // Catch: java.lang.Throwable -> L321
            r49 = r70
            yw7 r36 = new yw7     // Catch: java.lang.Throwable -> L321
            r62 = r0
            r50 = r2
            r63 = r3
            r66 = r4
            r67 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r50, r51, r52, r54, r56, r58, r60, r61, r62, r63, r64, r66, r67, r68, r69)     // Catch: java.lang.Throwable -> L321
            r7 = r36
            goto L3a8
        L3a7:
            r7 = 0
        L3a8:
            r1.close()
            return r7
        L3ac:
            r1.close()
            throw r0
        L3b0:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE from WorkProgress where work_spec_id=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L3c8
            r1.f0()     // Catch: java.lang.Throwable -> L3c8
            r1.close()
            return r8
        L3c8:
            r0 = move-exception
            r1.close()
            throw r0
        L3cd:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT name FROM workname WHERE work_spec_id=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L3f2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f2
            r0.<init>()     // Catch: java.lang.Throwable -> L3f2
        L3e3:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L3f2
            if (r2 == 0) goto L3f4
            r2 = 0
            java.lang.String r3 = r1.R(r2)     // Catch: java.lang.Throwable -> L3f2
            r0.add(r3)     // Catch: java.lang.Throwable -> L3f2
            goto L3e3
        L3f2:
            r0 = move-exception
            goto L3f8
        L3f4:
            r1.close()
            return r0
        L3f8:
            r1.close()
            throw r0
        L3fc:
            r0 = r83
            gb6 r0 = (defpackage.gb6) r0
            defpackage.eb6.b(r0, r11)
            defpackage.eb6.d(r0, r2)
            return r8
        L407:
            r0 = r83
            gb6 r0 = (defpackage.gb6) r0
            fg3[] r1 = defpackage.eb6.a
            fb6 r1 = defpackage.bb6.M
            r0.a(r1, r11)
            return r8
        L413:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM SystemIdInfo where work_spec_id=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L42b
            r1.f0()     // Catch: java.lang.Throwable -> L42b
            r1.close()
            return r8
        L42b:
            r0 = move-exception
            r1.close()
            throw r0
        L430:
            r0 = r83
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 == 0) goto L44a
            int r1 = r0.length()
            int r2 = r11.length()
            if (r1 >= r2) goto L448
            goto L44e
        L448:
            r11 = r0
            goto L44e
        L44a:
            java.lang.String r11 = r11.concat(r0)
        L44e:
            return r11
        L44f:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_game_hash_library WHERE game_hash = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L480
            java.lang.String r0 = "game_hash"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L480
            java.lang.String r2 = "game_id"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L480
            boolean r3 = r1.f0()     // Catch: java.lang.Throwable -> L480
            if (r3 == 0) goto L482
            java.lang.String r0 = r1.R(r0)     // Catch: java.lang.Throwable -> L480
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L480
            fa5 r7 = new fa5     // Catch: java.lang.Throwable -> L480
            r7.<init>(r0, r2)     // Catch: java.lang.Throwable -> L480
            goto L483
        L480:
            r0 = move-exception
            goto L487
        L482:
            r7 = 0
        L483:
            r1.close()
            return r7
        L487:
            r1.close()
            throw r0
        L48b:
            r0 = r83
            pq5 r0 = (defpackage.pq5) r0
            o41 r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a
            r0.getClass()
            if (r11 == 0) goto L4d3
            java.lang.String r1 = r0.a
            java.util.Locale r2 = java.util.Locale.US
            r2.getClass()
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            r3 = 0
            boolean r1 = defpackage.qs6.j0(r1, r11, r3)
            if (r1 != 0) goto L4d3
            java.lang.String r1 = r0.c
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            boolean r1 = defpackage.qs6.j0(r1, r11, r3)
            if (r1 != 0) goto L4d3
            android.net.Uri r0 = r0.d
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.getClass()
            boolean r0 = defpackage.qs6.j0(r0, r11, r3)
            if (r0 == 0) goto L4d1
            goto L4d3
        L4d1:
            r9 = 0
            goto L4d4
        L4d3:
            r9 = 1
        L4d4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L4d9:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT long_value FROM Preference where `key`=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L502
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L502
            if (r0 == 0) goto L4f7
            r2 = 0
            boolean r0 = r1.isNull(r2)     // Catch: java.lang.Throwable -> L502
            if (r0 == 0) goto L4f9
        L4f7:
            r7 = 0
            goto L504
        L4f9:
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L502
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L502
            goto L504
        L502:
            r0 = move-exception
            goto L508
        L504:
            r1.close()
            return r7
        L508:
            r1.close()
            throw r0
        L50c:
            r0 = r83
            gb6 r0 = (defpackage.gb6) r0
            defpackage.eb6.b(r0, r11)
            defpackage.eb6.d(r0, r2)
            return r8
        L517:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM game WHERE name LIKE '%' || ? || '%' LIMIT 1"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L561
            int r0 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L561
            int r2 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L561
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L561
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L561
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L561
            if (r5 == 0) goto L563
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L561
            if (r5 == 0) goto L546
            r7 = 0
            goto L54e
        L546:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L561
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L561
        L54e:
            java.lang.String r0 = r1.R(r2)     // Catch: java.lang.Throwable -> L561
            java.lang.String r2 = r1.R(r4)     // Catch: java.lang.Throwable -> L561
            java.lang.String r3 = r1.R(r3)     // Catch: java.lang.Throwable -> L561
            lp2 r4 = new lp2     // Catch: java.lang.Throwable -> L561
            r4.<init>(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L561
            r7 = r4
            goto L564
        L561:
            r0 = move-exception
            goto L568
        L563:
            r7 = 0
        L564:
            r1.close()
            return r7
        L568:
            r1.close()
            throw r0
        L56c:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM game WHERE game_code LIKE ? || '%' LIMIT 1"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L5b6
            int r0 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L5b6
            int r2 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L5b6
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L5b6
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L5b6
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L5b6
            if (r5 == 0) goto L5b8
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L5b6
            if (r5 == 0) goto L59b
            r7 = 0
            goto L5a3
        L59b:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L5b6
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5b6
        L5a3:
            java.lang.String r0 = r1.R(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r2 = r1.R(r4)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = r1.R(r3)     // Catch: java.lang.Throwable -> L5b6
            lp2 r4 = new lp2     // Catch: java.lang.Throwable -> L5b6
            r4.<init>(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L5b6
            r7 = r4
            goto L5b9
        L5b6:
            r0 = move-exception
            goto L5bd
        L5b8:
            r7 = 0
        L5b9:
            r1.close()
            return r7
        L5bd:
            r1.close()
            throw r0
        L5c1:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM game WHERE game_code = ? LIMIT 1"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L60b
            int r0 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L60b
            int r2 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L60b
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L60b
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L60b
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L60b
            if (r5 == 0) goto L60d
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L60b
            if (r5 == 0) goto L5f0
            r7 = 0
            goto L5f8
        L5f0:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L60b
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L60b
        L5f8:
            java.lang.String r0 = r1.R(r2)     // Catch: java.lang.Throwable -> L60b
            java.lang.String r2 = r1.R(r4)     // Catch: java.lang.Throwable -> L60b
            java.lang.String r3 = r1.R(r3)     // Catch: java.lang.Throwable -> L60b
            lp2 r4 = new lp2     // Catch: java.lang.Throwable -> L60b
            r4.<init>(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L60b
            r7 = r4
            goto L60e
        L60b:
            r0 = move-exception
            goto L612
        L60d:
            r7 = 0
        L60e:
            r1.close()
            return r7
        L612:
            r1.close()
            throw r0
        L616:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM game WHERE game_checksum = ? LIMIT 1"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L660
            int r0 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L660
            int r2 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L660
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L660
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L660
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L660
            if (r5 == 0) goto L662
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L660
            if (r5 == 0) goto L645
            r7 = 0
            goto L64d
        L645:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L660
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L660
        L64d:
            java.lang.String r0 = r1.R(r2)     // Catch: java.lang.Throwable -> L660
            java.lang.String r2 = r1.R(r4)     // Catch: java.lang.Throwable -> L660
            java.lang.String r3 = r1.R(r3)     // Catch: java.lang.Throwable -> L660
            lp2 r4 = new lp2     // Catch: java.lang.Throwable -> L660
            r4.<init>(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L660
            r7 = r4
            goto L663
        L660:
            r0 = move-exception
            goto L667
        L662:
            r7 = 0
        L663:
            r1.close()
            return r7
        L667:
            r1.close()
            throw r0
        L66b:
            r2 = r83
            jt5 r2 = (defpackage.jt5) r2
            r2.getClass()
            r20 = 0
            r21 = 258047(0x3efff, float:3.61601E-40)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r15 = r0.B
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            jt5 r0 = defpackage.jt5.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L692:
            r2 = r83
            jt5 r2 = (defpackage.jt5) r2
            r2.getClass()
            r20 = 0
            r21 = 253951(0x3dfff, float:3.55861E-40)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r0 = r0.B
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            jt5 r0 = defpackage.jt5.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L6ba:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L6db
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L6db
            if (r0 == 0) goto L6dd
            r2 = 0
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6db
            int r0 = (int) r3
            if (r0 == 0) goto L6dd
            r9 = 1
            goto L6de
        L6db:
            r0 = move-exception
            goto L6e6
        L6dd:
            r9 = 0
        L6de:
            r1.close()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L6e6:
            r1.close()
            throw r0
        L6ea:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L70f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70f
            r0.<init>()     // Catch: java.lang.Throwable -> L70f
        L700:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L70f
            if (r2 == 0) goto L711
            r2 = 0
            java.lang.String r3 = r1.R(r2)     // Catch: java.lang.Throwable -> L70f
            r0.add(r3)     // Catch: java.lang.Throwable -> L70f
            goto L700
        L70f:
            r0 = move-exception
            goto L715
        L711:
            r1.close()
            return r0
        L715:
            r1.close()
            throw r0
        L719:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L73a
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L73a
            if (r0 == 0) goto L73c
            r2 = 0
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L73a
            int r0 = (int) r3
            if (r0 == 0) goto L73d
            r9 = 1
            goto L73e
        L73a:
            r0 = move-exception
            goto L746
        L73c:
            r2 = 0
        L73d:
            r9 = r2
        L73e:
            r1.close()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L746:
            r1.close()
            throw r0
        L74a:
            r0 = r83
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM cheat_database WHERE name = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.w(r0, r11)     // Catch: java.lang.Throwable -> L762
            r1.f0()     // Catch: java.lang.Throwable -> L762
            r1.close()
            return r8
        L762:
            r0 = move-exception
            r1.close()
            throw r0
        L767:
            r0 = r83
            n14 r0 = (defpackage.n14) r0
            r0.getClass()
            java.util.List r0 = r0.a()
            l14 r0 = (defpackage.l14) r0
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = "\t"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
