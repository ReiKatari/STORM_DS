package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx3  reason: default package */
/* loaded from: classes.dex */
public abstract class zx3 {
    public static final defpackage.l55 a = null;

    static {
            r0 = 0
            java.lang.Class<hu3> r1 = defpackage.hu3.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            boolean r5 = r5 instanceof defpackage.di1     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L3c
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            r1 = move-exception
            goto L36
        L2b:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof defpackage.l55     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            l55 r1 = (defpackage.l55) r1     // Catch: java.lang.Throwable -> L29
            goto L3c
        L36:
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L3c:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            l55 r0 = (defpackage.l55) r0
            if (r0 != 0) goto L53
            pi3 r0 = new pi3
            r1 = 7
            r0.<init>(r1)
            nq6 r1 = new nq6
            r1.<init>(r0)
            r0 = r1
        L53:
            defpackage.zx3.a = r0
            return
    }
}
