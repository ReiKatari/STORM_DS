package rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan implements LeadingMarginSpan {
    public final pb.f A;
    public final Rect B = g.f12638a;
    public final Paint L = g.f12640c;

    public c(pb.f fVar) {
        this.A = fVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int i16;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.L;
        paint2.setStyle(style);
        this.A.getClass();
        paint2.setColor(n.c(paint.getColor(), 25));
        if (i10 > 0) {
            i16 = canvas.getWidth();
        } else {
            i2 -= canvas.getWidth();
            i16 = i2;
        }
        Rect rect = this.B;
        rect.set(i2, i11, i16, i13);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.A.f11545d;
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
