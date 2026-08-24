package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me6  reason: default package */
/* loaded from: classes.dex */
public final class me6 {
    public defpackage.q60 a;
    public defpackage.q60 b;
    public defpackage.q60 c;
    public defpackage.q60 d;
    public defpackage.f61 e;
    public defpackage.f61 f;
    public defpackage.f61 g;
    public defpackage.f61 h;
    public defpackage.cs1 i;
    public defpackage.cs1 j;
    public defpackage.cs1 k;
    public defpackage.cs1 l;

    public me6() {
            r2 = this;
            r2.<init>()
            a26 r0 = new a26
            r0.<init>()
            r2.a = r0
            a26 r0 = new a26
            r0.<init>()
            r2.b = r0
            a26 r0 = new a26
            r0.<init>()
            r2.c = r0
            a26 r0 = new a26
            r0.<init>()
            r2.d = r0
            t r0 = new t
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            t r0 = new t
            r0.<init>(r1)
            r2.f = r0
            t r0 = new t
            r0.<init>(r1)
            r2.g = r0
            t r0 = new t
            r0.<init>(r1)
            r2.h = r0
            cs1 r0 = new cs1
            r1 = 0
            r0.<init>(r1)
            r2.i = r0
            cs1 r0 = new cs1
            r0.<init>(r1)
            r2.j = r0
            cs1 r0 = new cs1
            r0.<init>(r1)
            r2.k = r0
            cs1 r0 = new cs1
            r0.<init>(r1)
            r2.l = r0
            return
    }

    public static defpackage.le6 a(android.content.Context r6, int r7, int r8, defpackage.t r9) {
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r6, r7)
            r6 = 1
            if (r8 == 0) goto Lf
            android.content.res.Resources$Theme r7 = r0.getTheme()
            r7.applyStyle(r8, r6)
        Lf:
            int[] r7 = defpackage.a75.y
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7)
            r8 = 0
            int r8 = r7.getInt(r8, r8)     // Catch: java.lang.Throwable -> L71
            r0 = 3
            int r0 = r7.getInt(r0, r8)     // Catch: java.lang.Throwable -> L71
            r1 = 4
            int r1 = r7.getInt(r1, r8)     // Catch: java.lang.Throwable -> L71
            r2 = 2
            int r2 = r7.getInt(r2, r8)     // Catch: java.lang.Throwable -> L71
            int r6 = r7.getInt(r6, r8)     // Catch: java.lang.Throwable -> L71
            r8 = 5
            f61 r8 = c(r7, r8, r9)     // Catch: java.lang.Throwable -> L71
            r9 = 8
            f61 r9 = c(r7, r9, r8)     // Catch: java.lang.Throwable -> L71
            r3 = 9
            f61 r3 = c(r7, r3, r8)     // Catch: java.lang.Throwable -> L71
            r4 = 7
            f61 r4 = c(r7, r4, r8)     // Catch: java.lang.Throwable -> L71
            r5 = 6
            f61 r8 = c(r7, r5, r8)     // Catch: java.lang.Throwable -> L71
            le6 r5 = new le6     // Catch: java.lang.Throwable -> L71
            r5.<init>()     // Catch: java.lang.Throwable -> L71
            q60 r0 = defpackage.jx2.r(r0)     // Catch: java.lang.Throwable -> L71
            r5.a = r0     // Catch: java.lang.Throwable -> L71
            r5.e = r9     // Catch: java.lang.Throwable -> L71
            q60 r9 = defpackage.jx2.r(r1)     // Catch: java.lang.Throwable -> L71
            r5.b = r9     // Catch: java.lang.Throwable -> L71
            r5.f = r3     // Catch: java.lang.Throwable -> L71
            q60 r9 = defpackage.jx2.r(r2)     // Catch: java.lang.Throwable -> L71
            r5.c = r9     // Catch: java.lang.Throwable -> L71
            r5.g = r4     // Catch: java.lang.Throwable -> L71
            q60 r6 = defpackage.jx2.r(r6)     // Catch: java.lang.Throwable -> L71
            r5.d = r6     // Catch: java.lang.Throwable -> L71
            r5.h = r8     // Catch: java.lang.Throwable -> L71
            r7.recycle()
            return r5
        L71:
            r6 = move-exception
            r7.recycle()
            throw r6
    }

    public static defpackage.le6 b(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            t r0 = new t
            r1 = 0
            r0.<init>(r1)
            int[] r1 = defpackage.a75.r
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r1, r4, r5)
            r4 = 0
            int r5 = r3.getResourceId(r4, r4)
            r1 = 1
            int r4 = r3.getResourceId(r1, r4)
            r3.recycle()
            le6 r2 = a(r2, r5, r4, r0)
            return r2
    }

    public static defpackage.f61 c(android.content.res.TypedArray r2, int r3, defpackage.f61 r4) {
            android.util.TypedValue r3 = r2.peekValue(r3)
            if (r3 != 0) goto L7
            goto L30
        L7:
            int r0 = r3.type
            r1 = 5
            if (r0 != r1) goto L21
            t r4 = new t
            int r3 = r3.data
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r3, r2)
            float r2 = (float) r2
            r4.<init>(r2)
            return r4
        L21:
            r2 = 6
            if (r0 != r2) goto L30
            ei5 r2 = new ei5
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r2.<init>(r3)
            return r2
        L30:
            return r4
    }

    public final boolean d() {
            r1 = this;
            q60 r0 = r1.b
            boolean r0 = r0 instanceof defpackage.a26
            if (r0 == 0) goto L1a
            q60 r0 = r1.a
            boolean r0 = r0 instanceof defpackage.a26
            if (r0 == 0) goto L1a
            q60 r0 = r1.c
            boolean r0 = r0 instanceof defpackage.a26
            if (r0 == 0) goto L1a
            q60 r1 = r1.d
            boolean r1 = r1 instanceof defpackage.a26
            if (r1 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public final boolean e(android.graphics.RectF r6) {
            r5 = this;
            cs1 r0 = r5.l
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<cs1> r1 = defpackage.cs1.class
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L36
            cs1 r0 = r5.j
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            cs1 r0 = r5.i
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            cs1 r0 = r5.k
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = r2
        L37:
            f61 r1 = r5.e
            float r1 = r1.a(r6)
            f61 r4 = r5.f
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            f61 r4 = r5.h
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            f61 r4 = r5.g
            float r6 = r4.a(r6)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            r6 = r3
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r0 == 0) goto L69
            if (r6 == 0) goto L69
            boolean r5 = r5.d()
            if (r5 == 0) goto L69
            return r3
        L69:
            return r2
    }

    public final defpackage.le6 f() {
            r2 = this;
            le6 r0 = new le6
            r0.<init>()
            q60 r1 = r2.a
            r0.a = r1
            q60 r1 = r2.b
            r0.b = r1
            q60 r1 = r2.c
            r0.c = r1
            q60 r1 = r2.d
            r0.d = r1
            f61 r1 = r2.e
            r0.e = r1
            f61 r1 = r2.f
            r0.f = r1
            f61 r1 = r2.g
            r0.g = r1
            f61 r1 = r2.h
            r0.h = r1
            cs1 r1 = r2.i
            r0.i = r1
            cs1 r1 = r2.j
            r0.j = r1
            cs1 r1 = r2.k
            r0.k = r1
            cs1 r2 = r2.l
            r0.l = r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            f61 r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            f61 r2 = r3.f
            r0.append(r2)
            r0.append(r1)
            f61 r2 = r3.g
            r0.append(r2)
            r0.append(r1)
            f61 r3 = r3.h
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
