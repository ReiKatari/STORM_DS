package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch  reason: default package */
/* loaded from: classes.dex */
public final class ch extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.String X;
    public java.io.File Y;
    public android.net.Uri Z;
    public android.net.Uri d0;
    public defpackage.jh e0;
    public long f0;
    public int g0;
    public /* synthetic */ java.lang.Object h0;
    public final /* synthetic */ defpackage.pq5 i0;
    public final /* synthetic */ defpackage.jh j0;
    public final /* synthetic */ java.util.List k0;

    public ch(defpackage.pq5 r1, defpackage.jh r2, java.util.List r3, defpackage.r41 r4) {
            r0 = this;
            r0.i0 = r1
            r0.j0 = r2
            r0.k0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            ch r0 = (defpackage.ch) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            ch r0 = new ch
            jh r1 = r3.j0
            java.util.List r2 = r3.k0
            pq5 r3 = r3.i0
            r0.<init>(r3, r1, r2, r4)
            r0.h0 = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r52) {
            r51 = this;
            r1 = r51
            java.lang.String r0 = "DSiWareShortcut: exportTitleExecutable failed for titleId="
            java.lang.Object r2 = r1.h0
            w61 r2 = (defpackage.w61) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.g0
            r5 = 4
            r6 = 3
            r7 = 2
            java.lang.String r8 = "AndroidEmulatorManager"
            pq5 r9 = r1.i0
            r10 = 1
            r11 = 0
            jh r12 = r1.j0
            if (r4 == 0) goto L66
            if (r4 == r10) goto L58
            if (r4 == r7) goto L4b
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L34
            jh r0 = r1.e0
            android.net.Uri r3 = r1.d0
            android.net.Uri r4 = r1.Z
            java.lang.String r5 = r1.X
            defpackage.oi2.Y(r52)
            r15 = r3
            r18 = r5
            r5 = r52
        L31:
            r14 = r4
            goto L182
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r11
        L3a:
            long r6 = r1.f0
            java.io.File r4 = r1.Y
            java.lang.String r13 = r1.X
            defpackage.oi2.Y(r52)     // Catch: java.lang.Throwable -> L48
            r5 = r52
            r15 = r13
            goto L13a
        L48:
            r0 = move-exception
            goto L302
        L4b:
            long r13 = r1.f0
            java.io.File r4 = r1.Y
            java.lang.String r7 = r1.X
            defpackage.oi2.Y(r52)     // Catch: java.lang.Throwable -> L48
            r15 = r7
        L55:
            r6 = r13
            goto L11f
        L58:
            long r13 = r1.f0
            java.io.File r4 = r1.Y
            java.lang.String r15 = r1.X
            defpackage.oi2.Y(r52)
            r5 = r52
        L63:
            r20 = r15
            goto Lc7
        L66:
            defpackage.oi2.Y(r52)
            java.lang.Long r4 = r9.l
            if (r4 == 0) goto L308
            long r13 = r4.longValue()
            r12.getClass()
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r13 & r15
            r15 = 16
            defpackage.g04.y(r15)
            java.lang.String r5 = java.lang.Long.toString(r5, r15)
            r5.getClass()
            r6 = 8
            java.lang.String r15 = defpackage.qs6.B0(r6, r5)
            java.io.File r5 = new java.io.File
            android.content.Context r6 = r12.a
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r4 = "dsiware_cache"
            r5.<init>(r6, r4)
            r5.mkdirs()
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            java.lang.String r11 = ".nds"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            fg r5 = r12.i
            r1.h0 = r2
            r1.X = r15
            r1.Y = r4
            r1.f0 = r13
            r1.g0 = r10
            java.lang.Enum r5 = r5.i(r1)
            if (r5 != r3) goto L63
            goto L17b
        Lc7:
            mm4 r5 = (defpackage.mm4) r5
            mm4 r6 = defpackage.mm4.SUCCESS
            if (r5 == r6) goto L107
            mm4 r6 = defpackage.mm4.NAND_ALREADY_OPEN
            if (r5 == r6) goto L107
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DSiWareShortcut: failed to open NAND: "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to open NAND: "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r22 = r0.toString()
            java.lang.String r23 = "Direct loadRom (DSi)"
            jh r0 = r1.j0
            pq5 r1 = r1.i0
            r21 = 0
            r18 = r0
            r19 = r1
            defpackage.jh.d(r18, r19, r20, r21, r22, r23)
            xx5 r0 = new xx5
            me.magnum.melonds.MelonEmulator$c r1 = me.magnum.melonds.MelonEmulator.c.BIOS_FAILED
            r0.<init>(r1)
            return r0
        L107:
            r15 = r20
            r4.delete()     // Catch: java.lang.Throwable -> L48
            fg r5 = r12.i     // Catch: java.lang.Throwable -> L48
            r1.h0 = r2     // Catch: java.lang.Throwable -> L48
            r1.X = r15     // Catch: java.lang.Throwable -> L48
            r1.Y = r4     // Catch: java.lang.Throwable -> L48
            r1.f0 = r13     // Catch: java.lang.Throwable -> L48
            r1.g0 = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.j(r13, r1)     // Catch: java.lang.Throwable -> L48
            if (r5 != r3) goto L55
            goto L17b
        L11f:
            fg r5 = r12.i     // Catch: java.lang.Throwable -> L48
            java.lang.String r11 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            r11.getClass()     // Catch: java.lang.Throwable -> L48
            r1.h0 = r2     // Catch: java.lang.Throwable -> L48
            r1.X = r15     // Catch: java.lang.Throwable -> L48
            r1.Y = r4     // Catch: java.lang.Throwable -> L48
            r1.f0 = r6     // Catch: java.lang.Throwable -> L48
            r13 = 3
            r1.g0 = r13     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.d(r6, r11, r1)     // Catch: java.lang.Throwable -> L48
            if (r5 != r3) goto L13a
            goto L17b
        L13a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L48
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L2d3
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L2d3
            long r13 = r4.length()     // Catch: java.lang.Throwable -> L48
            r18 = 0
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L154
            goto L2d3
        L154:
            fg r0 = r12.i
            r0.b()
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            ro6 r0 = r12.c     // Catch: defpackage.qo6 -> L2b1
            android.net.Uri r0 = r0.a(r9)     // Catch: defpackage.qo6 -> L2b1
            r1.h0 = r2
            r1.X = r15
            r5 = 0
            r1.Y = r5
            r1.Z = r4
            r1.d0 = r0
            r1.e0 = r12
            r1.f0 = r6
            r5 = 4
            r1.g0 = r5
            java.lang.Object r5 = r12.g(r9, r1)
            if (r5 != r3) goto L17c
        L17b:
            return r3
        L17c:
            r18 = r15
            r15 = r0
            r0 = r12
            goto L31
        L182:
            r19 = r5
            me.magnum.melonds.domain.model.EmulatorConfiguration r19 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r19
            me.magnum.melonds.domain.model.ConsoleType r37 = me.magnum.melonds.domain.model.ConsoleType.DSi
            r49 = 134086652(0x7fdfffc, float:3.8217663E-34)
            r50 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r3 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r50)
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = defpackage.jh.c(r0, r3)
            jh r3 = r1.j0
            if (r0 != 0) goto L1e6
            java.lang.String r20 = "Failed to prepare DLDI configuration"
            java.lang.String r21 = "Direct loadRom (DSi)"
            pq5 r0 = r1.i0
            r19 = 0
            r17 = r0
            r16 = r3
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)
            xx5 r0 = new xx5
            me.magnum.melonds.MelonEmulator$c r1 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED
            r0.<init>(r1)
            return r0
        L1e6:
            r5 = r18
            defpackage.jh.b(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DSiWareShortcut: direct booting title "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " via loadRom"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r8, r3)
            r14.getClass()
            me.magnum.melonds.MelonEmulator$b r16 = me.magnum.melonds.MelonEmulator.b.NONE
            r17 = 0
            r18 = 0
            me.magnum.melonds.MelonEmulator r13 = me.magnum.melonds.MelonEmulator.a
            me.magnum.melonds.MelonEmulator$c r3 = r13.b(r14, r15, r16, r17, r18)
            boolean r4 = r3.isTerminal()
            if (r4 != 0) goto L21c
            boolean r2 = defpackage.g04.H(r2)
            if (r2 != 0) goto L21f
        L21c:
            r18 = r5
            goto L281
        L21f:
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r2 = r12.r
            r2.c()
            boolean r0 = defpackage.jh.a(r12, r0)
            if (r0 != 0) goto L257
            g91 r0 = r12.g
            r0.a()
            r13.stopEmulation()
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r0 = r12.r
            r0.d()
            p87 r0 = r12.o
            r0.r()
            java.lang.String r20 = "Vulkan pipeline precompilation failed"
            java.lang.String r21 = "Direct loadRom (DSi)"
            jh r0 = r1.j0
            pq5 r1 = r1.i0
            r19 = 0
            r16 = r0
            r17 = r1
            r18 = r5
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)
            xx5 r0 = new xx5
            me.magnum.melonds.MelonEmulator$c r1 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED
            r0.<init>(r1)
            return r0
        L257:
            r18 = r5
            r0 = 0
            me.magnum.melonds.domain.model.Cheat[] r0 = new me.magnum.melonds.domain.model.Cheat[r0]
            java.util.List r2 = r1.k0
            java.lang.Object[] r0 = r2.toArray(r0)
            me.magnum.melonds.domain.model.Cheat[] r0 = (me.magnum.melonds.domain.model.Cheat[]) r0
            r13.setupCheats(r0)
            r13.startEmulation(r10)
            java.lang.String r20 = "Direct loadRom boot successful in DSi mode (2.1.7 exact pipeline)"
            java.lang.String r21 = "Direct loadRom (DSi)"
            jh r0 = r1.j0
            pq5 r1 = r1.i0
            r19 = 1
            r16 = r0
            r17 = r1
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)
            by5 r0 = new by5
            r0.<init>(r10)
            return r0
        L281:
            g91 r0 = r12.g
            r0.a()
            r13.stopEmulation()
            p87 r0 = r12.o
            r0.r()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Direct loadRom returned terminal error: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r20 = r0.toString()
            java.lang.String r21 = "Direct loadRom (DSi)"
            jh r0 = r1.j0
            pq5 r1 = r1.i0
            r19 = 0
            r16 = r0
            r17 = r1
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)
            xx5 r0 = new xx5
            r0.<init>(r3)
            return r0
        L2b1:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "SRAM Load Exception: "
            java.lang.String r22 = defpackage.i61.m(r3, r2)
            java.lang.String r23 = "Direct loadRom"
            jh r2 = r1.j0
            pq5 r1 = r1.i0
            r21 = 0
            r19 = r1
            r18 = r2
            r20 = r15
            defpackage.jh.d(r18, r19, r20, r21, r22, r23)
            ay5 r1 = new ay5
            r1.<init>(r0)
            return r1
        L2d3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r2.append(r15)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L48
            android.util.Log.e(r8, r0)     // Catch: java.lang.Throwable -> L48
            jh r0 = r1.j0     // Catch: java.lang.Throwable -> L48
            pq5 r1 = r1.i0     // Catch: java.lang.Throwable -> L48
            java.lang.String r22 = "exportTitleExecutable failed"
            java.lang.String r23 = "Direct loadRom (DSi)"
            r21 = 0
            r18 = r0
            r19 = r1
            r20 = r15
            defpackage.jh.d(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L48
            xx5 r0 = new xx5     // Catch: java.lang.Throwable -> L48
            me.magnum.melonds.MelonEmulator$c r1 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED     // Catch: java.lang.Throwable -> L48
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L48
            fg r1 = r12.i
            r1.b()
            return r0
        L302:
            fg r1 = r12.i
            r1.b()
            throw r0
        L308:
            yx5 r0 = defpackage.yx5.a
            return r0
    }
}
