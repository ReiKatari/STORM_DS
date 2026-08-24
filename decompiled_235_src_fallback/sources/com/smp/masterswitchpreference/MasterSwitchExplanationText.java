package com.smp.masterswitchpreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchExplanationText extends androidx.preference.Preference {
    public MasterSwitchExplanationText(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r5) {
            r4 = this;
            r5.getClass()
            super.onBindViewHolder(r5)
            android.view.View r4 = r5.a
            r5 = 0
            r4.setClickable(r5)
            r5 = 2131427617(0x7f0b0121, float:1.8476855E38)
            android.view.View r5 = r4.findViewById(r5)
            r5.getClass()
            android.content.Context r0 = r4.getContext()
            r0.getClass()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1
            r2 = 1099956224(0x41900000, float:18.0)
            float r0 = android.util.TypedValue.applyDimension(r1, r2, r0)
            int r0 = (int) r0
            int r1 = r5.getPaddingLeft()
            int r2 = r5.getPaddingRight()
            int r3 = r5.getPaddingBottom()
            r5.setPadding(r1, r0, r2, r3)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.getClass()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 48
            r0.gravity = r1
            r5.setLayoutParams(r0)
            r5 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.setMaxLines(r5)
            return
    }
}
