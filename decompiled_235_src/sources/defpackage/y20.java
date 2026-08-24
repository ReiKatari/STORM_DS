package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y20  reason: default package */
/* loaded from: classes.dex */
public final class y20 extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final float B;

    public /* synthetic */ y20(int i, float f) {
        this.A = i;
        this.B = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.A;
        float f = this.B;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.A;
        float f = this.B;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                return;
        }
    }
}
