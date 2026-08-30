package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 2130968765(0x7f0400bd, float:1.7546193E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = p5.b.b(r5, r0, r1)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            androidx.preference.a r2 = new androidx.preference.a
            r3 = 0
            r2.<init>(r4, r3)
            r4.Y = r2
            int[] r2 = androidx.preference.j0.f1572b
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 5
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L27
            java.lang.String r6 = r5.getString(r1)
        L27:
            r4.B = r6
            boolean r6 = r4.A
            if (r6 == 0) goto L30
            r4.notifyChanged()
        L30:
            r6 = 4
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L3c
            r6 = 1
            java.lang.String r6 = r5.getString(r6)
        L3c:
            r4.L = r6
            boolean r6 = r4.A
            if (r6 != 0) goto L45
            r4.notifyChanged()
        L45:
            r6 = 2
            boolean r6 = r5.getBoolean(r6, r1)
            r0 = 3
            boolean r6 = r5.getBoolean(r0, r6)
            r4.X = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void g(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        g(i0Var.q(16908289));
        f(i0Var.q(16908304));
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
