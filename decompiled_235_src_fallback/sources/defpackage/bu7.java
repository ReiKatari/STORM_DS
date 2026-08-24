package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu7  reason: default package */
/* loaded from: classes.dex */
public final class bu7 extends defpackage.iu7 {
    public static java.lang.reflect.Field g = null;
    public static boolean h = false;
    public static java.lang.reflect.Constructor i = null;
    public static boolean j = false;
    public android.view.WindowInsets e;
    public defpackage.e83 f;

    public bu7() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets r0 = j()
            r1.e = r0
            return
    }

    public bu7(defpackage.vu7 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.f()
            r0.e = r1
            return
    }

    private static android.view.WindowInsets j() {
            boolean r0 = defpackage.bu7.h
            r1 = 1
            java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
            java.lang.String r3 = "WindowInsetsCompat"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "CONSUMED"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L12
            defpackage.bu7.g = r0     // Catch: java.lang.ReflectiveOperationException -> L12
            goto L18
        L12:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve WindowInsets.CONSUMED field"
            android.util.Log.i(r3, r4, r0)
        L18:
            defpackage.bu7.h = r1
        L1a:
            java.lang.reflect.Field r0 = defpackage.bu7.g
            r4 = 0
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.ReflectiveOperationException -> L2d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
            if (r0 == 0) goto L33
            android.view.WindowInsets r5 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
            r5.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
            return r5
        L2d:
            r0 = move-exception
            java.lang.String r5 = "Could not get value from WindowInsets.CONSUMED field"
            android.util.Log.i(r3, r5, r0)
        L33:
            boolean r0 = defpackage.bu7.j
            if (r0 != 0) goto L4c
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            defpackage.bu7.i = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            goto L4a
        L44:
            r0 = move-exception
            java.lang.String r2 = "Could not retrieve WindowInsets(Rect) constructor"
            android.util.Log.i(r3, r2, r0)
        L4a:
            defpackage.bu7.j = r1
        L4c:
            java.lang.reflect.Constructor r0 = defpackage.bu7.i
            if (r0 == 0) goto L66
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L60
            r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L60
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L60
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L60
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L60
            return r0
        L60:
            r0 = move-exception
            java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
            android.util.Log.i(r3, r1, r0)
        L66:
            return r4
    }

    @Override // defpackage.iu7
    public defpackage.vu7 b() {
            r4 = this;
            r4.a()
            android.view.WindowInsets r0 = r4.e
            r1 = 0
            vu7 r0 = defpackage.vu7.g(r1, r0)
            e83[] r2 = r4.b
            ru7 r3 = r0.a
            r3.v(r2)
            e83 r2 = r4.f
            r3.x(r2)
            r3.u(r1)
            android.graphics.Rect[][] r1 = r4.c
            r3.z(r1)
            android.graphics.Rect[][] r4 = r4.d
            r3.A(r4)
            return r0
    }

    @Override // defpackage.iu7
    public void f(defpackage.e83 r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // defpackage.iu7
    public void h(defpackage.e83 r5) {
            r4 = this;
            android.view.WindowInsets r0 = r4.e
            if (r0 == 0) goto L12
            int r1 = r5.a
            int r2 = r5.b
            int r3 = r5.c
            int r5 = r5.d
            android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
            r4.e = r5
        L12:
            return
    }
}
