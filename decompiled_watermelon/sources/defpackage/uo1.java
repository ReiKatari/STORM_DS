package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo1  reason: default package */
/* loaded from: classes.dex */
public final class uo1 extends ko1 implements Runnable {
    public final WeakReference A;
    public final WeakReference B;

    public uo1(TextView textView, vo1 vo1Var) {
        this.A = new WeakReference(textView);
        this.B = new WeakReference(vo1Var);
    }

    @Override // defpackage.ko1
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
                        mo1 a = mo1.a();
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
