package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fu1 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ fu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            int r2 = r0.A
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r0.B
            switch(r2) {
                case 0: goto L35;
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L10;
                default: goto L7;
            }
        L7:
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.dismiss()
            r0.finish()
            return
        L10:
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.dismiss()
            r0.finish()
            return
        L19:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.finish()
            return
        L1f:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            mi4 r1 = defpackage.mi4.CONTINUE_OFFLINE
            r0.getClass()
            r1.getClass()
            tu0 r0 = r0.m0
            if (r0 == 0) goto L34
            r0.b0(r1)
        L34:
            return
        L35:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r0 = r0.W()
            mi4 r1 = defpackage.mi4.SYNC_NOW
            r0.getClass()
            r1.getClass()
            tu0 r0 = r0.m0
            if (r0 == 0) goto L4a
            r0.b0(r1)
        L4a:
            return
    }
}
