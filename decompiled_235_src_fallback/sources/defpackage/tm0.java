package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm0  reason: default package */
/* loaded from: classes.dex */
public final class tm0 extends defpackage.hf {
    public final /* synthetic */ int u;

    public /* synthetic */ tm0(int r1) {
            r0 = this;
            r0.u = r1
            r0.<init>()
            return
    }

    public tm0(defpackage.bn5 r1) {
            r0 = this;
            r1 = 7
            r0.u = r1
            r0.<init>()
            return
    }

    @Override // defpackage.hf
    public final java.lang.String J() {
            r0 = this;
            int r0 = r0.u
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L2c;
                case 7: goto L29;
                case 8: goto L26;
                case 9: goto L23;
                case 10: goto L20;
                case 11: goto L1d;
                case 12: goto L1a;
                case 13: goto L17;
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                case 17: goto Lb;
                case 18: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"
            return r0
        L8:
            java.lang.String r0 = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
            return r0
        Lb:
            java.lang.String r0 = "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"
            return r0
        Le:
            java.lang.String r0 = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"
            return r0
        L11:
            java.lang.String r0 = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"
            return r0
        L14:
            java.lang.String r0 = "INSERT INTO `ra_game` (`game_id`,`rich_presence_patch`,`title`,`icon`) VALUES (?,?,?,?)"
            return r0
        L17:
            java.lang.String r0 = "INSERT OR ABORT INTO `ra_game_hash_library` (`game_hash`,`game_id`) VALUES (?,?)"
            return r0
        L1a:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_pending_achievement_award` (`achievement_id`,`game_id`,`for_hardcore_mode`,`created_at_epoch_ms`) VALUES (?,?,?,?)"
            return r0
        L1d:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_user_achievement` (`game_id`,`achievement_id`,`is_unlocked`,`is_hardcore`) VALUES (?,?,?,?)"
            return r0
        L20:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_leaderboard` (`id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden`) VALUES (?,?,?,?,?,?,?,?,?)"
            return r0
        L23:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_achievement` (`id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"
            return r0
        L26:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_achievement_set` (`id`,`game_id`,`title`,`type`,`icon_url`) VALUES (?,?,?,?,?)"
            return r0
        L29:
            java.lang.String r0 = "INSERT OR REPLACE INTO `ra_game_set_metadata` (`game_id`,`last_achievement_set_updated`,`last_user_data_updated`,`last_hardcore_user_data_updated`) VALUES (?,?,?,?)"
            return r0
        L2c:
            java.lang.String r0 = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"
            return r0
        L2f:
            java.lang.String r0 = "INSERT OR IGNORE INTO `game` (`id`,`name`,`game_code`,`game_checksum`) VALUES (?,?,?,?)"
            return r0
        L32:
            java.lang.String r0 = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"
            return r0
        L35:
            java.lang.String r0 = "INSERT OR ABORT INTO `cheat_folder` (`id`,`game_id`,`name`) VALUES (?,?,?)"
            return r0
        L38:
            java.lang.String r0 = "INSERT OR ABORT INTO `cheat_database` (`id`,`name`) VALUES (?,?)"
            return r0
        L3b:
            java.lang.String r0 = "INSERT OR ABORT INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)"
            return r0
        L3e:
            java.lang.String r0 = "INSERT OR REPLACE INTO `cheat` (`id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled`) VALUES (?,?,?,?,?,?,?)"
            return r0
    }

    @Override // defpackage.hf
    public final void z(defpackage.j36 r17, java.lang.Object r18) {
            r16 = this;
            r0 = r17
            r1 = r16
            int r1 = r1.u
            r4 = 11
            r5 = 9
            r6 = 8
            r7 = 10
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            switch(r1) {
                case 0: goto L574;
                case 1: goto L535;
                case 2: goto L516;
                case 3: goto L4f2;
                case 4: goto L4dd;
                case 5: goto L4b4;
                case 6: goto L49b;
                case 7: goto L43b;
                case 8: goto L411;
                case 9: goto L3bc;
                case 10: goto L382;
                case 11: goto L361;
                case 12: goto L341;
                case 13: goto L32c;
                case 14: goto L307;
                case 15: goto L2eb;
                case 16: goto L2d6;
                case 17: goto L2bb;
                case 18: goto L2d;
                default: goto L18;
            }
        L18:
            r1 = r18
            ex7 r1 = (defpackage.ex7) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            java.lang.String r1 = r1.b
            r0.w(r13, r1)
            return
        L2d:
            r1 = r18
            yw7 r1 = (defpackage.yw7) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r15 = r1.a
            r0.w(r14, r15)
            iw7 r15 = r1.b
            int r15 = defpackage.ds7.g(r15)
            long r2 = (long) r15
            r0.c(r13, r2)
            java.lang.String r2 = r1.c
            r0.w(r12, r2)
            java.lang.String r2 = r1.d
            r0.w(r11, r2)
            xb1 r2 = defpackage.xb1.b
            xb1 r2 = r1.e
            byte[] r2 = defpackage.u24.H(r2)
            r0.d(r2, r10)
            xb1 r2 = r1.f
            byte[] r2 = defpackage.u24.H(r2)
            r0.d(r2, r9)
            long r2 = r1.g
            r0.c(r8, r2)
            long r2 = r1.h
            r0.c(r6, r2)
            long r2 = r1.i
            r0.c(r5, r2)
            int r2 = r1.k
            long r2 = (long) r2
            r0.c(r7, r2)
            w10 r2 = r1.l
            r2.getClass()
            int[] r3 = defpackage.gx7.b
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 0
            if (r2 == r14) goto L92
            if (r2 != r13) goto L8d
            r2 = r14
            goto L93
        L8d:
            defpackage.i.d()
            goto L29c
        L92:
            r2 = r3
        L93:
            long r5 = (long) r2
            r0.c(r4, r5)
            long r4 = r1.m
            r2 = 12
            r0.c(r2, r4)
            long r4 = r1.n
            r2 = 13
            r0.c(r2, r4)
            long r4 = r1.o
            r2 = 14
            r0.c(r2, r4)
            long r4 = r1.p
            r2 = 15
            r0.c(r2, r4)
            boolean r2 = r1.q
            long r4 = (long) r2
            r2 = 16
            r0.c(r2, r4)
            oo4 r2 = r1.r
            r2.getClass()
            int[] r4 = defpackage.gx7.d
            int r2 = r2.ordinal()
            r2 = r4[r2]
            if (r2 == r14) goto Ld3
            if (r2 != r13) goto Lce
            r2 = r14
            goto Ld4
        Lce:
            defpackage.i.d()
            goto L29c
        Ld3:
            r2 = r3
        Ld4:
            long r4 = (long) r2
            r2 = 17
            r0.c(r2, r4)
            int r2 = r1.s
            long r4 = (long) r2
            r2 = 18
            r0.c(r2, r4)
            int r2 = r1.t
            long r4 = (long) r2
            r2 = 19
            r0.c(r2, r4)
            r2 = 20
            long r4 = r1.u
            r0.c(r2, r4)
            int r2 = r1.v
            long r4 = (long) r2
            r2 = 21
            r0.c(r2, r4)
            int r2 = r1.w
            long r4 = (long) r2
            r2 = 22
            r0.c(r2, r4)
            java.lang.String r2 = r1.x
            r4 = 23
            if (r2 != 0) goto L10b
            r0.f(r4)
            goto L10e
        L10b:
            r0.w(r4, r2)
        L10e:
            java.lang.Boolean r2 = r1.y
            if (r2 == 0) goto L11b
            boolean r2 = r2.booleanValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L11c
        L11b:
            r2 = 0
        L11c:
            r4 = 24
            if (r2 != 0) goto L124
            r0.f(r4)
            goto L12c
        L124:
            int r2 = r2.intValue()
            long r5 = (long) r2
            r0.c(r4, r5)
        L12c:
            p21 r1 = r1.j
            kf4 r2 = r1.a
            r2.getClass()
            int[] r4 = defpackage.gx7.c
            int r5 = r2.ordinal()
            r4 = r4[r5]
            r5 = 30
            if (r4 == r14) goto L157
            if (r4 == r13) goto L15f
            if (r4 == r12) goto L15d
            if (r4 == r11) goto L15b
            if (r4 == r10) goto L159
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L150
            kf4 r4 = defpackage.kf4.TEMPORARILY_UNMETERED
            if (r2 != r4) goto L150
            goto L160
        L150:
            java.lang.String r4 = "Could not convert "
            java.lang.String r6 = " to int"
            defpackage.u34.C(r2, r6, r4)
        L157:
            r10 = r3
            goto L160
        L159:
            r10 = r11
            goto L160
        L15b:
            r10 = r12
            goto L160
        L15d:
            r10 = r13
            goto L160
        L15f:
            r10 = r14
        L160:
            r2 = 25
            long r8 = (long) r10
            r0.c(r2, r8)
            af4 r2 = r1.b
            r2.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 >= r6) goto L175
            byte[] r2 = new byte[r3]
            goto L218
        L175:
            java.lang.Object r2 = r2.a
            android.net.NetworkRequest r2 = (android.net.NetworkRequest) r2
            if (r2 != 0) goto L17f
            byte[] r2 = new byte[r3]
            goto L218
        L17f:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.ObjectOutputStream r8 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L2ac
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L2ac
            r9 = 31
            if (r4 < r9) goto L195
            int[] r4 = defpackage.sd0.y(r2)     // Catch: java.lang.Throwable -> L1f7
            r4.getClass()     // Catch: java.lang.Throwable -> L1f7
            goto L1b8
        L195:
            int[] r4 = new int[r7]     // Catch: java.lang.Throwable -> L1f7
            r4 = {x05de: FILL_ARRAY_DATA  , data: [2, 0, 3, 6, 10, 9, 8, 4, 1, 5} // fill-array     // Catch: java.lang.Throwable -> L1f7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f7
            r10.<init>()     // Catch: java.lang.Throwable -> L1f7
            r11 = r3
        L1a0:
            if (r11 >= r7) goto L1b4
            r12 = r4[r11]     // Catch: java.lang.Throwable -> L1f7
            boolean r13 = defpackage.yr1.x(r2, r12)     // Catch: java.lang.Throwable -> L1f7
            if (r13 == 0) goto L1b1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1f7
            r10.add(r12)     // Catch: java.lang.Throwable -> L1f7
        L1b1:
            int r11 = r11 + 1
            goto L1a0
        L1b4:
            int[] r4 = defpackage.gt0.j1(r10)     // Catch: java.lang.Throwable -> L1f7
        L1b8:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f7
            if (r7 < r9) goto L1c4
            int[] r2 = defpackage.sd0.D(r2)     // Catch: java.lang.Throwable -> L1f7
            r2.getClass()     // Catch: java.lang.Throwable -> L1f7
            goto L1e7
        L1c4:
            int[] r7 = new int[r5]     // Catch: java.lang.Throwable -> L1f7
            r7 = {x05f6: FILL_ARRAY_DATA  , data: [17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9} // fill-array     // Catch: java.lang.Throwable -> L1f7
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f7
            r9.<init>()     // Catch: java.lang.Throwable -> L1f7
            r10 = r3
        L1cf:
            if (r10 >= r5) goto L1e3
            r11 = r7[r10]     // Catch: java.lang.Throwable -> L1f7
            boolean r12 = defpackage.yr1.D(r2, r11)     // Catch: java.lang.Throwable -> L1f7
            if (r12 == 0) goto L1e0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L1f7
            r9.add(r11)     // Catch: java.lang.Throwable -> L1f7
        L1e0:
            int r10 = r10 + 1
            goto L1cf
        L1e3:
            int[] r2 = defpackage.gt0.j1(r9)     // Catch: java.lang.Throwable -> L1f7
        L1e7:
            int r7 = r4.length     // Catch: java.lang.Throwable -> L1f7
            r8.writeInt(r7)     // Catch: java.lang.Throwable -> L1f7
            int r7 = r4.length     // Catch: java.lang.Throwable -> L1f7
            r9 = r3
        L1ed:
            if (r9 >= r7) goto L1fb
            r10 = r4[r9]     // Catch: java.lang.Throwable -> L1f7
            r8.writeInt(r10)     // Catch: java.lang.Throwable -> L1f7
            int r9 = r9 + 1
            goto L1ed
        L1f7:
            r0 = move-exception
            r1 = r0
            goto L2af
        L1fb:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f7
            r8.writeInt(r4)     // Catch: java.lang.Throwable -> L1f7
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f7
            r7 = r3
        L201:
            if (r7 >= r4) goto L20b
            r9 = r2[r7]     // Catch: java.lang.Throwable -> L1f7
            r8.writeInt(r9)     // Catch: java.lang.Throwable -> L1f7
            int r7 = r7 + 1
            goto L201
        L20b:
            r8.close()     // Catch: java.lang.Throwable -> L2ac
            r6.close()
            byte[] r2 = r6.toByteArray()
            r2.getClass()
        L218:
            r4 = 26
            r0.d(r2, r4)
            boolean r2 = r1.c
            r4 = 27
            long r6 = (long) r2
            r0.c(r4, r6)
            boolean r2 = r1.d
            r4 = 28
            long r6 = (long) r2
            r0.c(r4, r6)
            boolean r2 = r1.e
            r4 = 29
            long r6 = (long) r2
            r0.c(r4, r6)
            boolean r2 = r1.f
            long r6 = (long) r2
            r0.c(r5, r6)
            r2 = 31
            long r4 = r1.g
            r0.c(r2, r4)
            r2 = 32
            long r4 = r1.h
            r0.c(r2, r4)
            java.util.Set r1 = r1.i
            r1.getClass()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L257
            byte[] r1 = new byte[r3]
            goto L297
        L257:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L29d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29d
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L287
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L287
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L287
        L26c:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L287
            if (r4 == 0) goto L28a
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L287
            n21 r4 = (defpackage.n21) r4     // Catch: java.lang.Throwable -> L287
            android.net.Uri r5 = r4.a     // Catch: java.lang.Throwable -> L287
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L287
            r3.writeUTF(r5)     // Catch: java.lang.Throwable -> L287
            boolean r4 = r4.b     // Catch: java.lang.Throwable -> L287
            r3.writeBoolean(r4)     // Catch: java.lang.Throwable -> L287
            goto L26c
        L287:
            r0 = move-exception
            r1 = r0
            goto L2a0
        L28a:
            r3.close()     // Catch: java.lang.Throwable -> L29d
            r2.close()
            byte[] r1 = r2.toByteArray()
            r1.getClass()
        L297:
            r2 = 33
            r0.d(r1, r2)
        L29c:
            return
        L29d:
            r0 = move-exception
            r1 = r0
            goto L2a6
        L2a0:
            throw r1     // Catch: java.lang.Throwable -> L2a1
        L2a1:
            r0 = move-exception
            defpackage.ge7.t(r3, r1)     // Catch: java.lang.Throwable -> L29d
            throw r0     // Catch: java.lang.Throwable -> L29d
        L2a6:
            throw r1     // Catch: java.lang.Throwable -> L2a7
        L2a7:
            r0 = move-exception
            defpackage.ge7.t(r2, r1)
            throw r0
        L2ac:
            r0 = move-exception
            r1 = r0
            goto L2b5
        L2af:
            throw r1     // Catch: java.lang.Throwable -> L2b0
        L2b0:
            r0 = move-exception
            defpackage.ge7.t(r8, r1)     // Catch: java.lang.Throwable -> L2ac
            throw r0     // Catch: java.lang.Throwable -> L2ac
        L2b5:
            throw r1     // Catch: java.lang.Throwable -> L2b6
        L2b6:
            r0 = move-exception
            defpackage.ge7.t(r6, r1)
            throw r0
        L2bb:
            r1 = r18
            rw7 r1 = (defpackage.rw7) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            xb1 r2 = defpackage.xb1.b
            xb1 r1 = r1.b
            byte[] r1 = defpackage.u24.H(r1)
            r0.d(r1, r13)
            return
        L2d6:
            r1 = r18
            pw7 r1 = (defpackage.pw7) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            java.lang.String r1 = r1.b
            r0.w(r13, r1)
            return
        L2eb:
            r1 = r18
            nx6 r1 = (defpackage.nx6) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            int r2 = r1.b
            long r2 = (long) r2
            r0.c(r13, r2)
            int r1 = r1.c
            long r1 = (long) r1
            r0.c(r12, r1)
            return
        L307:
            r1 = r18
            ea5 r1 = (defpackage.ea5) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L31e
            r0.f(r13)
            goto L321
        L31e:
            r0.w(r13, r2)
        L321:
            java.lang.String r2 = r1.c
            r0.w(r12, r2)
            java.lang.String r1 = r1.d
            r0.w(r11, r1)
            return
        L32c:
            r1 = r18
            fa5 r1 = (defpackage.fa5) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            long r1 = r1.b
            r0.c(r13, r1)
            return
        L341:
            r1 = r18
            ab5 r1 = (defpackage.ab5) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            long r2 = r1.b
            r0.c(r13, r2)
            boolean r2 = r1.c
            long r2 = (long) r2
            r0.c(r12, r2)
            long r1 = r1.d
            r0.c(r11, r1)
            return
        L361:
            r1 = r18
            fb5 r1 = (defpackage.fb5) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            long r2 = r1.b
            r0.c(r13, r2)
            boolean r2 = r1.c
            long r2 = (long) r2
            r0.c(r12, r2)
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.c(r11, r1)
            return
        L382:
            r1 = r18
            va5 r1 = (defpackage.va5) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            long r2 = r1.b
            r0.c(r13, r2)
            long r2 = r1.c
            r0.c(r12, r2)
            java.lang.String r2 = r1.d
            r0.w(r11, r2)
            java.lang.String r2 = r1.e
            r0.w(r10, r2)
            boolean r2 = r1.f
            long r2 = (long) r2
            r0.c(r9, r2)
            java.lang.String r2 = r1.g
            r0.w(r8, r2)
            java.lang.String r2 = r1.h
            r0.w(r6, r2)
            boolean r1 = r1.i
            long r1 = (long) r1
            r0.c(r5, r1)
            return
        L3bc:
            r1 = r18
            p75 r1 = (defpackage.p75) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            long r2 = r1.b
            r0.c(r13, r2)
            long r2 = r1.c
            r0.c(r12, r2)
            int r2 = r1.d
            long r2 = (long) r2
            r0.c(r11, r2)
            int r2 = r1.e
            long r2 = (long) r2
            r0.c(r10, r2)
            java.lang.String r2 = r1.f
            r0.w(r9, r2)
            java.lang.String r2 = r1.g
            r0.w(r8, r2)
            int r2 = r1.h
            long r2 = (long) r2
            r0.c(r6, r2)
            int r2 = r1.i
            long r2 = (long) r2
            r0.c(r5, r2)
            java.lang.String r2 = r1.j
            r0.w(r7, r2)
            java.lang.String r2 = r1.k
            r0.w(r4, r2)
            java.lang.String r2 = r1.l
            r3 = 12
            r0.w(r3, r2)
            int r1 = r1.m
            long r1 = (long) r1
            r3 = 13
            r0.c(r3, r1)
            return
        L411:
            r1 = r18
            t75 r1 = (defpackage.t75) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            long r2 = r1.b
            r0.c(r13, r2)
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L42d
            r0.f(r12)
            goto L430
        L42d:
            r0.w(r12, r2)
        L430:
            java.lang.String r2 = r1.d
            r0.w(r11, r2)
            java.lang.String r1 = r1.e
            r0.w(r10, r1)
            return
        L43b:
            r1 = r18
            ia5 r1 = (defpackage.ia5) r1
            r0.getClass()
            r1.getClass()
            long r2 = r1.a
            r0.c(r14, r2)
            s83 r2 = r1.b
            r3 = 0
            if (r2 == 0) goto L458
            long r4 = r2.b()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L459
        L458:
            r2 = r3
        L459:
            if (r2 != 0) goto L45f
            r0.f(r13)
            goto L466
        L45f:
            long r4 = r2.longValue()
            r0.c(r13, r4)
        L466:
            s83 r2 = r1.c
            if (r2 == 0) goto L473
            long r4 = r2.b()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L474
        L473:
            r2 = r3
        L474:
            if (r2 != 0) goto L47a
            r0.f(r12)
            goto L481
        L47a:
            long r4 = r2.longValue()
            r0.c(r12, r4)
        L481:
            s83 r1 = r1.d
            if (r1 == 0) goto L48d
            long r1 = r1.b()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
        L48d:
            if (r3 != 0) goto L493
            r0.f(r11)
            goto L49a
        L493:
            long r1 = r3.longValue()
            r0.c(r11, r1)
        L49a:
            return
        L49b:
            r1 = r18
            b15 r1 = (defpackage.b15) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            java.lang.Long r1 = r1.b
            long r1 = r1.longValue()
            r0.c(r13, r1)
            return
        L4b4:
            r1 = r18
            lp2 r1 = (defpackage.lp2) r1
            r0.getClass()
            r1.getClass()
            java.lang.Long r2 = r1.a
            if (r2 != 0) goto L4c6
            r0.f(r14)
            goto L4cd
        L4c6:
            long r2 = r2.longValue()
            r0.c(r14, r2)
        L4cd:
            java.lang.String r2 = r1.b
            r0.w(r13, r2)
            java.lang.String r2 = r1.c
            r0.w(r12, r2)
            java.lang.String r1 = r1.d
            r0.w(r11, r1)
            return
        L4dd:
            r1 = r18
            vh1 r1 = (defpackage.vh1) r1
            r0.getClass()
            r1.getClass()
            java.lang.String r2 = r1.a
            r0.w(r14, r2)
            java.lang.String r1 = r1.b
            r0.w(r13, r1)
            return
        L4f2:
            r1 = r18
            cn0 r1 = (defpackage.cn0) r1
            r0.getClass()
            r1.getClass()
            java.lang.Long r2 = r1.a
            if (r2 != 0) goto L504
            r0.f(r14)
            goto L50b
        L504:
            long r2 = r2.longValue()
            r0.c(r14, r2)
        L50b:
            long r2 = r1.b
            r0.c(r13, r2)
            java.lang.String r1 = r1.c
            r0.w(r12, r1)
            return
        L516:
            r1 = r18
            ym0 r1 = (defpackage.ym0) r1
            r0.getClass()
            r1.getClass()
            java.lang.Long r2 = r1.a
            if (r2 != 0) goto L528
            r0.f(r14)
            goto L52f
        L528:
            long r2 = r2.longValue()
            r0.c(r14, r2)
        L52f:
            java.lang.String r1 = r1.b
            r0.w(r13, r1)
            return
        L535:
            r1 = r18
            zm0 r1 = (defpackage.zm0) r1
            r0.getClass()
            r1.getClass()
            java.lang.Long r2 = r1.a
            if (r2 != 0) goto L547
            r0.f(r14)
            goto L54e
        L547:
            long r2 = r2.longValue()
            r0.c(r14, r2)
        L54e:
            long r2 = r1.b
            r0.c(r13, r2)
            long r2 = r1.c
            r0.c(r12, r2)
            java.lang.String r2 = r1.d
            r0.w(r11, r2)
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L565
            r0.f(r10)
            goto L568
        L565:
            r0.w(r10, r2)
        L568:
            java.lang.String r2 = r1.f
            r0.w(r9, r2)
            boolean r1 = r1.g
            long r1 = (long) r1
            r0.c(r8, r1)
            return
        L574:
            r1 = r18
            zm0 r1 = (defpackage.zm0) r1
            r0.getClass()
            r1.getClass()
            java.lang.Long r2 = r1.a
            if (r2 != 0) goto L586
            r0.f(r14)
            goto L58d
        L586:
            long r2 = r2.longValue()
            r0.c(r14, r2)
        L58d:
            long r2 = r1.b
            r0.c(r13, r2)
            long r2 = r1.c
            r0.c(r12, r2)
            java.lang.String r2 = r1.d
            r0.w(r11, r2)
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L5a4
            r0.f(r10)
            goto L5a7
        L5a4:
            r0.w(r10, r2)
        L5a7:
            java.lang.String r2 = r1.f
            r0.w(r9, r2)
            boolean r1 = r1.g
            long r1 = (long) r1
            r0.c(r8, r1)
            return
    }
}
