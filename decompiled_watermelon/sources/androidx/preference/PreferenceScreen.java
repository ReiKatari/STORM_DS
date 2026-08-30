package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean Z;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gk2.M(context, R.attr.preferenceScreenStyle, 16842891), 0);
        this.Z = true;
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        is4 is4Var;
        if (getIntent() == null && getFragment() == null && this.B.size() != 0 && (is4Var = getPreferenceManager().j) != null) {
            is4Var.onNavigateToScreen(this);
        }
    }
}
