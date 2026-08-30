package bi;

import android.content.DialogInterface;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ j(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        switch (this.A) {
            case 0:
                ((RomListActivity) this.B).C0 = null;
                return;
            default:
                MacAddressPreference macAddressPreference = (MacAddressPreference) this.B;
                oe.z zVar = macAddressPreference.B;
                if (zVar != null) {
                    str = zVar.toString();
                } else {
                    str = null;
                }
                if (macAddressPreference.callChangeListener(str)) {
                    macAddressPreference.persistString(str);
                }
                dialogInterface.dismiss();
                return;
        }
    }
}
