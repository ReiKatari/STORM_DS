package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs  reason: default package */
/* loaded from: classes.dex */
public final class vs {
    public static final android.graphics.RectF l = null;
    public static final java.util.concurrent.ConcurrentHashMap m = null;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public android.text.TextPaint h;
    public final android.widget.TextView i;
    public final android.content.Context j;
    public final defpackage.ss k;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            defpackage.vs.l = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.vs.m = r0
            return
    }

    public vs(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.c = r1
            r2.d = r1
            r2.e = r1
            int[] r1 = new int[r0]
            r2.f = r1
            r2.g = r0
            r2.i = r3
            android.content.Context r3 = r3.getContext()
            r2.j = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            ts r3 = new ts
            r3.<init>()
            r2.k = r3
            return
        L2c:
            ss r3 = new ss
            r3.<init>()
            r2.k = r3
            return
    }

    public static int[] b(int[] r6) {
            int r0 = r6.length
            if (r0 != 0) goto L4
            goto L2e
        L4:
            java.util.Arrays.sort(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r0) goto L28
            r4 = r6[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
        L2e:
            return r6
        L2f:
            int r6 = r1.size()
            int[] r0 = new int[r6]
        L35:
            if (r2 >= r6) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    public static java.lang.reflect.Method d(java.lang.String r4) {
            r0 = 0
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.vs.m     // Catch: java.lang.Exception -> L1b
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Exception -> L1b
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Exception -> L1b
            if (r2 != 0) goto L1d
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r0)     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L1d
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L1b
            r1.put(r4, r2)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            r1 = move-exception
            goto L1e
        L1d:
            return r2
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to retrieve TextView#"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "() method"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "ACTVAutoSizeHelper"
            android.util.Log.w(r2, r4, r1)
            return r0
    }

    public static java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
            java.lang.reflect.Method r0 = d(r4)     // Catch: java.lang.Exception -> La java.lang.Throwable -> Lc
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> La java.lang.Throwable -> Lc
            return r2
        La:
            r2 = move-exception
            goto Le
        Lc:
            r2 = move-exception
            throw r2
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "() method"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r4, r2)
            return r3
    }

    public final void a() {
            r3 = this;
            boolean r0 = r3.f()
            if (r0 != 0) goto L8
            goto L7d
        L8:
            boolean r0 = r3.b
            if (r0 == 0) goto L7e
            android.widget.TextView r0 = r3.i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L7d
            android.widget.TextView r0 = r3.i
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L1d
            goto L7d
        L1d:
            ss r0 = r3.k
            android.widget.TextView r1 = r3.i
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L2a
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L3e
        L2a:
            android.widget.TextView r0 = r3.i
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r3.i
            int r1 = r1.getTotalPaddingLeft()
            int r0 = r0 - r1
            android.widget.TextView r1 = r3.i
            int r1 = r1.getTotalPaddingRight()
            int r0 = r0 - r1
        L3e:
            android.widget.TextView r1 = r3.i
            int r1 = r1.getHeight()
            android.widget.TextView r2 = r3.i
            int r2 = r2.getCompoundPaddingBottom()
            int r1 = r1 - r2
            android.widget.TextView r2 = r3.i
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 - r2
            if (r0 <= 0) goto L7d
            if (r1 > 0) goto L57
            goto L7d
        L57:
            android.graphics.RectF r2 = defpackage.vs.l
            monitor-enter(r2)
            r2.setEmpty()     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L77
            r2.right = r0     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r1     // Catch: java.lang.Throwable -> L77
            r2.bottom = r0     // Catch: java.lang.Throwable -> L77
            int r0 = r3.c(r2)     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L77
            android.widget.TextView r1 = r3.i     // Catch: java.lang.Throwable -> L77
            float r1 = r1.getTextSize()     // Catch: java.lang.Throwable -> L77
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L79
            r1 = 0
            r3.g(r1, r0)     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r3 = move-exception
            goto L7b
        L79:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            goto L7e
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            throw r3
        L7d:
            return
        L7e:
            r0 = 1
            r3.b = r0
            return
    }

    public final int c(android.graphics.RectF r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int[] r2 = r0.f
            int r2 = r2.length
            r3 = 0
            if (r2 == 0) goto La1
            r4 = 1
            int r2 = r2 - r4
            r5 = r3
            r3 = r4
        Le:
            int[] r6 = r0.f
            if (r3 > r2) goto L9e
            int r5 = r3 + r2
            int r5 = r5 / 2
            r6 = r6[r5]
            android.widget.TextView r7 = r0.i
            java.lang.CharSequence r8 = r7.getText()
            android.text.method.TransformationMethod r9 = r7.getTransformationMethod()
            if (r9 == 0) goto L2c
            java.lang.CharSequence r9 = r9.getTransformation(r8, r7)
            if (r9 == 0) goto L2c
            r10 = r9
            goto L2d
        L2c:
            r10 = r8
        L2d:
            int r13 = r7.getMaxLines()
            android.text.TextPaint r8 = r0.h
            if (r8 != 0) goto L3d
            android.text.TextPaint r8 = new android.text.TextPaint
            r8.<init>()
            r0.h = r8
            goto L40
        L3d:
            r8.reset()
        L40:
            android.text.TextPaint r8 = r0.h
            android.text.TextPaint r9 = r7.getPaint()
            r8.set(r9)
            android.text.TextPaint r8 = r0.h
            float r6 = (float) r6
            r8.setTextSize(r6)
            java.lang.String r6 = "getLayoutAlignment"
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.Object r6 = e(r7, r8, r6)
            r11 = r6
            android.text.Layout$Alignment r11 = (android.text.Layout.Alignment) r11
            float r6 = r1.right
            int r12 = java.lang.Math.round(r6)
            android.text.TextPaint r15 = r0.h
            ss r6 = r0.k
            android.widget.TextView r14 = r0.i
            r16 = r6
            android.text.StaticLayout r6 = defpackage.rs.a(r10, r11, r12, r13, r14, r15, r16)
            r7 = -1
            if (r13 == r7) goto L85
            int r7 = r6.getLineCount()
            if (r7 > r13) goto L90
            int r7 = r6.getLineCount()
            int r7 = r7 - r4
            int r7 = r6.getLineEnd(r7)
            int r8 = r10.length()
            if (r7 == r8) goto L85
            goto L90
        L85:
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r7 = r1.bottom
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L95
        L90:
            int r5 = r5 + (-1)
            r2 = r5
            goto Le
        L95:
            int r5 = r5 + 1
            r17 = r5
            r5 = r3
            r3 = r17
            goto Le
        L9e:
            r0 = r6[r5]
            return r0
        La1:
            java.lang.String r0 = "No available text sizes to choose from."
            defpackage.i.m(r0)
            return r3
    }

    public final boolean f() {
            r1 = this;
            boolean r0 = r1.j()
            if (r0 == 0) goto Lc
            int r1 = r1.a
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final void g(int r3, float r4) {
            r2 = this;
            android.content.Context r0 = r2.j
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            android.widget.TextView r4 = r2.i
            android.text.TextPaint r0 = r4.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L58
            android.text.TextPaint r0 = r4.getPaint()
            r0.setTextSize(r3)
            boolean r3 = r4.isInLayout()
            android.text.Layout r0 = r4.getLayout()
            if (r0 == 0) goto L58
            r0 = 0
            r2.b = r0
            java.lang.String r2 = "nullLayouts"
            java.lang.reflect.Method r2 = d(r2)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L4c
            r0 = 0
            r2.invoke(r4, r0)     // Catch: java.lang.Exception -> L44
            goto L4c
        L44:
            r2 = move-exception
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.String r1 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r0, r1, r2)
        L4c:
            if (r3 != 0) goto L52
            r4.requestLayout()
            goto L55
        L52:
            r4.forceLayout()
        L55:
            r4.invalidate()
        L58:
            return
    }

    public final boolean h() {
            r7 = this;
            boolean r0 = r7.j()
            r1 = 0
            if (r0 == 0) goto L41
            int r0 = r7.a
            r2 = 1
            if (r0 != r2) goto L41
            boolean r0 = r7.g
            if (r0 == 0) goto L15
            int[] r0 = r7.f
            int r0 = r0.length
            if (r0 != 0) goto L3e
        L15:
            float r0 = r7.e
            float r3 = r7.d
            float r0 = r0 - r3
            float r3 = r7.c
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            int r0 = r0 + r2
            int[] r3 = new int[r0]
        L26:
            if (r1 >= r0) goto L38
            float r4 = r7.d
            float r5 = (float) r1
            float r6 = r7.c
            float r5 = r5 * r6
            float r5 = r5 + r4
            int r4 = java.lang.Math.round(r5)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L26
        L38:
            int[] r0 = b(r3)
            r7.f = r0
        L3e:
            r7.b = r2
            goto L43
        L41:
            r7.b = r1
        L43:
            boolean r7 = r7.b
            return r7
    }

    public final boolean i() {
            r5 = this;
            int[] r0 = r5.f
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L9
            r4 = r3
            goto La
        L9:
            r4 = r2
        La:
            r5.g = r4
            if (r4 == 0) goto L1f
            r5.a = r3
            r2 = r0[r2]
            float r2 = (float) r2
            r5.d = r2
            int r1 = r1 - r3
            r0 = r0[r1]
            float r0 = (float) r0
            r5.e = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.c = r0
        L1f:
            return r4
    }

    public final boolean j() {
            r0 = this;
            android.widget.TextView r0 = r0.i
            boolean r0 = r0 instanceof defpackage.kr
            r0 = r0 ^ 1
            return r0
    }

    public final void k(float r4, float r5, float r6) {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = "px) is less or equal to (0px)"
            if (r1 <= 0) goto L54
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L33
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            r3.a = r0
            r3.d = r4
            r3.e = r5
            r3.c = r6
            r4 = 0
            r3.g = r4
            return
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The auto-size step granularity ("
            r4.<init>(r5)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Maximum auto-size text size ("
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size text size ("
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "px)"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L54:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Minimum auto-size text size ("
            r5.<init>(r6)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }
}
