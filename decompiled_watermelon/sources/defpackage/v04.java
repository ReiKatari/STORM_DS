package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v04  reason: default package */
/* loaded from: classes.dex */
public class v04 extends ds4 {
    public final HashSet t0 = new HashSet();
    public boolean u0;
    public CharSequence[] v0;
    public CharSequence[] w0;

    @Override // defpackage.ds4
    public final void m(boolean z) {
        if (z && this.u0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) k();
            HashSet hashSet = this.t0;
            if (multiSelectListPreference.callChangeListener(hashSet)) {
                multiSelectListPreference.e(hashSet);
            }
        }
        this.u0 = false;
    }

    @Override // defpackage.ds4
    public final void n(sb sbVar) {
        int length = this.w0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.t0.contains(this.w0[i].toString());
        }
        CharSequence[] charSequenceArr = this.v0;
        u04 u04Var = new u04(this);
        pb pbVar = (pb) sbVar.L;
        pbVar.q = charSequenceArr;
        pbVar.z = u04Var;
        pbVar.v = zArr;
        pbVar.w = true;
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.t0;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) k();
            CharSequence[] charSequenceArr = multiSelectListPreference.Z;
            CharSequence[] charSequenceArr2 = multiSelectListPreference.c0;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                hashSet.clear();
                hashSet.addAll(multiSelectListPreference.d0);
                this.u0 = false;
                this.v0 = multiSelectListPreference.Z;
                this.w0 = charSequenceArr2;
                return;
            }
            i.n("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.u0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.v0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.w0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.t0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.u0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.v0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.w0);
    }
}
