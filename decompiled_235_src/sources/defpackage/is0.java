package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is0  reason: default package */
/* loaded from: classes.dex */
public final class is0 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final f14 A;
    public final Rect B = ai4.a;
    public final Paint L = ai4.c;

    public is0(f14 f14Var) {
        this.A = f14Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.L;
        paint2.setStyle(style);
        this.A.getClass();
        paint2.setColor(jw2.k(paint.getColor(), 25));
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            i8 = i;
        }
        Rect rect = this.B;
        rect.set(i, i3, i8, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.A.d;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.A.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.A.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
