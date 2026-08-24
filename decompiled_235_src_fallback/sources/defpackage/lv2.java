package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv2  reason: default package */
/* loaded from: classes.dex */
public abstract class lv2 {
    public static final /* synthetic */ int a = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
            jv2 r0 = new jv2     // Catch: java.lang.Throwable -> Le
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Le
            android.os.Handler r1 = b(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L15:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            jv2 r0 = (defpackage.jv2) r0
            return
    }

    public static final void a(defpackage.rj0 r2) {
            android.view.Choreographer r0 = defpackage.lv2.choreographer
            if (r0 != 0) goto Ld
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.getClass()
            defpackage.lv2.choreographer = r0
        Ld:
            kv2 r1 = new kv2
            r1.<init>(r2)
            r0.postFrameCallback(r1)
            return
    }

    public static final android.os.Handler b(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            java.lang.Class<android.os.Handler> r4 = android.os.Handler.class
            if (r0 < r1) goto L23
            java.lang.String r0 = "createAsync"
            java.lang.Class[] r1 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object r5 = r0.invoke(r2, r5)
            r5.getClass()
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L23:
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L44
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Class<android.os.Handler$Callback> r1 = android.os.Handler.Callback.class
            r3 = 1
            r0[r3] = r1     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L44
            r3 = 2
            r0[r3] = r1     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.reflect.Constructor r0 = r4.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r1}
            java.lang.Object r5 = r0.newInstance(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L44:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            return r0
    }

    public static final java.lang.Object c(defpackage.m7 r4) {
            android.view.Choreographer r0 = defpackage.lv2.choreographer
            r1 = 1
            if (r0 == 0) goto L20
            rj0 r2 = new rj0
            r41 r4 = defpackage.np2.V(r4)
            r2.<init>(r1, r4)
            r2.v()
            kv2 r4 = new kv2
            r4.<init>(r2)
            r0.postFrameCallback(r4)
            java.lang.Object r4 = r2.s()
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            return r4
        L20:
            rj0 r0 = new rj0
            r41 r4 = defpackage.np2.V(r4)
            r0.<init>(r1, r4)
            r0.v()
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r4 != r1) goto L3a
            a(r0)
            goto L4a
        L3a:
            xe1 r4 = defpackage.xk1.a
            jv2 r4 = defpackage.e04.a
            l61 r1 = r0.X
            g15 r2 = new g15
            r3 = 12
            r2.<init>(r0, r3)
            r4.j0(r1, r2)
        L4a:
            java.lang.Object r4 = r0.s()
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            return r4
    }
}
