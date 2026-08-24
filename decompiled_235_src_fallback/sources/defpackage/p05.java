package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p05  reason: default package */
/* loaded from: classes.dex */
public final class p05 {
    public final android.text.TextPaint a;
    public final android.text.TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public p05(android.text.PrecomputedText.Params r2) {
            r1 = this;
            r1.<init>()
            android.text.TextPaint r0 = defpackage.yr1.j(r2)
            r1.a = r0
            android.text.TextDirectionHeuristic r0 = defpackage.yr1.i(r2)
            r1.b = r0
            int r0 = defpackage.yr1.a(r2)
            r1.c = r0
            int r2 = defpackage.yr1.A(r2)
            r1.d = r2
            return
    }

    public p05(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1c
            android.text.PrecomputedText$Params$Builder r0 = defpackage.o05.b(r3)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.yr1.g(r0, r5)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.yr1.B(r0, r6)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.yr1.h(r0, r4)
            defpackage.o05.m(r0)
        L1c:
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 != r4) goto L4
            goto La1
        L4:
            boolean r0 = r5 instanceof defpackage.p05
            if (r0 != 0) goto La
            goto La3
        La:
            p05 r5 = (defpackage.p05) r5
            int r0 = r5.c
            android.text.TextPaint r1 = r5.a
            int r2 = r4.c
            if (r2 == r0) goto L16
            goto La3
        L16:
            int r0 = r4.d
            int r2 = r5.d
            if (r0 == r2) goto L1e
            goto La3
        L1e:
            android.text.TextPaint r0 = r4.a
            float r2 = r0.getTextSize()
            float r3 = r1.getTextSize()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto La3
        L2e:
            float r2 = r0.getTextScaleX()
            float r3 = r1.getTextScaleX()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L3c
            goto La3
        L3c:
            float r2 = r0.getTextSkewX()
            float r3 = r1.getTextSkewX()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L49
            goto La3
        L49:
            float r2 = r0.getLetterSpacing()
            float r3 = r1.getLetterSpacing()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L56
            goto La3
        L56:
            java.lang.String r2 = r0.getFontFeatureSettings()
            java.lang.String r3 = r1.getFontFeatureSettings()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L65
            goto La3
        L65:
            int r2 = r0.getFlags()
            int r3 = r1.getFlags()
            if (r2 == r3) goto L70
            goto La3
        L70:
            android.os.LocaleList r2 = r0.getTextLocales()
            android.os.LocaleList r3 = r1.getTextLocales()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7f
            goto La3
        L7f:
            android.graphics.Typeface r2 = r0.getTypeface()
            if (r2 != 0) goto L8c
            android.graphics.Typeface r0 = r1.getTypeface()
            if (r0 == 0) goto L9b
            goto La3
        L8c:
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r1 = r1.getTypeface()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9b
            goto La3
        L9b:
            android.text.TextDirectionHeuristic r4 = r4.b
            android.text.TextDirectionHeuristic r5 = r5.b
            if (r4 != r5) goto La3
        La1:
            r4 = 1
            return r4
        La3:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r13 = this;
            android.text.TextPaint r0 = r13.a
            float r1 = r0.getTextSize()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            float r1 = r0.getTextScaleX()
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            float r1 = r0.getTextSkewX()
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            float r1 = r0.getLetterSpacing()
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            int r1 = r0.getFlags()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            android.os.LocaleList r7 = r0.getTextLocales()
            android.graphics.Typeface r8 = r0.getTypeface()
            boolean r0 = r0.isElegantTextHeight()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            int r0 = r13.c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            int r0 = r13.d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            android.text.TextDirectionHeuristic r10 = r13.b
            java.lang.Object[] r13 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            int r13 = java.util.Objects.hash(r13)
            return r13
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "textSize="
            r1.<init>(r2)
            android.text.TextPaint r2 = r4.a
            float r3 = r2.getTextSize()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textScaleX="
            r1.<init>(r3)
            float r3 = r2.getTextScaleX()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textSkewX="
            r1.<init>(r3)
            float r3 = r2.getTextSkewX()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", letterSpacing="
            r1.<init>(r3)
            float r3 = r2.getLetterSpacing()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", elegantTextHeight="
            r1.<init>(r3)
            boolean r3 = r2.isElegantTextHeight()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textLocale="
            r1.<init>(r3)
            android.os.LocaleList r3 = r2.getTextLocales()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", typeface="
            r1.<init>(r3)
            android.graphics.Typeface r3 = r2.getTypeface()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", variationSettings="
            r1.<init>(r3)
            java.lang.String r2 = defpackage.oc3.f(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", textDir="
            r1.<init>(r2)
            android.text.TextDirectionHeuristic r2 = r4.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", breakStrategy="
            r1.<init>(r2)
            int r2 = r4.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", hyphenationFrequency="
            r1.<init>(r2)
            int r4 = r4.d
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
