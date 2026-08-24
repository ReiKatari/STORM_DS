package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx2  reason: default package */
/* loaded from: classes.dex */
public final class bx2 extends android.text.style.MetricAffectingSpan implements android.text.style.LeadingMarginSpan {
    public final defpackage.f14 A;
    public final android.graphics.Rect B;
    public final android.graphics.Paint L;
    public final int R;

    public bx2(defpackage.f14 r2, int r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = defpackage.ai4.a
            r1.B = r0
            android.graphics.Paint r0 = defpackage.ai4.c
            r1.L = r0
            r1.A = r2
            r1.R = r3
            return
    }

    public final void a(android.text.TextPaint r4) {
            r3 = this;
            f14 r0 = r3.A
            r0.getClass()
            r0 = 1
            r4.setFakeBoldText(r0)
            r1 = 6
            int r3 = r3.R
            float[] r2 = defpackage.f14.g
            if (r1 < r3) goto L1c
            float r1 = r4.getTextSize()
            int r3 = r3 - r0
            r3 = r2[r3]
            float r1 = r1 * r3
            r4.setTextSize(r1)
            return
        L1c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Supplied heading level: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " is invalid, where configured heading sizes are: `"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = "`"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r2, android.graphics.Paint r3, int r4, int r5, int r6, int r7, int r8, java.lang.CharSequence r9, int r10, int r11, boolean r12, android.text.Layout r13) {
            r1 = this;
            r6 = 1
            int r7 = r1.R
            if (r7 == r6) goto L8
            r6 = 2
            if (r7 != r6) goto L5f
        L8:
            boolean r6 = r9 instanceof android.text.Spanned
            if (r6 == 0) goto L5f
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r6 = r9.getSpanEnd(r1)
            if (r6 != r11) goto L5f
            android.graphics.Paint r6 = r1.L
            r6.set(r3)
            f14 r3 = r1.A
            r3.getClass()
            int r7 = r6.getColor()
            r9 = 75
            int r7 = defpackage.jw2.k(r7, r9)
            r6.setColor(r7)
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r6.setStyle(r7)
            int r3 = r3.e
            if (r3 < 0) goto L38
            float r3 = (float) r3
            r6.setStrokeWidth(r3)
        L38:
            float r3 = r6.getStrokeWidth()
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L5f
            float r7 = (float) r8
            float r7 = r7 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r3
            int r3 = (int) r7
            if (r5 <= 0) goto L4e
            int r5 = r2.getWidth()
            goto L57
        L4e:
            int r5 = r2.getWidth()
            int r5 = r4 - r5
            r0 = r5
            r5 = r4
            r4 = r0
        L57:
            android.graphics.Rect r1 = r1.B
            r1.set(r4, r3, r5, r8)
            r2.drawRect(r1, r6)
        L5f:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint r1) {
            r0 = this;
            r0.a(r1)
            return
    }
}
