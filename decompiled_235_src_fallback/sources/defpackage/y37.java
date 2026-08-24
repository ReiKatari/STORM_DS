package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y37  reason: default package */
/* loaded from: classes.dex */
public final class y37 {
    public final android.text.TextPaint a;
    public final android.text.TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public defpackage.m42 e;
    public final android.text.Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final android.graphics.Paint.FontMetricsInt m;
    public final int n;
    public final defpackage.yu3[] o;
    public final android.graphics.Rect p;
    public defpackage.s9 q;

    public y37(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, defpackage.dm3 r35) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r6 = r28
            r0.<init>()
            r4 = r24
            r0.a = r4
            r7 = r26
            r0.b = r7
            r0.c = r6
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r0.p = r5
            int r5 = r1.length()
            android.text.TextDirectionHeuristic r12 = defpackage.d47.b(r27)
            android.text.Layout$Alignment r8 = defpackage.xz6.a
            r13 = 1
            r14 = 2
            if (r3 == 0) goto L45
            if (r3 == r13) goto L42
            if (r3 == r14) goto L3f
            r8 = 3
            if (r3 == r8) goto L3c
            r8 = 4
            if (r3 == r8) goto L39
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L47
        L39:
            android.text.Layout$Alignment r3 = defpackage.xz6.b
            goto L47
        L3c:
            android.text.Layout$Alignment r3 = defpackage.xz6.a
            goto L47
        L3f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L47
        L42:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L47
        L45:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L47:
            boolean r8 = r1 instanceof android.text.Spanned
            if (r8 == 0) goto L59
            r8 = r1
            android.text.Spanned r8 = (android.text.Spanned) r8
            r9 = -1
            java.lang.Class<y20> r10 = defpackage.y20.class
            int r8 = r8.nextSpanTransition(r9, r5, r10)
            if (r8 >= r5) goto L59
            r5 = r13
            goto L5a
        L59:
            r5 = 0
        L5a:
            java.lang.String r8 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r8)
            android.text.BoringLayout$Metrics r8 = r35.a()     // Catch: java.lang.Throwable -> L343
            double r9 = (double) r2     // Catch: java.lang.Throwable -> L343
            double r14 = java.lang.Math.ceil(r9)     // Catch: java.lang.Throwable -> L343
            float r11 = (float) r14     // Catch: java.lang.Throwable -> L343
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L343
            r14 = 33
            if (r8 == 0) goto Lb4
            float r15 = r35.c()     // Catch: java.lang.Throwable -> L343
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 > 0) goto Lb4
            if (r5 != 0) goto Lb4
            r0.l = r13     // Catch: java.lang.Throwable -> L343
            if (r11 < 0) goto L7d
            goto L82
        L7d:
            java.lang.String r2 = "negative width"
            defpackage.q53.a(r2)     // Catch: java.lang.Throwable -> L343
        L82:
            if (r11 < 0) goto L85
            goto L8a
        L85:
            java.lang.String r2 = "negative ellipsized width"
            defpackage.q53.a(r2)     // Catch: java.lang.Throwable -> L343
        L8a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L343
            if (r2 < r14) goto L98
            r5 = r8
            r8 = r11
            r2 = r4
            r4 = r3
            r3 = r11
            android.text.BoringLayout r2 = defpackage.o2.f(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L343
            goto Lb0
        L98:
            r4 = r3
            r5 = r8
            r3 = r11
            android.text.BoringLayout r1 = new android.text.BoringLayout     // Catch: java.lang.Throwable -> L343
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r11 = r3
            r2 = r22
            r10 = r26
            r9 = r28
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L343
            r2 = r1
        Lb0:
            r7 = r29
            r5 = r12
            goto Lde
        Lb4:
            r4 = r3
            r3 = r11
            r1 = 0
            r0.l = r1     // Catch: java.lang.Throwable -> L343
            r5 = r4
            int r4 = r22.length()     // Catch: java.lang.Throwable -> L343
            double r6 = java.lang.Math.ceil(r9)     // Catch: java.lang.Throwable -> L343
            float r2 = (float) r6     // Catch: java.lang.Throwable -> L343
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L343
            r1 = r22
            r2 = r24
            r8 = r26
            r11 = r28
            r7 = r29
            r13 = r31
            r14 = r32
            r15 = r33
            r10 = r34
            r6 = r5
            r5 = r12
            r12 = r30
            android.text.StaticLayout r2 = defpackage.uj2.t(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L343
        Lde:
            r0.f = r2     // Catch: java.lang.Throwable -> L343
            android.os.Trace.endSection()
            int r1 = r2.getLineCount()
            int r1 = java.lang.Math.min(r1, r7)
            r0.g = r1
            int r3 = r1 + (-1)
            if (r1 >= r7) goto Lf3
        Lf1:
            r13 = 0
            goto L104
        Lf3:
            int r4 = r2.getEllipsisCount(r3)
            if (r4 > 0) goto L103
            int r4 = r2.getLineEnd(r3)
            int r6 = r22.length()
            if (r4 == r6) goto Lf1
        L103:
            r13 = 1
        L104:
            r0.d = r13
            java.lang.CharSequence r4 = r2.getText()
            boolean r4 = r4 instanceof android.text.Spanned
            if (r4 != 0) goto L10f
            goto L12a
        L10f:
            java.lang.CharSequence r4 = r2.getText()
            r4.getClass()
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<yu3> r7 = defpackage.yu3.class
            boolean r4 = defpackage.ii2.B(r4, r7)
            if (r4 != 0) goto L12d
            java.lang.CharSequence r4 = r2.getText()
            int r4 = r4.length()
            if (r4 <= 0) goto L12d
        L12a:
            r4 = 0
            r9 = 0
            goto L145
        L12d:
            java.lang.CharSequence r4 = r2.getText()
            r4.getClass()
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.CharSequence r8 = r2.getText()
            int r8 = r8.length()
            r9 = 0
            java.lang.Object[] r4 = r4.getSpans(r9, r8, r7)
            yu3[] r4 = (defpackage.yu3[]) r4
        L145:
            r0.o = r4
            if (r4 == 0) goto L160
            java.lang.Object r7 = defpackage.fv.E0(r4)
            yu3 r7 = (defpackage.yu3) r7
            if (r7 == 0) goto L160
            boolean r8 = r7.L
            if (r8 == 0) goto L15c
            int r7 = r7.Y
            r8 = 2
            if (r7 != r8) goto L15d
            r13 = 1
            goto L15e
        L15c:
            r8 = 2
        L15d:
            r13 = r9
        L15e:
            r15 = r13
            goto L162
        L160:
            r8 = 2
            r15 = r9
        L162:
            if (r4 == 0) goto L176
            java.lang.Object r7 = defpackage.fv.E0(r4)
            yu3 r7 = (defpackage.yu3) r7
            if (r7 == 0) goto L176
            boolean r10 = r7.R
            if (r10 == 0) goto L176
            int r7 = r7.Y
            if (r7 != r8) goto L176
            r13 = 1
            goto L177
        L176:
            r13 = r9
        L177:
            if (r15 == 0) goto L189
            if (r13 == 0) goto L189
            long r1 = defpackage.d47.b
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            r14 = 33
            goto L22d
        L189:
            long r16 = defpackage.d47.b
            if (r28 != 0) goto L211
            boolean r8 = r0.l
            if (r8 == 0) goto L1a1
            r8 = r2
            android.text.BoringLayout r8 = (android.text.BoringLayout) r8
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r12 < r14) goto L19f
            boolean r8 = defpackage.o2.y(r8)
            goto L1b4
        L19f:
            r8 = r9
            goto L1b4
        L1a1:
            r14 = 33
            r8 = r2
            android.text.StaticLayout r8 = (android.text.StaticLayout) r8
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r14) goto L1af
            boolean r8 = defpackage.a81.r(r8)
            goto L1b4
        L1af:
            r8 = 28
            if (r12 < r8) goto L19f
            r8 = 1
        L1b4:
            if (r8 == 0) goto L1bf
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            goto L21b
        L1bf:
            android.text.TextPaint r8 = r2.getPaint()
            java.lang.CharSequence r12 = r2.getText()
            int r6 = r2.getLineStart(r9)
            r23 = 32
            int r7 = r2.getLineEnd(r9)
            android.graphics.Rect r6 = defpackage.ej2.z(r8, r12, r6, r7)
            int r7 = r2.getLineAscent(r9)
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r10 = r6.top
            if (r10 >= r7) goto L1e5
            int r7 = r7 - r10
        L1e3:
            r10 = 1
            goto L1ea
        L1e5:
            int r7 = r2.getTopPadding()
            goto L1e3
        L1ea:
            if (r1 != r10) goto L1ed
            goto L1f9
        L1ed:
            int r1 = r2.getLineStart(r3)
            int r6 = r2.getLineEnd(r3)
            android.graphics.Rect r6 = defpackage.ej2.z(r8, r12, r1, r6)
        L1f9:
            int r1 = r2.getLineDescent(r3)
            int r6 = r6.bottom
            if (r6 <= r1) goto L203
            int r6 = r6 - r1
            goto L207
        L203:
            int r6 = r2.getBottomPadding()
        L207:
            if (r7 != 0) goto L20c
            if (r6 != 0) goto L20c
            goto L21b
        L20c:
            long r16 = defpackage.d47.a(r7, r6)
            goto L21b
        L211:
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            r14 = 33
        L21b:
            if (r15 == 0) goto L21f
            r15 = r9
            goto L222
        L21f:
            long r1 = r16 >> r23
            int r15 = (int) r1
        L222:
            if (r13 == 0) goto L226
            r1 = r9
            goto L229
        L226:
            long r1 = r16 & r24
            int r1 = (int) r1
        L229:
            long r1 = defpackage.d47.a(r15, r1)
        L22d:
            if (r4 == 0) goto L25e
            int r6 = r4.length
            r7 = r9
            r8 = r7
            r15 = r8
        L233:
            if (r15 >= r6) goto L252
            r11 = r4[r15]
            int r12 = r11.g0
            if (r12 >= 0) goto L243
            int r12 = java.lang.Math.abs(r12)
            int r7 = java.lang.Math.max(r7, r12)
        L243:
            int r11 = r11.h0
            if (r11 >= 0) goto L24f
            int r8 = java.lang.Math.abs(r11)
            int r8 = java.lang.Math.max(r7, r8)
        L24f:
            int r15 = r15 + 1
            goto L233
        L252:
            if (r7 != 0) goto L259
            if (r8 != 0) goto L259
            long r6 = defpackage.d47.b
            goto L260
        L259:
            long r6 = defpackage.d47.a(r7, r8)
            goto L260
        L25e:
            long r6 = defpackage.d47.b
        L260:
            long r11 = r1 >> r23
            int r4 = (int) r11
            long r11 = r6 >> r23
            int r8 = (int) r11
            int r4 = java.lang.Math.max(r4, r8)
            r0.h = r4
            long r1 = r1 & r24
            int r1 = (int) r1
            long r6 = r6 & r24
            int r2 = (int) r6
            int r1 = java.lang.Math.max(r1, r2)
            r0.i = r1
            android.text.TextPaint r7 = r0.a
            yu3[] r1 = r0.o
            int r2 = r0.g
            int r2 = r2 - r10
            android.text.Layout r4 = r0.f
            int r6 = r4.getLineStart(r2)
            int r4 = r4.getLineEnd(r2)
            if (r6 != r4) goto L312
            if (r1 == 0) goto L312
            int r4 = r1.length
            if (r4 != 0) goto L292
            goto L312
        L292:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r4 = "\u200b"
            r6.<init>(r4)
            java.lang.Object r1 = defpackage.fv.D0(r1)
            yu3 r1 = (defpackage.yu3) r1
            int r4 = r6.length()
            if (r2 == 0) goto L2ab
            boolean r2 = r1.R
            if (r2 == 0) goto L2ab
            r15 = r9
            goto L2ad
        L2ab:
            boolean r15 = r1.R
        L2ad:
            yu3 r2 = new yu3
            float r8 = r1.A
            boolean r10 = r1.R
            float r11 = r1.X
            int r1 = r1.Y
            r28 = r1
            r22 = r2
            r24 = r4
            r23 = r8
            r26 = r10
            r27 = r11
            r25 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r1 = r22
            int r2 = r6.length()
            r6.setSpan(r1, r9, r2, r14)
            r1 = r9
            int r9 = r6.length()
            boolean r2 = r0.c
            android.text.Layout$Alignment r11 = defpackage.mj3.a
            r19 = 0
            r20 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r17 = 0
            r18 = 0
            r16 = r2
            r10 = r5
            android.text.StaticLayout r2 = defpackage.uj2.t(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Paint$FontMetricsInt r6 = new android.graphics.Paint$FontMetricsInt
            r6.<init>()
            int r4 = r2.getLineAscent(r1)
            r6.ascent = r4
            int r4 = r2.getLineDescent(r1)
            r6.descent = r4
            int r4 = r2.getLineTop(r1)
            r6.top = r4
            int r2 = r2.getLineBottom(r1)
            r6.bottom = r2
            goto L314
        L312:
            r1 = r9
            r6 = 0
        L314:
            if (r6 == 0) goto L325
            int r1 = r6.bottom
            float r2 = r0.e(r3)
            float r4 = r0.g(r3)
            float r2 = r2 - r4
            int r2 = (int) r2
            int r15 = r1 - r2
            goto L326
        L325:
            r15 = r1
        L326:
            r0.n = r15
            r0.m = r6
            android.text.Layout r1 = r0.f
            android.text.TextPaint r2 = r1.getPaint()
            float r1 = defpackage.mp2.D(r1, r3, r2)
            r0.j = r1
            android.text.Layout r1 = r0.f
            android.text.TextPaint r2 = r1.getPaint()
            float r1 = defpackage.mp2.E(r1, r3, r2)
            r0.k = r1
            return
        L343:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    public final int a() {
            r2 = this;
            boolean r0 = r2.d
            android.text.Layout r1 = r2.f
            if (r0 == 0) goto Lf
            int r0 = r2.g
            int r0 = r0 + (-1)
            int r0 = r1.getLineBottom(r0)
            goto L13
        Lf:
            int r0 = r1.getHeight()
        L13:
            int r1 = r2.h
            int r0 = r0 + r1
            int r1 = r2.i
            int r0 = r0 + r1
            int r2 = r2.n
            int r0 = r0 + r2
            return r0
    }

    public final float b(int r2) {
            r1 = this;
            int r0 = r1.g
            int r0 = r0 + (-1)
            if (r2 != r0) goto Lc
            float r2 = r1.j
            float r1 = r1.k
            float r2 = r2 + r1
            return r2
        Lc:
            r1 = 0
            return r1
    }

    public final defpackage.s9 c() {
            r7 = this;
            s9 r0 = r7.q
            if (r0 != 0) goto L75
            s9 r1 = new s9
            r1.<init>()
            android.text.Layout r0 = r7.f
            r1.a = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r0 = r3
        L14:
            java.lang.Object r4 = r1.a
            android.text.Layout r4 = (android.text.Layout) r4
            java.lang.CharSequence r4 = r4.getText()
            r5 = 10
            r6 = 4
            int r0 = defpackage.qs6.s0(r5, r0, r6, r4)
            if (r0 >= 0) goto L32
            java.lang.Object r0 = r1.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            goto L34
        L32:
            int r0 = r0 + 1
        L34:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.add(r4)
            java.lang.Object r4 = r1.a
            android.text.Layout r4 = (android.text.Layout) r4
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            if (r0 < r4) goto L14
            r1.b = r2
            int r0 = r2.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L54:
            if (r3 >= r0) goto L5d
            r4 = 0
            r2.add(r4)
            int r3 = r3 + 1
            goto L54
        L5d:
            r1.c = r2
            java.lang.Object r0 = r1.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r1.d = r0
            java.lang.Object r0 = r1.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.size()
            r7.q = r1
            return r1
        L75:
            return r0
    }

    public final float d(int r3) {
            r2 = this;
            int r0 = r2.h
            float r0 = (float) r0
            int r1 = r2.g
            int r1 = r1 + (-1)
            if (r3 != r1) goto L16
            android.graphics.Paint$FontMetricsInt r1 = r2.m
            if (r1 == 0) goto L16
            float r2 = r2.g(r3)
            int r3 = r1.ascent
            float r3 = (float) r3
            float r2 = r2 - r3
            goto L1d
        L16:
            android.text.Layout r2 = r2.f
            int r2 = r2.getLineBaseline(r3)
            float r2 = (float) r2
        L1d:
            float r0 = r0 + r2
            return r0
    }

    public final float e(int r4) {
            r3 = this;
            int r0 = r3.g
            int r1 = r0 + (-1)
            android.text.Layout r2 = r3.f
            if (r4 != r1) goto L18
            android.graphics.Paint$FontMetricsInt r1 = r3.m
            if (r1 == 0) goto L18
            int r4 = r4 + (-1)
            int r3 = r2.getLineBottom(r4)
            float r3 = (float) r3
            int r4 = r1.bottom
            float r4 = (float) r4
            float r3 = r3 + r4
            return r3
        L18:
            int r1 = r3.h
            float r1 = (float) r1
            int r2 = r2.getLineBottom(r4)
            float r2 = (float) r2
            float r1 = r1 + r2
            int r0 = r0 + (-1)
            if (r4 != r0) goto L28
            int r3 = r3.i
            goto L29
        L28:
            r3 = 0
        L29:
            float r3 = (float) r3
            float r1 = r1 + r3
            return r1
    }

    public final int f(int r3) {
            r2 = this;
            java.lang.ThreadLocal r0 = defpackage.d47.a
            android.text.Layout r0 = r2.f
            int r1 = r0.getEllipsisCount(r3)
            if (r1 <= 0) goto L19
            android.text.TextUtils$TruncateAt r2 = r2.b
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            if (r2 != r1) goto L19
            java.lang.CharSequence r2 = r0.getText()
            int r2 = r2.length()
            return r2
        L19:
            int r2 = r0.getLineEnd(r3)
            return r2
    }

    public final float g(int r2) {
            r1 = this;
            android.text.Layout r0 = r1.f
            int r0 = r0.getLineTop(r2)
            float r0 = (float) r0
            if (r2 != 0) goto Lb
            r1 = 0
            goto Ld
        Lb:
            int r1 = r1.h
        Ld:
            float r1 = (float) r1
            float r0 = r0 + r1
            return r0
    }

    public final float h(int r3, boolean r4) {
            r2 = this;
            s9 r0 = r2.c()
            r1 = 1
            float r4 = r0.x(r3, r1, r4)
            android.text.Layout r0 = r2.f
            int r3 = r0.getLineForOffset(r3)
            float r2 = r2.b(r3)
            float r2 = r2 + r4
            return r2
    }

    public final float i(int r3, boolean r4) {
            r2 = this;
            s9 r0 = r2.c()
            r1 = 0
            float r4 = r0.x(r3, r1, r4)
            android.text.Layout r0 = r2.f
            int r3 = r0.getLineForOffset(r3)
            float r2 = r2.b(r3)
            float r2 = r2 + r4
            return r2
    }

    public final defpackage.m42 j() {
            r4 = this;
            m42 r0 = r4.e
            if (r0 == 0) goto L5
            return r0
        L5:
            m42 r0 = new m42
            android.text.Layout r1 = r4.f
            java.lang.CharSequence r2 = r1.getText()
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            android.text.TextPaint r3 = r4.a
            java.util.Locale r3 = r3.getTextLocale()
            r0.<init>(r2, r1, r3)
            r4.e = r0
            return r0
    }
}
