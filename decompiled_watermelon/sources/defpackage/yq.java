package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yq  reason: default package */
/* loaded from: classes.dex */
public final class yq {
    public final TextView a;
    public final t71 b;

    public yq(TextView textView) {
        this.a = textView;
        this.b = new t71(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((l) this.b.B).E(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, by4.i, i, 0);
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
        ((l) this.b.B).R(z);
    }

    public final void d(boolean z) {
        ((l) this.b.B).S(z);
    }
}
