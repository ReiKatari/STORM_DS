package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class a extends ns6 {
    public final /* synthetic */ ChipTextInputComboView A;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.A = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.A;
        Chip chip = chipTextInputComboView.A;
        if (isEmpty) {
            chip.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a);
    }
}
