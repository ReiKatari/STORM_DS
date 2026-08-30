package rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan implements LeadingMarginSpan {
    public final pb.f A;
    public final Rect B = g.f12638a;
    public final Paint L = g.f12640c;
    public final int R;

    public e(pb.f fVar, int i2) {
        this.A = fVar;
        this.R = i2;
    }

    public final void a(TextPaint textPaint) {
        this.A.getClass();
        textPaint.setFakeBoldText(true);
        int i2 = this.R;
        float[] fArr = pb.f.f11541g;
        if (6 >= i2) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i2 - 1]);
            return;
        }
        Locale locale = Locale.US;
        String arrays = Arrays.toString(fArr);
        throw new IllegalStateException("Supplied heading level: " + i2 + " is invalid, where configured heading sizes are: `" + arrays + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int i16;
        int i17 = this.R;
        if ((i17 == 1 || i17 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i15) {
            Paint paint2 = this.L;
            paint2.set(paint);
            pb.f fVar = this.A;
            fVar.getClass();
            paint2.setColor(n.c(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i18 = fVar.f11546e;
            if (i18 >= 0) {
                paint2.setStrokeWidth(i18);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i19 = (int) ((i13 - strokeWidth) + 0.5f);
                if (i10 > 0) {
                    i16 = canvas.getWidth();
                } else {
                    i16 = i2;
                    i2 -= canvas.getWidth();
                }
                Rect rect = this.B;
                rect.set(i2, i19, i16, i13);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
