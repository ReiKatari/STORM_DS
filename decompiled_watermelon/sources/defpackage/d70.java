package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d70  reason: default package */
/* loaded from: classes.dex */
public final class d70 implements LeadingMarginSpan {
    public static final boolean Y;
    public final cu3 A;
    public final Paint B = g94.c;
    public final RectF L = g94.b;
    public final Rect R = g94.a;
    public final int X;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (24 != i && 25 != i) {
            z = false;
        } else {
            z = true;
        }
        Y = z;
    }

    public d70(cu3 cu3Var, int i) {
        this.A = cu3Var;
        this.X = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        Paint.Style style;
        int i10;
        RectF rectF = this.L;
        Rect rect = this.R;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.B;
            paint2.set(paint);
            cu3 cu3Var = this.A;
            cu3Var.getClass();
            int i11 = cu3Var.a;
            paint2.setColor(paint2.getColor());
            int i12 = cu3Var.c;
            if (i12 != 0) {
                paint2.setStrokeWidth(i12);
            }
            int save = canvas.save();
            try {
                int min = Math.min(i11, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i13 = (i11 - min) / 2;
                boolean z2 = Y;
                int i14 = this.X;
                if (z2) {
                    if (i2 < 0) {
                        i10 = i - (layout.getWidth() - (i11 * i14));
                    } else {
                        i10 = (i11 * i14) - i;
                    }
                    int i15 = (i13 * i2) + i;
                    int i16 = (i2 * min) + i15;
                    int i17 = i2 * i10;
                    i8 = Math.min(i15, i16) + i17;
                    i9 = Math.max(i15, i16) + i17;
                } else {
                    if (i2 <= 0) {
                        i -= i11;
                    }
                    i8 = i + i13;
                    i9 = i8 + min;
                }
                int descent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                int i18 = min + descent;
                if (i14 != 0 && i14 != 1) {
                    rect.set(i8, descent, i9, i18);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                    canvas.restoreToCount(save);
                }
                rectF.set(i8, descent, i9, i18);
                if (i14 == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                paint2.setStyle(style);
                canvas.drawOval(rectF, paint2);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.A.a;
    }
}
