package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lh  reason: default package */
/* loaded from: classes.dex */
public final class lh extends defpackage.r0 implements defpackage.o61 {
    private volatile java.lang.Object _preHandler;

    public lh() {
            r1 = this;
            cs1 r0 = defpackage.cs1.Z
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    @Override // defpackage.o61
    public final void u(defpackage.l61 r3, java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r3) goto L4a
            r0 = 28
            if (r3 >= r0) goto L4a
            java.lang.Object r3 = r2._preHandler
            r0 = 0
            if (r3 == r2) goto L12
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L32
        L12:
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2f
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r3 = r0
        L30:
            r2._preHandler = r3
        L32:
            if (r3 == 0) goto L39
            java.lang.Object r2 = r3.invoke(r0, r0)
            goto L3a
        L39:
            r2 = r0
        L3a:
            boolean r3 = r2 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r3 == 0) goto L41
            r0 = r2
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L41:
            if (r0 == 0) goto L4a
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r0.uncaughtException(r2, r4)
        L4a:
            return
    }
}
