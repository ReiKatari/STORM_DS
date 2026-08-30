package androidx.preference;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class k extends u {

    /* renamed from: s0  reason: collision with root package name */
    public final HashSet f1583s0 = new HashSet();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1584t0;

    /* renamed from: u0  reason: collision with root package name */
    public CharSequence[] f1585u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence[] f1586v0;

    @Override // androidx.preference.u
    public final void m(boolean z10) {
        if (z10 && this.f1584t0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) k();
            HashSet hashSet = this.f1583s0;
            if (multiSelectListPreference.callChangeListener(hashSet)) {
                multiSelectListPreference.e(hashSet);
            }
        }
        this.f1584t0 = false;
    }

    @Override // androidx.preference.u
    public final void n(bk.a aVar) {
        int length = this.f1586v0.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f1583s0.contains(this.f1586v0[i2].toString());
        }
        CharSequence[] charSequenceArr = this.f1585u0;
        j jVar = new j(this);
        l.d dVar = (l.d) aVar.L;
        dVar.f8371q = charSequenceArr;
        dVar.f8380z = jVar;
        dVar.f8376v = zArr;
        dVar.f8377w = true;
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f1583s0;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) k();
            CharSequence[] charSequenceArr = multiSelectListPreference.Z;
            CharSequence[] charSequenceArr2 = multiSelectListPreference.f1521b0;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                hashSet.clear();
                hashSet.addAll(multiSelectListPreference.f1522c0);
                this.f1584t0 = false;
                this.f1585u0 = multiSelectListPreference.Z;
                this.f1586v0 = charSequenceArr2;
                return;
            }
            a0.j.p("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f1584t0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f1585u0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f1586v0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f1583s0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f1584t0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f1585u0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f1586v0);
    }
}
