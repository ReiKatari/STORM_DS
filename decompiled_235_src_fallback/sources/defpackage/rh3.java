package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh3  reason: default package */
/* loaded from: classes.dex */
public final class rh3 extends defpackage.jg3 {
    public float e;
    public int f;
    public int g;
    public int h;
    public android.graphics.RectF i;
    public android.graphics.RectF j;
    public java.util.HashMap k;
    public java.lang.String l;
    public int m;
    public java.lang.String n;
    public java.lang.String o;
    public int p;
    public int q;
    public android.view.View r;
    public boolean s;
    public boolean t;
    public boolean u;
    public float v;
    public float w;
    public boolean x;

    public rh3() {
            r2 = this;
            r2.<init>()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.e = r0
            r0 = -1
            r2.f = r0
            r2.g = r0
            r2.h = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.i = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.j = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.k = r1
            r1 = 0
            r2.l = r1
            r2.m = r0
            r2.n = r1
            r2.o = r1
            r2.p = r0
            r2.q = r0
            r2.r = r1
            r0 = 1
            r2.s = r0
            r2.t = r0
            r2.u = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.v = r0
            r0 = 0
            r2.x = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.d = r0
            return
    }

    public static void i(android.graphics.RectF r1, android.view.View r2, boolean r3) {
            int r0 = r2.getTop()
            float r0 = (float) r0
            r1.top = r0
            int r0 = r2.getBottom()
            float r0 = (float) r0
            r1.bottom = r0
            int r0 = r2.getLeft()
            float r0 = (float) r0
            r1.left = r0
            int r0 = r2.getRight()
            float r0 = (float) r0
            r1.right = r0
            if (r3 == 0) goto L25
            android.graphics.Matrix r2 = r2.getMatrix()
            r2.mapRect(r1)
        L25:
            return
    }

