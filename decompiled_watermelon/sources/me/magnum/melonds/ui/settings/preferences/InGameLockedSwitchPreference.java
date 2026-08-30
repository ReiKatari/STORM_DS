package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import androidx.preference.SwitchPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class InGameLockedSwitchPreference extends SwitchPreference {
    public boolean d0;
    public int e0;

    public /* synthetic */ InGameLockedSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2, n91 n91Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.switchPreferenceStyle : i);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        float f;
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View view = vs4Var.a;
        if (this.d0) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final void onClick() {
        if (this.d0) {
            if (this.e0 != 0) {
                Toast.makeText(getContext(), this.e0, 0).show();
                return;
            }
            return;
        }
        super.onClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGameLockedSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InGameLockedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGameLockedSwitchPreference(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
