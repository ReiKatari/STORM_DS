package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz1  reason: default package */
/* loaded from: classes.dex */
public final class fz1 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.sz1 B;

    public /* synthetic */ fz1(defpackage.sz1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r11, defpackage.r41 r12) {
            r10 = this;
            int r0 = r10.A
            r1 = 0
            switch(r0) {
                case 0: goto L125;
                case 1: goto L10c;
                case 2: goto Ldd;
                default: goto L6;
            }
        L6:
            ca5 r11 = (defpackage.ca5) r11
            java.lang.String r0 = "RetryQueued"
            java.lang.String r1 = "error"
            java.lang.String r2 = "leaderboard_id"
            java.lang.String r3 = "submit_success"
            java.lang.String r4 = "hardcore"
            java.lang.String r5 = "achievement_id"
            sz1 r10 = r10.B
            sx1 r6 = r10.w
            boolean r7 = r11 instanceof defpackage.q95
            if (r7 == 0) goto L51
            java.lang.String r0 = "achievement_submit_success"
            r1 = r11
            q95 r1 = (defpackage.q95) r1
            o75 r1 = r1.a
            long r7 = r1.a
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r7)
            vr4 r7 = new vr4
            r7.<init>(r5, r2)
            boolean r2 = r6.a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            vr4 r5 = new vr4
            r5.<init>(r4, r2)
            java.lang.String r2 = "awarded"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            vr4 r6 = new vr4
            r6.<init>(r2, r4)
            vr4[] r2 = new defpackage.vr4[]{r7, r5, r6}
            r10.H0(r0, r2)
            long r0 = r1.a
            r10.h0(r0, r3)
            goto Lcf
        L51:
            boolean r7 = r11 instanceof defpackage.x95
            if (r7 == 0) goto L7f
            java.lang.String r0 = "leaderboard_submit_success"
            r1 = r11
            x95 r1 = (defpackage.x95) r1
            long r4 = r1.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            vr4 r7 = new vr4
            r7.<init>(r2, r6)
            java.lang.String r2 = "rank"
            long r8 = r1.g
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r8)
            vr4 r6 = new vr4
            r6.<init>(r2, r1)
            vr4[] r1 = new defpackage.vr4[]{r7, r6}
            r10.H0(r0, r1)
            r10.i0(r4, r3)
            goto Lcf
        L7f:
            boolean r3 = r11 instanceof defpackage.w95
            if (r3 == 0) goto La1
            java.lang.String r3 = "leaderboard_submit_failed"
            r4 = r11
            w95 r4 = (defpackage.w95) r4
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            vr4 r4 = new vr4
            r4.<init>(r2, r6)
            vr4 r2 = new vr4
            r2.<init>(r1, r0)
            vr4[] r0 = new defpackage.vr4[]{r4, r2}
            r10.H0(r3, r0)
            goto Lcf
        La1:
            boolean r2 = r11 instanceof defpackage.p95
            if (r2 == 0) goto Lcf
            java.lang.String r2 = "achievement_submit_failed"
            r3 = r11
            p95 r3 = (defpackage.p95) r3
            o75 r3 = r3.a
            long r7 = r3.a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r7)
            vr4 r7 = new vr4
            r7.<init>(r5, r3)
            boolean r3 = r6.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vr4 r5 = new vr4
            r5.<init>(r4, r3)
            vr4 r3 = new vr4
            r3.<init>(r1, r0)
            vr4[] r0 = new defpackage.vr4[]{r7, r5, r3}
            r10.H0(r2, r0)
        Lcf:
            of6 r10 = r10.F0
            java.lang.Object r10 = r10.a(r11, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lda
            goto Ldc
        Lda:
            jg7 r10 = defpackage.jg7.a
        Ldc:
            return r10
        Ldd:
            ue4 r11 = (defpackage.ue4) r11
            jg7 r0 = defpackage.jg7.a
            sz1 r10 = r10.B
            int[] r2 = defpackage.t12.a
            int r11 = r11.ordinal()
            r11 = r2[r11]
            r2 = 1
            if (r11 == r2) goto Lfa
            r12 = 2
            if (r11 != r12) goto Lf6
            r10.R0()
        Lf4:
            r1 = r0
            goto L108
        Lf6:
            defpackage.i.d()
            goto L108
        Lfa:
            q33 r3 = r10.f0
            monitor-enter(r3)
            r3.A = r2     // Catch: java.lang.Throwable -> L109
            monitor-exit(r3)
            java.lang.Object r1 = r10.f1(r12)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r10) goto Lf4
        L108:
            return r1
        L109:
            r10 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L109
            throw r10
        L10c:
            fk3 r11 = (defpackage.fk3) r11
            sz1 r10 = r10.B
            ci0 r10 = r10.u
            r10.getClass()
            r11.getClass()
            java.lang.Object r10 = r10.g
            tp6 r10 = (defpackage.tp6) r10
            r10.getClass()
            r10.m(r1, r11)
            jg7 r10 = defpackage.jg7.a
            return r10
        L125:
            en5 r11 = (defpackage.en5) r11
            sz1 r10 = r10.B
            cn5 r12 = r10.d
            en5 r0 = r12.c
            if (r0 != 0) goto L133
            en5 r0 = r12.a()
        L133:
            pq5 r12 = r10.n1
            if (r12 == 0) goto L161
            long r0 = r0.f
            long r2 = r11.f
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L161
            java.lang.Long r12 = r10.o1
            if (r12 != 0) goto L144
            goto L14c
        L144:
            long r0 = r12.longValue()
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L161
        L14c:
            long r0 = r11.f
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r0)
            r10.o1 = r12
            of6 r10 = r10.J0
            r77 r12 = defpackage.r77.a
            r10.k(r12)
            java.lang.String r10 = "restart_required"
            defpackage.fn5.a(r11, r10)
        L161:
            jg7 r10 = defpackage.jg7.a
            return r10
    }
}
