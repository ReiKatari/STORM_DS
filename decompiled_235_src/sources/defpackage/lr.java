package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public final class lr {
    public final TextView a;
    public final d51 b;

    public lr(TextView textView) {
        this.a = textView;
        this.b = new d51(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((jw2) this.b.B).s(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, m75.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((jw2) this.b.B).A(z);
    }

    public final void d(boolean z) {
        ((jw2) this.b.B).B(z);
    }
}
