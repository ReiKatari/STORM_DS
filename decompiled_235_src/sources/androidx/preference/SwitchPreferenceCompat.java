package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final bq0 Y;
    public final String Z;
    public final String d0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.Y = new bq0(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.m, R.attr.switchPreferenceCompatStyle, 0);
        String string = obtainStyledAttributes.getString(7);
        this.B = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.A) {
            notifyChanged();
        }
        String string2 = obtainStyledAttributes.getString(6);
        this.L = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.A) {
            notifyChanged();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.Z = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        notifyChanged();
        String string4 = obtainStyledAttributes.getString(8);
        this.d0 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        notifyChanged();
        this.X = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void g(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.Z);
            switchCompat.setTextOff(this.d0);
            switchCompat.setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(x15 x15Var) {
        super.onBindViewHolder(x15Var);
        g(x15Var.q(R.id.switchWidget));
        f(x15Var.q(16908304));
    }

    @Override // androidx.preference.Preference
    public final void performClick(View view) {
        super.performClick(view);
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        g(view.findViewById(R.id.switchWidget));
        f(view.findViewById(16908304));
    }
}
