package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dy3  reason: default package */
/* loaded from: classes.dex */
public abstract class dy3 {
    public static final defpackage.l55 a = null;

    static {
            r0 = 0
            java.lang.Class<g56> r1 = defpackage.g56.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2c
            r2.getClass()     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L1f:
            if (r4 >= r3) goto L2e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5 instanceof defpackage.di1     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L29
        L27:
            r1 = r0
            goto L3f
        L29:
            int r4 = r4 + 1
            goto L1f
        L2c:
            r1 = move-exception
            goto L39
        L2e:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r1 instanceof defpackage.l55     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            l55 r1 = (defpackage.l55) r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L39:
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L3f:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 == 0) goto L45
            goto L46
        L45:
            r0 = r1
        L46:
            l55 r0 = (defpackage.l55) r0
            if (r0 != 0) goto L57
            pi3 r0 = new pi3
            r1 = 11
            r0.<init>(r1)
            nq6 r1 = new nq6
            r1.<init>(r0)
            r0 = r1
        L57:
            defpackage.dy3.a = r0
            return
    }
}
