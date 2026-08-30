package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp0  reason: default package */
/* loaded from: classes.dex */
public final class wp0 extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ wp0(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                cu3 cu3Var = (cu3) obj;
                cu3Var.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                cu3Var.getClass();
                textPaint.bgColor = se.i(textPaint.getColor(), 25);
                return;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((cu3) obj).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                return;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }
}
