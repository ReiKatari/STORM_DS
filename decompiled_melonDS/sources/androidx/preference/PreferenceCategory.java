package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, p5.b.b(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean isEnabled() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            i0Var.f7594a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
        return !super.isEnabled();
    }
}
