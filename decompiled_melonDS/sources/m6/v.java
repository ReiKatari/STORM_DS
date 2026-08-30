package m6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends ReplacementSpan {
    public final u B;
    public TextPaint X;
    public final Paint.FontMetricsInt A = new Paint.FontMetricsInt();
    public short L = -1;
    public float R = 1.0f;

    public v(u uVar) {
        p7.m.l(uVar, "rasterizer cannot be null");
        this.B = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i10, float f8, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i10, CharacterStyle.class);
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
            canvas.drawRect(f8, i11, f8 + this.L, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        i.a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.B;
        b9.e eVar = uVar.f9306b;
        Typeface typeface = paint2.getTypeface();
        paint2.setTypeface((Typeface) eVar.X);
        canvas.drawText((char[]) eVar.L, uVar.f9305a * 2, 2, f8, f10, paint2);
        paint2.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.A;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.B;
        n6.a b10 = uVar.b();
        int a10 = b10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = ((ByteBuffer) b10.R).getShort(a10 + b10.A);
        } else {
            s10 = 0;
        }
        this.R = abs / s10;
        n6.a b11 = uVar.b();
        int a11 = b11.a(14);
        if (a11 != 0) {
            ((ByteBuffer) b11.R).getShort(a11 + b11.A);
        }
        n6.a b12 = uVar.b();
        int a12 = b12.a(12);
        if (a12 != 0) {
            s11 = ((ByteBuffer) b12.R).getShort(a12 + b12.A);
        }
        short s12 = (short) (s11 * this.R);
        this.L = s12;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}
