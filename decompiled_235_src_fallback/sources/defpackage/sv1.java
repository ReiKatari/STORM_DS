package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv1  reason: default package */
/* loaded from: classes.dex */
public final class sv1 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ sv1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r11, defpackage.r41 r12) {
            r10 = this;
            int r12 = r10.A
            jg7 r0 = defpackage.jg7.a
            me.magnum.melonds.ui.emulator.EmulatorActivity r10 = r10.B
            r1 = 0
            switch(r12) {
                case 0: goto L11a;
                case 1: goto Lf7;
                case 2: goto Lda;
                case 3: goto L99;
                case 4: goto L25;
                default: goto La;
            }
        La:
            jg7 r11 = (defpackage.jg7) r11
            c92 r11 = r10.K0
            if (r11 == 0) goto L13
            r11.dismiss()
        L13:
            r10.K0 = r1
            sz1 r10 = r10.W()
            o41 r11 = r10.z
            p02 r12 = new p02
            r12.<init>(r10, r1)
            r10 = 3
            defpackage.hv.L(r11, r1, r1, r12, r10)
            return r0
        L25:
            kv7 r11 = (defpackage.kv7) r11
            java.util.List r11 = r11.a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L32:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r11.next()
            lw2 r2 = (defpackage.lw2) r2
            boolean r3 = r2 instanceof defpackage.lw2
            if (r3 == 0) goto L83
            x66 r3 = new x66
            w60 r4 = r2.a
            gr1 r5 = r2.a()
            gr1 r6 = defpackage.gr1.d0
            if (r5 == r6) goto L51
            ko4 r5 = defpackage.ko4.PORTRAIT
            goto L53
        L51:
            ko4 r5 = defpackage.ko4.LANDSCAPE
        L53:
            boolean r2 = r2.b()
            if (r2 == 0) goto L5c
            w66 r2 = defpackage.w66.SEAMLESS
            goto L5e
        L5c:
            w66 r2 = defpackage.w66.GAP
        L5e:
            me.magnum.melonds.domain.model.Rect r6 = new me.magnum.melonds.domain.model.Rect
            android.graphics.Rect r7 = r4.c()
            int r7 = r7.left
            android.graphics.Rect r8 = r4.c()
            int r8 = r8.top
            android.graphics.Rect r9 = r4.c()
            int r9 = r9.width()
            android.graphics.Rect r4 = r4.c()
            int r4 = r4.height()
            r6.<init>(r7, r8, r9, r4)
            r3.<init>(r5, r2, r6)
            goto L84
        L83:
            r3 = r1
        L84:
            if (r3 == 0) goto L32
            r12.add(r3)
            goto L32
        L8a:
            int r11 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r10 = r10.W()
            r10.getClass()
            ci0 r10 = r10.u
            r10.n(r12)
            return r0
        L99:
            r26 r11 = (defpackage.r26) r11
            boolean r12 = r11 instanceof defpackage.p26
            java.lang.String r2 = "emulatorRumbleManager"
            if (r12 == 0) goto Lb7
            bt r10 = r10.R0
            if (r10 == 0) goto Lb3
            java.lang.Object r10 = r10.L
            bt r10 = (defpackage.bt) r10
            java.lang.Object r10 = r10.R
            of6 r10 = (defpackage.of6) r10
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.k(r11)
            goto Ld9
        Lb3:
            defpackage.nb3.a0(r2)
            throw r1
        Lb7:
            q26 r12 = defpackage.q26.a
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 == 0) goto Ld5
            bt r10 = r10.R0
            if (r10 == 0) goto Ld1
            java.lang.Object r10 = r10.L
            bt r10 = (defpackage.bt) r10
            java.lang.Object r10 = r10.R
            of6 r10 = (defpackage.of6) r10
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.k(r11)
            goto Ld9
        Ld1:
            defpackage.nb3.a0(r2)
            throw r1
        Ld5:
            defpackage.i.d()
            r0 = r1
        Ld9:
            return r0
        Lda:
            oz0 r11 = (defpackage.oz0) r11
            s8 r12 = r10.B0
            if (r12 == 0) goto Lf1
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r12 = r12.m
            r12.setConnectedControllersState(r11)
            c92 r10 = r10.K0
            if (r10 == 0) goto Lf0
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r10 = r10.L
            if (r10 == 0) goto Lf0
            r10.setConnectedControllersState(r11)
        Lf0:
            return r0
        Lf1:
            java.lang.String r10 = "binding"
            defpackage.nb3.a0(r10)
            throw r1
        Lf7:
            u41 r11 = (defpackage.u41) r11
            e73 r12 = new e73
            q33 r2 = r10.V0
            if (r2 == 0) goto L114
            rv1 r3 = r10.m1
            r12.<init>(r11, r2, r3)
            r10.W0 = r12
            lz0 r10 = r10.P0
            r10.getClass()
            tp6 r10 = r10.b
            r10.getClass()
            r10.m(r1, r11)
            return r0
        L114:
            java.lang.String r10 = "melonTouchHandler"
            defpackage.nb3.a0(r10)
            throw r1
        L11a:
            java.lang.String r11 = (java.lang.String) r11
            i9 r10 = r10.u1
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r10.a(r11)
            return r0
    }
}
