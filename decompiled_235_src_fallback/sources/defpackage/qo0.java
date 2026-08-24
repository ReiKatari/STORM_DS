package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qo0 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;

    public /* synthetic */ qo0(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L23;
                case 1: goto L1d;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Ld;
                case 5: goto L9;
                default: goto L5;
            }
        L5:
            r1.dismiss()
            return
        L9:
            r1.dismiss()
            return
        Ld:
            r1.dismiss()
            return
        L11:
            java.util.List r0 = me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference.B
            r1.dismiss()
            return
        L17:
            java.util.Map r0 = me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.A
            r1.dismiss()
            return
        L1d:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.cancel()
            return
        L23:
            r1.dismiss()
            return
    }
}
