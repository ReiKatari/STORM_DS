package rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements LeadingMarginSpan {
    public final pb.f A;
    public final String B;
    public final Paint L = g.f12640c;
    public int R;

    public h(pb.f fVar, String str) {
        this.A = fVar;
        this.B = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int i16;
        if (z10 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i14) {
            Paint paint2 = this.L;
            paint2.set(paint);
            pb.f fVar = this.A;
            fVar.getClass();
            paint2.setColor(paint2.getColor());
            int i17 = fVar.f11544c;
            if (i17 != 0) {
                paint2.setStrokeWidth(i17);
            }
            String str = this.B;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i18 = fVar.f11542a;
            if (measureText > i18) {
                this.R = measureText;
                i18 = measureText;
            } else {
                this.R = 0;
            }
            if (i10 > 0) {
                i16 = ((i18 * i10) + i2) - measureText;
            } else {
                i16 = (i18 - measureText) + (i10 * i18) + i2;
            }
            canvas.drawText(str, i16, i12, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return Math.max(this.R, this.A.f11542a);
    }
}
