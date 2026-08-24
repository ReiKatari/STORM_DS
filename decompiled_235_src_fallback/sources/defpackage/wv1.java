package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv1  reason: default package */
/* loaded from: classes.dex */
public final class wv1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity Z;

    public /* synthetic */ wv1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
                case 0: goto L4d;
                case 1: goto L42;
                case 2: goto L37;
                case 3: goto L2c;
                case 4: goto L21;
                case 5: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L42:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L4d:
            r41 r2 = r2.q(r4, r3)
            wv1 r2 = (defpackage.wv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = r1.Z
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2a;
                case 2: goto L23;
                case 3: goto L1c;
                case 4: goto L15;
                case 5: goto Le;
                default: goto L7;
            }
        L7:
            wv1 r3 = new wv1
            r0 = 6
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            wv1 r3 = new wv1
            r0 = 5
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            wv1 r3 = new wv1
            r0 = 4
            r3.<init>(r1, r2, r0)
            return r3
        L1c:
            wv1 r3 = new wv1
            r0 = 3
            r3.<init>(r1, r2, r0)
            return r3
        L23:
            wv1 r3 = new wv1
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L2a:
            wv1 r3 = new wv1
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L31:
            wv1 r3 = new wv1
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            r1 = 2
            r2 = 4
            jg7 r3 = defpackage.jg7.a
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r8.Z
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L124;
                case 1: goto Lfc;
                case 2: goto Lbd;
                case 3: goto L96;
                case 4: goto L63;
                case 5: goto L3c;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L1d
            if (r1 != r6) goto L18
            goto L1d
        L18:
            defpackage.i.m(r5)
            r3 = r7
            goto L3b
        L1d:
            defpackage.oi2.Y(r9)
        L20:
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            vr4 r9 = r4.l0()
            java.lang.Object r9 = r9.A
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L3b
            r8.Y = r6
            r1 = 50
            java.lang.Object r9 = defpackage.q60.t(r1, r8)
            if (r9 != r0) goto L20
            r3 = r0
        L3b:
            return r3
        L3c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L4d
            if (r1 != r6) goto L48
            defpackage.oi2.Y(r9)
            goto L62
        L48:
            defpackage.i.m(r5)
            r3 = r7
            goto L62
        L4d:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r1 = defpackage.tt3.CREATED
            wv1 r5 = new wv1
            r5.<init>(r4, r7, r2)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r1, r5, r8)
            if (r8 != r0) goto L62
            r3 = r0
        L62:
            return r3
        L63:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L74
            if (r1 != r6) goto L6f
            defpackage.oi2.Y(r9)
            goto L8f
        L6f:
            defpackage.i.m(r5)
            r3 = r7
            goto L8f
        L74:
            defpackage.oi2.Y(r9)
            at r9 = r4.H0
            if (r9 == 0) goto L90
            of6 r9 = r9.a
            sv1 r1 = new sv1
            r2 = 5
            r1.<init>(r4, r2)
            r8.Y = r6
            r9.getClass()
            x61 r8 = defpackage.of6.m(r9, r1, r8)
            if (r8 != r0) goto L8f
            r3 = r0
        L8f:
            return r3
        L90:
            java.lang.String r8 = "appForegroundStateObserver"
            defpackage.nb3.a0(r8)
            throw r7
        L96:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.Y
            if (r2 == 0) goto La7
            if (r2 != r6) goto La2
            defpackage.oi2.Y(r9)
            goto Lbc
        La2:
            defpackage.i.m(r5)
            r3 = r7
            goto Lbc
        La7:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r2 = defpackage.tt3.STARTED
            wv1 r5 = new wv1
            r5.<init>(r4, r7, r1)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r2, r5, r8)
            if (r8 != r0) goto Lbc
            r3 = r0
        Lbc:
            return r3
        Lbd:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto Lce
            if (r1 != r6) goto Lc9
            defpackage.oi2.Y(r9)
            goto Lfb
        Lc9:
            defpackage.i.m(r5)
            r3 = r7
            goto Lfb
        Lce:
            defpackage.oi2.Y(r9)
            qt7 r9 = defpackage.rt7.c0
            r9.getClass()
            j97 r9 = defpackage.qt7.a(r4)
            vy5 r1 = new vy5
            r5 = 19
            r1.<init>(r9, r4, r7, r5)
            pb0 r9 = defpackage.f04.p(r1)
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            le2 r9 = defpackage.f04.E(r9, r1)
            sv1 r1 = new sv1
            r1.<init>(r4, r2)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto Lfb
            r3 = r0
        Lfb:
            return r3
        Lfc:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L10d
            if (r1 != r6) goto L108
            defpackage.oi2.Y(r9)
            goto L123
        L108:
            defpackage.i.m(r5)
            r3 = r7
            goto L123
        L10d:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r1 = defpackage.tt3.CREATED
            wv1 r2 = new wv1
            r5 = 0
            r2.<init>(r4, r7, r5)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r1, r2, r8)
            if (r8 != r0) goto L123
            r3 = r0
        L123:
            return r3
        L124:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.Y
            if (r2 == 0) goto L135
            if (r2 != r6) goto L130
            defpackage.oi2.Y(r9)
            goto L14e
        L130:
            defpackage.i.m(r5)
            r3 = r7
            goto L14e
        L135:
            defpackage.oi2.Y(r9)
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r9 = r4.W()
            de5 r9 = r9.q0
            xd1 r2 = new xd1
            r2.<init>(r4, r7, r1)
            r8.Y = r6
            java.lang.Object r8 = defpackage.f04.v(r9, r2, r8)
            if (r8 != r0) goto L14e
            r3 = r0
        L14e:
            return r3
    }
}
