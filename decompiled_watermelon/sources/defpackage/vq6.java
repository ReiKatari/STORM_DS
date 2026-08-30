package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vq6  reason: default package */
/* loaded from: classes.dex */
public final class vq6 implements TextWatcher {
    public int A;
    public final /* synthetic */ EditText B;
    public final /* synthetic */ TextInputLayout L;

    public vq6(TextInputLayout textInputLayout, EditText editText) {
        this.L = textInputLayout;
        this.B = editText;
        this.A = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.L;
        textInputLayout.w(!textInputLayout.w1, false);
        if (textInputLayout.j0) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.r0) {
            textInputLayout.x(editable);
        }
        EditText editText = this.B;
        int lineCount = editText.getLineCount();
        int i = this.A;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.p1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.A = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
