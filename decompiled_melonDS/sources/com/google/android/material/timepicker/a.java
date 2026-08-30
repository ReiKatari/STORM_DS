package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ha.h {
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
        String a10 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a10)) {
            a10 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a10);
    }
}
