package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h22  reason: default package */
/* loaded from: classes.dex */
public final class h22 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public long d0;

    public /* synthetic */ h22(defpackage.sz1 r1, long r2, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public h22(defpackage.sz1 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 3
            r1.X = r0
            r1.Z = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            h22 r2 = (defpackage.h22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            h22 r2 = (defpackage.h22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            h22 r2 = (defpackage.h22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            h22 r2 = (defpackage.h22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L25;
                case 1: goto L19;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            h22 r9 = new h22
            sz1 r7 = r7.Z
            r9.<init>(r7, r8)
            return r9
        Ld:
            h22 r0 = new h22
            long r2 = r7.d0
            r5 = 2
            sz1 r1 = r7.Z
            r4 = r8
            r0.<init>(r1, r2, r4, r5)
            return r0
        L19:
            r5 = r8
            h22 r1 = new h22
            long r3 = r7.d0
            r6 = 1
            sz1 r2 = r7.Z
            r1.<init>(r2, r3, r5, r6)
            return r1
        L25:
            r5 = r8
            h22 r1 = new h22
            long r3 = r7.d0
            r6 = 0
            sz1 r2 = r7.Z
            r1.<init>(r2, r3, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L19d;
                case 1: goto Le4;
                case 2: goto Lba;
                default: goto L7;
            }
        L7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r11.Y
            if (r3 == 0) goto L20
            if (r3 != r1) goto L19
            long r0 = r11.d0
            defpackage.oi2.Y(r12)     // Catch: java.util.concurrent.CancellationException -> L16
            goto L9c
        L16:
            r12 = move-exception
            goto Lac
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto Lb6
        L20:
            defpackage.oi2.Y(r12)
            sz1 r12 = r11.Z
            nv4 r12 = r12.b0
            if (r12 == 0) goto L3a
            de5 r12 = r12.i
            if (r12 == 0) goto L3a
            rp6 r12 = r12.A
            java.lang.Object r12 = r12.getValue()
            bv4 r12 = (defpackage.bv4) r12
            if (r12 == 0) goto L3a
            lc5 r12 = r12.c
            goto L3c
        L3a:
            lc5 r12 = defpackage.lc5.f
        L3c:
            int r3 = r12.a
            if (r3 <= 0) goto L43
            qc5 r3 = defpackage.qc5.START_SYNC
            goto L45
        L43:
            qc5 r3 = defpackage.qc5.REOPEN_PAUSE_MENU
        L45:
            qc5 r4 = defpackage.qc5.REOPEN_PAUSE_MENU
            sz1 r5 = r11.Z
            if (r3 != r4) goto L51
            r5.M0(r1)
            jg7 r2 = defpackage.jg7.a
            goto Lb6
        L51:
            eb r3 = r5.h0
            r3.getClass()
            java.lang.Object r4 = r3.B
            monitor-enter(r4)
            java.lang.Object r5 = r3.R     // Catch: java.lang.Throwable -> Lb7
            tp6 r5 = (defpackage.tp6) r5     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> Lb7
            uc5 r6 = defpackage.uc5.a     // Catch: java.lang.Throwable -> Lb7
            boolean r5 = defpackage.nb3.k(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            if (r5 != 0) goto L6a
            goto L84
        L6a:
            long r5 = r3.I()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r3 = r3.R     // Catch: java.lang.Throwable -> Lb7
            tp6 r3 = (defpackage.tp6) r3     // Catch: java.lang.Throwable -> Lb7
            wc5 r8 = new wc5     // Catch: java.lang.Throwable -> Lb7
            sc5 r9 = defpackage.sc5.MANUAL_SYNC     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r5, r12, r9)     // Catch: java.lang.Throwable -> Lb7
            r3.getClass()     // Catch: java.lang.Throwable -> Lb7
            r3.m(r2, r8)     // Catch: java.lang.Throwable -> Lb7
            r2 = r7
        L84:
            monitor-exit(r4)
            if (r2 == 0) goto Lb4
            long r2 = r2.longValue()
            sz1 r12 = r11.Z     // Catch: java.util.concurrent.CancellationException -> Laa
            fd5 r4 = defpackage.fd5.PAUSE_MENU     // Catch: java.util.concurrent.CancellationException -> Laa
            r11.d0 = r2     // Catch: java.util.concurrent.CancellationException -> Laa
            r11.Y = r1     // Catch: java.util.concurrent.CancellationException -> Laa
            java.lang.Object r12 = r12.d1(r4, r11)     // Catch: java.util.concurrent.CancellationException -> Laa
            if (r12 != r0) goto L9b
            r2 = r0
            goto Lb6
        L9b:
            r0 = r2
        L9c:
            dd5 r12 = (defpackage.dd5) r12     // Catch: java.util.concurrent.CancellationException -> L16
            sz1 r11 = r11.Z
            eb r11 = r11.h0
            ed5 r2 = defpackage.ed5.REOPEN_PAUSE_MENU
            r11.N(r0, r12, r2)
            jg7 r2 = defpackage.jg7.a
            goto Lb6
        Laa:
            r12 = move-exception
            r0 = r2
        Lac:
            sz1 r11 = r11.Z
            eb r11 = r11.h0
            r11.n(r0)
            throw r12
        Lb4:
            jg7 r2 = defpackage.jg7.a
        Lb6:
            return r2
        Lb7:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
        Lba:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r11.Y
            if (r3 == 0) goto Lcc
            if (r3 != r1) goto Lc6
            defpackage.oi2.Y(r12)
            goto Le1
        Lc6:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto Le3
        Lcc:
            defpackage.oi2.Y(r12)
            sz1 r12 = r11.Z
            long r2 = r11.d0
            sx1 r4 = r12.w
            boolean r4 = r4.a
            r11.Y = r1
            java.lang.Object r11 = defpackage.sz1.U(r12, r2, r4, r11)
            if (r11 != r0) goto Le1
            r2 = r0
            goto Le3
        Le1:
            jg7 r2 = defpackage.jg7.a
        Le3:
            return r2
        Le4:
            java.lang.String r0 = "achievement_id"
            jg7 r3 = defpackage.jg7.a
            long r4 = r11.d0
            sz1 r6 = r11.Z
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r11.Y
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L113
            if (r8 == r1) goto L10b
            if (r8 == r10) goto L107
            if (r8 != r9) goto L100
            defpackage.oi2.Y(r12)
        Lfd:
            r2 = r3
            goto L19c
        L100:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto L19c
        L107:
            defpackage.oi2.Y(r12)
            goto L155
        L10b:
            defpackage.oi2.Y(r12)
            hm5 r12 = (defpackage.hm5) r12
            java.lang.Object r12 = r12.A
            goto L124
        L113:
            defpackage.oi2.Y(r12)
            pn5 r12 = r6.g
            r11.Y = r1
            pl r12 = (defpackage.pl) r12
            java.lang.Object r12 = r12.h(r4, r11)
            if (r12 != r7) goto L124
            goto L19b
        L124:
            boolean r1 = r12 instanceof defpackage.em5
            if (r1 == 0) goto L129
            goto L12a
        L129:
            r2 = r12
        L12a:
            o75 r2 = (defpackage.o75) r2
            if (r2 != 0) goto L12f
            goto Lfd
        L12f:
            sx1 r12 = r6.w
            boolean r12 = r12.a
            if (r12 == 0) goto L193
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r12 = r6.N
            hb5 r12 = defpackage.sz1.W0(r12)
            if (r12 == 0) goto L175
            r11.Y = r10
            java.lang.Object r1 = r6.P
            monitor-enter(r1)
            java.lang.String r8 = r6.R     // Catch: java.lang.Throwable -> L172
            monitor-exit(r1)
            if (r8 != 0) goto L14b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L149:
            r12 = r11
            goto L152
        L14b:
            iw2 r1 = r6.o0
            java.lang.Object r11 = r1.a(r8, r2, r12, r11)
            goto L149
        L152:
            if (r12 != r7) goto L155
            goto L19b
        L155:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto L15e
            goto L175
        L15e:
            java.lang.String r11 = "rc_client_submit_failed_queued_hardcore"
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r4)
            vr4 r1 = new vr4
            r1.<init>(r0, r12)
            vr4[] r12 = new defpackage.vr4[]{r1}
            r6.H0(r11, r12)
            goto Lfd
        L172:
            r11 = move-exception
            monitor-exit(r1)
            throw r11
        L175:
            java.lang.String r11 = "rc_client_submit_failed_queue_rejected"
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r4)
            vr4 r1 = new vr4
            r1.<init>(r0, r12)
            java.lang.String r12 = "reason"
            java.lang.String r0 = "runtime_authentication_mismatch"
            vr4 r2 = new vr4
            r2.<init>(r12, r0)
            vr4[] r12 = new defpackage.vr4[]{r1, r2}
            r6.H0(r11, r12)
            goto Lfd
        L193:
            r11.Y = r9
            java.lang.Object r11 = defpackage.sz1.N(r6, r2, r11)
            if (r11 != r7) goto Lfd
        L19b:
            r2 = r7
        L19c:
            return r2
        L19d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r11.Y
            if (r3 == 0) goto L1af
            if (r3 != r1) goto L1a9
            defpackage.oi2.Y(r12)
            goto L1c7
        L1a9:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto L1c9
        L1af:
            defpackage.oi2.Y(r12)
            sz1 r12 = r11.Z
            of6 r12 = r12.F0
            n95 r2 = new n95
            long r3 = r11.d0
            r2.<init>(r3)
            r11.Y = r1
            java.lang.Object r11 = r12.a(r2, r11)
            if (r11 != r0) goto L1c7
            r2 = r0
            goto L1c9
        L1c7:
            jg7 r2 = defpackage.jg7.a
        L1c9:
            return r2
    }
}
