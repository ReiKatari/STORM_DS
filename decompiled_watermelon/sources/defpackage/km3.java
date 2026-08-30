package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: km3  reason: default package */
/* loaded from: classes.dex */
public final class km3 extends MetricAffectingSpan {
    public final float A;

    public km3(float f) {
        this.A = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A);
    }
}
