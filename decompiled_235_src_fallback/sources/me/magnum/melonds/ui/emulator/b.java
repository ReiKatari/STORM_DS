package me.magnum.melonds.ui.emulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity A;

    public b(me.magnum.melonds.ui.emulator.EmulatorActivity r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r4.A
            boolean r1 = r0.isDestroyed()
            r2 = 0
            if (r1 != 0) goto L37
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r1 = r0.e1
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.VULKAN
            if (r1 == r3) goto L10
            goto L37
        L10:
            r0.U0()
            c92 r1 = r0.K0
            if (r1 == 0) goto L1a
            r1.b()
        L1a:
            int r1 = r0.g1
            int r1 = r1 + 1
            r0.g1 = r1
            r3 = 24
            if (r1 >= r3) goto L34
            android.os.Handler r0 = r0.N0
            if (r0 == 0) goto L2e
            r1 = 100
            r0.postDelayed(r4, r1)
            return
        L2e:
            java.lang.String r4 = "handler"
            defpackage.nb3.a0(r4)
            throw r2
        L34:
            r0.f1 = r2
            return
        L37:
            r0.f1 = r2
            return
    }
}
