package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: se7  reason: default package */
/* loaded from: classes.dex */
public final class se7 extends android.text.style.ReplacementSpan {
    public final android.graphics.Paint.FontMetricsInt A;
    public final defpackage.re7 B;
    public short L;
    public float R;
    public android.text.TextPaint X;

    public se7(defpackage.re7 r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.A = r0
            r0 = -1
            r1.L = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.R = r0
            java.lang.String r0 = "rasterizer cannot be null"
            defpackage.np2.x(r2, r0)
            r1.B = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r27
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4e
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r21
            r6 = r22
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L46
            int r3 = r1.length
            r5 = 0
            r6 = 1
            if (r3 != r6) goto L26
            r3 = r1[r5]
            if (r3 != r0) goto L26
            goto L46
        L26:
            android.text.TextPaint r3 = r0.X
            if (r3 != 0) goto L31
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.X = r3
        L31:
            r4 = r3
            r4.set(r2)
        L35:
            int r3 = r1.length
            if (r5 >= r3) goto L44
            r3 = r1[r5]
            boolean r6 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r6 != 0) goto L41
            r3.updateDrawState(r4)
        L41:
            int r5 = r5 + 1
            goto L35
        L44:
            r10 = r4
            goto L56
        L46:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L44
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L44
        L4e:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L44
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L44
        L56:
            if (r10 == 0) goto L86
            int r1 = r10.bgColor
            if (r1 == 0) goto L86
            short r1 = r0.L
            float r1 = (float) r1
            float r8 = r23 + r1
            r1 = r24
            float r7 = (float) r1
            r1 = r26
            float r9 = (float) r1
            int r1 = r10.getColor()
            android.graphics.Paint$Style r3 = r10.getStyle()
            int r4 = r10.bgColor
            r10.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            r5 = r19
            r6 = r23
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r3)
            r10.setColor(r1)
        L86:
            ws1 r1 = defpackage.ws1.a()
            r1.getClass()
            r1 = r25
            float r1 = (float) r1
            if (r10 == 0) goto L93
            goto L94
        L93:
            r10 = r2
        L94:
            re7 r0 = r0.B
            eb r2 = r0.b
            java.lang.Object r3 = r2.X
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            android.graphics.Typeface r4 = r10.getTypeface()
            r10.setTypeface(r3)
            int r0 = r0.a
            int r13 = r0 * 2
            java.lang.Object r0 = r2.L
            r12 = r0
            char[] r12 = (char[]) r12
            r14 = 2
            r11 = r19
            r15 = r23
            r16 = r1
            r17 = r10
            r11.drawText(r12, r13, r14, r15, r16, r17)
            r10.setTypeface(r4)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            android.graphics.Paint$FontMetricsInt r6 = r4.A
            r5.getFontMetricsInt(r6)
            int r5 = r6.descent
            int r7 = r6.ascent
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r7
            re7 r7 = r4.B
            p54 r8 = r7.b()
            r0 = 14
            int r1 = r8.a(r0)
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r8.R
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r8 = r8.A
            int r1 = r1 + r8
            short r8 = r3.getShort(r1)
            goto L2e
        L2d:
            r8 = r2
        L2e:
            float r8 = (float) r8
            float r5 = r5 / r8
            r4.R = r5
            p54 r5 = r7.b()
            int r8 = r5.a(r0)
            if (r8 == 0) goto L46
            java.lang.Object r0 = r5.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r5 = r5.A
            int r8 = r8 + r5
            r0.getShort(r8)
        L46:
            p54 r5 = r7.b()
            r7 = 12
            int r7 = r5.a(r7)
            if (r7 == 0) goto L5d
            java.lang.Object r8 = r5.R
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r5 = r5.A
            int r7 = r7 + r5
            short r2 = r8.getShort(r7)
        L5d:
            float r5 = (float) r2
            float r7 = r4.R
            float r5 = r5 * r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.L = r5
            if (r9 == 0) goto L77
            int r4 = r6.ascent
            r9.ascent = r4
            int r4 = r6.descent
            r9.descent = r4
            int r4 = r6.top
            r9.top = r4
            int r4 = r6.bottom
            r9.bottom = r4
        L77:
            return r5
    }
}
