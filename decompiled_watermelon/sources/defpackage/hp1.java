package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hp1  reason: default package */
/* loaded from: classes.dex */
public final class hp1 extends MetricAffectingSpan {
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
