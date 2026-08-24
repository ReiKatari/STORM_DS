package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk6  reason: default package */
/* loaded from: classes.dex */
public final class vk6 {
    public final defpackage.s35 a;
    public final defpackage.oj4 b;
    public final defpackage.ck4 c;
    public final defpackage.on2 d;
    public final defpackage.eo2 e;
    public final defpackage.on2 f;

    public vk6(defpackage.s35 r5, defpackage.oj4 r6, defpackage.ck4 r7, defpackage.v34 r8) {
            r4 = this;
            kt5 r0 = new kt5
            r1 = 9
            r0.<init>(r1)
            l56 r1 = new l56
            r2 = 25
            r3 = 0
            r1.<init>(r2, r3)
            r4.<init>()
            r4.a = r5
            r4.b = r6
            r4.c = r7
            r4.d = r0
            r4.e = r1
            r4.f = r8
            return
    }

    public static final java.lang.Object a(defpackage.vk6 r37, long r38, boolean r40, java.lang.String r41, java.lang.Long r42, defpackage.s41 r43) {
            r0 = r37
            r1 = r43
            boolean r2 = r1 instanceof defpackage.rk6
            if (r2 == 0) goto L17
            r2 = r1
            rk6 r2 = (defpackage.rk6) r2
            int r3 = r2.h0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.h0 = r3
            goto L1c
        L17:
            rk6 r2 = new rk6
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.h0
            r5 = 2
            java.lang.String r6 = "offset_seconds"
            java.lang.String r7 = "awardachievement"
            java.lang.String r8 = "expected_api"
            java.lang.String r9 = "smart_sync_kotlin_api"
            java.lang.String r10 = "submit_path"
            java.lang.String r11 = "attempt"
            r12 = 1
            java.lang.String r13 = "hardcore"
            java.lang.String r14 = "achievement_id"
            if (r4 == 0) goto La9
            if (r4 == r12) goto L72
            if (r4 != r5) goto L6b
            r4 = r6
            long r5 = r2.X
            boolean r15 = r2.Y
            r16 = r12
            r17 = r13
            long r12 = r2.R
            r18 = r1
            bh5 r1 = r2.e0
            r38 = r1
            java.lang.Long r1 = r2.d0
            r39 = r1
            java.lang.String r1 = r2.Z
            defpackage.oi2.Y(r18)
            r18 = r1
            r1 = r0
            r0 = r15
            r15 = r7
            r7 = r2
            r2 = r18
            r18 = r4
            r20 = r8
            r19 = r9
            r21 = r17
            r4 = r38
            r9 = r3
            r3 = r39
            goto L3af
        L6b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L72:
            r18 = r1
            r4 = r6
            r16 = r12
            r17 = r13
            long r5 = r2.X
            boolean r1 = r2.Y
            long r12 = r2.R
            bh5 r15 = r2.e0
            r38 = r1
            java.lang.Long r1 = r2.d0
            r39 = r1
            java.lang.String r1 = r2.Z
            defpackage.oi2.Y(r18)
            r40 = r1
            r1 = r18
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r25 = r3
            r18 = r5
            r26 = r7
            r7 = r17
            r3 = r39
            r6 = r2
            r17 = r4
            r4 = r12
            r13 = r15
            r2 = r38
            r12 = r40
            goto L155
        La9:
            r18 = r1
            r4 = r6
            r16 = r12
            r17 = r13
            defpackage.oi2.Y(r18)
            bh5 r1 = new bh5
            r1.<init>()
            r5 = 2000(0x7d0, double:9.88E-321)
            r12 = r42
            r13 = r1
            r15 = r2
            r25 = r3
            r18 = r4
            r1 = r38
            r38 = r5
            r5 = r40
            r6 = r41
        Lca:
            int r3 = r13.A
            int r3 = r3 + 1
            r13.A = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            vr4 r4 = new vr4
            r4.<init>(r14, r3)
            vr4 r3 = new vr4
            r3.<init>(r10, r9)
            r20 = r3
            vr4 r3 = new vr4
            r3.<init>(r8, r7)
            r21 = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r19 = r4
            vr4 r4 = new vr4
            r26 = r7
            r7 = r17
            r4.<init>(r7, r3)
            int r3 = r13.A
            r22 = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            vr4 r3 = new vr4
            r3.<init>(r11, r4)
            vr4 r4 = new vr4
            r23 = r3
            r3 = r18
            r4.<init>(r3, r12)
            r24 = r4
            vr4[] r4 = new defpackage.vr4[]{r19, r20, r21, r22, r23, r24}
            r17 = r3
            java.lang.String r3 = "smart_sync_award_submit_start"
            r0.b(r3, r4)
            s35 r3 = r0.a
            r15.Z = r6
            r15.d0 = r12
            r15.e0 = r13
            r15.R = r1
            r15.Y = r5
            r19 = r1
            r1 = r38
            r15.X = r1
            r4 = r16
            r15.h0 = r4
            r18 = r3
            r21 = r5
            r22 = r6
            r23 = r12
            r24 = r15
            java.lang.Object r3 = r18.p(r19, r21, r22, r23, r24)
            r4 = r25
            if (r3 != r4) goto L146
            r9 = r4
            goto L3a2
        L146:
            r25 = r4
            r4 = r19
            r12 = r22
            r6 = r24
            r18 = r1
            r1 = r3
            r2 = r21
            r3 = r23
        L155:
            boolean r15 = r1 instanceof defpackage.em5
            jg7 r20 = defpackage.jg7.a
            if (r15 != 0) goto L1c4
            o85 r1 = (defpackage.o85) r1
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            vr4 r4 = new vr4
            r4.<init>(r14, r6)
            vr4 r5 = new vr4
            r5.<init>(r10, r9)
            vr4 r6 = new vr4
            r15 = r26
            r6.<init>(r8, r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            vr4 r8 = new vr4
            r8.<init>(r7, r2)
            int r2 = r13.A
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            vr4 r2 = new vr4
            r2.<init>(r11, r7)
            vr4 r7 = new vr4
            r9 = r17
            r7.<init>(r9, r3)
            boolean r3 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vr4 r9 = new vr4
            java.lang.String r10 = "ra_awarded"
            r9.<init>(r10, r3)
            int r1 = r1.b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            vr4 r1 = new vr4
            java.lang.String r10 = "remaining"
            r1.<init>(r10, r3)
            r34 = r1
            r31 = r2
            r27 = r4
            r28 = r5
            r29 = r6
            r32 = r7
            r30 = r8
            r33 = r9
            vr4[] r1 = new defpackage.vr4[]{r27, r28, r29, r30, r31, r32, r33, r34}
            java.lang.String r2 = "smart_sync_award_submit_success"
            r0.b(r2, r1)
            return r20
        L1c4:
            r15 = r17
            r17 = r1
            r1 = r15
            r15 = r26
            java.lang.Throwable r17 = defpackage.hm5.a(r17)
            if (r17 != 0) goto L1dd
            r38 = r12
            java.lang.Exception r12 = new java.lang.Exception
            r39 = r2
            java.lang.String r2 = "Unknown error"
            r12.<init>(r2)
            goto L1e3
        L1dd:
            r39 = r2
            r38 = r12
            r12 = r17
        L1e3:
            boolean r2 = r12 instanceof defpackage.kh7
            if (r2 == 0) goto L1fb
            java.lang.String r2 = r12.getMessage()
            if (r2 == 0) goto L1fb
            r17 = r6
            java.lang.String r6 = "User already has"
            r21 = r1
            r1 = 1
            boolean r2 = defpackage.qs6.j0(r2, r6, r1)
            if (r2 != r1) goto L200
            return r20
        L1fb:
            r21 = r1
            r17 = r6
            r1 = 1
        L200:
            boolean r2 = r12 instanceof defpackage.rj7
            if (r2 == 0) goto L226
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            vr4 r2 = new vr4
            r2.<init>(r14, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r39)
            vr4 r3 = new vr4
            r3.<init>(r7, r1)
            vr4[] r1 = new defpackage.vr4[]{r2, r3}
            java.lang.String r2 = "smart_sync_award_unauthenticated"
            r0.c(r2, r1)
            em5 r0 = new em5
            r0.<init>(r12)
            return r0
        L226:
            boolean r2 = r12 instanceof java.io.IOException
            java.lang.String r6 = "smart_sync_award_submit_failed"
            java.lang.String r1 = "error"
            if (r2 != 0) goto L2c1
            java.lang.Throwable r2 = r12.getCause()
            boolean r2 = r2 instanceof java.io.IOException
            if (r2 == 0) goto L23c
            r20 = r12
            r2 = r21
            goto L2c5
        L23c:
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r20 = r12
            vr4 r12 = new vr4
            r12.<init>(r14, r2)
            vr4 r2 = new vr4
            r2.<init>(r10, r9)
            vr4 r9 = new vr4
            r9.<init>(r8, r15)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r39)
            vr4 r10 = new vr4
            r10.<init>(r7, r8)
            int r8 = r13.A
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r8)
            vr4 r8 = new vr4
            r8.<init>(r11, r13)
            vr4 r11 = new vr4
            r13 = r21
            r11.<init>(r13, r3)
            java.lang.Class r3 = r20.getClass()
            java.lang.String r3 = r3.getSimpleName()
            vr4 r13 = new vr4
            r13.<init>(r1, r3)
            r23 = r2
            r26 = r8
            r24 = r9
            r25 = r10
            r27 = r11
            r22 = r12
            r28 = r13
            vr4[] r2 = new defpackage.vr4[]{r22, r23, r24, r25, r26, r27, r28}
            r0.b(r6, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            vr4 r3 = new vr4
            r3.<init>(r14, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r39)
            vr4 r4 = new vr4
            r4.<init>(r7, r2)
            java.lang.Class r2 = r20.getClass()
            java.lang.String r2 = r2.getSimpleName()
            vr4 r5 = new vr4
            r5.<init>(r1, r2)
            vr4[] r1 = new defpackage.vr4[]{r3, r4, r5}
            java.lang.String r2 = "smart_sync_award_failed"
            r0.c(r2, r1)
            em5 r0 = new em5
            r12 = r20
            r0.<init>(r12)
            return r0
        L2c1:
            r2 = r21
            r20 = r12
        L2c5:
            int r12 = r13.A
            r0 = 5
            if (r12 < r0) goto L34e
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            vr4 r12 = new vr4
            r12.<init>(r14, r0)
            vr4 r0 = new vr4
            r0.<init>(r10, r9)
            vr4 r9 = new vr4
            r9.<init>(r8, r15)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r39)
            vr4 r10 = new vr4
            r10.<init>(r7, r8)
            int r8 = r13.A
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r8)
            vr4 r8 = new vr4
            r8.<init>(r11, r15)
            vr4 r11 = new vr4
            r11.<init>(r2, r3)
            java.lang.Class r2 = r20.getClass()
            java.lang.String r2 = r2.getSimpleName()
            vr4 r3 = new vr4
            r3.<init>(r1, r2)
            r22 = r0
            r27 = r3
            r25 = r8
            r23 = r9
            r24 = r10
            r26 = r11
            r21 = r12
            vr4[] r0 = new defpackage.vr4[]{r21, r22, r23, r24, r25, r26, r27}
            r1 = r37
            r1.b(r6, r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            vr4 r2 = new vr4
            r2.<init>(r14, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r39)
            vr4 r3 = new vr4
            r3.<init>(r7, r0)
            int r0 = r13.A
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            vr4 r0 = new vr4
            java.lang.String r5 = "attempts"
            r0.<init>(r5, r4)
            vr4[] r0 = new defpackage.vr4[]{r2, r3, r0}
            java.lang.String r2 = "smart_sync_award_io_exhausted"
            r1.c(r2, r0)
            em5 r0 = new em5
            r12 = r20
            r0.<init>(r12)
            return r0
        L34e:
            r1 = r37
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            vr4 r6 = new vr4
            r6.<init>(r14, r0)
            int r0 = r13.A
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r0)
            vr4 r0 = new vr4
            r0.<init>(r11, r12)
            java.lang.Long r12 = new java.lang.Long
            r21 = r7
            r20 = r8
            r7 = r18
            r12.<init>(r7)
            r18 = r2
            vr4 r2 = new vr4
            r19 = r9
            java.lang.String r9 = "backoff_ms"
            r2.<init>(r9, r12)
            vr4[] r0 = new defpackage.vr4[]{r6, r0, r2}
            java.lang.String r2 = "smart_sync_award_io_retry"
            r1.c(r2, r0)
            r0 = r38
            r2 = r17
            r2.Z = r0
            r2.d0 = r3
            r2.e0 = r13
            r2.R = r4
            r6 = r39
            r2.Y = r6
            r2.X = r7
            r9 = 2
            r2.h0 = r9
            java.lang.Object r12 = defpackage.q60.t(r7, r2)
            r9 = r25
            if (r12 != r9) goto L3a3
        L3a2:
            return r9
        L3a3:
            r35 = r4
            r4 = r13
            r12 = r35
            r35 = r2
            r2 = r0
            r0 = r6
            r5 = r7
            r7 = r35
        L3af:
            r22 = 2
            long r5 = r5 * r22
            jd1 r8 = defpackage.oq1.B
            r8 = 60
            r38 = r0
            uq1 r0 = defpackage.uq1.SECONDS
            long r22 = defpackage.n16.L(r8, r0)
            long r0 = defpackage.oq1.e(r22)
            long r0 = java.lang.Math.min(r5, r0)
            r39 = r15
            r15 = r7
            r7 = r39
            r5 = r38
            r38 = r0
            r6 = r2
            r25 = r9
            r1 = r12
            r9 = r19
            r8 = r20
            r17 = r21
            r16 = 1
            r0 = r37
            r12 = r3
            r13 = r4
            goto Lca
    }

    public final void b(java.lang.String r6, defpackage.vr4... r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "event_type="
            r0.<init>(r1)
            r0.append(r6)
            int r6 = r7.length
            r1 = 0
        Lc:
            if (r1 >= r6) goto L35
            r2 = r7[r1]
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
            java.lang.String r6 = r0.toString()
            eo2 r5 = r5.e
            java.lang.String r7 = "RASubmission"
            r5.o(r7, r6)
            return
    }

    public final void c(java.lang.String r6, defpackage.vr4... r7) {
            r5 = this;
            java.lang.String r0 = "event_type="
            java.lang.String r1 = " submit_path=smart_sync_engine"
            java.lang.StringBuilder r6 = defpackage.i61.t(r0, r6, r1)
            int r0 = r7.length
            r1 = 0
        La:
            if (r1 >= r0) goto L33
            r2 = r7[r1]
            java.lang.Object r3 = r2.A
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.B
            if (r2 == 0) goto L30
            r4 = 32
            r6.append(r4)
            r6.append(r3)
            r3 = 61
            r6.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 95
            java.lang.String r2 = defpackage.xs6.d0(r2, r4, r3)
            r6.append(r2)
        L30:
            int r1 = r1 + 1
            goto La
        L33:
            java.lang.String r6 = r6.toString()
            eo2 r5 = r5.e
            java.lang.String r7 = "RATrace"
            r5.o(r7, r6)
            return
    }

    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, java.util.Set r13, defpackage.s41 r14) {
            r10 = this;
            boolean r0 = r14 instanceof defpackage.sk6
            if (r0 == 0) goto L13
            r0 = r14
            sk6 r0 = (defpackage.sk6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sk6 r0 = new sk6
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r14)
            goto L48
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L2e:
            defpackage.oi2.Y(r14)
            xe1 r14 = defpackage.xk1.a
            de1 r14 = defpackage.de1.L
            tk6 r4 = new tk6
            r9 = 0
            r5 = r10
            r8 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Y = r3
            java.lang.Object r14 = defpackage.hv.d0(r14, r4, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r10 = r14.A
            return r10
    }

    public final java.lang.Object e(java.lang.String r5, java.lang.String r6, defpackage.s41 r7) {
            r4 = this;
            boolean r0 = r7 instanceof defpackage.uk6
            if (r0 == 0) goto L13
            r0 = r7
            uk6 r0 = (defpackage.uk6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            uk6 r0 = new uk6
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
            gk4 r7 = defpackage.gk4.SOFTCORE
            java.util.Set r7 = defpackage.ii2.R(r7)
            r0.Y = r3
            java.lang.Object r4 = r4.d(r5, r6, r7, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
    }
}
