package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final qn0 Y;
    public final String Z;
    public final String c0;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.Y = new qn0(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xx4.l, i, 0);
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
        this.c0 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        notifyChanged();
        this.X = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void g(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.Z);
            r4.setTextOff(this.c0);
            r4.setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(vs4 vs4Var) {
        super.onBindViewHolder(vs4Var);
        g(vs4Var.q(16908352));
        f(vs4Var.q(16908304));
    }

    @Override // androidx.preference.Preference
    public final void performClick(View view) {
        super.performClick(view);
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        g(view.findViewById(16908352));
        f(view.findViewById(16908304));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gk2.M(context, R.attr.switchPreferenceStyle, 16843629));
    }
}
