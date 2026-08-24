package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx3  reason: default package */
/* loaded from: classes.dex */
public class dx3 extends f15 {
    public int e0;
    public CharSequence[] f0;
    public CharSequence[] g0;

    @Override // defpackage.f15
    public final void k(boolean z) {
        int i;
        if (z && (i = this.e0) >= 0) {
            String charSequence = this.g0[i].toString();
            ListPreference listPreference = (ListPreference) i();
            if (listPreference.callChangeListener(charSequence)) {
                listPreference.h(charSequence);
            }
        }
    }

    @Override // defpackage.f15
    public final void l(zb zbVar) {
        CharSequence[] charSequenceArr = this.f0;
        int i = this.e0;
        cx3 cx3Var = new cx3(this);
        wb wbVar = (wb) zbVar.L;
        wbVar.q = charSequenceArr;
        wbVar.s = cx3Var;
        wbVar.y = i;
        wbVar.x = true;
        wbVar.g = null;
        wbVar.h = null;
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) i();
            if (listPreference.Z != null && listPreference.d0 != null) {
                this.e0 = listPreference.e(listPreference.e0);
                this.f0 = listPreference.Z;
                this.g0 = listPreference.d0;
                return;
            }
            i.m("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.e0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.g0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.e0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.g0);
    }
}
