package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lm3  reason: default package */
/* loaded from: classes.dex */
public final class lm3 extends MetricAffectingSpan {
    public final float A;

    public lm3(float f) {
        this.A = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.A1) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.A1) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }
}
