package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar2  reason: default package */
/* loaded from: classes.dex */
public final class ar2 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final cu3 A;
    public final Rect B = g94.a;
    public final Paint L = g94.c;
    public final int R;

    public ar2(cu3 cu3Var, int i) {
        this.A = cu3Var;
        this.R = i;
    }

    public final void a(TextPaint textPaint) {
        this.A.getClass();
        textPaint.setFakeBoldText(true);
        int i = this.R;
        float[] fArr = cu3.g;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        String arrays = Arrays.toString(fArr);
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + arrays + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.R;
        if ((i9 == 1 || i9 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.L;
            paint2.set(paint);
            cu3 cu3Var = this.A;
            cu3Var.getClass();
            paint2.setColor(se.i(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i10 = cu3Var.e;
            if (i10 >= 0) {
                paint2.setStrokeWidth(i10);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > RecyclerView.A1) {
                int i11 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.B;
                rect.set(i, i11, i8, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
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
