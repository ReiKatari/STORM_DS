package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs1  reason: default package */
/* loaded from: classes.dex */
public class fs1 extends f15 {
    public EditText e0;
    public CharSequence f0;
    public final g15 g0 = new g15(this, 6);
    public long h0 = -1;

    @Override // defpackage.f15
    public final void j(View view) {
        super.j(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.e0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.e0.setText(this.f0);
            EditText editText2 = this.e0;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) i()).getClass();
            return;
        }
        i.m("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // defpackage.f15
    public final void k(boolean z) {
        if (z) {
            String obj = this.e0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) i();
            if (editTextPreference.callChangeListener(obj)) {
                editTextPreference.e(obj);
            }
        }
    }

    public final void m() {
        long j = this.h0;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.e0;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.e0.getContext().getSystemService("input_method")).showSoftInput(this.e0, 0)) {
                    this.h0 = -1L;
                    return;
                }
                EditText editText2 = this.e0;
                g15 g15Var = this.g0;
                editText2.removeCallbacks(g15Var);
                this.e0.postDelayed(g15Var, 50L);
                return;
            }
            this.h0 = -1L;
        }
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f0 = ((EditTextPreference) i()).Z;
        } else {
            this.f0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f0);
    }
}
