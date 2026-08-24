package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i90  reason: default package */
/* loaded from: classes.dex */
public final class i90 implements android.text.style.LeadingMarginSpan {
    public static final boolean Y = false;
    public final defpackage.f14 A;
    public final android.graphics.Paint B;
    public final android.graphics.RectF L;
    public final android.graphics.Rect R;
    public final int X;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r1 == r0) goto Ld
            r1 = 25
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            defpackage.i90.Y = r0
            return
    }

    public i90(defpackage.f14 r2, int r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint r0 = defpackage.ai4.c
            r1.B = r0
            android.graphics.RectF r0 = defpackage.ai4.b
            r1.L = r0
            android.graphics.Rect r0 = defpackage.ai4.a
            r1.R = r0
            r1.A = r2
            r1.X = r3
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r3, android.graphics.Paint r4, int r5, int r6, int r7, int r8, int r9, java.lang.CharSequence r10, int r11, int r12, boolean r13, android.text.Layout r14) {
            r2 = this;
            android.graphics.RectF r7 = r2.L
            android.graphics.Rect r9 = r2.R
            if (r13 == 0) goto Lb8
            boolean r12 = r10 instanceof android.text.Spanned
            if (r12 == 0) goto Lb8
            android.text.Spanned r10 = (android.text.Spanned) r10
            int r10 = r10.getSpanStart(r2)
            if (r10 != r11) goto Lb8
            android.graphics.Paint r10 = r2.B
            r10.set(r4)
            f14 r4 = r2.A
            r4.getClass()
            int r11 = r4.a
            int r12 = r10.getColor()
            r10.setColor(r12)
            int r4 = r4.c
            if (r4 == 0) goto L2d
            float r4 = (float) r4
            r10.setStrokeWidth(r4)
        L2d:
            int r4 = r3.save()
            float r12 = r10.descent()     // Catch: java.lang.Throwable -> L59
            float r13 = r10.ascent()     // Catch: java.lang.Throwable -> L59
            float r12 = r12 - r13
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L59
            int r12 = java.lang.Math.min(r11, r12)     // Catch: java.lang.Throwable -> L59
            int r12 = r12 / 2
            int r0 = r11 - r12
            int r0 = r0 / 2
            boolean r1 = defpackage.i90.Y     // Catch: java.lang.Throwable -> L59
            int r2 = r2.X
            if (r1 == 0) goto L6e
            if (r6 >= 0) goto L5b
            int r14 = r14.getWidth()     // Catch: java.lang.Throwable -> L59
            int r11 = r11 * r2
            int r14 = r14 - r11
            int r11 = r5 - r14
            goto L5d
        L59:
            r2 = move-exception
            goto Lb4
        L5b:
            int r11 = r11 * r2
            int r11 = r11 - r5
        L5d:
            int r0 = r0 * r6
            int r0 = r0 + r5
            int r5 = r6 * r12
            int r5 = r5 + r0
            int r14 = java.lang.Math.min(r0, r5)     // Catch: java.lang.Throwable -> L59
            int r6 = r6 * r11
            int r14 = r14 + r6
            int r5 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + r6
            goto L77
        L6e:
            if (r6 <= 0) goto L73
        L70:
            int r5 = r5 + r0
            r14 = r5
            goto L75
        L73:
            int r5 = r5 - r11
            goto L70
        L75:
            int r5 = r14 + r12
        L77:
            float r6 = r10.descent()     // Catch: java.lang.Throwable -> L59
            float r11 = r10.ascent()     // Catch: java.lang.Throwable -> L59
            float r6 = r6 + r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r11
            float r6 = r6 + r13
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L59
            int r8 = r8 + r6
            int r6 = r12 / 2
            int r8 = r8 - r6
            int r12 = r12 + r8
            if (r2 == 0) goto L9c
            r6 = 1
            if (r2 != r6) goto L90
            goto L9c
        L90:
            r9.set(r14, r8, r5, r12)     // Catch: java.lang.Throwable -> L59
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL     // Catch: java.lang.Throwable -> L59
            r10.setStyle(r2)     // Catch: java.lang.Throwable -> L59
            r3.drawRect(r9, r10)     // Catch: java.lang.Throwable -> L59
            goto Lb0
        L9c:
            float r6 = (float) r14     // Catch: java.lang.Throwable -> L59
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L59
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L59
            float r9 = (float) r12     // Catch: java.lang.Throwable -> L59
            r7.set(r6, r8, r5, r9)     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto La8
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL     // Catch: java.lang.Throwable -> L59
            goto Laa
        La8:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> L59
        Laa:
            r10.setStyle(r2)     // Catch: java.lang.Throwable -> L59
            r3.drawOval(r7, r10)     // Catch: java.lang.Throwable -> L59
        Lb0:
            r3.restoreToCount(r4)
            return
        Lb4:
            r3.restoreToCount(r4)
            throw r2
        Lb8:
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            f14 r0 = r0.A
            int r0 = r0.a
            return r0
    }
}
