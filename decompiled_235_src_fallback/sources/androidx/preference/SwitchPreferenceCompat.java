package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
    public final defpackage.bq0 Y;
    public final java.lang.String Z;
    public final java.lang.String d0;

    public SwitchPreferenceCompat(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 2130969849(0x7f0404f9, float:1.7548391E38)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            bq0 r2 = new bq0
            r3 = 2
            r2.<init>(r4, r3)
            r4.Y = r2
            int[] r2 = defpackage.i75.m
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 7
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L20
            java.lang.String r6 = r5.getString(r1)
        L20:
            r4.B = r6
            boolean r6 = r4.A
            if (r6 == 0) goto L29
            r4.notifyChanged()
        L29:
            r6 = 6
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L35
            r6 = 1
            java.lang.String r6 = r5.getString(r6)
        L35:
            r4.L = r6
            boolean r6 = r4.A
            if (r6 != 0) goto L3e
            r4.notifyChanged()
        L3e:
            r6 = 9
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L4b
            r6 = 3
            java.lang.String r6 = r5.getString(r6)
        L4b:
            r4.Z = r6
            r4.notifyChanged()
            r6 = 8
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L5d
            r6 = 4
            java.lang.String r6 = r5.getString(r6)
        L5d:
            r4.d0 = r6
            r4.notifyChanged()
            r6 = 5
            boolean r0 = r5.getBoolean(r3, r1)
            boolean r6 = r5.getBoolean(r6, r0)
            r4.X = r6
            r5.recycle()
            return
    }

    public final void g(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.SwitchCompat
            if (r0 == 0) goto Lb
            r1 = r4
            androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
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
            androidx.appcompat.widget.SwitchCompat r4 = (androidx.appcompat.widget.SwitchCompat) r4
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
            r0 = 2131427939(0x7f0b0263, float:1.8477508E38)
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
            r0 = 2131427939(0x7f0b0263, float:1.8477508E38)
            android.view.View r0 = r3.findViewById(r0)
            r2.g(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r3 = r3.findViewById(r0)
            r2.f(r3)
            return
    }
}
