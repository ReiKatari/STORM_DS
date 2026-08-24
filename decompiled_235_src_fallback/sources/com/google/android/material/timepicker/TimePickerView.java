package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int q0 = 0;
    public final com.google.android.material.chip.Chip p0;

    public TimePickerView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            com.google.android.material.timepicker.f r5 = new com.google.android.material.timepicker.f
            r5.<init>()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624029(0x7f0e005d, float:1.8875226E38)
            r4.inflate(r0, r3)
            r4 = 2131427698(0x7f0b0172, float:1.847702E38)
            android.view.View r4 = r3.findViewById(r4)
            com.google.android.material.timepicker.ClockFaceView r4 = (com.google.android.material.timepicker.ClockFaceView) r4
            r4 = 2131427703(0x7f0b0177, float:1.847703E38)
            android.view.View r4 = r3.findViewById(r4)
            com.google.android.material.button.MaterialButtonToggleGroup r4 = (com.google.android.material.button.MaterialButtonToggleGroup) r4
            com.google.android.material.timepicker.e r0 = new com.google.android.material.timepicker.e
            r0.<init>()
            java.util.LinkedHashSet r4 = r4.j0
            r4.add(r0)
            r4 = 2131427708(0x7f0b017c, float:1.847704E38)
            android.view.View r4 = r3.findViewById(r4)
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            r0 = 2131427705(0x7f0b0179, float:1.8477034E38)
            android.view.View r0 = r3.findViewById(r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r3.p0 = r0
            r1 = 2131427699(0x7f0b0173, float:1.8477022E38)
            android.view.View r1 = r3.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.content.Context r3 = r3.getContext()
            com.google.android.material.timepicker.g r2 = new com.google.android.material.timepicker.g
            r2.<init>()
            r1.<init>(r3, r2)
            zw3 r3 = new zw3
            r2 = 1
            r3.<init>(r1, r2)
            r4.setOnTouchListener(r3)
            r0.setOnTouchListener(r3)
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 2131427881(0x7f0b0229, float:1.847739E38)
            r4.setTag(r1, r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setTag(r1, r3)
            r4.setOnClickListener(r5)
            r0.setOnClickListener(r5)
            java.lang.String r3 = "android.view.View"
            r4.setAccessibilityClassName(r3)
            r0.setAccessibilityClassName(r3)
            return
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r1 != r0) goto Le
            if (r2 != 0) goto Le
            com.google.android.material.chip.Chip r0 = r0.p0
            r1 = 8
            r0.sendAccessibilityEvent(r1)
        Le:
            return
    }
}
