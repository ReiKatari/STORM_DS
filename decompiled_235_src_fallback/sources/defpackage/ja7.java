package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ja7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ ja7(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r51) {
            r50 = this;
            r0 = r50
            int r1 = r0.A
            r2 = 17
            r3 = 11
            r4 = 10
            r5 = 9
            r6 = 8
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r1) {
                case 0: goto L340;
                case 1: goto L32e;
                case 2: goto L30d;
                case 3: goto L2f6;
                case 4: goto L2c6;
                case 5: goto L2a8;
                case 6: goto L28d;
                case 7: goto L24e;
                case 8: goto L239;
                case 9: goto L222;
                case 10: goto L20b;
                case 11: goto La5;
                case 12: goto L71;
                case 13: goto L5a;
                case 14: goto L2b;
                default: goto L14;
            }
        L14:
            java.lang.Object r1 = r0.B
            fx7 r1 = (defpackage.fx7) r1
            java.lang.Object r0 = r0.L
            ex7 r0 = (defpackage.ex7) r0
            r2 = r51
            e36 r2 = (defpackage.e36) r2
            r2.getClass()
            tm0 r1 = r1.b
            r1.Y(r2, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2b:
            java.lang.String r1 = "UPDATE workspec SET output=? WHERE id=?"
            java.lang.Object r2 = r0.B
            xb1 r2 = (defpackage.xb1) r2
            java.lang.Object r0 = r0.L
            java.lang.String r0 = (java.lang.String) r0
            r3 = r51
            e36 r3 = (defpackage.e36) r3
            r3.getClass()
            j36 r1 = r3.i0(r1)
            xb1 r3 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L55
            byte[] r2 = defpackage.u24.H(r2)     // Catch: java.lang.Throwable -> L55
            r1.d(r2, r9)     // Catch: java.lang.Throwable -> L55
            r1.w(r8, r0)     // Catch: java.lang.Throwable -> L55
            r1.f0()     // Catch: java.lang.Throwable -> L55
            r1.close()
            jg7 r0 = defpackage.jg7.a
            return r0
        L55:
            r0 = move-exception
            r1.close()
            throw r0
        L5a:
            java.lang.Object r1 = r0.B
            dx7 r1 = (defpackage.dx7) r1
            java.lang.Object r0 = r0.L
            yw7 r0 = (defpackage.yw7) r0
            r2 = r51
            e36 r2 = (defpackage.e36) r2
            r2.getClass()
            tm0 r1 = r1.b
            r1.Y(r2, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L71:
            java.lang.String r1 = "UPDATE workspec SET state=? WHERE id=?"
            java.lang.Object r2 = r0.B
            iw7 r2 = (defpackage.iw7) r2
            java.lang.Object r0 = r0.L
            java.lang.String r0 = (java.lang.String) r0
            r3 = r51
            e36 r3 = (defpackage.e36) r3
            r3.getClass()
            j36 r1 = r3.i0(r1)
            int r2 = defpackage.ds7.g(r2)     // Catch: java.lang.Throwable -> La0
            long r4 = (long) r2     // Catch: java.lang.Throwable -> La0
            r1.c(r9, r4)     // Catch: java.lang.Throwable -> La0
            r1.w(r8, r0)     // Catch: java.lang.Throwable -> La0
            r1.f0()     // Catch: java.lang.Throwable -> La0
            int r0 = defpackage.oi2.D(r3)     // Catch: java.lang.Throwable -> La0
            r1.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        La0:
            r0 = move-exception
            r1.close()
            throw r0
        La5:
            java.lang.String r1 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            java.lang.Object r10 = r0.B
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r0.L
            dx7 r0 = (defpackage.dx7) r0
            r11 = r51
            e36 r11 = (defpackage.e36) r11
            r11.getClass()
            j36 r1 = r11.i0(r1)
            r1.w(r9, r10)     // Catch: java.lang.Throwable -> Le1
            wu r10 = new wu     // Catch: java.lang.Throwable -> Le1
            r12 = 0
            r10.<init>(r12)     // Catch: java.lang.Throwable -> Le1
            wu r13 = new wu     // Catch: java.lang.Throwable -> Le1
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Le1
        Lc8:
            boolean r14 = r1.f0()     // Catch: java.lang.Throwable -> Le1
            if (r14 == 0) goto Lf7
            java.lang.String r14 = r1.R(r12)     // Catch: java.lang.Throwable -> Le1
            boolean r15 = r10.containsKey(r14)     // Catch: java.lang.Throwable -> Le1
            if (r15 != 0) goto Le4
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r15.<init>()     // Catch: java.lang.Throwable -> Le1
            r10.put(r14, r15)     // Catch: java.lang.Throwable -> Le1
            goto Le4
        Le1:
            r0 = move-exception
            goto L207
        Le4:
            java.lang.String r14 = r1.R(r12)     // Catch: java.lang.Throwable -> Le1
            boolean r15 = r13.containsKey(r14)     // Catch: java.lang.Throwable -> Le1
            if (r15 != 0) goto Lc8
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r15.<init>()     // Catch: java.lang.Throwable -> Le1
            r13.put(r14, r15)     // Catch: java.lang.Throwable -> Le1
            goto Lc8
        Lf7:
            r1.reset()     // Catch: java.lang.Throwable -> Le1
            r0.b(r11, r10)     // Catch: java.lang.Throwable -> Le1
            r0.a(r11, r13)     // Catch: java.lang.Throwable -> Le1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r0.<init>()     // Catch: java.lang.Throwable -> Le1
        L105:
            boolean r11 = r1.f0()     // Catch: java.lang.Throwable -> Le1
            if (r11 == 0) goto L203
            java.lang.String r15 = r1.R(r12)     // Catch: java.lang.Throwable -> Le1
            r51 = r13
            long r12 = r1.getLong(r9)     // Catch: java.lang.Throwable -> Le1
            int r11 = (int) r12     // Catch: java.lang.Throwable -> Le1
            iw7 r16 = defpackage.ds7.f(r11)     // Catch: java.lang.Throwable -> Le1
            byte[] r11 = r1.getBlob(r8)     // Catch: java.lang.Throwable -> Le1
            xb1 r12 = defpackage.xb1.b     // Catch: java.lang.Throwable -> Le1
            xb1 r17 = defpackage.u24.k(r11)     // Catch: java.lang.Throwable -> Le1
            long r11 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Le1
            int r11 = (int) r11     // Catch: java.lang.Throwable -> Le1
            r12 = 4
            long r12 = r1.getLong(r12)     // Catch: java.lang.Throwable -> Le1
            int r12 = (int) r12     // Catch: java.lang.Throwable -> Le1
            r13 = 14
            long r18 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            r13 = 15
            long r20 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            r13 = 16
            long r22 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            long r13 = r1.getLong(r2)     // Catch: java.lang.Throwable -> Le1
            int r13 = (int) r13     // Catch: java.lang.Throwable -> Le1
            w10 r26 = defpackage.ds7.c(r13)     // Catch: java.lang.Throwable -> Le1
            r13 = 18
            long r27 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            r13 = 19
            long r29 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            r13 = 20
            long r13 = r1.getLong(r13)     // Catch: java.lang.Throwable -> Le1
            int r13 = (int) r13     // Catch: java.lang.Throwable -> Le1
            r14 = 21
            long r33 = r1.getLong(r14)     // Catch: java.lang.Throwable -> Le1
            r14 = 22
            long r8 = r1.getLong(r14)     // Catch: java.lang.Throwable -> Le1
            int r8 = (int) r8     // Catch: java.lang.Throwable -> Le1
            r9 = 5
            r35 = r8
            long r7 = r1.getLong(r9)     // Catch: java.lang.Throwable -> Le1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Le1
            kf4 r40 = defpackage.ds7.d(r7)     // Catch: java.lang.Throwable -> Le1
            r7 = 6
            byte[] r7 = r1.getBlob(r7)     // Catch: java.lang.Throwable -> Le1
            af4 r39 = defpackage.ds7.h(r7)     // Catch: java.lang.Throwable -> Le1
            r7 = 7
            long r7 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Le1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L18a
            r41 = 1
            goto L18c
        L18a:
            r41 = 0
        L18c:
            long r7 = r1.getLong(r6)     // Catch: java.lang.Throwable -> Le1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L196
            r42 = 1
            goto L198
        L196:
            r42 = 0
        L198:
            long r7 = r1.getLong(r5)     // Catch: java.lang.Throwable -> Le1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L1a2
            r43 = 1
            goto L1a4
        L1a2:
            r43 = 0
        L1a4:
            long r7 = r1.getLong(r4)     // Catch: java.lang.Throwable -> Le1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L1ae
            r44 = 1
            goto L1b0
        L1ae:
            r44 = 0
        L1b0:
            long r45 = r1.getLong(r3)     // Catch: java.lang.Throwable -> Le1
            r7 = 12
            long r47 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Le1
            r7 = 13
            byte[] r7 = r1.getBlob(r7)     // Catch: java.lang.Throwable -> Le1
            java.util.LinkedHashSet r49 = defpackage.ds7.a(r7)     // Catch: java.lang.Throwable -> Le1
            p21 r24 = new p21     // Catch: java.lang.Throwable -> Le1
            r38 = r24
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r47, r49)     // Catch: java.lang.Throwable -> Le1
            r24 = r38
            r7 = 0
            java.lang.String r8 = r1.R(r7)     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r8 = defpackage.c14.j0(r10, r8)     // Catch: java.lang.Throwable -> Le1
            r8.getClass()     // Catch: java.lang.Throwable -> Le1
            r36 = r8
            java.util.List r36 = (java.util.List) r36     // Catch: java.lang.Throwable -> Le1
            java.lang.String r8 = r1.R(r7)     // Catch: java.lang.Throwable -> Le1
            r9 = r51
            java.lang.Object r8 = defpackage.c14.j0(r9, r8)     // Catch: java.lang.Throwable -> Le1
            r8.getClass()     // Catch: java.lang.Throwable -> Le1
            r37 = r8
            java.util.List r37 = (java.util.List) r37     // Catch: java.lang.Throwable -> Le1
            xw7 r14 = new xw7     // Catch: java.lang.Throwable -> Le1
            r25 = r11
            r32 = r12
            r31 = r13
            r14.<init>(r15, r16, r17, r18, r20, r22, r24, r25, r26, r27, r29, r31, r32, r33, r35, r36, r37)     // Catch: java.lang.Throwable -> Le1
            r0.add(r14)     // Catch: java.lang.Throwable -> Le1
            r12 = r7
            r13 = r9
            r7 = 3
            r8 = 2
            r9 = 1
            goto L105
        L203:
            r1.close()
            return r0
        L207:
            r1.close()
            throw r0
        L20b:
            java.lang.Object r1 = r0.B
            sw7 r1 = (defpackage.sw7) r1
            java.lang.Object r0 = r0.L
            rw7 r0 = (defpackage.rw7) r0
            r2 = r51
            e36 r2 = (defpackage.e36) r2
            r2.getClass()
            tm0 r1 = r1.b
            r1.Y(r2, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L222:
            java.lang.Object r1 = r0.B
            qw7 r1 = (defpackage.qw7) r1
            java.lang.Object r0 = r0.L
            pw7 r0 = (defpackage.pw7) r0
            r2 = r51
            e36 r2 = (defpackage.e36) r2
            r2.getClass()
            tm0 r1 = r1.b
            r1.Y(r2, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L239:
            java.lang.Object r1 = r0.B
            dv7 r1 = (defpackage.dv7) r1
            java.lang.Object r0 = r0.L
            android.view.View r0 = (android.view.View) r0
            r2 = r51
            gl1 r2 = (defpackage.gl1) r2
            r1.a(r0)
            j00 r2 = new j00
            r2.<init>(r3, r1, r0)
            return r2
        L24e:
            java.lang.Object r1 = r0.B
            qr7 r1 = (defpackage.qr7) r1
            java.lang.Object r0 = r0.L
            r2 = r0
            hm4 r2 = (defpackage.hm4) r2
            r3 = r51
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            tp6 r1 = r1.e
        L260:
            java.lang.Object r0 = r1.getValue()
            r4 = r0
            pr7 r4 = (defpackage.pr7) r4
            java.util.Map r5 = r4.i
            java.lang.String r6 = r2.a
            vr4 r7 = new vr4
            r7.<init>(r6, r3)
            java.util.Map r13 = defpackage.c14.p0(r5, r7)
            r15 = 0
            r16 = 1791(0x6ff, float:2.51E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            pr7 r4 = defpackage.pr7.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r1.j(r0, r4)
            if (r0 == 0) goto L260
            jg7 r0 = defpackage.jg7.a
            return r0
        L28d:
            java.lang.Object r1 = r0.B
            gj7 r1 = (defpackage.gj7) r1
            java.lang.Object r0 = r0.L
            ed3 r0 = (defpackage.ed3) r0
            r2 = r51
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r2 = r1.k
            monitor-enter(r2)
            java.util.ArrayList r1 = r1.w     // Catch: java.lang.Throwable -> L2a5
            r1.remove(r0)     // Catch: java.lang.Throwable -> L2a5
            monitor-exit(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2a5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L2a8:
            java.lang.Object r1 = r0.B
            nh7 r1 = (defpackage.nh7) r1
            java.lang.Object r0 = r0.L
            qn2 r0 = (defpackage.qn2) r0
            r2 = r51
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            float r2 = r1.e
            r3 = 0
            r1.e = r3
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r0.g(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2c6:
            java.lang.Object r1 = r0.B
            rr6 r1 = (defpackage.rr6) r1
            java.lang.Object r0 = r0.L
            te7 r0 = (defpackage.te7) r0
            r2 = r51
            we7 r2 = (defpackage.we7) r2
            java.lang.Object r3 = r1.B
            w31 r3 = (defpackage.w31) r3
            monitor-enter(r3)
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L2e8
            java.lang.Object r1 = r1.L
            yz3 r1 = (defpackage.yz3) r1
            if (r4 == 0) goto L2ea
            java.lang.Object r0 = r1.l(r0, r2)     // Catch: java.lang.Throwable -> L2e8
            we7 r0 = (defpackage.we7) r0     // Catch: java.lang.Throwable -> L2e8
            goto L2f0
        L2e8:
            r0 = move-exception
            goto L2f4
        L2ea:
            java.lang.Object r0 = r1.m(r0)     // Catch: java.lang.Throwable -> L2e8
            we7 r0 = (defpackage.we7) r0     // Catch: java.lang.Throwable -> L2e8
        L2f0:
            monitor-exit(r3)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2f4:
            monitor-exit(r3)
            throw r0
        L2f6:
            java.lang.Object r1 = r0.B
            ga7 r1 = (defpackage.ga7) r1
            java.lang.Object r0 = r0.L
            ca7 r0 = (defpackage.ca7) r0
            r2 = r51
            gl1 r2 = (defpackage.gl1) r2
            mm6 r2 = r1.i
            r2.add(r0)
            j00 r2 = new j00
            r2.<init>(r4, r1, r0)
            return r2
        L30d:
            java.lang.Object r1 = r0.B
            java.lang.Object r0 = r0.L
            w61 r0 = (defpackage.w61) r0
            r3 = r51
            on2 r3 = (defpackage.on2) r3
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r1 != r4) goto L321
            r3.c()
            goto L32b
        L321:
            y3 r1 = new y3
            r4 = 0
            r1.<init>(r3, r4, r2)
            r2 = 3
            defpackage.hv.L(r0, r4, r4, r1, r2)
        L32b:
            jg7 r0 = defpackage.jg7.a
            return r0
        L32e:
            java.lang.Object r1 = r0.B
            ga7 r1 = (defpackage.ga7) r1
            java.lang.Object r0 = r0.L
            w97 r0 = (defpackage.w97) r0
            r2 = r51
            gl1 r2 = (defpackage.gl1) r2
            j00 r2 = new j00
            r2.<init>(r5, r1, r0)
            return r2
        L340:
            java.lang.Object r1 = r0.B
            ga7 r1 = (defpackage.ga7) r1
            java.lang.Object r0 = r0.L
            ga7 r0 = (defpackage.ga7) r0
            r2 = r51
            gl1 r2 = (defpackage.gl1) r2
            mm6 r2 = r1.j
            r2.add(r0)
            j00 r2 = new j00
            r2.<init>(r6, r1, r0)
            return r2
    }
}
