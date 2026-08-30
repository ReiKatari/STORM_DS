package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12023a;

    /* renamed from: b  reason: collision with root package name */
    public final l.i0 f12024b;

    public u(TextView textView) {
        this.f12023a = textView;
        this.f12024b = new l.i0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((aj.g) this.f12024b.B).C(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f12023a.getContext().obtainStyledAttributes(attributeSet, k.a.f7919i, i2, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        ((aj.g) this.f12024b.B).c0(z10);
    }

    public final void d(boolean z10) {
        ((aj.g) this.f12024b.B).i0(z10);
    }
}
