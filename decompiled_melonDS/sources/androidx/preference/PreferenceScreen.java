package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean Z;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, p5.b.b(context, R.attr.preferenceScreenStyle, 16842891), 0);
        this.Z = true;
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        a0 a0Var;
        if (getIntent() == null && getFragment() == null && this.B.size() != 0 && (a0Var = getPreferenceManager().f1560j) != null) {
            a0Var.onNavigateToScreen(this);
        }
    }
}
