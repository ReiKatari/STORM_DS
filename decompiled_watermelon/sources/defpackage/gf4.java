package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gf4  reason: default package */
/* loaded from: classes.dex */
public final class gf4 implements LeadingMarginSpan {
    public final cu3 A;
    public final String B;
    public final Paint L = g94.c;
    public int R;

    public gf4(cu3 cu3Var, String str) {
        this.A = cu3Var;
        this.B = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.L;
            paint2.set(paint);
            cu3 cu3Var = this.A;
            cu3Var.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = cu3Var.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.B;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = cu3Var.a;
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
