package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;

    public /* synthetic */ t4(int r1, long r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r87) {
            r86 = this;
            r0 = r86
            int r1 = r0.A
            java.lang.String r2 = "enabled"
            java.lang.String r3 = "code"
            java.lang.String r4 = "cheat_database_id"
            java.lang.String r5 = "cheat_folder_id"
            java.lang.String r12 = "set_id"
            java.lang.String r13 = "type"
            java.lang.String r14 = "name"
            java.lang.String r15 = "description"
            r16 = 1073741824(0x40000000, float:2.0)
            java.lang.String r7 = "title"
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.String r9 = "game_id"
            java.lang.String r10 = "id"
            r19 = 32
            jg7 r20 = defpackage.jg7.a
            r21 = 0
            r6 = 1
            r24 = r9
            long r8 = r0.B
            switch(r1) {
                case 0: goto L844;
                case 1: goto L81c;
                case 2: goto L7fb;
                case 3: goto L7de;
                case 4: goto L75d;
                case 5: goto L6d5;
                case 6: goto L67f;
                case 7: goto L5a0;
                case 8: goto L58a;
                case 9: goto L585;
                case 10: goto L568;
                case 11: goto L54b;
                case 12: goto L4f2;
                case 13: goto L467;
                case 14: goto L3b7;
                case 15: goto L358;
                case 16: goto L32a;
                case 17: goto L30d;
                case 18: goto L2f0;
                default: goto L2f;
            }
        L2f:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"
            j36 r1 = r0.i0(r1)
            r1.c(r6, r8)     // Catch: java.lang.Throwable -> L22e
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r2 = "state"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r3 = "worker_class_name"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r4 = "input_merger_class_name"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r5 = "input"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r7 = "output"
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r8 = "initial_delay"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r9 = "interval_duration"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r10 = "flex_duration"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r12 = "run_attempt_count"
            int r12 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r13 = "backoff_policy"
            int r13 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r14 = "backoff_delay_duration"
            int r14 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r15 = "last_enqueue_time"
            int r15 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r11 = "minimum_retention_duration"
            int r11 = defpackage.ej2.B(r1, r11)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r6 = "schedule_requested_at"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r86 = r6
            java.lang.String r6 = "run_in_foreground"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r87 = r6
            java.lang.String r6 = "out_of_quota_policy"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r16 = r6
            java.lang.String r6 = "period_count"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r17 = r6
            java.lang.String r6 = "generation"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r18 = r6
            java.lang.String r6 = "next_schedule_time_override"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r19 = r6
            java.lang.String r6 = "next_schedule_time_override_generation"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r20 = r6
            java.lang.String r6 = "stop_reason"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r22 = r6
            java.lang.String r6 = "trace_tag"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r23 = r6
            java.lang.String r6 = "backoff_on_system_interruptions"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r24 = r6
            java.lang.String r6 = "required_network_type"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r27 = r6
            java.lang.String r6 = "required_network_request"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r28 = r6
            java.lang.String r6 = "requires_charging"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r29 = r6
            java.lang.String r6 = "requires_device_idle"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r30 = r6
            java.lang.String r6 = "requires_battery_not_low"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r31 = r6
            java.lang.String r6 = "requires_storage_not_low"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r32 = r6
            java.lang.String r6 = "trigger_content_update_delay"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r33 = r6
            java.lang.String r6 = "trigger_max_content_delay"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r34 = r6
            java.lang.String r6 = "content_uri_triggers"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L22e
            r35 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22e
            r6.<init>()     // Catch: java.lang.Throwable -> L22e
        L12e:
            boolean r36 = r1.f0()     // Catch: java.lang.Throwable -> L22e
            if (r36 == 0) goto L2e8
            java.lang.String r38 = r1.R(r0)     // Catch: java.lang.Throwable -> L22e
            r36 = r14
            r71 = r15
            long r14 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L22e
            iw7 r39 = defpackage.ds7.f(r14)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r40 = r1.R(r3)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r41 = r1.R(r4)     // Catch: java.lang.Throwable -> L22e
            byte[] r14 = r1.getBlob(r5)     // Catch: java.lang.Throwable -> L22e
            xb1 r15 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L22e
            xb1 r42 = defpackage.u24.k(r14)     // Catch: java.lang.Throwable -> L22e
            byte[] r14 = r1.getBlob(r7)     // Catch: java.lang.Throwable -> L22e
            xb1 r43 = defpackage.u24.k(r14)     // Catch: java.lang.Throwable -> L22e
            long r44 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L22e
            long r46 = r1.getLong(r9)     // Catch: java.lang.Throwable -> L22e
            long r48 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L22e
            long r14 = r1.getLong(r12)     // Catch: java.lang.Throwable -> L22e
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L22e
            r15 = r2
            r72 = r3
            long r2 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            w10 r52 = defpackage.ds7.c(r2)     // Catch: java.lang.Throwable -> L22e
            r2 = r36
            long r53 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            r3 = r71
            long r55 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            long r57 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L22e
            r36 = r0
            r0 = r86
            long r59 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L22e
            r86 = r0
            r71 = r2
            r0 = r87
            r87 = r3
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            if (r2 == 0) goto L1aa
            r61 = 1
        L1a5:
            r2 = r16
            r16 = r4
            goto L1ad
        L1aa:
            r61 = 0
            goto L1a5
        L1ad:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22e
            oo4 r62 = defpackage.ds7.e(r3)     // Catch: java.lang.Throwable -> L22e
            r3 = r17
            r17 = r5
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L22e
            r73 = r3
            r5 = r18
            r18 = r2
            long r2 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            r3 = r19
            long r65 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            r19 = r0
            r64 = r2
            r0 = r20
            r20 = r3
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            r63 = r4
            r3 = r22
            r22 = r5
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L22e
            r5 = r23
            boolean r23 = r1.isNull(r5)     // Catch: java.lang.Throwable -> L22e
            if (r23 == 0) goto L1f7
            r69 = r21
        L1f2:
            r23 = r0
            r0 = r24
            goto L1fe
        L1f7:
            java.lang.String r23 = r1.R(r5)     // Catch: java.lang.Throwable -> L22e
            r69 = r23
            goto L1f2
        L1fe:
            boolean r24 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L22e
            if (r24 == 0) goto L20b
            r67 = r2
            r24 = r3
            r2 = r21
            goto L218
        L20b:
            r67 = r2
            r24 = r3
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L22e
        L218:
            if (r2 == 0) goto L231
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L22e
            if (r2 == 0) goto L222
            r2 = 1
            goto L223
        L222:
            r2 = 0
        L223:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L22e
            r70 = r2
        L229:
            r68 = r4
            r2 = r27
            goto L234
        L22e:
            r0 = move-exception
            goto L2ec
        L231:
            r70 = r21
            goto L229
        L234:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22e
            kf4 r76 = defpackage.ds7.d(r3)     // Catch: java.lang.Throwable -> L22e
            r3 = r28
            byte[] r4 = r1.getBlob(r3)     // Catch: java.lang.Throwable -> L22e
            af4 r75 = defpackage.ds7.h(r4)     // Catch: java.lang.Throwable -> L22e
            r27 = r2
            r28 = r3
            r4 = r29
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            if (r2 == 0) goto L25b
            r77 = 1
        L256:
            r29 = r4
            r2 = r30
            goto L25e
        L25b:
            r77 = 0
            goto L256
        L25e:
            long r3 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22e
            if (r3 == 0) goto L26c
            r78 = 1
        L267:
            r30 = r5
            r3 = r31
            goto L26f
        L26c:
            r78 = 0
            goto L267
        L26f:
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L22e
            if (r4 == 0) goto L27e
            r79 = 1
        L278:
            r5 = r2
            r31 = r3
            r4 = r32
            goto L281
        L27e:
            r79 = 0
            goto L278
        L281:
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L22e
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L22e
            if (r2 == 0) goto L28d
            r80 = 1
        L28a:
            r2 = r33
            goto L290
        L28d:
            r80 = 0
            goto L28a
        L290:
            long r81 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L22e
            r3 = r34
            long r83 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L22e
            r32 = r0
            r0 = r35
            byte[] r33 = r1.getBlob(r0)     // Catch: java.lang.Throwable -> L22e
            java.util.LinkedHashSet r85 = defpackage.ds7.a(r33)     // Catch: java.lang.Throwable -> L22e
            p21 r50 = new p21     // Catch: java.lang.Throwable -> L22e
            r74 = r50
            r74.<init>(r75, r76, r77, r78, r79, r80, r81, r83, r85)     // Catch: java.lang.Throwable -> L22e
            r50 = r74
            yw7 r37 = new yw7     // Catch: java.lang.Throwable -> L22e
            r51 = r14
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r55, r57, r59, r61, r62, r63, r64, r65, r67, r68, r69, r70)     // Catch: java.lang.Throwable -> L22e
            r14 = r37
            r6.add(r14)     // Catch: java.lang.Throwable -> L22e
            r14 = r32
            r32 = r4
            r4 = r16
            r16 = r18
            r18 = r22
            r22 = r24
            r24 = r14
            r35 = r0
            r33 = r2
            r34 = r3
            r2 = r15
            r0 = r36
            r14 = r71
            r3 = r72
            r15 = r87
            r87 = r19
            r19 = r20
            r20 = r23
            r23 = r30
            r30 = r5
            r5 = r17
            r17 = r73
            goto L12e
        L2e8:
            r1.close()
            return r6
        L2ec:
            r1.close()
            throw r0
        L2f0:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_user_achievement WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L308
            r1.f0()     // Catch: java.lang.Throwable -> L308
            r1.close()
            return r20
        L308:
            r0 = move-exception
            r1.close()
            throw r0
        L30d:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_achievement WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L325
            r1.f0()     // Catch: java.lang.Throwable -> L325
            r1.close()
            return r20
        L325:
            r0 = move-exception
            r1.close()
            throw r0
        L32a:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT game_hash FROM ra_game_hash_library WHERE game_id = ? LIMIT 1"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L34e
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L34e
            if (r0 == 0) goto L350
            r0 = 0
            boolean r2 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L34e
            if (r2 == 0) goto L349
            goto L350
        L349:
            java.lang.String r21 = r1.R(r0)     // Catch: java.lang.Throwable -> L34e
            goto L350
        L34e:
            r0 = move-exception
            goto L354
        L350:
            r1.close()
            return r21
        L354:
            r1.close()
            throw r0
        L358:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_achievement_set WHERE id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L3ad
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L3ad
            r2 = r24
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L3ad
            int r3 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L3ad
            int r4 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L3ad
            java.lang.String r5 = "icon_url"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L3ad
            boolean r6 = r1.f0()     // Catch: java.lang.Throwable -> L3ad
            if (r6 == 0) goto L3af
            long r8 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L3ad
            long r10 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L3ad
            boolean r0 = r1.isNull(r3)     // Catch: java.lang.Throwable -> L3ad
            if (r0 == 0) goto L398
        L395:
            r12 = r21
            goto L39d
        L398:
            java.lang.String r21 = r1.R(r3)     // Catch: java.lang.Throwable -> L3ad
            goto L395
        L39d:
            java.lang.String r13 = r1.R(r4)     // Catch: java.lang.Throwable -> L3ad
            java.lang.String r14 = r1.R(r5)     // Catch: java.lang.Throwable -> L3ad
            t75 r7 = new t75     // Catch: java.lang.Throwable -> L3ad
            r7.<init>(r8, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> L3ad
            r21 = r7
            goto L3af
        L3ad:
            r0 = move-exception
            goto L3b3
        L3af:
            r1.close()
            return r21
        L3b3:
            r1.close()
            throw r0
        L3b7:
            r2 = r24
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_achievement WHERE id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L45d
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L45d
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L45d
            int r3 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r4 = "total_awards_casual"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r5 = "total_awards_hardcore"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L45d
            int r6 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L45d
            int r7 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r8 = "points"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r9 = "display_order"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r10 = "badge_url_unlocked"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r11 = "badge_url_locked"
            int r11 = defpackage.ej2.B(r1, r11)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r12 = "memory_address"
            int r12 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L45d
            int r13 = defpackage.ej2.B(r1, r13)     // Catch: java.lang.Throwable -> L45d
            boolean r14 = r1.f0()     // Catch: java.lang.Throwable -> L45d
            if (r14 == 0) goto L45f
            long r23 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L45d
            long r25 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L45d
            long r27 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L45d
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L45d
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L45d
            long r2 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L45d
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L45d
            java.lang.String r31 = r1.R(r6)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r32 = r1.R(r7)     // Catch: java.lang.Throwable -> L45d
            long r3 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L45d
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L45d
            long r4 = r1.getLong(r9)     // Catch: java.lang.Throwable -> L45d
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L45d
            java.lang.String r35 = r1.R(r10)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r36 = r1.R(r11)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r37 = r1.R(r12)     // Catch: java.lang.Throwable -> L45d
            long r5 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L45d
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L45d
            p75 r22 = new p75     // Catch: java.lang.Throwable -> L45d
            r29 = r0
            r30 = r2
            r33 = r3
            r34 = r4
            r38 = r5
            r22.<init>(r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L45d
            r21 = r22
            goto L45f
        L45d:
            r0 = move-exception
            goto L463
        L45f:
            r1.close()
            return r21
        L463:
            r1.close()
            throw r0
        L467:
            r2 = r24
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_leaderboard WHERE id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L4e8
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L4e8
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L4e8
            int r3 = defpackage.ej2.B(r1, r12)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r4 = "mem"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r5 = "format"
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r6 = "lower_is_better"
            int r6 = defpackage.ej2.B(r1, r6)     // Catch: java.lang.Throwable -> L4e8
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L4e8
            int r8 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r9 = "hidden"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L4e8
            boolean r10 = r1.f0()     // Catch: java.lang.Throwable -> L4e8
            if (r10 == 0) goto L4ea
            long r28 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L4e8
            long r30 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L4e8
            long r32 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r34 = r1.R(r4)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r35 = r1.R(r5)     // Catch: java.lang.Throwable -> L4e8
            long r2 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L4e8
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L4e8
            if (r0 == 0) goto L4ca
            r36 = 1
            goto L4cc
        L4ca:
            r36 = 0
        L4cc:
            java.lang.String r37 = r1.R(r7)     // Catch: java.lang.Throwable -> L4e8
            java.lang.String r38 = r1.R(r8)     // Catch: java.lang.Throwable -> L4e8
            long r2 = r1.getLong(r9)     // Catch: java.lang.Throwable -> L4e8
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L4e8
            if (r0 == 0) goto L4de
            r39 = 1
            goto L4e0
        L4de:
            r39 = 0
        L4e0:
            va5 r27 = new va5     // Catch: java.lang.Throwable -> L4e8
            r27.<init>(r28, r30, r32, r34, r35, r36, r37, r38, r39)     // Catch: java.lang.Throwable -> L4e8
            r21 = r27
            goto L4ea
        L4e8:
            r0 = move-exception
            goto L4ee
        L4ea:
            r1.close()
            return r21
        L4ee:
            r1.close()
            throw r0
        L4f2:
            r2 = r24
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_game WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L541
            int r0 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L541
            java.lang.String r2 = "rich_presence_patch"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L541
            int r3 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> L541
            java.lang.String r4 = "icon"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L541
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L541
            if (r5 == 0) goto L543
            long r7 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L541
            boolean r0 = r1.isNull(r2)     // Catch: java.lang.Throwable -> L541
            if (r0 == 0) goto L52c
        L529:
            r9 = r21
            goto L531
        L52c:
            java.lang.String r21 = r1.R(r2)     // Catch: java.lang.Throwable -> L541
            goto L529
        L531:
            java.lang.String r10 = r1.R(r3)     // Catch: java.lang.Throwable -> L541
            java.lang.String r11 = r1.R(r4)     // Catch: java.lang.Throwable -> L541
            ea5 r6 = new ea5     // Catch: java.lang.Throwable -> L541
            r6.<init>(r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L541
            r21 = r6
            goto L543
        L541:
            r0 = move-exception
            goto L547
        L543:
            r1.close()
            return r21
        L547:
            r1.close()
            throw r0
        L54b:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_leaderboard WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L563
            r1.f0()     // Catch: java.lang.Throwable -> L563
            r1.close()
            return r20
        L563:
            r0 = move-exception
            r1.close()
            throw r0
        L568:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_achievement_set WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L580
            r1.f0()     // Catch: java.lang.Throwable -> L580
            r1.close()
            return r20
        L580:
            r0 = move-exception
            r1.close()
            throw r0
        L585:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            return r0
        L58a:
            r1 = r87
            gb6 r1 = (defpackage.gb6) r1
            fb6 r2 = defpackage.pa6.a
            oa6 r3 = new oa6
            fv2 r4 = defpackage.fv2.Cursor
            na6 r7 = defpackage.na6.Middle
            r8 = 1
            long r5 = r0.B
            r3.<init>(r4, r5, r7, r8)
            r1.a(r2, r3)
            return r20
        L5a0:
            r4 = r87
            no1 r4 = (defpackage.no1) r4
            r4.getClass()
            long r0 = r4.e()
            long r0 = r0 >> r19
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r1 = r4.e()
            long r1 = r1 & r17
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 1075838976(0x40200000, float:2.5)
            float r2 = r4.e0(r2)
            kt0 r3 = new kt0
            r3.<init>(r8)
            long r5 = defpackage.kt0.g
            kt0 r7 = new kt0
            r7.<init>(r5)
            kt0[] r3 = new defpackage.kt0[]{r3, r7}
            java.util.List r3 = defpackage.hf.c0(r3)
            float r2 = r2 * r16
            r7 = 8
            r10 = 0
            bv3 r25 = defpackage.d90.m(r3, r10, r2, r7)
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r11 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r13 = (long) r3
            long r10 = r11 << r19
            long r12 = r13 & r17
            long r26 = r10 | r12
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r10 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r12 = (long) r0
            long r10 = r10 << r19
            long r12 = r12 & r17
            long r28 = r10 | r12
            r31 = 0
            r32 = 120(0x78, float:1.68E-43)
            r30 = 0
            r24 = r4
            defpackage.no1.D0(r24, r25, r26, r28, r30, r31, r32)
            kt0 r0 = new kt0
            r0.<init>(r8)
            kt0 r3 = new kt0
            r3.<init>(r5)
            kt0[] r0 = new defpackage.kt0[]{r0, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            r7 = 8
            r10 = 0
            bv3 r5 = defpackage.d90.k(r0, r10, r2, r7)
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            long r6 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            long r8 = (long) r0
            long r6 = r6 << r19
            long r8 = r8 & r17
            long r6 = r6 | r8
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r19
            long r0 = r0 & r17
            long r8 = r2 | r0
            r11 = 0
            r12 = 120(0x78, float:1.68E-43)
            r10 = 0
            defpackage.no1.D0(r4, r5, r6, r8, r10, r11, r12)
            long r0 = defpackage.kt0.b
            r2 = 1060320051(0x3f333333, float:0.7)
            long r5 = defpackage.kt0.c(r2, r0)
            r23 = 0
            int r0 = java.lang.Float.floatToRawIntBits(r23)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r23)
            long r2 = (long) r2
            long r0 = r0 << r19
            long r2 = r2 & r17
            long r7 = r0 | r2
            long r9 = r4.e()
            ys6 r11 = new ys6
            r16 = 0
            r17 = 30
            r12 = 1069547520(0x3fc00000, float:1.5)
            r13 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r13 = 104(0x68, float:1.46E-43)
            r12 = r11
            r11 = 0
            defpackage.no1.F(r4, r5, r7, r9, r11, r12, r13)
            return r20
        L67f:
            r2 = r24
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM cheat_folder WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L6cb
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L6cb
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L6cb
            int r3 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L6cb
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6cb
            r4.<init>()     // Catch: java.lang.Throwable -> L6cb
        L6a3:
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L6cb
            if (r5 == 0) goto L6cd
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L6cb
            if (r5 == 0) goto L6b2
            r5 = r21
            goto L6ba
        L6b2:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L6cb
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L6cb
        L6ba:
            long r6 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6cb
            java.lang.String r8 = r1.R(r3)     // Catch: java.lang.Throwable -> L6cb
            cn0 r9 = new cn0     // Catch: java.lang.Throwable -> L6cb
            r9.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L6cb
            r4.add(r9)     // Catch: java.lang.Throwable -> L6cb
            goto L6a3
        L6cb:
            r0 = move-exception
            goto L6d1
        L6cd:
            r1.close()
            return r4
        L6d1:
            r1.close()
            throw r0
        L6d5:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM cheat WHERE cheat_folder_id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L753
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L753
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L753
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L753
            int r6 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L753
            int r7 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L753
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L753
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L753
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L753
            r8.<init>()     // Catch: java.lang.Throwable -> L753
        L707:
            boolean r9 = r1.f0()     // Catch: java.lang.Throwable -> L753
            if (r9 == 0) goto L755
            boolean r9 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L753
            if (r9 == 0) goto L716
            r11 = r21
            goto L71f
        L716:
            long r9 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L753
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L753
            r11 = r9
        L71f:
            long r12 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L753
            long r14 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L753
            java.lang.String r16 = r1.R(r6)     // Catch: java.lang.Throwable -> L753
            boolean r9 = r1.isNull(r7)     // Catch: java.lang.Throwable -> L753
            if (r9 == 0) goto L734
            r17 = r21
            goto L73a
        L734:
            java.lang.String r9 = r1.R(r7)     // Catch: java.lang.Throwable -> L753
            r17 = r9
        L73a:
            java.lang.String r18 = r1.R(r3)     // Catch: java.lang.Throwable -> L753
            long r9 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L753
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L753
            if (r9 == 0) goto L748
            r19 = 1
            goto L74a
        L748:
            r19 = 0
        L74a:
            zm0 r10 = new zm0     // Catch: java.lang.Throwable -> L753
            r10.<init>(r11, r12, r14, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L753
            r8.add(r10)     // Catch: java.lang.Throwable -> L753
            goto L707
        L753:
            r0 = move-exception
            goto L759
        L755:
            r1.close()
            return r8
        L759:
            r1.close()
            throw r0
        L75d:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM cheat WHERE id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L7d4
            int r0 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L7d4
            int r5 = defpackage.ej2.B(r1, r5)     // Catch: java.lang.Throwable -> L7d4
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L7d4
            int r6 = defpackage.ej2.B(r1, r14)     // Catch: java.lang.Throwable -> L7d4
            int r7 = defpackage.ej2.B(r1, r15)     // Catch: java.lang.Throwable -> L7d4
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L7d4
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L7d4
            boolean r8 = r1.f0()     // Catch: java.lang.Throwable -> L7d4
            if (r8 == 0) goto L7d6
            boolean r8 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L7d4
            if (r8 == 0) goto L799
            r9 = r21
            goto L7a2
        L799:
            long r8 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L7d4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L7d4
            r9 = r0
        L7a2:
            long r10 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L7d4
            long r12 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L7d4
            java.lang.String r14 = r1.R(r6)     // Catch: java.lang.Throwable -> L7d4
            boolean r0 = r1.isNull(r7)     // Catch: java.lang.Throwable -> L7d4
            if (r0 == 0) goto L7b7
        L7b4:
            r15 = r21
            goto L7bc
        L7b7:
            java.lang.String r21 = r1.R(r7)     // Catch: java.lang.Throwable -> L7d4
            goto L7b4
        L7bc:
            java.lang.String r16 = r1.R(r3)     // Catch: java.lang.Throwable -> L7d4
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L7d4
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L7d4
            if (r0 == 0) goto L7ca
            r17 = 1
            goto L7cc
        L7ca:
            r17 = 0
        L7cc:
            zm0 r8 = new zm0     // Catch: java.lang.Throwable -> L7d4
            r8.<init>(r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7d4
            r21 = r8
            goto L7d6
        L7d4:
            r0 = move-exception
            goto L7da
        L7d6:
            r1.close()
            return r21
        L7da:
            r1.close()
            throw r0
        L7de:
            r0 = r87
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM cheat WHERE id = ?"
            j36 r1 = r0.i0(r1)
            r0 = 1
            r1.c(r0, r8)     // Catch: java.lang.Throwable -> L7f6
            r1.f0()     // Catch: java.lang.Throwable -> L7f6
            r1.close()
            return r20
        L7f6:
            r0 = move-exception
            r1.close()
            throw r0
        L7fb:
            r0 = r87
            c80 r0 = (defpackage.c80) r0
            qn2 r1 = r0.b
            if (r1 != 0) goto L804
            goto L81b
        L804:
            rj0 r2 = r0.a
            if (r2 == 0) goto L81b
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L811
            java.lang.Object r0 = r1.g(r0)     // Catch: java.lang.Throwable -> L811
            goto L818
        L811:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L818:
            r2.i(r0)
        L81b:
            return r20
        L81c:
            r0 = r87
            oa0 r0 = (defpackage.oa0) r0
            c90 r1 = r0.A
            long r1 = r1.e()
            long r1 = r1 >> r19
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 / r16
            zh r2 = defpackage.mb3.x(r0, r1)
            z40 r3 = new z40
            r4 = 5
            r3.<init>(r4, r8)
            uf r4 = new uf
            r5 = 0
            r4.<init>(r1, r2, r3, r5)
            d51 r0 = r0.b(r4)
            return r0
        L844:
            r0 = r87
            oa0 r0 = (defpackage.oa0) r0
            r0.getClass()
            r1 = 1109393408(0x42200000, float:40.0)
            float r2 = r0.a()
            float r2 = r2 * r1
            kt0 r1 = new kt0
            r1.<init>(r8)
            r10 = 0
            long r3 = defpackage.kt0.c(r10, r8)
            kt0 r5 = new kt0
            r5.<init>(r3)
            kt0[] r1 = new defpackage.kt0[]{r1, r5}
            java.util.List r1 = defpackage.hf.c0(r1)
            c90 r3 = r0.A
            long r3 = r3.e()
            long r3 = r3 & r17
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 - r2
            c90 r4 = r0.A
            long r4 = r4.e()
            long r4 = r4 & r17
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7 = 8
            bv3 r1 = defpackage.d90.m(r1, r3, r4, r7)
            n4 r3 = new n4
            r5 = 0
            r3.<init>(r2, r1, r5)
            d51 r0 = r0.b(r3)
            return r0
    }
}
