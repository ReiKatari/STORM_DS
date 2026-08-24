package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is0  reason: default package */
/* loaded from: classes.dex */
public final class is0 extends android.text.style.MetricAffectingSpan implements android.text.style.LeadingMarginSpan {
    public final defpackage.f14 A;
    public final android.graphics.Rect B;
    public final android.graphics.Paint L;

    public is0(defpackage.f14 r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = defpackage.ai4.a
            r1.B = r0
            android.graphics.Paint r0 = defpackage.ai4.c
            r1.L = r0
            r1.A = r2
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r2, android.graphics.Paint r3, int r4, int r5, int r6, int r7, int r8, java.lang.CharSequence r9, int r10, int r11, boolean r12, android.text.Layout r13) {
            r1 = this;
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            android.graphics.Paint r9 = r1.L
            r9.setStyle(r7)
            f14 r7 = r1.A
            r7.getClass()
            int r3 = r3.getColor()
            r7 = 25
            int r3 = defpackage.jw2.k(r3, r7)
            r9.setColor(r3)
            if (r5 <= 0) goto L20
            int r3 = r2.getWidth()
            goto L29
        L20:
            int r3 = r2.getWidth()
            int r3 = r4 - r3
            r0 = r4
            r4 = r3
            r3 = r0
        L29:
            android.graphics.Rect r1 = r1.B
            r1.set(r4, r6, r3, r8)
            r2.drawRect(r1, r9)
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            f14 r0 = r0.A
            int r0 = r0.d
            return r0
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            f14 r1 = r1.A
            r1.getClass()
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r2.setTypeface(r1)
            float r1 = r2.getTextSize()
            r0 = 1063172178(0x3f5eb852, float:0.87)
            float r1 = r1 * r0
            r2.setTextSize(r1)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r2) {
            r1 = this;
            f14 r1 = r1.A
            r1.getClass()
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r2.setTypeface(r1)
            float r1 = r2.getTextSize()
            r0 = 1063172178(0x3f5eb852, float:0.87)
            float r1 = r1 * r0
            r2.setTextSize(r1)
            return
    }
}
