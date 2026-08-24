package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh  reason: default package */
/* loaded from: classes.dex */
public final class bh extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.jh Y;
    public final /* synthetic */ me.magnum.melonds.domain.model.ConsoleType Z;

    public bh(defpackage.jh r1, me.magnum.melonds.domain.model.ConsoleType r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            bh r0 = (defpackage.bh) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            bh r3 = new bh
            jh r0 = r1.Y
            me.magnum.melonds.domain.model.ConsoleType r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r5.X
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            r3 = 1
            jh r4 = r5.Y
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L13
            defpackage.oi2.Y(r6)     // Catch: java.lang.Throwable -> L11
            goto L28
        L11:
            r5 = move-exception
            goto L4e
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L1a:
            defpackage.oi2.Y(r6)
            me.magnum.melonds.domain.model.ConsoleType r6 = r5.Z     // Catch: java.lang.Throwable -> L11
            r5.X = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r4.e(r6, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L28
            return r0
        L28:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6     // Catch: java.lang.Throwable -> L11
            defpackage.jh.b(r4, r6)     // Catch: java.lang.Throwable -> L11
            me.magnum.melonds.MelonEmulator$a r5 = r2.a()     // Catch: java.lang.Throwable -> L11
            me.magnum.melonds.MelonEmulator$a r6 = me.magnum.melonds.MelonEmulator.a.SUCCESS     // Catch: java.lang.Throwable -> L11
            if (r5 == r6) goto L43
            g91 r6 = r4.g     // Catch: java.lang.Throwable -> L11
            r6.a()     // Catch: java.lang.Throwable -> L11
            r2.stopEmulation()     // Catch: java.lang.Throwable -> L11
            zc2 r6 = new zc2     // Catch: java.lang.Throwable -> L11
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L11
            return r6
        L43:
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r5 = r4.r     // Catch: java.lang.Throwable -> L11
            r5.c()     // Catch: java.lang.Throwable -> L11
            r2.startEmulation(r3)     // Catch: java.lang.Throwable -> L11
            ad2 r5 = defpackage.ad2.a     // Catch: java.lang.Throwable -> L11
            return r5
        L4e:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L6e
            java.lang.String r6 = "AndroidEmulatorManager"
            java.lang.String r0 = "Failed to load firmware"
            android.util.Log.e(r6, r0, r5)
            g91 r5 = r4.g
            r5.a()
            r2.stopEmulation()
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r5 = r4.r
            r5.d()
            zc2 r5 = new zc2
            me.magnum.melonds.MelonEmulator$a r6 = me.magnum.melonds.MelonEmulator.a.FIRMWARE_BAD
            r5.<init>(r6)
            return r5
        L6e:
            throw r5
    }
}
