package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt1  reason: default package */
/* loaded from: classes.dex */
public final class nt1 implements TextWatcher {
    public final EditText A;
    public mt1 B;
    public boolean L = true;

    public nt1(EditText editText) {
        this.A = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ws1 a = ws1.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.g(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.A;
        if (!editText.isInEditMode() && this.L && ws1.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = ws1.a().c();
            if (c != 0) {
                if (c != 1) {
                    if (c != 3) {
                        return;
                    }
                } else {
                    ws1.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                }
            }
            ws1 a = ws1.a();
            if (this.B == null) {
                this.B = new mt1(editText);
            }
            a.h(this.B);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
