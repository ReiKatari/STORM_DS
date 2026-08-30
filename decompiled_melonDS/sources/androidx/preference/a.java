package androidx.preference;

import android.widget.CompoundButton;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f1531b;

    public /* synthetic */ a(TwoStatePreference twoStatePreference, int i2) {
        this.f1530a = i2;
        this.f1531b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f1530a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f1531b;
                if (!checkBoxPreference.callChangeListener(Boolean.valueOf(z10))) {
                    compoundButton.setChecked(!z10);
                    return;
                } else {
                    checkBoxPreference.e(z10);
                    return;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                SwitchPreference switchPreference = (SwitchPreference) this.f1531b;
                if (!switchPreference.callChangeListener(Boolean.valueOf(z10))) {
                    compoundButton.setChecked(!z10);
                    return;
                } else {
                    switchPreference.e(z10);
                    return;
                }
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f1531b;
                if (!switchPreferenceCompat.callChangeListener(Boolean.valueOf(z10))) {
                    compoundButton.setChecked(!z10);
                    return;
                } else {
                    switchPreferenceCompat.e(z10);
                    return;
                }
        }
    }
}
