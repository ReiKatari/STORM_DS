package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j30  reason: default package */
/* loaded from: classes.dex */
public final class j30 implements LeadingMarginSpan {
    public final /* synthetic */ int A;
    public final cu3 B;
    public final Rect L;
    public final Paint R;

    public j30(cu3 cu3Var, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.L = g94.a;
                this.R = g94.c;
                this.B = cu3Var;
                return;
            default:
                this.L = g94.a;
                this.R = g94.c;
                this.B = cu3Var;
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.A;
        cu3 cu3Var = this.B;
        Paint paint2 = this.R;
        Rect rect = this.L;
        switch (i9) {
            case 0:
                int i10 = cu3Var.b;
                if (i10 == 0) {
                    i10 = (int) ((cu3Var.a * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                cu3Var.getClass();
                int i11 = se.i(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i11);
                int i12 = i2 * i10;
                int i13 = i + i12;
                int i14 = i12 + i13;
                rect.set(Math.min(i13, i14), i3, Math.max(i13, i14), i5);
                canvas.drawRect(rect, paint2);
                return;
            default:
                int i15 = ((i5 - i3) / 2) + i3;
                paint2.set(paint);
                cu3Var.getClass();
                paint2.setColor(se.i(paint2.getColor(), 25));
                paint2.setStyle(Paint.Style.FILL);
                int i16 = cu3Var.f;
                if (i16 >= 0) {
                    paint2.setStrokeWidth(i16);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, i15 - strokeWidth, i8, i15 + strokeWidth);
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
