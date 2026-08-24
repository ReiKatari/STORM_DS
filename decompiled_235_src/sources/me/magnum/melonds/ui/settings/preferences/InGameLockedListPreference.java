package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import androidx.preference.ListPreference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InGameLockedListPreference extends ListPreference {
    public boolean h0;
    public int i0;

    public /* synthetic */ InGameLockedListPreference(Context context, AttributeSet attributeSet, int i, int i2, id1 id1Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.dialogPreferenceStyle : i);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        float f;
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View view = x15Var.a;
        if (this.h0) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
        if (this.h0) {
            if (this.i0 != 0) {
                Toast.makeText(getContext(), this.i0, 0).show();
                return;
            }
            return;
        }
        super.onClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGameLockedListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGameLockedListPreference(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InGameLockedListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        context.getClass();
    }
}
