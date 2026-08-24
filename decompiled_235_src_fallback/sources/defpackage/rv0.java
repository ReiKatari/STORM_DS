package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rv0 implements defpackage.o55 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ rv0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.o55
    public final java.lang.Object get() {
            r7 = this;
            int r0 = r7.a
            java.lang.Object r7 = r7.b
            switch(r0) {
                case 0: goto La;
                default: goto L7;
            }
        L7:
            tv0 r7 = (defpackage.tv0) r7
            return r7
        La:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.String r2 = " is not an instance of com.google.firebase.components.ComponentRegistrar"
            java.lang.String r3 = "Class "
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            java.lang.Class<tv0> r6 = defpackage.tv0.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            if (r6 == 0) goto L35
            java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            tv0 r2 = (defpackage.tv0) r2     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            r4 = r2
            goto L88
        L2d:
            r0 = move-exception
            goto L4a
        L2f:
            r0 = move-exception
            goto L54
        L31:
            r2 = move-exception
            goto L5e
        L33:
            r2 = move-exception
            goto L68
        L35:
            vb3 r5 = new vb3     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            r6.<init>(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            r6.append(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            r6.append(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            java.lang.String r2 = r6.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            r5.<init>(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
            throw r5     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.InstantiationException -> L31 java.lang.IllegalAccessException -> L33 java.lang.ClassNotFoundException -> L72
        L4a:
            vb3 r2 = new vb3
            java.lang.String r7 = defpackage.i61.m(r1, r7)
            r2.<init>(r7, r0)
            throw r2
        L54:
            vb3 r2 = new vb3
            java.lang.String r7 = defpackage.i61.m(r1, r7)
            r2.<init>(r7, r0)
            throw r2
        L5e:
            vb3 r3 = new vb3
            java.lang.String r7 = defpackage.lb1.A(r1, r7, r0)
            r3.<init>(r7, r2)
            throw r3
        L68:
            vb3 r3 = new vb3
            java.lang.String r7 = defpackage.lb1.A(r1, r7, r0)
            r3.<init>(r7, r2)
            throw r3
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r7)
            java.lang.String r7 = " is not an found."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ComponentDiscovery"
            android.util.Log.w(r0, r7)
        L88:
            return r4
    }
}
