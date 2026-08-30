package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d extends u {

    /* renamed from: s0  reason: collision with root package name */
    public EditText f1535s0;

    /* renamed from: t0  reason: collision with root package name */
    public CharSequence f1536t0;

    /* renamed from: u0  reason: collision with root package name */
    public final w f1537u0 = new w(1, this);

    /* renamed from: v0  reason: collision with root package name */
    public long f1538v0 = -1;

    @Override // androidx.preference.u
    public final void l(View view) {
        super.l(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f1535s0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f1535s0.setText(this.f1536t0);
            EditText editText2 = this.f1535s0;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) k()).getClass();
            return;
        }
        a0.j.p("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.u
    public final void m(boolean z10) {
        if (z10) {
            String obj = this.f1535s0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) k();
            if (editTextPreference.callChangeListener(obj)) {
                editTextPreference.e(obj);
            }
        }
    }

    public final void o() {
        long j2 = this.f1538v0;
        if (j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f1535s0;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.f1535s0.getContext().getSystemService("input_method")).showSoftInput(this.f1535s0, 0)) {
                    this.f1538v0 = -1L;
                    return;
                }
                EditText editText2 = this.f1535s0;
                w wVar = this.f1537u0;
                editText2.removeCallbacks(wVar);
                this.f1535s0.postDelayed(wVar, 50L);
                return;
            }
            this.f1538v0 = -1L;
        }
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f1536t0 = ((EditTextPreference) k()).Z;
        } else {
            this.f1536t0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.u, androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f1536t0);
    }
}
