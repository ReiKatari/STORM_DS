package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter h0;
    public Spinner i0;
    public final np1 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.j0 = new np1(this, 0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.h0 = arrayAdapter;
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
        ArrayAdapter arrayAdapter = this.h0;
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
        ArrayAdapter arrayAdapter = this.h0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        int i;
        Spinner spinner = (Spinner) x15Var.a.findViewById(R.id.spinner);
        this.i0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.h0);
        this.i0.setOnItemSelectedListener(this.j0);
        Spinner spinner2 = this.i0;
        String str = this.e0;
        CharSequence[] charSequenceArr = this.d0;
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
        super.onBindViewHolder(x15Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
        this.i0.performClick();
    }
}
