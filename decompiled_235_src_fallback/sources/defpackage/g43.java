package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g43  reason: default package */
/* loaded from: classes.dex */
public final class g43 implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, android.text.Layout r12) {
            r0 = this;
            if (r12 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r0 = r12.getLineForOffset(r9)
            int r3 = r12.getLineCount()
            int r3 = r3 + (-1)
            if (r0 != r3) goto L2d
            java.lang.ThreadLocal r3 = defpackage.d47.a
            int r3 = r12.getEllipsisCount(r0)
            if (r3 <= 0) goto L2d
            float r3 = defpackage.mp2.D(r12, r0, r2)
            float r0 = defpackage.mp2.E(r12, r0, r2)
            float r0 = r0 + r3
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L27
            return
        L27:
            r1.getClass()
            r1.translate(r0, r2)
        L2d:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
