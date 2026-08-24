package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ku1 implements android.content.DialogInterface.OnDismissListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ ku1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            int r1 = r0.A
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r0.B
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L15;
                case 2: goto Ld;
                default: goto L7;
            }
        L7:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.finish()
            return
        Ld:
            bt r0 = r0.V1
            ex1 r1 = defpackage.ex1.PAUSE_MENU
            r0.T(r1)
            return
        L15:
            bt r0 = r0.V1
            ex1 r1 = defpackage.ex1.SWITCH_NEW_ROM_DIALOG
            r0.T(r1)
            return
        L1d:
            bt r0 = r0.V1
            ex1 r1 = defpackage.ex1.PAUSE_MENU
            r0.T(r1)
            return
    }
}
