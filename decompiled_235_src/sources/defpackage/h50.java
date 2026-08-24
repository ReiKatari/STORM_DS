package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h50  reason: default package */
/* loaded from: classes.dex */
public final class h50 implements LeadingMarginSpan {
    public final /* synthetic */ int A;
    public final f14 B;
    public final Rect L;
    public final Paint R;

    public h50(f14 f14Var, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.L = ai4.a;
                this.R = ai4.c;
                this.B = f14Var;
                return;
            default:
                this.L = ai4.a;
                this.R = ai4.c;
                this.B = f14Var;
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.A;
        f14 f14Var = this.B;
        Paint paint2 = this.R;
        Rect rect = this.L;
        switch (i9) {
            case 0:
                int i10 = f14Var.b;
                if (i10 == 0) {
                    i10 = (int) ((f14Var.a * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                f14Var.getClass();
                int k = jw2.k(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(k);
                int i11 = i2 * i10;
                int i12 = i + i11;
                int i13 = i11 + i12;
                rect.set(Math.min(i12, i13), i3, Math.max(i12, i13), i5);
                canvas.drawRect(rect, paint2);
                return;
            default:
                int i14 = ((i5 - i3) / 2) + i3;
                paint2.set(paint);
                f14Var.getClass();
                paint2.setColor(jw2.k(paint2.getColor(), 25));
                paint2.setStyle(Paint.Style.FILL);
                int i15 = f14Var.f;
                if (i15 >= 0) {
                    paint2.setStrokeWidth(i15);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, i14 - strokeWidth, i8, i14 + strokeWidth);
                canvas.drawRect(rect, paint2);
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.A) {
            case 0:
                return this.B.a;
            default:
                return 0;
        }
    }
}
