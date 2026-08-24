package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ro5 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ ro5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ro5(defpackage.ro5 r1, defpackage.xj5 r2) {
            r0 = this;
            r2 = 18
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r48) {
            r47 = this;
            r0 = r47
            r1 = r48
            int r2 = r0.A
            r3 = 0
            r4 = 14
            r5 = 6
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r2) {
                case 0: goto L54e;
                case 1: goto L536;
                case 2: goto L526;
                case 3: goto L500;
                case 4: goto L4d0;
                case 5: goto L4c2;
                case 6: goto L4af;
                case 7: goto L469;
                case 8: goto L453;
                case 9: goto L40e;
                case 10: goto L402;
                case 11: goto L3c2;
                case 12: goto L381;
                case 13: goto L370;
                case 14: goto L343;
                case 15: goto L327;
                case 16: goto L2ee;
                case 17: goto L2e2;
                case 18: goto L2c8;
                case 19: goto L28c;
                case 20: goto L253;
                case 21: goto L219;
                case 22: goto L20e;
                case 23: goto L200;
                case 24: goto L1d3;
                case 25: goto L191;
                case 26: goto L174;
                default: goto L11;
            }
        L11:
            java.lang.String r2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            java.lang.String r3 = "cheat_import_worker"
            java.lang.Object r0 = r0.B
            dx7 r0 = (defpackage.dx7) r0
            e36 r1 = (defpackage.e36) r1
            r1.getClass()
            j36 r2 = r1.i0(r2)
            r2.w(r7, r3)     // Catch: java.lang.Throwable -> L48
            wu r3 = new wu     // Catch: java.lang.Throwable -> L48
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L48
            wu r8 = new wu     // Catch: java.lang.Throwable -> L48
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L48
        L2f:
            boolean r10 = r2.f0()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L5e
            java.lang.String r10 = r2.R(r9)     // Catch: java.lang.Throwable -> L48
            boolean r11 = r3.containsKey(r10)     // Catch: java.lang.Throwable -> L48
            if (r11 != 0) goto L4b
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r11.<init>()     // Catch: java.lang.Throwable -> L48
            r3.put(r10, r11)     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r0 = move-exception
            goto L170
        L4b:
            java.lang.String r10 = r2.R(r9)     // Catch: java.lang.Throwable -> L48
            boolean r11 = r8.containsKey(r10)     // Catch: java.lang.Throwable -> L48
            if (r11 != 0) goto L2f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r11.<init>()     // Catch: java.lang.Throwable -> L48
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L48
            goto L2f
        L5e:
            r2.reset()     // Catch: java.lang.Throwable -> L48
            r0.b(r1, r3)     // Catch: java.lang.Throwable -> L48
            r0.a(r1, r8)     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
        L6c:
            boolean r1 = r2.f0()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L16c
            java.lang.String r11 = r2.R(r9)     // Catch: java.lang.Throwable -> L48
            long r12 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            int r1 = (int) r12     // Catch: java.lang.Throwable -> L48
            iw7 r12 = defpackage.ds7.f(r1)     // Catch: java.lang.Throwable -> L48
            r1 = 2
            byte[] r1 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> L48
            xb1 r10 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L48
            xb1 r13 = defpackage.u24.k(r1)     // Catch: java.lang.Throwable -> L48
            long r14 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L48
            int r1 = (int) r14     // Catch: java.lang.Throwable -> L48
            r10 = 4
            long r14 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L48
            int r10 = (int) r14     // Catch: java.lang.Throwable -> L48
            long r14 = r2.getLong(r4)     // Catch: java.lang.Throwable -> L48
            r7 = 15
            long r16 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            r7 = 16
            long r18 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            r7 = 17
            long r6 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L48
            w10 r22 = defpackage.ds7.c(r6)     // Catch: java.lang.Throwable -> L48
            r6 = 18
            long r23 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L48
            r6 = 19
            long r25 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L48
            r6 = 20
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L48
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L48
            r7 = 21
            long r29 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            r7 = 22
            r28 = r10
            long r9 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L48
            int r7 = (int) r9     // Catch: java.lang.Throwable -> L48
            r9 = 5
            long r9 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L48
            kf4 r37 = defpackage.ds7.d(r9)     // Catch: java.lang.Throwable -> L48
            byte[] r9 = r2.getBlob(r5)     // Catch: java.lang.Throwable -> L48
            af4 r36 = defpackage.ds7.h(r9)     // Catch: java.lang.Throwable -> L48
            r9 = 7
            long r9 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto Lef
            r38 = 1
            goto Lf1
        Lef:
            r38 = 0
        Lf1:
            r9 = 8
            long r9 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto Lfd
            r39 = 1
            goto Lff
        Lfd:
            r39 = 0
        Lff:
            r9 = 9
            long r9 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto L10b
            r40 = 1
            goto L10d
        L10b:
            r40 = 0
        L10d:
            r9 = 10
            long r9 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto L119
            r41 = 1
            goto L11b
        L119:
            r41 = 0
        L11b:
            r9 = 11
            long r42 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            r9 = 12
            long r44 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L48
            r9 = 13
            byte[] r9 = r2.getBlob(r9)     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashSet r46 = defpackage.ds7.a(r9)     // Catch: java.lang.Throwable -> L48
            p21 r20 = new p21     // Catch: java.lang.Throwable -> L48
            r35 = r20
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r44, r46)     // Catch: java.lang.Throwable -> L48
            r20 = r35
            r9 = 0
            java.lang.String r10 = r2.R(r9)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = defpackage.c14.j0(r3, r10)     // Catch: java.lang.Throwable -> L48
            r10.getClass()     // Catch: java.lang.Throwable -> L48
            r32 = r10
            java.util.List r32 = (java.util.List) r32     // Catch: java.lang.Throwable -> L48
            java.lang.String r10 = r2.R(r9)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r9 = defpackage.c14.j0(r8, r10)     // Catch: java.lang.Throwable -> L48
            r9.getClass()     // Catch: java.lang.Throwable -> L48
            r33 = r9
            java.util.List r33 = (java.util.List) r33     // Catch: java.lang.Throwable -> L48
            xw7 r10 = new xw7     // Catch: java.lang.Throwable -> L48
            r21 = r1
            r27 = r6
            r31 = r7
            r10.<init>(r11, r12, r13, r14, r16, r18, r20, r21, r22, r23, r25, r27, r28, r29, r31, r32, r33)     // Catch: java.lang.Throwable -> L48
            r0.add(r10)     // Catch: java.lang.Throwable -> L48
            r6 = 3
            r7 = 1
            r9 = 0
            goto L6c
        L16c:
            r2.close()
            return r0
        L170:
            r2.close()
            throw r0
        L174:
            java.lang.Object r0 = r0.B
            java.util.List r0 = (java.util.List) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.util.Iterator r0 = r0.iterator()
        L17e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18e
            java.lang.Object r1 = r0.next()
            ig1 r1 = (defpackage.ig1) r1
            r1.b()
            goto L17e
        L18e:
            jg7 r0 = defpackage.jg7.a
            return r0
        L191:
            java.lang.Object r0 = r0.B
            gj7 r0 = (defpackage.gj7) r0
            kf0 r1 = (defpackage.kf0) r1
            r1.getClass()
            tg0 r0 = r0.a
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            boolean r3 = r0.d     // Catch: java.lang.Throwable -> L1c7
            if (r3 != 0) goto L1c9
            qf0 r3 = new qf0     // Catch: java.lang.Throwable -> L1c7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r5 = "CameraGraph-"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1c7
            uw r5 = defpackage.qf0.b     // Catch: java.lang.Throwable -> L1c7
            r5.getClass()     // Catch: java.lang.Throwable -> L1c7
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.uw.b     // Catch: java.lang.Throwable -> L1c7
            int r5 = r6.incrementAndGet(r5)     // Catch: java.lang.Throwable -> L1c7
            r4.append(r5)     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1c7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1c7
            sf0 r0 = r0.c(r1, r3)     // Catch: java.lang.Throwable -> L1c7
            monitor-exit(r2)
            return r0
        L1c7:
            r0 = move-exception
            goto L1d1
        L1c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c7
            throw r0     // Catch: java.lang.Throwable -> L1c7
        L1d1:
            monitor-exit(r2)
            throw r0
        L1d3:
            java.lang.Object r0 = r0.B
            pc7 r0 = (defpackage.pc7) r0
            br0 r1 = (defpackage.br0) r1
            r1.getClass()
            java.lang.String r2 = "first"
            gg3 r3 = r0.a
            wb6 r3 = r3.e()
            defpackage.br0.a(r1, r2, r3)
            java.lang.String r2 = "second"
            gg3 r3 = r0.b
            wb6 r3 = r3.e()
            defpackage.br0.a(r1, r2, r3)
            java.lang.String r2 = "third"
            gg3 r0 = r0.c
            wb6 r0 = r0.e()
            defpackage.br0.a(r1, r2, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L200:
            java.lang.Object r0 = r0.B
            o97 r0 = (defpackage.o97) r0
            jk4 r1 = (defpackage.jk4) r1
            h37 r0 = r0.n0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L20e:
            java.lang.Object r0 = r0.B
            r87 r0 = (defpackage.r87) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.j = r8
            jg7 r0 = defpackage.jg7.a
            return r0
        L219:
            java.lang.Object r0 = r0.B
            gb6 r0 = (defpackage.gb6) r0
            oh r1 = (defpackage.oh) r1
            android.view.autofill.AutofillValue r2 = r1.a
            boolean r2 = defpackage.k2.z(r2)
            if (r2 == 0) goto L231
            android.view.autofill.AutofillValue r1 = r1.a
            boolean r1 = defpackage.k2.C(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
        L231:
            if (r8 == 0) goto L24d
            boolean r1 = r8.booleanValue()
            if (r1 == 0) goto L23c
            a87 r1 = defpackage.a87.On
            goto L23e
        L23c:
            a87 r1 = defpackage.a87.Off
        L23e:
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.bb6.K
            fg3[] r3 = defpackage.eb6.a
            r4 = 26
            r3 = r3[r4]
            r0.a(r2, r1)
            r7 = 1
            goto L24e
        L24d:
            r7 = 0
        L24e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L253:
            java.lang.Object r0 = r0.B
            g47 r0 = (defpackage.g47) r0
            ep r1 = (defpackage.ep) r1
            java.lang.Object r2 = r1.a
            bp r2 = (defpackage.bp) r2
            boolean r3 = r2 instanceof defpackage.ov3
            if (r3 == 0) goto L275
            r3 = r2
            ov3 r3 = (defpackage.ov3) r3
            g47 r5 = r3.b
            if (r5 != 0) goto L275
            java.lang.String r2 = r3.a
            ov3 r3 = new ov3
            r3.<init>(r2, r0)
            r9 = 0
            ep r1 = defpackage.ep.a(r1, r3, r9, r4)
            goto L28b
        L275:
            boolean r3 = r2 instanceof defpackage.nv3
            if (r3 == 0) goto L28b
            nv3 r2 = (defpackage.nv3) r2
            g47 r3 = r2.b
            if (r3 != 0) goto L28b
            java.lang.String r2 = r2.a
            nv3 r3 = new nv3
            r3.<init>(r2, r0)
            r9 = 0
            ep r1 = defpackage.ep.a(r1, r3, r9, r4)
        L28b:
            return r1
        L28c:
            java.lang.Object r0 = r0.B
            i27 r0 = (defpackage.i27) r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            rs4 r2 = r0.a
            float r4 = r2.h()
            float r4 = r4 + r1
            rs4 r0 = r0.b
            float r5 = r0.h()
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2b2
            float r0 = r0.h()
            float r1 = r2.h()
            float r1 = r0 - r1
            goto L2bb
        L2b2:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2bb
            float r0 = r2.h()
            float r1 = -r0
        L2bb:
            float r0 = r2.h()
            float r0 = r0 + r1
            r2.i(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            return r0
        L2c8:
            java.lang.Object r0 = r0.B
            ro5 r0 = (defpackage.ro5) r0
            ub7 r1 = (defpackage.ub7) r1
            boolean r2 = r1 instanceof defpackage.aa
            if (r2 == 0) goto L2dc
            aa r1 = (defpackage.aa) r1
            k0 r1 = r1.k0
            r0.g(r1)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L2e1
        L2dc:
            java.lang.String r0 = "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."
            defpackage.i.m(r0)
        L2e1:
            return r8
        L2e2:
            java.lang.Object r0 = r0.B
            j07 r0 = (defpackage.j07) r0
            qn2 r1 = (defpackage.qn2) r1
            r1.g(r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2ee:
            java.lang.Object r0 = r0.B
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            no1 r1 = (defpackage.no1) r1
            bt r2 = r1.i0()
            xj0 r2 = r2.G()
            long r3 = r1.e()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = (int) r3
            long r4 = r1.e()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (int) r1
            r9 = 0
            r0.setBounds(r9, r9, r3, r1)
            android.graphics.Canvas r1 = defpackage.xd.a(r2)
            r0.draw(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L327:
            java.lang.Object r0 = r0.B
            eo2 r0 = (defpackage.eo2) r0
            wc7 r2 = defpackage.nw7.e0
            so r1 = (defpackage.so) r1
            vs4 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            qn2 r2 = r2.b
            ap r1 = r1.f
            java.lang.Object r1 = r2.g(r1)
            r0.o(r3, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L343:
            java.lang.Object r0 = r0.B
            qm6 r0 = (defpackage.qm6) r0
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            pm6 r0 = r0.i     // Catch: java.lang.Throwable -> L36d
            r0.getClass()     // Catch: java.lang.Throwable -> L36d
            java.lang.Object r3 = r0.b     // Catch: java.lang.Throwable -> L36d
            r3.getClass()     // Catch: java.lang.Throwable -> L36d
            int r4 = r0.d     // Catch: java.lang.Throwable -> L36d
            y94 r5 = r0.c     // Catch: java.lang.Throwable -> L36d
            if (r5 != 0) goto L366
            y94 r5 = new y94     // Catch: java.lang.Throwable -> L36d
            r5.<init>()     // Catch: java.lang.Throwable -> L36d
            r0.c = r5     // Catch: java.lang.Throwable -> L36d
            ja4 r6 = r0.f     // Catch: java.lang.Throwable -> L36d
            r6.m(r3, r5)     // Catch: java.lang.Throwable -> L36d
        L366:
            r0.b(r1, r4, r3, r5)     // Catch: java.lang.Throwable -> L36d
            monitor-exit(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L36d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L370:
            java.lang.Object r0 = r0.B
            el6 r0 = (defpackage.el6) r0
            j92 r1 = (defpackage.j92) r1
            java.lang.Object r1 = r1.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L381:
            java.lang.Object r0 = r0.B
            si6 r0 = (defpackage.si6) r0
            ob6 r2 = r0.f
            r2.getClass()
            ob6 r3 = r0.f
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 != 0) goto L397
            java.lang.String r2 = "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"
            defpackage.r05.b(r2)
        L397:
            ka4 r2 = r0.e
            java.lang.Object r3 = r0.c
            if (r2 != 0) goto L3b4
            if (r3 != 0) goto L3a2
            r0.c = r1
            goto L3bf
        L3a2:
            ka4 r2 = defpackage.c66.a
            ka4 r2 = new ka4
            r2.<init>()
            r2.a(r3)
            r2.a(r1)
            r0.e = r2
            r0.c = r8
            goto L3bf
        L3b4:
            if (r3 != 0) goto L3b7
            goto L3bc
        L3b7:
            java.lang.String r0 = "workingSoleWatchedObject must be null when workingWatchSet is non-null"
            defpackage.r05.b(r0)
        L3bc:
            r2.a(r1)
        L3bf:
            jg7 r0 = defpackage.jg7.a
            return r0
        L3c2:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity r0 = (me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity) r0
            pq5 r1 = (defpackage.pq5) r1
            int r2 = me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity.C0
            r1.getClass()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = r0.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".LAUNCH_ROM"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            java.lang.String r3 = "uri"
            android.net.Uri r4 = r1.d
            java.lang.String r4 = r4.toString()
            r2.putExtra(r3, r4)
            au3 r3 = defpackage.bl2.C(r0)
            vy5 r4 = new vy5
            r4.<init>(r0, r1, r2, r8)
            r0 = 3
            defpackage.hv.L(r3, r8, r8, r4, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L402:
            java.lang.Object r0 = r0.B
            c5 r0 = (defpackage.c5) r0
            r1.getClass()
            java.lang.Object r0 = r0.c()
            return r0
        L40e:
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            r7 = r1
            vy4 r7 = (defpackage.vy4) r7
            long r3 = r7.c
            java.lang.Object r1 = r0.R
            p27 r1 = (defpackage.p27) r1
            boolean r2 = r1.k()
            if (r2 == 0) goto L449
            c37 r2 = r1.n()
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            if (r2 != 0) goto L430
            goto L449
        L430:
            jt3 r2 = r1.d
            if (r2 == 0) goto L449
            b47 r2 = r2.d()
            if (r2 != 0) goto L43b
            goto L449
        L43b:
            c37 r2 = r1.n()
            r5 = 0
            u34 r6 = defpackage.xd5.o0
            r1 = r0
            r1.q(r2, r3, r5, r6)
            r34 = 1
            goto L44b
        L449:
            r34 = 0
        L44b:
            if (r34 == 0) goto L450
            r7.a()
        L450:
            jg7 r0 = defpackage.jg7.a
            return r0
        L453:
            java.lang.Object r0 = r0.B
            m86 r0 = (defpackage.m86) r0
            jk4 r1 = (defpackage.jk4) r1
            p76 r2 = r0.k
            long r3 = r1.a
            int r1 = r0.j
            long r0 = r0.c(r2, r3, r1)
            jk4 r2 = new jk4
            r2.<init>(r0)
            return r2
        L469:
            java.lang.Object r0 = r0.B
            s76 r0 = (defpackage.s76) r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            ss4 r2 = r0.a
            int r4 = r2.h()
            float r4 = (float) r4
            float r4 = r4 + r1
            float r5 = r0.f
            float r4 = r4 + r5
            ss4 r5 = r0.e
            int r5 = r5.h()
            float r5 = (float) r5
            float r3 = defpackage.gi2.p(r4, r3, r5)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L48f
            r7 = 1
            goto L490
        L48f:
            r7 = 0
        L490:
            int r4 = r2.h()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = java.lang.Math.round(r3)
            int r5 = r2.h()
            int r5 = r5 + r4
            r2.i(r5)
            float r2 = (float) r4
            float r2 = r3 - r2
            r0.f = r2
            if (r7 != 0) goto L4aa
            r1 = r3
        L4aa:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            return r0
        L4af:
            java.lang.Object r0 = r0.B
            p46 r0 = (defpackage.p46) r0
            q46 r0 = r0.L
            if (r0 == 0) goto L4bc
            boolean r7 = r0.c(r1)
            goto L4bd
        L4bc:
            r7 = 1
        L4bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L4c2:
            java.lang.Object r0 = r0.B
            ai1 r0 = (defpackage.ai1) r0
            vm2 r1 = (defpackage.vm2) r1
            r1.getClass()
            r0.i = r1
            jg7 r0 = defpackage.jg7.a
            return r0
        L4d0:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.romlist.RomListActivity r0 = (me.magnum.melonds.ui.romlist.RomListActivity) r0
            pq5 r1 = (defpackage.pq5) r1
            int r2 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            r1.getClass()
            s9 r0 = r0.E0
            if (r0 == 0) goto L4fa
            vw1 r0 = r0.A()
            uw1 r2 = new uw1
            r2.<init>(r1)
            r0.f = r2
            as0 r2 = defpackage.to7.a(r0)
            xd1 r3 = new xd1
            r3.<init>(r0, r1, r8, r5)
            r0 = 3
            defpackage.hv.L(r2, r8, r8, r3, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L4fa:
            java.lang.String r0 = "emulatorLauncherValidatorDelegate"
            defpackage.nb3.a0(r0)
            throw r8
        L500:
            java.lang.Object r0 = r0.B
            s9 r0 = (defpackage.s9) r0
            pq5 r1 = (defpackage.pq5) r1
            int r2 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            r1.getClass()
            vw1 r0 = r0.A()
            uw1 r2 = new uw1
            r2.<init>(r1)
            r0.f = r2
            as0 r2 = defpackage.to7.a(r0)
            xd1 r3 = new xd1
            r3.<init>(r0, r1, r8, r5)
            r0 = 3
            defpackage.hv.L(r2, r8, r8, r3, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L526:
            java.lang.Object r0 = r0.B
            java.lang.String[] r0 = (java.lang.String[]) r0
            ax5 r1 = (defpackage.ax5) r1
            r1.getClass()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            return r0
        L536:
            java.lang.Object r0 = r0.B
            ss5 r0 = (defpackage.ss5) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.List r0 = r0.a
            java.lang.Object r0 = defpackage.gt0.K0(r1, r0)
            boolean r1 = r0 instanceof defpackage.mr5
            if (r1 == 0) goto L54d
            r8 = r0
            mr5 r8 = (defpackage.mr5) r8
        L54d:
            return r8
        L54e:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.common.workers.RetroArchShaderInstallWorker r0 = (me.magnum.melonds.common.workers.RetroArchShaderInstallWorker) r0
            vo5 r1 = (defpackage.vo5) r1
            android.content.Context r2 = r0.a
            java.lang.String r3 = "phase"
            long r4 = java.lang.System.currentTimeMillis()
            boolean r6 = r1 instanceof defpackage.uo5
            if (r6 != 0) goto L56c
            long r6 = r0.h
            long r6 = r4 - r6
            r9 = 250(0xfa, double:1.235E-321)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 >= 0) goto L56c
            goto L686
        L56c:
            r0.h = r4
            boolean r4 = r1 instanceof defpackage.so5
            if (r4 == 0) goto L5df
            so5 r1 = (defpackage.so5) r1
            lm1 r1 = r1.a
            long r4 = r1.a
            long r6 = r1.b
            java.lang.String r1 = "downloading"
            vr4 r8 = new vr4
            r8.<init>(r3, r1)
            java.lang.String r1 = "downloaded_bytes"
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            vr4 r9 = new vr4
            r9.<init>(r1, r3)
            java.lang.String r1 = "total_bytes"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            vr4 r10 = new vr4
            r10.<init>(r1, r3)
            vr4[] r1 = new defpackage.vr4[]{r8, r9, r10}
            wb1 r3 = new wb1
            r9 = 0
            r3.<init>(r9, r9)
            r8 = 0
        L5a2:
            r9 = 3
            if (r8 >= r9) goto L5b3
            r9 = r1[r8]
            java.lang.Object r10 = r9.A
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.B
            r3.h(r9, r10)
            int r8 = r8 + 1
            goto L5a2
        L5b3:
            xb1 r1 = r3.e()
            r0.c(r1)
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L5c6
            r8 = 100
            long r6 = r6 * r8
            long r6 = r6 / r4
            int r3 = (int) r6
            goto L5c7
        L5c6:
            r3 = 0
        L5c7:
            r4 = 2131952832(0x7f1304c0, float:1.9542118E38)
            java.lang.String r2 = r2.getString(r4)
            r2.getClass()
            if (r1 > 0) goto L5d5
            r7 = 1
            goto L5d6
        L5d5:
            r7 = 0
        L5d6:
            wj2 r1 = r0.g(r2, r3, r7)
            r0.b(r1)
            goto L686
        L5df:
            boolean r4 = r1 instanceof defpackage.to5
            r5 = 100
            if (r4 == 0) goto L649
            java.lang.String r4 = "extracting"
            vr4 r6 = new vr4
            r6.<init>(r3, r4)
            java.lang.String r3 = "entries_done"
            to5 r1 = (defpackage.to5) r1
            int r4 = r1.a
            int r1 = r1.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            vr4 r8 = new vr4
            r8.<init>(r3, r7)
            java.lang.String r3 = "entries_total"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            vr4 r9 = new vr4
            r9.<init>(r3, r7)
            vr4[] r3 = new defpackage.vr4[]{r6, r8, r9}
            wb1 r6 = new wb1
            r9 = 0
            r6.<init>(r9, r9)
            r7 = 3
            r9 = 0
        L614:
            if (r9 >= r7) goto L624
            r8 = r3[r9]
            java.lang.Object r10 = r8.A
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r8.B
            r6.h(r8, r10)
            int r9 = r9 + 1
            goto L614
        L624:
            xb1 r3 = r6.e()
            r0.c(r3)
            if (r1 <= 0) goto L631
            int r4 = r4 * r5
            int r9 = r4 / r1
            goto L632
        L631:
            r9 = 0
        L632:
            r3 = 2131952836(0x7f1304c4, float:1.9542126E38)
            java.lang.String r2 = r2.getString(r3)
            r2.getClass()
            if (r1 > 0) goto L640
            r7 = 1
            goto L641
        L640:
            r7 = 0
        L641:
            wj2 r1 = r0.g(r2, r9, r7)
            r0.b(r1)
            goto L686
        L649:
            uo5 r4 = defpackage.uo5.a
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L689
            java.lang.String r1 = "finalizing"
            vr4 r4 = new vr4
            r4.<init>(r3, r1)
            vr4[] r1 = new defpackage.vr4[]{r4}
            wb1 r3 = new wb1
            r9 = 0
            r3.<init>(r9, r9)
            r1 = r1[r9]
            java.lang.Object r4 = r1.A
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.B
            r3.h(r1, r4)
            xb1 r1 = r3.e()
            r0.c(r1)
            r1 = 2131952837(0x7f1304c5, float:1.9542128E38)
            java.lang.String r1 = r2.getString(r1)
            r1.getClass()
            r2 = 1
            wj2 r1 = r0.g(r1, r5, r2)
            r0.b(r1)
        L686:
            jg7 r8 = defpackage.jg7.a
            goto L68c
        L689:
            defpackage.i.d()
        L68c:
            return r8
    }
}
