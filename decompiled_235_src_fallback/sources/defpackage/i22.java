package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i22  reason: default package */
/* loaded from: classes.dex */
public final class i22 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.o75 X;
    public boolean Y;
    public boolean Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.sz1.c f0;
    public final /* synthetic */ defpackage.sz1 g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig i0;

    public i22(defpackage.sz1.c r1, defpackage.sz1 r2, long r3, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r5, defpackage.r41 r6) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r0.h0 = r3
            r0.i0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            i22 r0 = (defpackage.i22) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            i22 r0 = new i22
            long r3 = r7.h0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r5 = r7.i0
            sz1$c r1 = r7.f0
            sz1 r2 = r7.g0
            r6 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            r0.e0 = r9
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r39) {
            r38 = this;
            r5 = r38
            sz1 r7 = r5.g0
            pn5 r0 = r7.g
            jf4 r8 = r7.o
            sx1 r9 = r7.w
            java.lang.Object r1 = r5.e0
            r10 = r1
            w61 r10 = (defpackage.w61) r10
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r5.d0
            java.lang.String r13 = "game_hash"
            java.lang.String r14 = "expected_api"
            java.lang.String r15 = "submit_path"
            java.lang.String r2 = "achievement_submit_expected"
            java.lang.String r4 = "session_mode"
            java.lang.String r6 = "game_id"
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = r5.i0
            sz1$c r12 = r5.f0
            r17 = r8
            java.lang.String r8 = "hardcore"
            r18 = r13
            java.lang.String r13 = "achievement_id"
            r19 = r14
            jg7 r14 = defpackage.jg7.a
            r20 = r14
            r21 = r15
            r22 = 0
            long r14 = r5.h0
            switch(r1) {
                case 0: goto Laf;
                case 1: goto L9a;
                case 2: goto L79;
                case 3: goto L74;
                case 4: goto L5b;
                case 5: goto L57;
                case 6: goto L44;
                case 7: goto L40;
                default: goto L3a;
            }
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r22
        L40:
            defpackage.oi2.Y(r39)
            return r20
        L44:
            boolean r0 = r5.Z
            boolean r1 = r5.Y
            o75 r2 = r5.X
            defpackage.oi2.Y(r39)
            r4 = r39
            r28 = r3
            r3 = r2
            r2 = r6
            r6 = r5
            r5 = r8
            goto L2bb
        L57:
            defpackage.oi2.Y(r39)
            return r20
        L5b:
            boolean r0 = r5.Y
            o75 r1 = r5.X
            defpackage.oi2.Y(r39)
            r24 = r2
            r28 = r3
            r29 = r4
            r2 = r6
            r4 = r10
            r3 = r18
            r12 = r19
            r10 = r21
            r6 = r5
            r5 = r8
            goto L286
        L74:
            defpackage.oi2.Y(r39)
            goto L257
        L79:
            boolean r0 = r5.Z
            boolean r1 = r5.Y
            r23 = r0
            o75 r0 = r5.X
            defpackage.oi2.Y(r39)
            r16 = r1
            r28 = r3
            r29 = r4
            r30 = r6
            r27 = r8
            r1 = r0
            r8 = r2
            r6 = r5
            r5 = r23
            r0 = r39
            r23 = r10
            r10 = 2
            goto L172
        L9a:
            defpackage.oi2.Y(r39)
            r1 = r39
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r23 = r0
            r0 = r1
            r24 = r2
            r26 = r4
            r25 = r6
            r27 = r8
            goto L111
        Laf:
            defpackage.oi2.Y(r39)
            sz1$c r1 = defpackage.sz1.c.DISABLED
            if (r12 != r1) goto Lbc
            java.lang.String r0 = "runtime_disabled"
            r7.h0(r14, r0)
            return r20
        Lbc:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r23 = r0
            vr4 r0 = new vr4
            r0.<init>(r13, r1)
            sz1$b r1 = r7.G
            java.lang.String r1 = r1.name()
            r24 = r2
            vr4 r2 = new vr4
            r25 = r6
            java.lang.String r6 = "network_mode"
            r2.<init>(r6, r1)
            sz1$d r1 = r7.H
            java.lang.String r1 = r1.name()
            vr4 r6 = new vr4
            r6.<init>(r4, r1)
            boolean r1 = r17.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r26 = r4
            vr4 r4 = new vr4
            r27 = r8
            java.lang.String r8 = "online"
            r4.<init>(r8, r1)
            vr4[] r0 = new defpackage.vr4[]{r0, r2, r6, r4}
            java.lang.String r1 = "achievement_trigger_received"
            r7.H0(r1, r0)
            r5.e0 = r10
            r0 = 1
            r5.d0 = r0
            r0 = r23
            pl r0 = (defpackage.pl) r0
            java.lang.Object r0 = r0.h(r14, r5)
            if (r0 != r11) goto L111
            goto L3ed
        L111:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L117
            r0 = r22
        L117:
            r8 = r0
            o75 r8 = (defpackage.o75) r8
            sz1$c r0 = r7.O
            if (r0 != r12) goto L122
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = r7.N
            if (r0 == r3) goto L125
        L122:
            r0 = r7
            goto L3ef
        L125:
            kd6 r0 = r7.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "ra_encore_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L1aa
            if (r8 == 0) goto L1aa
            boolean r1 = r9.a
            r4 = r3
            long r2 = r8.b
            r5.e0 = r10
            r5.X = r8
            r5.Y = r0
            r5.Z = r1
            r6 = 2
            r5.d0 = r6
            r16 = r23
            pl r16 = (defpackage.pl) r16
            r23 = r1
            r1 = r2
            r28 = r4
            long r3 = r5.h0
            r39 = r16
            r16 = r0
            r0 = r39
            r39 = r6
            r6 = r5
            r5 = r23
            r23 = r10
            r10 = r39
            r39 = r8
            r8 = r24
            r30 = r25
            r29 = r26
            java.io.Serializable r0 = r0.r(r1, r3, r5, r6)
            if (r0 != r11) goto L170
            goto L3ed
        L170:
            r1 = r39
        L172:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a5
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            vr4 r1 = new vr4
            r1.<init>(r13, r0)
            vr4 r0 = new vr4
            java.lang.String r2 = "reason"
            java.lang.String r3 = "already_unlocked_no_encore"
            r0.<init>(r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            vr4 r4 = new vr4
            r5 = r27
            r4.<init>(r5, r2)
            vr4[] r0 = new defpackage.vr4[]{r1, r0, r4}
            java.lang.String r1 = "achievement_trigger_suppressed"
            r7.H0(r1, r0)
            r7.h0(r14, r3)
            return r20
        L1a5:
            r5 = r27
        L1a7:
            r0 = r16
            goto L1bf
        L1aa:
            r16 = r0
            r28 = r3
            r6 = r5
            r39 = r8
            r23 = r10
            r8 = r24
            r30 = r25
            r29 = r26
            r5 = r27
            r10 = 2
            r1 = r39
            goto L1a7
        L1bf:
            sz1$c r2 = defpackage.sz1.c.RC_CLIENT
            if (r12 != r2) goto L25d
            i6 r2 = defpackage.i6.RC_CLIENT
            r2.getClass()
            int[] r3 = defpackage.j6.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L1df
            if (r2 != r10) goto L1db
            java.lang.String r0 = "rc_client achievement ownership cannot invoke Kotlin submit"
            defpackage.i.m(r0)
            return r22
        L1db:
            defpackage.i.d()
            return r22
        L1df:
            h6 r2 = defpackage.h6.RUNTIME_OWNS_SUBMIT
            if (r1 == 0) goto L257
            boolean r2 = r9.a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r14)
            vr4 r4 = new vr4
            r4.<init>(r13, r3)
            vr4 r3 = new vr4
            java.lang.String r9 = "rc_client_http"
            r10 = r21
            r3.<init>(r10, r9)
            vr4 r9 = new vr4
            java.lang.String r10 = "awardachievement"
            r12 = r19
            r9.<init>(r12, r10)
            long r12 = r1.b
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r12)
            vr4 r12 = new vr4
            r13 = r30
            r12.<init>(r13, r10)
            pq5 r10 = r7.n1
            if (r10 == 0) goto L216
            java.lang.String r10 = r10.i
            goto L218
        L216:
            r10 = r22
        L218:
            vr4 r13 = new vr4
            r24 = r3
            r3 = r18
            r13.<init>(r3, r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            vr4 r10 = new vr4
            r10.<init>(r5, r3)
            r23 = r4
            r25 = r9
            r28 = r10
            r26 = r12
            r27 = r13
            vr4[] r3 = new defpackage.vr4[]{r23, r24, r25, r26, r27, r28}
            r7.G0(r8, r3)
            of6 r3 = r7.F0
            q95 r4 = new q95
            r4.<init>(r1)
            r1 = r22
            r6.e0 = r1
            r6.X = r1
            r6.Y = r0
            r6.Z = r2
            r0 = 3
            r6.d0 = r0
            java.lang.Object r0 = r3.a(r4, r6)
            if (r0 != r11) goto L257
            goto L3ed
        L257:
            java.lang.String r0 = "owned_by_rc_client"
            r7.h0(r14, r0)
            return r20
        L25d:
            r3 = r18
            r12 = r19
            r10 = r21
            r2 = r30
            sz1$b r4 = r7.G
            r24 = r8
            sz1$b r8 = defpackage.sz1.b.ONLINE_LIVE
            if (r4 != r8) goto L28c
            boolean r4 = r17.a()
            if (r4 != 0) goto L28c
            r4 = r23
            r6.e0 = r4
            r6.X = r1
            r6.Y = r0
            r8 = 4
            r6.d0 = r8
            java.lang.Object r8 = r7.f1(r6)
            if (r8 != r11) goto L286
            goto L3ed
        L286:
            r37 = r1
            r1 = r0
            r0 = r37
            goto L28f
        L28c:
            r4 = r23
            goto L286
        L28f:
            sz1$b r8 = r7.G
            r18 = r3
            sz1$b r3 = defpackage.sz1.b.OFFLINE_ACCUMULATING
            if (r8 == r3) goto L29b
            sz1$b r3 = defpackage.sz1.b.RECONCILING_RA_SUBMISSIONS
            if (r8 != r3) goto L29f
        L29b:
            r8 = 0
            r9 = 1
            goto L344
        L29f:
            if (r0 == 0) goto L33c
            boolean r3 = r9.a
            r6.e0 = r4
            r6.X = r0
            r6.Y = r1
            r6.Z = r3
            r4 = 6
            r6.d0 = r4
            java.lang.Object r4 = defpackage.sz1.n(r7, r0, r6)
            if (r4 != r11) goto L2b6
            goto L3ed
        L2b6:
            r37 = r3
            r3 = r0
            r0 = r37
        L2bb:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L2c9
            java.lang.String r0 = "context_mismatch"
            r7.h0(r14, r0)
            return r20
        L2c9:
            hb5 r4 = defpackage.sz1.W0(r28)
            if (r4 != 0) goto L2d5
            java.lang.String r0 = "missing_runtime_authentication"
            r7.h0(r14, r0)
            return r20
        L2d5:
            if (r0 == 0) goto L2eb
            r8 = 0
            r6.e0 = r8
            r6.X = r8
            r6.Y = r1
            r6.Z = r0
            r0 = 7
            r6.d0 = r0
            java.lang.Object r0 = r7.u0(r3, r4, r6)
            if (r0 != r11) goto L3ee
            goto L3ed
        L2eb:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            vr4 r1 = new vr4
            r1.<init>(r13, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vr4 r6 = new vr4
            r6.<init>(r5, r0)
            java.lang.Long r0 = r7.L
            vr4 r5 = new vr4
            r5.<init>(r2, r0)
            vr4[] r0 = new defpackage.vr4[]{r1, r6, r5}
            java.lang.String r1 = "achievement_submit_attempt"
            r7.H0(r1, r0)
            ci0 r0 = r7.x
            r0.getClass()
            r3.getClass()
            java.lang.Object r1 = r0.g
            tp6 r1 = (defpackage.tp6) r1
        L318:
            java.lang.Object r2 = r1.getValue()
            r5 = r2
            java.util.List r5 = (java.util.List) r5
            tn5 r6 = new tn5
            r8 = 0
            r9 = 1
            r6.<init>(r3, r8, r4, r9)
            java.util.ArrayList r5 = defpackage.gt0.U0(r6, r5)
            boolean r2 = r1.j(r2, r5)
            if (r2 == 0) goto L318
            java.lang.Object r0 = r0.f
            v80 r0 = (defpackage.v80) r0
            if (r0 == 0) goto L3ee
            r2 = r20
            r0.c(r2)
            return r2
        L33c:
            r2 = r20
            java.lang.String r0 = "achievement_missing"
            r7.h0(r14, r0)
            return r2
        L344:
            boolean r3 = r7.I
            if (r3 == 0) goto L34b
            if (r0 == 0) goto L34b
            r8 = r9
        L34b:
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r14)
            vr4 r4 = new vr4
            r4.<init>(r13, r3)
            if (r8 == 0) goto L35a
            java.lang.String r3 = "hardcore_memory_queue"
            goto L35c
        L35a:
            java.lang.String r3 = "offline_ledger"
        L35c:
            vr4 r9 = new vr4
            r9.<init>(r10, r3)
            if (r8 == 0) goto L366
            java.lang.String r3 = "awardachievement_retry_in_session"
            goto L368
        L366:
            java.lang.String r3 = "awardachievement_after_smart_sync"
        L368:
            vr4 r10 = new vr4
            r10.<init>(r12, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            vr4 r12 = new vr4
            r39 = r0
            java.lang.String r0 = "pending_sync"
            r12.<init>(r0, r3)
            java.lang.Long r0 = r7.L
            vr4 r3 = new vr4
            r3.<init>(r2, r0)
            pq5 r0 = r7.n1
            if (r0 == 0) goto L386
            java.lang.String r0 = r0.i
            goto L387
        L386:
            r0 = 0
        L387:
            vr4 r2 = new vr4
            r34 = r3
            r3 = r18
            r2.<init>(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            vr4 r3 = new vr4
            r3.<init>(r5, r0)
            r35 = r2
            r36 = r3
            r30 = r4
            r31 = r9
            r32 = r10
            r33 = r12
            vr4[] r0 = new defpackage.vr4[]{r30, r31, r32, r33, r34, r35, r36}
            r8 = r24
            r7.G0(r8, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            vr4 r2 = new vr4
            r2.<init>(r13, r0)
            sz1$d r0 = r7.H
            java.lang.String r0 = r0.name()
            vr4 r3 = new vr4
            r4 = r29
            r3.<init>(r4, r0)
            vr4[] r0 = new defpackage.vr4[]{r2, r3}
            java.lang.String r2 = "achievement_trigger_offline_queued"
            r7.H0(r2, r0)
            java.lang.String r0 = "offline_queued"
            r7.h0(r14, r0)
            hb5 r4 = defpackage.sz1.W0(r28)
            r8 = 0
            r6.e0 = r8
            r6.X = r8
            r6.Y = r1
            r0 = 5
            r6.d0 = r0
            long r1 = r6.h0
            r3 = r39
            r5 = r6
            r0 = r7
            java.lang.Object r0 = defpackage.sz1.B(r0, r1, r3, r4, r5)
            if (r0 != r11) goto L3ee
        L3ed:
            return r11
        L3ee:
            return r20
        L3ef:
            java.lang.String r1 = "stale_runtime_event"
            r0.h0(r14, r1)
            return r20
    }
}
