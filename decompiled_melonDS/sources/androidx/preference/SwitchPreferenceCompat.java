package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a Y;
    public final String Z;

    /* renamed from: b0  reason: collision with root package name */
    public final String f1529b0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.Y = new a(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.m, R.attr.switchPreferenceCompatStyle, 0);
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
        this.f1529b0 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        notifyChanged();
        this.X = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void g(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.Z);
            switchCompat.setTextOff(this.f1529b0);
            switchCompat.setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        g(i0Var.q(R.id.switchWidget));
        f(i0Var.q(16908304));
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
