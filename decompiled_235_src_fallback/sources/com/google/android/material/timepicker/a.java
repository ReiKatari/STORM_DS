package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends defpackage.c57 {
    public final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView A;

    public a(com.google.android.material.timepicker.ChipTextInputComboView r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            com.google.android.material.timepicker.ChipTextInputComboView r3 = r3.A
            com.google.android.material.chip.Chip r1 = r3.A
            java.lang.String r2 = "00"
            if (r0 == 0) goto L14
            java.lang.String r3 = com.google.android.material.timepicker.ChipTextInputComboView.a(r3, r2)
            r1.setText(r3)
            return
        L14:
            java.lang.String r4 = com.google.android.material.timepicker.ChipTextInputComboView.a(r3, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L22
            java.lang.String r4 = com.google.android.material.timepicker.ChipTextInputComboView.a(r3, r2)
        L22:
            r1.setText(r4)
            return
    }
}
