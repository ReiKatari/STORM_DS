package o6;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends m6.g implements Runnable {
    public final WeakReference A;
    public final WeakReference B;

    public c(TextView textView, d dVar) {
        this.A = new WeakReference(textView);
        this.B = new WeakReference(dVar);
    }

    @Override // m6.g
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
                        m6.i a10 = m6.i.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a10.getClass();
                            length = text.length();
                        }
                        CharSequence g10 = a10.g(0, length, 0, text);
                        if (text != g10) {
                            int selectionStart = Selection.getSelectionStart(g10);
                            int selectionEnd = Selection.getSelectionEnd(g10);
                            textView.setText(g10);
                            if (g10 instanceof Spannable) {
                                Spannable spannable = (Spannable) g10;
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
