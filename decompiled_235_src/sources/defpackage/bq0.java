package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq0  reason: default package */
/* loaded from: classes.dex */
public final class bq0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ bq0(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        TwoStatePreference twoStatePreference = this.b;
        switch (i) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) twoStatePreference;
                if (!checkBoxPreference.callChangeListener(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    checkBoxPreference.e(z);
                    return;
                }
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) twoStatePreference;
                if (!switchPreference.callChangeListener(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    switchPreference.e(z);
                    return;
                }
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) twoStatePreference;
                if (!switchPreferenceCompat.callChangeListener(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    switchPreferenceCompat.e(z);
                    return;
                }
        }
    }
}
