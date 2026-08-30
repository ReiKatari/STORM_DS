package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fv  reason: default package */
/* loaded from: classes.dex */
public final class fv extends ReplacementSpan {
    public final cu3 A;
    public final dv B;
    public final boolean L;

    public fv(cu3 cu3Var, dv dvVar, boolean z) {
        this.A = cu3Var;
        this.B = dvVar;
        this.L = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            nr6[] nr6VarArr = (nr6[]) spanned.getSpans(0, spanned.length(), nr6.class);
            if (nr6VarArr != null && nr6VarArr.length > 0) {
                nr6 nr6Var = nr6VarArr[0];
                throw null;
            }
            ms6[] ms6VarArr = (ms6[]) spanned.getSpans(0, spanned.length(), ms6.class);
            if (ms6VarArr != null && ms6VarArr.length > 0) {
                ms6 ms6Var = ms6VarArr[0];
                throw null;
            }
        }
        int width = canvas.getWidth();
        float textSize = paint.getTextSize();
        dv dvVar = this.B;
        dvVar.c = width;
        dvVar.d = textSize;
        if (dvVar.e) {
            if (dvVar.c == 0) {
                dvVar.e = true;
                dvVar.setBounds(new Rect(0, 0, 1, 1));
            } else {
                dvVar.e = false;
                dvVar.b.getClass();
                throw null;
            }
        }
        if (dvVar.a()) {
            int save = canvas.save();
            try {
                canvas.translate(f, i5 - dvVar.getBounds().bottom);
                dvVar.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float ascent = (int) ((((i5 - i3) / 2) + i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.L) {
            this.A.getClass();
            paint.setUnderlineText(true);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i, i2, f, ascent, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        dv dvVar = this.B;
        if (dvVar.a()) {
            Rect bounds = dvVar.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.L) {
            this.A.getClass();
            paint.setUnderlineText(true);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }
}
