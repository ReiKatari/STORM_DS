package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c32  reason: default package */
/* loaded from: classes.dex */
public final class c32 implements defpackage.ne2 {
    public final /* synthetic */ defpackage.sz1 A;

    public c32(defpackage.sz1 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r24, defpackage.r41 r25) {
            r23 = this;
            r0 = r25
            r1 = r24
            l95 r1 = (defpackage.l95) r1
            java.lang.String r2 = "reason"
            java.lang.String r3 = "kotlin_submit"
            i95 r4 = defpackage.i95.a
            u85 r5 = defpackage.u85.a
            java.lang.String r6 = "result_code"
            java.lang.String r7 = "related_id"
            java.lang.String r8 = "api"
            java.lang.String r9 = "leaderboard_id"
            jg7 r10 = defpackage.jg7.a
            r11 = r23
            sz1 r12 = r11.A
            java.lang.String r11 = "runtime_event_kotlin_received"
            java.lang.String r13 = "event"
            java.lang.Class r14 = r1.getClass()
            ar0 r14 = defpackage.gh5.a(r14)
            java.lang.String r14 = r14.c()
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            java.lang.String r13 = "runtime_path"
            sz1$c r14 = r12.O
            r24 = r10
            kd6 r10 = r12.c
            java.lang.String r14 = r14.name()
            r16 = r10
            vr4 r10 = new vr4
            r10.<init>(r13, r14)
            vr4[] r10 = new defpackage.vr4[]{r15, r10}
            r12.H0(r11, r10)
            java.lang.String r10 = "subset_id"
            boolean r11 = r1 instanceof defpackage.s85
            r17 = 0
            if (r11 == 0) goto L88
            java.util.LinkedHashMap r10 = r12.X
            r15 = r1
            s85 r15 = (defpackage.s85) r15
            long r14 = r15.a
            r18 = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            long r19 = java.lang.System.currentTimeMillis()
            r21 = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r19)
            r10.put(r11, r14)
            java.lang.String r10 = "runtime_event_achievement_triggered"
            java.lang.String r11 = "achievement_id"
            java.lang.Long r14 = java.lang.Long.valueOf(r21)
            vr4 r15 = new vr4
            r15.<init>(r11, r14)
            vr4[] r11 = new defpackage.vr4[]{r15}
            r12.H0(r10, r11)
            r19 = r2
        L83:
            r11 = r8
            r20 = r9
            goto L195
        L88:
            r18 = r11
            boolean r11 = r1 instanceof defpackage.x85
            if (r11 == 0) goto Lc8
            java.util.LinkedHashMap r10 = r12.Y
            r11 = r1
            x85 r11 = (defpackage.x85) r11
            long r14 = r11.a
            r19 = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r19)
            long r21 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r21)
            r10.put(r14, r15)
            java.lang.String r10 = "runtime_event_leaderboard_completed"
            java.lang.Long r14 = java.lang.Long.valueOf(r19)
            vr4 r15 = new vr4
            r15.<init>(r9, r14)
            java.lang.String r14 = "value"
            int r11 = r11.b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r19 = r2
            vr4 r2 = new vr4
            r2.<init>(r14, r11)
            vr4[] r2 = new defpackage.vr4[]{r15, r2}
            r12.H0(r10, r2)
            goto L83
        Lc8:
            r19 = r2
            boolean r2 = r1 instanceof defpackage.v85
            if (r2 == 0) goto Le6
            java.lang.String r2 = "runtime_event_game_completed"
            r11 = r1
            v85 r11 = (defpackage.v85) r11
            long r14 = r11.a
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            vr4 r14 = new vr4
            r14.<init>(r10, r11)
            vr4[] r10 = new defpackage.vr4[]{r14}
            r12.H0(r2, r10)
            goto L83
        Le6:
            boolean r2 = r1 instanceof defpackage.k95
            if (r2 == 0) goto L102
            java.lang.String r2 = "runtime_event_subset_completed"
            r11 = r1
            k95 r11 = (defpackage.k95) r11
            long r14 = r11.a
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            vr4 r14 = new vr4
            r14.<init>(r10, r11)
            vr4[] r10 = new defpackage.vr4[]{r14}
            r12.H0(r2, r10)
            goto L83
        L102:
            boolean r2 = r1 instanceof defpackage.j95
            if (r2 == 0) goto L133
            java.lang.String r2 = "runtime_event_server_error"
            r10 = r1
            j95 r10 = (defpackage.j95) r10
            java.lang.String r11 = r10.a
            vr4 r14 = new vr4
            r14.<init>(r8, r11)
            r11 = r8
            r20 = r9
            long r8 = r10.b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            vr4 r9 = new vr4
            r9.<init>(r7, r8)
            int r8 = r10.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            vr4 r10 = new vr4
            r10.<init>(r6, r8)
            vr4[] r8 = new defpackage.vr4[]{r14, r9, r10}
            r12.H0(r2, r8)
            goto L195
        L133:
            r11 = r8
            r20 = r9
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L145
            java.lang.String r2 = "runtime_event_disconnected"
            r8 = 0
            vr4[] r9 = new defpackage.vr4[r8]
            r12.H0(r2, r9)
            goto L195
        L145:
            r8 = 0
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L154
            java.lang.String r2 = "runtime_event_reconnected"
            vr4[] r9 = new defpackage.vr4[r8]
            r12.H0(r2, r9)
            goto L195
        L154:
            boolean r2 = r1 instanceof defpackage.p85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.t85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.r85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.q85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.y85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.a95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.z85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.c95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.d95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.w85
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.e95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.b95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.f95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.h95
            if (r2 != 0) goto L195
            boolean r2 = r1 instanceof defpackage.g95
            if (r2 == 0) goto L191
            goto L195
        L191:
            defpackage.i.d()
            return r17
        L195:
            boolean r2 = r1 instanceof defpackage.p85
            r8 = 3
            r9 = 1
            r15 = 0
            if (r2 == 0) goto L1bb
            p85 r1 = (defpackage.p85) r1
            long r13 = r1.a
            r10 = r16
            ng6 r10 = (defpackage.ng6) r10
            android.content.SharedPreferences r0 = r10.b
            java.lang.String r1 = "ra_active_challenge_indicators"
            boolean r0 = r0.getBoolean(r1, r9)
            if (r0 == 0) goto L46c
            o41 r0 = r12.z
            g22 r11 = new g22
            r16 = 0
            r11.<init>(r12, r13, r15, r16)
            defpackage.hv.L(r0, r15, r15, r11, r8)
            return r24
        L1bb:
            boolean r2 = r1 instanceof defpackage.t85
            if (r2 == 0) goto L1d1
            t85 r1 = (defpackage.t85) r1
            long r13 = r1.a
            o41 r0 = r12.z
            g22 r11 = new g22
            r16 = 1
            r11.<init>(r12, r13, r15, r16)
            r2 = r15
            defpackage.hv.L(r0, r2, r2, r11, r8)
            return r24
        L1d1:
            r2 = r15
            if (r18 == 0) goto L1ed
            s85 r1 = (defpackage.s85) r1
            long r14 = r1.a
            sz1$c r0 = r12.O
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r1 = r12.N
            o41 r3 = r12.z
            i22 r11 = new i22
            r17 = 0
            r16 = r1
            r13 = r12
            r12 = r0
            r11.<init>(r12, r13, r14, r16, r17)
            defpackage.hv.L(r3, r2, r2, r11, r8)
            return r24
        L1ed:
            boolean r10 = r1 instanceof defpackage.r85
            r14 = 2
            if (r10 == 0) goto L20d
            r85 r1 = (defpackage.r85) r1
            r10 = r16
            ng6 r10 = (defpackage.ng6) r10
            android.content.SharedPreferences r0 = r10.b
            java.lang.String r3 = "ra_progress_indicators"
            boolean r0 = r0.getBoolean(r3, r9)
            if (r0 == 0) goto L46c
            o41 r0 = r12.z
            u12 r3 = new u12
            r3.<init>(r12, r1, r2, r14)
            defpackage.hv.L(r0, r2, r2, r3, r8)
            return r24
        L20d:
            boolean r10 = r1 instanceof defpackage.v85
            if (r10 == 0) goto L223
            v85 r1 = (defpackage.v85) r1
            long r13 = r1.a
            o41 r0 = r12.z
            h22 r11 = new h22
            r16 = 2
            r15 = r2
            r11.<init>(r12, r13, r15, r16)
            defpackage.hv.L(r0, r15, r15, r11, r8)
            return r24
        L223:
            r15 = r2
            boolean r2 = r1 instanceof defpackage.k95
            if (r2 == 0) goto L239
            k95 r1 = (defpackage.k95) r1
            long r13 = r1.a
            o41 r0 = r12.z
            h22 r11 = new h22
            r16 = 2
            r11.<init>(r12, r13, r15, r16)
            defpackage.hv.L(r0, r15, r15, r11, r8)
            return r24
        L239:
            boolean r2 = r1 instanceof defpackage.j95
            if (r2 == 0) goto L2de
            j95 r1 = (defpackage.j95) r1
            java.lang.String r0 = r1.a
            java.lang.String r2 = "runtime_server_error"
            vr4 r4 = new vr4
            r4.<init>(r11, r0)
            r10 = r13
            long r13 = r1.b
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            vr4 r9 = new vr4
            r9.<init>(r7, r5)
            int r1 = r1.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            vr4 r15 = new vr4
            r15.<init>(r6, r5)
            vr4[] r4 = new defpackage.vr4[]{r4, r9, r15}
            r12.G0(r2, r4)
            vr4 r4 = new vr4
            r4.<init>(r11, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            vr4 r9 = new vr4
            r9.<init>(r7, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            vr4 r15 = new vr4
            r15.<init>(r6, r5)
            vr4[] r4 = new defpackage.vr4[]{r4, r9, r15}
            r12.H0(r2, r4)
            sz1$c r2 = r12.O
            sz1$c r4 = defpackage.sz1.c.RC_CLIENT
            if (r2 == r4) goto L2ab
            sz1$c r4 = defpackage.sz1.c.DISABLED
            if (r2 != r4) goto L28f
            goto L2ab
        L28f:
            java.lang.String r1 = "awardachievement"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L46c
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L46c
            o41 r0 = r12.z
            h22 r11 = new h22
            r15 = 0
            r16 = 1
            r11.<init>(r12, r13, r15, r16)
            defpackage.hv.L(r0, r15, r15, r11, r8)
            return r24
        L2ab:
            java.lang.String r2 = "runtime_server_error_not_owned_by_kotlin"
            vr4 r4 = new vr4
            r4.<init>(r11, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            vr4 r5 = new vr4
            r5.<init>(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            vr4 r1 = new vr4
            r1.<init>(r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vr4 r6 = new vr4
            r6.<init>(r3, r0)
            sz1$c r0 = r12.O
            java.lang.String r0 = r0.getTraceValue()
            vr4 r3 = new vr4
            r3.<init>(r10, r0)
            vr4[] r0 = new defpackage.vr4[]{r4, r5, r1, r6, r3}
            r12.G0(r2, r0)
            return r24
        L2de:
            r10 = r13
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L304
            java.lang.String r1 = "runtime_disconnected"
            r8 = 0
            vr4[] r2 = new defpackage.vr4[r8]
            r12.H0(r1, r2)
            q33 r2 = r12.f0
            monitor-enter(r2)
            r2.A = r9     // Catch: java.lang.Throwable -> L301
            monitor-exit(r2)
            java.lang.Object r0 = r12.f1(r0)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L2fc
            goto L2fe
        L2fc:
            r0 = r24
        L2fe:
            if (r0 != r1) goto L46c
            return r0
        L301:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L301
            throw r0
        L304:
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L316
            java.lang.String r0 = "runtime_reconnected"
            r8 = 0
            vr4[] r1 = new defpackage.vr4[r8]
            r12.H0(r0, r1)
            r12.R0()
            return r24
        L316:
            boolean r2 = r1 instanceof defpackage.y85
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.a95
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.z85
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.c95
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.d95
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.w85
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.e95
            if (r2 != 0) goto L463
            boolean r2 = r1 instanceof defpackage.b95
            if (r2 == 0) goto L338
            goto L463
        L338:
            boolean r2 = r1 instanceof defpackage.x85
            if (r2 == 0) goto L3e3
            r13 = r1
            x85 r13 = (defpackage.x85) r13
            us3 r0 = defpackage.us3.a
            sz1$c r1 = r12.O
            int[] r2 = defpackage.wz1.j
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r9) goto L35e
            if (r1 == r14) goto L35e
            if (r1 == r8) goto L35b
            r2 = 4
            if (r1 != r2) goto L357
            ws3 r1 = defpackage.ws3.NONE
            goto L360
        L357:
            defpackage.i.d()
            return r17
        L35b:
            ws3 r1 = defpackage.ws3.LEGACY
            goto L360
        L35e:
            ws3 r1 = defpackage.ws3.RC_CLIENT
        L360:
            r1.getClass()
            long r4 = r13.a
            ts3 r2 = defpackage.ts3.a
            int[] r6 = defpackage.xs3.a
            int r7 = r1.ordinal()
            r6 = r6[r7]
            if (r6 == r9) goto L383
            if (r6 == r14) goto L383
            if (r6 != r8) goto L37f
            vs3 r6 = new vs3
            int r7 = r13.b
            java.lang.String r9 = r13.c
            r6.<init>(r9, r7, r4)
            goto L384
        L37f:
            defpackage.i.d()
            return r17
        L383:
            r6 = r2
        L384:
            boolean r7 = r6 instanceof defpackage.vs3
            if (r7 == 0) goto L397
            r14 = r6
            vs3 r14 = (defpackage.vs3) r14
            o41 r9 = r12.z
            u12 r11 = new u12
            r16 = 4
            r11.<init>(r12, r13, r14, r15, r16)
            defpackage.hv.L(r9, r15, r15, r11, r8)
        L397:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L3ac
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L3a4
            goto L3ac
        L3a4:
            if (r7 == 0) goto L3a8
            goto L46c
        L3a8:
            defpackage.i.d()
            return r17
        L3ac:
            java.lang.String r0 = "leaderboard_legacy_completion_ignored"
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            vr4 r4 = new vr4
            r5 = r20
            r4.<init>(r5, r2)
            sz1$c r2 = r12.O
            java.lang.String r2 = r2.getTraceValue()
            vr4 r5 = new vr4
            r5.<init>(r10, r2)
            ws3 r2 = defpackage.ws3.RC_CLIENT
            if (r1 != r2) goto L3cb
            java.lang.String r1 = "rc_client_owns_submit"
            goto L3cd
        L3cb:
            java.lang.String r1 = "no_submit_owner"
        L3cd:
            vr4 r2 = new vr4
            r6 = r19
            r2.<init>(r6, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vr4 r6 = new vr4
            r6.<init>(r3, r1)
            vr4[] r1 = new defpackage.vr4[]{r4, r5, r2, r6}
            r12.C0(r0, r1)
            return r24
        L3e3:
            r6 = r19
            boolean r2 = r1 instanceof defpackage.q85
            if (r2 == 0) goto L3fa
            q85 r1 = (defpackage.q85) r1
            long r13 = r1.a
            o41 r0 = r12.z
            h22 r11 = new h22
            r16 = 0
            r11.<init>(r12, r13, r15, r16)
            defpackage.hv.L(r0, r15, r15, r11, r8)
            return r24
        L3fa:
            boolean r2 = r1 instanceof defpackage.f95
            if (r2 == 0) goto L409
            f95 r1 = (defpackage.f95) r1
            java.lang.Object r0 = defpackage.sz1.J(r12, r1, r0)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L46c
            return r0
        L409:
            boolean r2 = r1 instanceof defpackage.h95
            if (r2 == 0) goto L418
            h95 r1 = (defpackage.h95) r1
            java.lang.Object r0 = defpackage.sz1.K(r12, r1, r0)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L46c
            return r0
        L418:
            boolean r0 = r1 instanceof defpackage.g95
            if (r0 == 0) goto L45f
            g95 r1 = (defpackage.g95) r1
            long r2 = r1.b
            long r0 = r1.a
            nv4 r4 = r12.b0
            if (r4 == 0) goto L443
            gd5 r4 = r4.a
            long r7 = r4.e
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 != 0) goto L443
            boolean r4 = r12.O0(r4)
            if (r4 != 0) goto L435
            goto L443
        L435:
            tp6 r4 = r12.i0
            tz1 r5 = new tz1
            r5.<init>(r0, r2)
            r4.getClass()
            r4.m(r15, r5)
            return r24
        L443:
            java.lang.String r0 = "ra_pending_barrier_rejected"
            java.lang.String r1 = "barrier_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            vr4 r3 = new vr4
            r3.<init>(r1, r2)
            java.lang.String r1 = "submission_session_mismatch"
            vr4 r2 = new vr4
            r2.<init>(r6, r1)
            vr4[] r1 = new defpackage.vr4[]{r3, r2}
            r12.G0(r0, r1)
            return r24
        L45f:
            defpackage.i.d()
            return r17
        L463:
            java.lang.Object r0 = defpackage.sz1.L(r12, r1, r0)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L46c
            return r0
        L46c:
            return r24
    }
}
