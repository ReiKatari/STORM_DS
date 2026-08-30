package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vp0  reason: default package */
/* loaded from: classes.dex */
public final class vp0 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final cu3 A;
    public final Rect B = g94.a;
    public final Paint L = g94.c;

    public vp0(cu3 cu3Var) {
        this.A = cu3Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.L;
        paint2.setStyle(style);
        this.A.getClass();
        paint2.setColor(se.i(paint.getColor(), 25));
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
