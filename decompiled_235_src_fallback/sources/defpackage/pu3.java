package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu3  reason: default package */
/* loaded from: classes.dex */
public abstract class pu3 {
    public static final java.util.HashMap a = null;
    public static final java.util.HashMap b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.pu3.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.pu3.b = r0
            return
    }

    public static void a(java.lang.reflect.Constructor r0, defpackage.gu3 r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            r0.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L18:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static int b(java.lang.Class r13) {
            java.util.HashMap r0 = defpackage.pu3.a
            java.lang.Object r1 = r0.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r13 = r1.intValue()
            return r13
        Lf:
            java.lang.String r1 = r13.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L18
            goto L131
        L18:
            r1 = 0
            java.lang.Package r3 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r4 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            r3.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r5 != 0) goto L34
            goto L40
        L34:
            r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r5 + r2
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
        L40:
            r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r5 = "."
            java.lang.String r6 = "_"
            java.lang.String r4 = defpackage.xs6.e0(r4, r5, r6)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r5 = "_LifecycleAdapter"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r5 != 0) goto L58
            goto L6c
        L58:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r3 = 46
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.append(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r4 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
        L6c:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r4 != 0) goto L8a
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            goto L8a
        L82:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L89:
            r3 = r1
        L8a:
            r4 = 2
            java.util.HashMap r5 = defpackage.pu3.b
            if (r3 == 0) goto L99
            java.util.List r1 = defpackage.hf.b0(r3)
            r5.put(r13, r1)
        L96:
            r2 = r4
            goto L131
        L99:
            fr0 r3 = defpackage.fr0.c
            java.util.HashMap r6 = r3.b
            java.lang.Object r7 = r6.get(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            if (r7 == 0) goto Lab
            boolean r3 = r7.booleanValue()
            goto Lcd
        Lab:
            java.lang.reflect.Method[] r7 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L139
            int r9 = r7.length
            r10 = r8
        Lb1:
            if (r10 >= r9) goto Lc7
            r11 = r7[r10]
            java.lang.Class<ql4> r12 = defpackage.ql4.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            ql4 r11 = (defpackage.ql4) r11
            if (r11 == 0) goto Lc4
            r3.a(r13, r7)
            r3 = r2
            goto Lcd
        Lc4:
            int r10 = r10 + 1
            goto Lb1
        Lc7:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.put(r13, r3)
            r3 = r8
        Lcd:
            if (r3 == 0) goto Ld0
            goto L131
        Ld0:
            java.lang.Class r3 = r13.getSuperclass()
            java.lang.Class<gu3> r6 = defpackage.gu3.class
            if (r3 == 0) goto Lf6
            boolean r7 = r6.isAssignableFrom(r3)
            if (r7 == 0) goto Lf6
            r3.getClass()
            int r1 = b(r3)
            if (r1 != r2) goto Le8
            goto L131
        Le8:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r5.get(r3)
            r3.getClass()
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
        Lf6:
            java.lang.Class[] r3 = r13.getInterfaces()
            r3.getClass()
            int r7 = r3.length
        Lfe:
            if (r8 >= r7) goto L12a
            r9 = r3[r8]
            if (r9 == 0) goto L127
            boolean r10 = r6.isAssignableFrom(r9)
            if (r10 == 0) goto L127
            r9.getClass()
            int r10 = b(r9)
            if (r10 != r2) goto L114
            goto L131
        L114:
            if (r1 != 0) goto L11b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L11b:
            java.lang.Object r9 = r5.get(r9)
            r9.getClass()
            java.util.Collection r9 = (java.util.Collection) r9
            r1.addAll(r9)
        L127:
            int r8 = r8 + 1
            goto Lfe
        L12a:
            if (r1 == 0) goto L131
            r5.put(r13, r1)
            goto L96
        L131:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            return r2
        L139:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r13)
            throw r0
    }
}
