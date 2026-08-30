package o4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {
    public final float A;

    public g(float f8) {
        this.A = f8;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i13 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.A);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / i13));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
