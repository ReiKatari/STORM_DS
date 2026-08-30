package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pn5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomListActivity B;

    public /* synthetic */ pn5(RomListActivity romListActivity, int i) {
        this.A = i;
        this.B = romListActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        RomListActivity romListActivity = this.B;
        switch (i2) {
            case 0:
                int i3 = RomListActivity.J0;
                romListActivity.startActivity(new Intent(romListActivity, SettingsActivity.class));
                return;
            default:
                romListActivity.E0 = null;
                return;
        }
    }
}
