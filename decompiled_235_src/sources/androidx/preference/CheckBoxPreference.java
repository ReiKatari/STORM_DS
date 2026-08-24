package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final bq0 Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int l = xk2.l(context, R.attr.checkBoxPreferenceStyle, 16842895);
        this.Y = new bq0(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.b, l, 0);
        String string = obtainStyledAttributes.getString(5);
        this.B = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.A) {
            notifyChanged();
        }
        String string2 = obtainStyledAttributes.getString(4);
        this.L = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.A) {
            notifyChanged();
        }
        this.X = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void g(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        super.onBindViewHolder(x15Var);
        g(x15Var.q(16908289));
        f(x15Var.q(16908304));
    }

    @Override // androidx.preference.Preference
    public final void performClick(View view) {
        super.performClick(view);
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        g(view.findViewById(16908289));
        f(view.findViewById(16908304));
    }
}
