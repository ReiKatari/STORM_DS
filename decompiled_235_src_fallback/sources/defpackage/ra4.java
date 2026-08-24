package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra4  reason: default package */
/* loaded from: classes.dex */
public final class ra4 {
    public int a;
    public boolean b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public void a(java.util.concurrent.Executor r5, defpackage.bi4 r6) {
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.lang.Object r1 = r4.e     // Catch: java.lang.Throwable -> L38
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L38
            gq6 r1 = (defpackage.gq6) r1     // Catch: java.lang.Throwable -> L38
            r2 = 0
            if (r1 == 0) goto L1c
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.L     // Catch: java.lang.Throwable -> L38
            r3.set(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r4.f     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CopyOnWriteArraySet r3 = (java.util.concurrent.CopyOnWriteArraySet) r3     // Catch: java.lang.Throwable -> L38
            r3.remove(r1)     // Catch: java.lang.Throwable -> L38
        L1c:
            gq6 r1 = new gq6     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r4.d     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Throwable -> L38
            r1.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r4.e     // Catch: java.lang.Throwable -> L38
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L38
            r5.put(r6, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.f     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4     // Catch: java.lang.Throwable -> L38
            r4.add(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r1.a(r2)
            return
        L38:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    public boolean b(int r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.d
            ua4 r0 = (defpackage.ua4) r0
            int r1 = r2.a
            int r3 = r3 + r1
            java.lang.Object[] r0 = r0.A
            r3 = r0[r3]
            y64 r3 = (defpackage.y64) r3
            java.lang.Object r2 = r2.e
            ua4 r2 = (defpackage.ua4) r2
            int r1 = r1 + r4
            java.lang.Object[] r2 = r2.A
            r2 = r2[r1]
            y64 r2 = (defpackage.y64) r2
            boolean r4 = defpackage.nb3.k(r3, r2)
            if (r4 == 0) goto L1f
            goto L29
        L1f:
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r2 = r2.getClass()
            if (r3 != r2) goto L2b
        L29:
            r2 = 1
            return r2
        L2b:
            r2 = 0
            return r2
    }

    public void c() {
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            boolean r1 = r4.b     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            r4.b = r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L17
            ap6 r1 = (defpackage.ap6) r1     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 == 0) goto L19
            r1.h(r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r4 = move-exception
            goto L2c
        L19:
            r4.f = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            java.lang.Object r0 = r4.d
            w61 r0 = (defpackage.w61) r0
            y3 r1 = new y3
            r3 = 19
            r1.<init>(r4, r2, r3)
            r4 = 3
            defpackage.hv.L(r0, r2, r2, r1, r4)
            return
        L2c:
            monitor-exit(r0)
            throw r4
    }
}
