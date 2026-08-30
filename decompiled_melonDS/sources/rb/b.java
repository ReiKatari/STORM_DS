package rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements LeadingMarginSpan {
    public static final boolean Y;
    public final pb.f A;
    public final Paint B = g.f12640c;
    public final RectF L = g.f12639b;
    public final Rect R = g.f12638a;
    public final int X;

    static {
        boolean z10;
        int i2 = Build.VERSION.SDK_INT;
        if (24 != i2 && 25 != i2) {
            z10 = false;
        } else {
            z10 = true;
        }
        Y = z10;
    }

    public b(pb.f fVar, int i2) {
        this.A = fVar;
        this.X = i2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int i16;
        int i17;
        Paint.Style style;
        int i18;
        RectF rectF = this.L;
        Rect rect = this.R;
        if (z10 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i14) {
            Paint paint2 = this.B;
            paint2.set(paint);
            pb.f fVar = this.A;
            fVar.getClass();
            int i19 = fVar.f11542a;
            paint2.setColor(paint2.getColor());
            int i20 = fVar.f11544c;
            if (i20 != 0) {
                paint2.setStrokeWidth(i20);
            }
            int save = canvas.save();
            try {
                int min = Math.min(i19, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i21 = (i19 - min) / 2;
                boolean z11 = Y;
                int i22 = this.X;
                if (z11) {
                    if (i10 < 0) {
                        i18 = i2 - (layout.getWidth() - (i19 * i22));
                    } else {
                        i18 = (i19 * i22) - i2;
                    }
                    int i23 = (i21 * i10) + i2;
                    int i24 = (i10 * min) + i23;
                    int i25 = i10 * i18;
                    i16 = Math.min(i23, i24) + i25;
                    i17 = Math.max(i23, i24) + i25;
                } else {
                    if (i10 <= 0) {
                        i2 -= i19;
                    }
                    i16 = i2 + i21;
                    i17 = i16 + min;
                }
                int descent = (i12 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                int i26 = min + descent;
                if (i22 != 0 && i22 != 1) {
                    rect.set(i16, descent, i17, i26);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                    canvas.restoreToCount(save);
                }
                rectF.set(i16, descent, i17, i26);
                if (i22 == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                paint2.setStyle(style);
                canvas.drawOval(rectF, paint2);
                canvas.restoreToCount(save);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.A.f11542a;
    }
}
