package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to7  reason: default package */
/* loaded from: classes.dex */
public abstract class to7 {
    public static final defpackage.x31 a = null;

    static {
            x31 r0 = new x31
            r1 = 26
            r0.<init>(r1)
            defpackage.to7.a = r0
            return
    }

    public static final defpackage.as0 a(defpackage.qo7 r4) {
            r4.getClass()
            x31 r0 = defpackage.to7.a
            monitor-enter(r0)
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            java.lang.AutoCloseable r1 = r4.c(r1)     // Catch: java.lang.Throwable -> L2c
            as0 r1 = (defpackage.as0) r1     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L2e
            vt1 r1 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L2c
            xe1 r2 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L2c
            jv2 r2 = defpackage.e04.a     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L2c
            jv2 r1 = r2.Y     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L2c
        L18:
            as0 r2 = new as0     // Catch: java.lang.Throwable -> L2c
            gu6 r3 = defpackage.oi2.c()     // Catch: java.lang.Throwable -> L2c
            l61 r1 = r1.N(r3)     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            r4.a(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r1 = r2
            goto L2e
        L2c:
            r4 = move-exception
            goto L30
        L2e:
            monitor-exit(r0)
            return r1
        L30:
            monitor-exit(r0)
            throw r4
    }
}
