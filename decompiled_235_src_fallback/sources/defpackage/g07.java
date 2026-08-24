package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g07  reason: default package */
/* loaded from: classes.dex */
public final class g07 {
    public final android.content.res.ColorStateList a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final android.content.res.ColorStateList k;
    public float l;
    public final int m;
    public boolean n;
    public boolean o;
    public android.graphics.Typeface p;

    public g07(android.content.Context r8, int r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.n = r0
            r7.o = r0
            int[] r1 = defpackage.m75.x
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r9, r1)
            r2 = 0
            float r3 = r1.getDimension(r0, r2)
            r7.l = r3
            r3 = 3
            android.content.res.ColorStateList r4 = defpackage.np2.S(r8, r1, r3)
            r7.k = r4
            r4 = 4
            defpackage.np2.S(r8, r1, r4)
            r4 = 5
            defpackage.np2.S(r8, r1, r4)
            r4 = 2
            int r4 = r1.getInt(r4, r0)
            r7.d = r4
            r4 = 1
            int r5 = r1.getInt(r4, r4)
            r7.e = r5
            r5 = 12
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L3b
            goto L3d
        L3b:
            r5 = 10
        L3d:
            int r6 = r1.getResourceId(r5, r0)
            r7.m = r6
            java.lang.String r5 = r1.getString(r5)
            r7.b = r5
            r5 = 14
            r1.getBoolean(r5, r0)
            r5 = 6
            android.content.res.ColorStateList r5 = defpackage.np2.S(r8, r1, r5)
            r7.a = r5
            r5 = 7
            float r5 = r1.getFloat(r5, r2)
            r7.f = r5
            r5 = 8
            float r5 = r1.getFloat(r5, r2)
            r7.g = r5
            r5 = 9
            float r5 = r1.getFloat(r5, r2)
            r7.h = r5
            r1.recycle()
            int[] r1 = defpackage.a75.t
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r1)
            boolean r9 = r8.hasValue(r0)
            r7.i = r9
            float r9 = r8.getFloat(r0, r2)
            r7.j = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r9 < r0) goto L95
            boolean r9 = r8.hasValue(r3)
            if (r9 == 0) goto L8e
            goto L8f
        L8e:
            r3 = r4
        L8f:
            java.lang.String r9 = r8.getString(r3)
            r7.c = r9
        L95:
            r8.recycle()
            return
    }

    public final void a() {
            r3 = this;
            android.graphics.Typeface r0 = r3.p
            int r1 = r3.d
            if (r0 != 0) goto L10
            java.lang.String r0 = r3.b
            if (r0 == 0) goto L10
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r3.p = r0
        L10:
            android.graphics.Typeface r0 = r3.p
            if (r0 != 0) goto L3a
            r0 = 1
            int r2 = r3.e
            if (r2 == r0) goto L2e
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L24
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r3.p = r0
            goto L32
        L24:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r3.p = r0
            goto L32
        L29:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            r3.p = r0
            goto L32
        L2e:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r3.p = r0
        L32:
            android.graphics.Typeface r0 = r3.p
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r3.p = r0
        L3a:
            return
    }

    public final void b(android.content.Context r10, defpackage.gi2 r11) {
            r9 = this;
            boolean r0 = r9.c(r10)
            if (r0 != 0) goto L9
            r9.a()
        L9:
            r1 = 1
            int r3 = r9.m
            if (r3 != 0) goto L10
            r9.n = r1
        L10:
            boolean r0 = r9.n
            if (r0 == 0) goto L1a
            android.graphics.Typeface r9 = r9.p
            r11.M(r9, r1)
            return
        L1a:
            e07 r6 = new e07     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            r6.<init>(r9, r11)     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            java.lang.ThreadLocal r0 = defpackage.sl5.a     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            boolean r0 = r10.isRestricted()     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            if (r0 == 0) goto L2c
            r10 = -4
            r6.n(r10)     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            return
        L2c:
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            r4.<init>()     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            r7 = 0
            r8 = 0
            r5 = 0
            r2 = r10
            defpackage.sl5.b(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L39 android.content.res.Resources.NotFoundException -> L57
            return
        L39:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading font "
            r0.<init>(r2)
            java.lang.String r2 = r9.b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextAppearance"
            android.util.Log.d(r2, r0, r10)
            r9.n = r1
            r9 = -3
            r11.K(r9)
            goto L5c
        L57:
            r9.n = r1
            r11.K(r1)
        L5c:
            return
    }

    public final boolean c(android.content.Context r11) {
            r10 = this;
            boolean r0 = r10.n
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            int r3 = r10.m
            if (r3 != 0) goto Ld
            goto L98
        Ld:
            java.lang.ThreadLocal r2 = defpackage.sl5.a
            boolean r2 = r11.isRestricted()
            r9 = 0
            if (r2 == 0) goto L19
            r2 = r11
            r11 = r9
            goto L27
        L19:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r7 = 0
            r8 = 1
            r5 = 0
            r6 = 0
            r2 = r11
            android.graphics.Typeface r11 = defpackage.sl5.b(r2, r3, r4, r5, r6, r7, r8)
        L27:
            if (r11 == 0) goto L2e
            r10.p = r11
            r10.n = r1
            return r1
        L2e:
            boolean r11 = r10.o
            if (r11 == 0) goto L33
            goto L91
        L33:
            r10.o = r1
            android.content.res.Resources r11 = r2.getResources()
            int r2 = r10.m
            if (r2 == 0) goto L7e
            java.lang.String r3 = r11.getResourceTypeName(r2)
            java.lang.String r4 = "font"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4a
            goto L7e
        L4a:
            android.content.res.XmlResourceParser r2 = r11.getXml(r2)     // Catch: java.lang.Throwable -> L7e
        L4e:
            int r3 = r2.getEventType()     // Catch: java.lang.Throwable -> L7e
            if (r3 == r1) goto L7e
            int r3 = r2.getEventType()     // Catch: java.lang.Throwable -> L7e
            r4 = 2
            if (r3 != r4) goto L7a
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "font-family"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L7a
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r2)     // Catch: java.lang.Throwable -> L7e
            int[] r3 = defpackage.g75.b     // Catch: java.lang.Throwable -> L7e
            android.content.res.TypedArray r11 = r11.obtainAttributes(r2, r3)     // Catch: java.lang.Throwable -> L7e
            r2 = 7
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> L7e
            r11.recycle()     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7a:
            r2.next()     // Catch: java.lang.Throwable -> L7e
            goto L4e
        L7e:
            r2 = r9
        L7f:
            if (r2 != 0) goto L82
            goto L91
        L82:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r2, r0)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            if (r11 != r2) goto L8b
            goto L91
        L8b:
            int r2 = r10.d
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r11, r2)
        L91:
            if (r9 == 0) goto L98
            r10.p = r9
            r10.n = r1
            return r1
        L98:
            return r0
    }

    public final void d(android.content.Context r2, android.text.TextPaint r3, defpackage.gi2 r4) {
            r1 = this;
            r1.e(r2, r3, r4)
            android.content.res.ColorStateList r2 = r1.k
            if (r2 == 0) goto L12
            int[] r4 = r3.drawableState
            int r0 = r2.getDefaultColor()
            int r2 = r2.getColorForState(r4, r0)
            goto L14
        L12:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L14:
            r3.setColor(r2)
            android.content.res.ColorStateList r2 = r1.a
            if (r2 == 0) goto L26
            int[] r4 = r3.drawableState
            int r0 = r2.getDefaultColor()
            int r2 = r2.getColorForState(r4, r0)
            goto L27
        L26:
            r2 = 0
        L27:
            float r4 = r1.h
            float r0 = r1.f
            float r1 = r1.g
            r3.setShadowLayer(r4, r0, r1, r2)
            return
    }

    public final void e(android.content.Context r2, android.text.TextPaint r3, defpackage.gi2 r4) {
            r1 = this;
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L12
            boolean r0 = r1.n
            if (r0 == 0) goto L12
            android.graphics.Typeface r0 = r1.p
            if (r0 == 0) goto L12
            r1.f(r2, r3, r0)
            return
        L12:
            r1.a()
            android.graphics.Typeface r0 = r1.p
            r1.f(r2, r3, r0)
            f07 r0 = new f07
            r0.<init>(r1, r2, r3, r4)
            r1.b(r2, r0)
            return
    }

    public final void f(android.content.Context r1, android.text.TextPaint r2, android.graphics.Typeface r3) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.graphics.Typeface r1 = defpackage.ln2.P(r1, r3)
            if (r1 == 0) goto Lf
            r3 = r1
        Lf:
            r2.setTypeface(r3)
            int r1 = r3.getStyle()
            int r1 = ~r1
            int r3 = r0.d
            r1 = r1 & r3
            r3 = r1 & 1
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r2.setFakeBoldText(r3)
            r1 = r1 & 2
            if (r1 == 0) goto L2b
            r1 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r2.setTextSkewX(r1)
            float r1 = r0.l
            r2.setTextSize(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L3f
            java.lang.String r1 = r0.c
            defpackage.q66.w(r2, r1)
        L3f:
            boolean r1 = r0.i
            if (r1 == 0) goto L48
            float r0 = r0.j
            r2.setLetterSpacing(r0)
        L48:
            return
    }
}
