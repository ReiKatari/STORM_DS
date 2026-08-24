package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ey5 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.RomListActivity B;

    public /* synthetic */ ey5(me.magnum.melonds.ui.romlist.RomListActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            int r1 = r0.A
            me.magnum.melonds.ui.romlist.RomListActivity r0 = r0.B
            switch(r1) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1 = 0
            r0.F0 = r1
            return
        Lb:
            int r1 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r2 = me.magnum.melonds.ui.settings.SettingsActivity.class
            r1.<init>(r0, r2)
            r0.startActivity(r1)
            return
    }
}
