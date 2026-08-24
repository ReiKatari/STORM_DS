package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js0  reason: default package */
/* loaded from: classes.dex */
public final class js0 extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ js0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                f14 f14Var = (f14) obj;
                f14Var.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                f14Var.getClass();
                textPaint.bgColor = jw2.k(textPaint.getColor(), 25);
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
                ((f14) obj).getClass();
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
