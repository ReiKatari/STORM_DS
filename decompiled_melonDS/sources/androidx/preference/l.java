package androidx.preference;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ Preference A;

    public l(Preference preference) {
        this.A = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A.performClick(view);
    }
}
