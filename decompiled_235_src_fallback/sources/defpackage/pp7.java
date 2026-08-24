package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp7  reason: default package */
/* loaded from: classes.dex */
public final class pp7 extends defpackage.qp7 {
    public boolean f;

    @Override // defpackage.qp7
    public final void c(android.view.View r6, float r7) {
            r5 = this;
            java.lang.String r0 = "unable to setProgress"
            java.lang.String r1 = "ViewSpline"
            boolean r2 = r6 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r2 == 0) goto L12
            androidx.constraintlayout.motion.widget.MotionLayout r6 = (androidx.constraintlayout.motion.widget.MotionLayout) r6
            float r5 = r5.a(r7)
            r6.setProgress(r5)
            return
        L12:
            boolean r2 = r5.f
            if (r2 == 0) goto L17
            goto L49
        L17:
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.String r3 = "setProgress"
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L2c
        L28:
            r2 = 1
            r5.f = r2
            r2 = 0
        L2c:
            if (r2 == 0) goto L49
            float r5 = r5.a(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
            r2.invoke(r6, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
            goto L49
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            goto L46
        L42:
            android.util.Log.e(r1, r0, r5)
            goto L49
        L46:
            android.util.Log.e(r1, r0, r5)
        L49:
            return
    }
}
