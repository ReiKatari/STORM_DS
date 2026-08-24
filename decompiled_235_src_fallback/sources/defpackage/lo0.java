package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo0  reason: default package */
/* loaded from: classes.dex */
public final class lo0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ lo0(android.content.Context r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public lo0(defpackage.r41 r2, defpackage.ii7 r3, boolean r4) {
            r1 = this;
            r0 = 4
            r1.X = r0
            r1.Z = r3
            r1.Y = r4
            r3 = 2
            r1.<init>(r3, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L48;
                case 1: goto L37;
                case 2: goto L26;
                case 3: goto L15;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            lo0 r2 = (defpackage.lo0) r2
            r2.s(r1)
            return r1
        L15:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            lo0 r2 = (defpackage.lo0) r2
            r2.s(r1)
            return r1
        L26:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            lo0 r2 = (defpackage.lo0) r2
            r2.s(r1)
            return r1
        L37:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            lo0 r2 = (defpackage.lo0) r2
            r2.s(r1)
            return r1
        L48:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            lo0 r2 = (defpackage.lo0) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.Z
            switch(r0) {
                case 0: goto L44;
                case 1: goto L33;
                case 2: goto L22;
                case 3: goto L11;
                default: goto L7;
            }
        L7:
            lo0 r4 = new lo0
            ii7 r1 = (defpackage.ii7) r1
            boolean r2 = r2.Y
            r4.<init>(r3, r1, r2)
            return r4
        L11:
            lo0 r2 = new lo0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 3
            r2.<init>(r1, r3, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r2.Y = r3
            return r2
        L22:
            lo0 r2 = new lo0
            me.magnum.melonds.ui.romlist.RomListActivity r1 = (me.magnum.melonds.ui.romlist.RomListActivity) r1
            r0 = 2
            r2.<init>(r1, r3, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r2.Y = r3
            return r2
        L33:
            lo0 r2 = new lo0
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            r0 = 1
            r2.<init>(r1, r3, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r2.Y = r3
            return r2
        L44:
            lo0 r2 = new lo0
            me.magnum.melonds.ui.cheats.CheatsActivity r1 = (me.magnum.melonds.ui.cheats.CheatsActivity) r1
            r0 = 0
            r2.<init>(r1, r3, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r2.Y = r3
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            r1 = 1
            switch(r0) {
                case 0: goto L111;
                case 1: goto Lf5;
                case 2: goto L54;
                case 3: goto L41;
                default: goto L6;
            }
        L6:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r7.Z
            ii7 r8 = (defpackage.ii7) r8
            sw r8 = r8.h
            boolean r8 = r8.b()
            if (r8 == 0) goto L27
            java.lang.String r7 = "CXCP"
            boolean r7 = defpackage.kj2.F(r7)
            if (r7 == 0) goto L3b
            java.lang.String r7 = "CXCP"
            java.lang.String r8 = "UseCaseCamera is closed before setActiveResumeMode, skipping setup."
            android.util.Log.d(r7, r8)
            goto L3b
        L27:
            java.lang.Object r8 = r7.Z
            ii7 r8 = (defpackage.ii7) r8
            ej7 r8 = r8.a
            sf0 r8 = r8.a()
            boolean r7 = r7.Y
            kc0 r8 = r8.X
            java.lang.Object r0 = r8.q
            monitor-enter(r0)
            r8.r = r7     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
        L3b:
            jg7 r7 = defpackage.jg7.a
            return r7
        L3e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L41:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            boolean r8 = r7.Y
            java.lang.Object r7 = r7.Z
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r0 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.fq4.a(r7, r0, r8)
            jg7 r7 = defpackage.jg7.a
            return r7
        L54:
            boolean r0 = r7.Y
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            java.lang.Object r7 = r7.Z
            me.magnum.melonds.ui.romlist.RomListActivity r7 = (me.magnum.melonds.ui.romlist.RomListActivity) r7
            r8 = 2131427664(0x7f0b0150, float:1.847695E38)
            if (r0 == 0) goto Lc2
            int r0 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            java.lang.String r0 = "ROM_LIST"
            ak7 r2 = r7.w()
            if (r2 == 0) goto L71
            r2.j0()
        L71:
            ll2 r2 = r7.t()
            androidx.fragment.app.o r2 = r2.D(r0)
            me.magnum.melonds.ui.romlist.a r2 = (me.magnum.melonds.ui.romlist.a) r2
            if (r2 != 0) goto Lb9
            me.magnum.melonds.ui.romlist.a$a r2 = me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_ALL
            r2.getClass()
            me.magnum.melonds.ui.romlist.a r3 = new me.magnum.melonds.ui.romlist.a
            r3.<init>()
            java.lang.String r4 = "allow_rom_configuration"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
            java.lang.String r4 = "rom_enable_criteria"
            java.lang.String r2 = r2.toString()
            vr4 r5 = new vr4
            r5.<init>(r4, r2)
            vr4[] r2 = new defpackage.vr4[]{r6, r5}
            android.os.Bundle r2 = defpackage.jw2.l(r2)
            r3.setArguments(r2)
            ll2 r2 = r7.t()
            r2.getClass()
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r2)
            r4.e(r8, r3, r0)
            r4.i(r1, r1)
            r2 = r3
        Lb9:
            ro5 r8 = new ro5
            r0 = 4
            r8.<init>(r7, r0)
            r2.e0 = r8
            goto Lf2
        Lc2:
            int r0 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            java.lang.String r0 = "NO_ROM_DIRECTORY"
            ak7 r2 = r7.w()
            if (r2 == 0) goto Lcf
            r2.j0()
        Lcf:
            ll2 r2 = r7.t()
            androidx.fragment.app.o r2 = r2.D(r0)
            wf4 r2 = (defpackage.wf4) r2
            if (r2 != 0) goto Lf2
            wf4 r2 = new wf4
            r2.<init>()
            ll2 r7 = r7.t()
            r7.getClass()
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r7)
            r3.e(r8, r2, r0)
            r3.i(r1, r1)
        Lf2:
            jg7 r7 = defpackage.jg7.a
            return r7
        Lf5:
            boolean r0 = r7.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            java.lang.Object r7 = r7.Z
            me.magnum.melonds.ui.emulator.EmulatorActivity r7 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r7
            r7.k1 = r0
            r7.U0()
            c92 r7 = r7.K0
            if (r7 == 0) goto L10e
            r7.B = r0
            r7.b()
        L10e:
            jg7 r7 = defpackage.jg7.a
            return r7
        L111:
            java.lang.Object r0 = r7.Z
            me.magnum.melonds.ui.cheats.CheatsActivity r0 = (me.magnum.melonds.ui.cheats.CheatsActivity) r0
            boolean r7 = r7.Y
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            if (r7 != 0) goto L128
            r7 = 2131951981(0x7f13016d, float:1.9540392E38)
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r7, r1)
            r7.show()
        L128:
            r0.finish()
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
