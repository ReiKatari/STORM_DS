package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv  reason: default package */
/* loaded from: classes.dex */
public final class xv extends ReplacementSpan {
    public final f14 A;
    public final vv B;
    public final boolean L;

    public xv(f14 f14Var, vv vvVar, boolean z) {
        this.A = f14Var;
        this.B = vvVar;
        this.L = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            c47[] c47VarArr = (c47[]) spanned.getSpans(0, spanned.length(), c47.class);
            if (c47VarArr != null && c47VarArr.length > 0) {
                c47 c47Var = c47VarArr[0];
                throw null;
            }
            b57[] b57VarArr = (b57[]) spanned.getSpans(0, spanned.length(), b57.class);
            if (b57VarArr != null && b57VarArr.length > 0) {
                b57 b57Var = b57VarArr[0];
                throw null;
            }
        }
        int width = canvas.getWidth();
        float textSize = paint.getTextSize();
        vv vvVar = this.B;
        vvVar.c = width;
        vvVar.d = textSize;
        if (vvVar.e) {
            if (vvVar.c == 0) {
                vvVar.e = true;
                vvVar.setBounds(new Rect(0, 0, 1, 1));
            } else {
                vvVar.e = false;
                vvVar.b.getClass();
                throw null;
            }
        }
        if (vvVar.a()) {
            int save = canvas.save();
            try {
                canvas.translate(f, i5 - vvVar.getBounds().bottom);
                vvVar.draw(canvas);
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
        vv vvVar = this.B;
        if (vvVar.a()) {
            Rect bounds = vvVar.getBounds();
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
