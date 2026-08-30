package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn0  reason: default package */
/* loaded from: classes.dex */
public final class qn0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ qn0(TwoStatePreference twoStatePreference, int i) {
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
