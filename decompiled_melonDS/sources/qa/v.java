package qa;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements TextWatcher {
    public int A;
    public final /* synthetic */ EditText B;
    public final /* synthetic */ TextInputLayout L;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.L = textInputLayout;
        this.B = editText;
        this.A = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.L;
        textInputLayout.w(!textInputLayout.f3145v1, false);
        if (textInputLayout.f3119i0) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f3134q0) {
            textInputLayout.x(editable);
        }
        EditText editText = this.B;
        int lineCount = editText.getLineCount();
        int i2 = this.A;
        if (lineCount != i2) {
            if (lineCount < i2) {
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.f3132o1;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.A = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
    }
}
