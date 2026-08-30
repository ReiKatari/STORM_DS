package o6;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f10853a;

    /* renamed from: b  reason: collision with root package name */
    public c f10854b;

    public d(TextView textView) {
        this.f10853a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f10853a;
        if (!textView.isInEditMode()) {
            int c4 = m6.i.a().c();
            if (c4 != 0) {
                if (c4 != 1) {
                    if (c4 != 3) {
                        return charSequence;
                    }
                } else if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                    if (i2 != 0 || i10 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i2, i10);
                    }
                    return m6.i.a().g(0, charSequence.length(), 0, charSequence);
                } else {
                    return charSequence;
                }
            }
            m6.i a10 = m6.i.a();
            if (this.f10854b == null) {
                this.f10854b = new c(textView, this);
            }
            a10.h(this.f10854b);
            return charSequence;
        }
        return charSequence;
    }
}
