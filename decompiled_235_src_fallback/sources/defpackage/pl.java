package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl  reason: default package */
/* loaded from: classes.dex */
public final class pl implements defpackage.pn5 {
    public final defpackage.l85 a;
    public final defpackage.qf4 b;
    public final defpackage.hk c;
    public final defpackage.jk d;
    public final android.content.SharedPreferences e;
    public final android.content.Context f;
    public final defpackage.cn5 g;
    public final defpackage.bk1 h;

    public pl(defpackage.l85 r1, defpackage.qf4 r2, defpackage.hk r3, defpackage.jk r4, android.content.SharedPreferences r5, android.content.Context r6, defpackage.cn5 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            bk1 r1 = new bk1
            r2 = 7
            r1.<init>(r2)
            r0.h = r1
            return
    }

    public static void t(java.lang.String r5, defpackage.vr4... r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "event_type="
            r0.<init>(r1)
            r0.append(r5)
            int r5 = r6.length
            r1 = 0
        Lc:
            if (r1 >= r5) goto L35
            r2 = r6[r1]
            java.lang.Object r3 = r2.A
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.B
            if (r2 == 0) goto L32
            r4 = 32
            r0.append(r4)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 95
            java.lang.String r2 = defpackage.xs6.d0(r2, r4, r3)
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto Lc
        L35:
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "RASubmission"
            android.util.Log.i(r6, r5)
            return
    }

