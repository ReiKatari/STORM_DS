package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt1  reason: default package */
/* loaded from: classes.dex */
public final class qt1 extends MetricAffectingSpan {
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
