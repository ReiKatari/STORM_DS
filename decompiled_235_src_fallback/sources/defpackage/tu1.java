package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tu1 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;

    public /* synthetic */ tu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r0.A
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r0.B
            switch(r1) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.O0()
            return
        Ld:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.N()
            return
        L13:
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.O0()
            return
    }
}
