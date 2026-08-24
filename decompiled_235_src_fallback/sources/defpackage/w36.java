package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w36 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.x36 B;

    public /* synthetic */ w36(defpackage.x36 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r9 = this;
            int r0 = r9.A
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.String r2 = "getType"
            java.lang.String r3 = "androidx.window.extensions.layout.DisplayFoldFeature"
            java.lang.String r4 = "androidx.window.extensions.layout.SupportedWindowFeatures"
            java.lang.String r5 = "androidx.window.extensions.layout.WindowLayoutComponent"
            r6 = 1
            r7 = 0
            r8 = 0
            x36 r9 = r9.B
            switch(r0) {
                case 0: goto L1eb;
                case 1: goto L167;
                case 2: goto L11a;
                case 3: goto La3;
                case 4: goto L6f;
                case 5: goto L1d;
                default: goto L14;
            }
        L14:
            boolean r9 = defpackage.x36.d(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L1d:
            e31 r0 = r9.b
            java.lang.ClassLoader r0 = r0.a     // Catch: java.lang.ClassNotFoundException -> L2b
            java.lang.String r1 = "java.util.function.Consumer"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L2b
            r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L2b
            r7 = r0
        L2b:
            if (r7 != 0) goto L2e
            goto L6a
        L2e:
            java.lang.ClassLoader r9 = r9.a
            java.lang.Class r9 = r9.loadClass(r5)
            r9.getClass()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r7}
            java.lang.String r1 = "addWindowLayoutInfoListener"
            java.lang.reflect.Method r0 = r9.getMethod(r1, r0)
            java.lang.String r1 = "removeWindowLayoutInfoListener"
            java.lang.Class[] r2 = new java.lang.Class[]{r7}
            java.lang.reflect.Method r9 = r9.getMethod(r1, r2)
            r0.getClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L68
            r9.getClass()
            int r9 = r9.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isPublic(r9)
            if (r9 == 0) goto L68
            goto L69
        L68:
            r6 = r8
        L69:
            r8 = r6
        L6a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            return r9
        L6f:
            java.lang.ClassLoader r9 = r9.a
            java.lang.Class r0 = r9.loadClass(r5)
            r0.getClass()
            java.lang.String r1 = "getSupportedWindowFeatures"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r7)
            r0.getClass()
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L9d
            java.lang.Class r9 = r9.loadClass(r4)
            r9.getClass()
            java.lang.Class r0 = r0.getReturnType()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9d
            goto L9e
        L9d:
            r6 = r8
        L9e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        La3:
            java.lang.ClassLoader r9 = r9.a
            java.lang.Class r9 = r9.loadClass(r3)
            r9.getClass()
            java.lang.reflect.Method r0 = r9.getMethod(r2, r7)
            java.lang.String r2 = "hasProperty"
            java.lang.Class[] r3 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r2 = r9.getMethod(r2, r3)
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.String r4 = "hasProperties"
            java.lang.reflect.Method r9 = r9.getMethod(r4, r3)
            r0.getClass()
            int r3 = r0.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 == 0) goto L114
            r1.getClass()
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L114
            r2.getClass()
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L114
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r0.getClass()
            java.lang.Class r1 = r2.getReturnType()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L114
            r9.getClass()
            int r1 = r9.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L114
            java.lang.Class r9 = r9.getReturnType()
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L114
            goto L115
        L114:
            r6 = r8
        L115:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L11a:
            java.lang.ClassLoader r9 = r9.a
            java.lang.Class r0 = r9.loadClass(r4)
            r0.getClass()
            java.lang.String r1 = "getDisplayFoldFeatures"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r7)
            java.lang.reflect.Type r1 = r0.getGenericReturnType()
            r1.getClass()
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r8]
            r1.getClass()
            java.lang.Class r1 = (java.lang.Class) r1
            int r2 = r0.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 == 0) goto L161
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L161
            java.lang.Class r9 = r9.loadClass(r3)
            r9.getClass()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L161
            goto L162
        L161:
            r6 = r8
        L162:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L167:
            java.lang.ClassLoader r9 = r9.a
            java.lang.String r0 = "androidx.window.extensions.layout.FoldingFeature"
            java.lang.Class r9 = r9.loadClass(r0)
            r9.getClass()
            java.lang.String r0 = "getBounds"
            java.lang.reflect.Method r0 = r9.getMethod(r0, r7)
            java.lang.reflect.Method r2 = r9.getMethod(r2, r7)
            java.lang.String r3 = "getState"
            java.lang.reflect.Method r9 = r9.getMethod(r3, r7)
            r0.getClass()
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Class r3 = r3.a
            r3.getClass()
            java.lang.Class r4 = r0.getReturnType()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1e5
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L1e5
            r2.getClass()
            ar0 r0 = defpackage.gh5.a(r1)
            java.lang.Class r0 = r0.a
            r0.getClass()
            java.lang.Class r3 = r2.getReturnType()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e5
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L1e5
            r9.getClass()
            ar0 r0 = defpackage.gh5.a(r1)
            java.lang.Class r0 = r0.a
            r0.getClass()
            java.lang.Class r1 = r9.getReturnType()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e5
            int r9 = r9.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isPublic(r9)
            if (r9 == 0) goto L1e5
            goto L1e6
        L1e5:
            r6 = r8
        L1e6:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L1eb:
            e31 r0 = r9.c
            java.lang.ClassLoader r0 = r0.a
            java.lang.String r1 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r0 = r0.loadClass(r1)
            r0.getClass()
            java.lang.String r1 = "getWindowLayoutComponent"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r7)
            java.lang.ClassLoader r9 = r9.a
            java.lang.Class r9 = r9.loadClass(r5)
            r9.getClass()
            r0.getClass()
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L21f
            java.lang.Class r0 = r0.getReturnType()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L21f
            goto L220
        L21f:
            r6 = r8
        L220:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
    }
}
