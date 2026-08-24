package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx7  reason: default package */
/* loaded from: classes.dex */
public abstract class sx7 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "WorkerWrapper"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.sx7.a = r0
            return
    }

    public static final java.lang.Object a(defpackage.gx3 r3, defpackage.nx3 r4, defpackage.hw6 r5) {
            boolean r0 = r3.isDone()     // Catch: java.util.concurrent.ExecutionException -> L4a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L23
        L8:
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L16 java.lang.InterruptedException -> L21
            if (r1 == 0) goto L15
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.util.concurrent.ExecutionException -> L4a
            r4.interrupt()     // Catch: java.util.concurrent.ExecutionException -> L4a
        L15:
            return r3
        L16:
            r3 = move-exception
            if (r1 == 0) goto L20
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.util.concurrent.ExecutionException -> L4a
            r4.interrupt()     // Catch: java.util.concurrent.ExecutionException -> L4a
        L20:
            throw r3     // Catch: java.util.concurrent.ExecutionException -> L4a
        L21:
            r1 = r2
            goto L8
        L23:
            rj0 r0 = new rj0
            r41 r5 = defpackage.np2.V(r5)
            r0.<init>(r2, r5)
            r0.v()
            m67 r5 = new m67
            r5.<init>(r3, r0, r1)
            tj1 r1 = defpackage.tj1.INSTANCE
            r3.a(r1, r5)
            r5 r5 = new r5
            r1 = 29
            r5.<init>(r1, r4, r3)
            r0.z(r5)
            java.lang.Object r3 = r0.s()
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            return r3
        L4a:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            r3.getClass()
            throw r3
    }
}
