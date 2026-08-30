package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gk2.M(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean isEnabled() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        super.onBindViewHolder(vs4Var);
        if (Build.VERSION.SDK_INT >= 28) {
            vs4Var.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
        return !super.isEnabled();
    }
}
