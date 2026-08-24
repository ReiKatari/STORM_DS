package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: go7  reason: default package */
/* loaded from: classes.dex */
public abstract class go7 {
    public static final java.lang.reflect.Method a = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L19
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L12
            defpackage.go7.a = r0     // Catch: java.lang.Exception -> L12
            return
        L12:
            java.lang.String r0 = "ViewConfigCompat"
            java.lang.String r1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r0, r1)
        L19:
            return
    }

    public static float a(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L1e
            java.lang.reflect.Method r0 = defpackage.go7.a
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L17
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L17
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L17
            float r3 = (float) r3
            return r3
        L17:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L1e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L3e
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L3e:
            r3 = 0
            return r3
    }
}
