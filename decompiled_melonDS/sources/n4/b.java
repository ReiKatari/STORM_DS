package n4;

import android.text.TextPaint;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: b0  reason: collision with root package name */
    public final CharSequence f10092b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextPaint f10093c0;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f10092b0 = charSequence;
        this.f10093c0 = textPaint;
    }

    @Override // q8.r
    public final int I(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f10092b0;
        textRunCursor = this.f10093c0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 0);
        return textRunCursor;
    }

    @Override // q8.r
    public final int N(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f10092b0;
        textRunCursor = this.f10093c0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 2);
        return textRunCursor;
    }
}
