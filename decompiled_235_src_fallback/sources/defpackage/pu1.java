package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pu1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ pu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            int r1 = r0.A
            r2 = 0
            r3 = 1
            r4 = 0
            jg7 r5 = defpackage.jg7.a
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r0.B
            switch(r1) {
                case 0: goto L30e;
                case 1: goto L2ff;
                case 2: goto L2e8;
                case 3: goto L2d1;
                case 4: goto L2ab;
                case 5: goto L265;
                case 6: goto L1c4;
                case 7: goto L14a;
                case 8: goto Ld0;
                case 9: goto La7;
                case 10: goto L7e;
                case 11: goto L55;
                case 12: goto L2c;
                default: goto Le;
            }
        Le:
            r1 = r27
            o6 r1 = (defpackage.o6) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.getClass()
            c92 r0 = r0.K0
            if (r0 == 0) goto L2b
            ju1 r2 = new ju1
            r2.<init>(r1)
            zv0 r1 = new zv0
            r4 = -689688603(0xffffffffd6e42fe5, float:-1.2544718E14)
            r1.<init>(r4, r3, r2)
            r0.a(r1)
        L2b:
            return r5
        L2c:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.h1
            r3.getClass()
            r3.m(r4, r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "dual_screen_external_fill_width"
            r0.putBoolean(r1, r2)
            r0.apply()
            return r5
        L55:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.f1
            r3.getClass()
            r3.m(r4, r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "dual_screen_external_fill_height"
            r0.putBoolean(r1, r2)
            r0.apply()
            return r5
        L7e:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.d1
            r3.getClass()
            r3.m(r4, r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "dual_screen_internal_fill_width"
            r0.putBoolean(r1, r2)
            r0.apply()
            return r5
        La7:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.b1
            r3.getClass()
            r3.m(r4, r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "dual_screen_internal_fill_height"
            r0.putBoolean(r1, r2)
            r0.apply()
            return r5
        Ld0:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.Z0
            r3.getClass()
            r3.m(r4, r1)
            tp6 r3 = r0.p0
            java.lang.Object r3 = r3.getValue()
            boolean r6 = r3 instanceof defpackage.dy1
            if (r6 == 0) goto Lf3
            r4 = r3
            dy1 r4 = (defpackage.dy1) r4
        Lf3:
            if (r4 == 0) goto Lf9
            pq5 r3 = r4.a
            if (r3 != 0) goto Lfb
        Lf9:
            pq5 r3 = r0.n1
        Lfb:
            if (r3 == 0) goto L137
            jt5 r6 = r3.f
            r23 = 0
            r25 = 131071(0x1ffff, float:1.8367E-40)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = r1
            jt5 r9 = defpackage.jt5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            p06 r1 = r0.e
            xb2 r1 = (defpackage.xb2) r1
            r1.B(r3, r9)
            r17 = 8159(0x1fdf, float:1.1433E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r6 = r3
            pq5 r1 = defpackage.pq5.a(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            r0.n1 = r1
            goto L149
        L137:
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "dual_screen_integer_scale"
            r0.putBoolean(r1, r2)
            r0.apply()
        L149:
            return r5
        L14a:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r3 = r0.V0
            r3.getClass()
            r3.m(r4, r1)
            tp6 r3 = r0.p0
            java.lang.Object r3 = r3.getValue()
            boolean r6 = r3 instanceof defpackage.dy1
            if (r6 == 0) goto L16d
            r4 = r3
            dy1 r4 = (defpackage.dy1) r4
        L16d:
            if (r4 == 0) goto L173
            pq5 r3 = r4.a
            if (r3 != 0) goto L175
        L173:
            pq5 r3 = r0.n1
        L175:
            if (r3 == 0) goto L1b1
            jt5 r6 = r3.f
            r24 = 0
            r25 = 196607(0x2ffff, float:2.75505E-40)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = r1
            jt5 r9 = defpackage.jt5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            p06 r1 = r0.e
            xb2 r1 = (defpackage.xb2) r1
            r1.B(r3, r9)
            r17 = 8159(0x1fdf, float:1.1433E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r6 = r3
            pq5 r1 = defpackage.pq5.a(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            r0.n1 = r1
            goto L1c3
        L1b1:
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "external_display_keep_ratio"
            r0.putBoolean(r1, r2)
            r0.apply()
        L1c3:
            return r5
        L1c4:
            r1 = r27
            jq1 r1 = (defpackage.jq1) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.getClass()
            sz1 r2 = r0.W()
            r2.getClass()
            tp6 r3 = r2.X0
            r3.getClass()
            r3.m(r4, r1)
            tp6 r3 = r2.p0
            java.lang.Object r3 = r3.getValue()
            boolean r6 = r3 instanceof defpackage.dy1
            if (r6 == 0) goto L1e9
            dy1 r3 = (defpackage.dy1) r3
            goto L1ea
        L1e9:
            r3 = r4
        L1ea:
            if (r3 == 0) goto L1f0
            pq5 r3 = r3.a
            if (r3 != 0) goto L1f2
        L1f0:
            pq5 r3 = r2.n1
        L1f2:
            if (r3 == 0) goto L22e
            jt5 r6 = r3.f
            r24 = 0
            r25 = 229375(0x37fff, float:3.21423E-40)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r22 = r1
            jt5 r9 = defpackage.jt5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            p06 r6 = r2.e
            xb2 r6 = (defpackage.xb2) r6
            r6.B(r3, r9)
            r17 = 8159(0x1fdf, float:1.1433E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r6 = r3
            pq5 r3 = defpackage.pq5.a(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            r2.n1 = r3
            goto L250
        L22e:
            kd6 r2 = r2.c
            ng6 r2 = (defpackage.ng6) r2
            r2.getClass()
            android.content.SharedPreferences r2 = r2.b
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = r1.name()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r6)
            r3.getClass()
            java.lang.String r6 = "dual_screen_preset"
            r2.putString(r6, r3)
            r2.apply()
        L250:
            android.os.Handler r2 = r0.N0
            if (r2 == 0) goto L25f
            mf r3 = new mf
            r4 = 21
            r3.<init>(r4, r0, r1)
            r2.post(r3)
            return r5
        L25f:
            java.lang.String r0 = "handler"
            defpackage.nb3.a0(r0)
            throw r4
        L265:
            vs4 r1 = r0.F1
            r6 = r27
            nu4 r6 = (defpackage.nu4) r6
            int r7 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r6.getClass()
            xz5 r7 = defpackage.xz5.RESET
            if (r6 == r7) goto L283
            xz5 r7 = defpackage.xz5.EXIT
            if (r6 == r7) goto L283
            cd2 r7 = defpackage.cd2.RESET
            if (r6 == r7) goto L283
            cd2 r7 = defpackage.cd2.EXIT
            if (r6 != r7) goto L281
            goto L283
        L281:
            r7 = r2
            goto L284
        L283:
            r7 = r3
        L284:
            xz5 r8 = defpackage.xz5.REWIND
            if (r6 != r8) goto L289
            r2 = r3
        L289:
            if (r7 == 0) goto L29c
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L2a3
            r1.setValue(r4)
            bt r1 = r0.V1
            ex1 r2 = defpackage.ex1.PAUSE_MENU
            r1.T(r2)
            goto L2a3
        L29c:
            if (r2 == 0) goto L2a3
            r1.setValue(r4)
            r0.U1 = r3
        L2a3:
            sz1 r0 = r0.W()
            r0.K0(r6)
            return r5
        L2ab:
            r1 = r27
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r1 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r1
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.getClass()
            bt r3 = r0.V1
            ex1 r6 = defpackage.ex1.REWIND_WINDOW
            r3.T(r6)
            vs4 r3 = r0.L1
            r3.setValue(r4)
            r0.U1 = r2
            sz1 r2 = r0.W()
            r2.V0(r1)
            sz1 r0 = r0.W()
            r0.T0()
            return r5
        L2d1:
            r1 = r27
            p66 r1 = (defpackage.p66) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r2 = r0.l1
            r2.l(r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            r0.M(r1)
            return r5
        L2e8:
            r1 = r27
            p66 r1 = (defpackage.p66) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            tp6 r2 = r0.j1
            r2.l(r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            r0.N(r1)
            return r5
        L2ff:
            r1 = r27
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.getClass()
            i9 r0 = r0.p1
            r0.a(r1)
            return r5
        L30e:
            r1 = r27
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r1 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.getClass()
            sz1 r2 = r0.W()
            r2.V0(r1)
            r0.N()
            return r5
    }
}
