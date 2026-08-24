package androidx.recyclerview.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup {
    public static final int[] A1 = null;
    public static final float B1 = 0.0f;
    public static final boolean C1 = false;
    public static final boolean D1 = false;
    public static final java.lang.Class[] E1 = null;
    public static final defpackage.tf5 F1 = null;
    public static final defpackage.tg5 G1 = null;
    public static boolean y1 = false;
    public static boolean z1 = false;
    public final float A;
    public final android.view.accessibility.AccessibilityManager A0;
    public final defpackage.og5 B;
    public java.util.ArrayList B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public defpackage.bg5 G0;
    public android.widget.EdgeEffect H0;
    public android.widget.EdgeEffect I0;
    public android.widget.EdgeEffect J0;
    public android.widget.EdgeEffect K0;
    public final defpackage.mg5 L;
    public defpackage.cg5 L0;
    public int M0;
    public int N0;
    public android.view.VelocityTracker O0;
    public int P0;
    public int Q0;
    public defpackage.pg5 R;
    public int R0;
    public int S0;
    public int T0;
    public defpackage.ig5 U0;
    public final int V0;
    public final int W0;
    public final float X0;
    public final float Y0;
    public boolean Z0;
    public final defpackage.vg5 a1;
    public defpackage.dr2 b1;
    public final defpackage.ls0 c1;
    public final defpackage.z9 d0;
    public final defpackage.sg5 d1;
    public final defpackage.dk0 e0;
    public defpackage.jg5 e1;
    public final defpackage.rr6 f0;
    public java.util.ArrayList f1;
    public boolean g0;
    public boolean g1;
    public final defpackage.sf5 h0;
    public boolean h1;
    public final android.graphics.Rect i0;
    public final defpackage.uf5 i1;
    public final android.graphics.Rect j0;
    public boolean j1;
    public final android.graphics.RectF k0;
    public defpackage.yg5 k1;
    public defpackage.wf5 l0;
    public final int[] l1;
    public defpackage.gg5 m0;
    public defpackage.je4 m1;
    public final java.util.ArrayList n0;
    public final int[] n1;
    public final java.util.ArrayList o0;
    public final int[] o1;
    public final java.util.ArrayList p0;
    public final int[] p1;
    public defpackage.u92 q0;
    public final java.util.ArrayList q1;
    public boolean r0;
    public final defpackage.sf5 r1;
    public boolean s0;
    public boolean s1;
    public boolean t0;
    public int t1;
    public int u0;
    public int u1;
    public boolean v0;
    public final boolean v1;
    public boolean w0;
    public final defpackage.uf5 w1;
    public boolean x0;
    public final defpackage.nj1 x1;
    public int y0;
    public boolean z0;

    static {
            r0 = 16843830(0x1010436, float:2.369658E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.RecyclerView.A1 = r0
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.recyclerview.widget.RecyclerView.B1 = r0
            r0 = 1
            androidx.recyclerview.widget.RecyclerView.C1 = r0
            androidx.recyclerview.widget.RecyclerView.D1 = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1, r1}
            androidx.recyclerview.widget.RecyclerView.E1 = r0
            tf5 r0 = new tf5
            r1 = 0
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView.F1 = r0
            tg5 r0 = new tg5
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.G1 = r0
            return
    }

    public RecyclerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969689(0x7f040459, float:1.7548067E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
            r20 = this;
            r1 = r20
            r2 = r21
            r4 = r22
            r6 = r23
            r20.<init>(r21, r22, r23)
            og5 r0 = new og5
            r0.<init>(r1)
            r1.B = r0
            mg5 r0 = new mg5
            r0.<init>(r1)
            r1.L = r0
            rr6 r0 = new rr6
            r3 = 11
            r0.<init>(r3)
            r1.f0 = r0
            sf5 r0 = new sf5
            r9 = 0
            r0.<init>(r1, r9)
            r1.h0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.j0 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.k0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.o0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p0 = r0
            r1.u0 = r9
            r1.C0 = r9
            r1.D0 = r9
            r1.E0 = r9
            r1.F0 = r9
            tg5 r0 = androidx.recyclerview.widget.RecyclerView.G1
            r1.G0 = r0
            ke1 r0 = new ke1
            r0.<init>()
            r10 = 0
            r0.a = r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            r7 = 120(0x78, double:5.93E-322)
            r0.c = r7
            r0.d = r7
            r7 = 250(0xfa, double:1.235E-321)
            r0.e = r7
            r0.f = r7
            r11 = 1
            r0.g = r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.n = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.o = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.p = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.q = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.r = r3
            r1.L0 = r0
            r1.M0 = r9
            r0 = -1
            r1.N0 = r0
            r3 = 1
            r1.X0 = r3
            r1.Y0 = r3
            r1.Z0 = r11
            vg5 r3 = new vg5
            r3.<init>(r1)
            r1.a1 = r3
            boolean r3 = androidx.recyclerview.widget.RecyclerView.D1
            r12 = 2
            if (r3 == 0) goto Led
            ls0 r3 = new ls0
            r3.<init>(r12)
            goto Lee
        Led:
            r3 = r10
        Lee:
            r1.c1 = r3
            sg5 r3 = new sg5
            r3.<init>()
            r3.a = r0
            r3.b = r9
            r3.c = r9
            r3.d = r11
            r3.e = r9
            r3.f = r9
            r3.g = r9
            r3.h = r9
            r3.i = r9
            r3.j = r9
            r3.k = r9
            r1.d1 = r3
            r1.g1 = r9
            r1.h1 = r9
            uf5 r3 = new uf5
            r3.<init>(r1)
            r1.i1 = r3
            r1.j1 = r9
            int[] r5 = new int[r12]
            r1.l1 = r5
            int[] r5 = new int[r12]
            r1.n1 = r5
            int[] r5 = new int[r12]
            r1.o1 = r5
            int[] r5 = new int[r12]
            r1.p1 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.q1 = r5
            sf5 r5 = new sf5
            r5.<init>(r1, r11)
            r1.r1 = r5
            r1.t1 = r9
            r1.u1 = r9
            uf5 r5 = new uf5
            r5.<init>(r1)
            r1.w1 = r5
            uf5 r5 = new uf5
            r5.<init>(r1)
            nj1 r7 = new nj1
            android.content.Context r8 = r1.getContext()
            r7.<init>(r8, r5)
            r1.x1 = r7
            r1.setScrollContainer(r11)
            r1.setFocusableInTouchMode(r11)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r2)
            int r7 = r5.getScaledTouchSlop()
            r1.T0 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L170
            java.lang.reflect.Method r13 = defpackage.go7.a
            float r13 = defpackage.pt0.j(r5)
            goto L174
        L170:
            float r13 = defpackage.go7.a(r5, r2)
        L174:
            r1.X0 = r13
            if (r7 < r8) goto L17d
            float r13 = defpackage.pt0.k(r5)
            goto L181
        L17d:
            float r13 = defpackage.go7.a(r5, r2)
        L181:
            r1.Y0 = r13
            int r13 = r5.getScaledMinimumFlingVelocity()
            r1.V0 = r13
            int r5 = r5.getScaledMaximumFlingVelocity()
            r1.W0 = r5
            android.content.res.Resources r5 = r2.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r13 = 1126170624(0x43200000, float:160.0)
            float r5 = r5 * r13
            r13 = 1136724797(0x43c10b3d, float:386.0878)
            float r5 = r5 * r13
            r13 = 1062668861(0x3f570a3d, float:0.84)
            float r5 = r5 * r13
            r1.A = r5
            int r5 = r1.getOverScrollMode()
            if (r5 != r12) goto L1ae
            r5 = r11
            goto L1af
        L1ae:
            r5 = r9
        L1af:
            r1.setWillNotDraw(r5)
            cg5 r5 = r1.L0
            r5.a = r3
            z9 r3 = new z9
            uf5 r5 = new uf5
            r5.<init>(r1)
            r3.<init>()
            tz4 r13 = new tz4
            r14 = 30
            r13.<init>(r14)
            r3.b = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r3.c = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r3.d = r13
            r3.a = r9
            r3.e = r5
            s63 r5 = new s63
            r13 = 23
            r5.<init>(r3, r13)
            r3.f = r5
            r1.d0 = r3
            dk0 r3 = new dk0
            uf5 r5 = new uf5
            r5.<init>(r1)
            r3.<init>(r5)
            r1.e0 = r3
            java.util.WeakHashMap r3 = defpackage.ao7.a
            if (r7 < r8) goto L1fb
            int r3 = defpackage.un7.a(r1)
            goto L1fc
        L1fb:
            r3 = r9
        L1fc:
            r13 = 8
            if (r3 != 0) goto L205
            if (r7 < r8) goto L205
            defpackage.un7.b(r1, r13)
        L205:
            int r3 = r1.getImportantForAccessibility()
            if (r3 != 0) goto L20e
            r1.setImportantForAccessibility(r11)
        L20e:
            android.content.Context r3 = r1.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.A0 = r3
            yg5 r3 = new yg5
            r3.<init>(r1)
            r1.setAccessibilityDelegateCompat(r3)
            int[] r3 = defpackage.j75.a
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r4, r3, r6, r9)
            defpackage.ao7.m(r1, r2, r3, r4, r5, r6)
            r14 = r2
            r15 = r4
            r2 = r5
            java.lang.String r13 = r2.getString(r13)
            int r3 = r2.getInt(r12, r0)
            if (r3 != r0) goto L23f
            r0 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r0)
        L23f:
            boolean r0 = r2.getBoolean(r11, r11)
            r1.g0 = r0
            r0 = 3
            boolean r3 = r2.getBoolean(r0, r9)
            r4 = 4
            if (r3 == 0) goto L2b5
            r3 = 6
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r5 = 7
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r4)
            android.graphics.drawable.StateListDrawable r6 = (android.graphics.drawable.StateListDrawable) r6
            r7 = 5
            android.graphics.drawable.Drawable r7 = r2.getDrawable(r7)
            if (r3 == 0) goto L2a5
            if (r5 == 0) goto L2a5
            if (r6 == 0) goto L2a5
            if (r7 == 0) goto L2a5
            android.content.Context r8 = r1.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r16 = r0
            u92 r0 = new u92
            r4 = 2131165331(0x7f070093, float:1.7944876E38)
            int r4 = r8.getDimensionPixelSize(r4)
            r18 = r12
            r12 = 2131165333(0x7f070095, float:1.794488E38)
            int r12 = r8.getDimensionPixelSize(r12)
            r19 = r11
            r11 = 2131165332(0x7f070094, float:1.7944878E38)
            int r8 = r8.getDimensionPixelOffset(r11)
            r11 = r12
            r12 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = r11
            r11 = r6
            r6 = r4
            r4 = r11
            r11 = r23
            r17 = r16
            r16 = r10
            r10 = 4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2c1
        L2a5:
            r16 = r10
            java.lang.String r0 = r1.C()
            java.lang.String r1 = "Trying to set fast scroller without both required drawables."
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.h(r0)
            throw r16
        L2b5:
            r17 = r0
            r16 = r10
            r19 = r11
            r18 = r12
            r11 = r23
            r12 = r2
            r10 = r4
        L2c1:
            r12.recycle()
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            java.lang.String r2 = "android.hardware.rotaryencoder.lowres"
            boolean r0 = r0.hasSystemFeature(r2)
            r1.v1 = r0
            java.lang.String r2 = ": Could not instantiate the LayoutManager: "
            if (r13 == 0) goto L3e1
            java.lang.String r0 = r13.trim()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3e1
            char r3 = r0.charAt(r9)
            r4 = 46
            if (r3 != r4) goto L2fb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r14.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L2f9:
            r3 = r0
            goto L321
        L2fb:
            java.lang.String r3 = "."
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L304
            goto L2f9
        L304:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L2f9
        L321:
            boolean r0 = r1.isInEditMode()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c
            if (r0 == 0) goto L33f
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c
            goto L343
        L330:
            r0 = move-exception
            goto L3b1
        L333:
            r0 = move-exception
            goto L3bd
        L336:
            r0 = move-exception
            goto L3c7
        L339:
            r0 = move-exception
            goto L3cf
        L33c:
            r0 = move-exception
            goto L3d7
        L33f:
            java.lang.ClassLoader r0 = r14.getClassLoader()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
        L343:
            java.lang.Class r0 = java.lang.Class.forName(r3, r9, r0)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.Class<gg5> r4 = defpackage.gg5.class
            java.lang.Class r4 = r0.asSubclass(r4)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.Class[] r0 = androidx.recyclerview.widget.RecyclerView.E1     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            java.lang.reflect.Constructor r0 = r4.getConstructor(r0)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            r5[r9] = r14     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            r5[r19] = r15     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            r5[r18] = r6     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
            r5[r17] = r6     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L333 java.lang.InstantiationException -> L336 java.lang.reflect.InvocationTargetException -> L339 java.lang.ClassNotFoundException -> L33c java.lang.NoSuchMethodException -> L368
        L365:
            r4 = r19
            goto L372
        L368:
            r0 = move-exception
            r5 = r0
            r6 = r16
            java.lang.reflect.Constructor r0 = r4.getConstructor(r6)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b java.lang.NoSuchMethodException -> L38f
            r5 = 0
            goto L365
        L372:
            r0.setAccessible(r4)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            gg5 r0 = (defpackage.gg5) r0     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            r1.setLayoutManager(r0)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            goto L3e1
        L37f:
            r0 = move-exception
            r16 = 0
            goto L3bd
        L383:
            r0 = move-exception
            r16 = 0
            goto L3c7
        L387:
            r0 = move-exception
            r16 = 0
            goto L3cf
        L38b:
            r0 = move-exception
            r16 = 0
            goto L3d7
        L38f:
            r0 = move-exception
            r0.initCause(r5)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            r4.<init>()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.String r5 = r15.getPositionDescription()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            r4.append(r5)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            r4.append(r3)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            r1.<init>(r4, r0)     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
            throw r1     // Catch: java.lang.ClassCastException -> L330 java.lang.IllegalAccessException -> L37f java.lang.InstantiationException -> L383 java.lang.reflect.InvocationTargetException -> L387 java.lang.ClassNotFoundException -> L38b
        L3b1:
            java.lang.String r1 = r15.getPositionDescription()
            java.lang.String r2 = ": Class is not a LayoutManager "
            defpackage.u34.g(r1, r2, r3, r0)
            r16 = 0
            throw r16
        L3bd:
            java.lang.String r1 = r15.getPositionDescription()
            java.lang.String r2 = ": Cannot access non-public constructor "
            defpackage.u34.g(r1, r2, r3, r0)
            throw r16
        L3c7:
            java.lang.String r1 = r15.getPositionDescription()
            defpackage.u34.g(r1, r2, r3, r0)
            throw r16
        L3cf:
            java.lang.String r1 = r15.getPositionDescription()
            defpackage.u34.g(r1, r2, r3, r0)
            throw r16
        L3d7:
            java.lang.String r1 = r15.getPositionDescription()
            java.lang.String r2 = ": Unable to find LayoutManager "
            defpackage.u34.g(r1, r2, r3, r0)
            throw r16
        L3e1:
            int[] r3 = androidx.recyclerview.widget.RecyclerView.A1
            android.content.res.TypedArray r5 = r14.obtainStyledAttributes(r15, r3, r11, r9)
            r6 = r11
            r2 = r14
            r4 = r15
            defpackage.ao7.m(r1, r2, r3, r4, r5, r6)
            r4 = 1
            boolean r0 = r5.getBoolean(r9, r4)
            r5.recycle()
            r1.setNestedScrollingEnabled(r0)
            r0 = 2131427639(0x7f0b0137, float:1.84769E38)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setTag(r0, r2)
            return
    }

    public static androidx.recyclerview.widget.RecyclerView H(android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            return r4
        Ld:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L14:
            if (r2 >= r0) goto L24
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView r3 = H(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    public static defpackage.wg5 N(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            wg5 r0 = r0.a
            return r0
    }

    public static /* synthetic */ void a(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void c(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ boolean d(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    public static /* synthetic */ void e(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void f(android.view.View r0, androidx.recyclerview.widget.RecyclerView r1) {
            r1.detachViewFromParent(r0)
            return
    }

    public static /* synthetic */ void g(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    private defpackage.je4 getScrollingChildHelper() {
            r1 = this;
            je4 r0 = r1.m1
            if (r0 != 0) goto Lb
            je4 r0 = new je4
            r0.<init>(r1)
            r1.m1 = r0
        Lb:
            je4 r1 = r1.m1
            return r1
    }

    public static void l(defpackage.wg5 r3) {
            java.lang.ref.WeakReference r0 = r3.b
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.a
            if (r0 != r2) goto L12
            goto L21
        L12:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L1d
            android.view.View r0 = (android.view.View) r0
            goto La
        L1d:
            r0 = r1
            goto La
        L1f:
            r3.b = r1
        L21:
            return
    }

    public static int o(int r4, android.widget.EdgeEffect r5, android.widget.EdgeEffect r6, int r7) {
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1082130432(0x40800000, float:4.0)
            if (r4 <= 0) goto L29
            if (r5 == 0) goto L29
            float r3 = defpackage.nw7.g0(r5)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L29
            int r6 = -r4
            float r6 = (float) r6
            float r6 = r6 * r2
            float r1 = (float) r7
            float r6 = r6 / r1
            int r7 = -r7
            float r7 = (float) r7
            float r7 = r7 / r2
            float r6 = defpackage.nw7.j0(r5, r6, r0)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            if (r6 == r4) goto L27
            r5.finish()
        L27:
            int r4 = r4 - r6
            return r4
        L29:
            if (r4 >= 0) goto L49
            if (r6 == 0) goto L49
            float r5 = defpackage.nw7.g0(r6)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L49
            float r5 = (float) r4
            float r5 = r5 * r2
            float r7 = (float) r7
            float r5 = r5 / r7
            float r7 = r7 / r2
            float r5 = defpackage.nw7.j0(r6, r5, r0)
            float r5 = r5 * r7
            int r5 = java.lang.Math.round(r5)
            if (r5 == r4) goto L48
            r6.finish()
        L48:
            int r4 = r4 - r5
        L49:
            return r4
    }

    public static void setDebugAssertionsEnabled(boolean r0) {
            androidx.recyclerview.widget.RecyclerView.y1 = r0
            return
    }

    public static void setVerboseLoggingEnabled(boolean r0) {
            androidx.recyclerview.widget.RecyclerView.z1 = r0
            return
    }

    public final void A() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.J0
            if (r0 == 0) goto L5
            return
        L5:
            bg5 r0 = r4.G0
            tg5 r0 = (defpackage.tg5) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.J0 = r0
            boolean r1 = r4.g0
            if (r1 == 0) goto L3b
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r4 = r4.getPaddingRight()
            int r2 = r2 - r4
            r0.setSize(r1, r2)
            return
        L3b:
            int r1 = r4.getMeasuredHeight()
            int r4 = r4.getMeasuredWidth()
            r0.setSize(r1, r4)
            return
    }

    public final void B() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.I0
            if (r0 == 0) goto L5
            return
        L5:
            bg5 r0 = r4.G0
            tg5 r0 = (defpackage.tg5) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.I0 = r0
            boolean r1 = r4.g0
            if (r1 == 0) goto L3b
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            r0.setSize(r1, r2)
            return
        L3b:
            int r1 = r4.getMeasuredWidth()
            int r4 = r4.getMeasuredHeight()
            r0.setSize(r1, r4)
            return
    }

    public final java.lang.String C() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r0.<init>(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            wf5 r1 = r2.l0
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            gg5 r1 = r2.m0
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r2 = r2.getContext()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final void D(defpackage.sg5 r3) {
            r2 = this;
            int r0 = r2.getScrollState()
            r1 = 2
            if (r0 != r1) goto L1b
            vg5 r2 = r2.a1
            android.widget.OverScroller r2 = r2.L
            r2.getFinalX()
            r2.getCurrX()
            r3.getClass()
            r2.getFinalY()
            r2.getCurrY()
            return
        L1b:
            r3.getClass()
            return
    }

    public final android.view.View E(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
    }

    public final boolean F(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.p0
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            u92 r5 = (defpackage.u92) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.q0 = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
    }

    public final void G(int[] r9) {
            r8 = this;
            dk0 r8 = r8.e0
            int r0 = r8.q()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r8 = -1
            r9[r2] = r8
            r9[r1] = r8
            return
        L10:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2
        L16:
            if (r5 >= r0) goto L34
            android.view.View r6 = r8.p(r5)
            wg5 r6 = N(r6)
            boolean r7 = r6.o()
            if (r7 == 0) goto L27
            goto L31
        L27:
            int r6 = r6.b()
            if (r6 >= r3) goto L2e
            r3 = r6
        L2e:
            if (r6 <= r4) goto L31
            r4 = r6
        L31:
            int r5 = r5 + 1
            goto L16
        L34:
            r9[r2] = r3
            r9[r1] = r4
            return
    }

    public final defpackage.wg5 I(int r7) {
            r6 = this;
            boolean r0 = r6.C0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            dk0 r0 = r6.e0
            int r2 = r0.t()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L37
            android.view.View r4 = r0.s(r3)
            wg5 r4 = N(r4)
            if (r4 == 0) goto L34
            boolean r5 = r4.h()
            if (r5 != 0) goto L34
            int r5 = r6.K(r4)
            if (r5 != r7) goto L34
            android.view.View r1 = r4.a
            java.lang.Object r5 = r0.B
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L33
            r1 = r4
            goto L34
        L33:
            return r4
        L34:
            int r3 = r3 + 1
            goto Ld
        L37:
            return r1
    }

    public final boolean J(int r21, int r22, int r23, int r24) {
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r24
            gg5 r3 = r0.m0
            r4 = 0
            if (r3 != 0) goto L13
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            return r4
        L13:
            boolean r5 = r0.w0
            if (r5 == 0) goto L1b
        L17:
            r16 = r4
            goto L23f
        L1b:
            boolean r3 = r3.d()
            gg5 r5 = r0.m0
            boolean r5 = r5.e()
            if (r3 == 0) goto L31
            int r6 = java.lang.Math.abs(r21)
            if (r6 >= r1) goto L2e
            goto L31
        L2e:
            r6 = r21
            goto L32
        L31:
            r6 = r4
        L32:
            if (r5 == 0) goto L3e
            int r7 = java.lang.Math.abs(r22)
            if (r7 >= r1) goto L3b
            goto L3e
        L3b:
            r1 = r22
            goto L3f
        L3e:
            r1 = r4
        L3f:
            if (r6 != 0) goto L44
            if (r1 != 0) goto L44
            goto L17
        L44:
            r7 = 0
            if (r6 == 0) goto L87
            android.widget.EdgeEffect r8 = r0.H0
            if (r8 == 0) goto L69
            float r8 = defpackage.nw7.g0(r8)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L69
            android.widget.EdgeEffect r8 = r0.H0
            int r9 = -r6
            int r10 = r0.getWidth()
            boolean r8 = r0.i0(r8, r9, r10)
            if (r8 == 0) goto L66
            android.widget.EdgeEffect r6 = r0.H0
            r6.onAbsorb(r9)
        L65:
            r6 = r4
        L66:
            r8 = r6
            r6 = r4
            goto L88
        L69:
            android.widget.EdgeEffect r8 = r0.J0
            if (r8 == 0) goto L87
            float r8 = defpackage.nw7.g0(r8)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L87
            android.widget.EdgeEffect r8 = r0.J0
            int r9 = r0.getWidth()
            boolean r8 = r0.i0(r8, r6, r9)
            if (r8 == 0) goto L66
            android.widget.EdgeEffect r8 = r0.J0
            r8.onAbsorb(r6)
            goto L65
        L87:
            r8 = r4
        L88:
            if (r1 == 0) goto Lc9
            android.widget.EdgeEffect r9 = r0.I0
            if (r9 == 0) goto Lab
            float r9 = defpackage.nw7.g0(r9)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto Lab
            android.widget.EdgeEffect r9 = r0.I0
            int r10 = -r1
            int r11 = r0.getHeight()
            boolean r9 = r0.i0(r9, r10, r11)
            if (r9 == 0) goto La9
            android.widget.EdgeEffect r1 = r0.I0
            r1.onAbsorb(r10)
        La8:
            r1 = r4
        La9:
            r9 = r4
            goto Lcb
        Lab:
            android.widget.EdgeEffect r9 = r0.K0
            if (r9 == 0) goto Lc9
            float r9 = defpackage.nw7.g0(r9)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto Lc9
            android.widget.EdgeEffect r9 = r0.K0
            int r10 = r0.getHeight()
            boolean r9 = r0.i0(r9, r1, r10)
            if (r9 == 0) goto La9
            android.widget.EdgeEffect r9 = r0.K0
            r9.onAbsorb(r1)
            goto La8
        Lc9:
            r9 = r1
            r1 = r4
        Lcb:
            vg5 r10 = r0.a1
            r11 = 1
            if (r8 != 0) goto Ld2
            if (r1 == 0) goto Le9
        Ld2:
            int r12 = -r2
            int r8 = java.lang.Math.min(r8, r2)
            int r8 = java.lang.Math.max(r12, r8)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r12, r1)
            r0.m0(r11)
            r10.a(r8, r1)
        Le9:
            if (r6 != 0) goto Lf2
            if (r9 != 0) goto Lf2
            if (r8 != 0) goto Lf1
            if (r1 == 0) goto L17
        Lf1:
            return r11
        Lf2:
            float r1 = (float) r6
            float r8 = (float) r9
            boolean r12 = r0.dispatchNestedPreFling(r1, r8)
            if (r12 != 0) goto L17
            if (r3 != 0) goto L101
            if (r5 == 0) goto Lff
            goto L101
        Lff:
            r3 = r4
            goto L102
        L101:
            r3 = r11
        L102:
            r0.dispatchNestedFling(r1, r8, r3)
            ig5 r1 = r0.U0
            if (r1 == 0) goto L21d
            hr4 r1 = (defpackage.hr4) r1
            androidx.recyclerview.widget.RecyclerView r5 = r1.a
            gg5 r5 = r5.getLayoutManager()
            if (r5 != 0) goto L115
            goto L21d
        L115:
            androidx.recyclerview.widget.RecyclerView r8 = r1.a
            wf5 r8 = r8.getAdapter()
            if (r8 != 0) goto L11f
            goto L21d
        L11f:
            androidx.recyclerview.widget.RecyclerView r8 = r1.a
            int r8 = r8.getMinFlingVelocity()
            int r12 = java.lang.Math.abs(r9)
            if (r12 > r8) goto L131
            int r12 = java.lang.Math.abs(r6)
            if (r12 <= r8) goto L21d
        L131:
            boolean r8 = r5 instanceof defpackage.rg5
            if (r8 != 0) goto L137
            goto L21d
        L137:
            r12 = 0
            if (r8 != 0) goto L13c
            r13 = r12
            goto L147
        L13c:
            gr4 r13 = new gr4
            androidx.recyclerview.widget.RecyclerView r14 = r1.a
            android.content.Context r14 = r14.getContext()
            r13.<init>(r1, r14)
        L147:
            if (r13 != 0) goto L14b
            goto L21d
        L14b:
            int r14 = r5.B()
            if (r14 != 0) goto L15b
        L151:
            r18 = r3
            r16 = r4
            r22 = r11
        L157:
            r1 = -1
        L158:
            r3 = -1
            goto L214
        L15b:
            boolean r16 = r5.e()
            if (r16 == 0) goto L166
            ts1 r1 = r1.e(r5)
            goto L172
        L166:
            boolean r16 = r5.d()
            if (r16 == 0) goto L171
            ts1 r1 = r1.d(r5)
            goto L172
        L171:
            r1 = r12
        L172:
            if (r1 != 0) goto L175
            goto L151
        L175:
            r16 = r4
            int r4 = r5.v()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = 2147483647(0x7fffffff, float:NaN)
            r21 = r7
            r22 = r11
            r15 = r16
            r7 = r17
            r11 = r18
            r17 = r12
        L18c:
            if (r15 >= r4) goto L1b3
            r18 = r3
            android.view.View r3 = r5.u(r15)
            if (r3 != 0) goto L199
            r19 = r4
            goto L1ac
        L199:
            r19 = r4
            int r4 = defpackage.hr4.b(r3, r1)
            if (r4 > 0) goto L1a6
            if (r4 <= r7) goto L1a6
            r17 = r3
            r7 = r4
        L1a6:
            if (r4 < 0) goto L1ac
            if (r4 >= r11) goto L1ac
            r12 = r3
            r11 = r4
        L1ac:
            int r15 = r15 + 1
            r3 = r18
            r4 = r19
            goto L18c
        L1b3:
            r18 = r3
            boolean r1 = r5.d()
            if (r1 == 0) goto L1c3
            if (r6 <= 0) goto L1c0
        L1bd:
            r1 = r22
            goto L1c6
        L1c0:
            r1 = r16
            goto L1c6
        L1c3:
            if (r9 <= 0) goto L1c0
            goto L1bd
        L1c6:
            if (r1 == 0) goto L1cf
            if (r12 == 0) goto L1cf
            int r1 = defpackage.gg5.G(r12)
            goto L158
        L1cf:
            if (r1 != 0) goto L1d8
            if (r17 == 0) goto L1d8
            int r1 = defpackage.gg5.G(r17)
            goto L158
        L1d8:
            if (r1 == 0) goto L1dc
            r12 = r17
        L1dc:
            if (r12 != 0) goto L1e0
            goto L157
        L1e0:
            int r3 = defpackage.gg5.G(r12)
            int r4 = r5.B()
            if (r8 == 0) goto L202
            r7 = r5
            rg5 r7 = (defpackage.rg5) r7
            int r4 = r4 + (-1)
            android.graphics.PointF r4 = r7.a(r4)
            if (r4 == 0) goto L202
            float r7 = r4.x
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 < 0) goto L205
            float r4 = r4.y
            int r4 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r4 >= 0) goto L202
            goto L205
        L202:
            r4 = r16
            goto L207
        L205:
            r4 = r22
        L207:
            if (r4 != r1) goto L20b
            r1 = -1
            goto L20d
        L20b:
            r1 = r22
        L20d:
            int r1 = r1 + r3
            if (r1 < 0) goto L157
            if (r1 < r14) goto L158
            goto L157
        L214:
            if (r1 != r3) goto L217
            goto L223
        L217:
            r13.a = r1
            r5.B0(r13)
            return r22
        L21d:
            r18 = r3
            r16 = r4
            r22 = r11
        L223:
            if (r18 == 0) goto L23f
            r1 = r22
            r0.m0(r1)
            int r0 = -r2
            int r3 = java.lang.Math.min(r6, r2)
            int r3 = java.lang.Math.max(r0, r3)
            int r2 = java.lang.Math.min(r9, r2)
            int r0 = java.lang.Math.max(r0, r2)
            r10.a(r3, r0)
            return r1
        L23f:
            return r16
    }

    public final int K(defpackage.wg5 r7) {
            r6 = this;
            int r0 = r7.j
            r0 = r0 & 524(0x20c, float:7.34E-43)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.e()
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            int r7 = r7.c
            z9 r6 = r6.d0
            java.lang.Object r6 = r6.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r2 = 0
        L1c:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r6.get(r2)
            y9 r3 = (defpackage.y9) r3
            int r4 = r3.a
            r5 = 1
            if (r4 == r5) goto L4f
            r5 = 2
            if (r4 == r5) goto L43
            r5 = 8
            if (r4 == r5) goto L31
            goto L56
        L31:
            int r4 = r3.b
            if (r4 != r7) goto L38
            int r7 = r3.d
            goto L56
        L38:
            if (r4 >= r7) goto L3c
            int r7 = r7 + (-1)
        L3c:
            int r3 = r3.d
            if (r3 > r7) goto L56
            int r7 = r7 + 1
            goto L56
        L43:
            int r4 = r3.b
            if (r4 > r7) goto L56
            int r3 = r3.d
            int r4 = r4 + r3
            if (r4 <= r7) goto L4d
        L4c:
            return r1
        L4d:
            int r7 = r7 - r3
            goto L56
        L4f:
            int r4 = r3.b
            if (r4 > r7) goto L56
            int r3 = r3.d
            int r7 = r7 + r3
        L56:
            int r2 = r2 + 1
            goto L1c
        L59:
            return r7
    }

    public final long L(defpackage.wg5 r1) {
            r0 = this;
            wf5 r0 = r0.l0
            boolean r0 = r0.b
            if (r0 == 0) goto L9
            long r0 = r1.e
            return r0
        L9:
            int r0 = r1.c
            long r0 = (long) r0
            return r0
    }

    public final defpackage.wg5 M(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L12
            if (r0 != r2) goto L9
            goto L12
        L9:
            java.lang.String r0 = "View "
            java.lang.String r1 = " is not a direct child of "
            defpackage.fa6.f(r0, r3, r1, r2)
            r2 = 0
            return r2
        L12:
            wg5 r2 = N(r3)
            return r2
    }

    public final android.graphics.Rect O(android.view.View r11) {
            r10 = this;
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            boolean r1 = r0.c
            android.graphics.Rect r2 = r0.b
            if (r1 != 0) goto Ld
            goto L23
        Ld:
            sg5 r1 = r10.d1
            boolean r3 = r1.g
            if (r3 == 0) goto L24
            wg5 r3 = r0.a
            boolean r3 = r3.k()
            if (r3 != 0) goto L23
            wg5 r3 = r0.a
            boolean r3 = r3.f()
            if (r3 == 0) goto L24
        L23:
            return r2
        L24:
            r3 = 0
            r2.set(r3, r3, r3, r3)
            java.util.ArrayList r4 = r10.o0
            int r5 = r4.size()
            r6 = r3
        L2f:
            if (r6 >= r5) goto L5e
            android.graphics.Rect r7 = r10.i0
            r7.set(r3, r3, r3, r3)
            java.lang.Object r8 = r4.get(r6)
            dg5 r8 = (defpackage.dg5) r8
            r8.a(r7, r11, r10, r1)
            int r8 = r2.left
            int r9 = r7.left
            int r8 = r8 + r9
            r2.left = r8
            int r8 = r2.top
            int r9 = r7.top
            int r8 = r8 + r9
            r2.top = r8
            int r8 = r2.right
            int r9 = r7.right
            int r8 = r8 + r9
            r2.right = r8
            int r8 = r2.bottom
            int r7 = r7.bottom
            int r8 = r8 + r7
            r2.bottom = r8
            int r6 = r6 + 1
            goto L2f
        L5e:
            r0.c = r3
            return r2
    }

    public final boolean P() {
            r1 = this;
            boolean r0 = r1.t0
            if (r0 == 0) goto L13
            boolean r0 = r1.C0
            if (r0 != 0) goto L13
            z9 r1 = r1.d0
            boolean r1 = r1.j()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final boolean Q() {
            r0 = this;
            int r0 = r0.E0
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void R(int r2) {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            gg5 r0 = r1.m0
            r0.q0(r2)
            r1.awakenScrollBars()
            return
    }

    public final void S() {
            r6 = this;
            dk0 r0 = r6.e0
            int r1 = r0.t()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L1a
            android.view.View r5 = r0.s(r3)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            hg5 r5 = (defpackage.hg5) r5
            r5.c = r4
            int r3 = r3 + 1
            goto L8
        L1a:
            mg5 r6 = r6.L
            java.lang.Object r6 = r6.e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
        L24:
            if (r2 >= r0) goto L3b
            java.lang.Object r1 = r6.get(r2)
            wg5 r1 = (defpackage.wg5) r1
            android.view.View r1 = r1.a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            if (r1 == 0) goto L38
            r1.c = r4
        L38:
            int r2 = r2 + 1
            goto L24
        L3b:
            return
    }

    public final void T(int r17, boolean r18, int r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r1 + r3
            dk0 r5 = r0.e0
            int r6 = r5.t()
            r7 = 0
        L11:
            java.lang.String r9 = " now at position "
            java.lang.String r10 = " holder "
            java.lang.String r11 = "RecyclerView"
            r12 = 1
            if (r7 >= r6) goto L8d
            android.view.View r13 = r5.s(r7)
            wg5 r13 = N(r13)
            if (r13 == 0) goto L8a
            boolean r14 = r13.o()
            if (r14 != 0) goto L8a
            int r14 = r13.c
            sg5 r15 = r0.d1
            java.lang.String r8 = "offsetPositionRecordsForRemove attached child "
            if (r14 < r4) goto L5b
            boolean r14 = androidx.recyclerview.widget.RecyclerView.z1
            if (r14 == 0) goto L54
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r8)
            r14.append(r7)
            r14.append(r10)
            r14.append(r13)
            r14.append(r9)
            int r8 = r13.c
            int r8 = r8 - r3
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            android.util.Log.d(r11, r8)
        L54:
            int r8 = -r3
            r13.l(r8, r2)
            r15.f = r12
            goto L8a
        L5b:
            if (r14 < r1) goto L8a
            boolean r9 = androidx.recyclerview.widget.RecyclerView.z1
            if (r9 == 0) goto L7b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r7)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r8 = " now REMOVED"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r11, r8)
        L7b:
            int r8 = r1 + (-1)
            int r9 = -r3
            r10 = 8
            r13.a(r10)
            r13.l(r9, r2)
            r13.c = r8
            r15.f = r12
        L8a:
            int r7 = r7 + 1
            goto L11
        L8d:
            mg5 r5 = r0.L
            java.lang.Object r6 = r5.e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r7 = r6.size()
            int r7 = r7 - r12
        L98:
            if (r7 < 0) goto Lde
            java.lang.Object r8 = r6.get(r7)
            wg5 r8 = (defpackage.wg5) r8
            if (r8 == 0) goto Lce
            int r12 = r8.c
            if (r12 < r4) goto Ld1
            boolean r12 = androidx.recyclerview.widget.RecyclerView.z1
            if (r12 == 0) goto Lca
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "offsetPositionRecordsForRemove cached "
            r12.<init>(r13)
            r12.append(r7)
            r12.append(r10)
            r12.append(r8)
            r12.append(r9)
            int r13 = r8.c
            int r13 = r13 - r3
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r11, r12)
        Lca:
            int r12 = -r3
            r8.l(r12, r2)
        Lce:
            r12 = 8
            goto Ldb
        Ld1:
            if (r12 < r1) goto Lce
            r12 = 8
            r8.a(r12)
            r5.k(r7)
        Ldb:
            int r7 = r7 + (-1)
            goto L98
        Lde:
            r0.requestLayout()
            return
    }

    public final void U() {
            r1 = this;
            int r0 = r1.E0
            int r0 = r0 + 1
            r1.E0 = r0
            return
    }

    public final void V(boolean r6) {
            r5 = this;
            int r0 = r5.E0
            r1 = 1
            int r0 = r0 - r1
            r5.E0 = r0
            if (r0 >= r1) goto L71
            boolean r2 = androidx.recyclerview.widget.RecyclerView.y1
            if (r2 == 0) goto L1d
            if (r0 < 0) goto Lf
            goto L1d
        Lf:
            java.lang.String r5 = r5.C()
            java.lang.String r6 = "layout or scroll counter cannot go below zero.Some calls are not matching"
            java.lang.String r5 = r6.concat(r5)
            defpackage.i.m(r5)
            return
        L1d:
            r0 = 0
            r5.E0 = r0
            if (r6 == 0) goto L71
            int r6 = r5.y0
            r5.y0 = r0
            if (r6 == 0) goto L41
            android.view.accessibility.AccessibilityManager r0 = r5.A0
            if (r0 == 0) goto L41
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L41
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r0.setEventType(r2)
            r0.setContentChangeTypes(r6)
            r5.sendAccessibilityEventUnchecked(r0)
        L41:
            java.util.ArrayList r6 = r5.q1
            int r0 = r6.size()
            int r0 = r0 - r1
        L48:
            if (r0 < 0) goto L6e
            java.lang.Object r1 = r6.get(r0)
            wg5 r1 = (defpackage.wg5) r1
            android.view.View r2 = r1.a
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r5) goto L6b
            boolean r2 = r1.o()
            if (r2 == 0) goto L5f
            goto L6b
        L5f:
            int r2 = r1.q
            r3 = -1
            if (r2 == r3) goto L6b
            android.view.View r4 = r1.a
            r4.setImportantForAccessibility(r2)
            r1.q = r3
        L6b:
            int r0 = r0 + (-1)
            goto L48
        L6e:
            r6.clear()
        L71:
            return
    }

    public final void W(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.N0
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.N0 = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.R0 = r1
            r3.P0 = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.S0 = r4
            r3.Q0 = r4
        L2d:
            return
    }

    public final void X() {
            r1 = this;
            boolean r0 = r1.j1
            if (r0 != 0) goto L12
            boolean r0 = r1.r0
            if (r0 == 0) goto L12
            java.util.WeakHashMap r0 = defpackage.ao7.a
            sf5 r0 = r1.r1
            r1.postOnAnimation(r0)
            r0 = 1
            r1.j1 = r0
        L12:
            return
    }

    public final void Y() {
            r5 = this;
            boolean r0 = r5.C0
            z9 r1 = r5.d0
            r2 = 0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1.r(r0)
            java.lang.Object r0 = r1.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1.r(r0)
            r1.a = r2
            boolean r0 = r5.D0
            if (r0 == 0) goto L20
            gg5 r0 = r5.m0
            r0.Z()
        L20:
            cg5 r0 = r5.L0
            r3 = 1
            if (r0 == 0) goto L2f
            gg5 r0 = r5.m0
            boolean r0 = r0.C0()
            if (r0 == 0) goto L2f
            r0 = r3
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L36
            r1.q()
            goto L39
        L36:
            r1.d()
        L39:
            boolean r0 = r5.g1
            if (r0 != 0) goto L44
            boolean r0 = r5.h1
            if (r0 == 0) goto L42
            goto L44
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            boolean r1 = r5.t0
            if (r1 == 0) goto L63
            cg5 r1 = r5.L0
            if (r1 == 0) goto L63
            boolean r1 = r5.C0
            if (r1 != 0) goto L59
            if (r0 != 0) goto L59
            gg5 r4 = r5.m0
            boolean r4 = r4.f
            if (r4 == 0) goto L63
        L59:
            if (r1 == 0) goto L61
            wf5 r1 = r5.l0
            boolean r1 = r1.b
            if (r1 == 0) goto L63
        L61:
            r1 = r3
            goto L64
        L63:
            r1 = r2
        L64:
            sg5 r4 = r5.d1
            r4.j = r1
            if (r1 == 0) goto L7d
            if (r0 == 0) goto L7d
            boolean r0 = r5.C0
            if (r0 != 0) goto L7d
            cg5 r0 = r5.L0
            if (r0 == 0) goto L7d
            gg5 r5 = r5.m0
            boolean r5 = r5.C0()
            if (r5 == 0) goto L7d
            r2 = r3
        L7d:
            r4.k = r2
            return
    }

    public final void Z(boolean r7) {
            r6 = this;
            boolean r0 = r6.D0
            r7 = r7 | r0
            r6.D0 = r7
            r7 = 1
            r6.C0 = r7
            dk0 r7 = r6.e0
            int r0 = r7.t()
            r1 = 0
            r2 = r1
        L10:
            r3 = 6
            if (r2 >= r0) goto L29
            android.view.View r4 = r7.s(r2)
            wg5 r4 = N(r4)
            if (r4 == 0) goto L26
            boolean r5 = r4.o()
            if (r5 != 0) goto L26
            r4.a(r3)
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            r6.S()
            mg5 r6 = r6.L
            java.lang.Object r7 = r6.e
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r0 = r7.size()
        L36:
            if (r1 >= r0) goto L4b
            java.lang.Object r2 = r7.get(r1)
            wg5 r2 = (defpackage.wg5) r2
            if (r2 == 0) goto L48
            r2.a(r3)
            r4 = 1024(0x400, float:1.435E-42)
            r2.a(r4)
        L48:
            int r1 = r1 + 1
            goto L36
        L4b:
            java.lang.Object r7 = r6.h
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            wf5 r7 = r7.l0
            if (r7 == 0) goto L59
            boolean r7 = r7.b
            if (r7 != 0) goto L58
            goto L59
        L58:
            return
        L59:
            r6.j()
            return
    }

    public final void a0(defpackage.wg5 r5, defpackage.dy7 r6) {
            r4 = this;
            int r0 = r5.j
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r5.j = r0
            sg5 r0 = r4.d1
            boolean r0 = r0.h
            rr6 r1 = r4.f0
            if (r0 == 0) goto L2b
            boolean r0 = r5.k()
            if (r0 == 0) goto L2b
            boolean r0 = r5.h()
            if (r0 != 0) goto L2b
            boolean r0 = r5.o()
            if (r0 != 0) goto L2b
            long r2 = r4.L(r5)
            java.lang.Object r4 = r1.L
            hz3 r4 = (defpackage.hz3) r4
            r4.f(r2, r5)
        L2b:
            java.lang.Object r4 = r1.B
            ci6 r4 = (defpackage.ci6) r4
            java.lang.Object r0 = r4.get(r5)
            lo7 r0 = (defpackage.lo7) r0
            if (r0 != 0) goto L3e
            lo7 r0 = defpackage.lo7.a()
            r4.put(r5, r0)
        L3e:
            r0.b = r6
            int r4 = r0.a
            r4 = r4 | 4
            r0.a = r4
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList r2, int r3, int r4) {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            super.addFocusables(r2, r3, r4)
            return
    }

    public final void b0() {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.H0
            if (r0 == 0) goto Le
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.H0
            boolean r0 = r0.isFinished()
            goto Lf
        Le:
            r0 = 0
        Lf:
            android.widget.EdgeEffect r1 = r2.I0
            if (r1 == 0) goto L1d
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.I0
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L1d:
            android.widget.EdgeEffect r1 = r2.J0
            if (r1 == 0) goto L2b
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.J0
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L2b:
            android.widget.EdgeEffect r1 = r2.K0
            if (r1 == 0) goto L39
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.K0
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L39:
            if (r0 == 0) goto L3e
            r2.postInvalidateOnAnimation()
        L3e:
            return
    }

    public final int c0(int r4, float r5) {
            r3 = this;
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.H0
            r1 = 0
            if (r0 == 0) goto L44
            float r0 = defpackage.nw7.g0(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L44
            r0 = -1
            boolean r0 = r3.canScrollHorizontally(r0)
            android.widget.EdgeEffect r2 = r3.H0
            if (r0 == 0) goto L27
            r2.onRelease()
            goto L40
        L27:
            float r4 = -r4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r5
            float r4 = defpackage.nw7.j0(r2, r4, r0)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.H0
            float r5 = defpackage.nw7.g0(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L3f
            android.widget.EdgeEffect r5 = r3.H0
            r5.onRelease()
        L3f:
            r1 = r4
        L40:
            r3.invalidate()
            goto L74
        L44:
            android.widget.EdgeEffect r0 = r3.J0
            if (r0 == 0) goto L74
            float r0 = defpackage.nw7.g0(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L74
            r0 = 1
            boolean r0 = r3.canScrollHorizontally(r0)
            android.widget.EdgeEffect r2 = r3.J0
            if (r0 == 0) goto L5d
            r2.onRelease()
            goto L71
        L5d:
            float r4 = defpackage.nw7.j0(r2, r4, r5)
            android.widget.EdgeEffect r5 = r3.J0
            float r5 = defpackage.nw7.g0(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L70
            android.widget.EdgeEffect r5 = r3.J0
            r5.onRelease()
        L70:
            r1 = r4
        L71:
            r3.invalidate()
        L74:
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = java.lang.Math.round(r1)
            return r3
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.hg5
            if (r0 == 0) goto L10
            gg5 r1 = r1.m0
            hg5 r2 = (defpackage.hg5) r2
            boolean r1 = r1.f(r2)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.j(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.k(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.d()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.l(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.m(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.n(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 != 0) goto L5
            goto L14
        L5:
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            gg5 r0 = r1.m0
            sg5 r1 = r1.d1
            int r1 = r0.o(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public final int d0(int r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.I0
            r1 = 0
            if (r0 == 0) goto L41
            float r0 = defpackage.nw7.g0(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L41
            r0 = -1
            boolean r0 = r3.canScrollVertically(r0)
            android.widget.EdgeEffect r2 = r3.I0
            if (r0 == 0) goto L27
            r2.onRelease()
            goto L3d
        L27:
            float r4 = -r4
            float r4 = defpackage.nw7.j0(r2, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.I0
            float r5 = defpackage.nw7.g0(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L3c
            android.widget.EdgeEffect r5 = r3.I0
            r5.onRelease()
        L3c:
            r1 = r4
        L3d:
            r3.invalidate()
            goto L74
        L41:
            android.widget.EdgeEffect r0 = r3.K0
            if (r0 == 0) goto L74
            float r0 = defpackage.nw7.g0(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L74
            r0 = 1
            boolean r0 = r3.canScrollVertically(r0)
            android.widget.EdgeEffect r2 = r3.K0
            if (r0 == 0) goto L5a
            r2.onRelease()
            goto L71
        L5a:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r5
            float r4 = defpackage.nw7.j0(r2, r4, r0)
            android.widget.EdgeEffect r5 = r3.K0
            float r5 = defpackage.nw7.g0(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L70
            android.widget.EdgeEffect r5 = r3.K0
            r5.onRelease()
        L70:
            r1 = r4
        L71:
            r3.invalidate()
        L74:
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = java.lang.Math.round(r1)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r9) {
            r8 = this;
            boolean r0 = super.dispatchKeyEvent(r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            gg5 r0 = r8.getLayoutManager()
            r2 = 0
            if (r0 != 0) goto L11
            goto L9e
        L11:
            boolean r3 = r0.e()
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 92
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 93
            if (r3 == 0) goto L5c
            int r9 = r9.getKeyCode()
            if (r9 == r5) goto L4d
            if (r9 == r7) goto L4d
            if (r9 == r6) goto L2d
            if (r9 == r4) goto L2d
            goto L9e
        L2d:
            boolean r0 = r0.L()
            if (r9 != r6) goto L3e
            if (r0 == 0) goto L49
            wf5 r9 = r8.getAdapter()
            int r2 = r9.a()
            goto L49
        L3e:
            if (r0 == 0) goto L41
            goto L49
        L41:
            wf5 r9 = r8.getAdapter()
            int r2 = r9.a()
        L49:
            r8.k0(r2)
            return r1
        L4d:
            int r0 = r8.getMeasuredHeight()
            if (r9 != r7) goto L57
            r8.j0(r2, r2, r0)
            return r1
        L57:
            int r9 = -r0
            r8.j0(r2, r2, r9)
            return r1
        L5c:
            boolean r3 = r0.d()
            if (r3 == 0) goto L9e
            int r9 = r9.getKeyCode()
            if (r9 == r5) goto L8f
            if (r9 == r7) goto L8f
            if (r9 == r6) goto L6f
            if (r9 == r4) goto L6f
            goto L9e
        L6f:
            boolean r0 = r0.L()
            if (r9 != r6) goto L80
            if (r0 == 0) goto L8b
            wf5 r9 = r8.getAdapter()
            int r2 = r9.a()
            goto L8b
        L80:
            if (r0 == 0) goto L83
            goto L8b
        L83:
            wf5 r9 = r8.getAdapter()
            int r2 = r9.a()
        L8b:
            r8.k0(r2)
            return r1
        L8f:
            int r0 = r8.getMeasuredWidth()
            if (r9 != r7) goto L99
            r8.j0(r0, r2, r2)
            return r1
        L99:
            int r9 = -r0
            r8.j0(r9, r2, r2)
            return r1
        L9e:
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r1, float r2, boolean r3) {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r1, float r2) {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            boolean r0 = r0.b(r1, r2)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            je4 r0 = r6.getScrollingChildHelper()
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.c(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            je4 r0 = r8.getScrollingChildHelper()
            r6 = 0
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r8 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0.onPopulateAccessibilityEvent(r1)
            r0 = 1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            java.util.ArrayList r0 = r8.o0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L19
            java.lang.Object r4 = r0.get(r3)
            dg5 r4 = (defpackage.dg5) r4
            r4.c(r9, r8)
            int r3 = r3 + 1
            goto Lb
        L19:
            android.widget.EdgeEffect r1 = r8.H0
            r3 = 1
            if (r1 == 0) goto L53
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L53
            int r1 = r9.save()
            boolean r4 = r8.g0
            if (r4 == 0) goto L31
            int r4 = r8.getPaddingBottom()
            goto L32
        L31:
            r4 = r2
        L32:
            r5 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r5)
            int r5 = r8.getHeight()
            int r5 = -r5
            int r5 = r5 + r4
            float r4 = (float) r5
            r5 = 0
            r9.translate(r4, r5)
            android.widget.EdgeEffect r4 = r8.H0
            if (r4 == 0) goto L4e
            boolean r4 = r4.draw(r9)
            if (r4 == 0) goto L4e
            r4 = r3
            goto L4f
        L4e:
            r4 = r2
        L4f:
            r9.restoreToCount(r1)
            goto L54
        L53:
            r4 = r2
        L54:
            android.widget.EdgeEffect r1 = r8.I0
            if (r1 == 0) goto L84
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L84
            int r1 = r9.save()
            boolean r5 = r8.g0
            if (r5 == 0) goto L73
            int r5 = r8.getPaddingLeft()
            float r5 = (float) r5
            int r6 = r8.getPaddingTop()
            float r6 = (float) r6
            r9.translate(r5, r6)
        L73:
            android.widget.EdgeEffect r5 = r8.I0
            if (r5 == 0) goto L7f
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L7f
            r5 = r3
            goto L80
        L7f:
            r5 = r2
        L80:
            r4 = r4 | r5
            r9.restoreToCount(r1)
        L84:
            android.widget.EdgeEffect r1 = r8.J0
            if (r1 == 0) goto Lbc
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lbc
            int r1 = r9.save()
            int r5 = r8.getWidth()
            boolean r6 = r8.g0
            if (r6 == 0) goto L9f
            int r6 = r8.getPaddingTop()
            goto La0
        L9f:
            r6 = r2
        La0:
            r7 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r7)
            float r6 = (float) r6
            int r5 = -r5
            float r5 = (float) r5
            r9.translate(r6, r5)
            android.widget.EdgeEffect r5 = r8.J0
            if (r5 == 0) goto Lb7
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto Lb7
            r5 = r3
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            r4 = r4 | r5
            r9.restoreToCount(r1)
        Lbc:
            android.widget.EdgeEffect r1 = r8.K0
            if (r1 == 0) goto L10b
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L10b
            int r1 = r9.save()
            r5 = 1127481344(0x43340000, float:180.0)
            r9.rotate(r5)
            boolean r5 = r8.g0
            if (r5 == 0) goto Led
            int r5 = r8.getWidth()
            int r5 = -r5
            int r6 = r8.getPaddingRight()
            int r6 = r6 + r5
            float r5 = (float) r6
            int r6 = r8.getHeight()
            int r6 = -r6
            int r7 = r8.getPaddingBottom()
            int r7 = r7 + r6
            float r6 = (float) r7
            r9.translate(r5, r6)
            goto Lfc
        Led:
            int r5 = r8.getWidth()
            int r5 = -r5
            float r5 = (float) r5
            int r6 = r8.getHeight()
            int r6 = -r6
            float r6 = (float) r6
            r9.translate(r5, r6)
        Lfc:
            android.widget.EdgeEffect r5 = r8.K0
            if (r5 == 0) goto L107
            boolean r5 = r5.draw(r9)
            if (r5 == 0) goto L107
            r2 = r3
        L107:
            r4 = r4 | r2
            r9.restoreToCount(r1)
        L10b:
            if (r4 != 0) goto L120
            cg5 r9 = r8.L0
            if (r9 == 0) goto L120
            int r9 = r0.size()
            if (r9 <= 0) goto L120
            cg5 r9 = r8.L0
            boolean r9 = r9.f()
            if (r9 == 0) goto L120
            goto L121
        L120:
            r3 = r4
        L121:
            if (r3 == 0) goto L126
            r8.postInvalidateOnAnimation()
        L126:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r0 = super.drawChild(r1, r2, r3)
            return r0
    }

    public final void e0(android.view.View r12, android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Rect r3 = r11.i0
            r4 = 0
            r3.set(r4, r4, r1, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.hg5
            if (r1 == 0) goto L3f
            hg5 r0 = (defpackage.hg5) r0
            boolean r1 = r0.c
            if (r1 != 0) goto L3f
            android.graphics.Rect r0 = r0.b
            int r1 = r3.left
            int r2 = r0.left
            int r1 = r1 - r2
            r3.left = r1
            int r1 = r3.right
            int r2 = r0.right
            int r1 = r1 + r2
            r3.right = r1
            int r1 = r3.top
            int r2 = r0.top
            int r1 = r1 - r2
            r3.top = r1
            int r1 = r3.bottom
            int r0 = r0.bottom
            int r1 = r1 + r0
            r3.bottom = r1
        L3f:
            if (r13 == 0) goto L47
            r11.offsetDescendantRectToMyCoords(r13, r3)
            r11.offsetRectIntoDescendantCoords(r12, r3)
        L47:
            gg5 r5 = r11.m0
            boolean r0 = r11.t0
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L52
            r10 = r1
            goto L53
        L52:
            r10 = r4
        L53:
            android.graphics.Rect r8 = r11.i0
            r6 = r11
            r7 = r12
            r5.n0(r6, r7, r8, r9, r10)
            return
    }

    public final boolean f0(int r19, int r20, android.view.MotionEvent r21, int r22) {
            r18 = this;
            r0 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0.p()
            wf5 r1 = r0.l0
            int[] r7 = r0.p1
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L23
            r7[r12] = r12
            r7[r11] = r12
            r0.g0(r8, r9, r7)
            r1 = r7[r12]
            r2 = r7[r11]
            int r3 = r8 - r1
            int r4 = r9 - r2
            goto L27
        L23:
            r1 = r12
            r2 = r1
            r3 = r2
            r4 = r3
        L27:
            java.util.ArrayList r5 = r0.o0
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L32
            r0.invalidate()
        L32:
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r0.n1
            r6 = r22
            r0.w(r1, r2, r3, r4, r5, r6, r7)
            r5 = r7[r12]
            int r3 = r3 - r5
            r6 = r7[r11]
            int r4 = r4 - r6
            if (r5 != 0) goto L4a
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r5 = r12
            goto L4b
        L4a:
            r5 = r11
        L4b:
            int r6 = r0.R0
            int[] r7 = r0.n1
            r13 = r7[r12]
            int r6 = r6 - r13
            r0.R0 = r6
            int r6 = r0.S0
            r7 = r7[r11]
            int r6 = r6 - r7
            r0.S0 = r6
            int[] r6 = r0.o1
            r14 = r6[r12]
            int r14 = r14 + r13
            r6[r12] = r14
            r13 = r6[r11]
            int r13 = r13 + r7
            r6[r11] = r13
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L125
            if (r10 == 0) goto L11d
            r6 = 8194(0x2002, float:1.1482E-41)
            boolean r6 = defpackage.ej2.J(r10, r6)
            if (r6 != 0) goto L11d
            float r6 = r10.getX()
            float r3 = (float) r3
            float r7 = r10.getY()
            float r4 = (float) r4
            r13 = 0
            int r14 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r14 >= 0) goto La7
            r0.z()
            android.widget.EdgeEffect r14 = r0.H0
            r16 = r11
            float r11 = -r3
            r17 = r12
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r0.getHeight()
            float r12 = (float) r12
            float r7 = r7 / r12
            float r7 = r15 - r7
            defpackage.nw7.j0(r14, r11, r7)
        La4:
            r7 = r16
            goto Lc7
        La7:
            r16 = r11
            r17 = r12
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 <= 0) goto Lc5
            r0.A()
            android.widget.EdgeEffect r11 = r0.J0
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r12 = r3 / r12
            int r14 = r0.getHeight()
            float r14 = (float) r14
            float r7 = r7 / r14
            defpackage.nw7.j0(r11, r12, r7)
            goto La4
        Lc5:
            r7 = r17
        Lc7:
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 >= 0) goto Le3
            r0.B()
            android.widget.EdgeEffect r7 = r0.I0
            float r11 = -r4
            int r12 = r0.getHeight()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r6 = r6 / r12
            defpackage.nw7.j0(r7, r11, r6)
        Le0:
            r7 = r16
            goto Lfe
        Le3:
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 <= 0) goto Lfe
            r0.y()
            android.widget.EdgeEffect r7 = r0.K0
            int r11 = r0.getHeight()
            float r11 = (float) r11
            float r11 = r4 / r11
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r6 = r6 / r12
            float r15 = r15 - r6
            defpackage.nw7.j0(r7, r11, r15)
            goto Le0
        Lfe:
            if (r7 != 0) goto L108
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L108
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 == 0) goto L10b
        L108:
            r0.postInvalidateOnAnimation()
        L10b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L121
            r3 = 4194304(0x400000, float:5.877472E-39)
            boolean r3 = defpackage.ej2.J(r10, r3)
            if (r3 == 0) goto L121
            r0.b0()
            goto L121
        L11d:
            r16 = r11
            r17 = r12
        L121:
            r18.n(r19, r20)
            goto L129
        L125:
            r16 = r11
            r17 = r12
        L129:
            if (r1 != 0) goto L12d
            if (r2 == 0) goto L130
        L12d:
            r0.x(r1, r2)
        L130:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto L139
            r0.invalidate()
        L139:
            if (r5 != 0) goto L141
            if (r1 != 0) goto L141
            if (r2 == 0) goto L140
            goto L141
        L140:
            return r17
        L141:
            return r16
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            gg5 r3 = r0.m0
            r3.getClass()
            wf5 r3 = r0.l0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L21
            gg5 r3 = r0.m0
            if (r3 == 0) goto L21
            boolean r3 = r0.Q()
            if (r3 != 0) goto L21
            boolean r3 = r0.w0
            if (r3 != 0) goto L21
            r3 = r4
            goto L22
        L21:
            r3 = r5
        L22:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            sg5 r7 = r0.d1
            mg5 r8 = r0.L
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L95
            if (r2 == r14) goto L36
            if (r2 != r4) goto L95
        L36:
            gg5 r3 = r0.m0
            boolean r3 = r3.e()
            if (r3 == 0) goto L4c
            if (r2 != r14) goto L43
            r3 = 130(0x82, float:1.82E-43)
            goto L44
        L43:
            r3 = r11
        L44:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L4c
            r3 = r4
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r3 != 0) goto L79
            gg5 r15 = r0.m0
            boolean r15 = r15.d()
            if (r15 == 0) goto L79
            gg5 r3 = r0.m0
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            int r3 = r3.getLayoutDirection()
            if (r3 != r4) goto L63
            r3 = r4
            goto L64
        L63:
            r3 = r5
        L64:
            if (r2 != r14) goto L68
            r15 = r4
            goto L69
        L68:
            r15 = r5
        L69:
            r3 = r3 ^ r15
            if (r3 == 0) goto L6f
            r3 = 66
            goto L70
        L6f:
            r3 = r9
        L70:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L78
            r3 = r4
            goto L79
        L78:
            r3 = r5
        L79:
            if (r3 == 0) goto L90
            r0.p()
            android.view.View r3 = r18.E(r19)
            if (r3 != 0) goto L85
            goto La6
        L85:
            r0.l0()
            gg5 r3 = r0.m0
            r3.T(r1, r2, r8, r7)
            r0.n0(r5)
        L90:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto Lb5
        L95:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto Lb4
            if (r3 == 0) goto Lb4
            r0.p()
            android.view.View r3 = r18.E(r19)
            if (r3 != 0) goto La7
        La6:
            return r13
        La7:
            r0.l0()
            gg5 r3 = r0.m0
            android.view.View r3 = r3.T(r1, r2, r8, r7)
            r0.n0(r5)
            goto Lb5
        Lb4:
            r3 = r6
        Lb5:
            if (r3 == 0) goto Lcc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto Lcc
            android.view.View r4 = r0.getFocusedChild()
            if (r4 != 0) goto Lc8
            android.view.View r0 = super.focusSearch(r19, r20)
            return r0
        Lc8:
            r0.e0(r3, r13)
            return r1
        Lcc:
            if (r3 == 0) goto L18e
            if (r3 == r0) goto L18e
            if (r3 != r1) goto Ld4
            goto L18e
        Ld4:
            android.view.View r6 = r0.E(r3)
            if (r6 != 0) goto Ldc
            goto L18e
        Ldc:
            if (r1 != 0) goto Le0
            goto L18d
        Le0:
            android.view.View r6 = r18.E(r19)
            if (r6 != 0) goto Le8
            goto L18d
        Le8:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            android.graphics.Rect r8 = r0.i0
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r15 = r0.j0
            r15.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r15)
            gg5 r6 = r0.m0
            androidx.recyclerview.widget.RecyclerView r6 = r6.b
            int r6 = r6.getLayoutDirection()
            if (r6 != r4) goto L114
            r6 = -1
            goto L115
        L114:
            r6 = r4
        L115:
            int r5 = r8.left
            int r7 = r15.left
            r17 = r13
            if (r5 < r7) goto L121
            int r13 = r8.right
            if (r13 > r7) goto L129
        L121:
            int r13 = r8.right
            int r12 = r15.right
            if (r13 >= r12) goto L129
            r5 = r4
            goto L136
        L129:
            int r12 = r8.right
            int r13 = r15.right
            if (r12 > r13) goto L131
            if (r5 < r13) goto L135
        L131:
            if (r5 <= r7) goto L135
            r5 = -1
            goto L136
        L135:
            r5 = 0
        L136:
            int r7 = r8.top
            int r12 = r15.top
            if (r7 < r12) goto L140
            int r13 = r8.bottom
            if (r13 > r12) goto L149
        L140:
            int r13 = r8.bottom
            int r10 = r15.bottom
            if (r13 >= r10) goto L149
            r16 = r4
            goto L158
        L149:
            int r8 = r8.bottom
            int r10 = r15.bottom
            if (r8 > r10) goto L151
            if (r7 < r10) goto L156
        L151:
            if (r7 <= r12) goto L156
            r16 = -1
            goto L158
        L156:
            r16 = 0
        L158:
            if (r2 == r4) goto L186
            if (r2 == r14) goto L17e
            if (r2 == r9) goto L17b
            if (r2 == r11) goto L178
            r4 = 66
            if (r2 == r4) goto L175
            r4 = 130(0x82, float:1.82E-43)
            if (r2 != r4) goto L16b
            if (r16 <= 0) goto L18e
            goto L18d
        L16b:
            java.lang.String r1 = "Invalid direction: "
            java.lang.String r0 = r0.C()
            defpackage.i.i(r1, r2, r0)
            return r17
        L175:
            if (r5 <= 0) goto L18e
            goto L18d
        L178:
            if (r16 >= 0) goto L18e
            goto L18d
        L17b:
            if (r5 >= 0) goto L18e
            goto L18d
        L17e:
            if (r16 > 0) goto L18d
            if (r16 != 0) goto L18e
            int r5 = r5 * r6
            if (r5 <= 0) goto L18e
            goto L18d
        L186:
            if (r16 < 0) goto L18d
            if (r16 != 0) goto L18e
            int r5 = r5 * r6
            if (r5 >= 0) goto L18e
        L18d:
            return r3
        L18e:
            android.view.View r0 = super.focusSearch(r19, r20)
            return r0
    }

    public final void g0(int r10, int r11, int[] r12) {
            r9 = this;
            r9.l0()
            r9.U()
            java.lang.String r0 = "RV Scroll"
            android.os.Trace.beginSection(r0)
            sg5 r0 = r9.d1
            r9.D(r0)
            mg5 r1 = r9.L
            r2 = 0
            if (r10 == 0) goto L1c
            gg5 r3 = r9.m0
            int r10 = r3.p0(r10, r1, r0)
            goto L1d
        L1c:
            r10 = r2
        L1d:
            if (r11 == 0) goto L26
            gg5 r3 = r9.m0
            int r11 = r3.r0(r11, r1, r0)
            goto L27
        L26:
            r11 = r2
        L27:
            android.os.Trace.endSection()
            dk0 r0 = r9.e0
            int r1 = r0.q()
            r3 = r2
        L31:
            if (r3 >= r1) goto L67
            android.view.View r4 = r0.p(r3)
            wg5 r5 = r9.M(r4)
            if (r5 == 0) goto L64
            wg5 r5 = r5.i
            if (r5 == 0) goto L64
            android.view.View r5 = r5.a
            int r6 = r4.getLeft()
            int r4 = r4.getTop()
            int r7 = r5.getLeft()
            if (r6 != r7) goto L57
            int r7 = r5.getTop()
            if (r4 == r7) goto L64
        L57:
            int r7 = r5.getWidth()
            int r7 = r7 + r6
            int r8 = r5.getHeight()
            int r8 = r8 + r4
            r5.layout(r6, r4, r7, r8)
        L64:
            int r3 = r3 + 1
            goto L31
        L67:
            r0 = 1
            r9.V(r0)
            r9.n0(r2)
            if (r12 == 0) goto L74
            r12[r2] = r10
            r12[r0] = r11
        L74:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 == 0) goto L9
            hg5 r1 = r0.r()
            return r1
        L9:
            java.lang.String r1 = r1.C()
            java.lang.String r0 = "RecyclerView has no LayoutManager"
            java.lang.String r1 = r0.concat(r1)
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r1.getContext()
            hg5 r1 = r0.s(r1, r2)
            return r1
        Ld:
            java.lang.String r1 = r1.C()
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            java.lang.String r1 = r2.concat(r1)
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 == 0) goto L9
            hg5 r1 = r0.t(r2)
            return r1
        L9:
            java.lang.String r1 = r1.C()
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            java.lang.String r1 = r2.concat(r1)
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    public defpackage.wf5 getAdapter() {
            r0 = this;
            wf5 r0 = r0.l0
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            gg5 r0 = r1.m0
            if (r0 == 0) goto L9
            r0.getClass()
            r1 = -1
            return r1
        L9:
            int r1 = super.getBaseline()
            return r1
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
            r0 = this;
            int r0 = super.getChildDrawingOrder(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r0 = this;
            boolean r0 = r0.g0
            return r0
    }

    public defpackage.yg5 getCompatAccessibilityDelegate() {
            r0 = this;
            yg5 r0 = r0.k1
            return r0
    }

    public defpackage.bg5 getEdgeEffectFactory() {
            r0 = this;
            bg5 r0 = r0.G0
            return r0
    }

    public defpackage.cg5 getItemAnimator() {
            r0 = this;
            cg5 r0 = r0.L0
            return r0
    }

    public int getItemDecorationCount() {
            r0 = this;
            java.util.ArrayList r0 = r0.o0
            int r0 = r0.size()
            return r0
    }

    public defpackage.gg5 getLayoutManager() {
            r0 = this;
            gg5 r0 = r0.m0
            return r0
    }

    public int getMaxFlingVelocity() {
            r0 = this;
            int r0 = r0.W0
            return r0
    }

    public int getMinFlingVelocity() {
            r0 = this;
            int r0 = r0.V0
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            boolean r2 = androidx.recyclerview.widget.RecyclerView.D1
            if (r2 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public defpackage.ig5 getOnFlingListener() {
            r0 = this;
            ig5 r0 = r0.U0
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r0 = this;
            boolean r0 = r0.Z0
            return r0
    }

    public defpackage.lg5 getRecycledViewPool() {
            r0 = this;
            mg5 r0 = r0.L
            lg5 r0 = r0.c()
            return r0
    }

    public int getScrollState() {
            r0 = this;
            int r0 = r0.M0
            return r0
    }

    public final void h(defpackage.wg5 r6) {
            r5 = this;
            android.view.View r0 = r6.a
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            mg5 r3 = r5.L
            wg5 r4 = r5.M(r0)
            r3.p(r4)
            boolean r6 = r6.j()
            r3 = -1
            dk0 r5 = r5.e0
            if (r6 == 0) goto L26
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            r5.h(r0, r3, r6, r2)
            return
        L26:
            if (r1 != 0) goto L2c
            r5.g(r0, r3, r2)
            return
        L2c:
            java.lang.Object r6 = r5.R
            uf5 r6 = (defpackage.uf5) r6
            androidx.recyclerview.widget.RecyclerView r6 = r6.A
            int r6 = r6.indexOfChild(r0)
            if (r6 < 0) goto L43
            java.lang.Object r1 = r5.X
            kk r1 = (defpackage.kk) r1
            r1.j(r6)
            r5.u(r0)
            return
        L43:
            java.lang.String r5 = "view is not a child, cannot hide "
            defpackage.e41.w(r0, r5)
            return
    }

    public final void h0(int r2) {
            r1 = this;
            boolean r0 = r1.w0
            if (r0 == 0) goto L5
            return
        L5:
            r1.p0()
            gg5 r0 = r1.m0
            if (r0 != 0) goto L14
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r2)
            return
        L14:
            r0.q0(r2)
            r1.awakenScrollBars()
            return
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r1 = this;
            je4 r1 = r1.getScrollingChildHelper()
            r0 = 0
            boolean r1 = r1.f(r0)
            return r1
    }

    public final void i(defpackage.dg5 r3) {
            r2 = this;
            gg5 r0 = r2.m0
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.c(r1)
        L9:
            java.util.ArrayList r0 = r2.o0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            r1 = 0
            r2.setWillNotDraw(r1)
        L15:
            r0.add(r3)
            r2.S()
            r2.requestLayout()
            return
    }

    public final boolean i0(android.widget.EdgeEffect r7, int r8, int r9) {
            r6 = this;
            if (r8 <= 0) goto L3
            goto L33
        L3:
            float r7 = defpackage.nw7.g0(r7)
            float r9 = (float) r9
            float r7 = r7 * r9
            int r8 = -r8
            int r8 = java.lang.Math.abs(r8)
            float r8 = (float) r8
            r9 = 1051931443(0x3eb33333, float:0.35)
            float r8 = r8 * r9
            r9 = 1014350479(0x3c75c28f, float:0.015)
            float r6 = r6.A
            float r6 = r6 * r9
            float r8 = r8 / r6
            double r8 = (double) r8
            double r8 = java.lang.Math.log(r8)
            float r0 = androidx.recyclerview.widget.RecyclerView.B1
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r0 - r2
            double r4 = (double) r6
            double r0 = r0 / r2
            double r0 = r0 * r8
            double r8 = java.lang.Math.exp(r0)
            double r8 = r8 * r4
            float r6 = (float) r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L35
        L33:
            r6 = 1
            return r6
        L35:
            r6 = 0
            return r6
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.r0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r0 = this;
            boolean r0 = r0.w0
            return r0
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            boolean r0 = r0.d
            return r0
    }

    public final void j(defpackage.jg5 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1 = r0
        Lb:
            java.util.ArrayList r1 = r1.f1
            r1.add(r2)
            return
    }

    public final void j0(int r3, boolean r4, int r5) {
            r2 = this;
            gg5 r0 = r2.m0
            if (r0 != 0) goto Lc
            java.lang.String r2 = "RecyclerView"
            java.lang.String r3 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r2, r3)
            return
        Lc:
            boolean r1 = r2.w0
            if (r1 == 0) goto L11
            goto L27
        L11:
            boolean r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto L19
            r3 = r1
        L19:
            gg5 r0 = r2.m0
            boolean r0 = r0.e()
            if (r0 != 0) goto L22
            r5 = r1
        L22:
            if (r3 != 0) goto L28
            if (r5 == 0) goto L27
            goto L28
        L27:
            return
        L28:
            if (r4 == 0) goto L39
            r4 = 1
            if (r3 == 0) goto L2e
            r1 = r4
        L2e:
            if (r5 == 0) goto L32
            r1 = r1 | 2
        L32:
            je4 r0 = r2.getScrollingChildHelper()
            r0.g(r1, r4)
        L39:
            vg5 r2 = r2.a1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            r2.c(r3, r5, r4, r0)
            return
    }

    public final void k(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.Q()
            if (r0 == 0) goto L1a
            if (r2 != 0) goto L16
            java.lang.String r1 = r1.C()
            java.lang.String r2 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            java.lang.String r1 = r2.concat(r1)
            defpackage.i.m(r1)
            return
        L16:
            defpackage.i.m(r2)
            return
        L1a:
            int r2 = r1.F0
            if (r2 <= 0) goto L2e
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.C()
            r2.<init>(r1)
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r1, r0, r2)
        L2e:
            return
    }

    public final void k0(int r2) {
            r1 = this;
            boolean r0 = r1.w0
            if (r0 == 0) goto L5
            return
        L5:
            gg5 r0 = r1.m0
            if (r0 != 0) goto L11
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r2)
            return
        L11:
            r0.A0(r1, r2)
            return
    }

    public final void l0() {
            r2 = this;
            int r0 = r2.u0
            r1 = 1
            int r0 = r0 + r1
            r2.u0 = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.w0
            if (r0 != 0) goto Lf
            r0 = 0
            r2.v0 = r0
        Lf:
            return
    }

    public final void m() {
            r7 = this;
            dk0 r0 = r7.e0
            int r1 = r0.t()
            r2 = 0
            r3 = r2
        L8:
            r4 = -1
            if (r3 >= r1) goto L20
            android.view.View r5 = r0.s(r3)
            wg5 r5 = N(r5)
            boolean r6 = r5.o()
            if (r6 != 0) goto L1d
            r5.d = r4
            r5.g = r4
        L1d:
            int r3 = r3 + 1
            goto L8
        L20:
            mg5 r7 = r7.L
            java.lang.Object r0 = r7.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r7.e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            r5 = r2
        L2f:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r1.get(r5)
            wg5 r6 = (defpackage.wg5) r6
            r6.d = r4
            r6.g = r4
            int r5 = r5 + 1
            goto L2f
        L3e:
            int r1 = r0.size()
            r3 = r2
        L43:
            if (r3 >= r1) goto L52
            java.lang.Object r5 = r0.get(r3)
            wg5 r5 = (defpackage.wg5) r5
            r5.d = r4
            r5.g = r4
            int r3 = r3 + 1
            goto L43
        L52:
            java.lang.Object r0 = r7.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L6f
            int r0 = r0.size()
        L5c:
            if (r2 >= r0) goto L6f
            java.lang.Object r1 = r7.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r2)
            wg5 r1 = (defpackage.wg5) r1
            r1.d = r4
            r1.g = r4
            int r2 = r2 + 1
            goto L5c
        L6f:
            return
    }

    public final void m0(int r3) {
            r2 = this;
            gg5 r0 = r2.m0
            boolean r0 = r0.d()
            gg5 r1 = r2.m0
            boolean r1 = r1.e()
            if (r1 == 0) goto L10
            r0 = r0 | 2
        L10:
            je4 r2 = r2.getScrollingChildHelper()
            r2.g(r0, r3)
            return
    }

    public final void n(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.H0
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.H0
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.H0
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.J0
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.J0
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.J0
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.I0
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.I0
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.I0
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.K0
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.K0
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.K0
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L66
            r2.postInvalidateOnAnimation()
        L66:
            return
    }

    public final void n0(boolean r4) {
            r3 = this;
            int r0 = r3.u0
            r1 = 1
            if (r0 >= r1) goto L1a
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            if (r0 != 0) goto Lc
            r3.u0 = r1
            goto L1a
        Lc:
            java.lang.String r3 = r3.C()
            java.lang.String r4 = "stopInterceptRequestLayout was called more times than startInterceptRequestLayout."
            java.lang.String r3 = r4.concat(r3)
            defpackage.i.m(r3)
            return
        L1a:
            r0 = 0
            if (r4 != 0) goto L23
            boolean r2 = r3.w0
            if (r2 != 0) goto L23
            r3.v0 = r0
        L23:
            int r2 = r3.u0
            if (r2 != r1) goto L42
            if (r4 == 0) goto L3c
            boolean r4 = r3.v0
            if (r4 == 0) goto L3c
            boolean r4 = r3.w0
            if (r4 != 0) goto L3c
            gg5 r4 = r3.m0
            if (r4 == 0) goto L3c
            wf5 r4 = r3.l0
            if (r4 == 0) goto L3c
            r3.s()
        L3c:
            boolean r4 = r3.w0
            if (r4 != 0) goto L42
            r3.v0 = r0
        L42:
            int r4 = r3.u0
            int r4 = r4 - r1
            r3.u0 = r4
            return
    }

    public final void o0(int r1) {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            r0.h(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.E0 = r0
            r1 = 1
            r5.r0 = r1
            boolean r2 = r5.t0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.t0 = r2
            mg5 r2 = r5.L
            r2.g()
            gg5 r2 = r5.m0
            if (r2 == 0) goto L26
            r2.g = r1
            r2.R(r5)
        L26:
            r5.j1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D1
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = defpackage.dr2.X
            java.lang.Object r1 = r0.get()
            dr2 r1 = (defpackage.dr2) r1
            r5.b1 = r1
            if (r1 != 0) goto L66
            dr2 r1 = new dr2
            r1.<init>()
            r5.b1 = r1
            java.util.WeakHashMap r1 = defpackage.ao7.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            dr2 r2 = r5.b1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.L = r3
            r0.set(r2)
        L66:
            dr2 r0 = r5.b1
            java.util.ArrayList r0 = r0.A
            boolean r1 = androidx.recyclerview.widget.RecyclerView.y1
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            defpackage.i.m(r5)
            return
        L7b:
            r0.add(r5)
        L7e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r5 = this;
            super.onDetachedFromWindow()
            cg5 r0 = r5.L0
            if (r0 == 0) goto La
            r0.e()
        La:
            r5.p0()
            r0 = 0
            r5.r0 = r0
            gg5 r1 = r5.m0
            if (r1 == 0) goto L19
            r1.g = r0
            r1.S(r5)
        L19:
            java.util.ArrayList r1 = r5.q1
            r1.clear()
            sf5 r1 = r5.r1
            r5.removeCallbacks(r1)
            rr6 r1 = r5.f0
            r1.getClass()
        L28:
            tz4 r1 = defpackage.lo7.d
            java.lang.Object r1 = r1.a()
            if (r1 == 0) goto L31
            goto L28
        L31:
            mg5 r1 = r5.L
            java.lang.Object r2 = r1.e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r3 = r0
        L38:
            int r4 = r2.size()
            if (r3 >= r4) goto L4c
            java.lang.Object r4 = r2.get(r3)
            wg5 r4 = (defpackage.wg5) r4
            android.view.View r4 = r4.a
            defpackage.bl2.n(r4)
            int r3 = r3 + 1
            goto L38
        L4c:
            java.lang.Object r2 = r1.h
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            wf5 r2 = r2.l0
            r1.h(r2, r0)
        L55:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L86
            int r1 = r0 + 1
            android.view.View r0 = r5.getChildAt(r0)
            if (r0 == 0) goto L80
            sz4 r0 = defpackage.bl2.D(r0)
            java.util.ArrayList r0 = r0.a
            int r2 = defpackage.hf.U(r0)
        L6d:
            r3 = -1
            if (r3 >= r2) goto L7e
            java.lang.Object r3 = r0.get(r2)
            do7 r3 = (defpackage.do7) r3
            p0 r3 = r3.a
            r3.e()
            int r2 = r2 + (-1)
            goto L6d
        L7e:
            r0 = r1
            goto L55
        L80:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
        L86:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D1
            if (r0 == 0) goto La4
            dr2 r0 = r5.b1
            if (r0 == 0) goto La4
            java.util.ArrayList r0 = r0.A
            boolean r0 = r0.remove(r5)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.y1
            if (r1 == 0) goto La1
            if (r0 == 0) goto L9b
            goto La1
        L9b:
            java.lang.String r5 = "RecyclerView removal failed!"
            defpackage.i.m(r5)
            return
        La1:
            r0 = 0
            r5.b1 = r0
        La4:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            java.util.ArrayList r4 = r3.o0
            int r0 = r4.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r4.get(r1)
            dg5 r2 = (defpackage.dg5) r2
            r2.b(r3)
            int r1 = r1 + 1
            goto La
        L18:
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r6 = r18
            gg5 r1 = r0.m0
            r7 = 0
            if (r1 != 0) goto Lb
            goto L122
        Lb:
            boolean r1 = r0.w0
            if (r1 == 0) goto L11
            goto L122
        L11:
            int r1 = r6.getAction()
            r2 = 8
            if (r1 != r2) goto L122
            int r1 = r6.getSource()
            r1 = r1 & 2
            r2 = 0
            if (r1 == 0) goto L46
            gg5 r1 = r0.m0
            boolean r1 = r1.e()
            if (r1 == 0) goto L32
            r1 = 9
            float r1 = r6.getAxisValue(r1)
            float r1 = -r1
            goto L33
        L32:
            r1 = r2
        L33:
            gg5 r3 = r0.m0
            boolean r3 = r3.d()
            if (r3 == 0) goto L41
            r2 = 10
            float r2 = r6.getAxisValue(r2)
        L41:
            r3 = r2
            r8 = r7
            r9 = r8
            r2 = r1
            goto L76
        L46:
            int r1 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r3
            if (r1 == 0) goto L73
            r1 = 26
            float r3 = r6.getAxisValue(r1)
            gg5 r4 = r0.m0
            boolean r4 = r4.e()
            if (r4 == 0) goto L64
            float r3 = -r3
            r16 = r3
            r3 = r2
            r2 = r16
            goto L6e
        L64:
            gg5 r4 = r0.m0
            boolean r4 = r4.d()
            if (r4 == 0) goto L6d
            goto L6e
        L6d:
            r3 = r2
        L6e:
            boolean r4 = r0.v1
            r8 = r1
            r9 = r4
            goto L76
        L73:
            r3 = r2
            r8 = r7
            r9 = r8
        L76:
            float r1 = r0.Y0
            float r2 = r2 * r1
            int r1 = (int) r2
            float r2 = r0.X0
            float r3 = r3 * r2
            int r2 = (int) r3
            r10 = 1
            if (r9 == 0) goto L9e
            vg5 r3 = r0.a1
            android.widget.OverScroller r3 = r3.L
            int r4 = r3.getFinalY()
            int r5 = r3.getCurrY()
            int r4 = r4 - r5
            int r4 = r4 + r1
            int r1 = r3.getFinalX()
            int r3 = r3.getCurrX()
            int r1 = r1 - r3
            int r1 = r1 + r2
            r0.j0(r1, r10, r4)
            goto L119
        L9e:
            gg5 r3 = r0.m0
            if (r3 != 0) goto Lab
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r2)
            goto L119
        Lab:
            boolean r4 = r0.w0
            if (r4 == 0) goto Lb1
            goto L119
        Lb1:
            int[] r11 = r0.p1
            r11[r7] = r7
            r11[r10] = r7
            boolean r12 = r3.d()
            gg5 r3 = r0.m0
            boolean r13 = r3.e()
            if (r13 == 0) goto Lc6
            r3 = r12 | 2
            goto Lc7
        Lc6:
            r3 = r12
        Lc7:
            float r4 = r6.getY()
            float r5 = r6.getX()
            int r4 = r0.c0(r2, r4)
            int r14 = r2 - r4
            int r2 = r0.d0(r1, r5)
            int r15 = r1 - r2
            je4 r1 = r0.getScrollingChildHelper()
            r2 = 1
            r1.g(r3, r2)
            if (r12 == 0) goto Le7
            r1 = r14
            goto Le8
        Le7:
            r1 = r7
        Le8:
            r3 = r2
            if (r13 == 0) goto Led
            r2 = r15
            goto Lee
        Led:
            r2 = r7
        Lee:
            int[] r4 = r0.p1
            int[] r5 = r0.n1
            boolean r1 = r0.v(r1, r2, r3, r4, r5)
            if (r1 == 0) goto Lfe
            r1 = r11[r7]
            int r14 = r14 - r1
            r1 = r11[r10]
            int r15 = r15 - r1
        Lfe:
            if (r12 == 0) goto L102
            r1 = r14
            goto L103
        L102:
            r1 = r7
        L103:
            if (r13 == 0) goto L107
            r2 = r15
            goto L108
        L107:
            r2 = r7
        L108:
            r0.f0(r1, r2, r6, r3)
            dr2 r1 = r0.b1
            if (r1 == 0) goto L116
            if (r14 != 0) goto L113
            if (r15 == 0) goto L116
        L113:
            r1.a(r0, r14, r15)
        L116:
            r0.o0(r3)
        L119:
            if (r8 == 0) goto L122
            if (r9 != 0) goto L122
            nj1 r0 = r0.x1
            r0.a(r6, r8)
        L122:
            return r7
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            boolean r0 = r9.w0
            r1 = 0
            if (r0 == 0) goto L7
            goto L1ca
        L7:
            r0 = 0
            r9.q0 = r0
            boolean r0 = r9.F(r10)
            r2 = 1
            if (r0 == 0) goto L22
            android.view.VelocityTracker r10 = r9.O0
            if (r10 == 0) goto L18
            r10.clear()
        L18:
            r9.o0(r1)
            r9.b0()
            r9.setScrollState(r1)
            return r2
        L22:
            gg5 r0 = r9.m0
            if (r0 != 0) goto L28
            goto L1ca
        L28:
            boolean r0 = r0.d()
            gg5 r3 = r9.m0
            boolean r3 = r3.e()
            android.view.VelocityTracker r4 = r9.O0
            if (r4 != 0) goto L3c
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r9.O0 = r4
        L3c:
            android.view.VelocityTracker r4 = r9.O0
            r4.addMovement(r10)
            int r4 = r10.getActionMasked()
            int r5 = r10.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Lf8
            if (r4 == r2) goto Lee
            if (r4 == r6) goto L90
            r0 = 3
            if (r4 == r0) goto L7e
            r0 = 5
            if (r4 == r0) goto L62
            r0 = 6
            if (r4 == r0) goto L5d
            goto L1c5
        L5d:
            r9.W(r10)
            goto L1c5
        L62:
            int r0 = r10.getPointerId(r5)
            r9.N0 = r0
            float r0 = r10.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r9.R0 = r0
            r9.P0 = r0
            float r10 = r10.getY(r5)
            float r10 = r10 + r7
            int r10 = (int) r10
            r9.S0 = r10
            r9.Q0 = r10
            goto L1c5
        L7e:
            android.view.VelocityTracker r10 = r9.O0
            if (r10 == 0) goto L85
            r10.clear()
        L85:
            r9.o0(r1)
            r9.b0()
            r9.setScrollState(r1)
            goto L1c5
        L90:
            int r4 = r9.N0
            int r4 = r10.findPointerIndex(r4)
            if (r4 >= 0) goto Lb3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r10.<init>(r0)
            int r9 = r9.N0
            r10.append(r9)
            java.lang.String r9 = " not found. Did any MotionEvents get skipped?"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "RecyclerView"
            android.util.Log.e(r10, r9)
            return r1
        Lb3:
            float r5 = r10.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r10 = r10.getY(r4)
            float r10 = r10 + r7
            int r10 = (int) r10
            int r4 = r9.M0
            if (r4 == r2) goto L1c5
            int r4 = r9.P0
            int r4 = r5 - r4
            int r6 = r9.Q0
            int r6 = r10 - r6
            if (r0 == 0) goto Ld9
            int r0 = java.lang.Math.abs(r4)
            int r4 = r9.T0
            if (r0 <= r4) goto Ld9
            r9.R0 = r5
            r0 = r2
            goto Lda
        Ld9:
            r0 = r1
        Lda:
            if (r3 == 0) goto Le7
            int r3 = java.lang.Math.abs(r6)
            int r4 = r9.T0
            if (r3 <= r4) goto Le7
            r9.S0 = r10
            r0 = r2
        Le7:
            if (r0 == 0) goto L1c5
            r9.setScrollState(r2)
            goto L1c5
        Lee:
            android.view.VelocityTracker r10 = r9.O0
            r10.clear()
            r9.o0(r1)
            goto L1c5
        Lf8:
            boolean r0 = r9.x0
            if (r0 == 0) goto Lfe
            r9.x0 = r1
        Lfe:
            int r0 = r10.getPointerId(r1)
            r9.N0 = r0
            float r0 = r10.getX()
            float r0 = r0 + r7
            int r0 = (int) r0
            r9.R0 = r0
            r9.P0 = r0
            float r0 = r10.getY()
            float r0 = r0 + r7
            int r0 = (int) r0
            r9.S0 = r0
            r9.Q0 = r0
            android.widget.EdgeEffect r0 = r9.H0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = -1
            r5 = 0
            if (r0 == 0) goto L141
            float r0 = defpackage.nw7.g0(r0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L141
            boolean r0 = r9.canScrollHorizontally(r4)
            if (r0 != 0) goto L141
            android.widget.EdgeEffect r0 = r9.H0
            float r7 = r10.getY()
            int r8 = r9.getHeight()
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = r3 - r7
            defpackage.nw7.j0(r0, r5, r7)
            r0 = r2
            goto L142
        L141:
            r0 = r1
        L142:
            android.widget.EdgeEffect r7 = r9.J0
            if (r7 == 0) goto L164
            float r7 = defpackage.nw7.g0(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L164
            boolean r7 = r9.canScrollHorizontally(r2)
            if (r7 != 0) goto L164
            android.widget.EdgeEffect r0 = r9.J0
            float r7 = r10.getY()
            int r8 = r9.getHeight()
            float r8 = (float) r8
            float r7 = r7 / r8
            defpackage.nw7.j0(r0, r5, r7)
            r0 = r2
        L164:
            android.widget.EdgeEffect r7 = r9.I0
            if (r7 == 0) goto L186
            float r7 = defpackage.nw7.g0(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L186
            boolean r4 = r9.canScrollVertically(r4)
            if (r4 != 0) goto L186
            android.widget.EdgeEffect r0 = r9.I0
            float r4 = r10.getX()
            int r7 = r9.getWidth()
            float r7 = (float) r7
            float r4 = r4 / r7
            defpackage.nw7.j0(r0, r5, r4)
            r0 = r2
        L186:
            android.widget.EdgeEffect r4 = r9.K0
            if (r4 == 0) goto L1a9
            float r4 = defpackage.nw7.g0(r4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L1a9
            boolean r4 = r9.canScrollVertically(r2)
            if (r4 != 0) goto L1a9
            android.widget.EdgeEffect r0 = r9.K0
            float r10 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            float r10 = r10 / r4
            float r3 = r3 - r10
            defpackage.nw7.j0(r0, r5, r3)
            r0 = r2
        L1a9:
            if (r0 != 0) goto L1af
            int r10 = r9.M0
            if (r10 != r6) goto L1bc
        L1af:
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r2)
            r9.setScrollState(r2)
            r9.o0(r2)
        L1bc:
            int[] r10 = r9.o1
            r10[r2] = r1
            r10[r1] = r1
            r9.m0(r1)
        L1c5:
            int r9 = r9.M0
            if (r9 != r2) goto L1ca
            return r2
        L1ca:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r1 = "RV OnLayout"
            android.os.Trace.beginSection(r1)
            r0.s()
            android.os.Trace.endSection()
            r1 = 1
            r0.t0 = r1
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            gg5 r0 = r6.m0
            if (r0 != 0) goto L8
            r6.q(r7, r8)
            return
        L8:
            boolean r0 = r0.K()
            r1 = 1
            r2 = 0
            sg5 r3 = r6.d1
            if (r0 == 0) goto L7b
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            gg5 r5 = r6.m0
            androidx.recyclerview.widget.RecyclerView r5 = r5.b
            r5.q(r7, r8)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 != r5) goto L28
            if (r4 != r5) goto L28
            r2 = r1
        L28:
            r6.s1 = r2
            if (r2 != 0) goto L7a
            wf5 r0 = r6.l0
            if (r0 != 0) goto L31
            goto L7a
        L31:
            int r0 = r3.d
            if (r0 != r1) goto L38
            r6.t()
        L38:
            gg5 r0 = r6.m0
            r0.t0(r7, r8)
            r3.i = r1
            r6.u()
            gg5 r0 = r6.m0
            r0.v0(r7, r8)
            gg5 r0 = r6.m0
            boolean r0 = r0.y0()
            if (r0 == 0) goto L6e
            gg5 r0 = r6.m0
            int r2 = r6.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r6.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r0.t0(r2, r4)
            r3.i = r1
            r6.u()
            gg5 r0 = r6.m0
            r0.v0(r7, r8)
        L6e:
            int r7 = r6.getMeasuredWidth()
            r6.t1 = r7
            int r7 = r6.getMeasuredHeight()
            r6.u1 = r7
        L7a:
            return
        L7b:
            boolean r0 = r6.s0
            if (r0 == 0) goto L87
            gg5 r6 = r6.m0
            androidx.recyclerview.widget.RecyclerView r6 = r6.b
            r6.q(r7, r8)
            return
        L87:
            boolean r0 = r6.z0
            if (r0 == 0) goto Lab
            r6.l0()
            r6.U()
            r6.Y()
            r6.V(r1)
            boolean r0 = r3.k
            if (r0 == 0) goto L9e
            r3.g = r1
            goto La5
        L9e:
            z9 r0 = r6.d0
            r0.d()
            r3.g = r2
        La5:
            r6.z0 = r2
            r6.n0(r2)
            goto Lbb
        Lab:
            boolean r0 = r3.k
            if (r0 == 0) goto Lbb
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            r6.setMeasuredDimension(r7, r8)
            return
        Lbb:
            wf5 r0 = r6.l0
            if (r0 == 0) goto Lc6
            int r0 = r0.a()
            r3.e = r0
            goto Lc8
        Lc6:
            r3.e = r2
        Lc8:
            r6.l0()
            gg5 r0 = r6.m0
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r0.q(r7, r8)
            r6.n0(r2)
            r3.g = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.Q()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = super.onRequestFocusInDescendants(r2, r3)
            return r1
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.pg5
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            pg5 r2 = (defpackage.pg5) r2
            r1.R = r2
            android.os.Parcelable r2 = r2.A
            super.onRestoreInstanceState(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            pg5 r0 = new pg5
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            pg5 r1 = r2.R
            if (r1 == 0) goto L12
            android.os.Parcelable r2 = r1.L
            r0.L = r2
            return r0
        L12:
            gg5 r2 = r2.m0
            if (r2 == 0) goto L1d
            android.os.Parcelable r2 = r2.g0()
            r0.L = r2
            return r0
        L1d:
            r2 = 0
            r0.L = r2
            return r0
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L9
            if (r2 == r4) goto L8
            goto L9
        L8:
            return
        L9:
            r1 = 0
            r0.K0 = r1
            r0.I0 = r1
            r0.J0 = r1
            r0.H0 = r1
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
            r18 = this;
            r0 = r18
            r6 = r19
            boolean r1 = r0.w0
            r7 = 0
            if (r1 != 0) goto L31a
            boolean r1 = r0.x0
            if (r1 == 0) goto Lf
            goto L31a
        Lf:
            u92 r1 = r0.q0
            r2 = 3
            r3 = 2
            r4 = 0
            r8 = 1
            if (r1 != 0) goto L26
            int r1 = r6.getAction()
            if (r1 != 0) goto L20
            r1 = r7
            goto L12c
        L20:
            boolean r1 = r18.F(r19)
            goto L12c
        L26:
            int r5 = r1.b
            int r9 = r1.v
            if (r9 != 0) goto L2e
            goto L120
        L2e:
            int r9 = r6.getAction()
            if (r9 != 0) goto L6e
            float r5 = r6.getX()
            float r9 = r6.getY()
            boolean r5 = r1.e(r5, r9)
            float r9 = r6.getX()
            float r10 = r6.getY()
            boolean r9 = r1.d(r9, r10)
            if (r5 != 0) goto L50
            if (r9 == 0) goto L120
        L50:
            if (r9 == 0) goto L5d
            r1.w = r8
            float r5 = r6.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r1.p = r5
            goto L69
        L5d:
            if (r5 == 0) goto L69
            r1.w = r3
            float r5 = r6.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r1.m = r5
        L69:
            r1.g(r3)
            goto L120
        L6e:
            int r9 = r6.getAction()
            if (r9 != r8) goto L83
            int r9 = r1.v
            if (r9 != r3) goto L83
            r1.m = r4
            r1.p = r4
            r1.g(r8)
            r1.w = r7
            goto L120
        L83:
            int r9 = r6.getAction()
            if (r9 != r3) goto L120
            int r9 = r1.v
            if (r9 != r3) goto L120
            r1.h()
            int r9 = r1.w
            r10 = 1073741824(0x40000000, float:2.0)
            if (r9 != r8) goto Ld9
            float r9 = r6.getX()
            int[] r13 = r1.y
            r13[r7] = r5
            int r11 = r1.q
            int r11 = r11 - r5
            r13[r8] = r11
            float r12 = (float) r5
            float r11 = (float) r11
            float r9 = java.lang.Math.min(r11, r9)
            float r12 = java.lang.Math.max(r12, r9)
            int r9 = r1.o
            float r9 = (float) r9
            float r9 = r9 - r12
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto Lba
            goto Ld9
        Lba:
            float r11 = r1.p
            androidx.recyclerview.widget.RecyclerView r9 = r1.s
            int r14 = r9.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r1.s
            int r15 = r9.computeHorizontalScrollOffset()
            int r9 = r1.q
            r16 = r9
            int r9 = defpackage.u92.f(r11, r12, r13, r14, r15, r16)
            if (r9 == 0) goto Ld7
            androidx.recyclerview.widget.RecyclerView r11 = r1.s
            r11.scrollBy(r9, r7)
        Ld7:
            r1.p = r12
        Ld9:
            int r9 = r1.w
            if (r9 != r3) goto L120
            float r9 = r6.getY()
            int[] r13 = r1.x
            r13[r7] = r5
            int r11 = r1.r
            int r11 = r11 - r5
            r13[r8] = r11
            float r5 = (float) r5
            float r11 = (float) r11
            float r9 = java.lang.Math.min(r11, r9)
            float r12 = java.lang.Math.max(r5, r9)
            int r5 = r1.l
            float r5 = (float) r5
            float r5 = r5 - r12
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L101
            goto L120
        L101:
            float r11 = r1.m
            androidx.recyclerview.widget.RecyclerView r5 = r1.s
            int r14 = r5.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r1.s
            int r15 = r5.computeVerticalScrollOffset()
            int r5 = r1.r
            r16 = r5
            int r5 = defpackage.u92.f(r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L11e
            androidx.recyclerview.widget.RecyclerView r9 = r1.s
            r9.scrollBy(r7, r5)
        L11e:
            r1.m = r12
        L120:
            int r1 = r6.getAction()
            if (r1 == r2) goto L128
            if (r1 != r8) goto L12b
        L128:
            r1 = 0
            r0.q0 = r1
        L12b:
            r1 = r8
        L12c:
            if (r1 == 0) goto L13f
            android.view.VelocityTracker r1 = r0.O0
            if (r1 == 0) goto L135
            r1.clear()
        L135:
            r0.o0(r7)
            r0.b0()
            r0.setScrollState(r7)
            return r8
        L13f:
            gg5 r1 = r0.m0
            if (r1 != 0) goto L145
            goto L31a
        L145:
            boolean r9 = r1.d()
            gg5 r1 = r0.m0
            boolean r10 = r1.e()
            android.view.VelocityTracker r1 = r0.O0
            if (r1 != 0) goto L159
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.O0 = r1
        L159:
            int r1 = r6.getActionMasked()
            int r5 = r6.getActionIndex()
            int[] r11 = r0.o1
            if (r1 != 0) goto L169
            r11[r8] = r7
            r11[r7] = r7
        L169:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r6)
            r13 = r11[r7]
            float r13 = (float) r13
            r14 = r11[r8]
            float r14 = (float) r14
            r12.offsetLocation(r13, r14)
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L2f4
            if (r1 == r8) goto L2a8
            if (r1 == r3) goto L1bb
            if (r1 == r2) goto L1a9
            r2 = 5
            if (r1 == r2) goto L18d
            r2 = 6
            if (r1 == r2) goto L188
            goto L311
        L188:
            r18.W(r19)
            goto L311
        L18d:
            int r1 = r6.getPointerId(r5)
            r0.N0 = r1
            float r1 = r6.getX(r5)
            float r1 = r1 + r13
            int r1 = (int) r1
            r0.R0 = r1
            r0.P0 = r1
            float r1 = r6.getY(r5)
            float r1 = r1 + r13
            int r1 = (int) r1
            r0.S0 = r1
            r0.Q0 = r1
            goto L311
        L1a9:
            android.view.VelocityTracker r1 = r0.O0
            if (r1 == 0) goto L1b0
            r1.clear()
        L1b0:
            r0.o0(r7)
            r0.b0()
            r0.setScrollState(r7)
            goto L311
        L1bb:
            int r1 = r0.N0
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto L1de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r0 = r0.N0
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r7
        L1de:
            float r2 = r6.getX(r1)
            float r2 = r2 + r13
            int r14 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r13
            int r13 = (int) r1
            int r1 = r0.R0
            int r1 = r1 - r14
            int r2 = r0.S0
            int r2 = r2 - r13
            int r3 = r0.M0
            if (r3 == r8) goto L223
            if (r9 == 0) goto L209
            int r3 = r0.T0
            if (r1 <= 0) goto L200
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto L205
        L200:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        L205:
            if (r1 == 0) goto L209
            r3 = r8
            goto L20a
        L209:
            r3 = r7
        L20a:
            if (r10 == 0) goto L21e
            int r4 = r0.T0
            if (r2 <= 0) goto L216
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto L21b
        L216:
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        L21b:
            if (r2 == 0) goto L21e
            r3 = r8
        L21e:
            if (r3 == 0) goto L223
            r0.setScrollState(r8)
        L223:
            int r3 = r0.M0
            if (r3 != r8) goto L311
            int[] r15 = r0.p1
            r15[r7] = r7
            r15[r8] = r7
            float r3 = r6.getY()
            int r3 = r0.c0(r1, r3)
            int r16 = r1 - r3
            float r1 = r6.getX()
            int r1 = r0.d0(r2, r1)
            int r17 = r2 - r1
            if (r9 == 0) goto L246
            r1 = r16
            goto L247
        L246:
            r1 = r7
        L247:
            if (r10 == 0) goto L24c
            r2 = r17
            goto L24d
        L24c:
            r2 = r7
        L24d:
            int[] r5 = r0.n1
            r3 = 0
            int[] r4 = r0.p1
            boolean r1 = r0.v(r1, r2, r3, r4, r5)
            int[] r2 = r0.n1
            if (r1 == 0) goto L277
            r1 = r15[r7]
            int r16 = r16 - r1
            r1 = r15[r8]
            int r17 = r17 - r1
            r1 = r11[r7]
            r3 = r2[r7]
            int r1 = r1 + r3
            r11[r7] = r1
            r1 = r11[r8]
            r3 = r2[r8]
            int r1 = r1 + r3
            r11[r8] = r1
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L277:
            r1 = r16
            r3 = r17
            r4 = r2[r7]
            int r14 = r14 - r4
            r0.R0 = r14
            r2 = r2[r8]
            int r13 = r13 - r2
            r0.S0 = r13
            if (r9 == 0) goto L289
            r2 = r1
            goto L28a
        L289:
            r2 = r7
        L28a:
            if (r10 == 0) goto L28e
            r4 = r3
            goto L28f
        L28e:
            r4 = r7
        L28f:
            boolean r2 = r0.f0(r2, r4, r6, r7)
            if (r2 == 0) goto L29c
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
        L29c:
            dr2 r2 = r0.b1
            if (r2 == 0) goto L311
            if (r1 != 0) goto L2a4
            if (r3 == 0) goto L311
        L2a4:
            r2.a(r0, r1, r3)
            goto L311
        L2a8:
            android.view.VelocityTracker r1 = r0.O0
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r0.O0
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r0.W0
            float r5 = (float) r3
            r1.computeCurrentVelocity(r2, r5)
            if (r9 == 0) goto L2c3
            android.view.VelocityTracker r1 = r0.O0
            int r2 = r0.N0
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L2c4
        L2c3:
            r1 = r4
        L2c4:
            if (r10 == 0) goto L2d0
            android.view.VelocityTracker r2 = r0.O0
            int r5 = r0.N0
            float r2 = r2.getYVelocity(r5)
            float r2 = -r2
            goto L2d1
        L2d0:
            r2 = r4
        L2d1:
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 != 0) goto L2d9
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2e3
        L2d9:
            int r1 = (int) r1
            int r2 = (int) r2
            int r4 = r0.V0
            boolean r1 = r0.J(r1, r2, r4, r3)
            if (r1 != 0) goto L2e6
        L2e3:
            r0.setScrollState(r7)
        L2e6:
            android.view.VelocityTracker r1 = r0.O0
            if (r1 == 0) goto L2ed
            r1.clear()
        L2ed:
            r0.o0(r7)
            r0.b0()
            goto L316
        L2f4:
            int r1 = r6.getPointerId(r7)
            r0.N0 = r1
            float r1 = r6.getX()
            float r1 = r1 + r13
            int r1 = (int) r1
            r0.R0 = r1
            r0.P0 = r1
            float r1 = r6.getY()
            float r1 = r1 + r13
            int r1 = (int) r1
            r0.S0 = r1
            r0.Q0 = r1
            r0.m0(r7)
        L311:
            android.view.VelocityTracker r0 = r0.O0
            r0.addMovement(r12)
        L316:
            r12.recycle()
            return r8
        L31a:
            return r7
    }

    public final void p() {
            r6 = this;
            boolean r0 = r6.t0
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L77
            boolean r0 = r6.C0
            if (r0 == 0) goto Lc
            goto L77
        Lc:
            z9 r0 = r6.d0
            boolean r2 = r0.j()
            if (r2 != 0) goto L15
            goto L76
        L15:
            int r2 = r0.a
            r3 = r2 & 4
            if (r3 == 0) goto L67
            r2 = r2 & 11
            if (r2 == 0) goto L20
            goto L67
        L20:
            java.lang.String r1 = "RV PartialInvalidate"
            android.os.Trace.beginSection(r1)
            r6.l0()
            r6.U()
            r0.q()
            boolean r1 = r6.v0
            if (r1 != 0) goto L5c
            dk0 r1 = r6.e0
            int r2 = r1.q()
            r3 = 0
        L39:
            if (r3 >= r2) goto L59
            android.view.View r4 = r1.p(r3)
            wg5 r4 = N(r4)
            if (r4 == 0) goto L56
            boolean r5 = r4.o()
            if (r5 == 0) goto L4c
            goto L56
        L4c:
            boolean r4 = r4.k()
            if (r4 == 0) goto L56
            r6.s()
            goto L5c
        L56:
            int r3 = r3 + 1
            goto L39
        L59:
            r0.c()
        L5c:
            r0 = 1
            r6.n0(r0)
            r6.V(r0)
            android.os.Trace.endSection()
            return
        L67:
            boolean r0 = r0.j()
            if (r0 == 0) goto L76
            android.os.Trace.beginSection(r1)
            r6.s()
            android.os.Trace.endSection()
        L76:
            return
        L77:
            android.os.Trace.beginSection(r1)
            r6.s()
            android.os.Trace.endSection()
            return
    }

    public final void p0() {
            r2 = this;
            r0 = 0
            r2.setScrollState(r0)
            vg5 r0 = r2.a1
            androidx.recyclerview.widget.RecyclerView r1 = r0.Z
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.L
            r0.abortAnimation()
            gg5 r2 = r2.m0
            if (r2 == 0) goto L1b
            iv3 r2 = r2.e
            if (r2 == 0) goto L1b
            r2.i()
        L1b:
            return
    }

    public final void q(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            int r0 = r2.getMinimumWidth()
            int r3 = defpackage.gg5.g(r3, r1, r0)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.getMinimumHeight()
            int r4 = defpackage.gg5.g(r4, r1, r0)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public final void r(android.view.View r3) {
            r2 = this;
            N(r3)
            java.util.ArrayList r0 = r2.B0
            if (r0 == 0) goto L24
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L24
            java.util.ArrayList r1 = r2.B0
            java.lang.Object r1 = r1.get(r0)
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2 r1 = (me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2) r1
            r1.getClass()
            r3.getClass()
            r1 = 0
            r3.setOnFocusChangeListener(r1)
            int r0 = r0 + (-1)
            goto Ld
        L24:
            return
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            wg5 r0 = N(r3)
            if (r0 == 0) goto L2c
            boolean r1 = r0.j()
            if (r1 == 0) goto L13
            int r1 = r0.j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0.j = r1
            goto L30
        L13:
            boolean r1 = r0.o()
            if (r1 == 0) goto L1a
            goto L30
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r2 = r2.C()
            defpackage.i.j(r3, r2)
            return
        L2c:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            if (r0 != 0) goto L3a
        L30:
            r3.clearAnimation()
            r2.r(r3)
            super.removeDetachedView(r3, r4)
            return
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "No ViewHolder found for child: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r2 = r2.C()
            defpackage.i.j(r4, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            gg5 r0 = r1.m0
            iv3 r0 = r0.e
            if (r0 == 0) goto Lb
            boolean r0 = r0.e
            if (r0 == 0) goto Lb
            goto L17
        Lb:
            boolean r0 = r1.Q()
            if (r0 == 0) goto L12
            goto L17
        L12:
            if (r3 == 0) goto L17
            r1.e0(r2, r3)
        L17:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r7, android.graphics.Rect r8, boolean r9) {
            r6 = this;
            gg5 r0 = r6.m0
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            boolean r6 = r0.n0(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.p0
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            java.lang.Object r3 = r0.get(r2)
            u92 r3 = (defpackage.u92) r3
            r3.getClass()
            int r2 = r2 + 1
            goto L7
        L15:
            super.requestDisallowInterceptTouchEvent(r5)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            int r0 = r1.u0
            if (r0 != 0) goto Lc
            boolean r0 = r1.w0
            if (r0 != 0) goto Lc
            super.requestLayout()
            return
        Lc:
            r0 = 1
            r1.v0 = r0
            return
    }

    public final void s() {
            r25 = this;
            r0 = r25
            wf5 r1 = r0.l0
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto Le
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r0)
            return
        Le:
            gg5 r1 = r0.m0
            if (r1 != 0) goto L18
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r0)
            return
        L18:
            sg5 r1 = r0.d1
            r3 = 0
            r1.i = r3
            boolean r4 = r0.s1
            r5 = 1
            if (r4 == 0) goto L34
            int r4 = r0.t1
            int r6 = r0.getWidth()
            if (r4 != r6) goto L32
            int r4 = r0.u1
            int r6 = r0.getHeight()
            if (r4 == r6) goto L34
        L32:
            r4 = r5
            goto L35
        L34:
            r4 = r3
        L35:
            r0.t1 = r3
            r0.u1 = r3
            r0.s1 = r3
            int r6 = r1.d
            if (r6 != r5) goto L4b
            r0.t()
            gg5 r4 = r0.m0
            r4.s0(r0)
            r0.u()
            goto L87
        L4b:
            z9 r6 = r0.d0
            java.lang.Object r7 = r6.d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L62
            java.lang.Object r6 = r6.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L62
            goto L7f
        L62:
            if (r4 != 0) goto L7f
            gg5 r4 = r0.m0
            int r4 = r4.n
            int r6 = r0.getWidth()
            if (r4 != r6) goto L7f
            gg5 r4 = r0.m0
            int r4 = r4.o
            int r6 = r0.getHeight()
            if (r4 == r6) goto L79
            goto L7f
        L79:
            gg5 r4 = r0.m0
            r4.s0(r0)
            goto L87
        L7f:
            gg5 r4 = r0.m0
            r4.s0(r0)
            r0.u()
        L87:
            r4 = 4
            r1.a(r4)
            r0.l0()
            r0.U()
            r1.d = r5
            boolean r6 = r1.j
            dk0 r7 = r0.e0
            mg5 r9 = r0.L
            rr6 r10 = r0.f0
            if (r6 == 0) goto L2ab
            int r6 = r7.q()
            int r6 = r6 - r5
        La2:
            if (r6 < 0) goto L1c9
            android.view.View r11 = r7.p(r6)
            wg5 r11 = N(r11)
            boolean r12 = r11.o()
            if (r12 == 0) goto Lb6
            r16 = r5
            goto L1c2
        Lb6:
            long r12 = r0.L(r11)
            cg5 r14 = r0.L0
            r14.getClass()
            dy7 r14 = new dy7
            r14.<init>()
            r14.b(r11)
            java.lang.Object r15 = r10.L
            hz3 r15 = (defpackage.hz3) r15
            r16 = r5
            java.lang.Object r5 = r10.B
            ci6 r5 = (defpackage.ci6) r5
            java.lang.Object r15 = r15.b(r12)
            wg5 r15 = (defpackage.wg5) r15
            if (r15 == 0) goto L1bf
            boolean r17 = r15.o()
            if (r17 != 0) goto L1bf
            java.lang.Object r17 = r5.get(r15)
            r8 = r17
            lo7 r8 = (defpackage.lo7) r8
            if (r8 == 0) goto Lf2
            int r8 = r8.a
            r8 = r8 & 1
            if (r8 == 0) goto Lf2
            r8 = r16
            goto Lf3
        Lf2:
            r8 = r3
        Lf3:
            java.lang.Object r5 = r5.get(r11)
            lo7 r5 = (defpackage.lo7) r5
            if (r5 == 0) goto L104
            int r5 = r5.a
            r5 = r5 & 1
            if (r5 == 0) goto L104
            r5 = r16
            goto L105
        L104:
            r5 = r3
        L105:
            if (r8 == 0) goto L10e
            if (r15 != r11) goto L10e
            r10.e(r11, r14)
            goto L1c2
        L10e:
            dy7 r3 = r10.k(r15, r4)
            r10.e(r11, r14)
            r14 = 8
            dy7 r14 = r10.k(r11, r14)
            if (r3 != 0) goto L195
            int r3 = r7.q()
            r5 = 0
        L122:
            if (r5 >= r3) goto L174
            android.view.View r8 = r7.p(r5)
            wg5 r8 = N(r8)
            if (r8 != r11) goto L12f
            goto L171
        L12f:
            long r18 = r0.L(r8)
            int r14 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r14 != 0) goto L171
            wf5 r1 = r0.l0
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L159
            boolean r1 = r1.b
            if (r1 == 0) goto L159
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r0.C()
            defpackage.u34.r(r1, r0)
            return
        L159:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r0.C()
            defpackage.u34.r(r1, r0)
            return
        L171:
            int r5 = r5 + 1
            goto L122
        L174:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r3.<init>(r5)
            r3.append(r15)
            java.lang.String r5 = " cannot be found but it is necessary for "
            r3.append(r5)
            r3.append(r11)
            java.lang.String r5 = r0.C()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L1c2
        L195:
            r12 = 0
            r15.n(r12)
            if (r8 == 0) goto L19e
            r0.h(r15)
        L19e:
            if (r15 == r11) goto L1b3
            if (r5 == 0) goto L1a5
            r0.h(r11)
        L1a5:
            r15.h = r11
            r0.h(r15)
            r9.p(r15)
            r12 = 0
            r11.n(r12)
            r11.i = r15
        L1b3:
            cg5 r5 = r0.L0
            boolean r3 = r5.a(r15, r11, r3, r14)
            if (r3 == 0) goto L1c2
            r0.X()
            goto L1c2
        L1bf:
            r10.e(r11, r14)
        L1c2:
            int r6 = r6 + (-1)
            r5 = r16
            r3 = 0
            goto La2
        L1c9:
            r16 = r5
            java.lang.Object r2 = r10.B
            ci6 r2 = (defpackage.ci6) r2
            int r3 = r2.L
            int r3 = r3 + (-1)
        L1d3:
            if (r3 < 0) goto L2a9
            java.lang.Object r4 = r2.f(r3)
            wg5 r4 = (defpackage.wg5) r4
            java.lang.Object r5 = r2.g(r3)
            lo7 r5 = (defpackage.lo7) r5
            int r6 = r5.a
            r8 = r6 & 3
            uf5 r11 = r0.w1
            r12 = 3
            if (r8 != r12) goto L1fb
            androidx.recyclerview.widget.RecyclerView r6 = r11.A
            gg5 r8 = r6.m0
            android.view.View r4 = r4.a
            mg5 r6 = r6.L
            r8.l0(r4, r6)
        L1f5:
            r24 = r2
        L1f7:
            r8 = 0
        L1f8:
            r12 = 0
            goto L298
        L1fb:
            r8 = r6 & 1
            if (r8 == 0) goto L215
            dy7 r6 = r5.b
            if (r6 != 0) goto L20f
            androidx.recyclerview.widget.RecyclerView r6 = r11.A
            gg5 r8 = r6.m0
            android.view.View r4 = r4.a
            mg5 r6 = r6.L
            r8.l0(r4, r6)
            goto L1f5
        L20f:
            dy7 r8 = r5.c
            r11.i(r4, r6, r8)
            goto L1f5
        L215:
            r8 = r6 & 14
            r12 = 14
            if (r8 != r12) goto L223
            dy7 r6 = r5.b
            dy7 r8 = r5.c
            r11.h(r4, r6, r8)
            goto L1f5
        L223:
            r8 = r6 & 12
            r12 = 12
            if (r8 != r12) goto L27c
            dy7 r6 = r5.b
            dy7 r8 = r5.c
            r11.getClass()
            r12 = 0
            r4.n(r12)
            androidx.recyclerview.widget.RecyclerView r11 = r11.A
            boolean r12 = r11.C0
            cg5 r13 = r11.L0
            if (r12 == 0) goto L246
            boolean r4 = r13.a(r4, r4, r6, r8)
            if (r4 == 0) goto L1f5
            r11.X()
            goto L1f5
        L246:
            ke1 r13 = (defpackage.ke1) r13
            r13.getClass()
            int r12 = r6.a
            int r14 = r8.a
            if (r12 != r14) goto L25f
            int r15 = r6.b
            r24 = r2
            int r2 = r8.b
            if (r15 == r2) goto L25a
            goto L261
        L25a:
            r13.c(r4)
            r2 = 0
            goto L275
        L25f:
            r24 = r2
        L261:
            int r2 = r6.b
            int r6 = r8.b
            r21 = r2
            r19 = r4
            r23 = r6
            r20 = r12
            r18 = r13
            r22 = r14
            boolean r2 = r18.g(r19, r20, r21, r22, r23)
        L275:
            if (r2 == 0) goto L1f7
            r11.X()
            goto L1f7
        L27c:
            r24 = r2
            r2 = r6 & 4
            if (r2 == 0) goto L28a
            dy7 r2 = r5.b
            r8 = 0
            r11.i(r4, r2, r8)
            goto L1f8
        L28a:
            r8 = 0
            r2 = r6 & 8
            if (r2 == 0) goto L1f8
            dy7 r2 = r5.b
            dy7 r6 = r5.c
            r11.h(r4, r2, r6)
            goto L1f8
        L298:
            r5.a = r12
            r5.b = r8
            r5.c = r8
            tz4 r2 = defpackage.lo7.d
            r2.c(r5)
            int r3 = r3 + (-1)
            r2 = r24
            goto L1d3
        L2a9:
            r8 = 0
            goto L2ae
        L2ab:
            r16 = r5
            goto L2a9
        L2ae:
            gg5 r2 = r0.m0
            r2.k0(r9)
            int r2 = r1.e
            r1.b = r2
            r12 = 0
            r0.C0 = r12
            r0.D0 = r12
            r1.j = r12
            r1.k = r12
            gg5 r2 = r0.m0
            r2.f = r12
            java.lang.Object r2 = r9.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L2cd
            r2.clear()
        L2cd:
            gg5 r2 = r0.m0
            boolean r3 = r2.k
            if (r3 == 0) goto L2da
            r2.j = r12
            r2.k = r12
            r9.q()
        L2da:
            gg5 r2 = r0.m0
            r2.e0(r1)
            r2 = r16
            r0.V(r2)
            r0.n0(r12)
            java.lang.Object r3 = r10.B
            ci6 r3 = (defpackage.ci6) r3
            r3.clear()
            java.lang.Object r3 = r10.L
            hz3 r3 = (defpackage.hz3) r3
            r3.a()
            int[] r3 = r0.l1
            r4 = r3[r12]
            r5 = r3[r2]
            r0.G(r3)
            r6 = r3[r12]
            if (r6 != r4) goto L306
            r3 = r3[r2]
            if (r3 == r5) goto L309
        L306:
            r0.x(r12, r12)
        L309:
            boolean r2 = r0.Z0
            r3 = -1
            r5 = -1
            if (r2 == 0) goto L3fe
            wf5 r2 = r0.l0
            if (r2 == 0) goto L3fe
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L3fe
            int r2 = r0.getDescendantFocusability()
            r6 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r6) goto L3fe
            int r2 = r0.getDescendantFocusability()
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r6) goto L332
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto L332
            goto L3fe
        L332:
            boolean r2 = r0.isFocused()
            if (r2 != 0) goto L348
            android.view.View r2 = r0.getFocusedChild()
            java.lang.Object r6 = r7.B
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r2 = r6.contains(r2)
            if (r2 != 0) goto L348
            goto L3fe
        L348:
            long r9 = r1.m
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L388
            wf5 r2 = r0.l0
            boolean r2 = r2.b
            if (r2 == 0) goto L388
            if (r2 != 0) goto L357
            goto L388
        L357:
            int r2 = r7.t()
            r11 = r8
            r6 = r12
        L35d:
            if (r6 >= r2) goto L389
            android.view.View r13 = r7.s(r6)
            wg5 r13 = N(r13)
            if (r13 == 0) goto L385
            boolean r14 = r13.h()
            if (r14 != 0) goto L385
            long r14 = r13.e
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 != 0) goto L385
            android.view.View r11 = r13.a
            java.lang.Object r14 = r7.B
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r11 = r14.contains(r11)
            if (r11 == 0) goto L383
            r11 = r13
            goto L385
        L383:
            r11 = r13
            goto L389
        L385:
            int r6 = r6 + 1
            goto L35d
        L388:
            r11 = r8
        L389:
            if (r11 == 0) goto L3a0
            android.view.View r2 = r11.a
            java.lang.Object r6 = r7.B
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L3a0
            boolean r6 = r2.hasFocusable()
            if (r6 != 0) goto L39e
            goto L3a0
        L39e:
            r8 = r2
            goto L3e5
        L3a0:
            int r2 = r7.q()
            if (r2 <= 0) goto L3e5
            int r2 = r1.l
            if (r2 == r5) goto L3ab
            goto L3ac
        L3ab:
            r2 = r12
        L3ac:
            int r6 = r1.b()
            r7 = r2
        L3b1:
            if (r7 >= r6) goto L3c7
            wg5 r9 = r0.I(r7)
            if (r9 != 0) goto L3ba
            goto L3c7
        L3ba:
            android.view.View r9 = r9.a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L3c4
            r8 = r9
            goto L3e5
        L3c4:
            int r7 = r7 + 1
            goto L3b1
        L3c7:
            int r2 = java.lang.Math.min(r6, r2)
            r16 = 1
            int r2 = r2 + (-1)
        L3cf:
            if (r2 < 0) goto L3e5
            wg5 r6 = r0.I(r2)
            if (r6 != 0) goto L3d8
            goto L3e5
        L3d8:
            android.view.View r6 = r6.a
            boolean r7 = r6.hasFocusable()
            if (r7 == 0) goto L3e2
            r8 = r6
            goto L3e5
        L3e2:
            int r2 = r2 + (-1)
            goto L3cf
        L3e5:
            if (r8 == 0) goto L3fe
            int r0 = r1.n
            long r6 = (long) r0
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L3fb
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L3fb
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L3fb
            r8 = r0
        L3fb:
            r8.requestFocus()
        L3fe:
            r1.m = r3
            r1.l = r5
            r1.n = r5
            return
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
            r3 = this;
            gg5 r0 = r3.m0
            if (r0 != 0) goto Lc
            java.lang.String r3 = "RecyclerView"
            java.lang.String r4 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r4)
            return
        Lc:
            boolean r1 = r3.w0
            if (r1 == 0) goto L11
            goto L20
        L11:
            boolean r0 = r0.d()
            gg5 r1 = r3.m0
            boolean r1 = r1.e()
            if (r0 != 0) goto L21
            if (r1 == 0) goto L20
            goto L21
        L20:
            return
        L21:
            r2 = 0
            if (r0 == 0) goto L25
            goto L26
        L25:
            r4 = r2
        L26:
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r5 = r2
        L2a:
            r0 = 0
            r3.f0(r4, r5, r0, r2)
            return
    }

    @Override // android.view.View
    public final void scrollTo(int r1, int r2) {
            r0 = this;
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"
            android.util.Log.w(r0, r1)
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            boolean r0 = r1.Q()
            if (r0 == 0) goto L19
            r0 = 0
            if (r2 == 0) goto Le
            int r2 = r2.getContentChangeTypes()
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            int r2 = r1.y0
            r2 = r2 | r0
            r1.y0 = r2
            return
        L19:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(defpackage.yg5 r1) {
            r0 = this;
            r0.k1 = r1
            defpackage.ao7.n(r0, r1)
            return
    }

    public void setAdapter(defpackage.wf5 r12) {
            r11 = this;
            r0 = 0
            r11.setLayoutFrozen(r0)
            wf5 r1 = r11.l0
            og5 r2 = r11.B
            if (r1 == 0) goto L14
            xf5 r1 = r1.a
            r1.unregisterObserver(r2)
            wf5 r1 = r11.l0
            r1.getClass()
        L14:
            cg5 r1 = r11.L0
            if (r1 == 0) goto L1b
            r1.e()
        L1b:
            gg5 r1 = r11.m0
            mg5 r3 = r11.L
            if (r1 == 0) goto L29
            r1.j0(r3)
            gg5 r1 = r11.m0
            r1.k0(r3)
        L29:
            java.lang.Object r1 = r3.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            r3.j()
            z9 r1 = r11.d0
            java.lang.Object r4 = r1.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.r(r4)
            java.lang.Object r4 = r1.d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.r(r4)
            r1.a = r0
            wf5 r1 = r11.l0
            r11.l0 = r12
            if (r12 == 0) goto L53
            xf5 r4 = r12.a
            r4.registerObserver(r2)
            r12.d(r11)
        L53:
            gg5 r12 = r11.m0
            if (r12 == 0) goto L5a
            r12.Q()
        L5a:
            wf5 r12 = r11.l0
            java.lang.Object r2 = r3.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            r3.j()
            r2 = 1
            r3.h(r1, r2)
            lg5 r4 = r3.c()
            if (r1 == 0) goto L75
            int r1 = r4.b
            int r1 = r1 - r2
            r4.b = r1
        L75:
            int r1 = r4.b
            if (r1 != 0) goto La7
            android.util.SparseArray r1 = r4.a
            r5 = r0
        L7c:
            int r6 = r1.size()
            if (r5 >= r6) goto La7
            java.lang.Object r6 = r1.valueAt(r5)
            kg5 r6 = (defpackage.kg5) r6
            java.util.ArrayList r7 = r6.a
            int r8 = r7.size()
            r9 = r0
        L8f:
            if (r9 >= r8) goto L9f
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            wg5 r10 = (defpackage.wg5) r10
            android.view.View r10 = r10.a
            defpackage.bl2.n(r10)
            goto L8f
        L9f:
            java.util.ArrayList r6 = r6.a
            r6.clear()
            int r5 = r5 + 1
            goto L7c
        La7:
            if (r12 == 0) goto Lae
            int r12 = r4.b
            int r12 = r12 + r2
            r4.b = r12
        Lae:
            r3.g()
            sg5 r12 = r11.d1
            r12.f = r2
            r11.Z(r0)
            r11.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(defpackage.ag5 r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1 = 0
            r0.setChildrenDrawingOrderEnabled(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.g0
            if (r2 == r0) goto Ld
            r0 = 0
            r1.K0 = r0
            r1.I0 = r0
            r1.J0 = r0
            r1.H0 = r0
        Ld:
            r1.g0 = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.t0
            if (r2 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    public void setEdgeEffectFactory(defpackage.bg5 r1) {
            r0 = this;
            r1.getClass()
            r0.G0 = r1
            r1 = 0
            r0.K0 = r1
            r0.I0 = r1
            r0.J0 = r1
            r0.H0 = r1
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.s0 = r1
            return
    }

    public void setItemAnimator(defpackage.cg5 r3) {
            r2 = this;
            cg5 r0 = r2.L0
            if (r0 == 0) goto Lc
            r0.e()
            cg5 r0 = r2.L0
            r1 = 0
            r0.a = r1
        Lc:
            r2.L0 = r3
            if (r3 == 0) goto L14
            uf5 r2 = r2.i1
            r3.a = r2
        L14:
            return
    }

    public void setItemViewCacheSize(int r1) {
            r0 = this;
            mg5 r0 = r0.L
            r0.a = r1
            r0.q()
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(defpackage.gg5 r11) {
            r10 = this;
            gg5 r0 = r10.m0
            if (r11 != r0) goto L5
            return
        L5:
            r10.p0()
            gg5 r0 = r10.m0
            r1 = 0
            mg5 r2 = r10.L
            if (r0 == 0) goto L3e
            cg5 r0 = r10.L0
            if (r0 == 0) goto L16
            r0.e()
        L16:
            gg5 r0 = r10.m0
            r0.j0(r2)
            gg5 r0 = r10.m0
            r0.k0(r2)
            java.lang.Object r0 = r2.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r2.j()
            boolean r0 = r10.r0
            if (r0 == 0) goto L35
            gg5 r0 = r10.m0
            r0.g = r1
            r0.S(r10)
        L35:
            gg5 r0 = r10.m0
            r3 = 0
            r0.w0(r3)
            r10.m0 = r3
            goto L48
        L3e:
            java.lang.Object r0 = r2.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r2.j()
        L48:
            dk0 r0 = r10.e0
            java.lang.Object r3 = r0.X
            kk r3 = (defpackage.kk) r3
            r3.i()
            java.lang.Object r3 = r0.B
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r5 = 1
            int r4 = r4 - r5
        L5b:
            java.lang.Object r6 = r0.R
            uf5 r6 = (defpackage.uf5) r6
            androidx.recyclerview.widget.RecyclerView r6 = r6.A
            if (r4 < 0) goto L8c
            java.lang.Object r7 = r3.get(r4)
            android.view.View r7 = (android.view.View) r7
            wg5 r7 = N(r7)
            if (r7 == 0) goto L86
            int r8 = r7.p
            boolean r9 = r6.Q()
            if (r9 == 0) goto L7f
            r7.q = r8
            java.util.ArrayList r6 = r6.q1
            r6.add(r7)
            goto L84
        L7f:
            android.view.View r6 = r7.a
            r6.setImportantForAccessibility(r8)
        L84:
            r7.p = r1
        L86:
            r3.remove(r4)
            int r4 = r4 + (-1)
            goto L5b
        L8c:
            int r0 = r6.getChildCount()
        L90:
            if (r1 >= r0) goto L9f
            android.view.View r3 = r6.getChildAt(r1)
            r6.r(r3)
            r3.clearAnimation()
            int r1 = r1 + 1
            goto L90
        L9f:
            r6.removeAllViews()
            r10.m0 = r11
            if (r11 == 0) goto Lcf
            androidx.recyclerview.widget.RecyclerView r0 = r11.b
            if (r0 != 0) goto Lb9
            r11.w0(r10)
            boolean r11 = r10.r0
            if (r11 == 0) goto Lcf
            gg5 r11 = r10.m0
            r11.g = r5
            r11.R(r10)
            goto Lcf
        Lb9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "LayoutManager "
            r10.<init>(r0)
            r10.append(r11)
            androidx.recyclerview.widget.RecyclerView r11 = r11.b
            java.lang.String r11 = r11.C()
            java.lang.String r0 = " is already attached to a RecyclerView:"
            defpackage.fa6.g(r10, r0, r11)
            return
        Lcf:
            r2.q()
            r10.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            super.setLayoutTransition(r1)
            return
        L7:
            java.lang.String r0 = "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"
            defpackage.i.h(r0)
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            je4 r2 = r2.getScrollingChildHelper()
            boolean r0 = r2.d
            if (r0 == 0) goto Lf
            android.view.ViewGroup r0 = r2.c
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.stopNestedScroll()
        Lf:
            r2.d = r3
            return
    }

    public void setOnFlingListener(defpackage.ig5 r1) {
            r0 = this;
            r0.U0 = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(defpackage.jg5 r1) {
            r0 = this;
            r0.e1 = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.Z0 = r1
            return
    }

    public void setRecycledViewPool(defpackage.lg5 r4) {
            r3 = this;
            mg5 r3 = r3.L
            java.lang.Object r0 = r3.h
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            wf5 r1 = r0.l0
            r2 = 0
            r3.h(r1, r2)
            java.lang.Object r1 = r3.g
            lg5 r1 = (defpackage.lg5) r1
            if (r1 == 0) goto L18
            int r2 = r1.b
            int r2 = r2 + (-1)
            r1.b = r2
        L18:
            r3.g = r4
            if (r4 == 0) goto L2c
            wf5 r4 = r0.getAdapter()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.g
            lg5 r4 = (defpackage.lg5) r4
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
        L2c:
            r3.g()
            return
    }

    @java.lang.Deprecated
    public void setRecyclerListener(defpackage.ng5 r1) {
            r0 = this;
            return
    }

    public void setScrollState(int r4) {
            r3 = this;
            int r0 = r3.M0
            if (r4 != r0) goto L5
            goto L68
        L5:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.z1
            if (r0 == 0) goto L24
            java.lang.String r0 = "setting scroll state to "
            java.lang.String r1 = " from "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r4, r1)
            int r1 = r3.M0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r0, r1)
        L24:
            r3.M0 = r4
            r0 = 2
            if (r4 == r0) goto L40
            vg5 r0 = r3.a1
            androidx.recyclerview.widget.RecyclerView r1 = r0.Z
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.L
            r0.abortAnimation()
            gg5 r0 = r3.m0
            if (r0 == 0) goto L40
            iv3 r0 = r0.e
            if (r0 == 0) goto L40
            r0.i()
        L40:
            gg5 r0 = r3.m0
            if (r0 == 0) goto L47
            r0.h0(r4)
        L47:
            jg5 r0 = r3.e1
            if (r0 == 0) goto L4e
            r0.a(r4)
        L4e:
            java.util.ArrayList r0 = r3.f1
            if (r0 == 0) goto L68
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L58:
            if (r0 < 0) goto L68
            java.util.ArrayList r1 = r3.f1
            java.lang.Object r1 = r1.get(r0)
            jg5 r1 = (defpackage.jg5) r1
            r1.a(r4)
            int r0 = r0 + (-1)
            goto L58
        L68:
            return
    }

    public void setScrollingTouchSlop(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r4 == 0) goto L2d
            r1 = 1
            if (r4 == r1) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setScrollingTouchSlop(): bad argument constant "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "; using default value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.w(r1, r4)
            goto L2d
        L26:
            int r4 = r0.getScaledPagingTouchSlop()
            r3.T0 = r4
            return
        L2d:
            int r4 = r0.getScaledTouchSlop()
            r3.T0 = r4
            return
    }

    public void setViewCacheExtension(defpackage.ug5 r1) {
            r0 = this;
            mg5 r0 = r0.L
            r0.getClass()
            return
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r2) {
            r1 = this;
            je4 r1 = r1.getScrollingChildHelper()
            r0 = 0
            boolean r1 = r1.g(r2, r0)
            return r1
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            je4 r1 = r1.getScrollingChildHelper()
            r0 = 0
            r1.h(r0)
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.w0
            if (r10 == r0) goto L38
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.k(r0)
            if (r10 != 0) goto L20
            r10 = 0
            r9.w0 = r10
            boolean r0 = r9.v0
            if (r0 == 0) goto L1d
            gg5 r0 = r9.m0
            if (r0 == 0) goto L1d
            wf5 r0 = r9.l0
            if (r0 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.v0 = r10
            return
        L20:
            long r1 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r5 = 3
            r6 = 0
            r3 = r1
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.w0 = r10
            r9.x0 = r10
            r9.p0()
        L38:
            return
    }

    public final void t() {
            r12 = this;
            sg5 r0 = r12.d1
            r1 = 1
            r0.a(r1)
            r12.D(r0)
            r2 = 0
            r0.i = r2
            r12.l0()
            rr6 r3 = r12.f0
            java.lang.Object r4 = r3.B
            ci6 r4 = (defpackage.ci6) r4
            java.lang.Object r5 = r3.B
            ci6 r5 = (defpackage.ci6) r5
            r4.clear()
            java.lang.Object r3 = r3.L
            hz3 r3 = (defpackage.hz3) r3
            r3.a()
            r12.U()
            r12.Y()
            boolean r4 = r12.Z0
            r6 = 0
            if (r4 == 0) goto L3d
            boolean r4 = r12.hasFocus()
            if (r4 == 0) goto L3d
            wf5 r4 = r12.l0
            if (r4 == 0) goto L3d
            android.view.View r4 = r12.getFocusedChild()
            goto L3e
        L3d:
            r4 = r6
        L3e:
            if (r4 != 0) goto L41
            goto L4c
        L41:
            android.view.View r4 = r12.E(r4)
            if (r4 != 0) goto L48
            goto L4c
        L48:
            wg5 r6 = r12.M(r4)
        L4c:
            r7 = -1
            r4 = -1
            if (r6 != 0) goto L58
            r0.m = r7
            r0.l = r4
            r0.n = r4
            goto La5
        L58:
            wf5 r9 = r12.l0
            boolean r9 = r9.b
            if (r9 == 0) goto L60
            long r7 = r6.e
        L60:
            r0.m = r7
            boolean r7 = r12.C0
            if (r7 == 0) goto L68
        L66:
            r7 = r4
            goto L7a
        L68:
            boolean r7 = r6.h()
            if (r7 == 0) goto L71
            int r7 = r6.d
            goto L7a
        L71:
            androidx.recyclerview.widget.RecyclerView r7 = r6.r
            if (r7 != 0) goto L76
            goto L66
        L76:
            int r7 = r7.K(r6)
        L7a:
            r0.l = r7
            android.view.View r6 = r6.a
            int r7 = r6.getId()
        L82:
            boolean r8 = r6.isFocused()
            if (r8 != 0) goto La3
            boolean r8 = r6 instanceof android.view.ViewGroup
            if (r8 == 0) goto La3
            boolean r8 = r6.hasFocus()
            if (r8 == 0) goto La3
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r6 = r6.getFocusedChild()
            int r8 = r6.getId()
            if (r8 == r4) goto L82
            int r7 = r6.getId()
            goto L82
        La3:
            r0.n = r7
        La5:
            boolean r6 = r0.j
            if (r6 == 0) goto Laf
            boolean r6 = r12.h1
            if (r6 == 0) goto Laf
            r6 = r1
            goto Lb0
        Laf:
            r6 = r2
        Lb0:
            r0.h = r6
            r12.h1 = r2
            r12.g1 = r2
            boolean r6 = r0.k
            r0.g = r6
            wf5 r6 = r12.l0
            int r6 = r6.a()
            r0.e = r6
            int[] r6 = r12.l1
            r12.G(r6)
            boolean r6 = r0.j
            dk0 r7 = r12.e0
            if (r6 == 0) goto L13f
            int r6 = r7.q()
            r8 = r2
        Ld2:
            if (r8 >= r6) goto L13f
            android.view.View r9 = r7.p(r8)
            wg5 r9 = N(r9)
            boolean r10 = r9.o()
            if (r10 != 0) goto L13c
            boolean r10 = r9.f()
            if (r10 == 0) goto Lef
            wf5 r10 = r12.l0
            boolean r10 = r10.b
            if (r10 != 0) goto Lef
            goto L13c
        Lef:
            cg5 r10 = r12.L0
            defpackage.cg5.b(r9)
            r9.c()
            r10.getClass()
            dy7 r10 = new dy7
            r10.<init>()
            r10.b(r9)
            java.lang.Object r11 = r5.get(r9)
            lo7 r11 = (defpackage.lo7) r11
            if (r11 != 0) goto L111
            lo7 r11 = defpackage.lo7.a()
            r5.put(r9, r11)
        L111:
            r11.b = r10
            int r10 = r11.a
            r10 = r10 | 4
            r11.a = r10
            boolean r10 = r0.h
            if (r10 == 0) goto L13c
            boolean r10 = r9.k()
            if (r10 == 0) goto L13c
            boolean r10 = r9.h()
            if (r10 != 0) goto L13c
            boolean r10 = r9.o()
            if (r10 != 0) goto L13c
            boolean r10 = r9.f()
            if (r10 != 0) goto L13c
            long r10 = r12.L(r9)
            r3.f(r10, r9)
        L13c:
            int r8 = r8 + 1
            goto Ld2
        L13f:
            boolean r3 = r0.k
            r6 = 2
            if (r3 == 0) goto L1f2
            int r3 = r7.t()
            r8 = r2
        L149:
            if (r8 >= r3) goto L181
            android.view.View r9 = r7.s(r8)
            wg5 r9 = N(r9)
            boolean r10 = androidx.recyclerview.widget.RecyclerView.y1
            if (r10 == 0) goto L170
            int r10 = r9.c
            if (r10 != r4) goto L170
            boolean r10 = r9.h()
            if (r10 == 0) goto L162
            goto L170
        L162:
            java.lang.String r12 = r12.C()
            java.lang.String r0 = "view holder cannot have position -1 unless it is removed"
            java.lang.String r12 = r0.concat(r12)
            defpackage.i.m(r12)
            return
        L170:
            boolean r10 = r9.o()
            if (r10 != 0) goto L17e
            int r10 = r9.d
            if (r10 != r4) goto L17e
            int r10 = r9.c
            r9.d = r10
        L17e:
            int r8 = r8 + 1
            goto L149
        L181:
            boolean r3 = r0.f
            r0.f = r2
            gg5 r4 = r12.m0
            mg5 r8 = r12.L
            r4.d0(r8, r0)
            r0.f = r3
            r3 = r2
        L18f:
            int r4 = r7.q()
            if (r3 >= r4) goto L1ee
            android.view.View r4 = r7.p(r3)
            wg5 r4 = N(r4)
            boolean r8 = r4.o()
            if (r8 == 0) goto L1a4
            goto L1eb
        L1a4:
            java.lang.Object r8 = r5.get(r4)
            lo7 r8 = (defpackage.lo7) r8
            if (r8 == 0) goto L1b3
            int r8 = r8.a
            r8 = r8 & 4
            if (r8 == 0) goto L1b3
            goto L1eb
        L1b3:
            defpackage.cg5.b(r4)
            int r8 = r4.j
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto L1be
            r8 = r1
            goto L1bf
        L1be:
            r8 = r2
        L1bf:
            cg5 r9 = r12.L0
            r4.c()
            r9.getClass()
            dy7 r9 = new dy7
            r9.<init>()
            r9.b(r4)
            if (r8 == 0) goto L1d5
            r12.a0(r4, r9)
            goto L1eb
        L1d5:
            java.lang.Object r8 = r5.get(r4)
            lo7 r8 = (defpackage.lo7) r8
            if (r8 != 0) goto L1e4
            lo7 r8 = defpackage.lo7.a()
            r5.put(r4, r8)
        L1e4:
            int r4 = r8.a
            r4 = r4 | r6
            r8.a = r4
            r8.b = r9
        L1eb:
            int r3 = r3 + 1
            goto L18f
        L1ee:
            r12.m()
            goto L1f5
        L1f2:
            r12.m()
        L1f5:
            r12.V(r1)
            r12.n0(r2)
            r0.d = r6
            return
    }

    public final void u() {
            r5 = this;
            r5.l0()
            r5.U()
            r0 = 6
            sg5 r1 = r5.d1
            r1.a(r0)
            z9 r0 = r5.d0
            r0.d()
            wf5 r0 = r5.l0
            int r0 = r0.a()
            r1.e = r0
            r0 = 0
            r1.c = r0
            pg5 r2 = r5.R
            r3 = 1
            if (r2 == 0) goto L43
            wf5 r2 = r5.l0
            vf5 r4 = r2.c
            int r4 = r4.ordinal()
            if (r4 == r3) goto L2f
            r2 = 2
            if (r4 == r2) goto L43
            goto L35
        L2f:
            int r2 = r2.a()
            if (r2 <= 0) goto L43
        L35:
            pg5 r2 = r5.R
            android.os.Parcelable r2 = r2.L
            if (r2 == 0) goto L40
            gg5 r4 = r5.m0
            r4.f0(r2)
        L40:
            r2 = 0
            r5.R = r2
        L43:
            r1.g = r0
            gg5 r2 = r5.m0
            mg5 r4 = r5.L
            r2.d0(r4, r1)
            r1.f = r0
            boolean r2 = r1.j
            if (r2 == 0) goto L58
            cg5 r2 = r5.L0
            if (r2 == 0) goto L58
            r2 = r3
            goto L59
        L58:
            r2 = r0
        L59:
            r1.j = r2
            r2 = 4
            r1.d = r2
            r5.V(r3)
            r5.n0(r0)
            return
    }

    public final boolean v(int r1, int r2, int r3, int[] r4, int[] r5) {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            boolean r0 = r0.c(r1, r2, r3, r4, r5)
            return r0
    }

    public final void w(int r1, int r2, int r3, int r4, int[] r5, int r6, int[] r7) {
            r0 = this;
            je4 r0 = r0.getScrollingChildHelper()
            r0.d(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final void x(int r5, int r6) {
            r4 = this;
            int r0 = r4.F0
            int r0 = r0 + 1
            r4.F0 = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            jg5 r0 = r4.e1
            if (r0 == 0) goto L1c
            r0.b(r4, r5, r6)
        L1c:
            java.util.ArrayList r0 = r4.f1
            if (r0 == 0) goto L36
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L36
            java.util.ArrayList r1 = r4.f1
            java.lang.Object r1 = r1.get(r0)
            jg5 r1 = (defpackage.jg5) r1
            r1.b(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L26
        L36:
            int r5 = r4.F0
            int r5 = r5 + (-1)
            r4.F0 = r5
            return
    }

    public final void y() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.K0
            if (r0 == 0) goto L5
            return
        L5:
            bg5 r0 = r4.G0
            tg5 r0 = (defpackage.tg5) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.K0 = r0
            boolean r1 = r4.g0
            if (r1 == 0) goto L3b
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            r0.setSize(r1, r2)
            return
        L3b:
            int r1 = r4.getMeasuredWidth()
            int r4 = r4.getMeasuredHeight()
            r0.setSize(r1, r4)
            return
    }

    public final void z() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.H0
            if (r0 == 0) goto L5
            return
        L5:
            bg5 r0 = r4.G0
            tg5 r0 = (defpackage.tg5) r0
            r0.getClass()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.H0 = r0
            boolean r1 = r4.g0
            if (r1 == 0) goto L3b
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r4 = r4.getPaddingRight()
            int r2 = r2 - r4
            r0.setSize(r1, r2)
            return
        L3b:
            int r1 = r4.getMeasuredHeight()
            int r4 = r4.getMeasuredWidth()
            r0.setSize(r1, r4)
            return
    }
}
