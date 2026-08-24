package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv  reason: default package */
/* loaded from: classes.dex */
public final class xv extends android.text.style.ReplacementSpan {
    public final defpackage.f14 A;
    public final defpackage.vv B;
    public final boolean L;

    public xv(defpackage.f14 r1, defpackage.vv r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r9, java.lang.CharSequence r10, int r11, int r12, float r13, int r14, int r15, int r16, android.graphics.Paint r17) {
            r8 = this;
            r7 = r17
            boolean r0 = r10 instanceof android.text.Spanned
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L35
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r3 = r0.length()
            java.lang.Class<c47> r4 = defpackage.c47.class
            java.lang.Object[] r3 = r0.getSpans(r1, r3, r4)
            c47[] r3 = (defpackage.c47[]) r3
            if (r3 == 0) goto L20
            int r4 = r3.length
            if (r4 > 0) goto L1d
            goto L20
        L1d:
            r8 = r3[r1]
            throw r2
        L20:
            int r3 = r0.length()
            java.lang.Class<b57> r4 = defpackage.b57.class
            java.lang.Object[] r0 = r0.getSpans(r1, r3, r4)
            b57[] r0 = (defpackage.b57[]) r0
            if (r0 == 0) goto L35
            int r3 = r0.length
            if (r3 > 0) goto L32
            goto L35
        L32:
            r8 = r0[r1]
            throw r2
        L35:
            int r0 = r9.getWidth()
            float r3 = r7.getTextSize()
            vv r4 = r8.B
            r4.c = r0
            r4.d = r3
            boolean r0 = r4.e
            r3 = 1
            if (r0 == 0) goto L5f
            int r0 = r4.c
            if (r0 != 0) goto L57
            r4.e = r3
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r1, r3, r3)
            r4.setBounds(r0)
            goto L5f
        L57:
            r4.e = r1
            w31 r8 = r4.b
            r8.getClass()
            throw r2
        L5f:
            boolean r0 = r4.a()
            if (r0 == 0) goto L82
            android.graphics.Rect r8 = r4.getBounds()
            int r8 = r8.bottom
            int r8 = r16 - r8
            int r10 = r9.save()
            float r8 = (float) r8
            r9.translate(r13, r8)     // Catch: java.lang.Throwable -> L7c
            r4.draw(r9)     // Catch: java.lang.Throwable -> L7c
            r9.restoreToCount(r10)
            return
        L7c:
            r0 = move-exception
            r8 = r0
            r9.restoreToCount(r10)
            throw r8
        L82:
            int r0 = r16 - r14
            int r0 = r0 / 2
            int r0 = r0 + r14
            float r14 = (float) r0
            float r0 = r7.descent()
            float r1 = r7.ascent()
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            float r14 = r14 - r1
            int r14 = (int) r14
            float r6 = (float) r14
            boolean r14 = r8.L
            if (r14 == 0) goto Lb2
            f14 r8 = r8.A
            r8.getClass()
            r7.setUnderlineText(r3)
            boolean r8 = r7 instanceof android.text.TextPaint
            if (r8 == 0) goto Lb2
            r8 = r7
            android.text.TextPaint r8 = (android.text.TextPaint) r8
            int r8 = r8.linkColor
            r7.setColor(r8)
        Lb2:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.drawText(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r3, java.lang.CharSequence r4, int r5, int r6, android.graphics.Paint.FontMetricsInt r7) {
            r2 = this;
            vv r0 = r2.B
            boolean r1 = r0.a()
            if (r1 == 0) goto L1d
            android.graphics.Rect r2 = r0.getBounds()
            if (r7 == 0) goto L1a
            int r3 = r2.bottom
            int r3 = -r3
            r7.ascent = r3
            r4 = 0
            r7.descent = r4
            r7.top = r3
            r7.bottom = r4
        L1a:
            int r2 = r2.right
            return r2
        L1d:
            boolean r7 = r2.L
            if (r7 == 0) goto L36
            f14 r2 = r2.A
            r2.getClass()
            r2 = 1
            r3.setUnderlineText(r2)
            boolean r2 = r3 instanceof android.text.TextPaint
            if (r2 == 0) goto L36
            r2 = r3
            android.text.TextPaint r2 = (android.text.TextPaint) r2
            int r2 = r2.linkColor
            r3.setColor(r2)
        L36:
            float r2 = r3.measureText(r4, r5, r6)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            return r2
    }
}
