package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bq3  reason: default package */
/* loaded from: classes.dex */
public class bq3 extends ds4 {
    public int t0;
    public CharSequence[] u0;
    public CharSequence[] v0;

    @Override // defpackage.ds4
    public final void m(boolean z) {
        int i;
        if (z && (i = this.t0) >= 0) {
            String charSequence = this.v0[i].toString();
            ListPreference listPreference = (ListPreference) k();
            if (listPreference.callChangeListener(charSequence)) {
                listPreference.h(charSequence);
            }
        }
    }

    @Override // defpackage.ds4
    public final void n(sb sbVar) {
        CharSequence[] charSequenceArr = this.u0;
        int i = this.t0;
        aq3 aq3Var = new aq3(this);
        pb pbVar = (pb) sbVar.L;
        pbVar.q = charSequenceArr;
        pbVar.s = aq3Var;
        pbVar.y = i;
        pbVar.x = true;
        pbVar.g = null;
        pbVar.h = null;
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) k();
            if (listPreference.Z != null && listPreference.c0 != null) {
                this.t0 = listPreference.e(listPreference.d0);
                this.u0 = listPreference.Z;
                this.v0 = listPreference.c0;
                return;
            }
            i.n("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.t0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.u0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.v0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.t0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.u0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.v0);
    }
}
