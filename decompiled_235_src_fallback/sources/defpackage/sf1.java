package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf1  reason: default package */
/* loaded from: classes.dex */
public final class sf1 extends defpackage.np2 {
    public final java.lang.Object e;
    public final java.util.concurrent.ExecutorService f;
    public volatile android.os.Handler g;

    public sf1() {
            r2 = this;
            r0 = 24
            r2.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.e = r0
            ff0 r0 = new ff0
            r1 = 1
            r0.<init>(r1)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.f = r0
            return
    }

    public static android.os.Handler l0(android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = defpackage.pp.a(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            return r0
        L35:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
        L3b:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }
}
