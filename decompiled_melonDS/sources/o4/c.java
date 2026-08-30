package o4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import m4.l;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i14)) == layout.getLineCount() - 1) {
            ThreadLocal threadLocal = l.f9232a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float E = r.E(layout, lineForOffset, paint) + r.D(layout, lineForOffset, paint);
                if (E == 0.0f) {
                    return;
                }
                canvas.getClass();
                canvas.translate(E, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
