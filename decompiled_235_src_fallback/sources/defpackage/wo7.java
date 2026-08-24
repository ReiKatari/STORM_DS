package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo7  reason: default package */
/* loaded from: classes.dex */
public final class wo7 extends defpackage.zo7 {
    public static defpackage.wo7 c;
    public static final defpackage.vo7 d = null;
    public final android.app.Application b;

    static {
            vo7 r0 = new vo7
            r0.<init>()
            defpackage.wo7.d = r0
            return
    }

    public wo7(android.app.Application r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // defpackage.zo7, defpackage.yo7
    public final defpackage.qo7 a(java.lang.Class r2) {
            r1 = this;
            android.app.Application r0 = r1.b
            if (r0 == 0) goto L9
            qo7 r1 = r1.d(r2, r0)
            return r1
        L9:
            java.lang.String r1 = "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."
            defpackage.fa6.h(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.zo7, defpackage.yo7
    public final defpackage.qo7 b(java.lang.Class r2, defpackage.m94 r3) {
            r1 = this;
            android.app.Application r0 = r1.b
            if (r0 == 0) goto L9
            qo7 r1 = r1.a(r2)
            return r1
        L9:
            vo7 r0 = defpackage.wo7.d
            java.util.LinkedHashMap r3 = r3.a
            java.lang.Object r3 = r3.get(r0)
            android.app.Application r3 = (android.app.Application) r3
            if (r3 == 0) goto L1a
            qo7 r1 = r1.d(r2, r3)
            return r1
        L1a:
            java.lang.Class<ym> r1 = defpackage.ym.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L27
            qo7 r1 = defpackage.nj2.k(r2)
            return r1
        L27:
            java.lang.String r1 = "CreationExtras must have an application by `APPLICATION_KEY`"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    public final defpackage.qo7 d(java.lang.Class r3, android.app.Application r4) {
            r2 = this;
            java.lang.String r2 = "Cannot create an instance of "
            java.lang.Class<ym> r0 = defpackage.ym.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L3b
            r0 = 0
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L25 java.lang.IllegalAccessException -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L25 java.lang.IllegalAccessException -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L25 java.lang.IllegalAccessException -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.Object r4 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L25 java.lang.IllegalAccessException -> L27 java.lang.NoSuchMethodException -> L29
            qo7 r4 = (defpackage.qo7) r4     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L25 java.lang.IllegalAccessException -> L27 java.lang.NoSuchMethodException -> L29
            r4.getClass()
            return r4
        L23:
            r4 = move-exception
            goto L2b
        L25:
            r4 = move-exception
            goto L2f
        L27:
            r4 = move-exception
            goto L33
        L29:
            r4 = move-exception
            goto L37
        L2b:
            defpackage.u34.o(r2, r3, r4)
            return r0
        L2f:
            defpackage.u34.o(r2, r3, r4)
            return r0
        L33:
            defpackage.u34.o(r2, r3, r4)
            return r0
        L37:
            defpackage.u34.o(r2, r3, r4)
            return r0
        L3b:
            qo7 r2 = defpackage.nj2.k(r3)
            return r2
    }
}
