package o4;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final float B;

    public /* synthetic */ a(int i2, float f8) {
        this.A = i2;
        this.B = f8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.B);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.B);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.B);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.B);
                return;
        }
    }
}
