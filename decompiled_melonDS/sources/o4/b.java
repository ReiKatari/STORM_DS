package o4;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ b(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.B);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                textPaint.setTypeface((Typeface) this.B);
                return;
            default:
                pb.f fVar = (pb.f) this.B;
                fVar.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                fVar.getClass();
                textPaint.bgColor = n.c(textPaint.getColor(), 25);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.B);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                textPaint.setTypeface((Typeface) this.B);
                return;
            default:
                ((pb.f) this.B).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                return;
        }
    }
}
