package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju7  reason: default package */
/* loaded from: classes.dex */
public abstract class ju7 extends defpackage.ru7 {
    public static boolean m = false;
    public static java.lang.reflect.Method n;
    public static java.lang.Class o;
    public static java.lang.reflect.Field p;
    public static java.lang.reflect.Field q;
    public final android.view.WindowInsets c;
    public defpackage.e83[] d;
    public defpackage.e83 e;
    public defpackage.vu7 f;
    public defpackage.e83 g;
    public int h;
    public int i;
    public int j;
    public android.graphics.Rect[][] k;
    public android.graphics.Rect[][] l;

    public ju7(defpackage.vu7 r2, android.view.WindowInsets r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.e = r2
            r2 = 10
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r2]
            r1.k = r0
            android.graphics.Rect[][] r2 = new android.graphics.Rect[r2]
            r1.l = r2
            r1.c = r3
            return
    }

    private defpackage.cl1 B(android.view.View r12) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            android.view.Display r12 = r12.getDisplay()
            if (r12 != 0) goto Lb
            return r0
        Lb:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r12.getRealSize(r0)
            vu7 r11 = r11.a
            ru7 r11 = r11.a
            boolean r11 = r11.s()
            if (r11 == 0) goto L2b
            int r1 = r0.x
            int r2 = r0.y
            r6 = 0
            r7 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            cl1 r11 = defpackage.cl1.a(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L2b:
            r11 = 0
            x16 r1 = defpackage.nw7.i0(r12, r11)
            r2 = 1
            x16 r2 = defpackage.nw7.i0(r12, r2)
            r3 = 2
            x16 r3 = defpackage.nw7.i0(r12, r3)
            r4 = 3
            x16 r12 = defpackage.nw7.i0(r12, r4)
            int r4 = r0.x
            int r5 = r0.y
            if (r1 == 0) goto L49
            int r0 = r1.b
            r7 = r0
            goto L4a
        L49:
            r7 = r11
        L4a:
            if (r2 == 0) goto L50
            int r0 = r2.b
            r8 = r0
            goto L51
        L50:
            r8 = r11
        L51:
            if (r3 == 0) goto L57
            int r0 = r3.b
            r9 = r0
            goto L58
        L57:
            r9 = r11
        L58:
            if (r12 == 0) goto L5c
            int r11 = r12.b
        L5c:
            r10 = r11
            r6 = 0
            cl1 r11 = defpackage.cl1.a(r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    private static java.util.List<android.graphics.Rect> C(android.graphics.Rect[][] r6, int r7) {
            r0 = 0
            r1 = 1
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L2b
            r2 = r7 & r1
            if (r2 != 0) goto Lb
            goto L28
        Lb:
            int r2 = defpackage.su7.a(r1)
            r2 = r6[r2]
            if (r2 != 0) goto L14
            goto L28
        L14:
            if (r0 != 0) goto L18
            r0 = r2
            goto L28
        L18:
            int r3 = r0.length
            int r4 = r2.length
            int r3 = r3 + r4
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            int r4 = r0.length
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r3, r5, r4)
            int r0 = r0.length
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r5, r3, r0, r4)
            r0 = r3
        L28:
            int r1 = r1 << 1
            goto L2
        L2b:
            if (r0 != 0) goto L30
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            return r6
        L30:
            java.util.List r6 = java.util.Arrays.asList(r0)
            return r6
    }

    private android.graphics.Rect[] D(defpackage.e83 r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.a
            int r2 = r8.d
            int r3 = r8.c
            int r4 = r8.b
            r5 = 0
            if (r1 == 0) goto L1c
            android.graphics.Rect r1 = new android.graphics.Rect
            int r8 = r8.a
            int r6 = r7.i
            r1.<init>(r5, r5, r8, r6)
            r0.add(r1)
        L1c:
            if (r4 == 0) goto L28
            android.graphics.Rect r8 = new android.graphics.Rect
            int r1 = r7.j
            r8.<init>(r5, r5, r1, r4)
            r0.add(r8)
        L28:
            if (r3 == 0) goto L38
            android.graphics.Rect r8 = new android.graphics.Rect
            int r1 = r7.j
            int r3 = r1 - r3
            int r4 = r7.i
            r8.<init>(r3, r5, r1, r4)
            r0.add(r8)
        L38:
            if (r2 == 0) goto L48
            android.graphics.Rect r8 = new android.graphics.Rect
            int r1 = r7.i
            int r2 = r1 - r2
            int r7 = r7.j
            r8.<init>(r5, r2, r7, r1)
            r0.add(r8)
        L48:
            int r7 = r0.size()
            android.graphics.Rect[] r7 = new android.graphics.Rect[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            android.graphics.Rect[] r7 = (android.graphics.Rect[]) r7
            return r7
    }

    private defpackage.e83 E(int r4, boolean r5) {
            r3 = this;
            e83 r0 = defpackage.e83.e
            r1 = 1
        L3:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L17
            r2 = r4 & r1
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            e83 r2 = r3.F(r1, r5)
            e83 r0 = defpackage.e83.a(r0, r2)
        L14:
            int r1 = r1 << 1
            goto L3
        L17:
            return r0
    }

    private defpackage.e83 G() {
            r0 = this;
            vu7 r0 = r0.f
            if (r0 == 0) goto Lb
            ru7 r0 = r0.a
            e83 r0 = r0.k()
            return r0
        Lb:
            e83 r0 = defpackage.e83.e
            return r0
    }

    private defpackage.e83 H(android.view.View r5) {
            r4 = this;
            java.lang.String r4 = "WindowInsetsCompat"
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 >= r1) goto L64
            boolean r0 = defpackage.ju7.m
            if (r0 != 0) goto L10
            J()
        L10:
            java.lang.reflect.Method r0 = defpackage.ju7.n
            if (r0 == 0) goto L63
            java.lang.Class r1 = defpackage.ju7.o
            if (r1 == 0) goto L63
            java.lang.reflect.Field r1 = defpackage.ju7.p
            if (r1 != 0) goto L1d
            goto L63
        L1d:
            java.lang.Object r5 = r0.invoke(r5, r2)     // Catch: java.lang.ReflectiveOperationException -> L2e
            if (r5 != 0) goto L30
            java.lang.String r5 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L2e
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L2e
            android.util.Log.w(r4, r5, r0)     // Catch: java.lang.ReflectiveOperationException -> L2e
            return r2
        L2e:
            r5 = move-exception
            goto L4e
        L30:
            java.lang.reflect.Field r0 = defpackage.ju7.q     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.reflect.Field r0 = defpackage.ju7.p     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
            android.graphics.Rect r5 = (android.graphics.Rect) r5     // Catch: java.lang.ReflectiveOperationException -> L2e
            if (r5 == 0) goto L4d
            int r0 = r5.left     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r1 = r5.top     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r3 = r5.right     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r5 = r5.bottom     // Catch: java.lang.ReflectiveOperationException -> L2e
            e83 r4 = defpackage.e83.c(r0, r1, r3, r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
            return r4
        L4d:
            return r2
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to get visible insets. (Reflection error). "
            r0.<init>(r1)
            java.lang.String r1 = r5.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0, r5)
        L63:
            return r2
        L64:
            java.lang.String r4 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            defpackage.fa6.h(r4)
            return r2
    }

    private static void J() {
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "getViewRootImpl"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.ju7.n = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.View$AttachInfo"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.ju7.o = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mVisibleInsets"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.ju7.p = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.ViewRootImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mAttachInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.ju7.q = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = defpackage.ju7.p     // Catch: java.lang.ReflectiveOperationException -> L35
            r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = defpackage.ju7.q     // Catch: java.lang.ReflectiveOperationException -> L35
            r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
            goto L4d
        L35:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "WindowInsetsCompat"
            android.util.Log.e(r3, r2, r1)
        L4d:
            defpackage.ju7.m = r0
            return
    }

    public static boolean L(int r0, int r1) {
            r0 = r0 & 6
            r1 = r1 & 6
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // defpackage.ru7
    public void A(android.graphics.Rect[][] r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.l = r1
            return
    }

    public defpackage.e83 F(int r5, boolean r6) {
            r4 = this;
            r0 = 1
            e83 r1 = defpackage.e83.e
            r2 = 0
            if (r5 == r0) goto Lf4
            r0 = 0
            r3 = 2
            if (r5 == r3) goto La6
            r6 = 8
            if (r5 == r6) goto L6f
            r6 = 16
            if (r5 == r6) goto L6a
            r6 = 32
            if (r5 == r6) goto L65
            r6 = 64
            if (r5 == r6) goto L60
            r6 = 128(0x80, float:1.8E-43)
            if (r5 == r6) goto L20
            goto L111
        L20:
            vu7 r5 = r4.f
            if (r5 == 0) goto L2b
            ru7 r4 = r5.a
            yk1 r4 = r4.g()
            goto L2f
        L2b:
            yk1 r4 = r4.g()
        L2f:
            if (r4 == 0) goto L111
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L3e
            android.view.DisplayCutout r0 = r4.a
            int r0 = defpackage.pp.m(r0)
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r5 < r6) goto L48
            android.view.DisplayCutout r1 = r4.a
            int r1 = defpackage.pp.o(r1)
            goto L49
        L48:
            r1 = r2
        L49:
            if (r5 < r6) goto L52
            android.view.DisplayCutout r3 = r4.a
            int r3 = defpackage.pp.n(r3)
            goto L53
        L52:
            r3 = r2
        L53:
            if (r5 < r6) goto L5b
            android.view.DisplayCutout r4 = r4.a
            int r2 = defpackage.pp.l(r4)
        L5b:
            e83 r4 = defpackage.e83.c(r0, r1, r3, r2)
            return r4
        L60:
            e83 r4 = r4.n()
            return r4
        L65:
            e83 r4 = r4.j()
            return r4
        L6a:
            e83 r4 = r4.l()
            return r4
        L6f:
            e83[] r5 = r4.d
            if (r5 == 0) goto L79
            int r6 = defpackage.su7.a(r6)
            r0 = r5[r6]
        L79:
            if (r0 == 0) goto L7c
            return r0
        L7c:
            e83 r5 = r4.m()
            e83 r6 = r4.G()
            int r5 = r5.d
            int r0 = r6.d
            if (r5 <= r0) goto L8f
            e83 r4 = defpackage.e83.c(r2, r2, r2, r5)
            return r4
        L8f:
            e83 r5 = r4.g
            if (r5 == 0) goto L111
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L111
            e83 r4 = r4.g
            int r4 = r4.d
            int r5 = r6.d
            if (r4 <= r5) goto L111
            e83 r4 = defpackage.e83.c(r2, r2, r2, r4)
            return r4
        La6:
            if (r6 == 0) goto Lcd
            e83 r5 = r4.G()
            e83 r4 = r4.k()
            int r6 = r5.a
            int r0 = r4.a
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = r5.c
            int r1 = r4.c
            int r0 = java.lang.Math.max(r0, r1)
            int r5 = r5.d
            int r4 = r4.d
            int r4 = java.lang.Math.max(r5, r4)
            e83 r4 = defpackage.e83.c(r6, r2, r0, r4)
            return r4
        Lcd:
            int r5 = r4.h
            r5 = r5 & r3
            if (r5 == 0) goto Ld3
            goto L111
        Ld3:
            e83 r5 = r4.m()
            vu7 r4 = r4.f
            if (r4 == 0) goto Le1
            ru7 r4 = r4.a
            e83 r0 = r4.k()
        Le1:
            int r4 = r5.d
            if (r0 == 0) goto Leb
            int r6 = r0.d
            int r4 = java.lang.Math.min(r4, r6)
        Leb:
            int r6 = r5.a
            int r5 = r5.c
            e83 r4 = defpackage.e83.c(r6, r2, r5, r4)
            return r4
        Lf4:
            if (r6 == 0) goto L10b
            e83 r5 = r4.G()
            int r5 = r5.b
            e83 r4 = r4.m()
            int r4 = r4.b
            int r4 = java.lang.Math.max(r5, r4)
            e83 r4 = defpackage.e83.c(r2, r4, r2, r2)
            return r4
        L10b:
            int r5 = r4.h
            r5 = r5 & 4
            if (r5 == 0) goto L112
        L111:
            return r1
        L112:
            e83 r4 = r4.m()
            int r4 = r4.b
            e83 r4 = defpackage.e83.c(r2, r4, r2, r2)
            return r4
    }

    public boolean I(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L14
            r2 = 2
            if (r4 == r2) goto L14
            r2 = 4
            if (r4 == r2) goto L13
            r2 = 8
            if (r4 == r2) goto L14
            r2 = 128(0x80, float:1.8E-43)
            if (r4 == r2) goto L14
            return r1
        L13:
            return r0
        L14:
            e83 r3 = r3.F(r4, r0)
            e83 r4 = defpackage.e83.e
            boolean r3 = r3.equals(r4)
            r3 = r3 ^ r1
            return r3
    }

    public void K(defpackage.e83 r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // defpackage.ru7
    public void d(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            r1.j = r0
            int r0 = r2.getHeight()
            r1.i = r0
            e83 r2 = r1.H(r2)
            if (r2 != 0) goto L14
            e83 r2 = defpackage.e83.e
        L14:
            r1.K(r2)
            return
    }

    @Override // defpackage.ru7
    public java.util.List<android.graphics.Rect> e(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.k
            java.util.List r0 = C(r0, r1)
            return r0
    }

    @Override // defpackage.ru7
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = super.equals(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            ju7 r4 = (defpackage.ju7) r4
            e83 r0 = r3.g
            e83 r2 = r4.g
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L20
            int r3 = r3.h
            int r4 = r4.h
            boolean r3 = L(r3, r4)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            return r1
    }

    @Override // defpackage.ru7
    public java.util.List<android.graphics.Rect> f(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.l
            java.util.List r0 = C(r0, r1)
            return r0
    }

    @Override // defpackage.ru7
    public defpackage.e83 h(int r2) {
            r1 = this;
            r0 = 0
            e83 r1 = r1.E(r2, r0)
            return r1
    }

    @Override // defpackage.ru7
    public defpackage.e83 i(int r2) {
            r1 = this;
            r0 = 1
            e83 r1 = r1.E(r2, r0)
            return r1
    }

    @Override // defpackage.ru7
    public final defpackage.e83 m() {
            r4 = this;
            e83 r0 = r4.e
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.c
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            e83 r0 = defpackage.e83.c(r1, r2, r3, r0)
            r4.e = r0
        L1c:
            e83 r4 = r4.e
            return r4
    }

    @Override // defpackage.ru7
    public void o(android.view.View r1) {
            r0 = this;
            r0.B(r1)
            return
    }

    @Override // defpackage.ru7
    public void p() {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            int r1 = defpackage.su7.a(r0)
            android.graphics.Rect[][] r2 = r4.k
            e83 r3 = r4.h(r0)
            android.graphics.Rect[] r3 = r4.D(r3)
            r2[r1] = r3
            r2 = 8
            if (r0 == r2) goto L25
            android.graphics.Rect[][] r2 = r4.l
            e83 r3 = r4.i(r0)
            android.graphics.Rect[] r3 = r4.D(r3)
            r2[r1] = r3
        L25:
            int r0 = r0 << 1
            goto L1
        L28:
            return
    }

    @Override // defpackage.ru7
    public defpackage.vu7 q(int r4, int r5, int r6, int r7) {
            r3 = this;
            android.view.WindowInsets r0 = r3.c
            r1 = 0
            vu7 r0 = defpackage.vu7.g(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 36
            if (r1 < r2) goto L13
            hu7 r1 = new hu7
            r1.<init>(r0)
            goto L4a
        L13:
            r2 = 35
            if (r1 < r2) goto L1d
            gu7 r1 = new gu7
            r1.<init>(r0)
            goto L4a
        L1d:
            r2 = 34
            if (r1 < r2) goto L27
            fu7 r1 = new fu7
            r1.<init>(r0)
            goto L4a
        L27:
            r2 = 31
            if (r1 < r2) goto L31
            eu7 r1 = new eu7
            r1.<init>(r0)
            goto L4a
        L31:
            r2 = 30
            if (r1 < r2) goto L3b
            du7 r1 = new du7
            r1.<init>(r0)
            goto L4a
        L3b:
            r2 = 29
            if (r1 < r2) goto L45
            cu7 r1 = new cu7
            r1.<init>(r0)
            goto L4a
        L45:
            bu7 r1 = new bu7
            r1.<init>(r0)
        L4a:
            e83 r0 = r3.m()
            e83 r0 = defpackage.vu7.e(r0, r4, r5, r6, r7)
            r1.h(r0)
            e83 r3 = r3.k()
            e83 r3 = defpackage.vu7.e(r3, r4, r5, r6, r7)
            r1.f(r3)
            vu7 r3 = r1.b()
            return r3
    }

    @Override // defpackage.ru7
    public boolean s() {
            r0 = this;
            android.view.WindowInsets r0 = r0.c
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // defpackage.ru7
    public boolean t(int r4) {
            r3 = this;
            r0 = 1
            r1 = r0
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L16
            r2 = r4 & r1
            if (r2 != 0) goto Lb
            goto L13
        Lb:
            boolean r2 = r3.I(r1)
            if (r2 != 0) goto L13
            r3 = 0
            return r3
        L13:
            int r1 = r1 << 1
            goto L2
        L16:
            return r0
    }

    @Override // defpackage.ru7
    public void u(defpackage.cl1 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ru7
    public void v(defpackage.e83[] r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // defpackage.ru7
    public void w(defpackage.vu7 r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // defpackage.ru7
    public void y(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    @Override // defpackage.ru7
    public void z(android.graphics.Rect[][] r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.k = r1
            return
    }
}
