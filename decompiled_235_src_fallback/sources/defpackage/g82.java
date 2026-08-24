package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g82  reason: default package */
/* loaded from: classes.dex */
public final class g82 {
    public static volatile defpackage.g82 a;
    public static final defpackage.g82 b = null;

    static {
            g82 r0 = new g82
            r0.<init>()
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            defpackage.g82.b = r0
            return
    }

    public static defpackage.g82 a() {
            g82 r0 = defpackage.g82.a
            if (r0 != 0) goto L2d
            java.lang.Class<g82> r1 = defpackage.g82.class
            monitor-enter(r1)
            g82 r0 = defpackage.g82.a     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            java.lang.String r0 = "getEmptyRegistry"
            java.lang.Class r2 = defpackage.f82.a     // Catch: java.lang.Throwable -> L27
            r3 = 0
            if (r2 != 0) goto L13
            goto L1e
        L13:
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r3)     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L27
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L27
            g82 r0 = (defpackage.g82) r0     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L27
            r3 = r0
        L1e:
            if (r3 == 0) goto L22
            r0 = r3
            goto L24
        L22:
            g82 r0 = defpackage.g82.b     // Catch: java.lang.Throwable -> L27
        L24:
            defpackage.g82.a = r0     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return r0
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2d:
            return r0
    }
}
