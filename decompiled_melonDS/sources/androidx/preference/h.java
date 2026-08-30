package androidx.preference;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends u {

    /* renamed from: s0  reason: collision with root package name */
    public int f1561s0;

    /* renamed from: t0  reason: collision with root package name */
    public CharSequence[] f1562t0;

    /* renamed from: u0  reason: collision with root package name */
    public CharSequence[] f1563u0;

    @Override // androidx.preference.u
    public final void m(boolean z10) {
        int i2;
        if (z10 && (i2 = this.f1561s0) >= 0) {
            String charSequence = this.f1563u0[i2].toString();
            ListPreference listPreference = (ListPreference) k();
            if (listPreference.callChangeListener(charSequence)) {
                listPreference.f(charSequence);
            }
        }
    }

    @Override // androidx.preference.u
    public final void n(bk.a aVar) {
        CharSequence[] charSequenceArr = this.f1562t0;
        int i2 = this.f1561s0;
        g gVar = new g(this);
        l.d dVar = (l.d) aVar.L;
        dVar.f8371q = charSequenceArr;
        dVar.f8373s = gVar;
        dVar.f8379y = i2;
        dVar.f8378x = true;
        dVar.f8362g = null;
        dVar.f8363h = null;
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) k();
            CharSequence[] charSequenceArr = listPreference.Z;
            CharSequence[] charSequenceArr2 = listPreference.f1517b0;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                this.f1561s0 = listPreference.e(listPreference.f1518c0);
                this.f1562t0 = listPreference.Z;
                this.f1563u0 = charSequenceArr2;
                return;
            }
            a0.j.p("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.f1561s0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f1562t0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f1563u0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f1561s0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f1562t0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f1563u0);
    }
}
