package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i56  reason: default package */
/* loaded from: classes.dex */
public abstract class i56 {
    public static final java.util.List a = null;
    public static final java.util.List b = null;

    static {
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.Class<v46> r1 = defpackage.v46.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.i56.a = r0
            java.util.List r0 = defpackage.hf.b0(r1)
            defpackage.i56.b = r0
            return
    }

    public static final java.lang.reflect.Constructor a(java.lang.Class r6, java.util.List r7) {
            r7.getClass()
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L56
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            java.util.List r4 = defpackage.fv.T0(r4)
            boolean r5 = r7.equals(r4)
            if (r5 == 0) goto L22
            return r3
        L22:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L53
            boolean r3 = r4.containsAll(r7)
            if (r3 != 0) goto L33
            goto L53
        L33:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = r6.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L53:
            int r2 = r2 + 1
            goto Lc
        L56:
            r6 = 0
            return r6
    }

    public static final defpackage.qo7 b(java.lang.Class r2, java.lang.reflect.Constructor r3, java.lang.Object... r4) {
            r0 = 0
            int r1 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            qo7 r3 = (defpackage.qo7) r3     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            return r3
        Ld:
            r3 = move-exception
            goto L13
        Lf:
            r3 = move-exception
            goto L29
        L11:
            r3 = move-exception
            goto L42
        L13:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "An exception happened in constructor of "
            r4.<init>(r1)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Throwable r3 = r3.getCause()
            defpackage.u34.p(r2, r3)
            return r0
        L29:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L42:
            java.lang.String r4 = "Failed to access "
            defpackage.u34.o(r4, r2, r3)
            return r0
    }
}
