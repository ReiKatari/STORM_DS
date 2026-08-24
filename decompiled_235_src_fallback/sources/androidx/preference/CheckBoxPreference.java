package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {
    public final defpackage.bq0 Y;

    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.xk2.l(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            bq0 r2 = new bq0
            r2.<init>(r3, r1)
            r3.Y = r2
            int[] r2 = defpackage.i75.b
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
    }

    public final void g(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.CompoundButton
            if (r0 == 0) goto Lb
            r1 = r4
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
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
            if (r0 == 0) goto L20
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            bq0 r3 = r3.Y
            r4.setOnCheckedChangeListener(r3)
        L20:
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r2) {
            r1 = this;
            super.onBindViewHolder(r2)
            r0 = 16908289(0x1020001, float:2.3877232E-38)
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
            r0 = 16908289(0x1020001, float:2.3877232E-38)
            android.view.View r0 = r3.findViewById(r0)
            r2.g(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r3 = r3.findViewById(r0)
            r2.f(r3)
            return
    }
}
