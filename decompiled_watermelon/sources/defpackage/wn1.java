package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wn1  reason: default package */
/* loaded from: classes.dex */
public class wn1 extends ds4 {
    public EditText t0;
    public CharSequence u0;
    public final es4 v0 = new es4(6, this);
    public long w0 = -1;

    @Override // defpackage.ds4
    public final void l(View view) {
        super.l(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.t0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.t0.setText(this.u0);
            EditText editText2 = this.t0;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) k()).getClass();
            return;
        }
        i.n("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // defpackage.ds4
    public final void m(boolean z) {
        if (z) {
            String obj = this.t0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) k();
            if (editTextPreference.callChangeListener(obj)) {
                editTextPreference.e(obj);
            }
        }
    }

    public final void o() {
        long j = this.w0;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.t0;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.t0.getContext().getSystemService("input_method")).showSoftInput(this.t0, 0)) {
                    this.w0 = -1L;
                    return;
                }
                EditText editText2 = this.t0;
                es4 es4Var = this.v0;
                editText2.removeCallbacks(es4Var);
                this.t0.postDelayed(es4Var, 50L);
                return;
            }
            this.w0 = -1L;
        }
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.u0 = ((EditTextPreference) k()).Z;
        } else {
            this.u0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.ds4, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.u0);
    }
}
