package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw1  reason: default package */
/* loaded from: classes.dex */
public final class bw1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ java.lang.Object e0;

    public bw1(me.magnum.melonds.ui.emulator.EmulatorActivity r2, int r3, int r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.Y = r3
            r1.d0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public bw1(defpackage.pr3 r2, int r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.e0 = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            p76 r3 = (defpackage.p76) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            bw1 r2 = (defpackage.bw1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            bw1 r2 = (defpackage.bw1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            int r1 = r3.d0
            java.lang.Object r2 = r3.e0
            switch(r0) {
                case 0: goto L13;
                default: goto L9;
            }
        L9:
            bw1 r3 = new bw1
            pr3 r2 = (defpackage.pr3) r2
            r3.<init>(r2, r1, r4)
            r3.Z = r5
            return r3
        L13:
            bw1 r0 = new bw1
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r2
            int r3 = r3.Y
            r0.<init>(r2, r3, r1, r4)
            r0.Z = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            int r1 = r6.d0
            java.lang.Object r2 = r6.e0
            r3 = 0
            switch(r0) {
                case 0: goto L45;
                default: goto La;
            }
        La:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r6.Y
            r5 = 1
            if (r4 == 0) goto L1d
            if (r4 != r5) goto L17
            defpackage.oi2.Y(r7)
            goto L42
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            goto L44
        L1d:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            p76 r7 = (defpackage.p76) r7
            pr3 r2 = (defpackage.pr3) r2
            lr3 r3 = new lr3
            r4 = 0
            r3.<init>(r7, r2, r4)
            vs4 r7 = r2.f
            java.lang.Object r7 = r7.getValue()
            jr3 r7 = (defpackage.jr3) r7
            qh1 r7 = r7.i
            r6.Y = r5
            r2 = 100
            java.lang.Object r6 = defpackage.mp2.i(r3, r1, r2, r7, r6)
            if (r6 != r0) goto L42
            r3 = r0
            goto L44
        L42:
            jg7 r3 = defpackage.jg7.a
        L44:
            return r3
        L45:
            java.lang.Object r0 = r6.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r2
            int r6 = r6.Y
            om2 r7 = r2.S0     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L60
            long r6 = r7.b(r6, r1)     // Catch: java.lang.Throwable -> L66
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L66
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L66
            goto L6c
        L60:
            java.lang.String r6 = "frameRenderCoordinator"
            defpackage.nb3.a0(r6)     // Catch: java.lang.Throwable -> L66
            throw r3     // Catch: java.lang.Throwable -> L66
        L66:
            r6 = move-exception
            em5 r0 = new em5
            r0.<init>(r6)
        L6c:
            java.lang.Long r6 = new java.lang.Long
            r1 = 0
            r6.<init>(r1)
            boolean r7 = r0 instanceof defpackage.em5
            if (r7 == 0) goto L78
            r0 = r6
        L78:
            return r0
    }
}
