package rb;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends MetricAffectingSpan {
    public final /* synthetic */ int A;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                return;
            default:
                textPaint.setFakeBoldText(true);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                return;
            default:
                textPaint.setFakeBoldText(true);
                return;
        }
    }
}
