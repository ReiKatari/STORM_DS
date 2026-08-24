package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a72  reason: default package */
/* loaded from: classes.dex */
public final class a72 {
    public static final defpackage.q61 c = null;
    public static final java.util.LinkedHashMap d = null;
    public final java.util.concurrent.locks.ReentrantLock a;
    public final defpackage.yc1 b;

    static {
            q61 r0 = new q61
            r0.<init>()
            defpackage.a72.c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.a72.d = r0
            return
    }

    public a72(java.lang.String r4, boolean r5) {
            r3 = this;
            r3.<init>()
            q61 r0 = defpackage.a72.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = defpackage.a72.d     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L32
        L19:
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r3.a = r2
            if (r5 == 0) goto L2e
            yc1 r5 = new yc1
            r5.<init>()
            java.lang.String r0 = ".lck"
            java.lang.String r4 = r4.concat(r0)
            r5.A = r4
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r3.b = r5
            return
        L32:
            monitor-exit(r0)
            throw r3
    }
}
