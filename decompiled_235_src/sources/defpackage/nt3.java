package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt3  reason: default package */
/* loaded from: classes.dex */
public final class nt3 extends MetricAffectingSpan {
    public final float A;

    public nt3(float f) {
        this.A = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.B1) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.B1) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }
}
