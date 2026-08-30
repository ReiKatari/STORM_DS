package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final qn0 Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968765(0x7f0400bd, float:1.7546193E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.gk2.M(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            qn0 r2 = new qn0
            r2.<init>(r3, r1)
            r3.Y = r2
            int[] r2 = defpackage.xx4.b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L26
            java.lang.String r5 = r4.getString(r1)
        L26:
            r3.B = r5
            boolean r5 = r3.A
            if (r5 == 0) goto L2f
            r3.notifyChanged()
        L2f:
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3b
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L3b:
            r3.L = r5
            boolean r5 = r3.A
            if (r5 != 0) goto L44
            r3.notifyChanged()
        L44:
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r1)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.X = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
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
    public final void onBindViewHolder(vs4 vs4Var) {
        super.onBindViewHolder(vs4Var);
        g(vs4Var.q(16908289));
        f(vs4Var.q(16908304));
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
