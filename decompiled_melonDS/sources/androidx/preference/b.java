package androidx.preference;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ DropDownPreference A;

    public b(DropDownPreference dropDownPreference) {
        this.A = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        if (i2 >= 0) {
            DropDownPreference dropDownPreference = this.A;
            String charSequence = dropDownPreference.f1517b0[i2].toString();
            if (!charSequence.equals(dropDownPreference.f1518c0) && dropDownPreference.callChangeListener(charSequence)) {
                dropDownPreference.f(charSequence);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
