package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo7  reason: default package */
/* loaded from: classes.dex */
public abstract class qo7 {
    public final defpackage.ro7 a;

    public qo7() {
            r1 = this;
            r1.<init>()
            ro7 r0 = new ro7
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a(java.lang.String r2, java.lang.AutoCloseable r3) {
            r1 = this;
            ro7 r1 = r1.a
            if (r1 == 0) goto L1f
            boolean r0 = r1.d
            if (r0 == 0) goto Lc
            defpackage.ro7.a(r3)
            return
        Lc:
            x31 r0 = r1.a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            defpackage.ro7.a(r1)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L1f:
            return
    }

    public final void b() {
            r4 = this;
            ro7 r0 = r4.a
            if (r0 == 0) goto L4a
            boolean r1 = r0.d
            if (r1 == 0) goto L9
            goto L4a
        L9:
            r1 = 1
            r0.d = r1
            x31 r1 = r0.a
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r0.b     // Catch: java.lang.Throwable -> L29
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L19:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3     // Catch: java.lang.Throwable -> L29
            defpackage.ro7.a(r3)     // Catch: java.lang.Throwable -> L29
            goto L19
        L29:
            r4 = move-exception
            goto L48
        L2b:
            java.util.LinkedHashSet r2 = r0.c     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L31:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3     // Catch: java.lang.Throwable -> L29
            defpackage.ro7.a(r3)     // Catch: java.lang.Throwable -> L29
            goto L31
        L41:
            java.util.LinkedHashSet r0 = r0.c     // Catch: java.lang.Throwable -> L29
            r0.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            goto L4a
        L48:
            monitor-exit(r1)
            throw r4
        L4a:
            r4.d()
            return
    }

    public final java.lang.AutoCloseable c(java.lang.String r2) {
            r1 = this;
            ro7 r1 = r1.a
            if (r1 == 0) goto L14
            x31 r0 = r1.a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L14:
            r1 = 0
            return r1
    }

    public void d() {
            r0 = this;
            return
    }
}
