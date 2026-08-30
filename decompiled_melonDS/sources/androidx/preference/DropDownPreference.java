package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayAdapter f1514f0;

    /* renamed from: g0  reason: collision with root package name */
    public Spinner f1515g0;

    /* renamed from: h0  reason: collision with root package name */
    public final b f1516h0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f1516h0 = new b(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f1514f0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.Z;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.f1514f0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        int i2;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) i0Var.f7594a.findViewById(R.id.spinner);
        this.f1515g0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1514f0);
        this.f1515g0.setOnItemSelectedListener(this.f1516h0);
        Spinner spinner2 = this.f1515g0;
        String str = this.f1518c0;
        if (str != null && (charSequenceArr = this.f1517b0) != null) {
            i2 = charSequenceArr.length - 1;
            while (i2 >= 0) {
                if (TextUtils.equals(charSequenceArr[i2].toString(), str)) {
                    break;
                }
                i2--;
            }
        }
        i2 = -1;
        spinner2.setSelection(i2);
        super.onBindViewHolder(i0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
        this.f1515g0.performClick();
    }
}
