package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii2  reason: default package */
/* loaded from: classes.dex */
public abstract class ii2 implements defpackage.q96 {
    public static defpackage.e33 A;
    public static defpackage.e33 B;
    public static defpackage.e33 L;

    public static defpackage.p05 A(defpackage.qs r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            p05 r0 = new p05
            android.text.PrecomputedText$Params r8 = defpackage.pp.q(r8)
            r0.<init>(r8)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r8.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r4 = r8.getBreakStrategy()
            int r5 = r8.getHyphenationFrequency()
            android.text.method.TransformationMethod r6 = r8.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            if (r6 == 0) goto L2e
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L2e:
            r6 = 1
            r7 = 0
            if (r0 < r1) goto L5d
            int r0 = r8.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L5d
            java.util.Locale r8 = r8.getTextLocale()
            android.icu.text.DecimalFormatSymbols r8 = android.icu.text.DecimalFormatSymbols.getInstance(r8)
            java.lang.String[] r8 = defpackage.pp.e(r8)
            r8 = r8[r7]
            int r8 = r8.codePointAt(r7)
            byte r8 = java.lang.Character.getDirectionality(r8)
            if (r8 == r6) goto L5a
            r0 = 2
            if (r8 != r0) goto L57
            goto L5a
        L57:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L5a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L7f
        L5d:
            int r0 = r8.getLayoutDirection()
            if (r0 != r6) goto L64
            goto L65
        L64:
            r6 = r7
        L65:
            int r8 = r8.getTextDirection()
            switch(r8) {
                case 2: goto L7d;
                case 3: goto L7a;
                case 4: goto L77;
                case 5: goto L74;
                case 6: goto L7f;
                case 7: goto L71;
                default: goto L6c;
            }
        L6c:
            if (r6 == 0) goto L7f
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L7f
        L71:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L7f
        L74:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L7f
        L77:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L7f
        L7a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L7d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L7f:
            p05 r8 = new p05
            r8.<init>(r2, r3, r4, r5)
            return r8
    }

    public static final boolean B(android.text.Spanned r2, java.lang.Class r3) {
            r0 = -1
            int r1 = r2.length()
            int r3 = r2.nextSpanTransition(r0, r1, r3)
            int r2 = r2.length()
            if (r3 == r2) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static final boolean C(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "POST"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PUT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "DELETE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "MOVE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r1 = 0
            return r1
        L2e:
            r1 = 1
            return r1
    }

    public static final int D(java.lang.String r1) {
            r1.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            r0.getClass()
            java.lang.String r1 = r1.toUpperCase(r0)
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1929424669: goto L6c;
                case -1293819249: goto L5f;
                case 2541122: goto L56;
                case 2575053: goto L4d;
                case 75532016: goto L44;
                case 78726770: goto L3b;
                case 799745873: goto L32;
                case 1782884543: goto L29;
                case 1912639343: goto L20;
                case 2081781926: goto L17;
                default: goto L16;
            }
        L16:
            goto L74
        L17:
            java.lang.String r0 = "FRAMES"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L20:
            java.lang.String r0 = "MILLISECS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L29:
            java.lang.String r0 = "MINUTES"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L32:
            java.lang.String r0 = "SECS_AS_MINS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L3b:
            java.lang.String r0 = "SCORE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L78
            goto L74
        L44:
            java.lang.String r0 = "OTHER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L78
            goto L74
        L4d:
            java.lang.String r0 = "TIME"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L56:
            java.lang.String r0 = "SECS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L5f:
            java.lang.String r0 = "TIMESECS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            goto L74
        L68:
            r1 = 2131952146(0x7f130212, float:1.9540727E38)
            return r1
        L6c:
            java.lang.String r0 = "POINTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L78
        L74:
            r1 = 2131952148(0x7f130214, float:1.954073E38)
            return r1
        L78:
            r1 = 2131952144(0x7f130210, float:1.9540722E38)
            return r1
    }

