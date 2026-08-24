package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x36  reason: default package */
/* loaded from: classes.dex */
public final class x36 {
    public final java.lang.ClassLoader a;
    public final defpackage.e31 b;
    public final defpackage.e31 c;

    public x36(java.lang.ClassLoader r2, defpackage.e31 r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            e31 r3 = new e31
            r0 = 1
            r3.<init>(r2, r0)
            r1.c = r3
            return
    }

    public static final boolean d(defpackage.x36 r3) {
            java.lang.ClassLoader r3 = r3.a
            java.lang.String r0 = "androidx.window.extensions.layout.WindowLayoutComponent"
            java.lang.Class r3 = r3.loadClass(r0)
            r3.getClass()
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r1 = androidx.window.extensions.core.util.function.Consumer.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            java.lang.String r1 = "addWindowLayoutInfoListener"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r1 = androidx.window.extensions.core.util.function.Consumer.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "removeWindowLayoutInfoListener"
            java.lang.reflect.Method r3 = r3.getMethod(r2, r1)
            r0.getClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L41
            r3.getClass()
            int r3 = r3.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 == 0) goto L41
            r3 = 1
            return r3
        L41:
            r3 = 0
            return r3
    }

    public final androidx.window.extensions.layout.WindowLayoutComponent a() {
            r4 = this;
            e31 r0 = r4.c
            r0.getClass()
            r1 = 0
            java.lang.ClassLoader r2 = r0.a     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "androidx.window.extensions.WindowExtensionsProvider"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.Throwable -> L82
            r2.getClass()     // Catch: java.lang.Throwable -> L82
            er2 r2 = new er2
            r3 = 27
            r2.<init>(r0, r3)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r0 = defpackage.xk2.L(r0, r2)
            if (r0 == 0) goto L82
            w36 r0 = new w36
            r0.<init>(r4, r1)
            java.lang.String r2 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = defpackage.xk2.L(r2, r0)
            if (r0 == 0) goto L82
            w36 r0 = new w36
            r2 = 1
            r0.<init>(r4, r2)
            java.lang.String r3 = "FoldingFeature class is not valid"
            boolean r0 = defpackage.xk2.L(r3, r0)
            if (r0 == 0) goto L82
            int r0 = defpackage.s82.a()
            if (r0 >= r2) goto L42
            goto L82
        L42:
            if (r0 != r2) goto L49
            boolean r1 = r4.b()
            goto L82
        L49:
            r3 = 5
            if (r0 >= r3) goto L51
            boolean r1 = r4.c()
            goto L82
        L51:
            boolean r0 = r4.c()
            if (r0 == 0) goto L82
            w36 r0 = new w36
            r3 = 3
            r0.<init>(r4, r3)
            java.lang.String r3 = "DisplayFoldFeature is not valid"
            boolean r0 = defpackage.xk2.L(r3, r0)
            if (r0 == 0) goto L82
            w36 r0 = new w36
            r3 = 2
            r0.<init>(r4, r3)
            java.lang.String r3 = "SupportedWindowFeatures is not valid"
            boolean r0 = defpackage.xk2.L(r3, r0)
            if (r0 == 0) goto L82
            w36 r0 = new w36
            r3 = 4
            r0.<init>(r4, r3)
            java.lang.String r4 = "WindowLayoutComponent#getSupportedWindowFeatures is not valid"
            boolean r4 = defpackage.xk2.L(r4, r0)
            if (r4 == 0) goto L82
            r1 = r2
        L82:
            r4 = 0
            if (r1 == 0) goto L8d
            androidx.window.extensions.WindowExtensions r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch: java.lang.UnsupportedOperationException -> L8d
            androidx.window.extensions.layout.WindowLayoutComponent r4 = r0.getWindowLayoutComponent()     // Catch: java.lang.UnsupportedOperationException -> L8d
        L8d:
            return r4
    }

    public final boolean b() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            r0.<init>(r1)
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ", java.util.function.Consumer) is not valid"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            w36 r1 = new w36
            r2 = 5
            r1.<init>(r3, r2)
            boolean r3 = defpackage.xk2.L(r0, r1)
            return r3
    }

    public final boolean c() {
            r3 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            r0.<init>(r1)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            w36 r1 = new w36
            r2 = 6
            r1.<init>(r3, r2)
            boolean r3 = defpackage.xk2.L(r0, r1)
            if (r3 == 0) goto L2d
            r3 = 1
            return r3
        L2d:
            r3 = 0
            return r3
    }
}
