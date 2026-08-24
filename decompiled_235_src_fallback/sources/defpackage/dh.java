package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh  reason: default package */
/* loaded from: classes.dex */
public final class dh extends defpackage.hw6 implements defpackage.eo2 {
    public android.net.Uri X;
    public android.net.Uri Y;
    public defpackage.jh Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.pq5 f0;
    public final /* synthetic */ defpackage.jh g0;
    public final /* synthetic */ java.util.List h0;

    public dh(defpackage.pq5 r1, defpackage.jh r2, java.util.List r3, defpackage.r41 r4) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r0.h0 = r3
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
            dh r0 = (defpackage.dh) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            dh r0 = new dh
            jh r1 = r3.g0
            java.util.List r2 = r3.h0
            pq5 r3 = r3.f0
            r0.<init>(r3, r1, r2, r4)
            r0.e0 = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r54) {
            r53 = this;
            r1 = r53
            java.lang.String r0 = "loadRom returned terminal error: "
            java.lang.String r2 = "ROM launch successful in "
            java.lang.String r3 = "Loading ROM '"
            java.lang.String r4 = "loadRom: rom='"
            java.lang.Object r5 = r1.e0
            w61 r5 = (defpackage.w61) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r1.d0
            me.magnum.melonds.MelonEmulator r8 = me.magnum.melonds.MelonEmulator.a
            r10 = 2
            java.util.List r14 = r1.h0
            java.lang.String r15 = "AndroidEmulatorManager"
            r11 = 1
            pq5 r12 = r1.f0
            r13 = 0
            jh r9 = r1.g0
            if (r7 == 0) goto L4d
            if (r7 == r11) goto L49
            if (r7 == r10) goto L43
            r10 = 3
            if (r7 != r10) goto L3d
            jh r6 = r1.Z
            android.net.Uri r7 = r1.Y
            android.net.Uri r10 = r1.X
            defpackage.oi2.Y(r54)     // Catch: java.lang.Throwable -> L38
            r11 = r10
            r10 = r7
            r7 = r11
            r11 = r54
            goto Lad
        L38:
            r0 = move-exception
            r4 = r9
            r7 = r12
            goto L34f
        L3d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L43:
            defpackage.oi2.Y(r54)     // Catch: java.lang.Throwable -> L38
            r7 = r54
            goto L87
        L49:
            defpackage.oi2.Y(r54)     // Catch: java.lang.Throwable -> L38
            return r54
        L4d:
            defpackage.oi2.Y(r54)
            boolean r7 = r12.c()     // Catch: java.lang.Throwable -> L38
            android.net.Uri r11 = r12.d
            if (r7 != 0) goto L332
            java.lang.Long r7 = r12.l     // Catch: java.lang.Throwable -> L38
            if (r7 != 0) goto L332
            java.lang.String r7 = r11.getScheme()     // Catch: java.lang.Throwable -> L38
            java.lang.String r13 = "dsiware-installed"
            boolean r7 = defpackage.nb3.k(r7, r13)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L6d
            r4 = r9
            r7 = r12
            r0 = 0
            goto L335
        L6d:
            android.content.Context r7 = r9.a     // Catch: java.lang.Throwable -> L38
            qi6 r7 = defpackage.zl1.g(r7, r11)     // Catch: java.lang.Throwable -> L38
            mp r11 = r9.e     // Catch: java.lang.Throwable -> L38
            pw5 r7 = r11.a(r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L8c
            r1.e0 = r5     // Catch: java.lang.Throwable -> L38
            r1.d0 = r10     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.b(r12, r1)     // Catch: java.lang.Throwable -> L38
            if (r7 != r6) goto L87
            goto L34d
        L87:
            r10 = r7
            android.net.Uri r10 = (android.net.Uri) r10     // Catch: java.lang.Throwable -> L38
            if (r10 != 0) goto L90
        L8c:
            r4 = r9
            r7 = r12
            goto L32f
        L90:
            ro6 r7 = r9.c     // Catch: java.lang.Throwable -> L38 defpackage.qo6 -> L326
            android.net.Uri r7 = r7.a(r12)     // Catch: java.lang.Throwable -> L38 defpackage.qo6 -> L326
            r1.e0 = r5     // Catch: java.lang.Throwable -> L38
            r1.X = r10     // Catch: java.lang.Throwable -> L38
            r1.Y = r7     // Catch: java.lang.Throwable -> L38
            r1.Z = r9     // Catch: java.lang.Throwable -> L38
            r11 = 3
            r1.d0 = r11     // Catch: java.lang.Throwable -> L38
            java.lang.Object r11 = r9.g(r12, r1)     // Catch: java.lang.Throwable -> L38
            if (r11 != r6) goto La9
            goto L34d
        La9:
            r6 = r10
            r10 = r7
            r7 = r6
            r6 = r9
        Lad:
            me.magnum.melonds.domain.model.EmulatorConfiguration r11 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r11     // Catch: java.lang.Throwable -> L38
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = defpackage.jh.c(r6, r11)     // Catch: java.lang.Throwable -> L38
            if (r6 != 0) goto Lbd
            xx5 r0 = new xx5     // Catch: java.lang.Throwable -> L38
            me.magnum.melonds.MelonEmulator$c r2 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED     // Catch: java.lang.Throwable -> L38
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L38
            return r0
        Lbd:
            defpackage.jh.b(r9, r6)     // Catch: java.lang.Throwable -> L38
            p87 r11 = r9.o     // Catch: java.lang.Throwable -> L38
            g91 r13 = r9.g     // Catch: java.lang.Throwable -> L38
            r16 = r5
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r5 = r9.r     // Catch: java.lang.Throwable -> L38
            r54 = r5
            jt5 r5 = r12.f     // Catch: java.lang.Throwable -> L38
            r19 = r6
            java.lang.String r6 = r12.a     // Catch: java.lang.Throwable -> L38
            hi2 r5 = r5.d     // Catch: java.lang.Throwable -> L38
            r20 = r7
            uw5 r7 = defpackage.uw5.o     // Catch: java.lang.Throwable -> L38
            boolean r7 = defpackage.nb3.k(r5, r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto Le1
            me.magnum.melonds.MelonEmulator$b r7 = me.magnum.melonds.MelonEmulator.b.NONE     // Catch: java.lang.Throwable -> L38
        Lde:
            r21 = r7
            goto L109
        Le1:
            boolean r7 = r5 instanceof defpackage.sw5     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto Le8
            me.magnum.melonds.MelonEmulator$b r7 = me.magnum.melonds.MelonEmulator.b.GBA_ROM     // Catch: java.lang.Throwable -> L38
            goto Lde
        Le8:
            tw5 r7 = defpackage.tw5.o     // Catch: java.lang.Throwable -> L38
            boolean r7 = defpackage.nb3.k(r5, r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto Lf3
            me.magnum.melonds.MelonEmulator$b r7 = me.magnum.melonds.MelonEmulator.b.MEMORY_EXPANSION     // Catch: java.lang.Throwable -> L38
            goto Lde
        Lf3:
            vw5 r7 = defpackage.vw5.o     // Catch: java.lang.Throwable -> L38
            boolean r7 = defpackage.nb3.k(r5, r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto Lfe
            me.magnum.melonds.MelonEmulator$b r7 = me.magnum.melonds.MelonEmulator.b.RUMBLE_PAK     // Catch: java.lang.Throwable -> L38
            goto Lde
        Lfe:
            rw5 r7 = defpackage.rw5.o     // Catch: java.lang.Throwable -> L38
            boolean r7 = defpackage.nb3.k(r5, r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L31e
            me.magnum.melonds.MelonEmulator$b r7 = me.magnum.melonds.MelonEmulator.b.ANALOG_INPUT     // Catch: java.lang.Throwable -> L38
            goto Lde
        L109:
            java.lang.String r7 = r21.name()     // Catch: java.lang.Throwable -> L38
            r22 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12e
            r8.append(r6)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r4 = "' gbaSlotType="
            r8.append(r4)     // Catch: java.lang.Throwable -> L12e
            r8.append(r7)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L12e
            android.util.Log.w(r15, r4)     // Catch: java.lang.Throwable -> L12e
            boolean r4 = r5 instanceof defpackage.sw5     // Catch: java.lang.Throwable -> L12e
            if (r4 == 0) goto L135
            r4 = r5
            sw5 r4 = (defpackage.sw5) r4     // Catch: java.lang.Throwable -> L12e
            goto L136
        L12e:
            r0 = move-exception
            r4 = r9
            r7 = r12
            r8 = r22
            goto L34f
        L135:
            r4 = 0
        L136:
            if (r4 == 0) goto L13b
            android.net.Uri r4 = r4.o     // Catch: java.lang.Throwable -> L12e
            goto L13c
        L13b:
            r4 = 0
        L13c:
            boolean r7 = r5 instanceof defpackage.sw5     // Catch: java.lang.Throwable -> L12e
            if (r7 == 0) goto L144
            r7 = r5
            sw5 r7 = (defpackage.sw5) r7     // Catch: java.lang.Throwable -> L12e
            goto L145
        L144:
            r7 = 0
        L145:
            if (r7 == 0) goto L158
            android.net.Uri r7 = r7.p     // Catch: java.lang.Throwable -> L12e
            r18 = r13
            r13 = r7
            r17 = r11
            r11 = r21
            r8 = r22
            r7 = r12
        L153:
            r12 = r4
            r4 = r9
            r9 = r20
            goto L163
        L158:
            r18 = r13
            r13 = 0
            r17 = r11
            r7 = r12
            r11 = r21
            r8 = r22
            goto L153
        L163:
            me.magnum.melonds.MelonEmulator$c r12 = r8.b(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L17b
            boolean r13 = r12.isTerminal()     // Catch: java.lang.Throwable -> L17b
            r51 = r0
            if (r13 != 0) goto L17e
            boolean r13 = defpackage.g04.H(r16)     // Catch: java.lang.Throwable -> L17b
            if (r13 != 0) goto L176
            goto L17e
        L176:
            r5 = r12
            r3 = r19
            goto L26f
        L17b:
            r0 = move-exception
            goto L34f
        L17e:
            me.magnum.melonds.domain.model.ConsoleType r13 = r19.getConsoleType()     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DSi     // Catch: java.lang.Throwable -> L17b
            if (r13 != r0) goto L176
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L17b
            r0.append(r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r3 = "' in DSi mode failed ("
            r0.append(r3)     // Catch: java.lang.Throwable -> L17b
            r0.append(r12)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r3 = "), attempting fallback in DS mode"
            r0.append(r3)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L17b
            android.util.Log.w(r15, r0)     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.domain.model.ConsoleType r37 = me.magnum.melonds.domain.model.ConsoleType.DS     // Catch: java.lang.Throwable -> L17b
            r49 = 268304380(0xffdfffc, float:2.5046328E-29)
            r50 = 0
            r20 = 0
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
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r50)     // Catch: java.lang.Throwable -> L17b
            r3 = r19
            defpackage.jh.b(r4, r0)     // Catch: java.lang.Throwable -> L17b
            boolean r6 = r5 instanceof defpackage.sw5     // Catch: java.lang.Throwable -> L17b
            if (r6 == 0) goto L1f0
            r13 = r5
            sw5 r13 = (defpackage.sw5) r13     // Catch: java.lang.Throwable -> L17b
            goto L1f1
        L1f0:
            r13 = 0
        L1f1:
            if (r13 == 0) goto L1f6
            android.net.Uri r13 = r13.o     // Catch: java.lang.Throwable -> L17b
            goto L1f7
        L1f6:
            r13 = 0
        L1f7:
            boolean r6 = r5 instanceof defpackage.sw5     // Catch: java.lang.Throwable -> L17b
            if (r6 == 0) goto L1fe
            sw5 r5 = (defpackage.sw5) r5     // Catch: java.lang.Throwable -> L17b
            goto L1ff
        L1fe:
            r5 = 0
        L1ff:
            if (r5 == 0) goto L20a
            android.net.Uri r5 = r5.p     // Catch: java.lang.Throwable -> L17b
            r52 = r13
            r13 = r5
            r5 = r12
            r12 = r52
            goto L20d
        L20a:
            r5 = r12
            r12 = r13
            r13 = 0
        L20d:
            me.magnum.melonds.MelonEmulator$c r6 = r8.b(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L17b
            boolean r9 = r6.isTerminal()     // Catch: java.lang.Throwable -> L17b
            if (r9 != 0) goto L26f
            boolean r9 = defpackage.g04.H(r16)     // Catch: java.lang.Throwable -> L17b
            if (r9 == 0) goto L26f
            r54.c()     // Catch: java.lang.Throwable -> L17b
            boolean r0 = defpackage.jh.a(r4, r0)     // Catch: java.lang.Throwable -> L17b
            if (r0 != 0) goto L23a
            r18.a()     // Catch: java.lang.Throwable -> L17b
            r8.stopEmulation()     // Catch: java.lang.Throwable -> L17b
            r54.d()     // Catch: java.lang.Throwable -> L17b
            r17.r()     // Catch: java.lang.Throwable -> L17b
            xx5 r0 = new xx5     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.MelonEmulator$c r2 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED     // Catch: java.lang.Throwable -> L17b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L17b
            return r0
        L23a:
            r0 = 0
            me.magnum.melonds.domain.model.Cheat[] r2 = new me.magnum.melonds.domain.model.Cheat[r0]     // Catch: java.lang.Throwable -> L17b
            java.lang.Object[] r0 = r14.toArray(r2)     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.domain.model.Cheat[] r0 = (me.magnum.melonds.domain.model.Cheat[]) r0     // Catch: java.lang.Throwable -> L17b
            r8.setupCheats(r0)     // Catch: java.lang.Throwable -> L17b
            r0 = 1
            r8.startEmulation(r0)     // Catch: java.lang.Throwable -> L17b
            jh r0 = r1.g0     // Catch: java.lang.Throwable -> L17b
            java.lang.String r2 = r7.c     // Catch: java.lang.Throwable -> L17b
            java.lang.String r20 = "Fallback boot successful in standard DS FreeBIOS mode"
            java.lang.String r21 = "loadRom (DS Fallback)"
            r19 = 1
            r16 = r0
            r18 = r2
            r17 = r7
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L26a
            by5 r0 = new by5     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.MelonEmulator$c r2 = me.magnum.melonds.MelonEmulator.c.SUCCESS_GBA_FAILED     // Catch: java.lang.Throwable -> L17b
            if (r6 == r2) goto L265
            r11 = 1
            goto L266
        L265:
            r11 = 0
        L266:
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L17b
            return r0
        L26a:
            r0 = move-exception
            r7 = r17
            goto L34f
        L26f:
            boolean r0 = r5.isTerminal()     // Catch: java.lang.Throwable -> L17b
            if (r0 != 0) goto L2f0
            boolean r0 = defpackage.g04.H(r16)     // Catch: java.lang.Throwable -> L17b
            if (r0 != 0) goto L27d
            goto L2f0
        L27d:
            r54.c()     // Catch: java.lang.Throwable -> L17b
            boolean r0 = defpackage.jh.a(r4, r3)     // Catch: java.lang.Throwable -> L17b
            if (r0 != 0) goto L2ad
            r18.a()     // Catch: java.lang.Throwable -> L17b
            r8.stopEmulation()     // Catch: java.lang.Throwable -> L17b
            r54.d()     // Catch: java.lang.Throwable -> L17b
            r17.r()     // Catch: java.lang.Throwable -> L17b
            jh r0 = r1.g0     // Catch: java.lang.Throwable -> L17b
            java.lang.String r2 = r7.c     // Catch: java.lang.Throwable -> L17b
            java.lang.String r20 = "Vulkan pipeline precompilation failed"
            java.lang.String r21 = "loadRom"
            r19 = 0
            r16 = r0
            r18 = r2
            r17 = r7
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L26a
            xx5 r0 = new xx5     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.MelonEmulator$c r2 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED     // Catch: java.lang.Throwable -> L17b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L17b
            return r0
        L2ad:
            r0 = 0
            me.magnum.melonds.domain.model.Cheat[] r6 = new me.magnum.melonds.domain.model.Cheat[r0]     // Catch: java.lang.Throwable -> L17b
            java.lang.Object[] r6 = r14.toArray(r6)     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.domain.model.Cheat[] r6 = (me.magnum.melonds.domain.model.Cheat[]) r6     // Catch: java.lang.Throwable -> L17b
            r8.setupCheats(r6)     // Catch: java.lang.Throwable -> L17b
            r6 = 1
            r8.startEmulation(r6)     // Catch: java.lang.Throwable -> L17b
            jh r6 = r1.g0     // Catch: java.lang.Throwable -> L17b
            java.lang.String r9 = r7.c     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.domain.model.ConsoleType r3 = r3.getConsoleType()     // Catch: java.lang.Throwable -> L17b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17b
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L17b
            r10.append(r3)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r2 = " mode"
            r10.append(r2)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r20 = r10.toString()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r21 = "loadRom"
            r19 = 1
            r16 = r6
            r17 = r7
            r18 = r9
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L26a
            by5 r2 = new by5     // Catch: java.lang.Throwable -> L17b
            me.magnum.melonds.MelonEmulator$c r3 = me.magnum.melonds.MelonEmulator.c.SUCCESS_GBA_FAILED     // Catch: java.lang.Throwable -> L17b
            if (r5 == r3) goto L2eb
            r11 = 1
            goto L2ec
        L2eb:
            r11 = r0
        L2ec:
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L17b
            return r2
        L2f0:
            r18.a()     // Catch: java.lang.Throwable -> L17b
            r8.stopEmulation()     // Catch: java.lang.Throwable -> L17b
            r17.r()     // Catch: java.lang.Throwable -> L17b
            jh r0 = r1.g0     // Catch: java.lang.Throwable -> L17b
            java.lang.String r2 = r7.c     // Catch: java.lang.Throwable -> L17b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17b
            r6 = r51
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L17b
            r3.append(r5)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r20 = r3.toString()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r21 = "loadRom"
            r19 = 0
            r16 = r0
            r18 = r2
            r17 = r7
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L26a
            xx5 r0 = new xx5     // Catch: java.lang.Throwable -> L17b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L17b
            return r0
        L31e:
            r4 = r9
            r7 = r12
            ug r0 = new ug     // Catch: java.lang.Throwable -> L17b
            r0.<init>()     // Catch: java.lang.Throwable -> L17b
            throw r0     // Catch: java.lang.Throwable -> L17b
        L326:
            r0 = move-exception
            r4 = r9
            r7 = r12
            ay5 r2 = new ay5     // Catch: java.lang.Throwable -> L17b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17b
            return r2
        L32f:
            zx5 r0 = defpackage.zx5.a     // Catch: java.lang.Throwable -> L17b
            return r0
        L332:
            r4 = r9
            r7 = r12
            r0 = r13
        L335:
            r1.e0 = r0     // Catch: java.lang.Throwable -> L17b
            r0 = 1
            r1.d0 = r0     // Catch: java.lang.Throwable -> L17b
            r4.getClass()     // Catch: java.lang.Throwable -> L17b
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L17b
            de1 r0 = defpackage.de1.L     // Catch: java.lang.Throwable -> L17b
            ch r2 = new ch     // Catch: java.lang.Throwable -> L17b
            r3 = 0
            r2.<init>(r7, r4, r14, r3)     // Catch: java.lang.Throwable -> L17b
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r1)     // Catch: java.lang.Throwable -> L17b
            if (r0 != r6) goto L34e
        L34d:
            return r6
        L34e:
            return r0
        L34f:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L3a0
            java.lang.String r2 = r7.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to load ROM '"
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = "'"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.e(r15, r2, r0)
            g91 r2 = r4.g
            r2.a()
            r8.stopEmulation()
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r2 = r4.r
            r2.d()
            p87 r2 = r4.o
            r2.r()
            java.lang.String r2 = r7.c
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Exception during launch: "
            java.lang.String r20 = defpackage.i61.m(r3, r0)
            java.lang.String r21 = "loadRom Exception"
            jh r0 = r1.g0
            r19 = 0
            r16 = r0
            r18 = r2
            r17 = r7
            defpackage.jh.d(r16, r17, r18, r19, r20, r21)
            xx5 r0 = new xx5
            me.magnum.melonds.MelonEmulator$c r1 = me.magnum.melonds.MelonEmulator.c.NDS_FAILED
            r0.<init>(r1)
            return r0
        L3a0:
            throw r0
    }
}