    @Override // defpackage.jg3
    public final void a(java.util.HashMap r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.jg3
    public final defpackage.jg3 b() {
            r2 = this;
            rh3 r0 = new rh3
            r0.<init>()
            super.c(r2)
            java.lang.String r1 = r2.l
            r0.l = r1
            int r1 = r2.m
            r0.m = r1
            java.lang.String r1 = r2.n
            r0.n = r1
            java.lang.String r1 = r2.o
            r0.o = r1
            int r1 = r2.p
            r0.p = r1
            int r1 = r2.q
            r0.q = r1
            android.view.View r1 = r2.r
            r0.r = r1
            float r1 = r2.e
            r0.e = r1
            boolean r1 = r2.s
            r0.s = r1
            boolean r1 = r2.t
            r0.t = r1
            boolean r1 = r2.u
            r0.u = r1
            float r1 = r2.v
            r0.v = r1
            float r1 = r2.w
            r0.w = r1
            boolean r1 = r2.x
            r0.x = r1
            android.graphics.RectF r1 = r2.i
            r0.i = r1
            android.graphics.RectF r1 = r2.j
            r0.j = r1
            java.util.HashMap r2 = r2.k
            r0.k = r2
            return r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            jg3 r0 = r0.b()
            return r0
    }

    @Override // defpackage.jg3
    public final void d(java.util.HashSet r1) {
            r0 = this;
            return
    }

    @Override // defpackage.jg3
    public final void e(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = defpackage.e75.i
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            android.util.SparseIntArray r7 = defpackage.qh3.a
            int r7 = r6.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r7) goto Le7
            int r1 = r6.getIndex(r0)
            android.util.SparseIntArray r2 = defpackage.qh3.a
            int r3 = r2.get(r1)
            switch(r3) {
                case 1: goto Ldd;
                case 2: goto Ld6;
                case 3: goto L1c;
                case 4: goto Lcf;
                case 5: goto Lc6;
                case 6: goto Lbd;
                case 7: goto L8e;
                case 8: goto L7c;
                case 9: goto L73;
                case 10: goto L69;
                case 11: goto L5f;
                case 12: goto L55;
                case 13: goto L4b;
                case 14: goto L41;
                default: goto L1c;
            }
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unused attribute 0x"
            r3.<init>(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
            r3.append(r4)
            java.lang.String r4 = "   "
            r3.append(r4)
            int r1 = r2.get(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "KeyTrigger"
            android.util.Log.e(r2, r1)
            goto Le3
        L41:
            int r2 = r5.g
            int r1 = r6.getResourceId(r1, r2)
            r5.g = r1
            goto Le3
        L4b:
            int r2 = r5.f
            int r1 = r6.getResourceId(r1, r2)
            r5.f = r1
            goto Le3
        L55:
            int r2 = r5.h
            int r1 = r6.getResourceId(r1, r2)
            r5.h = r1
            goto Le3
        L5f:
            int r2 = r5.m
            int r1 = r6.getResourceId(r1, r2)
            r5.m = r1
            goto Le3
        L69:
            boolean r2 = r5.x
            boolean r1 = r6.getBoolean(r1, r2)
            r5.x = r1
            goto Le3
        L73:
            int r2 = r5.q
            int r1 = r6.getResourceId(r1, r2)
            r5.q = r1
            goto Le3
        L7c:
            int r2 = r5.a
            int r1 = r6.getInteger(r1, r2)
            r5.a = r1
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r5.v = r1
            goto Le3
        L8e:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r2 == 0) goto La4
            int r2 = r5.b
            int r2 = r6.getResourceId(r1, r2)
            r5.b = r2
            r3 = -1
            if (r2 != r3) goto Le3
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto Le3
        La4:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto Lb4
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto Le3
        Lb4:
            int r2 = r5.b
            int r1 = r6.getResourceId(r1, r2)
            r5.b = r1
            goto Le3
        Lbd:
            int r2 = r5.p
            int r1 = r6.getResourceId(r1, r2)
            r5.p = r1
            goto Le3
        Lc6:
            float r2 = r5.e
            float r1 = r6.getFloat(r1, r2)
            r5.e = r1
            goto Le3
        Lcf:
            java.lang.String r1 = r6.getString(r1)
            r5.l = r1
            goto Le3
        Ld6:
            java.lang.String r1 = r6.getString(r1)
            r5.o = r1
            goto Le3
        Ldd:
            java.lang.String r1 = r6.getString(r1)
            r5.n = r1
        Le3:
            int r0 = r0 + 1
            goto Ld
        Le7:
            return
    }

    public final void g(android.view.View r11, float r12) {
            r10 = this;
            int r0 = r10.q
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == r3) goto L60
            android.view.View r0 = r10.r
            if (r0 != 0) goto L19
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r10.q
            android.view.View r0 = r0.findViewById(r4)
            r10.r = r0
        L19:
            android.graphics.RectF r0 = r10.i
            android.view.View r4 = r10.r
            boolean r5 = r10.x
            i(r0, r4, r5)
            android.graphics.RectF r0 = r10.j
            boolean r4 = r10.x
            i(r0, r11, r4)
            android.graphics.RectF r0 = r10.i
            android.graphics.RectF r4 = r10.j
            boolean r0 = r0.intersect(r4)
            boolean r4 = r10.s
            if (r0 == 0) goto L48
            if (r4 == 0) goto L3b
            r10.s = r2
            r0 = r1
            goto L3c
        L3b:
            r0 = r2
        L3c:
            boolean r4 = r10.u
            if (r4 == 0) goto L44
            r10.u = r2
            r4 = r1
            goto L45
        L44:
            r4 = r2
        L45:
            r10.t = r1
            goto L5d
        L48:
            if (r4 != 0) goto L4e
            r10.s = r1
            r0 = r1
            goto L4f
        L4e:
            r0 = r2
        L4f:
            boolean r4 = r10.t
            if (r4 == 0) goto L57
            r10.t = r2
            r4 = r1
            goto L58
        L57:
            r4 = r2
        L58:
            r10.u = r1
            r9 = r4
            r4 = r2
            r2 = r9
        L5d:
            r1 = r4
            goto Ld3
        L60:
            boolean r0 = r10.s
            float r4 = r10.v
            r5 = 0
            if (r0 == 0) goto L75
            float r0 = r12 - r4
            float r6 = r10.w
            float r6 = r6 - r4
            float r6 = r6 * r0
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L83
            r10.s = r2
            r0 = r1
            goto L84
        L75:
            float r0 = r12 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.e
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L83
            r10.s = r1
        L83:
            r0 = r2
        L84:
            boolean r4 = r10.t
            float r6 = r10.v
            if (r4 == 0) goto L9c
            float r4 = r12 - r6
            float r7 = r10.w
            float r7 = r7 - r6
            float r7 = r7 * r4
            int r6 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r6 >= 0) goto Laa
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Laa
            r10.t = r2
            r4 = r1
            goto Lab
        L9c:
            float r4 = r12 - r6
            float r4 = java.lang.Math.abs(r4)
            float r6 = r10.e
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto Laa
            r10.t = r1
        Laa:
            r4 = r2
        Lab:
            boolean r6 = r10.u
            float r7 = r10.v
            if (r6 == 0) goto Lc3
            float r6 = r12 - r7
            float r8 = r10.w
            float r8 = r8 - r7
            float r8 = r8 * r6
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 >= 0) goto Ld1
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto Ld1
            r10.u = r2
        Lc1:
            r2 = r4
            goto Ld3
        Lc3:
            float r5 = r12 - r7
            float r5 = java.lang.Math.abs(r5)
            float r6 = r10.e
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto Ld1
            r10.u = r1
        Ld1:
            r1 = r2
            goto Lc1
        Ld3:
            r10.w = r12
            if (r2 != 0) goto Ldb
            if (r0 != 0) goto Ldb
            if (r1 == 0) goto Le4
        Ldb:
            android.view.ViewParent r12 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = (androidx.constraintlayout.motion.widget.MotionLayout) r12
            r12.getClass()
        Le4:
            int r12 = r10.m
            if (r12 != r3) goto Lea
            r12 = r11
            goto Lf6
        Lea:
            android.view.ViewParent r12 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = (androidx.constraintlayout.motion.widget.MotionLayout) r12
            int r4 = r10.m
            android.view.View r12 = r12.findViewById(r4)
        Lf6:
            if (r2 == 0) goto L112
            java.lang.String r2 = r10.n
            if (r2 == 0) goto Lff
            r10.h(r12, r2)
        Lff:
            int r2 = r10.f
            if (r2 == r3) goto L112
            android.view.ViewParent r2 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            int r4 = r10.f
            android.view.View[] r5 = new android.view.View[]{r12}
            r2.B(r4, r5)
        L112:
            if (r1 == 0) goto L12e
            java.lang.String r1 = r10.o
            if (r1 == 0) goto L11b
            r10.h(r12, r1)
        L11b:
            int r1 = r10.g
            if (r1 == r3) goto L12e
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r2 = r10.g
            android.view.View[] r4 = new android.view.View[]{r12}
            r1.B(r2, r4)
        L12e:
            if (r0 == 0) goto L14a
            java.lang.String r0 = r10.l
            if (r0 == 0) goto L137
            r10.h(r12, r0)
        L137:
            int r0 = r10.h
            if (r0 == r3) goto L14a
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r10 = r10.h
            android.view.View[] r12 = new android.view.View[]{r12}
            r11.B(r10, r12)
        L14a:
            return
    }

    public final void h(android.view.View r13, java.lang.String r14) {
            r12 = this;
            if (r14 != 0) goto L4
            goto L17d
        L4:
            java.lang.String r0 = "."
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L16a
            int r0 = r14.length()
            r1 = 1
            if (r0 != r1) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != 0) goto L22
            java.lang.String r14 = r14.substring(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r1)
        L22:
            java.util.HashMap r1 = r12.d
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L17d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            if (r0 != 0) goto L46
            boolean r3 = r3.matches(r14)
            if (r3 == 0) goto L2c
        L46:
            java.util.HashMap r3 = r12.d
            java.lang.Object r2 = r3.get(r2)
            j11 r2 = (defpackage.j11) r2
            if (r2 == 0) goto L2c
            java.lang.String r3 = "\" not found on "
            java.lang.String r4 = " Custom Attribute \""
            java.lang.String r5 = "TransitionLayout"
            java.lang.Class r6 = r13.getClass()
            java.lang.String r7 = r2.b
            boolean r8 = r2.a
            if (r8 != 0) goto L67
            java.lang.String r8 = "set"
            java.lang.String r8 = defpackage.i61.m(r8, r7)
            goto L68
        L67:
            r8 = r7
        L68:
            i11 r9 = r2.c     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            int r9 = r9.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Class r11 = java.lang.Float.TYPE
            switch(r9) {
                case 0: goto L10e;
                case 1: goto Lf7;
                case 2: goto Le0;
                case 3: goto Lc3;
                case 4: goto Lae;
                case 5: goto L95;
                case 6: goto L76;
                case 7: goto L10e;
                default: goto L75;
            }
        L75:
            goto L2c
        L76:
            java.lang.Class[] r9 = new java.lang.Class[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            float r2 = r2.e     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        L8c:
            r2 = move-exception
            goto L125
        L8f:
            r2 = move-exception
            goto L139
        L92:
            r2 = move-exception
            goto L14d
        L95:
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            boolean r2 = r2.g     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        Lae:
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.String r2 = r2.f     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        Lc3:
            java.lang.Class<android.graphics.drawable.Drawable> r9 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r10.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            int r2 = r2.h     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r10.setColor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        Le0:
            java.lang.Class[] r9 = new java.lang.Class[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            int r2 = r2.h     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        Lf7:
            java.lang.Class[] r9 = new java.lang.Class[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            float r2 = r2.e     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        L10e:
            java.lang.Class[] r9 = new java.lang.Class[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.reflect.Method r9 = r6.getMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            int r2 = r2.d     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            r9.invoke(r13, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8f java.lang.NoSuchMethodException -> L92
            goto L2c
        L125:
            java.lang.StringBuilder r3 = defpackage.i61.t(r4, r7, r3)
            java.lang.String r4 = r6.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r5, r3, r2)
            goto L2c
        L139:
            java.lang.StringBuilder r3 = defpackage.i61.t(r4, r7, r3)
            java.lang.String r4 = r6.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r5, r3, r2)
            goto L2c
        L14d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.getName()
            r3.append(r4)
            java.lang.String r4 = " must have a method "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r5, r3, r2)
            goto L2c
        L16a:
            java.util.HashMap r0 = r12.k
            boolean r0 = r0.containsKey(r14)
            r1 = 0
            if (r0 == 0) goto L17e
            java.util.HashMap r0 = r12.k
            java.lang.Object r0 = r0.get(r14)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L17f
        L17d:
            return
        L17e:
            r0 = r1
        L17f:
            java.lang.String r2 = " "
            java.lang.String r3 = "\"on class "
            java.lang.String r4 = "KeyTrigger"
            if (r0 != 0) goto L1c4
            java.lang.Class r0 = r13.getClass()     // Catch: java.lang.NoSuchMethodException -> L195
            java.lang.reflect.Method r0 = r0.getMethod(r14, r1)     // Catch: java.lang.NoSuchMethodException -> L195
            java.util.HashMap r5 = r12.k     // Catch: java.lang.NoSuchMethodException -> L195
            r5.put(r14, r0)     // Catch: java.lang.NoSuchMethodException -> L195
            goto L1c4
        L195:
            java.util.HashMap r12 = r12.k
            r12.put(r14, r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find method \""
            r12.<init>(r0)
            r12.append(r14)
            r12.append(r3)
            java.lang.Class r14 = r13.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r12.append(r14)
            r12.append(r2)
            java.lang.String r13 = defpackage.lb4.y(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r4, r12)
            return
        L1c4:
            r0.invoke(r13, r1)     // Catch: java.lang.Exception -> L1c8
            return
        L1c8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in call \""
            r14.<init>(r0)
            java.lang.String r12 = r12.l
            r14.append(r12)
            r14.append(r3)
            java.lang.Class r12 = r13.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r14.append(r12)
            r14.append(r2)
            java.lang.String r12 = defpackage.lb4.y(r13)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            android.util.Log.e(r4, r12)
            return
    }
}
