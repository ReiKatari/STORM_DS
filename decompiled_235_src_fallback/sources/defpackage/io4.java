package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io4  reason: default package */
/* loaded from: classes.dex */
public final class io4 implements android.text.style.LeadingMarginSpan {
    public final defpackage.f14 A;
    public final java.lang.String B;
    public final android.graphics.Paint L;
    public int R;

    public io4(defpackage.f14 r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint r0 = defpackage.ai4.c
            r1.L = r0
            r1.A = r2
            r1.B = r3
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, android.text.Layout r12) {
            r0 = this;
            if (r11 == 0) goto L4b
            boolean r5 = r8 instanceof android.text.Spanned
            if (r5 == 0) goto L4b
            android.text.Spanned r8 = (android.text.Spanned) r8
            int r5 = r8.getSpanStart(r0)
            if (r5 != r9) goto L4b
            android.graphics.Paint r5 = r0.L
            r5.set(r2)
            f14 r2 = r0.A
            r2.getClass()
            int r7 = r5.getColor()
            r5.setColor(r7)
            int r7 = r2.c
            if (r7 == 0) goto L27
            float r7 = (float) r7
            r5.setStrokeWidth(r7)
        L27:
            java.lang.String r7 = r0.B
            float r8 = r5.measureText(r7)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            int r8 = (int) r8
            int r2 = r2.a
            if (r8 <= r2) goto L39
            r0.R = r8
            r2 = r8
            goto L3c
        L39:
            r9 = 0
            r0.R = r9
        L3c:
            if (r4 <= 0) goto L42
            int r2 = r2 * r4
            int r2 = r2 + r3
            int r2 = r2 - r8
            goto L46
        L42:
            int r4 = r4 * r2
            int r4 = r4 + r3
            int r2 = r2 - r8
            int r2 = r2 + r4
        L46:
            float r0 = (float) r2
            float r2 = (float) r6
            r1.drawText(r7, r0, r2, r5)
        L4b:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            int r1 = r0.R
            f14 r0 = r0.A
            int r0 = r0.a
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }
}
