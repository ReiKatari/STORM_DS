package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix4  reason: default package */
/* loaded from: classes.dex */
public final class ix4 extends android.text.style.ReplacementSpan {
    public final float A;
    public final int B;
    public final float L;
    public final int R;
    public final float X;
    public final float Y;
    public final int Z;
    public android.graphics.Paint.FontMetricsInt d0;
    public int e0;
    public int f0;
    public boolean g0;

    public ix4(float r6, int r7, float r8, int r9, defpackage.qh1 r10, int r11) {
            r5 = this;
            r0 = 0
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            if (r7 != 0) goto L11
            long r3 = defpackage.hi2.J(r6, r1)
            float r3 = r10.y0(r3)
            goto L12
        L11:
            r3 = r0
        L12:
            if (r9 != 0) goto L1c
            long r0 = defpackage.hi2.J(r8, r1)
            float r0 = r10.y0(r0)
        L1c:
            r5.<init>()
            r5.A = r6
            r5.B = r7
            r5.L = r8
            r5.R = r9
            r5.X = r3
            r5.Y = r0
            r5.Z = r11
            return
    }

    public final android.graphics.Paint.FontMetricsInt a() {
            r0 = this;
            android.graphics.Paint$FontMetricsInt r0 = r0.d0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "fontMetrics"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final int b() {
            r1 = this;
            boolean r0 = r1.g0
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            defpackage.q53.c(r0)
        L9:
            int r1 = r1.f0
            return r1
    }

    public final int c() {
            r1 = this;
            boolean r0 = r1.g0
            if (r0 != 0) goto L9
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            defpackage.q53.c(r0)
        L9:
            int r1 = r1.e0
            return r1
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r1, java.lang.CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, android.graphics.Paint r9) {
            r0 = this;
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r3, java.lang.CharSequence r4, int r5, int r6, android.graphics.Paint.FontMetricsInt r7) {
            r2 = this;
            r4 = 1
            r2.g0 = r4
            float r5 = r3.getTextSize()
            android.graphics.Paint$FontMetricsInt r3 = r3.getFontMetricsInt()
            r2.d0 = r3
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.descent
            android.graphics.Paint$FontMetricsInt r6 = r2.a()
            int r6 = r6.ascent
            if (r3 <= r6) goto L1c
            goto L21
        L1c:
            java.lang.String r3 = "Invalid fontMetrics: line height can not be negative."
            defpackage.q53.a(r3)
        L21:
            r3 = 0
            java.lang.String r6 = "Unsupported unit."
            int r0 = r2.B
            if (r0 == 0) goto L35
            if (r0 != r4) goto L2e
            float r0 = r2.A
            float r0 = r0 * r5
            goto L37
        L2e:
            defpackage.q53.b(r6)
            defpackage.e41.c()
            return r3
        L35:
            float r0 = r2.X
        L37:
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            r2.e0 = r0
            int r0 = r2.R
            if (r0 == 0) goto L51
            if (r0 != r4) goto L4a
            float r3 = r2.L
            float r3 = r3 * r5
            goto L53
        L4a:
            defpackage.q53.b(r6)
            defpackage.e41.c()
            return r3
        L51:
            float r3 = r2.Y
        L53:
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            r2.f0 = r3
            if (r7 == 0) goto Lfb
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.ascent
            r7.ascent = r3
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.descent
            r7.descent = r3
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.leading
            r7.leading = r3
            int r3 = r2.Z
            switch(r3) {
                case 0: goto Lcf;
                case 1: goto Lba;
                case 2: goto La5;
                case 3: goto L81;
                case 4: goto Lba;
                case 5: goto La5;
                case 6: goto L81;
                default: goto L7b;
            }
        L7b:
            java.lang.String r3 = "Unknown verticalAlign."
            defpackage.q53.a(r3)
            goto Ldf
        L81:
            int r3 = r7.descent
            int r4 = r7.ascent
            int r3 = r3 - r4
            int r4 = r2.b()
            if (r3 >= r4) goto Ldf
            int r3 = r7.ascent
            int r4 = r2.b()
            int r5 = r7.descent
            int r6 = r7.ascent
            int r5 = r5 - r6
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r3 = r3 - r4
            r7.ascent = r3
            int r4 = r2.b()
            int r4 = r4 + r3
            r7.descent = r4
            goto Ldf
        La5:
            int r3 = r7.ascent
            int r4 = r7.descent
            int r5 = r2.b()
            int r4 = r4 - r5
            if (r3 <= r4) goto Ldf
            int r3 = r7.descent
            int r4 = r2.b()
            int r3 = r3 - r4
            r7.ascent = r3
            goto Ldf
        Lba:
            int r3 = r7.ascent
            int r4 = r2.b()
            int r4 = r4 + r3
            int r3 = r7.descent
            if (r4 <= r3) goto Ldf
            int r3 = r7.ascent
            int r4 = r2.b()
            int r4 = r4 + r3
            r7.descent = r4
            goto Ldf
        Lcf:
            int r3 = r7.ascent
            int r4 = r2.b()
            int r4 = -r4
            if (r3 <= r4) goto Ldf
            int r3 = r2.b()
            int r3 = -r3
            r7.ascent = r3
        Ldf:
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.top
            int r4 = r7.ascent
            int r3 = java.lang.Math.min(r3, r4)
            r7.top = r3
            android.graphics.Paint$FontMetricsInt r3 = r2.a()
            int r3 = r3.bottom
            int r4 = r7.descent
            int r3 = java.lang.Math.max(r3, r4)
            r7.bottom = r3
        Lfb:
            int r2 = r2.c()
            return r2
    }
}