    public final java.lang.Object A(java.lang.String r12, boolean r13, defpackage.s41 r14) {
            r11 = this;
            boolean r0 = r14 instanceof defpackage.kl
            if (r0 == 0) goto L14
            r0 = r14
            kl r0 = (defpackage.kl) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e0 = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kl r0 = new kl
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.Z
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.e0
            r2 = 0
            r3 = 2
            r5 = 1
            java.lang.String r7 = "hardcore"
            java.lang.String r8 = "game_id"
            java.lang.String r9 = "game_hash"
            if (r1 == 0) goto L52
            if (r1 == r5) goto L44
            if (r1 != r3) goto L3e
            long r12 = r4.Y
            boolean r0 = r4.X
            java.lang.String r1 = r4.R
            defpackage.oi2.Y(r14)
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r14 = r14.A
            goto La5
        L3e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r2
        L44:
            boolean r13 = r4.X
            java.lang.String r12 = r4.R
            defpackage.oi2.Y(r14)
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r14 = r14.A
        L4f:
            r5 = r12
            r6 = r13
            goto L63
        L52:
            defpackage.oi2.Y(r14)
            r4.R = r12
            r4.X = r13
            r4.e0 = r5
            r14 = 0
            java.lang.Object r14 = r11.k(r12, r14, r4)
            if (r14 != r0) goto L4f
            goto La1
        L63:
            boolean r12 = r14 instanceof defpackage.em5
            if (r12 == 0) goto L68
            goto L69
        L68:
            r2 = r14
        L69:
            ga5 r2 = (defpackage.ga5) r2
            if (r2 == 0) goto L10c
            long r12 = r2.a
            vr4 r14 = new vr4
            r14.<init>(r9, r5)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            vr4 r2 = new vr4
            r2.<init>(r8, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            vr4 r10 = new vr4
            r10.<init>(r7, r1)
            vr4[] r14 = new defpackage.vr4[]{r14, r2, r10}
            java.lang.String r1 = "session_start_attempt"
            r11.u(r1, r14)
            r4.R = r5
            r4.X = r6
            r4.Y = r12
            r4.e0 = r3
            l85 r1 = r11.a
            r2 = r12
            java.lang.Object r14 = r1.t(r2, r4, r5, r6)
            if (r14 != r0) goto La2
        La1:
            return r0
        La2:
            r12 = r2
            r1 = r5
            r0 = r6
        La5:
            boolean r2 = r14 instanceof defpackage.em5
            if (r2 != 0) goto Lcd
            r2 = r14
            jg7 r2 = (defpackage.jg7) r2
            vr4 r2 = new vr4
            r2.<init>(r9, r1)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r12)
            vr4 r4 = new vr4
            r4.<init>(r8, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            vr4 r5 = new vr4
            r5.<init>(r7, r3)
            vr4[] r2 = new defpackage.vr4[]{r2, r4, r5}
            java.lang.String r3 = "session_start_success"
            r11.u(r3, r2)
        Lcd:
            java.lang.Throwable r2 = defpackage.hm5.a(r14)
            if (r2 == 0) goto L10b
            vr4 r3 = new vr4
            r3.<init>(r9, r1)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            vr4 r12 = new vr4
            r12.<init>(r8, r1)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            vr4 r0 = new vr4
            r0.<init>(r7, r13)
            java.lang.Class r13 = r2.getClass()
            ar0 r13 = defpackage.gh5.a(r13)
            java.lang.String r13 = r13.c()
            if (r13 != 0) goto Lfb
            java.lang.String r13 = "Unknown"
        Lfb:
            vr4 r1 = new vr4
            java.lang.String r2 = "error"
            r1.<init>(r2, r13)
            vr4[] r12 = new defpackage.vr4[]{r3, r12, r0, r1}
            java.lang.String r13 = "session_start_failed"
            r11.u(r13, r12)
        L10b:
            return r14
        L10c:
            ha5 r11 = new ha5
            r5.getClass()
            java.lang.String r12 = "There is no game for hash "
            java.lang.String r12 = r12.concat(r5)
            r11.<init>(r12)
            em5 r12 = new em5
            r12.<init>(r11)
            return r12
    }

    public final java.lang.Object B(long r40, long r42, boolean r44, java.lang.Long r45, defpackage.hb5 r46, defpackage.s41 r47) {
            r39 = this;
            r0 = r39
            r1 = r47
            boolean r2 = r1 instanceof defpackage.ll
            if (r2 == 0) goto L18
            r2 = r1
            ll r2 = (defpackage.ll) r2
            int r3 = r2.m0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.m0 = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ll r2 = new ll
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.k0
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.m0
            java.lang.String r10 = "offset_seconds"
            java.lang.String r11 = "awardachievement"
            java.lang.String r12 = "expected_api"
            java.lang.String r13 = "kotlin_api"
            java.lang.String r14 = "game_hash"
            qf4 r15 = r0.b
            java.lang.String r3 = "submit_path"
            java.lang.String r4 = "hardcore"
            java.lang.String r5 = "game_id"
            java.lang.String r6 = "achievement_id"
            r7 = 0
            switch(r2) {
                case 0: goto L177;
                case 1: goto L14e;
                case 2: goto L11e;
                case 3: goto Ldd;
                case 4: goto L9c;
                case 5: goto L61;
                case 6: goto L42;
                default: goto L3c;
            }
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L42:
            long r9 = r8.X
            long r11 = r8.R
            ab5 r2 = r8.j0
            o85 r7 = r8.i0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r7 = r8.h0
            defpackage.oi2.Y(r1)
            r1 = r2
            r13 = r3
            r2 = r6
            r35 = r11
            r11 = r0
            r37 = r9
            r10 = r4
            r9 = r5
            r3 = r37
            r5 = r35
            goto L520
        L61:
            boolean r2 = r8.Y
            r47 = r1
            r40 = r2
            long r1 = r8.X
            r41 = r1
            long r1 = r8.R
            o85 r7 = r8.i0
            r43 = r1
            java.lang.Object r1 = r8.h0
            java.lang.Long r2 = r8.g0
            r45 = r1
            java.lang.String r1 = r8.f0
            defpackage.oi2.Y(r47)
            r19 = r3
            r25 = r4
            r24 = r5
            r17 = r6
            r23 = r11
            r18 = r12
            r16 = r13
            r4 = r40
            r11 = r0
            r3 = r1
            r5 = r2
            r13 = r9
            r12 = r10
            r9 = r15
            r1 = r43
            r0 = r45
            r15 = r14
            r14 = r7
            r6 = r41
            goto L35c
        L9c:
            r47 = r1
            boolean r1 = r8.Y
            r7 = r1
            long r1 = r8.X
            r40 = r1
            long r1 = r8.R
            r42 = r1
            java.lang.Long r1 = r8.g0
            java.lang.String r2 = r8.f0
            r44 = r1
            fb5 r1 = r8.e0
            defpackage.oi2.Y(r47)
            r45 = r1
            r1 = r47
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r19 = r3
            r25 = r4
            r24 = r5
            r17 = r6
            r23 = r11
            r18 = r12
            r16 = r13
            r21 = r15
            r4 = r42
            r11 = r0
            r3 = r2
            r2 = r7
            r13 = r9
            r12 = r10
            r15 = r14
            r9 = 0
            r6 = r40
            r0 = r44
            r10 = r45
            goto L32c
        Ldd:
            r47 = r1
            boolean r1 = r8.Y
            r7 = r1
            long r1 = r8.X
            r40 = r1
            long r1 = r8.R
            r42 = r1
            java.lang.Long r1 = r8.g0
            java.lang.String r2 = r8.f0
            r44 = r1
            fb5 r1 = r8.e0
            defpackage.oi2.Y(r47)
            r45 = r1
            r1 = r47
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r19 = r3
            r25 = r4
            r24 = r5
            r17 = r6
            r23 = r11
            r18 = r12
            r16 = r13
            r21 = r15
            r4 = r42
            r11 = r0
            r3 = r2
            r0 = r7
            r13 = r9
            r12 = r10
            r15 = r14
            r9 = 0
            r6 = r40
            r2 = r44
            r10 = r45
            goto L2ef
        L11e:
            r47 = r1
            boolean r1 = r8.Y
            r7 = r1
            long r1 = r8.X
            r40 = r1
            long r1 = r8.R
            r42 = r1
            fb5 r1 = r8.e0
            hb5 r2 = r8.d0
            r44 = r1
            java.lang.Long r1 = r8.Z
            defpackage.oi2.Y(r47)
            r20 = r2
            r0 = r3
            r17 = r4
            r19 = r5
            r3 = r7
            r16 = r10
            r18 = r14
            r4 = r42
            r10 = r44
            r2 = r1
            r14 = r6
            r6 = r40
            r1 = r47
            goto L1ef
        L14e:
            r47 = r1
            boolean r1 = r8.Y
            r7 = r1
            long r1 = r8.X
            r40 = r1
            long r1 = r8.R
            r42 = r1
            fb5 r1 = r8.e0
            hb5 r2 = r8.d0
            r44 = r1
            java.lang.Long r1 = r8.Z
            defpackage.oi2.Y(r47)
            r19 = r44
            r0 = r3
            r17 = r4
            r16 = r10
            r18 = r14
            r10 = r5
            r14 = r6
            r4 = r42
            r6 = r2
            r2 = r40
            goto L1ba
        L177:
            r47 = r1
            defpackage.oi2.Y(r47)
            fb5 r1 = new fb5
            r2 = r6
            r6 = 1
            r7 = r44
            r0 = r3
            r17 = r4
            r16 = r10
            r18 = r14
            r14 = r2
            r10 = r5
            r4 = r40
            r2 = r42
            r1.<init>(r2, r4, r6, r7)
            if (r7 != 0) goto L1c1
            r2 = r45
            r8.Z = r2
            r3 = r46
            r8.d0 = r3
            r8.e0 = r1
            r4 = r40
            r8.R = r4
            r2 = r42
            r8.X = r2
            r8.Y = r7
            r6 = 1
            r8.m0 = r6
            java.lang.Object r6 = r15.b(r1, r8)
            if (r6 != r9) goto L1b4
        L1b1:
            r8 = r9
            goto L519
        L1b4:
            r6 = r46
            r19 = r1
            r1 = r45
        L1ba:
            r35 = r19
            r19 = r10
            r10 = r35
            goto L1cc
        L1c1:
            r4 = r40
            r2 = r42
            r6 = r46
            r19 = r10
            r10 = r1
            r1 = r45
        L1cc:
            r8.Z = r1
            r8.d0 = r6
            r8.e0 = r10
            r8.R = r4
            r8.X = r2
            r8.Y = r7
            r40 = r1
            r1 = 2
            r8.m0 = r1
            vm5 r1 = r15.a
            java.lang.Object r1 = r1.o(r2, r8)
            if (r1 != r9) goto L1e6
            goto L1b1
        L1e6:
            r20 = r6
            r35 = r2
            r2 = r40
            r3 = r7
            r6 = r35
        L1ef:
            java.lang.String r1 = (java.lang.String) r1
            if (r2 == 0) goto L228
            long r21 = r2.longValue()
            r23 = 0
            int r2 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r2 > 0) goto L1fe
            goto L228
        L1fe:
            vr0 r2 = defpackage.u83.a
            s83 r2 = r2.b()
            long r25 = r2.b()
            long r25 = r25 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 / r21
            int r2 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r2 >= 0) goto L214
            r25 = r23
        L214:
            r21 = 1209600(0x127500, double:5.97622E-318)
            int r2 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r2 <= 0) goto L21d
            r25 = r21
        L21d:
            java.lang.Long r2 = java.lang.Long.valueOf(r25)
            int r21 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r21 <= 0) goto L228
        L225:
            r21 = r15
            goto L22a
        L228:
            r2 = 0
            goto L225
        L22a:
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r4)
            r22 = r9
            vr4 r9 = new vr4
            r9.<init>(r14, r15)
            vr4 r15 = new vr4
            r15.<init>(r0, r13)
            r40 = r9
            vr4 r9 = new vr4
            r9.<init>(r12, r11)
            r42 = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r41 = r15
            vr4 r15 = new vr4
            r23 = r11
            r11 = r19
            r15.<init>(r11, r9)
            vr4 r9 = new vr4
            r43 = r15
            r15 = r18
            r9.<init>(r15, r1)
            r44 = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r18 = r12
            vr4 r12 = new vr4
            r19 = r0
            r0 = r17
            r12.<init>(r0, r9)
            vr4 r9 = new vr4
            r45 = r12
            r12 = r16
            r9.<init>(r12, r2)
            r46 = r9
            vr4[] r9 = new defpackage.vr4[]{r40, r41, r42, r43, r44, r45, r46}
            r16 = r13
            java.lang.String r13 = "kotlin_award_submit_start"
            t(r13, r9)
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r4)
            vr4 r13 = new vr4
            r13.<init>(r14, r9)
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r17 = r14
            vr4 r14 = new vr4
            r14.<init>(r11, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r24 = r11
            vr4 r11 = new vr4
            r11.<init>(r0, r9)
            vr4 r9 = new vr4
            r9.<init>(r15, r1)
            r25 = r0
            vr4 r0 = new vr4
            r0.<init>(r12, r2)
            vr4[] r0 = new defpackage.vr4[]{r13, r14, r11, r9, r0}
            java.lang.String r9 = "achievement_submit_attempt"
            r11 = r39
            r11.u(r9, r0)
            l85 r0 = r11.a
            if (r20 != 0) goto L2f5
            r9 = 0
            r8.Z = r9
            r8.d0 = r9
            r8.e0 = r10
            r8.f0 = r1
            r8.g0 = r2
            r8.R = r4
            r8.X = r6
            r8.Y = r3
            r13 = 3
            r8.m0 = r13
            r40 = r0
            r44 = r1
            r45 = r2
            r43 = r3
            r41 = r4
            r46 = r8
            java.lang.Object r1 = r40.d(r41, r43, r44, r45, r46)
            r0 = r43
            r3 = r44
            r13 = r22
            if (r1 != r13) goto L2ef
        L2ec:
            r8 = r13
            goto L519
        L2ef:
            r35 = r2
            r2 = r0
            r0 = r35
            goto L32c
        L2f5:
            r9 = r1
            r1 = r0
            r0 = r3
            r3 = r9
            r13 = r22
            r9 = 0
            r8.Z = r9
            r8.d0 = r9
            r8.e0 = r10
            r8.f0 = r3
            r8.g0 = r2
            r8.R = r4
            r8.X = r6
            r8.Y = r0
            r14 = 4
            r8.m0 = r14
            r43 = r0
            r40 = r1
            r46 = r2
            r45 = r3
            r41 = r4
            r47 = r8
            r44 = r20
            java.lang.Object r0 = r40.e(r41, r43, r44, r45, r46, r47)
            r1 = r43
            if (r0 != r13) goto L326
        L325:
            goto L2ec
        L326:
            r35 = r1
            r1 = r0
            r0 = r2
            r2 = r35
        L32c:
            boolean r14 = r1 instanceof defpackage.em5
            if (r14 != 0) goto L425
            r14 = r1
            o85 r14 = (defpackage.o85) r14
            if (r2 == 0) goto L364
            r8.Z = r9
            r8.d0 = r9
            r8.e0 = r9
            r8.f0 = r3
            r8.g0 = r0
            r8.h0 = r1
            r8.i0 = r14
            r8.R = r4
            r8.X = r6
            r8.Y = r2
            r9 = 5
            r8.m0 = r9
            r9 = r21
            java.lang.Object r10 = r9.b(r10, r8)
            if (r10 != r13) goto L355
            goto L325
        L355:
            r35 = r4
            r5 = r0
            r0 = r1
            r4 = r2
            r1 = r35
        L35c:
            r35 = r1
            r1 = r0
            r2 = r4
            r0 = r5
            r4 = r35
            goto L366
        L364:
            r9 = r21
        L366:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            r40 = r1
            vr4 r1 = new vr4
            r41 = r2
            r2 = r17
            r1.<init>(r2, r10)
            vr4 r10 = new vr4
            r26 = r1
            r22 = r13
            r1 = r16
            r13 = r19
            r10.<init>(r13, r1)
            r27 = r10
            vr4 r10 = new vr4
            r46 = r8
            r21 = r9
            r8 = r18
            r9 = r23
            r10.<init>(r8, r9)
            r28 = r10
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r6)
            vr4 r8 = new vr4
            r9 = r24
            r8.<init>(r9, r10)
            vr4 r10 = new vr4
            r10.<init>(r15, r3)
            r16 = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r41)
            r29 = r8
            vr4 r8 = new vr4
            r30 = r10
            r10 = r25
            r8.<init>(r10, r3)
            vr4 r3 = new vr4
            r3.<init>(r12, r0)
            boolean r0 = r14.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            vr4 r12 = new vr4
            r32 = r3
            java.lang.String r3 = "ra_awarded"
            r12.<init>(r3, r0)
            int r0 = r14.b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            vr4 r0 = new vr4
            r31 = r8
            java.lang.String r8 = "remaining"
            r0.<init>(r8, r3)
            r34 = r0
            r33 = r12
            vr4[] r0 = new defpackage.vr4[]{r26, r27, r28, r29, r30, r31, r32, r33, r34}
            java.lang.String r3 = "kotlin_award_submit_success"
            t(r3, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r2, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r6)
            vr4 r8 = new vr4
            r8.<init>(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r41)
            vr4 r12 = new vr4
            r12.<init>(r10, r0)
            boolean r0 = r14.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            vr4 r14 = new vr4
            r19 = r4
            java.lang.String r4 = "awarded"
            r14.<init>(r4, r0)
            vr4[] r0 = new defpackage.vr4[]{r3, r8, r12, r14}
            java.lang.String r3 = "achievement_submit_success"
            r11.u(r3, r0)
            r0 = r40
            r8 = r41
            r3 = r16
            r4 = r19
            goto L435
        L425:
            r0 = r1
            r46 = r8
            r22 = r13
            r1 = r16
            r13 = r19
            r9 = r24
            r10 = r25
            r8 = r2
            r2 = r17
        L435:
            java.lang.Throwable r12 = defpackage.hm5.a(r0)
            if (r12 == 0) goto L5ff
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r4)
            r40 = r12
            vr4 r12 = new vr4
            r12.<init>(r2, r14)
            vr4 r14 = new vr4
            r14.<init>(r13, r1)
            vr4 r1 = new vr4
            r24 = r12
            r25 = r14
            r14 = r18
            r12 = r23
            r1.<init>(r14, r12)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r6)
            vr4 r14 = new vr4
            r14.<init>(r9, r12)
            vr4 r12 = new vr4
            r12.<init>(r15, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            vr4 r15 = new vr4
            r15.<init>(r10, r3)
            java.lang.Class r3 = r40.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r26 = r1
            vr4 r1 = new vr4
            r28 = r12
            java.lang.String r12 = "error"
            r1.<init>(r12, r3)
            r30 = r1
            r27 = r14
            r29 = r15
            vr4[] r1 = new defpackage.vr4[]{r24, r25, r26, r27, r28, r29, r30}
            java.lang.String r3 = "kotlin_award_submit_failed"
            t(r3, r1)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r2, r1)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            vr4 r14 = new vr4
            r14.<init>(r9, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            vr4 r15 = new vr4
            r15.<init>(r10, r1)
            java.lang.Class r1 = r40.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            if (r1 != 0) goto L4c0
            java.lang.String r1 = "Unknown"
        L4c0:
            r25 = r4
            vr4 r4 = new vr4
            r4.<init>(r12, r1)
            vr4[] r1 = new defpackage.vr4[]{r3, r14, r15, r4}
            java.lang.String r3 = "achievement_submit_failed"
            r11.u(r3, r1)
            if (r8 != 0) goto L582
            cn5 r1 = r11.g
            en5 r1 = r1.a()
            boolean r1 = r1.i
            if (r1 == 0) goto L582
            ab5 r24 = new ab5
            vr0 r1 = defpackage.u83.a
            s83 r1 = r1.b()
            long r30 = r1.b()
            r29 = 0
            r27 = r6
            r24.<init>(r25, r27, r29, r30)
            r3 = r46
            r1 = r24
            r4 = r25
            r12 = 0
            r3.Z = r12
            r3.d0 = r12
            r3.e0 = r12
            r3.f0 = r12
            r3.g0 = r12
            r3.h0 = r0
            r3.i0 = r12
            r3.j0 = r1
            r3.R = r4
            r3.X = r6
            r3.Y = r8
            r8 = 6
            r3.m0 = r8
            r8 = r21
            java.lang.Object r3 = r8.a(r1, r3)
            r8 = r22
            if (r3 != r8) goto L51a
        L519:
            return r8
        L51a:
            r35 = r6
            r5 = r4
            r3 = r35
            r7 = r0
        L520:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            vr4 r8 = new vr4
            r8.<init>(r2, r0)
            vr4 r0 = new vr4
            java.lang.String r12 = "pending_submission_worker"
            r0.<init>(r13, r12)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r3)
            vr4 r13 = new vr4
            r13.<init>(r9, r12)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            vr4 r14 = new vr4
            r14.<init>(r10, r12)
            r17 = r10
            long r10 = r1.d
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            vr4 r10 = new vr4
            java.lang.String r11 = "created_at_epoch_ms"
            r10.<init>(r11, r1)
            vr4[] r0 = new defpackage.vr4[]{r8, r0, r13, r14, r10}
            java.lang.String r1 = "kotlin_award_queued_pending"
            t(r1, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            vr4 r1 = new vr4
            r1.<init>(r2, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            vr4 r2 = new vr4
            r2.<init>(r9, r0)
            vr4 r0 = new vr4
            r10 = r17
            r0.<init>(r10, r12)
            vr4[] r0 = new defpackage.vr4[]{r1, r2, r0}
            java.lang.String r1 = "achievement_submit_queued_pending"
            r11 = r39
            r11.u(r1, r0)
            return r7
        L582:
            r4 = r25
            if (r8 == 0) goto L5d4
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r2, r1)
            vr4 r1 = new vr4
            java.lang.String r8 = "hardcore_memory_queue"
            r1.<init>(r13, r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            vr4 r12 = new vr4
            r12.<init>(r9, r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            vr4 r13 = new vr4
            r13.<init>(r10, r8)
            vr4[] r1 = new defpackage.vr4[]{r3, r1, r12, r13}
            java.lang.String r3 = "kotlin_award_hardcore_not_persisted"
            t(r3, r1)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r2, r1)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            vr4 r2 = new vr4
            r2.<init>(r9, r1)
            vr4 r1 = new vr4
            r1.<init>(r10, r8)
            vr4[] r1 = new defpackage.vr4[]{r3, r2, r1}
            java.lang.String r2 = "achievement_submit_hardcore_not_persisted"
            r11.u(r2, r1)
            return r0
        L5d4:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r2, r1)
            vr4 r1 = new vr4
            java.lang.String r2 = "raofflineproxy"
            r1.<init>(r13, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r6)
            vr4 r4 = new vr4
            r4.<init>(r9, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            vr4 r5 = new vr4
            r5.<init>(r10, r2)
            vr4[] r1 = new defpackage.vr4[]{r3, r1, r4, r5}
            java.lang.String r2 = "kotlin_award_proxy_retry_not_persisted"
            t(r2, r1)
        L5ff:
            return r0
    }

    public final java.lang.Object C(long r7, int r9, defpackage.hb5 r10, defpackage.s41 r11) {
            r6 = this;
            boolean r0 = r11 instanceof defpackage.ml
            if (r0 == 0) goto L14
            r0 = r11
            ml r0 = (defpackage.ml) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e0 = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            ml r0 = new ml
            r0.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.e0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.oi2.Y(r0)
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r6 = r0.A
            return r6
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L37:
            int r9 = r11.X
            long r7 = r11.R
            hb5 r10 = r11.Y
            defpackage.oi2.Y(r0)
            goto L53
        L41:
            defpackage.oi2.Y(r0)
            r11.Y = r10
            r11.R = r7
            r11.X = r9
            r11.e0 = r5
            java.lang.Object r0 = r6.b(r10, r11)
            if (r0 != r1) goto L53
            goto L74
        L53:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L66
            rj7 r6 = new rj7
            r6.<init>()
            em5 r7 = new em5
            r7.<init>(r6)
            return r7
        L66:
            r11.Y = r3
            r11.R = r7
            r11.X = r9
            r11.e0 = r4
            java.lang.Object r6 = r6.D(r7, r9, r10, r11)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            return r6
    }

    public final java.lang.Object D(long r17, int r19, defpackage.hb5 r20, defpackage.s41 r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r21
            qf4 r4 = r0.b
            vm5 r4 = r4.a
            boolean r5 = r3 instanceof defpackage.nl
            if (r5 == 0) goto L1e
            r5 = r3
            nl r5 = (defpackage.nl) r5
            int r6 = r5.e0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1e
            int r6 = r6 - r7
            r5.e0 = r6
        L1c:
            r11 = r5
            goto L24
        L1e:
            nl r5 = new nl
            r5.<init>(r0, r3)
            goto L1c
        L24:
            java.lang.Object r3 = r11.Z
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r11.e0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            java.lang.String r13 = "leaderboard_id"
            r12 = 0
            if (r6 == 0) goto L60
            if (r6 == r10) goto L56
            if (r6 == r9) goto L4c
            if (r6 == r8) goto L3b
            if (r6 != r7) goto L46
        L3b:
            long r1 = r11.R
            defpackage.oi2.Y(r3)
            hm5 r3 = (defpackage.hm5) r3
            java.lang.Object r3 = r3.A
            goto Lea
        L46:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L4c:
            int r1 = r11.X
            long r9 = r11.R
            hb5 r2 = r11.Y
            defpackage.oi2.Y(r3)
            goto L91
        L56:
            int r1 = r11.X
            long r14 = r11.R
            hb5 r2 = r11.Y
            defpackage.oi2.Y(r3)
            goto L7b
        L60:
            defpackage.oi2.Y(r3)
            r3 = r20
            r11.Y = r3
            r11.R = r1
            r6 = r19
            r11.X = r6
            r11.e0 = r10
            java.lang.Object r10 = r4.t(r1, r11)
            if (r10 != r5) goto L77
            goto Le8
        L77:
            r14 = r1
            r2 = r3
            r1 = r6
            r3 = r10
        L7b:
            va5 r3 = (defpackage.va5) r3
            if (r3 == 0) goto L97
            long r7 = r3.b
            r11.Y = r2
            r11.R = r14
            r11.X = r1
            r11.e0 = r9
            java.lang.Object r3 = r4.o(r7, r11)
            if (r3 != r5) goto L90
            goto Le8
        L90:
            r9 = r14
        L91:
            java.lang.String r3 = (java.lang.String) r3
            r7 = r9
        L94:
            r9 = r1
            r10 = r2
            goto L9a
        L97:
            r3 = r12
            r7 = r14
            goto L94
        L9a:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r7)
            vr4 r2 = new vr4
            r2.<init>(r13, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            vr4 r4 = new vr4
            java.lang.String r14 = "value"
            r4.<init>(r14, r1)
            vr4 r1 = new vr4
            java.lang.String r14 = "game_hash"
            r1.<init>(r14, r3)
            vr4[] r1 = new defpackage.vr4[]{r2, r4, r1}
            java.lang.String r2 = "leaderboard_submit_attempt"
            r0.u(r2, r1)
            r1 = 3
            l85 r6 = r0.a
            if (r10 != 0) goto Ld7
            r11.Y = r12
            r11.R = r7
            r11.X = r9
            r11.e0 = r1
            r10 = r3
            java.lang.Object r1 = r6.u(r7, r9, r10, r11)
            if (r1 != r5) goto Ld5
            goto Le8
        Ld5:
            r3 = r1
            goto Le9
        Ld7:
            r11.Y = r12
            r11.R = r7
            r11.X = r9
            r1 = 4
            r11.e0 = r1
            r12 = r11
            r11 = r3
            java.lang.Object r3 = r6.v(r7, r9, r10, r11, r12)
            if (r3 != r5) goto Le9
        Le8:
            return r5
        Le9:
            r1 = r7
        Lea:
            boolean r4 = r3 instanceof defpackage.em5
            if (r4 != 0) goto L120
            r4 = r3
            cb5 r4 = (defpackage.cb5) r4
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            vr4 r6 = new vr4
            r6.<init>(r13, r5)
            int r5 = r4.a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            vr4 r5 = new vr4
            java.lang.String r8 = "rank"
            r5.<init>(r8, r7)
            int r4 = r4.b
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            vr4 r4 = new vr4
            java.lang.String r8 = "entries"
            r4.<init>(r8, r7)
            vr4[] r4 = new defpackage.vr4[]{r6, r5, r4}
            java.lang.String r5 = "leaderboard_submit_success"
            r0.u(r5, r4)
        L120:
            java.lang.Throwable r4 = defpackage.hm5.a(r3)
            if (r4 == 0) goto L150
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            vr4 r1 = new vr4
            r1.<init>(r13, r5)
            java.lang.Class r2 = r4.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            if (r2 != 0) goto L140
            java.lang.String r2 = "Unknown"
        L140:
            vr4 r4 = new vr4
            java.lang.String r5 = "error"
            r4.<init>(r5, r2)
            vr4[] r1 = new defpackage.vr4[]{r1, r4}
            java.lang.String r2 = "leaderboard_submit_failed"
            r0.u(r2, r1)
        L150:
            return r3
    }

    public final java.lang.Object E(defpackage.s41 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof defpackage.ol
            if (r2 == 0) goto L17
            r2 = r1
            ol r2 = (defpackage.ol) r2
            int r3 = r2.f0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f0 = r3
            goto L1c
        L17:
            ol r2 = new ol
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.d0
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r2.f0
            r10 = 0
            r11 = 4
            r12 = 3
            r13 = 2
            r4 = 1
            qf4 r14 = r0.b
            jg7 r15 = defpackage.jg7.a
            java.lang.String r5 = "hardcore"
            java.lang.String r6 = "game_id"
            java.lang.String r7 = "achievement_id"
            if (r3 == 0) goto L7f
            if (r3 == r4) goto L7b
            if (r3 == r13) goto L6f
            if (r3 == r12) goto L54
            if (r3 != r11) goto L4d
            int r3 = r2.Y
            ab5 r4 = r2.X
            java.util.Iterator r8 = r2.R
            defpackage.oi2.Y(r1)
            r1 = r14
            r14 = r4
            r4 = r1
            r10 = r5
            r12 = r6
            r1 = r11
            r11 = r7
            goto L1c2
        L4d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L54:
            int r3 = r2.Z
            int r4 = r2.Y
            ab5 r8 = r2.X
            java.util.Iterator r11 = r2.R
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r10 = r4
            r4 = r3
            r3 = r10
            r10 = r5
            r12 = r6
            r16 = r14
            r14 = r8
            r8 = r11
            r11 = r7
            goto L160
        L6f:
            int r3 = r2.Y
            ab5 r4 = r2.X
            java.util.Iterator r8 = r2.R
            defpackage.oi2.Y(r1)
        L78:
            r16 = r14
            goto Lc9
        L7b:
            defpackage.oi2.Y(r1)
            goto L9a
        L7f:
            defpackage.oi2.Y(r1)
            cn5 r1 = r0.g
            en5 r1 = r1.a()
            boolean r1 = r1.i
            if (r1 != 0) goto L8e
            goto L1f9
        L8e:
            r2.f0 = r4
            vm5 r1 = r14.a
            java.lang.Object r1 = r1.u(r2)
            if (r1 != r9) goto L9a
            goto L1c1
        L9a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r11 = r10
        La1:
            r8 = r2
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f9
            java.lang.Object r2 = r1.next()
            ab5 r2 = (defpackage.ab5) r2
            boolean r3 = r2.c
            if (r3 == 0) goto Lf9
            r8.R = r1
            r8.X = r2
            r8.Y = r11
            r8.Z = r10
            r8.f0 = r13
            java.lang.Object r3 = r14.C(r2, r8)
            if (r3 != r9) goto Lc4
            goto L1c1
        Lc4:
            r4 = r2
            r2 = r8
            r3 = r11
            r8 = r1
            goto L78
        Lc9:
            long r13 = r4.a
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r13)
            vr4 r11 = new vr4
            r11.<init>(r7, r1)
            long r13 = r4.b
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r13)
            vr4 r4 = new vr4
            r4.<init>(r6, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            vr4 r13 = new vr4
            r13.<init>(r5, r1)
            vr4[] r1 = new defpackage.vr4[]{r11, r4, r13}
            java.lang.String r4 = "pending_award_hardcore_discarded"
            r0.u(r4, r1)
            r10 = r5
            r12 = r6
            r11 = r7
            r4 = r16
            r1 = 4
            goto L1ee
        Lf9:
            r16 = r14
            long r3 = r2.a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r3)
            vr4 r3 = new vr4
            r3.<init>(r7, r13)
            long r13 = r2.b
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r13)
            vr4 r13 = new vr4
            r13.<init>(r6, r4)
            boolean r4 = r2.c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            vr4 r14 = new vr4
            r14.<init>(r5, r4)
            vr4[] r3 = new defpackage.vr4[]{r3, r13, r14}
            java.lang.String r4 = "pending_award_retry_attempt"
            r0.u(r4, r3)
            long r3 = r2.a
            r13 = r3
            long r3 = r2.b
            r17 = r5
            boolean r5 = r2.c
            r18 = r13
            long r12 = r2.d
            r14 = r6
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r12)
            r8.R = r1
            r8.X = r2
            r8.Y = r11
            r8.Z = r10
            r12 = 3
            r8.f0 = r12
            r13 = r7
            r7 = 0
            r12 = r14
            r10 = r17
            r14 = r2
            r20 = r13
            r13 = r1
            r1 = r18
            r18 = r11
            r11 = r20
            java.lang.Object r1 = r0.B(r1, r3, r5, r6, r7, r8)
            if (r1 != r9) goto L15b
            goto L1c1
        L15b:
            r2 = r8
            r8 = r13
            r3 = r18
            r4 = 0
        L160:
            boolean r5 = r1 instanceof defpackage.em5
            if (r5 == 0) goto L1ae
            long r2 = r14.a
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            vr4 r2 = new vr4
            r2.<init>(r11, r4)
            long r3 = r14.b
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r3)
            vr4 r3 = new vr4
            r3.<init>(r12, r6)
            boolean r4 = r14.c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            vr4 r6 = new vr4
            r6.<init>(r10, r4)
            java.lang.Throwable r4 = defpackage.hm5.a(r1)
            if (r4 == 0) goto L196
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            goto L198
        L196:
            java.lang.String r4 = "Unknown"
        L198:
            vr4 r7 = new vr4
            java.lang.String r8 = "error"
            r7.<init>(r8, r4)
            vr4[] r2 = new defpackage.vr4[]{r2, r3, r6, r7}
            java.lang.String r3 = "pending_award_retry_failed"
            r0.u(r3, r2)
            if (r5 != 0) goto L1ad
            o85 r1 = (defpackage.o85) r1
            return r15
        L1ad:
            return r1
        L1ae:
            r2.R = r8
            r2.X = r14
            r2.Y = r3
            r2.Z = r4
            r1 = 4
            r2.f0 = r1
            r4 = r16
            java.lang.Object r5 = r4.C(r14, r2)
            if (r5 != r9) goto L1c2
        L1c1:
            return r9
        L1c2:
            long r5 = r14.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            vr4 r5 = new vr4
            r5.<init>(r11, r7)
            long r6 = r14.b
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r6)
            vr4 r6 = new vr4
            r6.<init>(r12, r13)
            boolean r7 = r14.c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            vr4 r13 = new vr4
            r13.<init>(r10, r7)
            vr4[] r5 = new defpackage.vr4[]{r5, r6, r13}
            java.lang.String r6 = "pending_award_retry_success"
            r0.u(r6, r5)
        L1ee:
            r14 = r4
            r1 = r8
            r5 = r10
            r7 = r11
            r6 = r12
            r10 = 0
            r12 = 3
            r13 = 2
            r11 = r3
            goto La1
        L1f9:
            return r15
    }

    public final java.lang.Object a(java.lang.String r7, defpackage.hb5 r8, defpackage.s41 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.lk
            if (r0 == 0) goto L13
            r0 = r9
            lk r0 = (defpackage.lk) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            lk r0 = new lk
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            hb5 r8 = r0.X
            java.lang.String r7 = r0.R
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L2c
            goto L84
        L2c:
            r8 = move-exception
            goto L96
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L36:
            defpackage.oi2.Y(r9)
            boolean r9 = defpackage.qs6.v0(r7)
            if (r9 != 0) goto L9e
            bk1 r9 = r6.h
            r9.getClass()
            r8.getClass()
            java.lang.Object r2 = r9.L
            monitor-enter(r2)
            boolean r5 = r9.A     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L50
        L4e:
            r9 = r3
            goto L71
        L50:
            java.lang.Object r5 = r9.B     // Catch: java.lang.Throwable -> L67
            mb5 r5 = (defpackage.mb5) r5     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L69
            java.lang.String r9 = r5.a     // Catch: java.lang.Throwable -> L67
            boolean r9 = defpackage.nb3.k(r9, r7)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L4e
            hb5 r9 = r5.b     // Catch: java.lang.Throwable -> L67
            boolean r9 = defpackage.nb3.k(r9, r8)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L4e
            goto L70
        L67:
            r6 = move-exception
            goto L9c
        L69:
            mb5 r5 = new mb5     // Catch: java.lang.Throwable -> L67
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L67
            r9.B = r5     // Catch: java.lang.Throwable -> L67
        L70:
            r9 = r4
        L71:
            monitor-exit(r2)
            if (r9 != 0) goto L75
            goto L9e
        L75:
            hk r9 = r6.c     // Catch: java.lang.Throwable -> L2c
            r0.R = r7     // Catch: java.lang.Throwable -> L2c
            r0.X = r8     // Catch: java.lang.Throwable -> L2c
            r0.d0 = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r1) goto L84
            return r1
        L84:
            boolean r8 = defpackage.nb3.k(r9, r8)     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L8c
            r3 = r4
            goto L91
        L8c:
            bk1 r8 = r6.h     // Catch: java.lang.Throwable -> L2c
            r8.n(r7)     // Catch: java.lang.Throwable -> L2c
        L91:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L96:
            bk1 r6 = r6.h
            r6.n(r7)
            throw r8
        L9c:
            monitor-exit(r2)
            throw r6
        L9e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
    }

    public final java.lang.Object b(defpackage.hb5 r5, defpackage.s41 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mk
            if (r0 == 0) goto L13
            r0 = r6
            mk r0 = (defpackage.mk) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mk r0 = new mk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            hb5 r5 = r0.R
            defpackage.oi2.Y(r6)
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.oi2.Y(r6)
            r0.R = r5
            r0.Z = r3
            hk r4 = r4.c
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            boolean r4 = defpackage.nb3.k(r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    public final java.lang.Object c(defpackage.o75 r25, boolean r26, defpackage.hb5 r27, defpackage.s41 r28) {
            r24 = this;
            r0 = r24
            r1 = r27
            r2 = r28
            boolean r3 = r2 instanceof defpackage.nk
            if (r3 == 0) goto L1a
            r3 = r2
            nk r3 = (defpackage.nk) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.e0 = r4
        L18:
            r8 = r3
            goto L20
        L1a:
            nk r3 = new nk
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r8.Z
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r8.e0
            r4 = 2
            r10 = 0
            r11 = 1
            if (r3 == 0) goto L4e
            if (r3 == r11) goto L3f
            if (r3 != r4) goto L39
            boolean r1 = r8.Y
            defpackage.oi2.Y(r2)
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r2 = r2.A
            goto L91
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L3f:
            boolean r1 = r8.Y
            hb5 r3 = r8.X
            o75 r5 = r8.R
            defpackage.oi2.Y(r2)
            r7 = r5
            r5 = r1
            r1 = r2
            r2 = r7
            r7 = r3
            goto L67
        L4e:
            defpackage.oi2.Y(r2)
            r2 = r25
            r8.R = r2
            r8.X = r1
            r3 = r26
            r8.Y = r3
            r8.e0 = r11
            java.lang.Object r5 = r0.b(r1, r8)
            if (r5 != r9) goto L64
            goto L8f
        L64:
            r7 = r1
            r1 = r5
            r5 = r3
        L67:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L7a
            rj7 r0 = new rj7
            r0.<init>()
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L7a:
            long r12 = r2.a
            long r1 = r2.b
            r8.R = r10
            r8.X = r10
            r8.Y = r5
            r8.e0 = r4
            r6 = 0
            r3 = r1
            r1 = r12
            java.lang.Object r2 = r0.B(r1, r3, r5, r6, r7, r8)
            if (r2 != r9) goto L90
        L8f:
            return r9
        L90:
            r1 = r5
        L91:
            boolean r3 = r2 instanceof defpackage.em5
            if (r3 == 0) goto L121
            if (r1 != 0) goto L121
            cn5 r1 = r0.g
            en5 r3 = r1.a()
            boolean r3 = r3.i
            if (r3 == 0) goto L121
            en5 r1 = r1.a()
            boolean r1 = r1.i
            if (r1 != 0) goto Laa
            goto L121
        Laa:
            af4 r1 = new af4
            kf4 r1 = defpackage.kf4.NOT_REQUIRED
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kf4 r14 = defpackage.kf4.CONNECTED
            r14.getClass()
            af4 r13 = new af4
            r13.<init>(r10)
            java.util.Set r23 = defpackage.gt0.p1(r1)
            p21 r12 = new p21
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = -1
            r21 = r19
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r23)
            bk1 r1 = new bk1
            java.lang.Class<me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker> r3 = me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker.class
            r1.<init>(r3)
            java.lang.Object r3 = r1.B
            yw7 r3 = (defpackage.yw7) r3
            r3.j = r12
            w10 r3 = defpackage.w10.EXPONENTIAL
            r3.getClass()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r4.getClass()
            r1.A = r11
            java.lang.Object r4 = r1.B
            yw7 r4 = (defpackage.yw7) r4
            r4.l = r3
            fa6 r3 = defpackage.yw7.z
            r7 = 10000(0x2710, double:4.9407E-320)
            r9 = 18000000(0x112a880, double:8.8931816E-317)
            r5 = 60000(0xea60, double:2.9644E-319)
            long r5 = defpackage.gi2.s(r5, r7, r9)
            r4.m = r5
            oo4 r3 = defpackage.oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r3.getClass()
            java.lang.Object r4 = r1.B
            yw7 r4 = (defpackage.yw7) r4
            r4.q = r11
            r4.r = r3
            gm4 r1 = r1.c()
            android.content.Context r0 = r0.f
            lw7 r0 = defpackage.lw7.b(r0)
            r0.getClass()
            java.lang.String r3 = "ra_pending_achievement_submission_worker"
            y72 r4 = defpackage.y72.APPEND_OR_REPLACE
            r0.a(r3, r4, r1)
        L121:
            return r2
    }

    public final defpackage.kb5 d(defpackage.da5 r24, java.util.List r25, boolean r26) {
            r23 = this;
            r0 = r24
            r1 = r23
            android.content.SharedPreferences r1 = r1.e
            java.lang.String r2 = "ra_unofficial_enabled"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r0 == 0) goto Lf8
            java.util.List r2 = r0.e
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r5 = defpackage.ht0.v0(r2, r4)
            r10.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lea
            java.lang.Object r5 = r2.next()
            s75 r5 = (defpackage.s75) r5
            long r12 = r5.a
            long r14 = r5.b
            java.lang.String r6 = r5.c
            r75 r7 = r5.d
            java.net.URL r8 = r5.e
            java.util.ArrayList r9 = r5.f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r3 = r9.size()
            r4 = 0
        L42:
            if (r4 >= r3) goto L6b
            r21 = r1
            java.lang.Object r1 = r9.get(r4)
            int r4 = r4 + 1
            r22 = r2
            r2 = r1
            o75 r2 = (defpackage.o75) r2
            n75 r2 = r2.m
            r16 = r3
            n75 r3 = defpackage.n75.CORE
            if (r2 == r3) goto L67
            if (r21 == 0) goto L60
            n75 r3 = defpackage.n75.UNOFFICIAL
            if (r2 != r3) goto L60
            goto L67
        L60:
            r3 = r16
            r1 = r21
            r2 = r22
            goto L42
        L67:
            r11.add(r1)
            goto L60
        L6b:
            r21 = r1
            r22 = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.ht0.v0(r11, r2)
            r1.<init>(r3)
            int r3 = r11.size()
            r4 = 0
        L7f:
            if (r4 >= r3) goto Laa
            java.lang.Object r9 = r11.get(r4)
            int r4 = r4 + 1
            o75 r9 = (defpackage.o75) r9
            eb5 r2 = new eb5
            r16 = r3
            r17 = r4
            long r3 = r9.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = r25
            boolean r3 = r4.contains(r3)
            r4 = r26
            r2.<init>(r9, r3, r4)
            r1.add(r2)
            r3 = r16
            r4 = r17
            r2 = 10
            goto L7f
        Laa:
            r4 = r26
            java.util.ArrayList r2 = r5.g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r2.size()
            r9 = 0
        Lb8:
            if (r9 >= r5) goto Lcf
            java.lang.Object r11 = r2.get(r9)
            int r9 = r9 + 1
            r19 = r1
            r1 = r11
            ta5 r1 = (defpackage.ta5) r1
            boolean r1 = r1.i
            if (r1 != 0) goto Lcc
            r3.add(r11)
        Lcc:
            r1 = r19
            goto Lb8
        Lcf:
            r19 = r1
            gb5 r11 = new gb5
            r20 = r3
            r17 = r6
            r16 = r7
            r18 = r8
            r11.<init>(r12, r14, r16, r17, r18, r19, r20)
            r10.add(r11)
            r1 = r21
            r2 = r22
            r3 = 0
            r4 = 10
            goto L20
        Lea:
            kb5 r4 = new kb5
            long r5 = r0.a
            java.lang.String r7 = r0.b
            java.net.URL r8 = r0.c
            java.lang.String r9 = r0.d
            r4.<init>(r5, r7, r8, r9, r10)
            return r4
        Lf8:
            r0 = 0
            return r0
    }

    public final java.lang.Object e(java.lang.String r15, java.lang.String r16, java.lang.String r17, defpackage.s41 r18) {
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.ok
            if (r1 == 0) goto L15
            r1 = r0
            ok r1 = (defpackage.ok) r1
            int r2 = r1.e0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e0 = r2
            goto L1a
        L15:
            ok r1 = new ok
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.e0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r12 = 0
            if (r3 == 0) goto L5a
            if (r3 == r7) goto L50
            if (r3 == r6) goto L45
            if (r3 == r5) goto L40
            if (r3 != r4) goto L39
            java.lang.Object r1 = r1.Y
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L36
            goto Lf8
        L36:
            r0 = move-exception
            goto L107
        L39:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            r14 = 0
            return r14
        L40:
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L36
            goto Ldd
        L45:
            java.lang.String r3 = r1.X
            java.lang.String r6 = r1.R
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L36
            r11 = r3
            r10 = r6
            goto Lc4
        L50:
            java.lang.String r3 = r1.X
            java.lang.String r7 = r1.R
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L36
            r8 = r3
            r3 = r7
            goto L96
        L5a:
            defpackage.oi2.Y(r0)
            bk1 r0 = r14.h
            r0.getClass()
            r15.getClass()
            java.lang.Object r3 = r0.L
            monitor-enter(r3)
            boolean r8 = r0.A     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L7c
            java.lang.Object r0 = r0.R     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L78
            boolean r0 = defpackage.nb3.k(r0, r15)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L7c
            r0 = r7
            goto L7d
        L78:
            r0 = move-exception
            r14 = r0
            goto L10d
        L7c:
            r0 = 0
        L7d:
            monitor-exit(r3)
            if (r0 != 0) goto L83
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L83:
            hk r0 = r14.c     // Catch: java.lang.Throwable -> L36
            r3 = r16
            r1.R = r3     // Catch: java.lang.Throwable -> L36
            r8 = r17
            r1.X = r8     // Catch: java.lang.Throwable -> L36
            r1.e0 = r7     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 != r2) goto L96
            goto Lf6
        L96:
            boolean r7 = r0 instanceof defpackage.hb5     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L9d
            hb5 r0 = (defpackage.hb5) r0     // Catch: java.lang.Throwable -> L36
            goto L9e
        L9d:
            r0 = r12
        L9e:
            if (r0 == 0) goto La3
            java.lang.String r7 = r0.a     // Catch: java.lang.Throwable -> L36
            goto La4
        La3:
            r7 = r12
        La4:
            boolean r7 = defpackage.nb3.k(r7, r3)     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L104
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L36
            boolean r0 = defpackage.nb3.k(r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto Lb3
            goto L104
        Lb3:
            qf4 r0 = r14.b     // Catch: java.lang.Throwable -> L36
            r1.R = r3     // Catch: java.lang.Throwable -> L36
            r1.X = r8     // Catch: java.lang.Throwable -> L36
            r1.e0 = r6     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.d(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 != r2) goto Lc2
            goto Lf6
        Lc2:
            r10 = r3
            r11 = r8
        Lc4:
            hk r9 = r14.c     // Catch: java.lang.Throwable -> L36
            r1.R = r12     // Catch: java.lang.Throwable -> L36
            r1.X = r12     // Catch: java.lang.Throwable -> L36
            r1.e0 = r5     // Catch: java.lang.Throwable -> L36
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L36
            de1 r0 = defpackage.de1.L     // Catch: java.lang.Throwable -> L36
            gk r8 = new gk     // Catch: java.lang.Throwable -> L36
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = defpackage.hv.d0(r0, r8, r1)     // Catch: java.lang.Throwable -> L36
            if (r0 != r2) goto Ldd
            goto Lf6
        Ldd:
            r3 = r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto Lf9
            jk r3 = r14.d     // Catch: java.lang.Throwable -> L36
            r1.R = r12     // Catch: java.lang.Throwable -> L36
            r1.X = r12     // Catch: java.lang.Throwable -> L36
            r1.Y = r0     // Catch: java.lang.Throwable -> L36
            r1.e0 = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L36
            if (r1 != r2) goto Lf7
        Lf6:
            return r2
        Lf7:
            r1 = r0
        Lf8:
            r0 = r1
        Lf9:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
        Lfe:
            bk1 r14 = r14.h
            r14.h()
            return r0
        L104:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L36
            goto Lfe
        L107:
            bk1 r14 = r14.h
            r14.h()
            throw r0
        L10d:
            monitor-exit(r3)
            throw r14
    }

    public final java.lang.Object f(long r41, java.lang.String r43, defpackage.kk r44, boolean r45, defpackage.s41 r46) {
            r40 = this;
            r0 = r40
            r1 = r41
            r3 = r44
            r4 = r45
            r5 = r46
            qf4 r6 = r0.b
            vm5 r7 = r6.a
            boolean r8 = r5 instanceof defpackage.pk
            if (r8 == 0) goto L21
            r8 = r5
            pk r8 = (defpackage.pk) r8
            int r9 = r8.k0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L21
            int r9 = r9 - r10
            r8.k0 = r9
            goto L26
        L21:
            pk r8 = new pk
            r8.<init>(r0, r5)
        L26:
            l61 r5 = r8.B
            java.lang.Object r9 = r8.i0
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r8.k0
            r13 = 0
            switch(r11) {
                case 0: goto Lb1;
                case 1: goto L9d;
                case 2: goto L75;
                case 3: goto L5d;
                case 4: goto L52;
                case 5: goto L40;
                case 6: goto L38;
                default: goto L32;
            }
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L38:
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L3d
            goto Lf6
        L3d:
            r0 = move-exception
            goto L102
        L40:
            java.lang.Throwable r0 = r8.Z
            da5 r1 = r8.Y
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L4d
            r25 = r5
            goto L37c
        L4d:
            r0 = move-exception
            r25 = r5
            goto L387
        L52:
            da5 r0 = r8.Y
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L4d
            r25 = r5
            goto L350
        L5d:
            boolean r1 = r8.d0
            long r2 = r8.R
            java.lang.Throwable r0 = r8.Z
            java.util.List r0 = (java.util.List) r0
            da5 r0 = r8.Y
            kk r4 = r8.X
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L70
            r25 = r5
            goto L2ef
        L70:
            r0 = move-exception
            r25 = r5
            goto L2ff
        L75:
            int r0 = r8.h0
            int r1 = r8.g0
            int r2 = r8.f0
            int r3 = r8.e0
            boolean r4 = r8.d0
            long r14 = r8.R
            java.lang.Throwable r6 = r8.Z
            java.util.List r6 = (java.util.List) r6
            da5 r6 = r8.Y
            kk r11 = r8.X
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L95
            r25 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r6
            goto L2d0
        L95:
            r0 = move-exception
            r1 = r4
            r25 = r5
        L99:
            r4 = r11
            r2 = r14
            goto L2ff
        L9d:
            boolean r0 = r8.d0
            long r1 = r8.R
            kk r3 = r8.X
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r4 = r9.A
            r39 = r4
            r4 = r0
            r0 = r39
            goto L123
        Lb1:
            defpackage.oi2.Y(r9)
            if (r4 != 0) goto L10e
            java.lang.Object r9 = r3.L
            ia5 r9 = (defpackage.ia5) r9
            if (r9 == 0) goto Lbf
            s83 r11 = r9.b
            goto Lc0
        Lbf:
            r11 = r13
        Lc0:
            if (r11 != 0) goto Lc3
            goto L10e
        Lc3:
            vr0 r11 = defpackage.u83.a
            s83 r11 = r11.b()
            s83 r9 = r9.b
            long r14 = r11.a(r9)
            jd1 r9 = defpackage.oq1.B
            r9 = 7
            uq1 r11 = defpackage.uq1.DAYS
            long r12 = defpackage.n16.L(r9, r11)
            int r9 = defpackage.oq1.c(r14, r12)
            if (r9 < 0) goto Ldf
            goto L10e
        Ldf:
            r9 = 0
            r8.X = r9     // Catch: java.lang.Throwable -> L3d
            r8.R = r1     // Catch: java.lang.Throwable -> L3d
            r8.d0 = r4     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            r8.e0 = r3     // Catch: java.lang.Throwable -> L3d
            r8.f0 = r3     // Catch: java.lang.Throwable -> L3d
            r0 = 6
            r8.k0 = r0     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r9 = r7.s(r1, r8)     // Catch: java.lang.Throwable -> L3d
            if (r9 != r10) goto Lf6
            goto L37a
        Lf6:
            ka5 r9 = (defpackage.ka5) r9     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto Lff
            da5 r0 = defpackage.ln2.O(r9)     // Catch: java.lang.Throwable -> L3d
            return r0
        Lff:
            r16 = 0
            return r16
        L102:
            r5.getClass()
            defpackage.yh2.o(r5)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L10e:
            r8.X = r3
            r8.R = r1
            r8.d0 = r4
            r9 = 1
            r8.k0 = r9
            l85 r0 = r0.a
            r9 = r43
            java.lang.Object r0 = r0.m(r9, r8)
            if (r0 != r10) goto L123
            goto L37a
        L123:
            boolean r9 = r0 instanceof defpackage.em5
            if (r9 != 0) goto L30f
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L187
            da5 r0 = (defpackage.da5) r0     // Catch: java.lang.Throwable -> L187
            java.util.List r9 = r0.e     // Catch: java.lang.Throwable -> L187
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L187
            r12 = 10
            int r13 = defpackage.ht0.v0(r9, r12)     // Catch: java.lang.Throwable -> L187
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L187
            java.util.Iterator r13 = r9.iterator()     // Catch: java.lang.Throwable -> L187
        L13d:
            boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L187
            if (r14 == 0) goto L18b
            java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L187
            s75 r14 = (defpackage.s75) r14     // Catch: java.lang.Throwable -> L187
            r14.getClass()     // Catch: java.lang.Throwable -> L187
            t75 r17 = new t75     // Catch: java.lang.Throwable -> L187
            r41 = r13
            long r12 = r14.a     // Catch: java.lang.Throwable -> L187
            r25 = r5
            r15 = r6
            long r5 = r14.b     // Catch: java.lang.Throwable -> L17e
            r20 = r5
            java.lang.String r5 = r14.c     // Catch: java.lang.Throwable -> L17e
            r75 r6 = r14.d     // Catch: java.lang.Throwable -> L17e
            java.lang.String r23 = r6.name()     // Catch: java.lang.Throwable -> L17e
            java.net.URL r6 = r14.e     // Catch: java.lang.Throwable -> L17e
            java.lang.String r24 = r6.toString()     // Catch: java.lang.Throwable -> L17e
            r24.getClass()     // Catch: java.lang.Throwable -> L17e
            r22 = r5
            r18 = r12
            r17.<init>(r18, r20, r22, r23, r24)     // Catch: java.lang.Throwable -> L17e
            r5 = r17
            r11.add(r5)     // Catch: java.lang.Throwable -> L17e
            r13 = r41
            r6 = r15
            r5 = r25
            r12 = 10
            goto L13d
        L17e:
            r0 = move-exception
        L17f:
            r39 = r4
            r4 = r3
            r2 = r1
            r1 = r39
            goto L2ff
        L187:
            r0 = move-exception
            r25 = r5
            goto L17f
        L18b:
            r25 = r5
            r15 = r6
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17e
            r5.<init>()     // Catch: java.lang.Throwable -> L17e
            java.util.Iterator r6 = r9.iterator()     // Catch: java.lang.Throwable -> L17e
        L197:
            boolean r12 = r6.hasNext()     // Catch: java.lang.Throwable -> L17e
            if (r12 == 0) goto L1d3
            java.lang.Object r12 = r6.next()     // Catch: java.lang.Throwable -> L17e
            s75 r12 = (defpackage.s75) r12     // Catch: java.lang.Throwable -> L17e
            java.util.ArrayList r12 = r12.f     // Catch: java.lang.Throwable -> L17e
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17e
            r41 = r6
            r14 = 10
            int r6 = defpackage.ht0.v0(r12, r14)     // Catch: java.lang.Throwable -> L17e
            r13.<init>(r6)     // Catch: java.lang.Throwable -> L17e
            int r6 = r12.size()     // Catch: java.lang.Throwable -> L17e
            r14 = 0
        L1b7:
            if (r14 >= r6) goto L1cd
            java.lang.Object r17 = r12.get(r14)     // Catch: java.lang.Throwable -> L17e
            int r14 = r14 + 1
            o75 r17 = (defpackage.o75) r17     // Catch: java.lang.Throwable -> L17e
            r42 = r6
            p75 r6 = defpackage.kn2.R(r17)     // Catch: java.lang.Throwable -> L17e
            r13.add(r6)     // Catch: java.lang.Throwable -> L17e
            r6 = r42
            goto L1b7
        L1cd:
            defpackage.gt0.A0(r5, r13)     // Catch: java.lang.Throwable -> L17e
            r6 = r41
            goto L197
        L1d3:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17e
            r6.<init>()     // Catch: java.lang.Throwable -> L17e
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17e
        L1dc:
            boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> L17e
            if (r12 == 0) goto L258
            java.lang.Object r12 = r9.next()     // Catch: java.lang.Throwable -> L17e
            s75 r12 = (defpackage.s75) r12     // Catch: java.lang.Throwable -> L17e
            java.util.ArrayList r12 = r12.g     // Catch: java.lang.Throwable -> L17e
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17e
            r43 = r5
            r14 = 10
            int r5 = defpackage.ht0.v0(r12, r14)     // Catch: java.lang.Throwable -> L17e
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L17e
            int r5 = r12.size()     // Catch: java.lang.Throwable -> L17e
            r14 = 0
        L1fc:
            if (r14 >= r5) goto L24a
            java.lang.Object r17 = r12.get(r14)     // Catch: java.lang.Throwable -> L17e
            int r14 = r14 + 1
            r41 = r5
            r5 = r17
            ta5 r5 = (defpackage.ta5) r5     // Catch: java.lang.Throwable -> L17e
            r5.getClass()     // Catch: java.lang.Throwable -> L17e
            va5 r26 = new va5     // Catch: java.lang.Throwable -> L17e
            r42 = r11
            r17 = r12
            long r11 = r5.a     // Catch: java.lang.Throwable -> L17e
            r27 = r11
            long r11 = r5.b     // Catch: java.lang.Throwable -> L17e
            r29 = r11
            long r11 = r5.c     // Catch: java.lang.Throwable -> L17e
            r44 = r9
            java.lang.String r9 = r5.d     // Catch: java.lang.Throwable -> L17e
            r33 = r9
            java.lang.String r9 = r5.e     // Catch: java.lang.Throwable -> L17e
            r34 = r9
            boolean r9 = r5.f     // Catch: java.lang.Throwable -> L17e
            r35 = r9
            java.lang.String r9 = r5.g     // Catch: java.lang.Throwable -> L17e
            r36 = r9
            java.lang.String r9 = r5.h     // Catch: java.lang.Throwable -> L17e
            boolean r5 = r5.i     // Catch: java.lang.Throwable -> L17e
            r38 = r5
            r37 = r9
            r31 = r11
            r26.<init>(r27, r29, r31, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L17e
            r5 = r26
            r13.add(r5)     // Catch: java.lang.Throwable -> L17e
            r5 = r41
            r11 = r42
            r9 = r44
            r12 = r17
            goto L1fc
        L24a:
            r44 = r9
            r42 = r11
            defpackage.gt0.A0(r6, r13)     // Catch: java.lang.Throwable -> L17e
            r11 = r42
            r5 = r43
            r9 = r44
            goto L1dc
        L258:
            r43 = r5
            r42 = r11
            ea5 r17 = new ea5     // Catch: java.lang.Throwable -> L17e
            long r11 = r0.a     // Catch: java.lang.Throwable -> L17e
            java.lang.String r5 = r0.d     // Catch: java.lang.Throwable -> L17e
            java.lang.String r9 = r0.b     // Catch: java.lang.Throwable -> L17e
            java.net.URL r13 = r0.c     // Catch: java.lang.Throwable -> L17e
            java.lang.String r22 = r13.toString()     // Catch: java.lang.Throwable -> L17e
            r22.getClass()     // Catch: java.lang.Throwable -> L17e
            r20 = r5
            r21 = r9
            r18 = r11
            r17.<init>(r18, r20, r21, r22)     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r5 = r3.L     // Catch: java.lang.Throwable -> L17e
            ia5 r5 = (defpackage.ia5) r5     // Catch: java.lang.Throwable -> L17e
            if (r5 == 0) goto L28a
            vr0 r9 = defpackage.u83.a     // Catch: java.lang.Throwable -> L17e
            s83 r9 = r9.b()     // Catch: java.lang.Throwable -> L17e
            r11 = 13
            r12 = 0
            ia5 r5 = defpackage.ia5.a(r5, r9, r12, r12, r11)     // Catch: java.lang.Throwable -> L17e
            goto L29f
        L28a:
            ia5 r18 = new ia5     // Catch: java.lang.Throwable -> L17e
            long r11 = r3.B     // Catch: java.lang.Throwable -> L17e
            vr0 r5 = defpackage.u83.a     // Catch: java.lang.Throwable -> L17e
            s83 r21 = r5.b()     // Catch: java.lang.Throwable -> L17e
            r22 = 0
            r23 = 0
            r19 = r11
            r18.<init>(r19, r21, r22, r23)     // Catch: java.lang.Throwable -> L17e
            r5 = r18
        L29f:
            r3.L = r5     // Catch: java.lang.Throwable -> L17e
            r8.X = r3     // Catch: java.lang.Throwable -> L17e
            r8.Y = r0     // Catch: java.lang.Throwable -> L17e
            r9 = 0
            r8.Z = r9     // Catch: java.lang.Throwable -> L17e
            r8.R = r1     // Catch: java.lang.Throwable -> L17e
            r8.d0 = r4     // Catch: java.lang.Throwable -> L17e
            r5 = 0
            r8.e0 = r5     // Catch: java.lang.Throwable -> L17e
            r8.f0 = r5     // Catch: java.lang.Throwable -> L17e
            r8.g0 = r5     // Catch: java.lang.Throwable -> L17e
            r8.h0 = r5     // Catch: java.lang.Throwable -> L17e
            r5 = 2
            r8.k0 = r5     // Catch: java.lang.Throwable -> L17e
            r44 = r6
            r45 = r8
            r40 = r15
            r41 = r17
            java.lang.Object r5 = r40.E(r41, r42, r43, r44, r45)     // Catch: java.lang.Throwable -> L2fa
            r8 = r45
            if (r5 != r10) goto L2ca
            goto L37a
        L2ca:
            r14 = r1
            r11 = r3
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
        L2d0:
            r8.X = r11     // Catch: java.lang.Throwable -> L2f6
            r8.Y = r0     // Catch: java.lang.Throwable -> L2f6
            r9 = 0
            r8.Z = r9     // Catch: java.lang.Throwable -> L2f6
            r8.R = r14     // Catch: java.lang.Throwable -> L2f6
            r8.d0 = r4     // Catch: java.lang.Throwable -> L2f6
            r8.e0 = r5     // Catch: java.lang.Throwable -> L2f6
            r8.f0 = r3     // Catch: java.lang.Throwable -> L2f6
            r8.g0 = r2     // Catch: java.lang.Throwable -> L2f6
            r8.h0 = r1     // Catch: java.lang.Throwable -> L2f6
            r1 = 3
            r8.k0 = r1     // Catch: java.lang.Throwable -> L2f6
            jg7 r1 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L2f6
            if (r1 != r10) goto L2ec
            goto L37a
        L2ec:
            r1 = r4
            r4 = r11
            r2 = r14
        L2ef:
            r39 = r4
            r4 = r1
            r1 = r2
            r3 = r39
            goto L31e
        L2f6:
            r0 = move-exception
            r1 = r4
            goto L99
        L2fa:
            r0 = move-exception
            r8 = r45
            goto L17f
        L2ff:
            r25.getClass()
            defpackage.yh2.o(r25)
            em5 r5 = new em5
            r5.<init>(r0)
            r0 = r4
            r4 = r1
            r1 = r2
            r3 = r0
            goto L31d
        L30f:
            r25 = r5
            java.lang.Throwable r0 = defpackage.hm5.a(r0)
            r0.getClass()
            em5 r5 = new em5
            r5.<init>(r0)
        L31d:
            r0 = r5
        L31e:
            java.lang.Throwable r5 = defpackage.hm5.a(r0)
            if (r5 != 0) goto L326
            goto L393
        L326:
            java.lang.Object r0 = r3.L     // Catch: java.lang.Throwable -> L359
            ia5 r0 = (defpackage.ia5) r0     // Catch: java.lang.Throwable -> L359
            if (r0 == 0) goto L32f
            s83 r0 = r0.b     // Catch: java.lang.Throwable -> L359
            goto L330
        L32f:
            r0 = 0
        L330:
            if (r0 == 0) goto L35d
            r9 = 0
            r8.X = r9     // Catch: java.lang.Throwable -> L359
            r8.Y = r9     // Catch: java.lang.Throwable -> L359
            r8.Z = r9     // Catch: java.lang.Throwable -> L359
            r8.R = r1     // Catch: java.lang.Throwable -> L359
            r8.d0 = r4     // Catch: java.lang.Throwable -> L359
            r3 = 0
            r8.e0 = r3     // Catch: java.lang.Throwable -> L359
            r8.f0 = r3     // Catch: java.lang.Throwable -> L359
            r8.g0 = r3     // Catch: java.lang.Throwable -> L359
            r8.h0 = r3     // Catch: java.lang.Throwable -> L359
            r0 = 4
            r8.k0 = r0     // Catch: java.lang.Throwable -> L359
            java.lang.Object r9 = r7.s(r1, r8)     // Catch: java.lang.Throwable -> L359
            if (r9 != r10) goto L350
            goto L37a
        L350:
            ka5 r9 = (defpackage.ka5) r9     // Catch: java.lang.Throwable -> L359
            if (r9 == 0) goto L35b
            da5 r13 = defpackage.ln2.O(r9)     // Catch: java.lang.Throwable -> L359
            goto L384
        L359:
            r0 = move-exception
            goto L387
        L35b:
            r13 = 0
            goto L384
        L35d:
            r9 = 0
            r8.X = r9     // Catch: java.lang.Throwable -> L359
            r8.Y = r9     // Catch: java.lang.Throwable -> L359
            r8.Z = r5     // Catch: java.lang.Throwable -> L359
            r8.R = r1     // Catch: java.lang.Throwable -> L359
            r8.d0 = r4     // Catch: java.lang.Throwable -> L359
            r3 = 0
            r8.e0 = r3     // Catch: java.lang.Throwable -> L359
            r8.f0 = r3     // Catch: java.lang.Throwable -> L359
            r8.g0 = r3     // Catch: java.lang.Throwable -> L359
            r8.h0 = r3     // Catch: java.lang.Throwable -> L359
            r0 = 5
            r8.k0 = r0     // Catch: java.lang.Throwable -> L359
            java.lang.Object r9 = r7.s(r1, r8)     // Catch: java.lang.Throwable -> L359
            if (r9 != r10) goto L37b
        L37a:
            return r10
        L37b:
            r0 = r5
        L37c:
            ka5 r9 = (defpackage.ka5) r9     // Catch: java.lang.Throwable -> L359
            if (r9 == 0) goto L386
            da5 r13 = defpackage.ln2.O(r9)     // Catch: java.lang.Throwable -> L359
        L384:
            r0 = r13
            goto L393
        L386:
            throw r0     // Catch: java.lang.Throwable -> L359
        L387:
            r25.getClass()
            defpackage.yh2.o(r25)
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L393:
            return r0
    }

    public final java.lang.Object g(long r21, boolean r23, defpackage.kk r24, boolean r25, defpackage.s41 r26) {
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            qf4 r7 = r0.b
            vm5 r8 = r7.a
            boolean r9 = r6 instanceof defpackage.qk
            if (r9 == 0) goto L23
            r9 = r6
            qk r9 = (defpackage.qk) r9
            int r10 = r9.i0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L23
            int r10 = r10 - r11
            r9.i0 = r10
            goto L28
        L23:
            qk r9 = new qk
            r9.<init>(r0, r6)
        L28:
            l61 r6 = r9.B
            java.lang.Object r10 = r9.g0
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r9.i0
            r15 = 0
            switch(r12) {
                case 0: goto La3;
                case 1: goto L8a;
                case 2: goto L72;
                case 3: goto L61;
                case 4: goto L56;
                case 5: goto L46;
                case 6: goto L3a;
                default: goto L34;
            }
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r15
        L3a:
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L41
            r17 = r6
            goto Lf0
        L41:
            r0 = move-exception
            r17 = r6
            goto L11b
        L46:
            ia5 r0 = r9.e0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L51
            r17 = r6
            goto L28b
        L51:
            r0 = move-exception
            r17 = r6
            goto L2b4
        L56:
            ia5 r0 = r9.e0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L51
            r17 = r6
            goto L247
        L61:
            boolean r0 = r9.Y
            boolean r1 = r9.X
            long r2 = r9.R
            java.lang.Object r4 = r9.d0
            kk r5 = r9.Z
            defpackage.oi2.Y(r10)
            r17 = r6
            goto L20c
        L72:
            int r0 = r9.f0
            boolean r1 = r9.Y
            boolean r2 = r9.X
            long r3 = r9.R
            java.lang.Object r5 = r9.d0
            kk r7 = r9.Z
            defpackage.oi2.Y(r10)
            r12 = r1
            r1 = r0
            r0 = r12
            r12 = r5
            r17 = r6
            r5 = r7
            goto L1f2
        L8a:
            boolean r0 = r9.Y
            boolean r1 = r9.X
            long r2 = r9.R
            kk r4 = r9.Z
            defpackage.oi2.Y(r10)
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r5 = r10.A
            r10 = r0
            r12 = r5
            r17 = r6
            r18 = r7
            r7 = r1
        La0:
            r0 = r4
            goto L145
        La3:
            defpackage.oi2.Y(r10)
            r10 = 1
            if (r5 != 0) goto L127
            java.lang.Object r12 = r4.L
            ia5 r12 = (defpackage.ia5) r12
            if (r3 == 0) goto Lb6
            if (r12 == 0) goto Lb4
            s83 r12 = r12.d
            goto Lba
        Lb4:
            r12 = r15
            goto Lba
        Lb6:
            if (r12 == 0) goto Lb4
            s83 r12 = r12.c
        Lba:
            if (r12 != 0) goto Lbd
            goto L127
        Lbd:
            vr0 r16 = defpackage.u83.a
            s83 r13 = r16.b()
            long r12 = r13.a(r12)
            jd1 r16 = defpackage.oq1.B
            uq1 r14 = defpackage.uq1.DAYS
            r17 = r6
            r18 = r7
            long r6 = defpackage.n16.L(r10, r14)
            int r6 = defpackage.oq1.c(r12, r6)
            if (r6 < 0) goto Lda
            goto L12b
        Lda:
            r9.Z = r15     // Catch: java.lang.Throwable -> L118
            r9.R = r1     // Catch: java.lang.Throwable -> L118
            r9.X = r3     // Catch: java.lang.Throwable -> L118
            r9.Y = r5     // Catch: java.lang.Throwable -> L118
            r0 = 0
            r9.f0 = r0     // Catch: java.lang.Throwable -> L118
            r0 = 6
            r9.i0 = r0     // Catch: java.lang.Throwable -> L118
            java.lang.Object r10 = r8.r(r1, r3, r9)     // Catch: java.lang.Throwable -> L118
            if (r10 != r11) goto Lf0
            goto L28a
        Lf0:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L118
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L118
            r1 = 10
            int r1 = defpackage.ht0.v0(r10, r1)     // Catch: java.lang.Throwable -> L118
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L118
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> L118
        L101:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L118
            if (r2 == 0) goto L11a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L118
            fb5 r2 = (defpackage.fb5) r2     // Catch: java.lang.Throwable -> L118
            long r2 = r2.b     // Catch: java.lang.Throwable -> L118
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L118
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L118
            r0.add(r4)     // Catch: java.lang.Throwable -> L118
            goto L101
        L118:
            r0 = move-exception
            goto L11b
        L11a:
            return r0
        L11b:
            r17.getClass()
            defpackage.yh2.o(r17)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L127:
            r17 = r6
            r18 = r7
        L12b:
            r9.Z = r4
            r9.R = r1
            r9.X = r3
            r9.Y = r5
            r9.i0 = r10
            l85 r0 = r0.a
            java.lang.Object r0 = r0.p(r1, r3, r9)
            if (r0 != r11) goto L13f
            goto L28a
        L13f:
            r12 = r0
            r7 = r3
            r10 = r5
            r2 = r1
            goto La0
        L145:
            boolean r1 = r12 instanceof defpackage.em5
            if (r1 != 0) goto L210
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r13 = new java.util.ArrayList
            r4 = 10
            int r5 = defpackage.ht0.v0(r1, r4)
            r13.<init>(r5)
            java.util.Iterator r14 = r1.iterator()
        L15b:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L175
            java.lang.Object r1 = r14.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            fb5 r1 = new fb5
            r6 = 1
            r1.<init>(r2, r4, r6, r7)
            r13.add(r1)
            goto L15b
        L175:
            java.lang.Object r1 = r0.L
            ia5 r1 = (defpackage.ia5) r1
            if (r7 == 0) goto L1a6
            if (r1 == 0) goto L189
            vr0 r4 = defpackage.u83.a
            s83 r4 = r4.b()
            r5 = 7
            ia5 r1 = defpackage.ia5.a(r1, r15, r15, r4, r5)
            goto L1d1
        L189:
            ia5 r1 = new ia5
            long r4 = r0.B
            vr0 r6 = defpackage.u83.a
            s83 r6 = r6.b()
            r14 = 0
            r19 = 0
            r20 = r1
            r21 = r4
            r25 = r6
            r23 = r14
            r24 = r19
            r20.<init>(r21, r23, r24, r25)
            r0.L = r1
            goto L1d1
        L1a6:
            if (r1 == 0) goto L1b5
            vr0 r4 = defpackage.u83.a
            s83 r4 = r4.b()
            r5 = 11
            ia5 r1 = defpackage.ia5.a(r1, r15, r4, r15, r5)
            goto L1d1
        L1b5:
            ia5 r1 = new ia5
            long r4 = r0.B
            vr0 r6 = defpackage.u83.a
            s83 r6 = r6.b()
            r14 = 0
            r19 = 0
            r20 = r1
            r21 = r4
            r24 = r6
            r25 = r14
            r23 = r19
            r20.<init>(r21, r23, r24, r25)
            r0.L = r1
        L1d1:
            r9.Z = r0
            r9.d0 = r12
            r9.e0 = r1
            r9.R = r2
            r9.X = r7
            r9.Y = r10
            r1 = 0
            r9.f0 = r1
            r1 = 2
            r9.i0 = r1
            r1 = r18
            java.lang.Object r1 = r1.I(r2, r13, r9)
            if (r1 != r11) goto L1ed
            goto L28a
        L1ed:
            r5 = r0
            r3 = r2
            r2 = r7
            r0 = r10
            r1 = 0
        L1f2:
            r9.Z = r5
            r9.d0 = r12
            r9.e0 = r15
            r9.R = r3
            r9.X = r2
            r9.Y = r0
            r9.f0 = r1
            r1 = 3
            r9.i0 = r1
            jg7 r1 = defpackage.jg7.a
            if (r1 != r11) goto L209
            goto L28a
        L209:
            r1 = r2
            r2 = r3
            r4 = r12
        L20c:
            r10 = r0
            r7 = r1
            r12 = r4
            r0 = r5
        L210:
            java.lang.Throwable r1 = defpackage.hm5.a(r12)
            if (r1 != 0) goto L217
            return r12
        L217:
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L26f
            ia5 r0 = (defpackage.ia5) r0     // Catch: java.lang.Throwable -> L26f
            if (r7 == 0) goto L226
            if (r0 == 0) goto L222
            s83 r0 = r0.d     // Catch: java.lang.Throwable -> L26f
            goto L223
        L222:
            r0 = r15
        L223:
            if (r0 == 0) goto L272
            goto L22e
        L226:
            if (r0 == 0) goto L22b
            s83 r0 = r0.c     // Catch: java.lang.Throwable -> L26f
            goto L22c
        L22b:
            r0 = r15
        L22c:
            if (r0 == 0) goto L272
        L22e:
            r9.Z = r15     // Catch: java.lang.Throwable -> L26f
            r9.d0 = r15     // Catch: java.lang.Throwable -> L26f
            r9.e0 = r15     // Catch: java.lang.Throwable -> L26f
            r9.R = r2     // Catch: java.lang.Throwable -> L26f
            r9.X = r7     // Catch: java.lang.Throwable -> L26f
            r9.Y = r10     // Catch: java.lang.Throwable -> L26f
            r0 = 0
            r9.f0 = r0     // Catch: java.lang.Throwable -> L26f
            r0 = 4
            r9.i0 = r0     // Catch: java.lang.Throwable -> L26f
            java.lang.Object r10 = r8.r(r2, r7, r9)     // Catch: java.lang.Throwable -> L26f
            if (r10 != r11) goto L247
            goto L28a
        L247:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L26f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26f
            r1 = 10
            int r1 = defpackage.ht0.v0(r10, r1)     // Catch: java.lang.Throwable -> L26f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L26f
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> L26f
        L258:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26f
            if (r2 == 0) goto L271
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26f
            fb5 r2 = (defpackage.fb5) r2     // Catch: java.lang.Throwable -> L26f
            long r2 = r2.b     // Catch: java.lang.Throwable -> L26f
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L26f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L26f
            r0.add(r4)     // Catch: java.lang.Throwable -> L26f
            goto L258
        L26f:
            r0 = move-exception
            goto L2b4
        L271:
            return r0
        L272:
            r9.Z = r15     // Catch: java.lang.Throwable -> L26f
            r9.d0 = r15     // Catch: java.lang.Throwable -> L26f
            r9.e0 = r15     // Catch: java.lang.Throwable -> L26f
            r9.R = r2     // Catch: java.lang.Throwable -> L26f
            r9.X = r7     // Catch: java.lang.Throwable -> L26f
            r9.Y = r10     // Catch: java.lang.Throwable -> L26f
            r0 = 0
            r9.f0 = r0     // Catch: java.lang.Throwable -> L26f
            r0 = 5
            r9.i0 = r0     // Catch: java.lang.Throwable -> L26f
            java.lang.Object r10 = r8.r(r2, r7, r9)     // Catch: java.lang.Throwable -> L26f
            if (r10 != r11) goto L28b
        L28a:
            return r11
        L28b:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L26f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26f
            r1 = 10
            int r1 = defpackage.ht0.v0(r10, r1)     // Catch: java.lang.Throwable -> L26f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L26f
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> L26f
        L29c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26f
            if (r2 == 0) goto L2b3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26f
            fb5 r2 = (defpackage.fb5) r2     // Catch: java.lang.Throwable -> L26f
            long r2 = r2.b     // Catch: java.lang.Throwable -> L26f
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L26f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L26f
            r0.add(r4)     // Catch: java.lang.Throwable -> L26f
            goto L29c
        L2b3:
            return r0
        L2b4:
            r17.getClass()
            defpackage.yh2.o(r17)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
    }

    public final java.lang.Object h(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.rk
            if (r0 == 0) goto L13
            r0 = r8
            rk r0 = (defpackage.rk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rk r0 = new rk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r5 = move-exception
            goto L43
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            qf4 r5 = r5.b     // Catch: java.lang.Throwable -> L28
            r0.Y = r4     // Catch: java.lang.Throwable -> L28
            vm5 r5 = r5.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r5.m(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L40
            return r1
        L40:
            p75 r8 = (defpackage.p75) r8     // Catch: java.lang.Throwable -> L28
            goto L50
        L43:
            l61 r6 = r0.B
            r6.getClass()
            defpackage.yh2.o(r6)
            em5 r8 = new em5
            r8.<init>(r5)
        L50:
            boolean r5 = r8 instanceof defpackage.em5
            if (r5 != 0) goto L5d
            p75 r8 = (defpackage.p75) r8
            if (r8 == 0) goto L5c
            o75 r3 = defpackage.kn2.S(r8)
        L5c:
            r8 = r3
        L5d:
            return r8
    }

    public final java.lang.Object i(long r13, defpackage.s41 r15) {
            r12 = this;
            boolean r0 = r15 instanceof defpackage.sk
            if (r0 == 0) goto L13
            r0 = r15
            sk r0 = (defpackage.sk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sk r0 = new sk
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r15)
            goto L3e
        L28:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r3
        L2e:
            defpackage.oi2.Y(r15)
            r0.Y = r4
            qf4 r12 = r12.b
            vm5 r12 = r12.a
            java.lang.Object r15 = r12.n(r13, r0)
            if (r15 != r1) goto L3e
            return r1
        L3e:
            t75 r15 = (defpackage.t75) r15
            if (r15 == 0) goto L62
            u75 r4 = new u75
            long r5 = r15.a
            long r7 = r15.b
            java.lang.String r9 = r15.c
            java.lang.String r12 = r15.d
            r75[] r13 = defpackage.r75.values()
            java.lang.Enum r12 = defpackage.jw2.o(r12, r13)
            r10 = r12
            r75 r10 = (defpackage.r75) r10
            java.net.URL r11 = new java.net.URL
            java.lang.String r12 = r15.e
            r11.<init>(r12)
            r4.<init>(r5, r7, r9, r10, r11)
            return r4
        L62:
            return r3
    }

    public final java.lang.Object j(java.lang.String r12, boolean r13, defpackage.s41 r14) {
            r11 = this;
            qf4 r0 = r11.b
            vm5 r0 = r0.a
            boolean r1 = r14 instanceof defpackage.tk
            if (r1 == 0) goto L17
            r1 = r14
            tk r1 = (defpackage.tk) r1
            int r2 = r1.g0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.g0 = r2
            goto L1c
        L17:
            tk r1 = new tk
            r1.<init>(r11, r14)
        L1c:
            java.lang.Object r14 = r1.e0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.g0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L5a
            if (r3 == r6) goto L4c
            if (r3 == r5) goto L40
            if (r3 != r4) goto L3a
            boolean r12 = r1.X
            da5 r13 = r1.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L37
            goto La7
        L37:
            r11 = move-exception
            goto Ld5
        L3a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r7
        L40:
            long r12 = r1.d0
            int r3 = r1.Z
            int r5 = r1.Y
            boolean r6 = r1.X
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L37
            goto L8a
        L4c:
            int r12 = r1.Z
            int r13 = r1.Y
            boolean r3 = r1.X
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L37
            r10 = r3
            r3 = r12
            r12 = r13
            r13 = r10
            goto L70
        L5a:
            defpackage.oi2.Y(r14)
            r1.X = r13     // Catch: java.lang.Throwable -> L37
            r14 = 0
            r1.Y = r14     // Catch: java.lang.Throwable -> L37
            r1.Z = r14     // Catch: java.lang.Throwable -> L37
            r1.g0 = r6     // Catch: java.lang.Throwable -> L37
            java.lang.Object r12 = r0.q(r12, r1)     // Catch: java.lang.Throwable -> L37
            if (r12 != r2) goto L6d
            goto La4
        L6d:
            r3 = r14
            r14 = r12
            r12 = r3
        L70:
            fa5 r14 = (defpackage.fa5) r14     // Catch: java.lang.Throwable -> L37
            if (r14 == 0) goto Ld4
            long r8 = r14.b     // Catch: java.lang.Throwable -> L37
            r1.X = r13     // Catch: java.lang.Throwable -> L37
            r1.Y = r12     // Catch: java.lang.Throwable -> L37
            r1.Z = r3     // Catch: java.lang.Throwable -> L37
            r1.d0 = r8     // Catch: java.lang.Throwable -> L37
            r1.g0 = r5     // Catch: java.lang.Throwable -> L37
            java.lang.Object r14 = r0.s(r8, r1)     // Catch: java.lang.Throwable -> L37
            if (r14 != r2) goto L87
            goto La4
        L87:
            r5 = r12
            r6 = r13
            r12 = r8
        L8a:
            ka5 r14 = (defpackage.ka5) r14     // Catch: java.lang.Throwable -> L37
            if (r14 == 0) goto L92
            da5 r7 = defpackage.ln2.O(r14)     // Catch: java.lang.Throwable -> L37
        L92:
            r1.R = r7     // Catch: java.lang.Throwable -> L37
            r1.X = r6     // Catch: java.lang.Throwable -> L37
            r1.Y = r5     // Catch: java.lang.Throwable -> L37
            r1.Z = r3     // Catch: java.lang.Throwable -> L37
            r1.d0 = r12     // Catch: java.lang.Throwable -> L37
            r1.g0 = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Object r14 = r0.r(r12, r6, r1)     // Catch: java.lang.Throwable -> L37
            if (r14 != r2) goto La5
        La4:
            return r2
        La5:
            r12 = r6
            r13 = r7
        La7:
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r2 = 10
            int r2 = defpackage.ht0.v0(r14, r2)     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L37
        Lb8:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> L37
            fb5 r2 = (defpackage.fb5) r2     // Catch: java.lang.Throwable -> L37
            long r2 = r2.b     // Catch: java.lang.Throwable -> L37
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L37
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r0.add(r4)     // Catch: java.lang.Throwable -> L37
            goto Lb8
        Lcf:
            kb5 r11 = r11.d(r13, r0, r12)     // Catch: java.lang.Throwable -> L37
            return r11
        Ld4:
            return r7
        Ld5:
            l61 r12 = r1.B
            r12.getClass()
            defpackage.yh2.o(r12)
            em5 r12 = new em5
            r12.<init>(r11)
            return r12
    }

    public final java.lang.Object k(java.lang.String r20, boolean r21, defpackage.s41 r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            qf4 r4 = r0.b
            vm5 r5 = r4.a
            boolean r6 = r3 instanceof defpackage.uk
            if (r6 == 0) goto L1f
            r6 = r3
            uk r6 = (defpackage.uk) r6
            int r7 = r6.e0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L1f
            int r7 = r7 - r8
            r6.e0 = r7
            goto L24
        L1f:
            uk r6 = new uk
            r6.<init>(r0, r3)
        L24:
            l61 r3 = r6.B
            java.lang.Object r7 = r6.Z
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r6.e0
            java.lang.String r10 = "ra_hash_library_last_updated"
            android.content.SharedPreferences r11 = r0.e
            r13 = 3
            r14 = 2
            r15 = 1
            r12 = 0
            if (r9 == 0) goto L70
            if (r9 == r15) goto L62
            if (r9 == r14) goto L54
            if (r9 == r13) goto L4c
            r0 = 4
            if (r9 != r0) goto L46
            defpackage.oi2.Y(r7)     // Catch: java.lang.Throwable -> L43
            goto Lab
        L43:
            r0 = move-exception
            goto Lb7
        L46:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L4c:
            defpackage.oi2.Y(r7)     // Catch: java.lang.Throwable -> L51
            goto L16b
        L51:
            r0 = move-exception
            goto L178
        L54:
            boolean r0 = r6.Y
            java.lang.Object r1 = r6.X
            java.lang.String r2 = r6.R
            defpackage.oi2.Y(r7)
            r17 = r10
            r15 = r11
            goto L12d
        L62:
            boolean r0 = r6.Y
            java.lang.String r1 = r6.R
            defpackage.oi2.Y(r7)
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r2 = r7.A
            r17 = r10
            goto Lda
        L70:
            defpackage.oi2.Y(r7)
            if (r2 != 0) goto Lc3
            r13 = 0
            long r13 = r11.getLong(r10, r13)
            s83 r16 = defpackage.s83.L
            s83 r13 = defpackage.bl2.z(r13)
            vr0 r14 = defpackage.u83.a
            s83 r14 = r14.b()
            long r13 = r14.a(r13)
            jd1 r16 = defpackage.oq1.B
            uq1 r7 = defpackage.uq1.DAYS
            r17 = r10
            long r9 = defpackage.n16.L(r15, r7)
            int r7 = defpackage.oq1.c(r13, r9)
            if (r7 <= 0) goto L9c
            goto Lc5
        L9c:
            r6.R = r12     // Catch: java.lang.Throwable -> L43
            r6.Y = r2     // Catch: java.lang.Throwable -> L43
            r0 = 4
            r6.e0 = r0     // Catch: java.lang.Throwable -> L43
            java.lang.Object r7 = r5.q(r1, r6)     // Catch: java.lang.Throwable -> L43
            if (r7 != r8) goto Lab
            goto L16a
        Lab:
            fa5 r7 = (defpackage.fa5) r7     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L177
            long r0 = r7.b     // Catch: java.lang.Throwable -> L43
            ga5 r2 = new ga5     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L43
            return r2
        Lb7:
            r3.getClass()
            defpackage.yh2.o(r3)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        Lc3:
            r17 = r10
        Lc5:
            r6.R = r1
            r6.Y = r2
            r6.e0 = r15
            l85 r0 = r0.a
            java.lang.Object r0 = r0.n(r6)
            if (r0 != r8) goto Ld5
            goto L16a
        Ld5:
            r18 = r2
            r2 = r0
            r0 = r18
        Lda:
            boolean r7 = r2 instanceof defpackage.em5
            if (r7 != 0) goto L148
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r7.size()
            r9.<init>(r10)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lf2:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L117
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            fa5 r13 = new fa5
            java.lang.Object r14 = r10.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r10.getValue()
            ga5 r10 = (defpackage.ga5) r10
            r15 = r11
            long r10 = r10.a
            r13.<init>(r14, r10)
            r9.add(r13)
            r11 = r15
            goto Lf2
        L117:
            r15 = r11
            r6.R = r1
            r6.X = r2
            r6.Y = r0
            r7 = 2
            r6.e0 = r7
            java.lang.Object r4 = r4.G(r9, r6)
            if (r4 != r8) goto L128
            goto L16a
        L128:
            r18 = r2
            r2 = r1
            r1 = r18
        L12d:
            android.content.SharedPreferences$Editor r4 = r15.edit()
            vr0 r7 = defpackage.u83.a
            s83 r7 = r7.b()
            long r9 = r7.b()
            r7 = r17
            r4.putLong(r7, r9)
            r4.apply()
            r18 = r2
            r2 = r1
            r1 = r18
        L148:
            boolean r4 = r2 instanceof defpackage.em5
            if (r4 != 0) goto L154
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r2.get(r1)
            ga5 r2 = (defpackage.ga5) r2
        L154:
            java.lang.Throwable r4 = defpackage.hm5.a(r2)
            if (r4 != 0) goto L15b
            return r2
        L15b:
            r6.R = r12     // Catch: java.lang.Throwable -> L51
            r6.X = r12     // Catch: java.lang.Throwable -> L51
            r6.Y = r0     // Catch: java.lang.Throwable -> L51
            r7 = 3
            r6.e0 = r7     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r5.q(r1, r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != r8) goto L16b
        L16a:
            return r8
        L16b:
            fa5 r7 = (defpackage.fa5) r7     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L177
            long r0 = r7.b     // Catch: java.lang.Throwable -> L51
            ga5 r2 = new ga5     // Catch: java.lang.Throwable -> L51
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L51
            return r2
        L177:
            return r12
        L178:
            r3.getClass()
            defpackage.yh2.o(r3)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
    }

    public final java.lang.Object l(java.lang.String r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vk
            if (r0 == 0) goto L13
            r0 = r8
            vk r0 = (defpackage.vk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vk r0 = new vk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.oi2.Y(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r5
        L31:
            defpackage.oi2.Y(r8)
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r7 = r8.A
            goto L46
        L39:
            defpackage.oi2.Y(r8)
            r0.Y = r4
            r8 = 0
            java.lang.Object r7 = r6.k(r7, r8, r0)
            if (r7 != r1) goto L46
            goto L59
        L46:
            boolean r8 = r7 instanceof defpackage.em5
            if (r8 == 0) goto L4b
            r7 = r5
        L4b:
            ga5 r7 = (defpackage.ga5) r7
            if (r7 == 0) goto L5b
            long r7 = r7.a
            r0.Y = r3
            java.lang.Object r6 = r6.m(r7, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        L5b:
            return r5
    }

    public final java.lang.Object m(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.wk
            if (r0 == 0) goto L13
            r0 = r8
            wk r0 = (defpackage.wk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wk r0 = new wk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r8)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r8)
            r0.Y = r4
            qf4 r5 = r5.b
            vm5 r5 = r5.a
            java.lang.Object r8 = r5.p(r6, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            ea5 r8 = (defpackage.ea5) r8
            if (r8 == 0) goto L53
            ja5 r5 = new ja5
            java.lang.String r6 = r8.c
            java.net.URL r7 = new java.net.URL
            java.lang.String r0 = r8.d
            r7.<init>(r0)
            java.lang.String r8 = r8.b
            r5.<init>(r6, r7, r8)
            return r5
        L53:
            return r3
    }

    public final java.lang.Object n(long r20, defpackage.s41 r22) {
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof defpackage.xk
            if (r2 == 0) goto L17
            r2 = r1
            xk r2 = (defpackage.xk) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            xk r2 = new xk
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L32
            if (r4 != r6) goto L2c
            defpackage.oi2.Y(r1)
            goto L44
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L32:
            defpackage.oi2.Y(r1)
            r2.Y = r6
            qf4 r0 = r0.b
            vm5 r0 = r0.a
            r6 = r20
            java.lang.Object r1 = r0.t(r6, r2)
            if (r1 != r3) goto L44
            return r3
        L44:
            va5 r1 = (defpackage.va5) r1
            if (r1 == 0) goto L66
            ta5 r6 = new ta5
            long r7 = r1.a
            long r9 = r1.b
            long r11 = r1.c
            java.lang.String r13 = r1.d
            java.lang.String r14 = r1.e
            boolean r15 = r1.f
            java.lang.String r0 = r1.g
            java.lang.String r2 = r1.h
            boolean r1 = r1.i
            r16 = r0
            r18 = r1
            r17 = r2
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18)
            return r6
        L66:
            return r5
    }

    public final java.lang.Object o(long r5, int r7, int r8, defpackage.s41 r9) {
            r4 = this;
            boolean r0 = r9 instanceof defpackage.yk
            if (r0 == 0) goto L14
            r0 = r9
            yk r0 = (defpackage.yk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            yk r0 = new yk
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            defpackage.oi2.Y(r0)
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r4 = r0.A
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L34:
            defpackage.oi2.Y(r0)
            r9.Y = r3
            l85 r4 = r4.a
            java.lang.Object r4 = r4.o(r5, r7, r8, r9)
            if (r4 != r1) goto L42
            return r1
        L42:
            return r4
    }

    public final java.lang.Object p(java.lang.String r5, boolean r6, defpackage.s41 r7) {
            r4 = this;
            boolean r0 = r7 instanceof defpackage.al
            if (r0 == 0) goto L13
            r0 = r7
            al r0 = (defpackage.al) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            al r0 = new al
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.oi2.Y(r7)
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r4 = r7.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.oi2.Y(r7)
            r0.Y = r3
            r7 = 0
            java.lang.Object r4 = r4.q(r5, r6, r7, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            return r4
    }

    public final java.lang.Object q(java.lang.String r11, boolean r12, boolean r13, defpackage.s41 r14) {
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bl
            if (r0 == 0) goto L14
            r0 = r14
            bl r0 = (defpackage.bl) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h0 = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            bl r0 = new bl
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.h0
            r8 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r9 = 0
            if (r1 == 0) goto L76
            if (r1 == r4) goto L68
            if (r1 == r3) goto L5a
            if (r1 == r2) goto L43
            if (r1 != r8) goto L3d
            boolean r11 = r7.d0
            java.lang.Object r12 = r7.Z
            defpackage.oi2.Y(r14)
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r13 = r14.A
            r1 = r10
            goto Lfe
        L3d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r9
        L43:
            boolean r11 = r7.e0
            boolean r12 = r7.d0
            kk r13 = r7.Y
            ga5 r1 = r7.X
            defpackage.oi2.Y(r14)
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r14 = r14.A
            r6 = r11
            r4 = r12
            r5 = r13
            r12 = r14
            r13 = r1
            r1 = r10
            goto Ld4
        L5a:
            boolean r11 = r7.e0
            boolean r12 = r7.d0
            ga5 r13 = r7.X
            java.lang.String r1 = r7.R
            defpackage.oi2.Y(r14)
            r6 = r11
            r4 = r1
            goto Lb3
        L68:
            boolean r13 = r7.e0
            boolean r12 = r7.d0
            java.lang.String r11 = r7.R
            defpackage.oi2.Y(r14)
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r14 = r14.A
            goto L89
        L76:
            defpackage.oi2.Y(r14)
            r7.R = r11
            r7.d0 = r12
            r7.e0 = r13
            r7.h0 = r4
            java.lang.Object r14 = r10.k(r11, r13, r7)
            if (r14 != r0) goto L89
            goto Lfc
        L89:
            boolean r1 = r14 instanceof defpackage.em5
            if (r1 == 0) goto L9a
            java.lang.Throwable r10 = defpackage.hm5.a(r14)
            r10.getClass()
            em5 r11 = new em5
            r11.<init>(r10)
            return r11
        L9a:
            defpackage.oi2.Y(r14)
            ga5 r14 = (defpackage.ga5) r14
            if (r14 != 0) goto La2
            return r9
        La2:
            r7.R = r11
            r7.X = r14
            r7.d0 = r12
            r7.e0 = r13
            r7.h0 = r3
            if (r0 != 0) goto Laf
            goto Lfc
        Laf:
            r4 = r11
            r6 = r13
            r13 = r14
            r14 = r9
        Lb3:
            ia5 r14 = (defpackage.ia5) r14
            kk r5 = new kk
            r11 = r2
            long r2 = r13.a
            r1 = 0
            r5.<init>(r14, r2, r1)
            r7.R = r9
            r7.X = r13
            r7.Y = r5
            r7.d0 = r12
            r7.e0 = r6
            r7.h0 = r11
            r1 = r10
            java.lang.Object r10 = r1.f(r2, r4, r5, r6, r7)
            if (r10 != r0) goto Ld2
            goto Lfc
        Ld2:
            r4 = r12
            r12 = r10
        Ld4:
            boolean r10 = r12 instanceof defpackage.em5
            if (r10 == 0) goto Le6
            java.lang.Throwable r10 = defpackage.hm5.a(r12)
            r10.getClass()
            em5 r11 = new em5
            r11.<init>(r10)
            return r11
        Le6:
            long r2 = r13.a
            r7.R = r9
            r7.X = r9
            r7.Y = r9
            r7.Z = r12
            r7.d0 = r4
            r7.e0 = r6
            r7.h0 = r8
            java.lang.Object r13 = r1.g(r2, r4, r5, r6, r7)
            if (r13 != r0) goto Lfd
        Lfc:
            return r0
        Lfd:
            r11 = r4
        Lfe:
            boolean r10 = r13 instanceof defpackage.em5
            if (r10 == 0) goto L10f
            java.lang.Throwable r10 = defpackage.hm5.a(r13)
            r10.getClass()
            em5 r11 = new em5
            r11.<init>(r10)
            return r11
        L10f:
            defpackage.oi2.Y(r12)
            da5 r12 = (defpackage.da5) r12
            defpackage.oi2.Y(r13)
            java.util.List r13 = (java.util.List) r13
            kb5 r10 = r1.d(r12, r13, r11)
            return r10
    }

    public final java.io.Serializable r(long r5, long r7, boolean r9, defpackage.s41 r10) {
            r4 = this;
            boolean r0 = r10 instanceof defpackage.cl
            if (r0 == 0) goto L13
            r0 = r10
            cl r0 = (defpackage.cl) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            cl r0 = new cl
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            long r7 = r0.R
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L6f
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.oi2.Y(r10)
            qf4 r4 = r4.b     // Catch: java.lang.Throwable -> L6f
            r0.R = r7     // Catch: java.lang.Throwable -> L6f
            r0.Z = r3     // Catch: java.lang.Throwable -> L6f
            vm5 r4 = r4.a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = r4.r(r5, r9, r0)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r1) goto L42
            return r1
        L42:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r10 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            if (r4 == 0) goto L54
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L54
        L52:
            r3 = r5
            goto L6a
        L54:
            java.util.Iterator r4 = r10.iterator()     // Catch: java.lang.Throwable -> L6f
        L58:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L52
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L6f
            fb5 r6 = (defpackage.fb5) r6     // Catch: java.lang.Throwable -> L6f
            long r9 = r6.b     // Catch: java.lang.Throwable -> L6f
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L58
        L6a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r4 = move-exception
            em5 r5 = new em5
            r5.<init>(r4)
            r4 = r5
        L76:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r4 instanceof defpackage.em5
            if (r6 == 0) goto L7d
            r4 = r5
        L7d:
            return r4
    }

    public final java.lang.Object s(defpackage.s41 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dl
            if (r0 == 0) goto L13
            r0 = r5
            dl r0 = (defpackage.dl) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dl r0 = new dl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r5)
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r5)
            r0.Y = r3
            hk r4 = r4.c
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            boolean r4 = r5 instanceof defpackage.hb5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    public final void u(java.lang.String r5, defpackage.vr4... r6) {
            r4 = this;
            android.content.Context r4 = r4.f
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.flags
            r4 = r4 & 2
            if (r4 == 0) goto L48
            java.lang.String r4 = "event_type="
            java.lang.String r0 = " submit_path=kotlin_api"
            java.lang.StringBuilder r4 = defpackage.i61.t(r4, r5, r0)
            int r5 = r6.length
            r0 = 0
        L16:
            if (r0 >= r5) goto L3f
            r1 = r6[r0]
            java.lang.Object r2 = r1.A
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.B
            if (r1 == 0) goto L3c
            r3 = 32
            r4.append(r3)
            r4.append(r2)
            r2 = 61
            r4.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 95
            java.lang.String r1 = defpackage.xs6.d0(r1, r3, r2)
            r4.append(r1)
        L3c:
            int r0 = r0 + 1
            goto L16
        L3f:
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "RATrace"
            android.util.Log.i(r5, r4)
        L48:
            return
    }

    public final java.lang.Object v(java.lang.String r10, java.lang.String r11, defpackage.s41 r12) {
            r9 = this;
            java.lang.String r0 = "login failed: "
            boolean r1 = r12 instanceof defpackage.el
            if (r1 == 0) goto L15
            r1 = r12
            el r1 = (defpackage.el) r1
            int r2 = r1.d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d0 = r2
            goto L1a
        L15:
            el r1 = new el
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.Y
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.d0
            r4 = 3
            r5 = 2
            r6 = 1
            bk1 r7 = r9.h
            java.lang.String r8 = "RATrace"
            if (r3 == 0) goto L51
            if (r3 == r6) goto L49
            if (r3 == r5) goto L40
            if (r3 != r4) goto L39
            hm5 r9 = r1.R
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L36
            goto Lc7
        L36:
            r9 = move-exception
            goto Ld8
        L39:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L40:
            int r10 = r1.X
            hm5 r11 = r1.R
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L36
            goto Lb7
        L49:
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L36
            hm5 r12 = (defpackage.hm5) r12     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r12.A     // Catch: java.lang.Throwable -> L36
            goto L85
        L51:
            defpackage.oi2.Y(r12)
            boolean r12 = defpackage.qs6.v0(r10)
            if (r12 != 0) goto Ldc
            int r12 = r11.length()
            if (r12 != 0) goto L62
            goto Ldc
        L62:
            boolean r12 = r7.p()
            if (r12 != 0) goto L75
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "RetroAchievements authentication is locked by an active session"
            r9.<init>(r10)
            em5 r10 = new em5
            r10.<init>(r9)
            return r10
        L75:
            java.lang.String r12 = "login start"
            android.util.Log.i(r8, r12)     // Catch: java.lang.Throwable -> L36
            l85 r12 = r9.a     // Catch: java.lang.Throwable -> L36
            r1.d0 = r6     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r12.q(r10, r11, r1)     // Catch: java.lang.Throwable -> L36
            if (r10 != r2) goto L85
            goto Lc5
        L85:
            hm5 r11 = new hm5     // Catch: java.lang.Throwable -> L36
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L36
            boolean r12 = r10 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L36
            if (r12 == 0) goto Lc9
            java.lang.Throwable r10 = defpackage.hm5.a(r10)     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L9d
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L36
            goto L9f
        L9d:
            java.lang.String r10 = "unknown"
        L9f:
            java.lang.String r10 = r0.concat(r10)     // Catch: java.lang.Throwable -> L36
            android.util.Log.w(r8, r10)     // Catch: java.lang.Throwable -> L36
            hk r10 = r9.c     // Catch: java.lang.Throwable -> L36
            r1.R = r11     // Catch: java.lang.Throwable -> L36
            r12 = 0
            r1.X = r12     // Catch: java.lang.Throwable -> L36
            r1.d0 = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r10.a(r1)     // Catch: java.lang.Throwable -> L36
            if (r10 != r2) goto Lb6
            goto Lc5
        Lb6:
            r10 = r12
        Lb7:
            jk r9 = r9.d     // Catch: java.lang.Throwable -> L36
            r1.R = r11     // Catch: java.lang.Throwable -> L36
            r1.X = r10     // Catch: java.lang.Throwable -> L36
            r1.d0 = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r9 = r9.b(r1)     // Catch: java.lang.Throwable -> L36
            if (r9 != r2) goto Lc6
        Lc5:
            return r2
        Lc6:
            r9 = r11
        Lc7:
            r11 = r9
            goto Ld2
        Lc9:
            java.lang.String r9 = "login success"
            int r9 = android.util.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L36
            defpackage.vy7.P(r9)     // Catch: java.lang.Throwable -> L36
        Ld2:
            java.lang.Object r9 = r11.A     // Catch: java.lang.Throwable -> L36
            r7.h()
            return r9
        Ld8:
            r7.h()
            throw r9
        Ldc:
            java.lang.String r9 = "login skipped: blank username or password"
            android.util.Log.w(r8, r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Username and password cannot be blank"
            r9.<init>(r10)
            em5 r10 = new em5
            r10.<init>(r9)
            return r10
    }

    public final java.lang.Object w(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.fl
            if (r0 == 0) goto L13
            r0 = r8
            fl r0 = (defpackage.fl) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fl r0 = new fl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 1
            bk1 r6 = r7.h
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6d
        L2f:
            r7 = move-exception
            goto L73
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L38:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L3c:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L2f
            goto L57
        L40:
            defpackage.oi2.Y(r8)
            boolean r8 = r6.p()
            if (r8 != 0) goto L4c
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L4c:
            qf4 r8 = r7.b     // Catch: java.lang.Throwable -> L2f
            r0.Y = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L57
            goto L6c
        L57:
            hk r8 = r7.c     // Catch: java.lang.Throwable -> L2f
            r0.Y = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L62
            goto L6c
        L62:
            jk r7 = r7.d     // Catch: java.lang.Throwable -> L2f
            r0.Y = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6.h()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L73:
            r6.h()
            throw r7
    }

    public final java.lang.Object x(java.lang.String r5, boolean r6, defpackage.s41 r7) {
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hl
            if (r0 == 0) goto L13
            r0 = r7
            hl r0 = (defpackage.hl) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            hl r0 = new hl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.oi2.Y(r7)
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r4 = r7.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.oi2.Y(r7)
            r0.Y = r3
            java.lang.Object r4 = r4.q(r5, r6, r3, r0)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            return r4
    }

    public final java.lang.Object y(defpackage.s41 r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.il
            if (r0 == 0) goto L13
            r0 = r7
            il r0 = (defpackage.il) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            il r0 = new il
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            defpackage.oi2.Y(r7)
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r6 = r7.A
            goto L59
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L37:
            defpackage.oi2.Y(r7)
            goto L49
        L3b:
            defpackage.oi2.Y(r7)
            r0.Y = r5
            hk r7 = r6.c
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L49
            goto L58
        L49:
            boolean r7 = r7 instanceof defpackage.hb5
            if (r7 != 0) goto L4e
            goto L72
        L4e:
            r0.Y = r4
            l85 r6 = r6.a
            java.lang.Object r6 = r6.r(r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            java.lang.Throwable r6 = defpackage.hm5.a(r6)
            if (r6 == 0) goto L72
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = "profile refresh failed: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.String r7 = "RATrace"
            android.util.Log.w(r7, r6)
        L72:
            return r3
    }

    public final java.lang.Object z(java.lang.String r18, boolean r19, java.lang.String r20, defpackage.s41 r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            boolean r3 = r2 instanceof defpackage.jl
            if (r3 == 0) goto L1a
            r3 = r2
            jl r3 = (defpackage.jl) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.e0 = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            jl r3 = new jl
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.Z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r10.e0
            r5 = 0
            jg7 r11 = defpackage.jg7.a
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L56
            if (r4 == r8) goto L41
            if (r4 != r6) goto L3b
            defpackage.oi2.Y(r2)
            hm5 r2 = (defpackage.hm5) r2
            r2.getClass()
            return r11
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L41:
            boolean r1 = r10.Y
            java.lang.String r4 = r10.X
            java.lang.String r9 = r10.R
            defpackage.oi2.Y(r2)
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r2 = r2.A
            r16 = r8
            r8 = r1
            r1 = r9
            r9 = r4
        L53:
            r4 = r16
            goto L76
        L56:
            defpackage.oi2.Y(r2)
            r10.R = r1
            r2 = r20
            r10.X = r2
            r4 = r19
            r10.Y = r4
            r10.e0 = r8
            java.lang.Object r9 = r0.k(r1, r5, r10)
            if (r9 != r3) goto L6d
            goto Ld7
        L6d:
            r16 = r9
            r9 = r2
            r2 = r16
            r16 = r8
            r8 = r4
            goto L53
        L76:
            boolean r12 = r2 instanceof defpackage.em5
            if (r12 == 0) goto L7b
            r2 = r7
        L7b:
            ga5 r2 = (defpackage.ga5) r2
            if (r2 == 0) goto Ld8
            long r12 = r2.a
            vr4 r2 = new vr4
            java.lang.String r14 = "game_hash"
            r2.<init>(r14, r1)
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            vr4 r15 = new vr4
            r18 = r4
            java.lang.String r4 = "game_id"
            r15.<init>(r4, r14)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            vr4 r14 = new vr4
            java.lang.String r5 = "hardcore"
            r14.<init>(r5, r4)
            if (r9 == 0) goto Lac
            boolean r4 = defpackage.qs6.v0(r9)
            if (r4 == 0) goto Laa
            goto Lac
        Laa:
            r5 = 0
            goto Lae
        Lac:
            r5 = r18
        Lae:
            r4 = r5 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            vr4 r5 = new vr4
            java.lang.String r6 = "rich_presence"
            r5.<init>(r6, r4)
            vr4[] r2 = new defpackage.vr4[]{r2, r15, r14, r5}
            java.lang.String r4 = "session_ping"
            r0.u(r4, r2)
            r10.R = r7
            r10.X = r7
            r10.Y = r8
            r2 = 2
            r10.e0 = r2
            l85 r4 = r0.a
            r7 = r1
            r5 = r12
            java.lang.Object r0 = r4.s(r5, r7, r8, r9, r10)
            if (r0 != r3) goto Ld8
        Ld7:
            return r3
        Ld8:
            return r11
    }
}
