package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {
    public final com.google.android.material.chip.Chip A;
    public final android.widget.EditText B;

    public ChipTextInputComboView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131624027(0x7f0e005b, float:1.8875222E38)
            android.view.View r5 = r4.inflate(r5, r3, r0)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r3.A = r5
            java.lang.String r1 = "android.view.View"
            r5.setAccessibilityClassName(r1)
            r1 = 2131624028(0x7f0e005c, float:1.8875224E38)
            android.view.View r4 = r4.inflate(r1, r3, r0)
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            android.widget.EditText r1 = r4.getEditText()
            r3.B = r1
            r2 = 4
            r1.setVisibility(r2)
            com.google.android.material.timepicker.a r2 = new com.google.android.material.timepicker.a
            r2.<init>(r3)
            r1.addTextChangedListener(r2)
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            r1.setImeHintLocales(r2)
            r3.addView(r5)
            r3.addView(r4)
            r4 = 2131427706(0x7f0b017a, float:1.8477036E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = android.view.View.generateViewId()
            r1.setId(r4)
            int r4 = r1.getId()
            r3.setLabelFor(r4)
            r1.setSaveEnabled(r0)
            r1.setLongClickable(r0)
            return
    }

    public static java.lang.String a(com.google.android.material.timepicker.ChipTextInputComboView r1, java.lang.CharSequence r2) {
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = "%02d"
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.NumberFormatException -> L21
            java.util.Locale r1 = r1.locale     // Catch: java.lang.NumberFormatException -> L21
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L21
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.NumberFormatException -> L21
            java.lang.String r1 = java.lang.String.format(r1, r0, r2)     // Catch: java.lang.NumberFormatException -> L21
            return r1
        L21:
            r1 = 0
            return r1
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r0 = this;
            com.google.android.material.chip.Chip r0 = r0.A
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.os.LocaleList r1 = r1.getLocales()
            android.widget.EditText r0 = r0.B
            r0.setImeHintLocales(r1)
            return
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean r4) {
            r3 = this;
            com.google.android.material.chip.Chip r0 = r3.A
            r0.setChecked(r4)
            r1 = 0
            if (r4 == 0) goto La
            r2 = r1
            goto Lb
        La:
            r2 = 4
        Lb:
            android.widget.EditText r3 = r3.B
            r3.setVisibility(r2)
            if (r4 == 0) goto L14
            r1 = 8
        L14:
            r0.setVisibility(r1)
            boolean r4 = r0.isChecked()
            if (r4 == 0) goto L29
            r3.requestFocus()
            ym6 r4 = new ym6
            r0 = 1
            r4.<init>(r3, r0)
            r3.post(r4)
        L29:
            return
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            com.google.android.material.chip.Chip r0 = r0.A
            r0.setOnClickListener(r1)
            return
    }

    @Override // android.view.View
    public final void setTag(int r1, java.lang.Object r2) {
            r0 = this;
            com.google.android.material.chip.Chip r0 = r0.A
            r0.setTag(r1, r2)
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r0 = this;
            com.google.android.material.chip.Chip r0 = r0.A
            r0.toggle()
            return
    }
}
