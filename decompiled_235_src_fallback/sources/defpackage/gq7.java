package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq7  reason: default package */
/* loaded from: classes.dex */
public class gq7 extends defpackage.mp2 {
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;

    public void b0(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r0 = defpackage.gq7.h
            if (r0 == 0) goto Lb
            defpackage.r74.z(r1, r2, r3, r4, r5)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            defpackage.gq7.h = r0
        Lb:
            return
    }

    public void c0(android.view.View r3, int r4) {
            r2 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 != r0) goto L33
            boolean r2 = defpackage.mp2.e
            if (r2 != 0) goto L22
            r2 = 1
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "mViewFlags"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L19
            defpackage.mp2.d = r0     // Catch: java.lang.NoSuchFieldException -> L19
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L19
            goto L20
        L19:
            java.lang.String r0 = "ViewUtilsApi19"
            java.lang.String r1 = "fetchViewFlagsField: "
            android.util.Log.i(r0, r1)
        L20:
            defpackage.mp2.e = r2
        L22:
            java.lang.reflect.Field r2 = defpackage.mp2.d
            if (r2 == 0) goto L3e
            int r2 = r2.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L3e
            java.lang.reflect.Field r0 = defpackage.mp2.d     // Catch: java.lang.IllegalAccessException -> L3e
            r2 = r2 & (-13)
            r2 = r2 | r4
            r0.setInt(r3, r2)     // Catch: java.lang.IllegalAccessException -> L3e
            goto L3e
        L33:
            boolean r2 = defpackage.gq7.i
            if (r2 == 0) goto L3e
            defpackage.fq7.g(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L3b
            return
        L3b:
            r2 = 0
            defpackage.gq7.i = r2
        L3e:
            return
    }

    public void d0(android.view.View r1, android.graphics.Matrix r2) {
            r0 = this;
            boolean r0 = defpackage.gq7.f
            if (r0 == 0) goto Lb
            defpackage.r74.A(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            defpackage.gq7.f = r0
        Lb:
            return
    }

    public void e0(android.view.ViewGroup r1, android.graphics.Matrix r2) {
            r0 = this;
            boolean r0 = defpackage.gq7.g
            if (r0 == 0) goto Lb
            defpackage.r74.D(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            defpackage.gq7.g = r0
        Lb:
            return
    }
}
