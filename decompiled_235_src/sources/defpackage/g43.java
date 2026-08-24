package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g43  reason: default package */
/* loaded from: classes.dex */
public final class g43 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i6)) == layout.getLineCount() - 1) {
            ThreadLocal threadLocal = d47.a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float E = mp2.E(layout, lineForOffset, paint) + mp2.D(layout, lineForOffset, paint);
                if (E == RecyclerView.B1) {
                    return;
                }
                canvas.getClass();
                canvas.translate(E, RecyclerView.B1);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
