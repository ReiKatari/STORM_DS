package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy2  reason: default package */
/* loaded from: classes.dex */
public final class cy2 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i6)) == layout.getLineCount() - 1) {
            ThreadLocal threadLocal = or6.a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float v = hk2.v(layout, lineForOffset, paint) + hk2.u(layout, lineForOffset, paint);
                if (v == RecyclerView.A1) {
                    return;
                }
                canvas.getClass();
                canvas.translate(v, RecyclerView.A1);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
