package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bv1 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ bv1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r27 = this;
            r0 = r27
            int r1 = r0.A
            r2 = 128(0x80, float:1.8E-43)
            r3 = 8
            r4 = 1
            r5 = 6
            r6 = 3
            r7 = 7
            r8 = 0
            java.lang.String r9 = "handler"
            r10 = 0
            jg7 r11 = defpackage.jg7.a
            me.magnum.melonds.ui.emulator.EmulatorActivity r12 = r0.B
            switch(r1) {
                case 0: goto L1de;
                case 1: goto L1d8;
                case 2: goto L1d2;
                case 3: goto L1cc;
                case 4: goto L1b9;
                case 5: goto L1a6;
                case 6: goto L199;
                case 7: goto L18f;
                case 8: goto L185;
                case 9: goto L17d;
                case 10: goto L15d;
                case 11: goto L14c;
                case 12: goto L13a;
                case 13: goto L128;
                case 14: goto L117;
                case 15: goto L106;
                case 16: goto Ld8;
                case 17: goto Ld2;
                case 18: goto Lca;
                case 19: goto Lb6;
                case 20: goto La5;
                case 21: goto L8f;
                case 22: goto L78;
                case 23: goto L62;
                case 24: goto L50;
                case 25: goto L4a;
                case 26: goto L44;
                case 27: goto L3b;
                case 28: goto L1f;
                default: goto L17;
            }
        L17:
            vs4 r0 = r12.G1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            return r11
        L1f:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            vs4 r0 = r12.F1
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L33
            r0.setValue(r10)
            bt r0 = r12.V1
            ex1 r1 = defpackage.ex1.PAUSE_MENU
            r0.T(r1)
        L33:
            sz1 r0 = r12.W()
            r0.T0()
            return r11
        L3b:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.Q()
            r12.i0()
            return r11
        L44:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.b0()
            return r11
        L4a:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.b0()
            return r11
        L50:
            bt r0 = r12.V1
            ex1 r1 = defpackage.ex1.PRESETS_DIALOG
            r0.T(r1)
            vs4 r0 = r12.E1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r12.i0()
            return r11
        L62:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.P0()
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L74
            gu1 r1 = new gu1
            r1.<init>(r12, r7)
            r0.post(r1)
            return r11
        L74:
            defpackage.nb3.a0(r9)
            throw r10
        L78:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.P0()
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L8b
            gu1 r1 = new gu1
            r2 = 4
            r1.<init>(r12, r2)
            r0.post(r1)
            return r11
        L8b:
            defpackage.nb3.a0(r9)
            throw r10
        L8f:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.Q0()
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto La1
            gu1 r1 = new gu1
            r1.<init>(r12, r8)
            r0.post(r1)
            return r11
        La1:
            defpackage.nb3.a0(r9)
            throw r10
        La5:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r12.W()
            o41 r1 = r0.z
            r02 r2 = new r02
            r2.<init>(r0, r10)
            defpackage.hv.L(r1, r10, r10, r2, r6)
            return r11
        Lb6:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.b0()
            vs4 r0 = r12.E1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            bt r0 = r12.V1
            ex1 r1 = defpackage.ex1.PRESETS_DIALOG
            r0.z(r1)
            return r11
        Lca:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            e84 r0 = new e84
            r0.<init>(r12)
            return r0
        Ld2:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.L0()
            return r11
        Ld8:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.getClass()
            boolean r0 = r12.Y()
            if (r0 != 0) goto Le4
            goto L105
        Le4:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r13 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = 0
            r26 = 524287(0x7ffff, float:7.34683E-40)
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r13.setRenderer2DDebugControls(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r12.a0()
        L105:
            return r11
        L106:
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L113
            gu1 r1 = new gu1
            r1.<init>(r12, r5)
            r0.post(r1)
            return r11
        L113:
            defpackage.nb3.a0(r9)
            throw r10
        L117:
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L124
            gu1 r1 = new gu1
            r1.<init>(r12, r6)
            r0.post(r1)
            return r11
        L124:
            defpackage.nb3.a0(r9)
            throw r10
        L128:
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L136
            gu1 r1 = new gu1
            r2 = 2
            r1.<init>(r12, r2)
            r0.post(r1)
            return r11
        L136:
            defpackage.nb3.a0(r9)
            throw r10
        L13a:
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L148
            gu1 r1 = new gu1
            r2 = 5
            r1.<init>(r12, r2)
            r0.post(r1)
            return r11
        L148:
            defpackage.nb3.a0(r9)
            throw r10
        L14c:
            android.os.Handler r0 = r12.N0
            if (r0 == 0) goto L159
            gu1 r1 = new gu1
            r1.<init>(r12, r4)
            r0.post(r1)
            return r11
        L159:
            defpackage.nb3.a0(r9)
            throw r10
        L15d:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            hq2 r11 = new hq2
            bv1 r13 = new bv1
            me.magnum.melonds.ui.emulator.EmulatorActivity r12 = r0.B
            r13.<init>(r12, r5)
            wc0 r14 = new wc0
            r14.<init>(r12, r10, r4)
            bv1 r15 = new bv1
            r15.<init>(r12, r7)
            bv1 r0 = new bv1
            r0.<init>(r12, r3)
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L17d:
            c92 r0 = r12.K0
            if (r0 == 0) goto L184
            r0.a(r10)
        L184:
            return r11
        L185:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r12.W()
            r0.T0()
            return r11
        L18f:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r12.W()
            r0.M0(r8)
            return r11
        L199:
            s8 r0 = r12.B0
            if (r0 == 0) goto L1a0
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r0 = r0.h
            return r0
        L1a0:
            java.lang.String r0 = "binding"
            defpackage.nb3.a0(r0)
            throw r10
        L1a6:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.view.Window r0 = r12.getWindow()
            r0.clearFlags(r2)
            c92 r0 = r12.K0
            if (r0 == 0) goto L1b8
            android.view.View r0 = r0.R
            r0.setVisibility(r8)
        L1b8:
            return r11
        L1b9:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.view.Window r0 = r12.getWindow()
            r0.addFlags(r2)
            c92 r0 = r12.K0
            if (r0 == 0) goto L1cb
            android.view.View r0 = r0.R
            r0.setVisibility(r3)
        L1cb:
            return r11
        L1cc:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.C0()
            return r11
        L1d2:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.E0()
            return r11
        L1d8:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.H0()
            return r11
        L1de:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r12.J0()
            return r11
    }
}
