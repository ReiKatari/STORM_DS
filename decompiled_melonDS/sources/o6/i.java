package o6;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {
    public final EditText A;
    public h B;
    public boolean L = true;

    public i(EditText editText) {
        this.A = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            m6.i a10 = m6.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        EditText editText = this.A;
        if (!editText.isInEditMode() && this.L && m6.i.d() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int c4 = m6.i.a().c();
            if (c4 != 0) {
                if (c4 != 1) {
                    if (c4 != 3) {
                        return;
                    }
                } else {
                    m6.i.a().g(i2, i11 + i2, 0, (Spannable) charSequence);
                    return;
                }
            }
            m6.i a10 = m6.i.a();
            if (this.B == null) {
                this.B = new h(editText);
            }
            a10.h(this.B);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
    }
}
