package m6;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {
    public final Object A;
    public final AtomicInteger B = new AtomicInteger(0);

    public s(Object obj) {
        this.A = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.A).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        ((TextWatcher) this.A).beforeTextChanged(charSequence, i2, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i10) {
        if (this.B.get() > 0 && (obj instanceof v)) {
            return;
        }
        ((SpanWatcher) this.A).onSpanAdded(spannable, obj, i2, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.B.get() > 0 && (obj instanceof v)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i2 > i10) {
                i2 = 0;
            }
            if (i11 > i12) {
                i13 = i2;
                i14 = 0;
                ((SpanWatcher) this.A).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }
        i13 = i2;
        i14 = i11;
        ((SpanWatcher) this.A).onSpanChanged(spannable, obj, i13, i10, i14, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i10) {
        if (this.B.get() > 0 && (obj instanceof v)) {
            return;
        }
        ((SpanWatcher) this.A).onSpanRemoved(spannable, obj, i2, i10);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        ((TextWatcher) this.A).onTextChanged(charSequence, i2, i10, i11);
    }
}
