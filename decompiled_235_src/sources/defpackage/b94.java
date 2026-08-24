package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b94  reason: default package */
/* loaded from: classes.dex */
public class b94 extends f15 {
    public final HashSet e0 = new HashSet();
    public boolean f0;
    public CharSequence[] g0;
    public CharSequence[] h0;

    @Override // defpackage.f15
    public final void k(boolean z) {
        if (z && this.f0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) i();
            HashSet hashSet = this.e0;
            if (multiSelectListPreference.callChangeListener(hashSet)) {
                multiSelectListPreference.e(hashSet);
            }
        }
        this.f0 = false;
    }

    @Override // defpackage.f15
    public final void l(zb zbVar) {
        int length = this.h0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.e0.contains(this.h0[i].toString());
        }
        CharSequence[] charSequenceArr = this.g0;
        a94 a94Var = new a94(this);
        wb wbVar = (wb) zbVar.L;
        wbVar.q = charSequenceArr;
        wbVar.z = a94Var;
        wbVar.v = zArr;
        wbVar.w = true;
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.e0;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) i();
            CharSequence[] charSequenceArr = multiSelectListPreference.Z;
            CharSequence[] charSequenceArr2 = multiSelectListPreference.d0;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                hashSet.clear();
                hashSet.addAll(multiSelectListPreference.e0);
                this.f0 = false;
                this.g0 = multiSelectListPreference.Z;
                this.h0 = charSequenceArr2;
                return;
            }
            i.m("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.g0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.h0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.e0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.g0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.h0);
    }
}
