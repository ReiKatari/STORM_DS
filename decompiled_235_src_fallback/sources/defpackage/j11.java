package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j11  reason: default package */
/* loaded from: classes.dex */
public final class j11 {
    public boolean a;
    public java.lang.String b;
    public defpackage.i11 c;
    public int d;
    public float e;
    public java.lang.String f;
    public boolean g;
    public int h;

    public j11(defpackage.j11 r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = r2.b
            r1.b = r0
            i11 r2 = r2.c
            r1.c = r2
            r1.f(r3)
            return
    }

    public static void d(android.content.Context r12, android.content.res.XmlResourceParser r13, java.util.HashMap r14) {
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r13)
            int[] r0 = defpackage.e75.d
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r0)
            int r0 = r13.getIndexCount()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
            r6 = r5
        L14:
            if (r5 >= r0) goto Leb
            int r7 = r13.getIndex(r5)
            r8 = 1
            if (r7 != 0) goto L46
            java.lang.String r1 = r13.getString(r7)
            if (r1 == 0) goto Le7
            int r7 = r1.length()
            if (r7 <= 0) goto Le7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            char r9 = r1.charAt(r2)
            char r9 = java.lang.Character.toUpperCase(r9)
            r7.append(r9)
            java.lang.String r1 = r1.substring(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            goto Le7
        L46:
            r9 = 10
            if (r7 != r9) goto L51
            java.lang.String r1 = r13.getString(r7)
            r6 = r8
            goto Le7
        L51:
            if (r7 != r8) goto L5f
            boolean r3 = r13.getBoolean(r7, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            i11 r4 = defpackage.i11.BOOLEAN_TYPE
            goto Le7
        L5f:
            r9 = 3
            if (r7 != r9) goto L71
            i11 r3 = defpackage.i11.COLOR_TYPE
            int r4 = r13.getColor(r7, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L6c:
            r11 = r4
            r4 = r3
            r3 = r11
            goto Le7
        L71:
            r9 = 2
            if (r7 != r9) goto L7f
            i11 r3 = defpackage.i11.COLOR_DRAWABLE_TYPE
            int r4 = r13.getColor(r7, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L6c
        L7f:
            r9 = 7
            r10 = 0
            if (r7 != r9) goto L9a
            i11 r3 = defpackage.i11.DIMENSION_TYPE
            float r4 = r13.getDimension(r7, r10)
            android.content.res.Resources r7 = r12.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r4 = android.util.TypedValue.applyDimension(r8, r4, r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L6c
        L9a:
            r8 = 4
            if (r7 != r8) goto La8
            i11 r3 = defpackage.i11.DIMENSION_TYPE
            float r4 = r13.getDimension(r7, r10)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L6c
        La8:
            r8 = 5
            if (r7 != r8) goto Lb8
            i11 r3 = defpackage.i11.FLOAT_TYPE
            r4 = 2143289344(0x7fc00000, float:NaN)
            float r4 = r13.getFloat(r7, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L6c
        Lb8:
            r8 = 6
            r9 = -1
            if (r7 != r8) goto Lc7
            i11 r3 = defpackage.i11.INT_TYPE
            int r4 = r13.getInteger(r7, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L6c
        Lc7:
            r8 = 9
            if (r7 != r8) goto Ld2
            i11 r3 = defpackage.i11.STRING_TYPE
            java.lang.String r4 = r13.getString(r7)
            goto L6c
        Ld2:
            r8 = 8
            if (r7 != r8) goto Le7
            i11 r3 = defpackage.i11.REFERENCE_TYPE
            int r4 = r13.getResourceId(r7, r9)
            if (r4 != r9) goto Le2
            int r4 = r13.getInt(r7, r9)
        Le2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L6c
        Le7:
            int r5 = r5 + 1
            goto L14
        Leb:
            if (r1 == 0) goto L100
            if (r3 == 0) goto L100
            j11 r12 = new j11
            r12.<init>()
            r12.b = r1
            r12.c = r4
            r12.a = r6
            r12.f(r3)
            r14.put(r1, r12)
        L100:
            r13.recycle()
            return
    }

    public static void e(android.view.View r11, java.util.HashMap r12) {
            java.lang.String r0 = "\" not found on "
            java.lang.String r1 = " Custom Attribute \""
            java.lang.String r2 = "TransitionLayout"
            java.lang.Class r3 = r11.getClass()
            java.util.Set r4 = r12.keySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L147
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r12.get(r5)
            j11 r6 = (defpackage.j11) r6
            boolean r7 = r6.a
            if (r7 != 0) goto L2f
            java.lang.String r7 = "set"
            java.lang.String r7 = defpackage.i61.m(r7, r5)
            goto L30
        L2f:
            r7 = r5
        L30:
            i11 r8 = r6.c     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            int r8 = r8.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Class r9 = java.lang.Float.TYPE
            java.lang.Class r10 = java.lang.Integer.TYPE
            switch(r8) {
                case 0: goto Leb;
                case 1: goto Ld4;
                case 2: goto Lbd;
                case 3: goto La0;
                case 4: goto L8b;
                case 5: goto L73;
                case 6: goto L5d;
                case 7: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L12
        L3e:
            java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            int r6 = r6.d     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        L54:
            r6 = move-exception
            goto L102
        L57:
            r6 = move-exception
            goto L116
        L5a:
            r5 = move-exception
            goto L12a
        L5d:
            java.lang.Class[] r8 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            float r6 = r6.e     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        L73:
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            boolean r6 = r6.g     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        L8b:
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.String r6 = r6.f     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        La0:
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r9.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            int r6 = r6.h     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r9.setColor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        Lbd:
            java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            int r6 = r6.h     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        Ld4:
            java.lang.Class[] r8 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            float r6 = r6.e     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        Leb:
            java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            int r6 = r6.d     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            r8.invoke(r11, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L57 java.lang.NoSuchMethodException -> L5a
            goto L12
        L102:
            java.lang.StringBuilder r5 = defpackage.i61.t(r1, r5, r0)
            java.lang.String r7 = r3.getName()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5, r6)
            goto L12
        L116:
            java.lang.StringBuilder r5 = defpackage.i61.t(r1, r5, r0)
            java.lang.String r7 = r3.getName()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5, r6)
            goto L12
        L12a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r3.getName()
            r6.append(r8)
            java.lang.String r8 = " must have a method "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r2, r6, r5)
            goto L12
        L147:
            return
    }

    public final float a() {
            r1 = this;
            i11 r0 = r1.c
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L26;
                case 1: goto L23;
                case 2: goto L1c;
                case 3: goto L1c;
                case 4: goto L15;
                case 5: goto Lc;
                case 6: goto L23;
                default: goto L9;
            }
        L9:
            r1 = 2143289344(0x7fc00000, float:NaN)
            return r1
        Lc:
            boolean r1 = r1.g
            if (r1 == 0) goto L13
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
        L13:
            r1 = 0
            return r1
        L15:
            java.lang.String r1 = "Cannot interpolate String"
            defpackage.u34.j(r1)
            r1 = 0
            return r1
        L1c:
            java.lang.String r1 = "Color does not have a single color to interpolate"
            defpackage.u34.j(r1)
            r1 = 0
            return r1
        L23:
            float r1 = r1.e
            return r1
        L26:
            int r1 = r1.d
            float r1 = (float) r1
            return r1
    }

    public final void b(float[] r10) {
            r9 = this;
            i11 r0 = r9.c
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 0: goto L63;
                case 1: goto L5e;
                case 2: goto L21;
                case 3: goto L21;
                case 4: goto L1b;
                case 5: goto L10;
                case 6: goto Lb;
                default: goto La;
            }
        La:
            return
        Lb:
            float r9 = r9.e
            r10[r1] = r9
            return
        L10:
            boolean r9 = r9.g
            if (r9 == 0) goto L17
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L18
        L17:
            r9 = 0
        L18:
            r10[r1] = r9
            return
        L1b:
            java.lang.String r9 = "Color does not have a single color to interpolate"
            defpackage.u34.j(r9)
            return
        L21:
            int r9 = r9.h
            int r0 = r9 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r9 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r9 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            r4 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r4
            double r5 = (double) r2
            r7 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r5 = java.lang.Math.pow(r5, r7)
            float r2 = (float) r5
            float r3 = (float) r3
            float r3 = r3 / r4
            double r5 = (double) r3
            double r5 = java.lang.Math.pow(r5, r7)
            float r3 = (float) r5
            float r9 = (float) r9
            float r9 = r9 / r4
            double r5 = (double) r9
            double r5 = java.lang.Math.pow(r5, r7)
            float r9 = (float) r5
            r10[r1] = r2
            r1 = 1
            r10[r1] = r3
            r1 = 2
            r10[r1] = r9
            float r9 = (float) r0
            float r9 = r9 / r4
            r0 = 3
            r10[r0] = r9
            return
        L5e:
            float r9 = r9.e
            r10[r1] = r9
            return
        L63:
            int r9 = r9.d
            float r9 = (float) r9
            r10[r1] = r9
            return
    }

    public final int c() {
            r1 = this;
            i11 r1 = r1.c
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto Le
            r0 = 3
            if (r1 == r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 4
            return r1
    }

    public final void f(java.lang.Object r2) {
            r1 = this;
            i11 r0 = r1.c
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2a;
                case 2: goto L21;
                case 3: goto L21;
                case 4: goto L1c;
                case 5: goto L13;
                case 6: goto La;
                case 7: goto L33;
                default: goto L9;
            }
        L9:
            return
        La:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.e = r2
            return
        L13:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.g = r2
            return
        L1c:
            java.lang.String r2 = (java.lang.String) r2
            r1.f = r2
            return
        L21:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.h = r2
            return
        L2a:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.e = r2
            return
        L33:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.d = r2
            return
    }
}
