package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ey5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomListActivity B;

    public /* synthetic */ ey5(RomListActivity romListActivity, int i) {
        this.A = i;
        this.B = romListActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        RomListActivity romListActivity = this.B;
        switch (i2) {
            case 0:
                int i3 = RomListActivity.K0;
                romListActivity.startActivity(new Intent(romListActivity, SettingsActivity.class));
                return;
            default:
                romListActivity.F0 = null;
                return;
        }
    }
}
