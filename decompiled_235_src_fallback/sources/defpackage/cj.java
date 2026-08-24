package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj  reason: default package */
/* loaded from: classes.dex */
public final class cj {
    public final defpackage.gj a;
    public final int b;
    public final long c;
    public final defpackage.y37 d;
    public final java.lang.CharSequence e;
    public final java.util.List f;

    public cj(defpackage.gj r22, int r23, int r24, long r25) {
            r21 = this;
            r0 = r21
            r10 = r22
            r4 = r23
            r11 = r24
            r0.<init>()
            r0.a = r10
            r0.b = r4
            r12 = r25
            r0.c = r12
            int r1 = defpackage.q21.i(r12)
            if (r1 != 0) goto L20
            int r1 = defpackage.q21.j(r12)
            if (r1 != 0) goto L20
            goto L25
        L20:
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            defpackage.q53.a(r1)
        L25:
            r14 = 1
            if (r4 < r14) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxLines should be greater than 0"
            defpackage.q53.a(r1)
        L2e:
            s47 r1 = r10.b
            java.lang.CharSequence r2 = r10.h
            r3 = 5
            r5 = 4
            r6 = 2
            if (r11 != r6) goto L96
            nn6 r8 = r1.a
            long r8 = r8.h
            r17 = 0
            long r6 = defpackage.hi2.E(r17)
            boolean r6 = defpackage.x47.a(r8, r6)
            if (r6 != 0) goto L94
            nn6 r6 = r1.a
            long r6 = r6.h
            long r8 = defpackage.x47.c
            boolean r6 = defpackage.x47.a(r6, r8)
            if (r6 != 0) goto L94
            ds4 r6 = r1.b
            int r6 = r6.a
            if (r6 != 0) goto L5a
            goto L94
        L5a:
            if (r6 != r3) goto L5d
            goto L94
        L5d:
            if (r6 != r5) goto L60
            goto L94
        L60:
            int r6 = r2.length()
            if (r6 != 0) goto L67
            goto L94
        L67:
            boolean r6 = r2 instanceof android.text.Spannable
            if (r6 == 0) goto L6f
            r6 = r2
            android.text.Spannable r6 = (android.text.Spannable) r6
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 != 0) goto L77
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r2)
        L77:
            java.lang.Class<g43> r2 = defpackage.g43.class
            boolean r2 = defpackage.ii2.B(r6, r2)
            if (r2 != 0) goto L93
            g43 r2 = new g43
            r2.<init>()
            int r7 = r6.length()
            int r7 = r7 - r14
            int r8 = r6.length()
            int r8 = r8 - r14
            r9 = 33
            r6.setSpan(r2, r7, r8, r9)
        L93:
            r2 = r6
        L94:
            r9 = r2
            goto L99
        L96:
            r17 = 0
            goto L94
        L99:
            r0.e = r9
            ds4 r2 = r1.b
            nn6 r1 = r1.a
            int r6 = r2.a
            r7 = 3
            if (r6 != r14) goto La6
            r8 = r7
            goto Lb9
        La6:
            r8 = 2
            if (r6 != r8) goto Lab
            r8 = r5
            goto Lb9
        Lab:
            if (r6 != r7) goto Laf
            r8 = 2
            goto Lb9
        Laf:
            if (r6 != r3) goto Lb2
            goto Lb7
        Lb2:
            r8 = 6
            if (r6 != r8) goto Lb7
            r8 = r14
            goto Lb9
        Lb7:
            r8 = r17
        Lb9:
            if (r6 != r5) goto Lbf
            r6 = r14
        Lbc:
            r18 = 0
            goto Lc2
        Lbf:
            r6 = r17
            goto Lbc
        Lc2:
            int r15 = r2.h
            r3 = 32
            r5 = 2
            if (r15 != r5) goto Ld1
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 > r3) goto Lcf
            r15 = r5
            goto Ld3
        Lcf:
            r15 = 4
            goto Ld3
        Ld1:
            r15 = r17
        Ld3:
            int r2 = r2.g
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r14) goto Lda
            goto Le6
        Lda:
            if (r3 != r5) goto Le0
            r3 = r2
            r2 = r6
            r6 = r14
            goto Lea
        Le0:
            if (r3 != r7) goto Le6
            r3 = r2
            r2 = r6
            r6 = 2
            goto Lea
        Le6:
            r3 = r2
            r2 = r6
            r6 = r17
        Lea:
            int r5 = r3 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r14) goto Lf1
            goto L101
        Lf1:
            r14 = 2
            if (r5 != r14) goto Lf7
            r5 = r7
            r7 = 1
            goto L104
        Lf7:
            if (r5 != r7) goto Lfc
            r5 = r7
            r7 = 2
            goto L104
        Lfc:
            r14 = 4
            if (r5 != r14) goto L101
            r5 = r7
            goto L104
        L101:
            r5 = r7
            r7 = r17
        L104:
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r14 = 1
            if (r3 != r14) goto L10d
            r14 = 2
            goto L114
        L10d:
            r14 = 2
            if (r3 != r14) goto L114
            r3 = r1
            r1 = r8
            r8 = 1
            goto L118
        L114:
            r3 = r1
            r1 = r8
            r8 = r17
        L118:
            if (r11 != r14) goto L123
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
        L11c:
            r5 = r15
            r19 = 32
            r15 = r3
            r3 = r16
            goto L135
        L123:
            r5 = 5
            if (r11 != r5) goto L129
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L11c
        L129:
            r5 = 4
            if (r11 != r5) goto L12f
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.START
            goto L11c
        L12f:
            r5 = r15
            r19 = 32
            r15 = r3
            r3 = r18
        L135:
            y37 r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.Layout r0 = r14.f
            int r4 = android.os.Build.VERSION.SDK_INT
            r16 = r1
            r1 = 35
            if (r4 >= r1) goto L14e
            km r1 = r10.g
            float r1 = r1.getLetterSpacing()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L156
        L14e:
            r10 = 2
            r0 = r21
            r4 = r23
            r1 = r16
            goto L196
        L156:
            r1 = 4
            if (r11 != r1) goto L15b
        L159:
            r1 = 0
            goto L15f
        L15b:
            r1 = 5
            if (r11 != r1) goto L14e
            goto L159
        L15f:
            int r4 = r0.getEllipsisCount(r1)
            if (r4 <= 0) goto L14e
            int r4 = r0.getEllipsisStart(r1)
            int r0 = r0.getEllipsisCount(r1)
            int r0 = r0 + r4
            java.lang.CharSequence r4 = r9.subSequence(r1, r4)
            int r10 = r9.length()
            java.lang.CharSequence r0 = r9.subSequence(r0, r10)
            r9 = 3
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r9]
            r9[r1] = r4
            java.lang.String r1 = "…"
            r20 = 1
            r9[r20] = r1
            r10 = 2
            r9[r10] = r0
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r9)
            r0 = r21
            r4 = r23
            r1 = r16
            y37 r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L196:
            int r9 = r14.g
            if (r11 != r10) goto L1d3
            int r11 = r14.a()
            r16 = r10
            int r10 = defpackage.q21.g(r12)
            if (r11 <= r10) goto L1d5
            r10 = 1
            if (r4 <= r10) goto L1d5
            int r4 = defpackage.q21.g(r12)
            r10 = 0
        L1ae:
            if (r10 >= r9) goto L1bd
            float r11 = r14.e(r10)
            float r12 = (float) r4
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L1ba
            goto L1be
        L1ba:
            int r10 = r10 + 1
            goto L1ae
        L1bd:
            r10 = r9
        L1be:
            if (r10 < 0) goto L1d0
            int r4 = r0.b
            if (r10 == r4) goto L1d0
            r4 = 1
            if (r10 >= r4) goto L1c9
            r4 = 1
            goto L1ca
        L1c9:
            r4 = r10
        L1ca:
            java.lang.CharSequence r9 = r0.e
            y37 r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L1d0:
            r0.d = r14
            goto L1d7
        L1d3:
            r16 = r10
        L1d5:
            r0.d = r14
        L1d7:
            gj r1 = r0.a
            km r1 = r1.g
            e37 r2 = r15.a
            f80 r2 = r2.c()
            float r3 = r0.d()
            float r4 = r0.b()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r5 = r5 << r19
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r7
            long r3 = r3 | r5
            e37 r5 = r15.a
            float r5 = r5.a()
            r1.c(r2, r3, r5)
            y37 r1 = r0.d
            android.text.Layout r1 = r1.f
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L214
        L211:
            r1 = r18
            goto L246
        L214:
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            r3 = -1
            int r4 = r2.length()
            java.lang.Class<yd6> r5 = defpackage.yd6.class
            int r3 = r2.nextSpanTransition(r3, r4, r5)
            int r2 = r2.length()
            if (r3 == r2) goto L211
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r5)
            yd6[] r1 = (defpackage.yd6[]) r1
        L246:
            if (r1 == 0) goto L271
            int r2 = r1.length
            r3 = 0
        L24a:
            if (r3 >= r2) goto L271
            r4 = r1[r3]
            float r5 = r0.d()
            float r6 = r0.b()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r9 = r9 << r19
            long r5 = r5 & r7
            long r5 = r5 | r9
            vs4 r4 = r4.L
            xi6 r9 = new xi6
            r9.<init>(r5)
            r4.setValue(r9)
            int r3 = r3 + 1
            goto L24a
        L271:
            java.lang.CharSequence r1 = r0.e
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L27b
            yt1 r1 = defpackage.yt1.A
            goto L3b7
        L27b:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<ix4> r3 = defpackage.ix4.class
            r4 = 0
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r7 = 0
        L291:
            if (r7 >= r4) goto L3b6
            r5 = r1[r7]
            ix4 r5 = (defpackage.ix4) r5
            int r6 = r2.getSpanStart(r5)
            int r8 = r2.getSpanEnd(r5)
            y37 r9 = r0.d
            android.text.Layout r9 = r9.f
            int r9 = r9.getLineForOffset(r6)
            int r10 = r0.b
            if (r9 < r10) goto L2ad
            r10 = 1
            goto L2ae
        L2ad:
            r10 = 0
        L2ae:
            y37 r11 = r0.d
            android.text.Layout r11 = r11.f
            int r11 = r11.getEllipsisCount(r9)
            if (r11 <= 0) goto L2cd
            y37 r11 = r0.d
            android.text.Layout r11 = r11.f
            int r11 = r11.getLineStart(r9)
            y37 r12 = r0.d
            android.text.Layout r12 = r12.f
            int r12 = r12.getEllipsisStart(r9)
            int r12 = r12 + r11
            if (r8 <= r12) goto L2cd
            r11 = 1
            goto L2ce
        L2cd:
            r11 = 0
        L2ce:
            y37 r12 = r0.d
            int r12 = r12.f(r9)
            if (r8 <= r12) goto L2d8
            r8 = 1
            goto L2d9
        L2d8:
            r8 = 0
        L2d9:
            if (r11 != 0) goto L2df
            if (r8 != 0) goto L2df
            if (r10 == 0) goto L2e3
        L2df:
            r10 = 1
            r12 = 0
            goto L3ad
        L2e3:
            y37 r8 = r0.d
            android.text.Layout r8 = r8.f
            int r8 = r8.getParagraphDirection(r9)
            r10 = 1
            if (r8 != r10) goto L2f0
            r8 = r10
            goto L2f1
        L2f0:
            r8 = 0
        L2f1:
            y37 r11 = r0.d
            android.text.Layout r11 = r11.f
            boolean r11 = r11.isRtlCharAt(r6)
            if (r8 == 0) goto L30b
            if (r11 != 0) goto L30b
            y37 r8 = r0.d
            r12 = 0
            float r6 = r8.h(r6, r12)
            int r8 = r5.c()
        L308:
            float r8 = (float) r8
            float r8 = r8 + r6
            goto L334
        L30b:
            r12 = 0
            if (r8 == 0) goto L31e
            if (r11 == 0) goto L31e
            y37 r8 = r0.d
            float r8 = r8.i(r6, r12)
            int r6 = r5.c()
        L31a:
            float r6 = (float) r6
            float r6 = r8 - r6
            goto L334
        L31e:
            y37 r8 = r0.d
            if (r11 == 0) goto L32b
            float r8 = r8.h(r6, r12)
            int r6 = r5.c()
            goto L31a
        L32b:
            float r6 = r8.i(r6, r12)
            int r8 = r5.c()
            goto L308
        L334:
            y37 r11 = r0.d
            int r13 = r5.Z
            switch(r13) {
                case 0: goto L398;
                case 1: goto L393;
                case 2: goto L38a;
                case 3: goto L377;
                case 4: goto L36b;
                case 5: goto L358;
                case 6: goto L341;
                default: goto L33b;
            }
        L33b:
            java.lang.String r0 = "unexpected verticalAlignment"
            defpackage.i.m(r0)
            throw r18
        L341:
            android.graphics.Paint$FontMetricsInt r13 = r5.a()
            int r14 = r13.ascent
            int r13 = r13.descent
            int r14 = r14 + r13
            int r13 = r5.b()
            int r14 = r14 - r13
            int r14 = r14 / 2
            float r13 = (float) r14
            float r9 = r11.d(r9)
        L356:
            float r9 = r9 + r13
            goto L3a1
        L358:
            android.graphics.Paint$FontMetricsInt r13 = r5.a()
            int r13 = r13.descent
            float r13 = (float) r13
            float r9 = r11.d(r9)
            float r9 = r9 + r13
            int r11 = r5.b()
        L368:
            float r11 = (float) r11
            float r9 = r9 - r11
            goto L3a1
        L36b:
            android.graphics.Paint$FontMetricsInt r13 = r5.a()
            int r13 = r13.ascent
            float r13 = (float) r13
            float r9 = r11.d(r9)
            goto L356
        L377:
            float r13 = r11.g(r9)
            float r9 = r11.e(r9)
            float r9 = r9 + r13
            int r11 = r5.b()
            float r11 = (float) r11
            float r9 = r9 - r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r11
            goto L3a1
        L38a:
            float r9 = r11.e(r9)
            int r11 = r5.b()
            goto L368
        L393:
            float r9 = r11.g(r9)
            goto L3a1
        L398:
            float r9 = r11.d(r9)
            int r11 = r5.b()
            goto L368
        L3a1:
            int r5 = r5.b()
            float r5 = (float) r5
            float r5 = r5 + r9
            of5 r11 = new of5
            r11.<init>(r6, r9, r8, r5)
            goto L3af
        L3ad:
            r11 = r18
        L3af:
            r3.add(r11)
            int r7 = r7 + 1
            goto L291
        L3b6:
            r1 = r3
        L3b7:
            r0.f = r1
            return
    }

    public final defpackage.y37 a(int r16, int r17, android.text.TextUtils.TruncateAt r18, int r19, int r20, int r21, int r22, int r23, java.lang.CharSequence r24) {
            r15 = this;
            float r2 = r15.d()
            gj r15 = r15.a
            km r3 = r15.g
            int r6 = r15.l
            dm3 r14 = r15.i
            s47 r15 = r15.b
            dj r0 = defpackage.ej.a
            hy4 r15 = r15.c
            if (r15 == 0) goto L1c
            ux4 r15 = r15.b
            if (r15 == 0) goto L1c
            boolean r15 = r15.a
        L1a:
            r7 = r15
            goto L1e
        L1c:
            r15 = 0
            goto L1a
        L1e:
            y37 r0 = new y37
            r4 = r16
            r13 = r17
            r5 = r18
            r8 = r19
            r12 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public final float b() {
            r0 = this;
            y37 r0 = r0.d
            int r0 = r0.a()
            float r0 = (float) r0
            return r0
    }

    public final long c(defpackage.of5 r11, int r12, defpackage.fa6 r13) {
            r10 = this;
            android.graphics.RectF r4 = defpackage.ej2.a0(r11)
            r11 = 1
            r8 = 0
            if (r12 != 0) goto L9
            goto Ld
        L9:
            if (r12 != r11) goto Ld
            r12 = r11
            goto Le
        Ld:
            r12 = r8
        Le:
            z5 r6 = new z5
            r0 = 2
            r6.<init>(r13, r0)
            y37 r0 = r10.d
            android.text.TextPaint r10 = r0.a
            android.text.Layout r1 = r0.f
            int r13 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 15
            if (r13 < r2) goto L51
            if (r12 != r11) goto L37
            rr6 r10 = new rr6
            java.lang.CharSequence r12 = r1.getText()
            m42 r13 = r0.j()
            r10.<init>(r3, r12, r13)
            wp r12 = new wp
            r12.<init>(r10)
            goto L46
        L37:
            defpackage.gi.l()
            java.lang.CharSequence r12 = r1.getText()
            android.text.GraphemeClusterSegmentFinder r10 = defpackage.gi.h(r12, r10)
            android.text.SegmentFinder r12 = defpackage.gi.i(r10)
        L46:
            hi r10 = new hi
            r10.<init>(r6)
            int[] r10 = defpackage.gi.s(r1, r4, r12, r10)
            goto Le2
        L51:
            s9 r2 = r0.c()
            if (r12 != r11) goto L66
            rr6 r10 = new rr6
            java.lang.CharSequence r12 = r1.getText()
            m42 r13 = r0.j()
            r10.<init>(r3, r12, r13)
        L64:
            r5 = r10
            goto L7b
        L66:
            java.lang.CharSequence r12 = r1.getText()
            r3 = 29
            if (r13 < r3) goto L75
            rt2 r13 = new rt2
            r13.<init>(r12, r10)
            r10 = r13
            goto L64
        L75:
            st2 r10 = new st2
            r10.<init>(r12)
            goto L64
        L7b:
            float r10 = r4.top
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            float r12 = r4.top
            float r13 = r0.e(r10)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L93
            int r10 = r10 + 1
            int r12 = r0.g
            if (r10 < r12) goto L93
            goto Ld2
        L93:
            r3 = r10
            float r10 = r4.bottom
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            if (r10 != 0) goto La8
            float r12 = r4.bottom
            float r13 = r0.g(r8)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto La8
            goto Ld2
        La8:
            r7 = 1
            int r12 = defpackage.np2.U(r0, r1, r2, r3, r4, r5, r6, r7)
        Lad:
            r13 = r3
            r9 = -1
            if (r12 != r9) goto Lbb
            if (r13 >= r10) goto Lbb
            int r3 = r13 + 1
            r7 = 1
            int r12 = defpackage.np2.U(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lad
        Lbb:
            if (r12 != r9) goto Lbe
            goto Ld2
        Lbe:
            r7 = 0
            r3 = r10
            int r10 = defpackage.np2.U(r0, r1, r2, r3, r4, r5, r6, r7)
        Lc4:
            if (r10 != r9) goto Ld0
            if (r13 >= r3) goto Ld0
            int r3 = r3 + (-1)
            r7 = 0
            int r10 = defpackage.np2.U(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lc4
        Ld0:
            if (r10 != r9) goto Ld4
        Ld2:
            r10 = 0
            goto Le2
        Ld4:
            int r12 = r12 + r11
            int r12 = r5.c(r12)
            int r10 = r10 - r11
            int r10 = r5.d(r10)
            int[] r10 = new int[]{r12, r10}
        Le2:
            if (r10 != 0) goto Le7
            long r10 = defpackage.k47.b
            return r10
        Le7:
            r12 = r10[r8]
            r10 = r10[r11]
            long r10 = defpackage.jx2.f(r12, r10)
            return r10
    }

    public final float d() {
            r2 = this;
            long r0 = r2.c
            int r2 = defpackage.q21.h(r0)
            float r2 = (float) r2
            return r2
    }

    public final void e(defpackage.xj0 r6) {
            r5 = this;
            android.graphics.Canvas r6 = defpackage.xd.a(r6)
            y37 r0 = r5.d
            boolean r1 = r0.d
            r2 = 0
            if (r1 == 0) goto L19
            r6.save()
            float r1 = r5.d()
            float r5 = r5.b()
            r6.clipRect(r2, r2, r1, r5)
        L19:
            int r5 = r0.h
            android.graphics.Rect r1 = r0.p
            boolean r1 = r6.getClipBounds(r1)
            if (r1 != 0) goto L24
            goto L4f
        L24:
            if (r5 == 0) goto L2a
            float r1 = (float) r5
            r6.translate(r2, r1)
        L2a:
            java.lang.ThreadLocal r1 = defpackage.d47.a
            java.lang.Object r3 = r1.get()
            if (r3 != 0) goto L3a
            yz6 r3 = new yz6
            r3.<init>()
            r1.set(r3)
        L3a:
            yz6 r3 = (defpackage.yz6) r3
            r3.a = r6
            r1 = 0
            android.text.Layout r4 = r0.f     // Catch: java.lang.Throwable -> L57
            r4.draw(r3)     // Catch: java.lang.Throwable -> L57
            r3.a = r1
            if (r5 == 0) goto L4f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = (float) r5
            float r1 = r1 * r5
            r6.translate(r2, r1)
        L4f:
            boolean r5 = r0.d
            if (r5 == 0) goto L56
            r6.restore()
        L56:
            return
        L57:
            r5 = move-exception
            r3.a = r1
            throw r5
    }

    public final void f(defpackage.xj0 r3, long r4, defpackage.ge6 r6, defpackage.b17 r7, defpackage.oo1 r8) {
            r2 = this;
            gj r0 = r2.a
            km r0 = r0.g
            int r1 = r0.c
            r0.d(r4)
            r0.f(r6)
            r0.g(r7)
            r0.e(r8)
            r4 = 3
            r0.b(r4)
            r2.e(r3)
            r0.b(r1)
            return
    }

    public final void g(defpackage.xj0 r9, defpackage.f80 r10, float r11, defpackage.ge6 r12, defpackage.b17 r13, defpackage.oo1 r14) {
            r8 = this;
            gj r0 = r8.a
            km r0 = r0.g
            int r1 = r0.c
            float r2 = r8.d()
            float r3 = r8.b()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            r6 = 32
            long r4 = r4 << r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            r0.c(r10, r2, r11)
            r0.f(r12)
            r0.g(r13)
            r0.e(r14)
            r10 = 3
            r0.b(r10)
            r8.e(r9)
            r0.b(r1)
            return
    }
}
