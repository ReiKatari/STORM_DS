package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc0  reason: default package */
/* loaded from: classes.dex */
public final class wc0 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ wc0(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r3 = r3.Z
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L3f;
                case 2: goto L32;
                case 3: goto L25;
                case 4: goto L18;
                default: goto Lb;
            }
        Lb:
            wc0 r0 = new wc0
            ri7 r3 = (defpackage.ri7) r3
            r2 = 5
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
        L18:
            wc0 r0 = new wc0
            p27 r3 = (defpackage.p27) r3
            r2 = 4
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
        L25:
            wc0 r0 = new wc0
            bn5 r3 = (defpackage.bn5) r3
            r2 = 3
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
        L32:
            wc0 r0 = new wc0
            sz1 r3 = (defpackage.sz1) r3
            r2 = 2
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
        L3f:
            wc0 r0 = new wc0
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            r2 = 1
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
        L4c:
            wc0 r0 = new wc0
            vc0 r3 = (defpackage.vc0) r3
            r2 = 0
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r14.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L144;
                case 1: goto L110;
                case 2: goto Lf0;
                case 3: goto Ld0;
                case 4: goto L66;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            java.lang.String r6 = "CXCP"
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1e
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L1b
            goto L42
        L1b:
            r0 = move-exception
            r14 = r0
            goto L58
        L1e:
            defpackage.i.m(r3)
            goto L65
        L22:
            defpackage.oi2.Y(r15)
            boolean r15 = defpackage.kj2.F(r6)
            if (r15 == 0) goto L30
            java.lang.String r15 = "UseCaseCameraRequestControlImpl#setTorchOnAsync"
            android.util.Log.d(r6, r15)
        L30:
            ri7 r2 = (defpackage.ri7) r2
            ej7 r15 = r2.c     // Catch: java.util.concurrent.CancellationException -> L1b
            sf0 r15 = r15.a()     // Catch: java.util.concurrent.CancellationException -> L1b
            r14.Y = r4     // Catch: java.util.concurrent.CancellationException -> L1b
            java.lang.Object r15 = r15.h(r14)     // Catch: java.util.concurrent.CancellationException -> L1b
            if (r15 != r0) goto L42
            r5 = r0
            goto L65
        L42:
            java.lang.AutoCloseable r15 = (java.lang.AutoCloseable) r15     // Catch: java.util.concurrent.CancellationException -> L1b
            r14 = r15
            vf0 r14 = (defpackage.vf0) r14     // Catch: java.lang.Throwable -> L50
            tu0 r14 = r14.h()     // Catch: java.lang.Throwable -> L50
            defpackage.lb4.p(r15, r5)     // Catch: java.util.concurrent.CancellationException -> L1b
            r5 = r14
            goto L65
        L50:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            defpackage.lb4.p(r15, r14)     // Catch: java.util.concurrent.CancellationException -> L1b
            throw r0     // Catch: java.util.concurrent.CancellationException -> L1b
        L58:
            boolean r15 = defpackage.kj2.F(r6)
            if (r15 == 0) goto L63
            java.lang.String r15 = "Cannot acquire the CameraGraph.Session"
            android.util.Log.d(r6, r15, r14)
        L63:
            tu0 r5 = defpackage.ri7.l
        L65:
            return r5
        L66:
            p27 r2 = (defpackage.p27) r2
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r14.Y
            r7 = 2
            if (r6 == 0) goto L80
            if (r6 == r4) goto L7c
            if (r6 != r7) goto L77
            defpackage.oi2.Y(r15)
            goto Lcd
        L77:
            defpackage.i.m(r3)
            r1 = r5
            goto Lcf
        L7c:
            defpackage.oi2.Y(r15)
            goto L8c
        L80:
            defpackage.oi2.Y(r15)
            r14.Y = r4
            java.lang.Object r15 = r2.s(r14)
            if (r15 != r0) goto L8c
            goto Lcb
        L8c:
            vr4 r15 = defpackage.p27.a(r2)
            if (r15 == 0) goto Lcd
            java.lang.Object r3 = r15.A
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r15.B
            k47 r15 = (defpackage.k47) r15
            long r9 = r15.a
            zx4 r12 = r2.j
            if (r12 == 0) goto Lcd
            r14.Y = r7
            int r15 = r13.length()
            if (r15 != 0) goto Laa
            goto Lb0
        Laa:
            boolean r15 = defpackage.k47.c(r9)
            if (r15 == 0) goto Lb2
        Lb0:
            r14 = r1
            goto Lc5
        Lb2:
            c0 r8 = new c0
            r11 = 0
            r8.<init>(r9, r11, r12, r13)
            l61 r15 = r12.a
            l5 r3 = new l5
            r6 = 24
            r3.<init>(r12, r8, r5, r6)
            java.lang.Object r14 = defpackage.hv.d0(r15, r3, r14)
        Lc5:
            if (r14 != r0) goto Lc8
            goto Lc9
        Lc8:
            r14 = r1
        Lc9:
            if (r14 != r0) goto Lcd
        Lcb:
            r1 = r0
            goto Lcf
        Lcd:
            r2.B = r4
        Lcf:
            return r1
        Ld0:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r14.Y
            if (r6 == 0) goto Le1
            if (r6 != r4) goto Ldc
            defpackage.oi2.Y(r15)
            goto Lef
        Ldc:
            defpackage.i.m(r3)
            r1 = r5
            goto Lef
        Le1:
            defpackage.oi2.Y(r15)
            bn5 r2 = (defpackage.bn5) r2
            r14.Y = r4
            java.lang.Object r14 = defpackage.vm5.e(r2, r14)
            if (r14 != r0) goto Lef
            r1 = r0
        Lef:
            return r1
        Lf0:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L101
            if (r1 != r4) goto Lfc
            defpackage.oi2.Y(r15)
            goto L10f
        Lfc:
            defpackage.i.m(r3)
            r15 = r5
            goto L10f
        L101:
            defpackage.oi2.Y(r15)
            sz1 r2 = (defpackage.sz1) r2
            r14.Y = r4
            java.lang.Object r15 = r2.l0(r14)
            if (r15 != r0) goto L10f
            r15 = r0
        L10f:
            return r15
        L110:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L121
            if (r1 != r4) goto L11c
            defpackage.oi2.Y(r15)
            goto L143
        L11c:
            defpackage.i.m(r3)
            r15 = r5
            goto L143
        L121:
            defpackage.oi2.Y(r15)
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r2
            int r15 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r15 = r2.W()
            r14.Y = r4
            r15.getClass()
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            hz1 r2 = new hz1
            r3 = 11
            r2.<init>(r3, r5, r15)
            java.lang.Object r15 = defpackage.hv.d0(r1, r2, r14)
            if (r15 != r0) goto L143
            r15 = r0
        L143:
            return r15
        L144:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r14.Y
            if (r6 == 0) goto L155
            if (r6 != r4) goto L150
            defpackage.oi2.Y(r15)
            goto L169
        L150:
            defpackage.i.m(r3)
            r1 = r5
            goto L169
        L155:
            defpackage.oi2.Y(r15)
            vc0 r2 = (defpackage.vc0) r2
            r14.Y = r4
            tu0 r15 = r2.l
            java.lang.Object r14 = r15.q(r14)
            if (r14 != r0) goto L165
            goto L166
        L165:
            r14 = r1
        L166:
            if (r14 != r0) goto L169
            r1 = r0
        L169:
            return r1
    }
}
