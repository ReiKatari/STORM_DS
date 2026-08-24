package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean Z;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xk2.l(context, R.attr.preferenceScreenStyle, 16842891), 0);
        this.Z = true;
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        k15 k15Var;
        if (getIntent() == null && getFragment() == null && this.B.size() != 0 && (k15Var = getPreferenceManager().j) != null) {
            k15Var.onNavigateToScreen(this);
        }
    }
}
