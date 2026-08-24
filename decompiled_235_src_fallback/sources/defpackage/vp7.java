package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp7  reason: default package */
/* loaded from: classes.dex */
public final class vp7 extends defpackage.wp7 {
    public boolean k;

    @Override // defpackage.wp7
    public final boolean d(float r6, long r7, defpackage.ng3 r9, android.view.View r10) {
            r5 = this;
            java.lang.String r1 = "unable to setProgress"
            java.lang.String r2 = "ViewTimeCycle"
            boolean r0 = r10 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r0 == 0) goto L13
            r0 = r10
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            float r6 = r5.b(r6, r7, r9, r10)
            r0.setProgress(r6)
            goto L4d
        L13:
            boolean r0 = r5.k
            if (r0 == 0) goto L19
            r5 = 0
            return r5
        L19:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.String r3 = "setProgress"
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2a
            goto L2e
        L2a:
            r0 = 1
            r5.k = r0
            r0 = 0
        L2e:
            if (r0 == 0) goto L4d
            float r6 = r5.b(r6, r7, r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L43
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L43
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L43
            r0.invoke(r10, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L43
            goto L4d
        L40:
            r0 = move-exception
            r6 = r0
            goto L46
        L43:
            r0 = move-exception
            r6 = r0
            goto L4a
        L46:
            android.util.Log.e(r2, r1, r6)
            goto L4d
        L4a:
            android.util.Log.e(r2, r1, r6)
        L4d:
            boolean r5 = r5.h
            return r5
    }
}
