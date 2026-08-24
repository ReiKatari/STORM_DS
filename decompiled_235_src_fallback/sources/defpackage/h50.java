package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h50  reason: default package */
/* loaded from: classes.dex */
public final class h50 implements android.text.style.LeadingMarginSpan {
    public final /* synthetic */ int A;
    public final defpackage.f14 B;
    public final android.graphics.Rect L;
    public final android.graphics.Paint R;

    public h50(defpackage.f14 r1, int r2) {
            r0 = this;
            r0.A = r2
            switch(r2) {
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            r0.<init>()
            android.graphics.Rect r2 = defpackage.ai4.a
            r0.L = r2
            android.graphics.Paint r2 = defpackage.ai4.c
            r0.R = r2
            r0.B = r1
            return
        L13:
            r0.<init>()
            android.graphics.Rect r2 = defpackage.ai4.a
            r0.L = r2
            android.graphics.Paint r2 = defpackage.ai4.c
            r0.R = r2
            r0.B = r1
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas r2, android.graphics.Paint r3, int r4, int r5, int r6, int r7, int r8, java.lang.CharSequence r9, int r10, int r11, boolean r12, android.text.Layout r13) {
            r1 = this;
            int r7 = r1.A
            r9 = 25
            f14 r10 = r1.B
            android.graphics.Paint r11 = r1.R
            r12 = 1056964608(0x3f000000, float:0.5)
            android.graphics.Rect r1 = r1.L
            switch(r7) {
                case 0: goto L57;
                default: goto Lf;
            }
        Lf:
            int r8 = r8 - r6
            int r8 = r8 / 2
            int r8 = r8 + r6
            r11.set(r3)
            r10.getClass()
            int r3 = r11.getColor()
            int r3 = defpackage.jw2.k(r3, r9)
            r11.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r11.setStyle(r3)
            int r3 = r10.f
            if (r3 < 0) goto L31
            float r3 = (float) r3
            r11.setStrokeWidth(r3)
        L31:
            float r3 = r11.getStrokeWidth()
            float r3 = r3 + r12
            int r3 = (int) r3
            float r3 = (float) r3
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            float r3 = r3 + r12
            int r3 = (int) r3
            if (r5 <= 0) goto L44
            int r5 = r2.getWidth()
            goto L4d
        L44:
            int r5 = r2.getWidth()
            int r5 = r4 - r5
            r0 = r5
            r5 = r4
            r4 = r0
        L4d:
            int r6 = r8 - r3
            int r8 = r8 + r3
            r1.set(r4, r6, r5, r8)
            r2.drawRect(r1, r11)
            return
        L57:
            int r7 = r10.b
            if (r7 != 0) goto L63
            int r7 = r10.a
            float r7 = (float) r7
            r13 = 1048576000(0x3e800000, float:0.25)
            float r7 = r7 * r13
            float r7 = r7 + r12
            int r7 = (int) r7
        L63:
            r11.set(r3)
            r10.getClass()
            int r3 = r11.getColor()
            int r3 = defpackage.jw2.k(r3, r9)
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r11.setStyle(r9)
            r11.setColor(r3)
            int r5 = r5 * r7
            int r4 = r4 + r5
            int r5 = r5 + r4
            int r3 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            r1.set(r3, r6, r4, r8)
            r2.drawRect(r1, r11)
            return
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
            r0 = this;
            int r1 = r0.A
            switch(r1) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            f14 r0 = r0.B
            int r0 = r0.a
            return r0
    }
}
