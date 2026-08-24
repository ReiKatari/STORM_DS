package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr3  reason: default package */
/* loaded from: classes.dex */
public final class tr3 implements defpackage.o55 {
    public volatile java.util.Set a;
    public volatile java.util.Set b;

    @Override // defpackage.o55
    public final java.lang.Object get() {
            r3 = this;
            java.util.Set r0 = r3.b
            if (r0 != 0) goto L40
            monitor-enter(r3)
            java.util.Set r0 = r3.b     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3c
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Throwable -> L3a
            r3.b = r0     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3a
            java.util.Set r0 = r3.a     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31
            o55 r1 = (defpackage.o55) r1     // Catch: java.lang.Throwable -> L31
            java.util.Set r2 = r3.b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L31
            r2.add(r1)     // Catch: java.lang.Throwable -> L31
            goto L1b
        L31:
            r0 = move-exception
            goto L38
        L33:
            r0 = 0
            r3.a = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            goto L40
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r0
        L40:
            java.util.Set r3 = r3.b
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            return r3
    }
}
