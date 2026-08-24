package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt1  reason: default package */
/* loaded from: classes.dex */
public final class dt1 extends us1 implements Runnable {
    public final WeakReference A;
    public final WeakReference B;

    public dt1(TextView textView, et1 et1Var) {
        this.A = new WeakReference(textView);
        this.B = new WeakReference(et1Var);
    }

    @Override // defpackage.us1
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.A.get();
        if (textView != null && (handler = textView.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.A.get();
        InputFilter inputFilter = (InputFilter) this.B.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        ws1 a = ws1.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a.getClass();
                            length = text.length();
                        }
                        CharSequence g = a.g(0, length, 0, text);
                        if (text != g) {
                            int selectionStart = Selection.getSelectionStart(g);
                            int selectionEnd = Selection.getSelectionEnd(g);
                            textView.setText(g);
                            if (g instanceof Spannable) {
                                Spannable spannable = (Spannable) g;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
