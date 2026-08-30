package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a Y;
    public final String Z;

    /* renamed from: b0  reason: collision with root package name */
    public final String f1528b0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 2130969844(0x7f0404f4, float:1.7548381E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = p5.b.b(r5, r0, r1)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            androidx.preference.a r2 = new androidx.preference.a
            r3 = 1
            r2.<init>(r4, r3)
            r4.Y = r2
            int[] r2 = androidx.preference.j0.f1582l
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 7
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L27
            java.lang.String r6 = r5.getString(r1)
        L27:
            r4.B = r6
            boolean r6 = r4.A
            if (r6 == 0) goto L30
            r4.notifyChanged()
        L30:
            r6 = 6
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
            r6 = 9
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L52
            r6 = 3
            java.lang.String r6 = r5.getString(r6)
        L52:
            r4.Z = r6
            r4.notifyChanged()
            r6 = 8
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L64
            r6 = 4
            java.lang.String r6 = r5.getString(r6)
        L64:
            r4.f1528b0 = r6
            r4.notifyChanged()
            r6 = 2
            boolean r6 = r5.getBoolean(r6, r1)
            r0 = 5
            boolean r6 = r5.getBoolean(r0, r6)
            r4.X = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void g(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.Z);
            r42.setTextOff(this.f1528b0);
            r42.setOnCheckedChangeListener(this.Y);
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        g(i0Var.q(16908352));
        f(i0Var.q(16908304));
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
}
