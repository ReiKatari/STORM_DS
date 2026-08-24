package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io4  reason: default package */
/* loaded from: classes.dex */
public final class io4 implements LeadingMarginSpan {
    public final f14 A;
    public final String B;
    public final Paint L = ai4.c;
    public int R;

    public io4(f14 f14Var, String str) {
        this.A = f14Var;
        this.B = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.L;
            paint2.set(paint);
            f14 f14Var = this.A;
            f14Var.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = f14Var.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.B;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = f14Var.a;
            if (measureText > i10) {
                this.R = measureText;
                i10 = measureText;
            } else {
                this.R = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - measureText;
            } else {
                i8 = (i10 - measureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.R, this.A.a);
    }
}
