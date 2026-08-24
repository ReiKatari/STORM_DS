package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr0  reason: default package */
/* loaded from: classes.dex */
public final class fr0 {
    public static final defpackage.fr0 c = null;
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    static {
            fr0 r0 = new fr0
            r0.<init>()
            defpackage.fr0.c = r0
            return
    }

    public fr0() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static void b(java.util.HashMap r3, defpackage.er0 r4, defpackage.st3 r5, java.lang.Class r6) {
            java.lang.Object r0 = r3.get(r4)
            st3 r0 = (defpackage.st3) r0
            if (r0 == 0) goto L41
            if (r5 != r0) goto Lb
            goto L41
        Lb:
            java.lang.reflect.Method r3 = r4.b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = " already declared with different @OnLifecycleEvent value: previous value "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", new value "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L41:
            if (r0 != 0) goto L46
            r3.put(r4, r5)
        L46:
            return
    }

    public final defpackage.dr0 a(java.lang.Class r14, java.lang.reflect.Method[] r15) {
            r13 = this;
            java.lang.Class r0 = r14.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.util.HashMap r3 = r13.a
            if (r0 == 0) goto L20
            java.lang.Object r4 = r3.get(r0)
            dr0 r4 = (defpackage.dr0) r4
            if (r4 == 0) goto L17
            goto L1b
        L17:
            dr0 r4 = r13.a(r0, r2)
        L1b:
            java.util.HashMap r0 = r4.b
            r1.putAll(r0)
        L20:
            java.lang.Class[] r0 = r14.getInterfaces()
            int r4 = r0.length
            r5 = 0
            r6 = r5
        L27:
            if (r6 >= r4) goto L61
            r7 = r0[r6]
            java.lang.Object r8 = r3.get(r7)
            dr0 r8 = (defpackage.dr0) r8
            if (r8 == 0) goto L34
            goto L38
        L34:
            dr0 r8 = r13.a(r7, r2)
        L38:
            java.util.HashMap r7 = r8.b
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            er0 r9 = (defpackage.er0) r9
            java.lang.Object r8 = r8.getValue()
            st3 r8 = (defpackage.st3) r8
            b(r1, r9, r8, r14)
            goto L42
        L5e:
            int r6 = r6 + 1
            goto L27
        L61:
            if (r15 == 0) goto L64
            goto L68
        L64:
            java.lang.reflect.Method[] r15 = r14.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> Le0
        L68:
            int r0 = r15.length
            r4 = r5
            r6 = r4
        L6b:
            if (r4 >= r0) goto Lce
            r7 = r15[r4]
            java.lang.Class<ql4> r8 = defpackage.ql4.class
            java.lang.annotation.Annotation r8 = r7.getAnnotation(r8)
            ql4 r8 = (defpackage.ql4) r8
            if (r8 != 0) goto L7a
            goto Lc5
        L7a:
            java.lang.Class[] r6 = r7.getParameterTypes()
            int r9 = r6.length
            r10 = 1
            if (r9 <= 0) goto L94
            java.lang.Class<hu3> r9 = defpackage.hu3.class
            r11 = r6[r5]
            boolean r9 = r9.isAssignableFrom(r11)
            if (r9 == 0) goto L8e
            r9 = r10
            goto L95
        L8e:
            java.lang.String r13 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            defpackage.i.h(r13)
            return r2
        L94:
            r9 = r5
        L95:
            st3 r8 = r8.value()
            int r11 = r6.length
            r12 = 2
            if (r11 <= r10) goto Lb9
            java.lang.Class<st3> r9 = defpackage.st3.class
            r11 = r6[r10]
            boolean r9 = r9.isAssignableFrom(r11)
            if (r9 == 0) goto Lb3
            st3 r9 = defpackage.st3.ON_ANY
            if (r8 != r9) goto Lad
            r9 = r12
            goto Lb9
        Lad:
            java.lang.String r13 = "Second arg is supported only for ON_ANY value"
            defpackage.i.h(r13)
            return r2
        Lb3:
            java.lang.String r13 = "invalid parameter type. second arg must be an event"
            defpackage.i.h(r13)
            return r2
        Lb9:
            int r6 = r6.length
            if (r6 > r12) goto Lc8
            er0 r6 = new er0
            r6.<init>(r7, r9)
            b(r1, r6, r8, r14)
            r6 = r10
        Lc5:
            int r4 = r4 + 1
            goto L6b
        Lc8:
            java.lang.String r13 = "cannot have more than 2 params"
            defpackage.i.h(r13)
            return r2
        Lce:
            dr0 r15 = new dr0
            r15.<init>(r1)
            r3.put(r14, r15)
            java.util.HashMap r13 = r13.b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r13.put(r14, r0)
            return r15
        Le0:
            r13 = move-exception
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r14.<init>(r15, r13)
            throw r14
    }
}
