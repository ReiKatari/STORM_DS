package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs  reason: default package */
/* loaded from: classes.dex */
public final class xs implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final java.lang.String B;
    public java.lang.reflect.Method L;
    public android.content.Context R;

    public xs(android.view.View r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.L
            if (r0 != 0) goto L7b
            android.view.View r0 = r5.A
            android.content.Context r1 = r0.getContext()
        La:
            java.lang.String r2 = r5.B
            if (r1 == 0) goto L36
            boolean r3 = r1.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L29
            if (r3 != 0) goto L29
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L29
            if (r2 == 0) goto L29
            r5.L = r2     // Catch: java.lang.NoSuchMethodException -> L29
            r5.R = r1     // Catch: java.lang.NoSuchMethodException -> L29
            goto L7b
        L29:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L34
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto La
        L34:
            r1 = 0
            goto La
        L36:
            int r5 = r0.getId()
            r6 = -1
            if (r5 != r6) goto L40
            java.lang.String r5 = ""
            goto L5f
        L40:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = " with id '"
            r6.<init>(r1)
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r5 = r1.getResourceEntryName(r5)
            r6.append(r5)
            java.lang.String r5 = "'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L5f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find method "
            java.lang.String r3 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
            java.lang.StringBuilder r1 = defpackage.i61.t(r1, r2, r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r6.<init>(r5)
            throw r6
        L7b:
            java.lang.reflect.Method r0 = r5.L     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.IllegalAccessException -> L90
            android.content.Context r5 = r5.R     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.IllegalAccessException -> L90
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.IllegalAccessException -> L90
            r0.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L87 java.lang.IllegalAccessException -> L90
            return
        L87:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
        L90:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute non-public method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
    }
}