    public static java.util.LinkedHashSet E(java.util.Set r6, java.lang.Object r7) {
            r6.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.size()
            int r1 = defpackage.c14.k0(r1)
            r0.<init>(r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = r1
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2d
            boolean r5 = defpackage.nb3.k(r3, r7)
            if (r5 == 0) goto L2d
            r2 = r4
            r4 = r1
        L2d:
            if (r4 == 0) goto L18
            r0.add(r3)
            goto L18
        L33:
            return r0
    }

    public static java.util.Set F(java.util.Set r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            java.util.Collection r4 = (java.util.Collection) r4
            goto L11
        Ld:
            java.util.List r4 = defpackage.gt0.k1(r4)
        L11:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = defpackage.gt0.p1(r3)
            return r3
        L1e:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L45
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()
            r2 = r4
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L2d
            r0.add(r1)
            goto L2d
        L44:
            return r0
        L45:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }

    public static java.util.Set G(java.lang.Object... r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = defpackage.c14.k0(r1)
            r0.<init>(r1)
            defpackage.fv.P0(r2, r0)
            return r0
    }

    public static final void I(defpackage.v96 r8, long r9, defpackage.qn2 r11) {
            xl4 r2 = new xl4
            r2.<init>(r9)
            wl4 r3 = defpackage.wl4.d0
            r9 = 3
            defpackage.ge7.p(r9, r3)
            gw0 r4 = defpackage.gw0.L
            t96 r0 = new t96
            gr1 r5 = defpackage.w96.e
            r6 = r11
            hw6 r6 = (defpackage.hw6) r6
            r7 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.v96.Y
            r8 = 0
            r1.j(r0, r8)
            return
    }

    public static final boolean J(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "HEAD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static java.util.LinkedHashSet K(java.util.Set r2, java.lang.Iterable r3) {
            r2.getClass()
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L16
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L29
        L23:
            int r0 = r2.size()
            int r1 = r0 * 2
        L29:
            int r0 = defpackage.c14.k0(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            defpackage.gt0.A0(r1, r3)
            return r1
    }

    public static java.util.LinkedHashSet L(java.util.Set r2, java.lang.Object r3) {
            r2.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = defpackage.c14.k0(r1)
            r0.<init>(r1)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    public static final java.lang.Object M(java.lang.Object r2, java.lang.Object r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto Le
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            return r2
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            return r0
    }

    public static void O(android.widget.TextView r3, int r4) {
            defpackage.np2.v(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            defpackage.pp.u(r3, r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L1e
            int r0 = r0.top
            goto L20
        L1e:
            int r0 = r0.ascent
        L20:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L36
            int r4 = r4 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L36:
            return
    }

    public static void P(android.widget.TextView r3, int r4) {
            defpackage.np2.v(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L14
            int r0 = r0.bottom
            goto L16
        L14:
            int r0 = r0.descent
        L16:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L2c
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L2c:
            return
    }

    public static void Q(android.widget.TextView r2, int r3) {
            defpackage.np2.v(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public static java.util.Set R(java.lang.Object r0) {
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r0.getClass()
            return r0
    }

    public static final void S(int r3, int r4, defpackage.wb6 r5) {
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = ~r3
            r3 = r3 & r4
            r4 = 0
            r1 = r4
        Lc:
            r2 = 32
            if (r1 >= r2) goto L20
            r2 = r3 & 1
            if (r2 == 0) goto L1b
            java.lang.String r2 = r5.g(r1)
            r0.add(r2)
        L1b:
            int r3 = r3 >>> 1
            int r1 = r1 + 1
            goto Lc
        L20:
            o64 r3 = new o64
            java.lang.String r5 = r5.a()
            r5.getClass()
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Field '"
            r1.<init>(r2)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = "' is required for type with serial name '"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "', but it was missing"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L6d
        L52:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Fields "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r1 = " are required for type with serial name '"
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = "', but they were missing"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
        L6d:
            r1 = 0
            r3.<init>(r4, r1, r0, r5)
            throw r3
    }

    public static final void T(int r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = ", message: "
            java.lang.String r3 = r3.concat(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.database.SQLException r4 = new android.database.SQLException
            r4.<init>(r3)
            throw r4
    }

    public static final defpackage.ab3 U(defpackage.wb6 r3) {
            java.lang.String r0 = r3.a()
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            np2 r1 = r3.e()
            bc6 r2 = defpackage.bc6.e
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L24
            boolean r3 = r3.c()
            if (r3 == 0) goto L21
            ab3 r3 = defpackage.ab3.ENUM_NULLABLE
            return r3
        L21:
            ab3 r3 = defpackage.ab3.ENUM
            return r3
        L24:
            java.lang.String r1 = "kotlin.Int"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L38
            boolean r3 = r3.c()
            if (r3 == 0) goto L35
            ab3 r3 = defpackage.ab3.INT_NULLABLE
            return r3
        L35:
            ab3 r3 = defpackage.ab3.INT
            return r3
        L38:
            java.lang.String r1 = "kotlin.Boolean"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4c
            boolean r3 = r3.c()
            if (r3 == 0) goto L49
            ab3 r3 = defpackage.ab3.BOOL_NULLABLE
            return r3
        L49:
            ab3 r3 = defpackage.ab3.BOOL
            return r3
        L4c:
            java.lang.String r1 = "kotlin.Double"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L60
            boolean r3 = r3.c()
            if (r3 == 0) goto L5d
            ab3 r3 = defpackage.ab3.DOUBLE_NULLABLE
            return r3
        L5d:
            ab3 r3 = defpackage.ab3.DOUBLE
            return r3
        L60:
            java.lang.String r1 = "kotlin.Float"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L74
            boolean r3 = r3.c()
            if (r3 == 0) goto L71
            ab3 r3 = defpackage.ab3.FLOAT_NULLABLE
            return r3
        L71:
            ab3 r3 = defpackage.ab3.FLOAT
            return r3
        L74:
            java.lang.String r1 = "kotlin.Long"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L88
            boolean r3 = r3.c()
            if (r3 == 0) goto L85
            ab3 r3 = defpackage.ab3.LONG_NULLABLE
            return r3
        L85:
            ab3 r3 = defpackage.ab3.LONG
            return r3
        L88:
            java.lang.String r1 = "kotlin.String"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L9c
            boolean r3 = r3.c()
            if (r3 == 0) goto L99
            ab3 r3 = defpackage.ab3.STRING_NULLABLE
            return r3
        L99:
            ab3 r3 = defpackage.ab3.STRING
            return r3
        L9c:
            java.lang.String r3 = "kotlin.IntArray"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto La7
            ab3 r3 = defpackage.ab3.INT_ARRAY
            return r3
        La7:
            java.lang.String r3 = "kotlin.DoubleArray"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lb2
            ab3 r3 = defpackage.ab3.DOUBLE_ARRAY
            return r3
        Lb2:
            java.lang.String r3 = "kotlin.BooleanArray"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lbd
            ab3 r3 = defpackage.ab3.BOOL_ARRAY
            return r3
        Lbd:
            java.lang.String r3 = "kotlin.FloatArray"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc8
            ab3 r3 = defpackage.ab3.FLOAT_ARRAY
            return r3
        Lc8:
            java.lang.String r3 = "kotlin.LongArray"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Ld3
            ab3 r3 = defpackage.ab3.LONG_ARRAY
            return r3
        Ld3:
            java.lang.String r3 = "kotlin.Array"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lde
            ab3 r3 = defpackage.ab3.ARRAY
            return r3
        Lde:
            java.lang.String r3 = "kotlin.collections.ArrayList"
            r1 = 0
            boolean r3 = defpackage.xs6.g0(r0, r3, r1)
            if (r3 == 0) goto Lea
            ab3 r3 = defpackage.ab3.LIST
            return r3
        Lea:
            ab3 r3 = defpackage.ab3.UNKNOWN
            return r3
    }

    public static final void V(defpackage.xg1 r9, java.lang.Object r10, defpackage.qn2 r11) {
            r0 = r9
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Le
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        Le:
            r0 = r9
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            z64 r0 = r0.X
            sm3 r9 = defpackage.nc1.f0(r9)
        L19:
            if (r9 == 0) goto La3
            if0 r1 = r9.B0
            java.lang.Object r1 = r1.g
            z64 r1 = (defpackage.z64) r1
            int r1 = r1.R
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto L90
        L29:
            if (r0 == 0) goto L90
            int r1 = r0.L
            r1 = r1 & r2
            if (r1 == 0) goto L8d
            r1 = r0
            r4 = r3
        L32:
            if (r1 == 0) goto L8d
            boolean r5 = r1 instanceof defpackage.ub7
            r6 = 1
            if (r5 == 0) goto L52
            ub7 r1 = (defpackage.ub7) r1
            java.lang.Object r5 = r1.n()
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L4f
            java.lang.Object r1 = r11.g(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
        L4f:
            if (r6 != 0) goto L88
            goto La3
        L52:
            int r5 = r1.L
            r5 = r5 & r2
            if (r5 == 0) goto L88
            boolean r5 = r1 instanceof defpackage.zg1
            if (r5 == 0) goto L88
            r5 = r1
            zg1 r5 = (defpackage.zg1) r5
            z64 r5 = r5.l0
            r7 = 0
        L61:
            if (r5 == 0) goto L85
            int r8 = r5.L
            r8 = r8 & r2
            if (r8 == 0) goto L82
            int r7 = r7 + 1
            if (r7 != r6) goto L6e
            r1 = r5
            goto L82
        L6e:
            if (r4 != 0) goto L79
            ua4 r4 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r4.<init>(r8)
        L79:
            if (r1 == 0) goto L7f
            r4.b(r1)
            r1 = r3
        L7f:
            r4.b(r5)
        L82:
            z64 r5 = r5.Y
            goto L61
        L85:
            if (r7 != r6) goto L88
            goto L32
        L88:
            z64 r1 = defpackage.nc1.A(r4)
            goto L32
        L8d:
            z64 r0 = r0.X
            goto L29
        L90:
            sm3 r9 = r9.v()
            if (r9 == 0) goto La0
            if0 r0 = r9.B0
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L19
        La0:
            r0 = r3
            goto L19
        La3:
            return
    }

    public static final void W(defpackage.ub7 r10, defpackage.qn2 r11) {
            r0 = r10
            z64 r0 = (defpackage.z64) r0
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r1)
        Le:
            z64 r0 = r0.A
            z64 r0 = r0.X
            sm3 r1 = defpackage.nc1.f0(r10)
        L16:
            if (r1 == 0) goto Lae
            if0 r2 = r1.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto L9b
        L26:
            if (r0 == 0) goto L9b
            int r2 = r0.L
            r2 = r2 & r3
            if (r2 == 0) goto L98
            r2 = r0
            r5 = r4
        L2f:
            if (r2 == 0) goto L98
            boolean r6 = r2 instanceof defpackage.ub7
            r7 = 1
            if (r6 == 0) goto L5d
            ub7 r2 = (defpackage.ub7) r2
            java.lang.Object r6 = r10.n()
            java.lang.Object r8 = r2.n()
            boolean r6 = defpackage.nb3.k(r6, r8)
            if (r6 == 0) goto L5a
            java.lang.Class r6 = r10.getClass()
            java.lang.Class r8 = r2.getClass()
            if (r6 != r8) goto L5a
            java.lang.Object r2 = r11.g(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
        L5a:
            if (r7 != 0) goto L93
            goto Lae
        L5d:
            int r6 = r2.L
            r6 = r6 & r3
            if (r6 == 0) goto L93
            boolean r6 = r2 instanceof defpackage.zg1
            if (r6 == 0) goto L93
            r6 = r2
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r8 = 0
        L6c:
            if (r6 == 0) goto L90
            int r9 = r6.L
            r9 = r9 & r3
            if (r9 == 0) goto L8d
            int r8 = r8 + 1
            if (r8 != r7) goto L79
            r2 = r6
            goto L8d
        L79:
            if (r5 != 0) goto L84
            ua4 r5 = new ua4
            r9 = 16
            z64[] r9 = new defpackage.z64[r9]
            r5.<init>(r9)
        L84:
            if (r2 == 0) goto L8a
            r5.b(r2)
            r2 = r4
        L8a:
            r5.b(r6)
        L8d:
            z64 r6 = r6.Y
            goto L6c
        L90:
            if (r8 != r7) goto L93
            goto L2f
        L93:
            z64 r2 = defpackage.nc1.A(r5)
            goto L2f
        L98:
            z64 r0 = r0.X
            goto L26
        L9b:
            sm3 r1 = r1.v()
            if (r1 == 0) goto Lab
            if0 r0 = r1.B0
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L16
        Lab:
            r0 = r4
            goto L16
        Lae:
            return
    }

    public static final void X(defpackage.z64 r11, java.lang.String r12, defpackage.qn2 r13) {
            z64 r0 = r11.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            ua4 r0 = new ua4
            r1 = 16
            z64[] r2 = new defpackage.z64[r1]
            r0.<init>(r2)
            z64 r11 = r11.A
            z64 r2 = r11.Y
            if (r2 != 0) goto L1e
            defpackage.nc1.z(r0, r11)
            goto L21
        L1e:
            r0.b(r2)
        L21:
            int r11 = r0.L
            if (r11 == 0) goto Laa
            int r11 = r11 + (-1)
            java.lang.Object r11 = r0.l(r11)
            z64 r11 = (defpackage.z64) r11
            int r2 = r11.R
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            if (r2 == 0) goto La5
            r2 = r11
        L35:
            if (r2 == 0) goto La5
            boolean r4 = r2.j0
            if (r4 == 0) goto La5
            int r4 = r2.L
            r4 = r4 & r3
            if (r4 == 0) goto La2
            r4 = 0
            r5 = r2
            r6 = r4
        L43:
            if (r5 == 0) goto La2
            boolean r7 = r5 instanceof defpackage.ub7
            if (r7 == 0) goto L68
            ub7 r5 = (defpackage.ub7) r5
            java.lang.Object r7 = r5.n()
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L5c
            java.lang.Object r5 = r13.g(r5)
            tb7 r5 = (defpackage.tb7) r5
            goto L5e
        L5c:
            tb7 r5 = defpackage.tb7.ContinueTraversal
        L5e:
            tb7 r7 = defpackage.tb7.CancelTraversal
            if (r5 != r7) goto L63
            goto Laa
        L63:
            tb7 r7 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            if (r5 == r7) goto L21
            goto L9d
        L68:
            int r7 = r5.L
            r7 = r7 & r3
            if (r7 == 0) goto L9d
            boolean r7 = r5 instanceof defpackage.zg1
            if (r7 == 0) goto L9d
            r7 = r5
            zg1 r7 = (defpackage.zg1) r7
            z64 r7 = r7.l0
            r8 = 0
        L77:
            r9 = 1
            if (r7 == 0) goto L9a
            int r10 = r7.L
            r10 = r10 & r3
            if (r10 == 0) goto L97
            int r8 = r8 + 1
            if (r8 != r9) goto L85
            r5 = r7
            goto L97
        L85:
            if (r6 != 0) goto L8e
            ua4 r6 = new ua4
            z64[] r9 = new defpackage.z64[r1]
            r6.<init>(r9)
        L8e:
            if (r5 == 0) goto L94
            r6.b(r5)
            r5 = r4
        L94:
            r6.b(r7)
        L97:
            z64 r7 = r7.Y
            goto L77
        L9a:
            if (r8 != r9) goto L9d
            goto L43
        L9d:
            z64 r5 = defpackage.nc1.A(r6)
            goto L43
        La2:
            z64 r2 = r2.Y
            goto L35
        La5:
            defpackage.nc1.z(r0, r11)
            goto L21
        Laa:
            return
    }

    public static final void Y(defpackage.ub7 r12, defpackage.qn2 r13) {
            r0 = r12
            z64 r0 = (defpackage.z64) r0
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitSubtreeIf called on an unattached node"
            defpackage.p53.c(r1)
        Le:
            ua4 r1 = new ua4
            r2 = 16
            z64[] r3 = new defpackage.z64[r2]
            r1.<init>(r3)
            z64 r0 = r0.A
            z64 r3 = r0.Y
            if (r3 != 0) goto L21
            defpackage.nc1.z(r1, r0)
            goto L24
        L21:
            r1.b(r3)
        L24:
            int r0 = r1.L
            if (r0 == 0) goto Lbb
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.l(r0)
            z64 r0 = (defpackage.z64) r0
            int r3 = r0.R
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto Lb6
            r3 = r0
        L38:
            if (r3 == 0) goto Lb6
            boolean r5 = r3.j0
            if (r5 == 0) goto Lb6
            int r5 = r3.L
            r5 = r5 & r4
            if (r5 == 0) goto Lb3
            r5 = 0
            r6 = r3
            r7 = r5
        L46:
            if (r6 == 0) goto Lb3
            boolean r8 = r6 instanceof defpackage.ub7
            if (r8 == 0) goto L79
            ub7 r6 = (defpackage.ub7) r6
            java.lang.Object r8 = r12.n()
            java.lang.Object r9 = r6.n()
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L6d
            java.lang.Class r8 = r12.getClass()
            java.lang.Class r9 = r6.getClass()
            if (r8 != r9) goto L6d
            java.lang.Object r6 = r13.g(r6)
            tb7 r6 = (defpackage.tb7) r6
            goto L6f
        L6d:
            tb7 r6 = defpackage.tb7.ContinueTraversal
        L6f:
            tb7 r8 = defpackage.tb7.CancelTraversal
            if (r6 != r8) goto L74
            goto Lbb
        L74:
            tb7 r8 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            if (r6 == r8) goto L24
            goto Lae
        L79:
            int r8 = r6.L
            r8 = r8 & r4
            if (r8 == 0) goto Lae
            boolean r8 = r6 instanceof defpackage.zg1
            if (r8 == 0) goto Lae
            r8 = r6
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = 0
        L88:
            r10 = 1
            if (r8 == 0) goto Lab
            int r11 = r8.L
            r11 = r11 & r4
            if (r11 == 0) goto La8
            int r9 = r9 + 1
            if (r9 != r10) goto L96
            r6 = r8
            goto La8
        L96:
            if (r7 != 0) goto L9f
            ua4 r7 = new ua4
            z64[] r10 = new defpackage.z64[r2]
            r7.<init>(r10)
        L9f:
            if (r6 == 0) goto La5
            r7.b(r6)
            r6 = r5
        La5:
            r7.b(r8)
        La8:
            z64 r8 = r8.Y
            goto L88
        Lab:
            if (r9 != r10) goto Lae
            goto L46
        Lae:
            z64 r6 = defpackage.nc1.A(r7)
            goto L46
        Lb3:
            z64 r3 = r3.Y
            goto L38
        Lb6:
            defpackage.nc1.z(r1, r0)
            goto L24
        Lbb:
            return
    }

    public static android.view.ActionMode.Callback Z(android.view.ActionMode.Callback r2) {
            boolean r0 = r2 instanceof defpackage.z47
            if (r0 == 0) goto Le
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Le
            z47 r2 = (defpackage.z47) r2
            android.view.ActionMode$Callback r2 = r2.a
        Le:
            return r2
    }

    public static final int a0(int r3) {
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            r0 = r0 & r3
            r1 = 613566756(0x24924924, float:6.344131E-17)
            r1 = r1 & r3
            r2 = -920350135(0xffffffffc9249249, float:-674084.56)
            r3 = r3 & r2
            int r2 = r1 >> 1
            r2 = r2 | r0
            r3 = r3 | r2
            int r0 = r0 << 1
            r0 = r0 & r1
            r3 = r3 | r0
            return r3
    }

    public static java.lang.Class b0(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L3e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L3e:
            return r1
    }

    public static android.view.ActionMode.Callback c0(android.view.ActionMode.Callback r2, android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            r1 = 27
            if (r0 > r1) goto L17
            boolean r0 = r2 instanceof defpackage.z47
            if (r0 != 0) goto L17
            if (r2 != 0) goto L11
            goto L17
        L11:
            z47 r0 = new z47
            r0.<init>(r2, r3)
            return r0
        L17:
            return r2
    }

    public static final void e(java.lang.String r27, java.lang.String r28, defpackage.l93 r29, boolean r30, int r31, defpackage.qn2 r32, defpackage.on2 r33, defpackage.px0 r34, int r35, int r36) {
            r1 = r27
            r3 = r29
            r11 = r30
            r0 = r34
            xq2 r0 = (defpackage.xq2) r0
            r2 = -2098701988(0xffffffff82e8595c, float:-3.4140626E-37)
            r0.d0(r2)
            boolean r2 = r0.f(r1)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = 2
        L19:
            r2 = r35 | r2
            r5 = r28
            boolean r6 = r0.f(r5)
            if (r6 == 0) goto L26
            r6 = 32
            goto L28
        L26:
            r6 = 16
        L28:
            r2 = r2 | r6
            boolean r6 = r0.h(r3)
            if (r6 == 0) goto L32
            r6 = 256(0x100, float:3.59E-43)
            goto L34
        L32:
            r6 = 128(0x80, float:1.8E-43)
        L34:
            r2 = r2 | r6
            boolean r6 = r0.g(r11)
            if (r6 == 0) goto L3e
            r6 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r6 = 1024(0x400, float:1.435E-42)
        L40:
            r2 = r2 | r6
            r6 = r32
            boolean r7 = r0.h(r6)
            if (r7 == 0) goto L4c
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L4e
        L4c:
            r7 = 65536(0x10000, float:9.1835E-41)
        L4e:
            r2 = r2 | r7
            r7 = r36 & 64
            r8 = 1048576(0x100000, float:1.469368E-39)
            if (r7 == 0) goto L5b
            r9 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r9
            r9 = r33
            goto L68
        L5b:
            r9 = r33
            boolean r10 = r0.h(r9)
            if (r10 == 0) goto L65
            r10 = r8
            goto L67
        L65:
            r10 = 524288(0x80000, float:7.34684E-40)
        L67:
            r2 = r2 | r10
        L68:
            r10 = 599187(0x92493, float:8.3964E-40)
            r10 = r10 & r2
            r12 = 599186(0x92492, float:8.39638E-40)
            r13 = 1
            r14 = 0
            if (r10 == r12) goto L75
            r10 = r13
            goto L76
        L75:
            r10 = r14
        L76:
            r12 = r2 & 1
            boolean r10 = r0.S(r12, r10)
            if (r10 == 0) goto L1d4
            if (r7 == 0) goto L82
            r7 = 0
            goto L83
        L82:
            r7 = r9
        L83:
            gu r9 = new gu
            i r10 = new i
            r10.<init>(r13)
            r12 = 1082130432(0x40800000, float:4.0)
            r9.<init>(r12, r13, r10)
            c40 r10 = defpackage.d90.k0
            r12 = 6
            yt0 r9 = defpackage.wt0.a(r9, r10, r0, r12)
            long r4 = r0.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r0.l()
            x64 r10 = defpackage.x64.a
            a74 r12 = defpackage.l.E(r0, r10)
            ix0 r15 = defpackage.jx0.i
            r15.getClass()
            iy0 r15 = defpackage.ix0.b
            r0.f0()
            boolean r13 = r0.S
            if (r13 == 0) goto Lb8
            r0.k(r15)
            goto Lbb
        Lb8:
            r0.o0()
        Lbb:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r0, r13, r9)
            pn r9 = defpackage.ix0.e
            defpackage.yh2.K(r0, r9, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r0, r5, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r0, r4)
            pn r4 = defpackage.ix0.d
            defpackage.yh2.K(r0, r4, r12)
            r4 = 1065353216(0x3f800000, float:1.0)
            a74 r4 = defpackage.dj6.c(r10, r4)
            xf1 r19 = defpackage.mb3.J(r0)
            xh3 r13 = new xh3
            r5 = 115(0x73, float:1.61E-43)
            r9 = 3
            r10 = r31
            r13.<init>(r14, r9, r10, r5)
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r2
            if (r5 != r8) goto Lf3
            r5 = 1
            goto Lf4
        Lf3:
            r5 = r14
        Lf4:
            java.lang.Object r8 = r0.P()
            if (r5 != 0) goto Lfe
            vs0 r5 = defpackage.ox0.a
            if (r8 != r5) goto L107
        Lfe:
            mn0 r8 = new mn0
            r5 = 4
            r8.<init>(r5, r7)
            r0.l0(r8)
        L107:
            qn2 r8 = (defpackage.qn2) r8
            r5 = r14
            vh3 r14 = new vh3
            r9 = 62
            r14.<init>(r9, r8)
            g5 r8 = new g5
            r8.<init>(r1)
            r9 = -1084697396(0xffffffffbf58d4cc, float:-0.846997)
            zv0 r9 = defpackage.n16.I(r9, r8, r0)
            int r8 = r2 >> 3
            r8 = r8 & 14
            r12 = 1573248(0x180180, float:2.20459E-39)
            r8 = r8 | r12
            int r12 = r2 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = r8 | r12
            int r2 = r2 >> 9
            r2 = r2 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r23 = 494520(0x78bb8, float:6.9297E-40)
            r8 = r7
            r7 = 0
            r12 = r8
            r8 = 0
            r10 = 0
            r15 = r12
            r12 = 0
            r17 = r15
            r15 = 1
            r18 = 1
            r16 = 0
            r20 = r17
            r17 = 0
            r22 = r18
            r18 = 0
            r22 = r20
            r20 = r0
            r0 = r22
            r22 = r2
            r2 = r5
            r5 = r6
            r6 = r4
            r4 = r28
            defpackage.zo4.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = r20
            int r5 = r3.A
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r3.B
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            r6 = 2131952139(0x7f13020b, float:1.9540712E38)
            java.lang.String r5 = defpackage.yh2.N(r6, r5, r4)
            nq6 r6 = defpackage.ye7.b
            java.lang.Object r6 = r4.j(r6)
            xe7 r6 = (defpackage.xe7) r6
            s47 r6 = r6.l
            if (r30 == 0) goto L195
            r7 = -1347124725(0xffffffffafb4820b, float:-3.283421E-10)
            r4.b0(r7)
            nq6 r7 = defpackage.vt0.a
            java.lang.Object r7 = r4.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            long r7 = r7.b()
        L191:
            r4.p(r2)
            goto L1a8
        L195:
            r7 = -1347123697(0xffffffffafb4860f, float:-3.2837064E-10)
            r4.b0(r7)
            nq6 r7 = defpackage.vt0.a
            java.lang.Object r7 = r4.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            long r7 = r7.f()
            goto L191
        L1a8:
            r25 = 0
            r26 = 65530(0xfffa, float:9.1827E-41)
            r23 = r4
            r4 = r5
            r5 = 0
            r22 = r6
            r6 = r7
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            defpackage.x37.b(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r2 = 1
            r4.p(r2)
            r7 = r0
            goto L1d9
        L1d4:
            r4 = r0
            r4.V()
            r7 = r9
        L1d9:
            cf5 r10 = r4.t()
            if (r10 == 0) goto L1f2
            qj3 r0 = new qj3
            r2 = r28
            r4 = r30
            r5 = r31
            r6 = r32
            r8 = r35
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d = r0
        L1f2:
            return
    }

    public static final void f(java.lang.String r25, java.lang.String r26, defpackage.on2 r27, defpackage.a74 r28, defpackage.px0 r29, int r30) {
            r0 = r25
            r1 = r26
            r2 = r28
            r27.getClass()
            r8 = r29
            xq2 r8 = (defpackage.xq2) r8
            r3 = -33197833(0xfffffffffe0570f7, float:-4.434347E37)
            r8.d0(r3)
            boolean r3 = r8.f(r0)
            if (r3 == 0) goto L1b
            r3 = 4
            goto L1c
        L1b:
            r3 = 2
        L1c:
            r3 = r30 | r3
            boolean r4 = r8.f(r1)
            if (r4 == 0) goto L27
            r4 = 32
            goto L29
        L27:
            r4 = 16
        L29:
            r3 = r3 | r4
            r4 = r27
            boolean r5 = r8.h(r4)
            if (r5 == 0) goto L35
            r5 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r5 = 128(0x80, float:1.8E-43)
        L37:
            r3 = r3 | r5
            boolean r5 = r8.f(r2)
            if (r5 == 0) goto L41
            r5 = 2048(0x800, float:2.87E-42)
            goto L43
        L41:
            r5 = 1024(0x400, float:1.435E-42)
        L43:
            r3 = r3 | r5
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r5 = r3 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r5 == r6) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            r6 = r3 & 1
            boolean r5 = r8.S(r6, r5)
            if (r5 == 0) goto L1f8
            es7 r5 = defpackage.bl2.F(r8)
            r6 = 1090519040(0x41000000, float:8.0)
            y16 r6 = defpackage.z16.b(r6)
            java.lang.Object r10 = r8.P()
            vs0 r12 = defpackage.ox0.a
            if (r10 != r12) goto L6d
            r94 r10 = defpackage.i61.f(r8)
        L6d:
            r13 = r10
            r94 r13 = (defpackage.r94) r13
            r10 = 6
            qa4 r10 = defpackage.bw7.a(r13, r8, r10)
            a74 r12 = defpackage.u24.g(r2, r6)
            long r14 = r5.c
            jy2 r7 = defpackage.u24.m
            a74 r7 = defpackage.vy7.L(r12, r14, r7)
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L90
            long r14 = r5.j
            goto L92
        L90:
            long r14 = r5.f
        L92:
            r10 = 1065353216(0x3f800000, float:1.0)
            a74 r12 = defpackage.ak7.I(r7, r10, r14, r6)
            r16 = 0
            r18 = 28
            r14 = 0
            r15 = 0
            r17 = r4
            a74 r4 = defpackage.mb3.t(r12, r13, r14, r15, r16, r17, r18)
            r6 = 1096810496(0x41600000, float:14.0)
            r7 = 1092616192(0x41200000, float:10.0)
            r10 = 1093664768(0x41300000, float:11.0)
            a74 r4 = defpackage.ge7.R(r4, r10, r7, r6, r7)
            d40 r6 = defpackage.d90.i0
            du r7 = defpackage.ju.a
            r10 = 48
            l26 r6 = defpackage.k26.a(r7, r6, r8, r10)
            long r12 = r8.T
            int r7 = java.lang.Long.hashCode(r12)
            xv4 r10 = r8.l()
            a74 r4 = defpackage.l.E(r8, r4)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r8.f0()
            boolean r13 = r8.S
            if (r13 == 0) goto Ld8
            r8.k(r12)
            goto Ldb
        Ld8:
            r8.o0()
        Ldb:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r8, r13, r6)
            pn r14 = defpackage.ix0.e
            defpackage.yh2.K(r8, r14, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            pn r15 = defpackage.ix0.g
            defpackage.yh2.K(r8, r15, r6)
            ne r6 = defpackage.ix0.h
            defpackage.yh2.F(r8, r6)
            pn r7 = defpackage.ix0.d
            defpackage.yh2.K(r8, r7, r4)
            r4 = r3
            e33 r3 = defpackage.hi2.A()
            r10 = r6
            r16 = r7
            long r6 = r5.l
            r9 = 1102053376(0x41b00000, float:22.0)
            r18 = 16
            x64 r11 = defpackage.x64.a
            a74 r9 = defpackage.dj6.i(r11, r9)
            r19 = r5
            r5 = r9
            r9 = 432(0x1b0, float:6.05E-43)
            r20 = r10
            r10 = 0
            r21 = r4
            r4 = 0
            r2 = r16
            r0 = r20
            r1 = 0
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r3 = 1091567616(0x41100000, float:9.0)
            a74 r3 = defpackage.dj6.l(r11, r3)
            defpackage.gi2.h(r8, r3)
            eu r3 = defpackage.ju.c
            c40 r4 = defpackage.d90.k0
            yt0 r3 = defpackage.wt0.a(r3, r4, r8, r1)
            long r4 = r8.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r8.l()
            a74 r6 = defpackage.l.E(r8, r11)
            r8.f0()
            boolean r7 = r8.S
            if (r7 == 0) goto L149
            r8.k(r12)
            goto L14c
        L149:
            r8.o0()
        L14c:
            defpackage.yh2.K(r8, r13, r3)
            defpackage.yh2.K(r8, r14, r5)
            defpackage.i61.w(r4, r8, r15, r8, r0)
            defpackage.yh2.K(r8, r2, r6)
            r0 = r19
            long r2 = r0.g
            r4 = 13
            long r4 = defpackage.hi2.E(r4)
            long r11 = defpackage.hi2.E(r18)
            oj2 r6 = defpackage.oj2.d0
            r7 = r21 & 14
            r9 = 199680(0x30c00, float:2.79811E-40)
            r20 = r7 | r9
            r21 = 3126(0xc36, float:4.38E-42)
            r22 = 119762(0x1d3d2, float:1.67822E-40)
            r17 = r1
            r1 = 0
            r7 = 0
            r19 = r8
            r8 = 0
            r10 = 0
            r13 = 2
            r14 = 0
            r15 = 1
            r16 = 0
            r18 = r17
            r17 = 0
            r23 = r18
            r18 = 0
            r24 = r0
            r0 = r25
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r19
            int r1 = r26.length()
            if (r1 <= 0) goto L1a3
            r1 = r26
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L1a5
            r2 = r1
            goto L1a6
        L1a3:
            r1 = r26
        L1a5:
            r2 = 0
        L1a6:
            if (r2 == 0) goto L1e6
            r3 = -1911861542(0xffffffff8e0b4eda, float:-1.7171038E-30)
            r8.b0(r3)
            r3 = r24
            long r3 = r3.i
            sr2 r7 = defpackage.qs7.c
            r5 = 9
            long r5 = defpackage.hi2.E(r5)
            r9 = 11
            long r11 = defpackage.hi2.E(r9)
            r21 = 3126(0xc36, float:4.38E-42)
            r22 = 119730(0x1d3b2, float:1.67777E-40)
            r1 = 0
            r0 = r2
            r2 = r3
            r4 = r5
            r6 = 0
            r19 = r8
            r8 = 0
            r10 = 0
            r13 = 2
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1575936(0x180c00, float:2.208357E-39)
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r19
            r1 = 0
            r8.p(r1)
        L1e4:
            r0 = 1
            goto L1f1
        L1e6:
            r1 = 0
            r0 = -1911548783(0xffffffff8e101491, float:-1.7759273E-30)
            r8.b0(r0)
            r8.p(r1)
            goto L1e4
        L1f1:
            r8.p(r0)
            r8.p(r0)
            goto L1fb
        L1f8:
            r8.V()
        L1fb:
            cf5 r7 = r8.t()
            if (r7 == 0) goto L213
            dx5 r0 = new dx5
            r6 = 0
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L213:
            return
    }

    public static defpackage.pe3 g(defpackage.qn2 r12) {
            hd3 r0 = defpackage.id3.d
            r0.getClass()
            rd3 r1 = new rd3
            r1.<init>()
            td3 r2 = r0.a
            boolean r3 = r2.b
            r1.a = r3
            boolean r3 = r2.a
            r1.b = r3
            java.lang.String r7 = r2.c
            java.lang.String r8 = r2.d
            zq0 r10 = r2.f
            boolean r9 = r2.e
            jd1 r0 = r0.b
            boolean r11 = r2.g
            r12.g(r1)
            java.lang.String r12 = "    "
            boolean r12 = defpackage.nb3.k(r7, r12)
            if (r12 == 0) goto L43
            td3 r4 = new td3
            boolean r5 = r1.b
            boolean r6 = r1.a
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            pe3 r12 = new pe3
            r0.getClass()
            r12.<init>(r4, r0)
            jd1 r1 = defpackage.ic6.a
            if (r0 == r1) goto L42
            zq0 r0 = defpackage.zq0.NONE
        L42:
            return r12
        L43:
            java.lang.String r12 = "Indent should not be specified when default printing mode is used"
            defpackage.i.h(r12)
            r12 = 0
            return r12
    }

    public static final void h(defpackage.uj3 r16, defpackage.on2 r17, defpackage.eo2 r18, defpackage.px0 r19, int r20) {
            r1 = r16
            r17.getClass()
            r18.getClass()
            r5 = r19
            xq2 r5 = (defpackage.xq2) r5
            r0 = -2077848882(0xffffffff84268ace, float:-1.9576942E-36)
            r5.d0(r0)
            boolean r0 = r5.f(r1)
            r2 = 4
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r20 | r0
            r7 = r17
            boolean r3 = r5.h(r7)
            if (r3 == 0) goto L29
            r3 = 32
            goto L2b
        L29:
            r3 = 16
        L2b:
            r0 = r0 | r3
            r3 = r18
            boolean r4 = r5.h(r3)
            if (r4 == 0) goto L37
            r4 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r4 = 128(0x80, float:1.8E-43)
        L39:
            r0 = r0 | r4
            r4 = r0 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r8 = 1
            r9 = 0
            if (r4 == r6) goto L44
            r4 = r8
            goto L45
        L44:
            r4 = r9
        L45:
            r6 = r0 & 1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L178
            if (r1 != 0) goto L61
            cf5 r6 = r5.t()
            if (r6 == 0) goto L191
            pj3 r0 = new pj3
            r5 = 0
            r4 = r20
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L5e:
            r6.d = r0
            return
        L61:
            int r3 = r1.c
            int r4 = r1.b
            int r6 = r1.e
            int r7 = r1.d
            nj3 r10 = r1.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r11 = new java.lang.Object[]{r10, r11, r12, r13, r14}
            r12 = r0 & 14
            if (r12 != r2) goto L85
            r13 = r8
            goto L86
        L85:
            r13 = r9
        L86:
            java.lang.Object r14 = r5.P()
            vs0 r15 = defpackage.ox0.a
            if (r13 != 0) goto L90
            if (r14 != r15) goto L98
        L90:
            rj3 r14 = new rj3
            r14.<init>(r1, r9)
            r5.l0(r14)
        L98:
            on2 r14 = (defpackage.on2) r14
            java.lang.Object r11 = defpackage.qo2.I(r11, r14, r5, r9)
            qa4 r11 = (defpackage.qa4) r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r4, r3, r13, r14}
            if (r12 != r2) goto Lb8
            r2 = r8
            goto Lb9
        Lb8:
            r2 = r9
        Lb9:
            java.lang.Object r4 = r5.P()
            if (r2 != 0) goto Lc1
            if (r4 != r15) goto Lc9
        Lc1:
            rj3 r4 = new rj3
            r4.<init>(r1, r8)
            r5.l0(r4)
        Lc9:
            on2 r4 = (defpackage.on2) r4
            java.lang.Object r2 = defpackage.qo2.I(r3, r4, r5, r9)
            r12 = r2
            qa4 r12 = (defpackage.qa4) r12
            l93 r2 = new l93
            r2.<init>(r9, r7, r8)
            r3 = r10
            l93 r10 = new l93
            r10.<init>(r9, r6, r8)
            java.lang.Object r4 = r11.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = defpackage.xs6.h0(r4)
            r6 = 0
            if (r4 == 0) goto Lf6
            int r7 = r4.intValue()
            if (r7 < 0) goto Lf6
            int r13 = r2.B
            if (r7 > r13) goto Lf6
            r13 = r4
            goto Lf7
        Lf6:
            r13 = r6
        Lf7:
            java.lang.Object r4 = r12.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = defpackage.xs6.h0(r4)
            if (r4 == 0) goto L10f
            int r7 = r4.intValue()
            if (r7 < 0) goto L10f
            int r14 = r10.B
            if (r7 > r14) goto L10f
            r14 = r4
            goto L110
        L10f:
            r14 = r6
        L110:
            java.lang.Object r4 = r11.getValue()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L120
            if (r13 != 0) goto L120
            r4 = r8
            goto L122
        L120:
            r4 = r8
            r8 = r9
        L122:
            java.lang.Object r6 = r12.getValue()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L131
            if (r14 != 0) goto L131
            goto L132
        L131:
            r4 = r9
        L132:
            int r3 = defpackage.xk2.n(r3)
            java.lang.String r3 = defpackage.yh2.O(r5, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r6 = 2131952129(0x7f130201, float:1.9540692E38)
            java.lang.String r3 = defpackage.yh2.N(r6, r3, r5)
            sj3 r6 = new sj3
            r15 = r18
            r7 = r2
            r9 = r11
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 667490787(0x27c919e3, float:5.5816773E-15)
            zv0 r2 = defpackage.n16.I(r2, r6, r5)
            p4 r6 = new p4
            r11 = 7
            r7 = r17
            r10 = r18
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r4 = 377972581(0x16876765, float:2.1875677E-25)
            zv0 r4 = defpackage.n16.I(r4, r6, r5)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r0 | 3456(0xd80, float:4.843E-42)
            r7 = 16
            r0 = r3
            r3 = r4
            r4 = 0
            r1 = r17
            defpackage.q60.a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L17b
        L178:
            r5.V()
        L17b:
            cf5 r6 = r5.t()
            if (r6 == 0) goto L191
            pj3 r0 = new pj3
            r5 = 1
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            goto L5e
        L191:
            return
    }

    public static final void i(defpackage.a74 r37, defpackage.ip3 r38, defpackage.lu2 r39, defpackage.lq4 r40, defpackage.sd2 r41, boolean r42, defpackage.sg r43, defpackage.iu r44, defpackage.fu r45, defpackage.qn2 r46, defpackage.px0 r47, int r48, int r49) {
            r1 = r37
            r3 = r38
            r6 = r39
            r4 = r40
            r0 = r42
            r7 = r44
            r8 = r45
            r12 = r46
            r13 = r48
            r14 = r47
            xq2 r14 = (defpackage.xq2) r14
            r2 = 708740370(0x2a3e8512, float:1.6921558E-13)
            r14.d0(r2)
            r2 = r13 & 6
            if (r2 != 0) goto L2b
            boolean r2 = r14.f(r1)
            if (r2 == 0) goto L28
            r2 = 4
            goto L29
        L28:
            r2 = 2
        L29:
            r2 = r2 | r13
            goto L2c
        L2b:
            r2 = r13
        L2c:
            r9 = r13 & 48
            if (r9 != 0) goto L3c
            boolean r9 = r14.f(r3)
            if (r9 == 0) goto L39
            r9 = 32
            goto L3b
        L39:
            r9 = 16
        L3b:
            r2 = r2 | r9
        L3c:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L55
            r9 = r13 & 512(0x200, float:7.17E-43)
            if (r9 != 0) goto L49
            boolean r9 = r14.f(r6)
            goto L4d
        L49:
            boolean r9 = r14.h(r6)
        L4d:
            if (r9 == 0) goto L52
            r9 = 256(0x100, float:3.59E-43)
            goto L54
        L52:
            r9 = 128(0x80, float:1.8E-43)
        L54:
            r2 = r2 | r9
        L55:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L65
            boolean r9 = r14.f(r4)
            if (r9 == 0) goto L62
            r9 = 2048(0x800, float:2.87E-42)
            goto L64
        L62:
            r9 = 1024(0x400, float:1.435E-42)
        L64:
            r2 = r2 | r9
        L65:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            r10 = 0
            if (r9 != 0) goto L76
            boolean r9 = r14.g(r10)
            if (r9 == 0) goto L73
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L75
        L73:
            r9 = 8192(0x2000, float:1.148E-41)
        L75:
            r2 = r2 | r9
        L76:
            r9 = 196608(0x30000, float:2.75506E-40)
            r17 = r13 & r9
            r5 = 1
            r18 = r9
            if (r17 != 0) goto L8c
            boolean r17 = r14.g(r5)
            if (r17 == 0) goto L88
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L8a
        L88:
            r17 = 65536(0x10000, float:9.1835E-41)
        L8a:
            r2 = r2 | r17
        L8c:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r19 = r13 & r17
            r5 = r41
            if (r19 != 0) goto La1
            boolean r21 = r14.f(r5)
            if (r21 == 0) goto L9d
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L9f
        L9d:
            r21 = 524288(0x80000, float:7.34684E-40)
        L9f:
            r2 = r2 | r21
        La1:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = r13 & r21
            if (r22 != 0) goto Lb4
            boolean r22 = r14.g(r0)
            if (r22 == 0) goto Lb0
            r22 = 8388608(0x800000, float:1.1754944E-38)
            goto Lb2
        Lb0:
            r22 = 4194304(0x400000, float:5.877472E-39)
        Lb2:
            r2 = r2 | r22
        Lb4:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r13 & r22
            r9 = r43
            if (r22 != 0) goto Lc9
            boolean r23 = r14.f(r9)
            if (r23 == 0) goto Lc5
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc7
        Lc5:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        Lc7:
            r2 = r2 | r23
        Lc9:
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r13 & r23
            if (r23 != 0) goto Ldc
            boolean r23 = r14.f(r7)
            if (r23 == 0) goto Ld8
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lda
        Ld8:
            r23 = 268435456(0x10000000, float:2.524355E-29)
        Lda:
            r2 = r2 | r23
        Ldc:
            r23 = r49 & 6
            if (r23 != 0) goto Lee
            boolean r23 = r14.f(r8)
            if (r23 == 0) goto Le9
            r23 = 4
            goto Leb
        Le9:
            r23 = 2
        Leb:
            r23 = r49 | r23
            goto Lf0
        Lee:
            r23 = r49
        Lf0:
            r24 = r49 & 48
            if (r24 != 0) goto L101
            boolean r24 = r14.h(r12)
            if (r24 == 0) goto Lfd
            r16 = 32
            goto Lff
        Lfd:
            r16 = 16
        Lff:
            r23 = r23 | r16
        L101:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r2 & r16
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            r15 = 18
            if (r10 != r11) goto L114
            r10 = r23 & 19
            if (r10 == r15) goto L112
            goto L114
        L112:
            r10 = 0
            goto L115
        L114:
            r10 = 1
        L115:
            r11 = r2 & 1
            boolean r10 = r14.S(r11, r10)
            if (r10 == 0) goto L366
            r14.X()
            r10 = r13 & 1
            if (r10 == 0) goto L12e
            boolean r10 = r14.B()
            if (r10 == 0) goto L12b
            goto L12e
        L12b:
            r14.V()
        L12e:
            r14.q()
            int r25 = r2 >> 3
            r26 = r25 & 14
            r10 = r23 & 112(0x70, float:1.57E-43)
            r10 = r26 | r10
            qa4 r11 = defpackage.np2.b0(r12, r14)
            r27 = r10 & 14
            r28 = r15
            r15 = r27 ^ 6
            r27 = r2
            r2 = 4
            if (r15 <= r2) goto L14e
            boolean r15 = r14.f(r3)
            if (r15 != 0) goto L152
        L14e:
            r10 = r10 & 6
            if (r10 != r2) goto L154
        L152:
            r2 = 1
            goto L155
        L154:
            r2 = 0
        L155:
            java.lang.Object r10 = r14.P()
            vs0 r15 = defpackage.ox0.a
            if (r2 != 0) goto L15f
            if (r10 != r15) goto L18b
        L15f:
            vs0 r2 = defpackage.vs0.s0
            f4 r10 = new f4
            r5 = 27
            r10.<init>(r11, r5)
            ii1 r5 = defpackage.np2.J(r10, r2)
            ci2 r10 = new ci2
            r11 = 9
            r10.<init>(r11, r5, r3)
            ii1 r33 = defpackage.np2.J(r10, r2)
            qo3 r29 = new qo3
            r30 = 0
            r31 = 0
            java.lang.Class<pp6> r32 = defpackage.pp6.class
            java.lang.String r34 = "value"
            java.lang.String r35 = "getValue()Ljava/lang/Object;"
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r10 = r29
            r14.l0(r10)
        L18b:
            r5 = r10
            qo3 r5 = (defpackage.qo3) r5
            int r2 = r27 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r26 | r2
            r10 = r2 & 14
            r10 = r10 ^ 6
            r11 = 4
            if (r10 <= r11) goto L1a1
            boolean r10 = r14.f(r3)
            if (r10 != 0) goto L1a5
        L1a1:
            r10 = r2 & 6
            if (r10 != r11) goto L1a7
        L1a5:
            r10 = 1
            goto L1a8
        L1a7:
            r10 = 0
        L1a8:
            r11 = r2 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r29 = r2
            r2 = 32
            if (r11 <= r2) goto L1b9
            r11 = 0
            boolean r16 = r14.g(r11)
            if (r16 != 0) goto L1bd
        L1b9:
            r11 = r29 & 48
            if (r11 != r2) goto L1bf
        L1bd:
            r11 = 1
            goto L1c0
        L1bf:
            r11 = 0
        L1c0:
            r2 = r10 | r11
            java.lang.Object r10 = r14.P()
            if (r2 != 0) goto L1ca
            if (r10 != r15) goto L1d2
        L1ca:
            sr3 r10 = new sr3
            r10.<init>(r3)
            r14.l0(r10)
        L1d2:
            sr3 r10 = (defpackage.sr3) r10
            java.lang.Object r2 = r14.P()
            if (r2 != r15) goto L1e1
            w61 r2 = defpackage.mb3.w(r14)
            r14.l0(r2)
        L1e1:
            w61 r2 = (defpackage.w61) r2
            nq6 r11 = defpackage.ky0.g
            java.lang.Object r11 = r14.j(r11)
            tt2 r11 = (defpackage.tt2) r11
            r29 = r2
            py0 r2 = defpackage.ky0.w
            java.lang.Object r2 = r14.j(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L1fe
            q61 r2 = defpackage.tq6.a
            goto L1ff
        L1fe:
            r2 = 0
        L1ff:
            r30 = 524272(0x7fff0, float:7.34662E-40)
            r30 = r27 & r30
            int r23 = r23 << 18
            r28 = 3670016(0x380000, float:5.142788E-39)
            r23 = r23 & r28
            r23 = r30 | r23
            int r27 = r27 >> 6
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r27 & r30
            r31 = r2
            r2 = r23 | r27
            r23 = r2 & 112(0x70, float:1.57E-43)
            r27 = r5
            r5 = r23 ^ 48
            r9 = 32
            if (r5 <= r9) goto L226
            boolean r5 = r14.f(r3)
            if (r5 != 0) goto L22a
        L226:
            r5 = r2 & 48
            if (r5 != r9) goto L22c
        L22a:
            r5 = 1
            goto L22d
        L22c:
            r5 = 0
        L22d:
            r9 = r2 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r9 <= r3) goto L23b
            boolean r9 = r14.f(r6)
            if (r9 != 0) goto L23f
        L23b:
            r9 = r2 & 384(0x180, float:5.38E-43)
            if (r9 != r3) goto L241
        L23f:
            r3 = 1
            goto L242
        L241:
            r3 = 0
        L242:
            r3 = r3 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 <= r9) goto L251
            boolean r5 = r14.f(r4)
            if (r5 != 0) goto L255
        L251:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            if (r5 != r9) goto L257
        L255:
            r5 = 1
            goto L258
        L257:
            r5 = 0
        L258:
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r5 = r5 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r5 <= r9) goto L26b
            r5 = 0
            boolean r16 = r14.g(r5)
            if (r16 != 0) goto L270
            goto L26c
        L26b:
            r5 = 0
        L26c:
            r5 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r5 != r9) goto L272
        L270:
            r5 = 1
            goto L273
        L272:
            r5 = 0
        L273:
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r5 = r5 ^ r18
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r9) goto L284
            r5 = 1
            boolean r16 = r14.g(r5)
            if (r16 != 0) goto L288
        L284:
            r5 = r2 & r18
            if (r5 != r9) goto L28a
        L288:
            r5 = 1
            goto L28b
        L28a:
            r5 = 0
        L28b:
            r3 = r3 | r5
            r5 = r2 & r28
            r5 = r5 ^ r17
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r9) goto L29a
            boolean r5 = r14.f(r8)
            if (r5 != 0) goto L29e
        L29a:
            r5 = r2 & r17
            if (r5 != r9) goto L2a0
        L29e:
            r5 = 1
            goto L2a1
        L2a0:
            r5 = 0
        L2a1:
            r3 = r3 | r5
            r5 = r2 & r30
            r5 = r5 ^ r21
            r9 = 8388608(0x800000, float:1.1754944E-38)
            if (r5 <= r9) goto L2b0
            boolean r5 = r14.f(r7)
            if (r5 != 0) goto L2b4
        L2b0:
            r2 = r2 & r21
            if (r2 != r9) goto L2b6
        L2b4:
            r2 = 1
            goto L2b7
        L2b6:
            r2 = 0
        L2b7:
            r2 = r2 | r3
            boolean r3 = r14.f(r11)
            r2 = r2 | r3
            java.lang.Object r3 = r14.P()
            if (r2 != 0) goto L2d1
            if (r3 != r15) goto L2c6
            goto L2d1
        L2c6:
            r2 = r3
            r36 = r10
            r10 = r27
            r12 = 0
            r20 = 1
            r3 = r38
            goto L2e8
        L2d1:
            uo3 r2 = new uo3
            r3 = r38
            r36 = r10
            r10 = r11
            r5 = r27
            r9 = r29
            r11 = r31
            r12 = 0
            r20 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r5
            r14.l0(r2)
        L2e8:
            r11 = r2
            eq3 r11 = (defpackage.eq3) r11
            lo4 r4 = defpackage.lo4.Vertical
            if (r0 == 0) goto L323
            r2 = 27281635(0x1a048e3, float:5.8879305E-38)
            r14.b0(r2)
            r2 = r26 ^ 6
            r5 = 4
            if (r2 <= r5) goto L300
            boolean r2 = r14.f(r3)
            if (r2 != 0) goto L307
        L300:
            r2 = r25 & 6
            if (r2 != r5) goto L305
            goto L307
        L305:
            r20 = r12
        L307:
            java.lang.Object r2 = r14.P()
            if (r20 != 0) goto L30f
            if (r2 != r15) goto L317
        L30f:
            ko3 r2 = new ko3
            r2.<init>(r3)
            r14.l0(r2)
        L317:
            ko3 r2 = (defpackage.ko3) r2
            p70 r5 = r3.n
            a74 r2 = defpackage.ak7.n0(r2, r5, r4)
            r14.p(r12)
            goto L32e
        L323:
            r2 = 27577840(0x1a4cdf0, float:6.053959E-38)
            r14.b0(r2)
            r14.p(r12)
            x64 r2 = defpackage.x64.a
        L32e:
            gp3 r5 = r3.k
            a74 r5 = r1.d(r5)
            sz r6 = r3.l
            a74 r5 = r5.d(r6)
            r6 = r36
            a74 r5 = defpackage.vy7.p0(r5, r10, r6, r4, r0)
            a74 r2 = r5.d(r2)
            zp3 r5 = r3.m
            java.lang.Object r5 = r5.i
            a74 r5 = (defpackage.a74) r5
            a74 r2 = r2.d(r5)
            r94 r8 = r3.f
            r9 = 0
            r7 = r41
            r5 = r43
            r6 = r0
            a74 r0 = defpackage.f04.O(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r3
            pq3 r4 = r8.o
            r7 = 0
            r3 = r0
            r2 = r10
            r5 = r11
            r6 = r14
            defpackage.kn2.e(r2, r3, r4, r5, r6, r7)
            goto L36b
        L366:
            r8 = r3
            r6 = r14
            r6.V()
        L36b:
            cf5 r14 = r6.t()
            if (r14 == 0) goto L38c
            lo3 r0 = new lo3
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r9 = r45
            r10 = r46
            r12 = r49
            r2 = r8
            r11 = r13
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.d = r0
        L38c:
            return
    }

    public static final void j(defpackage.o3 r8, defpackage.px0 r9, int r10) {
            r5 = r9
            xq2 r5 = (defpackage.xq2) r5
            r9 = 60908354(0x3a16342, float:9.485518E-37)
            r5.d0(r9)
            boolean r9 = r5.h(r8)
            r0 = 2
            if (r9 == 0) goto L12
            r9 = 4
            goto L13
        L12:
            r9 = r0
        L13:
            r9 = r9 | r10
            r1 = r9 & 3
            r2 = 0
            r3 = 1
            if (r1 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r9 = r9 & r3
            boolean r9 = r5.S(r9, r0)
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r5.P()
            vs0 r0 = defpackage.ox0.a
            if (r9 != r0) goto L35
            r9 = 1065353216(0x3f800000, float:1.0)
            gn r9 = defpackage.nb3.b(r9)
            r5.l0(r9)
        L35:
            gn r9 = (defpackage.gn) r9
            ta5 r1 = r8.b
            java.lang.String r1 = r1.e
            int r1 = D(r1)
            java.lang.String r1 = defpackage.yh2.O(r5, r1)
            java.lang.String r3 = r8.d
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 == 0) goto L4d
            java.lang.String r3 = "--"
        L4d:
            r4 = 2131952147(0x7f130213, float:1.9540729E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = defpackage.yh2.N(r4, r1, r5)
            boolean r3 = r5.h(r9)
            java.lang.Object r4 = r5.P()
            if (r3 != 0) goto L64
            if (r4 != r0) goto L6d
        L64:
            ns3 r4 = new ns3
            r3 = 0
            r4.<init>(r9, r3, r2)
            r5.l0(r4)
        L6d:
            eo2 r4 = (defpackage.eo2) r4
            jg7 r3 = defpackage.jg7.a
            defpackage.mb3.i(r5, r4, r3)
            x64 r3 = defpackage.x64.a
            r4 = 1090519040(0x41000000, float:8.0)
            a74 r3 = defpackage.ge7.O(r3, r4)
            boolean r4 = r5.h(r9)
            java.lang.Object r6 = r5.P()
            if (r4 != 0) goto L88
            if (r6 != r0) goto L90
        L88:
            ms3 r6 = new ms3
            r6.<init>(r9, r2)
            r5.l0(r6)
        L90:
            qn2 r6 = (defpackage.qn2) r6
            a74 r0 = defpackage.hv.G(r3, r6)
            r9 = r1
            java.net.URL r1 = r8.c
            bt r2 = r8.e
            l4 r3 = new l4
            r4 = 6
            r3.<init>(r4, r9, r8)
            r9 = -1939109924(0xffffffff8c6b87dc, float:-1.8144625E-31)
            zv0 r4 = defpackage.n16.I(r9, r3, r5)
            r6 = 24576(0x6000, float:3.4438E-41)
            r7 = 8
            r3 = 0
            defpackage.f04.a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lb4
        Lb1:
            r5.V()
        Lb4:
            cf5 r9 = r5.t()
            if (r9 == 0) goto Lc3
            z5 r0 = new z5
            r1 = 15
            r0.<init>(r8, r10, r1)
            r9.d = r0
        Lc3:
            return
    }

    public static final void k(defpackage.zv0 r3, defpackage.px0 r4, int r5) {
            xq2 r4 = (defpackage.xq2) r4
            r0 = -1677843913(0xffffffff9bfe2237, float:-4.2042886E-22)
            r4.d0(r0)
            boolean r0 = r4.h(r3)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r5
            r2 = r0 & 3
            if (r2 == r1) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            r2 = r0 & 1
            boolean r1 = r4.S(r2, r1)
            if (r1 == 0) goto L2c
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.o(r4, r0)
            goto L2f
        L2c:
            r4.V()
        L2f:
            cf5 r4 = r4.t()
            if (r4 == 0) goto L3d
            eq r0 = new eq
            r1 = 6
            r0.<init>(r3, r5, r1)
            r4.d = r0
        L3d:
            return
    }

    public static final void l(defpackage.pq5 r55, java.lang.String r56, java.lang.String r57, boolean r58, boolean r59, defpackage.on2 r60, defpackage.on2 r61, defpackage.a74 r62, defpackage.px0 r63, int r64) {
            r0 = r55
            r12 = r59
            r13 = r62
            e40 r14 = defpackage.d90.e0
            r60.getClass()
            r61.getClass()
            r4 = r63
            xq2 r4 = (defpackage.xq2) r4
            r1 = 1263458246(0x4b4ed7c6, float:1.3555654E7)
            r4.d0(r1)
            boolean r1 = r4.h(r0)
            r2 = 4
            if (r1 == 0) goto L21
            r1 = r2
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r64 | r1
            r7 = r56
            boolean r3 = r4.f(r7)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r1 = r1 | r3
            r8 = r57
            boolean r3 = r4.f(r8)
            if (r3 == 0) goto L3d
            r3 = 256(0x100, float:3.59E-43)
            goto L3f
        L3d:
            r3 = 128(0x80, float:1.8E-43)
        L3f:
            r1 = r1 | r3
            r9 = r58
            boolean r3 = r4.g(r9)
            if (r3 == 0) goto L4b
            r3 = 2048(0x800, float:2.87E-42)
            goto L4d
        L4b:
            r3 = 1024(0x400, float:1.435E-42)
        L4d:
            r1 = r1 | r3
            boolean r3 = r4.g(r12)
            if (r3 == 0) goto L57
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L59
        L57:
            r3 = 8192(0x2000, float:1.148E-41)
        L59:
            r1 = r1 | r3
            r10 = r60
            boolean r3 = r4.h(r10)
            if (r3 == 0) goto L65
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L67
        L65:
            r3 = 65536(0x10000, float:9.1835E-41)
        L67:
            r1 = r1 | r3
            r11 = r61
            boolean r3 = r4.h(r11)
            if (r3 == 0) goto L73
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L75
        L73:
            r3 = 524288(0x80000, float:7.34684E-40)
        L75:
            r1 = r1 | r3
            boolean r3 = r4.f(r13)
            if (r3 == 0) goto L7f
            r3 = 8388608(0x800000, float:1.1754944E-38)
            goto L81
        L7f:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L81:
            r38 = r1 | r3
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r38 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 == r3) goto L8f
            r1 = 1
            goto L90
        L8f:
            r1 = 0
        L90:
            r3 = r38 & 1
            boolean r1 = r4.S(r3, r1)
            if (r1 == 0) goto L5ea
            es7 r1 = defpackage.bl2.F(r4)
            r3 = 1088421888(0x40e00000, float:7.0)
            y16 r18 = defpackage.z16.b(r3)
            java.lang.Object r6 = r4.P()
            vs0 r5 = defpackage.ox0.a
            if (r6 != r5) goto Lae
            r94 r6 = defpackage.i61.f(r4)
        Lae:
            r94 r6 = (defpackage.r94) r6
            r3 = 6
            qa4 r39 = defpackage.bw7.a(r6, r4, r3)
            qa4 r3 = defpackage.gi2.u(r6, r4)
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto Lcb
            r3 = 1064178811(0x3f6e147b, float:0.93)
            goto Lcc
        Lcb:
            r3 = r11
        Lcc:
            r15 = 1165623296(0x457a0000, float:4000.0)
            r17 = r1
            r1 = 0
            io6 r2 = defpackage.ge7.U(r11, r15, r1, r2)
            r1 = r5
            r5 = 3120(0xc30, float:4.372E-42)
            r15 = r6
            r6 = 20
            r19 = r1
            r1 = r3
            java.lang.String r3 = "press"
            r24 = r15
            r15 = r17
            r11 = r19
            pp6 r1 = defpackage.in.b(r1, r2, r3, r4, r5, r6)
            android.net.Uri r2 = r0.d
            boolean r2 = r4.f(r2)
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto Lf8
            if (r3 != r11) goto L101
        Lf8:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            vs4 r3 = defpackage.np2.Y(r2)
            r4.l0(r3)
        L101:
            r2 = r3
            qa4 r2 = (defpackage.qa4) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            a74 r1 = defpackage.ln2.X(r13, r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r1 = defpackage.dj6.c(r1, r3)
            r3 = 1066342266(0x3f8f177a, float:1.117904)
            a74 r16 = defpackage.ak7.H(r1, r3)
            r20 = 0
            r22 = 28
            r17 = 1084227584(0x40a00000, float:5.0)
            r19 = 0
            a74 r1 = defpackage.nj2.E(r16, r17, r18, r19, r20, r22)
            r5 = r18
            a74 r1 = defpackage.u24.g(r1, r5)
            r17 = 0
            r20 = 444(0x1bc, float:6.22E-43)
            r16 = r15
            r15 = r1
            r1 = r16
            r18 = r61
            r19 = r10
            r16 = r24
            r23 = 1
            a74 r6 = defpackage.mb3.v(r15, r16, r17, r18, r19, r20)
            e40 r15 = defpackage.d90.L
            r10 = 0
            e34 r3 = defpackage.h70.d(r15, r10)
            r19 = r11
            long r10 = r4.T
            int r10 = java.lang.Long.hashCode(r10)
            xv4 r11 = r4.l()
            a74 r6 = defpackage.l.E(r4, r6)
            ix0 r17 = defpackage.jx0.i
            r17.getClass()
            iy0 r12 = defpackage.ix0.b
            r4.f0()
            boolean r0 = r4.S
            if (r0 == 0) goto L16f
            r4.k(r12)
            goto L172
        L16f:
            r4.o0()
        L172:
            pn r0 = defpackage.ix0.f
            defpackage.yh2.K(r4, r0, r3)
            pn r3 = defpackage.ix0.e
            defpackage.yh2.K(r4, r3, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            pn r11 = defpackage.ix0.g
            defpackage.yh2.K(r4, r11, r10)
            ne r10 = defpackage.ix0.h
            defpackage.yh2.F(r4, r10)
            r17 = r11
            pn r11 = defpackage.ix0.d
            defpackage.yh2.K(r4, r11, r6)
            vs0 r6 = defpackage.vs0.Y
            r18 = 44
            long r20 = defpackage.hi2.E(r18)
            r18 = r6
            x64 r6 = defpackage.x64.a
            r22 = r0
            r16 = r1
            r0 = 1066342266(0x3f8f177a, float:1.117904)
            a74 r1 = defpackage.ak7.H(r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            a74 r1 = defpackage.dj6.c(r1, r0)
            boolean r25 = r4.f(r2)
            java.lang.Object r0 = r4.P()
            if (r25 != 0) goto L1bf
            r25 = r1
            r1 = r19
            if (r0 != r1) goto L1cb
            goto L1c1
        L1bf:
            r25 = r1
        L1c1:
            j4 r0 = new j4
            r1 = 19
            r0.<init>(r2, r1)
            r4.l0(r0)
        L1cb:
            qn2 r0 = (defpackage.qn2) r0
            r1 = r38 & 14
            r1 = r1 | 27648(0x6c00, float:3.8743E-41)
            int r19 = r38 >> 3
            r19 = r19 & 112(0x70, float:1.57E-43)
            r1 = r1 | r19
            r19 = r0
            int r0 = r38 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r38 << 9
            r26 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r26
            r0 = r0 | r1
            r1 = r11
            r11 = 32
            r26 = r6
            r6 = 0
            r47 = r1
            r42 = r2
            r44 = r3
            r13 = r5
            r2 = r7
            r1 = r8
            r7 = r9
            r46 = r10
            r48 = r12
            r43 = r14
            r40 = r16
            r45 = r17
            r50 = r18
            r8 = r19
            r63 = r22
            r3 = r25
            r14 = r26
            r12 = 1066342266(0x3f8f177a, float:1.117904)
            r10 = r0
            r9 = r4
            r4 = r20
            r0 = r55
            defpackage.hf.u(r0, r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r8 = r0
            r4 = r9
            a74 r0 = defpackage.ak7.H(r14, r12)
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r0 = defpackage.dj6.c(r0, r3)
            long r9 = defpackage.kt0.d
            r1 = 1040522936(0x3e051eb8, float:0.13)
            long r1 = defpackage.kt0.c(r1, r9)
            a74 r0 = defpackage.ak7.I(r0, r3, r1, r13)
            r1 = 0
            defpackage.h70.a(r0, r4, r1)
            r11 = r50
            a74 r0 = r11.n(r14, r15)
            r7 = 1088421888(0x40e00000, float:7.0)
            a74 r0 = defpackage.ge7.O(r0, r7)
            d40 r6 = defpackage.d90.i0
            du r1 = defpackage.ju.a
            r2 = 48
            l26 r3 = defpackage.k26.a(r1, r6, r4, r2)
            r41 = r13
            long r12 = r4.T
            int r5 = java.lang.Long.hashCode(r12)
            xv4 r12 = r4.l()
            a74 r0 = defpackage.l.E(r4, r0)
            r4.f0()
            boolean r13 = r4.S
            if (r13 == 0) goto L269
            r13 = r48
            r4.k(r13)
        L264:
            r51 = r9
            r9 = r63
            goto L26f
        L269:
            r13 = r48
            r4.o0()
            goto L264
        L26f:
            defpackage.yh2.K(r4, r9, r3)
            r10 = r44
            defpackage.yh2.K(r4, r10, r12)
            r12 = r45
            r3 = r46
            defpackage.i61.w(r5, r4, r12, r4, r3)
            r5 = r47
            defpackage.yh2.K(r4, r5, r0)
            vr4 r0 = defpackage.hf.j0(r8)
            r2 = 835522958(0x31cd118e, float:5.968281E-9)
            r4.b0(r2)
            java.lang.Object r2 = r0.A
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.B
            java.lang.String r0 = (java.lang.String) r0
            r28 = 0
            r29 = 11
            r25 = 0
            r26 = 0
            r27 = 1082130432(0x40800000, float:4.0)
            r24 = r14
            a74 r14 = defpackage.ge7.S(r24, r25, r26, r27, r28, r29)
            r34 = r4
            r7 = r24
            r4 = 384(0x180, float:5.38E-43)
            r5 = 0
            r54 = r1
            r53 = r47
            r1 = r0
            r0 = r2
            r2 = r14
            r14 = r3
            r3 = r34
            defpackage.hf.k(r0, r1, r2, r3, r4, r5)
            r4 = r3
            r1 = 0
            r4.p(r1)
            java.lang.String r0 = defpackage.hf.n0(r8)
            r1 = r6
            r6 = 6
            r2 = r1
            r1 = 0
            r17 = r2
            r2 = 0
            r44 = r11
            r11 = r17
            defpackage.hf.i(r0, r1, r2, r4, r5, r6)
            r0 = 1062836634(0x3f59999a, float:0.85)
            r45 = 4620974692658839552(0x4021000000000000, double:8.5)
            if (r59 == 0) goto L3ec
            r1 = 835865291(0x31d24acb, float:6.1203074E-9)
            r4.b0(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            a74 r2 = defpackage.dj6.l(r7, r1)
            defpackage.gi2.h(r4, r2)
            y16 r2 = defpackage.z16.b(r1)
            a74 r2 = defpackage.u24.g(r7, r2)
            r5 = 4279179050(0xff0f172a, double:2.114195361E-314)
            long r5 = defpackage.hv.c(r5)
            long r5 = defpackage.kt0.c(r0, r5)
            jy2 r3 = defpackage.u24.m
            a74 r2 = defpackage.vy7.L(r2, r5, r3)
            long r5 = defpackage.es7.p
            r3 = 1060320051(0x3f333333, float:0.7)
            r17 = r1
            long r0 = defpackage.kt0.c(r3, r5)
            r18 = r5
            y16 r5 = defpackage.z16.b(r17)
            a74 r0 = defpackage.ak7.I(r2, r3, r0, r5)
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = r17
            a74 r0 = defpackage.ge7.P(r0, r2, r1)
            r1 = 0
            e34 r2 = defpackage.h70.d(r15, r1)
            long r5 = r4.T
            int r1 = java.lang.Long.hashCode(r5)
            xv4 r3 = r4.l()
            a74 r0 = defpackage.l.E(r4, r0)
            r4.f0()
            boolean r5 = r4.S
            if (r5 == 0) goto L33d
            r4.k(r13)
            goto L340
        L33d:
            r4.o0()
        L340:
            defpackage.yh2.K(r4, r9, r2)
            defpackage.yh2.K(r4, r10, r3)
            defpackage.i61.w(r1, r4, r12, r4, r14)
            r15 = r53
            defpackage.yh2.K(r4, r15, r0)
            r1 = r54
            r0 = 48
            l26 r0 = defpackage.k26.a(r1, r11, r4, r0)
            long r1 = r4.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r4.l()
            a74 r3 = defpackage.l.E(r4, r7)
            r4.f0()
            boolean r5 = r4.S
            if (r5 == 0) goto L36f
            r4.k(r13)
            goto L372
        L36f:
            r4.o0()
        L372:
            defpackage.yh2.K(r4, r9, r0)
            defpackage.yh2.K(r4, r10, r2)
            defpackage.i61.w(r1, r4, r12, r4, r14)
            defpackage.yh2.K(r4, r15, r3)
            e33 r0 = defpackage.q60.F()
            r1 = 1093664768(0x41300000, float:11.0)
            a74 r2 = defpackage.dj6.i(r7, r1)
            r6 = 3504(0xdb0, float:4.91E-42)
            r24 = r7
            r7 = 0
            java.lang.String r1 = "Achievements"
            r5 = r4
            r47 = r9
            r3 = r18
            r9 = r24
            r11 = 1062836634(0x3f59999a, float:0.85)
            defpackage.i13.a(r0, r1, r2, r3, r5, r6, r7)
            r4 = r5
            r0 = 1075838976(0x40200000, float:2.5)
            a74 r0 = defpackage.dj6.l(r9, r0)
            defpackage.gi2.h(r4, r0)
            long r20 = defpackage.hi2.D(r45)
            oj2 r22 = defpackage.oj2.f0
            s47 r17 = new s47
            r28 = 0
            r30 = 16777208(0xfffff8, float:2.3509876E-38)
            r23 = 0
            r25 = 0
            r27 = 0
            r17.<init>(r18, r20, r22, r23, r25, r27, r28, r30)
            r36 = 0
            r37 = 65534(0xfffe, float:9.1833E-41)
            r53 = r15
            java.lang.String r15 = "RA"
            r16 = 0
            r33 = r17
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 6
            r34 = r4
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = 0
            r15 = 1
            defpackage.i61.y(r4, r15, r15, r1)
            goto L3fb
        L3ec:
            r11 = r0
            r47 = r9
            r1 = 0
            r15 = 1
            r9 = r7
            r0 = 837121318(0x31e57526, float:6.6780954E-9)
            r4.b0(r0)
            r4.p(r1)
        L3fb:
            r4.p(r15)
            boolean r0 = r8.k
            if (r0 == 0) goto L44d
            r0 = 1459292661(0x56fb09f5, float:1.3801009E14)
            r4.b0(r0)
            e33 r0 = defpackage.kj2.D()
            r34 = r4
            long r3 = defpackage.es7.q
            e40 r1 = defpackage.d90.X
            r2 = r44
            a74 r6 = r2.n(r9, r1)
            r44 = r10
            r10 = 0
            r1 = r11
            r11 = 9
            r7 = 0
            r8 = 1086324736(0x40c00000, float:6.0)
            r18 = r2
            r24 = r9
            r22 = r47
            r9 = 1088421888(0x40e00000, float:7.0)
            a74 r2 = defpackage.ge7.S(r6, r7, r8, r9, r10, r11)
            r5 = 1095761920(0x41500000, float:13.0)
            a74 r2 = defpackage.dj6.i(r2, r5)
            r6 = 3120(0xc30, float:4.372E-42)
            r7 = 0
            r11 = r1
            r1 = 0
            r9 = r18
            r10 = r22
            r8 = r24
            r5 = r34
            r11 = r44
            r15 = r53
            defpackage.i13.a(r0, r1, r2, r3, r5, r6, r7)
            r4 = r5
            r1 = 0
            r4.p(r1)
            goto L45f
        L44d:
            r8 = r9
            r11 = r10
            r9 = r44
            r10 = r47
            r15 = r53
            r1 = 0
            r0 = 1459622594(0x570012c2, float:1.4081805E14)
            r4.b0(r0)
            r4.p(r1)
        L45f:
            java.lang.Object r0 = r42.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L585
            r0 = 1459685834(0x570109ca, float:1.4187904E14)
            r4.b0(r0)
            r0 = r43
            a74 r0 = r9.n(r8, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r0 = defpackage.dj6.c(r0, r3)
            long r1 = defpackage.kt0.g
            kt0 r3 = new kt0
            r3.<init>(r1)
            long r1 = defpackage.kt0.b
            r5 = 1062836634(0x3f59999a, float:0.85)
            long r1 = defpackage.kt0.c(r5, r1)
            kt0 r5 = new kt0
            r5.<init>(r1)
            kt0[] r1 = new defpackage.kt0[]{r3, r5}
            java.util.List r1 = defpackage.hf.c0(r1)
            r2 = 0
            r3 = 14
            bv3 r1 = defpackage.d90.m(r1, r2, r2, r3)
            a74 r0 = defpackage.vy7.J(r0, r1)
            r1 = 1090519040(0x41000000, float:8.0)
            r2 = 1101004800(0x41a00000, float:20.0)
            a74 r0 = defpackage.ge7.R(r0, r1, r2, r1, r1)
            eu r1 = defpackage.ju.c
            c40 r2 = defpackage.d90.k0
            r5 = 0
            yt0 r1 = defpackage.wt0.a(r1, r2, r4, r5)
            long r5 = r4.T
            int r2 = java.lang.Long.hashCode(r5)
            xv4 r5 = r4.l()
            a74 r0 = defpackage.l.E(r4, r0)
            r4.f0()
            boolean r6 = r4.S
            if (r6 == 0) goto L4cf
            r4.k(r13)
            goto L4d2
        L4cf:
            r4.o0()
        L4d2:
            defpackage.yh2.K(r4, r10, r1)
            defpackage.yh2.K(r4, r11, r5)
            defpackage.i61.w(r2, r4, r12, r4, r14)
            defpackage.yh2.K(r4, r15, r0)
            java.lang.String r15 = defpackage.hf.k0(r55)
            oj2 r21 = defpackage.oj2.e0
            r0 = 11
            long r19 = defpackage.hi2.E(r0)
            long r26 = defpackage.hi2.E(r3)
            r36 = 3126(0xc36, float:4.38E-42)
            r37 = 119762(0x1d3d2, float:1.67822E-40)
            r16 = 0
            r22 = 0
            r49 = 1
            r23 = 0
            r25 = 0
            r28 = 2
            r29 = 0
            r30 = 3
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 200064(0x30d80, float:2.8035E-40)
            r34 = r4
            r7 = r49
            r17 = r51
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = r55
            r2 = r17
            long r5 = r1.j
            java.lang.String r15 = defpackage.hf.P(r5)
            int r0 = r15.length()
            if (r0 <= 0) goto L574
            r0 = -1595450437(0xffffffffa0e75bbb, float:-3.9193624E-19)
            r4.b0(r0)
            r0 = 1059481190(0x3f266666, float:0.65)
            long r17 = defpackage.kt0.c(r0, r2)
            sr2 r22 = defpackage.qs7.c
            long r19 = defpackage.hi2.D(r45)
            r0 = 10
            long r2 = defpackage.hi2.E(r0)
            r28 = 0
            r29 = 13
            r25 = 0
            r26 = 1073741824(0x40000000, float:2.0)
            r27 = 0
            r24 = r8
            a74 r16 = defpackage.ge7.S(r24, r25, r26, r27, r28, r29)
            r36 = 6
            r37 = 129968(0x1fbb0, float:1.82124E-40)
            r21 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 1576368(0x180db0, float:2.208962E-39)
            r26 = r2
            r34 = r4
            defpackage.x37.b(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r10 = 0
            r4.p(r10)
            goto L57e
        L574:
            r10 = 0
            r0 = -1595110646(0xffffffffa0ec8b0a, float:-4.0071963E-19)
            r4.b0(r0)
            r4.p(r10)
        L57e:
            r4.p(r7)
            r4.p(r10)
            goto L5a9
        L585:
            r0 = r43
            r7 = 1
            r10 = 0
            r1 = r55
            r2 = 1460858750(0x5712ef7e, float:1.6155731E14)
            r4.b0(r2)
            a74 r0 = r9.n(r8, r0)
            r9 = 1088421888(0x40e00000, float:7.0)
            a74 r2 = defpackage.ge7.O(r0, r9)
            r5 = r38 & 126(0x7e, float:1.77E-43)
            r6 = 8
            r3 = 0
            r0 = r1
            r1 = r56
            defpackage.hf.p(r0, r1, r2, r3, r4, r5, r6)
            r4.p(r10)
        L5a9:
            java.lang.Object r0 = r39.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5dc
            r0 = 1461075533(0x57163e4d, float:1.6519432E14)
            r4.b0(r0)
            r12 = 1066342266(0x3f8f177a, float:1.117904)
            a74 r0 = defpackage.ak7.H(r8, r12)
            r3 = 1065353216(0x3f800000, float:1.0)
            a74 r0 = defpackage.dj6.c(r0, r3)
            r1 = 1077936128(0x40400000, float:3.0)
            r15 = r40
            long r2 = r15.j
            r13 = r41
            a74 r0 = defpackage.ak7.I(r0, r1, r2, r13)
            r1 = 0
            defpackage.h70.a(r0, r4, r1)
            r4.p(r1)
            goto L5e6
        L5dc:
            r1 = 0
            r0 = 1461187970(0x5717f582, float:1.670807E14)
            r4.b0(r0)
            r4.p(r1)
        L5e6:
            r4.p(r7)
            goto L5ed
        L5ea:
            r4.V()
        L5ed:
            cf5 r10 = r4.t()
            if (r10 == 0) goto L60c
            cx5 r0 = new cx5
            r1 = r55
            r2 = r56
            r3 = r57
            r4 = r58
            r5 = r59
            r6 = r60
            r7 = r61
            r8 = r62
            r9 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d = r0
        L60c:
            return
    }

    public static final void m(java.lang.String r16, float r17, defpackage.bs0 r18, boolean r19, defpackage.qn2 r20, float r21, defpackage.px0 r22, int r23) {
            r2 = r17
            r3 = r18
            r4 = r19
            r0 = r21
            r16.getClass()
            r20.getClass()
            r1 = r22
            xq2 r1 = (defpackage.xq2) r1
            r5 = 1905014024(0x718c3508, float:1.3885444E30)
            r1.d0(r5)
            r5 = r16
            boolean r6 = r1.f(r5)
            if (r6 == 0) goto L22
            r6 = 4
            goto L23
        L22:
            r6 = 2
        L23:
            r6 = r23 | r6
            boolean r8 = r1.c(r2)
            r9 = 32
            if (r8 == 0) goto L2f
            r8 = r9
            goto L31
        L2f:
            r8 = 16
        L31:
            r6 = r6 | r8
            boolean r8 = r1.f(r3)
            r10 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L3c
            r8 = r10
            goto L3e
        L3c:
            r8 = 128(0x80, float:1.8E-43)
        L3e:
            r6 = r6 | r8
            boolean r8 = r1.g(r4)
            if (r8 == 0) goto L48
            r8 = 2048(0x800, float:2.87E-42)
            goto L4a
        L48:
            r8 = 1024(0x400, float:1.435E-42)
        L4a:
            r6 = r6 | r8
            r8 = r20
            boolean r11 = r1.h(r8)
            if (r11 == 0) goto L56
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L58
        L56:
            r11 = 8192(0x2000, float:1.148E-41)
        L58:
            r6 = r6 | r11
            boolean r11 = r1.c(r0)
            if (r11 == 0) goto L62
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L64
        L62:
            r11 = 65536(0x10000, float:9.1835E-41)
        L64:
            r6 = r6 | r11
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r6
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 == r12) goto L70
            r11 = 1
            goto L71
        L70:
            r11 = 0
        L71:
            r12 = r6 & 1
            boolean r11 = r1.S(r12, r11)
            if (r11 == 0) goto L1e8
            r11 = r6 & 112(0x70, float:1.57E-43)
            if (r11 != r9) goto L7f
            r9 = 1
            goto L80
        L7f:
            r9 = 0
        L80:
            java.lang.Object r11 = r1.P()
            vs0 r12 = defpackage.ox0.a
            if (r9 != 0) goto L8a
            if (r11 != r12) goto L92
        L8a:
            rs4 r11 = new rs4
            r11.<init>(r2)
            r1.l0(r11)
        L92:
            rs4 r11 = (defpackage.rs4) r11
            r6 = r6 & 896(0x380, float:1.256E-42)
            if (r6 != r10) goto L9a
            r9 = 1
            goto L9b
        L9a:
            r9 = 0
        L9b:
            java.lang.Object r15 = r1.P()
            if (r9 != 0) goto La3
            if (r15 != r12) goto Lb2
        La3:
            float r9 = r3.b
            float r15 = r3.a
            float r9 = r9 - r15
            r15 = 1101004800(0x41a00000, float:20.0)
            float r9 = r9 / r15
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            r1.l0(r15)
        Lb2:
            java.lang.Number r15 = (java.lang.Number) r15
            float r9 = r15.floatValue()
            x64 r15 = defpackage.x64.a
            r14 = 1065353216(0x3f800000, float:1.0)
            a74 r15 = defpackage.dj6.c(r15, r14)
            java.lang.Object r14 = r1.P()
            if (r14 != r12) goto Ld0
            c5 r14 = new c5
            r13 = 17
            r14.<init>(r13)
            r1.l0(r14)
        Ld0:
            on2 r14 = (defpackage.on2) r14
            r13 = 14
            r7 = 0
            a74 r7 = defpackage.mb3.u(r15, r4, r7, r14, r13)
            boolean r13 = r1.f(r11)
            boolean r14 = r1.c(r9)
            r13 = r13 | r14
            if (r6 != r10) goto Le6
            r6 = 1
            goto Le7
        Le6:
            r6 = 0
        Le7:
            r6 = r6 | r13
            java.lang.Object r10 = r1.P()
            if (r6 != 0) goto Lf0
            if (r10 != r12) goto Lf8
        Lf0:
            e96 r10 = new e96
            r10.<init>(r9, r3, r11)
            r1.l0(r10)
        Lf8:
            qn2 r10 = (defpackage.qn2) r10
            a74 r6 = defpackage.u24.A(r7, r10)
            r7 = 1115684864(0x42800000, float:64.0)
            r9 = 0
            r10 = 2
            a74 r6 = defpackage.dj6.f(r6, r7, r9, r10)
            r7 = 1090519040(0x41000000, float:8.0)
            a74 r6 = defpackage.ge7.R(r6, r0, r7, r0, r7)
            eu r7 = defpackage.ju.c
            c40 r9 = defpackage.d90.k0
            r10 = 0
            yt0 r7 = defpackage.wt0.a(r7, r9, r1, r10)
            long r9 = r1.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r1.l()
            a74 r6 = defpackage.l.E(r1, r6)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r1.f0()
            boolean r13 = r1.S
            if (r13 == 0) goto L135
            r1.k(r12)
            goto L138
        L135:
            r1.o0()
        L138:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r1, r12, r7)
            pn r7 = defpackage.ix0.e
            defpackage.yh2.K(r1, r7, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r1, r9, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r1, r7)
            pn r7 = defpackage.ix0.d
            defpackage.yh2.K(r1, r7, r6)
            py0 r6 = defpackage.g31.a
            if (r4 == 0) goto L198
            r7 = -838227882(0xffffffffce09a856, float:-5.7737766E8)
            r1.b0(r7)
            py0 r7 = defpackage.j31.a
            java.lang.Object r7 = r1.j(r7)
            kt0 r7 = (defpackage.kt0) r7
            long r9 = r7.a
            nq6 r7 = defpackage.vt0.a
            java.lang.Object r7 = r1.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            boolean r7 = r7.k()
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r7 == 0) goto L183
            float r7 = defpackage.hv.N(r9)
            double r9 = (double) r7
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r7 <= 0) goto L190
            goto L18c
        L183:
            float r7 = defpackage.hv.N(r9)
            double r9 = (double) r7
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r7 >= 0) goto L190
        L18c:
            r14 = 1065353216(0x3f800000, float:1.0)
        L18e:
            r10 = 0
            goto L194
        L190:
            r14 = 1063172178(0x3f5eb852, float:0.87)
            goto L18e
        L194:
            r1.p(r10)
            goto L1c5
        L198:
            r7 = -838227142(0xffffffffce09ab3a, float:-5.77425E8)
            r1.b0(r7)
            py0 r7 = defpackage.j31.a
            java.lang.Object r7 = r1.j(r7)
            kt0 r7 = (defpackage.kt0) r7
            long r9 = r7.a
            nq6 r7 = defpackage.vt0.a
            java.lang.Object r7 = r1.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L1bb
            defpackage.hv.N(r9)
        L1b9:
            r10 = 0
            goto L1bf
        L1bb:
            defpackage.hv.N(r9)
            goto L1b9
        L1bf:
            r1.p(r10)
            r14 = 1052938076(0x3ec28f5c, float:0.38)
        L1c5:
            java.lang.Float r7 = java.lang.Float.valueOf(r14)
            pq r9 = r6.a(r7)
            si r3 = new si
            r7 = r18
            r6 = r4
            r4 = r5
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = 1351204114(0x5089bd12, float:1.8486956E10)
            zv0 r3 = defpackage.n16.I(r4, r3, r1)
            r4 = 56
            defpackage.hv.d(r9, r3, r1, r4)
            r3 = 1
            r1.p(r3)
            goto L1eb
        L1e8:
            r1.V()
        L1eb:
            cf5 r8 = r1.t()
            if (r8 == 0) goto L204
            d96 r0 = new d96
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L204:
            return
    }

    public static final long n(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final defpackage.le o(defpackage.p0 r3, defpackage.ut3 r4) {
            tt3 r0 = r4.b()
            tt3 r1 = defpackage.tt3.DESTROYED
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1d
            wb4 r0 = new wb4
            r1 = 2
            r0.<init>(r3, r1)
            r4.a(r0)
            le r3 = new le
            r1 = 10
            r3.<init>(r1, r4, r0)
            return r3
        L1d:
            java.lang.String r0 = " to disposeComposition at Lifecycle ON_DESTROY: "
            java.lang.String r1 = "is already destroyed"
            java.lang.String r2 = "Cannot configure "
            defpackage.u34.m(r2, r3, r0, r4, r1)
            r3 = 0
            return r3
    }

    public static defpackage.ad6 p(defpackage.ad6 r1) {
            p04 r0 = r1.A
            r0.b()
            int r0 = r0.e0
            if (r0 <= 0) goto La
            return r1
        La:
            ad6 r1 = defpackage.ad6.B
            return r1
    }

    public static final int q(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    public static final long r(defpackage.nr4 r4) {
            int r0 = r4.k()
            long r0 = (long) r0
            int r2 = r4.p()
            long r2 = (long) r2
            long r0 = r0 * r2
            float r2 = r4.l()
            int r4 = r4.p()
            float r4 = (float) r4
            float r2 = r2 * r4
            double r2 = (double) r2
            long r2 = defpackage.u24.F(r2)
            long r2 = r2 + r0
            return r2
    }

    public static final void s(defpackage.e36 r1, java.lang.String r2) {
            r1.getClass()
            j36 r1 = r1.i0(r2)
            r1.f0()     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            defpackage.lb4.p(r1, r2)
            return
        Lf:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L11
        L11:
            r0 = move-exception
            defpackage.lb4.p(r1, r2)
            throw r0
    }

    public static final defpackage.ub7 t(defpackage.zg1 r9, java.lang.Object r10) {
            z64 r0 = r9.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            z64 r0 = r9.A
            z64 r0 = r0.X
            sm3 r9 = defpackage.nc1.f0(r9)
        L13:
            r1 = 0
            if (r9 == 0) goto L90
            if0 r2 = r9.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L7f
        L23:
            if (r0 == 0) goto L7f
            int r2 = r0.L
            r2 = r2 & r3
            if (r2 == 0) goto L7c
            r2 = r0
            r4 = r1
        L2c:
            if (r2 == 0) goto L7c
            boolean r5 = r2 instanceof defpackage.ub7
            if (r5 == 0) goto L40
            r5 = r2
            ub7 r5 = (defpackage.ub7) r5
            java.lang.Object r6 = r5.n()
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L40
            return r5
        L40:
            int r5 = r2.L
            r5 = r5 & r3
            if (r5 == 0) goto L77
            boolean r5 = r2 instanceof defpackage.zg1
            if (r5 == 0) goto L77
            r5 = r2
            zg1 r5 = (defpackage.zg1) r5
            z64 r5 = r5.l0
            r6 = 0
        L4f:
            r7 = 1
            if (r5 == 0) goto L74
            int r8 = r5.L
            r8 = r8 & r3
            if (r8 == 0) goto L71
            int r6 = r6 + 1
            if (r6 != r7) goto L5d
            r2 = r5
            goto L71
        L5d:
            if (r4 != 0) goto L68
            ua4 r4 = new ua4
            r7 = 16
            z64[] r7 = new defpackage.z64[r7]
            r4.<init>(r7)
        L68:
            if (r2 == 0) goto L6e
            r4.b(r2)
            r2 = r1
        L6e:
            r4.b(r5)
        L71:
            z64 r5 = r5.Y
            goto L4f
        L74:
            if (r6 != r7) goto L77
            goto L2c
        L77:
            z64 r2 = defpackage.nc1.A(r4)
            goto L2c
        L7c:
            z64 r0 = r0.X
            goto L23
        L7f:
            sm3 r9 = r9.v()
            if (r9 == 0) goto L8e
            if0 r0 = r9.B0
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L13
        L8e:
            r0 = r1
            goto L13
        L90:
            return r1
    }

    public static java.util.List u(android.content.Context r34) {
            r34.getClass()
            java.lang.String r0 = "tts_models"
            r1 = r34
            java.io.File r2 = r1.getExternalFilesDir(r0)
            if (r2 == 0) goto L1a
            boolean r3 = r2.exists()
            if (r3 != 0) goto L2c
            boolean r3 = r2.mkdirs()
            if (r3 == 0) goto L1a
            goto L2c
        L1a:
            java.io.File r2 = new java.io.File
            java.io.File r1 = r1.getFilesDir()
            r2.<init>(r1, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L2c
            r2.mkdirs()
        L2c:
            xx3 r3 = new xx3
            r7 = 0
            r8 = 0
            java.lang.String r4 = "auto_multi"
            java.lang.String r5 = "🎭 24 голоса (Нейро-автораспределение)"
            java.lang.String r6 = "dynamic"
            r3.<init>(r4, r5, r6, r7, r8)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_dmitri.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            r4 = 0
            if (r1 == 0) goto L49
            r9 = r0
            goto L4a
        L49:
            r9 = r4
        L4a:
            xx3 r5 = new xx3
            java.lang.String r6 = "piper_ru_dmitri_medium"
            java.lang.String r7 = "🎙️ Дмитрий (Нейро-Баритон)"
            java.lang.String r8 = "male"
            r10 = 1100165939(0x41933333, float:18.4)
            r5.<init>(r6, r7, r8, r9, r10)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_elena.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L67
            r10 = r0
            goto L68
        L67:
            r10 = r4
        L68:
            xx3 r6 = new xx3
            java.lang.String r7 = "piper_ru_elena_medium"
            java.lang.String r8 = "🎙️ Елена (Нейро-Сопрано)"
            java.lang.String r9 = "female"
            r11 = 1100585370(0x4199999a, float:19.2)
            r6.<init>(r7, r8, r9, r10, r11)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_hero.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L85
            r11 = r0
            goto L86
        L85:
            r11 = r4
        L86:
            xx3 r7 = new xx3
            java.lang.String r8 = "piper_ru_hero"
            java.lang.String r9 = "🗡️ Молодой герой (Звонкий тенор)"
            java.lang.String r10 = "male"
            r12 = 1099956224(0x41900000, float:18.0)
            r7.<init>(r8, r9, r10, r11, r12)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_dark_knight.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto La2
            r12 = r0
            goto La3
        La2:
            r12 = r4
        La3:
            xx3 r8 = new xx3
            java.lang.String r9 = "piper_ru_dark_knight"
            java.lang.String r10 = "🦇 Темный рыцарь / Бэтмен (Хриплый бас)"
            java.lang.String r11 = "male"
            r13 = 1101266944(0x41a40000, float:20.5)
            r8.<init>(r9, r10, r11, r12, r13)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_boss_grunt.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lbf
            r13 = r0
            goto Lc0
        Lbf:
            r13 = r4
        Lc0:
            xx3 r9 = new xx3
            java.lang.String r10 = "piper_ru_boss_grunt"
            java.lang.String r11 = "👹 Босс / Тиран / Баузер (Тяжелый бас)"
            java.lang.String r12 = "male"
            r14 = 1101529088(0x41a80000, float:21.0)
            r9.<init>(r10, r11, r12, r13, r14)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_joker.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Ldc
            r14 = r0
            goto Ldd
        Ldc:
            r14 = r4
        Ldd:
            xx3 r10 = new xx3
            java.lang.String r11 = "piper_ru_joker_manic"
            java.lang.String r12 = "🃏 Джокер / Псих (Маниакальный тенор)"
            java.lang.String r13 = "male"
            r15 = 1100061082(0x4191999a, float:18.2)
            r10.<init>(r11, r12, r13, r14, r15)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_demon.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lfa
            r15 = r0
            goto Lfb
        Lfa:
            r15 = r4
        Lfb:
            xx3 r11 = new xx3
            java.lang.String r12 = "piper_ru_deep_demon"
            java.lang.String r13 = "💀 Демон бездны / Дракула (Глубокий бас)"
            java.lang.String r14 = "male"
            r16 = 1102053376(0x41b00000, float:22.0)
            r11.<init>(r12, r13, r14, r15, r16)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_elder.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L118
            r16 = r0
            goto L11a
        L118:
            r16 = r4
        L11a:
            xx3 r12 = new xx3
            java.lang.String r13 = "piper_ru_elder"
            java.lang.String r14 = "📜 Мудрый старец / Профессор (Хриплый)"
            java.lang.String r15 = "male"
            r17 = 1099694080(0x418c0000, float:17.5)
            r12.<init>(r13, r14, r15, r16, r17)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_boy.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L137
            r17 = r0
            goto L139
        L137:
            r17 = r4
        L139:
            xx3 r13 = new xx3
            java.lang.String r14 = "piper_ru_young_boy"
            java.lang.String r15 = "👦 Мальчик / Спутник / Люк (Звонкий)"
            java.lang.String r16 = "male"
            r18 = 1099169792(0x41840000, float:16.5)
            r13.<init>(r14, r15, r16, r17, r18)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_girl.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L156
            r18 = r0
            goto L158
        L156:
            r18 = r4
        L158:
            xx3 r14 = new xx3
            java.lang.String r15 = "piper_ru_young_girl"
            java.lang.String r16 = "👧 Девочка / Перл Фей (Нежный детский)"
            java.lang.String r17 = "female"
            r19 = 1099327078(0x41866666, float:16.8)
            r14.<init>(r15, r16, r17, r18, r19)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_queen.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L176
            r19 = r0
            goto L178
        L176:
            r19 = r4
        L178:
            xx3 r15 = new xx3
            java.lang.String r16 = "piper_ru_royal_queen"
            java.lang.String r17 = "👑 Принцесса / Королева Зельда (Величественный)"
            java.lang.String r18 = "female"
            r20 = 1100742656(0x419c0000, float:19.5)
            r15.<init>(r16, r17, r18, r19, r20)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_merchant.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L195
            r20 = r0
            goto L197
        L195:
            r20 = r4
        L197:
            xx3 r16 = new xx3
            java.lang.String r17 = "piper_ru_merchant"
            java.lang.String r18 = "💰 Торговец / Том Нук (Услужливый бодрый)"
            java.lang.String r19 = "male"
            r21 = 1099851366(0x418e6666, float:17.8)
            r16.<init>(r17, r18, r19, r20, r21)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_soldier.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1b5
            r21 = r0
            goto L1b7
        L1b5:
            r21 = r4
        L1b7:
            xx3 r17 = new xx3
            java.lang.String r18 = "piper_ru_soldier"
            java.lang.String r19 = "🛡️ Стражник / Капитан (Командный суровый)"
            java.lang.String r20 = "male"
            r22 = 1100270797(0x4194cccd, float:18.6)
            r17.<init>(r18, r19, r20, r21, r22)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_robot.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d5
            r22 = r0
            goto L1d7
        L1d5:
            r22 = r4
        L1d7:
            xx3 r18 = new xx3
            java.lang.String r19 = "piper_ru_robot"
            java.lang.String r20 = "🤖 Робот / Киборг / Покедекс (Синтетический)"
            java.lang.String r21 = "neutral"
            r23 = 1097859072(0x41700000, float:15.0)
            r18.<init>(r19, r20, r21, r22, r23)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_narrator.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1f4
            r23 = r0
            goto L1f6
        L1f4:
            r23 = r4
        L1f6:
            xx3 r19 = new xx3
            java.lang.String r20 = "piper_ru_narrator"
            java.lang.String r21 = "📖 Рассказчик / Летописец (Бархатный)"
            java.lang.String r22 = "neutral"
            r24 = 1100218368(0x41940000, float:18.5)
            r19.<init>(r20, r21, r22, r23, r24)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_tsundere.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L213
            r24 = r0
            goto L215
        L213:
            r24 = r4
        L215:
            xx3 r20 = new xx3
            java.lang.String r21 = "piper_ru_tsundere"
            java.lang.String r22 = "🎀 Цундере / Франциска (Капризное сопрано)"
            java.lang.String r23 = "female"
            r25 = 1100480512(0x41980000, float:19.0)
            r20.<init>(r21, r22, r23, r24, r25)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_whisper.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L232
            r25 = r0
            goto L234
        L232:
            r25 = r4
        L234:
            xx3 r21 = new xx3
            java.lang.String r22 = "piper_ru_whisper"
            java.lang.String r23 = "🤫 Таинственный шепот / Тень (Мистический)"
            java.lang.String r24 = "neutral"
            r26 = 1098907648(0x41800000, float:16.0)
            r21.<init>(r22, r23, r24, r25, r26)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_fairy.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L251
            r26 = r0
            goto L253
        L251:
            r26 = r4
        L253:
            xx3 r22 = new xx3
            java.lang.String r23 = "piper_ru_fairy"
            java.lang.String r24 = "✨ Веселая фея / Нави (Игривый высокий альт)"
            java.lang.String r25 = "female"
            r27 = 1099431936(0x41880000, float:17.0)
            r22.<init>(r23, r24, r25, r26, r27)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_pirate.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L270
            r27 = r0
            goto L272
        L270:
            r27 = r4
        L272:
            xx3 r23 = new xx3
            java.lang.String r24 = "piper_ru_pirate"
            java.lang.String r25 = "🏴\u200d☠️ Капитан пиратов (Грубый рычащий бас)"
            java.lang.String r26 = "male"
            r28 = 1101004800(0x41a00000, float:20.0)
            r23.<init>(r24, r25, r26, r27, r28)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_scientist.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L28f
            r28 = r0
            goto L291
        L28f:
            r28 = r4
        L291:
            xx3 r24 = new xx3
            java.lang.String r25 = "piper_ru_mad_scientist"
            java.lang.String r26 = "🔬 Безумный ученый / Вайли (Эксцентричный)"
            java.lang.String r27 = "male"
            r29 = 1099956224(0x41900000, float:18.0)
            r24.<init>(r25, r26, r27, r28, r29)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_gentleman.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2ae
            r29 = r0
            goto L2b0
        L2ae:
            r29 = r4
        L2b0:
            xx3 r25 = new xx3
            java.lang.String r26 = "piper_ru_gentleman"
            java.lang.String r27 = "🎩 Джентльмен / Лейтон / Райт (Элегантный)"
            java.lang.String r28 = "male"
            r30 = 1100480512(0x41980000, float:19.0)
            r25.<init>(r26, r27, r28, r29, r30)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_ghost.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2cd
            r30 = r0
            goto L2cf
        L2cd:
            r30 = r4
        L2cf:
            xx3 r26 = new xx3
            java.lang.String r27 = "piper_ru_ghost"
            java.lang.String r28 = "👻 Призрак / Фантом (Эфирный эхо-тон)"
            java.lang.String r29 = "neutral"
            r31 = 1099536794(0x4189999a, float:17.2)
            r26.<init>(r27, r28, r29, r30, r31)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_knight.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2ed
            r31 = r0
            goto L2ef
        L2ed:
            r31 = r4
        L2ef:
            xx3 r27 = new xx3
            java.lang.String r28 = "piper_ru_knight"
            java.lang.String r29 = "⚔️ Благородный рыцарь (Твердый баритон)"
            java.lang.String r30 = "male"
            r32 = 1100690227(0x419b3333, float:19.4)
            r27.<init>(r28, r29, r30, r31, r32)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ru_angelic.onnx"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L30d
            r32 = r0
            goto L30f
        L30d:
            r32 = r4
        L30f:
            xx3 r28 = new xx3
            java.lang.String r29 = "piper_ru_angelic"
            java.lang.String r30 = "🕊️ Богиня / Ангел Палютена (Священный)"
            java.lang.String r31 = "female"
            r33 = 1101004800(0x41a00000, float:20.0)
            r28.<init>(r29, r30, r31, r32, r33)
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            xx3[] r0 = new defpackage.xx3[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            java.util.List r0 = defpackage.hf.c0(r0)
            return r0
    }

    public static final long v(long r5) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 / r2
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r0 = r1 << r0
            long r5 = r5 & r3
            long r5 = r5 | r0
            return r5
    }

    public static final defpackage.e33 w() {
            e33 r0 = defpackage.ii2.A
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.FolderOpen"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1086324736(0x40c00000, float:6.0)
            r11 = 1101004800(0x41a00000, float:20.0)
            r4.o(r11, r2)
            r2 = -1056964608(0xffffffffc1000000, float:-8.0)
            r4.l(r2)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.n(r2, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            r4.m(r2, r2)
            r9 = -1073825710(0xffffffffbffeb852, float:-1.99)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r6 = 0
            r7 = -1073825710(0xffffffffbffeb852, float:-1.99)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1073741824(0x40000000, float:2.0)
            r12 = 1099956224(0x41900000, float:18.0)
            r4.m(r5, r12)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r13 = 1098907648(0x41800000, float:16.0)
            r4.l(r13)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1102053376(0x41b00000, float:22.0)
            r14 = 1090519040(0x41000000, float:8.0)
            r4.m(r5, r14)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 0
            r6 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r7 = -1083808154(0xffffffffbf666666, float:-0.9)
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.g()
            r4.o(r11, r12)
            r4.m(r2, r12)
            r4.m(r2, r14)
            r4.l(r13)
            r2 = 1092616192(0x41200000, float:10.0)
            r4.u(r2)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.ii2.A = r0
            return r0
    }

    public static final defpackage.um x(defpackage.l61 r1) {
            vs0 r0 = defpackage.vs0.i0
            j61 r1 = r1.Z(r0)
            um r1 = (defpackage.um) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public static final defpackage.e33 y() {
            e33 r0 = defpackage.ii2.B
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            r10 = 0
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            java.lang.String r2 = "Filled.RestartAlt"
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r5 = 1
            r6 = 0
            r4.<init>(r5, r6)
            r5 = 1094713344(0x41400000, float:12.0)
            r6 = 1084227584(0x40a00000, float:5.0)
            r4.o(r5, r6)
            r5 = 1073741824(0x40000000, float:2.0)
            r4.t(r5)
            r5 = 1090519040(0x41000000, float:8.0)
            r6 = 1086324736(0x40c00000, float:6.0)
            r4.m(r5, r6)
            r5 = 1082130432(0x40800000, float:4.0)
            r4.n(r5, r5)
            r5 = 1088421888(0x40e00000, float:7.0)
            r4.t(r5)
            r9 = 1086324736(0x40c00000, float:6.0)
            r10 = 1086324736(0x40c00000, float:6.0)
            r5 = 1079236362(0x4053d70a, float:3.31)
            r6 = 0
            r7 = 1086324736(0x40c00000, float:6.0)
            r8 = 1076635894(0x402c28f6, float:2.69)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = -1063256064(0xffffffffc0a00000, float:-5.0)
            r10 = 1086135992(0x40bd1eb8, float:5.91)
            r5 = 0
            r6 = 1077810299(0x403e147b, float:2.97)
            r7 = -1073028792(0xffffffffc00ae148, float:-2.17)
            r8 = 1085129359(0x40adc28f, float:5.43)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1073825710(0x400147ae, float:2.02)
            r4.u(r5)
            r9 = 1088421888(0x40e00000, float:7.0)
            r10 = -1057111409(0xffffffffc0fdc28f, float:-7.93)
            r5 = 1081920717(0x407ccccd, float:3.95)
            r6 = -1090854584(0xffffffffbefae148, float:-0.49)
            r7 = 1088421888(0x40e00000, float:7.0)
            r8 = -1065982362(0xffffffffc0766666, float:-3.85)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = 1094713344(0x41400000, float:12.0)
            r10 = 1084227584(0x40a00000, float:5.0)
            r5 = 1101004800(0x41a00000, float:20.0)
            r6 = 1091127214(0x410947ae, float:8.58)
            r7 = 1099127849(0x41835c29, float:16.42)
            r8 = 1084227584(0x40a00000, float:5.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            java.util.ArrayList r4 = r4.b
            r5 = 0
            defpackage.d33.a(r1, r4, r5, r0)
            cn6 r0 = new cn6
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 32
            r2.<init>(r3)
            tt4 r3 = new tt4
            r4 = 1086324736(0x40c00000, float:6.0)
            r5 = 1095761920(0x41500000, float:13.0)
            r3.<init>(r4, r5)
            r2.add(r3)
            yt4 r6 = new yt4
            r7 = 0
            r8 = -1076677837(0xffffffffbfd33333, float:-1.65)
            r9 = 1059816735(0x3f2b851f, float:0.67)
            r10 = -1068918374(0xffffffffc049999a, float:-3.15)
            r11 = 1071728558(0x3fe147ae, float:1.76)
            r12 = -1064849900(0xffffffffc087ae14, float:-4.24)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.add(r6)
            st4 r3 = new st4
            r4 = 1087037768(0x40cae148, float:6.34)
            r5 = 1089134920(0x40eae148, float:7.34)
            r3.<init>(r4, r5)
            r2.add(r3)
            qt4 r6 = new qt4
            r7 = 1084017869(0x409ccccd, float:4.9)
            r8 = 1091347415(0x410ca3d7, float:8.79)
            r9 = 1082130432(0x40800000, float:4.0)
            r10 = 1093444567(0x412ca3d7, float:10.79)
            r11 = 1082130432(0x40800000, float:4.0)
            r12 = 1095761920(0x41500000, float:13.0)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.add(r6)
            yt4 r7 = new yt4
            r8 = 0
            r9 = 1082298204(0x40828f5c, float:4.08)
            r10 = 1078145843(0x40433333, float:3.05)
            r11 = 1089344635(0x40ee147b, float:7.44)
            r12 = 1088421888(0x40e00000, float:7.0)
            r13 = 1090372239(0x40fdc28f, float:7.93)
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.add(r7)
            fu4 r3 = new fu4
            r4 = -1073657938(0xffffffffc00147ae, float:-2.02)
            r3.<init>(r4)
            r2.add(r3)
            qt4 r5 = new qt4
            r6 = 1090697298(0x4102b852, float:8.17)
            r7 = 1100181668(0x419370a4, float:18.43)
            r8 = 1086324736(0x40c00000, float:6.0)
            r9 = 1098876191(0x417f851f, float:15.97)
            r10 = 1086324736(0x40c00000, float:6.0)
            r11 = 1095761920(0x41500000, float:13.0)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r5)
            pt4 r3 = defpackage.pt4.c
            r2.add(r3)
            r3 = 0
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.ii2.B = r0
            return r0
    }

    public static final java.lang.String z(defpackage.px0 r1, int r2) {
            py0 r0 = defpackage.kf.a
            xq2 r1 = (defpackage.xq2) r1
            r1.j(r0)
            nq6 r0 = defpackage.kf.b
            java.lang.Object r1 = r1.j(r0)
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r1 = r1.getResources()
            if (r2 != 0) goto L1d
            r2 = 2131952287(0x7f13029f, float:1.9541012E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1d:
            r0 = 1
            if (r2 != r0) goto L28
            r2 = 2131951795(0x7f1300b3, float:1.9540015E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L28:
            r0 = 2
            if (r2 != r0) goto L33
            r2 = 2131951796(0x7f1300b4, float:1.9540017E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L33:
            r0 = 3
            if (r2 != r0) goto L3e
            r2 = 2131951848(0x7f1300e8, float:1.9540122E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L3e:
            r0 = 4
            if (r2 != r0) goto L49
            r2 = 2131951856(0x7f1300f0, float:1.9540138E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L49:
            r0 = 5
            if (r2 != r0) goto L54
            r2 = 2131952427(0x7f13032b, float:1.9541296E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L54:
            r0 = 6
            if (r2 != r0) goto L5f
            r2 = 2131952426(0x7f13032a, float:1.9541294E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L5f:
            r0 = 7
            if (r2 != r0) goto L6a
            r2 = 2131952207(0x7f13024f, float:1.954085E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L6a:
            java.lang.String r1 = ""
            return r1
    }

    public abstract int H(int r1);

    public abstract int N(int r1);

    @Override // defpackage.q96
    public int a(int r2) {
            r1 = this;
            int r2 = r1.H(r2)
            r0 = -1
            if (r2 != r0) goto L8
            return r0
        L8:
            int r1 = r1.H(r2)
            if (r1 != r0) goto Lf
            return r0
        Lf:
            return r2
    }

    @Override // defpackage.q96
    public int b(int r2) {
            r1 = this;
            int r2 = r1.N(r2)
            r0 = -1
            if (r2 != r0) goto L8
            return r0
        L8:
            int r1 = r1.N(r2)
            if (r1 != r0) goto Lf
            return r0
        Lf:
            return r2
    }

    @Override // defpackage.q96
    public int c(int r1) {
            r0 = this;
            int r0 = r0.N(r1)
            return r0
    }

    @Override // defpackage.q96
    public int d(int r1) {
            r0 = this;
            int r0 = r0.H(r1)
            return r0
    }
}
