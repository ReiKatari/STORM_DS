package defpackage;

import android.text.TextPaint;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt2  reason: default package */
/* loaded from: classes.dex */
public final class rt2 extends ii2 {
    public final CharSequence R;
    public final TextPaint X;

    public rt2(CharSequence charSequence, TextPaint textPaint) {
        this.R = charSequence;
        this.X = textPaint;
    }

    @Override // defpackage.ii2
    public final int H(int i) {
        int textRunCursor;
        CharSequence charSequence = this.R;
        textRunCursor = this.X.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // defpackage.ii2
    public final int N(int i) {
        int textRunCursor;
        CharSequence charSequence = this.R;
        textRunCursor = this.X.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
