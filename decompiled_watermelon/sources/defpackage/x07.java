package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x07  reason: default package */
/* loaded from: classes.dex */
public final class x07 extends ReplacementSpan {
    public final w07 B;
    public TextPaint X;
    public final Paint.FontMetricsInt A = new Paint.FontMetricsInt();
    public short L = -1;
    public float R = 1.0f;

    public x07(w07 w07Var) {
        nl2.C(w07Var, "rasterizer cannot be null");
        this.B = w07Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.X;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.X = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.L, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        mo1.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        w07 w07Var = this.B;
        q9 q9Var = w07Var.b;
        Typeface typeface = paint2.getTypeface();
        paint2.setTypeface((Typeface) q9Var.X);
        canvas.drawText((char[]) q9Var.L, w07Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.A;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        w07 w07Var = this.B;
        wx3 b = w07Var.b();
        int a = b.a(14);
        short s2 = 0;
        if (a != 0) {
            s = ((ByteBuffer) b.R).getShort(a + b.A);
        } else {
            s = 0;
        }
        this.R = abs / s;
        wx3 b2 = w07Var.b();
        int a2 = b2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) b2.R).getShort(a2 + b2.A);
        }
        wx3 b3 = w07Var.b();
        int a3 = b3.a(12);
        if (a3 != 0) {
            s2 = ((ByteBuffer) b3.R).getShort(a3 + b3.A);
        }
        short s3 = (short) (s2 * this.R);
        this.L = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
