package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InGameLockedPreference extends Preference {
    public boolean A;
    public int B;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGameLockedPreference(Context context) {
        this(context, null, 2, null);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        float f;
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View view = x15Var.a;
        if (this.A) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        if (this.A) {
            if (this.B != 0) {
                Toast.makeText(getContext(), this.B, 0).show();
                return;
            }
            return;
        }
        super.onClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InGameLockedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ InGameLockedPreference(Context context, AttributeSet attributeSet, int i, id1 id1Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
