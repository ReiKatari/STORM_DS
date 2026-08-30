package sb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import pb.f;
import rb.i;
import rb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ReplacementSpan {
    public final f A;
    public final a B;
    public final boolean L;

    public c(f fVar, a aVar, boolean z10) {
        this.A = fVar;
        this.B = aVar;
        this.L = z10;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i10, float f8, int i11, int i12, int i13, Paint paint) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(0, spanned.length(), i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                i iVar = iVarArr[0];
                throw null;
            }
            j[] jVarArr = (j[]) spanned.getSpans(0, spanned.length(), j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                j jVar = jVarArr[0];
                throw null;
            }
        }
        int width = canvas.getWidth();
        float textSize = paint.getTextSize();
        a aVar = this.B;
        aVar.f12857c = width;
        aVar.f12858d = textSize;
        if (aVar.f12859e) {
            if (aVar.f12857c == 0) {
                aVar.f12859e = true;
                aVar.setBounds(new Rect(0, 0, 1, 1));
            } else {
                aVar.f12859e = false;
                aVar.f12856b.getClass();
                throw null;
            }
        }
        if (aVar.a()) {
            int save = canvas.save();
            try {
                canvas.translate(f8, i13 - aVar.getBounds().bottom);
                aVar.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float ascent = (int) ((((i13 - i11) / 2) + i11) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.L) {
            this.A.getClass();
            paint.setUnderlineText(true);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i2, i10, f8, ascent, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a aVar = this.B;
        if (aVar.a()) {
            Rect bounds = aVar.getBounds();
            if (fontMetricsInt != null) {
                int i11 = -bounds.bottom;
                fontMetricsInt.ascent = i11;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i11;
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
        return (int) (paint.measureText(charSequence, i2, i10) + 0.5f);
    }
}
