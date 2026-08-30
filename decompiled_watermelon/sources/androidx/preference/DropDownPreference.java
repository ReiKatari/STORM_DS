package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter g0;
    public Spinner h0;
    public final gl1 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.i0 = new gl1(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.g0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.Z;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public final void g(CharSequence[] charSequenceArr) {
        this.Z = charSequenceArr;
        ArrayAdapter arrayAdapter = this.g0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.Z;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        int i;
        Spinner spinner = (Spinner) vs4Var.a.findViewById(R.id.spinner);
        this.h0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.g0);
        this.h0.setOnItemSelectedListener(this.i0);
        Spinner spinner2 = this.h0;
        String str = this.d0;
        CharSequence[] charSequenceArr = this.c0;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length - 1;
            while (i >= 0) {
                if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                }
                i--;
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.onBindViewHolder(vs4Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
        this.h0.performClick();
    }
}
