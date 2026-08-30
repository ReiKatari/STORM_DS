package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e10  reason: default package */
/* loaded from: classes.dex */
public final class e10 extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final float B;

    public /* synthetic */ e10(int i, float f) {
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
