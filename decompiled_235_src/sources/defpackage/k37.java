package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k37  reason: default package */
/* loaded from: classes.dex */
public final class k37 implements TextWatcher {
    public int A;
    public final /* synthetic */ EditText B;
    public final /* synthetic */ TextInputLayout L;

    public k37(TextInputLayout textInputLayout, EditText editText) {
        this.L = textInputLayout;
        this.B = editText;
        this.A = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.L;
        textInputLayout.w(!textInputLayout.x1, false);
        if (textInputLayout.k0) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.s0) {
            textInputLayout.x(editable);
        }
        EditText editText = this.B;
        int lineCount = editText.getLineCount();
        int i = this.A;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.q1;
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
