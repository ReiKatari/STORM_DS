package defpackage;

import android.text.TextPaint;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mn2  reason: default package */
/* loaded from: classes.dex */
public final class mn2 extends ln2 {
    public final CharSequence L;
    public final TextPaint R;

    public mn2(CharSequence charSequence, TextPaint textPaint) {
        this.L = charSequence;
        this.R = textPaint;
    }

    @Override // defpackage.ln2
    public final int K(int i) {
        int textRunCursor;
        CharSequence charSequence = this.L;
        textRunCursor = this.R.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // defpackage.ln2
    public final int O(int i) {
        int textRunCursor;
        CharSequence charSequence = this.L;
        textRunCursor = this.R.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
