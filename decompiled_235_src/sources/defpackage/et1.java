package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et1  reason: default package */
/* loaded from: classes.dex */
public final class et1 implements InputFilter {
    public final TextView a;
    public dt1 b;

    public et1(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L28;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int c = ws1.a().c();
            if (c != 0) {
                if (c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return ws1.a().g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            ws1 a = ws1.a();
            if (this.b == null) {
                this.b = new dt1(textView, this);
            }
            a.h(this.b);
            return charSequence;
        }
        return charSequence;
    }
}
