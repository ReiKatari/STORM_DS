package me.magnum.melonds.ui.settings.fragments;

import android.content.DialogInterface;
import androidx.lifecycle.s0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ b(BasePreferenceFragment basePreferenceFragment, int i2) {
        this.A = i2;
        this.B = basePreferenceFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A) {
            case 0:
                ((AudioPreferencesFragment) this.B).h(true);
                return;
            default:
                gi.e i10 = ((RetroAchievementsPreferencesFragment) this.B).i();
                x.v(s0.h(i10), null, null, new gi.c(i10, null, 1), 3);
                dialogInterface.dismiss();
                return;
        }
    }
}
