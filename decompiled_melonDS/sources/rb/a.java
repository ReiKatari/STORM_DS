package rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements LeadingMarginSpan {
    public final /* synthetic */ int A;
    public final pb.f B;
    public final Rect L;
    public final Paint R;

    public a(pb.f fVar, int i2) {
        this.A = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.L = g.f12638a;
                this.R = g.f12640c;
                this.B = fVar;
                return;
            default:
                this.L = g.f12638a;
                this.R = g.f12640c;
                this.B = fVar;
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int i16;
        switch (this.A) {
            case 0:
                pb.f fVar = this.B;
                int i17 = fVar.f11543b;
                if (i17 == 0) {
                    i17 = (int) ((fVar.f11542a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.R;
                paint2.set(paint);
                fVar.getClass();
                int c4 = n.c(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(c4);
                int i18 = i10 * i17;
                int i19 = i2 + i18;
                int i20 = i18 + i19;
                int min = Math.min(i19, i20);
                int max = Math.max(i19, i20);
                Rect rect = this.L;
                rect.set(min, i11, max, i13);
                canvas.drawRect(rect, paint2);
                return;
            default:
                int i21 = ((i13 - i11) / 2) + i11;
                Paint paint3 = this.R;
                paint3.set(paint);
                pb.f fVar2 = this.B;
                fVar2.getClass();
                paint3.setColor(n.c(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i22 = fVar2.f11547f;
                if (i22 >= 0) {
                    paint3.setStrokeWidth(i22);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i10 > 0) {
                    i16 = canvas.getWidth();
                } else {
                    i16 = i2;
                    i2 -= canvas.getWidth();
                }
                int i23 = i21 - strokeWidth;
                int i24 = i21 + strokeWidth;
                Rect rect2 = this.L;
                rect2.set(i2, i23, i16, i24);
                canvas.drawRect(rect2, paint3);
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        switch (this.A) {
            case 0:
                return this.B.f11542a;
            default:
                return 0;
        }
    }
}
