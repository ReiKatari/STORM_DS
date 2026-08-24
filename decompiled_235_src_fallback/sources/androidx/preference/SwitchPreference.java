package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwitchPreference extends androidx.preference.TwoStatePreference {
    public final defpackage.bq0 Y;
    public final java.lang.String Z;
    public final java.lang.String d0;

    public SwitchPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969850(0x7f0404fa, float:1.7548394E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r2.<init>(r3, r4, r0)
            return
    }

    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r6, r0)
            bq0 r1 = new bq0
            r2 = 1
            r1.<init>(r3, r2)
            r3.Y = r1
            int[] r1 = defpackage.i75.l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r0)
            r5 = 7
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L1d
            java.lang.String r5 = r4.getString(r0)
        L1d:
            r3.B = r5
            boolean r5 = r3.A
            if (r5 == 0) goto L26
            r3.notifyChanged()
        L26:
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L31
            java.lang.String r5 = r4.getString(r2)
        L31:
            r3.L = r5
            boolean r5 = r3.A
            if (r5 != 0) goto L3a
            r3.notifyChanged()
        L3a:
            r5 = 9
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L47
            r5 = 3
            java.lang.String r5 = r4.getString(r5)
        L47:
            r3.Z = r5
            r3.notifyChanged()
            r5 = 8
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L59
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
        L59:
            r3.d0 = r5
            r3.notifyChanged()
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r0)
            r6 = 5
            boolean r5 = r4.getBoolean(r6, r5)
            r3.X = r5
            r4.recycle()
            return
    }

    public final void g(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.Switch
            if (r0 == 0) goto Lb
            r1 = r4
            android.widget.Switch r1 = (android.widget.Switch) r1
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
        Lb:
            boolean r1 = r4 instanceof android.widget.Checkable
            if (r1 == 0) goto L17
            r1 = r4
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            boolean r2 = r3.A
            r1.setChecked(r2)
        L17:
            if (r0 == 0) goto L2a
            android.widget.Switch r4 = (android.widget.Switch) r4
            java.lang.String r0 = r3.Z
            r4.setTextOn(r0)
            java.lang.String r0 = r3.d0
            r4.setTextOff(r0)
            bq0 r3 = r3.Y
            r4.setOnCheckedChangeListener(r3)
        L2a:
            return
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(defpackage.x15 r2) {
            r1 = this;
            super.onBindViewHolder(r2)
            r0 = 16908352(0x1020040, float:2.3877408E-38)
            android.view.View r0 = r2.q(r0)
            r1.g(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r2.q(r0)
            r1.f(r2)
            return
    }

    @Override // androidx.preference.Preference
    public final void performClick(android.view.View r3) {
            r2 = this;
            super.performClick(r3)
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L16
            return
        L16:
            r0 = 16908352(0x1020040, float:2.3877408E-38)
            android.view.View r0 = r3.findViewById(r0)
            r2.g(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r3 = r3.findViewById(r0)
            r2.f(r3)
            return
    }
}
